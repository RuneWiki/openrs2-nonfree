import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1624 = Static32.method683(")2");

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1625 = Static32.method683("Mitglieder)2Welt");

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1626 = Static32.method683("sl_arrows");

	@OriginalMember(owner = "client!ub", name = "X", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1627 = Static32.method683("No response from server)3");

	@OriginalMember(owner = "client!ub", name = "Y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1628 = Static32.method683("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1629 = aClass49_1627;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	public static void method2765() {
		Static37.aClass74_30.method2347();
		Static150.aClass74_82.method2347();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
	public static void method2766() {
		aBooleanArray17 = null;
		aClass49_1628 = null;
		aClass49_1627 = null;
		aClass49_1629 = null;
		aClass49_1626 = null;
		aClass49_1625 = null;
		aClass49_1624 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V")
	public static void method2768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class47 local13 = local7.aClass47_1;
		if (local13 != null) {
			local13.anInt1943 = local13.anInt1943 * arg3 / 16;
			local13.anInt1944 = local13.anInt1944 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
	public static void method2769(@OriginalArg(1) int arg0) {
		Static8.method1803();
		Static178.method2906();
		@Pc(14) int local14 = Static155.method2620(arg0).anInt1421;
		if (local14 == 0) {
			return;
		}
		@Pc(21) int local21 = Static165.anIntArray317[arg0];
		if (local14 == 1) {
			Static29.anInt715 = local21;
			if (Static29.anInt715 == 1) {
				Static109.method1874(0.9F);
			}
			if (Static29.anInt715 == 2) {
				Static109.method1874(0.8F);
			}
			if (Static29.anInt715 == 3) {
				Static109.method1874(0.7F);
			}
			if (Static29.anInt715 == 4) {
				Static109.method1874(0.6F);
			}
			Static94.method1610();
		}
		if (local14 == 3) {
			@Pc(65) short local65 = 0;
			if (local21 == 0) {
				local65 = 255;
			}
			if (local21 == 1) {
				local65 = 192;
			}
			if (local21 == 2) {
				local65 = 128;
			}
			if (local21 == 3) {
				local65 = 64;
			}
			if (local21 == 4) {
				local65 = 0;
			}
			if (local65 != Static156.anInt3412) {
				if (Static156.anInt3412 == 0 && Static116.anInt2424 != -1) {
					Static15.method217(0, local65, Static116.anInt2424, Static91.aClass11_Sub1_23);
					Static33.aBoolean32 = false;
				} else if (local65 == 0) {
					Static127.method2155();
					Static33.aBoolean32 = false;
				} else {
					Static20.method393(local65);
				}
				Static156.anInt3412 = local65;
			}
		}
		if (local14 == 4) {
			if (local21 == 0) {
				Static9.anInt167 = 127;
			}
			if (local21 == 1) {
				Static9.anInt167 = 96;
			}
			if (local21 == 2) {
				Static9.anInt167 = 64;
			}
			if (local21 == 3) {
				Static9.anInt167 = 32;
			}
			if (local21 == 4) {
				Static9.anInt167 = 0;
			}
		}
		if (local14 == 9) {
			Static12.anInt224 = local21;
		}
		if (local14 == 6) {
			Static50.anInt1152 = local21;
		}
		if (local14 == 10) {
			if (local21 == 0) {
				Static150.anInt3220 = 127;
			}
			if (local21 == 1) {
				Static150.anInt3220 = 96;
			}
			if (local21 == 2) {
				Static150.anInt3220 = 64;
			}
			if (local21 == 3) {
				Static150.anInt3220 = 32;
			}
			if (local21 == 4) {
				Static150.anInt3220 = 0;
			}
		}
		if (local14 == 5) {
			Static111.anInt2307 = local21;
		}
	}
}
