import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "[Lclient!pt;")
	public static Class292[] aClass292Array62;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
	public static int anInt3540;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Lclient!pe;")
	public static final Class276 aClass276_11 = new Class276(4);

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "[Lclient!rq;")
	public static final Class320[] aClass320Array1 = new Class320[16];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!kg;)V")
	public static void method3257(@OriginalArg(1) Class3_Sub1_Sub2_Sub2 arg0) {
		if (arg0.anInt9967 != -1) {
			@Pc(15) Class124 local15 = Static99.aClass2_1.method22(arg0.anInt9967);
			if (local15 == null || local15.anIntArray224 == null) {
				arg0.anInt9967 = -1;
				arg0.aBoolean776 = false;
			} else {
				label277: {
					arg0.anInt9940++;
					if (local15.anIntArray224.length > arg0.anInt9973 && local15.anIntArray221[arg0.anInt9973] < arg0.anInt9940) {
						arg0.anInt9972++;
						arg0.anInt9940 = 1;
						arg0.anInt9973++;
						if (!arg0.aBoolean773) {
							Static633.method8389(arg0.anInt9973, arg0, local15);
						}
					}
					if (arg0.anInt9973 >= local15.anIntArray224.length) {
						arg0.anInt9973 = 0;
						arg0.anInt9940 = 0;
						if (arg0.aBoolean776) {
							arg0.anInt9967 = arg0.method8525().method8539();
							if (arg0.anInt9967 == -1) {
								arg0.aBoolean776 = false;
								break label277;
							}
							local15 = Static99.aClass2_1.method22(arg0.anInt9967);
						}
						if (!arg0.aBoolean773) {
							Static633.method8389(arg0.anInt9973, arg0, local15);
						}
					}
					arg0.anInt9972 = arg0.anInt9973 + 1;
					if (local15.anIntArray224 == null) {
						arg0.aBoolean776 = false;
						arg0.anInt9967 = -1;
					} else if (local15.anIntArray224.length <= arg0.anInt9972) {
						arg0.anInt9972 = 0;
					}
				}
			}
		}
		@Pc(182) int local182;
		for (@Pc(154) int local154 = 0; local154 < arg0.aClass78Array3.length; local154++) {
			if (arg0.aClass78Array3[local154].anInt2180 != -1 && arg0.aClass78Array3[local154].anInt2177 <= Static177.anInt3088) {
				@Pc(179) Class323 local179 = Static341.aClass349_1.method7597(arg0.aClass78Array3[local154].anInt2180);
				local182 = local179.anInt8322;
				if (local182 == -1) {
					arg0.aClass78Array3[local154].anInt2180 = -1;
				} else {
					@Pc(199) Class124 local199 = Static99.aClass2_1.method22(local182);
					if (local179.aBoolean644) {
						if (local199.anInt3026 == 3) {
							if (arg0.anInt10001 > 0 && Static177.anInt3088 >= arg0.anInt9945 && arg0.anInt9987 < Static177.anInt3088) {
								arg0.aClass78Array3[local154].anInt2180 = -1;
								continue;
							}
						} else if (local199.anInt3026 == 1 && arg0.anInt10001 > 0 && Static177.anInt3088 >= arg0.anInt9945 && Static177.anInt3088 > arg0.anInt9987) {
							arg0.aClass78Array3[local154].anInt2177 = Static177.anInt3088 + 1;
							continue;
						}
					}
					if (local199 == null || local199.anIntArray224 == null) {
						arg0.aClass78Array3[local154].anInt2180 = -1;
					} else {
						if (arg0.aClass78Array3[local154].anInt2175 < 0) {
							arg0.aClass78Array3[local154].anInt2175 = 0;
							if (!arg0.aBoolean773) {
								Static633.method8389(0, arg0, local199);
							}
						}
						arg0.aClass78Array3[local154].anInt2178++;
						if (arg0.aClass78Array3[local154].anInt2175 < local199.anIntArray224.length && arg0.aClass78Array3[local154].anInt2178 > local199.anIntArray221[arg0.aClass78Array3[local154].anInt2175]) {
							arg0.aClass78Array3[local154].anInt2178 = 1;
							arg0.aClass78Array3[local154].anInt2175++;
							if (!arg0.aBoolean773) {
								Static633.method8389(arg0.aClass78Array3[local154].anInt2175, arg0, local199);
							}
						}
						if (local199.anIntArray224.length <= arg0.aClass78Array3[local154].anInt2175) {
							if (local179.aBoolean644) {
								arg0.aClass78Array3[local154].anInt2175 -= local199.anInt3035;
								arg0.aClass78Array3[local154].anInt2182++;
								if (arg0.aClass78Array3[local154].anInt2182 >= local199.anInt3027) {
									arg0.aClass78Array3[local154].anInt2180 = -1;
								} else if (arg0.aClass78Array3[local154].anInt2175 < 0 || local199.anIntArray224.length <= arg0.aClass78Array3[local154].anInt2175) {
									arg0.aClass78Array3[local154].anInt2180 = -1;
								} else if (!arg0.aBoolean773) {
									Static633.method8389(arg0.aClass78Array3[local154].anInt2175, arg0, local199);
								}
							} else {
								arg0.aClass78Array3[local154].anInt2180 = -1;
							}
						}
						arg0.aClass78Array3[local154].anInt2174 = arg0.aClass78Array3[local154].anInt2175 + 1;
						if (local199.anIntArray224.length <= arg0.aClass78Array3[local154].anInt2174) {
							if (local179.aBoolean644) {
								arg0.aClass78Array3[local154].anInt2174 -= local199.anInt3035;
								if (arg0.aClass78Array3[local154].anInt2182 + 1 >= local199.anInt3027) {
									arg0.aClass78Array3[local154].anInt2174 = -1;
								} else if (arg0.aClass78Array3[local154].anInt2174 < 0 || local199.anIntArray224.length <= arg0.aClass78Array3[local154].anInt2174) {
									arg0.aClass78Array3[local154].anInt2174 = -1;
								}
							} else {
								arg0.aClass78Array3[local154].anInt2174 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(561) Class124 local561;
		if (arg0.anInt9981 != -1 && arg0.anInt9934 <= 1) {
			local561 = Static99.aClass2_1.method22(arg0.anInt9981);
			if (local561.anInt3026 == 3) {
				if (arg0.anInt10001 > 0 && Static177.anInt3088 >= arg0.anInt9945 && Static177.anInt3088 > arg0.anInt9987) {
					arg0.anInt9981 = -1;
					arg0.anIntArray690 = null;
				}
			} else if (local561.anInt3026 == 1 && arg0.anInt10001 > 0 && arg0.anInt9945 <= Static177.anInt3088 && arg0.anInt9987 < Static177.anInt3088) {
				arg0.anInt9934 = 2;
			}
		}
		if (arg0.anInt9981 != -1 && arg0.anInt9934 == 0) {
			local561 = Static99.aClass2_1.method22(arg0.anInt9981);
			if (local561 == null || local561.anIntArray224 == null) {
				arg0.anInt9981 = -1;
				arg0.anIntArray690 = null;
			} else {
				arg0.anInt9941++;
				if (arg0.anInt9960 < local561.anIntArray224.length && arg0.anInt9941 > local561.anIntArray221[arg0.anInt9960]) {
					arg0.anInt9960++;
					arg0.anInt9941 = 1;
					if (!arg0.aBoolean773) {
						Static633.method8389(arg0.anInt9960, arg0, local561);
					}
				}
				if (arg0.anInt9960 >= local561.anIntArray224.length) {
					arg0.anInt9960 -= local561.anInt3035;
					arg0.anInt9984++;
					if (arg0.anInt9984 >= local561.anInt3027) {
						arg0.anInt9981 = -1;
						arg0.anIntArray690 = null;
					} else if (arg0.anInt9960 < 0 || local561.anIntArray224.length <= arg0.anInt9960) {
						arg0.anIntArray690 = null;
						arg0.anInt9981 = -1;
					} else if (!arg0.aBoolean773) {
						Static633.method8389(arg0.anInt9960, arg0, local561);
					}
				}
				arg0.anInt9946 = arg0.anInt9960 + 1;
				if (arg0.anInt9946 >= local561.anIntArray224.length) {
					arg0.anInt9946 -= local561.anInt3035;
					if (local561.anInt3027 <= arg0.anInt9984 + 1) {
						arg0.anInt9946 = -1;
					} else if (arg0.anInt9946 < 0 || arg0.anInt9946 >= local561.anIntArray224.length) {
						arg0.anInt9946 = -1;
					}
				}
			}
		}
		if (arg0.anInt9934 > 0) {
			arg0.anInt9934--;
		}
		for (local182 = 0; local182 < arg0.aClass143Array3.length; local182++) {
			@Pc(840) Class143 local840 = arg0.aClass143Array3[local182];
			if (local840 != null) {
				if (local840.anInt3383 > 0) {
					local840.anInt3383--;
				} else {
					@Pc(862) Class124 local862 = Static99.aClass2_1.method22(local840.anInt3386);
					if (local862 == null || local862.anIntArray224 == null) {
						arg0.aClass143Array3[local182] = null;
					} else {
						local840.anInt3385++;
						if (local862.anIntArray224.length > local840.anInt3388 && local862.anIntArray221[local840.anInt3388] < local840.anInt3385) {
							local840.anInt3385 = 1;
							local840.anInt3388++;
							if (!arg0.aBoolean773) {
								Static633.method8389(local840.anInt3388, arg0, local862);
							}
						}
						if (local840.anInt3388 >= local862.anIntArray224.length) {
							local840.anInt3388 -= local862.anInt3035;
							local840.anInt3384++;
							if (local840.anInt3384 >= local862.anInt3027) {
								arg0.aClass143Array3[local182] = null;
							} else if (local840.anInt3388 < 0 || local862.anIntArray224.length <= local840.anInt3388) {
								arg0.aClass143Array3[local182] = null;
							} else if (!arg0.aBoolean773) {
								Static633.method8389(local840.anInt3388, arg0, local862);
							}
						}
						local840.anInt3382 = local840.anInt3388 + 1;
						if (local840.anInt3382 >= local862.anIntArray224.length) {
							local840.anInt3382 -= local862.anInt3035;
							if (local840.anInt3384 + 1 >= local862.anInt3027) {
								local840.anInt3382 = -1;
							} else if (local840.anInt3382 < 0 || local840.anInt3382 >= local862.anIntArray224.length) {
								local840.anInt3382 = -1;
							}
						}
					}
				}
			}
		}
	}
}
