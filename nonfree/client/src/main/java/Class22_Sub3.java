import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!lia", name = "x", descriptor = "F")
	private float aFloat102;

	@OriginalMember(owner = "client!lia", name = "z", descriptor = "[[Lclient!ifa;")
	private Class171[][] aClass171ArrayArray1;

	@OriginalMember(owner = "client!lia", name = "o", descriptor = "F")
	private float aFloat103;

	@OriginalMember(owner = "client!lia", name = "B", descriptor = "F")
	private float aFloat104;

	@OriginalMember(owner = "client!lia", name = "t", descriptor = "[[Lclient!wf;")
	private Class383[][] aClass383ArrayArray1;

	@OriginalMember(owner = "client!lia", name = "A", descriptor = "[[Lclient!cd;")
	private Class60[][] aClass60ArrayArray1;

	@OriginalMember(owner = "client!lia", name = "C", descriptor = "F")
	private float aFloat105;

	@OriginalMember(owner = "client!lia", name = "q", descriptor = "F")
	private float aFloat106;

	@OriginalMember(owner = "client!lia", name = "u", descriptor = "F")
	private float aFloat107;

	@OriginalMember(owner = "client!lia", name = "k", descriptor = "[[Lclient!hk;")
	private Class162[][] aClass162ArrayArray1;

	@OriginalMember(owner = "client!lia", name = "E", descriptor = "F")
	private float aFloat108;

	@OriginalMember(owner = "client!lia", name = "G", descriptor = "F")
	private float aFloat109;

	@OriginalMember(owner = "client!lia", name = "w", descriptor = "F")
	private float aFloat110;

	@OriginalMember(owner = "client!lia", name = "v", descriptor = "[[Lclient!iq;")
	private Class178[][] aClass178ArrayArray1;

	@OriginalMember(owner = "client!lia", name = "m", descriptor = "F")
	private float aFloat111;

	@OriginalMember(owner = "client!lia", name = "l", descriptor = "F")
	private float aFloat112;

	@OriginalMember(owner = "client!lia", name = "y", descriptor = "F")
	private float aFloat113;

	@OriginalMember(owner = "client!lia", name = "F", descriptor = "I")
	private int anInt6066 = -1;

	@OriginalMember(owner = "client!lia", name = "p", descriptor = "Lclient!cba;")
	private final Class57_Sub1 aClass57_Sub1_5;

	@OriginalMember(owner = "client!lia", name = "n", descriptor = "I")
	private final int anInt6067;

	@OriginalMember(owner = "client!lia", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!lia", name = "r", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lclient!cba;IIII[[I[[II)V")
	public Class22_Sub3(@OriginalArg(0) Class57_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass57_Sub1_5 = arg0;
		this.anInt6067 = arg2;
		this.aByteArrayArray17 = new byte[arg3 + 1][arg4 + 1];
		@Pc(29) int local29 = this.aClass57_Sub1_5.anInt1038 >> 9;
		for (@Pc(31) int local31 = 1; local31 < arg4; local31++) {
			for (@Pc(34) int local34 = 1; local34 < arg3; local34++) {
				@Pc(53) int local53 = arg6[local34 + 1][local31] - arg6[local34 - 1][local31];
				@Pc(69) int local69 = arg6[local34][local31 + 1] - arg6[local34][local31 - 1];
				@Pc(84) int local84 = (int) Math.sqrt((double) (local53 * local53 + arg7 * 512 + local69 * local69));
				@Pc(90) int local90 = (local53 << 8) / local84;
				@Pc(96) int local96 = arg7 * -512 / local84;
				@Pc(102) int local102 = (local69 << 8) / local84;
				@Pc(124) int local124 = local29 + (this.aClass57_Sub1_5.anInt1055 * local90 + this.aClass57_Sub1_5.anInt1046 * local96 + this.aClass57_Sub1_5.anInt1039 * local102 >> 17);
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

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILclient!em;[I[I[I[II)V")
	private void method5189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class110 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7) {
		@Pc(6) Class60 local6 = this.aClass60ArrayArray1[arg0][arg1];
		@Pc(50) int local50;
		@Pc(60) int local60;
		@Pc(480) int local480;
		@Pc(510) int local510;
		if (local6 == null) {
			@Pc(2204) Class178 local2204 = this.aClass178ArrayArray1[arg0][arg1];
			if (local2204 != null) {
				if (arg7 != 0) {
					if ((local2204.aByte66 & 0x4) == 0) {
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
				if (this.anInt6066 == -1) {
					for (local480 = 0; local480 < local2204.aShort54; local480++) {
						local50 = local2204.aShortArray49[local480] + (arg0 << super.anInt9378);
						local2253 = local2204.aShortArray52[local480];
						local60 = local2204.aShortArray56[local480] + (arg1 << super.anInt9378);
						local2284 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local2253 + this.aFloat105 * (float) local60;
						if (local2284 <= (float) this.aClass57_Sub1_5.anInt1028) {
							return;
						}
						local2314 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local2253 + this.aFloat113 * (float) local60;
						local2335 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local2253 + this.aFloat112 * (float) local60;
						arg3[local480] = arg2.anInt2327 + (int) (local2314 * (float) this.aClass57_Sub1_5.anInt1050 / local2284);
						arg4[local480] = arg2.anInt2325 + (int) (local2335 * (float) this.aClass57_Sub1_5.anInt1030 / local2284);
						arg5[local480] = (int) local2284;
					}
				} else {
					for (local480 = 0; local480 < local2204.aShort54; local480++) {
						local50 = local2204.aShortArray49[local480] + (arg0 << super.anInt9378);
						local2253 = local2204.aShortArray52[local480];
						local60 = local2204.aShortArray56[local480] + (arg1 << super.anInt9378);
						local2284 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local2253 + this.aFloat105 * (float) local60;
						local2314 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local2253 + this.aFloat113 * (float) local60;
						local2335 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local2253 + this.aFloat112 * (float) local60;
						arg3[local480] = arg2.anInt2327 + (int) (local2314 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
						arg4[local480] = arg2.anInt2325 + (int) (local2335 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
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
				if (local2204.aShortArray57 != null) {
					@Pc(2753) int local2753;
					@Pc(2622) short local2622;
					if (this.anInt6066 == -1) {
						for (local480 = 0; local480 < local2204.aShort55; local480++) {
							local2531 = local2204.aShortArray50[local480];
							local2536 = local2204.aShortArray54[local480];
							local2541 = local2204.aShortArray51[local480];
							local510 = arg3[local2531];
							local2549 = arg3[local2536];
							local2553 = arg3[local2541];
							local2557 = arg4[local2531];
							local2561 = arg4[local2536];
							local2565 = arg4[local2541];
							if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
								arg2.aBoolean193 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt2329 || local2549 > arg2.anInt2329 || local2553 > arg2.anInt2329;
								local2622 = local2204.aShortArray57[local480];
								if (local2622 == -1) {
									local2753 = local2204.anIntArray253[local480];
									if (local2753 != -1) {
										arg2.method2014((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static52.method789(local2204.aShortArray55[local2531], local2753), (float) Static52.method789(local2204.aShortArray55[local2536], local2753), (float) Static52.method789(local2204.aShortArray55[local2541], local2753));
									}
								} else {
									arg2.method2017((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) local2204.aShortArray49[local2531] / (float) super.anInt9377, (float) local2204.aShortArray49[local2536] / (float) super.anInt9377, (float) local2204.aShortArray49[local2541] / (float) super.anInt9377, (float) local2204.aShortArray56[local2531] / (float) super.anInt9377, (float) local2204.aShortArray56[local2536] / (float) super.anInt9377, (float) local2204.aShortArray56[local2541] / (float) super.anInt9377, Static351.anIntArray337[local2204.aShortArray55[local2531] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local2204.aShortArray55[local2536] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local2204.aShortArray55[local2541] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2622);
								}
							}
						}
						return;
					}
					for (local480 = 0; local480 < local2204.aShort55; local480++) {
						local2531 = local2204.aShortArray50[local480];
						local2536 = local2204.aShortArray54[local480];
						local2541 = local2204.aShortArray51[local480];
						local510 = arg3[local2531];
						local2549 = arg3[local2536];
						local2553 = arg3[local2541];
						local2557 = arg4[local2531];
						local2561 = arg4[local2536];
						local2565 = arg4[local2541];
						if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
							arg2.aBoolean193 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt2329 || local2549 > arg2.anInt2329 || local2553 > arg2.anInt2329;
							local2622 = local2204.aShortArray57[local480];
							if (local2622 == -1) {
								local2753 = local2204.anIntArray253[local480];
								if (local2753 != -1) {
									arg2.method2014((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static52.method789(local2204.aShortArray55[local2531], local2753), (float) Static52.method789(local2204.aShortArray55[local2536], local2753), (float) Static52.method789(local2204.aShortArray55[local2541], local2753));
								}
							} else {
								arg2.method2017((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) local2204.aShortArray49[local2531] / (float) super.anInt9377, (float) local2204.aShortArray49[local2536] / (float) super.anInt9377, (float) local2204.aShortArray49[local2541] / (float) super.anInt9377, (float) local2204.aShortArray56[local2531] / (float) super.anInt9377, (float) local2204.aShortArray56[local2536] / (float) super.anInt9377, (float) local2204.aShortArray56[local2541] / (float) super.anInt9377, Static351.anIntArray337[local2204.aShortArray55[local2531] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local2204.aShortArray55[local2536] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local2204.aShortArray55[local2541] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2622);
							}
						}
					}
					return;
				}
				for (local480 = 0; local480 < local2204.aShort55; local480++) {
					local2531 = local2204.aShortArray50[local480];
					local2536 = local2204.aShortArray54[local480];
					local2541 = local2204.aShortArray51[local480];
					local510 = arg3[local2531];
					local2549 = arg3[local2536];
					local2553 = arg3[local2541];
					local2557 = arg4[local2531];
					local2561 = arg4[local2536];
					local2565 = arg4[local2541];
					if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
						@Pc(3170) int local3170 = local2204.anIntArray253[local480];
						if (local3170 != -1) {
							arg2.aBoolean193 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt2329 || local2549 > arg2.anInt2329 || local2553 > arg2.anInt2329;
							arg2.method2014((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static52.method789(local2204.aShortArray55[local2531], local3170), (float) Static52.method789(local2204.aShortArray55[local2536], local3170), (float) Static52.method789(local2204.aShortArray55[local2541], local3170));
						}
					}
				}
			}
		} else if ((local6.aByte22 & 0x2) == 0) {
			if (arg7 != 0) {
				if ((local6.aByte22 & 0x4) == 0) {
					if ((arg7 & 0x2) != 0) {
						return;
					}
				} else if ((arg7 & 0x1) != 0) {
					return;
				}
			}
			@Pc(45) int local45 = arg0 * super.anInt9377;
			local50 = local45 + super.anInt9377;
			@Pc(55) int local55 = arg1 * super.anInt9377;
			local60 = local55 + super.anInt9377;
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
			if ((local6.aByte22 & 0x1) == 0) {
				local72 = super.anIntArrayArray52[arg0][arg1];
				@Pc(784) int local784 = super.anIntArrayArray52[arg0 + 1][arg1];
				@Pc(795) int local795 = super.anIntArrayArray52[arg0 + 1][arg1 + 1];
				@Pc(804) int local804 = super.anIntArrayArray52[arg0][arg1 + 1];
				if (this.anInt6066 == -1) {
					local99 = this.aFloat103 + this.aFloat106 * (float) local45 + this.aFloat108 * (float) local72 + this.aFloat105 * (float) local55;
					if (local99 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local125 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local784 + this.aFloat105 * (float) local55;
					if (local125 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local151 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local795 + this.aFloat105 * (float) local60;
					if (local151 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local177 = this.aFloat103 + this.aFloat106 * (float) local45 + this.aFloat108 * (float) local804 + this.aFloat105 * (float) local60;
					if (local177 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local287 = this.aFloat109 + this.aFloat107 * (float) local45 + this.aFloat104 * (float) local72 + this.aFloat113 * (float) local55;
					local300 = arg2.anInt2327 + (int) (local287 * (float) this.aClass57_Sub1_5.anInt1050 / local99);
					local317 = this.aFloat111 + this.aFloat110 * (float) local45 + this.aFloat102 * (float) local72 + this.aFloat112 * (float) local55;
					local330 = arg2.anInt2325 + (int) (local317 * (float) this.aClass57_Sub1_5.anInt1030 / local99);
					local347 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local784 + this.aFloat113 * (float) local55;
					local360 = arg2.anInt2327 + (int) (local347 * (float) this.aClass57_Sub1_5.anInt1050 / local125);
					local377 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local784 + this.aFloat112 * (float) local55;
					local390 = arg2.anInt2325 + (int) (local377 * (float) this.aClass57_Sub1_5.anInt1030 / local125);
					local407 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local795 + this.aFloat113 * (float) local60;
					local420 = arg2.anInt2327 + (int) (local407 * (float) this.aClass57_Sub1_5.anInt1050 / local151);
					local437 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local795 + this.aFloat112 * (float) local60;
					local450 = arg2.anInt2325 + (int) (local437 * (float) this.aClass57_Sub1_5.anInt1030 / local151);
					local467 = this.aFloat109 + this.aFloat107 * (float) local45 + this.aFloat104 * (float) local804 + this.aFloat113 * (float) local60;
					local480 = arg2.anInt2327 + (int) (local467 * (float) this.aClass57_Sub1_5.anInt1050 / local177);
					local497 = this.aFloat111 + this.aFloat110 * (float) local45 + this.aFloat102 * (float) local804 + this.aFloat112 * (float) local60;
					local510 = arg2.anInt2325 + (int) (local497 * (float) this.aClass57_Sub1_5.anInt1030 / local177);
				} else {
					local99 = this.aFloat103 + this.aFloat106 * (float) local45 + this.aFloat108 * (float) local72 + this.aFloat105 * (float) local55;
					local125 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local784 + this.aFloat105 * (float) local55;
					local151 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local795 + this.aFloat105 * (float) local60;
					local177 = this.aFloat103 + this.aFloat106 * (float) local45 + this.aFloat108 * (float) local804 + this.aFloat105 * (float) local60;
					local287 = this.aFloat109 + this.aFloat107 * (float) local45 + this.aFloat104 * (float) local72 + this.aFloat113 * (float) local55;
					local300 = arg2.anInt2327 + (int) (local287 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local317 = this.aFloat111 + this.aFloat110 * (float) local45 + this.aFloat102 * (float) local72 + this.aFloat112 * (float) local55;
					local330 = arg2.anInt2325 + (int) (local317 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local347 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local784 + this.aFloat113 * (float) local55;
					local360 = arg2.anInt2327 + (int) (local347 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local377 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local784 + this.aFloat112 * (float) local55;
					local390 = arg2.anInt2325 + (int) (local377 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local407 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local795 + this.aFloat113 * (float) local60;
					local420 = arg2.anInt2327 + (int) (local407 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local437 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local795 + this.aFloat112 * (float) local60;
					local450 = arg2.anInt2325 + (int) (local437 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local467 = this.aFloat109 + this.aFloat107 * (float) local45 + this.aFloat104 * (float) local804 + this.aFloat113 * (float) local60;
					local480 = arg2.anInt2327 + (int) (local467 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local497 = this.aFloat111 + this.aFloat110 * (float) local45 + this.aFloat102 * (float) local804 + this.aFloat112 * (float) local60;
					local510 = arg2.anInt2325 + (int) (local497 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
				}
			} else {
				local72 = super.anIntArrayArray52[arg0][arg1];
				@Pc(78) float local78 = this.aFloat108 * (float) local72;
				if (this.anInt6066 == -1) {
					local99 = this.aFloat103 + this.aFloat106 * (float) local45 + local78 + this.aFloat105 * (float) local55;
					if (local99 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local125 = this.aFloat103 + this.aFloat106 * (float) local50 + local78 + this.aFloat105 * (float) local55;
					if (local125 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local151 = this.aFloat103 + this.aFloat106 * (float) local50 + local78 + this.aFloat105 * (float) local60;
					if (local151 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local177 = this.aFloat103 + this.aFloat106 * (float) local45 + local78 + this.aFloat105 * (float) local60;
					if (local177 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
				} else {
					local99 = this.aFloat103 + this.aFloat106 * (float) local45 + local78 + this.aFloat105 * (float) local55;
					local125 = this.aFloat103 + this.aFloat106 * (float) local50 + local78 + this.aFloat105 * (float) local55;
					local151 = this.aFloat103 + this.aFloat106 * (float) local50 + local78 + this.aFloat105 * (float) local60;
					local177 = this.aFloat103 + this.aFloat106 * (float) local45 + local78 + this.aFloat105 * (float) local60;
				}
				@Pc(260) float local260 = this.aFloat104 * (float) local72;
				@Pc(266) float local266 = this.aFloat102 * (float) local72;
				if (this.anInt6066 == -1) {
					local287 = this.aFloat109 + this.aFloat107 * (float) local45 + local260 + this.aFloat113 * (float) local55;
					local300 = arg2.anInt2327 + (int) (local287 * (float) this.aClass57_Sub1_5.anInt1050 / local99);
					local317 = this.aFloat111 + this.aFloat110 * (float) local45 + local266 + this.aFloat112 * (float) local55;
					local330 = arg2.anInt2325 + (int) (local317 * (float) this.aClass57_Sub1_5.anInt1030 / local99);
					local347 = this.aFloat109 + this.aFloat107 * (float) local50 + local260 + this.aFloat113 * (float) local55;
					local360 = arg2.anInt2327 + (int) (local347 * (float) this.aClass57_Sub1_5.anInt1050 / local125);
					local377 = this.aFloat111 + this.aFloat110 * (float) local50 + local266 + this.aFloat112 * (float) local55;
					local390 = arg2.anInt2325 + (int) (local377 * (float) this.aClass57_Sub1_5.anInt1030 / local125);
					local407 = this.aFloat109 + this.aFloat107 * (float) local50 + local260 + this.aFloat113 * (float) local60;
					local420 = arg2.anInt2327 + (int) (local407 * (float) this.aClass57_Sub1_5.anInt1050 / local151);
					local437 = this.aFloat111 + this.aFloat110 * (float) local50 + local266 + this.aFloat112 * (float) local60;
					local450 = arg2.anInt2325 + (int) (local437 * (float) this.aClass57_Sub1_5.anInt1030 / local151);
					local467 = this.aFloat109 + this.aFloat107 * (float) local45 + local260 + this.aFloat113 * (float) local60;
					local480 = arg2.anInt2327 + (int) (local467 * (float) this.aClass57_Sub1_5.anInt1050 / local177);
					local497 = this.aFloat111 + this.aFloat110 * (float) local45 + local266 + this.aFloat112 * (float) local60;
					local510 = arg2.anInt2325 + (int) (local497 * (float) this.aClass57_Sub1_5.anInt1030 / local177);
				} else {
					local287 = this.aFloat109 + this.aFloat107 * (float) local45 + local260 + this.aFloat113 * (float) local55;
					local300 = arg2.anInt2327 + (int) (local287 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local317 = this.aFloat111 + this.aFloat110 * (float) local45 + local266 + this.aFloat112 * (float) local55;
					local330 = arg2.anInt2325 + (int) (local317 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local347 = this.aFloat109 + this.aFloat107 * (float) local50 + local260 + this.aFloat113 * (float) local55;
					local360 = arg2.anInt2327 + (int) (local347 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local377 = this.aFloat111 + this.aFloat110 * (float) local50 + local266 + this.aFloat112 * (float) local55;
					local390 = arg2.anInt2325 + (int) (local377 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local407 = this.aFloat109 + this.aFloat107 * (float) local50 + local260 + this.aFloat113 * (float) local60;
					local420 = arg2.anInt2327 + (int) (local407 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local437 = this.aFloat111 + this.aFloat110 * (float) local50 + local266 + this.aFloat112 * (float) local60;
					local450 = arg2.anInt2325 + (int) (local437 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local467 = this.aFloat109 + this.aFloat107 * (float) local45 + local260 + this.aFloat113 * (float) local60;
					local480 = arg2.anInt2327 + (int) (local467 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local497 = this.aFloat111 + this.aFloat110 * (float) local45 + local266 + this.aFloat112 * (float) local60;
					local510 = arg2.anInt2325 + (int) (local497 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
				}
			}
			if (this.anInt6066 == -1) {
				if ((local420 - local480) * (local390 - local510) - (local450 - local510) * (local360 - local480) > 0) {
					arg2.aBoolean193 = local420 < 0 || local480 < 0 || local360 < 0 || local420 > arg2.anInt2329 || local480 > arg2.anInt2329 || local360 > arg2.anInt2329;
					if (local6.aShort10 >= 0) {
						arg2.method2017((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, local151, local177, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static351.anIntArray337[local6.aShort13 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local6.aShort9 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local6.aShort11 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort10);
					} else {
						arg2.method2014((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, (float) (int) local151, (float) (int) local177, (float) (int) local125, (float) (local6.aShort13 & 0xFFFF), (float) (local6.aShort9 & 0xFFFF), (float) (local6.aShort11 & 0xFFFF));
					}
				}
				if ((local300 - local360) * (local510 - local390) - (local330 - local390) * (local480 - local360) > 0) {
					arg2.aBoolean193 = local300 < 0 || local360 < 0 || local480 < 0 || local300 > arg2.anInt2329 || local360 > arg2.anInt2329 || local480 > arg2.anInt2329;
					if (local6.aShort10 >= 0) {
						arg2.method2017((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, local99, local125, local177, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static351.anIntArray337[local6.aShort12 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local6.aShort11 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local6.aShort9 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort10);
						return;
					}
					arg2.method2014((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, (float) (int) local99, (float) (int) local125, (float) (int) local177, (float) (local6.aShort12 & 0xFFFF), (float) (local6.aShort11 & 0xFFFF), (float) (local6.aShort9 & 0xFFFF));
					return;
				}
			} else {
				if ((local420 - local480) * (local390 - local510) - (local450 - local510) * (local360 - local480) > 0) {
					arg2.aBoolean193 = local420 < 0 || local480 < 0 || local360 < 0 || local420 > arg2.anInt2329 || local480 > arg2.anInt2329 || local360 > arg2.anInt2329;
					if (local6.aShort10 >= 0) {
						arg2.method2017((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, local151, local177, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static351.anIntArray337[local6.aShort13 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local6.aShort9 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local6.aShort11 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort10);
					} else {
						arg2.method2014((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, (float) (int) local151, (float) (int) local177, (float) (int) local125, (float) (local6.aShort13 & 0xFFFF), (float) (local6.aShort9 & 0xFFFF), (float) (local6.aShort11 & 0xFFFF));
					}
				}
				if ((local300 - local360) * (local510 - local390) - (local330 - local390) * (local480 - local360) > 0) {
					arg2.aBoolean193 = local300 < 0 || local360 < 0 || local480 < 0 || local300 > arg2.anInt2329 || local360 > arg2.anInt2329 || local480 > arg2.anInt2329;
					if (local6.aShort10 >= 0) {
						arg2.method2017((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, local99, local125, local177, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static351.anIntArray337[local6.aShort12 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local6.aShort11 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static351.anIntArray337[local6.aShort9 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort10);
						return;
					}
					arg2.method2014((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, (float) (int) local99, (float) (int) local125, (float) (int) local177, (float) (local6.aShort12 & 0xFFFF), (float) (local6.aShort11 & 0xFFFF), (float) (local6.aShort9 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(IIIIIII[[ZLclient!mp;Lclient!em;[I[I)V")
	private void method5190(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class240 arg5, @OriginalArg(9) Class110 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean497;
		this.aClass57_Sub1_5.C(false);
		arg6.aBoolean192 = false;
		arg6.aBoolean195 = false;
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
					if (this.aClass162ArrayArray1 == null) {
						if (this.aClass171ArrayArray1[local32][local35] != null) {
							@Pc(593) Class171 local593 = this.aClass171ArrayArray1[local32][local35];
							for (local89 = 0; local89 < local593.aShort48; local89++) {
								arg7[local89] = local26 + local593.aShortArray40[local89] * 4 / super.anInt9377;
								arg8[local89] = local30 - local593.aShortArray42[local89] * 4 / super.anInt9377;
							}
							for (local379 = 0; local379 < local593.aShort49; local379++) {
								local384 = local379 * 3;
								local388 = local384 + 1;
								local392 = local388 + 1;
								local396 = arg7[local384];
								local400 = arg7[local388];
								local404 = arg7[local392];
								local408 = arg8[local384];
								local412 = arg8[local388];
								local416 = arg8[local392];
								if (local593.anIntArray243 == null || local593.anIntArray243[local379] == 0) {
									arg6.method2028((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local593.anIntArray242[local384], local593.anIntArray242[local388], local593.anIntArray242[local392]);
								} else {
									local449 = local593.anIntArray243[local379];
									arg6.method2028((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local449, local449, local449);
								}
							}
						}
					} else if (this.aClass162ArrayArray1[local32][local35] != null) {
						@Pc(67) Class162 local67 = this.aClass162ArrayArray1[local32][local35];
						if (local67.aShort37 != -1 && (local67.aByte51 & 0x2) == 0 && local67.anInt3684 == 0) {
							local89 = this.aClass57_Sub1_5.method1074(local67.aShort37);
							arg6.method2014((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static52.method789(local67.anInt3687, local89), (float) Static52.method789(local67.anInt3683, local89), (float) Static52.method789(local67.anInt3686, local89));
							arg6.method2014((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static52.method789(local67.anInt3685, local89), (float) Static52.method789(local67.anInt3686, local89), (float) Static52.method789(local67.anInt3683, local89));
						} else if (local67.anInt3684 == 0) {
							arg6.method2028((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, local67.anInt3687, local67.anInt3683, local67.anInt3686);
							arg6.method2028((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt3685, local67.anInt3686, local67.anInt3683);
						} else {
							local89 = local67.anInt3684;
							arg6.method2028((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, Static288.method4702(local67.anInt3687 & 0xFF000000, local89), Static288.method4702(local67.anInt3683 & 0xFF000000, local89), Static288.method4702(local67.anInt3686 & 0xFF000000, local89));
							arg6.method2028((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, Static288.method4702(local67.anInt3685 & 0xFF000000, local89), Static288.method4702(local67.anInt3686 & 0xFF000000, local89), Static288.method4702(local67.anInt3683 & 0xFF000000, local89));
						}
					} else if (this.aClass383ArrayArray1[local32][local35] != null) {
						@Pc(341) Class383 local341 = this.aClass383ArrayArray1[local32][local35];
						for (local89 = 0; local89 < local341.aShort124; local89++) {
							arg7[local89] = local26 + local341.aShortArray151[local89] * 4 / super.anInt9377;
							arg8[local89] = local30 - local341.aShortArray153[local89] * 4 / super.anInt9377;
						}
						for (local379 = 0; local379 < local341.aShort125; local379++) {
							local384 = local379 * 3;
							local388 = local384 + 1;
							local392 = local388 + 1;
							local396 = arg7[local384];
							local400 = arg7[local388];
							local404 = arg7[local392];
							local408 = arg8[local384];
							local412 = arg8[local388];
							local416 = arg8[local392];
							if (local341.anIntArray611 != null && local341.anIntArray611[local379] != 0 && (local341.aShortArray154 == null || local341.aShortArray154 != null && local341.aShortArray154[local379] == -1)) {
								local449 = local341.anIntArray611[local379];
								arg6.method2028((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, Static288.method4702(-(local341.anIntArray610[local384] & -16777216) - 16777216, local449), Static288.method4702(-(local341.anIntArray610[local388] & -16777216) - 16777216, local449), Static288.method4702(-(local341.anIntArray610[local392] & -16777216) - 16777216, local449));
							} else if (local341.aShortArray154 == null || local341.aShortArray154[local379] == -1) {
								arg6.method2028((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local341.anIntArray610[local384], local341.anIntArray610[local388], local341.anIntArray610[local392]);
							} else {
								local449 = this.aClass57_Sub1_5.method1074(local341.aShortArray154[local379]);
								arg6.method2014((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) local449, (float) local449, (float) local449);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean192 = true;
		this.aClass57_Sub1_5.C(local14);
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(IIZLclient!mp;Lclient!em;[I[I[I[II)V")
	private void method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class240 arg3, @OriginalArg(4) Class110 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class162 local6 = this.aClass162ArrayArray1[arg0][arg1];
		@Pc(50) int local50;
		@Pc(55) int local55;
		@Pc(60) int local60;
		@Pc(559) int local559;
		@Pc(409) int local409;
		@Pc(469) int local469;
		@Pc(529) int local529;
		@Pc(589) int local589;
		if (local6 == null) {
			@Pc(3142) Class383 local3142 = this.aClass383ArrayArray1[arg0][arg1];
			if (local3142 != null) {
				if (arg9 != 0) {
					if ((local3142.aByte149 & 0x4) == 0) {
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
				if (this.anInt6066 == -1) {
					for (local559 = 0; local559 < local3142.aShort124; local559++) {
						local50 = local3142.aShortArray151[local559] + (arg0 << super.anInt9378);
						local55 = local3142.aShortArray156[local559];
						local60 = local3142.aShortArray153[local559] + (arg1 << super.anInt9378);
						local3222 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local55 + this.aFloat105 * (float) local60;
						if (local3222 <= (float) this.aClass57_Sub1_5.anInt1028) {
							return;
						}
						arg8[local559] = 0;
						if (arg2) {
							local409 = (int) (local3222 - (float) arg3.anInt6452);
							if (local409 > 255) {
								local409 = 255;
							}
							if (local409 > 0) {
								arg8[local559] = local409;
								local469 = local3142.aShortArray155[local559] * local409 / 255;
								if (local469 > 0) {
									local55 -= local469;
								}
							}
						} else if (arg3.aBoolean498) {
							local409 = (int) (local3222 - (float) arg3.anInt6452);
							if (local409 > 0) {
								arg8[local559] = local409;
								if (arg8[local559] > 255) {
									arg8[local559] = 255;
								}
							}
						}
						local3321 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local55 + this.aFloat113 * (float) local60;
						local3342 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local55 + this.aFloat112 * (float) local60;
						arg5[local559] = arg4.anInt2327 + (int) (local3321 * (float) this.aClass57_Sub1_5.anInt1050 / local3222);
						arg6[local559] = arg4.anInt2325 + (int) (local3342 * (float) this.aClass57_Sub1_5.anInt1030 / local3222);
						arg7[local559] = (int) local3222;
					}
				} else {
					for (local559 = 0; local559 < local3142.aShort124; local559++) {
						local50 = local3142.aShortArray151[local559] + (arg0 << super.anInt9378);
						local55 = local3142.aShortArray156[local559];
						local60 = local3142.aShortArray153[local559] + (arg1 << super.anInt9378);
						local3222 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local55 + this.aFloat105 * (float) local60;
						arg8[local559] = 0;
						if (arg2) {
							local409 = this.anInt6066 - arg3.anInt6452;
							if (local409 > 255) {
								local409 = 255;
							}
							if (local409 > 0) {
								arg8[local559] = local409;
								local469 = local3142.aShortArray155[local559] * local409 / 255;
								if (local469 > 0) {
									local55 -= local469;
								}
							}
						} else if (arg3.aBoolean498) {
							local409 = this.anInt6066 - arg3.anInt6452;
							if (local409 > 0) {
								arg8[local559] = local409;
								if (arg8[local559] > 255) {
									arg8[local559] = 255;
								}
							}
						}
						local3321 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local55 + this.aFloat113 * (float) local60;
						local3342 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local55 + this.aFloat112 * (float) local60;
						arg5[local559] = arg4.anInt2327 + (int) (local3321 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
						arg6[local559] = arg4.anInt2325 + (int) (local3342 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
						arg7[local559] = (int) local3222;
					}
				}
				@Pc(3620) int local3620;
				@Pc(3624) int local3624;
				@Pc(3628) int local3628;
				@Pc(3632) int local3632;
				@Pc(3636) int local3636;
				@Pc(3648) int local3648;
				if (local3142.aShortArray154 != null) {
					@Pc(3705) short local3705;
					@Pc(3719) int local3719;
					if (this.anInt6066 == -1) {
						for (local559 = 0; local559 < local3142.aShort125; local559++) {
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
								arg4.aBoolean193 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt2329 || local3620 > arg4.anInt2329 || local3624 > arg4.anInt2329;
								local3705 = local3142.aShortArray154[local559];
								if (local3648 >= 765) {
									arg4.method2031((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt6456);
								} else if (local3648 > 0) {
									if (local3705 != -1) {
										local3719 = -16777216;
										if (local3705 != -1 && this.method5193(this.aClass57_Sub1_5.anInterface1_11.method2863(local3705).aByte94)) {
											local3719 = -1694498816;
										}
										arg4.method2017((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray151[local409] / (float) super.anInt9377, (float) local3142.aShortArray151[local469] / (float) super.anInt9377, (float) local3142.aShortArray151[local529] / (float) super.anInt9377, (float) local3142.aShortArray153[local409] / (float) super.anInt9377, (float) local3142.aShortArray153[local469] / (float) super.anInt9377, (float) local3142.aShortArray153[local529] / (float) super.anInt9377, local3719 | local3142.anIntArray610[local409] & 0xFFFFFF, local3719 | local3142.anIntArray610[local469] & 0xFFFFFF, local3719 | local3142.anIntArray610[local529] & 0xFFFFFF, arg3.anInt6456, arg8[local409], arg8[local469], arg8[local529], local3705);
									} else if ((local3142.anIntArray610[local409] & 0xFFFFFF) != 0) {
										if (local3705 != -1 && this.method5193(this.aClass57_Sub1_5.anInterface1_11.method2863(local3705).aByte94)) {
											arg4.anInt2328 = -1694498816;
										}
										arg4.method2028((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static288.method4702(arg8[local409] << 24 | arg3.anInt6456, local3142.anIntArray610[local409]), Static288.method4702(arg8[local469] << 24 | arg3.anInt6456, local3142.anIntArray610[local469]), Static288.method4702(arg8[local529] << 24 | arg3.anInt6456, local3142.anIntArray610[local529]));
										arg4.anInt2328 = 0;
									}
								} else if (local3705 != -1) {
									local3719 = -16777216;
									if (local3705 != -1 && this.method5193(this.aClass57_Sub1_5.anInterface1_11.method2863(local3705).aByte94)) {
										local3719 = -1694498816;
									}
									arg4.method2017((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray151[local409] / (float) super.anInt9377, (float) local3142.aShortArray151[local469] / (float) super.anInt9377, (float) local3142.aShortArray151[local529] / (float) super.anInt9377, (float) local3142.aShortArray153[local409] / (float) super.anInt9377, (float) local3142.aShortArray153[local469] / (float) super.anInt9377, (float) local3142.aShortArray153[local529] / (float) super.anInt9377, local3719 | local3142.anIntArray610[local409] & 0xFFFFFF, local3719 | local3142.anIntArray610[local469] & 0xFFFFFF, local3719 | local3142.anIntArray610[local529] & 0xFFFFFF, 0, 0, 0, 0, local3705);
								} else if ((local3142.anIntArray610[local409] & 0xFFFFFF) != 0) {
									if (local3705 != -1 && this.method5193(this.aClass57_Sub1_5.anInterface1_11.method2863(local3705).aByte94)) {
										arg4.anInt2328 = -1694498816;
									}
									arg4.method2028((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray610[local409], local3142.anIntArray610[local469], local3142.anIntArray610[local529]);
									arg4.anInt2328 = 0;
								}
							}
						}
						return;
					}
					for (local559 = 0; local559 < local3142.aShort125; local559++) {
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
							arg4.aBoolean193 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt2329 || local3620 > arg4.anInt2329 || local3624 > arg4.anInt2329;
							local3705 = local3142.aShortArray154[local559];
							if (local3648 < 765) {
								if (local3705 != -1 && this.method5193(this.aClass57_Sub1_5.anInterface1_11.method2863(local3705).aByte94)) {
									arg4.anInt2328 = -1694498816;
								}
								if (local3648 > 0) {
									if (local3705 != -1) {
										local3719 = -16777216;
										if (local3705 != -1 && this.method5193(this.aClass57_Sub1_5.anInterface1_11.method2863(local3705).aByte94)) {
											local3719 = -1694498816;
										}
										arg4.method2017((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray151[local409] / (float) super.anInt9377, (float) local3142.aShortArray151[local469] / (float) super.anInt9377, (float) local3142.aShortArray151[local529] / (float) super.anInt9377, (float) local3142.aShortArray153[local409] / (float) super.anInt9377, (float) local3142.aShortArray153[local469] / (float) super.anInt9377, (float) local3142.aShortArray153[local529] / (float) super.anInt9377, local3719 | local3142.anIntArray610[local409] & 0xFFFFFF, local3719 | local3142.anIntArray610[local469] & 0xFFFFFF, local3719 | local3142.anIntArray610[local529] & 0xFFFFFF, arg3.anInt6456, arg8[local409], arg8[local469], arg8[local529], local3705);
									} else if ((local3142.anIntArray610[local409] & 0xFFFFFF) != 0) {
										if (local3705 != -1 && this.method5193(this.aClass57_Sub1_5.anInterface1_11.method2863(local3705).aByte94)) {
											arg4.anInt2328 = -1694498816;
										}
										arg4.method2028((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static288.method4702(arg8[local409] << 24 | arg3.anInt6456, local3142.anIntArray610[local409]), Static288.method4702(arg8[local469] << 24 | arg3.anInt6456, local3142.anIntArray610[local469]), Static288.method4702(arg8[local529] << 24 | arg3.anInt6456, local3142.anIntArray610[local529]));
										arg4.anInt2328 = 0;
									}
								} else if (local3705 != -1) {
									local3719 = -16777216;
									if (local3705 != -1 && this.method5193(this.aClass57_Sub1_5.anInterface1_11.method2863(local3705).aByte94)) {
										local3719 = -1694498816;
									}
									arg4.method2017((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray151[local409] / (float) super.anInt9377, (float) local3142.aShortArray151[local469] / (float) super.anInt9377, (float) local3142.aShortArray151[local529] / (float) super.anInt9377, (float) local3142.aShortArray153[local409] / (float) super.anInt9377, (float) local3142.aShortArray153[local469] / (float) super.anInt9377, (float) local3142.aShortArray153[local529] / (float) super.anInt9377, local3719 | local3142.anIntArray610[local409] & 0xFFFFFF, local3719 | local3142.anIntArray610[local469] & 0xFFFFFF, local3719 | local3142.anIntArray610[local529] & 0xFFFFFF, 0, 0, 0, 0, local3705);
								} else if ((local3142.anIntArray610[local409] & 0xFFFFFF) != 0) {
									if (local3705 != -1 && this.method5193(this.aClass57_Sub1_5.anInterface1_11.method2863(local3705).aByte94)) {
										arg4.anInt2328 = -1694498816;
									}
									arg4.method2028((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray610[local409], local3142.anIntArray610[local469], local3142.anIntArray610[local529]);
									arg4.anInt2328 = 0;
								}
								arg4.anInt2328 = 0;
							} else {
								arg4.method2031((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt6456);
							}
						}
					}
					return;
				}
				for (local559 = 0; local559 < local3142.aShort125; local559++) {
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
						arg4.aBoolean193 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt2329 || local3620 > arg4.anInt2329 || local3624 > arg4.anInt2329;
						if (local3648 >= 765) {
							arg4.method2031((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt6456);
						} else if (local3648 > 0) {
							if ((local3142.anIntArray610[local409] & 0xFFFFFF) != 0) {
								arg4.method2028((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static256.method3781(arg3.anInt6456, local3142.anIntArray610[local409], arg8[local409]), Static256.method3781(arg3.anInt6456, local3142.anIntArray610[local469], arg8[local469]), Static256.method3781(arg3.anInt6456, local3142.anIntArray610[local529], arg8[local529]));
							}
						} else if ((local3142.anIntArray610[local409] & 0xFFFFFF) != 0) {
							arg4.method2028((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray610[local409], local3142.anIntArray610[local469], local3142.anIntArray610[local529]);
						}
					}
				}
			}
		} else if ((local6.aByte51 & 0x2) == 0) {
			if (arg9 != 0) {
				if ((local6.aByte51 & 0x4) == 0) {
					if ((arg9 & 0x2) != 0) {
						return;
					}
				} else if ((arg9 & 0x1) != 0) {
					return;
				}
			}
			@Pc(45) int local45 = arg0 * super.anInt9377;
			local50 = local45 + super.anInt9377;
			local55 = arg1 * super.anInt9377;
			local60 = local55 + super.anInt9377;
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
			if ((local6.aByte51 & 0x1) == 0 || arg2) {
				local84 = super.anIntArrayArray52[arg0][arg1];
				local863 = super.anIntArrayArray52[arg0 + 1][arg1];
				local874 = super.anIntArrayArray52[arg0 + 1][arg1 + 1];
				@Pc(883) int local883 = super.anIntArrayArray52[arg0][arg1 + 1];
				if (this.anInt6066 == -1) {
					local111 = this.aFloat103 + this.aFloat106 * (float) local45 + this.aFloat108 * (float) local84 + this.aFloat105 * (float) local55;
					if (local111 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local137 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local863 + this.aFloat105 * (float) local55;
					if (local137 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local163 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local874 + this.aFloat105 * (float) local60;
					if (local163 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local189 = this.aFloat103 + this.aFloat106 * (float) local45 + this.aFloat108 * (float) local883 + this.aFloat105 * (float) local60;
					if (local189 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
				} else {
					local111 = this.aFloat103 + this.aFloat106 * (float) local45 + this.aFloat108 * (float) local84 + this.aFloat105 * (float) local55;
					local137 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local863 + this.aFloat105 * (float) local55;
					local163 = this.aFloat103 + this.aFloat106 * (float) local50 + this.aFloat108 * (float) local874 + this.aFloat105 * (float) local60;
					local189 = this.aFloat103 + this.aFloat106 * (float) local45 + this.aFloat108 * (float) local883 + this.aFloat105 * (float) local60;
				}
				if (arg2) {
					local276 = (int) (local111 - (float) arg3.anInt6452);
					if (local276 > 255) {
						local276 = 255;
					}
					@Pc(1116) int local1116;
					if (local276 > 0) {
						local62 = local276;
						local1116 = local6.aShort39 * local276 / 255;
						if (local1116 > 0) {
							local84 -= local1116;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt6452);
					if (local276 > 255) {
						local276 = 255;
					}
					if (local276 > 0) {
						local64 = local276;
						local1116 = local6.aShort40 * local276 / 255;
						if (local1116 > 0) {
							local863 -= local1116;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt6452);
					if (local276 > 255) {
						local276 = 255;
					}
					if (local276 > 0) {
						local66 = local276;
						local1116 = local6.aShort38 * local276 / 255;
						if (local1116 > 0) {
							local874 -= local1116;
						}
					}
					local276 = (int) (local189 - (float) arg3.anInt6452);
					if (local276 > 255) {
						local276 = 255;
					}
					if (local276 > 0) {
						local68 = local276;
						local1116 = local6.aShort41 * local276 / 255;
						if (local1116 > 0) {
							local883 -= local1116;
						}
					}
				} else if (arg3.aBoolean498) {
					local276 = (int) (local111 - (float) arg3.anInt6452);
					if (local276 > 0) {
						local62 = local276;
						if (local276 > 255) {
							local62 = 255;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt6452);
					if (local276 > 0) {
						local64 = local276;
						if (local276 > 255) {
							local64 = 255;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt6452);
					if (local276 > 0) {
						local66 = local276;
						if (local276 > 255) {
							local66 = 255;
						}
					}
					local276 = (int) (local189 - (float) arg3.anInt6452);
					if (local276 > 0) {
						local68 = local276;
						if (local276 > 255) {
							local68 = 255;
						}
					}
				}
				if (this.anInt6066 == -1) {
					local366 = this.aFloat109 + this.aFloat107 * (float) local45 + this.aFloat104 * (float) local84 + this.aFloat113 * (float) local55;
					local379 = arg4.anInt2327 + (int) (local366 * (float) this.aClass57_Sub1_5.anInt1050 / local111);
					local396 = this.aFloat111 + this.aFloat110 * (float) local45 + this.aFloat102 * (float) local84 + this.aFloat112 * (float) local55;
					local409 = arg4.anInt2325 + (int) (local396 * (float) this.aClass57_Sub1_5.anInt1030 / local111);
					local426 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local863 + this.aFloat113 * (float) local55;
					local439 = arg4.anInt2327 + (int) (local426 * (float) this.aClass57_Sub1_5.anInt1050 / local137);
					local456 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local863 + this.aFloat112 * (float) local55;
					local469 = arg4.anInt2325 + (int) (local456 * (float) this.aClass57_Sub1_5.anInt1030 / local137);
					local486 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local874 + this.aFloat113 * (float) local60;
					local499 = arg4.anInt2327 + (int) (local486 * (float) this.aClass57_Sub1_5.anInt1050 / local163);
					local516 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local874 + this.aFloat112 * (float) local60;
					local529 = arg4.anInt2325 + (int) (local516 * (float) this.aClass57_Sub1_5.anInt1030 / local163);
					local546 = this.aFloat109 + this.aFloat107 * (float) local45 + this.aFloat104 * (float) local883 + this.aFloat113 * (float) local60;
					local559 = arg4.anInt2327 + (int) (local546 * (float) this.aClass57_Sub1_5.anInt1050 / local189);
					local576 = this.aFloat111 + this.aFloat110 * (float) local45 + this.aFloat102 * (float) local883 + this.aFloat112 * (float) local60;
					local589 = arg4.anInt2325 + (int) (local576 * (float) this.aClass57_Sub1_5.anInt1030 / local189);
				} else {
					local366 = this.aFloat109 + this.aFloat107 * (float) local45 + this.aFloat104 * (float) local84 + this.aFloat113 * (float) local55;
					local379 = arg4.anInt2327 + (int) (local366 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local396 = this.aFloat111 + this.aFloat110 * (float) local45 + this.aFloat102 * (float) local84 + this.aFloat112 * (float) local55;
					local409 = arg4.anInt2325 + (int) (local396 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local426 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local863 + this.aFloat113 * (float) local55;
					local439 = arg4.anInt2327 + (int) (local426 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local456 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local863 + this.aFloat112 * (float) local55;
					local469 = arg4.anInt2325 + (int) (local456 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local486 = this.aFloat109 + this.aFloat107 * (float) local50 + this.aFloat104 * (float) local874 + this.aFloat113 * (float) local60;
					local499 = arg4.anInt2327 + (int) (local486 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local516 = this.aFloat111 + this.aFloat110 * (float) local50 + this.aFloat102 * (float) local874 + this.aFloat112 * (float) local60;
					local529 = arg4.anInt2325 + (int) (local516 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local546 = this.aFloat109 + this.aFloat107 * (float) local45 + this.aFloat104 * (float) local883 + this.aFloat113 * (float) local60;
					local559 = arg4.anInt2327 + (int) (local546 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local576 = this.aFloat111 + this.aFloat110 * (float) local45 + this.aFloat102 * (float) local883 + this.aFloat112 * (float) local60;
					local589 = arg4.anInt2325 + (int) (local576 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
				}
			} else {
				local84 = super.anIntArrayArray52[arg0][arg1];
				@Pc(90) float local90 = this.aFloat108 * (float) local84;
				if (this.anInt6066 == -1) {
					local111 = this.aFloat103 + this.aFloat106 * (float) local45 + local90 + this.aFloat105 * (float) local55;
					if (local111 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local137 = this.aFloat103 + this.aFloat106 * (float) local50 + local90 + this.aFloat105 * (float) local55;
					if (local137 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local163 = this.aFloat103 + this.aFloat106 * (float) local50 + local90 + this.aFloat105 * (float) local60;
					if (local163 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
					local189 = this.aFloat103 + this.aFloat106 * (float) local45 + local90 + this.aFloat105 * (float) local60;
					if (local189 <= (float) this.aClass57_Sub1_5.anInt1028) {
						return;
					}
				} else {
					local111 = this.aFloat103 + this.aFloat106 * (float) local45 + local90 + this.aFloat105 * (float) local55;
					local137 = this.aFloat103 + this.aFloat106 * (float) local50 + local90 + this.aFloat105 * (float) local55;
					local163 = this.aFloat103 + this.aFloat106 * (float) local50 + local90 + this.aFloat105 * (float) local60;
					local189 = this.aFloat103 + this.aFloat106 * (float) local45 + local90 + this.aFloat105 * (float) local60;
				}
				if (arg3.aBoolean498) {
					local276 = (int) (local111 - (float) arg3.anInt6452);
					if (local276 > 0) {
						local62 = local276;
						if (local276 > 255) {
							local62 = 255;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt6452);
					if (local276 > 0) {
						local64 = local276;
						if (local276 > 255) {
							local64 = 255;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt6452);
					if (local276 > 0) {
						local66 = local276;
						if (local276 > 255) {
							local66 = 255;
						}
					}
					local276 = (int) (local189 - (float) arg3.anInt6452);
					if (local276 > 0) {
						local68 = local276;
						if (local276 > 255) {
							local68 = 255;
						}
					}
				}
				@Pc(339) float local339 = this.aFloat104 * (float) local84;
				@Pc(345) float local345 = this.aFloat102 * (float) local84;
				if (this.anInt6066 == -1) {
					local366 = this.aFloat109 + this.aFloat107 * (float) local45 + local339 + this.aFloat113 * (float) local55;
					local379 = arg4.anInt2327 + (int) (local366 * (float) this.aClass57_Sub1_5.anInt1050 / local111);
					local396 = this.aFloat111 + this.aFloat110 * (float) local45 + local345 + this.aFloat112 * (float) local55;
					local409 = arg4.anInt2325 + (int) (local396 * (float) this.aClass57_Sub1_5.anInt1030 / local111);
					local426 = this.aFloat109 + this.aFloat107 * (float) local50 + local339 + this.aFloat113 * (float) local55;
					local439 = arg4.anInt2327 + (int) (local426 * (float) this.aClass57_Sub1_5.anInt1050 / local137);
					local456 = this.aFloat111 + this.aFloat110 * (float) local50 + local345 + this.aFloat112 * (float) local55;
					local469 = arg4.anInt2325 + (int) (local456 * (float) this.aClass57_Sub1_5.anInt1030 / local137);
					local486 = this.aFloat109 + this.aFloat107 * (float) local50 + local339 + this.aFloat113 * (float) local60;
					local499 = arg4.anInt2327 + (int) (local486 * (float) this.aClass57_Sub1_5.anInt1050 / local163);
					local516 = this.aFloat111 + this.aFloat110 * (float) local50 + local345 + this.aFloat112 * (float) local60;
					local529 = arg4.anInt2325 + (int) (local516 * (float) this.aClass57_Sub1_5.anInt1030 / local163);
					local546 = this.aFloat109 + this.aFloat107 * (float) local45 + local339 + this.aFloat113 * (float) local60;
					local559 = arg4.anInt2327 + (int) (local546 * (float) this.aClass57_Sub1_5.anInt1050 / local189);
					local576 = this.aFloat111 + this.aFloat110 * (float) local45 + local345 + this.aFloat112 * (float) local60;
					local589 = arg4.anInt2325 + (int) (local576 * (float) this.aClass57_Sub1_5.anInt1030 / local189);
				} else {
					local366 = this.aFloat109 + this.aFloat107 * (float) local45 + local339 + this.aFloat113 * (float) local55;
					local379 = arg4.anInt2327 + (int) (local366 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local396 = this.aFloat111 + this.aFloat110 * (float) local45 + local345 + this.aFloat112 * (float) local55;
					local409 = arg4.anInt2325 + (int) (local396 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local426 = this.aFloat109 + this.aFloat107 * (float) local50 + local339 + this.aFloat113 * (float) local55;
					local439 = arg4.anInt2327 + (int) (local426 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local456 = this.aFloat111 + this.aFloat110 * (float) local50 + local345 + this.aFloat112 * (float) local55;
					local469 = arg4.anInt2325 + (int) (local456 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local486 = this.aFloat109 + this.aFloat107 * (float) local50 + local339 + this.aFloat113 * (float) local60;
					local499 = arg4.anInt2327 + (int) (local486 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local516 = this.aFloat111 + this.aFloat110 * (float) local50 + local345 + this.aFloat112 * (float) local60;
					local529 = arg4.anInt2325 + (int) (local516 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
					local546 = this.aFloat109 + this.aFloat107 * (float) local45 + local339 + this.aFloat113 * (float) local60;
					local559 = arg4.anInt2327 + (int) (local546 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
					local576 = this.aFloat111 + this.aFloat110 * (float) local45 + local345 + this.aFloat112 * (float) local60;
					local589 = arg4.anInt2325 + (int) (local576 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
				}
			}
			@Pc(1864) boolean local1864 = local6.aShort37 != -1 && this.method5193(this.aClass57_Sub1_5.anInterface1_11.method2863(local6.aShort37).aByte94);
			if (this.anInt6066 == -1) {
				local863 = local64 + local66 + local68;
				if ((local499 - local559) * (local469 - local589) - (local529 - local589) * (local439 - local559) > 0) {
					arg4.aBoolean193 = local499 < 0 || local559 < 0 || local439 < 0 || local499 > arg4.anInt2329 || local559 > arg4.anInt2329 || local439 > arg4.anInt2329;
					if (local863 >= 765) {
						arg4.method2031((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, arg3.anInt6456);
					} else if (local863 > 0) {
						if (local6.aShort37 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method2017((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt3687 & 0xFFFFFF, local874 | local6.anInt3683 & 0xFFFFFF, local874 | local6.anInt3686 & 0xFFFFFF, arg3.anInt6456, local66, local68, local64, local6.aShort37);
						} else {
							if (local1864) {
								arg4.anInt2328 = 100;
							}
							arg4.method2028((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, Static288.method4702(local66 << 24 | arg3.anInt6456, local6.anInt3687), Static288.method4702(local68 << 24 | arg3.anInt6456, local6.anInt3683), Static288.method4702(local64 << 24 | arg3.anInt6456, local6.anInt3686));
							arg4.anInt2328 = 0;
						}
					} else if (local6.aShort37 >= 0) {
						local874 = -16777216;
						if (local1864) {
							local874 = -1694498816;
						}
						arg4.method2017((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt3687 & 0xFFFFFF, local874 | local6.anInt3683 & 0xFFFFFF, local874 | local6.anInt3686 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort37);
					} else {
						if (local1864) {
							arg4.anInt2328 = 100;
						}
						arg4.method2028((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, local6.anInt3687, local6.anInt3683, local6.anInt3686);
						arg4.anInt2328 = 0;
					}
				}
				local863 = local62 + local64 + local68;
				if ((local379 - local439) * (local589 - local469) - (local409 - local469) * (local559 - local439) > 0) {
					arg4.aBoolean193 = local379 < 0 || local439 < 0 || local559 < 0 || local379 > arg4.anInt2329 || local439 > arg4.anInt2329 || local559 > arg4.anInt2329;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt2328 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort37 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method2017((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt3685 & 0xFFFFFF, local874 | local6.anInt3686 & 0xFFFFFF, local874 | local6.anInt3683 & 0xFFFFFF, arg3.anInt6456, local62, local64, local68, local6.aShort37);
								return;
							}
							if (local1864) {
								arg4.anInt2328 = 100;
							}
							arg4.method2028((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, Static288.method4702(local62 << 24 | arg3.anInt6456, local6.anInt3685), Static288.method4702(local64 << 24 | arg3.anInt6456, local6.anInt3686), Static288.method4702(local68 << 24 | arg3.anInt6456, local6.anInt3683));
							arg4.anInt2328 = 0;
							return;
						}
						if (local6.aShort37 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method2017((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt3685 & 0xFFFFFF, local874 | local6.anInt3686 & 0xFFFFFF, local874 | local6.anInt3683 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort37);
							return;
						}
						if (local1864) {
							arg4.anInt2328 = 100;
						}
						arg4.method2028((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, local6.anInt3685, local6.anInt3686, local6.anInt3683);
						arg4.anInt2328 = 0;
						return;
					}
					arg4.method2031((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, arg3.anInt6456);
					return;
				}
			} else {
				local863 = local64 + local66 + local68;
				if ((local499 - local559) * (local469 - local589) - (local529 - local589) * (local439 - local559) > 0) {
					arg4.aBoolean193 = local499 < 0 || local559 < 0 || local439 < 0 || local499 > arg4.anInt2329 || local559 > arg4.anInt2329 || local439 > arg4.anInt2329;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt2328 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort37 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method2017((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt3687 & 0xFFFFFF, local874 | local6.anInt3683 & 0xFFFFFF, local874 | local6.anInt3686 & 0xFFFFFF, arg3.anInt6456, local66, local68, local64, local6.aShort37);
							} else {
								if (local1864) {
									arg4.anInt2328 = 100;
								}
								arg4.method2028((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, Static288.method4702(local66 << 24 | arg3.anInt6456, local6.anInt3687), Static288.method4702(local68 << 24 | arg3.anInt6456, local6.anInt3683), Static288.method4702(local64 << 24 | arg3.anInt6456, local6.anInt3686));
								arg4.anInt2328 = 0;
							}
						} else if (local6.aShort37 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method2017((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt3687 & 0xFFFFFF, local874 | local6.anInt3683 & 0xFFFFFF, local874 | local6.anInt3686 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort37);
						} else {
							if (local1864) {
								arg4.anInt2328 = 100;
							}
							arg4.method2028((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, local6.anInt3687, local6.anInt3683, local6.anInt3686);
							arg4.anInt2328 = 0;
						}
					} else {
						arg4.method2031((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, arg3.anInt6456);
					}
				}
				local863 = local62 + local64 + local68;
				if ((local379 - local439) * (local589 - local469) - (local409 - local469) * (local559 - local439) > 0) {
					arg4.aBoolean193 = local379 < 0 || local439 < 0 || local559 < 0 || local379 > arg4.anInt2329 || local439 > arg4.anInt2329 || local559 > arg4.anInt2329;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt2328 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort37 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method2017((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt3685 & 0xFFFFFF, local874 | local6.anInt3686 & 0xFFFFFF, local874 | local6.anInt3683 & 0xFFFFFF, arg3.anInt6456, local62, local64, local68, local6.aShort37);
								return;
							}
							if (local1864) {
								arg4.anInt2328 = 100;
							}
							arg4.method2028((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, Static288.method4702(local62 << 24 | arg3.anInt6456, local6.anInt3685), Static288.method4702(local64 << 24 | arg3.anInt6456, local6.anInt3686), Static288.method4702(local68 << 24 | arg3.anInt6456, local6.anInt3683));
							arg4.anInt2328 = 0;
							return;
						}
						if (local6.aShort37 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method2017((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt3685 & 0xFFFFFF, local874 | local6.anInt3686 & 0xFFFFFF, local874 | local6.anInt3683 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort37);
							return;
						}
						if (local1864) {
							arg4.anInt2328 = 100;
						}
						arg4.method2028((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, local6.anInt3685, local6.anInt3686, local6.anInt3683);
						arg4.anInt2328 = 0;
						return;
					}
					arg4.method2031((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, arg3.anInt6456);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!uf;[I)V")
	@Override
	public void method8043(@OriginalArg(0) Class5_Sub43 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class203_Sub3 local3 = this.aClass57_Sub1_5.aClass203_Sub3_1;
		this.anInt6066 = -1;
		this.aFloat107 = local3.aFloat189;
		this.aFloat104 = local3.aFloat196;
		this.aFloat113 = local3.aFloat190;
		this.aFloat109 = local3.aFloat197;
		this.aFloat110 = local3.aFloat193;
		this.aFloat102 = local3.aFloat199;
		this.aFloat112 = local3.aFloat198;
		this.aFloat111 = local3.aFloat192;
		this.aFloat106 = local3.aFloat195;
		this.aFloat108 = local3.aFloat194;
		this.aFloat105 = local3.aFloat188;
		this.aFloat103 = local3.aFloat191;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt9376 && local78 >= 0 && local78 < super.anInt9375) {
						this.method5196(local72, local78, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8035(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class240 local4 = this.aClass57_Sub1_5.method1080(Thread.currentThread());
		@Pc(7) Class110 local7 = local4.aClass110_1;
		local7.anInt2328 = 0;
		local7.aBoolean193 = true;
		this.aClass57_Sub1_5.ya();
		if (this.aClass162ArrayArray1 != null || this.aClass171ArrayArray1 != null) {
			this.method5190(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray367, local4.anIntArray366);
		} else if (this.aClass60ArrayArray1 != null) {
			this.method5195(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray367, local4.anIntArray366);
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass60ArrayArray1 == null) {
			this.aClass60ArrayArray1 = new Class60[super.anInt9376][super.anInt9375];
			this.aClass178ArrayArray1 = new Class178[super.anInt9376][super.anInt9375];
		} else if (this.aClass162ArrayArray1 != null || this.aClass171ArrayArray1 != null) {
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
				if (local79 != 0 && local79 != super.anInt9377 || local85 != 0 && local85 != super.anInt9377) {
					local33 = false;
					break;
				}
			}
		}
		if (!local33) {
			@Pc(118) Class178 local118 = new Class178();
			@Pc(122) short local122 = (short) arg2.length;
			@Pc(126) short local126 = (short) arg9.length;
			local118.aShort54 = local122;
			local118.aShortArray55 = new short[local122];
			local118.aShortArray49 = new short[local122];
			local118.aShortArray52 = new short[local122];
			local118.aShortArray56 = new short[local122];
			@Pc(156) int local156;
			@Pc(323) int local323;
			@Pc(370) int local370;
			for (@Pc(147) int local147 = 0; local147 < local122; local147++) {
				@Pc(152) int local152 = arg2[local147];
				local156 = arg4[local147];
				if (local152 == 0 && local156 == 0) {
					local118.aShortArray55[local147] = (short) (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				} else if (local152 == 0 && local156 == super.anInt9377) {
					local118.aShortArray55[local147] = (short) (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				} else if (local152 == super.anInt9377 && local156 == super.anInt9377) {
					local118.aShortArray55[local147] = (short) (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				} else if (local152 == super.anInt9377 && local156 == 0) {
					local118.aShortArray55[local147] = (short) (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				} else {
					local323 = (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (super.anInt9377 - local152) + (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local152;
					local370 = (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (super.anInt9377 - local152) + (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local152;
					local118.aShortArray55[local147] = (short) (local323 * (super.anInt9377 - local156) + local370 * local156 >> super.anInt9378 * 2);
				}
				local323 = (arg0 << super.anInt9378) + local152;
				local370 = (arg1 << super.anInt9378) + local156;
				local118.aShortArray49[local147] = (short) local152;
				local118.aShortArray56[local147] = (short) local156;
				local118.aShortArray52[local147] = (short) (this.method8032(local323, local370) + (arg3 == null ? 0 : arg3[local147]));
				if (local118.aShortArray55[local147] < 2) {
					local118.aShortArray55[local147] = 2;
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
					@Pc(490) Class233 local490 = this.aClass57_Sub1_5.anInterface1_11.method2863(local370);
					if (!local490.aBoolean482) {
						local454 = true;
						if (this.method5193(local490.aByte94) || local490.aByte96 != 0 || local490.aByte93 != 0) {
							local118.aByte66 = (byte) (local118.aByte66 | 0x4);
						}
					}
				}
			}
			local118.anIntArray253 = new int[local156];
			if (arg10 != null) {
				local118.anIntArray254 = new int[local156];
			}
			local118.aShortArray50 = new short[local156];
			local118.aShortArray54 = new short[local156];
			local118.aShortArray51 = new short[local156];
			if (local454) {
				local118.aShortArray57 = new short[local156];
				local118.aShortArray53 = new short[local156];
			}
			for (local370 = 0; local370 < local126; local370++) {
				if (arg9[local370] >= 0 || arg10 != null && arg10[local370] >= 0) {
					if (arg9[local370] >= 0) {
						local118.anIntArray253[local118.aShort55] = Static230.method3289(arg9[local370]);
					} else {
						local118.anIntArray253[local118.aShort55] = -1;
					}
					if (arg10 != null) {
						if (arg10[local370] == -1) {
							local118.anIntArray254[local118.aShort55] = -1;
						} else {
							local118.anIntArray254[local118.aShort55] = Static230.method3289(arg10[local370]);
						}
					}
					local118.aShortArray50[local118.aShort55] = (short) arg6[local370];
					local118.aShortArray54[local118.aShort55] = (short) arg7[local370];
					local118.aShortArray51[local118.aShort55] = (short) arg8[local370];
					if (local454) {
						if (arg11[local370] == -1 || this.aClass57_Sub1_5.anInterface1_11.method2863(arg11[local370]).aBoolean482) {
							local118.aShortArray57[local118.aShort55] = -1;
						} else {
							local118.aShortArray57[local118.aShort55] = (short) arg11[local370];
							local118.aShortArray53[local118.aShort55] = (short) arg12[local370];
						}
					}
					local118.aShort55++;
				}
			}
			this.aClass178ArrayArray1[arg0][arg1] = local118;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(741) Class60 local741 = new Class60();
			local79 = arg9[0];
			local85 = arg11[0];
			if (arg10 != null) {
				local741.anInt1077 = Static52.method789(this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1], Static230.method3289(arg10[0]));
				if (local79 == -1) {
					local741.aByte22 = (byte) (local741.aByte22 | 0x2);
				}
			}
			if (super.anIntArrayArray52[arg0][arg1] == super.anIntArrayArray52[arg0 + 1][arg1] && super.anIntArrayArray52[arg0][arg1] == super.anIntArrayArray52[arg0 + 1][arg1 + 1] && super.anIntArrayArray52[arg0][arg1] == super.anIntArrayArray52[arg0][arg1 + 1]) {
				local741.aByte22 = (byte) (local741.aByte22 | 0x1);
			}
			@Pc(849) Class233 local849 = null;
			if (local85 != -1) {
				local849 = this.aClass57_Sub1_5.anInterface1_11.method2863(local85);
			}
			if (local849 == null || (local741.aByte22 & 0x2) != 0 || local849.aBoolean482) {
				@Pc(987) short local987 = Static230.method3289(local79);
				local741.aShort12 = (short) Static52.method789(this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1], local987);
				local741.aShort11 = (short) Static52.method789(this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1], local987);
				local741.aShort13 = (short) Static52.method789(this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1], local987);
				local741.aShort9 = (short) Static52.method789(this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1], local987);
				local741.aShort10 = -1;
			} else {
				local741.aShort12 = (short) (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				local741.aShort11 = (short) (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				local741.aShort13 = (short) (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				local741.aShort9 = (short) (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				local741.aShort10 = (short) local85;
				if (this.method5193(local849.aByte94) || local849.aByte96 != 0 || local849.aByte93 != 0) {
					local741.aByte22 = (byte) (local741.aByte22 | 0x4);
				}
			}
			this.aClass60ArrayArray1[arg0][arg1] = local741;
		}
	}

	@OriginalMember(owner = "client!lia", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) boolean local9 = (this.anInt6067 & 0x20) == 0;
		if (this.aClass162ArrayArray1 == null && !local9) {
			this.aClass162ArrayArray1 = new Class162[super.anInt9376][super.anInt9375];
			this.aClass383ArrayArray1 = new Class383[super.anInt9376][super.anInt9375];
		} else if (this.aClass171ArrayArray1 == null && local9) {
			this.aClass171ArrayArray1 = new Class171[super.anInt9376][super.anInt9375];
		} else if (this.aClass60ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(67) int local67 = 0; local67 < arg6.length; local67++) {
			if (arg6[local67] == -1) {
				arg6[local67] = 0;
			} else {
				arg6[local67] = Static351.anIntArray337[Static230.method3289(arg6[local67]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(106) int local106 = 0; local106 < arg7.length; local106++) {
				if (arg7[local106] == -1) {
					arg7[local106] = 0;
				} else {
					arg7[local106] = Static351.anIntArray337[Static230.method3289(arg7[local106]) & 0xFFFF] << 8 | 0xFF;
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
			@Pc(147) Class171 local147 = new Class171();
			local147.aShort48 = (short) arg2.length;
			local147.aShort49 = (short) (arg2.length / 3);
			local147.aShortArray40 = new short[local147.aShort48];
			local147.aShortArray43 = new short[local147.aShort48];
			local147.aShortArray42 = new short[local147.aShort48];
			local147.anIntArray242 = new int[local147.aShort48];
			local147.aShortArray41 = new short[local147.aShort48];
			local147.aShortArray44 = new short[local147.aShort48];
			local147.aByteArray26 = new byte[local147.aShort48];
			if (arg5 != null) {
				local147.aShortArray45 = new short[local147.aShort48];
			}
			for (local205 = 0; local205 < local147.aShort48; local205++) {
				local210 = arg2[local205];
				local214 = arg4[local205];
				if (local210 == 0 && local214 == 0) {
					local236 = this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1];
				} else if (local210 == 0 && local214 == super.anInt9377) {
					local236 = this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1];
				} else if (local210 == super.anInt9377 && local214 == super.anInt9377) {
					local236 = this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1];
				} else if (local210 == super.anInt9377 && local214 == 0) {
					local236 = this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1];
				} else {
					local363 = (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (super.anInt9377 - local210) + (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local210;
					local410 = (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (super.anInt9377 - local210) + (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local210;
					local236 = local363 * (super.anInt9377 - local214) + local410 * local214 >> super.anInt9378 * 2;
				}
				local363 = (arg0 << super.anInt9378) + local210;
				local410 = (arg1 << super.anInt9378) + local214;
				local147.aShortArray40[local205] = (short) local210;
				local147.aShortArray42[local205] = (short) local214;
				local147.aShortArray43[local205] = (short) (this.method8032(local363, local410) + (arg3 == null ? 0 : arg3[local205]));
				if (local236 < 0) {
					local236 = 0;
				}
				if (arg6[local205] == 0) {
					local147.anIntArray242[local205] = 0;
					if (arg7 != null) {
						local147.aByteArray26[local205] = (byte) local236;
					}
				} else {
					local498 = 0;
					if (arg5 != null) {
						@Pc(510) short local510 = local147.aShortArray45[local205] = (short) arg5[local205];
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
					if (arg8[local205] != -1 && this.method5193(this.aClass57_Sub1_5.anInterface1_11.method2863(arg8[local205]).aByte94)) {
						local530 = -1694498816;
					}
					local147.anIntArray242[local205] = local530 | Static256.method3781(arg10, Static686.method5192(arg6[local205] >> 8, local236), local498);
					if (arg7 != null) {
						local147.aByteArray26[local205] = (byte) local236;
					}
				}
				local147.aShortArray41[local205] = (short) arg8[local205];
				local147.aShortArray44[local205] = (short) arg9[local205];
			}
			if (arg7 != null) {
				local147.anIntArray243 = new int[local147.aShort49];
			}
			for (local210 = 0; local210 < local147.aShort49; local210++) {
				local214 = local210 * 3;
				if (arg7 != null && arg7[local214] != 0) {
					local147.anIntArray243[local210] = arg7[local214] >> 8 | 0xFF000000;
				}
			}
			this.aClass171ArrayArray1[arg0][arg1] = local147;
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
				} else if (arg2[local363] == super.anInt9377 && arg4[local363] == 0) {
					if (local210 != -1 && arg6[local210] != arg6[local363]) {
						local654 = false;
						break;
					}
					local210 = local363;
				} else if (arg2[local363] == super.anInt9377 && arg4[local363] == super.anInt9377) {
					if (local214 != -1 && arg6[local214] != arg6[local363]) {
						local654 = false;
						break;
					}
					local214 = local363;
				} else if (arg2[local363] == 0 && arg4[local363] == super.anInt9377) {
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
						if (arg2[local410] != arg2[0] && arg2[local410] != arg2[0] + super.anInt9377 && arg2[local410] != arg2[0] - super.anInt9377) {
							local654 = false;
							break;
						}
						if (arg4[local410] != arg4[0] && arg4[local410] != arg4[0] + super.anInt9377 && arg4[local410] != arg4[0] - super.anInt9377) {
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
			@Pc(1760) Class383 local1760 = new Class383();
			local1760.aShort124 = (short) arg2.length;
			local1760.aShort125 = (short) (arg2.length / 3);
			local1760.aShortArray151 = new short[local1760.aShort124];
			local1760.aShortArray156 = new short[local1760.aShort124];
			local1760.aShortArray153 = new short[local1760.aShort124];
			local1760.anIntArray610 = new int[local1760.aShort124];
			if (arg5 != null) {
				local1760.aShortArray155 = new short[local1760.aShort124];
			}
			@Pc(1834) int local1834;
			@Pc(1961) int local1961;
			@Pc(2008) int local2008;
			@Pc(2098) int local2098;
			for (local410 = 0; local410 < local1760.aShort124; local410++) {
				local498 = arg2[local410];
				local530 = arg4[local410];
				if (local498 == 0 && local530 == 0) {
					local1834 = this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1];
				} else if (local498 == 0 && local530 == super.anInt9377) {
					local1834 = this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1];
				} else if (local498 == super.anInt9377 && local530 == super.anInt9377) {
					local1834 = this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1];
				} else if (local498 == super.anInt9377 && local530 == 0) {
					local1834 = this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1];
				} else {
					local1961 = (this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (super.anInt9377 - local498) + (this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local498;
					local2008 = (this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (super.anInt9377 - local498) + (this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local498;
					local1834 = local1961 * (super.anInt9377 - local530) + local2008 * local530 >> super.anInt9378 * 2;
				}
				local1961 = (arg0 << super.anInt9378) + local498;
				local2008 = (arg1 << super.anInt9378) + local530;
				local1760.aShortArray151[local410] = (short) local498;
				local1760.aShortArray153[local410] = (short) local530;
				local1760.aShortArray156[local410] = (short) (this.method8032(local1961, local2008) + (arg3 == null ? 0 : arg3[local410]));
				if (local1834 < 0) {
					local1834 = 0;
				}
				if (arg6[local410] != 0) {
					local2098 = 0;
					if (arg5 != null) {
						@Pc(2110) short local2110 = local1760.aShortArray155[local410] = (short) arg5[local410];
						if (arg11 != 0) {
							local2098 = local2110 * 255 / arg11;
							if (local2098 < 0) {
								local2098 = 0;
							} else if (local2098 > 255) {
								local2098 = 255;
							}
						}
					}
					local1760.anIntArray610[local410] = Static256.method3781(arg10, Static686.method5192(arg6[local410] >> 8, local1834), local2098);
					if (arg7 != null) {
						local1760.anIntArray610[local410] |= local1834 << 25;
					}
				} else if (arg7 == null) {
					local1760.anIntArray610[local410] = 0;
				} else {
					local1760.anIntArray610[local410] = local1834 << 25;
				}
			}
			@Pc(2164) boolean local2164 = false;
			for (local530 = 0; local530 < local1760.aShort125; local530++) {
				if (arg8[local530 * 3] != -1 && !this.aClass57_Sub1_5.anInterface1_11.method2863(arg8[local530 * 3]).aBoolean482) {
					local2164 = true;
				}
			}
			if (arg7 != null) {
				local1760.anIntArray611 = new int[local1760.aShort125];
			}
			if (local2164) {
				local1760.aShortArray154 = new short[local1760.aShort125];
				local1760.aShortArray152 = new short[local1760.aShort125];
			}
			for (local1834 = 0; local1834 < local1760.aShort125; local1834++) {
				local1961 = local1834 * 3;
				if (arg7 != null && arg7[local1961] != 0) {
					local1760.anIntArray611[local1834] = arg7[local1961] >> 8;
				}
				if (local2164) {
					local2008 = local1961 + 1;
					local2098 = local2008 + 1;
					@Pc(2258) boolean local2258 = false;
					@Pc(2260) boolean local2260 = true;
					@Pc(2264) int local2264 = arg8[local1961];
					if (local2264 == -1 || this.aClass57_Sub1_5.anInterface1_11.method2863(local2264).aBoolean482) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					local2264 = arg8[local2008];
					if (local2264 == -1 || this.aClass57_Sub1_5.anInterface1_11.method2863(local2264).aBoolean482) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					local2264 = arg8[local2098];
					if (local2264 == -1 || this.aClass57_Sub1_5.anInterface1_11.method2863(local2264).aBoolean482) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					if (local2260) {
						local1760.aShortArray154[local1834] = (short) local2264;
						local1760.aShortArray152[local1834] = (short) arg9[local1961];
					} else {
						if (local2258) {
							local2264 = arg8[local1961];
							if (local2264 != -1 && !this.aClass57_Sub1_5.anInterface1_11.method2863(local2264).aBoolean482) {
								local1760.anIntArray610[local1961] = Static351.anIntArray337[Static230.method3289(this.aClass57_Sub1_5.anInterface1_11.method2863(local2264).aShort78 & 0xFFFF) & 0xFFFF];
							}
							local2264 = arg8[local2008];
							if (local2264 != -1 && !this.aClass57_Sub1_5.anInterface1_11.method2863(local2264).aBoolean482) {
								local1760.anIntArray610[local2008] = Static351.anIntArray337[Static230.method3289(this.aClass57_Sub1_5.anInterface1_11.method2863(local2264).aShort78 & 0xFFFF) & 0xFFFF];
							}
							local2264 = arg8[local2098];
							if (local2264 != -1 && !this.aClass57_Sub1_5.anInterface1_11.method2863(local2264).aBoolean482) {
								local1760.anIntArray610[local2098] = Static351.anIntArray337[Static230.method3289(this.aClass57_Sub1_5.anInterface1_11.method2863(local2264).aShort78 & 0xFFFF) & 0xFFFF];
							}
						}
						local1760.aShortArray154[local1834] = -1;
					}
				}
			}
			this.aClass383ArrayArray1[arg0][arg1] = local1760;
			return;
		}
		@Pc(931) Class162 local931 = new Class162();
		local410 = arg6[0];
		local498 = arg8[0];
		if (arg7 != null) {
			local931.anInt3684 = arg7[0] >> 8;
			if (local410 == 0) {
				local931.aByte51 = (byte) (local931.aByte51 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (super.anIntArrayArray52[arg0][arg1] == super.anIntArrayArray52[arg0 + 1][arg1] && super.anIntArrayArray52[arg0][arg1] == super.anIntArrayArray52[arg0 + 1][arg1 + 1] && super.anIntArrayArray52[arg0][arg1] == super.anIntArrayArray52[arg0][arg1 + 1]) {
			local931.aByte51 = (byte) (local931.aByte51 | 0x1);
		}
		if (local498 == -1 || (local931.aByte51 & 0x2) != 0 || this.aClass57_Sub1_5.anInterface1_11.method2863(local498).aBoolean482) {
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
			local931.anInt3685 = Static256.method3781(arg10, Static686.method5192(arg6[local205] >> 8, this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]), local530);
			if (local931.anInt3684 != 0) {
				local931.anInt3685 |= this.aByteArrayArray16[arg0][arg1] + 255 - this.aByteArrayArray17[arg0][arg1] << 25;
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
			local931.anInt3686 = Static256.method3781(arg10, Static686.method5192(arg6[local210] >> 8, this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]), local530);
			if (local931.anInt3684 != 0) {
				local931.anInt3686 |= this.aByteArrayArray16[arg0 + 1][arg1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1] << 25;
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
			local931.anInt3687 = Static256.method3781(arg10, Static686.method5192(arg6[local214] >> 8, this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]), local530);
			if (local931.anInt3684 != 0) {
				local931.anInt3687 |= this.aByteArrayArray16[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1 + 1] << 25;
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
			local931.anInt3683 = Static256.method3781(arg10, Static686.method5192(arg6[local236] >> 8, this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]), local530);
			if (local931.anInt3684 != 0) {
				local931.anInt3683 |= this.aByteArrayArray16[arg0][arg1 + 1] + 255 - this.aByteArrayArray17[arg0][arg1 + 1] << 25;
			}
			local931.aShort37 = -1;
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
			local931.anInt3685 = Static256.method3781(arg10, Static686.method5192(arg6[local205] >> 8, this.aByteArrayArray17[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]), local530);
			if (local931.anInt3684 != 0) {
				local931.anInt3685 |= this.aByteArrayArray16[arg0][arg1] + 255 - this.aByteArrayArray17[arg0][arg1] << 25;
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
			local931.anInt3686 = Static256.method3781(arg10, Static686.method5192(arg6[local210] >> 8, this.aByteArrayArray17[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]), local530);
			if (local931.anInt3684 != 0) {
				local931.anInt3686 |= this.aByteArrayArray16[arg0 + 1][arg1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1] << 25;
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
			local931.anInt3687 = Static256.method3781(arg10, Static686.method5192(arg6[local214] >> 8, this.aByteArrayArray17[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]), local530);
			if (local931.anInt3684 != 0) {
				local931.anInt3687 |= this.aByteArrayArray16[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray17[arg0 + 1][arg1 + 1] << 25;
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
			local931.anInt3683 = Static256.method3781(arg10, Static686.method5192(arg6[local236] >> 8, this.aByteArrayArray17[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]), local530);
			local931.aShort37 = (short) local498;
		}
		if (arg5 != null) {
			local931.aShort38 = (short) arg5[local214];
			local931.aShort41 = (short) arg5[local236];
			local931.aShort40 = (short) arg5[local210];
			local931.aShort39 = (short) arg5[local205];
		}
		this.aClass162ArrayArray1[arg0][arg1] = local931;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class203_Sub3 local3 = this.aClass57_Sub1_5.aClass203_Sub3_1;
		this.anInt6066 = arg5;
		this.aFloat107 = local3.aFloat189;
		this.aFloat104 = local3.aFloat196;
		this.aFloat113 = local3.aFloat190;
		this.aFloat109 = local3.aFloat197;
		this.aFloat110 = local3.aFloat193;
		this.aFloat102 = local3.aFloat199;
		this.aFloat112 = local3.aFloat198;
		this.aFloat111 = local3.aFloat192;
		this.aFloat106 = local3.aFloat195;
		this.aFloat108 = local3.aFloat194;
		this.aFloat105 = local3.aFloat188;
		this.aFloat103 = local3.aFloat191;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt9376 && local78 >= 0 && local78 < super.anInt9375) {
						this.method5196(local72, local78, arg6);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!lia", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)Z")
	private boolean method5193(@OriginalArg(0) int arg0) {
		if ((this.anInt6067 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8037(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5196(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIZLclient!mp;Lclient!em;[I[I[I[II)V")
	private void method5194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class240 arg3, @OriginalArg(4) Class110 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class171 local6 = this.aClass171ArrayArray1[arg0][arg1];
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
		if (this.anInt6066 == -1) {
			for (local26 = 0; local26 < local6.aShort48; local26++) {
				local37 = local6.aShortArray40[local26] + (arg0 << super.anInt9378);
				local42 = local6.aShortArray43[local26];
				local52 = local6.aShortArray42[local26] + (arg1 << super.anInt9378);
				local73 = this.aFloat103 + this.aFloat106 * (float) local37 + this.aFloat108 * (float) local42 + this.aFloat105 * (float) local52;
				if (local73 <= (float) this.aClass57_Sub1_5.anInt1028) {
					return;
				}
				arg8[local26] = 0;
				if (arg2) {
					local95 = (int) (local73 - (float) arg3.anInt6452);
					if (local95 > 255) {
						local95 = 255;
					}
					if (local95 > 0) {
						arg8[local26] = local95;
						local115 = local6.aShortArray45[local26] * local95 / 255;
						if (local115 > 0) {
							local42 -= local115;
						}
					}
				} else if (arg3.aBoolean498) {
					local95 = (int) (local73 - (float) arg3.anInt6452);
					if (local95 > 0) {
						arg8[local26] = local95;
						if (arg8[local26] > 255) {
							arg8[local26] = 255;
						}
					}
				}
				local172 = this.aFloat109 + this.aFloat107 * (float) local37 + this.aFloat104 * (float) local42 + this.aFloat113 * (float) local52;
				local193 = this.aFloat111 + this.aFloat110 * (float) local37 + this.aFloat102 * (float) local42 + this.aFloat112 * (float) local52;
				arg5[local26] = arg4.anInt2327 + (int) (local172 * (float) this.aClass57_Sub1_5.anInt1050 / local73);
				arg6[local26] = arg4.anInt2325 + (int) (local193 * (float) this.aClass57_Sub1_5.anInt1030 / local73);
				arg7[local26] = (int) local73;
			}
		} else {
			for (local26 = 0; local26 < local6.aShort48; local26++) {
				local37 = local6.aShortArray40[local26] + (arg0 << super.anInt9378);
				local42 = local6.aShortArray43[local26];
				local52 = local6.aShortArray42[local26] + (arg1 << super.anInt9378);
				local73 = this.aFloat103 + this.aFloat106 * (float) local37 + this.aFloat108 * (float) local42 + this.aFloat105 * (float) local52;
				arg8[local26] = 0;
				if (arg2) {
					local95 = this.anInt6066 - arg3.anInt6452;
					if (local95 > 255) {
						local95 = 255;
					}
					if (local95 > 0) {
						arg8[local26] = local95;
						local115 = local6.aShortArray45[local26] * local95 / 255;
						if (local115 > 0) {
							local42 -= local115;
						}
					}
				} else if (arg3.aBoolean498) {
					local95 = this.anInt6066 - arg3.anInt6452;
					if (local95 > 0) {
						arg8[local26] = local95;
						if (arg8[local26] > 255) {
							arg8[local26] = 255;
						}
					}
				}
				local172 = this.aFloat109 + this.aFloat107 * (float) local37 + this.aFloat104 * (float) local42 + this.aFloat113 * (float) local52;
				local193 = this.aFloat111 + this.aFloat110 * (float) local37 + this.aFloat102 * (float) local42 + this.aFloat112 * (float) local52;
				arg5[local26] = arg4.anInt2327 + (int) (local172 * (float) this.aClass57_Sub1_5.anInt1050 / (float) this.anInt6066);
				arg6[local26] = arg4.anInt2325 + (int) (local193 * (float) this.aClass57_Sub1_5.anInt1030 / (float) this.anInt6066);
				arg7[local26] = (int) local73;
			}
		}
		@Pc(441) float local441 = (float) super.anInt9377;
		for (local95 = 0; local95 < local6.aShort49; local95++) {
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
				arg4.aBoolean193 = local460 < 0 || local464 < 0 || local468 < 0 || local460 > arg4.anInt2329 || local464 > arg4.anInt2329 || local468 > arg4.anInt2329;
				if (arg8[local115] + arg8[local452] + arg8[local456] < 765) {
					@Pc(550) int local550 = arg0 << super.anInt9378;
					@Pc(555) int local555 = arg1 << super.anInt9378;
					if ((local6.anIntArray242[local115] & 0xFFFFFF) != 0) {
						if (local6.aShortArray41[local115] == local6.aShortArray41[local452] && local6.aShortArray41[local115] == local6.aShortArray41[local456] && local6.aShortArray44[local115] == local6.aShortArray44[local452] && local6.aShortArray44[local115] == local6.aShortArray44[local456]) {
							arg4.method2017((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], (float) (local550 + local6.aShortArray40[local115]) / (float) local6.aShortArray44[local115], (float) (local550 + local6.aShortArray40[local452]) / (float) local6.aShortArray44[local452], (float) (local550 + local6.aShortArray40[local456]) / (float) local6.aShortArray44[local456], (float) (local555 + local6.aShortArray42[local115]) / (float) local6.aShortArray44[local115], (float) (local555 + local6.aShortArray42[local452]) / (float) local6.aShortArray44[local452], (float) (local555 + local6.aShortArray42[local456]) / (float) local6.aShortArray44[local456], local6.anIntArray242[local115], local6.anIntArray242[local452], local6.anIntArray242[local456], arg3.anInt6456, arg8[local115], arg8[local452], arg8[local456], local6.aShortArray41[local115]);
						} else {
							arg4.method2027((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], (float) (local550 + local6.aShortArray40[local115]) / local441, (float) (local550 + local6.aShortArray40[local452]) / local441, (float) (local550 + local6.aShortArray40[local456]) / local441, (float) (local555 + local6.aShortArray42[local115]) / local441, (float) (local555 + local6.aShortArray42[local452]) / local441, (float) (local555 + local6.aShortArray42[local456]) / local441, local6.anIntArray242[local115], local6.anIntArray242[local452], local6.anIntArray242[local456], arg3.anInt6456, arg8[local115], arg8[local452], arg8[local456], local6.aShortArray41[local115], local441 / (float) local6.aShortArray44[local115], local6.aShortArray41[local452], local441 / (float) local6.aShortArray44[local452], local6.aShortArray41[local456], local441 / (float) local6.aShortArray44[local456]);
						}
					}
				} else {
					arg4.method2031((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], arg3.anInt6456);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray16[arg0][arg1] < arg2) {
			this.aByteArrayArray16[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!lia", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		this.aByteArrayArray17 = null;
		this.aByteArrayArray16 = null;
	}

	@OriginalMember(owner = "client!lia", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub5_Sub4 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub5_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIIIII[[ZLclient!mp;Lclient!em;[I[I)V")
	private void method5195(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class240 arg5, @OriginalArg(9) Class110 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean497;
		this.aClass57_Sub1_5.C(false);
		arg6.aBoolean192 = false;
		arg6.aBoolean195 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(85) int local85;
					if (this.aClass60ArrayArray1[local32][local35] != null) {
						@Pc(62) Class60 local62 = this.aClass60ArrayArray1[local32][local35];
						if (local62.aShort10 != -1 && (local62.aByte22 & 0x2) == 0 && local62.anInt1077 == -1) {
							local85 = this.aClass57_Sub1_5.method1074(local62.aShort10);
							arg6.method2014((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static52.method789(local62.aShort13 & 0xFFFF, local85), (float) Static52.method789(local62.aShort9 & 0xFFFF, local85), (float) Static52.method789(local62.aShort11 & 0xFFFF, local85));
							arg6.method2014((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static52.method789(local62.aShort12 & 0xFFFF, local85), (float) Static52.method789(local62.aShort11 & 0xFFFF, local85), (float) Static52.method789(local62.aShort9 & 0xFFFF, local85));
						} else if (local62.anInt1077 == -1) {
							arg6.method2014((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) (local62.aShort13 & 0xFFFF), (float) (local62.aShort9 & 0xFFFF), (float) (local62.aShort11 & 0xFFFF));
							arg6.method2014((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local62.aShort12 & 0xFFFF), (float) (local62.aShort11 & 0xFFFF), (float) (local62.aShort9 & 0xFFFF));
						} else {
							local85 = local62.anInt1077;
							arg6.method2014((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg6.method2014((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass178ArrayArray1[local32][local35] != null) {
						@Pc(338) Class178 local338 = this.aClass178ArrayArray1[local32][local35];
						for (local85 = 0; local85 < local338.aShort54; local85++) {
							arg7[local85] = local26 + local338.aShortArray49[local85] * 4 / super.anInt9377;
							arg8[local85] = local30 - local338.aShortArray56[local85] * 4 / super.anInt9377;
						}
						for (@Pc(376) int local376 = 0; local376 < local338.aShort55; local376++) {
							@Pc(382) short local382 = local338.aShortArray50[local376];
							@Pc(387) short local387 = local338.aShortArray54[local376];
							@Pc(392) short local392 = local338.aShortArray51[local376];
							@Pc(396) int local396 = arg7[local382];
							@Pc(400) int local400 = arg7[local387];
							@Pc(404) int local404 = arg7[local392];
							@Pc(408) int local408 = arg8[local382];
							@Pc(412) int local412 = arg8[local387];
							@Pc(416) int local416 = arg8[local392];
							@Pc(432) int local432;
							if (local338.anIntArray254 != null && local338.anIntArray254[local376] != -1) {
								local432 = local338.anIntArray254[local376];
								arg6.method2014((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static52.method789(local338.aShortArray55[local382], local432), (float) Static52.method789(local338.aShortArray55[local387], local432), (float) Static52.method789(local338.aShortArray55[local392], local432));
							} else if (local338.aShortArray57 == null || local338.aShortArray57[local376] == -1) {
								local432 = local338.anIntArray253[local376];
								arg6.method2014((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static52.method789(local338.aShortArray55[local382], local432), (float) Static52.method789(local338.aShortArray55[local387], local432), (float) Static52.method789(local338.aShortArray55[local392], local432));
							} else {
								local432 = this.aClass57_Sub1_5.method1074(local338.aShortArray57[local376]);
								arg6.method2014((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static52.method789(local338.aShortArray55[local382], local432), (float) Static52.method789(local338.aShortArray55[local387], local432), (float) Static52.method789(local338.aShortArray55[local392], local432));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean192 = true;
		this.aClass57_Sub1_5.C(local14);
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(III)V")
	private void method5196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class240 local4 = this.aClass57_Sub1_5.method1080(Thread.currentThread());
		local4.aClass110_1.anInt2328 = 0;
		if (this.aClass162ArrayArray1 != null) {
			this.method5191(arg0, arg1, local4.aBoolean499, local4, local4.aClass110_1, local4.anIntArray367, local4.anIntArray366, local4.anIntArray362, local4.anIntArray361, arg2);
		} else if (this.aClass60ArrayArray1 != null) {
			this.method5189(arg0, arg1, local4.aClass110_1, local4.anIntArray367, local4.anIntArray366, local4.anIntArray362, local4.anIntArray361, arg2);
		} else if (this.aClass171ArrayArray1 != null) {
			this.method5194(arg0, arg1, local4.aBoolean499, local4, local4.aClass110_1, local4.anIntArray367, local4.anIntArray366, local4.anIntArray362, local4.anIntArray361, arg2);
		}
	}
}
