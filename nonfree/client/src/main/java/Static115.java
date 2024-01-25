import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Lclient!lg;")
	public static Class60 aClass60_10;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
	public static int anInt2476 = 0;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "[I")
	public static final int[] anIntArray241 = new int[50];

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public static void method2087() {
		if (Static76.anInt1672 == -1 || Static179.anInt3943 == -1) {
			return;
		}
		@Pc(25) int local25 = ((Static268.anInt5466 - Static47.anInt1069) * Static303.anInt3067 >> 16) + Static47.anInt1069;
		Static303.anInt3067 += local25;
		if (Static303.anInt3067 >= 65535) {
			Static303.anInt3067 = 65535;
			if (Static3.aBoolean2) {
				Static268.aBoolean485 = false;
			} else {
				Static268.aBoolean485 = true;
			}
			Static3.aBoolean2 = true;
		} else {
			Static268.aBoolean485 = false;
			Static3.aBoolean2 = false;
		}
		@Pc(55) float local55 = (float) Static303.anInt3067 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static127.anInt2850 * 2;
		@Pc(88) int local88;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(135) int local135;
		@Pc(145) int local145;
		@Pc(163) int local163;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static45.anIntArrayArrayArray17[Static76.anInt1672][local62][local64] * 3;
			local88 = Static45.anIntArrayArrayArray17[Static76.anInt1672][local62 + 1][local64] * 3;
			local122 = (Static45.anIntArrayArrayArray17[Static76.anInt1672][local62 + 2][local64] + Static45.anIntArrayArrayArray17[Static76.anInt1672][local62 + 2][local64] - Static45.anIntArrayArrayArray17[Static76.anInt1672][local62 + 3][local64]) * 3;
			local130 = Static45.anIntArrayArrayArray17[Static76.anInt1672][local62][local64];
			local135 = local88 - local76;
			local145 = local76 + local122 - local88 * 2;
			local163 = local88 + Static45.anIntArrayArrayArray17[Static76.anInt1672][local62 + 2][local64] - local130 - local122;
			local58[local64] = local55 * ((float) local135 + local55 * ((float) local145 + (float) local163 * local55)) + (float) local130;
		}
		Static133.anInt3056 = (int) local58[2] - Static81.anInt1732 * 128;
		Static230.anInt4796 = (int) local58[0] - Static10.anInt231 * 128;
		Static105.anInt6098 = (int) local58[1] * -1;
		@Pc(218) float[] local218 = new float[3];
		local88 = Static83.anInt1757 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static45.anIntArrayArrayArray17[Static179.anInt3943][local88][local122] * 3;
			local135 = Static45.anIntArrayArrayArray17[Static179.anInt3943][local88 + 1][local122] * 3;
			local145 = (Static45.anIntArrayArrayArray17[Static179.anInt3943][local88 + 2][local122] + Static45.anIntArrayArrayArray17[Static179.anInt3943][local88 + 2][local122] - Static45.anIntArrayArrayArray17[Static179.anInt3943][local88 + 3][local122]) * 3;
			local163 = Static45.anIntArrayArrayArray17[Static179.anInt3943][local88][local122];
			@Pc(294) int local294 = local135 - local130;
			@Pc(304) int local304 = local130 + local145 - local135 * 2;
			@Pc(320) int local320 = Static45.anIntArrayArrayArray17[Static179.anInt3943][local88 + 2][local122] + local135 - local163 - local145;
			local218[local122] = (local55 * ((float) local304 + (float) local320 * local55) + (float) local294) * local55 + (float) local163;
		}
		@Pc(357) float local357 = local218[0] - local58[0];
		@Pc(368) float local368 = (local218[1] - local58[1]) * -1.0F;
		@Pc(376) float local376 = local218[2] - local58[2];
		@Pc(386) double local386 = Math.sqrt((double) (local376 * local376 + local357 * local357));
		Static288.anInt5845 = (int) (Math.atan2((double) local368, local386) * 2607.5945876176133D) & 0x3FFF;
		Static332.anInt6592 = (int) (-Math.atan2((double) local357, (double) local376) * 2607.5945876176133D) & 0x3FFF;
		Static221.anInt4596 = Static45.anIntArrayArrayArray17[Static76.anInt1672][local62][3] + ((Static45.anIntArrayArrayArray17[Static76.anInt1672][local62 + 2][3] - Static45.anIntArrayArrayArray17[Static76.anInt1672][local62][3]) * Static303.anInt3067 >> 16);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	public static void method2088() {
		if (Static135.aBoolean259) {
			return;
		}
		Static135.aBoolean259 = true;
		Static275.aBoolean495 = true;
		if (Static166.aBoolean307) {
			Static138.aFloat35 = (int) Static138.aFloat35 - 65 & 0xFFFFFF80;
		} else {
			Static229.aFloat44 += (-24.0F - Static229.aFloat44) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)V")
	public static void method2090(@OriginalArg(0) int arg0) {
		Static307.anInt3771 = arg0;
		Static352.anInt6599 = -1;
		Static157.anInt3513 = -1;
		Static18.method358();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!c;)V")
	public static void method2091(@OriginalArg(1) Class2_Sub2_Sub1_Sub1 arg0) {
		@Pc(15) Class4_Sub37 local15 = (Class4_Sub37) Static124.aClass198_23.method5261((long) arg0.anInt6535);
		if (local15 == null) {
			Static55.method1013(0, arg0.anIntArray517[0], arg0.anIntArray518[0], null, arg0, Static279.anInt5645, null);
		} else {
			local15.method5070();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2092(@OriginalArg(0) int arg0) {
		@Pc(14) String local14 = Integer.toString(arg0);
		for (@Pc(19) int local19 = local14.length() - 3; local19 > 0; local19 -= 3) {
			local14 = local14.substring(0, local19) + "," + local14.substring(local19);
		}
		if (local14.length() > 9) {
			return " <col=00ff80>" + local14.substring(0, local14.length() - 8) + Static200.aString150 + " (" + local14 + ")</col>";
		} else if (local14.length() > 6) {
			return " <col=ffffff>" + local14.substring(0, local14.length() - 4) + Static247.aString189 + " (" + local14 + ")</col>";
		} else {
			return " <col=ffff00>" + local14 + "</col>";
		}
	}
}
