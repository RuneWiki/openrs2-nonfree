import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	private int anInt3013 = 0;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
	private int anInt3016 = 0;

	@OriginalMember(owner = "client!fo", name = "C", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
	private int anInt3026 = 0;

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
	private int anInt3030 = 0;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
	private final int anInt3010;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Lclient!en;")
	private final Class100_Sub1 aClass100_Sub1_6;

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
	private final int anInt3023;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "Lclient!ls;")
	private final Interface14 anInterface14_3;

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "Z")
	private final boolean aBoolean246;

	@OriginalMember(owner = "client!fo", name = "z", descriptor = "Z")
	private final boolean aBoolean245;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "Z")
	private final boolean aBoolean244;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "Z")
	private final boolean aBoolean242;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!en;IIZ)V")
	public Class39_Sub3(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3010 = arg2;
		this.aClass100_Sub1_6 = arg0;
		this.anInt3023 = arg1;
		this.anInterface14_3 = arg0.method4846(arg3 ? Static356.aClass88_11 : Static530.aClass88_15, arg1, arg2, Static47.aClass42_4);
		this.anInterface14_3.method7067(true, true);
		this.aBoolean246 = arg1 != this.anInterface14_3.method7063();
		this.aBoolean245 = arg2 != this.anInterface14_3.method7068();
		this.aBoolean244 = !this.aBoolean246 && this.anInterface14_3.method7064();
		this.aBoolean242 = !this.aBoolean245 && this.anInterface14_3.method7064();
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!en;II[III)V")
	public Class39_Sub3(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3023 = arg1;
		this.aClass100_Sub1_6 = arg0;
		this.anInt3010 = arg2;
		this.anInterface14_3 = arg0.method4787(arg3, false, arg5, arg4, arg1, arg2);
		this.anInterface14_3.method7067(true, true);
		this.aBoolean246 = arg1 != this.anInterface14_3.method7063();
		this.aBoolean245 = arg2 != this.anInterface14_3.method7068();
		this.aBoolean244 = !this.aBoolean246 && this.anInterface14_3.method7064();
		this.aBoolean242 = !this.aBoolean245 && this.anInterface14_3.method7064();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIII[III)V")
	private void method2461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface14_3.method7069(arg5, arg4, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class20_Sub1 local6 = (Class20_Sub1) arg2;
		@Pc(9) Interface14 local9 = local6.anInterface14_1;
		@Pc(14) int local14 = arg1 + this.anInt3026;
		@Pc(19) int local19 = arg0 + this.anInt3013;
		this.anInterface14_3.method7050(Static118.aClass227_2);
		this.aClass100_Sub1_6.method4784();
		this.aClass100_Sub1_6.method4876(this.anInterface14_3);
		this.aClass100_Sub1_6.method4801(1);
		this.aClass100_Sub1_6.method4872(1);
		@Pc(49) Class68_Sub2 local49 = this.aClass100_Sub1_6.method4878();
		local49.method5108((float) this.anInt3023, (float) this.anInt3010, 0.0F);
		local49.U(local19, local14, 0);
		this.aClass100_Sub1_6.method4858();
		@Pc(73) Class68_Sub2 local73 = this.aClass100_Sub1_6.method4818();
		local73.method5108(this.anInterface14_3.method7070((float) this.anInt3023), this.anInterface14_3.method7065((float) this.anInt3010), 1.0F);
		this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
		this.aClass100_Sub1_6.method4860(1);
		this.aClass100_Sub1_6.method4876(local9);
		this.aClass100_Sub1_6.method4797(Static291.aClass236_2, Static458.aClass236_4);
		this.aClass100_Sub1_6.method4883(0, Static48.aClass119_5);
		@Pc(123) Class68_Sub2 local123 = this.aClass100_Sub1_6.method4818();
		local123.method5108(local9.method7070((float) this.anInt3023), local9.method7065((float) this.anInt3010), 1.0F);
		local123.method5100(local9.method7070((float) (local19 - arg3)), 0.0F, local9.method7065((float) (local14 - arg4)));
		this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
		this.aClass100_Sub1_6.method4796();
		this.aClass100_Sub1_6.method4804();
		this.aClass100_Sub1_6.method4883(0, Static325.aClass119_44);
		this.aClass100_Sub1_6.method4797(Static458.aClass236_4, Static458.aClass236_4);
		this.aClass100_Sub1_6.method4876(null);
		this.aClass100_Sub1_6.method4860(0);
		this.aClass100_Sub1_6.method4804();
	}

	@OriginalMember(owner = "client!fo", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class68_Sub2 local8 = this.aClass100_Sub1_6.method4878();
		@Pc(13) Class68_Sub2 local13 = this.aClass100_Sub1_6.method4818();
		this.anInterface14_3.method7050(this.aBoolean246 || this.aBoolean245 ? Static118.aClass227_2 : Static85.aClass227_1);
		this.aClass100_Sub1_6.method4784();
		this.aClass100_Sub1_6.method4876(this.anInterface14_3);
		this.aClass100_Sub1_6.method4801(arg6);
		this.aClass100_Sub1_6.method4872(arg4);
		this.aClass100_Sub1_6.method4883(1, Static224.aClass119_18);
		this.aClass100_Sub1_6.method4816(1, Static224.aClass119_18);
		this.aClass100_Sub1_6.method4877(arg5);
		local13.method5108(this.anInterface14_3.method7070((float) this.anInt3023), this.anInterface14_3.method7065((float) this.anInt3010), 1.0F);
		if (this.aBoolean247) {
			arg2 = arg2 * this.anInt3023 / this.A();
			arg3 = this.anInt3010 * arg3 / this.ca();
			arg0 += arg2 * this.anInt3013 / this.anInt3023;
			arg1 += arg3 * this.anInt3026 / this.anInt3010;
		}
		local8.method5108((float) arg2, (float) arg3, 0.0F);
		local8.U(arg0, arg1, 0);
		this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
		this.aClass100_Sub1_6.method4858();
		this.aClass100_Sub1_6.method4796();
		this.aClass100_Sub1_6.method4804();
		this.aClass100_Sub1_6.method4883(1, Static48.aClass119_5);
		this.aClass100_Sub1_6.method4816(1, Static48.aClass119_5);
	}

	@OriginalMember(owner = "client!fo", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class68_Sub2 local8 = this.aClass100_Sub1_6.method4878();
		@Pc(13) Class68_Sub2 local13 = this.aClass100_Sub1_6.method4818();
		@Pc(18) int local18 = arg1 + this.anInt3026;
		@Pc(23) int local23 = arg0 + this.anInt3013;
		this.anInterface14_3.method7050(Static118.aClass227_2);
		this.aClass100_Sub1_6.method4784();
		this.aClass100_Sub1_6.method4876(this.anInterface14_3);
		this.aClass100_Sub1_6.method4801(arg4);
		this.aClass100_Sub1_6.method4872(arg2);
		this.aClass100_Sub1_6.method4883(1, Static224.aClass119_18);
		this.aClass100_Sub1_6.method4816(1, Static224.aClass119_18);
		this.aClass100_Sub1_6.method4877(arg3);
		local8.method5108((float) this.anInt3023, (float) this.anInt3010, 0.0F);
		local8.U(local23, local18, 0);
		local13.method5108(this.anInterface14_3.method7070((float) this.anInt3023), this.anInterface14_3.method7065((float) this.anInt3010), 1.0F);
		this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
		this.aClass100_Sub1_6.method4858();
		this.aClass100_Sub1_6.method4796();
		this.aClass100_Sub1_6.method4804();
		this.aClass100_Sub1_6.method4883(1, Static48.aClass119_5);
		this.aClass100_Sub1_6.method4816(1, Static48.aClass119_5);
	}

	@OriginalMember(owner = "client!fo", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass100_Sub1_6.h(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method2461(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!fo", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!fo", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(8) Class68_Sub2 local8 = this.aClass100_Sub1_6.method4878();
		@Pc(13) Class68_Sub2 local13 = this.aClass100_Sub1_6.method4818();
		this.anInterface14_3.method7050(this.aBoolean246 || this.aBoolean245 ? Static118.aClass227_2 : Static85.aClass227_1);
		this.aClass100_Sub1_6.method4784();
		this.aClass100_Sub1_6.method4876(this.anInterface14_3);
		this.aClass100_Sub1_6.method4801(arg8);
		this.aClass100_Sub1_6.method4872(arg6);
		this.aClass100_Sub1_6.method4883(1, Static224.aClass119_18);
		this.aClass100_Sub1_6.method4816(1, Static224.aClass119_18);
		this.aClass100_Sub1_6.method4877(arg7);
		if (this.aBoolean247) {
			@Pc(77) float local77 = (float) this.A();
			@Pc(81) float local81 = (float) this.ca();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(95) float local95 = (arg3 - arg1) / local77;
			@Pc(101) float local101 = (arg4 - arg0) / local81;
			@Pc(107) float local107 = (arg5 - arg1) / local81;
			@Pc(113) float local113 = (float) this.anInt3026 * local101;
			@Pc(119) float local119 = (float) this.anInt3026 * local107;
			@Pc(125) float local125 = (float) this.anInt3013 * local88;
			@Pc(131) float local131 = local95 * (float) this.anInt3013;
			@Pc(138) float local138 = -local88 * (float) this.anInt3016;
			@Pc(145) float local145 = (float) this.anInt3016 * -local95;
			@Pc(152) float local152 = (float) this.anInt3030 * -local101;
			arg0 = local125 + arg0 + local113;
			arg2 = arg2 + local138 + local113;
			@Pc(171) float local171 = (float) this.anInt3030 * -local107;
			arg4 = local125 + arg4 + local152;
			arg3 = local119 + arg3 + local145;
			arg1 = local119 + arg1 + local131;
			arg5 = local171 + local131 + arg5;
		}
		local8.method5107(1.0F, arg4 - arg0, 0.0F, 0.0F, arg2 - arg0, 0.0F, arg3 - arg1, 0.0F, arg5 - arg1);
		local8.method5100(arg0, 0.0F, arg1);
		local13.method5108(this.anInterface14_3.method7070((float) this.anInt3023), this.anInterface14_3.method7065((float) this.anInt3010), 1.0F);
		this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
		this.aClass100_Sub1_6.method4858();
		this.aClass100_Sub1_6.method4796();
		this.aClass100_Sub1_6.method4804();
		this.aClass100_Sub1_6.method4883(1, Static48.aClass119_5);
		this.aClass100_Sub1_6.method4816(1, Static48.aClass119_5);
	}

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt3016 + this.anInt3023 + this.anInt3013;
	}

	@OriginalMember(owner = "client!fo", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3013 = arg0;
		this.anInt3026 = arg1;
		this.anInt3030 = arg3;
		this.anInt3016 = arg2;
		this.aBoolean247 = this.anInt3013 != 0 || this.anInt3026 != 0 || this.anInt3016 != 0 || this.anInt3030 != 0;
	}

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.anInt3010;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7856(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class20 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class68_Sub2 local8 = this.aClass100_Sub1_6.method4878();
		@Pc(13) Class68_Sub2 local13 = this.aClass100_Sub1_6.method4818();
		@Pc(16) Class20_Sub1 local16 = (Class20_Sub1) arg6;
		@Pc(19) Interface14 local19 = local16.anInterface14_1;
		this.anInterface14_3.method7050(this.aBoolean246 || this.aBoolean245 ? Static118.aClass227_2 : Static85.aClass227_1);
		this.aClass100_Sub1_6.method4784();
		this.aClass100_Sub1_6.method4876(this.anInterface14_3);
		this.aClass100_Sub1_6.method4801(1);
		this.aClass100_Sub1_6.method4872(1);
		if (this.aBoolean247) {
			@Pc(98) float local98 = (float) this.anInt3023 / (float) this.A();
			@Pc(106) float local106 = (float) this.anInt3010 / (float) this.ca();
			local8.method5107(1.0F, local106 * (arg4 - arg0), 0.0F, 0.0F, local98 * (arg2 - arg0), 0.0F, local98 * (arg3 - arg1), 0.0F, (arg5 - arg1) * local106);
			local8.method5100(local98 * ((float) this.anInt3013 + arg0), 0.0F, local106 * (arg1 + (float) this.anInt3026));
		} else {
			local8.method5107(1.0F, arg4 - arg0, 0.0F, 0.0F, arg2 - arg0, 0.0F, arg3 - arg1, 0.0F, arg5 - arg1);
			local8.method5100(arg0, 0.0F, arg1);
		}
		local13.method5108(this.anInterface14_3.method7070((float) this.anInt3023), this.anInterface14_3.method7065((float) this.anInt3010), 1.0F);
		this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
		this.aClass100_Sub1_6.method4860(1);
		this.aClass100_Sub1_6.method4876(local19);
		this.aClass100_Sub1_6.method4797(Static291.aClass236_2, Static458.aClass236_4);
		this.aClass100_Sub1_6.method4883(0, Static48.aClass119_5);
		@Pc(205) Class68_Sub2 local205 = this.aClass100_Sub1_6.method4818();
		local205.M(local8);
		local205.U(-arg7, -arg8, 0);
		local205.method5118(local19.method7070(1.0F), local19.method7065(1.0F), 1.0F);
		this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
		this.aClass100_Sub1_6.method4858();
		this.aClass100_Sub1_6.method4796();
		this.aClass100_Sub1_6.method4804();
		this.aClass100_Sub1_6.method4883(0, Static325.aClass119_44);
		this.aClass100_Sub1_6.method4797(Static458.aClass236_4, Static458.aClass236_4);
		this.aClass100_Sub1_6.method4876(null);
		this.aClass100_Sub1_6.method4860(0);
		this.aClass100_Sub1_6.method4804();
	}

	@OriginalMember(owner = "client!fo", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class68_Sub2 local10 = this.aClass100_Sub1_6.method4878();
		@Pc(15) Class68_Sub2 local15 = this.aClass100_Sub1_6.method4818();
		this.anInterface14_3.method7050(Static118.aClass227_2);
		this.aClass100_Sub1_6.method4784();
		this.aClass100_Sub1_6.method4876(this.anInterface14_3);
		this.aClass100_Sub1_6.method4801(arg6);
		this.aClass100_Sub1_6.method4872(arg4);
		this.aClass100_Sub1_6.method4883(1, Static224.aClass119_18);
		this.aClass100_Sub1_6.method4816(1, Static224.aClass119_18);
		this.aClass100_Sub1_6.method4877(arg5);
		@Pc(73) boolean local73 = this.aBoolean242 && this.anInt3026 == 0 && this.anInt3030 == 0;
		@Pc(89) boolean local89 = this.aBoolean244 && this.anInt3013 == 0 && this.anInt3016 == 0;
		if (local73 & local89) {
			local15.method5108(this.anInterface14_3.method7070((float) arg2), this.anInterface14_3.method7065((float) arg3), 1.0F);
			local10.method5108((float) arg2, (float) arg3, 0.0F);
			local10.U(arg0, arg1, 0);
			this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
			this.aClass100_Sub1_6.method4858();
			this.aClass100_Sub1_6.method4796();
		} else {
			@Pc(101) int local101;
			@Pc(105) int local105;
			@Pc(108) int local108;
			@Pc(111) int local111;
			@Pc(116) int local116;
			if (local89) {
				local101 = arg3 + arg1;
				local105 = this.ca();
				local15.method5108(this.anInterface14_3.method7070((float) arg2), this.anInterface14_3.method7065((float) this.anInt3010), 1.0F);
				this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
				local108 = arg1 + this.anInt3026;
				local111 = local108 + this.anInt3010;
				while (local101 >= local111) {
					local10.method5108((float) arg2, (float) this.anInt3010, 0.0F);
					local10.U(arg0, local108, 0);
					this.aClass100_Sub1_6.method4858();
					this.aClass100_Sub1_6.method4796();
					local111 += local105;
					local108 += local105;
				}
				if (local101 > local108) {
					local116 = local101 - local108;
					local15.method5108(this.anInterface14_3.method7070((float) arg2), this.anInterface14_3.method7065((float) local116), 1.0F);
					this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
					local10.method5108((float) arg2, (float) local116, 0.0F);
					local10.U(arg0, local108, 0);
					this.aClass100_Sub1_6.method4858();
					this.aClass100_Sub1_6.method4796();
				}
			} else if (local73) {
				local101 = arg0 + arg2;
				local105 = this.A();
				local15.method5108(this.anInterface14_3.method7070((float) this.anInt3023), this.anInterface14_3.method7065((float) arg3), 1.0F);
				this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
				local108 = arg0 + this.anInt3013;
				local111 = local108 + this.anInt3023;
				while (local111 <= local101) {
					local10.method5108((float) this.anInt3023, (float) arg3, 0.0F);
					local10.U(local108, arg1, 0);
					this.aClass100_Sub1_6.method4858();
					this.aClass100_Sub1_6.method4796();
					local111 += local105;
					local108 += local105;
				}
				if (local101 > local108) {
					local116 = local101 - local108;
					local15.method5108(this.anInterface14_3.method7070((float) local116), this.anInterface14_3.method7065((float) arg3), 1.0F);
					this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
					local10.method5108((float) local116, (float) arg3, 0.0F);
					local10.U(local108, arg1, 0);
					this.aClass100_Sub1_6.method4858();
					this.aClass100_Sub1_6.method4796();
				}
			} else {
				local101 = arg3 + arg1;
				local105 = arg2 + arg0;
				local108 = this.A();
				local111 = this.ca();
				local116 = this.anInt3026 + arg1;
				@Pc(121) int local121 = local116 + this.anInt3010;
				@Pc(151) int local151;
				@Pc(156) int local156;
				@Pc(204) int local204;
				while (local101 >= local121) {
					local15.method5108(this.anInterface14_3.method7070((float) this.anInt3023), this.anInterface14_3.method7065((float) this.anInt3010), 1.0F);
					this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
					local151 = arg0 + this.anInt3013;
					for (local156 = local151 + this.anInt3023; local156 <= local105; local156 += local108) {
						local10.method5108((float) this.anInt3023, (float) this.anInt3010, 0.0F);
						local10.U(local151, local116, 0);
						this.aClass100_Sub1_6.method4858();
						this.aClass100_Sub1_6.method4796();
						local151 += local108;
					}
					if (local151 < local105) {
						local204 = local105 - local151;
						local15.method5108(this.anInterface14_3.method7070((float) local204), this.anInterface14_3.method7065((float) this.anInt3010), 1.0F);
						this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
						local10.method5108((float) local204, (float) this.anInt3010, 0.0F);
						local10.U(local151, local116, 0);
						this.aClass100_Sub1_6.method4858();
						this.aClass100_Sub1_6.method4796();
					}
					local121 += local111;
					local116 += local111;
				}
				if (local116 < local101) {
					local151 = local101 - local116;
					local15.method5108(this.anInterface14_3.method7070((float) this.anInt3023), this.anInterface14_3.method7065((float) local151), 1.0F);
					this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
					local156 = arg0 + this.anInt3013;
					for (local204 = this.anInt3023 + local156; local204 <= local105; local204 += local108) {
						local10.method5108((float) this.anInt3023, (float) local151, 0.0F);
						local10.U(local156, local116, 0);
						this.aClass100_Sub1_6.method4858();
						this.aClass100_Sub1_6.method4796();
						local156 += local108;
					}
					if (local156 < local105) {
						@Pc(346) int local346 = local105 - local156;
						local15.method5108(this.anInterface14_3.method7070((float) local346), this.anInterface14_3.method7065((float) local151), 1.0F);
						this.aClass100_Sub1_6.method4758(Static21.aClass190_1);
						local10.method5108((float) local346, (float) local151, 0.0F);
						local10.U(local156, local116, 0);
						this.aClass100_Sub1_6.method4858();
						this.aClass100_Sub1_6.method4796();
					}
				}
			}
		}
		this.aClass100_Sub1_6.method4804();
		this.aClass100_Sub1_6.method4883(1, Static48.aClass119_5);
		this.aClass100_Sub1_6.method4816(1, Static48.aClass119_5);
	}

	@OriginalMember(owner = "client!fo", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt3030 + this.anInt3026 + this.anInt3010;
	}

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt3023;
	}
}
