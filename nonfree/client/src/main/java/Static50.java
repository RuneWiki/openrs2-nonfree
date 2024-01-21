import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "Lclient!dd;")
	public static Class19 aClass19_46 = new Class19(64);

	@OriginalMember(owner = "client!j", name = "lb", descriptor = "I")
	public static int anInt1190 = 0;

	@OriginalMember(owner = "client!j", name = "ob", descriptor = "I")
	public static int anInt1193 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!j", name = "ub", descriptor = "Lclient!rd;")
	private static Class64 aClass64_756 = Static69.method1153("Your profile will be transferred in:");

	@OriginalMember(owner = "client!j", name = "sb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_755 = aClass64_756;

	@OriginalMember(owner = "client!j", name = "Bb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_759 = Static69.method1153("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!j", name = "yb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_757 = aClass64_759;

	@OriginalMember(owner = "client!j", name = "zb", descriptor = "I")
	public static int anInt1201 = 0;

	@OriginalMember(owner = "client!j", name = "Cb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_760 = Static69.method1153("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!j", name = "Ab", descriptor = "Lclient!rd;")
	public static Class64 aClass64_758 = aClass64_760;

	@OriginalMember(owner = "client!j", name = "Eb", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(Z)V")
	public static void method906() {
		aClass64_760 = null;
		aClass19_46 = null;
		aClass64_759 = null;
		aClass64_755 = null;
		aClass64_757 = null;
		aClass64_758 = null;
		aClass64_756 = null;
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)I")
	public static int method907() {
		return 5;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public static void method909() {
		Static71.aClass19_59.method416();
		Static69.aClass19_55.method416();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lclient!rd;")
	public static Class64 method910(@OriginalArg(0) int arg0) {
		@Pc(9) Class64 local9 = Static12.method1395(arg0);
		for (@Pc(15) int local15 = local9.method1469() - 3; local15 > 0; local15 -= 3) {
			local9 = Static82.method1383(new Class64[] { local9.method1475(local15, 0), Static102.aClass64_1479, local9.method1481(local15) });
		}
		if (local9.method1469() > 8) {
			local9 = Static82.method1383(new Class64[] { Static70.aClass64_987, local9.method1475(local9.method1469() - 8, 0), Static8.aClass64_251, Static23.aClass64_429, local9, Static69.aClass64_972 });
		} else if (local9.method1469() > 4) {
			local9 = Static82.method1383(new Class64[] { Static91.aClass64_1295, local9.method1475(local9.method1469() - 4, 0), Static28.aClass64_1535, Static23.aClass64_429, local9, Static69.aClass64_972 });
		}
		return Static82.method1383(new Class64[] { Static117.aClass64_1801, local9 });
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!ke;Lclient!d;Z)V")
	public static void method911(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class16 arg2) {
		@Pc(12) Class1_Sub12 local12 = new Class1_Sub12();
		local12.anInt2329 = 1;
		local12.aClass41_Sub1_17 = arg1;
		local12.aClass16_4 = arg2;
		local12.aLong87 = arg0;
		@Pc(27) Class50 local27 = Static96.aClass50_14;
		synchronized (Static96.aClass50_14) {
			Static96.aClass50_14.method1142(local12);
		}
		Static3.method128();
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
	public static void method912() {
		if (!Static12.aBoolean120) {
			return;
		}
		Static57.aClass37_18 = null;
		Static19.aClass1_Sub1_Sub5_Sub3_3 = null;
		Static66.aClass1_Sub1_Sub5_Sub3_12 = null;
		Static46.aClass1_Sub1_Sub5_Sub3_8 = null;
		Static7.aClass1_Sub1_Sub5_Sub3_2 = null;
		Static41.anIntArray389 = null;
		Static66.anIntArray234 = null;
		Static44.aClass1_Sub1_Sub5_Sub3_7 = null;
		Static23.aClass37_11 = null;
		Static96.aClass37_38 = null;
		Static62.aClass37_22 = null;
		Static31.aClass1_Sub1_Sub5_Sub3_5 = null;
		Static84.aClass1_Sub1_Sub5_Sub3_15 = null;
		Static12.aBoolean120 = false;
		Static73.aClass1_Sub1_Sub5_Sub3_13 = null;
		Static8.anIntArray49 = null;
		Static17.aClass37_6 = null;
		Static91.anIntArray302 = null;
		Static82.aClass1_Sub1_Sub5_Sub3_14 = null;
		Static9.aClass37_4 = null;
		Static2.aClass1_Sub1_Sub5_Sub3_1 = null;
		Static46.aClass37_15 = null;
		Static40.aClass1_Sub1_Sub5_Sub3_6 = null;
		Static66.aClass37_24 = null;
		Static48.aClass1_Sub1_Sub5_Sub3_18 = null;
		Static93.anIntArray305 = null;
		Static71.aClass37_25 = null;
		Static61.aClass1_Sub1_Sub5_Sub3_11 = null;
		Static118.aClass1_Sub1_Sub5_Sub3_19 = null;
		Static99.aClass1_Sub1_Sub5_Sub3_17 = null;
		Static20.aClass1_Sub1_Sub5_Sub3Array2 = null;
		Static45.aClass37_14 = null;
		Static15.aClass37_5 = null;
		Static74.aClass37_26 = null;
		Static99.aClass37_31 = null;
		Static110.aClass37_36 = null;
		Static20.aClass37_10 = null;
		Static49.aClass1_Sub1_Sub5_Sub3_10 = null;
		Static34.anIntArray121 = null;
		Static41.aClass37_37 = null;
		Static89.anIntArray300 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)I")
	public static int method913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return (arg2 / 4 << 10) + (arg0 / 32 << 7) + arg1 / 2;
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V")
	public static void method916() {
		Static17.anInt574 = 0;
		@Pc(18) int local18 = (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375 >> 7) + Static60.anInt1350;
		@Pc(25) int local25 = Static53.anInt1236 + (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412 >> 7);
		if (local18 >= 3053 && local18 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static17.anInt574 = 1;
		}
		if (local18 >= 3072 && local18 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static17.anInt574 = 1;
		}
		if (Static17.anInt574 == 1 && local18 >= 3139 && local18 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static17.anInt574 = 0;
		}
	}
}
