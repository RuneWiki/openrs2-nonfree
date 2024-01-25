import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class2_Sub44 extends Class2 {

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
	private int anInt6842;

	@OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
	private int anInt6845;

	@OriginalMember(owner = "client!wj", name = "s", descriptor = "Lclient!pj;")
	private final Class105_Sub2 aClass105_Sub2_3;

	@OriginalMember(owner = "client!wj", name = "A", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_42;

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "Lclient!dt;")
	private final Class2_Sub10 aClass2_Sub10_1;

	@OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
	private final int anInt6847;

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
	private final int anInt6843;

	@OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
	private final int anInt6844;

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
	private final int anInt6846;

	@OriginalMember(owner = "client!wj", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!wj", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!wj", name = "z", descriptor = "Lclient!tf;")
	private final Class190 aClass190_14;

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "Lclient!tf;")
	private final Class190 aClass190_13;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "Lclient!na;")
	private final Interface7 anInterface7_6;

	@OriginalMember(owner = "client!wj", name = "C", descriptor = "Lclient!io;")
	private final Interface5 anInterface5_5;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "Lclient!ef;")
	private Class2_Sub12 aClass2_Sub12_7;

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "Lclient!jj;")
	private Class2_Sub12_Sub1 aClass2_Sub12_Sub1_3;

	@OriginalMember(owner = "client!wj", name = "w", descriptor = "Lclient!cm;")
	private Class41 aClass41_34;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!cg;Lclient!pj;Lclient!dt;[I)V")
	public Class2_Sub44(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) Class105_Sub2 arg1, @OriginalArg(2) Class2_Sub10 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass105_Sub2_3 = arg1;
		this.aClass37_Sub1_42 = arg0;
		this.aClass2_Sub10_1 = arg2;
		@Pc(20) int local20 = this.aClass2_Sub10_1.anInt4042 - (arg1.anInt5265 >> 1);
		this.anInt6847 = this.aClass2_Sub10_1.anInt4039 - local20 >> arg1.anInt5267;
		this.anInt6843 = this.aClass2_Sub10_1.anInt4039 + local20 >> arg1.anInt5267;
		this.anInt6844 = this.aClass2_Sub10_1.anInt4043 - local20 >> arg1.anInt5267;
		this.anInt6846 = this.aClass2_Sub10_1.anInt4043 + local20 >> arg1.anInt5267;
		@Pc(69) int local69 = this.anInt6843 + 1 - this.anInt6847;
		@Pc(78) int local78 = this.anInt6846 + 1 - this.anInt6844;
		this.aFloatArrayArray8 = new float[local69 + 1][local78 + 1];
		this.aFloatArrayArray6 = new float[local69 + 1][local78 + 1];
		this.aFloatArrayArray7 = new float[local69 + 1][local78 + 1];
		@Pc(107) int local107;
		@Pc(119) int local119;
		@Pc(137) int local137;
		@Pc(149) int local149;
		@Pc(175) int local175;
		@Pc(190) int local190;
		for (local107 = 0; local107 <= local78; local107++) {
			local119 = this.anInt6844 + local107;
			if (local119 > 0 && local119 < this.aClass105_Sub2_3.anInt5261 - 1) {
				for (local137 = 0; local137 <= local69; local137++) {
					local149 = local137 + this.anInt6847;
					if (local149 > 0 && local149 < this.aClass105_Sub2_3.anInt5260 - 1) {
						local175 = arg1.method4453(local149 + 1, local119) - arg1.method4453(local149 - 1, local119);
						local190 = arg1.method4453(local149, local119 + 1) - arg1.method4453(local149, local119 - 1);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local190 * local190 + local175 * local175 + 65536)));
						this.aFloatArrayArray6[local137][local107] = (float) local175 * local205;
						this.aFloatArrayArray7[local137][local107] = -256.0F * local205;
						this.aFloatArrayArray8[local137][local107] = (float) local190 * local205;
					}
				}
			}
		}
		local107 = 0;
		local119 = 0;
		for (local137 = this.anInt6844; local137 <= this.anInt6846; local137++) {
			if (local137 >= 0 && local137 < arg1.anInt5261) {
				for (local149 = this.anInt6847; local149 <= this.anInt6843; local149++) {
					if (local149 >= 0 && arg1.anInt5260 > local149) {
						local175 = arg3[local119];
						@Pc(300) int[] local300 = arg1.anIntArrayArrayArray9[local149][local137];
						if (local300 != null && local175 != 0) {
							if (local175 == 1) {
								local107 += local300.length;
							} else {
								local107 += 3;
							}
						}
					}
					local119++;
				}
			} else {
				local119 += this.anInt6843 - this.anInt6847;
			}
		}
		if (local107 <= 0) {
			this.aClass190_14 = null;
			this.aClass190_13 = null;
			this.anInterface7_6 = null;
			this.anInterface5_5 = null;
		} else {
			this.aClass2_Sub12_7 = new Class2_Sub12(local107 * 2);
			this.aClass2_Sub12_Sub1_3 = new Class2_Sub12_Sub1(local107 * 16);
			this.aClass41_34 = new Class41(Static51.method1026(local107));
			local137 = 0;
			local119 = 0;
			for (local149 = this.anInt6844; local149 <= this.anInt6846; local149++) {
				if (local149 >= 0 && local149 < arg1.anInt5261) {
					local175 = 0;
					for (local190 = this.anInt6847; local190 <= this.anInt6843; local190++) {
						if (local190 >= 0 && arg1.anInt5260 > local190) {
							@Pc(410) int local410 = arg3[local119];
							@Pc(417) int[] local417 = arg1.anIntArrayArrayArray9[local190][local149];
							@Pc(424) int[] local424 = arg1.anIntArrayArrayArray8[local190][local149];
							if (local417 != null && local410 != 0) {
								if (local410 == 1) {
									for (@Pc(575) int local575 = 0; local575 < local417.length; local575++) {
										this.method5726(local175, local190, local149, local137, local417[local575], local424[local575]);
									}
								} else if (local410 == 3) {
									this.method5726(local175, local190, local149, local137, 0, 0);
									this.method5726(local175, local190, local149, local137, arg1.anInt5265, 0);
									this.method5726(local175, local190, local149, local137, 0, arg1.anInt5265);
								} else if (local410 == 2) {
									this.method5726(local175, local190, local149, local137, arg1.anInt5265, 0);
									this.method5726(local175, local190, local149, local137, arg1.anInt5265, arg1.anInt5265);
									this.method5726(local175, local190, local149, local137, 0, 0);
								} else if (local410 == 5) {
									this.method5726(local175, local190, local149, local137, arg1.anInt5265, arg1.anInt5265);
									this.method5726(local175, local190, local149, local137, 0, arg1.anInt5265);
									this.method5726(local175, local190, local149, local137, arg1.anInt5265, 0);
								} else if (local410 == 4) {
									this.method5726(local175, local190, local149, local137, 0, arg1.anInt5265);
									this.method5726(local175, local190, local149, local137, 0, 0);
									this.method5726(local175, local190, local149, local137, arg1.anInt5265, arg1.anInt5265);
								}
							}
						}
						local175++;
						local119++;
					}
				} else {
					local119 += this.anInt6843 - this.anInt6847;
				}
				local137++;
			}
			this.anInterface5_5 = this.aClass37_Sub1_42.method777(this.aClass2_Sub12_7.aByteArray30, this.aClass2_Sub12_7.anInt3606, false);
			this.anInterface7_6 = this.aClass37_Sub1_42.method746(16, this.aClass2_Sub12_Sub1_3.aByteArray30, this.aClass2_Sub12_Sub1_3.anInt3606, false);
			this.aClass190_14 = new Class190(this.aClass37_Sub1_42, this.anInterface7_6, 5126, 3, 0);
			this.aClass190_13 = new Class190(this.aClass37_Sub1_42, this.anInterface7_6, 5121, 4, 12);
		}
		this.aClass2_Sub12_Sub1_3 = null;
		this.aClass2_Sub12_7 = null;
		this.aClass41_34 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray7 = this.aFloatArrayArray8 = null;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(III[[ZZ)V")
	public void method5725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface5_5 == null || (arg2 + arg1 < this.anInt6847 || (arg1 - arg2 > this.anInt6843 || (arg0 + arg2 < this.anInt6844 || arg0 - arg2 > this.anInt6846)))) {
			return;
		}
		for (@Pc(46) int local46 = this.anInt6844; local46 <= this.anInt6846; local46++) {
			for (@Pc(57) int local57 = this.anInt6847; local57 <= this.anInt6843; local57++) {
				@Pc(70) int local70 = local57 - arg1;
				@Pc(75) int local75 = local46 - arg0;
				if (-arg2 < local70 && arg2 > local70 && local75 > -arg2 && arg2 > local75 && arg3[arg2 + local70][local75 + arg2]) {
					this.aClass37_Sub1_42.method738((int) (this.aClass2_Sub10_1.aFloat42 * 255.0F) << 24);
					this.aClass37_Sub1_42.method737(this.aClass190_14, null, this.aClass190_13, null);
					this.aClass37_Sub1_42.method765(this.anInterface5_5, 0, this.anInt6842);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)V")
	private void method5726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(10) int local10 = arg4 + (arg1 << this.aClass105_Sub2_3.anInt5267);
		@Pc(18) int local18 = arg5 + (arg2 << this.aClass105_Sub2_3.anInt5267);
		@Pc(24) int local24 = this.aClass105_Sub2_3.method4452(local10, local18);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = (long) local10 & 0xFFFFL | ((long) local18 & 0xFFFFL) << 16;
			@Pc(55) Class2 local55 = this.aClass41_34.method902(local1);
			if (local55 != null) {
				this.method5727(((Class2_Sub16) local55).aShort30);
				return;
			}
		}
		@Pc(73) short local73 = (short) this.anInt6845++;
		if (local1 != -1L) {
			this.aClass41_34.method901(new Class2_Sub16(local73), local1);
		}
		@Pc(120) float local120;
		@Pc(113) float local113;
		@Pc(106) float local106;
		@Pc(193) float local193;
		@Pc(201) float local201;
		@Pc(208) float local208;
		@Pc(215) float local215;
		@Pc(222) float local222;
		@Pc(231) float local231;
		@Pc(240) float local240;
		@Pc(281) float local281;
		if (arg4 == 0 && arg5 == 0) {
			local106 = this.aFloatArrayArray8[arg0][arg3];
			local113 = this.aFloatArrayArray7[arg0][arg3];
			local120 = this.aFloatArrayArray6[arg0][arg3];
		} else if (arg4 == this.aClass105_Sub2_3.anInt5265 && arg5 == 0) {
			local120 = this.aFloatArrayArray6[arg0 + 1][arg3];
			local113 = this.aFloatArrayArray7[arg0 + 1][arg3];
			local106 = this.aFloatArrayArray8[arg0 + 1][arg3];
		} else if (this.aClass105_Sub2_3.anInt5265 == arg4 && arg5 == this.aClass105_Sub2_3.anInt5265) {
			local113 = this.aFloatArrayArray7[arg0 + 1][arg3 + 1];
			local106 = this.aFloatArrayArray8[arg0 + 1][arg3 + 1];
			local120 = this.aFloatArrayArray6[arg0 + 1][arg3 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass105_Sub2_3.anInt5265) {
			local120 = this.aFloatArrayArray6[arg0][arg3 + 1];
			local113 = this.aFloatArrayArray7[arg0][arg3 + 1];
			local106 = this.aFloatArrayArray8[arg0][arg3 + 1];
		} else {
			local193 = (float) arg4 / (float) this.aClass105_Sub2_3.anInt5265;
			local201 = (float) arg5 / (float) this.aClass105_Sub2_3.anInt5265;
			local208 = this.aFloatArrayArray6[arg0][arg3];
			local215 = this.aFloatArrayArray7[arg0][arg3];
			local222 = this.aFloatArrayArray8[arg0][arg3];
			local231 = this.aFloatArrayArray6[arg0 + 1][arg3];
			local240 = this.aFloatArrayArray7[arg0 + 1][arg3];
			@Pc(255) float local255 = local208 + local193 * (this.aFloatArrayArray6[arg0][arg3 + 1] - local208);
			@Pc(272) float local272 = local240 + local193 * (this.aFloatArrayArray7[arg0 + 1][arg3 + 1] - local240);
			local281 = this.aFloatArrayArray8[arg0 + 1][arg3];
			@Pc(297) float local297 = local222 + (this.aFloatArrayArray8[arg0][arg3 + 1] - local222) * local193;
			@Pc(312) float local312 = local215 + (this.aFloatArrayArray7[arg0][arg3 + 1] - local215) * local193;
			@Pc(330) float local330 = local231 + (this.aFloatArrayArray6[arg0 + 1][arg3 + 1] - local231) * local193;
			local120 = local255 + local201 * (local330 - local255);
			@Pc(356) float local356 = local281 + (this.aFloatArrayArray8[arg0 + 1][arg3 + 1] - local281) * local193;
			local113 = local312 + local201 * (local272 - local312);
			local106 = local201 * (local356 - local297) + local297;
		}
		local193 = this.aClass2_Sub10_1.anInt4039 - local10;
		local201 = this.aClass2_Sub10_1.anInt4045 - local24;
		local208 = this.aClass2_Sub10_1.anInt4043 - local18;
		local215 = (float) Math.sqrt((double) (local208 * local208 + local193 * local193 + local201 * local201));
		local222 = (float) 1 / local215;
		local201 *= local222;
		local193 *= local222;
		local208 *= local222;
		local231 = local215 / (float) this.aClass2_Sub10_1.anInt4042;
		local240 = 1.0F - local231 * local231;
		if (local240 < 0.0F) {
			local240 = 0.0F;
		}
		local281 = local201 * local113 + local120 * local193 + local106 * local208;
		if (local281 < 0.0F) {
			local281 = 0.0F;
		}
		@Pc(536) float local536 = local281 * local240 * 2.0F;
		if (local536 > 1.0F) {
			local536 = 1.0F;
		}
		@Pc(547) int local547 = this.aClass2_Sub10_1.anInt4041;
		@Pc(557) int local557 = (int) (local536 * (float) (local547 >> 16 & 0xFF));
		if (local557 > 255) {
			local557 = 255;
		}
		@Pc(572) int local572 = (int) ((float) (local547 >> 8 & 0xFF) * local536);
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(587) int local587 = (int) (local536 * (float) (local547 & 0xFF));
		if (this.aClass37_Sub1_42.aBoolean72) {
			this.aClass2_Sub12_Sub1_3.method3094((float) local10);
			this.aClass2_Sub12_Sub1_3.method3094((float) local24);
			this.aClass2_Sub12_Sub1_3.method3094((float) local18);
		} else {
			this.aClass2_Sub12_Sub1_3.method3093((float) local10);
			this.aClass2_Sub12_Sub1_3.method3093((float) local24);
			this.aClass2_Sub12_Sub1_3.method3093((float) local18);
		}
		if (local587 > 255) {
			local587 = 255;
		}
		this.aClass2_Sub12_Sub1_3.method3147(local557);
		this.aClass2_Sub12_Sub1_3.method3147(local572);
		this.aClass2_Sub12_Sub1_3.method3147(local587);
		this.aClass2_Sub12_Sub1_3.method3147(255);
		this.method5727(local73);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(SI)V")
	private void method5727(@OriginalArg(0) short arg0) {
		if (this.aClass37_Sub1_42.aBoolean72) {
			this.aClass2_Sub12_7.method3158(arg0);
		} else {
			this.aClass2_Sub12_7.method3110(arg0);
		}
		this.anInt6842++;
	}
}
