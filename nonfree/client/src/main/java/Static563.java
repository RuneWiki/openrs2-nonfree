import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Z")
	public static boolean aBoolean729 = false;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!el;")
	public static final Class109 aClass109_198 = new Class109(94, 6);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method8131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static119.aBoolean171 = true;
		Static238.aBoolean310 = Static205.aClass57_5.method7721() > 0;
		Static523.aBoolean667 = true;
		Static128.anInt7021 = arg1 >> Static611.anInt10115;
		Static97.anInt1574 = arg3 >> Static611.anInt10115;
		Static225.anInt3671 = arg1;
		Static384.anInt6573 = arg3;
		Static92.anInt1522 = arg2;
		Static551.anInt9313 = Static128.anInt7021 - Static28.anInt9243;
		if (Static551.anInt9313 < 0) {
			Static508.anInt8701 = -Static551.anInt9313;
			Static551.anInt9313 = 0;
		} else {
			Static508.anInt8701 = 0;
		}
		Static609.anInt10106 = Static97.anInt1574 - Static28.anInt9243;
		if (Static609.anInt10106 < 0) {
			Static196.anInt3200 = -Static609.anInt10106;
			Static609.anInt10106 = 0;
		} else {
			Static196.anInt3200 = 0;
		}
		Static236.anInt3937 = Static128.anInt7021 + Static28.anInt9243;
		if (Static236.anInt3937 > Static328.anInt5870) {
			Static236.anInt3937 = Static328.anInt5870;
		}
		Static608.anInt10101 = Static97.anInt1574 + Static28.anInt9243;
		if (Static608.anInt10101 > Static526.anInt8863) {
			Static608.anInt10101 = Static526.anInt8863;
		}
		@Pc(79) boolean[][] local79 = Static300.aBooleanArrayArray6;
		@Pc(81) boolean[][] local81 = Static543.aBooleanArrayArray8;
		@Pc(85) int local85;
		@Pc(88) int local88;
		@Pc(90) int local90;
		if (Static523.aBoolean667) {
			for (local85 = 0; local85 < Static28.anInt9243 + Static28.anInt9243 + 2; local85++) {
				local88 = 0;
				local90 = 0;
				for (@Pc(92) int local92 = 0; local92 < Static28.anInt9243 + Static28.anInt9243 + 2; local92++) {
					if (local92 > 1) {
						Static101.anIntArray88[local92 - 2] = local88;
					}
					local88 = local90;
					@Pc(112) int local112 = Static128.anInt7021 + local85 - Static28.anInt9243;
					@Pc(118) int local118 = Static97.anInt1574 + local92 - Static28.anInt9243;
					@Pc(138) int local138;
					if (local112 >= 0 && local118 >= 0 && local112 < Static328.anInt5870 && local118 < Static526.anInt8863) {
						local138 = local112 << Static611.anInt10115;
						@Pc(142) int local142 = local118 << Static611.anInt10115;
						@Pc(159) int local159 = Static220.aClass22Array2[Static220.aClass22Array2.length - 1].method8038(local118, local112) - (0x3E8 << Static611.anInt10115 - 7);
						@Pc(182) int local182 = Static134.aClass22Array1 == null ? Static220.aClass22Array2[0].method8038(local118, local112) + Static88.anInt7739 : Static134.aClass22Array1[0].method8038(local118, local112) + Static88.anInt7739;
						local90 = arg15 >= 0 ? Static205.aClass57_5.r(local138, local159, local142, local138, local182, local142, arg15) : Static205.aClass57_5.JA(local138, local159, local142, local138, local182, local142);
						Static543.aBooleanArrayArray8[local85][local92] = local90 == 0;
					} else {
						local90 = -1;
						Static543.aBooleanArrayArray8[local85][local92] = false;
					}
					if (local85 > 0 && local92 > 0) {
						local138 = Static101.anIntArray88[local92 - 1] & Static101.anIntArray88[local92] & local88 & local90;
						Static300.aBooleanArrayArray6[local85 - 1][local92 - 1] = local138 == 0;
					}
				}
				Static101.anIntArray88[Static28.anInt9243 + Static28.anInt9243] = local88;
				Static101.anIntArray88[Static28.anInt9243 + Static28.anInt9243 + 1] = local90;
			}
			if (arg15 >= 0) {
				Static119.aBoolean171 = false;
			} else {
				Static500.anIntArray491 = arg5;
				Static57.anIntArray44 = arg6;
				Static588.anIntArray548 = arg7;
				Static510.anIntArray496 = arg8;
				Static478.anIntArray477 = arg9;
				Static94.method1392(arg10, Static205.aClass57_5);
			}
		} else {
			if (Static157.aBooleanArrayArray2 == null) {
				Static157.aBooleanArrayArray2 = new boolean[Static328.anInt5870 + Static328.anInt5870 + 1][Static526.anInt8863 + Static328.anInt5870 + 1];
			}
			for (local85 = 0; local85 < Static157.aBooleanArrayArray2.length; local85++) {
				for (local88 = 0; local88 < Static157.aBooleanArrayArray2[0].length; local88++) {
					Static157.aBooleanArrayArray2[local85][local88] = true;
				}
			}
			Static543.aBooleanArrayArray8 = Static157.aBooleanArrayArray2;
			Static300.aBooleanArrayArray6 = Static157.aBooleanArrayArray2;
			Static551.anInt9313 = 0;
			Static609.anInt10106 = 0;
			Static236.anInt3937 = Static328.anInt5870;
			Static608.anInt10101 = Static526.anInt8863;
			Static119.aBoolean171 = false;
		}
		Static654.method9045(Static205.aClass57_5);
		if (!Static51.aClass339_1.aBoolean750) {
			@Pc(381) Class98 local381 = Static51.aClass339_1.aClass98_8;
			for (@Pc(386) Class8_Sub10 local386 = (Class8_Sub10) local381.method1777(); local386 != null; local386 = (Class8_Sub10) local381.method1782()) {
				local386.method8893();
				Static383.method5604(local386);
			}
		}
		if (Static238.aBoolean310) {
			for (local85 = 0; local85 < Static581.anInt9734; local85++) {
				Static252.aClass2Array1[local85].method20(arg14, arg0);
			}
		}
		if (Static218.aBoolean283) {
			Static225.anIntArray209 = Static205.aClass57_5.Y();
			Static205.aClass57_5.K(Static490.anIntArray539);
			local85 = (Static490.anIntArray539[2] - Static490.anIntArray539[0]) / Static193.anInt8198;
			for (local88 = 0; local88 < Static193.anInt8198 - 1; local88++) {
				Static464.anIntArray473[local88] = local85 * (local88 + 1) + Static106.anIntArray92[local88];
			}
			for (local90 = 0; local90 < Static476.aClass334Array1.length; local90++) {
				Static476.aClass334Array1[local90].method8344();
			}
		}
		if (Static422.aClass174ArrayArrayArray3 != null) {
			if (Static218.aBoolean283) {
				Static75.method1191(0);
			}
			Static494.method7117(true);
			Static205.aClass57_5.ra(-1, 1583160, 40, 127);
			Static90.method1354(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static218.aBoolean283) {
				Static590.method8467();
			}
			Static205.aClass57_5.pa();
			Static494.method7117(false);
		}
		Static90.method1354(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static218.aBoolean283) {
			for (local85 = 0; local85 < Static490.anInt9715; local85++) {
				Static301.aBooleanArrayArrayArray3[local85] = Static535.aBooleanArrayArrayArray4[local85];
			}
			Static75.method1191(0);
			for (local88 = 0; local88 < Static476.aClass334Array1.length; local88++) {
				Static476.aClass334Array1[local88].method8344();
			}
		}
		if (Static218.aBoolean283) {
			Static590.method8467();
			for (local85 = 0; local85 < Static490.anInt9715; local85++) {
				Static535.aBooleanArrayArrayArray4[local85] = Static301.aBooleanArrayArrayArray3[local85];
			}
			if (Static69.anInt1122 == 2) {
				@Pc(595) int local595;
				if (Static269.aLongArray11[0] < Static269.aLongArray11[1]) {
					if (Static464.anIntArray473[0] + Static106.anIntArray92[0] > Static490.anIntArray539[0]) {
						local595 = Static106.anIntArray92[0]++;
					}
				} else if (Static269.aLongArray11[0] > Static269.aLongArray11[1] && Static464.anIntArray473[0] + Static106.anIntArray92[0] < Static490.anIntArray539[2]) {
					local595 = Static106.anIntArray92[0]--;
				}
			}
		}
		if (!Static523.aBoolean667) {
			Static300.aBooleanArrayArray6 = local79;
			Static543.aBooleanArrayArray8 = local81;
		}
		Static50.method785();
	}
}
