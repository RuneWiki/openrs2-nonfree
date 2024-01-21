import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "Lclient!c;")
	public static Class10 aClass10_12;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "[[I")
	public static int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "Lclient!lb;")
	public static Class45 aClass45_6 = new Class45();

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "Lclient!od;")
	private static Class60 aClass60_328 = Static41.method597("Please reload this page)3");

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "Lclient!od;")
	public static Class60 aClass60_327 = aClass60_328;

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
	public static int anInt939 = 0;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
	public static int anInt940 = 0;

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "Lclient!od;")
	private static Class60 aClass60_329 = Static41.method597("Too many connections from your address)3");

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "Lclient!od;")
	public static Class60 aClass60_330 = Static41.method597("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
	public static int anInt941 = 0;

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "[Lclient!od;")
	public static Class60[] aClass60Array4 = new Class60[200];

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "Lclient!od;")
	public static Class60 aClass60_331 = aClass60_329;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
	public static int anInt942 = 0;

	@OriginalMember(owner = "client!ef", name = "X", descriptor = "Lclient!od;")
	public static Class60 aClass60_332 = Static41.method597("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lclient!od;")
	public static Class60 aClass60_333 = Static41.method597("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	public static void method493() {
		aClass60_330 = null;
		aClass10_12 = null;
		aClass45_6 = null;
		aClass60_331 = null;
		aClass60Array4 = null;
		aClass60_333 = null;
		aClass60_332 = null;
		anIntArrayArray22 = null;
		aClass60_328 = null;
		aClass60_327 = null;
		aClass60_329 = null;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
	public static void method495() {
		for (@Pc(13) int local13 = -1; local13 < Static125.anInt2830; local13++) {
			@Pc(20) int local20;
			if (local13 == -1) {
				local20 = 2047;
			} else {
				local20 = Static118.anIntArray336[local13];
			}
			@Pc(30) Class4_Sub3_Sub1_Sub2_Sub1 local30 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local20];
			if (local30 != null) {
				Static24.method441(local30, 1);
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public static void method496(@OriginalArg(1) int arg0) {
		if (Static120.anInt2757 == arg0) {
			return;
		}
		if (Static120.anInt2757 == 0) {
			Static115.method1872();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static12.anInt2558 = 0;
			Static96.anInt2272 = 0;
			Static39.anInt1051 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static4.aClass37_1 != null) {
			Static4.aClass37_1.method877();
			Static4.aClass37_1 = null;
		}
		if (Static120.anInt2757 == 25) {
			Static30.anInt905 = 0;
			Static91.anInt2128 = 1;
			Static4.anInt56 = 0;
			Static14.anInt518 = 1;
			Static60.anInt2964 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static77.method1267(Static16.aClass10_Sub1_4, Static68.aClass10_Sub1_11, Static110.aCanvas1);
		} else {
			Static82.method1304();
		}
		Static120.anInt2757 = arg0;
	}
}
