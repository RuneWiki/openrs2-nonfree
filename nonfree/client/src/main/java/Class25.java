import sign.signlink;

public final class Class25 {

	private static boolean aBoolean136;

	private static int anInt639 = 24882;

	private static int anInt640 = -178;

	private static int anInt641;

	private static int anInt642 = 16180;

	private static int anInt643 = 383;

	private static byte aByte31 = 6;

	private static int anInt644 = -81;

	private static boolean aBoolean137;

	private static int[] anIntArray195;

	private static char[][] aCharArrayArray1;

	private static byte[][][] aByteArrayArrayArray8;

	private static char[][] aCharArrayArray2;

	private static char[][] aCharArrayArray3;

	private static int[] anIntArray196;

	private static final String[] aStringArray11 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	public static final void method414(Class39 arg0) {
		Class1_Sub3_Sub3 var1 = new Class1_Sub3_Sub3(363, arg0.method536("fragmentsenc.txt", (byte[]) null, (byte) 2));
		Class1_Sub3_Sub3 var2 = new Class1_Sub3_Sub3(363, arg0.method536("badenc.txt", (byte[]) null, (byte) 2));
		Class1_Sub3_Sub3 var3 = new Class1_Sub3_Sub3(363, arg0.method536("domainenc.txt", (byte[]) null, (byte) 2));
		Class1_Sub3_Sub3 var4 = new Class1_Sub3_Sub3(363, arg0.method536("tldlist.txt", (byte[]) null, (byte) 2));
		method415(var1, var2, var3, var4);
	}

	private static final void method415(Class1_Sub3_Sub3 arg0, Class1_Sub3_Sub3 arg1, Class1_Sub3_Sub3 arg2, Class1_Sub3_Sub3 arg3) {
		method417(-33152, arg1);
		method418(arg2, -717);
		method419(24882, arg0);
		method416(true, arg3);
	}

	private static final void method416(boolean arg0, Class1_Sub3_Sub3 arg1) {
		try {
			int var2 = arg1.method396();
			aCharArrayArray3 = new char[var2][];
			anIntArray196 = new int[var2];
			if (arg0) {
				for (int var3 = 0; var3 < var2; ++var3) {
					anIntArray196[var3] = arg1.method391();
					char[] var4 = new char[arg1.method391()];
					for (int var5 = 0; var5 < var4.length; ++var5) {
						var4[var5] = (char) arg1.method391();
					}
					aCharArrayArray3[var3] = var4;
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("86833, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	private static final void method417(int arg0, Class1_Sub3_Sub3 arg1) {
		try {
			int var2 = arg1.method396();
			if (arg0 != -33152) {
				for (int var3 = 1; var3 > 0; ++var3) {
				}
			}
			aCharArrayArray1 = new char[var2][];
			aByteArrayArrayArray8 = new byte[var2][][];
			method420(aByteArrayArrayArray8, aCharArrayArray1, arg1, (byte) 1);
		} catch (RuntimeException var4) {
			signlink.reporterror("34550, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private static final void method418(Class1_Sub3_Sub3 arg0, int arg1) {
		try {
			int var2 = arg0.method396();
			if (arg1 < 0) {
				aCharArrayArray2 = new char[var2][];
				method421(-178, arg0, aCharArrayArray2);
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("77072, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private static final void method419(int arg0, Class1_Sub3_Sub3 arg1) {
		try {
			anIntArray195 = new int[arg1.method396()];
			for (int var2 = 0; var2 < anIntArray195.length; ++var2) {
				anIntArray195[var2] = arg1.method393();
			}
			if (arg0 != anInt639) {
				aBoolean136 = !aBoolean136;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("14267, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private static final void method420(byte[][][] arg0, char[][] arg1, Class1_Sub3_Sub3 arg2, byte arg3) {
		try {
			if (arg3 == 1) {
				boolean var10 = false;
				for (int var4 = 0; var4 < arg1.length; ++var4) {
					char[] var5 = new char[arg2.method391()];
					for (int var6 = 0; var6 < var5.length; ++var6) {
						var5[var6] = (char) arg2.method391();
					}
					arg1[var4] = var5;
					byte[][] var7 = new byte[arg2.method391()][2];
					for (int var8 = 0; var8 < var7.length; ++var8) {
						var7[var8][0] = (byte) arg2.method391();
						var7[var8][1] = (byte) arg2.method391();
					}
					if (var7.length > 0) {
						arg0[var4] = var7;
					}
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("31506, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	private static final void method421(int arg0, Class1_Sub3_Sub3 arg1, char[][] arg2) {
		try {
			label35: while (true) {
				int var3;
				if (arg0 >= 0) {
					var3 = 1;
					while (true) {
						if (var3 <= 0) {
							continue label35;
						}
						++var3;
					}
				}
				for (var3 = 0; var3 < arg2.length; ++var3) {
					char[] var4 = new char[arg1.method391()];
					for (int var5 = 0; var5 < var4.length; ++var5) {
						var4[var5] = (char) arg1.method391();
					}
					arg2[var3] = var4;
				}
				return;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("81110, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	private static final void method422(char[] arg0, int arg1) {
		try {
			int var2 = 0;
			for (int var3 = 0; var3 < arg0.length; ++var3) {
				if (method423(16180, arg0[var3])) {
					arg0[var2] = arg0[var3];
				} else {
					arg0[var2] = ' ';
				}
				if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
					++var2;
				}
			}
			if (arg1 != 0) {
				aBoolean136 = !aBoolean136;
			}
			for (int var4 = var2; var4 < arg0.length; ++var4) {
				arg0[var4] = ' ';
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("86890, " + arg0 + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	private static final boolean method423(int arg0, char arg1) {
		try {
			if (arg0 != anInt642) {
				throw new NullPointerException();
			} else {
				return arg1 >= ' ' && arg1 <= 127 || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == 163 || arg1 == 8364;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("68887, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public static final String method424(String arg0, int arg1) {
		try {
			long var2 = System.currentTimeMillis();
			char[] var4 = arg0.toCharArray();
			method422(var4, 0);
			String var5 = (new String(var4)).trim();
			char[] var12 = var5.toLowerCase().toCharArray();
			String var6 = var5.toLowerCase();
			method432(var12, 0);
			method427(true, var12);
			method428((byte) 120, var12);
			method441(8, var12);
			int var8;
			for (int var7 = 0; var7 < aStringArray11.length; ++var7) {
				var8 = -1;
				while ((var8 = var6.indexOf(aStringArray11[var7], var8 + 1)) != -1) {
					char[] var9 = aStringArray11[var7].toCharArray();
					for (int var10 = 0; var10 < var9.length; ++var10) {
						var12[var10 + var8] = var9[var10];
					}
				}
			}
			if (arg1 != 0) {
				for (var8 = 1; var8 > 0; ++var8) {
				}
			}
			method425(var12, 135, var5.toCharArray());
			method426((byte) 6, var12);
			long var13 = System.currentTimeMillis();
			return (new String(var12)).trim();
		} catch (RuntimeException var11) {
			signlink.reporterror("37188, " + arg0 + ", " + arg1 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	private static final void method425(char[] arg0, int arg1, char[] arg2) {
		try {
			for (int var3 = 0; var3 < arg2.length; ++var3) {
				if (arg0[var3] != '*' && method449(0, arg2[var3])) {
					arg0[var3] = arg2[var3];
				}
			}
			int var5 = 76 / arg1;
		} catch (RuntimeException var4) {
			signlink.reporterror("76099, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private static final void method426(byte arg0, char[] arg1) {
		try {
			boolean var2 = true;
			if (arg0 == 6) {
				boolean var6 = false;
				for (int var3 = 0; var3 < arg1.length; ++var3) {
					char var4 = arg1[var3];
					if (method446(-175, var4)) {
						if (var2) {
							if (method448((byte) 0, var4)) {
								var2 = false;
							}
						} else if (method449(0, var4)) {
							arg1[var3] = (char) (var4 + 'a' - 65);
						}
					} else {
						var2 = true;
					}
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("18272, " + arg0 + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	private static final void method427(boolean arg0, char[] arg1) {
		try {
			for (int var2 = 0; var2 < 2; ++var2) {
				for (int var3 = aCharArrayArray1.length - 1; var3 >= 0; --var3) {
					method436((byte) -102, aByteArrayArrayArray8[var3], arg1, aCharArrayArray1[var3]);
				}
			}
			if (arg0) {
				;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("90308, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private static final void method428(byte arg0, char[] arg1) {
		try {
			char[] var2 = (char[]) arg1.clone();
			char[] var3 = new char[] { '(', 'a', ')' };
			method436((byte) -102, (byte[][]) null, var2, var3);
			char[] var4 = (char[]) arg1.clone();
			char[] var5 = new char[] { 'd', 'o', 't' };
			method436((byte) -102, (byte[][]) null, var4, var5);
			if (arg0 == 120) {
				for (int var6 = aCharArrayArray2.length - 1; var6 >= 0; --var6) {
					method429(var4, -706, var2, aCharArrayArray2[var6], arg1);
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("68434, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	private static final void method429(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
		try {
			if (arg3.length <= arg4.length) {
				boolean var5 = true;
				if (arg1 >= 0) {
					anInt642 = -499;
				}
				int var14;
				for (int var6 = 0; var6 <= arg4.length - arg3.length; var6 += var14) {
					int var7 = var6;
					int var8 = 0;
					var14 = 1;
					boolean var9;
					label62: while (true) {
						while (true) {
							if (var7 >= arg4.length) {
								break label62;
							}
							var9 = false;
							char var10 = arg4[var7];
							char var11 = 0;
							if (var7 + 1 < arg4.length) {
								var11 = arg4[var7 + 1];
							}
							int var15;
							if (var8 < arg3.length && (var15 = method438(-81, var11, arg3[var8], var10)) > 0) {
								var7 += var15;
								++var8;
							} else {
								if (var8 == 0) {
									break label62;
								}
								int var16;
								if ((var16 = method438(-81, var11, arg3[var8 - 1], var10)) > 0) {
									var7 += var16;
									if (var8 == 1) {
										++var14;
									}
								} else {
									if (var8 >= arg3.length || !method444(var10, 2)) {
										break label62;
									}
									++var7;
								}
							}
						}
					}
					if (var8 >= arg3.length) {
						var9 = false;
						int var17 = method430(var6, arg4, (byte) 6, arg2);
						int var18 = method431(arg0, arg4, var7 - 1, -808);
						if (var17 > 2 || var18 > 2) {
							var9 = true;
						}
						if (var9) {
							for (int var12 = var6; var12 < var7; ++var12) {
								arg4[var12] = '*';
							}
						}
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("98022, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	private static final int method430(int arg0, char[] arg1, byte arg2, char[] arg3) {
		try {
			if (arg0 == 0) {
				return 2;
			} else {
				for (int var4 = arg0 - 1; var4 >= 0 && method444(arg1[var4], 2); --var4) {
					if (arg1[var4] == '@') {
						return 3;
					}
				}
				if (arg2 != aByte31) {
					return anInt640;
				} else {
					boolean var8 = false;
					int var5 = 0;
					for (int var6 = arg0 - 1; var6 >= 0 && method444(arg3[var6], 2); --var6) {
						if (arg3[var6] == '*') {
							++var5;
						}
					}
					if (var5 >= 3) {
						return 4;
					} else {
						return method444(arg1[arg0 - 1], 2) ? 1 : 0;
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("51966, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	private static final int method431(char[] arg0, char[] arg1, int arg2, int arg3) {
		try {
			if (arg3 >= 0) {
				return anInt641;
			} else if (arg2 + 1 == arg1.length) {
				return 2;
			} else {
				int var4 = arg2 + 1;
				while (true) {
					if (var4 < arg1.length && method444(arg1[var4], 2)) {
						if (arg1[var4] != '.' && arg1[var4] != ',') {
							++var4;
							continue;
						}
						return 3;
					}
					int var5 = 0;
					for (int var6 = arg2 + 1; var6 < arg1.length && method444(arg0[var6], 2); ++var6) {
						if (arg0[var6] == '*') {
							++var5;
						}
					}
					if (var5 >= 3) {
						return 4;
					}
					if (method444(arg1[arg2 + 1], 2)) {
						return 1;
					}
					return 0;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("48464, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	private static final void method432(char[] arg0, int arg1) {
		try {
			char[] var2 = (char[]) arg0.clone();
			char[] var3 = new char[] { 'd', 'o', 't' };
			method436((byte) -102, (byte[][]) null, var2, var3);
			char[] var4 = (char[]) arg0.clone();
			char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
			if (arg1 != 0) {
				aBoolean136 = !aBoolean136;
			}
			method436((byte) -102, (byte[][]) null, var4, var5);
			for (int var6 = 0; var6 < aCharArrayArray3.length; ++var6) {
				method433(var4, anIntArray196[var6], true, arg0, aCharArrayArray3[var6], var2);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("31380, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	private static final void method433(char[] arg0, int arg1, boolean arg2, char[] arg3, char[] arg4, char[] arg5) {
		try {
			int var6;
			if (!arg2) {
				for (var6 = 1; var6 > 0; ++var6) {
				}
			}
			if (arg4.length <= arg3.length) {
				boolean var18 = true;
				for (int var7 = 0; var7 <= arg3.length - arg4.length; var7 += var6) {
					int var8 = var7;
					int var9 = 0;
					var6 = 1;
					boolean var10;
					label124: while (true) {
						while (true) {
							if (var8 >= arg3.length) {
								break label124;
							}
							var10 = false;
							char var11 = arg3[var8];
							char var12 = 0;
							if (var8 + 1 < arg3.length) {
								var12 = arg3[var8 + 1];
							}
							int var19;
							if (var9 < arg4.length && (var19 = method438(-81, var12, arg4[var9], var11)) > 0) {
								var8 += var19;
								++var9;
							} else {
								if (var9 == 0) {
									break label124;
								}
								int var20;
								if ((var20 = method438(-81, var12, arg4[var9 - 1], var11)) > 0) {
									var8 += var20;
									if (var9 == 1) {
										++var6;
									}
								} else {
									if (var9 >= arg4.length || !method444(var11, 2)) {
										break label124;
									}
									++var8;
								}
							}
						}
					}
					if (var9 >= arg4.length) {
						var10 = false;
						int var21 = method434(arg3, false, arg5, var7);
						int var22 = method435(arg0, -678, var8 - 1, arg3);
						if (arg1 == 1 && var21 > 0 && var22 > 0) {
							var10 = true;
						}
						if (arg1 == 2 && (var21 > 2 && var22 > 0 || var21 > 0 && var22 > 2)) {
							var10 = true;
						}
						if (arg1 == 3 && var21 > 0 && var22 > 2) {
							var10 = true;
						}
						boolean var10000;
						if (arg1 == 3 && var21 > 2 && var22 > 0) {
							var10000 = true;
						} else {
							var10000 = false;
						}
						if (var10) {
							int var13 = var7;
							int var14 = var8 - 1;
							boolean var15;
							int var16;
							if (var21 > 2) {
								if (var21 == 4) {
									var15 = false;
									for (var16 = var7 - 1; var16 >= 0; --var16) {
										if (var15) {
											if (arg5[var16] != '*') {
												break;
											}
											var13 = var16;
										} else if (arg5[var16] == '*') {
											var13 = var16;
											var15 = true;
										}
									}
								}
								var15 = false;
								for (var16 = var13 - 1; var16 >= 0; --var16) {
									if (var15) {
										if (method444(arg3[var16], 2)) {
											break;
										}
										var13 = var16;
									} else if (!method444(arg3[var16], 2)) {
										var15 = true;
										var13 = var16;
									}
								}
							}
							if (var22 > 2) {
								if (var22 == 4) {
									var15 = false;
									for (var16 = var14 + 1; var16 < arg3.length; ++var16) {
										if (var15) {
											if (arg0[var16] != '*') {
												break;
											}
											var14 = var16;
										} else if (arg0[var16] == '*') {
											var14 = var16;
											var15 = true;
										}
									}
								}
								var15 = false;
								for (var16 = var14 + 1; var16 < arg3.length; ++var16) {
									if (var15) {
										if (method444(arg3[var16], 2)) {
											break;
										}
										var14 = var16;
									} else if (!method444(arg3[var16], 2)) {
										var15 = true;
										var14 = var16;
									}
								}
							}
							for (int var23 = var13; var23 <= var14; ++var23) {
								arg3[var23] = '*';
							}
						}
					}
				}
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("17147, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	private static final int method434(char[] arg0, boolean arg1, char[] arg2, int arg3) {
		try {
			if (arg3 == 0) {
				return 2;
			} else {
				int var4 = arg3 - 1;
				while (true) {
					if (var4 >= 0 && method444(arg0[var4], 2)) {
						if (arg0[var4] != ',' && arg0[var4] != '.') {
							--var4;
							continue;
						}
						return 3;
					}
					int var5 = 0;
					int var6;
					if (arg1) {
						for (var6 = 1; var6 > 0; ++var6) {
						}
					}
					for (var6 = arg3 - 1; var6 >= 0 && method444(arg2[var6], 2); --var6) {
						if (arg2[var6] == '*') {
							++var5;
						}
					}
					if (var5 >= 3) {
						return 4;
					}
					if (method444(arg0[arg3 - 1], 2)) {
						return 1;
					}
					return 0;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("73918, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	private static final int method435(char[] arg0, int arg1, int arg2, char[] arg3) {
		try {
			if (arg2 + 1 == arg3.length) {
				return 2;
			} else {
				int var4 = arg2 + 1;
				while (true) {
					if (var4 < arg3.length && method444(arg3[var4], 2)) {
						if (arg3[var4] != '\\' && arg3[var4] != '/') {
							++var4;
							continue;
						}
						return 3;
					}
					int var5 = 0;
					for (int var6 = arg2 + 1; var6 < arg3.length && method444(arg0[var6], 2); ++var6) {
						if (arg0[var6] == '*') {
							++var5;
						}
					}
					if (arg1 >= 0) {
						return 3;
					}
					if (var5 >= 5) {
						return 4;
					}
					if (method444(arg3[arg2 + 1], 2)) {
						return 1;
					}
					return 0;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("17610, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public static final void method436(byte arg0, byte[][] arg1, char[] arg2, char[] arg3) {
		try {
			if (arg3.length <= arg2.length) {
				boolean var4 = true;
				if (arg0 != -102) {
					anInt643 = -198;
				}
				int var21;
				for (int var5 = 0; var5 <= arg2.length - arg3.length; var5 += var21) {
					int var6 = var5;
					int var7 = 0;
					int var8 = 0;
					var21 = 1;
					boolean var9 = false;
					boolean var10 = false;
					boolean var11 = false;
					boolean var12;
					char var13;
					char var14;
					label163: while (true) {
						while (true) {
							if (var6 >= arg2.length || var10 && var11) {
								break label163;
							}
							var12 = false;
							var13 = arg2[var6];
							var14 = 0;
							if (var6 + 1 < arg2.length) {
								var14 = arg2[var6 + 1];
							}
							int var22;
							if (var7 < arg3.length && (var22 = method439(var14, arg3[var7], var13, 7326)) > 0) {
								if (var22 == 1 && method447(var13, 10361)) {
									var10 = true;
								}
								if (var22 == 2 && (method447(var13, 10361) || method447(var14, 10361))) {
									var10 = true;
								}
								var6 += var22;
								++var7;
							} else {
								if (var7 == 0) {
									break label163;
								}
								int var23;
								if ((var23 = method439(var14, arg3[var7 - 1], var13, 7326)) > 0) {
									var6 += var23;
									if (var7 == 1) {
										++var21;
									}
								} else {
									if (var7 >= arg3.length || !method445(var13, (byte) 13)) {
										break label163;
									}
									if (method444(var13, 2) && var13 != '\'') {
										var9 = true;
									}
									if (method447(var13, 10361)) {
										var11 = true;
									}
									++var6;
									++var8;
									if (var8 * 100 / (var6 - var5) > 90) {
										break label163;
									}
								}
							}
						}
					}
					if (var7 >= arg3.length && (!var10 || !var11)) {
						var12 = true;
						int var29;
						if (!var9) {
							var13 = ' ';
							if (var5 - 1 >= 0) {
								var13 = arg2[var5 - 1];
							}
							var14 = ' ';
							if (var6 < arg2.length) {
								var14 = arg2[var6];
							}
							byte var15 = method440(0, var13);
							byte var16 = method440(0, var14);
							if (arg1 != null && method437(841, var15, arg1, var16)) {
								var12 = false;
							}
						} else {
							boolean var24 = false;
							boolean var28 = false;
							if (var5 - 1 < 0 || method444(arg2[var5 - 1], 2) && arg2[var5 - 1] != '\'') {
								var24 = true;
							}
							if (var6 >= arg2.length || method444(arg2[var6], 2) && arg2[var6] != '\'') {
								var28 = true;
							}
							if (!var24 || !var28) {
								boolean var25 = false;
								var29 = var5 - 2;
								if (var24) {
									var29 = var5;
								}
								while (!var25 && var29 < var6) {
									if (var29 >= 0 && (!method444(arg2[var29], 2) || arg2[var29] == '\'')) {
										char[] var17 = new char[3];
										int var18;
										for (var18 = 0; var18 < 3 && var29 + var18 < arg2.length && (!method444(arg2[var29 + var18], 2) || arg2[var29 + var18] == '\''); ++var18) {
											var17[var18] = arg2[var29 + var18];
										}
										boolean var19 = true;
										if (var18 == 0) {
											var19 = false;
										}
										if (var18 < 3 && var29 - 1 >= 0 && (!method444(arg2[var29 - 1], 2) || arg2[var29 - 1] == '\'')) {
											var19 = false;
										}
										if (var19 && !method450(var17, 6)) {
											var25 = true;
										}
									}
									++var29;
								}
								if (!var25) {
									var12 = false;
								}
							}
						}
						if (var12) {
							int var26 = 0;
							int var30 = 0;
							for (int var27 = var5; var27 < var6; ++var27) {
								if (method447(arg2[var27], 10361)) {
									++var26;
								} else if (method446(-175, arg2[var27])) {
									++var30;
								}
							}
							if (var26 <= var30) {
								for (var29 = var5; var29 < var6; ++var29) {
									arg2[var29] = '*';
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var20) {
			signlink.reporterror("10220, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var20.toString());
			throw new RuntimeException();
		}
	}

	private static final boolean method437(int arg0, byte arg1, byte[][] arg2, byte arg3) {
		try {
			if (arg0 <= 0) {
				aBoolean137 = !aBoolean137;
			}
			int var4 = 0;
			if (arg2[var4][0] == arg1 && arg2[var4][1] == arg3) {
				return true;
			} else {
				int var5 = arg2.length - 1;
				if (arg2[var5][0] == arg1 && arg2[var5][1] == arg3) {
					return true;
				} else {
					do {
						int var6 = (var4 + var5) / 2;
						if (arg2[var6][0] == arg1 && arg2[var6][1] == arg3) {
							return true;
						}
						if (arg1 >= arg2[var6][0] && (arg1 != arg2[var6][0] || arg3 >= arg2[var6][1])) {
							var4 = var6;
						} else {
							var5 = var6;
						}
					} while (var4 != var5 && var4 + 1 != var5);
					return false;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("65186, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	private static final int method438(int arg0, char arg1, char arg2, char arg3) {
		try {
			while (arg0 >= 0) {
				for (int var4 = 1; var4 > 0; ++var4) {
				}
			}
			if (arg2 == arg3) {
				return 1;
			} else if (arg2 == 'o' && arg3 == '0') {
				return 1;
			} else if (arg2 == 'o' && arg3 == '(' && arg1 == ')') {
				return 2;
			} else if (arg2 != 'c' || arg3 != '(' && arg3 != '<' && arg3 != '[') {
				if (arg2 == 'e' && arg3 == 8364) {
					return 1;
				} else if (arg2 == 's' && arg3 == '$') {
					return 1;
				} else if (arg2 == 'l' && arg3 == 'i') {
					return 1;
				} else {
					return 0;
				}
			} else {
				return 1;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("22330, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	private static final int method439(char arg0, char arg1, char arg2, int arg3) {
		try {
			if (arg3 != 7326) {
				for (int var4 = 1; var4 > 0; ++var4) {
				}
			}
			if (arg1 == arg2) {
				return 1;
			} else {
				if (arg1 >= 'a' && arg1 <= 'm') {
					if (arg1 == 'a') {
						if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
							if (arg2 == '/' && arg0 == '\\') {
								return 2;
							}
							return 0;
						}
						return 1;
					}
					if (arg1 == 'b') {
						if (arg2 != '6' && arg2 != '8') {
							if (arg2 == '1' && arg0 == '3') {
								return 2;
							}
							return 0;
						}
						return 1;
					}
					if (arg1 == 'c') {
						if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
							return 0;
						}
						return 1;
					}
					if (arg1 == 'd') {
						if (arg2 == '[' && arg0 == ')') {
							return 2;
						}
						return 0;
					}
					if (arg1 == 'e') {
						if (arg2 != '3' && arg2 != 8364) {
							return 0;
						}
						return 1;
					}
					if (arg1 == 'f') {
						if (arg2 == 'p' && arg0 == 'h') {
							return 2;
						}
						if (arg2 == 163) {
							return 1;
						}
						return 0;
					}
					if (arg1 == 'g') {
						if (arg2 != '9' && arg2 != '6') {
							return 0;
						}
						return 1;
					}
					if (arg1 == 'h') {
						if (arg2 == '#') {
							return 1;
						}
						return 0;
					}
					if (arg1 == 'i') {
						if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
							return 0;
						}
						return 1;
					}
					if (arg1 == 'j') {
						return 0;
					}
					if (arg1 == 'k') {
						return 0;
					}
					if (arg1 == 'l') {
						if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
							return 0;
						}
						return 1;
					}
					if (arg1 == 'm') {
						return 0;
					}
				}
				if (arg1 >= 'n' && arg1 <= 'z') {
					if (arg1 == 'n') {
						return 0;
					}
					if (arg1 == 'o') {
						if (arg2 != '0' && arg2 != '*') {
							if ((arg2 != '(' || arg0 != ')') && (arg2 != '[' || arg0 != ']') && (arg2 != '{' || arg0 != '}') && (arg2 != '<' || arg0 != '>')) {
								return 0;
							}
							return 2;
						}
						return 1;
					}
					if (arg1 == 'p') {
						return 0;
					}
					if (arg1 == 'q') {
						return 0;
					}
					if (arg1 == 'r') {
						return 0;
					}
					if (arg1 == 's') {
						if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
							return 0;
						}
						return 1;
					}
					if (arg1 == 't') {
						if (arg2 != '7' && arg2 != '+') {
							return 0;
						}
						return 1;
					}
					if (arg1 == 'u') {
						if (arg2 == 'v') {
							return 1;
						}
						if (arg2 == '\\' && arg0 == '/' || arg2 == '\\' && arg0 == '|' || arg2 == '|' && arg0 == '/') {
							return 2;
						}
						return 0;
					}
					if (arg1 == 'v') {
						if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
							return 0;
						}
						return 2;
					}
					if (arg1 == 'w') {
						if (arg2 == 'v' && arg0 == 'v') {
							return 2;
						}
						return 0;
					}
					if (arg1 == 'x') {
						if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
							return 0;
						}
						return 2;
					}
					if (arg1 == 'y') {
						return 0;
					}
					if (arg1 == 'z') {
						return 0;
					}
				}
				if (arg1 >= '0' && arg1 <= '9') {
					if (arg1 != '0') {
						if (arg1 == '1') {
							return arg2 == 'l' ? 1 : 0;
						} else {
							return 0;
						}
					} else if (arg2 != 'o' && arg2 != 'O') {
						return (arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']') ? 0 : 2;
					} else {
						return 1;
					}
				} else if (arg1 == ',') {
					return arg2 == '.' ? 1 : 0;
				} else if (arg1 == '.') {
					return arg2 == ',' ? 1 : 0;
				} else if (arg1 == '!') {
					return arg2 == 'i' ? 1 : 0;
				} else {
					return 0;
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("72478, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	private static final byte method440(int arg0, char arg1) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			} else if (arg1 >= 'a' && arg1 <= 'z') {
				return (byte) (arg1 - 'a' + 1);
			} else if (arg1 == '\'') {
				return 28;
			} else {
				return arg1 >= '0' && arg1 <= '9' ? (byte) (arg1 - '0' + 29) : 27;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("37807, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private static final void method441(int arg0, char[] arg1) {
		try {
			boolean var2 = false;
			int var3 = 0;
			if (arg0 == 8) {
				int var4 = 0;
				int var5 = 0;
				while (true) {
					do {
						int var12;
						if ((var12 = method442(149, arg1, var3)) == -1) {
							return;
						}
						boolean var6 = false;
						for (int var7 = var3; var7 >= 0 && var7 < var12 && !var6; ++var7) {
							if (!method444(arg1[var7], 2) && !method445(arg1[var7], (byte) 13)) {
								var6 = true;
							}
						}
						if (var6) {
							var4 = 0;
						}
						if (var4 == 0) {
							var5 = var12;
						}
						var3 = method443(6, var12, arg1);
						int var8 = 0;
						for (int var9 = var12; var9 < var3; ++var9) {
							var8 = var8 * 10 + arg1[var9] - 48;
						}
						if (var8 <= 255 && var3 - var12 <= 8) {
							++var4;
						} else {
							var4 = 0;
						}
					} while (var4 != 4);
					for (int var10 = var5; var10 < var3; ++var10) {
						arg1[var10] = '*';
					}
					var4 = 0;
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("18716, " + arg0 + ", " + arg1 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	private static final int method442(int arg0, char[] arg1, int arg2) {
		try {
			int var5 = 66 / arg0;
			for (int var3 = arg2; var3 < arg1.length && var3 >= 0; ++var3) {
				if (arg1[var3] >= '0' && arg1[var3] <= '9') {
					return var3;
				}
			}
			return -1;
		} catch (RuntimeException var4) {
			signlink.reporterror("34666, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private static final int method443(int arg0, int arg1, char[] arg2) {
		try {
			if (arg0 != 6) {
				return 4;
			} else {
				int var3 = arg1;
				while (true) {
					if (var3 < arg2.length && var3 >= 0) {
						if (arg2[var3] >= '0' && arg2[var3] <= '9') {
							++var3;
							continue;
						}
						return var3;
					}
					return arg2.length;
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("22999, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private static final boolean method444(char arg0, int arg1) {
		try {
			if (arg1 != 2) {
				throw new NullPointerException();
			} else {
				return !method446(-175, arg0) && !method447(arg0, 10361);
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("40138, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private static final boolean method445(char arg0, byte arg1) {
		try {
			if (arg1 != 13) {
				throw new NullPointerException();
			} else if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("85337, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private static final boolean method446(int arg0, char arg1) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			} else {
				return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("88324, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private static final boolean method447(char arg0, int arg1) {
		try {
			if (arg1 != 10361) {
				anInt639 = -124;
			}
			return arg0 >= '0' && arg0 <= '9';
		} catch (RuntimeException var3) {
			signlink.reporterror("12677, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private static final boolean method448(byte arg0, char arg1) {
		try {
			if (arg0 != 0) {
				anInt640 = -254;
			}
			return arg1 >= 'a' && arg1 <= 'z';
		} catch (RuntimeException var3) {
			signlink.reporterror("54545, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private static final boolean method449(int arg0, char arg1) {
		try {
			if (arg0 < 0 || arg0 > 0) {
				aBoolean136 = !aBoolean136;
			}
			return arg1 >= 'A' && arg1 <= 'Z';
		} catch (RuntimeException var3) {
			signlink.reporterror("31350, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	private static final boolean method450(char[] arg0, int arg1) {
		try {
			boolean var2 = true;
			for (int var3 = 0; var3 < arg0.length; ++var3) {
				if (!method447(arg0[var3], 10361) && arg0[var3] != 0) {
					var2 = false;
				}
			}
			if (var2) {
				return true;
			} else {
				int var4 = method451(5, arg0);
				int var5 = 0;
				int var6;
				if (arg1 != 6) {
					for (var6 = 1; var6 > 0; ++var6) {
					}
				}
				var6 = anIntArray195.length - 1;
				if (var4 != anIntArray195[var5] && var4 != anIntArray195[var6]) {
					do {
						int var7 = (var5 + var6) / 2;
						if (var4 == anIntArray195[var7]) {
							return true;
						}
						if (var4 < anIntArray195[var7]) {
							var6 = var7;
						} else {
							var5 = var7;
						}
					} while (var5 != var6 && var5 + 1 != var6);
					return false;
				} else {
					return true;
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("69798, " + arg0 + ", " + arg1 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public static final int method451(int arg0, char[] arg1) {
		try {
			if (arg1.length > 6) {
				return 0;
			} else {
				int var2 = 0;
				for (int var3 = 0; var3 < arg1.length; ++var3) {
					char var4 = arg1[arg1.length - var3 - 1];
					if (var4 >= 'a' && var4 <= 'z') {
						var2 = var2 * 38 + var4 - 'a' + 1;
					} else if (var4 == '\'') {
						var2 = var2 * 38 + 27;
					} else if (var4 >= '0' && var4 <= '9') {
						var2 = var2 * 38 + var4 - '0' + 28;
					} else if (var4 != 0) {
						return 0;
					}
				}
				if (arg0 < 5 || arg0 > 5) {
					for (int var6 = 1; var6 > 0; ++var6) {
					}
				}
				return var2;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("78520, " + arg0 + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}
}
