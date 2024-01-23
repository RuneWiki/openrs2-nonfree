import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "[[Lclient!gj;")
	public static Class4_Sub14[][] aClass4_Sub14ArrayArray2;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "[Lclient!cc;")
	public static Class22[] aClass22Array2;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
	public static int anInt1445 = 0;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString40 = "Unable to find ";

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1153(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static231.anInt4525; local16++) {
			if (arg0.equalsIgnoreCase(Static196.aStringArray31[local16])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static239.aClass12_Sub3_Sub2_2.aString132)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!g;)V")
	public static void method1154(@OriginalArg(1) Class12_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt4193 - Static104.anInt2226;
		@Pc(21) int local21 = arg0.anInt4128 * 128 + arg0.method3375() * 64;
		@Pc(33) int local33 = arg0.anInt4160 * 128 + arg0.method3375() * 64;
		arg0.anInt4164 = 0;
		arg0.anInt4113 += (local33 - arg0.anInt4113) / local9;
		if (arg0.anInt4172 == 0) {
			arg0.anInt4136 = 1024;
		}
		arg0.anInt4141 += (local21 - arg0.anInt4141) / local9;
		if (arg0.anInt4172 == 1) {
			arg0.anInt4136 = 1536;
		}
		if (arg0.anInt4172 == 2) {
			arg0.anInt4136 = 0;
		}
		if (arg0.anInt4172 == 3) {
			arg0.anInt4136 = 512;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method1155() {
		aString40 = null;
		aClass4_Sub14ArrayArray2 = null;
		aClass22Array2 = null;
		anImage1 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!p;I)V")
	public static void method1156(@OriginalArg(0) Class4_Sub17 arg0) {
		if (arg0.aByteArray30.length - arg0.anInt2400 < 1) {
			return;
		}
		@Pc(18) int local18 = arg0.method1874();
		if (local18 < 0 || local18 > 11) {
			return;
		}
		@Pc(32) byte local32;
		if (local18 == 11) {
			local32 = 33;
		} else if (local18 == 10) {
			local32 = 32;
		} else if (local18 == 9) {
			local32 = 31;
		} else if (local18 == 8) {
			local32 = 30;
		} else if (local18 == 7) {
			local32 = 29;
		} else if (local18 == 6) {
			local32 = 28;
		} else if (local18 == 5) {
			local32 = 28;
		} else if (local18 == 4) {
			local32 = 24;
		} else if (local18 == 3) {
			local32 = 23;
		} else if (local18 == 2) {
			local32 = 22;
		} else if (local18 == 1) {
			local32 = 23;
		} else {
			local32 = 19;
		}
		if (local32 > arg0.aByteArray30.length - arg0.anInt2400) {
			return;
		}
		Static165.anInt3301 = arg0.method1874();
		if (Static165.anInt3301 < 1) {
			Static165.anInt3301 = 1;
		} else if (Static165.anInt3301 > 4) {
			Static165.anInt3301 = 4;
		}
		Static240.method4000(arg0.method1874() == 1);
		Static73.aBoolean106 = arg0.method1874() == 1;
		Static114.aBoolean166 = arg0.method1874() == 1;
		Static238.aBoolean299 = arg0.method1874() == 1;
		Static182.aBoolean234 = arg0.method1874() == 1;
		Static268.aBoolean333 = arg0.method1874() == 1;
		Static105.aBoolean162 = arg0.method1874() == 1;
		Static171.aBoolean210 = arg0.method1874() == 1;
		Static18.anInt380 = arg0.method1874();
		if (Static18.anInt380 > 2) {
			Static18.anInt380 = 2;
		}
		if (local18 >= 2) {
			Static298.aBoolean357 = arg0.method1874() == 1;
		} else {
			Static298.aBoolean357 = arg0.method1874() == 1;
			arg0.method1874();
		}
		Static139.aBoolean188 = arg0.method1874() == 1;
		Static14.aBoolean154 = arg0.method1874() == 1;
		Static222.anInt4407 = arg0.method1874();
		if (Static222.anInt4407 > 2) {
			Static222.anInt4407 = 2;
		}
		Static218.anInt5374 = Static222.anInt4407;
		Static159.aBoolean203 = arg0.method1874() == 1;
		Static150.anInt3043 = arg0.method1874();
		if (Static150.anInt3043 > 127) {
			Static150.anInt3043 = 127;
		}
		Static52.anInt1043 = arg0.method1874();
		Static71.anInt1312 = arg0.method1874();
		if (Static71.anInt1312 > 127) {
			Static71.anInt1312 = 127;
		}
		if (local18 >= 1) {
			Static224.anInt4445 = arg0.method1837();
			Static176.anInt808 = arg0.method1837();
		}
		if (local18 >= 3 && local18 < 6) {
			arg0.method1874();
		}
		if (local18 >= 4) {
			@Pc(378) int local378 = arg0.method1874();
			if (Static193.anInt3800 < 96) {
				local378 = 0;
			}
			Static109.method1760(local378);
		}
		if (local18 >= 5) {
			Static11.anInt216 = arg0.method1889();
		}
		if (local18 >= 6) {
			Static116.anInt2573 = arg0.method1874();
		}
		if (local18 >= 7) {
			Static169.aBoolean209 = arg0.method1874() == 1;
		}
		if (local18 >= 8) {
			Static74.aBoolean115 = arg0.method1874() == 1;
		}
		if (local18 >= 9) {
			Static86.anInt1777 = arg0.method1874();
		}
		if (local18 >= 10) {
			Static92.aBoolean144 = arg0.method1874() != 0;
		}
		if (local18 >= 11) {
			Static266.aBoolean331 = arg0.method1874() != 0;
		}
	}
}
