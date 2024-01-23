import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "Lclient!nk;")
	public static Class121 aClass121_37;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
	public static int anInt1148;

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
	public static int anInt1144 = 0;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
	public static int anInt1145 = 0;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Z")
	public static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
	public static int anInt1146 = 0;

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString70 = "white:";

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString71 = "Started 3d Library";

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	public static void method1088(@OriginalArg(1) int arg0) {
		Static45.anInt929 = -1;
		Static27.anInt483 = arg0;
		Static200.anInt3847 = 100;
		Static124.anInt5509 = 3;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1094(@OriginalArg(0) String arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static240.aStringArray34.length; local13++) {
			if (Static240.aStringArray34[local13].equalsIgnoreCase(arg0)) {
				return local13;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	public static void method1096() {
		if (Static85.aClass126ArrayArray1 == null) {
			return;
		}
		@Pc(8) Class126 local8 = new Class126();
		for (@Pc(10) int local10 = 0; local10 < 13; local10++) {
			for (@Pc(17) int local17 = 0; local17 < 13; local17++) {
				Static85.aClass126ArrayArray1[local10][local17] = local8;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)I")
	public static int method1098(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 - 1;
		@Pc(11) int local11 = local5 | local5 >>> 1;
		@Pc(17) int local17 = local11 | local11 >>> 2;
		@Pc(23) int local23 = local17 | local17 >>> 4;
		@Pc(33) int local33 = local23 | local23 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
