import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class6_Sub55 extends Class6 {

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
	private int anInt10455;

	@OriginalMember(owner = "client!vw", name = "C", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_42;

	@OriginalMember(owner = "client!vw", name = "v", descriptor = "Lclient!sca;")
	private final Class6_Sub17 aClass6_Sub17_2;

	@OriginalMember(owner = "client!vw", name = "x", descriptor = "Lclient!bda;")
	private final Class12_Sub2 aClass12_Sub2_3;

	@OriginalMember(owner = "client!vw", name = "z", descriptor = "I")
	private final int anInt10459;

	@OriginalMember(owner = "client!vw", name = "s", descriptor = "I")
	private final int anInt10457;

	@OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
	private final int anInt10453;

	@OriginalMember(owner = "client!vw", name = "G", descriptor = "I")
	private final int anInt10463;

	@OriginalMember(owner = "client!vw", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!vw", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!vw", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!vw", name = "B", descriptor = "I")
	private int anInt10461;

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "Lclient!gga;")
	private Class6_Sub23 aClass6_Sub23_9;

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "Lclient!un;")
	private Class6_Sub23_Sub2 aClass6_Sub23_Sub2_3;

	@OriginalMember(owner = "client!vw", name = "m", descriptor = "Lclient!lk;")
	private Class209 aClass209_54;

	@OriginalMember(owner = "client!vw", name = "H", descriptor = "Lclient!jda;")
	private final Interface14 anInterface14_5;

	@OriginalMember(owner = "client!vw", name = "F", descriptor = "Lclient!vn;")
	private final Interface26 anInterface26_7;

	@OriginalMember(owner = "client!vw", name = "E", descriptor = "Lclient!ls;")
	private final Class214 aClass214_16;

	@OriginalMember(owner = "client!vw", name = "u", descriptor = "Lclient!ls;")
	private final Class214 aClass214_15;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!pq;Lclient!bda;Lclient!sca;[I)V")
	public Class6_Sub55(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(2) Class6_Sub17 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass132_Sub3_42 = arg0;
		this.aClass6_Sub17_2 = arg2;
		this.aClass12_Sub2_3 = arg1;
		@Pc(22) int local22 = this.aClass6_Sub17_2.method8520() - (arg1.anInt9306 >> 1);
		this.anInt10459 = this.aClass6_Sub17_2.method8518() - local22 >> arg1.anInt9312;
		this.anInt10457 = local22 + this.aClass6_Sub17_2.method8518() >> arg1.anInt9312;
		this.anInt10453 = this.aClass6_Sub17_2.method8521() - local22 >> arg1.anInt9312;
		this.anInt10463 = this.aClass6_Sub17_2.method8521() + local22 >> arg1.anInt9312;
		@Pc(75) int local75 = this.anInt10457 + 1 - this.anInt10459;
		@Pc(83) int local83 = this.anInt10463 + 1 - this.anInt10453;
		this.aFloatArrayArray17 = new float[local75 + 1][local83 + 1];
		this.aFloatArrayArray16 = new float[local75 + 1][local83 + 1];
		this.aFloatArrayArray18 = new float[local75 + 1][local83 + 1];
		@Pc(120) int local120;
		@Pc(131) int local131;
		@Pc(138) int local138;
		@Pc(167) int local167;
		@Pc(183) int local183;
		for (@Pc(112) int local112 = 0; local112 <= local83; local112++) {
			local120 = local112 + this.anInt10453;
			if (local120 > 0 && this.aClass12_Sub2_3.anInt9313 - 1 > local120) {
				for (local131 = 0; local131 <= local75; local131++) {
					local138 = this.anInt10459 + local131;
					if (local138 > 0 && this.aClass12_Sub2_3.anInt9314 - 1 > local138) {
						local167 = arg1.method7846(local138 + 1, local120) - arg1.method7846(local138 - 1, local120);
						local183 = arg1.method7846(local138, local120 + 1) - arg1.method7846(local138, local120 - 1);
						@Pc(198) float local198 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + local167 * local167 + 65536)));
						this.aFloatArrayArray18[local131][local112] = local198 * (float) local167;
						this.aFloatArrayArray17[local131][local112] = local198 * -256.0F;
						this.aFloatArrayArray16[local131][local112] = (float) local183 * local198;
					}
				}
			}
		}
		local120 = 0;
		@Pc(308) int local308;
		for (local131 = this.anInt10453; local131 <= this.anInt10463; local131++) {
			if (local131 >= 0 && arg1.anInt9313 > local131) {
				for (local138 = this.anInt10459; local138 <= this.anInt10457; local138++) {
					if (local138 >= 0 && arg1.anInt9314 > local138) {
						local167 = arg3[local120];
						@Pc(288) int[] local288 = arg1.anIntArrayArrayArray12[local138][local131];
						if (local288 != null && local167 != 0) {
							if (local167 == 1) {
								local308 = 0;
								while (local308 < local288.length) {
									if (local288[local308++] != -1 && local288[local308++] != -1 && local288[local308++] != -1) {
										this.anInt10461 += 3;
									}
								}
							} else {
								this.anInt10461 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt10457 - this.anInt10459;
			}
		}
		if (this.anInt10461 > 0) {
			this.aClass6_Sub23_9 = new Class6_Sub23(this.anInt10461 * 2);
			this.aClass6_Sub23_Sub2_3 = new Class6_Sub23_Sub2(this.anInt10461 * 16);
			this.aClass209_54 = new Class209(Static655.method8912(this.anInt10461));
			local138 = 0;
			local120 = 0;
			for (local167 = this.anInt10453; local167 <= this.anInt10463; local167++) {
				if (local167 >= 0 && arg1.anInt9313 > local167) {
					local183 = 0;
					for (local308 = this.anInt10459; local308 <= this.anInt10457; local308++) {
						if (local308 >= 0 && arg1.anInt9314 > local308) {
							@Pc(427) int local427 = arg3[local120];
							@Pc(434) int[] local434 = arg1.anIntArrayArrayArray12[local308][local167];
							if (local434 != null && local427 != 0) {
								if (local427 == 1) {
									@Pc(592) int[] local592 = arg1.anIntArrayArrayArray9[local308][local167];
									@Pc(599) int[] local599 = arg1.anIntArrayArrayArray7[local308][local167];
									@Pc(601) int local601 = 0;
									label105: while (true) {
										while (true) {
											if (local434.length <= local601) {
												break label105;
											}
											if (local434[local601] == -1 || local434[local601 + 1] == -1 || local434[local601 + 2] == -1) {
												local601 += 3;
											} else {
												this.method8852(local183, local599[local601], local308, local592[local601], local167, local138);
												local601++;
												this.method8852(local183, local599[local601], local308, local592[local601], local167, local138);
												local601++;
												this.method8852(local183, local599[local601], local308, local592[local601], local167, local138);
												local601++;
											}
										}
									}
								} else if (local427 == 3) {
									this.method8852(local183, 0, local308, 0, local167, local138);
									this.method8852(local183, 0, local308, arg1.anInt9306, local167, local138);
									this.method8852(local183, arg1.anInt9306, local308, 0, local167, local138);
								} else if (local427 == 2) {
									this.method8852(local183, 0, local308, arg1.anInt9306, local167, local138);
									this.method8852(local183, arg1.anInt9306, local308, arg1.anInt9306, local167, local138);
									this.method8852(local183, 0, local308, 0, local167, local138);
								} else if (local427 == 5) {
									this.method8852(local183, arg1.anInt9306, local308, arg1.anInt9306, local167, local138);
									this.method8852(local183, arg1.anInt9306, local308, 0, local167, local138);
									this.method8852(local183, 0, local308, arg1.anInt9306, local167, local138);
								} else if (local427 == 4) {
									this.method8852(local183, arg1.anInt9306, local308, 0, local167, local138);
									this.method8852(local183, 0, local308, 0, local167, local138);
									this.method8852(local183, arg1.anInt9306, local308, arg1.anInt9306, local167, local138);
								}
							}
						}
						local120++;
						local183++;
					}
				} else {
					local120 += this.anInt10457 - this.anInt10459;
				}
				local138++;
			}
			this.anInterface14_5 = this.aClass132_Sub3_42.method6745(this.aClass6_Sub23_9.anInt9901, this.aClass6_Sub23_9.aByteArray101, false);
			this.anInterface26_7 = this.aClass132_Sub3_42.method6806(16, this.aClass6_Sub23_Sub2_3.anInt9901, false, this.aClass6_Sub23_Sub2_3.aByteArray101);
			this.aClass214_16 = new Class214(this.anInterface26_7, 5126, 3, 0);
			this.aClass214_15 = new Class214(this.anInterface26_7, 5121, 4, 12);
		} else {
			this.anInterface14_5 = null;
			this.aClass214_15 = null;
			this.aClass214_16 = null;
			this.anInterface26_7 = null;
		}
		this.aClass6_Sub23_Sub2_3 = null;
		this.aClass209_54 = null;
		this.aFloatArrayArray18 = this.aFloatArrayArray17 = this.aFloatArrayArray16 = null;
		this.aClass6_Sub23_9 = null;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IBIIIII)V")
	private void method8852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) long local13 = -1L;
		@Pc(21) int local21 = arg3 + (arg2 << this.aClass12_Sub2_3.anInt9312);
		@Pc(29) int local29 = (arg4 << this.aClass12_Sub2_3.anInt9312) + arg1;
		@Pc(36) int local36 = this.aClass12_Sub2_3.method7854(local29, local21);
		if ((arg3 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local13 = (long) local21 & 0xFFFFL | ((long) local29 & 0xFFFFL) << 16;
			@Pc(65) Class6 local65 = this.aClass209_54.method5038(local13);
			if (local65 != null) {
				this.method8853(((Class6_Sub40) local65).aShort83);
				return;
			}
		}
		@Pc(83) short local83 = (short) this.anInt10455++;
		if (local13 != -1L) {
			this.aClass209_54.method5035(local13, new Class6_Sub40(local83));
		}
		@Pc(158) float local158;
		@Pc(147) float local147;
		@Pc(136) float local136;
		@Pc(178) float local178;
		@Pc(186) float local186;
		@Pc(193) float local193;
		@Pc(200) float local200;
		@Pc(207) float local207;
		@Pc(216) float local216;
		@Pc(225) float local225;
		@Pc(300) float local300;
		if (arg3 == 0 && arg1 == 0) {
			local158 = this.aFloatArrayArray18[arg0][arg5];
			local147 = this.aFloatArrayArray17[arg0][arg5];
			local136 = this.aFloatArrayArray16[arg0][arg5];
		} else if (arg3 == this.aClass12_Sub2_3.anInt9306 && arg1 == 0) {
			local136 = this.aFloatArrayArray16[arg0 + 1][arg5];
			local147 = this.aFloatArrayArray17[arg0 + 1][arg5];
			local158 = this.aFloatArrayArray18[arg0 + 1][arg5];
		} else if (this.aClass12_Sub2_3.anInt9306 == arg3 && arg1 == this.aClass12_Sub2_3.anInt9306) {
			local136 = this.aFloatArrayArray16[arg0 + 1][arg5 + 1];
			local147 = this.aFloatArrayArray17[arg0 + 1][arg5 + 1];
			local158 = this.aFloatArrayArray18[arg0 + 1][arg5 + 1];
		} else if (arg3 == 0 && this.aClass12_Sub2_3.anInt9306 == arg1) {
			local136 = this.aFloatArrayArray16[arg0][arg5 + 1];
			local158 = this.aFloatArrayArray18[arg0][arg5 + 1];
			local147 = this.aFloatArrayArray17[arg0][arg5 + 1];
		} else {
			local178 = (float) arg3 / (float) this.aClass12_Sub2_3.anInt9306;
			local186 = (float) arg1 / (float) this.aClass12_Sub2_3.anInt9306;
			local193 = this.aFloatArrayArray18[arg0][arg5];
			local200 = this.aFloatArrayArray17[arg0][arg5];
			local207 = this.aFloatArrayArray16[arg0][arg5];
			local216 = this.aFloatArrayArray18[arg0 + 1][arg5];
			local225 = this.aFloatArrayArray17[arg0 + 1][arg5];
			@Pc(242) float local242 = local225 + (this.aFloatArrayArray17[arg0 + 1][arg5 + 1] - local225) * local178;
			@Pc(260) float local260 = local216 + (this.aFloatArrayArray18[arg0 + 1][arg5 + 1] - local216) * local178;
			@Pc(276) float local276 = local207 + (this.aFloatArrayArray16[arg0][arg5 + 1] - local207) * local178;
			@Pc(291) float local291 = local193 + (this.aFloatArrayArray18[arg0][arg5 + 1] - local193) * local178;
			local300 = this.aFloatArrayArray16[arg0 + 1][arg5];
			@Pc(316) float local316 = local200 + (this.aFloatArrayArray17[arg0][arg5 + 1] - local200) * local178;
			@Pc(333) float local333 = local300 + local178 * (this.aFloatArrayArray16[arg0 + 1][arg5 + 1] - local300);
			local147 = local316 + (local242 - local316) * local186;
			local158 = local291 + local186 * (local260 - local291);
			local136 = local276 + (local333 - local276) * local186;
		}
		local178 = (float) (this.aClass6_Sub17_2.method8518() - local21);
		local186 = (float) (this.aClass6_Sub17_2.method8522() - local36);
		local193 = (float) (this.aClass6_Sub17_2.method8521() - local29);
		local200 = (float) Math.sqrt((double) (local178 * local178 + local186 * local186 + local193 * local193));
		local207 = 1.0F / local200;
		local186 *= local207;
		local178 *= local207;
		local193 *= local207;
		local216 = local200 / (float) this.aClass6_Sub17_2.method8520();
		local225 = 1.0F - local216 * local216;
		if (local225 < 0.0F) {
			local225 = 0.0F;
		}
		local300 = local136 * local193 + local186 * local147 + local178 * local158;
		if (local300 < 0.0F) {
			local300 = 0.0F;
		}
		@Pc(541) float local541 = local300 * 2.0F * local225;
		if (local541 > 1.0F) {
			local541 = 1.0F;
		}
		@Pc(552) int local552 = this.aClass6_Sub17_2.method8519();
		@Pc(562) int local562 = (int) ((float) (local552 >> 16 & 0xFF) * local541);
		if (local562 > 255) {
			local562 = 255;
		}
		@Pc(579) int local579 = (int) (local541 * (float) (local552 >> 8 & 0xFF));
		if (local579 > 255) {
			local579 = 255;
		}
		@Pc(592) int local592 = (int) (local541 * (float) (local552 & 0xFF));
		if (local592 > 255) {
			local592 = 255;
		}
		if (this.aClass132_Sub3_42.aBoolean544) {
			this.aClass6_Sub23_Sub2_3.method8407((float) local21);
			this.aClass6_Sub23_Sub2_3.method8407((float) local36);
			this.aClass6_Sub23_Sub2_3.method8407((float) local29);
		} else {
			this.aClass6_Sub23_Sub2_3.method8406((float) local21);
			this.aClass6_Sub23_Sub2_3.method8406((float) local36);
			this.aClass6_Sub23_Sub2_3.method8406((float) local29);
		}
		this.aClass6_Sub23_Sub2_3.method8366(local562);
		this.aClass6_Sub23_Sub2_3.method8366(local579);
		this.aClass6_Sub23_Sub2_3.method8366(local592);
		this.aClass6_Sub23_Sub2_3.method8366(255);
		this.method8853(local83);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IS)V")
	private void method8853(@OriginalArg(1) short arg0) {
		if (this.aClass132_Sub3_42.aBoolean544) {
			this.aClass6_Sub23_9.method8347(arg0);
		} else {
			this.aClass6_Sub23_9.method8335(arg0);
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(III[[ZI)V")
	public void method8855(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface14_5 == null || (arg0 + arg3 < this.anInt10459 || (this.anInt10457 < arg0 - arg3 || (arg1 + arg3 < this.anInt10453 || arg1 - arg3 > this.anInt10463)))) {
			return;
		}
		for (@Pc(62) int local62 = this.anInt10453; local62 <= this.anInt10463; local62++) {
			for (@Pc(67) int local67 = this.anInt10459; local67 <= this.anInt10457; local67++) {
				@Pc(74) int local74 = local67 - arg0;
				@Pc(78) int local78 = local62 - arg1;
				if (-arg3 < local74 && local74 < arg3 && -arg3 < local78 && local78 < arg3 && arg2[local74 + arg3][arg3 + local78]) {
					this.aClass132_Sub3_42.method6733((int) (this.aClass6_Sub17_2.method8524() * 255.0F) << 24);
					this.aClass132_Sub3_42.method6788(this.aClass214_16, (Class214) null, this.aClass214_15, (Class214) null);
					this.aClass132_Sub3_42.method6751(this.anInt10461, this.anInterface14_5, 0);
					return;
				}
			}
		}
	}
}
