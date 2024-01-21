import java.awt.FontMetrics;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics2;

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_6;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray26 = new int[104][104];

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_309 = Static56.method1206("backvmid1");

	@OriginalMember(owner = "client!pd", name = "ob", descriptor = "Lclient!lc;")
	public static Class31 aClass31_310 = Static56.method1206("overlay_multiway");

	@OriginalMember(owner = "client!pd", name = "Jb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_311 = Static56.method1206("Sep");

	@OriginalMember(owner = "client!pd", name = "Nb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_312 = Static56.method1206("Loading sprites )2 ");

	@OriginalMember(owner = "client!pd", name = "Ob", descriptor = "Lclient!ac;")
	public static Class4 aClass4_2 = new Class4();

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "(I)V")
	public static void method634() {
		Static14.aClass17_23.method782();
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(Z)V")
	public static void method655() {
		aClass31_310 = null;
		aClass4_2 = null;
		aCRC32_2 = null;
		aClass11_Sub1_6 = null;
		aClass31_312 = null;
		anIntArrayArray26 = null;
		aClass31_309 = null;
		aFontMetrics2 = null;
		aClass31_311 = null;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
	public static void method661() {
		Static7.aClass17_12.method782();
		Static56.aClass17_71.method782();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z")
	public static boolean method675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 == Static17.anInt792) {
			return true;
		} else if (arg0 == 1 && Static103.anInt2764 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static75.anInt2244;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIBII)V")
	public static void method676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
			return;
		}
		if (Static10.aBoolean28 && Static58.anInt1945 != arg4) {
			return;
		}
		@Pc(37) int local37 = 0;
		if (arg5 == 0) {
			local37 = Static99.aClass64_1.method1757(arg4, arg2, arg3);
		}
		if (arg5 == 1) {
			local37 = Static99.aClass64_1.method1755(arg4, arg2, arg3);
		}
		if (arg5 == 2) {
			local37 = Static99.aClass64_1.method1795(arg4, arg2, arg3);
		}
		if (arg5 == 3) {
			local37 = Static99.aClass64_1.method1768(arg4, arg2, arg3);
		}
		@Pc(100) int local100;
		if (local37 != 0) {
			@Pc(93) int local93 = local37 >> 14 & 0x7FFF;
			local100 = Static99.aClass64_1.method1802(arg4, arg2, arg3, local37);
			@Pc(106) int local106 = local100 >> 6 & 0x3;
			@Pc(110) int local110 = local100 & 0x1F;
			@Pc(124) Class2_Sub1_Sub16 local124;
			if (arg5 == 0) {
				Static99.aClass64_1.method1794(arg4, arg2, arg3);
				local124 = Static92.method1045(local93);
				if (local124.aBoolean144) {
					Static77.aClass60Array1[arg4].method1730(arg2, local110, local124.aBoolean145, local106, arg3);
				}
			}
			if (arg5 == 1) {
				Static99.aClass64_1.method1772(arg4, arg2, arg3);
			}
			if (arg5 == 2) {
				Static99.aClass64_1.method1759(arg4, arg2, arg3);
				local124 = Static92.method1045(local93);
				if (local124.anInt2698 + arg2 > 103 || local124.anInt2698 + arg3 > 103 || local124.anInt2699 + arg2 > 103 || arg3 + local124.anInt2699 > 103) {
					return;
				}
				if (local124.aBoolean144) {
					Static77.aClass60Array1[arg4].method1727(local124.anInt2698, arg3, local124.anInt2699, local106, local124.aBoolean145, arg2);
				}
			}
			if (arg5 == 3) {
				Static99.aClass64_1.method1774(arg4, arg2, arg3);
				local124 = Static92.method1045(local93);
				if (local124.aBoolean144 && local124.anInt2722 == 1) {
					Static77.aClass60Array1[arg4].method1733(arg2, arg3);
				}
			}
		}
		if (arg6 < 0) {
			return;
		}
		local100 = arg4;
		if (arg4 < 3 && (Static34.aByteArrayArrayArray17[1][arg2][arg3] & 0x2) == 2) {
			local100 = arg4 + 1;
		}
		Static4.method102(local100, arg2, Static77.aClass60Array1[arg4], arg6, arg4, arg0, Static99.aClass64_1, arg1, arg3);
		return;
	}
}
