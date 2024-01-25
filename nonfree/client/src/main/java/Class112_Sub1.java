import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class112_Sub1 extends Class112 {

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "F")
	private float aFloat86;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "F")
	private float aFloat87;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "[[Lclient!qj;")
	private Class279[][] aClass279ArrayArray1;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "[[Lclient!ch;")
	private Class55[][] aClass55ArrayArray1;

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "[[Lclient!rga;")
	private Class292[][] aClass292ArrayArray1;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "[[Lclient!vd;")
	private Class354[][] aClass354ArrayArray1;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "F")
	private float aFloat88;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "F")
	private float aFloat89;

	@OriginalMember(owner = "client!fn", name = "w", descriptor = "F")
	private float aFloat90;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "F")
	private float aFloat91;

	@OriginalMember(owner = "client!fn", name = "z", descriptor = "F")
	private float aFloat92;

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "F")
	private float aFloat93;

	@OriginalMember(owner = "client!fn", name = "C", descriptor = "F")
	private float aFloat94;

	@OriginalMember(owner = "client!fn", name = "D", descriptor = "F")
	private float aFloat95;

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "F")
	private float aFloat96;

	@OriginalMember(owner = "client!fn", name = "F", descriptor = "[[Lclient!mq;")
	private Class223[][] aClass223ArrayArray1;

	@OriginalMember(owner = "client!fn", name = "G", descriptor = "F")
	private float aFloat97;

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
	private int anInt3627 = -1;

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "Lclient!uj;")
	private final Class87_Sub3 aClass87_Sub3_5;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	private final int anInt3626;

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!fn", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!uj;IIII[[I[[II)V")
	public Class112_Sub1(@OriginalArg(0) Class87_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass87_Sub3_5 = arg0;
		this.anInt3626 = arg2;
		this.aByteArrayArray7 = new byte[arg3 + 1][arg4 + 1];
		@Pc(29) int local29 = this.aClass87_Sub3_5.anInt9479 >> 9;
		for (@Pc(31) int local31 = 1; local31 < arg4; local31++) {
			for (@Pc(34) int local34 = 1; local34 < arg3; local34++) {
				@Pc(53) int local53 = arg6[local34 + 1][local31] - arg6[local34 - 1][local31];
				@Pc(69) int local69 = arg6[local34][local31 + 1] - arg6[local34][local31 - 1];
				@Pc(84) int local84 = (int) Math.sqrt((double) (local53 * local53 + arg7 * 512 + local69 * local69));
				@Pc(90) int local90 = (local53 << 8) / local84;
				@Pc(96) int local96 = arg7 * -512 / local84;
				@Pc(102) int local102 = (local69 << 8) / local84;
				@Pc(124) int local124 = local29 + (this.aClass87_Sub3_5.anInt9490 * local90 + this.aClass87_Sub3_5.anInt9488 * local96 + this.aClass87_Sub3_5.anInt9485 * local102 >> 17);
				local124 >>= 0x1;
				if (local124 < 2) {
					local124 = 2;
				} else if (local124 > 126) {
					local124 = 126;
				}
				this.aByteArrayArray7[local34][local31] = (byte) local124;
			}
		}
		this.aByteArrayArray8 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZLclient!w;Lclient!b;[I[I[I[II)V")
	private void method2996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class364 arg3, @OriginalArg(4) Class28 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class354 local6 = this.aClass354ArrayArray1[arg0][arg1];
		@Pc(41) int local41;
		@Pc(46) int local46;
		@Pc(51) int local51;
		@Pc(544) int local544;
		@Pc(394) int local394;
		@Pc(454) int local454;
		@Pc(514) int local514;
		@Pc(574) int local574;
		if (local6 == null) {
			@Pc(3030) Class279 local3030 = this.aClass279ArrayArray1[arg0][arg1];
			if (local3030 != null) {
				if (arg9 != 0) {
					if ((local3030.aByte107 & 0x4) == 0) {
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
				if (this.anInt3627 == -1) {
					for (local544 = 0; local544 < local3030.aShort103; local544++) {
						local41 = local3030.aShortArray103[local544] + (arg0 << super.anInt9341);
						local46 = local3030.aShortArray107[local544];
						local51 = local3030.aShortArray102[local544] + (arg1 << super.anInt9341);
						local3102 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local46 + this.aFloat95 * (float) local51;
						if (local3102 <= (float) this.aClass87_Sub3_5.anInt9482) {
							return;
						}
						arg8[local544] = 0;
						if (arg2) {
							local394 = (int) (local3102 - (float) arg3.anInt10013);
							if (local394 > 255) {
								local394 = 255;
							}
							if (local394 > 0) {
								arg8[local544] = local394;
								local454 = local3030.aShortArray104[local544] * local394 / 255;
								if (local454 > 0) {
									local46 -= local454;
								}
							}
						} else if (arg3.aBoolean738) {
							local394 = (int) (local3102 - (float) arg3.anInt10013);
							if (local394 > 0) {
								arg8[local544] = local394;
								if (arg8[local544] > 255) {
									arg8[local544] = 255;
								}
							}
						}
						local3196 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local46 + this.aFloat96 * (float) local51;
						local3217 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local46 + this.aFloat87 * (float) local51;
						arg5[local544] = arg4.anInt765 + (int) (local3196 * (float) this.aClass87_Sub3_5.anInt9466 / local3102);
						arg6[local544] = arg4.anInt769 + (int) (local3217 * (float) this.aClass87_Sub3_5.anInt9493 / local3102);
						arg7[local544] = (int) local3102;
					}
				} else {
					for (local544 = 0; local544 < local3030.aShort103; local544++) {
						local41 = local3030.aShortArray103[local544] + (arg0 << super.anInt9341);
						local46 = local3030.aShortArray107[local544];
						local51 = local3030.aShortArray102[local544] + (arg1 << super.anInt9341);
						local3102 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local46 + this.aFloat95 * (float) local51;
						arg8[local544] = 0;
						if (arg2) {
							local394 = this.anInt3627 - arg3.anInt10013;
							if (local394 > 255) {
								local394 = 255;
							}
							if (local394 > 0) {
								arg8[local544] = local394;
								local454 = local3030.aShortArray104[local544] * local394 / 255;
								if (local454 > 0) {
									local46 -= local454;
								}
							}
						} else if (arg3.aBoolean738) {
							local394 = this.anInt3627 - arg3.anInt10013;
							if (local394 > 0) {
								arg8[local544] = local394;
								if (arg8[local544] > 255) {
									arg8[local544] = 255;
								}
							}
						}
						local3196 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local46 + this.aFloat96 * (float) local51;
						local3217 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local46 + this.aFloat87 * (float) local51;
						arg5[local544] = arg4.anInt765 + (int) (local3196 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
						arg6[local544] = arg4.anInt769 + (int) (local3217 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
						arg7[local544] = (int) local3102;
					}
				}
				@Pc(3486) int local3486;
				@Pc(3490) int local3490;
				@Pc(3494) int local3494;
				@Pc(3498) int local3498;
				@Pc(3502) int local3502;
				@Pc(3514) int local3514;
				if (local3030.aShortArray105 != null) {
					@Pc(3558) short local3558;
					@Pc(3568) int local3568;
					if (this.anInt3627 == -1) {
						for (local544 = 0; local544 < local3030.aShort104; local544++) {
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
								arg4.aBoolean60 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt764 || local3486 > arg4.anInt764 || local3490 > arg4.anInt764;
								local3558 = local3030.aShortArray105[local544];
								if (local3514 >= 765) {
									arg4.method683((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt10010);
								} else if (local3514 > 0) {
									if (local3558 != -1) {
										local3568 = -16777216;
										if (local3558 != -1 && this.method2998(this.aClass87_Sub3_5.anInterface6_11.method6357(local3558).aByte86)) {
											local3568 = -1694498816;
										}
										arg4.method693((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray103[local394] / (float) super.anInt9344, (float) local3030.aShortArray103[local454] / (float) super.anInt9344, (float) local3030.aShortArray103[local514] / (float) super.anInt9344, (float) local3030.aShortArray102[local394] / (float) super.anInt9344, (float) local3030.aShortArray102[local454] / (float) super.anInt9344, (float) local3030.aShortArray102[local514] / (float) super.anInt9344, local3568 | local3030.anIntArray547[local394] & 0xFFFFFF, local3568 | local3030.anIntArray547[local454] & 0xFFFFFF, local3568 | local3030.anIntArray547[local514] & 0xFFFFFF, arg3.anInt10010, arg8[local394], arg8[local454], arg8[local514], local3558);
									} else if ((local3030.anIntArray547[local394] & 0xFFFFFF) != 0) {
										if (local3558 != -1 && this.method2998(this.aClass87_Sub3_5.anInterface6_11.method6357(local3558).aByte86)) {
											arg4.anInt768 = -1694498816;
										}
										arg4.method685((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static535.method7475(arg8[local394] << 24 | arg3.anInt10010, local3030.anIntArray547[local394]), Static535.method7475(arg8[local454] << 24 | arg3.anInt10010, local3030.anIntArray547[local454]), Static535.method7475(arg8[local514] << 24 | arg3.anInt10010, local3030.anIntArray547[local514]));
										arg4.anInt768 = 0;
									}
								} else if (local3558 != -1) {
									local3568 = -16777216;
									if (local3558 != -1 && this.method2998(this.aClass87_Sub3_5.anInterface6_11.method6357(local3558).aByte86)) {
										local3568 = -1694498816;
									}
									arg4.method693((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray103[local394] / (float) super.anInt9344, (float) local3030.aShortArray103[local454] / (float) super.anInt9344, (float) local3030.aShortArray103[local514] / (float) super.anInt9344, (float) local3030.aShortArray102[local394] / (float) super.anInt9344, (float) local3030.aShortArray102[local454] / (float) super.anInt9344, (float) local3030.aShortArray102[local514] / (float) super.anInt9344, local3568 | local3030.anIntArray547[local394] & 0xFFFFFF, local3568 | local3030.anIntArray547[local454] & 0xFFFFFF, local3568 | local3030.anIntArray547[local514] & 0xFFFFFF, 0, 0, 0, 0, local3558);
								} else if ((local3030.anIntArray547[local394] & 0xFFFFFF) != 0) {
									if (local3558 != -1 && this.method2998(this.aClass87_Sub3_5.anInterface6_11.method6357(local3558).aByte86)) {
										arg4.anInt768 = -1694498816;
									}
									arg4.method685((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray547[local394], local3030.anIntArray547[local454], local3030.anIntArray547[local514]);
									arg4.anInt768 = 0;
								}
							}
						}
						return;
					}
					for (local544 = 0; local544 < local3030.aShort104; local544++) {
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
							arg4.aBoolean60 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt764 || local3486 > arg4.anInt764 || local3490 > arg4.anInt764;
							local3558 = local3030.aShortArray105[local544];
							if (local3514 < 765) {
								if (local3558 != -1 && this.method2998(this.aClass87_Sub3_5.anInterface6_11.method6357(local3558).aByte86)) {
									arg4.anInt768 = -1694498816;
								}
								if (local3514 > 0) {
									if (local3558 != -1) {
										local3568 = -16777216;
										if (local3558 != -1 && this.method2998(this.aClass87_Sub3_5.anInterface6_11.method6357(local3558).aByte86)) {
											local3568 = -1694498816;
										}
										arg4.method693((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray103[local394] / (float) super.anInt9344, (float) local3030.aShortArray103[local454] / (float) super.anInt9344, (float) local3030.aShortArray103[local514] / (float) super.anInt9344, (float) local3030.aShortArray102[local394] / (float) super.anInt9344, (float) local3030.aShortArray102[local454] / (float) super.anInt9344, (float) local3030.aShortArray102[local514] / (float) super.anInt9344, local3568 | local3030.anIntArray547[local394] & 0xFFFFFF, local3568 | local3030.anIntArray547[local454] & 0xFFFFFF, local3568 | local3030.anIntArray547[local514] & 0xFFFFFF, arg3.anInt10010, arg8[local394], arg8[local454], arg8[local514], local3558);
									} else if ((local3030.anIntArray547[local394] & 0xFFFFFF) != 0) {
										if (local3558 != -1 && this.method2998(this.aClass87_Sub3_5.anInterface6_11.method6357(local3558).aByte86)) {
											arg4.anInt768 = -1694498816;
										}
										arg4.method685((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static535.method7475(arg8[local394] << 24 | arg3.anInt10010, local3030.anIntArray547[local394]), Static535.method7475(arg8[local454] << 24 | arg3.anInt10010, local3030.anIntArray547[local454]), Static535.method7475(arg8[local514] << 24 | arg3.anInt10010, local3030.anIntArray547[local514]));
										arg4.anInt768 = 0;
									}
								} else if (local3558 != -1) {
									local3568 = -16777216;
									if (local3558 != -1 && this.method2998(this.aClass87_Sub3_5.anInterface6_11.method6357(local3558).aByte86)) {
										local3568 = -1694498816;
									}
									arg4.method693((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray103[local394] / (float) super.anInt9344, (float) local3030.aShortArray103[local454] / (float) super.anInt9344, (float) local3030.aShortArray103[local514] / (float) super.anInt9344, (float) local3030.aShortArray102[local394] / (float) super.anInt9344, (float) local3030.aShortArray102[local454] / (float) super.anInt9344, (float) local3030.aShortArray102[local514] / (float) super.anInt9344, local3568 | local3030.anIntArray547[local394] & 0xFFFFFF, local3568 | local3030.anIntArray547[local454] & 0xFFFFFF, local3568 | local3030.anIntArray547[local514] & 0xFFFFFF, 0, 0, 0, 0, local3558);
								} else if ((local3030.anIntArray547[local394] & 0xFFFFFF) != 0) {
									if (local3558 != -1 && this.method2998(this.aClass87_Sub3_5.anInterface6_11.method6357(local3558).aByte86)) {
										arg4.anInt768 = -1694498816;
									}
									arg4.method685((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray547[local394], local3030.anIntArray547[local454], local3030.anIntArray547[local514]);
									arg4.anInt768 = 0;
								}
								arg4.anInt768 = 0;
							} else {
								arg4.method683((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt10010);
							}
						}
					}
					return;
				}
				for (local544 = 0; local544 < local3030.aShort104; local544++) {
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
						arg4.aBoolean60 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt764 || local3486 > arg4.anInt764 || local3490 > arg4.anInt764;
						if (local3514 >= 765) {
							arg4.method683((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt10010);
						} else if (local3514 > 0) {
							if ((local3030.anIntArray547[local394] & 0xFFFFFF) != 0) {
								arg4.method685((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static64.method1236(arg3.anInt10010, local3030.anIntArray547[local394], arg8[local394]), Static64.method1236(arg3.anInt10010, local3030.anIntArray547[local454], arg8[local454]), Static64.method1236(arg3.anInt10010, local3030.anIntArray547[local514], arg8[local514]));
							}
						} else if ((local3030.anIntArray547[local394] & 0xFFFFFF) != 0) {
							arg4.method685((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray547[local394], local3030.anIntArray547[local454], local3030.anIntArray547[local514]);
						}
					}
				}
			}
		} else if ((local6.aByte123 & 0x2) == 0) {
			if (arg9 != 0) {
				if ((local6.aByte123 & 0x4) == 0) {
					if ((arg9 & 0x2) != 0) {
						return;
					}
				} else if ((arg9 & 0x1) != 0) {
					return;
				}
			}
			@Pc(36) int local36 = arg0 * super.anInt9344;
			local41 = local36 + super.anInt9344;
			local46 = arg1 * super.anInt9344;
			local51 = local46 + super.anInt9344;
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
			if ((local6.aByte123 & 0x1) == 0 || arg2) {
				local73 = super.anIntArrayArray89[arg0][arg1];
				local848 = super.anIntArrayArray89[arg0 + 1][arg1];
				local859 = super.anIntArrayArray89[arg0 + 1][arg1 + 1];
				@Pc(868) int local868 = super.anIntArrayArray89[arg0][arg1 + 1];
				if (this.anInt3627 == -1) {
					local100 = this.aFloat90 + this.aFloat93 * (float) local36 + this.aFloat89 * (float) local73 + this.aFloat95 * (float) local46;
					if (local100 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local125 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local848 + this.aFloat95 * (float) local46;
					if (local125 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local150 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local859 + this.aFloat95 * (float) local51;
					if (local150 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local175 = this.aFloat90 + this.aFloat93 * (float) local36 + this.aFloat89 * (float) local868 + this.aFloat95 * (float) local51;
					if (local175 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
				} else {
					local100 = this.aFloat90 + this.aFloat93 * (float) local36 + this.aFloat89 * (float) local73 + this.aFloat95 * (float) local46;
					local125 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local848 + this.aFloat95 * (float) local46;
					local150 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local859 + this.aFloat95 * (float) local51;
					local175 = this.aFloat90 + this.aFloat93 * (float) local36 + this.aFloat89 * (float) local868 + this.aFloat95 * (float) local51;
				}
				if (arg2) {
					local261 = (int) (local100 - (float) arg3.anInt10013);
					if (local261 > 255) {
						local261 = 255;
					}
					@Pc(1097) int local1097;
					if (local261 > 0) {
						local53 = local261;
						local1097 = local6.aShort118 * local261 / 255;
						if (local1097 > 0) {
							local73 -= local1097;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt10013);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local55 = local261;
						local1097 = local6.aShort117 * local261 / 255;
						if (local1097 > 0) {
							local848 -= local1097;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt10013);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local57 = local261;
						local1097 = local6.aShort120 * local261 / 255;
						if (local1097 > 0) {
							local859 -= local1097;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt10013);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local59 = local261;
						local1097 = local6.aShort116 * local261 / 255;
						if (local1097 > 0) {
							local868 -= local1097;
						}
					}
				} else if (arg3.aBoolean738) {
					local261 = (int) (local100 - (float) arg3.anInt10013);
					if (local261 > 0) {
						local53 = local261;
						if (local261 > 255) {
							local53 = 255;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt10013);
					if (local261 > 0) {
						local55 = local261;
						if (local261 > 255) {
							local55 = 255;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt10013);
					if (local261 > 0) {
						local57 = local261;
						if (local261 > 255) {
							local57 = 255;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt10013);
					if (local261 > 0) {
						local59 = local261;
						if (local261 > 255) {
							local59 = 255;
						}
					}
				}
				if (this.anInt3627 == -1) {
					local351 = this.aFloat97 + this.aFloat94 * (float) local36 + this.aFloat88 * (float) local73 + this.aFloat96 * (float) local46;
					local364 = arg4.anInt765 + (int) (local351 * (float) this.aClass87_Sub3_5.anInt9466 / local100);
					local381 = this.aFloat91 + this.aFloat86 * (float) local36 + this.aFloat92 * (float) local73 + this.aFloat87 * (float) local46;
					local394 = arg4.anInt769 + (int) (local381 * (float) this.aClass87_Sub3_5.anInt9493 / local100);
					local411 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local848 + this.aFloat96 * (float) local46;
					local424 = arg4.anInt765 + (int) (local411 * (float) this.aClass87_Sub3_5.anInt9466 / local125);
					local441 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local848 + this.aFloat87 * (float) local46;
					local454 = arg4.anInt769 + (int) (local441 * (float) this.aClass87_Sub3_5.anInt9493 / local125);
					local471 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local859 + this.aFloat96 * (float) local51;
					local484 = arg4.anInt765 + (int) (local471 * (float) this.aClass87_Sub3_5.anInt9466 / local150);
					local501 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local859 + this.aFloat87 * (float) local51;
					local514 = arg4.anInt769 + (int) (local501 * (float) this.aClass87_Sub3_5.anInt9493 / local150);
					local531 = this.aFloat97 + this.aFloat94 * (float) local36 + this.aFloat88 * (float) local868 + this.aFloat96 * (float) local51;
					local544 = arg4.anInt765 + (int) (local531 * (float) this.aClass87_Sub3_5.anInt9466 / local175);
					local561 = this.aFloat91 + this.aFloat86 * (float) local36 + this.aFloat92 * (float) local868 + this.aFloat87 * (float) local51;
					local574 = arg4.anInt769 + (int) (local561 * (float) this.aClass87_Sub3_5.anInt9493 / local175);
				} else {
					local351 = this.aFloat97 + this.aFloat94 * (float) local36 + this.aFloat88 * (float) local73 + this.aFloat96 * (float) local46;
					local364 = arg4.anInt765 + (int) (local351 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local381 = this.aFloat91 + this.aFloat86 * (float) local36 + this.aFloat92 * (float) local73 + this.aFloat87 * (float) local46;
					local394 = arg4.anInt769 + (int) (local381 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local411 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local848 + this.aFloat96 * (float) local46;
					local424 = arg4.anInt765 + (int) (local411 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local441 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local848 + this.aFloat87 * (float) local46;
					local454 = arg4.anInt769 + (int) (local441 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local471 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local859 + this.aFloat96 * (float) local51;
					local484 = arg4.anInt765 + (int) (local471 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local501 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local859 + this.aFloat87 * (float) local51;
					local514 = arg4.anInt769 + (int) (local501 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local531 = this.aFloat97 + this.aFloat94 * (float) local36 + this.aFloat88 * (float) local868 + this.aFloat96 * (float) local51;
					local544 = arg4.anInt765 + (int) (local531 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local561 = this.aFloat91 + this.aFloat86 * (float) local36 + this.aFloat92 * (float) local868 + this.aFloat87 * (float) local51;
					local574 = arg4.anInt769 + (int) (local561 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
				}
			} else {
				local73 = super.anIntArrayArray89[arg0][arg1];
				@Pc(79) float local79 = this.aFloat89 * (float) local73;
				if (this.anInt3627 == -1) {
					local100 = this.aFloat90 + this.aFloat93 * (float) local36 + local79 + this.aFloat95 * (float) local46;
					if (local100 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local125 = this.aFloat90 + this.aFloat93 * (float) local41 + local79 + this.aFloat95 * (float) local46;
					if (local125 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local150 = this.aFloat90 + this.aFloat93 * (float) local41 + local79 + this.aFloat95 * (float) local51;
					if (local150 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local175 = this.aFloat90 + this.aFloat93 * (float) local36 + local79 + this.aFloat95 * (float) local51;
					if (local175 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
				} else {
					local100 = this.aFloat90 + this.aFloat93 * (float) local36 + local79 + this.aFloat95 * (float) local46;
					local125 = this.aFloat90 + this.aFloat93 * (float) local41 + local79 + this.aFloat95 * (float) local46;
					local150 = this.aFloat90 + this.aFloat93 * (float) local41 + local79 + this.aFloat95 * (float) local51;
					local175 = this.aFloat90 + this.aFloat93 * (float) local36 + local79 + this.aFloat95 * (float) local51;
				}
				if (arg3.aBoolean738) {
					local261 = (int) (local100 - (float) arg3.anInt10013);
					if (local261 > 0) {
						local53 = local261;
						if (local261 > 255) {
							local53 = 255;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt10013);
					if (local261 > 0) {
						local55 = local261;
						if (local261 > 255) {
							local55 = 255;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt10013);
					if (local261 > 0) {
						local57 = local261;
						if (local261 > 255) {
							local57 = 255;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt10013);
					if (local261 > 0) {
						local59 = local261;
						if (local261 > 255) {
							local59 = 255;
						}
					}
				}
				@Pc(324) float local324 = this.aFloat88 * (float) local73;
				@Pc(330) float local330 = this.aFloat92 * (float) local73;
				if (this.anInt3627 == -1) {
					local351 = this.aFloat97 + this.aFloat94 * (float) local36 + local324 + this.aFloat96 * (float) local46;
					local364 = arg4.anInt765 + (int) (local351 * (float) this.aClass87_Sub3_5.anInt9466 / local100);
					local381 = this.aFloat91 + this.aFloat86 * (float) local36 + local330 + this.aFloat87 * (float) local46;
					local394 = arg4.anInt769 + (int) (local381 * (float) this.aClass87_Sub3_5.anInt9493 / local100);
					local411 = this.aFloat97 + this.aFloat94 * (float) local41 + local324 + this.aFloat96 * (float) local46;
					local424 = arg4.anInt765 + (int) (local411 * (float) this.aClass87_Sub3_5.anInt9466 / local125);
					local441 = this.aFloat91 + this.aFloat86 * (float) local41 + local330 + this.aFloat87 * (float) local46;
					local454 = arg4.anInt769 + (int) (local441 * (float) this.aClass87_Sub3_5.anInt9493 / local125);
					local471 = this.aFloat97 + this.aFloat94 * (float) local41 + local324 + this.aFloat96 * (float) local51;
					local484 = arg4.anInt765 + (int) (local471 * (float) this.aClass87_Sub3_5.anInt9466 / local150);
					local501 = this.aFloat91 + this.aFloat86 * (float) local41 + local330 + this.aFloat87 * (float) local51;
					local514 = arg4.anInt769 + (int) (local501 * (float) this.aClass87_Sub3_5.anInt9493 / local150);
					local531 = this.aFloat97 + this.aFloat94 * (float) local36 + local324 + this.aFloat96 * (float) local51;
					local544 = arg4.anInt765 + (int) (local531 * (float) this.aClass87_Sub3_5.anInt9466 / local175);
					local561 = this.aFloat91 + this.aFloat86 * (float) local36 + local330 + this.aFloat87 * (float) local51;
					local574 = arg4.anInt769 + (int) (local561 * (float) this.aClass87_Sub3_5.anInt9493 / local175);
				} else {
					local351 = this.aFloat97 + this.aFloat94 * (float) local36 + local324 + this.aFloat96 * (float) local46;
					local364 = arg4.anInt765 + (int) (local351 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local381 = this.aFloat91 + this.aFloat86 * (float) local36 + local330 + this.aFloat87 * (float) local46;
					local394 = arg4.anInt769 + (int) (local381 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local411 = this.aFloat97 + this.aFloat94 * (float) local41 + local324 + this.aFloat96 * (float) local46;
					local424 = arg4.anInt765 + (int) (local411 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local441 = this.aFloat91 + this.aFloat86 * (float) local41 + local330 + this.aFloat87 * (float) local46;
					local454 = arg4.anInt769 + (int) (local441 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local471 = this.aFloat97 + this.aFloat94 * (float) local41 + local324 + this.aFloat96 * (float) local51;
					local484 = arg4.anInt765 + (int) (local471 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local501 = this.aFloat91 + this.aFloat86 * (float) local41 + local330 + this.aFloat87 * (float) local51;
					local514 = arg4.anInt769 + (int) (local501 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local531 = this.aFloat97 + this.aFloat94 * (float) local36 + local324 + this.aFloat96 * (float) local51;
					local544 = arg4.anInt765 + (int) (local531 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local561 = this.aFloat91 + this.aFloat86 * (float) local36 + local330 + this.aFloat87 * (float) local51;
					local574 = arg4.anInt769 + (int) (local561 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
				}
			}
			@Pc(1842) boolean local1842 = local6.aShort119 != -1 && this.method2998(this.aClass87_Sub3_5.anInterface6_11.method6357(local6.aShort119).aByte86);
			if (this.anInt3627 == -1) {
				local848 = local55 + local57 + local59;
				if ((local484 - local544) * (local454 - local574) - (local514 - local574) * (local424 - local544) > 0) {
					arg4.aBoolean60 = local484 < 0 || local544 < 0 || local424 < 0 || local484 > arg4.anInt764 || local544 > arg4.anInt764 || local424 > arg4.anInt764;
					if (local848 >= 765) {
						arg4.method683((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, arg3.anInt10010);
					} else if (local848 > 0) {
						if (local6.aShort119 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method693((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt9774 & 0xFFFFFF, local859 | local6.anInt9776 & 0xFFFFFF, local859 | local6.anInt9775 & 0xFFFFFF, arg3.anInt10010, local57, local59, local55, local6.aShort119);
						} else {
							if (local1842) {
								arg4.anInt768 = 100;
							}
							arg4.method685((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, Static535.method7475(local57 << 24 | arg3.anInt10010, local6.anInt9774), Static535.method7475(local59 << 24 | arg3.anInt10010, local6.anInt9776), Static535.method7475(local55 << 24 | arg3.anInt10010, local6.anInt9775));
							arg4.anInt768 = 0;
						}
					} else if (local6.aShort119 >= 0) {
						local859 = -16777216;
						if (local1842) {
							local859 = -1694498816;
						}
						arg4.method693((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt9774 & 0xFFFFFF, local859 | local6.anInt9776 & 0xFFFFFF, local859 | local6.anInt9775 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort119);
					} else {
						if (local1842) {
							arg4.anInt768 = 100;
						}
						arg4.method685((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, local6.anInt9774, local6.anInt9776, local6.anInt9775);
						arg4.anInt768 = 0;
					}
				}
				local848 = local53 + local55 + local59;
				if ((local364 - local424) * (local574 - local454) - (local394 - local454) * (local544 - local424) > 0) {
					arg4.aBoolean60 = local364 < 0 || local424 < 0 || local544 < 0 || local364 > arg4.anInt764 || local424 > arg4.anInt764 || local544 > arg4.anInt764;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt768 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort119 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method693((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt9777 & 0xFFFFFF, local859 | local6.anInt9775 & 0xFFFFFF, local859 | local6.anInt9776 & 0xFFFFFF, arg3.anInt10010, local53, local55, local59, local6.aShort119);
								return;
							}
							if (local1842) {
								arg4.anInt768 = 100;
							}
							arg4.method685((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, Static535.method7475(local53 << 24 | arg3.anInt10010, local6.anInt9777), Static535.method7475(local55 << 24 | arg3.anInt10010, local6.anInt9775), Static535.method7475(local59 << 24 | arg3.anInt10010, local6.anInt9776));
							arg4.anInt768 = 0;
							return;
						}
						if (local6.aShort119 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method693((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt9777 & 0xFFFFFF, local859 | local6.anInt9775 & 0xFFFFFF, local859 | local6.anInt9776 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort119);
							return;
						}
						if (local1842) {
							arg4.anInt768 = 100;
						}
						arg4.method685((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, local6.anInt9777, local6.anInt9775, local6.anInt9776);
						arg4.anInt768 = 0;
						return;
					}
					arg4.method683((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, arg3.anInt10010);
					return;
				}
			} else {
				local848 = local55 + local57 + local59;
				if ((local484 - local544) * (local454 - local574) - (local514 - local574) * (local424 - local544) > 0) {
					arg4.aBoolean60 = local484 < 0 || local544 < 0 || local424 < 0 || local484 > arg4.anInt764 || local544 > arg4.anInt764 || local424 > arg4.anInt764;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt768 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort119 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method693((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt9774 & 0xFFFFFF, local859 | local6.anInt9776 & 0xFFFFFF, local859 | local6.anInt9775 & 0xFFFFFF, arg3.anInt10010, local57, local59, local55, local6.aShort119);
							} else {
								if (local1842) {
									arg4.anInt768 = 100;
								}
								arg4.method685((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, Static535.method7475(local57 << 24 | arg3.anInt10010, local6.anInt9774), Static535.method7475(local59 << 24 | arg3.anInt10010, local6.anInt9776), Static535.method7475(local55 << 24 | arg3.anInt10010, local6.anInt9775));
								arg4.anInt768 = 0;
							}
						} else if (local6.aShort119 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method693((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt9774 & 0xFFFFFF, local859 | local6.anInt9776 & 0xFFFFFF, local859 | local6.anInt9775 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort119);
						} else {
							if (local1842) {
								arg4.anInt768 = 100;
							}
							arg4.method685((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, local6.anInt9774, local6.anInt9776, local6.anInt9775);
							arg4.anInt768 = 0;
						}
					} else {
						arg4.method683((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) local150, (float) local175, (float) local125, arg3.anInt10010);
					}
				}
				local848 = local53 + local55 + local59;
				if ((local364 - local424) * (local574 - local454) - (local394 - local454) * (local544 - local424) > 0) {
					arg4.aBoolean60 = local364 < 0 || local424 < 0 || local544 < 0 || local364 > arg4.anInt764 || local424 > arg4.anInt764 || local544 > arg4.anInt764;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt768 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort119 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method693((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt9777 & 0xFFFFFF, local859 | local6.anInt9775 & 0xFFFFFF, local859 | local6.anInt9776 & 0xFFFFFF, arg3.anInt10010, local53, local55, local59, local6.aShort119);
								return;
							}
							if (local1842) {
								arg4.anInt768 = 100;
							}
							arg4.method685((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, Static535.method7475(local53 << 24 | arg3.anInt10010, local6.anInt9777), Static535.method7475(local55 << 24 | arg3.anInt10010, local6.anInt9775), Static535.method7475(local59 << 24 | arg3.anInt10010, local6.anInt9776));
							arg4.anInt768 = 0;
							return;
						}
						if (local6.aShort119 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method693((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt9777 & 0xFFFFFF, local859 | local6.anInt9775 & 0xFFFFFF, local859 | local6.anInt9776 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort119);
							return;
						}
						if (local1842) {
							arg4.anInt768 = 100;
						}
						arg4.method685((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, local6.anInt9777, local6.anInt9775, local6.anInt9776);
						arg4.anInt768 = 0;
						return;
					}
					arg4.method683((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) local100, (float) local125, (float) local175, arg3.anInt10010);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
	@Override
	public void method7815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3000(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class6_Sub3 local3 = this.aClass87_Sub3_5.aClass6_Sub3_2;
		this.anInt3627 = -1;
		this.aFloat94 = local3.aFloat200;
		this.aFloat88 = local3.aFloat201;
		this.aFloat96 = local3.aFloat197;
		this.aFloat97 = local3.aFloat206;
		this.aFloat86 = local3.aFloat207;
		this.aFloat92 = local3.aFloat199;
		this.aFloat87 = local3.aFloat202;
		this.aFloat91 = local3.aFloat205;
		this.aFloat93 = local3.aFloat203;
		this.aFloat89 = local3.aFloat208;
		this.aFloat95 = local3.aFloat198;
		this.aFloat90 = local3.aFloat204;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt9348 && local78 >= 0 && local78 < super.anInt9340) {
						this.method3000(local72, local78, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!bh;[I)V")
	@Override
	public void method7820(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass292ArrayArray1 == null) {
			this.aClass292ArrayArray1 = new Class292[super.anInt9348][super.anInt9340];
			this.aClass55ArrayArray1 = new Class55[super.anInt9348][super.anInt9340];
		} else if (this.aClass354ArrayArray1 != null || this.aClass223ArrayArray1 != null) {
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
				if (local67 != 0 && local67 != super.anInt9344 || local73 != 0 && local73 != super.anInt9344) {
					local29 = false;
					break;
				}
			}
		}
		if (!local29) {
			@Pc(98) Class55 local98 = new Class55();
			@Pc(102) short local102 = (short) arg2.length;
			@Pc(106) short local106 = (short) arg9.length;
			local98.aShort34 = local102;
			local98.aShortArray16 = new short[local102];
			local98.aShortArray18 = new short[local102];
			local98.aShortArray19 = new short[local102];
			local98.aShortArray20 = new short[local102];
			@Pc(136) int local136;
			@Pc(291) int local291;
			@Pc(338) int local338;
			for (@Pc(127) int local127 = 0; local127 < local102; local127++) {
				@Pc(132) int local132 = arg2[local127];
				local136 = arg4[local127];
				if (local132 == 0 && local136 == 0) {
					local98.aShortArray16[local127] = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray8[arg0][arg1]);
				} else if (local132 == 0 && local136 == super.anInt9344) {
					local98.aShortArray16[local127] = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray8[arg0][arg1 + 1]);
				} else if (local132 == super.anInt9344 && local136 == super.anInt9344) {
					local98.aShortArray16[local127] = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray8[arg0 + 1][arg1 + 1]);
				} else if (local132 == super.anInt9344 && local136 == 0) {
					local98.aShortArray16[local127] = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray8[arg0 + 1][arg1]);
				} else {
					local291 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray8[arg0][arg1]) * (super.anInt9344 - local132) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray8[arg0 + 1][arg1]) * local132;
					local338 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray8[arg0][arg1 + 1]) * (super.anInt9344 - local132) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray8[arg0 + 1][arg1 + 1]) * local132;
					local98.aShortArray16[local127] = (short) (local291 * (super.anInt9344 - local136) + local338 * local136 >> super.anInt9341 * 2);
				}
				local291 = (arg0 << super.anInt9341) + local132;
				local338 = (arg1 << super.anInt9341) + local136;
				local98.aShortArray18[local127] = (short) local132;
				local98.aShortArray20[local127] = (short) local136;
				local98.aShortArray19[local127] = (short) (this.method7826(local291, local338) + (arg3 == null ? 0 : arg3[local127]));
				if (local98.aShortArray16[local127] < 2) {
					local98.aShortArray16[local127] = 2;
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
					@Pc(449) Class199 local449 = this.aClass87_Sub3_5.anInterface6_11.method6357(local338);
					if (!local449.aBoolean427) {
						local419 = true;
						if (this.method2998(local449.aByte86) || local449.aByte88 != 0 || local449.aByte87 != 0) {
							local98.aByte36 = (byte) (local98.aByte36 | 0x4);
						}
					}
				}
			}
			local98.anIntArray136 = new int[local136];
			if (arg10 != null) {
				local98.anIntArray137 = new int[local136];
			}
			local98.aShortArray15 = new short[local136];
			local98.aShortArray22 = new short[local136];
			local98.aShortArray17 = new short[local136];
			if (local419) {
				local98.aShortArray23 = new short[local136];
				local98.aShortArray21 = new short[local136];
			}
			for (local338 = 0; local338 < local106; local338++) {
				if (arg9[local338] >= 0 || arg10 != null && arg10[local338] >= 0) {
					if (arg9[local338] >= 0) {
						local98.anIntArray136[local98.aShort35] = Static415.method6349(arg9[local338]);
					} else {
						local98.anIntArray136[local98.aShort35] = -1;
					}
					if (arg10 != null) {
						if (arg10[local338] == -1) {
							local98.anIntArray137[local98.aShort35] = -1;
						} else {
							local98.anIntArray137[local98.aShort35] = Static415.method6349(arg10[local338]);
						}
					}
					local98.aShortArray15[local98.aShort35] = (short) arg6[local338];
					local98.aShortArray22[local98.aShort35] = (short) arg7[local338];
					local98.aShortArray17[local98.aShort35] = (short) arg8[local338];
					if (local419) {
						if (arg11[local338] == -1 || this.aClass87_Sub3_5.anInterface6_11.method6357(arg11[local338]).aBoolean427) {
							local98.aShortArray23[local98.aShort35] = -1;
						} else {
							local98.aShortArray23[local98.aShort35] = (short) arg11[local338];
							local98.aShortArray21[local98.aShort35] = (short) arg12[local338];
						}
					}
					local98.aShort35++;
				}
			}
			this.aClass55ArrayArray1[arg0][arg1] = local98;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(668) Class292 local668 = new Class292();
			local67 = arg9[0];
			local73 = arg11[0];
			if (arg10 != null) {
				local668.anInt8305 = Static174.method3223(this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray8[arg0][arg1], Static415.method6349(arg10[0]));
				if (local67 == -1) {
					local668.aByte109 = (byte) (local668.aByte109 | 0x2);
				}
			}
			if (super.anIntArrayArray89[arg0][arg1] == super.anIntArrayArray89[arg0 + 1][arg1] && super.anIntArrayArray89[arg0][arg1] == super.anIntArrayArray89[arg0 + 1][arg1 + 1] && super.anIntArrayArray89[arg0][arg1] == super.anIntArrayArray89[arg0][arg1 + 1]) {
				local668.aByte109 = (byte) (local668.aByte109 | 0x1);
			}
			@Pc(766) Class199 local766 = null;
			if (local73 != -1) {
				local766 = this.aClass87_Sub3_5.anInterface6_11.method6357(local73);
			}
			if (local766 == null || (local668.aByte109 & 0x2) != 0 || local766.aBoolean427) {
				@Pc(893) short local893 = Static415.method6349(local67);
				local668.aShort112 = (short) Static174.method3223(this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray8[arg0][arg1], local893);
				local668.aShort108 = (short) Static174.method3223(this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray8[arg0 + 1][arg1], local893);
				local668.aShort111 = (short) Static174.method3223(this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray8[arg0 + 1][arg1 + 1], local893);
				local668.aShort109 = (short) Static174.method3223(this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray8[arg0][arg1 + 1], local893);
				local668.aShort110 = -1;
			} else {
				local668.aShort112 = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray8[arg0][arg1]);
				local668.aShort108 = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray8[arg0 + 1][arg1]);
				local668.aShort111 = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray8[arg0 + 1][arg1 + 1]);
				local668.aShort109 = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray8[arg0][arg1 + 1]);
				local668.aShort110 = (short) local73;
				if (this.method2998(local766.aByte86) || local766.aByte88 != 0 || local766.aByte87 != 0) {
					local668.aByte109 = (byte) (local668.aByte109 | 0x4);
				}
			}
			this.aClass292ArrayArray1[arg0][arg1] = local668;
		}
	}

	@OriginalMember(owner = "client!fn", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIII[[ZLclient!w;Lclient!b;[I[I)V")
	private void method2997(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class364 arg5, @OriginalArg(9) Class28 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean739;
		this.aClass87_Sub3_5.C(false);
		arg6.aBoolean63 = false;
		arg6.aBoolean62 = false;
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
					if (this.aClass354ArrayArray1 == null) {
						if (this.aClass223ArrayArray1[local32][local35] != null) {
							@Pc(573) Class223 local573 = this.aClass223ArrayArray1[local32][local35];
							for (local81 = 0; local81 < local573.aShort93; local81++) {
								arg7[local81] = local26 + local573.aShortArray70[local81] * 4 / super.anInt9344;
								arg8[local81] = local30 - local573.aShortArray73[local81] * 4 / super.anInt9344;
							}
							for (local370 = 0; local370 < local573.aShort92; local370++) {
								local375 = local370 * 3;
								local379 = local375 + 1;
								local383 = local379 + 1;
								local387 = arg7[local375];
								local391 = arg7[local379];
								local395 = arg7[local383];
								local399 = arg8[local375];
								local403 = arg8[local379];
								local407 = arg8[local383];
								if (local573.anIntArray426 == null || local573.anIntArray426[local370] == 0) {
									arg6.method685((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local573.anIntArray425[local375], local573.anIntArray425[local379], local573.anIntArray425[local383]);
								} else {
									local432 = local573.anIntArray426[local370];
									arg6.method685((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local432, local432, local432);
								}
							}
						}
					} else if (this.aClass354ArrayArray1[local32][local35] != null) {
						@Pc(63) Class354 local63 = this.aClass354ArrayArray1[local32][local35];
						if (local63.aShort119 != -1 && (local63.aByte123 & 0x2) == 0 && local63.anInt9773 == 0) {
							local81 = this.aClass87_Sub3_5.method7978(local63.aShort119);
							arg6.method684((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static174.method3223(local63.anInt9774, local81), (float) Static174.method3223(local63.anInt9776, local81), (float) Static174.method3223(local63.anInt9775, local81));
							arg6.method684((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static174.method3223(local63.anInt9777, local81), (float) Static174.method3223(local63.anInt9775, local81), (float) Static174.method3223(local63.anInt9776, local81));
						} else if (local63.anInt9773 == 0) {
							arg6.method685((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, local63.anInt9774, local63.anInt9776, local63.anInt9775);
							arg6.method685((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, local63.anInt9777, local63.anInt9775, local63.anInt9776);
						} else {
							local81 = local63.anInt9773;
							arg6.method685((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, Static535.method7475(local63.anInt9774 & 0xFF000000, local81), Static535.method7475(local63.anInt9776 & 0xFF000000, local81), Static535.method7475(local63.anInt9775 & 0xFF000000, local81));
							arg6.method685((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, Static535.method7475(local63.anInt9777 & 0xFF000000, local81), Static535.method7475(local63.anInt9775 & 0xFF000000, local81), Static535.method7475(local63.anInt9776 & 0xFF000000, local81));
						}
					} else if (this.aClass279ArrayArray1[local32][local35] != null) {
						@Pc(332) Class279 local332 = this.aClass279ArrayArray1[local32][local35];
						for (local81 = 0; local81 < local332.aShort103; local81++) {
							arg7[local81] = local26 + local332.aShortArray103[local81] * 4 / super.anInt9344;
							arg8[local81] = local30 - local332.aShortArray102[local81] * 4 / super.anInt9344;
						}
						for (local370 = 0; local370 < local332.aShort104; local370++) {
							local375 = local370 * 3;
							local379 = local375 + 1;
							local383 = local379 + 1;
							local387 = arg7[local375];
							local391 = arg7[local379];
							local395 = arg7[local383];
							local399 = arg8[local375];
							local403 = arg8[local379];
							local407 = arg8[local383];
							if (local332.anIntArray546 != null && local332.anIntArray546[local370] != 0 && (local332.aShortArray105 == null || local332.aShortArray105 != null && local332.aShortArray105[local370] == -1)) {
								local432 = local332.anIntArray546[local370];
								arg6.method685((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, Static535.method7475(-(local332.anIntArray547[local375] & -16777216) - 16777216, local432), Static535.method7475(-(local332.anIntArray547[local379] & -16777216) - 16777216, local432), Static535.method7475(-(local332.anIntArray547[local383] & -16777216) - 16777216, local432));
							} else if (local332.aShortArray105 == null || local332.aShortArray105[local370] == -1) {
								arg6.method685((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local332.anIntArray547[local375], local332.anIntArray547[local379], local332.anIntArray547[local383]);
							} else {
								local432 = this.aClass87_Sub3_5.method7978(local332.aShortArray105[local370]);
								arg6.method684((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, (float) local432, (float) local432, (float) local432);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean63 = true;
		this.aClass87_Sub3_5.C(local14);
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Z")
	private boolean method2998(@OriginalArg(0) int arg0) {
		if ((this.anInt3626 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(IIZLclient!w;Lclient!b;[I[I[I[II)V")
	private void method2999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class364 arg3, @OriginalArg(4) Class28 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class223 local6 = this.aClass223ArrayArray1[arg0][arg1];
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
		if (this.anInt3627 == -1) {
			for (local21 = 0; local21 < local6.aShort93; local21++) {
				local32 = local6.aShortArray70[local21] + (arg0 << super.anInt9341);
				local37 = local6.aShortArray69[local21];
				local47 = local6.aShortArray73[local21] + (arg1 << super.anInt9341);
				local68 = this.aFloat90 + this.aFloat93 * (float) local32 + this.aFloat89 * (float) local37 + this.aFloat95 * (float) local47;
				if (local68 <= (float) this.aClass87_Sub3_5.anInt9482) {
					return;
				}
				arg8[local21] = 0;
				if (arg2) {
					local89 = (int) (local68 - (float) arg3.anInt10013);
					if (local89 > 255) {
						local89 = 255;
					}
					if (local89 > 0) {
						arg8[local21] = local89;
						local109 = local6.aShortArray68[local21] * local89 / 255;
						if (local109 > 0) {
							local37 -= local109;
						}
					}
				} else if (arg3.aBoolean738) {
					local89 = (int) (local68 - (float) arg3.anInt10013);
					if (local89 > 0) {
						arg8[local21] = local89;
						if (arg8[local21] > 255) {
							arg8[local21] = 255;
						}
					}
				}
				local162 = this.aFloat97 + this.aFloat94 * (float) local32 + this.aFloat88 * (float) local37 + this.aFloat96 * (float) local47;
				local183 = this.aFloat91 + this.aFloat86 * (float) local32 + this.aFloat92 * (float) local37 + this.aFloat87 * (float) local47;
				arg5[local21] = arg4.anInt765 + (int) (local162 * (float) this.aClass87_Sub3_5.anInt9466 / local68);
				arg6[local21] = arg4.anInt769 + (int) (local183 * (float) this.aClass87_Sub3_5.anInt9493 / local68);
				arg7[local21] = (int) local68;
			}
		} else {
			for (local21 = 0; local21 < local6.aShort93; local21++) {
				local32 = local6.aShortArray70[local21] + (arg0 << super.anInt9341);
				local37 = local6.aShortArray69[local21];
				local47 = local6.aShortArray73[local21] + (arg1 << super.anInt9341);
				local68 = this.aFloat90 + this.aFloat93 * (float) local32 + this.aFloat89 * (float) local37 + this.aFloat95 * (float) local47;
				arg8[local21] = 0;
				if (arg2) {
					local89 = this.anInt3627 - arg3.anInt10013;
					if (local89 > 255) {
						local89 = 255;
					}
					if (local89 > 0) {
						arg8[local21] = local89;
						local109 = local6.aShortArray68[local21] * local89 / 255;
						if (local109 > 0) {
							local37 -= local109;
						}
					}
				} else if (arg3.aBoolean738) {
					local89 = this.anInt3627 - arg3.anInt10013;
					if (local89 > 0) {
						arg8[local21] = local89;
						if (arg8[local21] > 255) {
							arg8[local21] = 255;
						}
					}
				}
				local162 = this.aFloat97 + this.aFloat94 * (float) local32 + this.aFloat88 * (float) local37 + this.aFloat96 * (float) local47;
				local183 = this.aFloat91 + this.aFloat86 * (float) local32 + this.aFloat92 * (float) local37 + this.aFloat87 * (float) local47;
				arg5[local21] = arg4.anInt765 + (int) (local162 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
				arg6[local21] = arg4.anInt769 + (int) (local183 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
				arg7[local21] = (int) local68;
			}
		}
		@Pc(426) float local426 = (float) super.anInt9344;
		for (local89 = 0; local89 < local6.aShort92; local89++) {
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
				arg4.aBoolean60 = local445 < 0 || local449 < 0 || local453 < 0 || local445 > arg4.anInt764 || local449 > arg4.anInt764 || local453 > arg4.anInt764;
				if (arg8[local109] + arg8[local437] + arg8[local441] < 765) {
					@Pc(522) int local522 = arg0 << super.anInt9341;
					@Pc(527) int local527 = arg1 << super.anInt9341;
					if ((local6.anIntArray425[local109] & 0xFFFFFF) != 0) {
						if (local6.aShortArray71[local109] == local6.aShortArray71[local437] && local6.aShortArray71[local109] == local6.aShortArray71[local441] && local6.aShortArray72[local109] == local6.aShortArray72[local437] && local6.aShortArray72[local109] == local6.aShortArray72[local441]) {
							arg4.method693((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], (float) (local522 + local6.aShortArray70[local109]) / (float) local6.aShortArray72[local109], (float) (local522 + local6.aShortArray70[local437]) / (float) local6.aShortArray72[local437], (float) (local522 + local6.aShortArray70[local441]) / (float) local6.aShortArray72[local441], (float) (local527 + local6.aShortArray73[local109]) / (float) local6.aShortArray72[local109], (float) (local527 + local6.aShortArray73[local437]) / (float) local6.aShortArray72[local437], (float) (local527 + local6.aShortArray73[local441]) / (float) local6.aShortArray72[local441], local6.anIntArray425[local109], local6.anIntArray425[local437], local6.anIntArray425[local441], arg3.anInt10010, arg8[local109], arg8[local437], arg8[local441], local6.aShortArray71[local109]);
						} else {
							arg4.method691((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], (float) (local522 + local6.aShortArray70[local109]) / local426, (float) (local522 + local6.aShortArray70[local437]) / local426, (float) (local522 + local6.aShortArray70[local441]) / local426, (float) (local527 + local6.aShortArray73[local109]) / local426, (float) (local527 + local6.aShortArray73[local437]) / local426, (float) (local527 + local6.aShortArray73[local441]) / local426, local6.anIntArray425[local109], local6.anIntArray425[local437], local6.anIntArray425[local441], arg3.anInt10010, arg8[local109], arg8[local437], arg8[local441], local6.aShortArray71[local109], local426 / (float) local6.aShortArray72[local109], local6.aShortArray71[local437], local426 / (float) local6.aShortArray72[local437], local6.aShortArray71[local441], local426 / (float) local6.aShortArray72[local441]);
						}
					}
				} else {
					arg4.method683((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], arg3.anInt10010);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		this.aByteArrayArray7 = null;
		this.aByteArrayArray8 = null;
	}

	@OriginalMember(owner = "client!fn", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub5_Sub12 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub12 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(III)V")
	private void method3000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class364 local4 = this.aClass87_Sub3_5.method7979(Thread.currentThread());
		local4.aClass28_2.anInt768 = 0;
		if (this.aClass354ArrayArray1 != null) {
			this.method2996(arg0, arg1, local4.aBoolean740, local4, local4.aClass28_2, local4.anIntArray703, local4.anIntArray704, local4.anIntArray717, local4.anIntArray710, arg2);
		} else if (this.aClass292ArrayArray1 != null) {
			this.method3003(arg0, arg1, local4.aClass28_2, local4.anIntArray703, local4.anIntArray704, local4.anIntArray717, local4.anIntArray710, arg2);
		} else if (this.aClass223ArrayArray1 != null) {
			this.method2999(arg0, arg1, local4.aBoolean740, local4, local4.aClass28_2, local4.anIntArray703, local4.anIntArray704, local4.anIntArray717, local4.anIntArray710, arg2);
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(IIIIIII[[ZLclient!w;Lclient!b;[I[I)V")
	private void method3001(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class364 arg5, @OriginalArg(9) Class28 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean739;
		this.aClass87_Sub3_5.C(false);
		arg6.aBoolean63 = false;
		arg6.aBoolean62 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(79) int local79;
					if (this.aClass292ArrayArray1[local32][local35] != null) {
						@Pc(60) Class292 local60 = this.aClass292ArrayArray1[local32][local35];
						if (local60.aShort110 != -1 && (local60.aByte109 & 0x2) == 0 && local60.anInt8305 == -1) {
							local79 = this.aClass87_Sub3_5.method7978(local60.aShort110);
							arg6.method684((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static174.method3223(local60.aShort111 & 0xFFFF, local79), (float) Static174.method3223(local60.aShort109 & 0xFFFF, local79), (float) Static174.method3223(local60.aShort108 & 0xFFFF, local79));
							arg6.method684((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static174.method3223(local60.aShort112 & 0xFFFF, local79), (float) Static174.method3223(local60.aShort108 & 0xFFFF, local79), (float) Static174.method3223(local60.aShort109 & 0xFFFF, local79));
						} else if (local60.anInt8305 == -1) {
							arg6.method684((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) (local60.aShort111 & 0xFFFF), (float) (local60.aShort109 & 0xFFFF), (float) (local60.aShort108 & 0xFFFF));
							arg6.method684((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local60.aShort112 & 0xFFFF), (float) (local60.aShort108 & 0xFFFF), (float) (local60.aShort109 & 0xFFFF));
						} else {
							local79 = local60.anInt8305;
							arg6.method684((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) local79, (float) local79, (float) local79);
							arg6.method684((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) local79, (float) local79, (float) local79);
						}
					} else if (this.aClass55ArrayArray1[local32][local35] != null) {
						@Pc(331) Class55 local331 = this.aClass55ArrayArray1[local32][local35];
						for (local79 = 0; local79 < local331.aShort34; local79++) {
							arg7[local79] = local26 + local331.aShortArray18[local79] * 4 / super.anInt9344;
							arg8[local79] = local30 - local331.aShortArray20[local79] * 4 / super.anInt9344;
						}
						for (@Pc(369) int local369 = 0; local369 < local331.aShort35; local369++) {
							@Pc(375) short local375 = local331.aShortArray15[local369];
							@Pc(380) short local380 = local331.aShortArray22[local369];
							@Pc(385) short local385 = local331.aShortArray17[local369];
							@Pc(389) int local389 = arg7[local375];
							@Pc(393) int local393 = arg7[local380];
							@Pc(397) int local397 = arg7[local385];
							@Pc(401) int local401 = arg8[local375];
							@Pc(405) int local405 = arg8[local380];
							@Pc(409) int local409 = arg8[local385];
							@Pc(423) int local423;
							if (local331.anIntArray137 != null && local331.anIntArray137[local369] != -1) {
								local423 = local331.anIntArray137[local369];
								arg6.method684((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static174.method3223(local331.aShortArray16[local375], local423), (float) Static174.method3223(local331.aShortArray16[local380], local423), (float) Static174.method3223(local331.aShortArray16[local385], local423));
							} else if (local331.aShortArray23 == null || local331.aShortArray23[local369] == -1) {
								local423 = local331.anIntArray136[local369];
								arg6.method684((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static174.method3223(local331.aShortArray16[local375], local423), (float) Static174.method3223(local331.aShortArray16[local380], local423), (float) Static174.method3223(local331.aShortArray16[local385], local423));
							} else {
								local423 = this.aClass87_Sub3_5.method7978(local331.aShortArray23[local369]);
								arg6.method684((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static174.method3223(local331.aShortArray16[local375], local423), (float) Static174.method3223(local331.aShortArray16[local380], local423), (float) Static174.method3223(local331.aShortArray16[local385], local423));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean63 = true;
		this.aClass87_Sub3_5.C(local14);
	}

	@OriginalMember(owner = "client!fn", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7821(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class364 local4 = this.aClass87_Sub3_5.method7979(Thread.currentThread());
		@Pc(7) Class28 local7 = local4.aClass28_2;
		local7.anInt768 = 0;
		local7.aBoolean60 = true;
		this.aClass87_Sub3_5.ya();
		if (this.aClass354ArrayArray1 != null || this.aClass223ArrayArray1 != null) {
			this.method2997(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray703, local4.anIntArray704);
		} else if (this.aClass292ArrayArray1 != null) {
			this.method3001(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray703, local4.anIntArray704);
		}
	}

	@OriginalMember(owner = "client!fn", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(8) boolean local8 = (this.anInt3626 & 0x20) == 0;
		if (this.aClass354ArrayArray1 == null && !local8) {
			this.aClass354ArrayArray1 = new Class354[super.anInt9348][super.anInt9340];
			this.aClass279ArrayArray1 = new Class279[super.anInt9348][super.anInt9340];
		} else if (this.aClass223ArrayArray1 == null && local8) {
			this.aClass223ArrayArray1 = new Class223[super.anInt9348][super.anInt9340];
		} else if (this.aClass292ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < arg6.length; local56++) {
			if (arg6[local56] == -1) {
				arg6[local56] = 0;
			} else {
				arg6[local56] = Static562.anIntArray652[Static415.method6349(arg6[local56]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(92) int local92 = 0; local92 < arg7.length; local92++) {
				if (arg7[local92] == -1) {
					arg7[local92] = 0;
				} else {
					arg7[local92] = Static562.anIntArray652[Static415.method6349(arg7[local92]) & 0xFFFF] << 8 | 0xFF;
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
			@Pc(130) Class223 local130 = new Class223();
			local130.aShort93 = (short) arg2.length;
			local130.aShort92 = (short) (arg2.length / 3);
			local130.aShortArray70 = new short[local130.aShort93];
			local130.aShortArray69 = new short[local130.aShort93];
			local130.aShortArray73 = new short[local130.aShort93];
			local130.anIntArray425 = new int[local130.aShort93];
			local130.aShortArray71 = new short[local130.aShort93];
			local130.aShortArray72 = new short[local130.aShort93];
			local130.aByteArray65 = new byte[local130.aShort93];
			if (arg5 != null) {
				local130.aShortArray68 = new short[local130.aShort93];
			}
			for (local186 = 0; local186 < local130.aShort93; local186++) {
				local191 = arg2[local186];
				local195 = arg4[local186];
				if (local191 == 0 && local195 == 0) {
					local215 = this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray8[arg0][arg1];
				} else if (local191 == 0 && local195 == super.anInt9344) {
					local215 = this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray8[arg0][arg1 + 1];
				} else if (local191 == super.anInt9344 && local195 == super.anInt9344) {
					local215 = this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray8[arg0 + 1][arg1 + 1];
				} else if (local191 == super.anInt9344 && local195 == 0) {
					local215 = this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray8[arg0 + 1][arg1];
				} else {
					local336 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray8[arg0][arg1]) * (super.anInt9344 - local191) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray8[arg0 + 1][arg1]) * local191;
					local383 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray8[arg0][arg1 + 1]) * (super.anInt9344 - local191) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray8[arg0 + 1][arg1 + 1]) * local191;
					local215 = local336 * (super.anInt9344 - local195) + local383 * local195 >> super.anInt9341 * 2;
				}
				local336 = (arg0 << super.anInt9341) + local191;
				local383 = (arg1 << super.anInt9341) + local195;
				local130.aShortArray70[local186] = (short) local191;
				local130.aShortArray73[local186] = (short) local195;
				local130.aShortArray69[local186] = (short) (this.method7826(local336, local383) + (arg3 == null ? 0 : arg3[local186]));
				if (local215 < 0) {
					local215 = 0;
				}
				if (arg6[local186] == 0) {
					local130.anIntArray425[local186] = 0;
					if (arg7 != null) {
						local130.aByteArray65[local186] = (byte) local215;
					}
				} else {
					local467 = 0;
					if (arg5 != null) {
						@Pc(479) short local479 = local130.aShortArray68[local186] = (short) arg5[local186];
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
					if (arg8[local186] != -1 && this.method2998(this.aClass87_Sub3_5.anInterface6_11.method6357(arg8[local186]).aByte86)) {
						local499 = -1694498816;
					}
					local130.anIntArray425[local186] = local499 | Static64.method1236(arg10, Static646.method3002(arg6[local186] >> 8, local215), local467);
					if (arg7 != null) {
						local130.aByteArray65[local186] = (byte) local215;
					}
				}
				local130.aShortArray71[local186] = (short) arg8[local186];
				local130.aShortArray72[local186] = (short) arg9[local186];
			}
			if (arg7 != null) {
				local130.anIntArray426 = new int[local130.aShort92];
			}
			for (local191 = 0; local191 < local130.aShort92; local191++) {
				local195 = local191 * 3;
				if (arg7 != null && arg7[local195] != 0) {
					local130.anIntArray426[local191] = arg7[local195] >> 8 | 0xFF000000;
				}
			}
			this.aClass223ArrayArray1[arg0][arg1] = local130;
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
				} else if (arg2[local336] == super.anInt9344 && arg4[local336] == 0) {
					if (local191 != -1 && arg6[local191] != arg6[local336]) {
						local610 = false;
						break;
					}
					local191 = local336;
				} else if (arg2[local336] == super.anInt9344 && arg4[local336] == super.anInt9344) {
					if (local195 != -1 && arg6[local195] != arg6[local336]) {
						local610 = false;
						break;
					}
					local195 = local336;
				} else if (arg2[local336] == 0 && arg4[local336] == super.anInt9344) {
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
						if (arg2[local383] != arg2[0] && arg2[local383] != arg2[0] + super.anInt9344 && arg2[local383] != arg2[0] - super.anInt9344) {
							local610 = false;
							break;
						}
						if (arg4[local383] != arg4[0] && arg4[local383] != arg4[0] + super.anInt9344 && arg4[local383] != arg4[0] - super.anInt9344) {
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
			@Pc(1623) Class279 local1623 = new Class279();
			local1623.aShort103 = (short) arg2.length;
			local1623.aShort104 = (short) (arg2.length / 3);
			local1623.aShortArray103 = new short[local1623.aShort103];
			local1623.aShortArray107 = new short[local1623.aShort103];
			local1623.aShortArray102 = new short[local1623.aShort103];
			local1623.anIntArray547 = new int[local1623.aShort103];
			if (arg5 != null) {
				local1623.aShortArray104 = new short[local1623.aShort103];
			}
			@Pc(1693) int local1693;
			@Pc(1814) int local1814;
			@Pc(1861) int local1861;
			@Pc(1947) int local1947;
			for (local383 = 0; local383 < local1623.aShort103; local383++) {
				local467 = arg2[local383];
				local499 = arg4[local383];
				if (local467 == 0 && local499 == 0) {
					local1693 = this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray8[arg0][arg1];
				} else if (local467 == 0 && local499 == super.anInt9344) {
					local1693 = this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray8[arg0][arg1 + 1];
				} else if (local467 == super.anInt9344 && local499 == super.anInt9344) {
					local1693 = this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray8[arg0 + 1][arg1 + 1];
				} else if (local467 == super.anInt9344 && local499 == 0) {
					local1693 = this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray8[arg0 + 1][arg1];
				} else {
					local1814 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray8[arg0][arg1]) * (super.anInt9344 - local467) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray8[arg0 + 1][arg1]) * local467;
					local1861 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray8[arg0][arg1 + 1]) * (super.anInt9344 - local467) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray8[arg0 + 1][arg1 + 1]) * local467;
					local1693 = local1814 * (super.anInt9344 - local499) + local1861 * local499 >> super.anInt9341 * 2;
				}
				local1814 = (arg0 << super.anInt9341) + local467;
				local1861 = (arg1 << super.anInt9341) + local499;
				local1623.aShortArray103[local383] = (short) local467;
				local1623.aShortArray102[local383] = (short) local499;
				local1623.aShortArray107[local383] = (short) (this.method7826(local1814, local1861) + (arg3 == null ? 0 : arg3[local383]));
				if (local1693 < 0) {
					local1693 = 0;
				}
				if (arg6[local383] != 0) {
					local1947 = 0;
					if (arg5 != null) {
						@Pc(1959) short local1959 = local1623.aShortArray104[local383] = (short) arg5[local383];
						if (arg11 != 0) {
							local1947 = local1959 * 255 / arg11;
							if (local1947 < 0) {
								local1947 = 0;
							} else if (local1947 > 255) {
								local1947 = 255;
							}
						}
					}
					local1623.anIntArray547[local383] = Static64.method1236(arg10, Static646.method3002(arg6[local383] >> 8, local1693), local1947);
					if (arg7 != null) {
						local1623.anIntArray547[local383] |= local1693 << 25;
					}
				} else if (arg7 == null) {
					local1623.anIntArray547[local383] = 0;
				} else {
					local1623.anIntArray547[local383] = local1693 << 25;
				}
			}
			@Pc(2011) boolean local2011 = false;
			for (local499 = 0; local499 < local1623.aShort104; local499++) {
				if (arg8[local499 * 3] != -1 && !this.aClass87_Sub3_5.anInterface6_11.method6357(arg8[local499 * 3]).aBoolean427) {
					local2011 = true;
				}
			}
			if (arg7 != null) {
				local1623.anIntArray546 = new int[local1623.aShort104];
			}
			if (local2011) {
				local1623.aShortArray105 = new short[local1623.aShort104];
				local1623.aShortArray106 = new short[local1623.aShort104];
			}
			for (local1693 = 0; local1693 < local1623.aShort104; local1693++) {
				local1814 = local1693 * 3;
				if (arg7 != null && arg7[local1814] != 0) {
					local1623.anIntArray546[local1693] = arg7[local1814] >> 8;
				}
				if (local2011) {
					local1861 = local1814 + 1;
					local1947 = local1861 + 1;
					@Pc(2093) boolean local2093 = false;
					@Pc(2095) boolean local2095 = true;
					@Pc(2099) int local2099 = arg8[local1814];
					if (local2099 == -1 || this.aClass87_Sub3_5.anInterface6_11.method6357(local2099).aBoolean427) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					local2099 = arg8[local1861];
					if (local2099 == -1 || this.aClass87_Sub3_5.anInterface6_11.method6357(local2099).aBoolean427) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					local2099 = arg8[local1947];
					if (local2099 == -1 || this.aClass87_Sub3_5.anInterface6_11.method6357(local2099).aBoolean427) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					if (local2095) {
						local1623.aShortArray105[local1693] = (short) local2099;
						local1623.aShortArray106[local1693] = (short) arg9[local1814];
					} else {
						if (local2093) {
							local2099 = arg8[local1814];
							if (local2099 != -1 && !this.aClass87_Sub3_5.anInterface6_11.method6357(local2099).aBoolean427) {
								local1623.anIntArray547[local1814] = Static562.anIntArray652[Static415.method6349(this.aClass87_Sub3_5.anInterface6_11.method6357(local2099).aShort83 & 0xFFFF) & 0xFFFF];
							}
							local2099 = arg8[local1861];
							if (local2099 != -1 && !this.aClass87_Sub3_5.anInterface6_11.method6357(local2099).aBoolean427) {
								local1623.anIntArray547[local1861] = Static562.anIntArray652[Static415.method6349(this.aClass87_Sub3_5.anInterface6_11.method6357(local2099).aShort83 & 0xFFFF) & 0xFFFF];
							}
							local2099 = arg8[local1947];
							if (local2099 != -1 && !this.aClass87_Sub3_5.anInterface6_11.method6357(local2099).aBoolean427) {
								local1623.anIntArray547[local1947] = Static562.anIntArray652[Static415.method6349(this.aClass87_Sub3_5.anInterface6_11.method6357(local2099).aShort83 & 0xFFFF) & 0xFFFF];
							}
						}
						local1623.aShortArray105[local1693] = -1;
					}
				}
			}
			this.aClass279ArrayArray1[arg0][arg1] = local1623;
			return;
		}
		@Pc(842) Class354 local842 = new Class354();
		local383 = arg6[0];
		local467 = arg8[0];
		if (arg7 != null) {
			local842.anInt9773 = arg7[0] >> 8;
			if (local383 == 0) {
				local842.aByte123 = (byte) (local842.aByte123 | 0x2);
			}
		} else if (local383 == 0) {
			return;
		}
		if (super.anIntArrayArray89[arg0][arg1] == super.anIntArrayArray89[arg0 + 1][arg1] && super.anIntArrayArray89[arg0][arg1] == super.anIntArrayArray89[arg0 + 1][arg1 + 1] && super.anIntArrayArray89[arg0][arg1] == super.anIntArrayArray89[arg0][arg1 + 1]) {
			local842.aByte123 = (byte) (local842.aByte123 | 0x1);
		}
		if (local467 == -1 || (local842.aByte123 & 0x2) != 0 || this.aClass87_Sub3_5.anInterface6_11.method6357(local467).aBoolean427) {
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
			local842.anInt9777 = Static64.method1236(arg10, Static646.method3002(arg6[local186] >> 8, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray8[arg0][arg1]), local499);
			if (local842.anInt9773 != 0) {
				local842.anInt9777 |= this.aByteArrayArray8[arg0][arg1] + 255 - this.aByteArrayArray7[arg0][arg1] << 25;
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
			local842.anInt9775 = Static64.method1236(arg10, Static646.method3002(arg6[local191] >> 8, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray8[arg0 + 1][arg1]), local499);
			if (local842.anInt9773 != 0) {
				local842.anInt9775 |= this.aByteArrayArray8[arg0 + 1][arg1] + 255 - this.aByteArrayArray7[arg0 + 1][arg1] << 25;
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
			local842.anInt9774 = Static64.method1236(arg10, Static646.method3002(arg6[local195] >> 8, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray8[arg0 + 1][arg1 + 1]), local499);
			if (local842.anInt9773 != 0) {
				local842.anInt9774 |= this.aByteArrayArray8[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray7[arg0 + 1][arg1 + 1] << 25;
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
			local842.anInt9776 = Static64.method1236(arg10, Static646.method3002(arg6[local215] >> 8, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray8[arg0][arg1 + 1]), local499);
			if (local842.anInt9773 != 0) {
				local842.anInt9776 |= this.aByteArrayArray8[arg0][arg1 + 1] + 255 - this.aByteArrayArray7[arg0][arg1 + 1] << 25;
			}
			local842.aShort119 = -1;
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
			local842.anInt9777 = Static64.method1236(arg10, Static646.method3002(arg6[local186] >> 8, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray8[arg0][arg1]), local499);
			if (local842.anInt9773 != 0) {
				local842.anInt9777 |= this.aByteArrayArray8[arg0][arg1] + 255 - this.aByteArrayArray7[arg0][arg1] << 25;
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
			local842.anInt9775 = Static64.method1236(arg10, Static646.method3002(arg6[local191] >> 8, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray8[arg0 + 1][arg1]), local499);
			if (local842.anInt9773 != 0) {
				local842.anInt9775 |= this.aByteArrayArray8[arg0 + 1][arg1] + 255 - this.aByteArrayArray7[arg0 + 1][arg1] << 25;
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
			local842.anInt9774 = Static64.method1236(arg10, Static646.method3002(arg6[local195] >> 8, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray8[arg0 + 1][arg1 + 1]), local499);
			if (local842.anInt9773 != 0) {
				local842.anInt9774 |= this.aByteArrayArray8[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray7[arg0 + 1][arg1 + 1] << 25;
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
			local842.anInt9776 = Static64.method1236(arg10, Static646.method3002(arg6[local215] >> 8, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray8[arg0][arg1 + 1]), local499);
			local842.aShort119 = (short) local467;
		}
		if (arg5 != null) {
			local842.aShort120 = (short) arg5[local195];
			local842.aShort116 = (short) arg5[local215];
			local842.aShort117 = (short) arg5[local191];
			local842.aShort118 = (short) arg5[local186];
		}
		this.aClass354ArrayArray1[arg0][arg1] = local842;
	}

	@OriginalMember(owner = "client!fn", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray8[arg0][arg1] < arg2) {
			this.aByteArrayArray8[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILclient!b;[I[I[I[II)V")
	private void method3003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7) {
		@Pc(6) Class292 local6 = this.aClass292ArrayArray1[arg0][arg1];
		@Pc(41) int local41;
		@Pc(51) int local51;
		@Pc(467) int local467;
		@Pc(497) int local497;
		if (local6 == null) {
			@Pc(2129) Class55 local2129 = this.aClass55ArrayArray1[arg0][arg1];
			if (local2129 != null) {
				if (arg7 != 0) {
					if ((local2129.aByte36 & 0x4) == 0) {
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
				if (this.anInt3627 == -1) {
					for (local467 = 0; local467 < local2129.aShort34; local467++) {
						local41 = local2129.aShortArray18[local467] + (arg0 << super.anInt9341);
						local2170 = local2129.aShortArray19[local467];
						local51 = local2129.aShortArray20[local467] + (arg1 << super.anInt9341);
						local2201 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local2170 + this.aFloat95 * (float) local51;
						if (local2201 <= (float) this.aClass87_Sub3_5.anInt9482) {
							return;
						}
						local2230 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local2170 + this.aFloat96 * (float) local51;
						local2251 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local2170 + this.aFloat87 * (float) local51;
						arg3[local467] = arg2.anInt765 + (int) (local2230 * (float) this.aClass87_Sub3_5.anInt9466 / local2201);
						arg4[local467] = arg2.anInt769 + (int) (local2251 * (float) this.aClass87_Sub3_5.anInt9493 / local2201);
						arg5[local467] = (int) local2201;
					}
				} else {
					for (local467 = 0; local467 < local2129.aShort34; local467++) {
						local41 = local2129.aShortArray18[local467] + (arg0 << super.anInt9341);
						local2170 = local2129.aShortArray19[local467];
						local51 = local2129.aShortArray20[local467] + (arg1 << super.anInt9341);
						local2201 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local2170 + this.aFloat95 * (float) local51;
						local2230 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local2170 + this.aFloat96 * (float) local51;
						local2251 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local2170 + this.aFloat87 * (float) local51;
						arg3[local467] = arg2.anInt765 + (int) (local2230 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
						arg4[local467] = arg2.anInt769 + (int) (local2251 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
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
				if (local2129.aShortArray23 != null) {
					@Pc(2650) int local2650;
					@Pc(2520) short local2520;
					if (this.anInt3627 == -1) {
						for (local467 = 0; local467 < local2129.aShort35; local467++) {
							local2442 = local2129.aShortArray15[local467];
							local2447 = local2129.aShortArray22[local467];
							local2452 = local2129.aShortArray17[local467];
							local497 = arg3[local2442];
							local2460 = arg3[local2447];
							local2464 = arg3[local2452];
							local2468 = arg4[local2442];
							local2472 = arg4[local2447];
							local2476 = arg4[local2452];
							if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
								arg2.aBoolean60 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt764 || local2460 > arg2.anInt764 || local2464 > arg2.anInt764;
								local2520 = local2129.aShortArray23[local467];
								if (local2520 == -1) {
									local2650 = local2129.anIntArray136[local467];
									if (local2650 != -1) {
										arg2.method684((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static174.method3223(local2129.aShortArray16[local2442], local2650), (float) Static174.method3223(local2129.aShortArray16[local2447], local2650), (float) Static174.method3223(local2129.aShortArray16[local2452], local2650));
									}
								} else {
									arg2.method693((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) local2129.aShortArray18[local2442] / (float) super.anInt9344, (float) local2129.aShortArray18[local2447] / (float) super.anInt9344, (float) local2129.aShortArray18[local2452] / (float) super.anInt9344, (float) local2129.aShortArray20[local2442] / (float) super.anInt9344, (float) local2129.aShortArray20[local2447] / (float) super.anInt9344, (float) local2129.aShortArray20[local2452] / (float) super.anInt9344, Static562.anIntArray652[local2129.aShortArray16[local2442] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local2129.aShortArray16[local2447] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local2129.aShortArray16[local2452] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2520);
								}
							}
						}
						return;
					}
					for (local467 = 0; local467 < local2129.aShort35; local467++) {
						local2442 = local2129.aShortArray15[local467];
						local2447 = local2129.aShortArray22[local467];
						local2452 = local2129.aShortArray17[local467];
						local497 = arg3[local2442];
						local2460 = arg3[local2447];
						local2464 = arg3[local2452];
						local2468 = arg4[local2442];
						local2472 = arg4[local2447];
						local2476 = arg4[local2452];
						if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
							arg2.aBoolean60 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt764 || local2460 > arg2.anInt764 || local2464 > arg2.anInt764;
							local2520 = local2129.aShortArray23[local467];
							if (local2520 == -1) {
								local2650 = local2129.anIntArray136[local467];
								if (local2650 != -1) {
									arg2.method684((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static174.method3223(local2129.aShortArray16[local2442], local2650), (float) Static174.method3223(local2129.aShortArray16[local2447], local2650), (float) Static174.method3223(local2129.aShortArray16[local2452], local2650));
								}
							} else {
								arg2.method693((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) local2129.aShortArray18[local2442] / (float) super.anInt9344, (float) local2129.aShortArray18[local2447] / (float) super.anInt9344, (float) local2129.aShortArray18[local2452] / (float) super.anInt9344, (float) local2129.aShortArray20[local2442] / (float) super.anInt9344, (float) local2129.aShortArray20[local2447] / (float) super.anInt9344, (float) local2129.aShortArray20[local2452] / (float) super.anInt9344, Static562.anIntArray652[local2129.aShortArray16[local2442] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local2129.aShortArray16[local2447] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local2129.aShortArray16[local2452] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2520);
							}
						}
					}
					return;
				}
				for (local467 = 0; local467 < local2129.aShort35; local467++) {
					local2442 = local2129.aShortArray15[local467];
					local2447 = local2129.aShortArray22[local467];
					local2452 = local2129.aShortArray17[local467];
					local497 = arg3[local2442];
					local2460 = arg3[local2447];
					local2464 = arg3[local2452];
					local2468 = arg4[local2442];
					local2472 = arg4[local2447];
					local2476 = arg4[local2452];
					if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
						@Pc(3047) int local3047 = local2129.anIntArray136[local467];
						if (local3047 != -1) {
							arg2.aBoolean60 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt764 || local2460 > arg2.anInt764 || local2464 > arg2.anInt764;
							arg2.method684((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static174.method3223(local2129.aShortArray16[local2442], local3047), (float) Static174.method3223(local2129.aShortArray16[local2447], local3047), (float) Static174.method3223(local2129.aShortArray16[local2452], local3047));
						}
					}
				}
			}
		} else if ((local6.aByte109 & 0x2) == 0) {
			if (arg7 != 0) {
				if ((local6.aByte109 & 0x4) == 0) {
					if ((arg7 & 0x2) != 0) {
						return;
					}
				} else if ((arg7 & 0x1) != 0) {
					return;
				}
			}
			@Pc(36) int local36 = arg0 * super.anInt9344;
			local41 = local36 + super.anInt9344;
			@Pc(46) int local46 = arg1 * super.anInt9344;
			local51 = local46 + super.anInt9344;
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
			if ((local6.aByte109 & 0x1) == 0) {
				local63 = super.anIntArrayArray89[arg0][arg1];
				@Pc(771) int local771 = super.anIntArrayArray89[arg0 + 1][arg1];
				@Pc(782) int local782 = super.anIntArrayArray89[arg0 + 1][arg1 + 1];
				@Pc(791) int local791 = super.anIntArrayArray89[arg0][arg1 + 1];
				if (this.anInt3627 == -1) {
					local90 = this.aFloat90 + this.aFloat93 * (float) local36 + this.aFloat89 * (float) local63 + this.aFloat95 * (float) local46;
					if (local90 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local115 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local771 + this.aFloat95 * (float) local46;
					if (local115 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local140 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local782 + this.aFloat95 * (float) local51;
					if (local140 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local165 = this.aFloat90 + this.aFloat93 * (float) local36 + this.aFloat89 * (float) local791 + this.aFloat95 * (float) local51;
					if (local165 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local274 = this.aFloat97 + this.aFloat94 * (float) local36 + this.aFloat88 * (float) local63 + this.aFloat96 * (float) local46;
					local287 = arg2.anInt765 + (int) (local274 * (float) this.aClass87_Sub3_5.anInt9466 / local90);
					local304 = this.aFloat91 + this.aFloat86 * (float) local36 + this.aFloat92 * (float) local63 + this.aFloat87 * (float) local46;
					local317 = arg2.anInt769 + (int) (local304 * (float) this.aClass87_Sub3_5.anInt9493 / local90);
					local334 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local771 + this.aFloat96 * (float) local46;
					local347 = arg2.anInt765 + (int) (local334 * (float) this.aClass87_Sub3_5.anInt9466 / local115);
					local364 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local771 + this.aFloat87 * (float) local46;
					local377 = arg2.anInt769 + (int) (local364 * (float) this.aClass87_Sub3_5.anInt9493 / local115);
					local394 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local782 + this.aFloat96 * (float) local51;
					local407 = arg2.anInt765 + (int) (local394 * (float) this.aClass87_Sub3_5.anInt9466 / local140);
					local424 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local782 + this.aFloat87 * (float) local51;
					local437 = arg2.anInt769 + (int) (local424 * (float) this.aClass87_Sub3_5.anInt9493 / local140);
					local454 = this.aFloat97 + this.aFloat94 * (float) local36 + this.aFloat88 * (float) local791 + this.aFloat96 * (float) local51;
					local467 = arg2.anInt765 + (int) (local454 * (float) this.aClass87_Sub3_5.anInt9466 / local165);
					local484 = this.aFloat91 + this.aFloat86 * (float) local36 + this.aFloat92 * (float) local791 + this.aFloat87 * (float) local51;
					local497 = arg2.anInt769 + (int) (local484 * (float) this.aClass87_Sub3_5.anInt9493 / local165);
				} else {
					local90 = this.aFloat90 + this.aFloat93 * (float) local36 + this.aFloat89 * (float) local63 + this.aFloat95 * (float) local46;
					local115 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local771 + this.aFloat95 * (float) local46;
					local140 = this.aFloat90 + this.aFloat93 * (float) local41 + this.aFloat89 * (float) local782 + this.aFloat95 * (float) local51;
					local165 = this.aFloat90 + this.aFloat93 * (float) local36 + this.aFloat89 * (float) local791 + this.aFloat95 * (float) local51;
					local274 = this.aFloat97 + this.aFloat94 * (float) local36 + this.aFloat88 * (float) local63 + this.aFloat96 * (float) local46;
					local287 = arg2.anInt765 + (int) (local274 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local304 = this.aFloat91 + this.aFloat86 * (float) local36 + this.aFloat92 * (float) local63 + this.aFloat87 * (float) local46;
					local317 = arg2.anInt769 + (int) (local304 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local334 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local771 + this.aFloat96 * (float) local46;
					local347 = arg2.anInt765 + (int) (local334 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local364 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local771 + this.aFloat87 * (float) local46;
					local377 = arg2.anInt769 + (int) (local364 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local394 = this.aFloat97 + this.aFloat94 * (float) local41 + this.aFloat88 * (float) local782 + this.aFloat96 * (float) local51;
					local407 = arg2.anInt765 + (int) (local394 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local424 = this.aFloat91 + this.aFloat86 * (float) local41 + this.aFloat92 * (float) local782 + this.aFloat87 * (float) local51;
					local437 = arg2.anInt769 + (int) (local424 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local454 = this.aFloat97 + this.aFloat94 * (float) local36 + this.aFloat88 * (float) local791 + this.aFloat96 * (float) local51;
					local467 = arg2.anInt765 + (int) (local454 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local484 = this.aFloat91 + this.aFloat86 * (float) local36 + this.aFloat92 * (float) local791 + this.aFloat87 * (float) local51;
					local497 = arg2.anInt769 + (int) (local484 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
				}
			} else {
				local63 = super.anIntArrayArray89[arg0][arg1];
				@Pc(69) float local69 = this.aFloat89 * (float) local63;
				if (this.anInt3627 == -1) {
					local90 = this.aFloat90 + this.aFloat93 * (float) local36 + local69 + this.aFloat95 * (float) local46;
					if (local90 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local115 = this.aFloat90 + this.aFloat93 * (float) local41 + local69 + this.aFloat95 * (float) local46;
					if (local115 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local140 = this.aFloat90 + this.aFloat93 * (float) local41 + local69 + this.aFloat95 * (float) local51;
					if (local140 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
					local165 = this.aFloat90 + this.aFloat93 * (float) local36 + local69 + this.aFloat95 * (float) local51;
					if (local165 <= (float) this.aClass87_Sub3_5.anInt9482) {
						return;
					}
				} else {
					local90 = this.aFloat90 + this.aFloat93 * (float) local36 + local69 + this.aFloat95 * (float) local46;
					local115 = this.aFloat90 + this.aFloat93 * (float) local41 + local69 + this.aFloat95 * (float) local46;
					local140 = this.aFloat90 + this.aFloat93 * (float) local41 + local69 + this.aFloat95 * (float) local51;
					local165 = this.aFloat90 + this.aFloat93 * (float) local36 + local69 + this.aFloat95 * (float) local51;
				}
				@Pc(247) float local247 = this.aFloat88 * (float) local63;
				@Pc(253) float local253 = this.aFloat92 * (float) local63;
				if (this.anInt3627 == -1) {
					local274 = this.aFloat97 + this.aFloat94 * (float) local36 + local247 + this.aFloat96 * (float) local46;
					local287 = arg2.anInt765 + (int) (local274 * (float) this.aClass87_Sub3_5.anInt9466 / local90);
					local304 = this.aFloat91 + this.aFloat86 * (float) local36 + local253 + this.aFloat87 * (float) local46;
					local317 = arg2.anInt769 + (int) (local304 * (float) this.aClass87_Sub3_5.anInt9493 / local90);
					local334 = this.aFloat97 + this.aFloat94 * (float) local41 + local247 + this.aFloat96 * (float) local46;
					local347 = arg2.anInt765 + (int) (local334 * (float) this.aClass87_Sub3_5.anInt9466 / local115);
					local364 = this.aFloat91 + this.aFloat86 * (float) local41 + local253 + this.aFloat87 * (float) local46;
					local377 = arg2.anInt769 + (int) (local364 * (float) this.aClass87_Sub3_5.anInt9493 / local115);
					local394 = this.aFloat97 + this.aFloat94 * (float) local41 + local247 + this.aFloat96 * (float) local51;
					local407 = arg2.anInt765 + (int) (local394 * (float) this.aClass87_Sub3_5.anInt9466 / local140);
					local424 = this.aFloat91 + this.aFloat86 * (float) local41 + local253 + this.aFloat87 * (float) local51;
					local437 = arg2.anInt769 + (int) (local424 * (float) this.aClass87_Sub3_5.anInt9493 / local140);
					local454 = this.aFloat97 + this.aFloat94 * (float) local36 + local247 + this.aFloat96 * (float) local51;
					local467 = arg2.anInt765 + (int) (local454 * (float) this.aClass87_Sub3_5.anInt9466 / local165);
					local484 = this.aFloat91 + this.aFloat86 * (float) local36 + local253 + this.aFloat87 * (float) local51;
					local497 = arg2.anInt769 + (int) (local484 * (float) this.aClass87_Sub3_5.anInt9493 / local165);
				} else {
					local274 = this.aFloat97 + this.aFloat94 * (float) local36 + local247 + this.aFloat96 * (float) local46;
					local287 = arg2.anInt765 + (int) (local274 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local304 = this.aFloat91 + this.aFloat86 * (float) local36 + local253 + this.aFloat87 * (float) local46;
					local317 = arg2.anInt769 + (int) (local304 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local334 = this.aFloat97 + this.aFloat94 * (float) local41 + local247 + this.aFloat96 * (float) local46;
					local347 = arg2.anInt765 + (int) (local334 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local364 = this.aFloat91 + this.aFloat86 * (float) local41 + local253 + this.aFloat87 * (float) local46;
					local377 = arg2.anInt769 + (int) (local364 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local394 = this.aFloat97 + this.aFloat94 * (float) local41 + local247 + this.aFloat96 * (float) local51;
					local407 = arg2.anInt765 + (int) (local394 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local424 = this.aFloat91 + this.aFloat86 * (float) local41 + local253 + this.aFloat87 * (float) local51;
					local437 = arg2.anInt769 + (int) (local424 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
					local454 = this.aFloat97 + this.aFloat94 * (float) local36 + local247 + this.aFloat96 * (float) local51;
					local467 = arg2.anInt765 + (int) (local454 * (float) this.aClass87_Sub3_5.anInt9466 / (float) this.anInt3627);
					local484 = this.aFloat91 + this.aFloat86 * (float) local36 + local253 + this.aFloat87 * (float) local51;
					local497 = arg2.anInt769 + (int) (local484 * (float) this.aClass87_Sub3_5.anInt9493 / (float) this.anInt3627);
				}
			}
			if (this.anInt3627 == -1) {
				if ((local407 - local467) * (local377 - local497) - (local437 - local497) * (local347 - local467) > 0) {
					arg2.aBoolean60 = local407 < 0 || local467 < 0 || local347 < 0 || local407 > arg2.anInt764 || local467 > arg2.anInt764 || local347 > arg2.anInt764;
					if (local6.aShort110 >= 0) {
						arg2.method693((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, local140, local165, local115, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static562.anIntArray652[local6.aShort111 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local6.aShort109 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local6.aShort108 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort110);
					} else {
						arg2.method684((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, (float) local140, (float) local165, (float) local115, (float) (local6.aShort111 & 0xFFFF), (float) (local6.aShort109 & 0xFFFF), (float) (local6.aShort108 & 0xFFFF));
					}
				}
				if ((local287 - local347) * (local497 - local377) - (local317 - local377) * (local467 - local347) > 0) {
					arg2.aBoolean60 = local287 < 0 || local347 < 0 || local467 < 0 || local287 > arg2.anInt764 || local347 > arg2.anInt764 || local467 > arg2.anInt764;
					if (local6.aShort110 >= 0) {
						arg2.method693((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, local90, local115, local165, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static562.anIntArray652[local6.aShort112 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local6.aShort108 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local6.aShort109 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort110);
						return;
					}
					arg2.method684((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, (float) local90, (float) local115, (float) local165, (float) (local6.aShort112 & 0xFFFF), (float) (local6.aShort108 & 0xFFFF), (float) (local6.aShort109 & 0xFFFF));
					return;
				}
			} else {
				if ((local407 - local467) * (local377 - local497) - (local437 - local497) * (local347 - local467) > 0) {
					arg2.aBoolean60 = local407 < 0 || local467 < 0 || local347 < 0 || local407 > arg2.anInt764 || local467 > arg2.anInt764 || local347 > arg2.anInt764;
					if (local6.aShort110 >= 0) {
						arg2.method693((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, local140, local165, local115, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static562.anIntArray652[local6.aShort111 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local6.aShort109 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local6.aShort108 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort110);
					} else {
						arg2.method684((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, (float) local140, (float) local165, (float) local115, (float) (local6.aShort111 & 0xFFFF), (float) (local6.aShort109 & 0xFFFF), (float) (local6.aShort108 & 0xFFFF));
					}
				}
				if ((local287 - local347) * (local497 - local377) - (local317 - local377) * (local467 - local347) > 0) {
					arg2.aBoolean60 = local287 < 0 || local347 < 0 || local467 < 0 || local287 > arg2.anInt764 || local347 > arg2.anInt764 || local467 > arg2.anInt764;
					if (local6.aShort110 >= 0) {
						arg2.method693((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, local90, local115, local165, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static562.anIntArray652[local6.aShort112 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local6.aShort108 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static562.anIntArray652[local6.aShort109 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort110);
						return;
					}
					arg2.method684((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, (float) local90, (float) local115, (float) local165, (float) (local6.aShort112 & 0xFFFF), (float) (local6.aShort108 & 0xFFFF), (float) (local6.aShort109 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7824(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class6_Sub3 local3 = this.aClass87_Sub3_5.aClass6_Sub3_2;
		this.anInt3627 = arg5;
		this.aFloat94 = local3.aFloat200;
		this.aFloat88 = local3.aFloat201;
		this.aFloat96 = local3.aFloat197;
		this.aFloat97 = local3.aFloat206;
		this.aFloat86 = local3.aFloat207;
		this.aFloat92 = local3.aFloat199;
		this.aFloat87 = local3.aFloat202;
		this.aFloat91 = local3.aFloat205;
		this.aFloat93 = local3.aFloat203;
		this.aFloat89 = local3.aFloat208;
		this.aFloat95 = local3.aFloat198;
		this.aFloat90 = local3.aFloat204;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt9348 && local78 >= 0 && local78 < super.anInt9340) {
						this.method3000(local72, local78, arg6);
					}
				}
			}
		}
	}
}
