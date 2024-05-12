import java.math.BigInteger;
import sign.signlink;

public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	private static int anInt556 = 40946;

	private byte aByte29 = -34;

	private byte aByte30 = -106;

	private int anInt557 = 3;

	private int anInt558 = -506;

	private boolean aBoolean128 = true;

	private int anInt559 = 4277;

	private static boolean aBoolean129 = true;

	private int anInt560 = -178;

	public byte[] aByteArray7;

	public int anInt561;

	public int anInt562;

	private static int[] anIntArray190 = new int[256];

	private static final int[] anIntArray191;

	public Class38 aClass38_2;

	private static int anInt563;

	private static int anInt564;

	private static int anInt565;

	private static Class28 aClass28_6;

	private static Class28 aClass28_7;

	private static Class28 aClass28_8;

	public static Class1_Sub3_Sub3 method378(int arg0, int arg1) {
		try {
			Class28 var3 = aClass28_7;
			synchronized (aClass28_7) {
				Class1_Sub3_Sub3 var5 = null;
				if (arg0 == 0 && anInt563 > 0) {
					--anInt563;
					var5 = (Class1_Sub3_Sub3) aClass28_6.method455();
				} else if (arg0 == 1 && anInt564 > 0) {
					--anInt564;
					var5 = (Class1_Sub3_Sub3) aClass28_7.method455();
				} else if (arg0 == 2 && anInt565 > 0) {
					--anInt565;
					var5 = (Class1_Sub3_Sub3) aClass28_8.method455();
				}
				if (var5 != null) {
					var5.anInt561 = 0;
					return var5;
				}
			}
			if (arg1 >= 0) {
				aBoolean129 = !aBoolean129;
			}
			Class1_Sub3_Sub3 var2 = new Class1_Sub3_Sub3(anInt556);
			var2.anInt561 = 0;
			if (arg0 == 0) {
				var2.aByteArray7 = new byte[100];
			} else if (arg0 == 1) {
				var2.aByteArray7 = new byte[5000];
			} else {
				var2.aByteArray7 = new byte[30000];
			}
			return var2;
		} catch (RuntimeException var7) {
			signlink.reporterror("65959, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public void method379(byte arg0) {
		try {
			Class28 var2 = aClass28_7;
			synchronized (aClass28_7) {
				this.anInt561 = 0;
				if (this.aByteArray7.length == 100 && anInt563 < 1000) {
					aClass28_6.method453(this);
					++anInt563;
					return;
				}
				if (this.aByteArray7.length == 5000 && anInt564 < 250) {
					aClass28_7.method453(this);
					++anInt564;
					return;
				}
				if (this.aByteArray7.length == 30000 && anInt565 < 50) {
					aClass28_8.method453(this);
					++anInt565;
					return;
				}
			}
			if (arg0 != 8) {
				anInt556 = -173;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("53281, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private Class1_Sub3_Sub3(int arg0) {
		try {
			if (arg0 != 40946) {
				aBoolean129 = !aBoolean129;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("73559, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public Class1_Sub3_Sub3(int arg0, byte[] arg1) {
		try {
			this.aByteArray7 = arg1;
			this.anInt561 = 0;
			int var5 = 15 / arg0;
		} catch (RuntimeException var4) {
			signlink.reporterror("63917, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public void method380(byte arg0, int arg1) {
		try {
			this.aByteArray7[this.anInt561++] = (byte) (arg1 + this.aClass38_2.method532());
			if (arg0 != this.aByte29) {
				aBoolean129 = !aBoolean129;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("36381, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public void method381(int arg0) {
		this.aByteArray7[this.anInt561++] = (byte) arg0;
	}

	public void method382(int arg0) {
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt561++] = (byte) arg0;
	}

	public void method383(boolean arg0, int arg1) {
		try {
			if (!arg0) {
				aBoolean129 = !aBoolean129;
			}
			this.aByteArray7[this.anInt561++] = (byte) arg1;
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 8);
		} catch (RuntimeException var4) {
			signlink.reporterror("76445, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public void method384(int arg0) {
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt561++] = (byte) arg0;
	}

	public void method385(int arg0) {
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt561++] = (byte) arg0;
	}

	public void method386(boolean arg0, int arg1) {
		try {
			this.aByteArray7[this.anInt561++] = (byte) arg1;
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 8);
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 16);
			if (!arg0) {
				this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 24);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("60396, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public void method387(boolean arg0, long arg1) {
		try {
			this.aByteArray7[this.anInt561++] = (byte) ((int) (arg1 >> 56));
			this.aByteArray7[this.anInt561++] = (byte) ((int) (arg1 >> 48));
			this.aByteArray7[this.anInt561++] = (byte) ((int) (arg1 >> 40));
			this.aByteArray7[this.anInt561++] = (byte) ((int) (arg1 >> 32));
			this.aByteArray7[this.anInt561++] = (byte) ((int) (arg1 >> 24));
			this.aByteArray7[this.anInt561++] = (byte) ((int) (arg1 >> 16));
			this.aByteArray7[this.anInt561++] = (byte) ((int) (arg1 >> 8));
			if (arg0) {
				this.aByteArray7[this.anInt561++] = (byte) ((int) arg1);
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("23917, " + arg0 + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public void method388(String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray7, this.anInt561);
		this.anInt561 += arg0.length();
		this.aByteArray7[this.anInt561++] = 10;
	}

	public void method389(byte[] arg0, int arg1, int arg2, byte arg3) {
		try {
			int var5;
			if (arg3 != this.aByte30) {
				for (var5 = 1; var5 > 0; ++var5) {
				}
			}
			for (var5 = arg2; var5 < arg2 + arg1; ++var5) {
				this.aByteArray7[this.anInt561++] = arg0[var5];
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("88471, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public void method390(int arg0, int arg1) {
		try {
			if (arg0 != 0) {
				aBoolean129 = !aBoolean129;
			}
			this.aByteArray7[this.anInt561 - arg1 - 1] = (byte) arg1;
		} catch (RuntimeException var4) {
			signlink.reporterror("44726, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public int method391() {
		return this.aByteArray7[this.anInt561++] & 255;
	}

	public byte method392() {
		return this.aByteArray7[this.anInt561++];
	}

	public int method393() {
		this.anInt561 += 2;
		return ((this.aByteArray7[this.anInt561 - 2] & 255) << 8) + (this.aByteArray7[this.anInt561 - 1] & 255);
	}

	public int method394() {
		this.anInt561 += 2;
		int var1 = ((this.aByteArray7[this.anInt561 - 2] & 255) << 8) + (this.aByteArray7[this.anInt561 - 1] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	public int method395() {
		this.anInt561 += 3;
		return ((this.aByteArray7[this.anInt561 - 3] & 255) << 16) + ((this.aByteArray7[this.anInt561 - 2] & 255) << 8) + (this.aByteArray7[this.anInt561 - 1] & 255);
	}

	public int method396() {
		this.anInt561 += 4;
		return ((this.aByteArray7[this.anInt561 - 4] & 255) << 24) + ((this.aByteArray7[this.anInt561 - 3] & 255) << 16) + ((this.aByteArray7[this.anInt561 - 2] & 255) << 8) + (this.aByteArray7[this.anInt561 - 1] & 255);
	}

	public long method397(int arg0) {
		try {
			long var2 = (long) this.method396() & 4294967295L;
			int var7 = 87 / arg0;
			long var4 = (long) this.method396() & 4294967295L;
			return (var2 << 32) + var4;
		} catch (RuntimeException var6) {
			signlink.reporterror("61408, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public String method398() {
		int var1 = this.anInt561;
		while (this.aByteArray7[this.anInt561++] != 10) {
		}
		return new String(this.aByteArray7, var1, this.anInt561 - var1 - 1);
	}

	public byte[] method399(byte arg0) {
		try {
			int var2 = this.anInt561;
			if (arg0 != 31) {
				throw new NullPointerException();
			} else {
				while (this.aByteArray7[this.anInt561++] != 10) {
				}
				byte[] var3 = new byte[this.anInt561 - var2 - 1];
				for (int var4 = var2; var4 < this.anInt561 - 1; ++var4) {
					var3[var4 - var2] = this.aByteArray7[var4];
				}
				return var3;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("66822, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public void method400(int arg0, int arg1, int arg2, byte[] arg3) {
		try {
			if (arg1 >= 0) {
				this.anInt558 = -432;
			}
			for (int var5 = arg2; var5 < arg2 + arg0; ++var5) {
				arg3[var5] = this.aByteArray7[this.anInt561++];
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("61364, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public void method401(int arg0) {
		try {
			this.anInt562 = this.anInt561 * 8;
			if (arg0 <= 0) {
				this.aBoolean128 = !this.aBoolean128;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("5633, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public int method402(int arg0, int arg1) {
		try {
			if (arg0 >= 9 && arg0 <= 9) {
				int var3 = this.anInt562 >> 3;
				int var4 = 8 - (this.anInt562 & 7);
				int var5 = 0;
				this.anInt562 += arg1;
				while (arg1 > var4) {
					var5 += (this.aByteArray7[var3++] & anIntArray191[var4]) << arg1 - var4;
					arg1 -= var4;
					var4 = 8;
				}
				if (arg1 == var4) {
					var5 += this.aByteArray7[var3] & anIntArray191[var4];
				} else {
					var5 += this.aByteArray7[var3] >> var4 - arg1 & anIntArray191[arg1];
				}
				return var5;
			} else {
				return this.anInt557;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("91100, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public void method403(int arg0) {
		try {
			if (arg0 != this.anInt559) {
				for (int var2 = 1; var2 > 0; ++var2) {
				}
			}
			this.anInt561 = (this.anInt562 + 7) / 8;
		} catch (RuntimeException var3) {
			signlink.reporterror("27753, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public int method404() {
		int var1 = this.aByteArray7[this.anInt561] & 255;
		return var1 < 128 ? this.method391() - 64 : this.method393() - 49152;
	}

	public int method405() {
		int var1 = this.aByteArray7[this.anInt561] & 255;
		return var1 < 128 ? this.method391() : this.method393() - 32768;
	}

	public void method406(BigInteger arg0, BigInteger arg1, int arg2) {
		try {
			int var4 = this.anInt561;
			this.anInt561 = 0;
			byte[] var5 = new byte[var4];
			this.method400(var4, -110, 0, var5);
			BigInteger var6 = new BigInteger(var5);
			BigInteger var7 = var6.modPow(arg1, arg0);
			byte[] var8 = var7.toByteArray();
			this.anInt561 = 0;
			if (arg2 == 24676) {
				this.method381(var8.length);
				this.method389(var8, var8.length, 0, (byte) -106);
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("7102, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	static {
		for (int var1 = 0; var1 < 256; ++var1) {
			int var0 = var1;
			for (int var2 = 0; var2 < 8; ++var2) {
				if ((var0 & 1) == 1) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}
			anIntArray190[var1] = var0;
		}
		anIntArray191 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass28_6 = new Class28(0);
		aClass28_7 = new Class28(0);
		aClass28_8 = new Class28(0);
	}
}
