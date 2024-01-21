import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!de", name = "xb", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!de", name = "T", descriptor = "Lclient!rf;")
	public static Class70 aClass70_628 = Static49.method1293("<)4col> x");

	@OriginalMember(owner = "client!de", name = "Z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_629 = Static49.method1293("<col=80ff00>");

	@OriginalMember(owner = "client!de", name = "Yb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_632 = Static49.method1293("");

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_630 = aClass70_632;

	@OriginalMember(owner = "client!de", name = "wb", descriptor = "I")
	public static int anInt2016 = 0;

	@OriginalMember(owner = "client!de", name = "Zb", descriptor = "[I")
	public static int[] anIntArray200 = new int[256];

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
	public static void method1513() {
		aClass70_632 = null;
		aClass70_630 = null;
		aClass70_628 = null;
		aClass70_629 = null;
		anIntArray200 = null;
		anIntArray198 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ig;I)Lclient!ig;")
	public static Class39 method1515(@OriginalArg(0) Class39 arg0) {
		@Pc(8) Class39 local8 = Static131.method2564(arg0);
		if (local8 == null) {
			local8 = arg0.aClass39_23;
		}
		return local8;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII[Lclient!ig;II)V")
	public static void method1519(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class39[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(12) int local12 = 0; local12 < arg5.length; local12++) {
			@Pc(18) Class39 local18 = arg5[local12];
			if (local18 != null && (!local18.aBoolean89 || local18.anInt2342 == 0 || local18.aBoolean85 || Static20.method439(local18) != 0 || Static119.aClass39_35 == local18 || local18.anInt2381 == 1338) && arg4 == local18.anInt2325 && (!local18.aBoolean89 || !Static169.method3347(local18))) {
				@Pc(69) int local69 = local18.anInt2326 + arg6;
				@Pc(74) int local74 = arg3 + local18.anInt2338;
				if (Static110.aClass39_30 == local18) {
					Static96.anInt2798 = local74;
					Static13.anInt428 = local69;
					Static80.aBoolean93 = true;
				}
				@Pc(125) int local125;
				@Pc(102) int local102;
				@Pc(118) int local118;
				@Pc(141) int local141;
				@Pc(170) int local170;
				if (local18.anInt2342 == 2) {
					local118 = arg0;
					local102 = arg2;
					local125 = arg1;
					local141 = arg7;
				} else {
					@Pc(107) int local107;
					@Pc(130) int local130;
					if (local18.anInt2342 == 9) {
						local107 = local69;
						local130 = local74;
						@Pc(152) int local152 = local18.anInt2340 + local69;
						if (local152 < local69) {
							local107 = local152;
							local152 = local69;
						}
						local170 = local18.anInt2369 + local74;
						local152++;
						local125 = local107 <= arg1 ? arg1 : local107;
						local118 = local152 < arg0 ? local152 : arg0;
						if (local74 > local170) {
							local130 = local170;
							local170 = local74;
						}
						local102 = local130 > arg2 ? local130 : arg2;
						local170++;
						local141 = arg7 > local170 ? local170 : arg7;
					} else {
						local102 = local74 <= arg2 ? arg2 : local74;
						local107 = local18.anInt2340 + local69;
						local118 = local107 >= arg0 ? arg0 : local107;
						local125 = local69 <= arg1 ? arg1 : local69;
						local130 = local18.anInt2369 + local74;
						local141 = local130 < arg7 ? local130 : arg7;
					}
				}
				if (!local18.aBoolean89 || local125 < local118 && local141 > local102) {
					if (local18.anInt2381 == 1337) {
						Static171.method3407(local18);
					} else {
						if (local18.anInt2342 == 0) {
							if (!local18.aBoolean89 && Static169.method3347(local18) && local18 != Static144.aClass39_42) {
								continue;
							}
							method1519(local118, local125, local102, local74 - local18.anInt2341, local18.anInt2355, arg5, local69 - local18.anInt2354, local141);
							if (local18.aClass39Array1 != null) {
								method1519(local118, local125, local102, local74 - local18.anInt2341, local18.anInt2355, local18.aClass39Array1, local69 - local18.anInt2354, local141);
							}
							@Pc(316) Class1_Sub14 local316 = (Class1_Sub14) Static128.aClass30_14.method1467((long) local18.anInt2355);
							if (local316 != null) {
								Static166.method3304(local118, local74, local316.anInt2467, local102, local69, local125, local141);
							}
						}
						if (local18.aBoolean89) {
							@Pc(333) boolean local333 = false;
							if (Static63.anInt1966 == 1 && Static170.anInt4392 >= local125 && Static15.anInt450 >= local102 && local118 > Static170.anInt4392 && local141 > Static15.anInt450) {
								local333 = true;
							}
							@Pc(366) boolean local366 = false;
							@Pc(388) boolean local388;
							if (Static21.anInt591 >= local125 && local102 <= Static70.anInt2156 && Static21.anInt591 < local118 && local141 > Static70.anInt2156) {
								local388 = true;
							} else {
								local388 = false;
							}
							if (Static109.anInt3064 == 1 && local388) {
								local366 = true;
							}
							if (local18.anInt2381 == 1338) {
								if (local333) {
									Static120.method2460(local18, Static170.anInt4392 - local69, Static15.anInt450 + -local74);
								}
								continue;
							}
							if (local333) {
								Static38.method975(Static170.anInt4392 - local69, -local74 + Static15.anInt450, local18);
							}
							if (Static110.aClass39_30 != null && local18 != Static110.aClass39_30 && local388 && Static107.method2252(Static20.method439(local18))) {
								Static121.aClass39_36 = local18;
							}
							if (local18 == Static119.aClass39_35) {
								Static132.anInt3450 = local69;
								Static81.anInt2479 = local74;
								Static48.aBoolean61 = true;
							}
							if (local18.aBoolean85) {
								@Pc(474) Class1_Sub19 local474;
								if (local388 && Static78.anInt2425 != 0 && local18.anObjectArray21 != null) {
									local474 = new Class1_Sub19();
									local474.aClass39_31 = local18;
									local474.anObjectArray27 = local18.anObjectArray21;
									local474.anInt3080 = Static78.anInt2425;
									Static47.aClass4_7.method179(local474);
								}
								if (Static110.aClass39_30 != null || Static20.aClass39_6 != null || Static32.aBoolean47) {
									local366 = false;
									local388 = false;
									local333 = false;
								}
								if (!local18.aBoolean87 && local333) {
									local18.aBoolean87 = true;
									if (local18.anObjectArray10 != null) {
										local474 = new Class1_Sub19();
										local474.aClass39_31 = local18;
										local474.anInt3084 = Static170.anInt4392 - local69;
										local474.anInt3080 = Static15.anInt450 - local74;
										local474.anObjectArray27 = local18.anObjectArray10;
										Static47.aClass4_7.method179(local474);
									}
								}
								if (local18.aBoolean87 && local366 && local18.anObjectArray1 != null) {
									local474 = new Class1_Sub19();
									local474.anObjectArray27 = local18.anObjectArray1;
									local474.anInt3084 = Static21.anInt591 - local69;
									local474.aClass39_31 = local18;
									local474.anInt3080 = Static70.anInt2156 - local74;
									Static47.aClass4_7.method179(local474);
								}
								if (local18.aBoolean87 && !local366) {
									local18.aBoolean87 = false;
									if (local18.anObjectArray12 != null) {
										local474 = new Class1_Sub19();
										local474.anObjectArray27 = local18.anObjectArray12;
										local474.aClass39_31 = local18;
										local474.anInt3080 = Static70.anInt2156 - local74;
										local474.anInt3084 = Static21.anInt591 - local69;
										Static28.aClass4_2.method179(local474);
									}
								}
								if (local366 && local18.anObjectArray13 != null) {
									local474 = new Class1_Sub19();
									local474.anObjectArray27 = local18.anObjectArray13;
									local474.anInt3080 = Static70.anInt2156 - local74;
									local474.aClass39_31 = local18;
									local474.anInt3084 = Static21.anInt591 - local69;
									Static47.aClass4_7.method179(local474);
								}
								if (!local18.aBoolean88 && local388) {
									local18.aBoolean88 = true;
									if (local18.anObjectArray20 != null) {
										local474 = new Class1_Sub19();
										local474.anInt3084 = Static21.anInt591 - local69;
										local474.aClass39_31 = local18;
										local474.anObjectArray27 = local18.anObjectArray20;
										local474.anInt3080 = Static70.anInt2156 - local74;
										Static47.aClass4_7.method179(local474);
									}
								}
								if (local18.aBoolean88 && local388 && local18.anObjectArray17 != null) {
									local474 = new Class1_Sub19();
									local474.anObjectArray27 = local18.anObjectArray17;
									local474.aClass39_31 = local18;
									local474.anInt3084 = Static21.anInt591 - local69;
									local474.anInt3080 = Static70.anInt2156 - local74;
									Static47.aClass4_7.method179(local474);
								}
								if (local18.aBoolean88 && !local388) {
									local18.aBoolean88 = false;
									if (local18.anObjectArray23 != null) {
										local474 = new Class1_Sub19();
										local474.anInt3084 = Static21.anInt591 - local69;
										local474.anInt3080 = Static70.anInt2156 - local74;
										local474.anObjectArray27 = local18.anObjectArray23;
										local474.aClass39_31 = local18;
										Static28.aClass4_2.method179(local474);
									}
								}
								if (local18.anObjectArray8 != null) {
									local474 = new Class1_Sub19();
									local474.aClass39_31 = local18;
									local474.anObjectArray27 = local18.anObjectArray8;
									Static113.aClass4_12.method179(local474);
								}
								@Pc(821) int local821;
								@Pc(823) int local823;
								@Pc(839) Class1_Sub19 local839;
								if (local18.anObjectArray19 != null && local18.anInt2350 < Static6.anInt275) {
									if (local18.anIntArray226 == null || Static6.anInt275 - local18.anInt2350 > 32) {
										local474 = new Class1_Sub19();
										local474.aClass39_31 = local18;
										local474.anObjectArray27 = local18.anObjectArray19;
										Static47.aClass4_7.method179(local474);
									} else {
										label386: for (local170 = local18.anInt2350; local170 < Static6.anInt275; local170++) {
											local821 = Static6.anIntArray20[local170 & 0x1F];
											for (local823 = 0; local823 < local18.anIntArray226.length; local823++) {
												if (local821 == local18.anIntArray226[local823]) {
													local839 = new Class1_Sub19();
													local839.aClass39_31 = local18;
													local839.anObjectArray27 = local18.anObjectArray19;
													Static47.aClass4_7.method179(local839);
													break label386;
												}
											}
										}
									}
									local18.anInt2350 = Static6.anInt275;
								}
								if (local18.anObjectArray5 != null && Static92.anInt2687 > local18.anInt2387) {
									if (local18.anIntArray225 == null || Static92.anInt2687 - local18.anInt2387 > 32) {
										local474 = new Class1_Sub19();
										local474.aClass39_31 = local18;
										local474.anObjectArray27 = local18.anObjectArray5;
										Static47.aClass4_7.method179(local474);
									} else {
										label362: for (local170 = local18.anInt2387; local170 < Static92.anInt2687; local170++) {
											local821 = Static112.anIntArray418[local170 & 0x1F];
											for (local823 = 0; local823 < local18.anIntArray225.length; local823++) {
												if (local821 == local18.anIntArray225[local823]) {
													local839 = new Class1_Sub19();
													local839.aClass39_31 = local18;
													local839.anObjectArray27 = local18.anObjectArray5;
													Static47.aClass4_7.method179(local839);
													break label362;
												}
											}
										}
									}
									local18.anInt2387 = Static92.anInt2687;
								}
								if (local18.anObjectArray24 != null && local18.anInt2343 < Static170.anInt4396) {
									if (local18.anIntArray232 == null || Static170.anInt4396 - local18.anInt2343 > 32) {
										local474 = new Class1_Sub19();
										local474.aClass39_31 = local18;
										local474.anObjectArray27 = local18.anObjectArray24;
										Static47.aClass4_7.method179(local474);
									} else {
										label338: for (local170 = local18.anInt2343; local170 < Static170.anInt4396; local170++) {
											local821 = Static124.anIntArray325[local170 & 0x1F];
											for (local823 = 0; local823 < local18.anIntArray232.length; local823++) {
												if (local821 == local18.anIntArray232[local823]) {
													local839 = new Class1_Sub19();
													local839.anObjectArray27 = local18.anObjectArray24;
													local839.aClass39_31 = local18;
													Static47.aClass4_7.method179(local839);
													break label338;
												}
											}
										}
									}
									local18.anInt2343 = Static170.anInt4396;
								}
								if (local18.anInt2375 < Static126.anInt827 && local18.anObjectArray6 != null) {
									local474 = new Class1_Sub19();
									local474.aClass39_31 = local18;
									local474.anObjectArray27 = local18.anObjectArray6;
									Static47.aClass4_7.method179(local474);
								}
								if (Static102.anInt2901 > local18.anInt2375 && local18.anObjectArray11 != null) {
									local474 = new Class1_Sub19();
									local474.aClass39_31 = local18;
									local474.anObjectArray27 = local18.anObjectArray11;
									Static47.aClass4_7.method179(local474);
								}
								if (local18.anInt2375 < Static115.anInt3168 && local18.anObjectArray26 != null) {
									local474 = new Class1_Sub19();
									local474.aClass39_31 = local18;
									local474.anObjectArray27 = local18.anObjectArray26;
									Static47.aClass4_7.method179(local474);
								}
								if (Static12.anInt397 > local18.anInt2375 && local18.anObjectArray25 != null) {
									local474 = new Class1_Sub19();
									local474.anObjectArray27 = local18.anObjectArray25;
									local474.aClass39_31 = local18;
									Static47.aClass4_7.method179(local474);
								}
								if (Static13.anInt431 > local18.anInt2375 && local18.anObjectArray7 != null) {
									local474 = new Class1_Sub19();
									local474.aClass39_31 = local18;
									local474.anObjectArray27 = local18.anObjectArray7;
									Static47.aClass4_7.method179(local474);
								}
								local18.anInt2375 = Static58.anInt1875;
								if (local18.anObjectArray4 != null) {
									for (local170 = 0; local170 < Static63.anInt1967; local170++) {
										@Pc(1195) Class1_Sub19 local1195 = new Class1_Sub19();
										local1195.aClass39_31 = local18;
										local1195.anInt3079 = Static98.anIntArray269[local170];
										local1195.anInt3083 = Static111.anIntArray300[local170];
										local1195.anObjectArray27 = local18.anObjectArray4;
										Static47.aClass4_7.method179(local1195);
									}
								}
							}
						}
						if (!local18.aBoolean89) {
							if (Static110.aClass39_30 != null || Static20.aClass39_6 != null || Static32.aBoolean47) {
								return;
							}
							if ((local18.anInt2332 >= 0 || local18.anInt2364 != 0) && local125 <= Static21.anInt591 && Static70.anInt2156 >= local102 && local118 > Static21.anInt591 && Static70.anInt2156 < local141) {
								if (local18.anInt2332 >= 0) {
									Static144.aClass39_42 = arg5[local18.anInt2332];
								} else {
									Static144.aClass39_42 = local18;
								}
							}
							if (local18.anInt2342 == 8 && Static21.anInt591 >= local125 && local102 <= Static70.anInt2156 && local118 > Static21.anInt591 && local141 > Static70.anInt2156) {
								Static107.aClass39_28 = local18;
							}
							if (local18.anInt2369 < local18.anInt2353) {
								Static64.method773(Static21.anInt591, Static70.anInt2156, local18.anInt2353, local18.anInt2369, local18.anInt2340 + local69, local74, local18);
							}
						}
					}
				}
			}
		}
	}
}
