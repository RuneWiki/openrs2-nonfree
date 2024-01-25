import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "I")
	private int anInt6970;

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "Lclient!rq;")
	private final Class91_Sub3 aClass91_Sub3_3;

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_31;

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "Lclient!tj;")
	private final Class3_Sub22 aClass3_Sub22_2;

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
	private final int anInt6967;

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
	private final int anInt6966;

	@OriginalMember(owner = "client!nv", name = "D", descriptor = "I")
	private final int anInt6971;

	@OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
	private final int anInt6972;

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!nv", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!nv", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
	private int anInt6969;

	@OriginalMember(owner = "client!nv", name = "B", descriptor = "Lclient!ss;")
	private final Class313 aClass313_12;

	@OriginalMember(owner = "client!nv", name = "H", descriptor = "Lclient!pa;")
	private final Interface17 anInterface17_5;

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "Lclient!bia;")
	private final Interface3 anInterface3_5;

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Lclient!ss;")
	private final Class313 aClass313_11;

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "Lclient!dc;")
	private Class3_Sub9 aClass3_Sub9_5;

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "Lclient!bga;")
	private Class3_Sub9_Sub1 aClass3_Sub9_Sub1_3;

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "Lclient!baa;")
	private Class25 aClass25_28;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!dw;Lclient!rq;Lclient!tj;[I)V")
	public Class3_Sub37(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Class91_Sub3 arg1, @OriginalArg(2) Class3_Sub22 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass91_Sub3_3 = arg1;
		this.aClass82_Sub1_31 = arg0;
		this.aClass3_Sub22_2 = arg2;
		@Pc(22) int local22 = this.aClass3_Sub22_2.method8382() - (arg1.anInt8986 >> 1);
		this.anInt6967 = this.aClass3_Sub22_2.method8391() - local22 >> arg1.anInt8988;
		this.anInt6966 = this.aClass3_Sub22_2.method8391() + local22 >> arg1.anInt8988;
		this.anInt6971 = this.aClass3_Sub22_2.method8386() - local22 >> arg1.anInt8988;
		this.anInt6972 = this.aClass3_Sub22_2.method8386() + local22 >> arg1.anInt8988;
		@Pc(78) int local78 = this.anInt6966 + 1 - this.anInt6967;
		@Pc(86) int local86 = this.anInt6972 + 1 - this.anInt6971;
		this.aFloatArrayArray10 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray11 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray12 = new float[local78 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(168) int local168;
		@Pc(185) int local185;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt6971;
			if (local122 > 0 && local122 < this.aClass91_Sub3_3.anInt8985 - 1) {
				for (local133 = 0; local133 <= local78; local133++) {
					local140 = this.anInt6967 + local133;
					if (local140 > 0 && local140 < this.aClass91_Sub3_3.anInt8983 - 1) {
						local168 = arg1.method7724(local122, local140 + 1) - arg1.method7724(local122, local140 - 1);
						local185 = arg1.method7724(local122 + 1, local140) - arg1.method7724(local122 - 1, local140);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local185 * local185 + local168 * local168 + 65536)));
						this.aFloatArrayArray12[local133][local115] = local200 * (float) local168;
						this.aFloatArrayArray10[local133][local115] = local200 * -256.0F;
						this.aFloatArrayArray11[local133][local115] = local200 * (float) local185;
					}
				}
			}
		}
		local122 = 0;
		@Pc(312) int local312;
		for (local133 = this.anInt6971; local133 <= this.anInt6972; local133++) {
			if (local133 >= 0 && local133 < arg1.anInt8985) {
				for (local140 = this.anInt6967; local140 <= this.anInt6966; local140++) {
					if (local140 >= 0 && local140 < arg1.anInt8983) {
						local168 = arg3[local122];
						@Pc(290) int[] local290 = arg1.anIntArrayArrayArray30[local140][local133];
						if (local290 != null && local168 != 0) {
							if (local168 == 1) {
								local312 = 0;
								while (local312 < local290.length) {
									if (local290[local312++] != -1 && local290[local312++] != -1 && local290[local312++] != -1) {
										this.anInt6969 += 3;
									}
								}
							} else {
								this.anInt6969 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt6966 - this.anInt6967;
			}
		}
		if (this.anInt6969 <= 0) {
			this.aClass313_12 = null;
			this.anInterface17_5 = null;
			this.anInterface3_5 = null;
			this.aClass313_11 = null;
		} else {
			this.aClass3_Sub9_5 = new Class3_Sub9(this.anInt6969 * 2);
			this.aClass3_Sub9_Sub1_3 = new Class3_Sub9_Sub1(this.anInt6969 * 16);
			this.aClass25_28 = new Class25(Static533.method1203(this.anInt6969));
			local122 = 0;
			local140 = 0;
			for (local168 = this.anInt6971; local168 <= this.anInt6972; local168++) {
				if (local168 >= 0 && arg1.anInt8985 > local168) {
					local185 = 0;
					for (local312 = this.anInt6967; local312 <= this.anInt6966; local312++) {
						if (local312 >= 0 && arg1.anInt8983 > local312) {
							@Pc(456) int local456 = arg3[local122];
							@Pc(463) int[] local463 = arg1.anIntArrayArrayArray30[local312][local168];
							if (local463 != null && local456 != 0) {
								if (local456 == 1) {
									@Pc(479) int[] local479 = arg1.anIntArrayArrayArray28[local312][local168];
									@Pc(486) int[] local486 = arg1.anIntArrayArrayArray31[local312][local168];
									@Pc(488) int local488 = 0;
									label107: while (true) {
										while (true) {
											if (local488 >= local463.length) {
												break label107;
											}
											if (local463[local488] == -1 || local463[local488 + 1] == -1 || local463[local488 + 2] == -1) {
												local488 += 3;
											} else {
												this.method6068(local312, local479[local488], local140, local486[local488], local168, local185);
												local488++;
												this.method6068(local312, local479[local488], local140, local486[local488], local168, local185);
												local488++;
												this.method6068(local312, local479[local488], local140, local486[local488], local168, local185);
												local488++;
											}
										}
									}
								} else if (local456 == 3) {
									this.method6068(local312, 0, local140, 0, local168, local185);
									this.method6068(local312, arg1.anInt8986, local140, 0, local168, local185);
									this.method6068(local312, 0, local140, arg1.anInt8986, local168, local185);
								} else if (local456 == 2) {
									this.method6068(local312, arg1.anInt8986, local140, 0, local168, local185);
									this.method6068(local312, arg1.anInt8986, local140, arg1.anInt8986, local168, local185);
									this.method6068(local312, 0, local140, 0, local168, local185);
								} else if (local456 == 5) {
									this.method6068(local312, arg1.anInt8986, local140, arg1.anInt8986, local168, local185);
									this.method6068(local312, 0, local140, arg1.anInt8986, local168, local185);
									this.method6068(local312, arg1.anInt8986, local140, 0, local168, local185);
								} else if (local456 == 4) {
									this.method6068(local312, 0, local140, arg1.anInt8986, local168, local185);
									this.method6068(local312, 0, local140, 0, local168, local185);
									this.method6068(local312, arg1.anInt8986, local140, arg1.anInt8986, local168, local185);
								}
							}
						}
						local122++;
						local185++;
					}
				} else {
					local122 += this.anInt6966 - this.anInt6967;
				}
				local140++;
			}
			this.anInterface17_5 = this.aClass82_Sub1_31.method2044(this.aClass3_Sub9_5.aByteArray51, this.aClass3_Sub9_5.anInt6453, false);
			this.anInterface3_5 = this.aClass82_Sub1_31.method2035(false, 16, this.aClass3_Sub9_Sub1_3.aByteArray51, this.aClass3_Sub9_Sub1_3.anInt6453);
			this.aClass313_11 = new Class313(this.anInterface3_5, 5126, 3, 0);
			this.aClass313_12 = new Class313(this.anInterface3_5, 5121, 4, 12);
		}
		this.aClass25_28 = null;
		this.aClass3_Sub9_Sub1_3 = null;
		this.aClass3_Sub9_5 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray10 = this.aFloatArrayArray11 = null;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZIIII)V")
	private void method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(22) int local22 = arg1 + (arg0 << this.aClass91_Sub3_3.anInt8988);
		@Pc(30) int local30 = (arg4 << this.aClass91_Sub3_3.anInt8988) + arg3;
		@Pc(37) int local37 = this.aClass91_Sub3_3.method7725(local22, local30);
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local22 & 0xFFFFL | (long) local30 << 16 & 0xFFFFL << 16;
			@Pc(68) Class3 local68 = this.aClass25_28.method426(local7);
			if (local68 != null) {
				this.method6071(((Class3_Sub8) local68).aShort1);
				return;
			}
		}
		@Pc(86) short local86 = (short) this.anInt6970++;
		if (local7 != -1L) {
			this.aClass25_28.method434(local7, new Class3_Sub8(local86));
		}
		@Pc(147) float local147;
		@Pc(129) float local129;
		@Pc(138) float local138;
		@Pc(253) float local253;
		@Pc(261) float local261;
		@Pc(268) float local268;
		@Pc(275) float local275;
		@Pc(282) float local282;
		@Pc(291) float local291;
		@Pc(300) float local300;
		@Pc(390) float local390;
		if (arg1 == 0 && arg3 == 0) {
			local138 = this.aFloatArrayArray11[arg5][arg2];
			local147 = this.aFloatArrayArray12[arg5][arg2];
			local129 = this.aFloatArrayArray10[arg5][arg2];
		} else if (arg1 == this.aClass91_Sub3_3.anInt8986 && arg3 == 0) {
			local129 = this.aFloatArrayArray10[arg5 + 1][arg2];
			local138 = this.aFloatArrayArray11[arg5 + 1][arg2];
			local147 = this.aFloatArrayArray12[arg5 + 1][arg2];
		} else if (arg1 == this.aClass91_Sub3_3.anInt8986 && arg3 == this.aClass91_Sub3_3.anInt8986) {
			local129 = this.aFloatArrayArray10[arg5 + 1][arg2 + 1];
			local147 = this.aFloatArrayArray12[arg5 + 1][arg2 + 1];
			local138 = this.aFloatArrayArray11[arg5 + 1][arg2 + 1];
		} else if (arg1 == 0 && this.aClass91_Sub3_3.anInt8986 == arg3) {
			local147 = this.aFloatArrayArray12[arg5][arg2 + 1];
			local129 = this.aFloatArrayArray10[arg5][arg2 + 1];
			local138 = this.aFloatArrayArray11[arg5][arg2 + 1];
		} else {
			local253 = (float) arg1 / (float) this.aClass91_Sub3_3.anInt8986;
			local261 = (float) arg3 / (float) this.aClass91_Sub3_3.anInt8986;
			local268 = this.aFloatArrayArray12[arg5][arg2];
			local275 = this.aFloatArrayArray10[arg5][arg2];
			local282 = this.aFloatArrayArray11[arg5][arg2];
			local291 = this.aFloatArrayArray12[arg5 + 1][arg2];
			local300 = this.aFloatArrayArray10[arg5 + 1][arg2];
			@Pc(317) float local317 = local300 + (this.aFloatArrayArray10[arg5 + 1][arg2 + 1] - local300) * local253;
			@Pc(334) float local334 = local291 + local253 * (this.aFloatArrayArray12[arg5 + 1][arg2 + 1] - local291);
			@Pc(350) float local350 = local275 + (this.aFloatArrayArray10[arg5][arg2 + 1] - local275) * local253;
			@Pc(365) float local365 = local282 + (this.aFloatArrayArray11[arg5][arg2 + 1] - local282) * local253;
			@Pc(381) float local381 = local268 + (this.aFloatArrayArray12[arg5][arg2 + 1] - local268) * local253;
			local390 = this.aFloatArrayArray11[arg5 + 1][arg2];
			local147 = local381 + local261 * (local334 - local381);
			@Pc(417) float local417 = local390 + (this.aFloatArrayArray11[arg5 + 1][arg2 + 1] - local390) * local253;
			local129 = local350 + (local317 - local350) * local261;
			local138 = local365 + (local417 - local365) * local261;
		}
		local253 = (float) (this.aClass3_Sub22_2.method8391() - local22);
		local261 = (float) (this.aClass3_Sub22_2.method8383() - local37);
		local268 = (float) (this.aClass3_Sub22_2.method8386() - local30);
		local275 = (float) Math.sqrt((double) (local261 * local261 + local253 * local253 + local268 * local268));
		local282 = 1.0F / local275;
		local268 *= local282;
		local253 *= local282;
		local261 *= local282;
		local291 = local275 / (float) this.aClass3_Sub22_2.method8382();
		local300 = 1.0F - local291 * local291;
		if (local300 < 0.0F) {
			local300 = 0.0F;
		}
		local390 = local147 * local253 + local129 * local261 + local138 * local268;
		if (local390 < 0.0F) {
			local390 = 0.0F;
		}
		@Pc(559) float local559 = local300 * 2.0F * local390;
		if (local559 > 1.0F) {
			local559 = 1.0F;
		}
		@Pc(570) int local570 = this.aClass3_Sub22_2.method8384();
		@Pc(580) int local580 = (int) (local559 * (float) (local570 >> 16 & 0xFF));
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(597) int local597 = (int) (local559 * (float) (local570 >> 8 & 0xFF));
		if (local597 > 255) {
			local597 = 255;
		}
		@Pc(610) int local610 = (int) (local559 * (float) (local570 & 0xFF));
		if (local610 > 255) {
			local610 = 255;
		}
		if (this.aClass82_Sub1_31.aBoolean174) {
			this.aClass3_Sub9_Sub1_3.method706((float) local22);
			this.aClass3_Sub9_Sub1_3.method706((float) local37);
			this.aClass3_Sub9_Sub1_3.method706((float) local30);
		} else {
			this.aClass3_Sub9_Sub1_3.method704((float) local22);
			this.aClass3_Sub9_Sub1_3.method704((float) local37);
			this.aClass3_Sub9_Sub1_3.method704((float) local30);
		}
		this.aClass3_Sub9_Sub1_3.method5572(local580);
		this.aClass3_Sub9_Sub1_3.method5572(local597);
		this.aClass3_Sub9_Sub1_3.method5572(local610);
		this.aClass3_Sub9_Sub1_3.method5572(255);
		this.method6071(local86);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI[[ZII)V")
	public void method6069(@OriginalArg(1) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface17_5 == null || (this.anInt6967 > arg2 + arg3 || (arg2 - arg3 > this.anInt6966 || (arg0 + arg3 < this.anInt6971 || arg0 - arg3 > this.anInt6972)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt6971; local51 <= this.anInt6972; local51++) {
			for (@Pc(56) int local56 = this.anInt6967; local56 <= this.anInt6966; local56++) {
				@Pc(63) int local63 = local56 - arg2;
				@Pc(67) int local67 = local51 - arg0;
				if (-arg3 < local63 && local63 < arg3 && local67 > -arg3 && arg3 > local67 && arg1[arg3 + local63][local67 + arg3]) {
					this.aClass82_Sub1_31.method2100((int) (this.aClass3_Sub22_2.method8387() * 255.0F) << 24);
					this.aClass82_Sub1_31.method2073(this.aClass313_12, (Class313) null, (Class313) null, this.aClass313_11);
					this.aClass82_Sub1_31.method2036(0, this.anInt6969, this.anInterface17_5);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BS)V")
	private void method6071(@OriginalArg(1) short arg0) {
		if (this.aClass82_Sub1_31.aBoolean174) {
			this.aClass3_Sub9_5.method5620(arg0);
		} else {
			this.aClass3_Sub9_5.method5627(arg0);
		}
	}
}
