import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!r", name = "b", descriptor = "I")
	public static int anInt5162;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "[I")
	public static final int[] anIntArray468 = new int[13];

	@OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
	public static final int[] anIntArray469 = new int[5];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!as;III[Z)Z")
	public static boolean method4609(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static158.aClass114Array2 != Static341.aClass114Array3) {
			@Pc(11) int local11 = Static18.aClass114Array1[arg1].method3607(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class114 local18 = Static18.aClass114Array1[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method3607(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method3601(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method3602(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!jd;)V")
	public static void method4611(@OriginalArg(1) Class10_Sub3_Sub3 arg0) {
		arg0.aBoolean415 = false;
		@Pc(18) Class79 local18;
		if (arg0.anInt5939 != -1) {
			local18 = Static233.method4080(arg0.anInt5939);
			if (local18 == null || local18.anIntArray217 == null) {
				arg0.anInt5939 = -1;
				arg0.aBoolean414 = false;
			} else {
				label297: {
					arg0.anInt5960++;
					if (arg0.anInt5959 < local18.anIntArray217.length && local18.anIntArray215[arg0.anInt5959] < arg0.anInt5960) {
						arg0.anInt5966++;
						arg0.anInt5960 = 1;
						arg0.anInt5959++;
						Static273.method4631(arg0.anInt5908, arg0.anInt5959, arg0.anInt5910, arg0 == Static173.aClass10_Sub3_Sub3_Sub2_1, local18);
					}
					if (local18.anIntArray217.length <= arg0.anInt5959) {
						arg0.anInt5959 = 0;
						arg0.anInt5960 = 0;
						if (arg0.aBoolean414) {
							arg0.anInt5939 = arg0.method5364().method3508();
							if (arg0.anInt5939 == -1) {
								arg0.aBoolean414 = false;
								break label297;
							}
							local18 = Static233.method4080(arg0.anInt5939);
						}
						Static273.method4631(arg0.anInt5908, arg0.anInt5959, arg0.anInt5910, Static173.aClass10_Sub3_Sub3_Sub2_1 == arg0, local18);
					}
					arg0.anInt5966 = arg0.anInt5959 + 1;
					if (local18.anIntArray217.length <= arg0.anInt5966) {
						arg0.anInt5966 = 0;
					}
				}
			}
		}
		@Pc(187) Class79 local187;
		if (arg0.anInt5957 != -1 && Static153.anInt3257 >= arg0.anInt5969) {
			@Pc(177) Class78 local177 = Static76.method1908(arg0.anInt5957);
			@Pc(180) int local180 = local177.anInt2302;
			if (local180 == -1) {
				arg0.anInt5957 = -1;
			} else {
				label299: {
					local187 = Static233.method4080(local180);
					if (local177.aBoolean161) {
						if (local187.anInt2363 == 3) {
							if (arg0.anInt5988 > 0 && Static153.anInt3257 >= arg0.anInt5928 && Static153.anInt3257 > arg0.anInt5971) {
								arg0.anInt5957 = -1;
								break label299;
							}
						} else if (local187.anInt2363 == 1 && arg0.anInt5988 > 0 && arg0.anInt5928 <= Static153.anInt3257 && Static153.anInt3257 > arg0.anInt5971) {
							arg0.anInt5969 = Static153.anInt3257 + 1;
							break label299;
						}
					}
					if (local187 == null || local187.anIntArray217 == null) {
						arg0.anInt5957 = -1;
					} else {
						if (arg0.anInt5962 < 0) {
							arg0.anInt5962 = 0;
							Static273.method4631(arg0.anInt5908, 0, arg0.anInt5910, arg0 == Static173.aClass10_Sub3_Sub3_Sub2_1, local187);
						}
						arg0.anInt5952++;
						if (local187.anIntArray217.length > arg0.anInt5962 && arg0.anInt5952 > local187.anIntArray215[arg0.anInt5962]) {
							arg0.anInt5962++;
							arg0.anInt5952 = 1;
							Static273.method4631(arg0.anInt5908, arg0.anInt5962, arg0.anInt5910, arg0 == Static173.aClass10_Sub3_Sub3_Sub2_1, local187);
						}
						if (arg0.anInt5962 >= local187.anIntArray217.length) {
							if (local177.aBoolean161) {
								arg0.anInt5962 -= local187.anInt2353;
								arg0.anInt5948++;
								if (arg0.anInt5948 >= local187.anInt2350) {
									arg0.anInt5957 = -1;
								} else if (arg0.anInt5962 >= 0 && local187.anIntArray217.length > arg0.anInt5962) {
									Static273.method4631(arg0.anInt5908, arg0.anInt5962, arg0.anInt5910, Static173.aClass10_Sub3_Sub3_Sub2_1 == arg0, local187);
								} else {
									arg0.anInt5957 = -1;
								}
							} else {
								arg0.anInt5957 = -1;
							}
						}
						arg0.anInt5953 = arg0.anInt5962 + 1;
						if (arg0.anInt5953 >= local187.anIntArray217.length) {
							if (local177.aBoolean161) {
								arg0.anInt5953 -= local187.anInt2353;
								if (local187.anInt2350 <= arg0.anInt5948 + 1) {
									arg0.anInt5953 = -1;
								} else if (arg0.anInt5953 < 0 || local187.anIntArray217.length <= arg0.anInt5953) {
									arg0.anInt5953 = -1;
								}
							} else {
								arg0.anInt5953 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5961 != -1 && arg0.anInt5963 <= 1) {
			local18 = Static233.method4080(arg0.anInt5961);
			if (local18.anInt2363 == 3) {
				if (arg0.anInt5988 > 0 && arg0.anInt5928 <= Static153.anInt3257 && arg0.anInt5971 < Static153.anInt3257) {
					arg0.anInt5961 = -1;
				}
			} else if (local18.anInt2363 == 1 && arg0.anInt5988 > 0 && arg0.anInt5928 <= Static153.anInt3257 && arg0.anInt5971 < Static153.anInt3257) {
				arg0.anInt5963 = 2;
			}
		}
		if (arg0.anInt5961 != -1 && arg0.anInt5963 == 0) {
			local18 = Static233.method4080(arg0.anInt5961);
			if (local18 == null || local18.anIntArray217 == null) {
				arg0.anInt5961 = -1;
			} else {
				arg0.anInt5968++;
				if (arg0.anInt5933 < local18.anIntArray217.length && local18.anIntArray215[arg0.anInt5933] < arg0.anInt5968) {
					arg0.anInt5968 = 1;
					arg0.anInt5933++;
					Static273.method4631(arg0.anInt5908, arg0.anInt5933, arg0.anInt5910, Static173.aClass10_Sub3_Sub3_Sub2_1 == arg0, local18);
				}
				if (local18.anIntArray217.length <= arg0.anInt5933) {
					arg0.anInt5945++;
					arg0.anInt5933 -= local18.anInt2353;
					if (arg0.anInt5945 >= local18.anInt2350) {
						arg0.anInt5961 = -1;
					} else if (arg0.anInt5933 >= 0 && arg0.anInt5933 < local18.anIntArray217.length) {
						Static273.method4631(arg0.anInt5908, arg0.anInt5933, arg0.anInt5910, arg0 == Static173.aClass10_Sub3_Sub3_Sub2_1, local18);
					} else {
						arg0.anInt5961 = -1;
					}
				}
				arg0.anInt5975 = arg0.anInt5933 + 1;
				if (local18.anIntArray217.length <= arg0.anInt5975) {
					arg0.anInt5975 -= local18.anInt2353;
					if (local18.anInt2350 <= arg0.anInt5945 + 1) {
						arg0.anInt5975 = -1;
					} else if (arg0.anInt5975 < 0 || local18.anIntArray217.length <= arg0.anInt5975) {
						arg0.anInt5975 = -1;
					}
				}
				arg0.aBoolean415 = local18.aBoolean165;
			}
		}
		if (arg0.anInt5963 > 0) {
			arg0.anInt5963--;
		}
		for (@Pc(717) int local717 = 0; local717 < arg0.aClass3Array3.length; local717++) {
			@Pc(724) Class3 local724 = arg0.aClass3Array3[local717];
			if (local724 != null) {
				if (local724.anInt95 > 0) {
					local724.anInt95--;
				} else {
					local187 = Static233.method4080(local724.anInt103);
					if (local187 == null || local187.anIntArray217 == null) {
						arg0.aClass3Array3[local717] = null;
					} else {
						local724.anInt98++;
						if (local187.anIntArray217.length > local724.anInt97 && local724.anInt98 > local187.anIntArray215[local724.anInt97]) {
							local724.anInt97++;
							local724.anInt98 = 1;
							Static273.method4631(arg0.anInt5908, local724.anInt97, arg0.anInt5910, Static173.aClass10_Sub3_Sub3_Sub2_1 == arg0, local187);
						}
						if (local724.anInt97 >= local187.anIntArray217.length) {
							local724.anInt101++;
							local724.anInt97 -= local187.anInt2353;
							if (local724.anInt101 >= local187.anInt2350) {
								arg0.aClass3Array3[local717] = null;
							} else if (local724.anInt97 >= 0 && local187.anIntArray217.length > local724.anInt97) {
								Static273.method4631(arg0.anInt5908, local724.anInt97, arg0.anInt5910, Static173.aClass10_Sub3_Sub3_Sub2_1 == arg0, local187);
							} else {
								arg0.aClass3Array3[local717] = null;
							}
						}
						local724.anInt102 = local724.anInt97 + 1;
						if (local187.anIntArray217.length <= local724.anInt102) {
							local724.anInt102 -= local187.anInt2353;
							if (local187.anInt2350 <= local724.anInt101 + 1) {
								local724.anInt102 = -1;
							} else if (local724.anInt102 < 0 || local187.anIntArray217.length <= local724.anInt102) {
								local724.anInt102 = -1;
							}
						}
					}
				}
			}
		}
	}
}
