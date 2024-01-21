import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!rg", name = "rb", descriptor = "Lclient!fg;")
	public static Class33 aClass33_3;

	@OriginalMember(owner = "client!rg", name = "sb", descriptor = "I")
	public static int anInt3404;

	@OriginalMember(owner = "client!rg", name = "vb", descriptor = "I")
	public static int anInt3406;

	@OriginalMember(owner = "client!rg", name = "bb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1623 = Static193.method3027("<img=0>");

	@OriginalMember(owner = "client!rg", name = "eb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1624 = Static193.method3027("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!rg", name = "jb", descriptor = "I")
	public static int anInt3400 = -1;

	@OriginalMember(owner = "client!rg", name = "tb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1628 = Static193.method3027("flash3:");

	@OriginalMember(owner = "client!rg", name = "mb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1625 = aClass70_1628;

	@OriginalMember(owner = "client!rg", name = "nb", descriptor = "I")
	public static int anInt3403 = 0;

	@OriginalMember(owner = "client!rg", name = "ob", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1626 = Static193.method3027("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!rg", name = "pb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1627 = aClass70_1628;

	@OriginalMember(owner = "client!rg", name = "qb", descriptor = "[Lclient!md;")
	public static final Class26_Sub5[] aClass26_Sub5Array1 = new Class26_Sub5[4];

	@OriginalMember(owner = "client!rg", name = "ub", descriptor = "I")
	public static int anInt3405 = -1;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
	public static void method2485(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static201.anInt4110; local12++) {
			@Pc(20) Class26_Sub2_Sub2 local20 = Static8.aClass26_Sub2_Sub2Array1[Static80.anIntArray85[local12]];
			@Pc(29) long local29 = (long) Static80.anIntArray85[local12] << 32 | 0x20000000L;
			if (local20 != null && local20.method1861() && arg0 == local20.aClass3_Sub3_Sub24_1.aBoolean176 && local20.aClass3_Sub3_Sub24_1.method3064()) {
				@Pc(54) int local54 = local20.anInt2593 >> 7;
				@Pc(59) int local59 = local20.anInt2611 >> 7;
				if (local54 >= 0 && local54 < 104 && local59 >= 0 && local59 < 104) {
					if (local20.anInt2604 == 1 && (local20.anInt2593 & 0x7F) == 64 && (local20.anInt2611 & 0x7F) == 64) {
						if (Static118.anIntArrayArray15[local54][local59] == Static139.anInt4130) {
							continue;
						}
						Static118.anIntArrayArray15[local54][local59] = Static139.anInt4130;
					}
					if (!local20.aClass3_Sub3_Sub24_1.aBoolean177) {
						local29 |= Long.MIN_VALUE;
					}
					local20.anInt2636 = Static107.method2399(local20.anInt2611 + (local20.anInt2604 - 1) * 64, (local20.anInt2604 + -1) * 64 + local20.anInt2593, Static137.anInt2795);
					Static200.method3182(Static137.anInt2795, local20.anInt2593, local20.anInt2611, local20.anInt2636, local20.anInt2604 * 64 + 60 - 64, local20, local20.anInt2605, local29, local20.aBoolean129);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)[B")
	public static byte[] method2486(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub3_Sub5 local12 = (Class3_Sub3_Sub5) Static54.aClass85_9.method2558((long) arg0);
		if (local12 == null) {
			@Pc(28) Random local28 = new Random((long) arg0);
			@Pc(31) byte[] local31 = new byte[512];
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local31[local33] = (byte) local33;
			}
			for (@Pc(48) int local48 = 0; local48 < 255; local48++) {
				@Pc(54) int local54 = 255 - local48;
				@Pc(59) int local59 = Static13.method273(local28, local54);
				@Pc(63) byte local63 = local31[local59];
				local31[local59] = local31[local54];
				local31[local54] = local31[511 - local48] = local63;
			}
			local12 = new Class3_Sub3_Sub5(local31);
			Static54.aClass85_9.method2560(local12, (long) arg0);
		}
		return local12.aByteArray4;
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(B)V")
	public static void method2488() {
		Static54.anInt1164 = 0;
		Static134.anInt2682 = 0;
		Static55.method879();
		Static55.method880();
		Static110.method1586();
		Static44.method727();
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static54.anInt1164; local25++) {
			local31 = Static160.anIntArray244[local25];
			if (Static184.anInt3760 != Static146.aClass26_Sub2_Sub1Array1[local31].anInt2645) {
				Static146.aClass26_Sub2_Sub1Array1[local31] = null;
			}
		}
		if (Static48.aClass3_Sub4_Sub1_43.anInt1758 != Static192.anInt3908) {
			throw new RuntimeException("gpp1 pos:" + Static48.aClass3_Sub4_Sub1_43.anInt1758 + " psize:" + Static192.anInt3908);
		}
		for (local31 = 0; local31 < Static80.anInt1607; local31++) {
			if (Static146.aClass26_Sub2_Sub1Array1[Static76.anIntArray81[local31]] == null) {
				throw new RuntimeException("gpp2 pos:" + local31 + " size:" + Static80.anInt1607);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
	public static void method2489() {
		Static199.aBoolean183 = true;
		Static25.anInt537 = 0;
		Static68.aBoolean84 = true;
		Static34.aClass46_1.anInt1967 = 0;
		Static129.aLong76 = 0L;
		Static41.method679();
		Static139.anInt4131 = 0;
		Static82.anInt1626 = 0;
		Static190.anInt3871 = -1;
		Static155.anInt3189 = -1;
		Static141.anInt2853 = -1;
		Static121.anInt2459 = -1;
		Static193.anInt3931 = 0;
		Static93.aClass3_Sub4_Sub1_18.anInt1758 = 0;
		Static48.aClass3_Sub4_Sub1_43.anInt1758 = 0;
		for (@Pc(2602) int local2602 = 0; local2602 < Static192.aClass42Array1.length; local2602++) {
			Static192.aClass42Array1[local2602] = null;
		}
		Static134.aBoolean131 = false;
		Static35.anInt770 = 0;
		Static184.method2899(0);
		for (@Pc(2628) int local2628 = 0; local2628 < 100; local2628++) {
			Static25.aClass70Array10[local2628] = null;
		}
		Static65.anInt1365 = 0;
		Static5.aBoolean7 = false;
		Static45.anInt953 = 0;
		Static210.anInt4244 = 0;
		Static201.anInt4110 = 0;
		Static26.anInt551 = 0;
		Static212.anInt4284 = (int) (Math.random() * 30.0D) - 20;
		Static191.anInt3886 = -1;
		Static124.anInt3872 = (int) (Math.random() * 80.0D) - 40;
		Static62.anInt1310 = (int) (Math.random() * 120.0D) - 60;
		Static101.anInt2072 = 0;
		Static105.anInt2111 = (int) (Math.random() * 100.0D) - 50;
		Static179.anInt1329 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static211.anInt4256 = 0;
		Static198.anInt4041 = (int) (Math.random() * 110.0D) - 55;
		Static80.anInt1607 = 0;
		for (@Pc(2704) int local2704 = 0; local2704 < 2048; local2704++) {
			Static146.aClass26_Sub2_Sub1Array1[local2704] = null;
			Static134.aClass3_Sub4Array1[local2704] = null;
		}
		for (@Pc(2720) int local2720 = 0; local2720 < 32768; local2720++) {
			Static8.aClass26_Sub2_Sub2Array1[local2720] = null;
		}
		Static144.aClass26_Sub2_Sub1_1 = Static146.aClass26_Sub2_Sub1Array1[2047] = new Class26_Sub2_Sub1();
		Static157.aClass10_90.method262();
		Static153.aClass10_85.method262();
		@Pc(2752) int local2752;
		@Pc(2756) int local2756;
		for (@Pc(2748) int local2748 = 0; local2748 < 4; local2748++) {
			for (local2752 = 0; local2752 < 104; local2752++) {
				for (local2756 = 0; local2756 < 104; local2756++) {
					Static29.aClass10ArrayArrayArray1[local2748][local2752][local2756] = null;
				}
			}
		}
		Static95.aClass10_53 = new Class10();
		Static13.anInt318 = 0;
		Static83.anInt1648 = 0;
		for (local2752 = 0; local2752 < Static33.anInt722; local2752++) {
			@Pc(2800) Class3_Sub3_Sub6 local2800 = Static85.method1229(local2752);
			if (local2800 != null && local2800.anInt769 == 0) {
				Static124.anIntArray331[local2752] = 0;
				Static16.anIntArray27[local2752] = 0;
			}
		}
		for (local2756 = 0; local2756 < Static132.anIntArray179.length; local2756++) {
			Static132.anIntArray179[local2756] = -1;
		}
		if (Static63.anInt1331 != -1) {
			Static24.method1241(Static63.anInt1331);
		}
		for (@Pc(2849) Class3_Sub10 local2849 = (Class3_Sub10) Static144.aClass40_9.method1026(); local2849 != null; local2849 = (Class3_Sub10) Static144.aClass40_9.method1024()) {
			Static151.method2214(local2849, true);
		}
		Static63.anInt1331 = -1;
		Static144.aClass40_9 = new Class40(8);
		Static35.anInt770 = 0;
		Static134.aBoolean131 = false;
		Static72.aClass6_40 = null;
		Static109.aClass101_2.method3308(false, -1, new int[5], null);
		for (@Pc(2889) int local2889 = 0; local2889 < 8; local2889++) {
			Static124.aClass70Array71[local2889] = null;
			Static36.aBooleanArray1[local2889] = false;
		}
		Static30.method557();
		Static130.aBoolean128 = true;
		for (@Pc(2909) int local2909 = 0; local2909 < 100; local2909++) {
			Static165.aBooleanArray14[local2909] = true;
		}
		Static34.aClass70_346 = null;
		Static144.anInt2952 = 0;
		Static86.aClass3_Sub13Array1 = null;
		for (@Pc(2929) int local2929 = 0; local2929 < 6; local2929++) {
			Static29.aClass27Array1[local2929] = new Class27();
		}
		for (@Pc(2945) int local2945 = 0; local2945 < 25; local2945++) {
			Static111.anIntArray138[local2945] = 0;
			Static149.anIntArray220[local2945] = 0;
			Static11.anIntArray24[local2945] = 0;
		}
		Static45.aClass70_472 = Static207.aClass70_2084;
		Static8.aBoolean10 = true;
		Static124.aShortArray62 = Static207.aShortArray68 = Static116.aShortArray55 = new short[256];
	}
}
