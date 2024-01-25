import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!on", name = "z", descriptor = "I")
	public static int anInt7498;

	@OriginalMember(owner = "client!on", name = "ab", descriptor = "Lclient!gca;")
	public static final Class119 aClass119_5 = new Class119();

	@OriginalMember(owner = "client!on", name = "cb", descriptor = "[I")
	public static final int[] anIntArray411 = new int[1];

	@OriginalMember(owner = "client!on", name = "db", descriptor = "Z")
	public static final boolean aBoolean551 = false;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!ufa;)V")
	public static void method5905(@OriginalArg(1) Class21_Sub1_Sub1_Sub1 arg0) {
		@Pc(11) Class111 local11;
		if (arg0.anInt4254 != -1) {
			local11 = Static17.aClass254_1.method5936(arg0.anInt4254);
			if (local11 == null || local11.anIntArray153 == null) {
				arg0.aBoolean294 = false;
				arg0.anInt4254 = -1;
			} else {
				label357: {
					arg0.anInt4266++;
					if (local11.anIntArray153.length > arg0.anInt4243 && arg0.anInt4266 > local11.anIntArray150[arg0.anInt4243]) {
						arg0.anInt4266 = 1;
						arg0.anInt4243++;
						arg0.anInt4198++;
						if (!arg0.aBoolean295) {
							Static593.method8263(arg0.anInt4243, arg0, local11);
						}
					}
					if (arg0.anInt4243 >= local11.anIntArray153.length) {
						arg0.anInt4266 = 0;
						arg0.anInt4243 = 0;
						if (arg0.aBoolean294) {
							arg0.anInt4254 = arg0.method3322().method5906();
							if (arg0.anInt4254 == -1) {
								arg0.aBoolean294 = false;
								break label357;
							}
							local11 = Static17.aClass254_1.method5936(arg0.anInt4254);
						}
						if (!arg0.aBoolean295) {
							Static593.method8263(arg0.anInt4243, arg0, local11);
						}
					}
					arg0.anInt4198 = arg0.anInt4243 + 1;
					if (local11.anIntArray153 == null) {
						arg0.anInt4254 = -1;
						arg0.aBoolean294 = false;
					} else if (local11.anIntArray153.length <= arg0.anInt4198) {
						arg0.anInt4198 = 0;
					}
				}
			}
		}
		@Pc(175) int local175;
		@Pc(184) Class111 local184;
		@Pc(172) Class49 local172;
		if (arg0.anInt4233 != -1 && arg0.anInt4231 <= Static306.anInt6122) {
			local172 = Static342.aClass132_2.method2958(arg0.anInt4233);
			local175 = local172.anInt1459;
			if (local175 == -1) {
				arg0.anInt4233 = -1;
			} else {
				label358: {
					local184 = Static17.aClass254_1.method5936(local175);
					if (local172.aBoolean119) {
						if (local184.anInt3147 == 3) {
							if (arg0.anInt4280 > 0 && arg0.anInt4242 <= Static306.anInt6122 && arg0.anInt4212 < Static306.anInt6122) {
								arg0.anInt4233 = -1;
								break label358;
							}
						} else if (local184.anInt3147 == 1 && arg0.anInt4280 > 0 && arg0.anInt4242 <= Static306.anInt6122 && Static306.anInt6122 > arg0.anInt4212) {
							arg0.anInt4231 = Static306.anInt6122 + 1;
							break label358;
						}
					}
					if (local184 == null || local184.anIntArray153 == null) {
						arg0.anInt4233 = -1;
					} else {
						if (arg0.anInt4236 < 0) {
							arg0.anInt4236 = 0;
							if (!arg0.aBoolean295) {
								Static593.method8263(0, arg0, local184);
							}
						}
						arg0.anInt4204++;
						if (local184.anIntArray153.length > arg0.anInt4236 && local184.anIntArray150[arg0.anInt4236] < arg0.anInt4204) {
							arg0.anInt4236++;
							arg0.anInt4204 = 1;
							if (!arg0.aBoolean295) {
								Static593.method8263(arg0.anInt4236, arg0, local184);
							}
						}
						if (arg0.anInt4236 >= local184.anIntArray153.length) {
							if (local172.aBoolean119) {
								arg0.anInt4236 -= local184.anInt3155;
								arg0.anInt4194++;
								if (local184.anInt3156 <= arg0.anInt4194) {
									arg0.anInt4233 = -1;
								} else if (arg0.anInt4236 < 0 || local184.anIntArray153.length <= arg0.anInt4236) {
									arg0.anInt4233 = -1;
								} else if (!arg0.aBoolean295) {
									Static593.method8263(arg0.anInt4236, arg0, local184);
								}
							} else {
								arg0.anInt4233 = -1;
							}
						}
						arg0.anInt4271 = arg0.anInt4236 + 1;
						if (local184.anIntArray153.length <= arg0.anInt4271) {
							if (local172.aBoolean119) {
								arg0.anInt4271 -= local184.anInt3155;
								if (arg0.anInt4194 + 1 >= local184.anInt3156) {
									arg0.anInt4271 = -1;
								} else if (arg0.anInt4271 < 0 || local184.anIntArray153.length <= arg0.anInt4271) {
									arg0.anInt4271 = -1;
								}
							} else {
								arg0.anInt4271 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4224 != -1 && Static306.anInt6122 >= arg0.anInt4213) {
			local172 = Static342.aClass132_2.method2958(arg0.anInt4224);
			local175 = local172.anInt1459;
			if (local175 == -1) {
				arg0.anInt4224 = -1;
			} else {
				label361: {
					local184 = Static17.aClass254_1.method5936(local175);
					if (local172.aBoolean119) {
						if (local184.anInt3147 == 3) {
							if (arg0.anInt4280 > 0 && Static306.anInt6122 >= arg0.anInt4242 && Static306.anInt6122 > arg0.anInt4212) {
								arg0.anInt4224 = -1;
								break label361;
							}
						} else if (local184.anInt3147 == 1 && arg0.anInt4280 > 0 && Static306.anInt6122 >= arg0.anInt4242 && Static306.anInt6122 > arg0.anInt4212) {
							arg0.anInt4213 = Static306.anInt6122 + 1;
							break label361;
						}
					}
					if (local184 == null || local184.anIntArray153 == null) {
						arg0.anInt4224 = -1;
					} else {
						if (arg0.anInt4270 < 0) {
							arg0.anInt4270 = 0;
							if (!arg0.aBoolean295) {
								Static593.method8263(0, arg0, local184);
							}
						}
						arg0.anInt4206++;
						if (local184.anIntArray153.length > arg0.anInt4270 && local184.anIntArray150[arg0.anInt4270] < arg0.anInt4206) {
							arg0.anInt4206 = 1;
							arg0.anInt4270++;
							if (!arg0.aBoolean295) {
								Static593.method8263(arg0.anInt4270, arg0, local184);
							}
						}
						if (local184.anIntArray153.length <= arg0.anInt4270) {
							if (local172.aBoolean119) {
								arg0.anInt4270 -= local184.anInt3155;
								arg0.anInt4262++;
								if (arg0.anInt4262 >= local184.anInt3156) {
									arg0.anInt4224 = -1;
								} else if (arg0.anInt4270 < 0 || local184.anIntArray153.length <= arg0.anInt4270) {
									arg0.anInt4224 = -1;
								} else if (!arg0.aBoolean295) {
									Static593.method8263(arg0.anInt4270, arg0, local184);
								}
							} else {
								arg0.anInt4224 = -1;
							}
						}
						arg0.anInt4245 = arg0.anInt4270 + 1;
						if (arg0.anInt4245 >= local184.anIntArray153.length) {
							if (local172.aBoolean119) {
								arg0.anInt4245 -= local184.anInt3155;
								if (arg0.anInt4262 + 1 >= local184.anInt3156) {
									arg0.anInt4245 = -1;
								} else if (arg0.anInt4245 < 0 || local184.anIntArray153.length <= arg0.anInt4245) {
									arg0.anInt4245 = -1;
								}
							} else {
								arg0.anInt4245 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4209 != -1 && arg0.anInt4214 <= 1) {
			local11 = Static17.aClass254_1.method5936(arg0.anInt4209);
			if (local11.anInt3147 == 3) {
				if (arg0.anInt4280 > 0 && arg0.anInt4242 <= Static306.anInt6122 && arg0.anInt4212 < Static306.anInt6122) {
					arg0.anIntArray205 = null;
					arg0.anInt4209 = -1;
				}
			} else if (local11.anInt3147 == 1 && arg0.anInt4280 > 0 && Static306.anInt6122 >= arg0.anInt4242 && Static306.anInt6122 > arg0.anInt4212) {
				arg0.anInt4214 = 2;
			}
		}
		if (arg0.anInt4209 != -1 && arg0.anInt4214 == 0) {
			local11 = Static17.aClass254_1.method5936(arg0.anInt4209);
			if (local11 == null || local11.anIntArray153 == null) {
				arg0.anInt4209 = -1;
				arg0.anIntArray205 = null;
			} else {
				arg0.anInt4252++;
				if (arg0.anInt4272 < local11.anIntArray153.length && arg0.anInt4252 > local11.anIntArray150[arg0.anInt4272]) {
					arg0.anInt4272++;
					arg0.anInt4252 = 1;
					if (!arg0.aBoolean295) {
						Static593.method8263(arg0.anInt4272, arg0, local11);
					}
				}
				if (local11.anIntArray153.length <= arg0.anInt4272) {
					arg0.anInt4197++;
					arg0.anInt4272 -= local11.anInt3155;
					if (local11.anInt3156 <= arg0.anInt4197) {
						arg0.anIntArray205 = null;
						arg0.anInt4209 = -1;
					} else if (arg0.anInt4272 < 0 || local11.anIntArray153.length <= arg0.anInt4272) {
						arg0.anInt4209 = -1;
						arg0.anIntArray205 = null;
					} else if (!arg0.aBoolean295) {
						Static593.method8263(arg0.anInt4272, arg0, local11);
					}
				}
				arg0.anInt4257 = arg0.anInt4272 + 1;
				if (arg0.anInt4257 >= local11.anIntArray153.length) {
					arg0.anInt4257 -= local11.anInt3155;
					if (arg0.anInt4197 + 1 >= local11.anInt3156) {
						arg0.anInt4257 = -1;
					} else if (arg0.anInt4257 < 0 || local11.anIntArray153.length <= arg0.anInt4257) {
						arg0.anInt4257 = -1;
					}
				}
			}
		}
		if (arg0.anInt4214 > 0) {
			arg0.anInt4214--;
		}
		for (@Pc(986) int local986 = 0; local986 < arg0.aClass237Array3.length; local986++) {
			@Pc(993) Class237 local993 = arg0.aClass237Array3[local986];
			if (local993 != null) {
				if (local993.anInt6860 > 0) {
					local993.anInt6860--;
				} else {
					local184 = Static17.aClass254_1.method5936(local993.anInt6861);
					if (local184 == null || local184.anIntArray153 == null) {
						arg0.aClass237Array3[local986] = null;
					} else {
						local993.anInt6858++;
						if (local993.anInt6862 < local184.anIntArray153.length && local184.anIntArray150[local993.anInt6862] < local993.anInt6858) {
							local993.anInt6858 = 1;
							local993.anInt6862++;
							if (!arg0.aBoolean295) {
								Static593.method8263(local993.anInt6862, arg0, local184);
							}
						}
						if (local993.anInt6862 >= local184.anIntArray153.length) {
							local993.anInt6864++;
							local993.anInt6862 -= local184.anInt3155;
							if (local184.anInt3156 <= local993.anInt6864) {
								arg0.aClass237Array3[local986] = null;
							} else if (local993.anInt6862 < 0 || local184.anIntArray153.length <= local993.anInt6862) {
								arg0.aClass237Array3[local986] = null;
							} else if (!arg0.aBoolean295) {
								Static593.method8263(local993.anInt6862, arg0, local184);
							}
						}
						local993.anInt6863 = local993.anInt6862 + 1;
						if (local993.anInt6863 >= local184.anIntArray153.length) {
							local993.anInt6863 -= local184.anInt3155;
							if (local993.anInt6864 + 1 >= local184.anInt3156) {
								local993.anInt6863 = -1;
							} else if (local993.anInt6863 < 0 || local993.anInt6863 >= local184.anIntArray153.length) {
								local993.anInt6863 = -1;
							}
						}
					}
				}
			}
		}
	}
}
