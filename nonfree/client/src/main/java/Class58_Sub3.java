import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class58_Sub3 extends Class58 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	private int anInt9134 = 0;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
	private int anInt9143 = 0;

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
	private int anInt9151 = 0;

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "Z")
	private boolean aBoolean708 = false;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
	private int anInt9140 = 0;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	private final int anInt9138;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
	private final int anInt9153;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!kea;")
	private final Class14_Sub2 aClass14_Sub2_18;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!em;")
	private final Interface6 anInterface6_4;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Z")
	private final boolean aBoolean705;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Z")
	private final boolean aBoolean704;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "Z")
	private final boolean aBoolean709;

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "Z")
	private final boolean aBoolean707;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!kea;IIZ)V")
	public Class58_Sub3(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt9138 = arg2;
		this.anInt9153 = arg1;
		this.aClass14_Sub2_18 = arg0;
		this.anInterface6_4 = arg0.method6957(arg2, arg3 ? Static122.aClass219_7 : Static156.aClass219_11, Static239.aClass161_12, arg1);
		this.aBoolean705 = arg1 != this.anInterface6_4.method7605();
		this.aBoolean704 = arg2 != this.anInterface6_4.method7599();
		this.aBoolean709 = !this.aBoolean705 && this.anInterface6_4.method7601();
		this.aBoolean707 = !this.aBoolean704 && this.anInterface6_4.method7601();
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!kea;II[III)V")
	public Class58_Sub3(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass14_Sub2_18 = arg0;
		this.anInt9138 = arg2;
		this.anInt9153 = arg1;
		this.anInterface6_4 = arg0.method6962(arg2, arg1, arg3, false, arg5, arg4);
		this.aBoolean705 = this.anInterface6_4.method7605() != arg1;
		this.aBoolean704 = this.anInterface6_4.method7599() != arg2;
		this.aBoolean709 = !this.aBoolean705 && this.anInterface6_4.method7601();
		this.aBoolean707 = !this.aBoolean704 && this.anInterface6_4.method7601();
	}

	@OriginalMember(owner = "client!vc", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class54_Sub3 local8 = this.aClass14_Sub2_18.method7012();
		@Pc(13) Class54_Sub3 local13 = this.aClass14_Sub2_18.method7020();
		this.anInterface6_4.method7587(this.aBoolean705 || this.aBoolean704 ? Static176.aClass164_9 : Static411.aClass164_15);
		this.aClass14_Sub2_18.method6951();
		this.aClass14_Sub2_18.method7034(this.anInterface6_4);
		this.aClass14_Sub2_18.method6998(arg8);
		this.aClass14_Sub2_18.method7011(arg6);
		this.aClass14_Sub2_18.method6912(Static113.aClass138_2, 1);
		this.aClass14_Sub2_18.method6968(Static113.aClass138_2, 1);
		this.aClass14_Sub2_18.method7025(arg7);
		if (this.aBoolean708) {
			@Pc(70) float local70 = (float) this.AA();
			@Pc(74) float local74 = (float) this.a();
			@Pc(80) float local80 = (arg2 - arg0) / local70;
			@Pc(86) float local86 = (arg3 - arg1) / local70;
			@Pc(92) float local92 = (arg4 - arg0) / local74;
			@Pc(98) float local98 = (arg5 - arg1) / local74;
			@Pc(104) float local104 = (float) this.anInt9134 * local92;
			@Pc(110) float local110 = local98 * (float) this.anInt9134;
			@Pc(116) float local116 = local80 * (float) this.anInt9140;
			@Pc(122) float local122 = (float) this.anInt9140 * local86;
			@Pc(129) float local129 = -local80 * (float) this.anInt9143;
			@Pc(136) float local136 = -local86 * (float) this.anInt9143;
			@Pc(143) float local143 = (float) this.anInt9151 * -local92;
			@Pc(150) float local150 = -local98 * (float) this.anInt9151;
			arg4 = local143 + local116 + arg4;
			arg1 = local110 + local122 + arg1;
			arg2 = local104 + local129 + arg2;
			arg0 = local104 + local116 + arg0;
			arg3 = local136 + arg3 + local110;
			arg5 = local150 + local122 + arg5;
		}
		local8.method5446(0.0F, arg2 - arg0, arg3 - arg1, 0.0F, 0.0F, arg5 - arg1, -arg0 + arg4, 1.0F, 0.0F);
		local8.method5458(arg0, 0.0F, arg1);
		local13.method5462(this.anInterface6_4.method7604((float) this.anInt9153), this.anInterface6_4.method7600((float) this.anInt9138), 1.0F);
		this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
		this.aClass14_Sub2_18.method7033();
		this.aClass14_Sub2_18.method7019();
		this.aClass14_Sub2_18.method7002();
		this.aClass14_Sub2_18.method6912(Static457.aClass138_4, 1);
		this.aClass14_Sub2_18.method6968(Static457.aClass138_4, 1);
	}

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!vc", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class54_Sub3 local10 = this.aClass14_Sub2_18.method7012();
		@Pc(15) Class54_Sub3 local15 = this.aClass14_Sub2_18.method7020();
		this.anInterface6_4.method7587(Static176.aClass164_9);
		this.aClass14_Sub2_18.method6951();
		this.aClass14_Sub2_18.method7034(this.anInterface6_4);
		this.aClass14_Sub2_18.method6998(arg6);
		this.aClass14_Sub2_18.method7011(arg4);
		this.aClass14_Sub2_18.method6912(Static113.aClass138_2, 1);
		this.aClass14_Sub2_18.method6968(Static113.aClass138_2, 1);
		this.aClass14_Sub2_18.method7025(arg5);
		@Pc(76) boolean local76 = this.aBoolean707 && this.anInt9134 == 0 && this.anInt9151 == 0;
		@Pc(95) boolean local95 = this.aBoolean709 && this.anInt9140 == 0 && this.anInt9143 == 0;
		if (local95 & local76) {
			local15.method5462(this.anInterface6_4.method7604((float) arg2), this.anInterface6_4.method7600((float) arg3), 1.0F);
			local10.method5462((float) arg2, (float) arg3, 0.0F);
			local10.G(arg0, arg1, 0);
			this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
			this.aClass14_Sub2_18.method7033();
			this.aClass14_Sub2_18.method7019();
		} else {
			@Pc(105) int local105;
			@Pc(108) int local108;
			@Pc(136) int local136;
			@Pc(142) int local142;
			@Pc(184) int local184;
			if (local95) {
				local105 = arg3 + arg1;
				local108 = this.a();
				local15.method5462(this.anInterface6_4.method7604((float) arg2), this.anInterface6_4.method7600((float) this.anInt9138), 1.0F);
				this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
				local136 = arg1 + this.anInt9134;
				for (local142 = local136 + this.anInt9138; local142 <= local105; local142 += local108) {
					local10.method5462((float) arg2, (float) this.anInt9138, 0.0F);
					local10.G(arg0, local136, 0);
					this.aClass14_Sub2_18.method7033();
					this.aClass14_Sub2_18.method7019();
					local136 += local108;
				}
				if (local136 < local105) {
					local184 = local105 - local136;
					local15.method5462(this.anInterface6_4.method7604((float) arg2), this.anInterface6_4.method7600((float) local184), 1.0F);
					this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
					local10.method5462((float) arg2, (float) local184, 0.0F);
					local10.G(arg0, local136, 0);
					this.aClass14_Sub2_18.method7033();
					this.aClass14_Sub2_18.method7019();
				}
			} else if (local76) {
				local105 = arg0 + arg2;
				local108 = this.AA();
				local15.method5462(this.anInterface6_4.method7604((float) this.anInt9153), this.anInterface6_4.method7600((float) arg3), 1.0F);
				this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
				local136 = this.anInt9140 + arg0;
				local142 = local136 + this.anInt9153;
				while (local142 <= local105) {
					local10.method5462((float) this.anInt9153, (float) arg3, 0.0F);
					local10.G(local136, arg1, 0);
					this.aClass14_Sub2_18.method7033();
					local142 += local108;
					local136 += local108;
					this.aClass14_Sub2_18.method7019();
				}
				if (local136 < local105) {
					local184 = local105 - local136;
					local15.method5462(this.anInterface6_4.method7604((float) local184), this.anInterface6_4.method7600((float) arg3), 1.0F);
					this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
					local10.method5462((float) local184, (float) arg3, 0.0F);
					local10.G(local136, arg1, 0);
					this.aClass14_Sub2_18.method7033();
					this.aClass14_Sub2_18.method7019();
				}
			} else {
				local105 = arg1 + arg3;
				local108 = arg0 + arg2;
				local136 = this.AA();
				local142 = this.a();
				local184 = arg1 + this.anInt9134;
				@Pc(392) int local392 = this.anInt9138 + local184;
				@Pc(422) int local422;
				@Pc(427) int local427;
				@Pc(474) int local474;
				while (local392 <= local105) {
					local15.method5462(this.anInterface6_4.method7604((float) this.anInt9153), this.anInterface6_4.method7600((float) this.anInt9138), 1.0F);
					this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
					local422 = this.anInt9140 + arg0;
					for (local427 = this.anInt9153 + local422; local427 <= local108; local427 += local136) {
						local10.method5462((float) this.anInt9153, (float) this.anInt9138, 0.0F);
						local10.G(local422, local184, 0);
						this.aClass14_Sub2_18.method7033();
						local422 += local136;
						this.aClass14_Sub2_18.method7019();
					}
					if (local422 < local108) {
						local474 = local108 - local422;
						local15.method5462(this.anInterface6_4.method7604((float) local474), this.anInterface6_4.method7600((float) this.anInt9138), 1.0F);
						this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
						local10.method5462((float) local474, (float) this.anInt9138, 0.0F);
						local10.G(local422, local184, 0);
						this.aClass14_Sub2_18.method7033();
						this.aClass14_Sub2_18.method7019();
					}
					local392 += local142;
					local184 += local142;
				}
				if (local184 < local105) {
					local422 = local105 - local184;
					local15.method5462(this.anInterface6_4.method7604((float) this.anInt9153), this.anInterface6_4.method7600((float) local422), 1.0F);
					this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
					local427 = arg0 + this.anInt9140;
					local474 = this.anInt9153 + local427;
					while (local474 <= local108) {
						local10.method5462((float) this.anInt9153, (float) local422, 0.0F);
						local10.G(local427, local184, 0);
						this.aClass14_Sub2_18.method7033();
						local474 += local136;
						this.aClass14_Sub2_18.method7019();
						local427 += local136;
					}
					if (local108 > local427) {
						@Pc(615) int local615 = local108 - local427;
						local15.method5462(this.anInterface6_4.method7604((float) local615), this.anInterface6_4.method7600((float) local422), 1.0F);
						this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
						local10.method5462((float) local615, (float) local422, 0.0F);
						local10.G(local427, local184, 0);
						this.aClass14_Sub2_18.method7033();
						this.aClass14_Sub2_18.method7019();
					}
				}
			}
		}
		this.aClass14_Sub2_18.method7002();
		this.aClass14_Sub2_18.method6912(Static457.aClass138_4, 1);
		this.aClass14_Sub2_18.method6968(Static457.aClass138_4, 1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method7660(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class86 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class54_Sub3 local8 = this.aClass14_Sub2_18.method7012();
		@Pc(13) Class54_Sub3 local13 = this.aClass14_Sub2_18.method7020();
		@Pc(16) Class86_Sub2 local16 = (Class86_Sub2) arg6;
		@Pc(19) Interface6 local19 = local16.anInterface6_3;
		this.anInterface6_4.method7587(Static411.aClass164_15);
		this.aClass14_Sub2_18.method6951();
		this.aClass14_Sub2_18.method7034(this.anInterface6_4);
		this.aClass14_Sub2_18.method6998(1);
		this.aClass14_Sub2_18.method7011(1);
		if (this.aBoolean708) {
			@Pc(55) float local55 = (float) this.anInt9153 / (float) this.AA();
			@Pc(63) float local63 = (float) this.anInt9138 / (float) this.a();
			local8.method5446(0.0F, (arg2 - arg0) * local55, (arg3 - arg1) * local55, 0.0F, 0.0F, local63 * (arg5 - arg1), (arg4 - arg0) * local63, 1.0F, 0.0F);
			local8.method5458(((float) this.anInt9140 + arg0) * local55, 0.0F, ((float) this.anInt9134 + arg1) * local63);
		} else {
			local8.method5446(0.0F, arg2 - arg0, -arg1 + arg3, 0.0F, 0.0F, arg5 - arg1, arg4 - arg0, 1.0F, 0.0F);
			local8.method5458(arg0, 0.0F, arg1);
		}
		local13.method5462(this.anInterface6_4.method7604((float) this.anInt9153), this.anInterface6_4.method7600((float) this.anInt9138), 1.0F);
		this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
		this.aClass14_Sub2_18.method6954(1);
		this.aClass14_Sub2_18.method7034(local19);
		this.aClass14_Sub2_18.method6935(Static41.aClass228_10, Static568.aClass228_14);
		this.aClass14_Sub2_18.method6912(Static457.aClass138_4, 0);
		@Pc(190) Class54_Sub3 local190 = this.aClass14_Sub2_18.method7020();
		local190.la(local8);
		local190.G(-arg7, -arg8, 0);
		local190.method5453(1.0F, local19.method7600(1.0F), local19.method7604(1.0F));
		this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
		this.aClass14_Sub2_18.method7033();
		this.aClass14_Sub2_18.method7019();
		this.aClass14_Sub2_18.method7002();
		this.aClass14_Sub2_18.method6912(Static185.aClass138_3, 0);
		this.aClass14_Sub2_18.method6935(Static41.aClass228_10, Static41.aClass228_10);
		this.aClass14_Sub2_18.method7034(null);
		this.aClass14_Sub2_18.method6954(0);
		this.aClass14_Sub2_18.method7002();
	}

	@OriginalMember(owner = "client!vc", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class54_Sub3 local8 = this.aClass14_Sub2_18.method7012();
		@Pc(13) Class54_Sub3 local13 = this.aClass14_Sub2_18.method7020();
		this.anInterface6_4.method7587(this.aBoolean705 || this.aBoolean704 ? Static176.aClass164_9 : Static411.aClass164_15);
		this.aClass14_Sub2_18.method6951();
		this.aClass14_Sub2_18.method7034(this.anInterface6_4);
		this.aClass14_Sub2_18.method6998(arg6);
		this.aClass14_Sub2_18.method7011(arg4);
		this.aClass14_Sub2_18.method6912(Static113.aClass138_2, 1);
		this.aClass14_Sub2_18.method6968(Static113.aClass138_2, 1);
		this.aClass14_Sub2_18.method7025(arg5);
		local13.method5462(this.anInterface6_4.method7604((float) this.anInt9153), this.anInterface6_4.method7600((float) this.anInt9138), 1.0F);
		if (this.aBoolean708) {
			arg2 = arg2 * this.anInt9153 / this.AA();
			arg3 = arg3 * this.anInt9138 / this.a();
			arg0 += arg2 * this.anInt9140 / this.anInt9153;
			arg1 += this.anInt9134 * arg3 / this.anInt9138;
		}
		local8.method5462((float) arg2, (float) arg3, 0.0F);
		local8.G(arg0, arg1, 0);
		this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
		this.aClass14_Sub2_18.method7033();
		this.aClass14_Sub2_18.method7019();
		this.aClass14_Sub2_18.method7002();
		this.aClass14_Sub2_18.method6912(Static457.aClass138_4, 1);
		this.aClass14_Sub2_18.method6968(Static457.aClass138_4, 1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII[III)V")
	private void method7497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface6_4.method7603(arg4, arg3, arg2, arg1, arg5, arg0);
	}

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class54_Sub3 local8 = this.aClass14_Sub2_18.method7012();
		@Pc(13) Class54_Sub3 local13 = this.aClass14_Sub2_18.method7020();
		@Pc(18) int local18 = arg1 + this.anInt9134;
		@Pc(23) int local23 = arg0 + this.anInt9140;
		this.anInterface6_4.method7587(Static176.aClass164_9);
		this.aClass14_Sub2_18.method6951();
		this.aClass14_Sub2_18.method7034(this.anInterface6_4);
		this.aClass14_Sub2_18.method6998(arg4);
		this.aClass14_Sub2_18.method7011(arg2);
		this.aClass14_Sub2_18.method6912(Static113.aClass138_2, 1);
		this.aClass14_Sub2_18.method6968(Static113.aClass138_2, 1);
		this.aClass14_Sub2_18.method7025(arg3);
		local8.method5462((float) this.anInt9153, (float) this.anInt9138, 0.0F);
		local8.G(local23, local18, 0);
		local13.method5462(this.anInterface6_4.method7604((float) this.anInt9153), this.anInterface6_4.method7600((float) this.anInt9138), 1.0F);
		this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
		this.aClass14_Sub2_18.method7033();
		this.aClass14_Sub2_18.method7019();
		this.aClass14_Sub2_18.method7002();
		this.aClass14_Sub2_18.method6912(Static457.aClass138_4, 1);
		this.aClass14_Sub2_18.method6968(Static457.aClass138_4, 1);
	}

	@OriginalMember(owner = "client!vc", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9140 = arg0;
		this.anInt9134 = arg1;
		this.anInt9151 = arg3;
		this.anInt9143 = arg2;
		this.aBoolean708 = this.anInt9140 != 0 || this.anInt9134 != 0 || this.anInt9143 != 0 || this.anInt9151 != 0;
	}

	@OriginalMember(owner = "client!vc", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass14_Sub2_18.KA(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method7497(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method7662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class86_Sub2 local6 = (Class86_Sub2) arg2;
		@Pc(11) int local11 = arg0 + this.anInt9140;
		@Pc(14) Interface6 local14 = local6.anInterface6_3;
		@Pc(19) int local19 = arg1 + this.anInt9134;
		this.anInterface6_4.method7587(Static176.aClass164_9);
		this.aClass14_Sub2_18.method6951();
		this.aClass14_Sub2_18.method7034(this.anInterface6_4);
		this.aClass14_Sub2_18.method6998(1);
		this.aClass14_Sub2_18.method7011(1);
		@Pc(49) Class54_Sub3 local49 = this.aClass14_Sub2_18.method7012();
		local49.method5462((float) this.anInt9153, (float) this.anInt9138, 0.0F);
		local49.G(local11, local19, 0);
		this.aClass14_Sub2_18.method7033();
		@Pc(73) Class54_Sub3 local73 = this.aClass14_Sub2_18.method7020();
		local73.method5462(this.anInterface6_4.method7604((float) this.anInt9153), this.anInterface6_4.method7600((float) this.anInt9138), 1.0F);
		this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
		this.aClass14_Sub2_18.method6954(1);
		this.aClass14_Sub2_18.method7034(local14);
		this.aClass14_Sub2_18.method6935(Static41.aClass228_10, Static568.aClass228_14);
		this.aClass14_Sub2_18.method6912(Static457.aClass138_4, 0);
		@Pc(123) Class54_Sub3 local123 = this.aClass14_Sub2_18.method7020();
		local123.method5462(local14.method7604((float) this.anInt9153), local14.method7600((float) this.anInt9138), 1.0F);
		local123.method5458(local14.method7604((float) (local11 - arg3)), 0.0F, local14.method7600((float) (local19 - arg4)));
		this.aClass14_Sub2_18.method7023(Static206.aClass280_4);
		this.aClass14_Sub2_18.method7019();
		this.aClass14_Sub2_18.method7002();
		this.aClass14_Sub2_18.method6912(Static185.aClass138_3, 0);
		this.aClass14_Sub2_18.method6935(Static41.aClass228_10, Static41.aClass228_10);
		this.aClass14_Sub2_18.method7034(null);
		this.aClass14_Sub2_18.method6954(0);
		this.aClass14_Sub2_18.method7002();
	}

	@OriginalMember(owner = "client!vc", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.anInt9153;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt9138;
	}

	@OriginalMember(owner = "client!vc", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt9140 + this.anInt9153 + this.anInt9143;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt9151 + this.anInt9138 + this.anInt9134;
	}
}
