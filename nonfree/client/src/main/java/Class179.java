import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public class Class179 {

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "[I")
	private final int[] anIntArray237 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "[I")
	private final int[] anIntArray238 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
	protected final int anInt4632;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "Z")
	public final boolean aBoolean331;

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
	public final int anInt4634;

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "Lclient!kg;")
	private final Class189 aClass189_6;

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "Lclient!wl;")
	private final Class360 aClass360_4;

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
	protected final int anInt4639;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(IIIZLclient!kg;Lclient!wl;)V")
	protected Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class189 arg4, @OriginalArg(5) Class360 arg5) {
		this.anInt4632 = arg1;
		this.aBoolean331 = arg3;
		this.anInt4634 = arg0;
		this.aClass189_6 = arg4;
		this.aClass360_4 = arg5;
		this.anInt4639 = arg2;
		this.aByteArrayArrayArray11 = new byte[this.anInt4634][this.anInt4632][this.anInt4639];
		this.aByteArrayArrayArray10 = new byte[this.anInt4634][this.anInt4632][this.anInt4639];
		this.aByteArrayArrayArray14 = new byte[this.anInt4634][this.anInt4632][this.anInt4639];
		this.aByteArrayArrayArray15 = new byte[this.anInt4634][this.anInt4632 + 1][this.anInt4639 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt4634][this.anInt4632][this.anInt4639];
		this.anIntArrayArrayArray12 = new int[this.anInt4634][this.anInt4632 + 1][this.anInt4639 + 1];
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!qm;Lclient!r;II[[BBII[Z[[BLclient!rl;[[BII)V")
	private void method4055(@OriginalArg(0) Class274 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) Class292 arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg0 != null && arg0.aBoolean561 ? Static177.aBooleanArrayArray15[arg5] : Static595.aBooleanArrayArray17[arg5];
		@Pc(37) int local37;
		@Pc(50) Class274 local50;
		@Pc(67) byte local67;
		@Pc(83) int local83;
		@Pc(88) int local88;
		if (arg12 > 0) {
			if (arg2 > 0) {
				local37 = arg8[arg2 - 1][arg12 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass189_6.method4520(local37 - 1);
					if (local50.anInt8101 != -1 && local50.aBoolean561) {
						local67 = arg10[arg2 - 1][arg12 - 1];
						local83 = arg4[arg2 - 1][arg12 - 1] * 2 + 4 & 0x7;
						local88 = Static416.method6528(local50, arg1);
						if (Static356.aBooleanArrayArray9[local67][local83]) {
							Static497.anIntArray484[0] = local50.anInt8101;
							Static125.anIntArray129[0] = local88;
							Static299.anIntArray295[0] = local50.anInt8106;
							Static374.anIntArray367[0] = local50.anInt8111;
							Static104.anIntArray101[0] = local50.anInt8108;
							Static262.anIntArray250[0] = 256;
						}
					}
				}
			}
			if (arg11 - 1 > arg2) {
				local37 = arg8[arg2 + 1][arg12 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass189_6.method4520(local37 - 1);
					if (local50.anInt8101 != -1 && local50.aBoolean561) {
						local67 = arg10[arg2 + 1][arg12 - 1];
						local83 = arg4[arg2 + 1][arg12 - 1] * 2 + 6 & 0x7;
						local88 = Static416.method6528(local50, arg1);
						if (Static356.aBooleanArrayArray9[local67][local83]) {
							Static497.anIntArray484[2] = local50.anInt8101;
							Static125.anIntArray129[2] = local88;
							Static299.anIntArray295[2] = local50.anInt8106;
							Static374.anIntArray367[2] = local50.anInt8111;
							Static104.anIntArray101[2] = local50.anInt8108;
							Static262.anIntArray250[2] = 512;
						}
					}
				}
			}
		}
		if (arg3 - 1 > arg12) {
			if (arg2 > 0) {
				local37 = arg8[arg2 - 1][arg12 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass189_6.method4520(local37 - 1);
					if (local50.anInt8101 != -1 && local50.aBoolean561) {
						local67 = arg10[arg2 - 1][arg12 + 1];
						local83 = arg4[arg2 - 1][arg12 + 1] * 2 + 2 & 0x7;
						local88 = Static416.method6528(local50, arg1);
						if (Static356.aBooleanArrayArray9[local67][local83]) {
							Static497.anIntArray484[6] = local50.anInt8101;
							Static125.anIntArray129[6] = local88;
							Static299.anIntArray295[6] = local50.anInt8106;
							Static374.anIntArray367[6] = local50.anInt8111;
							Static104.anIntArray101[6] = local50.anInt8108;
							Static262.anIntArray250[6] = 64;
						}
					}
				}
			}
			if (arg2 < arg11 - 1) {
				local37 = arg8[arg2 + 1][arg12 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass189_6.method4520(local37 - 1);
					if (local50.anInt8101 != -1 && local50.aBoolean561) {
						local67 = arg10[arg2 + 1][arg12 + 1];
						local83 = arg4[arg2 + 1][arg12 + 1] * 2 & 0x7;
						local88 = Static416.method6528(local50, arg1);
						if (Static356.aBooleanArrayArray9[local67][local83]) {
							Static497.anIntArray484[4] = local50.anInt8101;
							Static125.anIntArray129[4] = local88;
							Static299.anIntArray295[4] = local50.anInt8106;
							Static374.anIntArray367[4] = local50.anInt8111;
							Static104.anIntArray101[4] = local50.anInt8108;
							Static262.anIntArray250[4] = 128;
						}
					}
				}
			}
		}
		@Pc(497) int local497;
		@Pc(502) int local502;
		@Pc(504) int local504;
		@Pc(485) byte local485;
		if (arg12 > 0) {
			local37 = arg8[arg2][arg12 - 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass189_6.method4520(local37 - 1);
				if (local50.anInt8101 != -1) {
					local67 = arg10[arg2][arg12 - 1];
					local485 = arg4[arg2][arg12 - 1];
					if (local50.aBoolean561) {
						local88 = 2;
						local497 = local485 * 2 + 4;
						local502 = Static416.method6528(local50, arg1);
						for (local504 = 0; local504 < 3; local504++) {
							local88 &= 0x7;
							local497 &= 0x7;
							if (Static356.aBooleanArrayArray9[local67][local497] && Static104.anIntArray101[local88] <= local50.anInt8108) {
								Static497.anIntArray484[local88] = local50.anInt8101;
								Static125.anIntArray129[local88] = local502;
								Static299.anIntArray295[local88] = local50.anInt8106;
								Static374.anIntArray367[local88] = local50.anInt8111;
								if (local50.anInt8108 == Static104.anIntArray101[local88]) {
									Static262.anIntArray250[local88] |= 0x20;
								} else {
									Static262.anIntArray250[local88] = 32;
								}
								Static104.anIntArray101[local88] = local50.anInt8108;
							}
							local497++;
							local88--;
						}
						if (!local18[arg6 & 0x3]) {
							arg7[0] = Static177.aBooleanArrayArray15[local67][local485 + 2 & 0x3];
						}
					} else if (!local18[--arg6 & 0x3]) {
						arg7[0] = Static595.aBooleanArrayArray17[local67][local485 + 2 & 0x3];
					}
				}
			}
		}
		if (arg12 < arg3 - 1) {
			local37 = arg8[arg2][arg12 + 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass189_6.method4520(local37 - 1);
				if (local50.anInt8101 != -1) {
					local67 = arg10[arg2][arg12 + 1];
					local485 = arg4[arg2][arg12 + 1];
					if (local50.aBoolean561) {
						local88 = 4;
						local497 = local485 * 2 + 2;
						local502 = Static416.method6528(local50, arg1);
						for (local504 = 0; local504 < 3; local504++) {
							local88 &= 0x7;
							local497 &= 0x7;
							if (Static356.aBooleanArrayArray9[local67][local497] && Static104.anIntArray101[local88] <= local50.anInt8108) {
								Static497.anIntArray484[local88] = local50.anInt8101;
								Static125.anIntArray129[local88] = local502;
								Static299.anIntArray295[local88] = local50.anInt8106;
								Static374.anIntArray367[local88] = local50.anInt8111;
								if (Static104.anIntArray101[local88] == local50.anInt8108) {
									Static262.anIntArray250[local88] |= 0x10;
								} else {
									Static262.anIntArray250[local88] = 16;
								}
								Static104.anIntArray101[local88] = local50.anInt8108;
							}
							local88++;
							local497--;
						}
						if (!local18[arg6 + 2 & 0x3]) {
							arg7[2] = Static177.aBooleanArrayArray15[local67][local485 & 0x3];
						}
					} else if (!local18[arg6 + 2 & 0x3]) {
						arg7[2] = Static595.aBooleanArrayArray17[local67][local485 & 0x3];
					}
				}
			}
		}
		if (arg2 > 0) {
			local37 = arg8[arg2 - 1][arg12] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass189_6.method4520(local37 - 1);
				if (local50.anInt8101 != -1) {
					local67 = arg10[arg2 - 1][arg12];
					local485 = arg4[arg2 - 1][arg12];
					if (local50.aBoolean561) {
						local88 = 6;
						local497 = local485 * 2 + 4;
						local502 = Static416.method6528(local50, arg1);
						for (local504 = 0; local504 < 3; local504++) {
							local497 &= 0x7;
							local88 &= 0x7;
							if (Static356.aBooleanArrayArray9[local67][local497] && Static104.anIntArray101[local88] <= local50.anInt8108) {
								Static497.anIntArray484[local88] = local50.anInt8101;
								Static125.anIntArray129[local88] = local502;
								Static299.anIntArray295[local88] = local50.anInt8106;
								Static374.anIntArray367[local88] = local50.anInt8111;
								if (local50.anInt8108 == Static104.anIntArray101[local88]) {
									Static262.anIntArray250[local88] |= 0x8;
								} else {
									Static262.anIntArray250[local88] = 8;
								}
								Static104.anIntArray101[local88] = local50.anInt8108;
							}
							local497--;
							local88++;
						}
						if (!local18[arg6 + 3 & 0x3]) {
							arg7[3] = Static177.aBooleanArrayArray15[local67][local485 + 1 & 0x3];
						}
					} else if (!local18[arg6 + 3 & 0x3]) {
						arg7[3] = Static595.aBooleanArrayArray17[local67][local485 + 1 & 0x3];
					}
				}
			}
		}
		if (arg2 < arg11 - 1) {
			local37 = arg8[arg2 + 1][arg12] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass189_6.method4520(local37 - 1);
				if (local50.anInt8101 != -1) {
					local67 = arg10[arg2 + 1][arg12];
					local485 = arg4[arg2 + 1][arg12];
					if (local50.aBoolean561) {
						local88 = 4;
						local497 = local485 * 2 + 6;
						local502 = Static416.method6528(local50, arg1);
						for (local504 = 0; local504 < 3; local504++) {
							local497 &= 0x7;
							local88 &= 0x7;
							if (Static356.aBooleanArrayArray9[local67][local497] && local50.anInt8108 >= Static104.anIntArray101[local88]) {
								Static497.anIntArray484[local88] = local50.anInt8101;
								Static125.anIntArray129[local88] = local502;
								Static299.anIntArray295[local88] = local50.anInt8106;
								Static374.anIntArray367[local88] = local50.anInt8111;
								if (Static104.anIntArray101[local88] == local50.anInt8108) {
									Static262.anIntArray250[local88] |= 0x4;
								} else {
									Static262.anIntArray250[local88] = 4;
								}
								Static104.anIntArray101[local88] = local50.anInt8108;
							}
							local88--;
							local497++;
						}
						if (!local18[arg6 + 1 & 0x3]) {
							arg7[1] = Static177.aBooleanArrayArray15[local67][local485 + 3 & 0x3];
						}
					} else if (!local18[arg6 + 1 & 0x3]) {
						arg7[1] = Static595.aBooleanArrayArray17[local67][local485 + 3 & 0x3];
					}
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		local37 = Static416.method6528(arg0, arg1);
		if (!arg0.aBoolean561) {
			return;
		}
		for (@Pc(1172) int local1172 = 0; local1172 < 8; local1172++) {
			@Pc(1183) int local1183 = local1172 - arg6 * 2 & 0x7;
			if (Static356.aBooleanArrayArray9[arg5][local1172] && Static104.anIntArray101[local1183] <= arg0.anInt8108) {
				Static497.anIntArray484[local1183] = arg0.anInt8101;
				Static125.anIntArray129[local1183] = local37;
				Static299.anIntArray295[local1183] = arg0.anInt8106;
				Static374.anIntArray367[local1183] = arg0.anInt8111;
				if (arg0.anInt8108 == Static104.anIntArray101[local1183]) {
					Static262.anIntArray250[local1183] |= 0x2;
				} else {
					Static262.anIntArray250[local1183] = 2;
				}
				Static104.anIntArray101[local1183] = arg0.anInt8108;
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I[Lclient!ga;IIIBLclient!un;)V")
	public final void method4056(@OriginalArg(0) int arg0, @OriginalArg(1) Class111[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class4_Sub11 arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(25) int local25;
		if (!this.aBoolean331) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class111 local12 = arg1[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local25 = arg2 + local14;
						@Pc(29) int local29 = arg4 + local18;
						if (local25 >= 0 && this.anInt4632 > local25 && local29 >= 0 && local29 < this.anInt4639) {
							local12.method2853(local29, local25);
						}
					}
				}
			}
		}
		local6 = arg0 + arg2;
		@Pc(83) int local83 = arg3 + arg4;
		for (local14 = 0; local14 < this.anInt4634; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					this.method4065(0, false, 0, local25 + arg4, local83 - -local25, 0, arg5, local18 + local6, local18 + arg2, local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIBI)V")
	public final void method4057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4634; local7++) {
			this.method4058(arg1, arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIII)V")
	private void method4058(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = arg1; local15 < arg1 + 64; local15++) {
			for (local19 = arg0; local19 < arg0 + 64; local19++) {
				if (local19 >= 0 && this.anInt4632 > local19 && local15 >= 0 && this.anInt4639 > local15) {
					this.anIntArrayArrayArray12[arg2][local19][local15] = arg2 > 0 ? this.anIntArrayArrayArray12[arg2 - 1][local19][local15] - 960 : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt4632) {
			for (local19 = arg1 + 1; local19 < arg1 + 64; local19++) {
				if (local19 >= 0 && local19 < this.anInt4639) {
					this.anIntArrayArrayArray12[arg2][arg0][local19] = this.anIntArrayArrayArray12[arg2][arg0 - 1][local19];
				}
			}
		}
		if (arg1 > 0 && this.anInt4639 > arg1) {
			for (local19 = arg0 + 1; local19 < arg0 + 64; local19++) {
				if (local19 >= 0 && local19 < this.anInt4632) {
					this.anIntArrayArrayArray12[arg2][local19][arg1] = this.anIntArrayArrayArray12[arg2][local19][arg1 - 1];
				}
			}
		}
		if (arg0 < 0 || arg1 < 0 || arg0 >= this.anInt4632 || this.anInt4639 <= arg1) {
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

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([[[IBLclient!r;[Lclient!ga;)V")
	public final void method4059(@OriginalArg(0) int[][][] arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) Class111[] arg2) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(29) int local29;
		if (!this.aBoolean331) {
			for (local21 = 0; local21 < 4; local21++) {
				for (local25 = 0; local25 < this.anInt4632; local25++) {
					for (local29 = 0; local29 < this.anInt4639; local29++) {
						if ((Static262.aByteArrayArrayArray16[local21][local25][local29] & 0x1) != 0) {
							@Pc(43) int local43 = local21;
							if ((Static262.aByteArrayArrayArray16[1][local25][local29] & 0x2) != 0) {
								local43 = local21 - 1;
							}
							if (local43 >= 0) {
								arg2[local43].method2850(local29, local25);
							}
						}
					}
				}
			}
		}
		for (local21 = 0; local21 < this.anInt4634; local21++) {
			local25 = 0;
			local29 = 0;
			if (!this.aBoolean331) {
				if (Static155.aBoolean280) {
					local25 = 2;
				}
				if (Static188.aBoolean290) {
					local29 = 8;
				}
				if (Static332.anInt6371 != 0) {
					local25 |= 0x1;
					if (local21 == 0 | Static370.aBoolean507) {
						local29 |= 0x10;
					}
				}
			}
			if (Static155.aBoolean280) {
				local29 |= 0x7;
			}
			if (!Static282.aBoolean332) {
				local29 |= 0x20;
			}
			@Pc(166) int[][] local166 = arg0 == null || local21 >= arg0.length ? this.anIntArrayArrayArray12[local21] : arg0[local21];
			Static374.method5997(local21, arg1.method4967(this.anInt4632, this.anInt4639, this.anIntArrayArrayArray12[local21], local166, local25, local29));
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III[Lclient!ga;Lclient!un;IIIII)V")
	public final void method4060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class111[] arg3, @OriginalArg(4) Class4_Sub11 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg2 & 0x7) * 8;
		@Pc(17) int local17 = (arg7 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(57) int local57;
		if (!this.aBoolean331) {
			@Pc(24) Class111 local24 = arg3[arg6];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static456.method6973(arg1, local30 & 0x7, local26 & 0x7) + arg0;
					local57 = arg8 + Static79.method1260(local30 & 0x7, arg1, local26 & 0x7);
					if (local44 > 0 && this.anInt4632 - 1 > local44 && local57 > 0 && this.anInt4639 - 1 > local57) {
						local24.method2853(local57, local44);
					}
				}
			}
		}
		@Pc(104) int local104 = (arg2 & 0xFFFFFFF8) << 3;
		local26 = (arg7 & 0x1FFFFFF8) << 3;
		@Pc(112) byte local112 = 0;
		@Pc(114) byte local114 = 0;
		if (arg1 == 1) {
			local114 = 1;
		} else if (arg1 == 2) {
			local114 = 1;
			local112 = 1;
		} else if (arg1 == 3) {
			local112 = 1;
		}
		for (local57 = 0; local57 < this.anInt4634; local57++) {
			for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
				for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
					if (local57 == arg5 && local151 >= local11 && local151 <= local11 + 8 && local155 >= local17 && local155 <= local17 + 8) {
						@Pc(214) int local214;
						@Pc(227) int local227;
						if (local11 + 8 == local151 || local155 == local17 + 8) {
							if (arg1 == 0) {
								local227 = local155 + arg8 - local17;
								local214 = local151 + arg0 - local11;
							} else if (arg1 == 1) {
								local227 = arg8 + local11 + 8 - local151;
								local214 = arg0 + local155 - local17;
							} else if (arg1 == 2) {
								local214 = local11 + arg0 + 8 - local151;
								local227 = arg8 + local17 + 8 - local155;
							} else {
								local227 = local151 + arg8 - local11;
								local214 = local17 + arg0 + 8 - local155;
							}
							this.method4065(0, true, 0, local227, local26 + local155, 0, arg4, local104 + local151, local214, arg6);
						} else {
							local214 = Static456.method6973(arg1, local155 & 0x7, local151 & 0x7) + arg0;
							local227 = arg8 + Static79.method1260(local155 & 0x7, arg1, local151 & 0x7);
							this.method4065(arg1, false, local112, local227, local155 + local26, local114, arg4, local104 + local151, local214, arg6);
						}
						if (local151 == 63 || local155 == 63) {
							@Pc(352) byte local352 = 1;
							if (local151 == 63 && local155 == 63) {
								local352 = 3;
							}
							for (@Pc(364) int local364 = 0; local364 < local352; local364++) {
								@Pc(368) int local368 = local151;
								@Pc(370) int local370 = local155;
								if (local364 == 0) {
									local368 = local151 == 63 ? 64 : local151;
									local370 = local155 == 63 ? 64 : local155;
								} else if (local364 == 1) {
									local368 = 64;
								} else if (local364 == 2) {
									local370 = 64;
								}
								@Pc(415) int local415;
								@Pc(422) int local422;
								if (arg1 == 0) {
									local415 = local368 + arg0 - local11;
									local422 = local370 + arg8 - local17;
								} else if (arg1 == 1) {
									local415 = local370 + arg0 - local17;
									local422 = local11 + arg8 + 8 - local368;
								} else if (arg1 == 2) {
									local422 = local17 + arg8 + 8 - local370;
									local415 = arg0 + local11 + 8 - local368;
								} else {
									local415 = arg0 + local17 + 8 - local370;
									local422 = local368 + arg8 - local11;
								}
								if (local415 >= 0 && local415 < this.anInt4632 && local422 >= 0 && this.anInt4639 > local422) {
									this.anIntArrayArrayArray12[arg6][local415][local422] = this.anIntArrayArrayArray12[arg6][local112 + local214][local114 + local227];
								}
							}
						}
					} else {
						this.method4065(0, false, 0, -1, 0, 0, arg4, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B[[II)V")
	public final void method4061(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray12[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4632 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt4639 + 1; local22++) {
				local10[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!i;Lclient!r;B[[ILclient!i;Lclient!i;)V")
	private void method4062(@OriginalArg(0) int arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class83 arg4, @OriginalArg(6) Class83 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4632; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt4639; local7++) {
				if (Static574.anInt10049 == -1 || Static560.method8056(local3, Static574.anInt10049, arg0, local7)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray11[arg0][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray10[arg0][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray13[arg0][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray14[arg0][local3][local7] & 0xFF;
					@Pc(74) Class274 local74 = local51 == 0 ? null : this.aClass189_6.method4520(local51 - 1);
					@Pc(89) Class292 local89 = local62 == 0 ? null : this.aClass360_4.method8296(local62 - 1);
					@Pc(91) int local91 = 0;
					@Pc(93) int local93 = 0;
					if (local31 != 0) {
						local91 = local89 == null ? 0 : Static339.anIntArray334[local31];
						local93 = local74 == null ? 0 : Static398.anIntArray387[local31];
					} else if (local74 != null) {
						local93 = Static398.anIntArray387[local31];
					} else if (local89 != null) {
						local91 = Static398.anIntArray387[local31];
					}
					@Pc(132) int local132 = local93 + local91;
					@Pc(134) int local134 = 0;
					if (local132 != 0) {
						@Pc(145) int local145;
						if (Static515.aBoolean641) {
							local145 = local74 == null ? -1 : local74.anInt8106;
						} else {
							local145 = -1;
						}
						@Pc(152) int[] local152 = new int[local132];
						@Pc(155) int[] local155 = new int[local132];
						@Pc(158) int[] local158 = new int[local132];
						@Pc(161) int[] local161 = new int[local132];
						@Pc(163) boolean local163 = false;
						@Pc(180) int local180;
						if (local74 == null || local74.anInt8101 == -1 && local74.anInt8109 == -1 && local145 == -1) {
							for (local180 = 0; local180 < local93; local180++) {
								local152[local134] = -1;
								local134++;
							}
						} else {
							for (local180 = 0; local180 < local93; local180++) {
								local158[local134] = local145;
								local161[local134] = local74.anInt8111;
								if (local74.anInt8101 == -1) {
									local152[local134] = -1;
								} else {
									local152[local134] = local74.anInt8101;
								}
								if (local74.anInt8109 == -1) {
									local155[local134] = -1;
								} else {
									local155[local134] = local74.anInt8109;
									local163 = true;
								}
								local134++;
							}
							if (!this.aBoolean331 && arg0 == 0) {
								Static126.method2601(local3, local7, local74.anInt8102, local74.anInt8098 * 8, local74.anInt8110);
							}
						}
						if (!local163) {
							local155 = null;
						}
						if (local89 == null) {
							for (local180 = 0; local180 < local91; local180++) {
								local152[local134] = -1;
								local134++;
							}
						} else {
							local180 = local89.anInt8524;
							if (Static515.aBoolean641) {
								local180 = -1;
							}
							for (@Pc(296) int local296 = 0; local296 < local91; local296++) {
								local158[local134] = local180;
								local161[local134] = local89.anInt8521;
								local152[local134] = arg3[local3][local7];
								if (local155 != null) {
									local155[local134] = -1;
								}
								local134++;
							}
						}
						local180 = this.anIntArray238.length;
						@Pc(333) int[] local333 = new int[local180];
						@Pc(336) int[] local336 = new int[local180];
						@Pc(343) int[] local343 = arg1 == null ? null : new int[local180];
						@Pc(352) int[] local352 = arg1 == null && arg5 == null ? null : new int[local180];
						@Pc(361) int local361;
						@Pc(366) int local366;
						@Pc(454) int local454;
						@Pc(461) int local461;
						for (@Pc(354) int local354 = 0; local354 < local180; local354++) {
							local361 = this.anIntArray238[local354];
							local366 = this.anIntArray237[local354];
							if (local40 == 0) {
								local333[local354] = local361;
								local336[local354] = local366;
							} else if (local40 == 1) {
								local333[local354] = local366;
								local336[local354] = 512 - local361;
							} else if (local40 == 2) {
								local333[local354] = 512 - local361;
								local336[local354] = 512 - local366;
							} else if (local40 == 3) {
								local333[local354] = 512 - local366;
								local336[local354] = local361;
							}
							if (local343 != null && Static356.aBooleanArrayArray9[local31][local354]) {
								local454 = (local3 << 9) + local361;
								local461 = (local7 << 9) + local361;
								local343[local354] = arg1.method7213(local454, local461) - arg4.method7213(local454, local461);
							}
							if (local352 != null) {
								if (arg1 != null && !Static356.aBooleanArrayArray9[local31][local354]) {
									local454 = (local3 << 9) + local361;
									local461 = local361 + (local7 << 9);
									local352[local354] = arg4.method7213(local454, local461) - arg1.method7213(local454, local461);
								} else if (arg5 != null && !Static485.aBooleanArrayArray14[local31][local354]) {
									local454 = local361 + (local3 << 9);
									local461 = (local7 << 9) + local361;
									local352[local354] = arg5.method7213(local454, local461) - arg4.method7213(local454, local461);
								}
							}
						}
						local361 = arg4.method7217(local7, local3);
						local366 = arg4.method7217(local7, local3 + 1);
						local454 = arg4.method7217(local7 + 1, local3 + 1);
						local461 = arg4.method7217(local7 + 1, local3);
						@Pc(600) boolean local600 = Static310.method5267(local3, local7);
						if (local600 && arg0 > 1 || !local600 && arg0 > 0) {
							@Pc(613) boolean local613 = true;
							if (local89 != null && !local89.aBoolean603) {
								local613 = false;
							} else if (local62 == 0 && local31 != 0) {
								local613 = false;
							} else if (local51 > 0 && local74 != null && !local74.aBoolean562) {
								local613 = false;
							}
							if (local613 && local366 == local361 && local361 == local454 && local361 == local461) {
								this.aByteArrayArrayArray15[arg0][local3][local7] = (byte) (this.aByteArrayArrayArray15[arg0][local3][local7] | 0x4);
							}
						}
						@Pc(678) int local678 = 0;
						@Pc(680) int local680 = 0;
						@Pc(682) int local682 = 0;
						if (this.aBoolean331) {
							local678 = Static258.method4158(local3, local7);
							local680 = Static159.method2941(local3, local7);
							local682 = Static171.method3122(local3, local7);
						}
						arg4.method7210(local3, local7, local333, local343, local336, local352, Static394.anIntArrayArray42[local31], Static70.anIntArrayArray9[local31], Static52.anIntArrayArray7[local31], local152, local155, local158, local161, local678, local680, local682);
						Static74.method1212(arg0, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!i;Lclient!r;Lclient!i;B)V")
	public final void method4063(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Class83 arg2) {
		if (Static265.anIntArray251 == null || Static265.anIntArray251.length != this.anInt4639) {
			Static236.anIntArray213 = new int[this.anInt4639];
			Static587.anIntArray548 = new int[this.anInt4639];
			Static291.anIntArray290 = new int[this.anInt4639];
			Static265.anIntArray251 = new int[this.anInt4639];
			Static137.anIntArray138 = new int[this.anInt4639];
		}
		@Pc(50) int[][] local50 = new int[this.anInt4632][this.anInt4639];
		@Pc(56) int local56;
		for (@Pc(52) int local52 = 0; local52 < this.anInt4634; local52++) {
			for (local56 = 0; local56 < this.anInt4639; local56++) {
				Static265.anIntArray251[local56] = 0;
				Static137.anIntArray138[local56] = 0;
				Static291.anIntArray290[local56] = 0;
				Static587.anIntArray548[local56] = 0;
				Static236.anIntArray213[local56] = 0;
			}
			for (@Pc(85) int local85 = -5; local85 < this.anInt4632; local85++) {
				@Pc(95) int local95;
				@Pc(114) int local114;
				@Pc(180) int local180;
				for (@Pc(89) int local89 = 0; local89 < this.anInt4639; local89++) {
					local95 = local85 + 5;
					@Pc(160) int local160;
					if (this.anInt4632 > local95) {
						local114 = this.aByteArrayArrayArray14[local52][local95][local89] & 0xFF;
						if (local114 > 0) {
							@Pc(124) Class292 local124 = this.aClass360_4.method8296(local114 - 1);
							Static265.anIntArray251[local89] += local124.anInt8523;
							Static137.anIntArray138[local89] += local124.anInt8527;
							Static291.anIntArray290[local89] += local124.anInt8525;
							Static587.anIntArray548[local89] += local124.anInt8528;
							local160 = Static236.anIntArray213[local89]++;
						}
					}
					local114 = local85 - 5;
					if (local114 >= 0) {
						local180 = this.aByteArrayArrayArray14[local52][local114][local89] & 0xFF;
						if (local180 > 0) {
							@Pc(190) Class292 local190 = this.aClass360_4.method8296(local180 - 1);
							Static265.anIntArray251[local89] -= local190.anInt8523;
							Static137.anIntArray138[local89] -= local190.anInt8527;
							Static291.anIntArray290[local89] -= local190.anInt8525;
							Static587.anIntArray548[local89] -= local190.anInt8528;
							local160 = Static236.anIntArray213[local89]--;
						}
					}
				}
				if (local85 >= 0) {
					local95 = 0;
					local114 = 0;
					local180 = 0;
					@Pc(248) int local248 = 0;
					@Pc(250) int local250 = 0;
					for (@Pc(252) int local252 = -5; local252 < this.anInt4639; local252++) {
						@Pc(258) int local258 = local252 + 5;
						if (local258 < this.anInt4639) {
							local180 += Static291.anIntArray290[local258];
							local250 += Static236.anIntArray213[local258];
							local248 += Static587.anIntArray548[local258];
							local114 += Static137.anIntArray138[local258];
							local95 += Static265.anIntArray251[local258];
						}
						@Pc(300) int local300 = local252 - 5;
						if (local300 >= 0) {
							local250 -= Static236.anIntArray213[local300];
							local114 -= Static137.anIntArray138[local300];
							local95 -= Static265.anIntArray251[local300];
							local248 -= Static587.anIntArray548[local300];
							local180 -= Static291.anIntArray290[local300];
						}
						if (local252 >= 0 && local248 > 0 && local250 > 0) {
							local50[local85][local252] = Static193.method3364(local114 / local250, local180 / local250, local95 * 256 / local248);
						}
					}
				}
			}
			if (Static44.aBoolean32) {
				this.method4067(Static499.aClass83Array3[local52], local52 == 0 ? arg0 : null, local52, arg1, local50, local52 == 0 ? arg2 : null);
			} else {
				this.method4062(local52, local52 == 0 ? arg0 : null, arg1, local50, Static499.aClass83Array3[local52], local52 == 0 ? arg2 : null);
			}
			this.aByteArrayArrayArray14[local52] = null;
			this.aByteArrayArrayArray13[local52] = null;
			this.aByteArrayArrayArray11[local52] = null;
			this.aByteArrayArrayArray10[local52] = null;
		}
		if (!this.aBoolean331) {
			if (Static332.anInt6371 != 0) {
				Static337.method5507();
			}
			if (Static155.aBoolean280) {
				Static12.method176();
			}
		}
		for (local56 = 0; local56 < this.anInt4634; local56++) {
			Static499.aClass83Array3[local56].BA();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIZIIIILclient!un;III)V")
	private void method4065(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class4_Sub11 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == 1) {
			arg5 = 1;
		} else if (arg0 == 2) {
			arg2 = 1;
			arg5 = 1;
		} else if (arg0 == 3) {
			arg2 = 1;
		}
		@Pc(52) int local52;
		if (arg8 < 0 || this.anInt4632 <= arg8 || arg3 < 0 || this.anInt4639 <= arg3) {
			while (true) {
				local52 = arg6.method4905();
				if (local52 == 0) {
					break;
				}
				if (local52 == 1) {
					arg6.method4905();
					break;
				}
				if (local52 <= 49) {
					arg6.method4905();
				}
			}
			return;
		}
		if (!this.aBoolean331 && !arg1) {
			Static262.aByteArrayArrayArray16[arg9][arg8][arg3] = 0;
		}
		while (true) {
			local52 = arg6.method4905();
			if (local52 == 0) {
				if (this.aBoolean331) {
					this.anIntArrayArrayArray12[0][arg2 + arg8][arg3 + arg5] = 0;
				} else if (arg9 == 0) {
					this.anIntArrayArrayArray12[0][arg2 + arg8][arg5 + arg3] = -Static480.method8257(arg4 + 556238, 932731 - -arg7) * 8 << 2;
				} else {
					this.anIntArrayArrayArray12[arg9][arg2 + arg8][arg5 + arg3] = this.anIntArrayArrayArray12[arg9 - 1][arg2 + arg8][arg5 + arg3] - 960;
				}
				break;
			}
			if (local52 == 1) {
				@Pc(187) int local187 = arg6.method4905();
				if (this.aBoolean331) {
					this.anIntArrayArrayArray12[0][arg8 + arg2][arg5 + arg3] = local187 * 8 << 2;
				} else {
					if (local187 == 1) {
						local187 = 0;
					}
					if (arg9 == 0) {
						this.anIntArrayArrayArray12[0][arg2 + arg8][arg3 + arg5] = -local187 * 8 << 2;
					} else {
						this.anIntArrayArrayArray12[arg9][arg8 + arg2][arg5 + arg3] = this.anIntArrayArrayArray12[arg9 - 1][arg2 + arg8][arg5 + arg3] - (local187 * 8 << 2);
					}
				}
				break;
			}
			if (local52 <= 49) {
				if (arg1) {
					arg6.method4905();
				} else {
					this.aByteArrayArrayArray13[arg9][arg8][arg3] = arg6.method4925();
					this.aByteArrayArrayArray11[arg9][arg8][arg3] = (byte) ((local52 - 2) / 4);
					this.aByteArrayArrayArray10[arg9][arg8][arg3] = (byte) (local52 + arg0 - 2 & 0x3);
				}
			} else if (local52 <= 81) {
				if (!this.aBoolean331 && !arg1) {
					Static262.aByteArrayArrayArray16[arg9][arg8][arg3] = (byte) (local52 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray14[arg9][arg8][arg3] = (byte) (local52 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!i;ILclient!i;ILclient!r;[[ILclient!i;)V")
	private void method4067(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class44 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class83 arg5) {
		@Pc(14) byte[][] local14 = this.aByteArrayArrayArray11[arg2];
		@Pc(19) byte[][] local19 = this.aByteArrayArrayArray10[arg2];
		@Pc(24) byte[][] local24 = this.aByteArrayArrayArray14[arg2];
		@Pc(29) byte[][] local29 = this.aByteArrayArrayArray13[arg2];
		for (@Pc(31) int local31 = 0; local31 < this.anInt4632; local31++) {
			@Pc(49) int local49 = this.anInt4632 - 1 <= local31 ? local31 : local31 + 1;
			for (@Pc(51) int local51 = 0; local51 < this.anInt4639; local51++) {
				@Pc(65) int local65 = local51 < this.anInt4639 - 1 ? local51 + 1 : local51;
				if (Static574.anInt10049 == -1 || Static560.method8056(local31, Static574.anInt10049, arg2, local51)) {
					@Pc(81) boolean local81 = false;
					@Pc(83) boolean local83 = false;
					@Pc(86) boolean[] local86 = new boolean[4];
					@Pc(92) int local92 = local14[local31][local51];
					@Pc(98) int local98 = local19[local31][local51];
					@Pc(106) int local106 = local29[local31][local51] & 0xFF;
					@Pc(114) int local114 = local24[local31][local51] & 0xFF;
					@Pc(122) int local122 = local24[local31][local65] & 0xFF;
					@Pc(130) int local130 = local24[local49][local65] & 0xFF;
					@Pc(138) int local138 = local24[local49][local51] & 0xFF;
					if (local106 != 0 || local114 != 0) {
						@Pc(154) Class274 local154 = local106 == 0 ? null : this.aClass189_6.method4520(local106 - 1);
						if (local92 == 0 && local154 == null) {
							local92 = 12;
						}
						@Pc(172) Class292 local172 = local114 == 0 ? null : this.aClass360_4.method8296(local114 - 1);
						@Pc(174) Class274 local174 = local154;
						if (local154 != null) {
							if (local154.anInt8101 == -1 && local154.anInt8109 == -1) {
								local174 = local154;
								local154 = null;
							} else if (local172 != null && local92 != 0) {
								local83 = local154.aBoolean561;
							}
						}
						@Pc(246) int local246;
						@Pc(318) int local318;
						@Pc(367) int local367;
						@Pc(376) int local376;
						if ((local92 == 0 || local92 == 12) && local31 > 0 && local51 > 0 && local31 < this.anInt4632 && local51 < this.anInt4639) {
							local246 = local114 == local24[local31 - 1][local51 - 1] ? 1 : -1;
							@Pc(265) int local265 = local24[local49][local51 - 1] == local114 ? 1 : -1;
							@Pc(284) int local284 = local24[local49][local65] == local114 ? 1 : -1;
							if (local24[local31][local51 - 1] == local114) {
								local265++;
								local246++;
							} else {
								local246--;
								local265--;
							}
							local318 = local114 == local24[local31 - 1][local65] ? 1 : -1;
							if (local114 == local24[local49][local51]) {
								local284++;
								local265++;
							} else {
								local265--;
								local284--;
							}
							if (local24[local31][local65] == local114) {
								local318++;
								local284++;
							} else {
								local318--;
								local284--;
							}
							if (local24[local31 - 1][local51] == local114) {
								local246++;
								local318++;
							} else {
								local246--;
								local318--;
							}
							local367 = local246 - local284;
							if (local367 < 0) {
								local367 = -local367;
							}
							local376 = local265 - local318;
							if (local376 < 0) {
								local376 = -local376;
							}
							if (local376 == local367) {
								local367 = arg0.method7217(local51, local31) - arg0.method7217(local65, local49);
								if (local367 < 0) {
									local367 = -local367;
								}
								local376 = arg0.method7217(local51, local49) - arg0.method7217(local65, local31);
								if (local376 < 0) {
									local376 = -local376;
								}
							}
							local98 = local376 <= local367 ? 0 : 1;
						}
						for (local246 = 0; local246 < 13; local246++) {
							Static104.anIntArray101[local246] = -1;
							Static262.anIntArray250[local246] = 1;
						}
						@Pc(464) boolean[] local464 = local154 != null && local154.aBoolean561 ? Static177.aBooleanArrayArray15[local92] : Static595.aBooleanArrayArray17[local92];
						this.method4055(local154, arg3, local31, this.anInt4639, local19, local92, local98, local86, local29, local172, local14, this.anInt4632, local51);
						@Pc(493) boolean local493 = local154 != null && local154.anInt8101 != local154.anInt8109;
						if (!local493) {
							for (local318 = 0; local318 < 8; local318++) {
								if (Static104.anIntArray101[local318] >= 0 && Static497.anIntArray484[local318] != Static125.anIntArray129[local318]) {
									local493 = true;
									break;
								}
							}
						}
						if (!local464[local98 + 1 & 0x3]) {
							local86[1] = Static303.method5189(local86[1], (Static262.anIntArray250[2] & Static262.anIntArray250[4]) == 0);
						}
						if (!local464[local98 + 3 & 0x3]) {
							local86[3] = Static303.method5189(local86[3], (Static262.anIntArray250[6] & Static262.anIntArray250[0]) == 0);
						}
						if (!local464[--local98 & 0x3]) {
							local86[0] = Static303.method5189(local86[0], (Static262.anIntArray250[2] & Static262.anIntArray250[0]) == 0);
						}
						if (!local464[local98 + 2 & 0x3]) {
							local86[2] = Static303.method5189(local86[2], (Static262.anIntArray250[6] & Static262.anIntArray250[4]) == 0);
						}
						if (!local83 && (local92 == 0 || local92 == 12)) {
							if (local86[0] && !local86[1] && !local86[2] && local86[3]) {
								local92 = local92 == 0 ? 13 : 14;
								local86[0] = local86[3] = false;
								local98 = 0;
							} else if (local86[0] && local86[1] && !local86[2] && !local86[3]) {
								local86[0] = local86[1] = false;
								local98 = 3;
								local92 = local92 == 0 ? 13 : 14;
							} else if (!local86[0] && local86[1] && local86[2] && !local86[3]) {
								local86[1] = local86[2] = false;
								local98 = 2;
								local92 = local92 == 0 ? 13 : 14;
							} else if (!local86[0] && !local86[1] && local86[2] && local86[3]) {
								local86[2] = local86[3] = false;
								local98 = 1;
								local92 = local92 == 0 ? 13 : 14;
							}
						}
						@Pc(803) boolean local803 = !local83 && !local86[0] && !local86[2] && !local86[1] && !local86[3];
						@Pc(805) int[] local805 = null;
						@Pc(841) int[] local841;
						@Pc(821) int[] local821;
						@Pc(833) int[] local833;
						if (local803) {
							local841 = Static394.anIntArrayArray42[local92];
							local821 = Static70.anIntArrayArray9[local92];
							local367 = local172 == null ? 0 : Static339.anIntArray334[local92];
							local833 = Static52.anIntArrayArray7[local92];
							local376 = local154 == null ? 0 : Static398.anIntArray387[local92];
						} else if (local83) {
							local376 = local154 == null ? 0 : Static578.anIntArray542[local92];
							local821 = Static543.anIntArrayArray57[local92];
							local367 = local172 == null ? 0 : Static559.anIntArray528[local92];
							local833 = Static472.anIntArrayArray51[local92];
							local805 = Static92.anIntArrayArray13[local92];
							local841 = Static482.anIntArrayArray53[local92];
						} else {
							local841 = Static8.anIntArrayArray1[local92];
							local376 = local154 == null ? 0 : Static351.anIntArray490[local92];
							local805 = Static565.anIntArrayArray58[local92];
							local821 = Static47.anIntArrayArray5[local92];
							local833 = Static8.anIntArrayArray2[local92];
							local367 = local172 == null ? 0 : Static355.anIntArray358[local92];
						}
						@Pc(908) int local908 = local376 + local367;
						if (local908 <= 0) {
							Static74.method1212(arg2, local31, local51);
						} else {
							if (local86[0]) {
								local908++;
							}
							if (local86[2]) {
								local908++;
							}
							if (local86[1]) {
								local908++;
							}
							if (local86[3]) {
								local908++;
							}
							@Pc(941) int local941 = 0;
							@Pc(943) int local943 = 0;
							@Pc(947) int local947 = local908 * 3;
							@Pc(954) int[] local954 = local493 ? new int[local947] : null;
							@Pc(957) int[] local957 = new int[local947];
							@Pc(960) int[] local960 = new int[local947];
							@Pc(963) int[] local963 = new int[local947];
							@Pc(966) int[] local966 = new int[local947];
							@Pc(969) int[] local969 = new int[local947];
							@Pc(976) int[] local976 = arg1 == null ? null : new int[local947];
							@Pc(985) int[] local985 = arg1 == null && arg5 == null ? null : new int[local947];
							@Pc(987) int local987 = -1;
							@Pc(989) int local989 = -1;
							@Pc(991) int local991 = 256;
							@Pc(1122) byte local1122;
							@Pc(1035) int local1035;
							@Pc(1037) int local1037;
							@Pc(1273) int local1273;
							@Pc(1279) int local1279;
							@Pc(1287) int local1287;
							@Pc(1292) int local1292;
							@Pc(1302) int local1302;
							@Pc(1297) int local1297;
							@Pc(1306) int local1306;
							@Pc(1361) int local1361;
							@Pc(1367) int local1367;
							if (local154 != null) {
								local989 = local154.anInt8106;
								local991 = local154.anInt8111;
								local987 = local154.anInt8101;
								local1035 = Static416.method6528(local154, arg3);
								for (local1037 = 0; local1037 < local376; local1037++) {
									if (local86[-local98 & 0x3] && local805[0] == local941) {
										Static251.anIntArray233[0] = local841[local941];
										Static251.anIntArray233[1] = 1;
										Static251.anIntArray233[2] = local833[local941];
										Static251.anIntArray233[3] = 1;
										Static251.anIntArray233[4] = local821[local941];
										local1122 = 6;
										Static251.anIntArray233[5] = local833[local941];
									} else if (local86[2 - local98 & 0x3] && local941 == local805[2]) {
										Static251.anIntArray233[0] = local841[local941];
										Static251.anIntArray233[1] = 5;
										Static251.anIntArray233[2] = local833[local941];
										Static251.anIntArray233[3] = 5;
										Static251.anIntArray233[4] = local821[local941];
										local1122 = 6;
										Static251.anIntArray233[5] = local833[local941];
									} else if (local86[1 - local98 & 0x3] && local941 == local805[1]) {
										Static251.anIntArray233[0] = local841[local941];
										Static251.anIntArray233[1] = 3;
										Static251.anIntArray233[2] = local833[local941];
										Static251.anIntArray233[3] = 3;
										Static251.anIntArray233[4] = local821[local941];
										Static251.anIntArray233[5] = local833[local941];
										local1122 = 6;
									} else if (local86[3 - local98 & 0x3] && local941 == local805[3]) {
										Static251.anIntArray233[0] = local841[local941];
										Static251.anIntArray233[1] = 7;
										Static251.anIntArray233[2] = local833[local941];
										Static251.anIntArray233[3] = 7;
										Static251.anIntArray233[4] = local821[local941];
										local1122 = 6;
										Static251.anIntArray233[5] = local833[local941];
									} else {
										Static251.anIntArray233[0] = local841[local941];
										Static251.anIntArray233[1] = local821[local941];
										local1122 = 3;
										Static251.anIntArray233[2] = local833[local941];
									}
									local941++;
									for (local1273 = 0; local1273 < local1122; local1273++) {
										local1279 = Static251.anIntArray233[local1273];
										local1287 = local1279 - local98 * 2 & 0x7;
										local1292 = this.anIntArray238[local1279];
										local1297 = this.anIntArray237[local1279];
										if (local98 == 1) {
											local1302 = local1297;
											local1306 = 512 - local1292;
										} else if (local98 == 2) {
											local1306 = 512 - local1297;
											local1302 = 512 - local1292;
										} else if (local98 == 3) {
											local1302 = 512 - local1297;
											local1306 = local1292;
										} else {
											local1306 = local1297;
											local1302 = local1292;
										}
										local957[local943] = local1302;
										local960[local943] = local1306;
										if (local976 != null && Static356.aBooleanArrayArray9[local92][local1279]) {
											local1361 = local1302 + (local31 << 9);
											local1367 = local1306 + (local51 << 9);
											local976[local943] = arg1.method7213(local1361, local1367) - arg0.method7213(local1361, local1367);
										}
										if (local985 != null) {
											if (arg1 != null && !Static356.aBooleanArrayArray9[local92][local1279]) {
												local1361 = local1302 + (local31 << 9);
												local1367 = (local51 << 9) + local1306;
												local985[local943] = arg0.method7213(local1361, local1367) - arg1.method7213(local1361, local1367);
											} else if (arg5 != null && !Static485.aBooleanArrayArray14[local92][local1279]) {
												local1361 = local1302 + (local31 << 9);
												local1367 = local1306 + (local51 << 9);
												local985[local943] = arg5.method7213(local1361, local1367) - arg0.method7213(local1361, local1367);
											}
										}
										if (local1279 < 8 && Static104.anIntArray101[local1287] > local154.anInt8108) {
											if (local954 != null) {
												local954[local943] = Static125.anIntArray129[local1287];
											}
											local969[local943] = Static374.anIntArray367[local1287];
											local966[local943] = Static299.anIntArray295[local1287];
											local963[local943] = Static497.anIntArray484[local1287];
										} else {
											if (local954 != null) {
												local954[local943] = local1035;
											}
											local966[local943] = local154.anInt8106;
											local969[local943] = local154.anInt8111;
											local963[local943] = local987;
										}
										local943++;
									}
								}
								if (!this.aBoolean331 && arg2 == 0) {
									Static126.method2601(local31, local51, local154.anInt8102, local154.anInt8098 * 8, local154.anInt8110);
								}
								if (local92 != 12 && local154.anInt8101 != -1 && local154.aBoolean560) {
									local81 = true;
								}
							} else if (local803) {
								local941 = Static398.anIntArray387[local92];
							} else if (local83) {
								local941 = Static578.anIntArray542[local92];
							} else {
								local941 = Static351.anIntArray490[local92];
							}
							if (local172 != null) {
								if (local138 == 0) {
									local138 = local114;
								}
								if (local130 == 0) {
									local130 = local114;
								}
								if (local122 == 0) {
									local122 = local114;
								}
								@Pc(1590) Class292 local1590 = this.aClass360_4.method8296(local114 - 1);
								@Pc(1598) Class292 local1598 = this.aClass360_4.method8296(local122 - 1);
								@Pc(1606) Class292 local1606 = this.aClass360_4.method8296(local130 - 1);
								@Pc(1614) Class292 local1614 = this.aClass360_4.method8296(local138 - 1);
								for (local1287 = 0; local1287 < local367; local1287++) {
									if (local86[-local98 & 0x3] && local805[0] == local941) {
										Static251.anIntArray233[0] = local841[local941];
										Static251.anIntArray233[1] = 1;
										Static251.anIntArray233[2] = local833[local941];
										Static251.anIntArray233[3] = 1;
										Static251.anIntArray233[4] = local821[local941];
										Static251.anIntArray233[5] = local833[local941];
										local1122 = 6;
									} else if (local86[2 - local98 & 0x3] && local805[2] == local941) {
										Static251.anIntArray233[0] = local841[local941];
										Static251.anIntArray233[1] = 5;
										Static251.anIntArray233[2] = local833[local941];
										Static251.anIntArray233[3] = 5;
										Static251.anIntArray233[4] = local821[local941];
										Static251.anIntArray233[5] = local833[local941];
										local1122 = 6;
									} else if (local86[1 - local98 & 0x3] && local941 == local805[1]) {
										Static251.anIntArray233[0] = local841[local941];
										Static251.anIntArray233[1] = 3;
										Static251.anIntArray233[2] = local833[local941];
										Static251.anIntArray233[3] = 3;
										Static251.anIntArray233[4] = local821[local941];
										Static251.anIntArray233[5] = local833[local941];
										local1122 = 6;
									} else if (local86[3 - local98 & 0x3] && local941 == local805[3]) {
										Static251.anIntArray233[0] = local841[local941];
										Static251.anIntArray233[1] = 7;
										Static251.anIntArray233[2] = local833[local941];
										Static251.anIntArray233[3] = 7;
										Static251.anIntArray233[4] = local821[local941];
										Static251.anIntArray233[5] = local833[local941];
										local1122 = 6;
									} else {
										Static251.anIntArray233[0] = local841[local941];
										Static251.anIntArray233[1] = local821[local941];
										Static251.anIntArray233[2] = local833[local941];
										local1122 = 3;
									}
									local941++;
									for (local1292 = 0; local1292 < local1122; local1292++) {
										local1302 = Static251.anIntArray233[local1292];
										local1297 = local1302 - local98 * 2 & 0x7;
										local1306 = this.anIntArray238[local1302];
										local1367 = this.anIntArray237[local1302];
										@Pc(1883) int local1883;
										if (local98 == 1) {
											local1883 = 512 - local1306;
											local1361 = local1367;
										} else if (local98 == 2) {
											local1361 = 512 - local1306;
											local1883 = 512 - local1367;
										} else if (local98 == 3) {
											local1883 = local1306;
											local1361 = 512 - local1367;
										} else {
											local1883 = local1367;
											local1361 = local1306;
										}
										local957[local943] = local1361;
										local960[local943] = local1883;
										@Pc(1937) int local1937;
										@Pc(1943) int local1943;
										if (local976 != null && Static356.aBooleanArrayArray9[local92][local1302]) {
											local1937 = local1361 + (local31 << 9);
											local1943 = local1883 + (local51 << 9);
											local976[local943] = arg1.method7213(local1937, local1943) - arg0.method7213(local1937, local1943);
										}
										if (local985 != null) {
											if (arg1 != null && !Static356.aBooleanArrayArray9[local92][local1302]) {
												local1937 = (local31 << 9) + local1361;
												local1943 = local1883 + (local51 << 9);
												local985[local943] = arg0.method7213(local1937, local1943) - arg1.method7213(local1937, local1943);
											} else if (arg5 != null && !Static485.aBooleanArrayArray14[local92][local1302]) {
												local1937 = local1361 + (local31 << 9);
												local1943 = (local51 << 9) + local1883;
												local985[local943] = arg5.method7213(local1937, local1943) - arg0.method7213(local1937, local1943);
											}
										}
										if (local1302 < 8 && Static104.anIntArray101[local1297] >= 0) {
											if (local954 != null) {
												local954[local943] = Static125.anIntArray129[local1297];
											}
											local969[local943] = Static374.anIntArray367[local1297];
											local966[local943] = Static299.anIntArray295[local1297];
											local963[local943] = Static497.anIntArray484[local1297];
										} else {
											if (local83 && Static356.aBooleanArrayArray9[local92][local1302]) {
												local966[local943] = local989;
												local969[local943] = local991;
												local963[local943] = local987;
											} else if (local1361 == 0 && local1883 == 0) {
												local963[local943] = arg4[local31][local51];
												local966[local943] = local1590.anInt8524;
												local969[local943] = local1590.anInt8521;
											} else if (local1361 == 0 && local1883 == 512) {
												local963[local943] = arg4[local31][local65];
												local966[local943] = local1598.anInt8524;
												local969[local943] = local1598.anInt8521;
											} else if (local1361 == 512 && local1883 == 512) {
												local963[local943] = arg4[local49][local65];
												local966[local943] = local1606.anInt8524;
												local969[local943] = local1606.anInt8521;
											} else if (local1361 == 512 && local1883 == 0) {
												local963[local943] = arg4[local49][local51];
												local966[local943] = local1614.anInt8524;
												local969[local943] = local1614.anInt8521;
											} else {
												if (local1361 >= 256) {
													if (local1883 >= 256) {
														local966[local943] = local1606.anInt8524;
														local969[local943] = local1606.anInt8521;
													} else {
														local966[local943] = local1614.anInt8524;
														local969[local943] = local1614.anInt8521;
													}
												} else if (local1883 < 256) {
													local966[local943] = local1590.anInt8524;
													local969[local943] = local1590.anInt8521;
												} else {
													local966[local943] = local1598.anInt8524;
													local969[local943] = local1598.anInt8521;
												}
												local1937 = Static174.method3174(local1361 << 7 >> 9, arg4[local31][local51], arg4[local49][local51]);
												local1943 = Static174.method3174(local1361 << 7 >> 9, arg4[local31][local65], arg4[local49][local65]);
												local963[local943] = Static174.method3174(local1883 << 7 >> 9, local1937, local1943);
											}
											if (local954 != null) {
												local954[local943] = local963[local943];
											}
										}
										local943++;
									}
								}
								if (local92 != 0 && local172.aBoolean604) {
									local81 = true;
								}
							}
							local1035 = arg0.method7217(local51, local31);
							local1037 = arg0.method7217(local51, local49);
							local1273 = arg0.method7217(local65, local49);
							local1279 = arg0.method7217(local65, local31);
							@Pc(2377) boolean local2377 = Static310.method5267(local31, local51);
							if (local2377 && arg2 > 1 || !local2377 && arg2 > 0) {
								@Pc(2393) boolean local2393 = true;
								if (local172 != null && !local172.aBoolean603) {
									local2393 = false;
								} else if (local114 == 0 && local92 != 0) {
									local2393 = false;
								} else if (local106 > 0 && local174 != null && !local174.aBoolean562) {
									local2393 = false;
								}
								if (local2393 && local1037 == local1035 && local1273 == local1035 && local1035 == local1279) {
									this.aByteArrayArrayArray15[arg2][local31][local51] = (byte) (this.aByteArrayArrayArray15[arg2][local31][local51] | 0x4);
								}
							}
							local1292 = 0;
							local1302 = 0;
							local1297 = 0;
							if (this.aBoolean331) {
								local1292 = Static258.method4158(local31, local51);
								local1302 = Static159.method2941(local31, local51);
								local1297 = Static171.method3122(local31, local51);
							}
							arg0.O(local31, local51, local957, local976, local960, local985, local963, local954, local966, local969, local1292, local1302, local1297, local81);
							Static74.method1212(arg2, local31, local51);
						}
					}
				}
			}
		}
	}
}
