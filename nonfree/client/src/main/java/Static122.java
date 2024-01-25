import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
	public static int anInt2309;

	@OriginalMember(owner = "client!gq", name = "M", descriptor = "Lclient!hg;")
	public static Class102 aClass102_3;

	@OriginalMember(owner = "client!gq", name = "P", descriptor = "Lclient!b;")
	public static Class20 aClass20_35;

	@OriginalMember(owner = "client!gq", name = "I", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_39 = new Class57("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!gq", name = "L", descriptor = "Z")
	public static volatile boolean aBoolean179 = true;

	@OriginalMember(owner = "client!gq", name = "Q", descriptor = "[Z")
	public static final boolean[] aBooleanArray55 = new boolean[100];

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(CI)Z")
	public static boolean method1946(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(27) char[] local27 = Static239.aCharArray15;
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				@Pc(35) char local35 = local27[local29];
				if (local35 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
	public static void method1947() {
		if (Static225.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static125.anInt2386;
		@Pc(10) int local10 = Static92.anInt1900;
		@Pc(22) int local22 = Static276.anInt4800 - local8 - Static199.anInt3567;
		@Pc(30) int local30 = Static177.anInt3088 - local10 - Static207.anInt2251;
		if (local8 <= 0 && local22 <= 0 && local10 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(52) Container local52;
			if (Static34.aFrame1 == null) {
				local52 = Static61.aClass156_1.anApplet1;
			} else {
				local52 = Static34.aFrame1;
			}
			@Pc(58) int local58 = 0;
			@Pc(60) int local60 = 0;
			if (local52 == Static34.aFrame1) {
				@Pc(66) Insets local66 = Static34.aFrame1.getInsets();
				local58 = local66.left;
				local60 = local66.top;
			}
			@Pc(75) Graphics local75 = local52.getGraphics();
			local75.setColor(Color.black);
			if (local8 > 0) {
				local75.fillRect(local58, local60, local8, Static177.anInt3088);
			}
			if (local10 > 0) {
				local75.fillRect(local58, local60, Static276.anInt4800, local10);
			}
			if (local22 > 0) {
				local75.fillRect(Static276.anInt4800 + local58 - local22, local60, local22, Static177.anInt3088);
			}
			if (local30 > 0) {
				local75.fillRect(local58, Static177.anInt3088 + local60 - local30, Static276.anInt4800, local30);
				return;
			}
		} catch (@Pc(128) Exception local128) {
			return;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBI)V")
	public static void method1948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static42.aFloat4 < Static42.aFloat5) {
			Static42.aFloat4 = (float) ((double) Static42.aFloat4 + (double) Static42.aFloat4 / 30.0D);
			if (Static42.aFloat4 > Static42.aFloat5) {
				Static42.aFloat4 = Static42.aFloat5;
			}
			Static43.method691();
			Static42.anInt531 = (int) Static42.aFloat4 >> 1;
			Static42.aByteArrayArrayArray3 = Static221.method3685(Static42.anInt531);
		} else if (Static42.aFloat5 < Static42.aFloat4) {
			Static42.aFloat4 = (float) ((double) Static42.aFloat4 - (double) Static42.aFloat4 / 30.0D);
			if (Static42.aFloat5 > Static42.aFloat4) {
				Static42.aFloat4 = Static42.aFloat5;
			}
			Static43.method691();
			Static42.anInt531 = (int) Static42.aFloat4 >> 1;
			Static42.aByteArrayArrayArray3 = Static221.method3685(Static42.anInt531);
		}
		if (Static125.anInt2380 != -1 && Static253.anInt4565 != -1) {
			@Pc(82) int local82 = Static125.anInt2380 - Static325.anInt5538;
			if (local82 < 2 || local82 > 2) {
				local82 /= 8;
			}
			@Pc(99) int local99 = Static253.anInt4565 - Static257.anInt4618;
			if (local99 < 2 || local99 > 2) {
				local99 /= 8;
			}
			Static325.anInt5538 += local82;
			if (local82 == 0 && local99 == 0) {
				Static125.anInt2380 = -1;
				Static253.anInt4565 = -1;
			}
			Static257.anInt4618 += local99;
			Static43.method691();
		}
		if (Static179.anInt3177 > 0) {
			Static296.anInt5113--;
			if (Static296.anInt5113 == 0) {
				Static179.anInt3177--;
				Static296.anInt5113 = 100;
			}
		} else {
			Static384.anInt6421 = -1;
			Static246.anInt4423 = -1;
		}
		if (!Static284.aBoolean393 || Static299.aClass138_37 == null) {
			return;
		}
		for (@Pc(164) Class3_Sub27 local164 = (Class3_Sub27) Static299.aClass138_37.method3051(); local164 != null; local164 = (Class3_Sub27) Static299.aClass138_37.method3050()) {
			@Pc(173) Class196 local173 = Static42.aClass195_2.method4500(local164.aClass3_Sub41_1.anInt6279);
			if (local164.method3675(arg1, arg0)) {
				if (local173.aStringArray34 != null) {
					if (local173.aStringArray34[4] != null) {
						Static90.method1499(1002, -1, local173.anInt5001, 0, (long) local164.aClass3_Sub41_1.anInt6279, local173.aString54, true, local173.aStringArray34[4], false, -1);
					}
					if (local173.aStringArray34[3] != null) {
						Static90.method1499(1006, -1, local173.anInt5001, 0, (long) local164.aClass3_Sub41_1.anInt6279, local173.aString54, true, local173.aStringArray34[3], false, -1);
					}
					if (local173.aStringArray34[2] != null) {
						Static90.method1499(1009, -1, local173.anInt5001, 0, (long) local164.aClass3_Sub41_1.anInt6279, local173.aString54, true, local173.aStringArray34[2], false, -1);
					}
					if (local173.aStringArray34[1] != null) {
						Static90.method1499(1001, -1, local173.anInt5001, 0, (long) local164.aClass3_Sub41_1.anInt6279, local173.aString54, true, local173.aStringArray34[1], false, -1);
					}
					if (local173.aStringArray34[0] != null) {
						Static90.method1499(1010, -1, local173.anInt5001, 0, (long) local164.aClass3_Sub41_1.anInt6279, local173.aString54, true, local173.aStringArray34[0], false, -1);
					}
				}
				if (!local164.aClass3_Sub41_1.aBoolean490) {
					local164.aClass3_Sub41_1.aBoolean490 = true;
					Static124.method2005(Static318.aClass240_43, local164.aClass3_Sub41_1.anInt6279, local173.anInt5001);
				}
				if (local164.aClass3_Sub41_1.aBoolean490) {
					Static124.method2005(Static321.aClass240_73, local164.aClass3_Sub41_1.anInt6279, local173.anInt5001);
				}
			} else if (local164.aClass3_Sub41_1.aBoolean490) {
				local164.aClass3_Sub41_1.aBoolean490 = false;
				Static124.method2005(Static34.aClass240_9, local164.aClass3_Sub41_1.anInt6279, local173.anInt5001);
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(B)V")
	public static void method1949() {
		Static179.aClass139_37.method3075();
		Static103.aClass139_21.method3075();
		Static322.aClass139_82.method3075();
		Static212.aClass139_45.method3075();
		Static116.aClass139_25.method3075();
	}
}
