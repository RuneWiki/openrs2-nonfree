import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_66 = new Class200(97, 0);

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_67 = new Class200(111, 3);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[ILclient!lga;)Lclient!lq;")
	public static Class215 method2761(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class212 arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg2.aByteArray51 != null) {
			@Pc(24) int local24 = arg2.anInt5663;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(30) int[] local30 = new int[local24];
			@Pc(33) int[] local33 = new int[local24];
			@Pc(36) int[] local36 = new int[local24];
			@Pc(39) int[] local39 = new int[local24];
			@Pc(42) int[] local42 = new int[local24];
			for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
				local27[local44] = Integer.MAX_VALUE;
				local30[local44] = -2147483647;
				local33[local44] = Integer.MAX_VALUE;
				local36[local44] = -2147483647;
				local39[local44] = Integer.MAX_VALUE;
				local42[local44] = -2147483647;
			}
			local7 = new int[local24];
			local9 = new int[local24];
			local18 = new float[local24][];
			local16 = new int[local24];
			@Pc(98) int local98;
			@Pc(151) int local151;
			for (@Pc(92) int local92 = 0; local92 < arg0; local92++) {
				local98 = arg1[local92];
				if (arg2.aByteArray51[local98] != -1) {
					@Pc(111) int local111 = arg2.aByteArray51[local98] & 0xFF;
					for (@Pc(113) int local113 = 0; local113 < 3; local113++) {
						@Pc(122) short local122;
						if (local113 == 0) {
							local122 = arg2.aShortArray63[local98];
						} else if (local113 == 1) {
							local122 = arg2.aShortArray69[local98];
						} else {
							local122 = arg2.aShortArray65[local98];
						}
						@Pc(146) int local146 = arg2.anIntArray355[local122];
						local151 = arg2.anIntArray360[local122];
						@Pc(156) int local156 = arg2.anIntArray353[local122];
						if (local27[local111] > local146) {
							local27[local111] = local146;
						}
						if (local146 > local30[local111]) {
							local30[local111] = local146;
						}
						if (local151 < local33[local111]) {
							local33[local111] = local151;
						}
						if (local36[local111] < local151) {
							local36[local111] = local151;
						}
						if (local156 < local39[local111]) {
							local39[local111] = local156;
						}
						if (local156 > local42[local111]) {
							local42[local111] = local156;
						}
					}
				}
			}
			for (local98 = 0; local98 < local24; local98++) {
				@Pc(231) byte local231 = arg2.aByteArray49[local98];
				if (local231 > 0) {
					local7[local98] = (local27[local98] + local30[local98]) / 2;
					local9[local98] = (local33[local98] + local36[local98]) / 2;
					local16[local98] = (local39[local98] + local42[local98]) / 2;
					@Pc(296) float local296;
					@Pc(289) float local289;
					@Pc(298) float local298;
					if (local231 == 1) {
						local151 = arg2.anIntArray359[local98];
						local289 = 64.0F / (float) arg2.anIntArray363[local98];
						if (local151 == 0) {
							local296 = 1.0F;
							local298 = 1.0F;
						} else if (local151 <= 0) {
							local298 = 1.0F;
							local296 = (float) -local151 / 1024.0F;
						} else {
							local296 = 1.0F;
							local298 = (float) local151 / 1024.0F;
						}
					} else if (local231 == 2) {
						local289 = 64.0F / (float) arg2.anIntArray363[local98];
						local298 = 64.0F / (float) arg2.anIntArray356[local98];
						local296 = 64.0F / (float) arg2.anIntArray359[local98];
					} else {
						local289 = (float) arg2.anIntArray363[local98] / 1024.0F;
						local296 = (float) arg2.anIntArray359[local98] / 1024.0F;
						local298 = (float) arg2.anIntArray356[local98] / 1024.0F;
					}
					local18[local98] = Static12.method151(local298, local289, arg2.aShortArray70[local98], arg2.aShortArray62[local98], arg2.aShortArray67[local98], local296, arg2.aByteArray47[local98] & 0xFF);
				}
			}
		}
		return new Class215(local7, local9, local16, local18);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!ha;Lclient!ria;)V")
	public static void method2763(@OriginalArg(1) Class13 arg0, @OriginalArg(2) Class303 arg1) {
		@Pc(38) boolean local38 = Static470.aClass250_1.method5963(arg1.anInt7964, arg0, arg1.aBoolean573 ? Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 : null, arg1.anInt7927, arg1.anInt8000 | 0xFF000000, arg1.anInt7922, arg1.anInt7932) == null;
		if (local38) {
			Static119.aClass114_13.method2771(new Class2_Sub34(arg1.anInt7964, arg1.anInt7927, arg1.anInt7932, arg1.anInt8000 | 0xFF000000, arg1.anInt7922, arg1.aBoolean573));
			Static514.method7103(arg1);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!vl;I)V")
	public static void method2769(@OriginalArg(0) Class16_Sub1_Sub1_Sub3 arg0) {
		@Pc(14) Class228 local14;
		if (arg0.anInt8095 != -1) {
			local14 = Static479.aClass308_2.method7075(arg0.anInt8095);
			if (local14 == null || local14.anIntArray403 == null) {
				arg0.anInt8095 = -1;
				arg0.aBoolean588 = false;
			} else {
				label357: {
					arg0.anInt8096++;
					if (arg0.anInt8059 < local14.anIntArray403.length && arg0.anInt8096 > local14.anIntArray404[arg0.anInt8059]) {
						arg0.anInt8059++;
						arg0.anInt8128++;
						arg0.anInt8096 = 1;
						if (!arg0.aBoolean587) {
							Static145.method2602(arg0.anInt8059, arg0, local14);
						}
					}
					if (local14.anIntArray403.length <= arg0.anInt8059) {
						arg0.anInt8059 = 0;
						arg0.anInt8096 = 0;
						if (arg0.aBoolean588) {
							arg0.anInt8095 = arg0.method7007().method6682();
							if (arg0.anInt8095 == -1) {
								arg0.aBoolean588 = false;
								break label357;
							}
							local14 = Static479.aClass308_2.method7075(arg0.anInt8095);
						}
						if (!arg0.aBoolean587) {
							Static145.method2602(arg0.anInt8059, arg0, local14);
						}
					}
					arg0.anInt8128 = arg0.anInt8059 + 1;
					if (local14.anIntArray403 == null) {
						arg0.anInt8095 = -1;
						arg0.aBoolean588 = false;
					} else if (arg0.anInt8128 >= local14.anIntArray403.length) {
						arg0.anInt8128 = 0;
					}
				}
			}
		}
		@Pc(166) int local166;
		@Pc(178) Class228 local178;
		@Pc(163) Class354 local163;
		if (arg0.anInt8053 != -1 && arg0.anInt8108 <= Static389.anInt6694) {
			local163 = Static546.aClass263_1.method6113(arg0.anInt8053);
			local166 = local163.anInt9829;
			if (local166 == -1) {
				arg0.anInt8053 = -1;
			} else {
				label358: {
					local178 = Static479.aClass308_2.method7075(local166);
					if (local163.aBoolean712) {
						if (local178.anInt6222 == 3) {
							if (arg0.anInt8135 > 0 && arg0.anInt8117 <= Static389.anInt6694 && Static389.anInt6694 > arg0.anInt8064) {
								arg0.anInt8053 = -1;
								break label358;
							}
						} else if (local178.anInt6222 == 1 && arg0.anInt8135 > 0 && arg0.anInt8117 <= Static389.anInt6694 && arg0.anInt8064 < Static389.anInt6694) {
							arg0.anInt8108 = Static389.anInt6694 + 1;
							break label358;
						}
					}
					if (local178 == null || local178.anIntArray403 == null) {
						arg0.anInt8053 = -1;
					} else {
						if (arg0.anInt8099 < 0) {
							arg0.anInt8099 = 0;
							if (!arg0.aBoolean587) {
								Static145.method2602(0, arg0, local178);
							}
						}
						arg0.anInt8132++;
						if (local178.anIntArray403.length > arg0.anInt8099 && local178.anIntArray404[arg0.anInt8099] < arg0.anInt8132) {
							arg0.anInt8132 = 1;
							arg0.anInt8099++;
							if (!arg0.aBoolean587) {
								Static145.method2602(arg0.anInt8099, arg0, local178);
							}
						}
						if (local178.anIntArray403.length <= arg0.anInt8099) {
							if (local163.aBoolean712) {
								arg0.anInt8099 -= local178.anInt6231;
								arg0.anInt8113++;
								if (local178.anInt6226 <= arg0.anInt8113) {
									arg0.anInt8053 = -1;
								} else if (arg0.anInt8099 < 0 || arg0.anInt8099 >= local178.anIntArray403.length) {
									arg0.anInt8053 = -1;
								} else if (!arg0.aBoolean587) {
									Static145.method2602(arg0.anInt8099, arg0, local178);
								}
							} else {
								arg0.anInt8053 = -1;
							}
						}
						arg0.anInt8066 = arg0.anInt8099 + 1;
						if (local178.anIntArray403.length <= arg0.anInt8066) {
							if (local163.aBoolean712) {
								arg0.anInt8066 -= local178.anInt6231;
								if (arg0.anInt8113 + 1 >= local178.anInt6226) {
									arg0.anInt8066 = -1;
								} else if (arg0.anInt8066 < 0 || arg0.anInt8066 >= local178.anIntArray403.length) {
									arg0.anInt8066 = -1;
								}
							} else {
								arg0.anInt8066 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8084 != -1 && Static389.anInt6694 >= arg0.anInt8088) {
			local163 = Static546.aClass263_1.method6113(arg0.anInt8084);
			local166 = local163.anInt9829;
			if (local166 == -1) {
				arg0.anInt8084 = -1;
			} else {
				label361: {
					local178 = Static479.aClass308_2.method7075(local166);
					if (local163.aBoolean712) {
						if (local178.anInt6222 == 3) {
							if (arg0.anInt8135 > 0 && arg0.anInt8117 <= Static389.anInt6694 && arg0.anInt8064 < Static389.anInt6694) {
								arg0.anInt8084 = -1;
								break label361;
							}
						} else if (local178.anInt6222 == 1 && arg0.anInt8135 > 0 && Static389.anInt6694 >= arg0.anInt8117 && Static389.anInt6694 > arg0.anInt8064) {
							arg0.anInt8088 = Static389.anInt6694 + 1;
							break label361;
						}
					}
					if (local178 == null || local178.anIntArray403 == null) {
						arg0.anInt8084 = -1;
					} else {
						if (arg0.anInt8058 < 0) {
							arg0.anInt8058 = 0;
							if (!arg0.aBoolean587) {
								Static145.method2602(0, arg0, local178);
							}
						}
						arg0.anInt8079++;
						if (arg0.anInt8058 < local178.anIntArray403.length && arg0.anInt8079 > local178.anIntArray404[arg0.anInt8058]) {
							arg0.anInt8079 = 1;
							arg0.anInt8058++;
							if (!arg0.aBoolean587) {
								Static145.method2602(arg0.anInt8058, arg0, local178);
							}
						}
						if (local178.anIntArray403.length <= arg0.anInt8058) {
							if (local163.aBoolean712) {
								arg0.anInt8065++;
								arg0.anInt8058 -= local178.anInt6231;
								if (arg0.anInt8065 >= local178.anInt6226) {
									arg0.anInt8084 = -1;
								} else if (arg0.anInt8058 < 0 || local178.anIntArray403.length <= arg0.anInt8058) {
									arg0.anInt8084 = -1;
								} else if (!arg0.aBoolean587) {
									Static145.method2602(arg0.anInt8058, arg0, local178);
								}
							} else {
								arg0.anInt8084 = -1;
							}
						}
						arg0.anInt8129 = arg0.anInt8058 + 1;
						if (arg0.anInt8129 >= local178.anIntArray403.length) {
							if (local163.aBoolean712) {
								arg0.anInt8129 -= local178.anInt6231;
								if (local178.anInt6226 <= arg0.anInt8065 + 1) {
									arg0.anInt8129 = -1;
								} else if (arg0.anInt8129 < 0 || local178.anIntArray403.length <= arg0.anInt8129) {
									arg0.anInt8129 = -1;
								}
							} else {
								arg0.anInt8129 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8049 != -1 && arg0.lb <= 1) {
			local14 = Static479.aClass308_2.method7075(arg0.anInt8049);
			if (local14.anInt6222 == 3) {
				if (arg0.anInt8135 > 0 && Static389.anInt6694 >= arg0.anInt8117 && arg0.anInt8064 < Static389.anInt6694) {
					arg0.anInt8049 = -1;
					arg0.anIntArray586 = null;
				}
			} else if (local14.anInt6222 == 1 && arg0.anInt8135 > 0 && Static389.anInt6694 >= arg0.anInt8117 && arg0.anInt8064 < Static389.anInt6694) {
				arg0.lb = 2;
			}
		}
		if (arg0.anInt8049 != -1 && arg0.lb == 0) {
			local14 = Static479.aClass308_2.method7075(arg0.anInt8049);
			if (local14 == null || local14.anIntArray403 == null) {
				arg0.anIntArray586 = null;
				arg0.anInt8049 = -1;
			} else {
				arg0.anInt8087++;
				if (arg0.anInt8083 < local14.anIntArray403.length && arg0.anInt8087 > local14.anIntArray404[arg0.anInt8083]) {
					arg0.anInt8083++;
					arg0.anInt8087 = 1;
					if (!arg0.aBoolean587) {
						Static145.method2602(arg0.anInt8083, arg0, local14);
					}
				}
				if (local14.anIntArray403.length <= arg0.anInt8083) {
					arg0.anInt8083 -= local14.anInt6231;
					arg0.anInt8060++;
					if (local14.anInt6226 <= arg0.anInt8060) {
						arg0.anIntArray586 = null;
						arg0.anInt8049 = -1;
					} else if (arg0.anInt8083 < 0 || arg0.anInt8083 >= local14.anIntArray403.length) {
						arg0.anInt8049 = -1;
						arg0.anIntArray586 = null;
					} else if (!arg0.aBoolean587) {
						Static145.method2602(arg0.anInt8083, arg0, local14);
					}
				}
				arg0.anInt8121 = arg0.anInt8083 + 1;
				if (local14.anIntArray403.length <= arg0.anInt8121) {
					arg0.anInt8121 -= local14.anInt6231;
					if (local14.anInt6226 <= arg0.anInt8060 + 1) {
						arg0.anInt8121 = -1;
					} else if (arg0.anInt8121 < 0 || arg0.anInt8121 >= local14.anIntArray403.length) {
						arg0.anInt8121 = -1;
					}
				}
			}
		}
		if (arg0.lb > 0) {
			arg0.lb--;
		}
		for (@Pc(945) int local945 = 0; local945 < arg0.aClass148Array3.length; local945++) {
			@Pc(951) Class148 local951 = arg0.aClass148Array3[local945];
			if (local951 != null) {
				if (local951.anInt4069 > 0) {
					local951.anInt4069--;
				} else {
					local178 = Static479.aClass308_2.method7075(local951.anInt4066);
					if (local178 == null || local178.anIntArray403 == null) {
						arg0.aClass148Array3[local945] = null;
					} else {
						local951.anInt4067++;
						if (local951.anInt4072 < local178.anIntArray403.length && local951.anInt4067 > local178.anIntArray404[local951.anInt4072]) {
							local951.anInt4067 = 1;
							local951.anInt4072++;
							if (!arg0.aBoolean587) {
								Static145.method2602(local951.anInt4072, arg0, local178);
							}
						}
						if (local951.anInt4072 >= local178.anIntArray403.length) {
							local951.anInt4062++;
							local951.anInt4072 -= local178.anInt6231;
							if (local178.anInt6226 <= local951.anInt4062) {
								arg0.aClass148Array3[local945] = null;
							} else if (local951.anInt4072 < 0 || local951.anInt4072 >= local178.anIntArray403.length) {
								arg0.aClass148Array3[local945] = null;
							} else if (!arg0.aBoolean587) {
								Static145.method2602(local951.anInt4072, arg0, local178);
							}
						}
						local951.anInt4065 = local951.anInt4072 + 1;
						if (local178.anIntArray403.length <= local951.anInt4065) {
							local951.anInt4065 -= local178.anInt6231;
							if (local951.anInt4062 + 1 >= local178.anInt6226) {
								local951.anInt4065 = -1;
							} else if (local951.anInt4065 < 0 || local178.anIntArray403.length <= local951.anInt4065) {
								local951.anInt4065 = -1;
							}
						}
					}
				}
			}
		}
	}
}
