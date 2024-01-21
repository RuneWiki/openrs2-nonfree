import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public static int anInt1848 = -1;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!sc;")
	private static Class66 aClass66_966 = Static106.method1849("as it was used to break our rules)3");

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!sc;")
	public static Class66 aClass66_964 = aClass66_966;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!sc;")
	public static Class66 aClass66_965 = Static106.method1849("Schlie-8en");

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	public static int anInt1850 = 0;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Lclient!sc;")
	public static Class66 aClass66_967 = Static106.method1849("sl_flags");

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "Lclient!sc;")
	public static Class66 aClass66_968 = Static106.method1849("nav");

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "Lclient!sc;")
	public static Class66 aClass66_969 = Static106.method1849(")1");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public static void method1295() {
		@Pc(10) int local10 = Static130.anInt2921 * 128 + 64;
		@Pc(16) int local16 = Static20.anInt619 * 128 + 64;
		@Pc(29) int local29 = Static77.method1476(local10, Static22.anInt635, local16) - Static55.anInt1766;
		if (local16 > Static122.anInt2830) {
			Static122.anInt2830 += Static11.anInt391 + (local16 - Static122.anInt2830) * Static116.anInt2726 / 1000;
			if (local16 < Static122.anInt2830) {
				Static122.anInt2830 = local16;
			}
		}
		if (Static1.anInt70 < local10) {
			Static1.anInt70 += Static116.anInt2726 * (local10 - Static1.anInt70) / 1000 + Static11.anInt391;
			if (local10 < Static1.anInt70) {
				Static1.anInt70 = local10;
			}
		}
		if (local16 < Static122.anInt2830) {
			Static122.anInt2830 -= Static11.anInt391 + (Static122.anInt2830 - local16) * Static116.anInt2726 / 1000;
			if (Static122.anInt2830 < local16) {
				Static122.anInt2830 = local16;
			}
		}
		if (local29 > Static51.anInt1580) {
			Static51.anInt1580 += (local29 - Static51.anInt1580) * Static116.anInt2726 / 1000 + Static11.anInt391;
			if (Static51.anInt1580 > local29) {
				Static51.anInt1580 = local29;
			}
		}
		local16 = Static50.anInt1533 * 128 + 64;
		if (Static51.anInt1580 > local29) {
			Static51.anInt1580 -= (Static51.anInt1580 - local29) * Static116.anInt2726 / 1000 + Static11.anInt391;
			if (local29 > Static51.anInt1580) {
				Static51.anInt1580 = local29;
			}
		}
		if (local10 < Static1.anInt70) {
			Static1.anInt70 -= Static11.anInt391 + Static116.anInt2726 * (Static1.anInt70 - local10) / 1000;
			if (Static1.anInt70 < local10) {
				Static1.anInt70 = local10;
			}
		}
		local10 = Static108.anInt177 * 128 + 64;
		local29 = Static77.method1476(local10, Static22.anInt635, local16) - Static117.anInt2742;
		@Pc(205) int local205 = local16 - Static122.anInt2830;
		@Pc(210) int local210 = local29 - Static51.anInt1580;
		@Pc(215) int local215 = local10 - Static1.anInt70;
		@Pc(226) int local226 = (int) Math.sqrt((double) (local205 * local205 + local215 * local215));
		@Pc(237) int local237 = (int) (Math.atan2((double) local210, (double) local226) * 325.949D) & 0x7FF;
		if (local237 < 128) {
			local237 = 128;
		}
		if (local237 > 383) {
			local237 = 383;
		}
		@Pc(260) int local260 = (int) (Math.atan2((double) local205, (double) local215) * -325.949D) & 0x7FF;
		if (local237 > Static131.anInt2696) {
			Static131.anInt2696 += (local237 - Static131.anInt2696) * Static103.anInt2545 / 1000 + Static131.anInt2698;
			if (Static131.anInt2696 > local237) {
				Static131.anInt2696 = local237;
			}
		}
		@Pc(294) int local294 = local260 - Static1.anInt76;
		if (local294 > 1024) {
			local294 -= 2048;
		}
		if (Static131.anInt2696 > local237) {
			Static131.anInt2696 -= (Static131.anInt2696 - local237) * Static103.anInt2545 / 1000 + Static131.anInt2698;
			if (local237 > Static131.anInt2696) {
				Static131.anInt2696 = local237;
			}
		}
		if (local294 < -1024) {
			local294 += 2048;
		}
		if (local294 > 0) {
			Static1.anInt76 += Static131.anInt2698 + Static103.anInt2545 * local294 / 1000;
			Static1.anInt76 &= 0x7FF;
		}
		if (local294 < 0) {
			Static1.anInt76 -= -local294 * Static103.anInt2545 / 1000 + Static131.anInt2698;
			Static1.anInt76 &= 0x7FF;
		}
		@Pc(373) int local373 = local260 - Static1.anInt76;
		if (local373 > 1024) {
			local373 -= 2048;
		}
		if (local373 < -1024) {
			local373 += 2048;
		}
		if (local373 < 0 && local294 > 0 || local373 > 0 && local294 < 0) {
			Static1.anInt76 = local260;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method1296() {
		aClass66_965 = null;
		aClass66_966 = null;
		aClass66_968 = null;
		aClass66_967 = null;
		aClass66_969 = null;
		aClass66_964 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!m;I)V")
	public static void method1297(@OriginalArg(0) Class1_Sub9 arg0) {
		if (arg0.aClass1_Sub14_5 != null) {
			arg0.aClass1_Sub14_5.anInt2720 = 0;
		}
		arg0.aBoolean94 = false;
		for (@Pc(18) Class1_Sub9 local18 = arg0.method1549(); local18 != null; local18 = arg0.method1552()) {
			method1297(local18);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)V")
	public static void method1298(@OriginalArg(1) boolean arg0) {
		Static5.method159();
		Static134.anInt2952++;
		if (Static134.anInt2952 < 50 && !arg0) {
			return;
		}
		Static134.anInt2952 = 0;
		if (Static14.aBoolean19 || Static49.aClass34_3 == null) {
			return;
		}
		Static127.aClass1_Sub12_Sub1_2.method1227(152);
		try {
			Static49.aClass34_3.method1098(Static127.aClass1_Sub12_Sub1_2.aByteArray12, Static127.aClass1_Sub12_Sub1_2.anInt1694);
			Static127.aClass1_Sub12_Sub1_2.anInt1694 = 0;
		} catch (@Pc(49) IOException local49) {
			Static14.aBoolean19 = true;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!sc;)Z")
	public static boolean method1299(@OriginalArg(1) Class66 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static27.anInt730; local16++) {
			if (arg0.method1843(Static88.aClass66Array20[local16])) {
				return true;
			}
		}
		return arg0.method1843(Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass66_707);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Z")
	public static boolean method1300(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
