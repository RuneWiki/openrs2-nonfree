import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "[Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array4;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public static int anInt1616;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!ad;")
	private static Class4 aClass4_821 = Static75.method1216("shake:");

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!ad;")
	public static Class4 aClass4_822 = Static75.method1216("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!ad;")
	private static Class4 aClass4_826 = Static75.method1216("Service unavailable)3");

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!ad;")
	public static Class4 aClass4_823 = aClass4_826;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!ad;")
	public static Class4 aClass4_824 = Static75.method1216("Angreifen");

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!ad;")
	public static Class4 aClass4_825 = Static75.method1216("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Lclient!ad;")
	public static Class4 aClass4_827 = Static75.method1216("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "Lclient!ad;")
	public static Class4 aClass4_828 = aClass4_821;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBIIII)I")
	public static int method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg0;
			arg0 = local6;
		}
		@Pc(14) int local14 = arg5 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return arg2;
		} else if (local14 == 2) {
			return 1 + 7 - arg3 - arg1;
		} else {
			return 1 + 7 - arg0 - arg2;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(JB)V")
	public static void method1090(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method1091() {
		anIntArray227 = null;
		aClass4_826 = null;
		aClass4_827 = null;
		aClass4_823 = null;
		aClass4_828 = null;
		aClass3_Sub1_Sub4_Sub3Array4 = null;
		aClass4_824 = null;
		aClass4_822 = null;
		aClass4_825 = null;
		aClass4_821 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)V")
	public static void method1092(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static100.method1650(arg0)) {
			return;
		}
		Static86.method1371(arg4, arg3, -1, 0, arg2, 0, arg1, Static104.aClass3_Sub1_Sub14ArrayArray1[arg0], arg5);
		if (Static77.aClass3_Sub1_Sub14_1 == null) {
			return;
		}
		@Pc(33) Class3_Sub1_Sub14 local33 = Static77.aClass3_Sub1_Sub14_1;
		@Pc(37) Class3_Sub1_Sub14 local37 = Static15.method226(local33);
		if (local37 == null) {
			return;
		}
		@Pc(44) int[] local44 = Static4.method115(local37);
		@Pc(48) int[] local48 = Static4.method115(local33);
		@Pc(63) int local63 = local48[0] + Static22.anInt496 - local44[0] - Static86.anInt2001;
		@Pc(77) int local77 = Static78.anInt420 + local48[1] - Static23.anInt516 - local44[1];
		if (local77 < 0) {
			local77 = 0;
		}
		if (local33.anInt2117 + local77 > local37.anInt2117) {
			local77 = local37.anInt2117 - local33.anInt2117;
		}
		if (local63 < 0) {
			local63 = 0;
		}
		if (local37.anInt2130 < local33.anInt2130 + local63) {
			local63 = local37.anInt2130 - local33.anInt2130;
		}
		if (Static77.aClass3_Sub1_Sub14_1.anObjectArray1 != null && (arg3 & 0x200) != 0) {
			Static46.method1874(local77, local63, local33, local33.anObjectArray1);
		}
		if (Static49.anInt1204 != 0 || (arg3 & 0x400) == 0) {
			return;
		}
		if (Static77.aClass3_Sub1_Sub14_1.anObjectArray5 != null) {
			Static46.method1874(local77, local63, local33, local33.anObjectArray5);
		}
		Static77.aClass3_Sub1_Sub14_1 = null;
		return;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
	public static void method1093() {
		Static1.aClass8_1.method198();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!rd;Lclient!rd;)V")
	public static void method1094(@OriginalArg(1) Class64 arg0, @OriginalArg(2) Class64 arg1) {
		Static6.aClass64_9 = arg0;
		Static27.aClass64_24 = arg1;
	}
}
