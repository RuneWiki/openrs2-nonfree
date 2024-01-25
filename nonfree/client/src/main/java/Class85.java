import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public class Class85 {

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "[I")
	private final int[] anIntArray249 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "[I")
	private final int[] anIntArray250 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public final int anInt2678;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!ik;")
	private final Class162 aClass162_6;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "Z")
	public final boolean aBoolean215;

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
	protected final int anInt2684;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "Lclient!rg;")
	private final Class291 aClass291_2;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	protected final int anInt2672;

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIZLclient!rg;Lclient!ik;)V")
	protected Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class291 arg4, @OriginalArg(5) Class162 arg5) {
		this.anInt2678 = arg0;
		this.aClass162_6 = arg5;
		this.aBoolean215 = arg3;
		this.anInt2684 = arg2;
		this.aClass291_2 = arg4;
		this.anInt2672 = arg1;
		this.aByteArrayArrayArray15 = new byte[this.anInt2678][this.anInt2672][this.anInt2684];
		this.aByteArrayArrayArray14 = new byte[this.anInt2678][this.anInt2672 + 1][this.anInt2684 + 1];
		this.aByteArrayArrayArray11 = new byte[this.anInt2678][this.anInt2672][this.anInt2684];
		this.aByteArrayArrayArray12 = new byte[this.anInt2678][this.anInt2672][this.anInt2684];
		this.aByteArrayArrayArray13 = new byte[this.anInt2678][this.anInt2672][this.anInt2684];
		this.anIntArrayArrayArray12 = new int[this.anInt2678][this.anInt2672 + 1][this.anInt2684 + 1];
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!eh;II[Lclient!ed;IIIIII)V")
	public final void method2374(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class84[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(17) int local17 = (arg8 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean215) {
			@Pc(24) Class84 local24 = arg3[arg7];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static190.method3464(local26 & 0x7, arg2, local30 & 0x7) + arg5;
					local56 = Static591.method7951(local30 & 0x7, arg2, local26 & 0x7) + arg6;
					if (local44 > 0 && this.anInt2672 - 1 > local44 && local56 > 0 && this.anInt2684 - 1 > local56) {
						local24.method2355(local56, local44);
					}
				}
			}
		}
		@Pc(104) int local104 = (arg4 & 0x1FFFFFF8) << 3;
		local26 = (arg8 & 0x1FFFFFF8) << 3;
		@Pc(112) byte local112 = 0;
		@Pc(114) byte local114 = 0;
		if (arg2 == 1) {
			local114 = 1;
		} else if (arg2 == 2) {
			local114 = 1;
			local112 = 1;
		} else if (arg2 == 3) {
			local112 = 1;
		}
		for (local56 = 0; local56 < this.anInt2678; local56++) {
			for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
				for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
					if (local56 == arg1 && local11 <= local143 && local11 + 8 >= local143 && local147 >= local17 && local147 <= local17 + 8) {
						@Pc(203) int local203;
						@Pc(216) int local216;
						if (local11 + 8 == local143 || local17 + 8 == local147) {
							if (arg2 == 0) {
								local203 = local143 + arg5 - local11;
								local216 = arg6 + local147 - local17;
							} else if (arg2 == 1) {
								local203 = arg5 + local147 - local17;
								local216 = arg6 + local11 + 8 - local143;
							} else if (arg2 == 2) {
								local203 = arg5 + local11 + 8 - local143;
								local216 = arg6 + local17 + 8 - local147;
							} else {
								local203 = arg5 + local17 + 8 - local147;
								local216 = local143 + arg6 - local11;
							}
							this.method2382(0, local203, local104 + local143, arg7, local147 + local26, 0, true, local216, 0, arg0);
						} else {
							local203 = arg5 + Static190.method3464(local143 & 0x7, arg2, local147 & 0x7);
							local216 = arg6 + Static591.method7951(local147 & 0x7, arg2, local143 & 0x7);
							this.method2382(local114, local203, local104 + local143, arg7, local147 + local26, local112, false, local216, arg2, arg0);
						}
						if (local143 == 63 || local147 == 63) {
							@Pc(345) byte local345 = 1;
							if (local143 == 63 && local147 == 63) {
								local345 = 3;
							}
							for (@Pc(355) int local355 = 0; local355 < local345; local355++) {
								@Pc(359) int local359 = local143;
								@Pc(361) int local361 = local147;
								if (local355 == 0) {
									local359 = local143 == 63 ? 64 : local143;
									local361 = local147 == 63 ? 64 : local147;
								} else if (local355 == 1) {
									local359 = 64;
								} else if (local355 == 2) {
									local361 = 64;
								}
								@Pc(417) int local417;
								@Pc(425) int local425;
								if (arg2 == 0) {
									local417 = local359 + arg5 - local11;
									local425 = local361 + arg6 - local17;
								} else if (arg2 == 1) {
									local417 = arg5 + local361 - local17;
									local425 = arg6 + local11 + 8 - local359;
								} else if (arg2 == 2) {
									local417 = local11 + arg5 + 8 - local359;
									local425 = local17 + arg6 + 8 - local361;
								} else {
									local425 = arg6 + local359 - local11;
									local417 = arg5 + local17 + 8 - local361;
								}
								if (local417 >= 0 && local417 < this.anInt2672 && local425 >= 0 && local425 < this.anInt2684) {
									this.anIntArrayArrayArray12[arg7][local417][local425] = this.anIntArrayArrayArray12[arg7][local203 + local112][local114 + local216];
								}
							}
						}
					} else {
						this.method2382(0, -1, 0, 0, 0, 0, false, -1, 0, arg0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[[IZ)V")
	public final void method2375(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray12[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt2672 + 1; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt2684 + 1; local18++) {
				local10[local12][local18] += arg0[local12][local18];
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII)V")
	private void method2377(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg1; local3 < arg1 + 64; local3++) {
			for (local7 = arg0; local7 < arg0 + 64; local7++) {
				if (local7 >= 0 && this.anInt2672 > local7 && local3 >= 0 && this.anInt2684 > local3) {
					this.anIntArrayArrayArray12[arg2][local7][local3] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray12[arg2 - 1][local7][local3] - 960;
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt2672) {
			for (local7 = arg1 + 1; local7 < arg1 + 64; local7++) {
				if (local7 >= 0 && local7 < this.anInt2684) {
					this.anIntArrayArrayArray12[arg2][arg0][local7] = this.anIntArrayArrayArray12[arg2][arg0 - 1][local7];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt2684) {
			for (local7 = arg0 + 1; local7 < arg0 + 64; local7++) {
				if (local7 >= 0 && this.anInt2672 > local7) {
					this.anIntArrayArrayArray12[arg2][local7][arg1] = this.anIntArrayArrayArray12[arg2][local7][arg1 - 1];
				}
			}
		}
		if (arg0 < 0 || arg1 < 0 || this.anInt2672 <= arg0 || arg1 >= this.anInt2684) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1] != 0) {
				this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray12[arg2][arg0][arg1 - 1] != 0) {
				this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0][arg1 - 1];
				return;
			}
			if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray12[arg2 - 1][arg0 - 1][arg1] != this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1]) {
			this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray12[arg2 - 1][arg0][arg1 - 1] != this.anIntArrayArrayArray12[arg2][arg0][arg1 - 1]) {
			this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0][arg1 - 1];
			return;
		}
		if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1 - 1] != this.anIntArrayArrayArray12[arg2 - 1][arg0 - 1][arg1 - 1]) {
			this.anIntArrayArrayArray12[arg2][arg0][arg1] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!hr;IBIILclient!oa;[[B[ZLclient!kb;I[[B[[BI)V")
	private void method2379(@OriginalArg(0) int arg0, @OriginalArg(1) Class149 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class66 arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) Class187 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) int arg12) {
		@Pc(22) boolean[] local22 = arg8 != null && arg8.aBoolean381 ? Static291.aBooleanArrayArray4[arg0] : Static340.aBooleanArrayArray5[arg0];
		@Pc(41) int local41;
		@Pc(51) Class187 local51;
		@Pc(69) byte local69;
		@Pc(85) int local85;
		@Pc(90) int local90;
		if (arg9 > 0) {
			if (arg2 > 0) {
				local41 = arg10[arg2 - 1][arg9 - 1] & 0xFF;
				if (local41 > 0) {
					local51 = this.aClass291_2.method6442(local41 - 1);
					if (local51.anInt5088 != -1 && local51.aBoolean381) {
						local69 = arg11[arg2 - 1][arg9 - 1];
						local85 = arg6[arg2 - 1][arg9 - 1] * 2 + 4 & 0x7;
						local90 = Static493.method7056(local51, arg5);
						if (Static57.aBooleanArrayArray2[local69][local85]) {
							Static387.anIntArray711[0] = local51.anInt5088;
							Static234.anIntArray608[0] = local90;
							Static558.anIntArray703[0] = arg5.method6834() ? local51.anInt5090 : local51.anInt5087;
							Static333.anIntArray483[0] = local51.anInt5080;
							Static115.anIntArray251[0] = local51.anInt5089;
							Static49.anIntArray138[0] = 256;
						}
					}
				}
			}
			if (arg3 - 1 > arg2) {
				local41 = arg10[arg2 + 1][arg9 - 1] & 0xFF;
				if (local41 > 0) {
					local51 = this.aClass291_2.method6442(local41 - 1);
					if (local51.anInt5088 != -1 && local51.aBoolean381) {
						local69 = arg11[arg2 + 1][arg9 - 1];
						local85 = arg6[arg2 + 1][arg9 - 1] * 2 + 6 & 0x7;
						local90 = Static493.method7056(local51, arg5);
						if (Static57.aBooleanArrayArray2[local69][local85]) {
							Static387.anIntArray711[2] = local51.anInt5088;
							Static234.anIntArray608[2] = local90;
							Static558.anIntArray703[2] = arg5.method6834() ? local51.anInt5090 : local51.anInt5087;
							Static333.anIntArray483[2] = local51.anInt5080;
							Static115.anIntArray251[2] = local51.anInt5089;
							Static49.anIntArray138[2] = 512;
						}
					}
				}
			}
		}
		if (arg9 < arg12 - 1) {
			if (arg2 > 0) {
				local41 = arg10[arg2 - 1][arg9 + 1] & 0xFF;
				if (local41 > 0) {
					local51 = this.aClass291_2.method6442(local41 - 1);
					if (local51.anInt5088 != -1 && local51.aBoolean381) {
						local69 = arg11[arg2 - 1][arg9 + 1];
						local85 = arg6[arg2 - 1][arg9 + 1] * 2 + 2 & 0x7;
						local90 = Static493.method7056(local51, arg5);
						if (Static57.aBooleanArrayArray2[local69][local85]) {
							Static387.anIntArray711[6] = local51.anInt5088;
							Static234.anIntArray608[6] = local90;
							Static558.anIntArray703[6] = arg5.method6834() ? local51.anInt5090 : local51.anInt5087;
							Static333.anIntArray483[6] = local51.anInt5080;
							Static115.anIntArray251[6] = local51.anInt5089;
							Static49.anIntArray138[6] = 64;
						}
					}
				}
			}
			if (arg2 < arg3 - 1) {
				local41 = arg10[arg2 + 1][arg9 + 1] & 0xFF;
				if (local41 > 0) {
					local51 = this.aClass291_2.method6442(local41 - 1);
					if (local51.anInt5088 != -1 && local51.aBoolean381) {
						local69 = arg11[arg2 + 1][arg9 + 1];
						local85 = arg6[arg2 + 1][arg9 + 1] * 2 & 0x7;
						local90 = Static493.method7056(local51, arg5);
						if (Static57.aBooleanArrayArray2[local69][local85]) {
							Static387.anIntArray711[4] = local51.anInt5088;
							Static234.anIntArray608[4] = local90;
							Static558.anIntArray703[4] = arg5.method6834() ? local51.anInt5090 : local51.anInt5087;
							Static333.anIntArray483[4] = local51.anInt5080;
							Static115.anIntArray251[4] = local51.anInt5089;
							Static49.anIntArray138[4] = 128;
						}
					}
				}
			}
		}
		@Pc(517) int local517;
		@Pc(522) int local522;
		@Pc(524) int local524;
		@Pc(505) byte local505;
		if (arg9 > 0) {
			local41 = arg10[arg2][arg9 - 1] & 0xFF;
			if (local41 > 0) {
				local51 = this.aClass291_2.method6442(local41 - 1);
				if (local51.anInt5088 != -1) {
					local69 = arg11[arg2][arg9 - 1];
					local505 = arg6[arg2][arg9 - 1];
					if (local51.aBoolean381) {
						local90 = 2;
						local517 = local505 * 2 + 4;
						local522 = Static493.method7056(local51, arg5);
						for (local524 = 0; local524 < 3; local524++) {
							local517 &= 0x7;
							local90 &= 0x7;
							if (Static57.aBooleanArrayArray2[local69][local517] && local51.anInt5089 >= Static115.anIntArray251[local90]) {
								Static387.anIntArray711[local90] = local51.anInt5088;
								Static234.anIntArray608[local90] = local522;
								Static558.anIntArray703[local90] = arg5.method6834() ? local51.anInt5090 : local51.anInt5087;
								Static333.anIntArray483[local90] = local51.anInt5080;
								if (local51.anInt5089 == Static115.anIntArray251[local90]) {
									Static49.anIntArray138[local90] |= 0x20;
								} else {
									Static49.anIntArray138[local90] = 32;
								}
								Static115.anIntArray251[local90] = local51.anInt5089;
							}
							local90--;
							local517++;
						}
						if (!local22[arg4 & 0x3]) {
							arg7[0] = Static291.aBooleanArrayArray4[local69][local505 + 2 & 0x3];
						}
					} else if (!local22[arg4 & 0x3]) {
						arg7[0] = Static340.aBooleanArrayArray5[local69][local505 + 2 & 0x3];
					}
				}
			}
		}
		if (arg9 < arg12 - 1) {
			local41 = arg10[arg2][arg9 + 1] & 0xFF;
			if (local41 > 0) {
				local51 = this.aClass291_2.method6442(local41 - 1);
				if (local51.anInt5088 != -1) {
					local69 = arg11[arg2][arg9 + 1];
					local505 = arg6[arg2][arg9 + 1];
					if (local51.aBoolean381) {
						local90 = 4;
						local517 = local505 * 2 + 2;
						local522 = Static493.method7056(local51, arg5);
						for (local524 = 0; local524 < 3; local524++) {
							local90 &= 0x7;
							local517 &= 0x7;
							if (Static57.aBooleanArrayArray2[local69][local517] && local51.anInt5089 >= Static115.anIntArray251[local90]) {
								Static387.anIntArray711[local90] = local51.anInt5088;
								Static234.anIntArray608[local90] = local522;
								Static558.anIntArray703[local90] = arg5.method6834() ? local51.anInt5090 : local51.anInt5087;
								Static333.anIntArray483[local90] = local51.anInt5080;
								if (Static115.anIntArray251[local90] == local51.anInt5089) {
									Static49.anIntArray138[local90] |= 0x10;
								} else {
									Static49.anIntArray138[local90] = 16;
								}
								Static115.anIntArray251[local90] = local51.anInt5089;
							}
							local517--;
							local90++;
						}
						if (!local22[arg4 + 2 & 0x3]) {
							arg7[2] = Static291.aBooleanArrayArray4[local69][local505 & 0x3];
						}
					} else if (!local22[arg4 + 2 & 0x3]) {
						arg7[2] = Static340.aBooleanArrayArray5[local69][--local505 & 0x3];
					}
				}
			}
		}
		if (arg2 > 0) {
			local41 = arg10[arg2 - 1][arg9] & 0xFF;
			if (local41 > 0) {
				local51 = this.aClass291_2.method6442(local41 - 1);
				if (local51.anInt5088 != -1) {
					local69 = arg11[arg2 - 1][arg9];
					local505 = arg6[arg2 - 1][arg9];
					if (local51.aBoolean381) {
						local90 = 6;
						local517 = local505 * 2 + 4;
						local522 = Static493.method7056(local51, arg5);
						for (local524 = 0; local524 < 3; local524++) {
							local90 &= 0x7;
							local517 &= 0x7;
							if (Static57.aBooleanArrayArray2[local69][local517] && local51.anInt5089 >= Static115.anIntArray251[local90]) {
								Static387.anIntArray711[local90] = local51.anInt5088;
								Static234.anIntArray608[local90] = local522;
								Static558.anIntArray703[local90] = arg5.method6834() ? local51.anInt5090 : local51.anInt5087;
								Static333.anIntArray483[local90] = local51.anInt5080;
								if (Static115.anIntArray251[local90] == local51.anInt5089) {
									Static49.anIntArray138[local90] |= 0x8;
								} else {
									Static49.anIntArray138[local90] = 8;
								}
								Static115.anIntArray251[local90] = local51.anInt5089;
							}
							local517--;
							local90++;
						}
						if (!local22[arg4 + 3 & 0x3]) {
							arg7[3] = Static291.aBooleanArrayArray4[local69][local505 + 1 & 0x3];
						}
					} else if (!local22[arg4 + 3 & 0x3]) {
						arg7[3] = Static340.aBooleanArrayArray5[local69][local505 + 1 & 0x3];
					}
				}
			}
		}
		if (arg3 - 1 > arg2) {
			local41 = arg10[arg2 + 1][arg9] & 0xFF;
			if (local41 > 0) {
				local51 = this.aClass291_2.method6442(local41 - 1);
				if (local51.anInt5088 != -1) {
					local69 = arg11[arg2 + 1][arg9];
					local505 = arg6[arg2 + 1][arg9];
					if (local51.aBoolean381) {
						local90 = 4;
						local517 = local505 * 2 + 6;
						local522 = Static493.method7056(local51, arg5);
						for (local524 = 0; local524 < 3; local524++) {
							local517 &= 0x7;
							local90 &= 0x7;
							if (Static57.aBooleanArrayArray2[local69][local517] && Static115.anIntArray251[local90] <= local51.anInt5089) {
								Static387.anIntArray711[local90] = local51.anInt5088;
								Static234.anIntArray608[local90] = local522;
								Static558.anIntArray703[local90] = arg5.method6834() ? local51.anInt5090 : local51.anInt5087;
								Static333.anIntArray483[local90] = local51.anInt5080;
								if (Static115.anIntArray251[local90] == local51.anInt5089) {
									Static49.anIntArray138[local90] |= 0x4;
								} else {
									Static49.anIntArray138[local90] = 4;
								}
								Static115.anIntArray251[local90] = local51.anInt5089;
							}
							local90--;
							local517++;
						}
						if (!local22[arg4 + 1 & 0x3]) {
							arg7[1] = Static291.aBooleanArrayArray4[local69][local505 + 3 & 0x3];
						}
					} else if (!local22[arg4 + 1 & 0x3]) {
						arg7[1] = Static340.aBooleanArrayArray5[local69][local505 + 3 & 0x3];
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local41 = Static493.method7056(arg8, arg5);
		if (!arg8.aBoolean381) {
			return;
		}
		for (@Pc(1217) int local1217 = 0; local1217 < 8; local1217++) {
			@Pc(1228) int local1228 = local1217 - arg4 * 2 & 0x7;
			if (Static57.aBooleanArrayArray2[arg0][local1217] && arg8.anInt5089 >= Static115.anIntArray251[local1228]) {
				Static387.anIntArray711[local1228] = arg8.anInt5088;
				Static234.anIntArray608[local1228] = local41;
				Static558.anIntArray703[local1228] = arg5.method6834() ? arg8.anInt5090 : arg8.anInt5087;
				Static333.anIntArray483[local1228] = arg8.anInt5080;
				if (Static115.anIntArray251[local1228] == arg8.anInt5089) {
					Static49.anIntArray138[local1228] |= 0x2;
				} else {
					Static49.anIntArray138[local1228] = 2;
				}
				Static115.anIntArray251[local1228] = arg8.anInt5089;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIIII)V")
	public final void method2381(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2678; local3++) {
			this.method2377(arg1, arg0, local3);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIZIILclient!eh;I)V")
	private void method2382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class4_Sub9 arg9) {
		if (arg8 == 1) {
			arg0 = 1;
		} else if (arg8 == 2) {
			arg0 = 1;
			arg5 = 1;
		} else if (arg8 == 3) {
			arg5 = 1;
		}
		@Pc(68) int local68;
		if (arg1 < 0 || arg1 >= this.anInt2672 || arg7 < 0 || arg7 >= this.anInt2684) {
			while (true) {
				local68 = arg9.method6015();
				if (local68 == 0) {
					return;
				}
				if (local68 == 1) {
					arg9.method6015();
					return;
				}
				if (local68 <= 49) {
					arg9.method6015();
				}
			}
			return;
		}
		if (!this.aBoolean215 && !arg6) {
			Static97.aByteArrayArrayArray19[arg3][arg1][arg7] = 0;
		}
		while (true) {
			local68 = arg9.method6015();
			if (local68 == 0) {
				if (this.aBoolean215) {
					this.anIntArrayArrayArray12[0][arg5 + arg1][arg0 + arg7] = 0;
					return;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray12[0][arg1 + arg5][arg7 + arg0] = -Static124.method2647(arg4 + 556238, 932731 - -arg2) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray12[arg3][arg1 + arg5][arg0 + arg7] = this.anIntArrayArrayArray12[arg3 - 1][arg5 + arg1][arg7 + arg0] - 960;
					return;
				}
			}
			if (local68 == 1) {
				@Pc(160) int local160 = arg9.method6015();
				if (!this.aBoolean215) {
					if (local160 == 1) {
						local160 = 0;
					}
					if (arg3 == 0) {
						this.anIntArrayArrayArray12[0][arg5 + arg1][arg0 + arg7] = -local160 * 8 << 2;
						return;
					}
					this.anIntArrayArrayArray12[arg3][arg5 + arg1][arg7 + arg0] = this.anIntArrayArrayArray12[arg3 - 1][arg5 + arg1][arg0 + arg7] - (local160 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray12[0][arg5 + arg1][arg7 + arg0] = local160 * 8 << 2;
				return;
			}
			if (local68 <= 49) {
				if (arg6) {
					arg9.method6015();
				} else {
					this.aByteArrayArrayArray13[arg3][arg1][arg7] = arg9.method6021();
					this.aByteArrayArrayArray11[arg3][arg1][arg7] = (byte) ((local68 - 2) / 4);
					this.aByteArrayArrayArray12[arg3][arg1][arg7] = (byte) (local68 + arg8 - 2 & 0x3);
				}
			} else if (local68 <= 81) {
				if (!this.aBoolean215 && !arg6) {
					Static97.aByteArrayArrayArray19[arg3][arg1][arg7] = (byte) (local68 - 49);
				}
			} else if (!arg6) {
				this.aByteArrayArrayArray15[arg3][arg1][arg7] = (byte) (local68 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([Lclient!ed;I[[[ILclient!oa;)V")
	public final void method2383(@OriginalArg(0) Class84[] arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) Class66 arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean215) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt2672; local10++) {
					for (local14 = 0; local14 < this.anInt2684; local14++) {
						if ((Static97.aByteArrayArrayArray19[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static97.aByteArrayArrayArray19[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg0[local31].method2354(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt2678; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean215) {
				if (Static461.aBoolean546) {
					local10 = 2;
				}
				if (Static532.aBoolean628) {
					local14 = 8;
				}
				if (Static574.anInt6916 != 0) {
					if (Static276.aBoolean391 | local6 == 0) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static461.aBoolean546) {
				local14 |= 0x7;
			}
			if (!Static175.aBoolean640) {
				local14 |= 0x20;
			}
			@Pc(155) int[][] local155 = arg1 == null || arg1.length <= local6 ? this.anIntArrayArrayArray12[local6] : arg1[local6];
			Static322.method4893(local6, arg2.method6797(this.anInt2672, this.anInt2684, this.anIntArrayArrayArray12[local6], local155, local10, local14));
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLclient!d;Lclient!d;Lclient!oa;)V")
	public final void method2384(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) Class66 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt2672][this.anInt2684];
		if (Static154.anIntArray310 == null || Static154.anIntArray310.length != this.anInt2684) {
			Static154.anIntArray310 = new int[this.anInt2684];
			Static170.anIntArray695 = new int[this.anInt2684];
			Static584.anIntArray712 = new int[this.anInt2684];
			Static19.anIntArray100 = new int[this.anInt2684];
			Static393.anIntArray707 = new int[this.anInt2684];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt2678; local44++) {
			for (local48 = 0; local48 < this.anInt2684; local48++) {
				Static154.anIntArray310[local48] = 0;
				Static170.anIntArray695[local48] = 0;
				Static393.anIntArray707[local48] = 0;
				Static584.anIntArray712[local48] = 0;
				Static19.anIntArray100[local48] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt2672; local77++) {
				@Pc(87) int local87;
				@Pc(102) int local102;
				@Pc(168) int local168;
				for (@Pc(81) int local81 = 0; local81 < this.anInt2684; local81++) {
					local87 = local77 + 5;
					@Pc(148) int local148;
					if (this.anInt2672 > local87) {
						local102 = this.aByteArrayArrayArray15[local44][local87][local81] & 0xFF;
						if (local102 > 0) {
							@Pc(112) Class149 local112 = this.aClass162_6.method3849(local102 - 1);
							Static154.anIntArray310[local81] += local112.anInt4252;
							Static170.anIntArray695[local81] += local112.anInt4259;
							Static393.anIntArray707[local81] += local112.anInt4256;
							Static584.anIntArray712[local81] += local112.anInt4254;
							local148 = Static19.anIntArray100[local81]++;
						}
					}
					local102 = local77 - 5;
					if (local102 >= 0) {
						local168 = this.aByteArrayArrayArray15[local44][local102][local81] & 0xFF;
						if (local168 > 0) {
							@Pc(181) Class149 local181 = this.aClass162_6.method3849(local168 - 1);
							Static154.anIntArray310[local81] -= local181.anInt4252;
							Static170.anIntArray695[local81] -= local181.anInt4259;
							Static393.anIntArray707[local81] -= local181.anInt4256;
							Static584.anIntArray712[local81] -= local181.anInt4254;
							local148 = Static19.anIntArray100[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local102 = 0;
					local168 = 0;
					@Pc(239) int local239 = 0;
					@Pc(241) int local241 = 0;
					for (@Pc(243) int local243 = -5; local243 < this.anInt2684; local243++) {
						@Pc(249) int local249 = local243 + 5;
						if (local249 < this.anInt2684) {
							local168 += Static393.anIntArray707[local249];
							local239 += Static584.anIntArray712[local249];
							local102 += Static170.anIntArray695[local249];
							local241 += Static19.anIntArray100[local249];
							local87 += Static154.anIntArray310[local249];
						}
						@Pc(291) int local291 = local243 - 5;
						if (local291 >= 0) {
							local241 -= Static19.anIntArray100[local291];
							local239 -= Static584.anIntArray712[local291];
							local102 -= Static170.anIntArray695[local291];
							local168 -= Static393.anIntArray707[local291];
							local87 -= Static154.anIntArray310[local291];
						}
						if (local243 >= 0 && local239 > 0 && local241 > 0) {
							local11[local77][local243] = Static66.method6765(local102 / local241, local87 * 256 / local239, local168 / local241);
						}
					}
				}
			}
			if (Static190.aBoolean301) {
				this.method2387(local44 == 0 ? arg0 : null, local11, local44 == 0 ? arg1 : null, local44, arg2, Static112.aClass16Array3[local44]);
			} else {
				this.method2385(local44 == 0 ? arg1 : null, local11, local44, arg2, Static112.aClass16Array3[local44], local44 == 0 ? arg0 : null);
			}
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray13[local44] = null;
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
		}
		if (!this.aBoolean215) {
			if (Static574.anInt6916 != 0) {
				Static526.method7353();
			}
			if (Static461.aBoolean546) {
				Static22.method430();
			}
		}
		for (local48 = 0; local48 < this.anInt2678; local48++) {
			Static112.aClass16Array3[local48].ba();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!d;Z[[IILclient!oa;Lclient!d;Lclient!d;)V")
	private void method2385(@OriginalArg(0) Class16 arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class66 arg3, @OriginalArg(5) Class16 arg4, @OriginalArg(6) Class16 arg5) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt2672; local9++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt2684; local13++) {
				if (Static447.anInt7625 == -1 || Static209.method7919(Static447.anInt7625, local13, local9, arg2)) {
					@Pc(37) byte local37 = this.aByteArrayArrayArray11[arg2][local9][local13];
					@Pc(46) byte local46 = this.aByteArrayArrayArray12[arg2][local9][local13];
					@Pc(57) int local57 = this.aByteArrayArrayArray13[arg2][local9][local13] & 0xFF;
					@Pc(68) int local68 = this.aByteArrayArrayArray15[arg2][local9][local13] & 0xFF;
					@Pc(83) Class187 local83 = local57 == 0 ? null : this.aClass291_2.method6442(local57 - 1);
					@Pc(98) Class149 local98 = local68 == 0 ? null : this.aClass162_6.method3849(local68 - 1);
					@Pc(100) int local100 = 0;
					@Pc(102) int local102 = 0;
					if (local37 != 0) {
						local102 = local83 == null ? 0 : Static78.anIntArray206[local37];
						local100 = local98 == null ? 0 : Static146.anIntArray305[local37];
					} else if (local83 != null) {
						local102 = Static78.anIntArray206[local37];
					} else if (local98 != null) {
						local100 = Static78.anIntArray206[local37];
					}
					@Pc(140) int local140 = local102 + local100;
					@Pc(142) int local142 = 0;
					if (local140 != 0) {
						@Pc(150) int[] local150 = new int[local140];
						@Pc(153) int[] local153 = new int[local140];
						@Pc(156) int[] local156 = new int[local140];
						@Pc(159) int[] local159 = new int[local140];
						@Pc(161) boolean local161 = false;
						@Pc(184) int local184;
						@Pc(190) int local190;
						if (local83 == null || local83.anInt5088 == -1 && local83.anInt5079 == -1 && local83.anInt5090 == -1) {
							for (local184 = 0; local184 < local102; local184++) {
								local150[local142] = -1;
								local142++;
							}
						} else {
							local184 = arg3.method6834() ? local83.anInt5090 : local83.anInt5087;
							if (Static110.aBoolean210) {
								local184 = -1;
							}
							for (local190 = 0; local190 < local102; local190++) {
								local156[local142] = local184;
								local159[local142] = local83.anInt5080;
								if (local83.anInt5088 == -1) {
									local150[local142] = -1;
								} else {
									local150[local142] = local83.anInt5088;
								}
								if (local83.anInt5079 == -1) {
									local153[local142] = -1;
								} else {
									local161 = true;
									local153[local142] = local83.anInt5079;
								}
								local142++;
							}
							if (!this.aBoolean215 && arg2 == 0) {
								Static433.method6145(local9, local13, local83.anInt5085, local83.anInt5083 * 8, local83.anInt5081);
							}
						}
						if (!local161) {
							local153 = null;
						}
						if (local98 == null) {
							for (local184 = 0; local184 < local100; local184++) {
								local150[local142] = -1;
								local142++;
							}
						} else {
							local184 = local98.anInt4251;
							if (Static110.aBoolean210) {
								local184 = -1;
							}
							for (local190 = 0; local190 < local100; local190++) {
								local156[local142] = local184;
								local159[local142] = local98.anInt4258;
								local150[local142] = arg1[local9][local13];
								if (local153 != null) {
									local153[local142] = -1;
								}
								local142++;
							}
						}
						local184 = this.anIntArray249.length;
						@Pc(347) int[] local347 = new int[local184];
						@Pc(350) int[] local350 = new int[local184];
						@Pc(357) int[] local357 = arg0 == null ? null : new int[local184];
						@Pc(366) int[] local366 = arg0 == null && arg5 == null ? null : new int[local184];
						@Pc(375) int local375;
						@Pc(380) int local380;
						@Pc(465) int local465;
						@Pc(471) int local471;
						for (@Pc(368) int local368 = 0; local368 < local184; local368++) {
							local375 = this.anIntArray249[local368];
							local380 = this.anIntArray250[local368];
							if (local46 == 0) {
								local347[local368] = local375;
								local350[local368] = local380;
							} else if (local46 == 1) {
								local347[local368] = local380;
								local350[local368] = 512 - local375;
							} else if (local46 == 2) {
								local347[local368] = 512 - local375;
								local350[local368] = 512 - local380;
							} else if (local46 == 3) {
								local347[local368] = 512 - local380;
								local350[local368] = local375;
							}
							if (local357 != null && Static57.aBooleanArrayArray2[local37][local368]) {
								local465 = local375 + (local9 << 9);
								local471 = local375 + (local13 << 9);
								local357[local368] = arg0.sa(local465, local471) - arg4.sa(local465, local471);
							}
							if (local366 != null) {
								if (arg0 != null && !Static57.aBooleanArrayArray2[local37][local368]) {
									local465 = (local9 << 9) + local375;
									local471 = (local13 << 9) + local375;
									local366[local368] = arg4.sa(local465, local471) - arg0.sa(local465, local471);
								} else if (arg5 != null && !Static155.aBooleanArrayArray3[local37][local368]) {
									local465 = local375 + (local9 << 9);
									local471 = local375 + (local13 << 9);
									local366[local368] = arg5.sa(local465, local471) - arg4.sa(local465, local471);
								}
							}
						}
						local375 = arg4.JA(local9, local13);
						local380 = arg4.JA(local9 + 1, local13);
						local465 = arg4.JA(local9 + 1, local13 + 1);
						local471 = arg4.JA(local9, local13 + 1);
						if (arg2 > 0) {
							@Pc(599) boolean local599 = true;
							if (local68 == 0 && local37 != 0) {
								local599 = false;
							}
							if (local57 > 0 && local83 != null && !local83.aBoolean383) {
								local599 = false;
							}
							if (local599 && local380 == local375 && local375 == local465 && local375 == local471) {
								this.aByteArrayArrayArray14[arg2][local9][local13] = (byte) (this.aByteArrayArrayArray14[arg2][local9][local13] | 0x4);
							}
						}
						@Pc(653) int local653 = 0;
						@Pc(655) int local655 = 0;
						@Pc(657) int local657 = 0;
						if (this.aBoolean215) {
							local653 = Static293.method4587(local9, local13);
							local655 = Static113.method2340(local9, local13);
							local657 = Static176.method3345(local9, local13);
						}
						arg4.method8040(local9, local13, local347, local357, local350, local366, Static6.anIntArrayArray1[local37], Static179.anIntArrayArray48[local37], Static278.anIntArrayArray55[local37], local150, local153, local156, local159, local653, local655, local657);
						Static568.method7794(arg2, local9, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!eh;II[Lclient!ed;I)V")
	public final void method2386(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class84[] arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean215) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class84 local12 = arg4[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg3;
						@Pc(28) int local28 = arg0 + local18;
						if (local24 >= 0 && this.anInt2672 > local24 && local28 >= 0 && this.anInt2684 > local28) {
							local12.method2355(local28, local24);
						}
					}
				}
			}
		}
		local6 = arg3 + arg5;
		@Pc(73) int local73 = arg2 + arg0;
		for (local14 = 0; local14 < this.anInt2678; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method2382(0, arg3 + local18, local6 + local18, local14, local73 + local24, 0, false, arg0 + local24, 0, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!d;[[ILclient!d;ILclient!oa;Lclient!d;I)V")
	private void method2387(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class66 arg4, @OriginalArg(5) Class16 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg3];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray12[arg3];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray15[arg3];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray13[arg3];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2672; local27++) {
			@Pc(43) int local43 = this.anInt2672 - 1 <= local27 ? local27 : local27 + 1;
			for (@Pc(45) int local45 = 0; local45 < this.anInt2684; local45++) {
				@Pc(59) int local59 = this.anInt2684 - 1 > local45 ? local45 + 1 : local45;
				if (Static447.anInt7625 == -1 || Static209.method7919(Static447.anInt7625, local45, local27, arg3)) {
					@Pc(73) boolean local73 = false;
					@Pc(75) boolean local75 = false;
					@Pc(78) boolean[] local78 = new boolean[4];
					@Pc(84) int local84 = local10[local27][local45];
					@Pc(90) int local90 = local15[local27][local45];
					@Pc(98) int local98 = local25[local27][local45] & 0xFF;
					@Pc(106) int local106 = local20[local27][local45] & 0xFF;
					@Pc(114) int local114 = local20[local27][local59] & 0xFF;
					@Pc(122) int local122 = local20[local43][local59] & 0xFF;
					@Pc(130) int local130 = local20[local43][local45] & 0xFF;
					if (local98 != 0 || local106 != 0) {
						@Pc(149) Class187 local149 = local98 == 0 ? null : this.aClass291_2.method6442(local98 - 1);
						@Pc(161) Class149 local161 = local106 == 0 ? null : this.aClass162_6.method3849(local106 - 1);
						if (local84 == 0 && local149 == null) {
							local84 = 12;
						}
						@Pc(172) Class187 local172 = local149;
						if (local149 != null) {
							if (local149.anInt5088 == -1 && local149.anInt5079 == -1) {
								local172 = local149;
								local149 = null;
							} else if (local161 != null && local84 != 0) {
								local75 = local149.aBoolean381;
							}
						}
						@Pc(286) int local286;
						@Pc(303) int local303;
						@Pc(376) int local376;
						@Pc(389) int local389;
						if ((local84 == 0 || local84 == 12) && local27 > 0 && local45 > 0 && local27 < this.anInt2672 && this.anInt2684 > local45) {
							@Pc(248) int local248 = local106 == local20[local43][local45 - 1] ? 1 : -1;
							@Pc(265) int local265 = local106 == local20[local43][local59] ? 1 : -1;
							local286 = local106 == local20[local27 - 1][local45 - 1] ? 1 : -1;
							local303 = local20[local27 - 1][local59] == local106 ? 1 : -1;
							if (local106 == local20[local27][local45 - 1]) {
								local286++;
								local248++;
							} else {
								local248--;
								local286--;
							}
							if (local20[local43][local45] == local106) {
								local248++;
								local265++;
							} else {
								local265--;
								local248--;
							}
							if (local106 == local20[local27][local59]) {
								local303++;
								local265++;
							} else {
								local303--;
								local265--;
							}
							if (local106 == local20[local27 - 1][local45]) {
								local286++;
								local303++;
							} else {
								local286--;
								local303--;
							}
							local376 = local286 - local265;
							if (local376 < 0) {
								local376 = -local376;
							}
							local389 = local248 - local303;
							if (local389 < 0) {
								local389 = -local389;
							}
							if (local389 == local376) {
								local376 = arg5.JA(local27, local45) - arg5.JA(local43, local59);
								if (local376 < 0) {
									local376 = -local376;
								}
								local389 = arg5.JA(local43, local45) - arg5.JA(local27, local59);
								if (local389 < 0) {
									local389 = -local389;
								}
							}
							local90 = local389 <= local376 ? 0 : 1;
						}
						for (local286 = 0; local286 < 13; local286++) {
							Static115.anIntArray251[local286] = -1;
							Static49.anIntArray138[local286] = 1;
						}
						@Pc(478) boolean[] local478 = local149 != null && local149.aBoolean381 ? Static291.aBooleanArrayArray4[local84] : Static340.aBooleanArrayArray5[local84];
						this.method2379(local84, local161, local27, this.anInt2672, local90, arg4, local15, local78, local149, local45, local25, local10, this.anInt2684);
						@Pc(507) boolean local507 = local149 != null && local149.anInt5079 != local149.anInt5088;
						if (!local507) {
							for (local303 = 0; local303 < 8; local303++) {
								if (Static115.anIntArray251[local303] >= 0 && Static387.anIntArray711[local303] != Static234.anIntArray608[local303]) {
									local507 = true;
									break;
								}
							}
						}
						if (!local478[local90 + 1 & 0x3]) {
							local78[1] = Static540.method7505(local78[1], (Static49.anIntArray138[2] & Static49.anIntArray138[4]) == 0);
						}
						if (!local478[local90 + 3 & 0x3]) {
							local78[3] = Static540.method7505(local78[3], (Static49.anIntArray138[0] & Static49.anIntArray138[6]) == 0);
						}
						if (!local478[local90 & 0x3]) {
							local78[0] = Static540.method7505(local78[0], (Static49.anIntArray138[0] & Static49.anIntArray138[2]) == 0);
						}
						if (!local478[local90 + 2 & 0x3]) {
							local78[2] = Static540.method7505(local78[2], (Static49.anIntArray138[4] & Static49.anIntArray138[6]) == 0);
						}
						if (!local75 && (local84 == 0 || local84 == 12)) {
							if (local78[0] && !local78[1] && !local78[2] && local78[3]) {
								local90 = 0;
								local78[0] = local78[3] = false;
								local84 = local84 == 0 ? 13 : 14;
							} else if (local78[0] && local78[1] && !local78[2] && !local78[3]) {
								local90 = 3;
								local84 = local84 == 0 ? 13 : 14;
								local78[0] = local78[1] = false;
							} else if (!local78[0] && local78[1] && local78[2] && !local78[3]) {
								local90 = 2;
								local84 = local84 == 0 ? 13 : 14;
								local78[1] = local78[2] = false;
							} else if (!local78[0] && !local78[1] && local78[2] && local78[3]) {
								local90 = 1;
								local84 = local84 == 0 ? 13 : 14;
								local78[2] = local78[3] = false;
							}
						}
						@Pc(813) boolean local813 = !local75 && !local78[0] && !local78[2] && !local78[1] && !local78[3];
						@Pc(815) int[] local815 = null;
						@Pc(851) int[] local851;
						@Pc(827) int[] local827;
						@Pc(823) int[] local823;
						if (local813) {
							local376 = local161 == null ? 0 : Static146.anIntArray305[local84];
							local823 = Static278.anIntArrayArray55[local84];
							local389 = local149 == null ? 0 : Static78.anIntArray206[local84];
							local851 = Static6.anIntArrayArray1[local84];
							local827 = Static179.anIntArrayArray48[local84];
						} else if (local75) {
							local823 = Static159.anIntArrayArray42[local84];
							local827 = Static32.anIntArrayArray19[local84];
							local376 = local161 == null ? 0 : Static282.anIntArray454[local84];
							local389 = local149 == null ? 0 : Static351.anIntArray509[local84];
							local815 = Static22.anIntArrayArray15[local84];
							local851 = Static117.anIntArrayArray38[local84];
						} else {
							local851 = Static559.anIntArrayArray77[local84];
							local815 = Static288.anIntArrayArray56[local84];
							local827 = Static436.anIntArrayArray63[local84];
							local376 = local161 == null ? 0 : Static597.anIntArray725[local84];
							local823 = Static56.anIntArrayArray23[local84];
							local389 = local149 == null ? 0 : Static195.anIntArray389[local84];
						}
						@Pc(917) int local917 = local389 + local376;
						if (local917 <= 0) {
							Static568.method7794(arg3, local27, local45);
						} else {
							if (local78[0]) {
								local917++;
							}
							if (local78[2]) {
								local917++;
							}
							if (local78[1]) {
								local917++;
							}
							if (local78[3]) {
								local917++;
							}
							@Pc(950) int local950 = 0;
							@Pc(952) int local952 = 0;
							@Pc(956) int local956 = local917 * 3;
							@Pc(963) int[] local963 = local507 ? new int[local956] : null;
							@Pc(966) int[] local966 = new int[local956];
							@Pc(969) int[] local969 = new int[local956];
							@Pc(972) int[] local972 = new int[local956];
							@Pc(975) int[] local975 = new int[local956];
							@Pc(978) int[] local978 = new int[local956];
							@Pc(985) int[] local985 = arg2 == null ? null : new int[local956];
							@Pc(994) int[] local994 = arg2 == null && arg0 == null ? null : new int[local956];
							@Pc(996) int local996 = -1;
							@Pc(998) int local998 = -1;
							@Pc(1000) int local1000 = 256;
							@Pc(1096) byte local1096;
							@Pc(1022) int local1022;
							@Pc(1024) int local1024;
							@Pc(1260) int local1260;
							@Pc(1266) int local1266;
							@Pc(1275) int local1275;
							@Pc(1280) int local1280;
							@Pc(1300) int local1300;
							@Pc(1285) int local1285;
							@Pc(1295) int local1295;
							@Pc(1349) int local1349;
							@Pc(1356) int local1356;
							if (local149 != null) {
								local996 = local149.anInt5088;
								local998 = arg4.method6834() ? local149.anInt5090 : local149.anInt5087;
								local1000 = local149.anInt5080;
								local1022 = Static493.method7056(local149, arg4);
								for (local1024 = 0; local1024 < local389; local1024++) {
									if (local78[-local90 & 0x3] && local950 == local815[0]) {
										Static200.anIntArray393[0] = local851[local950];
										Static200.anIntArray393[1] = 1;
										Static200.anIntArray393[2] = local823[local950];
										Static200.anIntArray393[3] = 1;
										Static200.anIntArray393[4] = local827[local950];
										local1096 = 6;
										Static200.anIntArray393[5] = local823[local950];
									} else if (local78[2 - local90 & 0x3] && local950 == local815[2]) {
										Static200.anIntArray393[0] = local851[local950];
										Static200.anIntArray393[1] = 5;
										Static200.anIntArray393[2] = local823[local950];
										Static200.anIntArray393[3] = 5;
										Static200.anIntArray393[4] = local827[local950];
										Static200.anIntArray393[5] = local823[local950];
										local1096 = 6;
									} else if (local78[1 - local90 & 0x3] && local815[1] == local950) {
										Static200.anIntArray393[0] = local851[local950];
										Static200.anIntArray393[1] = 3;
										Static200.anIntArray393[2] = local823[local950];
										Static200.anIntArray393[3] = 3;
										Static200.anIntArray393[4] = local827[local950];
										local1096 = 6;
										Static200.anIntArray393[5] = local823[local950];
									} else if (local78[3 - local90 & 0x3] && local950 == local815[3]) {
										Static200.anIntArray393[0] = local851[local950];
										Static200.anIntArray393[1] = 7;
										Static200.anIntArray393[2] = local823[local950];
										Static200.anIntArray393[3] = 7;
										Static200.anIntArray393[4] = local827[local950];
										local1096 = 6;
										Static200.anIntArray393[5] = local823[local950];
									} else {
										Static200.anIntArray393[0] = local851[local950];
										Static200.anIntArray393[1] = local827[local950];
										Static200.anIntArray393[2] = local823[local950];
										local1096 = 3;
									}
									local950++;
									for (local1260 = 0; local1260 < local1096; local1260++) {
										local1266 = Static200.anIntArray393[local1260];
										local1275 = local1266 - local90 * 2 & 0x7;
										local1280 = this.anIntArray249[local1266];
										local1285 = this.anIntArray250[local1266];
										if (local90 == 1) {
											local1295 = 512 - local1280;
											local1300 = local1285;
										} else if (local90 == 2) {
											local1295 = 512 - local1285;
											local1300 = 512 - local1280;
										} else if (local90 == 3) {
											local1300 = 512 - local1285;
											local1295 = local1280;
										} else {
											local1295 = local1285;
											local1300 = local1280;
										}
										local966[local952] = local1300;
										local969[local952] = local1295;
										if (local985 != null && Static57.aBooleanArrayArray2[local84][local1266]) {
											local1349 = local1300 + (local27 << 9);
											local1356 = (local45 << 9) + local1295;
											local985[local952] = arg2.sa(local1349, local1356) - arg5.sa(local1349, local1356);
										}
										if (local994 != null) {
											if (arg2 != null && !Static57.aBooleanArrayArray2[local84][local1266]) {
												local1349 = (local27 << 9) + local1300;
												local1356 = (local45 << 9) + local1295;
												local994[local952] = arg5.sa(local1349, local1356) - arg2.sa(local1349, local1356);
											} else if (arg0 != null && !Static155.aBooleanArrayArray3[local84][local1266]) {
												local1349 = local1300 + (local27 << 9);
												local1356 = (local45 << 9) + local1295;
												local994[local952] = arg0.sa(local1349, local1356) - arg5.sa(local1349, local1356);
											}
										}
										if (local1266 < 8 && Static115.anIntArray251[local1275] > local149.anInt5089) {
											if (local963 != null) {
												local963[local952] = Static234.anIntArray608[local1275];
											}
											local978[local952] = Static333.anIntArray483[local1275];
											local975[local952] = Static558.anIntArray703[local1275];
											local972[local952] = Static387.anIntArray711[local1275];
										} else {
											if (local963 != null) {
												local963[local952] = local1022;
											}
											local975[local952] = arg4.method6834() ? local149.anInt5090 : local149.anInt5087;
											local978[local952] = local149.anInt5080;
											local972[local952] = local996;
										}
										local952++;
									}
								}
								if (!this.aBoolean215 && arg3 == 0) {
									Static433.method6145(local27, local45, local149.anInt5085, local149.anInt5083 * 8, local149.anInt5081);
								}
								if (local84 != 12 && local149.anInt5088 != -1 && local149.aBoolean382) {
									local73 = true;
								}
							} else if (local813) {
								local950 = Static78.anIntArray206[local84];
							} else if (local75) {
								local950 = Static351.anIntArray509[local84];
							} else {
								local950 = Static195.anIntArray389[local84];
							}
							if (local161 != null) {
								if (local114 == 0) {
									local114 = local106;
								}
								if (local122 == 0) {
									local122 = local106;
								}
								if (local130 == 0) {
									local130 = local106;
								}
								@Pc(1609) Class149 local1609 = this.aClass162_6.method3849(local106 - 1);
								@Pc(1617) Class149 local1617 = this.aClass162_6.method3849(local114 - 1);
								@Pc(1625) Class149 local1625 = this.aClass162_6.method3849(local122 - 1);
								@Pc(1633) Class149 local1633 = this.aClass162_6.method3849(local130 - 1);
								for (local1275 = 0; local1275 < local376; local1275++) {
									if (local78[-local90 & 0x3] && local950 == local815[0]) {
										Static200.anIntArray393[0] = local851[local950];
										Static200.anIntArray393[1] = 1;
										Static200.anIntArray393[2] = local823[local950];
										Static200.anIntArray393[3] = 1;
										Static200.anIntArray393[4] = local827[local950];
										local1096 = 6;
										Static200.anIntArray393[5] = local823[local950];
									} else if (local78[2 - local90 & 0x3] && local950 == local815[2]) {
										Static200.anIntArray393[0] = local851[local950];
										Static200.anIntArray393[1] = 5;
										Static200.anIntArray393[2] = local823[local950];
										Static200.anIntArray393[3] = 5;
										Static200.anIntArray393[4] = local827[local950];
										Static200.anIntArray393[5] = local823[local950];
										local1096 = 6;
									} else if (local78[1 - local90 & 0x3] && local815[1] == local950) {
										Static200.anIntArray393[0] = local851[local950];
										Static200.anIntArray393[1] = 3;
										Static200.anIntArray393[2] = local823[local950];
										Static200.anIntArray393[3] = 3;
										Static200.anIntArray393[4] = local827[local950];
										Static200.anIntArray393[5] = local823[local950];
										local1096 = 6;
									} else if (local78[3 - local90 & 0x3] && local815[3] == local950) {
										Static200.anIntArray393[0] = local851[local950];
										Static200.anIntArray393[1] = 7;
										Static200.anIntArray393[2] = local823[local950];
										Static200.anIntArray393[3] = 7;
										Static200.anIntArray393[4] = local827[local950];
										Static200.anIntArray393[5] = local823[local950];
										local1096 = 6;
									} else {
										Static200.anIntArray393[0] = local851[local950];
										Static200.anIntArray393[1] = local827[local950];
										Static200.anIntArray393[2] = local823[local950];
										local1096 = 3;
									}
									for (local1280 = 0; local1280 < local1096; local1280++) {
										local1300 = Static200.anIntArray393[local1280];
										local1285 = local1300 - local90 * 2 & 0x7;
										local1295 = this.anIntArray249[local1300];
										local1356 = this.anIntArray250[local1300];
										@Pc(1898) int local1898;
										if (local90 == 1) {
											local1898 = 512 - local1295;
											local1349 = local1356;
										} else if (local90 == 2) {
											local1349 = 512 - local1295;
											local1898 = 512 - local1356;
										} else if (local90 == 3) {
											local1898 = local1295;
											local1349 = 512 - local1356;
										} else {
											local1349 = local1295;
											local1898 = local1356;
										}
										local966[local952] = local1349;
										local969[local952] = local1898;
										@Pc(1957) int local1957;
										@Pc(1963) int local1963;
										if (local985 != null && Static57.aBooleanArrayArray2[local84][local1300]) {
											local1957 = local1349 + (local27 << 9);
											local1963 = (local45 << 9) + local1898;
											local985[local952] = arg2.sa(local1957, local1963) - arg5.sa(local1957, local1963);
										}
										if (local994 != null) {
											if (arg2 != null && !Static57.aBooleanArrayArray2[local84][local1300]) {
												local1957 = local1349 + (local27 << 9);
												local1963 = local1898 + (local45 << 9);
												local994[local952] = arg5.sa(local1957, local1963) - arg2.sa(local1957, local1963);
											} else if (arg0 != null && !Static155.aBooleanArrayArray3[local84][local1300]) {
												local1957 = local1349 + (local27 << 9);
												local1963 = (local45 << 9) + local1898;
												local994[local952] = arg0.sa(local1957, local1963) - arg5.sa(local1957, local1963);
											}
										}
										if (local1300 < 8 && Static115.anIntArray251[local1285] >= 0) {
											if (local963 != null) {
												local963[local952] = Static234.anIntArray608[local1285];
											}
											local978[local952] = Static333.anIntArray483[local1285];
											local975[local952] = Static558.anIntArray703[local1285];
											local972[local952] = Static387.anIntArray711[local1285];
										} else {
											if (local75 && Static57.aBooleanArrayArray2[local84][local1300]) {
												local975[local952] = local998;
												local978[local952] = local1000;
												local972[local952] = local996;
											} else if (local1349 == 0 && local1898 == 0) {
												local972[local952] = arg1[local27][local45];
												local975[local952] = local1609.anInt4251;
												local978[local952] = local1609.anInt4258;
											} else if (local1349 == 0 && local1898 == 512) {
												local972[local952] = arg1[local27][local59];
												local975[local952] = local1617.anInt4251;
												local978[local952] = local1617.anInt4258;
											} else if (local1349 == 512 && local1898 == 512) {
												local972[local952] = arg1[local43][local59];
												local975[local952] = local1625.anInt4251;
												local978[local952] = local1625.anInt4258;
											} else if (local1349 == 512 && local1898 == 0) {
												local972[local952] = arg1[local43][local45];
												local975[local952] = local1633.anInt4251;
												local978[local952] = local1633.anInt4258;
											} else {
												if (local1349 < 256) {
													if (local1898 >= 256) {
														local975[local952] = local1617.anInt4251;
														local978[local952] = local1617.anInt4258;
													} else {
														local975[local952] = local1609.anInt4251;
														local978[local952] = local1609.anInt4258;
													}
												} else if (local1898 < 256) {
													local975[local952] = local1633.anInt4251;
													local978[local952] = local1633.anInt4258;
												} else {
													local975[local952] = local1625.anInt4251;
													local978[local952] = local1625.anInt4258;
												}
												local1957 = Static238.method7144(local1349 << 7 >> 9, arg1[local43][local45], arg1[local27][local45]);
												local1963 = Static238.method7144(local1349 << 7 >> 9, arg1[local43][local59], arg1[local27][local59]);
												local972[local952] = Static238.method7144(local1898 << 7 >> 9, local1963, local1957);
											}
											if (local963 != null) {
												local963[local952] = local972[local952];
											}
										}
										local952++;
									}
									local950++;
								}
								if (local84 != 0 && local161.aBoolean317) {
									local73 = true;
								}
							}
							local1022 = arg5.JA(local27, local45);
							local1024 = arg5.JA(local43, local45);
							local1260 = arg5.JA(local43, local59);
							local1266 = arg5.JA(local27, local59);
							if (arg3 > 0) {
								@Pc(2383) boolean local2383 = true;
								if (local106 == 0 && local84 != 0) {
									local2383 = false;
								}
								if (local98 > 0 && local172 != null && !local172.aBoolean383) {
									local2383 = false;
								}
								if (local2383 && local1024 == local1022 && local1260 == local1022 && local1266 == local1022) {
									this.aByteArrayArrayArray14[arg3][local27][local45] = (byte) (this.aByteArrayArrayArray14[arg3][local27][local45] | 0x4);
								}
							}
							local1275 = 0;
							local1280 = 0;
							local1300 = 0;
							if (this.aBoolean215) {
								local1275 = Static293.method4587(local27, local45);
								local1280 = Static113.method2340(local27, local45);
								local1300 = Static176.method3345(local27, local45);
							}
							arg5.BA(local27, local45, local966, local985, local969, local994, local972, local963, local975, local978, local1275, local1280, local1300, local73);
							Static568.method7794(arg3, local27, local45);
						}
					}
				}
			}
		}
	}
}
