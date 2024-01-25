import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class5_Sub26 extends Class5 {

	@OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
	private int anInt3867;

	@OriginalMember(owner = "client!ica", name = "C", descriptor = "I")
	private int anInt3872;

	@OriginalMember(owner = "client!ica", name = "A", descriptor = "Lclient!uca;")
	private final Class5_Sub10 aClass5_Sub10_2;

	@OriginalMember(owner = "client!ica", name = "y", descriptor = "Lclient!vh;")
	private final Class131_Sub3 aClass131_Sub3_2;

	@OriginalMember(owner = "client!ica", name = "p", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_13;

	@OriginalMember(owner = "client!ica", name = "q", descriptor = "I")
	private final int anInt3868;

	@OriginalMember(owner = "client!ica", name = "E", descriptor = "I")
	private final int anInt3873;

	@OriginalMember(owner = "client!ica", name = "v", descriptor = "I")
	private final int anInt3869;

	@OriginalMember(owner = "client!ica", name = "l", descriptor = "I")
	private final int anInt3865;

	@OriginalMember(owner = "client!ica", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!ica", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!ica", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "Lclient!co;")
	private Class5_Sub3 aClass5_Sub3_9;

	@OriginalMember(owner = "client!ica", name = "u", descriptor = "Lclient!jv;")
	private Class5_Sub3_Sub2 aClass5_Sub3_Sub2_2;

	@OriginalMember(owner = "client!ica", name = "s", descriptor = "Lclient!cb;")
	private Class42 aClass42_14;

	@OriginalMember(owner = "client!ica", name = "D", descriptor = "Lclient!gw;")
	private final Interface6 anInterface6_1;

	@OriginalMember(owner = "client!ica", name = "F", descriptor = "Lclient!pi;")
	private final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!ica", name = "K", descriptor = "Lclient!as;")
	private final Class19 aClass19_6;

	@OriginalMember(owner = "client!ica", name = "x", descriptor = "Lclient!as;")
	private final Class19 aClass19_5;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!jj;Lclient!vh;Lclient!uca;[I)V")
	public Class5_Sub26(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) Class131_Sub3 arg1, @OriginalArg(2) Class5_Sub10 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass5_Sub10_2 = arg2;
		this.aClass131_Sub3_2 = arg1;
		this.aClass62_Sub3_13 = arg0;
		@Pc(22) int local22 = this.aClass5_Sub10_2.method5191() - (arg1.anInt8874 >> 1);
		this.anInt3868 = this.aClass5_Sub10_2.method5189() - local22 >> arg1.anInt8869;
		this.anInt3873 = local22 + this.aClass5_Sub10_2.method5189() >> arg1.anInt8869;
		this.anInt3869 = this.aClass5_Sub10_2.method5183() - local22 >> arg1.anInt8869;
		this.anInt3865 = local22 + this.aClass5_Sub10_2.method5183() >> arg1.anInt8869;
		@Pc(77) int local77 = this.anInt3873 + 1 - this.anInt3868;
		@Pc(85) int local85 = this.anInt3865 + 1 - this.anInt3869;
		this.aFloatArrayArray8 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray9 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray7 = new float[local77 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(132) int local132;
		@Pc(140) int local140;
		@Pc(168) int local168;
		@Pc(183) int local183;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt3869 + local114;
			if (local121 > 0 && this.aClass131_Sub3_2.anInt8871 - 1 > local121) {
				for (local132 = 0; local132 <= local77; local132++) {
					local140 = local132 + this.anInt3868;
					if (local140 > 0 && this.aClass131_Sub3_2.anInt8873 - 1 > local140) {
						local168 = arg1.ba(local140 + 1, local121) - arg1.ba(local140 - 1, local121);
						local183 = arg1.ba(local140, local121 + 1) - arg1.ba(local140, local121 - 1);
						@Pc(198) float local198 = (float) (1.0D / Math.sqrt((double) (local168 * local168 + local183 * local183 + 65536)));
						this.aFloatArrayArray7[local132][local114] = (float) local168 * local198;
						this.aFloatArrayArray9[local132][local114] = local198 * -256.0F;
						this.aFloatArrayArray8[local132][local114] = local198 * (float) local183;
					}
				}
			}
		}
		local121 = 0;
		local132 = 0;
		for (local140 = this.anInt3869; local140 <= this.anInt3865; local140++) {
			if (local140 >= 0 && local140 < arg1.anInt8871) {
				for (local168 = this.anInt3868; local168 <= this.anInt3873; local168++) {
					if (local168 >= 0 && arg1.anInt8873 > local168) {
						local183 = arg3[local132];
						@Pc(283) int[] local283 = arg1.anIntArrayArrayArray15[local168][local140];
						if (local283 != null && local183 != 0) {
							if (local183 == 1) {
								local121 += local283.length;
							} else {
								local121 += 3;
							}
						}
					}
					local132++;
				}
			} else {
				local132 += this.anInt3873 - this.anInt3868;
			}
		}
		if (local121 > 0) {
			this.aClass5_Sub3_9 = new Class5_Sub3(local121 * 2);
			this.aClass5_Sub3_Sub2_2 = new Class5_Sub3_Sub2(local121 * 16);
			this.aClass42_14 = new Class42(Static179.method3071(local121));
			local168 = 0;
			local132 = 0;
			for (local183 = this.anInt3869; local183 <= this.anInt3865; local183++) {
				if (local183 >= 0 && local183 < arg1.anInt8871) {
					@Pc(370) int local370 = 0;
					for (@Pc(373) int local373 = this.anInt3868; local373 <= this.anInt3873; local373++) {
						if (local373 >= 0 && arg1.anInt8873 > local373) {
							@Pc(388) int local388 = arg3[local132];
							@Pc(395) int[] local395 = arg1.anIntArrayArrayArray15[local373][local183];
							@Pc(402) int[] local402 = arg1.anIntArrayArrayArray19[local373][local183];
							if (local395 != null && local388 != 0) {
								if (local388 == 1) {
									for (@Pc(553) int local553 = 0; local553 < local395.length; local553++) {
										this.method3344(local370, local395[local553], local373, local183, local168, local402[local553]);
									}
								} else if (local388 == 3) {
									this.method3344(local370, 0, local373, local183, local168, 0);
									this.method3344(local370, arg1.anInt8874, local373, local183, local168, 0);
									this.method3344(local370, 0, local373, local183, local168, arg1.anInt8874);
								} else if (local388 == 2) {
									this.method3344(local370, arg1.anInt8874, local373, local183, local168, 0);
									this.method3344(local370, arg1.anInt8874, local373, local183, local168, arg1.anInt8874);
									this.method3344(local370, 0, local373, local183, local168, 0);
								} else if (local388 == 5) {
									this.method3344(local370, arg1.anInt8874, local373, local183, local168, arg1.anInt8874);
									this.method3344(local370, 0, local373, local183, local168, arg1.anInt8874);
									this.method3344(local370, arg1.anInt8874, local373, local183, local168, 0);
								} else if (local388 == 4) {
									this.method3344(local370, 0, local373, local183, local168, arg1.anInt8874);
									this.method3344(local370, 0, local373, local183, local168, 0);
									this.method3344(local370, arg1.anInt8874, local373, local183, local168, arg1.anInt8874);
								}
							}
						}
						local132++;
						local370++;
					}
				} else {
					local132 += this.anInt3873 - this.anInt3868;
				}
				local168++;
			}
			this.anInterface6_1 = this.aClass62_Sub3_13.method3953(this.aClass5_Sub3_9.aByteArray66, false, this.aClass5_Sub3_9.anInt4960);
			this.anInterface11_3 = this.aClass62_Sub3_13.method3964(this.aClass5_Sub3_Sub2_2.aByteArray66, false, 16, this.aClass5_Sub3_Sub2_2.anInt4960);
			this.aClass19_6 = new Class19(this.anInterface11_3, 5126, 3, 0);
			this.aClass19_5 = new Class19(this.anInterface11_3, 5121, 4, 12);
		} else {
			this.aClass19_5 = null;
			this.anInterface6_1 = null;
			this.anInterface11_3 = null;
			this.aClass19_6 = null;
		}
		this.aClass5_Sub3_9 = null;
		this.aClass42_14 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray9 = this.aFloatArrayArray8 = null;
		this.aClass5_Sub3_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BS)V")
	private void method3341(@OriginalArg(1) short arg0) {
		if (this.aClass62_Sub3_13.aBoolean278) {
			this.aClass5_Sub3_9.method4181(arg0);
		} else {
			this.aClass5_Sub3_9.method4195(arg0);
		}
		this.anInt3867++;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "([[ZIIII)V")
	public void method3342(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface6_1 == null || (this.anInt3868 > arg2 + arg1 || (arg2 - arg1 > this.anInt3873 || (this.anInt3869 > arg3 + arg1 || arg3 - arg1 > this.anInt3865)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt3869; local51 <= this.anInt3865; local51++) {
			for (@Pc(62) int local62 = this.anInt3868; local62 <= this.anInt3873; local62++) {
				@Pc(69) int local69 = local62 - arg2;
				@Pc(74) int local74 = local51 - arg3;
				if (local69 > -arg1 && arg1 > local69 && local74 > -arg1 && arg1 > local74 && arg0[local69 + arg1][arg1 + local74]) {
					this.aClass62_Sub3_13.method3956((int) (this.aClass5_Sub10_2.method5184() * 255.0F) << 24);
					this.aClass62_Sub3_13.method4000(null, null, this.aClass19_5, this.aClass19_6);
					this.aClass62_Sub3_13.method3938(this.anInterface6_1, 0, this.anInt3867);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIII)V")
	private void method3344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg2 << this.aClass131_Sub3_2.anInt8869) + arg1;
		@Pc(23) int local23 = arg5 + (arg3 << this.aClass131_Sub3_2.anInt8869);
		@Pc(29) int local29 = this.aClass131_Sub3_2.aa(local15, local23);
		if ((arg1 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(60) Class5 local60 = this.aClass42_14.method1109(local7);
			if (local60 != null) {
				this.method3341(((Class5_Sub35) local60).aShort88);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt3872++;
		if (local7 != -1L) {
			this.aClass42_14.method1106(local7, new Class5_Sub35(local78));
		}
		@Pc(151) float local151;
		@Pc(140) float local140;
		@Pc(129) float local129;
		@Pc(204) float local204;
		@Pc(212) float local212;
		@Pc(219) float local219;
		@Pc(226) float local226;
		@Pc(233) float local233;
		@Pc(242) float local242;
		@Pc(251) float local251;
		@Pc(327) float local327;
		if (arg1 == 0 && arg5 == 0) {
			local151 = this.aFloatArrayArray7[arg0][arg4];
			local140 = this.aFloatArrayArray9[arg0][arg4];
			local129 = this.aFloatArrayArray8[arg0][arg4];
		} else if (this.aClass131_Sub3_2.anInt8874 == arg1 && arg5 == 0) {
			local140 = this.aFloatArrayArray9[arg0 + 1][arg4];
			local151 = this.aFloatArrayArray7[arg0 + 1][arg4];
			local129 = this.aFloatArrayArray8[arg0 + 1][arg4];
		} else if (arg1 == this.aClass131_Sub3_2.anInt8874 && arg5 == this.aClass131_Sub3_2.anInt8874) {
			local129 = this.aFloatArrayArray8[arg0 + 1][arg4 + 1];
			local140 = this.aFloatArrayArray9[arg0 + 1][arg4 + 1];
			local151 = this.aFloatArrayArray7[arg0 + 1][arg4 + 1];
		} else if (arg1 == 0 && arg5 == this.aClass131_Sub3_2.anInt8874) {
			local151 = this.aFloatArrayArray7[arg0][arg4 + 1];
			local129 = this.aFloatArrayArray8[arg0][arg4 + 1];
			local140 = this.aFloatArrayArray9[arg0][arg4 + 1];
		} else {
			local204 = (float) arg1 / (float) this.aClass131_Sub3_2.anInt8874;
			local212 = (float) arg5 / (float) this.aClass131_Sub3_2.anInt8874;
			local219 = this.aFloatArrayArray7[arg0][arg4];
			local226 = this.aFloatArrayArray9[arg0][arg4];
			local233 = this.aFloatArrayArray8[arg0][arg4];
			local242 = this.aFloatArrayArray7[arg0 + 1][arg4];
			local251 = this.aFloatArrayArray9[arg0 + 1][arg4];
			@Pc(268) float local268 = local242 + local204 * (this.aFloatArrayArray7[arg0 + 1][arg4 + 1] - local242);
			@Pc(284) float local284 = local226 + local204 * (this.aFloatArrayArray9[arg0][arg4 + 1] - local226);
			@Pc(300) float local300 = local219 + local204 * (this.aFloatArrayArray7[arg0][arg4 + 1] - local219);
			@Pc(318) float local318 = local251 + local204 * (this.aFloatArrayArray9[arg0 + 1][arg4 + 1] - local251);
			local327 = this.aFloatArrayArray8[arg0 + 1][arg4];
			@Pc(343) float local343 = local233 + local204 * (this.aFloatArrayArray8[arg0][arg4 + 1] - local233);
			local140 = local284 + local212 * (local318 - local284);
			@Pc(368) float local368 = local327 + (this.aFloatArrayArray8[arg0 + 1][arg4 + 1] - local327) * local204;
			local151 = local300 + local212 * (local268 - local300);
			local129 = local212 * (local368 - local343) + local343;
		}
		local204 = this.aClass5_Sub10_2.method5189() - local15;
		local212 = this.aClass5_Sub10_2.method5190() - local29;
		local219 = this.aClass5_Sub10_2.method5183() - local23;
		local226 = (float) Math.sqrt((double) (local212 * local212 + local204 * local204 + local219 * local219));
		local233 = 1.0F / local226;
		local219 *= local233;
		local204 *= local233;
		local212 *= local233;
		local242 = local226 / (float) this.aClass5_Sub10_2.method5191();
		local251 = 1.0F - local242 * local242;
		if (local251 < 0.0F) {
			local251 = 0.0F;
		}
		local327 = local219 * local129 + local204 * local151 + local212 * local140;
		if (local327 < 0.0F) {
			local327 = 0.0F;
		}
		@Pc(541) float local541 = local251 * 2.0F * local327;
		if (local541 > 1.0F) {
			local541 = 1.0F;
		}
		@Pc(552) int local552 = this.aClass5_Sub10_2.method5185();
		@Pc(562) int local562 = (int) (local541 * (float) (local552 >> 16 & 0xFF));
		if (local562 > 255) {
			local562 = 255;
		}
		@Pc(579) int local579 = (int) (local541 * (float) (local552 >> 8 & 0xFF));
		if (local579 > 255) {
			local579 = 255;
		}
		@Pc(592) int local592 = (int) ((float) (local552 & 0xFF) * local541);
		if (this.aClass62_Sub3_13.aBoolean278) {
			this.aClass5_Sub3_Sub2_2.method4236((float) local15);
			this.aClass5_Sub3_Sub2_2.method4236((float) local29);
			this.aClass5_Sub3_Sub2_2.method4236((float) local23);
		} else {
			this.aClass5_Sub3_Sub2_2.method4235((float) local15);
			this.aClass5_Sub3_Sub2_2.method4235((float) local29);
			this.aClass5_Sub3_Sub2_2.method4235((float) local23);
		}
		if (local592 > 255) {
			local592 = 255;
		}
		this.aClass5_Sub3_Sub2_2.method4192(local562);
		this.aClass5_Sub3_Sub2_2.method4192(local579);
		this.aClass5_Sub3_Sub2_2.method4192(local592);
		this.aClass5_Sub3_Sub2_2.method4192(255);
		this.method3341(local78);
	}
}
