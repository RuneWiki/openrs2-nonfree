import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class84_Sub3 extends Class84 {

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "[[Lclient!aha;")
	private Class12[][] aClass12ArrayArray1;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "F")
	private float aFloat150;

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "F")
	private float aFloat151;

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "F")
	private float aFloat152;

	@OriginalMember(owner = "client!pu", name = "E", descriptor = "F")
	private float aFloat153;

	@OriginalMember(owner = "client!pu", name = "y", descriptor = "[[Lclient!vr;")
	private Class383[][] aClass383ArrayArray1;

	@OriginalMember(owner = "client!pu", name = "G", descriptor = "F")
	private float aFloat154;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "[[Lclient!sc;")
	private Class324[][] aClass324ArrayArray1;

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "F")
	private float aFloat155;

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "F")
	private float aFloat156;

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "F")
	private float aFloat157;

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "F")
	private float aFloat158;

	@OriginalMember(owner = "client!pu", name = "B", descriptor = "[[Lclient!cf;")
	private Class55[][] aClass55ArrayArray1;

	@OriginalMember(owner = "client!pu", name = "A", descriptor = "[[Lclient!um;")
	private Class366[][] aClass366ArrayArray1;

	@OriginalMember(owner = "client!pu", name = "I", descriptor = "F")
	private float aFloat159;

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "F")
	private float aFloat160;

	@OriginalMember(owner = "client!pu", name = "H", descriptor = "F")
	private float aFloat161;

	@OriginalMember(owner = "client!pu", name = "C", descriptor = "I")
	private int anInt7607 = -1;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "Lclient!fba;")
	private final Class100_Sub2 aClass100_Sub2_9;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
	private final int anInt7606;

	@OriginalMember(owner = "client!pu", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!pu", name = "J", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!fba;IIII[[I[[II)V")
	public Class84_Sub3(@OriginalArg(0) Class100_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass100_Sub2_9 = arg0;
		this.anInt7606 = arg2;
		this.aByteArrayArray18 = new byte[arg3 + 1][arg4 + 1];
		@Pc(29) int local29 = this.aClass100_Sub2_9.anInt2871 >> 9;
		for (@Pc(31) int local31 = 1; local31 < arg4; local31++) {
			for (@Pc(34) int local34 = 1; local34 < arg3; local34++) {
				@Pc(53) int local53 = arg6[local34 + 1][local31] - arg6[local34 - 1][local31];
				@Pc(69) int local69 = arg6[local34][local31 + 1] - arg6[local34][local31 - 1];
				@Pc(84) int local84 = (int) Math.sqrt((double) (local53 * local53 + arg7 * 512 + local69 * local69));
				@Pc(90) int local90 = (local53 << 8) / local84;
				@Pc(96) int local96 = arg7 * -512 / local84;
				@Pc(102) int local102 = (local69 << 8) / local84;
				@Pc(124) int local124 = local29 + (this.aClass100_Sub2_9.anInt2886 * local90 + this.aClass100_Sub2_9.anInt2893 * local96 + this.aClass100_Sub2_9.anInt2885 * local102 >> 17);
				local124 >>= 0x1;
				if (local124 < 2) {
					local124 = 2;
				} else if (local124 > 126) {
					local124 = 126;
				}
				this.aByteArrayArray18[local34][local31] = (byte) local124;
			}
		}
		this.aByteArrayArray19 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(III)V")
	private void method6620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class193 local4 = this.aClass100_Sub2_9.method2728(Thread.currentThread());
		local4.aClass31_1.anInt528 = 0;
		if (this.aClass55ArrayArray1 != null) {
			this.method6625(arg0, arg1, local4.aBoolean327, local4, local4.aClass31_1, local4.anIntArray289, local4.anIntArray286, local4.anIntArray272, local4.anIntArray283, arg2);
		} else if (this.aClass12ArrayArray1 != null) {
			this.method6623(arg0, arg1, local4.aClass31_1, local4.anIntArray289, local4.anIntArray286, local4.anIntArray272, local4.anIntArray283, arg2);
		} else if (this.aClass366ArrayArray1 != null) {
			this.method6621(arg0, arg1, local4.aBoolean327, local4, local4.aClass31_1, local4.anIntArray289, local4.anIntArray286, local4.anIntArray272, local4.anIntArray283, arg2);
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(IIZLclient!jq;Lclient!bf;[I[I[I[II)V")
	private void method6621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class193 arg3, @OriginalArg(4) Class31 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class366 local6 = this.aClass366ArrayArray1[arg0][arg1];
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
		if (this.anInt7607 == -1) {
			for (local26 = 0; local26 < local6.aShort108; local26++) {
				local37 = local6.aShortArray145[local26] + (arg0 << super.anInt8885);
				local42 = local6.aShortArray142[local26];
				local52 = local6.aShortArray147[local26] + (arg1 << super.anInt8885);
				local73 = this.aFloat156 + this.aFloat159 * (float) local37 + this.aFloat158 * (float) local42 + this.aFloat151 * (float) local52;
				if (local73 <= (float) this.aClass100_Sub2_9.anInt2881) {
					return;
				}
				arg8[local26] = 0;
				if (arg2) {
					local95 = (int) (local73 - (float) arg3.anInt4970);
					if (local95 > 255) {
						local95 = 255;
					}
					if (local95 > 0) {
						arg8[local26] = local95;
						local115 = local6.aShortArray146[local26] * local95 / 255;
						if (local115 > 0) {
							local42 -= local115;
						}
					}
				} else if (arg3.aBoolean325) {
					local95 = (int) (local73 - (float) arg3.anInt4970);
					if (local95 > 0) {
						arg8[local26] = local95;
						if (arg8[local26] > 255) {
							arg8[local26] = 255;
						}
					}
				}
				local172 = this.aFloat152 + this.aFloat157 * (float) local37 + this.aFloat161 * (float) local42 + this.aFloat150 * (float) local52;
				local193 = this.aFloat153 + this.aFloat155 * (float) local37 + this.aFloat160 * (float) local42 + this.aFloat154 * (float) local52;
				arg5[local26] = arg4.anInt529 + (int) (local172 * (float) this.aClass100_Sub2_9.anInt2887 / local73);
				arg6[local26] = arg4.anInt532 + (int) (local193 * (float) this.aClass100_Sub2_9.anInt2894 / local73);
				arg7[local26] = (int) local73;
			}
		} else {
			for (local26 = 0; local26 < local6.aShort108; local26++) {
				local37 = local6.aShortArray145[local26] + (arg0 << super.anInt8885);
				local42 = local6.aShortArray142[local26];
				local52 = local6.aShortArray147[local26] + (arg1 << super.anInt8885);
				local73 = this.aFloat156 + this.aFloat159 * (float) local37 + this.aFloat158 * (float) local42 + this.aFloat151 * (float) local52;
				arg8[local26] = 0;
				if (arg2) {
					local95 = this.anInt7607 - arg3.anInt4970;
					if (local95 > 255) {
						local95 = 255;
					}
					if (local95 > 0) {
						arg8[local26] = local95;
						local115 = local6.aShortArray146[local26] * local95 / 255;
						if (local115 > 0) {
							local42 -= local115;
						}
					}
				} else if (arg3.aBoolean325) {
					local95 = this.anInt7607 - arg3.anInt4970;
					if (local95 > 0) {
						arg8[local26] = local95;
						if (arg8[local26] > 255) {
							arg8[local26] = 255;
						}
					}
				}
				local172 = this.aFloat152 + this.aFloat157 * (float) local37 + this.aFloat161 * (float) local42 + this.aFloat150 * (float) local52;
				local193 = this.aFloat153 + this.aFloat155 * (float) local37 + this.aFloat160 * (float) local42 + this.aFloat154 * (float) local52;
				arg5[local26] = arg4.anInt529 + (int) (local172 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
				arg6[local26] = arg4.anInt532 + (int) (local193 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
				arg7[local26] = (int) local73;
			}
		}
		@Pc(441) float local441 = (float) super.anInt8881;
		for (local95 = 0; local95 < local6.aShort109; local95++) {
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
				arg4.aBoolean36 = local460 < 0 || local464 < 0 || local468 < 0 || local460 > arg4.anInt527 || local464 > arg4.anInt527 || local468 > arg4.anInt527;
				if (arg8[local115] + arg8[local452] + arg8[local456] < 765) {
					@Pc(550) int local550 = arg0 << super.anInt8885;
					@Pc(555) int local555 = arg1 << super.anInt8885;
					if ((local6.anIntArray548[local115] & 0xFFFFFF) != 0) {
						if (local6.aShortArray143[local115] == local6.aShortArray143[local452] && local6.aShortArray143[local115] == local6.aShortArray143[local456] && local6.aShortArray144[local115] == local6.aShortArray144[local452] && local6.aShortArray144[local115] == local6.aShortArray144[local456]) {
							arg4.method579((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], (float) (local550 + local6.aShortArray145[local115]) / (float) local6.aShortArray144[local115], (float) (local550 + local6.aShortArray145[local452]) / (float) local6.aShortArray144[local452], (float) (local550 + local6.aShortArray145[local456]) / (float) local6.aShortArray144[local456], (float) (local555 + local6.aShortArray147[local115]) / (float) local6.aShortArray144[local115], (float) (local555 + local6.aShortArray147[local452]) / (float) local6.aShortArray144[local452], (float) (local555 + local6.aShortArray147[local456]) / (float) local6.aShortArray144[local456], local6.anIntArray548[local115], local6.anIntArray548[local452], local6.anIntArray548[local456], arg3.anInt4969, arg8[local115], arg8[local452], arg8[local456], local6.aShortArray143[local115]);
						} else {
							arg4.method567((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], (float) (local550 + local6.aShortArray145[local115]) / local441, (float) (local550 + local6.aShortArray145[local452]) / local441, (float) (local550 + local6.aShortArray145[local456]) / local441, (float) (local555 + local6.aShortArray147[local115]) / local441, (float) (local555 + local6.aShortArray147[local452]) / local441, (float) (local555 + local6.aShortArray147[local456]) / local441, local6.anIntArray548[local115], local6.anIntArray548[local452], local6.anIntArray548[local456], arg3.anInt4969, arg8[local115], arg8[local452], arg8[local456], local6.aShortArray143[local115], local441 / (float) local6.aShortArray144[local115], local6.aShortArray143[local452], local441 / (float) local6.aShortArray144[local452], local6.aShortArray143[local456], local441 / (float) local6.aShortArray144[local456]);
						}
					}
				} else {
					arg4.method571((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], arg3.anInt4969);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)Z")
	private boolean method6622(@OriginalArg(0) int arg0) {
		if ((this.anInt7606 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IILclient!bf;[I[I[I[II)V")
	private void method6623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7) {
		@Pc(6) Class12 local6 = this.aClass12ArrayArray1[arg0][arg1];
		@Pc(50) int local50;
		@Pc(60) int local60;
		@Pc(480) int local480;
		@Pc(510) int local510;
		if (local6 == null) {
			@Pc(2204) Class383 local2204 = this.aClass383ArrayArray1[arg0][arg1];
			if (local2204 != null) {
				if (arg7 != 0) {
					if ((local2204.aByte144 & 0x4) == 0) {
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
				if (this.anInt7607 == -1) {
					for (local480 = 0; local480 < local2204.aShort122; local480++) {
						local50 = local2204.aShortArray179[local480] + (arg0 << super.anInt8885);
						local2253 = local2204.aShortArray177[local480];
						local60 = local2204.aShortArray178[local480] + (arg1 << super.anInt8885);
						local2284 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local2253 + this.aFloat151 * (float) local60;
						if (local2284 <= (float) this.aClass100_Sub2_9.anInt2881) {
							return;
						}
						local2314 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local2253 + this.aFloat150 * (float) local60;
						local2335 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local2253 + this.aFloat154 * (float) local60;
						arg3[local480] = arg2.anInt529 + (int) (local2314 * (float) this.aClass100_Sub2_9.anInt2887 / local2284);
						arg4[local480] = arg2.anInt532 + (int) (local2335 * (float) this.aClass100_Sub2_9.anInt2894 / local2284);
						arg5[local480] = (int) local2284;
					}
				} else {
					for (local480 = 0; local480 < local2204.aShort122; local480++) {
						local50 = local2204.aShortArray179[local480] + (arg0 << super.anInt8885);
						local2253 = local2204.aShortArray177[local480];
						local60 = local2204.aShortArray178[local480] + (arg1 << super.anInt8885);
						local2284 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local2253 + this.aFloat151 * (float) local60;
						local2314 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local2253 + this.aFloat150 * (float) local60;
						local2335 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local2253 + this.aFloat154 * (float) local60;
						arg3[local480] = arg2.anInt529 + (int) (local2314 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
						arg4[local480] = arg2.anInt532 + (int) (local2335 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
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
				if (local2204.aShortArray176 != null) {
					@Pc(2753) int local2753;
					@Pc(2622) short local2622;
					if (this.anInt7607 == -1) {
						for (local480 = 0; local480 < local2204.aShort123; local480++) {
							local2531 = local2204.aShortArray181[local480];
							local2536 = local2204.aShortArray175[local480];
							local2541 = local2204.aShortArray183[local480];
							local510 = arg3[local2531];
							local2549 = arg3[local2536];
							local2553 = arg3[local2541];
							local2557 = arg4[local2531];
							local2561 = arg4[local2536];
							local2565 = arg4[local2541];
							if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
								arg2.aBoolean36 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt527 || local2549 > arg2.anInt527 || local2553 > arg2.anInt527;
								local2622 = local2204.aShortArray176[local480];
								if (local2622 == -1) {
									local2753 = local2204.anIntArray603[local480];
									if (local2753 != -1) {
										arg2.method568((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static523.method7137(local2204.aShortArray180[local2531], local2753), (float) Static523.method7137(local2204.aShortArray180[local2536], local2753), (float) Static523.method7137(local2204.aShortArray180[local2541], local2753));
									}
								} else {
									arg2.method579((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) local2204.aShortArray179[local2531] / (float) super.anInt8881, (float) local2204.aShortArray179[local2536] / (float) super.anInt8881, (float) local2204.aShortArray179[local2541] / (float) super.anInt8881, (float) local2204.aShortArray178[local2531] / (float) super.anInt8881, (float) local2204.aShortArray178[local2536] / (float) super.anInt8881, (float) local2204.aShortArray178[local2541] / (float) super.anInt8881, Static305.anIntArray314[local2204.aShortArray180[local2531] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local2204.aShortArray180[local2536] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local2204.aShortArray180[local2541] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2622);
								}
							}
						}
						return;
					}
					for (local480 = 0; local480 < local2204.aShort123; local480++) {
						local2531 = local2204.aShortArray181[local480];
						local2536 = local2204.aShortArray175[local480];
						local2541 = local2204.aShortArray183[local480];
						local510 = arg3[local2531];
						local2549 = arg3[local2536];
						local2553 = arg3[local2541];
						local2557 = arg4[local2531];
						local2561 = arg4[local2536];
						local2565 = arg4[local2541];
						if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
							arg2.aBoolean36 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt527 || local2549 > arg2.anInt527 || local2553 > arg2.anInt527;
							local2622 = local2204.aShortArray176[local480];
							if (local2622 == -1) {
								local2753 = local2204.anIntArray603[local480];
								if (local2753 != -1) {
									arg2.method568((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static523.method7137(local2204.aShortArray180[local2531], local2753), (float) Static523.method7137(local2204.aShortArray180[local2536], local2753), (float) Static523.method7137(local2204.aShortArray180[local2541], local2753));
								}
							} else {
								arg2.method579((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) local2204.aShortArray179[local2531] / (float) super.anInt8881, (float) local2204.aShortArray179[local2536] / (float) super.anInt8881, (float) local2204.aShortArray179[local2541] / (float) super.anInt8881, (float) local2204.aShortArray178[local2531] / (float) super.anInt8881, (float) local2204.aShortArray178[local2536] / (float) super.anInt8881, (float) local2204.aShortArray178[local2541] / (float) super.anInt8881, Static305.anIntArray314[local2204.aShortArray180[local2531] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local2204.aShortArray180[local2536] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local2204.aShortArray180[local2541] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2622);
							}
						}
					}
					return;
				}
				for (local480 = 0; local480 < local2204.aShort123; local480++) {
					local2531 = local2204.aShortArray181[local480];
					local2536 = local2204.aShortArray175[local480];
					local2541 = local2204.aShortArray183[local480];
					local510 = arg3[local2531];
					local2549 = arg3[local2536];
					local2553 = arg3[local2541];
					local2557 = arg4[local2531];
					local2561 = arg4[local2536];
					local2565 = arg4[local2541];
					if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
						@Pc(3170) int local3170 = local2204.anIntArray603[local480];
						if (local3170 != -1) {
							arg2.aBoolean36 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt527 || local2549 > arg2.anInt527 || local2553 > arg2.anInt527;
							arg2.method568((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static523.method7137(local2204.aShortArray180[local2531], local3170), (float) Static523.method7137(local2204.aShortArray180[local2536], local3170), (float) Static523.method7137(local2204.aShortArray180[local2541], local3170));
						}
					}
				}
			}
		} else if ((local6.aByte6 & 0x2) == 0) {
			if (arg7 != 0) {
				if ((local6.aByte6 & 0x4) == 0) {
					if ((arg7 & 0x2) != 0) {
						return;
					}
				} else if ((arg7 & 0x1) != 0) {
					return;
				}
			}
			@Pc(45) int local45 = arg0 * super.anInt8881;
			local50 = local45 + super.anInt8881;
			@Pc(55) int local55 = arg1 * super.anInt8881;
			local60 = local55 + super.anInt8881;
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
			if ((local6.aByte6 & 0x1) == 0) {
				local72 = super.anIntArrayArray53[arg0][arg1];
				@Pc(784) int local784 = super.anIntArrayArray53[arg0 + 1][arg1];
				@Pc(795) int local795 = super.anIntArrayArray53[arg0 + 1][arg1 + 1];
				@Pc(804) int local804 = super.anIntArrayArray53[arg0][arg1 + 1];
				if (this.anInt7607 == -1) {
					local99 = this.aFloat156 + this.aFloat159 * (float) local45 + this.aFloat158 * (float) local72 + this.aFloat151 * (float) local55;
					if (local99 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local125 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local784 + this.aFloat151 * (float) local55;
					if (local125 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local151 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local795 + this.aFloat151 * (float) local60;
					if (local151 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local177 = this.aFloat156 + this.aFloat159 * (float) local45 + this.aFloat158 * (float) local804 + this.aFloat151 * (float) local60;
					if (local177 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local287 = this.aFloat152 + this.aFloat157 * (float) local45 + this.aFloat161 * (float) local72 + this.aFloat150 * (float) local55;
					local300 = arg2.anInt529 + (int) (local287 * (float) this.aClass100_Sub2_9.anInt2887 / local99);
					local317 = this.aFloat153 + this.aFloat155 * (float) local45 + this.aFloat160 * (float) local72 + this.aFloat154 * (float) local55;
					local330 = arg2.anInt532 + (int) (local317 * (float) this.aClass100_Sub2_9.anInt2894 / local99);
					local347 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local784 + this.aFloat150 * (float) local55;
					local360 = arg2.anInt529 + (int) (local347 * (float) this.aClass100_Sub2_9.anInt2887 / local125);
					local377 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local784 + this.aFloat154 * (float) local55;
					local390 = arg2.anInt532 + (int) (local377 * (float) this.aClass100_Sub2_9.anInt2894 / local125);
					local407 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local795 + this.aFloat150 * (float) local60;
					local420 = arg2.anInt529 + (int) (local407 * (float) this.aClass100_Sub2_9.anInt2887 / local151);
					local437 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local795 + this.aFloat154 * (float) local60;
					local450 = arg2.anInt532 + (int) (local437 * (float) this.aClass100_Sub2_9.anInt2894 / local151);
					local467 = this.aFloat152 + this.aFloat157 * (float) local45 + this.aFloat161 * (float) local804 + this.aFloat150 * (float) local60;
					local480 = arg2.anInt529 + (int) (local467 * (float) this.aClass100_Sub2_9.anInt2887 / local177);
					local497 = this.aFloat153 + this.aFloat155 * (float) local45 + this.aFloat160 * (float) local804 + this.aFloat154 * (float) local60;
					local510 = arg2.anInt532 + (int) (local497 * (float) this.aClass100_Sub2_9.anInt2894 / local177);
				} else {
					local99 = this.aFloat156 + this.aFloat159 * (float) local45 + this.aFloat158 * (float) local72 + this.aFloat151 * (float) local55;
					local125 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local784 + this.aFloat151 * (float) local55;
					local151 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local795 + this.aFloat151 * (float) local60;
					local177 = this.aFloat156 + this.aFloat159 * (float) local45 + this.aFloat158 * (float) local804 + this.aFloat151 * (float) local60;
					local287 = this.aFloat152 + this.aFloat157 * (float) local45 + this.aFloat161 * (float) local72 + this.aFloat150 * (float) local55;
					local300 = arg2.anInt529 + (int) (local287 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local317 = this.aFloat153 + this.aFloat155 * (float) local45 + this.aFloat160 * (float) local72 + this.aFloat154 * (float) local55;
					local330 = arg2.anInt532 + (int) (local317 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local347 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local784 + this.aFloat150 * (float) local55;
					local360 = arg2.anInt529 + (int) (local347 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local377 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local784 + this.aFloat154 * (float) local55;
					local390 = arg2.anInt532 + (int) (local377 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local407 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local795 + this.aFloat150 * (float) local60;
					local420 = arg2.anInt529 + (int) (local407 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local437 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local795 + this.aFloat154 * (float) local60;
					local450 = arg2.anInt532 + (int) (local437 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local467 = this.aFloat152 + this.aFloat157 * (float) local45 + this.aFloat161 * (float) local804 + this.aFloat150 * (float) local60;
					local480 = arg2.anInt529 + (int) (local467 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local497 = this.aFloat153 + this.aFloat155 * (float) local45 + this.aFloat160 * (float) local804 + this.aFloat154 * (float) local60;
					local510 = arg2.anInt532 + (int) (local497 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
				}
			} else {
				local72 = super.anIntArrayArray53[arg0][arg1];
				@Pc(78) float local78 = this.aFloat158 * (float) local72;
				if (this.anInt7607 == -1) {
					local99 = this.aFloat156 + this.aFloat159 * (float) local45 + local78 + this.aFloat151 * (float) local55;
					if (local99 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local125 = this.aFloat156 + this.aFloat159 * (float) local50 + local78 + this.aFloat151 * (float) local55;
					if (local125 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local151 = this.aFloat156 + this.aFloat159 * (float) local50 + local78 + this.aFloat151 * (float) local60;
					if (local151 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local177 = this.aFloat156 + this.aFloat159 * (float) local45 + local78 + this.aFloat151 * (float) local60;
					if (local177 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
				} else {
					local99 = this.aFloat156 + this.aFloat159 * (float) local45 + local78 + this.aFloat151 * (float) local55;
					local125 = this.aFloat156 + this.aFloat159 * (float) local50 + local78 + this.aFloat151 * (float) local55;
					local151 = this.aFloat156 + this.aFloat159 * (float) local50 + local78 + this.aFloat151 * (float) local60;
					local177 = this.aFloat156 + this.aFloat159 * (float) local45 + local78 + this.aFloat151 * (float) local60;
				}
				@Pc(260) float local260 = this.aFloat161 * (float) local72;
				@Pc(266) float local266 = this.aFloat160 * (float) local72;
				if (this.anInt7607 == -1) {
					local287 = this.aFloat152 + this.aFloat157 * (float) local45 + local260 + this.aFloat150 * (float) local55;
					local300 = arg2.anInt529 + (int) (local287 * (float) this.aClass100_Sub2_9.anInt2887 / local99);
					local317 = this.aFloat153 + this.aFloat155 * (float) local45 + local266 + this.aFloat154 * (float) local55;
					local330 = arg2.anInt532 + (int) (local317 * (float) this.aClass100_Sub2_9.anInt2894 / local99);
					local347 = this.aFloat152 + this.aFloat157 * (float) local50 + local260 + this.aFloat150 * (float) local55;
					local360 = arg2.anInt529 + (int) (local347 * (float) this.aClass100_Sub2_9.anInt2887 / local125);
					local377 = this.aFloat153 + this.aFloat155 * (float) local50 + local266 + this.aFloat154 * (float) local55;
					local390 = arg2.anInt532 + (int) (local377 * (float) this.aClass100_Sub2_9.anInt2894 / local125);
					local407 = this.aFloat152 + this.aFloat157 * (float) local50 + local260 + this.aFloat150 * (float) local60;
					local420 = arg2.anInt529 + (int) (local407 * (float) this.aClass100_Sub2_9.anInt2887 / local151);
					local437 = this.aFloat153 + this.aFloat155 * (float) local50 + local266 + this.aFloat154 * (float) local60;
					local450 = arg2.anInt532 + (int) (local437 * (float) this.aClass100_Sub2_9.anInt2894 / local151);
					local467 = this.aFloat152 + this.aFloat157 * (float) local45 + local260 + this.aFloat150 * (float) local60;
					local480 = arg2.anInt529 + (int) (local467 * (float) this.aClass100_Sub2_9.anInt2887 / local177);
					local497 = this.aFloat153 + this.aFloat155 * (float) local45 + local266 + this.aFloat154 * (float) local60;
					local510 = arg2.anInt532 + (int) (local497 * (float) this.aClass100_Sub2_9.anInt2894 / local177);
				} else {
					local287 = this.aFloat152 + this.aFloat157 * (float) local45 + local260 + this.aFloat150 * (float) local55;
					local300 = arg2.anInt529 + (int) (local287 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local317 = this.aFloat153 + this.aFloat155 * (float) local45 + local266 + this.aFloat154 * (float) local55;
					local330 = arg2.anInt532 + (int) (local317 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local347 = this.aFloat152 + this.aFloat157 * (float) local50 + local260 + this.aFloat150 * (float) local55;
					local360 = arg2.anInt529 + (int) (local347 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local377 = this.aFloat153 + this.aFloat155 * (float) local50 + local266 + this.aFloat154 * (float) local55;
					local390 = arg2.anInt532 + (int) (local377 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local407 = this.aFloat152 + this.aFloat157 * (float) local50 + local260 + this.aFloat150 * (float) local60;
					local420 = arg2.anInt529 + (int) (local407 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local437 = this.aFloat153 + this.aFloat155 * (float) local50 + local266 + this.aFloat154 * (float) local60;
					local450 = arg2.anInt532 + (int) (local437 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local467 = this.aFloat152 + this.aFloat157 * (float) local45 + local260 + this.aFloat150 * (float) local60;
					local480 = arg2.anInt529 + (int) (local467 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local497 = this.aFloat153 + this.aFloat155 * (float) local45 + local266 + this.aFloat154 * (float) local60;
					local510 = arg2.anInt532 + (int) (local497 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
				}
			}
			if (this.anInt7607 == -1) {
				if ((local420 - local480) * (local390 - local510) - (local450 - local510) * (local360 - local480) > 0) {
					arg2.aBoolean36 = local420 < 0 || local480 < 0 || local360 < 0 || local420 > arg2.anInt527 || local480 > arg2.anInt527 || local360 > arg2.anInt527;
					if (local6.aShort7 >= 0) {
						arg2.method579((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, local151, local177, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static305.anIntArray314[local6.aShort6 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local6.aShort5 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local6.aShort9 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort7);
					} else {
						arg2.method568((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, (float) (int) local151, (float) (int) local177, (float) (int) local125, (float) (local6.aShort6 & 0xFFFF), (float) (local6.aShort5 & 0xFFFF), (float) (local6.aShort9 & 0xFFFF));
					}
				}
				if ((local300 - local360) * (local510 - local390) - (local330 - local390) * (local480 - local360) > 0) {
					arg2.aBoolean36 = local300 < 0 || local360 < 0 || local480 < 0 || local300 > arg2.anInt527 || local360 > arg2.anInt527 || local480 > arg2.anInt527;
					if (local6.aShort7 >= 0) {
						arg2.method579((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, local99, local125, local177, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static305.anIntArray314[local6.aShort8 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local6.aShort9 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local6.aShort5 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort7);
						return;
					}
					arg2.method568((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, (float) (int) local99, (float) (int) local125, (float) (int) local177, (float) (local6.aShort8 & 0xFFFF), (float) (local6.aShort9 & 0xFFFF), (float) (local6.aShort5 & 0xFFFF));
					return;
				}
			} else {
				if ((local420 - local480) * (local390 - local510) - (local450 - local510) * (local360 - local480) > 0) {
					arg2.aBoolean36 = local420 < 0 || local480 < 0 || local360 < 0 || local420 > arg2.anInt527 || local480 > arg2.anInt527 || local360 > arg2.anInt527;
					if (local6.aShort7 >= 0) {
						arg2.method579((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, local151, local177, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static305.anIntArray314[local6.aShort6 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local6.aShort5 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local6.aShort9 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort7);
					} else {
						arg2.method568((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, (float) (int) local151, (float) (int) local177, (float) (int) local125, (float) (local6.aShort6 & 0xFFFF), (float) (local6.aShort5 & 0xFFFF), (float) (local6.aShort9 & 0xFFFF));
					}
				}
				if ((local300 - local360) * (local510 - local390) - (local330 - local390) * (local480 - local360) > 0) {
					arg2.aBoolean36 = local300 < 0 || local360 < 0 || local480 < 0 || local300 > arg2.anInt527 || local360 > arg2.anInt527 || local480 > arg2.anInt527;
					if (local6.aShort7 >= 0) {
						arg2.method579((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, local99, local125, local177, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static305.anIntArray314[local6.aShort8 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local6.aShort9 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static305.anIntArray314[local6.aShort5 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort7);
						return;
					}
					arg2.method568((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, (float) (int) local99, (float) (int) local125, (float) (int) local177, (float) (local6.aShort8 & 0xFFFF), (float) (local6.aShort9 & 0xFFFF), (float) (local6.aShort5 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class10_Sub1 local3 = this.aClass100_Sub2_9.aClass10_Sub1_1;
		this.anInt7607 = -1;
		this.aFloat157 = local3.aFloat11;
		this.aFloat161 = local3.aFloat10;
		this.aFloat150 = local3.aFloat12;
		this.aFloat152 = local3.aFloat7;
		this.aFloat155 = local3.aFloat2;
		this.aFloat160 = local3.aFloat8;
		this.aFloat154 = local3.aFloat13;
		this.aFloat153 = local3.aFloat4;
		this.aFloat159 = local3.aFloat5;
		this.aFloat158 = local3.aFloat9;
		this.aFloat151 = local3.aFloat6;
		this.aFloat156 = local3.aFloat3;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt8883 && local78 >= 0 && local78 < super.anInt8878) {
						this.method6620(local72, local78, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(IIIIIII[[ZLclient!jq;Lclient!bf;[I[I)V")
	private void method6624(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class193 arg5, @OriginalArg(9) Class31 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean326;
		this.aClass100_Sub2_9.C(false);
		arg6.aBoolean34 = false;
		arg6.aBoolean35 = false;
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
					if (this.aClass55ArrayArray1 == null) {
						if (this.aClass366ArrayArray1[local32][local35] != null) {
							@Pc(593) Class366 local593 = this.aClass366ArrayArray1[local32][local35];
							for (local89 = 0; local89 < local593.aShort108; local89++) {
								arg7[local89] = local26 + local593.aShortArray145[local89] * 4 / super.anInt8881;
								arg8[local89] = local30 - local593.aShortArray147[local89] * 4 / super.anInt8881;
							}
							for (local379 = 0; local379 < local593.aShort109; local379++) {
								local384 = local379 * 3;
								local388 = local384 + 1;
								local392 = local388 + 1;
								local396 = arg7[local384];
								local400 = arg7[local388];
								local404 = arg7[local392];
								local408 = arg8[local384];
								local412 = arg8[local388];
								local416 = arg8[local392];
								if (local593.anIntArray547 == null || local593.anIntArray547[local379] == 0) {
									arg6.method570((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local593.anIntArray548[local384], local593.anIntArray548[local388], local593.anIntArray548[local392]);
								} else {
									local449 = local593.anIntArray547[local379];
									arg6.method570((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local449, local449, local449);
								}
							}
						}
					} else if (this.aClass55ArrayArray1[local32][local35] != null) {
						@Pc(67) Class55 local67 = this.aClass55ArrayArray1[local32][local35];
						if (local67.aShort27 != -1 && (local67.aByte24 & 0x2) == 0 && local67.anInt1054 == 0) {
							local89 = this.aClass100_Sub2_9.method2722(local67.aShort27);
							arg6.method568((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static523.method7137(local67.anInt1055, local89), (float) Static523.method7137(local67.anInt1057, local89), (float) Static523.method7137(local67.anInt1056, local89));
							arg6.method568((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static523.method7137(local67.anInt1058, local89), (float) Static523.method7137(local67.anInt1056, local89), (float) Static523.method7137(local67.anInt1057, local89));
						} else if (local67.anInt1054 == 0) {
							arg6.method570((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, local67.anInt1055, local67.anInt1057, local67.anInt1056);
							arg6.method570((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt1058, local67.anInt1056, local67.anInt1057);
						} else {
							local89 = local67.anInt1054;
							arg6.method570((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, Static518.method7072(local67.anInt1055 & 0xFF000000, local89), Static518.method7072(local67.anInt1057 & 0xFF000000, local89), Static518.method7072(local67.anInt1056 & 0xFF000000, local89));
							arg6.method570((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, Static518.method7072(local67.anInt1058 & 0xFF000000, local89), Static518.method7072(local67.anInt1056 & 0xFF000000, local89), Static518.method7072(local67.anInt1057 & 0xFF000000, local89));
						}
					} else if (this.aClass324ArrayArray1[local32][local35] != null) {
						@Pc(341) Class324 local341 = this.aClass324ArrayArray1[local32][local35];
						for (local89 = 0; local89 < local341.aShort100; local89++) {
							arg7[local89] = local26 + local341.aShortArray130[local89] * 4 / super.anInt8881;
							arg8[local89] = local30 - local341.aShortArray127[local89] * 4 / super.anInt8881;
						}
						for (local379 = 0; local379 < local341.aShort99; local379++) {
							local384 = local379 * 3;
							local388 = local384 + 1;
							local392 = local388 + 1;
							local396 = arg7[local384];
							local400 = arg7[local388];
							local404 = arg7[local392];
							local408 = arg8[local384];
							local412 = arg8[local388];
							local416 = arg8[local392];
							if (local341.anIntArray490 != null && local341.anIntArray490[local379] != 0 && (local341.aShortArray129 == null || local341.aShortArray129 != null && local341.aShortArray129[local379] == -1)) {
								local449 = local341.anIntArray490[local379];
								arg6.method570((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, Static518.method7072(-(local341.anIntArray489[local384] & -16777216) - 16777216, local449), Static518.method7072(-(local341.anIntArray489[local388] & -16777216) - 16777216, local449), Static518.method7072(-(local341.anIntArray489[local392] & -16777216) - 16777216, local449));
							} else if (local341.aShortArray129 == null || local341.aShortArray129[local379] == -1) {
								arg6.method570((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local341.anIntArray489[local384], local341.anIntArray489[local388], local341.anIntArray489[local392]);
							} else {
								local449 = this.aClass100_Sub2_9.method2722(local341.aShortArray129[local379]);
								arg6.method568((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) local449, (float) local449, (float) local449);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean34 = true;
		this.aClass100_Sub2_9.C(local14);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7619(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!pu", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray19[arg0][arg1] < arg2) {
			this.aByteArrayArray19[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass12ArrayArray1 == null) {
			this.aClass12ArrayArray1 = new Class12[super.anInt8883][super.anInt8878];
			this.aClass383ArrayArray1 = new Class383[super.anInt8883][super.anInt8878];
		} else if (this.aClass55ArrayArray1 != null || this.aClass366ArrayArray1 != null) {
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
				if (local79 != 0 && local79 != super.anInt8881 || local85 != 0 && local85 != super.anInt8881) {
					local33 = false;
					break;
				}
			}
		}
		if (!local33) {
			@Pc(118) Class383 local118 = new Class383();
			@Pc(122) short local122 = (short) arg2.length;
			@Pc(126) short local126 = (short) arg9.length;
			local118.aShort122 = local122;
			local118.aShortArray180 = new short[local122];
			local118.aShortArray179 = new short[local122];
			local118.aShortArray177 = new short[local122];
			local118.aShortArray178 = new short[local122];
			@Pc(156) int local156;
			@Pc(323) int local323;
			@Pc(370) int local370;
			for (@Pc(147) int local147 = 0; local147 < local122; local147++) {
				@Pc(152) int local152 = arg2[local147];
				local156 = arg4[local147];
				if (local152 == 0 && local156 == 0) {
					local118.aShortArray180[local147] = (short) (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				} else if (local152 == 0 && local156 == super.anInt8881) {
					local118.aShortArray180[local147] = (short) (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]);
				} else if (local152 == super.anInt8881 && local156 == super.anInt8881) {
					local118.aShortArray180[local147] = (short) (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]);
				} else if (local152 == super.anInt8881 && local156 == 0) {
					local118.aShortArray180[local147] = (short) (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]);
				} else {
					local323 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]) * (super.anInt8881 - local152) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]) * local152;
					local370 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]) * (super.anInt8881 - local152) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]) * local152;
					local118.aShortArray180[local147] = (short) (local323 * (super.anInt8881 - local156) + local370 * local156 >> super.anInt8885 * 2);
				}
				local323 = (arg0 << super.anInt8885) + local152;
				local370 = (arg1 << super.anInt8885) + local156;
				local118.aShortArray179[local147] = (short) local152;
				local118.aShortArray178[local147] = (short) local156;
				local118.aShortArray177[local147] = (short) (this.method7625(local323, local370) + (arg3 == null ? 0 : arg3[local147]));
				if (local118.aShortArray180[local147] < 2) {
					local118.aShortArray180[local147] = 2;
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
					@Pc(490) Class44 local490 = this.aClass100_Sub2_9.anInterface7_12.method7423(local370);
					if (!local490.aBoolean56) {
						local454 = true;
						if (this.method6622(local490.aByte23) || local490.aByte18 != 0 || local490.aByte20 != 0) {
							local118.aByte144 = (byte) (local118.aByte144 | 0x4);
						}
					}
				}
			}
			local118.anIntArray603 = new int[local156];
			if (arg10 != null) {
				local118.anIntArray602 = new int[local156];
			}
			local118.aShortArray181 = new short[local156];
			local118.aShortArray175 = new short[local156];
			local118.aShortArray183 = new short[local156];
			if (local454) {
				local118.aShortArray176 = new short[local156];
				local118.aShortArray182 = new short[local156];
			}
			for (local370 = 0; local370 < local126; local370++) {
				if (arg9[local370] >= 0 || arg10 != null && arg10[local370] >= 0) {
					if (arg9[local370] >= 0) {
						local118.anIntArray603[local118.aShort123] = Static161.method2975(arg9[local370]);
					} else {
						local118.anIntArray603[local118.aShort123] = -1;
					}
					if (arg10 != null) {
						if (arg10[local370] == -1) {
							local118.anIntArray602[local118.aShort123] = -1;
						} else {
							local118.anIntArray602[local118.aShort123] = Static161.method2975(arg10[local370]);
						}
					}
					local118.aShortArray181[local118.aShort123] = (short) arg6[local370];
					local118.aShortArray175[local118.aShort123] = (short) arg7[local370];
					local118.aShortArray183[local118.aShort123] = (short) arg8[local370];
					if (local454) {
						if (arg11[local370] == -1 || this.aClass100_Sub2_9.anInterface7_12.method7423(arg11[local370]).aBoolean56) {
							local118.aShortArray176[local118.aShort123] = -1;
						} else {
							local118.aShortArray176[local118.aShort123] = (short) arg11[local370];
							local118.aShortArray182[local118.aShort123] = (short) arg12[local370];
						}
					}
					local118.aShort123++;
				}
			}
			this.aClass383ArrayArray1[arg0][arg1] = local118;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(741) Class12 local741 = new Class12();
			local79 = arg9[0];
			local85 = arg11[0];
			if (arg10 != null) {
				local741.anInt170 = Static523.method7137(this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1], Static161.method2975(arg10[0]));
				if (local79 == -1) {
					local741.aByte6 = (byte) (local741.aByte6 | 0x2);
				}
			}
			if (super.anIntArrayArray53[arg0][arg1] == super.anIntArrayArray53[arg0 + 1][arg1] && super.anIntArrayArray53[arg0][arg1] == super.anIntArrayArray53[arg0 + 1][arg1 + 1] && super.anIntArrayArray53[arg0][arg1] == super.anIntArrayArray53[arg0][arg1 + 1]) {
				local741.aByte6 = (byte) (local741.aByte6 | 0x1);
			}
			@Pc(849) Class44 local849 = null;
			if (local85 != -1) {
				local849 = this.aClass100_Sub2_9.anInterface7_12.method7423(local85);
			}
			if (local849 == null || (local741.aByte6 & 0x2) != 0 || local849.aBoolean56) {
				@Pc(987) short local987 = Static161.method2975(local79);
				local741.aShort8 = (short) Static523.method7137(this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1], local987);
				local741.aShort9 = (short) Static523.method7137(this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1], local987);
				local741.aShort6 = (short) Static523.method7137(this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1], local987);
				local741.aShort5 = (short) Static523.method7137(this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1], local987);
				local741.aShort7 = -1;
			} else {
				local741.aShort8 = (short) (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				local741.aShort9 = (short) (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]);
				local741.aShort6 = (short) (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]);
				local741.aShort5 = (short) (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]);
				local741.aShort7 = (short) local85;
				if (this.method6622(local849.aByte23) || local849.aByte18 != 0 || local849.aByte20 != 0) {
					local741.aByte6 = (byte) (local741.aByte6 | 0x4);
				}
			}
			this.aClass12ArrayArray1[arg0][arg1] = local741;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)V")
	@Override
	public void method7621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6620(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZLclient!jq;Lclient!bf;[I[I[I[II)V")
	private void method6625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class193 arg3, @OriginalArg(4) Class31 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class55 local6 = this.aClass55ArrayArray1[arg0][arg1];
		@Pc(50) int local50;
		@Pc(55) int local55;
		@Pc(60) int local60;
		@Pc(559) int local559;
		@Pc(409) int local409;
		@Pc(469) int local469;
		@Pc(529) int local529;
		@Pc(589) int local589;
		if (local6 == null) {
			@Pc(3142) Class324 local3142 = this.aClass324ArrayArray1[arg0][arg1];
			if (local3142 != null) {
				if (arg9 != 0) {
					if ((local3142.aByte118 & 0x4) == 0) {
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
				if (this.anInt7607 == -1) {
					for (local559 = 0; local559 < local3142.aShort100; local559++) {
						local50 = local3142.aShortArray130[local559] + (arg0 << super.anInt8885);
						local55 = local3142.aShortArray128[local559];
						local60 = local3142.aShortArray127[local559] + (arg1 << super.anInt8885);
						local3222 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local55 + this.aFloat151 * (float) local60;
						if (local3222 <= (float) this.aClass100_Sub2_9.anInt2881) {
							return;
						}
						arg8[local559] = 0;
						if (arg2) {
							local409 = (int) (local3222 - (float) arg3.anInt4970);
							if (local409 > 255) {
								local409 = 255;
							}
							if (local409 > 0) {
								arg8[local559] = local409;
								local469 = local3142.aShortArray125[local559] * local409 / 255;
								if (local469 > 0) {
									local55 -= local469;
								}
							}
						} else if (arg3.aBoolean325) {
							local409 = (int) (local3222 - (float) arg3.anInt4970);
							if (local409 > 0) {
								arg8[local559] = local409;
								if (arg8[local559] > 255) {
									arg8[local559] = 255;
								}
							}
						}
						local3321 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local55 + this.aFloat150 * (float) local60;
						local3342 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local55 + this.aFloat154 * (float) local60;
						arg5[local559] = arg4.anInt529 + (int) (local3321 * (float) this.aClass100_Sub2_9.anInt2887 / local3222);
						arg6[local559] = arg4.anInt532 + (int) (local3342 * (float) this.aClass100_Sub2_9.anInt2894 / local3222);
						arg7[local559] = (int) local3222;
					}
				} else {
					for (local559 = 0; local559 < local3142.aShort100; local559++) {
						local50 = local3142.aShortArray130[local559] + (arg0 << super.anInt8885);
						local55 = local3142.aShortArray128[local559];
						local60 = local3142.aShortArray127[local559] + (arg1 << super.anInt8885);
						local3222 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local55 + this.aFloat151 * (float) local60;
						arg8[local559] = 0;
						if (arg2) {
							local409 = this.anInt7607 - arg3.anInt4970;
							if (local409 > 255) {
								local409 = 255;
							}
							if (local409 > 0) {
								arg8[local559] = local409;
								local469 = local3142.aShortArray125[local559] * local409 / 255;
								if (local469 > 0) {
									local55 -= local469;
								}
							}
						} else if (arg3.aBoolean325) {
							local409 = this.anInt7607 - arg3.anInt4970;
							if (local409 > 0) {
								arg8[local559] = local409;
								if (arg8[local559] > 255) {
									arg8[local559] = 255;
								}
							}
						}
						local3321 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local55 + this.aFloat150 * (float) local60;
						local3342 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local55 + this.aFloat154 * (float) local60;
						arg5[local559] = arg4.anInt529 + (int) (local3321 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
						arg6[local559] = arg4.anInt532 + (int) (local3342 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
						arg7[local559] = (int) local3222;
					}
				}
				@Pc(3620) int local3620;
				@Pc(3624) int local3624;
				@Pc(3628) int local3628;
				@Pc(3632) int local3632;
				@Pc(3636) int local3636;
				@Pc(3648) int local3648;
				if (local3142.aShortArray129 != null) {
					@Pc(3705) short local3705;
					@Pc(3719) int local3719;
					if (this.anInt7607 == -1) {
						for (local559 = 0; local559 < local3142.aShort99; local559++) {
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
								arg4.aBoolean36 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt527 || local3620 > arg4.anInt527 || local3624 > arg4.anInt527;
								local3705 = local3142.aShortArray129[local559];
								if (local3648 >= 765) {
									arg4.method571((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt4969);
								} else if (local3648 > 0) {
									if (local3705 != -1) {
										local3719 = -16777216;
										if (local3705 != -1 && this.method6622(this.aClass100_Sub2_9.anInterface7_12.method7423(local3705).aByte23)) {
											local3719 = -1694498816;
										}
										arg4.method579((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray130[local409] / (float) super.anInt8881, (float) local3142.aShortArray130[local469] / (float) super.anInt8881, (float) local3142.aShortArray130[local529] / (float) super.anInt8881, (float) local3142.aShortArray127[local409] / (float) super.anInt8881, (float) local3142.aShortArray127[local469] / (float) super.anInt8881, (float) local3142.aShortArray127[local529] / (float) super.anInt8881, local3719 | local3142.anIntArray489[local409] & 0xFFFFFF, local3719 | local3142.anIntArray489[local469] & 0xFFFFFF, local3719 | local3142.anIntArray489[local529] & 0xFFFFFF, arg3.anInt4969, arg8[local409], arg8[local469], arg8[local529], local3705);
									} else if ((local3142.anIntArray489[local409] & 0xFFFFFF) != 0) {
										if (local3705 != -1 && this.method6622(this.aClass100_Sub2_9.anInterface7_12.method7423(local3705).aByte23)) {
											arg4.anInt528 = -1694498816;
										}
										arg4.method570((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static518.method7072(arg8[local409] << 24 | arg3.anInt4969, local3142.anIntArray489[local409]), Static518.method7072(arg8[local469] << 24 | arg3.anInt4969, local3142.anIntArray489[local469]), Static518.method7072(arg8[local529] << 24 | arg3.anInt4969, local3142.anIntArray489[local529]));
										arg4.anInt528 = 0;
									}
								} else if (local3705 != -1) {
									local3719 = -16777216;
									if (local3705 != -1 && this.method6622(this.aClass100_Sub2_9.anInterface7_12.method7423(local3705).aByte23)) {
										local3719 = -1694498816;
									}
									arg4.method579((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray130[local409] / (float) super.anInt8881, (float) local3142.aShortArray130[local469] / (float) super.anInt8881, (float) local3142.aShortArray130[local529] / (float) super.anInt8881, (float) local3142.aShortArray127[local409] / (float) super.anInt8881, (float) local3142.aShortArray127[local469] / (float) super.anInt8881, (float) local3142.aShortArray127[local529] / (float) super.anInt8881, local3719 | local3142.anIntArray489[local409] & 0xFFFFFF, local3719 | local3142.anIntArray489[local469] & 0xFFFFFF, local3719 | local3142.anIntArray489[local529] & 0xFFFFFF, 0, 0, 0, 0, local3705);
								} else if ((local3142.anIntArray489[local409] & 0xFFFFFF) != 0) {
									if (local3705 != -1 && this.method6622(this.aClass100_Sub2_9.anInterface7_12.method7423(local3705).aByte23)) {
										arg4.anInt528 = -1694498816;
									}
									arg4.method570((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray489[local409], local3142.anIntArray489[local469], local3142.anIntArray489[local529]);
									arg4.anInt528 = 0;
								}
							}
						}
						return;
					}
					for (local559 = 0; local559 < local3142.aShort99; local559++) {
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
							arg4.aBoolean36 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt527 || local3620 > arg4.anInt527 || local3624 > arg4.anInt527;
							local3705 = local3142.aShortArray129[local559];
							if (local3648 < 765) {
								if (local3705 != -1 && this.method6622(this.aClass100_Sub2_9.anInterface7_12.method7423(local3705).aByte23)) {
									arg4.anInt528 = -1694498816;
								}
								if (local3648 > 0) {
									if (local3705 != -1) {
										local3719 = -16777216;
										if (local3705 != -1 && this.method6622(this.aClass100_Sub2_9.anInterface7_12.method7423(local3705).aByte23)) {
											local3719 = -1694498816;
										}
										arg4.method579((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray130[local409] / (float) super.anInt8881, (float) local3142.aShortArray130[local469] / (float) super.anInt8881, (float) local3142.aShortArray130[local529] / (float) super.anInt8881, (float) local3142.aShortArray127[local409] / (float) super.anInt8881, (float) local3142.aShortArray127[local469] / (float) super.anInt8881, (float) local3142.aShortArray127[local529] / (float) super.anInt8881, local3719 | local3142.anIntArray489[local409] & 0xFFFFFF, local3719 | local3142.anIntArray489[local469] & 0xFFFFFF, local3719 | local3142.anIntArray489[local529] & 0xFFFFFF, arg3.anInt4969, arg8[local409], arg8[local469], arg8[local529], local3705);
									} else if ((local3142.anIntArray489[local409] & 0xFFFFFF) != 0) {
										if (local3705 != -1 && this.method6622(this.aClass100_Sub2_9.anInterface7_12.method7423(local3705).aByte23)) {
											arg4.anInt528 = -1694498816;
										}
										arg4.method570((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static518.method7072(arg8[local409] << 24 | arg3.anInt4969, local3142.anIntArray489[local409]), Static518.method7072(arg8[local469] << 24 | arg3.anInt4969, local3142.anIntArray489[local469]), Static518.method7072(arg8[local529] << 24 | arg3.anInt4969, local3142.anIntArray489[local529]));
										arg4.anInt528 = 0;
									}
								} else if (local3705 != -1) {
									local3719 = -16777216;
									if (local3705 != -1 && this.method6622(this.aClass100_Sub2_9.anInterface7_12.method7423(local3705).aByte23)) {
										local3719 = -1694498816;
									}
									arg4.method579((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray130[local409] / (float) super.anInt8881, (float) local3142.aShortArray130[local469] / (float) super.anInt8881, (float) local3142.aShortArray130[local529] / (float) super.anInt8881, (float) local3142.aShortArray127[local409] / (float) super.anInt8881, (float) local3142.aShortArray127[local469] / (float) super.anInt8881, (float) local3142.aShortArray127[local529] / (float) super.anInt8881, local3719 | local3142.anIntArray489[local409] & 0xFFFFFF, local3719 | local3142.anIntArray489[local469] & 0xFFFFFF, local3719 | local3142.anIntArray489[local529] & 0xFFFFFF, 0, 0, 0, 0, local3705);
								} else if ((local3142.anIntArray489[local409] & 0xFFFFFF) != 0) {
									if (local3705 != -1 && this.method6622(this.aClass100_Sub2_9.anInterface7_12.method7423(local3705).aByte23)) {
										arg4.anInt528 = -1694498816;
									}
									arg4.method570((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray489[local409], local3142.anIntArray489[local469], local3142.anIntArray489[local529]);
									arg4.anInt528 = 0;
								}
								arg4.anInt528 = 0;
							} else {
								arg4.method571((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt4969);
							}
						}
					}
					return;
				}
				for (local559 = 0; local559 < local3142.aShort99; local559++) {
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
						arg4.aBoolean36 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt527 || local3620 > arg4.anInt527 || local3624 > arg4.anInt527;
						if (local3648 >= 765) {
							arg4.method571((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt4969);
						} else if (local3648 > 0) {
							if ((local3142.anIntArray489[local409] & 0xFFFFFF) != 0) {
								arg4.method570((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static90.method1406(arg3.anInt4969, arg8[local409], local3142.anIntArray489[local409]), Static90.method1406(arg3.anInt4969, arg8[local469], local3142.anIntArray489[local469]), Static90.method1406(arg3.anInt4969, arg8[local529], local3142.anIntArray489[local529]));
							}
						} else if ((local3142.anIntArray489[local409] & 0xFFFFFF) != 0) {
							arg4.method570((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray489[local409], local3142.anIntArray489[local469], local3142.anIntArray489[local529]);
						}
					}
				}
			}
		} else if ((local6.aByte24 & 0x2) == 0) {
			if (arg9 != 0) {
				if ((local6.aByte24 & 0x4) == 0) {
					if ((arg9 & 0x2) != 0) {
						return;
					}
				} else if ((arg9 & 0x1) != 0) {
					return;
				}
			}
			@Pc(45) int local45 = arg0 * super.anInt8881;
			local50 = local45 + super.anInt8881;
			local55 = arg1 * super.anInt8881;
			local60 = local55 + super.anInt8881;
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
			if ((local6.aByte24 & 0x1) == 0 || arg2) {
				local84 = super.anIntArrayArray53[arg0][arg1];
				local863 = super.anIntArrayArray53[arg0 + 1][arg1];
				local874 = super.anIntArrayArray53[arg0 + 1][arg1 + 1];
				@Pc(883) int local883 = super.anIntArrayArray53[arg0][arg1 + 1];
				if (this.anInt7607 == -1) {
					local111 = this.aFloat156 + this.aFloat159 * (float) local45 + this.aFloat158 * (float) local84 + this.aFloat151 * (float) local55;
					if (local111 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local137 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local863 + this.aFloat151 * (float) local55;
					if (local137 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local163 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local874 + this.aFloat151 * (float) local60;
					if (local163 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local189 = this.aFloat156 + this.aFloat159 * (float) local45 + this.aFloat158 * (float) local883 + this.aFloat151 * (float) local60;
					if (local189 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
				} else {
					local111 = this.aFloat156 + this.aFloat159 * (float) local45 + this.aFloat158 * (float) local84 + this.aFloat151 * (float) local55;
					local137 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local863 + this.aFloat151 * (float) local55;
					local163 = this.aFloat156 + this.aFloat159 * (float) local50 + this.aFloat158 * (float) local874 + this.aFloat151 * (float) local60;
					local189 = this.aFloat156 + this.aFloat159 * (float) local45 + this.aFloat158 * (float) local883 + this.aFloat151 * (float) local60;
				}
				if (arg2) {
					local276 = (int) (local111 - (float) arg3.anInt4970);
					if (local276 > 255) {
						local276 = 255;
					}
					@Pc(1116) int local1116;
					if (local276 > 0) {
						local62 = local276;
						local1116 = local6.aShort30 * local276 / 255;
						if (local1116 > 0) {
							local84 -= local1116;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt4970);
					if (local276 > 255) {
						local276 = 255;
					}
					if (local276 > 0) {
						local64 = local276;
						local1116 = local6.aShort31 * local276 / 255;
						if (local1116 > 0) {
							local863 -= local1116;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt4970);
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
					local276 = (int) (local189 - (float) arg3.anInt4970);
					if (local276 > 255) {
						local276 = 255;
					}
					if (local276 > 0) {
						local68 = local276;
						local1116 = local6.aShort29 * local276 / 255;
						if (local1116 > 0) {
							local883 -= local1116;
						}
					}
				} else if (arg3.aBoolean325) {
					local276 = (int) (local111 - (float) arg3.anInt4970);
					if (local276 > 0) {
						local62 = local276;
						if (local276 > 255) {
							local62 = 255;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt4970);
					if (local276 > 0) {
						local64 = local276;
						if (local276 > 255) {
							local64 = 255;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt4970);
					if (local276 > 0) {
						local66 = local276;
						if (local276 > 255) {
							local66 = 255;
						}
					}
					local276 = (int) (local189 - (float) arg3.anInt4970);
					if (local276 > 0) {
						local68 = local276;
						if (local276 > 255) {
							local68 = 255;
						}
					}
				}
				if (this.anInt7607 == -1) {
					local366 = this.aFloat152 + this.aFloat157 * (float) local45 + this.aFloat161 * (float) local84 + this.aFloat150 * (float) local55;
					local379 = arg4.anInt529 + (int) (local366 * (float) this.aClass100_Sub2_9.anInt2887 / local111);
					local396 = this.aFloat153 + this.aFloat155 * (float) local45 + this.aFloat160 * (float) local84 + this.aFloat154 * (float) local55;
					local409 = arg4.anInt532 + (int) (local396 * (float) this.aClass100_Sub2_9.anInt2894 / local111);
					local426 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local863 + this.aFloat150 * (float) local55;
					local439 = arg4.anInt529 + (int) (local426 * (float) this.aClass100_Sub2_9.anInt2887 / local137);
					local456 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local863 + this.aFloat154 * (float) local55;
					local469 = arg4.anInt532 + (int) (local456 * (float) this.aClass100_Sub2_9.anInt2894 / local137);
					local486 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local874 + this.aFloat150 * (float) local60;
					local499 = arg4.anInt529 + (int) (local486 * (float) this.aClass100_Sub2_9.anInt2887 / local163);
					local516 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local874 + this.aFloat154 * (float) local60;
					local529 = arg4.anInt532 + (int) (local516 * (float) this.aClass100_Sub2_9.anInt2894 / local163);
					local546 = this.aFloat152 + this.aFloat157 * (float) local45 + this.aFloat161 * (float) local883 + this.aFloat150 * (float) local60;
					local559 = arg4.anInt529 + (int) (local546 * (float) this.aClass100_Sub2_9.anInt2887 / local189);
					local576 = this.aFloat153 + this.aFloat155 * (float) local45 + this.aFloat160 * (float) local883 + this.aFloat154 * (float) local60;
					local589 = arg4.anInt532 + (int) (local576 * (float) this.aClass100_Sub2_9.anInt2894 / local189);
				} else {
					local366 = this.aFloat152 + this.aFloat157 * (float) local45 + this.aFloat161 * (float) local84 + this.aFloat150 * (float) local55;
					local379 = arg4.anInt529 + (int) (local366 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local396 = this.aFloat153 + this.aFloat155 * (float) local45 + this.aFloat160 * (float) local84 + this.aFloat154 * (float) local55;
					local409 = arg4.anInt532 + (int) (local396 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local426 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local863 + this.aFloat150 * (float) local55;
					local439 = arg4.anInt529 + (int) (local426 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local456 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local863 + this.aFloat154 * (float) local55;
					local469 = arg4.anInt532 + (int) (local456 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local486 = this.aFloat152 + this.aFloat157 * (float) local50 + this.aFloat161 * (float) local874 + this.aFloat150 * (float) local60;
					local499 = arg4.anInt529 + (int) (local486 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local516 = this.aFloat153 + this.aFloat155 * (float) local50 + this.aFloat160 * (float) local874 + this.aFloat154 * (float) local60;
					local529 = arg4.anInt532 + (int) (local516 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local546 = this.aFloat152 + this.aFloat157 * (float) local45 + this.aFloat161 * (float) local883 + this.aFloat150 * (float) local60;
					local559 = arg4.anInt529 + (int) (local546 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local576 = this.aFloat153 + this.aFloat155 * (float) local45 + this.aFloat160 * (float) local883 + this.aFloat154 * (float) local60;
					local589 = arg4.anInt532 + (int) (local576 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
				}
			} else {
				local84 = super.anIntArrayArray53[arg0][arg1];
				@Pc(90) float local90 = this.aFloat158 * (float) local84;
				if (this.anInt7607 == -1) {
					local111 = this.aFloat156 + this.aFloat159 * (float) local45 + local90 + this.aFloat151 * (float) local55;
					if (local111 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local137 = this.aFloat156 + this.aFloat159 * (float) local50 + local90 + this.aFloat151 * (float) local55;
					if (local137 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local163 = this.aFloat156 + this.aFloat159 * (float) local50 + local90 + this.aFloat151 * (float) local60;
					if (local163 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
					local189 = this.aFloat156 + this.aFloat159 * (float) local45 + local90 + this.aFloat151 * (float) local60;
					if (local189 <= (float) this.aClass100_Sub2_9.anInt2881) {
						return;
					}
				} else {
					local111 = this.aFloat156 + this.aFloat159 * (float) local45 + local90 + this.aFloat151 * (float) local55;
					local137 = this.aFloat156 + this.aFloat159 * (float) local50 + local90 + this.aFloat151 * (float) local55;
					local163 = this.aFloat156 + this.aFloat159 * (float) local50 + local90 + this.aFloat151 * (float) local60;
					local189 = this.aFloat156 + this.aFloat159 * (float) local45 + local90 + this.aFloat151 * (float) local60;
				}
				if (arg3.aBoolean325) {
					local276 = (int) (local111 - (float) arg3.anInt4970);
					if (local276 > 0) {
						local62 = local276;
						if (local276 > 255) {
							local62 = 255;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt4970);
					if (local276 > 0) {
						local64 = local276;
						if (local276 > 255) {
							local64 = 255;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt4970);
					if (local276 > 0) {
						local66 = local276;
						if (local276 > 255) {
							local66 = 255;
						}
					}
					local276 = (int) (local189 - (float) arg3.anInt4970);
					if (local276 > 0) {
						local68 = local276;
						if (local276 > 255) {
							local68 = 255;
						}
					}
				}
				@Pc(339) float local339 = this.aFloat161 * (float) local84;
				@Pc(345) float local345 = this.aFloat160 * (float) local84;
				if (this.anInt7607 == -1) {
					local366 = this.aFloat152 + this.aFloat157 * (float) local45 + local339 + this.aFloat150 * (float) local55;
					local379 = arg4.anInt529 + (int) (local366 * (float) this.aClass100_Sub2_9.anInt2887 / local111);
					local396 = this.aFloat153 + this.aFloat155 * (float) local45 + local345 + this.aFloat154 * (float) local55;
					local409 = arg4.anInt532 + (int) (local396 * (float) this.aClass100_Sub2_9.anInt2894 / local111);
					local426 = this.aFloat152 + this.aFloat157 * (float) local50 + local339 + this.aFloat150 * (float) local55;
					local439 = arg4.anInt529 + (int) (local426 * (float) this.aClass100_Sub2_9.anInt2887 / local137);
					local456 = this.aFloat153 + this.aFloat155 * (float) local50 + local345 + this.aFloat154 * (float) local55;
					local469 = arg4.anInt532 + (int) (local456 * (float) this.aClass100_Sub2_9.anInt2894 / local137);
					local486 = this.aFloat152 + this.aFloat157 * (float) local50 + local339 + this.aFloat150 * (float) local60;
					local499 = arg4.anInt529 + (int) (local486 * (float) this.aClass100_Sub2_9.anInt2887 / local163);
					local516 = this.aFloat153 + this.aFloat155 * (float) local50 + local345 + this.aFloat154 * (float) local60;
					local529 = arg4.anInt532 + (int) (local516 * (float) this.aClass100_Sub2_9.anInt2894 / local163);
					local546 = this.aFloat152 + this.aFloat157 * (float) local45 + local339 + this.aFloat150 * (float) local60;
					local559 = arg4.anInt529 + (int) (local546 * (float) this.aClass100_Sub2_9.anInt2887 / local189);
					local576 = this.aFloat153 + this.aFloat155 * (float) local45 + local345 + this.aFloat154 * (float) local60;
					local589 = arg4.anInt532 + (int) (local576 * (float) this.aClass100_Sub2_9.anInt2894 / local189);
				} else {
					local366 = this.aFloat152 + this.aFloat157 * (float) local45 + local339 + this.aFloat150 * (float) local55;
					local379 = arg4.anInt529 + (int) (local366 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local396 = this.aFloat153 + this.aFloat155 * (float) local45 + local345 + this.aFloat154 * (float) local55;
					local409 = arg4.anInt532 + (int) (local396 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local426 = this.aFloat152 + this.aFloat157 * (float) local50 + local339 + this.aFloat150 * (float) local55;
					local439 = arg4.anInt529 + (int) (local426 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local456 = this.aFloat153 + this.aFloat155 * (float) local50 + local345 + this.aFloat154 * (float) local55;
					local469 = arg4.anInt532 + (int) (local456 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local486 = this.aFloat152 + this.aFloat157 * (float) local50 + local339 + this.aFloat150 * (float) local60;
					local499 = arg4.anInt529 + (int) (local486 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local516 = this.aFloat153 + this.aFloat155 * (float) local50 + local345 + this.aFloat154 * (float) local60;
					local529 = arg4.anInt532 + (int) (local516 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
					local546 = this.aFloat152 + this.aFloat157 * (float) local45 + local339 + this.aFloat150 * (float) local60;
					local559 = arg4.anInt529 + (int) (local546 * (float) this.aClass100_Sub2_9.anInt2887 / (float) this.anInt7607);
					local576 = this.aFloat153 + this.aFloat155 * (float) local45 + local345 + this.aFloat154 * (float) local60;
					local589 = arg4.anInt532 + (int) (local576 * (float) this.aClass100_Sub2_9.anInt2894 / (float) this.anInt7607);
				}
			}
			@Pc(1864) boolean local1864 = local6.aShort27 != -1 && this.method6622(this.aClass100_Sub2_9.anInterface7_12.method7423(local6.aShort27).aByte23);
			if (this.anInt7607 == -1) {
				local863 = local64 + local66 + local68;
				if ((local499 - local559) * (local469 - local589) - (local529 - local589) * (local439 - local559) > 0) {
					arg4.aBoolean36 = local499 < 0 || local559 < 0 || local439 < 0 || local499 > arg4.anInt527 || local559 > arg4.anInt527 || local439 > arg4.anInt527;
					if (local863 >= 765) {
						arg4.method571((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, arg3.anInt4969);
					} else if (local863 > 0) {
						if (local6.aShort27 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method579((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt1055 & 0xFFFFFF, local874 | local6.anInt1057 & 0xFFFFFF, local874 | local6.anInt1056 & 0xFFFFFF, arg3.anInt4969, local66, local68, local64, local6.aShort27);
						} else {
							if (local1864) {
								arg4.anInt528 = 100;
							}
							arg4.method570((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, Static518.method7072(local66 << 24 | arg3.anInt4969, local6.anInt1055), Static518.method7072(local68 << 24 | arg3.anInt4969, local6.anInt1057), Static518.method7072(local64 << 24 | arg3.anInt4969, local6.anInt1056));
							arg4.anInt528 = 0;
						}
					} else if (local6.aShort27 >= 0) {
						local874 = -16777216;
						if (local1864) {
							local874 = -1694498816;
						}
						arg4.method579((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt1055 & 0xFFFFFF, local874 | local6.anInt1057 & 0xFFFFFF, local874 | local6.anInt1056 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort27);
					} else {
						if (local1864) {
							arg4.anInt528 = 100;
						}
						arg4.method570((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, local6.anInt1055, local6.anInt1057, local6.anInt1056);
						arg4.anInt528 = 0;
					}
				}
				local863 = local62 + local64 + local68;
				if ((local379 - local439) * (local589 - local469) - (local409 - local469) * (local559 - local439) > 0) {
					arg4.aBoolean36 = local379 < 0 || local439 < 0 || local559 < 0 || local379 > arg4.anInt527 || local439 > arg4.anInt527 || local559 > arg4.anInt527;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt528 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort27 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method579((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt1058 & 0xFFFFFF, local874 | local6.anInt1056 & 0xFFFFFF, local874 | local6.anInt1057 & 0xFFFFFF, arg3.anInt4969, local62, local64, local68, local6.aShort27);
								return;
							}
							if (local1864) {
								arg4.anInt528 = 100;
							}
							arg4.method570((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, Static518.method7072(local62 << 24 | arg3.anInt4969, local6.anInt1058), Static518.method7072(local64 << 24 | arg3.anInt4969, local6.anInt1056), Static518.method7072(local68 << 24 | arg3.anInt4969, local6.anInt1057));
							arg4.anInt528 = 0;
							return;
						}
						if (local6.aShort27 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method579((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt1058 & 0xFFFFFF, local874 | local6.anInt1056 & 0xFFFFFF, local874 | local6.anInt1057 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort27);
							return;
						}
						if (local1864) {
							arg4.anInt528 = 100;
						}
						arg4.method570((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, local6.anInt1058, local6.anInt1056, local6.anInt1057);
						arg4.anInt528 = 0;
						return;
					}
					arg4.method571((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, arg3.anInt4969);
					return;
				}
			} else {
				local863 = local64 + local66 + local68;
				if ((local499 - local559) * (local469 - local589) - (local529 - local589) * (local439 - local559) > 0) {
					arg4.aBoolean36 = local499 < 0 || local559 < 0 || local439 < 0 || local499 > arg4.anInt527 || local559 > arg4.anInt527 || local439 > arg4.anInt527;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt528 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort27 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method579((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt1055 & 0xFFFFFF, local874 | local6.anInt1057 & 0xFFFFFF, local874 | local6.anInt1056 & 0xFFFFFF, arg3.anInt4969, local66, local68, local64, local6.aShort27);
							} else {
								if (local1864) {
									arg4.anInt528 = 100;
								}
								arg4.method570((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, Static518.method7072(local66 << 24 | arg3.anInt4969, local6.anInt1055), Static518.method7072(local68 << 24 | arg3.anInt4969, local6.anInt1057), Static518.method7072(local64 << 24 | arg3.anInt4969, local6.anInt1056));
								arg4.anInt528 = 0;
							}
						} else if (local6.aShort27 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method579((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt1055 & 0xFFFFFF, local874 | local6.anInt1057 & 0xFFFFFF, local874 | local6.anInt1056 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort27);
						} else {
							if (local1864) {
								arg4.anInt528 = 100;
							}
							arg4.method570((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, local6.anInt1055, local6.anInt1057, local6.anInt1056);
							arg4.anInt528 = 0;
						}
					} else {
						arg4.method571((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, arg3.anInt4969);
					}
				}
				local863 = local62 + local64 + local68;
				if ((local379 - local439) * (local589 - local469) - (local409 - local469) * (local559 - local439) > 0) {
					arg4.aBoolean36 = local379 < 0 || local439 < 0 || local559 < 0 || local379 > arg4.anInt527 || local439 > arg4.anInt527 || local559 > arg4.anInt527;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt528 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort27 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method579((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt1058 & 0xFFFFFF, local874 | local6.anInt1056 & 0xFFFFFF, local874 | local6.anInt1057 & 0xFFFFFF, arg3.anInt4969, local62, local64, local68, local6.aShort27);
								return;
							}
							if (local1864) {
								arg4.anInt528 = 100;
							}
							arg4.method570((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, Static518.method7072(local62 << 24 | arg3.anInt4969, local6.anInt1058), Static518.method7072(local64 << 24 | arg3.anInt4969, local6.anInt1056), Static518.method7072(local68 << 24 | arg3.anInt4969, local6.anInt1057));
							arg4.anInt528 = 0;
							return;
						}
						if (local6.aShort27 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method579((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt1058 & 0xFFFFFF, local874 | local6.anInt1056 & 0xFFFFFF, local874 | local6.anInt1057 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort27);
							return;
						}
						if (local1864) {
							arg4.anInt528 = 100;
						}
						arg4.method570((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, local6.anInt1058, local6.anInt1056, local6.anInt1057);
						arg4.anInt528 = 0;
						return;
					}
					arg4.method571((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, arg3.anInt4969);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7624(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class193 local4 = this.aClass100_Sub2_9.method2728(Thread.currentThread());
		@Pc(7) Class31 local7 = local4.aClass31_1;
		local7.anInt528 = 0;
		local7.aBoolean36 = true;
		this.aClass100_Sub2_9.ya();
		if (this.aClass55ArrayArray1 != null || this.aClass366ArrayArray1 != null) {
			this.method6624(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray289, local4.anIntArray286);
		} else if (this.aClass12ArrayArray1 != null) {
			this.method6626(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray289, local4.anIntArray286);
		}
	}

	@OriginalMember(owner = "client!pu", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		this.aByteArrayArray18 = null;
		this.aByteArrayArray19 = null;
	}

	@OriginalMember(owner = "client!pu", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) boolean local9 = (this.anInt7606 & 0x20) == 0;
		if (this.aClass55ArrayArray1 == null && !local9) {
			this.aClass55ArrayArray1 = new Class55[super.anInt8883][super.anInt8878];
			this.aClass324ArrayArray1 = new Class324[super.anInt8883][super.anInt8878];
		} else if (this.aClass366ArrayArray1 == null && local9) {
			this.aClass366ArrayArray1 = new Class366[super.anInt8883][super.anInt8878];
		} else if (this.aClass12ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(67) int local67 = 0; local67 < arg6.length; local67++) {
			if (arg6[local67] == -1) {
				arg6[local67] = 0;
			} else {
				arg6[local67] = Static305.anIntArray314[Static161.method2975(arg6[local67]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(106) int local106 = 0; local106 < arg7.length; local106++) {
				if (arg7[local106] == -1) {
					arg7[local106] = 0;
				} else {
					arg7[local106] = Static305.anIntArray314[Static161.method2975(arg7[local106]) & 0xFFFF] << 8 | 0xFF;
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
			@Pc(147) Class366 local147 = new Class366();
			local147.aShort108 = (short) arg2.length;
			local147.aShort109 = (short) (arg2.length / 3);
			local147.aShortArray145 = new short[local147.aShort108];
			local147.aShortArray142 = new short[local147.aShort108];
			local147.aShortArray147 = new short[local147.aShort108];
			local147.anIntArray548 = new int[local147.aShort108];
			local147.aShortArray143 = new short[local147.aShort108];
			local147.aShortArray144 = new short[local147.aShort108];
			local147.aByteArray102 = new byte[local147.aShort108];
			if (arg5 != null) {
				local147.aShortArray146 = new short[local147.aShort108];
			}
			for (local205 = 0; local205 < local147.aShort108; local205++) {
				local210 = arg2[local205];
				local214 = arg4[local205];
				if (local210 == 0 && local214 == 0) {
					local236 = this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1];
				} else if (local210 == 0 && local214 == super.anInt8881) {
					local236 = this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1];
				} else if (local210 == super.anInt8881 && local214 == super.anInt8881) {
					local236 = this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1];
				} else if (local210 == super.anInt8881 && local214 == 0) {
					local236 = this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1];
				} else {
					local363 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]) * (super.anInt8881 - local210) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]) * local210;
					local410 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]) * (super.anInt8881 - local210) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]) * local210;
					local236 = local363 * (super.anInt8881 - local214) + local410 * local214 >> super.anInt8885 * 2;
				}
				local363 = (arg0 << super.anInt8885) + local210;
				local410 = (arg1 << super.anInt8885) + local214;
				local147.aShortArray145[local205] = (short) local210;
				local147.aShortArray147[local205] = (short) local214;
				local147.aShortArray142[local205] = (short) (this.method7625(local363, local410) + (arg3 == null ? 0 : arg3[local205]));
				if (local236 < 0) {
					local236 = 0;
				}
				if (arg6[local205] == 0) {
					local147.anIntArray548[local205] = 0;
					if (arg7 != null) {
						local147.aByteArray102[local205] = (byte) local236;
					}
				} else {
					local498 = 0;
					if (arg5 != null) {
						@Pc(510) short local510 = local147.aShortArray146[local205] = (short) arg5[local205];
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
					if (arg8[local205] != -1 && this.method6622(this.aClass100_Sub2_9.anInterface7_12.method7423(arg8[local205]).aByte23)) {
						local530 = -1694498816;
					}
					local147.anIntArray548[local205] = local530 | Static90.method1406(arg10, local498, Static691.method6627(arg6[local205] >> 8, local236));
					if (arg7 != null) {
						local147.aByteArray102[local205] = (byte) local236;
					}
				}
				local147.aShortArray143[local205] = (short) arg8[local205];
				local147.aShortArray144[local205] = (short) arg9[local205];
			}
			if (arg7 != null) {
				local147.anIntArray547 = new int[local147.aShort109];
			}
			for (local210 = 0; local210 < local147.aShort109; local210++) {
				local214 = local210 * 3;
				if (arg7 != null && arg7[local214] != 0) {
					local147.anIntArray547[local210] = arg7[local214] >> 8 | 0xFF000000;
				}
			}
			this.aClass366ArrayArray1[arg0][arg1] = local147;
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
				} else if (arg2[local363] == super.anInt8881 && arg4[local363] == 0) {
					if (local210 != -1 && arg6[local210] != arg6[local363]) {
						local654 = false;
						break;
					}
					local210 = local363;
				} else if (arg2[local363] == super.anInt8881 && arg4[local363] == super.anInt8881) {
					if (local214 != -1 && arg6[local214] != arg6[local363]) {
						local654 = false;
						break;
					}
					local214 = local363;
				} else if (arg2[local363] == 0 && arg4[local363] == super.anInt8881) {
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
						if (arg2[local410] != arg2[0] && arg2[local410] != arg2[0] + super.anInt8881 && arg2[local410] != arg2[0] - super.anInt8881) {
							local654 = false;
							break;
						}
						if (arg4[local410] != arg4[0] && arg4[local410] != arg4[0] + super.anInt8881 && arg4[local410] != arg4[0] - super.anInt8881) {
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
			@Pc(1760) Class324 local1760 = new Class324();
			local1760.aShort100 = (short) arg2.length;
			local1760.aShort99 = (short) (arg2.length / 3);
			local1760.aShortArray130 = new short[local1760.aShort100];
			local1760.aShortArray128 = new short[local1760.aShort100];
			local1760.aShortArray127 = new short[local1760.aShort100];
			local1760.anIntArray489 = new int[local1760.aShort100];
			if (arg5 != null) {
				local1760.aShortArray125 = new short[local1760.aShort100];
			}
			@Pc(1834) int local1834;
			@Pc(1961) int local1961;
			@Pc(2008) int local2008;
			@Pc(2098) int local2098;
			for (local410 = 0; local410 < local1760.aShort100; local410++) {
				local498 = arg2[local410];
				local530 = arg4[local410];
				if (local498 == 0 && local530 == 0) {
					local1834 = this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1];
				} else if (local498 == 0 && local530 == super.anInt8881) {
					local1834 = this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1];
				} else if (local498 == super.anInt8881 && local530 == super.anInt8881) {
					local1834 = this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1];
				} else if (local498 == super.anInt8881 && local530 == 0) {
					local1834 = this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1];
				} else {
					local1961 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]) * (super.anInt8881 - local498) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]) * local498;
					local2008 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]) * (super.anInt8881 - local498) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]) * local498;
					local1834 = local1961 * (super.anInt8881 - local530) + local2008 * local530 >> super.anInt8885 * 2;
				}
				local1961 = (arg0 << super.anInt8885) + local498;
				local2008 = (arg1 << super.anInt8885) + local530;
				local1760.aShortArray130[local410] = (short) local498;
				local1760.aShortArray127[local410] = (short) local530;
				local1760.aShortArray128[local410] = (short) (this.method7625(local1961, local2008) + (arg3 == null ? 0 : arg3[local410]));
				if (local1834 < 0) {
					local1834 = 0;
				}
				if (arg6[local410] != 0) {
					local2098 = 0;
					if (arg5 != null) {
						@Pc(2110) short local2110 = local1760.aShortArray125[local410] = (short) arg5[local410];
						if (arg11 != 0) {
							local2098 = local2110 * 255 / arg11;
							if (local2098 < 0) {
								local2098 = 0;
							} else if (local2098 > 255) {
								local2098 = 255;
							}
						}
					}
					local1760.anIntArray489[local410] = Static90.method1406(arg10, local2098, Static691.method6627(arg6[local410] >> 8, local1834));
					if (arg7 != null) {
						local1760.anIntArray489[local410] |= local1834 << 25;
					}
				} else if (arg7 == null) {
					local1760.anIntArray489[local410] = 0;
				} else {
					local1760.anIntArray489[local410] = local1834 << 25;
				}
			}
			@Pc(2164) boolean local2164 = false;
			for (local530 = 0; local530 < local1760.aShort99; local530++) {
				if (arg8[local530 * 3] != -1 && !this.aClass100_Sub2_9.anInterface7_12.method7423(arg8[local530 * 3]).aBoolean56) {
					local2164 = true;
				}
			}
			if (arg7 != null) {
				local1760.anIntArray490 = new int[local1760.aShort99];
			}
			if (local2164) {
				local1760.aShortArray129 = new short[local1760.aShort99];
				local1760.aShortArray126 = new short[local1760.aShort99];
			}
			for (local1834 = 0; local1834 < local1760.aShort99; local1834++) {
				local1961 = local1834 * 3;
				if (arg7 != null && arg7[local1961] != 0) {
					local1760.anIntArray490[local1834] = arg7[local1961] >> 8;
				}
				if (local2164) {
					local2008 = local1961 + 1;
					local2098 = local2008 + 1;
					@Pc(2258) boolean local2258 = false;
					@Pc(2260) boolean local2260 = true;
					@Pc(2264) int local2264 = arg8[local1961];
					if (local2264 == -1 || this.aClass100_Sub2_9.anInterface7_12.method7423(local2264).aBoolean56) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					local2264 = arg8[local2008];
					if (local2264 == -1 || this.aClass100_Sub2_9.anInterface7_12.method7423(local2264).aBoolean56) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					local2264 = arg8[local2098];
					if (local2264 == -1 || this.aClass100_Sub2_9.anInterface7_12.method7423(local2264).aBoolean56) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					if (local2260) {
						local1760.aShortArray129[local1834] = (short) local2264;
						local1760.aShortArray126[local1834] = (short) arg9[local1961];
					} else {
						if (local2258) {
							local2264 = arg8[local1961];
							if (local2264 != -1 && !this.aClass100_Sub2_9.anInterface7_12.method7423(local2264).aBoolean56) {
								local1760.anIntArray489[local1961] = Static305.anIntArray314[Static161.method2975(this.aClass100_Sub2_9.anInterface7_12.method7423(local2264).aShort26 & 0xFFFF) & 0xFFFF];
							}
							local2264 = arg8[local2008];
							if (local2264 != -1 && !this.aClass100_Sub2_9.anInterface7_12.method7423(local2264).aBoolean56) {
								local1760.anIntArray489[local2008] = Static305.anIntArray314[Static161.method2975(this.aClass100_Sub2_9.anInterface7_12.method7423(local2264).aShort26 & 0xFFFF) & 0xFFFF];
							}
							local2264 = arg8[local2098];
							if (local2264 != -1 && !this.aClass100_Sub2_9.anInterface7_12.method7423(local2264).aBoolean56) {
								local1760.anIntArray489[local2098] = Static305.anIntArray314[Static161.method2975(this.aClass100_Sub2_9.anInterface7_12.method7423(local2264).aShort26 & 0xFFFF) & 0xFFFF];
							}
						}
						local1760.aShortArray129[local1834] = -1;
					}
				}
			}
			this.aClass324ArrayArray1[arg0][arg1] = local1760;
			return;
		}
		@Pc(931) Class55 local931 = new Class55();
		local410 = arg6[0];
		local498 = arg8[0];
		if (arg7 != null) {
			local931.anInt1054 = arg7[0] >> 8;
			if (local410 == 0) {
				local931.aByte24 = (byte) (local931.aByte24 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (super.anIntArrayArray53[arg0][arg1] == super.anIntArrayArray53[arg0 + 1][arg1] && super.anIntArrayArray53[arg0][arg1] == super.anIntArrayArray53[arg0 + 1][arg1 + 1] && super.anIntArrayArray53[arg0][arg1] == super.anIntArrayArray53[arg0][arg1 + 1]) {
			local931.aByte24 = (byte) (local931.aByte24 | 0x1);
		}
		if (local498 == -1 || (local931.aByte24 & 0x2) != 0 || this.aClass100_Sub2_9.anInterface7_12.method7423(local498).aBoolean56) {
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
			local931.anInt1058 = Static90.method1406(arg10, local530, Static691.method6627(arg6[local205] >> 8, this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]));
			if (local931.anInt1054 != 0) {
				local931.anInt1058 |= this.aByteArrayArray19[arg0][arg1] + 255 - this.aByteArrayArray18[arg0][arg1] << 25;
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
			local931.anInt1056 = Static90.method1406(arg10, local530, Static691.method6627(arg6[local210] >> 8, this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]));
			if (local931.anInt1054 != 0) {
				local931.anInt1056 |= this.aByteArrayArray19[arg0 + 1][arg1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1] << 25;
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
			local931.anInt1055 = Static90.method1406(arg10, local530, Static691.method6627(arg6[local214] >> 8, this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]));
			if (local931.anInt1054 != 0) {
				local931.anInt1055 |= this.aByteArrayArray19[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1 + 1] << 25;
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
			local931.anInt1057 = Static90.method1406(arg10, local530, Static691.method6627(arg6[local236] >> 8, this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]));
			if (local931.anInt1054 != 0) {
				local931.anInt1057 |= this.aByteArrayArray19[arg0][arg1 + 1] + 255 - this.aByteArrayArray18[arg0][arg1 + 1] << 25;
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
			local931.anInt1058 = Static90.method1406(arg10, local530, Static691.method6627(arg6[local205] >> 8, this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]));
			if (local931.anInt1054 != 0) {
				local931.anInt1058 |= this.aByteArrayArray19[arg0][arg1] + 255 - this.aByteArrayArray18[arg0][arg1] << 25;
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
			local931.anInt1056 = Static90.method1406(arg10, local530, Static691.method6627(arg6[local210] >> 8, this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]));
			if (local931.anInt1054 != 0) {
				local931.anInt1056 |= this.aByteArrayArray19[arg0 + 1][arg1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1] << 25;
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
			local931.anInt1055 = Static90.method1406(arg10, local530, Static691.method6627(arg6[local214] >> 8, this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]));
			if (local931.anInt1054 != 0) {
				local931.anInt1055 |= this.aByteArrayArray19[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1 + 1] << 25;
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
			local931.anInt1057 = Static90.method1406(arg10, local530, Static691.method6627(arg6[local236] >> 8, this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]));
			local931.aShort27 = (short) local498;
		}
		if (arg5 != null) {
			local931.aShort28 = (short) arg5[local214];
			local931.aShort29 = (short) arg5[local236];
			local931.aShort31 = (short) arg5[local210];
			local931.aShort30 = (short) arg5[local205];
		}
		this.aClass55ArrayArray1[arg0][arg1] = local931;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIII[[ZLclient!jq;Lclient!bf;[I[I)V")
	private void method6626(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class193 arg5, @OriginalArg(9) Class31 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean326;
		this.aClass100_Sub2_9.C(false);
		arg6.aBoolean34 = false;
		arg6.aBoolean35 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(85) int local85;
					if (this.aClass12ArrayArray1[local32][local35] != null) {
						@Pc(62) Class12 local62 = this.aClass12ArrayArray1[local32][local35];
						if (local62.aShort7 != -1 && (local62.aByte6 & 0x2) == 0 && local62.anInt170 == -1) {
							local85 = this.aClass100_Sub2_9.method2722(local62.aShort7);
							arg6.method568((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static523.method7137(local62.aShort6 & 0xFFFF, local85), (float) Static523.method7137(local62.aShort5 & 0xFFFF, local85), (float) Static523.method7137(local62.aShort9 & 0xFFFF, local85));
							arg6.method568((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static523.method7137(local62.aShort8 & 0xFFFF, local85), (float) Static523.method7137(local62.aShort9 & 0xFFFF, local85), (float) Static523.method7137(local62.aShort5 & 0xFFFF, local85));
						} else if (local62.anInt170 == -1) {
							arg6.method568((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) (local62.aShort6 & 0xFFFF), (float) (local62.aShort5 & 0xFFFF), (float) (local62.aShort9 & 0xFFFF));
							arg6.method568((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local62.aShort8 & 0xFFFF), (float) (local62.aShort9 & 0xFFFF), (float) (local62.aShort5 & 0xFFFF));
						} else {
							local85 = local62.anInt170;
							arg6.method568((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg6.method568((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass383ArrayArray1[local32][local35] != null) {
						@Pc(338) Class383 local338 = this.aClass383ArrayArray1[local32][local35];
						for (local85 = 0; local85 < local338.aShort122; local85++) {
							arg7[local85] = local26 + local338.aShortArray179[local85] * 4 / super.anInt8881;
							arg8[local85] = local30 - local338.aShortArray178[local85] * 4 / super.anInt8881;
						}
						for (@Pc(376) int local376 = 0; local376 < local338.aShort123; local376++) {
							@Pc(382) short local382 = local338.aShortArray181[local376];
							@Pc(387) short local387 = local338.aShortArray175[local376];
							@Pc(392) short local392 = local338.aShortArray183[local376];
							@Pc(396) int local396 = arg7[local382];
							@Pc(400) int local400 = arg7[local387];
							@Pc(404) int local404 = arg7[local392];
							@Pc(408) int local408 = arg8[local382];
							@Pc(412) int local412 = arg8[local387];
							@Pc(416) int local416 = arg8[local392];
							@Pc(432) int local432;
							if (local338.anIntArray602 != null && local338.anIntArray602[local376] != -1) {
								local432 = local338.anIntArray602[local376];
								arg6.method568((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static523.method7137(local338.aShortArray180[local382], local432), (float) Static523.method7137(local338.aShortArray180[local387], local432), (float) Static523.method7137(local338.aShortArray180[local392], local432));
							} else if (local338.aShortArray176 == null || local338.aShortArray176[local376] == -1) {
								local432 = local338.anIntArray603[local376];
								arg6.method568((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static523.method7137(local338.aShortArray180[local382], local432), (float) Static523.method7137(local338.aShortArray180[local387], local432), (float) Static523.method7137(local338.aShortArray180[local392], local432));
							} else {
								local432 = this.aClass100_Sub2_9.method2722(local338.aShortArray176[local376]);
								arg6.method568((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static523.method7137(local338.aShortArray180[local382], local432), (float) Static523.method7137(local338.aShortArray180[local387], local432), (float) Static523.method7137(local338.aShortArray180[local392], local432));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean34 = true;
		this.aClass100_Sub2_9.C(local14);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class10_Sub1 local3 = this.aClass100_Sub2_9.aClass10_Sub1_1;
		this.anInt7607 = arg5;
		this.aFloat157 = local3.aFloat11;
		this.aFloat161 = local3.aFloat10;
		this.aFloat150 = local3.aFloat12;
		this.aFloat152 = local3.aFloat7;
		this.aFloat155 = local3.aFloat2;
		this.aFloat160 = local3.aFloat8;
		this.aFloat154 = local3.aFloat13;
		this.aFloat153 = local3.aFloat4;
		this.aFloat159 = local3.aFloat5;
		this.aFloat158 = local3.aFloat9;
		this.aFloat151 = local3.aFloat6;
		this.aFloat156 = local3.aFloat3;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt8883 && local78 >= 0 && local78 < super.anInt8878) {
						this.method6620(local72, local78, arg6);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!pu", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!ih;[I)V")
	@Override
	public void method7623(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!pu", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub1_Sub15 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub15 arg2) {
		return null;
	}
}
