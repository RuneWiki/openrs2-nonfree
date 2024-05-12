import sign.signlink;

public final class Class40 {

	private static boolean aBoolean153;

	private static byte aByte40 = 25;

	private static int anInt775 = 3;

	private static boolean aBoolean154 = true;

	private static int anInt776 = 629;

	static char[] aCharArray1 = new char[12];

	static char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	public static long method538(String arg0) {
		long var1 = 0L;
		for (int var3 = 0; var3 < arg0.length() && var3 < 12; ++var3) {
			char var4 = arg0.charAt(var3);
			var1 *= 37L;
			if (var4 >= 'A' && var4 <= 'Z') {
				var1 += (long) (1 + var4 - 65);
			} else if (var4 >= 'a' && var4 <= 'z') {
				var1 += (long) (1 + var4 - 97);
			} else if (var4 >= '0' && var4 <= '9') {
				var1 += (long) (27 + var4 - 48);
			}
		}
		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}
		return var1;
	}

	public static String method539(long arg0, boolean arg1) {
		try {
			if (arg0 > 0L && arg0 < 6582952005840035281L) {
				if (arg0 % 37L == 0L) {
					return "invalid_name";
				} else {
					int var3 = 0;
					if (arg1) {
						anInt776 = -363;
					}
					while (arg0 != 0L) {
						long var4 = arg0;
						arg0 /= 37L;
						aCharArray1[11 - var3++] = aCharArray2[(int) (var4 - arg0 * 37L)];
					}
					return new String(aCharArray1, 12 - var3, var3);
				}
			} else {
				return "invalid_name";
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("15228, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public static long method540(int arg0, String arg1) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			} else {
				String var6 = arg1.toUpperCase();
				long var2 = 0L;
				for (int var4 = 0; var4 < var6.length(); ++var4) {
					var2 = var2 * 61L + (long) var6.charAt(var4) - 32L;
					var2 = var2 + (var2 >> 56) & 72057594037927935L;
				}
				return var2;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("43144, " + arg0 + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public static String method541(int arg0, int arg1) {
		try {
			if (arg0 >= 0) {
				aBoolean153 = !aBoolean153;
			}
			return (arg1 >> 24 & 255) + "." + (arg1 >> 16 & 255) + "." + (arg1 >> 8 & 255) + "." + (arg1 & 255);
		} catch (RuntimeException var3) {
			signlink.reporterror("89303, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public static String method542(int arg0, String arg1) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			} else if (arg1.length() > 0) {
				char[] var2 = arg1.toCharArray();
				for (int var3 = 0; var3 < var2.length; ++var3) {
					if (var2[var3] == '_') {
						var2[var3] = ' ';
						if (var3 + 1 < var2.length && var2[var3 + 1] >= 'a' && var2[var3 + 1] <= 'z') {
							var2[var3 + 1] = (char) (var2[var3 + 1] + 'A' - 97);
						}
					}
				}
				if (var2[0] >= 'a' && var2[0] <= 'z') {
					var2[0] = (char) (var2[0] + 'A' - 97);
				}
				return new String(var2);
			} else {
				return arg1;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("71479, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public static String method543(String arg0, int arg1) {
		try {
			String var8 = arg0.toLowerCase();
			if (arg1 != 0) {
				anInt775 = -18;
			}
			char[] var2 = var8.toCharArray();
			int var3 = var2.length;
			boolean var4 = true;
			for (int var5 = 0; var5 < var3; ++var5) {
				char var6 = var2[var5];
				if (var4 && var6 >= 'a' && var6 <= 'z') {
					var2[var5] = (char) (var2[var5] + -32);
					var4 = false;
				}
				if (var6 == '.' || var6 == '!') {
					var4 = true;
				}
			}
			return new String(var2);
		} catch (RuntimeException var7) {
			signlink.reporterror("53394, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public static String method544(int arg0, String arg1) {
		try {
			String var2 = "";
			if (arg0 != 7) {
				throw new NullPointerException();
			} else {
				for (int var3 = 0; var3 < arg1.length(); ++var3) {
					var2 = var2 + "*";
				}
				return var2;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("91128, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}
}
