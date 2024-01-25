import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public class Class234 {

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "[I")
	private final int[] anIntArray599 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
	private final int[] anIntArray600 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
	public final int anInt9510;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Lclient!fb;")
	private final Class92 aClass92_5;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	protected final int anInt9505;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!ew;")
	private final Class90 aClass90_6;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
	protected final int anInt9511;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "Z")
	public final boolean aBoolean709;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIZLclient!ew;Lclient!fb;)V")
	protected Class234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class90 arg4, @OriginalArg(5) Class92 arg5) {
		this.anInt9510 = arg0;
		this.aClass92_5 = arg5;
		this.anInt9505 = arg2;
		this.aClass90_6 = arg4;
		this.anInt9511 = arg1;
		this.aBoolean709 = arg3;
		this.aByteArrayArrayArray16 = new byte[this.anInt9510][this.anInt9511][this.anInt9505];
		this.aByteArrayArrayArray13 = new byte[this.anInt9510][this.anInt9511][this.anInt9505];
		this.aByteArrayArrayArray14 = new byte[this.anInt9510][this.anInt9511 + 1][this.anInt9505 + 1];
		this.aByteArrayArrayArray15 = new byte[this.anInt9510][this.anInt9511][this.anInt9505];
		this.aByteArrayArrayArray17 = new byte[this.anInt9510][this.anInt9511][this.anInt9505];
		this.anIntArrayArrayArray19 = new int[this.anInt9510][this.anInt9511 + 1][this.anInt9505 + 1];
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[[II)V")
	public final void method7733(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray19[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt9511 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt9505 + 1; local20++) {
				local10[local16][local20] += arg0[local16][local20];
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!i;Lclient!i;Lclient!r;)V")
	public final void method7734(@OriginalArg(1) Class129 arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt9511][this.anInt9505];
		if (Static277.anIntArray277 == null || this.anInt9505 != Static277.anIntArray277.length) {
			Static55.anIntArray50 = new int[this.anInt9505];
			Static158.anIntArray134 = new int[this.anInt9505];
			Static277.anIntArray277 = new int[this.anInt9505];
			Static325.anIntArray354 = new int[this.anInt9505];
			Static369.anIntArray565 = new int[this.anInt9505];
		}
		@Pc(56) int local56;
		for (@Pc(52) int local52 = 0; local52 < this.anInt9510; local52++) {
			for (local56 = 0; local56 < this.anInt9505; local56++) {
				Static277.anIntArray277[local56] = 0;
				Static325.anIntArray354[local56] = 0;
				Static158.anIntArray134[local56] = 0;
				Static55.anIntArray50[local56] = 0;
				Static369.anIntArray565[local56] = 0;
			}
			for (@Pc(85) int local85 = -5; local85 < this.anInt9511; local85++) {
				@Pc(95) int local95;
				@Pc(110) int local110;
				@Pc(182) int local182;
				for (@Pc(89) int local89 = 0; local89 < this.anInt9505; local89++) {
					local95 = local85 + 5;
					@Pc(159) int local159;
					if (this.anInt9511 > local95) {
						local110 = this.aByteArrayArrayArray17[local52][local95][local89] & 0xFF;
						if (local110 > 0) {
							@Pc(123) Class157 local123 = this.aClass92_5.method2279(local110 - 1);
							Static277.anIntArray277[local89] += local123.anInt4111;
							Static325.anIntArray354[local89] += local123.anInt4100;
							Static158.anIntArray134[local89] += local123.anInt4104;
							Static55.anIntArray50[local89] += local123.anInt4105;
							local159 = Static369.anIntArray565[local89]++;
						}
					}
					local110 = local85 - 5;
					if (local110 >= 0) {
						local182 = this.aByteArrayArrayArray17[local52][local110][local89] & 0xFF;
						if (local182 > 0) {
							@Pc(195) Class157 local195 = this.aClass92_5.method2279(local182 - 1);
							Static277.anIntArray277[local89] -= local195.anInt4111;
							Static325.anIntArray354[local89] -= local195.anInt4100;
							Static158.anIntArray134[local89] -= local195.anInt4104;
							Static55.anIntArray50[local89] -= local195.anInt4105;
							local159 = Static369.anIntArray565[local89]--;
						}
					}
				}
				if (local85 >= 0) {
					local95 = 0;
					local110 = 0;
					local182 = 0;
					@Pc(253) int local253 = 0;
					@Pc(255) int local255 = 0;
					for (@Pc(257) int local257 = -5; local257 < this.anInt9505; local257++) {
						@Pc(263) int local263 = local257 + 5;
						if (local263 < this.anInt9505) {
							local95 += Static277.anIntArray277[local263];
							local182 += Static158.anIntArray134[local263];
							local255 += Static369.anIntArray565[local263];
							local253 += Static55.anIntArray50[local263];
							local110 += Static325.anIntArray354[local263];
						}
						@Pc(305) int local305 = local257 - 5;
						if (local305 >= 0) {
							local95 -= Static277.anIntArray277[local305];
							local182 -= Static158.anIntArray134[local305];
							local253 -= Static55.anIntArray50[local305];
							local110 -= Static325.anIntArray354[local305];
							local255 -= Static369.anIntArray565[local305];
						}
						if (local257 >= 0 && local253 > 0 && local255 > 0) {
							local11[local85][local257] = Static309.method4631(local95 * 256 / local253, local182 / local255, local110 / local255);
						}
					}
				}
			}
			if (Static522.aBoolean669) {
				this.method7737(local11, local52, local52 == 0 ? arg1 : null, arg2, local52 == 0 ? arg0 : null, Static310.aClass129Array5[local52]);
			} else {
				this.method7743(local11, Static310.aClass129Array5[local52], arg2, local52 == 0 ? arg1 : null, local52 == 0 ? arg0 : null, local52);
			}
			this.aByteArrayArrayArray17[local52] = null;
			this.aByteArrayArrayArray16[local52] = null;
			this.aByteArrayArrayArray15[local52] = null;
			this.aByteArrayArrayArray13[local52] = null;
		}
		if (!this.aBoolean709) {
			if (Static542.anInt9094 != 0) {
				Static146.method2464();
			}
			if (Static166.aBoolean588) {
				Static50.method899();
			}
		}
		for (local56 = 0; local56 < this.anInt9510; local56++) {
			Static310.aClass129Array5[local56].BA();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[[BI[[B[[BIILclient!ko;B[ZLclient!r;ILclient!ij;)V")
	private void method7735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class193 arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) Class78 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class157 arg12) {
		@Pc(26) boolean[] local26 = arg8 != null && arg8.aBoolean381 ? Static119.aBooleanArrayArray2[arg0] : Static151.aBooleanArrayArray3[arg0];
		@Pc(48) int local48;
		@Pc(58) Class193 local58;
		@Pc(75) byte local75;
		@Pc(91) int local91;
		@Pc(96) int local96;
		if (arg3 > 0) {
			if (arg6 > 0) {
				local48 = arg5[arg6 - 1][arg3 - 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass90_6.method2262(local48 - 1);
					if (local58.anInt5023 != -1 && local58.aBoolean381) {
						local75 = arg4[arg6 - 1][arg3 - 1];
						local91 = arg2[arg6 - 1][arg3 - 1] * 2 + 4 & 0x7;
						local96 = Static170.method2741(arg10, local58);
						if (Static86.aBooleanArrayArray1[local75][local91]) {
							Static200.anIntArray186[0] = local58.anInt5023;
							Static524.anIntArray62[0] = local96;
							Static500.anIntArray525[0] = local58.anInt5019;
							Static201.anIntArray187[0] = local58.anInt5028;
							Static29.anIntArray28[0] = local58.anInt5024;
							Static128.anIntArray109[0] = 256;
						}
					}
				}
			}
			if (arg7 - 1 > arg6) {
				local48 = arg5[arg6 + 1][arg3 - 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass90_6.method2262(local48 - 1);
					if (local58.anInt5023 != -1 && local58.aBoolean381) {
						local75 = arg4[arg6 + 1][arg3 - 1];
						local91 = arg2[arg6 + 1][arg3 - 1] * 2 + 6 & 0x7;
						local96 = Static170.method2741(arg10, local58);
						if (Static86.aBooleanArrayArray1[local75][local91]) {
							Static200.anIntArray186[2] = local58.anInt5023;
							Static524.anIntArray62[2] = local96;
							Static500.anIntArray525[2] = local58.anInt5019;
							Static201.anIntArray187[2] = local58.anInt5028;
							Static29.anIntArray28[2] = local58.anInt5024;
							Static128.anIntArray109[2] = 512;
						}
					}
				}
			}
		}
		if (arg3 < arg1 - 1) {
			if (arg6 > 0) {
				local48 = arg5[arg6 - 1][arg3 + 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass90_6.method2262(local48 - 1);
					if (local58.anInt5023 != -1 && local58.aBoolean381) {
						local75 = arg4[arg6 - 1][arg3 + 1];
						local91 = arg2[arg6 - 1][arg3 + 1] * 2 + 2 & 0x7;
						local96 = Static170.method2741(arg10, local58);
						if (Static86.aBooleanArrayArray1[local75][local91]) {
							Static200.anIntArray186[6] = local58.anInt5023;
							Static524.anIntArray62[6] = local96;
							Static500.anIntArray525[6] = local58.anInt5019;
							Static201.anIntArray187[6] = local58.anInt5028;
							Static29.anIntArray28[6] = local58.anInt5024;
							Static128.anIntArray109[6] = 64;
						}
					}
				}
			}
			if (arg7 - 1 > arg6) {
				local48 = arg5[arg6 + 1][arg3 + 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass90_6.method2262(local48 - 1);
					if (local58.anInt5023 != -1 && local58.aBoolean381) {
						local75 = arg4[arg6 + 1][arg3 + 1];
						local91 = arg2[arg6 + 1][arg3 + 1] * 2 & 0x7;
						local96 = Static170.method2741(arg10, local58);
						if (Static86.aBooleanArrayArray1[local75][local91]) {
							Static200.anIntArray186[4] = local58.anInt5023;
							Static524.anIntArray62[4] = local96;
							Static500.anIntArray525[4] = local58.anInt5019;
							Static201.anIntArray187[4] = local58.anInt5028;
							Static29.anIntArray28[4] = local58.anInt5024;
							Static128.anIntArray109[4] = 128;
						}
					}
				}
			}
		}
		@Pc(511) int local511;
		@Pc(516) int local516;
		@Pc(518) int local518;
		@Pc(477) byte local477;
		if (arg3 > 0) {
			local48 = arg5[arg6][arg3 - 1] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass90_6.method2262(local48 - 1);
				if (local58.anInt5023 != -1) {
					local75 = arg4[arg6][arg3 - 1];
					local477 = arg2[arg6][arg3 - 1];
					if (local58.aBoolean381) {
						local96 = 2;
						local511 = local477 * 2 + 4;
						local516 = Static170.method2741(arg10, local58);
						for (local518 = 0; local518 < 3; local518++) {
							local511 &= 0x7;
							local96 &= 0x7;
							if (Static86.aBooleanArrayArray1[local75][local511] && Static29.anIntArray28[local96] <= local58.anInt5024) {
								Static200.anIntArray186[local96] = local58.anInt5023;
								Static524.anIntArray62[local96] = local516;
								Static500.anIntArray525[local96] = local58.anInt5019;
								Static201.anIntArray187[local96] = local58.anInt5028;
								if (local58.anInt5024 == Static29.anIntArray28[local96]) {
									Static128.anIntArray109[local96] |= 0x20;
								} else {
									Static128.anIntArray109[local96] = 32;
								}
								Static29.anIntArray28[local96] = local58.anInt5024;
							}
							local96--;
							local511++;
						}
						if (!local26[arg11 & 0x3]) {
							arg9[0] = Static119.aBooleanArrayArray2[local75][local477 + 2 & 0x3];
						}
					} else if (!local26[--arg11 & 0x3]) {
						arg9[0] = Static151.aBooleanArrayArray3[local75][local477 + 2 & 0x3];
					}
				}
			}
		}
		if (arg3 < arg1 - 1) {
			local48 = arg5[arg6][arg3 + 1] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass90_6.method2262(local48 - 1);
				if (local58.anInt5023 != -1) {
					local75 = arg4[arg6][arg3 + 1];
					local477 = arg2[arg6][arg3 + 1];
					if (local58.aBoolean381) {
						local96 = 4;
						local511 = local477 * 2 + 2;
						local516 = Static170.method2741(arg10, local58);
						for (local518 = 0; local518 < 3; local518++) {
							local511 &= 0x7;
							local96 &= 0x7;
							if (Static86.aBooleanArrayArray1[local75][local511] && Static29.anIntArray28[local96] <= local58.anInt5024) {
								Static200.anIntArray186[local96] = local58.anInt5023;
								Static524.anIntArray62[local96] = local516;
								Static500.anIntArray525[local96] = local58.anInt5019;
								Static201.anIntArray187[local96] = local58.anInt5028;
								if (Static29.anIntArray28[local96] == local58.anInt5024) {
									Static128.anIntArray109[local96] |= 0x10;
								} else {
									Static128.anIntArray109[local96] = 16;
								}
								Static29.anIntArray28[local96] = local58.anInt5024;
							}
							local96++;
							local511--;
						}
						if (!local26[arg11 + 2 & 0x3]) {
							arg9[2] = Static119.aBooleanArrayArray2[local75][local477 & 0x3];
						}
					} else if (!local26[arg11 + 2 & 0x3]) {
						arg9[2] = Static151.aBooleanArrayArray3[local75][--local477 & 0x3];
					}
				}
			}
		}
		if (arg6 > 0) {
			local48 = arg5[arg6 - 1][arg3] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass90_6.method2262(local48 - 1);
				if (local58.anInt5023 != -1) {
					local75 = arg4[arg6 - 1][arg3];
					local477 = arg2[arg6 - 1][arg3];
					if (local58.aBoolean381) {
						local96 = 6;
						local511 = local477 * 2 + 4;
						local516 = Static170.method2741(arg10, local58);
						for (local518 = 0; local518 < 3; local518++) {
							local96 &= 0x7;
							local511 &= 0x7;
							if (Static86.aBooleanArrayArray1[local75][local511] && local58.anInt5024 >= Static29.anIntArray28[local96]) {
								Static200.anIntArray186[local96] = local58.anInt5023;
								Static524.anIntArray62[local96] = local516;
								Static500.anIntArray525[local96] = local58.anInt5019;
								Static201.anIntArray187[local96] = local58.anInt5028;
								if (Static29.anIntArray28[local96] == local58.anInt5024) {
									Static128.anIntArray109[local96] |= 0x8;
								} else {
									Static128.anIntArray109[local96] = 8;
								}
								Static29.anIntArray28[local96] = local58.anInt5024;
							}
							local96++;
							local511--;
						}
						if (!local26[arg11 + 3 & 0x3]) {
							arg9[3] = Static119.aBooleanArrayArray2[local75][local477 + 1 & 0x3];
						}
					} else if (!local26[arg11 + 3 & 0x3]) {
						arg9[3] = Static151.aBooleanArrayArray3[local75][local477 + 1 & 0x3];
					}
				}
			}
		}
		if (arg6 < arg7 - 1) {
			local48 = arg5[arg6 + 1][arg3] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass90_6.method2262(local48 - 1);
				if (local58.anInt5023 != -1) {
					local75 = arg4[arg6 + 1][arg3];
					local477 = arg2[arg6 + 1][arg3];
					if (local58.aBoolean381) {
						local96 = 4;
						local511 = local477 * 2 + 6;
						local516 = Static170.method2741(arg10, local58);
						for (local518 = 0; local518 < 3; local518++) {
							local511 &= 0x7;
							local96 &= 0x7;
							if (Static86.aBooleanArrayArray1[local75][local511] && local58.anInt5024 >= Static29.anIntArray28[local96]) {
								Static200.anIntArray186[local96] = local58.anInt5023;
								Static524.anIntArray62[local96] = local516;
								Static500.anIntArray525[local96] = local58.anInt5019;
								Static201.anIntArray187[local96] = local58.anInt5028;
								if (Static29.anIntArray28[local96] == local58.anInt5024) {
									Static128.anIntArray109[local96] |= 0x4;
								} else {
									Static128.anIntArray109[local96] = 4;
								}
								Static29.anIntArray28[local96] = local58.anInt5024;
							}
							local96--;
							local511++;
						}
						if (!local26[arg11 + 1 & 0x3]) {
							arg9[1] = Static119.aBooleanArrayArray2[local75][local477 + 3 & 0x3];
						}
					} else if (!local26[arg11 + 1 & 0x3]) {
						arg9[1] = Static151.aBooleanArrayArray3[local75][local477 + 3 & 0x3];
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local48 = Static170.method2741(arg10, arg8);
		if (!arg8.aBoolean381) {
			return;
		}
		for (@Pc(1176) int local1176 = 0; local1176 < 8; local1176++) {
			@Pc(1187) int local1187 = local1176 - arg11 * 2 & 0x7;
			if (Static86.aBooleanArrayArray1[arg0][local1176] && Static29.anIntArray28[local1187] <= arg8.anInt5024) {
				Static200.anIntArray186[local1187] = arg8.anInt5023;
				Static524.anIntArray62[local1187] = local48;
				Static500.anIntArray525[local1187] = arg8.anInt5019;
				Static201.anIntArray187[local1187] = arg8.anInt5028;
				if (arg8.anInt5024 == Static29.anIntArray28[local1187]) {
					Static128.anIntArray109[local1187] |= 0x2;
				} else {
					Static128.anIntArray109[local1187] = 2;
				}
				Static29.anIntArray28[local1187] = arg8.anInt5024;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ac;II[Lclient!nn;BII)V")
	public final void method7736(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class240[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean709) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class240 local16 = arg3[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg2;
						@Pc(33) int local33 = arg1 + local22;
						if (local28 >= 0 && local28 < this.anInt9511 && local33 >= 0 && this.anInt9505 > local33) {
							local16.method5252(local28, local33);
						}
					}
				}
			}
		}
		local10 = arg5 + arg2;
		@Pc(92) int local92 = arg1 + arg4;
		for (local18 = 0; local18 < this.anInt9510; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method7739(false, local92 + local28, local22 - -arg2, 0, arg0, 0, arg1 + local28, local18, local10 + local22, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([[IIILclient!i;Lclient!r;Lclient!i;Lclient!i;)V")
	private void method7737(@OriginalArg(0) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class129 arg2, @OriginalArg(4) Class78 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) Class129 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray15[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray13[arg1];
		@Pc(26) byte[][] local26 = this.aByteArrayArrayArray17[arg1];
		@Pc(31) byte[][] local31 = this.aByteArrayArrayArray16[arg1];
		for (@Pc(33) int local33 = 0; local33 < this.anInt9511; local33++) {
			@Pc(47) int local47 = local33 >= this.anInt9511 - 1 ? local33 : local33 + 1;
			for (@Pc(49) int local49 = 0; local49 < this.anInt9505; local49++) {
				@Pc(67) int local67 = local49 < this.anInt9505 - 1 ? local49 + 1 : local49;
				if (Static438.anInt7785 == -1 || Static271.method3983(Static438.anInt7785, arg1, local33, local49)) {
					@Pc(81) boolean local81 = false;
					@Pc(83) boolean local83 = false;
					@Pc(86) boolean[] local86 = new boolean[4];
					@Pc(92) int local92 = local10[local33][local49];
					@Pc(98) int local98 = local15[local33][local49];
					@Pc(106) int local106 = local31[local33][local49] & 0xFF;
					@Pc(114) int local114 = local26[local33][local49] & 0xFF;
					@Pc(122) int local122 = local26[local33][local67] & 0xFF;
					@Pc(130) int local130 = local26[local47][local67] & 0xFF;
					@Pc(138) int local138 = local26[local47][local49] & 0xFF;
					if (local106 != 0 || local114 != 0) {
						@Pc(160) Class193 local160 = local106 == 0 ? null : this.aClass90_6.method2262(local106 - 1);
						@Pc(172) Class157 local172 = local114 == 0 ? null : this.aClass92_5.method2279(local114 - 1);
						if (local92 == 0 && local160 == null) {
							local92 = 12;
						}
						@Pc(180) Class193 local180 = local160;
						if (local160 != null) {
							if (local160.anInt5023 == -1 && local160.anInt5032 == -1) {
								local180 = local160;
								local160 = null;
							} else if (local172 != null && local92 != 0) {
								local83 = local160.aBoolean381;
							}
						}
						@Pc(286) int local286;
						@Pc(326) int local326;
						@Pc(379) int local379;
						@Pc(389) int local389;
						if ((local92 == 0 || local92 == 12) && local33 > 0 && local49 > 0 && this.anInt9511 > local33 && local49 < this.anInt9505) {
							@Pc(252) int local252 = local114 == local26[local47][local49 - 1] ? 1 : -1;
							@Pc(269) int local269 = local114 == local26[local47][local67] ? 1 : -1;
							local286 = local114 == local26[local33 - 1][local49 - 1] ? 1 : -1;
							if (local26[local33][local49 - 1] == local114) {
								local286++;
								local252++;
							} else {
								local286--;
								local252--;
							}
							local326 = local26[local33 - 1][local67] == local114 ? 1 : -1;
							if (local26[local47][local49] == local114) {
								local252++;
								local269++;
							} else {
								local269--;
								local252--;
							}
							if (local26[local33][local67] == local114) {
								local269++;
								local326++;
							} else {
								local326--;
								local269--;
							}
							if (local114 == local26[local33 - 1][local49]) {
								local326++;
								local286++;
							} else {
								local326--;
								local286--;
							}
							local379 = local286 - local269;
							if (local379 < 0) {
								local379 = -local379;
							}
							local389 = local252 - local326;
							if (local389 < 0) {
								local389 = -local389;
							}
							if (local379 == local389) {
								local379 = arg5.method6481(local49, local33) - arg5.method6481(local67, local47);
								if (local379 < 0) {
									local379 = -local379;
								}
								local389 = arg5.method6481(local49, local47) - arg5.method6481(local67, local33);
								if (local389 < 0) {
									local389 = -local389;
								}
							}
							local98 = local379 < local389 ? 1 : 0;
						}
						for (local286 = 0; local286 < 13; local286++) {
							Static29.anIntArray28[local286] = -1;
							Static128.anIntArray109[local286] = 1;
						}
						@Pc(471) boolean[] local471 = local160 != null && local160.aBoolean381 ? Static119.aBooleanArrayArray2[local92] : Static151.aBooleanArrayArray3[local92];
						this.method7735(local92, this.anInt9505, local15, local49, local10, local31, local33, this.anInt9511, local160, local86, arg3, local98, local172);
						@Pc(504) boolean local504 = local160 != null && local160.anInt5032 != local160.anInt5023;
						if (!local504) {
							for (local326 = 0; local326 < 8; local326++) {
								if (Static29.anIntArray28[local326] >= 0 && Static200.anIntArray186[local326] != Static524.anIntArray62[local326]) {
									local504 = true;
									break;
								}
							}
						}
						if (!local471[local98 + 1 & 0x3]) {
							local86[1] = Static13.method259(local86[1], (Static128.anIntArray109[4] & Static128.anIntArray109[2]) == 0);
						}
						if (!local471[local98 + 3 & 0x3]) {
							local86[3] = Static13.method259(local86[3], (Static128.anIntArray109[6] & Static128.anIntArray109[0]) == 0);
						}
						if (!local471[local98 & 0x3]) {
							local86[0] = Static13.method259(local86[0], (Static128.anIntArray109[2] & Static128.anIntArray109[0]) == 0);
						}
						if (!local471[local98 + 2 & 0x3]) {
							local86[2] = Static13.method259(local86[2], (Static128.anIntArray109[6] & Static128.anIntArray109[4]) == 0);
						}
						if (!local83 && (local92 == 0 || local92 == 12)) {
							if (local86[0] && !local86[1] && !local86[2] && local86[3]) {
								local98 = 0;
								local86[0] = local86[3] = false;
								local92 = local92 == 0 ? 13 : 14;
							} else if (local86[0] && local86[1] && !local86[2] && !local86[3]) {
								local98 = 3;
								local92 = local92 == 0 ? 13 : 14;
								local86[0] = local86[1] = false;
							} else if (!local86[0] && local86[1] && local86[2] && !local86[3]) {
								local86[1] = local86[2] = false;
								local92 = local92 == 0 ? 13 : 14;
								local98 = 2;
							} else if (!local86[0] && !local86[1] && local86[2] && local86[3]) {
								local92 = local92 == 0 ? 13 : 14;
								local86[2] = local86[3] = false;
								local98 = 1;
							}
						}
						@Pc(809) boolean local809 = !local83 && !local86[0] && !local86[2] && !local86[1] && !local86[3];
						@Pc(811) int[] local811 = null;
						@Pc(835) int[] local835;
						@Pc(819) int[] local819;
						@Pc(823) int[] local823;
						if (local809) {
							local823 = Static168.anIntArrayArray11[local92];
							local379 = local172 == null ? 0 : Static570.anIntArray593[local92];
							local819 = Static230.anIntArrayArray19[local92];
							local389 = local160 == null ? 0 : Static36.anIntArray518[local92];
							local835 = Static203.anIntArrayArray15[local92];
						} else if (local83) {
							local823 = Static66.anIntArrayArray5[local92];
							local819 = Static485.anIntArrayArray50[local92];
							local835 = Static428.anIntArrayArray43[local92];
							local811 = Static224.anIntArrayArray18[local92];
							local379 = local172 == null ? 0 : Static386.anIntArray406[local92];
							local389 = local160 == null ? 0 : Static282.anIntArray296[local92];
						} else {
							local819 = Static403.anIntArrayArray42[local92];
							local823 = Static333.anIntArrayArray31[local92];
							local389 = local160 == null ? 0 : Static249.anIntArray250[local92];
							local835 = Static340.anIntArrayArray32[local92];
							local811 = Static196.anIntArrayArray14[local92];
							local379 = local172 == null ? 0 : Static306.anIntArray271[local92];
						}
						@Pc(913) int local913 = local389 + local379;
						if (local913 <= 0) {
							Static419.method5955(arg1, local33, local49);
						} else {
							if (local86[0]) {
								local913++;
							}
							if (local86[2]) {
								local913++;
							}
							if (local86[1]) {
								local913++;
							}
							if (local86[3]) {
								local913++;
							}
							@Pc(943) int local943 = 0;
							@Pc(945) int local945 = 0;
							@Pc(949) int local949 = local913 * 3;
							@Pc(956) int[] local956 = local504 ? new int[local949] : null;
							@Pc(959) int[] local959 = new int[local949];
							@Pc(962) int[] local962 = new int[local949];
							@Pc(965) int[] local965 = new int[local949];
							@Pc(968) int[] local968 = new int[local949];
							@Pc(971) int[] local971 = new int[local949];
							@Pc(978) int[] local978 = arg4 == null ? null : new int[local949];
							@Pc(987) int[] local987 = arg4 == null && arg2 == null ? null : new int[local949];
							@Pc(989) int local989 = -1;
							@Pc(991) int local991 = -1;
							@Pc(993) int local993 = 256;
							@Pc(1111) byte local1111;
							@Pc(1009) int local1009;
							@Pc(1011) int local1011;
							@Pc(1243) int local1243;
							@Pc(1249) int local1249;
							@Pc(1258) int local1258;
							@Pc(1263) int local1263;
							@Pc(1273) int local1273;
							@Pc(1268) int local1268;
							@Pc(1278) int local1278;
							@Pc(1335) int local1335;
							@Pc(1341) int local1341;
							if (local160 != null) {
								local989 = local160.anInt5023;
								local993 = local160.anInt5028;
								local991 = local160.anInt5019;
								local1009 = Static170.method2741(arg3, local160);
								for (local1011 = 0; local1011 < local389; local1011++) {
									if (local86[-local98 & 0x3] && local943 == local811[0]) {
										Static449.anIntArray470[0] = local835[local943];
										Static449.anIntArray470[1] = 1;
										Static449.anIntArray470[2] = local823[local943];
										Static449.anIntArray470[3] = 1;
										Static449.anIntArray470[4] = local819[local943];
										local1111 = 6;
										Static449.anIntArray470[5] = local823[local943];
									} else if (local86[2 - local98 & 0x3] && local943 == local811[2]) {
										Static449.anIntArray470[0] = local835[local943];
										Static449.anIntArray470[1] = 5;
										Static449.anIntArray470[2] = local823[local943];
										Static449.anIntArray470[3] = 5;
										Static449.anIntArray470[4] = local819[local943];
										local1111 = 6;
										Static449.anIntArray470[5] = local823[local943];
									} else if (local86[1 - local98 & 0x3] && local943 == local811[1]) {
										Static449.anIntArray470[0] = local835[local943];
										Static449.anIntArray470[1] = 3;
										Static449.anIntArray470[2] = local823[local943];
										Static449.anIntArray470[3] = 3;
										Static449.anIntArray470[4] = local819[local943];
										local1111 = 6;
										Static449.anIntArray470[5] = local823[local943];
									} else if (local86[3 - local98 & 0x3] && local943 == local811[3]) {
										Static449.anIntArray470[0] = local835[local943];
										Static449.anIntArray470[1] = 7;
										Static449.anIntArray470[2] = local823[local943];
										Static449.anIntArray470[3] = 7;
										Static449.anIntArray470[4] = local819[local943];
										Static449.anIntArray470[5] = local823[local943];
										local1111 = 6;
									} else {
										Static449.anIntArray470[0] = local835[local943];
										Static449.anIntArray470[1] = local819[local943];
										Static449.anIntArray470[2] = local823[local943];
										local1111 = 3;
									}
									for (local1243 = 0; local1243 < local1111; local1243++) {
										local1249 = Static449.anIntArray470[local1243];
										local1258 = local1249 - local98 * 2 & 0x7;
										local1263 = this.anIntArray599[local1249];
										local1268 = this.anIntArray600[local1249];
										if (local98 == 1) {
											local1273 = local1268;
											local1278 = 512 - local1263;
										} else if (local98 == 2) {
											local1278 = 512 - local1268;
											local1273 = 512 - local1263;
										} else if (local98 == 3) {
											local1278 = local1263;
											local1273 = 512 - local1268;
										} else {
											local1278 = local1268;
											local1273 = local1263;
										}
										local959[local945] = local1273;
										local962[local945] = local1278;
										if (local978 != null && Static86.aBooleanArrayArray1[local92][local1249]) {
											local1335 = (local33 << 9) + local1273;
											local1341 = local1278 + (local49 << 9);
											local978[local945] = arg4.method6480(local1341, local1335) - arg5.method6480(local1341, local1335);
										}
										if (local987 != null) {
											if (arg4 != null && !Static86.aBooleanArrayArray1[local92][local1249]) {
												local1335 = (local33 << 9) + local1273;
												local1341 = local1278 + (local49 << 9);
												local987[local945] = arg5.method6480(local1341, local1335) - arg4.method6480(local1341, local1335);
											} else if (arg2 != null && !Static429.aBooleanArrayArray6[local92][local1249]) {
												local1335 = (local33 << 9) + local1273;
												local1341 = local1278 + (local49 << 9);
												local987[local945] = arg2.method6480(local1341, local1335) - arg5.method6480(local1341, local1335);
											}
										}
										if (local1249 < 8 && local160.anInt5024 < Static29.anIntArray28[local1258]) {
											if (local956 != null) {
												local956[local945] = Static524.anIntArray62[local1258];
											}
											local971[local945] = Static201.anIntArray187[local1258];
											local968[local945] = Static500.anIntArray525[local1258];
											local965[local945] = Static200.anIntArray186[local1258];
										} else {
											if (local956 != null) {
												local956[local945] = local1009;
											}
											local968[local945] = local160.anInt5019;
											local971[local945] = local160.anInt5028;
											local965[local945] = local989;
										}
										local945++;
									}
									local943++;
								}
								if (!this.aBoolean709 && arg1 == 0) {
									Static217.method3238(local33, local49, local160.anInt5031, local160.anInt5021 * 8, local160.anInt5029);
								}
								if (local92 != 12 && local160.anInt5023 != -1 && local160.aBoolean380) {
									local81 = true;
								}
							} else if (local809) {
								local943 = Static36.anIntArray518[local92];
							} else if (local83) {
								local943 = Static282.anIntArray296[local92];
							} else {
								local943 = Static249.anIntArray250[local92];
							}
							if (local172 != null) {
								if (local130 == 0) {
									local130 = local114;
								}
								if (local122 == 0) {
									local122 = local114;
								}
								if (local138 == 0) {
									local138 = local114;
								}
								@Pc(1598) Class157 local1598 = this.aClass92_5.method2279(local114 - 1);
								@Pc(1606) Class157 local1606 = this.aClass92_5.method2279(local122 - 1);
								@Pc(1614) Class157 local1614 = this.aClass92_5.method2279(local130 - 1);
								@Pc(1622) Class157 local1622 = this.aClass92_5.method2279(local138 - 1);
								for (local1258 = 0; local1258 < local379; local1258++) {
									if (local86[-local98 & 0x3] && local943 == local811[0]) {
										Static449.anIntArray470[0] = local835[local943];
										Static449.anIntArray470[1] = 1;
										Static449.anIntArray470[2] = local823[local943];
										Static449.anIntArray470[3] = 1;
										Static449.anIntArray470[4] = local819[local943];
										Static449.anIntArray470[5] = local823[local943];
										local1111 = 6;
									} else if (local86[2 - local98 & 0x3] && local943 == local811[2]) {
										Static449.anIntArray470[0] = local835[local943];
										Static449.anIntArray470[1] = 5;
										Static449.anIntArray470[2] = local823[local943];
										Static449.anIntArray470[3] = 5;
										Static449.anIntArray470[4] = local819[local943];
										local1111 = 6;
										Static449.anIntArray470[5] = local823[local943];
									} else if (local86[1 - local98 & 0x3] && local811[1] == local943) {
										Static449.anIntArray470[0] = local835[local943];
										Static449.anIntArray470[1] = 3;
										Static449.anIntArray470[2] = local823[local943];
										Static449.anIntArray470[3] = 3;
										Static449.anIntArray470[4] = local819[local943];
										local1111 = 6;
										Static449.anIntArray470[5] = local823[local943];
									} else if (local86[3 - local98 & 0x3] && local811[3] == local943) {
										Static449.anIntArray470[0] = local835[local943];
										Static449.anIntArray470[1] = 7;
										Static449.anIntArray470[2] = local823[local943];
										Static449.anIntArray470[3] = 7;
										Static449.anIntArray470[4] = local819[local943];
										Static449.anIntArray470[5] = local823[local943];
										local1111 = 6;
									} else {
										Static449.anIntArray470[0] = local835[local943];
										Static449.anIntArray470[1] = local819[local943];
										local1111 = 3;
										Static449.anIntArray470[2] = local823[local943];
									}
									local943++;
									for (local1263 = 0; local1263 < local1111; local1263++) {
										local1273 = Static449.anIntArray470[local1263];
										local1268 = local1273 - local98 * 2 & 0x7;
										local1278 = this.anIntArray599[local1273];
										local1341 = this.anIntArray600[local1273];
										@Pc(1897) int local1897;
										if (local98 == 1) {
											local1335 = local1341;
											local1897 = 512 - local1278;
										} else if (local98 == 2) {
											local1897 = 512 - local1341;
											local1335 = 512 - local1278;
										} else if (local98 == 3) {
											local1897 = local1278;
											local1335 = 512 - local1341;
										} else {
											local1897 = local1341;
											local1335 = local1278;
										}
										local959[local945] = local1335;
										local962[local945] = local1897;
										@Pc(1954) int local1954;
										@Pc(1960) int local1960;
										if (local978 != null && Static86.aBooleanArrayArray1[local92][local1273]) {
											local1954 = local1335 + (local33 << 9);
											local1960 = local1897 + (local49 << 9);
											local978[local945] = arg4.method6480(local1960, local1954) - arg5.method6480(local1960, local1954);
										}
										if (local987 != null) {
											if (arg4 != null && !Static86.aBooleanArrayArray1[local92][local1273]) {
												local1954 = local1335 + (local33 << 9);
												local1960 = local1897 + (local49 << 9);
												local987[local945] = arg5.method6480(local1960, local1954) - arg4.method6480(local1960, local1954);
											} else if (arg2 != null && !Static429.aBooleanArrayArray6[local92][local1273]) {
												local1954 = local1335 + (local33 << 9);
												local1960 = local1897 + (local49 << 9);
												local987[local945] = arg2.method6480(local1960, local1954) - arg5.method6480(local1960, local1954);
											}
										}
										if (local1273 < 8 && Static29.anIntArray28[local1268] >= 0) {
											if (local956 != null) {
												local956[local945] = Static524.anIntArray62[local1268];
											}
											local971[local945] = Static201.anIntArray187[local1268];
											local968[local945] = Static500.anIntArray525[local1268];
											local965[local945] = Static200.anIntArray186[local1268];
										} else {
											if (local83 && Static86.aBooleanArrayArray1[local92][local1273]) {
												local968[local945] = local991;
												local971[local945] = local993;
												local965[local945] = local989;
											} else if (local1335 == 0 && local1897 == 0) {
												local965[local945] = arg0[local33][local49];
												local968[local945] = local1598.anInt4109;
												local971[local945] = local1598.anInt4103;
											} else if (local1335 == 0 && local1897 == 512) {
												local965[local945] = arg0[local33][local67];
												local968[local945] = local1606.anInt4109;
												local971[local945] = local1606.anInt4103;
											} else if (local1335 == 512 && local1897 == 512) {
												local965[local945] = arg0[local47][local67];
												local968[local945] = local1614.anInt4109;
												local971[local945] = local1614.anInt4103;
											} else if (local1335 == 512 && local1897 == 0) {
												local965[local945] = arg0[local47][local49];
												local968[local945] = local1622.anInt4109;
												local971[local945] = local1622.anInt4103;
											} else {
												if (local1335 < 256) {
													if (local1897 < 256) {
														local968[local945] = local1598.anInt4109;
														local971[local945] = local1598.anInt4103;
													} else {
														local968[local945] = local1606.anInt4109;
														local971[local945] = local1606.anInt4103;
													}
												} else if (local1897 >= 256) {
													local968[local945] = local1614.anInt4109;
													local971[local945] = local1614.anInt4103;
												} else {
													local968[local945] = local1622.anInt4109;
													local971[local945] = local1622.anInt4103;
												}
												local1954 = Static465.method6469(arg0[local33][local49], arg0[local47][local49], local1335 << 7 >> 9);
												local1960 = Static465.method6469(arg0[local33][local67], arg0[local47][local67], local1335 << 7 >> 9);
												local965[local945] = Static465.method6469(local1954, local1960, local1897 << 7 >> 9);
											}
											if (local956 != null) {
												local956[local945] = local965[local945];
											}
										}
										local945++;
									}
								}
								if (local92 != 0 && local172.aBoolean289) {
									local81 = true;
								}
							}
							local1009 = arg5.method6481(local49, local33);
							local1011 = arg5.method6481(local49, local47);
							local1243 = arg5.method6481(local67, local47);
							local1249 = arg5.method6481(local67, local33);
							@Pc(2386) boolean local2386 = Static34.method641(local33, local49);
							if (local2386 && arg1 > 1 || !local2386 && arg1 > 0) {
								@Pc(2402) boolean local2402 = true;
								if (local172 != null && !local172.aBoolean290) {
									local2402 = false;
								} else if (local114 == 0 && local92 != 0) {
									local2402 = false;
								} else if (local106 > 0 && local180 != null && !local180.aBoolean382) {
									local2402 = false;
								}
								if (local2402 && local1009 == local1011 && local1009 == local1243 && local1009 == local1249) {
									this.aByteArrayArrayArray14[arg1][local33][local49] = (byte) (this.aByteArrayArrayArray14[arg1][local33][local49] | 0x4);
								}
							}
							local1263 = 0;
							local1273 = 0;
							local1268 = 0;
							if (this.aBoolean709) {
								local1263 = Static440.method6225(local33, local49);
								local1273 = Static227.method3388(local33, local49);
								local1268 = Static73.method1224(local33, local49);
							}
							arg5.O(local33, local49, local959, local978, local962, local987, local965, local956, local968, local971, local1263, local1273, local1268, local81);
							Static419.method5955(arg1, local33, local49);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V")
	private void method7738(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg2; local7 < arg2 + 64; local7++) {
			for (local11 = arg1; local11 < arg1 + 64; local11++) {
				if (local11 >= 0 && this.anInt9511 > local11 && local7 >= 0 && this.anInt9505 > local7) {
					this.anIntArrayArrayArray19[arg0][local11][local7] = arg0 <= 0 ? 0 : this.anIntArrayArrayArray19[arg0 - 1][local11][local7] - 960;
				}
			}
		}
		if (arg1 > 0 && this.anInt9511 > arg1) {
			for (local11 = arg2 + 1; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && this.anInt9505 > local11) {
					this.anIntArrayArrayArray19[arg0][arg1][local11] = this.anIntArrayArrayArray19[arg0][arg1 - 1][local11];
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt9505) {
			for (local11 = arg1 + 1; local11 < arg1 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt9511) {
					this.anIntArrayArrayArray19[arg0][local11][arg2] = this.anIntArrayArrayArray19[arg0][local11][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || this.anInt9511 <= arg1 || arg2 >= this.anInt9505) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2] != 0) {
				this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray19[arg0][arg1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1][arg2 - 1];
				return;
			}
			if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray19[arg0 - 1][arg1 - 1][arg2] != this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2]) {
			this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray19[arg0 - 1][arg1][arg2 - 1] != this.anIntArrayArrayArray19[arg0][arg1][arg2 - 1]) {
			this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1][arg2 - 1];
			return;
		}
		if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray19[arg0 - 1][arg1 - 1][arg2 - 1] != this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIIIILclient!ac;IIIII)V")
	private void method7739(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg9 == 1) {
			arg3 = 1;
		} else if (arg9 == 2) {
			arg5 = 1;
			arg3 = 1;
		} else if (arg9 == 3) {
			arg5 = 1;
		}
		@Pc(71) int local71;
		if (arg2 < 0 || this.anInt9511 <= arg2 || arg6 < 0 || this.anInt9505 <= arg6) {
			while (true) {
				local71 = arg4.method7974();
				if (local71 == 0) {
					return;
				}
				if (local71 == 1) {
					arg4.method7974();
					return;
				}
				if (local71 <= 49) {
					arg4.method7974();
				}
			}
			return;
		}
		if (!this.aBoolean709 && !arg0) {
			Static85.aByteArrayArrayArray1[arg7][arg2][arg6] = 0;
		}
		while (true) {
			local71 = arg4.method7974();
			if (local71 == 0) {
				if (this.aBoolean709) {
					this.anIntArrayArrayArray19[0][arg5 + arg2][arg6 + arg3] = 0;
					return;
				} else if (arg7 == 0) {
					this.anIntArrayArrayArray19[0][arg5 + arg2][arg3 + arg6] = -Static426.method6091(arg1 + 556238, arg8 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray19[arg7][arg5 + arg2][arg3 + arg6] = this.anIntArrayArrayArray19[arg7 - 1][arg5 + arg2][arg6 + arg3] - 960;
					return;
				}
			}
			if (local71 == 1) {
				@Pc(157) int local157 = arg4.method7974();
				if (!this.aBoolean709) {
					if (local157 == 1) {
						local157 = 0;
					}
					if (arg7 != 0) {
						this.anIntArrayArrayArray19[arg7][arg2 + arg5][arg3 + arg6] = this.anIntArrayArrayArray19[arg7 - 1][arg5 + arg2][arg3 + arg6] - (local157 * 8 << 2);
						return;
					}
					this.anIntArrayArrayArray19[0][arg5 + arg2][arg3 + arg6] = -local157 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray19[0][arg5 + arg2][arg6 + arg3] = local157 * 8 << 2;
				return;
			}
			if (local71 <= 49) {
				if (arg0) {
					arg4.method7974();
				} else {
					this.aByteArrayArrayArray16[arg7][arg2][arg6] = arg4.method7963();
					this.aByteArrayArrayArray15[arg7][arg2][arg6] = (byte) ((local71 - 2) / 4);
					this.aByteArrayArrayArray13[arg7][arg2][arg6] = (byte) (local71 + arg9 - 2 & 0x3);
				}
			} else if (local71 <= 81) {
				if (!this.aBoolean709 && !arg0) {
					Static85.aByteArrayArrayArray1[arg7][arg2][arg6] = (byte) (local71 - 49);
				}
			} else if (!arg0) {
				this.aByteArrayArrayArray17[arg7][arg2][arg6] = (byte) (local71 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!nn;[[[IBLclient!r;)V")
	public final void method7741(@OriginalArg(0) Class240[] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean709) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt9511; local14++) {
					for (local18 = 0; local18 < this.anInt9505; local18++) {
						if ((Static85.aByteArrayArrayArray1[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static85.aByteArrayArrayArray1[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg0[local32].method5261(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt9510; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean709) {
				if (Static166.aBoolean588) {
					local14 = 2;
				}
				if (Static232.aBoolean310) {
					local18 = 8;
				}
				if (Static542.anInt9094 != 0) {
					local14 |= 0x1;
					if (Static388.aBoolean532 | local10 == 0) {
						local18 |= 0x10;
					}
				}
			}
			if (Static166.aBoolean588) {
				local18 |= 0x7;
			}
			if (!Static110.aBoolean122) {
				local18 |= 0x20;
			}
			@Pc(143) int[][] local143 = arg1 == null || arg1.length <= local10 ? this.anIntArrayArrayArray19[local10] : arg1[local10];
			Static557.method7543(local10, arg2.method6791(this.anInt9511, this.anInt9505, this.anIntArrayArrayArray19[local10], local143, local14, local18));
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII[Lclient!nn;IILclient!ac;II)V")
	public final void method7742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class240[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub3 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg0 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean709) {
			@Pc(24) Class240 local24 = arg3[arg1];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static267.method3892(local30 & 0x7, arg2, local26 & 0x7) + arg8;
					local56 = Static53.method7904(local26 & 0x7, local30 & 0x7, arg2) + arg7;
					if (local44 > 0 && local44 < this.anInt9511 - 1 && local56 > 0 && local56 < this.anInt9505 - 1) {
						local24.method5252(local44, local56);
					}
				}
			}
		}
		@Pc(98) int local98 = (arg4 & 0x7) * 8;
		@Pc(104) int local104 = (arg0 & 0x1FFFFFF8) << 3;
		local26 = (arg4 & 0xFFFFFFF8) << 3;
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
		for (local56 = 0; local56 < this.anInt9510; local56++) {
			for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
				for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
					if (arg5 == local56 && local145 >= local11 && local11 + 8 >= local145 && local149 >= local98 && local149 <= local98 + 8) {
						@Pc(223) int local223;
						@Pc(236) int local236;
						if (local11 + 8 == local145 || local98 + 8 == local149) {
							if (arg2 == 0) {
								local236 = local149 + arg7 - local98;
								local223 = arg8 + local145 - local11;
							} else if (arg2 == 1) {
								local236 = local11 + arg7 + 8 - local145;
								local223 = arg8 + local149 - local98;
							} else if (arg2 == 2) {
								local223 = local11 + arg8 + 8 - local145;
								local236 = local98 + arg7 + 8 - local149;
							} else {
								local236 = arg7 + local145 - local11;
								local223 = local98 + arg8 + 8 - local149;
							}
							this.method7739(true, local149 + local26, local223, 0, arg6, 0, local236, arg1, local145 + local104, 0);
						} else {
							local223 = arg8 + Static267.method3892(local149 & 0x7, arg2, local145 & 0x7);
							local236 = arg7 + Static53.method7904(local145 & 0x7, local149 & 0x7, arg2);
							this.method7739(false, local26 + local149, local223, local114, arg6, local112, local236, arg1, local145 + local104, arg2);
						}
						if (local145 == 63 || local149 == 63) {
							@Pc(366) byte local366 = 1;
							if (local145 == 63 && local149 == 63) {
								local366 = 3;
							}
							for (@Pc(380) int local380 = 0; local380 < local366; local380++) {
								@Pc(384) int local384 = local145;
								@Pc(386) int local386 = local149;
								if (local380 == 0) {
									local386 = local149 == 63 ? 64 : local149;
									local384 = local145 == 63 ? 64 : local145;
								} else if (local380 == 1) {
									local384 = 64;
								} else if (local380 == 2) {
									local386 = 64;
								}
								@Pc(440) int local440;
								@Pc(433) int local433;
								if (arg2 == 0) {
									local433 = local386 + arg7 - local98;
									local440 = arg8 + local384 - local11;
								} else if (arg2 == 1) {
									local440 = local386 + arg8 - local98;
									local433 = local11 + arg7 + 8 - local384;
								} else if (arg2 == 2) {
									local440 = arg8 + local11 + 8 - local384;
									local433 = local98 + arg7 + 8 - local386;
								} else {
									local440 = local98 + arg8 + 8 - local386;
									local433 = local384 + arg7 - local11;
								}
								if (local440 >= 0 && local440 < this.anInt9511 && local433 >= 0 && this.anInt9505 > local433) {
									this.anIntArrayArrayArray19[arg1][local440][local433] = this.anIntArrayArrayArray19[arg1][local112 + local223][local236 + local114];
								}
							}
						}
					} else {
						this.method7739(false, 0, -1, 0, arg6, 0, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([[ILclient!i;BLclient!r;Lclient!i;Lclient!i;I)V")
	private void method7743(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(3) Class78 arg2, @OriginalArg(4) Class129 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) int arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9511; local7++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt9505; local19++) {
				if (Static438.anInt7785 == -1 || Static271.method3983(Static438.anInt7785, arg5, local7, local19)) {
					@Pc(42) byte local42 = this.aByteArrayArrayArray15[arg5][local7][local19];
					@Pc(51) byte local51 = this.aByteArrayArrayArray13[arg5][local7][local19];
					@Pc(62) int local62 = this.aByteArrayArrayArray16[arg5][local7][local19] & 0xFF;
					@Pc(73) int local73 = this.aByteArrayArrayArray17[arg5][local7][local19] & 0xFF;
					@Pc(85) Class193 local85 = local62 == 0 ? null : this.aClass90_6.method2262(local62 - 1);
					@Pc(97) Class157 local97 = local73 == 0 ? null : this.aClass92_5.method2279(local73 - 1);
					@Pc(99) int local99 = 0;
					@Pc(101) int local101 = 0;
					if (local42 != 0) {
						local99 = local97 == null ? 0 : Static570.anIntArray593[local42];
						local101 = local85 == null ? 0 : Static36.anIntArray518[local42];
					} else if (local85 != null) {
						local101 = Static36.anIntArray518[local42];
					} else if (local97 != null) {
						local99 = Static36.anIntArray518[local42];
					}
					@Pc(140) int local140 = local101 + local99;
					@Pc(142) int local142 = 0;
					if (local140 != 0) {
						@Pc(153) int local153;
						if (Static438.aBoolean587) {
							local153 = local85 == null ? -1 : local85.anInt5019;
						} else {
							local153 = -1;
						}
						@Pc(160) int[] local160 = new int[local140];
						@Pc(163) int[] local163 = new int[local140];
						@Pc(166) int[] local166 = new int[local140];
						@Pc(169) int[] local169 = new int[local140];
						@Pc(171) boolean local171 = false;
						@Pc(187) int local187;
						if (local85 == null || local85.anInt5023 == -1 && local85.anInt5032 == -1 && local153 == -1) {
							for (local187 = 0; local187 < local101; local187++) {
								local160[local142] = -1;
								local142++;
							}
						} else {
							for (local187 = 0; local187 < local101; local187++) {
								local166[local142] = local153;
								local169[local142] = local85.anInt5028;
								if (local85.anInt5023 == -1) {
									local160[local142] = -1;
								} else {
									local160[local142] = local85.anInt5023;
								}
								if (local85.anInt5032 == -1) {
									local163[local142] = -1;
								} else {
									local163[local142] = local85.anInt5032;
									local171 = true;
								}
								local142++;
							}
							if (!this.aBoolean709 && arg5 == 0) {
								Static217.method3238(local7, local19, local85.anInt5031, local85.anInt5021 * 8, local85.anInt5029);
							}
						}
						if (!local171) {
							local163 = null;
						}
						if (local97 == null) {
							for (local187 = 0; local187 < local99; local187++) {
								local160[local142] = -1;
								local142++;
							}
						} else {
							local187 = local97.anInt4109;
							if (Static438.aBoolean587) {
								local187 = -1;
							}
							for (@Pc(312) int local312 = 0; local312 < local99; local312++) {
								local166[local142] = local187;
								local169[local142] = local97.anInt4103;
								local160[local142] = arg0[local7][local19];
								if (local163 != null) {
									local163[local142] = -1;
								}
								local142++;
							}
						}
						local187 = this.anIntArray599.length;
						@Pc(353) int[] local353 = new int[local187];
						@Pc(356) int[] local356 = new int[local187];
						@Pc(363) int[] local363 = arg4 == null ? null : new int[local187];
						@Pc(372) int[] local372 = arg4 == null && arg3 == null ? null : new int[local187];
						@Pc(381) int local381;
						@Pc(386) int local386;
						@Pc(468) int local468;
						@Pc(474) int local474;
						for (@Pc(374) int local374 = 0; local374 < local187; local374++) {
							local381 = this.anIntArray599[local374];
							local386 = this.anIntArray600[local374];
							if (local51 == 0) {
								local353[local374] = local381;
								local356[local374] = local386;
							} else if (local51 == 1) {
								local353[local374] = local386;
								local356[local374] = 512 - local381;
							} else if (local51 == 2) {
								local353[local374] = 512 - local381;
								local356[local374] = 512 - local386;
							} else if (local51 == 3) {
								local353[local374] = 512 - local386;
								local356[local374] = local381;
							}
							if (local363 != null && Static86.aBooleanArrayArray1[local42][local374]) {
								local468 = local381 + (local7 << 9);
								local474 = local381 + (local19 << 9);
								local363[local374] = arg4.method6480(local474, local468) - arg1.method6480(local474, local468);
							}
							if (local372 != null) {
								if (arg4 != null && !Static86.aBooleanArrayArray1[local42][local374]) {
									local468 = local381 + (local7 << 9);
									local474 = local381 + (local19 << 9);
									local372[local374] = arg1.method6480(local474, local468) - arg4.method6480(local474, local468);
								} else if (arg3 != null && !Static429.aBooleanArrayArray6[local42][local374]) {
									local468 = local381 + (local7 << 9);
									local474 = local381 + (local19 << 9);
									local372[local374] = arg3.method6480(local474, local468) - arg1.method6480(local474, local468);
								}
							}
						}
						local381 = arg1.method6481(local19, local7);
						local386 = arg1.method6481(local19, local7 + 1);
						local468 = arg1.method6481(local19 + 1, local7 - -1);
						local474 = arg1.method6481(local19 + 1, local7);
						@Pc(606) boolean local606 = Static34.method641(local7, local19);
						if (local606 && arg5 > 1 || !local606 && arg5 > 0) {
							@Pc(622) boolean local622 = true;
							if (local97 != null && !local97.aBoolean290) {
								local622 = false;
							} else if (local73 == 0 && local42 != 0) {
								local622 = false;
							} else if (local62 > 0 && local85 != null && !local85.aBoolean382) {
								local622 = false;
							}
							if (local622 && local381 == local386 && local468 == local381 && local381 == local474) {
								this.aByteArrayArrayArray14[arg5][local7][local19] = (byte) (this.aByteArrayArrayArray14[arg5][local7][local19] | 0x4);
							}
						}
						@Pc(690) int local690 = 0;
						@Pc(692) int local692 = 0;
						@Pc(694) int local694 = 0;
						if (this.aBoolean709) {
							local690 = Static440.method6225(local7, local19);
							local692 = Static227.method3388(local7, local19);
							local694 = Static73.method1224(local7, local19);
						}
						arg1.method6473(local7, local19, local353, local363, local356, local372, Static203.anIntArrayArray15[local42], Static230.anIntArrayArray19[local42], Static168.anIntArrayArray11[local42], local160, local163, local166, local169, local690, local692, local694);
						Static419.method5955(arg5, local7, local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
	public final void method7744(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt9510; local12++) {
			this.method7738(local12, arg0, arg1);
		}
	}
}
