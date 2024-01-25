import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	public static int anInt5357 = 0;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "Lclient!gn;")
	public static final Class94 aClass94_23 = new Class94(6, 2);

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
	public static int method4286(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(37) int local37 = (arg0 & 0x7F) * 96 >> 7;
			if (local37 < 2) {
				local37 = 2;
			} else if (local37 > 126) {
				local37 = 126;
			}
			return local37 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIII)I")
	public static int method4289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(11) int local11 = arg3;
			arg3 = arg0;
			arg0 = local11;
		}
		@Pc(23) int local23 = arg1 & 0x3;
		if (local23 == 0) {
			return arg2;
		} else if (local23 == 1) {
			return 1 + 7 - arg3 - arg5;
		} else if (local23 == 2) {
			return 1 + 7 - arg0 - arg2;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!kh;)V")
	public static void method4290(@OriginalArg(1) Class26_Sub2_Sub4 arg0) {
		arg0.aBoolean477 = false;
		@Pc(18) Class139 local18;
		if (arg0.anInt7103 != -1) {
			local18 = Static364.aClass151_2.method3293(arg0.anInt7103);
			if (local18 == null || local18.anIntArray344 == null) {
				arg0.aBoolean475 = false;
				arg0.anInt7103 = -1;
			} else {
				label394: {
					arg0.anInt7104++;
					if (arg0.lb < local18.anIntArray344.length && local18.anIntArray345[arg0.lb] < arg0.anInt7104) {
						arg0.lb++;
						arg0.anInt7055++;
						arg0.anInt7104 = 1;
						Static454.method5772(local18, Static104.aClass26_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, arg0.lb);
					}
					if (arg0.lb >= local18.anIntArray344.length) {
						arg0.anInt7104 = 0;
						arg0.lb = 0;
						if (arg0.aBoolean475) {
							arg0.anInt7103 = arg0.method5507().method1925();
							if (arg0.anInt7103 == -1) {
								arg0.aBoolean475 = false;
								break label394;
							}
							local18 = Static364.aClass151_2.method3293(arg0.anInt7103);
						}
						Static454.method5772(local18, Static104.aClass26_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, arg0.lb);
					}
					arg0.anInt7055 = arg0.lb + 1;
					if (local18.anIntArray344.length <= arg0.anInt7055) {
						arg0.anInt7055 = 0;
					}
				}
			}
		}
		@Pc(177) int local177;
		@Pc(190) Class139 local190;
		@Pc(174) Class105 local174;
		if (arg0.anInt7066 != -1 && Static274.anInt4617 >= arg0.anInt7095) {
			local174 = Static79.aClass231_1.method4830(arg0.anInt7066);
			local177 = local174.anInt2900;
			if (local177 == -1) {
				arg0.anInt7066 = -1;
			} else {
				label396: {
					local190 = Static364.aClass151_2.method3293(local177);
					if (local174.aBoolean176) {
						if (local190.anInt3952 == 3) {
							if (arg0.anInt7116 > 0 && arg0.anInt7112 <= Static274.anInt4617 && Static274.anInt4617 > arg0.anInt7110) {
								arg0.anInt7066 = -1;
								break label396;
							}
						} else if (local190.anInt3952 == 1 && arg0.anInt7116 > 0 && arg0.anInt7112 <= Static274.anInt4617 && Static274.anInt4617 > arg0.anInt7110) {
							arg0.anInt7095 = Static274.anInt4617 + 1;
							break label396;
						}
					}
					if (local190 == null || local190.anIntArray344 == null) {
						arg0.anInt7066 = -1;
					} else {
						if (arg0.anInt7099 < 0) {
							arg0.anInt7099 = 0;
							Static454.method5772(local190, arg0 == Static104.aClass26_Sub2_Sub4_Sub2_2, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, 0);
						}
						arg0.anInt7042++;
						if (arg0.anInt7099 < local190.anIntArray344.length && arg0.anInt7042 > local190.anIntArray345[arg0.anInt7099]) {
							arg0.anInt7042 = 1;
							arg0.anInt7099++;
							Static454.method5772(local190, Static104.aClass26_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, arg0.anInt7099);
						}
						if (local190.anIntArray344.length <= arg0.anInt7099) {
							if (local174.aBoolean176) {
								arg0.anInt7099 -= local190.anInt3945;
								arg0.anInt7109++;
								if (arg0.anInt7109 >= local190.anInt3938) {
									arg0.anInt7066 = -1;
								} else if (arg0.anInt7099 >= 0 && arg0.anInt7099 < local190.anIntArray344.length) {
									Static454.method5772(local190, arg0 == Static104.aClass26_Sub2_Sub4_Sub2_2, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, arg0.anInt7099);
								} else {
									arg0.anInt7066 = -1;
								}
							} else {
								arg0.anInt7066 = -1;
							}
						}
						arg0.anInt7056 = arg0.anInt7099 + 1;
						if (arg0.anInt7056 >= local190.anIntArray344.length) {
							if (local174.aBoolean176) {
								arg0.anInt7056 -= local190.anInt3945;
								if (local190.anInt3938 <= arg0.anInt7109 + 1) {
									arg0.anInt7056 = -1;
								} else if (arg0.anInt7056 < 0 || local190.anIntArray344.length <= arg0.anInt7056) {
									arg0.anInt7056 = -1;
								}
							} else {
								arg0.anInt7056 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7065 != -1 && arg0.anInt7052 <= Static274.anInt4617) {
			local174 = Static79.aClass231_1.method4830(arg0.anInt7065);
			local177 = local174.anInt2900;
			if (local177 == -1) {
				arg0.anInt7065 = -1;
			} else {
				label400: {
					local190 = Static364.aClass151_2.method3293(local177);
					if (local174.aBoolean176) {
						if (local190.anInt3952 == 3) {
							if (arg0.anInt7116 > 0 && arg0.anInt7112 <= Static274.anInt4617 && arg0.anInt7110 < Static274.anInt4617) {
								arg0.anInt7065 = -1;
								break label400;
							}
						} else if (local190.anInt3952 == 1 && arg0.anInt7116 > 0 && Static274.anInt4617 >= arg0.anInt7112 && arg0.anInt7110 < Static274.anInt4617) {
							arg0.anInt7052 = Static274.anInt4617 + 1;
							break label400;
						}
					}
					if (local190 == null || local190.anIntArray344 == null) {
						arg0.anInt7065 = -1;
					} else {
						if (arg0.anInt7037 < 0) {
							arg0.anInt7037 = 0;
							Static454.method5772(local190, arg0 == Static104.aClass26_Sub2_Sub4_Sub2_2, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, 0);
						}
						arg0.anInt7041++;
						if (local190.anIntArray344.length > arg0.anInt7037 && arg0.anInt7041 > local190.anIntArray345[arg0.anInt7037]) {
							arg0.anInt7037++;
							arg0.anInt7041 = 1;
							Static454.method5772(local190, Static104.aClass26_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, arg0.anInt7037);
						}
						if (local190.anIntArray344.length <= arg0.anInt7037) {
							if (local174.aBoolean176) {
								arg0.anInt7057++;
								arg0.anInt7037 -= local190.anInt3945;
								if (local190.anInt3938 <= arg0.anInt7057) {
									arg0.anInt7065 = -1;
								} else if (arg0.anInt7037 >= 0 && arg0.anInt7037 < local190.anIntArray344.length) {
									Static454.method5772(local190, arg0 == Static104.aClass26_Sub2_Sub4_Sub2_2, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, arg0.anInt7037);
								} else {
									arg0.anInt7065 = -1;
								}
							} else {
								arg0.anInt7065 = -1;
							}
						}
						arg0.anInt7073 = arg0.anInt7037 + 1;
						if (local190.anIntArray344.length <= arg0.anInt7073) {
							if (local174.aBoolean176) {
								arg0.anInt7073 -= local190.anInt3945;
								if (arg0.anInt7057 + 1 >= local190.anInt3938) {
									arg0.anInt7073 = -1;
								} else if (arg0.anInt7073 < 0 || arg0.anInt7073 >= local190.anIntArray344.length) {
									arg0.anInt7073 = -1;
								}
							} else {
								arg0.anInt7073 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7046 != -1 && arg0.anInt7069 <= 1) {
			local18 = Static364.aClass151_2.method3293(arg0.anInt7046);
			if (local18.anInt3952 == 3) {
				if (arg0.anInt7116 > 0 && arg0.anInt7112 <= Static274.anInt4617 && Static274.anInt4617 > arg0.anInt7110) {
					arg0.anInt7046 = -1;
				}
			} else if (local18.anInt3952 == 1 && arg0.anInt7116 > 0 && Static274.anInt4617 >= arg0.anInt7112 && arg0.anInt7110 < Static274.anInt4617) {
				arg0.anInt7069 = 2;
			}
		}
		if (arg0.anInt7046 != -1 && arg0.anInt7069 == 0) {
			local18 = Static364.aClass151_2.method3293(arg0.anInt7046);
			if (local18 == null || local18.anIntArray344 == null) {
				arg0.anInt7046 = -1;
			} else {
				arg0.anInt7050++;
				if (arg0.anInt7061 < local18.anIntArray344.length && arg0.anInt7050 > local18.anIntArray345[arg0.anInt7061]) {
					arg0.anInt7061++;
					arg0.anInt7050 = 1;
					Static454.method5772(local18, arg0 == Static104.aClass26_Sub2_Sub4_Sub2_2, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, arg0.anInt7061);
				}
				if (local18.anIntArray344.length <= arg0.anInt7061) {
					arg0.anInt7061 -= local18.anInt3945;
					arg0.anInt7074++;
					if (arg0.anInt7074 >= local18.anInt3938) {
						arg0.anInt7046 = -1;
					} else if (arg0.anInt7061 >= 0 && local18.anIntArray344.length > arg0.anInt7061) {
						Static454.method5772(local18, Static104.aClass26_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, arg0.anInt7061);
					} else {
						arg0.anInt7046 = -1;
					}
				}
				arg0.anInt7076 = arg0.anInt7061 + 1;
				if (local18.anIntArray344.length <= arg0.anInt7076) {
					arg0.anInt7076 -= local18.anInt3945;
					if (arg0.anInt7074 + 1 >= local18.anInt3938) {
						arg0.anInt7076 = -1;
					} else if (arg0.anInt7076 < 0 || arg0.anInt7076 >= local18.anIntArray344.length) {
						arg0.anInt7076 = -1;
					}
				}
				arg0.aBoolean477 = local18.aBoolean241;
			}
		}
		if (arg0.anInt7069 > 0) {
			arg0.anInt7069--;
		}
		for (@Pc(1052) int local1052 = 0; local1052 < arg0.aClass69Array3.length; local1052++) {
			@Pc(1059) Class69 local1059 = arg0.aClass69Array3[local1052];
			if (local1059 != null) {
				if (local1059.anInt1931 > 0) {
					local1059.anInt1931--;
				} else {
					local190 = Static364.aClass151_2.method3293(local1059.anInt1933);
					if (local190 == null || local190.anIntArray344 == null) {
						arg0.aClass69Array3[local1052] = null;
					} else {
						local1059.anInt1928++;
						if (local1059.anInt1927 < local190.anIntArray344.length && local1059.anInt1928 > local190.anIntArray345[local1059.anInt1927]) {
							local1059.anInt1927++;
							local1059.anInt1928 = 1;
							Static454.method5772(local190, arg0 == Static104.aClass26_Sub2_Sub4_Sub2_2, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, local1059.anInt1927);
						}
						if (local1059.anInt1927 >= local190.anIntArray344.length) {
							local1059.anInt1932++;
							local1059.anInt1927 -= local190.anInt3945;
							if (local1059.anInt1932 >= local190.anInt3938) {
								arg0.aClass69Array3[local1052] = null;
							} else if (local1059.anInt1927 >= 0 && local190.anIntArray344.length > local1059.anInt1927) {
								Static454.method5772(local190, Static104.aClass26_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, local1059.anInt1927);
							} else {
								arg0.aClass69Array3[local1052] = null;
							}
						}
						local1059.anInt1929 = local1059.anInt1927 + 1;
						if (local1059.anInt1929 >= local190.anIntArray344.length) {
							local1059.anInt1929 -= local190.anInt3945;
							if (local190.anInt3938 <= local1059.anInt1932 + 1) {
								local1059.anInt1929 = -1;
							} else if (local1059.anInt1929 < 0 || local190.anIntArray344.length <= local1059.anInt1929) {
								local1059.anInt1929 = -1;
							}
						}
					}
				}
			}
		}
	}
}
