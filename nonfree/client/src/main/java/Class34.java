public final class Class34 {

	private static Class36 aClass36_1 = new Class36();

	public static int method519(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
		Class36 var6 = aClass36_1;
		synchronized (aClass36_1) {
			aClass36_1.aByteArray8 = arg2;
			aClass36_1.anInt737 = arg4;
			aClass36_1.aByteArray9 = arg0;
			aClass36_1.anInt741 = 0;
			aClass36_1.anInt738 = arg3;
			aClass36_1.anInt742 = arg1;
			aClass36_1.anInt747 = 0;
			aClass36_1.anInt746 = 0;
			aClass36_1.anInt739 = 0;
			aClass36_1.anInt740 = 0;
			aClass36_1.anInt743 = 0;
			aClass36_1.anInt744 = 0;
			aClass36_1.anInt749 = 0;
			method521(aClass36_1);
			return arg1 - aClass36_1.anInt742;
		}
	}

	private static void method520(Class36 arg0) {
		byte var2 = arg0.aByte38;
		int var3 = arg0.anInt745;
		int var4 = arg0.anInt753;
		int var5 = arg0.anInt752;
		int[] var6 = Class36.anIntArray216;
		int var7 = arg0.anInt751;
		byte[] var8 = arg0.aByteArray9;
		int var9 = arg0.anInt741;
		int var10 = arg0.anInt742;
		int var11 = var10;
		int var12 = arg0.anInt755 + 1;
		label67: while (true) {
			if (var3 > 0) {
				while (true) {
					if (var10 == 0) {
						break label67;
					}
					if (var3 == 1) {
						if (var10 == 0) {
							var3 = 1;
							break label67;
						}
						var8[var9] = var2;
						++var9;
						--var10;
						break;
					}
					var8[var9] = var2;
					--var3;
					++var9;
					--var10;
				}
			}
			boolean var14 = true;
			byte var1;
			while (var14) {
				var14 = false;
				if (var4 == var12) {
					var3 = 0;
					break label67;
				}
				var2 = (byte) var5;
				var7 = var6[var7];
				var1 = (byte) (var7 & 255);
				var7 >>= 8;
				++var4;
				if (var1 != var5) {
					var5 = var1;
					if (var10 == 0) {
						var3 = 1;
						break label67;
					}
					var8[var9] = var2;
					++var9;
					--var10;
					var14 = true;
				} else if (var4 == var12) {
					if (var10 == 0) {
						var3 = 1;
						break label67;
					}
					var8[var9] = var2;
					++var9;
					--var10;
					var14 = true;
				}
			}
			var3 = 2;
			var7 = var6[var7];
			var1 = (byte) (var7 & 255);
			var7 >>= 8;
			++var4;
			if (var4 != var12) {
				if (var1 != var5) {
					var5 = var1;
				} else {
					var3 = 3;
					var7 = var6[var7];
					var1 = (byte) (var7 & 255);
					var7 >>= 8;
					++var4;
					if (var4 != var12) {
						if (var1 != var5) {
							var5 = var1;
						} else {
							var7 = var6[var7];
							var1 = (byte) (var7 & 255);
							var7 >>= 8;
							++var4;
							var3 = (var1 & 255) + 4;
							var7 = var6[var7];
							var5 = (byte) (var7 & 255);
							var7 >>= 8;
							++var4;
						}
					}
				}
			}
		}
		int var13 = arg0.anInt743;
		arg0.anInt743 += var11 - var10;
		if (arg0.anInt743 < var13) {
			++arg0.anInt744;
		}
		arg0.aByte38 = var2;
		arg0.anInt745 = var3;
		arg0.anInt753 = var4;
		arg0.anInt752 = var5;
		Class36.anIntArray216 = var6;
		arg0.anInt751 = var7;
		arg0.aByteArray9 = var8;
		arg0.anInt741 = var9;
		arg0.anInt742 = var10;
	}

	private static void method521(Class36 arg0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		boolean var22 = false;
		int var23 = 0;
		int[] var24 = null;
		int[] var25 = null;
		int[] var26 = null;
		arg0.anInt748 = 1;
		if (Class36.anIntArray216 == null) {
			Class36.anIntArray216 = new int[arg0.anInt748 * 100000];
		}
		boolean var27 = true;
		while (true) {
			while (var27) {
				byte var1 = method522(arg0);
				if (var1 == 23) {
					return;
				}
				var1 = method522(arg0);
				var1 = method522(arg0);
				var1 = method522(arg0);
				var1 = method522(arg0);
				var1 = method522(arg0);
				++arg0.anInt749;
				var1 = method522(arg0);
				var1 = method522(arg0);
				var1 = method522(arg0);
				var1 = method522(arg0);
				var1 = method523(arg0);
				if (var1 != 0) {
					arg0.aBoolean146 = true;
				} else {
					arg0.aBoolean146 = false;
				}
				if (arg0.aBoolean146) {
					System.out.println("PANIC! RANDOMISED BLOCK!");
				}
				arg0.anInt750 = 0;
				var1 = method522(arg0);
				arg0.anInt750 = arg0.anInt750 << 8 | var1 & 255;
				var1 = method522(arg0);
				arg0.anInt750 = arg0.anInt750 << 8 | var1 & 255;
				var1 = method522(arg0);
				arg0.anInt750 = arg0.anInt750 << 8 | var1 & 255;
				int var42;
				for (var42 = 0; var42 < 16; ++var42) {
					var1 = method523(arg0);
					if (var1 == 1) {
						arg0.aBooleanArray6[var42] = true;
					} else {
						arg0.aBooleanArray6[var42] = false;
					}
				}
				for (var42 = 0; var42 < 256; ++var42) {
					arg0.aBooleanArray5[var42] = false;
				}
				int var43;
				for (var42 = 0; var42 < 16; ++var42) {
					if (arg0.aBooleanArray6[var42]) {
						for (var43 = 0; var43 < 16; ++var43) {
							var1 = method523(arg0);
							if (var1 == 1) {
								arg0.aBooleanArray5[var42 * 16 + var43] = true;
							}
						}
					}
				}
				method525(arg0);
				int var45 = arg0.anInt754 + 2;
				int var46 = method524(3, arg0);
				int var47 = method524(15, arg0);
				for (var42 = 0; var42 < var47; ++var42) {
					var43 = 0;
					while (true) {
						var1 = method523(arg0);
						if (var1 == 0) {
							arg0.aByteArray13[var42] = (byte) var43;
							break;
						}
						++var43;
					}
				}
				byte[] var28 = new byte[6];
				byte var30 = 0;
				while (var30 < var46) {
					var28[var30] = var30++;
				}
				for (var42 = 0; var42 < var47; ++var42) {
					var30 = arg0.aByteArray13[var42];
					byte var29 = var28[var30];
					while (var30 > 0) {
						var28[var30] = var28[var30 - 1];
						--var30;
					}
					var28[0] = var29;
					arg0.aByteArray12[var42] = var29;
				}
				int var44;
				for (var44 = 0; var44 < var46; ++var44) {
					int var57 = method524(5, arg0);
					for (var42 = 0; var42 < var45; ++var42) {
						while (true) {
							var1 = method523(arg0);
							if (var1 == 0) {
								arg0.aByteArrayArray4[var44][var42] = (byte) var57;
								break;
							}
							var1 = method523(arg0);
							if (var1 == 0) {
								++var57;
							} else {
								--var57;
							}
						}
					}
				}
				for (var44 = 0; var44 < var46; ++var44) {
					byte var2 = 32;
					byte var3 = 0;
					for (var42 = 0; var42 < var45; ++var42) {
						if (arg0.aByteArrayArray4[var44][var42] > var3) {
							var3 = arg0.aByteArrayArray4[var44][var42];
						}
						if (arg0.aByteArrayArray4[var44][var42] < var2) {
							var2 = arg0.aByteArrayArray4[var44][var42];
						}
					}
					method526(arg0.anIntArrayArray20[var44], arg0.anIntArrayArray21[var44], arg0.anIntArrayArray22[var44], arg0.aByteArrayArray4[var44], var2, var3, var45);
					arg0.anIntArray218[var44] = var2;
				}
				int var48 = arg0.anInt754 + 1;
				int var53 = 100000 * arg0.anInt748;
				int var49 = -1;
				byte var50 = 0;
				for (var42 = 0; var42 <= 255; ++var42) {
					arg0.anIntArray213[var42] = 0;
				}
				int var33 = 4095;
				for (int var31 = 15; var31 >= 0; --var31) {
					for (int var32 = 15; var32 >= 0; --var32) {
						arg0.aByteArray11[var33] = (byte) (var31 * 16 + var32);
						--var33;
					}
					arg0.anIntArray217[var31] = var33 + 1;
				}
				int var54 = 0;
				byte var61;
				if (var50 == 0) {
					++var49;
					var50 = 50;
					var61 = arg0.aByteArray12[var49];
					var23 = arg0.anIntArray218[var61];
					var24 = arg0.anIntArrayArray20[var61];
					var26 = arg0.anIntArrayArray22[var61];
					var25 = arg0.anIntArrayArray21[var61];
				}
				int var51 = var50 - 1;
				int var58 = var23;
				int var59;
				byte var60;
				for (var59 = method524(var23, arg0); var59 > var24[var58]; var59 = var59 << 1 | var60) {
					++var58;
					var60 = method523(arg0);
				}
				int var52 = var26[var59 - var25[var58]];
				while (true) {
					while (var52 != var48) {
						if (var52 != 0 && var52 != 1) {
							int var40 = var52 - 1;
							int var37;
							if (var40 < 16) {
								var37 = arg0.anIntArray217[0];
								var1 = arg0.aByteArray11[var37 + var40];
								while (var40 > 3) {
									int var41 = var37 + var40;
									arg0.aByteArray11[var41] = arg0.aByteArray11[var41 - 1];
									arg0.aByteArray11[var41 - 1] = arg0.aByteArray11[var41 - 2];
									arg0.aByteArray11[var41 - 2] = arg0.aByteArray11[var41 - 3];
									arg0.aByteArray11[var41 - 3] = arg0.aByteArray11[var41 - 4];
									var40 -= 4;
								}
								while (var40 > 0) {
									arg0.aByteArray11[var37 + var40] = arg0.aByteArray11[var37 + var40 - 1];
									--var40;
								}
								arg0.aByteArray11[var37] = var1;
							} else {
								int var38 = var40 / 16;
								int var39 = var40 % 16;
								var37 = arg0.anIntArray217[var38] + var39;
								var1 = arg0.aByteArray11[var37];
								while (var37 > arg0.anIntArray217[var38]) {
									arg0.aByteArray11[var37] = arg0.aByteArray11[var37 - 1];
									--var37;
								}
								int var10002 = arg0.anIntArray217[var38]++;
								while (var38 > 0) {
									var10002 = arg0.anIntArray217[var38]--;
									arg0.aByteArray11[arg0.anIntArray217[var38]] = arg0.aByteArray11[arg0.anIntArray217[var38 - 1] + 16 - 1];
									--var38;
								}
								var10002 = arg0.anIntArray217[0]--;
								arg0.aByteArray11[arg0.anIntArray217[0]] = var1;
								if (arg0.anIntArray217[0] == 0) {
									int var36 = 4095;
									for (int var34 = 15; var34 >= 0; --var34) {
										for (int var35 = 15; var35 >= 0; --var35) {
											arg0.aByteArray11[var36] = arg0.aByteArray11[arg0.anIntArray217[var34] + var35];
											--var36;
										}
										arg0.anIntArray217[var34] = var36 + 1;
									}
								}
							}
							++arg0.anIntArray213[arg0.aByteArray10[var1 & 255] & 255];
							Class36.anIntArray216[var54] = arg0.aByteArray10[var1 & 255] & 255;
							++var54;
							if (var51 == 0) {
								++var49;
								var51 = 50;
								var61 = arg0.aByteArray12[var49];
								var23 = arg0.anIntArray218[var61];
								var24 = arg0.anIntArrayArray20[var61];
								var26 = arg0.anIntArrayArray22[var61];
								var25 = arg0.anIntArrayArray21[var61];
							}
							--var51;
							var58 = var23;
							for (var59 = method524(var23, arg0); var59 > var24[var58]; var59 = var59 << 1 | var60) {
								++var58;
								var60 = method523(arg0);
							}
							var52 = var26[var59 - var25[var58]];
						} else {
							int var55 = -1;
							int var56 = 1;
							do {
								if (var52 == 0) {
									var55 += var56;
								} else if (var52 == 1) {
									var55 += 2 * var56;
								}
								var56 *= 2;
								if (var51 == 0) {
									++var49;
									var51 = 50;
									var61 = arg0.aByteArray12[var49];
									var23 = arg0.anIntArray218[var61];
									var24 = arg0.anIntArrayArray20[var61];
									var26 = arg0.anIntArrayArray22[var61];
									var25 = arg0.anIntArrayArray21[var61];
								}
								--var51;
								var58 = var23;
								for (var59 = method524(var23, arg0); var59 > var24[var58]; var59 = var59 << 1 | var60) {
									++var58;
									var60 = method523(arg0);
								}
								var52 = var26[var59 - var25[var58]];
							} while (var52 == 0 || var52 == 1);
							++var55;
							var1 = arg0.aByteArray10[arg0.aByteArray11[arg0.anIntArray217[0]] & 255];
							arg0.anIntArray213[var1 & 255] += var55;
							while (var55 > 0) {
								Class36.anIntArray216[var54] = var1 & 255;
								++var54;
								--var55;
							}
						}
					}
					arg0.anInt745 = 0;
					arg0.aByte38 = 0;
					arg0.anIntArray214[0] = 0;
					for (var42 = 1; var42 <= 256; ++var42) {
						arg0.anIntArray214[var42] = arg0.anIntArray213[var42 - 1];
					}
					for (var42 = 1; var42 <= 256; ++var42) {
						arg0.anIntArray214[var42] += arg0.anIntArray214[var42 - 1];
					}
					for (var42 = 0; var42 < var54; ++var42) {
						var1 = (byte) (Class36.anIntArray216[var42] & 255);
						Class36.anIntArray216[arg0.anIntArray214[var1 & 255]] |= var42 << 8;
						++arg0.anIntArray214[var1 & 255];
					}
					arg0.anInt751 = Class36.anIntArray216[arg0.anInt750] >> 8;
					arg0.anInt753 = 0;
					arg0.anInt751 = Class36.anIntArray216[arg0.anInt751];
					arg0.anInt752 = (byte) (arg0.anInt751 & 255);
					arg0.anInt751 >>= 8;
					++arg0.anInt753;
					arg0.anInt755 = var54;
					method520(arg0);
					if (arg0.anInt753 == arg0.anInt755 + 1 && arg0.anInt745 == 0) {
						var27 = true;
						break;
					}
					var27 = false;
					break;
				}
			}
			return;
		}
	}

	private static byte method522(Class36 arg0) {
		return (byte) method524(8, arg0);
	}

	private static byte method523(Class36 arg0) {
		return (byte) method524(1, arg0);
	}

	private static int method524(int arg0, Class36 arg1) {
		while (arg1.anInt747 < arg0) {
			arg1.anInt746 = arg1.anInt746 << 8 | arg1.aByteArray8[arg1.anInt737] & 255;
			arg1.anInt747 += 8;
			++arg1.anInt737;
			--arg1.anInt738;
			++arg1.anInt739;
			if (arg1.anInt739 == 0) {
				++arg1.anInt740;
			}
		}
		int var3 = arg1.anInt746 >> arg1.anInt747 - arg0 & (1 << arg0) - 1;
		arg1.anInt747 -= arg0;
		return var3;
	}

	private static void method525(Class36 arg0) {
		arg0.anInt754 = 0;
		for (int var1 = 0; var1 < 256; ++var1) {
			if (arg0.aBooleanArray5[var1]) {
				arg0.aByteArray10[arg0.anInt754] = (byte) var1;
				++arg0.anInt754;
			}
		}
	}

	private static void method526(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		int var8;
		for (var8 = arg4; var8 <= arg5; ++var8) {
			for (int var9 = 0; var9 < arg6; ++var9) {
				if (arg3[var9] == var8) {
					arg2[var7] = var9;
					++var7;
				}
			}
		}
		for (var8 = 0; var8 < 23; ++var8) {
			arg1[var8] = 0;
		}
		for (var8 = 0; var8 < arg6; ++var8) {
			++arg1[arg3[var8] + 1];
		}
		for (var8 = 1; var8 < 23; ++var8) {
			arg1[var8] += arg1[var8 - 1];
		}
		for (var8 = 0; var8 < 23; ++var8) {
			arg0[var8] = 0;
		}
		int var10 = 0;
		for (var8 = arg4; var8 <= arg5; ++var8) {
			var10 += arg1[var8 + 1] - arg1[var8];
			arg0[var8] = var10 - 1;
			var10 <<= 1;
		}
		for (var8 = arg4 + 1; var8 <= arg5; ++var8) {
			arg1[var8] = (arg0[var8 - 1] + 1 << 1) - arg1[var8];
		}
	}
}
