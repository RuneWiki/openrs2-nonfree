import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public class Class114 {

	@OriginalMember(owner = "client!fga", name = "s", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "[I")
	private final int[] anIntArray747 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!fga", name = "m", descriptor = "[I")
	private final int[] anIntArray748 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!fga", name = "B", descriptor = "Z")
	public final boolean aBoolean680;

	@OriginalMember(owner = "client!fga", name = "u", descriptor = "Lclient!gp;")
	private final Class143 aClass143_5;

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "I")
	public final int anInt10214;

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
	protected final int anInt10203;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "Lclient!pd;")
	private final Class286 aClass286_5;

	@OriginalMember(owner = "client!fga", name = "k", descriptor = "I")
	protected final int anInt10206;

	@OriginalMember(owner = "client!fga", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!fga", name = "q", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!fga", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!fga", name = "i", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(IIIZLclient!pd;Lclient!gp;)V")
	protected Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class286 arg4, @OriginalArg(5) Class143 arg5) {
		this.aBoolean680 = arg3;
		this.aClass143_5 = arg5;
		this.anInt10214 = arg0;
		this.anInt10203 = arg2;
		this.aClass286_5 = arg4;
		this.anInt10206 = arg1;
		this.aByteArrayArrayArray17 = new byte[this.anInt10214][this.anInt10206][this.anInt10203];
		this.aByteArrayArrayArray13 = new byte[this.anInt10214][this.anInt10206][this.anInt10203];
		this.aByteArrayArrayArray18 = new byte[this.anInt10214][this.anInt10206 + 1][this.anInt10203 + 1];
		this.aByteArrayArrayArray15 = new byte[this.anInt10214][this.anInt10206][this.anInt10203];
		this.aByteArrayArrayArray16 = new byte[this.anInt10214][this.anInt10206][this.anInt10203];
		this.anIntArrayArrayArray14 = new int[this.anInt10214][this.anInt10206 + 1][this.anInt10203 + 1];
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!we;Lclient!dj;Lclient!ha;[[BIIII[[B[ZIII[[B)V")
	private void method8676(@OriginalArg(0) Class400 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) boolean[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(21) boolean[] local21 = arg0 != null && arg0.aBoolean749 ? Static387.aBooleanArrayArray4[arg6] : Static271.aBooleanArrayArray3[arg6];
		@Pc(50) int local50;
		@Pc(60) Class400 local60;
		@Pc(79) byte local79;
		@Pc(95) int local95;
		@Pc(100) int local100;
		if (arg4 > 0) {
			if (arg11 > 0) {
				local50 = arg12[arg11 - 1][arg4 - 1] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass286_5.method6631(local50 - 1);
					if (local60.anInt11057 != -1 && local60.aBoolean749) {
						local79 = arg8[arg11 - 1][arg4 - 1];
						local95 = arg3[arg11 - 1][arg4 - 1] * 2 + 4 & 0x7;
						local100 = Static210.method3148(local60, arg2);
						if (Static616.aBooleanArrayArray6[local79][local95]) {
							Static189.anIntArray216[0] = local60.anInt11057;
							Static658.anIntArray737[0] = local100;
							Static104.anIntArray126[0] = local60.anInt11052;
							Static658.anIntArray736[0] = local60.anInt11050;
							Static527.anIntArray594[0] = local60.anInt11054;
							Static390.anIntArray446[0] = 256;
						}
					}
				}
			}
			if (arg10 - 1 > arg11) {
				local50 = arg12[arg11 + 1][arg4 - 1] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass286_5.method6631(local50 - 1);
					if (local60.anInt11057 != -1 && local60.aBoolean749) {
						local79 = arg8[arg11 + 1][arg4 - 1];
						local95 = arg3[arg11 + 1][arg4 - 1] * 2 + 6 & 0x7;
						local100 = Static210.method3148(local60, arg2);
						if (Static616.aBooleanArrayArray6[local79][local95]) {
							Static189.anIntArray216[2] = local60.anInt11057;
							Static658.anIntArray737[2] = local100;
							Static104.anIntArray126[2] = local60.anInt11052;
							Static658.anIntArray736[2] = local60.anInt11050;
							Static527.anIntArray594[2] = local60.anInt11054;
							Static390.anIntArray446[2] = 512;
						}
					}
				}
			}
		}
		if (arg4 < arg5 - 1) {
			if (arg11 > 0) {
				local50 = arg12[arg11 - 1][arg4 + 1] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass286_5.method6631(local50 - 1);
					if (local60.anInt11057 != -1 && local60.aBoolean749) {
						local79 = arg8[arg11 - 1][arg4 + 1];
						local95 = arg3[arg11 - 1][arg4 + 1] * 2 + 2 & 0x7;
						local100 = Static210.method3148(local60, arg2);
						if (Static616.aBooleanArrayArray6[local79][local95]) {
							Static189.anIntArray216[6] = local60.anInt11057;
							Static658.anIntArray737[6] = local100;
							Static104.anIntArray126[6] = local60.anInt11052;
							Static658.anIntArray736[6] = local60.anInt11050;
							Static527.anIntArray594[6] = local60.anInt11054;
							Static390.anIntArray446[6] = 64;
						}
					}
				}
			}
			if (arg10 - 1 > arg11) {
				local50 = arg12[arg11 + 1][arg4 + 1] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass286_5.method6631(local50 - 1);
					if (local60.anInt11057 != -1 && local60.aBoolean749) {
						local79 = arg8[arg11 + 1][arg4 + 1];
						local95 = arg3[arg11 + 1][arg4 + 1] * 2 & 0x7;
						local100 = Static210.method3148(local60, arg2);
						if (Static616.aBooleanArrayArray6[local79][local95]) {
							Static189.anIntArray216[4] = local60.anInt11057;
							Static658.anIntArray737[4] = local100;
							Static104.anIntArray126[4] = local60.anInt11052;
							Static658.anIntArray736[4] = local60.anInt11050;
							Static527.anIntArray594[4] = local60.anInt11054;
							Static390.anIntArray446[4] = 128;
						}
					}
				}
			}
		}
		@Pc(541) int local541;
		@Pc(546) int local546;
		@Pc(548) int local548;
		@Pc(504) byte local504;
		if (arg4 > 0) {
			local50 = arg12[arg11][arg4 - 1] & 0xFF;
			if (local50 > 0) {
				local60 = this.aClass286_5.method6631(local50 - 1);
				if (local60.anInt11057 != -1) {
					local79 = arg8[arg11][arg4 - 1];
					local504 = arg3[arg11][arg4 - 1];
					if (local60.aBoolean749) {
						local100 = 2;
						local541 = local504 * 2 + 4;
						local546 = Static210.method3148(local60, arg2);
						for (local548 = 0; local548 < 3; local548++) {
							local100 &= 0x7;
							local541 &= 0x7;
							if (Static616.aBooleanArrayArray6[local79][local541] && local60.anInt11054 >= Static527.anIntArray594[local100]) {
								Static189.anIntArray216[local100] = local60.anInt11057;
								Static658.anIntArray737[local100] = local546;
								Static104.anIntArray126[local100] = local60.anInt11052;
								Static658.anIntArray736[local100] = local60.anInt11050;
								if (local60.anInt11054 == Static527.anIntArray594[local100]) {
									Static390.anIntArray446[local100] |= 0x20;
								} else {
									Static390.anIntArray446[local100] = 32;
								}
								Static527.anIntArray594[local100] = local60.anInt11054;
							}
							local541++;
							local100--;
						}
						if (!local21[arg7 & 0x3]) {
							arg9[0] = Static387.aBooleanArrayArray4[local79][local504 + 2 & 0x3];
						}
					} else if (!local21[arg7 & 0x3]) {
						arg9[0] = Static271.aBooleanArrayArray3[local79][local504 + 2 & 0x3];
					}
				}
			}
		}
		if (arg5 - 1 > arg4) {
			local50 = arg12[arg11][arg4 + 1] & 0xFF;
			if (local50 > 0) {
				local60 = this.aClass286_5.method6631(local50 - 1);
				if (local60.anInt11057 != -1) {
					local79 = arg8[arg11][arg4 + 1];
					local504 = arg3[arg11][arg4 + 1];
					if (local60.aBoolean749) {
						local100 = 4;
						local541 = local504 * 2 + 2;
						local546 = Static210.method3148(local60, arg2);
						for (local548 = 0; local548 < 3; local548++) {
							local100 &= 0x7;
							local541 &= 0x7;
							if (Static616.aBooleanArrayArray6[local79][local541] && local60.anInt11054 >= Static527.anIntArray594[local100]) {
								Static189.anIntArray216[local100] = local60.anInt11057;
								Static658.anIntArray737[local100] = local546;
								Static104.anIntArray126[local100] = local60.anInt11052;
								Static658.anIntArray736[local100] = local60.anInt11050;
								if (Static527.anIntArray594[local100] == local60.anInt11054) {
									Static390.anIntArray446[local100] |= 0x10;
								} else {
									Static390.anIntArray446[local100] = 16;
								}
								Static527.anIntArray594[local100] = local60.anInt11054;
							}
							local100++;
							local541--;
						}
						if (!local21[arg7 + 2 & 0x3]) {
							arg9[2] = Static387.aBooleanArrayArray4[local79][--local504 & 0x3];
						}
					} else if (!local21[arg7 + 2 & 0x3]) {
						arg9[2] = Static271.aBooleanArrayArray3[local79][--local504 & 0x3];
					}
				}
			}
		}
		if (arg11 > 0) {
			local50 = arg12[arg11 - 1][arg4] & 0xFF;
			if (local50 > 0) {
				local60 = this.aClass286_5.method6631(local50 - 1);
				if (local60.anInt11057 != -1) {
					local79 = arg8[arg11 - 1][arg4];
					local504 = arg3[arg11 - 1][arg4];
					if (local60.aBoolean749) {
						local100 = 6;
						local541 = local504 * 2 + 4;
						local546 = Static210.method3148(local60, arg2);
						for (local548 = 0; local548 < 3; local548++) {
							local100 &= 0x7;
							local541 &= 0x7;
							if (Static616.aBooleanArrayArray6[local79][local541] && Static527.anIntArray594[local100] <= local60.anInt11054) {
								Static189.anIntArray216[local100] = local60.anInt11057;
								Static658.anIntArray737[local100] = local546;
								Static104.anIntArray126[local100] = local60.anInt11052;
								Static658.anIntArray736[local100] = local60.anInt11050;
								if (local60.anInt11054 == Static527.anIntArray594[local100]) {
									Static390.anIntArray446[local100] |= 0x8;
								} else {
									Static390.anIntArray446[local100] = 8;
								}
								Static527.anIntArray594[local100] = local60.anInt11054;
							}
							local100++;
							local541--;
						}
						if (!local21[arg7 + 3 & 0x3]) {
							arg9[3] = Static387.aBooleanArrayArray4[local79][local504 + 1 & 0x3];
						}
					} else if (!local21[arg7 + 3 & 0x3]) {
						arg9[3] = Static271.aBooleanArrayArray3[local79][local504 + 1 & 0x3];
					}
				}
			}
		}
		if (arg11 < arg10 - 1) {
			local50 = arg12[arg11 + 1][arg4] & 0xFF;
			if (local50 > 0) {
				local60 = this.aClass286_5.method6631(local50 - 1);
				if (local60.anInt11057 != -1) {
					local79 = arg8[arg11 + 1][arg4];
					local504 = arg3[arg11 + 1][arg4];
					if (local60.aBoolean749) {
						local100 = 4;
						local541 = local504 * 2 + 6;
						local546 = Static210.method3148(local60, arg2);
						for (local548 = 0; local548 < 3; local548++) {
							local100 &= 0x7;
							local541 &= 0x7;
							if (Static616.aBooleanArrayArray6[local79][local541] && Static527.anIntArray594[local100] <= local60.anInt11054) {
								Static189.anIntArray216[local100] = local60.anInt11057;
								Static658.anIntArray737[local100] = local546;
								Static104.anIntArray126[local100] = local60.anInt11052;
								Static658.anIntArray736[local100] = local60.anInt11050;
								if (Static527.anIntArray594[local100] == local60.anInt11054) {
									Static390.anIntArray446[local100] |= 0x4;
								} else {
									Static390.anIntArray446[local100] = 4;
								}
								Static527.anIntArray594[local100] = local60.anInt11054;
							}
							local100--;
							local541++;
						}
						if (!local21[arg7 + 1 & 0x3]) {
							arg9[1] = Static387.aBooleanArrayArray4[local79][local504 + 3 & 0x3];
						}
					} else if (!local21[arg7 + 1 & 0x3]) {
						arg9[1] = Static271.aBooleanArrayArray3[local79][local504 + 3 & 0x3];
					}
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		local50 = Static210.method3148(arg0, arg2);
		if (!arg0.aBoolean749) {
			return;
		}
		for (@Pc(1282) int local1282 = 0; local1282 < 8; local1282++) {
			@Pc(1292) int local1292 = local1282 - arg7 * 2 & 0x7;
			if (Static616.aBooleanArrayArray6[arg6][local1282] && Static527.anIntArray594[local1292] <= arg0.anInt11054) {
				Static189.anIntArray216[local1292] = arg0.anInt11057;
				Static658.anIntArray737[local1292] = local50;
				Static104.anIntArray126[local1292] = arg0.anInt11052;
				Static658.anIntArray736[local1292] = arg0.anInt11050;
				if (Static527.anIntArray594[local1292] == arg0.anInt11054) {
					Static390.anIntArray446[local1292] |= 0x2;
				} else {
					Static390.anIntArray446[local1292] = 2;
				}
				Static527.anIntArray594[local1292] = arg0.anInt11054;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II[[I)V")
	public final void method8678(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray14[0];
		for (@Pc(26) int local26 = 0; local26 < this.anInt10206 + 1; local26++) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt10203 + 1; local30++) {
				local10[local26][local30] += arg0[local26][local30];
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(III[Lclient!fe;ILclient!ika;I)V")
	public final void method8679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class109[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub2 arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(28) int local28;
		if (!this.aBoolean680) {
			for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class109 local12 = arg2[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg1;
						local28 = local18 + arg0;
						if (local24 >= 0 && local24 < this.anInt10206 && local28 >= 0 && local28 < this.anInt10203) {
							local12.method2724(local24, local28);
						}
					}
				}
			}
		}
		@Pc(96) int local96 = arg3 + arg1;
		local14 = arg0 + arg5;
		for (local18 = 0; local18 < this.anInt10214; local18++) {
			for (local24 = 0; local24 < 64; local24++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method8681(local28 + arg0, 0, local18, false, local24 + arg1, 0, arg4, local28 + local14, 0, local24 + local96);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ika;IIIIIIII[Lclient!fe;)V")
	public final void method8680(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class109[] arg8) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(17) int local17 = (arg2 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean680) {
			@Pc(24) Class109 local24 = arg8[arg5];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static566.method7352(local30 & 0x7, arg7, local26 & 0x7) + arg6;
					local56 = Static597.method7696(arg7, local26 & 0x7, local30 & 0x7) + arg1;
					if (local44 > 0 && this.anInt10206 - 1 > local44 && local56 > 0 && this.anInt10203 - 1 > local56) {
						local24.method2724(local44, local56);
					}
				}
			}
		}
		@Pc(106) int local106 = (arg4 & 0x1FFFFFF8) << 3;
		local26 = (arg2 & 0x1FFFFFF8) << 3;
		@Pc(114) byte local114 = 0;
		@Pc(116) byte local116 = 0;
		if (arg7 == 1) {
			local116 = 1;
		} else if (arg7 == 2) {
			local116 = 1;
			local114 = 1;
		} else if (arg7 == 3) {
			local114 = 1;
		}
		for (local56 = 0; local56 < this.anInt10214; local56++) {
			for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
				for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
					if (local56 == arg3 && local151 >= local11 && local11 + 8 >= local151 && local155 >= local17 && local17 + 8 >= local155) {
						@Pc(242) int local242;
						@Pc(254) int local254;
						if (local151 == local11 + 8 || local155 == local17 + 8) {
							if (arg7 == 0) {
								local254 = local155 + arg1 - local17;
								local242 = arg6 + local151 - local11;
							} else if (arg7 == 1) {
								local242 = arg6 + local155 - local17;
								local254 = local11 + arg1 + 8 - local151;
							} else if (arg7 == 2) {
								local242 = arg6 + local11 + 8 - local151;
								local254 = local17 + arg1 + 8 - local155;
							} else {
								local254 = local151 + arg1 - local11;
								local242 = arg6 + local17 + 8 - local155;
							}
							this.method8681(local254, 0, arg5, true, local242, 0, arg0, local26 + local155, 0, local106 + local151);
						} else {
							local242 = arg6 + Static566.method7352(local155 & 0x7, arg7, local151 & 0x7);
							local254 = Static597.method7696(arg7, local151 & 0x7, local155 & 0x7) + arg1;
							this.method8681(local254, arg7, arg5, false, local242, local114, arg0, local155 + local26, local116, local151 + local106);
						}
						if (local151 == 63 || local155 == 63) {
							@Pc(392) byte local392 = 1;
							if (local151 == 63 && local155 == 63) {
								local392 = 3;
							}
							for (@Pc(404) int local404 = 0; local404 < local392; local404++) {
								@Pc(408) int local408 = local151;
								@Pc(410) int local410 = local155;
								if (local404 == 0) {
									local408 = local151 == 63 ? 64 : local151;
									local410 = local155 == 63 ? 64 : local155;
								} else if (local404 == 1) {
									local408 = 64;
								} else if (local404 == 2) {
									local410 = 64;
								}
								@Pc(463) int local463;
								@Pc(470) int local470;
								if (arg7 == 0) {
									local463 = arg6 + local408 - local11;
									local470 = arg1 + local410 - local17;
								} else if (arg7 == 1) {
									local470 = local11 + arg1 + 8 - local408;
									local463 = arg6 + local410 - local17;
								} else if (arg7 == 2) {
									local470 = arg1 + local17 + 8 - local410;
									local463 = arg6 + local11 + 8 - local408;
								} else {
									local470 = arg1 + local408 - local11;
									local463 = arg6 + local17 + 8 - local410;
								}
								if (local463 >= 0 && this.anInt10206 > local463 && local470 >= 0 && this.anInt10203 > local470) {
									this.anIntArrayArrayArray14[arg5][local463][local470] = this.anIntArrayArrayArray14[arg5][local242 + local114][local254 + local116];
								}
							}
						}
					} else {
						this.method8681(-1, 0, 0, false, -1, 0, arg0, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIZIILclient!ika;III)V")
	private void method8681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3_Sub2 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 == 1) {
			arg8 = 1;
		} else if (arg1 == 2) {
			arg8 = 1;
			arg5 = 1;
		} else if (arg1 == 3) {
			arg5 = 1;
		}
		@Pc(88) int local88;
		if (arg4 < 0 || arg4 >= this.anInt10206 || arg0 < 0 || arg0 >= this.anInt10203) {
			while (true) {
				local88 = arg6.method2048(255);
				if (local88 == 0) {
					return;
				}
				if (local88 == 1) {
					arg6.method2048(255);
					return;
				}
				if (local88 <= 49) {
					arg6.method2048(255);
				}
			}
			return;
		}
		if (!this.aBoolean680 && !arg3) {
			Static510.aByteArrayArrayArray11[arg2][arg4][arg0] = 0;
		}
		while (true) {
			local88 = arg6.method2048(255);
			if (local88 == 0) {
				if (this.aBoolean680) {
					this.anIntArrayArrayArray14[0][arg4 + arg5][arg0 + arg8] = 0;
					return;
				} else if (arg2 == 0) {
					this.anIntArrayArrayArray14[0][arg5 + arg4][arg8 + arg0] = -Static484.method6533(arg9 + 932731, arg7 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray14[arg2][arg5 + arg4][arg8 + arg0] = this.anIntArrayArrayArray14[arg2 - 1][arg5 + arg4][arg8 + arg0] - 960;
					return;
				}
			}
			if (local88 == 1) {
				@Pc(187) int local187 = arg6.method2048(255);
				if (!this.aBoolean680) {
					if (local187 == 1) {
						local187 = 0;
					}
					if (arg2 != 0) {
						this.anIntArrayArrayArray14[arg2][arg5 + arg4][arg8 + arg0] = this.anIntArrayArrayArray14[arg2 - 1][arg5 + arg4][arg8 + arg0] - (local187 * 8 << 2);
						return;
					}
					this.anIntArrayArrayArray14[0][arg5 + arg4][arg8 + arg0] = -local187 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray14[0][arg5 + arg4][arg0 + arg8] = local187 * 8 << 2;
				return;
			}
			if (local88 <= 49) {
				if (arg3) {
					arg6.method2048(255);
				} else {
					this.aByteArrayArrayArray15[arg2][arg4][arg0] = arg6.method2022();
					this.aByteArrayArrayArray13[arg2][arg4][arg0] = (byte) ((local88 - 2) / 4);
					this.aByteArrayArrayArray17[arg2][arg4][arg0] = (byte) (local88 + arg1 - 2 & 0x3);
				}
			} else if (local88 <= 81) {
				if (!this.aBoolean680 && !arg3) {
					Static510.aByteArrayArrayArray11[arg2][arg4][arg0] = (byte) (local88 - 49);
				}
			} else if (!arg3) {
				this.aByteArrayArrayArray16[arg2][arg4][arg0] = (byte) (local88 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ha;[[[IB[Lclient!fe;)V")
	public final void method8682(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(3) Class109[] arg2) {
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (!this.aBoolean680) {
			for (local24 = 0; local24 < 4; local24++) {
				for (local28 = 0; local28 < this.anInt10206; local28++) {
					for (local32 = 0; local32 < this.anInt10203; local32++) {
						if ((Static510.aByteArrayArrayArray11[local24][local28][local32] & 0x1) != 0) {
							@Pc(48) int local48 = local24;
							if ((Static510.aByteArrayArrayArray11[1][local28][local32] & 0x2) != 0) {
								local48 = local24 - 1;
							}
							if (local48 >= 0) {
								arg2[local48].method2717(local28, local32);
							}
						}
					}
				}
			}
		}
		for (local24 = 0; local24 < this.anInt10214; local24++) {
			local28 = 0;
			local32 = 0;
			if (!this.aBoolean680) {
				if (Static92.aBoolean152) {
					local28 = 2;
				}
				if (Static468.aBoolean495) {
					local32 = 8;
				}
				if (Static366.anInt5734 != 0) {
					if (Static243.aBoolean240 | local24 == 0) {
						local32 |= 0x10;
					}
					local28 |= 0x1;
				}
			}
			if (Static92.aBoolean152) {
				local32 |= 0x7;
			}
			if (!Static557.aBoolean569) {
				local32 |= 0x20;
			}
			@Pc(178) int[][] local178 = arg1 == null || arg1.length <= local24 ? this.anIntArrayArrayArray14[local24] : arg1[local24];
			Static630.method8288(local24, arg0.method9407(this.anInt10206, this.anInt10203, this.anIntArrayArrayArray14[local24], local178, local28, local32));
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILclient!s;Lclient!s;[[IILclient!ha;Lclient!s;)V")
	private void method8683(@OriginalArg(1) Class259 arg0, @OriginalArg(2) Class259 arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class22 arg4, @OriginalArg(6) Class259 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray13[arg3];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray17[arg3];
		@Pc(27) byte[][] local27 = this.aByteArrayArrayArray16[arg3];
		@Pc(32) byte[][] local32 = this.aByteArrayArrayArray15[arg3];
		for (@Pc(34) int local34 = 0; local34 < this.anInt10206; local34++) {
			@Pc(51) int local51 = this.anInt10206 - 1 > local34 ? local34 + 1 : local34;
			for (@Pc(53) int local53 = 0; local53 < this.anInt10203; local53++) {
				@Pc(74) int local74 = this.anInt10203 - 1 <= local53 ? local53 : local53 + 1;
				if (Static466.anInt7299 == -1 || Static268.method3817(local53, arg3, local34, Static466.anInt7299)) {
					@Pc(95) boolean local95 = false;
					@Pc(97) boolean local97 = false;
					@Pc(100) boolean[] local100 = new boolean[4];
					@Pc(106) int local106 = local10[local34][local53];
					@Pc(112) int local112 = local15[local34][local53];
					@Pc(120) int local120 = local32[local34][local53] & 0xFF;
					@Pc(128) int local128 = local27[local34][local53] & 0xFF;
					@Pc(136) int local136 = local27[local34][local74] & 0xFF;
					@Pc(144) int local144 = local27[local51][local74] & 0xFF;
					@Pc(152) int local152 = local27[local51][local53] & 0xFF;
					if (local120 != 0 || local128 != 0) {
						@Pc(176) Class400 local176 = local120 == 0 ? null : this.aClass286_5.method6631(local120 - 1);
						@Pc(192) Class77 local192 = local128 == 0 ? null : this.aClass143_5.method3267(local128 - 1);
						if (local106 == 0 && local176 == null) {
							local106 = 12;
						}
						@Pc(202) Class400 local202 = local176;
						if (local176 != null) {
							if (local176.anInt11057 == -1 && local176.anInt11051 == -1) {
								local202 = local176;
								local176 = null;
							} else if (local192 != null && local106 != 0) {
								local97 = local176.aBoolean749;
							}
						}
						@Pc(310) int local310;
						@Pc(346) int local346;
						@Pc(431) int local431;
						@Pc(443) int local443;
						if ((local106 == 0 || local106 == 12) && local34 > 0 && local53 > 0 && this.anInt10206 > local34 && this.anInt10203 > local53) {
							@Pc(292) int local292 = local128 == local27[local51][local53 - 1] ? 1 : -1;
							local310 = local128 == local27[local34 - 1][local53 - 1] ? 1 : -1;
							@Pc(324) int local324 = local128 == local27[local51][local74] ? 1 : -1;
							local346 = local27[local34 - 1][local74] == local128 ? 1 : -1;
							if (local128 == local27[local34][local53 - 1]) {
								local310++;
								local292++;
							} else {
								local310--;
								local292--;
							}
							if (local128 == local27[local51][local53]) {
								local292++;
								local324++;
							} else {
								local292--;
								local324--;
							}
							if (local128 == local27[local34][local74]) {
								local324++;
								local346++;
							} else {
								local346--;
								local324--;
							}
							if (local128 == local27[local34 - 1][local53]) {
								local310++;
								local346++;
							} else {
								local310--;
								local346--;
							}
							local431 = local310 - local324;
							if (local431 < 0) {
								local431 = -local431;
							}
							local443 = local292 - local346;
							if (local443 < 0) {
								local443 = -local443;
							}
							if (local431 == local443) {
								local431 = arg0.method9295(local53, local34) - arg0.method9295(local74, local51);
								local443 = arg0.method9295(local53, local51) - arg0.method9295(local74, local34);
								if (local431 < 0) {
									local431 = -local431;
								}
								if (local443 < 0) {
									local443 = -local443;
								}
							}
							local112 = local431 < local443 ? 1 : 0;
						}
						for (local310 = 0; local310 < 13; local310++) {
							Static527.anIntArray594[local310] = -1;
							Static390.anIntArray446[local310] = 1;
						}
						@Pc(551) boolean[] local551 = local176 != null && local176.aBoolean749 ? Static387.aBooleanArrayArray4[local106] : Static271.aBooleanArrayArray3[local106];
						this.method8676(local176, local192, arg4, local15, local53, this.anInt10203, local106, local112, local10, local100, this.anInt10206, local34, local32);
						@Pc(585) boolean local585 = local176 != null && local176.anInt11057 != local176.anInt11051;
						if (!local585) {
							for (local346 = 0; local346 < 8; local346++) {
								if (Static527.anIntArray594[local346] >= 0 && Static658.anIntArray737[local346] != Static189.anIntArray216[local346]) {
									local585 = true;
									break;
								}
							}
						}
						if (!local551[local112 + 1 & 0x3]) {
							local100[1] = Static140.method2392(local100[1], (Static390.anIntArray446[2] & Static390.anIntArray446[4]) == 0);
						}
						if (!local551[local112 + 3 & 0x3]) {
							local100[3] = Static140.method2392(local100[3], (Static390.anIntArray446[6] & Static390.anIntArray446[0]) == 0);
						}
						if (!local551[local112 & 0x3]) {
							local100[0] = Static140.method2392(local100[0], (Static390.anIntArray446[2] & Static390.anIntArray446[0]) == 0);
						}
						if (!local551[local112 + 2 & 0x3]) {
							local100[2] = Static140.method2392(local100[2], (Static390.anIntArray446[4] & Static390.anIntArray446[6]) == 0);
						}
						if (!local97 && (local106 == 0 || local106 == 12)) {
							if (local100[0] && !local100[1] && !local100[2] && local100[3]) {
								local112 = 0;
								local106 = local106 == 0 ? 13 : 14;
								local100[0] = local100[3] = false;
							} else if (local100[0] && local100[1] && !local100[2] && !local100[3]) {
								local106 = local106 == 0 ? 13 : 14;
								local100[0] = local100[1] = false;
								local112 = 3;
							} else if (!local100[0] && local100[1] && local100[2] && !local100[3]) {
								local112 = 2;
								local106 = local106 == 0 ? 13 : 14;
								local100[1] = local100[2] = false;
							} else if (!local100[0] && !local100[1] && local100[2] && local100[3]) {
								local106 = local106 == 0 ? 13 : 14;
								local112 = 1;
								local100[2] = local100[3] = false;
							}
						}
						@Pc(965) boolean local965 = !local97 && !local100[0] && !local100[2] && !local100[1] && !local100[3];
						@Pc(967) int[] local967 = null;
						@Pc(992) int[] local992;
						@Pc(996) int[] local996;
						@Pc(988) int[] local988;
						if (local965) {
							local443 = local176 == null ? 0 : Static66.anIntArray85[local106];
							local992 = Static340.anIntArrayArray27[local106];
							local996 = Static24.anIntArrayArray3[local106];
							local988 = Static320.anIntArrayArray23[local106];
							local431 = local192 == null ? 0 : Static679.anIntArray761[local106];
						} else if (local97) {
							local992 = Static541.anIntArrayArray46[local106];
							local443 = local176 == null ? 0 : Static138.anIntArray161[local106];
							local967 = Static656.anIntArrayArray59[local106];
							local996 = Static650.anIntArrayArray58[local106];
							local988 = Static294.anIntArrayArray19[local106];
							local431 = local192 == null ? 0 : Static259.anIntArray300[local106];
						} else {
							local443 = local176 == null ? 0 : Static144.anIntArray167[local106];
							local988 = Static722.anIntArrayArray70[local106];
							local992 = Static634.anIntArrayArray51[local106];
							local996 = Static142.anIntArrayArray8[local106];
							local431 = local192 == null ? 0 : Static308.anIntArray369[local106];
							local967 = Static504.anIntArrayArray41[local106];
						}
						@Pc(1079) int local1079 = local443 + local431;
						if (local1079 <= 0) {
							Static389.method5283(arg3, local34, local53);
						} else {
							if (local100[0]) {
								local1079++;
							}
							if (local100[2]) {
								local1079++;
							}
							if (local100[1]) {
								local1079++;
							}
							if (local100[3]) {
								local1079++;
							}
							@Pc(1121) int local1121 = 0;
							@Pc(1123) int local1123 = 0;
							@Pc(1127) int local1127 = local1079 * 3;
							@Pc(1135) int[] local1135 = local585 ? new int[local1127] : null;
							@Pc(1138) int[] local1138 = new int[local1127];
							@Pc(1141) int[] local1141 = new int[local1127];
							@Pc(1144) int[] local1144 = new int[local1127];
							@Pc(1147) int[] local1147 = new int[local1127];
							@Pc(1150) int[] local1150 = new int[local1127];
							@Pc(1158) int[] local1158 = arg1 == null ? null : new int[local1127];
							@Pc(1170) int[] local1170 = arg1 == null && arg5 == null ? null : new int[local1127];
							@Pc(1172) int local1172 = -1;
							@Pc(1174) int local1174 = -1;
							@Pc(1176) int local1176 = 256;
							@Pc(1234) boolean local1234;
							@Pc(1226) int local1226;
							@Pc(1228) int local1228;
							@Pc(1475) int local1475;
							@Pc(1481) int local1481;
							@Pc(1490) int local1490;
							@Pc(1495) int local1495;
							@Pc(1514) int local1514;
							@Pc(1500) int local1500;
							@Pc(1519) int local1519;
							@Pc(1573) int local1573;
							@Pc(1579) int local1579;
							@Pc(1303) byte local1303;
							if (local176 != null) {
								local1174 = local176.anInt11052;
								local1172 = local176.anInt11057;
								local1176 = local176.anInt11050;
								local1226 = Static210.method3148(local176, arg4);
								for (local1228 = 0; local1228 < local443; local1228++) {
									local1234 = false;
									if (local100[-local112 & 0x3] && local967[0] == local1121) {
										Static127.anIntArray153[0] = local992[local1121];
										Static127.anIntArray153[1] = 1;
										Static127.anIntArray153[2] = local988[local1121];
										Static127.anIntArray153[3] = 1;
										Static127.anIntArray153[4] = local996[local1121];
										Static127.anIntArray153[5] = local988[local1121];
										local1303 = 6;
									} else if (local100[2 - local112 & 0x3] && local1121 == local967[2]) {
										Static127.anIntArray153[0] = local992[local1121];
										Static127.anIntArray153[1] = 5;
										Static127.anIntArray153[2] = local988[local1121];
										Static127.anIntArray153[3] = 5;
										Static127.anIntArray153[4] = local996[local1121];
										Static127.anIntArray153[5] = local988[local1121];
										local1303 = 6;
									} else if (local100[1 - local112 & 0x3] && local967[1] == local1121) {
										Static127.anIntArray153[0] = local992[local1121];
										Static127.anIntArray153[1] = 3;
										Static127.anIntArray153[2] = local988[local1121];
										Static127.anIntArray153[3] = 3;
										Static127.anIntArray153[4] = local996[local1121];
										local1303 = 6;
										Static127.anIntArray153[5] = local988[local1121];
									} else if (local100[3 - local112 & 0x3] && local1121 == local967[3]) {
										Static127.anIntArray153[0] = local992[local1121];
										Static127.anIntArray153[1] = 7;
										Static127.anIntArray153[2] = local988[local1121];
										Static127.anIntArray153[3] = 7;
										Static127.anIntArray153[4] = local996[local1121];
										local1303 = 6;
										Static127.anIntArray153[5] = local988[local1121];
									} else {
										Static127.anIntArray153[0] = local992[local1121];
										Static127.anIntArray153[1] = local996[local1121];
										local1303 = 3;
										Static127.anIntArray153[2] = local988[local1121];
									}
									local1121++;
									for (local1475 = 0; local1475 < local1303; local1475++) {
										local1481 = Static127.anIntArray153[local1475];
										local1490 = local1481 - local112 * 2 & 0x7;
										local1495 = this.anIntArray747[local1481];
										local1500 = this.anIntArray748[local1481];
										if (local112 == 1) {
											local1519 = 512 - local1495;
											local1514 = local1500;
										} else if (local112 == 2) {
											local1514 = 512 - local1495;
											local1519 = 512 - local1500;
										} else if (local112 == 3) {
											local1514 = 512 - local1500;
											local1519 = local1495;
										} else {
											local1514 = local1495;
											local1519 = local1500;
										}
										local1138[local1123] = local1514;
										local1141[local1123] = local1519;
										if (local1158 != null && Static616.aBooleanArrayArray6[local106][local1481]) {
											local1573 = local1514 + (local34 << 9);
											local1579 = (local53 << 9) + local1519;
											local1158[local1123] = arg1.method9294(local1579, local1573) - arg0.method9294(local1579, local1573);
										}
										if (local1170 != null) {
											if (arg1 != null && !Static616.aBooleanArrayArray6[local106][local1481]) {
												local1573 = local1514 + (local34 << 9);
												local1579 = local1519 + (local53 << 9);
												local1170[local1123] = arg0.method9294(local1579, local1573) - arg1.method9294(local1579, local1573);
											} else if (arg5 != null && !Static19.aBooleanArrayArray1[local106][local1481]) {
												local1573 = (local34 << 9) + local1514;
												local1579 = local1519 + (local53 << 9);
												local1170[local1123] = arg5.method9294(local1579, local1573) - arg0.method9294(local1579, local1573);
											}
										}
										if (local1481 < 8 && local176.anInt11054 < Static527.anIntArray594[local1490]) {
											if (local1135 != null) {
												local1135[local1123] = Static658.anIntArray737[local1490];
											}
											local1150[local1123] = Static658.anIntArray736[local1490];
											local1147[local1123] = Static104.anIntArray126[local1490];
											local1144[local1123] = Static189.anIntArray216[local1490];
										} else {
											if (local1135 != null) {
												local1135[local1123] = local1226;
											}
											local1147[local1123] = local176.anInt11052;
											local1150[local1123] = local176.anInt11050;
											local1144[local1123] = local1172;
										}
										local1123++;
									}
								}
								if (!this.aBoolean680 && arg3 == 0) {
									Static406.method9099(local34, local53, local176.anInt11056, local176.anInt11062 * 8, local176.anInt11060);
								}
								if (local106 != 12 && local176.anInt11057 != -1 && local176.aBoolean748) {
									local95 = true;
								}
							} else if (local965) {
								local1121 = Static66.anIntArray85[local106];
							} else if (local97) {
								local1121 = Static138.anIntArray161[local106];
							} else {
								local1121 = Static144.anIntArray167[local106];
							}
							if (local192 != null) {
								if (local144 == 0) {
									local144 = local128;
								}
								if (local136 == 0) {
									local136 = local128;
								}
								if (local152 == 0) {
									local152 = local128;
								}
								@Pc(1837) Class77 local1837 = this.aClass143_5.method3267(local128 - 1);
								@Pc(1845) Class77 local1845 = this.aClass143_5.method3267(local136 - 1);
								@Pc(1853) Class77 local1853 = this.aClass143_5.method3267(local144 - 1);
								@Pc(1861) Class77 local1861 = this.aClass143_5.method3267(local152 - 1);
								for (local1490 = 0; local1490 < local431; local1490++) {
									local1234 = false;
									if (local100[-local112 & 0x3] && local1121 == local967[0]) {
										Static127.anIntArray153[0] = local992[local1121];
										Static127.anIntArray153[1] = 1;
										Static127.anIntArray153[2] = local988[local1121];
										Static127.anIntArray153[3] = 1;
										Static127.anIntArray153[4] = local996[local1121];
										Static127.anIntArray153[5] = local988[local1121];
										local1303 = 6;
									} else if (local100[2 - local112 & 0x3] && local967[2] == local1121) {
										Static127.anIntArray153[0] = local992[local1121];
										Static127.anIntArray153[1] = 5;
										Static127.anIntArray153[2] = local988[local1121];
										Static127.anIntArray153[3] = 5;
										Static127.anIntArray153[4] = local996[local1121];
										local1303 = 6;
										Static127.anIntArray153[5] = local988[local1121];
									} else if (local100[1 - local112 & 0x3] && local967[1] == local1121) {
										Static127.anIntArray153[0] = local992[local1121];
										Static127.anIntArray153[1] = 3;
										Static127.anIntArray153[2] = local988[local1121];
										Static127.anIntArray153[3] = 3;
										Static127.anIntArray153[4] = local996[local1121];
										local1303 = 6;
										Static127.anIntArray153[5] = local988[local1121];
									} else if (local100[3 - local112 & 0x3] && local1121 == local967[3]) {
										Static127.anIntArray153[0] = local992[local1121];
										Static127.anIntArray153[1] = 7;
										Static127.anIntArray153[2] = local988[local1121];
										Static127.anIntArray153[3] = 7;
										Static127.anIntArray153[4] = local996[local1121];
										local1303 = 6;
										Static127.anIntArray153[5] = local988[local1121];
									} else {
										Static127.anIntArray153[0] = local992[local1121];
										Static127.anIntArray153[1] = local996[local1121];
										local1303 = 3;
										Static127.anIntArray153[2] = local988[local1121];
									}
									local1121++;
									for (local1495 = 0; local1495 < local1303; local1495++) {
										local1514 = Static127.anIntArray153[local1495];
										local1500 = local1514 - local112 * 2 & 0x7;
										local1519 = this.anIntArray747[local1514];
										local1579 = this.anIntArray748[local1514];
										@Pc(2158) int local2158;
										if (local112 == 1) {
											local1573 = local1579;
											local2158 = 512 - local1519;
										} else if (local112 == 2) {
											local1573 = 512 - local1519;
											local2158 = 512 - local1579;
										} else if (local112 == 3) {
											local1573 = 512 - local1579;
											local2158 = local1519;
										} else {
											local2158 = local1579;
											local1573 = local1519;
										}
										local1138[local1123] = local1573;
										local1141[local1123] = local2158;
										@Pc(2212) int local2212;
										@Pc(2218) int local2218;
										if (local1158 != null && Static616.aBooleanArrayArray6[local106][local1514]) {
											local2212 = local1573 + (local34 << 9);
											local2218 = local2158 + (local53 << 9);
											local1158[local1123] = arg1.method9294(local2218, local2212) - arg0.method9294(local2218, local2212);
										}
										if (local1170 != null) {
											if (arg1 != null && !Static616.aBooleanArrayArray6[local106][local1514]) {
												local2212 = local1573 + (local34 << 9);
												local2218 = local2158 + (local53 << 9);
												local1170[local1123] = arg0.method9294(local2218, local2212) - arg1.method9294(local2218, local2212);
											} else if (arg5 != null && !Static19.aBooleanArrayArray1[local106][local1514]) {
												local2212 = (local34 << 9) + local1573;
												local2218 = local2158 + (local53 << 9);
												local1170[local1123] = arg5.method9294(local2218, local2212) - arg0.method9294(local2218, local2212);
											}
										}
										if (local1514 < 8 && Static527.anIntArray594[local1500] >= 0) {
											if (local1135 != null) {
												local1135[local1123] = Static658.anIntArray737[local1500];
											}
											local1150[local1123] = Static658.anIntArray736[local1500];
											local1147[local1123] = Static104.anIntArray126[local1500];
											local1144[local1123] = Static189.anIntArray216[local1500];
										} else {
											if (local97 && Static616.aBooleanArrayArray6[local106][local1514]) {
												local1147[local1123] = local1174;
												local1150[local1123] = local1176;
												local1144[local1123] = local1172;
											} else if (local1573 == 0 && local2158 == 0) {
												local1144[local1123] = arg2[local34][local53];
												local1147[local1123] = local1837.anInt2363;
												local1150[local1123] = local1837.anInt2371;
											} else if (local1573 == 0 && local2158 == 512) {
												local1144[local1123] = arg2[local34][local74];
												local1147[local1123] = local1845.anInt2363;
												local1150[local1123] = local1845.anInt2371;
											} else if (local1573 == 512 && local2158 == 512) {
												local1144[local1123] = arg2[local51][local74];
												local1147[local1123] = local1853.anInt2363;
												local1150[local1123] = local1853.anInt2371;
											} else if (local1573 == 512 && local2158 == 0) {
												local1144[local1123] = arg2[local51][local53];
												local1147[local1123] = local1861.anInt2363;
												local1150[local1123] = local1861.anInt2371;
											} else {
												if (local1573 < 256) {
													if (local2158 < 256) {
														local1147[local1123] = local1837.anInt2363;
														local1150[local1123] = local1837.anInt2371;
													} else {
														local1147[local1123] = local1845.anInt2363;
														local1150[local1123] = local1845.anInt2371;
													}
												} else if (local2158 >= 256) {
													local1147[local1123] = local1853.anInt2363;
													local1150[local1123] = local1853.anInt2371;
												} else {
													local1147[local1123] = local1861.anInt2363;
													local1150[local1123] = local1861.anInt2371;
												}
												local2212 = Static288.method4036(local1573 << 7 >> 9, arg2[local51][local53], arg2[local34][local53]);
												local2218 = Static288.method4036(local1573 << 7 >> 9, arg2[local51][local74], arg2[local34][local74]);
												local1144[local1123] = Static288.method4036(local2158 << 7 >> 9, local2218, local2212);
											}
											if (local1135 != null) {
												local1135[local1123] = local1144[local1123];
											}
										}
										local1123++;
									}
								}
								if (local106 != 0 && local192.aBoolean156) {
									local95 = true;
								}
							}
							local1226 = arg0.method9295(local53, local34);
							local1228 = arg0.method9295(local53, local51);
							local1475 = arg0.method9295(local74, local51);
							local1481 = arg0.method9295(local74, local34);
							@Pc(2713) boolean local2713 = Static574.method7435(local34, local53);
							if (local2713 && arg3 > 1 || !local2713 && arg3 > 0) {
								@Pc(2730) boolean local2730 = true;
								if (local192 != null && !local192.aBoolean157) {
									local2730 = false;
								} else if (local128 == 0 && local106 != 0) {
									local2730 = false;
								} else if (local120 > 0 && local202 != null && !local202.aBoolean750) {
									local2730 = false;
								}
								if (local2730 && local1228 == local1226 && local1226 == local1475 && local1481 == local1226) {
									this.aByteArrayArrayArray18[arg3][local34][local53] = (byte) (this.aByteArrayArrayArray18[arg3][local34][local53] | 0x4);
								}
							}
							local1495 = 0;
							local1514 = 0;
							local1500 = 0;
							if (this.aBoolean680) {
								local1495 = Static202.method3078(local34, local53);
								local1514 = Static10.method361(local34, local53);
								local1500 = Static549.method4751(local34, local53);
							}
							arg0.U(local34, local53, local1138, local1158, local1141, local1170, local1144, local1135, local1147, local1150, local1495, local1514, local1500, local95);
							Static389.method5283(arg3, local34, local53);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIII)V")
	public final void method8684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9;
		for (@Pc(3) int local3 = arg1; local3 < arg2 + arg1; local3++) {
			for (local9 = arg3; local9 < arg3 + arg4; local9++) {
				if (local9 >= 0 && this.anInt10206 > local9 && local3 >= 0 && local3 < this.anInt10203) {
					this.anIntArrayArrayArray14[arg0][local9][local3] = arg0 > 0 ? this.anIntArrayArrayArray14[arg0 - 1][local9][local3] - 960 : 0;
				}
			}
		}
		if (arg3 > 0 && arg3 < this.anInt10206) {
			for (local9 = arg1 + 1; local9 < arg2 + arg1; local9++) {
				if (local9 >= 0 && local9 < this.anInt10203) {
					this.anIntArrayArrayArray14[arg0][arg3][local9] = this.anIntArrayArrayArray14[arg0][arg3 - 1][local9];
				}
			}
		}
		if (arg1 > 0 && this.anInt10203 > arg1) {
			for (local9 = arg3 + 1; local9 < arg3 + arg4; local9++) {
				if (local9 >= 0 && this.anInt10206 > local9) {
					this.anIntArrayArrayArray14[arg0][local9][arg1] = this.anIntArrayArrayArray14[arg0][local9][arg1 - 1];
				}
			}
		}
		if (arg3 < 0 || arg1 < 0 || this.anInt10206 <= arg3 || arg1 >= this.anInt10203) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray14[arg0][arg3 - 1][arg1] != 0) {
				this.anIntArrayArrayArray14[arg0][arg3][arg1] = this.anIntArrayArrayArray14[arg0][arg3 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray14[arg0][arg3][arg1 - 1] != 0) {
				this.anIntArrayArrayArray14[arg0][arg3][arg1] = this.anIntArrayArrayArray14[arg0][arg3][arg1 - 1];
				return;
			}
			if (arg3 > 0 && arg1 > 0 && this.anIntArrayArrayArray14[arg0][arg3 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray14[arg0][arg3][arg1] = this.anIntArrayArrayArray14[arg0][arg3 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray14[arg0 - 1][arg3 - 1][arg1] != this.anIntArrayArrayArray14[arg0][arg3 - 1][arg1]) {
			this.anIntArrayArrayArray14[arg0][arg3][arg1] = this.anIntArrayArrayArray14[arg0][arg3 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray14[arg0][arg3][arg1 - 1] != this.anIntArrayArrayArray14[arg0 - 1][arg3][arg1 - 1]) {
			this.anIntArrayArrayArray14[arg0][arg3][arg1] = this.anIntArrayArrayArray14[arg0][arg3][arg1 - 1];
			return;
		}
		if (arg3 > 0 && arg1 > 0 && this.anIntArrayArrayArray14[arg0][arg3 - 1][arg1 - 1] != this.anIntArrayArrayArray14[arg0 - 1][arg3 - 1][arg1 - 1]) {
			this.anIntArrayArrayArray14[arg0][arg3][arg1] = this.anIntArrayArrayArray14[arg0][arg3 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIII)V")
	public final void method8686(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10214; local7++) {
			this.method8684(local7, arg1, 64, arg0, 64);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZLclient!ha;Lclient!s;Lclient!s;)V")
	public final void method8687(@OriginalArg(1) Class22 arg0, @OriginalArg(2) Class259 arg1, @OriginalArg(3) Class259 arg2) {
		if (Static484.anIntArray561 == null || this.anInt10203 != Static484.anIntArray561.length) {
			Static121.anIntArray144 = new int[this.anInt10203];
			Static45.anIntArray79 = new int[this.anInt10203];
			Static447.anIntArray501 = new int[this.anInt10203];
			Static305.anIntArray361 = new int[this.anInt10203];
			Static484.anIntArray561 = new int[this.anInt10203];
		}
		@Pc(46) int[][] local46 = new int[this.anInt10206][this.anInt10203];
		@Pc(54) int local54;
		for (@Pc(48) int local48 = 0; local48 < this.anInt10214; local48++) {
			for (local54 = 0; local54 < this.anInt10203; local54++) {
				Static484.anIntArray561[local54] = 0;
				Static447.anIntArray501[local54] = 0;
				Static45.anIntArray79[local54] = 0;
				Static305.anIntArray361[local54] = 0;
				Static121.anIntArray144[local54] = 0;
			}
			for (@Pc(85) int local85 = -5; local85 < this.anInt10206; local85++) {
				@Pc(101) int local101;
				@Pc(120) int local120;
				@Pc(186) int local186;
				for (@Pc(93) int local93 = 0; local93 < this.anInt10203; local93++) {
					local101 = local85 + 5;
					@Pc(166) int local166;
					if (local101 < this.anInt10206) {
						local120 = this.aByteArrayArrayArray16[local48][local101][local93] & 0xFF;
						if (local120 > 0) {
							@Pc(130) Class77 local130 = this.aClass143_5.method3267(local120 - 1);
							Static484.anIntArray561[local93] += local130.anInt2368;
							Static447.anIntArray501[local93] += local130.anInt2362;
							Static45.anIntArray79[local93] += local130.anInt2364;
							Static305.anIntArray361[local93] += local130.anInt2367;
							local166 = Static121.anIntArray144[local93]++;
						}
					}
					local120 = local85 - 5;
					if (local120 >= 0) {
						local186 = this.aByteArrayArrayArray16[local48][local120][local93] & 0xFF;
						if (local186 > 0) {
							@Pc(199) Class77 local199 = this.aClass143_5.method3267(local186 - 1);
							Static484.anIntArray561[local93] -= local199.anInt2368;
							Static447.anIntArray501[local93] -= local199.anInt2362;
							Static45.anIntArray79[local93] -= local199.anInt2364;
							Static305.anIntArray361[local93] -= local199.anInt2367;
							local166 = Static121.anIntArray144[local93]--;
						}
					}
				}
				if (local85 >= 0) {
					local101 = 0;
					local120 = 0;
					local186 = 0;
					@Pc(257) int local257 = 0;
					@Pc(259) int local259 = 0;
					for (@Pc(261) int local261 = -5; local261 < this.anInt10203; local261++) {
						@Pc(267) int local267 = local261 + 5;
						if (this.anInt10203 > local267) {
							local120 += Static447.anIntArray501[local267];
							local259 += Static121.anIntArray144[local267];
							local101 += Static484.anIntArray561[local267];
							local186 += Static45.anIntArray79[local267];
							local257 += Static305.anIntArray361[local267];
						}
						@Pc(305) int local305 = local261 - 5;
						if (local305 >= 0) {
							local120 -= Static447.anIntArray501[local305];
							local101 -= Static484.anIntArray561[local305];
							local186 -= Static45.anIntArray79[local305];
							local257 -= Static305.anIntArray361[local305];
							local259 -= Static121.anIntArray144[local305];
						}
						if (local261 >= 0 && local257 > 0 && local259 > 0) {
							local46[local85][local261] = Static6.method235(local101 * 256 / local257, local120 / local259, local186 / local259);
						}
					}
				}
			}
			if (Static185.aBoolean203) {
				this.method8683(Static477.aClass259Array3[local48], local48 == 0 ? arg1 : null, local46, local48, arg0, local48 == 0 ? arg2 : null);
			} else {
				this.method8688(arg0, local46, local48 == 0 ? arg2 : null, local48 == 0 ? arg1 : null, local48, Static477.aClass259Array3[local48]);
			}
			this.aByteArrayArrayArray16[local48] = null;
			this.aByteArrayArrayArray15[local48] = null;
			this.aByteArrayArrayArray13[local48] = null;
			this.aByteArrayArrayArray17[local48] = null;
		}
		if (!this.aBoolean680) {
			if (Static366.anInt5734 != 0) {
				Static97.method1970();
			}
			if (Static92.aBoolean152) {
				Static159.method2583();
			}
		}
		for (local54 = 0; local54 < this.anInt10214; local54++) {
			Static477.aClass259Array3[local54].YA();
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ha;[[ILclient!s;Lclient!s;ILclient!s;B)V")
	private void method8688(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class259 arg5) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt10206; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt10203; local19++) {
				if (Static466.anInt7299 == -1 || Static268.method3817(local19, arg4, local15, Static466.anInt7299)) {
					@Pc(48) byte local48 = this.aByteArrayArrayArray13[arg4][local15][local19];
					@Pc(57) byte local57 = this.aByteArrayArrayArray17[arg4][local15][local19];
					@Pc(68) int local68 = this.aByteArrayArrayArray15[arg4][local15][local19] & 0xFF;
					@Pc(79) int local79 = this.aByteArrayArrayArray16[arg4][local15][local19] & 0xFF;
					@Pc(95) Class400 local95 = local68 == 0 ? null : this.aClass286_5.method6631(local68 - 1);
					@Pc(111) Class77 local111 = local79 == 0 ? null : this.aClass143_5.method3267(local79 - 1);
					if (local48 == 0 && local95 == null) {
						local48 = 12;
					}
					@Pc(124) Class400 local124 = local95;
					if (local95 != null && local95.anInt11057 == -1 && local95.anInt11051 == -1) {
						local124 = local95;
						local95 = null;
					}
					if (local95 != null || local111 != null) {
						@Pc(153) int local153 = Static679.anIntArray761[local48];
						@Pc(157) int local157 = Static66.anIntArray85[local48];
						@Pc(171) int local171 = (local111 == null ? 0 : local153) + (local95 == null ? 0 : local157);
						@Pc(173) int local173 = 0;
						@Pc(175) int local175 = 0;
						@Pc(183) int local183 = local95 == null ? -1 : local95.anInt11052;
						@Pc(191) int local191 = local111 == null ? -1 : local111.anInt2363;
						@Pc(194) int[] local194 = new int[local171];
						@Pc(197) int[] local197 = new int[local171];
						@Pc(200) int[] local200 = new int[local171];
						@Pc(203) int[] local203 = new int[local171];
						@Pc(206) int[] local206 = new int[local171];
						@Pc(209) int[] local209 = new int[local171];
						@Pc(223) int[] local223 = local95 == null || local95.anInt11051 == -1 ? null : new int[local171];
						@Pc(233) int local233;
						if (local95 == null) {
							local175 = local157;
						} else {
							for (local233 = 0; local233 < local157; local233++) {
								local194[local173] = Static340.anIntArrayArray27[local48][local175];
								local197[local173] = Static24.anIntArrayArray3[local48][local175];
								local200[local173] = Static320.anIntArrayArray23[local48][local175];
								local206[local173] = local183;
								local209[local173] = local95.anInt11050;
								local203[local173] = local95.anInt11057;
								if (local223 != null) {
									local223[local173] = local95.anInt11051;
								}
								local175++;
								local173++;
							}
							if (!this.aBoolean680 && arg4 == 0) {
								Static406.method9099(local15, local19, local95.anInt11056, local95.anInt11062 * 8, local95.anInt11060);
							}
						}
						if (local111 != null) {
							for (local233 = 0; local233 < local153; local233++) {
								local194[local173] = Static340.anIntArrayArray27[local48][local175];
								local197[local173] = Static24.anIntArrayArray3[local48][local175];
								local200[local173] = Static320.anIntArrayArray23[local48][local175];
								local206[local173] = local191;
								local209[local173] = local111.anInt2371;
								local203[local173] = arg1[local15][local19];
								if (local223 != null) {
									local223[local173] = local203[local173];
								}
								local173++;
								local175++;
							}
						}
						local233 = this.anIntArray747.length;
						@Pc(390) int[] local390 = new int[local233];
						@Pc(393) int[] local393 = new int[local233];
						@Pc(405) int[] local405 = arg3 == null ? null : new int[local233];
						@Pc(417) int[] local417 = arg3 == null && arg2 == null ? null : new int[local233];
						@Pc(426) int local426;
						@Pc(431) int local431;
						@Pc(529) int local529;
						@Pc(537) int local537;
						for (@Pc(419) int local419 = 0; local419 < local233; local419++) {
							local426 = this.anIntArray747[local419];
							local431 = this.anIntArray748[local419];
							if (local57 == 0) {
								local390[local419] = local426;
								local393[local419] = local431;
							} else if (local57 == 1) {
								local390[local419] = local431;
								local393[local419] = 512 - local426;
							} else if (local57 == 2) {
								local390[local419] = 512 - local426;
								local393[local419] = 512 - local431;
							} else if (local57 == 3) {
								local390[local419] = 512 - local431;
								local393[local419] = local426;
							}
							if (local405 != null && Static616.aBooleanArrayArray6[local48][local419]) {
								local529 = (local15 << 9) + local390[local419];
								local537 = local393[local419] + (local19 << 9);
								local405[local419] = arg3.method9294(local537, local529) - arg5.method9294(local537, local529);
							}
							if (local417 != null) {
								if (arg3 != null && !Static616.aBooleanArrayArray6[local48][local419]) {
									local529 = local390[local419] + (local15 << 9);
									local537 = local393[local419] + (local19 << 9);
									local417[local419] = arg5.method9294(local537, local529) - arg3.method9294(local537, local529);
								} else if (arg2 != null && !Static19.aBooleanArrayArray1[local48][local419]) {
									local529 = local390[local419] + (local15 << 9);
									local537 = local393[local419] + (local19 << 9);
									local417[local419] = arg2.method9294(local537, local529) - arg5.method9294(local537, local529);
								}
							}
						}
						local426 = arg5.method9295(local19, local15);
						local431 = arg5.method9295(local19, local15 + 1);
						local529 = arg5.method9295(local19 + 1, local15 + 1);
						local537 = arg5.method9295(local19 + 1, local15);
						@Pc(681) boolean local681 = Static574.method7435(local15, local19);
						if (local681 && arg4 > 1 || !local681 && arg4 > 0) {
							@Pc(705) boolean local705 = true;
							if (local111 != null && !local111.aBoolean157) {
								local705 = false;
							} else if (local79 == 0 && local48 != 0) {
								local705 = false;
							} else if (local68 > 0 && local124 != null && !local124.aBoolean750) {
								local705 = false;
							}
							if (local705 && local426 == local431 && local529 == local426 && local426 == local537) {
								this.aByteArrayArrayArray18[arg4][local15][local19] = (byte) (this.aByteArrayArrayArray18[arg4][local15][local19] | 0x4);
							}
						}
						@Pc(790) int local790 = 0;
						@Pc(792) int local792 = 0;
						@Pc(794) int local794 = 0;
						if (this.aBoolean680) {
							local790 = Static202.method3078(local15, local19);
							local792 = Static10.method361(local15, local19);
							local794 = Static549.method4751(local15, local19);
						}
						arg5.method9292(local15, local19, local390, local405, local393, local417, local194, local197, local200, local203, local223, local206, local209, local790, local792, local794);
						Static389.method5283(arg4, local15, local19);
					}
				}
			}
		}
	}
}
