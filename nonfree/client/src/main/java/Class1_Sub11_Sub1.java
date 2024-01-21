import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class1_Sub11_Sub1 extends Class1_Sub11 {

	@OriginalMember(owner = "client!le", name = "F", descriptor = "Lclient!n;")
	public final Class56 aClass56_8 = new Class56();

	@OriginalMember(owner = "client!le", name = "U", descriptor = "Lclient!ub;")
	public final Class1_Sub11_Sub3 aClass1_Sub11_Sub3_1 = new Class1_Sub11_Sub3();

	@OriginalMember(owner = "client!le", name = "G", descriptor = "Lclient!me;")
	private final Class1_Sub11_Sub2 aClass1_Sub11_Sub2_2;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!me;)V")
	public Class1_Sub11_Sub1(@OriginalArg(0) Class1_Sub11_Sub2 arg0) {
		this.aClass1_Sub11_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!sd;BI)V")
	private void method1664(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub11_Sub2_2.anIntArray340[arg0.anInt3736] & 0x4) != 0 && arg0.anInt3748 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub11_Sub2_2.anIntArray341[arg0.anInt3736] / Static35.anInt974;
			@Pc(33) int local33 = (local23 + 1048575 - arg0.anInt3727) / local23;
			arg0.anInt3727 = arg0.anInt3727 + arg1 * local23 & 0xFFFFF;
			if (local33 <= arg1) {
				if (this.aClass1_Sub11_Sub2_2.anIntArray335[arg0.anInt3736] == 0) {
					arg0.aClass1_Sub11_Sub4_3 = Static189.method2948(arg0.aClass1_Sub9_Sub1_1, arg0.aClass1_Sub11_Sub4_3.method2939(), arg0.aClass1_Sub11_Sub4_3.method2958(), arg0.aClass1_Sub11_Sub4_3.method2969());
				} else {
					arg0.aClass1_Sub11_Sub4_3 = Static189.method2948(arg0.aClass1_Sub9_Sub1_1, arg0.aClass1_Sub11_Sub4_3.method2939(), 0, arg0.aClass1_Sub11_Sub4_3.method2969());
					this.aClass1_Sub11_Sub2_2.method1771(arg0, arg0.aClass1_Sub5_1.aShortArray4[arg0.anInt3732] < 0);
				}
				if (arg0.aClass1_Sub5_1.aShortArray4[arg0.anInt3732] < 0) {
					arg0.aClass1_Sub11_Sub4_3.method2961(-1);
				}
				arg1 = arg0.anInt3727 / local23;
			}
		}
		arg0.aClass1_Sub11_Sub4_3.method2935(arg1);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[IIIILclient!sd;)V")
	private void method1667(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub19 arg4) {
		if ((this.aClass1_Sub11_Sub2_2.anIntArray340[arg4.anInt3736] & 0x4) != 0 && arg4.anInt3748 < 0) {
			@Pc(22) int local22 = this.aClass1_Sub11_Sub2_2.anIntArray341[arg4.anInt3736] / Static35.anInt974;
			while (true) {
				@Pc(32) int local32 = (local22 + 1048575 - arg4.anInt3727) / local22;
				if (local32 > arg3) {
					arg4.anInt3727 += arg3 * local22;
					break;
				}
				arg4.aClass1_Sub11_Sub4_3.method2933(arg1, arg2, local32);
				arg2 += local32;
				arg3 -= local32;
				arg4.anInt3727 += local32 * local22 - 1048576;
				@Pc(67) int local67 = Static35.anInt974 / 100;
				@Pc(70) Class1_Sub11_Sub4 local70 = arg4.aClass1_Sub11_Sub4_3;
				@Pc(74) int local74 = 262144 / local22;
				if (local74 < local67) {
					local67 = local74;
				}
				if (this.aClass1_Sub11_Sub2_2.anIntArray335[arg4.anInt3736] == 0) {
					arg4.aClass1_Sub11_Sub4_3 = Static189.method2948(arg4.aClass1_Sub9_Sub1_1, local70.method2939(), local70.method2958(), local70.method2969());
				} else {
					arg4.aClass1_Sub11_Sub4_3 = Static189.method2948(arg4.aClass1_Sub9_Sub1_1, local70.method2939(), 0, local70.method2969());
					this.aClass1_Sub11_Sub2_2.method1771(arg4, arg4.aClass1_Sub5_1.aShortArray4[arg4.anInt3732] < 0);
					arg4.aClass1_Sub11_Sub4_3.method2959(local67, local70.method2958());
				}
				if (arg4.aClass1_Sub5_1.aShortArray4[arg4.anInt3732] < 0) {
					arg4.aClass1_Sub11_Sub4_3.method2961(-1);
				}
				local70.method2937(local67);
				local70.method2933(arg1, arg2, arg0 - arg2);
				if (local70.method2966()) {
					this.aClass1_Sub11_Sub3_1.method2820(local70);
				}
			}
		}
		arg4.aClass1_Sub11_Sub4_3.method2933(arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()Lclient!og;")
	@Override
	public Class1_Sub11 method2932() {
		@Pc(9) Class1_Sub19 local9 = (Class1_Sub19) this.aClass56_8.method1853();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub11_Sub4_3 == null) {
			return this.method2936();
		} else {
			return local9.aClass1_Sub11_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	@Override
	public void method2935(@OriginalArg(0) int arg0) {
		this.aClass1_Sub11_Sub3_1.method2935(arg0);
		for (@Pc(15) Class1_Sub19 local15 = (Class1_Sub19) this.aClass56_8.method1853(); local15 != null; local15 = (Class1_Sub19) this.aClass56_8.method1855()) {
			if (!this.aClass1_Sub11_Sub2_2.method1774(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt3751) {
						this.method1664(local15, local25);
						local15.anInt3751 -= local25;
						break;
					}
					this.method1664(local15, local15.anInt3751);
					local25 -= local15.anInt3751;
				} while (!this.aClass1_Sub11_Sub2_2.method1777(0, local25, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([III)V")
	@Override
	public void method2933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub11_Sub3_1.method2933(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub19 local17 = (Class1_Sub19) this.aClass56_8.method1853(); local17 != null; local17 = (Class1_Sub19) this.aClass56_8.method1855()) {
			if (!this.aClass1_Sub11_Sub2_2.method1774(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt3751 >= local29) {
						this.method1667(local29 + local27, arg0, local27, local29, local17);
						local17.anInt3751 -= local29;
						break;
					}
					this.method1667(local27 + local29, arg0, local27, local17.anInt3751, local17);
					local29 -= local17.anInt3751;
					local27 += local17.anInt3751;
				} while (!this.aClass1_Sub11_Sub2_2.method1777(local27, local29, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()I")
	@Override
	public int method2930() {
		return 0;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()Lclient!og;")
	@Override
	public Class1_Sub11 method2936() {
		@Pc(9) Class1_Sub19 local9;
		do {
			local9 = (Class1_Sub19) this.aClass56_8.method1855();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub11_Sub4_3 == null);
		return local9.aClass1_Sub11_Sub4_3;
	}
}
