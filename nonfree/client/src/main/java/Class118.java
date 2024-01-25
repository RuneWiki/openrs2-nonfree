import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public class Class118 {

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "[I")
	private final int[] anIntArray296 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "[I")
	private final int[] anIntArray295 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
	protected final int anInt3842;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
	public final int anInt3843;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "Z")
	public final boolean aBoolean242;

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
	protected final int anInt3847;

	@OriginalMember(owner = "client!oq", name = "C", descriptor = "Lclient!er;")
	private final Class81 aClass81_4;

	@OriginalMember(owner = "client!oq", name = "E", descriptor = "Lclient!caa;")
	private final Class40 aClass40_5;

	@OriginalMember(owner = "client!oq", name = "D", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIZLclient!er;Lclient!caa;)V")
	protected Class118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class81 arg4, @OriginalArg(5) Class40 arg5) {
		this.anInt3842 = arg1;
		this.anInt3843 = arg0;
		this.aBoolean242 = arg3;
		this.anInt3847 = arg2;
		this.aClass81_4 = arg4;
		this.aClass40_5 = arg5;
		this.aByteArrayArrayArray15 = new byte[this.anInt3843][this.anInt3842][this.anInt3847];
		this.aByteArrayArrayArray12 = new byte[this.anInt3843][this.anInt3842][this.anInt3847];
		this.aByteArrayArrayArray10 = new byte[this.anInt3843][this.anInt3842][this.anInt3847];
		this.aByteArrayArrayArray11 = new byte[this.anInt3843][this.anInt3842 + 1][this.anInt3847 + 1];
		this.anIntArrayArrayArray6 = new int[this.anInt3843][this.anInt3842 + 1][this.anInt3847 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt3843][this.anInt3842][this.anInt3847];
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "([[BIII[[BLclient!ls;Lclient!qa;I[[BBILclient!dp;I[Z)V")
	private void method3433(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) Class184 arg5, @OriginalArg(6) Class9 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class63 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean[] arg12) {
		@Pc(16) boolean[] local16 = arg5 != null && arg5.aBoolean387 ? Static205.aBooleanArrayArray1[arg9] : Static353.aBooleanArrayArray5[arg9];
		@Pc(35) int local35;
		@Pc(48) Class184 local48;
		@Pc(66) byte local66;
		@Pc(82) int local82;
		@Pc(87) int local87;
		if (arg3 > 0) {
			if (arg11 > 0) {
				local35 = arg4[arg11 - 1][arg3 - 1] & 0xFF;
				if (local35 > 0) {
					local48 = this.aClass81_4.method2640(local35 - 1);
					if (local48.anInt5596 != -1 && local48.aBoolean387) {
						local66 = arg8[arg11 - 1][arg3 - 1];
						local82 = arg0[arg11 - 1][arg3 - 1] * 2 + 4 & 0x7;
						local87 = Static294.method4945(arg6, local48);
						if (Static237.aBooleanArrayArray3[local66][local82]) {
							Static150.anIntArray269[0] = local48.anInt5596;
							Static278.anIntArray394[0] = local87;
							Static461.anIntArray622[0] = arg6.method7640() ? local48.anInt5595 : local48.anInt5604;
							Static21.anIntArray39[0] = local48.anInt5608;
							Static409.anIntArray535[0] = local48.anInt5599;
							Static74.anIntArray171[0] = 256;
						}
					}
				}
			}
			if (arg7 - 1 > arg11) {
				local35 = arg4[arg11 + 1][arg3 - 1] & 0xFF;
				if (local35 > 0) {
					local48 = this.aClass81_4.method2640(local35 - 1);
					if (local48.anInt5596 != -1 && local48.aBoolean387) {
						local66 = arg8[arg11 + 1][arg3 - 1];
						local82 = arg0[arg11 + 1][arg3 - 1] * 2 + 6 & 0x7;
						local87 = Static294.method4945(arg6, local48);
						if (Static237.aBooleanArrayArray3[local66][local82]) {
							Static150.anIntArray269[2] = local48.anInt5596;
							Static278.anIntArray394[2] = local87;
							Static461.anIntArray622[2] = arg6.method7640() ? local48.anInt5595 : local48.anInt5604;
							Static21.anIntArray39[2] = local48.anInt5608;
							Static409.anIntArray535[2] = local48.anInt5599;
							Static74.anIntArray171[2] = 512;
						}
					}
				}
			}
		}
		if (arg3 < arg2 - 1) {
			if (arg11 > 0) {
				local35 = arg4[arg11 - 1][arg3 + 1] & 0xFF;
				if (local35 > 0) {
					local48 = this.aClass81_4.method2640(local35 - 1);
					if (local48.anInt5596 != -1 && local48.aBoolean387) {
						local66 = arg8[arg11 - 1][arg3 + 1];
						local82 = arg0[arg11 - 1][arg3 + 1] * 2 + 2 & 0x7;
						local87 = Static294.method4945(arg6, local48);
						if (Static237.aBooleanArrayArray3[local66][local82]) {
							Static150.anIntArray269[6] = local48.anInt5596;
							Static278.anIntArray394[6] = local87;
							Static461.anIntArray622[6] = arg6.method7640() ? local48.anInt5595 : local48.anInt5604;
							Static21.anIntArray39[6] = local48.anInt5608;
							Static409.anIntArray535[6] = local48.anInt5599;
							Static74.anIntArray171[6] = 64;
						}
					}
				}
			}
			if (arg7 - 1 > arg11) {
				local35 = arg4[arg11 + 1][arg3 + 1] & 0xFF;
				if (local35 > 0) {
					local48 = this.aClass81_4.method2640(local35 - 1);
					if (local48.anInt5596 != -1 && local48.aBoolean387) {
						local66 = arg8[arg11 + 1][arg3 + 1];
						local82 = --(arg0[arg11 + 1][arg3 + 1] * 2) & 0x7;
						local87 = Static294.method4945(arg6, local48);
						if (Static237.aBooleanArrayArray3[local66][local82]) {
							Static150.anIntArray269[4] = local48.anInt5596;
							Static278.anIntArray394[4] = local87;
							Static461.anIntArray622[4] = arg6.method7640() ? local48.anInt5595 : local48.anInt5604;
							Static21.anIntArray39[4] = local48.anInt5608;
							Static409.anIntArray535[4] = local48.anInt5599;
							Static74.anIntArray171[4] = 128;
						}
					}
				}
			}
		}
		@Pc(537) int local537;
		@Pc(542) int local542;
		@Pc(544) int local544;
		@Pc(507) byte local507;
		if (arg3 > 0) {
			local35 = arg4[arg11][arg3 - 1] & 0xFF;
			if (local35 > 0) {
				local48 = this.aClass81_4.method2640(local35 - 1);
				if (local48.anInt5596 != -1) {
					local66 = arg8[arg11][arg3 - 1];
					local507 = arg0[arg11][arg3 - 1];
					if (local48.aBoolean387) {
						local87 = 2;
						local537 = local507 * 2 + 4;
						local542 = Static294.method4945(arg6, local48);
						for (local544 = 0; local544 < 3; local544++) {
							local87 &= 0x7;
							local537 &= 0x7;
							if (Static237.aBooleanArrayArray3[local66][local537] && Static409.anIntArray535[local87] <= local48.anInt5599) {
								Static150.anIntArray269[local87] = local48.anInt5596;
								Static278.anIntArray394[local87] = local542;
								Static461.anIntArray622[local87] = arg6.method7640() ? local48.anInt5595 : local48.anInt5604;
								Static21.anIntArray39[local87] = local48.anInt5608;
								if (local48.anInt5599 == Static409.anIntArray535[local87]) {
									Static74.anIntArray171[local87] |= 0x20;
								} else {
									Static74.anIntArray171[local87] = 32;
								}
								Static409.anIntArray535[local87] = local48.anInt5599;
							}
							local537++;
							local87--;
						}
						if (!local16[arg1 & 0x3]) {
							arg12[0] = Static205.aBooleanArrayArray1[local66][local507 + 2 & 0x3];
						}
					} else if (!local16[arg1 & 0x3]) {
						arg12[0] = Static353.aBooleanArrayArray5[local66][local507 + 2 & 0x3];
					}
				}
			}
		}
		if (arg2 - 1 > arg3) {
			local35 = arg4[arg11][arg3 + 1] & 0xFF;
			if (local35 > 0) {
				local48 = this.aClass81_4.method2640(local35 - 1);
				if (local48.anInt5596 != -1) {
					local66 = arg8[arg11][arg3 + 1];
					local507 = arg0[arg11][arg3 + 1];
					if (local48.aBoolean387) {
						local87 = 4;
						local537 = local507 * 2 + 2;
						local542 = Static294.method4945(arg6, local48);
						for (local544 = 0; local544 < 3; local544++) {
							local537 &= 0x7;
							local87 &= 0x7;
							if (Static237.aBooleanArrayArray3[local66][local537] && Static409.anIntArray535[local87] <= local48.anInt5599) {
								Static150.anIntArray269[local87] = local48.anInt5596;
								Static278.anIntArray394[local87] = local542;
								Static461.anIntArray622[local87] = arg6.method7640() ? local48.anInt5595 : local48.anInt5604;
								Static21.anIntArray39[local87] = local48.anInt5608;
								if (local48.anInt5599 == Static409.anIntArray535[local87]) {
									Static74.anIntArray171[local87] |= 0x10;
								} else {
									Static74.anIntArray171[local87] = 16;
								}
								Static409.anIntArray535[local87] = local48.anInt5599;
							}
							local87++;
							local537--;
						}
						if (!local16[arg1 + 2 & 0x3]) {
							arg12[2] = Static205.aBooleanArrayArray1[local66][--local507 & 0x3];
						}
					} else if (!local16[arg1 + 2 & 0x3]) {
						arg12[2] = Static353.aBooleanArrayArray5[local66][local507 & 0x3];
					}
				}
			}
		}
		if (arg11 > 0) {
			local35 = arg4[arg11 - 1][arg3] & 0xFF;
			if (local35 > 0) {
				local48 = this.aClass81_4.method2640(local35 - 1);
				if (local48.anInt5596 != -1) {
					local66 = arg8[arg11 - 1][arg3];
					local507 = arg0[arg11 - 1][arg3];
					if (local48.aBoolean387) {
						local87 = 6;
						local537 = local507 * 2 + 4;
						local542 = Static294.method4945(arg6, local48);
						for (local544 = 0; local544 < 3; local544++) {
							local87 &= 0x7;
							local537 &= 0x7;
							if (Static237.aBooleanArrayArray3[local66][local537] && local48.anInt5599 >= Static409.anIntArray535[local87]) {
								Static150.anIntArray269[local87] = local48.anInt5596;
								Static278.anIntArray394[local87] = local542;
								Static461.anIntArray622[local87] = arg6.method7640() ? local48.anInt5595 : local48.anInt5604;
								Static21.anIntArray39[local87] = local48.anInt5608;
								if (Static409.anIntArray535[local87] == local48.anInt5599) {
									Static74.anIntArray171[local87] |= 0x8;
								} else {
									Static74.anIntArray171[local87] = 8;
								}
								Static409.anIntArray535[local87] = local48.anInt5599;
							}
							local87++;
							local537--;
						}
						if (!local16[arg1 + 3 & 0x3]) {
							arg12[3] = Static205.aBooleanArrayArray1[local66][local507 + 1 & 0x3];
						}
					} else if (!local16[arg1 + 3 & 0x3]) {
						arg12[3] = Static353.aBooleanArrayArray5[local66][local507 + 1 & 0x3];
					}
				}
			}
		}
		if (arg11 < arg7 - 1) {
			local35 = arg4[arg11 + 1][arg3] & 0xFF;
			if (local35 > 0) {
				local48 = this.aClass81_4.method2640(local35 - 1);
				if (local48.anInt5596 != -1) {
					local66 = arg8[arg11 + 1][arg3];
					local507 = arg0[arg11 + 1][arg3];
					if (local48.aBoolean387) {
						local87 = 4;
						local537 = local507 * 2 + 6;
						local542 = Static294.method4945(arg6, local48);
						for (local544 = 0; local544 < 3; local544++) {
							local87 &= 0x7;
							local537 &= 0x7;
							if (Static237.aBooleanArrayArray3[local66][local537] && local48.anInt5599 >= Static409.anIntArray535[local87]) {
								Static150.anIntArray269[local87] = local48.anInt5596;
								Static278.anIntArray394[local87] = local542;
								Static461.anIntArray622[local87] = arg6.method7640() ? local48.anInt5595 : local48.anInt5604;
								Static21.anIntArray39[local87] = local48.anInt5608;
								if (local48.anInt5599 == Static409.anIntArray535[local87]) {
									Static74.anIntArray171[local87] |= 0x4;
								} else {
									Static74.anIntArray171[local87] = 4;
								}
								Static409.anIntArray535[local87] = local48.anInt5599;
							}
							local87--;
							local537++;
						}
						if (!local16[arg1 + 1 & 0x3]) {
							arg12[1] = Static205.aBooleanArrayArray1[local66][local507 + 3 & 0x3];
						}
					} else if (!local16[arg1 + 1 & 0x3]) {
						arg12[1] = Static353.aBooleanArrayArray5[local66][local507 + 3 & 0x3];
					}
				}
			}
		}
		if (arg5 == null) {
			return;
		}
		local35 = Static294.method4945(arg6, arg5);
		if (!arg5.aBoolean387) {
			return;
		}
		for (@Pc(1228) int local1228 = 0; local1228 < 8; local1228++) {
			@Pc(1238) int local1238 = local1228 - arg1 * 2 & 0x7;
			if (Static237.aBooleanArrayArray3[arg9][local1228] && arg5.anInt5599 >= Static409.anIntArray535[local1238]) {
				Static150.anIntArray269[local1238] = arg5.anInt5596;
				Static278.anIntArray394[local1238] = local35;
				Static461.anIntArray622[local1238] = arg6.method7640() ? arg5.anInt5595 : arg5.anInt5604;
				Static21.anIntArray39[local1238] = arg5.anInt5608;
				if (arg5.anInt5599 == Static409.anIntArray535[local1238]) {
					Static74.anIntArray171[local1238] |= 0x2;
				} else {
					Static74.anIntArray171[local1238] = 2;
				}
				Static409.anIntArray535[local1238] = arg5.anInt5599;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!sa;Lclient!sa;Lclient!qa;I)V")
	public final void method3435(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class9 arg2) {
		if (Static216.anIntArray330 == null || this.anInt3847 != Static216.anIntArray330.length) {
			Static19.anIntArray38 = new int[this.anInt3847];
			Static216.anIntArray330 = new int[this.anInt3847];
			Static164.anIntArray283 = new int[this.anInt3847];
			Static509.anIntArray735 = new int[this.anInt3847];
			Static487.anIntArray648 = new int[this.anInt3847];
		}
		@Pc(40) int[][] local40 = new int[this.anInt3842][this.anInt3847];
		@Pc(45) int local45;
		for (@Pc(42) int local42 = 0; local42 < this.anInt3843; local42++) {
			for (local45 = 0; local45 < this.anInt3847; local45++) {
				Static216.anIntArray330[local45] = 0;
				Static19.anIntArray38[local45] = 0;
				Static487.anIntArray648[local45] = 0;
				Static164.anIntArray283[local45] = 0;
				Static509.anIntArray735[local45] = 0;
			}
			for (@Pc(73) int local73 = -5; local73 < this.anInt3842; local73++) {
				@Pc(81) int local81;
				@Pc(100) int local100;
				@Pc(166) int local166;
				for (@Pc(76) int local76 = 0; local76 < this.anInt3847; local76++) {
					local81 = local73 + 5;
					@Pc(146) int local146;
					if (this.anInt3842 > local81) {
						local100 = this.aByteArrayArrayArray15[local42][local81][local76] & 0xFF;
						if (local100 > 0) {
							@Pc(110) Class63 local110 = this.aClass40_5.method1495(local100 - 1);
							Static216.anIntArray330[local76] += local110.anInt2336;
							Static19.anIntArray38[local76] += local110.anInt2339;
							Static487.anIntArray648[local76] += local110.anInt2330;
							Static164.anIntArray283[local76] += local110.anInt2331;
							local146 = Static509.anIntArray735[local76]++;
						}
					}
					local100 = local73 - 5;
					if (local100 >= 0) {
						local166 = this.aByteArrayArrayArray15[local42][local100][local76] & 0xFF;
						if (local166 > 0) {
							@Pc(179) Class63 local179 = this.aClass40_5.method1495(local166 - 1);
							Static216.anIntArray330[local76] -= local179.anInt2336;
							Static19.anIntArray38[local76] -= local179.anInt2339;
							Static487.anIntArray648[local76] -= local179.anInt2330;
							Static164.anIntArray283[local76] -= local179.anInt2331;
							local146 = Static509.anIntArray735[local76]--;
						}
					}
				}
				if (local73 >= 0) {
					local81 = 0;
					local100 = 0;
					local166 = 0;
					@Pc(236) int local236 = 0;
					@Pc(238) int local238 = 0;
					for (@Pc(240) int local240 = -5; local240 < this.anInt3847; local240++) {
						@Pc(245) int local245 = local240 + 5;
						if (local245 < this.anInt3847) {
							local81 += Static216.anIntArray330[local245];
							local166 += Static487.anIntArray648[local245];
							local236 += Static164.anIntArray283[local245];
							local238 += Static509.anIntArray735[local245];
							local100 += Static19.anIntArray38[local245];
						}
						@Pc(287) int local287 = local240 - 5;
						if (local287 >= 0) {
							local166 -= Static487.anIntArray648[local287];
							local81 -= Static216.anIntArray330[local287];
							local236 -= Static164.anIntArray283[local287];
							local238 -= Static509.anIntArray735[local287];
							local100 -= Static19.anIntArray38[local287];
						}
						if (local240 >= 0 && local236 > 0 && local238 > 0) {
							local40[local73][local240] = Static195.method3627(local81 * 256 / local236, local100 / local238, local166 / local238);
						}
					}
				}
			}
			if (Static459.aBoolean536) {
				this.method3441(local42 == 0 ? arg1 : null, local40, Static290.aClass10Array7[local42], arg2, local42 == 0 ? arg0 : null, local42);
			} else {
				this.method3436(local42, local42 == 0 ? arg1 : null, Static290.aClass10Array7[local42], arg2, local42 == 0 ? arg0 : null, local40);
			}
			this.aByteArrayArrayArray15[local42] = null;
			this.aByteArrayArrayArray14[local42] = null;
			this.aByteArrayArrayArray10[local42] = null;
			this.aByteArrayArrayArray12[local42] = null;
		}
		if (!this.aBoolean242) {
			if (Static324.anInt6133 != 0) {
				Static505.method7296();
			}
			if (Static212.aBoolean266) {
				Static449.method6460();
			}
		}
		for (local45 = 0; local45 < this.anInt3843; local45++) {
			Static290.aClass10Array7[local45].N();
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!sa;Lclient!sa;Lclient!qa;ILclient!sa;[[I)V")
	private void method3436(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) Class9 arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int[][] arg5) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3842; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt3847; local4++) {
				if (Static314.anInt5988 == -1 || Static94.method2176(Static314.anInt5988, local4, local1, arg0)) {
					@Pc(26) byte local26 = this.aByteArrayArrayArray10[arg0][local1][local4];
					@Pc(35) byte local35 = this.aByteArrayArrayArray12[arg0][local1][local4];
					@Pc(46) int local46 = this.aByteArrayArrayArray14[arg0][local1][local4] & 0xFF;
					@Pc(57) int local57 = this.aByteArrayArrayArray15[arg0][local1][local4] & 0xFF;
					@Pc(71) Class184 local71 = local46 == 0 ? null : this.aClass81_4.method2640(local46 - 1);
					@Pc(85) Class63 local85 = local57 == 0 ? null : this.aClass40_5.method1495(local57 - 1);
					@Pc(87) int local87 = 0;
					@Pc(89) int local89 = 0;
					if (local26 != 0) {
						local87 = local85 == null ? 0 : Static86.anIntArray179[local26];
						local89 = local71 == null ? 0 : Static50.anIntArray778[local26];
					} else if (local71 != null) {
						local89 = Static50.anIntArray778[local26];
					} else if (local85 != null) {
						local87 = Static50.anIntArray778[local26];
					}
					@Pc(128) int local128 = local89 + local87;
					@Pc(130) int local130 = 0;
					if (local128 != 0) {
						@Pc(135) int[] local135 = new int[local128];
						@Pc(138) int[] local138 = new int[local128];
						@Pc(141) int[] local141 = new int[local128];
						@Pc(144) int[] local144 = new int[local128];
						@Pc(146) boolean local146 = false;
						@Pc(165) int local165;
						@Pc(191) int local191;
						if (local71 == null || local71.anInt5596 == -1 && local71.anInt5600 == -1 && local71.anInt5595 == -1) {
							for (local165 = 0; local165 < local89; local165++) {
								local135[local130] = -1;
								local130++;
							}
						} else {
							local165 = arg3.method7640() ? local71.anInt5595 : local71.anInt5604;
							if (Static423.aBoolean619) {
								local165 = -1;
							}
							for (local191 = 0; local191 < local89; local191++) {
								local141[local130] = local165;
								local144[local130] = local71.anInt5608;
								if (local71.anInt5596 == -1) {
									local135[local130] = -1;
								} else {
									local135[local130] = local71.anInt5596;
								}
								if (local71.anInt5600 == -1) {
									local138[local130] = -1;
								} else {
									local138[local130] = local71.anInt5600;
									local146 = true;
								}
								local130++;
							}
							if (!this.aBoolean242 && arg0 == 0) {
								Static162.method6803(local1, local4, local71.anInt5606, local71.anInt5603 * 8, local71.anInt5602);
							}
						}
						if (!local146) {
							local138 = null;
						}
						if (local85 == null) {
							for (local165 = 0; local165 < local87; local165++) {
								local135[local130] = -1;
								local130++;
							}
						} else {
							local165 = local85.anInt2332;
							if (Static423.aBoolean619) {
								local165 = -1;
							}
							for (local191 = 0; local191 < local87; local191++) {
								local141[local130] = local165;
								local144[local130] = local85.anInt2334;
								local135[local130] = arg5[local1][local4];
								if (local138 != null) {
									local138[local130] = -1;
								}
								local130++;
							}
						}
						local165 = this.anIntArray295.length;
						@Pc(323) int[] local323 = new int[local165];
						@Pc(326) int[] local326 = new int[local165];
						@Pc(333) int[] local333 = arg1 == null ? null : new int[local165];
						@Pc(342) int[] local342 = arg1 == null && arg4 == null ? null : new int[local165];
						@Pc(350) int local350;
						@Pc(355) int local355;
						@Pc(434) int local434;
						@Pc(440) int local440;
						for (@Pc(344) int local344 = 0; local344 < local165; local344++) {
							local350 = this.anIntArray295[local344];
							local355 = this.anIntArray296[local344];
							if (local35 == 0) {
								local323[local344] = local350;
								local326[local344] = local355;
							} else if (local35 == 1) {
								local323[local344] = local355;
								local326[local344] = 128 - local350;
							} else if (local35 == 2) {
								local323[local344] = 128 - local350;
								local326[local344] = 128 - local355;
							} else if (local35 == 3) {
								local323[local344] = 128 - local355;
								local326[local344] = local350;
							}
							if (local333 != null && Static237.aBooleanArrayArray3[local26][local344]) {
								local434 = (local1 << 7) + local350;
								local440 = (local4 << 7) + local350;
								local333[local344] = arg1.aa(local434, local440) - arg2.aa(local434, local440);
							}
							if (local342 != null) {
								if (arg1 != null && !Static237.aBooleanArrayArray3[local26][local344]) {
									local434 = local350 + (local1 << 7);
									local440 = local350 + (local4 << 7);
									local342[local344] = arg2.aa(local434, local440) - arg1.aa(local434, local440);
								} else if (arg4 != null && !Static457.aBooleanArrayArray6[local26][local344]) {
									local434 = (local1 << 7) + local350;
									local440 = (local4 << 7) + local350;
									local342[local344] = arg4.aa(local434, local440) - arg2.aa(local434, local440);
								}
							}
						}
						local350 = arg2.ba(local1, local4);
						local355 = arg2.ba(local1 + 1, local4);
						local434 = arg2.ba(local1 + 1, local4 + 1);
						local440 = arg2.ba(local1, local4 + 1);
						if (arg0 > 0) {
							@Pc(556) boolean local556 = true;
							if (local57 == 0 && local26 != 0) {
								local556 = false;
							}
							if (local46 > 0 && local71 != null && !local71.aBoolean388) {
								local556 = false;
							}
							if (local556 && local355 == local350 && local434 == local350 && local440 == local350) {
								this.aByteArrayArrayArray11[arg0][local1][local4] = (byte) (this.aByteArrayArrayArray11[arg0][local1][local4] | 0x4);
							}
						}
						@Pc(614) int local614 = 0;
						@Pc(616) int local616 = 0;
						@Pc(618) int local618 = 0;
						if (this.aBoolean242) {
							local614 = Static525.method7467(local1, local4);
							local616 = Static382.method5786(local1, local4);
							local618 = Static393.method5915(local1, local4);
						}
						arg2.method6334(local1, local4, local323, local333, local326, local342, Static338.anIntArrayArray52[local26], Static403.anIntArrayArray86[local26], Static312.anIntArrayArray48[local26], local135, local138, local141, local144, local614, local616, local618);
						Static336.method5472(arg0, local1, local4);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIII)V")
	private void method3437(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(12) int local12;
		for (@Pc(9) int local9 = arg1; local9 < arg1 + 64; local9++) {
			for (local12 = arg2; local12 < arg2 + 64; local12++) {
				if (local12 >= 0 && local12 < this.anInt3842 && local9 >= 0 && this.anInt3847 > local9) {
					this.anIntArrayArrayArray6[arg0][local12][local9] = arg0 > 0 ? this.anIntArrayArrayArray6[arg0 - 1][local12][local9] - 240 : 0;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt3842) {
			for (local12 = arg1 + 1; local12 < arg1 + 64; local12++) {
				if (local12 >= 0 && local12 < this.anInt3847) {
					this.anIntArrayArrayArray6[arg0][arg2][local12] = this.anIntArrayArrayArray6[arg0][arg2 - 1][local12];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt3847) {
			for (local12 = arg2 + 1; local12 < arg2 + 64; local12++) {
				if (local12 >= 0 && local12 < this.anInt3842) {
					this.anIntArrayArrayArray6[arg0][local12][arg1] = this.anIntArrayArrayArray6[arg0][local12][arg1 - 1];
				}
			}
		}
		if (arg2 < 0 || arg1 < 0 || this.anInt3842 <= arg2 || arg1 >= this.anInt3847) {
			return;
		}
		if (arg0 != 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray6[arg0][arg2 - 1][arg1] != this.anIntArrayArrayArray6[arg0 - 1][arg2 - 1][arg1]) {
				this.anIntArrayArrayArray6[arg0][arg2][arg1] = this.anIntArrayArrayArray6[arg0][arg2 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray6[arg0 - 1][arg2][arg1 - 1] != this.anIntArrayArrayArray6[arg0][arg2][arg1 - 1]) {
				this.anIntArrayArrayArray6[arg0][arg2][arg1] = this.anIntArrayArrayArray6[arg0][arg2][arg1 - 1];
				return;
			}
			if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray6[arg0 - 1][arg2 - 1][arg1 - 1] != this.anIntArrayArrayArray6[arg0][arg2 - 1][arg1 - 1]) {
				this.anIntArrayArrayArray6[arg0][arg2][arg1] = this.anIntArrayArrayArray6[arg0][arg2 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray6[arg0][arg2 - 1][arg1] != 0) {
			this.anIntArrayArrayArray6[arg0][arg2][arg1] = this.anIntArrayArrayArray6[arg0][arg2 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray6[arg0][arg2][arg1 - 1] != 0) {
			this.anIntArrayArrayArray6[arg0][arg2][arg1] = this.anIntArrayArrayArray6[arg0][arg2][arg1 - 1];
			return;
		}
		if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray6[arg0][arg2 - 1][arg1 - 1] != 0) {
			this.anIntArrayArrayArray6[arg0][arg2][arg1] = this.anIntArrayArrayArray6[arg0][arg2 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII[Lclient!vba;IBLclient!gw;II)V")
	public final void method3438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class299[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class1_Sub13 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = (arg2 & 0x7) * 8;
		@Pc(15) int local15 = (arg8 & 0x7) * 8;
		@Pc(24) int local24;
		@Pc(53) int local53;
		if (!this.aBoolean242) {
			@Pc(22) Class299 local22 = arg4[arg1];
			for (local24 = 0; local24 < 8; local24++) {
				for (@Pc(27) int local27 = 0; local27 < 8; local27++) {
					@Pc(40) int local40 = Static439.method5139(arg7, local27 & 0x7, local24 & 0x7) + arg5;
					local53 = arg0 + Static65.method7168(local24 & 0x7, arg7, local27 & 0x7);
					if (local40 > 0 && local40 < this.anInt3842 - 1 && local53 > 0 && this.anInt3847 - 1 > local53) {
						local22.method7234(local53, local40);
					}
				}
			}
		}
		@Pc(92) int local92 = (arg2 & 0x1FFFFFF8) << 3;
		local24 = (arg8 & 0x1FFFFFF8) << 3;
		@Pc(100) byte local100 = 0;
		@Pc(102) byte local102 = 0;
		if (arg7 == 1) {
			local102 = 1;
		} else if (arg7 == 2) {
			local102 = 1;
			local100 = 1;
		} else if (arg7 == 3) {
			local100 = 1;
		}
		for (local53 = 0; local53 < this.anInt3843; local53++) {
			for (@Pc(129) int local129 = 0; local129 < 64; local129++) {
				for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
					if (local53 == arg3 && local129 >= local9 && local9 + 8 >= local129 && local132 >= local15 && local132 <= local15 + 8) {
						@Pc(208) int local208;
						@Pc(214) int local214;
						if (local9 + 8 == local129 || local15 + 8 == local132) {
							if (arg7 == 0) {
								local208 = local129 + arg5 - local9;
								local214 = arg0 + local132 - local15;
							} else if (arg7 == 1) {
								local214 = arg0 + local9 + 8 - local129;
								local208 = arg5 + local132 - local15;
							} else if (arg7 == 2) {
								local214 = local15 + arg0 + 8 - local132;
								local208 = arg5 + local9 + 8 - local129;
							} else {
								local208 = local15 + arg5 + 8 - local132;
								local214 = local129 + arg0 - local9;
							}
							this.method3443(0, 0, arg6, local132 + local24, local129 + local92, local208, local214, arg1, true, 0);
						} else {
							local208 = Static439.method5139(arg7, local132 & 0x7, local129 & 0x7) + arg5;
							local214 = arg0 + Static65.method7168(local129 & 0x7, arg7, local132 & 0x7);
							this.method3443(local100, local102, arg6, local24 + local132, local92 + local129, local208, local214, arg1, false, arg7);
						}
						if (local129 == 63 || local132 == 63) {
							@Pc(334) byte local334 = 1;
							if (local129 == 63 && local132 == 63) {
								local334 = 3;
							}
							for (@Pc(348) int local348 = 0; local348 < local334; local348++) {
								@Pc(351) int local351 = local129;
								@Pc(353) int local353 = local132;
								if (local348 == 0) {
									local351 = local129 == 63 ? 64 : local129;
									local353 = local132 == 63 ? 64 : local132;
								} else if (local348 == 1) {
									local351 = 64;
								} else if (local348 == 2) {
									local353 = 64;
								}
								@Pc(414) int local414;
								@Pc(405) int local405;
								if (arg7 == 0) {
									local405 = local353 + arg0 - local15;
									local414 = arg5 + local351 - local9;
								} else if (arg7 == 1) {
									local405 = arg0 + local9 + 8 - local351;
									local414 = arg5 + local353 - local15;
								} else if (arg7 == 2) {
									local405 = local15 + arg0 + 8 - local353;
									local414 = arg5 + local9 + 8 - local351;
								} else {
									local405 = local351 + arg0 - local9;
									local414 = local15 + arg5 + 8 - local353;
								}
								if (local414 >= 0 && this.anInt3842 > local414 && local405 >= 0 && this.anInt3847 > local405) {
									this.anIntArrayArrayArray6[arg1][local414][local405] = this.anIntArrayArrayArray6[arg1][local208 + local100][local214 + local102];
								}
							}
						}
					} else {
						this.method3443(0, 0, arg6, 0, 0, -1, -1, 0, false, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!qa;[Lclient!vba;[[[II)V")
	public final void method3439(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class299[] arg1, @OriginalArg(2) int[][][] arg2) {
		@Pc(8) int local8;
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (!this.aBoolean242) {
			for (local8 = 0; local8 < 4; local8++) {
				for (local11 = 0; local11 < this.anInt3842; local11++) {
					for (local14 = 0; local14 < this.anInt3847; local14++) {
						if ((Static542.aByteArrayArrayArray17[local8][local11][local14] & 0x1) != 0) {
							@Pc(30) int local30 = local8;
							if ((Static542.aByteArrayArrayArray17[1][local11][local14] & 0x2) != 0) {
								local30 = local8 - 1;
							}
							if (local30 >= 0) {
								arg1[local30].method7245(local14, local11);
							}
						}
					}
				}
			}
		}
		for (local8 = 0; local8 < this.anInt3843; local8++) {
			local11 = 0;
			local14 = 0;
			if (!this.aBoolean242) {
				if (Static465.aBoolean543) {
					local14 = 8;
				}
				if (Static212.aBoolean266) {
					local11 = 2;
				}
				if (Static324.anInt6133 != 0) {
					if (local8 == 0 | Static305.aBoolean403) {
						local14 |= 0x10;
					}
					local11 |= 0x1;
				}
			}
			if (Static212.aBoolean266) {
				local14 |= 0x7;
			}
			if (!Static92.aBoolean168) {
				local14 |= 0x20;
			}
			@Pc(137) int[][] local137 = arg2 == null || local8 >= arg2.length ? this.anIntArrayArrayArray6[local8] : arg2[local8];
			Static358.method2198(local8, arg0.method7574(this.anInt3842, this.anInt3847, this.anIntArrayArrayArray6[local8], local137, local11, local14));
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!sa;[[IBLclient!sa;Lclient!qa;Lclient!sa;I)V")
	private void method3441(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) byte[][] local8 = this.aByteArrayArrayArray10[arg5];
		@Pc(13) byte[][] local13 = this.aByteArrayArrayArray12[arg5];
		@Pc(34) byte[][] local34 = this.aByteArrayArrayArray15[arg5];
		@Pc(39) byte[][] local39 = this.aByteArrayArrayArray14[arg5];
		for (@Pc(41) int local41 = 0; local41 < this.anInt3842; local41++) {
			@Pc(54) int local54 = local41 >= this.anInt3842 - 1 ? local41 : local41 + 1;
			for (@Pc(56) int local56 = 0; local56 < this.anInt3847; local56++) {
				@Pc(73) int local73 = this.anInt3847 - 1 > local56 ? local56 + 1 : local56;
				if (Static314.anInt5988 == -1 || Static94.method2176(Static314.anInt5988, local56, local41, arg5)) {
					@Pc(89) boolean local89 = false;
					@Pc(91) boolean local91 = false;
					@Pc(94) boolean[] local94 = new boolean[4];
					@Pc(100) int local100 = local8[local41][local56];
					@Pc(106) int local106 = local13[local41][local56];
					@Pc(114) int local114 = local39[local41][local56] & 0xFF;
					@Pc(122) int local122 = local34[local41][local56] & 0xFF;
					@Pc(130) int local130 = local34[local41][local73] & 0xFF;
					@Pc(138) int local138 = local34[local54][local73] & 0xFF;
					@Pc(146) int local146 = local34[local54][local56] & 0xFF;
					if (local114 != 0 || local122 != 0) {
						@Pc(171) Class184 local171 = local114 == 0 ? null : this.aClass81_4.method2640(local114 - 1);
						if (local100 == 0 && local171 == null) {
							local100 = 12;
						}
						@Pc(189) Class63 local189 = local122 == 0 ? null : this.aClass40_5.method1495(local122 - 1);
						@Pc(191) Class184 local191 = local171;
						if (local171 != null) {
							if (local171.anInt5596 == -1 && local171.anInt5600 == -1) {
								local191 = local171;
								local171 = null;
							} else if (local189 != null && local100 != 0) {
								local91 = local171.aBoolean387;
							}
						}
						@Pc(299) int local299;
						@Pc(316) int local316;
						@Pc(376) int local376;
						@Pc(388) int local388;
						if ((local100 == 0 || local100 == 12) && local41 > 0 && local56 > 0 && this.anInt3842 > local41 && this.anInt3847 > local56) {
							@Pc(259) int local259 = local34[local54][local73] == local122 ? 1 : -1;
							@Pc(278) int local278 = local122 == local34[local54][local56 - 1] ? 1 : -1;
							local299 = local34[local41 - 1][local56 - 1] == local122 ? 1 : -1;
							local316 = local122 == local34[local41 - 1][local73] ? 1 : -1;
							if (local34[local41][local56 - 1] == local122) {
								local278++;
								local299++;
							} else {
								local299--;
								local278--;
							}
							if (local34[local54][local56] == local122) {
								local278++;
								local259++;
							} else {
								local278--;
								local259--;
							}
							if (local34[local41][local73] == local122) {
								local316++;
								local259++;
							} else {
								local316--;
								local259--;
							}
							if (local34[local41 - 1][local56] == local122) {
								local316++;
								local299++;
							} else {
								local316--;
								local299--;
							}
							local376 = local299 - local259;
							if (local376 < 0) {
								local376 = -local376;
							}
							local388 = local278 - local316;
							if (local388 < 0) {
								local388 = -local388;
							}
							if (local376 == local388) {
								local376 = arg2.ba(local41, local56) - arg2.ba(local54, local73);
								if (local376 < 0) {
									local376 = -local376;
								}
								local388 = arg2.ba(local54, local56) - arg2.ba(local41, local73);
								if (local388 < 0) {
									local388 = -local388;
								}
							}
							local106 = local388 <= local376 ? 0 : 1;
						}
						for (local299 = 0; local299 < 13; local299++) {
							Static409.anIntArray535[local299] = -1;
							Static74.anIntArray171[local299] = 1;
						}
						@Pc(467) boolean[] local467 = local171 != null && local171.aBoolean387 ? Static205.aBooleanArrayArray1[local100] : Static353.aBooleanArrayArray5[local100];
						this.method3433(local13, local106, this.anInt3847, local56, local39, local171, arg3, this.anInt3842, local8, local100, local189, local41, local94);
						@Pc(496) boolean local496 = local171 != null && local171.anInt5600 != local171.anInt5596;
						if (!local496) {
							for (local316 = 0; local316 < 8; local316++) {
								if (Static409.anIntArray535[local316] >= 0 && Static278.anIntArray394[local316] != Static150.anIntArray269[local316]) {
									local496 = true;
									break;
								}
							}
						}
						if (!local467[local106 + 1 & 0x3]) {
							local94[1] = Static172.method3024(local94[1], (Static74.anIntArray171[2] & Static74.anIntArray171[4]) == 0);
						}
						if (!local467[local106 + 3 & 0x3]) {
							local94[3] = Static172.method3024(local94[3], (Static74.anIntArray171[0] & Static74.anIntArray171[6]) == 0);
						}
						if (!local467[local106 & 0x3]) {
							local94[0] = Static172.method3024(local94[0], (Static74.anIntArray171[0] & Static74.anIntArray171[2]) == 0);
						}
						if (!local467[local106 + 2 & 0x3]) {
							local94[2] = Static172.method3024(local94[2], (Static74.anIntArray171[4] & Static74.anIntArray171[6]) == 0);
						}
						if (!local91 && (local100 == 0 || local100 == 12)) {
							if (local94[0] && !local94[1] && !local94[2] && local94[3]) {
								local100 = local100 == 0 ? 13 : 14;
								local94[0] = local94[3] = false;
								local106 = 0;
							} else if (local94[0] && local94[1] && !local94[2] && !local94[3]) {
								local100 = local100 == 0 ? 13 : 14;
								local106 = 3;
								local94[0] = local94[1] = false;
							} else if (!local94[0] && local94[1] && local94[2] && !local94[3]) {
								local94[1] = local94[2] = false;
								local106 = 2;
								local100 = local100 == 0 ? 13 : 14;
							} else if (!local94[0] && !local94[1] && local94[2] && local94[3]) {
								local94[2] = local94[3] = false;
								local100 = local100 == 0 ? 13 : 14;
								local106 = 1;
							}
						}
						@Pc(798) boolean local798 = !local91 && !local94[0] && !local94[2] && !local94[1] && !local94[3];
						@Pc(800) int[] local800 = null;
						@Pc(826) int[] local826;
						@Pc(814) int[] local814;
						@Pc(830) int[] local830;
						if (local798) {
							local376 = local189 == null ? 0 : Static86.anIntArray179[local100];
							local814 = Static403.anIntArrayArray86[local100];
							local388 = local171 == null ? 0 : Static50.anIntArray778[local100];
							local826 = Static338.anIntArrayArray52[local100];
							local830 = Static312.anIntArrayArray48[local100];
						} else if (local91) {
							local376 = local189 == null ? 0 : Static126.anIntArray238[local100];
							local814 = Static403.anIntArrayArray85[local100];
							local830 = Static265.anIntArrayArray36[local100];
							local388 = local171 == null ? 0 : Static531.anIntArray776[local100];
							local800 = Static359.anIntArrayArray53[local100];
							local826 = Static514.anIntArrayArray93[local100];
						} else {
							local826 = Static275.anIntArrayArray38[local100];
							local830 = Static262.anIntArrayArray34[local100];
							local388 = local171 == null ? 0 : Static429.anIntArray586[local100];
							local800 = Static298.anIntArrayArray47[local100];
							local376 = local189 == null ? 0 : Static503.anIntArray698[local100];
							local814 = Static408.anIntArrayArray67[local100];
						}
						@Pc(902) int local902 = local376 + local388;
						if (local902 <= 0) {
							Static336.method5472(arg5, local41, local56);
						} else {
							if (local94[0]) {
								local902++;
							}
							if (local94[2]) {
								local902++;
							}
							if (local94[1]) {
								local902++;
							}
							if (local94[3]) {
								local902++;
							}
							@Pc(934) int local934 = 0;
							@Pc(936) int local936 = 0;
							@Pc(940) int local940 = local902 * 3;
							@Pc(947) int[] local947 = local496 ? new int[local940] : null;
							@Pc(950) int[] local950 = new int[local940];
							@Pc(953) int[] local953 = new int[local940];
							@Pc(956) int[] local956 = new int[local940];
							@Pc(959) int[] local959 = new int[local940];
							@Pc(962) int[] local962 = new int[local940];
							@Pc(969) int[] local969 = arg0 == null ? null : new int[local940];
							@Pc(978) int[] local978 = arg0 == null && arg4 == null ? null : new int[local940];
							@Pc(980) int local980 = -1;
							@Pc(982) int local982 = -1;
							@Pc(984) int local984 = 256;
							@Pc(1082) byte local1082;
							@Pc(1033) int local1033;
							@Pc(1035) int local1035;
							@Pc(1266) int local1266;
							@Pc(1271) int local1271;
							@Pc(1280) int local1280;
							@Pc(1285) int local1285;
							@Pc(1305) int local1305;
							@Pc(1290) int local1290;
							@Pc(1310) int local1310;
							@Pc(1356) int local1356;
							@Pc(1362) int local1362;
							if (local171 != null) {
								local980 = local171.anInt5596;
								local982 = arg3.method7640() ? local171.anInt5595 : local171.anInt5604;
								local984 = local171.anInt5608;
								local1033 = Static294.method4945(arg3, local171);
								for (local1035 = 0; local1035 < local388; local1035++) {
									if (local94[-local106 & 0x3] && local800[0] == local934) {
										Static250.anIntArray346[0] = local826[local934];
										Static250.anIntArray346[1] = 1;
										Static250.anIntArray346[2] = local830[local934];
										Static250.anIntArray346[3] = 1;
										Static250.anIntArray346[4] = local814[local934];
										local1082 = 6;
										Static250.anIntArray346[5] = local830[local934];
									} else if (local94[2 - local106 & 0x3] && local800[2] == local934) {
										Static250.anIntArray346[0] = local826[local934];
										Static250.anIntArray346[1] = 5;
										Static250.anIntArray346[2] = local830[local934];
										Static250.anIntArray346[3] = 5;
										Static250.anIntArray346[4] = local814[local934];
										Static250.anIntArray346[5] = local830[local934];
										local1082 = 6;
									} else if (local94[1 - local106 & 0x3] && local800[1] == local934) {
										Static250.anIntArray346[0] = local826[local934];
										Static250.anIntArray346[1] = 3;
										Static250.anIntArray346[2] = local830[local934];
										Static250.anIntArray346[3] = 3;
										Static250.anIntArray346[4] = local814[local934];
										Static250.anIntArray346[5] = local830[local934];
										local1082 = 6;
									} else if (local94[3 - local106 & 0x3] && local800[3] == local934) {
										Static250.anIntArray346[0] = local826[local934];
										Static250.anIntArray346[1] = 7;
										Static250.anIntArray346[2] = local830[local934];
										Static250.anIntArray346[3] = 7;
										Static250.anIntArray346[4] = local814[local934];
										Static250.anIntArray346[5] = local830[local934];
										local1082 = 6;
									} else {
										Static250.anIntArray346[0] = local826[local934];
										Static250.anIntArray346[1] = local814[local934];
										local1082 = 3;
										Static250.anIntArray346[2] = local830[local934];
									}
									local934++;
									for (local1266 = 0; local1266 < local1082; local1266++) {
										local1271 = Static250.anIntArray346[local1266];
										local1280 = local1271 - local106 * 2 & 0x7;
										local1285 = this.anIntArray295[local1271];
										local1290 = this.anIntArray296[local1271];
										if (local106 == 1) {
											local1305 = local1290;
											local1310 = 128 - local1285;
										} else if (local106 == 2) {
											local1305 = 128 - local1285;
											local1310 = 128 - local1290;
										} else if (local106 == 3) {
											local1305 = 128 - local1290;
											local1310 = local1285;
										} else {
											local1305 = local1285;
											local1310 = local1290;
										}
										local950[local936] = local1305;
										local953[local936] = local1310;
										if (local969 != null && Static237.aBooleanArrayArray3[local100][local1271]) {
											local1356 = (local41 << 7) + local1305;
											local1362 = (local56 << 7) + local1310;
											local969[local936] = arg0.aa(local1356, local1362) - arg2.aa(local1356, local1362);
										}
										if (local978 != null) {
											if (arg0 != null && !Static237.aBooleanArrayArray3[local100][local1271]) {
												local1356 = local1305 + (local41 << 7);
												local1362 = local1310 + (local56 << 7);
												local978[local936] = arg2.aa(local1356, local1362) - arg0.aa(local1356, local1362);
											} else if (arg4 != null && !Static457.aBooleanArrayArray6[local100][local1271]) {
												local1356 = local1305 + (local41 << 7);
												local1362 = (local56 << 7) + local1310;
												local978[local936] = arg4.aa(local1356, local1362) - arg2.aa(local1356, local1362);
											}
										}
										if (local1271 < 8 && local171.anInt5599 < Static409.anIntArray535[local1280]) {
											if (local947 != null) {
												local947[local936] = Static278.anIntArray394[local1280];
											}
											local962[local936] = Static21.anIntArray39[local1280];
											local959[local936] = Static461.anIntArray622[local1280];
											local956[local936] = Static150.anIntArray269[local1280];
										} else {
											if (local947 != null) {
												local947[local936] = local1033;
											}
											local959[local936] = arg3.method7640() ? local171.anInt5595 : local171.anInt5604;
											local962[local936] = local171.anInt5608;
											local956[local936] = local980;
										}
										local936++;
									}
								}
								if (!this.aBoolean242 && arg5 == 0) {
									Static162.method6803(local41, local56, local171.anInt5606, local171.anInt5603 * 8, local171.anInt5602);
								}
								if (local100 != 12 && local171.anInt5596 != -1 && local171.aBoolean389) {
									local89 = true;
								}
							} else if (local798) {
								local934 = Static50.anIntArray778[local100];
							} else if (local91) {
								local934 = Static531.anIntArray776[local100];
							} else {
								local934 = Static429.anIntArray586[local100];
							}
							if (local189 != null) {
								if (local146 == 0) {
									local146 = local122;
								}
								if (local130 == 0) {
									local130 = local122;
								}
								if (local138 == 0) {
									local138 = local122;
								}
								@Pc(1580) Class63 local1580 = this.aClass40_5.method1495(local122 - 1);
								@Pc(1588) Class63 local1588 = this.aClass40_5.method1495(local130 - 1);
								@Pc(1596) Class63 local1596 = this.aClass40_5.method1495(local138 - 1);
								@Pc(1604) Class63 local1604 = this.aClass40_5.method1495(local146 - 1);
								for (local1280 = 0; local1280 < local376; local1280++) {
									if (local94[-local106 & 0x3] && local800[0] == local934) {
										Static250.anIntArray346[0] = local826[local934];
										Static250.anIntArray346[1] = 1;
										Static250.anIntArray346[2] = local830[local934];
										Static250.anIntArray346[3] = 1;
										Static250.anIntArray346[4] = local814[local934];
										Static250.anIntArray346[5] = local830[local934];
										local1082 = 6;
									} else if (local94[2 - local106 & 0x3] && local800[2] == local934) {
										Static250.anIntArray346[0] = local826[local934];
										Static250.anIntArray346[1] = 5;
										Static250.anIntArray346[2] = local830[local934];
										Static250.anIntArray346[3] = 5;
										Static250.anIntArray346[4] = local814[local934];
										Static250.anIntArray346[5] = local830[local934];
										local1082 = 6;
									} else if (local94[1 - local106 & 0x3] && local800[1] == local934) {
										Static250.anIntArray346[0] = local826[local934];
										Static250.anIntArray346[1] = 3;
										Static250.anIntArray346[2] = local830[local934];
										Static250.anIntArray346[3] = 3;
										Static250.anIntArray346[4] = local814[local934];
										local1082 = 6;
										Static250.anIntArray346[5] = local830[local934];
									} else if (local94[3 - local106 & 0x3] && local934 == local800[3]) {
										Static250.anIntArray346[0] = local826[local934];
										Static250.anIntArray346[1] = 7;
										Static250.anIntArray346[2] = local830[local934];
										Static250.anIntArray346[3] = 7;
										Static250.anIntArray346[4] = local814[local934];
										Static250.anIntArray346[5] = local830[local934];
										local1082 = 6;
									} else {
										Static250.anIntArray346[0] = local826[local934];
										Static250.anIntArray346[1] = local814[local934];
										Static250.anIntArray346[2] = local830[local934];
										local1082 = 3;
									}
									for (local1285 = 0; local1285 < local1082; local1285++) {
										local1305 = Static250.anIntArray346[local1285];
										local1290 = local1305 - local106 * 2 & 0x7;
										local1310 = this.anIntArray295[local1305];
										local1362 = this.anIntArray296[local1305];
										@Pc(1877) int local1877;
										if (local106 == 1) {
											local1877 = 128 - local1310;
											local1356 = local1362;
										} else if (local106 == 2) {
											local1877 = 128 - local1362;
											local1356 = 128 - local1310;
										} else if (local106 == 3) {
											local1356 = 128 - local1362;
											local1877 = local1310;
										} else {
											local1356 = local1310;
											local1877 = local1362;
										}
										local950[local936] = local1356;
										local953[local936] = local1877;
										@Pc(1929) int local1929;
										@Pc(1935) int local1935;
										if (local969 != null && Static237.aBooleanArrayArray3[local100][local1305]) {
											local1929 = (local41 << 7) + local1356;
											local1935 = (local56 << 7) + local1877;
											local969[local936] = arg0.aa(local1929, local1935) - arg2.aa(local1929, local1935);
										}
										if (local978 != null) {
											if (arg0 != null && !Static237.aBooleanArrayArray3[local100][local1305]) {
												local1929 = (local41 << 7) + local1356;
												local1935 = (local56 << 7) + local1877;
												local978[local936] = arg2.aa(local1929, local1935) - arg0.aa(local1929, local1935);
											} else if (arg4 != null && !Static457.aBooleanArrayArray6[local100][local1305]) {
												local1929 = (local41 << 7) + local1356;
												local1935 = local1877 + (local56 << 7);
												local978[local936] = arg4.aa(local1929, local1935) - arg2.aa(local1929, local1935);
											}
										}
										if (local1305 < 8 && Static409.anIntArray535[local1290] >= 0) {
											if (local947 != null) {
												local947[local936] = Static278.anIntArray394[local1290];
											}
											local962[local936] = Static21.anIntArray39[local1290];
											local959[local936] = Static461.anIntArray622[local1290];
											local956[local936] = Static150.anIntArray269[local1290];
										} else {
											if (local91 && Static237.aBooleanArrayArray3[local100][local1305]) {
												local959[local936] = local982;
												local962[local936] = local984;
												local956[local936] = local980;
											} else if (local1356 == 0 && local1877 == 0) {
												local956[local936] = arg1[local41][local56];
												local959[local936] = local1580.anInt2332;
												local962[local936] = local1580.anInt2334;
											} else if (local1356 == 0 && local1877 == 128) {
												local956[local936] = arg1[local41][local73];
												local959[local936] = local1588.anInt2332;
												local962[local936] = local1588.anInt2334;
											} else if (local1356 == 128 && local1877 == 128) {
												local956[local936] = arg1[local54][local73];
												local959[local936] = local1596.anInt2332;
												local962[local936] = local1596.anInt2334;
											} else if (local1356 == 128 && local1877 == 0) {
												local956[local936] = arg1[local54][local56];
												local959[local936] = local1604.anInt2332;
												local962[local936] = local1604.anInt2334;
											} else {
												if (local1356 < 64) {
													if (local1877 >= 64) {
														local959[local936] = local1588.anInt2332;
														local962[local936] = local1588.anInt2334;
													} else {
														local959[local936] = local1580.anInt2332;
														local962[local936] = local1580.anInt2334;
													}
												} else if (local1877 >= 64) {
													local959[local936] = local1596.anInt2332;
													local962[local936] = local1596.anInt2334;
												} else {
													local959[local936] = local1604.anInt2332;
													local962[local936] = local1604.anInt2334;
												}
												local1929 = Static33.method1300(arg1[local54][local56], arg1[local41][local56], local1356 << 7 >> 7);
												local1935 = Static33.method1300(arg1[local54][local73], arg1[local41][local73], local1356 << 7 >> 7);
												local956[local936] = Static33.method1300(local1935, local1929, local1877 << 7 >> 7);
											}
											if (local947 != null) {
												local947[local936] = local956[local936];
											}
										}
										local936++;
									}
									local934++;
								}
								if (local100 != 0 && local189.aBoolean167) {
									local89 = true;
								}
							}
							local1033 = arg2.ba(local41, local56);
							local1035 = arg2.ba(local54, local56);
							local1266 = arg2.ba(local54, local73);
							local1271 = arg2.ba(local41, local73);
							if (arg5 > 0) {
								@Pc(2344) boolean local2344 = true;
								if (local122 == 0 && local100 != 0) {
									local2344 = false;
								}
								if (local114 > 0 && local191 != null && !local191.aBoolean388) {
									local2344 = false;
								}
								if (local2344 && local1035 == local1033 && local1266 == local1033 && local1271 == local1033) {
									this.aByteArrayArrayArray11[arg5][local41][local56] = (byte) (this.aByteArrayArrayArray11[arg5][local41][local56] | 0x4);
								}
							}
							local1280 = 0;
							local1285 = 0;
							local1305 = 0;
							if (this.aBoolean242) {
								local1280 = Static525.method7467(local41, local56);
								local1285 = Static382.method5786(local41, local56);
								local1305 = Static393.method5915(local41, local56);
							}
							arg2.IA(local41, local56, local950, local969, local953, local978, local956, local947, local959, local962, local1280, local1285, local1305, local89);
							Static336.method5472(arg5, local41, local56);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIII)V")
	public final void method3442(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt3843; local5++) {
			this.method3437(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILclient!gw;IIIIIIZI)V")
	private void method3443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (arg9 == 1) {
			arg1 = 1;
		} else if (arg9 == 2) {
			arg1 = 1;
			arg0 = 1;
		} else if (arg9 == 3) {
			arg0 = 1;
		}
		@Pc(64) int local64;
		if (arg5 < 0 || arg5 >= this.anInt3842 || arg6 < 0 || this.anInt3847 <= arg6) {
			while (true) {
				local64 = arg2.method3043();
				if (local64 == 0) {
					return;
				}
				if (local64 == 1) {
					arg2.method3043();
					return;
				}
				if (local64 <= 49) {
					arg2.method3043();
				}
			}
			return;
		}
		if (!this.aBoolean242 && !arg8) {
			Static542.aByteArrayArrayArray17[arg7][arg5][arg6] = 0;
		}
		while (true) {
			local64 = arg2.method3043();
			if (local64 == 0) {
				if (this.aBoolean242) {
					this.anIntArrayArrayArray6[0][arg5 + arg0][arg6 + arg1] = 0;
					return;
				} else if (arg7 == 0) {
					this.anIntArrayArrayArray6[0][arg0 + arg5][arg6 + arg1] = -Static542.method7916(arg3 + 556238, 932731 - -arg4) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray6[arg7][arg5 + arg0][arg6 + arg1] = this.anIntArrayArrayArray6[arg7 - 1][arg5 + arg0][arg6 + arg1] - 240;
					return;
				}
			}
			if (local64 == 1) {
				@Pc(159) int local159 = arg2.method3043();
				if (!this.aBoolean242) {
					if (local159 == 1) {
						local159 = 0;
					}
					if (arg7 != 0) {
						this.anIntArrayArrayArray6[arg7][arg5 + arg0][arg6 + arg1] = this.anIntArrayArrayArray6[arg7 - 1][arg5 + arg0][arg6 + arg1] - (local159 * 8 << 0);
						return;
					}
					this.anIntArrayArrayArray6[0][arg5 + arg0][arg6 + arg1] = -local159 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray6[0][arg0 + arg5][arg1 + arg6] = local159 * 8 << 0;
				return;
			}
			if (local64 <= 49) {
				if (arg8) {
					arg2.method3043();
				} else {
					this.aByteArrayArrayArray14[arg7][arg5][arg6] = arg2.method3073();
					this.aByteArrayArrayArray10[arg7][arg5][arg6] = (byte) ((local64 - 2) / 4);
					this.aByteArrayArrayArray12[arg7][arg5][arg6] = (byte) (local64 + arg9 - 2 & 0x3);
				}
			} else if (local64 <= 81) {
				if (!this.aBoolean242 && !arg8) {
					Static542.aByteArrayArrayArray17[arg7][arg5][arg6] = (byte) (local64 - 49);
				}
			} else if (!arg8) {
				this.aByteArrayArrayArray15[arg7][arg5][arg6] = (byte) (local64 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B[[II)V")
	public final void method3444(@OriginalArg(1) int[][] arg0) {
		@Pc(8) int[][] local8 = this.anIntArrayArrayArray6[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3842 + 1; local16++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt3847 + 1; local19++) {
				local8[local16][local19] += arg0[local16][local19];
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III[Lclient!vba;ZLclient!gw;I)V")
	public final void method3445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class299[] arg3, @OriginalArg(5) Class1_Sub13 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8;
		@Pc(15) int local15;
		@Pc(18) int local18;
		@Pc(23) int local23;
		if (!this.aBoolean242) {
			for (local8 = 0; local8 < 4; local8++) {
				@Pc(13) Class299 local13 = arg3[local8];
				for (local15 = 0; local15 < 64; local15++) {
					for (local18 = 0; local18 < 64; local18++) {
						local23 = arg5 + local15;
						@Pc(28) int local28 = arg1 + local18;
						if (local23 >= 0 && this.anInt3842 > local23 && local28 >= 0 && local28 < this.anInt3847) {
							local13.method7234(local28, local23);
						}
					}
				}
			}
		}
		local8 = arg5 + arg2;
		@Pc(83) int local83 = arg1 + arg0;
		for (local15 = 0; local15 < this.anInt3843; local15++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local23 = 0; local23 < 64; local23++) {
					this.method3443(0, 0, arg4, local23 + local83, local18 + local8, local18 + arg5, arg1 + local23, local15, false, 0);
				}
			}
		}
	}
}
