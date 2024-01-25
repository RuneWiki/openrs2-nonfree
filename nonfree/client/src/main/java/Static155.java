import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "[I")
	public static final int[] anIntArray20 = new int[6];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLclient!mc;)Ljava/lang/String;")
	public static String method443(@OriginalArg(1) Class5_Sub41 arg0) {
		return Static60.method6637(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method444(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static679.anInt10885 = 0;
		Static195.anInt3757 = 0;
		Static196.anInt3768++;
		@Pc(21) Class28_Sub1 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static654.aClass28_Sub1Array5[local5]; local21 != null; local21 = local21.aClass28_Sub1_23) {
				if (!Static153.method2781(local21, arg0, arg1, arg2, arg3)) {
					Static339.method5178(local21);
					if (local21.anInt10777 != -1) {
						Static248.aClass28_Sub1Array3[Static679.anInt10885++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static135.aClass28_Sub1Array2[local5]; local21 != null; local21 = local21.aClass28_Sub1_23) {
				if (!Static153.method2781(local21, arg0, arg1, arg2, arg3)) {
					Static339.method5178(local21);
					if (local21.anInt10777 != -1) {
						Static393.aClass28_Sub1Array4[Static195.anInt3757++] = local21;
					}
				}
			}
			for (@Pc(87) Class28_Sub1 local87 = Static110.aClass28_Sub1Array1[local5]; local87 != null; local87 = local87.aClass28_Sub1_23) {
				if (!Static153.method2781(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method8965()) {
						Static339.method5178(local87);
						if (local87.anInt10777 != -1) {
							Static393.aClass28_Sub1Array4[Static195.anInt3757++] = local87;
						}
					} else {
						Static339.method5178(local87);
						if (local87.anInt10777 != -1) {
							Static248.aClass28_Sub1Array3[Static679.anInt10885++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static518.anInt8629; local137++) {
					if (!Static153.method2781(Static213.aClass28_Sub1_Sub4Array4[local137], arg0, arg1, arg2, arg3)) {
						Static339.method5178(Static213.aClass28_Sub1_Sub4Array4[local137]);
						if (Static213.aClass28_Sub1_Sub4Array4[local137].anInt10777 != -1) {
							if (Static213.aClass28_Sub1_Sub4Array4[local137].method8965()) {
								Static393.aClass28_Sub1Array4[Static195.anInt3757++] = Static213.aClass28_Sub1_Sub4Array4[local137];
							} else {
								Static248.aClass28_Sub1Array3[Static679.anInt10885++] = Static213.aClass28_Sub1_Sub4Array4[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static679.anInt10885 > 0) {
			Static468.method6676(Static248.aClass28_Sub1Array3, 0, Static679.anInt10885 - 1);
			for (local198 = 0; local198 < Static679.anInt10885; local198++) {
				Static622.method8434(Static248.aClass28_Sub1Array3[local198], arg6);
			}
		}
		if (Static389.aBoolean601) {
			Static10.aClass65_1.method6926(0, (Class5_Sub18[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static128.anInt2605; local198 < Static219.anInt4088; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static453.aBooleanArrayArray4.length;
					if (Static521.anInt8682 + Static453.aBooleanArrayArray4.length > Static216.anInt4042) {
						local230 -= Static521.anInt8682 + Static453.aBooleanArrayArray4.length - Static216.anInt4042;
					}
					local137 = Static453.aBooleanArrayArray4[0].length;
					if (Static450.anInt7698 + Static453.aBooleanArrayArray4[0].length > Static233.anInt4238) {
						local137 -= Static450.anInt7698 + Static453.aBooleanArrayArray4[0].length - Static233.anInt4238;
					}
					local271 = Static422.aBooleanArrayArray3;
					if (Static5.aBoolean4) {
						if (Static23.aBoolean21) {
							local271 = Static376.aBooleanArrayArrayArray11[local198];
						}
						for (local281 = Static411.anInt7311; local281 < local230; local281++) {
							local288 = local281 + Static521.anInt8682 - Static411.anInt7311;
							for (local290 = Static320.anInt10891; local290 < local137; local290++) {
								if (Static453.aBooleanArrayArray4[local281][local290] && !Static380.method5646(local198, local288, local290 + Static450.anInt7698 - Static320.anInt10891)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static23.aBoolean21) {
						if (arg4 >= 0) {
							Static495.aClass109Array4[local198].method7701(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static495.aClass109Array4[local198].method7698(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static581.anInt9529; local281++) {
							Static198.aClass289Array2[local281].method6861(new Class28_Sub2(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static495.aClass109Array4[local198].method7701(Static57.anInt852, Static481.anInt8080, Static187.anInt6996, Static422.aBooleanArrayArray3, true, arg4, arg5);
					} else {
						Static495.aClass109Array4[local198].method7698(Static57.anInt852, Static481.anInt8080, Static187.anInt6996, Static422.aBooleanArrayArray3, true, arg5);
					}
				} else {
					local230 = Static453.aBooleanArrayArray4.length;
					if (Static521.anInt8682 + Static453.aBooleanArrayArray4.length > Static216.anInt4042) {
						local230 -= Static521.anInt8682 + Static453.aBooleanArrayArray4.length - Static216.anInt4042;
					}
					local137 = Static453.aBooleanArrayArray4[0].length;
					if (Static450.anInt7698 + Static453.aBooleanArrayArray4[0].length > Static233.anInt4238) {
						local137 -= Static450.anInt7698 + Static453.aBooleanArrayArray4[0].length - Static233.anInt4238;
					}
					local271 = Static422.aBooleanArrayArray3;
					if (Static5.aBoolean4) {
						if (Static23.aBoolean21) {
							local271 = Static376.aBooleanArrayArrayArray11[local198];
						}
						for (local281 = Static411.anInt7311; local281 < local230; local281++) {
							local288 = local281 + Static521.anInt8682 - Static411.anInt7311;
							for (local290 = Static320.anInt10891; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static453.aBooleanArrayArray4[local281][local290]) {
									@Pc(309) int local309 = local290 + Static450.anInt7698 - Static320.anInt10891;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static635.aClass226ArrayArrayArray3[local311][local288][local309] != null && Static635.aClass226ArrayArrayArray3[local311][local288][local309].aByte100 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static380.method5646(local198, local288, local309)) {
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
					if (Static23.aBoolean21) {
						if (arg4 >= 0) {
							Static495.aClass109Array4[local198].method7701(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static495.aClass109Array4[local198].method7698(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static581.anInt9529; local281++) {
							Static198.aClass289Array2[local281].method6861(new Class28_Sub2(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static495.aClass109Array4[local198].method7701(Static57.anInt852, Static481.anInt8080, Static187.anInt6996, Static422.aBooleanArrayArray3, false, arg4, arg5);
					} else {
						Static495.aClass109Array4[local198].method7698(Static57.anInt852, Static481.anInt8080, Static187.anInt6996, Static422.aBooleanArrayArray3, false, arg5);
					}
				}
			}
		}
		if (Static195.anInt3757 > 0) {
			Static584.method8030(Static393.aClass28_Sub1Array4, 0, Static195.anInt3757 - 1);
			for (local198 = 0; local198 < Static195.anInt3757; local198++) {
				Static622.method8434(Static393.aClass28_Sub1Array4[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIZII)V")
	public static void method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 ? Static172.aClass5_Sub50_14.aClass12_Sub7_2.method2118() : Static172.aClass5_Sub50_14.aClass12_Sub7_4.method2118()) != 0 && arg4 != 0 && Static204.anInt3872 < 50 && arg5 != -1) {
			Static569.aClass351Array1[Static204.anInt3872++] = new Class351((byte) (arg3 ? 3 : 2), arg5, arg4, arg2, arg0, 0, arg1, (Class28_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	public static void method447() {
		for (@Pc(15) Class5_Sub40 local15 = (Class5_Sub40) Static133.aClass300_10.method7182(); local15 != null; local15 = (Class5_Sub40) Static133.aClass300_10.method7192()) {
			if (local15.aBoolean563) {
				local15.aBoolean563 = false;
			} else {
				Static231.method3572(local15.anInt6338);
			}
		}
	}
}
