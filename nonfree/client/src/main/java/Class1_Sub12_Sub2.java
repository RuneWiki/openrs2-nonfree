import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class1_Sub12_Sub2 extends Class1_Sub12 {

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "Lclient!mi;")
	public Class75 aClass75_13 = new Class75();

	@OriginalMember(owner = "client!mk", name = "L", descriptor = "Lclient!fb;")
	public Class1_Sub12_Sub1 aClass1_Sub12_Sub1_1 = new Class1_Sub12_Sub1();

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "Lclient!ok;")
	private Class1_Sub12_Sub3 aClass1_Sub12_Sub3_3;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class1_Sub12_Sub2(@OriginalArg(0) Class1_Sub12_Sub3 arg0) {
		this.aClass1_Sub12_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([IILclient!ng;III)V")
	private void method2279(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass1_Sub12_Sub3_3.anIntArray342[arg2.anInt2893] & 0x4) != 0 && arg2.anInt2907 < 0) {
			@Pc(32) int local32 = this.aClass1_Sub12_Sub3_3.anIntArray340[arg2.anInt2893] / Static50.anInt1044;
			while (true) {
				@Pc(42) int local42 = (local32 + 1048575 - arg2.anInt2909) / local32;
				if (arg3 < local42) {
					arg2.anInt2909 += local32 * arg3;
					break;
				}
				arg2.aClass1_Sub12_Sub4_3.method3036(arg0, arg1, local42);
				arg2.anInt2909 += local32 * local42 - 1048576;
				@Pc(69) int local69 = Static50.anInt1044 / 100;
				arg1 += local42;
				arg3 -= local42;
				@Pc(81) int local81 = 262144 / local32;
				@Pc(84) Class1_Sub12_Sub4 local84 = arg2.aClass1_Sub12_Sub4_3;
				if (local81 < local69) {
					local69 = local81;
				}
				if (this.aClass1_Sub12_Sub3_3.anIntArray343[arg2.anInt2893] == 0) {
					arg2.aClass1_Sub12_Sub4_3 = Static245.method3056(arg2.aClass1_Sub15_Sub1_1, local84.method3072(), local84.method3043(), local84.method3059());
				} else {
					arg2.aClass1_Sub12_Sub4_3 = Static245.method3056(arg2.aClass1_Sub15_Sub1_1, local84.method3072(), 0, local84.method3059());
					this.aClass1_Sub12_Sub3_3.method2625(arg2, arg2.aClass1_Sub7_1.aShortArray3[arg2.anInt2902] < 0);
					arg2.aClass1_Sub12_Sub4_3.method3065(local69, local84.method3043());
				}
				if (arg2.aClass1_Sub7_1.aShortArray3[arg2.anInt2902] < 0) {
					arg2.aClass1_Sub12_Sub4_3.method3041(-1);
				}
				local84.method3079(local69);
				local84.method3036(arg0, arg1, arg4 - arg1);
				if (local84.method3068()) {
					this.aClass1_Sub12_Sub1_1.method895(local84);
				}
			}
		}
		arg2.aClass1_Sub12_Sub4_3.method3036(arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "()Lclient!ge;")
	@Override
	public Class1_Sub12 method3038() {
		@Pc(9) Class1_Sub20 local9 = (Class1_Sub20) this.aClass75_13.method2239();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub12_Sub4_3 == null) {
			return this.method3035();
		} else {
			return local9.aClass1_Sub12_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "()I")
	@Override
	public int method3033() {
		return 0;
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "()Lclient!ge;")
	@Override
	public Class1_Sub12 method3035() {
		@Pc(9) Class1_Sub20 local9;
		do {
			local9 = (Class1_Sub20) this.aClass75_13.method2238();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub12_Sub4_3 == null);
		return local9.aClass1_Sub12_Sub4_3;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!ng;BI)V")
	private void method2284(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub12_Sub3_3.anIntArray342[arg0.anInt2893] & 0x4) != 0 && arg0.anInt2907 < 0) {
			@Pc(29) int local29 = this.aClass1_Sub12_Sub3_3.anIntArray340[arg0.anInt2893] / Static50.anInt1044;
			@Pc(40) int local40 = (local29 + 1048575 - arg0.anInt2909) / local29;
			arg0.anInt2909 = local29 * arg1 + arg0.anInt2909 & 0xFFFFF;
			if (local40 <= arg1) {
				if (this.aClass1_Sub12_Sub3_3.anIntArray343[arg0.anInt2893] == 0) {
					arg0.aClass1_Sub12_Sub4_3 = Static245.method3056(arg0.aClass1_Sub15_Sub1_1, arg0.aClass1_Sub12_Sub4_3.method3072(), arg0.aClass1_Sub12_Sub4_3.method3043(), arg0.aClass1_Sub12_Sub4_3.method3059());
				} else {
					arg0.aClass1_Sub12_Sub4_3 = Static245.method3056(arg0.aClass1_Sub15_Sub1_1, arg0.aClass1_Sub12_Sub4_3.method3072(), 0, arg0.aClass1_Sub12_Sub4_3.method3059());
					this.aClass1_Sub12_Sub3_3.method2625(arg0, arg0.aClass1_Sub7_1.aShortArray3[arg0.anInt2902] < 0);
				}
				if (arg0.aClass1_Sub7_1.aShortArray3[arg0.anInt2902] < 0) {
					arg0.aClass1_Sub12_Sub4_3.method3041(-1);
				}
				arg1 = arg0.anInt2909 / local29;
			}
		}
		arg0.aClass1_Sub12_Sub4_3.method3037(arg1);
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
	@Override
	public void method3037(@OriginalArg(0) int arg0) {
		this.aClass1_Sub12_Sub1_1.method3037(arg0);
		for (@Pc(11) Class1_Sub20 local11 = (Class1_Sub20) this.aClass75_13.method2239(); local11 != null; local11 = (Class1_Sub20) this.aClass75_13.method2238()) {
			if (!this.aClass1_Sub12_Sub3_3.method2632(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local21 <= local11.anInt2898) {
						this.method2284(local11, local21);
						local11.anInt2898 -= local21;
						break;
					}
					this.method2284(local11, local11.anInt2898);
					local21 -= local11.anInt2898;
				} while (!this.aClass1_Sub12_Sub3_3.method2612(null, local21, local11, 0));
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([III)V")
	@Override
	public void method3036(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub12_Sub1_1.method3036(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub20 local17 = (Class1_Sub20) this.aClass75_13.method2239(); local17 != null; local17 = (Class1_Sub20) this.aClass75_13.method2238()) {
			if (!this.aClass1_Sub12_Sub3_3.method2632(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt2898 >= local29) {
						this.method2279(arg0, local27, local17, local29, local29 + local27);
						local17.anInt2898 -= local29;
						break;
					}
					this.method2279(arg0, local27, local17, local17.anInt2898, local29 + local27);
					local27 += local17.anInt2898;
					local29 -= local17.anInt2898;
				} while (!this.aClass1_Sub12_Sub3_3.method2612(arg0, local29, local17, local27));
			}
		}
	}
}
