import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "Lclient!nd;")
	public final Class53 aClass53_11 = new Class53();

	@OriginalMember(owner = "client!mf", name = "ab", descriptor = "Lclient!a;")
	public final Class1_Sub1_Sub1 aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1();

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "Lclient!kd;")
	private final Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class1_Sub1_Sub4(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		this.aClass1_Sub1_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "()I")
	@Override
	public int method1360() {
		return 0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([III)V")
	@Override
	public void method1359(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub1_Sub1_1.method1359(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub13 local17 = (Class1_Sub13) this.aClass53_11.method1442(); local17 != null; local17 = (Class1_Sub13) this.aClass53_11.method1450()) {
			if (!this.aClass1_Sub1_Sub3_2.method1165(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt1715) {
						this.method1366(arg0, local27 + local29, local29, local27, local17);
						local17.anInt1715 -= local27;
						break;
					}
					this.method1366(arg0, local27 + local29, local29, local17.anInt1715, local17);
					local29 += local17.anInt1715;
					local27 -= local17.anInt1715;
				} while (!this.aClass1_Sub1_Sub3_2.method1174(arg0, local17, local29, local27));
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "()Lclient!ja;")
	@Override
	public Class1_Sub1 method1362() {
		@Pc(9) Class1_Sub13 local9 = (Class1_Sub13) this.aClass53_11.method1442();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub1_Sub2_1 == null) {
			return this.method1357();
		} else {
			return local9.aClass1_Sub1_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()Lclient!ja;")
	@Override
	public Class1_Sub1 method1357() {
		@Pc(9) Class1_Sub13 local9;
		do {
			local9 = (Class1_Sub13) this.aClass53_11.method1450();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub1_Sub2_1 == null);
		return local9.aClass1_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[IIIILclient!m;)V")
	private void method1366(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub13 arg4) {
		if ((this.aClass1_Sub1_Sub3_2.anIntArray251[arg4.anInt1731] & 0x4) != 0 && arg4.anInt1735 < 0) {
			@Pc(25) int local25 = this.aClass1_Sub1_Sub3_2.anIntArray250[arg4.anInt1731] / Static45.anInt2755;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg4.anInt1716) / local25;
				if (local35 > arg3) {
					arg4.anInt1716 += arg3 * local25;
					break;
				}
				arg3 -= local35;
				arg4.aClass1_Sub1_Sub2_1.method1359(arg0, arg2, local35);
				arg2 += local35;
				arg4.anInt1716 += local25 * local35 - 1048576;
				@Pc(70) int local70 = Static45.anInt2755 / 100;
				@Pc(73) Class1_Sub1_Sub2 local73 = arg4.aClass1_Sub1_Sub2_1;
				@Pc(77) int local77 = 262144 / local25;
				if (local70 > local77) {
					local70 = local77;
				}
				if (this.aClass1_Sub1_Sub3_2.anIntArray262[arg4.anInt1731] == 0) {
					arg4.aClass1_Sub1_Sub2_1 = Static133.method986(arg4.aClass1_Sub9_Sub1_1, local73.method990(), local73.method967(), local73.method976());
				} else {
					arg4.aClass1_Sub1_Sub2_1 = Static133.method986(arg4.aClass1_Sub9_Sub1_1, local73.method990(), 0, local73.method976());
					this.aClass1_Sub1_Sub3_2.method1169(arg4.aClass1_Sub4_1.aShortArray1[arg4.anInt1738] < 0, arg4);
					arg4.aClass1_Sub1_Sub2_1.method981(local70, local73.method967());
				}
				if (arg4.aClass1_Sub4_1.aShortArray1[arg4.anInt1738] < 0) {
					arg4.aClass1_Sub1_Sub2_1.method980(-1);
				}
				local73.method985(local70);
				local73.method1359(arg0, arg2, arg1 - arg2);
				if (local73.method978()) {
					this.aClass1_Sub1_Sub1_1.method38(local73);
				}
			}
		}
		arg4.aClass1_Sub1_Sub2_1.method1359(arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!m;)V")
	private void method1367(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if ((this.aClass1_Sub1_Sub3_2.anIntArray251[arg1.anInt1731] & 0x4) != 0 && arg1.anInt1735 < 0) {
			@Pc(27) int local27 = this.aClass1_Sub1_Sub3_2.anIntArray250[arg1.anInt1731] / Static45.anInt2755;
			@Pc(37) int local37 = (local27 + 1048575 - arg1.anInt1716) / local27;
			arg1.anInt1716 = arg1.anInt1716 + local27 * arg0 & 0xFFFFF;
			if (arg0 >= local37) {
				if (this.aClass1_Sub1_Sub3_2.anIntArray262[arg1.anInt1731] == 0) {
					arg1.aClass1_Sub1_Sub2_1 = Static133.method986(arg1.aClass1_Sub9_Sub1_1, arg1.aClass1_Sub1_Sub2_1.method990(), arg1.aClass1_Sub1_Sub2_1.method967(), arg1.aClass1_Sub1_Sub2_1.method976());
				} else {
					arg1.aClass1_Sub1_Sub2_1 = Static133.method986(arg1.aClass1_Sub9_Sub1_1, arg1.aClass1_Sub1_Sub2_1.method990(), 0, arg1.aClass1_Sub1_Sub2_1.method976());
					this.aClass1_Sub1_Sub3_2.method1169(arg1.aClass1_Sub4_1.aShortArray1[arg1.anInt1738] < 0, arg1);
				}
				if (arg1.aClass1_Sub4_1.aShortArray1[arg1.anInt1738] < 0) {
					arg1.aClass1_Sub1_Sub2_1.method980(-1);
				}
				arg0 = arg1.anInt1716 / local27;
			}
		}
		arg1.aClass1_Sub1_Sub2_1.method1358(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	@Override
	public void method1358(@OriginalArg(0) int arg0) {
		this.aClass1_Sub1_Sub1_1.method1358(arg0);
		for (@Pc(15) Class1_Sub13 local15 = (Class1_Sub13) this.aClass53_11.method1442(); local15 != null; local15 = (Class1_Sub13) this.aClass53_11.method1450()) {
			if (!this.aClass1_Sub1_Sub3_2.method1165(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt1715 >= local25) {
						this.method1367(local25, local15);
						local15.anInt1715 -= local25;
						break;
					}
					this.method1367(local15.anInt1715, local15);
					local25 -= local15.anInt1715;
				} while (!this.aClass1_Sub1_Sub3_2.method1174(null, local15, 0, local25));
			}
		}
	}
}
