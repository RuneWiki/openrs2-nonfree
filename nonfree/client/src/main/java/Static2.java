import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!ll;")
	public static Class102 aClass102_1;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public static int anInt17;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
	public static int anInt19;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Z")
	public static boolean aBoolean2 = true;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
	public static int method10() {
		return ((Static71.anInt1312 == 0 ? 0 : 1) << 22) + ((Static52.anInt1043 == 0 ? 0 : 1) << 21) + ((Static150.anInt3043 == 0 ? 0 : 1) << 20) + (Static86.anInt1777 << 17) + ((Static14.aBoolean154 ? 1 : 0) << 16) + ((Static139.aBoolean188 ? 1 : 0) << 15) + ((Static298.aBoolean357 ? 1 : 0) << 13) + ((Static171.aBoolean210 ? 1 : 0) << 10) + ((Static105.aBoolean162 ? 1 : 0) << 9) + ((Static268.aBoolean333 ? 1 : 0) << 8) + ((Static182.aBoolean234 ? 1 : 0) << 7) + ((Static238.aBoolean299 ? 1 : 0) << 6) + ((Static114.aBoolean166 ? 1 : 0) << 5) + ((Static73.aBoolean106 ? 1 : 0) << 4) + ((aBoolean2 ? 1 : 0) << 3) + (Static165.anInt3301 & 0x7) + ((Static18.anInt380 & 0x3) << 11) + ((Static159.aBoolean203 ? 1 : 0) << 19) + (Static109.method1758() << 23);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method11() {
		aClass102_1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)[Lclient!tb;")
	public static Class59_Sub2[] method12() {
		@Pc(8) Class59_Sub2[] local8 = new Class59_Sub2[Static84.anInt1699];
		for (@Pc(10) int local10 = 0; local10 < Static84.anInt1699; local10++) {
			local8[local10] = new Class59_Sub2(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[local10], Static100.anIntArray223[local10], Static159.anIntArray285[local10], Static46.anIntArray120[local10], Static274.aByteArrayArray20[local10], Static6.anIntArray14);
		}
		Static268.method4006();
		return local8;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	public static void method13() {
		for (@Pc(15) Class4_Sub30 local15 = (Class4_Sub30) Static231.aClass10_47.method190(); local15 != null; local15 = (Class4_Sub30) Static231.aClass10_47.method191()) {
			if (local15.anInt5335 > 0) {
				local15.anInt5335--;
			}
			if (local15.anInt5335 != 0) {
				if (local15.anInt5339 > 0) {
					local15.anInt5339--;
				}
				if (local15.anInt5339 == 0 && local15.anInt5329 >= 1 && local15.anInt5331 >= 1 && local15.anInt5329 <= 102 && local15.anInt5331 <= 102 && (local15.anInt5341 < 0 || Static93.method1500(local15.anInt5333, local15.anInt5341))) {
					Static164.method2595(local15.anInt5331, local15.anInt5342, local15.anInt5334, local15.anInt5333, local15.anInt5343, local15.anInt5329, local15.anInt5341);
					local15.anInt5339 = -1;
					if (local15.anInt5341 == local15.anInt5330 && local15.anInt5330 == -1) {
						local15.method4391();
					} else if (local15.anInt5341 == local15.anInt5330 && local15.anInt5338 == local15.anInt5334 && local15.anInt5333 == local15.anInt5332) {
						local15.method4391();
					}
				}
			} else if (local15.anInt5330 < 0 || Static93.method1500(local15.anInt5332, local15.anInt5330)) {
				Static164.method2595(local15.anInt5331, local15.anInt5342, local15.anInt5338, local15.anInt5332, local15.anInt5343, local15.anInt5329, local15.anInt5330);
				local15.method4391();
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public static void method14() {
		Static105.aClass97_9 = new Class97(32);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!g;Z)V")
	public static void method15(@OriginalArg(0) Class12_Sub3 arg0) {
		arg0.aBoolean277 = false;
		@Pc(17) Class141 local17;
		if (arg0.anInt4127 != -1) {
			local17 = Static296.method1376(arg0.anInt4127);
			if (local17 == null || local17.anIntArray390 == null) {
				arg0.anInt4127 = -1;
			} else {
				arg0.anInt4123++;
				if (local17.anIntArray390.length > arg0.anInt4118 && arg0.anInt4123 > local17.anIntArray392[arg0.anInt4118]) {
					arg0.anInt4118++;
					arg0.anInt4123 = 1;
					arg0.anInt4159++;
					Static11.method188(arg0 == Static239.aClass12_Sub3_Sub2_2, local17, arg0.anInt4141, arg0.anInt4113, arg0.anInt4118);
				}
				if (arg0.anInt4118 >= local17.anIntArray390.length) {
					arg0.anInt4118 = 0;
					arg0.anInt4123 = 0;
					Static11.method188(arg0 == Static239.aClass12_Sub3_Sub2_2, local17, arg0.anInt4141, arg0.anInt4113, arg0.anInt4118);
				}
				arg0.anInt4159 = arg0.anInt4118 + 1;
				if (local17.anIntArray390.length <= arg0.anInt4159) {
					arg0.anInt4159 = 0;
				}
			}
		}
		@Pc(153) Class141 local153;
		if (arg0.anInt4125 != -1 && Static104.anInt2226 >= arg0.anInt4144) {
			@Pc(142) Class126 local142 = Static262.method3973(arg0.anInt4125);
			@Pc(145) int local145 = local142.anInt3816;
			if (local145 == -1) {
				arg0.anInt4125 = -1;
			} else {
				label302: {
					local153 = Static296.method1376(local145);
					if (local142.aBoolean245) {
						if (local153.anInt4366 == 3) {
							if (arg0.anInt4189 > 0 && Static104.anInt2226 >= arg0.anInt4193 && Static104.anInt2226 > arg0.anInt4137) {
								arg0.anInt4125 = -1;
								break label302;
							}
						} else if (local153.anInt4366 == 1 && arg0.anInt4189 > 0 && arg0.anInt4193 <= Static104.anInt2226 && Static104.anInt2226 > arg0.anInt4137) {
							arg0.anInt4144 = Static104.anInt2226 + 1;
							break label302;
						}
					}
					if (local153 == null || local153.anIntArray390 == null) {
						arg0.anInt4125 = -1;
					} else {
						if (arg0.anInt4188 < 0) {
							arg0.anInt4188 = 0;
							Static11.method188(arg0 == Static239.aClass12_Sub3_Sub2_2, local153, arg0.anInt4141, arg0.anInt4113, 0);
						}
						arg0.anInt4154++;
						if (arg0.anInt4188 < local153.anIntArray390.length && local153.anIntArray392[arg0.anInt4188] < arg0.anInt4154) {
							arg0.anInt4154 = 1;
							arg0.anInt4188++;
							Static11.method188(Static239.aClass12_Sub3_Sub2_2 == arg0, local153, arg0.anInt4141, arg0.anInt4113, arg0.anInt4188);
						}
						if (local153.anIntArray390.length <= arg0.anInt4188) {
							if (local142.aBoolean245) {
								arg0.anInt4169++;
								arg0.anInt4188 -= local153.anInt4367;
								if (arg0.anInt4169 >= local153.anInt4350) {
									arg0.anInt4125 = -1;
								} else if (arg0.anInt4188 >= 0 && arg0.anInt4188 < local153.anIntArray390.length) {
									Static11.method188(arg0 == Static239.aClass12_Sub3_Sub2_2, local153, arg0.anInt4141, arg0.anInt4113, arg0.anInt4188);
								} else {
									arg0.anInt4125 = -1;
								}
							} else {
								arg0.anInt4125 = -1;
							}
						}
						arg0.anInt4158 = arg0.anInt4188 + 1;
						if (local153.anIntArray390.length <= arg0.anInt4158) {
							if (local142.aBoolean245) {
								arg0.anInt4158 -= local153.anInt4367;
								if (arg0.anInt4169 + 1 >= local153.anInt4350) {
									arg0.anInt4158 = -1;
								} else if (arg0.anInt4158 < 0 || local153.anIntArray390.length <= arg0.anInt4158) {
									arg0.anInt4158 = -1;
								}
							} else {
								arg0.anInt4158 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4178 != -1 && arg0.anInt4119 <= 1) {
			local17 = Static296.method1376(arg0.anInt4178);
			if (local17.anInt4366 == 3) {
				if (arg0.anInt4189 > 0 && Static104.anInt2226 >= arg0.anInt4193 && Static104.anInt2226 > arg0.anInt4137) {
					arg0.anInt4178 = -1;
				}
			} else if (local17.anInt4366 == 1 && arg0.anInt4189 > 0 && arg0.anInt4193 <= Static104.anInt2226 && arg0.anInt4137 < Static104.anInt2226) {
				arg0.anInt4119 = 1;
			}
		}
		if (arg0.anInt4178 != -1 && arg0.anInt4119 == 0) {
			local17 = Static296.method1376(arg0.anInt4178);
			if (local17 == null || local17.anIntArray390 == null) {
				arg0.anInt4178 = -1;
			} else {
				arg0.anInt4120++;
				if (arg0.anInt4170 < local17.anIntArray390.length && local17.anIntArray392[arg0.anInt4170] < arg0.anInt4120) {
					arg0.anInt4120 = 1;
					arg0.anInt4170++;
					Static11.method188(arg0 == Static239.aClass12_Sub3_Sub2_2, local17, arg0.anInt4141, arg0.anInt4113, arg0.anInt4170);
				}
				if (arg0.anInt4170 >= local17.anIntArray390.length) {
					arg0.anInt4112++;
					arg0.anInt4170 -= local17.anInt4367;
					if (local17.anInt4350 <= arg0.anInt4112) {
						arg0.anInt4178 = -1;
					} else if (arg0.anInt4170 >= 0 && local17.anIntArray390.length > arg0.anInt4170) {
						Static11.method188(arg0 == Static239.aClass12_Sub3_Sub2_2, local17, arg0.anInt4141, arg0.anInt4113, arg0.anInt4170);
					} else {
						arg0.anInt4178 = -1;
					}
				}
				arg0.anInt4152 = arg0.anInt4170 + 1;
				if (local17.anIntArray390.length <= arg0.anInt4152) {
					arg0.anInt4152 -= local17.anInt4367;
					if (local17.anInt4350 <= arg0.anInt4112 + 1) {
						arg0.anInt4152 = -1;
					} else if (arg0.anInt4152 < 0 || local17.anIntArray390.length <= arg0.anInt4152) {
						arg0.anInt4152 = -1;
					}
				}
				arg0.aBoolean277 = local17.aBoolean289;
			}
		}
		if (arg0.anInt4119 > 0) {
			arg0.anInt4119--;
		}
		for (@Pc(721) int local721 = 0; local721 < arg0.aClass28Array3.length; local721++) {
			@Pc(736) Class28 local736 = arg0.aClass28Array3[local721];
			if (local736 != null) {
				if (local736.anInt851 > 0) {
					local736.anInt851--;
				} else {
					local153 = Static296.method1376(local736.anInt860);
					if (local153 == null || local153.anIntArray390 == null) {
						arg0.aClass28Array3[local721] = null;
					} else {
						local736.anInt855++;
						if (local736.anInt858 < local153.anIntArray390.length && local153.anIntArray392[local736.anInt858] < local736.anInt855) {
							local736.anInt855 = 1;
							local736.anInt858++;
							Static11.method188(Static239.aClass12_Sub3_Sub2_2 == arg0, local153, arg0.anInt4141, arg0.anInt4113, local736.anInt858);
						}
						if (local736.anInt858 >= local153.anIntArray390.length) {
							local736.anInt858 -= local153.anInt4367;
							local736.anInt853++;
							if (local736.anInt853 >= local153.anInt4350) {
								arg0.aClass28Array3[local721] = null;
							} else if (local736.anInt858 >= 0 && local153.anIntArray390.length > local736.anInt858) {
								Static11.method188(Static239.aClass12_Sub3_Sub2_2 == arg0, local153, arg0.anInt4141, arg0.anInt4113, local736.anInt858);
							} else {
								arg0.aClass28Array3[local721] = null;
							}
						}
						local736.anInt857 = local736.anInt858 + 1;
						if (local736.anInt857 >= local153.anIntArray390.length) {
							local736.anInt857 -= local153.anInt4367;
							if (local153.anInt4350 <= local736.anInt853 + 1) {
								local736.anInt857 = -1;
							} else if (local736.anInt857 < 0 || local736.anInt857 >= local153.anIntArray390.length) {
								local736.anInt857 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLclient!p;)Lclient!lf;")
	public static Class95_Sub2 method16(@OriginalArg(1) Class4_Sub17 arg0) {
		return new Class95_Sub2(arg0.method1869(), arg0.method1869(), arg0.method1869(), arg0.method1869(), arg0.method1869(), arg0.method1869(), arg0.method1869(), arg0.method1869(), arg0.method1835(), arg0.method1874());
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIZ)I")
	public static int method17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
