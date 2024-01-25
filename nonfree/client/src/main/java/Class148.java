import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public class Class148 {

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "[I")
	private final int[] anIntArray390 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!ll", name = "B", descriptor = "[I")
	private final int[] anIntArray391 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
	public final int anInt6342;

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "Lclient!bc;")
	private final Class18 aClass18_4;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "Z")
	public final boolean aBoolean521;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
	protected final int anInt6333;

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "Lclient!br;")
	private final Class28 aClass28_6;

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
	protected final int anInt6341;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ll", name = "z", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIZLclient!br;Lclient!bc;)V")
	protected Class148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class28 arg4, @OriginalArg(5) Class18 arg5) {
		this.anInt6342 = arg0;
		this.aClass18_4 = arg5;
		this.aBoolean521 = arg3;
		this.anInt6333 = arg1;
		this.aClass28_6 = arg4;
		this.anInt6341 = arg2;
		this.aByteArrayArrayArray14 = new byte[this.anInt6342][this.anInt6333][this.anInt6341];
		this.anIntArrayArrayArray14 = new int[this.anInt6342][this.anInt6333 + 1][this.anInt6341 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt6342][this.anInt6333][this.anInt6341];
		this.aByteArrayArrayArray17 = new byte[this.anInt6342][this.anInt6333][this.anInt6341];
		this.aByteArrayArrayArray13 = new byte[this.anInt6342][this.anInt6333][this.anInt6341];
		this.aByteArrayArrayArray15 = new byte[this.anInt6342][this.anInt6333 + 1][this.anInt6341 + 1];
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIBI)V")
	public final void method4869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13;
		for (@Pc(9) int local9 = arg3; local9 < arg2 + arg3; local9++) {
			for (local13 = arg1; local13 < arg4 + arg1; local13++) {
				if (local13 >= 0 && this.anInt6333 > local13 && local9 >= 0 && this.anInt6341 > local9) {
					this.anIntArrayArrayArray14[arg0][local13][local9] = arg0 > 0 ? this.anIntArrayArrayArray14[arg0 - 1][local13][local9] - 240 : 0;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt6333) {
			for (local13 = arg3 + 1; local13 < arg3 + arg2; local13++) {
				if (local13 >= 0 && this.anInt6341 > local13) {
					this.anIntArrayArrayArray14[arg0][arg1][local13] = this.anIntArrayArrayArray14[arg0][arg1 - 1][local13];
				}
			}
		}
		if (arg3 > 0 && arg3 < this.anInt6341) {
			for (local13 = arg1 + 1; local13 < arg4 + arg1; local13++) {
				if (local13 >= 0 && this.anInt6333 > local13) {
					this.anIntArrayArrayArray14[arg0][local13][arg3] = this.anIntArrayArrayArray14[arg0][local13][arg3 - 1];
				}
			}
		}
		if (arg1 < 0 || arg3 < 0 || this.anInt6333 <= arg1 || arg3 >= this.anInt6341) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray14[arg0][arg1 - 1][arg3] != 0) {
				this.anIntArrayArrayArray14[arg0][arg1][arg3] = this.anIntArrayArrayArray14[arg0][arg1 - 1][arg3];
				return;
			}
			if (arg3 > 0 && this.anIntArrayArrayArray14[arg0][arg1][arg3 - 1] != 0) {
				this.anIntArrayArrayArray14[arg0][arg1][arg3] = this.anIntArrayArrayArray14[arg0][arg1][arg3 - 1];
				return;
			}
			if (arg1 > 0 && arg3 > 0 && this.anIntArrayArrayArray14[arg0][arg1 - 1][arg3 - 1] != 0) {
				this.anIntArrayArrayArray14[arg0][arg1][arg3] = this.anIntArrayArrayArray14[arg0][arg1 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray14[arg0 - 1][arg1 - 1][arg3] != this.anIntArrayArrayArray14[arg0][arg1 - 1][arg3]) {
			this.anIntArrayArrayArray14[arg0][arg1][arg3] = this.anIntArrayArrayArray14[arg0][arg1 - 1][arg3];
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray14[arg0][arg1][arg3 - 1] != this.anIntArrayArrayArray14[arg0 - 1][arg1][arg3 - 1]) {
			this.anIntArrayArrayArray14[arg0][arg1][arg3] = this.anIntArrayArrayArray14[arg0][arg1][arg3 - 1];
			return;
		}
		if (arg1 > 0 && arg3 > 0 && this.anIntArrayArrayArray14[arg0 - 1][arg1 - 1][arg3 - 1] != this.anIntArrayArrayArray14[arg0][arg1 - 1][arg3 - 1]) {
			this.anIntArrayArrayArray14[arg0][arg1][arg3] = this.anIntArrayArrayArray14[arg0][arg1 - 1][arg3 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!qa;Z[[[I[Lclient!vb;)V")
	public final void method4870(@OriginalArg(0) Class128 arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) Class247[] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean521) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt6333; local14++) {
					for (local18 = 0; local18 < this.anInt6341; local18++) {
						if ((Static357.aByteArrayArrayArray11[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static357.aByteArrayArrayArray11[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg2[local32].method5268(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt6342; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean521) {
				if (Static127.aBoolean164) {
					local18 = 8;
				}
				if (Static202.aBoolean253) {
					local14 = 2;
				}
				if (Static265.anInt4222 != 0) {
					if (Static40.aBoolean385 | local10 == 0) {
						local18 |= 0x10;
					}
					local14 |= 0x1;
				}
			}
			if (Static202.aBoolean253) {
				local18 |= 0x7;
			}
			if (!Static144.aBoolean180) {
				local18 |= 0x20;
			}
			@Pc(152) int[][] local152 = arg1 == null || local10 >= arg1.length ? this.anIntArrayArrayArray14[local10] : arg1[local10];
			Static418.method5207(local10, arg0.method3560(this.anInt6333, this.anInt6341, this.anIntArrayArrayArray14[local10], local152, local14, local18));
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!na;[[ILclient!na;Lclient!na;IILclient!qa;)V")
	private void method4871(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class163 arg2, @OriginalArg(3) Class163 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class128 arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6333; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt6341; local11++) {
				if (Static101.anInt6645 == -1 || Static66.method997(local11, Static101.anInt6645, arg4, local7)) {
					@Pc(35) byte local35 = this.aByteArrayArrayArray13[arg4][local7][local11];
					@Pc(44) byte local44 = this.aByteArrayArrayArray17[arg4][local7][local11];
					@Pc(55) int local55 = this.aByteArrayArrayArray14[arg4][local7][local11] & 0xFF;
					@Pc(66) int local66 = this.aByteArrayArrayArray16[arg4][local7][local11] & 0xFF;
					@Pc(78) Class258 local78 = local55 == 0 ? null : this.aClass28_6.method615(local55 - 1);
					@Pc(95) Class73 local95 = local66 == 0 ? null : this.aClass18_4.method392(local66 - 1);
					@Pc(97) int local97 = 0;
					@Pc(99) int local99 = 0;
					if (local35 != 0) {
						local99 = local78 == null ? 0 : Static254.anIntArray218[local35];
						local97 = local95 == null ? 0 : Static377.anIntArray384[local35];
					} else if (local78 != null) {
						local99 = Static254.anIntArray218[local35];
					} else if (local95 != null) {
						local97 = Static254.anIntArray218[local35];
					}
					@Pc(140) int local140 = local97 + local99;
					@Pc(142) int local142 = 0;
					if (local140 != 0) {
						@Pc(150) int[] local150 = new int[local140];
						@Pc(153) int[] local153 = new int[local140];
						@Pc(156) int[] local156 = new int[local140];
						@Pc(159) int[] local159 = new int[local140];
						@Pc(161) boolean local161 = false;
						@Pc(179) int local179;
						@Pc(207) int local207;
						if (local78 == null || local78.anInt7302 == -1 && local78.anInt7291 == -1 && local78.anInt7299 == -1) {
							for (local179 = 0; local179 < local99; local179++) {
								local150[local142] = -1;
								local142++;
							}
						} else {
							local179 = arg5.method3569() ? local78.anInt7299 : local78.anInt7301;
							if (Static275.aBoolean345) {
								local179 = -1;
							}
							for (local207 = 0; local207 < local99; local207++) {
								local156[local142] = local179;
								local159[local142] = local78.anInt7295;
								if (local78.anInt7302 == -1) {
									local150[local142] = -1;
								} else {
									local150[local142] = local78.anInt7302;
								}
								if (local78.anInt7291 == -1) {
									local153[local142] = -1;
								} else {
									local153[local142] = local78.anInt7291;
									local161 = true;
								}
								local142++;
							}
							if (!this.aBoolean521 && arg4 == 0) {
								Static53.method826(local7, local11, local78.anInt7293, local78.anInt7300 * 8, local78.anInt7296);
							}
						}
						if (!local161) {
							local153 = null;
						}
						if (local95 == null) {
							for (local179 = 0; local179 < local97; local179++) {
								local150[local142] = -1;
								local142++;
							}
						} else {
							local179 = local95.anInt1828;
							if (Static275.aBoolean345) {
								local179 = -1;
							}
							for (local207 = 0; local207 < local97; local207++) {
								local156[local142] = local179;
								local159[local142] = local95.anInt1840;
								local150[local142] = arg1[local7][local11];
								if (local153 != null) {
									local153[local142] = -1;
								}
								local142++;
							}
						}
						local179 = this.anIntArray390.length;
						@Pc(342) int[] local342 = new int[local179];
						@Pc(345) int[] local345 = new int[local179];
						@Pc(352) int[] local352 = arg2 == null ? null : new int[local179];
						@Pc(361) int[] local361 = arg2 == null && arg3 == null ? null : new int[local179];
						@Pc(370) int local370;
						@Pc(375) int local375;
						@Pc(456) int local456;
						@Pc(462) int local462;
						for (@Pc(363) int local363 = 0; local363 < local179; local363++) {
							local370 = this.anIntArray390[local363];
							local375 = this.anIntArray391[local363];
							if (local44 == 0) {
								local342[local363] = local370;
								local345[local363] = local375;
							} else if (local44 == 1) {
								local342[local363] = local375;
								local345[local363] = 128 - local370;
							} else if (local44 == 2) {
								local342[local363] = 128 - local370;
								local345[local363] = 128 - local375;
							} else if (local44 == 3) {
								local342[local363] = 128 - local375;
								local345[local363] = local370;
							}
							if (local352 != null && Static446.aBooleanArrayArray9[local35][local363]) {
								local456 = (local7 << 7) + local370;
								local462 = local370 + (local11 << 7);
								local352[local363] = arg2.va(local456, local462) - arg0.va(local456, local462);
							}
							if (local361 != null) {
								if (arg2 != null && !Static446.aBooleanArrayArray9[local35][local363]) {
									local456 = local370 + (local7 << 7);
									local462 = (local11 << 7) + local370;
									local361[local363] = arg0.va(local456, local462) - arg2.va(local456, local462);
								} else if (arg3 != null && !Static225.aBooleanArrayArray6[local35][local363]) {
									local456 = local370 + (local7 << 7);
									local462 = (local11 << 7) + local370;
									local361[local363] = arg3.va(local456, local462) - arg0.va(local456, local462);
								}
							}
						}
						local370 = arg0.I(local7, local11);
						local375 = arg0.I(local7 + 1, local11);
						local456 = arg0.I(local7 + 1, local11 + 1);
						local462 = arg0.I(local7, local11 + 1);
						if (arg4 > 0) {
							@Pc(581) boolean local581 = true;
							if (local66 == 0 && local35 != 0) {
								local581 = false;
							}
							if (local55 > 0 && local78 != null && !local78.aBoolean598) {
								local581 = false;
							}
							if (local581 && local370 == local375 && local456 == local370 && local462 == local370) {
								this.aByteArrayArrayArray15[arg4][local7][local11] = (byte) (this.aByteArrayArrayArray15[arg4][local7][local11] | 0x4);
							}
						}
						@Pc(631) int local631 = 0;
						@Pc(633) int local633 = 0;
						@Pc(635) int local635 = 0;
						if (this.aBoolean521) {
							local631 = Static186.method3971(local7, local11);
							local633 = Static187.method2468(local7, local11);
							local635 = Static335.method4285(local7, local11);
						}
						arg0.method4513(local7, local11, local342, local352, local345, local361, Static185.anIntArrayArray170[local35], Static328.anIntArrayArray135[local35], Static79.anIntArrayArray37[local35], local150, local153, local156, local159, local631, local633, local635);
						Static410.method5129(arg4, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILclient!dh;BII[Lclient!vb;)V")
	public final void method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class247[] arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean521) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class247 local16 = arg5[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg3;
						@Pc(32) int local32 = local22 + arg0;
						if (local28 >= 0 && local28 < this.anInt6333 && local32 >= 0 && this.anInt6341 > local32) {
							local16.method5273(local32, local28);
						}
					}
				}
			}
		}
		local10 = arg3 + arg1;
		@Pc(77) int local77 = arg0 + arg4;
		for (local18 = 0; local18 < this.anInt6342; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method4874(0, local18, false, local22 + arg3, 0, 0, arg2, local28 + local77, arg0 + local28, local22 + local10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIZI)V")
	public final void method4873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt6342; local9++) {
			this.method4869(local9, arg1, 64, arg0, 64);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIZIIILclient!dh;IIBI)V")
	private void method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub11 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == 1) {
			arg4 = 1;
		} else if (arg0 == 2) {
			arg5 = 1;
			arg4 = 1;
		} else if (arg0 == 3) {
			arg5 = 1;
		}
		@Pc(55) int local55;
		if (arg3 < 0 || this.anInt6333 <= arg3 || arg8 < 0 || arg8 >= this.anInt6341) {
			while (true) {
				local55 = arg6.method4463();
				if (local55 == 0) {
					break;
				}
				if (local55 == 1) {
					arg6.method4463();
					break;
				}
				if (local55 <= 49) {
					arg6.method4463();
				}
			}
			return;
		}
		if (!this.aBoolean521 && !arg2) {
			Static357.aByteArrayArrayArray11[arg1][arg3][arg8] = 0;
		}
		while (true) {
			local55 = arg6.method4463();
			if (local55 == 0) {
				if (this.aBoolean521) {
					this.anIntArrayArrayArray14[0][arg5 + arg3][arg4 + arg8] = 0;
				} else if (arg1 == 0) {
					this.anIntArrayArrayArray14[0][arg3 + arg5][arg4 + arg8] = -Static376.method4833(arg7 + 556238, 932731 - -arg9) * 8 << 0;
				} else {
					this.anIntArrayArrayArray14[arg1][arg5 + arg3][arg8 + arg4] = this.anIntArrayArrayArray14[arg1 - 1][arg5 + arg3][arg4 + arg8] - 240;
				}
				break;
			}
			if (local55 == 1) {
				@Pc(192) int local192 = arg6.method4463();
				if (this.aBoolean521) {
					this.anIntArrayArrayArray14[0][arg5 + arg3][arg8 + arg4] = local192 * 8 << 0;
				} else {
					if (local192 == 1) {
						local192 = 0;
					}
					if (arg1 == 0) {
						this.anIntArrayArrayArray14[0][arg3 + arg5][arg8 + arg4] = -local192 * 8 << 0;
					} else {
						this.anIntArrayArrayArray14[arg1][arg3 + arg5][arg4 + arg8] = this.anIntArrayArrayArray14[arg1 - 1][arg5 + arg3][arg8 + arg4] - (local192 * 8 << 0);
					}
				}
				break;
			}
			if (local55 <= 49) {
				if (arg2) {
					arg6.method4463();
				} else {
					this.aByteArrayArrayArray14[arg1][arg3][arg8] = arg6.method4452();
					this.aByteArrayArrayArray13[arg1][arg3][arg8] = (byte) ((local55 - 2) / 4);
					this.aByteArrayArrayArray17[arg1][arg3][arg8] = (byte) (local55 + arg0 - 2 & 0x3);
				}
			} else if (local55 <= 81) {
				if (!this.aBoolean521 && !arg2) {
					Static357.aByteArrayArrayArray11[arg1][arg3][arg8] = (byte) (local55 - 49);
				}
			} else if (!arg2) {
				this.aByteArrayArrayArray16[arg1][arg3][arg8] = (byte) (local55 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZILclient!dh;[Lclient!vb;IIIII)V")
	public final void method4875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub11 arg2, @OriginalArg(4) Class247[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(17) int local17 = (arg0 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(57) int local57;
		if (!this.aBoolean521) {
			@Pc(24) Class247 local24 = arg3[arg5];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(45) int local45 = arg7 + Static81.method1239(local30 & 0x7, local26 & 0x7, arg4);
					local57 = Static404.method5028(local30 & 0x7, local26 & 0x7, arg4) + arg8;
					if (local45 > 0 && this.anInt6333 - 1 > local45 && local57 > 0 && this.anInt6341 - 1 > local57) {
						local24.method5273(local57, local45);
					}
				}
			}
		}
		@Pc(101) int local101 = (arg6 & 0x1FFFFFF8) << 3;
		local26 = (arg0 & 0xFFFFFFF8) << 3;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (arg4 == 1) {
			local111 = 1;
		} else if (arg4 == 2) {
			local111 = 1;
			local109 = 1;
		} else if (arg4 == 3) {
			local109 = 1;
		}
		for (local57 = 0; local57 < this.anInt6342; local57++) {
			for (@Pc(150) int local150 = 0; local150 < 64; local150++) {
				for (@Pc(154) int local154 = 0; local154 < 64; local154++) {
					if (arg1 == local57 && local150 >= local11 && local11 + 8 >= local150 && local17 <= local154 && local154 <= local17 + 8) {
						@Pc(210) int local210;
						@Pc(217) int local217;
						if (local11 + 8 == local150 || local17 + 8 == local154) {
							if (arg4 == 0) {
								local210 = local150 + arg7 - local11;
								local217 = local154 + arg8 - local17;
							} else if (arg4 == 1) {
								local210 = local154 + arg7 - local17;
								local217 = local11 + arg8 + 8 - local150;
							} else if (arg4 == 2) {
								local210 = arg7 + local11 + 8 - local150;
								local217 = local17 + arg8 + 8 - local154;
							} else {
								local217 = local150 + arg8 - local11;
								local210 = local17 + arg7 + 8 - local154;
							}
							this.method4874(0, arg5, true, local210, 0, 0, arg2, local154 + local26, local217, local150 + local101);
						} else {
							local210 = Static81.method1239(local154 & 0x7, local150 & 0x7, arg4) + arg7;
							local217 = arg8 + Static404.method5028(local154 & 0x7, local150 & 0x7, arg4);
							this.method4874(arg4, arg5, false, local210, local111, local109, arg2, local154 + local26, local217, local101 + local150);
							if (local150 == 63 || local154 == 63) {
								@Pc(357) int local357 = local150 == 63 ? 64 : local150;
								@Pc(364) int local364 = local154 == 63 ? 64 : local154;
								@Pc(376) int local376;
								@Pc(385) int local385;
								if (arg4 == 0) {
									local385 = local364 + arg8 - local17;
									local376 = arg7 + local357 - local11;
								} else if (arg4 == 1) {
									local376 = arg7 + local364 - local17;
									local385 = arg8 + local11 + 8 - local357;
								} else if (arg4 == 2) {
									local376 = arg7 + local11 + 8 - local357;
									local385 = arg8 + local17 + 8 - local364;
								} else {
									local385 = local357 + arg8 - local11;
									local376 = local17 + arg7 + 8 - local364;
								}
								if (local376 >= 0 && this.anInt6333 > local376 && local385 >= 0 && this.anInt6341 > local385) {
									this.anIntArrayArrayArray14[arg5][local376][local385] = this.anIntArrayArrayArray14[arg5][local109 + local210][local111 + local217];
								}
							}
						}
					} else {
						this.method4874(0, 0, false, -1, 0, 0, arg2, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!na;[[IILclient!na;Lclient!qa;Lclient!na;I)V")
	private void method4876(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class163 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) Class163 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray13[arg2];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray17[arg2];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray16[arg2];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray14[arg2];
		for (@Pc(27) int local27 = 0; local27 < this.anInt6333; local27++) {
			@Pc(45) int local45 = local27 >= this.anInt6333 - 1 ? local27 : local27 + 1;
			for (@Pc(47) int local47 = 0; local47 < this.anInt6341; local47++) {
				@Pc(65) int local65 = local47 < this.anInt6341 - 1 ? local47 + 1 : local47;
				if (Static101.anInt6645 == -1 || Static66.method997(local47, Static101.anInt6645, arg2, local27)) {
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
						@Pc(161) Class258 local161 = local105 == 0 ? null : this.aClass28_6.method615(local105 - 1);
						@Pc(176) Class73 local176 = local113 == 0 ? null : this.aClass18_4.method392(local113 - 1);
						if (local91 == 0 && local161 == null) {
							local91 = 12;
						}
						@Pc(187) Class258 local187 = local161;
						if (local161 != null) {
							if (local161.anInt7302 == -1 && local161.anInt7291 == -1) {
								local187 = local161;
								local161 = null;
							} else if (local176 != null && local91 != 0) {
								local82 = local161.aBoolean599;
							}
						}
						@Pc(300) int local300;
						@Pc(315) int local315;
						@Pc(384) int local384;
						@Pc(397) int local397;
						if ((local91 == 0 || local91 == 12) && local27 > 0 && local47 > 0 && local27 < this.anInt6333 && local47 < this.anInt6341) {
							@Pc(262) int local262 = local20[local45][local47 - 1] == local113 ? 1 : -1;
							@Pc(279) int local279 = local113 == local20[local45][local65] ? 1 : -1;
							local300 = local113 == local20[local27 - 1][local47 - 1] ? 1 : -1;
							local315 = local20[local27 - 1][local65] == local113 ? 1 : -1;
							if (local113 == local20[local27][local47 - 1]) {
								local300++;
								local262++;
							} else {
								local262--;
								local300--;
							}
							if (local113 == local20[local45][local47]) {
								local279++;
								local262++;
							} else {
								local262--;
								local279--;
							}
							if (local20[local27][local65] == local113) {
								local315++;
								local279++;
							} else {
								local315--;
								local279--;
							}
							if (local20[local27 - 1][local47] == local113) {
								local300++;
								local315++;
							} else {
								local300--;
								local315--;
							}
							local384 = local300 - local279;
							if (local384 < 0) {
								local384 = -local384;
							}
							local397 = local262 - local315;
							if (local397 < 0) {
								local397 = -local397;
							}
							if (local397 == local384) {
								local384 = arg3.I(local27, local47) - arg3.I(local45, local65);
								if (local384 < 0) {
									local384 = -local384;
								}
								local397 = arg3.I(local45, local47) - arg3.I(local27, local65);
								if (local397 < 0) {
									local397 = -local397;
								}
							}
							local97 = local397 > local384 ? 1 : 0;
						}
						for (local300 = 0; local300 < 13; local300++) {
							Static282.anIntArray242[local300] = -1;
							Static345.anIntArray339[local300] = 1;
						}
						@Pc(485) boolean[] local485 = local161 != null && local161.aBoolean599 ? Static138.aBooleanArrayArray5[local91] : Static104.aBooleanArrayArray8[local91];
						this.method4879(local10, this.anInt6341, local25, local85, local47, arg4, local27, local91, local176, local97, local15, this.anInt6333, local161);
						@Pc(514) boolean local514 = local161 != null && local161.anInt7302 != local161.anInt7291;
						if (!local514) {
							for (local315 = 0; local315 < 8; local315++) {
								if (Static282.anIntArray242[local315] >= 0 && Static168.anIntArray140[local315] != Static251.anIntArray215[local315]) {
									local514 = true;
									break;
								}
							}
						}
						if (!local485[local97 + 1 & 0x3]) {
							local85[1] = Static41.method654(local85[1], (Static345.anIntArray339[4] & Static345.anIntArray339[2]) == 0);
						}
						if (!local485[local97 + 3 & 0x3]) {
							local85[3] = Static41.method654(local85[3], (Static345.anIntArray339[0] & Static345.anIntArray339[6]) == 0);
						}
						if (!local485[local97 & 0x3]) {
							local85[0] = Static41.method654(local85[0], (Static345.anIntArray339[0] & Static345.anIntArray339[2]) == 0);
						}
						if (!local485[local97 + 2 & 0x3]) {
							local85[2] = Static41.method654(local85[2], (Static345.anIntArray339[4] & Static345.anIntArray339[6]) == 0);
						}
						if (!local82 && (local91 == 0 || local91 == 12)) {
							if (local85[0] && !local85[1] && !local85[2] && local85[3]) {
								local85[0] = local85[3] = false;
								local97 = 0;
								local91 = local91 == 0 ? 13 : 14;
							} else if (local85[0] && local85[1] && !local85[2] && !local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local85[0] = local85[1] = false;
								local97 = 3;
							} else if (!local85[0] && local85[1] && local85[2] && !local85[3]) {
								local85[1] = local85[2] = false;
								local91 = local91 == 0 ? 13 : 14;
								local97 = 2;
							} else if (!local85[0] && !local85[1] && local85[2] && local85[3]) {
								local85[2] = local85[3] = false;
								local97 = 1;
								local91 = local91 == 0 ? 13 : 14;
							}
						}
						@Pc(817) boolean local817 = !local82 && !local85[0] && !local85[2] && !local85[1] && !local85[3];
						@Pc(819) int[] local819 = null;
						@Pc(831) int[] local831;
						@Pc(855) int[] local855;
						@Pc(835) int[] local835;
						if (local817) {
							local835 = Static79.anIntArrayArray37[local91];
							local855 = Static328.anIntArrayArray135[local91];
							local397 = local161 == null ? 0 : Static254.anIntArray218[local91];
							local831 = Static185.anIntArrayArray170[local91];
							local384 = local176 == null ? 0 : Static377.anIntArray384[local91];
						} else if (local82) {
							local855 = Static281.anIntArrayArray111[local91];
							local835 = Static120.anIntArrayArray117[local91];
							local831 = Static33.anIntArrayArray17[local91];
							local384 = local176 == null ? 0 : Static240.anIntArray205[local91];
							local397 = local161 == null ? 0 : Static161.anIntArray89[local91];
							local819 = Static214.anIntArrayArray191[local91];
						} else {
							local819 = Static107.anIntArrayArray48[local91];
							local831 = Static311.anIntArrayArray130[local91];
							local835 = Static174.anIntArrayArray74[local91];
							local397 = local161 == null ? 0 : Static362.anIntArray372[local91];
							local384 = local176 == null ? 0 : Static112.anIntArray94[local91];
							local855 = Static370.anIntArrayArray152[local91];
						}
						@Pc(921) int local921 = local384 + local397;
						if (local921 <= 0) {
							Static410.method5129(arg2, local27, local47);
						} else {
							if (local85[0]) {
								local921++;
							}
							if (local85[2]) {
								local921++;
							}
							if (local85[1]) {
								local921++;
							}
							if (local85[3]) {
								local921++;
							}
							@Pc(954) int local954 = 0;
							@Pc(956) int local956 = 0;
							@Pc(960) int local960 = local921 * 3;
							@Pc(967) int[] local967 = local514 ? new int[local960] : null;
							@Pc(970) int[] local970 = new int[local960];
							@Pc(973) int[] local973 = new int[local960];
							@Pc(976) int[] local976 = new int[local960];
							@Pc(979) int[] local979 = new int[local960];
							@Pc(982) int[] local982 = new int[local960];
							@Pc(989) int[] local989 = arg5 == null ? null : new int[local960];
							@Pc(998) int[] local998 = arg5 == null && arg0 == null ? null : new int[local960];
							@Pc(1000) int local1000 = -1;
							@Pc(1002) int local1002 = -1;
							@Pc(1004) int local1004 = 256;
							@Pc(1112) byte local1112;
							@Pc(1026) int local1026;
							@Pc(1028) int local1028;
							@Pc(1264) int local1264;
							@Pc(1270) int local1270;
							@Pc(1279) int local1279;
							@Pc(1284) int local1284;
							@Pc(1298) int local1298;
							@Pc(1289) int local1289;
							@Pc(1296) int local1296;
							@Pc(1353) int local1353;
							@Pc(1359) int local1359;
							if (local161 != null) {
								local1000 = local161.anInt7302;
								local1002 = arg4.method3569() ? local161.anInt7299 : local161.anInt7301;
								local1004 = local161.anInt7295;
								local1026 = Static166.method2248(arg4, local161);
								for (local1028 = 0; local1028 < local397; local1028++) {
									if (local85[-local97 & 0x3] && local819[0] == local954) {
										Static297.anIntArray264[0] = local831[local954];
										Static297.anIntArray264[1] = 1;
										Static297.anIntArray264[2] = local835[local954];
										Static297.anIntArray264[3] = 1;
										Static297.anIntArray264[4] = local855[local954];
										Static297.anIntArray264[5] = local835[local954];
										local1112 = 6;
									} else if (local85[2 - local97 & 0x3] && local819[2] == local954) {
										Static297.anIntArray264[0] = local831[local954];
										Static297.anIntArray264[1] = 5;
										Static297.anIntArray264[2] = local835[local954];
										Static297.anIntArray264[3] = 5;
										Static297.anIntArray264[4] = local855[local954];
										local1112 = 6;
										Static297.anIntArray264[5] = local835[local954];
									} else if (local85[1 - local97 & 0x3] && local819[1] == local954) {
										Static297.anIntArray264[0] = local831[local954];
										Static297.anIntArray264[1] = 3;
										Static297.anIntArray264[2] = local835[local954];
										Static297.anIntArray264[3] = 3;
										Static297.anIntArray264[4] = local855[local954];
										local1112 = 6;
										Static297.anIntArray264[5] = local835[local954];
									} else if (local85[3 - local97 & 0x3] && local954 == local819[3]) {
										Static297.anIntArray264[0] = local831[local954];
										Static297.anIntArray264[1] = 7;
										Static297.anIntArray264[2] = local835[local954];
										Static297.anIntArray264[3] = 7;
										Static297.anIntArray264[4] = local855[local954];
										local1112 = 6;
										Static297.anIntArray264[5] = local835[local954];
									} else {
										Static297.anIntArray264[0] = local831[local954];
										Static297.anIntArray264[1] = local855[local954];
										Static297.anIntArray264[2] = local835[local954];
										local1112 = 3;
									}
									for (local1264 = 0; local1264 < local1112; local1264++) {
										local1270 = Static297.anIntArray264[local1264];
										local1279 = local1270 - local97 * 2 & 0x7;
										local1284 = this.anIntArray390[local1270];
										local1289 = this.anIntArray391[local1270];
										if (local97 == 1) {
											local1296 = 128 - local1284;
											local1298 = local1289;
										} else if (local97 == 2) {
											local1296 = 128 - local1289;
											local1298 = 128 - local1284;
										} else if (local97 == 3) {
											local1298 = 128 - local1289;
											local1296 = local1284;
										} else {
											local1298 = local1284;
											local1296 = local1289;
										}
										local970[local956] = local1298;
										local973[local956] = local1296;
										if (local989 != null && Static446.aBooleanArrayArray9[local91][local1270]) {
											local1353 = local1298 + (local27 << 7);
											local1359 = local1296 + (local47 << 7);
											local989[local956] = arg5.va(local1353, local1359) - arg3.va(local1353, local1359);
										}
										if (local998 != null) {
											if (arg5 != null && !Static446.aBooleanArrayArray9[local91][local1270]) {
												local1353 = local1298 + (local27 << 7);
												local1359 = local1296 + (local47 << 7);
												local998[local956] = arg3.va(local1353, local1359) - arg5.va(local1353, local1359);
											} else if (arg0 != null && !Static225.aBooleanArrayArray6[local91][local1270]) {
												local1353 = local1298 + (local27 << 7);
												local1359 = (local47 << 7) + local1296;
												local998[local956] = arg0.va(local1353, local1359) - arg3.va(local1353, local1359);
											}
										}
										if (local1270 < 8 && local161.anInt7304 < Static282.anIntArray242[local1279]) {
											if (local967 != null) {
												local967[local956] = Static251.anIntArray215[local1279];
											}
											local982[local956] = Static225.anIntArray196[local1279];
											local979[local956] = Static9.anIntArray5[local1279];
											local976[local956] = Static168.anIntArray140[local1279];
										} else {
											if (local967 != null) {
												local967[local956] = local1026;
											}
											local979[local956] = arg4.method3569() ? local161.anInt7299 : local161.anInt7301;
											local982[local956] = local161.anInt7295;
											local976[local956] = local1000;
										}
										local956++;
									}
									local954++;
								}
								if (!this.aBoolean521 && arg2 == 0) {
									Static53.method826(local27, local47, local161.anInt7293, local161.anInt7300 * 8, local161.anInt7296);
								}
								if (local91 != 12 && local161.anInt7302 != -1 && local161.aBoolean597) {
									local80 = true;
								}
							} else if (local817) {
								local954 = Static254.anIntArray218[local91];
							} else if (local82) {
								local954 = Static161.anIntArray89[local91];
							} else {
								local954 = Static362.anIntArray372[local91];
							}
							if (local176 != null) {
								if (local121 == 0) {
									local121 = local113;
								}
								if (local129 == 0) {
									local129 = local113;
								}
								if (local137 == 0) {
									local137 = local113;
								}
								@Pc(1605) Class73 local1605 = this.aClass18_4.method392(local113 - 1);
								@Pc(1613) Class73 local1613 = this.aClass18_4.method392(local121 - 1);
								@Pc(1623) Class73 local1623 = this.aClass18_4.method392(local129 - 1);
								@Pc(1631) Class73 local1631 = this.aClass18_4.method392(local137 - 1);
								for (local1279 = 0; local1279 < local384; local1279++) {
									if (local85[-local97 & 0x3] && local819[0] == local954) {
										Static297.anIntArray264[0] = local831[local954];
										Static297.anIntArray264[1] = 1;
										Static297.anIntArray264[2] = local835[local954];
										Static297.anIntArray264[3] = 1;
										Static297.anIntArray264[4] = local855[local954];
										local1112 = 6;
										Static297.anIntArray264[5] = local835[local954];
									} else if (local85[2 - local97 & 0x3] && local819[2] == local954) {
										Static297.anIntArray264[0] = local831[local954];
										Static297.anIntArray264[1] = 5;
										Static297.anIntArray264[2] = local835[local954];
										Static297.anIntArray264[3] = 5;
										Static297.anIntArray264[4] = local855[local954];
										local1112 = 6;
										Static297.anIntArray264[5] = local835[local954];
									} else if (local85[1 - local97 & 0x3] && local819[1] == local954) {
										Static297.anIntArray264[0] = local831[local954];
										Static297.anIntArray264[1] = 3;
										Static297.anIntArray264[2] = local835[local954];
										Static297.anIntArray264[3] = 3;
										Static297.anIntArray264[4] = local855[local954];
										Static297.anIntArray264[5] = local835[local954];
										local1112 = 6;
									} else if (local85[3 - local97 & 0x3] && local954 == local819[3]) {
										Static297.anIntArray264[0] = local831[local954];
										Static297.anIntArray264[1] = 7;
										Static297.anIntArray264[2] = local835[local954];
										Static297.anIntArray264[3] = 7;
										Static297.anIntArray264[4] = local855[local954];
										local1112 = 6;
										Static297.anIntArray264[5] = local835[local954];
									} else {
										Static297.anIntArray264[0] = local831[local954];
										Static297.anIntArray264[1] = local855[local954];
										Static297.anIntArray264[2] = local835[local954];
										local1112 = 3;
									}
									for (local1284 = 0; local1284 < local1112; local1284++) {
										local1298 = Static297.anIntArray264[local1284];
										local1289 = local1298 - local97 * 2 & 0x7;
										local1296 = this.anIntArray390[local1298];
										local1359 = this.anIntArray391[local1298];
										@Pc(1904) int local1904;
										if (local97 == 1) {
											local1353 = local1359;
											local1904 = 128 - local1296;
										} else if (local97 == 2) {
											local1904 = 128 - local1359;
											local1353 = 128 - local1296;
										} else if (local97 == 3) {
											local1904 = local1296;
											local1353 = 128 - local1359;
										} else {
											local1353 = local1296;
											local1904 = local1359;
										}
										local970[local956] = local1353;
										local973[local956] = local1904;
										@Pc(1958) int local1958;
										@Pc(1964) int local1964;
										if (local989 != null && Static446.aBooleanArrayArray9[local91][local1298]) {
											local1958 = local1353 + (local27 << 7);
											local1964 = local1904 + (local47 << 7);
											local989[local956] = arg5.va(local1958, local1964) - arg3.va(local1958, local1964);
										}
										if (local998 != null) {
											if (arg5 != null && !Static446.aBooleanArrayArray9[local91][local1298]) {
												local1958 = (local27 << 7) + local1353;
												local1964 = (local47 << 7) + local1904;
												local998[local956] = arg3.va(local1958, local1964) - arg5.va(local1958, local1964);
											} else if (arg0 != null && !Static225.aBooleanArrayArray6[local91][local1298]) {
												local1958 = (local27 << 7) + local1353;
												local1964 = local1904 + (local47 << 7);
												local998[local956] = arg0.va(local1958, local1964) - arg3.va(local1958, local1964);
											}
										}
										if (local1298 < 8 && Static282.anIntArray242[local1289] >= 0) {
											if (local967 != null) {
												local967[local956] = Static251.anIntArray215[local1289];
											}
											local982[local956] = Static225.anIntArray196[local1289];
											local979[local956] = Static9.anIntArray5[local1289];
											local976[local956] = Static168.anIntArray140[local1289];
										} else {
											if (local82 && Static446.aBooleanArrayArray9[local91][local1298]) {
												local979[local956] = local1002;
												local982[local956] = local1004;
												local976[local956] = local1000;
											} else if (local1353 == 0 && local1904 == 0) {
												local976[local956] = arg1[local27][local47];
												local979[local956] = local1605.anInt1828;
												local982[local956] = local1605.anInt1840;
											} else if (local1353 == 0 && local1904 == 128) {
												local976[local956] = arg1[local27][local65];
												local979[local956] = local1613.anInt1828;
												local982[local956] = local1613.anInt1840;
											} else if (local1353 == 128 && local1904 == 128) {
												local976[local956] = arg1[local45][local65];
												local979[local956] = local1623.anInt1828;
												local982[local956] = local1623.anInt1840;
											} else if (local1353 == 128 && local1904 == 0) {
												local976[local956] = arg1[local45][local47];
												local979[local956] = local1631.anInt1828;
												local982[local956] = local1631.anInt1840;
											} else {
												if (local1353 >= 64) {
													if (local1904 < 64) {
														local979[local956] = local1631.anInt1828;
														local982[local956] = local1631.anInt1840;
													} else {
														local979[local956] = local1623.anInt1828;
														local982[local956] = local1623.anInt1840;
													}
												} else if (local1904 >= 64) {
													local979[local956] = local1613.anInt1828;
													local982[local956] = local1613.anInt1840;
												} else {
													local979[local956] = local1605.anInt1828;
													local982[local956] = local1605.anInt1840;
												}
												local1958 = Static206.method2796(arg1[local27][local47], local1353 << 7 >> 7, arg1[local45][local47]);
												local1964 = Static206.method2796(arg1[local27][local65], local1353 << 7 >> 7, arg1[local45][local65]);
												local976[local956] = Static206.method2796(local1958, local1904 << 7 >> 7, local1964);
											}
											if (local967 != null) {
												local967[local956] = local976[local956];
											}
										}
										local956++;
									}
									local954++;
								}
								if (local91 != 0 && local176.aBoolean136) {
									local80 = true;
								}
							}
							local1026 = arg3.I(local27, local47);
							local1028 = arg3.I(local45, local47);
							local1264 = arg3.I(local45, local65);
							local1270 = arg3.I(local27, local65);
							if (arg2 > 0) {
								@Pc(2367) boolean local2367 = true;
								if (local113 == 0 && local91 != 0) {
									local2367 = false;
								}
								if (local105 > 0 && local187 != null && !local187.aBoolean598) {
									local2367 = false;
								}
								if (local2367 && local1026 == local1028 && local1264 == local1026 && local1026 == local1270) {
									this.aByteArrayArrayArray15[arg2][local27][local47] = (byte) (this.aByteArrayArrayArray15[arg2][local27][local47] | 0x4);
								}
							}
							local1279 = 0;
							local1284 = 0;
							local1298 = 0;
							if (this.aBoolean521) {
								local1279 = Static186.method3971(local27, local47);
								local1284 = Static187.method2468(local27, local47);
								local1298 = Static335.method4285(local27, local47);
							}
							arg3.JA(local27, local47, local970, local989, local973, local998, local976, local967, local979, local982, local1279, local1284, local1298, local80);
							Static410.method5129(arg2, local27, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!qa;Lclient!na;Lclient!na;)V")
	public final void method4878(@OriginalArg(1) Class128 arg0, @OriginalArg(2) Class163 arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(21) int[][] local21 = new int[this.anInt6333][this.anInt6341];
		if (Static443.anIntArray379 == null || Static443.anIntArray379.length != this.anInt6341) {
			Static443.anIntArray379 = new int[this.anInt6341];
			Static124.anIntArray101 = new int[this.anInt6341];
			Static354.anIntArray346 = new int[this.anInt6341];
			Static28.anIntArray30 = new int[this.anInt6341];
			Static75.anIntArray65 = new int[this.anInt6341];
		}
		@Pc(58) int local58;
		for (@Pc(54) int local54 = 0; local54 < this.anInt6342; local54++) {
			for (local58 = 0; local58 < this.anInt6341; local58++) {
				Static443.anIntArray379[local58] = 0;
				Static28.anIntArray30[local58] = 0;
				Static354.anIntArray346[local58] = 0;
				Static75.anIntArray65[local58] = 0;
				Static124.anIntArray101[local58] = 0;
			}
			for (@Pc(87) int local87 = -5; local87 < this.anInt6333; local87++) {
				@Pc(97) int local97;
				@Pc(112) int local112;
				@Pc(183) int local183;
				for (@Pc(91) int local91 = 0; local91 < this.anInt6341; local91++) {
					local97 = local87 + 5;
					@Pc(160) int local160;
					if (local97 < this.anInt6333) {
						local112 = this.aByteArrayArrayArray16[local54][local97][local91] & 0xFF;
						if (local112 > 0) {
							@Pc(124) Class73 local124 = this.aClass18_4.method392(local112 - 1);
							Static443.anIntArray379[local91] += local124.anInt1838;
							Static28.anIntArray30[local91] += local124.anInt1839;
							Static354.anIntArray346[local91] += local124.anInt1832;
							Static75.anIntArray65[local91] += local124.anInt1833;
							local160 = Static124.anIntArray101[local91]++;
						}
					}
					local112 = local87 - 5;
					if (local112 >= 0) {
						local183 = this.aByteArrayArrayArray16[local54][local112][local91] & 0xFF;
						if (local183 > 0) {
							@Pc(198) Class73 local198 = this.aClass18_4.method392(local183 - 1);
							Static443.anIntArray379[local91] -= local198.anInt1838;
							Static28.anIntArray30[local91] -= local198.anInt1839;
							Static354.anIntArray346[local91] -= local198.anInt1832;
							Static75.anIntArray65[local91] -= local198.anInt1833;
							local160 = Static124.anIntArray101[local91]--;
						}
					}
				}
				if (local87 >= 0) {
					local97 = 0;
					local112 = 0;
					local183 = 0;
					@Pc(259) int local259 = 0;
					@Pc(261) int local261 = 0;
					for (@Pc(263) int local263 = -5; local263 < this.anInt6341; local263++) {
						@Pc(269) int local269 = local263 + 5;
						if (local269 < this.anInt6341) {
							local112 += Static28.anIntArray30[local269];
							local259 += Static75.anIntArray65[local269];
							local261 += Static124.anIntArray101[local269];
							local97 += Static443.anIntArray379[local269];
							local183 += Static354.anIntArray346[local269];
						}
						@Pc(311) int local311 = local263 - 5;
						if (local311 >= 0) {
							local97 -= Static443.anIntArray379[local311];
							local259 -= Static75.anIntArray65[local311];
							local261 -= Static124.anIntArray101[local311];
							local183 -= Static354.anIntArray346[local311];
							local112 -= Static28.anIntArray30[local311];
						}
						if (local263 >= 0 && local259 > 0 && local261 > 0) {
							local21[local87][local263] = Static323.method4126(local112 / local261, local183 / local261, local97 * 256 / local259);
						}
					}
				}
			}
			if (Static155.aBoolean207) {
				this.method4876(local54 == 0 ? arg2 : null, local21, local54, Static202.aClass163Array2[local54], arg0, local54 == 0 ? arg1 : null);
			} else {
				this.method4871(Static202.aClass163Array2[local54], local21, local54 == 0 ? arg1 : null, local54 == 0 ? arg2 : null, local54, arg0);
			}
			this.aByteArrayArrayArray16[local54] = null;
			this.aByteArrayArrayArray14[local54] = null;
			this.aByteArrayArrayArray13[local54] = null;
			this.aByteArrayArrayArray17[local54] = null;
		}
		if (!this.aBoolean521) {
			if (Static265.anInt4222 != 0) {
				Static11.method181();
			}
			if (Static202.aBoolean253) {
				Static207.method2799();
			}
		}
		for (local58 = 0; local58 < this.anInt6342; local58++) {
			Static202.aClass163Array2[local58].f();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([[BBI[[B[ZILclient!qa;IILclient!ev;I[[BILclient!wc;)V")
	private void method4879(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) boolean[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class128 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class73 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class258 arg12) {
		@Pc(53) int local53;
		if (arg12 != null && arg8 != null || arg8 != null && arg7 == 12 || arg12 != null && arg7 == 0) {
			@Pc(31) boolean[] local31 = arg12 != null && arg12.aBoolean599 ? Static138.aBooleanArrayArray5[arg7] : Static104.aBooleanArrayArray8[arg7];
			@Pc(63) Class258 local63;
			@Pc(81) byte local81;
			@Pc(97) int local97;
			@Pc(102) int local102;
			if (arg4 > 0) {
				if (arg6 > 0) {
					local53 = arg2[arg6 - 1][arg4 - 1] & 0xFF;
					if (local53 > 0) {
						local63 = this.aClass28_6.method615(local53 - 1);
						if (local63.anInt7302 != -1 && local63.aBoolean599) {
							local81 = arg0[arg6 - 1][arg4 - 1];
							local97 = arg10[arg6 - 1][arg4 - 1] * 2 + 4 & 0x7;
							local102 = Static166.method2248(arg5, local63);
							if (Static446.aBooleanArrayArray9[local81][local97]) {
								Static168.anIntArray140[0] = local63.anInt7302;
								Static251.anIntArray215[0] = local102;
								Static9.anIntArray5[0] = arg5.method3569() ? local63.anInt7299 : local63.anInt7301;
								Static225.anIntArray196[0] = local63.anInt7295;
								Static282.anIntArray242[0] = local63.anInt7304;
								Static345.anIntArray339[0] = 256;
							}
						}
					}
				}
				if (arg6 < arg11 - 1) {
					local53 = arg2[arg6 + 1][arg4 - 1] & 0xFF;
					if (local53 > 0) {
						local63 = this.aClass28_6.method615(local53 - 1);
						if (local63.anInt7302 != -1 && local63.aBoolean599) {
							local81 = arg0[arg6 + 1][arg4 - 1];
							local97 = arg10[arg6 + 1][arg4 - 1] * 2 + 6 & 0x7;
							local102 = Static166.method2248(arg5, local63);
							if (Static446.aBooleanArrayArray9[local81][local97]) {
								Static168.anIntArray140[2] = local63.anInt7302;
								Static251.anIntArray215[2] = local102;
								Static9.anIntArray5[2] = arg5.method3569() ? local63.anInt7299 : local63.anInt7301;
								Static225.anIntArray196[2] = local63.anInt7295;
								Static282.anIntArray242[2] = local63.anInt7304;
								Static345.anIntArray339[2] = 512;
							}
						}
					}
				}
			}
			if (arg1 - 1 > arg4) {
				if (arg6 > 0) {
					local53 = arg2[arg6 - 1][arg4 + 1] & 0xFF;
					if (local53 > 0) {
						local63 = this.aClass28_6.method615(local53 - 1);
						if (local63.anInt7302 != -1 && local63.aBoolean599) {
							local81 = arg0[arg6 - 1][arg4 + 1];
							local97 = arg10[arg6 - 1][arg4 + 1] * 2 + 2 & 0x7;
							local102 = Static166.method2248(arg5, local63);
							if (Static446.aBooleanArrayArray9[local81][local97]) {
								Static168.anIntArray140[6] = local63.anInt7302;
								Static251.anIntArray215[6] = local102;
								Static9.anIntArray5[6] = arg5.method3569() ? local63.anInt7299 : local63.anInt7301;
								Static225.anIntArray196[6] = local63.anInt7295;
								Static282.anIntArray242[6] = local63.anInt7304;
								Static345.anIntArray339[6] = 64;
							}
						}
					}
				}
				if (arg6 < arg11 - 1) {
					local53 = arg2[arg6 + 1][arg4 + 1] & 0xFF;
					if (local53 > 0) {
						local63 = this.aClass28_6.method615(local53 - 1);
						if (local63.anInt7302 != -1 && local63.aBoolean599) {
							local81 = arg0[arg6 + 1][arg4 + 1];
							local97 = arg10[arg6 + 1][arg4 + 1] * 2 & 0x7;
							local102 = Static166.method2248(arg5, local63);
							if (Static446.aBooleanArrayArray9[local81][local97]) {
								Static168.anIntArray140[4] = local63.anInt7302;
								Static251.anIntArray215[4] = local102;
								Static9.anIntArray5[4] = arg5.method3569() ? local63.anInt7299 : local63.anInt7301;
								Static225.anIntArray196[4] = local63.anInt7295;
								Static282.anIntArray242[4] = local63.anInt7304;
								Static345.anIntArray339[4] = 128;
							}
						}
					}
				}
			}
			@Pc(527) int local527;
			@Pc(532) int local532;
			@Pc(534) int local534;
			@Pc(516) byte local516;
			if (arg4 > 0) {
				local53 = arg2[arg6][arg4 - 1] & 0xFF;
				if (local53 > 0) {
					local63 = this.aClass28_6.method615(local53 - 1);
					if (local63.anInt7302 != -1) {
						local81 = arg0[arg6][arg4 - 1];
						local516 = arg10[arg6][arg4 - 1];
						if (local63.aBoolean599) {
							local102 = 2;
							local527 = local516 * 2 + 4;
							local532 = Static166.method2248(arg5, local63);
							for (local534 = 0; local534 < 3; local534++) {
								local527 &= 0x7;
								local102 &= 0x7;
								if (Static446.aBooleanArrayArray9[local81][local527] && local63.anInt7304 >= Static282.anIntArray242[local102]) {
									Static168.anIntArray140[local102] = local63.anInt7302;
									Static251.anIntArray215[local102] = local532;
									Static9.anIntArray5[local102] = arg5.method3569() ? local63.anInt7299 : local63.anInt7301;
									Static225.anIntArray196[local102] = local63.anInt7295;
									if (local63.anInt7304 == Static282.anIntArray242[local102]) {
										Static345.anIntArray339[local102] |= 0x20;
									} else {
										Static345.anIntArray339[local102] = 32;
									}
									Static282.anIntArray242[local102] = local63.anInt7304;
								}
								local527++;
								local102--;
							}
							if (!local31[arg9 & 0x3]) {
								arg3[0] = Static138.aBooleanArrayArray5[local81][local516 + 2 & 0x3];
							}
						} else if (!local31[arg9 & 0x3]) {
							arg3[0] = Static104.aBooleanArrayArray8[local81][local516 + 2 & 0x3];
						}
					}
				}
			}
			if (arg4 < arg1 - 1) {
				local53 = arg2[arg6][arg4 + 1] & 0xFF;
				if (local53 > 0) {
					local63 = this.aClass28_6.method615(local53 - 1);
					if (local63.anInt7302 != -1) {
						local81 = arg0[arg6][arg4 + 1];
						local516 = arg10[arg6][arg4 + 1];
						if (local63.aBoolean599) {
							local102 = 4;
							local527 = local516 * 2 + 2;
							local532 = Static166.method2248(arg5, local63);
							for (local534 = 0; local534 < 3; local534++) {
								local527 &= 0x7;
								local102 &= 0x7;
								if (Static446.aBooleanArrayArray9[local81][local527] && local63.anInt7304 >= Static282.anIntArray242[local102]) {
									Static168.anIntArray140[local102] = local63.anInt7302;
									Static251.anIntArray215[local102] = local532;
									Static9.anIntArray5[local102] = arg5.method3569() ? local63.anInt7299 : local63.anInt7301;
									Static225.anIntArray196[local102] = local63.anInt7295;
									if (Static282.anIntArray242[local102] == local63.anInt7304) {
										Static345.anIntArray339[local102] |= 0x10;
									} else {
										Static345.anIntArray339[local102] = 16;
									}
									Static282.anIntArray242[local102] = local63.anInt7304;
								}
								local102++;
								local527--;
							}
							if (!local31[arg9 + 2 & 0x3]) {
								arg3[2] = Static138.aBooleanArrayArray5[local81][--local516 & 0x3];
							}
						} else if (!local31[arg9 + 2 & 0x3]) {
							arg3[2] = Static104.aBooleanArrayArray8[local81][local516 & 0x3];
						}
					}
				}
			}
			if (arg6 > 0) {
				local53 = arg2[arg6 - 1][arg4] & 0xFF;
				if (local53 > 0) {
					local63 = this.aClass28_6.method615(local53 - 1);
					if (local63.anInt7302 != -1) {
						local81 = arg0[arg6 - 1][arg4];
						local516 = arg10[arg6 - 1][arg4];
						if (local63.aBoolean599) {
							local102 = 6;
							local527 = local516 * 2 + 4;
							local532 = Static166.method2248(arg5, local63);
							for (local534 = 0; local534 < 3; local534++) {
								local102 &= 0x7;
								local527 &= 0x7;
								if (Static446.aBooleanArrayArray9[local81][local527] && local63.anInt7304 >= Static282.anIntArray242[local102]) {
									Static168.anIntArray140[local102] = local63.anInt7302;
									Static251.anIntArray215[local102] = local532;
									Static9.anIntArray5[local102] = arg5.method3569() ? local63.anInt7299 : local63.anInt7301;
									Static225.anIntArray196[local102] = local63.anInt7295;
									if (local63.anInt7304 == Static282.anIntArray242[local102]) {
										Static345.anIntArray339[local102] |= 0x8;
									} else {
										Static345.anIntArray339[local102] = 8;
									}
									Static282.anIntArray242[local102] = local63.anInt7304;
								}
								local527--;
								local102++;
							}
							if (!local31[arg9 + 3 & 0x3]) {
								arg3[3] = Static138.aBooleanArrayArray5[local81][local516 + 1 & 0x3];
							}
						} else if (!local31[arg9 + 3 & 0x3]) {
							arg3[3] = Static104.aBooleanArrayArray8[local81][local516 + 1 & 0x3];
						}
					}
				}
			}
			if (arg11 - 1 > arg6) {
				local53 = arg2[arg6 + 1][arg4] & 0xFF;
				if (local53 > 0) {
					local63 = this.aClass28_6.method615(local53 - 1);
					if (local63.anInt7302 != -1) {
						local81 = arg0[arg6 + 1][arg4];
						local516 = arg10[arg6 + 1][arg4];
						if (local63.aBoolean599) {
							local102 = 4;
							local527 = local516 * 2 + 6;
							local532 = Static166.method2248(arg5, local63);
							for (local534 = 0; local534 < 3; local534++) {
								local102 &= 0x7;
								local527 &= 0x7;
								if (Static446.aBooleanArrayArray9[local81][local527] && Static282.anIntArray242[local102] <= local63.anInt7304) {
									Static168.anIntArray140[local102] = local63.anInt7302;
									Static251.anIntArray215[local102] = local532;
									Static9.anIntArray5[local102] = arg5.method3569() ? local63.anInt7299 : local63.anInt7301;
									Static225.anIntArray196[local102] = local63.anInt7295;
									if (local63.anInt7304 == Static282.anIntArray242[local102]) {
										Static345.anIntArray339[local102] |= 0x4;
									} else {
										Static345.anIntArray339[local102] = 4;
									}
									Static282.anIntArray242[local102] = local63.anInt7304;
								}
								local527++;
								local102--;
							}
							if (!local31[arg9 + 1 & 0x3]) {
								arg3[1] = Static138.aBooleanArrayArray5[local81][local516 + 3 & 0x3];
							}
						} else if (!local31[arg9 + 1 & 0x3]) {
							arg3[1] = Static104.aBooleanArrayArray8[local81][local516 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg12 == null) {
			return;
		}
		@Pc(1230) int local1230 = Static166.method2248(arg5, arg12);
		if (!arg12.aBoolean599) {
			return;
		}
		for (local53 = 0; local53 < 8; local53++) {
			@Pc(1246) int local1246 = local53 - arg9 * 2 & 0x7;
			if (Static446.aBooleanArrayArray9[arg7][local53] && Static282.anIntArray242[local1246] <= arg12.anInt7304) {
				Static168.anIntArray140[local1246] = arg12.anInt7302;
				Static251.anIntArray215[local1246] = local1230;
				Static9.anIntArray5[local1246] = arg5.method3569() ? arg12.anInt7299 : arg12.anInt7301;
				Static225.anIntArray196[local1246] = arg12.anInt7295;
				if (Static282.anIntArray242[local1246] == arg12.anInt7304) {
					Static345.anIntArray339[local1246] |= 0x2;
				} else {
					Static345.anIntArray339[local1246] = 2;
				}
				Static282.anIntArray242[local1246] = arg12.anInt7304;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI[[I)V")
	public final void method4880(@OriginalArg(2) int[][] arg0) {
		@Pc(19) int[][] local19 = this.anIntArrayArrayArray14[0];
		for (@Pc(21) int local21 = 0; local21 < this.anInt6333 + 1; local21++) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt6341 + 1; local25++) {
				local19[local21][local25] += arg0[local21][local25];
			}
		}
	}
}
