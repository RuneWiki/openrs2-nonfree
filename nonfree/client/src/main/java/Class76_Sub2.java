import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class76_Sub2 extends Class76 {

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "F")
	private float aFloat54;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "F")
	private float aFloat55;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "F")
	private float aFloat56;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "F")
	private float aFloat57;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "F")
	private float aFloat58;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "[[Lclient!bs;")
	private Class40[][] aClass40ArrayArray1;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "[[Lclient!us;")
	private Class352[][] aClass352ArrayArray1;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "F")
	private float aFloat59;

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "[[Lclient!rga;")
	private Class299[][] aClass299ArrayArray1;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "F")
	private float aFloat60;

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "[[Lclient!pj;")
	private Class270[][] aClass270ArrayArray1;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "F")
	private float aFloat61;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "F")
	private float aFloat62;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "F")
	private float aFloat63;

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "F")
	private float aFloat64;

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "[[Lclient!hc;")
	private Class134[][] aClass134ArrayArray1;

	@OriginalMember(owner = "client!hn", name = "D", descriptor = "F")
	private float aFloat65;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
	private int anInt3585 = -1;

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "Lclient!ii;")
	private final Class95_Sub2 aClass95_Sub2_6;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
	private final int anInt3584;

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!ii;IIII[[I[[II)V")
	public Class76_Sub2(@OriginalArg(0) Class95_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass95_Sub2_6 = arg0;
		this.anInt3584 = arg2;
		this.aByteArrayArray11 = new byte[arg3 + 1][arg4 + 1];
		@Pc(29) int local29 = this.aClass95_Sub2_6.anInt3858 >> 9;
		for (@Pc(31) int local31 = 1; local31 < arg4; local31++) {
			for (@Pc(34) int local34 = 1; local34 < arg3; local34++) {
				@Pc(53) int local53 = arg6[local34 + 1][local31] - arg6[local34 - 1][local31];
				@Pc(69) int local69 = arg6[local34][local31 + 1] - arg6[local34][local31 - 1];
				@Pc(84) int local84 = (int) Math.sqrt((double) (local53 * local53 + arg7 * 512 + local69 * local69));
				@Pc(90) int local90 = (local53 << 8) / local84;
				@Pc(96) int local96 = arg7 * -512 / local84;
				@Pc(102) int local102 = (local69 << 8) / local84;
				@Pc(124) int local124 = local29 + (this.aClass95_Sub2_6.anInt3867 * local90 + this.aClass95_Sub2_6.anInt3864 * local96 + this.aClass95_Sub2_6.anInt3857 * local102 >> 17);
				local124 >>= 0x1;
				if (local124 < 2) {
					local124 = 2;
				} else if (local124 > 126) {
					local124 = 126;
				}
				this.aByteArrayArray11[local34][local31] = (byte) local124;
			}
		}
		this.aByteArrayArray10 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZLclient!ae;Lclient!vk;[I[I[I[II)V")
	private void method3000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(4) Class364 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class352 local6 = this.aClass352ArrayArray1[arg0][arg1];
		if (arg9 != 0 && (arg9 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(47) int local47;
		@Pc(162) float local162;
		@Pc(183) float local183;
		@Pc(68) float local68;
		@Pc(21) int local21;
		@Pc(89) int local89;
		@Pc(109) int local109;
		if (this.anInt3585 == -1) {
			for (local21 = 0; local21 < local6.aShort125; local21++) {
				local32 = local6.aShortArray144[local21] + (arg0 << super.anInt8795);
				local37 = local6.aShortArray142[local21];
				local47 = local6.aShortArray141[local21] + (arg1 << super.anInt8795);
				local68 = this.aFloat62 + this.aFloat59 * (float) local32 + this.aFloat64 * (float) local37 + this.aFloat58 * (float) local47;
				if (local68 <= (float) this.aClass95_Sub2_6.anInt3865) {
					return;
				}
				arg8[local21] = 0;
				if (arg2) {
					local89 = (int) (local68 - (float) arg3.anInt82);
					if (local89 > 255) {
						local89 = 255;
					}
					if (local89 > 0) {
						arg8[local21] = local89;
						local109 = local6.aShortArray143[local21] * local89 / 255;
						if (local109 > 0) {
							local37 -= local109;
						}
					}
				} else if (arg3.aBoolean10) {
					local89 = (int) (local68 - (float) arg3.anInt82);
					if (local89 > 0) {
						arg8[local21] = local89;
						if (arg8[local21] > 255) {
							arg8[local21] = 255;
						}
					}
				}
				local162 = this.aFloat57 + this.aFloat54 * (float) local32 + this.aFloat56 * (float) local37 + this.aFloat65 * (float) local47;
				local183 = this.aFloat60 + this.aFloat61 * (float) local32 + this.aFloat63 * (float) local37 + this.aFloat55 * (float) local47;
				arg5[local21] = arg4.anInt9731 + (int) (local162 * (float) this.aClass95_Sub2_6.anInt3868 / local68);
				arg6[local21] = arg4.anInt9733 + (int) (local183 * (float) this.aClass95_Sub2_6.anInt3877 / local68);
				arg7[local21] = (int) local68;
			}
		} else {
			for (local21 = 0; local21 < local6.aShort125; local21++) {
				local32 = local6.aShortArray144[local21] + (arg0 << super.anInt8795);
				local37 = local6.aShortArray142[local21];
				local47 = local6.aShortArray141[local21] + (arg1 << super.anInt8795);
				local68 = this.aFloat62 + this.aFloat59 * (float) local32 + this.aFloat64 * (float) local37 + this.aFloat58 * (float) local47;
				arg8[local21] = 0;
				if (arg2) {
					local89 = this.anInt3585 - arg3.anInt82;
					if (local89 > 255) {
						local89 = 255;
					}
					if (local89 > 0) {
						arg8[local21] = local89;
						local109 = local6.aShortArray143[local21] * local89 / 255;
						if (local109 > 0) {
							local37 -= local109;
						}
					}
				} else if (arg3.aBoolean10) {
					local89 = this.anInt3585 - arg3.anInt82;
					if (local89 > 0) {
						arg8[local21] = local89;
						if (arg8[local21] > 255) {
							arg8[local21] = 255;
						}
					}
				}
				local162 = this.aFloat57 + this.aFloat54 * (float) local32 + this.aFloat56 * (float) local37 + this.aFloat65 * (float) local47;
				local183 = this.aFloat60 + this.aFloat61 * (float) local32 + this.aFloat63 * (float) local37 + this.aFloat55 * (float) local47;
				arg5[local21] = arg4.anInt9731 + (int) (local162 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
				arg6[local21] = arg4.anInt9733 + (int) (local183 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
				arg7[local21] = (int) local68;
			}
		}
		@Pc(426) float local426 = (float) super.anInt8792;
		for (local89 = 0; local89 < local6.aShort124; local89++) {
			local109 = local89 * 3;
			@Pc(437) int local437 = local109 + 1;
			@Pc(441) int local441 = local437 + 1;
			@Pc(445) int local445 = arg5[local109];
			@Pc(449) int local449 = arg5[local437];
			@Pc(453) int local453 = arg5[local441];
			@Pc(457) int local457 = arg6[local109];
			@Pc(461) int local461 = arg6[local437];
			@Pc(465) int local465 = arg6[local441];
			if ((local445 - local449) * (local465 - local461) - (local457 - local461) * (local453 - local449) > 0) {
				arg4.aBoolean712 = local445 < 0 || local449 < 0 || local453 < 0 || local445 > arg4.anInt9732 || local449 > arg4.anInt9732 || local453 > arg4.anInt9732;
				if (arg8[local109] + arg8[local437] + arg8[local441] < 765) {
					@Pc(522) int local522 = arg0 << super.anInt8795;
					@Pc(527) int local527 = arg1 << super.anInt8795;
					if ((local6.anIntArray650[local109] & 0xFFFFFF) != 0) {
						if (local6.aShortArray140[local109] == local6.aShortArray140[local437] && local6.aShortArray140[local109] == local6.aShortArray140[local441] && local6.aShortArray139[local109] == local6.aShortArray139[local437] && local6.aShortArray139[local109] == local6.aShortArray139[local441]) {
							arg4.method8149((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], (float) (local522 + local6.aShortArray144[local109]) / (float) local6.aShortArray139[local109], (float) (local522 + local6.aShortArray144[local437]) / (float) local6.aShortArray139[local437], (float) (local522 + local6.aShortArray144[local441]) / (float) local6.aShortArray139[local441], (float) (local527 + local6.aShortArray141[local109]) / (float) local6.aShortArray139[local109], (float) (local527 + local6.aShortArray141[local437]) / (float) local6.aShortArray139[local437], (float) (local527 + local6.aShortArray141[local441]) / (float) local6.aShortArray139[local441], local6.anIntArray650[local109], local6.anIntArray650[local437], local6.anIntArray650[local441], arg3.anInt83, arg8[local109], arg8[local437], arg8[local441], local6.aShortArray140[local109]);
						} else {
							arg4.method8139((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], (float) (local522 + local6.aShortArray144[local109]) / local426, (float) (local522 + local6.aShortArray144[local437]) / local426, (float) (local522 + local6.aShortArray144[local441]) / local426, (float) (local527 + local6.aShortArray141[local109]) / local426, (float) (local527 + local6.aShortArray141[local437]) / local426, (float) (local527 + local6.aShortArray141[local441]) / local426, local6.anIntArray650[local109], local6.anIntArray650[local437], local6.anIntArray650[local441], arg3.anInt83, arg8[local109], arg8[local437], arg8[local441], local6.aShortArray140[local109], local426 / (float) local6.aShortArray139[local109], local6.aShortArray140[local437], local426 / (float) local6.aShortArray139[local437], local6.aShortArray140[local441], local426 / (float) local6.aShortArray139[local441]);
						}
					}
				} else {
					arg4.method8137((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], arg3.anInt83);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(III)V")
	private void method3001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class5 local4 = this.aClass95_Sub2_6.method3302(Thread.currentThread());
		local4.aClass364_1.anInt9734 = 0;
		if (this.aClass134ArrayArray1 != null) {
			this.method3006(arg0, arg1, local4.aBoolean9, local4, local4.aClass364_1, local4.anIntArray25, local4.anIntArray10, local4.anIntArray12, local4.anIntArray21, arg2);
		} else if (this.aClass270ArrayArray1 != null) {
			this.method3002(arg0, arg1, local4.aClass364_1, local4.anIntArray25, local4.anIntArray10, local4.anIntArray12, local4.anIntArray21, arg2);
		} else if (this.aClass352ArrayArray1 != null) {
			this.method3000(arg0, arg1, local4.aBoolean9, local4, local4.aClass364_1, local4.anIntArray25, local4.anIntArray10, local4.anIntArray12, local4.anIntArray21, arg2);
		}
	}

	@OriginalMember(owner = "client!hn", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILclient!vk;[I[I[I[II)V")
	private void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class364 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7) {
		@Pc(6) Class270 local6 = this.aClass270ArrayArray1[arg0][arg1];
		@Pc(41) int local41;
		@Pc(51) int local51;
		@Pc(467) int local467;
		@Pc(497) int local497;
		if (local6 == null) {
			@Pc(2129) Class299 local2129 = this.aClass299ArrayArray1[arg0][arg1];
			if (local2129 != null) {
				if (arg7 != 0) {
					if ((local2129.aByte109 & 0x4) == 0) {
						if ((arg7 & 0x2) != 0) {
							return;
						}
					} else if ((arg7 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2170) short local2170;
				@Pc(2230) float local2230;
				@Pc(2251) float local2251;
				@Pc(2201) float local2201;
				if (this.anInt3585 == -1) {
					for (local467 = 0; local467 < local2129.aShort108; local467++) {
						local41 = local2129.aShortArray115[local467] + (arg0 << super.anInt8795);
						local2170 = local2129.aShortArray111[local467];
						local51 = local2129.aShortArray117[local467] + (arg1 << super.anInt8795);
						local2201 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local2170 + this.aFloat58 * (float) local51;
						if (local2201 <= (float) this.aClass95_Sub2_6.anInt3865) {
							return;
						}
						local2230 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local2170 + this.aFloat65 * (float) local51;
						local2251 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local2170 + this.aFloat55 * (float) local51;
						arg3[local467] = arg2.anInt9731 + (int) (local2230 * (float) this.aClass95_Sub2_6.anInt3868 / local2201);
						arg4[local467] = arg2.anInt9733 + (int) (local2251 * (float) this.aClass95_Sub2_6.anInt3877 / local2201);
						arg5[local467] = (int) local2201;
					}
				} else {
					for (local467 = 0; local467 < local2129.aShort108; local467++) {
						local41 = local2129.aShortArray115[local467] + (arg0 << super.anInt8795);
						local2170 = local2129.aShortArray111[local467];
						local51 = local2129.aShortArray117[local467] + (arg1 << super.anInt8795);
						local2201 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local2170 + this.aFloat58 * (float) local51;
						local2230 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local2170 + this.aFloat65 * (float) local51;
						local2251 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local2170 + this.aFloat55 * (float) local51;
						arg3[local467] = arg2.anInt9731 + (int) (local2230 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
						arg4[local467] = arg2.anInt9733 + (int) (local2251 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
						arg5[local467] = (int) local2201;
					}
				}
				@Pc(2442) short local2442;
				@Pc(2447) short local2447;
				@Pc(2452) short local2452;
				@Pc(2460) int local2460;
				@Pc(2464) int local2464;
				@Pc(2468) int local2468;
				@Pc(2472) int local2472;
				@Pc(2476) int local2476;
				if (local2129.aShortArray113 != null) {
					@Pc(2650) int local2650;
					@Pc(2520) short local2520;
					if (this.anInt3585 == -1) {
						for (local467 = 0; local467 < local2129.aShort107; local467++) {
							local2442 = local2129.aShortArray114[local467];
							local2447 = local2129.aShortArray116[local467];
							local2452 = local2129.aShortArray110[local467];
							local497 = arg3[local2442];
							local2460 = arg3[local2447];
							local2464 = arg3[local2452];
							local2468 = arg4[local2442];
							local2472 = arg4[local2447];
							local2476 = arg4[local2452];
							if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
								arg2.aBoolean712 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt9732 || local2460 > arg2.anInt9732 || local2464 > arg2.anInt9732;
								local2520 = local2129.aShortArray113[local467];
								if (local2520 == -1) {
									local2650 = local2129.anIntArray565[local467];
									if (local2650 != -1) {
										arg2.method8141((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static253.method3518(local2650, local2129.aShortArray112[local2442]), (float) Static253.method3518(local2650, local2129.aShortArray112[local2447]), (float) Static253.method3518(local2650, local2129.aShortArray112[local2452]));
									}
								} else {
									arg2.method8149((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) local2129.aShortArray115[local2442] / (float) super.anInt8792, (float) local2129.aShortArray115[local2447] / (float) super.anInt8792, (float) local2129.aShortArray115[local2452] / (float) super.anInt8792, (float) local2129.aShortArray117[local2442] / (float) super.anInt8792, (float) local2129.aShortArray117[local2447] / (float) super.anInt8792, (float) local2129.aShortArray117[local2452] / (float) super.anInt8792, Static486.anIntArray562[local2129.aShortArray112[local2442] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local2129.aShortArray112[local2447] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local2129.aShortArray112[local2452] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2520);
								}
							}
						}
						return;
					}
					for (local467 = 0; local467 < local2129.aShort107; local467++) {
						local2442 = local2129.aShortArray114[local467];
						local2447 = local2129.aShortArray116[local467];
						local2452 = local2129.aShortArray110[local467];
						local497 = arg3[local2442];
						local2460 = arg3[local2447];
						local2464 = arg3[local2452];
						local2468 = arg4[local2442];
						local2472 = arg4[local2447];
						local2476 = arg4[local2452];
						if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
							arg2.aBoolean712 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt9732 || local2460 > arg2.anInt9732 || local2464 > arg2.anInt9732;
							local2520 = local2129.aShortArray113[local467];
							if (local2520 == -1) {
								local2650 = local2129.anIntArray565[local467];
								if (local2650 != -1) {
									arg2.method8141((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static253.method3518(local2650, local2129.aShortArray112[local2442]), (float) Static253.method3518(local2650, local2129.aShortArray112[local2447]), (float) Static253.method3518(local2650, local2129.aShortArray112[local2452]));
								}
							} else {
								arg2.method8149((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) local2129.aShortArray115[local2442] / (float) super.anInt8792, (float) local2129.aShortArray115[local2447] / (float) super.anInt8792, (float) local2129.aShortArray115[local2452] / (float) super.anInt8792, (float) local2129.aShortArray117[local2442] / (float) super.anInt8792, (float) local2129.aShortArray117[local2447] / (float) super.anInt8792, (float) local2129.aShortArray117[local2452] / (float) super.anInt8792, Static486.anIntArray562[local2129.aShortArray112[local2442] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local2129.aShortArray112[local2447] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local2129.aShortArray112[local2452] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2520);
							}
						}
					}
					return;
				}
				for (local467 = 0; local467 < local2129.aShort107; local467++) {
					local2442 = local2129.aShortArray114[local467];
					local2447 = local2129.aShortArray116[local467];
					local2452 = local2129.aShortArray110[local467];
					local497 = arg3[local2442];
					local2460 = arg3[local2447];
					local2464 = arg3[local2452];
					local2468 = arg4[local2442];
					local2472 = arg4[local2447];
					local2476 = arg4[local2452];
					if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
						@Pc(3047) int local3047 = local2129.anIntArray565[local467];
						if (local3047 != -1) {
							arg2.aBoolean712 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt9732 || local2460 > arg2.anInt9732 || local2464 > arg2.anInt9732;
							arg2.method8141((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static253.method3518(local3047, local2129.aShortArray112[local2442]), (float) Static253.method3518(local3047, local2129.aShortArray112[local2447]), (float) Static253.method3518(local3047, local2129.aShortArray112[local2452]));
						}
					}
				}
			}
		} else if ((local6.aByte99 & 0x2) == 0) {
			if (arg7 != 0) {
				if ((local6.aByte99 & 0x4) == 0) {
					if ((arg7 & 0x2) != 0) {
						return;
					}
				} else if ((arg7 & 0x1) != 0) {
					return;
				}
			}
			@Pc(36) int local36 = arg0 * super.anInt8792;
			local41 = local36 + super.anInt8792;
			@Pc(46) int local46 = arg1 * super.anInt8792;
			local51 = local46 + super.anInt8792;
			@Pc(484) float local484;
			@Pc(90) float local90;
			@Pc(115) float local115;
			@Pc(140) float local140;
			@Pc(165) float local165;
			@Pc(63) int local63;
			@Pc(287) int local287;
			@Pc(347) int local347;
			@Pc(407) int local407;
			@Pc(317) int local317;
			@Pc(377) int local377;
			@Pc(437) int local437;
			@Pc(274) float local274;
			@Pc(334) float local334;
			@Pc(394) float local394;
			@Pc(454) float local454;
			@Pc(304) float local304;
			@Pc(364) float local364;
			@Pc(424) float local424;
			if ((local6.aByte99 & 0x1) == 0) {
				local63 = super.anIntArrayArray56[arg0][arg1];
				@Pc(771) int local771 = super.anIntArrayArray56[arg0 + 1][arg1];
				@Pc(782) int local782 = super.anIntArrayArray56[arg0 + 1][arg1 + 1];
				@Pc(791) int local791 = super.anIntArrayArray56[arg0][arg1 + 1];
				if (this.anInt3585 == -1) {
					local90 = this.aFloat62 + this.aFloat59 * (float) local36 + this.aFloat64 * (float) local63 + this.aFloat58 * (float) local46;
					if (local90 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local115 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local771 + this.aFloat58 * (float) local46;
					if (local115 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local140 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local782 + this.aFloat58 * (float) local51;
					if (local140 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local165 = this.aFloat62 + this.aFloat59 * (float) local36 + this.aFloat64 * (float) local791 + this.aFloat58 * (float) local51;
					if (local165 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local274 = this.aFloat57 + this.aFloat54 * (float) local36 + this.aFloat56 * (float) local63 + this.aFloat65 * (float) local46;
					local287 = arg2.anInt9731 + (int) (local274 * (float) this.aClass95_Sub2_6.anInt3868 / local90);
					local304 = this.aFloat60 + this.aFloat61 * (float) local36 + this.aFloat63 * (float) local63 + this.aFloat55 * (float) local46;
					local317 = arg2.anInt9733 + (int) (local304 * (float) this.aClass95_Sub2_6.anInt3877 / local90);
					local334 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local771 + this.aFloat65 * (float) local46;
					local347 = arg2.anInt9731 + (int) (local334 * (float) this.aClass95_Sub2_6.anInt3868 / local115);
					local364 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local771 + this.aFloat55 * (float) local46;
					local377 = arg2.anInt9733 + (int) (local364 * (float) this.aClass95_Sub2_6.anInt3877 / local115);
					local394 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local782 + this.aFloat65 * (float) local51;
					local407 = arg2.anInt9731 + (int) (local394 * (float) this.aClass95_Sub2_6.anInt3868 / local140);
					local424 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local782 + this.aFloat55 * (float) local51;
					local437 = arg2.anInt9733 + (int) (local424 * (float) this.aClass95_Sub2_6.anInt3877 / local140);
					local454 = this.aFloat57 + this.aFloat54 * (float) local36 + this.aFloat56 * (float) local791 + this.aFloat65 * (float) local51;
					local467 = arg2.anInt9731 + (int) (local454 * (float) this.aClass95_Sub2_6.anInt3868 / local165);
					local484 = this.aFloat60 + this.aFloat61 * (float) local36 + this.aFloat63 * (float) local791 + this.aFloat55 * (float) local51;
					local497 = arg2.anInt9733 + (int) (local484 * (float) this.aClass95_Sub2_6.anInt3877 / local165);
				} else {
					local90 = this.aFloat62 + this.aFloat59 * (float) local36 + this.aFloat64 * (float) local63 + this.aFloat58 * (float) local46;
					local115 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local771 + this.aFloat58 * (float) local46;
					local140 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local782 + this.aFloat58 * (float) local51;
					local165 = this.aFloat62 + this.aFloat59 * (float) local36 + this.aFloat64 * (float) local791 + this.aFloat58 * (float) local51;
					local274 = this.aFloat57 + this.aFloat54 * (float) local36 + this.aFloat56 * (float) local63 + this.aFloat65 * (float) local46;
					local287 = arg2.anInt9731 + (int) (local274 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local304 = this.aFloat60 + this.aFloat61 * (float) local36 + this.aFloat63 * (float) local63 + this.aFloat55 * (float) local46;
					local317 = arg2.anInt9733 + (int) (local304 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local334 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local771 + this.aFloat65 * (float) local46;
					local347 = arg2.anInt9731 + (int) (local334 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local364 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local771 + this.aFloat55 * (float) local46;
					local377 = arg2.anInt9733 + (int) (local364 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local394 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local782 + this.aFloat65 * (float) local51;
					local407 = arg2.anInt9731 + (int) (local394 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local424 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local782 + this.aFloat55 * (float) local51;
					local437 = arg2.anInt9733 + (int) (local424 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local454 = this.aFloat57 + this.aFloat54 * (float) local36 + this.aFloat56 * (float) local791 + this.aFloat65 * (float) local51;
					local467 = arg2.anInt9731 + (int) (local454 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local484 = this.aFloat60 + this.aFloat61 * (float) local36 + this.aFloat63 * (float) local791 + this.aFloat55 * (float) local51;
					local497 = arg2.anInt9733 + (int) (local484 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
				}
			} else {
				local63 = super.anIntArrayArray56[arg0][arg1];
				@Pc(69) float local69 = this.aFloat64 * (float) local63;
				if (this.anInt3585 == -1) {
					local90 = this.aFloat62 + this.aFloat59 * (float) local36 + local69 + this.aFloat58 * (float) local46;
					if (local90 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local115 = this.aFloat62 + this.aFloat59 * (float) local41 + local69 + this.aFloat58 * (float) local46;
					if (local115 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local140 = this.aFloat62 + this.aFloat59 * (float) local41 + local69 + this.aFloat58 * (float) local51;
					if (local140 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local165 = this.aFloat62 + this.aFloat59 * (float) local36 + local69 + this.aFloat58 * (float) local51;
					if (local165 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
				} else {
					local90 = this.aFloat62 + this.aFloat59 * (float) local36 + local69 + this.aFloat58 * (float) local46;
					local115 = this.aFloat62 + this.aFloat59 * (float) local41 + local69 + this.aFloat58 * (float) local46;
					local140 = this.aFloat62 + this.aFloat59 * (float) local41 + local69 + this.aFloat58 * (float) local51;
					local165 = this.aFloat62 + this.aFloat59 * (float) local36 + local69 + this.aFloat58 * (float) local51;
				}
				@Pc(247) float local247 = this.aFloat56 * (float) local63;
				@Pc(253) float local253 = this.aFloat63 * (float) local63;
				if (this.anInt3585 == -1) {
					local274 = this.aFloat57 + this.aFloat54 * (float) local36 + local247 + this.aFloat65 * (float) local46;
					local287 = arg2.anInt9731 + (int) (local274 * (float) this.aClass95_Sub2_6.anInt3868 / local90);
					local304 = this.aFloat60 + this.aFloat61 * (float) local36 + local253 + this.aFloat55 * (float) local46;
					local317 = arg2.anInt9733 + (int) (local304 * (float) this.aClass95_Sub2_6.anInt3877 / local90);
					local334 = this.aFloat57 + this.aFloat54 * (float) local41 + local247 + this.aFloat65 * (float) local46;
					local347 = arg2.anInt9731 + (int) (local334 * (float) this.aClass95_Sub2_6.anInt3868 / local115);
					local364 = this.aFloat60 + this.aFloat61 * (float) local41 + local253 + this.aFloat55 * (float) local46;
					local377 = arg2.anInt9733 + (int) (local364 * (float) this.aClass95_Sub2_6.anInt3877 / local115);
					local394 = this.aFloat57 + this.aFloat54 * (float) local41 + local247 + this.aFloat65 * (float) local51;
					local407 = arg2.anInt9731 + (int) (local394 * (float) this.aClass95_Sub2_6.anInt3868 / local140);
					local424 = this.aFloat60 + this.aFloat61 * (float) local41 + local253 + this.aFloat55 * (float) local51;
					local437 = arg2.anInt9733 + (int) (local424 * (float) this.aClass95_Sub2_6.anInt3877 / local140);
					local454 = this.aFloat57 + this.aFloat54 * (float) local36 + local247 + this.aFloat65 * (float) local51;
					local467 = arg2.anInt9731 + (int) (local454 * (float) this.aClass95_Sub2_6.anInt3868 / local165);
					local484 = this.aFloat60 + this.aFloat61 * (float) local36 + local253 + this.aFloat55 * (float) local51;
					local497 = arg2.anInt9733 + (int) (local484 * (float) this.aClass95_Sub2_6.anInt3877 / local165);
				} else {
					local274 = this.aFloat57 + this.aFloat54 * (float) local36 + local247 + this.aFloat65 * (float) local46;
					local287 = arg2.anInt9731 + (int) (local274 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local304 = this.aFloat60 + this.aFloat61 * (float) local36 + local253 + this.aFloat55 * (float) local46;
					local317 = arg2.anInt9733 + (int) (local304 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local334 = this.aFloat57 + this.aFloat54 * (float) local41 + local247 + this.aFloat65 * (float) local46;
					local347 = arg2.anInt9731 + (int) (local334 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local364 = this.aFloat60 + this.aFloat61 * (float) local41 + local253 + this.aFloat55 * (float) local46;
					local377 = arg2.anInt9733 + (int) (local364 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local394 = this.aFloat57 + this.aFloat54 * (float) local41 + local247 + this.aFloat65 * (float) local51;
					local407 = arg2.anInt9731 + (int) (local394 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local424 = this.aFloat60 + this.aFloat61 * (float) local41 + local253 + this.aFloat55 * (float) local51;
					local437 = arg2.anInt9733 + (int) (local424 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local454 = this.aFloat57 + this.aFloat54 * (float) local36 + local247 + this.aFloat65 * (float) local51;
					local467 = arg2.anInt9731 + (int) (local454 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local484 = this.aFloat60 + this.aFloat61 * (float) local36 + local253 + this.aFloat55 * (float) local51;
					local497 = arg2.anInt9733 + (int) (local484 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
				}
			}
			if (this.anInt3585 == -1) {
				if ((local407 - local467) * (local377 - local497) - (local437 - local497) * (local347 - local467) > 0) {
					arg2.aBoolean712 = local407 < 0 || local467 < 0 || local347 < 0 || local407 > arg2.anInt9732 || local467 > arg2.anInt9732 || local347 > arg2.anInt9732;
					if (local6.aShort95 >= 0) {
						arg2.method8149((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, local140, local165, local115, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static486.anIntArray562[local6.aShort96 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local6.aShort97 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local6.aShort98 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort95);
					} else {
						arg2.method8141((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, (float) local140, (float) local165, (float) local115, (float) (local6.aShort96 & 0xFFFF), (float) (local6.aShort97 & 0xFFFF), (float) (local6.aShort98 & 0xFFFF));
					}
				}
				if ((local287 - local347) * (local497 - local377) - (local317 - local377) * (local467 - local347) > 0) {
					arg2.aBoolean712 = local287 < 0 || local347 < 0 || local467 < 0 || local287 > arg2.anInt9732 || local347 > arg2.anInt9732 || local467 > arg2.anInt9732;
					if (local6.aShort95 >= 0) {
						arg2.method8149((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, local90, local115, local165, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static486.anIntArray562[local6.aShort99 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local6.aShort98 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local6.aShort97 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort95);
						return;
					}
					arg2.method8141((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, (float) local90, (float) local115, (float) local165, (float) (local6.aShort99 & 0xFFFF), (float) (local6.aShort98 & 0xFFFF), (float) (local6.aShort97 & 0xFFFF));
					return;
				}
			} else {
				if ((local407 - local467) * (local377 - local497) - (local437 - local497) * (local347 - local467) > 0) {
					arg2.aBoolean712 = local407 < 0 || local467 < 0 || local347 < 0 || local407 > arg2.anInt9732 || local467 > arg2.anInt9732 || local347 > arg2.anInt9732;
					if (local6.aShort95 >= 0) {
						arg2.method8149((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, local140, local165, local115, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static486.anIntArray562[local6.aShort96 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local6.aShort97 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local6.aShort98 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort95);
					} else {
						arg2.method8141((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, (float) local140, (float) local165, (float) local115, (float) (local6.aShort96 & 0xFFFF), (float) (local6.aShort97 & 0xFFFF), (float) (local6.aShort98 & 0xFFFF));
					}
				}
				if ((local287 - local347) * (local497 - local377) - (local317 - local377) * (local467 - local347) > 0) {
					arg2.aBoolean712 = local287 < 0 || local347 < 0 || local467 < 0 || local287 > arg2.anInt9732 || local347 > arg2.anInt9732 || local467 > arg2.anInt9732;
					if (local6.aShort95 >= 0) {
						arg2.method8149((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, local90, local115, local165, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static486.anIntArray562[local6.aShort99 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local6.aShort98 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static486.anIntArray562[local6.aShort97 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort95);
						return;
					}
					arg2.method8141((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, (float) local90, (float) local115, (float) local165, (float) (local6.aShort99 & 0xFFFF), (float) (local6.aShort98 & 0xFFFF), (float) (local6.aShort97 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub2_Sub19 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub19 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIII[[ZLclient!ae;Lclient!vk;[I[I)V")
	private void method3003(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class5 arg5, @OriginalArg(9) Class364 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean8;
		this.aClass95_Sub2_6.C(false);
		arg6.aBoolean714 = false;
		arg6.aBoolean715 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(79) int local79;
					if (this.aClass270ArrayArray1[local32][local35] != null) {
						@Pc(60) Class270 local60 = this.aClass270ArrayArray1[local32][local35];
						if (local60.aShort95 != -1 && (local60.aByte99 & 0x2) == 0 && local60.anInt7012 == -1) {
							local79 = this.aClass95_Sub2_6.method3306(local60.aShort95);
							arg6.method8141((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static253.method3518(local79, local60.aShort96 & 0xFFFF), (float) Static253.method3518(local79, local60.aShort97 & 0xFFFF), (float) Static253.method3518(local79, local60.aShort98 & 0xFFFF));
							arg6.method8141((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static253.method3518(local79, local60.aShort99 & 0xFFFF), (float) Static253.method3518(local79, local60.aShort98 & 0xFFFF), (float) Static253.method3518(local79, local60.aShort97 & 0xFFFF));
						} else if (local60.anInt7012 == -1) {
							arg6.method8141((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) (local60.aShort96 & 0xFFFF), (float) (local60.aShort97 & 0xFFFF), (float) (local60.aShort98 & 0xFFFF));
							arg6.method8141((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local60.aShort99 & 0xFFFF), (float) (local60.aShort98 & 0xFFFF), (float) (local60.aShort97 & 0xFFFF));
						} else {
							local79 = local60.anInt7012;
							arg6.method8141((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) local79, (float) local79, (float) local79);
							arg6.method8141((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) local79, (float) local79, (float) local79);
						}
					} else if (this.aClass299ArrayArray1[local32][local35] != null) {
						@Pc(331) Class299 local331 = this.aClass299ArrayArray1[local32][local35];
						for (local79 = 0; local79 < local331.aShort108; local79++) {
							arg7[local79] = local26 + local331.aShortArray115[local79] * 4 / super.anInt8792;
							arg8[local79] = local30 - local331.aShortArray117[local79] * 4 / super.anInt8792;
						}
						for (@Pc(369) int local369 = 0; local369 < local331.aShort107; local369++) {
							@Pc(375) short local375 = local331.aShortArray114[local369];
							@Pc(380) short local380 = local331.aShortArray116[local369];
							@Pc(385) short local385 = local331.aShortArray110[local369];
							@Pc(389) int local389 = arg7[local375];
							@Pc(393) int local393 = arg7[local380];
							@Pc(397) int local397 = arg7[local385];
							@Pc(401) int local401 = arg8[local375];
							@Pc(405) int local405 = arg8[local380];
							@Pc(409) int local409 = arg8[local385];
							@Pc(423) int local423;
							if (local331.anIntArray566 != null && local331.anIntArray566[local369] != -1) {
								local423 = local331.anIntArray566[local369];
								arg6.method8141((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static253.method3518(local423, local331.aShortArray112[local375]), (float) Static253.method3518(local423, local331.aShortArray112[local380]), (float) Static253.method3518(local423, local331.aShortArray112[local385]));
							} else if (local331.aShortArray113 == null || local331.aShortArray113[local369] == -1) {
								local423 = local331.anIntArray565[local369];
								arg6.method8141((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static253.method3518(local423, local331.aShortArray112[local375]), (float) Static253.method3518(local423, local331.aShortArray112[local380]), (float) Static253.method3518(local423, local331.aShortArray112[local385]));
							} else {
								local423 = this.aClass95_Sub2_6.method3306(local331.aShortArray113[local369]);
								arg6.method8141((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static253.method3518(local423, local331.aShortArray112[local375]), (float) Static253.method3518(local423, local331.aShortArray112[local380]), (float) Static253.method3518(local423, local331.aShortArray112[local385]));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean714 = true;
		this.aClass95_Sub2_6.C(local14);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(IIIIIII[[ZLclient!ae;Lclient!vk;[I[I)V")
	private void method3004(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class5 arg5, @OriginalArg(9) Class364 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean8;
		this.aClass95_Sub2_6.C(false);
		arg6.aBoolean714 = false;
		arg6.aBoolean715 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(81) int local81;
					@Pc(370) int local370;
					@Pc(375) int local375;
					@Pc(379) int local379;
					@Pc(383) int local383;
					@Pc(387) int local387;
					@Pc(391) int local391;
					@Pc(395) int local395;
					@Pc(399) int local399;
					@Pc(403) int local403;
					@Pc(407) int local407;
					@Pc(432) int local432;
					if (this.aClass134ArrayArray1 == null) {
						if (this.aClass352ArrayArray1[local32][local35] != null) {
							@Pc(573) Class352 local573 = this.aClass352ArrayArray1[local32][local35];
							for (local81 = 0; local81 < local573.aShort125; local81++) {
								arg7[local81] = local26 + local573.aShortArray144[local81] * 4 / super.anInt8792;
								arg8[local81] = local30 - local573.aShortArray141[local81] * 4 / super.anInt8792;
							}
							for (local370 = 0; local370 < local573.aShort124; local370++) {
								local375 = local370 * 3;
								local379 = local375 + 1;
								local383 = local379 + 1;
								local387 = arg7[local375];
								local391 = arg7[local379];
								local395 = arg7[local383];
								local399 = arg8[local375];
								local403 = arg8[local379];
								local407 = arg8[local383];
								if (local573.anIntArray651 == null || local573.anIntArray651[local370] == 0) {
									arg6.method8145((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local573.anIntArray650[local375], local573.anIntArray650[local379], local573.anIntArray650[local383]);
								} else {
									local432 = local573.anIntArray651[local370];
									arg6.method8145((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local432, local432, local432);
								}
							}
						}
					} else if (this.aClass134ArrayArray1[local32][local35] != null) {
						@Pc(63) Class134 local63 = this.aClass134ArrayArray1[local32][local35];
						if (local63.aShort35 != -1 && (local63.aByte39 & 0x2) == 0 && local63.anInt3412 == 0) {
							local81 = this.aClass95_Sub2_6.method3306(local63.aShort35);
							arg6.method8141((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static253.method3518(local81, local63.anInt3410), (float) Static253.method3518(local81, local63.anInt3408), (float) Static253.method3518(local81, local63.anInt3411));
							arg6.method8141((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static253.method3518(local81, local63.anInt3409), (float) Static253.method3518(local81, local63.anInt3411), (float) Static253.method3518(local81, local63.anInt3408));
						} else if (local63.anInt3412 == 0) {
							arg6.method8145((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, local63.anInt3410, local63.anInt3408, local63.anInt3411);
							arg6.method8145((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, local63.anInt3409, local63.anInt3411, local63.anInt3408);
						} else {
							local81 = local63.anInt3412;
							arg6.method8145((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, Static206.method2914(local81, local63.anInt3410 & 0xFF000000), Static206.method2914(local81, local63.anInt3408 & 0xFF000000), Static206.method2914(local81, local63.anInt3411 & 0xFF000000));
							arg6.method8145((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, Static206.method2914(local81, local63.anInt3409 & 0xFF000000), Static206.method2914(local81, local63.anInt3411 & 0xFF000000), Static206.method2914(local81, local63.anInt3408 & 0xFF000000));
						}
					} else if (this.aClass40ArrayArray1[local32][local35] != null) {
						@Pc(332) Class40 local332 = this.aClass40ArrayArray1[local32][local35];
						for (local81 = 0; local81 < local332.aShort15; local81++) {
							arg7[local81] = local26 + local332.aShortArray20[local81] * 4 / super.anInt8792;
							arg8[local81] = local30 - local332.aShortArray17[local81] * 4 / super.anInt8792;
						}
						for (local370 = 0; local370 < local332.aShort16; local370++) {
							local375 = local370 * 3;
							local379 = local375 + 1;
							local383 = local379 + 1;
							local387 = arg7[local375];
							local391 = arg7[local379];
							local395 = arg7[local383];
							local399 = arg8[local375];
							local403 = arg8[local379];
							local407 = arg8[local383];
							if (local332.anIntArray87 != null && local332.anIntArray87[local370] != 0 && (local332.aShortArray18 == null || local332.aShortArray18 != null && local332.aShortArray18[local370] == -1)) {
								local432 = local332.anIntArray87[local370];
								arg6.method8145((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, Static206.method2914(local432, -(local332.anIntArray88[local375] & -16777216) - 16777216), Static206.method2914(local432, -(local332.anIntArray88[local379] & -16777216) - 16777216), Static206.method2914(local432, -(local332.anIntArray88[local383] & -16777216) - 16777216));
							} else if (local332.aShortArray18 == null || local332.aShortArray18[local370] == -1) {
								arg6.method8145((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local332.anIntArray88[local375], local332.anIntArray88[local379], local332.anIntArray88[local383]);
							} else {
								local432 = this.aClass95_Sub2_6.method3306(local332.aShortArray18[local370]);
								arg6.method8141((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, (float) local432, (float) local432, (float) local432);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean714 = true;
		this.aClass95_Sub2_6.C(local14);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z")
	private boolean method3005(@OriginalArg(0) int arg0) {
		if ((this.anInt3584 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!hn", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(8) boolean local8 = (this.anInt3584 & 0x20) == 0;
		if (this.aClass134ArrayArray1 == null && !local8) {
			this.aClass134ArrayArray1 = new Class134[super.anInt8791][super.anInt8794];
			this.aClass40ArrayArray1 = new Class40[super.anInt8791][super.anInt8794];
		} else if (this.aClass352ArrayArray1 == null && local8) {
			this.aClass352ArrayArray1 = new Class352[super.anInt8791][super.anInt8794];
		} else if (this.aClass270ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < arg6.length; local56++) {
			if (arg6[local56] == -1) {
				arg6[local56] = 0;
			} else {
				arg6[local56] = Static486.anIntArray562[Static261.method3559(arg6[local56]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(92) int local92 = 0; local92 < arg7.length; local92++) {
				if (arg7[local92] == -1) {
					arg7[local92] = 0;
				} else {
					arg7[local92] = Static486.anIntArray562[Static261.method3559(arg7[local92]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(186) int local186;
		@Pc(191) int local191;
		@Pc(195) int local195;
		@Pc(215) int local215;
		@Pc(336) int local336;
		@Pc(383) int local383;
		@Pc(467) int local467;
		@Pc(499) int local499;
		if (local8) {
			@Pc(130) Class352 local130 = new Class352();
			local130.aShort125 = (short) arg2.length;
			local130.aShort124 = (short) (arg2.length / 3);
			local130.aShortArray144 = new short[local130.aShort125];
			local130.aShortArray142 = new short[local130.aShort125];
			local130.aShortArray141 = new short[local130.aShort125];
			local130.anIntArray650 = new int[local130.aShort125];
			local130.aShortArray140 = new short[local130.aShort125];
			local130.aShortArray139 = new short[local130.aShort125];
			local130.aByteArray113 = new byte[local130.aShort125];
			if (arg5 != null) {
				local130.aShortArray143 = new short[local130.aShort125];
			}
			for (local186 = 0; local186 < local130.aShort125; local186++) {
				local191 = arg2[local186];
				local195 = arg4[local186];
				if (local191 == 0 && local195 == 0) {
					local215 = this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1];
				} else if (local191 == 0 && local195 == super.anInt8792) {
					local215 = this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1];
				} else if (local191 == super.anInt8792 && local195 == super.anInt8792) {
					local215 = this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1];
				} else if (local191 == super.anInt8792 && local195 == 0) {
					local215 = this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1];
				} else {
					local336 = (this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]) * (super.anInt8792 - local191) + (this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]) * local191;
					local383 = (this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]) * (super.anInt8792 - local191) + (this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]) * local191;
					local215 = local336 * (super.anInt8792 - local195) + local383 * local195 >> super.anInt8795 * 2;
				}
				local336 = (arg0 << super.anInt8795) + local191;
				local383 = (arg1 << super.anInt8795) + local195;
				local130.aShortArray144[local186] = (short) local191;
				local130.aShortArray141[local186] = (short) local195;
				local130.aShortArray142[local186] = (short) (this.method7398(local336, local383) + (arg3 == null ? 0 : arg3[local186]));
				if (local215 < 0) {
					local215 = 0;
				}
				if (arg6[local186] == 0) {
					local130.anIntArray650[local186] = 0;
					if (arg7 != null) {
						local130.aByteArray113[local186] = (byte) local215;
					}
				} else {
					local467 = 0;
					if (arg5 != null) {
						@Pc(479) short local479 = local130.aShortArray143[local186] = (short) arg5[local186];
						if (arg11 != 0) {
							local467 = local479 * 255 / arg11;
							if (local467 < 0) {
								local467 = 0;
							} else if (local467 > 255) {
								local467 = 255;
							}
						}
					}
					local499 = -16777216;
					if (arg8[local186] != -1 && this.method3005(this.aClass95_Sub2_6.anInterface6_27.method1492(arg8[local186]).aByte52)) {
						local499 = -1694498816;
					}
					local130.anIntArray650[local186] = local499 | Static587.method8011(Static650.method2999(arg6[local186] >> 8, local215), local467, arg10);
					if (arg7 != null) {
						local130.aByteArray113[local186] = (byte) local215;
					}
				}
				local130.aShortArray140[local186] = (short) arg8[local186];
				local130.aShortArray139[local186] = (short) arg9[local186];
			}
			if (arg7 != null) {
				local130.anIntArray651 = new int[local130.aShort124];
			}
			for (local191 = 0; local191 < local130.aShort124; local191++) {
				local195 = local191 * 3;
				if (arg7 != null && arg7[local195] != 0) {
					local130.anIntArray651[local191] = arg7[local195] >> 8 | 0xFF000000;
				}
			}
			this.aClass352ArrayArray1[arg0][arg1] = local130;
			return;
		}
		@Pc(610) boolean local610 = true;
		local186 = -1;
		local191 = -1;
		local195 = -1;
		local215 = -1;
		if (arg2.length == 6) {
			for (local336 = 0; local336 < 6; local336++) {
				if (arg2[local336] == 0 && arg4[local336] == 0) {
					if (local186 != -1 && arg6[local186] != arg6[local336]) {
						local610 = false;
						break;
					}
					local186 = local336;
				} else if (arg2[local336] == super.anInt8792 && arg4[local336] == 0) {
					if (local191 != -1 && arg6[local191] != arg6[local336]) {
						local610 = false;
						break;
					}
					local191 = local336;
				} else if (arg2[local336] == super.anInt8792 && arg4[local336] == super.anInt8792) {
					if (local195 != -1 && arg6[local195] != arg6[local336]) {
						local610 = false;
						break;
					}
					local195 = local336;
				} else if (arg2[local336] == 0 && arg4[local336] == super.anInt8792) {
					if (local215 != -1 && arg6[local215] != arg6[local336]) {
						local610 = false;
						break;
					}
					local215 = local336;
				}
			}
			if (local186 == -1 || local191 == -1 || local195 == -1 || local215 == -1) {
				local610 = false;
			}
			if (local610) {
				if (arg3 != null) {
					for (local383 = 0; local383 < 4; local383++) {
						if (arg3[local383] != 0) {
							local610 = false;
							break;
						}
					}
				}
				if (local610) {
					for (local383 = 1; local383 < 4; local383++) {
						if (arg2[local383] != arg2[0] && arg2[local383] != arg2[0] + super.anInt8792 && arg2[local383] != arg2[0] - super.anInt8792) {
							local610 = false;
							break;
						}
						if (arg4[local383] != arg4[0] && arg4[local383] != arg4[0] + super.anInt8792 && arg4[local383] != arg4[0] - super.anInt8792) {
							local610 = false;
							break;
						}
					}
				}
			}
		} else {
			local610 = false;
		}
		if (!local610) {
			@Pc(1623) Class40 local1623 = new Class40();
			local1623.aShort15 = (short) arg2.length;
			local1623.aShort16 = (short) (arg2.length / 3);
			local1623.aShortArray20 = new short[local1623.aShort15];
			local1623.aShortArray16 = new short[local1623.aShort15];
			local1623.aShortArray17 = new short[local1623.aShort15];
			local1623.anIntArray88 = new int[local1623.aShort15];
			if (arg5 != null) {
				local1623.aShortArray15 = new short[local1623.aShort15];
			}
			@Pc(1693) int local1693;
			@Pc(1814) int local1814;
			@Pc(1861) int local1861;
			@Pc(1947) int local1947;
			for (local383 = 0; local383 < local1623.aShort15; local383++) {
				local467 = arg2[local383];
				local499 = arg4[local383];
				if (local467 == 0 && local499 == 0) {
					local1693 = this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1];
				} else if (local467 == 0 && local499 == super.anInt8792) {
					local1693 = this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1];
				} else if (local467 == super.anInt8792 && local499 == super.anInt8792) {
					local1693 = this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1];
				} else if (local467 == super.anInt8792 && local499 == 0) {
					local1693 = this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1];
				} else {
					local1814 = (this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]) * (super.anInt8792 - local467) + (this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]) * local467;
					local1861 = (this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]) * (super.anInt8792 - local467) + (this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]) * local467;
					local1693 = local1814 * (super.anInt8792 - local499) + local1861 * local499 >> super.anInt8795 * 2;
				}
				local1814 = (arg0 << super.anInt8795) + local467;
				local1861 = (arg1 << super.anInt8795) + local499;
				local1623.aShortArray20[local383] = (short) local467;
				local1623.aShortArray17[local383] = (short) local499;
				local1623.aShortArray16[local383] = (short) (this.method7398(local1814, local1861) + (arg3 == null ? 0 : arg3[local383]));
				if (local1693 < 0) {
					local1693 = 0;
				}
				if (arg6[local383] != 0) {
					local1947 = 0;
					if (arg5 != null) {
						@Pc(1959) short local1959 = local1623.aShortArray15[local383] = (short) arg5[local383];
						if (arg11 != 0) {
							local1947 = local1959 * 255 / arg11;
							if (local1947 < 0) {
								local1947 = 0;
							} else if (local1947 > 255) {
								local1947 = 255;
							}
						}
					}
					local1623.anIntArray88[local383] = Static587.method8011(Static650.method2999(arg6[local383] >> 8, local1693), local1947, arg10);
					if (arg7 != null) {
						local1623.anIntArray88[local383] |= local1693 << 25;
					}
				} else if (arg7 == null) {
					local1623.anIntArray88[local383] = 0;
				} else {
					local1623.anIntArray88[local383] = local1693 << 25;
				}
			}
			@Pc(2011) boolean local2011 = false;
			for (local499 = 0; local499 < local1623.aShort16; local499++) {
				if (arg8[local499 * 3] != -1 && !this.aClass95_Sub2_6.anInterface6_27.method1492(arg8[local499 * 3]).aBoolean308) {
					local2011 = true;
				}
			}
			if (arg7 != null) {
				local1623.anIntArray87 = new int[local1623.aShort16];
			}
			if (local2011) {
				local1623.aShortArray18 = new short[local1623.aShort16];
				local1623.aShortArray19 = new short[local1623.aShort16];
			}
			for (local1693 = 0; local1693 < local1623.aShort16; local1693++) {
				local1814 = local1693 * 3;
				if (arg7 != null && arg7[local1814] != 0) {
					local1623.anIntArray87[local1693] = arg7[local1814] >> 8;
				}
				if (local2011) {
					local1861 = local1814 + 1;
					local1947 = local1861 + 1;
					@Pc(2093) boolean local2093 = false;
					@Pc(2095) boolean local2095 = true;
					@Pc(2099) int local2099 = arg8[local1814];
					if (local2099 == -1 || this.aClass95_Sub2_6.anInterface6_27.method1492(local2099).aBoolean308) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					local2099 = arg8[local1861];
					if (local2099 == -1 || this.aClass95_Sub2_6.anInterface6_27.method1492(local2099).aBoolean308) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					local2099 = arg8[local1947];
					if (local2099 == -1 || this.aClass95_Sub2_6.anInterface6_27.method1492(local2099).aBoolean308) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					if (local2095) {
						local1623.aShortArray18[local1693] = (short) local2099;
						local1623.aShortArray19[local1693] = (short) arg9[local1814];
					} else {
						if (local2093) {
							local2099 = arg8[local1814];
							if (local2099 != -1 && !this.aClass95_Sub2_6.anInterface6_27.method1492(local2099).aBoolean308) {
								local1623.anIntArray88[local1814] = Static486.anIntArray562[Static261.method3559(this.aClass95_Sub2_6.anInterface6_27.method1492(local2099).aShort44 & 0xFFFF) & 0xFFFF];
							}
							local2099 = arg8[local1861];
							if (local2099 != -1 && !this.aClass95_Sub2_6.anInterface6_27.method1492(local2099).aBoolean308) {
								local1623.anIntArray88[local1861] = Static486.anIntArray562[Static261.method3559(this.aClass95_Sub2_6.anInterface6_27.method1492(local2099).aShort44 & 0xFFFF) & 0xFFFF];
							}
							local2099 = arg8[local1947];
							if (local2099 != -1 && !this.aClass95_Sub2_6.anInterface6_27.method1492(local2099).aBoolean308) {
								local1623.anIntArray88[local1947] = Static486.anIntArray562[Static261.method3559(this.aClass95_Sub2_6.anInterface6_27.method1492(local2099).aShort44 & 0xFFFF) & 0xFFFF];
							}
						}
						local1623.aShortArray18[local1693] = -1;
					}
				}
			}
			this.aClass40ArrayArray1[arg0][arg1] = local1623;
			return;
		}
		@Pc(842) Class134 local842 = new Class134();
		local383 = arg6[0];
		local467 = arg8[0];
		if (arg7 != null) {
			local842.anInt3412 = arg7[0] >> 8;
			if (local383 == 0) {
				local842.aByte39 = (byte) (local842.aByte39 | 0x2);
			}
		} else if (local383 == 0) {
			return;
		}
		if (super.anIntArrayArray56[arg0][arg1] == super.anIntArrayArray56[arg0 + 1][arg1] && super.anIntArrayArray56[arg0][arg1] == super.anIntArrayArray56[arg0 + 1][arg1 + 1] && super.anIntArrayArray56[arg0][arg1] == super.anIntArrayArray56[arg0][arg1 + 1]) {
			local842.aByte39 = (byte) (local842.aByte39 | 0x1);
		}
		if (local467 == -1 || (local842.aByte39 & 0x2) != 0 || this.aClass95_Sub2_6.anInterface6_27.method1492(local467).aBoolean308) {
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local186] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt3409 = Static587.method8011(Static650.method2999(arg6[local186] >> 8, this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]), local499, arg10);
			if (local842.anInt3412 != 0) {
				local842.anInt3409 |= this.aByteArrayArray10[arg0][arg1] + 255 - this.aByteArrayArray11[arg0][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local191] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt3411 = Static587.method8011(Static650.method2999(arg6[local191] >> 8, this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]), local499, arg10);
			if (local842.anInt3412 != 0) {
				local842.anInt3411 |= this.aByteArrayArray10[arg0 + 1][arg1] + 255 - this.aByteArrayArray11[arg0 + 1][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local195] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt3410 = Static587.method8011(Static650.method2999(arg6[local195] >> 8, this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]), local499, arg10);
			if (local842.anInt3412 != 0) {
				local842.anInt3410 |= this.aByteArrayArray10[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray11[arg0 + 1][arg1 + 1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local215] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt3408 = Static587.method8011(Static650.method2999(arg6[local215] >> 8, this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]), local499, arg10);
			if (local842.anInt3412 != 0) {
				local842.anInt3408 |= this.aByteArrayArray10[arg0][arg1 + 1] + 255 - this.aByteArrayArray11[arg0][arg1 + 1] << 25;
			}
			local842.aShort35 = -1;
		} else {
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local186] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt3409 = Static587.method8011(Static650.method2999(arg6[local186] >> 8, this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]), local499, arg10);
			if (local842.anInt3412 != 0) {
				local842.anInt3409 |= this.aByteArrayArray10[arg0][arg1] + 255 - this.aByteArrayArray11[arg0][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local191] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt3411 = Static587.method8011(Static650.method2999(arg6[local191] >> 8, this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]), local499, arg10);
			if (local842.anInt3412 != 0) {
				local842.anInt3411 |= this.aByteArrayArray10[arg0 + 1][arg1] + 255 - this.aByteArrayArray11[arg0 + 1][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local195] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt3410 = Static587.method8011(Static650.method2999(arg6[local195] >> 8, this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]), local499, arg10);
			if (local842.anInt3412 != 0) {
				local842.anInt3410 |= this.aByteArrayArray10[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray11[arg0 + 1][arg1 + 1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local215] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt3408 = Static587.method8011(Static650.method2999(arg6[local215] >> 8, this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]), local499, arg10);
			local842.aShort35 = (short) local467;
		}
		if (arg5 != null) {
			local842.aShort36 = (short) arg5[local195];
			local842.aShort34 = (short) arg5[local215];
			local842.aShort38 = (short) arg5[local191];
			local842.aShort37 = (short) arg5[local186];
		}
		this.aClass134ArrayArray1[arg0][arg1] = local842;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(IIZLclient!ae;Lclient!vk;[I[I[I[II)V")
	private void method3006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(4) Class364 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class134 local6 = this.aClass134ArrayArray1[arg0][arg1];
		@Pc(41) int local41;
		@Pc(46) int local46;
		@Pc(51) int local51;
		@Pc(544) int local544;
		@Pc(394) int local394;
		@Pc(454) int local454;
		@Pc(514) int local514;
		@Pc(574) int local574;
		if (local6 == null) {
			@Pc(3030) Class40 local3030 = this.aClass40ArrayArray1[arg0][arg1];
			if (local3030 != null) {
				if (arg9 != 0) {
					if ((local3030.aByte23 & 0x4) == 0) {
						if ((arg9 & 0x2) != 0) {
							return;
						}
					} else if ((arg9 & 0x1) != 0) {
						return;
					}
				}
				@Pc(3196) float local3196;
				@Pc(3217) float local3217;
				@Pc(3102) float local3102;
				if (this.anInt3585 == -1) {
					for (local544 = 0; local544 < local3030.aShort15; local544++) {
						local41 = local3030.aShortArray20[local544] + (arg0 << super.anInt8795);
						local46 = local3030.aShortArray16[local544];
						local51 = local3030.aShortArray17[local544] + (arg1 << super.anInt8795);
						local3102 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local46 + this.aFloat58 * (float) local51;
						if (local3102 <= (float) this.aClass95_Sub2_6.anInt3865) {
							return;
						}
						arg8[local544] = 0;
						if (arg2) {
							local394 = (int) (local3102 - (float) arg3.anInt82);
							if (local394 > 255) {
								local394 = 255;
							}
							if (local394 > 0) {
								arg8[local544] = local394;
								local454 = local3030.aShortArray15[local544] * local394 / 255;
								if (local454 > 0) {
									local46 -= local454;
								}
							}
						} else if (arg3.aBoolean10) {
							local394 = (int) (local3102 - (float) arg3.anInt82);
							if (local394 > 0) {
								arg8[local544] = local394;
								if (arg8[local544] > 255) {
									arg8[local544] = 255;
								}
							}
						}
						local3196 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local46 + this.aFloat65 * (float) local51;
						local3217 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local46 + this.aFloat55 * (float) local51;
						arg5[local544] = arg4.anInt9731 + (int) (local3196 * (float) this.aClass95_Sub2_6.anInt3868 / local3102);
						arg6[local544] = arg4.anInt9733 + (int) (local3217 * (float) this.aClass95_Sub2_6.anInt3877 / local3102);
						arg7[local544] = (int) local3102;
					}
				} else {
					for (local544 = 0; local544 < local3030.aShort15; local544++) {
						local41 = local3030.aShortArray20[local544] + (arg0 << super.anInt8795);
						local46 = local3030.aShortArray16[local544];
						local51 = local3030.aShortArray17[local544] + (arg1 << super.anInt8795);
						local3102 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local46 + this.aFloat58 * (float) local51;
						arg8[local544] = 0;
						if (arg2) {
							local394 = this.anInt3585 - arg3.anInt82;
							if (local394 > 255) {
								local394 = 255;
							}
							if (local394 > 0) {
								arg8[local544] = local394;
								local454 = local3030.aShortArray15[local544] * local394 / 255;
								if (local454 > 0) {
									local46 -= local454;
								}
							}
						} else if (arg3.aBoolean10) {
							local394 = this.anInt3585 - arg3.anInt82;
							if (local394 > 0) {
								arg8[local544] = local394;
								if (arg8[local544] > 255) {
									arg8[local544] = 255;
								}
							}
						}
						local3196 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local46 + this.aFloat65 * (float) local51;
						local3217 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local46 + this.aFloat55 * (float) local51;
						arg5[local544] = arg4.anInt9731 + (int) (local3196 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
						arg6[local544] = arg4.anInt9733 + (int) (local3217 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
						arg7[local544] = (int) local3102;
					}
				}
				@Pc(3486) int local3486;
				@Pc(3490) int local3490;
				@Pc(3494) int local3494;
				@Pc(3498) int local3498;
				@Pc(3502) int local3502;
				@Pc(3514) int local3514;
				if (local3030.aShortArray18 != null) {
					@Pc(3558) short local3558;
					@Pc(3568) int local3568;
					if (this.anInt3585 == -1) {
						for (local544 = 0; local544 < local3030.aShort16; local544++) {
							local394 = local544 * 3;
							local454 = local394 + 1;
							local514 = local454 + 1;
							local574 = arg5[local394];
							local3486 = arg5[local454];
							local3490 = arg5[local514];
							local3494 = arg6[local394];
							local3498 = arg6[local454];
							local3502 = arg6[local514];
							local3514 = arg8[local394] + arg8[local454] + arg8[local514];
							if ((local574 - local3486) * (local3502 - local3498) - (local3494 - local3498) * (local3490 - local3486) > 0) {
								arg4.aBoolean712 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt9732 || local3486 > arg4.anInt9732 || local3490 > arg4.anInt9732;
								local3558 = local3030.aShortArray18[local544];
								if (local3514 >= 765) {
									arg4.method8137((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt83);
								} else if (local3514 > 0) {
									if (local3558 != -1) {
										local3568 = -16777216;
										if (local3558 != -1 && this.method3005(this.aClass95_Sub2_6.anInterface6_27.method1492(local3558).aByte52)) {
											local3568 = -1694498816;
										}
										arg4.method8149((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray20[local394] / (float) super.anInt8792, (float) local3030.aShortArray20[local454] / (float) super.anInt8792, (float) local3030.aShortArray20[local514] / (float) super.anInt8792, (float) local3030.aShortArray17[local394] / (float) super.anInt8792, (float) local3030.aShortArray17[local454] / (float) super.anInt8792, (float) local3030.aShortArray17[local514] / (float) super.anInt8792, local3568 | local3030.anIntArray88[local394] & 0xFFFFFF, local3568 | local3030.anIntArray88[local454] & 0xFFFFFF, local3568 | local3030.anIntArray88[local514] & 0xFFFFFF, arg3.anInt83, arg8[local394], arg8[local454], arg8[local514], local3558);
									} else if ((local3030.anIntArray88[local394] & 0xFFFFFF) != 0) {
										if (local3558 != -1 && this.method3005(this.aClass95_Sub2_6.anInterface6_27.method1492(local3558).aByte52)) {
											arg4.anInt9734 = -1694498816;
										}
										arg4.method8145((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static206.method2914(local3030.anIntArray88[local394], arg8[local394] << 24 | arg3.anInt83), Static206.method2914(local3030.anIntArray88[local454], arg8[local454] << 24 | arg3.anInt83), Static206.method2914(local3030.anIntArray88[local514], arg8[local514] << 24 | arg3.anInt83));
										arg4.anInt9734 = 0;
									}
								} else if (local3558 != -1) {
									local3568 = -16777216;
									if (local3558 != -1 && this.method3005(this.aClass95_Sub2_6.anInterface6_27.method1492(local3558).aByte52)) {
										local3568 = -1694498816;
									}
									arg4.method8149((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray20[local394] / (float) super.anInt8792, (float) local3030.aShortArray20[local454] / (float) super.anInt8792, (float) local3030.aShortArray20[local514] / (float) super.anInt8792, (float) local3030.aShortArray17[local394] / (float) super.anInt8792, (float) local3030.aShortArray17[local454] / (float) super.anInt8792, (float) local3030.aShortArray17[local514] / (float) super.anInt8792, local3568 | local3030.anIntArray88[local394] & 0xFFFFFF, local3568 | local3030.anIntArray88[local454] & 0xFFFFFF, local3568 | local3030.anIntArray88[local514] & 0xFFFFFF, 0, 0, 0, 0, local3558);
								} else if ((local3030.anIntArray88[local394] & 0xFFFFFF) != 0) {
									if (local3558 != -1 && this.method3005(this.aClass95_Sub2_6.anInterface6_27.method1492(local3558).aByte52)) {
										arg4.anInt9734 = -1694498816;
									}
									arg4.method8145((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray88[local394], local3030.anIntArray88[local454], local3030.anIntArray88[local514]);
									arg4.anInt9734 = 0;
								}
							}
						}
						return;
					}
					for (local544 = 0; local544 < local3030.aShort16; local544++) {
						local394 = local544 * 3;
						local454 = local394 + 1;
						local514 = local454 + 1;
						local574 = arg5[local394];
						local3486 = arg5[local454];
						local3490 = arg5[local514];
						local3494 = arg6[local394];
						local3498 = arg6[local454];
						local3502 = arg6[local514];
						local3514 = arg8[local394] + arg8[local454] + arg8[local514];
						if ((local574 - local3486) * (local3502 - local3498) - (local3494 - local3498) * (local3490 - local3486) > 0) {
							arg4.aBoolean712 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt9732 || local3486 > arg4.anInt9732 || local3490 > arg4.anInt9732;
							local3558 = local3030.aShortArray18[local544];
							if (local3514 < 765) {
								if (local3558 != -1 && this.method3005(this.aClass95_Sub2_6.anInterface6_27.method1492(local3558).aByte52)) {
									arg4.anInt9734 = -1694498816;
								}
								if (local3514 > 0) {
									if (local3558 != -1) {
										local3568 = -16777216;
										if (local3558 != -1 && this.method3005(this.aClass95_Sub2_6.anInterface6_27.method1492(local3558).aByte52)) {
											local3568 = -1694498816;
										}
										arg4.method8149((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray20[local394] / (float) super.anInt8792, (float) local3030.aShortArray20[local454] / (float) super.anInt8792, (float) local3030.aShortArray20[local514] / (float) super.anInt8792, (float) local3030.aShortArray17[local394] / (float) super.anInt8792, (float) local3030.aShortArray17[local454] / (float) super.anInt8792, (float) local3030.aShortArray17[local514] / (float) super.anInt8792, local3568 | local3030.anIntArray88[local394] & 0xFFFFFF, local3568 | local3030.anIntArray88[local454] & 0xFFFFFF, local3568 | local3030.anIntArray88[local514] & 0xFFFFFF, arg3.anInt83, arg8[local394], arg8[local454], arg8[local514], local3558);
									} else if ((local3030.anIntArray88[local394] & 0xFFFFFF) != 0) {
										if (local3558 != -1 && this.method3005(this.aClass95_Sub2_6.anInterface6_27.method1492(local3558).aByte52)) {
											arg4.anInt9734 = -1694498816;
										}
										arg4.method8145((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static206.method2914(local3030.anIntArray88[local394], arg8[local394] << 24 | arg3.anInt83), Static206.method2914(local3030.anIntArray88[local454], arg8[local454] << 24 | arg3.anInt83), Static206.method2914(local3030.anIntArray88[local514], arg8[local514] << 24 | arg3.anInt83));
										arg4.anInt9734 = 0;
									}
								} else if (local3558 != -1) {
									local3568 = -16777216;
									if (local3558 != -1 && this.method3005(this.aClass95_Sub2_6.anInterface6_27.method1492(local3558).aByte52)) {
										local3568 = -1694498816;
									}
									arg4.method8149((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray20[local394] / (float) super.anInt8792, (float) local3030.aShortArray20[local454] / (float) super.anInt8792, (float) local3030.aShortArray20[local514] / (float) super.anInt8792, (float) local3030.aShortArray17[local394] / (float) super.anInt8792, (float) local3030.aShortArray17[local454] / (float) super.anInt8792, (float) local3030.aShortArray17[local514] / (float) super.anInt8792, local3568 | local3030.anIntArray88[local394] & 0xFFFFFF, local3568 | local3030.anIntArray88[local454] & 0xFFFFFF, local3568 | local3030.anIntArray88[local514] & 0xFFFFFF, 0, 0, 0, 0, local3558);
								} else if ((local3030.anIntArray88[local394] & 0xFFFFFF) != 0) {
									if (local3558 != -1 && this.method3005(this.aClass95_Sub2_6.anInterface6_27.method1492(local3558).aByte52)) {
										arg4.anInt9734 = -1694498816;
									}
									arg4.method8145((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray88[local394], local3030.anIntArray88[local454], local3030.anIntArray88[local514]);
									arg4.anInt9734 = 0;
								}
								arg4.anInt9734 = 0;
							} else {
								arg4.method8137((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt83);
							}
						}
					}
					return;
				}
				for (local544 = 0; local544 < local3030.aShort16; local544++) {
					local394 = local544 * 3;
					local454 = local394 + 1;
					local514 = local454 + 1;
					local574 = arg5[local394];
					local3486 = arg5[local454];
					local3490 = arg5[local514];
					local3494 = arg6[local394];
					local3498 = arg6[local454];
					local3502 = arg6[local514];
					local3514 = arg8[local394] + arg8[local454] + arg8[local514];
					if ((local574 - local3486) * (local3502 - local3498) - (local3494 - local3498) * (local3490 - local3486) > 0) {
						arg4.aBoolean712 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt9732 || local3486 > arg4.anInt9732 || local3490 > arg4.anInt9732;
						if (local3514 >= 765) {
							arg4.method8137((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt83);
						} else if (local3514 > 0) {
							if ((local3030.anIntArray88[local394] & 0xFFFFFF) != 0) {
								arg4.method8145((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static587.method8011(local3030.anIntArray88[local394], arg8[local394], arg3.anInt83), Static587.method8011(local3030.anIntArray88[local454], arg8[local454], arg3.anInt83), Static587.method8011(local3030.anIntArray88[local514], arg8[local514], arg3.anInt83));
							}
						} else if ((local3030.anIntArray88[local394] & 0xFFFFFF) != 0) {
							arg4.method8145((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray88[local394], local3030.anIntArray88[local454], local3030.anIntArray88[local514]);
						}
					}
				}
			}
		} else if ((local6.aByte39 & 0x2) == 0) {
			if (arg9 != 0) {
				if ((local6.aByte39 & 0x4) == 0) {
					if ((arg9 & 0x2) != 0) {
						return;
					}
				} else if ((arg9 & 0x1) != 0) {
					return;
				}
			}
			@Pc(36) int local36 = arg0 * super.anInt8792;
			local41 = local36 + super.anInt8792;
			local46 = arg1 * super.anInt8792;
			local51 = local46 + super.anInt8792;
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			@Pc(59) int local59 = 0;
			@Pc(100) float local100;
			@Pc(125) float local125;
			@Pc(150) float local150;
			@Pc(175) float local175;
			@Pc(261) int local261;
			@Pc(73) int local73;
			@Pc(848) int local848;
			@Pc(859) int local859;
			@Pc(364) int local364;
			@Pc(424) int local424;
			@Pc(484) int local484;
			@Pc(351) float local351;
			@Pc(411) float local411;
			@Pc(471) float local471;
			@Pc(531) float local531;
			@Pc(381) float local381;
			@Pc(441) float local441;
			@Pc(501) float local501;
			@Pc(561) float local561;
			if ((local6.aByte39 & 0x1) == 0 || arg2) {
				local73 = super.anIntArrayArray56[arg0][arg1];
				local848 = super.anIntArrayArray56[arg0 + 1][arg1];
				local859 = super.anIntArrayArray56[arg0 + 1][arg1 + 1];
				@Pc(868) int local868 = super.anIntArrayArray56[arg0][arg1 + 1];
				if (this.anInt3585 == -1) {
					local100 = this.aFloat62 + this.aFloat59 * (float) local36 + this.aFloat64 * (float) local73 + this.aFloat58 * (float) local46;
					if (local100 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local125 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local848 + this.aFloat58 * (float) local46;
					if (local125 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local150 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local859 + this.aFloat58 * (float) local51;
					if (local150 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local175 = this.aFloat62 + this.aFloat59 * (float) local36 + this.aFloat64 * (float) local868 + this.aFloat58 * (float) local51;
					if (local175 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
				} else {
					local100 = this.aFloat62 + this.aFloat59 * (float) local36 + this.aFloat64 * (float) local73 + this.aFloat58 * (float) local46;
					local125 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local848 + this.aFloat58 * (float) local46;
					local150 = this.aFloat62 + this.aFloat59 * (float) local41 + this.aFloat64 * (float) local859 + this.aFloat58 * (float) local51;
					local175 = this.aFloat62 + this.aFloat59 * (float) local36 + this.aFloat64 * (float) local868 + this.aFloat58 * (float) local51;
				}
				if (arg2) {
					local261 = (int) (local100 - (float) arg3.anInt82);
					if (local261 > 255) {
						local261 = 255;
					}
					@Pc(1097) int local1097;
					if (local261 > 0) {
						local53 = local261;
						local1097 = local6.aShort37 * local261 / 255;
						if (local1097 > 0) {
							local73 -= local1097;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt82);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local55 = local261;
						local1097 = local6.aShort38 * local261 / 255;
						if (local1097 > 0) {
							local848 -= local1097;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt82);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local57 = local261;
						local1097 = local6.aShort36 * local261 / 255;
						if (local1097 > 0) {
							local859 -= local1097;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt82);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local59 = local261;
						local1097 = local6.aShort34 * local261 / 255;
						if (local1097 > 0) {
							local868 -= local1097;
						}
					}
				} else if (arg3.aBoolean10) {
					local261 = (int) (local100 - (float) arg3.anInt82);
					if (local261 > 0) {
						local53 = local261;
						if (local261 > 255) {
							local53 = 255;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt82);
					if (local261 > 0) {
						local55 = local261;
						if (local261 > 255) {
							local55 = 255;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt82);
					if (local261 > 0) {
						local57 = local261;
						if (local261 > 255) {
							local57 = 255;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt82);
					if (local261 > 0) {
						local59 = local261;
						if (local261 > 255) {
							local59 = 255;
						}
					}
				}
				if (this.anInt3585 == -1) {
					local351 = this.aFloat57 + this.aFloat54 * (float) local36 + this.aFloat56 * (float) local73 + this.aFloat65 * (float) local46;
					local364 = arg4.anInt9731 + (int) (local351 * (float) this.aClass95_Sub2_6.anInt3868 / local100);
					local381 = this.aFloat60 + this.aFloat61 * (float) local36 + this.aFloat63 * (float) local73 + this.aFloat55 * (float) local46;
					local394 = arg4.anInt9733 + (int) (local381 * (float) this.aClass95_Sub2_6.anInt3877 / local100);
					local411 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local848 + this.aFloat65 * (float) local46;
					local424 = arg4.anInt9731 + (int) (local411 * (float) this.aClass95_Sub2_6.anInt3868 / local125);
					local441 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local848 + this.aFloat55 * (float) local46;
					local454 = arg4.anInt9733 + (int) (local441 * (float) this.aClass95_Sub2_6.anInt3877 / local125);
					local471 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local859 + this.aFloat65 * (float) local51;
					local484 = arg4.anInt9731 + (int) (local471 * (float) this.aClass95_Sub2_6.anInt3868 / local150);
					local501 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local859 + this.aFloat55 * (float) local51;
					local514 = arg4.anInt9733 + (int) (local501 * (float) this.aClass95_Sub2_6.anInt3877 / local150);
					local531 = this.aFloat57 + this.aFloat54 * (float) local36 + this.aFloat56 * (float) local868 + this.aFloat65 * (float) local51;
					local544 = arg4.anInt9731 + (int) (local531 * (float) this.aClass95_Sub2_6.anInt3868 / local175);
					local561 = this.aFloat60 + this.aFloat61 * (float) local36 + this.aFloat63 * (float) local868 + this.aFloat55 * (float) local51;
					local574 = arg4.anInt9733 + (int) (local561 * (float) this.aClass95_Sub2_6.anInt3877 / local175);
				} else {
					local351 = this.aFloat57 + this.aFloat54 * (float) local36 + this.aFloat56 * (float) local73 + this.aFloat65 * (float) local46;
					local364 = arg4.anInt9731 + (int) (local351 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local381 = this.aFloat60 + this.aFloat61 * (float) local36 + this.aFloat63 * (float) local73 + this.aFloat55 * (float) local46;
					local394 = arg4.anInt9733 + (int) (local381 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local411 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local848 + this.aFloat65 * (float) local46;
					local424 = arg4.anInt9731 + (int) (local411 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local441 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local848 + this.aFloat55 * (float) local46;
					local454 = arg4.anInt9733 + (int) (local441 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local471 = this.aFloat57 + this.aFloat54 * (float) local41 + this.aFloat56 * (float) local859 + this.aFloat65 * (float) local51;
					local484 = arg4.anInt9731 + (int) (local471 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local501 = this.aFloat60 + this.aFloat61 * (float) local41 + this.aFloat63 * (float) local859 + this.aFloat55 * (float) local51;
					local514 = arg4.anInt9733 + (int) (local501 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local531 = this.aFloat57 + this.aFloat54 * (float) local36 + this.aFloat56 * (float) local868 + this.aFloat65 * (float) local51;
					local544 = arg4.anInt9731 + (int) (local531 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local561 = this.aFloat60 + this.aFloat61 * (float) local36 + this.aFloat63 * (float) local868 + this.aFloat55 * (float) local51;
					local574 = arg4.anInt9733 + (int) (local561 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
				}
			} else {
				local73 = super.anIntArrayArray56[arg0][arg1];
				@Pc(79) float local79 = this.aFloat64 * (float) local73;
				if (this.anInt3585 == -1) {
					local100 = this.aFloat62 + this.aFloat59 * (float) local36 + local79 + this.aFloat58 * (float) local46;
					if (local100 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local125 = this.aFloat62 + this.aFloat59 * (float) local41 + local79 + this.aFloat58 * (float) local46;
					if (local125 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local150 = this.aFloat62 + this.aFloat59 * (float) local41 + local79 + this.aFloat58 * (float) local51;
					if (local150 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
					local175 = this.aFloat62 + this.aFloat59 * (float) local36 + local79 + this.aFloat58 * (float) local51;
					if (local175 <= (float) this.aClass95_Sub2_6.anInt3865) {
						return;
					}
				} else {
					local100 = this.aFloat62 + this.aFloat59 * (float) local36 + local79 + this.aFloat58 * (float) local46;
					local125 = this.aFloat62 + this.aFloat59 * (float) local41 + local79 + this.aFloat58 * (float) local46;
					local150 = this.aFloat62 + this.aFloat59 * (float) local41 + local79 + this.aFloat58 * (float) local51;
					local175 = this.aFloat62 + this.aFloat59 * (float) local36 + local79 + this.aFloat58 * (float) local51;
				}
				if (arg3.aBoolean10) {
					local261 = (int) (local100 - (float) arg3.anInt82);
					if (local261 > 0) {
						local53 = local261;
						if (local261 > 255) {
							local53 = 255;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt82);
					if (local261 > 0) {
						local55 = local261;
						if (local261 > 255) {
							local55 = 255;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt82);
					if (local261 > 0) {
						local57 = local261;
						if (local261 > 255) {
							local57 = 255;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt82);
					if (local261 > 0) {
						local59 = local261;
						if (local261 > 255) {
							local59 = 255;
						}
					}
				}
				@Pc(324) float local324 = this.aFloat56 * (float) local73;
				@Pc(330) float local330 = this.aFloat63 * (float) local73;
				if (this.anInt3585 == -1) {
					local351 = this.aFloat57 + this.aFloat54 * (float) local36 + local324 + this.aFloat65 * (float) local46;
					local364 = arg4.anInt9731 + (int) (local351 * (float) this.aClass95_Sub2_6.anInt3868 / local100);
					local381 = this.aFloat60 + this.aFloat61 * (float) local36 + local330 + this.aFloat55 * (float) local46;
					local394 = arg4.anInt9733 + (int) (local381 * (float) this.aClass95_Sub2_6.anInt3877 / local100);
					local411 = this.aFloat57 + this.aFloat54 * (float) local41 + local324 + this.aFloat65 * (float) local46;
					local424 = arg4.anInt9731 + (int) (local411 * (float) this.aClass95_Sub2_6.anInt3868 / local125);
					local441 = this.aFloat60 + this.aFloat61 * (float) local41 + local330 + this.aFloat55 * (float) local46;
					local454 = arg4.anInt9733 + (int) (local441 * (float) this.aClass95_Sub2_6.anInt3877 / local125);
					local471 = this.aFloat57 + this.aFloat54 * (float) local41 + local324 + this.aFloat65 * (float) local51;
					local484 = arg4.anInt9731 + (int) (local471 * (float) this.aClass95_Sub2_6.anInt3868 / local150);
					local501 = this.aFloat60 + this.aFloat61 * (float) local41 + local330 + this.aFloat55 * (float) local51;
					local514 = arg4.anInt9733 + (int) (local501 * (float) this.aClass95_Sub2_6.anInt3877 / local150);
					local531 = this.aFloat57 + this.aFloat54 * (float) local36 + local324 + this.aFloat65 * (float) local51;
					local544 = arg4.anInt9731 + (int) (local531 * (float) this.aClass95_Sub2_6.anInt3868 / local175);
					local561 = this.aFloat60 + this.aFloat61 * (float) local36 + local330 + this.aFloat55 * (float) local51;
					local574 = arg4.anInt9733 + (int) (local561 * (float) this.aClass95_Sub2_6.anInt3877 / local175);
				} else {
					local351 = this.aFloat57 + this.aFloat54 * (float) local36 + local324 + this.aFloat65 * (float) local46;
					local364 = arg4.anInt9731 + (int) (local351 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local381 = this.aFloat60 + this.aFloat61 * (float) local36 + local330 + this.aFloat55 * (float) local46;
					local394 = arg4.anInt9733 + (int) (local381 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local411 = this.aFloat57 + this.aFloat54 * (float) local41 + local324 + this.aFloat65 * (float) local46;
					local424 = arg4.anInt9731 + (int) (local411 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local441 = this.aFloat60 + this.aFloat61 * (float) local41 + local330 + this.aFloat55 * (float) local46;
					local454 = arg4.anInt9733 + (int) (local441 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local471 = this.aFloat57 + this.aFloat54 * (float) local41 + local324 + this.aFloat65 * (float) local51;
					local484 = arg4.anInt9731 + (int) (local471 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local501 = this.aFloat60 + this.aFloat61 * (float) local41 + local330 + this.aFloat55 * (float) local51;
					local514 = arg4.anInt9733 + (int) (local501 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
					local531 = this.aFloat57 + this.aFloat54 * (float) local36 + local324 + this.aFloat65 * (float) local51;
					local544 = arg4.anInt9731 + (int) (local531 * (float) this.aClass95_Sub2_6.anInt3868 / (float) this.anInt3585);
					local561 = this.aFloat60 + this.aFloat61 * (float) local36 + local330 + this.aFloat55 * (float) local51;
					local574 = arg4.anInt9733 + (int) (local561 * (float) this.aClass95_Sub2_6.anInt3877 / (float) this.anInt3585);
				}
			}
			@Pc(1842) boolean local1842 = local6.aShort35 != -1 && this.method3005(this.aClass95_Sub2_6.anInterface6_27.method1492(local6.aShort35).aByte52);
			if (this.anInt3585 == -1) {
				local848 = local55 + local57 + local59;
				if ((local484 - local544) * (local454 - local574) - (local514 - local574) * (local424 - local544) > 0) {
					arg4.aBoolean712 = local484 < 0 || local544 < 0 || local424 < 0 || local484 > arg4.anInt9732 || local544 > arg4.anInt9732 || local424 > arg4.anInt9732;
					if (local848 >= 765) {
						arg4.method8137((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, arg3.anInt83);
					} else if (local848 > 0) {
						if (local6.aShort35 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method8149((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt3410 & 0xFFFFFF, local859 | local6.anInt3408 & 0xFFFFFF, local859 | local6.anInt3411 & 0xFFFFFF, arg3.anInt83, local57, local59, local55, local6.aShort35);
						} else {
							if (local1842) {
								arg4.anInt9734 = 100;
							}
							arg4.method8145((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, Static206.method2914(local6.anInt3410, local57 << 24 | arg3.anInt83), Static206.method2914(local6.anInt3408, local59 << 24 | arg3.anInt83), Static206.method2914(local6.anInt3411, local55 << 24 | arg3.anInt83));
							arg4.anInt9734 = 0;
						}
					} else if (local6.aShort35 >= 0) {
						local859 = -16777216;
						if (local1842) {
							local859 = -1694498816;
						}
						arg4.method8149((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt3410 & 0xFFFFFF, local859 | local6.anInt3408 & 0xFFFFFF, local859 | local6.anInt3411 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort35);
					} else {
						if (local1842) {
							arg4.anInt9734 = 100;
						}
						arg4.method8145((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, local6.anInt3410, local6.anInt3408, local6.anInt3411);
						arg4.anInt9734 = 0;
					}
				}
				local848 = local53 + local55 + local59;
				if ((local364 - local424) * (local574 - local454) - (local394 - local454) * (local544 - local424) > 0) {
					arg4.aBoolean712 = local364 < 0 || local424 < 0 || local544 < 0 || local364 > arg4.anInt9732 || local424 > arg4.anInt9732 || local544 > arg4.anInt9732;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt9734 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort35 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method8149((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt3409 & 0xFFFFFF, local859 | local6.anInt3411 & 0xFFFFFF, local859 | local6.anInt3408 & 0xFFFFFF, arg3.anInt83, local53, local55, local59, local6.aShort35);
								return;
							}
							if (local1842) {
								arg4.anInt9734 = 100;
							}
							arg4.method8145((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, Static206.method2914(local6.anInt3409, local53 << 24 | arg3.anInt83), Static206.method2914(local6.anInt3411, local55 << 24 | arg3.anInt83), Static206.method2914(local6.anInt3408, local59 << 24 | arg3.anInt83));
							arg4.anInt9734 = 0;
							return;
						}
						if (local6.aShort35 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method8149((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt3409 & 0xFFFFFF, local859 | local6.anInt3411 & 0xFFFFFF, local859 | local6.anInt3408 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort35);
							return;
						}
						if (local1842) {
							arg4.anInt9734 = 100;
						}
						arg4.method8145((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, local6.anInt3409, local6.anInt3411, local6.anInt3408);
						arg4.anInt9734 = 0;
						return;
					}
					arg4.method8137((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, arg3.anInt83);
					return;
				}
			} else {
				local848 = local55 + local57 + local59;
				if ((local484 - local544) * (local454 - local574) - (local514 - local574) * (local424 - local544) > 0) {
					arg4.aBoolean712 = local484 < 0 || local544 < 0 || local424 < 0 || local484 > arg4.anInt9732 || local544 > arg4.anInt9732 || local424 > arg4.anInt9732;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt9734 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort35 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method8149((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt3410 & 0xFFFFFF, local859 | local6.anInt3408 & 0xFFFFFF, local859 | local6.anInt3411 & 0xFFFFFF, arg3.anInt83, local57, local59, local55, local6.aShort35);
							} else {
								if (local1842) {
									arg4.anInt9734 = 100;
								}
								arg4.method8145((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, Static206.method2914(local6.anInt3410, local57 << 24 | arg3.anInt83), Static206.method2914(local6.anInt3408, local59 << 24 | arg3.anInt83), Static206.method2914(local6.anInt3411, local55 << 24 | arg3.anInt83));
								arg4.anInt9734 = 0;
							}
						} else if (local6.aShort35 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method8149((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt3410 & 0xFFFFFF, local859 | local6.anInt3408 & 0xFFFFFF, local859 | local6.anInt3411 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort35);
						} else {
							if (local1842) {
								arg4.anInt9734 = 100;
							}
							arg4.method8145((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, local6.anInt3410, local6.anInt3408, local6.anInt3411);
							arg4.anInt9734 = 0;
						}
					} else {
						arg4.method8137((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, arg3.anInt83);
					}
				}
				local848 = local53 + local55 + local59;
				if ((local364 - local424) * (local574 - local454) - (local394 - local454) * (local544 - local424) > 0) {
					arg4.aBoolean712 = local364 < 0 || local424 < 0 || local544 < 0 || local364 > arg4.anInt9732 || local424 > arg4.anInt9732 || local544 > arg4.anInt9732;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt9734 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort35 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method8149((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt3409 & 0xFFFFFF, local859 | local6.anInt3411 & 0xFFFFFF, local859 | local6.anInt3408 & 0xFFFFFF, arg3.anInt83, local53, local55, local59, local6.aShort35);
								return;
							}
							if (local1842) {
								arg4.anInt9734 = 100;
							}
							arg4.method8145((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, Static206.method2914(local6.anInt3409, local53 << 24 | arg3.anInt83), Static206.method2914(local6.anInt3411, local55 << 24 | arg3.anInt83), Static206.method2914(local6.anInt3408, local59 << 24 | arg3.anInt83));
							arg4.anInt9734 = 0;
							return;
						}
						if (local6.aShort35 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method8149((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt3409 & 0xFFFFFF, local859 | local6.anInt3411 & 0xFFFFFF, local859 | local6.anInt3408 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort35);
							return;
						}
						if (local1842) {
							arg4.anInt9734 = 100;
						}
						arg4.method8145((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, local6.anInt3409, local6.anInt3411, local6.anInt3408);
						arg4.anInt9734 = 0;
						return;
					}
					arg4.method8137((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, arg3.anInt83);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class177_Sub2 local3 = this.aClass95_Sub2_6.aClass177_Sub2_2;
		this.anInt3585 = -1;
		this.aFloat54 = local3.aFloat112;
		this.aFloat56 = local3.aFloat106;
		this.aFloat65 = local3.aFloat109;
		this.aFloat57 = local3.aFloat102;
		this.aFloat61 = local3.aFloat107;
		this.aFloat63 = local3.aFloat104;
		this.aFloat55 = local3.aFloat110;
		this.aFloat60 = local3.aFloat108;
		this.aFloat59 = local3.aFloat105;
		this.aFloat64 = local3.aFloat101;
		this.aFloat58 = local3.aFloat111;
		this.aFloat62 = local3.aFloat103;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt8791 && local78 >= 0 && local78 < super.anInt8794) {
						this.method3001(local72, local78, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V")
	@Override
	public void method7394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3001(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7391(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class5 local4 = this.aClass95_Sub2_6.method3302(Thread.currentThread());
		@Pc(7) Class364 local7 = local4.aClass364_1;
		local7.anInt9734 = 0;
		local7.aBoolean712 = true;
		this.aClass95_Sub2_6.ya();
		if (this.aClass134ArrayArray1 != null || this.aClass352ArrayArray1 != null) {
			this.method3004(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray25, local4.anIntArray10);
		} else if (this.aClass270ArrayArray1 != null) {
			this.method3003(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray25, local4.anIntArray10);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!kb;[I)V")
	@Override
	public void method7400(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!hn", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		this.aByteArrayArray11 = null;
		this.aByteArrayArray10 = null;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7397(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!hn", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray10[arg0][arg1] < arg2) {
			this.aByteArrayArray10[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class177_Sub2 local3 = this.aClass95_Sub2_6.aClass177_Sub2_2;
		this.anInt3585 = arg5;
		this.aFloat54 = local3.aFloat112;
		this.aFloat56 = local3.aFloat106;
		this.aFloat65 = local3.aFloat109;
		this.aFloat57 = local3.aFloat102;
		this.aFloat61 = local3.aFloat107;
		this.aFloat63 = local3.aFloat104;
		this.aFloat55 = local3.aFloat110;
		this.aFloat60 = local3.aFloat108;
		this.aFloat59 = local3.aFloat105;
		this.aFloat64 = local3.aFloat101;
		this.aFloat58 = local3.aFloat111;
		this.aFloat62 = local3.aFloat103;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt8791 && local78 >= 0 && local78 < super.anInt8794) {
						this.method3001(local72, local78, arg6);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass270ArrayArray1 == null) {
			this.aClass270ArrayArray1 = new Class270[super.anInt8791][super.anInt8794];
			this.aClass299ArrayArray1 = new Class299[super.anInt8791][super.anInt8794];
		} else if (this.aClass134ArrayArray1 != null || this.aClass352ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(29) boolean local29 = false;
		@Pc(67) int local67;
		@Pc(73) int local73;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local29 = true;
			for (@Pc(60) int local60 = 1; local60 < 2; local60++) {
				local67 = arg2[arg6[local60]];
				local73 = arg4[arg6[local60]];
				if (local67 != 0 && local67 != super.anInt8792 || local73 != 0 && local73 != super.anInt8792) {
					local29 = false;
					break;
				}
			}
		}
		if (!local29) {
			@Pc(98) Class299 local98 = new Class299();
			@Pc(102) short local102 = (short) arg2.length;
			@Pc(106) short local106 = (short) arg9.length;
			local98.aShort108 = local102;
			local98.aShortArray112 = new short[local102];
			local98.aShortArray115 = new short[local102];
			local98.aShortArray111 = new short[local102];
			local98.aShortArray117 = new short[local102];
			@Pc(136) int local136;
			@Pc(291) int local291;
			@Pc(338) int local338;
			for (@Pc(127) int local127 = 0; local127 < local102; local127++) {
				@Pc(132) int local132 = arg2[local127];
				local136 = arg4[local127];
				if (local132 == 0 && local136 == 0) {
					local98.aShortArray112[local127] = (short) (this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]);
				} else if (local132 == 0 && local136 == super.anInt8792) {
					local98.aShortArray112[local127] = (short) (this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]);
				} else if (local132 == super.anInt8792 && local136 == super.anInt8792) {
					local98.aShortArray112[local127] = (short) (this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]);
				} else if (local132 == super.anInt8792 && local136 == 0) {
					local98.aShortArray112[local127] = (short) (this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]);
				} else {
					local291 = (this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]) * (super.anInt8792 - local132) + (this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]) * local132;
					local338 = (this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]) * (super.anInt8792 - local132) + (this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]) * local132;
					local98.aShortArray112[local127] = (short) (local291 * (super.anInt8792 - local136) + local338 * local136 >> super.anInt8795 * 2);
				}
				local291 = (arg0 << super.anInt8795) + local132;
				local338 = (arg1 << super.anInt8795) + local136;
				local98.aShortArray115[local127] = (short) local132;
				local98.aShortArray117[local127] = (short) local136;
				local98.aShortArray111[local127] = (short) (this.method7398(local291, local338) + (arg3 == null ? 0 : arg3[local127]));
				if (local98.aShortArray112[local127] < 2) {
					local98.aShortArray112[local127] = 2;
				}
			}
			@Pc(419) boolean local419 = false;
			local136 = 0;
			for (local291 = 0; local291 < local106; local291++) {
				if (arg9[local291] >= 0 || arg10 != null && arg10[local291] >= 0) {
					local136++;
				}
				local338 = arg11[local291];
				if (local338 != -1) {
					@Pc(449) Class175 local449 = this.aClass95_Sub2_6.anInterface6_27.method1492(local338);
					if (!local449.aBoolean308) {
						local419 = true;
						if (this.method3005(local449.aByte52) || local449.aByte53 != 0 || local449.aByte54 != 0) {
							local98.aByte109 = (byte) (local98.aByte109 | 0x4);
						}
					}
				}
			}
			local98.anIntArray565 = new int[local136];
			if (arg10 != null) {
				local98.anIntArray566 = new int[local136];
			}
			local98.aShortArray114 = new short[local136];
			local98.aShortArray116 = new short[local136];
			local98.aShortArray110 = new short[local136];
			if (local419) {
				local98.aShortArray113 = new short[local136];
				local98.aShortArray118 = new short[local136];
			}
			for (local338 = 0; local338 < local106; local338++) {
				if (arg9[local338] >= 0 || arg10 != null && arg10[local338] >= 0) {
					if (arg9[local338] >= 0) {
						local98.anIntArray565[local98.aShort107] = Static261.method3559(arg9[local338]);
					} else {
						local98.anIntArray565[local98.aShort107] = -1;
					}
					if (arg10 != null) {
						if (arg10[local338] == -1) {
							local98.anIntArray566[local98.aShort107] = -1;
						} else {
							local98.anIntArray566[local98.aShort107] = Static261.method3559(arg10[local338]);
						}
					}
					local98.aShortArray114[local98.aShort107] = (short) arg6[local338];
					local98.aShortArray116[local98.aShort107] = (short) arg7[local338];
					local98.aShortArray110[local98.aShort107] = (short) arg8[local338];
					if (local419) {
						if (arg11[local338] == -1 || this.aClass95_Sub2_6.anInterface6_27.method1492(arg11[local338]).aBoolean308) {
							local98.aShortArray113[local98.aShort107] = -1;
						} else {
							local98.aShortArray113[local98.aShort107] = (short) arg11[local338];
							local98.aShortArray118[local98.aShort107] = (short) arg12[local338];
						}
					}
					local98.aShort107++;
				}
			}
			this.aClass299ArrayArray1[arg0][arg1] = local98;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(668) Class270 local668 = new Class270();
			local67 = arg9[0];
			local73 = arg11[0];
			if (arg10 != null) {
				local668.anInt7012 = Static253.method3518(Static261.method3559(arg10[0]), this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]);
				if (local67 == -1) {
					local668.aByte99 = (byte) (local668.aByte99 | 0x2);
				}
			}
			if (super.anIntArrayArray56[arg0][arg1] == super.anIntArrayArray56[arg0 + 1][arg1] && super.anIntArrayArray56[arg0][arg1] == super.anIntArrayArray56[arg0 + 1][arg1 + 1] && super.anIntArrayArray56[arg0][arg1] == super.anIntArrayArray56[arg0][arg1 + 1]) {
				local668.aByte99 = (byte) (local668.aByte99 | 0x1);
			}
			@Pc(766) Class175 local766 = null;
			if (local73 != -1) {
				local766 = this.aClass95_Sub2_6.anInterface6_27.method1492(local73);
			}
			if (local766 == null || (local668.aByte99 & 0x2) != 0 || local766.aBoolean308) {
				@Pc(893) short local893 = Static261.method3559(local67);
				local668.aShort99 = (short) Static253.method3518(local893, this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]);
				local668.aShort98 = (short) Static253.method3518(local893, this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]);
				local668.aShort96 = (short) Static253.method3518(local893, this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]);
				local668.aShort97 = (short) Static253.method3518(local893, this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]);
				local668.aShort95 = -1;
			} else {
				local668.aShort99 = (short) (this.aByteArrayArray11[arg0][arg1] - this.aByteArrayArray10[arg0][arg1]);
				local668.aShort98 = (short) (this.aByteArrayArray11[arg0 + 1][arg1] - this.aByteArrayArray10[arg0 + 1][arg1]);
				local668.aShort96 = (short) (this.aByteArrayArray11[arg0 + 1][arg1 + 1] - this.aByteArrayArray10[arg0 + 1][arg1 + 1]);
				local668.aShort97 = (short) (this.aByteArrayArray11[arg0][arg1 + 1] - this.aByteArrayArray10[arg0][arg1 + 1]);
				local668.aShort95 = (short) local73;
				if (this.method3005(local766.aByte52) || local766.aByte53 != 0 || local766.aByte54 != 0) {
					local668.aByte99 = (byte) (local668.aByte99 | 0x4);
				}
			}
			this.aClass270ArrayArray1[arg0][arg1] = local668;
		}
	}
}
