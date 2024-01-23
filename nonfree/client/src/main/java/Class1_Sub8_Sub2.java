import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub8_Sub2 extends Class1_Sub8 {

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "Lclient!hh;")
	public Class69 aClass69_7 = new Class69();

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "Lclient!li;")
	public Class1_Sub8_Sub3 aClass1_Sub8_Sub3_2 = new Class1_Sub8_Sub3();

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "Lclient!un;")
	private Class1_Sub8_Sub4 aClass1_Sub8_Sub4_1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!un;)V")
	public Class1_Sub8_Sub2(@OriginalArg(0) Class1_Sub8_Sub4 arg0) {
		this.aClass1_Sub8_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([III)V")
	@Override
	public void method4204(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub8_Sub3_2.method4204(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub29 local17 = (Class1_Sub29) this.aClass69_7.method1636(); local17 != null; local17 = (Class1_Sub29) this.aClass69_7.method1631()) {
			if (!this.aClass1_Sub8_Sub4_1.method4246(local17)) {
				@Pc(30) int local30 = arg1;
				@Pc(32) int local32 = arg2;
				do {
					if (local17.anInt5146 >= local32) {
						this.method1277(arg0, local30 + local32, local17, local30, local32);
						local17.anInt5146 -= local32;
						break;
					}
					this.method1277(arg0, local32 + local30, local17, local30, local17.anInt5146);
					local32 -= local17.anInt5146;
					local30 += local17.anInt5146;
				} while (!this.aClass1_Sub8_Sub4_1.method4235(local17, local32, arg0, local30));
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "()I")
	@Override
	public int method4207() {
		return 0;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "()Lclient!sm;")
	@Override
	public Class1_Sub8 method4208() {
		@Pc(9) Class1_Sub29 local9 = (Class1_Sub29) this.aClass69_7.method1636();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub8_Sub1_3 == null) {
			return this.method4206();
		} else {
			return local9.aClass1_Sub8_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "()Lclient!sm;")
	@Override
	public Class1_Sub8 method4206() {
		while (true) {
			@Pc(9) Class1_Sub29 local9 = (Class1_Sub29) this.aClass69_7.method1631();
			if (local9 != null) {
				if (local9.aClass1_Sub8_Sub1_3 == null) {
					continue;
				}
				return local9.aClass1_Sub8_Sub1_3;
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	@Override
	public void method4209(@OriginalArg(0) int arg0) {
		this.aClass1_Sub8_Sub3_2.method4209(arg0);
		for (@Pc(15) Class1_Sub29 local15 = (Class1_Sub29) this.aClass69_7.method1636(); local15 != null; local15 = (Class1_Sub29) this.aClass69_7.method1631()) {
			if (!this.aClass1_Sub8_Sub4_1.method4246(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt5146) {
						this.method1279(local15, local25);
						local15.anInt5146 -= local25;
						break;
					}
					this.method1279(local15, local15.anInt5146);
					local25 -= local15.anInt5146;
				} while (!this.aClass1_Sub8_Sub4_1.method4235(local15, local25, null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([IZILclient!te;II)V")
	private void method1277(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub29 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub8_Sub4_1.anIntArray653[arg2.anInt5150] & 0x4) != 0 && arg2.anInt5165 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub8_Sub4_1.anIntArray643[arg2.anInt5150] / Static234.anInt4892;
			while (true) {
				@Pc(34) int local34 = (local23 + 1048575 - arg2.anInt5147) / local23;
				if (local34 > arg4) {
					arg2.anInt5147 += local23 * arg4;
					break;
				}
				arg4 -= local34;
				arg2.aClass1_Sub8_Sub1_3.method4204(arg0, arg3, local34);
				arg3 += local34;
				arg2.anInt5147 += local34 * local23 - 1048576;
				@Pc(66) Class1_Sub8_Sub1 local66 = arg2.aClass1_Sub8_Sub1_3;
				@Pc(70) int local70 = Static234.anInt4892 / 100;
				@Pc(74) int local74 = 262144 / local23;
				if (local74 < local70) {
					local70 = local74;
				}
				if (this.aClass1_Sub8_Sub4_1.anIntArray652[arg2.anInt5150] == 0) {
					arg2.aClass1_Sub8_Sub1_3 = Static305.method1236(arg2.aClass1_Sub22_Sub1_1, local66.method1233(), local66.method1255(), local66.method1232());
				} else {
					arg2.aClass1_Sub8_Sub1_3 = Static305.method1236(arg2.aClass1_Sub22_Sub1_1, local66.method1233(), 0, local66.method1232());
					this.aClass1_Sub8_Sub4_1.method4243(arg2, arg2.aClass1_Sub7_1.aShortArray23[arg2.anInt5151] < 0);
					arg2.aClass1_Sub8_Sub1_3.method1231(local70, local66.method1255());
				}
				if (arg2.aClass1_Sub7_1.aShortArray23[arg2.anInt5151] < 0) {
					arg2.aClass1_Sub8_Sub1_3.method1252(-1);
				}
				local66.method1257(local70);
				local66.method4204(arg0, arg3, arg1 - arg3);
				if (local66.method1222()) {
					this.aClass1_Sub8_Sub3_2.method2410(local66);
				}
			}
		}
		arg2.aClass1_Sub8_Sub1_3.method4204(arg0, arg3, arg4);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!te;I)V")
	private void method1279(@OriginalArg(1) Class1_Sub29 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub8_Sub4_1.anIntArray653[arg0.anInt5150] & 0x4) != 0 && arg0.anInt5165 < 0) {
			@Pc(28) int local28 = this.aClass1_Sub8_Sub4_1.anIntArray643[arg0.anInt5150] / Static234.anInt4892;
			@Pc(37) int local37 = (local28 + 1048575 - arg0.anInt5147) / local28;
			arg0.anInt5147 = arg0.anInt5147 + local28 * arg1 & 0xFFFFF;
			if (arg1 >= local37) {
				if (this.aClass1_Sub8_Sub4_1.anIntArray652[arg0.anInt5150] == 0) {
					arg0.aClass1_Sub8_Sub1_3 = Static305.method1236(arg0.aClass1_Sub22_Sub1_1, arg0.aClass1_Sub8_Sub1_3.method1233(), arg0.aClass1_Sub8_Sub1_3.method1255(), arg0.aClass1_Sub8_Sub1_3.method1232());
				} else {
					arg0.aClass1_Sub8_Sub1_3 = Static305.method1236(arg0.aClass1_Sub22_Sub1_1, arg0.aClass1_Sub8_Sub1_3.method1233(), 0, arg0.aClass1_Sub8_Sub1_3.method1232());
					this.aClass1_Sub8_Sub4_1.method4243(arg0, arg0.aClass1_Sub7_1.aShortArray23[arg0.anInt5151] < 0);
				}
				if (arg0.aClass1_Sub7_1.aShortArray23[arg0.anInt5151] < 0) {
					arg0.aClass1_Sub8_Sub1_3.method1252(-1);
				}
				arg1 = arg0.anInt5147 / local28;
			}
		}
		arg0.aClass1_Sub8_Sub1_3.method4209(arg1);
	}
}
