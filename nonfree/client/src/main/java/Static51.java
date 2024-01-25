import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString52 = "Loading textures - ";

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!hk;")
	public static final Class14_Sub17 aClass14_Sub17_1 = new Class14_Sub17(0, -1);

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!bd;")
	public static final Class18 aClass18_3 = new Class18();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!ne;)Z")
	public static boolean method1232(@OriginalArg(1) Class146 arg0) {
		if (arg0.anIntArray369 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray369.length; local12++) {
			@Pc(19) int local19 = Static143.method2886(arg0, local12);
			@Pc(24) int local24 = arg0.anIntArray362[local12];
			if (arg0.anIntArray369[local12] == 2) {
				if (local24 <= local19) {
					return false;
				}
			} else if (arg0.anIntArray369[local12] == 3) {
				if (local24 >= local19) {
					return false;
				}
			} else if (arg0.anIntArray369[local12] == 4) {
				if (local19 == local24) {
					return false;
				}
			} else if (local19 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Z")
	public static boolean method1233() {
		if (Static76.aBoolean124) {
			try {
				if ((Boolean) Static356.method171(Static105.aClass15_2.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
	public static void method1234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static304.anInt5859; local3++) {
			@Pc(9) Rectangle local9 = Class14_Sub2_Sub17.aRectangleArray4[local3];
			if (local9.width + local9.x > arg0 && arg3 + arg0 > local9.x && arg2 < local9.height + local9.y && local9.y < arg1 + arg2) {
				Static194.aBooleanArray17[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method1236() {
		if (Static302.anInt5842 == 10) {
			Static67.method1662(28);
		}
		if (Static302.anInt5842 == 30) {
			Static67.method1662(25);
		}
	}
}
