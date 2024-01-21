import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!rd", name = "H", descriptor = "[S")
	public static short[] aShortArray36;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1319 = Static49.method1293("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
	public static int anInt3838 = 0;

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "[I")
	public static int[] anIntArray363 = new int[100];

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
	public static int anInt3839 = 0;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	public static void method2858() {
		anIntArray363 = null;
		aClass70_1319 = null;
		aShortArray36 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(JI)V")
	public static void method2859(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static164.anInt4267 >= 100 && Static143.anInt3770 != 1 || Static164.anInt4267 >= 200) {
			Static41.method1036(Static72.aClass70_714, Static35.aClass70_632, 0);
			return;
		}
		@Pc(33) Class70 local33 = Static108.method2267(arg0).method2898();
		for (@Pc(41) int local41 = 0; local41 < Static164.anInt4267; local41++) {
			if (Static79.aLongArray4[local41] == arg0) {
				Static41.method1036(Static160.method3210(new Class70[] { local33, Static65.aClass70_633 }), Static35.aClass70_632, 0);
				return;
			}
		}
		for (@Pc(80) int local80 = 0; local80 < Static25.anInt695; local80++) {
			if (arg0 == Static120.aLongArray7[local80]) {
				Static41.method1036(Static160.method3210(new Class70[] { Static142.aClass70_1286, local33, Static111.aClass70_1014 }), Static35.aClass70_632, 0);
				return;
			}
		}
		if (local33.method2910(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass70_408)) {
			Static41.method1036(Static16.aClass70_164, Static35.aClass70_632, 0);
			return;
		}
		Static80.aClass70Array13[Static164.anInt4267] = local33;
		Static79.aLongArray4[Static164.anInt4267] = arg0;
		Static107.anIntArray296[Static164.anInt4267] = 0;
		Static48.anIntArray168[Static164.anInt4267] = 0;
		Static102.anInt2901 = Static58.anInt1875;
		Static164.anInt4267++;
		Static131.aClass1_Sub9_Sub1_3.method1283(165);
		Static131.aClass1_Sub9_Sub1_3.method1263(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
	public static void method2860() {
		@Pc(3) int local3 = Static78.anIntArray238[Static184.anInt4570];
		@Pc(7) Class64[] local7 = Static78.aClass64ArrayArray1[Static184.anInt4570];
		Static133.anInt3471 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class64 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt3456 == 1) {
				local27 = local16.anInt3451 + Static34.anInt1115 - Static72.anInt2244;
				if (local27 >= 0 && local27 <= Static34.anInt1115 + Static34.anInt1115) {
					local42 = local16.anInt3455 + Static34.anInt1115 - Static11.anInt384;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3463 + Static34.anInt1115 - Static11.anInt384;
					if (local53 > Static34.anInt1115 + Static34.anInt1115) {
						local53 = Static34.anInt1115 + Static34.anInt1115;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static139.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static142.anInt3764 - local16.anInt3447;
						if (local85 > 32) {
							local16.anInt3457 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3457 = 2;
							local85 = -local85;
						}
						local16.anInt3445 = (local16.anInt3449 - Static108.anInt3059 << 8) / local85;
						local16.anInt3454 = (local16.anInt3448 - Static108.anInt3059 << 8) / local85;
						local16.anInt3464 = (local16.anInt3453 - Static183.anInt4552 << 8) / local85;
						local16.anInt3462 = (local16.anInt3458 - Static183.anInt4552 << 8) / local85;
						Static14.aClass64Array1[Static133.anInt3471++] = local16;
					}
				}
			} else if (local16.anInt3456 == 2) {
				local27 = local16.anInt3455 + Static34.anInt1115 - Static11.anInt384;
				if (local27 >= 0 && local27 <= Static34.anInt1115 + Static34.anInt1115) {
					local42 = local16.anInt3451 + Static34.anInt1115 - Static72.anInt2244;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3444 + Static34.anInt1115 - Static72.anInt2244;
					if (local53 > Static34.anInt1115 + Static34.anInt1115) {
						local53 = Static34.anInt1115 + Static34.anInt1115;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static139.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static108.anInt3059 - local16.anInt3449;
						if (local85 > 32) {
							local16.anInt3457 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3457 = 4;
							local85 = -local85;
						}
						local16.anInt3460 = (local16.anInt3447 - Static142.anInt3764 << 8) / local85;
						local16.anInt3452 = (local16.anInt3461 - Static142.anInt3764 << 8) / local85;
						local16.anInt3464 = (local16.anInt3453 - Static183.anInt4552 << 8) / local85;
						local16.anInt3462 = (local16.anInt3458 - Static183.anInt4552 << 8) / local85;
						Static14.aClass64Array1[Static133.anInt3471++] = local16;
					}
				}
			} else if (local16.anInt3456 == 4) {
				local27 = local16.anInt3453 - Static183.anInt4552;
				if (local27 > 128) {
					local42 = local16.anInt3455 + Static34.anInt1115 - Static11.anInt384;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3463 + Static34.anInt1115 - Static11.anInt384;
					if (local53 > Static34.anInt1115 + Static34.anInt1115) {
						local53 = Static34.anInt1115 + Static34.anInt1115;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt3451 + Static34.anInt1115 - Static72.anInt2244;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt3444 + Static34.anInt1115 - Static72.anInt2244;
						if (local85 > Static34.anInt1115 + Static34.anInt1115) {
							local85 = Static34.anInt1115 + Static34.anInt1115;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static139.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt3457 = 5;
							local16.anInt3460 = (local16.anInt3447 - Static142.anInt3764 << 8) / local27;
							local16.anInt3452 = (local16.anInt3461 - Static142.anInt3764 << 8) / local27;
							local16.anInt3445 = (local16.anInt3449 - Static108.anInt3059 << 8) / local27;
							local16.anInt3454 = (local16.anInt3448 - Static108.anInt3059 << 8) / local27;
							Static14.aClass64Array1[Static133.anInt3471++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
	public static void method2861() {
		@Pc(1) Class63 local1 = Static121.aClass63_1;
		synchronized (Static121.aClass63_1) {
			Static109.anInt3064 = Static158.anInt4149;
			Static21.anInt591 = Static54.anInt1754;
			Static70.anInt2156 = Static101.anInt2866;
			Static63.anInt1966 = Static159.anInt4159;
			Static170.anInt4392 = Static129.anInt4421;
			Static15.anInt450 = Static3.anInt173;
			Static118.aLong103 = Static82.aLong74;
			Static159.anInt4159 = 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
	public static void method2862() {
		for (@Pc(10) Class1_Sub14 local10 = (Class1_Sub14) Static128.aClass30_14.method1470(); local10 != null; local10 = (Class1_Sub14) Static128.aClass30_14.method1473()) {
			@Pc(15) int local15 = local10.anInt2467;
			if (Static106.method2213(local15)) {
				@Pc(21) boolean local21 = true;
				@Pc(25) Class39[] local25 = Static77.aClass39ArrayArray1[local15];
				for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
					if (local25[local27] != null) {
						local21 = local25[local27].aBoolean89;
						break;
					}
				}
				if (!local21) {
					@Pc(51) int local51 = (int) local10.aLong147;
					@Pc(55) Class39 local55 = Static128.method3227(local51);
					if (local55 != null) {
						Static171.method3407(local55);
					}
				}
			}
		}
	}
}
