import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!io;")
	public static final Class147 aClass147_6 = new Class147();

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	public static int anInt4863 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!hh;III)V")
	public static void method4108(@OriginalArg(0) Class30_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0.anInt4138 && arg1 != -1) {
			@Pc(17) Class64 local17 = Static47.aClass41_1.method911(arg1);
			@Pc(20) int local20 = local17.anInt1972;
			if (local20 == 1) {
				arg0.anInt4178 = arg2;
				arg0.anInt4188 = 1;
				arg0.anInt4164 = 0;
				arg0.anInt4189 = 0;
				arg0.anInt4142 = 0;
				Static349.method5479(arg0.anInt9416, arg0.aByte99, false, arg0.anInt4142, local17, arg0.anInt9418);
			}
			if (local20 == 2) {
				arg0.anInt4189 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt4138 == -1 || Static47.aClass41_1.method911(arg1).anInt1968 >= Static47.aClass41_1.method911(arg0.anInt4138).anInt1968) {
			arg0.anInt4189 = 0;
			arg0.anInt4138 = arg1;
			arg0.anInt4178 = arg2;
			arg0.anInt4142 = 0;
			arg0.anInt4164 = 0;
			arg0.anInt4203 = arg0.anInt4201;
			arg0.anInt4188 = 1;
			if (arg0.anInt4138 != -1) {
				Static349.method5479(arg0.anInt9416, arg0.aByte99, false, arg0.anInt4142, Static47.aClass41_1.method911(arg0.anInt4138), arg0.anInt9418);
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIBII)V")
	public static void method4109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class12_Sub4_Sub1 local15 = Static389.method6156(8, arg2);
		local15.method820();
		local15.anInt808 = arg3;
		local15.anInt803 = arg0;
		local15.anInt806 = arg1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLclient!be;)V")
	public static void method4110(@OriginalArg(1) Class30_Sub1_Sub1 arg0) {
		arg0.anInt4146 = 0;
		@Pc(18) Class64 local18;
		if (arg0.anInt4155 != -1) {
			local18 = Static47.aClass41_1.method911(arg0.anInt4155);
			if (local18 == null || local18.anIntArray185 == null) {
				arg0.aBoolean335 = false;
				arg0.anInt4155 = -1;
			} else {
				label394: {
					arg0.anInt4168++;
					if (arg0.anInt4187 < local18.anIntArray185.length && local18.anIntArray184[arg0.anInt4187] < arg0.anInt4168) {
						arg0.anInt4187++;
						arg0.anInt4124++;
						arg0.anInt4168 = 1;
						Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, arg0.anInt4187, local18, arg0.anInt9418);
					}
					if (local18.anIntArray185.length <= arg0.anInt4187) {
						arg0.anInt4187 = 0;
						arg0.anInt4168 = 0;
						if (arg0.aBoolean335) {
							arg0.anInt4155 = arg0.method3602().method4179();
							if (arg0.anInt4155 == -1) {
								arg0.aBoolean335 = false;
								break label394;
							}
							local18 = Static47.aClass41_1.method911(arg0.anInt4155);
						}
						Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, arg0.anInt4187, local18, arg0.anInt9418);
					}
					arg0.anInt4124 = arg0.anInt4187 + 1;
					if (local18.anIntArray185.length <= arg0.anInt4124) {
						arg0.anInt4124 = 0;
					}
				}
			}
		}
		@Pc(186) int local186;
		@Pc(195) Class64 local195;
		@Pc(183) Class50 local183;
		if (arg0.anInt4157 != -1 && Static409.anInt7683 >= arg0.anInt4172) {
			local183 = Static82.aClass212_2.method5063(arg0.anInt4157);
			local186 = local183.anInt1432;
			if (local186 == -1) {
				arg0.anInt4157 = -1;
			} else {
				label396: {
					local195 = Static47.aClass41_1.method911(local186);
					if (local183.aBoolean101) {
						if (local195.anInt1967 == 3) {
							if (arg0.anInt4203 > 0 && arg0.anInt4141 <= Static409.anInt7683 && Static409.anInt7683 > arg0.anInt4148) {
								arg0.anInt4157 = -1;
								break label396;
							}
						} else if (local195.anInt1967 == 1 && arg0.anInt4203 > 0 && arg0.anInt4141 <= Static409.anInt7683 && arg0.anInt4148 < Static409.anInt7683) {
							arg0.anInt4172 = Static409.anInt7683 + 1;
							break label396;
						}
					}
					if (local195 == null || local195.anIntArray185 == null) {
						arg0.anInt4157 = -1;
					} else {
						if (arg0.anInt4145 < 0) {
							arg0.anInt4145 = 0;
							Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, 0, local195, arg0.anInt9418);
						}
						arg0.anInt4130++;
						if (local195.anIntArray185.length > arg0.anInt4145 && arg0.anInt4130 > local195.anIntArray184[arg0.anInt4145]) {
							arg0.anInt4145++;
							arg0.anInt4130 = 1;
							Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, arg0.anInt4145, local195, arg0.anInt9418);
						}
						if (arg0.anInt4145 >= local195.anIntArray185.length) {
							if (local183.aBoolean101) {
								arg0.anInt4167++;
								arg0.anInt4145 -= local195.anInt1962;
								if (arg0.anInt4167 >= local195.anInt1973) {
									arg0.anInt4157 = -1;
								} else if (arg0.anInt4145 >= 0 && arg0.anInt4145 < local195.anIntArray185.length) {
									Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, arg0.anInt4145, local195, arg0.anInt9418);
								} else {
									arg0.anInt4157 = -1;
								}
							} else {
								arg0.anInt4157 = -1;
							}
						}
						arg0.anInt4191 = arg0.anInt4145 + 1;
						if (local195.anIntArray185.length <= arg0.anInt4191) {
							if (local183.aBoolean101) {
								arg0.anInt4191 -= local195.anInt1962;
								if (local195.anInt1973 <= arg0.anInt4167 + 1) {
									arg0.anInt4191 = -1;
								} else if (arg0.anInt4191 < 0 || local195.anIntArray185.length <= arg0.anInt4191) {
									arg0.anInt4191 = -1;
								}
							} else {
								arg0.anInt4191 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4126 != -1 && Static409.anInt7683 >= arg0.anInt4131) {
			local183 = Static82.aClass212_2.method5063(arg0.anInt4126);
			local186 = local183.anInt1432;
			if (local186 == -1) {
				arg0.anInt4126 = -1;
			} else {
				label399: {
					local195 = Static47.aClass41_1.method911(local186);
					if (local183.aBoolean101) {
						if (local195.anInt1967 == 3) {
							if (arg0.anInt4203 > 0 && arg0.anInt4141 <= Static409.anInt7683 && Static409.anInt7683 > arg0.anInt4148) {
								arg0.anInt4126 = -1;
								break label399;
							}
						} else if (local195.anInt1967 == 1 && arg0.anInt4203 > 0 && Static409.anInt7683 >= arg0.anInt4141 && arg0.anInt4148 < Static409.anInt7683) {
							arg0.anInt4131 = Static409.anInt7683 + 1;
							break label399;
						}
					}
					if (local195 == null || local195.anIntArray185 == null) {
						arg0.anInt4126 = -1;
					} else {
						if (arg0.anInt4140 < 0) {
							arg0.anInt4140 = 0;
							Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, 0, local195, arg0.anInt9418);
						}
						arg0.anInt4183++;
						if (arg0.anInt4140 < local195.anIntArray185.length && arg0.anInt4183 > local195.anIntArray184[arg0.anInt4140]) {
							arg0.anInt4183 = 1;
							arg0.anInt4140++;
							Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, arg0.anInt4140, local195, arg0.anInt9418);
						}
						if (local195.anIntArray185.length <= arg0.anInt4140) {
							if (local183.aBoolean101) {
								arg0.anInt4140 -= local195.anInt1962;
								arg0.anInt4154++;
								if (arg0.anInt4154 >= local195.anInt1973) {
									arg0.anInt4126 = -1;
								} else if (arg0.anInt4140 >= 0 && arg0.anInt4140 < local195.anIntArray185.length) {
									Static349.method5479(arg0.anInt9416, arg0.aByte99, arg0 == Static440.aClass30_Sub1_Sub1_Sub1_2, arg0.anInt4140, local195, arg0.anInt9418);
								} else {
									arg0.anInt4126 = -1;
								}
							} else {
								arg0.anInt4126 = -1;
							}
						}
						arg0.anInt4134 = arg0.anInt4140 + 1;
						if (local195.anIntArray185.length <= arg0.anInt4134) {
							if (local183.aBoolean101) {
								arg0.anInt4134 -= local195.anInt1962;
								if (arg0.anInt4154 + 1 >= local195.anInt1973) {
									arg0.anInt4134 = -1;
								} else if (arg0.anInt4134 < 0 || local195.anIntArray185.length <= arg0.anInt4134) {
									arg0.anInt4134 = -1;
								}
							} else {
								arg0.anInt4134 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4138 != -1 && arg0.anInt4178 <= 1) {
			local18 = Static47.aClass41_1.method911(arg0.anInt4138);
			if (local18.anInt1967 == 3) {
				if (arg0.anInt4203 > 0 && Static409.anInt7683 >= arg0.anInt4141 && arg0.anInt4148 < Static409.anInt7683) {
					arg0.anInt4138 = -1;
				}
			} else if (local18.anInt1967 == 1 && arg0.anInt4203 > 0 && arg0.anInt4141 <= Static409.anInt7683 && Static409.anInt7683 > arg0.anInt4148) {
				arg0.anInt4178 = 2;
			}
		}
		if (arg0.anInt4138 != -1 && arg0.anInt4178 == 0) {
			local18 = Static47.aClass41_1.method911(arg0.anInt4138);
			if (local18 == null || local18.anIntArray185 == null) {
				arg0.anInt4138 = -1;
			} else {
				arg0.anInt4164++;
				if (local18.anIntArray185.length > arg0.anInt4142 && local18.anIntArray184[arg0.anInt4142] < arg0.anInt4164) {
					arg0.anInt4164 = 1;
					arg0.anInt4142++;
					Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, arg0.anInt4142, local18, arg0.anInt9418);
				}
				if (arg0.anInt4142 >= local18.anIntArray185.length) {
					arg0.anInt4142 -= local18.anInt1962;
					arg0.anInt4189++;
					if (arg0.anInt4189 >= local18.anInt1973) {
						arg0.anInt4138 = -1;
					} else if (arg0.anInt4142 >= 0 && arg0.anInt4142 < local18.anIntArray185.length) {
						Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, arg0.anInt4142, local18, arg0.anInt9418);
					} else {
						arg0.anInt4138 = -1;
					}
				}
				arg0.anInt4188 = arg0.anInt4142 + 1;
				if (arg0.anInt4188 >= local18.anIntArray185.length) {
					arg0.anInt4188 -= local18.anInt1962;
					if (local18.anInt1973 <= arg0.anInt4189 + 1) {
						arg0.anInt4188 = -1;
					} else if (arg0.anInt4188 < 0 || local18.anIntArray185.length <= arg0.anInt4188) {
						arg0.anInt4188 = -1;
					}
				}
				arg0.anInt4146 = local18.anInt1965;
			}
		}
		if (arg0.anInt4178 > 0) {
			arg0.anInt4178--;
		}
		for (@Pc(1047) int local1047 = 0; local1047 < arg0.aClass288Array3.length; local1047++) {
			@Pc(1054) Class288 local1054 = arg0.aClass288Array3[local1047];
			if (local1054 != null) {
				if (local1054.anInt8707 > 0) {
					local1054.anInt8707--;
				} else {
					local195 = Static47.aClass41_1.method911(local1054.anInt8706);
					if (local195 == null || local195.anIntArray185 == null) {
						arg0.aClass288Array3[local1047] = null;
					} else {
						local1054.anInt8708++;
						if (local1054.anInt8701 < local195.anIntArray185.length && local1054.anInt8708 > local195.anIntArray184[local1054.anInt8701]) {
							local1054.anInt8701++;
							local1054.anInt8708 = 1;
							Static349.method5479(arg0.anInt9416, arg0.aByte99, arg0 == Static440.aClass30_Sub1_Sub1_Sub1_2, local1054.anInt8701, local195, arg0.anInt9418);
						}
						if (local195.anIntArray185.length <= local1054.anInt8701) {
							local1054.anInt8701 -= local195.anInt1962;
							local1054.anInt8702++;
							if (local1054.anInt8702 >= local195.anInt1973) {
								arg0.aClass288Array3[local1047] = null;
							} else if (local1054.anInt8701 >= 0 && local195.anIntArray185.length > local1054.anInt8701) {
								Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, local1054.anInt8701, local195, arg0.anInt9418);
							} else {
								arg0.aClass288Array3[local1047] = null;
							}
						}
						local1054.anInt8704 = local1054.anInt8701 + 1;
						if (local1054.anInt8704 >= local195.anIntArray185.length) {
							local1054.anInt8704 -= local195.anInt1962;
							if (local195.anInt1973 <= local1054.anInt8702 + 1) {
								local1054.anInt8704 = -1;
							} else if (local1054.anInt8704 < 0 || local195.anIntArray185.length <= local1054.anInt8704) {
								local1054.anInt8704 = -1;
							}
						}
					}
				}
			}
		}
	}
}
