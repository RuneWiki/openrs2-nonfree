import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!m", name = "N", descriptor = "[Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3[] aClass1_Sub3_Sub1_Sub3Array5;

	@OriginalMember(owner = "client!m", name = "eb", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!m", name = "ib", descriptor = "Lclient!ud;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!m", name = "lb", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_12;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "Lclient!af;")
	public static Class5 aClass5_847 = Static45.method1937("huffman");

	@OriginalMember(owner = "client!m", name = "H", descriptor = "I")
	public static int anInt1720 = 0;

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "Lclient!af;")
	private static Class5 aClass5_854 = Static45.method1937("white:");

	@OriginalMember(owner = "client!m", name = "K", descriptor = "Lclient!af;")
	public static Class5 aClass5_848 = aClass5_854;

	@OriginalMember(owner = "client!m", name = "L", descriptor = "Lclient!af;")
	public static Class5 aClass5_849 = Static45.method1937("sl_back");

	@OriginalMember(owner = "client!m", name = "P", descriptor = "I")
	public static int anInt1725 = 0;

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "Lclient!af;")
	public static Class5 aClass5_850 = Static45.method1937("(U5");

	@OriginalMember(owner = "client!m", name = "U", descriptor = "Lclient!af;")
	public static Class5 aClass5_851 = null;

	@OriginalMember(owner = "client!m", name = "X", descriptor = "Lclient!af;")
	public static Class5 aClass5_852 = Static45.method1937("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "Lclient!af;")
	public static Class5 aClass5_853 = Static45.method1937("mn");

	@OriginalMember(owner = "client!m", name = "fb", descriptor = "Lclient!af;")
	public static Class5 aClass5_855 = aClass5_854;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZZ)V")
	public static void method1274(@OriginalArg(1) boolean arg0) {
		@Pc(7) int local7 = Static111.anInt2739;
		if (arg0) {
			local7 = 1;
		}
		if (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 >> 7 == Static39.anInt1037 && Static75.anInt1750 == Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 >> 7) {
			Static39.anInt1037 = 0;
		}
		for (@Pc(27) int local27 = 0; local27 < local7; local27++) {
			@Pc(37) Class1_Sub3_Sub4_Sub2_Sub1 local37;
			@Pc(43) int local43;
			if (arg0) {
				local43 = 33538048;
				local37 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1;
			} else {
				local37 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[Static77.anIntArray299[local27]];
				local43 = Static77.anIntArray299[local27] << 14;
			}
			if (local37 != null && local37.method2159()) {
				@Pc(60) int local60 = local37.anInt3089 >> 7;
				local37.aBoolean67 = false;
				if ((Static79.aBoolean64 && Static111.anInt2739 > 50 || Static111.anInt2739 > 200) && !arg0 && local37.anInt3087 == local37.anInt3051) {
					local37.aBoolean67 = true;
				}
				@Pc(88) int local88 = local37.anInt3079 >> 7;
				if (local60 >= 0 && local60 < 104 && local88 >= 0 && local88 < 104) {
					if (local37.aClass1_Sub3_Sub4_Sub4_3 == null || local37.anInt1990 > Static131.anInt3270 || Static131.anInt3270 >= local37.anInt1991) {
						if ((local37.anInt3089 & 0x7F) == 64 && (local37.anInt3079 & 0x7F) == 64) {
							if (Static3.anIntArrayArray5[local60][local88] == Static122.anInt3127) {
								continue;
							}
							Static3.anIntArrayArray5[local60][local88] = Static122.anInt3127;
						}
						local37.anInt1989 = Static102.method1746(local37.anInt3079, Static7.anInt213, local37.anInt3089);
						Static44.aClass68_1.method1863(Static7.anInt213, local37.anInt3089, local37.anInt3079, local37.anInt1989, 60, local37, local37.anInt3073, local43, local37.aBoolean116);
					} else {
						local37.aBoolean67 = false;
						local37.anInt1989 = Static102.method1746(local37.anInt3079, Static7.anInt213, local37.anInt3089);
						Static44.aClass68_1.method1831(Static7.anInt213, local37.anInt3089, local37.anInt3079, local37.anInt1989, local37, local37.anInt3073, local43, local37.anInt2004, local37.anInt1988, local37.anInt1992, local37.anInt2011);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)Z")
	public static boolean method1275(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public static void method1276() {
		aClass5_849 = null;
		aClass1_Sub3_Sub1_Sub3Array5 = null;
		aClass5_853 = null;
		aClass5_848 = null;
		aClass5_851 = null;
		aClass5_852 = null;
		aClass50_1 = null;
		aClass5_847 = null;
		aClass41_Sub1_12 = null;
		aClass5_850 = null;
		aClass5_855 = null;
		anImage2 = null;
		aClass5_854 = null;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
	public static void method1277() {
		@Pc(9) int local9 = Static124.anInt3187 * 128 + 64;
		@Pc(15) int local15 = Static120.anInt1842 * 128 + 64;
		@Pc(25) int local25 = Static102.method1746(local15, Static7.anInt213, local9) - Static40.anInt1051;
		if (local15 > Static121.anInt3115) {
			Static121.anInt3115 += Static47.anInt1135 + Static111.anInt2735 * (local15 - Static121.anInt3115) / 1000;
			if (Static121.anInt3115 > local15) {
				Static121.anInt3115 = local15;
			}
		}
		if (Static66.anInt3170 < local9) {
			Static66.anInt3170 += Static47.anInt1135 + (local9 - Static66.anInt3170) * Static111.anInt2735 / 1000;
			if (local9 < Static66.anInt3170) {
				Static66.anInt3170 = local9;
			}
		}
		if (local9 < Static66.anInt3170) {
			Static66.anInt3170 -= (Static66.anInt3170 - local9) * Static111.anInt2735 / 1000 + Static47.anInt1135;
			if (Static66.anInt3170 < local9) {
				Static66.anInt3170 = local9;
			}
		}
		local9 = Static16.anInt473 * 128 + 64;
		if (Static91.anInt2286 < local25) {
			Static91.anInt2286 += Static47.anInt1135 + Static111.anInt2735 * (local25 - Static91.anInt2286) / 1000;
			if (local25 < Static91.anInt2286) {
				Static91.anInt2286 = local25;
			}
		}
		if (local25 < Static91.anInt2286) {
			Static91.anInt2286 -= (Static91.anInt2286 - local25) * Static111.anInt2735 / 1000 + Static47.anInt1135;
			if (local25 > Static91.anInt2286) {
				Static91.anInt2286 = local25;
			}
		}
		if (local15 < Static121.anInt3115) {
			Static121.anInt3115 -= Static47.anInt1135 + (Static121.anInt3115 - local15) * Static111.anInt2735 / 1000;
			if (local15 > Static121.anInt3115) {
				Static121.anInt3115 = local15;
			}
		}
		local15 = Static117.anInt3219 * 128 + 64;
		local25 = Static102.method1746(local15, Static7.anInt213, local9) - Static68.anInt1575;
		@Pc(209) int local209 = local25 - Static91.anInt2286;
		@Pc(214) int local214 = local9 - Static66.anInt3170;
		@Pc(219) int local219 = local15 - Static121.anInt3115;
		@Pc(230) int local230 = (int) Math.sqrt((double) (local219 * local219 + local214 * local214));
		@Pc(241) int local241 = (int) (Math.atan2((double) local209, (double) local230) * 325.949D) & 0x7FF;
		@Pc(252) int local252 = (int) (Math.atan2((double) local214, (double) local219) * -325.949D) & 0x7FF;
		if (local241 < 128) {
			local241 = 128;
		}
		@Pc(264) int local264 = local252 - Static76.anInt1794;
		if (local241 > 383) {
			local241 = 383;
		}
		if (Static109.anInt2693 < local241) {
			Static109.anInt2693 += Static68.anInt1581 + (local241 - Static109.anInt2693) * Static71.anInt1634 / 1000;
			if (local241 < Static109.anInt2693) {
				Static109.anInt2693 = local241;
			}
		}
		if (local241 < Static109.anInt2693) {
			Static109.anInt2693 -= Static68.anInt1581 + Static71.anInt1634 * (Static109.anInt2693 - local241) / 1000;
			if (local241 > Static109.anInt2693) {
				Static109.anInt2693 = local241;
			}
		}
		if (local264 > 1024) {
			local264 -= 2048;
		}
		if (local264 < -1024) {
			local264 += 2048;
		}
		if (local264 > 0) {
			Static76.anInt1794 += local264 * Static71.anInt1634 / 1000 + Static68.anInt1581;
			Static76.anInt1794 &= 0x7FF;
		}
		if (local264 < 0) {
			Static76.anInt1794 -= Static68.anInt1581 + -local264 * Static71.anInt1634 / 1000;
			Static76.anInt1794 &= 0x7FF;
		}
		@Pc(367) int local367 = local252 - Static76.anInt1794;
		if (local367 > 1024) {
			local367 -= 2048;
		}
		if (local367 < -1024) {
			local367 += 2048;
		}
		if (local367 < 0 && local264 > 0 || local367 > 0 && local264 < 0) {
			Static76.anInt1794 = local252;
		}
	}
}
