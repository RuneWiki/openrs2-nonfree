import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
	public static int anInt2770 = 0;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
	public static int[] anIntArray202 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "[I")
	public static int[] anIntArray203 = new int[5];

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(JI)V")
	public static void method2109(@OriginalArg(0) long arg0) {
		if (Static61.anInt1682 == 1 || Static61.anInt1682 == 5) {
			Static47.method970(arg0);
		} else if (Static61.anInt1682 == 2) {
			Static17.method327();
		} else {
			Static83.method1671();
		}
		if (!Static259.aBoolean280) {
			Static8.aStringArray3[0] = Static47.aString78;
			Static170.anIntArray299[0] = Static266.anInt5558;
			Static174.aStringArray33[0] = "";
			Static230.anInt5417 = 1;
			if (Static138.anInt3362 != 0) {
				Static242.anInt5237 = Static261.anInt5478;
				Static221.anInt4838 = Static60.anInt1650;
			} else if (Static143.anInt3469 == 0) {
				Static242.anInt5237 = Static240.anInt5167;
				Static221.anInt4838 = Static71.anInt1930;
			} else {
				Static221.anInt4838 = Static256.anInt5442;
				Static242.anInt5237 = Static133.anInt3300;
			}
			Static57.aShortArray26[0] = 1007;
		}
		if (Static140.anInt3388 != -1) {
			Static63.method1218(Static140.anInt3388);
		}
		for (@Pc(84) int local84 = 0; local84 < Static255.anInt5426; local84++) {
			if (Static198.aBooleanArray19[local84]) {
				Static186.aBooleanArray17[local84] = true;
			}
			Static93.aBooleanArray6[local84] = Static198.aBooleanArray19[local84];
			Static198.aBooleanArray19[local84] = false;
		}
		Static194.aClass122_14 = null;
		Static73.aClass122_8 = null;
		Static263.anInt5531 = Static156.anInt3722;
		Static147.anInt3576 = -1;
		Static224.anInt4924 = -1;
		if (Static140.anInt3388 != -1) {
			Static255.anInt5426 = 0;
			Static182.method3127();
		}
		Static189.method3184();
		Static110.method2247();
		if (Static259.aBoolean280) {
			if (Static4.aBoolean4) {
				Static126.method2411();
			} else {
				Static5.method84();
			}
		} else if (Static73.aClass122_8 != null) {
			Static79.method1583(Static99.anInt2714, Static73.aClass122_8, Static30.anInt922);
		} else if (Static224.anInt4924 != -1) {
			Static79.method1583(Static224.anInt4924, null, Static147.anInt3576);
		}
		@Pc(169) int local169 = Static259.aBoolean280 ? -1 : Static20.method396();
		if (local169 == -1) {
			local169 = Static216.anInt4749;
		}
		Static141.method1835(local169);
		if (Static215.anInt4736 == 1) {
			Static215.anInt4736 = 2;
		}
		if (Static120.anInt3093 == 1) {
			Static120.anInt3093 = 2;
		}
		if (Static242.anInt5228 == 3) {
			for (@Pc(195) int local195 = 0; local195 < Static255.anInt5426; local195++) {
				if (Static93.aBooleanArray6[local195]) {
					Static189.method3187(Static141.anIntArray178[local195], Static165.anIntArray291[local195], Static67.anIntArray143[local195], Static76.anIntArray156[local195], 16711935, 128);
				} else if (Static186.aBooleanArray17[local195]) {
					Static189.method3187(Static141.anIntArray178[local195], Static165.anIntArray291[local195], Static67.anIntArray143[local195], Static76.anIntArray156[local195], 16711680, 128);
				}
			}
		}
		Static1.method20(Static83.aClass9_Sub1_Sub1_1.anInt427, Static37.anInt999, Static83.aClass9_Sub1_Sub1_1.anInt479, Static137.anInt3321);
		Static37.anInt999 = 0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIZIBIIII[I)V")
	public static void method2113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		@Pc(7) int local7 = arg6;
		if (arg6 >= Static189.anInt4229) {
			return;
		}
		if (Static189.anInt4232 > arg6) {
			local7 = Static189.anInt4232;
		}
		@Pc(20) int local20 = arg7 + arg6;
		if (local20 <= Static189.anInt4232) {
			return;
		}
		if (Static189.anInt4229 < local20) {
			local20 = Static189.anInt4229;
		}
		@Pc(39) int local39 = arg2;
		if (arg2 >= Static189.anInt4233) {
			return;
		}
		if (arg2 < Static189.anInt4231) {
			local39 = Static189.anInt4231;
		}
		@Pc(53) int local53 = arg2 + arg0;
		if (Static189.anInt4231 >= local53) {
			return;
		}
		if (Static189.anInt4233 < local53) {
			local53 = Static189.anInt4233;
		}
		@Pc(70) int local70 = Static189.anInt4234 + local7 - local20;
		local20 -= arg6;
		local53 -= arg2;
		@Pc(84) int local84 = local7 + local39 * Static189.anInt4234;
		local39 -= arg2;
		if (arg4 == 9) {
			arg8 = arg8 + 1 & 0x3;
			arg4 = 1;
		}
		@Pc(105) int local105 = arg7 - local20;
		local7 -= arg6;
		if (arg4 == 10) {
			arg8 = arg8 + 3 & 0x3;
			arg4 = 1;
		}
		if (arg4 == 11) {
			arg8 = arg8 + 3 & 0x3;
			arg4 = 8;
		}
		@Pc(140) int local140 = arg0 - local53;
		@Pc(145) int local145 = arg7 - local7;
		@Pc(150) int local150 = arg0 - local39;
		@Pc(162) int local162;
		@Pc(166) int local166;
		if (arg4 == 1) {
			if (arg8 == 0) {
				for (local162 = local39; local162 < local53; local162++) {
					for (local166 = local7; local166 < local20; local166++) {
						if (local166 <= local162) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			} else if (arg8 == 1) {
				for (local162 = local150 - 1; local162 >= local140; local162--) {
					for (local166 = local7; local166 < local20; local166++) {
						if (local166 <= local162) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			} else if (arg8 == 2) {
				for (local162 = local39; local162 < local53; local162++) {
					for (local166 = local7; local166 < local20; local166++) {
						if (local166 >= local162) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			} else if (arg8 == 3) {
				for (local162 = local150 - 1; local162 >= local140; local162--) {
					for (local166 = local7; local166 < local20; local166++) {
						if (local162 <= local166) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			}
		} else if (arg4 == 2) {
			if (arg8 == 0) {
				for (local162 = local150 - 1; local162 >= local140; local162--) {
					for (local166 = local7; local166 < local20; local166++) {
						if (local166 <= local162 >> 1) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			} else if (arg8 == 1) {
				for (local162 = local39; local162 < local53; local162++) {
					for (local166 = local7; local166 < local20; local166++) {
						if (local84 >= 0 && arg9.length > local84) {
							if (local166 >= local162 << 1) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						} else {
							local84++;
						}
					}
					local84 += local70;
				}
			} else if (arg8 == 2) {
				for (local162 = local39; local162 < local53; local162++) {
					for (local166 = local145 - 1; local166 >= local105; local166--) {
						if (local166 <= local162 >> 1) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			} else if (arg8 == 3) {
				for (local162 = local150 - 1; local162 >= local140; local162--) {
					for (local166 = local145 - 1; local166 >= local105; local166--) {
						if (local162 << 1 <= local166) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			}
		} else if (arg4 == 3) {
			if (arg8 == 0) {
				for (local162 = local150 - 1; local162 >= local140; local162--) {
					for (local166 = local145 - 1; local166 >= local105; local166--) {
						if (local162 >> 1 >= local166) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			} else if (arg8 == 1) {
				for (local162 = local150 - 1; local162 >= local140; local162--) {
					for (local166 = local7; local166 < local20; local166++) {
						if (local162 << 1 <= local166) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			} else if (arg8 == 2) {
				for (local162 = local39; local162 < local53; local162++) {
					for (local166 = local7; local166 < local20; local166++) {
						if (local162 >> 1 >= local166) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			} else if (arg8 == 3) {
				for (local162 = local39; local162 < local53; local162++) {
					for (local166 = local145 - 1; local166 >= local105; local166--) {
						if (local162 << 1 <= local166) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			}
		} else if (arg4 == 4) {
			if (arg8 == 0) {
				for (local162 = local150 - 1; local162 >= local140; local162--) {
					for (local166 = local7; local166 < local20; local166++) {
						if (local162 >> 1 <= local166) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			} else if (arg8 == 1) {
				for (local162 = local39; local162 < local53; local162++) {
					for (local166 = local7; local166 < local20; local166++) {
						if (local166 <= local162 << 1) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			} else if (arg8 == 2) {
				for (local162 = local39; local162 < local53; local162++) {
					for (local166 = local145 - 1; local166 >= local105; local166--) {
						if (local166 >= local162 >> 1) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			} else if (arg8 == 3) {
				for (local162 = local150 - 1; local162 >= local140; local162--) {
					for (local166 = local145 - 1; local166 >= local105; local166--) {
						if (local162 << 1 >= local166) {
							arg9[local84] = arg1;
						} else if (arg3) {
							arg9[local84] = arg5;
						}
						local84++;
					}
					local84 += local70;
				}
			}
		} else if (arg4 != 5) {
			if (arg4 == 6) {
				if (arg8 == 0) {
					for (local162 = local39; local162 < local53; local162++) {
						for (local166 = local7; local166 < local20; local166++) {
							if (local166 <= arg7 / 2) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
				if (arg8 == 1) {
					for (local162 = local39; local162 < local53; local162++) {
						for (local166 = local7; local166 < local20; local166++) {
							if (arg0 / 2 >= local162) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
				if (arg8 == 2) {
					for (local162 = local39; local162 < local53; local162++) {
						for (local166 = local7; local166 < local20; local166++) {
							if (arg7 / 2 <= local166) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
				if (arg8 == 3) {
					for (local162 = local39; local162 < local53; local162++) {
						for (local166 = local7; local166 < local20; local166++) {
							if (arg0 / 2 <= local162) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
			}
			if (arg4 == 7) {
				if (arg8 == 0) {
					for (local162 = local39; local162 < local53; local162++) {
						for (local166 = local7; local166 < local20; local166++) {
							if (local166 <= local162 - arg0 / 2) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
				if (arg8 == 1) {
					for (local162 = local150 - 1; local162 >= local140; local162--) {
						for (local166 = local7; local166 < local20; local166++) {
							if (local166 <= local162 - arg0 / 2) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
				if (arg8 == 2) {
					for (local162 = local150 - 1; local162 >= local140; local162--) {
						for (local166 = local145 - 1; local166 >= local105; local166--) {
							if (local166 <= local162 - arg0 / 2) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
				if (arg8 == 3) {
					for (local162 = local39; local162 < local53; local162++) {
						for (local166 = local145 - 1; local166 >= local105; local166--) {
							if (local166 <= local162 - arg0 / 2) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
			}
			if (arg4 == 8) {
				if (arg8 == 0) {
					for (local162 = local39; local162 < local53; local162++) {
						for (local166 = local7; local166 < local20; local166++) {
							if (local166 >= local162 - arg0 / 2) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
				if (arg8 == 1) {
					for (local162 = local150 - 1; local162 >= local140; local162--) {
						for (local166 = local7; local166 < local20; local166++) {
							if (local166 >= local162 - arg0 / 2) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
				if (arg8 == 2) {
					for (local162 = local150 - 1; local162 >= local140; local162--) {
						for (local166 = local145 - 1; local166 >= local105; local166--) {
							if (local162 - arg0 / 2 <= local166) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
				if (arg8 == 3) {
					for (local162 = local39; local162 < local53; local162++) {
						for (local166 = local145 - 1; local166 >= local105; local166--) {
							if (local166 >= local162 - arg0 / 2) {
								arg9[local84] = arg1;
							} else if (arg3) {
								arg9[local84] = arg5;
							}
							local84++;
						}
						local84 += local70;
					}
					return;
				}
			}
		} else if (arg8 == 0) {
			for (local162 = local150 - 1; local162 >= local140; local162--) {
				for (local166 = local145 - 1; local166 >= local105; local166--) {
					if (local166 >= local162 >> 1) {
						arg9[local84] = arg1;
					} else if (arg3) {
						arg9[local84] = arg5;
					}
					local84++;
				}
				local84 += local70;
			}
		} else if (arg8 == 1) {
			for (local162 = local150 - 1; local162 >= local140; local162--) {
				for (local166 = local7; local166 < local20; local166++) {
					if (local162 << 1 >= local166) {
						arg9[local84] = arg1;
					} else if (arg3) {
						arg9[local84] = arg5;
					}
					local84++;
				}
				local84 += local70;
			}
		} else if (arg8 == 2) {
			for (local162 = local39; local162 < local53; local162++) {
				for (local166 = local7; local166 < local20; local166++) {
					if (local162 >> 1 <= local166) {
						arg9[local84] = arg1;
					} else if (arg3) {
						arg9[local84] = arg5;
					}
					local84++;
				}
				local84 += local70;
			}
		} else if (arg8 == 3) {
			for (local162 = local39; local162 < local53; local162++) {
				for (local166 = local145 - 1; local166 >= local105; local166--) {
					if (local162 << 1 >= local166) {
						arg9[local84] = arg1;
					} else if (arg3) {
						arg9[local84] = arg5;
					}
					local84++;
				}
				local84 += local70;
			}
		}
	}
}
