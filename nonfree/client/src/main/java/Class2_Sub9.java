import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!cga", name = "z", descriptor = "I")
	private int anInt1434;

	@OriginalMember(owner = "client!cga", name = "r", descriptor = "Lclient!dga;")
	private final Class67_Sub2 aClass67_Sub2_1;

	@OriginalMember(owner = "client!cga", name = "H", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_11;

	@OriginalMember(owner = "client!cga", name = "o", descriptor = "Lclient!gga;")
	private final Class2_Sub14 aClass2_Sub14_1;

	@OriginalMember(owner = "client!cga", name = "B", descriptor = "I")
	private final int anInt1435;

	@OriginalMember(owner = "client!cga", name = "M", descriptor = "I")
	private final int anInt1441;

	@OriginalMember(owner = "client!cga", name = "t", descriptor = "I")
	private final int anInt1431;

	@OriginalMember(owner = "client!cga", name = "D", descriptor = "I")
	private final int anInt1436;

	@OriginalMember(owner = "client!cga", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!cga", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!cga", name = "N", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!cga", name = "q", descriptor = "I")
	private int anInt1429;

	@OriginalMember(owner = "client!cga", name = "G", descriptor = "Lclient!es;")
	private Class2_Sub15 aClass2_Sub15_2;

	@OriginalMember(owner = "client!cga", name = "l", descriptor = "Lclient!fw;")
	private Class2_Sub15_Sub1 aClass2_Sub15_Sub1_1;

	@OriginalMember(owner = "client!cga", name = "C", descriptor = "Lclient!il;")
	private Class162 aClass162_7;

	@OriginalMember(owner = "client!cga", name = "p", descriptor = "Lclient!dw;")
	private final Interface3 anInterface3_1;

	@OriginalMember(owner = "client!cga", name = "u", descriptor = "Lclient!nl;")
	private final Interface18 anInterface18_1;

	@OriginalMember(owner = "client!cga", name = "m", descriptor = "Lclient!gv;")
	private final Class131 aClass131_1;

	@OriginalMember(owner = "client!cga", name = "F", descriptor = "Lclient!gv;")
	private final Class131 aClass131_2;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!qj;Lclient!dga;Lclient!gga;[I)V")
	public Class2_Sub9(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class67_Sub2 arg1, @OriginalArg(2) Class2_Sub14 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass67_Sub2_1 = arg1;
		this.aClass100_Sub3_11 = arg0;
		this.aClass2_Sub14_1 = arg2;
		@Pc(23) int local23 = this.aClass2_Sub14_1.method7691() - (arg1.anInt8104 >> 1);
		this.anInt1435 = this.aClass2_Sub14_1.method7694() - local23 >> arg1.anInt8108;
		this.anInt1441 = this.aClass2_Sub14_1.method7694() + local23 >> arg1.anInt8108;
		this.anInt1431 = this.aClass2_Sub14_1.method7693() - local23 >> arg1.anInt8108;
		this.anInt1436 = this.aClass2_Sub14_1.method7693() + local23 >> arg1.anInt8108;
		@Pc(79) int local79 = this.anInt1441 + 1 - this.anInt1435;
		@Pc(88) int local88 = this.anInt1436 + 1 - this.anInt1431;
		this.aFloatArrayArray1 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray2 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray3 = new float[local79 + 1][local88 + 1];
		@Pc(124) int local124;
		@Pc(142) int local142;
		@Pc(149) int local149;
		@Pc(174) int local174;
		@Pc(191) int local191;
		for (@Pc(117) int local117 = 0; local117 <= local88; local117++) {
			local124 = this.anInt1431 + local117;
			if (local124 > 0 && local124 < this.aClass67_Sub2_1.anInt8110 - 1) {
				for (local142 = 0; local142 <= local79; local142++) {
					local149 = this.anInt1435 + local142;
					if (local149 > 0 && this.aClass67_Sub2_1.anInt8111 - 1 > local149) {
						local174 = arg1.method6707(local124, local149 + 1) - arg1.method6707(local124, local149 - 1);
						local191 = arg1.method6707(local124 + 1, local149) - arg1.method6707(local124 - 1, local149);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local174 * local174 + local191 * local191 + 65536)));
						this.aFloatArrayArray3[local142][local117] = (float) local174 * local206;
						this.aFloatArrayArray2[local142][local117] = -256.0F * local206;
						this.aFloatArrayArray1[local142][local117] = (float) local191 * local206;
					}
				}
			}
		}
		local124 = 0;
		@Pc(303) int local303;
		for (local142 = this.anInt1431; local142 <= this.anInt1436; local142++) {
			if (local142 >= 0 && arg1.anInt8110 > local142) {
				for (local149 = this.anInt1435; local149 <= this.anInt1441; local149++) {
					if (local149 >= 0 && local149 < arg1.anInt8111) {
						local174 = arg3[local124];
						@Pc(292) int[] local292 = arg1.anIntArrayArrayArray11[local149][local142];
						if (local292 != null && local174 != 0) {
							if (local174 == 1) {
								local303 = 0;
								while (local292.length > local303) {
									if (local292[local303++] != -1 && local292[local303++] != -1 && local292[local303++] != -1) {
										this.anInt1429 += 3;
									}
								}
							} else {
								this.anInt1429 += 3;
							}
						}
					}
					local124++;
				}
			} else {
				local124 += this.anInt1441 - this.anInt1435;
			}
		}
		if (this.anInt1429 > 0) {
			this.aClass2_Sub15_2 = new Class2_Sub15(this.anInt1429 * 2);
			this.aClass2_Sub15_Sub1_1 = new Class2_Sub15_Sub1(this.anInt1429 * 16);
			this.aClass162_7 = new Class162(Static89.method7259(this.anInt1429));
			local149 = 0;
			local124 = 0;
			for (local174 = this.anInt1431; local174 <= this.anInt1436; local174++) {
				if (local174 >= 0 && local174 < arg1.anInt8110) {
					local191 = 0;
					for (local303 = this.anInt1435; local303 <= this.anInt1441; local303++) {
						if (local303 >= 0 && local303 < arg1.anInt8111) {
							@Pc(446) int local446 = arg3[local124];
							@Pc(453) int[] local453 = arg1.anIntArrayArrayArray11[local303][local174];
							if (local453 != null && local446 != 0) {
								if (local446 == 1) {
									@Pc(615) int[] local615 = arg1.anIntArrayArrayArray9[local303][local174];
									@Pc(622) int[] local622 = arg1.anIntArrayArrayArray14[local303][local174];
									@Pc(624) int local624 = 0;
									label106: while (true) {
										while (true) {
											if (local624 >= local453.length) {
												break label106;
											}
											if (local453[local624] == -1 || local453[local624 + 1] == -1 || local453[local624 + 2] == -1) {
												local624 += 3;
											} else {
												this.method982(local615[local624], local174, local149, local303, local622[local624], local191);
												local624++;
												this.method982(local615[local624], local174, local149, local303, local622[local624], local191);
												local624++;
												this.method982(local615[local624], local174, local149, local303, local622[local624], local191);
												local624++;
											}
										}
									}
								} else if (local446 == 3) {
									this.method982(0, local174, local149, local303, 0, local191);
									this.method982(arg1.anInt8104, local174, local149, local303, 0, local191);
									this.method982(0, local174, local149, local303, arg1.anInt8104, local191);
								} else if (local446 == 2) {
									this.method982(arg1.anInt8104, local174, local149, local303, 0, local191);
									this.method982(arg1.anInt8104, local174, local149, local303, arg1.anInt8104, local191);
									this.method982(0, local174, local149, local303, 0, local191);
								} else if (local446 == 5) {
									this.method982(arg1.anInt8104, local174, local149, local303, arg1.anInt8104, local191);
									this.method982(0, local174, local149, local303, arg1.anInt8104, local191);
									this.method982(arg1.anInt8104, local174, local149, local303, 0, local191);
								} else if (local446 == 4) {
									this.method982(0, local174, local149, local303, arg1.anInt8104, local191);
									this.method982(0, local174, local149, local303, 0, local191);
									this.method982(arg1.anInt8104, local174, local149, local303, arg1.anInt8104, local191);
								}
							}
						}
						local124++;
						local191++;
					}
				} else {
					local124 += this.anInt1441 - this.anInt1435;
				}
				local149++;
			}
			this.anInterface3_1 = this.aClass100_Sub3_11.method6301(this.aClass2_Sub15_2.anInt5241, this.aClass2_Sub15_2.aByteArray62, false);
			this.anInterface18_1 = this.aClass100_Sub3_11.method6341(this.aClass2_Sub15_Sub1_1.aByteArray62, this.aClass2_Sub15_Sub1_1.anInt5241, false, 16);
			this.aClass131_1 = new Class131(this.anInterface18_1, 5126, 3, 0);
			this.aClass131_2 = new Class131(this.anInterface18_1, 5121, 4, 12);
		} else {
			this.anInterface18_1 = null;
			this.anInterface3_1 = null;
			this.aClass131_2 = null;
			this.aClass131_1 = null;
		}
		this.aClass2_Sub15_2 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray1 = null;
		this.aClass162_7 = null;
		this.aClass2_Sub15_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I[[ZIII)V")
	public void method980(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface3_1 == null || (this.anInt1435 > arg1 + arg2 || (this.anInt1441 < arg1 - arg2 || (arg3 + arg2 < this.anInt1431 || this.anInt1436 < arg3 - arg2)))) {
			return;
		}
		for (@Pc(62) int local62 = this.anInt1431; local62 <= this.anInt1436; local62++) {
			for (@Pc(67) int local67 = this.anInt1435; local67 <= this.anInt1441; local67++) {
				@Pc(73) int local73 = local67 - arg1;
				@Pc(78) int local78 = local62 - arg3;
				if (-arg2 < local73 && local73 < arg2 && -arg2 < local78 && local78 < arg2 && arg0[arg2 + local73][local78 + arg2]) {
					this.aClass100_Sub3_11.method6289((int) (this.aClass2_Sub14_1.method7689() * 255.0F) << 24);
					this.aClass100_Sub3_11.method6302(this.aClass131_1, this.aClass131_2, null, null);
					this.aClass100_Sub3_11.method6295(this.anInt1429, 0, this.anInterface3_1);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(SB)V")
	private void method981(@OriginalArg(0) short arg0) {
		if (this.aClass100_Sub3_11.aBoolean595) {
			this.aClass2_Sub15_2.method4350(arg0);
		} else {
			this.aClass2_Sub15_2.method4308(arg0);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIIIII)V")
	private void method982(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg3 << this.aClass67_Sub2_1.anInt8108) + arg0;
		@Pc(24) int local24 = arg4 + (arg1 << this.aClass67_Sub2_1.anInt8108);
		@Pc(31) int local31 = this.aClass67_Sub2_1.method6711(local24, local15);
		if ((arg0 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(65) Class2 local65 = this.aClass162_7.method3519(local7);
			if (local65 != null) {
				this.method981(((Class2_Sub29) local65).aShort60);
				return;
			}
		}
		@Pc(83) short local83 = (short) this.anInt1434++;
		if (local7 != -1L) {
			this.aClass162_7.method3522(new Class2_Sub29(local83), local7);
		}
		@Pc(107) float local107;
		@Pc(121) float local121;
		@Pc(114) float local114;
		@Pc(230) float local230;
		@Pc(238) float local238;
		@Pc(245) float local245;
		@Pc(252) float local252;
		@Pc(259) float local259;
		@Pc(268) float local268;
		@Pc(277) float local277;
		@Pc(320) float local320;
		if (arg0 == 0 && arg4 == 0) {
			local107 = this.aFloatArrayArray3[arg5][arg2];
			local114 = this.aFloatArrayArray1[arg5][arg2];
			local121 = this.aFloatArrayArray2[arg5][arg2];
		} else if (arg0 == this.aClass67_Sub2_1.anInt8104 && arg4 == 0) {
			local114 = this.aFloatArrayArray1[arg5 + 1][arg2];
			local121 = this.aFloatArrayArray2[arg5 + 1][arg2];
			local107 = this.aFloatArrayArray3[arg5 + 1][arg2];
		} else if (this.aClass67_Sub2_1.anInt8104 == arg0 && this.aClass67_Sub2_1.anInt8104 == arg4) {
			local114 = this.aFloatArrayArray1[arg5 + 1][arg2 + 1];
			local107 = this.aFloatArrayArray3[arg5 + 1][arg2 + 1];
			local121 = this.aFloatArrayArray2[arg5 + 1][arg2 + 1];
		} else if (arg0 == 0 && this.aClass67_Sub2_1.anInt8104 == arg4) {
			local114 = this.aFloatArrayArray1[arg5][arg2 + 1];
			local107 = this.aFloatArrayArray3[arg5][arg2 + 1];
			local121 = this.aFloatArrayArray2[arg5][arg2 + 1];
		} else {
			local230 = (float) arg0 / (float) this.aClass67_Sub2_1.anInt8104;
			local238 = (float) arg4 / (float) this.aClass67_Sub2_1.anInt8104;
			local245 = this.aFloatArrayArray3[arg5][arg2];
			local252 = this.aFloatArrayArray2[arg5][arg2];
			local259 = this.aFloatArrayArray1[arg5][arg2];
			local268 = this.aFloatArrayArray3[arg5 + 1][arg2];
			local277 = this.aFloatArrayArray2[arg5 + 1][arg2];
			@Pc(293) float local293 = local245 + local230 * (this.aFloatArrayArray3[arg5][arg2 + 1] - local245);
			@Pc(311) float local311 = local277 + local230 * (this.aFloatArrayArray2[arg5 + 1][arg2 + 1] - local277);
			local320 = this.aFloatArrayArray1[arg5 + 1][arg2];
			@Pc(335) float local335 = local259 + (this.aFloatArrayArray1[arg5][arg2 + 1] - local259) * local230;
			@Pc(353) float local353 = local268 + (this.aFloatArrayArray3[arg5 + 1][arg2 + 1] - local268) * local230;
			@Pc(368) float local368 = local252 + local230 * (this.aFloatArrayArray2[arg5][arg2 + 1] - local252);
			@Pc(386) float local386 = local320 + local230 * (this.aFloatArrayArray1[arg5 + 1][arg2 + 1] - local320);
			local107 = local293 + local238 * (local353 - local293);
			local121 = (local311 - local368) * local238 + local368;
			local114 = local335 + (local386 - local335) * local238;
		}
		local230 = this.aClass2_Sub14_1.method7694() - local15;
		local238 = this.aClass2_Sub14_1.method7696() - local31;
		local245 = this.aClass2_Sub14_1.method7693() - local24;
		local252 = (float) Math.sqrt((double) (local245 * local245 + local238 * local238 + local230 * local230));
		local259 = 1.0F / local252;
		local245 *= local259;
		local230 *= local259;
		local238 *= local259;
		local268 = local252 / (float) this.aClass2_Sub14_1.method7691();
		local277 = 1.0F - local268 * local268;
		if (local277 < 0.0F) {
			local277 = 0.0F;
		}
		local320 = local238 * local121 + local107 * local230 + local114 * local245;
		if (local320 < 0.0F) {
			local320 = 0.0F;
		}
		@Pc(546) float local546 = local277 * local320 * 2.0F;
		if (local546 > 1.0F) {
			local546 = 1.0F;
		}
		@Pc(557) int local557 = this.aClass2_Sub14_1.method7687();
		@Pc(567) int local567 = (int) (local546 * (float) (local557 >> 16 & 0xFF));
		if (local567 > 255) {
			local567 = 255;
		}
		@Pc(584) int local584 = (int) (local546 * (float) (local557 >> 8 & 0xFF));
		if (local584 > 255) {
			local584 = 255;
		}
		@Pc(599) int local599 = (int) (local546 * (float) (local557 & 0xFF));
		if (local599 > 255) {
			local599 = 255;
		}
		if (this.aClass100_Sub3_11.aBoolean595) {
			this.aClass2_Sub15_Sub1_1.method2575((float) local15);
			this.aClass2_Sub15_Sub1_1.method2575((float) local31);
			this.aClass2_Sub15_Sub1_1.method2575((float) local24);
		} else {
			this.aClass2_Sub15_Sub1_1.method2573((float) local15);
			this.aClass2_Sub15_Sub1_1.method2573((float) local31);
			this.aClass2_Sub15_Sub1_1.method2573((float) local24);
		}
		this.aClass2_Sub15_Sub1_1.method4333(local567);
		this.aClass2_Sub15_Sub1_1.method4333(local584);
		this.aClass2_Sub15_Sub1_1.method4333(local599);
		this.aClass2_Sub15_Sub1_1.method4333(255);
		this.method981(local83);
	}
}
