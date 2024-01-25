import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!qa;Z)V")
	public static void method4008(@OriginalArg(0) Class4 arg0) {
		if (Static14.anInt321 != Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 && (Static263.aClass64ArrayArrayArray3 != null && Static379.method6614(Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108, arg0))) {
			Static14.anInt321 = Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "()V")
	public static void method4010() {
		Static349.anInt6412 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static84.anInt1919; local3++) {
			@Pc(8) Class192 local8 = Static220.aClass192Array2[local3];
			@Pc(12) int local12;
			if (Static90.anIntArray143 != null) {
				for (local12 = 0; local12 < Static90.anIntArray143.length; local12++) {
					if (Static90.anIntArray143[local12] != -1000000 && (local8.anInt5930 <= Static90.anIntArray143[local12] || local8.anInt5942 <= Static90.anIntArray143[local12]) && (local8.anInt5937 <= Static132.anIntArray233[local12] || local8.anInt5949 <= Static132.anIntArray233[local12]) && (local8.anInt5937 >= Static238.anIntArray354[local12] || local8.anInt5949 >= Static238.anIntArray354[local12]) && (local8.anInt5944 <= Static511.anIntArray782[local12] || local8.anInt5947 <= Static511.anIntArray782[local12]) && (local8.anInt5944 >= Static485.anIntArray684[local12] || local8.anInt5947 >= Static485.anIntArray684[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt5935 == 1) {
				local12 = local8.anInt5946 + Static466.anInt8044 - Static539.anInt9517;
				if (local12 >= 0 && local12 <= Static466.anInt8044 + Static466.anInt8044) {
					local110 = local8.anInt5941 + Static466.anInt8044 - Static421.anInt7325;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static466.anInt8044 + Static466.anInt8044) {
						continue;
					}
					local128 = local8.anInt5936 + Static466.anInt8044 - Static421.anInt7325;
					if (local128 > Static466.anInt8044 + Static466.anInt8044) {
						local128 = Static466.anInt8044 + Static466.anInt8044;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static38.aBooleanArrayArray1[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static107.anInt2259 - local8.anInt5937;
						if (local164 > Static194.anInt3975) {
							local8.anInt5943 = 1;
						} else {
							if (local164 >= -Static194.anInt3975) {
								continue;
							}
							local8.anInt5943 = 2;
							local164 = -local164;
						}
						local8.anInt5948 = (local8.anInt5944 - Static478.anInt8519 << 8) / local164;
						local8.anInt5945 = (local8.anInt5947 - Static478.anInt8519 << 8) / local164;
						local8.anInt5938 = (local8.anInt5930 - Static343.anInt9291 << 8) / local164;
						local8.anInt5933 = (local8.anInt5942 - Static343.anInt9291 << 8) / local164;
						Static79.aClass192Array1[Static349.anInt6412++] = local8;
					}
				}
			} else if (local8.anInt5935 == 2) {
				local12 = local8.anInt5941 + Static466.anInt8044 - Static421.anInt7325;
				if (local12 >= 0 && local12 <= Static466.anInt8044 + Static466.anInt8044) {
					local110 = local8.anInt5946 + Static466.anInt8044 - Static539.anInt9517;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static466.anInt8044 + Static466.anInt8044) {
						continue;
					}
					local128 = local8.anInt5939 + Static466.anInt8044 - Static539.anInt9517;
					if (local128 > Static466.anInt8044 + Static466.anInt8044) {
						local128 = Static466.anInt8044 + Static466.anInt8044;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static38.aBooleanArrayArray1[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static478.anInt8519 - local8.anInt5944;
						if (local164 > Static194.anInt3975) {
							local8.anInt5943 = 3;
						} else {
							if (local164 >= -Static194.anInt3975) {
								continue;
							}
							local8.anInt5943 = 4;
							local164 = -local164;
						}
						local8.anInt5931 = (local8.anInt5937 - Static107.anInt2259 << 8) / local164;
						local8.anInt5932 = (local8.anInt5949 - Static107.anInt2259 << 8) / local164;
						local8.anInt5938 = (local8.anInt5930 - Static343.anInt9291 << 8) / local164;
						local8.anInt5933 = (local8.anInt5942 - Static343.anInt9291 << 8) / local164;
						Static79.aClass192Array1[Static349.anInt6412++] = local8;
					}
				}
			} else if (local8.anInt5935 == 4) {
				local12 = local8.anInt5930 - Static343.anInt9291;
				if (local12 > Static289.anInt5544) {
					local110 = local8.anInt5941 + Static466.anInt8044 - Static421.anInt7325;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static466.anInt8044 + Static466.anInt8044) {
						continue;
					}
					local128 = local8.anInt5936 + Static466.anInt8044 - Static421.anInt7325;
					if (local128 > Static466.anInt8044 + Static466.anInt8044) {
						local128 = Static466.anInt8044 + Static466.anInt8044;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt5946 + Static466.anInt8044 - Static539.anInt9517;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static466.anInt8044 + Static466.anInt8044) {
						continue;
					}
					local164 = local8.anInt5939 + Static466.anInt8044 - Static539.anInt9517;
					if (local164 > Static466.anInt8044 + Static466.anInt8044) {
						local164 = Static466.anInt8044 + Static466.anInt8044;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static38.aBooleanArrayArray1[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt5943 = 5;
						local8.anInt5931 = (local8.anInt5937 - Static107.anInt2259 << 8) / local12;
						local8.anInt5932 = (local8.anInt5949 - Static107.anInt2259 << 8) / local12;
						local8.anInt5948 = (local8.anInt5944 - Static478.anInt8519 << 8) / local12;
						local8.anInt5945 = (local8.anInt5947 - Static478.anInt8519 << 8) / local12;
						Static79.aClass192Array1[Static349.anInt6412++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!he;II)V")
	public static void method4011(@OriginalArg(0) Class126 arg0, @OriginalArg(2) int arg1) {
		if (Static141.aBoolean240) {
			Static141.aBoolean240 = false;
			arg1 = 0;
		}
		if (Static17.aClass126_1 != null && Static17.aClass126_1.method3241(arg0)) {
			return;
		}
		Static17.aClass126_1 = arg0;
		Static205.aLong179 = Static110.method2222();
		Static398.anInt7023 = arg1;
		Static49.anInt1303 = arg1;
		if (Static49.anInt1303 != 0) {
			Static59.aFloat36 = Static487.aFloat183;
			Static351.aFloat138 = Static497.aFloat38;
			Static55.aFloat32 = Static32.aFloat27;
			Static313.aFloat133 = Static199.aFloat35;
			Static76.aFloat41 = Static316.aFloat134;
			Static255.anInt4996 = Static342.anInt6309;
			Static39.anInt1115 = Static202.anInt4056;
			Static303.aClass103_3 = Static442.aClass103_4;
			Static65.aFloat39 = Static86.aFloat43;
			Static540.anInt9540 = Static39.anInt1114;
			return;
		}
		Static522.method7947();
	}
}
