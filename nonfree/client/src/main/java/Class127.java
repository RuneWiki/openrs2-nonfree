import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class127 implements Interface12 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "Lclient!qn;")
	private Class313 aClass313_16 = new Class313(128);

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "[I")
	public final int[] anIntArray219 = new int[Static266.aClass161_1.anInt3879];

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "[I")
	private final int[] anIntArray220 = new int[Static266.aClass161_1.anInt3879];

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)V")
	public void method2983() {
		for (@Pc(15) int local15 = 0; local15 < Static266.aClass161_1.anInt3879; local15++) {
			@Pc(22) Class231 local22 = Static266.aClass161_1.method3497(local15);
			if (local22 != null && local22.anInt5850 == 0) {
				this.anIntArray220[local15] = 0;
				this.anIntArray219[local15] = 0;
			}
		}
		this.aClass313_16 = new Class313(128);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V")
	public void method2984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray220[arg1] = arg0;
		@Pc(26) Class3_Sub19 local26 = (Class3_Sub19) this.aClass313_16.method7104((long) arg1);
		if (local26 == null) {
			local26 = new Class3_Sub19(4611686018427387905L);
			this.aClass313_16.method7107((long) arg1, local26);
		} else if (local26.aLong84 != 4611686018427387905L) {
			local26.aLong84 = Static517.method6965() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZI)I")
	public int method2985(@OriginalArg(0) boolean arg0) {
		@Pc(18) long local18 = Static517.method6965();
		for (@Pc(33) Class3_Sub19 local33 = arg0 ? (Class3_Sub19) this.aClass313_16.method7103() : (Class3_Sub19) this.aClass313_16.method7110(); local33 != null; local33 = (Class3_Sub19) this.aClass313_16.method7110()) {
			if ((local33.aLong84 & 0x3FFFFFFFFFFFFFFFL) < local18) {
				if ((local33.aLong84 & 0x4000000000000000L) != 0L) {
					@Pc(59) int local59 = (int) local33.aLong345;
					this.anIntArray219[local59] = this.anIntArray220[local59];
					local33.method9596();
					return local59;
				}
				local33.method9596();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(II)I")
	@Override
	public int method6961(@OriginalArg(1) int arg0) {
		return this.anIntArray219[arg0];
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(III)V")
	public void method2987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class391 local18 = Static90.aClass98_3.method2481(arg0);
		@Pc(21) int local21 = local18.anInt10634;
		@Pc(24) int local24 = local18.anInt10636;
		@Pc(27) int local27 = local18.anInt10632;
		@Pc(34) int local34 = Class296.anIntArray586[local27 - local24];
		if (arg1 < 0 || local34 < arg1) {
			arg1 = 0;
		}
		local34 <<= local24;
		this.method2988(local34 & arg1 << local24 | ~local34 & this.anIntArray219[local21], local21);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)I")
	@Override
	public int method6960(@OriginalArg(1) int arg0) {
		@Pc(8) Class391 local8 = Static90.aClass98_3.method2481(arg0);
		@Pc(11) int local11 = local8.anInt10634;
		@Pc(14) int local14 = local8.anInt10636;
		@Pc(17) int local17 = local8.anInt10632;
		@Pc(30) int local30 = Class296.anIntArray586[local17 - local14];
		return this.anIntArray219[local11] >> local14 & local30;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIZ)V")
	public void method2988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray219[arg1] = arg0;
		@Pc(24) Class3_Sub19 local24 = (Class3_Sub19) this.aClass313_16.method7104((long) arg1);
		if (local24 == null) {
			local24 = new Class3_Sub19(Static517.method6965() + 500L);
			this.aClass313_16.method7107((long) arg1, local24);
		} else {
			local24.aLong84 = Static517.method6965() + 500L;
		}
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(III)V")
	public void method2989(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class391 local8 = Static90.aClass98_3.method2481(arg0);
		@Pc(11) int local11 = local8.anInt10634;
		@Pc(14) int local14 = local8.anInt10636;
		@Pc(17) int local17 = local8.anInt10632;
		@Pc(24) int local24 = Class296.anIntArray586[local17 - local14];
		if (arg1 < 0 || local24 < arg1) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method2984(arg1 << local14 & local24 | this.anIntArray220[local11] & ~local24, local11);
	}
}
