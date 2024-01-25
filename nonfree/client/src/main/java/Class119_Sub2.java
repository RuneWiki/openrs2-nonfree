import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class119_Sub2 extends Class119 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	private int anInt7984 = 0;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Z")
	private boolean aBoolean569 = false;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
	private int anInt7998 = 0;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
	private int anInt7999 = 0;

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
	private int anInt8002 = 0;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
	private final int anInt8000;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
	private final int anInt7995;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Lclient!tu;")
	private final Class5_Sub3 aClass5_Sub3_18;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!ica;")
	private final Interface9 anInterface9_4;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Z")
	private final boolean aBoolean568;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Z")
	private final boolean aBoolean571;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Z")
	private final boolean aBoolean567;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Z")
	private final boolean aBoolean570;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!tu;IIZ)V")
	public Class119_Sub2(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt8000 = arg2;
		this.anInt7995 = arg1;
		this.aClass5_Sub3_18 = arg0;
		this.anInterface9_4 = arg0.method6400(arg3 ? Static468.aClass167_14 : Static178.aClass167_6, Static524.aClass310_16, arg1, arg2);
		this.aBoolean568 = arg1 != this.anInterface9_4.method3273();
		this.aBoolean571 = arg2 != this.anInterface9_4.method3272();
		this.aBoolean567 = !this.aBoolean568 && this.anInterface9_4.method3276();
		this.aBoolean570 = !this.aBoolean571 && this.anInterface9_4.method3276();
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!tu;II[III)V")
	public Class119_Sub2(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7995 = arg1;
		this.aClass5_Sub3_18 = arg0;
		this.anInt8000 = arg2;
		this.anInterface9_4 = arg0.method6321(false, arg4, arg2, arg5, arg3, arg1);
		this.aBoolean568 = this.anInterface9_4.method3273() != arg1;
		this.aBoolean571 = arg2 != this.anInterface9_4.method3272();
		this.aBoolean567 = !this.aBoolean568 && this.anInterface9_4.method3276();
		this.aBoolean570 = !this.aBoolean571 && this.anInterface9_4.method3276();
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt8000;
	}

	@OriginalMember(owner = "client!sb", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7998 = arg1;
		this.anInt7999 = arg2;
		this.anInt8002 = arg0;
		this.anInt7984 = arg3;
		this.aBoolean569 = this.anInt8002 != 0 || this.anInt7998 != 0 || this.anInt7999 != 0 || this.anInt7984 != 0;
	}

	@OriginalMember(owner = "client!sb", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class205_Sub1 local8 = this.aClass5_Sub3_18.method6297();
		@Pc(13) Class205_Sub1 local13 = this.aClass5_Sub3_18.method6348();
		this.anInterface9_4.method6468(this.aBoolean568 || this.aBoolean571 ? Static302.aClass172_9 : Static50.aClass172_2);
		this.aClass5_Sub3_18.method6401();
		this.aClass5_Sub3_18.method6416(this.anInterface9_4);
		this.aClass5_Sub3_18.method6398(arg8);
		this.aClass5_Sub3_18.method6309(arg6);
		this.aClass5_Sub3_18.method6415(Static144.aClass166_2, 1);
		this.aClass5_Sub3_18.method6314(Static144.aClass166_2, 1);
		this.aClass5_Sub3_18.method6363(arg7);
		if (this.aBoolean569) {
			@Pc(70) float local70 = (float) this.AA();
			@Pc(74) float local74 = (float) this.a();
			@Pc(81) float local81 = (arg2 - arg0) / local70;
			@Pc(88) float local88 = (arg3 - arg1) / local70;
			@Pc(94) float local94 = (arg4 - arg0) / local74;
			@Pc(100) float local100 = (arg5 - arg1) / local74;
			@Pc(106) float local106 = local94 * (float) this.anInt7998;
			@Pc(112) float local112 = local100 * (float) this.anInt7998;
			@Pc(118) float local118 = (float) this.anInt8002 * local81;
			@Pc(124) float local124 = (float) this.anInt8002 * local88;
			@Pc(131) float local131 = -local81 * (float) this.anInt7999;
			@Pc(138) float local138 = (float) this.anInt7999 * -local88;
			@Pc(145) float local145 = -local94 * (float) this.anInt7984;
			arg1 = local112 + arg1 + local124;
			arg0 = local106 + local118 + arg0;
			arg3 = local112 + local138 + arg3;
			arg2 = local106 + arg2 + local131;
			@Pc(176) float local176 = (float) this.anInt7984 * -local100;
			arg4 = arg4 + local118 + local145;
			arg5 = arg5 + local124 + local176;
		}
		local8.method5228(0.0F, 1.0F, 0.0F, 0.0F, arg4 - arg0, 0.0F, arg3 - arg1, -arg1 + arg5, arg2 - arg0);
		local8.method5227(arg0, arg1, 0.0F);
		local13.method5240(1.0F, this.anInterface9_4.method3275((float) this.anInt7995), this.anInterface9_4.method3277((float) this.anInt8000));
		this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
		this.aClass5_Sub3_18.method6392();
		this.aClass5_Sub3_18.method6342();
		this.aClass5_Sub3_18.method6376();
		this.aClass5_Sub3_18.method6415(Static28.aClass166_1, 1);
		this.aClass5_Sub3_18.method6314(Static28.aClass166_1, 1);
	}

	@OriginalMember(owner = "client!sb", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt8002 + this.anInt7995 + this.anInt7999;
	}

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class205_Sub1 local8 = this.aClass5_Sub3_18.method6297();
		@Pc(13) Class205_Sub1 local13 = this.aClass5_Sub3_18.method6348();
		@Pc(18) int local18 = arg0 + this.anInt8002;
		@Pc(23) int local23 = arg1 + this.anInt7998;
		this.anInterface9_4.method6468(Static302.aClass172_9);
		this.aClass5_Sub3_18.method6401();
		this.aClass5_Sub3_18.method6416(this.anInterface9_4);
		this.aClass5_Sub3_18.method6398(arg4);
		this.aClass5_Sub3_18.method6309(arg2);
		this.aClass5_Sub3_18.method6415(Static144.aClass166_2, 1);
		this.aClass5_Sub3_18.method6314(Static144.aClass166_2, 1);
		this.aClass5_Sub3_18.method6363(arg3);
		local8.method5240(0.0F, (float) this.anInt7995, (float) this.anInt8000);
		local8.G(local18, local23, 0);
		local13.method5240(1.0F, this.anInterface9_4.method3275((float) this.anInt7995), this.anInterface9_4.method3277((float) this.anInt8000));
		this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
		this.aClass5_Sub3_18.method6392();
		this.aClass5_Sub3_18.method6342();
		this.aClass5_Sub3_18.method6376();
		this.aClass5_Sub3_18.method6415(Static28.aClass166_1, 1);
		this.aClass5_Sub3_18.method6314(Static28.aClass166_1, 1);
	}

	@OriginalMember(owner = "client!sb", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass5_Sub3_18.KA(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method6621(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!sb", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.anInt7995;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt8000 + this.anInt7998 + this.anInt7984;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method6677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class10_Sub2 local6 = (Class10_Sub2) arg2;
		@Pc(9) Interface9 local9 = local6.anInterface9_3;
		@Pc(14) int local14 = arg1 + this.anInt7998;
		@Pc(19) int local19 = arg0 + this.anInt8002;
		this.anInterface9_4.method6468(Static302.aClass172_9);
		this.aClass5_Sub3_18.method6401();
		this.aClass5_Sub3_18.method6416(this.anInterface9_4);
		this.aClass5_Sub3_18.method6398(1);
		this.aClass5_Sub3_18.method6309(1);
		@Pc(49) Class205_Sub1 local49 = this.aClass5_Sub3_18.method6297();
		local49.method5240(0.0F, (float) this.anInt7995, (float) this.anInt8000);
		local49.G(local19, local14, 0);
		this.aClass5_Sub3_18.method6392();
		@Pc(73) Class205_Sub1 local73 = this.aClass5_Sub3_18.method6348();
		local73.method5240(1.0F, this.anInterface9_4.method3275((float) this.anInt7995), this.anInterface9_4.method3277((float) this.anInt8000));
		this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
		this.aClass5_Sub3_18.method6388(1);
		this.aClass5_Sub3_18.method6416(local9);
		this.aClass5_Sub3_18.method6320(Static130.aClass289_1, Static526.aClass289_5);
		this.aClass5_Sub3_18.method6415(Static28.aClass166_1, 0);
		@Pc(123) Class205_Sub1 local123 = this.aClass5_Sub3_18.method6348();
		local123.method5240(1.0F, local9.method3275((float) this.anInt7995), local9.method3277((float) this.anInt8000));
		local123.method5227(local9.method3275((float) (local19 - arg3)), local9.method3277((float) (local14 - arg4)), 0.0F);
		this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
		this.aClass5_Sub3_18.method6342();
		this.aClass5_Sub3_18.method6376();
		this.aClass5_Sub3_18.method6415(Static213.aClass166_3, 0);
		this.aClass5_Sub3_18.method6320(Static130.aClass289_1, Static130.aClass289_1);
		this.aClass5_Sub3_18.method6416(null);
		this.aClass5_Sub3_18.method6388(0);
		this.aClass5_Sub3_18.method6376();
	}

	@OriginalMember(owner = "client!sb", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class205_Sub1 local8 = this.aClass5_Sub3_18.method6297();
		@Pc(13) Class205_Sub1 local13 = this.aClass5_Sub3_18.method6348();
		this.anInterface9_4.method6468(this.aBoolean568 || this.aBoolean571 ? Static302.aClass172_9 : Static50.aClass172_2);
		this.aClass5_Sub3_18.method6401();
		this.aClass5_Sub3_18.method6416(this.anInterface9_4);
		this.aClass5_Sub3_18.method6398(arg6);
		this.aClass5_Sub3_18.method6309(arg4);
		this.aClass5_Sub3_18.method6415(Static144.aClass166_2, 1);
		this.aClass5_Sub3_18.method6314(Static144.aClass166_2, 1);
		this.aClass5_Sub3_18.method6363(arg5);
		local13.method5240(1.0F, this.anInterface9_4.method3275((float) this.anInt7995), this.anInterface9_4.method3277((float) this.anInt8000));
		if (this.aBoolean569) {
			arg2 = arg2 * this.anInt7995 / this.AA();
			arg3 = arg3 * this.anInt8000 / this.a();
			arg0 += arg2 * this.anInt8002 / this.anInt7995;
			arg1 += arg3 * this.anInt7998 / this.anInt8000;
		}
		local8.method5240(0.0F, (float) arg2, (float) arg3);
		local8.G(arg0, arg1, 0);
		this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
		this.aClass5_Sub3_18.method6392();
		this.aClass5_Sub3_18.method6342();
		this.aClass5_Sub3_18.method6376();
		this.aClass5_Sub3_18.method6415(Static28.aClass166_1, 1);
		this.aClass5_Sub3_18.method6314(Static28.aClass166_1, 1);
	}

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII[III)V")
	private void method6621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface9_4.method3271(arg0, arg5, arg2, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!sb", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class205_Sub1 local10 = this.aClass5_Sub3_18.method6297();
		@Pc(15) Class205_Sub1 local15 = this.aClass5_Sub3_18.method6348();
		this.anInterface9_4.method6468(Static302.aClass172_9);
		this.aClass5_Sub3_18.method6401();
		this.aClass5_Sub3_18.method6416(this.anInterface9_4);
		this.aClass5_Sub3_18.method6398(arg6);
		this.aClass5_Sub3_18.method6309(arg4);
		this.aClass5_Sub3_18.method6415(Static144.aClass166_2, 1);
		this.aClass5_Sub3_18.method6314(Static144.aClass166_2, 1);
		this.aClass5_Sub3_18.method6363(arg5);
		@Pc(73) boolean local73 = this.aBoolean570 && this.anInt7998 == 0 && this.anInt7984 == 0;
		@Pc(89) boolean local89 = this.aBoolean567 && this.anInt8002 == 0 && this.anInt7999 == 0;
		if (local73 & local89) {
			local15.method5240(1.0F, this.anInterface9_4.method3275((float) arg2), this.anInterface9_4.method3277((float) arg3));
			local10.method5240(0.0F, (float) arg2, (float) arg3);
			local10.G(arg0, arg1, 0);
			this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
			this.aClass5_Sub3_18.method6392();
			this.aClass5_Sub3_18.method6342();
		} else {
			@Pc(143) int local143;
			@Pc(146) int local146;
			@Pc(173) int local173;
			@Pc(178) int local178;
			@Pc(220) int local220;
			if (local89) {
				local143 = arg1 + arg3;
				local146 = this.a();
				local15.method5240(1.0F, this.anInterface9_4.method3275((float) arg2), this.anInterface9_4.method3277((float) this.anInt8000));
				this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
				local173 = this.anInt7998 + arg1;
				for (local178 = this.anInt8000 + local173; local178 <= local143; local178 += local146) {
					local10.method5240(0.0F, (float) arg2, (float) this.anInt8000);
					local10.G(arg0, local173, 0);
					this.aClass5_Sub3_18.method6392();
					this.aClass5_Sub3_18.method6342();
					local173 += local146;
				}
				if (local173 < local143) {
					local220 = local143 - local173;
					local15.method5240(1.0F, this.anInterface9_4.method3275((float) arg2), this.anInterface9_4.method3277((float) local220));
					this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
					local10.method5240(0.0F, (float) arg2, (float) local220);
					local10.G(arg0, local173, 0);
					this.aClass5_Sub3_18.method6392();
					this.aClass5_Sub3_18.method6342();
				}
			} else if (local73) {
				local143 = arg2 + arg0;
				local146 = this.AA();
				local15.method5240(1.0F, this.anInterface9_4.method3275((float) this.anInt7995), this.anInterface9_4.method3277((float) arg3));
				this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
				local173 = this.anInt8002 + arg0;
				local178 = local173 + this.anInt7995;
				while (local178 <= local143) {
					local10.method5240(0.0F, (float) this.anInt7995, (float) arg3);
					local10.G(local173, arg1, 0);
					this.aClass5_Sub3_18.method6392();
					local173 += local146;
					local178 += local146;
					this.aClass5_Sub3_18.method6342();
				}
				if (local143 > local173) {
					local220 = local143 - local173;
					local15.method5240(1.0F, this.anInterface9_4.method3275((float) local220), this.anInterface9_4.method3277((float) arg3));
					this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
					local10.method5240(0.0F, (float) local220, (float) arg3);
					local10.G(local173, arg1, 0);
					this.aClass5_Sub3_18.method6392();
					this.aClass5_Sub3_18.method6342();
				}
			} else {
				local143 = arg3 + arg1;
				local146 = arg2 + arg0;
				local173 = this.AA();
				local178 = this.a();
				local220 = arg1 + this.anInt7998;
				@Pc(452) int local452;
				@Pc(457) int local457;
				@Pc(505) int local505;
				for (@Pc(422) int local422 = local220 + this.anInt8000; local422 <= local143; local422 += local178) {
					local15.method5240(1.0F, this.anInterface9_4.method3275((float) this.anInt7995), this.anInterface9_4.method3277((float) this.anInt8000));
					this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
					local452 = arg0 + this.anInt8002;
					for (local457 = this.anInt7995 + local452; local457 <= local146; local457 += local173) {
						local10.method5240(0.0F, (float) this.anInt7995, (float) this.anInt8000);
						local10.G(local452, local220, 0);
						this.aClass5_Sub3_18.method6392();
						local452 += local173;
						this.aClass5_Sub3_18.method6342();
					}
					if (local452 < local146) {
						local505 = local146 - local452;
						local15.method5240(1.0F, this.anInterface9_4.method3275((float) local505), this.anInterface9_4.method3277((float) this.anInt8000));
						this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
						local10.method5240(0.0F, (float) local505, (float) this.anInt8000);
						local10.G(local452, local220, 0);
						this.aClass5_Sub3_18.method6392();
						this.aClass5_Sub3_18.method6342();
					}
					local220 += local178;
				}
				if (local220 < local143) {
					local452 = local143 - local220;
					local15.method5240(1.0F, this.anInterface9_4.method3275((float) this.anInt7995), this.anInterface9_4.method3277((float) local452));
					this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
					local457 = this.anInt8002 + arg0;
					local505 = this.anInt7995 + local457;
					while (local146 >= local505) {
						local10.method5240(0.0F, (float) this.anInt7995, (float) local452);
						local10.G(local457, local220, 0);
						this.aClass5_Sub3_18.method6392();
						this.aClass5_Sub3_18.method6342();
						local505 += local173;
						local457 += local173;
					}
					if (local457 < local146) {
						@Pc(655) int local655 = local146 - local457;
						local15.method5240(1.0F, this.anInterface9_4.method3275((float) local655), this.anInterface9_4.method3277((float) local452));
						this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
						local10.method5240(0.0F, (float) local655, (float) local452);
						local10.G(local457, local220, 0);
						this.aClass5_Sub3_18.method6392();
						this.aClass5_Sub3_18.method6342();
					}
				}
			}
		}
		this.aClass5_Sub3_18.method6376();
		this.aClass5_Sub3_18.method6415(Static28.aClass166_1, 1);
		this.aClass5_Sub3_18.method6314(Static28.aClass166_1, 1);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method6672(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class10 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class205_Sub1 local8 = this.aClass5_Sub3_18.method6297();
		@Pc(13) Class205_Sub1 local13 = this.aClass5_Sub3_18.method6348();
		@Pc(16) Class10_Sub2 local16 = (Class10_Sub2) arg6;
		@Pc(19) Interface9 local19 = local16.anInterface9_3;
		this.anInterface9_4.method6468(Static50.aClass172_2);
		this.aClass5_Sub3_18.method6401();
		this.aClass5_Sub3_18.method6416(this.anInterface9_4);
		this.aClass5_Sub3_18.method6398(1);
		this.aClass5_Sub3_18.method6309(1);
		if (this.aBoolean569) {
			@Pc(84) float local84 = (float) this.anInt7995 / (float) this.AA();
			@Pc(92) float local92 = (float) this.anInt8000 / (float) this.a();
			local8.method5228(0.0F, 1.0F, 0.0F, 0.0F, local92 * (arg4 - arg0), 0.0F, (arg3 - arg1) * local84, local92 * (arg5 - arg1), local84 * (arg2 - arg0));
			local8.method5227(local84 * (arg0 + (float) this.anInt8002), local92 * ((float) this.anInt7998 + arg1), 0.0F);
		} else {
			local8.method5228(0.0F, 1.0F, 0.0F, 0.0F, arg4 - arg0, 0.0F, arg3 - arg1, arg5 - arg1, arg2 - arg0);
			local8.method5227(arg0, arg1, 0.0F);
		}
		local13.method5240(1.0F, this.anInterface9_4.method3275((float) this.anInt7995), this.anInterface9_4.method3277((float) this.anInt8000));
		this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
		this.aClass5_Sub3_18.method6388(1);
		this.aClass5_Sub3_18.method6416(local19);
		this.aClass5_Sub3_18.method6320(Static130.aClass289_1, Static526.aClass289_5);
		this.aClass5_Sub3_18.method6415(Static28.aClass166_1, 0);
		@Pc(190) Class205_Sub1 local190 = this.aClass5_Sub3_18.method6348();
		local190.la(local8);
		local190.G(-arg7, -arg8, 0);
		local190.method5229(local19.method3275(1.0F), local19.method3277(1.0F), 1.0F);
		this.aClass5_Sub3_18.method6355(Static124.aClass243_13);
		this.aClass5_Sub3_18.method6392();
		this.aClass5_Sub3_18.method6342();
		this.aClass5_Sub3_18.method6376();
		this.aClass5_Sub3_18.method6415(Static213.aClass166_3, 0);
		this.aClass5_Sub3_18.method6320(Static130.aClass289_1, Static130.aClass289_1);
		this.aClass5_Sub3_18.method6416(null);
		this.aClass5_Sub3_18.method6388(0);
		this.aClass5_Sub3_18.method6376();
	}
}
