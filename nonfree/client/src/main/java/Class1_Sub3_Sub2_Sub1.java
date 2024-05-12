import sign.signlink;

public class Class1_Sub3_Sub2_Sub1 extends Class1_Sub3_Sub2 {

	private static boolean aBoolean93;

	private static int anInt427 = 787;

	private static boolean aBoolean94;

	private static int anInt428 = 473;

	private static boolean aBoolean95 = true;

	public static boolean aBoolean96 = true;

	static boolean aBoolean97;

	static boolean aBoolean98;

	public static boolean aBoolean99 = true;

	public static int anInt429;

	public static int anInt430;

	public static int anInt431;

	public static int[] anIntArray135 = new int[512];

	public static int[] anIntArray136 = new int[2048];

	public static int[] anIntArray137 = new int[2048];

	public static int[] anIntArray138 = new int[2048];

	public static int[] anIntArray139;

	static int anInt432;

	public static Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array4;

	static boolean[] aBooleanArray4;

	static int[] anIntArray140;

	static int anInt433;

	static int[][] anIntArrayArray12;

	static int[][] anIntArrayArray13;

	public static int[] anIntArray141;

	public static int anInt434;

	public static int[] anIntArray142;

	static int[][] anIntArrayArray14;

	public static final void method287(boolean arg0) {
		try {
			anIntArray135 = null;
			anIntArray135 = null;
			anIntArray137 = null;
			anIntArray138 = null;
			anIntArray139 = null;
			aClass1_Sub3_Sub2_Sub3Array4 = null;
			aBooleanArray4 = null;
			anIntArray140 = null;
			if (!arg0) {
				aBoolean95 = !aBoolean95;
			}
			anIntArrayArray12 = null;
			anIntArrayArray13 = null;
			anIntArray141 = null;
			anIntArray142 = null;
			anIntArrayArray14 = null;
		} catch (RuntimeException var2) {
			signlink.reporterror("90248, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public static final void method288(int arg0) {
		try {
			label29: while (true) {
				int var1;
				if (arg0 >= 0) {
					var1 = 1;
					while (true) {
						if (var1 <= 0) {
							continue label29;
						}
						++var1;
					}
				}
				anIntArray139 = new int[Class1_Sub3_Sub2.anInt529];
				for (var1 = 0; var1 < Class1_Sub3_Sub2.anInt529; ++var1) {
					anIntArray139[var1] = Class1_Sub3_Sub2.anInt528 * var1;
				}
				anInt430 = Class1_Sub3_Sub2.anInt528 / 2;
				anInt431 = Class1_Sub3_Sub2.anInt529 / 2;
				return;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("37605, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public static final void method289(int arg0, int arg1, int arg2) {
		try {
			if (arg2 != 0) {
				aBoolean93 = !aBoolean93;
			}
			anIntArray139 = new int[arg0];
			for (int var3 = 0; var3 < arg0; ++var3) {
				anIntArray139[var3] = arg1 * var3;
			}
			anInt430 = arg1 / 2;
			anInt431 = arg0 / 2;
		} catch (RuntimeException var4) {
			signlink.reporterror("74604, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public static final void method290(boolean arg0) {
		try {
			if (!arg0) {
				anIntArrayArray12 = null;
				for (int var1 = 0; var1 < 50; ++var1) {
					anIntArrayArray13[var1] = null;
				}
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("98638, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public static final void method291(int arg0, int arg1) {
		try {
			label37: while (true) {
				int var2;
				if (arg1 >= 0) {
					var2 = 1;
					while (true) {
						if (var2 <= 0) {
							continue label37;
						}
						++var2;
					}
				}
				if (anIntArrayArray12 != null) {
					return;
				}
				anInt433 = arg0;
				if (aBoolean96) {
					anIntArrayArray12 = new int[anInt433][16384];
				} else {
					anIntArrayArray12 = new int[anInt433][65536];
				}
				for (var2 = 0; var2 < 50; ++var2) {
					anIntArrayArray13[var2] = null;
				}
				return;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("75782, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public static final void method292(byte arg0, Class39 arg1) {
		try {
			if (arg0 == 2) {
				anInt432 = 0;
				for (int var2 = 0; var2 < 50; ++var2) {
					try {
						aClass1_Sub3_Sub2_Sub3Array4[var2] = new Class1_Sub3_Sub2_Sub3(arg1, String.valueOf(var2), 0);
						if (aBoolean96 && aClass1_Sub3_Sub2_Sub3Array4[var2].anInt517 == 128) {
							aClass1_Sub3_Sub2_Sub3Array4[var2].method345(aBoolean94);
						} else {
							aClass1_Sub3_Sub2_Sub3Array4[var2].method346(0);
						}
						++anInt432;
					} catch (Exception var3) {
					}
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("24488, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public static final int method293(int arg0, int arg1) {
		try {
			int var9 = 25 / arg0;
			if (anIntArray140[arg1] != 0) {
				return anIntArray140[arg1];
			} else {
				int var2 = 0;
				int var3 = 0;
				int var4 = 0;
				int var5 = anIntArrayArray14[arg1].length;
				for (int var6 = 0; var6 < var5; ++var6) {
					var2 += anIntArrayArray14[arg1][var6] >> 16 & 255;
					var3 += anIntArrayArray14[arg1][var6] >> 8 & 255;
					var4 += anIntArrayArray14[arg1][var6] & 255;
				}
				int var7 = (var2 / var5 << 16) + (var3 / var5 << 8) + var4 / var5;
				var7 = method297(var7, 1.4D);
				if (var7 == 0) {
					var7 = 1;
				}
				anIntArray140[arg1] = var7;
				return var7;
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("77363, " + arg0 + ", " + arg1 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public static final void method294(int arg0, int arg1) {
		try {
			if (anIntArrayArray13[arg0] != null) {
				anIntArrayArray12[anInt433++] = anIntArrayArray13[arg0];
				int var4 = 11 / arg1;
				anIntArrayArray13[arg0] = null;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("15308, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public static final int[] method295(int arg0) {
		anIntArray141[arg0] = anInt434++;
		if (anIntArrayArray13[arg0] != null) {
			return anIntArrayArray13[arg0];
		} else {
			int[] var1;
			int var4;
			if (anInt433 > 0) {
				var1 = anIntArrayArray12[--anInt433];
				anIntArrayArray12[anInt433] = null;
			} else {
				int var2 = 0;
				int var3 = -1;
				for (var4 = 0; var4 < anInt432; ++var4) {
					if (anIntArrayArray13[var4] != null && (anIntArray141[var4] < var2 || var3 == -1)) {
						var2 = anIntArray141[var4];
						var3 = var4;
					}
				}
				var1 = anIntArrayArray13[var3];
				anIntArrayArray13[var3] = null;
			}
			anIntArrayArray13[arg0] = var1;
			Class1_Sub3_Sub2_Sub3 var6 = aClass1_Sub3_Sub2_Sub3Array4[arg0];
			int[] var7 = anIntArrayArray14[arg0];
			int var5;
			if (aBoolean96) {
				aBooleanArray4[arg0] = false;
				for (var4 = 0; var4 < 4096; ++var4) {
					var5 = var1[var4] = var7[var6.aByteArray6[var4]] & 16316671;
					if (var5 == 0) {
						aBooleanArray4[arg0] = true;
					}
					var1[4096 + var4] = var5 - (var5 >>> 3) & 16316671;
					var1[8192 + var4] = var5 - (var5 >>> 2) & 16316671;
					var1[12288 + var4] = var5 - (var5 >>> 2) - (var5 >>> 3) & 16316671;
				}
			} else {
				if (var6.anInt513 != 64) {
					for (var4 = 0; var4 < 16384; ++var4) {
						var1[var4] = var7[var6.aByteArray6[var4]];
					}
				} else {
					for (var4 = 0; var4 < 128; ++var4) {
						for (var5 = 0; var5 < 128; ++var5) {
							var1[var5 + (var4 << 7)] = var7[var6.aByteArray6[(var5 >> 1) + (var4 >> 1 << 6)]];
						}
					}
				}
				aBooleanArray4[arg0] = false;
				for (var4 = 0; var4 < 16384; ++var4) {
					var1[var4] &= 16316671;
					var5 = var1[var4];
					if (var5 == 0) {
						aBooleanArray4[arg0] = true;
					}
					var1[16384 + var4] = var5 - (var5 >>> 3) & 16316671;
					var1[32768 + var4] = var5 - (var5 >>> 2) & 16316671;
					var1[49152 + var4] = var5 - (var5 >>> 2) - (var5 >>> 3) & 16316671;
				}
			}
			return var1;
		}
	}

	public static final void method296(boolean arg0, double arg1) {
		try {
			double var29 = arg1 + (Math.random() * 0.03D - 0.015D);
			int var3 = 0;
			for (int var4 = 0; var4 < 512; ++var4) {
				double var5 = (double) (var4 / 8) / 64.0D + 0.0078125D;
				double var7 = (double) (var4 & 7) / 8.0D + 0.0625D;
				for (int var9 = 0; var9 < 128; ++var9) {
					double var10 = (double) var9 / 128.0D;
					double var12 = var10;
					double var14 = var10;
					double var16 = var10;
					if (var7 != 0.0D) {
						double var18;
						if (var10 < 0.5D) {
							var18 = var10 * (1.0D + var7);
						} else {
							var18 = var10 + var7 - var10 * var7;
						}
						double var20 = 2.0D * var10 - var18;
						double var22 = var5 + 0.3333333333333333D;
						if (var22 > 1.0D) {
							--var22;
						}
						double var26 = var5 - 0.3333333333333333D;
						if (var26 < 0.0D) {
							++var26;
						}
						if (6.0D * var22 < 1.0D) {
							var12 = var20 + (var18 - var20) * 6.0D * var22;
						} else if (2.0D * var22 < 1.0D) {
							var12 = var18;
						} else if (3.0D * var22 < 2.0D) {
							var12 = var20 + (var18 - var20) * (0.6666666666666666D - var22) * 6.0D;
						} else {
							var12 = var20;
						}
						if (6.0D * var5 < 1.0D) {
							var14 = var20 + (var18 - var20) * 6.0D * var5;
						} else if (2.0D * var5 < 1.0D) {
							var14 = var18;
						} else if (3.0D * var5 < 2.0D) {
							var14 = var20 + (var18 - var20) * (0.6666666666666666D - var5) * 6.0D;
						} else {
							var14 = var20;
						}
						if (6.0D * var26 < 1.0D) {
							var16 = var20 + (var18 - var20) * 6.0D * var26;
						} else if (2.0D * var26 < 1.0D) {
							var16 = var18;
						} else if (3.0D * var26 < 2.0D) {
							var16 = var20 + (var18 - var20) * (0.6666666666666666D - var26) * 6.0D;
						} else {
							var16 = var20;
						}
					}
					int var33 = (int) (var12 * 256.0D);
					int var19 = (int) (var14 * 256.0D);
					int var34 = (int) (var16 * 256.0D);
					int var21 = (var33 << 16) + (var19 << 8) + var34;
					int var35 = method297(var21, var29);
					anIntArray142[var3++] = var35;
				}
			}
			for (int var30 = 0; var30 < 50; ++var30) {
				if (aClass1_Sub3_Sub2_Sub3Array4[var30] != null) {
					int[] var6 = aClass1_Sub3_Sub2_Sub3Array4[var30].anIntArray177;
					anIntArrayArray14[var30] = new int[var6.length];
					for (int var32 = 0; var32 < var6.length; ++var32) {
						anIntArrayArray14[var30][var32] = method297(var6[var32], var29);
					}
				}
			}
			if (!arg0) {
				anInt428 = -352;
			}
			for (int var31 = 0; var31 < 50; ++var31) {
				method294(var31, 150);
			}
		} catch (RuntimeException var28) {
			signlink.reporterror("9701, " + arg0 + ", " + arg1 + ", " + var28.toString());
			throw new RuntimeException();
		}
	}

	public static int method297(int arg0, double arg1) {
		double var3 = (double) (arg0 >> 16) / 256.0D;
		double var5 = (double) (arg0 >> 8 & 255) / 256.0D;
		double var7 = (double) (arg0 & 255) / 256.0D;
		double var12 = Math.pow(var3, arg1);
		double var13 = Math.pow(var5, arg1);
		double var14 = Math.pow(var7, arg1);
		int var9 = (int) (var12 * 256.0D);
		int var10 = (int) (var13 * 256.0D);
		int var11 = (int) (var14 * 256.0D);
		return (var9 << 16) + (var10 << 8) + var11;
	}

	public static final void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = 0;
		int var10 = 0;
		if (arg1 != arg0) {
			var9 = (arg4 - arg3 << 16) / (arg1 - arg0);
			var10 = (arg7 - arg6 << 15) / (arg1 - arg0);
		}
		int var11 = 0;
		int var12 = 0;
		if (arg2 != arg1) {
			var11 = (arg5 - arg4 << 16) / (arg2 - arg1);
			var12 = (arg8 - arg7 << 15) / (arg2 - arg1);
		}
		int var13 = 0;
		int var14 = 0;
		if (arg2 != arg0) {
			var13 = (arg3 - arg5 << 16) / (arg0 - arg2);
			var14 = (arg6 - arg8 << 15) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Class1_Sub3_Sub2.anInt531) {
				if (arg1 > Class1_Sub3_Sub2.anInt531) {
					arg1 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg2 > Class1_Sub3_Sub2.anInt531) {
					arg2 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 16;
					arg8 = arg6 <<= 15;
					if (arg0 < 0) {
						arg5 -= var13 * arg0;
						arg3 -= var9 * arg0;
						arg8 -= var14 * arg0;
						arg6 -= var10 * arg0;
						arg0 = 0;
					}
					arg4 <<= 16;
					arg7 <<= 15;
					if (arg1 < 0) {
						arg4 -= var11 * arg1;
						arg7 -= var12 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && var13 < var9 || arg0 == arg1 && var13 > var11) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg1;
							if (arg1 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg0, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
									arg5 += var13;
									arg4 += var11;
									arg8 += var14;
									arg7 += var12;
									arg0 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg0, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
							arg5 += var13;
							arg3 += var9;
							arg8 += var14;
							arg6 += var10;
							arg0 += Class1_Sub3_Sub2.anInt528;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg1;
							if (arg1 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg0, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
									arg5 += var13;
									arg4 += var11;
									arg8 += var14;
									arg7 += var12;
									arg0 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg0, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
							arg5 += var13;
							arg3 += var9;
							arg8 += var14;
							arg6 += var10;
							arg0 += Class1_Sub3_Sub2.anInt528;
						}
					}
				} else {
					arg4 = arg3 <<= 16;
					arg7 = arg6 <<= 15;
					if (arg0 < 0) {
						arg4 -= var13 * arg0;
						arg3 -= var9 * arg0;
						arg7 -= var14 * arg0;
						arg6 -= var10 * arg0;
						arg0 = 0;
					}
					arg5 <<= 16;
					arg8 <<= 15;
					if (arg2 < 0) {
						arg5 -= var11 * arg2;
						arg8 -= var12 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && var13 < var9 || arg0 == arg2 && var11 > var9) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg1;
									if (arg1 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg0, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg5 += var11;
									arg3 += var9;
									arg8 += var12;
									arg6 += var10;
									arg0 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg0, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg4 += var13;
							arg3 += var9;
							arg7 += var14;
							arg6 += var10;
							arg0 += Class1_Sub3_Sub2.anInt528;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg1;
									if (arg1 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg0, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg5 += var11;
									arg3 += var9;
									arg8 += var12;
									arg6 += var10;
									arg0 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg0, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg4 += var13;
							arg3 += var9;
							arg7 += var14;
							arg6 += var10;
							arg0 += Class1_Sub3_Sub2.anInt528;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class1_Sub3_Sub2.anInt531) {
				if (arg2 > Class1_Sub3_Sub2.anInt531) {
					arg2 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg0 > Class1_Sub3_Sub2.anInt531) {
					arg0 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 16;
					arg6 = arg7 <<= 15;
					if (arg1 < 0) {
						arg3 -= var9 * arg1;
						arg4 -= var11 * arg1;
						arg6 -= var10 * arg1;
						arg7 -= var12 * arg1;
						arg1 = 0;
					}
					arg5 <<= 16;
					arg8 <<= 15;
					if (arg2 < 0) {
						arg5 -= var13 * arg2;
						arg8 -= var14 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && var9 < var11 || arg1 == arg2 && var9 > var13) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg0;
									if (arg0 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg1, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg3 += var9;
									arg5 += var13;
									arg6 += var10;
									arg8 += var14;
									arg1 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg1, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg3 += var9;
							arg4 += var11;
							arg6 += var10;
							arg7 += var12;
							arg1 += Class1_Sub3_Sub2.anInt528;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg0;
									if (arg0 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg1, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg3 += var9;
									arg5 += var13;
									arg6 += var10;
									arg8 += var14;
									arg1 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg1, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg3 += var9;
							arg4 += var11;
							arg6 += var10;
							arg7 += var12;
							arg1 += Class1_Sub3_Sub2.anInt528;
						}
					}
				} else {
					arg5 = arg4 <<= 16;
					arg8 = arg7 <<= 15;
					if (arg1 < 0) {
						arg5 -= var9 * arg1;
						arg4 -= var11 * arg1;
						arg8 -= var10 * arg1;
						arg7 -= var12 * arg1;
						arg1 = 0;
					}
					arg3 <<= 16;
					arg6 <<= 15;
					if (arg0 < 0) {
						arg3 -= var13 * arg0;
						arg6 -= var14 * arg0;
						arg0 = 0;
					}
					if (var9 < var11) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg0;
							if (arg0 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg1, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
									arg3 += var13;
									arg4 += var11;
									arg6 += var14;
									arg7 += var12;
									arg1 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg1, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
							arg5 += var9;
							arg4 += var11;
							arg8 += var10;
							arg7 += var12;
							arg1 += Class1_Sub3_Sub2.anInt528;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg0;
							if (arg0 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg1, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
									arg3 += var13;
									arg4 += var11;
									arg6 += var14;
									arg7 += var12;
									arg1 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg1, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
							arg5 += var9;
							arg4 += var11;
							arg8 += var10;
							arg7 += var12;
							arg1 += Class1_Sub3_Sub2.anInt528;
						}
					}
				}
			}
		} else if (arg2 < Class1_Sub3_Sub2.anInt531) {
			if (arg0 > Class1_Sub3_Sub2.anInt531) {
				arg0 = Class1_Sub3_Sub2.anInt531;
			}
			if (arg1 > Class1_Sub3_Sub2.anInt531) {
				arg1 = Class1_Sub3_Sub2.anInt531;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 16;
				arg7 = arg8 <<= 15;
				if (arg2 < 0) {
					arg4 -= var11 * arg2;
					arg5 -= var13 * arg2;
					arg7 -= var12 * arg2;
					arg8 -= var14 * arg2;
					arg2 = 0;
				}
				arg3 <<= 16;
				arg6 <<= 15;
				if (arg0 < 0) {
					arg3 -= var9 * arg0;
					arg6 -= var10 * arg0;
					arg0 = 0;
				}
				if (var11 < var13) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg0;
						if (arg0 < 0) {
							while (true) {
								--arg1;
								if (arg1 < 0) {
									return;
								}
								method299(Class1_Sub3_Sub2.anIntArray178, arg2, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
								arg4 += var11;
								arg3 += var9;
								arg7 += var12;
								arg6 += var10;
								arg2 += Class1_Sub3_Sub2.anInt528;
							}
						}
						method299(Class1_Sub3_Sub2.anIntArray178, arg2, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += var11;
						arg5 += var13;
						arg7 += var12;
						arg8 += var14;
						arg2 += Class1_Sub3_Sub2.anInt528;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg0;
						if (arg0 < 0) {
							while (true) {
								--arg1;
								if (arg1 < 0) {
									return;
								}
								method299(Class1_Sub3_Sub2.anIntArray178, arg2, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
								arg4 += var11;
								arg3 += var9;
								arg7 += var12;
								arg6 += var10;
								arg2 += Class1_Sub3_Sub2.anInt528;
							}
						}
						method299(Class1_Sub3_Sub2.anIntArray178, arg2, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += var11;
						arg5 += var13;
						arg7 += var12;
						arg8 += var14;
						arg2 += Class1_Sub3_Sub2.anInt528;
					}
				}
			} else {
				arg3 = arg5 <<= 16;
				arg6 = arg8 <<= 15;
				if (arg2 < 0) {
					arg3 -= var11 * arg2;
					arg5 -= var13 * arg2;
					arg6 -= var12 * arg2;
					arg8 -= var14 * arg2;
					arg2 = 0;
				}
				arg4 <<= 16;
				arg7 <<= 15;
				if (arg1 < 0) {
					arg4 -= var9 * arg1;
					arg7 -= var10 * arg1;
					arg1 = 0;
				}
				if (var11 < var13) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg1;
						if (arg1 < 0) {
							while (true) {
								--arg0;
								if (arg0 < 0) {
									return;
								}
								method299(Class1_Sub3_Sub2.anIntArray178, arg2, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
								arg4 += var9;
								arg5 += var13;
								arg7 += var10;
								arg8 += var14;
								arg2 += Class1_Sub3_Sub2.anInt528;
							}
						}
						method299(Class1_Sub3_Sub2.anIntArray178, arg2, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
						arg3 += var11;
						arg5 += var13;
						arg6 += var12;
						arg8 += var14;
						arg2 += Class1_Sub3_Sub2.anInt528;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg1;
						if (arg1 < 0) {
							while (true) {
								--arg0;
								if (arg0 < 0) {
									return;
								}
								method299(Class1_Sub3_Sub2.anIntArray178, arg2, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
								arg4 += var9;
								arg5 += var13;
								arg7 += var10;
								arg8 += var14;
								arg2 += Class1_Sub3_Sub2.anInt528;
							}
						}
						method299(Class1_Sub3_Sub2.anIntArray178, arg2, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
						arg3 += var11;
						arg5 += var13;
						arg6 += var12;
						arg8 += var14;
						arg2 += Class1_Sub3_Sub2.anInt528;
					}
				}
			}
		}
	}

	public static final void method299(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8;
		int var9;
		int var10;
		int var11;
		int var17;
		if (aBoolean99) {
			if (aBoolean97) {
				if (arg5 - arg4 > 3) {
					var8 = (arg7 - arg6) / (arg5 - arg4);
				} else {
					var8 = 0;
				}
				if (arg5 > Class1_Sub3_Sub2.anInt534) {
					arg5 = Class1_Sub3_Sub2.anInt534;
				}
				if (arg4 < 0) {
					arg6 -= arg4 * var8;
					arg4 = 0;
				}
				if (arg4 >= arg5) {
					return;
				}
				arg1 += arg4;
				arg3 = arg5 - arg4 >> 2;
				var8 <<= 2;
			} else {
				if (arg4 >= arg5) {
					return;
				}
				arg1 += arg4;
				arg3 = arg5 - arg4 >> 2;
				if (arg3 > 0) {
					var8 = (arg7 - arg6) * anIntArray135[arg3] >> 15;
				} else {
					var8 = 0;
				}
			}
			int var13;
			if (anInt429 != 0) {
				var9 = anInt429;
				var10 = 256 - anInt429;
				while (true) {
					--arg3;
					if (arg3 < 0) {
						var17 = arg5 - arg4 & 3;
						if (var17 > 0) {
							var11 = anIntArray142[arg6 >> 8];
							var11 = ((var11 & 16711935) * var10 >> 8 & 16711935) + ((var11 & 65280) * var10 >> 8 & 65280);
							do {
								arg0[arg1++] = var11 + ((arg0[arg1] & 16711935) * var9 >> 8 & 16711935) + ((arg0[arg1] & 65280) * var9 >> 8 & 65280);
								--var17;
							} while (var17 > 0);
						}
						break;
					}
					var11 = anIntArray142[arg6 >> 8];
					arg6 += var8;
					var11 = ((var11 & 16711935) * var10 >> 8 & 16711935) + ((var11 & 65280) * var10 >> 8 & 65280);
					var13 = arg1 + 1;
					arg0[arg1] = var11 + ((arg0[var13] & 16711935) * var9 >> 8 & 16711935) + ((arg0[var13] & 65280) * var9 >> 8 & 65280);
					arg0[var13++] = var11 + ((arg0[var13] & 16711935) * var9 >> 8 & 16711935) + ((arg0[var13] & 65280) * var9 >> 8 & 65280);
					arg0[var13++] = var11 + ((arg0[var13] & 16711935) * var9 >> 8 & 16711935) + ((arg0[var13] & 65280) * var9 >> 8 & 65280);
					arg1 = var13 + 1;
					arg0[var13] = var11 + ((arg0[arg1] & 16711935) * var9 >> 8 & 16711935) + ((arg0[arg1] & 65280) * var9 >> 8 & 65280);
				}
			} else {
				while (true) {
					--arg3;
					if (arg3 < 0) {
						var17 = arg5 - arg4 & 3;
						if (var17 > 0) {
							var11 = anIntArray142[arg6 >> 8];
							do {
								arg0[arg1++] = var11;
								--var17;
							} while (var17 > 0);
							return;
						}
						break;
					}
					var11 = anIntArray142[arg6 >> 8];
					arg6 += var8;
					var13 = arg1 + 1;
					arg0[arg1] = var11;
					int var14 = var13 + 1;
					arg0[var13] = var11;
					int var15 = var14 + 1;
					arg0[var14] = var11;
					arg1 = var15 + 1;
					arg0[var15] = var11;
				}
			}
		} else if (arg4 < arg5) {
			var8 = (arg7 - arg6) / (arg5 - arg4);
			if (aBoolean97) {
				if (arg5 > Class1_Sub3_Sub2.anInt534) {
					arg5 = Class1_Sub3_Sub2.anInt534;
				}
				if (arg4 < 0) {
					arg6 -= arg4 * var8;
					arg4 = 0;
				}
				if (arg4 >= arg5) {
					return;
				}
			}
			int var16 = arg1 + arg4;
			var17 = arg5 - arg4;
			if (anInt429 == 0) {
				do {
					arg0[var16++] = anIntArray142[arg6 >> 8];
					arg6 += var8;
					--var17;
				} while (var17 > 0);
			} else {
				var9 = anInt429;
				var10 = 256 - anInt429;
				do {
					var11 = anIntArray142[arg6 >> 8];
					arg6 += var8;
					int var12 = ((var11 & 16711935) * var10 >> 8 & 16711935) + ((var11 & 65280) * var10 >> 8 & 65280);
					arg0[var16++] = var12 + ((arg0[var16] & 16711935) * var9 >> 8 & 16711935) + ((arg0[var16] & 65280) * var9 >> 8 & 65280);
					--var17;
				} while (var17 > 0);
			}
		}
	}

	public static final void method300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		if (arg1 != arg0) {
			var7 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		int var8 = 0;
		if (arg2 != arg1) {
			var8 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		int var9 = 0;
		if (arg2 != arg0) {
			var9 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Class1_Sub3_Sub2.anInt531) {
				if (arg1 > Class1_Sub3_Sub2.anInt531) {
					arg1 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg2 > Class1_Sub3_Sub2.anInt531) {
					arg2 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 16;
					if (arg0 < 0) {
						arg5 -= var9 * arg0;
						arg3 -= var7 * arg0;
						arg0 = 0;
					}
					arg4 <<= 16;
					if (arg1 < 0) {
						arg4 -= var8 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && var9 < var7 || arg0 == arg1 && var9 > var8) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg1;
							if (arg1 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, 0, arg5 >> 16, arg4 >> 16);
									arg5 += var9;
									arg4 += var8;
									arg0 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, 0, arg5 >> 16, arg3 >> 16);
							arg5 += var9;
							arg3 += var7;
							arg0 += Class1_Sub3_Sub2.anInt528;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg1;
							if (arg1 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, 0, arg4 >> 16, arg5 >> 16);
									arg5 += var9;
									arg4 += var8;
									arg0 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, 0, arg3 >> 16, arg5 >> 16);
							arg5 += var9;
							arg3 += var7;
							arg0 += Class1_Sub3_Sub2.anInt528;
						}
					}
				} else {
					arg4 = arg3 <<= 16;
					if (arg0 < 0) {
						arg4 -= var9 * arg0;
						arg3 -= var7 * arg0;
						arg0 = 0;
					}
					arg5 <<= 16;
					if (arg2 < 0) {
						arg5 -= var8 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && var9 < var7 || arg0 == arg2 && var8 > var7) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg1;
									if (arg1 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, 0, arg5 >> 16, arg3 >> 16);
									arg5 += var8;
									arg3 += var7;
									arg0 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, 0, arg4 >> 16, arg3 >> 16);
							arg4 += var9;
							arg3 += var7;
							arg0 += Class1_Sub3_Sub2.anInt528;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg1;
									if (arg1 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, 0, arg3 >> 16, arg5 >> 16);
									arg5 += var8;
									arg3 += var7;
									arg0 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, 0, arg3 >> 16, arg4 >> 16);
							arg4 += var9;
							arg3 += var7;
							arg0 += Class1_Sub3_Sub2.anInt528;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class1_Sub3_Sub2.anInt531) {
				if (arg2 > Class1_Sub3_Sub2.anInt531) {
					arg2 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg0 > Class1_Sub3_Sub2.anInt531) {
					arg0 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 16;
					if (arg1 < 0) {
						arg3 -= var7 * arg1;
						arg4 -= var8 * arg1;
						arg1 = 0;
					}
					arg5 <<= 16;
					if (arg2 < 0) {
						arg5 -= var9 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && var7 < var8 || arg1 == arg2 && var7 > var9) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg0;
									if (arg0 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, 0, arg3 >> 16, arg5 >> 16);
									arg3 += var7;
									arg5 += var9;
									arg1 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, 0, arg3 >> 16, arg4 >> 16);
							arg3 += var7;
							arg4 += var8;
							arg1 += Class1_Sub3_Sub2.anInt528;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg0;
									if (arg0 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, 0, arg5 >> 16, arg3 >> 16);
									arg3 += var7;
									arg5 += var9;
									arg1 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, 0, arg4 >> 16, arg3 >> 16);
							arg3 += var7;
							arg4 += var8;
							arg1 += Class1_Sub3_Sub2.anInt528;
						}
					}
				} else {
					arg5 = arg4 <<= 16;
					if (arg1 < 0) {
						arg5 -= var7 * arg1;
						arg4 -= var8 * arg1;
						arg1 = 0;
					}
					arg3 <<= 16;
					if (arg0 < 0) {
						arg3 -= var9 * arg0;
						arg0 = 0;
					}
					if (var7 < var8) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg0;
							if (arg0 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, 0, arg3 >> 16, arg4 >> 16);
									arg3 += var9;
									arg4 += var8;
									arg1 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, 0, arg5 >> 16, arg4 >> 16);
							arg5 += var7;
							arg4 += var8;
							arg1 += Class1_Sub3_Sub2.anInt528;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg0;
							if (arg0 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, 0, arg4 >> 16, arg3 >> 16);
									arg3 += var9;
									arg4 += var8;
									arg1 += Class1_Sub3_Sub2.anInt528;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, 0, arg4 >> 16, arg5 >> 16);
							arg5 += var7;
							arg4 += var8;
							arg1 += Class1_Sub3_Sub2.anInt528;
						}
					}
				}
			}
		} else if (arg2 < Class1_Sub3_Sub2.anInt531) {
			if (arg0 > Class1_Sub3_Sub2.anInt531) {
				arg0 = Class1_Sub3_Sub2.anInt531;
			}
			if (arg1 > Class1_Sub3_Sub2.anInt531) {
				arg1 = Class1_Sub3_Sub2.anInt531;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 16;
				if (arg2 < 0) {
					arg4 -= var8 * arg2;
					arg5 -= var9 * arg2;
					arg2 = 0;
				}
				arg3 <<= 16;
				if (arg0 < 0) {
					arg3 -= var7 * arg0;
					arg0 = 0;
				}
				if (var8 < var9) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg0;
						if (arg0 < 0) {
							while (true) {
								--arg1;
								if (arg1 < 0) {
									return;
								}
								method301(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, 0, arg4 >> 16, arg3 >> 16);
								arg4 += var8;
								arg3 += var7;
								arg2 += Class1_Sub3_Sub2.anInt528;
							}
						}
						method301(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, 0, arg4 >> 16, arg5 >> 16);
						arg4 += var8;
						arg5 += var9;
						arg2 += Class1_Sub3_Sub2.anInt528;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg0;
						if (arg0 < 0) {
							while (true) {
								--arg1;
								if (arg1 < 0) {
									return;
								}
								method301(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, 0, arg3 >> 16, arg4 >> 16);
								arg4 += var8;
								arg3 += var7;
								arg2 += Class1_Sub3_Sub2.anInt528;
							}
						}
						method301(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, 0, arg5 >> 16, arg4 >> 16);
						arg4 += var8;
						arg5 += var9;
						arg2 += Class1_Sub3_Sub2.anInt528;
					}
				}
			} else {
				arg3 = arg5 <<= 16;
				if (arg2 < 0) {
					arg3 -= var8 * arg2;
					arg5 -= var9 * arg2;
					arg2 = 0;
				}
				arg4 <<= 16;
				if (arg1 < 0) {
					arg4 -= var7 * arg1;
					arg1 = 0;
				}
				if (var8 < var9) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg1;
						if (arg1 < 0) {
							while (true) {
								--arg0;
								if (arg0 < 0) {
									return;
								}
								method301(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, 0, arg4 >> 16, arg5 >> 16);
								arg4 += var7;
								arg5 += var9;
								arg2 += Class1_Sub3_Sub2.anInt528;
							}
						}
						method301(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, 0, arg3 >> 16, arg5 >> 16);
						arg3 += var8;
						arg5 += var9;
						arg2 += Class1_Sub3_Sub2.anInt528;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg1;
						if (arg1 < 0) {
							while (true) {
								--arg0;
								if (arg0 < 0) {
									return;
								}
								method301(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, 0, arg5 >> 16, arg4 >> 16);
								arg4 += var7;
								arg5 += var9;
								arg2 += Class1_Sub3_Sub2.anInt528;
							}
						}
						method301(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, 0, arg5 >> 16, arg3 >> 16);
						arg3 += var8;
						arg5 += var9;
						arg2 += Class1_Sub3_Sub2.anInt528;
					}
				}
			}
		}
	}

	public static final void method301(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (aBoolean97) {
			if (arg5 > Class1_Sub3_Sub2.anInt534) {
				arg5 = Class1_Sub3_Sub2.anInt534;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 < arg5) {
			arg1 += arg4;
			int var15 = arg5 - arg4 >> 2;
			int var8;
			if (anInt429 == 0) {
				while (true) {
					--var15;
					if (var15 < 0) {
						var15 = arg5 - arg4 & 3;
						while (true) {
							--var15;
							if (var15 < 0) {
								return;
							}
							arg0[arg1++] = arg2;
						}
					}
					var8 = arg1 + 1;
					arg0[arg1] = arg2;
					arg0[var8++] = arg2;
					arg0[var8++] = arg2;
					arg1 = var8 + 1;
					arg0[var8] = arg2;
				}
			} else {
				int var6 = anInt429;
				int var7 = 256 - anInt429;
				int var10 = ((arg2 & 16711935) * var7 >> 8 & 16711935) + ((arg2 & 65280) * var7 >> 8 & 65280);
				while (true) {
					--var15;
					if (var15 < 0) {
						var15 = arg5 - arg4 & 3;
						while (true) {
							--var15;
							if (var15 < 0) {
								return;
							}
							arg0[arg1++] = var10 + ((arg0[arg1] & 16711935) * var6 >> 8 & 16711935) + ((arg0[arg1] & 65280) * var6 >> 8 & 65280);
						}
					}
					var8 = arg1 + 1;
					arg0[arg1] = var10 + ((arg0[var8] & 16711935) * var6 >> 8 & 16711935) + ((arg0[var8] & 65280) * var6 >> 8 & 65280);
					int var9 = var8 + 1;
					arg0[var8] = var10 + ((arg0[var9] & 16711935) * var6 >> 8 & 16711935) + ((arg0[var9] & 65280) * var6 >> 8 & 65280);
					int var11 = var9 + 1;
					arg0[var9] = var10 + ((arg0[var11] & 16711935) * var6 >> 8 & 16711935) + ((arg0[var11] & 65280) * var6 >> 8 & 65280);
					arg1 = var11 + 1;
					arg0[var11] = var10 + ((arg0[arg1] & 16711935) * var6 >> 8 & 16711935) + ((arg0[arg1] & 65280) * var6 >> 8 & 65280);
				}
			}
		}
	}

	public static final void method302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		int[] var19 = method295(arg18);
		aBoolean98 = !aBooleanArray4[arg18];
		int var36 = arg9 - arg10;
		int var38 = arg12 - arg13;
		int var40 = arg15 - arg16;
		int var37 = arg11 - arg9;
		int var39 = arg14 - arg12;
		int var41 = arg17 - arg15;
		int var20 = var37 * arg12 - var39 * arg9 << 14;
		int var21 = var39 * arg15 - var41 * arg12 << 8;
		int var22 = var41 * arg9 - var37 * arg15 << 5;
		int var23 = var36 * arg12 - var38 * arg9 << 14;
		int var24 = var38 * arg15 - var40 * arg12 << 8;
		int var25 = var40 * arg9 - var36 * arg15 << 5;
		int var26 = var38 * var37 - var36 * var39 << 14;
		int var27 = var40 * var39 - var38 * var41 << 8;
		int var28 = var36 * var41 - var40 * var37 << 5;
		int var29 = 0;
		int var30 = 0;
		if (arg1 != arg0) {
			var29 = (arg4 - arg3 << 16) / (arg1 - arg0);
			var30 = (arg7 - arg6 << 16) / (arg1 - arg0);
		}
		int var31 = 0;
		int var32 = 0;
		if (arg2 != arg1) {
			var31 = (arg5 - arg4 << 16) / (arg2 - arg1);
			var32 = (arg8 - arg7 << 16) / (arg2 - arg1);
		}
		int var33 = 0;
		int var34 = 0;
		if (arg2 != arg0) {
			var33 = (arg3 - arg5 << 16) / (arg0 - arg2);
			var34 = (arg6 - arg8 << 16) / (arg0 - arg2);
		}
		int var35;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Class1_Sub3_Sub2.anInt531) {
				if (arg1 > Class1_Sub3_Sub2.anInt531) {
					arg1 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg2 > Class1_Sub3_Sub2.anInt531) {
					arg2 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 16;
					arg8 = arg6 <<= 16;
					if (arg0 < 0) {
						arg5 -= var33 * arg0;
						arg3 -= var29 * arg0;
						arg8 -= var34 * arg0;
						arg6 -= var30 * arg0;
						arg0 = 0;
					}
					arg4 <<= 16;
					arg7 <<= 16;
					if (arg1 < 0) {
						arg4 -= var31 * arg1;
						arg7 -= var32 * arg1;
						arg1 = 0;
					}
					var35 = arg0 - anInt431;
					var20 += var22 * var35;
					var23 += var25 * var35;
					var26 += var28 * var35;
					if (arg0 != arg1 && var33 < var29 || arg0 == arg1 && var33 > var31) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg1;
							if (arg1 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
									arg5 += var33;
									arg4 += var31;
									arg8 += var34;
									arg7 += var32;
									arg0 += Class1_Sub3_Sub2.anInt528;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}
							method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
							arg5 += var33;
							arg3 += var29;
							arg8 += var34;
							arg6 += var30;
							arg0 += Class1_Sub3_Sub2.anInt528;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg1;
							if (arg1 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
									arg5 += var33;
									arg4 += var31;
									arg8 += var34;
									arg7 += var32;
									arg0 += Class1_Sub3_Sub2.anInt528;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}
							method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
							arg5 += var33;
							arg3 += var29;
							arg8 += var34;
							arg6 += var30;
							arg0 += Class1_Sub3_Sub2.anInt528;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				} else {
					arg4 = arg3 <<= 16;
					arg7 = arg6 <<= 16;
					if (arg0 < 0) {
						arg4 -= var33 * arg0;
						arg3 -= var29 * arg0;
						arg7 -= var34 * arg0;
						arg6 -= var30 * arg0;
						arg0 = 0;
					}
					arg5 <<= 16;
					arg8 <<= 16;
					if (arg2 < 0) {
						arg5 -= var31 * arg2;
						arg8 -= var32 * arg2;
						arg2 = 0;
					}
					var35 = arg0 - anInt431;
					var20 += var22 * var35;
					var23 += var25 * var35;
					var26 += var28 * var35;
					if ((arg0 == arg2 || var33 >= var29) && (arg0 != arg2 || var31 <= var29)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg1;
									if (arg1 < 0) {
										return;
									}
									method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
									arg5 += var31;
									arg3 += var29;
									arg8 += var32;
									arg6 += var30;
									arg0 += Class1_Sub3_Sub2.anInt528;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}
							method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
							arg4 += var33;
							arg3 += var29;
							arg7 += var34;
							arg6 += var30;
							arg0 += Class1_Sub3_Sub2.anInt528;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg1;
									if (arg1 < 0) {
										return;
									}
									method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
									arg5 += var31;
									arg3 += var29;
									arg8 += var32;
									arg6 += var30;
									arg0 += Class1_Sub3_Sub2.anInt528;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}
							method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
							arg4 += var33;
							arg3 += var29;
							arg7 += var34;
							arg6 += var30;
							arg0 += Class1_Sub3_Sub2.anInt528;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class1_Sub3_Sub2.anInt531) {
				if (arg2 > Class1_Sub3_Sub2.anInt531) {
					arg2 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg0 > Class1_Sub3_Sub2.anInt531) {
					arg0 = Class1_Sub3_Sub2.anInt531;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 16;
					arg6 = arg7 <<= 16;
					if (arg1 < 0) {
						arg3 -= var29 * arg1;
						arg4 -= var31 * arg1;
						arg6 -= var30 * arg1;
						arg7 -= var32 * arg1;
						arg1 = 0;
					}
					arg5 <<= 16;
					arg8 <<= 16;
					if (arg2 < 0) {
						arg5 -= var33 * arg2;
						arg8 -= var34 * arg2;
						arg2 = 0;
					}
					var35 = arg1 - anInt431;
					var20 += var22 * var35;
					var23 += var25 * var35;
					var26 += var28 * var35;
					if (arg1 != arg2 && var29 < var31 || arg1 == arg2 && var29 > var33) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg0;
									if (arg0 < 0) {
										return;
									}
									method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
									arg3 += var29;
									arg5 += var33;
									arg6 += var30;
									arg8 += var34;
									arg1 += Class1_Sub3_Sub2.anInt528;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}
							method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
							arg3 += var29;
							arg4 += var31;
							arg6 += var30;
							arg7 += var32;
							arg1 += Class1_Sub3_Sub2.anInt528;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg2;
							if (arg2 < 0) {
								while (true) {
									--arg0;
									if (arg0 < 0) {
										return;
									}
									method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
									arg3 += var29;
									arg5 += var33;
									arg6 += var30;
									arg8 += var34;
									arg1 += Class1_Sub3_Sub2.anInt528;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}
							method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
							arg3 += var29;
							arg4 += var31;
							arg6 += var30;
							arg7 += var32;
							arg1 += Class1_Sub3_Sub2.anInt528;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				} else {
					arg5 = arg4 <<= 16;
					arg8 = arg7 <<= 16;
					if (arg1 < 0) {
						arg5 -= var29 * arg1;
						arg4 -= var31 * arg1;
						arg8 -= var30 * arg1;
						arg7 -= var32 * arg1;
						arg1 = 0;
					}
					arg3 <<= 16;
					arg6 <<= 16;
					if (arg0 < 0) {
						arg3 -= var33 * arg0;
						arg6 -= var34 * arg0;
						arg0 = 0;
					}
					var35 = arg1 - anInt431;
					var20 += var22 * var35;
					var23 += var25 * var35;
					var26 += var28 * var35;
					if (var29 < var31) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg0;
							if (arg0 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
									arg3 += var33;
									arg4 += var31;
									arg6 += var34;
									arg7 += var32;
									arg1 += Class1_Sub3_Sub2.anInt528;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}
							method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
							arg5 += var29;
							arg4 += var31;
							arg8 += var30;
							arg7 += var32;
							arg1 += Class1_Sub3_Sub2.anInt528;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							--arg0;
							if (arg0 < 0) {
								while (true) {
									--arg2;
									if (arg2 < 0) {
										return;
									}
									method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
									arg3 += var33;
									arg4 += var31;
									arg6 += var34;
									arg7 += var32;
									arg1 += Class1_Sub3_Sub2.anInt528;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}
							method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
							arg5 += var29;
							arg4 += var31;
							arg8 += var30;
							arg7 += var32;
							arg1 += Class1_Sub3_Sub2.anInt528;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				}
			}
		} else if (arg2 < Class1_Sub3_Sub2.anInt531) {
			if (arg0 > Class1_Sub3_Sub2.anInt531) {
				arg0 = Class1_Sub3_Sub2.anInt531;
			}
			if (arg1 > Class1_Sub3_Sub2.anInt531) {
				arg1 = Class1_Sub3_Sub2.anInt531;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 16;
				arg7 = arg8 <<= 16;
				if (arg2 < 0) {
					arg4 -= var31 * arg2;
					arg5 -= var33 * arg2;
					arg7 -= var32 * arg2;
					arg8 -= var34 * arg2;
					arg2 = 0;
				}
				arg3 <<= 16;
				arg6 <<= 16;
				if (arg0 < 0) {
					arg3 -= var29 * arg0;
					arg6 -= var30 * arg0;
					arg0 = 0;
				}
				var35 = arg2 - anInt431;
				var20 += var22 * var35;
				var23 += var25 * var35;
				var26 += var28 * var35;
				if (var31 < var33) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg0;
						if (arg0 < 0) {
							while (true) {
								--arg1;
								if (arg1 < 0) {
									return;
								}
								method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
								arg4 += var31;
								arg3 += var29;
								arg7 += var32;
								arg6 += var30;
								arg2 += Class1_Sub3_Sub2.anInt528;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}
						method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
						arg4 += var31;
						arg5 += var33;
						arg7 += var32;
						arg8 += var34;
						arg2 += Class1_Sub3_Sub2.anInt528;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg0;
						if (arg0 < 0) {
							while (true) {
								--arg1;
								if (arg1 < 0) {
									return;
								}
								method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
								arg4 += var31;
								arg3 += var29;
								arg7 += var32;
								arg6 += var30;
								arg2 += Class1_Sub3_Sub2.anInt528;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}
						method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
						arg4 += var31;
						arg5 += var33;
						arg7 += var32;
						arg8 += var34;
						arg2 += Class1_Sub3_Sub2.anInt528;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				}
			} else {
				arg3 = arg5 <<= 16;
				arg6 = arg8 <<= 16;
				if (arg2 < 0) {
					arg3 -= var31 * arg2;
					arg5 -= var33 * arg2;
					arg6 -= var32 * arg2;
					arg8 -= var34 * arg2;
					arg2 = 0;
				}
				arg4 <<= 16;
				arg7 <<= 16;
				if (arg1 < 0) {
					arg4 -= var29 * arg1;
					arg7 -= var30 * arg1;
					arg1 = 0;
				}
				var35 = arg2 - anInt431;
				var20 += var22 * var35;
				var23 += var25 * var35;
				var26 += var28 * var35;
				if (var31 < var33) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg1;
						if (arg1 < 0) {
							while (true) {
								--arg0;
								if (arg0 < 0) {
									return;
								}
								method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
								arg4 += var29;
								arg5 += var33;
								arg7 += var30;
								arg8 += var34;
								arg2 += Class1_Sub3_Sub2.anInt528;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}
						method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
						arg3 += var31;
						arg5 += var33;
						arg6 += var32;
						arg8 += var34;
						arg2 += Class1_Sub3_Sub2.anInt528;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						--arg1;
						if (arg1 < 0) {
							while (true) {
								--arg0;
								if (arg0 < 0) {
									return;
								}
								method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
								arg4 += var29;
								arg5 += var33;
								arg7 += var30;
								arg8 += var34;
								arg2 += Class1_Sub3_Sub2.anInt528;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}
						method303(Class1_Sub3_Sub2.anIntArray178, var19, 0, 0, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
						arg3 += var31;
						arg5 += var33;
						arg6 += var32;
						arg8 += var34;
						arg2 += Class1_Sub3_Sub2.anInt528;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				}
			}
		}
	}

	public static final void method303(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
		if (arg5 < arg6) {
			int var15;
			int var16;
			if (aBoolean97) {
				var15 = (arg8 - arg7) / (arg6 - arg5);
				if (arg6 > Class1_Sub3_Sub2.anInt534) {
					arg6 = Class1_Sub3_Sub2.anInt534;
				}
				if (arg5 < 0) {
					arg7 -= arg5 * var15;
					arg5 = 0;
				}
				if (arg5 >= arg6) {
					return;
				}
				var16 = arg6 - arg5 >> 3;
				var15 <<= 12;
				arg7 <<= 9;
			} else {
				if (arg6 - arg5 > 7) {
					var16 = arg6 - arg5 >> 3;
					var15 = (arg8 - arg7) * anIntArray135[var16] >> 6;
				} else {
					var16 = 0;
					var15 = 0;
				}
				arg7 <<= 9;
			}
			arg4 += arg5;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var25;
			int var32;
			int var33;
			int var34;
			if (aBoolean96) {
				var17 = 0;
				var18 = 0;
				var20 = arg5 - anInt430;
				var32 = arg9 + (arg12 >> 3) * var20;
				var33 = arg10 + (arg13 >> 3) * var20;
				var34 = arg11 + (arg14 >> 3) * var20;
				var19 = var34 >> 12;
				if (var19 != 0) {
					arg2 = var32 / var19;
					arg3 = var33 / var19;
					if (arg2 < 0) {
						arg2 = 0;
					} else if (arg2 > 4032) {
						arg2 = 4032;
					}
				}
				arg9 = var32 + arg12;
				arg10 = var33 + arg13;
				arg11 = var34 + arg14;
				var19 = arg11 >> 12;
				if (var19 != 0) {
					var17 = arg9 / var19;
					var18 = arg10 / var19;
					if (var17 < 7) {
						var17 = 7;
					} else if (var17 > 4032) {
						var17 = 4032;
					}
				}
				var21 = var17 - arg2 >> 3;
				var22 = var18 - arg3 >> 3;
				arg2 += (arg7 & 6291456) >> 3;
				var23 = arg7 >> 23;
				if (!aBoolean98) {
					while (var16-- > 0) {
						int var43;
						if ((var43 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
							arg0[arg4] = var43;
						}
						var25 = arg4 + 1;
						arg2 += var21;
						arg3 += var22;
						int var44;
						if ((var44 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
							arg0[var25] = var44;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var45;
						if ((var45 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
							arg0[var25] = var45;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var46;
						if ((var46 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
							arg0[var25] = var46;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var47;
						if ((var47 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
							arg0[var25] = var47;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var48;
						if ((var48 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
							arg0[var25] = var48;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var49;
						if ((var49 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
							arg0[var25] = var49;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var50;
						if ((var50 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
							arg0[var25] = var50;
						}
						arg4 = var25 + 1;
						arg2 = var17;
						arg3 = var18;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						var19 = arg11 >> 12;
						if (var19 != 0) {
							var17 = arg9 / var19;
							var18 = arg10 / var19;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 4032) {
								var17 = 4032;
							}
						}
						var21 = var17 - arg2 >> 3;
						var22 = var18 - arg3 >> 3;
						arg7 += var15;
						arg2 += (arg7 & 6291456) >> 3;
						var23 = arg7 >> 23;
					}
					var16 = arg6 - arg5 & 7;
					while (var16-- > 0) {
						int var51;
						if ((var51 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
							arg0[arg4] = var51;
						}
						++arg4;
						arg2 += var21;
						arg3 += var22;
					}
				} else {
					while (var16-- > 0) {
						var25 = arg4 + 1;
						arg0[arg4] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						arg4 = var25 + 1;
						arg0[var25] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
						arg2 = var17;
						arg3 = var18;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						var19 = arg11 >> 12;
						if (var19 != 0) {
							var17 = arg9 / var19;
							var18 = arg10 / var19;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 4032) {
								var17 = 4032;
							}
						}
						var21 = var17 - arg2 >> 3;
						var22 = var18 - arg3 >> 3;
						arg7 += var15;
						arg2 += (arg7 & 6291456) >> 3;
						var23 = arg7 >> 23;
					}
					var16 = arg6 - arg5 & 7;
					while (var16-- > 0) {
						arg0[arg4++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
						arg2 += var21;
						arg3 += var22;
					}
				}
			} else {
				var17 = 0;
				var18 = 0;
				var20 = arg5 - anInt430;
				var32 = arg9 + (arg12 >> 3) * var20;
				var33 = arg10 + (arg13 >> 3) * var20;
				var34 = arg11 + (arg14 >> 3) * var20;
				var19 = var34 >> 14;
				if (var19 != 0) {
					arg2 = var32 / var19;
					arg3 = var33 / var19;
					if (arg2 < 0) {
						arg2 = 0;
					} else if (arg2 > 16256) {
						arg2 = 16256;
					}
				}
				arg9 = var32 + arg12;
				arg10 = var33 + arg13;
				arg11 = var34 + arg14;
				var19 = arg11 >> 14;
				if (var19 != 0) {
					var17 = arg9 / var19;
					var18 = arg10 / var19;
					if (var17 < 7) {
						var17 = 7;
					} else if (var17 > 16256) {
						var17 = 16256;
					}
				}
				var21 = var17 - arg2 >> 3;
				var22 = var18 - arg3 >> 3;
				arg2 += arg7 & 6291456;
				var23 = arg7 >> 23;
				if (!aBoolean98) {
					while (var16-- > 0) {
						int var24;
						if ((var24 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
							arg0[arg4] = var24;
						}
						var25 = arg4 + 1;
						arg2 += var21;
						arg3 += var22;
						int var35;
						if ((var35 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
							arg0[var25] = var35;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var36;
						if ((var36 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
							arg0[var25] = var36;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var37;
						if ((var37 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
							arg0[var25] = var37;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var38;
						if ((var38 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
							arg0[var25] = var38;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var39;
						if ((var39 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
							arg0[var25] = var39;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var40;
						if ((var40 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
							arg0[var25] = var40;
						}
						++var25;
						arg2 += var21;
						arg3 += var22;
						int var41;
						if ((var41 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
							arg0[var25] = var41;
						}
						arg4 = var25 + 1;
						arg2 = var17;
						arg3 = var18;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						var19 = arg11 >> 14;
						if (var19 != 0) {
							var17 = arg9 / var19;
							var18 = arg10 / var19;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 16256) {
								var17 = 16256;
							}
						}
						var21 = var17 - arg2 >> 3;
						var22 = var18 - arg3 >> 3;
						arg7 += var15;
						arg2 += arg7 & 6291456;
						var23 = arg7 >> 23;
					}
					var16 = arg6 - arg5 & 7;
					while (var16-- > 0) {
						int var42;
						if ((var42 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
							arg0[arg4] = var42;
						}
						++arg4;
						arg2 += var21;
						arg3 += var22;
					}
				} else {
					while (var16-- > 0) {
						var25 = arg4 + 1;
						arg0[arg4] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						int var26 = var25 + 1;
						arg0[var25] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						int var27 = var26 + 1;
						arg0[var26] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						int var28 = var27 + 1;
						arg0[var27] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						int var29 = var28 + 1;
						arg0[var28] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						int var30 = var29 + 1;
						arg0[var29] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						int var31 = var30 + 1;
						arg0[var30] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
						arg2 += var21;
						arg3 += var22;
						arg4 = var31 + 1;
						arg0[var31] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
						arg2 = var17;
						arg3 = var18;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						var19 = arg11 >> 14;
						if (var19 != 0) {
							var17 = arg9 / var19;
							var18 = arg10 / var19;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 16256) {
								var17 = 16256;
							}
						}
						var21 = var17 - arg2 >> 3;
						var22 = var18 - arg3 >> 3;
						arg7 += var15;
						arg2 += arg7 & 6291456;
						var23 = arg7 >> 23;
					}
					var16 = arg6 - arg5 & 7;
					while (var16-- > 0) {
						arg0[arg4++] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
						arg2 += var21;
						arg3 += var22;
					}
				}
			}
		}
	}

	static {
		for (int var0 = 1; var0 < 512; ++var0) {
			anIntArray135[var0] = 32768 / var0;
		}
		for (int var1 = 1; var1 < 2048; ++var1) {
			anIntArray136[var1] = 65536 / var1;
		}
		for (int var2 = 0; var2 < 2048; ++var2) {
			anIntArray137[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
			anIntArray138[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
		}
		aClass1_Sub3_Sub2_Sub3Array4 = new Class1_Sub3_Sub2_Sub3[50];
		aBooleanArray4 = new boolean[50];
		anIntArray140 = new int[50];
		anIntArrayArray13 = new int[50][];
		anIntArray141 = new int[50];
		anIntArray142 = new int[65536];
		anIntArrayArray14 = new int[50][];
	}
}
