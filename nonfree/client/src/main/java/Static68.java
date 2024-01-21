import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Lclient!nd;")
	public static Class1_Sub1_Sub11 aClass1_Sub1_Sub11_2;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
	public static int anInt1536 = 0;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_961 = Static69.method1153("blinken1:");

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Lclient!rd;")
	private static Class64 aClass64_965 = Static69.method1153("Report abuse");

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_962 = aClass64_965;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Lclient!rd;")
	private static Class64 aClass64_963 = Static69.method1153(" from your friend list first");

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_964 = Static69.method1153("Konfig geladen)3");

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!rd;")
	public static Class64 aClass64_966 = Static69.method1153("::noclip");

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_967 = aClass64_963;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Lclient!rd;")
	public static Class64 aClass64_968 = Static69.method1153("T");

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "Lclient!rd;")
	public static Class64 aClass64_969 = Static69.method1153("Handel)4Duell");

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Lclient!rd;")
	public static Class64 aClass64_970 = Static69.method1153("leuchten3:");

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Lclient!rd;")
	public static Class64 aClass64_971 = Static69.method1153("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
	public static void method1135(@OriginalArg(1) int arg0) {
		if (!Static1.method35(arg0)) {
			return;
		}
		@Pc(12) Class1_Sub1_Sub11[] local12 = Static65.aClass1_Sub1_Sub11ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(22) Class1_Sub1_Sub11 local22 = local12[local14];
			if (local22 != null) {
				local22.anInt1705 = 0;
				local22.anInt1685 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZ)I")
	public static int method1136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub14 local10 = (Class1_Sub14) Static110.aClass58_8.method1380((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray384.length) {
			return local10.anIntArray384[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method1137() {
		aClass64_968 = null;
		aClass64_970 = null;
		aClass1_Sub1_Sub11_2 = null;
		aClass64_971 = null;
		aClass64_966 = null;
		aClass64_963 = null;
		aClass64_967 = null;
		aClass64_969 = null;
		aClass64_964 = null;
		aClass64_961 = null;
		aClass64_962 = null;
		aClass64_965 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class1_Sub9 local7 = null;
		for (@Pc(12) Class1_Sub9 local12 = (Class1_Sub9) Static60.aClass50_8.method1151(); local12 != null; local12 = (Class1_Sub9) Static60.aClass50_8.method1141()) {
			if (arg5 == local12.anInt1887 && arg1 == local12.anInt1890 && local12.anInt1882 == arg0 && arg6 == local12.anInt1877) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub9();
			local7.anInt1877 = arg6;
			local7.anInt1882 = arg0;
			local7.anInt1887 = arg5;
			local7.anInt1890 = arg1;
			Static66.method1129(local7);
			Static60.aClass50_8.method1142(local7);
		}
		local7.anInt1875 = arg4;
		local7.anInt1889 = arg7;
		local7.anInt1884 = arg2;
		local7.anInt1891 = arg8;
		local7.anInt1885 = arg3;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z")
	public static boolean method1139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(8) Class1_Sub1_Sub3 local8 = Static108.method1807(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method246(arg0);
	}
}
