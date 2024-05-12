import java.util.Random;
import sign.signlink;

public final class Class1_Sub3_Sub2_Sub4 extends Class1_Sub3_Sub2 {

	private boolean aBoolean124 = true;

	private byte aByte26 = 8;

	private byte aByte27 = 6;

	private byte aByte28 = 2;

	private int anInt538 = -708;

	private int anInt539 = 997;

	byte[][] aByteArrayArray3 = new byte[94][];

	int[] anIntArray179 = new int[94];

	int[] anIntArray180 = new int[94];

	int[] anIntArray181 = new int[94];

	int[] anIntArray182 = new int[94];

	int[] anIntArray183 = new int[95];

	int[] anIntArray184 = new int[256];

	public int anInt540;

	Random aRandom1 = new Random();

	static int[] anIntArray185 = new int[256];

	public Class1_Sub3_Sub2_Sub4(Class39 arg0, String arg1, int arg2) {
		try {
			Class1_Sub3_Sub3 var4 = new Class1_Sub3_Sub3(363, arg0.method536(arg1 + ".dat", (byte[]) null, (byte) 2));
			Class1_Sub3_Sub3 var5 = new Class1_Sub3_Sub3(363, arg0.method536("index.dat", (byte[]) null, (byte) 2));
			var5.anInt561 = var4.method393() + 4;
			int var6 = var5.method391();
			if (var6 > 0) {
				var5.anInt561 += 3 * (var6 - 1);
			}
			int var8;
			for (int var7 = 0; var7 < 94; ++var7) {
				this.anIntArray181[var7] = var5.method391();
				this.anIntArray182[var7] = var5.method391();
				var8 = this.anIntArray179[var7] = var5.method393();
				int var9 = this.anIntArray180[var7] = var5.method393();
				int var10 = var5.method391();
				int var11 = var8 * var9;
				this.aByteArrayArray3[var7] = new byte[var11];
				int var12;
				int var13;
				if (var10 == 0) {
					for (var12 = 0; var12 < var11; ++var12) {
						this.aByteArrayArray3[var7][var12] = var4.method392();
					}
				} else if (var10 == 1) {
					for (var12 = 0; var12 < var8; ++var12) {
						for (var13 = 0; var13 < var9; ++var13) {
							this.aByteArrayArray3[var7][var12 + var13 * var8] = var4.method392();
						}
					}
				}
				if (var9 > this.anInt540) {
					this.anInt540 = var9;
				}
				this.anIntArray181[var7] = 1;
				this.anIntArray183[var7] = var8 + 2;
				var12 = 0;
				for (var13 = var9 / 7; var13 < var9; ++var13) {
					var12 += this.aByteArrayArray3[var7][var13 * var8];
				}
				int var10002;
				if (var12 <= var9 / 7) {
					var10002 = this.anIntArray183[var7]--;
					this.anIntArray181[var7] = 0;
				}
				var12 = 0;
				for (int var14 = var9 / 7; var14 < var9; ++var14) {
					var12 += this.aByteArrayArray3[var7][var8 - 1 + var14 * var8];
				}
				if (var12 <= var9 / 7) {
					var10002 = this.anIntArray183[var7]--;
				}
			}
			int var16 = 9 / arg2;
			this.anIntArray183[94] = this.anIntArray183[8];
			for (var8 = 0; var8 < 256; ++var8) {
				this.anIntArray184[var8] = this.anIntArray183[anIntArray185[var8]];
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("26392, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	public void method362(int arg0, byte arg1, int arg2, String arg3, int arg4) {
		try {
			if (arg1 != 6) {
				this.anInt539 = 140;
			}
			this.method365(arg4 - this.method364(false, arg3) / 2, arg0, false, arg2, arg3);
		} catch (RuntimeException var7) {
			signlink.reporterror("38285, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public void method363(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5) {
		try {
			this.method367(arg0 - this.method364(false, arg4) / 2, 6, arg3, arg4, arg2, arg1);
			if (arg5 != 0) {
				this.aBoolean124 = !this.aBoolean124;
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("53756, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public int method364(boolean arg0, String arg1) {
		try {
			if (arg1 == null) {
				return 0;
			} else {
				int var3 = 0;
				if (arg0) {
					return this.anInt538;
				} else {
					for (int var4 = 0; var4 < arg1.length(); ++var4) {
						if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
							var4 += 4;
						} else {
							var3 += this.anIntArray184[arg1.charAt(var4)];
						}
					}
					return var3;
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("24781, " + arg0 + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public void method365(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		try {
			if (arg4 != null) {
				int var9 = arg1 - this.anInt540;
				if (arg2) {
					this.aBoolean124 = !this.aBoolean124;
				}
				for (int var6 = 0; var6 < arg4.length(); ++var6) {
					int var7 = anIntArray185[arg4.charAt(var6)];
					if (var7 != 94) {
						this.method370(this.aByteArrayArray3[var7], arg0 + this.anIntArray181[var7], var9 + this.anIntArray182[var7], this.anIntArray179[var7], this.anIntArray180[var7], arg3);
					}
					arg0 += this.anIntArray183[var7];
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("10686, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public void method366(int arg0, byte arg1, int arg2, int arg3, int arg4, String arg5) {
		try {
			if (arg5 != null) {
				arg2 -= this.method364(false, arg5) / 2;
				int var10 = arg3 - this.anInt540;
				int var7;
				if (arg1 != this.aByte26) {
					for (var7 = 1; var7 > 0; ++var7) {
					}
				}
				for (var7 = 0; var7 < arg5.length(); ++var7) {
					int var8 = anIntArray185[arg5.charAt(var7)];
					if (var8 != 94) {
						this.method370(this.aByteArrayArray3[var8], arg2 + this.anIntArray181[var8], var10 + this.anIntArray182[var8] + (int) (Math.sin((double) var7 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray179[var8], this.anIntArray180[var8], arg4);
					}
					arg2 += this.anIntArray183[var8];
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("9153, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public void method367(int arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5) {
		try {
			if (arg3 != null) {
				int var10 = arg2 - this.anInt540;
				for (int var7 = 0; var7 < arg3.length(); ++var7) {
					if (arg3.charAt(var7) == '@' && var7 + 4 < arg3.length() && arg3.charAt(var7 + 4) == '@') {
						arg5 = this.method369(0, arg3.substring(var7 + 1, var7 + 4));
						var7 += 4;
					} else {
						int var8 = anIntArray185[arg3.charAt(var7)];
						if (var8 != 94) {
							if (arg4) {
								this.method370(this.aByteArrayArray3[var8], arg0 + this.anIntArray181[var8] + 1, var10 + this.anIntArray182[var8] + 1, this.anIntArray179[var8], this.anIntArray180[var8], 0);
							}
							this.method370(this.aByteArrayArray3[var8], arg0 + this.anIntArray181[var8], var10 + this.anIntArray182[var8], this.anIntArray179[var8], this.anIntArray180[var8], arg5);
						}
						arg0 += this.anIntArray183[var8];
					}
				}
				if (arg1 == 6) {
					;
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("2788, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public void method368(int arg0, boolean arg1, byte arg2, int arg3, int arg4, String arg5, int arg6) {
		try {
			if (arg5 != null) {
				this.aRandom1.setSeed((long) arg0);
				int var8 = 192 + (this.aRandom1.nextInt() & 31);
				int var12 = arg3 - this.anInt540;
				if (arg2 != -121) {
					this.anInt539 = 341;
				}
				for (int var9 = 0; var9 < arg5.length(); ++var9) {
					if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
						arg4 = this.method369(0, arg5.substring(var9 + 1, var9 + 4));
						var9 += 4;
					} else {
						int var10 = anIntArray185[arg5.charAt(var9)];
						if (var10 != 94) {
							if (arg1) {
								this.method372(this.aByteArrayArray3[var10], (byte) 6, arg6 + this.anIntArray181[var10] + 1, this.anIntArray180[var10], 0, var12 + this.anIntArray182[var10] + 1, 192, this.anIntArray179[var10]);
							}
							this.method372(this.aByteArrayArray3[var10], (byte) 6, arg6 + this.anIntArray181[var10], this.anIntArray180[var10], arg4, var12 + this.anIntArray182[var10], var8, this.anIntArray179[var10]);
						}
						arg6 += this.anIntArray183[var10];
						if ((this.aRandom1.nextInt() & 3) == 0) {
							++arg6;
						}
					}
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("44689, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public int method369(int arg0, String arg1) {
		try {
			if (arg0 != 0) {
				this.anInt538 = 450;
			}
			if (arg1.equals("red")) {
				return 16711680;
			} else if (arg1.equals("gre")) {
				return 65280;
			} else if (arg1.equals("blu")) {
				return 255;
			} else if (arg1.equals("yel")) {
				return 16776960;
			} else if (arg1.equals("cya")) {
				return 65535;
			} else if (arg1.equals("mag")) {
				return 16711935;
			} else if (arg1.equals("whi")) {
				return 16777215;
			} else if (arg1.equals("bla")) {
				return 0;
			} else if (arg1.equals("lre")) {
				return 16748608;
			} else if (arg1.equals("dre")) {
				return 8388608;
			} else if (arg1.equals("dbl")) {
				return 128;
			} else if (arg1.equals("or1")) {
				return 16756736;
			} else if (arg1.equals("or2")) {
				return 16740352;
			} else if (arg1.equals("or3")) {
				return 16723968;
			} else if (arg1.equals("gr1")) {
				return 12648192;
			} else if (arg1.equals("gr2")) {
				return 8453888;
			} else {
				return arg1.equals("gr3") ? 4259584 : 0;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("82682, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private void method370(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg1 + arg2 * Class1_Sub3_Sub2.anInt528;
		int var8 = Class1_Sub3_Sub2.anInt528 - arg3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (arg2 < Class1_Sub3_Sub2.anInt530) {
			var11 = Class1_Sub3_Sub2.anInt530 - arg2;
			arg4 -= var11;
			arg2 = Class1_Sub3_Sub2.anInt530;
			var10 += var11 * arg3;
			var7 += var11 * Class1_Sub3_Sub2.anInt528;
		}
		if (arg2 + arg4 >= Class1_Sub3_Sub2.anInt531) {
			arg4 -= arg2 + arg4 - Class1_Sub3_Sub2.anInt531 + 1;
		}
		if (arg1 < Class1_Sub3_Sub2.anInt532) {
			var11 = Class1_Sub3_Sub2.anInt532 - arg1;
			arg3 -= var11;
			arg1 = Class1_Sub3_Sub2.anInt532;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}
		if (arg1 + arg3 >= Class1_Sub3_Sub2.anInt533) {
			var11 = arg1 + arg3 - Class1_Sub3_Sub2.anInt533 + 1;
			arg3 -= var11;
			var9 += var11;
			var8 += var11;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method371(Class1_Sub3_Sub2.anIntArray178, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	private void method371(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var14 = -(arg5 & 3);
		for (int var11 = -arg6; var11 < 0; ++var11) {
			for (int var12 = var10; var12 < 0; ++var12) {
				if (arg1[arg3++] != 0) {
					arg0[arg4++] = arg2;
				} else {
					++arg4;
				}
				if (arg1[arg3++] != 0) {
					arg0[arg4++] = arg2;
				} else {
					++arg4;
				}
				if (arg1[arg3++] != 0) {
					arg0[arg4++] = arg2;
				} else {
					++arg4;
				}
				if (arg1[arg3++] != 0) {
					arg0[arg4++] = arg2;
				} else {
					++arg4;
				}
			}
			for (int var13 = var14; var13 < 0; ++var13) {
				if (arg1[arg3++] != 0) {
					arg0[arg4++] = arg2;
				} else {
					++arg4;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	private void method372(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (arg1 == this.aByte27) {
				int var9 = arg2 + arg5 * Class1_Sub3_Sub2.anInt528;
				int var10 = Class1_Sub3_Sub2.anInt528 - arg7;
				int var11 = 0;
				int var12 = 0;
				int var13;
				if (arg5 < Class1_Sub3_Sub2.anInt530) {
					var13 = Class1_Sub3_Sub2.anInt530 - arg5;
					arg3 -= var13;
					arg5 = Class1_Sub3_Sub2.anInt530;
					var12 += var13 * arg7;
					var9 += var13 * Class1_Sub3_Sub2.anInt528;
				}
				if (arg5 + arg3 >= Class1_Sub3_Sub2.anInt531) {
					arg3 -= arg5 + arg3 - Class1_Sub3_Sub2.anInt531 + 1;
				}
				if (arg2 < Class1_Sub3_Sub2.anInt532) {
					var13 = Class1_Sub3_Sub2.anInt532 - arg2;
					arg7 -= var13;
					arg2 = Class1_Sub3_Sub2.anInt532;
					var12 += var13;
					var9 += var13;
					var11 += var13;
					var10 += var13;
				}
				if (arg2 + arg7 >= Class1_Sub3_Sub2.anInt533) {
					var13 = arg2 + arg7 - Class1_Sub3_Sub2.anInt533 + 1;
					arg7 -= var13;
					var11 += var13;
					var10 += var13;
				}
				if (arg7 > 0 && arg3 > 0) {
					this.method373(arg3, var9, arg7, Class1_Sub3_Sub2.anIntArray178, arg0, arg6, var12, var10, var11, (byte) 2, arg4);
				}
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("13931, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	private void method373(int arg0, int arg1, int arg2, int[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
		try {
			int var18 = ((arg10 & 16711935) * arg5 & -16711936) + ((arg10 & 65280) * arg5 & 16711680) >> 8;
			int var12;
			if (arg9 == this.aByte28) {
				boolean var17 = false;
			} else {
				for (var12 = 1; var12 > 0; ++var12) {
				}
			}
			int var16 = 256 - arg5;
			for (var12 = -arg0; var12 < 0; ++var12) {
				for (int var13 = -arg2; var13 < 0; ++var13) {
					if (arg4[arg6++] != 0) {
						int var14 = arg3[arg1];
						arg3[arg1++] = (((var14 & 16711935) * var16 & -16711936) + ((var14 & 65280) * var16 & 16711680) >> 8) + var18;
					} else {
						++arg1;
					}
				}
				arg1 += arg7;
				arg6 += arg8;
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("64154, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	static {
		String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (int var1 = 0; var1 < 256; ++var1) {
			int var2 = var0.indexOf(var1);
			if (var2 == -1) {
				var2 = 74;
			}
			anIntArray185[var1] = var2;
		}
	}
}
