import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
	public static int anInt6594;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "Lclient!lt;")
	public static Class218 aClass218_1;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Lclient!kg;")
	public static final Class186 aClass186_11 = new Class186(10, 2, 2, 0);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method5828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static157.aBoolean242 = true;
		Static237.aBoolean328 = Static480.aClass126_12.method7032() > 0;
		Static631.aBoolean829 = true;
		Static484.anInt8046 = arg1 >> Static162.anInt2830;
		Static263.anInt4379 = arg3 >> Static162.anInt2830;
		Static384.anInt6759 = arg1;
		Static551.anInt9128 = arg3;
		Static352.anInt6299 = arg2;
		Static188.anInt10382 = Static484.anInt8046 - Static597.anInt9765;
		if (Static188.anInt10382 < 0) {
			Static621.anInt10076 = -Static188.anInt10382;
			Static188.anInt10382 = 0;
		} else {
			Static621.anInt10076 = 0;
		}
		Static143.anInt4618 = Static263.anInt4379 - Static597.anInt9765;
		if (Static143.anInt4618 < 0) {
			Static624.anInt10110 = -Static143.anInt4618;
			Static143.anInt4618 = 0;
		} else {
			Static624.anInt10110 = 0;
		}
		Static465.anInt7141 = Static484.anInt8046 + Static597.anInt9765;
		if (Static465.anInt7141 > Static129.anInt6336) {
			Static465.anInt7141 = Static129.anInt6336;
		}
		Static97.anInt1545 = Static263.anInt4379 + Static597.anInt9765;
		if (Static97.anInt1545 > Static150.anInt2400) {
			Static97.anInt1545 = Static150.anInt2400;
		}
		@Pc(72) boolean[][] local72 = Static601.aBooleanArrayArray17;
		@Pc(74) boolean[][] local74 = Static192.aBooleanArrayArray15;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static631.aBoolean829) {
			for (local78 = 0; local78 < Static597.anInt9765 + Static597.anInt9765 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static597.anInt9765 + Static597.anInt9765 + 2; local85++) {
					if (local85 > 1) {
						Static636.anIntArray827[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static484.anInt8046 + local78 - Static597.anInt9765;
					@Pc(109) int local109 = Static263.anInt4379 + local85 - Static597.anInt9765;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static129.anInt6336 && local109 < Static150.anInt2400) {
						local123 = local103 << Static162.anInt2830;
						@Pc(127) int local127 = local109 << Static162.anInt2830;
						@Pc(144) int local144 = Static492.aClass40Array3[Static492.aClass40Array3.length - 1].method8442(local103, local109) - (0x3E8 << Static162.anInt2830 - 7);
						@Pc(166) int local166 = Static327.aClass40Array2 == null ? Static492.aClass40Array3[0].method8442(local103, local109) + Static407.anInt7012 : Static327.aClass40Array2[0].method8442(local103, local109) + Static407.anInt7012;
						local83 = arg15 >= 0 ? Static480.aClass126_12.r(local123, local144, local127, local123, local166, local127, arg15) : Static480.aClass126_12.JA(local123, local144, local127, local123, local166, local127);
						Static192.aBooleanArrayArray15[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static192.aBooleanArrayArray15[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static636.anIntArray827[local85 - 1] & Static636.anIntArray827[local85] & local81 & local83;
						Static601.aBooleanArrayArray17[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static636.anIntArray827[Static597.anInt9765 + Static597.anInt9765] = local81;
				Static636.anIntArray827[Static597.anInt9765 + Static597.anInt9765 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static157.aBoolean242 = false;
			} else {
				Static113.anIntArray154 = arg5;
				Static125.anIntArray166 = arg6;
				Static126.anIntArray168 = arg7;
				Static192.anIntArray689 = arg8;
				Static460.anIntArray619 = arg9;
				Static204.method3176(Static480.aClass126_12, arg10);
			}
		} else {
			if (Static475.aBooleanArrayArray14 == null) {
				Static475.aBooleanArrayArray14 = new boolean[Static129.anInt6336 + Static129.anInt6336 + 1][Static150.anInt2400 + Static129.anInt6336 + 1];
			}
			for (local78 = 0; local78 < Static475.aBooleanArrayArray14.length; local78++) {
				for (local81 = 0; local81 < Static475.aBooleanArrayArray14[0].length; local81++) {
					Static475.aBooleanArrayArray14[local78][local81] = true;
				}
			}
			Static192.aBooleanArrayArray15 = Static475.aBooleanArrayArray14;
			Static601.aBooleanArrayArray17 = Static475.aBooleanArrayArray14;
			Static188.anInt10382 = 0;
			Static143.anInt4618 = 0;
			Static465.anInt7141 = Static129.anInt6336;
			Static97.anInt1545 = Static150.anInt2400;
			Static157.aBoolean242 = false;
		}
		Static213.method3235(Static480.aClass126_12);
		if (!Static599.aClass43_3.aBoolean66) {
			@Pc(349) Class363 local349 = Static599.aClass43_3.aClass363_2;
			for (@Pc(354) Class14_Sub10 local354 = (Class14_Sub10) local349.method8484(); local354 != null; local354 = (Class14_Sub10) local349.method8478()) {
				local354.method8904();
				Static435.method6488(local354);
			}
		}
		if (Static237.aBoolean328) {
			for (local78 = 0; local78 < Static181.anInt3279; local78++) {
				Static580.aClass175Array12[local78].method4040(arg0, arg14);
			}
		}
		if (Static425.aBoolean601) {
			Static209.anIntArray295 = Static480.aClass126_12.Y();
			Static480.aClass126_12.K(Static272.anIntArray370);
			local78 = (Static272.anIntArray370[2] - Static272.anIntArray370[0]) / Static401.anInt8429;
			for (local81 = 0; local81 < Static401.anInt8429 - 1; local81++) {
				Static466.anIntArray626[local81] = local78 * (local81 + 1) + Static613.anIntArray806[local81];
			}
			for (local83 = 0; local83 < Static311.aClass301Array1.length; local83++) {
				Static311.aClass301Array1[local83].method7150();
			}
		}
		if (Static573.aClass156ArrayArrayArray3 != null) {
			if (Static425.aBoolean601) {
				Static304.method4410(0);
			}
			Static113.method1651(true);
			Static480.aClass126_12.ra(-1, 1583160, 40, 127);
			Static272.method4134(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static425.aBoolean601) {
				Static94.method8740();
			}
			Static480.aClass126_12.pa();
			Static113.method1651(false);
		}
		Static272.method4134(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static425.aBoolean601) {
			for (local78 = 0; local78 < Static36.anInt662; local78++) {
				Static176.aBooleanArrayArrayArray1[local78] = Static563.aBooleanArrayArrayArray2[local78];
			}
			Static304.method4410(0);
			for (local81 = 0; local81 < Static311.aClass301Array1.length; local81++) {
				Static311.aClass301Array1[local81].method7150();
			}
		}
		if (Static425.aBoolean601) {
			Static94.method8740();
			for (local78 = 0; local78 < Static36.anInt662; local78++) {
				Static563.aBooleanArrayArrayArray2[local78] = Static176.aBooleanArrayArrayArray1[local78];
			}
			if (Static40.anInt704 == 2) {
				@Pc(543) int local543;
				if (Static157.aLongArray2[0] < Static157.aLongArray2[1]) {
					if (Static466.anIntArray626[0] + Static613.anIntArray806[0] > Static272.anIntArray370[0]) {
						local543 = Static613.anIntArray806[0]++;
					}
				} else if (Static157.aLongArray2[0] > Static157.aLongArray2[1] && Static466.anIntArray626[0] + Static613.anIntArray806[0] < Static272.anIntArray370[2]) {
					local543 = Static613.anIntArray806[0]--;
				}
			}
		}
		if (!Static631.aBoolean829) {
			Static601.aBooleanArrayArray17 = local72;
			Static192.aBooleanArrayArray15 = local74;
		}
		Static7.method167();
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
	public static void method5829() {
		@Pc(12) Class5_Sub40 local12 = Static25.method507(Static98.aClass208_2, Static639.aClass181_96);
		local12.aClass5_Sub12_Sub2_2.method8655(Static115.anInt1789);
		Static612.method8496(local12);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V")
	public static void method5830() {
		try {
			@Pc(17) Method local17 = Runtime.class.getMethod("availableProcessors");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Integer local27 = (Integer) local17.invoke(local21, (Object[]) null);
					Static209.anInt3631 = local27;
				} catch (@Pc(32) Throwable local32) {
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!ma;II)V")
	public static void method5838(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub32 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg2 << 28 | arg0 << 14);
		@Pc(22) Class5_Sub17 local22 = (Class5_Sub17) Static402.aClass81_65.method1599(local16);
		if (local22 == null) {
			local22 = new Class5_Sub17();
			Static402.aClass81_65.method1607(local22, local16);
			local22.aClass306_14.method7303(arg1);
			return;
		}
		@Pc(52) Class329 local52 = Static479.aClass348_1.method8197(arg1.anInt5871);
		@Pc(55) int local55 = local52.anInt9078;
		if (local52.anInt9090 == 1) {
			local55 *= arg1.anInt5869 + 1;
		}
		for (@Pc(74) Class5_Sub32 local74 = (Class5_Sub32) local22.aClass306_14.method7313(); local74 != null; local74 = (Class5_Sub32) local22.aClass306_14.method7301()) {
			local52 = Static479.aClass348_1.method8197(local74.anInt5871);
			@Pc(85) int local85 = local52.anInt9078;
			if (local52.anInt9090 == 1) {
				local85 *= local74.anInt5869 + 1;
			}
			if (local55 > local85) {
				Static592.method8903(local74, arg1);
				return;
			}
		}
		local22.aClass306_14.method7303(arg1);
	}
}
