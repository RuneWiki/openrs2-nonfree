import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class115_Sub3 extends Class115 {

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "F")
	private float aFloat206;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "[[Lclient!jr;")
	private Class169[][] aClass169ArrayArray1;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "F")
	private float aFloat207;

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "F")
	private float aFloat208;

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "F")
	private float aFloat209;

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "F")
	private float aFloat210;

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "F")
	private float aFloat211;

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "[[Lclient!iu;")
	private Class157[][] aClass157ArrayArray1;

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "F")
	private float aFloat212;

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "F")
	private float aFloat213;

	@OriginalMember(owner = "client!wa", name = "C", descriptor = "F")
	private float aFloat214;

	@OriginalMember(owner = "client!wa", name = "E", descriptor = "F")
	private float aFloat215;

	@OriginalMember(owner = "client!wa", name = "F", descriptor = "[[Lclient!nba;")
	private Class229[][] aClass229ArrayArray1;

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "F")
	private float aFloat216;

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "F")
	private float aFloat217;

	@OriginalMember(owner = "client!wa", name = "I", descriptor = "[[Lclient!ft;")
	private Class113[][] aClass113ArrayArray1;

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
	private int anInt10336 = -1;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "Lclient!ve;")
	private final Class7_Sub3 aClass7_Sub3_11;

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
	private final int anInt10335;

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "[[B")
	private byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!wa", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!ve;IIII[[I[[II)V")
	public Class115_Sub3(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass7_Sub3_11 = arg0;
		this.anInt10335 = arg2;
		this.aByteArrayArray30 = new byte[arg3 + 1][arg4 + 1];
		@Pc(29) int local29 = this.aClass7_Sub3_11.anInt10092 >> 9;
		for (@Pc(31) int local31 = 1; local31 < arg4; local31++) {
			for (@Pc(34) int local34 = 1; local34 < arg3; local34++) {
				@Pc(53) int local53 = arg6[local34 + 1][local31] - arg6[local34 - 1][local31];
				@Pc(69) int local69 = arg6[local34][local31 + 1] - arg6[local34][local31 - 1];
				@Pc(84) int local84 = (int) Math.sqrt((double) (local53 * local53 + arg7 * 512 + local69 * local69));
				@Pc(90) int local90 = (local53 << 8) / local84;
				@Pc(96) int local96 = arg7 * -512 / local84;
				@Pc(102) int local102 = (local69 << 8) / local84;
				@Pc(124) int local124 = local29 + (this.aClass7_Sub3_11.anInt10106 * local90 + this.aClass7_Sub3_11.anInt10093 * local96 + this.aClass7_Sub3_11.anInt10112 * local102 >> 17);
				local124 >>= 0x1;
				if (local124 < 2) {
					local124 = 2;
				} else if (local124 > 126) {
					local124 = 126;
				}
				this.aByteArrayArray30[local34][local31] = (byte) local124;
			}
		}
		this.aByteArrayArray31 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILclient!oga;[I[I[I[I)V")
	private void method8065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class169 local6 = this.aClass169ArrayArray1[arg0][arg1];
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
			@Pc(2080) Class229 local2080 = this.aClass229ArrayArray1[arg0][arg1];
			if (local2080 != null) {
				@Pc(2104) short local2104;
				@Pc(2164) float local2164;
				@Pc(2185) float local2185;
				@Pc(2135) float local2135;
				if (this.anInt10336 == -1) {
					for (local450 = 0; local450 < local2080.aShort85; local450++) {
						local24 = local2080.aShortArray77[local450] + (arg0 << super.anInt10331);
						local2104 = local2080.aShortArray78[local450];
						local34 = local2080.aShortArray74[local450] + (arg1 << super.anInt10331);
						local2135 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local2104 + this.aFloat217 * (float) local34;
						if (local2135 <= (float) this.aClass7_Sub3_11.anInt10096) {
							return;
						}
						local2164 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local2104 + this.aFloat209 * (float) local34;
						local2185 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local2104 + this.aFloat216 * (float) local34;
						arg3[local450] = arg2.anInt7440 + (int) (local2164 * (float) this.aClass7_Sub3_11.anInt10105 / local2135);
						arg4[local450] = arg2.anInt7442 + (int) (local2185 * (float) this.aClass7_Sub3_11.anInt10094 / local2135);
						arg5[local450] = (int) local2135;
					}
				} else {
					for (local450 = 0; local450 < local2080.aShort85; local450++) {
						local24 = local2080.aShortArray77[local450] + (arg0 << super.anInt10331);
						local2104 = local2080.aShortArray78[local450];
						local34 = local2080.aShortArray74[local450] + (arg1 << super.anInt10331);
						local2135 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local2104 + this.aFloat217 * (float) local34;
						local2164 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local2104 + this.aFloat209 * (float) local34;
						local2185 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local2104 + this.aFloat216 * (float) local34;
						arg3[local450] = arg2.anInt7440 + (int) (local2164 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
						arg4[local450] = arg2.anInt7442 + (int) (local2185 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
						arg5[local450] = (int) local2135;
					}
				}
				@Pc(2404) int local2404;
				@Pc(2409) int local2409;
				if (local2080.aShortArray79 != null) {
					local450 = super.anIntArrayArray61[arg0][arg1];
					local300 = super.anIntArrayArray61[arg0 + 1][arg1];
					local360 = super.anIntArrayArray61[arg0][arg1 + 1];
					local420 = arg0 * super.anInt10333;
					local480 = local420 + super.anInt10333;
					local2404 = arg1 * super.anInt10333;
					local2409 = local2404 + super.anInt10333;
					local377 = this.aFloat206 + this.aFloat207 * (float) local420 + this.aFloat211 * (float) local450 + this.aFloat209 * (float) local2404;
					local437 = this.aFloat208 + this.aFloat215 * (float) local420 + this.aFloat213 * (float) local450 + this.aFloat216 * (float) local2404;
					local287 = this.aFloat212 + this.aFloat210 * (float) local420 + this.aFloat214 * (float) local450 + this.aFloat217 * (float) local2404;
					local347 = this.aFloat206 + this.aFloat207 * (float) local480 + this.aFloat211 * (float) local300 + this.aFloat209 * (float) local2404;
					local407 = this.aFloat208 + this.aFloat215 * (float) local480 + this.aFloat213 * (float) local300 + this.aFloat216 * (float) local2404;
					local467 = this.aFloat212 + this.aFloat210 * (float) local480 + this.aFloat214 * (float) local300 + this.aFloat217 * (float) local2404;
					local73 = this.aFloat206 + this.aFloat207 * (float) local420 + this.aFloat211 * (float) local360 + this.aFloat209 * (float) local2409;
					local98 = this.aFloat208 + this.aFloat215 * (float) local420 + this.aFloat213 * (float) local360 + this.aFloat216 * (float) local2409;
					local123 = this.aFloat212 + this.aFloat210 * (float) local420 + this.aFloat214 * (float) local360 + this.aFloat217 * (float) local2409;
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
					if (this.anInt10336 == -1) {
						for (local2604 = 0; local2604 < local2080.aShort86; local2604++) {
							local2610 = local2080.aShortArray76[local2604];
							local2615 = local2080.aShortArray72[local2604];
							local2620 = local2080.aShortArray73[local2604];
							local774 = arg3[local2610];
							local2628 = arg3[local2615];
							local2632 = arg3[local2620];
							local2636 = arg4[local2610];
							local2640 = arg4[local2615];
							local2644 = arg4[local2620];
							if ((local774 - local2628) * (local2644 - local2640) - (local2636 - local2640) * (local2632 - local2628) > 0) {
								arg2.aBoolean546 = local774 < 0 || local2628 < 0 || local2632 < 0 || local774 > arg2.anInt7444 || local2628 > arg2.anInt7444 || local2632 > arg2.anInt7444;
								local2688 = local2080.aShortArray79[local2604];
								if (local2688 == -1) {
									local2761 = local2080.anIntArray368[local2604];
									if (local2761 != -1) {
										arg2.method5859(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], Static484.method7066(local2761, local2080.aShortArray75[local2610]), Static484.method7066(local2761, local2080.aShortArray75[local2615]), Static484.method7066(local2761, local2080.aShortArray75[local2620]));
									}
								} else {
									if (this.method8069(this.aClass7_Sub3_11.anInterface7_12.method4460(local2688).aByte40)) {
										arg2.anInt7439 = 100;
									}
									arg2.method5857(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], local2080.aShortArray75[local2610], local2080.aShortArray75[local2615], local2080.aShortArray75[local2620], (int) local377, (int) local347, (int) local73, (int) local437, (int) local407, (int) local98, (int) local287, (int) local467, (int) local123, local2688);
									arg2.anInt7439 = 0;
								}
							}
						}
						return;
					}
					for (local2604 = 0; local2604 < local2080.aShort86; local2604++) {
						local2610 = local2080.aShortArray76[local2604];
						local2615 = local2080.aShortArray72[local2604];
						local2620 = local2080.aShortArray73[local2604];
						local774 = arg3[local2610];
						local2628 = arg3[local2615];
						local2632 = arg3[local2620];
						local2636 = arg4[local2610];
						local2640 = arg4[local2615];
						local2644 = arg4[local2620];
						if ((local774 - local2628) * (local2644 - local2640) - (local2636 - local2640) * (local2632 - local2628) > 0) {
							arg2.aBoolean546 = local774 < 0 || local2628 < 0 || local2632 < 0 || local774 > arg2.anInt7444 || local2628 > arg2.anInt7444 || local2632 > arg2.anInt7444;
							local2688 = local2080.aShortArray79[local2604];
							if (local2688 == -1) {
								local2761 = local2080.anIntArray368[local2604];
								if (local2761 != -1) {
									arg2.method5859(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], Static484.method7066(local2761, local2080.aShortArray75[local2610]), Static484.method7066(local2761, local2080.aShortArray75[local2615]), Static484.method7066(local2761, local2080.aShortArray75[local2620]));
								}
							} else {
								if (this.method8069(this.aClass7_Sub3_11.anInterface7_12.method4460(local2688).aByte40)) {
									arg2.anInt7439 = 100;
								}
								arg2.method5857(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], local2080.aShortArray75[local2610], local2080.aShortArray75[local2615], local2080.aShortArray75[local2620], (int) local377, (int) local347, (int) local73, (int) local437, (int) local407, (int) local98, this.anInt10336, this.anInt10336, this.anInt10336, local2688);
								arg2.anInt7439 = 0;
							}
						}
					}
					return;
				}
				for (local450 = 0; local450 < local2080.aShort86; local450++) {
					@Pc(3022) short local3022 = local2080.aShortArray76[local450];
					@Pc(3027) short local3027 = local2080.aShortArray72[local450];
					@Pc(3032) short local3032 = local2080.aShortArray73[local450];
					local480 = arg3[local3022];
					local2404 = arg3[local3027];
					local2409 = arg3[local3032];
					@Pc(3048) int local3048 = arg4[local3022];
					@Pc(3052) int local3052 = arg4[local3027];
					@Pc(3056) int local3056 = arg4[local3032];
					if ((local480 - local2404) * (local3056 - local3052) - (local3048 - local3052) * (local2409 - local2404) > 0) {
						@Pc(3077) int local3077 = local2080.anIntArray368[local450];
						if (local3077 != -1) {
							arg2.aBoolean546 = local480 < 0 || local2404 < 0 || local2409 < 0 || local480 > arg2.anInt7444 || local2404 > arg2.anInt7444 || local2409 > arg2.anInt7444;
							arg2.method5859(local3048, local3052, local3056, local480, local2404, local2409, arg5[local3022], arg5[local3027], arg5[local3032], Static484.method7066(local3077, local2080.aShortArray75[local3022]), Static484.method7066(local3077, local2080.aShortArray75[local3027]), Static484.method7066(local3077, local2080.aShortArray75[local3032]));
						}
					}
				}
			}
		} else if ((local6.aByte85 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt10333;
			local24 = local19 + super.anInt10333;
			@Pc(29) int local29 = arg1 * super.anInt10333;
			local34 = local29 + super.anInt10333;
			@Pc(270) int local270;
			@Pc(330) int local330;
			@Pc(390) int local390;
			@Pc(257) float local257;
			@Pc(317) float local317;
			@Pc(148) float local148;
			@Pc(46) int local46;
			if ((local6.aByte85 & 0x1) == 0) {
				local46 = super.anIntArrayArray61[arg0][arg1];
				@Pc(754) int local754 = super.anIntArrayArray61[arg0 + 1][arg1];
				@Pc(765) int local765 = super.anIntArrayArray61[arg0 + 1][arg1 + 1];
				local774 = super.anIntArrayArray61[arg0][arg1 + 1];
				if (this.anInt10336 == -1) {
					local73 = this.aFloat212 + this.aFloat210 * (float) local19 + this.aFloat214 * (float) local46 + this.aFloat217 * (float) local29;
					if (local73 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local98 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local754 + this.aFloat217 * (float) local29;
					if (local98 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local123 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local765 + this.aFloat217 * (float) local34;
					if (local123 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local148 = this.aFloat212 + this.aFloat210 * (float) local19 + this.aFloat214 * (float) local774 + this.aFloat217 * (float) local34;
					if (local148 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local257 = this.aFloat206 + this.aFloat207 * (float) local19 + this.aFloat211 * (float) local46 + this.aFloat209 * (float) local29;
					local270 = arg2.anInt7440 + (int) (local257 * (float) this.aClass7_Sub3_11.anInt10105 / local73);
					local287 = this.aFloat208 + this.aFloat215 * (float) local19 + this.aFloat213 * (float) local46 + this.aFloat216 * (float) local29;
					local300 = arg2.anInt7442 + (int) (local287 * (float) this.aClass7_Sub3_11.anInt10094 / local73);
					local317 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local754 + this.aFloat209 * (float) local29;
					local330 = arg2.anInt7440 + (int) (local317 * (float) this.aClass7_Sub3_11.anInt10105 / local98);
					local347 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local754 + this.aFloat216 * (float) local29;
					local360 = arg2.anInt7442 + (int) (local347 * (float) this.aClass7_Sub3_11.anInt10094 / local98);
					local377 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local765 + this.aFloat209 * (float) local34;
					local390 = arg2.anInt7440 + (int) (local377 * (float) this.aClass7_Sub3_11.anInt10105 / local123);
					local407 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local765 + this.aFloat216 * (float) local34;
					local420 = arg2.anInt7442 + (int) (local407 * (float) this.aClass7_Sub3_11.anInt10094 / local123);
					local437 = this.aFloat206 + this.aFloat207 * (float) local19 + this.aFloat211 * (float) local774 + this.aFloat209 * (float) local34;
					local450 = arg2.anInt7440 + (int) (local437 * (float) this.aClass7_Sub3_11.anInt10105 / local148);
					local467 = this.aFloat208 + this.aFloat215 * (float) local19 + this.aFloat213 * (float) local774 + this.aFloat216 * (float) local34;
					local480 = arg2.anInt7442 + (int) (local467 * (float) this.aClass7_Sub3_11.anInt10094 / local148);
				} else {
					local73 = this.aFloat212 + this.aFloat210 * (float) local19 + this.aFloat214 * (float) local46 + this.aFloat217 * (float) local29;
					local98 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local754 + this.aFloat217 * (float) local29;
					local123 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local765 + this.aFloat217 * (float) local34;
					local148 = this.aFloat212 + this.aFloat210 * (float) local19 + this.aFloat214 * (float) local774 + this.aFloat217 * (float) local34;
					local257 = this.aFloat206 + this.aFloat207 * (float) local19 + this.aFloat211 * (float) local46 + this.aFloat209 * (float) local29;
					local270 = arg2.anInt7440 + (int) (local257 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local287 = this.aFloat208 + this.aFloat215 * (float) local19 + this.aFloat213 * (float) local46 + this.aFloat216 * (float) local29;
					local300 = arg2.anInt7442 + (int) (local287 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local317 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local754 + this.aFloat209 * (float) local29;
					local330 = arg2.anInt7440 + (int) (local317 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local347 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local754 + this.aFloat216 * (float) local29;
					local360 = arg2.anInt7442 + (int) (local347 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local377 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local765 + this.aFloat209 * (float) local34;
					local390 = arg2.anInt7440 + (int) (local377 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local407 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local765 + this.aFloat216 * (float) local34;
					local420 = arg2.anInt7442 + (int) (local407 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local437 = this.aFloat206 + this.aFloat207 * (float) local19 + this.aFloat211 * (float) local774 + this.aFloat209 * (float) local34;
					local450 = arg2.anInt7440 + (int) (local437 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local467 = this.aFloat208 + this.aFloat215 * (float) local19 + this.aFloat213 * (float) local774 + this.aFloat216 * (float) local34;
					local480 = arg2.anInt7442 + (int) (local467 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
				}
			} else {
				local46 = super.anIntArrayArray61[arg0][arg1];
				@Pc(52) float local52 = this.aFloat214 * (float) local46;
				if (this.anInt10336 == -1) {
					local73 = this.aFloat212 + this.aFloat210 * (float) local19 + local52 + this.aFloat217 * (float) local29;
					if (local73 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local98 = this.aFloat212 + this.aFloat210 * (float) local24 + local52 + this.aFloat217 * (float) local29;
					if (local98 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local123 = this.aFloat212 + this.aFloat210 * (float) local24 + local52 + this.aFloat217 * (float) local34;
					if (local123 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local148 = this.aFloat212 + this.aFloat210 * (float) local19 + local52 + this.aFloat217 * (float) local34;
					if (local148 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
				} else {
					local73 = this.aFloat212 + this.aFloat210 * (float) local19 + local52 + this.aFloat217 * (float) local29;
					local98 = this.aFloat212 + this.aFloat210 * (float) local24 + local52 + this.aFloat217 * (float) local29;
					local123 = this.aFloat212 + this.aFloat210 * (float) local24 + local52 + this.aFloat217 * (float) local34;
					local148 = this.aFloat212 + this.aFloat210 * (float) local19 + local52 + this.aFloat217 * (float) local34;
				}
				@Pc(230) float local230 = this.aFloat211 * (float) local46;
				@Pc(236) float local236 = this.aFloat213 * (float) local46;
				if (this.anInt10336 == -1) {
					local257 = this.aFloat206 + this.aFloat207 * (float) local19 + local230 + this.aFloat209 * (float) local29;
					local270 = arg2.anInt7440 + (int) (local257 * (float) this.aClass7_Sub3_11.anInt10105 / local73);
					local287 = this.aFloat208 + this.aFloat215 * (float) local19 + local236 + this.aFloat216 * (float) local29;
					local300 = arg2.anInt7442 + (int) (local287 * (float) this.aClass7_Sub3_11.anInt10094 / local73);
					local317 = this.aFloat206 + this.aFloat207 * (float) local24 + local230 + this.aFloat209 * (float) local29;
					local330 = arg2.anInt7440 + (int) (local317 * (float) this.aClass7_Sub3_11.anInt10105 / local98);
					local347 = this.aFloat208 + this.aFloat215 * (float) local24 + local236 + this.aFloat216 * (float) local29;
					local360 = arg2.anInt7442 + (int) (local347 * (float) this.aClass7_Sub3_11.anInt10094 / local98);
					local377 = this.aFloat206 + this.aFloat207 * (float) local24 + local230 + this.aFloat209 * (float) local34;
					local390 = arg2.anInt7440 + (int) (local377 * (float) this.aClass7_Sub3_11.anInt10105 / local123);
					local407 = this.aFloat208 + this.aFloat215 * (float) local24 + local236 + this.aFloat216 * (float) local34;
					local420 = arg2.anInt7442 + (int) (local407 * (float) this.aClass7_Sub3_11.anInt10094 / local123);
					local437 = this.aFloat206 + this.aFloat207 * (float) local19 + local230 + this.aFloat209 * (float) local34;
					local450 = arg2.anInt7440 + (int) (local437 * (float) this.aClass7_Sub3_11.anInt10105 / local148);
					local467 = this.aFloat208 + this.aFloat215 * (float) local19 + local236 + this.aFloat216 * (float) local34;
					local480 = arg2.anInt7442 + (int) (local467 * (float) this.aClass7_Sub3_11.anInt10094 / local148);
				} else {
					local257 = this.aFloat206 + this.aFloat207 * (float) local19 + local230 + this.aFloat209 * (float) local29;
					local270 = arg2.anInt7440 + (int) (local257 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local287 = this.aFloat208 + this.aFloat215 * (float) local19 + local236 + this.aFloat216 * (float) local29;
					local300 = arg2.anInt7442 + (int) (local287 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local317 = this.aFloat206 + this.aFloat207 * (float) local24 + local230 + this.aFloat209 * (float) local29;
					local330 = arg2.anInt7440 + (int) (local317 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local347 = this.aFloat208 + this.aFloat215 * (float) local24 + local236 + this.aFloat216 * (float) local29;
					local360 = arg2.anInt7442 + (int) (local347 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local377 = this.aFloat206 + this.aFloat207 * (float) local24 + local230 + this.aFloat209 * (float) local34;
					local390 = arg2.anInt7440 + (int) (local377 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local407 = this.aFloat208 + this.aFloat215 * (float) local24 + local236 + this.aFloat216 * (float) local34;
					local420 = arg2.anInt7442 + (int) (local407 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local437 = this.aFloat206 + this.aFloat207 * (float) local19 + local230 + this.aFloat209 * (float) local34;
					local450 = arg2.anInt7440 + (int) (local437 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local467 = this.aFloat208 + this.aFloat215 * (float) local19 + local236 + this.aFloat216 * (float) local34;
					local480 = arg2.anInt7442 + (int) (local467 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
				}
			}
			if (this.anInt10336 == -1) {
				if ((local390 - local450) * (local360 - local480) - (local420 - local480) * (local330 - local450) > 0) {
					arg2.aBoolean546 = local390 < 0 || local450 < 0 || local330 < 0 || local390 > arg2.anInt7444 || local450 > arg2.anInt7444 || local330 > arg2.anInt7444;
					if (local6.aShort66 >= 0) {
						if (this.method8069(this.aClass7_Sub3_11.anInterface7_12.method4460(local6.aShort66).aByte40)) {
							arg2.anInt7439 = 100;
						}
						arg2.method5857(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort69 & 0xFFFF, local6.aShort68 & 0xFFFF, local6.aShort67 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, (int) local73, (int) local98, (int) local148, local6.aShort66);
						arg2.anInt7439 = 0;
					} else {
						arg2.method5859(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort69 & 0xFFFF, local6.aShort68 & 0xFFFF, local6.aShort67 & 0xFFFF);
					}
				}
				if ((local270 - local330) * (local480 - local360) - (local300 - local360) * (local450 - local330) > 0) {
					arg2.aBoolean546 = local270 < 0 || local330 < 0 || local450 < 0 || local270 > arg2.anInt7444 || local330 > arg2.anInt7444 || local450 > arg2.anInt7444;
					if (local6.aShort66 >= 0) {
						if (this.method8069(this.aClass7_Sub3_11.anInterface7_12.method4460(local6.aShort66).aByte40)) {
							arg2.anInt7439 = 100;
						}
						arg2.method5857(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort70 & 0xFFFF, local6.aShort67 & 0xFFFF, local6.aShort68 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, (int) local73, (int) local98, (int) local148, local6.aShort66);
						arg2.anInt7439 = 0;
						return;
					}
					arg2.method5859(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort70 & 0xFFFF, local6.aShort67 & 0xFFFF, local6.aShort68 & 0xFFFF);
					return;
				}
			} else {
				if ((local390 - local450) * (local360 - local480) - (local420 - local480) * (local330 - local450) > 0) {
					arg2.aBoolean546 = local390 < 0 || local450 < 0 || local330 < 0 || local390 > arg2.anInt7444 || local450 > arg2.anInt7444 || local330 > arg2.anInt7444;
					if (local6.aShort66 >= 0) {
						if (this.method8069(this.aClass7_Sub3_11.anInterface7_12.method4460(local6.aShort66).aByte40)) {
							arg2.anInt7439 = 100;
						}
						arg2.method5857(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort69 & 0xFFFF, local6.aShort68 & 0xFFFF, local6.aShort67 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, this.anInt10336, this.anInt10336, this.anInt10336, local6.aShort66);
						arg2.anInt7439 = 0;
					} else {
						arg2.method5859(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort69 & 0xFFFF, local6.aShort68 & 0xFFFF, local6.aShort67 & 0xFFFF);
					}
				}
				if ((local270 - local330) * (local480 - local360) - (local300 - local360) * (local450 - local330) > 0) {
					arg2.aBoolean546 = local270 < 0 || local330 < 0 || local450 < 0 || local270 > arg2.anInt7444 || local330 > arg2.anInt7444 || local450 > arg2.anInt7444;
					if (local6.aShort66 >= 0) {
						if (this.method8069(this.aClass7_Sub3_11.anInterface7_12.method4460(local6.aShort66).aByte40)) {
							arg2.anInt7439 = 100;
						}
						arg2.method5857(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort70 & 0xFFFF, local6.aShort67 & 0xFFFF, local6.aShort68 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, this.anInt10336, this.anInt10336, this.anInt10336, local6.aShort66);
						arg2.anInt7439 = 0;
						return;
					}
					arg2.method5859(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort70 & 0xFFFF, local6.aShort67 & 0xFFFF, local6.aShort68 & 0xFFFF);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!am;[I)V")
	@Override
	public void method8057(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!wa", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class81_Sub3 local3 = this.aClass7_Sub3_11.aClass81_Sub3_3;
		this.anInt10336 = -1;
		this.aFloat207 = local3.aFloat118;
		this.aFloat211 = local3.aFloat114;
		this.aFloat209 = local3.aFloat116;
		this.aFloat206 = local3.aFloat120;
		this.aFloat215 = local3.aFloat122;
		this.aFloat213 = local3.aFloat121;
		this.aFloat216 = local3.aFloat115;
		this.aFloat208 = local3.aFloat112;
		this.aFloat210 = local3.aFloat123;
		this.aFloat214 = local3.aFloat117;
		this.aFloat217 = local3.aFloat113;
		this.aFloat212 = local3.aFloat119;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt10330 && local78 >= 0 && local78 < super.anInt10327) {
						this.method8061(local72, local78);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class4_Sub6_Sub7 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub6_Sub7 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8059(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class280 local4 = this.aClass7_Sub3_11.method7865(Thread.currentThread());
		@Pc(7) Class246 local7 = local4.aClass246_2;
		local7.anInt7439 = 0;
		local7.aBoolean546 = false;
		this.aClass7_Sub3_11.ya();
		if (this.aClass113ArrayArray1 != null) {
			this.method8066(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray480, local4.anIntArray469);
		} else if (this.aClass169ArrayArray1 != null) {
			this.method8068(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray480, local4.anIntArray469);
		}
	}

	@OriginalMember(owner = "client!wa", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method8062(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass169ArrayArray1 == null) {
			this.aClass169ArrayArray1 = new Class169[super.anInt10330][super.anInt10327];
			this.aClass229ArrayArray1 = new Class229[super.anInt10330][super.anInt10327];
		} else if (this.aClass113ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt10333 || local70 != 0 && local70 != super.anInt10333) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class229 local95 = new Class229();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort85 = local99;
			local95.aShortArray75 = new short[local99];
			local95.aShortArray77 = new short[local99];
			local95.aShortArray78 = new short[local99];
			local95.aShortArray74 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray75[local124] = (short) (this.aByteArrayArray30[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt10333) {
					local95.aShortArray75[local124] = (short) (this.aByteArrayArray30[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1]);
				} else if (local129 == super.anInt10333 && local133 == super.anInt10333) {
					local95.aShortArray75[local124] = (short) (this.aByteArrayArray30[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt10333 && local133 == 0) {
					local95.aShortArray75[local124] = (short) (this.aByteArrayArray30[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray30[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]) * (super.anInt10333 - local129) + (this.aByteArrayArray30[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray30[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1]) * (super.anInt10333 - local129) + (this.aByteArrayArray30[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray75[local124] = (short) (local288 * (super.anInt10333 - local133) + local335 * local133 >> super.anInt10331 * 2);
				}
				local288 = (arg0 << super.anInt10331) + local129;
				local335 = (arg1 << super.anInt10331) + local133;
				local95.aShortArray77[local124] = (short) local129;
				local95.aShortArray74[local124] = (short) local133;
				local95.aShortArray78[local124] = (short) (this.method8064(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray75[local124] < 2) {
					local95.aShortArray75[local124] = 2;
				}
			}
			@Pc(416) boolean local416 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass7_Sub3_11.anInterface7_12.method4460(arg11[local288]).aBoolean182) {
					local416 = true;
				}
			}
			local95.anIntArray368 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray369 = new int[local133];
			}
			local95.aShortArray76 = new short[local133];
			local95.aShortArray72 = new short[local133];
			local95.aShortArray73 = new short[local133];
			if (local416) {
				local95.aShortArray79 = new short[local133];
				local95.aShortArray80 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray368[local95.aShort86] = Static369.method7613(arg9[local335]);
					} else {
						local95.anIntArray368[local95.aShort86] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray369[local95.aShort86] = -1;
						} else {
							local95.anIntArray369[local95.aShort86] = Static369.method7613(arg10[local335]);
						}
					}
					local95.aShortArray76[local95.aShort86] = (short) arg6[local335];
					local95.aShortArray72[local95.aShort86] = (short) arg7[local335];
					local95.aShortArray73[local95.aShort86] = (short) arg8[local335];
					if (local416) {
						if (arg11[local335] == -1 || this.aClass7_Sub3_11.anInterface7_12.method4460(arg11[local335]).aBoolean182) {
							local95.aShortArray79[local95.aShort86] = -1;
						} else {
							local95.aShortArray79[local95.aShort86] = (short) arg11[local335];
							local95.aShortArray80[local95.aShort86] = (short) arg12[local335];
						}
					}
					local95.aShort86++;
				}
			}
			this.aClass229ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(645) Class169 local645 = new Class169();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local645.anInt5142 = Static484.method7066(Static369.method7613(arg10[0]), this.aByteArrayArray30[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]);
				if (local64 == -1) {
					local645.aByte85 = (byte) (local645.aByte85 | 0x2);
				}
			}
			if (super.anIntArrayArray61[arg0][arg1] == super.anIntArrayArray61[arg0 + 1][arg1] && super.anIntArrayArray61[arg0][arg1] == super.anIntArrayArray61[arg0 + 1][arg1 + 1] && super.anIntArrayArray61[arg0][arg1] == super.anIntArrayArray61[arg0][arg1 + 1]) {
				local645.aByte85 = (byte) (local645.aByte85 | 0x1);
			}
			if (local70 == -1 || (local645.aByte85 & 0x2) != 0 || this.aClass7_Sub3_11.anInterface7_12.method4460(local70).aBoolean182) {
				@Pc(846) short local846 = Static369.method7613(local64);
				local645.aShort70 = (short) Static484.method7066(local846, this.aByteArrayArray30[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]);
				local645.aShort67 = (short) Static484.method7066(local846, this.aByteArrayArray30[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1]);
				local645.aShort69 = (short) Static484.method7066(local846, this.aByteArrayArray30[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1]);
				local645.aShort68 = (short) Static484.method7066(local846, this.aByteArrayArray30[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1]);
				local645.aShort66 = -1;
			} else {
				local645.aShort70 = (short) (this.aByteArrayArray30[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]);
				local645.aShort67 = (short) (this.aByteArrayArray30[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1]);
				local645.aShort69 = (short) (this.aByteArrayArray30[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1]);
				local645.aShort68 = (short) (this.aByteArrayArray30[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1]);
				local645.aShort66 = (short) local70;
			}
			this.aClass169ArrayArray1[arg0][arg1] = local645;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII[[ZLclient!qm;Lclient!oga;[I[I)V")
	private void method8066(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class280 arg5, @OriginalArg(9) Class246 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean594;
		this.aClass7_Sub3_11.ZA(false);
		arg6.aBoolean545 = false;
		arg6.aBoolean543 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(78) int local78;
					if (this.aClass113ArrayArray1[local32][local35] != null) {
						@Pc(60) Class113 local60 = this.aClass113ArrayArray1[local32][local35];
						if (local60.aShort28 != -1 && (local60.aByte51 & 0x2) == 0 && local60.anInt3248 == 0) {
							local78 = this.aClass7_Sub3_11.method7856(local60.aShort28);
							arg6.method5859(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, Static484.method7066(local78, local60.anInt3245), Static484.method7066(local78, local60.anInt3244), Static484.method7066(local78, local60.anInt3246));
							arg6.method5859(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, Static484.method7066(local78, local60.anInt3247), Static484.method7066(local78, local60.anInt3246), Static484.method7066(local78, local60.anInt3244));
						} else if (local60.anInt3248 == 0) {
							arg6.method5858(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, local60.anInt3245, local60.anInt3244, local60.anInt3246);
							arg6.method5858(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, local60.anInt3247, local60.anInt3246, local60.anInt3244);
						} else {
							local78 = local60.anInt3248;
							arg6.method5858(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, Static119.method2175(local78, local60.anInt3245 & 0xFF000000), Static119.method2175(local78, local60.anInt3244 & 0xFF000000), Static119.method2175(local78, local60.anInt3246 & 0xFF000000));
							arg6.method5858(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, Static119.method2175(local78, local60.anInt3247 & 0xFF000000), Static119.method2175(local78, local60.anInt3246 & 0xFF000000), Static119.method2175(local78, local60.anInt3244 & 0xFF000000));
						}
					} else if (this.aClass157ArrayArray1[local32][local35] != null) {
						@Pc(287) Class157 local287 = this.aClass157ArrayArray1[local32][local35];
						for (local78 = 0; local78 < local287.aShort51; local78++) {
							arg7[local78] = local26 + local287.aShortArray43[local78] * 4 / super.anInt10333;
							arg8[local78] = local30 - local287.aShortArray46[local78] * 4 / super.anInt10333;
						}
						for (@Pc(325) int local325 = 0; local325 < local287.aShort52; local325++) {
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
							if (local287.anIntArray239 != null && local287.anIntArray239[local325] != 0 && (local287.aShortArray42 == null || local287.aShortArray42 != null && local287.aShortArray42[local325] == -1)) {
								local387 = local287.anIntArray239[local325];
								arg6.method5858(local354, local358, local362, local342, local346, local350, 100, 100, 100, Static119.method2175(local387, -(local287.anIntArray238[local330] & -16777216) - 16777216), Static119.method2175(local387, -(local287.anIntArray238[local334] & -16777216) - 16777216), Static119.method2175(local387, -(local287.anIntArray238[local338] & -16777216) - 16777216));
							} else if (local287.aShortArray42 == null || local287.aShortArray42[local325] == -1) {
								arg6.method5858(local354, local358, local362, local342, local346, local350, 100, 100, 100, local287.anIntArray238[local330], local287.anIntArray238[local334], local287.anIntArray238[local338]);
							} else {
								local387 = this.aClass7_Sub3_11.method7856(local287.aShortArray42[local325]);
								arg6.method5859(local354, local358, local362, local342, local346, local350, 100, 100, 100, local387, local387, local387);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean545 = true;
		this.aClass7_Sub3_11.ZA(local14);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIZLclient!qm;Lclient!oga;[I[I[I[I)V")
	private void method8067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class280 arg3, @OriginalArg(4) Class246 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8) {
		@Pc(6) Class113 local6 = this.aClass113ArrayArray1[arg0][arg1];
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
			@Pc(2770) Class157 local2770 = this.aClass157ArrayArray1[arg0][arg1];
			if (local2770 != null) {
				@Pc(2919) float local2919;
				@Pc(2940) float local2940;
				@Pc(2825) float local2825;
				if (this.anInt10336 == -1) {
					for (local527 = 0; local527 < local2770.aShort51; local527++) {
						local24 = local2770.aShortArray43[local527] + (arg0 << super.anInt10331);
						local29 = local2770.aShortArray45[local527];
						local34 = local2770.aShortArray46[local527] + (arg1 << super.anInt10331);
						local2825 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local29 + this.aFloat217 * (float) local34;
						if (local2825 <= (float) this.aClass7_Sub3_11.anInt10096) {
							return;
						}
						arg8[local527] = 0;
						if (arg2) {
							local377 = (int) (local2825 - (float) arg3.anInt8353);
							if (local377 > 255) {
								local377 = 255;
							}
							if (local377 > 0) {
								arg8[local527] = local377;
								local437 = local2770.aShortArray44[local527] * local377 / 255;
								if (local437 > 0) {
									local29 -= local437;
								}
							}
						} else if (arg3.aBoolean596) {
							local377 = (int) (local2825 - (float) arg3.anInt8353);
							if (local377 > 0) {
								arg8[local527] = local377;
								if (arg8[local527] > 255) {
									arg8[local527] = 255;
								}
							}
						}
						local2919 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local29 + this.aFloat209 * (float) local34;
						local2940 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local29 + this.aFloat216 * (float) local34;
						arg5[local527] = arg4.anInt7440 + (int) (local2919 * (float) this.aClass7_Sub3_11.anInt10105 / local2825);
						arg6[local527] = arg4.anInt7442 + (int) (local2940 * (float) this.aClass7_Sub3_11.anInt10094 / local2825);
						arg7[local527] = (int) local2825;
					}
				} else {
					for (local527 = 0; local527 < local2770.aShort51; local527++) {
						local24 = local2770.aShortArray43[local527] + (arg0 << super.anInt10331);
						local29 = local2770.aShortArray45[local527];
						local34 = local2770.aShortArray46[local527] + (arg1 << super.anInt10331);
						local2825 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local29 + this.aFloat217 * (float) local34;
						arg8[local527] = 0;
						if (arg2) {
							local377 = this.anInt10336 - arg3.anInt8353;
							if (local377 > 255) {
								local377 = 255;
							}
							if (local377 > 0) {
								arg8[local527] = local377;
								local437 = local2770.aShortArray44[local527] * local377 / 255;
								if (local437 > 0) {
									local29 -= local437;
								}
							}
						} else if (arg3.aBoolean596) {
							local377 = this.anInt10336 - arg3.anInt8353;
							if (local377 > 0) {
								arg8[local527] = local377;
								if (arg8[local527] > 255) {
									arg8[local527] = 255;
								}
							}
						}
						local2919 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local29 + this.aFloat209 * (float) local34;
						local2940 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local29 + this.aFloat216 * (float) local34;
						arg5[local527] = arg4.anInt7440 + (int) (local2919 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
						arg6[local527] = arg4.anInt7442 + (int) (local2940 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
						arg7[local527] = (int) local2825;
					}
				}
				@Pc(3222) int local3222;
				@Pc(3227) int local3227;
				if (local2770.aShortArray42 != null) {
					local527 = super.anIntArrayArray61[arg0][arg1];
					local377 = super.anIntArrayArray61[arg0 + 1][arg1];
					local437 = super.anIntArrayArray61[arg0][arg1 + 1];
					local497 = arg0 * super.anInt10333;
					local557 = local497 + super.anInt10333;
					local3222 = arg1 * super.anInt10333;
					local3227 = local3222 + super.anInt10333;
					local454 = this.aFloat206 + this.aFloat207 * (float) local497 + this.aFloat211 * (float) local527 + this.aFloat209 * (float) local3222;
					local514 = this.aFloat208 + this.aFloat215 * (float) local497 + this.aFloat213 * (float) local527 + this.aFloat216 * (float) local3222;
					local364 = this.aFloat212 + this.aFloat210 * (float) local497 + this.aFloat214 * (float) local527 + this.aFloat217 * (float) local3222;
					local424 = this.aFloat206 + this.aFloat207 * (float) local557 + this.aFloat211 * (float) local377 + this.aFloat209 * (float) local3222;
					local484 = this.aFloat208 + this.aFloat215 * (float) local557 + this.aFloat213 * (float) local377 + this.aFloat216 * (float) local3222;
					local544 = this.aFloat212 + this.aFloat210 * (float) local557 + this.aFloat214 * (float) local377 + this.aFloat217 * (float) local3222;
					local83 = this.aFloat206 + this.aFloat207 * (float) local497 + this.aFloat211 * (float) local437 + this.aFloat209 * (float) local3227;
					local108 = this.aFloat208 + this.aFloat215 * (float) local497 + this.aFloat213 * (float) local437 + this.aFloat216 * (float) local3227;
					local133 = this.aFloat212 + this.aFloat210 * (float) local497 + this.aFloat214 * (float) local437 + this.aFloat217 * (float) local3227;
					@Pc(3422) int local3422;
					@Pc(3515) short local3515;
					if (this.anInt10336 == -1) {
						for (local3422 = 0; local3422 < local2770.aShort52; local3422++) {
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
								arg4.aBoolean546 = local42 < 0 || local244 < 0 || local56 < 0 || local42 > arg4.anInt7444 || local244 > arg4.anInt7444 || local56 > arg4.anInt7444;
								local3515 = local2770.aShortArray42[local3422];
								if (local1080 < 765) {
									if (local3515 != -1 && this.method8069(this.aClass7_Sub3_11.anInterface7_12.method4460(local3515).aByte40)) {
										arg4.anInt7439 = 100;
									}
									if (local1080 > 0) {
										if (local3515 != -1) {
											arg4.method5849(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt8355, arg8[local36], arg8[local38], arg8[local40], local2770.anIntArray238[local36], local2770.anIntArray238[local38], local2770.anIntArray238[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, (int) local364, (int) local544, (int) local133, local3515);
										} else if ((local2770.anIntArray238[local36] & 0xFFFFFF) != 0) {
											arg4.method5858(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], Static119.method2175(local2770.anIntArray238[local36], arg8[local36] << 24 | arg3.anInt8355), Static119.method2175(local2770.anIntArray238[local38], arg8[local38] << 24 | arg3.anInt8355), Static119.method2175(local2770.anIntArray238[local40], arg8[local40] << 24 | arg3.anInt8355));
										}
									} else if (local3515 != -1) {
										arg4.method5857(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray238[local36], local2770.anIntArray238[local38], local2770.anIntArray238[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, (int) local364, (int) local544, (int) local133, local3515);
									} else if ((local2770.anIntArray238[local36] & 0xFFFFFF) != 0) {
										arg4.method5858(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray238[local36], local2770.anIntArray238[local38], local2770.anIntArray238[local40]);
									}
									arg4.anInt7439 = 0;
								} else {
									arg4.method5864(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt8355);
								}
							}
						}
						return;
					}
					for (local3422 = 0; local3422 < local2770.aShort52; local3422++) {
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
							arg4.aBoolean546 = local42 < 0 || local244 < 0 || local56 < 0 || local42 > arg4.anInt7444 || local244 > arg4.anInt7444 || local56 > arg4.anInt7444;
							local3515 = local2770.aShortArray42[local3422];
							if (local1080 < 765) {
								if (local3515 != -1 && this.method8069(this.aClass7_Sub3_11.anInterface7_12.method4460(local3515).aByte40)) {
									arg4.anInt7439 = 100;
								}
								if (local1080 > 0) {
									if (local3515 != -1) {
										arg4.method5849(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt8355, arg8[local36], arg8[local38], arg8[local40], local2770.anIntArray238[local36], local2770.anIntArray238[local38], local2770.anIntArray238[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, this.anInt10336, this.anInt10336, this.anInt10336, local3515);
									} else if ((local2770.anIntArray238[local36] & 0xFFFFFF) != 0) {
										arg4.method5858(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], Static119.method2175(local2770.anIntArray238[local36], arg8[local36] << 24 | arg3.anInt8355), Static119.method2175(local2770.anIntArray238[local38], arg8[local38] << 24 | arg3.anInt8355), Static119.method2175(local2770.anIntArray238[local40], arg8[local40] << 24 | arg3.anInt8355));
									}
								} else if (local3515 != -1) {
									arg4.method5857(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray238[local36], local2770.anIntArray238[local38], local2770.anIntArray238[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, this.anInt10336, this.anInt10336, this.anInt10336, local3515);
								} else if ((local2770.anIntArray238[local36] & 0xFFFFFF) != 0) {
									arg4.method5858(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray238[local36], local2770.anIntArray238[local38], local2770.anIntArray238[local40]);
								}
								arg4.anInt7439 = 0;
							} else {
								arg4.method5864(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt8355);
							}
						}
					}
					return;
				}
				for (local527 = 0; local527 < local2770.aShort52; local527++) {
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
						arg4.aBoolean546 = local557 < 0 || local3222 < 0 || local3227 < 0 || local557 > arg4.anInt7444 || local3222 > arg4.anInt7444 || local3227 > arg4.anInt7444;
						if (local4197 >= 765) {
							arg4.method5864(local4177, local4181, local4185, local557, local3222, local3227, arg7[local377], arg7[local437], arg7[local497], arg3.anInt8355);
						} else if (local4197 > 0) {
							if ((local2770.anIntArray238[local377] & 0xFFFFFF) != 0) {
								arg4.method5858(local4177, local4181, local4185, local557, local3222, local3227, arg7[local377], arg7[local437], arg7[local497], Static19.method817(arg3.anInt8355, local2770.anIntArray238[local377], arg8[local377]), Static19.method817(arg3.anInt8355, local2770.anIntArray238[local437], arg8[local437]), Static19.method817(arg3.anInt8355, local2770.anIntArray238[local497], arg8[local497]));
							}
						} else if ((local2770.anIntArray238[local377] & 0xFFFFFF) != 0) {
							arg4.method5858(local4177, local4181, local4185, local557, local3222, local3227, arg7[local377], arg7[local437], arg7[local497], local2770.anIntArray238[local377], local2770.anIntArray238[local437], local2770.anIntArray238[local497]);
						}
					}
				}
			}
		} else if ((local6.aByte51 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt10333;
			local24 = local19 + super.anInt10333;
			local29 = arg1 * super.anInt10333;
			local34 = local29 + super.anInt10333;
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
			if ((local6.aByte51 & 0x1) == 0 || arg2) {
				local56 = super.anIntArrayArray61[arg0][arg1];
				local831 = super.anIntArrayArray61[arg0 + 1][arg1];
				local842 = super.anIntArrayArray61[arg0 + 1][arg1 + 1];
				local851 = super.anIntArrayArray61[arg0][arg1 + 1];
				if (this.anInt10336 == -1) {
					local83 = this.aFloat212 + this.aFloat210 * (float) local19 + this.aFloat214 * (float) local56 + this.aFloat217 * (float) local29;
					if (local83 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local108 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local831 + this.aFloat217 * (float) local29;
					if (local108 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local133 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local842 + this.aFloat217 * (float) local34;
					if (local133 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local158 = this.aFloat212 + this.aFloat210 * (float) local19 + this.aFloat214 * (float) local851 + this.aFloat217 * (float) local34;
					if (local158 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
				} else {
					local83 = this.aFloat212 + this.aFloat210 * (float) local19 + this.aFloat214 * (float) local56 + this.aFloat217 * (float) local29;
					local108 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local831 + this.aFloat217 * (float) local29;
					local133 = this.aFloat212 + this.aFloat210 * (float) local24 + this.aFloat214 * (float) local842 + this.aFloat217 * (float) local34;
					local158 = this.aFloat212 + this.aFloat210 * (float) local19 + this.aFloat214 * (float) local851 + this.aFloat217 * (float) local34;
				}
				if (arg2) {
					local244 = (int) (local83 - (float) arg3.anInt8353);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local36 = local244;
						local1080 = local6.aShort25 * local244 / 255;
						if (local1080 > 0) {
							local56 -= local1080;
						}
					}
					local244 = (int) (local108 - (float) arg3.anInt8353);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local38 = local244;
						local1080 = local6.aShort29 * local244 / 255;
						if (local1080 > 0) {
							local831 -= local1080;
						}
					}
					local244 = (int) (local133 - (float) arg3.anInt8353);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local40 = local244;
						local1080 = local6.aShort27 * local244 / 255;
						if (local1080 > 0) {
							local842 -= local1080;
						}
					}
					local244 = (int) (local158 - (float) arg3.anInt8353);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local42 = local244;
						local1080 = local6.aShort26 * local244 / 255;
						if (local1080 > 0) {
							local851 -= local1080;
						}
					}
				} else if (arg3.aBoolean596) {
					local244 = (int) (local83 - (float) arg3.anInt8353);
					if (local244 > 0) {
						local36 = local244;
						if (local244 > 255) {
							local36 = 255;
						}
					}
					local244 = (int) (local108 - (float) arg3.anInt8353);
					if (local244 > 0) {
						local38 = local244;
						if (local244 > 255) {
							local38 = 255;
						}
					}
					local244 = (int) (local133 - (float) arg3.anInt8353);
					if (local244 > 0) {
						local40 = local244;
						if (local244 > 255) {
							local40 = 255;
						}
					}
					local244 = (int) (local158 - (float) arg3.anInt8353);
					if (local244 > 0) {
						local42 = local244;
						if (local244 > 255) {
							local42 = 255;
						}
					}
				}
				if (this.anInt10336 == -1) {
					local334 = this.aFloat206 + this.aFloat207 * (float) local19 + this.aFloat211 * (float) local56 + this.aFloat209 * (float) local29;
					local347 = arg4.anInt7440 + (int) (local334 * (float) this.aClass7_Sub3_11.anInt10105 / local83);
					local364 = this.aFloat208 + this.aFloat215 * (float) local19 + this.aFloat213 * (float) local56 + this.aFloat216 * (float) local29;
					local377 = arg4.anInt7442 + (int) (local364 * (float) this.aClass7_Sub3_11.anInt10094 / local83);
					local394 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local831 + this.aFloat209 * (float) local29;
					local407 = arg4.anInt7440 + (int) (local394 * (float) this.aClass7_Sub3_11.anInt10105 / local108);
					local424 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local831 + this.aFloat216 * (float) local29;
					local437 = arg4.anInt7442 + (int) (local424 * (float) this.aClass7_Sub3_11.anInt10094 / local108);
					local454 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local842 + this.aFloat209 * (float) local34;
					local467 = arg4.anInt7440 + (int) (local454 * (float) this.aClass7_Sub3_11.anInt10105 / local133);
					local484 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local842 + this.aFloat216 * (float) local34;
					local497 = arg4.anInt7442 + (int) (local484 * (float) this.aClass7_Sub3_11.anInt10094 / local133);
					local514 = this.aFloat206 + this.aFloat207 * (float) local19 + this.aFloat211 * (float) local851 + this.aFloat209 * (float) local34;
					local527 = arg4.anInt7440 + (int) (local514 * (float) this.aClass7_Sub3_11.anInt10105 / local158);
					local544 = this.aFloat208 + this.aFloat215 * (float) local19 + this.aFloat213 * (float) local851 + this.aFloat216 * (float) local34;
					local557 = arg4.anInt7442 + (int) (local544 * (float) this.aClass7_Sub3_11.anInt10094 / local158);
				} else {
					local334 = this.aFloat206 + this.aFloat207 * (float) local19 + this.aFloat211 * (float) local56 + this.aFloat209 * (float) local29;
					local347 = arg4.anInt7440 + (int) (local334 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local364 = this.aFloat208 + this.aFloat215 * (float) local19 + this.aFloat213 * (float) local56 + this.aFloat216 * (float) local29;
					local377 = arg4.anInt7442 + (int) (local364 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local394 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local831 + this.aFloat209 * (float) local29;
					local407 = arg4.anInt7440 + (int) (local394 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local424 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local831 + this.aFloat216 * (float) local29;
					local437 = arg4.anInt7442 + (int) (local424 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local454 = this.aFloat206 + this.aFloat207 * (float) local24 + this.aFloat211 * (float) local842 + this.aFloat209 * (float) local34;
					local467 = arg4.anInt7440 + (int) (local454 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local484 = this.aFloat208 + this.aFloat215 * (float) local24 + this.aFloat213 * (float) local842 + this.aFloat216 * (float) local34;
					local497 = arg4.anInt7442 + (int) (local484 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local514 = this.aFloat206 + this.aFloat207 * (float) local19 + this.aFloat211 * (float) local851 + this.aFloat209 * (float) local34;
					local527 = arg4.anInt7440 + (int) (local514 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local544 = this.aFloat208 + this.aFloat215 * (float) local19 + this.aFloat213 * (float) local851 + this.aFloat216 * (float) local34;
					local557 = arg4.anInt7442 + (int) (local544 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
				}
			} else {
				local56 = super.anIntArrayArray61[arg0][arg1];
				@Pc(62) float local62 = this.aFloat214 * (float) local56;
				if (this.anInt10336 == -1) {
					local83 = this.aFloat212 + this.aFloat210 * (float) local19 + local62 + this.aFloat217 * (float) local29;
					if (local83 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local108 = this.aFloat212 + this.aFloat210 * (float) local24 + local62 + this.aFloat217 * (float) local29;
					if (local108 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local133 = this.aFloat212 + this.aFloat210 * (float) local24 + local62 + this.aFloat217 * (float) local34;
					if (local133 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
					local158 = this.aFloat212 + this.aFloat210 * (float) local19 + local62 + this.aFloat217 * (float) local34;
					if (local158 <= (float) this.aClass7_Sub3_11.anInt10096) {
						return;
					}
				} else {
					local83 = this.aFloat212 + this.aFloat210 * (float) local19 + local62 + this.aFloat217 * (float) local29;
					local108 = this.aFloat212 + this.aFloat210 * (float) local24 + local62 + this.aFloat217 * (float) local29;
					local133 = this.aFloat212 + this.aFloat210 * (float) local24 + local62 + this.aFloat217 * (float) local34;
					local158 = this.aFloat212 + this.aFloat210 * (float) local19 + local62 + this.aFloat217 * (float) local34;
				}
				if (arg3.aBoolean596) {
					local244 = (int) (local83 - (float) arg3.anInt8353);
					if (local244 > 0) {
						local36 = local244;
						if (local244 > 255) {
							local36 = 255;
						}
					}
					local244 = (int) (local108 - (float) arg3.anInt8353);
					if (local244 > 0) {
						local38 = local244;
						if (local244 > 255) {
							local38 = 255;
						}
					}
					local244 = (int) (local133 - (float) arg3.anInt8353);
					if (local244 > 0) {
						local40 = local244;
						if (local244 > 255) {
							local40 = 255;
						}
					}
					local244 = (int) (local158 - (float) arg3.anInt8353);
					if (local244 > 0) {
						local42 = local244;
						if (local244 > 255) {
							local42 = 255;
						}
					}
				}
				@Pc(307) float local307 = this.aFloat211 * (float) local56;
				@Pc(313) float local313 = this.aFloat213 * (float) local56;
				if (this.anInt10336 == -1) {
					local334 = this.aFloat206 + this.aFloat207 * (float) local19 + local307 + this.aFloat209 * (float) local29;
					local347 = arg4.anInt7440 + (int) (local334 * (float) this.aClass7_Sub3_11.anInt10105 / local83);
					local364 = this.aFloat208 + this.aFloat215 * (float) local19 + local313 + this.aFloat216 * (float) local29;
					local377 = arg4.anInt7442 + (int) (local364 * (float) this.aClass7_Sub3_11.anInt10094 / local83);
					local394 = this.aFloat206 + this.aFloat207 * (float) local24 + local307 + this.aFloat209 * (float) local29;
					local407 = arg4.anInt7440 + (int) (local394 * (float) this.aClass7_Sub3_11.anInt10105 / local108);
					local424 = this.aFloat208 + this.aFloat215 * (float) local24 + local313 + this.aFloat216 * (float) local29;
					local437 = arg4.anInt7442 + (int) (local424 * (float) this.aClass7_Sub3_11.anInt10094 / local108);
					local454 = this.aFloat206 + this.aFloat207 * (float) local24 + local307 + this.aFloat209 * (float) local34;
					local467 = arg4.anInt7440 + (int) (local454 * (float) this.aClass7_Sub3_11.anInt10105 / local133);
					local484 = this.aFloat208 + this.aFloat215 * (float) local24 + local313 + this.aFloat216 * (float) local34;
					local497 = arg4.anInt7442 + (int) (local484 * (float) this.aClass7_Sub3_11.anInt10094 / local133);
					local514 = this.aFloat206 + this.aFloat207 * (float) local19 + local307 + this.aFloat209 * (float) local34;
					local527 = arg4.anInt7440 + (int) (local514 * (float) this.aClass7_Sub3_11.anInt10105 / local158);
					local544 = this.aFloat208 + this.aFloat215 * (float) local19 + local313 + this.aFloat216 * (float) local34;
					local557 = arg4.anInt7442 + (int) (local544 * (float) this.aClass7_Sub3_11.anInt10094 / local158);
				} else {
					local334 = this.aFloat206 + this.aFloat207 * (float) local19 + local307 + this.aFloat209 * (float) local29;
					local347 = arg4.anInt7440 + (int) (local334 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local364 = this.aFloat208 + this.aFloat215 * (float) local19 + local313 + this.aFloat216 * (float) local29;
					local377 = arg4.anInt7442 + (int) (local364 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local394 = this.aFloat206 + this.aFloat207 * (float) local24 + local307 + this.aFloat209 * (float) local29;
					local407 = arg4.anInt7440 + (int) (local394 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local424 = this.aFloat208 + this.aFloat215 * (float) local24 + local313 + this.aFloat216 * (float) local29;
					local437 = arg4.anInt7442 + (int) (local424 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local454 = this.aFloat206 + this.aFloat207 * (float) local24 + local307 + this.aFloat209 * (float) local34;
					local467 = arg4.anInt7440 + (int) (local454 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local484 = this.aFloat208 + this.aFloat215 * (float) local24 + local313 + this.aFloat216 * (float) local34;
					local497 = arg4.anInt7442 + (int) (local484 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
					local514 = this.aFloat206 + this.aFloat207 * (float) local19 + local307 + this.aFloat209 * (float) local34;
					local527 = arg4.anInt7440 + (int) (local514 * (float) this.aClass7_Sub3_11.anInt10105 / (float) this.anInt10336);
					local544 = this.aFloat208 + this.aFloat215 * (float) local19 + local313 + this.aFloat216 * (float) local34;
					local557 = arg4.anInt7442 + (int) (local544 * (float) this.aClass7_Sub3_11.anInt10094 / (float) this.anInt10336);
				}
			}
			@Pc(1825) boolean local1825 = local6.aShort28 != -1 && this.method8069(this.aClass7_Sub3_11.anInterface7_12.method4460(local6.aShort28).aByte40);
			if (this.anInt10336 == -1) {
				local831 = local38 + local40 + local42;
				if ((local467 - local527) * (local437 - local557) - (local497 - local557) * (local407 - local527) > 0) {
					arg4.aBoolean546 = local467 < 0 || local527 < 0 || local407 < 0 || local467 > arg4.anInt7444 || local527 > arg4.anInt7444 || local407 > arg4.anInt7444;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt7439 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort28 >= 0) {
								arg4.method5849(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt8355, local40, local42, local38, local6.anInt3245, local6.anInt3244, local6.anInt3246, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, (int) local133, (int) local158, (int) local108, local6.aShort28);
							} else {
								arg4.method5858(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, Static119.method2175(local6.anInt3245, local40 << 24 | arg3.anInt8355), Static119.method2175(local6.anInt3244, local42 << 24 | arg3.anInt8355), Static119.method2175(local6.anInt3246, local38 << 24 | arg3.anInt8355));
							}
						} else if (local6.aShort28 >= 0) {
							arg4.method5857(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt3245, local6.anInt3244, local6.anInt3246, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, (int) local133, (int) local158, (int) local108, local6.aShort28);
						} else {
							arg4.method5858(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt3245, local6.anInt3244, local6.anInt3246);
						}
						arg4.anInt7439 = 0;
					} else {
						arg4.method5864(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt8355);
					}
				}
				local831 = local36 + local38 + local42;
				if ((local347 - local407) * (local557 - local437) - (local377 - local437) * (local527 - local407) > 0) {
					arg4.aBoolean546 = local347 < 0 || local407 < 0 || local527 < 0 || local347 > arg4.anInt7444 || local407 > arg4.anInt7444 || local527 > arg4.anInt7444;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt7439 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort28 >= 0) {
								arg4.method5849(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt8355, local36, local38, local42, local6.anInt3247, local6.anInt3246, local6.anInt3244, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, (int) local83, (int) local108, (int) local158, local6.aShort28);
							} else {
								arg4.method5858(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, Static119.method2175(local6.anInt3247, local36 << 24 | arg3.anInt8355), Static119.method2175(local6.anInt3246, local38 << 24 | arg3.anInt8355), Static119.method2175(local6.anInt3244, local42 << 24 | arg3.anInt8355));
							}
						} else if (local6.aShort28 >= 0) {
							arg4.method5857(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt3247, local6.anInt3246, local6.anInt3244, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, (int) local83, (int) local108, (int) local158, local6.aShort28);
						} else {
							arg4.method5858(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt3247, local6.anInt3246, local6.anInt3244);
						}
						arg4.anInt7439 = 0;
						return;
					}
					arg4.method5864(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt8355);
					return;
				}
			} else {
				local831 = local38 + local40 + local42;
				if ((local467 - local527) * (local437 - local557) - (local497 - local557) * (local407 - local527) > 0) {
					arg4.aBoolean546 = local467 < 0 || local527 < 0 || local407 < 0 || local467 > arg4.anInt7444 || local527 > arg4.anInt7444 || local407 > arg4.anInt7444;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt7439 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort28 >= 0) {
								arg4.method5849(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt8355, local40, local42, local38, local6.anInt3245, local6.anInt3244, local6.anInt3246, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, this.anInt10336, this.anInt10336, this.anInt10336, local6.aShort28);
							} else {
								arg4.method5858(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, Static119.method2175(local6.anInt3245, local40 << 24 | arg3.anInt8355), Static119.method2175(local6.anInt3244, local42 << 24 | arg3.anInt8355), Static119.method2175(local6.anInt3246, local38 << 24 | arg3.anInt8355));
							}
						} else if (local6.aShort28 >= 0) {
							arg4.method5857(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt3245, local6.anInt3244, local6.anInt3246, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, this.anInt10336, this.anInt10336, this.anInt10336, local6.aShort28);
						} else {
							arg4.method5858(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt3245, local6.anInt3244, local6.anInt3246);
						}
						arg4.anInt7439 = 0;
					} else {
						arg4.method5864(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt8355);
					}
				}
				local831 = local36 + local38 + local42;
				if ((local347 - local407) * (local557 - local437) - (local377 - local437) * (local527 - local407) > 0) {
					arg4.aBoolean546 = local347 < 0 || local407 < 0 || local527 < 0 || local347 > arg4.anInt7444 || local407 > arg4.anInt7444 || local527 > arg4.anInt7444;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt7439 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort28 >= 0) {
								arg4.method5849(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt8355, local36, local38, local42, local6.anInt3247, local6.anInt3246, local6.anInt3244, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, this.anInt10336, this.anInt10336, this.anInt10336, local6.aShort28);
							} else {
								arg4.method5858(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, Static119.method2175(local6.anInt3247, local36 << 24 | arg3.anInt8355), Static119.method2175(local6.anInt3246, local38 << 24 | arg3.anInt8355), Static119.method2175(local6.anInt3244, local42 << 24 | arg3.anInt8355));
							}
						} else if (local6.aShort28 >= 0) {
							arg4.method5857(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt3247, local6.anInt3246, local6.anInt3244, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, this.anInt10336, this.anInt10336, this.anInt10336, local6.aShort28);
						} else {
							arg4.method5858(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt3247, local6.anInt3246, local6.anInt3244);
						}
						arg4.anInt7439 = 0;
						return;
					}
					arg4.method5864(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt8355);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class81_Sub3 local3 = this.aClass7_Sub3_11.aClass81_Sub3_3;
		this.anInt10336 = arg5;
		this.aFloat207 = local3.aFloat118;
		this.aFloat211 = local3.aFloat114;
		this.aFloat209 = local3.aFloat116;
		this.aFloat206 = local3.aFloat120;
		this.aFloat215 = local3.aFloat122;
		this.aFloat213 = local3.aFloat121;
		this.aFloat216 = local3.aFloat115;
		this.aFloat208 = local3.aFloat112;
		this.aFloat210 = local3.aFloat123;
		this.aFloat214 = local3.aFloat117;
		this.aFloat217 = local3.aFloat113;
		this.aFloat212 = local3.aFloat119;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt10330 && local78 >= 0 && local78 < super.anInt10327) {
						this.method8061(local72, local78);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		this.aByteArrayArray30 = null;
		this.aByteArrayArray31 = null;
	}

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass113ArrayArray1 == null) {
			this.aClass113ArrayArray1 = new Class113[super.anInt10330][super.anInt10327];
			this.aClass157ArrayArray1 = new Class157[super.anInt10330][super.anInt10327];
		} else if (this.aClass169ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static117.anIntArray125[Static369.method7613(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static117.anIntArray125[Static369.method7613(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt10333 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt10333 && arg4[local116] == super.anInt10333) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt10333) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt10333 && arg2[local244] != arg2[0] - super.anInt10333) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt10333 && arg4[local244] != arg4[0] - super.anInt10333) {
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
			@Pc(334) Class113 local334 = new Class113();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt3248 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte51 = (byte) (local334.aByte51 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (super.anIntArrayArray61[arg0][arg1] == super.anIntArrayArray61[arg0 + 1][arg1] && super.anIntArrayArray61[arg0][arg1] == super.anIntArrayArray61[arg0 + 1][arg1 + 1] && super.anIntArrayArray61[arg0][arg1] == super.anIntArrayArray61[arg0][arg1 + 1]) {
				local334.aByte51 = (byte) (local334.aByte51 | 0x1);
			}
			if (local342 == -1 || (local334.aByte51 & 0x2) != 0 || this.aClass7_Sub3_11.anInterface7_12.method4460(local342).aBoolean182) {
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
				local334.anInt3247 = Static19.method817(arg10, Static606.method8070(arg6[local104] >> 8, this.aByteArrayArray30[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]), local527);
				if (local334.anInt3248 != 0) {
					local334.anInt3247 |= this.aByteArrayArray31[arg0][arg1] + 255 - this.aByteArrayArray30[arg0][arg1] << 25;
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
				local334.anInt3246 = Static19.method817(arg10, Static606.method8070(arg6[local106] >> 8, this.aByteArrayArray30[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1]), local527);
				if (local334.anInt3248 != 0) {
					local334.anInt3246 |= this.aByteArrayArray31[arg0 + 1][arg1] + 255 - this.aByteArrayArray30[arg0 + 1][arg1] << 25;
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
				local334.anInt3245 = Static19.method817(arg10, Static606.method8070(arg6[local108] >> 8, this.aByteArrayArray30[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1]), local527);
				if (local334.anInt3248 != 0) {
					local334.anInt3245 |= this.aByteArrayArray31[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray30[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt3244 = Static19.method817(arg10, Static606.method8070(arg6[local110] >> 8, this.aByteArrayArray30[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1]), local527);
				if (local334.anInt3248 != 0) {
					local334.anInt3244 |= this.aByteArrayArray31[arg0][arg1 + 1] + 255 - this.aByteArrayArray30[arg0][arg1 + 1] << 25;
				}
				local334.aShort28 = -1;
			} else {
				local334.anInt3247 = this.aByteArrayArray30[arg0][arg1] - this.aByteArrayArray31[arg0][arg1];
				local334.anInt3246 = this.aByteArrayArray30[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1];
				local334.anInt3245 = this.aByteArrayArray30[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1];
				local334.anInt3244 = this.aByteArrayArray30[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1];
				local334.aShort28 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort27 = (short) arg5[local108];
				local334.aShort26 = (short) arg5[local110];
				local334.aShort29 = (short) arg5[local106];
				local334.aShort25 = (short) arg5[local104];
			}
			this.aClass113ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class157 local888 = new Class157();
		local888.aShort51 = (short) arg2.length;
		local888.aShort52 = (short) (arg2.length / 3);
		local888.aShortArray43 = new short[local888.aShort51];
		local888.aShortArray45 = new short[local888.aShort51];
		local888.aShortArray46 = new short[local888.aShort51];
		local888.anIntArray238 = new int[local888.aShort51];
		if (arg5 != null) {
			local888.aShortArray44 = new short[local888.aShort51];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1227) int local1227;
		for (local244 = 0; local244 < local888.aShort51; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray30[arg0][arg1] - this.aByteArrayArray31[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt10333) {
				local958 = this.aByteArrayArray30[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1];
			} else if (local342 == super.anInt10333 && local527 == super.anInt10333) {
				local958 = this.aByteArrayArray30[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt10333 && local527 == 0) {
				local958 = this.aByteArrayArray30[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray30[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]) * (super.anInt10333 - local342) + (this.aByteArrayArray30[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray30[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1]) * (super.anInt10333 - local342) + (this.aByteArrayArray30[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt10333 - local527) + local1126 * local527 >> super.anInt10331 * 2;
			}
			local1079 = (arg0 << super.anInt10331) + local342;
			local1126 = (arg1 << super.anInt10331) + local527;
			local888.aShortArray43[local244] = (short) local342;
			local888.aShortArray46[local244] = (short) local527;
			local888.aShortArray45[local244] = (short) (this.method8064(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass7_Sub3_11.anInterface7_12.method4460(arg8[local244]).aBoolean182) {
				local888.anIntArray238[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1227 = 0;
				if (arg5 != null) {
					@Pc(1239) short local1239 = local888.aShortArray44[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1227 = local1239 * 255 / arg11;
						if (local1227 < 0) {
							local1227 = 0;
						} else if (local1227 > 255) {
							local1227 = 255;
						}
					}
				}
				local888.anIntArray238[local244] = Static19.method817(arg10, Static606.method8070(arg6[local244] >> 8, local958), local1227);
				if (arg7 != null) {
					local888.anIntArray238[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray238[local244] = 0;
			} else {
				local888.anIntArray238[local244] = local958 << 25;
			}
		}
		@Pc(1297) boolean local1297 = false;
		for (local527 = 0; local527 < local888.aShort52; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass7_Sub3_11.anInterface7_12.method4460(arg8[local527 * 3]).aBoolean182) {
				local1297 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray239 = new int[local888.aShort52];
		}
		if (local1297) {
			local888.aShortArray42 = new short[local888.aShort52];
			local888.aShortArray47 = new short[local888.aShort52];
		}
		for (local958 = 0; local958 < local888.aShort52; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray239[local958] = arg7[local1079] >> 8;
			}
			if (local1297) {
				local1126 = local1079 + 1;
				local1227 = local1126 + 1;
				@Pc(1379) boolean local1379 = false;
				@Pc(1381) boolean local1381 = true;
				@Pc(1385) int local1385 = arg8[local1079];
				if (local1385 == -1 || this.aClass7_Sub3_11.anInterface7_12.method4460(local1385).aBoolean182) {
					local1381 = false;
				} else {
					local1379 = true;
				}
				local1385 = arg8[local1126];
				if (local1385 == -1 || this.aClass7_Sub3_11.anInterface7_12.method4460(local1385).aBoolean182) {
					local1381 = false;
				} else {
					local1379 = true;
				}
				local1385 = arg8[local1227];
				if (local1385 == -1 || this.aClass7_Sub3_11.anInterface7_12.method4460(local1385).aBoolean182) {
					local1381 = false;
				} else {
					local1379 = true;
				}
				if (local1381) {
					local888.aShortArray42[local958] = (short) local1385;
					local888.aShortArray47[local958] = (short) arg9[local1079];
				} else {
					if (local1379) {
						local1385 = arg8[local1079];
						if (local1385 != -1 && !this.aClass7_Sub3_11.anInterface7_12.method4460(local1385).aBoolean182) {
							local888.anIntArray238[local1079] = Static117.anIntArray125[Static369.method7613(this.aClass7_Sub3_11.anInterface7_12.method4460(local1385).aShort21 & 0xFFFF) & 0xFFFF];
						}
						local1385 = arg8[local1126];
						if (local1385 != -1 && !this.aClass7_Sub3_11.anInterface7_12.method4460(local1385).aBoolean182) {
							local888.anIntArray238[local1126] = Static117.anIntArray125[Static369.method7613(this.aClass7_Sub3_11.anInterface7_12.method4460(local1385).aShort21 & 0xFFFF) & 0xFFFF];
						}
						local1385 = arg8[local1227];
						if (local1385 != -1 && !this.aClass7_Sub3_11.anInterface7_12.method4460(local1385).aBoolean182) {
							local888.anIntArray238[local1227] = Static117.anIntArray125[Static369.method7613(this.aClass7_Sub3_11.anInterface7_12.method4460(local1385).aShort21 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray42[local958] = -1;
				}
			}
		}
		this.aClass157ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIII[[ZLclient!qm;Lclient!oga;[I[I)V")
	private void method8068(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class280 arg5, @OriginalArg(9) Class246 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean594;
		this.aClass7_Sub3_11.ZA(false);
		arg6.aBoolean545 = false;
		arg6.aBoolean543 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(79) int local79;
					if (this.aClass169ArrayArray1[local32][local35] != null) {
						@Pc(60) Class169 local60 = this.aClass169ArrayArray1[local32][local35];
						if (local60.aShort66 != -1 && (local60.aByte85 & 0x2) == 0 && local60.anInt5142 == -1) {
							local79 = this.aClass7_Sub3_11.method7856(local60.aShort66);
							arg6.method5859(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, Static484.method7066(local79, local60.aShort69 & 0xFFFF), Static484.method7066(local79, local60.aShort68 & 0xFFFF), Static484.method7066(local79, local60.aShort67 & 0xFFFF));
							arg6.method5859(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, Static484.method7066(local79, local60.aShort70 & 0xFFFF), Static484.method7066(local79, local60.aShort67 & 0xFFFF), Static484.method7066(local79, local60.aShort68 & 0xFFFF));
						} else if (local60.anInt5142 == -1) {
							arg6.method5859(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, local60.aShort69 & 0xFFFF, local60.aShort68 & 0xFFFF, local60.aShort67 & 0xFFFF);
							arg6.method5859(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, local60.aShort70 & 0xFFFF, local60.aShort67 & 0xFFFF, local60.aShort68 & 0xFFFF);
						} else {
							local79 = local60.anInt5142;
							arg6.method5859(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, local79, local79, local79);
							arg6.method5859(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, local79, local79, local79);
						}
					} else if (this.aClass229ArrayArray1[local32][local35] != null) {
						@Pc(277) Class229 local277 = this.aClass229ArrayArray1[local32][local35];
						for (local79 = 0; local79 < local277.aShort85; local79++) {
							arg7[local79] = local26 + local277.aShortArray77[local79] * 4 / super.anInt10333;
							arg8[local79] = local30 - local277.aShortArray74[local79] * 4 / super.anInt10333;
						}
						for (@Pc(315) int local315 = 0; local315 < local277.aShort86; local315++) {
							@Pc(321) short local321 = local277.aShortArray76[local315];
							@Pc(326) short local326 = local277.aShortArray72[local315];
							@Pc(331) short local331 = local277.aShortArray73[local315];
							@Pc(335) int local335 = arg7[local321];
							@Pc(339) int local339 = arg7[local326];
							@Pc(343) int local343 = arg7[local331];
							@Pc(347) int local347 = arg8[local321];
							@Pc(351) int local351 = arg8[local326];
							@Pc(355) int local355 = arg8[local331];
							@Pc(369) int local369;
							if (local277.anIntArray369 != null && local277.anIntArray369[local315] != -1) {
								local369 = local277.anIntArray369[local315];
								arg6.method5859(local347, local351, local355, local335, local339, local343, 100, 100, 100, Static484.method7066(local369, local277.aShortArray75[local321]), Static484.method7066(local369, local277.aShortArray75[local326]), Static484.method7066(local369, local277.aShortArray75[local331]));
							} else if (local277.aShortArray79 == null || local277.aShortArray79[local315] == -1) {
								local369 = local277.anIntArray368[local315];
								arg6.method5859(local347, local351, local355, local335, local339, local343, 100, 100, 100, Static484.method7066(local369, local277.aShortArray75[local321]), Static484.method7066(local369, local277.aShortArray75[local326]), Static484.method7066(local369, local277.aShortArray75[local331]));
							} else {
								local369 = this.aClass7_Sub3_11.method7856(local277.aShortArray79[local315]);
								arg6.method5859(local347, local351, local355, local335, local339, local343, 100, 100, 100, Static484.method7066(local369, local277.aShortArray75[local321]), Static484.method7066(local369, local277.aShortArray75[local326]), Static484.method7066(local369, local277.aShortArray75[local331]));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean545 = true;
		this.aClass7_Sub3_11.ZA(local14);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Z")
	private boolean method8069(@OriginalArg(0) int arg0) {
		if ((this.anInt10335 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray31[arg0][arg1] < arg2) {
			this.aByteArrayArray31[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
	@Override
	public void method8061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class280 local4 = this.aClass7_Sub3_11.method7865(Thread.currentThread());
		local4.aClass246_2.anInt7439 = 0;
		if (this.aClass113ArrayArray1 != null) {
			this.method8067(arg0, arg1, local4.aBoolean595, local4, local4.aClass246_2, local4.anIntArray480, local4.anIntArray469, local4.anIntArray477, local4.anIntArray472);
		} else if (this.aClass169ArrayArray1 != null) {
			this.method8065(arg0, arg1, local4.aClass246_2, local4.anIntArray480, local4.anIntArray469, local4.anIntArray477, local4.anIntArray472);
		}
	}
}
