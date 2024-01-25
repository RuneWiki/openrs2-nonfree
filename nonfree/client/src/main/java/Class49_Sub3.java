import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class49_Sub3 extends Class49 {

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	private int anInt10460 = 0;

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
	private int anInt10449 = 0;

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
	private int anInt10453 = 0;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "Z")
	private boolean aBoolean773 = false;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
	private int anInt10471 = 0;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "Lclient!jj;")
	private final Class75_Sub1 aClass75_Sub1_23;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
	private final int anInt10458;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	private final int anInt10464;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Lclient!cf;")
	private final Interface7 anInterface7_6;

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "Z")
	private final boolean aBoolean775;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "Z")
	private final boolean aBoolean771;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "Z")
	private final boolean aBoolean774;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "Z")
	private final boolean aBoolean772;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!jj;IIZ)V")
	public Class49_Sub3(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass75_Sub1_23 = arg0;
		this.anInt10458 = arg2;
		this.anInt10464 = arg1;
		this.anInterface7_6 = arg0.method6818(arg3 ? Static432.aClass155_45 : Static265.aClass155_24, arg2, arg1, Static435.aClass274_13);
		this.anInterface7_6.method8723(true, true);
		this.aBoolean775 = this.anInterface7_6.method8724() != arg1;
		this.aBoolean771 = this.anInterface7_6.method8718() != arg2;
		this.aBoolean774 = !this.aBoolean775 && this.anInterface7_6.method8722();
		this.aBoolean772 = !this.aBoolean771 && this.anInterface7_6.method8722();
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!jj;II[III)V")
	public Class49_Sub3(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt10458 = arg2;
		this.anInt10464 = arg1;
		this.aClass75_Sub1_23 = arg0;
		this.anInterface7_6 = arg0.method6766(arg4, arg1, false, arg3, arg2, arg5);
		this.anInterface7_6.method8723(true, true);
		this.aBoolean775 = this.anInterface7_6.method8724() != arg1;
		this.aBoolean771 = arg2 != this.anInterface7_6.method8718();
		this.aBoolean774 = !this.aBoolean775 && this.anInterface7_6.method8722();
		this.aBoolean772 = !this.aBoolean771 && this.anInterface7_6.method8722();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class109_Sub3 local8 = this.aClass75_Sub1_23.method6734();
		@Pc(13) Class109_Sub3 local13 = this.aClass75_Sub1_23.method6775();
		@Pc(18) int local18 = arg1 + this.anInt10460;
		@Pc(23) int local23 = arg0 + this.anInt10453;
		this.anInterface7_6.method8704(Static389.aClass338_14);
		this.aClass75_Sub1_23.method6811();
		this.aClass75_Sub1_23.method6814(this.anInterface7_6);
		this.aClass75_Sub1_23.method6736(arg4);
		this.aClass75_Sub1_23.method6830(arg2);
		this.aClass75_Sub1_23.method6795(1, Static389.aClass261_8);
		this.aClass75_Sub1_23.method6816(1, Static389.aClass261_8);
		this.aClass75_Sub1_23.method6801(arg3);
		local8.method4355((float) this.anInt10458, 0.0F, (float) this.anInt10464);
		local8.method4604(local23, local18, 0);
		local13.method4355(this.anInterface7_6.method8720((float) this.anInt10458), 1.0F, this.anInterface7_6.method8719((float) this.anInt10464));
		this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
		this.aClass75_Sub1_23.method6820();
		this.aClass75_Sub1_23.method6808();
		this.aClass75_Sub1_23.method6744();
		this.aClass75_Sub1_23.method6795(1, Static110.aClass261_3);
		this.aClass75_Sub1_23.method6816(1, Static110.aClass261_3);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8975(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class109_Sub3 local8 = this.aClass75_Sub1_23.method6734();
		@Pc(13) Class109_Sub3 local13 = this.aClass75_Sub1_23.method6775();
		this.anInterface7_6.method8704(this.aBoolean775 || this.aBoolean771 || !(true & true) ? Static389.aClass338_14 : Static673.aClass338_15);
		this.aClass75_Sub1_23.method6811();
		this.aClass75_Sub1_23.method6814(this.anInterface7_6);
		this.aClass75_Sub1_23.method6736(1);
		this.aClass75_Sub1_23.method6830(arg6);
		this.aClass75_Sub1_23.method6795(1, Static389.aClass261_8);
		this.aClass75_Sub1_23.method6816(1, Static389.aClass261_8);
		this.aClass75_Sub1_23.method6801(arg7);
		if (this.aBoolean773) {
			@Pc(79) float local79 = (float) this.method8991();
			@Pc(83) float local83 = (float) this.method8987();
			@Pc(90) float local90 = (arg2 - arg0) / local79;
			@Pc(96) float local96 = (arg3 - arg1) / local79;
			@Pc(103) float local103 = (arg4 - arg0) / local83;
			@Pc(110) float local110 = (arg5 - arg1) / local83;
			@Pc(116) float local116 = (float) this.anInt10460 * local103;
			@Pc(122) float local122 = local110 * (float) this.anInt10460;
			@Pc(128) float local128 = (float) this.anInt10453 * local90;
			@Pc(134) float local134 = (float) this.anInt10453 * local96;
			@Pc(141) float local141 = -local90 * (float) this.anInt10471;
			@Pc(148) float local148 = (float) this.anInt10471 * -local96;
			@Pc(155) float local155 = (float) this.anInt10449 * -local103;
			arg2 = local116 + local141 + arg2;
			arg4 = local155 + arg4 + local128;
			arg3 = arg3 + local148 + local122;
			@Pc(180) float local180 = (float) this.anInt10449 * -local110;
			arg1 = local122 + local134 + arg1;
			arg0 = arg0 + local128 + local116;
			arg5 = local180 + arg5 + local134;
		}
		local8.method4361(arg3 - arg1, arg2 - arg0, 0.0F, 0.0F, 0.0F, 1.0F, arg5 - arg1, 0.0F, arg4 - arg0);
		local8.method4341(0.0F, arg0, arg1);
		local13.method4355(this.anInterface7_6.method8720((float) this.anInt10458), 1.0F, this.anInterface7_6.method8719((float) this.anInt10464));
		this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
		this.aClass75_Sub1_23.method6820();
		this.aClass75_Sub1_23.method6808();
		this.aClass75_Sub1_23.method6744();
		this.aClass75_Sub1_23.method6795(1, Static110.aClass261_3);
		this.aClass75_Sub1_23.method6816(1, Static110.aClass261_3);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(11) int local11 = arg1 + this.anInt10460;
		@Pc(16) int local16 = arg0 + this.anInt10453;
		@Pc(19) Interface7 local19 = local6.anInterface7_5;
		this.anInterface7_6.method8704(Static389.aClass338_14);
		this.aClass75_Sub1_23.method6811();
		this.aClass75_Sub1_23.method6814(this.anInterface7_6);
		this.aClass75_Sub1_23.method6736(1);
		this.aClass75_Sub1_23.method6830(1);
		@Pc(49) Class109_Sub3 local49 = this.aClass75_Sub1_23.method6734();
		local49.method4355((float) this.anInt10458, 0.0F, (float) this.anInt10464);
		local49.method4604(local16, local11, 0);
		this.aClass75_Sub1_23.method6820();
		@Pc(73) Class109_Sub3 local73 = this.aClass75_Sub1_23.method6775();
		local73.method4355(this.anInterface7_6.method8720((float) this.anInt10458), 1.0F, this.anInterface7_6.method8719((float) this.anInt10464));
		this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
		this.aClass75_Sub1_23.method6805(1);
		this.aClass75_Sub1_23.method6814(local19);
		this.aClass75_Sub1_23.method6743(Static571.aClass344_5, Static257.aClass344_2);
		this.aClass75_Sub1_23.method6795(0, Static110.aClass261_3);
		@Pc(123) Class109_Sub3 local123 = this.aClass75_Sub1_23.method6775();
		local123.method4355(local19.method8720((float) this.anInt10458), 1.0F, local19.method8719((float) this.anInt10464));
		local123.method4341(0.0F, local19.method8719((float) (local16 - arg3)), local19.method8720((float) (local11 - arg4)));
		this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
		this.aClass75_Sub1_23.method6808();
		this.aClass75_Sub1_23.method6744();
		this.aClass75_Sub1_23.method6795(0, Static24.aClass261_1);
		this.aClass75_Sub1_23.method6743(Static257.aClass344_2, Static257.aClass344_2);
		this.aClass75_Sub1_23.method6814((Interface1) null);
		this.aClass75_Sub1_23.method6805(0);
		this.aClass75_Sub1_23.method6744();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8980(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class109_Sub3 local8 = this.aClass75_Sub1_23.method6734();
		@Pc(13) Class109_Sub3 local13 = this.aClass75_Sub1_23.method6775();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface7 local19 = local16.anInterface7_5;
		this.anInterface7_6.method8704(this.aBoolean775 || this.aBoolean771 || !(true & true) ? Static389.aClass338_14 : Static673.aClass338_15);
		this.aClass75_Sub1_23.method6811();
		this.aClass75_Sub1_23.method6814(this.anInterface7_6);
		this.aClass75_Sub1_23.method6736(1);
		this.aClass75_Sub1_23.method6830(1);
		if (this.aBoolean773) {
			@Pc(106) float local106 = (float) this.anInt10464 / (float) this.method8991();
			@Pc(114) float local114 = (float) this.anInt10458 / (float) this.method8987();
			local8.method4361((arg3 - arg1) * local106, local106 * (arg2 - arg0), 0.0F, 0.0F, 0.0F, 1.0F, (arg5 - arg1) * local114, 0.0F, local114 * (arg4 - arg0));
			local8.method4341(0.0F, local106 * ((float) this.anInt10453 + arg0), local114 * ((float) this.anInt10460 + arg1));
		} else {
			local8.method4361(arg3 - arg1, -arg0 + arg2, 0.0F, 0.0F, 0.0F, 1.0F, arg5 - arg1, 0.0F, arg4 - arg0);
			local8.method4341(0.0F, arg0, arg1);
		}
		local13.method4355(this.anInterface7_6.method8720((float) this.anInt10458), 1.0F, this.anInterface7_6.method8719((float) this.anInt10464));
		this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
		this.aClass75_Sub1_23.method6805(1);
		this.aClass75_Sub1_23.method6814(local19);
		this.aClass75_Sub1_23.method6743(Static571.aClass344_5, Static257.aClass344_2);
		this.aClass75_Sub1_23.method6795(0, Static110.aClass261_3);
		@Pc(211) Class109_Sub3 local211 = this.aClass75_Sub1_23.method6775();
		local211.method4595(local8);
		local211.method4604(-arg7, -arg8, 0);
		local211.method4354(1.0F, local19.method8719(1.0F), local19.method8720(1.0F));
		this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
		this.aClass75_Sub1_23.method6820();
		this.aClass75_Sub1_23.method6808();
		this.aClass75_Sub1_23.method6744();
		this.aClass75_Sub1_23.method6795(0, Static24.aClass261_1);
		this.aClass75_Sub1_23.method6743(Static257.aClass344_2, Static257.aClass344_2);
		this.aClass75_Sub1_23.method6814((Interface1) null);
		this.aClass75_Sub1_23.method6805(0);
		this.aClass75_Sub1_23.method6744();
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "()I")
	@Override
	public int method8987() {
		return this.anInt10449 + this.anInt10458 + this.anInt10460;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([I)V")
	@Override
	public void method8984(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt10449;
		arg0[0] = this.anInt10453;
		arg0[2] = this.anInt10471;
		arg0[1] = this.anInt10460;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class109_Sub3 local10 = this.aClass75_Sub1_23.method6734();
		@Pc(15) Class109_Sub3 local15 = this.aClass75_Sub1_23.method6775();
		this.anInterface7_6.method8704(Static389.aClass338_14);
		this.aClass75_Sub1_23.method6811();
		this.aClass75_Sub1_23.method6814(this.anInterface7_6);
		this.aClass75_Sub1_23.method6736(arg6);
		this.aClass75_Sub1_23.method6830(arg4);
		this.aClass75_Sub1_23.method6795(1, Static389.aClass261_8);
		this.aClass75_Sub1_23.method6816(1, Static389.aClass261_8);
		this.aClass75_Sub1_23.method6801(arg5);
		@Pc(78) boolean local78 = this.aBoolean772 && this.anInt10460 == 0 && this.anInt10449 == 0;
		@Pc(96) boolean local96 = this.aBoolean774 && this.anInt10453 == 0 && this.anInt10471 == 0;
		if (local78 & local96) {
			local15.method4355(this.anInterface7_6.method8720((float) arg3), 1.0F, this.anInterface7_6.method8719((float) arg2));
			local10.method4355((float) arg3, 0.0F, (float) arg2);
			local10.method4604(arg0, arg1, 0);
			this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
			this.aClass75_Sub1_23.method6820();
			this.aClass75_Sub1_23.method6808();
		} else {
			@Pc(112) int local112;
			@Pc(115) int local115;
			@Pc(142) int local142;
			@Pc(148) int local148;
			@Pc(199) int local199;
			if (local96) {
				local112 = arg1 + arg3;
				local115 = this.method8987();
				local15.method4355(this.anInterface7_6.method8720((float) this.anInt10458), 1.0F, this.anInterface7_6.method8719((float) arg2));
				this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
				local142 = arg1 + this.anInt10460;
				local148 = local142 + this.anInt10458;
				while (local148 <= local112) {
					local10.method4355((float) this.anInt10458, 0.0F, (float) arg2);
					local10.method4604(arg0, local142, 0);
					this.aClass75_Sub1_23.method6820();
					this.aClass75_Sub1_23.method6808();
					local148 += local115;
					local142 += local115;
				}
				if (local112 > local142) {
					local199 = local112 - local142;
					local15.method4355(this.anInterface7_6.method8720((float) local199), 1.0F, this.anInterface7_6.method8719((float) arg2));
					this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
					local10.method4355((float) local199, 0.0F, (float) arg2);
					local10.method4604(arg0, local142, 0);
					this.aClass75_Sub1_23.method6820();
					this.aClass75_Sub1_23.method6808();
				}
			} else if (local78) {
				local112 = arg0 + arg2;
				local115 = this.method8991();
				local15.method4355(this.anInterface7_6.method8720((float) arg3), 1.0F, this.anInterface7_6.method8719((float) this.anInt10464));
				this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
				local142 = this.anInt10453 + arg0;
				local148 = local142 + this.anInt10464;
				while (local112 >= local148) {
					local10.method4355((float) arg3, 0.0F, (float) this.anInt10464);
					local10.method4604(local142, arg1, 0);
					this.aClass75_Sub1_23.method6820();
					local148 += local115;
					local142 += local115;
					this.aClass75_Sub1_23.method6808();
				}
				if (local142 < local112) {
					local199 = local112 - local142;
					local15.method4355(this.anInterface7_6.method8720((float) arg3), 1.0F, this.anInterface7_6.method8719((float) local199));
					this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
					local10.method4355((float) arg3, 0.0F, (float) local199);
					local10.method4604(local142, arg1, 0);
					this.aClass75_Sub1_23.method6820();
					this.aClass75_Sub1_23.method6808();
				}
			} else {
				local112 = arg3 + arg1;
				local115 = arg0 + arg2;
				local142 = this.method8991();
				local148 = this.method8987();
				local199 = this.anInt10460 + arg1;
				@Pc(267) int local267 = this.anInt10458 + local199;
				@Pc(299) int local299;
				@Pc(304) int local304;
				@Pc(352) int local352;
				while (local112 >= local267) {
					local15.method4355(this.anInterface7_6.method8720((float) this.anInt10458), 1.0F, this.anInterface7_6.method8719((float) this.anInt10464));
					this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
					local299 = this.anInt10453 + arg0;
					local304 = this.anInt10464 + local299;
					while (local115 >= local304) {
						local10.method4355((float) this.anInt10458, 0.0F, (float) this.anInt10464);
						local10.method4604(local299, local199, 0);
						this.aClass75_Sub1_23.method6820();
						this.aClass75_Sub1_23.method6808();
						local304 += local142;
						local299 += local142;
					}
					if (local299 < local115) {
						local352 = local115 - local299;
						local15.method4355(this.anInterface7_6.method8720((float) this.anInt10458), 1.0F, this.anInterface7_6.method8719((float) local352));
						this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
						local10.method4355((float) this.anInt10458, 0.0F, (float) local352);
						local10.method4604(local299, local199, 0);
						this.aClass75_Sub1_23.method6820();
						this.aClass75_Sub1_23.method6808();
					}
					local267 += local148;
					local199 += local148;
				}
				if (local199 < local112) {
					local299 = local112 - local199;
					local15.method4355(this.anInterface7_6.method8720((float) local299), 1.0F, this.anInterface7_6.method8719((float) this.anInt10464));
					this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
					local304 = this.anInt10453 + arg0;
					for (local352 = local304 + this.anInt10464; local352 <= local115; local352 += local142) {
						local10.method4355((float) local299, 0.0F, (float) this.anInt10464);
						local10.method4604(local304, local199, 0);
						this.aClass75_Sub1_23.method6820();
						this.aClass75_Sub1_23.method6808();
						local304 += local142;
					}
					if (local304 < local115) {
						@Pc(507) int local507 = local115 - local304;
						local15.method4355(this.anInterface7_6.method8720((float) local299), 1.0F, this.anInterface7_6.method8719((float) local507));
						this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
						local10.method4355((float) local299, 0.0F, (float) local507);
						local10.method4604(local304, local199, 0);
						this.aClass75_Sub1_23.method6820();
						this.aClass75_Sub1_23.method6808();
					}
				}
			}
		}
		this.aClass75_Sub1_23.method6744();
		this.aClass75_Sub1_23.method6795(1, Static110.aClass261_3);
		this.aClass75_Sub1_23.method6816(1, Static110.aClass261_3);
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "()I")
	@Override
	public int method8991() {
		return this.anInt10471 + this.anInt10464 + this.anInt10453;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass75_Sub1_23.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method9001(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "()I")
	@Override
	public int method8988() {
		return this.anInt10464;
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "()I")
	@Override
	public int method8993() {
		return this.anInt10458;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIII[III)V")
	private void method9001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface7_6.method8721(arg1, arg5, arg4, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class109_Sub3 local8 = this.aClass75_Sub1_23.method6734();
		@Pc(13) Class109_Sub3 local13 = this.aClass75_Sub1_23.method6775();
		this.anInterface7_6.method8704(this.aBoolean775 || this.aBoolean771 || !(true & true) ? Static389.aClass338_14 : Static673.aClass338_15);
		this.aClass75_Sub1_23.method6811();
		this.aClass75_Sub1_23.method6814(this.anInterface7_6);
		this.aClass75_Sub1_23.method6736(arg6);
		this.aClass75_Sub1_23.method6830(arg4);
		this.aClass75_Sub1_23.method6795(1, Static389.aClass261_8);
		this.aClass75_Sub1_23.method6816(1, Static389.aClass261_8);
		this.aClass75_Sub1_23.method6801(arg5);
		local13.method4355(this.anInterface7_6.method8720((float) this.anInt10458), 1.0F, this.anInterface7_6.method8719((float) this.anInt10464));
		if (this.aBoolean773) {
			arg2 = this.anInt10464 * arg2 / this.method8991();
			arg3 = this.anInt10458 * arg3 / this.method8987();
			arg1 += arg3 * this.anInt10460 / this.anInt10458;
			arg0 += arg2 * this.anInt10453 / this.anInt10464;
		}
		local8.method4355((float) arg3, 0.0F, (float) arg2);
		local8.method4604(arg0, arg1, 0);
		this.aClass75_Sub1_23.method6787(Static82.aClass211_2);
		this.aClass75_Sub1_23.method6820();
		this.aClass75_Sub1_23.method6808();
		this.aClass75_Sub1_23.method6744();
		this.aClass75_Sub1_23.method6795(1, Static110.aClass261_3);
		this.aClass75_Sub1_23.method6816(1, Static110.aClass261_3);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V")
	@Override
	public void method8977() {
		@Pc(15) int[] local15 = this.aClass75_Sub1_23.na(0, 0, this.anInt10464, this.anInt10458);
		@Pc(22) int[] local22 = new int[this.anInt10464 * this.anInt10458];
		this.anInterface7_6.method8717(this.anInt10464, this.anInt10458, local22);
		for (@Pc(120) int local120 = 0; local120 < this.anInt10458; local120++) {
			@Pc(127) int local127 = local120 * this.anInt10464;
			for (@Pc(129) int local129 = 0; local129 < this.anInt10464; local129++) {
				local22[local129 + local127] = (local15[local129 + local127] == 0 ? 0 : -16777216) | local22[local127 + local129] & 0xFFFFFF;
			}
		}
		this.method9001(0, 0, this.anInt10464, this.anInt10458, local22, this.anInt10464);
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(IIII)V")
	@Override
	public void method8989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10471 = arg2;
		this.anInt10460 = arg1;
		this.anInt10453 = arg0;
		this.anInt10449 = arg3;
		this.aBoolean773 = this.anInt10453 != 0 || this.anInt10460 != 0 || this.anInt10471 != 0 || this.anInt10449 != 0;
	}
}
