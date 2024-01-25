import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public class Class193 {

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "[I")
	private final int[] anIntArray464 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "[I")
	private final int[] anIntArray465 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
	public final int anInt4861;

	@OriginalMember(owner = "client!mt", name = "q", descriptor = "Lclient!um;")
	private final Class318 aClass318_3;

	@OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
	protected final int anInt4865;

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "Z")
	public final boolean aBoolean293;

	@OriginalMember(owner = "client!mt", name = "u", descriptor = "Lclient!vb;")
	private final Class327 aClass327_2;

	@OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
	protected final int anInt4863;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(IIIZLclient!vb;Lclient!um;)V")
	protected Class193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class327 arg4, @OriginalArg(5) Class318 arg5) {
		this.anInt4861 = arg0;
		this.aClass318_3 = arg5;
		this.anInt4865 = arg2;
		this.aBoolean293 = arg3;
		this.aClass327_2 = arg4;
		this.anInt4863 = arg1;
		this.aByteArrayArrayArray10 = new byte[this.anInt4861][this.anInt4863][this.anInt4865];
		this.aByteArrayArrayArray9 = new byte[this.anInt4861][this.anInt4863][this.anInt4865];
		this.aByteArrayArrayArray7 = new byte[this.anInt4861][this.anInt4863][this.anInt4865];
		this.anIntArrayArrayArray17 = new int[this.anInt4861][this.anInt4863 + 1][this.anInt4865 + 1];
		this.aByteArrayArrayArray8 = new byte[this.anInt4861][this.anInt4863][this.anInt4865];
		this.aByteArrayArrayArray12 = new byte[this.anInt4861][this.anInt4863 + 1][this.anInt4865 + 1];
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IILclient!dga;IIIIIIZI)V")
	private void method4170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (arg7 == 1) {
			arg3 = 1;
		} else if (arg7 == 2) {
			arg3 = 1;
			arg9 = 1;
		} else if (arg7 == 3) {
			arg9 = 1;
		}
		@Pc(49) int local49;
		if (arg4 < 0 || arg4 >= this.anInt4863 || arg1 < 0 || arg1 >= this.anInt4865) {
			while (true) {
				local49 = arg2.method6041();
				if (local49 == 0) {
					return;
				}
				if (local49 == 1) {
					arg2.method6041();
					return;
				}
				if (local49 <= 49) {
					arg2.method6041();
				}
			}
			return;
		}
		if (!this.aBoolean293 && !arg8) {
			Static303.aByteArrayArrayArray13[arg0][arg4][arg1] = 0;
		}
		while (true) {
			local49 = arg2.method6041();
			if (local49 == 0) {
				if (this.aBoolean293) {
					this.anIntArrayArrayArray17[0][arg9 + arg4][arg1 + arg3] = 0;
					return;
				} else if (arg0 == 0) {
					this.anIntArrayArrayArray17[0][arg9 + arg4][arg3 + arg1] = -Static468.method6546(arg5 + 556238, arg6 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray17[arg0][arg4 + arg9][arg3 + arg1] = this.anIntArrayArrayArray17[arg0 - 1][arg9 + arg4][arg3 + arg1] - 960;
					return;
				}
			}
			if (local49 == 1) {
				@Pc(183) int local183 = arg2.method6041();
				if (!this.aBoolean293) {
					if (local183 == 1) {
						local183 = 0;
					}
					if (arg0 != 0) {
						this.anIntArrayArrayArray17[arg0][arg9 + arg4][arg1 + arg3] = this.anIntArrayArrayArray17[arg0 - 1][arg9 + arg4][arg1 + arg3] - (local183 * 8 << 2);
						return;
					}
					this.anIntArrayArrayArray17[0][arg9 + arg4][arg1 + arg3] = -local183 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray17[0][arg9 + arg4][arg1 + arg3] = local183 * 8 << 2;
				return;
			}
			if (local49 <= 49) {
				if (arg8) {
					arg2.method6041();
				} else {
					this.aByteArrayArrayArray10[arg0][arg4][arg1] = arg2.method6034();
					this.aByteArrayArrayArray7[arg0][arg4][arg1] = (byte) ((local49 - 2) / 4);
					this.aByteArrayArrayArray9[arg0][arg4][arg1] = (byte) (arg7 + local49 - 2 & 0x3);
				}
			} else if (local49 <= 81) {
				if (!this.aBoolean293 && !arg8) {
					Static303.aByteArrayArrayArray13[arg0][arg4][arg1] = (byte) (local49 - 49);
				}
			} else if (!arg8) {
				this.aByteArrayArrayArray8[arg0][arg4][arg1] = (byte) (local49 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!dga;IIII[Lclient!sl;I)V")
	public final void method4171(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class295[] arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(33) int local33;
		if (!this.aBoolean293) {
			for (local14 = 0; local14 < 4; local14++) {
				@Pc(20) Class295 local20 = arg4[local14];
				for (local22 = 0; local22 < 64; local22++) {
					for (local26 = 0; local26 < 64; local26++) {
						local33 = arg3 + local22;
						@Pc(37) int local37 = arg1 + local26;
						if (local33 >= 0 && local33 < this.anInt4863 && local37 >= 0 && local37 < this.anInt4865) {
							local20.method6557(local37, local33);
						}
					}
				}
			}
		}
		local14 = arg5 + arg3;
		@Pc(90) int local90 = arg2 + arg1;
		for (local22 = 0; local22 < this.anInt4861; local22++) {
			for (local26 = 0; local26 < 64; local26++) {
				for (local33 = 0; local33 < 64; local33++) {
					this.method4170(local22, local33 + arg1, arg0, 0, arg3 + local26, local90 + local33, local14 + local26, 0, false, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[Z[[BI[[BLclient!ss;ILclient!eba;Lclient!oa;IIIB[[B)V")
	private void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) Class298 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class79 arg7, @OriginalArg(8) Class121 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(18) boolean[] local18 = arg5 != null && arg5.aBoolean549 ? Static446.aBooleanArrayArray7[arg3] : Static192.aBooleanArrayArray4[arg3];
		@Pc(37) int local37;
		@Pc(52) Class298 local52;
		@Pc(70) byte local70;
		@Pc(86) int local86;
		@Pc(91) int local91;
		if (arg0 > 0) {
			if (arg9 > 0) {
				local37 = arg4[arg9 - 1][arg0 - 1] & 0xFF;
				if (local37 > 0) {
					local52 = this.aClass327_2.method7411(local37 - 1);
					if (local52.anInt8014 != -1 && local52.aBoolean549) {
						local70 = arg12[arg9 - 1][arg0 - 1];
						local86 = arg2[arg9 - 1][arg0 - 1] * 2 + 4 & 0x7;
						local91 = Static208.method3108(arg8, local52);
						if (Static44.aBooleanArrayArray2[local70][local86]) {
							Static264.anIntArray437[0] = local52.anInt8014;
							Static445.anIntArray615[0] = local91;
							Static106.anIntArray271[0] = arg8.method7142() ? local52.anInt8016 : local52.anInt8017;
							Static499.anIntArray646[0] = local52.anInt8021;
							Static345.anIntArray530[0] = local52.anInt8011;
							Static342.anIntArray686[0] = 256;
						}
					}
				}
			}
			if (arg6 - 1 > arg9) {
				local37 = arg4[arg9 + 1][arg0 - 1] & 0xFF;
				if (local37 > 0) {
					local52 = this.aClass327_2.method7411(local37 - 1);
					if (local52.anInt8014 != -1 && local52.aBoolean549) {
						local70 = arg12[arg9 + 1][arg0 - 1];
						local86 = arg2[arg9 + 1][arg0 - 1] * 2 + 6 & 0x7;
						local91 = Static208.method3108(arg8, local52);
						if (Static44.aBooleanArrayArray2[local70][local86]) {
							Static264.anIntArray437[2] = local52.anInt8014;
							Static445.anIntArray615[2] = local91;
							Static106.anIntArray271[2] = arg8.method7142() ? local52.anInt8016 : local52.anInt8017;
							Static499.anIntArray646[2] = local52.anInt8021;
							Static345.anIntArray530[2] = local52.anInt8011;
							Static342.anIntArray686[2] = 512;
						}
					}
				}
			}
		}
		if (arg0 < arg10 - 1) {
			if (arg9 > 0) {
				local37 = arg4[arg9 - 1][arg0 + 1] & 0xFF;
				if (local37 > 0) {
					local52 = this.aClass327_2.method7411(local37 - 1);
					if (local52.anInt8014 != -1 && local52.aBoolean549) {
						local70 = arg12[arg9 - 1][arg0 + 1];
						local86 = arg2[arg9 - 1][arg0 + 1] * 2 + 2 & 0x7;
						local91 = Static208.method3108(arg8, local52);
						if (Static44.aBooleanArrayArray2[local70][local86]) {
							Static264.anIntArray437[6] = local52.anInt8014;
							Static445.anIntArray615[6] = local91;
							Static106.anIntArray271[6] = arg8.method7142() ? local52.anInt8016 : local52.anInt8017;
							Static499.anIntArray646[6] = local52.anInt8021;
							Static345.anIntArray530[6] = local52.anInt8011;
							Static342.anIntArray686[6] = 64;
						}
					}
				}
			}
			if (arg6 - 1 > arg9) {
				local37 = arg4[arg9 + 1][arg0 + 1] & 0xFF;
				if (local37 > 0) {
					local52 = this.aClass327_2.method7411(local37 - 1);
					if (local52.anInt8014 != -1 && local52.aBoolean549) {
						local70 = arg12[arg9 + 1][arg0 + 1];
						local86 = arg2[arg9 + 1][arg0 + 1] * 2 & 0x7;
						local91 = Static208.method3108(arg8, local52);
						if (Static44.aBooleanArrayArray2[local70][local86]) {
							Static264.anIntArray437[4] = local52.anInt8014;
							Static445.anIntArray615[4] = local91;
							Static106.anIntArray271[4] = arg8.method7142() ? local52.anInt8016 : local52.anInt8017;
							Static499.anIntArray646[4] = local52.anInt8021;
							Static345.anIntArray530[4] = local52.anInt8011;
							Static342.anIntArray686[4] = 128;
						}
					}
				}
			}
		}
		@Pc(532) int local532;
		@Pc(537) int local537;
		@Pc(539) int local539;
		@Pc(500) byte local500;
		if (arg0 > 0) {
			local37 = arg4[arg9][arg0 - 1] & 0xFF;
			if (local37 > 0) {
				local52 = this.aClass327_2.method7411(local37 - 1);
				if (local52.anInt8014 != -1) {
					local70 = arg12[arg9][arg0 - 1];
					local500 = arg2[arg9][arg0 - 1];
					if (local52.aBoolean549) {
						local91 = 2;
						local532 = local500 * 2 + 4;
						local537 = Static208.method3108(arg8, local52);
						for (local539 = 0; local539 < 3; local539++) {
							local91 &= 0x7;
							local532 &= 0x7;
							if (Static44.aBooleanArrayArray2[local70][local532] && Static345.anIntArray530[local91] <= local52.anInt8011) {
								Static264.anIntArray437[local91] = local52.anInt8014;
								Static445.anIntArray615[local91] = local537;
								Static106.anIntArray271[local91] = arg8.method7142() ? local52.anInt8016 : local52.anInt8017;
								Static499.anIntArray646[local91] = local52.anInt8021;
								if (Static345.anIntArray530[local91] == local52.anInt8011) {
									Static342.anIntArray686[local91] |= 0x20;
								} else {
									Static342.anIntArray686[local91] = 32;
								}
								Static345.anIntArray530[local91] = local52.anInt8011;
							}
							local91--;
							local532++;
						}
						if (!local18[arg11 & 0x3]) {
							arg1[0] = Static446.aBooleanArrayArray7[local70][local500 + 2 & 0x3];
						}
					} else if (!local18[arg11 & 0x3]) {
						arg1[0] = Static192.aBooleanArrayArray4[local70][local500 + 2 & 0x3];
					}
				}
			}
		}
		if (arg10 - 1 > arg0) {
			local37 = arg4[arg9][arg0 + 1] & 0xFF;
			if (local37 > 0) {
				local52 = this.aClass327_2.method7411(local37 - 1);
				if (local52.anInt8014 != -1) {
					local70 = arg12[arg9][arg0 + 1];
					local500 = arg2[arg9][arg0 + 1];
					if (local52.aBoolean549) {
						local91 = 4;
						local532 = local500 * 2 + 2;
						local537 = Static208.method3108(arg8, local52);
						for (local539 = 0; local539 < 3; local539++) {
							local91 &= 0x7;
							local532 &= 0x7;
							if (Static44.aBooleanArrayArray2[local70][local532] && local52.anInt8011 >= Static345.anIntArray530[local91]) {
								Static264.anIntArray437[local91] = local52.anInt8014;
								Static445.anIntArray615[local91] = local537;
								Static106.anIntArray271[local91] = arg8.method7142() ? local52.anInt8016 : local52.anInt8017;
								Static499.anIntArray646[local91] = local52.anInt8021;
								if (local52.anInt8011 == Static345.anIntArray530[local91]) {
									Static342.anIntArray686[local91] |= 0x10;
								} else {
									Static342.anIntArray686[local91] = 16;
								}
								Static345.anIntArray530[local91] = local52.anInt8011;
							}
							local91++;
							local532--;
						}
						if (!local18[arg11 + 2 & 0x3]) {
							arg1[2] = Static446.aBooleanArrayArray7[local70][local500 & 0x3];
						}
					} else if (!local18[arg11 + 2 & 0x3]) {
						arg1[2] = Static192.aBooleanArrayArray4[local70][local500 & 0x3];
					}
				}
			}
		}
		if (arg9 > 0) {
			local37 = arg4[arg9 - 1][arg0] & 0xFF;
			if (local37 > 0) {
				local52 = this.aClass327_2.method7411(local37 - 1);
				if (local52.anInt8014 != -1) {
					local70 = arg12[arg9 - 1][arg0];
					local500 = arg2[arg9 - 1][arg0];
					if (local52.aBoolean549) {
						local91 = 6;
						local532 = local500 * 2 + 4;
						local537 = Static208.method3108(arg8, local52);
						for (local539 = 0; local539 < 3; local539++) {
							local532 &= 0x7;
							local91 &= 0x7;
							if (Static44.aBooleanArrayArray2[local70][local532] && Static345.anIntArray530[local91] <= local52.anInt8011) {
								Static264.anIntArray437[local91] = local52.anInt8014;
								Static445.anIntArray615[local91] = local537;
								Static106.anIntArray271[local91] = arg8.method7142() ? local52.anInt8016 : local52.anInt8017;
								Static499.anIntArray646[local91] = local52.anInt8021;
								if (Static345.anIntArray530[local91] == local52.anInt8011) {
									Static342.anIntArray686[local91] |= 0x8;
								} else {
									Static342.anIntArray686[local91] = 8;
								}
								Static345.anIntArray530[local91] = local52.anInt8011;
							}
							local91++;
							local532--;
						}
						if (!local18[arg11 + 3 & 0x3]) {
							arg1[3] = Static446.aBooleanArrayArray7[local70][local500 + 1 & 0x3];
						}
					} else if (!local18[arg11 + 3 & 0x3]) {
						arg1[3] = Static192.aBooleanArrayArray4[local70][local500 + 1 & 0x3];
					}
				}
			}
		}
		if (arg6 - 1 > arg9) {
			local37 = arg4[arg9 + 1][arg0] & 0xFF;
			if (local37 > 0) {
				local52 = this.aClass327_2.method7411(local37 - 1);
				if (local52.anInt8014 != -1) {
					local70 = arg12[arg9 + 1][arg0];
					local500 = arg2[arg9 + 1][arg0];
					if (local52.aBoolean549) {
						local91 = 4;
						local532 = local500 * 2 + 6;
						local537 = Static208.method3108(arg8, local52);
						for (local539 = 0; local539 < 3; local539++) {
							local91 &= 0x7;
							local532 &= 0x7;
							if (Static44.aBooleanArrayArray2[local70][local532] && Static345.anIntArray530[local91] <= local52.anInt8011) {
								Static264.anIntArray437[local91] = local52.anInt8014;
								Static445.anIntArray615[local91] = local537;
								Static106.anIntArray271[local91] = arg8.method7142() ? local52.anInt8016 : local52.anInt8017;
								Static499.anIntArray646[local91] = local52.anInt8021;
								if (Static345.anIntArray530[local91] == local52.anInt8011) {
									Static342.anIntArray686[local91] |= 0x4;
								} else {
									Static342.anIntArray686[local91] = 4;
								}
								Static345.anIntArray530[local91] = local52.anInt8011;
							}
							local532++;
							local91--;
						}
						if (!local18[arg11 + 1 & 0x3]) {
							arg1[1] = Static446.aBooleanArrayArray7[local70][local500 + 3 & 0x3];
						}
					} else if (!local18[arg11 + 1 & 0x3]) {
						arg1[1] = Static192.aBooleanArrayArray4[local70][local500 + 3 & 0x3];
					}
				}
			}
		}
		if (arg5 == null) {
			return;
		}
		local37 = Static208.method3108(arg8, arg5);
		if (!arg5.aBoolean549) {
			return;
		}
		for (@Pc(1247) int local1247 = 0; local1247 < 8; local1247++) {
			@Pc(1257) int local1257 = local1247 - arg11 * 2 & 0x7;
			if (Static44.aBooleanArrayArray2[arg3][local1247] && Static345.anIntArray530[local1257] <= arg5.anInt8011) {
				Static264.anIntArray437[local1257] = arg5.anInt8014;
				Static445.anIntArray615[local1257] = local37;
				Static106.anIntArray271[local1257] = arg8.method7142() ? arg5.anInt8016 : arg5.anInt8017;
				Static499.anIntArray646[local1257] = arg5.anInt8021;
				if (arg5.anInt8011 == Static345.anIntArray530[local1257]) {
					Static342.anIntArray686[local1257] |= 0x2;
				} else {
					Static342.anIntArray686[local1257] = 2;
				}
				Static345.anIntArray530[local1257] = arg5.anInt8011;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!oa;IBLclient!d;Lclient!d;[[ILclient!d;)V")
	private void method4173(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class60 arg2, @OriginalArg(4) Class60 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class60 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4863; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt4865; local7++) {
				if (Static137.anInt2437 == -1 || Static355.method5298(arg1, local3, local7, Static137.anInt2437)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray7[arg1][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray9[arg1][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray10[arg1][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray8[arg1][local3][local7] & 0xFF;
					@Pc(77) Class298 local77 = local51 == 0 ? null : this.aClass327_2.method7411(local51 - 1);
					@Pc(92) Class79 local92 = local62 == 0 ? null : this.aClass318_3.method7322(local62 - 1);
					@Pc(94) int local94 = 0;
					@Pc(96) int local96 = 0;
					if (local31 != 0) {
						local96 = local77 == null ? 0 : Static322.anIntArray518[local31];
						local94 = local92 == null ? 0 : Static342.anIntArray687[local31];
					} else if (local77 != null) {
						local96 = Static322.anIntArray518[local31];
					} else if (local92 != null) {
						local94 = Static322.anIntArray518[local31];
					}
					@Pc(134) int local134 = local96 + local94;
					@Pc(136) int local136 = 0;
					if (local134 != 0) {
						@Pc(144) int[] local144 = new int[local134];
						@Pc(147) int[] local147 = new int[local134];
						@Pc(150) int[] local150 = new int[local134];
						@Pc(153) int[] local153 = new int[local134];
						@Pc(155) boolean local155 = false;
						@Pc(172) int local172;
						@Pc(200) int local200;
						if (local77 == null || local77.anInt8014 == -1 && local77.anInt8012 == -1 && local77.anInt8016 == -1) {
							for (local172 = 0; local172 < local96; local172++) {
								local144[local136] = -1;
								local136++;
							}
						} else {
							local172 = arg0.method7142() ? local77.anInt8016 : local77.anInt8017;
							if (Static390.aBoolean488) {
								local172 = -1;
							}
							for (local200 = 0; local200 < local96; local200++) {
								local150[local136] = local172;
								local153[local136] = local77.anInt8021;
								if (local77.anInt8014 == -1) {
									local144[local136] = -1;
								} else {
									local144[local136] = local77.anInt8014;
								}
								if (local77.anInt8012 == -1) {
									local147[local136] = -1;
								} else {
									local147[local136] = local77.anInt8012;
									local155 = true;
								}
								local136++;
							}
							if (!this.aBoolean293 && arg1 == 0) {
								Static195.method2935(local3, local7, local77.anInt8009, local77.anInt8013 * 8, local77.anInt8010);
							}
						}
						if (!local155) {
							local147 = null;
						}
						if (local92 == null) {
							for (local172 = 0; local172 < local94; local172++) {
								local144[local136] = -1;
								local136++;
							}
						} else {
							local172 = local92.anInt1877;
							if (Static390.aBoolean488) {
								local172 = -1;
							}
							for (local200 = 0; local200 < local94; local200++) {
								local150[local136] = local172;
								local153[local136] = local92.anInt1875;
								local144[local136] = arg4[local3][local7];
								if (local147 != null) {
									local147[local136] = -1;
								}
								local136++;
							}
						}
						local172 = this.anIntArray465.length;
						@Pc(347) int[] local347 = new int[local172];
						@Pc(350) int[] local350 = new int[local172];
						@Pc(357) int[] local357 = arg2 == null ? null : new int[local172];
						@Pc(366) int[] local366 = arg2 == null && arg3 == null ? null : new int[local172];
						@Pc(375) int local375;
						@Pc(380) int local380;
						@Pc(463) int local463;
						@Pc(469) int local469;
						for (@Pc(368) int local368 = 0; local368 < local172; local368++) {
							local375 = this.anIntArray465[local368];
							local380 = this.anIntArray464[local368];
							if (local40 == 0) {
								local347[local368] = local375;
								local350[local368] = local380;
							} else if (local40 == 1) {
								local347[local368] = local380;
								local350[local368] = 512 - local375;
							} else if (local40 == 2) {
								local347[local368] = 512 - local375;
								local350[local368] = 512 - local380;
							} else if (local40 == 3) {
								local347[local368] = 512 - local380;
								local350[local368] = local375;
							}
							if (local357 != null && Static44.aBooleanArrayArray2[local31][local368]) {
								local463 = local375 + (local3 << 9);
								local469 = local375 + (local7 << 9);
								local357[local368] = arg2.sa(local463, local469) - arg5.sa(local463, local469);
							}
							if (local366 != null) {
								if (arg2 != null && !Static44.aBooleanArrayArray2[local31][local368]) {
									local463 = local375 + (local3 << 9);
									local469 = (local7 << 9) + local375;
									local366[local368] = arg5.sa(local463, local469) - arg2.sa(local463, local469);
								} else if (arg3 != null && !Static404.aBooleanArrayArray6[local31][local368]) {
									local463 = (local3 << 9) + local375;
									local469 = local375 + (local7 << 9);
									local366[local368] = arg3.sa(local463, local469) - arg5.sa(local463, local469);
								}
							}
						}
						local375 = arg5.JA(local3, local7);
						local380 = arg5.JA(local3 + 1, local7);
						local463 = arg5.JA(local3 + 1, local7 - -1);
						local469 = arg5.JA(local3, local7 + 1);
						if (arg1 > 0) {
							@Pc(593) boolean local593 = true;
							if (local62 == 0 && local31 != 0) {
								local593 = false;
							}
							if (local51 > 0 && local77 != null && !local77.aBoolean546) {
								local593 = false;
							}
							if (local593 && local380 == local375 && local375 == local463 && local469 == local375) {
								this.aByteArrayArrayArray12[arg1][local3][local7] = (byte) (this.aByteArrayArrayArray12[arg1][local3][local7] | 0x4);
							}
						}
						@Pc(658) int local658 = 0;
						@Pc(660) int local660 = 0;
						@Pc(662) int local662 = 0;
						if (this.aBoolean293) {
							local658 = Static112.method1758(local3, local7);
							local660 = Static446.method6407(local3, local7);
							local662 = Static123.method1862(local3, local7);
						}
						arg5.method7889(local3, local7, local347, local357, local350, local366, Static413.anIntArrayArray75[local31], Static455.anIntArrayArray79[local31], Static572.anIntArrayArray86[local31], local144, local147, local150, local153, local658, local660, local662);
						Static521.method7338(arg1, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IILclient!dga;IIII[Lclient!sl;II)V")
	public final void method4174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class295[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(17) int local17 = (arg3 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean293) {
			@Pc(24) Class295 local24 = arg6[arg4];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = arg0 + Static468.method6554(local26 & 0x7, local30 & 0x7, arg5);
					local56 = Static131.method1965(arg5, local26 & 0x7, local30 & 0x7) + arg8;
					if (local44 > 0 && this.anInt4863 - 1 > local44 && local56 > 0 && this.anInt4865 - 1 > local56) {
						local24.method6557(local56, local44);
					}
				}
			}
		}
		@Pc(103) int local103 = (arg1 & 0x1FFFFFF8) << 3;
		local26 = (arg3 & 0xFFFFFFF8) << 3;
		@Pc(111) byte local111 = 0;
		@Pc(119) byte local119 = 0;
		if (arg5 == 1) {
			local119 = 1;
		} else if (arg5 == 2) {
			local119 = 1;
			local111 = 1;
		} else if (arg5 == 3) {
			local111 = 1;
		}
		for (local56 = 0; local56 < this.anInt4861; local56++) {
			for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
				for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
					if (local56 == arg7 && local148 >= local11 && local148 <= local11 + 8 && local152 >= local17 && local152 <= local17 + 8) {
						@Pc(224) int local224;
						@Pc(236) int local236;
						if (local148 == local11 + 8 || local17 + 8 == local152) {
							if (arg5 == 0) {
								local236 = local152 + arg8 - local17;
								local224 = local148 + arg0 - local11;
							} else if (arg5 == 1) {
								local224 = arg0 + local152 - local17;
								local236 = local11 + arg8 + 8 - local148;
							} else if (arg5 == 2) {
								local224 = arg0 + local11 + 8 - local148;
								local236 = local17 + arg8 + 8 - local152;
							} else {
								local224 = arg0 + local17 + 8 - local152;
								local236 = local148 + arg8 - local11;
							}
							this.method4170(arg4, local236, arg2, 0, local224, local152 + local26, local103 - -local148, 0, true, 0);
						} else {
							local224 = arg0 + Static468.method6554(local148 & 0x7, local152 & 0x7, arg5);
							local236 = Static131.method1965(arg5, local148 & 0x7, local152 & 0x7) + arg8;
							this.method4170(arg4, local236, arg2, local119, local224, local26 + local152, local148 + local103, arg5, false, local111);
						}
						if (local148 == 63 || local152 == 63) {
							@Pc(370) byte local370 = 1;
							if (local148 == 63 && local152 == 63) {
								local370 = 3;
							}
							for (@Pc(382) int local382 = 0; local382 < local370; local382++) {
								@Pc(386) int local386 = local148;
								@Pc(388) int local388 = local152;
								if (local382 == 0) {
									local386 = local148 == 63 ? 64 : local148;
									local388 = local152 == 63 ? 64 : local152;
								} else if (local382 == 1) {
									local386 = 64;
								} else if (local382 == 2) {
									local388 = 64;
								}
								@Pc(446) int local446;
								@Pc(440) int local440;
								if (arg5 == 0) {
									local440 = arg8 + local388 - local17;
									local446 = arg0 + local386 - local11;
								} else if (arg5 == 1) {
									local440 = local11 + arg8 + 8 - local386;
									local446 = arg0 + local388 - local17;
								} else if (arg5 == 2) {
									local446 = arg0 + local11 + 8 - local386;
									local440 = arg8 + local17 + 8 - local388;
								} else {
									local446 = arg0 + local17 + 8 - local388;
									local440 = arg8 + local386 - local11;
								}
								if (local446 >= 0 && local446 < this.anInt4863 && local440 >= 0 && this.anInt4865 > local440) {
									this.anIntArrayArrayArray17[arg4][local446][local440] = this.anIntArrayArrayArray17[arg4][local111 + local224][local119 + local236];
								}
							}
						}
					} else {
						this.method4170(0, -1, arg2, 0, -1, 0, 0, 0, false, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIII)V")
	public final void method4176(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4861; local7++) {
			this.method4179(local7, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[[II)V")
	public final void method4177(@OriginalArg(1) int[][] arg0) {
		@Pc(15) int[][] local15 = this.anIntArrayArrayArray17[0];
		for (@Pc(17) int local17 = 0; local17 < this.anInt4863 + 1; local17++) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt4865 + 1; local21++) {
				local15[local17][local21] += arg0[local17][local21];
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!d;[[IILclient!oa;Lclient!d;Lclient!d;)V")
	private void method4178(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) Class121 arg3, @OriginalArg(5) Class60 arg4, @OriginalArg(6) Class60 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray7[arg0];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray9[arg0];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray8[arg0];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray10[arg0];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4863; local38++) {
			@Pc(52) int local52 = this.anInt4863 - 1 <= local38 ? local38 : local38 + 1;
			for (@Pc(54) int local54 = 0; local54 < this.anInt4865; local54++) {
				@Pc(68) int local68 = this.anInt4865 - 1 <= local54 ? local54 : local54 + 1;
				if (Static137.anInt2437 == -1 || Static355.method5298(arg0, local38, local54, Static137.anInt2437)) {
					@Pc(82) boolean local82 = false;
					@Pc(84) boolean local84 = false;
					@Pc(87) boolean[] local87 = new boolean[4];
					@Pc(93) int local93 = local10[local38][local54];
					@Pc(99) int local99 = local15[local38][local54];
					@Pc(107) int local107 = local25[local38][local54] & 0xFF;
					@Pc(115) int local115 = local20[local38][local54] & 0xFF;
					@Pc(123) int local123 = local20[local38][local68] & 0xFF;
					@Pc(131) int local131 = local20[local52][local68] & 0xFF;
					@Pc(139) int local139 = local20[local52][local54] & 0xFF;
					if (local107 != 0 || local115 != 0) {
						@Pc(163) Class298 local163 = local107 == 0 ? null : this.aClass327_2.method7411(local107 - 1);
						if (local93 == 0 && local163 == null) {
							local93 = 12;
						}
						@Pc(187) Class79 local187 = local115 == 0 ? null : this.aClass318_3.method7322(local115 - 1);
						@Pc(189) Class298 local189 = local163;
						if (local163 != null) {
							if (local163.anInt8014 == -1 && local163.anInt8012 == -1) {
								local189 = local163;
								local163 = null;
							} else if (local187 != null && local93 != 0) {
								local84 = local163.aBoolean549;
							}
						}
						@Pc(300) int local300;
						@Pc(317) int local317;
						@Pc(386) int local386;
						@Pc(395) int local395;
						if ((local93 == 0 || local93 == 12) && local38 > 0 && local54 > 0 && this.anInt4863 > local38 && this.anInt4865 > local54) {
							@Pc(260) int local260 = local115 == local20[local52][local68] ? 1 : -1;
							@Pc(279) int local279 = local20[local52][local54 - 1] == local115 ? 1 : -1;
							local300 = local115 == local20[local38 - 1][local54 - 1] ? 1 : -1;
							local317 = local20[local38 - 1][local68] == local115 ? 1 : -1;
							if (local115 == local20[local38][local54 - 1]) {
								local279++;
								local300++;
							} else {
								local279--;
								local300--;
							}
							if (local20[local52][local54] == local115) {
								local260++;
								local279++;
							} else {
								local279--;
								local260--;
							}
							if (local20[local38][local68] == local115) {
								local317++;
								local260++;
							} else {
								local260--;
								local317--;
							}
							if (local20[local38 - 1][local54] == local115) {
								local300++;
								local317++;
							} else {
								local317--;
								local300--;
							}
							local386 = local300 - local260;
							if (local386 < 0) {
								local386 = -local386;
							}
							local395 = local279 - local317;
							if (local395 < 0) {
								local395 = -local395;
							}
							if (local386 == local395) {
								local386 = arg4.JA(local38, local54) - arg4.JA(local52, local68);
								local395 = arg4.JA(local52, local54) - arg4.JA(local38, local68);
								if (local386 < 0) {
									local386 = -local386;
								}
								if (local395 < 0) {
									local395 = -local395;
								}
							}
							local99 = local386 >= local395 ? 0 : 1;
						}
						for (local300 = 0; local300 < 13; local300++) {
							Static345.anIntArray530[local300] = -1;
							Static342.anIntArray686[local300] = 1;
						}
						@Pc(484) boolean[] local484 = local163 != null && local163.aBoolean549 ? Static446.aBooleanArrayArray7[local93] : Static192.aBooleanArrayArray4[local93];
						this.method4172(local54, local87, local15, local93, local25, local163, this.anInt4863, local187, arg3, local38, this.anInt4865, local99, local10);
						@Pc(513) boolean local513 = local163 != null && local163.anInt8014 != local163.anInt8012;
						if (!local513) {
							for (local317 = 0; local317 < 8; local317++) {
								if (Static345.anIntArray530[local317] >= 0 && Static264.anIntArray437[local317] != Static445.anIntArray615[local317]) {
									local513 = true;
									break;
								}
							}
						}
						if (!local484[local99 + 1 & 0x3]) {
							local87[1] = Static297.method4137(local87[1], (Static342.anIntArray686[2] & Static342.anIntArray686[4]) == 0);
						}
						if (!local484[local99 + 3 & 0x3]) {
							local87[3] = Static297.method4137(local87[3], (Static342.anIntArray686[6] & Static342.anIntArray686[0]) == 0);
						}
						if (!local484[--local99 & 0x3]) {
							local87[0] = Static297.method4137(local87[0], (Static342.anIntArray686[0] & Static342.anIntArray686[2]) == 0);
						}
						if (!local484[local99 + 2 & 0x3]) {
							local87[2] = Static297.method4137(local87[2], (Static342.anIntArray686[4] & Static342.anIntArray686[6]) == 0);
						}
						if (!local84 && (local93 == 0 || local93 == 12)) {
							if (local87[0] && !local87[1] && !local87[2] && local87[3]) {
								local99 = 0;
								local93 = local93 == 0 ? 13 : 14;
								local87[0] = local87[3] = false;
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
								local99 = 1;
								local87[2] = local87[3] = false;
							}
						}
						@Pc(821) boolean local821 = !local84 && !local87[0] && !local87[2] && !local87[1] && !local87[3];
						@Pc(823) int[] local823 = null;
						@Pc(859) int[] local859;
						@Pc(855) int[] local855;
						@Pc(847) int[] local847;
						if (local821) {
							local859 = Static413.anIntArrayArray75[local93];
							local386 = local187 == null ? 0 : Static342.anIntArray687[local93];
							local855 = Static455.anIntArrayArray79[local93];
							local847 = Static572.anIntArrayArray86[local93];
							local395 = local163 == null ? 0 : Static322.anIntArray518[local93];
						} else if (local84) {
							local855 = Static111.anIntArrayArray32[local93];
							local386 = local187 == null ? 0 : Static391.anIntArray308[local93];
							local859 = Static305.anIntArrayArray58[local93];
							local847 = Static315.anIntArrayArray66[local93];
							local395 = local163 == null ? 0 : Static30.anIntArray453[local93];
							local823 = Static123.anIntArrayArray34[local93];
						} else {
							local395 = local163 == null ? 0 : Static533.anIntArray684[local93];
							local386 = local187 == null ? 0 : Static393.anIntArray565[local93];
							local847 = Static404.anIntArrayArray72[local93];
							local823 = Static315.anIntArrayArray67[local93];
							local855 = Static264.anIntArrayArray53[local93];
							local859 = Static545.anIntArrayArray84[local93];
						}
						@Pc(925) int local925 = local386 + local395;
						if (local925 <= 0) {
							Static521.method7338(arg0, local38, local54);
						} else {
							if (local87[0]) {
								local925++;
							}
							if (local87[2]) {
								local925++;
							}
							if (local87[1]) {
								local925++;
							}
							if (local87[3]) {
								local925++;
							}
							@Pc(955) int local955 = 0;
							@Pc(957) int local957 = 0;
							@Pc(961) int local961 = local925 * 3;
							@Pc(968) int[] local968 = local513 ? new int[local961] : null;
							@Pc(971) int[] local971 = new int[local961];
							@Pc(974) int[] local974 = new int[local961];
							@Pc(977) int[] local977 = new int[local961];
							@Pc(980) int[] local980 = new int[local961];
							@Pc(983) int[] local983 = new int[local961];
							@Pc(990) int[] local990 = arg1 == null ? null : new int[local961];
							@Pc(999) int[] local999 = arg1 == null && arg5 == null ? null : new int[local961];
							@Pc(1001) int local1001 = -1;
							@Pc(1003) int local1003 = -1;
							@Pc(1005) int local1005 = 256;
							@Pc(1132) byte local1132;
							@Pc(1055) int local1055;
							@Pc(1057) int local1057;
							@Pc(1284) int local1284;
							@Pc(1290) int local1290;
							@Pc(1299) int local1299;
							@Pc(1304) int local1304;
							@Pc(1321) int local1321;
							@Pc(1309) int local1309;
							@Pc(1319) int local1319;
							@Pc(1380) int local1380;
							@Pc(1386) int local1386;
							if (local163 != null) {
								local1001 = local163.anInt8014;
								local1003 = arg3.method7142() ? local163.anInt8016 : local163.anInt8017;
								local1005 = local163.anInt8021;
								local1055 = Static208.method3108(arg3, local163);
								for (local1057 = 0; local1057 < local395; local1057++) {
									if (local87[-local99 & 0x3] && local823[0] == local955) {
										Static231.anIntArray417[0] = local859[local955];
										Static231.anIntArray417[1] = 1;
										Static231.anIntArray417[2] = local847[local955];
										Static231.anIntArray417[3] = 1;
										Static231.anIntArray417[4] = local855[local955];
										Static231.anIntArray417[5] = local847[local955];
										local1132 = 6;
									} else if (local87[2 - local99 & 0x3] && local955 == local823[2]) {
										Static231.anIntArray417[0] = local859[local955];
										Static231.anIntArray417[1] = 5;
										Static231.anIntArray417[2] = local847[local955];
										Static231.anIntArray417[3] = 5;
										Static231.anIntArray417[4] = local855[local955];
										local1132 = 6;
										Static231.anIntArray417[5] = local847[local955];
									} else if (local87[1 - local99 & 0x3] && local955 == local823[1]) {
										Static231.anIntArray417[0] = local859[local955];
										Static231.anIntArray417[1] = 3;
										Static231.anIntArray417[2] = local847[local955];
										Static231.anIntArray417[3] = 3;
										Static231.anIntArray417[4] = local855[local955];
										Static231.anIntArray417[5] = local847[local955];
										local1132 = 6;
									} else if (local87[3 - local99 & 0x3] && local955 == local823[3]) {
										Static231.anIntArray417[0] = local859[local955];
										Static231.anIntArray417[1] = 7;
										Static231.anIntArray417[2] = local847[local955];
										Static231.anIntArray417[3] = 7;
										Static231.anIntArray417[4] = local855[local955];
										local1132 = 6;
										Static231.anIntArray417[5] = local847[local955];
									} else {
										Static231.anIntArray417[0] = local859[local955];
										Static231.anIntArray417[1] = local855[local955];
										local1132 = 3;
										Static231.anIntArray417[2] = local847[local955];
									}
									for (local1284 = 0; local1284 < local1132; local1284++) {
										local1290 = Static231.anIntArray417[local1284];
										local1299 = local1290 - local99 * 2 & 0x7;
										local1304 = this.anIntArray465[local1290];
										local1309 = this.anIntArray464[local1290];
										if (local99 == 1) {
											local1319 = 512 - local1304;
											local1321 = local1309;
										} else if (local99 == 2) {
											local1319 = 512 - local1309;
											local1321 = 512 - local1304;
										} else if (local99 == 3) {
											local1319 = local1304;
											local1321 = 512 - local1309;
										} else {
											local1319 = local1309;
											local1321 = local1304;
										}
										local971[local957] = local1321;
										local974[local957] = local1319;
										if (local990 != null && Static44.aBooleanArrayArray2[local93][local1290]) {
											local1380 = local1321 + (local38 << 9);
											local1386 = (local54 << 9) + local1319;
											local990[local957] = arg1.sa(local1380, local1386) - arg4.sa(local1380, local1386);
										}
										if (local999 != null) {
											if (arg1 != null && !Static44.aBooleanArrayArray2[local93][local1290]) {
												local1380 = (local38 << 9) + local1321;
												local1386 = local1319 + (local54 << 9);
												local999[local957] = arg4.sa(local1380, local1386) - arg1.sa(local1380, local1386);
											} else if (arg5 != null && !Static404.aBooleanArrayArray6[local93][local1290]) {
												local1380 = (local38 << 9) + local1321;
												local1386 = local1319 + (local54 << 9);
												local999[local957] = arg5.sa(local1380, local1386) - arg4.sa(local1380, local1386);
											}
										}
										if (local1290 < 8 && local163.anInt8011 < Static345.anIntArray530[local1299]) {
											if (local968 != null) {
												local968[local957] = Static445.anIntArray615[local1299];
											}
											local983[local957] = Static499.anIntArray646[local1299];
											local980[local957] = Static106.anIntArray271[local1299];
											local977[local957] = Static264.anIntArray437[local1299];
										} else {
											if (local968 != null) {
												local968[local957] = local1055;
											}
											local980[local957] = arg3.method7142() ? local163.anInt8016 : local163.anInt8017;
											local983[local957] = local163.anInt8021;
											local977[local957] = local1001;
										}
										local957++;
									}
									local955++;
								}
								if (!this.aBoolean293 && arg0 == 0) {
									Static195.method2935(local38, local54, local163.anInt8009, local163.anInt8013 * 8, local163.anInt8010);
								}
								if (local93 != 12 && local163.anInt8014 != -1 && local163.aBoolean547) {
									local82 = true;
								}
							} else if (local821) {
								local955 = Static322.anIntArray518[local93];
							} else if (local84) {
								local955 = Static30.anIntArray453[local93];
							} else {
								local955 = Static533.anIntArray684[local93];
							}
							if (local187 != null) {
								if (local131 == 0) {
									local131 = local115;
								}
								if (local139 == 0) {
									local139 = local115;
								}
								if (local123 == 0) {
									local123 = local115;
								}
								@Pc(1606) Class79 local1606 = this.aClass318_3.method7322(local115 - 1);
								@Pc(1614) Class79 local1614 = this.aClass318_3.method7322(local123 - 1);
								@Pc(1622) Class79 local1622 = this.aClass318_3.method7322(local131 - 1);
								@Pc(1632) Class79 local1632 = this.aClass318_3.method7322(local139 - 1);
								for (local1299 = 0; local1299 < local386; local1299++) {
									if (local87[-local99 & 0x3] && local955 == local823[0]) {
										Static231.anIntArray417[0] = local859[local955];
										Static231.anIntArray417[1] = 1;
										Static231.anIntArray417[2] = local847[local955];
										Static231.anIntArray417[3] = 1;
										Static231.anIntArray417[4] = local855[local955];
										Static231.anIntArray417[5] = local847[local955];
										local1132 = 6;
									} else if (local87[2 - local99 & 0x3] && local955 == local823[2]) {
										Static231.anIntArray417[0] = local859[local955];
										Static231.anIntArray417[1] = 5;
										Static231.anIntArray417[2] = local847[local955];
										Static231.anIntArray417[3] = 5;
										Static231.anIntArray417[4] = local855[local955];
										local1132 = 6;
										Static231.anIntArray417[5] = local847[local955];
									} else if (local87[1 - local99 & 0x3] && local955 == local823[1]) {
										Static231.anIntArray417[0] = local859[local955];
										Static231.anIntArray417[1] = 3;
										Static231.anIntArray417[2] = local847[local955];
										Static231.anIntArray417[3] = 3;
										Static231.anIntArray417[4] = local855[local955];
										Static231.anIntArray417[5] = local847[local955];
										local1132 = 6;
									} else if (local87[3 - local99 & 0x3] && local823[3] == local955) {
										Static231.anIntArray417[0] = local859[local955];
										Static231.anIntArray417[1] = 7;
										Static231.anIntArray417[2] = local847[local955];
										Static231.anIntArray417[3] = 7;
										Static231.anIntArray417[4] = local855[local955];
										Static231.anIntArray417[5] = local847[local955];
										local1132 = 6;
									} else {
										Static231.anIntArray417[0] = local859[local955];
										Static231.anIntArray417[1] = local855[local955];
										Static231.anIntArray417[2] = local847[local955];
										local1132 = 3;
									}
									for (local1304 = 0; local1304 < local1132; local1304++) {
										local1321 = Static231.anIntArray417[local1304];
										local1309 = local1321 - local99 * 2 & 0x7;
										local1319 = this.anIntArray465[local1321];
										local1386 = this.anIntArray464[local1321];
										@Pc(1897) int local1897;
										if (local99 == 1) {
											local1380 = local1386;
											local1897 = 512 - local1319;
										} else if (local99 == 2) {
											local1897 = 512 - local1386;
											local1380 = 512 - local1319;
										} else if (local99 == 3) {
											local1380 = 512 - local1386;
											local1897 = local1319;
										} else {
											local1380 = local1319;
											local1897 = local1386;
										}
										local971[local957] = local1380;
										local974[local957] = local1897;
										@Pc(1952) int local1952;
										@Pc(1958) int local1958;
										if (local990 != null && Static44.aBooleanArrayArray2[local93][local1321]) {
											local1952 = (local38 << 9) + local1380;
											local1958 = local1897 + (local54 << 9);
											local990[local957] = arg1.sa(local1952, local1958) - arg4.sa(local1952, local1958);
										}
										if (local999 != null) {
											if (arg1 != null && !Static44.aBooleanArrayArray2[local93][local1321]) {
												local1952 = (local38 << 9) + local1380;
												local1958 = (local54 << 9) + local1897;
												local999[local957] = arg4.sa(local1952, local1958) - arg1.sa(local1952, local1958);
											} else if (arg5 != null && !Static404.aBooleanArrayArray6[local93][local1321]) {
												local1952 = (local38 << 9) + local1380;
												local1958 = local1897 + (local54 << 9);
												local999[local957] = arg5.sa(local1952, local1958) - arg4.sa(local1952, local1958);
											}
										}
										if (local1321 < 8 && Static345.anIntArray530[local1309] >= 0) {
											if (local968 != null) {
												local968[local957] = Static445.anIntArray615[local1309];
											}
											local983[local957] = Static499.anIntArray646[local1309];
											local980[local957] = Static106.anIntArray271[local1309];
											local977[local957] = Static264.anIntArray437[local1309];
										} else {
											if (local84 && Static44.aBooleanArrayArray2[local93][local1321]) {
												local980[local957] = local1003;
												local983[local957] = local1005;
												local977[local957] = local1001;
											} else if (local1380 == 0 && local1897 == 0) {
												local977[local957] = arg2[local38][local54];
												local980[local957] = local1606.anInt1877;
												local983[local957] = local1606.anInt1875;
											} else if (local1380 == 0 && local1897 == 512) {
												local977[local957] = arg2[local38][local68];
												local980[local957] = local1614.anInt1877;
												local983[local957] = local1614.anInt1875;
											} else if (local1380 == 512 && local1897 == 512) {
												local977[local957] = arg2[local52][local68];
												local980[local957] = local1622.anInt1877;
												local983[local957] = local1622.anInt1875;
											} else if (local1380 == 512 && local1897 == 0) {
												local977[local957] = arg2[local52][local54];
												local980[local957] = local1632.anInt1877;
												local983[local957] = local1632.anInt1875;
											} else {
												if (local1380 >= 256) {
													if (local1897 >= 256) {
														local980[local957] = local1622.anInt1877;
														local983[local957] = local1622.anInt1875;
													} else {
														local980[local957] = local1632.anInt1877;
														local983[local957] = local1632.anInt1875;
													}
												} else if (local1897 >= 256) {
													local980[local957] = local1614.anInt1877;
													local983[local957] = local1614.anInt1875;
												} else {
													local980[local957] = local1606.anInt1877;
													local983[local957] = local1606.anInt1875;
												}
												local1952 = Static89.method1432(arg2[local52][local54], arg2[local38][local54], local1380 << 7 >> 9);
												local1958 = Static89.method1432(arg2[local52][local68], arg2[local38][local68], local1380 << 7 >> 9);
												local977[local957] = Static89.method1432(local1958, local1952, local1897 << 7 >> 9);
											}
											if (local968 != null) {
												local968[local957] = local977[local957];
											}
										}
										local957++;
									}
									local955++;
								}
								if (local93 != 0 && local187.aBoolean125) {
									local82 = true;
								}
							}
							local1055 = arg4.JA(local38, local54);
							local1057 = arg4.JA(local52, local54);
							local1284 = arg4.JA(local52, local68);
							local1290 = arg4.JA(local38, local68);
							if (arg0 > 0) {
								@Pc(2369) boolean local2369 = true;
								if (local115 == 0 && local93 != 0) {
									local2369 = false;
								}
								if (local107 > 0 && local189 != null && !local189.aBoolean546) {
									local2369 = false;
								}
								if (local2369 && local1057 == local1055 && local1284 == local1055 && local1290 == local1055) {
									this.aByteArrayArrayArray12[arg0][local38][local54] = (byte) (this.aByteArrayArrayArray12[arg0][local38][local54] | 0x4);
								}
							}
							local1299 = 0;
							local1304 = 0;
							local1321 = 0;
							if (this.aBoolean293) {
								local1299 = Static112.method1758(local38, local54);
								local1304 = Static446.method6407(local38, local54);
								local1321 = Static123.method1862(local38, local54);
							}
							arg4.BA(local38, local54, local971, local990, local974, local999, local977, local968, local980, local983, local1299, local1304, local1321, local82);
							Static521.method7338(arg0, local38, local54);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIZ)V")
	private void method4179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg1; local3 < arg1 + 64; local3++) {
			for (local7 = arg2; local7 < arg2 + 64; local7++) {
				if (local7 >= 0 && this.anInt4863 > local7 && local3 >= 0 && local3 < this.anInt4865) {
					this.anIntArrayArrayArray17[arg0][local7][local3] = arg0 <= 0 ? 0 : this.anIntArrayArrayArray17[arg0 - 1][local7][local3] - 960;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt4863) {
			for (local7 = arg1 + 1; local7 < arg1 + 64; local7++) {
				if (local7 >= 0 && this.anInt4865 > local7) {
					this.anIntArrayArrayArray17[arg0][arg2][local7] = this.anIntArrayArrayArray17[arg0][arg2 - 1][local7];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt4865) {
			for (local7 = arg2 + 1; local7 < arg2 + 64; local7++) {
				if (local7 >= 0 && this.anInt4863 > local7) {
					this.anIntArrayArrayArray17[arg0][local7][arg1] = this.anIntArrayArrayArray17[arg0][local7][arg1 - 1];
				}
			}
		}
		if (arg2 < 0 || arg1 < 0 || this.anInt4863 <= arg2 || arg1 >= this.anInt4865) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray17[arg0][arg2 - 1][arg1] != 0) {
				this.anIntArrayArrayArray17[arg0][arg2][arg1] = this.anIntArrayArrayArray17[arg0][arg2 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray17[arg0][arg2][arg1 - 1] != 0) {
				this.anIntArrayArrayArray17[arg0][arg2][arg1] = this.anIntArrayArrayArray17[arg0][arg2][arg1 - 1];
				return;
			}
			if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray17[arg0][arg2 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray17[arg0][arg2][arg1] = this.anIntArrayArrayArray17[arg0][arg2 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray17[arg0 - 1][arg2 - 1][arg1] != this.anIntArrayArrayArray17[arg0][arg2 - 1][arg1]) {
			this.anIntArrayArrayArray17[arg0][arg2][arg1] = this.anIntArrayArrayArray17[arg0][arg2 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray17[arg0][arg2][arg1 - 1] != this.anIntArrayArrayArray17[arg0 - 1][arg2][arg1 - 1]) {
			this.anIntArrayArrayArray17[arg0][arg2][arg1] = this.anIntArrayArrayArray17[arg0][arg2][arg1 - 1];
			return;
		}
		if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray17[arg0 - 1][arg2 - 1][arg1 - 1] != this.anIntArrayArrayArray17[arg0][arg2 - 1][arg1 - 1]) {
			this.anIntArrayArrayArray17[arg0][arg2][arg1] = this.anIntArrayArrayArray17[arg0][arg2 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!d;BLclient!d;Lclient!oa;)V")
	public final void method4181(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class121 arg2) {
		if (Static273.anIntArray446 == null || Static273.anIntArray446.length != this.anInt4865) {
			Static273.anIntArray446 = new int[this.anInt4865];
			Static487.anIntArray633 = new int[this.anInt4865];
			Static163.anIntArray326 = new int[this.anInt4865];
			Static443.anIntArray614 = new int[this.anInt4865];
			Static13.anIntArray23 = new int[this.anInt4865];
		}
		@Pc(42) int[][] local42 = new int[this.anInt4863][this.anInt4865];
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt4861; local44++) {
			for (local48 = 0; local48 < this.anInt4865; local48++) {
				Static273.anIntArray446[local48] = 0;
				Static487.anIntArray633[local48] = 0;
				Static13.anIntArray23[local48] = 0;
				Static163.anIntArray326[local48] = 0;
				Static443.anIntArray614[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt4863; local81++) {
				@Pc(91) int local91;
				@Pc(110) int local110;
				@Pc(179) int local179;
				for (@Pc(85) int local85 = 0; local85 < this.anInt4865; local85++) {
					local91 = local81 + 5;
					@Pc(159) int local159;
					if (local91 < this.anInt4863) {
						local110 = this.aByteArrayArrayArray8[local44][local91][local85] & 0xFF;
						if (local110 > 0) {
							@Pc(123) Class79 local123 = this.aClass318_3.method7322(local110 - 1);
							Static273.anIntArray446[local85] += local123.anInt1882;
							Static487.anIntArray633[local85] += local123.anInt1887;
							Static13.anIntArray23[local85] += local123.anInt1884;
							Static163.anIntArray326[local85] += local123.anInt1885;
							local159 = Static443.anIntArray614[local85]++;
						}
					}
					local110 = local81 - 5;
					if (local110 >= 0) {
						local179 = this.aByteArrayArrayArray8[local44][local110][local85] & 0xFF;
						if (local179 > 0) {
							@Pc(194) Class79 local194 = this.aClass318_3.method7322(local179 - 1);
							Static273.anIntArray446[local85] -= local194.anInt1882;
							Static487.anIntArray633[local85] -= local194.anInt1887;
							Static13.anIntArray23[local85] -= local194.anInt1884;
							Static163.anIntArray326[local85] -= local194.anInt1885;
							local159 = Static443.anIntArray614[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local110 = 0;
					local179 = 0;
					@Pc(252) int local252 = 0;
					@Pc(254) int local254 = 0;
					for (@Pc(256) int local256 = -5; local256 < this.anInt4865; local256++) {
						@Pc(262) int local262 = local256 + 5;
						if (local262 < this.anInt4865) {
							local179 += Static13.anIntArray23[local262];
							local254 += Static443.anIntArray614[local262];
							local110 += Static487.anIntArray633[local262];
							local91 += Static273.anIntArray446[local262];
							local252 += Static163.anIntArray326[local262];
						}
						@Pc(300) int local300 = local256 - 5;
						if (local300 >= 0) {
							local179 -= Static13.anIntArray23[local300];
							local254 -= Static443.anIntArray614[local300];
							local110 -= Static487.anIntArray633[local300];
							local252 -= Static163.anIntArray326[local300];
							local91 -= Static273.anIntArray446[local300];
						}
						if (local256 >= 0 && local252 > 0 && local254 > 0) {
							local42[local81][local256] = Static134.method2002(local91 * 256 / local252, local110 / local254, local179 / local254);
						}
					}
				}
			}
			if (Static534.aBoolean639) {
				this.method4178(local44, local44 == 0 ? arg1 : null, local42, arg2, Static285.aClass60Array8[local44], local44 == 0 ? arg0 : null);
			} else {
				this.method4173(arg2, local44, local44 == 0 ? arg1 : null, local44 == 0 ? arg0 : null, local42, Static285.aClass60Array8[local44]);
			}
			this.aByteArrayArrayArray8[local44] = null;
			this.aByteArrayArrayArray10[local44] = null;
			this.aByteArrayArrayArray7[local44] = null;
			this.aByteArrayArrayArray9[local44] = null;
		}
		if (!this.aBoolean293) {
			if (Static397.anInt333 != 0) {
				Static418.method6130();
			}
			if (Static566.aBoolean664) {
				Static511.method7043();
			}
		}
		for (local48 = 0; local48 < this.anInt4861; local48++) {
			Static285.aClass60Array8[local48].ba();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "([[[IBLclient!oa;[Lclient!sl;)V")
	public final void method4182(@OriginalArg(0) int[][][] arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) Class295[] arg2) {
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(23) int local23;
		if (!this.aBoolean293) {
			for (local15 = 0; local15 < 4; local15++) {
				for (local19 = 0; local19 < this.anInt4863; local19++) {
					for (local23 = 0; local23 < this.anInt4865; local23++) {
						if ((Static303.aByteArrayArrayArray13[local15][local19][local23] & 0x1) != 0) {
							@Pc(40) int local40 = local15;
							if ((Static303.aByteArrayArrayArray13[1][local19][local23] & 0x2) != 0) {
								local40 = local15 - 1;
							}
							if (local40 >= 0) {
								arg2[local40].method6549(local23, local19);
							}
						}
					}
				}
			}
		}
		for (local15 = 0; local15 < this.anInt4861; local15++) {
			local19 = 0;
			local23 = 0;
			if (!this.aBoolean293) {
				if (Static566.aBoolean664) {
					local19 = 2;
				}
				if (Static339.aBoolean395) {
					local23 = 8;
				}
				if (Static397.anInt333 != 0) {
					local19 |= 0x1;
					if (Static244.aBoolean262 | local15 == 0) {
						local23 |= 0x10;
					}
				}
			}
			if (Static566.aBoolean664) {
				local23 |= 0x7;
			}
			if (!Static439.aBoolean525) {
				local23 |= 0x20;
			}
			@Pc(152) int[][] local152 = arg0 == null || local15 >= arg0.length ? this.anIntArrayArrayArray17[local15] : arg0[local15];
			Static359.method5333(local15, arg1.method7121(this.anInt4863, this.anInt4865, this.anIntArrayArrayArray17[local15], local152, local19, local23));
		}
	}
}
