import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Z")
	public static boolean aBoolean35 = true;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method672() {
		for (@Pc(15) Class2_Sub25 local15 = (Class2_Sub25) Static165.aClass44_44.method1359(); local15 != null; local15 = (Class2_Sub25) Static165.aClass44_44.method1356()) {
			if (local15.anInt3271 > 0) {
				local15.anInt3271--;
			}
			if (local15.anInt3271 != 0) {
				if (local15.anInt3276 > 0) {
					local15.anInt3276--;
				}
				if (local15.anInt3276 == 0 && local15.anInt3279 >= 1 && local15.anInt3270 >= 1 && local15.anInt3279 <= 102 && local15.anInt3270 <= 102 && (local15.anInt3272 < 0 || Static25.method326(local15.anInt3280, local15.anInt3272))) {
					Static142.method2537(local15.anInt3272, local15.anInt3270, local15.anInt3279, local15.anInt3280, local15.anInt3281, local15.anInt3277, local15.anInt3269);
					local15.anInt3276 = -1;
					if (local15.anInt3272 == local15.anInt3278 && local15.anInt3278 == -1) {
						local15.method3986();
					} else if (local15.anInt3272 == local15.anInt3278 && local15.anInt3281 == local15.anInt3275 && local15.anInt3274 == local15.anInt3280) {
						local15.method3986();
					}
				}
			} else if (local15.anInt3278 < 0 || Static25.method326(local15.anInt3274, local15.anInt3278)) {
				Static142.method2537(local15.anInt3278, local15.anInt3270, local15.anInt3279, local15.anInt3274, local15.anInt3275, local15.anInt3277, local15.anInt3269);
				local15.method3986();
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method673() {
		@Pc(11) int local11 = Static139.aClass2_Sub23_Sub1_4.method2154(8);
		@Pc(20) int local20;
		if (Static180.anInt4193 > local11) {
			for (local20 = local11; local20 < Static180.anInt4193; local20++) {
				Static156.anIntArray597[Static3.anInt99++] = Static16.anIntArray792[local20];
			}
		}
		if (local11 > Static180.anInt4193) {
			throw new RuntimeException("gppov1");
		}
		Static180.anInt4193 = 0;
		for (local20 = 0; local20 < local11; local20++) {
			@Pc(62) int local62 = Static16.anIntArray792[local20];
			@Pc(66) Class5_Sub2_Sub2 local66 = Static213.aClass5_Sub2_Sub2Array3[local62];
			@Pc(71) int local71 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
			if (local71 == 0) {
				Static16.anIntArray792[Static180.anInt4193++] = local62;
				local66.anInt1826 = Static123.anInt2808;
			} else {
				@Pc(91) int local91 = Static139.aClass2_Sub23_Sub1_4.method2154(2);
				if (local91 == 0) {
					Static16.anIntArray792[Static180.anInt4193++] = local62;
					local66.anInt1826 = Static123.anInt2808;
					Static156.anIntArray598[Static125.anInt1641++] = local62;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local91 == 1) {
						Static16.anIntArray792[Static180.anInt4193++] = local62;
						local66.anInt1826 = Static123.anInt2808;
						local133 = Static139.aClass2_Sub23_Sub1_4.method2154(3);
						local66.method1482(local133, false);
						local143 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
						if (local143 == 1) {
							Static156.anIntArray598[Static125.anInt1641++] = local62;
						}
					} else if (local91 == 2) {
						Static16.anIntArray792[Static180.anInt4193++] = local62;
						local66.anInt1826 = Static123.anInt2808;
						local133 = Static139.aClass2_Sub23_Sub1_4.method2154(3);
						local66.method1482(local133, true);
						local143 = Static139.aClass2_Sub23_Sub1_4.method2154(3);
						local66.method1482(local143, true);
						@Pc(201) int local201 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
						if (local201 == 1) {
							Static156.anIntArray598[Static125.anInt1641++] = local62;
						}
					} else if (local91 == 3) {
						Static156.anIntArray597[Static3.anInt99++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)V")
	public static void method674(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub3_Sub15 local12 = Static103.method1787(2, arg0);
		local12.method1648();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIIII[IIZIII)V")
	public static void method675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg5 == 9) {
			arg5 = 1;
			arg7 = arg7 + 1 & 0x3;
		}
		if (arg5 == 10) {
			arg5 = 1;
			arg7 = arg7 + 3 & 0x3;
		}
		if (arg8 < Static217.anInt4735) {
			arg9 -= Static217.anInt4735 - arg8;
			arg8 = Static217.anInt4735;
		}
		if (arg5 == 11) {
			arg5 = 8;
			arg7 = arg7 + 3 & 0x3;
		}
		if (arg9 + arg8 > Static217.anInt4731) {
			arg9 = Static217.anInt4731 - arg8;
		}
		if (arg1 < Static217.anInt4734) {
			arg0 -= Static217.anInt4734 - arg1;
			arg1 = Static217.anInt4734;
		}
		if (Static217.anInt4730 < arg1 + arg0) {
			arg0 = Static217.anInt4730 - arg1;
		}
		@Pc(98) int local98 = Static217.anInt4732 - arg9;
		@Pc(104) int local104 = arg8 + arg1 * Static217.anInt4732;
		@Pc(113) int local113;
		@Pc(117) int local117;
		if (arg5 == 1) {
			if (arg7 == 0) {
				for (local113 = 0; local113 < arg0; local113++) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local113 >= local117) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 1) {
				for (local113 = arg0 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local113 >= local117) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 2) {
				for (local113 = 0; local113 < arg0; local113++) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local117 >= local113) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 3) {
				for (local113 = arg0 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local117 >= local113) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			}
		} else if (arg5 == 2) {
			if (arg7 == 0) {
				for (local113 = arg0 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local117 <= local113 >> 1) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 1) {
				for (local113 = 0; local113 < arg0; local113++) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local113 << 1 <= local117) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 2) {
				for (local113 = 0; local113 < arg0; local113++) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local117 <= local113 >> 1) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 3) {
				for (local113 = arg0 - 1; local113 >= 0; local113--) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local113 << 1 <= local117) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			}
		} else if (arg5 == 3) {
			if (arg7 == 0) {
				for (local113 = arg0 - 1; local113 >= 0; local113--) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local113 >> 1 >= local117) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 1) {
				for (local113 = arg0 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local117 >= local113 << 1) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 2) {
				for (local113 = 0; local113 < arg0; local113++) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local117 <= local113 >> 1) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 3) {
				for (local113 = 0; local113 < arg0; local113++) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local117 >= local113 << 1) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			}
		} else if (arg5 == 4) {
			if (arg7 == 0) {
				for (local113 = arg0 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local113 >> 1 <= local117) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 1) {
				for (local113 = 0; local113 < arg0; local113++) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local113 << 1 >= local117) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 2) {
				for (local113 = 0; local113 < arg0; local113++) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local113 >> 1 <= local117) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			} else if (arg7 == 3) {
				for (local113 = arg0 - 1; local113 >= 0; local113--) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local113 << 1 >= local117) {
							arg4[local104] = arg2;
						} else if (arg6) {
							arg4[local104] = arg3;
						}
						local104++;
					}
					local104 += local98;
				}
			}
		} else if (arg5 != 5) {
			if (arg5 == 6) {
				if (arg7 == 0) {
					for (local113 = 0; local113 < arg0; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (arg9 / 2 >= local117) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
				if (arg7 == 1) {
					for (local113 = 0; local113 < arg0; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (arg0 / 2 >= local113) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
				if (arg7 == 2) {
					for (local113 = 0; local113 < arg0; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (arg9 / 2 <= local117) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
				if (arg7 == 3) {
					for (local113 = 0; local113 < arg0; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (local113 >= arg0 / 2) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
			}
			if (arg5 == 7) {
				if (arg7 == 0) {
					for (local113 = 0; local113 < arg0; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (local113 - arg0 / 2 >= local117) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
				if (arg7 == 1) {
					for (local113 = arg0 - 1; local113 >= 0; local113--) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (local117 <= local113 - arg0 / 2) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
				if (arg7 == 2) {
					for (local113 = arg0 - 1; local113 >= 0; local113--) {
						for (local117 = arg9 - 1; local117 >= 0; local117--) {
							if (local113 - arg0 / 2 >= local117) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
				if (arg7 == 3) {
					for (local113 = 0; local113 < arg0; local113++) {
						for (local117 = arg9 - 1; local117 >= 0; local117--) {
							if (local117 <= local113 - arg0 / 2) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
			}
			if (arg5 == 8) {
				if (arg7 == 0) {
					for (local113 = 0; local113 < arg0; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (local117 >= local113 - arg0 / 2) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
				if (arg7 == 1) {
					for (local113 = arg0 - 1; local113 >= 0; local113--) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (local117 >= local113 - arg0 / 2) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
				if (arg7 == 2) {
					for (local113 = arg0 - 1; local113 >= 0; local113--) {
						for (local117 = arg9 - 1; local117 >= 0; local117--) {
							if (local117 >= local113 - arg0 / 2) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
				if (arg7 == 3) {
					for (local113 = 0; local113 < arg0; local113++) {
						for (local117 = arg9 - 1; local117 >= 0; local117--) {
							if (local113 - arg0 / 2 <= local117) {
								arg4[local104] = arg2;
							} else if (arg6) {
								arg4[local104] = arg3;
							}
							local104++;
						}
						local104 += local98;
					}
					return;
				}
			}
		} else if (arg7 == 0) {
			for (local113 = arg0 - 1; local113 >= 0; local113--) {
				for (local117 = arg9 - 1; local117 >= 0; local117--) {
					if (local117 >= local113 >> 1) {
						arg4[local104] = arg2;
					} else if (arg6) {
						arg4[local104] = arg3;
					}
					local104++;
				}
				local104 += local98;
			}
		} else if (arg7 == 1) {
			for (local113 = arg0 - 1; local113 >= 0; local113--) {
				for (local117 = 0; local117 < arg9; local117++) {
					if (local113 << 1 >= local117) {
						arg4[local104] = arg2;
					} else if (arg6) {
						arg4[local104] = arg3;
					}
					local104++;
				}
				local104 += local98;
			}
		} else if (arg7 == 2) {
			for (local113 = 0; local113 < arg0; local113++) {
				for (local117 = 0; local117 < arg9; local117++) {
					if (local113 >> 1 <= local117) {
						arg4[local104] = arg2;
					} else if (arg6) {
						arg4[local104] = arg3;
					}
					local104++;
				}
				local104 += local98;
			}
		} else if (arg7 == 3) {
			for (local113 = 0; local113 < arg0; local113++) {
				for (local117 = arg9 - 1; local117 >= 0; local117--) {
					if (local117 <= local113 << 1) {
						arg4[local104] = arg2;
					} else if (arg6) {
						arg4[local104] = arg3;
					}
					local104++;
				}
				local104 += local98;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public static void method676() {
		while (true) {
			@Pc(10) Class44 local10 = Static202.aClass44_57;
			@Pc(17) Class2_Sub16 local17;
			synchronized (Static202.aClass44_57) {
				local17 = (Class2_Sub16) Static84.aClass44_18.method1365();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass72_Sub1_13.method3203(local17.aByteArray22, local17.aClass88_1, false, (int) local17.aLong188);
		}
	}
}
