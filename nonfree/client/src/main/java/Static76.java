import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "Lclient!ke;")
	public static Class43 aClass43_19;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 aClass2_Sub2_Sub3_Sub2_4;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "Lclient!sg;")
	public static Class77 aClass77_800 = Static146.method2172("title_mute");

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
	public static volatile int anInt1994 = -1;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "Lclient!sg;")
	public static Class77 aClass77_801 = Static146.method2172("Schlie-8en");

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "Lclient!sg;")
	public static Class77 aClass77_802 = Static146.method2172("0(U");

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "Lclient!cb;")
	public static Class10 aClass10_58 = new Class10();

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	public static void method1426() {
		if (Static92.aBoolean101 && Static54.anInt1472 != Static24.anInt724) {
			Static71.method1388(Static54.anInt1472, Static82.anInt2149, Static6.anInt181, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0]);
		} else if (Static54.anInt1472 != Static14.anInt476) {
			Static14.anInt476 = Static54.anInt1472;
			Static127.method2177(Static54.anInt1472);
		}
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	public static void method1427() {
		aClass77_800 = null;
		aClass77_801 = null;
		aClass2_Sub2_Sub3_Sub2_4 = null;
		aClass77_802 = null;
		aClass10_58 = null;
		aClass43_19 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!sg;II)V")
	public static void method1428(@OriginalArg(1) int arg0, @OriginalArg(2) Class77 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class66 local8 = Static105.method1835(arg2, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray6 != null) {
			@Pc(22) Class2_Sub21 local22 = new Class2_Sub21();
			local22.aClass77_1522 = arg1;
			local22.aClass66_14 = local8;
			local22.anInt4462 = arg3;
			local22.anObjectArray29 = local8.anObjectArray6;
			Static150.method2565(local22);
		}
		@Pc(40) boolean local40 = true;
		if (local8.anInt3224 > 0) {
			local40 = Static125.method2165(local8);
		}
		if (!local40 || !Static174.method2941(Static63.method1160(local8), arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static124.aClass2_Sub18_Sub1_3.method2398(73);
			Static124.aClass2_Sub18_Sub1_3.method2370(arg2);
			Static124.aClass2_Sub18_Sub1_3.method2369(arg0);
		}
		if (arg3 == 2) {
			Static124.aClass2_Sub18_Sub1_3.method2398(38);
			Static124.aClass2_Sub18_Sub1_3.method2370(arg2);
			Static124.aClass2_Sub18_Sub1_3.method2369(arg0);
		}
		if (arg3 == 3) {
			Static124.aClass2_Sub18_Sub1_3.method2398(31);
			Static124.aClass2_Sub18_Sub1_3.method2370(arg2);
			Static124.aClass2_Sub18_Sub1_3.method2369(arg0);
		}
		if (arg3 == 4) {
			Static124.aClass2_Sub18_Sub1_3.method2398(106);
			Static124.aClass2_Sub18_Sub1_3.method2370(arg2);
			Static124.aClass2_Sub18_Sub1_3.method2369(arg0);
		}
		if (arg3 == 5) {
			Static124.aClass2_Sub18_Sub1_3.method2398(0);
			Static124.aClass2_Sub18_Sub1_3.method2370(arg2);
			Static124.aClass2_Sub18_Sub1_3.method2369(arg0);
		}
		if (arg3 == 6) {
			Static124.aClass2_Sub18_Sub1_3.method2398(243);
			Static124.aClass2_Sub18_Sub1_3.method2370(arg2);
			Static124.aClass2_Sub18_Sub1_3.method2369(arg0);
		}
		if (arg3 == 7) {
			Static124.aClass2_Sub18_Sub1_3.method2398(154);
			Static124.aClass2_Sub18_Sub1_3.method2370(arg2);
			Static124.aClass2_Sub18_Sub1_3.method2369(arg0);
		}
		if (arg3 == 8) {
			Static124.aClass2_Sub18_Sub1_3.method2398(128);
			Static124.aClass2_Sub18_Sub1_3.method2370(arg2);
			Static124.aClass2_Sub18_Sub1_3.method2369(arg0);
		}
		if (arg3 == 9) {
			Static124.aClass2_Sub18_Sub1_3.method2398(212);
			Static124.aClass2_Sub18_Sub1_3.method2370(arg2);
			Static124.aClass2_Sub18_Sub1_3.method2369(arg0);
		}
		if (arg3 == 10) {
			Static124.aClass2_Sub18_Sub1_3.method2398(162);
			Static124.aClass2_Sub18_Sub1_3.method2370(arg2);
			Static124.aClass2_Sub18_Sub1_3.method2369(arg0);
		}
	}
}
