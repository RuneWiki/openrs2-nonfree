import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class294 implements Interface25 {

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "Lclient!he;")
	private Class128 aClass128_40 = new Class128(128);

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "[I")
	private final int[] anIntArray530 = new int[Static40.aClass245_1.anInt7548];

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "[I")
	public final int[] anIntArray529 = new int[Static40.aClass245_1.anInt7548];

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)I")
	@Override
	public int method7412(@OriginalArg(1) int arg0) {
		@Pc(8) Class215 local8 = Static230.aClass233_3.method6390(arg0);
		@Pc(11) int local11 = local8.anInt6701;
		@Pc(14) int local14 = local8.anInt6704;
		@Pc(22) int local22 = local8.anInt6707;
		@Pc(29) int local29 = Class36.anIntArray57[local22 - local14];
		return this.anIntArray529[local11] >> local14 & local29;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
	public void method7414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class215 local8 = Static230.aClass233_3.method6390(arg0);
		@Pc(11) int local11 = local8.anInt6701;
		@Pc(14) int local14 = local8.anInt6704;
		@Pc(17) int local17 = local8.anInt6707;
		@Pc(28) int local28 = Class36.anIntArray57[local17 - local14];
		if (arg1 < 0 || local28 < arg1) {
			arg1 = 0;
		}
		local28 <<= local14;
		this.method7420(this.anIntArray529[local11] & ~local28 | arg1 << local14 & local28, local11);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)I")
	public int method7415(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static32.method595();
		for (@Pc(27) Class6_Sub38 local27 = arg0 ? (Class6_Sub38) this.aClass128_40.method3556() : (Class6_Sub38) this.aClass128_40.method3555(); local27 != null; local27 = (Class6_Sub38) this.aClass128_40.method3555()) {
			if ((local27.aLong214 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local27.aLong214 & 0x4000000000000000L) != 0L) {
					@Pc(56) int local56 = (int) local27.aLong278;
					this.anIntArray529[local56] = this.anIntArray530[local56];
					local27.method9043();
					return local56;
				}
				local27.method9043();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)V")
	public void method7417(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class215 local8 = Static230.aClass233_3.method6390(arg0);
		@Pc(11) int local11 = local8.anInt6701;
		@Pc(14) int local14 = local8.anInt6704;
		@Pc(17) int local17 = local8.anInt6707;
		@Pc(24) int local24 = Class36.anIntArray57[local17 - local14];
		if (arg1 < 0 || arg1 > local24) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method7419(arg1 << local14 & local24 | this.anIntArray530[local11] & ~local24, local11);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)I")
	@Override
	public int method7411(@OriginalArg(1) int arg0) {
		return this.anIntArray529[arg0];
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public void method7418() {
		for (@Pc(12) int local12 = 0; local12 < Static40.aClass245_1.anInt7548; local12++) {
			@Pc(19) Class310 local19 = Static40.aClass245_1.method6511(local12);
			if (local19 != null && local19.anInt9155 == 0) {
				this.anIntArray530[local12] = 0;
				this.anIntArray529[local12] = 0;
			}
		}
		this.aClass128_40 = new Class128(128);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIB)V")
	public void method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray530[arg1] = arg0;
		@Pc(24) Class6_Sub38 local24 = (Class6_Sub38) this.aClass128_40.method3560((long) arg1);
		if (local24 == null) {
			local24 = new Class6_Sub38(4611686018427387905L);
			this.aClass128_40.method3551((long) arg1, local24);
		} else if (local24.aLong214 != 4611686018427387905L) {
			local24.aLong214 = Static32.method595() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(III)V")
	public void method7420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray529[arg1] = arg0;
		@Pc(16) Class6_Sub38 local16 = (Class6_Sub38) this.aClass128_40.method3560((long) arg1);
		if (local16 == null) {
			local16 = new Class6_Sub38(Static32.method595() + 500L);
			this.aClass128_40.method3551((long) arg1, local16);
		} else {
			local16.aLong214 = Static32.method595() + 500L;
		}
	}
}
