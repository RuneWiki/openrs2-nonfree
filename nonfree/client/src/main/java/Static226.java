import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "F")
	public static float aFloat83;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_137 = new Class251(5, 3);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
	public static void method5053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static132.anInt2080; local5++) {
			@Pc(10) Rectangle local10 = Class14_Sub33.aRectangleArray2[local5];
			if (local10.x + local10.width > arg3 && arg2 + arg3 > local10.x && arg0 < local10.y + local10.height && local10.y < arg0 + arg1) {
				Static415.aBooleanArray17[local5] = true;
			}
		}
		Static140.method2127(arg3 + arg2, arg3, arg1 + arg0, arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIILclient!ha;)V")
	public static void method5054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		Static556.aClass342ArrayArray1 = new Class342[arg0][arg1];
		Static127.aClass144_17 = arg2;
		if (Static550.anIntArray476 != null) {
			Static629.aClass47_4 = Static12.method246(Static550.anIntArray476[5], Static550.anIntArray476[2], Static550.anIntArray476[0], Static550.anIntArray476[3], Static550.anIntArray476[1], Static550.anIntArray476[4]);
		}
		Static253.aClass366_2 = null;
		Static494.aClass342_2 = new Class342();
		Static190.method2835();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public static void method5055() {
		if (Static192.anInt10923 < 0) {
			return;
		}
		@Pc(17) long local17 = Static26.method382();
		Static192.anInt10923 = (int) ((long) Static192.anInt10923 + Static94.aLong71 - local17);
		if (Static192.anInt10923 <= 0) {
			Static299.aFloat80 = Static470.aClass342_1.aFloat183;
			Static241.aFloat73 = Static470.aClass342_1.aFloat184;
			Static119.aFloat13 = Static470.aClass342_1.aFloat186;
			Static196.aFloat28 = Static470.aClass342_1.aFloat185;
			Static392.anInt6825 = Static470.aClass342_1.anInt9497;
			Static581.aClass47_3 = Static470.aClass342_1.aClass47_2;
			Static665.anInt10879 = Static470.aClass342_1.anInt9495;
			Static91.anInt1594 = Static470.aClass342_1.anInt9488;
			Static187.aFloat25 = Static470.aClass342_1.aFloat187;
			Static214.aFloat31 = Static470.aClass342_1.aFloat182;
			if (Static240.aClass366_1 != null) {
				Static240.aClass366_1.method8694();
			}
			Static240.aClass366_1 = Static470.aClass342_1.aClass366_4;
			Static192.anInt10923 = -1;
		} else {
			@Pc(82) int local82 = (Static192.anInt10923 << 8) / Static649.anInt10648;
			@Pc(86) int local86 = 255 - local82;
			@Pc(91) float local91 = (float) local82 / 255.0F;
			@Pc(96) float local96 = 1.0F - local91;
			Static665.anInt10879 = (local86 * (Static470.aClass342_1.anInt9495 & 0xFF00FF) + (Static234.anInt4557 & 0xFF00FF) * local82 & 0xFF00FF00) + ((Static470.aClass342_1.anInt9495 & 0xFF00) * local86 + (Static234.anInt4557 & 0xFF00) * local82 & 0xFF0000) >>> 8;
			Static214.aFloat31 = (Static470.aClass342_1.aFloat182 - Static128.aFloat15) * local96 + Static128.aFloat15;
			Static392.anInt6825 = local86 * Static470.aClass342_1.anInt9497 + local82 * Static207.anInt3632 >> 8;
			Static119.aFloat13 = (Static470.aClass342_1.aFloat186 - Static357.aFloat88) * local96 + Static357.aFloat88;
			Static187.aFloat25 = Static646.aFloat207 + local96 * (Static470.aClass342_1.aFloat187 - Static646.aFloat207);
			Static299.aFloat80 = (Static470.aClass342_1.aFloat183 - Static610.aFloat205) * local96 + Static610.aFloat205;
			Static196.aFloat28 = Static198.aFloat29 + (Static470.aClass342_1.aFloat185 - Static198.aFloat29) * local96;
			Static241.aFloat73 = Static536.aFloat179 + local96 * (Static470.aClass342_1.aFloat184 - Static536.aFloat179);
			Static91.anInt1594 = ((Static569.anInt9430 & 0xFF00) * local82 + local86 * (Static470.aClass342_1.anInt9488 & 0xFF00) & 0xFF0000) + ((Static470.aClass342_1.anInt9488 & 0xFF00FF) * local86 + local82 * (Static569.anInt9430 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			if (Static470.aClass342_1.aClass47_2 != Static197.aClass47_1) {
				Static581.aClass47_3 = Static127.aClass144_17.method6899(Static197.aClass47_1, Static470.aClass342_1.aClass47_2, local96, Static581.aClass47_3);
			}
			if (Static290.aClass366_3 != Static470.aClass342_1.aClass366_4) {
				if (Static290.aClass366_3 == null) {
					Static240.aClass366_1 = Static470.aClass342_1.aClass366_4;
					if (Static240.aClass366_1 != null) {
						Static240.aClass366_1.method8692(local86, 0);
					}
				} else {
					Static240.aClass366_1 = Static290.aClass366_3;
					if (Static240.aClass366_1 != null) {
						Static240.aClass366_1.method8692(local86, 255);
					}
				}
			}
		}
		Static94.aLong71 = local17;
	}
}
