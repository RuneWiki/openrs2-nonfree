import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qg", name = "L", descriptor = "I")
	public static int anInt5295 = 500;

	@OriginalMember(owner = "client!qg", name = "O", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_82 = new Class154(8);

	@OriginalMember(owner = "client!qg", name = "W", descriptor = "[I")
	public static final int[] anIntArray436 = new int[3];

	@OriginalMember(owner = "client!qg", name = "X", descriptor = "Z")
	public static boolean aBoolean448 = true;

	@OriginalMember(owner = "client!qg", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString191 = "Loaded title screen";

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lclient!pa;")
	public static Class4_Sub1_Sub17 method4394(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1_Sub17 local10 = (Class4_Sub1_Sub17) Static41.aClass15_1.method356((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static225.aClass11_90.method288(Static174.method3271(arg0), Static294.method3381(arg0));
		local10 = new Class4_Sub1_Sub17();
		if (local24 != null) {
			local10.method4089(new Class4_Sub7(local24));
		}
		Static41.aClass15_1.method352((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
	public static void method4395() {
		while (true) {
			@Pc(15) Class4_Sub34 local15 = (Class4_Sub34) Static320.aClass130_142.method3500();
			if (local15 == null) {
				return;
			}
			if (Static18.aClass57ArrayArrayArray1 != null) {
				@Pc(37) Class2_Sub2_Sub1 local37;
				@Pc(28) int local28;
				if (local15.anInt5224 < 0) {
					local28 = -local15.anInt5224 - 1;
					if (Static321.anInt6343 == local28) {
						local37 = Static110.aClass2_Sub2_Sub1_Sub1_1;
					} else {
						local37 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local28];
					}
				} else {
					local28 = local15.anInt5224 - 1;
					local37 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local28];
				}
				if (local37 != null) {
					@Pc(61) Class56 local61 = Static320.method5290(local15.anInt5226);
					@Pc(72) int local72;
					@Pc(75) int local75;
					if (local15.anInt5222 == 1 || local15.anInt5222 == 3) {
						local72 = local61.anInt1330;
						local75 = local61.anInt1313;
					} else {
						local72 = local61.anInt1313;
						local75 = local61.anInt1330;
					}
					@Pc(91) int local91 = local15.anInt5227 + (local72 >> 1);
					@Pc(100) int local100 = (local72 + 1 >> 1) + local15.anInt5227;
					@Pc(108) int local108 = local15.anInt5230 + (local75 >> 1);
					@Pc(117) int local117 = (local75 + 1 >> 1) + local15.anInt5230;
					@Pc(122) Class26 local122 = Static307.aClass26Array3[local37.aByte73];
					@Pc(144) int local144 = local122.method4996(local91, local108) + local122.method4996(local100, local108) + local122.method4996(local91, local117) + local122.method4996(local100, local117) >> 2;
					@Pc(146) Interface5 local146 = null;
					@Pc(151) int local151 = Static264.anIntArray302[local15.anInt5229];
					if (local151 == 0) {
						local146 = (Interface5) Static122.method2458(local37.aByte73, local15.anInt5227, local15.anInt5230);
					} else if (local151 == 1) {
						local146 = (Interface5) Static186.method4780(local37.aByte73, local15.anInt5227, local15.anInt5230);
					} else if (local151 == 2) {
						local146 = (Interface5) Static166.method3153(local37.aByte73, local15.anInt5227, local15.anInt5230, io.class);
					} else if (local151 == 3) {
						local146 = (Interface5) Static5.method210(local37.aByte73, local15.anInt5227, local15.anInt5230);
					}
					if (local146 != null) {
						Static322.method5312(0, local15.anInt5223, -1, 0, local37.aByte73, local15.anInt5227, local151, local15.anInt5234 + 1, local15.anInt5230);
						local37.anInt6554 = local15.anInt5223 + Static342.anInt6706;
						local37.anInt6546 = Static342.anInt6706 + local15.anInt5234;
						local37.anInt6549 = local72 * 64 + local15.anInt5227 * 128;
						local37.anInt6555 = local75 * 64 + local15.anInt5230 * 128;
						local37.anInterface5_3 = local146;
						local37.anInt6544 = local144;
						@Pc(277) int local277 = local15.anInt5238;
						@Pc(280) int local280 = local15.anInt5236;
						@Pc(283) int local283 = local15.anInt5235;
						@Pc(286) int local286 = local15.anInt5232;
						@Pc(291) int local291;
						if (local277 > local280) {
							local291 = local277;
							local277 = local280;
							local280 = local291;
						}
						local37.anInt6553 = local15.anInt5227 + local277;
						local37.anInt6550 = local15.anInt5227 + local280;
						if (local283 > local286) {
							local291 = local283;
							local283 = local286;
							local286 = local291;
						}
						local37.anInt6545 = local286 + local15.anInt5230;
						local37.anInt6543 = local15.anInt5230 + local283;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZII[B)Ljava/lang/String;")
	public static String method4397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(22) int local22 = arg2[local12 + arg1] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(40) char local40 = Static306.aCharArray6[local22 - 128];
					if (local40 == '\u0000') {
						local40 = '?';
					}
					local22 = local40;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(B)V")
	public static void method4399() {
		Static165.aClass154_54.method4219();
	}
}
