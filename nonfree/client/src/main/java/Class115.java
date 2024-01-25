import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public class Class115 {

	@OriginalMember(owner = "client!rfa", name = "n", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "[I")
	private final int[] anIntArray204 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!rfa", name = "B", descriptor = "[I")
	private final int[] anIntArray205 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!rfa", name = "u", descriptor = "Lclient!hba;")
	private final Class126 aClass126_2;

	@OriginalMember(owner = "client!rfa", name = "z", descriptor = "Z")
	public final boolean aBoolean249;

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
	public final int anInt3545;

	@OriginalMember(owner = "client!rfa", name = "v", descriptor = "I")
	protected final int anInt3553;

	@OriginalMember(owner = "client!rfa", name = "l", descriptor = "Lclient!mga;")
	private final Class206 aClass206_2;

	@OriginalMember(owner = "client!rfa", name = "s", descriptor = "I")
	protected final int anInt3551;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!rfa", name = "x", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!rfa", name = "r", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!rfa", name = "C", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!rfa", name = "A", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(IIIZLclient!mga;Lclient!hba;)V")
	protected Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) Class126 arg5) {
		this.aClass126_2 = arg5;
		this.aBoolean249 = arg3;
		this.anInt3545 = arg0;
		this.anInt3553 = arg2;
		this.aClass206_2 = arg4;
		this.anInt3551 = arg1;
		this.aByteArrayArrayArray11 = new byte[this.anInt3545][this.anInt3551][this.anInt3553];
		this.aByteArrayArrayArray14 = new byte[this.anInt3545][this.anInt3551][this.anInt3553];
		this.anIntArrayArrayArray5 = new int[this.anInt3545][this.anInt3551 + 1][this.anInt3553 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt3545][this.anInt3551 + 1][this.anInt3553 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt3545][this.anInt3551][this.anInt3553];
		this.aByteArrayArrayArray15 = new byte[this.anInt3545][this.anInt3551][this.anInt3553];
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIII[Lclient!ld;IILclient!ji;)V")
	public final void method3141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class189[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class6_Sub21 arg8) {
		@Pc(11) int local11 = (arg0 & 0x7) * 8;
		@Pc(17) int local17 = (arg6 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean249) {
			@Pc(24) Class189 local24 = arg5[arg7];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static110.method1959(local26 & 0x7, arg4, local30 & 0x7) + arg3;
					local56 = Static496.method6749(local26 & 0x7, local30 & 0x7, arg4) + arg2;
					if (local44 > 0 && local44 < this.anInt3551 - 1 && local56 > 0 && local56 < this.anInt3553 - 1) {
						local24.method4595(local44, local56);
					}
				}
			}
		}
		@Pc(113) int local113 = (arg0 & 0x1FFFFFF8) << 3;
		local26 = (arg6 & 0xFFFFFFF8) << 3;
		@Pc(121) byte local121 = 0;
		@Pc(123) byte local123 = 0;
		if (arg4 == 1) {
			local123 = 1;
		} else if (arg4 == 2) {
			local123 = 1;
			local121 = 1;
		} else if (arg4 == 3) {
			local121 = 1;
		}
		for (local56 = 0; local56 < this.anInt3545; local56++) {
			for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
				for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
					if (local56 == arg1 && local11 <= local152 && local11 + 8 >= local152 && local156 >= local17 && local156 <= local17 + 8) {
						@Pc(211) int local211;
						@Pc(223) int local223;
						if (local152 == local11 + 8 || local156 == local17 + 8) {
							if (arg4 == 0) {
								local211 = arg3 + local152 - local11;
								local223 = local156 + arg2 - local17;
							} else if (arg4 == 1) {
								local223 = arg2 + local11 + 8 - local152;
								local211 = local156 + arg3 - local17;
							} else if (arg4 == 2) {
								local211 = arg3 + local11 + 8 - local152;
								local223 = local17 + arg2 + 8 - local156;
							} else {
								local223 = arg2 + local152 - local11;
								local211 = local17 + arg3 + 8 - local156;
							}
							this.method3151(0, 0, arg7, local156 + local26, true, local211, 0, local223, local152 + local113, arg8);
						} else {
							local211 = Static110.method1959(local152 & 0x7, arg4, local156 & 0x7) + arg3;
							local223 = arg2 + Static496.method6749(local152 & 0x7, local156 & 0x7, arg4);
							this.method3151(local123, arg4, arg7, local156 + local26, false, local211, local121, local223, local113 + local152, arg8);
						}
						if (local152 == 63 || local156 == 63) {
							@Pc(353) byte local353 = 1;
							if (local152 == 63 && local156 == 63) {
								local353 = 3;
							}
							for (@Pc(365) int local365 = 0; local365 < local353; local365++) {
								@Pc(369) int local369 = local152;
								@Pc(371) int local371 = local156;
								if (local365 == 0) {
									local371 = local156 == 63 ? 64 : local156;
									local369 = local152 == 63 ? 64 : local152;
								} else if (local365 == 1) {
									local369 = 64;
								} else if (local365 == 2) {
									local371 = 64;
								}
								@Pc(421) int local421;
								@Pc(414) int local414;
								if (arg4 == 0) {
									local414 = local371 + arg2 - local17;
									local421 = arg3 + local369 - local11;
								} else if (arg4 == 1) {
									local421 = arg3 + local371 - local17;
									local414 = local11 + arg2 + 8 - local369;
								} else if (arg4 == 2) {
									local421 = arg3 + local11 + 8 - local369;
									local414 = local17 + arg2 + 8 - local371;
								} else {
									local421 = arg3 + local17 + 8 - local371;
									local414 = local369 + arg2 - local11;
								}
								if (local421 >= 0 && local421 < this.anInt3551 && local414 >= 0 && local414 < this.anInt3553) {
									this.anIntArrayArrayArray5[arg7][local421][local414] = this.anIntArrayArrayArray5[arg7][local121 + local211][local223 + local123];
								}
							}
						}
					} else {
						this.method3151(0, 0, 0, 0, false, -1, 0, -1, 0, arg8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!jl;Lclient!oa;[[B[[BII[ZBIIILclient!vi;[[BI)V")
	private void method3142(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class345 arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg10 != null && arg10.aBoolean717 ? Static149.aBooleanArrayArray1[arg5] : Static265.aBooleanArrayArray3[arg5];
		@Pc(37) int local37;
		@Pc(47) Class345 local47;
		@Pc(64) byte local64;
		@Pc(80) int local80;
		@Pc(85) int local85;
		if (arg7 > 0) {
			if (arg12 > 0) {
				local37 = arg11[arg12 - 1][arg7 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass206_2.method4893(local37 - 1);
					if (local47.anInt9279 != -1 && local47.aBoolean717) {
						local64 = arg2[arg12 - 1][arg7 - 1];
						local80 = arg3[arg12 - 1][arg7 - 1] * 2 + 4 & 0x7;
						local85 = Static337.method5247(arg1, local47);
						if (Static344.aBooleanArrayArray4[local64][local80]) {
							Static129.anIntArray175[0] = local47.anInt9279;
							Static478.anIntArray598[0] = local85;
							Static176.anIntArray216[0] = arg1.method6876() ? local47.anInt9268 : local47.anInt9269;
							Static419.anIntArray531[0] = local47.anInt9276;
							Static249.anIntArray371[0] = local47.anInt9273;
							Static240.anIntArray364[0] = 256;
						}
					}
				}
			}
			if (arg12 < arg8 - 1) {
				local37 = arg11[arg12 + 1][arg7 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass206_2.method4893(local37 - 1);
					if (local47.anInt9279 != -1 && local47.aBoolean717) {
						local64 = arg2[arg12 + 1][arg7 - 1];
						local80 = arg3[arg12 + 1][arg7 - 1] * 2 + 6 & 0x7;
						local85 = Static337.method5247(arg1, local47);
						if (Static344.aBooleanArrayArray4[local64][local80]) {
							Static129.anIntArray175[2] = local47.anInt9279;
							Static478.anIntArray598[2] = local85;
							Static176.anIntArray216[2] = arg1.method6876() ? local47.anInt9268 : local47.anInt9269;
							Static419.anIntArray531[2] = local47.anInt9276;
							Static249.anIntArray371[2] = local47.anInt9273;
							Static240.anIntArray364[2] = 512;
						}
					}
				}
			}
		}
		if (arg7 < arg4 - 1) {
			if (arg12 > 0) {
				local37 = arg11[arg12 - 1][arg7 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass206_2.method4893(local37 - 1);
					if (local47.anInt9279 != -1 && local47.aBoolean717) {
						local64 = arg2[arg12 - 1][arg7 + 1];
						local80 = arg3[arg12 - 1][arg7 + 1] * 2 + 2 & 0x7;
						local85 = Static337.method5247(arg1, local47);
						if (Static344.aBooleanArrayArray4[local64][local80]) {
							Static129.anIntArray175[6] = local47.anInt9279;
							Static478.anIntArray598[6] = local85;
							Static176.anIntArray216[6] = arg1.method6876() ? local47.anInt9268 : local47.anInt9269;
							Static419.anIntArray531[6] = local47.anInt9276;
							Static249.anIntArray371[6] = local47.anInt9273;
							Static240.anIntArray364[6] = 64;
						}
					}
				}
			}
			if (arg12 < arg8 - 1) {
				local37 = arg11[arg12 + 1][arg7 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass206_2.method4893(local37 - 1);
					if (local47.anInt9279 != -1 && local47.aBoolean717) {
						local64 = arg2[arg12 + 1][arg7 + 1];
						local80 = arg3[arg12 + 1][arg7 + 1] * 2 & 0x7;
						local85 = Static337.method5247(arg1, local47);
						if (Static344.aBooleanArrayArray4[local64][local80]) {
							Static129.anIntArray175[4] = local47.anInt9279;
							Static478.anIntArray598[4] = local85;
							Static176.anIntArray216[4] = arg1.method6876() ? local47.anInt9268 : local47.anInt9269;
							Static419.anIntArray531[4] = local47.anInt9276;
							Static249.anIntArray371[4] = local47.anInt9273;
							Static240.anIntArray364[4] = 128;
						}
					}
				}
			}
		}
		@Pc(529) int local529;
		@Pc(535) int local535;
		@Pc(540) int local540;
		@Pc(542) int local542;
		@Pc(472) int local472;
		@Pc(482) Class345 local482;
		@Pc(495) byte local495;
		@Pc(503) byte local503;
		if (arg7 > 0) {
			local472 = arg11[arg12][arg7 - 1] & 0xFF;
			if (local472 > 0) {
				local482 = this.aClass206_2.method4893(local472 - 1);
				if (local482.anInt9279 != -1) {
					local495 = arg2[arg12][arg7 - 1];
					local503 = arg3[arg12][arg7 - 1];
					if (local482.aBoolean717) {
						local529 = 2;
						local535 = local503 * 2 + 4;
						local540 = Static337.method5247(arg1, local482);
						for (local542 = 0; local542 < 3; local542++) {
							local535 &= 0x7;
							local529 &= 0x7;
							if (Static344.aBooleanArrayArray4[local495][local535] && local482.anInt9273 >= Static249.anIntArray371[local529]) {
								Static129.anIntArray175[local529] = local482.anInt9279;
								Static478.anIntArray598[local529] = local540;
								Static176.anIntArray216[local529] = arg1.method6876() ? local482.anInt9268 : local482.anInt9269;
								Static419.anIntArray531[local529] = local482.anInt9276;
								if (local482.anInt9273 == Static249.anIntArray371[local529]) {
									Static240.anIntArray364[local529] |= 0x20;
								} else {
									Static240.anIntArray364[local529] = 32;
								}
								Static249.anIntArray371[local529] = local482.anInt9273;
							}
							local529--;
							local535++;
						}
						if (!local18[arg9 & 0x3]) {
							arg6[0] = Static149.aBooleanArrayArray1[local495][local503 + 2 & 0x3];
						}
					} else if (!local18[arg9 & 0x3]) {
						arg6[0] = Static265.aBooleanArrayArray3[local495][local503 + 2 & 0x3];
					}
				}
			}
		}
		if (arg7 < arg4 - 1) {
			local472 = arg11[arg12][arg7 + 1] & 0xFF;
			if (local472 > 0) {
				local482 = this.aClass206_2.method4893(local472 - 1);
				if (local482.anInt9279 != -1) {
					local495 = arg2[arg12][arg7 + 1];
					local503 = arg3[arg12][arg7 + 1];
					if (local482.aBoolean717) {
						local529 = 4;
						local535 = local503 * 2 + 2;
						local540 = Static337.method5247(arg1, local482);
						for (local542 = 0; local542 < 3; local542++) {
							local535 &= 0x7;
							local529 &= 0x7;
							if (Static344.aBooleanArrayArray4[local495][local535] && Static249.anIntArray371[local529] <= local482.anInt9273) {
								Static129.anIntArray175[local529] = local482.anInt9279;
								Static478.anIntArray598[local529] = local540;
								Static176.anIntArray216[local529] = arg1.method6876() ? local482.anInt9268 : local482.anInt9269;
								Static419.anIntArray531[local529] = local482.anInt9276;
								if (Static249.anIntArray371[local529] == local482.anInt9273) {
									Static240.anIntArray364[local529] |= 0x10;
								} else {
									Static240.anIntArray364[local529] = 16;
								}
								Static249.anIntArray371[local529] = local482.anInt9273;
							}
							local535--;
							local529++;
						}
						if (!local18[arg9 + 2 & 0x3]) {
							arg6[2] = Static149.aBooleanArrayArray1[local495][local503 & 0x3];
						}
					} else if (!local18[arg9 + 2 & 0x3]) {
						arg6[2] = Static265.aBooleanArrayArray3[local495][local503 & 0x3];
					}
				}
			}
		}
		if (arg12 > 0) {
			local472 = arg11[arg12 - 1][arg7] & 0xFF;
			if (local472 > 0) {
				local482 = this.aClass206_2.method4893(local472 - 1);
				if (local482.anInt9279 != -1) {
					local495 = arg2[arg12 - 1][arg7];
					local503 = arg3[arg12 - 1][arg7];
					if (local482.aBoolean717) {
						local529 = 6;
						local535 = local503 * 2 + 4;
						local540 = Static337.method5247(arg1, local482);
						for (local542 = 0; local542 < 3; local542++) {
							local535 &= 0x7;
							local529 &= 0x7;
							if (Static344.aBooleanArrayArray4[local495][local535] && local482.anInt9273 >= Static249.anIntArray371[local529]) {
								Static129.anIntArray175[local529] = local482.anInt9279;
								Static478.anIntArray598[local529] = local540;
								Static176.anIntArray216[local529] = arg1.method6876() ? local482.anInt9268 : local482.anInt9269;
								Static419.anIntArray531[local529] = local482.anInt9276;
								if (local482.anInt9273 == Static249.anIntArray371[local529]) {
									Static240.anIntArray364[local529] |= 0x8;
								} else {
									Static240.anIntArray364[local529] = 8;
								}
								Static249.anIntArray371[local529] = local482.anInt9273;
							}
							local529++;
							local535--;
						}
						if (!local18[arg9 + 3 & 0x3]) {
							arg6[3] = Static149.aBooleanArrayArray1[local495][local503 + 1 & 0x3];
						}
					} else if (!local18[arg9 + 3 & 0x3]) {
						arg6[3] = Static265.aBooleanArrayArray3[local495][local503 + 1 & 0x3];
					}
				}
			}
		}
		if (arg8 - 1 > arg12) {
			local472 = arg11[arg12 + 1][arg7] & 0xFF;
			if (local472 > 0) {
				local482 = this.aClass206_2.method4893(local472 - 1);
				if (local482.anInt9279 != -1) {
					local495 = arg2[arg12 + 1][arg7];
					local503 = arg3[arg12 + 1][arg7];
					if (local482.aBoolean717) {
						local529 = 4;
						local535 = local503 * 2 + 6;
						local540 = Static337.method5247(arg1, local482);
						for (local542 = 0; local542 < 3; local542++) {
							local535 &= 0x7;
							local529 &= 0x7;
							if (Static344.aBooleanArrayArray4[local495][local535] && local482.anInt9273 >= Static249.anIntArray371[local529]) {
								Static129.anIntArray175[local529] = local482.anInt9279;
								Static478.anIntArray598[local529] = local540;
								Static176.anIntArray216[local529] = arg1.method6876() ? local482.anInt9268 : local482.anInt9269;
								Static419.anIntArray531[local529] = local482.anInt9276;
								if (local482.anInt9273 == Static249.anIntArray371[local529]) {
									Static240.anIntArray364[local529] |= 0x4;
								} else {
									Static240.anIntArray364[local529] = 4;
								}
								Static249.anIntArray371[local529] = local482.anInt9273;
							}
							local529--;
							local535++;
						}
						if (!local18[arg9 + 1 & 0x3]) {
							arg6[1] = Static149.aBooleanArrayArray1[local495][local503 + 3 & 0x3];
						}
					} else if (!local18[arg9 + 1 & 0x3]) {
						arg6[1] = Static265.aBooleanArrayArray3[local495][local503 + 3 & 0x3];
					}
				}
			}
		}
		if (arg10 == null) {
			return;
		}
		local472 = Static337.method5247(arg1, arg10);
		if (!arg10.aBoolean717) {
			return;
		}
		for (@Pc(1228) int local1228 = 0; local1228 < 8; local1228++) {
			local80 = local1228 - arg9 * 2 & 0x7;
			if (Static344.aBooleanArrayArray4[arg5][local1228] && arg10.anInt9273 >= Static249.anIntArray371[local80]) {
				Static129.anIntArray175[local80] = arg10.anInt9279;
				Static478.anIntArray598[local80] = local472;
				Static176.anIntArray216[local80] = arg1.method6876() ? arg10.anInt9268 : arg10.anInt9269;
				Static419.anIntArray531[local80] = arg10.anInt9276;
				if (arg10.anInt9273 == Static249.anIntArray371[local80]) {
					Static240.anIntArray364[local80] |= 0x2;
				} else {
					Static240.anIntArray364[local80] = 2;
				}
				Static249.anIntArray371[local80] = arg10.anInt9273;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIII)V")
	public final void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt3545; local9++) {
			this.method3146(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[[II)V")
	public final void method3144(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray5[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt3551 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3553 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIBIILclient!ji;[Lclient!ld;)V")
	public final void method3145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub21 arg4, @OriginalArg(6) Class189[] arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean249) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class189 local16 = arg5[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg3;
						@Pc(32) int local32 = local22 + arg1;
						if (local28 >= 0 && local28 < this.anInt3551 && local32 >= 0 && this.anInt3553 > local32) {
							local16.method4595(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg0 + arg3;
		@Pc(76) int local76 = arg2 + arg1;
		for (local18 = 0; local18 < this.anInt3545; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method3151(0, 0, local18, local76 + local28, false, arg3 + local22, 0, local28 + arg1, local22 + local10, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZIIIII)V")
	private void method3146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg0; local7 < arg0 + 64; local7++) {
			for (local11 = arg2; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && this.anInt3551 > local11 && local7 >= 0 && this.anInt3553 > local7) {
					this.anIntArrayArrayArray5[arg1][local11][local7] = arg1 <= 0 ? 0 : this.anIntArrayArrayArray5[arg1 - 1][local11][local7] - 960;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt3551) {
			for (local11 = arg0 + 1; local11 < arg0 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt3553) {
					this.anIntArrayArrayArray5[arg1][arg2][local11] = this.anIntArrayArrayArray5[arg1][arg2 - 1][local11];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt3553) {
			for (local11 = arg2 + 1; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt3551) {
					this.anIntArrayArrayArray5[arg1][local11][arg0] = this.anIntArrayArrayArray5[arg1][local11][arg0 - 1];
				}
			}
		}
		if (arg2 < 0 || arg0 < 0 || arg2 >= this.anInt3551 || this.anInt3553 <= arg0) {
			return;
		}
		if (arg1 != 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray5[arg1 - 1][arg2 - 1][arg0] != this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0]) {
				this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray5[arg1][arg2][arg0 - 1] != this.anIntArrayArrayArray5[arg1 - 1][arg2][arg0 - 1]) {
				this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2][arg0 - 1];
				return;
			}
			if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1] != this.anIntArrayArrayArray5[arg1 - 1][arg2 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0] != 0) {
			this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray5[arg1][arg2][arg0 - 1] != 0) {
			this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2][arg0 - 1];
			return;
		}
		if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "([[[IB[Lclient!ld;Lclient!oa;)V")
	public final void method3148(@OriginalArg(0) int[][][] arg0, @OriginalArg(2) Class189[] arg1, @OriginalArg(3) Class14 arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean249) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt3551; local14++) {
					for (local18 = 0; local18 < this.anInt3553; local18++) {
						if ((Static154.aByteArrayArrayArray4[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static154.aByteArrayArrayArray4[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg1[local32].method4601(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt3545; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean249) {
				if (Static20.aBoolean44) {
					local14 = 2;
				}
				if (Static461.aBoolean571) {
					local18 = 8;
				}
				if (Static13.anInt7623 != 0) {
					local14 |= 0x1;
					if (Static324.aBoolean522 | local10 == 0) {
						local18 |= 0x10;
					}
				}
			}
			if (Static20.aBoolean44) {
				local18 |= 0x7;
			}
			if (!Static109.aBoolean148) {
				local18 |= 0x20;
			}
			@Pc(169) int[][] local169 = arg0 == null || local10 >= arg0.length ? this.anIntArrayArrayArray5[local10] : arg0[local10];
			Static502.method6785(local10, arg2.method6857(this.anInt3551, this.anInt3553, this.anIntArrayArrayArray5[local10], local169, local14, local18));
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!oa;BLclient!d;Lclient!d;)V")
	public final void method3149(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class59 arg1, @OriginalArg(3) Class59 arg2) {
		if (Static180.anIntArray220 == null || this.anInt3553 != Static180.anIntArray220.length) {
			Static27.anIntArray40 = new int[this.anInt3553];
			Static133.anIntArray179 = new int[this.anInt3553];
			Static461.anIntArray580 = new int[this.anInt3553];
			Static305.anIntArray53 = new int[this.anInt3553];
			Static180.anIntArray220 = new int[this.anInt3553];
		}
		@Pc(54) int[][] local54 = new int[this.anInt3551][this.anInt3553];
		@Pc(60) int local60;
		for (@Pc(56) int local56 = 0; local56 < this.anInt3545; local56++) {
			for (local60 = 0; local60 < this.anInt3553; local60++) {
				Static180.anIntArray220[local60] = 0;
				Static133.anIntArray179[local60] = 0;
				Static305.anIntArray53[local60] = 0;
				Static461.anIntArray580[local60] = 0;
				Static27.anIntArray40[local60] = 0;
			}
			for (@Pc(93) int local93 = -5; local93 < this.anInt3551; local93++) {
				@Pc(103) int local103;
				@Pc(122) int local122;
				@Pc(194) int local194;
				for (@Pc(97) int local97 = 0; local97 < this.anInt3553; local97++) {
					local103 = local93 + 5;
					@Pc(171) int local171;
					if (this.anInt3551 > local103) {
						local122 = this.aByteArrayArrayArray14[local56][local103][local97] & 0xFF;
						if (local122 > 0) {
							@Pc(135) Class158 local135 = this.aClass126_2.method3236(local122 - 1);
							Static180.anIntArray220[local97] += local135.anInt4752;
							Static133.anIntArray179[local97] += local135.anInt4749;
							Static305.anIntArray53[local97] += local135.anInt4746;
							Static461.anIntArray580[local97] += local135.anInt4756;
							local171 = Static27.anIntArray40[local97]++;
						}
					}
					local122 = local93 - 5;
					if (local122 >= 0) {
						local194 = this.aByteArrayArrayArray14[local56][local122][local97] & 0xFF;
						if (local194 > 0) {
							@Pc(204) Class158 local204 = this.aClass126_2.method3236(local194 - 1);
							Static180.anIntArray220[local97] -= local204.anInt4752;
							Static133.anIntArray179[local97] -= local204.anInt4749;
							Static305.anIntArray53[local97] -= local204.anInt4746;
							Static461.anIntArray580[local97] -= local204.anInt4756;
							local171 = Static27.anIntArray40[local97]--;
						}
					}
				}
				if (local93 >= 0) {
					local103 = 0;
					local122 = 0;
					local194 = 0;
					@Pc(261) int local261 = 0;
					@Pc(263) int local263 = 0;
					for (@Pc(265) int local265 = -5; local265 < this.anInt3553; local265++) {
						@Pc(271) int local271 = local265 + 5;
						if (local271 < this.anInt3553) {
							local122 += Static133.anIntArray179[local271];
							local263 += Static27.anIntArray40[local271];
							local261 += Static461.anIntArray580[local271];
							local103 += Static180.anIntArray220[local271];
							local194 += Static305.anIntArray53[local271];
						}
						@Pc(309) int local309 = local265 - 5;
						if (local309 >= 0) {
							local194 -= Static305.anIntArray53[local309];
							local103 -= Static180.anIntArray220[local309];
							local263 -= Static27.anIntArray40[local309];
							local122 -= Static133.anIntArray179[local309];
							local261 -= Static461.anIntArray580[local309];
						}
						if (local265 >= 0 && local261 > 0 && local263 > 0) {
							local54[local93][local265] = Static343.method5309(local194 / local263, local122 / local263, local103 * 256 / local261);
						}
					}
				}
			}
			if (Static507.aBoolean629) {
				this.method3150(local56, local56 == 0 ? arg1 : null, Static133.aClass59Array3[local56], local56 == 0 ? arg2 : null, local54, arg0);
			} else {
				this.method3152(local56, local54, local56 == 0 ? arg1 : null, arg0, Static133.aClass59Array3[local56], local56 == 0 ? arg2 : null);
			}
			this.aByteArrayArrayArray14[local56] = null;
			this.aByteArrayArrayArray16[local56] = null;
			this.aByteArrayArrayArray11[local56] = null;
			this.aByteArrayArrayArray15[local56] = null;
		}
		if (!this.aBoolean249) {
			if (Static13.anInt7623 != 0) {
				Static103.method1852();
			}
			if (Static20.aBoolean44) {
				Static495.method6399();
			}
		}
		for (local60 = 0; local60 < this.anInt3545; local60++) {
			Static133.aClass59Array3[local60].ba();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IILclient!d;Lclient!d;Lclient!d;[[ILclient!oa;)V")
	private void method3150(@OriginalArg(0) int arg0, @OriginalArg(2) Class59 arg1, @OriginalArg(3) Class59 arg2, @OriginalArg(4) Class59 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class14 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg0];
		@Pc(23) byte[][] local23 = this.aByteArrayArrayArray15[arg0];
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray14[arg0];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray16[arg0];
		for (@Pc(35) int local35 = 0; local35 < this.anInt3551; local35++) {
			@Pc(53) int local53 = local35 >= this.anInt3551 - 1 ? local35 : local35 + 1;
			for (@Pc(55) int local55 = 0; local55 < this.anInt3553; local55++) {
				@Pc(69) int local69 = this.anInt3553 - 1 > local55 ? local55 + 1 : local55;
				if (Static501.anInt8347 == -1 || Static353.method5386(local55, local35, Static501.anInt8347, arg0)) {
					@Pc(83) boolean local83 = false;
					@Pc(85) boolean local85 = false;
					@Pc(88) boolean[] local88 = new boolean[4];
					@Pc(94) int local94 = local10[local35][local55];
					@Pc(100) int local100 = local23[local35][local55];
					@Pc(108) int local108 = local33[local35][local55] & 0xFF;
					@Pc(116) int local116 = local28[local35][local55] & 0xFF;
					@Pc(124) int local124 = local28[local35][local69] & 0xFF;
					@Pc(132) int local132 = local28[local53][local69] & 0xFF;
					@Pc(140) int local140 = local28[local53][local55] & 0xFF;
					if (local108 != 0 || local116 != 0) {
						@Pc(156) Class345 local156 = local108 == 0 ? null : this.aClass206_2.method4893(local108 - 1);
						@Pc(171) Class158 local171 = local116 == 0 ? null : this.aClass126_2.method3236(local116 - 1);
						if (local94 == 0 && local156 == null) {
							local94 = 12;
						}
						@Pc(179) Class345 local179 = local156;
						if (local156 != null) {
							if (local156.anInt9279 == -1 && local156.anInt9270 == -1) {
								local179 = local156;
								local156 = null;
							} else if (local171 != null && local94 != 0) {
								local85 = local156.aBoolean717;
							}
						}
						@Pc(253) int local253;
						@Pc(315) int local315;
						@Pc(369) int local369;
						@Pc(379) int local379;
						if ((local94 == 0 || local94 == 12) && local35 > 0 && local55 > 0 && local35 < this.anInt3551 && local55 < this.anInt3553) {
							local253 = local116 == local28[local35 - 1][local55 - 1] ? 1 : -1;
							@Pc(266) int local266 = local28[local53][local69] == local116 ? 1 : -1;
							@Pc(285) int local285 = local116 == local28[local53][local55 - 1] ? 1 : -1;
							if (local116 == local28[local35][local55 - 1]) {
								local285++;
								local253++;
							} else {
								local285--;
								local253--;
							}
							local315 = local116 == local28[local35 - 1][local69] ? 1 : -1;
							if (local28[local53][local55] == local116) {
								local285++;
								local266++;
							} else {
								local266--;
								local285--;
							}
							if (local28[local35][local69] == local116) {
								local315++;
								local266++;
							} else {
								local266--;
								local315--;
							}
							if (local28[local35 - 1][local55] == local116) {
								local253++;
								local315++;
							} else {
								local315--;
								local253--;
							}
							local369 = local253 - local266;
							if (local369 < 0) {
								local369 = -local369;
							}
							local379 = local285 - local315;
							if (local379 < 0) {
								local379 = -local379;
							}
							if (local369 == local379) {
								local369 = arg2.JA(local35, local55) - arg2.JA(local53, local69);
								local379 = arg2.JA(local53, local55) - arg2.JA(local35, local69);
								if (local369 < 0) {
									local369 = -local369;
								}
								if (local379 < 0) {
									local379 = -local379;
								}
							}
							local100 = local379 <= local369 ? 0 : 1;
						}
						for (local253 = 0; local253 < 13; local253++) {
							Static249.anIntArray371[local253] = -1;
							Static240.anIntArray364[local253] = 1;
						}
						@Pc(466) boolean[] local466 = local156 != null && local156.aBoolean717 ? Static149.aBooleanArrayArray1[local94] : Static265.aBooleanArrayArray3[local94];
						this.method3142(local171, arg5, local10, local23, this.anInt3553, local94, local88, local55, this.anInt3551, local100, local156, local33, local35);
						@Pc(499) boolean local499 = local156 != null && local156.anInt9279 != local156.anInt9270;
						if (!local499) {
							for (local315 = 0; local315 < 8; local315++) {
								if (Static249.anIntArray371[local315] >= 0 && Static478.anIntArray598[local315] != Static129.anIntArray175[local315]) {
									local499 = true;
									break;
								}
							}
						}
						if (!local466[local100 + 1 & 0x3]) {
							local88[1] = Static310.method1722(local88[1], (Static240.anIntArray364[2] & Static240.anIntArray364[4]) == 0);
						}
						if (!local466[local100 + 3 & 0x3]) {
							local88[3] = Static310.method1722(local88[3], (Static240.anIntArray364[0] & Static240.anIntArray364[6]) == 0);
						}
						if (!local466[--local100 & 0x3]) {
							local88[0] = Static310.method1722(local88[0], (Static240.anIntArray364[2] & Static240.anIntArray364[0]) == 0);
						}
						if (!local466[local100 + 2 & 0x3]) {
							local88[2] = Static310.method1722(local88[2], (Static240.anIntArray364[6] & Static240.anIntArray364[4]) == 0);
						}
						if (!local85 && (local94 == 0 || local94 == 12)) {
							if (local88[0] && !local88[1] && !local88[2] && local88[3]) {
								local100 = 0;
								local94 = local94 == 0 ? 13 : 14;
								local88[0] = local88[3] = false;
							} else if (local88[0] && local88[1] && !local88[2] && !local88[3]) {
								local88[0] = local88[1] = false;
								local100 = 3;
								local94 = local94 == 0 ? 13 : 14;
							} else if (!local88[0] && local88[1] && local88[2] && !local88[3]) {
								local88[1] = local88[2] = false;
								local94 = local94 == 0 ? 13 : 14;
								local100 = 2;
							} else if (!local88[0] && !local88[1] && local88[2] && local88[3]) {
								local100 = 1;
								local88[2] = local88[3] = false;
								local94 = local94 == 0 ? 13 : 14;
							}
						}
						@Pc(812) boolean local812 = !local85 && !local88[0] && !local88[2] && !local88[1] && !local88[3];
						@Pc(814) int[] local814 = null;
						@Pc(822) int[] local822;
						@Pc(850) int[] local850;
						@Pc(838) int[] local838;
						if (local812) {
							local822 = Static51.anIntArrayArray7[local94];
							local838 = Static304.anIntArrayArray52[local94];
							local850 = Static456.anIntArrayArray72[local94];
							local369 = local171 == null ? 0 : Static324.anIntArray540[local94];
							local379 = local156 == null ? 0 : Static253.anIntArray377[local94];
						} else if (local85) {
							local822 = Static140.anIntArrayArray16[local94];
							local814 = Static1.anIntArrayArray87[local94];
							local369 = local171 == null ? 0 : Static516.anIntArray643[local94];
							local838 = Static439.anIntArrayArray68[local94];
							local379 = local156 == null ? 0 : Static307.anIntArray423[local94];
							local850 = Static536.anIntArrayArray83[local94];
						} else {
							local838 = Static427.anIntArrayArray65[local94];
							local850 = Static156.anIntArrayArray19[local94];
							local369 = local171 == null ? 0 : Static64.anIntArray428[local94];
							local379 = local156 == null ? 0 : Static236.anIntArray286[local94];
							local814 = Static540.anIntArrayArray25[local94];
							local822 = Static194.anIntArrayArray24[local94];
						}
						@Pc(916) int local916 = local369 + local379;
						if (local916 <= 0) {
							Static56.method1218(arg0, local35, local55);
						} else {
							if (local88[0]) {
								local916++;
							}
							if (local88[2]) {
								local916++;
							}
							if (local88[1]) {
								local916++;
							}
							if (local88[3]) {
								local916++;
							}
							@Pc(949) int local949 = 0;
							@Pc(951) int local951 = 0;
							@Pc(955) int local955 = local916 * 3;
							@Pc(962) int[] local962 = local499 ? new int[local955] : null;
							@Pc(965) int[] local965 = new int[local955];
							@Pc(968) int[] local968 = new int[local955];
							@Pc(971) int[] local971 = new int[local955];
							@Pc(974) int[] local974 = new int[local955];
							@Pc(977) int[] local977 = new int[local955];
							@Pc(984) int[] local984 = arg1 == null ? null : new int[local955];
							@Pc(993) int[] local993 = arg1 == null && arg3 == null ? null : new int[local955];
							@Pc(995) int local995 = -1;
							@Pc(997) int local997 = -1;
							@Pc(999) int local999 = 256;
							@Pc(1081) byte local1081;
							@Pc(1021) int local1021;
							@Pc(1023) int local1023;
							@Pc(1251) int local1251;
							@Pc(1257) int local1257;
							@Pc(1265) int local1265;
							@Pc(1270) int local1270;
							@Pc(1280) int local1280;
							@Pc(1275) int local1275;
							@Pc(1285) int local1285;
							@Pc(1339) int local1339;
							@Pc(1345) int local1345;
							if (local156 != null) {
								local995 = local156.anInt9279;
								local997 = arg5.method6876() ? local156.anInt9268 : local156.anInt9269;
								local999 = local156.anInt9276;
								local1021 = Static337.method5247(arg5, local156);
								for (local1023 = 0; local1023 < local379; local1023++) {
									if (local88[-local100 & 0x3] && local949 == local814[0]) {
										Static384.anIntArray500[0] = local822[local949];
										Static384.anIntArray500[1] = 1;
										Static384.anIntArray500[2] = local838[local949];
										Static384.anIntArray500[3] = 1;
										Static384.anIntArray500[4] = local850[local949];
										Static384.anIntArray500[5] = local838[local949];
										local1081 = 6;
									} else if (local88[2 - local100 & 0x3] && local814[2] == local949) {
										Static384.anIntArray500[0] = local822[local949];
										Static384.anIntArray500[1] = 5;
										Static384.anIntArray500[2] = local838[local949];
										Static384.anIntArray500[3] = 5;
										Static384.anIntArray500[4] = local850[local949];
										local1081 = 6;
										Static384.anIntArray500[5] = local838[local949];
									} else if (local88[1 - local100 & 0x3] && local814[1] == local949) {
										Static384.anIntArray500[0] = local822[local949];
										Static384.anIntArray500[1] = 3;
										Static384.anIntArray500[2] = local838[local949];
										Static384.anIntArray500[3] = 3;
										Static384.anIntArray500[4] = local850[local949];
										local1081 = 6;
										Static384.anIntArray500[5] = local838[local949];
									} else if (local88[3 - local100 & 0x3] && local949 == local814[3]) {
										Static384.anIntArray500[0] = local822[local949];
										Static384.anIntArray500[1] = 7;
										Static384.anIntArray500[2] = local838[local949];
										Static384.anIntArray500[3] = 7;
										Static384.anIntArray500[4] = local850[local949];
										local1081 = 6;
										Static384.anIntArray500[5] = local838[local949];
									} else {
										Static384.anIntArray500[0] = local822[local949];
										Static384.anIntArray500[1] = local850[local949];
										local1081 = 3;
										Static384.anIntArray500[2] = local838[local949];
									}
									local949++;
									for (local1251 = 0; local1251 < local1081; local1251++) {
										local1257 = Static384.anIntArray500[local1251];
										local1265 = local1257 - local100 * 2 & 0x7;
										local1270 = this.anIntArray205[local1257];
										local1275 = this.anIntArray204[local1257];
										if (local100 == 1) {
											local1280 = local1275;
											local1285 = 512 - local1270;
										} else if (local100 == 2) {
											local1285 = 512 - local1275;
											local1280 = 512 - local1270;
										} else if (local100 == 3) {
											local1280 = 512 - local1275;
											local1285 = local1270;
										} else {
											local1280 = local1270;
											local1285 = local1275;
										}
										local965[local951] = local1280;
										local968[local951] = local1285;
										if (local984 != null && Static344.aBooleanArrayArray4[local94][local1257]) {
											local1339 = (local35 << 9) + local1280;
											local1345 = local1285 + (local55 << 9);
											local984[local951] = arg1.sa(local1339, local1345) - arg2.sa(local1339, local1345);
										}
										if (local993 != null) {
											if (arg1 != null && !Static344.aBooleanArrayArray4[local94][local1257]) {
												local1339 = local1280 + (local35 << 9);
												local1345 = (local55 << 9) + local1285;
												local993[local951] = arg2.sa(local1339, local1345) - arg1.sa(local1339, local1345);
											} else if (arg3 != null && !Static575.aBooleanArrayArray9[local94][local1257]) {
												local1339 = (local35 << 9) + local1280;
												local1345 = (local55 << 9) + local1285;
												local993[local951] = arg3.sa(local1339, local1345) - arg2.sa(local1339, local1345);
											}
										}
										if (local1257 < 8 && Static249.anIntArray371[local1265] > local156.anInt9273) {
											if (local962 != null) {
												local962[local951] = Static478.anIntArray598[local1265];
											}
											local977[local951] = Static419.anIntArray531[local1265];
											local974[local951] = Static176.anIntArray216[local1265];
											local971[local951] = Static129.anIntArray175[local1265];
										} else {
											if (local962 != null) {
												local962[local951] = local1021;
											}
											local974[local951] = arg5.method6876() ? local156.anInt9268 : local156.anInt9269;
											local977[local951] = local156.anInt9276;
											local971[local951] = local995;
										}
										local951++;
									}
								}
								if (!this.aBoolean249 && arg0 == 0) {
									Static306.method4840(local35, local55, local156.anInt9266, local156.anInt9272 * 8, local156.anInt9274);
								}
								if (local94 != 12 && local156.anInt9279 != -1 && local156.aBoolean716) {
									local83 = true;
								}
							} else if (local812) {
								local949 = Static253.anIntArray377[local94];
							} else if (local85) {
								local949 = Static307.anIntArray423[local94];
							} else {
								local949 = Static236.anIntArray286[local94];
							}
							if (local171 != null) {
								if (local140 == 0) {
									local140 = local116;
								}
								if (local132 == 0) {
									local132 = local116;
								}
								if (local124 == 0) {
									local124 = local116;
								}
								@Pc(1595) Class158 local1595 = this.aClass126_2.method3236(local116 - 1);
								@Pc(1603) Class158 local1603 = this.aClass126_2.method3236(local124 - 1);
								@Pc(1611) Class158 local1611 = this.aClass126_2.method3236(local132 - 1);
								@Pc(1619) Class158 local1619 = this.aClass126_2.method3236(local140 - 1);
								for (local1265 = 0; local1265 < local369; local1265++) {
									if (local88[-local100 & 0x3] && local949 == local814[0]) {
										Static384.anIntArray500[0] = local822[local949];
										Static384.anIntArray500[1] = 1;
										Static384.anIntArray500[2] = local838[local949];
										Static384.anIntArray500[3] = 1;
										Static384.anIntArray500[4] = local850[local949];
										local1081 = 6;
										Static384.anIntArray500[5] = local838[local949];
									} else if (local88[2 - local100 & 0x3] && local949 == local814[2]) {
										Static384.anIntArray500[0] = local822[local949];
										Static384.anIntArray500[1] = 5;
										Static384.anIntArray500[2] = local838[local949];
										Static384.anIntArray500[3] = 5;
										Static384.anIntArray500[4] = local850[local949];
										Static384.anIntArray500[5] = local838[local949];
										local1081 = 6;
									} else if (local88[1 - local100 & 0x3] && local814[1] == local949) {
										Static384.anIntArray500[0] = local822[local949];
										Static384.anIntArray500[1] = 3;
										Static384.anIntArray500[2] = local838[local949];
										Static384.anIntArray500[3] = 3;
										Static384.anIntArray500[4] = local850[local949];
										Static384.anIntArray500[5] = local838[local949];
										local1081 = 6;
									} else if (local88[3 - local100 & 0x3] && local814[3] == local949) {
										Static384.anIntArray500[0] = local822[local949];
										Static384.anIntArray500[1] = 7;
										Static384.anIntArray500[2] = local838[local949];
										Static384.anIntArray500[3] = 7;
										Static384.anIntArray500[4] = local850[local949];
										local1081 = 6;
										Static384.anIntArray500[5] = local838[local949];
									} else {
										Static384.anIntArray500[0] = local822[local949];
										Static384.anIntArray500[1] = local850[local949];
										Static384.anIntArray500[2] = local838[local949];
										local1081 = 3;
									}
									for (local1270 = 0; local1270 < local1081; local1270++) {
										local1280 = Static384.anIntArray500[local1270];
										local1275 = local1280 - local100 * 2 & 0x7;
										local1285 = this.anIntArray205[local1280];
										local1345 = this.anIntArray204[local1280];
										@Pc(1884) int local1884;
										if (local100 == 1) {
											local1339 = local1345;
											local1884 = 512 - local1285;
										} else if (local100 == 2) {
											local1339 = 512 - local1285;
											local1884 = 512 - local1345;
										} else if (local100 == 3) {
											local1339 = 512 - local1345;
											local1884 = local1285;
										} else {
											local1339 = local1285;
											local1884 = local1345;
										}
										local965[local951] = local1339;
										local968[local951] = local1884;
										@Pc(1939) int local1939;
										@Pc(1945) int local1945;
										if (local984 != null && Static344.aBooleanArrayArray4[local94][local1280]) {
											local1939 = (local35 << 9) + local1339;
											local1945 = (local55 << 9) + local1884;
											local984[local951] = arg1.sa(local1939, local1945) - arg2.sa(local1939, local1945);
										}
										if (local993 != null) {
											if (arg1 != null && !Static344.aBooleanArrayArray4[local94][local1280]) {
												local1939 = (local35 << 9) + local1339;
												local1945 = (local55 << 9) + local1884;
												local993[local951] = arg2.sa(local1939, local1945) - arg1.sa(local1939, local1945);
											} else if (arg3 != null && !Static575.aBooleanArrayArray9[local94][local1280]) {
												local1939 = (local35 << 9) + local1339;
												local1945 = (local55 << 9) + local1884;
												local993[local951] = arg3.sa(local1939, local1945) - arg2.sa(local1939, local1945);
											}
										}
										if (local1280 < 8 && Static249.anIntArray371[local1275] >= 0) {
											if (local962 != null) {
												local962[local951] = Static478.anIntArray598[local1275];
											}
											local977[local951] = Static419.anIntArray531[local1275];
											local974[local951] = Static176.anIntArray216[local1275];
											local971[local951] = Static129.anIntArray175[local1275];
										} else {
											if (local85 && Static344.aBooleanArrayArray4[local94][local1280]) {
												local974[local951] = local997;
												local977[local951] = local999;
												local971[local951] = local995;
											} else if (local1339 == 0 && local1884 == 0) {
												local971[local951] = arg4[local35][local55];
												local974[local951] = local1595.anInt4750;
												local977[local951] = local1595.anInt4751;
											} else if (local1339 == 0 && local1884 == 512) {
												local971[local951] = arg4[local35][local69];
												local974[local951] = local1603.anInt4750;
												local977[local951] = local1603.anInt4751;
											} else if (local1339 == 512 && local1884 == 512) {
												local971[local951] = arg4[local53][local69];
												local974[local951] = local1611.anInt4750;
												local977[local951] = local1611.anInt4751;
											} else if (local1339 == 512 && local1884 == 0) {
												local971[local951] = arg4[local53][local55];
												local974[local951] = local1619.anInt4750;
												local977[local951] = local1619.anInt4751;
											} else {
												if (local1339 >= 256) {
													if (local1884 < 256) {
														local974[local951] = local1619.anInt4750;
														local977[local951] = local1619.anInt4751;
													} else {
														local974[local951] = local1611.anInt4750;
														local977[local951] = local1611.anInt4751;
													}
												} else if (local1884 < 256) {
													local974[local951] = local1595.anInt4750;
													local977[local951] = local1595.anInt4751;
												} else {
													local974[local951] = local1603.anInt4750;
													local977[local951] = local1603.anInt4751;
												}
												local1939 = Static454.method6419(arg4[local53][local55], arg4[local35][local55], local1339 << 7 >> 9);
												local1945 = Static454.method6419(arg4[local53][local69], arg4[local35][local69], local1339 << 7 >> 9);
												local971[local951] = Static454.method6419(local1945, local1939, local1884 << 7 >> 9);
											}
											if (local962 != null) {
												local962[local951] = local971[local951];
											}
										}
										local951++;
									}
									local949++;
								}
								if (local94 != 0 && local171.aBoolean325) {
									local83 = true;
								}
							}
							local1021 = arg2.JA(local35, local55);
							local1023 = arg2.JA(local53, local55);
							local1251 = arg2.JA(local53, local69);
							local1257 = arg2.JA(local35, local69);
							if (arg0 > 0) {
								@Pc(2359) boolean local2359 = true;
								if (local116 == 0 && local94 != 0) {
									local2359 = false;
								}
								if (local108 > 0 && local179 != null && !local179.aBoolean715) {
									local2359 = false;
								}
								if (local2359 && local1023 == local1021 && local1251 == local1021 && local1021 == local1257) {
									this.aByteArrayArrayArray12[arg0][local35][local55] = (byte) (this.aByteArrayArrayArray12[arg0][local35][local55] | 0x4);
								}
							}
							local1265 = 0;
							local1270 = 0;
							local1280 = 0;
							if (this.aBoolean249) {
								local1265 = Static523.method7185(local35, local55);
								local1270 = Static302.method4794(local35, local55);
								local1280 = Static4.method159(local35, local55);
							}
							arg2.BA(local35, local55, local965, local984, local968, local993, local971, local962, local974, local977, local1265, local1270, local1280, local83);
							Static56.method1218(arg0, local35, local55);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIBIIZIIIILclient!ji;)V")
	private void method3151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class6_Sub21 arg9) {
		if (arg1 == 1) {
			arg0 = 1;
		} else if (arg1 == 2) {
			arg0 = 1;
			arg6 = 1;
		} else if (arg1 == 3) {
			arg6 = 1;
		}
		@Pc(67) int local67;
		if (arg5 < 0 || this.anInt3551 <= arg5 || arg7 < 0 || arg7 >= this.anInt3553) {
			while (true) {
				local67 = arg9.method6069();
				if (local67 == 0) {
					return;
				}
				if (local67 == 1) {
					arg9.method6069();
					return;
				}
				if (local67 <= 49) {
					arg9.method6069();
				}
			}
			return;
		}
		if (!this.aBoolean249 && !arg4) {
			Static154.aByteArrayArrayArray4[arg2][arg5][arg7] = 0;
		}
		while (true) {
			local67 = arg9.method6069();
			if (local67 == 0) {
				if (this.aBoolean249) {
					this.anIntArrayArrayArray5[0][arg5 + arg6][arg0 + arg7] = 0;
					return;
				} else if (arg2 == 0) {
					this.anIntArrayArrayArray5[0][arg5 + arg6][arg7 + arg0] = -Static354.method6903(arg8 + 932731, 556238 - -arg3) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray5[arg2][arg6 + arg5][arg7 + arg0] = this.anIntArrayArrayArray5[arg2 - 1][arg6 + arg5][arg0 + arg7] - 960;
					return;
				}
			}
			if (local67 == 1) {
				@Pc(155) int local155 = arg9.method6069();
				if (!this.aBoolean249) {
					if (local155 == 1) {
						local155 = 0;
					}
					if (arg2 == 0) {
						this.anIntArrayArrayArray5[0][arg5 + arg6][arg0 + arg7] = -local155 * 8 << 2;
						return;
					}
					this.anIntArrayArrayArray5[arg2][arg6 + arg5][arg7 + arg0] = this.anIntArrayArrayArray5[arg2 - 1][arg6 + arg5][arg0 + arg7] - (local155 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray5[0][arg6 + arg5][arg7 + arg0] = local155 * 8 << 2;
				return;
			}
			if (local67 <= 49) {
				if (arg4) {
					arg9.method6069();
				} else {
					this.aByteArrayArrayArray16[arg2][arg5][arg7] = arg9.method6055();
					this.aByteArrayArrayArray11[arg2][arg5][arg7] = (byte) ((local67 - 2) / 4);
					this.aByteArrayArrayArray15[arg2][arg5][arg7] = (byte) (local67 + arg1 - 2 & 0x3);
				}
			} else if (local67 <= 81) {
				if (!this.aBoolean249 && !arg4) {
					Static154.aByteArrayArrayArray4[arg2][arg5][arg7] = (byte) (local67 - 49);
				}
			} else if (!arg4) {
				this.aByteArrayArrayArray14[arg2][arg5][arg7] = (byte) (local67 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[[ILclient!d;Lclient!oa;ILclient!d;Lclient!d;)V")
	private void method3152(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) Class14 arg3, @OriginalArg(5) Class59 arg4, @OriginalArg(6) Class59 arg5) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3551; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt3553; local15++) {
				if (Static501.anInt8347 == -1 || Static353.method5386(local15, local11, Static501.anInt8347, arg0)) {
					@Pc(39) byte local39 = this.aByteArrayArrayArray11[arg0][local11][local15];
					@Pc(48) byte local48 = this.aByteArrayArrayArray15[arg0][local11][local15];
					@Pc(59) int local59 = this.aByteArrayArrayArray16[arg0][local11][local15] & 0xFF;
					@Pc(70) int local70 = this.aByteArrayArrayArray14[arg0][local11][local15] & 0xFF;
					@Pc(87) Class345 local87 = local59 == 0 ? null : this.aClass206_2.method4893(local59 - 1);
					@Pc(102) Class158 local102 = local70 == 0 ? null : this.aClass126_2.method3236(local70 - 1);
					@Pc(104) int local104 = 0;
					@Pc(106) int local106 = 0;
					if (local39 != 0) {
						local106 = local87 == null ? 0 : Static253.anIntArray377[local39];
						local104 = local102 == null ? 0 : Static324.anIntArray540[local39];
					} else if (local87 != null) {
						local106 = Static253.anIntArray377[local39];
					} else if (local102 != null) {
						local104 = Static253.anIntArray377[local39];
					}
					@Pc(147) int local147 = local104 + local106;
					@Pc(149) int local149 = 0;
					if (local147 != 0) {
						@Pc(154) int[] local154 = new int[local147];
						@Pc(157) int[] local157 = new int[local147];
						@Pc(160) int[] local160 = new int[local147];
						@Pc(163) int[] local163 = new int[local147];
						@Pc(165) boolean local165 = false;
						@Pc(190) int local190;
						@Pc(196) int local196;
						if (local87 == null || local87.anInt9279 == -1 && local87.anInt9270 == -1 && local87.anInt9268 == -1) {
							for (local190 = 0; local190 < local106; local190++) {
								local154[local149] = -1;
								local149++;
							}
						} else {
							local190 = arg3.method6876() ? local87.anInt9268 : local87.anInt9269;
							if (Static201.aBoolean285) {
								local190 = -1;
							}
							for (local196 = 0; local196 < local106; local196++) {
								local160[local149] = local190;
								local163[local149] = local87.anInt9276;
								if (local87.anInt9279 == -1) {
									local154[local149] = -1;
								} else {
									local154[local149] = local87.anInt9279;
								}
								if (local87.anInt9270 == -1) {
									local157[local149] = -1;
								} else {
									local165 = true;
									local157[local149] = local87.anInt9270;
								}
								local149++;
							}
							if (!this.aBoolean249 && arg0 == 0) {
								Static306.method4840(local11, local15, local87.anInt9266, local87.anInt9272 * 8, local87.anInt9274);
							}
						}
						if (!local165) {
							local157 = null;
						}
						if (local102 == null) {
							for (local190 = 0; local190 < local104; local190++) {
								local154[local149] = -1;
								local149++;
							}
						} else {
							local190 = local102.anInt4750;
							if (Static201.aBoolean285) {
								local190 = -1;
							}
							for (local196 = 0; local196 < local104; local196++) {
								local160[local149] = local190;
								local163[local149] = local102.anInt4751;
								local154[local149] = arg1[local11][local15];
								if (local157 != null) {
									local157[local149] = -1;
								}
								local149++;
							}
						}
						local190 = this.anIntArray205.length;
						@Pc(353) int[] local353 = new int[local190];
						@Pc(356) int[] local356 = new int[local190];
						@Pc(363) int[] local363 = arg2 == null ? null : new int[local190];
						@Pc(372) int[] local372 = arg2 == null && arg5 == null ? null : new int[local190];
						@Pc(381) int local381;
						@Pc(386) int local386;
						@Pc(469) int local469;
						@Pc(475) int local475;
						for (@Pc(374) int local374 = 0; local374 < local190; local374++) {
							local381 = this.anIntArray205[local374];
							local386 = this.anIntArray204[local374];
							if (local48 == 0) {
								local353[local374] = local381;
								local356[local374] = local386;
							} else if (local48 == 1) {
								local353[local374] = local386;
								local356[local374] = 512 - local381;
							} else if (local48 == 2) {
								local353[local374] = 512 - local381;
								local356[local374] = 512 - local386;
							} else if (local48 == 3) {
								local353[local374] = 512 - local386;
								local356[local374] = local381;
							}
							if (local363 != null && Static344.aBooleanArrayArray4[local39][local374]) {
								local469 = (local11 << 9) + local381;
								local475 = local381 + (local15 << 9);
								local363[local374] = arg2.sa(local469, local475) - arg4.sa(local469, local475);
							}
							if (local372 != null) {
								if (arg2 != null && !Static344.aBooleanArrayArray4[local39][local374]) {
									local469 = local381 + (local11 << 9);
									local475 = (local15 << 9) + local381;
									local372[local374] = arg4.sa(local469, local475) - arg2.sa(local469, local475);
								} else if (arg5 != null && !Static575.aBooleanArrayArray9[local39][local374]) {
									local469 = local381 + (local11 << 9);
									local475 = local381 + (local15 << 9);
									local372[local374] = arg5.sa(local469, local475) - arg4.sa(local469, local475);
								}
							}
						}
						local381 = arg4.JA(local11, local15);
						local386 = arg4.JA(local11 + 1, local15);
						local469 = arg4.JA(local11 + 1, local15 - -1);
						local475 = arg4.JA(local11, local15 + 1);
						if (arg0 > 0) {
							@Pc(595) boolean local595 = true;
							if (local70 == 0 && local39 != 0) {
								local595 = false;
							}
							if (local59 > 0 && local87 != null && !local87.aBoolean715) {
								local595 = false;
							}
							if (local595 && local381 == local386 && local381 == local469 && local475 == local381) {
								this.aByteArrayArrayArray12[arg0][local11][local15] = (byte) (this.aByteArrayArrayArray12[arg0][local11][local15] | 0x4);
							}
						}
						@Pc(652) int local652 = 0;
						@Pc(654) int local654 = 0;
						@Pc(656) int local656 = 0;
						if (this.aBoolean249) {
							local652 = Static523.method7185(local11, local15);
							local654 = Static302.method4794(local11, local15);
							local656 = Static4.method159(local11, local15);
						}
						arg4.method7863(local11, local15, local353, local363, local356, local372, Static51.anIntArrayArray7[local39], Static456.anIntArrayArray72[local39], Static304.anIntArrayArray52[local39], local154, local157, local160, local163, local652, local654, local656);
						Static56.method1218(arg0, local11, local15);
					}
				}
			}
		}
	}
}
