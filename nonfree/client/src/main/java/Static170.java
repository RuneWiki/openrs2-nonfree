import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!ek;")
	public static Class42 aClass42_48;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	public static int anInt3752 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	public static void method3081(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub10 local6 = (Class2_Sub10) Static219.aClass101_18.method2867((long) arg0);
		if (local6 != null) {
			local6.method4743();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!th;I)V")
	public static void method3082(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub2_Sub2 arg1) {
		@Pc(16) Class2_Sub31 local16 = (Class2_Sub31) Static304.aClass101_26.method2867((long) arg0);
		if (local16 == null) {
			return;
		}
		if (local16.aClass2_Sub3_Sub2_3 != null) {
			Static173.aClass2_Sub3_Sub4_2.method4662(local16.aClass2_Sub3_Sub2_3);
			local16.aClass2_Sub3_Sub2_3 = null;
		}
		local16.method4743();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(CI)Z")
	public static boolean method3087(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static24.method478(arg0)) {
			return true;
		} else {
			@Pc(25) char[] local25 = Static192.aCharArray6;
			@Pc(27) int local27;
			@Pc(35) char local35;
			for (local27 = 0; local27 < local25.length; local27++) {
				local35 = local25[local27];
				if (local35 == arg0) {
					return true;
				}
			}
			local25 = Static75.aCharArray2;
			for (local27 = 0; local27 < local25.length; local27++) {
				local35 = local25[local27];
				if (arg0 == local35) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public static void method3088() {
		for (@Pc(10) int local10 = 0; local10 < Static222.anInt4523; local10++) {
			@Pc(21) int local21 = Static132.anIntArray303[local10];
			@Pc(25) Class15_Sub2_Sub1 local25 = Static35.aClass15_Sub2_Sub1Array2[local21];
			@Pc(29) int local29 = Static91.aClass2_Sub16_Sub1_1.method2146();
			if ((local29 & 0x1) != 0) {
				local29 += Static91.aClass2_Sub16_Sub1_1.method2146() << 8;
			}
			@Pc(57) int local57;
			@Pc(67) int local67;
			if ((local29 & 0x40) != 0) {
				local57 = Static91.aClass2_Sub16_Sub1_1.method2152();
				if (local57 == 65535) {
					local57 = -1;
				}
				local67 = Static91.aClass2_Sub16_Sub1_1.method2133();
				Static148.method2636(local57, local67, local25);
			}
			if ((local29 & 0x8) != 0) {
				local25.anInt5352 = Static91.aClass2_Sub16_Sub1_1.method2195();
				if (local25.anInt5352 == 65535) {
					local25.anInt5352 = -1;
				}
			}
			if ((local29 & 0x100) != 0) {
				local57 = Static91.aClass2_Sub16_Sub1_1.method2175();
				@Pc(107) int[] local107 = new int[local57];
				@Pc(110) int[] local110 = new int[local57];
				@Pc(113) int[] local113 = new int[local57];
				for (@Pc(115) int local115 = 0; local115 < local57; local115++) {
					@Pc(122) int local122 = Static91.aClass2_Sub16_Sub1_1.method2130();
					if (local122 == 65535) {
						local122 = -1;
					}
					local107[local115] = local122;
					local113[local115] = Static91.aClass2_Sub16_Sub1_1.method2133();
					local110[local115] = Static91.aClass2_Sub16_Sub1_1.method2130();
				}
				Static164.method2988(local113, local110, local25, local107);
			}
			if ((local29 & 0x4) != 0) {
				local57 = Static91.aClass2_Sub16_Sub1_1.method2175();
				local67 = Static91.aClass2_Sub16_Sub1_1.method2175();
				local25.method4284(Static268.anInt5236, local57, local67);
				local25.anInt5309 = Static268.anInt5236 + 300;
				local25.anInt5337 = Static91.aClass2_Sub16_Sub1_1.method2133();
			}
			if ((local29 & 0x2) != 0) {
				local57 = Static91.aClass2_Sub16_Sub1_1.method2175();
				local67 = Static91.aClass2_Sub16_Sub1_1.method2133();
				local25.method4284(Static268.anInt5236, local57, local67);
			}
			if ((local29 & 0x20) != 0) {
				local57 = Static91.aClass2_Sub16_Sub1_1.method2137();
				local67 = Static91.aClass2_Sub16_Sub1_1.method2145();
				if (local57 == 65535) {
					local57 = -1;
				}
				@Pc(226) boolean local226 = true;
				if (local57 != -1 && local25.anInt5301 != -1 && Static208.method3496(Static156.method2852(local57).anInt3389).anInt3870 < Static208.method3496(Static156.method2852(local25.anInt5301).anInt3389).anInt3870) {
					local226 = false;
				}
				if (local226) {
					local25.anInt5326 = local67 >> 16;
					local25.anInt5363 = 1;
					local25.anInt5301 = local57;
					local25.anInt5316 = 0;
					local25.anInt5321 = 0;
					local25.anInt5367 = Static268.anInt5236 + (local67 & 0xFFFF);
					if (local25.anInt5367 > Static268.anInt5236) {
						local25.anInt5316 = -1;
					}
					if (local25.anInt5301 != -1 && Static268.anInt5236 == local25.anInt5367) {
						@Pc(309) int local309 = Static156.method2852(local25.anInt5301).anInt3389;
						if (local309 != -1) {
							@Pc(316) Class112 local316 = Static208.method3496(local309);
							if (local316 != null && local316.anIntArray378 != null) {
								Static28.method558(false, local316, 0, local25.anInt5358, local25.anInt5371);
							}
						}
					}
				}
			}
			if ((local29 & 0x80) != 0) {
				if (local25.aClass188_1.method4608()) {
					Static38.method717(local25);
				}
				local25.method633(Static60.method1158(Static91.aClass2_Sub16_Sub1_1.method2137()));
				local25.method4285(local25.aClass188_1.anInt5867);
				local25.anInt5307 = local25.aClass188_1.anInt5856;
				local25.anInt5338 = local25.aClass188_1.anInt5849;
				if (local25.aClass188_1.method4608()) {
					Static256.method4029(null, Static32.anInt876, local25.anIntArray518[0], 0, local25.anIntArray516[0], local25, null, 0);
				}
			}
			if ((local29 & 0x10) != 0) {
				local25.aString181 = Static91.aClass2_Sub16_Sub1_1.method2158();
				local25.anInt5374 = 100;
			}
			if ((local29 & 0x200) != 0) {
				local25.anInt5324 = Static91.aClass2_Sub16_Sub1_1.method2195();
				local25.anInt5344 = Static91.aClass2_Sub16_Sub1_1.method2195();
			}
		}
	}
}
