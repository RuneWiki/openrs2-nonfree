import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "Lclient!ho;")
	public static Class3_Sub4_Sub12 aClass3_Sub4_Sub12_4;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public static int anInt4877 = 0;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
	public static int anInt4879 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ud;B)V")
	public static void method4069(@OriginalArg(0) Class10_Sub5 arg0) {
		arg0.aBoolean356 = false;
		@Pc(18) Class15 local18;
		if (arg0.anInt5066 != -1) {
			local18 = Static253.method4288(arg0.anInt5066);
			if (local18 == null || local18.anIntArray35 == null) {
				arg0.anInt5066 = -1;
			} else {
				arg0.anInt5034++;
				if (arg0.anInt5025 < local18.anIntArray35.length && arg0.anInt5034 > local18.anIntArray36[arg0.anInt5025]) {
					arg0.anInt5025++;
					arg0.anInt5034 = 1;
					arg0.anInt5020++;
					Static158.method2622(arg0.anInt5073, arg0.anInt5025, local18, Static136.aClass10_Sub5_Sub1_1 == arg0, arg0.anInt5016);
				}
				if (local18.anIntArray35.length <= arg0.anInt5025) {
					arg0.anInt5025 = 0;
					arg0.anInt5034 = 0;
					Static158.method2622(arg0.anInt5073, arg0.anInt5025, local18, arg0 == Static136.aClass10_Sub5_Sub1_1, arg0.anInt5016);
				}
				arg0.anInt5020 = arg0.anInt5025 + 1;
				if (arg0.anInt5020 >= local18.anIntArray35.length) {
					arg0.anInt5020 = 0;
				}
			}
		}
		@Pc(165) Class15 local165;
		if (arg0.anInt5023 != -1 && arg0.anInt5050 <= Static124.anInt2371) {
			@Pc(154) Class173 local154 = Static297.method1843(arg0.anInt5023);
			@Pc(157) int local157 = local154.anInt5489;
			if (local157 == -1) {
				arg0.anInt5023 = -1;
			} else {
				label310: {
					local165 = Static253.method4288(local157);
					if (local154.aBoolean380) {
						if (local165.anInt419 == 3) {
							if (arg0.anInt5021 > 0 && arg0.anInt5094 <= Static124.anInt2371 && arg0.anInt5088 < Static124.anInt2371) {
								arg0.anInt5023 = -1;
								break label310;
							}
						} else if (local165.anInt419 == 1 && arg0.anInt5021 > 0 && Static124.anInt2371 >= arg0.anInt5094 && arg0.anInt5088 < Static124.anInt2371) {
							arg0.anInt5050 = Static124.anInt2371 + 1;
							break label310;
						}
					}
					if (local165 == null || local165.anIntArray35 == null) {
						arg0.anInt5023 = -1;
					} else {
						if (arg0.anInt5047 < 0) {
							arg0.anInt5047 = 0;
							Static158.method2622(arg0.anInt5073, 0, local165, Static136.aClass10_Sub5_Sub1_1 == arg0, arg0.anInt5016);
						}
						arg0.anInt5101++;
						if (arg0.anInt5047 < local165.anIntArray35.length && arg0.anInt5101 > local165.anIntArray36[arg0.anInt5047]) {
							arg0.anInt5101 = 1;
							arg0.anInt5047++;
							Static158.method2622(arg0.anInt5073, arg0.anInt5047, local165, arg0 == Static136.aClass10_Sub5_Sub1_1, arg0.anInt5016);
						}
						if (arg0.anInt5047 >= local165.anIntArray35.length) {
							if (local154.aBoolean380) {
								arg0.anInt5047 -= local165.anInt424;
								arg0.anInt5056++;
								if (local165.anInt422 <= arg0.anInt5056) {
									arg0.anInt5023 = -1;
								} else if (arg0.anInt5047 >= 0 && arg0.anInt5047 < local165.anIntArray35.length) {
									Static158.method2622(arg0.anInt5073, arg0.anInt5047, local165, Static136.aClass10_Sub5_Sub1_1 == arg0, arg0.anInt5016);
								} else {
									arg0.anInt5023 = -1;
								}
							} else {
								arg0.anInt5023 = -1;
							}
						}
						arg0.anInt5069 = arg0.anInt5047 + 1;
						if (local165.anIntArray35.length <= arg0.anInt5069) {
							if (local154.aBoolean380) {
								arg0.anInt5069 -= local165.anInt424;
								if (local165.anInt422 <= arg0.anInt5056 + 1) {
									arg0.anInt5069 = -1;
								} else if (arg0.anInt5069 < 0 || arg0.anInt5069 >= local165.anIntArray35.length) {
									arg0.anInt5069 = -1;
								}
							} else {
								arg0.anInt5069 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5061 != -1 && arg0.anInt5027 <= 1) {
			local18 = Static253.method4288(arg0.anInt5061);
			if (local18.anInt419 == 3) {
				if (arg0.anInt5021 > 0 && arg0.anInt5094 <= Static124.anInt2371 && arg0.anInt5088 < Static124.anInt2371) {
					arg0.anInt5061 = -1;
				}
			} else if (local18.anInt419 == 1 && arg0.anInt5021 > 0 && Static124.anInt2371 >= arg0.anInt5094 && arg0.anInt5088 < Static124.anInt2371) {
				arg0.anInt5027 = 2;
			}
		}
		if (arg0.anInt5061 != -1 && arg0.anInt5027 == 0) {
			local18 = Static253.method4288(arg0.anInt5061);
			if (local18 == null || local18.anIntArray35 == null) {
				arg0.anInt5061 = -1;
			} else {
				arg0.anInt5081++;
				if (local18.anIntArray35.length > arg0.anInt5049 && arg0.anInt5081 > local18.anIntArray36[arg0.anInt5049]) {
					arg0.anInt5049++;
					arg0.anInt5081 = 1;
					Static158.method2622(arg0.anInt5073, arg0.anInt5049, local18, Static136.aClass10_Sub5_Sub1_1 == arg0, arg0.anInt5016);
				}
				if (arg0.anInt5049 >= local18.anIntArray35.length) {
					arg0.anInt5051++;
					arg0.anInt5049 -= local18.anInt424;
					if (local18.anInt422 <= arg0.anInt5051) {
						arg0.anInt5061 = -1;
					} else if (arg0.anInt5049 >= 0 && local18.anIntArray35.length > arg0.anInt5049) {
						Static158.method2622(arg0.anInt5073, arg0.anInt5049, local18, arg0 == Static136.aClass10_Sub5_Sub1_1, arg0.anInt5016);
					} else {
						arg0.anInt5061 = -1;
					}
				}
				arg0.anInt5035 = arg0.anInt5049 + 1;
				if (arg0.anInt5035 >= local18.anIntArray35.length) {
					arg0.anInt5035 -= local18.anInt424;
					if (arg0.anInt5051 + 1 >= local18.anInt422) {
						arg0.anInt5035 = -1;
					} else if (arg0.anInt5035 < 0 || local18.anIntArray35.length <= arg0.anInt5035) {
						arg0.anInt5035 = -1;
					}
				}
				arg0.aBoolean356 = local18.aBoolean37;
			}
		}
		if (arg0.anInt5027 > 0) {
			arg0.anInt5027--;
		}
		for (@Pc(732) int local732 = 0; local732 < arg0.aClass145Array3.length; local732++) {
			@Pc(742) Class145 local742 = arg0.aClass145Array3[local732];
			if (local742 != null) {
				if (local742.anInt4348 > 0) {
					local742.anInt4348--;
				} else {
					local165 = Static253.method4288(local742.anInt4347);
					if (local165 == null || local165.anIntArray35 == null) {
						arg0.aClass145Array3[local732] = null;
					} else {
						local742.anInt4350++;
						if (local742.anInt4341 < local165.anIntArray35.length && local165.anIntArray36[local742.anInt4341] < local742.anInt4350) {
							local742.anInt4341++;
							local742.anInt4350 = 1;
							Static158.method2622(arg0.anInt5073, local742.anInt4341, local165, Static136.aClass10_Sub5_Sub1_1 == arg0, arg0.anInt5016);
						}
						if (local742.anInt4341 >= local165.anIntArray35.length) {
							local742.anInt4341 -= local165.anInt424;
							local742.anInt4346++;
							if (local742.anInt4346 >= local165.anInt422) {
								arg0.aClass145Array3[local732] = null;
							} else if (local742.anInt4341 >= 0 && local742.anInt4341 < local165.anIntArray35.length) {
								Static158.method2622(arg0.anInt5073, local742.anInt4341, local165, arg0 == Static136.aClass10_Sub5_Sub1_1, arg0.anInt5016);
							} else {
								arg0.aClass145Array3[local732] = null;
							}
						}
						local742.anInt4345 = local742.anInt4341 + 1;
						if (local165.anIntArray35.length <= local742.anInt4345) {
							local742.anInt4345 -= local165.anInt424;
							if (local165.anInt422 <= local742.anInt4346 + 1) {
								local742.anInt4345 = -1;
							} else if (local742.anInt4345 < 0 || local165.anIntArray35.length <= local742.anInt4345) {
								local742.anInt4345 = -1;
							}
						}
					}
				}
			}
		}
	}
}
