import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
	private int anInt3440 = 0;

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
	private int anInt3449 = 0;

	@OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
	private int anInt3455 = 0;

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
	private int anInt3447 = 0;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "Lclient!he;")
	private final Class144_Sub1 aClass144_Sub1_7;

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
	private final int anInt3450;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
	private final int anInt3456;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "Lclient!gka;")
	private final Interface9 anInterface9_2;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Z")
	private final boolean aBoolean251;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "Z")
	private final boolean aBoolean253;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "Z")
	private final boolean aBoolean250;

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "Z")
	private final boolean aBoolean254;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!he;IIZ)V")
	public Class45_Sub2(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass144_Sub1_7 = arg0;
		this.anInt3450 = arg1;
		this.anInt3456 = arg2;
		this.anInterface9_2 = arg0.method5753(arg2, arg3 ? Static641.aClass260_12 : Static466.aClass260_10, arg1, Static18.aClass19_4);
		this.anInterface9_2.method4773(true, true);
		this.aBoolean251 = arg1 != this.anInterface9_2.method4775();
		this.aBoolean253 = arg2 != this.anInterface9_2.method4774();
		this.aBoolean250 = !this.aBoolean251 && this.anInterface9_2.method4769();
		this.aBoolean254 = !this.aBoolean253 && this.anInterface9_2.method4769();
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!he;II[III)V")
	public Class45_Sub2(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3450 = arg1;
		this.anInt3456 = arg2;
		this.aClass144_Sub1_7 = arg0;
		this.anInterface9_2 = arg0.method5703(arg4, arg5, arg1, arg3, arg2, false);
		this.anInterface9_2.method4773(true, true);
		this.aBoolean251 = this.anInterface9_2.method4775() != arg1;
		this.aBoolean253 = arg2 != this.anInterface9_2.method4774();
		this.aBoolean250 = !this.aBoolean251 && this.anInterface9_2.method4769();
		this.aBoolean254 = !this.aBoolean253 && this.anInterface9_2.method4769();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class263_Sub2 local8 = this.aClass144_Sub1_7.method5729();
		@Pc(13) Class263_Sub2 local13 = this.aClass144_Sub1_7.method5724();
		@Pc(18) int local18 = arg1 + this.anInt3440;
		@Pc(23) int local23 = arg0 + this.anInt3449;
		this.anInterface9_2.method9349(Static488.aClass137_10);
		this.aClass144_Sub1_7.method5755();
		this.aClass144_Sub1_7.method5643(this.anInterface9_2);
		this.aClass144_Sub1_7.method5685(arg4);
		this.aClass144_Sub1_7.method5723(arg2);
		this.aClass144_Sub1_7.method5740(Static216.aClass138_5, 1);
		this.aClass144_Sub1_7.method5779(1, Static216.aClass138_5);
		this.aClass144_Sub1_7.method5655(arg3);
		local8.method7276(0.0F, (float) this.anInt3456, (float) this.anInt3450);
		local8.method8442(local23, local18, 0);
		local13.method7276(1.0F, this.anInterface9_2.method4770((float) this.anInt3456), this.anInterface9_2.method4772((float) this.anInt3450));
		this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
		this.aClass144_Sub1_7.method5645();
		this.aClass144_Sub1_7.method5679();
		this.aClass144_Sub1_7.method5778();
		this.aClass144_Sub1_7.method5740(Static225.aClass138_3, 1);
		this.aClass144_Sub1_7.method5779(1, Static225.aClass138_3);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([I)V")
	@Override
	public void method7509(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt3447;
		arg0[1] = this.anInt3440;
		arg0[0] = this.anInt3449;
		arg0[3] = this.anInt3455;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "()I")
	@Override
	public int method7510() {
		return this.anInt3450;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "()I")
	@Override
	public int method7508() {
		return this.anInt3447 + this.anInt3450 + this.anInt3449;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass144_Sub1_7.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method2976(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIII)V")
	@Override
	public void method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3440 = arg1;
		this.anInt3447 = arg2;
		this.anInt3449 = arg0;
		this.anInt3455 = arg3;
		this.aBoolean252 = this.anInt3449 != 0 || this.anInt3440 != 0 || this.anInt3447 != 0 || this.anInt3455 != 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII[III)V")
	private void method2976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface9_2.method4771(arg3, arg5, arg4, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(11) int local11 = arg0 + this.anInt3449;
		@Pc(16) int local16 = arg1 + this.anInt3440;
		@Pc(19) Interface9 local19 = local6.anInterface9_3;
		this.anInterface9_2.method9349(Static488.aClass137_10);
		this.aClass144_Sub1_7.method5755();
		this.aClass144_Sub1_7.method5643(this.anInterface9_2);
		this.aClass144_Sub1_7.method5685(1);
		this.aClass144_Sub1_7.method5723(1);
		@Pc(49) Class263_Sub2 local49 = this.aClass144_Sub1_7.method5729();
		local49.method7276(0.0F, (float) this.anInt3456, (float) this.anInt3450);
		local49.method8442(local11, local16, 0);
		this.aClass144_Sub1_7.method5645();
		@Pc(73) Class263_Sub2 local73 = this.aClass144_Sub1_7.method5724();
		local73.method7276(1.0F, this.anInterface9_2.method4770((float) this.anInt3456), this.anInterface9_2.method4772((float) this.anInt3450));
		this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
		this.aClass144_Sub1_7.method5706(1);
		this.aClass144_Sub1_7.method5643(local19);
		this.aClass144_Sub1_7.method5653(Static345.aClass287_2, Static284.aClass287_1);
		this.aClass144_Sub1_7.method5740(Static225.aClass138_3, 0);
		@Pc(123) Class263_Sub2 local123 = this.aClass144_Sub1_7.method5724();
		local123.method7276(1.0F, local19.method4770((float) this.anInt3456), local19.method4772((float) this.anInt3450));
		local123.method7280(0.0F, local19.method4770((float) (local16 - arg4)), local19.method4772((float) (local11 - arg3)));
		this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
		this.aClass144_Sub1_7.method5679();
		this.aClass144_Sub1_7.method5778();
		this.aClass144_Sub1_7.method5740(Static308.aClass138_4, 0);
		this.aClass144_Sub1_7.method5653(Static345.aClass287_2, Static345.aClass287_2);
		this.aClass144_Sub1_7.method5643((Interface25) null);
		this.aClass144_Sub1_7.method5706(0);
		this.aClass144_Sub1_7.method5778();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7507(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class263_Sub2 local8 = this.aClass144_Sub1_7.method5729();
		@Pc(13) Class263_Sub2 local13 = this.aClass144_Sub1_7.method5724();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface9 local19 = local16.anInterface9_3;
		this.anInterface9_2.method9349(this.aBoolean251 || this.aBoolean253 || !(true & true) ? Static488.aClass137_10 : Static306.aClass137_8);
		this.aClass144_Sub1_7.method5755();
		this.aClass144_Sub1_7.method5643(this.anInterface9_2);
		this.aClass144_Sub1_7.method5685(1);
		this.aClass144_Sub1_7.method5723(1);
		if (this.aBoolean252) {
			@Pc(72) float local72 = (float) this.anInt3450 / (float) this.method7508();
			@Pc(80) float local80 = (float) this.anInt3456 / (float) this.method7504();
			local8.method7297((arg4 - arg0) * local80, 0.0F, 0.0F, 0.0F, local72 * (arg3 - arg1), 0.0F, 1.0F, local80 * (arg5 - arg1), (arg2 - arg0) * local72);
			local8.method7280(0.0F, local80 * ((float) this.anInt3440 + arg1), local72 * ((float) this.anInt3449 + arg0));
		} else {
			local8.method7297(arg4 - arg0, 0.0F, 0.0F, 0.0F, arg3 - arg1, 0.0F, 1.0F, arg5 - arg1, arg2 - arg0);
			local8.method7280(0.0F, arg1, arg0);
		}
		local13.method7276(1.0F, this.anInterface9_2.method4770((float) this.anInt3456), this.anInterface9_2.method4772((float) this.anInt3450));
		this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
		this.aClass144_Sub1_7.method5706(1);
		this.aClass144_Sub1_7.method5643(local19);
		this.aClass144_Sub1_7.method5653(Static345.aClass287_2, Static284.aClass287_1);
		this.aClass144_Sub1_7.method5740(Static225.aClass138_3, 0);
		@Pc(208) Class263_Sub2 local208 = this.aClass144_Sub1_7.method5724();
		local208.method8437(local8);
		local208.method8442(-arg7, -arg8, 0);
		local208.method7284(1.0F, local19.method4772(1.0F), local19.method4770(1.0F));
		this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
		this.aClass144_Sub1_7.method5645();
		this.aClass144_Sub1_7.method5679();
		this.aClass144_Sub1_7.method5778();
		this.aClass144_Sub1_7.method5740(Static308.aClass138_4, 0);
		this.aClass144_Sub1_7.method5653(Static345.aClass287_2, Static345.aClass287_2);
		this.aClass144_Sub1_7.method5643((Interface25) null);
		this.aClass144_Sub1_7.method5706(0);
		this.aClass144_Sub1_7.method5778();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7486(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class263_Sub2 local8 = this.aClass144_Sub1_7.method5729();
		@Pc(13) Class263_Sub2 local13 = this.aClass144_Sub1_7.method5724();
		this.anInterface9_2.method9349(this.aBoolean251 || this.aBoolean253 || !(true & true) ? Static488.aClass137_10 : Static306.aClass137_8);
		this.aClass144_Sub1_7.method5755();
		this.aClass144_Sub1_7.method5643(this.anInterface9_2);
		this.aClass144_Sub1_7.method5685(1);
		this.aClass144_Sub1_7.method5723(arg6);
		this.aClass144_Sub1_7.method5740(Static216.aClass138_5, 1);
		this.aClass144_Sub1_7.method5779(1, Static216.aClass138_5);
		this.aClass144_Sub1_7.method5655(arg7);
		if (this.aBoolean252) {
			@Pc(79) float local79 = (float) this.method7508();
			@Pc(83) float local83 = (float) this.method7504();
			@Pc(89) float local89 = (arg2 - arg0) / local79;
			@Pc(96) float local96 = (arg3 - arg1) / local79;
			@Pc(103) float local103 = (arg4 - arg0) / local83;
			@Pc(110) float local110 = (arg5 - arg1) / local83;
			@Pc(116) float local116 = local103 * (float) this.anInt3440;
			@Pc(122) float local122 = local110 * (float) this.anInt3440;
			@Pc(128) float local128 = local89 * (float) this.anInt3449;
			@Pc(134) float local134 = (float) this.anInt3449 * local96;
			@Pc(141) float local141 = -local89 * (float) this.anInt3447;
			@Pc(148) float local148 = (float) this.anInt3447 * -local96;
			@Pc(155) float local155 = -local103 * (float) this.anInt3455;
			arg4 = local155 + arg4 + local128;
			arg2 = local116 + local141 + arg2;
			arg1 = local122 + arg1 + local134;
			arg3 = local148 + arg3 + local122;
			@Pc(186) float local186 = -local110 * (float) this.anInt3455;
			arg0 = local128 + arg0 + local116;
			arg5 = local134 + arg5 + local186;
		}
		local8.method7297(arg4 - arg0, 0.0F, 0.0F, 0.0F, arg3 - arg1, 0.0F, 1.0F, arg5 - arg1, -arg0 + arg2);
		local8.method7280(0.0F, arg1, arg0);
		local13.method7276(1.0F, this.anInterface9_2.method4770((float) this.anInt3456), this.anInterface9_2.method4772((float) this.anInt3450));
		this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
		this.aClass144_Sub1_7.method5645();
		this.aClass144_Sub1_7.method5679();
		this.aClass144_Sub1_7.method5778();
		this.aClass144_Sub1_7.method5740(Static225.aClass138_3, 1);
		this.aClass144_Sub1_7.method5779(1, Static225.aClass138_3);
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "()I")
	@Override
	public int method7504() {
		return this.anInt3455 + this.anInt3456 + this.anInt3440;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class263_Sub2 local10 = this.aClass144_Sub1_7.method5729();
		@Pc(15) Class263_Sub2 local15 = this.aClass144_Sub1_7.method5724();
		this.anInterface9_2.method9349(Static488.aClass137_10);
		this.aClass144_Sub1_7.method5755();
		this.aClass144_Sub1_7.method5643(this.anInterface9_2);
		this.aClass144_Sub1_7.method5685(arg6);
		this.aClass144_Sub1_7.method5723(arg4);
		this.aClass144_Sub1_7.method5740(Static216.aClass138_5, 1);
		this.aClass144_Sub1_7.method5779(1, Static216.aClass138_5);
		this.aClass144_Sub1_7.method5655(arg5);
		@Pc(81) boolean local81 = this.aBoolean254 && this.anInt3440 == 0 && this.anInt3455 == 0;
		@Pc(105) boolean local105 = this.aBoolean250 && this.anInt3449 == 0 && this.anInt3447 == 0;
		if (local105 & local81) {
			local15.method7276(1.0F, this.anInterface9_2.method4770((float) arg3), this.anInterface9_2.method4772((float) arg2));
			local10.method7276(0.0F, (float) arg3, (float) arg2);
			local10.method8442(arg0, arg1, 0);
			this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
			this.aClass144_Sub1_7.method5645();
			this.aClass144_Sub1_7.method5679();
		} else {
			@Pc(118) int local118;
			@Pc(121) int local121;
			@Pc(148) int local148;
			@Pc(153) int local153;
			@Pc(200) int local200;
			if (local105) {
				local118 = arg1 + arg3;
				local121 = this.method7504();
				local15.method7276(1.0F, this.anInterface9_2.method4770((float) this.anInt3456), this.anInterface9_2.method4772((float) arg2));
				this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
				local148 = arg1 + this.anInt3440;
				local153 = this.anInt3456 + local148;
				while (local118 >= local153) {
					local10.method7276(0.0F, (float) this.anInt3456, (float) arg2);
					local10.method8442(arg0, local148, 0);
					this.aClass144_Sub1_7.method5645();
					this.aClass144_Sub1_7.method5679();
					local153 += local121;
					local148 += local121;
				}
				if (local118 > local148) {
					local200 = local118 - local148;
					local15.method7276(1.0F, this.anInterface9_2.method4770((float) local200), this.anInterface9_2.method4772((float) arg2));
					this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
					local10.method7276(0.0F, (float) local200, (float) arg2);
					local10.method8442(arg0, local148, 0);
					this.aClass144_Sub1_7.method5645();
					this.aClass144_Sub1_7.method5679();
				}
			} else if (local81) {
				local118 = arg0 + arg2;
				local121 = this.method7508();
				local15.method7276(1.0F, this.anInterface9_2.method4770((float) arg3), this.anInterface9_2.method4772((float) this.anInt3450));
				this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
				local148 = arg0 + this.anInt3449;
				for (local153 = local148 + this.anInt3450; local153 <= local118; local153 += local121) {
					local10.method7276(0.0F, (float) arg3, (float) this.anInt3450);
					local10.method8442(local148, arg1, 0);
					this.aClass144_Sub1_7.method5645();
					local148 += local121;
					this.aClass144_Sub1_7.method5679();
				}
				if (local148 < local118) {
					local200 = local118 - local148;
					local15.method7276(1.0F, this.anInterface9_2.method4770((float) arg3), this.anInterface9_2.method4772((float) local200));
					this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
					local10.method7276(0.0F, (float) arg3, (float) local200);
					local10.method8442(local148, arg1, 0);
					this.aClass144_Sub1_7.method5645();
					this.aClass144_Sub1_7.method5679();
				}
			} else {
				local118 = arg1 + arg3;
				local121 = arg0 + arg2;
				local148 = this.method7508();
				local153 = this.method7504();
				local200 = arg1 + this.anInt3440;
				@Pc(306) int local306;
				@Pc(311) int local311;
				@Pc(359) int local359;
				for (@Pc(274) int local274 = this.anInt3456 + local200; local274 <= local118; local274 += local153) {
					local15.method7276(1.0F, this.anInterface9_2.method4770((float) this.anInt3456), this.anInterface9_2.method4772((float) this.anInt3450));
					this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
					local306 = this.anInt3449 + arg0;
					for (local311 = this.anInt3450 + local306; local311 <= local121; local311 += local148) {
						local10.method7276(0.0F, (float) this.anInt3456, (float) this.anInt3450);
						local10.method8442(local306, local200, 0);
						this.aClass144_Sub1_7.method5645();
						this.aClass144_Sub1_7.method5679();
						local306 += local148;
					}
					if (local306 < local121) {
						local359 = local121 - local306;
						local15.method7276(1.0F, this.anInterface9_2.method4770((float) this.anInt3456), this.anInterface9_2.method4772((float) local359));
						this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
						local10.method7276(0.0F, (float) this.anInt3456, (float) local359);
						local10.method8442(local306, local200, 0);
						this.aClass144_Sub1_7.method5645();
						this.aClass144_Sub1_7.method5679();
					}
					local200 += local153;
				}
				if (local200 < local118) {
					local306 = local118 - local200;
					local15.method7276(1.0F, this.anInterface9_2.method4770((float) local306), this.anInterface9_2.method4772((float) this.anInt3450));
					this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
					local311 = this.anInt3449 + arg0;
					local359 = local311 + this.anInt3450;
					while (local121 >= local359) {
						local10.method7276(0.0F, (float) local306, (float) this.anInt3450);
						local10.method8442(local311, local200, 0);
						this.aClass144_Sub1_7.method5645();
						local359 += local148;
						this.aClass144_Sub1_7.method5679();
						local311 += local148;
					}
					if (local311 < local121) {
						@Pc(509) int local509 = local121 - local311;
						local15.method7276(1.0F, this.anInterface9_2.method4770((float) local306), this.anInterface9_2.method4772((float) local509));
						this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
						local10.method7276(0.0F, (float) local306, (float) local509);
						local10.method8442(local311, local200, 0);
						this.aClass144_Sub1_7.method5645();
						this.aClass144_Sub1_7.method5679();
					}
				}
			}
		}
		this.aClass144_Sub1_7.method5778();
		this.aClass144_Sub1_7.method5740(Static225.aClass138_3, 1);
		this.aClass144_Sub1_7.method5779(1, Static225.aClass138_3);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class263_Sub2 local8 = this.aClass144_Sub1_7.method5729();
		@Pc(13) Class263_Sub2 local13 = this.aClass144_Sub1_7.method5724();
		this.anInterface9_2.method9349(this.aBoolean251 || this.aBoolean253 || !(true & true) ? Static488.aClass137_10 : Static306.aClass137_8);
		this.aClass144_Sub1_7.method5755();
		this.aClass144_Sub1_7.method5643(this.anInterface9_2);
		this.aClass144_Sub1_7.method5685(arg6);
		this.aClass144_Sub1_7.method5723(arg4);
		this.aClass144_Sub1_7.method5740(Static216.aClass138_5, 1);
		this.aClass144_Sub1_7.method5779(1, Static216.aClass138_5);
		this.aClass144_Sub1_7.method5655(arg5);
		local13.method7276(1.0F, this.anInterface9_2.method4770((float) this.anInt3456), this.anInterface9_2.method4772((float) this.anInt3450));
		if (this.aBoolean252) {
			arg2 = this.anInt3450 * arg2 / this.method7508();
			arg3 = arg3 * this.anInt3456 / this.method7504();
			arg0 += this.anInt3449 * arg2 / this.anInt3450;
			arg1 += this.anInt3440 * arg3 / this.anInt3456;
		}
		local8.method7276(0.0F, (float) arg3, (float) arg2);
		local8.method8442(arg0, arg1, 0);
		this.aClass144_Sub1_7.method5750(Static282.aClass199_6);
		this.aClass144_Sub1_7.method5645();
		this.aClass144_Sub1_7.method5679();
		this.aClass144_Sub1_7.method5778();
		this.aClass144_Sub1_7.method5740(Static225.aClass138_3, 1);
		this.aClass144_Sub1_7.method5779(1, Static225.aClass138_3);
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "()I")
	@Override
	public int method7501() {
		return this.anInt3456;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	@Override
	public void method7505() {
		@Pc(15) int[] local15 = this.aClass144_Sub1_7.na(0, 0, this.anInt3450, this.anInt3456);
		@Pc(22) int[] local22 = new int[this.anInt3456 * this.anInt3450];
		this.anInterface9_2.method4768(this.anInt3450, local22, this.anInt3456);
		for (@Pc(113) int local113 = 0; local113 < this.anInt3456; local113++) {
			@Pc(120) int local120 = local113 * this.anInt3450;
			for (@Pc(122) int local122 = 0; local122 < this.anInt3450; local122++) {
				local22[local120 + local122] = local22[local122 + local120] & 0xFFFFFF | (local15[local122 + local120] == 0 ? 0 : -16777216);
			}
		}
		this.method2976(0, 0, this.anInt3450, this.anInt3456, local22, this.anInt3450);
	}
}
