import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!se", name = "W", descriptor = "Lclient!bn;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_12;

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
	public static int anInt5033;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V")
	public static void method4014() {
		Static72.aClass157_12.method4033();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public static void method4015() {
		Static203.aClass157_34.method4033();
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
	public static void method4016() {
		Static141.aClass157_26.method4033();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!qc;)V")
	public static void method4017(@OriginalArg(1) Class15_Sub2 arg0) {
		arg0.aBoolean356 = false;
		@Pc(18) Class112 local18;
		if (arg0.anInt5365 != -1) {
			local18 = Static208.method3496(arg0.anInt5365);
			if (local18 == null || local18.anIntArray378 == null) {
				arg0.anInt5365 = -1;
			} else {
				arg0.anInt5340++;
				if (arg0.anInt5319 < local18.anIntArray378.length && arg0.anInt5340 > local18.anIntArray377[arg0.anInt5319]) {
					arg0.anInt5319++;
					arg0.anInt5318++;
					arg0.anInt5340 = 1;
					Static28.method558(Static22.aClass15_Sub2_Sub2_1 == arg0, local18, arg0.anInt5319, arg0.anInt5358, arg0.anInt5371);
				}
				if (local18.anIntArray378.length <= arg0.anInt5319) {
					arg0.anInt5319 = 0;
					arg0.anInt5340 = 0;
					Static28.method558(Static22.aClass15_Sub2_Sub2_1 == arg0, local18, arg0.anInt5319, arg0.anInt5358, arg0.anInt5371);
				}
				arg0.anInt5318 = arg0.anInt5319 + 1;
				if (arg0.anInt5318 >= local18.anIntArray378.length) {
					arg0.anInt5318 = 0;
				}
			}
		}
		@Pc(157) Class112 local157;
		if (arg0.anInt5301 != -1 && arg0.anInt5367 <= Static268.anInt5236) {
			@Pc(142) Class96 local142 = Static156.method2852(arg0.anInt5301);
			@Pc(145) int local145 = local142.anInt3389;
			if (local145 == -1) {
				arg0.anInt5301 = -1;
			} else {
				label310: {
					local157 = Static208.method3496(local145);
					if (local142.aBoolean232) {
						if (local157.anInt3855 == 3) {
							if (arg0.anInt5370 > 0 && arg0.anInt5335 <= Static268.anInt5236 && arg0.anInt5328 < Static268.anInt5236) {
								arg0.anInt5301 = -1;
								break label310;
							}
						} else if (local157.anInt3855 == 1 && arg0.anInt5370 > 0 && Static268.anInt5236 >= arg0.anInt5335 && arg0.anInt5328 < Static268.anInt5236) {
							arg0.anInt5367 = Static268.anInt5236 + 1;
							break label310;
						}
					}
					if (local157 == null || local157.anIntArray378 == null) {
						arg0.anInt5301 = -1;
					} else {
						if (arg0.anInt5316 < 0) {
							arg0.anInt5316 = 0;
							Static28.method558(arg0 == Static22.aClass15_Sub2_Sub2_1, local157, 0, arg0.anInt5358, arg0.anInt5371);
						}
						arg0.anInt5321++;
						if (local157.anIntArray378.length > arg0.anInt5316 && arg0.anInt5321 > local157.anIntArray377[arg0.anInt5316]) {
							arg0.anInt5321 = 1;
							arg0.anInt5316++;
							Static28.method558(arg0 == Static22.aClass15_Sub2_Sub2_1, local157, arg0.anInt5316, arg0.anInt5358, arg0.anInt5371);
						}
						if (arg0.anInt5316 >= local157.anIntArray378.length) {
							if (local142.aBoolean232) {
								arg0.anInt5316 -= local157.anInt3856;
								arg0.anInt5305++;
								if (arg0.anInt5305 >= local157.anInt3858) {
									arg0.anInt5301 = -1;
								} else if (arg0.anInt5316 >= 0 && local157.anIntArray378.length > arg0.anInt5316) {
									Static28.method558(arg0 == Static22.aClass15_Sub2_Sub2_1, local157, arg0.anInt5316, arg0.anInt5358, arg0.anInt5371);
								} else {
									arg0.anInt5301 = -1;
								}
							} else {
								arg0.anInt5301 = -1;
							}
						}
						arg0.anInt5363 = arg0.anInt5316 + 1;
						if (arg0.anInt5363 >= local157.anIntArray378.length) {
							if (local142.aBoolean232) {
								arg0.anInt5363 -= local157.anInt3856;
								if (local157.anInt3858 <= arg0.anInt5305 + 1) {
									arg0.anInt5363 = -1;
								} else if (arg0.anInt5363 < 0 || arg0.anInt5363 >= local157.anIntArray378.length) {
									arg0.anInt5363 = -1;
								}
							} else {
								arg0.anInt5363 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5332 != -1 && arg0.anInt5343 <= 1) {
			local18 = Static208.method3496(arg0.anInt5332);
			if (local18.anInt3855 == 3) {
				if (arg0.anInt5370 > 0 && arg0.anInt5335 <= Static268.anInt5236 && Static268.anInt5236 > arg0.anInt5328) {
					arg0.anInt5332 = -1;
				}
			} else if (local18.anInt3855 == 1 && arg0.anInt5370 > 0 && Static268.anInt5236 >= arg0.anInt5335 && arg0.anInt5328 < Static268.anInt5236) {
				arg0.anInt5343 = 2;
			}
		}
		if (arg0.anInt5332 != -1 && arg0.anInt5343 == 0) {
			local18 = Static208.method3496(arg0.anInt5332);
			if (local18 == null || local18.anIntArray378 == null) {
				arg0.anInt5332 = -1;
			} else {
				arg0.anInt5368++;
				if (arg0.anInt5377 < local18.anIntArray378.length && local18.anIntArray377[arg0.anInt5377] < arg0.anInt5368) {
					arg0.anInt5377++;
					arg0.anInt5368 = 1;
					Static28.method558(arg0 == Static22.aClass15_Sub2_Sub2_1, local18, arg0.anInt5377, arg0.anInt5358, arg0.anInt5371);
				}
				if (arg0.anInt5377 >= local18.anIntArray378.length) {
					arg0.anInt5377 -= local18.anInt3856;
					arg0.anInt5353++;
					if (arg0.anInt5353 >= local18.anInt3858) {
						arg0.anInt5332 = -1;
					} else if (arg0.anInt5377 >= 0 && arg0.anInt5377 < local18.anIntArray378.length) {
						Static28.method558(arg0 == Static22.aClass15_Sub2_Sub2_1, local18, arg0.anInt5377, arg0.anInt5358, arg0.anInt5371);
					} else {
						arg0.anInt5332 = -1;
					}
				}
				arg0.anInt5362 = arg0.anInt5377 + 1;
				if (arg0.anInt5362 >= local18.anIntArray378.length) {
					arg0.anInt5362 -= local18.anInt3856;
					if (arg0.anInt5353 + 1 >= local18.anInt3858) {
						arg0.anInt5362 = -1;
					} else if (arg0.anInt5362 < 0 || arg0.anInt5362 >= local18.anIntArray378.length) {
						arg0.anInt5362 = -1;
					}
				}
				arg0.aBoolean356 = local18.aBoolean262;
			}
		}
		if (arg0.anInt5343 > 0) {
			arg0.anInt5343--;
		}
		for (@Pc(713) int local713 = 0; local713 < arg0.aClass62Array3.length; local713++) {
			@Pc(723) Class62 local723 = arg0.aClass62Array3[local713];
			if (local723 != null) {
				if (local723.anInt2284 > 0) {
					local723.anInt2284--;
				} else {
					local157 = Static208.method3496(local723.anInt2286);
					if (local157 == null || local157.anIntArray378 == null) {
						arg0.aClass62Array3[local713] = null;
					} else {
						local723.anInt2287++;
						if (local157.anIntArray378.length > local723.anInt2282 && local157.anIntArray377[local723.anInt2282] < local723.anInt2287) {
							local723.anInt2287 = 1;
							local723.anInt2282++;
							Static28.method558(Static22.aClass15_Sub2_Sub2_1 == arg0, local157, local723.anInt2282, arg0.anInt5358, arg0.anInt5371);
						}
						if (local157.anIntArray378.length <= local723.anInt2282) {
							local723.anInt2282 -= local157.anInt3856;
							local723.anInt2283++;
							if (local157.anInt3858 <= local723.anInt2283) {
								arg0.aClass62Array3[local713] = null;
							} else if (local723.anInt2282 >= 0 && local157.anIntArray378.length > local723.anInt2282) {
								Static28.method558(arg0 == Static22.aClass15_Sub2_Sub2_1, local157, local723.anInt2282, arg0.anInt5358, arg0.anInt5371);
							} else {
								arg0.aClass62Array3[local713] = null;
							}
						}
						local723.anInt2285 = local723.anInt2282 + 1;
						if (local157.anIntArray378.length <= local723.anInt2285) {
							local723.anInt2285 -= local157.anInt3856;
							if (local723.anInt2283 + 1 >= local157.anInt3858) {
								local723.anInt2285 = -1;
							} else if (local723.anInt2285 < 0 || local157.anIntArray378.length <= local723.anInt2285) {
								local723.anInt2285 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Lclient!hm;")
	public static Class75 method4018(@OriginalArg(0) int arg0) {
		@Pc(13) Class75 local13 = (Class75) Static230.aClass157_38.method4031((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(27) byte[] local27 = Static278.aClass42_97.method1256(0, arg0);
		local13 = new Class75();
		if (local27 != null) {
			local13.method1907(new Class2_Sub16(local27));
		}
		local13.method1906();
		Static230.aClass157_38.method4026((long) arg0, local13);
		return local13;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)I")
	public static int method4019(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(II)V")
	public static void method4020(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static27.method4373();
		} else if (arg0 == 2) {
			Static53.method977();
		} else if (arg0 == 3) {
			Static52.method966();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(IBI)V")
	public static void method4021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static18.anInt388 = arg1 - Static250.anInt3122;
		Static54.anInt1326 = Static250.anInt3118 + Static250.anInt3119 - arg0 - 1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!v;")
	public static Class3 method4022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class3_Sub1");
			@Pc(10) Class3 local10 = (Class3) local6.getDeclaredConstructor().newInstance();
			local10.method4447(arg0, arg1, arg2);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class3_Sub2 local28 = new Class3_Sub2();
			local28.method4447(arg0, arg1, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V")
	public static void method4025() {
		Static211.aClass2_Sub16_Sub1_2.method2198(60);
		Static211.aClass2_Sub16_Sub1_2.method2143(Static281.anInt5563);
	}
}
