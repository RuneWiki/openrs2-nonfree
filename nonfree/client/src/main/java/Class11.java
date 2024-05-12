import sign.signlink;

public class Class11 {

	private static int anInt400 = 473;

	private static int anInt401 = -546;

	public static int anInt402;

	public static Class11[] aClass11Array1;

	public int anInt403;

	public int anInt404 = -1;

	public boolean aBoolean90 = false;

	public boolean aBoolean91 = true;

	public String aString19;

	public int anInt405;

	public int anInt406;

	public int anInt407;

	public int anInt408;

	public int anInt409;

	public int anInt410;

	public static void method272(Class39 arg0, int arg1) {
		try {
			Class1_Sub3_Sub3 var2 = new Class1_Sub3_Sub3(363, arg0.method536("flo.dat", (byte[]) null, (byte) 2));
			anInt402 = var2.method393();
			int var5 = 35 / arg1;
			if (aClass11Array1 == null) {
				aClass11Array1 = new Class11[anInt402];
			}
			for (int var3 = 0; var3 < anInt402; ++var3) {
				if (aClass11Array1[var3] == null) {
					aClass11Array1[var3] = new Class11();
				}
				aClass11Array1[var3].method273(false, var2);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("39430, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public void method273(boolean arg0, Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0) {
				throw new NullPointerException();
			} else {
				while (true) {
					int var3 = arg1.method391();
					if (var3 == 0) {
						return;
					}
					if (var3 == 1) {
						this.anInt403 = arg1.method395();
						this.method274(anInt401, this.anInt403);
					} else if (var3 == 2) {
						this.anInt404 = arg1.method391();
					} else if (var3 == 3) {
						this.aBoolean90 = true;
					} else if (var3 == 5) {
						this.aBoolean91 = false;
					} else if (var3 == 6) {
						this.aString19 = arg1.method398();
					} else {
						System.out.println("Error unrecognised config code: " + var3);
					}
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("91653, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private void method274(int arg0, int arg1) {
		try {
			double var3 = (double) (arg1 >> 16 & 255) / 256.0D;
			if (arg0 >= 0) {
				for (int var5 = 1; var5 > 0; ++var5) {
				}
			}
			double var23 = (double) (arg1 >> 8 & 255) / 256.0D;
			double var7 = (double) (arg1 & 255) / 256.0D;
			double var9 = var3;
			if (var23 < var3) {
				var9 = var23;
			}
			if (var7 < var9) {
				var9 = var7;
			}
			double var11 = var3;
			if (var23 > var3) {
				var11 = var23;
			}
			if (var7 > var11) {
				var11 = var7;
			}
			double var13 = 0.0D;
			double var15 = 0.0D;
			double var17 = (var9 + var11) / 2.0D;
			if (var9 != var11) {
				if (var17 < 0.5D) {
					var15 = (var11 - var9) / (var11 + var9);
				}
				if (var17 >= 0.5D) {
					var15 = (var11 - var9) / (2.0D - var11 - var9);
				}
				if (var3 == var11) {
					var13 = (var23 - var7) / (var11 - var9);
				} else if (var23 == var11) {
					var13 = 2.0D + (var7 - var3) / (var11 - var9);
				} else if (var7 == var11) {
					var13 = 4.0D + (var3 - var23) / (var11 - var9);
				}
			}
			var13 /= 6.0D;
			this.anInt405 = (int) (var13 * 256.0D);
			this.anInt406 = (int) (var15 * 256.0D);
			this.anInt407 = (int) (var17 * 256.0D);
			if (this.anInt406 < 0) {
				this.anInt406 = 0;
			} else if (this.anInt406 > 255) {
				this.anInt406 = 255;
			}
			if (this.anInt407 < 0) {
				this.anInt407 = 0;
			} else if (this.anInt407 > 255) {
				this.anInt407 = 255;
			}
			if (var17 > 0.5D) {
				this.anInt409 = (int) ((1.0D - var17) * var15 * 512.0D);
			} else {
				this.anInt409 = (int) (var17 * var15 * 512.0D);
			}
			if (this.anInt409 < 1) {
				this.anInt409 = 1;
			}
			this.anInt408 = (int) (var13 * (double) this.anInt409);
			int var19 = this.anInt405 + (int) (Math.random() * 16.0D) - 8;
			if (var19 < 0) {
				var19 = 0;
			} else if (var19 > 255) {
				var19 = 255;
			}
			int var20 = this.anInt406 + (int) (Math.random() * 48.0D) - 24;
			if (var20 < 0) {
				var20 = 0;
			} else if (var20 > 255) {
				var20 = 255;
			}
			int var21 = this.anInt407 + (int) (Math.random() * 48.0D) - 24;
			if (var21 < 0) {
				var21 = 0;
			} else if (var21 > 255) {
				var21 = 255;
			}
			this.anInt410 = this.method275(var19, var20, var21);
		} catch (RuntimeException var22) {
			signlink.reporterror("14446, " + arg0 + ", " + arg1 + ", " + var22.toString());
			throw new RuntimeException();
		}
	}

	private final int method275(int arg0, int arg1, int arg2) {
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
}
