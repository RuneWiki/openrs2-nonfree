import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
	public static int anInt6744;

	@OriginalMember(owner = "client!mfa", name = "h", descriptor = "F")
	public static float aFloat191;

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
	public static int anInt6740 = 0;

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
	public static int anInt6741 = 0;

	@OriginalMember(owner = "client!mfa", name = "i", descriptor = "Lclient!qia;")
	public static final Class276 aClass276_43 = new Class276();

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILclient!kba;)V")
	public static void method5640(@OriginalArg(1) Class2_Sub3_Sub1_Sub2 arg0) {
		@Pc(17) Class290 local17;
		if (arg0.anInt6273 != -1) {
			local17 = Static618.aClass222_2.method5867(arg0.anInt6273);
			if (local17 == null || local17.anIntArray550 == null) {
				arg0.aBoolean531 = false;
				arg0.anInt6273 = -1;
			} else {
				label357: {
					arg0.anInt6336++;
					if (arg0.anInt6314 < local17.anIntArray550.length && local17.anIntArray548[arg0.anInt6314] < arg0.anInt6336) {
						arg0.anInt6314++;
						arg0.anInt6337++;
						arg0.anInt6336 = 1;
						if (!arg0.aBoolean533) {
							Static349.method5726(arg0.anInt6314, local17, arg0);
						}
					}
					if (arg0.anInt6314 >= local17.anIntArray550.length) {
						arg0.anInt6336 = 0;
						arg0.anInt6314 = 0;
						if (arg0.aBoolean531) {
							arg0.anInt6273 = arg0.method5304().method5991();
							if (arg0.anInt6273 == -1) {
								arg0.aBoolean531 = false;
								break label357;
							}
							local17 = Static618.aClass222_2.method5867(arg0.anInt6273);
						}
						if (!arg0.aBoolean533) {
							Static349.method5726(arg0.anInt6314, local17, arg0);
						}
					}
					arg0.anInt6337 = arg0.anInt6314 + 1;
					if (local17.anIntArray550 == null) {
						arg0.anInt6273 = -1;
						arg0.aBoolean531 = false;
					} else if (arg0.anInt6337 >= local17.anIntArray550.length) {
						arg0.anInt6337 = 0;
					}
				}
			}
		}
		@Pc(181) int local181;
		@Pc(194) Class290 local194;
		@Pc(178) Class268 local178;
		if (arg0.anInt6321 != -1 && arg0.anInt6311 <= Static251.anInt5580) {
			local178 = Static35.aClass343_1.method8033(arg0.anInt6321);
			local181 = local178.anInt8068;
			if (local181 == -1) {
				arg0.anInt6321 = -1;
			} else {
				label358: {
					local194 = Static618.aClass222_2.method5867(local181);
					if (local178.aBoolean688) {
						if (local194.anInt8691 == 3) {
							if (arg0.anInt6346 > 0 && Static251.anInt5580 >= arg0.anInt6278 && Static251.anInt5580 > arg0.anInt6290) {
								arg0.anInt6321 = -1;
								break label358;
							}
						} else if (local194.anInt8691 == 1 && arg0.anInt6346 > 0 && arg0.anInt6278 <= Static251.anInt5580 && arg0.anInt6290 < Static251.anInt5580) {
							arg0.anInt6311 = Static251.anInt5580 + 1;
							break label358;
						}
					}
					if (local194 == null || local194.anIntArray550 == null) {
						arg0.anInt6321 = -1;
					} else {
						if (arg0.anInt6325 < 0) {
							arg0.anInt6325 = 0;
							if (!arg0.aBoolean533) {
								Static349.method5726(0, local194, arg0);
							}
						}
						arg0.anInt6340++;
						if (arg0.anInt6325 < local194.anIntArray550.length && arg0.anInt6340 > local194.anIntArray548[arg0.anInt6325]) {
							arg0.anInt6325++;
							arg0.anInt6340 = 1;
							if (!arg0.aBoolean533) {
								Static349.method5726(arg0.anInt6325, local194, arg0);
							}
						}
						if (local194.anIntArray550.length <= arg0.anInt6325) {
							if (local178.aBoolean688) {
								arg0.anInt6325 -= local194.anInt8684;
								arg0.anInt6322++;
								if (arg0.anInt6322 >= local194.anInt8694) {
									arg0.anInt6321 = -1;
								} else if (arg0.anInt6325 < 0 || arg0.anInt6325 >= local194.anIntArray550.length) {
									arg0.anInt6321 = -1;
								} else if (!arg0.aBoolean533) {
									Static349.method5726(arg0.anInt6325, local194, arg0);
								}
							} else {
								arg0.anInt6321 = -1;
							}
						}
						arg0.anInt6295 = arg0.anInt6325 + 1;
						if (arg0.anInt6295 >= local194.anIntArray550.length) {
							if (local178.aBoolean688) {
								arg0.anInt6295 -= local194.anInt8684;
								if (local194.anInt8694 <= arg0.anInt6322 + 1) {
									arg0.anInt6295 = -1;
								} else if (arg0.anInt6295 < 0 || arg0.anInt6295 >= local194.anIntArray550.length) {
									arg0.anInt6295 = -1;
								}
							} else {
								arg0.anInt6295 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6299 != -1 && arg0.anInt6260 <= Static251.anInt5580) {
			local178 = Static35.aClass343_1.method8033(arg0.anInt6299);
			local181 = local178.anInt8068;
			if (local181 == -1) {
				arg0.anInt6299 = -1;
			} else {
				label361: {
					local194 = Static618.aClass222_2.method5867(local181);
					if (local178.aBoolean688) {
						if (local194.anInt8691 == 3) {
							if (arg0.anInt6346 > 0 && Static251.anInt5580 >= arg0.anInt6278 && Static251.anInt5580 > arg0.anInt6290) {
								arg0.anInt6299 = -1;
								break label361;
							}
						} else if (local194.anInt8691 == 1 && arg0.anInt6346 > 0 && Static251.anInt5580 >= arg0.anInt6278 && arg0.anInt6290 < Static251.anInt5580) {
							arg0.anInt6260 = Static251.anInt5580 + 1;
							break label361;
						}
					}
					if (local194 == null || local194.anIntArray550 == null) {
						arg0.anInt6299 = -1;
					} else {
						if (arg0.anInt6270 < 0) {
							arg0.anInt6270 = 0;
							if (!arg0.aBoolean533) {
								Static349.method5726(0, local194, arg0);
							}
						}
						arg0.anInt6318++;
						if (arg0.anInt6270 < local194.anIntArray550.length && local194.anIntArray548[arg0.anInt6270] < arg0.anInt6318) {
							arg0.anInt6318 = 1;
							arg0.anInt6270++;
							if (!arg0.aBoolean533) {
								Static349.method5726(arg0.anInt6270, local194, arg0);
							}
						}
						if (arg0.anInt6270 >= local194.anIntArray550.length) {
							if (local178.aBoolean688) {
								arg0.anInt6270 -= local194.anInt8684;
								arg0.anInt6317++;
								if (local194.anInt8694 <= arg0.anInt6317) {
									arg0.anInt6299 = -1;
								} else if (arg0.anInt6270 < 0 || local194.anIntArray550.length <= arg0.anInt6270) {
									arg0.anInt6299 = -1;
								} else if (!arg0.aBoolean533) {
									Static349.method5726(arg0.anInt6270, local194, arg0);
								}
							} else {
								arg0.anInt6299 = -1;
							}
						}
						arg0.anInt6277 = arg0.anInt6270 + 1;
						if (arg0.anInt6277 >= local194.anIntArray550.length) {
							if (local178.aBoolean688) {
								arg0.anInt6277 -= local194.anInt8684;
								if (arg0.anInt6317 + 1 >= local194.anInt8694) {
									arg0.anInt6277 = -1;
								} else if (arg0.anInt6277 < 0 || local194.anIntArray550.length <= arg0.anInt6277) {
									arg0.anInt6277 = -1;
								}
							} else {
								arg0.anInt6277 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6306 != -1 && arg0.anInt6297 <= 1) {
			local17 = Static618.aClass222_2.method5867(arg0.anInt6306);
			if (local17.anInt8691 == 3) {
				if (arg0.anInt6346 > 0 && arg0.anInt6278 <= Static251.anInt5580 && Static251.anInt5580 > arg0.anInt6290) {
					arg0.anInt6306 = -1;
					arg0.anIntArray376 = null;
				}
			} else if (local17.anInt8691 == 1 && arg0.anInt6346 > 0 && Static251.anInt5580 >= arg0.anInt6278 && Static251.anInt5580 > arg0.anInt6290) {
				arg0.anInt6297 = 2;
			}
		}
		if (arg0.anInt6306 != -1 && arg0.anInt6297 == 0) {
			local17 = Static618.aClass222_2.method5867(arg0.anInt6306);
			if (local17 == null || local17.anIntArray550 == null) {
				arg0.anInt6306 = -1;
				arg0.anIntArray376 = null;
			} else {
				arg0.anInt6267++;
				if (local17.anIntArray550.length > arg0.anInt6315 && local17.anIntArray548[arg0.anInt6315] < arg0.anInt6267) {
					arg0.anInt6315++;
					arg0.anInt6267 = 1;
					if (!arg0.aBoolean533) {
						Static349.method5726(arg0.anInt6315, local17, arg0);
					}
				}
				if (local17.anIntArray550.length <= arg0.anInt6315) {
					arg0.anInt6283++;
					arg0.anInt6315 -= local17.anInt8684;
					if (local17.anInt8694 <= arg0.anInt6283) {
						arg0.anIntArray376 = null;
						arg0.anInt6306 = -1;
					} else if (arg0.anInt6315 < 0 || arg0.anInt6315 >= local17.anIntArray550.length) {
						arg0.anInt6306 = -1;
						arg0.anIntArray376 = null;
					} else if (!arg0.aBoolean533) {
						Static349.method5726(arg0.anInt6315, local17, arg0);
					}
				}
				arg0.anInt6313 = arg0.anInt6315 + 1;
				if (arg0.anInt6313 >= local17.anIntArray550.length) {
					arg0.anInt6313 -= local17.anInt8684;
					if (local17.anInt8694 <= arg0.anInt6283 + 1) {
						arg0.anInt6313 = -1;
					} else if (arg0.anInt6313 < 0 || arg0.anInt6313 >= local17.anIntArray550.length) {
						arg0.anInt6313 = -1;
					}
				}
			}
		}
		if (arg0.anInt6297 > 0) {
			arg0.anInt6297--;
		}
		for (@Pc(1022) int local1022 = 0; local1022 < arg0.aClass98Array3.length; local1022++) {
			@Pc(1029) Class98 local1029 = arg0.aClass98Array3[local1022];
			if (local1029 != null) {
				if (local1029.anInt3712 > 0) {
					local1029.anInt3712--;
				} else {
					local194 = Static618.aClass222_2.method5867(local1029.anInt3718);
					if (local194 == null || local194.anIntArray550 == null) {
						arg0.aClass98Array3[local1022] = null;
					} else {
						local1029.anInt3714++;
						if (local1029.anInt3711 < local194.anIntArray550.length && local1029.anInt3714 > local194.anIntArray548[local1029.anInt3711]) {
							local1029.anInt3711++;
							local1029.anInt3714 = 1;
							if (!arg0.aBoolean533) {
								Static349.method5726(local1029.anInt3711, local194, arg0);
							}
						}
						if (local194.anIntArray550.length <= local1029.anInt3711) {
							local1029.anInt3717++;
							local1029.anInt3711 -= local194.anInt8684;
							if (local1029.anInt3717 >= local194.anInt8694) {
								arg0.aClass98Array3[local1022] = null;
							} else if (local1029.anInt3711 < 0 || local1029.anInt3711 >= local194.anIntArray550.length) {
								arg0.aClass98Array3[local1022] = null;
							} else if (!arg0.aBoolean533) {
								Static349.method5726(local1029.anInt3711, local194, arg0);
							}
						}
						local1029.anInt3713 = local1029.anInt3711 + 1;
						if (local194.anIntArray550.length <= local1029.anInt3713) {
							local1029.anInt3713 -= local194.anInt8684;
							if (local1029.anInt3717 + 1 >= local194.anInt8694) {
								local1029.anInt3713 = -1;
							} else if (local1029.anInt3713 < 0 || local194.anIntArray550.length <= local1029.anInt3713) {
								local1029.anInt3713 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II[B)[B")
	public static byte[] method5641(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static655.method6406(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
