import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class178_Sub3 extends Class178 {

	@OriginalMember(owner = "client!no", name = "t", descriptor = "I")
	private int anInt6874 = 0;

	@OriginalMember(owner = "client!no", name = "w", descriptor = "I")
	private int anInt6870 = 0;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "I")
	private int anInt6881 = 0;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "I")
	private int anInt6884 = 0;

	@OriginalMember(owner = "client!no", name = "B", descriptor = "Z")
	private boolean aBoolean457 = false;

	@OriginalMember(owner = "client!no", name = "h", descriptor = "Lclient!jca;")
	private final Class22_Sub2 aClass22_Sub2_13;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "I")
	private final int anInt6868;

	@OriginalMember(owner = "client!no", name = "y", descriptor = "I")
	private final int anInt6886;

	@OriginalMember(owner = "client!no", name = "r", descriptor = "Lclient!pt;")
	private final Interface16 anInterface16_2;

	@OriginalMember(owner = "client!no", name = "E", descriptor = "Z")
	private final boolean aBoolean454;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "Z")
	private final boolean aBoolean455;

	@OriginalMember(owner = "client!no", name = "D", descriptor = "Z")
	private final boolean aBoolean456;

	@OriginalMember(owner = "client!no", name = "u", descriptor = "Z")
	private final boolean aBoolean453;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!jca;IIZ)V")
	public Class178_Sub3(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass22_Sub2_13 = arg0;
		this.anInt6868 = arg1;
		this.anInt6886 = arg2;
		this.anInterface16_2 = arg0.method8857(Static259.aClass167_7, arg1, arg2, arg3 ? Static646.aClass335_14 : Static661.aClass335_16);
		this.anInterface16_2.method8248(true, true);
		this.aBoolean454 = arg1 != this.anInterface16_2.method8246();
		this.aBoolean455 = arg2 != this.anInterface16_2.method8245();
		this.aBoolean456 = !this.aBoolean454 && this.anInterface16_2.method8244();
		this.aBoolean453 = !this.aBoolean455 && this.anInterface16_2.method8244();
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!jca;II[III)V")
	public Class178_Sub3(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6868 = arg1;
		this.aClass22_Sub2_13 = arg0;
		this.anInt6886 = arg2;
		this.anInterface16_2 = arg0.method8879(arg5, arg3, arg4, arg2, false, arg1);
		this.anInterface16_2.method8248(true, true);
		this.aBoolean454 = this.anInterface16_2.method8246() != arg1;
		this.aBoolean455 = arg2 != this.anInterface16_2.method8245();
		this.aBoolean456 = !this.aBoolean454 && this.anInterface16_2.method8244();
		this.aBoolean453 = !this.aBoolean455 && this.anInterface16_2.method8244();
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "()I")
	@Override
	public int method7636() {
		return this.anInt6868;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method7629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class58_Sub2 local10 = this.aClass22_Sub2_13.method8965();
		@Pc(15) Class58_Sub2 local15 = this.aClass22_Sub2_13.method8922();
		this.anInterface16_2.method9229(Static267.aClass280_5);
		this.aClass22_Sub2_13.method8943();
		this.aClass22_Sub2_13.method8976(this.anInterface16_2);
		this.aClass22_Sub2_13.method8978(arg6);
		this.aClass22_Sub2_13.method8853(arg4);
		this.aClass22_Sub2_13.method8962(Static547.aClass392_3, 1);
		this.aClass22_Sub2_13.method8897(Static547.aClass392_3, 1);
		this.aClass22_Sub2_13.method8930(arg5);
		@Pc(78) boolean local78 = this.aBoolean453 && this.anInt6884 == 0 && this.anInt6881 == 0;
		@Pc(96) boolean local96 = this.aBoolean456 && this.anInt6870 == 0 && this.anInt6874 == 0;
		if (local96 & local78) {
			local15.method6099(this.anInterface16_2.method8250((float) arg3), this.anInterface16_2.method8247((float) arg2), 1.0F);
			local10.method6099((float) arg3, (float) arg2, 0.0F);
			local10.method9509(arg0, arg1, 0);
			this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
			this.aClass22_Sub2_13.method8926();
			this.aClass22_Sub2_13.method8951();
		} else {
			@Pc(112) int local112;
			@Pc(115) int local115;
			@Pc(142) int local142;
			@Pc(147) int local147;
			@Pc(194) int local194;
			if (local96) {
				local112 = arg1 + arg3;
				local115 = this.method7632();
				local15.method6099(this.anInterface16_2.method8250((float) this.anInt6886), this.anInterface16_2.method8247((float) arg2), 1.0F);
				this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
				local142 = this.anInt6884 + arg1;
				local147 = local142 + this.anInt6886;
				while (local112 >= local147) {
					local10.method6099((float) this.anInt6886, (float) arg2, 0.0F);
					local10.method9509(arg0, local142, 0);
					this.aClass22_Sub2_13.method8926();
					local142 += local115;
					local147 += local115;
					this.aClass22_Sub2_13.method8951();
				}
				if (local112 > local142) {
					local194 = local112 - local142;
					local15.method6099(this.anInterface16_2.method8250((float) local194), this.anInterface16_2.method8247((float) arg2), 1.0F);
					this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
					local10.method6099((float) local194, (float) arg2, 0.0F);
					local10.method9509(arg0, local142, 0);
					this.aClass22_Sub2_13.method8926();
					this.aClass22_Sub2_13.method8951();
				}
			} else if (local78) {
				local112 = arg0 + arg2;
				local115 = this.method7627();
				local15.method6099(this.anInterface16_2.method8250((float) arg3), this.anInterface16_2.method8247((float) this.anInt6868), 1.0F);
				this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
				local142 = arg0 + this.anInt6870;
				for (local147 = this.anInt6868 + local142; local147 <= local112; local147 += local115) {
					local10.method6099((float) arg3, (float) this.anInt6868, 0.0F);
					local10.method9509(local142, arg1, 0);
					this.aClass22_Sub2_13.method8926();
					local142 += local115;
					this.aClass22_Sub2_13.method8951();
				}
				if (local142 < local112) {
					local194 = local112 - local142;
					local15.method6099(this.anInterface16_2.method8250((float) arg3), this.anInterface16_2.method8247((float) local194), 1.0F);
					this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
					local10.method6099((float) arg3, (float) local194, 0.0F);
					local10.method9509(local142, arg1, 0);
					this.aClass22_Sub2_13.method8926();
					this.aClass22_Sub2_13.method8951();
				}
			} else {
				local112 = arg1 + arg3;
				local115 = arg2 + arg0;
				local142 = this.method7627();
				local147 = this.method7632();
				local194 = arg1 + this.anInt6884;
				@Pc(264) int local264 = local194 + this.anInt6886;
				@Pc(296) int local296;
				@Pc(301) int local301;
				@Pc(352) int local352;
				while (local112 >= local264) {
					local15.method6099(this.anInterface16_2.method8250((float) this.anInt6886), this.anInterface16_2.method8247((float) this.anInt6868), 1.0F);
					this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
					local296 = this.anInt6870 + arg0;
					for (local301 = this.anInt6868 + local296; local301 <= local115; local301 += local142) {
						local10.method6099((float) this.anInt6886, (float) this.anInt6868, 0.0F);
						local10.method9509(local296, local194, 0);
						this.aClass22_Sub2_13.method8926();
						this.aClass22_Sub2_13.method8951();
						local296 += local142;
					}
					if (local296 < local115) {
						local352 = local115 - local296;
						local15.method6099(this.anInterface16_2.method8250((float) this.anInt6886), this.anInterface16_2.method8247((float) local352), 1.0F);
						this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
						local10.method6099((float) this.anInt6886, (float) local352, 0.0F);
						local10.method9509(local296, local194, 0);
						this.aClass22_Sub2_13.method8926();
						this.aClass22_Sub2_13.method8951();
					}
					local264 += local147;
					local194 += local147;
				}
				if (local112 > local194) {
					local296 = local112 - local194;
					local15.method6099(this.anInterface16_2.method8250((float) local296), this.anInterface16_2.method8247((float) this.anInt6868), 1.0F);
					this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
					local301 = arg0 + this.anInt6870;
					local352 = this.anInt6868 + local301;
					while (local115 >= local352) {
						local10.method6099((float) local296, (float) this.anInt6868, 0.0F);
						local10.method9509(local301, local194, 0);
						this.aClass22_Sub2_13.method8926();
						local352 += local142;
						local301 += local142;
						this.aClass22_Sub2_13.method8951();
					}
					if (local115 > local301) {
						@Pc(507) int local507 = local115 - local301;
						local15.method6099(this.anInterface16_2.method8250((float) local296), this.anInterface16_2.method8247((float) local507), 1.0F);
						this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
						local10.method6099((float) local296, (float) local507, 0.0F);
						local10.method9509(local301, local194, 0);
						this.aClass22_Sub2_13.method8926();
						this.aClass22_Sub2_13.method8951();
					}
				}
			}
		}
		this.aClass22_Sub2_13.method8873();
		this.aClass22_Sub2_13.method8962(Static671.aClass392_4, 1);
		this.aClass22_Sub2_13.method8897(Static671.aClass392_4, 1);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7614(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class58_Sub2 local8 = this.aClass22_Sub2_13.method8965();
		@Pc(13) Class58_Sub2 local13 = this.aClass22_Sub2_13.method8922();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface16 local19 = local16.anInterface16_5;
		this.anInterface16_2.method9229(this.aBoolean454 || this.aBoolean455 || !(true & true) ? Static267.aClass280_5 : Static131.aClass280_4);
		this.aClass22_Sub2_13.method8943();
		this.aClass22_Sub2_13.method8976(this.anInterface16_2);
		this.aClass22_Sub2_13.method8978(1);
		this.aClass22_Sub2_13.method8853(1);
		if (this.aBoolean457) {
			@Pc(103) float local103 = (float) this.anInt6868 / (float) this.method7627();
			@Pc(111) float local111 = (float) this.anInt6886 / (float) this.method7632();
			local8.method6113(0.0F, local111 * (arg4 - arg0), 1.0F, (arg5 - arg1) * local111, 0.0F, (arg3 - arg1) * local103, local103 * (arg2 - arg0), 0.0F, 0.0F);
			local8.method6094(local103 * ((float) this.anInt6870 + arg0), ((float) this.anInt6884 + arg1) * local111, 0.0F);
		} else {
			local8.method6113(0.0F, arg4 - arg0, 1.0F, arg5 - arg1, 0.0F, arg3 - arg1, arg2 - arg0, 0.0F, 0.0F);
			local8.method6094(arg0, arg1, 0.0F);
		}
		local13.method6099(this.anInterface16_2.method8250((float) this.anInt6886), this.anInterface16_2.method8247((float) this.anInt6868), 1.0F);
		this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
		this.aClass22_Sub2_13.method8896(1);
		this.aClass22_Sub2_13.method8976(local19);
		this.aClass22_Sub2_13.method8914(Static503.aClass372_4, Static468.aClass372_3);
		this.aClass22_Sub2_13.method8962(Static671.aClass392_4, 0);
		@Pc(209) Class58_Sub2 local209 = this.aClass22_Sub2_13.method8922();
		local209.method9516(local8);
		local209.method9509(-arg7, -arg8, 0);
		local209.method6102(local19.method8250(1.0F), local19.method8247(1.0F), 1.0F);
		this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
		this.aClass22_Sub2_13.method8926();
		this.aClass22_Sub2_13.method8951();
		this.aClass22_Sub2_13.method8873();
		this.aClass22_Sub2_13.method8962(Static358.aClass392_1, 0);
		this.aClass22_Sub2_13.method8914(Static503.aClass372_4, Static503.aClass372_4);
		this.aClass22_Sub2_13.method8976((Interface21) null);
		this.aClass22_Sub2_13.method8896(0);
		this.aClass22_Sub2_13.method8873();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class58_Sub2 local8 = this.aClass22_Sub2_13.method8965();
		@Pc(13) Class58_Sub2 local13 = this.aClass22_Sub2_13.method8922();
		this.anInterface16_2.method9229(this.aBoolean454 || this.aBoolean455 || (0x1 & 0x1) == 0 ? Static267.aClass280_5 : Static131.aClass280_4);
		this.aClass22_Sub2_13.method8943();
		this.aClass22_Sub2_13.method8976(this.anInterface16_2);
		this.aClass22_Sub2_13.method8978(arg6);
		this.aClass22_Sub2_13.method8853(arg4);
		this.aClass22_Sub2_13.method8962(Static547.aClass392_3, 1);
		this.aClass22_Sub2_13.method8897(Static547.aClass392_3, 1);
		this.aClass22_Sub2_13.method8930(arg5);
		local13.method6099(this.anInterface16_2.method8250((float) this.anInt6886), this.anInterface16_2.method8247((float) this.anInt6868), 1.0F);
		if (this.aBoolean457) {
			arg2 = this.anInt6868 * arg2 / this.method7627();
			arg3 = arg3 * this.anInt6886 / this.method7632();
			arg1 += this.anInt6884 * arg3 / this.anInt6886;
			arg0 += arg2 * this.anInt6870 / this.anInt6868;
		}
		local8.method6099((float) arg3, (float) arg2, 0.0F);
		local8.method9509(arg0, arg1, 0);
		this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
		this.aClass22_Sub2_13.method8926();
		this.aClass22_Sub2_13.method8951();
		this.aClass22_Sub2_13.method8873();
		this.aClass22_Sub2_13.method8962(Static671.aClass392_4, 1);
		this.aClass22_Sub2_13.method8897(Static671.aClass392_4, 1);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt6870;
		@Pc(16) int local16 = arg1 + this.anInt6884;
		@Pc(19) Interface16 local19 = local6.anInterface16_5;
		this.anInterface16_2.method9229(Static267.aClass280_5);
		this.aClass22_Sub2_13.method8943();
		this.aClass22_Sub2_13.method8976(this.anInterface16_2);
		this.aClass22_Sub2_13.method8978(1);
		this.aClass22_Sub2_13.method8853(1);
		@Pc(49) Class58_Sub2 local49 = this.aClass22_Sub2_13.method8965();
		local49.method6099((float) this.anInt6886, (float) this.anInt6868, 0.0F);
		local49.method9509(local11, local16, 0);
		this.aClass22_Sub2_13.method8926();
		@Pc(73) Class58_Sub2 local73 = this.aClass22_Sub2_13.method8922();
		local73.method6099(this.anInterface16_2.method8250((float) this.anInt6886), this.anInterface16_2.method8247((float) this.anInt6868), 1.0F);
		this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
		this.aClass22_Sub2_13.method8896(1);
		this.aClass22_Sub2_13.method8976(local19);
		this.aClass22_Sub2_13.method8914(Static503.aClass372_4, Static468.aClass372_3);
		this.aClass22_Sub2_13.method8962(Static671.aClass392_4, 0);
		@Pc(123) Class58_Sub2 local123 = this.aClass22_Sub2_13.method8922();
		local123.method6099(local19.method8250((float) this.anInt6886), local19.method8247((float) this.anInt6868), 1.0F);
		local123.method6094(local19.method8247((float) (local11 - arg3)), local19.method8250((float) (local16 - arg4)), 0.0F);
		this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
		this.aClass22_Sub2_13.method8951();
		this.aClass22_Sub2_13.method8873();
		this.aClass22_Sub2_13.method8962(Static358.aClass392_1, 0);
		this.aClass22_Sub2_13.method8914(Static503.aClass372_4, Static503.aClass372_4);
		this.aClass22_Sub2_13.method8976((Interface21) null);
		this.aClass22_Sub2_13.method8896(0);
		this.aClass22_Sub2_13.method8873();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "()I")
	@Override
	public int method7627() {
		return this.anInt6874 + this.anInt6868 + this.anInt6870;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(IIII)V")
	@Override
	public void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6870 = arg0;
		this.anInt6881 = arg3;
		this.anInt6884 = arg1;
		this.anInt6874 = arg2;
		this.aBoolean457 = this.anInt6870 != 0 || this.anInt6884 != 0 || this.anInt6874 != 0 || this.anInt6881 != 0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
	@Override
	public void method7620() {
		@Pc(15) int[] local15 = this.aClass22_Sub2_13.na(0, 0, this.anInt6868, this.anInt6886);
		@Pc(22) int[] local22 = new int[this.anInt6886 * this.anInt6868];
		this.anInterface16_2.method8249(local22, this.anInt6886, this.anInt6868);
		for (@Pc(118) int local118 = 0; local118 < this.anInt6886; local118++) {
			@Pc(125) int local125 = this.anInt6868 * local118;
			for (@Pc(127) int local127 = 0; local127 < this.anInt6868; local127++) {
				local22[local125 + local127] = (local15[local127 + local125] == 0 ? 0 : -16777216) | local22[local125 + local127] & 0xFFFFFF;
			}
		}
		this.method5962(0, 0, this.anInt6868, this.anInt6886, local22, this.anInt6868);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7623(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class58_Sub2 local8 = this.aClass22_Sub2_13.method8965();
		@Pc(13) Class58_Sub2 local13 = this.aClass22_Sub2_13.method8922();
		this.anInterface16_2.method9229(this.aBoolean454 || this.aBoolean455 || !(true & true) ? Static267.aClass280_5 : Static131.aClass280_4);
		this.aClass22_Sub2_13.method8943();
		this.aClass22_Sub2_13.method8976(this.anInterface16_2);
		this.aClass22_Sub2_13.method8978(1);
		this.aClass22_Sub2_13.method8853(arg6);
		this.aClass22_Sub2_13.method8962(Static547.aClass392_3, 1);
		this.aClass22_Sub2_13.method8897(Static547.aClass392_3, 1);
		this.aClass22_Sub2_13.method8930(arg7);
		if (this.aBoolean457) {
			@Pc(79) float local79 = (float) this.method7627();
			@Pc(83) float local83 = (float) this.method7632();
			@Pc(90) float local90 = (arg2 - arg0) / local79;
			@Pc(97) float local97 = (arg3 - arg1) / local79;
			@Pc(103) float local103 = (arg4 - arg0) / local83;
			@Pc(110) float local110 = (arg5 - arg1) / local83;
			@Pc(116) float local116 = local103 * (float) this.anInt6884;
			@Pc(122) float local122 = local110 * (float) this.anInt6884;
			@Pc(128) float local128 = local90 * (float) this.anInt6870;
			@Pc(134) float local134 = local97 * (float) this.anInt6870;
			@Pc(141) float local141 = -local90 * (float) this.anInt6874;
			@Pc(148) float local148 = (float) this.anInt6874 * -local97;
			@Pc(155) float local155 = (float) this.anInt6881 * -local103;
			arg2 = arg2 + local141 + local116;
			arg4 = local155 + arg4 + local128;
			arg0 = local116 + arg0 + local128;
			arg3 = local122 + local148 + arg3;
			@Pc(186) float local186 = -local110 * (float) this.anInt6881;
			arg1 = local122 + local134 + arg1;
			arg5 = arg5 + local134 + local186;
		}
		local8.method6113(0.0F, arg4 - arg0, 1.0F, arg5 - arg1, 0.0F, arg3 - arg1, -arg0 + arg2, 0.0F, 0.0F);
		local8.method6094(arg0, arg1, 0.0F);
		local13.method6099(this.anInterface16_2.method8250((float) this.anInt6886), this.anInterface16_2.method8247((float) this.anInt6868), 1.0F);
		this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
		this.aClass22_Sub2_13.method8926();
		this.aClass22_Sub2_13.method8951();
		this.aClass22_Sub2_13.method8873();
		this.aClass22_Sub2_13.method8962(Static671.aClass392_4, 1);
		this.aClass22_Sub2_13.method8897(Static671.aClass392_4, 1);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIII[III)V")
	private void method5962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface16_2.method8242(arg3, arg0, arg2, arg4, arg1, arg5);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "()I")
	@Override
	public int method7618() {
		return this.anInt6886;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([I)V")
	@Override
	public void method7625(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt6874;
		arg0[0] = this.anInt6870;
		arg0[3] = this.anInt6881;
		arg0[1] = this.anInt6884;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass22_Sub2_13.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method5962(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class58_Sub2 local8 = this.aClass22_Sub2_13.method8965();
		@Pc(13) Class58_Sub2 local13 = this.aClass22_Sub2_13.method8922();
		@Pc(18) int local18 = arg0 + this.anInt6870;
		@Pc(23) int local23 = arg1 + this.anInt6884;
		this.anInterface16_2.method9229(Static267.aClass280_5);
		this.aClass22_Sub2_13.method8943();
		this.aClass22_Sub2_13.method8976(this.anInterface16_2);
		this.aClass22_Sub2_13.method8978(arg4);
		this.aClass22_Sub2_13.method8853(arg2);
		this.aClass22_Sub2_13.method8962(Static547.aClass392_3, 1);
		this.aClass22_Sub2_13.method8897(Static547.aClass392_3, 1);
		this.aClass22_Sub2_13.method8930(arg3);
		local8.method6099((float) this.anInt6886, (float) this.anInt6868, 0.0F);
		local8.method9509(local18, local23, 0);
		local13.method6099(this.anInterface16_2.method8250((float) this.anInt6886), this.anInterface16_2.method8247((float) this.anInt6868), 1.0F);
		this.aClass22_Sub2_13.method8924(Static606.aClass222_6);
		this.aClass22_Sub2_13.method8926();
		this.aClass22_Sub2_13.method8951();
		this.aClass22_Sub2_13.method8873();
		this.aClass22_Sub2_13.method8962(Static671.aClass392_4, 1);
		this.aClass22_Sub2_13.method8897(Static671.aClass392_4, 1);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "()I")
	@Override
	public int method7632() {
		return this.anInt6886 + this.anInt6884 + this.anInt6881;
	}
}
