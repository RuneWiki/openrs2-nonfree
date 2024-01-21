import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "[I")
	public static int[] anIntArray577;

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 aClass2_Sub2_Sub3_Sub2_7;

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1366 = Static146.method2172("<br>");

	@OriginalMember(owner = "client!ue", name = "hb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1367 = Static146.method2172("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!ue", name = "ib", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1368 = Static146.method2172("http:)4)4");

	@OriginalMember(owner = "client!ue", name = "jb", descriptor = "Z")
	public static volatile boolean aBoolean165 = false;

	@OriginalMember(owner = "client!ue", name = "ob", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1369 = Static146.method2172("Freie Welt");

	@OriginalMember(owner = "client!ue", name = "sb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1370 = Static146.method2172(": ");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!sg;)I")
	public static int method2747(@OriginalArg(1) Class77 arg0) {
		if (Static136.anInt3303 == 1) {
			return 7;
		} else if (arg0.method2522(Static58.aClass77_604)) {
			return 1;
		} else if (arg0.method2522(Static161.aClass77_1358)) {
			return 1;
		} else if (arg0.method2522(Static114.aClass77_1069)) {
			return 2;
		} else if (arg0.method2522(Static15.aClass77_229)) {
			return 2;
		} else if (arg0.method2522(Static134.aClass77_1181)) {
			return 3;
		} else if (arg0.method2522(Static98.aClass77_964)) {
			return 4;
		} else if (arg0.method2522(Static126.aClass77_895)) {
			return 4;
		} else if (arg0.method2522(Static60.aClass77_625)) {
			return 5;
		} else if (arg0.method2522(Static7.aClass77_113)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!ke;IZLclient!sg;ILclient!sg;)V")
	public static void method2749(@OriginalArg(1) Class43 arg0, @OriginalArg(4) Class77 arg1, @OriginalArg(6) Class77 arg2) {
		@Pc(8) int local8 = arg0.method2206(arg1);
		@Pc(14) int local14 = arg0.method2215(local8, arg2);
		Static98.method1784(255, local14, arg0, local8);
	}

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)V")
	public static void method2750() {
		aClass77_1368 = null;
		aClass77_1367 = null;
		anIntArray577 = null;
		aClass2_Sub2_Sub3_Sub2_7 = null;
		aClass77_1366 = null;
		aClass77_1370 = null;
		aClass77_1369 = null;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IB)V")
	public static void method2751(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static40.method798(arg0)) {
			return;
		}
		@Pc(18) Class66[] local18 = Static125.aClass66ArrayArray1[arg0];
		for (@Pc(25) int local25 = 0; local25 < local18.length; local25++) {
			@Pc(31) Class66 local31 = local18[local25];
			if (local31.anObjectArray28 != null) {
				@Pc(38) Class2_Sub21 local38 = new Class2_Sub21();
				local38.anObjectArray29 = local31.anObjectArray28;
				local38.aClass66_14 = local31;
				Static56.method1061(2000000, local38);
			}
		}
	}
}
