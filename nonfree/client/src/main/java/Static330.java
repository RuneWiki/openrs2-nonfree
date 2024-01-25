import java.awt.Color;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!t", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)B")
	public static byte method5309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIIII)V")
	public static void method5311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static198.anInt4111; local3++) {
			@Pc(9) Rectangle local9 = Class196.aRectangleArray1[local3];
			if (arg0 < local9.width + local9.x && arg0 + arg1 > local9.x && local9.y + local9.height > arg2 && local9.y < arg3 + arg2) {
				Static93.aBooleanArray10[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BLclient!kt;[[B)V")
	public static void method5314(@OriginalArg(1) Class133_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class2_Sub24 local30 = new Class2_Sub24(local23);
				local36 = Static71.anIntArray118[local17] >> 8;
				@Pc(42) int local42 = Static71.anIntArray118[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static279.anInt5198;
				@Pc(56) int local56 = local42 * 64 - Static350.anInt6470;
				Static131.method2293();
				arg0.method3468(local49, Static350.anInt6470, Static165.aClass178Array1, Static279.anInt5198, local56, local30);
				arg0.method3477(local12, local30, Static383.aClass48_9, local49, local56);
				if (!arg0.aBoolean282 && Static196.anInt2477 / 8 == local36 && Static15.anInt270 / 8 == local42) {
					if (local12[0] == -1) {
						Static251.aClass58_1 = null;
					} else {
						Static251.aClass58_1 = Static194.aClass52_1.method1206(local12[0], local12[1], Static371.aClass162_1, local12[2], local12[3]);
						Static284.anInt5625 = local12[4];
					}
				}
			}
		}
		for (@Pc(132) int local132 = 0; local132 < local15; local132++) {
			@Pc(145) int local145 = (Static71.anIntArray118[local132] >> 8) * 64 - Static279.anInt5198;
			local36 = (Static71.anIntArray118[local132] & 0xFF) * 64 - Static350.anInt6470;
			@Pc(160) byte[] local160 = arg1[local132];
			if (local160 == null && Static15.anInt270 < 800) {
				Static131.method2293();
				arg0.method3457(local145, local36);
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)Lclient!df;")
	public static Class2_Sub7_Sub2 method5315() {
		@Pc(8) Class2_Sub7_Sub2 local8 = (Class2_Sub7_Sub2) Static305.aClass179_13.method4487();
		if (local8 != null) {
			local8.method6130();
			local8.method6085();
			return local8;
		}
		do {
			local8 = (Class2_Sub7_Sub2) Static299.aClass179_6.method4487();
			if (local8 == null) {
				return null;
			}
			if (local8.method1199() > Static101.method1805()) {
				return null;
			}
			local8.method6130();
			local8.method6085();
		} while ((local8.aLong209 & Long.MIN_VALUE) == 0L);
		return local8;
	}
}
