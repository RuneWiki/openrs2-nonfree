import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2 aClass4_Sub2_Sub4_Sub2_8;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray30 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	public static int anInt4654 = 20;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3636(@OriginalArg(1) int arg0) {
		return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!wc;I)V")
	public static void method3637(@OriginalArg(0) Class13_Sub5 arg0) {
		arg0.aBoolean353 = false;
		@Pc(20) Class186 local20;
		if (arg0.anInt5307 != -1) {
			local20 = Static51.method992(arg0.anInt5307);
			if (local20 == null || local20.anIntArray469 == null) {
				arg0.anInt5307 = -1;
			} else {
				arg0.anInt5260++;
				if (arg0.anInt5287 < local20.anIntArray469.length && arg0.anInt5260 > local20.anIntArray470[arg0.anInt5287]) {
					arg0.anInt5287++;
					arg0.anInt5313++;
					arg0.anInt5260 = 1;
					Static229.method3598(Static72.aClass13_Sub5_Sub1_1 == arg0, arg0.anInt5294, local20, arg0.anInt5334, arg0.anInt5287);
				}
				if (arg0.anInt5287 >= local20.anIntArray469.length) {
					arg0.anInt5287 = 0;
					arg0.anInt5260 = 0;
					Static229.method3598(arg0 == Static72.aClass13_Sub5_Sub1_1, arg0.anInt5294, local20, arg0.anInt5334, arg0.anInt5287);
				}
				arg0.anInt5313 = arg0.anInt5287 + 1;
				if (arg0.anInt5313 >= local20.anIntArray469.length) {
					arg0.anInt5313 = 0;
				}
			}
		}
		@Pc(161) Class186 local161;
		if (arg0.anInt5291 != -1 && arg0.anInt5325 <= Static50.anInt1118) {
			@Pc(146) Class120 local146 = Static32.method639(arg0.anInt5291);
			@Pc(149) int local149 = local146.anInt3877;
			if (local149 == -1) {
				arg0.anInt5291 = -1;
			} else {
				label306: {
					local161 = Static51.method992(local149);
					if (local146.aBoolean241) {
						if (local161.anInt5820 == 3) {
							if (arg0.anInt5316 > 0 && Static50.anInt1118 >= arg0.anInt5285 && arg0.anInt5265 < Static50.anInt1118) {
								arg0.anInt5291 = -1;
								break label306;
							}
						} else if (local161.anInt5820 == 1 && arg0.anInt5316 > 0 && arg0.anInt5285 <= Static50.anInt1118 && Static50.anInt1118 > arg0.anInt5265) {
							arg0.anInt5325 = Static50.anInt1118 + 1;
							break label306;
						}
					}
					if (local161 == null || local161.anIntArray469 == null) {
						arg0.anInt5291 = -1;
					} else {
						if (arg0.anInt5279 < 0) {
							arg0.anInt5279 = 0;
							Static229.method3598(arg0 == Static72.aClass13_Sub5_Sub1_1, arg0.anInt5294, local161, arg0.anInt5334, 0);
						}
						arg0.anInt5281++;
						if (arg0.anInt5279 < local161.anIntArray469.length && arg0.anInt5281 > local161.anIntArray470[arg0.anInt5279]) {
							arg0.anInt5281 = 1;
							arg0.anInt5279++;
							Static229.method3598(arg0 == Static72.aClass13_Sub5_Sub1_1, arg0.anInt5294, local161, arg0.anInt5334, arg0.anInt5279);
						}
						if (arg0.anInt5279 >= local161.anIntArray469.length) {
							if (local146.aBoolean241) {
								arg0.anInt5331++;
								arg0.anInt5279 -= local161.anInt5823;
								if (arg0.anInt5331 >= local161.anInt5811) {
									arg0.anInt5291 = -1;
								} else if (arg0.anInt5279 >= 0 && local161.anIntArray469.length > arg0.anInt5279) {
									Static229.method3598(Static72.aClass13_Sub5_Sub1_1 == arg0, arg0.anInt5294, local161, arg0.anInt5334, arg0.anInt5279);
								} else {
									arg0.anInt5291 = -1;
								}
							} else {
								arg0.anInt5291 = -1;
							}
						}
						arg0.anInt5280 = arg0.anInt5279 + 1;
						if (arg0.anInt5280 >= local161.anIntArray469.length) {
							if (local146.aBoolean241) {
								arg0.anInt5280 -= local161.anInt5823;
								if (local161.anInt5811 <= arg0.anInt5331 + 1) {
									arg0.anInt5280 = -1;
								} else if (arg0.anInt5280 < 0 || local161.anIntArray469.length <= arg0.anInt5280) {
									arg0.anInt5280 = -1;
								}
							} else {
								arg0.anInt5280 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5305 != -1 && arg0.anInt5251 <= 1) {
			local20 = Static51.method992(arg0.anInt5305);
			if (local20.anInt5820 == 3) {
				if (arg0.anInt5316 > 0 && Static50.anInt1118 >= arg0.anInt5285 && arg0.anInt5265 < Static50.anInt1118) {
					arg0.anInt5305 = -1;
				}
			} else if (local20.anInt5820 == 1 && arg0.anInt5316 > 0 && Static50.anInt1118 >= arg0.anInt5285 && arg0.anInt5265 < Static50.anInt1118) {
				arg0.anInt5251 = 1;
			}
		}
		if (arg0.anInt5305 != -1 && arg0.anInt5251 == 0) {
			local20 = Static51.method992(arg0.anInt5305);
			if (local20 == null || local20.anIntArray469 == null) {
				arg0.anInt5305 = -1;
			} else {
				arg0.anInt5333++;
				if (arg0.anInt5249 < local20.anIntArray469.length && local20.anIntArray470[arg0.anInt5249] < arg0.anInt5333) {
					arg0.anInt5249++;
					arg0.anInt5333 = 1;
					Static229.method3598(arg0 == Static72.aClass13_Sub5_Sub1_1, arg0.anInt5294, local20, arg0.anInt5334, arg0.anInt5249);
				}
				if (local20.anIntArray469.length <= arg0.anInt5249) {
					arg0.anInt5249 -= local20.anInt5823;
					arg0.anInt5309++;
					if (local20.anInt5811 <= arg0.anInt5309) {
						arg0.anInt5305 = -1;
					} else if (arg0.anInt5249 >= 0 && arg0.anInt5249 < local20.anIntArray469.length) {
						Static229.method3598(arg0 == Static72.aClass13_Sub5_Sub1_1, arg0.anInt5294, local20, arg0.anInt5334, arg0.anInt5249);
					} else {
						arg0.anInt5305 = -1;
					}
				}
				arg0.anInt5247 = arg0.anInt5249 + 1;
				if (arg0.anInt5247 >= local20.anIntArray469.length) {
					arg0.anInt5247 -= local20.anInt5823;
					if (arg0.anInt5309 + 1 >= local20.anInt5811) {
						arg0.anInt5247 = -1;
					} else if (arg0.anInt5247 < 0 || local20.anIntArray469.length <= arg0.anInt5247) {
						arg0.anInt5247 = -1;
					}
				}
				arg0.aBoolean353 = local20.aBoolean407;
			}
		}
		if (arg0.anInt5251 > 0) {
			arg0.anInt5251--;
		}
		for (@Pc(713) int local713 = 0; local713 < arg0.aClass170Array3.length; local713++) {
			@Pc(727) Class170 local727 = arg0.aClass170Array3[local713];
			if (local727 != null) {
				if (local727.anInt5442 > 0) {
					local727.anInt5442--;
				} else {
					local161 = Static51.method992(local727.anInt5446);
					if (local161 == null || local161.anIntArray469 == null) {
						arg0.aClass170Array3[local713] = null;
					} else {
						local727.anInt5445++;
						if (local727.anInt5443 < local161.anIntArray469.length && local727.anInt5445 > local161.anIntArray470[local727.anInt5443]) {
							local727.anInt5445 = 1;
							local727.anInt5443++;
							Static229.method3598(arg0 == Static72.aClass13_Sub5_Sub1_1, arg0.anInt5294, local161, arg0.anInt5334, local727.anInt5443);
						}
						if (local161.anIntArray469.length <= local727.anInt5443) {
							local727.anInt5448++;
							local727.anInt5443 -= local161.anInt5823;
							if (local161.anInt5811 <= local727.anInt5448) {
								arg0.aClass170Array3[local713] = null;
							} else if (local727.anInt5443 >= 0 && local727.anInt5443 < local161.anIntArray469.length) {
								Static229.method3598(arg0 == Static72.aClass13_Sub5_Sub1_1, arg0.anInt5294, local161, arg0.anInt5334, local727.anInt5443);
							} else {
								arg0.aClass170Array3[local713] = null;
							}
						}
						local727.anInt5447 = local727.anInt5443 + 1;
						if (local161.anIntArray469.length <= local727.anInt5447) {
							local727.anInt5447 -= local161.anInt5823;
							if (local161.anInt5811 <= local727.anInt5448 + 1) {
								local727.anInt5447 = -1;
							} else if (local727.anInt5447 < 0 || local727.anInt5447 >= local161.anIntArray469.length) {
								local727.anInt5447 = -1;
							}
						}
					}
				}
			}
		}
	}
}
