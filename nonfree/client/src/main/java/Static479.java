import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!si", name = "D", descriptor = "Lclient!sq;")
	public static final Class307 aClass307_13 = new Class307(6, 1);

	@OriginalMember(owner = "client!si", name = "E", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger8 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!si", name = "F", descriptor = "[I")
	public static int[] anIntArray479 = new int[1];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
	public static void method7191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		Static541.aBoolean678 = Static468.aClass44_7.method4972() > 0;
		Static516.aBoolean643 = true;
		Static26.anInt403 = arg1 >> Static145.anInt3093;
		Static528.anInt9392 = arg3 >> Static145.anInt3093;
		Static358.anInt6975 = arg1;
		Static237.anInt4283 = arg3;
		Static179.anInt3616 = arg2;
		Static354.anInt6889 = Static26.anInt403 - Static579.anInt10075;
		if (Static354.anInt6889 < 0) {
			Static49.anInt690 = -Static354.anInt6889;
			Static354.anInt6889 = 0;
		} else {
			Static49.anInt690 = 0;
		}
		Static309.anInt6179 = Static528.anInt9392 - Static579.anInt10075;
		if (Static309.anInt6179 < 0) {
			Static397.anInt7610 = -Static309.anInt6179;
			Static309.anInt6179 = 0;
		} else {
			Static397.anInt7610 = 0;
		}
		Static296.anInt5973 = Static26.anInt403 + Static579.anInt10075;
		if (Static296.anInt5973 > Static182.anInt3633) {
			Static296.anInt5973 = Static182.anInt3633;
		}
		Static22.anInt331 = Static528.anInt9392 + Static579.anInt10075;
		if (Static22.anInt331 > Static253.anInt4651) {
			Static22.anInt331 = Static253.anInt4651;
		}
		@Pc(70) boolean[][] local70 = Static522.aBooleanArrayArray18;
		@Pc(72) boolean[][] local72 = Static593.aBooleanArrayArray16;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (Static516.aBoolean643) {
			for (local76 = 0; local76 < Static579.anInt10075 + Static579.anInt10075 + 2; local76++) {
				for (local79 = 0; local79 < Static579.anInt10075 + Static579.anInt10075 + 2; local79++) {
					local86 = Static26.anInt403 + local76 - Static579.anInt10075;
					local92 = Static528.anInt9392 + local79 - Static579.anInt10075;
					if (local86 >= 0 && local92 >= 0 && local86 < Static182.anInt3633 && local92 < Static253.anInt4651) {
						@Pc(106) int local106 = local86 << Static145.anInt3093;
						@Pc(110) int local110 = local92 << Static145.anInt3093;
						@Pc(127) int local127 = Static444.aClass83Array7[Static444.aClass83Array7.length - 1].method7217(local92, local86) - (0x3E8 << Static145.anInt3093 - 7);
						@Pc(149) int local149 = Static183.aClass83Array6 == null ? Static444.aClass83Array7[0].method7217(local92, local86) + Static279.anInt5708 : Static183.aClass83Array6[0].method7217(local92, local86) + Static279.anInt5708;
						Static593.aBooleanArrayArray16[local76][local79] = Static468.aClass44_7.O(local106, local127, local110, local106, local149, local110);
					} else {
						Static593.aBooleanArrayArray16[local76][local79] = false;
					}
				}
			}
			for (local79 = 0; local79 < Static579.anInt10075 + Static579.anInt10075 + 1; local79++) {
				for (local86 = 0; local86 < Static579.anInt10075 + Static579.anInt10075 + 1; local86++) {
					Static522.aBooleanArrayArray18[local79][local86] = Static593.aBooleanArrayArray16[local79][local86] || Static593.aBooleanArrayArray16[local79 + 1][local86] || Static593.aBooleanArrayArray16[local79][local86 + 1] || Static593.aBooleanArrayArray16[local79 + 1][local86 + 1];
				}
			}
			Static116.anIntArray124 = arg5;
			Static435.anIntArray427 = arg6;
			Static99.anIntArray90 = arg7;
			Static229.anIntArray202 = arg8;
			Static61.anIntArray37 = arg9;
			Static371.method5957(Static468.aClass44_7, arg10);
		} else {
			if (Static204.aBooleanArrayArray13 == null) {
				Static204.aBooleanArrayArray13 = new boolean[Static182.anInt3633 + Static182.anInt3633 + 1][Static253.anInt4651 + Static182.anInt3633 + 1];
				for (local76 = 0; local76 < Static204.aBooleanArrayArray13.length; local76++) {
					for (local79 = 0; local79 < Static204.aBooleanArrayArray13[0].length; local79++) {
						Static204.aBooleanArrayArray13[local76][local79] = true;
					}
				}
			}
			Static593.aBooleanArrayArray16 = Static204.aBooleanArrayArray13;
			Static522.aBooleanArrayArray18 = Static204.aBooleanArrayArray13;
			Static354.anInt6889 = 0;
			Static309.anInt6179 = 0;
			Static296.anInt5973 = Static182.anInt3633;
			Static22.anInt331 = Static253.anInt4651;
			Static518.anInt9302 = 0;
		}
		Static206.method2650(Static468.aClass44_7);
		for (@Pc(322) Class1_Sub8 local322 = (Class1_Sub8) Static156.aClass136_5.method3288(); local322 != null; local322 = (Class1_Sub8) Static156.aClass136_5.method3286()) {
			local322.method8252();
			Static341.method5554(local322);
		}
		if (Static541.aBoolean678) {
			for (local79 = 0; local79 < Static523.anInt9351; local79++) {
				Static485.aClass177Array1[local79].method4032(arg0, arg14);
			}
		}
		if (Static175.aBoolean289) {
			Static162.anIntArray149 = Static468.aClass44_7.v();
			Static468.aClass44_7.oa(Static498.anIntArray485);
			local79 = (Static498.anIntArray485[2] - Static498.anIntArray485[0]) / Static24.anInt388;
			for (local86 = 0; local86 < Static24.anInt388 - 1; local86++) {
				Static113.anIntArray122[local86] = local79 * (local86 + 1) + Static339.anIntArray335[local86];
			}
			for (local92 = 0; local92 < Static339.aClass127Array1.length; local92++) {
				Static339.aClass127Array1[local92].method3180();
			}
		}
		if (Static507.aClass53ArrayArrayArray3 != null) {
			if (Static175.aBoolean289) {
				Static246.method3955(0);
			}
			Static45.method566(true);
			Static468.aClass44_7.CA(-1, 1583160, 40, 127);
			Static77.method1238(true, arg4, arg10, arg11);
			if (Static175.aBoolean289) {
				Static80.method7914();
			}
			Static468.aClass44_7.L();
			Static45.method566(false);
		}
		Static77.method1238(false, arg4, arg10, arg11);
		if (Static175.aBoolean289) {
			for (local79 = 0; local79 < Static345.anInt6662; local79++) {
				Static258.aBooleanArrayArrayArray1[local79] = Static320.aBooleanArrayArrayArray2[local79];
			}
			Static246.method3955(0);
			for (local86 = 0; local86 < Static339.aClass127Array1.length; local86++) {
				Static339.aClass127Array1[local86].method3180();
			}
		}
		if (Static175.aBoolean289) {
			Static80.method7914();
			for (local79 = 0; local79 < Static345.anInt6662; local79++) {
				Static320.aBooleanArrayArrayArray2[local79] = Static258.aBooleanArrayArrayArray1[local79];
			}
			if (Static468.anInt2399 == 2) {
				@Pc(505) int local505;
				if (Static394.aLongArray13[0] < Static394.aLongArray13[1]) {
					if (Static113.anIntArray122[0] + Static339.anIntArray335[0] > Static498.anIntArray485[0]) {
						local505 = Static339.anIntArray335[0]++;
					}
				} else if (Static394.aLongArray13[0] > Static394.aLongArray13[1] && Static113.anIntArray122[0] + Static339.anIntArray335[0] < Static498.anIntArray485[2]) {
					local505 = Static339.anIntArray335[0]--;
				}
			}
		}
		if (!Static516.aBoolean643) {
			Static522.aBooleanArrayArray18 = local70;
			Static593.aBooleanArrayArray16 = local72;
		}
		Static14.method188();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z")
	public static boolean method7192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static584.method8298(arg0, arg1) | (arg1 & 0x10000) != 0 || Static121.method2547(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static363.method5856(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!un;)Lclient!gaa;")
	public static Class22_Sub2 method7193(@OriginalArg(1) Class4_Sub11 arg0) {
		return new Class22_Sub2(arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4934(), arg0.method4934(), arg0.method4905());
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	public static void method7194() {
		if (Static13.aFrame1 != null) {
			return;
		}
		@Pc(18) int local18 = Static580.anInt2905;
		@Pc(20) int local20 = Static179.anInt3617;
		@Pc(27) int local27 = Static286.anInt5862 - Static554.anInt9828 - local18;
		@Pc(34) int local34 = Static238.anInt4332 - Static375.anInt7256 - local20;
		if (local18 <= 0 && local27 <= 0 && local20 <= 0 && local34 <= 0) {
			return;
		}
		try {
			@Pc(52) Container local52;
			if (Static475.aFrame3 != null) {
				local52 = Static475.aFrame3;
			} else if (Static110.anApplet1 == null) {
				local52 = Static162.anApplet_Sub1_1;
			} else {
				local52 = Static110.anApplet1;
			}
			@Pc(64) int local64 = 0;
			@Pc(66) int local66 = 0;
			if (Static475.aFrame3 == local52) {
				@Pc(72) Insets local72 = Static475.aFrame3.getInsets();
				local64 = local72.left;
				local66 = local72.top;
			}
			@Pc(81) Graphics local81 = local52.getGraphics();
			local81.setColor(Color.black);
			if (local18 > 0) {
				local81.fillRect(local64, local66, local18, Static238.anInt4332);
			}
			if (local20 > 0) {
				local81.fillRect(local64, local66, Static286.anInt5862, local20);
			}
			if (local27 > 0) {
				local81.fillRect(Static286.anInt5862 + local64 - local27, local66, local27, Static238.anInt4332);
			}
			if (local34 > 0) {
				local81.fillRect(local64, Static238.anInt4332 + local66 - local34, Static286.anInt5862, local34);
				return;
			}
		} catch (@Pc(134) Exception local134) {
			return;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([BBIIIII)V")
	public static void method7196(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static100.method2181(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static100.method2181(arg2)) {
			@Pc(38) int local38 = Static242.method3879(arg1);
			@Pc(40) int local40 = 0;
			@Pc(52) int local52 = arg4 < arg2 ? arg4 : arg2;
			@Pc(56) int local56 = arg4 >> 1;
			@Pc(60) int local60 = arg2 >> 1;
			@Pc(62) byte[] local62 = arg0;
			@Pc(69) byte[] local69 = new byte[local60 * local56 * local38];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local40, arg3, arg4, arg2, 0, arg1, 5121, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg4 * local38;
				for (@Pc(91) int local91 = 0; local91 < local38; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local91 + local89;
					for (@Pc(103) int local103 = 0; local103 < local60; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local56; local107++) {
							@Pc(113) byte local113 = local62[local97];
							local97 += local38;
							@Pc(123) int local123 = local113 + local62[local97];
							local97 += local38;
							@Pc(133) int local133 = local123 + local62[local101];
							local101 += local38;
							@Pc(143) int local143 = local133 + local62[local101];
							local101 += local38;
							local69[local95] = (byte) (local143 >> 2);
							local95 += local38;
						}
						local101 += local89;
						local97 += local89;
					}
				}
				@Pc(192) byte[] local192 = local69;
				local69 = local62;
				arg2 = local60;
				local62 = local192;
				arg4 = local56;
				local60 >>= 0x1;
				local56 >>= 0x1;
				local52 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
