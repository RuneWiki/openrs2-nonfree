import sign.signlink;

public final class Class1_Sub3_Sub2_Sub3 extends Class1_Sub3_Sub2 {

	private boolean aBoolean116 = false;

	private int anInt512 = 45861;

	private byte aByte24 = 5;

	private boolean aBoolean117 = true;

	public byte[] aByteArray6;

	public int[] anIntArray177;

	public int anInt513;

	public int anInt514;

	public int anInt515;

	public int anInt516;

	public int anInt517;

	public int anInt518;

	public Class1_Sub3_Sub2_Sub3(Class39 arg0, String arg1, int arg2) {
		Class1_Sub3_Sub3 var4 = new Class1_Sub3_Sub3(363, arg0.method536(arg1 + ".dat", (byte[]) null, (byte) 2));
		Class1_Sub3_Sub3 var5 = new Class1_Sub3_Sub3(363, arg0.method536("index.dat", (byte[]) null, (byte) 2));
		var5.anInt561 = var4.method393();
		this.anInt517 = var5.method393();
		this.anInt518 = var5.method393();
		int var6 = var5.method391();
		this.anIntArray177 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; ++var7) {
			this.anIntArray177[var7 + 1] = var5.method395();
		}
		for (int var8 = 0; var8 < arg2; ++var8) {
			var5.anInt561 += 2;
			var4.anInt561 += var5.method393() * var5.method393();
			++var5.anInt561;
		}
		this.anInt515 = var5.method391();
		this.anInt516 = var5.method391();
		this.anInt513 = var5.method393();
		this.anInt514 = var5.method393();
		int var9 = var5.method391();
		int var10 = this.anInt513 * this.anInt514;
		this.aByteArray6 = new byte[var10];
		int var11;
		if (var9 == 0) {
			for (var11 = 0; var11 < var10; ++var11) {
				this.aByteArray6[var11] = var4.method392();
			}
		} else {
			if (var9 == 1) {
				for (var11 = 0; var11 < this.anInt513; ++var11) {
					for (int var12 = 0; var12 < this.anInt514; ++var12) {
						this.aByteArray6[var11 + var12 * this.anInt513] = var4.method392();
					}
				}
			}
		}
	}

	public void method345(boolean arg0) {
		try {
			this.anInt517 /= 2;
			this.anInt518 /= 2;
			byte[] var2 = new byte[this.anInt517 * this.anInt518];
			int var3 = 0;
			for (int var4 = 0; var4 < this.anInt514; ++var4) {
				for (int var5 = 0; var5 < this.anInt513; ++var5) {
					var2[(var5 + this.anInt515 >> 1) + (var4 + this.anInt516 >> 1) * this.anInt517] = this.aByteArray6[var3++];
				}
			}
			if (arg0) {
				this.anInt512 = 197;
			}
			this.aByteArray6 = var2;
			this.anInt513 = this.anInt517;
			this.anInt514 = this.anInt518;
			this.anInt515 = 0;
			this.anInt516 = 0;
		} catch (RuntimeException var6) {
			signlink.reporterror("15206, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public void method346(int arg0) {
		try {
			if (this.anInt513 != this.anInt517 || this.anInt514 != this.anInt518) {
				byte[] var2 = new byte[this.anInt517 * this.anInt518];
				int var3 = 0;
				if (arg0 != 0) {
					this.aBoolean116 = !this.aBoolean116;
				}
				for (int var4 = 0; var4 < this.anInt514; ++var4) {
					for (int var5 = 0; var5 < this.anInt513; ++var5) {
						var2[var5 + this.anInt515 + (var4 + this.anInt516) * this.anInt517] = this.aByteArray6[var3++];
					}
				}
				this.aByteArray6 = var2;
				this.anInt513 = this.anInt517;
				this.anInt514 = this.anInt518;
				this.anInt515 = 0;
				this.anInt516 = 0;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("52279, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public void method347(int arg0) {
		try {
			byte[] var2 = new byte[this.anInt513 * this.anInt514];
			int var3 = 0;
			for (int var4 = 0; var4 < this.anInt514; ++var4) {
				for (int var5 = this.anInt513 - 1; var5 >= 0; --var5) {
					var2[var3++] = this.aByteArray6[var5 + var4 * this.anInt513];
				}
			}
			this.aByteArray6 = var2;
			this.anInt515 = this.anInt517 - this.anInt513 - this.anInt515;
			if (arg0 >= 0) {
				;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("54445, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public void method348(byte arg0) {
		try {
			byte[] var2 = new byte[this.anInt513 * this.anInt514];
			int var3;
			if (arg0 != -74) {
				for (var3 = 1; var3 > 0; ++var3) {
				}
			}
			var3 = 0;
			for (int var4 = this.anInt514 - 1; var4 >= 0; --var4) {
				for (int var5 = 0; var5 < this.anInt513; ++var5) {
					var2[var3++] = this.aByteArray6[var5 + var4 * this.anInt513];
				}
			}
			this.aByteArray6 = var2;
			this.anInt516 = this.anInt518 - this.anInt514 - this.anInt516;
		} catch (RuntimeException var6) {
			signlink.reporterror("43769, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public void method349(int arg0, int arg1, int arg2, boolean arg3) {
		try {
			int var6;
			for (int var5 = 0; var5 < this.anIntArray177.length; ++var5) {
				var6 = this.anIntArray177[var5] >> 16 & 255;
				var6 += arg0;
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > 255) {
					var6 = 255;
				}
				int var7 = this.anIntArray177[var5] >> 8 & 255;
				var7 += arg1;
				if (var7 < 0) {
					var7 = 0;
				} else if (var7 > 255) {
					var7 = 255;
				}
				int var8 = this.anIntArray177[var5] & 255;
				var8 += arg2;
				if (var8 < 0) {
					var8 = 0;
				} else if (var8 > 255) {
					var8 = 255;
				}
				this.anIntArray177[var5] = (var6 << 16) + (var7 << 8) + var8;
			}
			if (!arg3) {
				for (var6 = 1; var6 > 0; ++var6) {
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("93096, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public void method350(int arg0, int arg1, boolean arg2) {
		try {
			arg1 += this.anInt515;
			arg0 += this.anInt516;
			int var4 = arg1 + arg0 * Class1_Sub3_Sub2.anInt528;
			int var5 = 0;
			int var6 = this.anInt514;
			int var7 = this.anInt513;
			int var8 = Class1_Sub3_Sub2.anInt528 - var7;
			int var9 = 0;
			int var10;
			if (arg0 < Class1_Sub3_Sub2.anInt530) {
				var10 = Class1_Sub3_Sub2.anInt530 - arg0;
				var6 -= var10;
				arg0 = Class1_Sub3_Sub2.anInt530;
				var5 += var10 * var7;
				var4 += var10 * Class1_Sub3_Sub2.anInt528;
			}
			if (arg0 + var6 > Class1_Sub3_Sub2.anInt531) {
				var6 -= arg0 + var6 - Class1_Sub3_Sub2.anInt531;
			}
			if (arg1 < Class1_Sub3_Sub2.anInt532) {
				var10 = Class1_Sub3_Sub2.anInt532 - arg1;
				var7 -= var10;
				arg1 = Class1_Sub3_Sub2.anInt532;
				var5 += var10;
				var4 += var10;
				var9 += var10;
				var8 += var10;
			}
			if (arg1 + var7 > Class1_Sub3_Sub2.anInt533) {
				var10 = arg1 + var7 - Class1_Sub3_Sub2.anInt533;
				var7 -= var10;
				var9 += var10;
				var8 += var10;
			}
			if (var7 > 0 && var6 > 0) {
				this.method351(Class1_Sub3_Sub2.anIntArray178, var5, var9, this.aByteArray6, var6, 0, var7, var4, var8, this.anIntArray177);
				if (!arg2) {
					;
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("95229, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	private void method351(int[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		try {
			int var11 = -(arg6 >> 2);
			int var17 = -(arg6 & 3);
			if (arg5 == 0) {
				for (int var12 = -arg4; var12 < 0; ++var12) {
					for (int var13 = var11; var13 < 0; ++var13) {
						byte var14 = arg3[arg1++];
						if (var14 != 0) {
							arg0[arg7++] = arg9[var14 & 255];
						} else {
							++arg7;
						}
						var14 = arg3[arg1++];
						if (var14 != 0) {
							arg0[arg7++] = arg9[var14 & 255];
						} else {
							++arg7;
						}
						var14 = arg3[arg1++];
						if (var14 != 0) {
							arg0[arg7++] = arg9[var14 & 255];
						} else {
							++arg7;
						}
						var14 = arg3[arg1++];
						if (var14 != 0) {
							arg0[arg7++] = arg9[var14 & 255];
						} else {
							++arg7;
						}
					}
					for (int var18 = var17; var18 < 0; ++var18) {
						byte var15 = arg3[arg1++];
						if (var15 != 0) {
							arg0[arg7++] = arg9[var15 & 255];
						} else {
							++arg7;
						}
					}
					arg7 += arg8;
					arg1 += arg2;
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("24366, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}
}
