import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Lclient!db;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString93 = "Loading title screen - ";

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString94 = "wave2:";

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZI[[BILclient!sa;[[ILclient!sa;I[[BLclient!pe;[[B[[B)V")
	public static void method1059(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(5) Class8 arg4, @OriginalArg(6) int[][] arg5, @OriginalArg(7) Class8 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) Class89 arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) byte[][] arg11) {
		for (@Pc(5) int local5 = 0; local5 < arg2; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
				if (Static105.method5089() || Static215.method3801(local5, local8, arg7, Static75.anInt1865)) {
					@Pc(26) byte local26 = arg3[local5][local8];
					@Pc(32) byte local32 = arg10[local5][local8];
					@Pc(40) int local40 = arg8[local5][local8] & 0xFF;
					@Pc(48) int local48 = arg11[local5][local8] & 0xFF;
					@Pc(61) Class213 local61 = local40 == 0 ? null : Static146.method2935(local40 - 1);
					@Pc(74) Class78 local74 = local48 == 0 ? null : Static244.method4224(local48 - 1);
					@Pc(76) int local76 = 0;
					@Pc(78) int local78 = 0;
					if (local26 != 0) {
						local76 = local74 == null ? 0 : Static326.anIntArray787[local26];
						local78 = local61 == null ? 0 : Static211.anIntArray578[local26];
					} else if (local61 != null) {
						local78 = Static211.anIntArray578[local26];
					} else if (local74 != null) {
						local76 = Static211.anIntArray578[local26];
					}
					@Pc(117) int local117 = local78 + local76;
					@Pc(119) int local119 = 0;
					if (local117 != 0) {
						@Pc(127) int[] local127 = new int[local117];
						@Pc(130) int[] local130 = new int[local117];
						@Pc(133) int[] local133 = new int[local117];
						@Pc(136) int[] local136 = new int[local117];
						@Pc(138) boolean local138 = false;
						@Pc(155) int local155;
						@Pc(181) int local181;
						if (local61 == null || local61.anInt6543 == -1 && local61.anInt6554 == -1 && local61.anInt6539 == -1) {
							for (local155 = 0; local155 < local78; local155++) {
								local127[local119] = -1;
								local119++;
							}
						} else {
							local155 = arg9.method5393() ? local61.anInt6539 : local61.anInt6542;
							if (!Static70.aBoolean128) {
								local155 = -1;
							}
							for (local181 = 0; local181 < local78; local181++) {
								local133[local119] = local155;
								local136[local119] = local61.anInt6547;
								if (local61.anInt6543 == -1) {
									local127[local119] = -1;
								} else {
									local127[local119] = local61.anInt6543;
								}
								if (local61.anInt6554 == -1) {
									local130[local119] = -1;
								} else {
									local138 = true;
									local130[local119] = local61.anInt6554;
								}
								local119++;
							}
							if (!arg1 && arg7 == 0) {
								Static321.method5185(local5, local8, local61.anInt6553, local61.anInt6546 * 8);
							}
						}
						if (!local138) {
							local130 = null;
						}
						if (local74 == null) {
							for (local155 = 0; local155 < local76; local155++) {
								local127[local119] = -1;
								local119++;
							}
						} else {
							local155 = local74.anInt2328;
							if (!Static70.aBoolean128) {
								local155 = -1;
							}
							for (local181 = 0; local181 < local76; local181++) {
								local133[local119] = local155;
								local136[local119] = local74.anInt2322;
								local127[local119] = arg5[local5][local8];
								if (local130 != null) {
									local130[local119] = -1;
								}
								local119++;
							}
						}
						local155 = Static222.anIntArray602.length;
						@Pc(318) int[] local318 = arg1 ? new int[local155] : null;
						@Pc(321) int[] local321 = new int[local155];
						@Pc(324) int[] local324 = new int[local155];
						@Pc(331) int local331;
						@Pc(335) int local335;
						@Pc(414) int local414;
						@Pc(422) int local422;
						for (@Pc(326) int local326 = 0; local326 < local155; local326++) {
							local331 = Static222.anIntArray602[local326];
							local335 = Static283.anIntArray708[local326];
							if (local32 == 0) {
								local321[local326] = local331;
								local324[local326] = local335;
							} else if (local32 == 1) {
								local321[local326] = local335;
								local324[local326] = 128 - local331;
							} else if (local32 == 2) {
								local321[local326] = 128 - local331;
								local324[local326] = 128 - local335;
							} else if (local32 == 3) {
								local321[local326] = 128 - local335;
								local324[local326] = local331;
							}
							if (arg1 && Static298.aBooleanArrayArray4[local26][local326]) {
								local414 = local321[local326] + (local5 << 7);
								local422 = local324[local326] + (local8 << 7);
								local318[local326] = arg4.method4169(local414, local422) - arg6.method4169(local414, local422);
							}
						}
						local331 = arg6.method4173(local5, local8);
						local335 = arg6.method4173(local5 + 1, local8);
						local414 = arg6.method4173(local5 + 1, local8 - -1);
						local422 = arg6.method4173(local5, local8 + 1);
						if (arg7 > 0) {
							@Pc(478) boolean local478 = true;
							if (local48 == 0 && local26 != 0) {
								local478 = false;
							}
							if (local40 > 0 && local61 != null && !local61.aBoolean476) {
								local478 = false;
							}
							if (local478 && local335 == local331 && local331 == local414 && local422 == local331) {
								Static220.aByteArrayArrayArray9[arg7][local5][local8] = (byte) (Static220.aByteArrayArrayArray9[arg7][local5][local8] | 0x4);
							}
						}
						@Pc(537) int local537 = 0;
						@Pc(539) int local539 = 0;
						if (arg1) {
							local537 = Static5.method62(local5, local8);
							local539 = Static283.method4696(local5, local8);
						}
						arg6.method4160(local5, local8, local321, local318, local324, Static210.anIntArrayArray33[local26], Static200.anIntArrayArray30[local26], Static257.anIntArrayArray43[local26], local127, local130, local133, local136, local537, local539);
						Static248.method4274(arg7, local5, local8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!pe;B)V")
	public static void method1063(@OriginalArg(0) Class89 arg0) {
		if (Static33.anInt735 < 2 && Static127.anInt2799 == 0 && !Static253.aBoolean361) {
			return;
		}
		@Pc(39) String local39;
		if (Static127.anInt2799 == 1 && Static33.anInt735 < 2) {
			local39 = Static256.aString313 + Static309.aString381 + Static205.aString266 + " ->";
		} else if (Static253.aBoolean361 && Static33.anInt735 < 2) {
			local39 = Static85.aString150 + Static309.aString381 + Static277.aString348 + " ->";
		} else if (Static339.aBoolean467 && Static17.aBooleanArray24[81] && Static33.anInt735 > 2) {
			local39 = Static24.method422((Class7_Sub32) Static76.aClass74_8.aClass7_72.aClass7_248.aClass7_248);
		} else {
			@Pc(87) Class7_Sub32 local87 = (Class7_Sub32) Static76.aClass74_8.aClass7_72.aClass7_248;
			local39 = Static24.method422(local87);
			@Pc(93) int[] local93 = null;
			if (Static342.method5546(local87.anInt5229)) {
				local93 = Static17.method4472((int) local87.aLong169).anIntArray552;
			} else if (Static259.method4349(local87.anInt5229)) {
				@Pc(138) Class22_Sub2_Sub1_Sub2 local138 = Static69.aClass22_Sub2_Sub1_Sub2Array1[(int) local87.aLong169];
				if (local138 != null) {
					local93 = local138.aClass174_1.anIntArray669;
				}
			} else if (Static43.method933(local87.anInt5229)) {
				if (local87.anInt5229 == 1009) {
					local93 = Static245.method4227((int) local87.aLong169).anIntArray480;
				} else {
					local93 = Static245.method4227((int) (local87.aLong169 >>> 32 & 0x7FFFFFFFL)).anIntArray480;
				}
			}
			if (local93 != null) {
				local39 = local39 + Static132.method2666(local93);
			}
		}
		if (Static33.anInt735 > 2) {
			local39 = local39 + "<col=ffffff> / " + (Static33.anInt735 - 2) + Static57.aString110;
		}
		if (Static107.aClass26_12 != null) {
			@Pc(195) Class94 local195 = Static107.aClass26_12.method437(arg0);
			if (local195 == null) {
				local195 = Static149.aClass94_19;
			}
			local195.method5688(Static238.anInt4712, local39, Static107.aClass26_12.anInt547, Static107.aClass26_12.anInt515, Static94.anInt2318, Static107.aClass26_12.anInt493, Static107.aClass26_12.anInt523, Static130.anIntArray376, Static214.aClass52Array12, Static102.aRandom1, Static319.anIntArray773, Static107.aClass26_12.anInt527, Static107.aClass26_12.anInt545, Static329.anInt6225);
			Static352.method5647(Static319.anIntArray773[1], Static319.anIntArray773[0], Static319.anIntArray773[2], Static319.anIntArray773[3]);
		} else if (Static91.aClass26_29 != null && Static345.anInt6530 == 0) {
			@Pc(259) int local259 = Static149.aClass94_19.method5683(Static130.anIntArray376, Static102.aRandom1, local39, Static347.anInt6549 + 4, Static214.aClass52Array12, Static329.anInt6225, Static271.anInt5362 + 16);
			Static352.method5647(Static271.anInt5362, Static347.anInt6549 + 4, Static175.aClass208_3.method5385(local39) + local259, 16);
		}
	}
}
