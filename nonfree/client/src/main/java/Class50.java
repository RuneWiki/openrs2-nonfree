import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public class Class50 {

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "[I")
	private final int[] anIntArray109 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "[I")
	private final int[] anIntArray110 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "Lclient!sf;")
	private final Class309 aClass309_2;

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "Z")
	public final boolean aBoolean61;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
	protected final int anInt1106;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
	protected final int anInt1100;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	public final int anInt1101;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "Lclient!ll;")
	private final Class211 aClass211_2;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(IIIZLclient!sf;Lclient!ll;)V")
	protected Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class309 arg4, @OriginalArg(5) Class211 arg5) {
		this.aClass309_2 = arg4;
		this.aBoolean61 = arg3;
		this.anInt1106 = arg1;
		this.anInt1100 = arg2;
		this.anInt1101 = arg0;
		this.aClass211_2 = arg5;
		this.aByteArrayArrayArray9 = new byte[this.anInt1101][this.anInt1106 + 1][this.anInt1100 + 1];
		this.aByteArrayArrayArray8 = new byte[this.anInt1101][this.anInt1106][this.anInt1100];
		this.aByteArrayArrayArray12 = new byte[this.anInt1101][this.anInt1106][this.anInt1100];
		this.aByteArrayArrayArray7 = new byte[this.anInt1101][this.anInt1106][this.anInt1100];
		this.anIntArrayArrayArray3 = new int[this.anInt1101][this.anInt1106 + 1][this.anInt1100 + 1];
		this.aByteArrayArrayArray10 = new byte[this.anInt1101][this.anInt1106][this.anInt1100];
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[[BIIILclient!pt;I[[B[[BLclient!jo;[ZIILclient!r;)V")
	private void method1043(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class274 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) Class179 arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class162 arg12) {
		@Pc(18) boolean[] local18 = arg8 != null && arg8.aBoolean317 ? Static499.aBooleanArrayArray7[arg11] : Static511.aBooleanArrayArray9[arg11];
		@Pc(40) int local40;
		@Pc(50) Class179 local50;
		@Pc(67) byte local67;
		@Pc(83) int local83;
		@Pc(88) int local88;
		if (arg2 > 0) {
			if (arg5 > 0) {
				local40 = arg0[arg5 - 1][arg2 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass309_2.method6246(local40 - 1);
					if (local50.anInt4274 != -1 && local50.aBoolean317) {
						local67 = arg7[arg5 - 1][arg2 - 1];
						local83 = arg6[arg5 - 1][arg2 - 1] * 2 + 4 & 0x7;
						local88 = Static155.method2113(arg12, local50);
						if (Static188.aBooleanArrayArray6[local67][local83]) {
							Static512.anIntArray550[0] = local50.anInt4274;
							Static571.anIntArray605[0] = local88;
							Static101.anIntArray156[0] = local50.anInt4278;
							Static417.anIntArray580[0] = local50.anInt4269;
							Static431.anIntArray473[0] = local50.anInt4272;
							Static134.anIntArray181[0] = 256;
						}
					}
				}
			}
			if (arg1 - 1 > arg5) {
				local40 = arg0[arg5 + 1][arg2 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass309_2.method6246(local40 - 1);
					if (local50.anInt4274 != -1 && local50.aBoolean317) {
						local67 = arg7[arg5 + 1][arg2 - 1];
						local83 = arg6[arg5 + 1][arg2 - 1] * 2 + 6 & 0x7;
						local88 = Static155.method2113(arg12, local50);
						if (Static188.aBooleanArrayArray6[local67][local83]) {
							Static512.anIntArray550[2] = local50.anInt4274;
							Static571.anIntArray605[2] = local88;
							Static101.anIntArray156[2] = local50.anInt4278;
							Static417.anIntArray580[2] = local50.anInt4269;
							Static431.anIntArray473[2] = local50.anInt4272;
							Static134.anIntArray181[2] = 512;
						}
					}
				}
			}
		}
		if (arg10 - 1 > arg2) {
			if (arg5 > 0) {
				local40 = arg0[arg5 - 1][arg2 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass309_2.method6246(local40 - 1);
					if (local50.anInt4274 != -1 && local50.aBoolean317) {
						local67 = arg7[arg5 - 1][arg2 + 1];
						local83 = arg6[arg5 - 1][arg2 + 1] * 2 + 2 & 0x7;
						local88 = Static155.method2113(arg12, local50);
						if (Static188.aBooleanArrayArray6[local67][local83]) {
							Static512.anIntArray550[6] = local50.anInt4274;
							Static571.anIntArray605[6] = local88;
							Static101.anIntArray156[6] = local50.anInt4278;
							Static417.anIntArray580[6] = local50.anInt4269;
							Static431.anIntArray473[6] = local50.anInt4272;
							Static134.anIntArray181[6] = 64;
						}
					}
				}
			}
			if (arg5 < arg1 - 1) {
				local40 = arg0[arg5 + 1][arg2 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass309_2.method6246(local40 - 1);
					if (local50.anInt4274 != -1 && local50.aBoolean317) {
						local67 = arg7[arg5 + 1][arg2 + 1];
						local83 = arg6[arg5 + 1][arg2 + 1] * 2 & 0x7;
						local88 = Static155.method2113(arg12, local50);
						if (Static188.aBooleanArrayArray6[local67][local83]) {
							Static512.anIntArray550[4] = local50.anInt4274;
							Static571.anIntArray605[4] = local88;
							Static101.anIntArray156[4] = local50.anInt4278;
							Static417.anIntArray580[4] = local50.anInt4269;
							Static431.anIntArray473[4] = local50.anInt4272;
							Static134.anIntArray181[4] = 128;
						}
					}
				}
			}
		}
		@Pc(507) int local507;
		@Pc(512) int local512;
		@Pc(514) int local514;
		@Pc(475) byte local475;
		if (arg2 > 0) {
			local40 = arg0[arg5][arg2 - 1] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass309_2.method6246(local40 - 1);
				if (local50.anInt4274 != -1) {
					local67 = arg7[arg5][arg2 - 1];
					local475 = arg6[arg5][arg2 - 1];
					if (local50.aBoolean317) {
						local88 = 2;
						local507 = local475 * 2 + 4;
						local512 = Static155.method2113(arg12, local50);
						for (local514 = 0; local514 < 3; local514++) {
							local507 &= 0x7;
							local88 &= 0x7;
							if (Static188.aBooleanArrayArray6[local67][local507] && Static431.anIntArray473[local88] <= local50.anInt4272) {
								Static512.anIntArray550[local88] = local50.anInt4274;
								Static571.anIntArray605[local88] = local512;
								Static101.anIntArray156[local88] = local50.anInt4278;
								Static417.anIntArray580[local88] = local50.anInt4269;
								if (local50.anInt4272 == Static431.anIntArray473[local88]) {
									Static134.anIntArray181[local88] |= 0x20;
								} else {
									Static134.anIntArray181[local88] = 32;
								}
								Static431.anIntArray473[local88] = local50.anInt4272;
							}
							local88--;
							local507++;
						}
						if (!local18[arg3 & 0x3]) {
							arg9[0] = Static499.aBooleanArrayArray7[local67][local475 + 2 & 0x3];
						}
					} else if (!local18[arg3 & 0x3]) {
						arg9[0] = Static511.aBooleanArrayArray9[local67][local475 + 2 & 0x3];
					}
				}
			}
		}
		if (arg10 - 1 > arg2) {
			local40 = arg0[arg5][arg2 + 1] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass309_2.method6246(local40 - 1);
				if (local50.anInt4274 != -1) {
					local67 = arg7[arg5][arg2 + 1];
					local475 = arg6[arg5][arg2 + 1];
					if (local50.aBoolean317) {
						local88 = 4;
						local507 = local475 * 2 + 2;
						local512 = Static155.method2113(arg12, local50);
						for (local514 = 0; local514 < 3; local514++) {
							local88 &= 0x7;
							local507 &= 0x7;
							if (Static188.aBooleanArrayArray6[local67][local507] && local50.anInt4272 >= Static431.anIntArray473[local88]) {
								Static512.anIntArray550[local88] = local50.anInt4274;
								Static571.anIntArray605[local88] = local512;
								Static101.anIntArray156[local88] = local50.anInt4278;
								Static417.anIntArray580[local88] = local50.anInt4269;
								if (local50.anInt4272 == Static431.anIntArray473[local88]) {
									Static134.anIntArray181[local88] |= 0x10;
								} else {
									Static134.anIntArray181[local88] = 16;
								}
								Static431.anIntArray473[local88] = local50.anInt4272;
							}
							local507--;
							local88++;
						}
						if (!local18[arg3 + 2 & 0x3]) {
							arg9[2] = Static499.aBooleanArrayArray7[local67][--local475 & 0x3];
						}
					} else if (!local18[arg3 + 2 & 0x3]) {
						arg9[2] = Static511.aBooleanArrayArray9[local67][local475 & 0x3];
					}
				}
			}
		}
		if (arg5 > 0) {
			local40 = arg0[arg5 - 1][arg2] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass309_2.method6246(local40 - 1);
				if (local50.anInt4274 != -1) {
					local67 = arg7[arg5 - 1][arg2];
					local475 = arg6[arg5 - 1][arg2];
					if (local50.aBoolean317) {
						local88 = 6;
						local507 = local475 * 2 + 4;
						local512 = Static155.method2113(arg12, local50);
						for (local514 = 0; local514 < 3; local514++) {
							local507 &= 0x7;
							local88 &= 0x7;
							if (Static188.aBooleanArrayArray6[local67][local507] && Static431.anIntArray473[local88] <= local50.anInt4272) {
								Static512.anIntArray550[local88] = local50.anInt4274;
								Static571.anIntArray605[local88] = local512;
								Static101.anIntArray156[local88] = local50.anInt4278;
								Static417.anIntArray580[local88] = local50.anInt4269;
								if (Static431.anIntArray473[local88] == local50.anInt4272) {
									Static134.anIntArray181[local88] |= 0x8;
								} else {
									Static134.anIntArray181[local88] = 8;
								}
								Static431.anIntArray473[local88] = local50.anInt4272;
							}
							local507--;
							local88++;
						}
						if (!local18[arg3 + 3 & 0x3]) {
							arg9[3] = Static499.aBooleanArrayArray7[local67][local475 + 1 & 0x3];
						}
					} else if (!local18[arg3 + 3 & 0x3]) {
						arg9[3] = Static511.aBooleanArrayArray9[local67][local475 + 1 & 0x3];
					}
				}
			}
		}
		if (arg5 < arg1 - 1) {
			local40 = arg0[arg5 + 1][arg2] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass309_2.method6246(local40 - 1);
				if (local50.anInt4274 != -1) {
					local67 = arg7[arg5 + 1][arg2];
					local475 = arg6[arg5 + 1][arg2];
					if (local50.aBoolean317) {
						local88 = 4;
						local507 = local475 * 2 + 6;
						local512 = Static155.method2113(arg12, local50);
						for (local514 = 0; local514 < 3; local514++) {
							local507 &= 0x7;
							local88 &= 0x7;
							if (Static188.aBooleanArrayArray6[local67][local507] && Static431.anIntArray473[local88] <= local50.anInt4272) {
								Static512.anIntArray550[local88] = local50.anInt4274;
								Static571.anIntArray605[local88] = local512;
								Static101.anIntArray156[local88] = local50.anInt4278;
								Static417.anIntArray580[local88] = local50.anInt4269;
								if (Static431.anIntArray473[local88] == local50.anInt4272) {
									Static134.anIntArray181[local88] |= 0x4;
								} else {
									Static134.anIntArray181[local88] = 4;
								}
								Static431.anIntArray473[local88] = local50.anInt4272;
							}
							local88--;
							local507++;
						}
						if (!local18[arg3 + 1 & 0x3]) {
							arg9[1] = Static499.aBooleanArrayArray7[local67][local475 + 3 & 0x3];
						}
					} else if (!local18[arg3 + 1 & 0x3]) {
						arg9[1] = Static511.aBooleanArrayArray9[local67][local475 + 3 & 0x3];
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local40 = Static155.method2113(arg12, arg8);
		if (!arg8.aBoolean317) {
			return;
		}
		for (@Pc(1188) int local1188 = 0; local1188 < 8; local1188++) {
			@Pc(1199) int local1199 = local1188 - arg3 * 2 & 0x7;
			if (Static188.aBooleanArrayArray6[arg11][local1188] && arg8.anInt4272 >= Static431.anIntArray473[local1199]) {
				Static512.anIntArray550[local1199] = arg8.anInt4274;
				Static571.anIntArray605[local1199] = local40;
				Static101.anIntArray156[local1199] = arg8.anInt4278;
				Static417.anIntArray580[local1199] = arg8.anInt4269;
				if (arg8.anInt4272 == Static431.anIntArray473[local1199]) {
					Static134.anIntArray181[local1199] |= 0x2;
				} else {
					Static134.anIntArray181[local1199] = 2;
				}
				Static431.anIntArray473[local1199] = arg8.anInt4272;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([[[ILclient!r;I[Lclient!wg;)V")
	public final void method1044(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(3) Class362[] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean61) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt1106; local14++) {
					for (local18 = 0; local18 < this.anInt1100; local18++) {
						if ((Static433.aByteArrayArrayArray15[local10][local14][local18] & 0x1) != 0) {
							@Pc(35) int local35 = local10;
							if ((Static433.aByteArrayArrayArray15[1][local14][local18] & 0x2) != 0) {
								local35 = local10 - 1;
							}
							if (local35 >= 0) {
								arg2[local35].method7603(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt1101; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean61) {
				if (Static359.aBoolean228) {
					local18 = 8;
				}
				if (Static343.aBoolean469) {
					local14 = 2;
				}
				if (Static284.anInt4832 != 0) {
					if (local10 == 0 | Static180.aBoolean188) {
						local18 |= 0x10;
					}
					local14 |= 0x1;
				}
			}
			if (Static343.aBoolean469) {
				local18 |= 0x7;
			}
			if (!Static156.aBoolean174) {
				local18 |= 0x20;
			}
			@Pc(158) int[][] local158 = arg0 == null || local10 >= arg0.length ? this.anIntArrayArrayArray3[local10] : arg0[local10];
			Static365.method5148(local10, arg1.method6858(this.anInt1106, this.anInt1100, this.anIntArrayArrayArray3[local10], local158, local14, local18));
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBIIII)V")
	private void method1045(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg0; local3 < arg0 + 64; local3++) {
			for (local7 = arg2; local7 < arg2 + 64; local7++) {
				if (local7 >= 0 && this.anInt1106 > local7 && local3 >= 0 && this.anInt1100 > local3) {
					this.anIntArrayArrayArray3[arg1][local7][local3] = arg1 <= 0 ? 0 : this.anIntArrayArrayArray3[arg1 - 1][local7][local3] - 960;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt1106) {
			for (local7 = arg0 + 1; local7 < arg0 + 64; local7++) {
				if (local7 >= 0 && this.anInt1100 > local7) {
					this.anIntArrayArrayArray3[arg1][arg2][local7] = this.anIntArrayArrayArray3[arg1][arg2 - 1][local7];
				}
			}
		}
		if (arg0 > 0 && this.anInt1100 > arg0) {
			for (local7 = arg2 + 1; local7 < arg2 + 64; local7++) {
				if (local7 >= 0 && this.anInt1106 > local7) {
					this.anIntArrayArrayArray3[arg1][local7][arg0] = this.anIntArrayArrayArray3[arg1][local7][arg0 - 1];
				}
			}
		}
		if (arg2 < 0 || arg0 < 0 || this.anInt1106 <= arg2 || this.anInt1100 <= arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0] != 0) {
				this.anIntArrayArrayArray3[arg1][arg2][arg0] = this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray3[arg1][arg2][arg0 - 1] != 0) {
				this.anIntArrayArrayArray3[arg1][arg2][arg0] = this.anIntArrayArrayArray3[arg1][arg2][arg0 - 1];
				return;
			}
			if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray3[arg1][arg2][arg0] = this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray3[arg1 - 1][arg2 - 1][arg0] != this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0]) {
			this.anIntArrayArrayArray3[arg1][arg2][arg0] = this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray3[arg1 - 1][arg2][arg0 - 1] != this.anIntArrayArrayArray3[arg1][arg2][arg0 - 1]) {
			this.anIntArrayArrayArray3[arg1][arg2][arg0] = this.anIntArrayArrayArray3[arg1][arg2][arg0 - 1];
			return;
		}
		if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 - 1] != this.anIntArrayArrayArray3[arg1 - 1][arg2 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray3[arg1][arg2][arg0] = this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!i;Lclient!r;Lclient!i;Lclient!i;[[IIB)V")
	private void method1047(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(3) Class151 arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1106; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt1100; local11++) {
				if (Static238.anInt3979 == -1 || Static470.method6060(local11, Static238.anInt3979, local7, arg5)) {
					@Pc(34) byte local34 = this.aByteArrayArrayArray12[arg5][local7][local11];
					@Pc(43) byte local43 = this.aByteArrayArrayArray8[arg5][local7][local11];
					@Pc(54) int local54 = this.aByteArrayArrayArray7[arg5][local7][local11] & 0xFF;
					@Pc(65) int local65 = this.aByteArrayArrayArray10[arg5][local7][local11] & 0xFF;
					@Pc(80) Class179 local80 = local54 == 0 ? null : this.aClass309_2.method6246(local54 - 1);
					@Pc(92) Class274 local92 = local65 == 0 ? null : this.aClass211_2.method4404(local65 - 1);
					@Pc(94) int local94 = 0;
					@Pc(96) int local96 = 0;
					if (local34 != 0) {
						local94 = local92 == null ? 0 : Static401.anIntArray421[local34];
						local96 = local80 == null ? 0 : Static499.anIntArray535[local34];
					} else if (local80 != null) {
						local96 = Static499.anIntArray535[local34];
					} else if (local92 != null) {
						local94 = Static499.anIntArray535[local34];
					}
					@Pc(134) int local134 = local94 + local96;
					@Pc(136) int local136 = 0;
					if (local134 != 0) {
						@Pc(145) int local145;
						if (Static207.aBoolean217) {
							local145 = local80 == null ? -1 : local80.anInt4278;
						} else {
							local145 = -1;
						}
						@Pc(157) int[] local157 = new int[local134];
						@Pc(160) int[] local160 = new int[local134];
						@Pc(163) int[] local163 = new int[local134];
						@Pc(166) int[] local166 = new int[local134];
						@Pc(168) boolean local168 = false;
						@Pc(184) int local184;
						if (local80 == null || local80.anInt4274 == -1 && local80.anInt4279 == -1 && local145 == -1) {
							for (local184 = 0; local184 < local96; local184++) {
								local157[local136] = -1;
								local136++;
							}
						} else {
							for (local184 = 0; local184 < local96; local184++) {
								local163[local136] = local145;
								local166[local136] = local80.anInt4269;
								if (local80.anInt4274 == -1) {
									local157[local136] = -1;
								} else {
									local157[local136] = local80.anInt4274;
								}
								if (local80.anInt4279 == -1) {
									local160[local136] = -1;
								} else {
									local160[local136] = local80.anInt4279;
									local168 = true;
								}
								local136++;
							}
							if (!this.aBoolean61 && arg5 == 0) {
								Static287.method4075(local7, local11, local80.anInt4276, local80.anInt4280 * 8, local80.anInt4271);
							}
						}
						if (!local168) {
							local160 = null;
						}
						if (local92 == null) {
							for (local184 = 0; local184 < local94; local184++) {
								local157[local136] = -1;
								local136++;
							}
						} else {
							local184 = local92.anInt6885;
							if (Static207.aBoolean217) {
								local184 = -1;
							}
							for (@Pc(302) int local302 = 0; local302 < local94; local302++) {
								local163[local136] = local184;
								local166[local136] = local92.anInt6886;
								local157[local136] = arg4[local7][local11];
								if (local160 != null) {
									local160[local136] = -1;
								}
								local136++;
							}
						}
						local184 = this.anIntArray109.length;
						@Pc(339) int[] local339 = new int[local184];
						@Pc(342) int[] local342 = new int[local184];
						@Pc(349) int[] local349 = arg0 == null ? null : new int[local184];
						@Pc(358) int[] local358 = arg0 == null && arg3 == null ? null : new int[local184];
						@Pc(367) int local367;
						@Pc(372) int local372;
						@Pc(449) int local449;
						@Pc(455) int local455;
						for (@Pc(360) int local360 = 0; local360 < local184; local360++) {
							local367 = this.anIntArray109[local360];
							local372 = this.anIntArray110[local360];
							if (local43 == 0) {
								local339[local360] = local367;
								local342[local360] = local372;
							} else if (local43 == 1) {
								local339[local360] = local372;
								local342[local360] = 512 - local367;
							} else if (local43 == 2) {
								local339[local360] = 512 - local367;
								local342[local360] = 512 - local372;
							} else if (local43 == 3) {
								local339[local360] = 512 - local372;
								local342[local360] = local367;
							}
							if (local349 != null && Static188.aBooleanArrayArray6[local34][local360]) {
								local449 = (local7 << 9) + local367;
								local455 = (local11 << 9) + local367;
								local349[local360] = arg0.method7680(local449, local455) - arg2.method7680(local449, local455);
							}
							if (local358 != null) {
								if (arg0 != null && !Static188.aBooleanArrayArray6[local34][local360]) {
									local449 = (local7 << 9) + local367;
									local455 = local367 + (local11 << 9);
									local358[local360] = arg2.method7680(local449, local455) - arg0.method7680(local449, local455);
								} else if (arg3 != null && !Static100.aBooleanArrayArray3[local34][local360]) {
									local449 = local367 + (local7 << 9);
									local455 = local367 + (local11 << 9);
									local358[local360] = arg3.method7680(local449, local455) - arg2.method7680(local449, local455);
								}
							}
						}
						local367 = arg2.method7676(local11, local7);
						local372 = arg2.method7676(local11, local7 + 1);
						local449 = arg2.method7676(local11 + 1, local7 + 1);
						local455 = arg2.method7676(local11 + 1, local7);
						@Pc(584) boolean local584 = Static562.method7350(local7, local11);
						if (local584 && arg5 > 1 || !local584 && arg5 > 0) {
							@Pc(600) boolean local600 = true;
							if (local92 != null && !local92.aBoolean561) {
								local600 = false;
							} else if (local65 == 0 && local34 != 0) {
								local600 = false;
							} else if (local54 > 0 && local80 != null && !local80.aBoolean316) {
								local600 = false;
							}
							if (local600 && local367 == local372 && local449 == local367 && local455 == local367) {
								this.aByteArrayArrayArray9[arg5][local7][local11] = (byte) (this.aByteArrayArrayArray9[arg5][local7][local11] | 0x4);
							}
						}
						@Pc(662) int local662 = 0;
						@Pc(664) int local664 = 0;
						@Pc(666) int local666 = 0;
						if (this.aBoolean61) {
							local662 = Static376.method5249(local7, local11);
							local664 = Static64.method1092(local7, local11);
							local666 = Static543.method7103(local7, local11);
						}
						arg2.method7673(local7, local11, local339, local349, local342, local358, Static125.anIntArrayArray27[local34], Static18.anIntArrayArray37[local34], Static70.anIntArrayArray18[local34], local157, local160, local163, local166, local662, local664, local666);
						Static412.method5553(arg5, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!i;Lclient!i;BLclient!r;)V")
	public final void method1048(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class151 arg1, @OriginalArg(3) Class162 arg2) {
		if (Static63.anIntArray112 == null || this.anInt1100 != Static63.anIntArray112.length) {
			Static526.anIntArray619 = new int[this.anInt1100];
			Static13.anIntArray416 = new int[this.anInt1100];
			Static535.anIntArray575 = new int[this.anInt1100];
			Static270.anIntArray316 = new int[this.anInt1100];
			Static63.anIntArray112 = new int[this.anInt1100];
		}
		@Pc(42) int[][] local42 = new int[this.anInt1106][this.anInt1100];
		@Pc(81) int local81;
		for (@Pc(44) int local44 = 0; local44 < this.anInt1101; local44++) {
			for (@Pc(48) int local48 = 0; local48 < this.anInt1100; local48++) {
				Static63.anIntArray112[local48] = 0;
				Static535.anIntArray575[local48] = 0;
				Static526.anIntArray619[local48] = 0;
				Static270.anIntArray316[local48] = 0;
				Static13.anIntArray416[local48] = 0;
			}
			for (local81 = -5; local81 < this.anInt1106; local81++) {
				@Pc(91) int local91;
				@Pc(106) int local106;
				@Pc(175) int local175;
				for (@Pc(85) int local85 = 0; local85 < this.anInt1100; local85++) {
					local91 = local81 + 5;
					@Pc(155) int local155;
					if (local91 < this.anInt1106) {
						local106 = this.aByteArrayArrayArray10[local44][local91][local85] & 0xFF;
						if (local106 > 0) {
							@Pc(119) Class274 local119 = this.aClass211_2.method4404(local106 - 1);
							Static63.anIntArray112[local85] += local119.anInt6888;
							Static535.anIntArray575[local85] += local119.anInt6894;
							Static526.anIntArray619[local85] += local119.anInt6897;
							Static270.anIntArray316[local85] += local119.anInt6891;
							local155 = Static13.anIntArray416[local85]++;
						}
					}
					local106 = local81 - 5;
					if (local106 >= 0) {
						local175 = this.aByteArrayArrayArray10[local44][local106][local85] & 0xFF;
						if (local175 > 0) {
							@Pc(185) Class274 local185 = this.aClass211_2.method4404(local175 - 1);
							Static63.anIntArray112[local85] -= local185.anInt6888;
							Static535.anIntArray575[local85] -= local185.anInt6894;
							Static526.anIntArray619[local85] -= local185.anInt6897;
							Static270.anIntArray316[local85] -= local185.anInt6891;
							local155 = Static13.anIntArray416[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local106 = 0;
					local175 = 0;
					@Pc(239) int local239 = 0;
					@Pc(241) int local241 = 0;
					for (@Pc(243) int local243 = -5; local243 < this.anInt1100; local243++) {
						@Pc(249) int local249 = local243 + 5;
						if (this.anInt1100 > local249) {
							local241 += Static13.anIntArray416[local249];
							local175 += Static526.anIntArray619[local249];
							local239 += Static270.anIntArray316[local249];
							local91 += Static63.anIntArray112[local249];
							local106 += Static535.anIntArray575[local249];
						}
						@Pc(287) int local287 = local243 - 5;
						if (local287 >= 0) {
							local91 -= Static63.anIntArray112[local287];
							local175 -= Static526.anIntArray619[local287];
							local106 -= Static535.anIntArray575[local287];
							local241 -= Static13.anIntArray416[local287];
							local239 -= Static270.anIntArray316[local287];
						}
						if (local243 >= 0 && local239 > 0 && local241 > 0) {
							local42[local81][local243] = Static470.method6062(local91 * 256 / local239, local175 / local241, local106 / local241);
						}
					}
				}
			}
			if (Static243.aBoolean302) {
				this.method1056(local44 == 0 ? arg0 : null, arg2, local44, Static114.aClass151Array1[local44], local44 == 0 ? arg1 : null, local42);
			} else {
				this.method1047(local44 == 0 ? arg0 : null, arg2, Static114.aClass151Array1[local44], local44 == 0 ? arg1 : null, local42, local44);
			}
			this.aByteArrayArrayArray10[local44] = null;
			this.aByteArrayArrayArray7[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray8[local44] = null;
		}
		if (!this.aBoolean61) {
			if (Static284.anInt4832 != 0) {
				Static201.method2519();
			}
			if (Static343.aBoolean469) {
				Static198.method2495();
			}
		}
		for (local81 = 0; local81 < this.anInt1101; local81++) {
			Static114.aClass151Array1[local81].BA();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[[II)V")
	public final void method1049(@OriginalArg(1) int[][] arg0) {
		@Pc(14) int[][] local14 = this.anIntArrayArrayArray3[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1106 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt1100 + 1; local20++) {
				local14[local16][local20] += arg0[local16][local20];
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILclient!gk;IIIIII[Lclient!wg;)V")
	public final void method1050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class362[] arg8) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean61) {
			@Pc(18) Class362 local18 = arg8[arg5];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = Static278.method3511(local20 & 0x7, arg0, local24 & 0x7) + arg3;
					local50 = arg6 + Static136.method1876(local20 & 0x7, arg0, local24 & 0x7);
					if (local38 > 0 && local38 < this.anInt1106 - 1 && local50 > 0 && local50 < this.anInt1100 - 1) {
						local18.method7591(local50, local38);
					}
				}
			}
		}
		@Pc(91) int local91 = (arg7 & 0x7) * 8;
		@Pc(97) int local97 = (arg4 & 0xFFFFFFF8) << 3;
		local20 = (arg7 & 0x1FFFFFF8) << 3;
		@Pc(105) byte local105 = 0;
		@Pc(107) byte local107 = 0;
		if (arg0 == 1) {
			local107 = 1;
		} else if (arg0 == 2) {
			local105 = 1;
			local107 = 1;
		} else if (arg0 == 3) {
			local105 = 1;
		}
		for (local50 = 0; local50 < this.anInt1101; local50++) {
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
					if (arg1 == local50 && local11 <= local142 && local11 + 8 >= local142 && local146 >= local91 && local91 + 8 >= local146) {
						@Pc(202) int local202;
						@Pc(214) int local214;
						if (local142 == local11 + 8 || local91 + 8 == local146) {
							if (arg0 == 0) {
								local202 = arg3 + local142 - local11;
								local214 = arg6 + local146 - local91;
							} else if (arg0 == 1) {
								local214 = arg6 + local11 + 8 - local142;
								local202 = arg3 + local146 - local91;
							} else if (arg0 == 2) {
								local202 = local11 + arg3 + 8 - local142;
								local214 = local91 + arg6 + 8 - local146;
							} else {
								local214 = local142 + arg6 - local11;
								local202 = arg3 + local91 + 8 - local146;
							}
							this.method1053(0, local142 + local97, local20 - -local146, arg5, true, 0, arg2, 0, local202, local214);
						} else {
							local202 = arg3 + Static278.method3511(local142 & 0x7, arg0, local146 & 0x7);
							local214 = Static136.method1876(local142 & 0x7, arg0, local146 & 0x7) + arg6;
							this.method1053(arg0, local97 + local142, local146 + local20, arg5, false, local105, arg2, local107, local202, local214);
						}
						if (local142 == 63 || local146 == 63) {
							@Pc(341) byte local341 = 1;
							if (local142 == 63 && local146 == 63) {
								local341 = 3;
							}
							for (@Pc(353) int local353 = 0; local353 < local341; local353++) {
								@Pc(357) int local357 = local142;
								@Pc(359) int local359 = local146;
								if (local353 == 0) {
									local357 = local142 == 63 ? 64 : local142;
									local359 = local146 == 63 ? 64 : local146;
								} else if (local353 == 1) {
									local357 = 64;
								} else if (local353 == 2) {
									local359 = 64;
								}
								@Pc(423) int local423;
								@Pc(415) int local415;
								if (arg0 == 0) {
									local415 = local359 + arg6 - local91;
									local423 = arg3 + local357 - local11;
								} else if (arg0 == 1) {
									local423 = local359 + arg3 - local91;
									local415 = local11 + arg6 + 8 - local357;
								} else if (arg0 == 2) {
									local415 = arg6 + local91 + 8 - local359;
									local423 = arg3 + local11 + 8 - local357;
								} else {
									local415 = arg6 + local357 - local11;
									local423 = arg3 + local91 + 8 - local359;
								}
								if (local423 >= 0 && this.anInt1106 > local423 && local415 >= 0 && local415 < this.anInt1100) {
									this.anIntArrayArrayArray3[arg5][local423][local415] = this.anIntArrayArrayArray3[arg5][local105 + local202][local214 + local107];
								}
							}
						}
					} else {
						this.method1053(0, 0, 0, 0, false, 0, arg2, 0, -1, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)V")
	public final void method1051(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1101; local11++) {
			this.method1045(arg0, local11, arg1);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIZILclient!gk;III)V")
	private void method1053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub7 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == 1) {
			arg7 = 1;
		} else if (arg0 == 2) {
			arg5 = 1;
			arg7 = 1;
		} else if (arg0 == 3) {
			arg5 = 1;
		}
		@Pc(75) int local75;
		if (arg8 < 0 || this.anInt1106 <= arg8 || arg9 < 0 || arg9 >= this.anInt1100) {
			while (true) {
				local75 = arg6.method4464();
				if (local75 == 0) {
					return;
				}
				if (local75 == 1) {
					arg6.method4464();
					return;
				}
				if (local75 <= 49) {
					arg6.method4464();
				}
			}
			return;
		}
		if (!this.aBoolean61 && !arg4) {
			Static433.aByteArrayArrayArray15[arg3][arg8][arg9] = 0;
		}
		while (true) {
			local75 = arg6.method4464();
			if (local75 == 0) {
				if (this.aBoolean61) {
					this.anIntArrayArrayArray3[0][arg5 + arg8][arg7 + arg9] = 0;
					return;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray3[0][arg8 + arg5][arg7 + arg9] = -Static140.method4030(arg1 + 932731, 556238 - -arg2) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray3[arg3][arg5 + arg8][arg9 + arg7] = this.anIntArrayArrayArray3[arg3 - 1][arg5 + arg8][arg7 + arg9] - 960;
					return;
				}
			}
			if (local75 == 1) {
				@Pc(164) int local164 = arg6.method4464();
				if (this.aBoolean61) {
					this.anIntArrayArrayArray3[0][arg5 + arg8][arg9 + arg7] = local164 * 8 << 2;
					return;
				}
				if (local164 == 1) {
					local164 = 0;
				}
				if (arg3 == 0) {
					this.anIntArrayArrayArray3[0][arg5 + arg8][arg7 + arg9] = -local164 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray3[arg3][arg8 + arg5][arg9 + arg7] = this.anIntArrayArrayArray3[arg3 - 1][arg5 + arg8][arg7 + arg9] - (local164 * 8 << 2);
				return;
			}
			if (local75 <= 49) {
				if (arg4) {
					arg6.method4464();
				} else {
					this.aByteArrayArrayArray7[arg3][arg8][arg9] = arg6.method4477();
					this.aByteArrayArrayArray12[arg3][arg8][arg9] = (byte) ((local75 - 2) / 4);
					this.aByteArrayArrayArray8[arg3][arg8][arg9] = (byte) (arg0 + local75 - 2 & 0x3);
				}
			} else if (local75 <= 81) {
				if (!this.aBoolean61 && !arg4) {
					Static433.aByteArrayArrayArray15[arg3][arg8][arg9] = (byte) (local75 - 49);
				}
			} else if (!arg4) {
				this.aByteArrayArrayArray10[arg3][arg8][arg9] = (byte) (local75 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!gk;III[Lclient!wg;II)V")
	public final void method1054(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class362[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean61) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class362 local12 = arg3[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg4;
						@Pc(28) int local28 = local18 + arg1;
						if (local24 >= 0 && this.anInt1106 > local24 && local28 >= 0 && local28 < this.anInt1100) {
							local12.method7591(local28, local24);
						}
					}
				}
			}
		}
		local6 = arg2 + arg4;
		@Pc(86) int local86 = arg1 + arg5;
		for (local14 = 0; local14 < this.anInt1101; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method1053(0, local18 + local6, local86 - -local24, local14, false, 0, arg0, 0, local18 + arg4, local24 - -arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!i;Lclient!r;ZILclient!i;Lclient!i;[[I)V")
	private void method1056(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class151 arg3, @OriginalArg(5) Class151 arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg2];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray8[arg2];
		@Pc(26) byte[][] local26 = this.aByteArrayArrayArray10[arg2];
		@Pc(31) byte[][] local31 = this.aByteArrayArrayArray7[arg2];
		for (@Pc(33) int local33 = 0; local33 < this.anInt1106; local33++) {
			@Pc(47) int local47 = this.anInt1106 - 1 > local33 ? local33 + 1 : local33;
			for (@Pc(49) int local49 = 0; local49 < this.anInt1100; local49++) {
				@Pc(67) int local67 = local49 >= this.anInt1100 - 1 ? local49 : local49 + 1;
				if (Static238.anInt3979 == -1 || Static470.method6060(local49, Static238.anInt3979, local33, arg2)) {
					@Pc(82) boolean local82 = false;
					@Pc(84) boolean local84 = false;
					@Pc(87) boolean[] local87 = new boolean[4];
					@Pc(93) int local93 = local10[local33][local49];
					@Pc(99) int local99 = local15[local33][local49];
					@Pc(107) int local107 = local31[local33][local49] & 0xFF;
					@Pc(115) int local115 = local26[local33][local49] & 0xFF;
					@Pc(123) int local123 = local26[local33][local67] & 0xFF;
					@Pc(131) int local131 = local26[local47][local67] & 0xFF;
					@Pc(139) int local139 = local26[local47][local49] & 0xFF;
					if (local107 != 0 || local115 != 0) {
						@Pc(161) Class179 local161 = local107 == 0 ? null : this.aClass309_2.method6246(local107 - 1);
						@Pc(173) Class274 local173 = local115 == 0 ? null : this.aClass211_2.method4404(local115 - 1);
						if (local93 == 0 && local161 == null) {
							local93 = 12;
						}
						@Pc(184) Class179 local184 = local161;
						if (local161 != null) {
							if (local161.anInt4274 == -1 && local161.anInt4279 == -1) {
								local184 = local161;
								local161 = null;
							} else if (local173 != null && local93 != 0) {
								local84 = local161.aBoolean317;
							}
						}
						@Pc(275) int local275;
						@Pc(311) int local311;
						@Pc(380) int local380;
						@Pc(393) int local393;
						if ((local93 == 0 || local93 == 12) && local33 > 0 && local49 > 0 && this.anInt1106 > local33 && this.anInt1100 > local49) {
							@Pc(254) int local254 = local115 == local26[local47][local67] ? 1 : -1;
							local275 = local115 == local26[local33 - 1][local49 - 1] ? 1 : -1;
							@Pc(296) int local296 = local115 == local26[local47][local49 - 1] ? 1 : -1;
							local311 = local115 == local26[local33 - 1][local67] ? 1 : -1;
							if (local115 == local26[local33][local49 - 1]) {
								local296++;
								local275++;
							} else {
								local296--;
								local275--;
							}
							if (local115 == local26[local47][local49]) {
								local296++;
								local254++;
							} else {
								local296--;
								local254--;
							}
							if (local26[local33][local67] == local115) {
								local311++;
								local254++;
							} else {
								local254--;
								local311--;
							}
							if (local115 == local26[local33 - 1][local49]) {
								local311++;
								local275++;
							} else {
								local275--;
								local311--;
							}
							local380 = local275 - local254;
							if (local380 < 0) {
								local380 = -local380;
							}
							local393 = local296 - local311;
							if (local393 < 0) {
								local393 = -local393;
							}
							if (local393 == local380) {
								local380 = arg3.method7676(local49, local33) - arg3.method7676(local67, local47);
								local393 = arg3.method7676(local49, local47) - arg3.method7676(local67, local33);
								if (local380 < 0) {
									local380 = -local380;
								}
								if (local393 < 0) {
									local393 = -local393;
								}
							}
							local99 = local380 >= local393 ? 0 : 1;
						}
						for (local275 = 0; local275 < 13; local275++) {
							Static431.anIntArray473[local275] = -1;
							Static134.anIntArray181[local275] = 1;
						}
						@Pc(475) boolean[] local475 = local161 != null && local161.aBoolean317 ? Static499.aBooleanArrayArray7[local93] : Static511.aBooleanArrayArray9[local93];
						this.method1043(local31, this.anInt1106, local49, local99, local173, local33, local15, local10, local161, local87, this.anInt1100, local93, arg1);
						@Pc(508) boolean local508 = local161 != null && local161.anInt4274 != local161.anInt4279;
						if (!local508) {
							for (local311 = 0; local311 < 8; local311++) {
								if (Static431.anIntArray473[local311] >= 0 && Static571.anIntArray605[local311] != Static512.anIntArray550[local311]) {
									local508 = true;
									break;
								}
							}
						}
						if (!local475[local99 + 1 & 0x3]) {
							local87[1] = Static206.method2565(local87[1], (Static134.anIntArray181[2] & Static134.anIntArray181[4]) == 0);
						}
						if (!local475[local99 + 3 & 0x3]) {
							local87[3] = Static206.method2565(local87[3], (Static134.anIntArray181[0] & Static134.anIntArray181[6]) == 0);
						}
						if (!local475[local99 & 0x3]) {
							local87[0] = Static206.method2565(local87[0], (Static134.anIntArray181[2] & Static134.anIntArray181[0]) == 0);
						}
						if (!local475[local99 + 2 & 0x3]) {
							local87[2] = Static206.method2565(local87[2], (Static134.anIntArray181[6] & Static134.anIntArray181[4]) == 0);
						}
						if (!local84 && (local93 == 0 || local93 == 12)) {
							if (local87[0] && !local87[1] && !local87[2] && local87[3]) {
								local93 = local93 == 0 ? 13 : 14;
								local87[0] = local87[3] = false;
								local99 = 0;
							} else if (local87[0] && local87[1] && !local87[2] && !local87[3]) {
								local87[0] = local87[1] = false;
								local93 = local93 == 0 ? 13 : 14;
								local99 = 3;
							} else if (!local87[0] && local87[1] && local87[2] && !local87[3]) {
								local99 = 2;
								local93 = local93 == 0 ? 13 : 14;
								local87[1] = local87[2] = false;
							} else if (!local87[0] && !local87[1] && local87[2] && local87[3]) {
								local93 = local93 == 0 ? 13 : 14;
								local87[2] = local87[3] = false;
								local99 = 1;
							}
						}
						@Pc(819) boolean local819 = !local84 && !local87[0] && !local87[2] && !local87[1] && !local87[3];
						@Pc(821) int[] local821 = null;
						@Pc(831) int[] local831;
						@Pc(851) int[] local851;
						@Pc(827) int[] local827;
						if (local819) {
							local827 = Static70.anIntArrayArray18[local93];
							local831 = Static125.anIntArrayArray27[local93];
							local393 = local161 == null ? 0 : Static499.anIntArray535[local93];
							local380 = local173 == null ? 0 : Static401.anIntArray421[local93];
							local851 = Static18.anIntArrayArray37[local93];
						} else if (local84) {
							local393 = local161 == null ? 0 : Static76.anIntArray136[local93];
							local827 = Static81.anIntArrayArray61[local93];
							local851 = Static62.anIntArrayArray12[local93];
							local821 = Static6.anIntArrayArray1[local93];
							local380 = local173 == null ? 0 : Static229.anIntArray274[local93];
							local831 = Static321.anIntArrayArray42[local93];
						} else {
							local831 = Static16.anIntArrayArray2[local93];
							local393 = local161 == null ? 0 : Static17.anIntArray326[local93];
							local821 = Static319.anIntArrayArray41[local93];
							local851 = Static448.anIntArrayArray17[local93];
							local380 = local173 == null ? 0 : Static72.anIntArray123[local93];
							local827 = Static292.anIntArrayArray39[local93];
						}
						@Pc(924) int local924 = local393 + local380;
						if (local924 <= 0) {
							Static412.method5553(arg2, local33, local49);
						} else {
							if (local87[0]) {
								local924++;
							}
							if (local87[2]) {
								local924++;
							}
							if (local87[1]) {
								local924++;
							}
							if (local87[3]) {
								local924++;
							}
							@Pc(954) int local954 = 0;
							@Pc(956) int local956 = 0;
							@Pc(960) int local960 = local924 * 3;
							@Pc(967) int[] local967 = local508 ? new int[local960] : null;
							@Pc(970) int[] local970 = new int[local960];
							@Pc(973) int[] local973 = new int[local960];
							@Pc(976) int[] local976 = new int[local960];
							@Pc(979) int[] local979 = new int[local960];
							@Pc(982) int[] local982 = new int[local960];
							@Pc(989) int[] local989 = arg0 == null ? null : new int[local960];
							@Pc(998) int[] local998 = arg0 == null && arg4 == null ? null : new int[local960];
							@Pc(1000) int local1000 = -1;
							@Pc(1002) int local1002 = -1;
							@Pc(1004) int local1004 = 256;
							@Pc(1118) byte local1118;
							@Pc(1048) int local1048;
							@Pc(1050) int local1050;
							@Pc(1282) int local1282;
							@Pc(1288) int local1288;
							@Pc(1297) int local1297;
							@Pc(1302) int local1302;
							@Pc(1326) int local1326;
							@Pc(1307) int local1307;
							@Pc(1322) int local1322;
							@Pc(1375) int local1375;
							@Pc(1381) int local1381;
							if (local161 != null) {
								local1004 = local161.anInt4269;
								local1000 = local161.anInt4274;
								local1002 = local161.anInt4278;
								local1048 = Static155.method2113(arg1, local161);
								for (local1050 = 0; local1050 < local393; local1050++) {
									if (local87[-local99 & 0x3] && local954 == local821[0]) {
										Static97.anIntArray152[0] = local831[local954];
										Static97.anIntArray152[1] = 1;
										Static97.anIntArray152[2] = local827[local954];
										Static97.anIntArray152[3] = 1;
										Static97.anIntArray152[4] = local851[local954];
										local1118 = 6;
										Static97.anIntArray152[5] = local827[local954];
									} else if (local87[2 - local99 & 0x3] && local954 == local821[2]) {
										Static97.anIntArray152[0] = local831[local954];
										Static97.anIntArray152[1] = 5;
										Static97.anIntArray152[2] = local827[local954];
										Static97.anIntArray152[3] = 5;
										Static97.anIntArray152[4] = local851[local954];
										Static97.anIntArray152[5] = local827[local954];
										local1118 = 6;
									} else if (local87[1 - local99 & 0x3] && local821[1] == local954) {
										Static97.anIntArray152[0] = local831[local954];
										Static97.anIntArray152[1] = 3;
										Static97.anIntArray152[2] = local827[local954];
										Static97.anIntArray152[3] = 3;
										Static97.anIntArray152[4] = local851[local954];
										Static97.anIntArray152[5] = local827[local954];
										local1118 = 6;
									} else if (local87[3 - local99 & 0x3] && local821[3] == local954) {
										Static97.anIntArray152[0] = local831[local954];
										Static97.anIntArray152[1] = 7;
										Static97.anIntArray152[2] = local827[local954];
										Static97.anIntArray152[3] = 7;
										Static97.anIntArray152[4] = local851[local954];
										Static97.anIntArray152[5] = local827[local954];
										local1118 = 6;
									} else {
										Static97.anIntArray152[0] = local831[local954];
										Static97.anIntArray152[1] = local851[local954];
										Static97.anIntArray152[2] = local827[local954];
										local1118 = 3;
									}
									local954++;
									for (local1282 = 0; local1282 < local1118; local1282++) {
										local1288 = Static97.anIntArray152[local1282];
										local1297 = local1288 - local99 * 2 & 0x7;
										local1302 = this.anIntArray109[local1288];
										local1307 = this.anIntArray110[local1288];
										if (local99 == 1) {
											local1326 = local1307;
											local1322 = 512 - local1302;
										} else if (local99 == 2) {
											local1322 = 512 - local1307;
											local1326 = 512 - local1302;
										} else if (local99 == 3) {
											local1326 = 512 - local1307;
											local1322 = local1302;
										} else {
											local1322 = local1307;
											local1326 = local1302;
										}
										local970[local956] = local1326;
										local973[local956] = local1322;
										if (local989 != null && Static188.aBooleanArrayArray6[local93][local1288]) {
											local1375 = (local33 << 9) + local1326;
											local1381 = (local49 << 9) + local1322;
											local989[local956] = arg0.method7680(local1375, local1381) - arg3.method7680(local1375, local1381);
										}
										if (local998 != null) {
											if (arg0 != null && !Static188.aBooleanArrayArray6[local93][local1288]) {
												local1375 = (local33 << 9) + local1326;
												local1381 = local1322 + (local49 << 9);
												local998[local956] = arg3.method7680(local1375, local1381) - arg0.method7680(local1375, local1381);
											} else if (arg4 != null && !Static100.aBooleanArrayArray3[local93][local1288]) {
												local1375 = local1326 + (local33 << 9);
												local1381 = (local49 << 9) + local1322;
												local998[local956] = arg4.method7680(local1375, local1381) - arg3.method7680(local1375, local1381);
											}
										}
										if (local1288 < 8 && Static431.anIntArray473[local1297] > local161.anInt4272) {
											if (local967 != null) {
												local967[local956] = Static571.anIntArray605[local1297];
											}
											local982[local956] = Static417.anIntArray580[local1297];
											local979[local956] = Static101.anIntArray156[local1297];
											local976[local956] = Static512.anIntArray550[local1297];
										} else {
											if (local967 != null) {
												local967[local956] = local1048;
											}
											local979[local956] = local161.anInt4278;
											local982[local956] = local161.anInt4269;
											local976[local956] = local1000;
										}
										local956++;
									}
								}
								if (!this.aBoolean61 && arg2 == 0) {
									Static287.method4075(local33, local49, local161.anInt4276, local161.anInt4280 * 8, local161.anInt4271);
								}
								if (local93 != 12 && local161.anInt4274 != -1 && local161.aBoolean318) {
									local82 = true;
								}
							} else if (local819) {
								local954 = Static499.anIntArray535[local93];
							} else if (local84) {
								local954 = Static76.anIntArray136[local93];
							} else {
								local954 = Static17.anIntArray326[local93];
							}
							if (local173 != null) {
								if (local139 == 0) {
									local139 = local115;
								}
								if (local123 == 0) {
									local123 = local115;
								}
								if (local131 == 0) {
									local131 = local115;
								}
								@Pc(1600) Class274 local1600 = this.aClass211_2.method4404(local115 - 1);
								@Pc(1608) Class274 local1608 = this.aClass211_2.method4404(local123 - 1);
								@Pc(1616) Class274 local1616 = this.aClass211_2.method4404(local131 - 1);
								@Pc(1624) Class274 local1624 = this.aClass211_2.method4404(local139 - 1);
								for (local1297 = 0; local1297 < local380; local1297++) {
									if (local87[-local99 & 0x3] && local821[0] == local954) {
										Static97.anIntArray152[0] = local831[local954];
										Static97.anIntArray152[1] = 1;
										Static97.anIntArray152[2] = local827[local954];
										Static97.anIntArray152[3] = 1;
										Static97.anIntArray152[4] = local851[local954];
										Static97.anIntArray152[5] = local827[local954];
										local1118 = 6;
									} else if (local87[2 - local99 & 0x3] && local954 == local821[2]) {
										Static97.anIntArray152[0] = local831[local954];
										Static97.anIntArray152[1] = 5;
										Static97.anIntArray152[2] = local827[local954];
										Static97.anIntArray152[3] = 5;
										Static97.anIntArray152[4] = local851[local954];
										local1118 = 6;
										Static97.anIntArray152[5] = local827[local954];
									} else if (local87[1 - local99 & 0x3] && local954 == local821[1]) {
										Static97.anIntArray152[0] = local831[local954];
										Static97.anIntArray152[1] = 3;
										Static97.anIntArray152[2] = local827[local954];
										Static97.anIntArray152[3] = 3;
										Static97.anIntArray152[4] = local851[local954];
										Static97.anIntArray152[5] = local827[local954];
										local1118 = 6;
									} else if (local87[3 - local99 & 0x3] && local821[3] == local954) {
										Static97.anIntArray152[0] = local831[local954];
										Static97.anIntArray152[1] = 7;
										Static97.anIntArray152[2] = local827[local954];
										Static97.anIntArray152[3] = 7;
										Static97.anIntArray152[4] = local851[local954];
										local1118 = 6;
										Static97.anIntArray152[5] = local827[local954];
									} else {
										Static97.anIntArray152[0] = local831[local954];
										Static97.anIntArray152[1] = local851[local954];
										Static97.anIntArray152[2] = local827[local954];
										local1118 = 3;
									}
									for (local1302 = 0; local1302 < local1118; local1302++) {
										local1326 = Static97.anIntArray152[local1302];
										local1307 = local1326 - local99 * 2 & 0x7;
										local1322 = this.anIntArray109[local1326];
										local1381 = this.anIntArray110[local1326];
										@Pc(1883) int local1883;
										if (local99 == 1) {
											local1883 = 512 - local1322;
											local1375 = local1381;
										} else if (local99 == 2) {
											local1883 = 512 - local1381;
											local1375 = 512 - local1322;
										} else if (local99 == 3) {
											local1375 = 512 - local1381;
											local1883 = local1322;
										} else {
											local1375 = local1322;
											local1883 = local1381;
										}
										local970[local956] = local1375;
										local973[local956] = local1883;
										@Pc(1942) int local1942;
										@Pc(1948) int local1948;
										if (local989 != null && Static188.aBooleanArrayArray6[local93][local1326]) {
											local1942 = (local33 << 9) + local1375;
											local1948 = local1883 + (local49 << 9);
											local989[local956] = arg0.method7680(local1942, local1948) - arg3.method7680(local1942, local1948);
										}
										if (local998 != null) {
											if (arg0 != null && !Static188.aBooleanArrayArray6[local93][local1326]) {
												local1942 = local1375 + (local33 << 9);
												local1948 = (local49 << 9) + local1883;
												local998[local956] = arg3.method7680(local1942, local1948) - arg0.method7680(local1942, local1948);
											} else if (arg4 != null && !Static100.aBooleanArrayArray3[local93][local1326]) {
												local1942 = (local33 << 9) + local1375;
												local1948 = (local49 << 9) + local1883;
												local998[local956] = arg4.method7680(local1942, local1948) - arg3.method7680(local1942, local1948);
											}
										}
										if (local1326 < 8 && Static431.anIntArray473[local1307] >= 0) {
											if (local967 != null) {
												local967[local956] = Static571.anIntArray605[local1307];
											}
											local982[local956] = Static417.anIntArray580[local1307];
											local979[local956] = Static101.anIntArray156[local1307];
											local976[local956] = Static512.anIntArray550[local1307];
										} else {
											if (local84 && Static188.aBooleanArrayArray6[local93][local1326]) {
												local979[local956] = local1002;
												local982[local956] = local1004;
												local976[local956] = local1000;
											} else if (local1375 == 0 && local1883 == 0) {
												local976[local956] = arg5[local33][local49];
												local979[local956] = local1600.anInt6885;
												local982[local956] = local1600.anInt6886;
											} else if (local1375 == 0 && local1883 == 512) {
												local976[local956] = arg5[local33][local67];
												local979[local956] = local1608.anInt6885;
												local982[local956] = local1608.anInt6886;
											} else if (local1375 == 512 && local1883 == 512) {
												local976[local956] = arg5[local47][local67];
												local979[local956] = local1616.anInt6885;
												local982[local956] = local1616.anInt6886;
											} else if (local1375 == 512 && local1883 == 0) {
												local976[local956] = arg5[local47][local49];
												local979[local956] = local1624.anInt6885;
												local982[local956] = local1624.anInt6886;
											} else {
												if (local1375 < 256) {
													if (local1883 >= 256) {
														local979[local956] = local1608.anInt6885;
														local982[local956] = local1608.anInt6886;
													} else {
														local979[local956] = local1600.anInt6885;
														local982[local956] = local1600.anInt6886;
													}
												} else if (local1883 >= 256) {
													local979[local956] = local1616.anInt6885;
													local982[local956] = local1616.anInt6886;
												} else {
													local979[local956] = local1624.anInt6885;
													local982[local956] = local1624.anInt6886;
												}
												local1942 = Static369.method7666(arg5[local47][local49], arg5[local33][local49], local1375 << 7 >> 9);
												local1948 = Static369.method7666(arg5[local47][local67], arg5[local33][local67], local1375 << 7 >> 9);
												local976[local956] = Static369.method7666(local1948, local1942, local1883 << 7 >> 9);
											}
											if (local967 != null) {
												local967[local956] = local976[local956];
											}
										}
										local956++;
									}
									local954++;
								}
								if (local93 != 0 && local173.aBoolean562) {
									local82 = true;
								}
							}
							local1048 = arg3.method7676(local49, local33);
							local1050 = arg3.method7676(local49, local47);
							local1282 = arg3.method7676(local67, local47);
							local1288 = arg3.method7676(local67, local33);
							@Pc(2372) boolean local2372 = Static562.method7350(local33, local49);
							if (local2372 && arg2 > 1 || !local2372 && arg2 > 0) {
								@Pc(2383) boolean local2383 = true;
								if (local173 != null && !local173.aBoolean561) {
									local2383 = false;
								} else if (local115 == 0 && local93 != 0) {
									local2383 = false;
								} else if (local107 > 0 && local184 != null && !local184.aBoolean316) {
									local2383 = false;
								}
								if (local2383 && local1048 == local1050 && local1282 == local1048 && local1288 == local1048) {
									this.aByteArrayArrayArray9[arg2][local33][local49] = (byte) (this.aByteArrayArrayArray9[arg2][local33][local49] | 0x4);
								}
							}
							local1302 = 0;
							local1326 = 0;
							local1307 = 0;
							if (this.aBoolean61) {
								local1302 = Static376.method5249(local33, local49);
								local1326 = Static64.method1092(local33, local49);
								local1307 = Static543.method7103(local33, local49);
							}
							arg3.O(local33, local49, local970, local989, local973, local998, local976, local967, local979, local982, local1302, local1326, local1307, local82);
							Static412.method5553(arg2, local33, local49);
						}
					}
				}
			}
		}
	}
}
