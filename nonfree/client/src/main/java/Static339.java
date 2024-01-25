import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
	public static int anInt5378;

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "Lclient!dda;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
	public static int anInt5386;

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
	public static int anInt5376 = 0;

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "F")
	public static float aFloat100 = 1024.0F;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
	public static int anInt5383 = -1;

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "[Lclient!nea;")
	public static final Class2_Sub2_Sub15[] aClass2_Sub2_Sub15Array77 = new Class2_Sub2_Sub15[14];

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)V")
	public static void method4572(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg0, 16);
		local8.method669();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I")
	public static int method4573(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!hg;)V")
	public static void method4575(@OriginalArg(1) Class13_Sub1_Sub1_Sub1 arg0) {
		@Pc(15) Class81 local15;
		if (arg0.anInt4553 != -1) {
			local15 = Static540.aClass173_2.method3791(arg0.anInt4553);
			if (local15 == null || local15.anIntArray149 == null) {
				arg0.anInt4553 = -1;
				arg0.aBoolean319 = false;
			} else {
				label357: {
					arg0.anInt4612++;
					if (local15.anIntArray149.length > arg0.anInt4628 && local15.anIntArray151[arg0.anInt4628] < arg0.anInt4612) {
						arg0.anInt4621++;
						arg0.anInt4628++;
						arg0.anInt4612 = 1;
						if (!arg0.aBoolean317) {
							Static589.method8022(arg0.anInt4628, local15, arg0);
						}
					}
					if (local15.anIntArray149.length <= arg0.anInt4628) {
						arg0.anInt4628 = 0;
						arg0.anInt4612 = 0;
						if (arg0.aBoolean319) {
							arg0.anInt4553 = arg0.method3964().method7500();
							if (arg0.anInt4553 == -1) {
								arg0.aBoolean319 = false;
								break label357;
							}
							local15 = Static540.aClass173_2.method3791(arg0.anInt4553);
						}
						if (!arg0.aBoolean317) {
							Static589.method8022(arg0.anInt4628, local15, arg0);
						}
					}
					arg0.anInt4621 = arg0.anInt4628 + 1;
					if (local15.anIntArray149 == null) {
						arg0.aBoolean319 = false;
						arg0.anInt4553 = -1;
					} else if (local15.anIntArray149.length <= arg0.anInt4621) {
						arg0.anInt4621 = 0;
					}
				}
			}
		}
		@Pc(186) int local186;
		@Pc(195) Class81 local195;
		@Pc(183) Class39 local183;
		if (arg0.anInt4556 != -1 && arg0.lb <= Static262.anInt5597) {
			local183 = Static460.aClass155_2.method3363(arg0.anInt4556);
			local186 = local183.anInt1044;
			if (local186 == -1) {
				arg0.anInt4556 = -1;
			} else {
				label358: {
					local195 = Static540.aClass173_2.method3791(local186);
					if (local183.aBoolean74) {
						if (local195.anInt2145 == 3) {
							if (arg0.anInt4637 > 0 && Static262.anInt5597 >= arg0.anInt4619 && Static262.anInt5597 > arg0.anInt4630) {
								arg0.anInt4556 = -1;
								break label358;
							}
						} else if (local195.anInt2145 == 1 && arg0.anInt4637 > 0 && Static262.anInt5597 >= arg0.anInt4619 && Static262.anInt5597 > arg0.anInt4630) {
							arg0.lb = Static262.anInt5597 + 1;
							break label358;
						}
					}
					if (local195 == null || local195.anIntArray149 == null) {
						arg0.anInt4556 = -1;
					} else {
						if (arg0.anInt4608 < 0) {
							arg0.anInt4608 = 0;
							if (!arg0.aBoolean317) {
								Static589.method8022(0, local195, arg0);
							}
						}
						arg0.anInt4629++;
						if (local195.anIntArray149.length > arg0.anInt4608 && local195.anIntArray151[arg0.anInt4608] < arg0.anInt4629) {
							arg0.anInt4608++;
							arg0.anInt4629 = 1;
							if (!arg0.aBoolean317) {
								Static589.method8022(arg0.anInt4608, local195, arg0);
							}
						}
						if (local195.anIntArray149.length <= arg0.anInt4608) {
							if (local183.aBoolean74) {
								arg0.anInt4610++;
								arg0.anInt4608 -= local195.anInt2150;
								if (arg0.anInt4610 >= local195.anInt2152) {
									arg0.anInt4556 = -1;
								} else if (arg0.anInt4608 < 0 || local195.anIntArray149.length <= arg0.anInt4608) {
									arg0.anInt4556 = -1;
								} else if (!arg0.aBoolean317) {
									Static589.method8022(arg0.anInt4608, local195, arg0);
								}
							} else {
								arg0.anInt4556 = -1;
							}
						}
						arg0.anInt4575 = arg0.anInt4608 + 1;
						if (local195.anIntArray149.length <= arg0.anInt4575) {
							if (local183.aBoolean74) {
								arg0.anInt4575 -= local195.anInt2150;
								if (arg0.anInt4610 + 1 >= local195.anInt2152) {
									arg0.anInt4575 = -1;
								} else if (arg0.anInt4575 < 0 || local195.anIntArray149.length <= arg0.anInt4575) {
									arg0.anInt4575 = -1;
								}
							} else {
								arg0.anInt4575 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4624 != -1 && arg0.anInt4627 <= Static262.anInt5597) {
			local183 = Static460.aClass155_2.method3363(arg0.anInt4624);
			local186 = local183.anInt1044;
			if (local186 == -1) {
				arg0.anInt4624 = -1;
			} else {
				label362: {
					local195 = Static540.aClass173_2.method3791(local186);
					if (local183.aBoolean74) {
						if (local195.anInt2145 == 3) {
							if (arg0.anInt4637 > 0 && Static262.anInt5597 >= arg0.anInt4619 && arg0.anInt4630 < Static262.anInt5597) {
								arg0.anInt4624 = -1;
								break label362;
							}
						} else if (local195.anInt2145 == 1 && arg0.anInt4637 > 0 && arg0.anInt4619 <= Static262.anInt5597 && Static262.anInt5597 > arg0.anInt4630) {
							arg0.anInt4627 = Static262.anInt5597 + 1;
							break label362;
						}
					}
					if (local195 == null || local195.anIntArray149 == null) {
						arg0.anInt4624 = -1;
					} else {
						if (arg0.anInt4592 < 0) {
							arg0.anInt4592 = 0;
							if (!arg0.aBoolean317) {
								Static589.method8022(0, local195, arg0);
							}
						}
						arg0.anInt4561++;
						if (arg0.anInt4592 < local195.anIntArray149.length && arg0.anInt4561 > local195.anIntArray151[arg0.anInt4592]) {
							arg0.anInt4561 = 1;
							arg0.anInt4592++;
							if (!arg0.aBoolean317) {
								Static589.method8022(arg0.anInt4592, local195, arg0);
							}
						}
						if (local195.anIntArray149.length <= arg0.anInt4592) {
							if (local183.aBoolean74) {
								arg0.anInt4617++;
								arg0.anInt4592 -= local195.anInt2150;
								if (arg0.anInt4617 >= local195.anInt2152) {
									arg0.anInt4624 = -1;
								} else if (arg0.anInt4592 < 0 || local195.anIntArray149.length <= arg0.anInt4592) {
									arg0.anInt4624 = -1;
								} else if (!arg0.aBoolean317) {
									Static589.method8022(arg0.anInt4592, local195, arg0);
								}
							} else {
								arg0.anInt4624 = -1;
							}
						}
						arg0.anInt4603 = arg0.anInt4592 + 1;
						if (local195.anIntArray149.length <= arg0.anInt4603) {
							if (local183.aBoolean74) {
								arg0.anInt4603 -= local195.anInt2150;
								if (local195.anInt2152 <= arg0.anInt4617 + 1) {
									arg0.anInt4603 = -1;
								} else if (arg0.anInt4603 < 0 || local195.anIntArray149.length <= arg0.anInt4603) {
									arg0.anInt4603 = -1;
								}
							} else {
								arg0.anInt4603 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4559 != -1 && arg0.anInt4622 <= 1) {
			local15 = Static540.aClass173_2.method3791(arg0.anInt4559);
			if (local15.anInt2145 == 3) {
				if (arg0.anInt4637 > 0 && arg0.anInt4619 <= Static262.anInt5597 && Static262.anInt5597 > arg0.anInt4630) {
					arg0.anInt4559 = -1;
					arg0.anIntArray300 = null;
				}
			} else if (local15.anInt2145 == 1 && arg0.anInt4637 > 0 && Static262.anInt5597 >= arg0.anInt4619 && Static262.anInt5597 > arg0.anInt4630) {
				arg0.anInt4622 = 2;
			}
		}
		if (arg0.anInt4559 != -1 && arg0.anInt4622 == 0) {
			local15 = Static540.aClass173_2.method3791(arg0.anInt4559);
			if (local15 == null || local15.anIntArray149 == null) {
				arg0.anInt4559 = -1;
				arg0.anIntArray300 = null;
			} else {
				arg0.anInt4564++;
				if (arg0.anInt4591 < local15.anIntArray149.length && arg0.anInt4564 > local15.anIntArray151[arg0.anInt4591]) {
					arg0.anInt4564 = 1;
					arg0.anInt4591++;
					if (!arg0.aBoolean317) {
						Static589.method8022(arg0.anInt4591, local15, arg0);
					}
				}
				if (arg0.anInt4591 >= local15.anIntArray149.length) {
					arg0.anInt4591 -= local15.anInt2150;
					arg0.anInt4567++;
					if (local15.anInt2152 <= arg0.anInt4567) {
						arg0.anIntArray300 = null;
						arg0.anInt4559 = -1;
					} else if (arg0.anInt4591 < 0 || arg0.anInt4591 >= local15.anIntArray149.length) {
						arg0.anInt4559 = -1;
						arg0.anIntArray300 = null;
					} else if (!arg0.aBoolean317) {
						Static589.method8022(arg0.anInt4591, local15, arg0);
					}
				}
				arg0.anInt4634 = arg0.anInt4591 + 1;
				if (arg0.anInt4634 >= local15.anIntArray149.length) {
					arg0.anInt4634 -= local15.anInt2150;
					if (arg0.anInt4567 + 1 >= local15.anInt2152) {
						arg0.anInt4634 = -1;
					} else if (arg0.anInt4634 < 0 || local15.anIntArray149.length <= arg0.anInt4634) {
						arg0.anInt4634 = -1;
					}
				}
			}
		}
		if (arg0.anInt4622 > 0) {
			arg0.anInt4622--;
		}
		for (@Pc(998) int local998 = 0; local998 < arg0.aClass250Array3.length; local998++) {
			@Pc(1005) Class250 local1005 = arg0.aClass250Array3[local998];
			if (local1005 != null) {
				if (local1005.anInt6332 > 0) {
					local1005.anInt6332--;
				} else {
					local195 = Static540.aClass173_2.method3791(local1005.anInt6333);
					if (local195 == null || local195.anIntArray149 == null) {
						arg0.aClass250Array3[local998] = null;
					} else {
						local1005.anInt6331++;
						if (local1005.anInt6330 < local195.anIntArray149.length && local195.anIntArray151[local1005.anInt6330] < local1005.anInt6331) {
							local1005.anInt6330++;
							local1005.anInt6331 = 1;
							if (!arg0.aBoolean317) {
								Static589.method8022(local1005.anInt6330, local195, arg0);
							}
						}
						if (local195.anIntArray149.length <= local1005.anInt6330) {
							local1005.anInt6329++;
							local1005.anInt6330 -= local195.anInt2150;
							if (local195.anInt2152 <= local1005.anInt6329) {
								arg0.aClass250Array3[local998] = null;
							} else if (local1005.anInt6330 < 0 || local1005.anInt6330 >= local195.anIntArray149.length) {
								arg0.aClass250Array3[local998] = null;
							} else if (!arg0.aBoolean317) {
								Static589.method8022(local1005.anInt6330, local195, arg0);
							}
						}
						local1005.anInt6334 = local1005.anInt6330 + 1;
						if (local1005.anInt6334 >= local195.anIntArray149.length) {
							local1005.anInt6334 -= local195.anInt2150;
							if (local1005.anInt6329 + 1 >= local195.anInt2152) {
								local1005.anInt6334 = -1;
							} else if (local1005.anInt6334 < 0 || local1005.anInt6334 >= local195.anIntArray149.length) {
								local1005.anInt6334 = -1;
							}
						}
					}
				}
			}
		}
	}
}
