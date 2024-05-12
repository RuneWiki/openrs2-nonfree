import sign.signlink;

final class Class4 {

	private static boolean aBoolean21 = true;

	private boolean aBoolean22 = true;

	private int anInt80 = 8;

	static boolean aBoolean23 = true;

	static int anInt81;

	static boolean aBoolean24;

	private int anInt82;

	private int anInt83;

	private int[][][] anIntArrayArrayArray1;

	private byte[][][] aByteArrayArrayArray1;

	private byte[][][] aByteArrayArrayArray2;

	private byte[][][] aByteArrayArrayArray3;

	private byte[][][] aByteArrayArrayArray4;

	private byte[][][] aByteArrayArrayArray5;

	private byte[][][] aByteArrayArrayArray6;

	private int[][] anIntArrayArray1;

	private int[] anIntArray13;

	private int[] anIntArray14;

	private int[] anIntArray15;

	private int[] anIntArray16;

	private int[] anIntArray17;

	private int[][][] anIntArrayArrayArray2;

	private static final int[] anIntArray18 = new int[] { 1, 2, 4, 8 };

	private static final int[] anIntArray19 = new int[] { 16, 32, 64, 128 };

	private static final int[] anIntArray20 = new int[] { 1, 0, -1, 0 };

	private static final int[] anIntArray21 = new int[] { 0, -1, 0, 1 };

	private static int anInt84 = (int) (Math.random() * 17.0D) - 8;

	private static int anInt85 = (int) (Math.random() * 33.0D) - 16;

	public Class4(int arg0, byte[][][] arg1, int arg2, int[][][] arg3, int arg4) {
		try {
			this.anInt82 = arg2;
			this.anInt83 = arg0;
			this.anIntArrayArrayArray1 = arg3;
			this.aByteArrayArrayArray1 = arg1;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt82][this.anInt83];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt82][this.anInt83];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt82][this.anInt83];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt82][this.anInt83];
			this.anIntArrayArrayArray2 = new int[4][this.anInt82 + 1][this.anInt83 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt82 + 1][this.anInt83 + 1];
			this.anIntArrayArray1 = new int[this.anInt82 + 1][this.anInt83 + 1];
			this.anIntArray13 = new int[this.anInt83];
			this.anIntArray14 = new int[this.anInt83];
			if (arg4 != -35388) {
				this.anInt80 = 28;
			}
			this.anIntArray15 = new int[this.anInt83];
			this.anIntArray16 = new int[this.anInt83];
			this.anIntArray17 = new int[this.anInt83];
		} catch (RuntimeException var7) {
			signlink.reporterror("87235, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final void method36(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			byte var6 = 0;
			if (arg2 != 3) {
				this.anInt80 = 123;
			}
			for (int var7 = 0; var7 < Class11.anInt402; ++var7) {
				if (Class11.aClass11Array1[var7].aString19.equalsIgnoreCase("water")) {
					var6 = (byte) (var7 + 1);
					break;
				}
			}
			for (int var8 = arg1; var8 < arg1 + arg4; ++var8) {
				for (int var9 = arg0; var9 < arg0 + arg3; ++var9) {
					if (var9 >= 0 && var9 < this.anInt82 && var8 >= 0 && var8 < this.anInt83) {
						this.aByteArrayArrayArray3[0][var9][var8] = var6;
						for (int var10 = 0; var10 < 4; ++var10) {
							this.anIntArrayArrayArray1[var10][var9][var8] = 0;
							this.aByteArrayArrayArray1[var10][var9][var8] = 0;
						}
					}
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("25754, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public final void method37(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			Class1_Sub3_Sub3 var7 = new Class1_Sub3_Sub3(363, arg0);
			if (arg2 != 1) {
				this.aBoolean22 = !this.aBoolean22;
			}
			for (int var8 = 0; var8 < 4; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					for (int var10 = 0; var10 < 64; ++var10) {
						int var11 = var9 + arg4;
						int var12 = var10 + arg3;
						int var13;
						if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
							this.aByteArrayArrayArray1[var8][var11][var12] = 0;
							while (true) {
								var13 = var7.method391();
								if (var13 == 0) {
									if (var8 == 0) {
										this.anIntArrayArrayArray1[0][var11][var12] = -method42(932731 + var11 + arg1, 556238 + var12 + arg5) * 8;
									} else {
										this.anIntArrayArrayArray1[var8][var11][var12] = this.anIntArrayArrayArray1[var8 - 1][var11][var12] - 240;
									}
									break;
								}
								if (var13 == 1) {
									int var14 = var7.method391();
									if (var14 == 1) {
										var14 = 0;
									}
									if (var8 == 0) {
										this.anIntArrayArrayArray1[0][var11][var12] = -var14 * 8;
									} else {
										this.anIntArrayArrayArray1[var8][var11][var12] = this.anIntArrayArrayArray1[var8 - 1][var11][var12] - var14 * 8;
									}
									break;
								}
								if (var13 <= 49) {
									this.aByteArrayArrayArray3[var8][var11][var12] = var7.method392();
									this.aByteArrayArrayArray4[var8][var11][var12] = (byte) ((var13 - 2) / 4);
									this.aByteArrayArrayArray5[var8][var11][var12] = (byte) (var13 - 2 & 3);
								} else if (var13 <= 81) {
									this.aByteArrayArrayArray1[var8][var11][var12] = (byte) (var13 - 49);
								} else {
									this.aByteArrayArrayArray2[var8][var11][var12] = (byte) (var13 - 81);
								}
							}
						} else {
							while (true) {
								var13 = var7.method391();
								if (var13 == 0) {
									break;
								}
								if (var13 == 1) {
									var7.method391();
									break;
								}
								if (var13 <= 49) {
									var7.method391();
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("89670, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	public final void method38(byte[] arg0, Class33 arg1, Class9[] arg2, Class28 arg3, boolean arg4, int arg5, int arg6) {
		try {
			Class1_Sub3_Sub3 var8 = new Class1_Sub3_Sub3(363, arg0);
			if (!arg4) {
				this.aBoolean22 = !this.aBoolean22;
			}
			int var9 = -1;
			while (true) {
				int var10 = var8.method405();
				if (var10 == 0) {
					return;
				}
				var9 += var10;
				int var11 = 0;
				while (true) {
					int var12 = var8.method405();
					if (var12 == 0) {
						break;
					}
					var11 += var12 - 1;
					int var13 = var11 & 63;
					int var14 = var11 >> 6 & 63;
					int var15 = var11 >> 12;
					int var16 = var8.method391();
					int var17 = var16 >> 2;
					int var18 = var16 & 3;
					int var19 = var14 + arg6;
					int var20 = var13 + arg5;
					if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
						int var21 = var15;
						if ((this.aByteArrayArrayArray1[1][var19][var20] & 2) == 2) {
							var21 = var15 - 1;
						}
						Class9 var22 = null;
						if (var21 >= 0) {
							var22 = arg2[var21];
						}
						this.method39(var22, true, var15, var20, var18, var17, arg1, arg3, var9, var19);
					}
				}
			}
		} catch (RuntimeException var23) {
			signlink.reporterror("51686, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var23.toString());
			throw new RuntimeException();
		}
	}

	private final void method39(Class9 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, Class33 arg6, Class28 arg7, int arg8, int arg9) {
		try {
			if (arg1) {
				if (aBoolean23) {
					if ((this.aByteArrayArrayArray1[arg2][arg9][arg3] & 16) != 0) {
						return;
					}
					if (this.method41(arg2, (byte) 10, arg9, arg3) != anInt81) {
						return;
					}
				}
				int var11 = this.anIntArrayArrayArray1[arg2][arg9][arg3];
				int var12 = this.anIntArrayArrayArray1[arg2][arg9 + 1][arg3];
				int var13 = this.anIntArrayArrayArray1[arg2][arg9 + 1][arg3 + 1];
				int var14 = this.anIntArrayArrayArray1[arg2][arg9][arg3 + 1];
				int var15 = var11 + var12 + var13 + var14 >> 2;
				Class2 var16 = Class2.method23(arg8);
				int var17 = arg9 + (arg3 << 7) + (arg8 << 14) + 1073741824;
				if (!var16.aBoolean9) {
					var17 += Integer.MIN_VALUE;
				}
				byte var18 = (byte) ((arg4 << 6) + arg5);
				Class1_Sub3_Sub1 var19;
				if (arg5 == 22) {
					if (!aBoolean23 || var16.aBoolean9 || var16.aBoolean16) {
						var19 = var16.method26(22, arg4, var11, var12, var13, var14, -1);
						arg6.method473(var19, (byte) 6, arg9, var17, arg3, arg2, var18, var15);
						if (var16.aBoolean7 && var16.aBoolean9 && arg0 != null) {
							arg0.method252((byte) 12, arg3, arg9);
						}
						if (var16.anInt45 != -1) {
							arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 3, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
						}
					}
				} else {
					int var20;
					if (arg5 != 10 && arg5 != 11) {
						if (arg5 >= 12) {
							var19 = var16.method26(arg5, arg4, var11, var12, var13, var14, -1);
							arg6.method477(var15, 775, arg2, (Class1_Sub1) null, var17, arg3, arg9, 1, var18, var19, 0, 1);
							if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg2 > 0) {
								this.anIntArrayArrayArray2[arg2][arg9][arg3] |= 2340;
							}
							if (var16.aBoolean7 && arg0 != null) {
								arg0.method251(arg4, var16.anInt44, var16.anInt43, arg9, 9, arg3, var16.aBoolean8);
							}
							if (var16.anInt45 != -1) {
								arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 2, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
							}
						} else if (arg5 == 0) {
							var19 = var16.method26(0, arg4, var11, var12, var13, var14, -1);
							arg6.method475(0, var15, arg2, anIntArray18[arg4], 8, var19, (Class1_Sub3_Sub1) null, arg9, var17, arg3, var18);
							if (arg4 == 0) {
								if (var16.aBoolean15) {
									this.aByteArrayArrayArray6[arg2][arg9][arg3] = 50;
									this.aByteArrayArrayArray6[arg2][arg9][arg3 + 1] = 50;
								}
								if (var16.aBoolean12) {
									this.anIntArrayArrayArray2[arg2][arg9][arg3] |= 585;
								}
							} else if (arg4 == 1) {
								if (var16.aBoolean15) {
									this.aByteArrayArrayArray6[arg2][arg9][arg3 + 1] = 50;
									this.aByteArrayArrayArray6[arg2][arg9 + 1][arg3 + 1] = 50;
								}
								if (var16.aBoolean12) {
									this.anIntArrayArrayArray2[arg2][arg9][arg3 + 1] |= 1170;
								}
							} else if (arg4 == 2) {
								if (var16.aBoolean15) {
									this.aByteArrayArrayArray6[arg2][arg9 + 1][arg3] = 50;
									this.aByteArrayArrayArray6[arg2][arg9 + 1][arg3 + 1] = 50;
								}
								if (var16.aBoolean12) {
									this.anIntArrayArrayArray2[arg2][arg9 + 1][arg3] |= 585;
								}
							} else if (arg4 == 3) {
								if (var16.aBoolean15) {
									this.aByteArrayArrayArray6[arg2][arg9][arg3] = 50;
									this.aByteArrayArrayArray6[arg2][arg9 + 1][arg3] = 50;
								}
								if (var16.aBoolean12) {
									this.anIntArrayArrayArray2[arg2][arg9][arg3] |= 1170;
								}
							}
							if (var16.aBoolean7 && arg0 != null) {
								arg0.method250(true, arg4, arg3, arg9, var16.aBoolean8, arg5);
							}
							if (var16.anInt45 != -1) {
								arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 0, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
							}
							if (var16.anInt46 != 16) {
								arg6.method484(arg2, arg3, arg9, var16.anInt46, (byte) 6);
							}
						} else if (arg5 == 1) {
							var19 = var16.method26(1, arg4, var11, var12, var13, var14, -1);
							arg6.method475(0, var15, arg2, anIntArray19[arg4], 8, var19, (Class1_Sub3_Sub1) null, arg9, var17, arg3, var18);
							if (var16.aBoolean15) {
								if (arg4 == 0) {
									this.aByteArrayArrayArray6[arg2][arg9][arg3 + 1] = 50;
								} else if (arg4 == 1) {
									this.aByteArrayArrayArray6[arg2][arg9 + 1][arg3 + 1] = 50;
								} else if (arg4 == 2) {
									this.aByteArrayArrayArray6[arg2][arg9 + 1][arg3] = 50;
								} else if (arg4 == 3) {
									this.aByteArrayArrayArray6[arg2][arg9][arg3] = 50;
								}
							}
							if (var16.aBoolean7 && arg0 != null) {
								arg0.method250(true, arg4, arg3, arg9, var16.aBoolean8, arg5);
							}
							if (var16.anInt45 != -1) {
								arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 0, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
							}
						} else {
							int var27;
							Class1_Sub3_Sub1 var29;
							if (arg5 == 2) {
								var27 = arg4 + 1 & 3;
								Class1_Sub3_Sub1 var28 = var16.method26(2, 4 + arg4, var11, var12, var13, var14, -1);
								var29 = var16.method26(2, var27, var11, var12, var13, var14, -1);
								arg6.method475(anIntArray18[var27], var15, arg2, anIntArray18[arg4], 8, var28, var29, arg9, var17, arg3, var18);
								if (var16.aBoolean12) {
									if (arg4 == 0) {
										this.anIntArrayArrayArray2[arg2][arg9][arg3] |= 585;
										this.anIntArrayArrayArray2[arg2][arg9][arg3 + 1] |= 1170;
									} else if (arg4 == 1) {
										this.anIntArrayArrayArray2[arg2][arg9][arg3 + 1] |= 1170;
										this.anIntArrayArrayArray2[arg2][arg9 + 1][arg3] |= 585;
									} else if (arg4 == 2) {
										this.anIntArrayArrayArray2[arg2][arg9 + 1][arg3] |= 585;
										this.anIntArrayArrayArray2[arg2][arg9][arg3] |= 1170;
									} else if (arg4 == 3) {
										this.anIntArrayArrayArray2[arg2][arg9][arg3] |= 1170;
										this.anIntArrayArrayArray2[arg2][arg9][arg3] |= 585;
									}
								}
								if (var16.aBoolean7 && arg0 != null) {
									arg0.method250(true, arg4, arg3, arg9, var16.aBoolean8, arg5);
								}
								if (var16.anInt45 != -1) {
									arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 0, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
								}
								if (var16.anInt46 != 16) {
									arg6.method484(arg2, arg3, arg9, var16.anInt46, (byte) 6);
								}
							} else if (arg5 == 3) {
								var19 = var16.method26(3, arg4, var11, var12, var13, var14, -1);
								arg6.method475(0, var15, arg2, anIntArray19[arg4], 8, var19, (Class1_Sub3_Sub1) null, arg9, var17, arg3, var18);
								if (var16.aBoolean15) {
									if (arg4 == 0) {
										this.aByteArrayArrayArray6[arg2][arg9][arg3 + 1] = 50;
									} else if (arg4 == 1) {
										this.aByteArrayArrayArray6[arg2][arg9 + 1][arg3 + 1] = 50;
									} else if (arg4 == 2) {
										this.aByteArrayArrayArray6[arg2][arg9 + 1][arg3] = 50;
									} else if (arg4 == 3) {
										this.aByteArrayArrayArray6[arg2][arg9][arg3] = 50;
									}
								}
								if (var16.aBoolean7 && arg0 != null) {
									arg0.method250(true, arg4, arg3, arg9, var16.aBoolean8, arg5);
								}
								if (var16.anInt45 != -1) {
									arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 0, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
								}
							} else if (arg5 == 9) {
								var19 = var16.method26(arg5, arg4, var11, var12, var13, var14, -1);
								arg6.method477(var15, 775, arg2, (Class1_Sub1) null, var17, arg3, arg9, 1, var18, var19, 0, 1);
								if (var16.aBoolean7 && arg0 != null) {
									arg0.method251(arg4, var16.anInt44, var16.anInt43, arg9, 9, arg3, var16.aBoolean8);
								}
								if (var16.anInt45 != -1) {
									arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 2, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
								}
							} else if (arg5 == 4) {
								var19 = var16.method26(4, 0, var11, var12, var13, var14, -1);
								arg6.method476(var15, arg3, 0, var17, arg4 * 512, anIntArray18[arg4], 465, 0, arg9, var19, var18, arg2);
								if (var16.anInt45 != -1) {
									arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 1, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
								}
							} else if (arg5 == 5) {
								var27 = 16;
								var20 = arg6.method494(arg2, arg9, arg3);
								if (var20 > 0) {
									var27 = Class2.method23(var20 >> 14 & 32767).anInt46;
								}
								var29 = var16.method26(4, 0, var11, var12, var13, var14, -1);
								arg6.method476(var15, arg3, anIntArray21[arg4] * var27, var17, arg4 * 512, anIntArray18[arg4], 465, anIntArray20[arg4] * var27, arg9, var29, var18, arg2);
								if (var16.anInt45 != -1) {
									arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 1, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
								}
							} else if (arg5 == 6) {
								var19 = var16.method26(4, 0, var11, var12, var13, var14, -1);
								arg6.method476(var15, arg3, 0, var17, arg4, 256, 465, 0, arg9, var19, var18, arg2);
								if (var16.anInt45 != -1) {
									arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 1, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
								}
							} else if (arg5 == 7) {
								var19 = var16.method26(4, 0, var11, var12, var13, var14, -1);
								arg6.method476(var15, arg3, 0, var17, arg4, 512, 465, 0, arg9, var19, var18, arg2);
								if (var16.anInt45 != -1) {
									arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 1, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
								}
							} else if (arg5 == 8) {
								var19 = var16.method26(4, 0, var11, var12, var13, var14, -1);
								arg6.method476(var15, arg3, 0, var17, arg4, 768, 465, 0, arg9, var19, var18, arg2);
								if (var16.anInt45 != -1) {
									arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 1, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
								}
							}
						}
					} else {
						var19 = var16.method26(10, arg4, var11, var12, var13, var14, -1);
						if (var19 != null) {
							int var22 = 0;
							if (arg5 == 11) {
								var22 += 256;
							}
							int var21;
							if (arg4 != 1 && arg4 != 3) {
								var20 = var16.anInt43;
								var21 = var16.anInt44;
							} else {
								var20 = var16.anInt44;
								var21 = var16.anInt43;
							}
							if (arg6.method477(var15, 775, arg2, (Class1_Sub1) null, var17, arg3, arg9, var20, var18, var19, var22, var21) && var16.aBoolean15) {
								for (int var23 = 0; var23 <= var20; ++var23) {
									for (int var24 = 0; var24 <= var21; ++var24) {
										int var25 = var19.anInt367 / 4;
										if (var25 > 30) {
											var25 = 30;
										}
										if (var25 > this.aByteArrayArrayArray6[arg2][arg9 + var23][arg3 + var24]) {
											this.aByteArrayArrayArray6[arg2][arg9 + var23][arg3 + var24] = (byte) var25;
										}
									}
								}
							}
						}
						if (var16.aBoolean7 && arg0 != null) {
							arg0.method251(arg4, var16.anInt44, var16.anInt43, arg9, 9, arg3, var16.aBoolean8);
						}
						if (var16.anInt45 != -1) {
							arg7.method453(new Class1_Sub6(true, arg8, arg2, 0, 2, Class19.aClass19Array1[var16.anInt45], arg3, arg9));
						}
					}
				}
			}
		} catch (RuntimeException var26) {
			signlink.reporterror("46393, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + var26.toString());
			throw new RuntimeException();
		}
	}

	public final void method40(Class33 arg0, int arg1, Class9[] arg2) {
		try {
			int var5;
			int var6;
			int var7;
			for (int var4 = 0; var4 < 4; ++var4) {
				for (var5 = 0; var5 < 104; ++var5) {
					for (var6 = 0; var6 < 104; ++var6) {
						if ((this.aByteArrayArrayArray1[var4][var5][var6] & 1) == 1) {
							var7 = var4;
							if ((this.aByteArrayArrayArray1[1][var5][var6] & 2) == 2) {
								var7 = var4 - 1;
							}
							if (var7 >= 0) {
								arg2[var7].method252((byte) 12, var6, var5);
							}
						}
					}
				}
			}
			anInt84 += (int) (Math.random() * 5.0D) - 2;
			if (anInt84 < -8) {
				anInt84 = -8;
			}
			if (anInt84 > 8) {
				anInt84 = 8;
			}
			anInt85 += (int) (Math.random() * 5.0D) - 2;
			if (anInt85 < -16) {
				anInt85 = -16;
			}
			if (anInt85 > 16) {
				anInt85 = 16;
			}
			int var12;
			int var13;
			int var14;
			int var15;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			for (var5 = 0; var5 < 4; ++var5) {
				byte[][] var46 = this.aByteArrayArrayArray6[var5];
				byte var47 = 96;
				short var8 = 768;
				byte var9 = -50;
				byte var10 = -10;
				byte var11 = -50;
				var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10 + var11 * var11));
				var13 = var8 * var12 >> 8;
				for (var14 = 1; var14 < this.anInt83 - 1; ++var14) {
					for (var15 = 1; var15 < this.anInt82 - 1; ++var15) {
						var16 = this.anIntArrayArrayArray1[var5][var15 + 1][var14] - this.anIntArrayArrayArray1[var5][var15 - 1][var14];
						var17 = this.anIntArrayArrayArray1[var5][var15][var14 + 1] - this.anIntArrayArrayArray1[var5][var15][var14 - 1];
						var18 = (int) Math.sqrt((double) (var16 * var16 + 65536 + var17 * var17));
						var19 = (var16 << 8) / var18;
						var20 = 65536 / var18;
						var21 = (var17 << 8) / var18;
						var22 = var47 + (var9 * var19 + var10 * var20 + var11 * var21) / var13;
						var23 = (var46[var15 - 1][var14] >> 2) + (var46[var15 + 1][var14] >> 3) + (var46[var15][var14 - 1] >> 2) + (var46[var15][var14 + 1] >> 3) + (var46[var15][var14] >> 1);
						this.anIntArrayArray1[var15][var14] = var22 - var23;
					}
				}
				for (var15 = 0; var15 < this.anInt83; ++var15) {
					this.anIntArray13[var15] = 0;
					this.anIntArray14[var15] = 0;
					this.anIntArray15[var15] = 0;
					this.anIntArray16[var15] = 0;
					this.anIntArray17[var15] = 0;
				}
				for (var16 = -5; var16 < this.anInt82 + 5; ++var16) {
					for (var17 = 0; var17 < this.anInt83; ++var17) {
						var18 = var16 + 5;
						int var10002;
						if (var18 >= 0 && var18 < this.anInt82) {
							var19 = this.aByteArrayArrayArray2[var5][var18][var17] & 255;
							if (var19 > 0) {
								Class11 var52 = Class11.aClass11Array1[var19 - 1];
								this.anIntArray13[var17] += var52.anInt408;
								this.anIntArray14[var17] += var52.anInt406;
								this.anIntArray15[var17] += var52.anInt407;
								this.anIntArray16[var17] += var52.anInt409;
								var10002 = this.anIntArray17[var17]++;
							}
						}
						var19 = var16 - 5;
						if (var19 >= 0 && var19 < this.anInt82) {
							var20 = this.aByteArrayArrayArray2[var5][var19][var17] & 255;
							if (var20 > 0) {
								Class11 var53 = Class11.aClass11Array1[var20 - 1];
								this.anIntArray13[var17] -= var53.anInt408;
								this.anIntArray14[var17] -= var53.anInt406;
								this.anIntArray15[var17] -= var53.anInt407;
								this.anIntArray16[var17] -= var53.anInt409;
								var10002 = this.anIntArray17[var17]--;
							}
						}
					}
					if (var16 >= 1 && var16 < this.anInt82 - 1) {
						var18 = 0;
						var19 = 0;
						var20 = 0;
						var21 = 0;
						var22 = 0;
						for (var23 = -5; var23 < this.anInt83 + 5; ++var23) {
							int var24 = var23 + 5;
							if (var24 >= 0 && var24 < this.anInt83) {
								var18 += this.anIntArray13[var24];
								var19 += this.anIntArray14[var24];
								var20 += this.anIntArray15[var24];
								var21 += this.anIntArray16[var24];
								var22 += this.anIntArray17[var24];
							}
							int var25 = var23 - 5;
							if (var25 >= 0 && var25 < this.anInt83) {
								var18 -= this.anIntArray13[var25];
								var19 -= this.anIntArray14[var25];
								var20 -= this.anIntArray15[var25];
								var21 -= this.anIntArray16[var25];
								var22 -= this.anIntArray17[var25];
							}
							if (var23 >= 1 && var23 < this.anInt83 - 1 && (!aBoolean23 || (this.aByteArrayArrayArray1[var5][var16][var23] & 16) == 0 && this.method41(var5, (byte) 10, var16, var23) == anInt81)) {
								int var26 = this.aByteArrayArrayArray2[var5][var16][var23] & 255;
								int var27 = this.aByteArrayArrayArray3[var5][var16][var23] & 255;
								if (var26 > 0 || var27 > 0) {
									int var28 = this.anIntArrayArrayArray1[var5][var16][var23];
									int var29 = this.anIntArrayArrayArray1[var5][var16 + 1][var23];
									int var30 = this.anIntArrayArrayArray1[var5][var16 + 1][var23 + 1];
									int var31 = this.anIntArrayArrayArray1[var5][var16][var23 + 1];
									int var32 = this.anIntArrayArray1[var16][var23];
									int var33 = this.anIntArrayArray1[var16 + 1][var23];
									int var34 = this.anIntArrayArray1[var16 + 1][var23 + 1];
									int var35 = this.anIntArrayArray1[var16][var23 + 1];
									int var36 = -1;
									int var37 = -1;
									int var38;
									int var39;
									if (var26 > 0) {
										var38 = var18 * 256 / var21;
										var39 = var19 / var22;
										int var40 = var20 / var22;
										var36 = this.method49(var38, var39, var40);
										int var55 = var38 + anInt84 & 255;
										var40 += anInt85;
										if (var40 < 0) {
											var40 = 0;
										} else if (var40 > 255) {
											var40 = 255;
										}
										var37 = this.method49(var55, var39, var40);
									}
									if (var5 > 0) {
										boolean var56 = true;
										if (var26 == 0 && this.aByteArrayArrayArray4[var5][var16][var23] != 0) {
											var56 = false;
										}
										if (var27 > 0 && !Class11.aClass11Array1[var27 - 1].aBoolean91) {
											var56 = false;
										}
										if (var56 && var28 == var29 && var28 == var30 && var28 == var31) {
											this.anIntArrayArrayArray2[var5][var16][var23] |= 2340;
										}
									}
									var38 = 0;
									if (var36 != -1) {
										var38 = Class1_Sub3_Sub2_Sub1.anIntArray142[method47(var37, 96)];
									}
									if (var27 == 0) {
										arg0.method472(var5, var16, var23, 0, 0, -1, var28, var29, var30, var31, method47(var36, var32), method47(var36, var33), method47(var36, var34), method47(var36, var35), 0, 0, 0, 0, var38, 0);
									} else {
										var39 = this.aByteArrayArrayArray4[var5][var16][var23] + 1;
										byte var57 = this.aByteArrayArrayArray5[var5][var16][var23];
										Class11 var41 = Class11.aClass11Array1[var27 - 1];
										int var42 = var41.anInt404;
										int var43;
										int var44;
										if (var42 >= 0) {
											var44 = Class1_Sub3_Sub2_Sub1.method293(787, var42);
											var43 = -1;
										} else if (var41.anInt403 == 16711935) {
											var44 = 0;
											var43 = -2;
											var42 = -1;
										} else {
											var43 = this.method49(var41.anInt405, var41.anInt406, var41.anInt407);
											var44 = Class1_Sub3_Sub2_Sub1.anIntArray142[this.method48(var41.anInt410, 96)];
										}
										arg0.method472(var5, var16, var23, var39, var57, var42, var28, var29, var30, var31, method47(var36, var32), method47(var36, var33), method47(var36, var34), method47(var36, var35), this.method48(var43, var32), this.method48(var43, var33), this.method48(var43, var34), this.method48(var43, var35), var38, var44);
									}
								}
							}
						}
					}
				}
				for (var17 = 1; var17 < this.anInt83 - 1; ++var17) {
					for (var18 = 1; var18 < this.anInt82 - 1; ++var18) {
						arg0.method471(var5, var18, var17, this.method41(var5, (byte) 10, var18, var17));
					}
				}
			}
			while (arg1 >= 0) {
				for (var6 = 1; var6 > 0; ++var6) {
				}
			}
			if (!aBoolean24) {
				arg0.method499(-10, 64, -50, 768, -50, false);
			}
			for (var6 = 0; var6 < this.anInt82; ++var6) {
				for (var7 = 0; var7 < this.anInt83; ++var7) {
					if ((this.aByteArrayArrayArray1[1][var6][var7] & 2) == 2) {
						arg0.method469(var7, var6, (byte) -41);
					}
				}
			}
			if (!aBoolean24) {
				var7 = 1;
				int var48 = 2;
				int var49 = 4;
				for (int var50 = 0; var50 < 4; ++var50) {
					if (var50 > 0) {
						var7 <<= 3;
						var48 <<= 3;
						var49 <<= 3;
					}
					for (int var51 = 0; var51 <= var50; ++var51) {
						for (var12 = 0; var12 <= this.anInt83; ++var12) {
							for (var13 = 0; var13 <= this.anInt82; ++var13) {
								short var54;
								if ((this.anIntArrayArrayArray2[var51][var13][var12] & var7) != 0) {
									var14 = var12;
									var15 = var12;
									var16 = var51;
									var17 = var51;
									while (var14 > 0 && (this.anIntArrayArrayArray2[var51][var13][var14 - 1] & var7) != 0) {
										--var14;
									}
									while (var15 < this.anInt83 && (this.anIntArrayArrayArray2[var51][var13][var15 + 1] & var7) != 0) {
										++var15;
									}
									label337: while (var16 > 0) {
										for (var18 = var14; var18 <= var15; ++var18) {
											if ((this.anIntArrayArrayArray2[var16 - 1][var13][var18] & var7) == 0) {
												break label337;
											}
										}
										--var16;
									}
									label326: while (var17 < var50) {
										for (var18 = var14; var18 <= var15; ++var18) {
											if ((this.anIntArrayArrayArray2[var17 + 1][var13][var18] & var7) == 0) {
												break label326;
											}
										}
										++var17;
									}
									var18 = (var17 + 1 - var16) * (var15 - var14 + 1);
									if (var18 >= 8) {
										var54 = 240;
										var20 = this.anIntArrayArrayArray1[var17][var13][var14] - var54;
										var21 = this.anIntArrayArrayArray1[var16][var13][var14];
										Class33.method470(var15 * 128 + 128, var13 * 128, -802, var21, 1, var13 * 128, var50, var20, var14 * 128);
										for (var22 = var16; var22 <= var17; ++var22) {
											for (var23 = var14; var23 <= var15; ++var23) {
												this.anIntArrayArrayArray2[var22][var13][var23] &= ~var7;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[var51][var13][var12] & var48) != 0) {
									var14 = var13;
									var15 = var13;
									var16 = var51;
									var17 = var51;
									while (var14 > 0 && (this.anIntArrayArrayArray2[var51][var14 - 1][var12] & var48) != 0) {
										--var14;
									}
									while (var15 < this.anInt82 && (this.anIntArrayArrayArray2[var51][var15 + 1][var12] & var48) != 0) {
										++var15;
									}
									label390: while (var16 > 0) {
										for (var18 = var14; var18 <= var15; ++var18) {
											if ((this.anIntArrayArrayArray2[var16 - 1][var18][var12] & var48) == 0) {
												break label390;
											}
										}
										--var16;
									}
									label379: while (var17 < var50) {
										for (var18 = var14; var18 <= var15; ++var18) {
											if ((this.anIntArrayArrayArray2[var17 + 1][var18][var12] & var48) == 0) {
												break label379;
											}
										}
										++var17;
									}
									var18 = (var17 + 1 - var16) * (var15 - var14 + 1);
									if (var18 >= 8) {
										var54 = 240;
										var20 = this.anIntArrayArrayArray1[var17][var14][var12] - var54;
										var21 = this.anIntArrayArrayArray1[var16][var14][var12];
										Class33.method470(var12 * 128, var14 * 128, -802, var21, 2, var15 * 128 + 128, var50, var20, var12 * 128);
										for (var22 = var16; var22 <= var17; ++var22) {
											for (var23 = var14; var23 <= var15; ++var23) {
												this.anIntArrayArrayArray2[var22][var23][var12] &= ~var48;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[var51][var13][var12] & var49) != 0) {
									var14 = var13;
									var15 = var13;
									var16 = var12;
									var17 = var12;
									while (var16 > 0 && (this.anIntArrayArrayArray2[var51][var13][var16 - 1] & var49) != 0) {
										--var16;
									}
									while (var17 < this.anInt83 && (this.anIntArrayArrayArray2[var51][var13][var17 + 1] & var49) != 0) {
										++var17;
									}
									label443: while (var14 > 0) {
										for (var18 = var16; var18 <= var17; ++var18) {
											if ((this.anIntArrayArrayArray2[var51][var14 - 1][var18] & var49) == 0) {
												break label443;
											}
										}
										--var14;
									}
									label432: while (var15 < this.anInt82) {
										for (var18 = var16; var18 <= var17; ++var18) {
											if ((this.anIntArrayArrayArray2[var51][var15 + 1][var18] & var49) == 0) {
												break label432;
											}
										}
										++var15;
									}
									if ((var15 - var14 + 1) * (var17 - var16 + 1) >= 4) {
										var18 = this.anIntArrayArrayArray1[var51][var14][var16];
										Class33.method470(var17 * 128 + 128, var14 * 128, -802, var18, 4, var15 * 128 + 128, var50, var18, var16 * 128);
										for (var19 = var14; var19 <= var15; ++var19) {
											for (var20 = var16; var20 <= var17; ++var20) {
												this.anIntArrayArrayArray2[var51][var19][var20] &= ~var49;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var45) {
			signlink.reporterror("31873, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var45.toString());
			throw new RuntimeException();
		}
	}

	public int method41(int arg0, byte arg1, int arg2, int arg3) {
		try {
			if (arg1 != 10) {
				this.anInt80 = 29;
			}
			if ((this.aByteArrayArrayArray1[arg0][arg2][arg3] & 8) != 0) {
				return 0;
			} else {
				return arg0 > 0 && (this.aByteArrayArrayArray1[1][arg2][arg3] & 2) != 0 ? arg0 - 1 : arg0;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("77679, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	private static final int method42(int arg0, int arg1) {
		int var2 = method43(arg0 + 45365, arg1 + 91923, 4) - 128 + (method43(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method43(arg0, arg1, 1) - 128 >> 2);
		var2 = (int) ((double) var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}
		return var2;
	}

	private static final int method43(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method45(var3, var5);
		int var8 = method45(var3 + 1, var5);
		int var9 = method45(var3, var5 + 1);
		int var10 = method45(var3 + 1, var5 + 1);
		int var11 = method44(var7, var8, var4, arg2);
		int var12 = method44(var9, var10, var4, arg2);
		return method44(var11, var12, var6, arg2);
	}

	private static final int method44(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Class1_Sub3_Sub2_Sub1.anIntArray138[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - var4) >> 16) + (arg1 * var4 >> 16);
	}

	private static final int method45(int arg0, int arg1) {
		int var2 = method46(arg0 - 1, arg1 - 1) + method46(arg0 + 1, arg1 - 1) + method46(arg0 - 1, arg1 + 1) + method46(arg0 + 1, arg1 + 1);
		int var3 = method46(arg0 - 1, arg1) + method46(arg0 + 1, arg1) + method46(arg0, arg1 - 1) + method46(arg0, arg1 + 1);
		int var4 = method46(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	private static final int method46(int arg0, int arg1) {
		int var2 = arg0 + arg1 * 57;
		int var4 = var2 << 13 ^ var2;
		int var3 = var4 * (var4 * var4 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	private static final int method47(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		} else {
			arg1 = arg1 * (arg0 & 127) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 65408) + arg1;
		}
	}

	private final int method48(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 127) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 65408) + arg1;
		}
	}

	private final int method49(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}

	public static final void method50(int arg0, Class28 arg1, Class9 arg2, int arg3, int arg4, int[][][] arg5, int arg6, int arg7, int arg8, int arg9, Class33 arg10, int arg11) {
		try {
			if (arg6 != 0) {
				aBoolean21 = !aBoolean21;
			}
			int var12 = arg5[arg11][arg0][arg3];
			int var13 = arg5[arg11][arg0 + 1][arg3];
			int var14 = arg5[arg11][arg0 + 1][arg3 + 1];
			int var15 = arg5[arg11][arg0][arg3 + 1];
			int var16 = var12 + var13 + var14 + var15 >> 2;
			Class2 var17 = Class2.method23(arg8);
			int var18 = arg0 + (arg3 << 7) + (arg8 << 14) + 1073741824;
			if (!var17.aBoolean9) {
				var18 += Integer.MIN_VALUE;
			}
			byte var19 = (byte) ((arg4 << 6) + arg9);
			Class1_Sub3_Sub1 var20;
			if (arg9 == 22) {
				var20 = var17.method26(22, arg4, var12, var13, var14, var15, -1);
				arg10.method473(var20, (byte) 6, arg0, var18, arg3, arg7, var19, var16);
				if (var17.aBoolean7 && var17.aBoolean9) {
					arg2.method252((byte) 12, arg3, arg0);
				}
				if (var17.anInt45 != -1) {
					arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 3, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
				}
			} else {
				int var21;
				if (arg9 != 10 && arg9 != 11) {
					if (arg9 >= 12) {
						var20 = var17.method26(arg9, arg4, var12, var13, var14, var15, -1);
						arg10.method477(var16, 775, arg7, (Class1_Sub1) null, var18, arg3, arg0, 1, var19, var20, 0, 1);
						if (var17.aBoolean7) {
							arg2.method251(arg4, var17.anInt44, var17.anInt43, arg0, 9, arg3, var17.aBoolean8);
						}
						if (var17.anInt45 != -1) {
							arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 2, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
						}
					} else if (arg9 == 0) {
						var20 = var17.method26(0, arg4, var12, var13, var14, var15, -1);
						arg10.method475(0, var16, arg7, anIntArray18[arg4], 8, var20, (Class1_Sub3_Sub1) null, arg0, var18, arg3, var19);
						if (var17.aBoolean7) {
							arg2.method250(true, arg4, arg3, arg0, var17.aBoolean8, arg9);
						}
						if (var17.anInt45 != -1) {
							arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 0, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
						}
					} else if (arg9 == 1) {
						var20 = var17.method26(1, arg4, var12, var13, var14, var15, -1);
						arg10.method475(0, var16, arg7, anIntArray19[arg4], 8, var20, (Class1_Sub3_Sub1) null, arg0, var18, arg3, var19);
						if (var17.aBoolean7) {
							arg2.method250(true, arg4, arg3, arg0, var17.aBoolean8, arg9);
						}
						if (var17.anInt45 != -1) {
							arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 0, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
						}
					} else {
						int var25;
						Class1_Sub3_Sub1 var27;
						if (arg9 == 2) {
							var25 = arg4 + 1 & 3;
							Class1_Sub3_Sub1 var26 = var17.method26(2, 4 + arg4, var12, var13, var14, var15, -1);
							var27 = var17.method26(2, var25, var12, var13, var14, var15, -1);
							arg10.method475(anIntArray18[var25], var16, arg7, anIntArray18[arg4], 8, var26, var27, arg0, var18, arg3, var19);
							if (var17.aBoolean7) {
								arg2.method250(true, arg4, arg3, arg0, var17.aBoolean8, arg9);
							}
							if (var17.anInt45 != -1) {
								arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 0, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
							}
						} else if (arg9 == 3) {
							var20 = var17.method26(3, arg4, var12, var13, var14, var15, -1);
							arg10.method475(0, var16, arg7, anIntArray19[arg4], 8, var20, (Class1_Sub3_Sub1) null, arg0, var18, arg3, var19);
							if (var17.aBoolean7) {
								arg2.method250(true, arg4, arg3, arg0, var17.aBoolean8, arg9);
							}
							if (var17.anInt45 != -1) {
								arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 0, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
							}
						} else if (arg9 == 9) {
							var20 = var17.method26(arg9, arg4, var12, var13, var14, var15, -1);
							arg10.method477(var16, 775, arg7, (Class1_Sub1) null, var18, arg3, arg0, 1, var19, var20, 0, 1);
							if (var17.aBoolean7) {
								arg2.method251(arg4, var17.anInt44, var17.anInt43, arg0, 9, arg3, var17.aBoolean8);
							}
							if (var17.anInt45 != -1) {
								arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 2, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
							}
						} else if (arg9 == 4) {
							var20 = var17.method26(4, 0, var12, var13, var14, var15, -1);
							arg10.method476(var16, arg3, 0, var18, arg4 * 512, anIntArray18[arg4], 465, 0, arg0, var20, var19, arg7);
							if (var17.anInt45 != -1) {
								arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 1, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
							}
						} else if (arg9 == 5) {
							var25 = 16;
							var21 = arg10.method494(arg7, arg0, arg3);
							if (var21 > 0) {
								var25 = Class2.method23(var21 >> 14 & 32767).anInt46;
							}
							var27 = var17.method26(4, 0, var12, var13, var14, var15, -1);
							arg10.method476(var16, arg3, anIntArray21[arg4] * var25, var18, arg4 * 512, anIntArray18[arg4], 465, anIntArray20[arg4] * var25, arg0, var27, var19, arg7);
							if (var17.anInt45 != -1) {
								arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 1, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
							}
						} else if (arg9 == 6) {
							var20 = var17.method26(4, 0, var12, var13, var14, var15, -1);
							arg10.method476(var16, arg3, 0, var18, arg4, 256, 465, 0, arg0, var20, var19, arg7);
							if (var17.anInt45 != -1) {
								arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 1, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
							}
						} else if (arg9 == 7) {
							var20 = var17.method26(4, 0, var12, var13, var14, var15, -1);
							arg10.method476(var16, arg3, 0, var18, arg4, 512, 465, 0, arg0, var20, var19, arg7);
							if (var17.anInt45 != -1) {
								arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 1, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
							}
						} else if (arg9 == 8) {
							var20 = var17.method26(4, 0, var12, var13, var14, var15, -1);
							arg10.method476(var16, arg3, 0, var18, arg4, 768, 465, 0, arg0, var20, var19, arg7);
							if (var17.anInt45 != -1) {
								arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 1, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
							}
						}
					}
				} else {
					var20 = var17.method26(10, arg4, var12, var13, var14, var15, -1);
					if (var20 != null) {
						int var23 = 0;
						if (arg9 == 11) {
							var23 += 256;
						}
						int var22;
						if (arg4 != 1 && arg4 != 3) {
							var21 = var17.anInt43;
							var22 = var17.anInt44;
						} else {
							var21 = var17.anInt44;
							var22 = var17.anInt43;
						}
						arg10.method477(var16, 775, arg7, (Class1_Sub1) null, var18, arg3, arg0, var21, var19, var20, var23, var22);
					}
					if (var17.aBoolean7) {
						arg2.method251(arg4, var17.anInt44, var17.anInt43, arg0, 9, arg3, var17.aBoolean8);
					}
					if (var17.anInt45 != -1) {
						arg1.method453(new Class1_Sub6(true, arg8, arg7, 0, 2, Class19.aClass19Array1[var17.anInt45], arg3, arg0));
					}
				}
			}
		} catch (RuntimeException var24) {
			signlink.reporterror("74512, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + var24.toString());
			throw new RuntimeException();
		}
	}
}
