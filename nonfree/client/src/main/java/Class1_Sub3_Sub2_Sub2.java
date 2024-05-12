import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import sign.signlink;

public final class Class1_Sub3_Sub2_Sub2 extends Class1_Sub3_Sub2 {

	private boolean aBoolean103 = false;

	private int anInt459;

	private boolean aBoolean104 = false;

	private int anInt460 = 15223;

	private byte aByte23 = 5;

	public int[] anIntArray148;

	public int anInt461;

	public int anInt462;

	public int anInt463;

	public int anInt464;

	public int anInt465;

	public int anInt466;

	public Class1_Sub3_Sub2_Sub2(int arg0, int arg1) {
		this.anIntArray148 = new int[arg0 * arg1];
		this.anInt461 = this.anInt465 = arg0;
		this.anInt462 = this.anInt466 = arg1;
		this.anInt463 = this.anInt464 = 0;
	}

	public Class1_Sub3_Sub2_Sub2(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.anInt461 = var3.getWidth(arg1);
			this.anInt462 = var3.getHeight(arg1);
			this.anInt465 = this.anInt461;
			this.anInt466 = this.anInt462;
			this.anInt463 = 0;
			this.anInt464 = 0;
			this.anIntArray148 = new int[this.anInt461 * this.anInt462];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.anInt461, this.anInt462, this.anIntArray148, 0, this.anInt461);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Class1_Sub3_Sub2_Sub2(Class39 arg0, String arg1, int arg2) {
		Class1_Sub3_Sub3 var4 = new Class1_Sub3_Sub3(363, arg0.method536(arg1 + ".dat", (byte[]) null, (byte) 2));
		Class1_Sub3_Sub3 var5 = new Class1_Sub3_Sub3(363, arg0.method536("index.dat", (byte[]) null, (byte) 2));
		var5.anInt561 = var4.method393();
		this.anInt465 = var5.method393();
		this.anInt466 = var5.method393();
		int var6 = var5.method391();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; ++var8) {
			var7[var8 + 1] = var5.method395();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}
		for (int var9 = 0; var9 < arg2; ++var9) {
			var5.anInt561 += 2;
			var4.anInt561 += var5.method393() * var5.method393();
			++var5.anInt561;
		}
		this.anInt463 = var5.method391();
		this.anInt464 = var5.method391();
		this.anInt461 = var5.method393();
		this.anInt462 = var5.method393();
		int var10 = var5.method391();
		int var11 = this.anInt461 * this.anInt462;
		this.anIntArray148 = new int[var11];
		int var12;
		if (var10 == 0) {
			for (var12 = 0; var12 < var11; ++var12) {
				this.anIntArray148[var12] = var7[var4.method391()];
			}
		} else {
			if (var10 == 1) {
				for (var12 = 0; var12 < this.anInt461; ++var12) {
					for (int var13 = 0; var13 < this.anInt462; ++var13) {
						this.anIntArray148[var12 + var13 * this.anInt461] = var7[var4.method391()];
					}
				}
			}
		}
	}

	public void method318(byte arg0) {
		try {
			if (arg0 != 62) {
				for (int var2 = 1; var2 > 0; ++var2) {
				}
			}
			Class1_Sub3_Sub2.method354(this.anInt461, this.anIntArray148, -657, this.anInt462);
		} catch (RuntimeException var3) {
			signlink.reporterror("23946, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public void method319(int arg0, int arg1, int arg2, boolean arg3) {
		try {
			for (int var5 = 0; var5 < this.anIntArray148.length; ++var5) {
				int var6 = this.anIntArray148[var5];
				if (var6 != 0) {
					int var7 = var6 >> 16 & 255;
					var7 += arg0;
					if (var7 < 1) {
						var7 = 1;
					} else if (var7 > 255) {
						var7 = 255;
					}
					int var8 = var6 >> 8 & 255;
					var8 += arg1;
					if (var8 < 1) {
						var8 = 1;
					} else if (var8 > 255) {
						var8 = 255;
					}
					int var9 = var6 & 255;
					var9 += arg2;
					if (var9 < 1) {
						var9 = 1;
					} else if (var9 > 255) {
						var9 = 255;
					}
					this.anIntArray148[var5] = (var7 << 16) + (var8 << 8) + var9;
				}
			}
			if (arg3) {
				;
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("44391, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	public void method320(int arg0, int arg1, int arg2) {
		try {
			arg1 += this.anInt463;
			arg2 += this.anInt464;
			int var4 = arg1 + arg2 * Class1_Sub3_Sub2.anInt528;
			int var5 = 0;
			int var6 = this.anInt462;
			int var7 = this.anInt461;
			int var8 = Class1_Sub3_Sub2.anInt528 - var7;
			int var9 = 0;
			int var10;
			if (arg2 < Class1_Sub3_Sub2.anInt530) {
				var10 = Class1_Sub3_Sub2.anInt530 - arg2;
				var6 -= var10;
				arg2 = Class1_Sub3_Sub2.anInt530;
				var5 += var10 * var7;
				var4 += var10 * Class1_Sub3_Sub2.anInt528;
			}
			if (arg2 + var6 > Class1_Sub3_Sub2.anInt531) {
				var6 -= arg2 + var6 - Class1_Sub3_Sub2.anInt531;
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
				this.method321(15223, this.anIntArray148, var8, var6, var5, var9, var4, var7, Class1_Sub3_Sub2.anIntArray178);
				if (arg0 != 34676) {
					this.anInt459 = 117;
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("18242, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	private void method321(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
		try {
			int var10 = -(arg7 >> 2);
			int var15 = -(arg7 & 3);
			int var12;
			for (int var11 = -arg3; var11 < 0; ++var11) {
				for (var12 = var10; var12 < 0; ++var12) {
					arg8[arg6++] = arg1[arg4++];
					arg8[arg6++] = arg1[arg4++];
					arg8[arg6++] = arg1[arg4++];
					arg8[arg6++] = arg1[arg4++];
				}
				for (int var13 = var15; var13 < 0; ++var13) {
					arg8[arg6++] = arg1[arg4++];
				}
				arg6 += arg2;
				arg4 += arg5;
			}
			if (arg0 != this.anInt460) {
				for (var12 = 1; var12 > 0; ++var12) {
				}
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("15160, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	public void method322(int arg0, int arg1, boolean arg2) {
		try {
			if (arg2) {
				this.anInt460 = 32;
			}
			arg1 += this.anInt463;
			arg0 += this.anInt464;
			int var4 = arg1 + arg0 * Class1_Sub3_Sub2.anInt528;
			int var5 = 0;
			int var6 = this.anInt462;
			int var7 = this.anInt461;
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
				this.method323(Class1_Sub3_Sub2.anIntArray178, this.anIntArray148, 0, var5, var4, var7, var6, var8, var9);
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("90492, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	private void method323(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var15 = -(arg5 & 3);
		for (int var11 = -arg6; var11 < 0; ++var11) {
			int var14;
			for (int var12 = var10; var12 < 0; ++var12) {
				var14 = arg1[arg3++];
				if (var14 != 0) {
					arg0[arg4++] = var14;
				} else {
					++arg4;
				}
				var14 = arg1[arg3++];
				if (var14 != 0) {
					arg0[arg4++] = var14;
				} else {
					++arg4;
				}
				var14 = arg1[arg3++];
				if (var14 != 0) {
					arg0[arg4++] = var14;
				} else {
					++arg4;
				}
				var14 = arg1[arg3++];
				if (var14 != 0) {
					arg0[arg4++] = var14;
				} else {
					++arg4;
				}
			}
			for (int var13 = var15; var13 < 0; ++var13) {
				var14 = arg1[arg3++];
				if (var14 != 0) {
					arg0[arg4++] = var14;
				} else {
					++arg4;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public void method324(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg3 == 17713) {
				try {
					int var6 = this.anInt461;
					int var7 = this.anInt462;
					int var8 = 0;
					int var9 = 0;
					int var10 = (var6 << 16) / arg2;
					int var11 = (var7 << 16) / arg0;
					int var12 = this.anInt465;
					int var13 = this.anInt466;
					int var19 = (var12 << 16) / arg2;
					int var20 = (var13 << 16) / arg0;
					arg4 += (this.anInt463 * arg2 + var12 - 1) / var12;
					arg1 += (this.anInt464 * arg0 + var13 - 1) / var13;
					if (this.anInt463 * arg2 % var12 != 0) {
						var8 = (var12 - this.anInt463 * arg2 % var12 << 16) / arg2;
					}
					if (this.anInt464 * arg0 % var13 != 0) {
						var9 = (var13 - this.anInt464 * arg0 % var13 << 16) / arg0;
					}
					arg2 = arg2 * (this.anInt461 - (var8 >> 16)) / var12;
					arg0 = arg0 * (this.anInt462 - (var9 >> 16)) / var13;
					int var14 = arg4 + arg1 * Class1_Sub3_Sub2.anInt528;
					int var15 = Class1_Sub3_Sub2.anInt528 - arg2;
					int var16;
					if (arg1 < Class1_Sub3_Sub2.anInt530) {
						var16 = Class1_Sub3_Sub2.anInt530 - arg1;
						arg0 -= var16;
						arg1 = 0;
						var14 += var16 * Class1_Sub3_Sub2.anInt528;
						var9 += var20 * var16;
					}
					if (arg1 + arg0 > Class1_Sub3_Sub2.anInt531) {
						arg0 -= arg1 + arg0 - Class1_Sub3_Sub2.anInt531;
					}
					if (arg4 < Class1_Sub3_Sub2.anInt532) {
						var16 = Class1_Sub3_Sub2.anInt532 - arg4;
						arg2 -= var16;
						arg4 = 0;
						var14 += var16;
						var8 += var19 * var16;
						var15 += var16;
					}
					if (arg4 + arg2 > Class1_Sub3_Sub2.anInt533) {
						var16 = arg4 + arg2 - Class1_Sub3_Sub2.anInt533;
						arg2 -= var16;
						var15 += var16;
					}
					this.method325(var8, var19, Class1_Sub3_Sub2.anIntArray178, 0, var20, var9, 0, this.anIntArray148, var15, var14, arg0, var6, arg2);
				} catch (Exception var17) {
					System.out.println("error in sprite clipping routine");
				}
			}
		} catch (RuntimeException var18) {
			signlink.reporterror("90121, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var18.toString());
			throw new RuntimeException();
		}
	}

	private void method325(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
		try {
			int var14;
			if (arg6 != 0) {
				for (var14 = 1; var14 > 0; ++var14) {
				}
			}
			try {
				var14 = arg0;
				for (int var15 = -arg10; var15 < 0; ++var15) {
					int var16 = (arg5 >> 16) * arg11;
					for (int var17 = -arg12; var17 < 0; ++var17) {
						int var20 = arg7[(arg0 >> 16) + var16];
						if (var20 != 0) {
							arg2[arg9++] = var20;
						} else {
							++arg9;
						}
						arg0 += arg1;
					}
					arg5 += arg4;
					arg0 = var14;
					arg9 += arg8;
				}
			} catch (Exception var18) {
				System.out.println("error in plot_scale");
			}
		} catch (RuntimeException var19) {
			signlink.reporterror("94187, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + arg12 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	public void method326(int arg0, int arg1, int arg2, byte arg3) {
		try {
			int var5;
			if (arg3 != -26) {
				for (var5 = 1; var5 > 0; ++var5) {
				}
			}
			arg1 += this.anInt463;
			arg2 += this.anInt464;
			var5 = arg1 + arg2 * Class1_Sub3_Sub2.anInt528;
			int var6 = 0;
			int var7 = this.anInt462;
			int var8 = this.anInt461;
			int var9 = Class1_Sub3_Sub2.anInt528 - var8;
			int var10 = 0;
			int var11;
			if (arg2 < Class1_Sub3_Sub2.anInt530) {
				var11 = Class1_Sub3_Sub2.anInt530 - arg2;
				var7 -= var11;
				arg2 = Class1_Sub3_Sub2.anInt530;
				var6 += var11 * var8;
				var5 += var11 * Class1_Sub3_Sub2.anInt528;
			}
			if (arg2 + var7 > Class1_Sub3_Sub2.anInt531) {
				var7 -= arg2 + var7 - Class1_Sub3_Sub2.anInt531;
			}
			if (arg1 < Class1_Sub3_Sub2.anInt532) {
				var11 = Class1_Sub3_Sub2.anInt532 - arg1;
				var8 -= var11;
				arg1 = Class1_Sub3_Sub2.anInt532;
				var6 += var11;
				var5 += var11;
				var10 += var11;
				var9 += var11;
			}
			if (arg1 + var8 > Class1_Sub3_Sub2.anInt533) {
				var11 = arg1 + var8 - Class1_Sub3_Sub2.anInt533;
				var8 -= var11;
				var10 += var11;
				var9 += var11;
			}
			if (var8 > 0 && var7 > 0) {
				this.method327(var5, 0, this.anIntArray148, arg0, var7, Class1_Sub3_Sub2.anIntArray178, var6, (byte) 8, var8, var9, var10);
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("1642, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	private void method327(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
		try {
			int var12 = 256 - arg3;
			if (arg7 != 8) {
				this.aBoolean103 = !this.aBoolean103;
			}
			for (int var13 = -arg4; var13 < 0; ++var13) {
				for (int var14 = -arg8; var14 < 0; ++var14) {
					int var17 = arg2[arg6++];
					if (var17 != 0) {
						int var15 = arg5[arg0];
						arg5[arg0++] = ((var17 & 16711935) * arg3 + (var15 & 16711935) * var12 & -16711936) + ((var17 & 65280) * arg3 + (var15 & 65280) * var12 & 16711680) >> 8;
					} else {
						++arg0;
					}
				}
				arg0 += arg9;
				arg6 += arg10;
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("62265, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	public void method328(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int[] arg10) {
		try {
			if (arg9) {
				this.aBoolean104 = !this.aBoolean104;
			}
			try {
				int var12 = -arg1 / 2;
				int var13 = -arg3 / 2;
				int var14 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
				int var15 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
				int var25 = var14 * arg5 >> 8;
				int var26 = var15 * arg5 >> 8;
				int var16 = (arg6 << 16) + var13 * var25 + var12 * var26;
				int var17 = (arg4 << 16) + (var13 * var26 - var12 * var25);
				int var18 = arg7 + arg8 * Class1_Sub3_Sub2.anInt528;
				for (int var28 = 0; var28 < arg3; ++var28) {
					int var19 = arg2[var28];
					int var20 = var18 + var19;
					int var21 = var16 + var26 * var19;
					int var22 = var17 - var25 * var19;
					for (int var27 = -arg10[var28]; var27 < 0; ++var27) {
						Class1_Sub3_Sub2.anIntArray178[var20++] = this.anIntArray148[(var21 >> 16) + (var22 >> 16) * this.anInt461];
						var21 += var26;
						var22 -= var25;
					}
					var16 += var25;
					var17 += var26;
					var18 += Class1_Sub3_Sub2.anInt528;
				}
			} catch (Exception var23) {
			}
		} catch (RuntimeException var24) {
			signlink.reporterror("53177, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + var24.toString());
			throw new RuntimeException();
		}
	}

	public void method329(Class1_Sub3_Sub2_Sub3 arg0, int arg1, int arg2, byte arg3) {
		try {
			arg2 += this.anInt463;
			arg1 += this.anInt464;
			int var5 = arg2 + arg1 * Class1_Sub3_Sub2.anInt528;
			int var6 = 0;
			if (arg3 == -15) {
				int var7 = this.anInt462;
				int var8 = this.anInt461;
				int var9 = Class1_Sub3_Sub2.anInt528 - var8;
				int var10 = 0;
				int var11;
				if (arg1 < Class1_Sub3_Sub2.anInt530) {
					var11 = Class1_Sub3_Sub2.anInt530 - arg1;
					var7 -= var11;
					arg1 = Class1_Sub3_Sub2.anInt530;
					var6 += var11 * var8;
					var5 += var11 * Class1_Sub3_Sub2.anInt528;
				}
				if (arg1 + var7 > Class1_Sub3_Sub2.anInt531) {
					var7 -= arg1 + var7 - Class1_Sub3_Sub2.anInt531;
				}
				if (arg2 < Class1_Sub3_Sub2.anInt532) {
					var11 = Class1_Sub3_Sub2.anInt532 - arg2;
					var8 -= var11;
					arg2 = Class1_Sub3_Sub2.anInt532;
					var6 += var11;
					var5 += var11;
					var10 += var11;
					var9 += var11;
				}
				if (arg2 + var8 > Class1_Sub3_Sub2.anInt533) {
					var11 = arg2 + var8 - Class1_Sub3_Sub2.anInt533;
					var8 -= var11;
					var10 += var11;
					var9 += var11;
				}
				if (var8 > 0 && var7 > 0) {
					this.method330(var8, var10, 0, -478, var7, var6, Class1_Sub3_Sub2.anIntArray178, this.anIntArray148, var5, arg0.aByteArray6, var9);
				}
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("13593, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	private void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8, byte[] arg9, int arg10) {
		try {
			if (arg3 < 0) {
				int var12 = -(arg0 >> 2);
				int var17 = -(arg0 & 3);
				for (int var13 = -arg4; var13 < 0; ++var13) {
					int var18;
					for (int var14 = var12; var14 < 0; ++var14) {
						var18 = arg7[arg5++];
						if (var18 != 0 && arg9[arg8] == 0) {
							arg6[arg8++] = var18;
						} else {
							++arg8;
						}
						var18 = arg7[arg5++];
						if (var18 != 0 && arg9[arg8] == 0) {
							arg6[arg8++] = var18;
						} else {
							++arg8;
						}
						var18 = arg7[arg5++];
						if (var18 != 0 && arg9[arg8] == 0) {
							arg6[arg8++] = var18;
						} else {
							++arg8;
						}
						var18 = arg7[arg5++];
						if (var18 != 0 && arg9[arg8] == 0) {
							arg6[arg8++] = var18;
						} else {
							++arg8;
						}
					}
					for (int var15 = var17; var15 < 0; ++var15) {
						var18 = arg7[arg5++];
						if (var18 != 0 && arg9[arg8] == 0) {
							arg6[arg8++] = var18;
						} else {
							++arg8;
						}
					}
					arg8 += arg10;
					arg5 += arg1;
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("76267, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}
}
