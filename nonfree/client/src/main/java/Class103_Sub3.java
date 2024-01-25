import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class103_Sub3 extends Class103 {

	@OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
	private int anInt6149 = 0;

	@OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
	private int anInt6151 = 0;

	@OriginalMember(owner = "client!lga", name = "u", descriptor = "Z")
	private boolean aBoolean453 = false;

	@OriginalMember(owner = "client!lga", name = "p", descriptor = "I")
	private int anInt6155 = 0;

	@OriginalMember(owner = "client!lga", name = "J", descriptor = "I")
	private int anInt6171 = 0;

	@OriginalMember(owner = "client!lga", name = "F", descriptor = "I")
	private final int anInt6167;

	@OriginalMember(owner = "client!lga", name = "E", descriptor = "I")
	private final int anInt6166;

	@OriginalMember(owner = "client!lga", name = "A", descriptor = "Lclient!rl;")
	private final Class82_Sub3 aClass82_Sub3_15;

	@OriginalMember(owner = "client!lga", name = "i", descriptor = "Lclient!dg;")
	private final Interface6 anInterface6_2;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "Z")
	private final boolean aBoolean448;

	@OriginalMember(owner = "client!lga", name = "l", descriptor = "Z")
	private final boolean aBoolean450;

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "Z")
	private final boolean aBoolean449;

	@OriginalMember(owner = "client!lga", name = "q", descriptor = "Z")
	private final boolean aBoolean451;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!rl;IIZ)V")
	public Class103_Sub3(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt6167 = arg2;
		this.anInt6166 = arg1;
		this.aClass82_Sub3_15 = arg0;
		this.anInterface6_2 = arg0.method5008(arg1, arg2, Static280.aClass182_8, arg3 ? Static95.aClass168_2 : Static361.aClass168_7);
		this.anInterface6_2.method8506(true, true);
		this.aBoolean448 = this.anInterface6_2.method8501() != arg1;
		this.aBoolean450 = arg2 != this.anInterface6_2.method8500();
		this.aBoolean449 = !this.aBoolean448 && this.anInterface6_2.method8499();
		this.aBoolean451 = !this.aBoolean450 && this.anInterface6_2.method8499();
	}

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!rl;II[III)V")
	public Class103_Sub3(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass82_Sub3_15 = arg0;
		this.anInt6167 = arg2;
		this.anInt6166 = arg1;
		this.anInterface6_2 = arg0.method4922(arg5, arg4, arg1, false, arg3, arg2);
		this.anInterface6_2.method8506(true, true);
		this.aBoolean448 = arg1 != this.anInterface6_2.method8501();
		this.aBoolean450 = arg2 != this.anInterface6_2.method8500();
		this.aBoolean449 = !this.aBoolean448 && this.anInterface6_2.method8499();
		this.aBoolean451 = !this.aBoolean450 && this.anInterface6_2.method8499();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class31_Sub2 local8 = this.aClass82_Sub3_15.method4944();
		@Pc(13) Class31_Sub2 local13 = this.aClass82_Sub3_15.method4931();
		@Pc(18) int local18 = arg0 + this.anInt6171;
		@Pc(23) int local23 = arg1 + this.anInt6149;
		this.anInterface6_2.method8487(Static47.aClass324_1);
		this.aClass82_Sub3_15.method5039();
		this.aClass82_Sub3_15.method4972(this.anInterface6_2);
		this.aClass82_Sub3_15.method4939(arg4);
		this.aClass82_Sub3_15.method5010(arg2);
		this.aClass82_Sub3_15.method4928(1, Static302.aClass165_1);
		this.aClass82_Sub3_15.method5028(Static302.aClass165_1, 1);
		this.aClass82_Sub3_15.method4933(arg3);
		local8.method7672(0.0F, (float) this.anInt6167, (float) this.anInt6166);
		local8.method7930(local18, local23, 0);
		local13.method7672(1.0F, this.anInterface6_2.method8503((float) this.anInt6167), this.anInterface6_2.method8502((float) this.anInt6166));
		this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
		this.aClass82_Sub3_15.method4961();
		this.aClass82_Sub3_15.method4958();
		this.aClass82_Sub3_15.method4973();
		this.aClass82_Sub3_15.method4928(1, Static430.aClass165_3);
		this.aClass82_Sub3_15.method5028(Static430.aClass165_3, 1);
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "()I")
	@Override
	public int method7451() {
		return this.anInt6155 + this.anInt6167 + this.anInt6149;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Interface6 local9 = local6.anInterface6_5;
		@Pc(14) int local14 = arg1 + this.anInt6149;
		@Pc(19) int local19 = arg0 + this.anInt6171;
		this.anInterface6_2.method8487(Static47.aClass324_1);
		this.aClass82_Sub3_15.method5039();
		this.aClass82_Sub3_15.method4972(this.anInterface6_2);
		this.aClass82_Sub3_15.method4939(1);
		this.aClass82_Sub3_15.method5010(1);
		@Pc(49) Class31_Sub2 local49 = this.aClass82_Sub3_15.method4944();
		local49.method7672(0.0F, (float) this.anInt6167, (float) this.anInt6166);
		local49.method7930(local19, local14, 0);
		this.aClass82_Sub3_15.method4961();
		@Pc(73) Class31_Sub2 local73 = this.aClass82_Sub3_15.method4931();
		local73.method7672(1.0F, this.anInterface6_2.method8503((float) this.anInt6167), this.anInterface6_2.method8502((float) this.anInt6166));
		this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
		this.aClass82_Sub3_15.method4946(1);
		this.aClass82_Sub3_15.method4972(local9);
		this.aClass82_Sub3_15.method4908(Static131.aClass88_1, Static443.aClass88_3);
		this.aClass82_Sub3_15.method4928(0, Static430.aClass165_3);
		@Pc(123) Class31_Sub2 local123 = this.aClass82_Sub3_15.method4931();
		local123.method7672(1.0F, local9.method8503((float) this.anInt6167), local9.method8502((float) this.anInt6166));
		local123.method7661(0.0F, local9.method8502((float) (local19 - arg3)), local9.method8503((float) (local14 - arg4)));
		this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
		this.aClass82_Sub3_15.method4958();
		this.aClass82_Sub3_15.method4973();
		this.aClass82_Sub3_15.method4928(0, Static527.aClass165_4);
		this.aClass82_Sub3_15.method4908(Static131.aClass88_1, Static131.aClass88_1);
		this.aClass82_Sub3_15.method4972((Interface10) null);
		this.aClass82_Sub3_15.method4946(0);
		this.aClass82_Sub3_15.method4973();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6149 = arg1;
		this.anInt6155 = arg3;
		this.anInt6171 = arg0;
		this.anInt6151 = arg2;
		this.aBoolean453 = this.anInt6171 != 0 || this.anInt6149 != 0 || this.anInt6151 != 0 || this.anInt6155 != 0;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7453(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class31_Sub2 local8 = this.aClass82_Sub3_15.method4944();
		@Pc(13) Class31_Sub2 local13 = this.aClass82_Sub3_15.method4931();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface6 local19 = local16.anInterface6_5;
		this.anInterface6_2.method8487(this.aBoolean448 || this.aBoolean450 ? Static47.aClass324_1 : Static468.aClass324_7);
		this.aClass82_Sub3_15.method5039();
		this.aClass82_Sub3_15.method4972(this.anInterface6_2);
		this.aClass82_Sub3_15.method4939(1);
		this.aClass82_Sub3_15.method5010(1);
		if (this.aBoolean453) {
			@Pc(99) float local99 = (float) this.anInt6166 / (float) this.method7454();
			@Pc(107) float local107 = (float) this.anInt6167 / (float) this.method7451();
			local8.method7670(0.0F, (arg5 - arg1) * local107, 0.0F, 1.0F, 0.0F, local99 * (arg2 - arg0), local99 * (arg3 - arg1), 0.0F, local107 * (arg4 - arg0));
			local8.method7661(0.0F, (arg0 + (float) this.anInt6171) * local99, ((float) this.anInt6149 + arg1) * local107);
		} else {
			local8.method7670(0.0F, arg5 - arg1, 0.0F, 1.0F, 0.0F, arg2 - arg0, arg3 - arg1, 0.0F, arg4 - arg0);
			local8.method7661(0.0F, arg0, arg1);
		}
		local13.method7672(1.0F, this.anInterface6_2.method8503((float) this.anInt6167), this.anInterface6_2.method8502((float) this.anInt6166));
		this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
		this.aClass82_Sub3_15.method4946(1);
		this.aClass82_Sub3_15.method4972(local19);
		this.aClass82_Sub3_15.method4908(Static131.aClass88_1, Static443.aClass88_3);
		this.aClass82_Sub3_15.method4928(0, Static430.aClass165_3);
		@Pc(205) Class31_Sub2 local205 = this.aClass82_Sub3_15.method4931();
		local205.method7934(local8);
		local205.method7930(-arg7, -arg8, 0);
		local205.method7657(1.0F, local19.method8502(1.0F), local19.method8503(1.0F));
		this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
		this.aClass82_Sub3_15.method4961();
		this.aClass82_Sub3_15.method4958();
		this.aClass82_Sub3_15.method4973();
		this.aClass82_Sub3_15.method4928(0, Static527.aClass165_4);
		this.aClass82_Sub3_15.method4908(Static131.aClass88_1, Static131.aClass88_1);
		this.aClass82_Sub3_15.method4972((Interface10) null);
		this.aClass82_Sub3_15.method4946(0);
		this.aClass82_Sub3_15.method4973();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7457(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class31_Sub2 local8 = this.aClass82_Sub3_15.method4944();
		@Pc(13) Class31_Sub2 local13 = this.aClass82_Sub3_15.method4931();
		this.anInterface6_2.method8487(this.aBoolean448 || this.aBoolean450 ? Static47.aClass324_1 : Static468.aClass324_7);
		this.aClass82_Sub3_15.method5039();
		this.aClass82_Sub3_15.method4972(this.anInterface6_2);
		this.aClass82_Sub3_15.method4939(1);
		this.aClass82_Sub3_15.method5010(arg6);
		this.aClass82_Sub3_15.method4928(1, Static302.aClass165_1);
		this.aClass82_Sub3_15.method5028(Static302.aClass165_1, 1);
		this.aClass82_Sub3_15.method4933(arg7);
		if (this.aBoolean453) {
			@Pc(77) float local77 = (float) this.method7454();
			@Pc(81) float local81 = (float) this.method7451();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(95) float local95 = (arg3 - arg1) / local77;
			@Pc(101) float local101 = (arg4 - arg0) / local81;
			@Pc(107) float local107 = (arg5 - arg1) / local81;
			@Pc(113) float local113 = local101 * (float) this.anInt6149;
			@Pc(119) float local119 = (float) this.anInt6149 * local107;
			@Pc(125) float local125 = (float) this.anInt6171 * local88;
			@Pc(131) float local131 = local95 * (float) this.anInt6171;
			@Pc(138) float local138 = -local88 * (float) this.anInt6151;
			@Pc(145) float local145 = (float) this.anInt6151 * -local95;
			@Pc(152) float local152 = (float) this.anInt6155 * -local101;
			arg3 = local145 + arg3 + local119;
			arg1 = local119 + arg1 + local131;
			@Pc(171) float local171 = -local107 * (float) this.anInt6155;
			arg2 = local138 + arg2 + local113;
			arg0 = local113 + arg0 + local125;
			arg4 = local152 + local125 + arg4;
			arg5 = local171 + local131 + arg5;
		}
		local8.method7670(0.0F, arg5 - arg1, 0.0F, 1.0F, 0.0F, arg2 - arg0, -arg1 + arg3, 0.0F, arg4 - arg0);
		local8.method7661(0.0F, arg0, arg1);
		local13.method7672(1.0F, this.anInterface6_2.method8503((float) this.anInt6167), this.anInterface6_2.method8502((float) this.anInt6166));
		this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
		this.aClass82_Sub3_15.method4961();
		this.aClass82_Sub3_15.method4958();
		this.aClass82_Sub3_15.method4973();
		this.aClass82_Sub3_15.method4928(1, Static430.aClass165_3);
		this.aClass82_Sub3_15.method5028(Static430.aClass165_3, 1);
	}

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "()I")
	@Override
	public int method7454() {
		return this.anInt6171 + this.anInt6166 + this.anInt6151;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class31_Sub2 local10 = this.aClass82_Sub3_15.method4944();
		@Pc(15) Class31_Sub2 local15 = this.aClass82_Sub3_15.method4931();
		this.anInterface6_2.method8487(Static47.aClass324_1);
		this.aClass82_Sub3_15.method5039();
		this.aClass82_Sub3_15.method4972(this.anInterface6_2);
		this.aClass82_Sub3_15.method4939(arg6);
		this.aClass82_Sub3_15.method5010(arg4);
		this.aClass82_Sub3_15.method4928(1, Static302.aClass165_1);
		this.aClass82_Sub3_15.method5028(Static302.aClass165_1, 1);
		this.aClass82_Sub3_15.method4933(arg5);
		@Pc(73) boolean local73 = this.aBoolean451 && this.anInt6149 == 0 && this.anInt6155 == 0;
		@Pc(89) boolean local89 = this.aBoolean449 && this.anInt6171 == 0 && this.anInt6151 == 0;
		if (local89 & local73) {
			local15.method7672(1.0F, this.anInterface6_2.method8503((float) arg3), this.anInterface6_2.method8502((float) arg2));
			local10.method7672(0.0F, (float) arg3, (float) arg2);
			local10.method7930(arg0, arg1, 0);
			this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
			this.aClass82_Sub3_15.method4961();
			this.aClass82_Sub3_15.method4958();
		} else {
			@Pc(143) int local143;
			@Pc(146) int local146;
			@Pc(173) int local173;
			@Pc(178) int local178;
			@Pc(229) int local229;
			if (local89) {
				local143 = arg1 + arg3;
				local146 = this.method7451();
				local15.method7672(1.0F, this.anInterface6_2.method8503((float) this.anInt6167), this.anInterface6_2.method8502((float) arg2));
				this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
				local173 = arg1 + this.anInt6149;
				local178 = this.anInt6167 + local173;
				while (local178 <= local143) {
					local10.method7672(0.0F, (float) this.anInt6167, (float) arg2);
					local10.method7930(arg0, local173, 0);
					this.aClass82_Sub3_15.method4961();
					local178 += local146;
					local173 += local146;
					this.aClass82_Sub3_15.method4958();
				}
				if (local173 < local143) {
					local229 = local143 - local173;
					local15.method7672(1.0F, this.anInterface6_2.method8503((float) local229), this.anInterface6_2.method8502((float) arg2));
					this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
					local10.method7672(0.0F, (float) local229, (float) arg2);
					local10.method7930(arg0, local173, 0);
					this.aClass82_Sub3_15.method4961();
					this.aClass82_Sub3_15.method4958();
				}
			} else if (local73) {
				local143 = arg0 + arg2;
				local146 = this.method7454();
				local15.method7672(1.0F, this.anInterface6_2.method8503((float) arg3), this.anInterface6_2.method8502((float) this.anInt6166));
				this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
				local173 = arg0 + this.anInt6171;
				for (local178 = this.anInt6166 + local173; local178 <= local143; local178 += local146) {
					local10.method7672(0.0F, (float) arg3, (float) this.anInt6166);
					local10.method7930(local173, arg1, 0);
					this.aClass82_Sub3_15.method4961();
					local173 += local146;
					this.aClass82_Sub3_15.method4958();
				}
				if (local143 > local173) {
					local229 = local143 - local173;
					local15.method7672(1.0F, this.anInterface6_2.method8503((float) arg3), this.anInterface6_2.method8502((float) local229));
					this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
					local10.method7672(0.0F, (float) arg3, (float) local229);
					local10.method7930(local173, arg1, 0);
					this.aClass82_Sub3_15.method4961();
					this.aClass82_Sub3_15.method4958();
				}
			} else {
				local143 = arg3 + arg1;
				local146 = arg0 + arg2;
				local173 = this.method7454();
				local178 = this.method7451();
				local229 = this.anInt6149 + arg1;
				@Pc(331) int local331;
				@Pc(336) int local336;
				@Pc(384) int local384;
				for (@Pc(301) int local301 = local229 + this.anInt6167; local301 <= local143; local301 += local178) {
					local15.method7672(1.0F, this.anInterface6_2.method8503((float) this.anInt6167), this.anInterface6_2.method8502((float) this.anInt6166));
					this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
					local331 = arg0 + this.anInt6171;
					for (local336 = this.anInt6166 + local331; local336 <= local146; local336 += local173) {
						local10.method7672(0.0F, (float) this.anInt6167, (float) this.anInt6166);
						local10.method7930(local331, local229, 0);
						this.aClass82_Sub3_15.method4961();
						local331 += local173;
						this.aClass82_Sub3_15.method4958();
					}
					if (local146 > local331) {
						local384 = local146 - local331;
						local15.method7672(1.0F, this.anInterface6_2.method8503((float) this.anInt6167), this.anInterface6_2.method8502((float) local384));
						this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
						local10.method7672(0.0F, (float) this.anInt6167, (float) local384);
						local10.method7930(local331, local229, 0);
						this.aClass82_Sub3_15.method4961();
						this.aClass82_Sub3_15.method4958();
					}
					local229 += local178;
				}
				if (local229 < local143) {
					local331 = local143 - local229;
					local15.method7672(1.0F, this.anInterface6_2.method8503((float) local331), this.anInterface6_2.method8502((float) this.anInt6166));
					this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
					local336 = this.anInt6171 + arg0;
					for (local384 = this.anInt6166 + local336; local384 <= local146; local384 += local173) {
						local10.method7672(0.0F, (float) local331, (float) this.anInt6166);
						local10.method7930(local336, local229, 0);
						this.aClass82_Sub3_15.method4961();
						this.aClass82_Sub3_15.method4958();
						local336 += local173;
					}
					if (local146 > local336) {
						@Pc(537) int local537 = local146 - local336;
						local15.method7672(1.0F, this.anInterface6_2.method8503((float) local331), this.anInterface6_2.method8502((float) local537));
						this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
						local10.method7672(0.0F, (float) local331, (float) local537);
						local10.method7930(local336, local229, 0);
						this.aClass82_Sub3_15.method4961();
						this.aClass82_Sub3_15.method4958();
					}
				}
			}
		}
		this.aClass82_Sub3_15.method4973();
		this.aClass82_Sub3_15.method4928(1, Static430.aClass165_3);
		this.aClass82_Sub3_15.method5028(Static430.aClass165_3, 1);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "()I")
	@Override
	public int method7440() {
		return this.anInt6167;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIII[III)V")
	private void method5336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface6_2.method8507(arg5, arg3, arg4, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class31_Sub2 local8 = this.aClass82_Sub3_15.method4944();
		@Pc(13) Class31_Sub2 local13 = this.aClass82_Sub3_15.method4931();
		this.anInterface6_2.method8487(this.aBoolean448 || this.aBoolean450 ? Static47.aClass324_1 : Static468.aClass324_7);
		this.aClass82_Sub3_15.method5039();
		this.aClass82_Sub3_15.method4972(this.anInterface6_2);
		this.aClass82_Sub3_15.method4939(arg6);
		this.aClass82_Sub3_15.method5010(arg4);
		this.aClass82_Sub3_15.method4928(1, Static302.aClass165_1);
		this.aClass82_Sub3_15.method5028(Static302.aClass165_1, 1);
		this.aClass82_Sub3_15.method4933(arg5);
		local13.method7672(1.0F, this.anInterface6_2.method8503((float) this.anInt6167), this.anInterface6_2.method8502((float) this.anInt6166));
		if (this.aBoolean453) {
			arg2 = this.anInt6166 * arg2 / this.method7454();
			arg3 = this.anInt6167 * arg3 / this.method7451();
			arg0 += this.anInt6171 * arg2 / this.anInt6166;
			arg1 += this.anInt6149 * arg3 / this.anInt6167;
		}
		local8.method7672(0.0F, (float) arg3, (float) arg2);
		local8.method7930(arg0, arg1, 0);
		this.aClass82_Sub3_15.method4974(Static230.aClass193_3);
		this.aClass82_Sub3_15.method4961();
		this.aClass82_Sub3_15.method4958();
		this.aClass82_Sub3_15.method4973();
		this.aClass82_Sub3_15.method4928(1, Static430.aClass165_3);
		this.aClass82_Sub3_15.method5028(Static430.aClass165_3, 1);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass82_Sub3_15.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method5336(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "()I")
	@Override
	public int method7445() {
		return this.anInt6166;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass82_Sub3_15.na(0, 0, this.anInt6166, this.anInt6167);
		@Pc(22) int[] local22 = new int[this.anInt6166 * this.anInt6167];
		this.anInterface6_2.method8504(this.anInt6167, local22, this.anInt6166);
		@Pc(152) int local152;
		@Pc(159) int local159;
		@Pc(161) int local161;
		if (arg0 == 0) {
			for (local152 = 0; local152 < this.anInt6167; local152++) {
				local159 = this.anInt6166 * local152;
				for (local161 = 0; local161 < this.anInt6166; local161++) {
					local22[local159 + local161] = local15[local159 + local161] << 8 & 0xFF00008A | local22[local161 + local159] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 3) {
			for (local152 = 0; local152 < this.anInt6167; local152++) {
				local159 = this.anInt6166 * local152;
				for (local161 = 0; local161 < this.anInt6166; local161++) {
					local22[local161 + local159] = local22[local161 + local159] & 0xFFFFFF | (local15[local159 + local161] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method5336(0, 0, this.anInt6166, this.anInt6167, local22, this.anInt6166);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "([I)V")
	@Override
	public void method7459(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6149;
		arg0[2] = this.anInt6151;
		arg0[0] = this.anInt6171;
		arg0[3] = this.anInt6155;
	}
}
