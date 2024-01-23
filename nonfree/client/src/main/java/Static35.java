import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "[Lclient!cb;")
	public static Class15_Sub2_Sub1[] aClass15_Sub2_Sub1Array2 = new Class15_Sub2_Sub1[32768];

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString47 = null;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!cb;I)I")
	public static int method822(@OriginalArg(0) Class15_Sub2_Sub1 arg0) {
		@Pc(12) Class188 local12 = arg0.aClass188_1;
		if (local12.anIntArray572 != null) {
			local12 = local12.method4618();
			if (local12 == null) {
				return -1;
			}
		}
		@Pc(33) int local33 = local12.anInt5864;
		@Pc(37) Class123 local37 = arg0.method4297();
		if (arg0.anInt5365 == local37.anInt4136) {
			local33 = local12.anInt5859;
		} else if (arg0.anInt5365 == local37.anInt4111 || local37.anInt4140 == arg0.anInt5365 || arg0.anInt5365 == local37.anInt4121 || arg0.anInt5365 == local37.anInt4124) {
			local33 = local12.anInt5892;
		} else if (local37.anInt4113 == arg0.anInt5365 || arg0.anInt5365 == local37.anInt4133 || arg0.anInt5365 == local37.anInt4129 || arg0.anInt5365 == local37.anInt4142) {
			local33 = local12.anInt5851;
		}
		return local33;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	public static void method823() {
		Static91.aClass2_Sub16_Sub1_1.method2204();
		@Pc(17) int local17 = Static91.aClass2_Sub16_Sub1_1.method2202(8);
		@Pc(22) int local22;
		if (Static57.anInt1448 > local17) {
			for (local22 = local17; local22 < Static57.anInt1448; local22++) {
				Static190.anIntArray399[Static214.anInt4373++] = Static89.anIntArray194[local22];
			}
		}
		if (local17 > Static57.anInt1448) {
			throw new RuntimeException("gnpov1");
		}
		Static57.anInt1448 = 0;
		for (local22 = 0; local22 < local17; local22++) {
			@Pc(62) int local62 = Static89.anIntArray194[local22];
			@Pc(66) Class15_Sub2_Sub1 local66 = aClass15_Sub2_Sub1Array2[local62];
			@Pc(71) int local71 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
			if (local71 == 0) {
				Static89.anIntArray194[Static57.anInt1448++] = local62;
				local66.anInt5378 = Static268.anInt5236;
			} else {
				@Pc(92) int local92 = Static91.aClass2_Sub16_Sub1_1.method2202(2);
				if (local92 == 0) {
					Static89.anIntArray194[Static57.anInt1448++] = local62;
					local66.anInt5378 = Static268.anInt5236;
					Static132.anIntArray303[Static222.anInt4523++] = local62;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local92 == 1) {
						Static89.anIntArray194[Static57.anInt1448++] = local62;
						local66.anInt5378 = Static268.anInt5236;
						local139 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
						local66.method4294(1, local139);
						local149 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
						if (local149 == 1) {
							Static132.anIntArray303[Static222.anInt4523++] = local62;
						}
					} else if (local92 == 2) {
						Static89.anIntArray194[Static57.anInt1448++] = local62;
						local66.anInt5378 = Static268.anInt5236;
						if (Static91.aClass2_Sub16_Sub1_1.method2202(1) == 1) {
							local139 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
							local66.method4294(2, local139);
							local149 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
							local66.method4294(2, local149);
						} else {
							local139 = Static91.aClass2_Sub16_Sub1_1.method2202(3);
							local66.method4294(0, local139);
						}
						local139 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
						if (local139 == 1) {
							Static132.anIntArray303[Static222.anInt4523++] = local62;
						}
					} else if (local92 == 3) {
						Static190.anIntArray399[Static214.anInt4373++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;Lclient!g;I)Ljava/lang/String;")
	public static String method824(@OriginalArg(0) String arg0, @OriginalArg(1) Class56 arg1) {
		if (arg0.indexOf("%") == -1) {
			return arg0;
		}
		while (true) {
			@Pc(14) int local14 = arg0.indexOf("%1");
			if (local14 == -1) {
				while (true) {
					local14 = arg0.indexOf("%2");
					if (local14 == -1) {
						while (true) {
							local14 = arg0.indexOf("%3");
							if (local14 == -1) {
								while (true) {
									local14 = arg0.indexOf("%4");
									if (local14 == -1) {
										while (true) {
											local14 = arg0.indexOf("%5");
											if (local14 == -1) {
												while (true) {
													local14 = arg0.indexOf("%dns");
													if (local14 == -1) {
														return arg0;
													}
													@Pc(190) String local190 = "";
													if (Static268.aClass111_8 != null) {
														if (Static268.aClass111_8.anObject4 == null) {
															local190 = Static258.method4046(Static268.aClass111_8.anInt3789);
														} else {
															local190 = (String) Static268.aClass111_8.anObject4;
														}
													}
													arg0 = arg0.substring(0, local14) + local190 + arg0.substring(local14 + 4);
												}
											}
											arg0 = arg0.substring(0, local14) + Static90.method1597(Static127.method2292(4, arg1)) + arg0.substring(local14 + 2);
										}
									}
									arg0 = arg0.substring(0, local14) + Static90.method1597(Static127.method2292(3, arg1)) + arg0.substring(local14 + 2);
								}
							}
							arg0 = arg0.substring(0, local14) + Static90.method1597(Static127.method2292(2, arg1)) + arg0.substring(local14 + 2);
						}
					}
					arg0 = arg0.substring(0, local14) + Static90.method1597(Static127.method2292(1, arg1)) + arg0.substring(local14 + 2);
				}
			}
			arg0 = arg0.substring(0, local14) + Static90.method1597(Static127.method2292(0, arg1)) + arg0.substring(local14 + 2);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V")
	public static void method826(@OriginalArg(1) boolean arg0) {
		Static235.method3809(Static300.anInt5786, Static205.aFloat43, Static87.aFloat8, Static218.aFloat44);
		Static235.method3803(Static248.anInt2157, Static7.anInt115, arg0);
		Static235.method3802((float) Static248.anInt2147, (float) Static53.anInt1318, (float) Static209.anInt4315);
		Static235.method3810();
		Static313.aFloat56 = Static118.aFloat19;
		Static126.aClass2_Sub8_Sub14_5 = Static73.aClass2_Sub8_Sub14_3;
		Static313.aFloat57 = Static202.aFloat21;
		Static313.aFloat58 = Static48.aFloat3;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
	public static void method827() {
		Static120.aClass157_24.method4034(5);
		Static159.aClass157_30.method4034(5);
	}
}
