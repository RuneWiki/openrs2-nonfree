import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class127_Sub3 extends Class127 {

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "F")
	private float aFloat230;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "[[Lclient!rj;")
	private Class285[][] aClass285ArrayArray1;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "[[Lclient!fp;")
	private Class109[][] aClass109ArrayArray1;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "F")
	private float aFloat231;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "F")
	private float aFloat232;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "F")
	private float aFloat233;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "F")
	private float aFloat234;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "F")
	private float aFloat235;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "[[Lclient!pga;")
	private Class254[][] aClass254ArrayArray1;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "F")
	private float aFloat236;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "F")
	private float aFloat237;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "[[Lclient!dq;")
	private Class72[][] aClass72ArrayArray1;

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "F")
	private float aFloat238;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "F")
	private float aFloat239;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "F")
	private float aFloat240;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "F")
	private float aFloat241;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	private int anInt10013 = -1;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "Lclient!wk;")
	private final Class31_Sub3 aClass31_Sub3_10;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	private final int anInt10012;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray52;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray51;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!wk;IIII[[I[[II)V")
	public Class127_Sub3(@OriginalArg(0) Class31_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass31_Sub3_10 = arg0;
		this.anInt10012 = arg2;
		this.aByteArrayArray52 = new byte[arg3 + 1][arg4 + 1];
		@Pc(29) int local29 = this.aClass31_Sub3_10.anInt10242 >> 9;
		for (@Pc(31) int local31 = 1; local31 < arg4; local31++) {
			for (@Pc(34) int local34 = 1; local34 < arg3; local34++) {
				@Pc(53) int local53 = arg6[local34 + 1][local31] - arg6[local34 - 1][local31];
				@Pc(69) int local69 = arg6[local34][local31 + 1] - arg6[local34][local31 - 1];
				@Pc(84) int local84 = (int) Math.sqrt((double) (local53 * local53 + arg7 * 512 + local69 * local69));
				@Pc(90) int local90 = (local53 << 8) / local84;
				@Pc(96) int local96 = arg7 * -512 / local84;
				@Pc(102) int local102 = (local69 << 8) / local84;
				@Pc(124) int local124 = local29 + (this.aClass31_Sub3_10.anInt10235 * local90 + this.aClass31_Sub3_10.anInt10248 * local96 + this.aClass31_Sub3_10.anInt10246 * local102 >> 17);
				local124 >>= 0x1;
				if (local124 < 2) {
					local124 = 2;
				} else if (local124 > 126) {
					local124 = 126;
				}
				this.aByteArrayArray52[local34][local31] = (byte) local124;
			}
		}
		this.aByteArrayArray51 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method7863(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!wi;[I[I[I[I)V")
	private void method7870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class72 local6 = this.aClass72ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(450) int local450;
		@Pc(480) int local480;
		@Pc(407) float local407;
		@Pc(467) float local467;
		@Pc(73) float local73;
		@Pc(98) float local98;
		@Pc(123) float local123;
		@Pc(774) int local774;
		@Pc(300) int local300;
		@Pc(360) int local360;
		@Pc(420) int local420;
		@Pc(377) float local377;
		@Pc(437) float local437;
		@Pc(287) float local287;
		@Pc(347) float local347;
		if (local6 == null) {
			@Pc(2080) Class109 local2080 = this.aClass109ArrayArray1[arg0][arg1];
			if (local2080 != null) {
				@Pc(2104) short local2104;
				@Pc(2164) float local2164;
				@Pc(2185) float local2185;
				@Pc(2135) float local2135;
				if (this.anInt10013 == -1) {
					for (local450 = 0; local450 < local2080.aShort41; local450++) {
						local24 = local2080.aShortArray61[local450] + (arg0 << super.anInt10008);
						local2104 = local2080.aShortArray57[local450];
						local34 = local2080.aShortArray56[local450] + (arg1 << super.anInt10008);
						local2135 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local2104 + this.aFloat239 * (float) local34;
						if (local2135 <= (float) this.aClass31_Sub3_10.anInt10238) {
							return;
						}
						local2164 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local2104 + this.aFloat238 * (float) local34;
						local2185 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local2104 + this.aFloat236 * (float) local34;
						arg3[local450] = arg2.anInt10187 + (int) (local2164 * (float) this.aClass31_Sub3_10.anInt10240 / local2135);
						arg4[local450] = arg2.anInt10189 + (int) (local2185 * (float) this.aClass31_Sub3_10.anInt10237 / local2135);
						arg5[local450] = (int) local2135;
					}
				} else {
					for (local450 = 0; local450 < local2080.aShort41; local450++) {
						local24 = local2080.aShortArray61[local450] + (arg0 << super.anInt10008);
						local2104 = local2080.aShortArray57[local450];
						local34 = local2080.aShortArray56[local450] + (arg1 << super.anInt10008);
						local2135 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local2104 + this.aFloat239 * (float) local34;
						local2164 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local2104 + this.aFloat238 * (float) local34;
						local2185 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local2104 + this.aFloat236 * (float) local34;
						arg3[local450] = arg2.anInt10187 + (int) (local2164 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
						arg4[local450] = arg2.anInt10189 + (int) (local2185 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
						arg5[local450] = (int) local2135;
					}
				}
				@Pc(2404) int local2404;
				@Pc(2409) int local2409;
				if (local2080.aShortArray62 != null) {
					local450 = super.anIntArrayArray102[arg0][arg1];
					local300 = super.anIntArrayArray102[arg0 + 1][arg1];
					local360 = super.anIntArrayArray102[arg0][arg1 + 1];
					local420 = arg0 * super.anInt10009;
					local480 = local420 + super.anInt10009;
					local2404 = arg1 * super.anInt10009;
					local2409 = local2404 + super.anInt10009;
					local377 = this.aFloat233 + this.aFloat234 * (float) local420 + this.aFloat232 * (float) local450 + this.aFloat238 * (float) local2404;
					local437 = this.aFloat231 + this.aFloat235 * (float) local420 + this.aFloat230 * (float) local450 + this.aFloat236 * (float) local2404;
					local287 = this.aFloat241 + this.aFloat237 * (float) local420 + this.aFloat240 * (float) local450 + this.aFloat239 * (float) local2404;
					local347 = this.aFloat233 + this.aFloat234 * (float) local480 + this.aFloat232 * (float) local300 + this.aFloat238 * (float) local2404;
					local407 = this.aFloat231 + this.aFloat235 * (float) local480 + this.aFloat230 * (float) local300 + this.aFloat236 * (float) local2404;
					local467 = this.aFloat241 + this.aFloat237 * (float) local480 + this.aFloat240 * (float) local300 + this.aFloat239 * (float) local2404;
					local73 = this.aFloat233 + this.aFloat234 * (float) local420 + this.aFloat232 * (float) local360 + this.aFloat238 * (float) local2409;
					local98 = this.aFloat231 + this.aFloat235 * (float) local420 + this.aFloat230 * (float) local360 + this.aFloat236 * (float) local2409;
					local123 = this.aFloat241 + this.aFloat237 * (float) local420 + this.aFloat240 * (float) local360 + this.aFloat239 * (float) local2409;
					@Pc(2604) int local2604;
					@Pc(2610) short local2610;
					@Pc(2615) short local2615;
					@Pc(2620) short local2620;
					@Pc(2628) int local2628;
					@Pc(2632) int local2632;
					@Pc(2636) int local2636;
					@Pc(2640) int local2640;
					@Pc(2644) int local2644;
					@Pc(2688) short local2688;
					@Pc(2761) int local2761;
					if (this.anInt10013 == -1) {
						for (local2604 = 0; local2604 < local2080.aShort40; local2604++) {
							local2610 = local2080.aShortArray59[local2604];
							local2615 = local2080.aShortArray55[local2604];
							local2620 = local2080.aShortArray54[local2604];
							local774 = arg3[local2610];
							local2628 = arg3[local2615];
							local2632 = arg3[local2620];
							local2636 = arg4[local2610];
							local2640 = arg4[local2615];
							local2644 = arg4[local2620];
							if ((local774 - local2628) * (local2644 - local2640) - (local2636 - local2640) * (local2632 - local2628) > 0) {
								arg2.aBoolean714 = local774 < 0 || local2628 < 0 || local2632 < 0 || local774 > arg2.anInt10190 || local2628 > arg2.anInt10190 || local2632 > arg2.anInt10190;
								local2688 = local2080.aShortArray62[local2604];
								if (local2688 == -1) {
									local2761 = local2080.anIntArray136[local2604];
									if (local2761 != -1) {
										arg2.method7982(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], Static39.method1074(local2080.aShortArray58[local2610], local2761), Static39.method1074(local2080.aShortArray58[local2615], local2761), Static39.method1074(local2080.aShortArray58[local2620], local2761));
									}
								} else {
									if (this.method7874(this.aClass31_Sub3_10.anInterface4_14.method7229(local2688).aByte62)) {
										arg2.anInt10191 = 100;
									}
									arg2.method7989(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], local2080.aShortArray58[local2610], local2080.aShortArray58[local2615], local2080.aShortArray58[local2620], (int) local377, (int) local347, (int) local73, (int) local437, (int) local407, (int) local98, (int) local287, (int) local467, (int) local123, local2688);
									arg2.anInt10191 = 0;
								}
							}
						}
						return;
					}
					for (local2604 = 0; local2604 < local2080.aShort40; local2604++) {
						local2610 = local2080.aShortArray59[local2604];
						local2615 = local2080.aShortArray55[local2604];
						local2620 = local2080.aShortArray54[local2604];
						local774 = arg3[local2610];
						local2628 = arg3[local2615];
						local2632 = arg3[local2620];
						local2636 = arg4[local2610];
						local2640 = arg4[local2615];
						local2644 = arg4[local2620];
						if ((local774 - local2628) * (local2644 - local2640) - (local2636 - local2640) * (local2632 - local2628) > 0) {
							arg2.aBoolean714 = local774 < 0 || local2628 < 0 || local2632 < 0 || local774 > arg2.anInt10190 || local2628 > arg2.anInt10190 || local2632 > arg2.anInt10190;
							local2688 = local2080.aShortArray62[local2604];
							if (local2688 == -1) {
								local2761 = local2080.anIntArray136[local2604];
								if (local2761 != -1) {
									arg2.method7982(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], Static39.method1074(local2080.aShortArray58[local2610], local2761), Static39.method1074(local2080.aShortArray58[local2615], local2761), Static39.method1074(local2080.aShortArray58[local2620], local2761));
								}
							} else {
								if (this.method7874(this.aClass31_Sub3_10.anInterface4_14.method7229(local2688).aByte62)) {
									arg2.anInt10191 = 100;
								}
								arg2.method7989(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], local2080.aShortArray58[local2610], local2080.aShortArray58[local2615], local2080.aShortArray58[local2620], (int) local377, (int) local347, (int) local73, (int) local437, (int) local407, (int) local98, this.anInt10013, this.anInt10013, this.anInt10013, local2688);
								arg2.anInt10191 = 0;
							}
						}
					}
					return;
				}
				for (local450 = 0; local450 < local2080.aShort40; local450++) {
					@Pc(3022) short local3022 = local2080.aShortArray59[local450];
					@Pc(3027) short local3027 = local2080.aShortArray55[local450];
					@Pc(3032) short local3032 = local2080.aShortArray54[local450];
					local480 = arg3[local3022];
					local2404 = arg3[local3027];
					local2409 = arg3[local3032];
					@Pc(3048) int local3048 = arg4[local3022];
					@Pc(3052) int local3052 = arg4[local3027];
					@Pc(3056) int local3056 = arg4[local3032];
					if ((local480 - local2404) * (local3056 - local3052) - (local3048 - local3052) * (local2409 - local2404) > 0) {
						@Pc(3077) int local3077 = local2080.anIntArray136[local450];
						if (local3077 != -1) {
							arg2.aBoolean714 = local480 < 0 || local2404 < 0 || local2409 < 0 || local480 > arg2.anInt10190 || local2404 > arg2.anInt10190 || local2409 > arg2.anInt10190;
							arg2.method7982(local3048, local3052, local3056, local480, local2404, local2409, arg5[local3022], arg5[local3027], arg5[local3032], Static39.method1074(local2080.aShortArray58[local3022], local3077), Static39.method1074(local2080.aShortArray58[local3027], local3077), Static39.method1074(local2080.aShortArray58[local3032], local3077));
						}
					}
				}
			}
		} else if ((local6.aByte25 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt10009;
			local24 = local19 + super.anInt10009;
			@Pc(29) int local29 = arg1 * super.anInt10009;
			local34 = local29 + super.anInt10009;
			@Pc(270) int local270;
			@Pc(330) int local330;
			@Pc(390) int local390;
			@Pc(257) float local257;
			@Pc(317) float local317;
			@Pc(148) float local148;
			@Pc(46) int local46;
			if ((local6.aByte25 & 0x1) == 0) {
				local46 = super.anIntArrayArray102[arg0][arg1];
				@Pc(754) int local754 = super.anIntArrayArray102[arg0 + 1][arg1];
				@Pc(765) int local765 = super.anIntArrayArray102[arg0 + 1][arg1 + 1];
				local774 = super.anIntArrayArray102[arg0][arg1 + 1];
				if (this.anInt10013 == -1) {
					local73 = this.aFloat241 + this.aFloat237 * (float) local19 + this.aFloat240 * (float) local46 + this.aFloat239 * (float) local29;
					if (local73 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local98 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local754 + this.aFloat239 * (float) local29;
					if (local98 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local123 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local765 + this.aFloat239 * (float) local34;
					if (local123 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local148 = this.aFloat241 + this.aFloat237 * (float) local19 + this.aFloat240 * (float) local774 + this.aFloat239 * (float) local34;
					if (local148 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local257 = this.aFloat233 + this.aFloat234 * (float) local19 + this.aFloat232 * (float) local46 + this.aFloat238 * (float) local29;
					local270 = arg2.anInt10187 + (int) (local257 * (float) this.aClass31_Sub3_10.anInt10240 / local73);
					local287 = this.aFloat231 + this.aFloat235 * (float) local19 + this.aFloat230 * (float) local46 + this.aFloat236 * (float) local29;
					local300 = arg2.anInt10189 + (int) (local287 * (float) this.aClass31_Sub3_10.anInt10237 / local73);
					local317 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local754 + this.aFloat238 * (float) local29;
					local330 = arg2.anInt10187 + (int) (local317 * (float) this.aClass31_Sub3_10.anInt10240 / local98);
					local347 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local754 + this.aFloat236 * (float) local29;
					local360 = arg2.anInt10189 + (int) (local347 * (float) this.aClass31_Sub3_10.anInt10237 / local98);
					local377 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local765 + this.aFloat238 * (float) local34;
					local390 = arg2.anInt10187 + (int) (local377 * (float) this.aClass31_Sub3_10.anInt10240 / local123);
					local407 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local765 + this.aFloat236 * (float) local34;
					local420 = arg2.anInt10189 + (int) (local407 * (float) this.aClass31_Sub3_10.anInt10237 / local123);
					local437 = this.aFloat233 + this.aFloat234 * (float) local19 + this.aFloat232 * (float) local774 + this.aFloat238 * (float) local34;
					local450 = arg2.anInt10187 + (int) (local437 * (float) this.aClass31_Sub3_10.anInt10240 / local148);
					local467 = this.aFloat231 + this.aFloat235 * (float) local19 + this.aFloat230 * (float) local774 + this.aFloat236 * (float) local34;
					local480 = arg2.anInt10189 + (int) (local467 * (float) this.aClass31_Sub3_10.anInt10237 / local148);
				} else {
					local73 = this.aFloat241 + this.aFloat237 * (float) local19 + this.aFloat240 * (float) local46 + this.aFloat239 * (float) local29;
					local98 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local754 + this.aFloat239 * (float) local29;
					local123 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local765 + this.aFloat239 * (float) local34;
					local148 = this.aFloat241 + this.aFloat237 * (float) local19 + this.aFloat240 * (float) local774 + this.aFloat239 * (float) local34;
					local257 = this.aFloat233 + this.aFloat234 * (float) local19 + this.aFloat232 * (float) local46 + this.aFloat238 * (float) local29;
					local270 = arg2.anInt10187 + (int) (local257 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local287 = this.aFloat231 + this.aFloat235 * (float) local19 + this.aFloat230 * (float) local46 + this.aFloat236 * (float) local29;
					local300 = arg2.anInt10189 + (int) (local287 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local317 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local754 + this.aFloat238 * (float) local29;
					local330 = arg2.anInt10187 + (int) (local317 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local347 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local754 + this.aFloat236 * (float) local29;
					local360 = arg2.anInt10189 + (int) (local347 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local377 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local765 + this.aFloat238 * (float) local34;
					local390 = arg2.anInt10187 + (int) (local377 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local407 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local765 + this.aFloat236 * (float) local34;
					local420 = arg2.anInt10189 + (int) (local407 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local437 = this.aFloat233 + this.aFloat234 * (float) local19 + this.aFloat232 * (float) local774 + this.aFloat238 * (float) local34;
					local450 = arg2.anInt10187 + (int) (local437 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local467 = this.aFloat231 + this.aFloat235 * (float) local19 + this.aFloat230 * (float) local774 + this.aFloat236 * (float) local34;
					local480 = arg2.anInt10189 + (int) (local467 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
				}
			} else {
				local46 = super.anIntArrayArray102[arg0][arg1];
				@Pc(52) float local52 = this.aFloat240 * (float) local46;
				if (this.anInt10013 == -1) {
					local73 = this.aFloat241 + this.aFloat237 * (float) local19 + local52 + this.aFloat239 * (float) local29;
					if (local73 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local98 = this.aFloat241 + this.aFloat237 * (float) local24 + local52 + this.aFloat239 * (float) local29;
					if (local98 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local123 = this.aFloat241 + this.aFloat237 * (float) local24 + local52 + this.aFloat239 * (float) local34;
					if (local123 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local148 = this.aFloat241 + this.aFloat237 * (float) local19 + local52 + this.aFloat239 * (float) local34;
					if (local148 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
				} else {
					local73 = this.aFloat241 + this.aFloat237 * (float) local19 + local52 + this.aFloat239 * (float) local29;
					local98 = this.aFloat241 + this.aFloat237 * (float) local24 + local52 + this.aFloat239 * (float) local29;
					local123 = this.aFloat241 + this.aFloat237 * (float) local24 + local52 + this.aFloat239 * (float) local34;
					local148 = this.aFloat241 + this.aFloat237 * (float) local19 + local52 + this.aFloat239 * (float) local34;
				}
				@Pc(230) float local230 = this.aFloat232 * (float) local46;
				@Pc(236) float local236 = this.aFloat230 * (float) local46;
				if (this.anInt10013 == -1) {
					local257 = this.aFloat233 + this.aFloat234 * (float) local19 + local230 + this.aFloat238 * (float) local29;
					local270 = arg2.anInt10187 + (int) (local257 * (float) this.aClass31_Sub3_10.anInt10240 / local73);
					local287 = this.aFloat231 + this.aFloat235 * (float) local19 + local236 + this.aFloat236 * (float) local29;
					local300 = arg2.anInt10189 + (int) (local287 * (float) this.aClass31_Sub3_10.anInt10237 / local73);
					local317 = this.aFloat233 + this.aFloat234 * (float) local24 + local230 + this.aFloat238 * (float) local29;
					local330 = arg2.anInt10187 + (int) (local317 * (float) this.aClass31_Sub3_10.anInt10240 / local98);
					local347 = this.aFloat231 + this.aFloat235 * (float) local24 + local236 + this.aFloat236 * (float) local29;
					local360 = arg2.anInt10189 + (int) (local347 * (float) this.aClass31_Sub3_10.anInt10237 / local98);
					local377 = this.aFloat233 + this.aFloat234 * (float) local24 + local230 + this.aFloat238 * (float) local34;
					local390 = arg2.anInt10187 + (int) (local377 * (float) this.aClass31_Sub3_10.anInt10240 / local123);
					local407 = this.aFloat231 + this.aFloat235 * (float) local24 + local236 + this.aFloat236 * (float) local34;
					local420 = arg2.anInt10189 + (int) (local407 * (float) this.aClass31_Sub3_10.anInt10237 / local123);
					local437 = this.aFloat233 + this.aFloat234 * (float) local19 + local230 + this.aFloat238 * (float) local34;
					local450 = arg2.anInt10187 + (int) (local437 * (float) this.aClass31_Sub3_10.anInt10240 / local148);
					local467 = this.aFloat231 + this.aFloat235 * (float) local19 + local236 + this.aFloat236 * (float) local34;
					local480 = arg2.anInt10189 + (int) (local467 * (float) this.aClass31_Sub3_10.anInt10237 / local148);
				} else {
					local257 = this.aFloat233 + this.aFloat234 * (float) local19 + local230 + this.aFloat238 * (float) local29;
					local270 = arg2.anInt10187 + (int) (local257 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local287 = this.aFloat231 + this.aFloat235 * (float) local19 + local236 + this.aFloat236 * (float) local29;
					local300 = arg2.anInt10189 + (int) (local287 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local317 = this.aFloat233 + this.aFloat234 * (float) local24 + local230 + this.aFloat238 * (float) local29;
					local330 = arg2.anInt10187 + (int) (local317 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local347 = this.aFloat231 + this.aFloat235 * (float) local24 + local236 + this.aFloat236 * (float) local29;
					local360 = arg2.anInt10189 + (int) (local347 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local377 = this.aFloat233 + this.aFloat234 * (float) local24 + local230 + this.aFloat238 * (float) local34;
					local390 = arg2.anInt10187 + (int) (local377 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local407 = this.aFloat231 + this.aFloat235 * (float) local24 + local236 + this.aFloat236 * (float) local34;
					local420 = arg2.anInt10189 + (int) (local407 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local437 = this.aFloat233 + this.aFloat234 * (float) local19 + local230 + this.aFloat238 * (float) local34;
					local450 = arg2.anInt10187 + (int) (local437 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local467 = this.aFloat231 + this.aFloat235 * (float) local19 + local236 + this.aFloat236 * (float) local34;
					local480 = arg2.anInt10189 + (int) (local467 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
				}
			}
			if (this.anInt10013 == -1) {
				if ((local390 - local450) * (local360 - local480) - (local420 - local480) * (local330 - local450) > 0) {
					arg2.aBoolean714 = local390 < 0 || local450 < 0 || local330 < 0 || local390 > arg2.anInt10190 || local450 > arg2.anInt10190 || local330 > arg2.anInt10190;
					if (local6.aShort35 >= 0) {
						if (this.method7874(this.aClass31_Sub3_10.anInterface4_14.method7229(local6.aShort35).aByte62)) {
							arg2.anInt10191 = 100;
						}
						arg2.method7989(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort31 & 0xFFFF, local6.aShort33 & 0xFFFF, local6.aShort34 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, (int) local73, (int) local98, (int) local148, local6.aShort35);
						arg2.anInt10191 = 0;
					} else {
						arg2.method7982(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort31 & 0xFFFF, local6.aShort33 & 0xFFFF, local6.aShort34 & 0xFFFF);
					}
				}
				if ((local270 - local330) * (local480 - local360) - (local300 - local360) * (local450 - local330) > 0) {
					arg2.aBoolean714 = local270 < 0 || local330 < 0 || local450 < 0 || local270 > arg2.anInt10190 || local330 > arg2.anInt10190 || local450 > arg2.anInt10190;
					if (local6.aShort35 >= 0) {
						if (this.method7874(this.aClass31_Sub3_10.anInterface4_14.method7229(local6.aShort35).aByte62)) {
							arg2.anInt10191 = 100;
						}
						arg2.method7989(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort32 & 0xFFFF, local6.aShort34 & 0xFFFF, local6.aShort33 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, (int) local73, (int) local98, (int) local148, local6.aShort35);
						arg2.anInt10191 = 0;
						return;
					}
					arg2.method7982(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort32 & 0xFFFF, local6.aShort34 & 0xFFFF, local6.aShort33 & 0xFFFF);
					return;
				}
			} else {
				if ((local390 - local450) * (local360 - local480) - (local420 - local480) * (local330 - local450) > 0) {
					arg2.aBoolean714 = local390 < 0 || local450 < 0 || local330 < 0 || local390 > arg2.anInt10190 || local450 > arg2.anInt10190 || local330 > arg2.anInt10190;
					if (local6.aShort35 >= 0) {
						if (this.method7874(this.aClass31_Sub3_10.anInterface4_14.method7229(local6.aShort35).aByte62)) {
							arg2.anInt10191 = 100;
						}
						arg2.method7989(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort31 & 0xFFFF, local6.aShort33 & 0xFFFF, local6.aShort34 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, this.anInt10013, this.anInt10013, this.anInt10013, local6.aShort35);
						arg2.anInt10191 = 0;
					} else {
						arg2.method7982(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort31 & 0xFFFF, local6.aShort33 & 0xFFFF, local6.aShort34 & 0xFFFF);
					}
				}
				if ((local270 - local330) * (local480 - local360) - (local300 - local360) * (local450 - local330) > 0) {
					arg2.aBoolean714 = local270 < 0 || local330 < 0 || local450 < 0 || local270 > arg2.anInt10190 || local330 > arg2.anInt10190 || local450 > arg2.anInt10190;
					if (local6.aShort35 >= 0) {
						if (this.method7874(this.aClass31_Sub3_10.anInterface4_14.method7229(local6.aShort35).aByte62)) {
							arg2.anInt10191 = 100;
						}
						arg2.method7989(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort32 & 0xFFFF, local6.aShort34 & 0xFFFF, local6.aShort33 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, this.anInt10013, this.anInt10013, this.anInt10013, local6.aShort35);
						arg2.anInt10191 = 0;
						return;
					}
					arg2.method7982(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort32 & 0xFFFF, local6.aShort34 & 0xFFFF, local6.aShort33 & 0xFFFF);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZLclient!mf;Lclient!wi;[I[I[I[I)V")
	private void method7871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class202 arg3, @OriginalArg(4) Class359 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8) {
		@Pc(6) Class285 local6 = this.aClass285ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(527) int local527;
		@Pc(377) int local377;
		@Pc(437) int local437;
		@Pc(497) int local497;
		@Pc(557) int local557;
		@Pc(484) float local484;
		@Pc(544) float local544;
		@Pc(83) float local83;
		@Pc(108) float local108;
		@Pc(133) float local133;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(244) int local244;
		@Pc(56) int local56;
		@Pc(831) int local831;
		@Pc(842) int local842;
		@Pc(851) int local851;
		@Pc(1080) int local1080;
		@Pc(454) float local454;
		@Pc(514) float local514;
		@Pc(364) float local364;
		@Pc(424) float local424;
		if (local6 == null) {
			@Pc(2770) Class254 local2770 = this.aClass254ArrayArray1[arg0][arg1];
			if (local2770 != null) {
				@Pc(2919) float local2919;
				@Pc(2940) float local2940;
				@Pc(2825) float local2825;
				if (this.anInt10013 == -1) {
					for (local527 = 0; local527 < local2770.aShort95; local527++) {
						local24 = local2770.aShortArray107[local527] + (arg0 << super.anInt10008);
						local29 = local2770.aShortArray110[local527];
						local34 = local2770.aShortArray106[local527] + (arg1 << super.anInt10008);
						local2825 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local29 + this.aFloat239 * (float) local34;
						if (local2825 <= (float) this.aClass31_Sub3_10.anInt10238) {
							return;
						}
						arg8[local527] = 0;
						if (arg2) {
							local377 = (int) (local2825 - (float) arg3.anInt5998);
							if (local377 > 255) {
								local377 = 255;
							}
							if (local377 > 0) {
								arg8[local527] = local377;
								local437 = local2770.aShortArray109[local527] * local377 / 255;
								if (local437 > 0) {
									local29 -= local437;
								}
							}
						} else if (arg3.aBoolean424) {
							local377 = (int) (local2825 - (float) arg3.anInt5998);
							if (local377 > 0) {
								arg8[local527] = local377;
								if (arg8[local527] > 255) {
									arg8[local527] = 255;
								}
							}
						}
						local2919 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local29 + this.aFloat238 * (float) local34;
						local2940 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local29 + this.aFloat236 * (float) local34;
						arg5[local527] = arg4.anInt10187 + (int) (local2919 * (float) this.aClass31_Sub3_10.anInt10240 / local2825);
						arg6[local527] = arg4.anInt10189 + (int) (local2940 * (float) this.aClass31_Sub3_10.anInt10237 / local2825);
						arg7[local527] = (int) local2825;
					}
				} else {
					for (local527 = 0; local527 < local2770.aShort95; local527++) {
						local24 = local2770.aShortArray107[local527] + (arg0 << super.anInt10008);
						local29 = local2770.aShortArray110[local527];
						local34 = local2770.aShortArray106[local527] + (arg1 << super.anInt10008);
						local2825 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local29 + this.aFloat239 * (float) local34;
						arg8[local527] = 0;
						if (arg2) {
							local377 = this.anInt10013 - arg3.anInt5998;
							if (local377 > 255) {
								local377 = 255;
							}
							if (local377 > 0) {
								arg8[local527] = local377;
								local437 = local2770.aShortArray109[local527] * local377 / 255;
								if (local437 > 0) {
									local29 -= local437;
								}
							}
						} else if (arg3.aBoolean424) {
							local377 = this.anInt10013 - arg3.anInt5998;
							if (local377 > 0) {
								arg8[local527] = local377;
								if (arg8[local527] > 255) {
									arg8[local527] = 255;
								}
							}
						}
						local2919 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local29 + this.aFloat238 * (float) local34;
						local2940 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local29 + this.aFloat236 * (float) local34;
						arg5[local527] = arg4.anInt10187 + (int) (local2919 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
						arg6[local527] = arg4.anInt10189 + (int) (local2940 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
						arg7[local527] = (int) local2825;
					}
				}
				@Pc(3222) int local3222;
				@Pc(3227) int local3227;
				if (local2770.aShortArray108 != null) {
					local527 = super.anIntArrayArray102[arg0][arg1];
					local377 = super.anIntArrayArray102[arg0 + 1][arg1];
					local437 = super.anIntArrayArray102[arg0][arg1 + 1];
					local497 = arg0 * super.anInt10009;
					local557 = local497 + super.anInt10009;
					local3222 = arg1 * super.anInt10009;
					local3227 = local3222 + super.anInt10009;
					local454 = this.aFloat233 + this.aFloat234 * (float) local497 + this.aFloat232 * (float) local527 + this.aFloat238 * (float) local3222;
					local514 = this.aFloat231 + this.aFloat235 * (float) local497 + this.aFloat230 * (float) local527 + this.aFloat236 * (float) local3222;
					local364 = this.aFloat241 + this.aFloat237 * (float) local497 + this.aFloat240 * (float) local527 + this.aFloat239 * (float) local3222;
					local424 = this.aFloat233 + this.aFloat234 * (float) local557 + this.aFloat232 * (float) local377 + this.aFloat238 * (float) local3222;
					local484 = this.aFloat231 + this.aFloat235 * (float) local557 + this.aFloat230 * (float) local377 + this.aFloat236 * (float) local3222;
					local544 = this.aFloat241 + this.aFloat237 * (float) local557 + this.aFloat240 * (float) local377 + this.aFloat239 * (float) local3222;
					local83 = this.aFloat233 + this.aFloat234 * (float) local497 + this.aFloat232 * (float) local437 + this.aFloat238 * (float) local3227;
					local108 = this.aFloat231 + this.aFloat235 * (float) local497 + this.aFloat230 * (float) local437 + this.aFloat236 * (float) local3227;
					local133 = this.aFloat241 + this.aFloat237 * (float) local497 + this.aFloat240 * (float) local437 + this.aFloat239 * (float) local3227;
					@Pc(3422) int local3422;
					@Pc(3515) short local3515;
					if (this.anInt10013 == -1) {
						for (local3422 = 0; local3422 < local2770.aShort96; local3422++) {
							local36 = local3422 * 3;
							local38 = local36 + 1;
							local40 = local38 + 1;
							local42 = arg5[local36];
							local244 = arg5[local38];
							local56 = arg5[local40];
							local831 = arg6[local36];
							local842 = arg6[local38];
							local851 = arg6[local40];
							local1080 = arg8[local36] + arg8[local38] + arg8[local40];
							if ((local42 - local244) * (local851 - local842) - (local831 - local842) * (local56 - local244) > 0) {
								arg4.aBoolean714 = local42 < 0 || local244 < 0 || local56 < 0 || local42 > arg4.anInt10190 || local244 > arg4.anInt10190 || local56 > arg4.anInt10190;
								local3515 = local2770.aShortArray108[local3422];
								if (local1080 < 765) {
									if (local3515 != -1 && this.method7874(this.aClass31_Sub3_10.anInterface4_14.method7229(local3515).aByte62)) {
										arg4.anInt10191 = 100;
									}
									if (local1080 > 0) {
										if (local3515 != -1) {
											arg4.method7978(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt5991, arg8[local36], arg8[local38], arg8[local40], local2770.anIntArray417[local36], local2770.anIntArray417[local38], local2770.anIntArray417[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, (int) local364, (int) local544, (int) local133, local3515);
										} else if ((local2770.anIntArray417[local36] & 0xFFFFFF) != 0) {
											arg4.method7994(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], Static62.method1512(arg8[local36] << 24 | arg3.anInt5991, local2770.anIntArray417[local36]), Static62.method1512(arg8[local38] << 24 | arg3.anInt5991, local2770.anIntArray417[local38]), Static62.method1512(arg8[local40] << 24 | arg3.anInt5991, local2770.anIntArray417[local40]));
										}
									} else if (local3515 != -1) {
										arg4.method7989(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray417[local36], local2770.anIntArray417[local38], local2770.anIntArray417[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, (int) local364, (int) local544, (int) local133, local3515);
									} else if ((local2770.anIntArray417[local36] & 0xFFFFFF) != 0) {
										arg4.method7994(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray417[local36], local2770.anIntArray417[local38], local2770.anIntArray417[local40]);
									}
									arg4.anInt10191 = 0;
								} else {
									arg4.method7975(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt5991);
								}
							}
						}
						return;
					}
					for (local3422 = 0; local3422 < local2770.aShort96; local3422++) {
						local36 = local3422 * 3;
						local38 = local36 + 1;
						local40 = local38 + 1;
						local42 = arg5[local36];
						local244 = arg5[local38];
						local56 = arg5[local40];
						local831 = arg6[local36];
						local842 = arg6[local38];
						local851 = arg6[local40];
						local1080 = arg8[local36] + arg8[local38] + arg8[local40];
						if ((local42 - local244) * (local851 - local842) - (local831 - local842) * (local56 - local244) > 0) {
							arg4.aBoolean714 = local42 < 0 || local244 < 0 || local56 < 0 || local42 > arg4.anInt10190 || local244 > arg4.anInt10190 || local56 > arg4.anInt10190;
							local3515 = local2770.aShortArray108[local3422];
							if (local1080 < 765) {
								if (local3515 != -1 && this.method7874(this.aClass31_Sub3_10.anInterface4_14.method7229(local3515).aByte62)) {
									arg4.anInt10191 = 100;
								}
								if (local1080 > 0) {
									if (local3515 != -1) {
										arg4.method7978(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt5991, arg8[local36], arg8[local38], arg8[local40], local2770.anIntArray417[local36], local2770.anIntArray417[local38], local2770.anIntArray417[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, this.anInt10013, this.anInt10013, this.anInt10013, local3515);
									} else if ((local2770.anIntArray417[local36] & 0xFFFFFF) != 0) {
										arg4.method7994(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], Static62.method1512(arg8[local36] << 24 | arg3.anInt5991, local2770.anIntArray417[local36]), Static62.method1512(arg8[local38] << 24 | arg3.anInt5991, local2770.anIntArray417[local38]), Static62.method1512(arg8[local40] << 24 | arg3.anInt5991, local2770.anIntArray417[local40]));
									}
								} else if (local3515 != -1) {
									arg4.method7989(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray417[local36], local2770.anIntArray417[local38], local2770.anIntArray417[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, this.anInt10013, this.anInt10013, this.anInt10013, local3515);
								} else if ((local2770.anIntArray417[local36] & 0xFFFFFF) != 0) {
									arg4.method7994(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray417[local36], local2770.anIntArray417[local38], local2770.anIntArray417[local40]);
								}
								arg4.anInt10191 = 0;
							} else {
								arg4.method7975(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt5991);
							}
						}
					}
					return;
				}
				for (local527 = 0; local527 < local2770.aShort96; local527++) {
					local377 = local527 * 3;
					local437 = local377 + 1;
					local497 = local437 + 1;
					local557 = arg5[local377];
					local3222 = arg5[local437];
					local3227 = arg5[local497];
					@Pc(4177) int local4177 = arg6[local377];
					@Pc(4181) int local4181 = arg6[local437];
					@Pc(4185) int local4185 = arg6[local497];
					@Pc(4197) int local4197 = arg8[local377] + arg8[local437] + arg8[local497];
					if ((local557 - local3222) * (local4185 - local4181) - (local4177 - local4181) * (local3227 - local3222) > 0) {
						arg4.aBoolean714 = local557 < 0 || local3222 < 0 || local3227 < 0 || local557 > arg4.anInt10190 || local3222 > arg4.anInt10190 || local3227 > arg4.anInt10190;
						if (local4197 >= 765) {
							arg4.method7975(local4177, local4181, local4185, local557, local3222, local3227, arg7[local377], arg7[local437], arg7[local497], arg3.anInt5991);
						} else if (local4197 > 0) {
							if ((local2770.anIntArray417[local377] & 0xFFFFFF) != 0) {
								arg4.method7994(local4177, local4181, local4185, local557, local3222, local3227, arg7[local377], arg7[local437], arg7[local497], Static346.method5021(arg3.anInt5991, local2770.anIntArray417[local377], arg8[local377]), Static346.method5021(arg3.anInt5991, local2770.anIntArray417[local437], arg8[local437]), Static346.method5021(arg3.anInt5991, local2770.anIntArray417[local497], arg8[local497]));
							}
						} else if ((local2770.anIntArray417[local377] & 0xFFFFFF) != 0) {
							arg4.method7994(local4177, local4181, local4185, local557, local3222, local3227, arg7[local377], arg7[local437], arg7[local497], local2770.anIntArray417[local377], local2770.anIntArray417[local437], local2770.anIntArray417[local497]);
						}
					}
				}
			}
		} else if ((local6.aByte116 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt10009;
			local24 = local19 + super.anInt10009;
			local29 = arg1 * super.anInt10009;
			local34 = local29 + super.anInt10009;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			@Pc(347) int local347;
			@Pc(407) int local407;
			@Pc(467) int local467;
			@Pc(334) float local334;
			@Pc(394) float local394;
			@Pc(158) float local158;
			if ((local6.aByte116 & 0x1) == 0 || arg2) {
				local56 = super.anIntArrayArray102[arg0][arg1];
				local831 = super.anIntArrayArray102[arg0 + 1][arg1];
				local842 = super.anIntArrayArray102[arg0 + 1][arg1 + 1];
				local851 = super.anIntArrayArray102[arg0][arg1 + 1];
				if (this.anInt10013 == -1) {
					local83 = this.aFloat241 + this.aFloat237 * (float) local19 + this.aFloat240 * (float) local56 + this.aFloat239 * (float) local29;
					if (local83 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local108 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local831 + this.aFloat239 * (float) local29;
					if (local108 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local133 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local842 + this.aFloat239 * (float) local34;
					if (local133 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local158 = this.aFloat241 + this.aFloat237 * (float) local19 + this.aFloat240 * (float) local851 + this.aFloat239 * (float) local34;
					if (local158 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
				} else {
					local83 = this.aFloat241 + this.aFloat237 * (float) local19 + this.aFloat240 * (float) local56 + this.aFloat239 * (float) local29;
					local108 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local831 + this.aFloat239 * (float) local29;
					local133 = this.aFloat241 + this.aFloat237 * (float) local24 + this.aFloat240 * (float) local842 + this.aFloat239 * (float) local34;
					local158 = this.aFloat241 + this.aFloat237 * (float) local19 + this.aFloat240 * (float) local851 + this.aFloat239 * (float) local34;
				}
				if (arg2) {
					local244 = (int) (local83 - (float) arg3.anInt5998);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local36 = local244;
						local1080 = local6.aShort101 * local244 / 255;
						if (local1080 > 0) {
							local56 -= local1080;
						}
					}
					local244 = (int) (local108 - (float) arg3.anInt5998);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local38 = local244;
						local1080 = local6.aShort102 * local244 / 255;
						if (local1080 > 0) {
							local831 -= local1080;
						}
					}
					local244 = (int) (local133 - (float) arg3.anInt5998);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local40 = local244;
						local1080 = local6.aShort104 * local244 / 255;
						if (local1080 > 0) {
							local842 -= local1080;
						}
					}
					local244 = (int) (local158 - (float) arg3.anInt5998);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local42 = local244;
						local1080 = local6.aShort100 * local244 / 255;
						if (local1080 > 0) {
							local851 -= local1080;
						}
					}
				} else if (arg3.aBoolean424) {
					local244 = (int) (local83 - (float) arg3.anInt5998);
					if (local244 > 0) {
						local36 = local244;
						if (local244 > 255) {
							local36 = 255;
						}
					}
					local244 = (int) (local108 - (float) arg3.anInt5998);
					if (local244 > 0) {
						local38 = local244;
						if (local244 > 255) {
							local38 = 255;
						}
					}
					local244 = (int) (local133 - (float) arg3.anInt5998);
					if (local244 > 0) {
						local40 = local244;
						if (local244 > 255) {
							local40 = 255;
						}
					}
					local244 = (int) (local158 - (float) arg3.anInt5998);
					if (local244 > 0) {
						local42 = local244;
						if (local244 > 255) {
							local42 = 255;
						}
					}
				}
				if (this.anInt10013 == -1) {
					local334 = this.aFloat233 + this.aFloat234 * (float) local19 + this.aFloat232 * (float) local56 + this.aFloat238 * (float) local29;
					local347 = arg4.anInt10187 + (int) (local334 * (float) this.aClass31_Sub3_10.anInt10240 / local83);
					local364 = this.aFloat231 + this.aFloat235 * (float) local19 + this.aFloat230 * (float) local56 + this.aFloat236 * (float) local29;
					local377 = arg4.anInt10189 + (int) (local364 * (float) this.aClass31_Sub3_10.anInt10237 / local83);
					local394 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local831 + this.aFloat238 * (float) local29;
					local407 = arg4.anInt10187 + (int) (local394 * (float) this.aClass31_Sub3_10.anInt10240 / local108);
					local424 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local831 + this.aFloat236 * (float) local29;
					local437 = arg4.anInt10189 + (int) (local424 * (float) this.aClass31_Sub3_10.anInt10237 / local108);
					local454 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local842 + this.aFloat238 * (float) local34;
					local467 = arg4.anInt10187 + (int) (local454 * (float) this.aClass31_Sub3_10.anInt10240 / local133);
					local484 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local842 + this.aFloat236 * (float) local34;
					local497 = arg4.anInt10189 + (int) (local484 * (float) this.aClass31_Sub3_10.anInt10237 / local133);
					local514 = this.aFloat233 + this.aFloat234 * (float) local19 + this.aFloat232 * (float) local851 + this.aFloat238 * (float) local34;
					local527 = arg4.anInt10187 + (int) (local514 * (float) this.aClass31_Sub3_10.anInt10240 / local158);
					local544 = this.aFloat231 + this.aFloat235 * (float) local19 + this.aFloat230 * (float) local851 + this.aFloat236 * (float) local34;
					local557 = arg4.anInt10189 + (int) (local544 * (float) this.aClass31_Sub3_10.anInt10237 / local158);
				} else {
					local334 = this.aFloat233 + this.aFloat234 * (float) local19 + this.aFloat232 * (float) local56 + this.aFloat238 * (float) local29;
					local347 = arg4.anInt10187 + (int) (local334 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local364 = this.aFloat231 + this.aFloat235 * (float) local19 + this.aFloat230 * (float) local56 + this.aFloat236 * (float) local29;
					local377 = arg4.anInt10189 + (int) (local364 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local394 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local831 + this.aFloat238 * (float) local29;
					local407 = arg4.anInt10187 + (int) (local394 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local424 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local831 + this.aFloat236 * (float) local29;
					local437 = arg4.anInt10189 + (int) (local424 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local454 = this.aFloat233 + this.aFloat234 * (float) local24 + this.aFloat232 * (float) local842 + this.aFloat238 * (float) local34;
					local467 = arg4.anInt10187 + (int) (local454 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local484 = this.aFloat231 + this.aFloat235 * (float) local24 + this.aFloat230 * (float) local842 + this.aFloat236 * (float) local34;
					local497 = arg4.anInt10189 + (int) (local484 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local514 = this.aFloat233 + this.aFloat234 * (float) local19 + this.aFloat232 * (float) local851 + this.aFloat238 * (float) local34;
					local527 = arg4.anInt10187 + (int) (local514 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local544 = this.aFloat231 + this.aFloat235 * (float) local19 + this.aFloat230 * (float) local851 + this.aFloat236 * (float) local34;
					local557 = arg4.anInt10189 + (int) (local544 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
				}
			} else {
				local56 = super.anIntArrayArray102[arg0][arg1];
				@Pc(62) float local62 = this.aFloat240 * (float) local56;
				if (this.anInt10013 == -1) {
					local83 = this.aFloat241 + this.aFloat237 * (float) local19 + local62 + this.aFloat239 * (float) local29;
					if (local83 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local108 = this.aFloat241 + this.aFloat237 * (float) local24 + local62 + this.aFloat239 * (float) local29;
					if (local108 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local133 = this.aFloat241 + this.aFloat237 * (float) local24 + local62 + this.aFloat239 * (float) local34;
					if (local133 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
					local158 = this.aFloat241 + this.aFloat237 * (float) local19 + local62 + this.aFloat239 * (float) local34;
					if (local158 <= (float) this.aClass31_Sub3_10.anInt10238) {
						return;
					}
				} else {
					local83 = this.aFloat241 + this.aFloat237 * (float) local19 + local62 + this.aFloat239 * (float) local29;
					local108 = this.aFloat241 + this.aFloat237 * (float) local24 + local62 + this.aFloat239 * (float) local29;
					local133 = this.aFloat241 + this.aFloat237 * (float) local24 + local62 + this.aFloat239 * (float) local34;
					local158 = this.aFloat241 + this.aFloat237 * (float) local19 + local62 + this.aFloat239 * (float) local34;
				}
				if (arg3.aBoolean424) {
					local244 = (int) (local83 - (float) arg3.anInt5998);
					if (local244 > 0) {
						local36 = local244;
						if (local244 > 255) {
							local36 = 255;
						}
					}
					local244 = (int) (local108 - (float) arg3.anInt5998);
					if (local244 > 0) {
						local38 = local244;
						if (local244 > 255) {
							local38 = 255;
						}
					}
					local244 = (int) (local133 - (float) arg3.anInt5998);
					if (local244 > 0) {
						local40 = local244;
						if (local244 > 255) {
							local40 = 255;
						}
					}
					local244 = (int) (local158 - (float) arg3.anInt5998);
					if (local244 > 0) {
						local42 = local244;
						if (local244 > 255) {
							local42 = 255;
						}
					}
				}
				@Pc(307) float local307 = this.aFloat232 * (float) local56;
				@Pc(313) float local313 = this.aFloat230 * (float) local56;
				if (this.anInt10013 == -1) {
					local334 = this.aFloat233 + this.aFloat234 * (float) local19 + local307 + this.aFloat238 * (float) local29;
					local347 = arg4.anInt10187 + (int) (local334 * (float) this.aClass31_Sub3_10.anInt10240 / local83);
					local364 = this.aFloat231 + this.aFloat235 * (float) local19 + local313 + this.aFloat236 * (float) local29;
					local377 = arg4.anInt10189 + (int) (local364 * (float) this.aClass31_Sub3_10.anInt10237 / local83);
					local394 = this.aFloat233 + this.aFloat234 * (float) local24 + local307 + this.aFloat238 * (float) local29;
					local407 = arg4.anInt10187 + (int) (local394 * (float) this.aClass31_Sub3_10.anInt10240 / local108);
					local424 = this.aFloat231 + this.aFloat235 * (float) local24 + local313 + this.aFloat236 * (float) local29;
					local437 = arg4.anInt10189 + (int) (local424 * (float) this.aClass31_Sub3_10.anInt10237 / local108);
					local454 = this.aFloat233 + this.aFloat234 * (float) local24 + local307 + this.aFloat238 * (float) local34;
					local467 = arg4.anInt10187 + (int) (local454 * (float) this.aClass31_Sub3_10.anInt10240 / local133);
					local484 = this.aFloat231 + this.aFloat235 * (float) local24 + local313 + this.aFloat236 * (float) local34;
					local497 = arg4.anInt10189 + (int) (local484 * (float) this.aClass31_Sub3_10.anInt10237 / local133);
					local514 = this.aFloat233 + this.aFloat234 * (float) local19 + local307 + this.aFloat238 * (float) local34;
					local527 = arg4.anInt10187 + (int) (local514 * (float) this.aClass31_Sub3_10.anInt10240 / local158);
					local544 = this.aFloat231 + this.aFloat235 * (float) local19 + local313 + this.aFloat236 * (float) local34;
					local557 = arg4.anInt10189 + (int) (local544 * (float) this.aClass31_Sub3_10.anInt10237 / local158);
				} else {
					local334 = this.aFloat233 + this.aFloat234 * (float) local19 + local307 + this.aFloat238 * (float) local29;
					local347 = arg4.anInt10187 + (int) (local334 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local364 = this.aFloat231 + this.aFloat235 * (float) local19 + local313 + this.aFloat236 * (float) local29;
					local377 = arg4.anInt10189 + (int) (local364 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local394 = this.aFloat233 + this.aFloat234 * (float) local24 + local307 + this.aFloat238 * (float) local29;
					local407 = arg4.anInt10187 + (int) (local394 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local424 = this.aFloat231 + this.aFloat235 * (float) local24 + local313 + this.aFloat236 * (float) local29;
					local437 = arg4.anInt10189 + (int) (local424 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local454 = this.aFloat233 + this.aFloat234 * (float) local24 + local307 + this.aFloat238 * (float) local34;
					local467 = arg4.anInt10187 + (int) (local454 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local484 = this.aFloat231 + this.aFloat235 * (float) local24 + local313 + this.aFloat236 * (float) local34;
					local497 = arg4.anInt10189 + (int) (local484 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
					local514 = this.aFloat233 + this.aFloat234 * (float) local19 + local307 + this.aFloat238 * (float) local34;
					local527 = arg4.anInt10187 + (int) (local514 * (float) this.aClass31_Sub3_10.anInt10240 / (float) this.anInt10013);
					local544 = this.aFloat231 + this.aFloat235 * (float) local19 + local313 + this.aFloat236 * (float) local34;
					local557 = arg4.anInt10189 + (int) (local544 * (float) this.aClass31_Sub3_10.anInt10237 / (float) this.anInt10013);
				}
			}
			@Pc(1825) boolean local1825 = local6.aShort103 != -1 && this.method7874(this.aClass31_Sub3_10.anInterface4_14.method7229(local6.aShort103).aByte62);
			if (this.anInt10013 == -1) {
				local831 = local38 + local40 + local42;
				if ((local467 - local527) * (local437 - local557) - (local497 - local557) * (local407 - local527) > 0) {
					arg4.aBoolean714 = local467 < 0 || local527 < 0 || local407 < 0 || local467 > arg4.anInt10190 || local527 > arg4.anInt10190 || local407 > arg4.anInt10190;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt10191 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort103 >= 0) {
								arg4.method7978(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt5991, local40, local42, local38, local6.anInt8072, local6.anInt8071, local6.anInt8074, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, (int) local133, (int) local158, (int) local108, local6.aShort103);
							} else {
								arg4.method7994(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, Static62.method1512(local40 << 24 | arg3.anInt5991, local6.anInt8072), Static62.method1512(local42 << 24 | arg3.anInt5991, local6.anInt8071), Static62.method1512(local38 << 24 | arg3.anInt5991, local6.anInt8074));
							}
						} else if (local6.aShort103 >= 0) {
							arg4.method7989(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt8072, local6.anInt8071, local6.anInt8074, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, (int) local133, (int) local158, (int) local108, local6.aShort103);
						} else {
							arg4.method7994(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt8072, local6.anInt8071, local6.anInt8074);
						}
						arg4.anInt10191 = 0;
					} else {
						arg4.method7975(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt5991);
					}
				}
				local831 = local36 + local38 + local42;
				if ((local347 - local407) * (local557 - local437) - (local377 - local437) * (local527 - local407) > 0) {
					arg4.aBoolean714 = local347 < 0 || local407 < 0 || local527 < 0 || local347 > arg4.anInt10190 || local407 > arg4.anInt10190 || local527 > arg4.anInt10190;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt10191 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort103 >= 0) {
								arg4.method7978(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt5991, local36, local38, local42, local6.anInt8073, local6.anInt8074, local6.anInt8071, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, (int) local83, (int) local108, (int) local158, local6.aShort103);
							} else {
								arg4.method7994(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, Static62.method1512(local36 << 24 | arg3.anInt5991, local6.anInt8073), Static62.method1512(local38 << 24 | arg3.anInt5991, local6.anInt8074), Static62.method1512(local42 << 24 | arg3.anInt5991, local6.anInt8071));
							}
						} else if (local6.aShort103 >= 0) {
							arg4.method7989(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt8073, local6.anInt8074, local6.anInt8071, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, (int) local83, (int) local108, (int) local158, local6.aShort103);
						} else {
							arg4.method7994(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt8073, local6.anInt8074, local6.anInt8071);
						}
						arg4.anInt10191 = 0;
						return;
					}
					arg4.method7975(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt5991);
					return;
				}
			} else {
				local831 = local38 + local40 + local42;
				if ((local467 - local527) * (local437 - local557) - (local497 - local557) * (local407 - local527) > 0) {
					arg4.aBoolean714 = local467 < 0 || local527 < 0 || local407 < 0 || local467 > arg4.anInt10190 || local527 > arg4.anInt10190 || local407 > arg4.anInt10190;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt10191 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort103 >= 0) {
								arg4.method7978(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt5991, local40, local42, local38, local6.anInt8072, local6.anInt8071, local6.anInt8074, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, this.anInt10013, this.anInt10013, this.anInt10013, local6.aShort103);
							} else {
								arg4.method7994(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, Static62.method1512(local40 << 24 | arg3.anInt5991, local6.anInt8072), Static62.method1512(local42 << 24 | arg3.anInt5991, local6.anInt8071), Static62.method1512(local38 << 24 | arg3.anInt5991, local6.anInt8074));
							}
						} else if (local6.aShort103 >= 0) {
							arg4.method7989(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt8072, local6.anInt8071, local6.anInt8074, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, this.anInt10013, this.anInt10013, this.anInt10013, local6.aShort103);
						} else {
							arg4.method7994(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt8072, local6.anInt8071, local6.anInt8074);
						}
						arg4.anInt10191 = 0;
					} else {
						arg4.method7975(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt5991);
					}
				}
				local831 = local36 + local38 + local42;
				if ((local347 - local407) * (local557 - local437) - (local377 - local437) * (local527 - local407) > 0) {
					arg4.aBoolean714 = local347 < 0 || local407 < 0 || local527 < 0 || local347 > arg4.anInt10190 || local407 > arg4.anInt10190 || local527 > arg4.anInt10190;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt10191 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort103 >= 0) {
								arg4.method7978(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt5991, local36, local38, local42, local6.anInt8073, local6.anInt8074, local6.anInt8071, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, this.anInt10013, this.anInt10013, this.anInt10013, local6.aShort103);
							} else {
								arg4.method7994(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, Static62.method1512(local36 << 24 | arg3.anInt5991, local6.anInt8073), Static62.method1512(local38 << 24 | arg3.anInt5991, local6.anInt8074), Static62.method1512(local42 << 24 | arg3.anInt5991, local6.anInt8071));
							}
						} else if (local6.aShort103 >= 0) {
							arg4.method7989(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt8073, local6.anInt8074, local6.anInt8071, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, this.anInt10013, this.anInt10013, this.anInt10013, local6.aShort103);
						} else {
							arg4.method7994(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt8073, local6.anInt8074, local6.anInt8071);
						}
						arg4.anInt10191 = 0;
						return;
					}
					arg4.method7975(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt5991);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class42_Sub2 local3 = this.aClass31_Sub3_10.aClass42_Sub2_3;
		this.anInt10013 = arg5;
		this.aFloat234 = local3.aFloat144;
		this.aFloat232 = local3.aFloat141;
		this.aFloat238 = local3.aFloat137;
		this.aFloat233 = local3.aFloat135;
		this.aFloat235 = local3.aFloat136;
		this.aFloat230 = local3.aFloat138;
		this.aFloat236 = local3.aFloat139;
		this.aFloat231 = local3.aFloat134;
		this.aFloat237 = local3.aFloat140;
		this.aFloat240 = local3.aFloat145;
		this.aFloat239 = local3.aFloat142;
		this.aFloat241 = local3.aFloat143;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt10004 && local78 >= 0 && local78 < super.anInt10007) {
						this.method7868(local72, local78);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII[[ZLclient!mf;Lclient!wi;[I[I)V")
	private void method7872(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class202 arg5, @OriginalArg(9) Class359 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean423;
		this.aClass31_Sub3_10.ZA(false);
		arg6.aBoolean715 = false;
		arg6.aBoolean713 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(78) int local78;
					if (this.aClass285ArrayArray1[local32][local35] != null) {
						@Pc(60) Class285 local60 = this.aClass285ArrayArray1[local32][local35];
						if (local60.aShort103 != -1 && (local60.aByte116 & 0x2) == 0 && local60.anInt8070 == 0) {
							local78 = this.aClass31_Sub3_10.method8105(local60.aShort103);
							arg6.method7982(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, Static39.method1074(local60.anInt8072, local78), Static39.method1074(local60.anInt8071, local78), Static39.method1074(local60.anInt8074, local78));
							arg6.method7982(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, Static39.method1074(local60.anInt8073, local78), Static39.method1074(local60.anInt8074, local78), Static39.method1074(local60.anInt8071, local78));
						} else if (local60.anInt8070 == 0) {
							arg6.method7994(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, local60.anInt8072, local60.anInt8071, local60.anInt8074);
							arg6.method7994(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, local60.anInt8073, local60.anInt8074, local60.anInt8071);
						} else {
							local78 = local60.anInt8070;
							arg6.method7994(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, Static62.method1512(local60.anInt8072 & 0xFF000000, local78), Static62.method1512(local60.anInt8071 & 0xFF000000, local78), Static62.method1512(local60.anInt8074 & 0xFF000000, local78));
							arg6.method7994(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, Static62.method1512(local60.anInt8073 & 0xFF000000, local78), Static62.method1512(local60.anInt8074 & 0xFF000000, local78), Static62.method1512(local60.anInt8071 & 0xFF000000, local78));
						}
					} else if (this.aClass254ArrayArray1[local32][local35] != null) {
						@Pc(287) Class254 local287 = this.aClass254ArrayArray1[local32][local35];
						for (local78 = 0; local78 < local287.aShort95; local78++) {
							arg7[local78] = local26 + local287.aShortArray107[local78] * 4 / super.anInt10009;
							arg8[local78] = local30 - local287.aShortArray106[local78] * 4 / super.anInt10009;
						}
						for (@Pc(325) int local325 = 0; local325 < local287.aShort96; local325++) {
							@Pc(330) int local330 = local325 * 3;
							@Pc(334) int local334 = local330 + 1;
							@Pc(338) int local338 = local334 + 1;
							@Pc(342) int local342 = arg7[local330];
							@Pc(346) int local346 = arg7[local334];
							@Pc(350) int local350 = arg7[local338];
							@Pc(354) int local354 = arg8[local330];
							@Pc(358) int local358 = arg8[local334];
							@Pc(362) int local362 = arg8[local338];
							@Pc(387) int local387;
							if (local287.anIntArray418 != null && local287.anIntArray418[local325] != 0 && (local287.aShortArray108 == null || local287.aShortArray108 != null && local287.aShortArray108[local325] == -1)) {
								local387 = local287.anIntArray418[local325];
								arg6.method7994(local354, local358, local362, local342, local346, local350, 100, 100, 100, Static62.method1512(-(local287.anIntArray417[local330] & -16777216) - 16777216, local387), Static62.method1512(-(local287.anIntArray417[local334] & -16777216) - 16777216, local387), Static62.method1512(-(local287.anIntArray417[local338] & -16777216) - 16777216, local387));
							} else if (local287.aShortArray108 == null || local287.aShortArray108[local325] == -1) {
								arg6.method7994(local354, local358, local362, local342, local346, local350, 100, 100, 100, local287.anIntArray417[local330], local287.anIntArray417[local334], local287.anIntArray417[local338]);
							} else {
								local387 = this.aClass31_Sub3_10.method8105(local287.aShortArray108[local325]);
								arg6.method7982(local354, local358, local362, local342, local346, local350, 100, 100, 100, local387, local387, local387);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean715 = true;
		this.aClass31_Sub3_10.ZA(local14);
	}

	@OriginalMember(owner = "client!wc", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		this.aByteArrayArray52 = null;
		this.aByteArrayArray51 = null;
	}

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!cp;[I)V")
	@Override
	public void method7866(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	@Override
	public void method7868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class202 local4 = this.aClass31_Sub3_10.method8107(Thread.currentThread());
		local4.aClass359_2.anInt10191 = 0;
		if (this.aClass285ArrayArray1 != null) {
			this.method7871(arg0, arg1, local4.aBoolean422, local4, local4.aClass359_2, local4.anIntArray338, local4.anIntArray325, local4.anIntArray334, local4.anIntArray335);
		} else if (this.aClass72ArrayArray1 != null) {
			this.method7870(arg0, arg1, local4.aClass359_2, local4.anIntArray338, local4.anIntArray325, local4.anIntArray334, local4.anIntArray335);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray51[arg0][arg1] < arg2) {
			this.aByteArrayArray51[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass72ArrayArray1 == null) {
			this.aClass72ArrayArray1 = new Class72[super.anInt10004][super.anInt10007];
			this.aClass109ArrayArray1 = new Class109[super.anInt10004][super.anInt10007];
		} else if (this.aClass285ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg6[local57]];
				local70 = arg4[arg6[local57]];
				if (local64 != 0 && local64 != super.anInt10009 || local70 != 0 && local70 != super.anInt10009) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class109 local95 = new Class109();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort41 = local99;
			local95.aShortArray58 = new short[local99];
			local95.aShortArray61 = new short[local99];
			local95.aShortArray57 = new short[local99];
			local95.aShortArray56 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt10009) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1]);
				} else if (local129 == super.anInt10009 && local133 == super.anInt10009) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt10009 && local133 == 0) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]) * (super.anInt10009 - local129) + (this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1]) * (super.anInt10009 - local129) + (this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray58[local124] = (short) (local288 * (super.anInt10009 - local133) + local335 * local133 >> super.anInt10008 * 2);
				}
				local288 = (arg0 << super.anInt10008) + local129;
				local335 = (arg1 << super.anInt10008) + local133;
				local95.aShortArray61[local124] = (short) local129;
				local95.aShortArray56[local124] = (short) local133;
				local95.aShortArray57[local124] = (short) (this.method7860(local335, local288) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray58[local124] < 2) {
					local95.aShortArray58[local124] = 2;
				}
			}
			@Pc(416) boolean local416 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass31_Sub3_10.anInterface4_14.method7229(arg11[local288]).aBoolean349) {
					local416 = true;
				}
			}
			local95.anIntArray136 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray137 = new int[local133];
			}
			local95.aShortArray59 = new short[local133];
			local95.aShortArray55 = new short[local133];
			local95.aShortArray54 = new short[local133];
			if (local416) {
				local95.aShortArray62 = new short[local133];
				local95.aShortArray60 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray136[local95.aShort40] = Static386.method5380(arg9[local335]);
					} else {
						local95.anIntArray136[local95.aShort40] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray137[local95.aShort40] = -1;
						} else {
							local95.anIntArray137[local95.aShort40] = Static386.method5380(arg10[local335]);
						}
					}
					local95.aShortArray59[local95.aShort40] = (short) arg6[local335];
					local95.aShortArray55[local95.aShort40] = (short) arg7[local335];
					local95.aShortArray54[local95.aShort40] = (short) arg8[local335];
					if (local416) {
						if (arg11[local335] == -1 || this.aClass31_Sub3_10.anInterface4_14.method7229(arg11[local335]).aBoolean349) {
							local95.aShortArray62[local95.aShort40] = -1;
						} else {
							local95.aShortArray62[local95.aShort40] = (short) arg11[local335];
							local95.aShortArray60[local95.aShort40] = (short) arg12[local335];
						}
					}
					local95.aShort40++;
				}
			}
			this.aClass109ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(645) Class72 local645 = new Class72();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local645.anInt2499 = Static39.method1074(this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1], Static386.method5380(arg10[0]));
				if (local64 == -1) {
					local645.aByte25 = (byte) (local645.aByte25 | 0x2);
				}
			}
			if (super.anIntArrayArray102[arg0][arg1] == super.anIntArrayArray102[arg0 + 1][arg1] && super.anIntArrayArray102[arg0][arg1] == super.anIntArrayArray102[arg0 + 1][arg1 + 1] && super.anIntArrayArray102[arg0][arg1] == super.anIntArrayArray102[arg0][arg1 + 1]) {
				local645.aByte25 = (byte) (local645.aByte25 | 0x1);
			}
			if (local70 == -1 || (local645.aByte25 & 0x2) != 0 || this.aClass31_Sub3_10.anInterface4_14.method7229(local70).aBoolean349) {
				@Pc(846) short local846 = Static386.method5380(local64);
				local645.aShort32 = (short) Static39.method1074(this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1], local846);
				local645.aShort34 = (short) Static39.method1074(this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1], local846);
				local645.aShort31 = (short) Static39.method1074(this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1], local846);
				local645.aShort33 = (short) Static39.method1074(this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1], local846);
				local645.aShort35 = -1;
			} else {
				local645.aShort32 = (short) (this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]);
				local645.aShort34 = (short) (this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1]);
				local645.aShort31 = (short) (this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1]);
				local645.aShort33 = (short) (this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1]);
				local645.aShort35 = (short) local70;
			}
			this.aClass72ArrayArray1[arg0][arg1] = local645;
		}
	}

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass285ArrayArray1 == null) {
			this.aClass285ArrayArray1 = new Class285[super.anInt10004][super.anInt10007];
			this.aClass254ArrayArray1 = new Class254[super.anInt10004][super.anInt10007];
		} else if (this.aClass72ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static133.anIntArray113[Static386.method5380(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static133.anIntArray113[Static386.method5380(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg6[local104] != arg6[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == super.anInt10009 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt10009 && arg4[local116] == super.anInt10009) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt10009) {
					if (local110 != -1 && arg6[local110] != arg6[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt10009 && arg2[local244] != arg2[0] - super.anInt10009) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt10009 && arg4[local244] != arg4[0] - super.anInt10009) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(527) int local527;
		if (local102) {
			@Pc(334) Class285 local334 = new Class285();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt8070 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte116 = (byte) (local334.aByte116 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (super.anIntArrayArray102[arg0][arg1] == super.anIntArrayArray102[arg0 + 1][arg1] && super.anIntArrayArray102[arg0][arg1] == super.anIntArrayArray102[arg0 + 1][arg1 + 1] && super.anIntArrayArray102[arg0][arg1] == super.anIntArrayArray102[arg0][arg1 + 1]) {
				local334.aByte116 = (byte) (local334.aByte116 | 0x1);
			}
			if (local342 == -1 || (local334.aByte116 & 0x2) != 0 || this.aClass31_Sub3_10.anInterface4_14.method7229(local342).aBoolean349) {
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local104] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt8073 = Static346.method5021(arg10, Static605.method7875(arg6[local104] >> 8, this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]), local527);
				if (local334.anInt8070 != 0) {
					local334.anInt8073 |= this.aByteArrayArray51[arg0][arg1] + 255 - this.aByteArrayArray52[arg0][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local106] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt8074 = Static346.method5021(arg10, Static605.method7875(arg6[local106] >> 8, this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1]), local527);
				if (local334.anInt8070 != 0) {
					local334.anInt8074 |= this.aByteArrayArray51[arg0 + 1][arg1] + 255 - this.aByteArrayArray52[arg0 + 1][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local108] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt8072 = Static346.method5021(arg10, Static605.method7875(arg6[local108] >> 8, this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1]), local527);
				if (local334.anInt8070 != 0) {
					local334.anInt8072 |= this.aByteArrayArray51[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray52[arg0 + 1][arg1 + 1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local110] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt8071 = Static346.method5021(arg10, Static605.method7875(arg6[local110] >> 8, this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1]), local527);
				if (local334.anInt8070 != 0) {
					local334.anInt8071 |= this.aByteArrayArray51[arg0][arg1 + 1] + 255 - this.aByteArrayArray52[arg0][arg1 + 1] << 25;
				}
				local334.aShort103 = -1;
			} else {
				local334.anInt8073 = this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1];
				local334.anInt8074 = this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1];
				local334.anInt8072 = this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1];
				local334.anInt8071 = this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1];
				local334.aShort103 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort104 = (short) arg5[local108];
				local334.aShort100 = (short) arg5[local110];
				local334.aShort102 = (short) arg5[local106];
				local334.aShort101 = (short) arg5[local104];
			}
			this.aClass285ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class254 local888 = new Class254();
		local888.aShort95 = (short) arg2.length;
		local888.aShort96 = (short) (arg2.length / 3);
		local888.aShortArray107 = new short[local888.aShort95];
		local888.aShortArray110 = new short[local888.aShort95];
		local888.aShortArray106 = new short[local888.aShort95];
		local888.anIntArray417 = new int[local888.aShort95];
		if (arg5 != null) {
			local888.aShortArray109 = new short[local888.aShort95];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1227) int local1227;
		for (local244 = 0; local244 < local888.aShort95; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt10009) {
				local958 = this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1];
			} else if (local342 == super.anInt10009 && local527 == super.anInt10009) {
				local958 = this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt10009 && local527 == 0) {
				local958 = this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]) * (super.anInt10009 - local342) + (this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1]) * (super.anInt10009 - local342) + (this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt10009 - local527) + local1126 * local527 >> super.anInt10008 * 2;
			}
			local1079 = (arg0 << super.anInt10008) + local342;
			local1126 = (arg1 << super.anInt10008) + local527;
			local888.aShortArray107[local244] = (short) local342;
			local888.aShortArray106[local244] = (short) local527;
			local888.aShortArray110[local244] = (short) (this.method7860(local1126, local1079) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass31_Sub3_10.anInterface4_14.method7229(arg8[local244]).aBoolean349) {
				local888.anIntArray417[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1227 = 0;
				if (arg5 != null) {
					@Pc(1239) short local1239 = local888.aShortArray109[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1227 = local1239 * 255 / arg11;
						if (local1227 < 0) {
							local1227 = 0;
						} else if (local1227 > 255) {
							local1227 = 255;
						}
					}
				}
				local888.anIntArray417[local244] = Static346.method5021(arg10, Static605.method7875(arg6[local244] >> 8, local958), local1227);
				if (arg7 != null) {
					local888.anIntArray417[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray417[local244] = 0;
			} else {
				local888.anIntArray417[local244] = local958 << 25;
			}
		}
		@Pc(1297) boolean local1297 = false;
		for (local527 = 0; local527 < local888.aShort96; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass31_Sub3_10.anInterface4_14.method7229(arg8[local527 * 3]).aBoolean349) {
				local1297 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray418 = new int[local888.aShort96];
		}
		if (local1297) {
			local888.aShortArray108 = new short[local888.aShort96];
			local888.aShortArray105 = new short[local888.aShort96];
		}
		for (local958 = 0; local958 < local888.aShort96; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray418[local958] = arg7[local1079] >> 8;
			}
			if (local1297) {
				local1126 = local1079 + 1;
				local1227 = local1126 + 1;
				@Pc(1379) boolean local1379 = false;
				@Pc(1381) boolean local1381 = true;
				@Pc(1385) int local1385 = arg8[local1079];
				if (local1385 == -1 || this.aClass31_Sub3_10.anInterface4_14.method7229(local1385).aBoolean349) {
					local1381 = false;
				} else {
					local1379 = true;
				}
				local1385 = arg8[local1126];
				if (local1385 == -1 || this.aClass31_Sub3_10.anInterface4_14.method7229(local1385).aBoolean349) {
					local1381 = false;
				} else {
					local1379 = true;
				}
				local1385 = arg8[local1227];
				if (local1385 == -1 || this.aClass31_Sub3_10.anInterface4_14.method7229(local1385).aBoolean349) {
					local1381 = false;
				} else {
					local1379 = true;
				}
				if (local1381) {
					local888.aShortArray108[local958] = (short) local1385;
					local888.aShortArray105[local958] = (short) arg9[local1079];
				} else {
					if (local1379) {
						local1385 = arg8[local1079];
						if (local1385 != -1 && !this.aClass31_Sub3_10.anInterface4_14.method7229(local1385).aBoolean349) {
							local888.anIntArray417[local1079] = Static133.anIntArray113[Static386.method5380(this.aClass31_Sub3_10.anInterface4_14.method7229(local1385).aShort66 & 0xFFFF) & 0xFFFF];
						}
						local1385 = arg8[local1126];
						if (local1385 != -1 && !this.aClass31_Sub3_10.anInterface4_14.method7229(local1385).aBoolean349) {
							local888.anIntArray417[local1126] = Static133.anIntArray113[Static386.method5380(this.aClass31_Sub3_10.anInterface4_14.method7229(local1385).aShort66 & 0xFFFF) & 0xFFFF];
						}
						local1385 = arg8[local1227];
						if (local1385 != -1 && !this.aClass31_Sub3_10.anInterface4_14.method7229(local1385).aBoolean349) {
							local888.anIntArray417[local1227] = Static133.anIntArray113[Static386.method5380(this.aClass31_Sub3_10.anInterface4_14.method7229(local1385).aShort66 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray108[local958] = -1;
				}
			}
		}
		this.aClass254ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub7_Sub3 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub3 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIIII[[ZLclient!mf;Lclient!wi;[I[I)V")
	private void method7873(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class202 arg5, @OriginalArg(9) Class359 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean423;
		this.aClass31_Sub3_10.ZA(false);
		arg6.aBoolean715 = false;
		arg6.aBoolean713 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(79) int local79;
					if (this.aClass72ArrayArray1[local32][local35] != null) {
						@Pc(60) Class72 local60 = this.aClass72ArrayArray1[local32][local35];
						if (local60.aShort35 != -1 && (local60.aByte25 & 0x2) == 0 && local60.anInt2499 == -1) {
							local79 = this.aClass31_Sub3_10.method8105(local60.aShort35);
							arg6.method7982(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, Static39.method1074(local60.aShort31 & 0xFFFF, local79), Static39.method1074(local60.aShort33 & 0xFFFF, local79), Static39.method1074(local60.aShort34 & 0xFFFF, local79));
							arg6.method7982(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, Static39.method1074(local60.aShort32 & 0xFFFF, local79), Static39.method1074(local60.aShort34 & 0xFFFF, local79), Static39.method1074(local60.aShort33 & 0xFFFF, local79));
						} else if (local60.anInt2499 == -1) {
							arg6.method7982(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, local60.aShort31 & 0xFFFF, local60.aShort33 & 0xFFFF, local60.aShort34 & 0xFFFF);
							arg6.method7982(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, local60.aShort32 & 0xFFFF, local60.aShort34 & 0xFFFF, local60.aShort33 & 0xFFFF);
						} else {
							local79 = local60.anInt2499;
							arg6.method7982(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, local79, local79, local79);
							arg6.method7982(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, local79, local79, local79);
						}
					} else if (this.aClass109ArrayArray1[local32][local35] != null) {
						@Pc(277) Class109 local277 = this.aClass109ArrayArray1[local32][local35];
						for (local79 = 0; local79 < local277.aShort41; local79++) {
							arg7[local79] = local26 + local277.aShortArray61[local79] * 4 / super.anInt10009;
							arg8[local79] = local30 - local277.aShortArray56[local79] * 4 / super.anInt10009;
						}
						for (@Pc(315) int local315 = 0; local315 < local277.aShort40; local315++) {
							@Pc(321) short local321 = local277.aShortArray59[local315];
							@Pc(326) short local326 = local277.aShortArray55[local315];
							@Pc(331) short local331 = local277.aShortArray54[local315];
							@Pc(335) int local335 = arg7[local321];
							@Pc(339) int local339 = arg7[local326];
							@Pc(343) int local343 = arg7[local331];
							@Pc(347) int local347 = arg8[local321];
							@Pc(351) int local351 = arg8[local326];
							@Pc(355) int local355 = arg8[local331];
							@Pc(369) int local369;
							if (local277.anIntArray137 != null && local277.anIntArray137[local315] != -1) {
								local369 = local277.anIntArray137[local315];
								arg6.method7982(local347, local351, local355, local335, local339, local343, 100, 100, 100, Static39.method1074(local277.aShortArray58[local321], local369), Static39.method1074(local277.aShortArray58[local326], local369), Static39.method1074(local277.aShortArray58[local331], local369));
							} else if (local277.aShortArray62 == null || local277.aShortArray62[local315] == -1) {
								local369 = local277.anIntArray136[local315];
								arg6.method7982(local347, local351, local355, local335, local339, local343, 100, 100, 100, Static39.method1074(local277.aShortArray58[local321], local369), Static39.method1074(local277.aShortArray58[local326], local369), Static39.method1074(local277.aShortArray58[local331], local369));
							} else {
								local369 = this.aClass31_Sub3_10.method8105(local277.aShortArray62[local315]);
								arg6.method7982(local347, local351, local355, local335, local339, local343, 100, 100, 100, Static39.method1074(local277.aShortArray58[local321], local369), Static39.method1074(local277.aShortArray58[local326], local369), Static39.method1074(local277.aShortArray58[local331], local369));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean715 = true;
		this.aClass31_Sub3_10.ZA(local14);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class42_Sub2 local3 = this.aClass31_Sub3_10.aClass42_Sub2_3;
		this.anInt10013 = -1;
		this.aFloat234 = local3.aFloat144;
		this.aFloat232 = local3.aFloat141;
		this.aFloat238 = local3.aFloat137;
		this.aFloat233 = local3.aFloat135;
		this.aFloat235 = local3.aFloat136;
		this.aFloat230 = local3.aFloat138;
		this.aFloat236 = local3.aFloat139;
		this.aFloat231 = local3.aFloat134;
		this.aFloat237 = local3.aFloat140;
		this.aFloat240 = local3.aFloat145;
		this.aFloat239 = local3.aFloat142;
		this.aFloat241 = local3.aFloat143;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt10004 && local78 >= 0 && local78 < super.anInt10007) {
						this.method7868(local72, local78);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7865(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class202 local4 = this.aClass31_Sub3_10.method8107(Thread.currentThread());
		@Pc(7) Class359 local7 = local4.aClass359_2;
		local7.anInt10191 = 0;
		local7.aBoolean714 = false;
		this.aClass31_Sub3_10.ya();
		if (this.aClass285ArrayArray1 != null) {
			this.method7872(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray338, local4.anIntArray325);
		} else if (this.aClass72ArrayArray1 != null) {
			this.method7873(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray338, local4.anIntArray325);
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)Z")
	private boolean method7874(@OriginalArg(0) int arg0) {
		if ((this.anInt10012 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}
}
