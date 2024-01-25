import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZI)Z")
	public static boolean method3327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "()V")
	public static void method3330() {
		Static200.anInt3899 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static141.anInt3256; local3++) {
			@Pc(8) Class38 local8 = Static189.aClass38Array2[local3];
			@Pc(12) int local12;
			if (Static20.anIntArray16 != null) {
				for (local12 = 0; local12 < Static20.anIntArray16.length; local12++) {
					if (Static20.anIntArray16[local12] != -1000000 && (local8.anInt1219 <= Static20.anIntArray16[local12] || local8.anInt1215 <= Static20.anIntArray16[local12]) && (local8.anInt1220 <= Static379.anIntArray472[local12] || local8.anInt1225 <= Static379.anIntArray472[local12]) && (local8.anInt1220 >= Static494.anIntArray521[local12] || local8.anInt1225 >= Static494.anIntArray521[local12]) && (local8.anInt1213 <= Static257.anIntArray331[local12] || local8.anInt1224 <= Static257.anIntArray331[local12]) && (local8.anInt1213 >= Static494.anIntArray522[local12] || local8.anInt1224 >= Static494.anIntArray522[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt1208 == 1) {
				local12 = local8.anInt1216 + Static403.anInt7929 - Static342.anInt6991;
				if (local12 >= 0 && local12 <= Static403.anInt7929 + Static403.anInt7929) {
					local110 = local8.anInt1223 + Static403.anInt7929 - Static484.anInt9030;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static403.anInt7929 + Static403.anInt7929) {
						continue;
					}
					local128 = local8.anInt1218 + Static403.anInt7929 - Static484.anInt9030;
					if (local128 > Static403.anInt7929 + Static403.anInt7929) {
						local128 = Static403.anInt7929 + Static403.anInt7929;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static331.aBooleanArrayArray3[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static238.anInt9925 - local8.anInt1220;
						if (local164 > Static364.anInt7221) {
							local8.anInt1222 = 1;
						} else {
							if (local164 >= -Static364.anInt7221) {
								continue;
							}
							local8.anInt1222 = 2;
							local164 = -local164;
						}
						local8.anInt1221 = (local8.anInt1213 - Static327.anInt6816 << 8) / local164;
						local8.anInt1212 = (local8.anInt1224 - Static327.anInt6816 << 8) / local164;
						local8.anInt1209 = (local8.anInt1219 - Static562.anInt9990 << 8) / local164;
						local8.anInt1210 = (local8.anInt1215 - Static562.anInt9990 << 8) / local164;
						Static133.aClass38Array1[Static200.anInt3899++] = local8;
					}
				}
			} else if (local8.anInt1208 == 2) {
				local12 = local8.anInt1223 + Static403.anInt7929 - Static484.anInt9030;
				if (local12 >= 0 && local12 <= Static403.anInt7929 + Static403.anInt7929) {
					local110 = local8.anInt1216 + Static403.anInt7929 - Static342.anInt6991;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static403.anInt7929 + Static403.anInt7929) {
						continue;
					}
					local128 = local8.anInt1214 + Static403.anInt7929 - Static342.anInt6991;
					if (local128 > Static403.anInt7929 + Static403.anInt7929) {
						local128 = Static403.anInt7929 + Static403.anInt7929;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static331.aBooleanArrayArray3[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static327.anInt6816 - local8.anInt1213;
						if (local164 > Static364.anInt7221) {
							local8.anInt1222 = 3;
						} else {
							if (local164 >= -Static364.anInt7221) {
								continue;
							}
							local8.anInt1222 = 4;
							local164 = -local164;
						}
						local8.anInt1226 = (local8.anInt1220 - Static238.anInt9925 << 8) / local164;
						local8.anInt1217 = (local8.anInt1225 - Static238.anInt9925 << 8) / local164;
						local8.anInt1209 = (local8.anInt1219 - Static562.anInt9990 << 8) / local164;
						local8.anInt1210 = (local8.anInt1215 - Static562.anInt9990 << 8) / local164;
						Static133.aClass38Array1[Static200.anInt3899++] = local8;
					}
				}
			} else if (local8.anInt1208 == 4) {
				local12 = local8.anInt1219 - Static562.anInt9990;
				if (local12 > Static274.anInt5817) {
					local110 = local8.anInt1223 + Static403.anInt7929 - Static484.anInt9030;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static403.anInt7929 + Static403.anInt7929) {
						continue;
					}
					local128 = local8.anInt1218 + Static403.anInt7929 - Static484.anInt9030;
					if (local128 > Static403.anInt7929 + Static403.anInt7929) {
						local128 = Static403.anInt7929 + Static403.anInt7929;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt1216 + Static403.anInt7929 - Static342.anInt6991;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static403.anInt7929 + Static403.anInt7929) {
						continue;
					}
					local164 = local8.anInt1214 + Static403.anInt7929 - Static342.anInt6991;
					if (local164 > Static403.anInt7929 + Static403.anInt7929) {
						local164 = Static403.anInt7929 + Static403.anInt7929;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static331.aBooleanArrayArray3[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt1222 = 5;
						local8.anInt1226 = (local8.anInt1220 - Static238.anInt9925 << 8) / local12;
						local8.anInt1217 = (local8.anInt1225 - Static238.anInt9925 << 8) / local12;
						local8.anInt1221 = (local8.anInt1213 - Static327.anInt6816 << 8) / local12;
						local8.anInt1212 = (local8.anInt1224 - Static327.anInt6816 << 8) / local12;
						Static133.aClass38Array1[Static200.anInt3899++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIB)V")
	public static void method3331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(13, arg0);
		local8.method1898();
		local8.anInt1945 = arg1;
	}
}
