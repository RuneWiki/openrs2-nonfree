import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "[Lclient!vt;")
	public static final Class5_Sub11[] aClass5_Sub11Array3 = new Class5_Sub11[8];

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ov;)V")
	public static void method1873(@OriginalArg(0) Class4_Sub2 arg0) {
		Static517.aClass133_13.H(arg0.anInt10231, arg0.anInt10228 + (arg0.method8734() >> 1), arg0.anInt10229, Static213.anIntArray203);
		arg0.anInt10235 = Static213.anIntArray203[0];
		arg0.anInt10233 = Static213.anIntArray203[1];
		arg0.anInt10234 = Static213.anIntArray203[2];
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!pe;I)V")
	public static void method1874(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0) {
		if (arg0.anInt1264 != -1) {
			@Pc(12) Class362 local12 = Static435.aClass298_1.method7034(arg0.anInt1264);
			if (local12 == null || local12.anIntArray571 == null) {
				arg0.anInt1264 = -1;
				arg0.aBoolean70 = false;
			} else {
				label357: {
					arg0.anInt1226++;
					if (local12.anIntArray571.length > arg0.anInt1208 && arg0.anInt1226 > local12.anIntArray573[arg0.anInt1208]) {
						arg0.anInt1226 = 1;
						arg0.anInt1274++;
						arg0.anInt1208++;
						if (!arg0.aBoolean71) {
							Static67.method1108(arg0, arg0.anInt1208, local12);
						}
					}
					if (local12.anIntArray571.length <= arg0.anInt1208) {
						arg0.anInt1208 = 0;
						arg0.anInt1226 = 0;
						if (arg0.aBoolean70) {
							arg0.anInt1264 = arg0.method1025().method6406();
							if (arg0.anInt1264 == -1) {
								arg0.aBoolean70 = false;
								break label357;
							}
							local12 = Static435.aClass298_1.method7034(arg0.anInt1264);
						}
						if (!arg0.aBoolean71) {
							Static67.method1108(arg0, arg0.anInt1208, local12);
						}
					}
					arg0.anInt1274 = arg0.anInt1208 + 1;
					if (local12.anIntArray571 == null) {
						arg0.aBoolean70 = false;
						arg0.anInt1264 = -1;
					} else if (local12.anIntArray571.length <= arg0.anInt1274) {
						arg0.anInt1274 = 0;
					}
				}
			}
		}
		@Pc(178) int local178;
		@Pc(192) Class362 local192;
		@Pc(175) Class82 local175;
		if (arg0.anInt1197 != -1 && arg0.anInt1255 <= Static631.anInt10493) {
			local175 = Static52.aClass10_1.method211(arg0.anInt1197);
			local178 = local175.anInt2052;
			if (local178 == -1) {
				arg0.anInt1197 = -1;
			} else {
				label358: {
					local192 = Static435.aClass298_1.method7034(local178);
					if (local175.aBoolean157) {
						if (local192.anInt9999 == 3) {
							if (arg0.anInt1281 > 0 && Static631.anInt10493 >= arg0.anInt1237 && arg0.anInt1249 < Static631.anInt10493) {
								arg0.anInt1197 = -1;
								break label358;
							}
						} else if (local192.anInt9999 == 1 && arg0.anInt1281 > 0 && Static631.anInt10493 >= arg0.anInt1237 && arg0.anInt1249 < Static631.anInt10493) {
							arg0.anInt1255 = Static631.anInt10493 + 1;
							break label358;
						}
					}
					if (local192 == null || local192.anIntArray571 == null) {
						arg0.anInt1197 = -1;
					} else {
						if (arg0.anInt1251 < 0) {
							arg0.anInt1251 = 0;
							if (!arg0.aBoolean71) {
								Static67.method1108(arg0, 0, local192);
							}
						}
						arg0.anInt1269++;
						if (local192.anIntArray571.length > arg0.anInt1251 && arg0.anInt1269 > local192.anIntArray573[arg0.anInt1251]) {
							arg0.anInt1251++;
							arg0.anInt1269 = 1;
							if (!arg0.aBoolean71) {
								Static67.method1108(arg0, arg0.anInt1251, local192);
							}
						}
						if (arg0.anInt1251 >= local192.anIntArray571.length) {
							if (local175.aBoolean157) {
								arg0.anInt1251 -= local192.anInt9996;
								arg0.anInt1215++;
								if (arg0.anInt1215 >= local192.anInt10000) {
									arg0.anInt1197 = -1;
								} else if (arg0.anInt1251 < 0 || arg0.anInt1251 >= local192.anIntArray571.length) {
									arg0.anInt1197 = -1;
								} else if (!arg0.aBoolean71) {
									Static67.method1108(arg0, arg0.anInt1251, local192);
								}
							} else {
								arg0.anInt1197 = -1;
							}
						}
						arg0.anInt1202 = arg0.anInt1251 + 1;
						if (local192.anIntArray571.length <= arg0.anInt1202) {
							if (local175.aBoolean157) {
								arg0.anInt1202 -= local192.anInt9996;
								if (local192.anInt10000 <= arg0.anInt1215 + 1) {
									arg0.anInt1202 = -1;
								} else if (arg0.anInt1202 < 0 || arg0.anInt1202 >= local192.anIntArray571.length) {
									arg0.anInt1202 = -1;
								}
							} else {
								arg0.anInt1202 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt1276 != -1 && arg0.anInt1240 <= Static631.anInt10493) {
			local175 = Static52.aClass10_1.method211(arg0.anInt1276);
			local178 = local175.anInt2052;
			if (local178 == -1) {
				arg0.anInt1276 = -1;
			} else {
				label361: {
					local192 = Static435.aClass298_1.method7034(local178);
					if (local175.aBoolean157) {
						if (local192.anInt9999 == 3) {
							if (arg0.anInt1281 > 0 && arg0.anInt1237 <= Static631.anInt10493 && Static631.anInt10493 > arg0.anInt1249) {
								arg0.anInt1276 = -1;
								break label361;
							}
						} else if (local192.anInt9999 == 1 && arg0.anInt1281 > 0 && Static631.anInt10493 >= arg0.anInt1237 && arg0.anInt1249 < Static631.anInt10493) {
							arg0.anInt1240 = Static631.anInt10493 + 1;
							break label361;
						}
					}
					if (local192 == null || local192.anIntArray571 == null) {
						arg0.anInt1276 = -1;
					} else {
						if (arg0.anInt1228 < 0) {
							arg0.anInt1228 = 0;
							if (!arg0.aBoolean71) {
								Static67.method1108(arg0, 0, local192);
							}
						}
						arg0.anInt1259++;
						if (arg0.anInt1228 < local192.anIntArray571.length && arg0.anInt1259 > local192.anIntArray573[arg0.anInt1228]) {
							arg0.anInt1259 = 1;
							arg0.anInt1228++;
							if (!arg0.aBoolean71) {
								Static67.method1108(arg0, arg0.anInt1228, local192);
							}
						}
						if (local192.anIntArray571.length <= arg0.anInt1228) {
							if (local175.aBoolean157) {
								arg0.anInt1228 -= local192.anInt9996;
								arg0.anInt1229++;
								if (local192.anInt10000 <= arg0.anInt1229) {
									arg0.anInt1276 = -1;
								} else if (arg0.anInt1228 < 0 || arg0.anInt1228 >= local192.anIntArray571.length) {
									arg0.anInt1276 = -1;
								} else if (!arg0.aBoolean71) {
									Static67.method1108(arg0, arg0.anInt1228, local192);
								}
							} else {
								arg0.anInt1276 = -1;
							}
						}
						arg0.anInt1222 = arg0.anInt1228 + 1;
						if (local192.anIntArray571.length <= arg0.anInt1222) {
							if (local175.aBoolean157) {
								arg0.anInt1222 -= local192.anInt9996;
								if (local192.anInt10000 <= arg0.anInt1229 + 1) {
									arg0.anInt1222 = -1;
								} else if (arg0.anInt1222 < 0 || arg0.anInt1222 >= local192.anIntArray571.length) {
									arg0.anInt1222 = -1;
								}
							} else {
								arg0.anInt1222 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(740) Class362 local740;
		if (arg0.anInt1277 != -1 && arg0.anInt1271 <= 1) {
			local740 = Static435.aClass298_1.method7034(arg0.anInt1277);
			if (local740.anInt9999 == 3) {
				if (arg0.anInt1281 > 0 && Static631.anInt10493 >= arg0.anInt1237 && Static631.anInt10493 > arg0.anInt1249) {
					arg0.anInt1277 = -1;
					arg0.anIntArray85 = null;
				}
			} else if (local740.anInt9999 == 1 && arg0.anInt1281 > 0 && Static631.anInt10493 >= arg0.anInt1237 && arg0.anInt1249 < Static631.anInt10493) {
				arg0.anInt1271 = 2;
			}
		}
		if (arg0.anInt1277 != -1 && arg0.anInt1271 == 0) {
			local740 = Static435.aClass298_1.method7034(arg0.anInt1277);
			if (local740 == null || local740.anIntArray571 == null) {
				arg0.anIntArray85 = null;
				arg0.anInt1277 = -1;
			} else {
				arg0.anInt1201++;
				if (local740.anIntArray571.length > arg0.anInt1223 && local740.anIntArray573[arg0.anInt1223] < arg0.anInt1201) {
					arg0.anInt1201 = 1;
					arg0.anInt1223++;
					if (!arg0.aBoolean71) {
						Static67.method1108(arg0, arg0.anInt1223, local740);
					}
				}
				if (local740.anIntArray571.length <= arg0.anInt1223) {
					arg0.anInt1221++;
					arg0.anInt1223 -= local740.anInt9996;
					if (local740.anInt10000 <= arg0.anInt1221) {
						arg0.anIntArray85 = null;
						arg0.anInt1277 = -1;
					} else if (arg0.anInt1223 < 0 || arg0.anInt1223 >= local740.anIntArray571.length) {
						arg0.anIntArray85 = null;
						arg0.anInt1277 = -1;
					} else if (!arg0.aBoolean71) {
						Static67.method1108(arg0, arg0.anInt1223, local740);
					}
				}
				arg0.anInt1211 = arg0.anInt1223 + 1;
				if (local740.anIntArray571.length <= arg0.anInt1211) {
					arg0.anInt1211 -= local740.anInt9996;
					if (arg0.anInt1221 + 1 >= local740.anInt10000) {
						arg0.anInt1211 = -1;
					} else if (arg0.anInt1211 < 0 || local740.anIntArray571.length <= arg0.anInt1211) {
						arg0.anInt1211 = -1;
					}
				}
			}
		}
		if (arg0.anInt1271 > 0) {
			arg0.anInt1271--;
		}
		for (local178 = 0; local178 < arg0.aClass228Array3.length; local178++) {
			@Pc(1003) Class228 local1003 = arg0.aClass228Array3[local178];
			if (local1003 != null) {
				if (local1003.anInt5657 > 0) {
					local1003.anInt5657--;
				} else {
					@Pc(1022) Class362 local1022 = Static435.aClass298_1.method7034(local1003.anInt5659);
					if (local1022 == null || local1022.anIntArray571 == null) {
						arg0.aClass228Array3[local178] = null;
					} else {
						local1003.anInt5665++;
						if (local1003.anInt5664 < local1022.anIntArray571.length && local1022.anIntArray573[local1003.anInt5664] < local1003.anInt5665) {
							local1003.anInt5665 = 1;
							local1003.anInt5664++;
							if (!arg0.aBoolean71) {
								Static67.method1108(arg0, local1003.anInt5664, local1022);
							}
						}
						if (local1022.anIntArray571.length <= local1003.anInt5664) {
							local1003.anInt5664 -= local1022.anInt9996;
							local1003.anInt5662++;
							if (local1022.anInt10000 <= local1003.anInt5662) {
								arg0.aClass228Array3[local178] = null;
							} else if (local1003.anInt5664 < 0 || local1022.anIntArray571.length <= local1003.anInt5664) {
								arg0.aClass228Array3[local178] = null;
							} else if (!arg0.aBoolean71) {
								Static67.method1108(arg0, local1003.anInt5664, local1022);
							}
						}
						local1003.anInt5663 = local1003.anInt5664 + 1;
						if (local1003.anInt5663 >= local1022.anIntArray571.length) {
							local1003.anInt5663 -= local1022.anInt9996;
							if (local1022.anInt10000 <= local1003.anInt5662 + 1) {
								local1003.anInt5663 = -1;
							} else if (local1003.anInt5663 < 0 || local1003.anInt5663 >= local1022.anIntArray571.length) {
								local1003.anInt5663 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZB)V")
	public static void method1875(@OriginalArg(0) boolean arg0) {
		for (@Pc(10) Class5_Sub20 local10 = (Class5_Sub20) Static368.aClass330_32.method7908(); local10 != null; local10 = (Class5_Sub20) Static368.aClass330_32.method7914()) {
			if (local10.aClass5_Sub1_Sub4_2 != null) {
				Static26.aClass5_Sub1_Sub2_1.method5052(local10.aClass5_Sub1_Sub4_2);
				local10.aClass5_Sub1_Sub4_2 = null;
			}
			if (local10.aClass5_Sub1_Sub4_1 != null) {
				Static26.aClass5_Sub1_Sub2_1.method5052(local10.aClass5_Sub1_Sub4_1);
				local10.aClass5_Sub1_Sub4_1 = null;
			}
			local10.method9047();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(49) Class5_Sub20 local49 = (Class5_Sub20) Static497.aClass330_55.method7908(); local49 != null; local49 = (Class5_Sub20) Static497.aClass330_55.method7914()) {
			if (local49.aClass5_Sub1_Sub4_2 != null) {
				Static26.aClass5_Sub1_Sub2_1.method5052(local49.aClass5_Sub1_Sub4_2);
				local49.aClass5_Sub1_Sub4_2 = null;
			}
			local49.method9047();
		}
		for (@Pc(76) Class5_Sub20 local76 = (Class5_Sub20) Static311.aClass273_13.method6577(); local76 != null; local76 = (Class5_Sub20) Static311.aClass273_13.method6589()) {
			if (local76.aClass5_Sub1_Sub4_2 != null) {
				Static26.aClass5_Sub1_Sub2_1.method5052(local76.aClass5_Sub1_Sub4_2);
				local76.aClass5_Sub1_Sub4_2 = null;
			}
			local76.method9047();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Z")
	public static boolean method1877(@OriginalArg(1) int arg0) {
		if (arg0 == 47 || arg0 == 13 || arg0 == 57 || arg0 == 18 || arg0 == 11) {
			return true;
		} else {
			return arg0 == 48 || arg0 == 1011;
		}
	}
}
