import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger8 = new BigInteger("974b219bf31b50bc1a89e45f6a0a59f21c9a83e19478ae976391cb262dc9b5f8ecfb2e864356ecbf7ca3cdbacd54ea298db5a159b0a64c25e03330fd744fe0a7181244f6ba5f3025afcb3f4122f5fbda4036b9a1b586eb33e732c5c3fd9a210ac8d42df187317c681060a4de30d9391e0b29ce9a6de27470fa3050f8b0868146efc885c62cf88378c9c19414ed3bbf98a4b8e28a8c9266654eccf773ab928973acc6aeec5648a9781463c5802379e7212fb5c480116a349840c5f04bb4b60f78e79d13a4e64b8843ef9d1273d8f80b198468051a93e6540e2510ffb8003046e10dc9bddd7bc30653936d6b178c2c6d086eeedd0a096878accbd80e6b5919806246167992dfad464b8a83e0b2f2cb3263a12b9937c206238a46ec1aea440d75af5a313de6324ac51a24bcaafeab1181b457145eea7a8ddc4009d1b62b118644ec363c521c6c491a879ace7fe9910b5084f8260855c86667c107164aba828126a12a95913507ae5519fa40452e66213918cc12e99430ffd8284b78bf6c827a4b0fbaeaa838dd9cd2e98bb825ff707df9e4465b51be3601dde7de933191328e1a36b0b950a71b681d35d6103a0d7d451cb32dc4f8dd196722a975a391d0048185e05d3ac876af0f15b3f72cbc9ff8132d4d2f29a315e0ad505e183d87c6a6022699c74038803e879bdd124b6f2f5106ea7d703abaaa2dfa86e5b4db14fadf34694b", 16);

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "[I")
	public static final int[] anIntArray537 = new int[4096];

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "[I")
	public static final int[] anIntArray538 = new int[200];

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "Z")
	public static boolean aBoolean784 = true;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(FFBF)I")
	public static int method8097(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(21) float local21 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local21 > local12 && local35 < local21) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local12 < local35 && local21 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method8102(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static525.anInt9179 = 0;
		Static604.anInt10261 = 0;
		Static608.anInt10289++;
		@Pc(21) Class9_Sub4 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static645.aClass9_Sub4Array6[local5]; local21 != null; local21 = local21.aClass9_Sub4_23) {
				if (!Static28.method767(local21, arg0, arg1, arg2, arg3)) {
					Static204.method6288(local21);
					if (local21.anInt10359 != -1) {
						Static67.aClass9_Sub4Array3[Static525.anInt9179++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static611.aClass9_Sub4Array5[local5]; local21 != null; local21 = local21.aClass9_Sub4_23) {
				if (!Static28.method767(local21, arg0, arg1, arg2, arg3)) {
					Static204.method6288(local21);
					if (local21.anInt10359 != -1) {
						Static547.aClass9_Sub4Array2[Static604.anInt10261++] = local21;
					}
				}
			}
			for (@Pc(87) Class9_Sub4 local87 = Static249.aClass9_Sub4Array4[local5]; local87 != null; local87 = local87.aClass9_Sub4_23) {
				if (!Static28.method767(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method8422()) {
						Static204.method6288(local87);
						if (local87.anInt10359 != -1) {
							Static547.aClass9_Sub4Array2[Static604.anInt10261++] = local87;
						}
					} else {
						Static204.method6288(local87);
						if (local87.anInt10359 != -1) {
							Static67.aClass9_Sub4Array3[Static525.anInt9179++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static592.anInt10005; local137++) {
					if (!Static28.method767(Static560.aClass9_Sub4_Sub2Array1[local137], arg0, arg1, arg2, arg3)) {
						Static204.method6288(Static560.aClass9_Sub4_Sub2Array1[local137]);
						if (Static560.aClass9_Sub4_Sub2Array1[local137].anInt10359 != -1) {
							if (Static560.aClass9_Sub4_Sub2Array1[local137].method8422()) {
								Static547.aClass9_Sub4Array2[Static604.anInt10261++] = Static560.aClass9_Sub4_Sub2Array1[local137];
							} else {
								Static67.aClass9_Sub4Array3[Static525.anInt9179++] = Static560.aClass9_Sub4_Sub2Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static525.anInt9179 > 0) {
			Static499.method7237(Static67.aClass9_Sub4Array3, 0, Static525.anInt9179 - 1);
			for (local198 = 0; local198 < Static525.anInt9179; local198++) {
				Static313.method5251(Static67.aClass9_Sub4Array3[local198], arg6);
			}
		}
		if (Static597.aBoolean790) {
			Static472.aClass5_14.method6181(0, (Class6_Sub10[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static67.anInt2304; local198 < Static618.anInt10427; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static137.aBooleanArrayArray1.length;
					if (Static530.anInt9217 + Static137.aBooleanArrayArray1.length > Static623.anInt10485) {
						local230 -= Static530.anInt9217 + Static137.aBooleanArrayArray1.length - Static623.anInt10485;
					}
					local137 = Static137.aBooleanArrayArray1[0].length;
					if (Static318.anInt6330 + Static137.aBooleanArrayArray1[0].length > Static142.anInt3372) {
						local137 -= Static318.anInt6330 + Static137.aBooleanArrayArray1[0].length - Static142.anInt3372;
					}
					local271 = Static551.aBooleanArrayArray7;
					if (Static525.aBoolean738) {
						if (Static640.aBoolean844) {
							local271 = Static71.aBooleanArrayArrayArray1[local198];
						}
						for (local281 = Static129.anInt3168; local281 < local230; local281++) {
							local288 = local281 + Static530.anInt9217 - Static129.anInt3168;
							for (local290 = Static443.anInt8036; local290 < local137; local290++) {
								if (Static137.aBooleanArrayArray1[local281][local290] && !Static267.method4826(local198, local290 + Static318.anInt6330 - Static443.anInt8036, local288)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static640.aBoolean844) {
						if (arg4 >= 0) {
							Static148.aClass245Array1[local198].method7579(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static148.aClass245Array1[local198].method7589(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static514.anInt8985; local281++) {
							Static512.aClass260Array1[local281].method6666(new Class9_Sub10(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static148.aClass245Array1[local198].method7579(Static427.anInt7834, Static594.anInt10050, Static456.anInt8195, Static551.aBooleanArrayArray7, true, arg4, arg5);
					} else {
						Static148.aClass245Array1[local198].method7589(Static427.anInt7834, Static594.anInt10050, Static456.anInt8195, Static551.aBooleanArrayArray7, true, arg5);
					}
				} else {
					local230 = Static137.aBooleanArrayArray1.length;
					if (Static530.anInt9217 + Static137.aBooleanArrayArray1.length > Static623.anInt10485) {
						local230 -= Static530.anInt9217 + Static137.aBooleanArrayArray1.length - Static623.anInt10485;
					}
					local137 = Static137.aBooleanArrayArray1[0].length;
					if (Static318.anInt6330 + Static137.aBooleanArrayArray1[0].length > Static142.anInt3372) {
						local137 -= Static318.anInt6330 + Static137.aBooleanArrayArray1[0].length - Static142.anInt3372;
					}
					local271 = Static551.aBooleanArrayArray7;
					if (Static525.aBoolean738) {
						if (Static640.aBoolean844) {
							local271 = Static71.aBooleanArrayArrayArray1[local198];
						}
						for (local281 = Static129.anInt3168; local281 < local230; local281++) {
							local288 = local281 + Static530.anInt9217 - Static129.anInt3168;
							for (local290 = Static443.anInt8036; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static137.aBooleanArrayArray1[local281][local290]) {
									@Pc(309) int local309 = local290 + Static318.anInt6330 - Static443.anInt8036;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static26.aClass186ArrayArrayArray1[local311][local288][local309] != null && Static26.aClass186ArrayArrayArray1[local311][local288][local309].aByte73 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static267.method4826(local198, local309, local288)) {
												local271[local281][local290] = true;
												break;
											}
											local271[local281][local290] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static640.aBoolean844) {
						if (arg4 >= 0) {
							Static148.aClass245Array1[local198].method7579(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static148.aClass245Array1[local198].method7589(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static514.anInt8985; local281++) {
							Static512.aClass260Array1[local281].method6666(new Class9_Sub10(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static148.aClass245Array1[local198].method7579(Static427.anInt7834, Static594.anInt10050, Static456.anInt8195, Static551.aBooleanArrayArray7, false, arg4, arg5);
					} else {
						Static148.aClass245Array1[local198].method7589(Static427.anInt7834, Static594.anInt10050, Static456.anInt8195, Static551.aBooleanArrayArray7, false, arg5);
					}
				}
			}
		}
		if (Static604.anInt10261 > 0) {
			Static190.method3513(Static547.aClass9_Sub4Array2, 0, Static604.anInt10261 - 1);
			for (local198 = 0; local198 < Static604.anInt10261; local198++) {
				Static313.method5251(Static547.aClass9_Sub4Array2[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
	public static void method8103(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static514.anInt8985 == 2) {
				Static93.aClass188Array1[0].method5372(Static512.aClass260Array1[0]);
				Static93.aClass188Array1[1].method5372(Static512.aClass260Array1[1]);
			} else if (Static514.anInt8985 == 3) {
				Static93.aClass188Array1[0].method5372(Static512.aClass260Array1[0]);
				Static93.aClass188Array1[1].method5372(Static512.aClass260Array1[1]);
				Static93.aClass188Array1[2].method5372(Static512.aClass260Array1[2]);
			} else {
				Static93.aClass188Array1[0].method5372(Static512.aClass260Array1[0]);
				Static93.aClass188Array1[1].method5372(Static512.aClass260Array1[1]);
				Static93.aClass188Array1[2].method5372(Static512.aClass260Array1[2]);
				Static93.aClass188Array1[3].method5372(Static512.aClass260Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static514.anInt8985 == 2) {
				Static93.aClass188Array1[0].method5372(Static512.aClass260Array1[2]);
			} else if (Static514.anInt8985 == 3) {
				Static93.aClass188Array1[0].method5372(Static512.aClass260Array1[3]);
				Static93.aClass188Array1[1].method5372(Static512.aClass260Array1[4]);
			} else {
				Static93.aClass188Array1[0].method5372(Static512.aClass260Array1[4]);
				Static93.aClass188Array1[1].method5372(Static512.aClass260Array1[5]);
				Static93.aClass188Array1[2].method5372(Static512.aClass260Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static514.anInt8985 == 2) {
				Static93.aClass188Array1[0].method5372(Static512.aClass260Array1[3]);
				return;
			}
			if (Static514.anInt8985 == 3) {
				Static93.aClass188Array1[0].method5372(Static512.aClass260Array1[5]);
				return;
			}
			Static93.aClass188Array1[0].method5372(Static512.aClass260Array1[7]);
		}
	}
}
