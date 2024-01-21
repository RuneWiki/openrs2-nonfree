import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!ff;")
	public static Class26 aClass26_6;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public static int anInt1413;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!df;")
	public static Class5_Sub2_Sub1_Sub1_Sub1 aClass5_Sub2_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!r;")
	private static Class61 aClass61_443 = Static129.method2060("Loaded update list");

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!ef;")
	public static Class20 aClass20_6 = new Class20(32);

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_444 = aClass61_443;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Lclient!r;")
	public static Class61 aClass61_445 = Static129.method2060("title_mute");

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "[S")
	public static short[] aShortArray18 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "Lclient!r;")
	public static Class61 aClass61_446 = Static129.method2060("welle:");

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
	public static int anInt1420 = 128;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "[S")
	public static short[] aShortArray19 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Lclient!r;")
	public static Class61 aClass61_447 = Static129.method2060("<col=ffffff>");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)I")
	public static int method1005(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)Lclient!id;")
	public static Class5_Sub2_Sub8 method1006(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub2_Sub8 local10 = (Class5_Sub2_Sub8) Static120.aClass29_26.method766((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static98.aClass26_22.method1038(4, arg0);
		local10 = new Class5_Sub2_Sub8();
		if (local20 != null) {
			local10.method982(arg0, new Class5_Sub14(local20));
		}
		local10.method981();
		Static120.aClass29_26.method762(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public static void method1007() {
		@Pc(17) int local17;
		for (@Pc(7) int local7 = -1; local7 < Static92.anInt2219; local7++) {
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static66.anIntArray236[local7];
			}
			@Pc(25) Class5_Sub2_Sub2_Sub3_Sub2 local25 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local17];
			if (local25 != null && local25.anInt2924 > 0) {
				local25.anInt2924--;
				if (local25.anInt2924 == 0) {
					local25.aClass61_869 = null;
				}
			}
		}
		for (local17 = 0; local17 < Static100.anInt2607; local17++) {
			@Pc(66) int local66 = Static61.anIntArray225[local17];
			@Pc(70) Class5_Sub2_Sub2_Sub3_Sub1 local70 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local66];
			if (local70 != null && local70.anInt2924 > 0) {
				local70.anInt2924--;
				if (local70.anInt2924 == 0) {
					local70.aClass61_869 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method1008() {
		aClass61_447 = null;
		aClass5_Sub2_Sub1_Sub1_Sub1_2 = null;
		aClass61_445 = null;
		aClass61_446 = null;
		aClass61_444 = null;
		aClass26_6 = null;
		aClass20_6 = null;
		aShortArray19 = null;
		aClass61_443 = null;
		aShortArray18 = null;
	}
}
