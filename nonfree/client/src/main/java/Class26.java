import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public class Class26 {

	@OriginalMember(owner = "client!du", name = "u", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "[I")
	private final int[] anIntArray53 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!du", name = "A", descriptor = "[I")
	private final int[] anIntArray54 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	public final int anInt490;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "I")
	protected final int anInt480;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Z")
	public final boolean aBoolean48;

	@OriginalMember(owner = "client!du", name = "v", descriptor = "Lclient!tu;")
	private final Class322 aClass322_2;

	@OriginalMember(owner = "client!du", name = "z", descriptor = "I")
	protected final int anInt493;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "Lclient!ka;")
	private final Class181 aClass181_2;

	@OriginalMember(owner = "client!du", name = "B", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!du", name = "y", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIZLclient!ka;Lclient!tu;)V")
	protected Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(5) Class322 arg5) {
		this.anInt490 = arg0;
		this.anInt480 = arg1;
		this.aBoolean48 = arg3;
		this.aClass322_2 = arg5;
		this.anInt493 = arg2;
		this.aClass181_2 = arg4;
		this.aByteArrayArrayArray12 = new byte[this.anInt490][this.anInt480][this.anInt493];
		this.aByteArrayArrayArray11 = new byte[this.anInt490][this.anInt480][this.anInt493];
		this.anIntArrayArrayArray2 = new int[this.anInt490][this.anInt480 + 1][this.anInt493 + 1];
		this.aByteArrayArrayArray7 = new byte[this.anInt490][this.anInt480][this.anInt493];
		this.aByteArrayArrayArray8 = new byte[this.anInt490][this.anInt480][this.anInt493];
		this.aByteArrayArrayArray9 = new byte[this.anInt490][this.anInt480 + 1][this.anInt493 + 1];
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I[[B[[BILclient!r;ILclient!tca;[[BIILclient!pi;[ZII)V")
	private void method402(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class134 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class314 arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class261 arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(26) boolean[] local26 = arg6 != null && arg6.aBoolean659 ? Static321.aBooleanArrayArray4[arg8] : Static279.aBooleanArrayArray3[arg8];
		@Pc(45) int local45;
		@Pc(58) Class314 local58;
		@Pc(75) byte local75;
		@Pc(91) int local91;
		@Pc(96) int local96;
		if (arg12 > 0) {
			if (arg11 > 0) {
				local45 = arg2[arg11 - 1][arg12 - 1] & 0xFF;
				if (local45 > 0) {
					local58 = this.aClass181_2.method3760(local45 - 1);
					if (local58.anInt8497 != -1 && local58.aBoolean659) {
						local75 = arg7[arg11 - 1][arg12 - 1];
						local91 = arg1[arg11 - 1][arg12 - 1] * 2 + 4 & 0x7;
						local96 = Static592.method7862(arg4, local58);
						if (Static391.aBooleanArrayArray6[local75][local91]) {
							Static171.anIntArray267[0] = local58.anInt8497;
							Static493.anIntArray643[0] = local96;
							Static349.anIntArray476[0] = local58.anInt8500;
							Static566.anIntArray711[0] = local58.anInt8503;
							Static190.anIntArray308[0] = local58.anInt8506;
							Static107.anIntArray150[0] = 256;
						}
					}
				}
			}
			if (arg5 - 1 > arg11) {
				local45 = arg2[arg11 + 1][arg12 - 1] & 0xFF;
				if (local45 > 0) {
					local58 = this.aClass181_2.method3760(local45 - 1);
					if (local58.anInt8497 != -1 && local58.aBoolean659) {
						local75 = arg7[arg11 + 1][arg12 - 1];
						local91 = arg1[arg11 + 1][arg12 - 1] * 2 + 6 & 0x7;
						local96 = Static592.method7862(arg4, local58);
						if (Static391.aBooleanArrayArray6[local75][local91]) {
							Static171.anIntArray267[2] = local58.anInt8497;
							Static493.anIntArray643[2] = local96;
							Static349.anIntArray476[2] = local58.anInt8500;
							Static566.anIntArray711[2] = local58.anInt8503;
							Static190.anIntArray308[2] = local58.anInt8506;
							Static107.anIntArray150[2] = 512;
						}
					}
				}
			}
		}
		if (arg12 < arg3 - 1) {
			if (arg11 > 0) {
				local45 = arg2[arg11 - 1][arg12 + 1] & 0xFF;
				if (local45 > 0) {
					local58 = this.aClass181_2.method3760(local45 - 1);
					if (local58.anInt8497 != -1 && local58.aBoolean659) {
						local75 = arg7[arg11 - 1][arg12 + 1];
						local91 = arg1[arg11 - 1][arg12 + 1] * 2 + 2 & 0x7;
						local96 = Static592.method7862(arg4, local58);
						if (Static391.aBooleanArrayArray6[local75][local91]) {
							Static171.anIntArray267[6] = local58.anInt8497;
							Static493.anIntArray643[6] = local96;
							Static349.anIntArray476[6] = local58.anInt8500;
							Static566.anIntArray711[6] = local58.anInt8503;
							Static190.anIntArray308[6] = local58.anInt8506;
							Static107.anIntArray150[6] = 64;
						}
					}
				}
			}
			if (arg5 - 1 > arg11) {
				local45 = arg2[arg11 + 1][arg12 + 1] & 0xFF;
				if (local45 > 0) {
					local58 = this.aClass181_2.method3760(local45 - 1);
					if (local58.anInt8497 != -1 && local58.aBoolean659) {
						local75 = arg7[arg11 + 1][arg12 + 1];
						local91 = arg1[arg11 + 1][arg12 + 1] * 2 & 0x7;
						local96 = Static592.method7862(arg4, local58);
						if (Static391.aBooleanArrayArray6[local75][local91]) {
							Static171.anIntArray267[4] = local58.anInt8497;
							Static493.anIntArray643[4] = local96;
							Static349.anIntArray476[4] = local58.anInt8500;
							Static566.anIntArray711[4] = local58.anInt8503;
							Static190.anIntArray308[4] = local58.anInt8506;
							Static107.anIntArray150[4] = 128;
						}
					}
				}
			}
		}
		@Pc(510) int local510;
		@Pc(515) int local515;
		@Pc(517) int local517;
		@Pc(476) byte local476;
		if (arg12 > 0) {
			local45 = arg2[arg11][arg12 - 1] & 0xFF;
			if (local45 > 0) {
				local58 = this.aClass181_2.method3760(local45 - 1);
				if (local58.anInt8497 != -1) {
					local75 = arg7[arg11][arg12 - 1];
					local476 = arg1[arg11][arg12 - 1];
					if (local58.aBoolean659) {
						local96 = 2;
						local510 = local476 * 2 + 4;
						local515 = Static592.method7862(arg4, local58);
						for (local517 = 0; local517 < 3; local517++) {
							local510 &= 0x7;
							local96 &= 0x7;
							if (Static391.aBooleanArrayArray6[local75][local510] && Static190.anIntArray308[local96] <= local58.anInt8506) {
								Static171.anIntArray267[local96] = local58.anInt8497;
								Static493.anIntArray643[local96] = local515;
								Static349.anIntArray476[local96] = local58.anInt8500;
								Static566.anIntArray711[local96] = local58.anInt8503;
								if (Static190.anIntArray308[local96] == local58.anInt8506) {
									Static107.anIntArray150[local96] |= 0x20;
								} else {
									Static107.anIntArray150[local96] = 32;
								}
								Static190.anIntArray308[local96] = local58.anInt8506;
							}
							local96--;
							local510++;
						}
						if (!local26[--arg0 & 0x3]) {
							arg10[0] = Static321.aBooleanArrayArray4[local75][local476 + 2 & 0x3];
						}
					} else if (!local26[--arg0 & 0x3]) {
						arg10[0] = Static279.aBooleanArrayArray3[local75][local476 + 2 & 0x3];
					}
				}
			}
		}
		if (arg3 - 1 > arg12) {
			local45 = arg2[arg11][arg12 + 1] & 0xFF;
			if (local45 > 0) {
				local58 = this.aClass181_2.method3760(local45 - 1);
				if (local58.anInt8497 != -1) {
					local75 = arg7[arg11][arg12 + 1];
					local476 = arg1[arg11][arg12 + 1];
					if (local58.aBoolean659) {
						local96 = 4;
						local510 = local476 * 2 + 2;
						local515 = Static592.method7862(arg4, local58);
						for (local517 = 0; local517 < 3; local517++) {
							local510 &= 0x7;
							local96 &= 0x7;
							if (Static391.aBooleanArrayArray6[local75][local510] && Static190.anIntArray308[local96] <= local58.anInt8506) {
								Static171.anIntArray267[local96] = local58.anInt8497;
								Static493.anIntArray643[local96] = local515;
								Static349.anIntArray476[local96] = local58.anInt8500;
								Static566.anIntArray711[local96] = local58.anInt8503;
								if (Static190.anIntArray308[local96] == local58.anInt8506) {
									Static107.anIntArray150[local96] |= 0x10;
								} else {
									Static107.anIntArray150[local96] = 16;
								}
								Static190.anIntArray308[local96] = local58.anInt8506;
							}
							local510--;
							local96++;
						}
						if (!local26[arg0 + 2 & 0x3]) {
							arg10[2] = Static321.aBooleanArrayArray4[local75][--local476 & 0x3];
						}
					} else if (!local26[arg0 + 2 & 0x3]) {
						arg10[2] = Static279.aBooleanArrayArray3[local75][local476 & 0x3];
					}
				}
			}
		}
		if (arg11 > 0) {
			local45 = arg2[arg11 - 1][arg12] & 0xFF;
			if (local45 > 0) {
				local58 = this.aClass181_2.method3760(local45 - 1);
				if (local58.anInt8497 != -1) {
					local75 = arg7[arg11 - 1][arg12];
					local476 = arg1[arg11 - 1][arg12];
					if (local58.aBoolean659) {
						local96 = 6;
						local510 = local476 * 2 + 4;
						local515 = Static592.method7862(arg4, local58);
						for (local517 = 0; local517 < 3; local517++) {
							local96 &= 0x7;
							local510 &= 0x7;
							if (Static391.aBooleanArrayArray6[local75][local510] && Static190.anIntArray308[local96] <= local58.anInt8506) {
								Static171.anIntArray267[local96] = local58.anInt8497;
								Static493.anIntArray643[local96] = local515;
								Static349.anIntArray476[local96] = local58.anInt8500;
								Static566.anIntArray711[local96] = local58.anInt8503;
								if (local58.anInt8506 == Static190.anIntArray308[local96]) {
									Static107.anIntArray150[local96] |= 0x8;
								} else {
									Static107.anIntArray150[local96] = 8;
								}
								Static190.anIntArray308[local96] = local58.anInt8506;
							}
							local510--;
							local96++;
						}
						if (!local26[arg0 + 3 & 0x3]) {
							arg10[3] = Static321.aBooleanArrayArray4[local75][local476 + 1 & 0x3];
						}
					} else if (!local26[arg0 + 3 & 0x3]) {
						arg10[3] = Static279.aBooleanArrayArray3[local75][local476 + 1 & 0x3];
					}
				}
			}
		}
		if (arg11 < arg5 - 1) {
			local45 = arg2[arg11 + 1][arg12] & 0xFF;
			if (local45 > 0) {
				local58 = this.aClass181_2.method3760(local45 - 1);
				if (local58.anInt8497 != -1) {
					local75 = arg7[arg11 + 1][arg12];
					local476 = arg1[arg11 + 1][arg12];
					if (local58.aBoolean659) {
						local96 = 4;
						local510 = local476 * 2 + 6;
						local515 = Static592.method7862(arg4, local58);
						for (local517 = 0; local517 < 3; local517++) {
							local96 &= 0x7;
							local510 &= 0x7;
							if (Static391.aBooleanArrayArray6[local75][local510] && local58.anInt8506 >= Static190.anIntArray308[local96]) {
								Static171.anIntArray267[local96] = local58.anInt8497;
								Static493.anIntArray643[local96] = local515;
								Static349.anIntArray476[local96] = local58.anInt8500;
								Static566.anIntArray711[local96] = local58.anInt8503;
								if (local58.anInt8506 == Static190.anIntArray308[local96]) {
									Static107.anIntArray150[local96] |= 0x4;
								} else {
									Static107.anIntArray150[local96] = 4;
								}
								Static190.anIntArray308[local96] = local58.anInt8506;
							}
							local510++;
							local96--;
						}
						if (!local26[arg0 + 1 & 0x3]) {
							arg10[1] = Static321.aBooleanArrayArray4[local75][local476 + 3 & 0x3];
						}
					} else if (!local26[arg0 + 1 & 0x3]) {
						arg10[1] = Static279.aBooleanArrayArray3[local75][local476 + 3 & 0x3];
					}
				}
			}
		}
		if (arg6 == null) {
			return;
		}
		local45 = Static592.method7862(arg4, arg6);
		if (!arg6.aBoolean659) {
			return;
		}
		for (@Pc(1182) int local1182 = 0; local1182 < 8; local1182++) {
			@Pc(1193) int local1193 = local1182 - arg0 * 2 & 0x7;
			if (Static391.aBooleanArrayArray6[arg8][local1182] && Static190.anIntArray308[local1193] <= arg6.anInt8506) {
				Static171.anIntArray267[local1193] = arg6.anInt8497;
				Static493.anIntArray643[local1193] = local45;
				Static349.anIntArray476[local1193] = arg6.anInt8500;
				Static566.anIntArray711[local1193] = arg6.anInt8503;
				if (Static190.anIntArray308[local1193] == arg6.anInt8506) {
					Static107.anIntArray150[local1193] |= 0x2;
				} else {
					Static107.anIntArray150[local1193] = 2;
				}
				Static190.anIntArray308[local1193] = arg6.anInt8506;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I[Lclient!cp;IILclient!mo;BI)V")
	public final void method403(@OriginalArg(0) int arg0, @OriginalArg(1) Class59[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub35 arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(35) int local35;
		if (!this.aBoolean48) {
			for (local16 = 0; local16 < 4; local16++) {
				@Pc(22) Class59 local22 = arg1[local16];
				for (local24 = 0; local24 < 64; local24++) {
					for (local28 = 0; local28 < 64; local28++) {
						local35 = arg2 + local24;
						@Pc(40) int local40 = arg5 + local28;
						if (local35 >= 0 && local35 < this.anInt480 && local40 >= 0 && local40 < this.anInt493) {
							local22.method1196(local35, local40);
						}
					}
				}
			}
		}
		local16 = arg0 + arg2;
		@Pc(89) int local89 = arg3 + arg5;
		for (local24 = 0; local24 < this.anInt490; local24++) {
			for (local28 = 0; local28 < 64; local28++) {
				for (local35 = 0; local35 < 64; local35++) {
					this.method407(arg5 + local35, false, 0, local28 + local16, arg2 + local28, local24, local89 + local35, 0, 0, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!mo;IIIII[Lclient!cp;ZII)V")
	public final void method404(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class59[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg8 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(51) int local51;
		if (!this.aBoolean48) {
			@Pc(18) Class59 local18 = arg6[arg1];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(39) int local39 = arg5 + Static300.method4187(arg4, local20 & 0x7, local24 & 0x7);
					local51 = Static451.method6231(arg4, local20 & 0x7, local24 & 0x7) + arg2;
					if (local39 > 0 && this.anInt480 - 1 > local39 && local51 > 0 && this.anInt493 - 1 > local51) {
						local18.method1196(local39, local51);
					}
				}
			}
		}
		@Pc(92) int local92 = (arg7 & 0x7) * 8;
		@Pc(98) int local98 = (arg8 & 0xFFFFFFF8) << 3;
		local20 = (arg7 & 0x1FFFFFF8) << 3;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (arg4 == 1) {
			local112 = 1;
		} else if (arg4 == 2) {
			local110 = 1;
			local112 = 1;
		} else if (arg4 == 3) {
			local110 = 1;
		}
		for (local51 = 0; local51 < this.anInt490; local51++) {
			for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
				for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
					if (arg3 == local51 && local11 <= local143 && local11 + 8 >= local143 && local147 >= local92 && local147 <= local92 + 8) {
						@Pc(208) int local208;
						@Pc(202) int local202;
						if (local11 + 8 == local143 || local92 + 8 == local147) {
							if (arg4 == 0) {
								local202 = local147 + arg2 - local92;
								local208 = arg5 + local143 - local11;
							} else if (arg4 == 1) {
								local202 = arg2 + local11 + 8 - local143;
								local208 = local147 + arg5 - local92;
							} else if (arg4 == 2) {
								local202 = local92 + arg2 + 8 - local147;
								local208 = arg5 + local11 + 8 - local143;
							} else {
								local208 = arg5 + local92 + 8 - local147;
								local202 = arg2 + local143 - local11;
							}
							this.method407(local202, true, 0, local98 + local143, local208, arg1, local147 + local20, 0, 0, arg0);
						} else {
							local208 = arg5 + Static300.method4187(arg4, local143 & 0x7, local147 & 0x7);
							local202 = arg2 + Static451.method6231(arg4, local143 & 0x7, local147 & 0x7);
							this.method407(local202, false, local112, local143 + local98, local208, arg1, local147 + local20, arg4, local110, arg0);
						}
						if (local143 == 63 || local147 == 63) {
							@Pc(346) byte local346 = 1;
							if (local143 == 63 && local147 == 63) {
								local346 = 3;
							}
							for (@Pc(356) int local356 = 0; local356 < local346; local356++) {
								@Pc(360) int local360 = local143;
								@Pc(362) int local362 = local147;
								if (local356 == 0) {
									local360 = local143 == 63 ? 64 : local143;
									local362 = local147 == 63 ? 64 : local147;
								} else if (local356 == 1) {
									local360 = 64;
								} else if (local356 == 2) {
									local362 = 64;
								}
								@Pc(417) int local417;
								@Pc(410) int local410;
								if (arg4 == 0) {
									local410 = local362 + arg2 - local92;
									local417 = arg5 + local360 - local11;
								} else if (arg4 == 1) {
									local417 = local362 + arg5 - local92;
									local410 = local11 + arg2 + 8 - local360;
								} else if (arg4 == 2) {
									local410 = arg2 + local92 + 8 - local362;
									local417 = arg5 + local11 + 8 - local360;
								} else {
									local417 = local92 + arg5 + 8 - local362;
									local410 = arg2 + local360 - local11;
								}
								if (local417 >= 0 && this.anInt480 > local417 && local410 >= 0 && local410 < this.anInt493) {
									this.anIntArrayArrayArray2[arg1][local417][local410] = this.anIntArrayArrayArray2[arg1][local110 + local208][local112 + local202];
								}
							}
						}
					} else {
						this.method407(-1, false, 0, 0, -1, 0, 0, 0, 0, arg0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!r;ILclient!i;ZLclient!i;Lclient!i;[[I)V")
	private void method405(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(4) Class47 arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray7[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray11[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray8[arg1];
		for (@Pc(27) int local27 = 0; local27 < this.anInt480; local27++) {
			@Pc(45) int local45 = this.anInt480 - 1 > local27 ? local27 + 1 : local27;
			for (@Pc(47) int local47 = 0; local47 < this.anInt493; local47++) {
				@Pc(65) int local65 = this.anInt493 - 1 > local47 ? local47 + 1 : local47;
				if (Static32.anInt509 == -1 || Static53.method976(arg1, local47, Static32.anInt509, local27)) {
					@Pc(80) boolean local80 = false;
					@Pc(82) boolean local82 = false;
					@Pc(85) boolean[] local85 = new boolean[4];
					@Pc(91) int local91 = local10[local27][local47];
					@Pc(97) int local97 = local15[local27][local47];
					@Pc(105) int local105 = local25[local27][local47] & 0xFF;
					@Pc(113) int local113 = local20[local27][local47] & 0xFF;
					@Pc(121) int local121 = local20[local27][local65] & 0xFF;
					@Pc(129) int local129 = local20[local45][local65] & 0xFF;
					@Pc(137) int local137 = local20[local45][local47] & 0xFF;
					if (local105 != 0 || local113 != 0) {
						@Pc(159) Class314 local159 = local105 == 0 ? null : this.aClass181_2.method3760(local105 - 1);
						@Pc(171) Class261 local171 = local113 == 0 ? null : this.aClass322_2.method7131(local113 - 1);
						if (local91 == 0 && local159 == null) {
							local91 = 12;
						}
						@Pc(182) Class314 local182 = local159;
						if (local159 != null) {
							if (local159.anInt8497 == -1 && local159.anInt8502 == -1) {
								local182 = local159;
								local159 = null;
							} else if (local171 != null && local91 != 0) {
								local82 = local159.aBoolean659;
							}
						}
						@Pc(259) int local259;
						@Pc(331) int local331;
						@Pc(377) int local377;
						@Pc(389) int local389;
						if ((local91 == 0 || local91 == 12) && local27 > 0 && local47 > 0 && this.anInt480 > local27 && local47 < this.anInt493) {
							local259 = local20[local27 - 1][local47 - 1] == local113 ? 1 : -1;
							@Pc(276) int local276 = local113 == local20[local45][local65] ? 1 : -1;
							@Pc(297) int local297 = local20[local45][local47 - 1] == local113 ? 1 : -1;
							if (local20[local27][local47 - 1] == local113) {
								local297++;
								local259++;
							} else {
								local297--;
								local259--;
							}
							local331 = local20[local27 - 1][local65] == local113 ? 1 : -1;
							if (local113 == local20[local45][local47]) {
								local276++;
								local297++;
							} else {
								local297--;
								local276--;
							}
							if (local20[local27][local65] == local113) {
								local276++;
								local331++;
							} else {
								local331--;
								local276--;
							}
							if (local113 == local20[local27 - 1][local47]) {
								local331++;
								local259++;
							} else {
								local331--;
								local259--;
							}
							local377 = local259 - local276;
							if (local377 < 0) {
								local377 = -local377;
							}
							local389 = local297 - local331;
							if (local389 < 0) {
								local389 = -local389;
							}
							if (local377 == local389) {
								local377 = arg2.method7545(local27, local47) - arg2.method7545(local45, local65);
								if (local377 < 0) {
									local377 = -local377;
								}
								local389 = arg2.method7545(local45, local47) - arg2.method7545(local27, local65);
								if (local389 < 0) {
									local389 = -local389;
								}
							}
							local97 = local377 < local389 ? 1 : 0;
						}
						for (local259 = 0; local259 < 13; local259++) {
							Static190.anIntArray308[local259] = -1;
							Static107.anIntArray150[local259] = 1;
						}
						@Pc(480) boolean[] local480 = local159 != null && local159.aBoolean659 ? Static321.aBooleanArrayArray4[local91] : Static279.aBooleanArrayArray3[local91];
						this.method402(local97, local15, local25, this.anInt493, arg0, this.anInt480, local159, local10, local91, local171, local85, local27, local47);
						@Pc(509) boolean local509 = local159 != null && local159.anInt8497 != local159.anInt8502;
						if (!local509) {
							for (local331 = 0; local331 < 8; local331++) {
								if (Static190.anIntArray308[local331] >= 0 && Static171.anIntArray267[local331] != Static493.anIntArray643[local331]) {
									local509 = true;
									break;
								}
							}
						}
						if (!local480[local97 + 1 & 0x3]) {
							local85[1] = Static225.method3431(local85[1], (Static107.anIntArray150[2] & Static107.anIntArray150[4]) == 0);
						}
						if (!local480[local97 + 3 & 0x3]) {
							local85[3] = Static225.method3431(local85[3], (Static107.anIntArray150[6] & Static107.anIntArray150[0]) == 0);
						}
						if (!local480[local97 & 0x3]) {
							local85[0] = Static225.method3431(local85[0], (Static107.anIntArray150[0] & Static107.anIntArray150[2]) == 0);
						}
						if (!local480[local97 + 2 & 0x3]) {
							local85[2] = Static225.method3431(local85[2], (Static107.anIntArray150[4] & Static107.anIntArray150[6]) == 0);
						}
						if (!local82 && (local91 == 0 || local91 == 12)) {
							if (local85[0] && !local85[1] && !local85[2] && local85[3]) {
								local97 = 0;
								local91 = local91 == 0 ? 13 : 14;
								local85[0] = local85[3] = false;
							} else if (local85[0] && local85[1] && !local85[2] && !local85[3]) {
								local97 = 3;
								local85[0] = local85[1] = false;
								local91 = local91 == 0 ? 13 : 14;
							} else if (!local85[0] && local85[1] && local85[2] && !local85[3]) {
								local97 = 2;
								local91 = local91 == 0 ? 13 : 14;
								local85[1] = local85[2] = false;
							} else if (!local85[0] && !local85[1] && local85[2] && local85[3]) {
								local97 = 1;
								local85[2] = local85[3] = false;
								local91 = local91 == 0 ? 13 : 14;
							}
						}
						@Pc(817) boolean local817 = !local82 && !local85[0] && !local85[2] && !local85[1] && !local85[3];
						@Pc(819) int[] local819 = null;
						@Pc(849) int[] local849;
						@Pc(845) int[] local845;
						@Pc(841) int[] local841;
						if (local817) {
							local377 = local171 == null ? 0 : Static386.anIntArray519[local91];
							local389 = local159 == null ? 0 : Static500.anIntArray685[local91];
							local841 = Static559.anIntArrayArray198[local91];
							local845 = Static370.anIntArrayArray143[local91];
							local849 = Static45.anIntArrayArray29[local91];
						} else if (local82) {
							local389 = local159 == null ? 0 : Static484.anIntArray628[local91];
							local845 = Static354.anIntArrayArray136[local91];
							local377 = local171 == null ? 0 : Static191.anIntArray309[local91];
							local819 = Static114.anIntArrayArray60[local91];
							local841 = Static19.anIntArrayArray15[local91];
							local849 = Static357.anIntArrayArray139[local91];
						} else {
							local841 = Static241.anIntArrayArray100[local91];
							local845 = Static190.anIntArrayArray86[local91];
							local849 = Static373.anIntArrayArray147[local91];
							local389 = local159 == null ? 0 : Static66.anIntArray111[local91];
							local819 = Static397.anIntArrayArray206[local91];
							local377 = local171 == null ? 0 : Static156.anIntArray234[local91];
						}
						@Pc(923) int local923 = local389 + local377;
						if (local923 <= 0) {
							Static488.method2260(arg1, local27, local47);
						} else {
							if (local85[0]) {
								local923++;
							}
							if (local85[2]) {
								local923++;
							}
							if (local85[1]) {
								local923++;
							}
							if (local85[3]) {
								local923++;
							}
							@Pc(956) int local956 = 0;
							@Pc(958) int local958 = 0;
							@Pc(962) int local962 = local923 * 3;
							@Pc(969) int[] local969 = local509 ? new int[local962] : null;
							@Pc(972) int[] local972 = new int[local962];
							@Pc(975) int[] local975 = new int[local962];
							@Pc(978) int[] local978 = new int[local962];
							@Pc(981) int[] local981 = new int[local962];
							@Pc(984) int[] local984 = new int[local962];
							@Pc(991) int[] local991 = arg3 == null ? null : new int[local962];
							@Pc(1000) int[] local1000 = arg3 == null && arg4 == null ? null : new int[local962];
							@Pc(1002) int local1002 = -1;
							@Pc(1004) int local1004 = -1;
							@Pc(1006) int local1006 = 256;
							@Pc(1100) byte local1100;
							@Pc(1022) int local1022;
							@Pc(1024) int local1024;
							@Pc(1253) int local1253;
							@Pc(1259) int local1259;
							@Pc(1267) int local1267;
							@Pc(1272) int local1272;
							@Pc(1289) int local1289;
							@Pc(1277) int local1277;
							@Pc(1294) int local1294;
							@Pc(1343) int local1343;
							@Pc(1350) int local1350;
							if (local159 != null) {
								local1002 = local159.anInt8497;
								local1006 = local159.anInt8503;
								local1004 = local159.anInt8500;
								local1022 = Static592.method7862(arg0, local159);
								for (local1024 = 0; local1024 < local389; local1024++) {
									if (local85[-local97 & 0x3] && local956 == local819[0]) {
										Static590.anIntArray734[0] = local849[local956];
										Static590.anIntArray734[1] = 1;
										Static590.anIntArray734[2] = local841[local956];
										Static590.anIntArray734[3] = 1;
										Static590.anIntArray734[4] = local845[local956];
										local1100 = 6;
										Static590.anIntArray734[5] = local841[local956];
									} else if (local85[2 - local97 & 0x3] && local956 == local819[2]) {
										Static590.anIntArray734[0] = local849[local956];
										Static590.anIntArray734[1] = 5;
										Static590.anIntArray734[2] = local841[local956];
										Static590.anIntArray734[3] = 5;
										Static590.anIntArray734[4] = local845[local956];
										local1100 = 6;
										Static590.anIntArray734[5] = local841[local956];
									} else if (local85[1 - local97 & 0x3] && local819[1] == local956) {
										Static590.anIntArray734[0] = local849[local956];
										Static590.anIntArray734[1] = 3;
										Static590.anIntArray734[2] = local841[local956];
										Static590.anIntArray734[3] = 3;
										Static590.anIntArray734[4] = local845[local956];
										local1100 = 6;
										Static590.anIntArray734[5] = local841[local956];
									} else if (local85[3 - local97 & 0x3] && local956 == local819[3]) {
										Static590.anIntArray734[0] = local849[local956];
										Static590.anIntArray734[1] = 7;
										Static590.anIntArray734[2] = local841[local956];
										Static590.anIntArray734[3] = 7;
										Static590.anIntArray734[4] = local845[local956];
										local1100 = 6;
										Static590.anIntArray734[5] = local841[local956];
									} else {
										Static590.anIntArray734[0] = local849[local956];
										Static590.anIntArray734[1] = local845[local956];
										local1100 = 3;
										Static590.anIntArray734[2] = local841[local956];
									}
									local956++;
									for (local1253 = 0; local1253 < local1100; local1253++) {
										local1259 = Static590.anIntArray734[local1253];
										local1267 = local1259 - local97 * 2 & 0x7;
										local1272 = this.anIntArray54[local1259];
										local1277 = this.anIntArray53[local1259];
										if (local97 == 1) {
											local1289 = local1277;
											local1294 = 512 - local1272;
										} else if (local97 == 2) {
											local1289 = 512 - local1272;
											local1294 = 512 - local1277;
										} else if (local97 == 3) {
											local1294 = local1272;
											local1289 = 512 - local1277;
										} else {
											local1289 = local1272;
											local1294 = local1277;
										}
										local972[local958] = local1289;
										local975[local958] = local1294;
										if (local991 != null && Static391.aBooleanArrayArray6[local91][local1259]) {
											local1343 = local1289 + (local27 << 9);
											local1350 = (local47 << 9) + local1294;
											local991[local958] = arg3.method7550(local1343, local1350) - arg2.method7550(local1343, local1350);
										}
										if (local1000 != null) {
											if (arg3 != null && !Static391.aBooleanArrayArray6[local91][local1259]) {
												local1343 = local1289 + (local27 << 9);
												local1350 = local1294 + (local47 << 9);
												local1000[local958] = arg2.method7550(local1343, local1350) - arg3.method7550(local1343, local1350);
											} else if (arg4 != null && !Static543.aBooleanArrayArray7[local91][local1259]) {
												local1343 = local1289 + (local27 << 9);
												local1350 = local1294 + (local47 << 9);
												local1000[local958] = arg4.method7550(local1343, local1350) - arg2.method7550(local1343, local1350);
											}
										}
										if (local1259 < 8 && local159.anInt8506 < Static190.anIntArray308[local1267]) {
											if (local969 != null) {
												local969[local958] = Static493.anIntArray643[local1267];
											}
											local984[local958] = Static566.anIntArray711[local1267];
											local981[local958] = Static349.anIntArray476[local1267];
											local978[local958] = Static171.anIntArray267[local1267];
										} else {
											if (local969 != null) {
												local969[local958] = local1022;
											}
											local981[local958] = local159.anInt8500;
											local984[local958] = local159.anInt8503;
											local978[local958] = local1002;
										}
										local958++;
									}
								}
								if (!this.aBoolean48 && arg1 == 0) {
									Static596.method747(local27, local47, local159.anInt8505, local159.anInt8495 * 8, local159.anInt8498);
								}
								if (local91 != 12 && local159.anInt8497 != -1 && local159.aBoolean658) {
									local80 = true;
								}
							} else if (local817) {
								local956 = Static500.anIntArray685[local91];
							} else if (local82) {
								local956 = Static484.anIntArray628[local91];
							} else {
								local956 = Static66.anIntArray111[local91];
							}
							if (local171 != null) {
								if (local121 == 0) {
									local121 = local113;
								}
								if (local137 == 0) {
									local137 = local113;
								}
								if (local129 == 0) {
									local129 = local113;
								}
								@Pc(1594) Class261 local1594 = this.aClass322_2.method7131(local113 - 1);
								@Pc(1602) Class261 local1602 = this.aClass322_2.method7131(local121 - 1);
								@Pc(1610) Class261 local1610 = this.aClass322_2.method7131(local129 - 1);
								@Pc(1618) Class261 local1618 = this.aClass322_2.method7131(local137 - 1);
								for (local1267 = 0; local1267 < local377; local1267++) {
									if (local85[-local97 & 0x3] && local819[0] == local956) {
										Static590.anIntArray734[0] = local849[local956];
										Static590.anIntArray734[1] = 1;
										Static590.anIntArray734[2] = local841[local956];
										Static590.anIntArray734[3] = 1;
										Static590.anIntArray734[4] = local845[local956];
										Static590.anIntArray734[5] = local841[local956];
										local1100 = 6;
									} else if (local85[2 - local97 & 0x3] && local956 == local819[2]) {
										Static590.anIntArray734[0] = local849[local956];
										Static590.anIntArray734[1] = 5;
										Static590.anIntArray734[2] = local841[local956];
										Static590.anIntArray734[3] = 5;
										Static590.anIntArray734[4] = local845[local956];
										local1100 = 6;
										Static590.anIntArray734[5] = local841[local956];
									} else if (local85[1 - local97 & 0x3] && local956 == local819[1]) {
										Static590.anIntArray734[0] = local849[local956];
										Static590.anIntArray734[1] = 3;
										Static590.anIntArray734[2] = local841[local956];
										Static590.anIntArray734[3] = 3;
										Static590.anIntArray734[4] = local845[local956];
										Static590.anIntArray734[5] = local841[local956];
										local1100 = 6;
									} else if (local85[3 - local97 & 0x3] && local819[3] == local956) {
										Static590.anIntArray734[0] = local849[local956];
										Static590.anIntArray734[1] = 7;
										Static590.anIntArray734[2] = local841[local956];
										Static590.anIntArray734[3] = 7;
										Static590.anIntArray734[4] = local845[local956];
										local1100 = 6;
										Static590.anIntArray734[5] = local841[local956];
									} else {
										Static590.anIntArray734[0] = local849[local956];
										Static590.anIntArray734[1] = local845[local956];
										local1100 = 3;
										Static590.anIntArray734[2] = local841[local956];
									}
									for (local1272 = 0; local1272 < local1100; local1272++) {
										local1289 = Static590.anIntArray734[local1272];
										local1277 = local1289 - local97 * 2 & 0x7;
										local1294 = this.anIntArray54[local1289];
										local1350 = this.anIntArray53[local1289];
										@Pc(1887) int local1887;
										if (local97 == 1) {
											local1343 = local1350;
											local1887 = 512 - local1294;
										} else if (local97 == 2) {
											local1887 = 512 - local1350;
											local1343 = 512 - local1294;
										} else if (local97 == 3) {
											local1343 = 512 - local1350;
											local1887 = local1294;
										} else {
											local1343 = local1294;
											local1887 = local1350;
										}
										local972[local958] = local1343;
										local975[local958] = local1887;
										@Pc(1939) int local1939;
										@Pc(1945) int local1945;
										if (local991 != null && Static391.aBooleanArrayArray6[local91][local1289]) {
											local1939 = local1343 + (local27 << 9);
											local1945 = local1887 + (local47 << 9);
											local991[local958] = arg3.method7550(local1939, local1945) - arg2.method7550(local1939, local1945);
										}
										if (local1000 != null) {
											if (arg3 != null && !Static391.aBooleanArrayArray6[local91][local1289]) {
												local1939 = (local27 << 9) + local1343;
												local1945 = local1887 + (local47 << 9);
												local1000[local958] = arg2.method7550(local1939, local1945) - arg3.method7550(local1939, local1945);
											} else if (arg4 != null && !Static543.aBooleanArrayArray7[local91][local1289]) {
												local1939 = local1343 + (local27 << 9);
												local1945 = (local47 << 9) + local1887;
												local1000[local958] = arg4.method7550(local1939, local1945) - arg2.method7550(local1939, local1945);
											}
										}
										if (local1289 < 8 && Static190.anIntArray308[local1277] >= 0) {
											if (local969 != null) {
												local969[local958] = Static493.anIntArray643[local1277];
											}
											local984[local958] = Static566.anIntArray711[local1277];
											local981[local958] = Static349.anIntArray476[local1277];
											local978[local958] = Static171.anIntArray267[local1277];
										} else {
											if (local82 && Static391.aBooleanArrayArray6[local91][local1289]) {
												local981[local958] = local1004;
												local984[local958] = local1006;
												local978[local958] = local1002;
											} else if (local1343 == 0 && local1887 == 0) {
												local978[local958] = arg5[local27][local47];
												local981[local958] = local1594.anInt7078;
												local984[local958] = local1594.anInt7070;
											} else if (local1343 == 0 && local1887 == 512) {
												local978[local958] = arg5[local27][local65];
												local981[local958] = local1602.anInt7078;
												local984[local958] = local1602.anInt7070;
											} else if (local1343 == 512 && local1887 == 512) {
												local978[local958] = arg5[local45][local65];
												local981[local958] = local1610.anInt7078;
												local984[local958] = local1610.anInt7070;
											} else if (local1343 == 512 && local1887 == 0) {
												local978[local958] = arg5[local45][local47];
												local981[local958] = local1618.anInt7078;
												local984[local958] = local1618.anInt7070;
											} else {
												if (local1343 >= 256) {
													if (local1887 >= 256) {
														local981[local958] = local1610.anInt7078;
														local984[local958] = local1610.anInt7070;
													} else {
														local981[local958] = local1618.anInt7078;
														local984[local958] = local1618.anInt7070;
													}
												} else if (local1887 >= 256) {
													local981[local958] = local1602.anInt7078;
													local984[local958] = local1602.anInt7070;
												} else {
													local981[local958] = local1594.anInt7078;
													local984[local958] = local1594.anInt7070;
												}
												local1939 = Static180.method4643(local1343 << 7 >> 9, arg5[local27][local47], arg5[local45][local47]);
												local1945 = Static180.method4643(local1343 << 7 >> 9, arg5[local27][local65], arg5[local45][local65]);
												local978[local958] = Static180.method4643(local1887 << 7 >> 9, local1939, local1945);
											}
											if (local969 != null) {
												local969[local958] = local978[local958];
											}
										}
										local958++;
									}
									local956++;
								}
								if (local91 != 0 && local171.aBoolean567) {
									local80 = true;
								}
							}
							local1022 = arg2.method7545(local27, local47);
							local1024 = arg2.method7545(local45, local47);
							local1253 = arg2.method7545(local45, local65);
							local1259 = arg2.method7545(local27, local65);
							if (arg1 > 0) {
								@Pc(2376) boolean local2376 = true;
								if (local171 != null && !local171.aBoolean566) {
									local2376 = false;
								} else if (local113 == 0 && local91 != 0) {
									local2376 = false;
								} else if (local105 > 0 && local182 != null && !local182.aBoolean660) {
									local2376 = false;
								}
								if (local2376 && local1024 == local1022 && local1253 == local1022 && local1259 == local1022) {
									this.aByteArrayArrayArray9[arg1][local27][local47] = (byte) (this.aByteArrayArrayArray9[arg1][local27][local47] | 0x4);
								}
							}
							local1267 = 0;
							local1272 = 0;
							local1289 = 0;
							if (this.aBoolean48) {
								local1267 = Static189.method2919(local27, local47);
								local1272 = Static379.method5065(local27, local47);
								local1289 = Static248.method3689(local27, local47);
							}
							arg2.O(local27, local47, local972, local991, local975, local1000, local978, local969, local981, local984, local1267, local1272, local1289, local80);
							Static488.method2260(arg1, local27, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!i;BLclient!r;Lclient!i;)V")
	public final void method406(@OriginalArg(0) Class47 arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) Class47 arg2) {
		@Pc(19) int[][] local19 = new int[this.anInt480][this.anInt493];
		if (Static142.anIntArray229 == null || this.anInt493 != Static142.anIntArray229.length) {
			Static526.anIntArray671 = new int[this.anInt493];
			Static339.anIntArray458 = new int[this.anInt493];
			Static466.anIntArray618 = new int[this.anInt493];
			Static142.anIntArray229 = new int[this.anInt493];
			Class134_Sub2.lb = new int[this.anInt493];
		}
		@Pc(52) int local52;
		for (@Pc(48) int local48 = 0; local48 < this.anInt490; local48++) {
			for (local52 = 0; local52 < this.anInt493; local52++) {
				Static142.anIntArray229[local52] = 0;
				Static526.anIntArray671[local52] = 0;
				Static339.anIntArray458[local52] = 0;
				Class134_Sub2.lb[local52] = 0;
				Static466.anIntArray618[local52] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt480; local81++) {
				@Pc(91) int local91;
				@Pc(110) int local110;
				@Pc(179) int local179;
				for (@Pc(85) int local85 = 0; local85 < this.anInt493; local85++) {
					local91 = local81 + 5;
					@Pc(159) int local159;
					if (this.anInt480 > local91) {
						local110 = this.aByteArrayArrayArray11[local48][local91][local85] & 0xFF;
						if (local110 > 0) {
							@Pc(123) Class261 local123 = this.aClass322_2.method7131(local110 - 1);
							Static142.anIntArray229[local85] += local123.anInt7079;
							Static526.anIntArray671[local85] += local123.anInt7076;
							Static339.anIntArray458[local85] += local123.anInt7082;
							Class134_Sub2.lb[local85] += local123.anInt7068;
							local159 = Static466.anIntArray618[local85]++;
						}
					}
					local110 = local81 - 5;
					if (local110 >= 0) {
						local179 = this.aByteArrayArrayArray11[local48][local110][local85] & 0xFF;
						if (local179 > 0) {
							@Pc(189) Class261 local189 = this.aClass322_2.method7131(local179 - 1);
							Static142.anIntArray229[local85] -= local189.anInt7079;
							Static526.anIntArray671[local85] -= local189.anInt7076;
							Static339.anIntArray458[local85] -= local189.anInt7082;
							Class134_Sub2.lb[local85] -= local189.anInt7068;
							local159 = Static466.anIntArray618[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local110 = 0;
					local179 = 0;
					@Pc(247) int local247 = 0;
					@Pc(249) int local249 = 0;
					for (@Pc(251) int local251 = -5; local251 < this.anInt493; local251++) {
						@Pc(257) int local257 = local251 + 5;
						if (local257 < this.anInt493) {
							local179 += Static339.anIntArray458[local257];
							local110 += Static526.anIntArray671[local257];
							local249 += Static466.anIntArray618[local257];
							local91 += Static142.anIntArray229[local257];
							local247 += Class134_Sub2.lb[local257];
						}
						@Pc(295) int local295 = local251 - 5;
						if (local295 >= 0) {
							local91 -= Static142.anIntArray229[local295];
							local249 -= Static466.anIntArray618[local295];
							local110 -= Static526.anIntArray671[local295];
							local179 -= Static339.anIntArray458[local295];
							local247 -= Class134_Sub2.lb[local295];
						}
						if (local251 >= 0 && local247 > 0 && local249 > 0) {
							local19[local81][local251] = Static49.method749(local110 / local249, local179 / local249, local91 * 256 / local247);
						}
					}
				}
			}
			if (Static308.aBoolean424) {
				this.method405(arg1, local48, Static199.aClass47Array1[local48], local48 == 0 ? arg2 : null, local48 == 0 ? arg0 : null, local19);
			} else {
				this.method412(local48 == 0 ? arg2 : null, local19, arg1, Static199.aClass47Array1[local48], local48 == 0 ? arg0 : null, local48);
			}
			this.aByteArrayArrayArray11[local48] = null;
			this.aByteArrayArrayArray8[local48] = null;
			this.aByteArrayArrayArray12[local48] = null;
			this.aByteArrayArrayArray7[local48] = null;
		}
		if (!this.aBoolean48) {
			if (Static315.anInt5405 != 0) {
				Static346.method4713();
			}
			if (Static153.aBoolean210) {
				Static530.method7278();
			}
		}
		for (local52 = 0; local52 < this.anInt490; local52++) {
			Static199.aClass47Array1[local52].BA();
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIZIIIIIIILclient!mo;)V")
	private void method407(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class1_Sub35 arg9) {
		if (arg7 == 1) {
			arg2 = 1;
		} else if (arg7 == 2) {
			arg8 = 1;
			arg2 = 1;
		} else if (arg7 == 3) {
			arg8 = 1;
		}
		@Pc(68) int local68;
		if (arg4 < 0 || arg4 >= this.anInt480 || arg0 < 0 || arg0 >= this.anInt493) {
			while (true) {
				local68 = arg9.method5750();
				if (local68 == 0) {
					return;
				}
				if (local68 == 1) {
					arg9.method5750();
					return;
				}
				if (local68 <= 49) {
					arg9.method5750();
				}
			}
			return;
		}
		if (!this.aBoolean48 && !arg1) {
			Static455.aByteArrayArrayArray17[arg5][arg4][arg0] = 0;
		}
		while (true) {
			local68 = arg9.method5750();
			if (local68 == 0) {
				if (this.aBoolean48) {
					this.anIntArrayArrayArray2[0][arg4 + arg8][arg0 + arg2] = 0;
					return;
				} else if (arg5 == 0) {
					this.anIntArrayArrayArray2[0][arg4 + arg8][arg0 + arg2] = -Static169.method2413(arg3 + 932731, arg6 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray2[arg5][arg8 + arg4][arg0 + arg2] = this.anIntArrayArrayArray2[arg5 - 1][arg8 + arg4][arg0 + arg2] - 960;
					return;
				}
			}
			if (local68 == 1) {
				@Pc(160) int local160 = arg9.method5750();
				if (this.aBoolean48) {
					this.anIntArrayArrayArray2[0][arg8 + arg4][arg0 + arg2] = local160 * 8 << 2;
					return;
				}
				if (local160 == 1) {
					local160 = 0;
				}
				if (arg5 == 0) {
					this.anIntArrayArrayArray2[0][arg8 + arg4][arg0 + arg2] = -local160 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray2[arg5][arg4 + arg8][arg0 + arg2] = this.anIntArrayArrayArray2[arg5 - 1][arg8 + arg4][arg2 + arg0] - (local160 * 8 << 2);
				return;
			}
			if (local68 <= 49) {
				if (arg1) {
					arg9.method5750();
				} else {
					this.aByteArrayArrayArray8[arg5][arg4][arg0] = arg9.method5751();
					this.aByteArrayArrayArray12[arg5][arg4][arg0] = (byte) ((local68 - 2) / 4);
					this.aByteArrayArrayArray7[arg5][arg4][arg0] = (byte) (local68 + arg7 - 2 & 0x3);
				}
			} else if (local68 <= 81) {
				if (!this.aBoolean48 && !arg1) {
					Static455.aByteArrayArrayArray17[arg5][arg4][arg0] = (byte) (local68 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray11[arg5][arg4][arg0] = (byte) (local68 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B[[II)V")
	public final void method409(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray2[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt480 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt493 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIBII)V")
	public final void method410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt490; local15++) {
			this.method411(arg1, arg0, local15);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIII)V")
	private void method411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15;
		for (@Pc(11) int local11 = arg0; local11 < arg0 + 64; local11++) {
			for (local15 = arg1; local15 < arg1 + 64; local15++) {
				if (local15 >= 0 && local15 < this.anInt480 && local11 >= 0 && this.anInt493 > local11) {
					this.anIntArrayArrayArray2[arg2][local15][local11] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray2[arg2 - 1][local15][local11] - 960;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt480) {
			for (local15 = arg0 + 1; local15 < arg0 + 64; local15++) {
				if (local15 >= 0 && local15 < this.anInt493) {
					this.anIntArrayArrayArray2[arg2][arg1][local15] = this.anIntArrayArrayArray2[arg2][arg1 - 1][local15];
				}
			}
		}
		if (arg0 > 0 && this.anInt493 > arg0) {
			for (local15 = arg1 + 1; local15 < arg1 + 64; local15++) {
				if (local15 >= 0 && local15 < this.anInt480) {
					this.anIntArrayArrayArray2[arg2][local15][arg0] = this.anIntArrayArrayArray2[arg2][local15][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || arg1 >= this.anInt480 || this.anInt493 <= arg0) {
			return;
		}
		if (arg2 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0] != this.anIntArrayArrayArray2[arg2 - 1][arg1 - 1][arg0]) {
				this.anIntArrayArrayArray2[arg2][arg1][arg0] = this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray2[arg2 - 1][arg1][arg0 - 1] != this.anIntArrayArrayArray2[arg2][arg1][arg0 - 1]) {
				this.anIntArrayArrayArray2[arg2][arg1][arg0] = this.anIntArrayArrayArray2[arg2][arg1][arg0 - 1];
				return;
			}
			if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0 - 1] != this.anIntArrayArrayArray2[arg2 - 1][arg1 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray2[arg2][arg1][arg0] = this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0] != 0) {
			this.anIntArrayArrayArray2[arg2][arg1][arg0] = this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray2[arg2][arg1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray2[arg2][arg1][arg0] = this.anIntArrayArrayArray2[arg2][arg1][arg0 - 1];
			return;
		}
		if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray2[arg2][arg1][arg0] = this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!i;[[ILclient!r;Lclient!i;Lclient!i;I)V")
	private void method412(@OriginalArg(1) Class47 arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) Class134 arg2, @OriginalArg(4) Class47 arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt480; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt493; local11++) {
				if (Static32.anInt509 == -1 || Static53.method976(arg5, local11, Static32.anInt509, local7)) {
					@Pc(34) byte local34 = this.aByteArrayArrayArray12[arg5][local7][local11];
					@Pc(43) byte local43 = this.aByteArrayArrayArray7[arg5][local7][local11];
					@Pc(54) int local54 = this.aByteArrayArrayArray8[arg5][local7][local11] & 0xFF;
					@Pc(65) int local65 = this.aByteArrayArrayArray11[arg5][local7][local11] & 0xFF;
					@Pc(77) Class314 local77 = local54 == 0 ? null : this.aClass181_2.method3760(local54 - 1);
					@Pc(89) Class261 local89 = local65 == 0 ? null : this.aClass322_2.method7131(local65 - 1);
					@Pc(91) int local91 = 0;
					@Pc(93) int local93 = 0;
					if (local34 != 0) {
						local91 = local89 == null ? 0 : Static386.anIntArray519[local34];
						local93 = local77 == null ? 0 : Static500.anIntArray685[local34];
					} else if (local77 != null) {
						local93 = Static500.anIntArray685[local34];
					} else if (local89 != null) {
						local91 = Static500.anIntArray685[local34];
					}
					@Pc(134) int local134 = local91 + local93;
					@Pc(136) int local136 = 0;
					if (local134 != 0) {
						@Pc(145) int local145;
						if (Static588.aBoolean751) {
							local145 = local77 == null ? -1 : local77.anInt8500;
						} else {
							local145 = -1;
						}
						@Pc(157) int[] local157 = new int[local134];
						@Pc(160) int[] local160 = new int[local134];
						@Pc(163) int[] local163 = new int[local134];
						@Pc(166) int[] local166 = new int[local134];
						@Pc(168) boolean local168 = false;
						@Pc(183) int local183;
						if (local77 == null || local77.anInt8497 == -1 && local77.anInt8502 == -1 && local145 == -1) {
							for (local183 = 0; local183 < local93; local183++) {
								local157[local136] = -1;
								local136++;
							}
						} else {
							for (local183 = 0; local183 < local93; local183++) {
								local163[local136] = local145;
								local166[local136] = local77.anInt8503;
								if (local77.anInt8497 == -1) {
									local157[local136] = -1;
								} else {
									local157[local136] = local77.anInt8497;
								}
								if (local77.anInt8502 == -1) {
									local160[local136] = -1;
								} else {
									local168 = true;
									local160[local136] = local77.anInt8502;
								}
								local136++;
							}
							if (!this.aBoolean48 && arg5 == 0) {
								Static596.method747(local7, local11, local77.anInt8505, local77.anInt8495 * 8, local77.anInt8498);
							}
						}
						if (!local168) {
							local160 = null;
						}
						if (local89 == null) {
							for (local183 = 0; local183 < local91; local183++) {
								local157[local136] = -1;
								local136++;
							}
						} else {
							local183 = local89.anInt7078;
							if (Static588.aBoolean751) {
								local183 = -1;
							}
							for (@Pc(287) int local287 = 0; local287 < local91; local287++) {
								local163[local136] = local183;
								local166[local136] = local89.anInt7070;
								local157[local136] = arg1[local7][local11];
								if (local160 != null) {
									local160[local136] = -1;
								}
								local136++;
							}
						}
						local183 = this.anIntArray54.length;
						@Pc(343) int[] local343 = new int[local183];
						@Pc(346) int[] local346 = new int[local183];
						@Pc(353) int[] local353 = arg0 == null ? null : new int[local183];
						@Pc(362) int[] local362 = arg0 == null && arg4 == null ? null : new int[local183];
						@Pc(371) int local371;
						@Pc(376) int local376;
						@Pc(461) int local461;
						@Pc(468) int local468;
						for (@Pc(364) int local364 = 0; local364 < local183; local364++) {
							local371 = this.anIntArray54[local364];
							local376 = this.anIntArray53[local364];
							if (local43 == 0) {
								local343[local364] = local371;
								local346[local364] = local376;
							} else if (local43 == 1) {
								local343[local364] = local376;
								local346[local364] = 512 - local371;
							} else if (local43 == 2) {
								local343[local364] = 512 - local371;
								local346[local364] = 512 - local376;
							} else if (local43 == 3) {
								local343[local364] = 512 - local376;
								local346[local364] = local371;
							}
							if (local353 != null && Static391.aBooleanArrayArray6[local34][local364]) {
								local461 = (local7 << 9) + local371;
								local468 = (local11 << 9) + local371;
								local353[local364] = arg0.method7550(local461, local468) - arg3.method7550(local461, local468);
							}
							if (local362 != null) {
								if (arg0 != null && !Static391.aBooleanArrayArray6[local34][local364]) {
									local461 = (local7 << 9) + local371;
									local468 = (local11 << 9) + local371;
									local362[local364] = arg3.method7550(local461, local468) - arg0.method7550(local461, local468);
								} else if (arg4 != null && !Static543.aBooleanArrayArray7[local34][local364]) {
									local461 = (local7 << 9) + local371;
									local468 = (local11 << 9) + local371;
									local362[local364] = arg4.method7550(local461, local468) - arg3.method7550(local461, local468);
								}
							}
						}
						local371 = arg3.method7545(local7, local11);
						local376 = arg3.method7545(local7 + 1, local11);
						local461 = arg3.method7545(local7 + 1, local11 - -1);
						local468 = arg3.method7545(local7, local11 + 1);
						if (arg5 > 0) {
							@Pc(602) boolean local602 = true;
							if (local89 != null && !local89.aBoolean566) {
								local602 = false;
							} else if (local65 == 0 && local34 != 0) {
								local602 = false;
							} else if (local54 > 0 && local77 != null && !local77.aBoolean660) {
								local602 = false;
							}
							if (local602 && local376 == local371 && local461 == local371 && local468 == local371) {
								this.aByteArrayArrayArray9[arg5][local7][local11] = (byte) (this.aByteArrayArrayArray9[arg5][local7][local11] | 0x4);
							}
						}
						@Pc(671) int local671 = 0;
						@Pc(673) int local673 = 0;
						@Pc(675) int local675 = 0;
						if (this.aBoolean48) {
							local671 = Static189.method2919(local7, local11);
							local673 = Static379.method5065(local7, local11);
							local675 = Static248.method3689(local7, local11);
						}
						arg3.method7546(local7, local11, local343, local353, local346, local362, Static45.anIntArrayArray29[local34], Static370.anIntArrayArray143[local34], Static559.anIntArrayArray198[local34], local157, local160, local163, local166, local671, local673, local675);
						Static488.method2260(arg5, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([[[ILclient!r;[Lclient!cp;B)V")
	public final void method413(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class59[] arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		if (!this.aBoolean48) {
			for (local14 = 0; local14 < 4; local14++) {
				for (local18 = 0; local18 < this.anInt480; local18++) {
					for (local22 = 0; local22 < this.anInt493; local22++) {
						if ((Static455.aByteArrayArrayArray17[local14][local18][local22] & 0x1) != 0) {
							@Pc(36) int local36 = local14;
							if ((Static455.aByteArrayArrayArray17[1][local18][local22] & 0x2) != 0) {
								local36 = local14 - 1;
							}
							if (local36 >= 0) {
								arg2[local36].method1197(local18, local22);
							}
						}
					}
				}
			}
		}
		for (local14 = 0; local14 < this.anInt490; local14++) {
			local18 = 0;
			local22 = 0;
			if (!this.aBoolean48) {
				if (Static153.aBoolean210) {
					local18 = 2;
				}
				if (Static363.aBoolean470) {
					local22 = 8;
				}
				if (Static315.anInt5405 != 0) {
					local18 |= 0x1;
					if (Static556.aBoolean726 | local14 == 0) {
						local22 |= 0x10;
					}
				}
			}
			if (Static153.aBoolean210) {
				local22 |= 0x7;
			}
			if (!Static83.aBoolean144) {
				local22 |= 0x20;
			}
			@Pc(147) int[][] local147 = arg0 == null || arg0.length <= local14 ? this.anIntArrayArrayArray2[local14] : arg0[local14];
			Static538.method7355(local14, arg1.method6902(this.anInt480, this.anInt493, this.anIntArrayArrayArray2[local14], local147, local18, local22));
		}
	}
}
