import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
	private int anInt5117 = 0;

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "Z")
	private boolean aBoolean373 = false;

	@OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
	private int anInt5118 = 0;

	@OriginalMember(owner = "client!kga", name = "s", descriptor = "I")
	private int anInt5124 = 0;

	@OriginalMember(owner = "client!kga", name = "C", descriptor = "I")
	private int anInt5131 = 0;

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
	private final int anInt5113;

	@OriginalMember(owner = "client!kga", name = "x", descriptor = "I")
	private final int anInt5128;

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "Lclient!ai;")
	private final Class13_Sub1 aClass13_Sub1_12;

	@OriginalMember(owner = "client!kga", name = "B", descriptor = "Lclient!ec;")
	private final Interface7 anInterface7_2;

	@OriginalMember(owner = "client!kga", name = "o", descriptor = "Z")
	private final boolean aBoolean375;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "Z")
	private final boolean aBoolean372;

	@OriginalMember(owner = "client!kga", name = "k", descriptor = "Z")
	private final boolean aBoolean374;

	@OriginalMember(owner = "client!kga", name = "y", descriptor = "Z")
	private final boolean aBoolean376;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!ai;IIZ)V")
	public Class33_Sub2(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt5113 = arg1;
		this.anInt5128 = arg2;
		this.aClass13_Sub1_12 = arg0;
		this.anInterface7_2 = arg0.method7535(arg2, arg1, Static246.aClass152_10, arg3 ? Static419.aClass327_2 : Static357.aClass327_14);
		this.anInterface7_2.method5805(true, true);
		this.aBoolean375 = this.anInterface7_2.method5806() != arg1;
		this.aBoolean372 = arg2 != this.anInterface7_2.method5803();
		this.aBoolean374 = !this.aBoolean375 && this.anInterface7_2.method5802();
		this.aBoolean376 = !this.aBoolean372 && this.anInterface7_2.method5802();
	}

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!ai;II[III)V")
	public Class33_Sub2(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5113 = arg1;
		this.anInt5128 = arg2;
		this.aClass13_Sub1_12 = arg0;
		this.anInterface7_2 = arg0.method7499(arg5, arg3, arg1, arg4, false, arg2);
		this.anInterface7_2.method5805(true, true);
		this.aBoolean375 = this.anInterface7_2.method5806() != arg1;
		this.aBoolean372 = this.anInterface7_2.method5803() != arg2;
		this.aBoolean374 = !this.aBoolean375 && this.anInterface7_2.method5802();
		this.aBoolean376 = !this.aBoolean372 && this.anInterface7_2.method5802();
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "()I")
	@Override
	public int method7659() {
		return this.anInt5113;
	}

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "()I")
	@Override
	public int method7662() {
		return this.anInt5128;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIII[III)V")
	private void method4711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface7_2.method5801(arg1, arg2, arg4, arg5, arg3, arg0);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "()I")
	@Override
	public int method7658() {
		return this.anInt5117 + this.anInt5131 + this.anInt5128;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "([I)V")
	@Override
	public void method7657(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt5117;
		arg0[1] = this.anInt5131;
		arg0[0] = this.anInt5118;
		arg0[2] = this.anInt5124;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)V")
	@Override
	public void method7643(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass13_Sub1_12.na(0, 0, this.anInt5113, this.anInt5128);
		@Pc(22) int[] local22 = new int[this.anInt5128 * this.anInt5113];
		this.anInterface7_2.method5809(this.anInt5128, this.anInt5113, local22);
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			for (local41 = 0; local41 < this.anInt5128; local41++) {
				local48 = local41 * this.anInt5113;
				for (local50 = 0; local50 < this.anInt5113; local50++) {
					local22[local50 + local48] = local22[local48 + local50] & 0xFFFFFF | local15[local48 + local50] << 8 & 0xFF0000A3;
				}
			}
		} else if (arg0 == 3) {
			for (local41 = 0; local41 < this.anInt5128; local41++) {
				local48 = local41 * this.anInt5113;
				for (local50 = 0; local50 < this.anInt5113; local50++) {
					local22[local50 + local48] = (local15[local48 + local50] == 0 ? 0 : -16777216) | local22[local48 + local50] & 0xFFFFFF;
				}
			}
		}
		this.method4711(0, 0, this.anInt5113, this.anInt5128, local22, this.anInt5113);
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(IIII)V")
	@Override
	public void method7664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5124 = arg2;
		this.anInt5117 = arg3;
		this.anInt5118 = arg0;
		this.anInt5131 = arg1;
		this.aBoolean373 = this.anInt5118 != 0 || this.anInt5131 != 0 || this.anInt5124 != 0 || this.anInt5117 != 0;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass13_Sub1_12.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method4711(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7648(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class239_Sub3 local8 = this.aClass13_Sub1_12.method7480();
		@Pc(13) Class239_Sub3 local13 = this.aClass13_Sub1_12.method7512();
		this.anInterface7_2.method8137(this.aBoolean375 || this.aBoolean372 ? Static672.aClass385_43 : Static198.aClass385_42);
		this.aClass13_Sub1_12.method7476();
		this.aClass13_Sub1_12.method7530(this.anInterface7_2);
		this.aClass13_Sub1_12.method7440(1);
		this.aClass13_Sub1_12.method7509(arg6);
		this.aClass13_Sub1_12.method7522(Static125.aClass326_1, 1);
		this.aClass13_Sub1_12.method7517(1, Static125.aClass326_1);
		this.aClass13_Sub1_12.method7539(arg7);
		if (this.aBoolean373) {
			@Pc(77) float local77 = (float) this.method7645();
			@Pc(81) float local81 = (float) this.method7658();
			@Pc(87) float local87 = (arg2 - arg0) / local77;
			@Pc(93) float local93 = (arg3 - arg1) / local77;
			@Pc(99) float local99 = (arg4 - arg0) / local81;
			@Pc(106) float local106 = (arg5 - arg1) / local81;
			@Pc(112) float local112 = (float) this.anInt5131 * local99;
			@Pc(118) float local118 = local106 * (float) this.anInt5131;
			@Pc(124) float local124 = (float) this.anInt5118 * local87;
			@Pc(130) float local130 = (float) this.anInt5118 * local93;
			@Pc(137) float local137 = (float) this.anInt5124 * -local87;
			@Pc(144) float local144 = (float) this.anInt5124 * -local93;
			@Pc(151) float local151 = (float) this.anInt5117 * -local99;
			@Pc(158) float local158 = -local106 * (float) this.anInt5117;
			arg3 = local118 + arg3 + local144;
			arg0 = local112 + local124 + arg0;
			arg2 = arg2 + local137 + local112;
			arg1 = local130 + arg1 + local118;
			arg4 = local151 + local124 + arg4;
			arg5 = local130 + arg5 + local158;
		}
		local8.method9267(0.0F, arg4 - arg0, -arg1 + arg3, 0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0, 1.0F);
		local8.method9271(0.0F, arg1, arg0);
		local13.method9260(this.anInterface7_2.method5804((float) this.anInt5113), 1.0F, this.anInterface7_2.method5808((float) this.anInt5128));
		this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
		this.aClass13_Sub1_12.method7515();
		this.aClass13_Sub1_12.method7481();
		this.aClass13_Sub1_12.method7510();
		this.aClass13_Sub1_12.method7522(Static348.aClass326_4, 1);
		this.aClass13_Sub1_12.method7517(1, Static348.aClass326_4);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(9) Interface7 local9 = local6.anInterface7_3;
		@Pc(14) int local14 = arg1 + this.anInt5131;
		@Pc(19) int local19 = arg0 + this.anInt5118;
		this.anInterface7_2.method8137(Static672.aClass385_43);
		this.aClass13_Sub1_12.method7476();
		this.aClass13_Sub1_12.method7530(this.anInterface7_2);
		this.aClass13_Sub1_12.method7440(1);
		this.aClass13_Sub1_12.method7509(1);
		@Pc(49) Class239_Sub3 local49 = this.aClass13_Sub1_12.method7480();
		local49.method9260((float) this.anInt5113, 0.0F, (float) this.anInt5128);
		local49.method9244(local19, local14, 0);
		this.aClass13_Sub1_12.method7515();
		@Pc(73) Class239_Sub3 local73 = this.aClass13_Sub1_12.method7512();
		local73.method9260(this.anInterface7_2.method5804((float) this.anInt5113), 1.0F, this.anInterface7_2.method5808((float) this.anInt5128));
		this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
		this.aClass13_Sub1_12.method7461(1);
		this.aClass13_Sub1_12.method7530(local9);
		this.aClass13_Sub1_12.method7521(Static580.aClass203_4, Static265.aClass203_3);
		this.aClass13_Sub1_12.method7522(Static348.aClass326_4, 0);
		@Pc(123) Class239_Sub3 local123 = this.aClass13_Sub1_12.method7512();
		local123.method9260(local9.method5804((float) this.anInt5113), 1.0F, local9.method5808((float) this.anInt5128));
		local123.method9271(0.0F, local9.method5808((float) (local14 - arg4)), local9.method5804((float) (local19 - arg3)));
		this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
		this.aClass13_Sub1_12.method7481();
		this.aClass13_Sub1_12.method7510();
		this.aClass13_Sub1_12.method7522(Static523.aClass326_5, 0);
		this.aClass13_Sub1_12.method7521(Static580.aClass203_4, Static580.aClass203_4);
		this.aClass13_Sub1_12.method7530((Interface3) null);
		this.aClass13_Sub1_12.method7461(0);
		this.aClass13_Sub1_12.method7510();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class239_Sub3 local10 = this.aClass13_Sub1_12.method7480();
		@Pc(15) Class239_Sub3 local15 = this.aClass13_Sub1_12.method7512();
		this.anInterface7_2.method8137(Static672.aClass385_43);
		this.aClass13_Sub1_12.method7476();
		this.aClass13_Sub1_12.method7530(this.anInterface7_2);
		this.aClass13_Sub1_12.method7440(arg6);
		this.aClass13_Sub1_12.method7509(arg4);
		this.aClass13_Sub1_12.method7522(Static125.aClass326_1, 1);
		this.aClass13_Sub1_12.method7517(1, Static125.aClass326_1);
		this.aClass13_Sub1_12.method7539(arg5);
		@Pc(76) boolean local76 = this.aBoolean376 && this.anInt5131 == 0 && this.anInt5117 == 0;
		@Pc(89) boolean local89 = this.aBoolean374 && this.anInt5118 == 0 && this.anInt5124 == 0;
		if (local89 & local76) {
			local15.method9260(this.anInterface7_2.method5804((float) arg2), 1.0F, this.anInterface7_2.method5808((float) arg3));
			local10.method9260((float) arg2, 0.0F, (float) arg3);
			local10.method9244(arg0, arg1, 0);
			this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
			this.aClass13_Sub1_12.method7515();
			this.aClass13_Sub1_12.method7481();
		} else {
			@Pc(101) int local101;
			@Pc(104) int local104;
			@Pc(132) int local132;
			@Pc(137) int local137;
			@Pc(180) int local180;
			if (local89) {
				local101 = arg1 + arg3;
				local104 = this.method7658();
				local15.method9260(this.anInterface7_2.method5804((float) arg2), 1.0F, this.anInterface7_2.method5808((float) this.anInt5128));
				this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
				local132 = arg1 + this.anInt5131;
				for (local137 = local132 + this.anInt5128; local137 <= local101; local137 += local104) {
					local10.method9260((float) arg2, 0.0F, (float) this.anInt5128);
					local10.method9244(arg0, local132, 0);
					this.aClass13_Sub1_12.method7515();
					local132 += local104;
					this.aClass13_Sub1_12.method7481();
				}
				if (local132 < local101) {
					local180 = local101 - local132;
					local15.method9260(this.anInterface7_2.method5804((float) arg2), 1.0F, this.anInterface7_2.method5808((float) local180));
					this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
					local10.method9260((float) arg2, 0.0F, (float) local180);
					local10.method9244(arg0, local132, 0);
					this.aClass13_Sub1_12.method7515();
					this.aClass13_Sub1_12.method7481();
				}
			} else if (local76) {
				local101 = arg2 + arg0;
				local104 = this.method7645();
				local15.method9260(this.anInterface7_2.method5804((float) this.anInt5113), 1.0F, this.anInterface7_2.method5808((float) arg3));
				this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
				local132 = arg0 + this.anInt5118;
				local137 = this.anInt5113 + local132;
				while (local101 >= local137) {
					local10.method9260((float) this.anInt5113, 0.0F, (float) arg3);
					local10.method9244(local132, arg1, 0);
					this.aClass13_Sub1_12.method7515();
					local137 += local104;
					local132 += local104;
					this.aClass13_Sub1_12.method7481();
				}
				if (local132 < local101) {
					local180 = local101 - local132;
					local15.method9260(this.anInterface7_2.method5804((float) local180), 1.0F, this.anInterface7_2.method5808((float) arg3));
					this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
					local10.method9260((float) local180, 0.0F, (float) arg3);
					local10.method9244(local132, arg1, 0);
					this.aClass13_Sub1_12.method7515();
					this.aClass13_Sub1_12.method7481();
				}
			} else {
				local101 = arg1 + arg3;
				local104 = arg0 + arg2;
				local132 = this.method7645();
				local137 = this.method7658();
				local180 = this.anInt5131 + arg1;
				@Pc(279) int local279;
				@Pc(284) int local284;
				@Pc(332) int local332;
				for (@Pc(249) int local249 = this.anInt5128 + local180; local249 <= local101; local249 += local137) {
					local15.method9260(this.anInterface7_2.method5804((float) this.anInt5113), 1.0F, this.anInterface7_2.method5808((float) this.anInt5128));
					this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
					local279 = this.anInt5118 + arg0;
					local284 = this.anInt5113 + local279;
					while (local104 >= local284) {
						local10.method9260((float) this.anInt5113, 0.0F, (float) this.anInt5128);
						local10.method9244(local279, local180, 0);
						this.aClass13_Sub1_12.method7515();
						local284 += local132;
						this.aClass13_Sub1_12.method7481();
						local279 += local132;
					}
					if (local104 > local279) {
						local332 = local104 - local279;
						local15.method9260(this.anInterface7_2.method5804((float) local332), 1.0F, this.anInterface7_2.method5808((float) this.anInt5128));
						this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
						local10.method9260((float) local332, 0.0F, (float) this.anInt5128);
						local10.method9244(local279, local180, 0);
						this.aClass13_Sub1_12.method7515();
						this.aClass13_Sub1_12.method7481();
					}
					local180 += local137;
				}
				if (local180 < local101) {
					local279 = local101 - local180;
					local15.method9260(this.anInterface7_2.method5804((float) this.anInt5113), 1.0F, this.anInterface7_2.method5808((float) local279));
					this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
					local284 = this.anInt5118 + arg0;
					local332 = local284 + this.anInt5113;
					while (local332 <= local104) {
						local10.method9260((float) this.anInt5113, 0.0F, (float) local279);
						local10.method9244(local284, local180, 0);
						this.aClass13_Sub1_12.method7515();
						local332 += local132;
						local284 += local132;
						this.aClass13_Sub1_12.method7481();
					}
					if (local284 < local104) {
						@Pc(483) int local483 = local104 - local284;
						local15.method9260(this.anInterface7_2.method5804((float) local483), 1.0F, this.anInterface7_2.method5808((float) local279));
						this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
						local10.method9260((float) local483, 0.0F, (float) local279);
						local10.method9244(local284, local180, 0);
						this.aClass13_Sub1_12.method7515();
						this.aClass13_Sub1_12.method7481();
					}
				}
			}
		}
		this.aClass13_Sub1_12.method7510();
		this.aClass13_Sub1_12.method7522(Static348.aClass326_4, 1);
		this.aClass13_Sub1_12.method7517(1, Static348.aClass326_4);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "()I")
	@Override
	public int method7645() {
		return this.anInt5113 + this.anInt5118 + this.anInt5124;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7650(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class239_Sub3 local8 = this.aClass13_Sub1_12.method7480();
		@Pc(13) Class239_Sub3 local13 = this.aClass13_Sub1_12.method7512();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface7 local19 = local16.anInterface7_3;
		this.anInterface7_2.method8137(this.aBoolean375 || this.aBoolean372 ? Static672.aClass385_43 : Static198.aClass385_42);
		this.aClass13_Sub1_12.method7476();
		this.aClass13_Sub1_12.method7530(this.anInterface7_2);
		this.aClass13_Sub1_12.method7440(1);
		this.aClass13_Sub1_12.method7509(1);
		if (this.aBoolean373) {
			@Pc(97) float local97 = (float) this.anInt5113 / (float) this.method7645();
			@Pc(105) float local105 = (float) this.anInt5128 / (float) this.method7658();
			local8.method9267(0.0F, local105 * (arg4 - arg0), (arg3 - arg1) * local97, 0.0F, local105 * (arg5 - arg1), 0.0F, 0.0F, (arg2 - arg0) * local97, 1.0F);
			local8.method9271(0.0F, local105 * (arg1 + (float) this.anInt5131), (arg0 + (float) this.anInt5118) * local97);
		} else {
			local8.method9267(0.0F, arg4 - arg0, arg3 - arg1, 0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0, 1.0F);
			local8.method9271(0.0F, arg1, arg0);
		}
		local13.method9260(this.anInterface7_2.method5804((float) this.anInt5113), 1.0F, this.anInterface7_2.method5808((float) this.anInt5128));
		this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
		this.aClass13_Sub1_12.method7461(1);
		this.aClass13_Sub1_12.method7530(local19);
		this.aClass13_Sub1_12.method7521(Static580.aClass203_4, Static265.aClass203_3);
		this.aClass13_Sub1_12.method7522(Static348.aClass326_4, 0);
		@Pc(202) Class239_Sub3 local202 = this.aClass13_Sub1_12.method7512();
		local202.method9247(local8);
		local202.method9244(-arg7, -arg8, 0);
		local202.method9256(1.0F, local19.method5808(1.0F), local19.method5804(1.0F));
		this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
		this.aClass13_Sub1_12.method7515();
		this.aClass13_Sub1_12.method7481();
		this.aClass13_Sub1_12.method7510();
		this.aClass13_Sub1_12.method7522(Static523.aClass326_5, 0);
		this.aClass13_Sub1_12.method7521(Static580.aClass203_4, Static580.aClass203_4);
		this.aClass13_Sub1_12.method7530((Interface3) null);
		this.aClass13_Sub1_12.method7461(0);
		this.aClass13_Sub1_12.method7510();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class239_Sub3 local8 = this.aClass13_Sub1_12.method7480();
		@Pc(13) Class239_Sub3 local13 = this.aClass13_Sub1_12.method7512();
		@Pc(18) int local18 = arg1 + this.anInt5131;
		@Pc(23) int local23 = arg0 + this.anInt5118;
		this.anInterface7_2.method8137(Static672.aClass385_43);
		this.aClass13_Sub1_12.method7476();
		this.aClass13_Sub1_12.method7530(this.anInterface7_2);
		this.aClass13_Sub1_12.method7440(arg4);
		this.aClass13_Sub1_12.method7509(arg2);
		this.aClass13_Sub1_12.method7522(Static125.aClass326_1, 1);
		this.aClass13_Sub1_12.method7517(1, Static125.aClass326_1);
		this.aClass13_Sub1_12.method7539(arg3);
		local8.method9260((float) this.anInt5113, 0.0F, (float) this.anInt5128);
		local8.method9244(local23, local18, 0);
		local13.method9260(this.anInterface7_2.method5804((float) this.anInt5113), 1.0F, this.anInterface7_2.method5808((float) this.anInt5128));
		this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
		this.aClass13_Sub1_12.method7515();
		this.aClass13_Sub1_12.method7481();
		this.aClass13_Sub1_12.method7510();
		this.aClass13_Sub1_12.method7522(Static348.aClass326_4, 1);
		this.aClass13_Sub1_12.method7517(1, Static348.aClass326_4);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class239_Sub3 local8 = this.aClass13_Sub1_12.method7480();
		@Pc(13) Class239_Sub3 local13 = this.aClass13_Sub1_12.method7512();
		this.anInterface7_2.method8137(this.aBoolean375 || this.aBoolean372 ? Static672.aClass385_43 : Static198.aClass385_42);
		this.aClass13_Sub1_12.method7476();
		this.aClass13_Sub1_12.method7530(this.anInterface7_2);
		this.aClass13_Sub1_12.method7440(arg6);
		this.aClass13_Sub1_12.method7509(arg4);
		this.aClass13_Sub1_12.method7522(Static125.aClass326_1, 1);
		this.aClass13_Sub1_12.method7517(1, Static125.aClass326_1);
		this.aClass13_Sub1_12.method7539(arg5);
		local13.method9260(this.anInterface7_2.method5804((float) this.anInt5113), 1.0F, this.anInterface7_2.method5808((float) this.anInt5128));
		if (this.aBoolean373) {
			arg2 = arg2 * this.anInt5113 / this.method7645();
			arg3 = arg3 * this.anInt5128 / this.method7658();
			arg0 += arg2 * this.anInt5118 / this.anInt5113;
			arg1 += arg3 * this.anInt5131 / this.anInt5128;
		}
		local8.method9260((float) arg2, 0.0F, (float) arg3);
		local8.method9244(arg0, arg1, 0);
		this.aClass13_Sub1_12.method7464(Static178.aClass94_4);
		this.aClass13_Sub1_12.method7515();
		this.aClass13_Sub1_12.method7481();
		this.aClass13_Sub1_12.method7510();
		this.aClass13_Sub1_12.method7522(Static348.aClass326_4, 1);
		this.aClass13_Sub1_12.method7517(1, Static348.aClass326_4);
	}
}
