import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class59_Sub3 extends Class59 {

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
	private int anInt9692 = 0;

	@OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
	private int anInt9691 = 0;

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
	private int anInt9688 = 0;

	@OriginalMember(owner = "client!uea", name = "B", descriptor = "I")
	private int anInt9709 = 0;

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "Z")
	private boolean aBoolean712 = false;

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "Lclient!wk;")
	private final Class143_Sub1 aClass143_Sub1_19;

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
	private final int anInt9693;

	@OriginalMember(owner = "client!uea", name = "F", descriptor = "I")
	private final int anInt9712;

	@OriginalMember(owner = "client!uea", name = "r", descriptor = "Lclient!kt;")
	private final Interface12 anInterface12_5;

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "Z")
	private final boolean aBoolean711;

	@OriginalMember(owner = "client!uea", name = "x", descriptor = "Z")
	private final boolean aBoolean713;

	@OriginalMember(owner = "client!uea", name = "H", descriptor = "Z")
	private final boolean aBoolean715;

	@OriginalMember(owner = "client!uea", name = "C", descriptor = "Z")
	private final boolean aBoolean714;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!wk;IIZ)V")
	public Class59_Sub3(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass143_Sub1_19 = arg0;
		this.anInt9693 = arg1;
		this.anInt9712 = arg2;
		this.anInterface12_5 = arg0.method6360(arg3 ? Static92.aClass255_3 : Static91.aClass255_21, Static314.aClass206_12, arg1, arg2);
		this.anInterface12_5.method7449(true, true);
		this.aBoolean711 = this.anInterface12_5.method7456() != arg1;
		this.aBoolean713 = arg2 != this.anInterface12_5.method7448();
		this.aBoolean715 = !this.aBoolean711 && this.anInterface12_5.method7453();
		this.aBoolean714 = !this.aBoolean713 && this.anInterface12_5.method7453();
	}

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!wk;II[III)V")
	public Class59_Sub3(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9712 = arg2;
		this.aClass143_Sub1_19 = arg0;
		this.anInt9693 = arg1;
		this.anInterface12_5 = arg0.method6275(arg2, false, arg3, arg4, arg1, arg5);
		this.anInterface12_5.method7449(true, true);
		this.aBoolean711 = this.anInterface12_5.method7456() != arg1;
		this.aBoolean713 = arg2 != this.anInterface12_5.method7448();
		this.aBoolean715 = !this.aBoolean711 && this.anInterface12_5.method7453();
		this.aBoolean714 = !this.aBoolean713 && this.anInterface12_5.method7453();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass143_Sub1_19.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method8076(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "()I")
	@Override
	public int method8061() {
		return this.anInt9712;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Interface12 local9 = local6.anInterface12_2;
		@Pc(14) int local14 = arg0 + this.anInt9688;
		@Pc(19) int local19 = arg1 + this.anInt9709;
		this.anInterface12_5.method7435(Static76.aClass67_1);
		this.aClass143_Sub1_19.method6400();
		this.aClass143_Sub1_19.method6338(this.anInterface12_5);
		this.aClass143_Sub1_19.method6321(1);
		this.aClass143_Sub1_19.method6322(1);
		@Pc(49) Class56_Sub2 local49 = this.aClass143_Sub1_19.method6349();
		local49.method6820(0.0F, (float) this.anInt9712, (float) this.anInt9693);
		local49.method8390(local14, local19, 0);
		this.aClass143_Sub1_19.method6356();
		@Pc(73) Class56_Sub2 local73 = this.aClass143_Sub1_19.method6277();
		local73.method6820(1.0F, this.anInterface12_5.method7455((float) this.anInt9712), this.anInterface12_5.method7450((float) this.anInt9693));
		this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
		this.aClass143_Sub1_19.method6374(1);
		this.aClass143_Sub1_19.method6338(local9);
		this.aClass143_Sub1_19.method6370(Static371.aClass6_2, Static600.aClass6_4);
		this.aClass143_Sub1_19.method6290(Static85.aClass90_2, 0);
		@Pc(123) Class56_Sub2 local123 = this.aClass143_Sub1_19.method6277();
		local123.method6820(1.0F, local9.method7455((float) this.anInt9712), local9.method7450((float) this.anInt9693));
		local123.method6811(0.0F, local9.method7450((float) (local14 - arg3)), local9.method7455((float) (local19 - arg4)));
		this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
		this.aClass143_Sub1_19.method6352();
		this.aClass143_Sub1_19.method6282();
		this.aClass143_Sub1_19.method6290(Static663.aClass90_4, 0);
		this.aClass143_Sub1_19.method6370(Static600.aClass6_4, Static600.aClass6_4);
		this.aClass143_Sub1_19.method6338((Interface4) null);
		this.aClass143_Sub1_19.method6374(0);
		this.aClass143_Sub1_19.method6282();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8065(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class56_Sub2 local8 = this.aClass143_Sub1_19.method6349();
		@Pc(13) Class56_Sub2 local13 = this.aClass143_Sub1_19.method6277();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface12 local19 = local16.anInterface12_2;
		this.anInterface12_5.method7435(this.aBoolean711 || this.aBoolean713 ? Static76.aClass67_1 : Static671.aClass67_11);
		this.aClass143_Sub1_19.method6400();
		this.aClass143_Sub1_19.method6338(this.anInterface12_5);
		this.aClass143_Sub1_19.method6321(1);
		this.aClass143_Sub1_19.method6322(1);
		if (this.aBoolean712) {
			@Pc(67) float local67 = (float) this.anInt9693 / (float) this.method8053();
			@Pc(75) float local75 = (float) this.anInt9712 / (float) this.method8064();
			local8.method6831(0.0F, local75 * (arg5 - arg1), 0.0F, 0.0F, local67 * (arg2 - arg0), 1.0F, local75 * (arg4 - arg0), 0.0F, local67 * (arg3 - arg1));
			local8.method6811(0.0F, local67 * (arg0 + (float) this.anInt9688), ((float) this.anInt9709 + arg1) * local75);
		} else {
			local8.method6831(0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0, 1.0F, arg4 - arg0, 0.0F, arg3 - arg1);
			local8.method6811(0.0F, arg0, arg1);
		}
		local13.method6820(1.0F, this.anInterface12_5.method7455((float) this.anInt9712), this.anInterface12_5.method7450((float) this.anInt9693));
		this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
		this.aClass143_Sub1_19.method6374(1);
		this.aClass143_Sub1_19.method6338(local19);
		this.aClass143_Sub1_19.method6370(Static371.aClass6_2, Static600.aClass6_4);
		this.aClass143_Sub1_19.method6290(Static85.aClass90_2, 0);
		@Pc(202) Class56_Sub2 local202 = this.aClass143_Sub1_19.method6277();
		local202.method8393(local8);
		local202.method8390(-arg7, -arg8, 0);
		local202.method6828(1.0F, local19.method7450(1.0F), local19.method7455(1.0F));
		this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
		this.aClass143_Sub1_19.method6356();
		this.aClass143_Sub1_19.method6352();
		this.aClass143_Sub1_19.method6282();
		this.aClass143_Sub1_19.method6290(Static663.aClass90_4, 0);
		this.aClass143_Sub1_19.method6370(Static600.aClass6_4, Static600.aClass6_4);
		this.aClass143_Sub1_19.method6338((Interface4) null);
		this.aClass143_Sub1_19.method6374(0);
		this.aClass143_Sub1_19.method6282();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "([I)V")
	@Override
	public void method8059(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9688;
		arg0[1] = this.anInt9709;
		arg0[2] = this.anInt9691;
		arg0[3] = this.anInt9692;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIII[III)V")
	private void method8076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface12_5.method7451(arg2, arg5, arg0, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "()I")
	@Override
	public int method8053() {
		return this.anInt9693 + this.anInt9688 + this.anInt9691;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "()I")
	@Override
	public int method8049() {
		return this.anInt9693;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class56_Sub2 local8 = this.aClass143_Sub1_19.method6349();
		@Pc(13) Class56_Sub2 local13 = this.aClass143_Sub1_19.method6277();
		@Pc(18) int local18 = arg1 + this.anInt9709;
		@Pc(23) int local23 = arg0 + this.anInt9688;
		this.anInterface12_5.method7435(Static76.aClass67_1);
		this.aClass143_Sub1_19.method6400();
		this.aClass143_Sub1_19.method6338(this.anInterface12_5);
		this.aClass143_Sub1_19.method6321(arg4);
		this.aClass143_Sub1_19.method6322(arg2);
		this.aClass143_Sub1_19.method6290(Static85.aClass90_1, 1);
		this.aClass143_Sub1_19.method6391(1, Static85.aClass90_1);
		this.aClass143_Sub1_19.method6293(arg3);
		local8.method6820(0.0F, (float) this.anInt9712, (float) this.anInt9693);
		local8.method8390(local23, local18, 0);
		local13.method6820(1.0F, this.anInterface12_5.method7455((float) this.anInt9712), this.anInterface12_5.method7450((float) this.anInt9693));
		this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
		this.aClass143_Sub1_19.method6356();
		this.aClass143_Sub1_19.method6352();
		this.aClass143_Sub1_19.method6282();
		this.aClass143_Sub1_19.method6290(Static85.aClass90_2, 1);
		this.aClass143_Sub1_19.method6391(1, Static85.aClass90_2);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class56_Sub2 local8 = this.aClass143_Sub1_19.method6349();
		@Pc(13) Class56_Sub2 local13 = this.aClass143_Sub1_19.method6277();
		this.anInterface12_5.method7435(this.aBoolean711 || this.aBoolean713 ? Static76.aClass67_1 : Static671.aClass67_11);
		this.aClass143_Sub1_19.method6400();
		this.aClass143_Sub1_19.method6338(this.anInterface12_5);
		this.aClass143_Sub1_19.method6321(arg6);
		this.aClass143_Sub1_19.method6322(arg4);
		this.aClass143_Sub1_19.method6290(Static85.aClass90_1, 1);
		this.aClass143_Sub1_19.method6391(1, Static85.aClass90_1);
		this.aClass143_Sub1_19.method6293(arg5);
		local13.method6820(1.0F, this.anInterface12_5.method7455((float) this.anInt9712), this.anInterface12_5.method7450((float) this.anInt9693));
		if (this.aBoolean712) {
			arg2 = arg2 * this.anInt9693 / this.method8053();
			arg3 = this.anInt9712 * arg3 / this.method8064();
			arg1 += arg3 * this.anInt9709 / this.anInt9712;
			arg0 += this.anInt9688 * arg2 / this.anInt9693;
		}
		local8.method6820(0.0F, (float) arg3, (float) arg2);
		local8.method8390(arg0, arg1, 0);
		this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
		this.aClass143_Sub1_19.method6356();
		this.aClass143_Sub1_19.method6352();
		this.aClass143_Sub1_19.method6282();
		this.aClass143_Sub1_19.method6290(Static85.aClass90_2, 1);
		this.aClass143_Sub1_19.method6391(1, Static85.aClass90_2);
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method8060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class56_Sub2 local10 = this.aClass143_Sub1_19.method6349();
		@Pc(15) Class56_Sub2 local15 = this.aClass143_Sub1_19.method6277();
		this.anInterface12_5.method7435(Static76.aClass67_1);
		this.aClass143_Sub1_19.method6400();
		this.aClass143_Sub1_19.method6338(this.anInterface12_5);
		this.aClass143_Sub1_19.method6321(arg6);
		this.aClass143_Sub1_19.method6322(arg4);
		this.aClass143_Sub1_19.method6290(Static85.aClass90_1, 1);
		this.aClass143_Sub1_19.method6391(1, Static85.aClass90_1);
		this.aClass143_Sub1_19.method6293(arg5);
		@Pc(70) boolean local70 = this.aBoolean714 && this.anInt9709 == 0 && this.anInt9692 == 0;
		@Pc(86) boolean local86 = this.aBoolean715 && this.anInt9688 == 0 && this.anInt9691 == 0;
		if (local70 & local86) {
			local15.method6820(1.0F, this.anInterface12_5.method7455((float) arg3), this.anInterface12_5.method7450((float) arg2));
			local10.method6820(0.0F, (float) arg3, (float) arg2);
			local10.method8390(arg0, arg1, 0);
			this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
			this.aClass143_Sub1_19.method6356();
			this.aClass143_Sub1_19.method6352();
		} else {
			@Pc(98) int local98;
			@Pc(102) int local102;
			@Pc(105) int local105;
			@Pc(108) int local108;
			@Pc(114) int local114;
			if (local86) {
				local98 = arg1 + arg3;
				local102 = this.method8064();
				local15.method6820(1.0F, this.anInterface12_5.method7455((float) this.anInt9712), this.anInterface12_5.method7450((float) arg2));
				this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
				local105 = this.anInt9709 + arg1;
				local108 = local105 + this.anInt9712;
				while (local108 <= local98) {
					local10.method6820(0.0F, (float) this.anInt9712, (float) arg2);
					local10.method8390(arg0, local105, 0);
					this.aClass143_Sub1_19.method6356();
					local108 += local102;
					this.aClass143_Sub1_19.method6352();
					local105 += local102;
				}
				if (local98 > local105) {
					local114 = local98 - local105;
					local15.method6820(1.0F, this.anInterface12_5.method7455((float) local114), this.anInterface12_5.method7450((float) arg2));
					this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
					local10.method6820(0.0F, (float) local114, (float) arg2);
					local10.method8390(arg0, local105, 0);
					this.aClass143_Sub1_19.method6356();
					this.aClass143_Sub1_19.method6352();
				}
			} else if (local70) {
				local98 = arg2 + arg0;
				local102 = this.method8053();
				local15.method6820(1.0F, this.anInterface12_5.method7455((float) arg3), this.anInterface12_5.method7450((float) this.anInt9693));
				this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
				local105 = this.anInt9688 + arg0;
				for (local108 = local105 + this.anInt9693; local108 <= local98; local108 += local102) {
					local10.method6820(0.0F, (float) arg3, (float) this.anInt9693);
					local10.method8390(local105, arg1, 0);
					this.aClass143_Sub1_19.method6356();
					local105 += local102;
					this.aClass143_Sub1_19.method6352();
				}
				if (local105 < local98) {
					local114 = local98 - local105;
					local15.method6820(1.0F, this.anInterface12_5.method7455((float) arg3), this.anInterface12_5.method7450((float) local114));
					this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
					local10.method6820(0.0F, (float) arg3, (float) local114);
					local10.method8390(local105, arg1, 0);
					this.aClass143_Sub1_19.method6356();
					this.aClass143_Sub1_19.method6352();
				}
			} else {
				local98 = arg3 + arg1;
				local102 = arg2 + arg0;
				local105 = this.method8053();
				local108 = this.method8064();
				local114 = arg1 + this.anInt9709;
				@Pc(119) int local119 = local114 + this.anInt9712;
				@Pc(149) int local149;
				@Pc(154) int local154;
				@Pc(202) int local202;
				while (local119 <= local98) {
					local15.method6820(1.0F, this.anInterface12_5.method7455((float) this.anInt9712), this.anInterface12_5.method7450((float) this.anInt9693));
					this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
					local149 = arg0 + this.anInt9688;
					for (local154 = this.anInt9693 + local149; local154 <= local102; local154 += local105) {
						local10.method6820(0.0F, (float) this.anInt9712, (float) this.anInt9693);
						local10.method8390(local149, local114, 0);
						this.aClass143_Sub1_19.method6356();
						local149 += local105;
						this.aClass143_Sub1_19.method6352();
					}
					if (local149 < local102) {
						local202 = local102 - local149;
						local15.method6820(1.0F, this.anInterface12_5.method7455((float) this.anInt9712), this.anInterface12_5.method7450((float) local202));
						this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
						local10.method6820(0.0F, (float) this.anInt9712, (float) local202);
						local10.method8390(local149, local114, 0);
						this.aClass143_Sub1_19.method6356();
						this.aClass143_Sub1_19.method6352();
					}
					local119 += local108;
					local114 += local108;
				}
				if (local114 < local98) {
					local149 = local98 - local114;
					local15.method6820(1.0F, this.anInterface12_5.method7455((float) local149), this.anInterface12_5.method7450((float) this.anInt9693));
					this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
					local154 = this.anInt9688 + arg0;
					for (local202 = this.anInt9693 + local154; local202 <= local102; local202 += local105) {
						local10.method6820(0.0F, (float) local149, (float) this.anInt9693);
						local10.method8390(local154, local114, 0);
						this.aClass143_Sub1_19.method6356();
						this.aClass143_Sub1_19.method6352();
						local154 += local105;
					}
					if (local154 < local102) {
						@Pc(348) int local348 = local102 - local154;
						local15.method6820(1.0F, this.anInterface12_5.method7455((float) local149), this.anInterface12_5.method7450((float) local348));
						this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
						local10.method6820(0.0F, (float) local149, (float) local348);
						local10.method8390(local154, local114, 0);
						this.aClass143_Sub1_19.method6356();
						this.aClass143_Sub1_19.method6352();
					}
				}
			}
		}
		this.aClass143_Sub1_19.method6282();
		this.aClass143_Sub1_19.method6290(Static85.aClass90_2, 1);
		this.aClass143_Sub1_19.method6391(1, Static85.aClass90_2);
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(IIII)V")
	@Override
	public void method8062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9709 = arg1;
		this.anInt9691 = arg2;
		this.anInt9688 = arg0;
		this.anInt9692 = arg3;
		this.aBoolean712 = this.anInt9688 != 0 || this.anInt9709 != 0 || this.anInt9691 != 0 || this.anInt9692 != 0;
	}

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "()I")
	@Override
	public int method8064() {
		return this.anInt9692 + this.anInt9709 + this.anInt9712;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8051(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class56_Sub2 local8 = this.aClass143_Sub1_19.method6349();
		@Pc(13) Class56_Sub2 local13 = this.aClass143_Sub1_19.method6277();
		this.anInterface12_5.method7435(this.aBoolean711 || this.aBoolean713 ? Static76.aClass67_1 : Static671.aClass67_11);
		this.aClass143_Sub1_19.method6400();
		this.aClass143_Sub1_19.method6338(this.anInterface12_5);
		this.aClass143_Sub1_19.method6321(1);
		this.aClass143_Sub1_19.method6322(arg6);
		this.aClass143_Sub1_19.method6290(Static85.aClass90_1, 1);
		this.aClass143_Sub1_19.method6391(1, Static85.aClass90_1);
		this.aClass143_Sub1_19.method6293(arg7);
		if (this.aBoolean712) {
			@Pc(74) float local74 = (float) this.method8053();
			@Pc(78) float local78 = (float) this.method8064();
			@Pc(85) float local85 = (arg2 - arg0) / local74;
			@Pc(91) float local91 = (arg3 - arg1) / local74;
			@Pc(97) float local97 = (arg4 - arg0) / local78;
			@Pc(104) float local104 = (arg5 - arg1) / local78;
			@Pc(110) float local110 = (float) this.anInt9709 * local97;
			@Pc(116) float local116 = local104 * (float) this.anInt9709;
			@Pc(122) float local122 = local85 * (float) this.anInt9688;
			@Pc(128) float local128 = local91 * (float) this.anInt9688;
			@Pc(135) float local135 = (float) this.anInt9691 * -local85;
			@Pc(142) float local142 = -local91 * (float) this.anInt9691;
			@Pc(149) float local149 = (float) this.anInt9692 * -local97;
			arg2 = local135 + arg2 + local110;
			arg4 = local149 + arg4 + local122;
			@Pc(168) float local168 = -local104 * (float) this.anInt9692;
			arg1 = local116 + arg1 + local128;
			arg0 = arg0 + local122 + local110;
			arg3 = local116 + local142 + arg3;
			arg5 = local168 + arg5 + local128;
		}
		local8.method6831(0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0, 1.0F, arg4 - arg0, 0.0F, arg3 - arg1);
		local8.method6811(0.0F, arg0, arg1);
		local13.method6820(1.0F, this.anInterface12_5.method7455((float) this.anInt9712), this.anInterface12_5.method7450((float) this.anInt9693));
		this.aClass143_Sub1_19.method6307(Static73.aClass270_1);
		this.aClass143_Sub1_19.method6356();
		this.aClass143_Sub1_19.method6352();
		this.aClass143_Sub1_19.method6282();
		this.aClass143_Sub1_19.method6290(Static85.aClass90_2, 1);
		this.aClass143_Sub1_19.method6391(1, Static85.aClass90_2);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)V")
	@Override
	public void method8066(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass143_Sub1_19.na(0, 0, this.anInt9693, this.anInt9712);
		@Pc(22) int[] local22 = new int[this.anInt9693 * this.anInt9712];
		this.anInterface12_5.method7454(local22, this.anInt9693, this.anInt9712);
		@Pc(106) int local106;
		@Pc(113) int local113;
		@Pc(115) int local115;
		if (arg0 == 0) {
			for (local106 = 0; local106 < this.anInt9712; local106++) {
				local113 = local106 * this.anInt9693;
				for (local115 = 0; local115 < this.anInt9693; local115++) {
					local22[local113 + local115] = (local15[local115 + local113] & 0x86FF0000) << 8 | local22[local113 + local115] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 3) {
			for (local106 = 0; local106 < this.anInt9712; local106++) {
				local113 = local106 * this.anInt9693;
				for (local115 = 0; local115 < this.anInt9693; local115++) {
					local22[local115 + local113] = (local15[local115 + local113] == 0 ? 0 : -16777216) | local22[local115 + local113] & 0xFFFFFF;
				}
			}
		}
		this.method8076(0, 0, this.anInt9693, this.anInt9712, local22, this.anInt9693);
	}
}
