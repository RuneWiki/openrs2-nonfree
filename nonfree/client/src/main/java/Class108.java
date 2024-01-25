import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class108 implements Interface12 {

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "Lclient!mn;")
	private Class163 aClass163_17 = new Class163(128);

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "[I")
	public final int[] anIntArray273 = new int[Static191.aClass151_1.anInt4189];

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "[I")
	private final int[] anIntArray272 = new int[Static191.aClass151_1.anInt4189];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)I")
	@Override
	public int method2422(@OriginalArg(0) int arg0) {
		return this.anIntArray273[arg0];
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)V")
	public void method2426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class126 local15 = Static166.aClass6_1.method198(arg1);
		@Pc(18) int local18 = local15.anInt3464;
		@Pc(21) int local21 = local15.anInt3470;
		@Pc(24) int local24 = local15.anInt3469;
		@Pc(30) int local30 = Class3_Sub2_Sub1_Sub1.anIntArray146[local24 - local21];
		if (arg0 < 0 || local30 < arg0) {
			arg0 = 0;
		}
		local30 <<= local21;
		this.method2430(local18, local30 & arg0 << local21 | this.anIntArray272[local18] & ~local30);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZI)I")
	public int method2427(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static21.method458();
		for (@Pc(22) Class2_Sub43 local22 = arg0 ? (Class2_Sub43) this.aClass163_17.method3771() : (Class2_Sub43) this.aClass163_17.method3770(); local22 != null; local22 = (Class2_Sub43) this.aClass163_17.method3770()) {
			if (local8 > (local22.aLong209 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local22.aLong209 & 0x4000000000000000L) != 0L) {
					@Pc(47) int local47 = (int) local22.aLong227;
					this.anIntArray273[local47] = this.anIntArray272[local47];
					local22.method5866();
					return local47;
				}
				local22.method5866();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
	public void method2428() {
		for (@Pc(3) int local3 = 0; local3 < Static191.aClass151_1.anInt4189; local3++) {
			@Pc(14) Class254 local14 = Static191.aClass151_1.method3406(local3);
			if (local14 != null && local14.anInt7124 == 0) {
				this.anIntArray272[local3] = 0;
				this.anIntArray273[local3] = 0;
			}
		}
		this.aClass163_17 = new Class163(128);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZII)V")
	public void method2429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray273[arg1] = arg0;
		@Pc(20) Class2_Sub43 local20 = (Class2_Sub43) this.aClass163_17.method3769((long) arg1);
		if (local20 == null) {
			local20 = new Class2_Sub43(Static21.method458() + 500L);
			this.aClass163_17.method3764((long) arg1, local20);
		} else {
			local20.aLong209 = Static21.method458() + 500L;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
	public void method2430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray272[arg0] = arg1;
		@Pc(20) Class2_Sub43 local20 = (Class2_Sub43) this.aClass163_17.method3769((long) arg0);
		if (local20 == null) {
			local20 = new Class2_Sub43(4611686018427387905L);
			this.aClass163_17.method3764((long) arg0, local20);
		} else if (local20.aLong209 != 4611686018427387905L) {
			local20.aLong209 = Static21.method458() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)I")
	@Override
	public int method2423(@OriginalArg(0) int arg0) {
		@Pc(8) Class126 local8 = Static166.aClass6_1.method198(arg0);
		@Pc(11) int local11 = local8.anInt3464;
		@Pc(22) int local22 = local8.anInt3470;
		@Pc(25) int local25 = local8.anInt3469;
		@Pc(31) int local31 = Class3_Sub2_Sub1_Sub1.anIntArray146[local25 - local22];
		return local31 & this.anIntArray273[local11] >> local22;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(III)V")
	public void method2433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class126 local8 = Static166.aClass6_1.method198(arg0);
		@Pc(11) int local11 = local8.anInt3464;
		@Pc(14) int local14 = local8.anInt3470;
		@Pc(17) int local17 = local8.anInt3469;
		@Pc(24) int local24 = Class3_Sub2_Sub1_Sub1.anIntArray146[local17 - local14];
		if (arg1 < 0 || local24 < arg1) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method2429(local24 & arg1 << local14 | ~local24 & this.anIntArray273[local11], local11);
	}
}
