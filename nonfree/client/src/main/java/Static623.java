import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "Lclient!wea;")
	public static final Class370 aClass370_2 = new Class370();

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "Lclient!wea;")
	public static final Class370 aClass370_5 = new Class370();

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "Lclient!wea;")
	public static final Class370 aClass370_3 = new Class370();

	@OriginalMember(owner = "client!wea", name = "e", descriptor = "Lclient!wea;")
	public static final Class370 aClass370_4 = new Class370();

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "F")
	public static float aFloat211 = 1.0F;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I")
	public static int method8625() {
		return Static101.aClass59_1.method1954();
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method8626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static378.aBoolean511 = true;
		Static633.aBoolean721 = Static232.aClass5_8.method7517() > 0;
		Static574.aBoolean676 = true;
		Static626.anInt10075 = arg1 >> Static308.anInt5834;
		Static386.anInt7210 = arg3 >> Static308.anInt5834;
		Static596.anInt9756 = arg1;
		Static588.anInt9618 = arg3;
		Static245.anInt4543 = arg2;
		Static573.anInt9445 = Static626.anInt10075 - Static468.anInt10228;
		if (Static573.anInt9445 < 0) {
			Static284.anInt5064 = -Static573.anInt9445;
			Static573.anInt9445 = 0;
		} else {
			Static284.anInt5064 = 0;
		}
		Static376.anInt7040 = Static386.anInt7210 - Static468.anInt10228;
		if (Static376.anInt7040 < 0) {
			Static184.anInt3541 = -Static376.anInt7040;
			Static376.anInt7040 = 0;
		} else {
			Static184.anInt3541 = 0;
		}
		Static505.anInt8726 = Static626.anInt10075 + Static468.anInt10228;
		if (Static505.anInt8726 > Static569.anInt9425) {
			Static505.anInt8726 = Static569.anInt9425;
		}
		Static322.anInt6055 = Static386.anInt7210 + Static468.anInt10228;
		if (Static322.anInt6055 > Static293.anInt5181) {
			Static322.anInt6055 = Static293.anInt5181;
		}
		@Pc(72) boolean[][] local72 = Static579.aBooleanArrayArray7;
		@Pc(74) boolean[][] local74 = Static358.aBooleanArrayArray5;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static574.aBoolean676) {
			for (local78 = 0; local78 < Static468.anInt10228 + Static468.anInt10228 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static468.anInt10228 + Static468.anInt10228 + 2; local85++) {
					if (local85 > 1) {
						Static246.anIntArray240[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static626.anInt10075 + local78 - Static468.anInt10228;
					@Pc(109) int local109 = Static386.anInt7210 + local85 - Static468.anInt10228;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static569.anInt9425 && local109 < Static293.anInt5181) {
						local123 = local103 << Static308.anInt5834;
						@Pc(127) int local127 = local109 << Static308.anInt5834;
						@Pc(144) int local144 = Static559.aClass51Array4[Static559.aClass51Array4.length - 1].method7835(local103, local109) - (0x3E8 << Static308.anInt5834 - 7);
						@Pc(166) int local166 = Static2.aClass51Array1 == null ? Static559.aClass51Array4[0].method7835(local103, local109) + Static384.anInt7200 : Static2.aClass51Array1[0].method7835(local103, local109) + Static384.anInt7200;
						local83 = arg15 >= 0 ? Static232.aClass5_8.r(local123, local144, local127, local123, local166, local127, arg15) : Static232.aClass5_8.JA(local123, local144, local127, local123, local166, local127);
						Static358.aBooleanArrayArray5[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static358.aBooleanArrayArray5[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static246.anIntArray240[local85 - 1] & Static246.anIntArray240[local85] & local81 & local83;
						Static579.aBooleanArrayArray7[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static246.anIntArray240[Static468.anInt10228 + Static468.anInt10228] = local81;
				Static246.anIntArray240[Static468.anInt10228 + Static468.anInt10228 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static378.aBoolean511 = false;
			} else {
				Static386.anIntArray439 = arg5;
				Static181.anIntArray182 = arg6;
				Static142.anIntArray552 = arg7;
				Static180.anIntArray181 = arg8;
				Static637.anIntArray662 = arg9;
				Static206.method3541(arg10, Static232.aClass5_8);
			}
		} else {
			if (Static257.aBooleanArrayArray1 == null) {
				Static257.aBooleanArrayArray1 = new boolean[Static569.anInt9425 + Static569.anInt9425 + 1][Static293.anInt5181 + Static569.anInt9425 + 1];
			}
			for (local78 = 0; local78 < Static257.aBooleanArrayArray1.length; local78++) {
				for (local81 = 0; local81 < Static257.aBooleanArrayArray1[0].length; local81++) {
					Static257.aBooleanArrayArray1[local78][local81] = true;
				}
			}
			Static358.aBooleanArrayArray5 = Static257.aBooleanArrayArray1;
			Static579.aBooleanArrayArray7 = Static257.aBooleanArrayArray1;
			Static573.anInt9445 = 0;
			Static376.anInt7040 = 0;
			Static505.anInt8726 = Static569.anInt9425;
			Static322.anInt6055 = Static293.anInt5181;
			Static378.aBoolean511 = false;
		}
		Static22.method976(Static232.aClass5_8);
		if (!Static374.aClass301_3.aBoolean617) {
			@Pc(349) Class120 local349 = Static374.aClass301_3.aClass120_6;
			for (@Pc(354) Class4_Sub8 local354 = (Class4_Sub8) local349.method2966(); local354 != null; local354 = (Class4_Sub8) local349.method2962()) {
				local354.method7841();
				Static427.method6667(local354);
			}
		}
		if (Static633.aBoolean721) {
			for (local78 = 0; local78 < Static99.anInt2252; local78++) {
				Static89.aClass206Array1[local78].method5265(arg0, arg14);
			}
		}
		if (Static557.aBoolean669) {
			Static53.anIntArray657 = Static232.aClass5_8.Y();
			Static232.aClass5_8.K(Static422.anIntArray466);
			local78 = (Static422.anIntArray466[2] - Static422.anIntArray466[0]) / Static57.anInt1567;
			for (local81 = 0; local81 < Static57.anInt1567 - 1; local81++) {
				Static89.anIntArray77[local81] = local78 * (local81 + 1) + Static511.anIntArray547[local81];
			}
			for (local83 = 0; local83 < Static597.aClass33Array1.length; local83++) {
				Static597.aClass33Array1[local83].method1375();
			}
		}
		if (Static338.aClass77ArrayArrayArray3 != null) {
			if (Static557.aBoolean669) {
				Static568.method8122(0);
			}
			Static48.method1421(true);
			Static232.aClass5_8.ra(-1, 1583160, 40, 127);
			Static111.method2290(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static557.aBoolean669) {
				Static75.method1768();
			}
			Static232.aClass5_8.pa();
			Static48.method1421(false);
		}
		Static111.method2290(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static557.aBoolean669) {
			for (local78 = 0; local78 < Static442.anInt7929; local78++) {
				Static563.aBooleanArrayArrayArray2[local78] = Static251.aBooleanArrayArrayArray1[local78];
			}
			Static568.method8122(0);
			for (local81 = 0; local81 < Static597.aClass33Array1.length; local81++) {
				Static597.aClass33Array1[local81].method1375();
			}
		}
		if (Static557.aBoolean669) {
			Static75.method1768();
			for (local78 = 0; local78 < Static442.anInt7929; local78++) {
				Static251.aBooleanArrayArrayArray1[local78] = Static563.aBooleanArrayArrayArray2[local78];
			}
			if (Static502.anInt8651 == 2) {
				@Pc(543) int local543;
				if (Static390.aLongArray17[0] < Static390.aLongArray17[1]) {
					if (Static89.anIntArray77[0] + Static511.anIntArray547[0] > Static422.anIntArray466[0]) {
						local543 = Static511.anIntArray547[0]++;
					}
				} else if (Static390.aLongArray17[0] > Static390.aLongArray17[1] && Static89.anIntArray77[0] + Static511.anIntArray547[0] < Static422.anIntArray466[2]) {
					local543 = Static511.anIntArray547[0]--;
				}
			}
		}
		if (!Static574.aBoolean676) {
			Static579.aBooleanArrayArray7 = local72;
			Static358.aBooleanArrayArray5 = local74;
		}
		Static468.method8768();
	}
}
