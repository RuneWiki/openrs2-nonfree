import sign.signlink;

final class Class16 {

	int[] anIntArray158;

	int[] anIntArray159;

	int[] anIntArray160;

	int[] anIntArray161;

	int[] anIntArray162;

	int[] anIntArray163;

	int[] anIntArray164;

	int[] anIntArray165;

	int[] anIntArray166;

	int[] anIntArray167;

	boolean aBoolean114 = true;

	int anInt494;

	int anInt495;

	int anInt496;

	int anInt497;

	static int[] anIntArray168 = new int[6];

	static int[] anIntArray169 = new int[6];

	static int[] anIntArray170 = new int[6];

	static int[] anIntArray171 = new int[6];

	static int[] anIntArray172 = new int[6];

	static int[] anIntArray173 = new int[] { 1, 0 };

	static int[] anIntArray174 = new int[] { 2, 1 };

	static int[] anIntArray175 = new int[] { 3, 3 };

	static final int[][] anIntArrayArray16 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	static final int[][] anIntArrayArray17 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public Class16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		try {
			if (arg17 != arg3 || arg17 != arg13 || arg17 != arg7) {
				this.aBoolean114 = false;
			}
			this.anInt494 = arg1;
			this.anInt495 = arg5;
			this.anInt496 = arg12;
			this.anInt497 = arg8;
			short var21 = 128;
			int var22 = var21 / 2;
			int var23 = var21 / 4;
			int var24 = var21 * 3 / 4;
			int[] var25 = anIntArrayArray16[arg1];
			int var26 = var25.length;
			this.anIntArray158 = new int[var26];
			this.anIntArray159 = new int[var26];
			this.anIntArray160 = new int[var26];
			int[] var27 = new int[var26];
			int[] var28 = new int[var26];
			int var29 = arg0 * var21;
			int var30 = arg18 * var21;
			int var33;
			int var34;
			int var35;
			int var36;
			int var37;
			for (int var31 = 0; var31 < var26; ++var31) {
				int var32 = var25[var31];
				if ((var32 & 1) == 0 && var32 <= 8) {
					var32 = (var32 - arg5 - arg5 - 1 & 7) + 1;
				}
				if (var32 > 8 && var32 <= 12) {
					var32 = (var32 - 9 - arg5 & 3) + 9;
				}
				if (var32 > 12 && var32 <= 16) {
					var32 = (var32 - 13 - arg5 & 3) + 13;
				}
				if (var32 == 1) {
					var33 = var29;
					var34 = var30;
					var35 = arg17;
					var36 = arg6;
					var37 = arg9;
				} else if (var32 == 2) {
					var33 = var29 + var22;
					var34 = var30;
					var35 = arg17 + arg3 >> 1;
					var36 = arg6 + arg19 >> 1;
					var37 = arg9 + arg2 >> 1;
				} else if (var32 == 3) {
					var33 = var29 + var21;
					var34 = var30;
					var35 = arg3;
					var36 = arg19;
					var37 = arg2;
				} else if (var32 == 4) {
					var33 = var29 + var21;
					var34 = var30 + var22;
					var35 = arg3 + arg13 >> 1;
					var36 = arg19 + arg4 >> 1;
					var37 = arg2 + arg14 >> 1;
				} else if (var32 == 5) {
					var33 = var29 + var21;
					var34 = var30 + var21;
					var35 = arg13;
					var36 = arg4;
					var37 = arg14;
				} else if (var32 == 6) {
					var33 = var29 + var22;
					var34 = var30 + var21;
					var35 = arg13 + arg7 >> 1;
					var36 = arg4 + arg15 >> 1;
					var37 = arg14 + arg11 >> 1;
				} else if (var32 == 7) {
					var33 = var29;
					var34 = var30 + var21;
					var35 = arg7;
					var36 = arg15;
					var37 = arg11;
				} else if (var32 == 8) {
					var33 = var29;
					var34 = var30 + var22;
					var35 = arg7 + arg17 >> 1;
					var36 = arg15 + arg6 >> 1;
					var37 = arg11 + arg9 >> 1;
				} else if (var32 == 9) {
					var33 = var29 + var22;
					var34 = var30 + var23;
					var35 = arg17 + arg3 >> 1;
					var36 = arg6 + arg19 >> 1;
					var37 = arg9 + arg2 >> 1;
				} else if (var32 == 10) {
					var33 = var29 + var24;
					var34 = var30 + var22;
					var35 = arg3 + arg13 >> 1;
					var36 = arg19 + arg4 >> 1;
					var37 = arg2 + arg14 >> 1;
				} else if (var32 == 11) {
					var33 = var29 + var22;
					var34 = var30 + var24;
					var35 = arg13 + arg7 >> 1;
					var36 = arg4 + arg15 >> 1;
					var37 = arg14 + arg11 >> 1;
				} else if (var32 == 12) {
					var33 = var29 + var23;
					var34 = var30 + var22;
					var35 = arg7 + arg17 >> 1;
					var36 = arg15 + arg6 >> 1;
					var37 = arg11 + arg9 >> 1;
				} else if (var32 == 13) {
					var33 = var29 + var23;
					var34 = var30 + var23;
					var35 = arg17;
					var36 = arg6;
					var37 = arg9;
				} else if (var32 == 14) {
					var33 = var29 + var24;
					var34 = var30 + var23;
					var35 = arg3;
					var36 = arg19;
					var37 = arg2;
				} else if (var32 == 15) {
					var33 = var29 + var24;
					var34 = var30 + var24;
					var35 = arg13;
					var36 = arg4;
					var37 = arg14;
				} else {
					var33 = var29 + var23;
					var34 = var30 + var24;
					var35 = arg7;
					var36 = arg15;
					var37 = arg11;
				}
				this.anIntArray158[var31] = var33;
				this.anIntArray159[var31] = var35;
				this.anIntArray160[var31] = var34;
				var27[var31] = var36;
				var28[var31] = var37;
			}
			int[] var41 = anIntArrayArray17[arg1];
			var33 = var41.length / 4;
			this.anIntArray164 = new int[var33];
			this.anIntArray165 = new int[var33];
			this.anIntArray166 = new int[var33];
			this.anIntArray161 = new int[var33];
			this.anIntArray162 = new int[var33];
			if (arg16 != 10659) {
				throw new NullPointerException();
			} else {
				this.anIntArray163 = new int[var33];
				if (arg10 != -1) {
					this.anIntArray167 = new int[var33];
				}
				var34 = 0;
				for (var35 = 0; var35 < var33; ++var35) {
					var36 = var41[var34];
					var37 = var41[var34 + 1];
					int var38 = var41[var34 + 2];
					int var39 = var41[var34 + 3];
					var34 += 4;
					if (var37 < 4) {
						var37 = var37 - arg5 & 3;
					}
					if (var38 < 4) {
						var38 = var38 - arg5 & 3;
					}
					if (var39 < 4) {
						var39 = var39 - arg5 & 3;
					}
					this.anIntArray164[var35] = var37;
					this.anIntArray165[var35] = var38;
					this.anIntArray166[var35] = var39;
					if (var36 == 0) {
						this.anIntArray161[var35] = var27[var37];
						this.anIntArray162[var35] = var27[var38];
						this.anIntArray163[var35] = var27[var39];
						if (this.anIntArray167 != null) {
							this.anIntArray167[var35] = -1;
						}
					} else {
						this.anIntArray161[var35] = var28[var37];
						this.anIntArray162[var35] = var28[var38];
						this.anIntArray163[var35] = var28[var39];
						if (this.anIntArray167 != null) {
							this.anIntArray167[var35] = arg10;
						}
					}
				}
				var36 = arg17;
				var37 = arg3;
				if (arg3 < arg17) {
					var36 = arg3;
				}
				if (arg3 > arg3) {
					var37 = arg3;
				}
				if (arg13 < var36) {
					var36 = arg13;
				}
				if (arg13 > var37) {
					var37 = arg13;
				}
				if (arg7 < var36) {
					var36 = arg7;
				}
				if (arg7 > var37) {
					var37 = arg7;
				}
				var36 /= 14;
				var37 /= 14;
			}
		} catch (RuntimeException var40) {
			signlink.reporterror("18849, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + arg12 + ", " + arg13 + ", " + arg14 + ", " + arg15 + ", " + arg16 + ", " + arg17 + ", " + arg18 + ", " + arg19 + ", " + var40.toString());
			throw new RuntimeException();
		}
	}
}
