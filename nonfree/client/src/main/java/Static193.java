import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "Lclient!ee;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "Lclient!rk;")
	public static Class180 aClass180_51;

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "Lclient!ka;")
	public static Class7_Sub8_Sub2 aClass7_Sub8_Sub2_2;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "Lclient!ik;")
	public static Class103 aClass103_36 = new Class103(64);

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString248 = "glow2:";

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()V")
	public static void method3463() {
		Static309.anInt5902 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static140.anInt3044; local3++) {
			@Pc(8) Class142 local8 = Static125.aClass142Array2[local3];
			@Pc(12) int local12;
			if (Static334.anIntArray810 != null) {
				for (local12 = 0; local12 < Static334.anIntArray810.length; local12++) {
					if (Static334.anIntArray810[local12] != -1000000 && (local8.anInt4254 <= Static334.anIntArray810[local12] || local8.anInt4242 <= Static334.anIntArray810[local12]) && (local8.anInt4249 <= Static309.anIntArray750[local12] || local8.anInt4262 <= Static309.anIntArray750[local12]) && (local8.anInt4249 >= Static287.anIntArray714[local12] || local8.anInt4262 >= Static287.anIntArray714[local12]) && (local8.anInt4253 <= Static121.anIntArray366[local12] || local8.anInt4263 <= Static121.anIntArray366[local12]) && (local8.anInt4253 >= Static103.anIntArray332[local12] || local8.anInt4263 >= Static103.anIntArray332[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt4259 == 1) {
				local12 = local8.anInt4243 + Static52.anInt1395 - Static314.anInt6028;
				if (local12 >= 0 && local12 <= Static52.anInt1395 + Static52.anInt1395) {
					local110 = local8.anInt4251 + Static52.anInt1395 - Static206.anInt4117;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4241 + Static52.anInt1395 - Static206.anInt4117;
					if (local121 > Static52.anInt1395 + Static52.anInt1395) {
						local121 = Static52.anInt1395 + Static52.anInt1395;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static65.aBooleanArrayArray1[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static233.anInt4637 - local8.anInt4249;
						if (local153 > 32) {
							local8.anInt4255 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt4255 = 2;
							local153 = -local153;
						}
						local8.anInt4240 = (local8.anInt4253 - Static216.anInt4314 << 8) / local153;
						local8.anInt4258 = (local8.anInt4263 - Static216.anInt4314 << 8) / local153;
						local8.anInt4261 = (local8.anInt4254 - Static165.anInt3443 << 8) / local153;
						local8.anInt4260 = (local8.anInt4242 - Static165.anInt3443 << 8) / local153;
						Static77.aClass142Array1[Static309.anInt5902++] = local8;
					}
				}
			} else if (local8.anInt4259 == 2) {
				local12 = local8.anInt4251 + Static52.anInt1395 - Static206.anInt4117;
				if (local12 >= 0 && local12 <= Static52.anInt1395 + Static52.anInt1395) {
					local110 = local8.anInt4243 + Static52.anInt1395 - Static314.anInt6028;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4248 + Static52.anInt1395 - Static314.anInt6028;
					if (local121 > Static52.anInt1395 + Static52.anInt1395) {
						local121 = Static52.anInt1395 + Static52.anInt1395;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static65.aBooleanArrayArray1[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static216.anInt4314 - local8.anInt4253;
						if (local153 > 32) {
							local8.anInt4255 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt4255 = 4;
							local153 = -local153;
						}
						local8.anInt4256 = (local8.anInt4249 - Static233.anInt4637 << 8) / local153;
						local8.anInt4257 = (local8.anInt4262 - Static233.anInt4637 << 8) / local153;
						local8.anInt4261 = (local8.anInt4254 - Static165.anInt3443 << 8) / local153;
						local8.anInt4260 = (local8.anInt4242 - Static165.anInt3443 << 8) / local153;
						Static77.aClass142Array1[Static309.anInt5902++] = local8;
					}
				}
			} else if (local8.anInt4259 == 4) {
				local12 = local8.anInt4254 - Static165.anInt3443;
				if (local12 > 128) {
					local110 = local8.anInt4251 + Static52.anInt1395 - Static206.anInt4117;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4241 + Static52.anInt1395 - Static206.anInt4117;
					if (local121 > Static52.anInt1395 + Static52.anInt1395) {
						local121 = Static52.anInt1395 + Static52.anInt1395;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt4243 + Static52.anInt1395 - Static314.anInt6028;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt4248 + Static52.anInt1395 - Static314.anInt6028;
						if (local153 > Static52.anInt1395 + Static52.anInt1395) {
							local153 = Static52.anInt1395 + Static52.anInt1395;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static65.aBooleanArrayArray1[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt4255 = 5;
							local8.anInt4256 = (local8.anInt4249 - Static233.anInt4637 << 8) / local12;
							local8.anInt4257 = (local8.anInt4262 - Static233.anInt4637 << 8) / local12;
							local8.anInt4240 = (local8.anInt4253 - Static216.anInt4314 << 8) / local12;
							local8.anInt4258 = (local8.anInt4263 - Static216.anInt4314 << 8) / local12;
							Static77.aClass142Array1[Static309.anInt5902++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)V")
	public static void method3464(@OriginalArg(1) int arg0) {
		@Pc(5) Class103 local5 = aClass103_36;
		synchronized (aClass103_36) {
			aClass103_36.method2678();
			aClass103_36 = new Class103(arg0);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI)V")
	public static void method3467(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static212.anInt4234 - Static51.anInt1370;
		if (local8 >= 100) {
			Static118.anInt6324 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static18.aFloat7;
		if (local17 < Static263.anInt5176 >> 8) {
			local17 = Static263.anInt5176 >> 8;
		}
		if (Static341.aBooleanArray31[4] && Static114.anIntArray348[4] + 128 > local17) {
			local17 = Static114.anIntArray348[4] + 128;
		}
		@Pc(62) int local62 = Static91.anInt5969 + (int) Static351.aFloat80 & 0x3FFF;
		Static184.method3387(local17, (local17 >> 3) * 3 + 600, local62, arg0, Static98.anInt1131, Static341.method5540(Static168.anInt3508, Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967, Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973) - 50, Static319.anInt6099);
		@Pc(106) float local106 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static24.anInt478 = (int) (local106 * (float) (Static24.anInt478 - Static215.anInt4292) + (float) Static215.anInt4292);
		Static203.anInt4014 = (int) ((float) (Static203.anInt4014 - Static70.anInt1731) * local106 + (float) Static70.anInt1731);
		Static271.anInt5361 = (int) ((float) Static312.anInt5954 + (float) (Static271.anInt5361 - Static312.anInt5954) * local106);
		Static179.anInt3660 = (int) ((float) Static113.anInt2571 + local106 * (float) (Static179.anInt3660 - Static113.anInt2571));
		@Pc(156) int local156 = Static138.anInt3022 - Static224.anInt4469;
		if (local156 > 8192) {
			local156 -= 16384;
		} else if (local156 < -8192) {
			local156 += 16384;
		}
		Static138.anInt3022 = (int) (local106 * (float) local156 + (float) Static224.anInt4469);
		Static138.anInt3022 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V")
	public static void method3468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(10, arg3);
		local8.method4790();
		local8.anInt5692 = arg0;
		local8.anInt5687 = arg2;
		local8.anInt5696 = arg1;
	}
}
