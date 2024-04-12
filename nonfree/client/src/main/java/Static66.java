import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!o", name = "F", descriptor = "[I")
	public static int[] anIntArray406;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "Lclient!ud;")
	public static Class5 aClass5_22;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 209)
	public static void method1170() {
		anIntArray406 = null;
		Class40.aClass40_509 = null;
		Class40.aClass40_508 = null;
		Class40.aClass40_507 = null;
		Class40.aClass40_510 = null;
		Class40.aClass40_506 = null;
		Class40.aClass40_505 = null;
		aClass5_22 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lclient!o;", line = 301)
	public static Class40 method1172(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static48.method859(arg0);
		} else if (arg0 < 10000000) {
			return Static72.method1334(new Class40[] { Static48.method859(arg0 / 1000), Class2_Sub12.aClass40_669 });
		} else {
			return Static72.method1334(new Class40[] { Static48.method859(arg0 / 1000000), Class2_Sub2_Sub4.aClass40_160 });
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIBZZ)Lclient!ad;", line = 945)
	public static Class5_Sub1 method1188(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class11 local10 = null;
		if (Static61.aClass14_4 != null) {
			local10 = new Class11(arg1, Static61.aClass14_4, Class3.aClass14Array1[arg1], 1000000);
		}
		return new Class5_Sub1(local10, Static68.aClass11_4, arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(III)I", line = 1044)
	public static int method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V", line = 1192)
	public static void method1197() {
		for (@Pc(7) int local7 = -1; local7 < Class54.anInt2067; local7++) {
			@Pc(17) int local17;
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Class41.anIntArray408[local7];
			}
			@Pc(25) Class2_Sub2_Sub12_Sub1_Sub1 local25 = Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local17];
			if (local25 != null) {
				Static83.method1468(local25, 1);
			}
		}
	}
}
