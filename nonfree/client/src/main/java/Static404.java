import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
	public static int anInt6930;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "Lclient!lq;")
	public static Class224 aClass224_9;

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "Lclient!la;")
	public static Class208 aClass208_93;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "Lclient!vea;")
	public static final Class368 aClass368_9 = new Class368();

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Z")
	public static boolean aBoolean532 = false;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!ec;)V")
	public static void method5927(@OriginalArg(1) Class8_Sub1_Sub3_Sub2 arg0) {
		if (arg0.anInt7008 != -1) {
			@Pc(19) Class165 local19 = Static158.aClass317_1.method7882(arg0.anInt7008, 100);
			if (local19 == null || local19.anIntArray226 == null) {
				arg0.anInt7008 = -1;
				arg0.aBoolean543 = false;
			} else {
				label277: {
					arg0.anInt7002++;
					if (arg0.anInt6978 < local19.anIntArray226.length && local19.anIntArray225[arg0.anInt6978] < arg0.anInt7002) {
						arg0.anInt7044++;
						arg0.anInt7002 = 1;
						arg0.anInt6978++;
						if (!arg0.aBoolean540) {
							Static268.method4004(local19, arg0, arg0.anInt6978);
						}
					}
					if (local19.anIntArray226.length <= arg0.anInt6978) {
						arg0.anInt7002 = 0;
						arg0.anInt6978 = 0;
						if (arg0.aBoolean543) {
							arg0.anInt7008 = arg0.method5991(106).method1911();
							if (arg0.anInt7008 == -1) {
								arg0.aBoolean543 = false;
								break label277;
							}
							local19 = Static158.aClass317_1.method7882(arg0.anInt7008, 100);
						}
						if (!arg0.aBoolean540) {
							Static268.method4004(local19, arg0, arg0.anInt6978);
						}
					}
					arg0.anInt7044 = arg0.anInt6978 + 1;
					if (local19.anIntArray226 == null) {
						arg0.aBoolean543 = false;
						arg0.anInt7008 = -1;
					} else if (arg0.anInt7044 >= local19.anIntArray226.length) {
						arg0.anInt7044 = 0;
					}
				}
			}
		}
		@Pc(240) Class165 local240;
		for (@Pc(189) int local189 = 0; local189 < arg0.aClass150Array3.length; local189++) {
			if (arg0.aClass150Array3[local189].anInt3303 != -1 && Static44.anInt740 >= arg0.aClass150Array3[local189].anInt3302) {
				@Pc(218) Class160 local218 = Static421.aClass385_2.method9166(arg0.aClass150Array3[local189].anInt3303);
				@Pc(221) int local221 = local218.anInt3635;
				if (local221 == -1) {
					arg0.aClass150Array3[local189].anInt3303 = -1;
				} else {
					local240 = Static158.aClass317_1.method7882(local221, 100);
					if (local218.aBoolean288) {
						if (local240.anInt3921 == 3) {
							if (arg0.anInt7049 > 0 && Static44.anInt740 >= arg0.anInt7032 && arg0.anInt7037 < Static44.anInt740) {
								arg0.aClass150Array3[local189].anInt3303 = -1;
								continue;
							}
						} else if (local240.anInt3921 == 1 && arg0.anInt7049 > 0 && arg0.anInt7032 <= Static44.anInt740 && Static44.anInt740 > arg0.anInt7037) {
							arg0.aClass150Array3[local189].anInt3302 = Static44.anInt740 + 1;
							continue;
						}
					}
					if (local240 == null || local240.anIntArray226 == null) {
						arg0.aClass150Array3[local189].anInt3303 = -1;
					} else {
						if (arg0.aClass150Array3[local189].anInt3298 < 0) {
							arg0.aClass150Array3[local189].anInt3298 = 0;
							if (!arg0.aBoolean540) {
								Static268.method4004(local240, arg0, 0);
							}
						}
						arg0.aClass150Array3[local189].anInt3295++;
						if (local240.anIntArray226.length > arg0.aClass150Array3[local189].anInt3298 && local240.anIntArray225[arg0.aClass150Array3[local189].anInt3298] < arg0.aClass150Array3[local189].anInt3295) {
							arg0.aClass150Array3[local189].anInt3295 = 1;
							arg0.aClass150Array3[local189].anInt3298++;
							if (!arg0.aBoolean540) {
								Static268.method4004(local240, arg0, arg0.aClass150Array3[local189].anInt3298);
							}
						}
						if (arg0.aClass150Array3[local189].anInt3298 >= local240.anIntArray226.length) {
							if (local218.aBoolean288) {
								arg0.aClass150Array3[local189].anInt3298 -= local240.anInt3907;
								arg0.aClass150Array3[local189].anInt3300++;
								if (local240.anInt3913 <= arg0.aClass150Array3[local189].anInt3300) {
									arg0.aClass150Array3[local189].anInt3303 = -1;
								} else if (arg0.aClass150Array3[local189].anInt3298 < 0 || arg0.aClass150Array3[local189].anInt3298 >= local240.anIntArray226.length) {
									arg0.aClass150Array3[local189].anInt3303 = -1;
								} else if (!arg0.aBoolean540) {
									Static268.method4004(local240, arg0, arg0.aClass150Array3[local189].anInt3298);
								}
							} else {
								arg0.aClass150Array3[local189].anInt3303 = -1;
							}
						}
						arg0.aClass150Array3[local189].anInt3301 = arg0.aClass150Array3[local189].anInt3298 + 1;
						if (arg0.aClass150Array3[local189].anInt3301 >= local240.anIntArray226.length) {
							if (local218.aBoolean288) {
								arg0.aClass150Array3[local189].anInt3301 -= local240.anInt3907;
								if (local240.anInt3913 <= arg0.aClass150Array3[local189].anInt3300 + 1) {
									arg0.aClass150Array3[local189].anInt3301 = -1;
								} else if (arg0.aClass150Array3[local189].anInt3301 < 0 || local240.anIntArray226.length <= arg0.aClass150Array3[local189].anInt3301) {
									arg0.aClass150Array3[local189].anInt3301 = -1;
								}
							} else {
								arg0.aClass150Array3[local189].anInt3301 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(692) Class165 local692;
		if (arg0.anInt7023 != -1 && arg0.anInt7045 <= 1) {
			local692 = Static158.aClass317_1.method7882(arg0.anInt7023, 100);
			if (local692.anInt3921 == 3) {
				if (arg0.anInt7049 > 0 && arg0.anInt7032 <= Static44.anInt740 && Static44.anInt740 > arg0.anInt7037) {
					arg0.anIntArray412 = null;
					arg0.anInt7023 = -1;
				}
			} else if (local692.anInt3921 == 1 && arg0.anInt7049 > 0 && Static44.anInt740 >= arg0.anInt7032 && arg0.anInt7037 < Static44.anInt740) {
				arg0.anInt7045 = 2;
			}
		}
		if (arg0.anInt7023 != -1 && arg0.anInt7045 == 0) {
			local692 = Static158.aClass317_1.method7882(arg0.anInt7023, 100);
			if (local692 == null || local692.anIntArray226 == null) {
				arg0.anIntArray412 = null;
				arg0.anInt7023 = -1;
			} else {
				arg0.anInt7006++;
				if (arg0.anInt7028 < local692.anIntArray226.length && arg0.anInt7006 > local692.anIntArray225[arg0.anInt7028]) {
					arg0.anInt7006 = 1;
					arg0.anInt7028++;
					if (!arg0.aBoolean540) {
						Static268.method4004(local692, arg0, arg0.anInt7028);
					}
				}
				if (local692.anIntArray226.length <= arg0.anInt7028) {
					arg0.anInt7028 -= local692.anInt3907;
					arg0.anInt7046++;
					if (local692.anInt3913 <= arg0.anInt7046) {
						arg0.anInt7023 = -1;
						arg0.anIntArray412 = null;
					} else if (arg0.anInt7028 < 0 || arg0.anInt7028 >= local692.anIntArray226.length) {
						arg0.anInt7023 = -1;
						arg0.anIntArray412 = null;
					} else if (!arg0.aBoolean540) {
						Static268.method4004(local692, arg0, arg0.anInt7028);
					}
				}
				arg0.anInt6979 = arg0.anInt7028 + 1;
				if (local692.anIntArray226.length <= arg0.anInt6979) {
					arg0.anInt6979 -= local692.anInt3907;
					if (local692.anInt3913 <= arg0.anInt7046 + 1) {
						arg0.anInt6979 = -1;
					} else if (arg0.anInt6979 < 0 || local692.anIntArray226.length <= arg0.anInt6979) {
						arg0.anInt6979 = -1;
					}
				}
			}
		}
		if (arg0.anInt7045 > 0) {
			arg0.anInt7045--;
		}
		for (@Pc(990) int local990 = 0; local990 < arg0.aClass10Array3.length; local990++) {
			@Pc(997) Class10 local997 = arg0.aClass10Array3[local990];
			if (local997 != null) {
				if (local997.anInt245 > 0) {
					local997.anInt245--;
				} else {
					local240 = Static158.aClass317_1.method7882(local997.anInt246, 100);
					if (local240 == null || local240.anIntArray226 == null) {
						arg0.aClass10Array3[local990] = null;
					} else {
						local997.anInt240++;
						if (local997.anInt244 < local240.anIntArray226.length && local997.anInt240 > local240.anIntArray225[local997.anInt244]) {
							local997.anInt240 = 1;
							local997.anInt244++;
							if (!arg0.aBoolean540) {
								Static268.method4004(local240, arg0, local997.anInt244);
							}
						}
						if (local997.anInt244 >= local240.anIntArray226.length) {
							local997.anInt242++;
							local997.anInt244 -= local240.anInt3907;
							if (local997.anInt242 >= local240.anInt3913) {
								arg0.aClass10Array3[local990] = null;
							} else if (local997.anInt244 < 0 || local997.anInt244 >= local240.anIntArray226.length) {
								arg0.aClass10Array3[local990] = null;
							} else if (!arg0.aBoolean540) {
								Static268.method4004(local240, arg0, local997.anInt244);
							}
						}
						local997.anInt243 = local997.anInt244 + 1;
						if (local240.anIntArray226.length <= local997.anInt243) {
							local997.anInt243 -= local240.anInt3907;
							if (local997.anInt242 + 1 >= local240.anInt3913) {
								local997.anInt243 = -1;
							} else if (local997.anInt243 < 0 || local240.anIntArray226.length <= local997.anInt243) {
								local997.anInt243 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZIIZI)V")
	public static void method5928(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(11) int local11 = (arg0 + arg3) / 2;
		@Pc(13) int local13 = arg0;
		@Pc(17) Class180_Sub1 local17 = Static92.aClass180_Sub1Array1[local11];
		Static92.aClass180_Sub1Array1[local11] = Static92.aClass180_Sub1Array1[arg3];
		Static92.aClass180_Sub1Array1[arg3] = local17;
		for (@Pc(29) int local29 = arg0; local29 < arg3; local29++) {
			if (Static191.method2760(arg5, local17, arg1, arg2, arg4, Static92.aClass180_Sub1Array1[local29]) <= 0) {
				@Pc(51) Class180_Sub1 local51 = Static92.aClass180_Sub1Array1[local29];
				Static92.aClass180_Sub1Array1[local29] = Static92.aClass180_Sub1Array1[local13];
				Static92.aClass180_Sub1Array1[local13++] = local51;
			}
		}
		Static92.aClass180_Sub1Array1[arg3] = Static92.aClass180_Sub1Array1[local13];
		Static92.aClass180_Sub1Array1[local13] = local17;
		method5928(arg0, arg1, arg2, local13 - 1, arg4, arg5);
		method5928(local13 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!ib;I)V")
	public static void method5930(@OriginalArg(0) Class5_Sub23 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static285.anInt4975; local3++) {
			@Pc(12) int local12 = arg0.method8499();
			@Pc(16) int local16 = arg0.method8519();
			if (local16 == 65535) {
				local16 = -1;
			}
			if (Static407.aClass180_Sub1Array2[local12] != null) {
				Static407.aClass180_Sub1Array2[local12].anInt4548 = local16;
			}
		}
		anInt6930++;
	}
}
