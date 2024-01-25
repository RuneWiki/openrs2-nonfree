import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
	public static int anInt2114;

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "[I")
	public static final int[] anIntArray190 = new int[250];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLclient!vg;)V")
	public static void method1775(@OriginalArg(1) Class11_Sub1_Sub1_Sub2 arg0) {
		@Pc(16) Class149 local16;
		if (arg0.anInt3253 != -1) {
			local16 = Static185.aClass303_1.method7201(arg0.anInt3253);
			if (local16 == null || local16.anIntArray308 == null) {
				arg0.aBoolean275 = false;
				arg0.anInt3253 = -1;
			} else {
				label357: {
					arg0.anInt3266++;
					if (arg0.anInt3281 < local16.anIntArray308.length && arg0.anInt3266 > local16.anIntArray306[arg0.anInt3281]) {
						arg0.anInt3266 = 1;
						arg0.anInt3243++;
						arg0.anInt3281++;
						if (!arg0.aBoolean276) {
							Static330.method3630(arg0.anInt3281, local16, arg0);
						}
					}
					if (arg0.anInt3281 >= local16.anIntArray308.length) {
						arg0.anInt3266 = 0;
						arg0.anInt3281 = 0;
						if (arg0.aBoolean275) {
							arg0.anInt3253 = arg0.method2761().method4056();
							if (arg0.anInt3253 == -1) {
								arg0.aBoolean275 = false;
								break label357;
							}
							local16 = Static185.aClass303_1.method7201(arg0.anInt3253);
						}
						if (!arg0.aBoolean276) {
							Static330.method3630(arg0.anInt3281, local16, arg0);
						}
					}
					arg0.anInt3243 = arg0.anInt3281 + 1;
					if (local16.anIntArray308 == null) {
						arg0.aBoolean275 = false;
						arg0.anInt3253 = -1;
					} else if (arg0.anInt3243 >= local16.anIntArray308.length) {
						arg0.anInt3243 = 0;
					}
				}
			}
		}
		@Pc(168) int local168;
		@Pc(181) Class149 local181;
		@Pc(165) Class69 local165;
		if (arg0.anInt3270 != -1 && arg0.anInt3273 <= Static325.anInt5888) {
			local165 = Static414.aClass356_2.method8213(arg0.anInt3270);
			local168 = local165.anInt1820;
			if (local168 == -1) {
				arg0.anInt3270 = -1;
			} else {
				label358: {
					local181 = Static185.aClass303_1.method7201(local168);
					if (local165.aBoolean152) {
						if (local181.anInt4510 == 3) {
							if (arg0.anInt3294 > 0 && arg0.anInt3220 <= Static325.anInt5888 && Static325.anInt5888 > arg0.anInt3274) {
								arg0.anInt3270 = -1;
								break label358;
							}
						} else if (local181.anInt4510 == 1 && arg0.anInt3294 > 0 && arg0.anInt3220 <= Static325.anInt5888 && Static325.anInt5888 > arg0.anInt3274) {
							arg0.anInt3273 = Static325.anInt5888 + 1;
							break label358;
						}
					}
					if (local181 == null || local181.anIntArray308 == null) {
						arg0.anInt3270 = -1;
					} else {
						if (arg0.anInt3214 < 0) {
							arg0.anInt3214 = 0;
							if (!arg0.aBoolean276) {
								Static330.method3630(0, local181, arg0);
							}
						}
						arg0.anInt3227++;
						if (arg0.anInt3214 < local181.anIntArray308.length && local181.anIntArray306[arg0.anInt3214] < arg0.anInt3227) {
							arg0.anInt3227 = 1;
							arg0.anInt3214++;
							if (!arg0.aBoolean276) {
								Static330.method3630(arg0.anInt3214, local181, arg0);
							}
						}
						if (local181.anIntArray308.length <= arg0.anInt3214) {
							if (local165.aBoolean152) {
								arg0.anInt3259++;
								arg0.anInt3214 -= local181.anInt4505;
								if (arg0.anInt3259 >= local181.anInt4506) {
									arg0.anInt3270 = -1;
								} else if (arg0.anInt3214 < 0 || local181.anIntArray308.length <= arg0.anInt3214) {
									arg0.anInt3270 = -1;
								} else if (!arg0.aBoolean276) {
									Static330.method3630(arg0.anInt3214, local181, arg0);
								}
							} else {
								arg0.anInt3270 = -1;
							}
						}
						arg0.anInt3254 = arg0.anInt3214 + 1;
						if (local181.anIntArray308.length <= arg0.anInt3254) {
							if (local165.aBoolean152) {
								arg0.anInt3254 -= local181.anInt4505;
								if (local181.anInt4506 <= arg0.anInt3259 + 1) {
									arg0.anInt3254 = -1;
								} else if (arg0.anInt3254 < 0 || local181.anIntArray308.length <= arg0.anInt3254) {
									arg0.anInt3254 = -1;
								}
							} else {
								arg0.anInt3254 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt3229 != -1 && Static325.anInt5888 >= arg0.anInt3221) {
			local165 = Static414.aClass356_2.method8213(arg0.anInt3229);
			local168 = local165.anInt1820;
			if (local168 == -1) {
				arg0.anInt3229 = -1;
			} else {
				label361: {
					local181 = Static185.aClass303_1.method7201(local168);
					if (local165.aBoolean152) {
						if (local181.anInt4510 == 3) {
							if (arg0.anInt3294 > 0 && arg0.anInt3220 <= Static325.anInt5888 && arg0.anInt3274 < Static325.anInt5888) {
								arg0.anInt3229 = -1;
								break label361;
							}
						} else if (local181.anInt4510 == 1 && arg0.anInt3294 > 0 && arg0.anInt3220 <= Static325.anInt5888 && Static325.anInt5888 > arg0.anInt3274) {
							arg0.anInt3221 = Static325.anInt5888 + 1;
							break label361;
						}
					}
					if (local181 == null || local181.anIntArray308 == null) {
						arg0.anInt3229 = -1;
					} else {
						if (arg0.anInt3208 < 0) {
							arg0.anInt3208 = 0;
							if (!arg0.aBoolean276) {
								Static330.method3630(0, local181, arg0);
							}
						}
						arg0.anInt3210++;
						if (local181.anIntArray308.length > arg0.anInt3208 && arg0.anInt3210 > local181.anIntArray306[arg0.anInt3208]) {
							arg0.anInt3210 = 1;
							arg0.anInt3208++;
							if (!arg0.aBoolean276) {
								Static330.method3630(arg0.anInt3208, local181, arg0);
							}
						}
						if (arg0.anInt3208 >= local181.anIntArray308.length) {
							if (local165.aBoolean152) {
								arg0.anInt3269++;
								arg0.anInt3208 -= local181.anInt4505;
								if (arg0.anInt3269 >= local181.anInt4506) {
									arg0.anInt3229 = -1;
								} else if (arg0.anInt3208 < 0 || local181.anIntArray308.length <= arg0.anInt3208) {
									arg0.anInt3229 = -1;
								} else if (!arg0.aBoolean276) {
									Static330.method3630(arg0.anInt3208, local181, arg0);
								}
							} else {
								arg0.anInt3229 = -1;
							}
						}
						arg0.anInt3231 = arg0.anInt3208 + 1;
						if (arg0.anInt3231 >= local181.anIntArray308.length) {
							if (local165.aBoolean152) {
								arg0.anInt3231 -= local181.anInt4505;
								if (arg0.anInt3269 + 1 >= local181.anInt4506) {
									arg0.anInt3231 = -1;
								} else if (arg0.anInt3231 < 0 || local181.anIntArray308.length <= arg0.anInt3231) {
									arg0.anInt3231 = -1;
								}
							} else {
								arg0.anInt3231 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt3258 != -1 && arg0.anInt3232 <= 1) {
			local16 = Static185.aClass303_1.method7201(arg0.anInt3258);
			if (local16.anInt4510 == 3) {
				if (arg0.anInt3294 > 0 && Static325.anInt5888 >= arg0.anInt3220 && arg0.anInt3274 < Static325.anInt5888) {
					arg0.anInt3258 = -1;
					arg0.anIntArray226 = null;
				}
			} else if (local16.anInt4510 == 1 && arg0.anInt3294 > 0 && arg0.anInt3220 <= Static325.anInt5888 && Static325.anInt5888 > arg0.anInt3274) {
				arg0.anInt3232 = 2;
			}
		}
		if (arg0.anInt3258 != -1 && arg0.anInt3232 == 0) {
			local16 = Static185.aClass303_1.method7201(arg0.anInt3258);
			if (local16 == null || local16.anIntArray308 == null) {
				arg0.anInt3258 = -1;
				arg0.anIntArray226 = null;
			} else {
				arg0.anInt3225++;
				if (local16.anIntArray308.length > arg0.anInt3263 && local16.anIntArray306[arg0.anInt3263] < arg0.anInt3225) {
					arg0.anInt3225 = 1;
					arg0.anInt3263++;
					if (!arg0.aBoolean276) {
						Static330.method3630(arg0.anInt3263, local16, arg0);
					}
				}
				if (arg0.anInt3263 >= local16.anIntArray308.length) {
					arg0.anInt3257++;
					arg0.anInt3263 -= local16.anInt4505;
					if (arg0.anInt3257 >= local16.anInt4506) {
						arg0.anInt3258 = -1;
						arg0.anIntArray226 = null;
					} else if (arg0.anInt3263 < 0 || local16.anIntArray308.length <= arg0.anInt3263) {
						arg0.anInt3258 = -1;
						arg0.anIntArray226 = null;
					} else if (!arg0.aBoolean276) {
						Static330.method3630(arg0.anInt3263, local16, arg0);
					}
				}
				arg0.anInt3235 = arg0.anInt3263 + 1;
				if (arg0.anInt3235 >= local16.anIntArray308.length) {
					arg0.anInt3235 -= local16.anInt4505;
					if (local16.anInt4506 <= arg0.anInt3257 + 1) {
						arg0.anInt3235 = -1;
					} else if (arg0.anInt3235 < 0 || arg0.anInt3235 >= local16.anIntArray308.length) {
						arg0.anInt3235 = -1;
					}
				}
			}
		}
		if (arg0.anInt3232 > 0) {
			arg0.anInt3232--;
		}
		for (@Pc(1008) int local1008 = 0; local1008 < arg0.aClass203Array3.length; local1008++) {
			@Pc(1015) Class203 local1015 = arg0.aClass203Array3[local1008];
			if (local1015 != null) {
				if (local1015.anInt5797 > 0) {
					local1015.anInt5797--;
				} else {
					local181 = Static185.aClass303_1.method7201(local1015.anInt5798);
					if (local181 == null || local181.anIntArray308 == null) {
						arg0.aClass203Array3[local1008] = null;
					} else {
						local1015.anInt5796++;
						if (local1015.anInt5801 < local181.anIntArray308.length && local1015.anInt5796 > local181.anIntArray306[local1015.anInt5801]) {
							local1015.anInt5801++;
							local1015.anInt5796 = 1;
							if (!arg0.aBoolean276) {
								Static330.method3630(local1015.anInt5801, local181, arg0);
							}
						}
						if (local181.anIntArray308.length <= local1015.anInt5801) {
							local1015.anInt5799++;
							local1015.anInt5801 -= local181.anInt4505;
							if (local181.anInt4506 <= local1015.anInt5799) {
								arg0.aClass203Array3[local1008] = null;
							} else if (local1015.anInt5801 < 0 || local1015.anInt5801 >= local181.anIntArray308.length) {
								arg0.aClass203Array3[local1008] = null;
							} else if (!arg0.aBoolean276) {
								Static330.method3630(local1015.anInt5801, local181, arg0);
							}
						}
						local1015.anInt5805 = local1015.anInt5801 + 1;
						if (local1015.anInt5805 >= local181.anIntArray308.length) {
							local1015.anInt5805 -= local181.anInt4505;
							if (local181.anInt4506 <= local1015.anInt5799 + 1) {
								local1015.anInt5805 = -1;
							} else if (local1015.anInt5805 < 0 || local1015.anInt5805 >= local181.anIntArray308.length) {
								local1015.anInt5805 = -1;
							}
						}
					}
				}
			}
		}
	}
}
