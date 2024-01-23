import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "Lclient!pk;")
	public static Class132 aClass132_28;

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
	public static int anInt1639;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
	public static int anInt1637 = 0;

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "[I")
	public static int[] anIntArray111 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "Z")
	public static boolean aBoolean117 = true;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIII)Lclient!uf;")
	public static Class8_Sub32 method1204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class8_Sub32 local9 = new Class8_Sub32();
		local9.anInt5291 = arg2;
		local9.anInt5295 = arg1;
		Static213.aClass129_22.method3039(local9, (long) arg0);
		Static194.method3023(arg1);
		@Pc(28) Class159 local28 = Static82.method1361(arg0);
		if (local28 != null) {
			Static128.method2075(local28);
		}
		if (Static272.aClass159_19 != null) {
			Static128.method2075(Static272.aClass159_19);
			Static272.aClass159_19 = null;
		}
		@Pc(44) int local44 = Static185.anInt3679;
		@Pc(46) int local46;
		for (local46 = 0; local46 < local44; local46++) {
			if (Static168.method4156(Static204.aShortArray34[local46])) {
				Static272.method4048(local46);
			}
		}
		if (Static185.anInt3679 == 1) {
			Static147.aBoolean246 = false;
			Static216.method3391(Static17.anInt485, Static202.anInt4178, Static111.anInt2293, Static215.anInt4426);
		} else {
			Static216.method3391(Static17.anInt485, Static202.anInt4178, Static111.anInt2293, Static215.anInt4426);
			local46 = Static229.aClass8_Sub1_Sub5_3.method2014(Static183.aString127);
			for (@Pc(84) int local84 = 0; local84 < Static185.anInt3679; local84++) {
				@Pc(97) int local97 = Static229.aClass8_Sub1_Sub5_3.method2014(Static105.method1704(local84));
				if (local97 > local46) {
					local46 = local97;
				}
			}
			Static17.anInt485 = local46 + 8;
			Static202.anInt4178 = Static185.anInt3679 * 15 + (Static225.aBoolean372 ? 26 : 22);
		}
		if (local28 != null) {
			Static191.method2995(false, local28);
		}
		Static217.method3401(arg1);
		if (Static248.anInt4917 != -1) {
			Static88.method1440(1, Static248.anInt4917);
		}
		return local9;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[IIIIIIIZI)V")
	public static void method1205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		if (Static103.anInt2163 <= arg5) {
			return;
		}
		@Pc(20) int local20 = arg3 + arg5;
		if (Static103.anInt2160 > arg5) {
			local7 = Static103.anInt2160;
		}
		if (local20 <= Static103.anInt2160) {
			return;
		}
		if (Static103.anInt2163 < local20) {
			local20 = Static103.anInt2163;
		}
		@Pc(42) int local42 = arg7;
		if (Static103.anInt2159 <= arg7) {
			return;
		}
		if (arg7 < Static103.anInt2162) {
			local42 = Static103.anInt2162;
		}
		@Pc(70) int local70 = arg7 + arg9;
		if (local70 <= Static103.anInt2162) {
			return;
		}
		if (local70 > Static103.anInt2159) {
			local70 = Static103.anInt2159;
		}
		if (arg0 == 9) {
			arg1 = arg1 + 1 & 0x3;
			arg0 = 1;
		}
		@Pc(107) int local107 = local7 + Static103.anInt2161 - local20;
		local70 -= arg7;
		local20 -= arg5;
		@Pc(121) int local121 = local7 + local42 * Static103.anInt2161;
		local7 -= arg5;
		if (arg0 == 10) {
			arg0 = 1;
			arg1 = arg1 + 3 & 0x3;
		}
		if (arg0 == 11) {
			arg0 = 8;
			arg1 = arg1 + 3 & 0x3;
		}
		@Pc(154) int local154 = arg3 - local7;
		@Pc(158) int local158 = arg3 - local20;
		local42 -= arg7;
		@Pc(166) int local166 = arg9 - local70;
		@Pc(170) int local170 = arg9 - local42;
		@Pc(177) int local177;
		@Pc(186) int local186;
		if (arg0 == 1) {
			if (arg1 == 0) {
				for (local177 = local42; local177 < local70; local177++) {
					for (local186 = local7; local186 < local20; local186++) {
						if (local177 >= local186) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			} else if (arg1 == 1) {
				for (local177 = local170 - 1; local177 >= local166; local177--) {
					for (local186 = local7; local186 < local20; local186++) {
						if (local186 <= local177) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			} else if (arg1 == 2) {
				for (local177 = local42; local177 < local70; local177++) {
					for (local186 = local7; local186 < local20; local186++) {
						if (local186 >= local177) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			} else if (arg1 == 3) {
				for (local177 = local170 - 1; local177 >= local166; local177--) {
					for (local186 = local7; local186 < local20; local186++) {
						if (local177 <= local186) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			}
		} else if (arg0 == 2) {
			if (arg1 == 0) {
				for (local177 = local170 - 1; local177 >= local166; local177--) {
					for (local186 = local7; local186 < local20; local186++) {
						if (local186 <= local177 >> 1) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			} else if (arg1 == 1) {
				for (local177 = local42; local177 < local70; local177++) {
					for (local186 = local7; local186 < local20; local186++) {
						if (local121 >= 0 && local121 < arg2.length) {
							if (local186 >= local177 << 1) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						} else {
							local121++;
						}
					}
					local121 += local107;
				}
			} else if (arg1 == 2) {
				for (local177 = local42; local177 < local70; local177++) {
					for (local186 = local154 - 1; local186 >= local158; local186--) {
						if (local177 >> 1 >= local186) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			} else if (arg1 == 3) {
				for (local177 = local170 - 1; local177 >= local166; local177--) {
					for (local186 = local154 - 1; local186 >= local158; local186--) {
						if (local177 << 1 <= local186) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			}
		} else if (arg0 == 3) {
			if (arg1 == 0) {
				for (local177 = local170 - 1; local177 >= local166; local177--) {
					for (local186 = local154 - 1; local186 >= local158; local186--) {
						if (local186 <= local177 >> 1) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			} else if (arg1 == 1) {
				for (local177 = local170 - 1; local177 >= local166; local177--) {
					for (local186 = local7; local186 < local20; local186++) {
						if (local177 << 1 <= local186) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			} else if (arg1 == 2) {
				for (local177 = local42; local177 < local70; local177++) {
					for (local186 = local7; local186 < local20; local186++) {
						if (local177 >> 1 >= local186) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			} else if (arg1 == 3) {
				for (local177 = local42; local177 < local70; local177++) {
					for (local186 = local154 - 1; local186 >= local158; local186--) {
						if (local177 << 1 <= local186) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			}
		} else if (arg0 == 4) {
			if (arg1 == 0) {
				for (local177 = local170 - 1; local177 >= local166; local177--) {
					for (local186 = local7; local186 < local20; local186++) {
						if (local186 >= local177 >> 1) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			} else if (arg1 == 1) {
				for (local177 = local42; local177 < local70; local177++) {
					for (local186 = local7; local186 < local20; local186++) {
						if (local177 << 1 >= local186) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			} else if (arg1 == 2) {
				for (local177 = local42; local177 < local70; local177++) {
					for (local186 = local154 - 1; local186 >= local158; local186--) {
						if (local177 >> 1 <= local186) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			} else if (arg1 == 3) {
				for (local177 = local170 - 1; local177 >= local166; local177--) {
					for (local186 = local154 - 1; local186 >= local158; local186--) {
						if (local177 << 1 >= local186) {
							arg2[local121] = arg6;
						} else if (arg8) {
							arg2[local121] = arg4;
						}
						local121++;
					}
					local121 += local107;
				}
			}
		} else if (arg0 != 5) {
			if (arg0 == 6) {
				if (arg1 == 0) {
					for (local177 = local42; local177 < local70; local177++) {
						for (local186 = local7; local186 < local20; local186++) {
							if (arg3 / 2 >= local186) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
				if (arg1 == 1) {
					for (local177 = local42; local177 < local70; local177++) {
						for (local186 = local7; local186 < local20; local186++) {
							if (arg9 / 2 >= local177) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
				if (arg1 == 2) {
					for (local177 = local42; local177 < local70; local177++) {
						for (local186 = local7; local186 < local20; local186++) {
							if (local186 >= arg3 / 2) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
				if (arg1 == 3) {
					for (local177 = local42; local177 < local70; local177++) {
						for (local186 = local7; local186 < local20; local186++) {
							if (arg9 / 2 <= local177) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
			}
			if (arg0 == 7) {
				if (arg1 == 0) {
					for (local177 = local42; local177 < local70; local177++) {
						for (local186 = local7; local186 < local20; local186++) {
							if (local177 - arg9 / 2 >= local186) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
				if (arg1 == 1) {
					for (local177 = local170 - 1; local177 >= local166; local177--) {
						for (local186 = local7; local186 < local20; local186++) {
							if (local186 <= local177 - arg9 / 2) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
				if (arg1 == 2) {
					for (local177 = local170 - 1; local177 >= local166; local177--) {
						for (local186 = local154 - 1; local186 >= local158; local186--) {
							if (local186 <= local177 - arg9 / 2) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
				if (arg1 == 3) {
					for (local177 = local42; local177 < local70; local177++) {
						for (local186 = local154 - 1; local186 >= local158; local186--) {
							if (local177 - arg9 / 2 >= local186) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
			}
			if (arg0 == 8) {
				if (arg1 == 0) {
					for (local177 = local42; local177 < local70; local177++) {
						for (local186 = local7; local186 < local20; local186++) {
							if (local186 >= local177 - arg9 / 2) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
				if (arg1 == 1) {
					for (local177 = local170 - 1; local177 >= local166; local177--) {
						for (local186 = local7; local186 < local20; local186++) {
							if (local177 - arg9 / 2 <= local186) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
				if (arg1 == 2) {
					for (local177 = local170 - 1; local177 >= local166; local177--) {
						for (local186 = local154 - 1; local186 >= local158; local186--) {
							if (local186 >= local177 - arg9 / 2) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
				if (arg1 == 3) {
					for (local177 = local42; local177 < local70; local177++) {
						for (local186 = local154 - 1; local186 >= local158; local186--) {
							if (local186 >= local177 - arg9 / 2) {
								arg2[local121] = arg6;
							} else if (arg8) {
								arg2[local121] = arg4;
							}
							local121++;
						}
						local121 += local107;
					}
					return;
				}
			}
		} else if (arg1 == 0) {
			for (local177 = local170 - 1; local177 >= local166; local177--) {
				for (local186 = local154 - 1; local186 >= local158; local186--) {
					if (local186 >= local177 >> 1) {
						arg2[local121] = arg6;
					} else if (arg8) {
						arg2[local121] = arg4;
					}
					local121++;
				}
				local121 += local107;
			}
		} else if (arg1 == 1) {
			for (local177 = local170 - 1; local177 >= local166; local177--) {
				for (local186 = local7; local186 < local20; local186++) {
					if (local177 << 1 >= local186) {
						arg2[local121] = arg6;
					} else if (arg8) {
						arg2[local121] = arg4;
					}
					local121++;
				}
				local121 += local107;
			}
		} else if (arg1 == 2) {
			for (local177 = local42; local177 < local70; local177++) {
				for (local186 = local7; local186 < local20; local186++) {
					if (local186 >= local177 >> 1) {
						arg2[local121] = arg6;
					} else if (arg8) {
						arg2[local121] = arg4;
					}
					local121++;
				}
				local121 += local107;
			}
		} else if (arg1 == 3) {
			for (local177 = local42; local177 < local70; local177++) {
				for (local186 = local154 - 1; local186 >= local158; local186--) {
					if (local177 << 1 >= local186) {
						arg2[local121] = arg6;
					} else if (arg8) {
						arg2[local121] = arg4;
					}
					local121++;
				}
				local121 += local107;
			}
		}
	}
}
