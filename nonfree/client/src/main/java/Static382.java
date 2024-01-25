import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
	public static int anInt7086;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!s;")
	public static final Class217 aClass217_153 = new Class217(20, -1);

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "[I")
	public static final int[] anIntArray686 = new int[14];

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "[I")
	public static final int[] anIntArray687 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public static void method5563() {
		for (@Pc(15) int local15 = 0; local15 < Static58.aClass184ArrayArray1.length; local15++) {
			for (@Pc(19) int local19 = 0; local19 < Static58.aClass184ArrayArray1[local15].length; local19++) {
				Static58.aClass184ArrayArray1[local15][local19] = Static370.aClass184_2;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILclient!gh;Z)V")
	public static void method5564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray19 != null) {
			@Pc(13) Class10_Sub40 local13 = new Class10_Sub40();
			local13.aClass89_12 = arg2;
			local13.anObjectArray36 = arg2.anObjectArray19;
			Static79.method1501(local13);
		}
		Static24.anInt394 = arg2.anInt2698;
		Static401.aBoolean489 = true;
		Static228.anInt4243 = arg2.anInt2670;
		Static218.anInt4149 = arg0;
		Static40.anInt656 = arg2.anInt2667;
		Static273.anInt4773 = arg2.anInt2677;
		Static46.anInt880 = arg1;
		Static219.anInt4156 = arg2.anInt2720;
		Static135.method5400(arg2);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Z")
	public static boolean method5565(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)Z")
	public static boolean method5566(@OriginalArg(1) int arg0) {
		for (@Pc(17) Class10_Sub45 local17 = (Class10_Sub45) Static70.aClass163_13.method3620(); local17 != null; local17 = (Class10_Sub45) Static70.aClass163_13.method3621()) {
			if (Static114.method1979(local17.anInt7505) && (long) arg0 == local17.aLong261) {
				return true;
			}
		}
		return false;
	}
}
