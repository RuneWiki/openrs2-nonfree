import sign.signlink;

final class Class5 {

	private static int anInt98;

	private boolean aBoolean28 = false;

	private static int anInt99 = -192;

	private int anInt100 = -22246;

	private static int anInt101;

	private static int[] anIntArray23;

	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_3;

	private static Class5[] aClass5Array1;

	private static int anInt102;

	public static boolean aBoolean29 = true;

	public int anInt103 = -1;

	private int anInt104;

	public String aString3;

	public byte[] aByteArray3;

	private int[] anIntArray24;

	private int[] anIntArray25;

	public int anInt105;

	public int anInt106;

	public int anInt107;

	private int anInt108;

	private int anInt109;

	private int anInt110;

	private boolean aBoolean30;

	public int anInt111;

	public boolean aBoolean31;

	public int anInt112;

	public boolean aBoolean32;

	public String[] aStringArray3;

	public String[] aStringArray4;

	private int anInt113;

	private int anInt114;

	private byte aByte5;

	private int anInt115;

	private int anInt116;

	private byte aByte6;

	public int anInt117;

	public int anInt118;

	private int anInt119;

	public int anInt120;

	public int anInt121;

	public int anInt122;

	public int[] anIntArray26;

	public int[] anIntArray27;

	public int anInt123;

	public int anInt124;

	public static Class35 aClass35_4 = new Class35((byte) 0, 50);

	static Class35 aClass35_5 = new Class35((byte) 0, 200);

	public static final void method52(Class39 arg0) {
		aClass1_Sub3_Sub3_3 = new Class1_Sub3_Sub3(363, arg0.method536("obj.dat", (byte[]) null, (byte) 2));
		Class1_Sub3_Sub3 var1 = new Class1_Sub3_Sub3(363, arg0.method536("obj.idx", (byte[]) null, (byte) 2));
		anInt101 = var1.method393();
		anIntArray23 = new int[anInt101];
		int var2 = 2;
		for (int var3 = 0; var3 < anInt101; ++var3) {
			anIntArray23[var3] = var2;
			var2 += var1.method393();
		}
		aClass5Array1 = new Class5[10];
		for (int var4 = 0; var4 < 10; ++var4) {
			aClass5Array1[var4] = new Class5();
		}
	}

	public static final void method53(boolean arg0) {
		try {
			aClass35_4 = null;
			aClass35_5 = null;
			anIntArray23 = null;
			aClass5Array1 = null;
			aClass1_Sub3_Sub3_3 = null;
			if (!arg0) {
				anInt98 = -296;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("12851, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public static final Class5 method54(int arg0) {
		for (int var1 = 0; var1 < 10; ++var1) {
			if (aClass5Array1[var1].anInt103 == arg0) {
				return aClass5Array1[var1];
			}
		}
		anInt102 = (anInt102 + 1) % 10;
		Class5 var2 = aClass5Array1[anInt102];
		aClass1_Sub3_Sub3_3.anInt561 = anIntArray23[arg0];
		var2.anInt103 = arg0;
		var2.method55();
		var2.method56(false, aClass1_Sub3_Sub3_3);
		if (var2.anInt124 != -1) {
			var2.method57(-856);
		}
		if (!aBoolean29 && var2.aBoolean32) {
			var2.aString3 = "Members Object";
			var2.aByteArray3 = "Login to a members' server to use this object.".getBytes();
			var2.aStringArray3 = null;
			var2.aStringArray4 = null;
		}
		return var2;
	}

	public final void method55() {
		this.anInt104 = 0;
		this.aString3 = null;
		this.aByteArray3 = null;
		this.anIntArray24 = null;
		this.anIntArray25 = null;
		this.anInt105 = 2000;
		this.anInt106 = 0;
		this.anInt107 = 0;
		this.anInt108 = 0;
		this.anInt109 = 0;
		this.anInt110 = 0;
		this.aBoolean30 = false;
		this.anInt111 = -1;
		this.aBoolean31 = false;
		this.anInt112 = 1;
		this.aBoolean32 = false;
		this.aStringArray3 = null;
		this.aStringArray4 = null;
		this.anInt113 = -1;
		this.anInt114 = -1;
		this.aByte5 = 0;
		this.anInt115 = -1;
		this.anInt116 = -1;
		this.aByte6 = 0;
		this.anInt117 = -1;
		this.anInt118 = -1;
		this.anInt119 = -1;
		this.anInt120 = -1;
		this.anInt121 = -1;
		this.anInt122 = -1;
		this.anIntArray26 = null;
		this.anIntArray27 = null;
		this.anInt123 = -1;
		this.anInt124 = -1;
	}

	public final void method56(boolean arg0, Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0) {
				throw new NullPointerException();
			} else {
				while (true) {
					while (true) {
						int var3 = arg1.method391();
						if (var3 == 0) {
							return;
						}
						if (var3 == 1) {
							this.anInt104 = arg1.method393();
						} else if (var3 == 2) {
							this.aString3 = arg1.method398();
						} else if (var3 == 3) {
							this.aByteArray3 = arg1.method399((byte) 31);
						} else if (var3 == 4) {
							this.anInt105 = arg1.method393();
						} else if (var3 == 5) {
							this.anInt106 = arg1.method393();
						} else if (var3 == 6) {
							this.anInt107 = arg1.method393();
						} else if (var3 == 7) {
							this.anInt109 = arg1.method393();
							if (this.anInt109 > 32767) {
								this.anInt109 -= 65536;
							}
						} else if (var3 == 8) {
							this.anInt110 = arg1.method393();
							if (this.anInt110 > 32767) {
								this.anInt110 -= 65536;
							}
						} else if (var3 == 9) {
							this.aBoolean30 = true;
						} else if (var3 == 10) {
							this.anInt111 = arg1.method393();
						} else if (var3 == 11) {
							this.aBoolean31 = true;
						} else if (var3 == 12) {
							this.anInt112 = arg1.method396();
						} else if (var3 == 16) {
							this.aBoolean32 = true;
						} else if (var3 == 23) {
							this.anInt113 = arg1.method393();
							this.aByte5 = arg1.method392();
						} else if (var3 == 24) {
							this.anInt114 = arg1.method393();
						} else if (var3 == 25) {
							this.anInt115 = arg1.method393();
							this.aByte6 = arg1.method392();
						} else if (var3 == 26) {
							this.anInt116 = arg1.method393();
						} else if (var3 >= 30 && var3 < 35) {
							if (this.aStringArray3 == null) {
								this.aStringArray3 = new String[5];
							}
							this.aStringArray3[var3 - 30] = arg1.method398();
							if (this.aStringArray3[var3 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray3[var3 - 30] = null;
							}
						} else if (var3 >= 35 && var3 < 40) {
							if (this.aStringArray4 == null) {
								this.aStringArray4 = new String[5];
							}
							this.aStringArray4[var3 - 35] = arg1.method398();
						} else if (var3 == 40) {
							int var4 = arg1.method391();
							this.anIntArray24 = new int[var4];
							this.anIntArray25 = new int[var4];
							for (int var5 = 0; var5 < var4; ++var5) {
								this.anIntArray24[var5] = arg1.method393();
								this.anIntArray25[var5] = arg1.method393();
							}
						} else if (var3 == 78) {
							this.anInt117 = arg1.method393();
						} else if (var3 == 79) {
							this.anInt118 = arg1.method393();
						} else if (var3 == 90) {
							this.anInt119 = arg1.method393();
						} else if (var3 == 91) {
							this.anInt121 = arg1.method393();
						} else if (var3 == 92) {
							this.anInt120 = arg1.method393();
						} else if (var3 == 93) {
							this.anInt122 = arg1.method393();
						} else if (var3 == 95) {
							this.anInt108 = arg1.method393();
						} else if (var3 == 97) {
							this.anInt123 = arg1.method393();
						} else if (var3 == 98) {
							this.anInt124 = arg1.method393();
						} else if (var3 >= 100 && var3 < 110) {
							if (this.anIntArray26 == null) {
								this.anIntArray26 = new int[10];
								this.anIntArray27 = new int[10];
							}
							this.anIntArray26[var3 - 100] = arg1.method393();
							this.anIntArray27[var3 - 100] = arg1.method393();
						}
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("9273, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public void method57(int arg0) {
		try {
			Class5 var2 = method54(this.anInt124);
			this.anInt104 = var2.anInt104;
			this.anInt105 = var2.anInt105;
			this.anInt106 = var2.anInt106;
			while (arg0 >= 0) {
				this.aBoolean28 = !this.aBoolean28;
			}
			this.anInt107 = var2.anInt107;
			this.anInt108 = var2.anInt108;
			this.anInt109 = var2.anInt109;
			this.anInt110 = var2.anInt110;
			this.anIntArray24 = var2.anIntArray24;
			this.anIntArray25 = var2.anIntArray25;
			Class5 var3 = method54(this.anInt123);
			this.aString3 = var3.aString3;
			this.aBoolean32 = var3.aBoolean32;
			this.anInt112 = var3.anInt112;
			String var4 = "a";
			char var5 = var3.aString3.charAt(0);
			if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
				var4 = "an";
			}
			this.aByteArray3 = ("Swap this note at any bank for " + var4 + " " + var3.aString3 + ".").getBytes();
			this.aBoolean31 = true;
		} catch (RuntimeException var6) {
			signlink.reporterror("96838, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final Class1_Sub3_Sub1 method58(int arg0) {
		int var3;
		if (this.anIntArray26 != null && arg0 > 1) {
			int var2 = -1;
			for (var3 = 0; var3 < 10; ++var3) {
				if (arg0 >= this.anIntArray27[var3] && this.anIntArray27[var3] != 0) {
					var2 = this.anIntArray26[var3];
				}
			}
			if (var2 != -1) {
				return method54(var2).method58(1);
			}
		}
		Class1_Sub3_Sub1 var4 = (Class1_Sub3_Sub1) aClass35_4.method527((long) this.anInt103);
		if (var4 != null) {
			return var4;
		} else {
			var4 = new Class1_Sub3_Sub1(false, this.anInt104);
			if (this.anIntArray24 != null) {
				for (var3 = 0; var3 < this.anIntArray24.length; ++var3) {
					var4.method237(this.anIntArray24[var3], this.anIntArray25[var3]);
				}
			}
			var4.method240(64, 768, -50, -10, -50, true);
			var4.aBoolean84 = true;
			aClass35_4.method528(6, (long) this.anInt103, var4);
			return var4;
		}
	}

	public static final Class1_Sub3_Sub2_Sub2 method59(int arg0, int arg1, int arg2) {
		try {
			Class1_Sub3_Sub2_Sub2 var3 = (Class1_Sub3_Sub2_Sub2) aClass35_5.method527((long) arg0);
			if (var3 != null && var3.anInt466 != arg2 && var3.anInt466 != -1) {
				var3.method567();
				var3 = null;
			}
			if (var3 != null) {
				return var3;
			} else {
				Class5 var4 = method54(arg0);
				if (var4.anIntArray26 == null) {
					arg2 = -1;
				}
				int var5;
				int var6;
				if (arg2 > 1) {
					var5 = -1;
					for (var6 = 0; var6 < 10; ++var6) {
						if (arg2 >= var4.anIntArray27[var6] && var4.anIntArray27[var6] != 0) {
							var5 = var4.anIntArray26[var6];
						}
					}
					if (var5 != -1) {
						var4 = method54(var5);
					}
				}
				var3 = new Class1_Sub3_Sub2_Sub2(32, 32);
				var5 = Class1_Sub3_Sub2_Sub1.anInt430;
				var6 = Class1_Sub3_Sub2_Sub1.anInt431;
				int[] var7 = Class1_Sub3_Sub2_Sub1.anIntArray139;
				int[] var8 = Class1_Sub3_Sub2.anIntArray178;
				int var9 = Class1_Sub3_Sub2.anInt528;
				int var10 = Class1_Sub3_Sub2.anInt529;
				int var11 = Class1_Sub3_Sub2.anInt532;
				int var12 = Class1_Sub3_Sub2.anInt533;
				int var13 = Class1_Sub3_Sub2.anInt530;
				int var14 = Class1_Sub3_Sub2.anInt531;
				Class1_Sub3_Sub2_Sub1.aBoolean99 = false;
				Class1_Sub3_Sub2.method354(32, var3.anIntArray148, -657, 32);
				Class1_Sub3_Sub2.method358(0, 0, 0, (byte) 93, 32, 32);
				Class1_Sub3_Sub2_Sub1.method288(anInt99);
				Class1_Sub3_Sub1 var15 = var4.method58(1);
				int var16 = Class1_Sub3_Sub2_Sub1.anIntArray137[var4.anInt106] * var4.anInt105 >> 16;
				int var17 = Class1_Sub3_Sub2_Sub1.anIntArray138[var4.anInt106] * var4.anInt105 >> 16;
				var15.method243(0, var4.anInt107, var4.anInt108, var4.anInt106, var4.anInt109, var16 + var15.anInt368 / 2 + var4.anInt110, var17 + var4.anInt110);
				if (arg1 != 24638) {
					throw new NullPointerException();
				} else {
					for (int var18 = 31; var18 >= 0; --var18) {
						for (var17 = 31; var17 >= 0; --var17) {
							if (var3.anIntArray148[var18 + var17 * 32] == 0) {
								if (var18 > 0 && var3.anIntArray148[var18 - 1 + var17 * 32] > 1) {
									var3.anIntArray148[var18 + var17 * 32] = 1;
								} else if (var17 > 0 && var3.anIntArray148[var18 + (var17 - 1) * 32] > 1) {
									var3.anIntArray148[var18 + var17 * 32] = 1;
								} else if (var18 < 31 && var3.anIntArray148[var18 + 1 + var17 * 32] > 1) {
									var3.anIntArray148[var18 + var17 * 32] = 1;
								} else if (var17 < 31 && var3.anIntArray148[var18 + (var17 + 1) * 32] > 1) {
									var3.anIntArray148[var18 + var17 * 32] = 1;
								}
							}
						}
					}
					for (int var19 = 31; var19 >= 0; --var19) {
						for (var17 = 31; var17 >= 0; --var17) {
							if (var3.anIntArray148[var19 + var17 * 32] == 0 && var19 > 0 && var17 > 0 && var3.anIntArray148[var19 - 1 + (var17 - 1) * 32] > 0) {
								var3.anIntArray148[var19 + var17 * 32] = 3153952;
							}
						}
					}
					if (var4.anInt124 != -1) {
						Class1_Sub3_Sub2_Sub2 var20 = method59(var4.anInt123, 24638, 10);
						int var21 = var20.anInt465;
						int var22 = var20.anInt466;
						var20.anInt465 = 32;
						var20.anInt466 = 32;
						var20.method324(22, 5, 22, 17713, 5);
						var20.anInt465 = var21;
						var20.anInt466 = var22;
					}
					aClass35_5.method528(6, (long) arg0, var3);
					Class1_Sub3_Sub2.method354(var9, var8, -657, var10);
					Class1_Sub3_Sub2.method356(var14, var13, var12, 789, var11);
					Class1_Sub3_Sub2_Sub1.anInt430 = var5;
					Class1_Sub3_Sub2_Sub1.anInt431 = var6;
					Class1_Sub3_Sub2_Sub1.anIntArray139 = var7;
					Class1_Sub3_Sub2_Sub1.aBoolean99 = true;
					if (var4.aBoolean31) {
						var3.anInt465 = 33;
					} else {
						var3.anInt465 = 32;
					}
					var3.anInt466 = arg2;
					return var3;
				}
			}
		} catch (RuntimeException var23) {
			signlink.reporterror("43278, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var23.toString());
			throw new RuntimeException();
		}
	}

	public final Class1_Sub3_Sub1 method60(byte arg0, int arg1) {
		try {
			int var3 = this.anInt113;
			if (arg0 != 6) {
				throw new NullPointerException();
			} else {
				if (arg1 == 1) {
					var3 = this.anInt115;
				}
				if (var3 == -1) {
					return null;
				} else {
					int var4 = this.anInt114;
					int var5 = this.anInt117;
					if (arg1 == 1) {
						var4 = this.anInt116;
						var5 = this.anInt118;
					}
					Class1_Sub3_Sub1 var6 = new Class1_Sub3_Sub1(false, var3);
					if (var4 != -1) {
						Class1_Sub3_Sub1 var7;
						if (var5 != -1) {
							var7 = new Class1_Sub3_Sub1(false, var4);
							Class1_Sub3_Sub1 var8 = new Class1_Sub3_Sub1(false, var5);
							Class1_Sub3_Sub1[] var9 = new Class1_Sub3_Sub1[] { var6, var7, var8 };
							var6 = new Class1_Sub3_Sub1(0, var9, 3);
						} else {
							var7 = new Class1_Sub3_Sub1(false, var4);
							Class1_Sub3_Sub1[] var12 = new Class1_Sub3_Sub1[] { var6, var7 };
							var6 = new Class1_Sub3_Sub1(0, var12, 2);
						}
					}
					if (arg1 == 0 && this.aByte5 != 0) {
						var6.method236(this.aByte5, 0, -122, 0);
					}
					if (arg1 == 1 && this.aByte6 != 0) {
						var6.method236(this.aByte6, 0, -122, 0);
					}
					if (this.anIntArray24 != null) {
						for (int var11 = 0; var11 < this.anIntArray24.length; ++var11) {
							var6.method237(this.anIntArray24[var11], this.anIntArray25[var11]);
						}
					}
					return var6;
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("95348, " + arg0 + ", " + arg1 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	public final Class1_Sub3_Sub1 method61(int arg0, int arg1) {
		try {
			int var3 = this.anInt119;
			if (arg0 != this.anInt100) {
				anInt99 = 205;
			}
			if (arg1 == 1) {
				var3 = this.anInt121;
			}
			if (var3 == -1) {
				return null;
			} else {
				int var4 = this.anInt120;
				if (arg1 == 1) {
					var4 = this.anInt122;
				}
				Class1_Sub3_Sub1 var5 = new Class1_Sub3_Sub1(false, var3);
				if (var4 != -1) {
					Class1_Sub3_Sub1 var6 = new Class1_Sub3_Sub1(false, var4);
					Class1_Sub3_Sub1[] var7 = new Class1_Sub3_Sub1[] { var5, var6 };
					var5 = new Class1_Sub3_Sub1(0, var7, 2);
				}
				if (this.anIntArray24 != null) {
					for (int var9 = 0; var9 < this.anIntArray24.length; ++var9) {
						var5.method237(this.anIntArray24[var9], this.anIntArray25[var9]);
					}
				}
				return var5;
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("22260, " + arg0 + ", " + arg1 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}
}
