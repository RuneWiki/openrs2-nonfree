import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "Lclient!gj;")
	public static Class124 aClass124_51;

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lclient!iu;")
	public static Class166 aClass166_1;

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
	public static final int anInt7770 = 2;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method6432(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static287.anInt5340++;
		Static387.anInt9643 = 0;
		@Pc(14) int local14;
		@Pc(17) int local17;
		for (@Pc(7) int local7 = Static410.anInt7087; local7 < Static562.anInt9418; local7++) {
			@Pc(12) Class100[][] local12 = Static309.aClass100ArrayArrayArray2[local7];
			for (local14 = Static580.anInt2683; local14 < Static19.anInt391; local14++) {
				for (local17 = Static312.anInt9781; local17 < Static268.anInt5152; local17++) {
					@Pc(24) Class100 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static56.aBooleanArrayArray1[local14 + Static415.anInt7175 - Static22.anInt439][local17 + Static415.anInt7175 - Static140.anInt3150] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean244 = true;
							local24.aBoolean246 = true;
							if (local24.aClass35_2 == null) {
								local24.aBoolean245 = false;
							} else {
								local24.aBoolean245 = true;
							}
							Static387.anInt9643++;
						} else {
							local24.aBoolean244 = false;
							local24.aBoolean246 = false;
							local24.aByte35 = 0;
							if (local14 >= Static22.anInt439 - 16 && local14 <= Static22.anInt439 + 16 && local17 >= Static140.anInt3150 - 16 && local17 <= Static140.anInt3150 + 16 && (local24.aClass10_Sub2_3 != null || local24.aClass10_Sub2_2 != null || local24.aClass10_Sub4_1 != null || local24.aClass10_Sub4_2 != null || local24.aClass10_Sub5_1 != null || local24.aClass35_2 != null)) {
								Static146.aClass40_1.method7707(local24);
							}
						}
					}
				}
			}
		}
		for (@Pc(140) int local140 = Static410.anInt7087; local140 < Static562.anInt9418; local140++) {
			if (Static474.aClass66_8.method6834() && local140 >= arg2 && arg1 != null) {
				local14 = Static56.aBooleanArrayArray1.length;
				if (Static580.anInt2683 + Static56.aBooleanArrayArray1.length > Static173.anInt3719) {
					local14 -= Static580.anInt2683 + Static56.aBooleanArrayArray1.length - Static173.anInt3719;
				}
				local17 = Static56.aBooleanArrayArray1[0].length;
				if (Static312.anInt9781 + Static56.aBooleanArrayArray1[0].length > Static357.anInt6212) {
					local17 -= Static312.anInt9781 + Static56.aBooleanArrayArray1[0].length - Static357.anInt6212;
				}
				@Pc(193) int local193 = Static100.anInt9638;
				while (true) {
					if (local193 >= local14) {
						Static146.aClass40_1.method7709(Static112.aClass16Array3[local140], local140, true);
						break;
					}
					@Pc(200) int local200 = local193 + Static580.anInt2683 - Static100.anInt9638;
					for (@Pc(202) int local202 = Static497.anInt8601; local202 < local17; local202++) {
						Static575.aBooleanArrayArray6[local193][local202] = false;
						if (Static56.aBooleanArrayArray1[local193][local202]) {
							@Pc(221) int local221 = local202 + Static312.anInt9781 - Static497.anInt8601;
							for (@Pc(223) int local223 = local140; local223 >= 0; local223--) {
								if (Static309.aClass100ArrayArrayArray2[local223][local200][local221] != null && Static309.aClass100ArrayArrayArray2[local223][local200][local221].aByte34 == local140) {
									Static575.aBooleanArrayArray6[local193][local202] = Static309.aClass100ArrayArrayArray2[local223][local200][local221].aBoolean244;
									break;
								}
							}
						}
					}
					local193++;
				}
			} else {
				Static146.aClass40_1.method7709(Static112.aClass16Array3[local140], local140, false);
			}
			Static146.aClass40_1.method7713();
		}
		if (!Static283.method4484(true)) {
			Static283.method4484(false);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BI)[B")
	public static byte[] method6434(@OriginalArg(1) int arg0) {
		@Pc(22) Class4_Sub7_Sub11 local22 = (Class4_Sub7_Sub11) Static183.aClass122_1.method3206((long) arg0);
		if (local22 == null) {
			@Pc(27) byte[] local27 = new byte[512];
			@Pc(33) Random local33 = new Random((long) arg0);
			for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
				local27[local35] = (byte) local35;
			}
			for (@Pc(50) int local50 = 0; local50 < 255; local50++) {
				@Pc(57) int local57 = 255 - local50;
				@Pc(62) int local62 = Static87.method2047(local57, local33);
				@Pc(66) byte local66 = local27[local62];
				local27[local62] = local27[local57];
				local27[local57] = local27[511 - local50] = local66;
			}
			local22 = new Class4_Sub7_Sub11(local27);
			Static183.aClass122_1.method3207(local22, (long) arg0);
		}
		return local22.aByteArray60;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IZIIZI)V")
	public static void method6435(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) long local18 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		@Pc(24) Class4_Sub20 local24 = (Class4_Sub20) Static578.aClass183_42.method4289(local18);
		if (local24 == null) {
			local24 = new Class4_Sub20();
			Static578.aClass183_42.method4282(local18, local24);
		}
		if (local24.anIntArray309.length <= arg4) {
			@Pc(45) int[] local45 = new int[arg4 + 1];
			@Pc(50) int[] local50 = new int[arg4 + 1];
			for (@Pc(52) int local52 = 0; local52 < local24.anIntArray309.length; local52++) {
				local45[local52] = local24.anIntArray309[local52];
				local50[local52] = local24.anIntArray308[local52];
			}
			for (@Pc(82) int local82 = local24.anIntArray309.length; local82 < arg4; local82++) {
				local45[local82] = -1;
				local50[local82] = 0;
			}
			local24.anIntArray308 = local50;
			local24.anIntArray309 = local45;
		}
		local24.anIntArray309[arg4] = arg3;
		local24.anIntArray308[arg4] = arg2;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)V")
	public static void method6436(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub7_Sub5 local16 = Static218.method3780(12, arg0);
		local16.method3062();
	}
}
