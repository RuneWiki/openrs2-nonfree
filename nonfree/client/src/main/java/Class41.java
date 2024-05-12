import sign.signlink;

public final class Class41 {

	public static char[] aCharArray3 = new char[100];

	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	public static String method545(Class1_Sub3_Sub3 arg0, int arg1, int arg2) {
		try {
			int var3 = 0;
			int var4 = -1;
			int var10 = 43 / arg1;
			int var7;
			for (int var5 = 0; var5 < arg2; ++var5) {
				int var6 = arg0.method391();
				var7 = var6 >> 4 & 15;
				if (var4 == -1) {
					if (var7 < 13) {
						aCharArray3[var3++] = aCharArray4[var7];
					} else {
						var4 = var7;
					}
				} else {
					aCharArray3[var3++] = aCharArray4[(var4 << 4) + var7 - 195];
					var4 = -1;
				}
				var7 = var6 & 15;
				if (var4 == -1) {
					if (var7 < 13) {
						aCharArray3[var3++] = aCharArray4[var7];
					} else {
						var4 = var7;
					}
				} else {
					aCharArray3[var3++] = aCharArray4[(var4 << 4) + var7 - 195];
					var4 = -1;
				}
			}
			boolean var11 = true;
			for (var7 = 0; var7 < var3; ++var7) {
				char var8 = aCharArray3[var7];
				if (var11 && var8 >= 'a' && var8 <= 'z') {
					aCharArray3[var7] = (char) (aCharArray3[var7] + -32);
					var11 = false;
				}
				if (var8 == '.' || var8 == '!') {
					var11 = true;
				}
			}
			return new String(aCharArray3, 0, var3);
		} catch (RuntimeException var9) {
			signlink.reporterror("31206, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public static void method546(Class1_Sub3_Sub3 arg0, boolean arg1, String arg2) {
		try {
			if (arg2.length() > 80) {
				arg2 = arg2.substring(0, 80);
			}
			arg2 = arg2.toLowerCase();
			int var3 = -1;
			for (int var4 = 0; var4 < arg2.length(); ++var4) {
				char var5 = arg2.charAt(var4);
				int var6 = 0;
				for (int var7 = 0; var7 < aCharArray4.length; ++var7) {
					if (var5 == aCharArray4[var7]) {
						var6 = var7;
						break;
					}
				}
				if (var6 > 12) {
					var6 += 195;
				}
				if (var3 == -1) {
					if (var6 < 13) {
						var3 = var6;
					} else {
						arg0.method381(var6);
					}
				} else if (var6 < 13) {
					arg0.method381((var3 << 4) + var6);
					var3 = -1;
				} else {
					arg0.method381((var3 << 4) + (var6 >> 4));
					var3 = var6 & 15;
				}
			}
			if (arg1) {
				if (var3 != -1) {
					arg0.method381(var3 << 4);
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("98255, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}
}
