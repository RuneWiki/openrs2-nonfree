import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class285 implements Interface16 {

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "Lclient!baa;")
	private Class25 aClass25_34 = new Class25(128);

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "[I")
	public final int[] anIntArray490 = new int[Static580.aClass186_1.anInt5551];

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "[I")
	private final int[] anIntArray491 = new int[Static580.aClass186_1.anInt5551];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIB)V")
	public void method6940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class256 local13 = Static133.aClass222_30.method5711(arg1);
		@Pc(16) int local16 = local13.anInt7324;
		@Pc(19) int local19 = local13.anInt7325;
		@Pc(22) int local22 = local13.anInt7318;
		@Pc(29) int local29 = Class310.anIntArray556[local22 - local19];
		if (arg0 < 0 || arg0 > local29) {
			arg0 = 0;
		}
		local29 <<= local19;
		this.method6943(local16, arg0 << local19 & local29 | this.anIntArray490[local16] & ~local29);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)I")
	@Override
	public int method6938(@OriginalArg(0) int arg0) {
		@Pc(8) Class256 local8 = Static133.aClass222_30.method5711(arg0);
		@Pc(11) int local11 = local8.anInt7324;
		@Pc(14) int local14 = local8.anInt7325;
		@Pc(17) int local17 = local8.anInt7318;
		@Pc(30) int local30 = Class310.anIntArray556[local17 - local14];
		return local30 & this.anIntArray490[local11] >> local14;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)I")
	@Override
	public int method6939(@OriginalArg(1) int arg0) {
		return this.anIntArray490[arg0];
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZ)V")
	public void method6943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray490[arg0] = arg1;
		@Pc(23) Class3_Sub30 local23 = (Class3_Sub30) this.aClass25_34.method426((long) arg0);
		if (local23 == null) {
			local23 = new Class3_Sub30(Static191.method3071() + 500L);
			this.aClass25_34.method434((long) arg0, local23);
		} else {
			local23.aLong158 = Static191.method3071() + 500L;
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIZ)V")
	public void method6944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray491[arg0] = arg1;
		@Pc(23) Class3_Sub30 local23 = (Class3_Sub30) this.aClass25_34.method426((long) arg0);
		if (local23 == null) {
			local23 = new Class3_Sub30(4611686018427387905L);
			this.aClass25_34.method434((long) arg0, local23);
		} else if (local23.aLong158 != 4611686018427387905L) {
			local23.aLong158 = Static191.method3071() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
	public void method6945() {
		for (@Pc(7) int local7 = 0; local7 < Static580.aClass186_1.anInt5551; local7++) {
			@Pc(22) Class13 local22 = Static580.aClass186_1.method4744(local7);
			if (local22 != null && local22.anInt242 == 0) {
				this.anIntArray491[local7] = 0;
				this.anIntArray490[local7] = 0;
			}
		}
		this.aClass25_34 = new Class25(128);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BII)V")
	public void method6947(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class256 local8 = Static133.aClass222_30.method5711(arg0);
		@Pc(11) int local11 = local8.anInt7324;
		@Pc(19) int local19 = local8.anInt7325;
		@Pc(22) int local22 = local8.anInt7318;
		@Pc(29) int local29 = Class310.anIntArray556[local22 - local19];
		if (arg1 < 0 || local29 < arg1) {
			arg1 = 0;
		}
		local29 <<= local19;
		this.method6944(local11, local29 & arg1 << local19 | ~local29 & this.anIntArray491[local11]);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)I")
	public int method6948(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static191.method3071();
		for (@Pc(30) Class3_Sub30 local30 = arg0 ? (Class3_Sub30) this.aClass25_34.method435() : (Class3_Sub30) this.aClass25_34.method432(); local30 != null; local30 = (Class3_Sub30) this.aClass25_34.method432()) {
			if (local8 > (local30.aLong158 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local30.aLong158 & 0x4000000000000000L) != 0L) {
					@Pc(56) int local56 = (int) local30.aLong277;
					this.anIntArray490[local56] = this.anIntArray491[local56];
					local30.method8682();
					return local56;
				}
				local30.method8682();
			}
		}
		return -1;
	}
}
