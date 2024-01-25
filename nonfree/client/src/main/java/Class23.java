import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public class Class23 {

	@OriginalMember(owner = "client!bg", name = "F", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "[I")
	private final int[] anIntArray413 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "[I")
	private final int[] anIntArray414 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!ks;")
	private final Class148 aClass148_6;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
	protected final int anInt5073;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Lclient!cs;")
	private final Class47 aClass47_5;

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
	public final int anInt5076;

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
	protected final int anInt5078;

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "Z")
	public final boolean aBoolean378;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIZLclient!ks;Lclient!cs;)V")
	protected Class23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class148 arg4, @OriginalArg(5) Class47 arg5) {
		this.aClass148_6 = arg4;
		this.anInt5073 = arg2;
		this.aClass47_5 = arg5;
		this.anInt5076 = arg0;
		this.anInt5078 = arg1;
		this.aBoolean378 = arg3;
		this.aByteArrayArrayArray13 = new byte[this.anInt5076][this.anInt5078][this.anInt5073];
		this.aByteArrayArrayArray15 = new byte[this.anInt5076][this.anInt5078][this.anInt5073];
		this.aByteArrayArrayArray14 = new byte[this.anInt5076][this.anInt5078][this.anInt5073];
		this.aByteArrayArrayArray12 = new byte[this.anInt5076][this.anInt5078 + 1][this.anInt5073 + 1];
		this.aByteArrayArrayArray11 = new byte[this.anInt5076][this.anInt5078][this.anInt5073];
		this.anIntArrayArrayArray9 = new int[this.anInt5076][this.anInt5078 + 1][this.anInt5073 + 1];
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!ta;[[ILclient!ya;Lclient!ta;ILclient!ta;)V")
	private void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) Class49 arg3, @OriginalArg(4) Class64 arg4, @OriginalArg(6) Class64 arg5) {
		for (@Pc(16) int local16 = 0; local16 < this.anInt5078; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt5073; local20++) {
				if (Static175.anInt3463 == -1 || Static161.method5537(Static175.anInt3463, arg0, local20, local16)) {
					@Pc(43) byte local43 = this.aByteArrayArrayArray11[arg0][local16][local20];
					@Pc(52) byte local52 = this.aByteArrayArrayArray15[arg0][local16][local20];
					@Pc(63) int local63 = this.aByteArrayArrayArray14[arg0][local16][local20] & 0xFF;
					@Pc(74) int local74 = this.aByteArrayArrayArray13[arg0][local16][local20] & 0xFF;
					@Pc(89) Class24 local89 = local63 == 0 ? null : this.aClass148_6.method3342(local63 - 1);
					@Pc(101) Class269 local101 = local74 == 0 ? null : this.aClass47_5.method901(local74 - 1);
					@Pc(103) int local103 = 0;
					@Pc(105) int local105 = 0;
					if (local43 != 0) {
						local103 = local101 == null ? 0 : Static312.anIntArray448[local43];
						local105 = local89 == null ? 0 : Static85.anIntArray154[local43];
					} else if (local89 != null) {
						local105 = Static85.anIntArray154[local43];
					} else if (local101 != null) {
						local103 = Static85.anIntArray154[local43];
					}
					@Pc(143) int local143 = local103 + local105;
					@Pc(145) int local145 = 0;
					if (local143 != 0) {
						@Pc(150) int[] local150 = new int[local143];
						@Pc(153) int[] local153 = new int[local143];
						@Pc(156) int[] local156 = new int[local143];
						@Pc(159) int[] local159 = new int[local143];
						@Pc(161) boolean local161 = false;
						@Pc(178) int local178;
						@Pc(206) int local206;
						if (local89 == null || local89.anInt594 == -1 && local89.anInt596 == -1 && local89.anInt600 == -1) {
							for (local178 = 0; local178 < local105; local178++) {
								local150[local145] = -1;
								local145++;
							}
						} else {
							local178 = arg3.method4465() ? local89.anInt600 : local89.anInt601;
							if (Static329.aBoolean401) {
								local178 = -1;
							}
							for (local206 = 0; local206 < local105; local206++) {
								local156[local145] = local178;
								local159[local145] = local89.anInt595;
								if (local89.anInt594 == -1) {
									local150[local145] = -1;
								} else {
									local150[local145] = local89.anInt594;
								}
								if (local89.anInt596 == -1) {
									local153[local145] = -1;
								} else {
									local153[local145] = local89.anInt596;
									local161 = true;
								}
								local145++;
							}
							if (!this.aBoolean378 && arg0 == 0) {
								Static375.method4699(local16, local20, local89.anInt603, local89.anInt588 * 8, local89.anInt592);
							}
						}
						if (!local161) {
							local153 = null;
						}
						if (local101 == null) {
							for (local178 = 0; local178 < local103; local178++) {
								local150[local145] = -1;
								local145++;
							}
						} else {
							local178 = local101.anInt7438;
							if (Static329.aBoolean401) {
								local178 = -1;
							}
							for (local206 = 0; local206 < local103; local206++) {
								local156[local145] = local178;
								local159[local145] = local101.anInt7444;
								local150[local145] = arg2[local16][local20];
								if (local153 != null) {
									local153[local145] = -1;
								}
								local145++;
							}
						}
						local178 = this.anIntArray413.length;
						@Pc(349) int[] local349 = new int[local178];
						@Pc(352) int[] local352 = new int[local178];
						@Pc(359) int[] local359 = arg5 == null ? null : new int[local178];
						@Pc(368) int[] local368 = arg5 == null && arg4 == null ? null : new int[local178];
						@Pc(377) int local377;
						@Pc(382) int local382;
						@Pc(461) int local461;
						@Pc(468) int local468;
						for (@Pc(370) int local370 = 0; local370 < local178; local370++) {
							local377 = this.anIntArray413[local370];
							local382 = this.anIntArray414[local370];
							if (local52 == 0) {
								local349[local370] = local377;
								local352[local370] = local382;
							} else if (local52 == 1) {
								local349[local370] = local382;
								local352[local370] = 128 - local377;
							} else if (local52 == 2) {
								local349[local370] = 128 - local377;
								local352[local370] = 128 - local382;
							} else if (local52 == 3) {
								local349[local370] = 128 - local382;
								local352[local370] = local377;
							}
							if (local359 != null && Static293.aBooleanArrayArray25[local43][local370]) {
								local461 = (local16 << 7) + local377;
								local468 = (local20 << 7) + local377;
								local359[local370] = arg5.a(local461, local468) - arg1.a(local461, local468);
							}
							if (local368 != null) {
								if (arg5 != null && !Static293.aBooleanArrayArray25[local43][local370]) {
									local461 = local377 + (local16 << 7);
									local468 = (local20 << 7) + local377;
									local368[local370] = arg1.a(local461, local468) - arg5.a(local461, local468);
								} else if (arg4 != null && !Static361.aBooleanArrayArray31[local43][local370]) {
									local461 = (local16 << 7) + local377;
									local468 = local377 + (local20 << 7);
									local368[local370] = arg4.a(local461, local468) - arg1.a(local461, local468);
								}
							}
						}
						local377 = arg1.l(local16, local20);
						local382 = arg1.l(local16 + 1, local20);
						local461 = arg1.l(local16 + 1, local20 + 1);
						local468 = arg1.l(local16, local20 + 1);
						if (arg0 > 0) {
							@Pc(590) boolean local590 = true;
							if (local74 == 0 && local43 != 0) {
								local590 = false;
							}
							if (local63 > 0 && local89 != null && !local89.aBoolean29) {
								local590 = false;
							}
							if (local590 && local377 == local382 && local461 == local377 && local468 == local377) {
								this.aByteArrayArrayArray12[arg0][local16][local20] = (byte) (this.aByteArrayArrayArray12[arg0][local16][local20] | 0x4);
							}
						}
						@Pc(644) int local644 = 0;
						@Pc(646) int local646 = 0;
						@Pc(648) int local648 = 0;
						if (this.aBoolean378) {
							local644 = Static322.method4519(local16, local20);
							local646 = Static423.method5846(local16, local20);
							local648 = Static370.method5036(local16, local20);
						}
						arg1.method2351(local16, local20, local349, local359, local352, local368, Static336.anIntArrayArray57[local43], Static375.anIntArrayArray58[local43], Static220.anIntArrayArray40[local43], local150, local153, local156, local159, local644, local646, local648);
						Static328.method4560(arg0, local16, local20);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[Lclient!eq;IIIIILclient!si;II)V")
	public final void method4071(@OriginalArg(0) int arg0, @OriginalArg(1) Class70[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub23 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg8 & 0x7) * 8;
		@Pc(17) int local17 = (arg4 & 0x7) * 8;
		@Pc(26) int local26;
		if (!this.aBoolean378) {
			@Pc(24) Class70 local24 = arg1[arg7];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static362.method4940(local26 & 0x7, local30 & 0x7, arg3) + arg5;
					@Pc(56) int local56 = arg0 + Static375.method4700(arg3, local30 & 0x7, local26 & 0x7);
					if (local44 > 0 && this.anInt5078 - 1 > local44 && local56 > 0 && this.anInt5073 - 1 > local56) {
						local24.method1806(local44, local56);
					}
				}
			}
		}
		@Pc(97) int local97 = (arg8 & 0xFFFFFFF8) << 3;
		local26 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(113) byte local113 = 0;
		@Pc(115) byte local115 = 0;
		if (arg3 == 1) {
			local115 = 1;
		} else if (arg3 == 2) {
			local115 = 1;
			local113 = 1;
		} else if (arg3 == 3) {
			local113 = 1;
		}
		for (@Pc(142) int local142 = 0; local142 < this.anInt5076; local142++) {
			for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
				for (@Pc(150) int local150 = 0; local150 < 64; local150++) {
					if (local142 == arg2 && local146 >= local11 && local146 <= local11 + 8 && local150 >= local17 && local150 <= local17 + 8) {
						@Pc(228) int local228;
						@Pc(241) int local241;
						if (local11 + 8 == local146 || local150 == local17 + 8) {
							if (arg3 == 0) {
								local241 = local150 + arg0 - local17;
								local228 = local146 + arg5 - local11;
							} else if (arg3 == 1) {
								local241 = arg0 + local11 + 8 - local146;
								local228 = local150 + arg5 - local17;
							} else if (arg3 == 2) {
								local228 = arg5 + local11 + 8 - local146;
								local241 = local17 + arg0 + 8 - local150;
							} else {
								local241 = arg0 + local146 - local11;
								local228 = arg5 + local17 + 8 - local150;
							}
							this.method4080(local26 + local150, 0, 0, arg6, local228, arg7, true, local241, local146 + local97, 0);
						} else {
							local228 = Static362.method4940(local146 & 0x7, local150 & 0x7, arg3) + arg5;
							local241 = arg0 + Static375.method4700(arg3, local150 & 0x7, local146 & 0x7);
							this.method4080(local150 + local26, local115, local113, arg6, local228, arg7, false, local241, local97 + local146, arg3);
							if (local146 == 63 || local150 == 63) {
								@Pc(271) int local271 = local146 == 63 ? 64 : local146;
								@Pc(278) int local278 = local150 == 63 ? 64 : local150;
								@Pc(298) int local298;
								@Pc(290) int local290;
								if (arg3 == 0) {
									local290 = arg0 + local278 - local17;
									local298 = local271 + arg5 - local11;
								} else if (arg3 == 1) {
									local290 = arg0 + local11 + 8 - local271;
									local298 = local278 + arg5 - local17;
								} else if (arg3 == 2) {
									local298 = local11 + arg5 + 8 - local271;
									local290 = local17 + arg0 + 8 - local278;
								} else {
									local290 = local271 + arg0 - local11;
									local298 = arg5 + local17 + 8 - local278;
								}
								if (local298 >= 0 && local298 < this.anInt5078 && local290 >= 0 && this.anInt5073 > local290) {
									this.anIntArrayArrayArray9[arg7][local298][local290] = this.anIntArrayArrayArray9[arg7][local113 + local228][local115 + local241];
								}
							}
						}
					} else {
						this.method4080(0, 0, 0, arg6, -1, 0, false, -1, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILclient!si;[Lclient!eq;III)V")
	public final void method4072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub23 arg2, @OriginalArg(3) Class70[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean378) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class70 local16 = arg3[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = arg4 + local18;
						@Pc(32) int local32 = arg5 + local22;
						if (local28 >= 0 && local28 < this.anInt5078 && local32 >= 0 && this.anInt5073 > local32) {
							local16.method1806(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg0 + arg4;
		@Pc(75) int local75 = arg5 + arg1;
		for (local18 = 0; local18 < this.anInt5076; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method4080(local28 + local75, 0, 0, arg2, arg4 + local22, local18, false, local28 + arg5, local10 + local22, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([[III)V")
	public final void method4074(@OriginalArg(0) int[][] arg0) {
		@Pc(18) int[][] local18 = this.anIntArrayArrayArray9[0];
		for (@Pc(20) int local20 = 0; local20 < this.anInt5078 + 1; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt5073 + 1; local24++) {
				local18[local20][local24] += arg0[local20][local24];
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!ya;B[Lclient!eq;[[[I)V")
	public final void method4075(@OriginalArg(0) Class49 arg0, @OriginalArg(2) Class70[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean378) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt5078; local14++) {
					for (local18 = 0; local18 < this.anInt5073; local18++) {
						if ((Static227.aByteArrayArrayArray8[local10][local14][local18] & 0x1) != 0) {
							@Pc(35) int local35 = local10;
							if ((Static227.aByteArrayArrayArray8[1][local14][local18] & 0x2) != 0) {
								local35 = local10 - 1;
							}
							if (local35 >= 0) {
								arg1[local35].method1804(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt5076; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean378) {
				if (Static158.aBoolean247) {
					local14 = 2;
				}
				if (Static398.aBoolean449) {
					local18 = 8;
				}
				if (Static381.anInt6276 != 0) {
					local14 |= 0x1;
					if (local10 == 0 | Static324.aBoolean399) {
						local18 |= 0x10;
					}
				}
			}
			if (Static158.aBoolean247) {
				local18 |= 0x7;
			}
			if (!Static65.aBoolean90) {
				local18 |= 0x20;
			}
			@Pc(150) int[][] local150 = arg2 == null || arg2.length <= local10 ? this.anIntArrayArrayArray9[local10] : arg2[local10];
			Static452.method5850(local10, arg0.method4462(this.anInt5078, this.anInt5073, this.anIntArrayArrayArray9[local10], local150, local14, local18));
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIBIII)V")
	public final void method4077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg0; local3 < arg4 + arg0; local3++) {
			for (local7 = arg1; local7 < arg1 + arg3; local7++) {
				if (local7 >= 0 && local7 < this.anInt5078 && local3 >= 0 && this.anInt5073 > local3) {
					this.anIntArrayArrayArray9[arg2][local7][local3] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray9[arg2 - 1][local7][local3] - 240;
				}
			}
		}
		if (arg1 > 0 && this.anInt5078 > arg1) {
			for (local7 = arg0 + 1; local7 < arg4 + arg0; local7++) {
				if (local7 >= 0 && this.anInt5073 > local7) {
					this.anIntArrayArrayArray9[arg2][arg1][local7] = this.anIntArrayArrayArray9[arg2][arg1 - 1][local7];
				}
			}
		}
		if (arg0 > 0 && this.anInt5073 > arg0) {
			for (local7 = arg1 + 1; local7 < arg3 + arg1; local7++) {
				if (local7 >= 0 && local7 < this.anInt5078) {
					this.anIntArrayArrayArray9[arg2][local7][arg0] = this.anIntArrayArrayArray9[arg2][local7][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || arg1 >= this.anInt5078 || this.anInt5073 <= arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray9[arg2][arg1 - 1][arg0] != 0) {
				this.anIntArrayArrayArray9[arg2][arg1][arg0] = this.anIntArrayArrayArray9[arg2][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray9[arg2][arg1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray9[arg2][arg1][arg0] = this.anIntArrayArrayArray9[arg2][arg1][arg0 - 1];
				return;
			}
			if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray9[arg2][arg1 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray9[arg2][arg1][arg0] = this.anIntArrayArrayArray9[arg2][arg1 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray9[arg2 - 1][arg1 - 1][arg0] != this.anIntArrayArrayArray9[arg2][arg1 - 1][arg0]) {
			this.anIntArrayArrayArray9[arg2][arg1][arg0] = this.anIntArrayArrayArray9[arg2][arg1 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray9[arg2][arg1][arg0 - 1] != this.anIntArrayArrayArray9[arg2 - 1][arg1][arg0 - 1]) {
			this.anIntArrayArrayArray9[arg2][arg1][arg0] = this.anIntArrayArrayArray9[arg2][arg1][arg0 - 1];
			return;
		}
		if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray9[arg2][arg1 - 1][arg0 - 1] != this.anIntArrayArrayArray9[arg2 - 1][arg1 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray9[arg2][arg1][arg0] = this.anIntArrayArrayArray9[arg2][arg1 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!ta;Lclient!ta;Lclient!ya;I)V")
	public final void method4079(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) Class49 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt5078][this.anInt5073];
		if (Static58.anIntArray87 == null || this.anInt5073 != Static58.anIntArray87.length) {
			Static14.anIntArray33 = new int[this.anInt5073];
			Static335.anIntArray72 = new int[this.anInt5073];
			Static58.anIntArray87 = new int[this.anInt5073];
			Static192.anIntArray326 = new int[this.anInt5073];
			Static400.anIntArray638 = new int[this.anInt5073];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt5076; local44++) {
			for (local48 = 0; local48 < this.anInt5073; local48++) {
				Static58.anIntArray87[local48] = 0;
				Static400.anIntArray638[local48] = 0;
				Static192.anIntArray326[local48] = 0;
				Static14.anIntArray33[local48] = 0;
				Static335.anIntArray72[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt5078; local81++) {
				@Pc(91) int local91;
				@Pc(106) int local106;
				@Pc(175) int local175;
				for (@Pc(85) int local85 = 0; local85 < this.anInt5073; local85++) {
					local91 = local81 + 5;
					@Pc(155) int local155;
					if (this.anInt5078 > local91) {
						local106 = this.aByteArrayArrayArray13[local44][local91][local85] & 0xFF;
						if (local106 > 0) {
							@Pc(119) Class269 local119 = this.aClass47_5.method901(local106 - 1);
							Static58.anIntArray87[local85] += local119.anInt7436;
							Static400.anIntArray638[local85] += local119.anInt7437;
							Static192.anIntArray326[local85] += local119.anInt7443;
							Static14.anIntArray33[local85] += local119.anInt7440;
							local155 = Static335.anIntArray72[local85]++;
						}
					}
					local106 = local81 - 5;
					if (local106 >= 0) {
						local175 = this.aByteArrayArrayArray13[local44][local106][local85] & 0xFF;
						if (local175 > 0) {
							@Pc(188) Class269 local188 = this.aClass47_5.method901(local175 - 1);
							Static58.anIntArray87[local85] -= local188.anInt7436;
							Static400.anIntArray638[local85] -= local188.anInt7437;
							Static192.anIntArray326[local85] -= local188.anInt7443;
							Static14.anIntArray33[local85] -= local188.anInt7440;
							local155 = Static335.anIntArray72[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local106 = 0;
					local175 = 0;
					@Pc(242) int local242 = 0;
					@Pc(244) int local244 = 0;
					for (@Pc(246) int local246 = -5; local246 < this.anInt5073; local246++) {
						@Pc(252) int local252 = local246 + 5;
						if (local252 < this.anInt5073) {
							local242 += Static14.anIntArray33[local252];
							local175 += Static192.anIntArray326[local252];
							local244 += Static335.anIntArray72[local252];
							local106 += Static400.anIntArray638[local252];
							local91 += Static58.anIntArray87[local252];
						}
						@Pc(290) int local290 = local246 - 5;
						if (local290 >= 0) {
							local244 -= Static335.anIntArray72[local290];
							local106 -= Static400.anIntArray638[local290];
							local91 -= Static58.anIntArray87[local290];
							local175 -= Static192.anIntArray326[local290];
							local242 -= Static14.anIntArray33[local290];
						}
						if (local246 >= 0 && local242 > 0 && local244 > 0) {
							local11[local81][local246] = Static366.method4992(local175 / local244, local106 / local244, local91 * 256 / local242);
						}
					}
				}
			}
			if (Static100.aBoolean169) {
				this.method4082(local11, local44 == 0 ? arg1 : null, arg2, local44, local44 == 0 ? arg0 : null, Static58.aClass64Array1[local44]);
			} else {
				this.method4070(local44, Static58.aClass64Array1[local44], local11, arg2, local44 == 0 ? arg0 : null, local44 == 0 ? arg1 : null);
			}
			this.aByteArrayArrayArray13[local44] = null;
			this.aByteArrayArrayArray14[local44] = null;
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray15[local44] = null;
		}
		if (!this.aBoolean378) {
			if (Static381.anInt6276 != 0) {
				Static204.method2770();
			}
			if (Static158.aBoolean247) {
				Static110.method2013();
			}
		}
		for (local48 = 0; local48 < this.anInt5076; local48++) {
			Static58.aClass64Array1[local48].ca();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZILclient!si;IIZIII)V")
	private void method4080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub23 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg9 == 1) {
			arg1 = 1;
		} else if (arg9 == 2) {
			arg2 = 1;
			arg1 = 1;
		} else if (arg9 == 3) {
			arg2 = 1;
		}
		@Pc(72) int local72;
		if (arg4 < 0 || this.anInt5078 <= arg4 || arg7 < 0 || arg7 >= this.anInt5073) {
			while (true) {
				local72 = arg3.method5495();
				if (local72 == 0) {
					return;
				}
				if (local72 == 1) {
					arg3.method5495();
					return;
				}
				if (local72 <= 49) {
					arg3.method5495();
				}
			}
			return;
		}
		if (!this.aBoolean378 && !arg6) {
			Static227.aByteArrayArrayArray8[arg5][arg4][arg7] = 0;
		}
		while (true) {
			local72 = arg3.method5495();
			if (local72 == 0) {
				if (this.aBoolean378) {
					this.anIntArrayArrayArray9[0][arg2 + arg4][arg1 + arg7] = 0;
					return;
				} else if (arg5 == 0) {
					this.anIntArrayArrayArray9[0][arg2 + arg4][arg7 + arg1] = -Static236.method3662(arg8 + 932731, arg0 + 556238) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray9[arg5][arg4 + arg2][arg1 + arg7] = this.anIntArrayArrayArray9[arg5 - 1][arg4 + arg2][arg1 + arg7] - 240;
					return;
				}
			}
			if (local72 == 1) {
				@Pc(160) int local160 = arg3.method5495();
				if (!this.aBoolean378) {
					if (local160 == 1) {
						local160 = 0;
					}
					if (arg5 != 0) {
						this.anIntArrayArrayArray9[arg5][arg4 + arg2][arg1 + arg7] = this.anIntArrayArrayArray9[arg5 - 1][arg2 + arg4][arg1 + arg7] - (local160 * 8 << 0);
						return;
					}
					this.anIntArrayArrayArray9[0][arg2 + arg4][arg7 + arg1] = -local160 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray9[0][arg4 + arg2][arg7 + arg1] = local160 * 8 << 0;
				return;
			}
			if (local72 <= 49) {
				if (arg6) {
					arg3.method5495();
				} else {
					this.aByteArrayArrayArray14[arg5][arg4][arg7] = arg3.method5484();
					this.aByteArrayArrayArray11[arg5][arg4][arg7] = (byte) ((local72 - 2) / 4);
					this.aByteArrayArrayArray15[arg5][arg4][arg7] = (byte) (arg9 + local72 - 2 & 0x3);
				}
			} else if (local72 <= 81) {
				if (!this.aBoolean378 && !arg6) {
					Static227.aByteArrayArrayArray8[arg5][arg4][arg7] = (byte) (local72 - 49);
				}
			} else if (!arg6) {
				this.aByteArrayArrayArray13[arg5][arg4][arg7] = (byte) (local72 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
	public final void method4081(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5076; local1++) {
			this.method4077(arg0, arg1, local1, 64, 64);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([[ILclient!ta;Lclient!ya;ILclient!ta;ZLclient!ta;)V")
	private void method4082(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class64 arg4, @OriginalArg(6) Class64 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg3];
		@Pc(21) byte[][] local21 = this.aByteArrayArrayArray15[arg3];
		@Pc(26) byte[][] local26 = this.aByteArrayArrayArray13[arg3];
		@Pc(31) byte[][] local31 = this.aByteArrayArrayArray14[arg3];
		for (@Pc(33) int local33 = 0; local33 < this.anInt5078; local33++) {
			@Pc(47) int local47 = local33 < this.anInt5078 - 1 ? local33 + 1 : local33;
			for (@Pc(49) int local49 = 0; local49 < this.anInt5073; local49++) {
				@Pc(63) int local63 = this.anInt5073 - 1 > local49 ? local49 + 1 : local49;
				if (Static175.anInt3463 == -1 || Static161.method5537(Static175.anInt3463, arg3, local49, local33)) {
					@Pc(78) boolean local78 = false;
					@Pc(80) boolean local80 = false;
					@Pc(83) boolean[] local83 = new boolean[4];
					@Pc(89) int local89 = local10[local33][local49];
					@Pc(95) int local95 = local21[local33][local49];
					@Pc(103) int local103 = local31[local33][local49] & 0xFF;
					@Pc(111) int local111 = local26[local33][local49] & 0xFF;
					@Pc(119) int local119 = local26[local33][local63] & 0xFF;
					@Pc(127) int local127 = local26[local47][local63] & 0xFF;
					@Pc(135) int local135 = local26[local47][local49] & 0xFF;
					if (local103 != 0 || local111 != 0) {
						@Pc(154) Class24 local154 = local103 == 0 ? null : this.aClass148_6.method3342(local103 - 1);
						@Pc(169) Class269 local169 = local111 == 0 ? null : this.aClass47_5.method901(local111 - 1);
						if (local89 == 0 && local154 == null) {
							local89 = 12;
						}
						@Pc(177) Class24 local177 = local154;
						if (local154 != null) {
							if (local154.anInt594 == -1 && local154.anInt596 == -1) {
								local177 = local154;
								local154 = null;
							} else if (local169 != null && local89 != 0) {
								local80 = local154.aBoolean30;
							}
						}
						@Pc(267) int local267;
						@Pc(297) int local297;
						@Pc(362) int local362;
						@Pc(371) int local371;
						if ((local89 == 0 || local89 == 12) && local33 > 0 && local49 > 0 && local33 < this.anInt5078 && local49 < this.anInt5073) {
							@Pc(248) int local248 = local26[local47][local63] == local111 ? 1 : -1;
							local267 = local111 == local26[local33 - 1][local49 - 1] ? 1 : -1;
							@Pc(282) int local282 = local26[local47][local49 - 1] == local111 ? 1 : -1;
							local297 = local111 == local26[local33 - 1][local63] ? 1 : -1;
							if (local111 == local26[local33][local49 - 1]) {
								local267++;
								local282++;
							} else {
								local282--;
								local267--;
							}
							if (local111 == local26[local47][local49]) {
								local248++;
								local282++;
							} else {
								local248--;
								local282--;
							}
							if (local111 == local26[local33][local63]) {
								local297++;
								local248++;
							} else {
								local248--;
								local297--;
							}
							if (local111 == local26[local33 - 1][local49]) {
								local267++;
								local297++;
							} else {
								local267--;
								local297--;
							}
							local362 = local267 - local248;
							if (local362 < 0) {
								local362 = -local362;
							}
							local371 = local282 - local297;
							if (local371 < 0) {
								local371 = -local371;
							}
							if (local371 == local362) {
								local362 = arg5.l(local33, local49) - arg5.l(local47, local63);
								local371 = arg5.l(local47, local49) - arg5.l(local33, local63);
								if (local362 < 0) {
									local362 = -local362;
								}
								if (local371 < 0) {
									local371 = -local371;
								}
							}
							local95 = local362 < local371 ? 1 : 0;
						}
						for (local267 = 0; local267 < 13; local267++) {
							Static448.anIntArray626[local267] = -1;
							Static325.anIntArray463[local267] = 1;
						}
						@Pc(461) boolean[] local461 = local154 != null && local154.aBoolean30 ? Static161.aBooleanArrayArray40[local89] : Static405.aBooleanArrayArray38[local89];
						this.method4083(local31, local33, this.anInt5073, local154, arg2, local83, local169, local95, local89, local49, local10, this.anInt5078, local21);
						@Pc(490) boolean local490 = local154 != null && local154.anInt596 != local154.anInt594;
						if (!local490) {
							for (local297 = 0; local297 < 8; local297++) {
								if (Static448.anIntArray626[local297] >= 0 && Static379.anIntArray547[local297] != Static444.anIntArray620[local297]) {
									local490 = true;
									break;
								}
							}
						}
						if (!local461[local95 + 1 & 0x3]) {
							local83[1] = Static314.method4406(local83[1], (Static325.anIntArray463[2] & Static325.anIntArray463[4]) == 0);
						}
						if (!local461[local95 + 3 & 0x3]) {
							local83[3] = Static314.method4406(local83[3], (Static325.anIntArray463[0] & Static325.anIntArray463[6]) == 0);
						}
						if (!local461[--local95 & 0x3]) {
							local83[0] = Static314.method4406(local83[0], (Static325.anIntArray463[2] & Static325.anIntArray463[0]) == 0);
						}
						if (!local461[local95 + 2 & 0x3]) {
							local83[2] = Static314.method4406(local83[2], (Static325.anIntArray463[4] & Static325.anIntArray463[6]) == 0);
						}
						if (!local80 && (local89 == 0 || local89 == 12)) {
							if (local83[0] && !local83[1] && !local83[2] && local83[3]) {
								local95 = 0;
								local89 = local89 == 0 ? 13 : 14;
								local83[0] = local83[3] = false;
							} else if (local83[0] && local83[1] && !local83[2] && !local83[3]) {
								local83[0] = local83[1] = false;
								local95 = 3;
								local89 = local89 == 0 ? 13 : 14;
							} else if (!local83[0] && local83[1] && local83[2] && !local83[3]) {
								local95 = 2;
								local83[1] = local83[2] = false;
								local89 = local89 == 0 ? 13 : 14;
							} else if (!local83[0] && !local83[1] && local83[2] && local83[3]) {
								local95 = 1;
								local89 = local89 == 0 ? 13 : 14;
								local83[2] = local83[3] = false;
							}
						}
						@Pc(803) boolean local803 = !local80 && !local83[0] && !local83[2] && !local83[1] && !local83[3];
						@Pc(805) int[] local805 = null;
						@Pc(835) int[] local835;
						@Pc(815) int[] local815;
						@Pc(811) int[] local811;
						if (local803) {
							local811 = Static220.anIntArrayArray40[local89];
							local815 = Static375.anIntArrayArray58[local89];
							local362 = local169 == null ? 0 : Static312.anIntArray448[local89];
							local371 = local154 == null ? 0 : Static85.anIntArray154[local89];
							local835 = Static336.anIntArrayArray57[local89];
						} else if (local80) {
							local362 = local169 == null ? 0 : Static271.anIntArray410[local89];
							local371 = local154 == null ? 0 : Static282.anIntArray416[local89];
							local811 = Static87.anIntArrayArray13[local89];
							local835 = Static247.anIntArrayArray46[local89];
							local805 = Static263.anIntArrayArray50[local89];
							local815 = Static233.anIntArrayArray44[local89];
						} else {
							local362 = local169 == null ? 0 : Static19.anIntArray427[local89];
							local805 = Static230.anIntArrayArray42[local89];
							local835 = Static346.anIntArrayArray59[local89];
							local811 = Static91.anIntArrayArray16[local89];
							local371 = local154 == null ? 0 : Static185.anIntArray317[local89];
							local815 = Static79.anIntArrayArray10[local89];
						}
						@Pc(908) int local908 = local362 + local371;
						if (local908 <= 0) {
							Static328.method4560(arg3, local33, local49);
						} else {
							if (local83[0]) {
								local908++;
							}
							if (local83[2]) {
								local908++;
							}
							if (local83[1]) {
								local908++;
							}
							if (local83[3]) {
								local908++;
							}
							@Pc(938) int local938 = 0;
							@Pc(940) int local940 = 0;
							@Pc(944) int local944 = local908 * 3;
							@Pc(951) int[] local951 = local490 ? new int[local944] : null;
							@Pc(954) int[] local954 = new int[local944];
							@Pc(957) int[] local957 = new int[local944];
							@Pc(960) int[] local960 = new int[local944];
							@Pc(963) int[] local963 = new int[local944];
							@Pc(966) int[] local966 = new int[local944];
							@Pc(973) int[] local973 = arg1 == null ? null : new int[local944];
							@Pc(982) int[] local982 = arg1 == null && arg4 == null ? null : new int[local944];
							@Pc(984) int local984 = -1;
							@Pc(986) int local986 = -1;
							@Pc(988) int local988 = 256;
							@Pc(1107) byte local1107;
							@Pc(1038) int local1038;
							@Pc(1040) int local1040;
							@Pc(1273) int local1273;
							@Pc(1279) int local1279;
							@Pc(1288) int local1288;
							@Pc(1293) int local1293;
							@Pc(1315) int local1315;
							@Pc(1298) int local1298;
							@Pc(1311) int local1311;
							@Pc(1366) int local1366;
							@Pc(1373) int local1373;
							if (local154 != null) {
								local984 = local154.anInt594;
								local986 = arg2.method4465() ? local154.anInt600 : local154.anInt601;
								local988 = local154.anInt595;
								local1038 = Static16.method326(arg2, local154);
								for (local1040 = 0; local1040 < local371; local1040++) {
									if (local83[-local95 & 0x3] && local938 == local805[0]) {
										Static321.anIntArray460[0] = local835[local938];
										Static321.anIntArray460[1] = 1;
										Static321.anIntArray460[2] = local811[local938];
										Static321.anIntArray460[3] = 1;
										Static321.anIntArray460[4] = local815[local938];
										Static321.anIntArray460[5] = local811[local938];
										local1107 = 6;
									} else if (local83[2 - local95 & 0x3] && local805[2] == local938) {
										Static321.anIntArray460[0] = local835[local938];
										Static321.anIntArray460[1] = 5;
										Static321.anIntArray460[2] = local811[local938];
										Static321.anIntArray460[3] = 5;
										Static321.anIntArray460[4] = local815[local938];
										Static321.anIntArray460[5] = local811[local938];
										local1107 = 6;
									} else if (local83[1 - local95 & 0x3] && local938 == local805[1]) {
										Static321.anIntArray460[0] = local835[local938];
										Static321.anIntArray460[1] = 3;
										Static321.anIntArray460[2] = local811[local938];
										Static321.anIntArray460[3] = 3;
										Static321.anIntArray460[4] = local815[local938];
										local1107 = 6;
										Static321.anIntArray460[5] = local811[local938];
									} else if (local83[3 - local95 & 0x3] && local805[3] == local938) {
										Static321.anIntArray460[0] = local835[local938];
										Static321.anIntArray460[1] = 7;
										Static321.anIntArray460[2] = local811[local938];
										Static321.anIntArray460[3] = 7;
										Static321.anIntArray460[4] = local815[local938];
										Static321.anIntArray460[5] = local811[local938];
										local1107 = 6;
									} else {
										Static321.anIntArray460[0] = local835[local938];
										Static321.anIntArray460[1] = local815[local938];
										local1107 = 3;
										Static321.anIntArray460[2] = local811[local938];
									}
									for (local1273 = 0; local1273 < local1107; local1273++) {
										local1279 = Static321.anIntArray460[local1273];
										local1288 = local1279 - local95 * 2 & 0x7;
										local1293 = this.anIntArray413[local1279];
										local1298 = this.anIntArray414[local1279];
										if (local95 == 1) {
											local1311 = 128 - local1293;
											local1315 = local1298;
										} else if (local95 == 2) {
											local1311 = 128 - local1298;
											local1315 = 128 - local1293;
										} else if (local95 == 3) {
											local1315 = 128 - local1298;
											local1311 = local1293;
										} else {
											local1311 = local1298;
											local1315 = local1293;
										}
										local954[local940] = local1315;
										local957[local940] = local1311;
										if (local973 != null && Static293.aBooleanArrayArray25[local89][local1279]) {
											local1366 = local1315 + (local33 << 7);
											local1373 = (local49 << 7) + local1311;
											local973[local940] = arg1.a(local1366, local1373) - arg5.a(local1366, local1373);
										}
										if (local982 != null) {
											if (arg1 != null && !Static293.aBooleanArrayArray25[local89][local1279]) {
												local1366 = local1315 + (local33 << 7);
												local1373 = (local49 << 7) + local1311;
												local982[local940] = arg5.a(local1366, local1373) - arg1.a(local1366, local1373);
											} else if (arg4 != null && !Static361.aBooleanArrayArray31[local89][local1279]) {
												local1366 = (local33 << 7) + local1315;
												local1373 = local1311 + (local49 << 7);
												local982[local940] = arg4.a(local1366, local1373) - arg5.a(local1366, local1373);
											}
										}
										if (local1279 < 8 && local154.anInt590 < Static448.anIntArray626[local1288]) {
											if (local951 != null) {
												local951[local940] = Static379.anIntArray547[local1288];
											}
											local966[local940] = Static103.anIntArray189[local1288];
											local963[local940] = Static348.anIntArray391[local1288];
											local960[local940] = Static444.anIntArray620[local1288];
										} else {
											if (local951 != null) {
												local951[local940] = local1038;
											}
											local963[local940] = arg2.method4465() ? local154.anInt600 : local154.anInt601;
											local966[local940] = local154.anInt595;
											local960[local940] = local984;
										}
										local940++;
									}
									local938++;
								}
								if (!this.aBoolean378 && arg3 == 0) {
									Static375.method4699(local33, local49, local154.anInt603, local154.anInt588 * 8, local154.anInt592);
								}
								if (local89 != 12 && local154.anInt594 != -1 && local154.aBoolean31) {
									local78 = true;
								}
							} else if (local803) {
								local938 = Static85.anIntArray154[local89];
							} else if (local80) {
								local938 = Static282.anIntArray416[local89];
							} else {
								local938 = Static185.anIntArray317[local89];
							}
							if (local169 != null) {
								if (local127 == 0) {
									local127 = local111;
								}
								if (local135 == 0) {
									local135 = local111;
								}
								if (local119 == 0) {
									local119 = local111;
								}
								@Pc(1593) Class269 local1593 = this.aClass47_5.method901(local111 - 1);
								@Pc(1601) Class269 local1601 = this.aClass47_5.method901(local119 - 1);
								@Pc(1609) Class269 local1609 = this.aClass47_5.method901(local127 - 1);
								@Pc(1617) Class269 local1617 = this.aClass47_5.method901(local135 - 1);
								for (local1288 = 0; local1288 < local362; local1288++) {
									if (local83[-local95 & 0x3] && local938 == local805[0]) {
										Static321.anIntArray460[0] = local835[local938];
										Static321.anIntArray460[1] = 1;
										Static321.anIntArray460[2] = local811[local938];
										Static321.anIntArray460[3] = 1;
										Static321.anIntArray460[4] = local815[local938];
										Static321.anIntArray460[5] = local811[local938];
										local1107 = 6;
									} else if (local83[2 - local95 & 0x3] && local938 == local805[2]) {
										Static321.anIntArray460[0] = local835[local938];
										Static321.anIntArray460[1] = 5;
										Static321.anIntArray460[2] = local811[local938];
										Static321.anIntArray460[3] = 5;
										Static321.anIntArray460[4] = local815[local938];
										local1107 = 6;
										Static321.anIntArray460[5] = local811[local938];
									} else if (local83[1 - local95 & 0x3] && local805[1] == local938) {
										Static321.anIntArray460[0] = local835[local938];
										Static321.anIntArray460[1] = 3;
										Static321.anIntArray460[2] = local811[local938];
										Static321.anIntArray460[3] = 3;
										Static321.anIntArray460[4] = local815[local938];
										Static321.anIntArray460[5] = local811[local938];
										local1107 = 6;
									} else if (local83[3 - local95 & 0x3] && local938 == local805[3]) {
										Static321.anIntArray460[0] = local835[local938];
										Static321.anIntArray460[1] = 7;
										Static321.anIntArray460[2] = local811[local938];
										Static321.anIntArray460[3] = 7;
										Static321.anIntArray460[4] = local815[local938];
										local1107 = 6;
										Static321.anIntArray460[5] = local811[local938];
									} else {
										Static321.anIntArray460[0] = local835[local938];
										Static321.anIntArray460[1] = local815[local938];
										local1107 = 3;
										Static321.anIntArray460[2] = local811[local938];
									}
									for (local1293 = 0; local1293 < local1107; local1293++) {
										local1315 = Static321.anIntArray460[local1293];
										local1298 = local1315 - local95 * 2 & 0x7;
										local1311 = this.anIntArray413[local1315];
										local1373 = this.anIntArray414[local1315];
										@Pc(1887) int local1887;
										if (local95 == 1) {
											local1887 = 128 - local1311;
											local1366 = local1373;
										} else if (local95 == 2) {
											local1887 = 128 - local1373;
											local1366 = 128 - local1311;
										} else if (local95 == 3) {
											local1887 = local1311;
											local1366 = 128 - local1373;
										} else {
											local1887 = local1373;
											local1366 = local1311;
										}
										local954[local940] = local1366;
										local957[local940] = local1887;
										@Pc(1944) int local1944;
										@Pc(1951) int local1951;
										if (local973 != null && Static293.aBooleanArrayArray25[local89][local1315]) {
											local1944 = (local33 << 7) + local1366;
											local1951 = (local49 << 7) + local1887;
											local973[local940] = arg1.a(local1944, local1951) - arg5.a(local1944, local1951);
										}
										if (local982 != null) {
											if (arg1 != null && !Static293.aBooleanArrayArray25[local89][local1315]) {
												local1944 = local1366 + (local33 << 7);
												local1951 = (local49 << 7) + local1887;
												local982[local940] = arg5.a(local1944, local1951) - arg1.a(local1944, local1951);
											} else if (arg4 != null && !Static361.aBooleanArrayArray31[local89][local1315]) {
												local1944 = (local33 << 7) + local1366;
												local1951 = (local49 << 7) + local1887;
												local982[local940] = arg4.a(local1944, local1951) - arg5.a(local1944, local1951);
											}
										}
										if (local1315 < 8 && Static448.anIntArray626[local1298] >= 0) {
											if (local951 != null) {
												local951[local940] = Static379.anIntArray547[local1298];
											}
											local966[local940] = Static103.anIntArray189[local1298];
											local963[local940] = Static348.anIntArray391[local1298];
											local960[local940] = Static444.anIntArray620[local1298];
										} else {
											if (local80 && Static293.aBooleanArrayArray25[local89][local1315]) {
												local963[local940] = local986;
												local966[local940] = local988;
												local960[local940] = local984;
											} else if (local1366 == 0 && local1887 == 0) {
												local960[local940] = arg0[local33][local49];
												local963[local940] = local1593.anInt7438;
												local966[local940] = local1593.anInt7444;
											} else if (local1366 == 0 && local1887 == 128) {
												local960[local940] = arg0[local33][local63];
												local963[local940] = local1601.anInt7438;
												local966[local940] = local1601.anInt7444;
											} else if (local1366 == 128 && local1887 == 128) {
												local960[local940] = arg0[local47][local63];
												local963[local940] = local1609.anInt7438;
												local966[local940] = local1609.anInt7444;
											} else if (local1366 == 128 && local1887 == 0) {
												local960[local940] = arg0[local47][local49];
												local963[local940] = local1617.anInt7438;
												local966[local940] = local1617.anInt7444;
											} else {
												if (local1366 < 64) {
													if (local1887 >= 64) {
														local963[local940] = local1601.anInt7438;
														local966[local940] = local1601.anInt7444;
													} else {
														local963[local940] = local1593.anInt7438;
														local966[local940] = local1593.anInt7444;
													}
												} else if (local1887 < 64) {
													local963[local940] = local1617.anInt7438;
													local966[local940] = local1617.anInt7444;
												} else {
													local963[local940] = local1609.anInt7438;
													local966[local940] = local1609.anInt7444;
												}
												local1944 = Static195.method3067(arg0[local33][local49], arg0[local47][local49], local1366 << 7 >> 7);
												local1951 = Static195.method3067(arg0[local33][local63], arg0[local47][local63], local1366 << 7 >> 7);
												local960[local940] = Static195.method3067(local1944, local1951, local1887 << 7 >> 7);
											}
											if (local951 != null) {
												local951[local940] = local960[local940];
											}
										}
										local940++;
									}
									local938++;
								}
								if (local89 != 0 && local169.aBoolean489) {
									local78 = true;
								}
							}
							local1038 = arg5.l(local33, local49);
							local1040 = arg5.l(local47, local49);
							local1273 = arg5.l(local47, local63);
							local1279 = arg5.l(local33, local63);
							if (arg3 > 0) {
								@Pc(2369) boolean local2369 = true;
								if (local111 == 0 && local89 != 0) {
									local2369 = false;
								}
								if (local103 > 0 && local177 != null && !local177.aBoolean29) {
									local2369 = false;
								}
								if (local2369 && local1040 == local1038 && local1038 == local1273 && local1279 == local1038) {
									this.aByteArrayArrayArray12[arg3][local33][local49] = (byte) (this.aByteArrayArrayArray12[arg3][local33][local49] | 0x4);
								}
							}
							local1288 = 0;
							local1293 = 0;
							local1315 = 0;
							if (this.aBoolean378) {
								local1288 = Static322.method4519(local33, local49);
								local1293 = Static423.method5846(local33, local49);
								local1315 = Static370.method5036(local33, local49);
							}
							arg5.B(local33, local49, local954, local973, local957, local982, local960, local951, local963, local966, local1288, local1293, local1315, local78);
							Static328.method4560(arg3, local33, local49);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([[BIILclient!bh;Lclient!ya;I[ZLclient!wv;III[[BI[[B)V")
	private void method4083(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24 arg3, @OriginalArg(4) Class49 arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) Class269 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(45) int local45;
		if (arg3 != null && arg6 != null || arg6 != null && arg8 == 12 || arg3 != null && arg8 == 0) {
			@Pc(29) boolean[] local29 = arg3 != null && arg3.aBoolean30 ? Static161.aBooleanArrayArray40[arg8] : Static405.aBooleanArrayArray38[arg8];
			@Pc(58) Class24 local58;
			@Pc(76) byte local76;
			@Pc(92) int local92;
			@Pc(97) int local97;
			if (arg9 > 0) {
				if (arg1 > 0) {
					local45 = arg0[arg1 - 1][arg9 - 1] & 0xFF;
					if (local45 > 0) {
						local58 = this.aClass148_6.method3342(local45 - 1);
						if (local58.anInt594 != -1 && local58.aBoolean30) {
							local76 = arg10[arg1 - 1][arg9 - 1];
							local92 = arg12[arg1 - 1][arg9 - 1] * 2 + 4 & 0x7;
							local97 = Static16.method326(arg4, local58);
							if (Static293.aBooleanArrayArray25[local76][local92]) {
								Static444.anIntArray620[0] = local58.anInt594;
								Static379.anIntArray547[0] = local97;
								Static348.anIntArray391[0] = arg4.method4465() ? local58.anInt600 : local58.anInt601;
								Static103.anIntArray189[0] = local58.anInt595;
								Static448.anIntArray626[0] = local58.anInt590;
								Static325.anIntArray463[0] = 256;
							}
						}
					}
				}
				if (arg1 < arg11 - 1) {
					local45 = arg0[arg1 + 1][arg9 - 1] & 0xFF;
					if (local45 > 0) {
						local58 = this.aClass148_6.method3342(local45 - 1);
						if (local58.anInt594 != -1 && local58.aBoolean30) {
							local76 = arg10[arg1 + 1][arg9 - 1];
							local92 = arg12[arg1 + 1][arg9 - 1] * 2 + 6 & 0x7;
							local97 = Static16.method326(arg4, local58);
							if (Static293.aBooleanArrayArray25[local76][local92]) {
								Static444.anIntArray620[2] = local58.anInt594;
								Static379.anIntArray547[2] = local97;
								Static348.anIntArray391[2] = arg4.method4465() ? local58.anInt600 : local58.anInt601;
								Static103.anIntArray189[2] = local58.anInt595;
								Static448.anIntArray626[2] = local58.anInt590;
								Static325.anIntArray463[2] = 512;
							}
						}
					}
				}
			}
			if (arg2 - 1 > arg9) {
				if (arg1 > 0) {
					local45 = arg0[arg1 - 1][arg9 + 1] & 0xFF;
					if (local45 > 0) {
						local58 = this.aClass148_6.method3342(local45 - 1);
						if (local58.anInt594 != -1 && local58.aBoolean30) {
							local76 = arg10[arg1 - 1][arg9 + 1];
							local92 = arg12[arg1 - 1][arg9 + 1] * 2 + 2 & 0x7;
							local97 = Static16.method326(arg4, local58);
							if (Static293.aBooleanArrayArray25[local76][local92]) {
								Static444.anIntArray620[6] = local58.anInt594;
								Static379.anIntArray547[6] = local97;
								Static348.anIntArray391[6] = arg4.method4465() ? local58.anInt600 : local58.anInt601;
								Static103.anIntArray189[6] = local58.anInt595;
								Static448.anIntArray626[6] = local58.anInt590;
								Static325.anIntArray463[6] = 64;
							}
						}
					}
				}
				if (arg1 < arg11 - 1) {
					local45 = arg0[arg1 + 1][arg9 + 1] & 0xFF;
					if (local45 > 0) {
						local58 = this.aClass148_6.method3342(local45 - 1);
						if (local58.anInt594 != -1 && local58.aBoolean30) {
							local76 = arg10[arg1 + 1][arg9 + 1];
							local92 = --(arg12[arg1 + 1][arg9 + 1] * 2) & 0x7;
							local97 = Static16.method326(arg4, local58);
							if (Static293.aBooleanArrayArray25[local76][local92]) {
								Static444.anIntArray620[4] = local58.anInt594;
								Static379.anIntArray547[4] = local97;
								Static348.anIntArray391[4] = arg4.method4465() ? local58.anInt600 : local58.anInt601;
								Static103.anIntArray189[4] = local58.anInt595;
								Static448.anIntArray626[4] = local58.anInt590;
								Static325.anIntArray463[4] = 128;
							}
						}
					}
				}
			}
			@Pc(530) int local530;
			@Pc(535) int local535;
			@Pc(537) int local537;
			@Pc(518) byte local518;
			if (arg9 > 0) {
				local45 = arg0[arg1][arg9 - 1] & 0xFF;
				if (local45 > 0) {
					local58 = this.aClass148_6.method3342(local45 - 1);
					if (local58.anInt594 != -1) {
						local76 = arg10[arg1][arg9 - 1];
						local518 = arg12[arg1][arg9 - 1];
						if (local58.aBoolean30) {
							local97 = 2;
							local530 = local518 * 2 + 4;
							local535 = Static16.method326(arg4, local58);
							for (local537 = 0; local537 < 3; local537++) {
								local97 &= 0x7;
								local530 &= 0x7;
								if (Static293.aBooleanArrayArray25[local76][local530] && local58.anInt590 >= Static448.anIntArray626[local97]) {
									Static444.anIntArray620[local97] = local58.anInt594;
									Static379.anIntArray547[local97] = local535;
									Static348.anIntArray391[local97] = arg4.method4465() ? local58.anInt600 : local58.anInt601;
									Static103.anIntArray189[local97] = local58.anInt595;
									if (Static448.anIntArray626[local97] == local58.anInt590) {
										Static325.anIntArray463[local97] |= 0x20;
									} else {
										Static325.anIntArray463[local97] = 32;
									}
									Static448.anIntArray626[local97] = local58.anInt590;
								}
								local97--;
								local530++;
							}
							if (!local29[arg7 & 0x3]) {
								arg5[0] = Static161.aBooleanArrayArray40[local76][local518 + 2 & 0x3];
							}
						} else if (!local29[arg7 & 0x3]) {
							arg5[0] = Static405.aBooleanArrayArray38[local76][local518 + 2 & 0x3];
						}
					}
				}
			}
			if (arg2 - 1 > arg9) {
				local45 = arg0[arg1][arg9 + 1] & 0xFF;
				if (local45 > 0) {
					local58 = this.aClass148_6.method3342(local45 - 1);
					if (local58.anInt594 != -1) {
						local76 = arg10[arg1][arg9 + 1];
						local518 = arg12[arg1][arg9 + 1];
						if (local58.aBoolean30) {
							local97 = 4;
							local530 = local518 * 2 + 2;
							local535 = Static16.method326(arg4, local58);
							for (local537 = 0; local537 < 3; local537++) {
								local97 &= 0x7;
								local530 &= 0x7;
								if (Static293.aBooleanArrayArray25[local76][local530] && Static448.anIntArray626[local97] <= local58.anInt590) {
									Static444.anIntArray620[local97] = local58.anInt594;
									Static379.anIntArray547[local97] = local535;
									Static348.anIntArray391[local97] = arg4.method4465() ? local58.anInt600 : local58.anInt601;
									Static103.anIntArray189[local97] = local58.anInt595;
									if (local58.anInt590 == Static448.anIntArray626[local97]) {
										Static325.anIntArray463[local97] |= 0x10;
									} else {
										Static325.anIntArray463[local97] = 16;
									}
									Static448.anIntArray626[local97] = local58.anInt590;
								}
								local530--;
								local97++;
							}
							if (!local29[arg7 + 2 & 0x3]) {
								arg5[2] = Static161.aBooleanArrayArray40[local76][local518 & 0x3];
							}
						} else if (!local29[arg7 + 2 & 0x3]) {
							arg5[2] = Static405.aBooleanArrayArray38[local76][--local518 & 0x3];
						}
					}
				}
			}
			if (arg1 > 0) {
				local45 = arg0[arg1 - 1][arg9] & 0xFF;
				if (local45 > 0) {
					local58 = this.aClass148_6.method3342(local45 - 1);
					if (local58.anInt594 != -1) {
						local76 = arg10[arg1 - 1][arg9];
						local518 = arg12[arg1 - 1][arg9];
						if (local58.aBoolean30) {
							local97 = 6;
							local530 = local518 * 2 + 4;
							local535 = Static16.method326(arg4, local58);
							for (local537 = 0; local537 < 3; local537++) {
								local97 &= 0x7;
								local530 &= 0x7;
								if (Static293.aBooleanArrayArray25[local76][local530] && local58.anInt590 >= Static448.anIntArray626[local97]) {
									Static444.anIntArray620[local97] = local58.anInt594;
									Static379.anIntArray547[local97] = local535;
									Static348.anIntArray391[local97] = arg4.method4465() ? local58.anInt600 : local58.anInt601;
									Static103.anIntArray189[local97] = local58.anInt595;
									if (Static448.anIntArray626[local97] == local58.anInt590) {
										Static325.anIntArray463[local97] |= 0x8;
									} else {
										Static325.anIntArray463[local97] = 8;
									}
									Static448.anIntArray626[local97] = local58.anInt590;
								}
								local97++;
								local530--;
							}
							if (!local29[arg7 + 3 & 0x3]) {
								arg5[3] = Static161.aBooleanArrayArray40[local76][local518 + 1 & 0x3];
							}
						} else if (!local29[arg7 + 3 & 0x3]) {
							arg5[3] = Static405.aBooleanArrayArray38[local76][local518 + 1 & 0x3];
						}
					}
				}
			}
			if (arg11 - 1 > arg1) {
				local45 = arg0[arg1 + 1][arg9] & 0xFF;
				if (local45 > 0) {
					local58 = this.aClass148_6.method3342(local45 - 1);
					if (local58.anInt594 != -1) {
						local76 = arg10[arg1 + 1][arg9];
						local518 = arg12[arg1 + 1][arg9];
						if (local58.aBoolean30) {
							local97 = 4;
							local530 = local518 * 2 + 6;
							local535 = Static16.method326(arg4, local58);
							for (local537 = 0; local537 < 3; local537++) {
								local97 &= 0x7;
								local530 &= 0x7;
								if (Static293.aBooleanArrayArray25[local76][local530] && Static448.anIntArray626[local97] <= local58.anInt590) {
									Static444.anIntArray620[local97] = local58.anInt594;
									Static379.anIntArray547[local97] = local535;
									Static348.anIntArray391[local97] = arg4.method4465() ? local58.anInt600 : local58.anInt601;
									Static103.anIntArray189[local97] = local58.anInt595;
									if (Static448.anIntArray626[local97] == local58.anInt590) {
										Static325.anIntArray463[local97] |= 0x4;
									} else {
										Static325.anIntArray463[local97] = 4;
									}
									Static448.anIntArray626[local97] = local58.anInt590;
								}
								local530++;
								local97--;
							}
							if (!local29[arg7 + 1 & 0x3]) {
								arg5[1] = Static161.aBooleanArrayArray40[local76][local518 + 3 & 0x3];
							}
						} else if (!local29[arg7 + 1 & 0x3]) {
							arg5[1] = Static405.aBooleanArrayArray38[local76][local518 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg3 == null) {
			return;
		}
		@Pc(1239) int local1239 = Static16.method326(arg4, arg3);
		if (!arg3.aBoolean30) {
			return;
		}
		for (local45 = 0; local45 < 8; local45++) {
			@Pc(1255) int local1255 = local45 - arg7 * 2 & 0x7;
			if (Static293.aBooleanArrayArray25[arg8][local45] && Static448.anIntArray626[local1255] <= arg3.anInt590) {
				Static444.anIntArray620[local1255] = arg3.anInt594;
				Static379.anIntArray547[local1255] = local1239;
				Static348.anIntArray391[local1255] = arg4.method4465() ? arg3.anInt600 : arg3.anInt601;
				Static103.anIntArray189[local1255] = arg3.anInt595;
				if (Static448.anIntArray626[local1255] == arg3.anInt590) {
					Static325.anIntArray463[local1255] |= 0x2;
				} else {
					Static325.anIntArray463[local1255] = 2;
				}
				Static448.anIntArray626[local1255] = arg3.anInt590;
			}
		}
	}
}
