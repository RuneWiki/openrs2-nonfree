import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
	public static int anInt2563;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "Lclient!kh;")
	private static Class60 aClass60_839 = Static200.method3116(")4slr2)3ws?order=LPWM");

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "S")
	public static short aShort26 = 205;

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "Lclient!kh;")
	private static Class60 aClass60_840 = Static200.method3116("Error loading your profile)3");

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "Lclient!kh;")
	private static Class60 aClass60_843 = Static200.method3116("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "Lclient!kh;")
	public static Class60 aClass60_841 = aClass60_843;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "Lclient!kh;")
	public static Class60 aClass60_842 = aClass60_840;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!ah;IIIIZ)V")
	public static void method1924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static114.aBoolean142) {
			Static179.anInt4184 = 32;
		} else {
			Static179.anInt4184 = 0;
		}
		Static114.aBoolean142 = false;
		@Pc(144) int local144;
		if (Static27.anInt641 != 0) {
			if (arg4 >= arg5 && arg5 + 16 > arg4 && arg3 <= arg0 && arg3 + 16 > arg0) {
				arg2.anInt247 -= 4;
				Static57.method1068(arg2);
			} else if (arg4 >= arg5 && arg5 + 16 > arg4 && arg0 >= arg6 + arg3 - 16 && arg6 + arg3 > arg0) {
				arg2.anInt247 += 4;
				Static57.method1068(arg2);
			} else if (arg4 >= arg5 - Static179.anInt4184 && Static179.anInt4184 + arg5 + 16 > arg4 && arg3 + 16 <= arg0 && arg0 < arg3 + arg6 - 16) {
				local144 = (arg6 - 32) * arg6 / arg1;
				if (local144 < 8) {
					local144 = 8;
				}
				@Pc(160) int local160 = arg0 - arg3 - local144 / 2 - 16;
				@Pc(166) int local166 = arg6 - local144 - 32;
				arg2.anInt247 = local160 * (arg1 - arg6) / local166;
				Static57.method1068(arg2);
				Static114.aBoolean142 = true;
			}
		}
		if (Static172.anInt3717 == 0) {
			return;
		}
		local144 = arg2.anInt251;
		if (arg4 >= arg5 - local144 && arg3 <= arg0 && arg4 < arg5 + 16 && arg3 + arg6 >= arg0) {
			arg2.anInt247 += Static172.anInt3717 * 45;
			Static57.method1068(arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public static void method1925() {
		if (Static205.aClass55_4 != null) {
			Static205.aClass55_4.method1754();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZII[IBIIII)V")
	public static void method1926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == 9) {
			arg7 = arg7 + 1 & 0x3;
			arg0 = 1;
		}
		if (Static76.anInt1843 > arg6) {
			arg4 -= Static76.anInt1843 - arg6;
			arg6 = Static76.anInt1843;
		}
		if (Static76.anInt1847 > arg9) {
			arg3 -= Static76.anInt1847 - arg9;
			arg9 = Static76.anInt1847;
		}
		if (arg9 + arg3 > Static76.anInt1844) {
			arg3 = Static76.anInt1844 - arg9;
		}
		if (arg0 == 10) {
			arg7 = arg7 + 3 & 0x3;
			arg0 = 1;
		}
		if (arg0 == 11) {
			arg7 = arg7 + 3 & 0x3;
			arg0 = 8;
		}
		@Pc(92) int local92 = arg9 * Static76.anInt1846 + arg6;
		if (Static76.anInt1845 < arg4 + arg6) {
			arg4 = Static76.anInt1845 - arg6;
		}
		@Pc(112) int local112 = Static76.anInt1846 - arg4;
		@Pc(121) int local121;
		@Pc(125) int local125;
		if (arg0 == 1) {
			if (arg7 == 0) {
				for (local121 = 0; local121 < arg3; local121++) {
					for (local125 = 0; local125 < arg4; local125++) {
						if (local125 <= local121) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 1) {
				for (local121 = arg3 - 1; local121 >= 0; local121--) {
					for (local125 = 0; local125 < arg4; local125++) {
						if (local125 <= local121) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 2) {
				for (local121 = 0; local121 < arg3; local121++) {
					for (local125 = 0; local125 < arg4; local125++) {
						if (local125 >= local121) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 3) {
				for (local121 = arg3 - 1; local121 >= 0; local121--) {
					for (local125 = 0; local125 < arg4; local125++) {
						if (local121 <= local125) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			}
		} else if (arg0 == 2) {
			if (arg7 == 0) {
				for (local121 = arg3 - 1; local121 >= 0; local121--) {
					for (local125 = 0; local125 < arg4; local125++) {
						if (local125 <= local121 >> 1) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 1) {
				for (local121 = 0; local121 < arg3; local121++) {
					for (local125 = 0; local125 < arg4; local125++) {
						if (local125 >= local121 << 1) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 2) {
				for (local121 = 0; local121 < arg3; local121++) {
					for (local125 = arg4 - 1; local125 >= 0; local125--) {
						if (local121 >> 1 >= local125) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 3) {
				for (local121 = arg3 - 1; local121 >= 0; local121--) {
					for (local125 = arg4 - 1; local125 >= 0; local125--) {
						if (local121 << 1 <= local125) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == 0) {
				for (local121 = arg3 - 1; local121 >= 0; local121--) {
					for (local125 = arg4 - 1; local125 >= 0; local125--) {
						if (local125 <= local121 >> 1) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 1) {
				for (local121 = arg3 - 1; local121 >= 0; local121--) {
					for (local125 = 0; local125 < arg4; local125++) {
						if (local125 >= local121 << 1) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 2) {
				for (local121 = 0; local121 < arg3; local121++) {
					for (local125 = 0; local125 < arg4; local125++) {
						if (local121 >> 1 >= local125) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 3) {
				for (local121 = 0; local121 < arg3; local121++) {
					for (local125 = arg4 - 1; local125 >= 0; local125--) {
						if (local125 >= local121 << 1) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			}
		} else if (arg0 == 4) {
			if (arg7 == 0) {
				for (local121 = arg3 - 1; local121 >= 0; local121--) {
					for (local125 = 0; local125 < arg4; local125++) {
						if (local121 >> 1 <= local125) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 1) {
				for (local121 = 0; local121 < arg3; local121++) {
					for (local125 = 0; local125 < arg4; local125++) {
						if (local121 << 1 >= local125) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 2) {
				for (local121 = 0; local121 < arg3; local121++) {
					for (local125 = arg4 - 1; local125 >= 0; local125--) {
						if (local121 >> 1 <= local125) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			} else if (arg7 == 3) {
				for (local121 = arg3 - 1; local121 >= 0; local121--) {
					for (local125 = arg4 - 1; local125 >= 0; local125--) {
						if (local125 <= local121 << 1) {
							arg5[local92] = arg8;
						} else if (arg2) {
							arg5[local92] = arg1;
						}
						local92++;
					}
					local92 += local112;
				}
			}
		} else if (arg0 != 5) {
			if (arg0 == 6) {
				if (arg7 == 0) {
					for (local121 = 0; local121 < arg3; local121++) {
						for (local125 = 0; local125 < arg4; local125++) {
							if (local125 <= arg4 / 2) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
				if (arg7 == 1) {
					for (local121 = 0; local121 < arg3; local121++) {
						for (local125 = 0; local125 < arg4; local125++) {
							if (local121 <= arg3 / 2) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
				if (arg7 == 2) {
					for (local121 = 0; local121 < arg3; local121++) {
						for (local125 = 0; local125 < arg4; local125++) {
							if (arg4 / 2 <= local125) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
				if (arg7 == 3) {
					for (local121 = 0; local121 < arg3; local121++) {
						for (local125 = 0; local125 < arg4; local125++) {
							if (local121 >= arg3 / 2) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
			}
			if (arg0 == 7) {
				if (arg7 == 0) {
					for (local121 = 0; local121 < arg3; local121++) {
						for (local125 = 0; local125 < arg4; local125++) {
							if (local121 - arg3 / 2 >= local125) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
				if (arg7 == 1) {
					for (local121 = arg3 - 1; local121 >= 0; local121--) {
						for (local125 = 0; local125 < arg4; local125++) {
							if (local125 <= local121 - arg3 / 2) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
				if (arg7 == 2) {
					for (local121 = arg3 - 1; local121 >= 0; local121--) {
						for (local125 = arg4 - 1; local125 >= 0; local125--) {
							if (local125 <= local121 - arg3 / 2) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
				if (arg7 == 3) {
					for (local121 = 0; local121 < arg3; local121++) {
						for (local125 = arg4 - 1; local125 >= 0; local125--) {
							if (local121 - arg3 / 2 >= local125) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
			}
			if (arg0 == 8) {
				if (arg7 == 0) {
					for (local121 = 0; local121 < arg3; local121++) {
						for (local125 = 0; local125 < arg4; local125++) {
							if (local121 - arg3 / 2 <= local125) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
				if (arg7 == 1) {
					for (local121 = arg3 - 1; local121 >= 0; local121--) {
						for (local125 = 0; local125 < arg4; local125++) {
							if (local121 - arg3 / 2 <= local125) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
				if (arg7 == 2) {
					for (local121 = arg3 - 1; local121 >= 0; local121--) {
						for (local125 = arg4 - 1; local125 >= 0; local125--) {
							if (local121 - arg3 / 2 <= local125) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
				if (arg7 == 3) {
					for (local121 = 0; local121 < arg3; local121++) {
						for (local125 = arg4 - 1; local125 >= 0; local125--) {
							if (local121 - arg3 / 2 <= local125) {
								arg5[local92] = arg8;
							} else if (arg2) {
								arg5[local92] = arg1;
							}
							local92++;
						}
						local92 += local112;
					}
					return;
				}
			}
		} else if (arg7 == 0) {
			for (local121 = arg3 - 1; local121 >= 0; local121--) {
				for (local125 = arg4 - 1; local125 >= 0; local125--) {
					if (local121 >> 1 <= local125) {
						arg5[local92] = arg8;
					} else if (arg2) {
						arg5[local92] = arg1;
					}
					local92++;
				}
				local92 += local112;
			}
		} else if (arg7 == 1) {
			for (local121 = arg3 - 1; local121 >= 0; local121--) {
				for (local125 = 0; local125 < arg4; local125++) {
					if (local121 << 1 >= local125) {
						arg5[local92] = arg8;
					} else if (arg2) {
						arg5[local92] = arg1;
					}
					local92++;
				}
				local92 += local112;
			}
		} else if (arg7 == 2) {
			for (local121 = 0; local121 < arg3; local121++) {
				for (local125 = 0; local125 < arg4; local125++) {
					if (local125 >= local121 >> 1) {
						arg5[local92] = arg8;
					} else if (arg2) {
						arg5[local92] = arg1;
					}
					local92++;
				}
				local92 += local112;
			}
		} else if (arg7 == 3) {
			for (local121 = 0; local121 < arg3; local121++) {
				for (local125 = arg4 - 1; local125 >= 0; local125--) {
					if (local125 <= local121 << 1) {
						arg5[local92] = arg8;
					} else if (arg2) {
						arg5[local92] = arg1;
					}
					local92++;
				}
				local92 += local112;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!kh;)Z")
	public static boolean method1928(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static78.anInt1884; local19++) {
			if (arg0.method1805(Static8.aClass60Array2[local19])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
	public static void method1929() {
		try {
			if (Static59.aClass20_1 == null) {
				Static59.aClass20_1 = new Class20(Static116.aClass65_4, Static34.method611(new Class60[] { Static15.aClass60_130, Static40.method681(Static209.anInt4478), aClass60_839 }).method1839());
			} else {
				@Pc(41) byte[] local41 = Static59.aClass20_1.method625();
				if (local41 != null) {
					@Pc(48) Class1_Sub9 local48 = new Class1_Sub9(local41);
					Static89.anInt2073 = local48.method946();
					Static179.aClass63Array3 = new Class63[Static89.anInt2073];
					for (@Pc(57) int local57 = 0; local57 < Static89.anInt2073; local57++) {
						@Pc(67) Class63 local67 = Static179.aClass63Array3[local57] = new Class63();
						@Pc(71) int local71 = local48.method946();
						local67.aBoolean143 = (local71 & 0x8000) != 0;
						local67.anInt2629 = local71 & 0x7FFF;
						local67.aClass60_872 = local48.method935();
						local67.anInt2620 = local48.method932();
						local67.anInt2622 = local57;
						local67.anInt2623 = Static43.method706(local48.method946());
					}
					Static53.method1022(Static179.aClass63Array3, Static179.aClass63Array3.length - 1, 0);
					Static59.aClass20_1 = null;
					Static43.aBoolean59 = true;
				}
			}
		} catch (@Pc(125) Exception local125) {
			local125.printStackTrace();
			Static59.aClass20_1 = null;
		}
	}
}
