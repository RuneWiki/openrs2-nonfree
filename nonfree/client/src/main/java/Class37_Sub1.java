import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
	private int anInt1187 = 0;

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
	private int anInt1188 = 0;

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
	private int anInt1202 = 0;

	@OriginalMember(owner = "client!bv", name = "C", descriptor = "I")
	private int anInt1205 = 0;

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
	private final int anInt1194;

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
	private final int anInt1201;

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "Lclient!fc;")
	private final Class15_Sub2 aClass15_Sub2_3;

	@OriginalMember(owner = "client!bv", name = "A", descriptor = "Lclient!qaa;")
	private final Interface14 anInterface14_1;

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "Z")
	private final boolean aBoolean99;

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "Z")
	private final boolean aBoolean96;

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "Z")
	private final boolean aBoolean98;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "Z")
	private final boolean aBoolean95;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!fc;IIZ)V")
	public Class37_Sub1(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1194 = arg1;
		this.anInt1201 = arg2;
		this.aClass15_Sub2_3 = arg0;
		this.anInterface14_1 = arg0.method5472(arg2, arg1, Static302.aClass200_11, arg3 ? Static492.aClass261_14 : Static593.aClass261_16);
		this.aBoolean99 = this.anInterface14_1.method8235() != arg1;
		this.aBoolean96 = arg2 != this.anInterface14_1.method8236();
		this.aBoolean98 = !this.aBoolean99 && this.anInterface14_1.method8240();
		this.aBoolean95 = !this.aBoolean96 && this.anInterface14_1.method8240();
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!fc;II[III)V")
	public Class37_Sub1(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1194 = arg1;
		this.aClass15_Sub2_3 = arg0;
		this.anInt1201 = arg2;
		this.anInterface14_1 = arg0.method5471(arg1, arg3, arg4, arg5, false, arg2);
		this.aBoolean99 = arg1 != this.anInterface14_1.method8235();
		this.aBoolean96 = this.anInterface14_1.method8236() != arg2;
		this.aBoolean98 = !this.aBoolean99 && this.anInterface14_1.method8240();
		this.aBoolean95 = !this.aBoolean96 && this.anInterface14_1.method8240();
	}

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt1201;
	}

	@OriginalMember(owner = "client!bv", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class255_Sub3 local8 = this.aClass15_Sub2_3.method5431();
		@Pc(13) Class255_Sub3 local13 = this.aClass15_Sub2_3.method5465();
		this.anInterface14_1.method8222(this.aBoolean99 || this.aBoolean96 ? Static39.aClass130_7 : Static247.aClass130_8);
		this.aClass15_Sub2_3.method5483();
		this.aClass15_Sub2_3.method5414(this.anInterface14_1);
		this.aClass15_Sub2_3.method5460(arg6);
		this.aClass15_Sub2_3.method5372(arg4);
		this.aClass15_Sub2_3.method5444(1, Static531.aClass85_5);
		this.aClass15_Sub2_3.method5488(Static531.aClass85_5, 1);
		this.aClass15_Sub2_3.method5487(arg5);
		local13.method8042(1.0F, this.anInterface14_1.method8242((float) this.anInt1201), this.anInterface14_1.method8239((float) this.anInt1194));
		if (this.aBoolean97) {
			arg2 = this.anInt1194 * arg2 / this.AA();
			arg3 = arg3 * this.anInt1201 / this.a();
			arg1 += arg3 * this.anInt1188 / this.anInt1201;
			arg0 += this.anInt1202 * arg2 / this.anInt1194;
		}
		local8.method8042(0.0F, (float) arg3, (float) arg2);
		local8.G(arg0, arg1, 0);
		this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
		this.aClass15_Sub2_3.method5445();
		this.aClass15_Sub2_3.method5466();
		this.aClass15_Sub2_3.method5442();
		this.aClass15_Sub2_3.method5444(1, Static457.aClass85_4);
		this.aClass15_Sub2_3.method5488(Static457.aClass85_4, 1);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method7077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class93_Sub3 local6 = (Class93_Sub3) arg2;
		@Pc(9) Interface14 local9 = local6.anInterface14_4;
		@Pc(14) int local14 = arg0 + this.anInt1202;
		@Pc(19) int local19 = arg1 + this.anInt1188;
		this.anInterface14_1.method8222(Static39.aClass130_7);
		this.aClass15_Sub2_3.method5483();
		this.aClass15_Sub2_3.method5414(this.anInterface14_1);
		this.aClass15_Sub2_3.method5460(1);
		this.aClass15_Sub2_3.method5372(1);
		@Pc(49) Class255_Sub3 local49 = this.aClass15_Sub2_3.method5431();
		local49.method8042(0.0F, (float) this.anInt1201, (float) this.anInt1194);
		local49.G(local14, local19, 0);
		this.aClass15_Sub2_3.method5445();
		@Pc(73) Class255_Sub3 local73 = this.aClass15_Sub2_3.method5465();
		local73.method8042(1.0F, this.anInterface14_1.method8242((float) this.anInt1201), this.anInterface14_1.method8239((float) this.anInt1194));
		this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
		this.aClass15_Sub2_3.method5410(1);
		this.aClass15_Sub2_3.method5414(local9);
		this.aClass15_Sub2_3.method5430(Static65.aClass120_1, Static490.aClass120_5);
		this.aClass15_Sub2_3.method5444(0, Static457.aClass85_4);
		@Pc(123) Class255_Sub3 local123 = this.aClass15_Sub2_3.method5465();
		local123.method8042(1.0F, local9.method8242((float) this.anInt1201), local9.method8239((float) this.anInt1194));
		local123.method8029(local9.method8242((float) (local19 - arg4)), 0.0F, local9.method8239((float) (local14 - arg3)));
		this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
		this.aClass15_Sub2_3.method5466();
		this.aClass15_Sub2_3.method5442();
		this.aClass15_Sub2_3.method5444(0, Static159.aClass85_1);
		this.aClass15_Sub2_3.method5430(Static65.aClass120_1, Static65.aClass120_1);
		this.aClass15_Sub2_3.method5414(null);
		this.aClass15_Sub2_3.method5410(0);
		this.aClass15_Sub2_3.method5442();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt1201 + this.anInt1188 + this.anInt1205;
	}

	@OriginalMember(owner = "client!bv", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class255_Sub3 local10 = this.aClass15_Sub2_3.method5431();
		@Pc(15) Class255_Sub3 local15 = this.aClass15_Sub2_3.method5465();
		this.anInterface14_1.method8222(Static39.aClass130_7);
		this.aClass15_Sub2_3.method5483();
		this.aClass15_Sub2_3.method5414(this.anInterface14_1);
		this.aClass15_Sub2_3.method5460(arg6);
		this.aClass15_Sub2_3.method5372(arg4);
		this.aClass15_Sub2_3.method5444(1, Static531.aClass85_5);
		this.aClass15_Sub2_3.method5488(Static531.aClass85_5, 1);
		this.aClass15_Sub2_3.method5487(arg5);
		@Pc(73) boolean local73 = this.aBoolean95 && this.anInt1188 == 0 && this.anInt1205 == 0;
		@Pc(92) boolean local92 = this.aBoolean98 && this.anInt1202 == 0 && this.anInt1187 == 0;
		if (local92 & local73) {
			local15.method8042(1.0F, this.anInterface14_1.method8242((float) arg3), this.anInterface14_1.method8239((float) arg2));
			local10.method8042(0.0F, (float) arg3, (float) arg2);
			local10.G(arg0, arg1, 0);
			this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
			this.aClass15_Sub2_3.method5445();
			this.aClass15_Sub2_3.method5466();
		} else {
			@Pc(149) int local149;
			@Pc(153) int local153;
			@Pc(156) int local156;
			@Pc(159) int local159;
			@Pc(164) int local164;
			if (local92) {
				local149 = arg3 + arg1;
				local153 = this.a();
				local15.method8042(1.0F, this.anInterface14_1.method8242((float) this.anInt1201), this.anInterface14_1.method8239((float) arg2));
				this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
				local156 = arg1 + this.anInt1188;
				local159 = this.anInt1201 + local156;
				while (local159 <= local149) {
					local10.method8042(0.0F, (float) this.anInt1201, (float) arg2);
					local10.G(arg0, local156, 0);
					this.aClass15_Sub2_3.method5445();
					local156 += local153;
					local159 += local153;
					this.aClass15_Sub2_3.method5466();
				}
				if (local149 > local156) {
					local164 = local149 - local156;
					local15.method8042(1.0F, this.anInterface14_1.method8242((float) local164), this.anInterface14_1.method8239((float) arg2));
					this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
					local10.method8042(0.0F, (float) local164, (float) arg2);
					local10.G(arg0, local156, 0);
					this.aClass15_Sub2_3.method5445();
					this.aClass15_Sub2_3.method5466();
				}
			} else if (local73) {
				local149 = arg0 + arg2;
				local153 = this.AA();
				local15.method8042(1.0F, this.anInterface14_1.method8242((float) arg3), this.anInterface14_1.method8239((float) this.anInt1194));
				this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
				local156 = this.anInt1202 + arg0;
				for (local159 = this.anInt1194 + local156; local159 <= local149; local159 += local153) {
					local10.method8042(0.0F, (float) arg3, (float) this.anInt1194);
					local10.G(local156, arg1, 0);
					this.aClass15_Sub2_3.method5445();
					this.aClass15_Sub2_3.method5466();
					local156 += local153;
				}
				if (local156 < local149) {
					local164 = local149 - local156;
					local15.method8042(1.0F, this.anInterface14_1.method8242((float) arg3), this.anInterface14_1.method8239((float) local164));
					this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
					local10.method8042(0.0F, (float) arg3, (float) local164);
					local10.G(local156, arg1, 0);
					this.aClass15_Sub2_3.method5445();
					this.aClass15_Sub2_3.method5466();
				}
			} else {
				local149 = arg1 + arg3;
				local153 = arg0 + arg2;
				local156 = this.AA();
				local159 = this.a();
				local164 = this.anInt1188 + arg1;
				@Pc(169) int local169 = this.anInt1201 + local164;
				@Pc(199) int local199;
				@Pc(205) int local205;
				@Pc(252) int local252;
				while (local149 >= local169) {
					local15.method8042(1.0F, this.anInterface14_1.method8242((float) this.anInt1201), this.anInterface14_1.method8239((float) this.anInt1194));
					this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
					local199 = arg0 + this.anInt1202;
					for (local205 = local199 + this.anInt1194; local205 <= local153; local205 += local156) {
						local10.method8042(0.0F, (float) this.anInt1201, (float) this.anInt1194);
						local10.G(local199, local164, 0);
						this.aClass15_Sub2_3.method5445();
						local199 += local156;
						this.aClass15_Sub2_3.method5466();
					}
					if (local199 < local153) {
						local252 = local153 - local199;
						local15.method8042(1.0F, this.anInterface14_1.method8242((float) this.anInt1201), this.anInterface14_1.method8239((float) local252));
						this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
						local10.method8042(0.0F, (float) this.anInt1201, (float) local252);
						local10.G(local199, local164, 0);
						this.aClass15_Sub2_3.method5445();
						this.aClass15_Sub2_3.method5466();
					}
					local169 += local159;
					local164 += local159;
				}
				if (local149 > local164) {
					local199 = local149 - local164;
					local15.method8042(1.0F, this.anInterface14_1.method8242((float) local199), this.anInterface14_1.method8239((float) this.anInt1194));
					this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
					local205 = this.anInt1202 + arg0;
					for (local252 = local205 + this.anInt1194; local252 <= local153; local252 += local156) {
						local10.method8042(0.0F, (float) local199, (float) this.anInt1194);
						local10.G(local205, local164, 0);
						this.aClass15_Sub2_3.method5445();
						this.aClass15_Sub2_3.method5466();
						local205 += local156;
					}
					if (local205 < local153) {
						@Pc(394) int local394 = local153 - local205;
						local15.method8042(1.0F, this.anInterface14_1.method8242((float) local199), this.anInterface14_1.method8239((float) local394));
						this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
						local10.method8042(0.0F, (float) local199, (float) local394);
						local10.G(local205, local164, 0);
						this.aClass15_Sub2_3.method5445();
						this.aClass15_Sub2_3.method5466();
					}
				}
			}
		}
		this.aClass15_Sub2_3.method5442();
		this.aClass15_Sub2_3.method5444(1, Static457.aClass85_4);
		this.aClass15_Sub2_3.method5488(Static457.aClass85_4, 1);
	}

	@OriginalMember(owner = "client!bv", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1202 = arg0;
		this.anInt1188 = arg1;
		this.anInt1187 = arg2;
		this.anInt1205 = arg3;
		this.aBoolean97 = this.anInt1202 != 0 || this.anInt1188 != 0 || this.anInt1187 != 0 || this.anInt1205 != 0;
	}

	@OriginalMember(owner = "client!bv", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class255_Sub3 local8 = this.aClass15_Sub2_3.method5431();
		@Pc(13) Class255_Sub3 local13 = this.aClass15_Sub2_3.method5465();
		@Pc(18) int local18 = arg0 + this.anInt1202;
		@Pc(23) int local23 = arg1 + this.anInt1188;
		this.anInterface14_1.method8222(Static39.aClass130_7);
		this.aClass15_Sub2_3.method5483();
		this.aClass15_Sub2_3.method5414(this.anInterface14_1);
		this.aClass15_Sub2_3.method5460(arg4);
		this.aClass15_Sub2_3.method5372(arg2);
		this.aClass15_Sub2_3.method5444(1, Static531.aClass85_5);
		this.aClass15_Sub2_3.method5488(Static531.aClass85_5, 1);
		this.aClass15_Sub2_3.method5487(arg3);
		local8.method8042(0.0F, (float) this.anInt1201, (float) this.anInt1194);
		local8.G(local18, local23, 0);
		local13.method8042(1.0F, this.anInterface14_1.method8242((float) this.anInt1201), this.anInterface14_1.method8239((float) this.anInt1194));
		this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
		this.aClass15_Sub2_3.method5445();
		this.aClass15_Sub2_3.method5466();
		this.aClass15_Sub2_3.method5442();
		this.aClass15_Sub2_3.method5444(1, Static457.aClass85_4);
		this.aClass15_Sub2_3.method5488(Static457.aClass85_4, 1);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method7081(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class93 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class255_Sub3 local8 = this.aClass15_Sub2_3.method5431();
		@Pc(13) Class255_Sub3 local13 = this.aClass15_Sub2_3.method5465();
		@Pc(16) Class93_Sub3 local16 = (Class93_Sub3) arg6;
		@Pc(19) Interface14 local19 = local16.anInterface14_4;
		this.anInterface14_1.method8222(Static247.aClass130_8);
		this.aClass15_Sub2_3.method5483();
		this.aClass15_Sub2_3.method5414(this.anInterface14_1);
		this.aClass15_Sub2_3.method5460(1);
		this.aClass15_Sub2_3.method5372(1);
		if (this.aBoolean97) {
			@Pc(55) float local55 = (float) this.anInt1194 / (float) this.AA();
			@Pc(63) float local63 = (float) this.anInt1201 / (float) this.a();
			local8.method8027(1.0F, 0.0F, 0.0F, 0.0F, local55 * (arg2 - arg0), 0.0F, (arg3 - arg1) * local55, local63 * (arg4 - arg0), (arg5 - arg1) * local63);
			local8.method8029(local63 * ((float) this.anInt1188 + arg1), 0.0F, ((float) this.anInt1202 + arg0) * local55);
		} else {
			local8.method8027(1.0F, 0.0F, 0.0F, 0.0F, arg2 - arg0, 0.0F, arg3 - arg1, arg4 - arg0, arg5 - arg1);
			local8.method8029(arg1, 0.0F, arg0);
		}
		local13.method8042(1.0F, this.anInterface14_1.method8242((float) this.anInt1201), this.anInterface14_1.method8239((float) this.anInt1194));
		this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
		this.aClass15_Sub2_3.method5410(1);
		this.aClass15_Sub2_3.method5414(local19);
		this.aClass15_Sub2_3.method5430(Static65.aClass120_1, Static490.aClass120_5);
		this.aClass15_Sub2_3.method5444(0, Static457.aClass85_4);
		@Pc(191) Class255_Sub3 local191 = this.aClass15_Sub2_3.method5465();
		local191.la(local8);
		local191.G(-arg7, -arg8, 0);
		local191.method8038(local19.method8239(1.0F), 1.0F, local19.method8242(1.0F));
		this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
		this.aClass15_Sub2_3.method5445();
		this.aClass15_Sub2_3.method5466();
		this.aClass15_Sub2_3.method5442();
		this.aClass15_Sub2_3.method5444(0, Static159.aClass85_1);
		this.aClass15_Sub2_3.method5430(Static65.aClass120_1, Static65.aClass120_1);
		this.aClass15_Sub2_3.method5414(null);
		this.aClass15_Sub2_3.method5410(0);
		this.aClass15_Sub2_3.method5442();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIII[III)V")
	private void method1240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface14_1.method8237(arg4, arg1, arg2, arg3, arg0, arg5);
	}

	@OriginalMember(owner = "client!bv", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt1202 + this.anInt1194 + this.anInt1187;
	}

	@OriginalMember(owner = "client!bv", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class255_Sub3 local8 = this.aClass15_Sub2_3.method5431();
		@Pc(13) Class255_Sub3 local13 = this.aClass15_Sub2_3.method5465();
		this.anInterface14_1.method8222(this.aBoolean99 || this.aBoolean96 ? Static39.aClass130_7 : Static247.aClass130_8);
		this.aClass15_Sub2_3.method5483();
		this.aClass15_Sub2_3.method5414(this.anInterface14_1);
		this.aClass15_Sub2_3.method5460(arg8);
		this.aClass15_Sub2_3.method5372(arg6);
		this.aClass15_Sub2_3.method5444(1, Static531.aClass85_5);
		this.aClass15_Sub2_3.method5488(Static531.aClass85_5, 1);
		this.aClass15_Sub2_3.method5487(arg7);
		if (this.aBoolean97) {
			@Pc(70) float local70 = (float) this.AA();
			@Pc(74) float local74 = (float) this.a();
			@Pc(80) float local80 = (arg2 - arg0) / local70;
			@Pc(87) float local87 = (arg3 - arg1) / local70;
			@Pc(94) float local94 = (arg4 - arg0) / local74;
			@Pc(101) float local101 = (arg5 - arg1) / local74;
			@Pc(107) float local107 = local94 * (float) this.anInt1188;
			@Pc(113) float local113 = local101 * (float) this.anInt1188;
			@Pc(119) float local119 = local80 * (float) this.anInt1202;
			@Pc(125) float local125 = (float) this.anInt1202 * local87;
			@Pc(132) float local132 = -local80 * (float) this.anInt1187;
			@Pc(139) float local139 = -local87 * (float) this.anInt1187;
			@Pc(146) float local146 = (float) this.anInt1205 * -local94;
			@Pc(153) float local153 = (float) this.anInt1205 * -local101;
			arg1 = local125 + arg1 + local113;
			arg0 = local119 + arg0 + local107;
			arg3 = local139 + arg3 + local113;
			arg2 = local132 + arg2 + local107;
			arg4 = local146 + arg4 + local119;
			arg5 = arg5 + local125 + local153;
		}
		local8.method8027(1.0F, 0.0F, 0.0F, 0.0F, arg2 - arg0, 0.0F, arg3 - arg1, arg4 - arg0, arg5 - arg1);
		local8.method8029(arg1, 0.0F, arg0);
		local13.method8042(1.0F, this.anInterface14_1.method8242((float) this.anInt1201), this.anInterface14_1.method8239((float) this.anInt1194));
		this.aClass15_Sub2_3.method5485(Static317.aClass359_13);
		this.aClass15_Sub2_3.method5445();
		this.aClass15_Sub2_3.method5466();
		this.aClass15_Sub2_3.method5442();
		this.aClass15_Sub2_3.method5444(1, Static457.aClass85_4);
		this.aClass15_Sub2_3.method5488(Static457.aClass85_4, 1);
	}

	@OriginalMember(owner = "client!bv", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.anInt1194;
	}

	@OriginalMember(owner = "client!bv", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass15_Sub2_3.KA(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method1240(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}
}
