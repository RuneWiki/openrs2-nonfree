import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
	public static int anInt6 = 1;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static343.aBoolean381 = true;
		Static342.aBoolean380 = Static44.aClass100_1.method8635() > 0;
		Static603.aBoolean683 = true;
		Static220.anInt3838 = arg1 >> Static314.anInt5377;
		Static377.anInt6335 = arg3 >> Static314.anInt5377;
		Static57.anInt1010 = arg1;
		Static17.anInt229 = arg3;
		Static432.anInt7142 = arg2;
		Static603.anInt9713 = Static220.anInt3838 - Static553.anInt8738;
		if (Static603.anInt9713 < 0) {
			Static110.anInt9533 = -Static603.anInt9713;
			Static603.anInt9713 = 0;
		} else {
			Static110.anInt9533 = 0;
		}
		Static57.anInt1008 = Static377.anInt6335 - Static553.anInt8738;
		if (Static57.anInt1008 < 0) {
			Static13.anInt168 = -Static57.anInt1008;
			Static57.anInt1008 = 0;
		} else {
			Static13.anInt168 = 0;
		}
		Static19.anInt254 = Static220.anInt3838 + Static553.anInt8738;
		if (Static19.anInt254 > Static672.anInt10829) {
			Static19.anInt254 = Static672.anInt10829;
		}
		Static65.anInt1080 = Static377.anInt6335 + Static553.anInt8738;
		if (Static65.anInt1080 > Static532.anInt8517) {
			Static65.anInt1080 = Static532.anInt8517;
		}
		@Pc(79) boolean[][] local79 = Static407.aBooleanArrayArray8;
		@Pc(81) boolean[][] local81 = Static241.aBooleanArrayArray5;
		@Pc(85) int local85;
		@Pc(88) int local88;
		@Pc(90) int local90;
		if (Static603.aBoolean683) {
			for (local85 = 0; local85 < Static553.anInt8738 + Static553.anInt8738 + 2; local85++) {
				local88 = 0;
				local90 = 0;
				for (@Pc(92) int local92 = 0; local92 < Static553.anInt8738 + Static553.anInt8738 + 2; local92++) {
					if (local92 > 1) {
						Static112.anIntArray98[local92 - 2] = local88;
					}
					local88 = local90;
					@Pc(112) int local112 = Static220.anInt3838 + local85 - Static553.anInt8738;
					@Pc(118) int local118 = Static377.anInt6335 + local92 - Static553.anInt8738;
					@Pc(138) int local138;
					if (local112 >= 0 && local118 >= 0 && local112 < Static672.anInt10829 && local118 < Static532.anInt8517) {
						local138 = local112 << Static314.anInt5377;
						@Pc(142) int local142 = local118 << Static314.anInt5377;
						@Pc(159) int local159 = Static668.aClass84Array4[Static668.aClass84Array4.length - 1].method7620(local118, local112) - (0x3E8 << Static314.anInt5377 - 7);
						@Pc(182) int local182 = Static77.aClass84Array1 == null ? Static668.aClass84Array4[0].method7620(local118, local112) + Static492.anInt7972 : Static77.aClass84Array1[0].method7620(local118, local112) + Static492.anInt7972;
						local90 = arg15 >= 0 ? Static44.aClass100_1.r(local138, local159, local142, local138, local182, local142, arg15) : Static44.aClass100_1.JA(local138, local159, local142, local138, local182, local142);
						Static241.aBooleanArrayArray5[local85][local92] = local90 == 0;
					} else {
						local90 = -1;
						Static241.aBooleanArrayArray5[local85][local92] = false;
					}
					if (local85 > 0 && local92 > 0) {
						local138 = Static112.anIntArray98[local92 - 1] & Static112.anIntArray98[local92] & local88 & local90;
						Static407.aBooleanArrayArray8[local85 - 1][local92 - 1] = local138 == 0;
					}
				}
				Static112.anIntArray98[Static553.anInt8738 + Static553.anInt8738] = local88;
				Static112.anIntArray98[Static553.anInt8738 + Static553.anInt8738 + 1] = local90;
			}
			if (arg15 >= 0) {
				Static343.aBoolean381 = false;
			} else {
				Static151.anIntArray140 = arg5;
				Static651.anIntArray607 = arg6;
				Static91.anIntArray385 = arg7;
				Static265.anIntArray255 = arg8;
				Static329.anIntArray323 = arg9;
				Static82.method1333(Static44.aClass100_1, arg10);
			}
		} else {
			if (Static348.aBooleanArrayArray7 == null) {
				Static348.aBooleanArrayArray7 = new boolean[Static672.anInt10829 + Static672.anInt10829 + 1][Static532.anInt8517 + Static672.anInt10829 + 1];
			}
			for (local85 = 0; local85 < Static348.aBooleanArrayArray7.length; local85++) {
				for (local88 = 0; local88 < Static348.aBooleanArrayArray7[0].length; local88++) {
					Static348.aBooleanArrayArray7[local85][local88] = true;
				}
			}
			Static241.aBooleanArrayArray5 = Static348.aBooleanArrayArray7;
			Static407.aBooleanArrayArray8 = Static348.aBooleanArrayArray7;
			Static603.anInt9713 = 0;
			Static57.anInt1008 = 0;
			Static19.anInt254 = Static672.anInt10829;
			Static65.anInt1080 = Static532.anInt8517;
			Static343.aBoolean381 = false;
		}
		Static93.method1472(Static44.aClass100_1);
		if (!Static605.aClass321_3.aBoolean561) {
			@Pc(381) Class387 local381 = Static605.aClass321_3.aClass387_5;
			for (@Pc(386) Class4_Sub6 local386 = (Class4_Sub6) local381.method9018(); local386 != null; local386 = (Class4_Sub6) local381.method9016()) {
				local386.method8570();
				Static474.method6691(local386);
			}
		}
		if (Static342.aBoolean380) {
			for (local85 = 0; local85 < Static257.anInt4639; local85++) {
				Static665.aClass204Array3[local85].method4701(arg14, arg0);
			}
		}
		if (Static205.aBoolean259) {
			Static672.anIntArray620 = Static44.aClass100_1.Y();
			Static44.aClass100_1.K(Static655.anIntArray610);
			local85 = (Static655.anIntArray610[2] - Static655.anIntArray610[0]) / Static165.anInt3244;
			for (local88 = 0; local88 < Static165.anInt3244 - 1; local88++) {
				Static349.anIntArray335[local88] = local85 * (local88 + 1) + Static288.anIntArray296[local88];
			}
			for (local90 = 0; local90 < Static312.aClass291Array1.length; local90++) {
				Static312.aClass291Array1[local90].method6561();
			}
		}
		if (Static681.aClass128ArrayArrayArray3 != null) {
			if (Static205.aBoolean259) {
				Static318.method4870(0);
			}
			Static130.method1928(true);
			Static44.aClass100_1.ra(-1, 1583160, 40, 127);
			Static49.method899(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static205.aBoolean259) {
				Static42.method762();
			}
			Static44.aClass100_1.pa();
			Static130.method1928(false);
		}
		Static49.method899(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static205.aBoolean259) {
			for (local85 = 0; local85 < Static237.anInt4100; local85++) {
				Static637.aBooleanArrayArrayArray3[local85] = Static115.aBooleanArrayArrayArray1[local85];
			}
			Static318.method4870(0);
			for (local88 = 0; local88 < Static312.aClass291Array1.length; local88++) {
				Static312.aClass291Array1[local88].method6561();
			}
		}
		if (Static205.aBoolean259) {
			Static42.method762();
			for (local85 = 0; local85 < Static237.anInt4100; local85++) {
				Static115.aBooleanArrayArrayArray1[local85] = Static637.aBooleanArrayArrayArray3[local85];
			}
			if (Static549.anInt8710 == 2) {
				@Pc(595) int local595;
				if (Static666.aLongArray22[0] < Static666.aLongArray22[1]) {
					if (Static349.anIntArray335[0] + Static288.anIntArray296[0] > Static655.anIntArray610[0]) {
						local595 = Static288.anIntArray296[0]++;
					}
				} else if (Static666.aLongArray22[0] > Static666.aLongArray22[1] && Static349.anIntArray335[0] + Static288.anIntArray296[0] < Static655.anIntArray610[2]) {
					local595 = Static288.anIntArray296[0]--;
				}
			}
		}
		if (!Static603.aBoolean683) {
			Static407.aBooleanArrayArray8 = local79;
			Static241.aBooleanArrayArray5 = local81;
		}
		Static328.method4968();
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)Lclient!eg;")
	public static Class5_Sub4_Sub2 method22() {
		return Static445.aClass5_Sub4_Sub2_6;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "([[II)V")
	public static void method23(@OriginalArg(0) int[][] arg0) {
		Static120.anIntArrayArray18 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!wq;)Lclient!nga;")
	public static Class91 method25(@OriginalArg(1) Class5_Sub36 arg0) {
		@Pc(7) int local7 = arg0.method7333();
		@Pc(22) Class189 local22 = Static447.method6379()[arg0.method7291()];
		@Pc(29) Class346 local29 = Static378.method5602()[arg0.method7291()];
		@Pc(33) int local33 = arg0.method7303();
		@Pc(37) int local37 = arg0.method7303();
		return new Class91(local7, local22, local29, local33, local37);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(JI)I")
	public static int method26(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}
}
