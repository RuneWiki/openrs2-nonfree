import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public class Class309 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "[I")
	private final int[] anIntArray609 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!we", name = "l", descriptor = "[I")
	private final int[] anIntArray608 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	protected final int anInt8252;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	public final int anInt8255;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "Lclient!pg;")
	private final Class270 aClass270_7;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Z")
	public final boolean aBoolean603;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	protected final int anInt8259;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "Lclient!ls;")
	private final Class216 aClass216_5;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIZLclient!ls;Lclient!pg;)V")
	protected Class309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class216 arg4, @OriginalArg(5) Class270 arg5) {
		this.anInt8252 = arg1;
		this.anInt8255 = arg0;
		this.aClass270_7 = arg5;
		this.aBoolean603 = arg3;
		this.anInt8259 = arg2;
		this.aClass216_5 = arg4;
		this.aByteArrayArrayArray14 = new byte[this.anInt8255][this.anInt8252][this.anInt8259];
		this.aByteArrayArrayArray13 = new byte[this.anInt8255][this.anInt8252 + 1][this.anInt8259 + 1];
		this.aByteArrayArrayArray15 = new byte[this.anInt8255][this.anInt8252][this.anInt8259];
		this.aByteArrayArrayArray11 = new byte[this.anInt8255][this.anInt8252][this.anInt8259];
		this.anIntArrayArrayArray17 = new int[this.anInt8255][this.anInt8252 + 1][this.anInt8259 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt8255][this.anInt8252][this.anInt8259];
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ha;IIII[[B[ZIII[[BLclient!ao;[[BLclient!pia;)V")
	private void method7090(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) Class20 arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) Class273 arg12) {
		@Pc(18) boolean[] local18 = arg12 != null && arg12.aBoolean521 ? Static14.aBooleanArrayArray1[arg8] : Static384.aBooleanArrayArray6[arg8];
		@Pc(40) int local40;
		@Pc(53) Class273 local53;
		@Pc(71) byte local71;
		@Pc(88) int local88;
		@Pc(93) int local93;
		if (arg3 > 0) {
			if (arg2 > 0) {
				local40 = arg4[arg2 - 1][arg3 - 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass216_5.method5090(local40 - 1);
					if (local53.anInt7209 != -1 && local53.aBoolean521) {
						local71 = arg9[arg2 - 1][arg3 - 1];
						local88 = arg11[arg2 - 1][arg3 - 1] * 2 + 4 & 0x7;
						local93 = Static482.method6815(arg0, local53);
						if (Static410.aBooleanArrayArray7[local71][local88]) {
							Static419.anIntArray499[0] = local53.anInt7209;
							Static534.anIntArray637[0] = local93;
							Static508.anIntArray603[0] = local53.anInt7223;
							Static102.anIntArray172[0] = local53.anInt7207;
							Static59.anIntArray656[0] = local53.anInt7224;
							Static353.anIntArray399[0] = 256;
						}
					}
				}
			}
			if (arg2 < arg6 - 1) {
				local40 = arg4[arg2 + 1][arg3 - 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass216_5.method5090(local40 - 1);
					if (local53.anInt7209 != -1 && local53.aBoolean521) {
						local71 = arg9[arg2 + 1][arg3 - 1];
						local88 = arg11[arg2 + 1][arg3 - 1] * 2 + 6 & 0x7;
						local93 = Static482.method6815(arg0, local53);
						if (Static410.aBooleanArrayArray7[local71][local88]) {
							Static419.anIntArray499[2] = local53.anInt7209;
							Static534.anIntArray637[2] = local93;
							Static508.anIntArray603[2] = local53.anInt7223;
							Static102.anIntArray172[2] = local53.anInt7207;
							Static59.anIntArray656[2] = local53.anInt7224;
							Static353.anIntArray399[2] = 512;
						}
					}
				}
			}
		}
		if (arg3 < arg7 - 1) {
			if (arg2 > 0) {
				local40 = arg4[arg2 - 1][arg3 + 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass216_5.method5090(local40 - 1);
					if (local53.anInt7209 != -1 && local53.aBoolean521) {
						local71 = arg9[arg2 - 1][arg3 + 1];
						local88 = arg11[arg2 - 1][arg3 + 1] * 2 + 2 & 0x7;
						local93 = Static482.method6815(arg0, local53);
						if (Static410.aBooleanArrayArray7[local71][local88]) {
							Static419.anIntArray499[6] = local53.anInt7209;
							Static534.anIntArray637[6] = local93;
							Static508.anIntArray603[6] = local53.anInt7223;
							Static102.anIntArray172[6] = local53.anInt7207;
							Static59.anIntArray656[6] = local53.anInt7224;
							Static353.anIntArray399[6] = 64;
						}
					}
				}
			}
			if (arg6 - 1 > arg2) {
				local40 = arg4[arg2 + 1][arg3 + 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass216_5.method5090(local40 - 1);
					if (local53.anInt7209 != -1 && local53.aBoolean521) {
						local71 = arg9[arg2 + 1][arg3 + 1];
						local88 = --(arg11[arg2 + 1][arg3 + 1] * 2) & 0x7;
						local93 = Static482.method6815(arg0, local53);
						if (Static410.aBooleanArrayArray7[local71][local88]) {
							Static419.anIntArray499[4] = local53.anInt7209;
							Static534.anIntArray637[4] = local93;
							Static508.anIntArray603[4] = local53.anInt7223;
							Static102.anIntArray172[4] = local53.anInt7207;
							Static59.anIntArray656[4] = local53.anInt7224;
							Static353.anIntArray399[4] = 128;
						}
					}
				}
			}
		}
		@Pc(503) int local503;
		@Pc(508) int local508;
		@Pc(510) int local510;
		@Pc(491) byte local491;
		if (arg3 > 0) {
			local40 = arg4[arg2][arg3 - 1] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass216_5.method5090(local40 - 1);
				if (local53.anInt7209 != -1) {
					local71 = arg9[arg2][arg3 - 1];
					local491 = arg11[arg2][arg3 - 1];
					if (local53.aBoolean521) {
						local93 = 2;
						local503 = local491 * 2 + 4;
						local508 = Static482.method6815(arg0, local53);
						for (local510 = 0; local510 < 3; local510++) {
							local503 &= 0x7;
							local93 &= 0x7;
							if (Static410.aBooleanArrayArray7[local71][local503] && local53.anInt7224 >= Static59.anIntArray656[local93]) {
								Static419.anIntArray499[local93] = local53.anInt7209;
								Static534.anIntArray637[local93] = local508;
								Static508.anIntArray603[local93] = local53.anInt7223;
								Static102.anIntArray172[local93] = local53.anInt7207;
								if (Static59.anIntArray656[local93] == local53.anInt7224) {
									Static353.anIntArray399[local93] |= 0x20;
								} else {
									Static353.anIntArray399[local93] = 32;
								}
								Static59.anIntArray656[local93] = local53.anInt7224;
							}
							local93--;
							local503++;
						}
						if (!local18[arg1 & 0x3]) {
							arg5[0] = Static14.aBooleanArrayArray1[local71][local491 + 2 & 0x3];
						}
					} else if (!local18[--arg1 & 0x3]) {
						arg5[0] = Static384.aBooleanArrayArray6[local71][local491 + 2 & 0x3];
					}
				}
			}
		}
		if (arg3 < arg7 - 1) {
			local40 = arg4[arg2][arg3 + 1] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass216_5.method5090(local40 - 1);
				if (local53.anInt7209 != -1) {
					local71 = arg9[arg2][arg3 + 1];
					local491 = arg11[arg2][arg3 + 1];
					if (local53.aBoolean521) {
						local93 = 4;
						local503 = local491 * 2 + 2;
						local508 = Static482.method6815(arg0, local53);
						for (local510 = 0; local510 < 3; local510++) {
							local503 &= 0x7;
							local93 &= 0x7;
							if (Static410.aBooleanArrayArray7[local71][local503] && Static59.anIntArray656[local93] <= local53.anInt7224) {
								Static419.anIntArray499[local93] = local53.anInt7209;
								Static534.anIntArray637[local93] = local508;
								Static508.anIntArray603[local93] = local53.anInt7223;
								Static102.anIntArray172[local93] = local53.anInt7207;
								if (local53.anInt7224 == Static59.anIntArray656[local93]) {
									Static353.anIntArray399[local93] |= 0x10;
								} else {
									Static353.anIntArray399[local93] = 16;
								}
								Static59.anIntArray656[local93] = local53.anInt7224;
							}
							local93++;
							local503--;
						}
						if (!local18[arg1 + 2 & 0x3]) {
							arg5[2] = Static14.aBooleanArrayArray1[local71][local491 & 0x3];
						}
					} else if (!local18[arg1 + 2 & 0x3]) {
						arg5[2] = Static384.aBooleanArrayArray6[local71][local491 & 0x3];
					}
				}
			}
		}
		if (arg2 > 0) {
			local40 = arg4[arg2 - 1][arg3] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass216_5.method5090(local40 - 1);
				if (local53.anInt7209 != -1) {
					local71 = arg9[arg2 - 1][arg3];
					local491 = arg11[arg2 - 1][arg3];
					if (local53.aBoolean521) {
						local93 = 6;
						local503 = local491 * 2 + 4;
						local508 = Static482.method6815(arg0, local53);
						for (local510 = 0; local510 < 3; local510++) {
							local503 &= 0x7;
							local93 &= 0x7;
							if (Static410.aBooleanArrayArray7[local71][local503] && local53.anInt7224 >= Static59.anIntArray656[local93]) {
								Static419.anIntArray499[local93] = local53.anInt7209;
								Static534.anIntArray637[local93] = local508;
								Static508.anIntArray603[local93] = local53.anInt7223;
								Static102.anIntArray172[local93] = local53.anInt7207;
								if (local53.anInt7224 == Static59.anIntArray656[local93]) {
									Static353.anIntArray399[local93] |= 0x8;
								} else {
									Static353.anIntArray399[local93] = 8;
								}
								Static59.anIntArray656[local93] = local53.anInt7224;
							}
							local503--;
							local93++;
						}
						if (!local18[arg1 + 3 & 0x3]) {
							arg5[3] = Static14.aBooleanArrayArray1[local71][local491 + 1 & 0x3];
						}
					} else if (!local18[arg1 + 3 & 0x3]) {
						arg5[3] = Static384.aBooleanArrayArray6[local71][local491 + 1 & 0x3];
					}
				}
			}
		}
		if (arg6 - 1 > arg2) {
			local40 = arg4[arg2 + 1][arg3] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass216_5.method5090(local40 - 1);
				if (local53.anInt7209 != -1) {
					local71 = arg9[arg2 + 1][arg3];
					local491 = arg11[arg2 + 1][arg3];
					if (local53.aBoolean521) {
						local93 = 4;
						local503 = local491 * 2 + 6;
						local508 = Static482.method6815(arg0, local53);
						for (local510 = 0; local510 < 3; local510++) {
							local93 &= 0x7;
							local503 &= 0x7;
							if (Static410.aBooleanArrayArray7[local71][local503] && Static59.anIntArray656[local93] <= local53.anInt7224) {
								Static419.anIntArray499[local93] = local53.anInt7209;
								Static534.anIntArray637[local93] = local508;
								Static508.anIntArray603[local93] = local53.anInt7223;
								Static102.anIntArray172[local93] = local53.anInt7207;
								if (local53.anInt7224 == Static59.anIntArray656[local93]) {
									Static353.anIntArray399[local93] |= 0x4;
								} else {
									Static353.anIntArray399[local93] = 4;
								}
								Static59.anIntArray656[local93] = local53.anInt7224;
							}
							local503++;
							local93--;
						}
						if (!local18[arg1 + 1 & 0x3]) {
							arg5[1] = Static14.aBooleanArrayArray1[local71][local491 + 3 & 0x3];
						}
					} else if (!local18[arg1 + 1 & 0x3]) {
						arg5[1] = Static384.aBooleanArrayArray6[local71][local491 + 3 & 0x3];
					}
				}
			}
		}
		if (arg12 == null) {
			return;
		}
		local40 = Static482.method6815(arg0, arg12);
		if (!arg12.aBoolean521) {
			return;
		}
		for (@Pc(1202) int local1202 = 0; local1202 < 8; local1202++) {
			@Pc(1212) int local1212 = local1202 - arg1 * 2 & 0x7;
			if (Static410.aBooleanArrayArray7[arg8][local1202] && arg12.anInt7224 >= Static59.anIntArray656[local1212]) {
				Static419.anIntArray499[local1212] = arg12.anInt7209;
				Static534.anIntArray637[local1212] = local40;
				Static508.anIntArray603[local1212] = arg12.anInt7223;
				Static102.anIntArray172[local1212] = arg12.anInt7207;
				if (arg12.anInt7224 == Static59.anIntArray656[local1212]) {
					Static353.anIntArray399[local1212] |= 0x2;
				} else {
					Static353.anIntArray399[local1212] = 2;
				}
				Static59.anIntArray656[local1212] = arg12.anInt7224;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ha;BLclient!s;Lclient!s;)V")
	public final void method7091(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class91 arg1, @OriginalArg(3) Class91 arg2) {
		if (Static395.anIntArray448 == null || this.anInt8259 != Static395.anIntArray448.length) {
			Static275.anIntArray306 = new int[this.anInt8259];
			Static282.anIntArray521 = new int[this.anInt8259];
			Static395.anIntArray448 = new int[this.anInt8259];
			Static247.anIntArray291 = new int[this.anInt8259];
			Static257.anIntArray296 = new int[this.anInt8259];
		}
		@Pc(46) int[][] local46 = new int[this.anInt8252][this.anInt8259];
		@Pc(52) int local52;
		for (@Pc(48) int local48 = 0; local48 < this.anInt8255; local48++) {
			for (local52 = 0; local52 < this.anInt8259; local52++) {
				Static395.anIntArray448[local52] = 0;
				Static247.anIntArray291[local52] = 0;
				Static275.anIntArray306[local52] = 0;
				Static257.anIntArray296[local52] = 0;
				Static282.anIntArray521[local52] = 0;
			}
			for (@Pc(85) int local85 = -5; local85 < this.anInt8252; local85++) {
				@Pc(95) int local95;
				@Pc(114) int local114;
				@Pc(186) int local186;
				for (@Pc(89) int local89 = 0; local89 < this.anInt8259; local89++) {
					local95 = local85 + 5;
					@Pc(163) int local163;
					if (local95 < this.anInt8252) {
						local114 = this.aByteArrayArrayArray15[local48][local95][local89] & 0xFF;
						if (local114 > 0) {
							@Pc(127) Class20 local127 = this.aClass270_7.method6276(local114 - 1);
							Static395.anIntArray448[local89] += local127.anInt466;
							Static247.anIntArray291[local89] += local127.anInt464;
							Static275.anIntArray306[local89] += local127.anInt463;
							Static257.anIntArray296[local89] += local127.anInt459;
							local163 = Static282.anIntArray521[local89]++;
						}
					}
					local114 = local85 - 5;
					if (local114 >= 0) {
						local186 = this.aByteArrayArrayArray15[local48][local114][local89] & 0xFF;
						if (local186 > 0) {
							@Pc(196) Class20 local196 = this.aClass270_7.method6276(local186 - 1);
							Static395.anIntArray448[local89] -= local196.anInt466;
							Static247.anIntArray291[local89] -= local196.anInt464;
							Static275.anIntArray306[local89] -= local196.anInt463;
							Static257.anIntArray296[local89] -= local196.anInt459;
							local163 = Static282.anIntArray521[local89]--;
						}
					}
				}
				if (local85 >= 0) {
					local95 = 0;
					local114 = 0;
					local186 = 0;
					@Pc(253) int local253 = 0;
					@Pc(255) int local255 = 0;
					for (@Pc(257) int local257 = -5; local257 < this.anInt8259; local257++) {
						@Pc(263) int local263 = local257 + 5;
						if (this.anInt8259 > local263) {
							local186 += Static275.anIntArray306[local263];
							local255 += Static282.anIntArray521[local263];
							local253 += Static257.anIntArray296[local263];
							local95 += Static395.anIntArray448[local263];
							local114 += Static247.anIntArray291[local263];
						}
						@Pc(305) int local305 = local257 - 5;
						if (local305 >= 0) {
							local186 -= Static275.anIntArray306[local305];
							local255 -= Static282.anIntArray521[local305];
							local95 -= Static395.anIntArray448[local305];
							local253 -= Static257.anIntArray296[local305];
							local114 -= Static247.anIntArray291[local305];
						}
						if (local257 >= 0 && local253 > 0 && local255 > 0) {
							local46[local85][local257] = Static455.method8031(local114 / local255, local95 * 256 / local253, local186 / local255);
						}
					}
				}
			}
			if (Static472.aBoolean547) {
				this.method7093(local48, local48 == 0 ? arg2 : null, local46, Static511.aClass91Array3[local48], local48 == 0 ? arg1 : null, arg0);
			} else {
				this.method7094(local48 == 0 ? arg1 : null, arg0, local46, Static511.aClass91Array3[local48], local48 == 0 ? arg2 : null, local48);
			}
			this.aByteArrayArrayArray15[local48] = null;
			this.aByteArrayArrayArray14[local48] = null;
			this.aByteArrayArrayArray12[local48] = null;
			this.aByteArrayArrayArray11[local48] = null;
		}
		if (!this.aBoolean603) {
			if (Static181.anInt3623 != 0) {
				Static291.method4617();
			}
			if (Static346.aBoolean404) {
				Static605.method8509();
			}
		}
		for (local52 = 0; local52 < this.anInt8255; local52++) {
			Static511.aClass91Array3[local52].YA();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!s;B[[ILclient!s;Lclient!s;Lclient!ha;)V")
	private void method7093(@OriginalArg(0) int arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) Class91 arg3, @OriginalArg(5) Class91 arg4, @OriginalArg(6) Class13 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg0];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray11[arg0];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray15[arg0];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray14[arg0];
		for (@Pc(35) int local35 = 0; local35 < this.anInt8252; local35++) {
			@Pc(49) int local49 = this.anInt8252 - 1 <= local35 ? local35 : local35 + 1;
			for (@Pc(51) int local51 = 0; local51 < this.anInt8259; local51++) {
				@Pc(69) int local69 = local51 < this.anInt8259 - 1 ? local51 + 1 : local51;
				if (Static520.anInt8394 == -1 || Static168.method2928(arg0, local35, local51, Static520.anInt8394)) {
					@Pc(84) boolean local84 = false;
					@Pc(86) boolean local86 = false;
					@Pc(89) boolean[] local89 = new boolean[4];
					@Pc(95) int local95 = local10[local35][local51];
					@Pc(101) int local101 = local15[local35][local51];
					@Pc(109) int local109 = local25[local35][local51] & 0xFF;
					@Pc(117) int local117 = local20[local35][local51] & 0xFF;
					@Pc(125) int local125 = local20[local35][local69] & 0xFF;
					@Pc(133) int local133 = local20[local49][local69] & 0xFF;
					@Pc(141) int local141 = local20[local49][local51] & 0xFF;
					if (local109 != 0 || local117 != 0) {
						@Pc(166) Class273 local166 = local109 == 0 ? null : this.aClass216_5.method5090(local109 - 1);
						if (local95 == 0 && local166 == null) {
							local95 = 12;
						}
						@Pc(184) Class20 local184 = local117 == 0 ? null : this.aClass270_7.method6276(local117 - 1);
						@Pc(186) Class273 local186 = local166;
						if (local166 != null) {
							if (local166.anInt7209 == -1 && local166.anInt7212 == -1) {
								local186 = local166;
								local166 = null;
							} else if (local184 != null && local95 != 0) {
								local86 = local166.aBoolean521;
							}
						}
						@Pc(259) int local259;
						@Pc(304) int local304;
						@Pc(372) int local372;
						@Pc(382) int local382;
						if ((local95 == 0 || local95 == 12) && local35 > 0 && local51 > 0 && local35 < this.anInt8252 && this.anInt8259 > local51) {
							local259 = local117 == local20[local35 - 1][local51 - 1] ? 1 : -1;
							@Pc(272) int local272 = local117 == local20[local49][local69] ? 1 : -1;
							@Pc(287) int local287 = local117 == local20[local49][local51 - 1] ? 1 : -1;
							local304 = local117 == local20[local35 - 1][local69] ? 1 : -1;
							if (local20[local35][local51 - 1] == local117) {
								local287++;
								local259++;
							} else {
								local287--;
								local259--;
							}
							if (local117 == local20[local49][local51]) {
								local272++;
								local287++;
							} else {
								local272--;
								local287--;
							}
							if (local20[local35][local69] == local117) {
								local304++;
								local272++;
							} else {
								local272--;
								local304--;
							}
							if (local20[local35 - 1][local51] == local117) {
								local304++;
								local259++;
							} else {
								local259--;
								local304--;
							}
							local372 = local259 - local272;
							if (local372 < 0) {
								local372 = -local372;
							}
							local382 = local287 - local304;
							if (local382 < 0) {
								local382 = -local382;
							}
							if (local372 == local382) {
								local372 = arg3.method7447(local51, local35) - arg3.method7447(local69, local49);
								if (local372 < 0) {
									local372 = -local372;
								}
								local382 = arg3.method7447(local51, local49) - arg3.method7447(local69, local35);
								if (local382 < 0) {
									local382 = -local382;
								}
							}
							local101 = local372 >= local382 ? 0 : 1;
						}
						for (local259 = 0; local259 < 13; local259++) {
							Static59.anIntArray656[local259] = -1;
							Static353.anIntArray399[local259] = 1;
						}
						@Pc(475) boolean[] local475 = local166 != null && local166.aBoolean521 ? Static14.aBooleanArrayArray1[local95] : Static384.aBooleanArrayArray6[local95];
						this.method7090(arg5, local101, local35, local51, local25, local89, this.anInt8252, this.anInt8259, local95, local10, local184, local15, local166);
						@Pc(508) boolean local508 = local166 != null && local166.anInt7212 != local166.anInt7209;
						if (!local508) {
							for (local304 = 0; local304 < 8; local304++) {
								if (Static59.anIntArray656[local304] >= 0 && Static534.anIntArray637[local304] != Static419.anIntArray499[local304]) {
									local508 = true;
									break;
								}
							}
						}
						if (!local475[local101 + 1 & 0x3]) {
							local89[1] = Static209.method3507(local89[1], (Static353.anIntArray399[2] & Static353.anIntArray399[4]) == 0);
						}
						if (!local475[local101 + 3 & 0x3]) {
							local89[3] = Static209.method3507(local89[3], (Static353.anIntArray399[0] & Static353.anIntArray399[6]) == 0);
						}
						if (!local475[local101 & 0x3]) {
							local89[0] = Static209.method3507(local89[0], (Static353.anIntArray399[2] & Static353.anIntArray399[0]) == 0);
						}
						if (!local475[local101 + 2 & 0x3]) {
							local89[2] = Static209.method3507(local89[2], (Static353.anIntArray399[6] & Static353.anIntArray399[4]) == 0);
						}
						if (!local86 && (local95 == 0 || local95 == 12)) {
							if (local89[0] && !local89[1] && !local89[2] && local89[3]) {
								local89[0] = local89[3] = false;
								local101 = 0;
								local95 = local95 == 0 ? 13 : 14;
							} else if (local89[0] && local89[1] && !local89[2] && !local89[3]) {
								local89[0] = local89[1] = false;
								local95 = local95 == 0 ? 13 : 14;
								local101 = 3;
							} else if (!local89[0] && local89[1] && local89[2] && !local89[3]) {
								local89[1] = local89[2] = false;
								local101 = 2;
								local95 = local95 == 0 ? 13 : 14;
							} else if (!local89[0] && !local89[1] && local89[2] && local89[3]) {
								local101 = 1;
								local95 = local95 == 0 ? 13 : 14;
								local89[2] = local89[3] = false;
							}
						}
						@Pc(821) boolean local821 = !local86 && !local89[0] && !local89[2] && !local89[1] && !local89[3];
						@Pc(823) int[] local823 = null;
						@Pc(847) int[] local847;
						@Pc(859) int[] local859;
						@Pc(851) int[] local851;
						if (local821) {
							local382 = local166 == null ? 0 : Static388.anIntArray438[local95];
							local851 = Static193.anIntArrayArray113[local95];
							local859 = Static83.anIntArrayArray20[local95];
							local372 = local184 == null ? 0 : Static487.anIntArray558[local95];
							local847 = Static518.anIntArrayArray99[local95];
						} else if (local86) {
							local847 = Static467.anIntArrayArray114[local95];
							local372 = local184 == null ? 0 : Static649.anIntArray743[local95];
							local859 = Static275.anIntArrayArray50[local95];
							local851 = Static394.anIntArrayArray83[local95];
							local823 = Static9.anIntArrayArray2[local95];
							local382 = local166 == null ? 0 : Static144.anIntArray195[local95];
						} else {
							local382 = local166 == null ? 0 : Static543.anIntArray652[local95];
							local372 = local184 == null ? 0 : Static414.anIntArray461[local95];
							local847 = Static294.anIntArrayArray54[local95];
							local851 = Static394.anIntArrayArray84[local95];
							local823 = Static336.anIntArrayArray66[local95];
							local859 = Static75.anIntArrayArray100[local95];
						}
						@Pc(925) int local925 = local372 + local382;
						if (local925 <= 0) {
							Static10.method114(arg0, local35, local51);
						} else {
							if (local89[0]) {
								local925++;
							}
							if (local89[2]) {
								local925++;
							}
							if (local89[1]) {
								local925++;
							}
							if (local89[3]) {
								local925++;
							}
							@Pc(958) int local958 = 0;
							@Pc(960) int local960 = 0;
							@Pc(964) int local964 = local925 * 3;
							@Pc(971) int[] local971 = local508 ? new int[local964] : null;
							@Pc(974) int[] local974 = new int[local964];
							@Pc(977) int[] local977 = new int[local964];
							@Pc(980) int[] local980 = new int[local964];
							@Pc(983) int[] local983 = new int[local964];
							@Pc(986) int[] local986 = new int[local964];
							@Pc(993) int[] local993 = arg1 == null ? null : new int[local964];
							@Pc(1002) int[] local1002 = arg1 == null && arg4 == null ? null : new int[local964];
							@Pc(1004) int local1004 = -1;
							@Pc(1006) int local1006 = -1;
							@Pc(1008) int local1008 = 256;
							@Pc(1108) byte local1108;
							@Pc(1052) int local1052;
							@Pc(1054) int local1054;
							@Pc(1289) int local1289;
							@Pc(1295) int local1295;
							@Pc(1304) int local1304;
							@Pc(1309) int local1309;
							@Pc(1319) int local1319;
							@Pc(1314) int local1314;
							@Pc(1323) int local1323;
							@Pc(1379) int local1379;
							@Pc(1385) int local1385;
							if (local166 != null) {
								local1008 = local166.anInt7207;
								local1006 = local166.anInt7223;
								local1004 = local166.anInt7209;
								local1052 = Static482.method6815(arg5, local166);
								for (local1054 = 0; local1054 < local382; local1054++) {
									if (local89[-local101 & 0x3] && local958 == local823[0]) {
										Static191.anIntArray245[0] = local847[local958];
										Static191.anIntArray245[1] = 1;
										Static191.anIntArray245[2] = local851[local958];
										Static191.anIntArray245[3] = 1;
										Static191.anIntArray245[4] = local859[local958];
										Static191.anIntArray245[5] = local851[local958];
										local1108 = 6;
									} else if (local89[2 - local101 & 0x3] && local823[2] == local958) {
										Static191.anIntArray245[0] = local847[local958];
										Static191.anIntArray245[1] = 5;
										Static191.anIntArray245[2] = local851[local958];
										Static191.anIntArray245[3] = 5;
										Static191.anIntArray245[4] = local859[local958];
										local1108 = 6;
										Static191.anIntArray245[5] = local851[local958];
									} else if (local89[1 - local101 & 0x3] && local958 == local823[1]) {
										Static191.anIntArray245[0] = local847[local958];
										Static191.anIntArray245[1] = 3;
										Static191.anIntArray245[2] = local851[local958];
										Static191.anIntArray245[3] = 3;
										Static191.anIntArray245[4] = local859[local958];
										Static191.anIntArray245[5] = local851[local958];
										local1108 = 6;
									} else if (local89[3 - local101 & 0x3] && local823[3] == local958) {
										Static191.anIntArray245[0] = local847[local958];
										Static191.anIntArray245[1] = 7;
										Static191.anIntArray245[2] = local851[local958];
										Static191.anIntArray245[3] = 7;
										Static191.anIntArray245[4] = local859[local958];
										local1108 = 6;
										Static191.anIntArray245[5] = local851[local958];
									} else {
										Static191.anIntArray245[0] = local847[local958];
										Static191.anIntArray245[1] = local859[local958];
										Static191.anIntArray245[2] = local851[local958];
										local1108 = 3;
									}
									local958++;
									for (local1289 = 0; local1289 < local1108; local1289++) {
										local1295 = Static191.anIntArray245[local1289];
										local1304 = local1295 - local101 * 2 & 0x7;
										local1309 = this.anIntArray609[local1295];
										local1314 = this.anIntArray608[local1295];
										if (local101 == 1) {
											local1319 = local1314;
											local1323 = 512 - local1309;
										} else if (local101 == 2) {
											local1319 = 512 - local1309;
											local1323 = 512 - local1314;
										} else if (local101 == 3) {
											local1323 = local1309;
											local1319 = 512 - local1314;
										} else {
											local1319 = local1309;
											local1323 = local1314;
										}
										local974[local960] = local1319;
										local977[local960] = local1323;
										if (local993 != null && Static410.aBooleanArrayArray7[local95][local1295]) {
											local1379 = local1319 + (local35 << 9);
											local1385 = (local51 << 9) + local1323;
											local993[local960] = arg1.method7446(local1379, local1385) - arg3.method7446(local1379, local1385);
										}
										if (local1002 != null) {
											if (arg1 != null && !Static410.aBooleanArrayArray7[local95][local1295]) {
												local1379 = local1319 + (local35 << 9);
												local1385 = (local51 << 9) + local1323;
												local1002[local960] = arg3.method7446(local1379, local1385) - arg1.method7446(local1379, local1385);
											} else if (arg4 != null && !Static436.aBooleanArrayArray8[local95][local1295]) {
												local1379 = (local35 << 9) + local1319;
												local1385 = local1323 + (local51 << 9);
												local1002[local960] = arg4.method7446(local1379, local1385) - arg3.method7446(local1379, local1385);
											}
										}
										if (local1295 < 8 && local166.anInt7224 < Static59.anIntArray656[local1304]) {
											if (local971 != null) {
												local971[local960] = Static534.anIntArray637[local1304];
											}
											local986[local960] = Static102.anIntArray172[local1304];
											local983[local960] = Static508.anIntArray603[local1304];
											local980[local960] = Static419.anIntArray499[local1304];
										} else {
											if (local971 != null) {
												local971[local960] = local1052;
											}
											local983[local960] = local166.anInt7223;
											local986[local960] = local166.anInt7207;
											local980[local960] = local1004;
										}
										local960++;
									}
								}
								if (!this.aBoolean603 && arg0 == 0) {
									Static581.method8058(local35, local51, local166.anInt7217, local166.anInt7214 * 8, local166.anInt7220);
								}
								if (local95 != 12 && local166.anInt7209 != -1 && local166.aBoolean522) {
									local84 = true;
								}
							} else if (local821) {
								local958 = Static388.anIntArray438[local95];
							} else if (local86) {
								local958 = Static144.anIntArray195[local95];
							} else {
								local958 = Static543.anIntArray652[local95];
							}
							if (local184 != null) {
								if (local133 == 0) {
									local133 = local117;
								}
								if (local141 == 0) {
									local141 = local117;
								}
								if (local125 == 0) {
									local125 = local117;
								}
								@Pc(1610) Class20 local1610 = this.aClass270_7.method6276(local117 - 1);
								@Pc(1618) Class20 local1618 = this.aClass270_7.method6276(local125 - 1);
								@Pc(1626) Class20 local1626 = this.aClass270_7.method6276(local133 - 1);
								@Pc(1634) Class20 local1634 = this.aClass270_7.method6276(local141 - 1);
								for (local1304 = 0; local1304 < local372; local1304++) {
									if (local89[-local101 & 0x3] && local823[0] == local958) {
										Static191.anIntArray245[0] = local847[local958];
										Static191.anIntArray245[1] = 1;
										Static191.anIntArray245[2] = local851[local958];
										Static191.anIntArray245[3] = 1;
										Static191.anIntArray245[4] = local859[local958];
										Static191.anIntArray245[5] = local851[local958];
										local1108 = 6;
									} else if (local89[2 - local101 & 0x3] && local823[2] == local958) {
										Static191.anIntArray245[0] = local847[local958];
										Static191.anIntArray245[1] = 5;
										Static191.anIntArray245[2] = local851[local958];
										Static191.anIntArray245[3] = 5;
										Static191.anIntArray245[4] = local859[local958];
										local1108 = 6;
										Static191.anIntArray245[5] = local851[local958];
									} else if (local89[1 - local101 & 0x3] && local958 == local823[1]) {
										Static191.anIntArray245[0] = local847[local958];
										Static191.anIntArray245[1] = 3;
										Static191.anIntArray245[2] = local851[local958];
										Static191.anIntArray245[3] = 3;
										Static191.anIntArray245[4] = local859[local958];
										local1108 = 6;
										Static191.anIntArray245[5] = local851[local958];
									} else if (local89[3 - local101 & 0x3] && local823[3] == local958) {
										Static191.anIntArray245[0] = local847[local958];
										Static191.anIntArray245[1] = 7;
										Static191.anIntArray245[2] = local851[local958];
										Static191.anIntArray245[3] = 7;
										Static191.anIntArray245[4] = local859[local958];
										Static191.anIntArray245[5] = local851[local958];
										local1108 = 6;
									} else {
										Static191.anIntArray245[0] = local847[local958];
										Static191.anIntArray245[1] = local859[local958];
										Static191.anIntArray245[2] = local851[local958];
										local1108 = 3;
									}
									local958++;
									for (local1309 = 0; local1309 < local1108; local1309++) {
										local1319 = Static191.anIntArray245[local1309];
										local1314 = local1319 - local101 * 2 & 0x7;
										local1323 = this.anIntArray609[local1319];
										local1385 = this.anIntArray608[local1319];
										@Pc(1903) int local1903;
										if (local101 == 1) {
											local1903 = 512 - local1323;
											local1379 = local1385;
										} else if (local101 == 2) {
											local1903 = 512 - local1385;
											local1379 = 512 - local1323;
										} else if (local101 == 3) {
											local1379 = 512 - local1385;
											local1903 = local1323;
										} else {
											local1379 = local1323;
											local1903 = local1385;
										}
										local974[local960] = local1379;
										local977[local960] = local1903;
										@Pc(1960) int local1960;
										@Pc(1966) int local1966;
										if (local993 != null && Static410.aBooleanArrayArray7[local95][local1319]) {
											local1960 = local1379 + (local35 << 9);
											local1966 = local1903 + (local51 << 9);
											local993[local960] = arg1.method7446(local1960, local1966) - arg3.method7446(local1960, local1966);
										}
										if (local1002 != null) {
											if (arg1 != null && !Static410.aBooleanArrayArray7[local95][local1319]) {
												local1960 = local1379 + (local35 << 9);
												local1966 = (local51 << 9) + local1903;
												local1002[local960] = arg3.method7446(local1960, local1966) - arg1.method7446(local1960, local1966);
											} else if (arg4 != null && !Static436.aBooleanArrayArray8[local95][local1319]) {
												local1960 = local1379 + (local35 << 9);
												local1966 = (local51 << 9) + local1903;
												local1002[local960] = arg4.method7446(local1960, local1966) - arg3.method7446(local1960, local1966);
											}
										}
										if (local1319 < 8 && Static59.anIntArray656[local1314] >= 0) {
											if (local971 != null) {
												local971[local960] = Static534.anIntArray637[local1314];
											}
											local986[local960] = Static102.anIntArray172[local1314];
											local983[local960] = Static508.anIntArray603[local1314];
											local980[local960] = Static419.anIntArray499[local1314];
										} else {
											if (local86 && Static410.aBooleanArrayArray7[local95][local1319]) {
												local983[local960] = local1006;
												local986[local960] = local1008;
												local980[local960] = local1004;
											} else if (local1379 == 0 && local1903 == 0) {
												local980[local960] = arg2[local35][local51];
												local983[local960] = local1610.anInt461;
												local986[local960] = local1610.anInt460;
											} else if (local1379 == 0 && local1903 == 512) {
												local980[local960] = arg2[local35][local69];
												local983[local960] = local1618.anInt461;
												local986[local960] = local1618.anInt460;
											} else if (local1379 == 512 && local1903 == 512) {
												local980[local960] = arg2[local49][local69];
												local983[local960] = local1626.anInt461;
												local986[local960] = local1626.anInt460;
											} else if (local1379 == 512 && local1903 == 0) {
												local980[local960] = arg2[local49][local51];
												local983[local960] = local1634.anInt461;
												local986[local960] = local1634.anInt460;
											} else {
												if (local1379 < 256) {
													if (local1903 >= 256) {
														local983[local960] = local1618.anInt461;
														local986[local960] = local1618.anInt460;
													} else {
														local983[local960] = local1610.anInt461;
														local986[local960] = local1610.anInt460;
													}
												} else if (local1903 >= 256) {
													local983[local960] = local1626.anInt461;
													local986[local960] = local1626.anInt460;
												} else {
													local983[local960] = local1634.anInt461;
													local986[local960] = local1634.anInt460;
												}
												local1960 = Static388.method5735(arg2[local49][local51], arg2[local35][local51], local1379 << 7 >> 9);
												local1966 = Static388.method5735(arg2[local49][local69], arg2[local35][local69], local1379 << 7 >> 9);
												local980[local960] = Static388.method5735(local1966, local1960, local1903 << 7 >> 9);
											}
											if (local971 != null) {
												local971[local960] = local980[local960];
											}
										}
										local960++;
									}
								}
								if (local95 != 0 && local184.aBoolean46) {
									local84 = true;
								}
							}
							local1052 = arg3.method7447(local51, local35);
							local1054 = arg3.method7447(local51, local49);
							local1289 = arg3.method7447(local69, local49);
							local1295 = arg3.method7447(local69, local35);
							@Pc(2391) boolean local2391 = Static481.method6813(local51, local35);
							if (local2391 && arg0 > 1 || !local2391 && arg0 > 0) {
								@Pc(2404) boolean local2404 = true;
								if (local184 != null && !local184.aBoolean47) {
									local2404 = false;
								} else if (local117 == 0 && local95 != 0) {
									local2404 = false;
								} else if (local109 > 0 && local186 != null && !local186.aBoolean523) {
									local2404 = false;
								}
								if (local2404 && local1054 == local1052 && local1052 == local1289 && local1295 == local1052) {
									this.aByteArrayArrayArray13[arg0][local35][local51] = (byte) (this.aByteArrayArrayArray13[arg0][local35][local51] | 0x4);
								}
							}
							local1309 = 0;
							local1319 = 0;
							local1314 = 0;
							if (this.aBoolean603) {
								local1309 = Static16.method414(local35, local51);
								local1319 = Static646.method8864(local35, local51);
								local1314 = Static403.method6009(local35, local51);
							}
							arg3.U(local35, local51, local974, local993, local977, local1002, local980, local971, local983, local986, local1309, local1319, local1314, local84);
							Static10.method114(arg0, local35, local51);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!s;Lclient!ha;I[[ILclient!s;Lclient!s;I)V")
	private void method7094(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) Class91 arg3, @OriginalArg(5) Class91 arg4, @OriginalArg(6) int arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8252; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt8259; local11++) {
				if (Static520.anInt8394 == -1 || Static168.method2928(arg5, local7, local11, Static520.anInt8394)) {
					@Pc(36) byte local36 = this.aByteArrayArrayArray12[arg5][local7][local11];
					@Pc(45) byte local45 = this.aByteArrayArrayArray11[arg5][local7][local11];
					@Pc(56) int local56 = this.aByteArrayArrayArray14[arg5][local7][local11] & 0xFF;
					@Pc(67) int local67 = this.aByteArrayArrayArray15[arg5][local7][local11] & 0xFF;
					@Pc(82) Class273 local82 = local56 == 0 ? null : this.aClass216_5.method5090(local56 - 1);
					@Pc(94) Class20 local94 = local67 == 0 ? null : this.aClass270_7.method6276(local67 - 1);
					if (local36 == 0 && local82 == null) {
						local36 = 12;
					}
					@Pc(105) Class273 local105 = local82;
					if (local82 != null && local82.anInt7209 == -1 && local82.anInt7212 == -1) {
						local105 = local82;
						local82 = null;
					}
					if (local82 != null || local94 != null) {
						@Pc(129) int local129 = Static487.anIntArray558[local36];
						@Pc(133) int local133 = Static388.anIntArray438[local36];
						@Pc(145) int local145 = (local94 == null ? 0 : local129) + (local82 == null ? 0 : local133);
						@Pc(147) int local147 = 0;
						@Pc(149) int local149 = 0;
						@Pc(156) int local156 = local82 == null ? -1 : local82.anInt7223;
						@Pc(163) int local163 = local94 == null ? -1 : local94.anInt461;
						@Pc(166) int[] local166 = new int[local145];
						@Pc(169) int[] local169 = new int[local145];
						@Pc(172) int[] local172 = new int[local145];
						@Pc(175) int[] local175 = new int[local145];
						@Pc(178) int[] local178 = new int[local145];
						@Pc(181) int[] local181 = new int[local145];
						@Pc(193) int[] local193 = local82 == null || local82.anInt7212 == -1 ? null : new int[local145];
						@Pc(197) int local197;
						if (local82 == null) {
							local149 = local133;
						} else {
							for (local197 = 0; local197 < local133; local197++) {
								local166[local147] = Static518.anIntArrayArray99[local36][local149];
								local169[local147] = Static83.anIntArrayArray20[local36][local149];
								local172[local147] = Static193.anIntArrayArray113[local36][local149];
								local178[local147] = local156;
								local181[local147] = local82.anInt7207;
								local175[local147] = local82.anInt7209;
								if (local193 != null) {
									local193[local147] = local82.anInt7212;
								}
								local149++;
								local147++;
							}
							if (!this.aBoolean603 && arg5 == 0) {
								Static581.method8058(local7, local11, local82.anInt7217, local82.anInt7214 * 8, local82.anInt7220);
							}
						}
						if (local94 != null) {
							for (local197 = 0; local197 < local129; local197++) {
								local166[local147] = Static518.anIntArrayArray99[local36][local149];
								local169[local147] = Static83.anIntArrayArray20[local36][local149];
								local172[local147] = Static193.anIntArrayArray113[local36][local149];
								local178[local147] = local163;
								local181[local147] = local94.anInt460;
								local175[local147] = arg2[local7][local11];
								if (local193 != null) {
									local193[local147] = local175[local147];
								}
								local147++;
								local149++;
							}
						}
						local197 = this.anIntArray609.length;
						@Pc(340) int[] local340 = new int[local197];
						@Pc(343) int[] local343 = new int[local197];
						@Pc(350) int[] local350 = arg4 == null ? null : new int[local197];
						@Pc(359) int[] local359 = arg4 == null && arg0 == null ? null : new int[local197];
						@Pc(368) int local368;
						@Pc(373) int local373;
						@Pc(457) int local457;
						@Pc(465) int local465;
						for (@Pc(361) int local361 = 0; local361 < local197; local361++) {
							local368 = this.anIntArray609[local361];
							local373 = this.anIntArray608[local361];
							if (local45 == 0) {
								local340[local361] = local368;
								local343[local361] = local373;
							} else if (local45 == 1) {
								local340[local361] = local373;
								local343[local361] = 512 - local368;
							} else if (local45 == 2) {
								local340[local361] = 512 - local368;
								local343[local361] = 512 - local373;
							} else if (local45 == 3) {
								local340[local361] = 512 - local373;
								local343[local361] = local368;
							}
							if (local350 != null && Static410.aBooleanArrayArray7[local36][local361]) {
								local457 = (local7 << 9) + local340[local361];
								local465 = local343[local361] + (local11 << 9);
								local350[local361] = arg4.method7446(local457, local465) - arg3.method7446(local457, local465);
							}
							if (local359 != null) {
								if (arg4 != null && !Static410.aBooleanArrayArray7[local36][local361]) {
									local457 = local340[local361] + (local7 << 9);
									local465 = (local11 << 9) + local343[local361];
									local359[local361] = arg3.method7446(local457, local465) - arg4.method7446(local457, local465);
								} else if (arg0 != null && !Static436.aBooleanArrayArray8[local36][local361]) {
									local457 = local340[local361] + (local7 << 9);
									local465 = local343[local361] + (local11 << 9);
									local359[local361] = arg0.method7446(local457, local465) - arg3.method7446(local457, local465);
								}
							}
						}
						local368 = arg3.method7447(local11, local7);
						local373 = arg3.method7447(local11, local7 + 1);
						local457 = arg3.method7447(local11 + 1, local7 + 1);
						local465 = arg3.method7447(local11 + 1, local7);
						@Pc(602) boolean local602 = Static481.method6813(local11, local7);
						if (local602 && arg5 > 1 || !local602 && arg5 > 0) {
							@Pc(616) boolean local616 = true;
							if (local94 != null && !local94.aBoolean47) {
								local616 = false;
							} else if (local67 == 0 && local36 != 0) {
								local616 = false;
							} else if (local56 > 0 && local105 != null && !local105.aBoolean523) {
								local616 = false;
							}
							if (local616 && local373 == local368 && local457 == local368 && local465 == local368) {
								this.aByteArrayArrayArray13[arg5][local7][local11] = (byte) (this.aByteArrayArrayArray13[arg5][local7][local11] | 0x4);
							}
						}
						@Pc(684) int local684 = 0;
						@Pc(686) int local686 = 0;
						@Pc(688) int local688 = 0;
						if (this.aBoolean603) {
							local684 = Static16.method414(local7, local11);
							local686 = Static646.method8864(local7, local11);
							local688 = Static403.method6009(local7, local11);
						}
						arg3.method7444(local7, local11, local340, local350, local343, local359, local166, local169, local172, local175, local193, local178, local181, local684, local686, local688);
						Static10.method114(arg5, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!ha;[Lclient!je;[[[I)V")
	public final void method7095(@OriginalArg(1) Class13 arg0, @OriginalArg(2) Class175[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean603) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt8252; local10++) {
					for (local14 = 0; local14 < this.anInt8259; local14++) {
						if ((Static372.aByteArrayArrayArray3[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static372.aByteArrayArrayArray3[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg1[local28].method4294(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt8255; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean603) {
				if (Static346.aBoolean404) {
					local10 = 2;
				}
				if (Static387.aBoolean471) {
					local14 = 8;
				}
				if (Static181.anInt3623 != 0) {
					if (local6 == 0 | Static229.aBoolean312) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static346.aBoolean404) {
				local14 |= 0x7;
			}
			if (!Static646.aBoolean757) {
				local14 |= 0x20;
			}
			@Pc(151) int[][] local151 = arg2 == null || arg2.length <= local6 ? this.anIntArrayArrayArray17[local6] : arg2[local6];
			Static382.method5679(local6, arg0.method8160(this.anInt8252, this.anInt8259, this.anIntArrayArrayArray17[local6], local151, local10, local14));
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII[Lclient!je;IILclient!sl;II)V")
	public final void method7096(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class175[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub17 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(17) int local17 = (arg8 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean603) {
			@Pc(24) Class175 local24 = arg3[arg7];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static535.method7427(local30 & 0x7, local26 & 0x7, arg0) + arg4;
					local56 = Static501.method6963(local26 & 0x7, arg0, local30 & 0x7) + arg5;
					if (local44 > 0 && this.anInt8252 - 1 > local44 && local56 > 0 && this.anInt8259 - 1 > local56) {
						local24.method4300(local56, local44);
					}
				}
			}
		}
		@Pc(100) int local100 = (arg1 & 0xFFFFFFF8) << 3;
		local26 = (arg8 & 0xFFFFFFF8) << 3;
		@Pc(108) byte local108 = 0;
		@Pc(114) byte local114 = 0;
		if (arg0 == 1) {
			local114 = 1;
		} else if (arg0 == 2) {
			local114 = 1;
			local108 = 1;
		} else if (arg0 == 3) {
			local108 = 1;
		}
		for (local56 = 0; local56 < this.anInt8255; local56++) {
			for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
				for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
					if (local56 == arg2 && local145 >= local11 && local11 + 8 >= local145 && local149 >= local17 && local17 + 8 >= local149) {
						@Pc(232) int local232;
						@Pc(242) int local242;
						if (local145 == local11 + 8 || local17 + 8 == local149) {
							if (arg0 == 0) {
								local232 = local145 + arg4 - local11;
								local242 = local149 + arg5 - local17;
							} else if (arg0 == 1) {
								local232 = local149 + arg4 - local17;
								local242 = local11 + arg5 + 8 - local145;
							} else if (arg0 == 2) {
								local232 = arg4 + local11 + 8 - local145;
								local242 = local17 + arg5 + 8 - local149;
							} else {
								local232 = arg4 + local17 + 8 - local149;
								local242 = arg5 + local145 - local11;
							}
							this.method7099(arg7, local149 + local26, 0, local232, 0, 0, arg6, local100 + local145, true, local242);
						} else {
							local232 = arg4 + Static535.method7427(local149 & 0x7, local145 & 0x7, arg0);
							local242 = Static501.method6963(local145 & 0x7, arg0, local149 & 0x7) + arg5;
							this.method7099(arg7, local149 + local26, local108, local232, arg0, local114, arg6, local145 + local100, false, local242);
						}
						if (local145 == 63 || local149 == 63) {
							@Pc(362) byte local362 = 1;
							if (local145 == 63 && local149 == 63) {
								local362 = 3;
							}
							for (@Pc(374) int local374 = 0; local374 < local362; local374++) {
								@Pc(378) int local378 = local145;
								@Pc(380) int local380 = local149;
								if (local374 == 0) {
									local380 = local149 == 63 ? 64 : local149;
									local378 = local145 == 63 ? 64 : local145;
								} else if (local374 == 1) {
									local378 = 64;
								} else if (local374 == 2) {
									local380 = 64;
								}
								@Pc(431) int local431;
								@Pc(440) int local440;
								if (arg0 == 0) {
									local431 = local378 + arg4 - local11;
									local440 = local380 + arg5 - local17;
								} else if (arg0 == 1) {
									local431 = local380 + arg4 - local17;
									local440 = arg5 + local11 + 8 - local378;
								} else if (arg0 == 2) {
									local431 = arg4 + local11 + 8 - local378;
									local440 = arg5 + local17 + 8 - local380;
								} else {
									local431 = arg4 + local17 + 8 - local380;
									local440 = local378 + arg5 - local11;
								}
								if (local431 >= 0 && local431 < this.anInt8252 && local440 >= 0 && local440 < this.anInt8259) {
									this.anIntArrayArrayArray17[arg7][local431][local440] = this.anIntArrayArrayArray17[arg7][local232 + local108][local114 + local242];
								}
							}
						}
					} else {
						this.method7099(0, 0, 0, -1, 0, 0, arg6, 0, false, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V")
	public final void method7098(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt8255; local11++) {
			this.method7100(arg0, 64, 64, arg1, local11);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIBILclient!sl;IZI)V")
	private void method7099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub17 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (arg4 == 1) {
			arg5 = 1;
		} else if (arg4 == 2) {
			arg5 = 1;
			arg2 = 1;
		} else if (arg4 == 3) {
			arg2 = 1;
		}
		@Pc(74) int local74;
		if (arg3 < 0 || this.anInt8252 <= arg3 || arg9 < 0 || arg9 >= this.anInt8259) {
			while (true) {
				local74 = arg6.method2859();
				if (local74 == 0) {
					return;
				}
				if (local74 == 1) {
					arg6.method2859();
					return;
				}
				if (local74 <= 49) {
					arg6.method2859();
				}
			}
			return;
		}
		if (!this.aBoolean603 && !arg8) {
			Static372.aByteArrayArrayArray3[arg0][arg3][arg9] = 0;
		}
		while (true) {
			local74 = arg6.method2859();
			if (local74 == 0) {
				if (this.aBoolean603) {
					this.anIntArrayArrayArray17[0][arg2 + arg3][arg9 + arg5] = 0;
					return;
				} else if (arg0 == 0) {
					this.anIntArrayArrayArray17[0][arg3 + arg2][arg5 + arg9] = -Static592.method8365(arg7 + 932731, arg1 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray17[arg0][arg2 + arg3][arg9 + arg5] = this.anIntArrayArrayArray17[arg0 - 1][arg2 + arg3][arg9 + arg5] - 960;
					return;
				}
			}
			if (local74 == 1) {
				@Pc(159) int local159 = arg6.method2859();
				if (!this.aBoolean603) {
					if (local159 == 1) {
						local159 = 0;
					}
					if (arg0 != 0) {
						this.anIntArrayArrayArray17[arg0][arg2 + arg3][arg5 + arg9] = this.anIntArrayArrayArray17[arg0 - 1][arg2 + arg3][arg9 + arg5] - (local159 * 8 << 2);
						return;
					}
					this.anIntArrayArrayArray17[0][arg2 + arg3][arg5 + arg9] = -local159 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray17[0][arg3 + arg2][arg9 + arg5] = local159 * 8 << 2;
				return;
			}
			if (local74 <= 49) {
				if (arg8) {
					arg6.method2859();
				} else {
					this.aByteArrayArrayArray14[arg0][arg3][arg9] = arg6.method2860();
					this.aByteArrayArrayArray12[arg0][arg3][arg9] = (byte) ((local74 - 2) / 4);
					this.aByteArrayArrayArray11[arg0][arg3][arg9] = (byte) (local74 + arg4 - 2 & 0x3);
				}
			} else if (local74 <= 81) {
				if (!this.aBoolean603 && !arg8) {
					Static372.aByteArrayArrayArray3[arg0][arg3][arg9] = (byte) (local74 - 49);
				}
			} else if (!arg8) {
				this.aByteArrayArrayArray15[arg0][arg3][arg9] = (byte) (local74 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIBI)V")
	public final void method7100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg3; local3 < arg3 + arg2; local3++) {
			for (local7 = arg0; local7 < arg0 + arg1; local7++) {
				if (local7 >= 0 && this.anInt8252 > local7 && local3 >= 0 && local3 < this.anInt8259) {
					this.anIntArrayArrayArray17[arg4][local7][local3] = arg4 <= 0 ? 0 : this.anIntArrayArrayArray17[arg4 - 1][local7][local3] - 960;
				}
			}
		}
		if (arg0 > 0 && this.anInt8252 > arg0) {
			for (local7 = arg3 + 1; local7 < arg3 + arg2; local7++) {
				if (local7 >= 0 && local7 < this.anInt8259) {
					this.anIntArrayArrayArray17[arg4][arg0][local7] = this.anIntArrayArrayArray17[arg4][arg0 - 1][local7];
				}
			}
		}
		if (arg3 > 0 && this.anInt8259 > arg3) {
			for (local7 = arg0 + 1; local7 < arg1 + arg0; local7++) {
				if (local7 >= 0 && local7 < this.anInt8252) {
					this.anIntArrayArrayArray17[arg4][local7][arg3] = this.anIntArrayArrayArray17[arg4][local7][arg3 - 1];
				}
			}
		}
		if (arg0 < 0 || arg3 < 0 || arg0 >= this.anInt8252 || arg3 >= this.anInt8259) {
			return;
		}
		if (arg4 != 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray17[arg4 - 1][arg0 - 1][arg3] != this.anIntArrayArrayArray17[arg4][arg0 - 1][arg3]) {
				this.anIntArrayArrayArray17[arg4][arg0][arg3] = this.anIntArrayArrayArray17[arg4][arg0 - 1][arg3];
				return;
			}
			if (arg3 > 0 && this.anIntArrayArrayArray17[arg4][arg0][arg3 - 1] != this.anIntArrayArrayArray17[arg4 - 1][arg0][arg3 - 1]) {
				this.anIntArrayArrayArray17[arg4][arg0][arg3] = this.anIntArrayArrayArray17[arg4][arg0][arg3 - 1];
				return;
			}
			if (arg0 > 0 && arg3 > 0 && this.anIntArrayArrayArray17[arg4 - 1][arg0 - 1][arg3 - 1] != this.anIntArrayArrayArray17[arg4][arg0 - 1][arg3 - 1]) {
				this.anIntArrayArrayArray17[arg4][arg0][arg3] = this.anIntArrayArrayArray17[arg4][arg0 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray17[arg4][arg0 - 1][arg3] != 0) {
			this.anIntArrayArrayArray17[arg4][arg0][arg3] = this.anIntArrayArrayArray17[arg4][arg0 - 1][arg3];
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray17[arg4][arg0][arg3 - 1] != 0) {
			this.anIntArrayArrayArray17[arg4][arg0][arg3] = this.anIntArrayArrayArray17[arg4][arg0][arg3 - 1];
			return;
		}
		if (arg0 > 0 && arg3 > 0 && this.anIntArrayArrayArray17[arg4][arg0 - 1][arg3 - 1] != 0) {
			this.anIntArrayArrayArray17[arg4][arg0][arg3] = this.anIntArrayArrayArray17[arg4][arg0 - 1][arg3 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILclient!sl;IIB[Lclient!je;)V")
	public final void method7101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class175[] arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(25) int local25;
		if (!this.aBoolean603) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class175 local12 = arg5[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local25 = arg3 + local14;
						@Pc(29) int local29 = local18 + arg4;
						if (local25 >= 0 && local25 < this.anInt8252 && local29 >= 0 && this.anInt8259 > local29) {
							local12.method4300(local29, local25);
						}
					}
				}
			}
		}
		local6 = arg3 + arg1;
		@Pc(86) int local86 = arg0 + arg4;
		for (local14 = 0; local14 < this.anInt8255; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					this.method7099(local14, local25 + local86, 0, local18 + arg3, 0, 0, arg2, local18 + local6, false, local25 + arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II[[I)V")
	public final void method7102(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray17[0];
		for (@Pc(21) int local21 = 0; local21 < this.anInt8252 + 1; local21++) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt8259 + 1; local25++) {
				local10[local21][local25] += arg0[local21][local25];
			}
		}
	}
}
