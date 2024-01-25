import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class313_Sub1 extends Class313 {

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "[[Lclient!bja;")
	private Class30[][] aClass30ArrayArray1;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "F")
	private float aFloat166;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "[[Lclient!hf;")
	private Class148[][] aClass148ArrayArray1;

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "F")
	private float aFloat167;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "F")
	private float aFloat168;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "F")
	private float aFloat169;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "F")
	private float aFloat170;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "F")
	private float aFloat171;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "F")
	private float aFloat172;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "[[Lclient!daa;")
	private Class61[][] aClass61ArrayArray1;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "F")
	private float aFloat173;

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "[[Lclient!ko;")
	private Class213[][] aClass213ArrayArray1;

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "F")
	private float aFloat174;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "F")
	private float aFloat175;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "[[Lclient!eg;")
	private Class89[][] aClass89ArrayArray1;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "F")
	private float aFloat176;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "F")
	private float aFloat177;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
	private int anInt9063 = -1;

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "Lclient!rea;")
	private final Class67_Sub3 aClass67_Sub3_8;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
	private final int anInt9062;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!rea;IIII[[I[[II)V")
	public Class313_Sub1(@OriginalArg(0) Class67_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass67_Sub3_8 = arg0;
		this.anInt9062 = arg2;
		this.aByteArrayArray17 = new byte[arg3 + 1][arg4 + 1];
		@Pc(29) int local29 = this.aClass67_Sub3_8.anInt9151 >> 9;
		for (@Pc(31) int local31 = 1; local31 < arg4; local31++) {
			for (@Pc(34) int local34 = 1; local34 < arg3; local34++) {
				@Pc(53) int local53 = arg6[local34 + 1][local31] - arg6[local34 - 1][local31];
				@Pc(69) int local69 = arg6[local34][local31 + 1] - arg6[local34][local31 - 1];
				@Pc(84) int local84 = (int) Math.sqrt((double) (local53 * local53 + arg7 * 512 + local69 * local69));
				@Pc(90) int local90 = (local53 << 8) / local84;
				@Pc(96) int local96 = arg7 * -512 / local84;
				@Pc(102) int local102 = (local69 << 8) / local84;
				@Pc(124) int local124 = local29 + (this.aClass67_Sub3_8.anInt9144 * local90 + this.aClass67_Sub3_8.anInt9156 * local96 + this.aClass67_Sub3_8.anInt9166 * local102 >> 17);
				local124 >>= 0x1;
				if (local124 < 2) {
					local124 = 2;
				} else if (local124 > 126) {
					local124 = 126;
				}
				this.aByteArrayArray17[local34][local31] = (byte) local124;
			}
		}
		this.aByteArrayArray16 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII[[ZLclient!th;Lclient!jp;[I[I)V")
	private void method7583(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class355 arg5, @OriginalArg(9) Class192 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean724;
		this.aClass67_Sub3_8.C(false);
		arg6.aBoolean462 = false;
		arg6.aBoolean465 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(89) int local89;
					@Pc(379) int local379;
					@Pc(384) int local384;
					@Pc(388) int local388;
					@Pc(392) int local392;
					@Pc(396) int local396;
					@Pc(400) int local400;
					@Pc(404) int local404;
					@Pc(408) int local408;
					@Pc(412) int local412;
					@Pc(416) int local416;
					@Pc(449) int local449;
					if (this.aClass89ArrayArray1 == null) {
						if (this.aClass30ArrayArray1[local32][local35] != null) {
							@Pc(593) Class30 local593 = this.aClass30ArrayArray1[local32][local35];
							for (local89 = 0; local89 < local593.aShort8; local89++) {
								arg7[local89] = local26 + local593.aShortArray20[local89] * 4 / super.anInt10871;
								arg8[local89] = local30 - local593.aShortArray21[local89] * 4 / super.anInt10871;
							}
							for (local379 = 0; local379 < local593.aShort7; local379++) {
								local384 = local379 * 3;
								local388 = local384 + 1;
								local392 = local388 + 1;
								local396 = arg7[local384];
								local400 = arg7[local388];
								local404 = arg7[local392];
								local408 = arg8[local384];
								local412 = arg8[local388];
								local416 = arg8[local392];
								if (local593.anIntArray59 == null || local593.anIntArray59[local379] == 0) {
									arg6.method4743((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local593.anIntArray58[local384], local593.anIntArray58[local388], local593.anIntArray58[local392]);
								} else {
									local449 = local593.anIntArray59[local379];
									arg6.method4743((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local449, local449, local449);
								}
							}
						}
					} else if (this.aClass89ArrayArray1[local32][local35] != null) {
						@Pc(67) Class89 local67 = this.aClass89ArrayArray1[local32][local35];
						if (local67.aShort27 != -1 && (local67.aByte43 & 0x2) == 0 && local67.anInt2662 == 0) {
							local89 = this.aClass67_Sub3_8.method7724(local67.aShort27);
							arg6.method4745((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static340.method4998(local67.anInt2663, local89), (float) Static340.method4998(local67.anInt2661, local89), (float) Static340.method4998(local67.anInt2660, local89));
							arg6.method4745((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static340.method4998(local67.anInt2659, local89), (float) Static340.method4998(local67.anInt2660, local89), (float) Static340.method4998(local67.anInt2661, local89));
						} else if (local67.anInt2662 == 0) {
							arg6.method4743((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, local67.anInt2663, local67.anInt2661, local67.anInt2660);
							arg6.method4743((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt2659, local67.anInt2660, local67.anInt2661);
						} else {
							local89 = local67.anInt2662;
							arg6.method4743((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, Static163.method2627(local67.anInt2663 & 0xFF000000, local89), Static163.method2627(local67.anInt2661 & 0xFF000000, local89), Static163.method2627(local67.anInt2660 & 0xFF000000, local89));
							arg6.method4743((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, Static163.method2627(local67.anInt2659 & 0xFF000000, local89), Static163.method2627(local67.anInt2660 & 0xFF000000, local89), Static163.method2627(local67.anInt2661 & 0xFF000000, local89));
						}
					} else if (this.aClass213ArrayArray1[local32][local35] != null) {
						@Pc(341) Class213 local341 = this.aClass213ArrayArray1[local32][local35];
						for (local89 = 0; local89 < local341.aShort75; local89++) {
							arg7[local89] = local26 + local341.aShortArray107[local89] * 4 / super.anInt10871;
							arg8[local89] = local30 - local341.aShortArray109[local89] * 4 / super.anInt10871;
						}
						for (local379 = 0; local379 < local341.aShort76; local379++) {
							local384 = local379 * 3;
							local388 = local384 + 1;
							local392 = local388 + 1;
							local396 = arg7[local384];
							local400 = arg7[local388];
							local404 = arg7[local392];
							local408 = arg8[local384];
							local412 = arg8[local388];
							local416 = arg8[local392];
							if (local341.anIntArray338 != null && local341.anIntArray338[local379] != 0 && (local341.aShortArray106 == null || local341.aShortArray106 != null && local341.aShortArray106[local379] == -1)) {
								local449 = local341.anIntArray338[local379];
								arg6.method4743((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, Static163.method2627(-(local341.anIntArray337[local384] & -16777216) - 16777216, local449), Static163.method2627(-(local341.anIntArray337[local388] & -16777216) - 16777216, local449), Static163.method2627(-(local341.anIntArray337[local392] & -16777216) - 16777216, local449));
							} else if (local341.aShortArray106 == null || local341.aShortArray106[local379] == -1) {
								arg6.method4743((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local341.anIntArray337[local384], local341.anIntArray337[local388], local341.anIntArray337[local392]);
							} else {
								local449 = this.aClass67_Sub3_8.method7724(local341.aShortArray106[local379]);
								arg6.method4745((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) local449, (float) local449, (float) local449);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean462 = true;
		this.aClass67_Sub3_8.C(local14);
	}

	@OriginalMember(owner = "client!ra", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		this.aByteArrayArray17 = null;
		this.aByteArrayArray16 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method9089(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class355 local4 = this.aClass67_Sub3_8.method7731(Thread.currentThread());
		@Pc(7) Class192 local7 = local4.aClass192_2;
		local7.anInt5577 = 0;
		local7.aBoolean463 = true;
		this.aClass67_Sub3_8.ya();
		if (this.aClass89ArrayArray1 != null || this.aClass30ArrayArray1 != null) {
			this.method7583(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray567, local4.anIntArray559);
		} else if (this.aClass148ArrayArray1 != null) {
			this.method7588(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray567, local4.anIntArray559);
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)V")
	private void method7584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class355 local4 = this.aClass67_Sub3_8.method7731(Thread.currentThread());
		local4.aClass192_2.anInt5577 = 0;
		if (this.aClass89ArrayArray1 != null) {
			this.method7590(arg0, arg1, local4.aBoolean723, local4, local4.aClass192_2, local4.anIntArray567, local4.anIntArray559, local4.anIntArray552, local4.anIntArray564, arg2);
		} else if (this.aClass148ArrayArray1 != null) {
			this.method7586(arg0, arg1, local4.aClass192_2, local4.anIntArray567, local4.anIntArray559, local4.anIntArray552, local4.anIntArray564, arg2);
		} else if (this.aClass30ArrayArray1 != null) {
			this.method7585(arg0, arg1, local4.aBoolean723, local4, local4.aClass192_2, local4.anIntArray567, local4.anIntArray559, local4.anIntArray552, local4.anIntArray564, arg2);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIZLclient!th;Lclient!jp;[I[I[I[II)V")
	private void method7585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class355 arg3, @OriginalArg(4) Class192 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class30 local6 = this.aClass30ArrayArray1[arg0][arg1];
		if (arg9 != 0 && (arg9 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		@Pc(52) int local52;
		@Pc(172) float local172;
		@Pc(193) float local193;
		@Pc(73) float local73;
		@Pc(26) int local26;
		@Pc(95) int local95;
		@Pc(115) int local115;
		if (this.anInt9063 == -1) {
			for (local26 = 0; local26 < local6.aShort8; local26++) {
				local37 = local6.aShortArray20[local26] + (arg0 << super.anInt10873);
				local42 = local6.aShortArray17[local26];
				local52 = local6.aShortArray21[local26] + (arg1 << super.anInt10873);
				local73 = this.aFloat174 + this.aFloat168 * (float) local37 + this.aFloat176 * (float) local42 + this.aFloat170 * (float) local52;
				if (local73 <= (float) this.aClass67_Sub3_8.anInt9149) {
					return;
				}
				arg8[local26] = 0;
				if (arg2) {
					local95 = (int) (local73 - (float) arg3.anInt9917);
					if (local95 > 255) {
						local95 = 255;
					}
					if (local95 > 0) {
						arg8[local26] = local95;
						local115 = local6.aShortArray22[local26] * local95 / 255;
						if (local115 > 0) {
							local42 -= local115;
						}
					}
				} else if (arg3.aBoolean722) {
					local95 = (int) (local73 - (float) arg3.anInt9917);
					if (local95 > 0) {
						arg8[local26] = local95;
						if (arg8[local26] > 255) {
							arg8[local26] = 255;
						}
					}
				}
				local172 = this.aFloat166 + this.aFloat173 * (float) local37 + this.aFloat169 * (float) local42 + this.aFloat171 * (float) local52;
				local193 = this.aFloat167 + this.aFloat172 * (float) local37 + this.aFloat177 * (float) local42 + this.aFloat175 * (float) local52;
				arg5[local26] = arg4.anInt5578 + (int) (local172 * (float) this.aClass67_Sub3_8.anInt9154 / local73);
				arg6[local26] = arg4.anInt5573 + (int) (local193 * (float) this.aClass67_Sub3_8.anInt9157 / local73);
				arg7[local26] = (int) local73;
			}
		} else {
			for (local26 = 0; local26 < local6.aShort8; local26++) {
				local37 = local6.aShortArray20[local26] + (arg0 << super.anInt10873);
				local42 = local6.aShortArray17[local26];
				local52 = local6.aShortArray21[local26] + (arg1 << super.anInt10873);
				local73 = this.aFloat174 + this.aFloat168 * (float) local37 + this.aFloat176 * (float) local42 + this.aFloat170 * (float) local52;
				arg8[local26] = 0;
				if (arg2) {
					local95 = this.anInt9063 - arg3.anInt9917;
					if (local95 > 255) {
						local95 = 255;
					}
					if (local95 > 0) {
						arg8[local26] = local95;
						local115 = local6.aShortArray22[local26] * local95 / 255;
						if (local115 > 0) {
							local42 -= local115;
						}
					}
				} else if (arg3.aBoolean722) {
					local95 = this.anInt9063 - arg3.anInt9917;
					if (local95 > 0) {
						arg8[local26] = local95;
						if (arg8[local26] > 255) {
							arg8[local26] = 255;
						}
					}
				}
				local172 = this.aFloat166 + this.aFloat173 * (float) local37 + this.aFloat169 * (float) local42 + this.aFloat171 * (float) local52;
				local193 = this.aFloat167 + this.aFloat172 * (float) local37 + this.aFloat177 * (float) local42 + this.aFloat175 * (float) local52;
				arg5[local26] = arg4.anInt5578 + (int) (local172 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
				arg6[local26] = arg4.anInt5573 + (int) (local193 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
				arg7[local26] = (int) local73;
			}
		}
		@Pc(441) float local441 = (float) super.anInt10871;
		for (local95 = 0; local95 < local6.aShort7; local95++) {
			local115 = local95 * 3;
			@Pc(452) int local452 = local115 + 1;
			@Pc(456) int local456 = local452 + 1;
			@Pc(460) int local460 = arg5[local115];
			@Pc(464) int local464 = arg5[local452];
			@Pc(468) int local468 = arg5[local456];
			@Pc(472) int local472 = arg6[local115];
			@Pc(476) int local476 = arg6[local452];
			@Pc(480) int local480 = arg6[local456];
			if ((local460 - local464) * (local480 - local476) - (local472 - local476) * (local468 - local464) > 0) {
				arg4.aBoolean463 = local460 < 0 || local464 < 0 || local468 < 0 || local460 > arg4.anInt5575 || local464 > arg4.anInt5575 || local468 > arg4.anInt5575;
				if (arg8[local115] + arg8[local452] + arg8[local456] < 765) {
					@Pc(550) int local550 = arg0 << super.anInt10873;
					@Pc(555) int local555 = arg1 << super.anInt10873;
					if ((local6.anIntArray58[local115] & 0xFFFFFF) != 0) {
						if (local6.aShortArray19[local115] == local6.aShortArray19[local452] && local6.aShortArray19[local115] == local6.aShortArray19[local456] && local6.aShortArray18[local115] == local6.aShortArray18[local452] && local6.aShortArray18[local115] == local6.aShortArray18[local456]) {
							arg4.method4731((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], (float) (local550 + local6.aShortArray20[local115]) / (float) local6.aShortArray18[local115], (float) (local550 + local6.aShortArray20[local452]) / (float) local6.aShortArray18[local452], (float) (local550 + local6.aShortArray20[local456]) / (float) local6.aShortArray18[local456], (float) (local555 + local6.aShortArray21[local115]) / (float) local6.aShortArray18[local115], (float) (local555 + local6.aShortArray21[local452]) / (float) local6.aShortArray18[local452], (float) (local555 + local6.aShortArray21[local456]) / (float) local6.aShortArray18[local456], local6.anIntArray58[local115], local6.anIntArray58[local452], local6.anIntArray58[local456], arg3.anInt9925, arg8[local115], arg8[local452], arg8[local456], local6.aShortArray19[local115]);
						} else {
							arg4.method4730((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], (float) (local550 + local6.aShortArray20[local115]) / local441, (float) (local550 + local6.aShortArray20[local452]) / local441, (float) (local550 + local6.aShortArray20[local456]) / local441, (float) (local555 + local6.aShortArray21[local115]) / local441, (float) (local555 + local6.aShortArray21[local452]) / local441, (float) (local555 + local6.aShortArray21[local456]) / local441, local6.anIntArray58[local115], local6.anIntArray58[local452], local6.anIntArray58[local456], arg3.anInt9925, arg8[local115], arg8[local452], arg8[local456], local6.aShortArray19[local115], local441 / (float) local6.aShortArray18[local115], local6.aShortArray19[local452], local441 / (float) local6.aShortArray18[local452], local6.aShortArray19[local456], local441 / (float) local6.aShortArray18[local456]);
						}
					}
				} else {
					arg4.method4738((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], arg3.anInt9925);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!jp;[I[I[I[II)V")
	private void method7586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class192 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7) {
		@Pc(6) Class148 local6 = this.aClass148ArrayArray1[arg0][arg1];
		@Pc(50) int local50;
		@Pc(60) int local60;
		@Pc(480) int local480;
		@Pc(510) int local510;
		if (local6 == null) {
			@Pc(2204) Class61 local2204 = this.aClass61ArrayArray1[arg0][arg1];
			if (local2204 != null) {
				if (arg7 != 0) {
					if ((local2204.aByte29 & 0x4) == 0) {
						if ((arg7 & 0x2) != 0) {
							return;
						}
					} else if ((arg7 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2253) short local2253;
				@Pc(2314) float local2314;
				@Pc(2335) float local2335;
				@Pc(2284) float local2284;
				if (this.anInt9063 == -1) {
					for (local480 = 0; local480 < local2204.aShort14; local480++) {
						local50 = local2204.aShortArray33[local480] + (arg0 << super.anInt10873);
						local2253 = local2204.aShortArray27[local480];
						local60 = local2204.aShortArray28[local480] + (arg1 << super.anInt10873);
						local2284 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local2253 + this.aFloat170 * (float) local60;
						if (local2284 <= (float) this.aClass67_Sub3_8.anInt9149) {
							return;
						}
						local2314 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local2253 + this.aFloat171 * (float) local60;
						local2335 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local2253 + this.aFloat175 * (float) local60;
						arg3[local480] = arg2.anInt5578 + (int) (local2314 * (float) this.aClass67_Sub3_8.anInt9154 / local2284);
						arg4[local480] = arg2.anInt5573 + (int) (local2335 * (float) this.aClass67_Sub3_8.anInt9157 / local2284);
						arg5[local480] = (int) local2284;
					}
				} else {
					for (local480 = 0; local480 < local2204.aShort14; local480++) {
						local50 = local2204.aShortArray33[local480] + (arg0 << super.anInt10873);
						local2253 = local2204.aShortArray27[local480];
						local60 = local2204.aShortArray28[local480] + (arg1 << super.anInt10873);
						local2284 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local2253 + this.aFloat170 * (float) local60;
						local2314 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local2253 + this.aFloat171 * (float) local60;
						local2335 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local2253 + this.aFloat175 * (float) local60;
						arg3[local480] = arg2.anInt5578 + (int) (local2314 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
						arg4[local480] = arg2.anInt5573 + (int) (local2335 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
						arg5[local480] = (int) local2284;
					}
				}
				@Pc(2531) short local2531;
				@Pc(2536) short local2536;
				@Pc(2541) short local2541;
				@Pc(2549) int local2549;
				@Pc(2553) int local2553;
				@Pc(2557) int local2557;
				@Pc(2561) int local2561;
				@Pc(2565) int local2565;
				if (local2204.aShortArray31 != null) {
					@Pc(2753) int local2753;
					@Pc(2622) short local2622;
					if (this.anInt9063 == -1) {
						for (local480 = 0; local480 < local2204.aShort13; local480++) {
							local2531 = local2204.aShortArray34[local480];
							local2536 = local2204.aShortArray26[local480];
							local2541 = local2204.aShortArray32[local480];
							local510 = arg3[local2531];
							local2549 = arg3[local2536];
							local2553 = arg3[local2541];
							local2557 = arg4[local2531];
							local2561 = arg4[local2536];
							local2565 = arg4[local2541];
							if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
								arg2.aBoolean463 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt5575 || local2549 > arg2.anInt5575 || local2553 > arg2.anInt5575;
								local2622 = local2204.aShortArray31[local480];
								if (local2622 == -1) {
									local2753 = local2204.anIntArray93[local480];
									if (local2753 != -1) {
										arg2.method4745((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static340.method4998(local2204.aShortArray29[local2531], local2753), (float) Static340.method4998(local2204.aShortArray29[local2536], local2753), (float) Static340.method4998(local2204.aShortArray29[local2541], local2753));
									}
								} else {
									arg2.method4731((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) local2204.aShortArray33[local2531] / (float) super.anInt10871, (float) local2204.aShortArray33[local2536] / (float) super.anInt10871, (float) local2204.aShortArray33[local2541] / (float) super.anInt10871, (float) local2204.aShortArray28[local2531] / (float) super.anInt10871, (float) local2204.aShortArray28[local2536] / (float) super.anInt10871, (float) local2204.aShortArray28[local2541] / (float) super.anInt10871, Static179.anIntArray162[local2204.aShortArray29[local2531] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local2204.aShortArray29[local2536] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local2204.aShortArray29[local2541] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2622);
								}
							}
						}
						return;
					}
					for (local480 = 0; local480 < local2204.aShort13; local480++) {
						local2531 = local2204.aShortArray34[local480];
						local2536 = local2204.aShortArray26[local480];
						local2541 = local2204.aShortArray32[local480];
						local510 = arg3[local2531];
						local2549 = arg3[local2536];
						local2553 = arg3[local2541];
						local2557 = arg4[local2531];
						local2561 = arg4[local2536];
						local2565 = arg4[local2541];
						if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
							arg2.aBoolean463 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt5575 || local2549 > arg2.anInt5575 || local2553 > arg2.anInt5575;
							local2622 = local2204.aShortArray31[local480];
							if (local2622 == -1) {
								local2753 = local2204.anIntArray93[local480];
								if (local2753 != -1) {
									arg2.method4745((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static340.method4998(local2204.aShortArray29[local2531], local2753), (float) Static340.method4998(local2204.aShortArray29[local2536], local2753), (float) Static340.method4998(local2204.aShortArray29[local2541], local2753));
								}
							} else {
								arg2.method4731((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) local2204.aShortArray33[local2531] / (float) super.anInt10871, (float) local2204.aShortArray33[local2536] / (float) super.anInt10871, (float) local2204.aShortArray33[local2541] / (float) super.anInt10871, (float) local2204.aShortArray28[local2531] / (float) super.anInt10871, (float) local2204.aShortArray28[local2536] / (float) super.anInt10871, (float) local2204.aShortArray28[local2541] / (float) super.anInt10871, Static179.anIntArray162[local2204.aShortArray29[local2531] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local2204.aShortArray29[local2536] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local2204.aShortArray29[local2541] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2622);
							}
						}
					}
					return;
				}
				for (local480 = 0; local480 < local2204.aShort13; local480++) {
					local2531 = local2204.aShortArray34[local480];
					local2536 = local2204.aShortArray26[local480];
					local2541 = local2204.aShortArray32[local480];
					local510 = arg3[local2531];
					local2549 = arg3[local2536];
					local2553 = arg3[local2541];
					local2557 = arg4[local2531];
					local2561 = arg4[local2536];
					local2565 = arg4[local2541];
					if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
						@Pc(3170) int local3170 = local2204.anIntArray93[local480];
						if (local3170 != -1) {
							arg2.aBoolean463 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt5575 || local2549 > arg2.anInt5575 || local2553 > arg2.anInt5575;
							arg2.method4745((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static340.method4998(local2204.aShortArray29[local2531], local3170), (float) Static340.method4998(local2204.aShortArray29[local2536], local3170), (float) Static340.method4998(local2204.aShortArray29[local2541], local3170));
						}
					}
				}
			}
		} else if ((local6.aByte83 & 0x2) == 0) {
			if (arg7 != 0) {
				if ((local6.aByte83 & 0x4) == 0) {
					if ((arg7 & 0x2) != 0) {
						return;
					}
				} else if ((arg7 & 0x1) != 0) {
					return;
				}
			}
			@Pc(45) int local45 = arg0 * super.anInt10871;
			local50 = local45 + super.anInt10871;
			@Pc(55) int local55 = arg1 * super.anInt10871;
			local60 = local55 + super.anInt10871;
			@Pc(497) float local497;
			@Pc(99) float local99;
			@Pc(125) float local125;
			@Pc(151) float local151;
			@Pc(177) float local177;
			@Pc(72) int local72;
			@Pc(300) int local300;
			@Pc(360) int local360;
			@Pc(420) int local420;
			@Pc(330) int local330;
			@Pc(390) int local390;
			@Pc(450) int local450;
			@Pc(287) float local287;
			@Pc(347) float local347;
			@Pc(407) float local407;
			@Pc(467) float local467;
			@Pc(317) float local317;
			@Pc(377) float local377;
			@Pc(437) float local437;
			if ((local6.aByte83 & 0x1) == 0) {
				local72 = super.anIntArrayArray60[arg0][arg1];
				@Pc(784) int local784 = super.anIntArrayArray60[arg0 + 1][arg1];
				@Pc(795) int local795 = super.anIntArrayArray60[arg0 + 1][arg1 + 1];
				@Pc(804) int local804 = super.anIntArrayArray60[arg0][arg1 + 1];
				if (this.anInt9063 == -1) {
					local99 = this.aFloat174 + this.aFloat168 * (float) local45 + this.aFloat176 * (float) local72 + this.aFloat170 * (float) local55;
					if (local99 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local125 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local784 + this.aFloat170 * (float) local55;
					if (local125 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local151 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local795 + this.aFloat170 * (float) local60;
					if (local151 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local177 = this.aFloat174 + this.aFloat168 * (float) local45 + this.aFloat176 * (float) local804 + this.aFloat170 * (float) local60;
					if (local177 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local287 = this.aFloat166 + this.aFloat173 * (float) local45 + this.aFloat169 * (float) local72 + this.aFloat171 * (float) local55;
					local300 = arg2.anInt5578 + (int) (local287 * (float) this.aClass67_Sub3_8.anInt9154 / local99);
					local317 = this.aFloat167 + this.aFloat172 * (float) local45 + this.aFloat177 * (float) local72 + this.aFloat175 * (float) local55;
					local330 = arg2.anInt5573 + (int) (local317 * (float) this.aClass67_Sub3_8.anInt9157 / local99);
					local347 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local784 + this.aFloat171 * (float) local55;
					local360 = arg2.anInt5578 + (int) (local347 * (float) this.aClass67_Sub3_8.anInt9154 / local125);
					local377 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local784 + this.aFloat175 * (float) local55;
					local390 = arg2.anInt5573 + (int) (local377 * (float) this.aClass67_Sub3_8.anInt9157 / local125);
					local407 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local795 + this.aFloat171 * (float) local60;
					local420 = arg2.anInt5578 + (int) (local407 * (float) this.aClass67_Sub3_8.anInt9154 / local151);
					local437 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local795 + this.aFloat175 * (float) local60;
					local450 = arg2.anInt5573 + (int) (local437 * (float) this.aClass67_Sub3_8.anInt9157 / local151);
					local467 = this.aFloat166 + this.aFloat173 * (float) local45 + this.aFloat169 * (float) local804 + this.aFloat171 * (float) local60;
					local480 = arg2.anInt5578 + (int) (local467 * (float) this.aClass67_Sub3_8.anInt9154 / local177);
					local497 = this.aFloat167 + this.aFloat172 * (float) local45 + this.aFloat177 * (float) local804 + this.aFloat175 * (float) local60;
					local510 = arg2.anInt5573 + (int) (local497 * (float) this.aClass67_Sub3_8.anInt9157 / local177);
				} else {
					local99 = this.aFloat174 + this.aFloat168 * (float) local45 + this.aFloat176 * (float) local72 + this.aFloat170 * (float) local55;
					local125 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local784 + this.aFloat170 * (float) local55;
					local151 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local795 + this.aFloat170 * (float) local60;
					local177 = this.aFloat174 + this.aFloat168 * (float) local45 + this.aFloat176 * (float) local804 + this.aFloat170 * (float) local60;
					local287 = this.aFloat166 + this.aFloat173 * (float) local45 + this.aFloat169 * (float) local72 + this.aFloat171 * (float) local55;
					local300 = arg2.anInt5578 + (int) (local287 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local317 = this.aFloat167 + this.aFloat172 * (float) local45 + this.aFloat177 * (float) local72 + this.aFloat175 * (float) local55;
					local330 = arg2.anInt5573 + (int) (local317 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local347 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local784 + this.aFloat171 * (float) local55;
					local360 = arg2.anInt5578 + (int) (local347 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local377 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local784 + this.aFloat175 * (float) local55;
					local390 = arg2.anInt5573 + (int) (local377 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local407 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local795 + this.aFloat171 * (float) local60;
					local420 = arg2.anInt5578 + (int) (local407 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local437 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local795 + this.aFloat175 * (float) local60;
					local450 = arg2.anInt5573 + (int) (local437 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local467 = this.aFloat166 + this.aFloat173 * (float) local45 + this.aFloat169 * (float) local804 + this.aFloat171 * (float) local60;
					local480 = arg2.anInt5578 + (int) (local467 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local497 = this.aFloat167 + this.aFloat172 * (float) local45 + this.aFloat177 * (float) local804 + this.aFloat175 * (float) local60;
					local510 = arg2.anInt5573 + (int) (local497 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
				}
			} else {
				local72 = super.anIntArrayArray60[arg0][arg1];
				@Pc(78) float local78 = this.aFloat176 * (float) local72;
				if (this.anInt9063 == -1) {
					local99 = this.aFloat174 + this.aFloat168 * (float) local45 + local78 + this.aFloat170 * (float) local55;
					if (local99 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local125 = this.aFloat174 + this.aFloat168 * (float) local50 + local78 + this.aFloat170 * (float) local55;
					if (local125 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local151 = this.aFloat174 + this.aFloat168 * (float) local50 + local78 + this.aFloat170 * (float) local60;
					if (local151 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local177 = this.aFloat174 + this.aFloat168 * (float) local45 + local78 + this.aFloat170 * (float) local60;
					if (local177 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
				} else {
					local99 = this.aFloat174 + this.aFloat168 * (float) local45 + local78 + this.aFloat170 * (float) local55;
					local125 = this.aFloat174 + this.aFloat168 * (float) local50 + local78 + this.aFloat170 * (float) local55;
					local151 = this.aFloat174 + this.aFloat168 * (float) local50 + local78 + this.aFloat170 * (float) local60;
					local177 = this.aFloat174 + this.aFloat168 * (float) local45 + local78 + this.aFloat170 * (float) local60;
				}
				@Pc(260) float local260 = this.aFloat169 * (float) local72;
				@Pc(266) float local266 = this.aFloat177 * (float) local72;
				if (this.anInt9063 == -1) {
					local287 = this.aFloat166 + this.aFloat173 * (float) local45 + local260 + this.aFloat171 * (float) local55;
					local300 = arg2.anInt5578 + (int) (local287 * (float) this.aClass67_Sub3_8.anInt9154 / local99);
					local317 = this.aFloat167 + this.aFloat172 * (float) local45 + local266 + this.aFloat175 * (float) local55;
					local330 = arg2.anInt5573 + (int) (local317 * (float) this.aClass67_Sub3_8.anInt9157 / local99);
					local347 = this.aFloat166 + this.aFloat173 * (float) local50 + local260 + this.aFloat171 * (float) local55;
					local360 = arg2.anInt5578 + (int) (local347 * (float) this.aClass67_Sub3_8.anInt9154 / local125);
					local377 = this.aFloat167 + this.aFloat172 * (float) local50 + local266 + this.aFloat175 * (float) local55;
					local390 = arg2.anInt5573 + (int) (local377 * (float) this.aClass67_Sub3_8.anInt9157 / local125);
					local407 = this.aFloat166 + this.aFloat173 * (float) local50 + local260 + this.aFloat171 * (float) local60;
					local420 = arg2.anInt5578 + (int) (local407 * (float) this.aClass67_Sub3_8.anInt9154 / local151);
					local437 = this.aFloat167 + this.aFloat172 * (float) local50 + local266 + this.aFloat175 * (float) local60;
					local450 = arg2.anInt5573 + (int) (local437 * (float) this.aClass67_Sub3_8.anInt9157 / local151);
					local467 = this.aFloat166 + this.aFloat173 * (float) local45 + local260 + this.aFloat171 * (float) local60;
					local480 = arg2.anInt5578 + (int) (local467 * (float) this.aClass67_Sub3_8.anInt9154 / local177);
					local497 = this.aFloat167 + this.aFloat172 * (float) local45 + local266 + this.aFloat175 * (float) local60;
					local510 = arg2.anInt5573 + (int) (local497 * (float) this.aClass67_Sub3_8.anInt9157 / local177);
				} else {
					local287 = this.aFloat166 + this.aFloat173 * (float) local45 + local260 + this.aFloat171 * (float) local55;
					local300 = arg2.anInt5578 + (int) (local287 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local317 = this.aFloat167 + this.aFloat172 * (float) local45 + local266 + this.aFloat175 * (float) local55;
					local330 = arg2.anInt5573 + (int) (local317 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local347 = this.aFloat166 + this.aFloat173 * (float) local50 + local260 + this.aFloat171 * (float) local55;
					local360 = arg2.anInt5578 + (int) (local347 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local377 = this.aFloat167 + this.aFloat172 * (float) local50 + local266 + this.aFloat175 * (float) local55;
					local390 = arg2.anInt5573 + (int) (local377 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local407 = this.aFloat166 + this.aFloat173 * (float) local50 + local260 + this.aFloat171 * (float) local60;
					local420 = arg2.anInt5578 + (int) (local407 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local437 = this.aFloat167 + this.aFloat172 * (float) local50 + local266 + this.aFloat175 * (float) local60;
					local450 = arg2.anInt5573 + (int) (local437 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local467 = this.aFloat166 + this.aFloat173 * (float) local45 + local260 + this.aFloat171 * (float) local60;
					local480 = arg2.anInt5578 + (int) (local467 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local497 = this.aFloat167 + this.aFloat172 * (float) local45 + local266 + this.aFloat175 * (float) local60;
					local510 = arg2.anInt5573 + (int) (local497 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
				}
			}
			if (this.anInt9063 == -1) {
				if ((local420 - local480) * (local390 - local510) - (local450 - local510) * (local360 - local480) > 0) {
					arg2.aBoolean463 = local420 < 0 || local480 < 0 || local360 < 0 || local420 > arg2.anInt5575 || local480 > arg2.anInt5575 || local360 > arg2.anInt5575;
					if (local6.aShort57 >= 0) {
						arg2.method4731((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, local151, local177, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static179.anIntArray162[local6.aShort55 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local6.aShort59 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local6.aShort58 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort57);
					} else {
						arg2.method4745((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, (float) (int) local151, (float) (int) local177, (float) (int) local125, (float) (local6.aShort55 & 0xFFFF), (float) (local6.aShort59 & 0xFFFF), (float) (local6.aShort58 & 0xFFFF));
					}
				}
				if ((local300 - local360) * (local510 - local390) - (local330 - local390) * (local480 - local360) > 0) {
					arg2.aBoolean463 = local300 < 0 || local360 < 0 || local480 < 0 || local300 > arg2.anInt5575 || local360 > arg2.anInt5575 || local480 > arg2.anInt5575;
					if (local6.aShort57 >= 0) {
						arg2.method4731((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, local99, local125, local177, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static179.anIntArray162[local6.aShort56 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local6.aShort58 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local6.aShort59 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort57);
						return;
					}
					arg2.method4745((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, (float) (int) local99, (float) (int) local125, (float) (int) local177, (float) (local6.aShort56 & 0xFFFF), (float) (local6.aShort58 & 0xFFFF), (float) (local6.aShort59 & 0xFFFF));
					return;
				}
			} else {
				if ((local420 - local480) * (local390 - local510) - (local450 - local510) * (local360 - local480) > 0) {
					arg2.aBoolean463 = local420 < 0 || local480 < 0 || local360 < 0 || local420 > arg2.anInt5575 || local480 > arg2.anInt5575 || local360 > arg2.anInt5575;
					if (local6.aShort57 >= 0) {
						arg2.method4731((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, local151, local177, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static179.anIntArray162[local6.aShort55 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local6.aShort59 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local6.aShort58 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort57);
					} else {
						arg2.method4745((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, (float) (int) local151, (float) (int) local177, (float) (int) local125, (float) (local6.aShort55 & 0xFFFF), (float) (local6.aShort59 & 0xFFFF), (float) (local6.aShort58 & 0xFFFF));
					}
				}
				if ((local300 - local360) * (local510 - local390) - (local330 - local390) * (local480 - local360) > 0) {
					arg2.aBoolean463 = local300 < 0 || local360 < 0 || local480 < 0 || local300 > arg2.anInt5575 || local360 > arg2.anInt5575 || local480 > arg2.anInt5575;
					if (local6.aShort57 >= 0) {
						arg2.method4731((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, local99, local125, local177, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static179.anIntArray162[local6.aShort56 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local6.aShort58 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static179.anIntArray162[local6.aShort59 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort57);
						return;
					}
					arg2.method4745((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, (float) (int) local99, (float) (int) local125, (float) (int) local177, (float) (local6.aShort56 & 0xFFFF), (float) (local6.aShort58 & 0xFFFF), (float) (local6.aShort59 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	@Override
	public void method9090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method7584(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method9087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class181_Sub3 local3 = this.aClass67_Sub3_8.aClass181_Sub3_2;
		this.anInt9063 = -1;
		this.aFloat173 = local3.aFloat145;
		this.aFloat169 = local3.aFloat143;
		this.aFloat171 = local3.aFloat153;
		this.aFloat166 = local3.aFloat150;
		this.aFloat172 = local3.aFloat144;
		this.aFloat177 = local3.aFloat149;
		this.aFloat175 = local3.aFloat151;
		this.aFloat167 = local3.aFloat146;
		this.aFloat168 = local3.aFloat147;
		this.aFloat176 = local3.aFloat154;
		this.aFloat170 = local3.aFloat152;
		this.aFloat174 = local3.aFloat148;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt10875 && local78 >= 0 && local78 < super.anInt10872) {
						this.method7584(local72, local78, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method9092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class181_Sub3 local3 = this.aClass67_Sub3_8.aClass181_Sub3_2;
		this.anInt9063 = arg5;
		this.aFloat173 = local3.aFloat145;
		this.aFloat169 = local3.aFloat143;
		this.aFloat171 = local3.aFloat153;
		this.aFloat166 = local3.aFloat150;
		this.aFloat172 = local3.aFloat144;
		this.aFloat177 = local3.aFloat149;
		this.aFloat175 = local3.aFloat151;
		this.aFloat167 = local3.aFloat146;
		this.aFloat168 = local3.aFloat147;
		this.aFloat176 = local3.aFloat154;
		this.aFloat170 = local3.aFloat152;
		this.aFloat174 = local3.aFloat148;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt10875 && local78 >= 0 && local78 < super.anInt10872) {
						this.method7584(local72, local78, arg6);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method9088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass148ArrayArray1 == null) {
			this.aClass148ArrayArray1 = new Class148[super.anInt10875][super.anInt10872];
			this.aClass61ArrayArray1 = new Class61[super.anInt10875][super.anInt10872];
		} else if (this.aClass89ArrayArray1 != null || this.aClass30ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(33) boolean local33 = false;
		@Pc(79) int local79;
		@Pc(85) int local85;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local33 = true;
			for (@Pc(72) int local72 = 1; local72 < 2; local72++) {
				local79 = arg2[arg6[local72]];
				local85 = arg4[arg6[local72]];
				if (local79 != 0 && local79 != super.anInt10871 || local85 != 0 && local85 != super.anInt10871) {
					local33 = false;
					break;
				}
			}
		}
		if (!local33) {
			@Pc(118) Class61 local118 = new Class61();
			@Pc(122) short local122 = (short) arg2.length;
			@Pc(126) short local126 = (short) arg9.length;
			local118.aShort14 = local122;
			local118.aShortArray29 = new short[local122];
			local118.aShortArray33 = new short[local122];
			local118.aShortArray27 = new short[local122];
			local118.aShortArray28 = new short[local122];
			@Pc(156) int local156;
			@Pc(323) int local323;
			@Pc(370) int local370;
			for (@Pc(147) int local147 = 0; local147 < local122; local147++) {
				@Pc(152) int local152 = arg2[local147];
				local156 = arg4[local147];
				if (local152 == 0 && local156 == 0) {
					local118.aShortArray29[local147] = (short) (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				} else if (local152 == 0 && local156 == super.anInt10871) {
					local118.aShortArray29[local147] = (short) (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				} else if (local152 == super.anInt10871 && local156 == super.anInt10871) {
					local118.aShortArray29[local147] = (short) (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				} else if (local152 == super.anInt10871 && local156 == 0) {
					local118.aShortArray29[local147] = (short) (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				} else {
					local323 = (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (super.anInt10871 - local152) + (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local152;
					local370 = (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (super.anInt10871 - local152) + (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local152;
					local118.aShortArray29[local147] = (short) (local323 * (super.anInt10871 - local156) + local370 * local156 >> super.anInt10873 * 2);
				}
				local323 = (arg0 << super.anInt10873) + local152;
				local370 = (arg1 << super.anInt10873) + local156;
				local118.aShortArray33[local147] = (short) local152;
				local118.aShortArray28[local147] = (short) local156;
				local118.aShortArray27[local147] = (short) (this.method9096(local323, local370) + (arg3 == null ? 0 : arg3[local147]));
				if (local118.aShortArray29[local147] < 2) {
					local118.aShortArray29[local147] = 2;
				}
			}
			@Pc(454) boolean local454 = false;
			local156 = 0;
			for (local323 = 0; local323 < local126; local323++) {
				if (arg9[local323] >= 0 || arg10 != null && arg10[local323] >= 0) {
					local156++;
				}
				local370 = arg11[local323];
				if (local370 != -1) {
					@Pc(490) Class32 local490 = this.aClass67_Sub3_8.anInterface2_11.method1027(local370);
					if (!local490.aBoolean67) {
						local454 = true;
						if (this.method7589(local490.aByte25) || local490.aByte22 != 0 || local490.aByte23 != 0) {
							local118.aByte29 = (byte) (local118.aByte29 | 0x4);
						}
					}
				}
			}
			local118.anIntArray93 = new int[local156];
			if (arg10 != null) {
				local118.anIntArray94 = new int[local156];
			}
			local118.aShortArray34 = new short[local156];
			local118.aShortArray26 = new short[local156];
			local118.aShortArray32 = new short[local156];
			if (local454) {
				local118.aShortArray31 = new short[local156];
				local118.aShortArray30 = new short[local156];
			}
			for (local370 = 0; local370 < local126; local370++) {
				if (arg9[local370] >= 0 || arg10 != null && arg10[local370] >= 0) {
					if (arg9[local370] >= 0) {
						local118.anIntArray93[local118.aShort13] = Static702.method9174(arg9[local370]);
					} else {
						local118.anIntArray93[local118.aShort13] = -1;
					}
					if (arg10 != null) {
						if (arg10[local370] == -1) {
							local118.anIntArray94[local118.aShort13] = -1;
						} else {
							local118.anIntArray94[local118.aShort13] = Static702.method9174(arg10[local370]);
						}
					}
					local118.aShortArray34[local118.aShort13] = (short) arg6[local370];
					local118.aShortArray26[local118.aShort13] = (short) arg7[local370];
					local118.aShortArray32[local118.aShort13] = (short) arg8[local370];
					if (local454) {
						if (arg11[local370] == -1 || this.aClass67_Sub3_8.anInterface2_11.method1027(arg11[local370]).aBoolean67) {
							local118.aShortArray31[local118.aShort13] = -1;
						} else {
							local118.aShortArray31[local118.aShort13] = (short) arg11[local370];
							local118.aShortArray30[local118.aShort13] = (short) arg12[local370];
						}
					}
					local118.aShort13++;
				}
			}
			this.aClass61ArrayArray1[arg0][arg1] = local118;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(741) Class148 local741 = new Class148();
			local79 = arg9[0];
			local85 = arg11[0];
			if (arg10 != null) {
				local741.anInt4476 = Static340.method4998(this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1], Static702.method9174(arg10[0]));
				if (local79 == -1) {
					local741.aByte83 = (byte) (local741.aByte83 | 0x2);
				}
			}
			if (super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0 + 1][arg1] && super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0 + 1][arg1 + 1] && super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0][arg1 + 1]) {
				local741.aByte83 = (byte) (local741.aByte83 | 0x1);
			}
			@Pc(849) Class32 local849 = null;
			if (local85 != -1) {
				local849 = this.aClass67_Sub3_8.anInterface2_11.method1027(local85);
			}
			if (local849 == null || (local741.aByte83 & 0x2) != 0 || local849.aBoolean67) {
				@Pc(987) short local987 = Static702.method9174(local79);
				local741.aShort56 = (short) Static340.method4998(this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1], local987);
				local741.aShort58 = (short) Static340.method4998(this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1], local987);
				local741.aShort55 = (short) Static340.method4998(this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1], local987);
				local741.aShort59 = (short) Static340.method4998(this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1], local987);
				local741.aShort57 = -1;
			} else {
				local741.aShort56 = (short) (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				local741.aShort58 = (short) (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				local741.aShort55 = (short) (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				local741.aShort59 = (short) (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				local741.aShort57 = (short) local85;
				if (this.method7589(local849.aByte25) || local849.aByte22 != 0 || local849.aByte23 != 0) {
					local741.aByte83 = (byte) (local741.aByte83 | 0x4);
				}
			}
			this.aClass148ArrayArray1[arg0][arg1] = local741;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIIIIII[[ZLclient!th;Lclient!jp;[I[I)V")
	private void method7588(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class355 arg5, @OriginalArg(9) Class192 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean724;
		this.aClass67_Sub3_8.C(false);
		arg6.aBoolean462 = false;
		arg6.aBoolean465 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(85) int local85;
					if (this.aClass148ArrayArray1[local32][local35] != null) {
						@Pc(62) Class148 local62 = this.aClass148ArrayArray1[local32][local35];
						if (local62.aShort57 != -1 && (local62.aByte83 & 0x2) == 0 && local62.anInt4476 == -1) {
							local85 = this.aClass67_Sub3_8.method7724(local62.aShort57);
							arg6.method4745((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static340.method4998(local62.aShort55 & 0xFFFF, local85), (float) Static340.method4998(local62.aShort59 & 0xFFFF, local85), (float) Static340.method4998(local62.aShort58 & 0xFFFF, local85));
							arg6.method4745((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static340.method4998(local62.aShort56 & 0xFFFF, local85), (float) Static340.method4998(local62.aShort58 & 0xFFFF, local85), (float) Static340.method4998(local62.aShort59 & 0xFFFF, local85));
						} else if (local62.anInt4476 == -1) {
							arg6.method4745((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) (local62.aShort55 & 0xFFFF), (float) (local62.aShort59 & 0xFFFF), (float) (local62.aShort58 & 0xFFFF));
							arg6.method4745((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local62.aShort56 & 0xFFFF), (float) (local62.aShort58 & 0xFFFF), (float) (local62.aShort59 & 0xFFFF));
						} else {
							local85 = local62.anInt4476;
							arg6.method4745((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg6.method4745((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass61ArrayArray1[local32][local35] != null) {
						@Pc(338) Class61 local338 = this.aClass61ArrayArray1[local32][local35];
						for (local85 = 0; local85 < local338.aShort14; local85++) {
							arg7[local85] = local26 + local338.aShortArray33[local85] * 4 / super.anInt10871;
							arg8[local85] = local30 - local338.aShortArray28[local85] * 4 / super.anInt10871;
						}
						for (@Pc(376) int local376 = 0; local376 < local338.aShort13; local376++) {
							@Pc(382) short local382 = local338.aShortArray34[local376];
							@Pc(387) short local387 = local338.aShortArray26[local376];
							@Pc(392) short local392 = local338.aShortArray32[local376];
							@Pc(396) int local396 = arg7[local382];
							@Pc(400) int local400 = arg7[local387];
							@Pc(404) int local404 = arg7[local392];
							@Pc(408) int local408 = arg8[local382];
							@Pc(412) int local412 = arg8[local387];
							@Pc(416) int local416 = arg8[local392];
							@Pc(432) int local432;
							if (local338.anIntArray94 != null && local338.anIntArray94[local376] != -1) {
								local432 = local338.anIntArray94[local376];
								arg6.method4745((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static340.method4998(local338.aShortArray29[local382], local432), (float) Static340.method4998(local338.aShortArray29[local387], local432), (float) Static340.method4998(local338.aShortArray29[local392], local432));
							} else if (local338.aShortArray31 == null || local338.aShortArray31[local376] == -1) {
								local432 = local338.anIntArray93[local376];
								arg6.method4745((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static340.method4998(local338.aShortArray29[local382], local432), (float) Static340.method4998(local338.aShortArray29[local387], local432), (float) Static340.method4998(local338.aShortArray29[local392], local432));
							} else {
								local432 = this.aClass67_Sub3_8.method7724(local338.aShortArray31[local376]);
								arg6.method4745((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static340.method4998(local338.aShortArray29[local382], local432), (float) Static340.method4998(local338.aShortArray29[local387], local432), (float) Static340.method4998(local338.aShortArray29[local392], local432));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean462 = true;
		this.aClass67_Sub3_8.C(local14);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Z")
	private boolean method7589(@OriginalArg(0) int arg0) {
		if ((this.anInt9062 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!ra", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub4_Sub13 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub13 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) boolean local9 = (this.anInt9062 & 0x20) == 0;
		if (this.aClass89ArrayArray1 == null && !local9) {
			this.aClass89ArrayArray1 = new Class89[super.anInt10875][super.anInt10872];
			this.aClass213ArrayArray1 = new Class213[super.anInt10875][super.anInt10872];
		} else if (this.aClass30ArrayArray1 == null && local9) {
			this.aClass30ArrayArray1 = new Class30[super.anInt10875][super.anInt10872];
		} else if (this.aClass148ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(67) int local67 = 0; local67 < arg6.length; local67++) {
			if (arg6[local67] == -1) {
				arg6[local67] = 0;
			} else {
				arg6[local67] = Static179.anIntArray162[Static702.method9174(arg6[local67]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(106) int local106 = 0; local106 < arg7.length; local106++) {
				if (arg7[local106] == -1) {
					arg7[local106] = 0;
				} else {
					arg7[local106] = Static179.anIntArray162[Static702.method9174(arg7[local106]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(205) int local205;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(236) int local236;
		@Pc(363) int local363;
		@Pc(410) int local410;
		@Pc(498) int local498;
		@Pc(530) int local530;
		if (local9) {
			@Pc(147) Class30 local147 = new Class30();
			local147.aShort8 = (short) arg2.length;
			local147.aShort7 = (short) (arg2.length / 3);
			local147.aShortArray20 = new short[local147.aShort8];
			local147.aShortArray17 = new short[local147.aShort8];
			local147.aShortArray21 = new short[local147.aShort8];
			local147.anIntArray58 = new int[local147.aShort8];
			local147.aShortArray19 = new short[local147.aShort8];
			local147.aShortArray18 = new short[local147.aShort8];
			local147.aByteArray8 = new byte[local147.aShort8];
			if (arg5 != null) {
				local147.aShortArray22 = new short[local147.aShort8];
			}
			for (local205 = 0; local205 < local147.aShort8; local205++) {
				local210 = arg2[local205];
				local214 = arg4[local205];
				if (local210 == 0 && local214 == 0) {
					local236 = this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1];
				} else if (local210 == 0 && local214 == super.anInt10871) {
					local236 = this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1];
				} else if (local210 == super.anInt10871 && local214 == super.anInt10871) {
					local236 = this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1];
				} else if (local210 == super.anInt10871 && local214 == 0) {
					local236 = this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1];
				} else {
					local363 = (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (super.anInt10871 - local210) + (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local210;
					local410 = (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (super.anInt10871 - local210) + (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local210;
					local236 = local363 * (super.anInt10871 - local214) + local410 * local214 >> super.anInt10873 * 2;
				}
				local363 = (arg0 << super.anInt10873) + local210;
				local410 = (arg1 << super.anInt10873) + local214;
				local147.aShortArray20[local205] = (short) local210;
				local147.aShortArray21[local205] = (short) local214;
				local147.aShortArray17[local205] = (short) (this.method9096(local363, local410) + (arg3 == null ? 0 : arg3[local205]));
				if (local236 < 0) {
					local236 = 0;
				}
				if (arg6[local205] == 0) {
					local147.anIntArray58[local205] = 0;
					if (arg7 != null) {
						local147.aByteArray8[local205] = (byte) local236;
					}
				} else {
					local498 = 0;
					if (arg5 != null) {
						@Pc(510) short local510 = local147.aShortArray22[local205] = (short) arg5[local205];
						if (arg11 != 0) {
							local498 = local510 * 255 / arg11;
							if (local498 < 0) {
								local498 = 0;
							} else if (local498 > 255) {
								local498 = 255;
							}
						}
					}
					local530 = -16777216;
					if (arg8[local205] != -1 && this.method7589(this.aClass67_Sub3_8.anInterface2_11.method1027(arg8[local205]).aByte25)) {
						local530 = -1694498816;
					}
					local147.anIntArray58[local205] = local530 | Static684.method9025(arg10, local498, Static732.method7587(arg6[local205] >> 8, local236));
					if (arg7 != null) {
						local147.aByteArray8[local205] = (byte) local236;
					}
				}
				local147.aShortArray19[local205] = (short) arg8[local205];
				local147.aShortArray18[local205] = (short) arg9[local205];
			}
			if (arg7 != null) {
				local147.anIntArray59 = new int[local147.aShort7];
			}
			for (local210 = 0; local210 < local147.aShort7; local210++) {
				local214 = local210 * 3;
				if (arg7 != null && arg7[local214] != 0) {
					local147.anIntArray59[local210] = arg7[local214] >> 8 | 0xFF000000;
				}
			}
			this.aClass30ArrayArray1[arg0][arg1] = local147;
			return;
		}
		@Pc(654) boolean local654 = true;
		local205 = -1;
		local210 = -1;
		local214 = -1;
		local236 = -1;
		if (arg2.length == 6) {
			for (local363 = 0; local363 < 6; local363++) {
				if (arg2[local363] == 0 && arg4[local363] == 0) {
					if (local205 != -1 && arg6[local205] != arg6[local363]) {
						local654 = false;
						break;
					}
					local205 = local363;
				} else if (arg2[local363] == super.anInt10871 && arg4[local363] == 0) {
					if (local210 != -1 && arg6[local210] != arg6[local363]) {
						local654 = false;
						break;
					}
					local210 = local363;
				} else if (arg2[local363] == super.anInt10871 && arg4[local363] == super.anInt10871) {
					if (local214 != -1 && arg6[local214] != arg6[local363]) {
						local654 = false;
						break;
					}
					local214 = local363;
				} else if (arg2[local363] == 0 && arg4[local363] == super.anInt10871) {
					if (local236 != -1 && arg6[local236] != arg6[local363]) {
						local654 = false;
						break;
					}
					local236 = local363;
				}
			}
			if (local205 == -1 || local210 == -1 || local214 == -1 || local236 == -1) {
				local654 = false;
			}
			if (local654) {
				if (arg3 != null) {
					for (local410 = 0; local410 < 4; local410++) {
						if (arg3[local410] != 0) {
							local654 = false;
							break;
						}
					}
				}
				if (local654) {
					for (local410 = 1; local410 < 4; local410++) {
						if (arg2[local410] != arg2[0] && arg2[local410] != arg2[0] + super.anInt10871 && arg2[local410] != arg2[0] - super.anInt10871) {
							local654 = false;
							break;
						}
						if (arg4[local410] != arg4[0] && arg4[local410] != arg4[0] + super.anInt10871 && arg4[local410] != arg4[0] - super.anInt10871) {
							local654 = false;
							break;
						}
					}
				}
			}
		} else {
			local654 = false;
		}
		if (!local654) {
			@Pc(1760) Class213 local1760 = new Class213();
			local1760.aShort75 = (short) arg2.length;
			local1760.aShort76 = (short) (arg2.length / 3);
			local1760.aShortArray107 = new short[local1760.aShort75];
			local1760.aShortArray104 = new short[local1760.aShort75];
			local1760.aShortArray109 = new short[local1760.aShort75];
			local1760.anIntArray337 = new int[local1760.aShort75];
			if (arg5 != null) {
				local1760.aShortArray108 = new short[local1760.aShort75];
			}
			@Pc(1834) int local1834;
			@Pc(1961) int local1961;
			@Pc(2008) int local2008;
			@Pc(2098) int local2098;
			for (local410 = 0; local410 < local1760.aShort75; local410++) {
				local498 = arg2[local410];
				local530 = arg4[local410];
				if (local498 == 0 && local530 == 0) {
					local1834 = this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1];
				} else if (local498 == 0 && local530 == super.anInt10871) {
					local1834 = this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1];
				} else if (local498 == super.anInt10871 && local530 == super.anInt10871) {
					local1834 = this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1];
				} else if (local498 == super.anInt10871 && local530 == 0) {
					local1834 = this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1];
				} else {
					local1961 = (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (super.anInt10871 - local498) + (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local498;
					local2008 = (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (super.anInt10871 - local498) + (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local498;
					local1834 = local1961 * (super.anInt10871 - local530) + local2008 * local530 >> super.anInt10873 * 2;
				}
				local1961 = (arg0 << super.anInt10873) + local498;
				local2008 = (arg1 << super.anInt10873) + local530;
				local1760.aShortArray107[local410] = (short) local498;
				local1760.aShortArray109[local410] = (short) local530;
				local1760.aShortArray104[local410] = (short) (this.method9096(local1961, local2008) + (arg3 == null ? 0 : arg3[local410]));
				if (local1834 < 0) {
					local1834 = 0;
				}
				if (arg6[local410] != 0) {
					local2098 = 0;
					if (arg5 != null) {
						@Pc(2110) short local2110 = local1760.aShortArray108[local410] = (short) arg5[local410];
						if (arg11 != 0) {
							local2098 = local2110 * 255 / arg11;
							if (local2098 < 0) {
								local2098 = 0;
							} else if (local2098 > 255) {
								local2098 = 255;
							}
						}
					}
					local1760.anIntArray337[local410] = Static684.method9025(arg10, local2098, Static732.method7587(arg6[local410] >> 8, local1834));
					if (arg7 != null) {
						local1760.anIntArray337[local410] |= local1834 << 25;
					}
				} else if (arg7 == null) {
					local1760.anIntArray337[local410] = 0;
				} else {
					local1760.anIntArray337[local410] = local1834 << 25;
				}
			}
			@Pc(2164) boolean local2164 = false;
			for (local530 = 0; local530 < local1760.aShort76; local530++) {
				if (arg8[local530 * 3] != -1 && !this.aClass67_Sub3_8.anInterface2_11.method1027(arg8[local530 * 3]).aBoolean67) {
					local2164 = true;
				}
			}
			if (arg7 != null) {
				local1760.anIntArray338 = new int[local1760.aShort76];
			}
			if (local2164) {
				local1760.aShortArray106 = new short[local1760.aShort76];
				local1760.aShortArray105 = new short[local1760.aShort76];
			}
			for (local1834 = 0; local1834 < local1760.aShort76; local1834++) {
				local1961 = local1834 * 3;
				if (arg7 != null && arg7[local1961] != 0) {
					local1760.anIntArray338[local1834] = arg7[local1961] >> 8;
				}
				if (local2164) {
					local2008 = local1961 + 1;
					local2098 = local2008 + 1;
					@Pc(2258) boolean local2258 = false;
					@Pc(2260) boolean local2260 = true;
					@Pc(2264) int local2264 = arg8[local1961];
					if (local2264 == -1 || this.aClass67_Sub3_8.anInterface2_11.method1027(local2264).aBoolean67) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					local2264 = arg8[local2008];
					if (local2264 == -1 || this.aClass67_Sub3_8.anInterface2_11.method1027(local2264).aBoolean67) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					local2264 = arg8[local2098];
					if (local2264 == -1 || this.aClass67_Sub3_8.anInterface2_11.method1027(local2264).aBoolean67) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					if (local2260) {
						local1760.aShortArray106[local1834] = (short) local2264;
						local1760.aShortArray105[local1834] = (short) arg9[local1961];
					} else {
						if (local2258) {
							local2264 = arg8[local1961];
							if (local2264 != -1 && !this.aClass67_Sub3_8.anInterface2_11.method1027(local2264).aBoolean67) {
								local1760.anIntArray337[local1961] = Static179.anIntArray162[Static702.method9174(this.aClass67_Sub3_8.anInterface2_11.method1027(local2264).aShort9 & 0xFFFF) & 0xFFFF];
							}
							local2264 = arg8[local2008];
							if (local2264 != -1 && !this.aClass67_Sub3_8.anInterface2_11.method1027(local2264).aBoolean67) {
								local1760.anIntArray337[local2008] = Static179.anIntArray162[Static702.method9174(this.aClass67_Sub3_8.anInterface2_11.method1027(local2264).aShort9 & 0xFFFF) & 0xFFFF];
							}
							local2264 = arg8[local2098];
							if (local2264 != -1 && !this.aClass67_Sub3_8.anInterface2_11.method1027(local2264).aBoolean67) {
								local1760.anIntArray337[local2098] = Static179.anIntArray162[Static702.method9174(this.aClass67_Sub3_8.anInterface2_11.method1027(local2264).aShort9 & 0xFFFF) & 0xFFFF];
							}
						}
						local1760.aShortArray106[local1834] = -1;
					}
				}
			}
			this.aClass213ArrayArray1[arg0][arg1] = local1760;
			return;
		}
		@Pc(931) Class89 local931 = new Class89();
		local410 = arg6[0];
		local498 = arg8[0];
		if (arg7 != null) {
			local931.anInt2662 = arg7[0] >> 8;
			if (local410 == 0) {
				local931.aByte43 = (byte) (local931.aByte43 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0 + 1][arg1] && super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0 + 1][arg1 + 1] && super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0][arg1 + 1]) {
			local931.aByte43 = (byte) (local931.aByte43 | 0x1);
		}
		if (local498 == -1 || (local931.aByte43 & 0x2) != 0 || this.aClass67_Sub3_8.anInterface2_11.method1027(local498).aBoolean67) {
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local205] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2659 = Static684.method9025(arg10, local530, Static732.method7587(arg6[local205] >> 8, this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]));
			if (local931.anInt2662 != 0) {
				local931.anInt2659 |= this.aByteArrayArray16[arg0][arg1] + 255 - this.aByteArrayArray17[arg0][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local210] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2660 = Static684.method9025(arg10, local530, Static732.method7587(arg6[local210] >> 8, this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]));
			if (local931.anInt2662 != 0) {
				local931.anInt2660 |= this.aByteArrayArray16[arg0 + 1][arg1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local214] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2663 = Static684.method9025(arg10, local530, Static732.method7587(arg6[local214] >> 8, this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]));
			if (local931.anInt2662 != 0) {
				local931.anInt2663 |= this.aByteArrayArray16[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1 + 1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local236] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2661 = Static684.method9025(arg10, local530, Static732.method7587(arg6[local236] >> 8, this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]));
			if (local931.anInt2662 != 0) {
				local931.anInt2661 |= this.aByteArrayArray16[arg0][arg1 + 1] + 255 - this.aByteArrayArray17[arg0][arg1 + 1] << 25;
			}
			local931.aShort27 = -1;
		} else {
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local205] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2659 = Static684.method9025(arg10, local530, Static732.method7587(arg6[local205] >> 8, this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]));
			if (local931.anInt2662 != 0) {
				local931.anInt2659 |= this.aByteArrayArray16[arg0][arg1] + 255 - this.aByteArrayArray17[arg0][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local210] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2660 = Static684.method9025(arg10, local530, Static732.method7587(arg6[local210] >> 8, this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]));
			if (local931.anInt2662 != 0) {
				local931.anInt2660 |= this.aByteArrayArray16[arg0 + 1][arg1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local214] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2663 = Static684.method9025(arg10, local530, Static732.method7587(arg6[local214] >> 8, this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]));
			if (local931.anInt2662 != 0) {
				local931.anInt2663 |= this.aByteArrayArray16[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1 + 1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local236] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2661 = Static684.method9025(arg10, local530, Static732.method7587(arg6[local236] >> 8, this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]));
			local931.aShort27 = (short) local498;
		}
		if (arg5 != null) {
			local931.aShort28 = (short) arg5[local214];
			local931.aShort25 = (short) arg5[local236];
			local931.aShort24 = (short) arg5[local210];
			local931.aShort26 = (short) arg5[local205];
		}
		this.aClass89ArrayArray1[arg0][arg1] = local931;
	}

	@OriginalMember(owner = "client!ra", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIZLclient!th;Lclient!jp;[I[I[I[II)V")
	private void method7590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class355 arg3, @OriginalArg(4) Class192 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class89 local6 = this.aClass89ArrayArray1[arg0][arg1];
		@Pc(50) int local50;
		@Pc(55) int local55;
		@Pc(60) int local60;
		@Pc(559) int local559;
		@Pc(409) int local409;
		@Pc(469) int local469;
		@Pc(529) int local529;
		@Pc(589) int local589;
		if (local6 == null) {
			@Pc(3142) Class213 local3142 = this.aClass213ArrayArray1[arg0][arg1];
			if (local3142 != null) {
				if (arg9 != 0) {
					if ((local3142.aByte89 & 0x4) == 0) {
						if ((arg9 & 0x2) != 0) {
							return;
						}
					} else if ((arg9 & 0x1) != 0) {
						return;
					}
				}
				@Pc(3321) float local3321;
				@Pc(3342) float local3342;
				@Pc(3222) float local3222;
				if (this.anInt9063 == -1) {
					for (local559 = 0; local559 < local3142.aShort75; local559++) {
						local50 = local3142.aShortArray107[local559] + (arg0 << super.anInt10873);
						local55 = local3142.aShortArray104[local559];
						local60 = local3142.aShortArray109[local559] + (arg1 << super.anInt10873);
						local3222 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local55 + this.aFloat170 * (float) local60;
						if (local3222 <= (float) this.aClass67_Sub3_8.anInt9149) {
							return;
						}
						arg8[local559] = 0;
						if (arg2) {
							local409 = (int) (local3222 - (float) arg3.anInt9917);
							if (local409 > 255) {
								local409 = 255;
							}
							if (local409 > 0) {
								arg8[local559] = local409;
								local469 = local3142.aShortArray108[local559] * local409 / 255;
								if (local469 > 0) {
									local55 -= local469;
								}
							}
						} else if (arg3.aBoolean722) {
							local409 = (int) (local3222 - (float) arg3.anInt9917);
							if (local409 > 0) {
								arg8[local559] = local409;
								if (arg8[local559] > 255) {
									arg8[local559] = 255;
								}
							}
						}
						local3321 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local55 + this.aFloat171 * (float) local60;
						local3342 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local55 + this.aFloat175 * (float) local60;
						arg5[local559] = arg4.anInt5578 + (int) (local3321 * (float) this.aClass67_Sub3_8.anInt9154 / local3222);
						arg6[local559] = arg4.anInt5573 + (int) (local3342 * (float) this.aClass67_Sub3_8.anInt9157 / local3222);
						arg7[local559] = (int) local3222;
					}
				} else {
					for (local559 = 0; local559 < local3142.aShort75; local559++) {
						local50 = local3142.aShortArray107[local559] + (arg0 << super.anInt10873);
						local55 = local3142.aShortArray104[local559];
						local60 = local3142.aShortArray109[local559] + (arg1 << super.anInt10873);
						local3222 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local55 + this.aFloat170 * (float) local60;
						arg8[local559] = 0;
						if (arg2) {
							local409 = this.anInt9063 - arg3.anInt9917;
							if (local409 > 255) {
								local409 = 255;
							}
							if (local409 > 0) {
								arg8[local559] = local409;
								local469 = local3142.aShortArray108[local559] * local409 / 255;
								if (local469 > 0) {
									local55 -= local469;
								}
							}
						} else if (arg3.aBoolean722) {
							local409 = this.anInt9063 - arg3.anInt9917;
							if (local409 > 0) {
								arg8[local559] = local409;
								if (arg8[local559] > 255) {
									arg8[local559] = 255;
								}
							}
						}
						local3321 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local55 + this.aFloat171 * (float) local60;
						local3342 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local55 + this.aFloat175 * (float) local60;
						arg5[local559] = arg4.anInt5578 + (int) (local3321 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
						arg6[local559] = arg4.anInt5573 + (int) (local3342 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
						arg7[local559] = (int) local3222;
					}
				}
				@Pc(3620) int local3620;
				@Pc(3624) int local3624;
				@Pc(3628) int local3628;
				@Pc(3632) int local3632;
				@Pc(3636) int local3636;
				@Pc(3648) int local3648;
				if (local3142.aShortArray106 != null) {
					@Pc(3705) short local3705;
					@Pc(3719) int local3719;
					if (this.anInt9063 == -1) {
						for (local559 = 0; local559 < local3142.aShort76; local559++) {
							local409 = local559 * 3;
							local469 = local409 + 1;
							local529 = local469 + 1;
							local589 = arg5[local409];
							local3620 = arg5[local469];
							local3624 = arg5[local529];
							local3628 = arg6[local409];
							local3632 = arg6[local469];
							local3636 = arg6[local529];
							local3648 = arg8[local409] + arg8[local469] + arg8[local529];
							if ((local589 - local3620) * (local3636 - local3632) - (local3628 - local3632) * (local3624 - local3620) > 0) {
								arg4.aBoolean463 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt5575 || local3620 > arg4.anInt5575 || local3624 > arg4.anInt5575;
								local3705 = local3142.aShortArray106[local559];
								if (local3648 >= 765) {
									arg4.method4738((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt9925);
								} else if (local3648 > 0) {
									if (local3705 != -1) {
										local3719 = -16777216;
										if (local3705 != -1 && this.method7589(this.aClass67_Sub3_8.anInterface2_11.method1027(local3705).aByte25)) {
											local3719 = -1694498816;
										}
										arg4.method4731((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray107[local409] / (float) super.anInt10871, (float) local3142.aShortArray107[local469] / (float) super.anInt10871, (float) local3142.aShortArray107[local529] / (float) super.anInt10871, (float) local3142.aShortArray109[local409] / (float) super.anInt10871, (float) local3142.aShortArray109[local469] / (float) super.anInt10871, (float) local3142.aShortArray109[local529] / (float) super.anInt10871, local3719 | local3142.anIntArray337[local409] & 0xFFFFFF, local3719 | local3142.anIntArray337[local469] & 0xFFFFFF, local3719 | local3142.anIntArray337[local529] & 0xFFFFFF, arg3.anInt9925, arg8[local409], arg8[local469], arg8[local529], local3705);
									} else if ((local3142.anIntArray337[local409] & 0xFFFFFF) != 0) {
										if (local3705 != -1 && this.method7589(this.aClass67_Sub3_8.anInterface2_11.method1027(local3705).aByte25)) {
											arg4.anInt5577 = -1694498816;
										}
										arg4.method4743((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static163.method2627(arg8[local409] << 24 | arg3.anInt9925, local3142.anIntArray337[local409]), Static163.method2627(arg8[local469] << 24 | arg3.anInt9925, local3142.anIntArray337[local469]), Static163.method2627(arg8[local529] << 24 | arg3.anInt9925, local3142.anIntArray337[local529]));
										arg4.anInt5577 = 0;
									}
								} else if (local3705 != -1) {
									local3719 = -16777216;
									if (local3705 != -1 && this.method7589(this.aClass67_Sub3_8.anInterface2_11.method1027(local3705).aByte25)) {
										local3719 = -1694498816;
									}
									arg4.method4731((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray107[local409] / (float) super.anInt10871, (float) local3142.aShortArray107[local469] / (float) super.anInt10871, (float) local3142.aShortArray107[local529] / (float) super.anInt10871, (float) local3142.aShortArray109[local409] / (float) super.anInt10871, (float) local3142.aShortArray109[local469] / (float) super.anInt10871, (float) local3142.aShortArray109[local529] / (float) super.anInt10871, local3719 | local3142.anIntArray337[local409] & 0xFFFFFF, local3719 | local3142.anIntArray337[local469] & 0xFFFFFF, local3719 | local3142.anIntArray337[local529] & 0xFFFFFF, 0, 0, 0, 0, local3705);
								} else if ((local3142.anIntArray337[local409] & 0xFFFFFF) != 0) {
									if (local3705 != -1 && this.method7589(this.aClass67_Sub3_8.anInterface2_11.method1027(local3705).aByte25)) {
										arg4.anInt5577 = -1694498816;
									}
									arg4.method4743((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray337[local409], local3142.anIntArray337[local469], local3142.anIntArray337[local529]);
									arg4.anInt5577 = 0;
								}
							}
						}
						return;
					}
					for (local559 = 0; local559 < local3142.aShort76; local559++) {
						local409 = local559 * 3;
						local469 = local409 + 1;
						local529 = local469 + 1;
						local589 = arg5[local409];
						local3620 = arg5[local469];
						local3624 = arg5[local529];
						local3628 = arg6[local409];
						local3632 = arg6[local469];
						local3636 = arg6[local529];
						local3648 = arg8[local409] + arg8[local469] + arg8[local529];
						if ((local589 - local3620) * (local3636 - local3632) - (local3628 - local3632) * (local3624 - local3620) > 0) {
							arg4.aBoolean463 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt5575 || local3620 > arg4.anInt5575 || local3624 > arg4.anInt5575;
							local3705 = local3142.aShortArray106[local559];
							if (local3648 < 765) {
								if (local3705 != -1 && this.method7589(this.aClass67_Sub3_8.anInterface2_11.method1027(local3705).aByte25)) {
									arg4.anInt5577 = -1694498816;
								}
								if (local3648 > 0) {
									if (local3705 != -1) {
										local3719 = -16777216;
										if (local3705 != -1 && this.method7589(this.aClass67_Sub3_8.anInterface2_11.method1027(local3705).aByte25)) {
											local3719 = -1694498816;
										}
										arg4.method4731((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray107[local409] / (float) super.anInt10871, (float) local3142.aShortArray107[local469] / (float) super.anInt10871, (float) local3142.aShortArray107[local529] / (float) super.anInt10871, (float) local3142.aShortArray109[local409] / (float) super.anInt10871, (float) local3142.aShortArray109[local469] / (float) super.anInt10871, (float) local3142.aShortArray109[local529] / (float) super.anInt10871, local3719 | local3142.anIntArray337[local409] & 0xFFFFFF, local3719 | local3142.anIntArray337[local469] & 0xFFFFFF, local3719 | local3142.anIntArray337[local529] & 0xFFFFFF, arg3.anInt9925, arg8[local409], arg8[local469], arg8[local529], local3705);
									} else if ((local3142.anIntArray337[local409] & 0xFFFFFF) != 0) {
										if (local3705 != -1 && this.method7589(this.aClass67_Sub3_8.anInterface2_11.method1027(local3705).aByte25)) {
											arg4.anInt5577 = -1694498816;
										}
										arg4.method4743((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static163.method2627(arg8[local409] << 24 | arg3.anInt9925, local3142.anIntArray337[local409]), Static163.method2627(arg8[local469] << 24 | arg3.anInt9925, local3142.anIntArray337[local469]), Static163.method2627(arg8[local529] << 24 | arg3.anInt9925, local3142.anIntArray337[local529]));
										arg4.anInt5577 = 0;
									}
								} else if (local3705 != -1) {
									local3719 = -16777216;
									if (local3705 != -1 && this.method7589(this.aClass67_Sub3_8.anInterface2_11.method1027(local3705).aByte25)) {
										local3719 = -1694498816;
									}
									arg4.method4731((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray107[local409] / (float) super.anInt10871, (float) local3142.aShortArray107[local469] / (float) super.anInt10871, (float) local3142.aShortArray107[local529] / (float) super.anInt10871, (float) local3142.aShortArray109[local409] / (float) super.anInt10871, (float) local3142.aShortArray109[local469] / (float) super.anInt10871, (float) local3142.aShortArray109[local529] / (float) super.anInt10871, local3719 | local3142.anIntArray337[local409] & 0xFFFFFF, local3719 | local3142.anIntArray337[local469] & 0xFFFFFF, local3719 | local3142.anIntArray337[local529] & 0xFFFFFF, 0, 0, 0, 0, local3705);
								} else if ((local3142.anIntArray337[local409] & 0xFFFFFF) != 0) {
									if (local3705 != -1 && this.method7589(this.aClass67_Sub3_8.anInterface2_11.method1027(local3705).aByte25)) {
										arg4.anInt5577 = -1694498816;
									}
									arg4.method4743((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray337[local409], local3142.anIntArray337[local469], local3142.anIntArray337[local529]);
									arg4.anInt5577 = 0;
								}
								arg4.anInt5577 = 0;
							} else {
								arg4.method4738((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt9925);
							}
						}
					}
					return;
				}
				for (local559 = 0; local559 < local3142.aShort76; local559++) {
					local409 = local559 * 3;
					local469 = local409 + 1;
					local529 = local469 + 1;
					local589 = arg5[local409];
					local3620 = arg5[local469];
					local3624 = arg5[local529];
					local3628 = arg6[local409];
					local3632 = arg6[local469];
					local3636 = arg6[local529];
					local3648 = arg8[local409] + arg8[local469] + arg8[local529];
					if ((local589 - local3620) * (local3636 - local3632) - (local3628 - local3632) * (local3624 - local3620) > 0) {
						arg4.aBoolean463 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt5575 || local3620 > arg4.anInt5575 || local3624 > arg4.anInt5575;
						if (local3648 >= 765) {
							arg4.method4738((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt9925);
						} else if (local3648 > 0) {
							if ((local3142.anIntArray337[local409] & 0xFFFFFF) != 0) {
								arg4.method4743((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static684.method9025(arg3.anInt9925, arg8[local409], local3142.anIntArray337[local409]), Static684.method9025(arg3.anInt9925, arg8[local469], local3142.anIntArray337[local469]), Static684.method9025(arg3.anInt9925, arg8[local529], local3142.anIntArray337[local529]));
							}
						} else if ((local3142.anIntArray337[local409] & 0xFFFFFF) != 0) {
							arg4.method4743((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray337[local409], local3142.anIntArray337[local469], local3142.anIntArray337[local529]);
						}
					}
				}
			}
		} else if ((local6.aByte43 & 0x2) == 0) {
			if (arg9 != 0) {
				if ((local6.aByte43 & 0x4) == 0) {
					if ((arg9 & 0x2) != 0) {
						return;
					}
				} else if ((arg9 & 0x1) != 0) {
					return;
				}
			}
			@Pc(45) int local45 = arg0 * super.anInt10871;
			local50 = local45 + super.anInt10871;
			local55 = arg1 * super.anInt10871;
			local60 = local55 + super.anInt10871;
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			@Pc(66) int local66 = 0;
			@Pc(68) int local68 = 0;
			@Pc(111) float local111;
			@Pc(137) float local137;
			@Pc(163) float local163;
			@Pc(189) float local189;
			@Pc(276) int local276;
			@Pc(84) int local84;
			@Pc(863) int local863;
			@Pc(874) int local874;
			@Pc(379) int local379;
			@Pc(439) int local439;
			@Pc(499) int local499;
			@Pc(366) float local366;
			@Pc(426) float local426;
			@Pc(486) float local486;
			@Pc(546) float local546;
			@Pc(396) float local396;
			@Pc(456) float local456;
			@Pc(516) float local516;
			@Pc(576) float local576;
			if ((local6.aByte43 & 0x1) == 0 || arg2) {
				local84 = super.anIntArrayArray60[arg0][arg1];
				local863 = super.anIntArrayArray60[arg0 + 1][arg1];
				local874 = super.anIntArrayArray60[arg0 + 1][arg1 + 1];
				@Pc(883) int local883 = super.anIntArrayArray60[arg0][arg1 + 1];
				if (this.anInt9063 == -1) {
					local111 = this.aFloat174 + this.aFloat168 * (float) local45 + this.aFloat176 * (float) local84 + this.aFloat170 * (float) local55;
					if (local111 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local137 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local863 + this.aFloat170 * (float) local55;
					if (local137 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local163 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local874 + this.aFloat170 * (float) local60;
					if (local163 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local189 = this.aFloat174 + this.aFloat168 * (float) local45 + this.aFloat176 * (float) local883 + this.aFloat170 * (float) local60;
					if (local189 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
				} else {
					local111 = this.aFloat174 + this.aFloat168 * (float) local45 + this.aFloat176 * (float) local84 + this.aFloat170 * (float) local55;
					local137 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local863 + this.aFloat170 * (float) local55;
					local163 = this.aFloat174 + this.aFloat168 * (float) local50 + this.aFloat176 * (float) local874 + this.aFloat170 * (float) local60;
					local189 = this.aFloat174 + this.aFloat168 * (float) local45 + this.aFloat176 * (float) local883 + this.aFloat170 * (float) local60;
				}
				if (arg2) {
					local276 = (int) (local111 - (float) arg3.anInt9917);
					if (local276 > 255) {
						local276 = 255;
					}
					@Pc(1116) int local1116;
					if (local276 > 0) {
						local62 = local276;
						local1116 = local6.aShort26 * local276 / 255;
						if (local1116 > 0) {
							local84 -= local1116;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt9917);
					if (local276 > 255) {
						local276 = 255;
					}
					if (local276 > 0) {
						local64 = local276;
						local1116 = local6.aShort24 * local276 / 255;
						if (local1116 > 0) {
							local863 -= local1116;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt9917);
					if (local276 > 255) {
						local276 = 255;
					}
					if (local276 > 0) {
						local66 = local276;
						local1116 = local6.aShort28 * local276 / 255;
						if (local1116 > 0) {
							local874 -= local1116;
						}
					}
					local276 = (int) (local189 - (float) arg3.anInt9917);
					if (local276 > 255) {
						local276 = 255;
					}
					if (local276 > 0) {
						local68 = local276;
						local1116 = local6.aShort25 * local276 / 255;
						if (local1116 > 0) {
							local883 -= local1116;
						}
					}
				} else if (arg3.aBoolean722) {
					local276 = (int) (local111 - (float) arg3.anInt9917);
					if (local276 > 0) {
						local62 = local276;
						if (local276 > 255) {
							local62 = 255;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt9917);
					if (local276 > 0) {
						local64 = local276;
						if (local276 > 255) {
							local64 = 255;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt9917);
					if (local276 > 0) {
						local66 = local276;
						if (local276 > 255) {
							local66 = 255;
						}
					}
					local276 = (int) (local189 - (float) arg3.anInt9917);
					if (local276 > 0) {
						local68 = local276;
						if (local276 > 255) {
							local68 = 255;
						}
					}
				}
				if (this.anInt9063 == -1) {
					local366 = this.aFloat166 + this.aFloat173 * (float) local45 + this.aFloat169 * (float) local84 + this.aFloat171 * (float) local55;
					local379 = arg4.anInt5578 + (int) (local366 * (float) this.aClass67_Sub3_8.anInt9154 / local111);
					local396 = this.aFloat167 + this.aFloat172 * (float) local45 + this.aFloat177 * (float) local84 + this.aFloat175 * (float) local55;
					local409 = arg4.anInt5573 + (int) (local396 * (float) this.aClass67_Sub3_8.anInt9157 / local111);
					local426 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local863 + this.aFloat171 * (float) local55;
					local439 = arg4.anInt5578 + (int) (local426 * (float) this.aClass67_Sub3_8.anInt9154 / local137);
					local456 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local863 + this.aFloat175 * (float) local55;
					local469 = arg4.anInt5573 + (int) (local456 * (float) this.aClass67_Sub3_8.anInt9157 / local137);
					local486 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local874 + this.aFloat171 * (float) local60;
					local499 = arg4.anInt5578 + (int) (local486 * (float) this.aClass67_Sub3_8.anInt9154 / local163);
					local516 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local874 + this.aFloat175 * (float) local60;
					local529 = arg4.anInt5573 + (int) (local516 * (float) this.aClass67_Sub3_8.anInt9157 / local163);
					local546 = this.aFloat166 + this.aFloat173 * (float) local45 + this.aFloat169 * (float) local883 + this.aFloat171 * (float) local60;
					local559 = arg4.anInt5578 + (int) (local546 * (float) this.aClass67_Sub3_8.anInt9154 / local189);
					local576 = this.aFloat167 + this.aFloat172 * (float) local45 + this.aFloat177 * (float) local883 + this.aFloat175 * (float) local60;
					local589 = arg4.anInt5573 + (int) (local576 * (float) this.aClass67_Sub3_8.anInt9157 / local189);
				} else {
					local366 = this.aFloat166 + this.aFloat173 * (float) local45 + this.aFloat169 * (float) local84 + this.aFloat171 * (float) local55;
					local379 = arg4.anInt5578 + (int) (local366 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local396 = this.aFloat167 + this.aFloat172 * (float) local45 + this.aFloat177 * (float) local84 + this.aFloat175 * (float) local55;
					local409 = arg4.anInt5573 + (int) (local396 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local426 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local863 + this.aFloat171 * (float) local55;
					local439 = arg4.anInt5578 + (int) (local426 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local456 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local863 + this.aFloat175 * (float) local55;
					local469 = arg4.anInt5573 + (int) (local456 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local486 = this.aFloat166 + this.aFloat173 * (float) local50 + this.aFloat169 * (float) local874 + this.aFloat171 * (float) local60;
					local499 = arg4.anInt5578 + (int) (local486 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local516 = this.aFloat167 + this.aFloat172 * (float) local50 + this.aFloat177 * (float) local874 + this.aFloat175 * (float) local60;
					local529 = arg4.anInt5573 + (int) (local516 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local546 = this.aFloat166 + this.aFloat173 * (float) local45 + this.aFloat169 * (float) local883 + this.aFloat171 * (float) local60;
					local559 = arg4.anInt5578 + (int) (local546 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local576 = this.aFloat167 + this.aFloat172 * (float) local45 + this.aFloat177 * (float) local883 + this.aFloat175 * (float) local60;
					local589 = arg4.anInt5573 + (int) (local576 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
				}
			} else {
				local84 = super.anIntArrayArray60[arg0][arg1];
				@Pc(90) float local90 = this.aFloat176 * (float) local84;
				if (this.anInt9063 == -1) {
					local111 = this.aFloat174 + this.aFloat168 * (float) local45 + local90 + this.aFloat170 * (float) local55;
					if (local111 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local137 = this.aFloat174 + this.aFloat168 * (float) local50 + local90 + this.aFloat170 * (float) local55;
					if (local137 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local163 = this.aFloat174 + this.aFloat168 * (float) local50 + local90 + this.aFloat170 * (float) local60;
					if (local163 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
					local189 = this.aFloat174 + this.aFloat168 * (float) local45 + local90 + this.aFloat170 * (float) local60;
					if (local189 <= (float) this.aClass67_Sub3_8.anInt9149) {
						return;
					}
				} else {
					local111 = this.aFloat174 + this.aFloat168 * (float) local45 + local90 + this.aFloat170 * (float) local55;
					local137 = this.aFloat174 + this.aFloat168 * (float) local50 + local90 + this.aFloat170 * (float) local55;
					local163 = this.aFloat174 + this.aFloat168 * (float) local50 + local90 + this.aFloat170 * (float) local60;
					local189 = this.aFloat174 + this.aFloat168 * (float) local45 + local90 + this.aFloat170 * (float) local60;
				}
				if (arg3.aBoolean722) {
					local276 = (int) (local111 - (float) arg3.anInt9917);
					if (local276 > 0) {
						local62 = local276;
						if (local276 > 255) {
							local62 = 255;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt9917);
					if (local276 > 0) {
						local64 = local276;
						if (local276 > 255) {
							local64 = 255;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt9917);
					if (local276 > 0) {
						local66 = local276;
						if (local276 > 255) {
							local66 = 255;
						}
					}
					local276 = (int) (local189 - (float) arg3.anInt9917);
					if (local276 > 0) {
						local68 = local276;
						if (local276 > 255) {
							local68 = 255;
						}
					}
				}
				@Pc(339) float local339 = this.aFloat169 * (float) local84;
				@Pc(345) float local345 = this.aFloat177 * (float) local84;
				if (this.anInt9063 == -1) {
					local366 = this.aFloat166 + this.aFloat173 * (float) local45 + local339 + this.aFloat171 * (float) local55;
					local379 = arg4.anInt5578 + (int) (local366 * (float) this.aClass67_Sub3_8.anInt9154 / local111);
					local396 = this.aFloat167 + this.aFloat172 * (float) local45 + local345 + this.aFloat175 * (float) local55;
					local409 = arg4.anInt5573 + (int) (local396 * (float) this.aClass67_Sub3_8.anInt9157 / local111);
					local426 = this.aFloat166 + this.aFloat173 * (float) local50 + local339 + this.aFloat171 * (float) local55;
					local439 = arg4.anInt5578 + (int) (local426 * (float) this.aClass67_Sub3_8.anInt9154 / local137);
					local456 = this.aFloat167 + this.aFloat172 * (float) local50 + local345 + this.aFloat175 * (float) local55;
					local469 = arg4.anInt5573 + (int) (local456 * (float) this.aClass67_Sub3_8.anInt9157 / local137);
					local486 = this.aFloat166 + this.aFloat173 * (float) local50 + local339 + this.aFloat171 * (float) local60;
					local499 = arg4.anInt5578 + (int) (local486 * (float) this.aClass67_Sub3_8.anInt9154 / local163);
					local516 = this.aFloat167 + this.aFloat172 * (float) local50 + local345 + this.aFloat175 * (float) local60;
					local529 = arg4.anInt5573 + (int) (local516 * (float) this.aClass67_Sub3_8.anInt9157 / local163);
					local546 = this.aFloat166 + this.aFloat173 * (float) local45 + local339 + this.aFloat171 * (float) local60;
					local559 = arg4.anInt5578 + (int) (local546 * (float) this.aClass67_Sub3_8.anInt9154 / local189);
					local576 = this.aFloat167 + this.aFloat172 * (float) local45 + local345 + this.aFloat175 * (float) local60;
					local589 = arg4.anInt5573 + (int) (local576 * (float) this.aClass67_Sub3_8.anInt9157 / local189);
				} else {
					local366 = this.aFloat166 + this.aFloat173 * (float) local45 + local339 + this.aFloat171 * (float) local55;
					local379 = arg4.anInt5578 + (int) (local366 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local396 = this.aFloat167 + this.aFloat172 * (float) local45 + local345 + this.aFloat175 * (float) local55;
					local409 = arg4.anInt5573 + (int) (local396 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local426 = this.aFloat166 + this.aFloat173 * (float) local50 + local339 + this.aFloat171 * (float) local55;
					local439 = arg4.anInt5578 + (int) (local426 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local456 = this.aFloat167 + this.aFloat172 * (float) local50 + local345 + this.aFloat175 * (float) local55;
					local469 = arg4.anInt5573 + (int) (local456 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local486 = this.aFloat166 + this.aFloat173 * (float) local50 + local339 + this.aFloat171 * (float) local60;
					local499 = arg4.anInt5578 + (int) (local486 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local516 = this.aFloat167 + this.aFloat172 * (float) local50 + local345 + this.aFloat175 * (float) local60;
					local529 = arg4.anInt5573 + (int) (local516 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
					local546 = this.aFloat166 + this.aFloat173 * (float) local45 + local339 + this.aFloat171 * (float) local60;
					local559 = arg4.anInt5578 + (int) (local546 * (float) this.aClass67_Sub3_8.anInt9154 / (float) this.anInt9063);
					local576 = this.aFloat167 + this.aFloat172 * (float) local45 + local345 + this.aFloat175 * (float) local60;
					local589 = arg4.anInt5573 + (int) (local576 * (float) this.aClass67_Sub3_8.anInt9157 / (float) this.anInt9063);
				}
			}
			@Pc(1864) boolean local1864 = local6.aShort27 != -1 && this.method7589(this.aClass67_Sub3_8.anInterface2_11.method1027(local6.aShort27).aByte25);
			if (this.anInt9063 == -1) {
				local863 = local64 + local66 + local68;
				if ((local499 - local559) * (local469 - local589) - (local529 - local589) * (local439 - local559) > 0) {
					arg4.aBoolean463 = local499 < 0 || local559 < 0 || local439 < 0 || local499 > arg4.anInt5575 || local559 > arg4.anInt5575 || local439 > arg4.anInt5575;
					if (local863 >= 765) {
						arg4.method4738((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, arg3.anInt9925);
					} else if (local863 > 0) {
						if (local6.aShort27 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method4731((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt2663 & 0xFFFFFF, local874 | local6.anInt2661 & 0xFFFFFF, local874 | local6.anInt2660 & 0xFFFFFF, arg3.anInt9925, local66, local68, local64, local6.aShort27);
						} else {
							if (local1864) {
								arg4.anInt5577 = 100;
							}
							arg4.method4743((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, Static163.method2627(local66 << 24 | arg3.anInt9925, local6.anInt2663), Static163.method2627(local68 << 24 | arg3.anInt9925, local6.anInt2661), Static163.method2627(local64 << 24 | arg3.anInt9925, local6.anInt2660));
							arg4.anInt5577 = 0;
						}
					} else if (local6.aShort27 >= 0) {
						local874 = -16777216;
						if (local1864) {
							local874 = -1694498816;
						}
						arg4.method4731((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt2663 & 0xFFFFFF, local874 | local6.anInt2661 & 0xFFFFFF, local874 | local6.anInt2660 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort27);
					} else {
						if (local1864) {
							arg4.anInt5577 = 100;
						}
						arg4.method4743((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, local6.anInt2663, local6.anInt2661, local6.anInt2660);
						arg4.anInt5577 = 0;
					}
				}
				local863 = local62 + local64 + local68;
				if ((local379 - local439) * (local589 - local469) - (local409 - local469) * (local559 - local439) > 0) {
					arg4.aBoolean463 = local379 < 0 || local439 < 0 || local559 < 0 || local379 > arg4.anInt5575 || local439 > arg4.anInt5575 || local559 > arg4.anInt5575;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt5577 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort27 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method4731((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt2659 & 0xFFFFFF, local874 | local6.anInt2660 & 0xFFFFFF, local874 | local6.anInt2661 & 0xFFFFFF, arg3.anInt9925, local62, local64, local68, local6.aShort27);
								return;
							}
							if (local1864) {
								arg4.anInt5577 = 100;
							}
							arg4.method4743((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, Static163.method2627(local62 << 24 | arg3.anInt9925, local6.anInt2659), Static163.method2627(local64 << 24 | arg3.anInt9925, local6.anInt2660), Static163.method2627(local68 << 24 | arg3.anInt9925, local6.anInt2661));
							arg4.anInt5577 = 0;
							return;
						}
						if (local6.aShort27 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method4731((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt2659 & 0xFFFFFF, local874 | local6.anInt2660 & 0xFFFFFF, local874 | local6.anInt2661 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort27);
							return;
						}
						if (local1864) {
							arg4.anInt5577 = 100;
						}
						arg4.method4743((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, local6.anInt2659, local6.anInt2660, local6.anInt2661);
						arg4.anInt5577 = 0;
						return;
					}
					arg4.method4738((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, arg3.anInt9925);
					return;
				}
			} else {
				local863 = local64 + local66 + local68;
				if ((local499 - local559) * (local469 - local589) - (local529 - local589) * (local439 - local559) > 0) {
					arg4.aBoolean463 = local499 < 0 || local559 < 0 || local439 < 0 || local499 > arg4.anInt5575 || local559 > arg4.anInt5575 || local439 > arg4.anInt5575;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt5577 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort27 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method4731((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt2663 & 0xFFFFFF, local874 | local6.anInt2661 & 0xFFFFFF, local874 | local6.anInt2660 & 0xFFFFFF, arg3.anInt9925, local66, local68, local64, local6.aShort27);
							} else {
								if (local1864) {
									arg4.anInt5577 = 100;
								}
								arg4.method4743((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, Static163.method2627(local66 << 24 | arg3.anInt9925, local6.anInt2663), Static163.method2627(local68 << 24 | arg3.anInt9925, local6.anInt2661), Static163.method2627(local64 << 24 | arg3.anInt9925, local6.anInt2660));
								arg4.anInt5577 = 0;
							}
						} else if (local6.aShort27 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method4731((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt2663 & 0xFFFFFF, local874 | local6.anInt2661 & 0xFFFFFF, local874 | local6.anInt2660 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort27);
						} else {
							if (local1864) {
								arg4.anInt5577 = 100;
							}
							arg4.method4743((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, local6.anInt2663, local6.anInt2661, local6.anInt2660);
							arg4.anInt5577 = 0;
						}
					} else {
						arg4.method4738((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, arg3.anInt9925);
					}
				}
				local863 = local62 + local64 + local68;
				if ((local379 - local439) * (local589 - local469) - (local409 - local469) * (local559 - local439) > 0) {
					arg4.aBoolean463 = local379 < 0 || local439 < 0 || local559 < 0 || local379 > arg4.anInt5575 || local439 > arg4.anInt5575 || local559 > arg4.anInt5575;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt5577 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort27 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method4731((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt2659 & 0xFFFFFF, local874 | local6.anInt2660 & 0xFFFFFF, local874 | local6.anInt2661 & 0xFFFFFF, arg3.anInt9925, local62, local64, local68, local6.aShort27);
								return;
							}
							if (local1864) {
								arg4.anInt5577 = 100;
							}
							arg4.method4743((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, Static163.method2627(local62 << 24 | arg3.anInt9925, local6.anInt2659), Static163.method2627(local64 << 24 | arg3.anInt9925, local6.anInt2660), Static163.method2627(local68 << 24 | arg3.anInt9925, local6.anInt2661));
							arg4.anInt5577 = 0;
							return;
						}
						if (local6.aShort27 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method4731((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt2659 & 0xFFFFFF, local874 | local6.anInt2660 & 0xFFFFFF, local874 | local6.anInt2661 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort27);
							return;
						}
						if (local1864) {
							arg4.anInt5577 = 100;
						}
						arg4.method4743((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, local6.anInt2659, local6.anInt2660, local6.anInt2661);
						arg4.anInt5577 = 0;
						return;
					}
					arg4.method4738((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, arg3.anInt9925);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method9094(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!vj;[I)V")
	@Override
	public void method9097(@OriginalArg(0) Class3_Sub16 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!ra", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray16[arg0][arg1] < arg2) {
			this.aByteArrayArray16[arg0][arg1] = (byte) arg2;
		}
	}
}
