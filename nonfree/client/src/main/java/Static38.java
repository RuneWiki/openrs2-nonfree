import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!rn;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public static int anInt806;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
	public static boolean method683(@OriginalArg(2) String arg0) {
		@Pc(24) boolean local24 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) char local44 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local44 == '-') {
					local24 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(72) int local72;
			if (local44 >= '0' && local44 <= '9') {
				local72 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local72 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local72 = local44 - 'W';
			} else {
				return false;
			}
			if (local72 >= 10) {
				return false;
			}
			if (local24) {
				local72 = -local72;
			}
			@Pc(121) int local121 = local33 * 10 + local72;
			if (local33 != local121 / 10) {
				return false;
			}
			local33 = local121;
			local31 = true;
		}
		return local31;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method688() {
		Static84.anInt1555 = Static302.aClass136_4.anInt3408 + Static302.aClass136_4.anInt3405 + 2;
		Static337.anInt5770 = Static238.aClass136_7.anInt3408 + Static238.aClass136_7.anInt3405 + 2;
		Static79.aStringArray120 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Static79.aStringArray120.length; local28++) {
			Static79.aStringArray120[local28] = "";
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!fo;)V")
	public static void method689(@OriginalArg(1) Class1_Sub5_Sub1 arg0) {
		arg0.aBoolean461 = false;
		@Pc(18) Class202 local18;
		if (arg0.anInt6423 != -1) {
			local18 = Static36.aClass236_1.method5396(arg0.anInt6423);
			if (local18 == null || local18.anIntArray974 == null) {
				arg0.anInt6423 = -1;
				arg0.aBoolean460 = false;
			} else {
				label297: {
					arg0.anInt6450++;
					if (arg0.anInt6414 < local18.anIntArray974.length && local18.anIntArray973[arg0.anInt6414] < arg0.anInt6450) {
						arg0.anInt6450 = 1;
						arg0.anInt6414++;
						arg0.anInt6425++;
						Static169.method2965(arg0.anInt6414, arg0 == Static206.aClass1_Sub5_Sub1_Sub1_1, arg0.aByte69, arg0.anInt6390, local18, arg0.anInt6386);
					}
					if (arg0.anInt6414 >= local18.anIntArray974.length) {
						arg0.anInt6414 = 0;
						arg0.anInt6450 = 0;
						if (arg0.aBoolean460) {
							arg0.anInt6423 = arg0.method5552().method2674();
							if (arg0.anInt6423 == -1) {
								arg0.aBoolean460 = false;
								break label297;
							}
							local18 = Static36.aClass236_1.method5396(arg0.anInt6423);
						}
						Static169.method2965(arg0.anInt6414, Static206.aClass1_Sub5_Sub1_Sub1_1 == arg0, arg0.aByte69, arg0.anInt6390, local18, arg0.anInt6386);
					}
					arg0.anInt6425 = arg0.anInt6414 + 1;
					if (arg0.anInt6425 >= local18.anIntArray974.length) {
						arg0.anInt6425 = 0;
					}
				}
			}
		}
		@Pc(188) Class202 local188;
		if (arg0.anInt6420 != -1 && arg0.anInt6395 <= Static253.anInt4469) {
			@Pc(176) Class34 local176 = Static149.aClass173_5.method3800(arg0.anInt6420);
			@Pc(179) int local179 = local176.anInt863;
			if (local179 == -1) {
				arg0.anInt6420 = -1;
			} else {
				label299: {
					local188 = Static36.aClass236_1.method5396(local179);
					if (local176.aBoolean65) {
						if (local188.anInt4937 == 3) {
							if (arg0.anInt6455 > 0 && arg0.anInt6412 <= Static253.anInt4469 && Static253.anInt4469 > arg0.anInt6441) {
								arg0.anInt6420 = -1;
								break label299;
							}
						} else if (local188.anInt4937 == 1 && arg0.anInt6455 > 0 && arg0.anInt6412 <= Static253.anInt4469 && Static253.anInt4469 > arg0.anInt6441) {
							arg0.anInt6395 = Static253.anInt4469 + 1;
							break label299;
						}
					}
					if (local188 == null || local188.anIntArray974 == null) {
						arg0.anInt6420 = -1;
					} else {
						if (arg0.anInt6404 < 0) {
							arg0.anInt6404 = 0;
							Static169.method2965(0, Static206.aClass1_Sub5_Sub1_Sub1_1 == arg0, arg0.aByte69, arg0.anInt6390, local188, arg0.anInt6386);
						}
						arg0.anInt6400++;
						if (local188.anIntArray974.length > arg0.anInt6404 && arg0.anInt6400 > local188.anIntArray973[arg0.anInt6404]) {
							arg0.anInt6404++;
							arg0.anInt6400 = 1;
							Static169.method2965(arg0.anInt6404, Static206.aClass1_Sub5_Sub1_Sub1_1 == arg0, arg0.aByte69, arg0.anInt6390, local188, arg0.anInt6386);
						}
						if (local188.anIntArray974.length <= arg0.anInt6404) {
							if (local176.aBoolean65) {
								arg0.anInt6404 -= local188.anInt4942;
								arg0.anInt6408++;
								if (local188.anInt4927 <= arg0.anInt6408) {
									arg0.anInt6420 = -1;
								} else if (arg0.anInt6404 >= 0 && local188.anIntArray974.length > arg0.anInt6404) {
									Static169.method2965(arg0.anInt6404, Static206.aClass1_Sub5_Sub1_Sub1_1 == arg0, arg0.aByte69, arg0.anInt6390, local188, arg0.anInt6386);
								} else {
									arg0.anInt6420 = -1;
								}
							} else {
								arg0.anInt6420 = -1;
							}
						}
						arg0.anInt6442 = arg0.anInt6404 + 1;
						if (local188.anIntArray974.length <= arg0.anInt6442) {
							if (local176.aBoolean65) {
								arg0.anInt6442 -= local188.anInt4942;
								if (arg0.anInt6408 + 1 >= local188.anInt4927) {
									arg0.anInt6442 = -1;
								} else if (arg0.anInt6442 < 0 || arg0.anInt6442 >= local188.anIntArray974.length) {
									arg0.anInt6442 = -1;
								}
							} else {
								arg0.anInt6442 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6405 != -1 && arg0.anInt6429 <= 1) {
			local18 = Static36.aClass236_1.method5396(arg0.anInt6405);
			if (local18.anInt4937 == 3) {
				if (arg0.anInt6455 > 0 && arg0.anInt6412 <= Static253.anInt4469 && Static253.anInt4469 > arg0.anInt6441) {
					arg0.anInt6405 = -1;
				}
			} else if (local18.anInt4937 == 1 && arg0.anInt6455 > 0 && arg0.anInt6412 <= Static253.anInt4469 && Static253.anInt4469 > arg0.anInt6441) {
				arg0.anInt6429 = 2;
			}
		}
		if (arg0.anInt6405 != -1 && arg0.anInt6429 == 0) {
			local18 = Static36.aClass236_1.method5396(arg0.anInt6405);
			if (local18 == null || local18.anIntArray974 == null) {
				arg0.anInt6405 = -1;
			} else {
				arg0.anInt6427++;
				if (arg0.anInt6443 < local18.anIntArray974.length && arg0.anInt6427 > local18.anIntArray973[arg0.anInt6443]) {
					arg0.anInt6427 = 1;
					arg0.anInt6443++;
					Static169.method2965(arg0.anInt6443, Static206.aClass1_Sub5_Sub1_Sub1_1 == arg0, arg0.aByte69, arg0.anInt6390, local18, arg0.anInt6386);
				}
				if (arg0.anInt6443 >= local18.anIntArray974.length) {
					arg0.anInt6443 -= local18.anInt4942;
					arg0.anInt6452++;
					if (arg0.anInt6452 >= local18.anInt4927) {
						arg0.anInt6405 = -1;
					} else if (arg0.anInt6443 >= 0 && local18.anIntArray974.length > arg0.anInt6443) {
						Static169.method2965(arg0.anInt6443, Static206.aClass1_Sub5_Sub1_Sub1_1 == arg0, arg0.aByte69, arg0.anInt6390, local18, arg0.anInt6386);
					} else {
						arg0.anInt6405 = -1;
					}
				}
				arg0.anInt6436 = arg0.anInt6443 + 1;
				if (arg0.anInt6436 >= local18.anIntArray974.length) {
					arg0.anInt6436 -= local18.anInt4942;
					if (local18.anInt4927 <= arg0.anInt6452 + 1) {
						arg0.anInt6436 = -1;
					} else if (arg0.anInt6436 < 0 || arg0.anInt6436 >= local18.anIntArray974.length) {
						arg0.anInt6436 = -1;
					}
				}
				arg0.aBoolean461 = local18.aBoolean375;
			}
		}
		if (arg0.anInt6429 > 0) {
			arg0.anInt6429--;
		}
		for (@Pc(728) int local728 = 0; local728 < arg0.aClass12Array3.length; local728++) {
			@Pc(744) Class12 local744 = arg0.aClass12Array3[local728];
			if (local744 != null) {
				if (local744.anInt316 > 0) {
					local744.anInt316--;
				} else {
					local188 = Static36.aClass236_1.method5396(local744.anInt319);
					if (local188 == null || local188.anIntArray974 == null) {
						arg0.aClass12Array3[local728] = null;
					} else {
						local744.anInt321++;
						if (local744.anInt318 < local188.anIntArray974.length && local188.anIntArray973[local744.anInt318] < local744.anInt321) {
							local744.anInt321 = 1;
							local744.anInt318++;
							Static169.method2965(local744.anInt318, arg0 == Static206.aClass1_Sub5_Sub1_Sub1_1, arg0.aByte69, arg0.anInt6390, local188, arg0.anInt6386);
						}
						if (local188.anIntArray974.length <= local744.anInt318) {
							local744.anInt318 -= local188.anInt4942;
							local744.anInt317++;
							if (local744.anInt317 >= local188.anInt4927) {
								arg0.aClass12Array3[local728] = null;
							} else if (local744.anInt318 >= 0 && local744.anInt318 < local188.anIntArray974.length) {
								Static169.method2965(local744.anInt318, Static206.aClass1_Sub5_Sub1_Sub1_1 == arg0, arg0.aByte69, arg0.anInt6390, local188, arg0.anInt6386);
							} else {
								arg0.aClass12Array3[local728] = null;
							}
						}
						local744.anInt320 = local744.anInt318 + 1;
						if (local744.anInt320 >= local188.anIntArray974.length) {
							local744.anInt320 -= local188.anInt4942;
							if (local744.anInt317 + 1 >= local188.anInt4927) {
								local744.anInt320 = -1;
							} else if (local744.anInt320 < 0 || local188.anIntArray974.length <= local744.anInt320) {
								local744.anInt320 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZ)I")
	public static int method690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static382.anIntArray1343[arg1 & 0x3] : 256;
	}
}
