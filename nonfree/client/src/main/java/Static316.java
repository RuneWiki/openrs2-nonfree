import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_37 = new Class211();

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	public static int anInt6045 = 0;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "[I")
	public static final int[] anIntArray516 = new int[100];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBIII)V")
	public static void method5375(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static169.anInt3450; local3++) {
			@Pc(9) Rectangle local9 = Class5_Sub3.aRectangleArray3[local3];
			if (local9.x + local9.width > arg1 && local9.x < arg3 + arg1 && arg0 < local9.height + local9.y && local9.y < arg0 + arg2) {
				Static293.aBooleanArray25[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZB)V")
	public static void method5376(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local9 = 1;
			local11 = Static353.aByteArrayArray25;
		} else {
			local9 = 4;
			local11 = Static210.aByteArrayArray21;
		}
		for (@Pc(25) int local25 = 0; local25 < local9; local25++) {
			Static153.method2894();
			for (@Pc(31) int local31 = 0; local31 < Static266.anInt5101 >> 3; local31++) {
				for (@Pc(35) int local35 = 0; local35 < Static339.anInt6352 >> 3; local35++) {
					@Pc(45) int local45 = Static118.anIntArrayArrayArray6[local25][local31][local35];
					if (local45 != -1) {
						@Pc(54) int local54 = local45 >> 24 & 0x3;
						if (!arg0 || local54 == 0) {
							@Pc(64) int local64 = local45 >> 1 & 0x3;
							@Pc(70) int local70 = local45 >> 14 & 0x3FF;
							@Pc(76) int local76 = local45 >> 3 & 0x7FF;
							@Pc(86) int local86 = local76 / 8 + (local70 / 8 << 8);
							for (@Pc(88) int local88 = 0; local88 < Static338.anIntArray283.length; local88++) {
								if (Static338.anIntArray283[local88] == local86 && local11[local88] != null) {
									Static145.method5518((local76 & 0x7) * 8, local31 * 8, local54, Static15.aClass59_1, (local70 & 0x7) * 8, local64, local35 * 8, local11[local88], local25, Static117.aClass49Array1, arg0);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Lclient!qa;")
	public static Class163 method5377(@OriginalArg(0) int arg0) {
		@Pc(10) Class163 local10 = (Class163) Static3.aClass66_107.method1939((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static72.aClass170_24.method4584(1, arg0);
		local10 = new Class163();
		local10.anInt4846 = arg0;
		if (local20 != null) {
			local10.method4377(new Class5_Sub1(local20));
		}
		local10.method4374();
		if (local10.anInt4845 == 2 && Static148.aClass42_26.method1052((long) arg0) == null) {
			Static148.aClass42_26.method1050((long) arg0, new Class5_Sub37(Static175.anInt3556));
			Static230.aClass163Array1[Static175.anInt3556++] = local10;
		}
		Static3.aClass66_107.method1936((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5378(@OriginalArg(0) String arg0) {
		Static31.aString51 = arg0;
		if (Static202.aClass10_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static202.aClass10_3.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static202.aClass10_3.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static285.method5099(Static284.method4783() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static367.method4778(Static202.aClass10_3.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(86) Throwable local86) {
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILclient!sa;)Lclient!jq;")
	public static Class103 method5380(@OriginalArg(0) int arg0, @OriginalArg(2) Class25_Sub1 arg1) {
		@Pc(13) Class103 local13;
		if (Static211.aClass103_3 == null) {
			local13 = new Class103();
		} else {
			local13 = Static211.aClass103_3;
			Static211.aClass103_3 = Static211.aClass103_3.aClass103_2;
			local13.aClass103_2 = null;
			Static317.anInt6153--;
		}
		local13.aClass25_Sub1_1 = arg1;
		local13.anInt3088 = arg0;
		return local13;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Z")
	public static boolean method5381() {
		if (Static309.aBoolean444) {
			try {
				Static367.method4779("showVideoAd", Static202.aClass10_3.anApplet1);
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!en;Lclient!ra;BLclient!ra;)V")
	public static void method5382(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(3) Class170 arg2) {
		Static65.aClass138_3 = Static61.method1256(arg2, Static106.anInt2306);
		Static247.aClass91_9 = arg0.method4813(Static65.aClass138_3, Static360.method918(arg1, Static106.anInt2306));
		Static282.aClass138_7 = Static61.method1256(arg2, Static132.anInt2861);
		Static62.aClass91_3 = arg0.method4813(Static282.aClass138_7, Static360.method918(arg1, Static132.anInt2861));
		Static337.aClass138_10 = Static61.method1256(arg2, Static32.anInt862);
		Static190.aClass91_8 = arg0.method4813(Static337.aClass138_10, Static360.method918(arg1, Static32.anInt862));
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	public static void method5383() {
		Static295.aClass96Array2 = null;
		Static344.method949(0, 0, Static207.anInt4106, -1, 0, Static246.anInt4801, 0, Static17.anInt5991);
		if (Static295.aClass96Array2 != null) {
			Static35.method853(Static17.anInt5991, Static232.aClass96_15.anInt2964, Static34.anInt904, 0, 0, Static295.aClass96Array2, -1412584499, Static246.anInt4801, Static125.anInt2612);
			Static295.aClass96Array2 = null;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)Lclient!sq;")
	public static Class188 method5384(@OriginalArg(1) int arg0) {
		@Pc(10) Class188 local10 = (Class188) Static56.aClass66_19.method1939((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static208.aClass170_76.method4584(34, arg0);
		local10 = new Class188();
		if (local20 != null) {
			local10.method5045(new Class5_Sub1(local20), arg0);
		}
		Static56.aClass66_19.method1936((long) arg0, local10);
		return local10;
	}
}
