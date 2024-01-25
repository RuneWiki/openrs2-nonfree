import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class155_Sub2 extends Class155 {

	@OriginalMember(owner = "client!la", name = "F", descriptor = "I")
	private int anInt5451 = 0;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "I")
	private int anInt5460 = 0;

	@OriginalMember(owner = "client!la", name = "H", descriptor = "I")
	private int anInt5450 = 0;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "I")
	private int anInt5463 = 0;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Z")
	private boolean aBoolean358 = false;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!gca;")
	private final Class100_Sub1 aClass100_Sub1_14;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	private final int anInt5459;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "I")
	private final int anInt5453;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "Lclient!ah;")
	private final Interface2 anInterface2_2;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Z")
	private final boolean aBoolean359;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Z")
	private final boolean aBoolean360;

	@OriginalMember(owner = "client!la", name = "G", descriptor = "Z")
	private final boolean aBoolean356;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Z")
	private final boolean aBoolean357;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!gca;IIZ)V")
	public Class155_Sub2(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass100_Sub1_14 = arg0;
		this.anInt5459 = arg2;
		this.anInt5453 = arg1;
		this.anInterface2_2 = arg0.method7946(arg1, Static104.aClass86_8, arg2, arg3 ? Static171.aClass358_12 : Static221.aClass358_8);
		this.anInterface2_2.method3687(true, true);
		this.aBoolean359 = arg1 != this.anInterface2_2.method3680();
		this.aBoolean360 = this.anInterface2_2.method3688() != arg2;
		this.aBoolean356 = !this.aBoolean359 && this.anInterface2_2.method3682();
		this.aBoolean357 = !this.aBoolean360 && this.anInterface2_2.method3682();
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!gca;II[III)V")
	public Class155_Sub2(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5453 = arg1;
		this.anInt5459 = arg2;
		this.aClass100_Sub1_14 = arg0;
		this.anInterface2_2 = arg0.method7991(arg4, arg2, false, arg5, arg3, arg1);
		this.anInterface2_2.method3687(true, true);
		this.aBoolean359 = arg1 != this.anInterface2_2.method3680();
		this.aBoolean360 = arg2 != this.anInterface2_2.method3688();
		this.aBoolean356 = !this.aBoolean359 && this.anInterface2_2.method3682();
		this.aBoolean357 = !this.aBoolean360 && this.anInterface2_2.method3682();
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IIII)V")
	@Override
	public void method7190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5460 = arg1;
		this.anInt5463 = arg2;
		this.anInt5450 = arg0;
		this.anInt5451 = arg3;
		this.aBoolean358 = this.anInt5450 != 0 || this.anInt5460 != 0 || this.anInt5463 != 0 || this.anInt5451 != 0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7191(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class10_Sub2 local8 = this.aClass100_Sub1_14.method7956();
		@Pc(13) Class10_Sub2 local13 = this.aClass100_Sub1_14.method7877();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface2 local19 = local16.anInterface2_5;
		this.anInterface2_2.method8896(this.aBoolean359 || this.aBoolean360 || !(true & true) ? Static78.aClass328_4 : Static464.aClass328_10);
		this.aClass100_Sub1_14.method7983();
		this.aClass100_Sub1_14.method7923(this.anInterface2_2);
		this.aClass100_Sub1_14.method7957(1);
		this.aClass100_Sub1_14.method7962(1);
		if (this.aBoolean358) {
			@Pc(102) float local102 = (float) this.anInt5453 / (float) this.method7206();
			@Pc(110) float local110 = (float) this.anInt5459 / (float) this.method7209();
			local8.method1705(0.0F, local102 * (arg2 - arg0), 1.0F, 0.0F, local110 * (arg5 - arg1), 0.0F, local110 * (arg4 - arg0), 0.0F, (arg3 - arg1) * local102);
			local8.method1695(0.0F, local110 * ((float) this.anInt5460 + arg1), ((float) this.anInt5450 + arg0) * local102);
		} else {
			local8.method1705(0.0F, arg2 - arg0, 1.0F, 0.0F, arg5 - arg1, 0.0F, arg4 - arg0, 0.0F, arg3 - arg1);
			local8.method1695(0.0F, arg1, arg0);
		}
		local13.method1706(this.anInterface2_2.method3685((float) this.anInt5459), this.anInterface2_2.method3681((float) this.anInt5453), 1.0F);
		this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
		this.aClass100_Sub1_14.method7941(1);
		this.aClass100_Sub1_14.method7923(local19);
		this.aClass100_Sub1_14.method7904(Static653.aClass94_5, Static164.aClass94_1);
		this.aClass100_Sub1_14.method7970(Static237.aClass93_3, 0);
		@Pc(208) Class10_Sub2 local208 = this.aClass100_Sub1_14.method7877();
		local208.method4212(local8);
		local208.method4225(-arg7, -arg8, 0);
		local208.method1701(local19.method3685(1.0F), local19.method3681(1.0F), 1.0F);
		this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
		this.aClass100_Sub1_14.method7992();
		this.aClass100_Sub1_14.method7972();
		this.aClass100_Sub1_14.method7930();
		this.aClass100_Sub1_14.method7970(Static94.aClass93_2, 0);
		this.aClass100_Sub1_14.method7904(Static653.aClass94_5, Static653.aClass94_5);
		this.aClass100_Sub1_14.method7923((Interface19) null);
		this.aClass100_Sub1_14.method7941(0);
		this.aClass100_Sub1_14.method7930();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7207(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class10_Sub2 local8 = this.aClass100_Sub1_14.method7956();
		@Pc(13) Class10_Sub2 local13 = this.aClass100_Sub1_14.method7877();
		this.anInterface2_2.method8896(this.aBoolean359 || this.aBoolean360 || (0x1 & 0x1) == 0 ? Static78.aClass328_4 : Static464.aClass328_10);
		this.aClass100_Sub1_14.method7983();
		this.aClass100_Sub1_14.method7923(this.anInterface2_2);
		this.aClass100_Sub1_14.method7957(1);
		this.aClass100_Sub1_14.method7962(arg6);
		this.aClass100_Sub1_14.method7970(Static520.aClass93_4, 1);
		this.aClass100_Sub1_14.method7947(Static520.aClass93_4, 1);
		this.aClass100_Sub1_14.method7873(arg7);
		if (this.aBoolean358) {
			@Pc(82) float local82 = (float) this.method7206();
			@Pc(86) float local86 = (float) this.method7209();
			@Pc(92) float local92 = (arg2 - arg0) / local82;
			@Pc(99) float local99 = (arg3 - arg1) / local82;
			@Pc(105) float local105 = (arg4 - arg0) / local86;
			@Pc(111) float local111 = (arg5 - arg1) / local86;
			@Pc(117) float local117 = (float) this.anInt5460 * local105;
			@Pc(123) float local123 = local111 * (float) this.anInt5460;
			@Pc(129) float local129 = local92 * (float) this.anInt5450;
			@Pc(135) float local135 = (float) this.anInt5450 * local99;
			@Pc(142) float local142 = (float) this.anInt5463 * -local92;
			@Pc(149) float local149 = -local99 * (float) this.anInt5463;
			@Pc(156) float local156 = (float) this.anInt5451 * -local105;
			arg4 = local156 + arg4 + local129;
			arg3 = local123 + local149 + arg3;
			arg2 = local117 + arg2 + local142;
			arg0 = arg0 + local129 + local117;
			arg1 = local135 + arg1 + local123;
			@Pc(193) float local193 = (float) this.anInt5451 * -local111;
			arg5 = local193 + arg5 + local135;
		}
		local8.method1705(0.0F, arg2 - arg0, 1.0F, 0.0F, arg5 - arg1, 0.0F, arg4 - arg0, 0.0F, arg3 - arg1);
		local8.method1695(0.0F, arg1, arg0);
		local13.method1706(this.anInterface2_2.method3685((float) this.anInt5459), this.anInterface2_2.method3681((float) this.anInt5453), 1.0F);
		this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
		this.aClass100_Sub1_14.method7992();
		this.aClass100_Sub1_14.method7972();
		this.aClass100_Sub1_14.method7930();
		this.aClass100_Sub1_14.method7970(Static237.aClass93_3, 1);
		this.aClass100_Sub1_14.method7947(Static237.aClass93_3, 1);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
	@Override
	public int method7213() {
		return this.anInt5453;
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "()I")
	@Override
	public int method7209() {
		return this.anInt5451 + this.anInt5459 + this.anInt5460;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "()I")
	@Override
	public int method7198() {
		return this.anInt5459;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([I)V")
	@Override
	public void method7208(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt5451;
		arg0[0] = this.anInt5450;
		arg0[1] = this.anInt5460;
		arg0[2] = this.anInt5463;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	@Override
	public void method7212(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass100_Sub1_14.na(0, 0, this.anInt5453, this.anInt5459);
		@Pc(22) int[] local22 = new int[this.anInt5453 * this.anInt5459];
		this.anInterface2_2.method3686(local22, this.anInt5459, this.anInt5453);
		@Pc(181) int local181;
		@Pc(188) int local188;
		@Pc(190) int local190;
		if (arg0 == 0) {
			for (local181 = 0; local181 < this.anInt5459; local181++) {
				local188 = local181 * this.anInt5453;
				for (local190 = 0; local190 < this.anInt5453; local190++) {
					local22[local190 + local188] = (local15[local190 + local188] & 0x37FF0000) << 8 | local22[local190 + local188] & 0xFFFFFF;
				}
			}
		} else if (arg0 == 3) {
			for (local181 = 0; local181 < this.anInt5459; local181++) {
				local188 = local181 * this.anInt5453;
				for (local190 = 0; local190 < this.anInt5453; local190++) {
					local22[local188 + local190] = local22[local188 + local190] & 0xFFFFFF | (local15[local190 + local188] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method4904(0, 0, this.anInt5453, this.anInt5459, local22, this.anInt5453);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class10_Sub2 local8 = this.aClass100_Sub1_14.method7956();
		@Pc(13) Class10_Sub2 local13 = this.aClass100_Sub1_14.method7877();
		this.anInterface2_2.method8896(this.aBoolean359 || this.aBoolean360 || !(true & true) ? Static78.aClass328_4 : Static464.aClass328_10);
		this.aClass100_Sub1_14.method7983();
		this.aClass100_Sub1_14.method7923(this.anInterface2_2);
		this.aClass100_Sub1_14.method7957(arg6);
		this.aClass100_Sub1_14.method7962(arg4);
		this.aClass100_Sub1_14.method7970(Static520.aClass93_4, 1);
		this.aClass100_Sub1_14.method7947(Static520.aClass93_4, 1);
		this.aClass100_Sub1_14.method7873(arg5);
		local13.method1706(this.anInterface2_2.method3685((float) this.anInt5459), this.anInterface2_2.method3681((float) this.anInt5453), 1.0F);
		if (this.aBoolean358) {
			arg2 = this.anInt5453 * arg2 / this.method7206();
			arg3 = this.anInt5459 * arg3 / this.method7209();
			arg1 += arg3 * this.anInt5460 / this.anInt5459;
			arg0 += this.anInt5450 * arg2 / this.anInt5453;
		}
		local8.method1706((float) arg3, (float) arg2, 0.0F);
		local8.method4225(arg0, arg1, 0);
		this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
		this.aClass100_Sub1_14.method7992();
		this.aClass100_Sub1_14.method7972();
		this.aClass100_Sub1_14.method7930();
		this.aClass100_Sub1_14.method7970(Static237.aClass93_3, 1);
		this.aClass100_Sub1_14.method7947(Static237.aClass93_3, 1);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class10_Sub2 local10 = this.aClass100_Sub1_14.method7956();
		@Pc(15) Class10_Sub2 local15 = this.aClass100_Sub1_14.method7877();
		this.anInterface2_2.method8896(Static78.aClass328_4);
		this.aClass100_Sub1_14.method7983();
		this.aClass100_Sub1_14.method7923(this.anInterface2_2);
		this.aClass100_Sub1_14.method7957(arg6);
		this.aClass100_Sub1_14.method7962(arg4);
		this.aClass100_Sub1_14.method7970(Static520.aClass93_4, 1);
		this.aClass100_Sub1_14.method7947(Static520.aClass93_4, 1);
		this.aClass100_Sub1_14.method7873(arg5);
		@Pc(78) boolean local78 = this.aBoolean357 && this.anInt5460 == 0 && this.anInt5451 == 0;
		@Pc(99) boolean local99 = this.aBoolean356 && this.anInt5450 == 0 && this.anInt5463 == 0;
		if (local99 & local78) {
			local15.method1706(this.anInterface2_2.method3685((float) arg3), this.anInterface2_2.method3681((float) arg2), 1.0F);
			local10.method1706((float) arg3, (float) arg2, 0.0F);
			local10.method4225(arg0, arg1, 0);
			this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
			this.aClass100_Sub1_14.method7992();
			this.aClass100_Sub1_14.method7972();
		} else {
			@Pc(161) int local161;
			@Pc(165) int local165;
			@Pc(168) int local168;
			@Pc(171) int local171;
			@Pc(176) int local176;
			if (local99) {
				local161 = arg1 + arg3;
				local165 = this.method7209();
				local15.method1706(this.anInterface2_2.method3685((float) this.anInt5459), this.anInterface2_2.method3681((float) arg2), 1.0F);
				this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
				local168 = arg1 + this.anInt5460;
				local171 = local168 + this.anInt5459;
				while (local171 <= local161) {
					local10.method1706((float) this.anInt5459, (float) arg2, 0.0F);
					local10.method4225(arg0, local168, 0);
					this.aClass100_Sub1_14.method7992();
					this.aClass100_Sub1_14.method7972();
					local171 += local165;
					local168 += local165;
				}
				if (local168 < local161) {
					local176 = local161 - local168;
					local15.method1706(this.anInterface2_2.method3685((float) local176), this.anInterface2_2.method3681((float) arg2), 1.0F);
					this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
					local10.method1706((float) local176, (float) arg2, 0.0F);
					local10.method4225(arg0, local168, 0);
					this.aClass100_Sub1_14.method7992();
					this.aClass100_Sub1_14.method7972();
				}
			} else if (local78) {
				local161 = arg0 + arg2;
				local165 = this.method7206();
				local15.method1706(this.anInterface2_2.method3685((float) arg3), this.anInterface2_2.method3681((float) this.anInt5453), 1.0F);
				this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
				local168 = arg0 + this.anInt5450;
				local171 = this.anInt5453 + local168;
				while (local171 <= local161) {
					local10.method1706((float) arg3, (float) this.anInt5453, 0.0F);
					local10.method4225(local168, arg1, 0);
					this.aClass100_Sub1_14.method7992();
					local171 += local165;
					this.aClass100_Sub1_14.method7972();
					local168 += local165;
				}
				if (local168 < local161) {
					local176 = local161 - local168;
					local15.method1706(this.anInterface2_2.method3685((float) arg3), this.anInterface2_2.method3681((float) local176), 1.0F);
					this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
					local10.method1706((float) arg3, (float) local176, 0.0F);
					local10.method4225(local168, arg1, 0);
					this.aClass100_Sub1_14.method7992();
					this.aClass100_Sub1_14.method7972();
				}
			} else {
				local161 = arg1 + arg3;
				local165 = arg0 + arg2;
				local168 = this.method7206();
				local171 = this.method7209();
				local176 = arg1 + this.anInt5460;
				@Pc(182) int local182 = local176 + this.anInt5459;
				@Pc(215) int local215;
				@Pc(220) int local220;
				@Pc(272) int local272;
				while (local182 <= local161) {
					local15.method1706(this.anInterface2_2.method3685((float) this.anInt5459), this.anInterface2_2.method3681((float) this.anInt5453), 1.0F);
					this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
					local215 = arg0 + this.anInt5450;
					local220 = this.anInt5453 + local215;
					while (local165 >= local220) {
						local10.method1706((float) this.anInt5459, (float) this.anInt5453, 0.0F);
						local10.method4225(local215, local176, 0);
						this.aClass100_Sub1_14.method7992();
						local220 += local168;
						local215 += local168;
						this.aClass100_Sub1_14.method7972();
					}
					if (local215 < local165) {
						local272 = local165 - local215;
						local15.method1706(this.anInterface2_2.method3685((float) this.anInt5459), this.anInterface2_2.method3681((float) local272), 1.0F);
						this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
						local10.method1706((float) this.anInt5459, (float) local272, 0.0F);
						local10.method4225(local215, local176, 0);
						this.aClass100_Sub1_14.method7992();
						this.aClass100_Sub1_14.method7972();
					}
					local182 += local171;
					local176 += local171;
				}
				if (local161 > local176) {
					local215 = local161 - local176;
					local15.method1706(this.anInterface2_2.method3685((float) local215), this.anInterface2_2.method3681((float) this.anInt5453), 1.0F);
					this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
					local220 = arg0 + this.anInt5450;
					local272 = local220 + this.anInt5453;
					while (local272 <= local165) {
						local10.method1706((float) local215, (float) this.anInt5453, 0.0F);
						local10.method4225(local220, local176, 0);
						this.aClass100_Sub1_14.method7992();
						this.aClass100_Sub1_14.method7972();
						local272 += local168;
						local220 += local168;
					}
					if (local165 > local220) {
						@Pc(419) int local419 = local165 - local220;
						local15.method1706(this.anInterface2_2.method3685((float) local215), this.anInterface2_2.method3681((float) local419), 1.0F);
						this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
						local10.method1706((float) local215, (float) local419, 0.0F);
						local10.method4225(local220, local176, 0);
						this.aClass100_Sub1_14.method7992();
						this.aClass100_Sub1_14.method7972();
					}
				}
			}
		}
		this.aClass100_Sub1_14.method7930();
		this.aClass100_Sub1_14.method7970(Static237.aClass93_3, 1);
		this.aClass100_Sub1_14.method7947(Static237.aClass93_3, 1);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(11) int local11 = arg0 + this.anInt5450;
		@Pc(16) int local16 = arg1 + this.anInt5460;
		@Pc(19) Interface2 local19 = local6.anInterface2_5;
		this.anInterface2_2.method8896(Static78.aClass328_4);
		this.aClass100_Sub1_14.method7983();
		this.aClass100_Sub1_14.method7923(this.anInterface2_2);
		this.aClass100_Sub1_14.method7957(1);
		this.aClass100_Sub1_14.method7962(1);
		@Pc(49) Class10_Sub2 local49 = this.aClass100_Sub1_14.method7956();
		local49.method1706((float) this.anInt5459, (float) this.anInt5453, 0.0F);
		local49.method4225(local11, local16, 0);
		this.aClass100_Sub1_14.method7992();
		@Pc(73) Class10_Sub2 local73 = this.aClass100_Sub1_14.method7877();
		local73.method1706(this.anInterface2_2.method3685((float) this.anInt5459), this.anInterface2_2.method3681((float) this.anInt5453), 1.0F);
		this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
		this.aClass100_Sub1_14.method7941(1);
		this.aClass100_Sub1_14.method7923(local19);
		this.aClass100_Sub1_14.method7904(Static653.aClass94_5, Static164.aClass94_1);
		this.aClass100_Sub1_14.method7970(Static237.aClass93_3, 0);
		@Pc(123) Class10_Sub2 local123 = this.aClass100_Sub1_14.method7877();
		local123.method1706(local19.method3685((float) this.anInt5459), local19.method3681((float) this.anInt5453), 1.0F);
		local123.method1695(0.0F, local19.method3685((float) (local16 - arg4)), local19.method3681((float) (local11 - arg3)));
		this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
		this.aClass100_Sub1_14.method7972();
		this.aClass100_Sub1_14.method7930();
		this.aClass100_Sub1_14.method7970(Static94.aClass93_2, 0);
		this.aClass100_Sub1_14.method7904(Static653.aClass94_5, Static653.aClass94_5);
		this.aClass100_Sub1_14.method7923((Interface19) null);
		this.aClass100_Sub1_14.method7941(0);
		this.aClass100_Sub1_14.method7930();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class10_Sub2 local8 = this.aClass100_Sub1_14.method7956();
		@Pc(13) Class10_Sub2 local13 = this.aClass100_Sub1_14.method7877();
		@Pc(18) int local18 = arg0 + this.anInt5450;
		@Pc(23) int local23 = arg1 + this.anInt5460;
		this.anInterface2_2.method8896(Static78.aClass328_4);
		this.aClass100_Sub1_14.method7983();
		this.aClass100_Sub1_14.method7923(this.anInterface2_2);
		this.aClass100_Sub1_14.method7957(arg4);
		this.aClass100_Sub1_14.method7962(arg2);
		this.aClass100_Sub1_14.method7970(Static520.aClass93_4, 1);
		this.aClass100_Sub1_14.method7947(Static520.aClass93_4, 1);
		this.aClass100_Sub1_14.method7873(arg3);
		local8.method1706((float) this.anInt5459, (float) this.anInt5453, 0.0F);
		local8.method4225(local18, local23, 0);
		local13.method1706(this.anInterface2_2.method3685((float) this.anInt5459), this.anInterface2_2.method3681((float) this.anInt5453), 1.0F);
		this.aClass100_Sub1_14.method7954(Static475.aClass16_46);
		this.aClass100_Sub1_14.method7992();
		this.aClass100_Sub1_14.method7972();
		this.aClass100_Sub1_14.method7930();
		this.aClass100_Sub1_14.method7970(Static237.aClass93_3, 1);
		this.aClass100_Sub1_14.method7947(Static237.aClass93_3, 1);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass100_Sub1_14.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method4904(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "()I")
	@Override
	public int method7206() {
		return this.anInt5450 + this.anInt5453 + this.anInt5463;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[III)V")
	private void method4904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface2_2.method3684(arg1, arg3, arg4, arg5, arg2, arg0);
	}
}
