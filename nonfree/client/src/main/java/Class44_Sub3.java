import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
	private int anInt4654 = 0;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	private int anInt4659 = 0;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
	private int anInt4661 = 0;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
	private int anInt4658 = 0;

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "Z")
	private boolean aBoolean382 = false;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
	private final int anInt4663;

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "Lclient!rv;")
	private final Class126_Sub2 aClass126_Sub2_10;

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
	private final int anInt4666;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!tr;")
	private final Interface25 anInterface25_4;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Z")
	private final boolean aBoolean380;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Z")
	private final boolean aBoolean381;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Z")
	private final boolean aBoolean379;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "Z")
	private final boolean aBoolean383;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!rv;IIZ)V")
	public Class44_Sub3(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt4663 = arg1;
		this.aClass126_Sub2_10 = arg0;
		this.anInt4666 = arg2;
		this.anInterface25_4 = arg0.method5487(arg2, arg3 ? Static208.aClass281_10 : Static507.aClass281_21, arg1, Static385.aClass247_14);
		this.anInterface25_4.method7630(true, true);
		this.aBoolean380 = this.anInterface25_4.method7623() != arg1;
		this.aBoolean381 = this.anInterface25_4.method7626() != arg2;
		this.aBoolean379 = !this.aBoolean380 && this.anInterface25_4.method7627();
		this.aBoolean383 = !this.aBoolean381 && this.anInterface25_4.method7627();
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!rv;II[III)V")
	public Class44_Sub3(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass126_Sub2_10 = arg0;
		this.anInt4663 = arg1;
		this.anInt4666 = arg2;
		this.anInterface25_4 = arg0.method5476(arg4, arg3, arg1, false, arg5, arg2);
		this.anInterface25_4.method7630(true, true);
		this.aBoolean380 = this.anInterface25_4.method7623() != arg1;
		this.aBoolean381 = arg2 != this.anInterface25_4.method7626();
		this.aBoolean379 = !this.aBoolean380 && this.anInterface25_4.method7627();
		this.aBoolean383 = !this.aBoolean381 && this.anInterface25_4.method7627();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([I)V")
	@Override
	public void method5323(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt4661;
		arg0[0] = this.anInt4659;
		arg0[1] = this.anInt4654;
		arg0[2] = this.anInt4658;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "()I")
	@Override
	public int method5325() {
		return this.anInt4661 + this.anInt4654 + this.anInt4666;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method5324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class117_Sub2 local10 = this.aClass126_Sub2_10.method5472();
		@Pc(15) Class117_Sub2 local15 = this.aClass126_Sub2_10.method5542();
		this.anInterface25_4.method7609(Static86.aClass189_6);
		this.aClass126_Sub2_10.method5551();
		this.aClass126_Sub2_10.method5449(this.anInterface25_4);
		this.aClass126_Sub2_10.method5462(arg6);
		this.aClass126_Sub2_10.method5513(arg4);
		this.aClass126_Sub2_10.method5466(1, Static645.aClass294_5);
		this.aClass126_Sub2_10.method5471(Static645.aClass294_5, 1);
		this.aClass126_Sub2_10.method5496(arg5);
		@Pc(73) boolean local73 = this.aBoolean383 && this.anInt4654 == 0 && this.anInt4661 == 0;
		@Pc(89) boolean local89 = this.aBoolean379 && this.anInt4659 == 0 && this.anInt4658 == 0;
		if (local73 & local89) {
			local15.method3878(this.anInterface25_4.method7631((float) arg3), this.anInterface25_4.method7624((float) arg2), 1.0F);
			local10.method3878((float) arg3, (float) arg2, 0.0F);
			local10.method7247(arg0, arg1, 0);
			this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
			this.aClass126_Sub2_10.method5468();
			this.aClass126_Sub2_10.method5506();
		} else {
			@Pc(100) int local100;
			@Pc(103) int local103;
			@Pc(130) int local130;
			@Pc(135) int local135;
			@Pc(182) int local182;
			if (local89) {
				local100 = arg1 + arg3;
				local103 = this.method5325();
				local15.method3878(this.anInterface25_4.method7631((float) this.anInt4666), this.anInterface25_4.method7624((float) arg2), 1.0F);
				this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
				local130 = arg1 + this.anInt4654;
				local135 = this.anInt4666 + local130;
				while (local135 <= local100) {
					local10.method3878((float) this.anInt4666, (float) arg2, 0.0F);
					local10.method7247(arg0, local130, 0);
					this.aClass126_Sub2_10.method5468();
					local135 += local103;
					this.aClass126_Sub2_10.method5506();
					local130 += local103;
				}
				if (local130 < local100) {
					local182 = local100 - local130;
					local15.method3878(this.anInterface25_4.method7631((float) local182), this.anInterface25_4.method7624((float) arg2), 1.0F);
					this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
					local10.method3878((float) local182, (float) arg2, 0.0F);
					local10.method7247(arg0, local130, 0);
					this.aClass126_Sub2_10.method5468();
					this.aClass126_Sub2_10.method5506();
				}
			} else if (local73) {
				local100 = arg0 + arg2;
				local103 = this.method5313();
				local15.method3878(this.anInterface25_4.method7631((float) arg3), this.anInterface25_4.method7624((float) this.anInt4663), 1.0F);
				this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
				local130 = this.anInt4659 + arg0;
				local135 = this.anInt4663 + local130;
				while (local135 <= local100) {
					local10.method3878((float) arg3, (float) this.anInt4663, 0.0F);
					local10.method7247(local130, arg1, 0);
					this.aClass126_Sub2_10.method5468();
					local130 += local103;
					local135 += local103;
					this.aClass126_Sub2_10.method5506();
				}
				if (local130 < local100) {
					local182 = local100 - local130;
					local15.method3878(this.anInterface25_4.method7631((float) arg3), this.anInterface25_4.method7624((float) local182), 1.0F);
					this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
					local10.method3878((float) arg3, (float) local182, 0.0F);
					local10.method7247(local130, arg1, 0);
					this.aClass126_Sub2_10.method5468();
					this.aClass126_Sub2_10.method5506();
				}
			} else {
				local100 = arg3 + arg1;
				local103 = arg2 + arg0;
				local130 = this.method5313();
				local135 = this.method5325();
				local182 = this.anInt4654 + arg1;
				@Pc(387) int local387 = this.anInt4666 + local182;
				@Pc(417) int local417;
				@Pc(422) int local422;
				@Pc(469) int local469;
				while (local387 <= local100) {
					local15.method3878(this.anInterface25_4.method7631((float) this.anInt4666), this.anInterface25_4.method7624((float) this.anInt4663), 1.0F);
					this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
					local417 = arg0 + this.anInt4659;
					local422 = this.anInt4663 + local417;
					while (local422 <= local103) {
						local10.method3878((float) this.anInt4666, (float) this.anInt4663, 0.0F);
						local10.method7247(local417, local182, 0);
						this.aClass126_Sub2_10.method5468();
						local417 += local130;
						local422 += local130;
						this.aClass126_Sub2_10.method5506();
					}
					if (local103 > local417) {
						local469 = local103 - local417;
						local15.method3878(this.anInterface25_4.method7631((float) this.anInt4666), this.anInterface25_4.method7624((float) local469), 1.0F);
						this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
						local10.method3878((float) this.anInt4666, (float) local469, 0.0F);
						local10.method7247(local417, local182, 0);
						this.aClass126_Sub2_10.method5468();
						this.aClass126_Sub2_10.method5506();
					}
					local387 += local135;
					local182 += local135;
				}
				if (local182 < local100) {
					local417 = local100 - local182;
					local15.method3878(this.anInterface25_4.method7631((float) local417), this.anInterface25_4.method7624((float) this.anInt4663), 1.0F);
					this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
					local422 = this.anInt4659 + arg0;
					local469 = local422 + this.anInt4663;
					while (local469 <= local103) {
						local10.method3878((float) local417, (float) this.anInt4663, 0.0F);
						local10.method7247(local422, local182, 0);
						this.aClass126_Sub2_10.method5468();
						this.aClass126_Sub2_10.method5506();
						local469 += local130;
						local422 += local130;
					}
					if (local422 < local103) {
						@Pc(620) int local620 = local103 - local422;
						local15.method3878(this.anInterface25_4.method7631((float) local417), this.anInterface25_4.method7624((float) local620), 1.0F);
						this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
						local10.method3878((float) local417, (float) local620, 0.0F);
						local10.method7247(local422, local182, 0);
						this.aClass126_Sub2_10.method5468();
						this.aClass126_Sub2_10.method5506();
					}
				}
			}
		}
		this.aClass126_Sub2_10.method5445();
		this.aClass126_Sub2_10.method5466(1, Static131.aClass294_2);
		this.aClass126_Sub2_10.method5471(Static131.aClass294_2, 1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
	@Override
	public void method5321(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass126_Sub2_10.na(0, 0, this.anInt4663, this.anInt4666);
		@Pc(22) int[] local22 = new int[this.anInt4663 * this.anInt4666];
		this.anInterface25_4.method7629(this.anInt4666, local22, this.anInt4663);
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(47) int local47;
		if (arg0 == 0) {
			for (local38 = 0; local38 < this.anInt4666; local38++) {
				local45 = local38 * this.anInt4663;
				for (local47 = 0; local47 < this.anInt4663; local47++) {
					local22[local45 + local47] = local22[local45 + local47] & 0xFFFFFF | (local15[local47 + local45] & 0x65FF0000) << 8;
				}
			}
		} else if (arg0 == 3) {
			for (local38 = 0; local38 < this.anInt4666; local38++) {
				local45 = local38 * this.anInt4663;
				for (local47 = 0; local47 < this.anInt4663; local47++) {
					local22[local47 + local45] = local22[local47 + local45] & 0xFFFFFF | (local15[local47 + local45] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method4272(0, 0, this.anInt4663, this.anInt4666, local22, this.anInt4663);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt4659;
		@Pc(14) Interface25 local14 = local6.anInterface25_3;
		@Pc(19) int local19 = arg1 + this.anInt4654;
		this.anInterface25_4.method7609(Static86.aClass189_6);
		this.aClass126_Sub2_10.method5551();
		this.aClass126_Sub2_10.method5449(this.anInterface25_4);
		this.aClass126_Sub2_10.method5462(1);
		this.aClass126_Sub2_10.method5513(1);
		@Pc(49) Class117_Sub2 local49 = this.aClass126_Sub2_10.method5472();
		local49.method3878((float) this.anInt4666, (float) this.anInt4663, 0.0F);
		local49.method7247(local11, local19, 0);
		this.aClass126_Sub2_10.method5468();
		@Pc(73) Class117_Sub2 local73 = this.aClass126_Sub2_10.method5542();
		local73.method3878(this.anInterface25_4.method7631((float) this.anInt4666), this.anInterface25_4.method7624((float) this.anInt4663), 1.0F);
		this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
		this.aClass126_Sub2_10.method5560(1);
		this.aClass126_Sub2_10.method5449(local14);
		this.aClass126_Sub2_10.method5475(Static101.aClass10_2, Static247.aClass10_4);
		this.aClass126_Sub2_10.method5466(0, Static131.aClass294_2);
		@Pc(123) Class117_Sub2 local123 = this.aClass126_Sub2_10.method5542();
		local123.method3878(local14.method7631((float) this.anInt4666), local14.method7624((float) this.anInt4663), 1.0F);
		local123.method3865(local14.method7624((float) (local11 - arg3)), 0.0F, local14.method7631((float) (local19 - arg4)));
		this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
		this.aClass126_Sub2_10.method5506();
		this.aClass126_Sub2_10.method5445();
		this.aClass126_Sub2_10.method5466(0, Static256.aClass294_4);
		this.aClass126_Sub2_10.method5475(Static101.aClass10_2, Static101.aClass10_2);
		this.aClass126_Sub2_10.method5449((Interface27) null);
		this.aClass126_Sub2_10.method5560(0);
		this.aClass126_Sub2_10.method5445();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "()I")
	@Override
	public int method5313() {
		return this.anInt4658 + this.anInt4659 + this.anInt4663;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class117_Sub2 local8 = this.aClass126_Sub2_10.method5472();
		@Pc(13) Class117_Sub2 local13 = this.aClass126_Sub2_10.method5542();
		@Pc(18) int local18 = arg1 + this.anInt4654;
		@Pc(23) int local23 = arg0 + this.anInt4659;
		this.anInterface25_4.method7609(Static86.aClass189_6);
		this.aClass126_Sub2_10.method5551();
		this.aClass126_Sub2_10.method5449(this.anInterface25_4);
		this.aClass126_Sub2_10.method5462(arg4);
		this.aClass126_Sub2_10.method5513(arg2);
		this.aClass126_Sub2_10.method5466(1, Static645.aClass294_5);
		this.aClass126_Sub2_10.method5471(Static645.aClass294_5, 1);
		this.aClass126_Sub2_10.method5496(arg3);
		local8.method3878((float) this.anInt4666, (float) this.anInt4663, 0.0F);
		local8.method7247(local23, local18, 0);
		local13.method3878(this.anInterface25_4.method7631((float) this.anInt4666), this.anInterface25_4.method7624((float) this.anInt4663), 1.0F);
		this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
		this.aClass126_Sub2_10.method5468();
		this.aClass126_Sub2_10.method5506();
		this.aClass126_Sub2_10.method5445();
		this.aClass126_Sub2_10.method5466(1, Static131.aClass294_2);
		this.aClass126_Sub2_10.method5471(Static131.aClass294_2, 1);
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "()I")
	@Override
	public int method5320() {
		return this.anInt4666;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass126_Sub2_10.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method4272(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4654 = arg1;
		this.anInt4659 = arg0;
		this.anInt4658 = arg2;
		this.anInt4661 = arg3;
		this.aBoolean382 = this.anInt4659 != 0 || this.anInt4654 != 0 || this.anInt4658 != 0 || this.anInt4661 != 0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method5318(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class117_Sub2 local8 = this.aClass126_Sub2_10.method5472();
		@Pc(13) Class117_Sub2 local13 = this.aClass126_Sub2_10.method5542();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface25 local19 = local16.anInterface25_3;
		this.anInterface25_4.method7609(this.aBoolean380 || this.aBoolean381 ? Static86.aClass189_6 : Static276.aClass189_15);
		this.aClass126_Sub2_10.method5551();
		this.aClass126_Sub2_10.method5449(this.anInterface25_4);
		this.aClass126_Sub2_10.method5462(1);
		this.aClass126_Sub2_10.method5513(1);
		if (this.aBoolean382) {
			@Pc(67) float local67 = (float) this.anInt4663 / (float) this.method5313();
			@Pc(75) float local75 = (float) this.anInt4666 / (float) this.method5325();
			local8.method3871(local67 * (arg2 - arg0), local67 * (arg3 - arg1), 1.0F, 0.0F, (arg4 - arg0) * local75, 0.0F, local75 * (arg5 - arg1), 0.0F, 0.0F);
			local8.method3865(local67 * ((float) this.anInt4659 + arg0), 0.0F, ((float) this.anInt4654 + arg1) * local75);
		} else {
			local8.method3871(arg2 - arg0, -arg1 + arg3, 1.0F, 0.0F, arg4 - arg0, 0.0F, arg5 - arg1, 0.0F, 0.0F);
			local8.method3865(arg0, 0.0F, arg1);
		}
		local13.method3878(this.anInterface25_4.method7631((float) this.anInt4666), this.anInterface25_4.method7624((float) this.anInt4663), 1.0F);
		this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
		this.aClass126_Sub2_10.method5560(1);
		this.aClass126_Sub2_10.method5449(local19);
		this.aClass126_Sub2_10.method5475(Static101.aClass10_2, Static247.aClass10_4);
		this.aClass126_Sub2_10.method5466(0, Static131.aClass294_2);
		@Pc(202) Class117_Sub2 local202 = this.aClass126_Sub2_10.method5542();
		local202.method7253(local8);
		local202.method7247(-arg7, -arg8, 0);
		local202.method3860(local19.method7624(1.0F), local19.method7631(1.0F), 1.0F);
		this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
		this.aClass126_Sub2_10.method5468();
		this.aClass126_Sub2_10.method5506();
		this.aClass126_Sub2_10.method5445();
		this.aClass126_Sub2_10.method5466(0, Static256.aClass294_4);
		this.aClass126_Sub2_10.method5475(Static101.aClass10_2, Static101.aClass10_2);
		this.aClass126_Sub2_10.method5449((Interface27) null);
		this.aClass126_Sub2_10.method5560(0);
		this.aClass126_Sub2_10.method5445();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method5327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class117_Sub2 local8 = this.aClass126_Sub2_10.method5472();
		@Pc(13) Class117_Sub2 local13 = this.aClass126_Sub2_10.method5542();
		this.anInterface25_4.method7609(this.aBoolean380 || this.aBoolean381 ? Static86.aClass189_6 : Static276.aClass189_15);
		this.aClass126_Sub2_10.method5551();
		this.aClass126_Sub2_10.method5449(this.anInterface25_4);
		this.aClass126_Sub2_10.method5462(arg6);
		this.aClass126_Sub2_10.method5513(arg4);
		this.aClass126_Sub2_10.method5466(1, Static645.aClass294_5);
		this.aClass126_Sub2_10.method5471(Static645.aClass294_5, 1);
		this.aClass126_Sub2_10.method5496(arg5);
		local13.method3878(this.anInterface25_4.method7631((float) this.anInt4666), this.anInterface25_4.method7624((float) this.anInt4663), 1.0F);
		if (this.aBoolean382) {
			arg2 = this.anInt4663 * arg2 / this.method5313();
			arg3 = arg3 * this.anInt4666 / this.method5325();
			arg0 += arg2 * this.anInt4659 / this.anInt4663;
			arg1 += arg3 * this.anInt4654 / this.anInt4666;
		}
		local8.method3878((float) arg3, (float) arg2, 0.0F);
		local8.method7247(arg0, arg1, 0);
		this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
		this.aClass126_Sub2_10.method5468();
		this.aClass126_Sub2_10.method5506();
		this.aClass126_Sub2_10.method5445();
		this.aClass126_Sub2_10.method5466(1, Static131.aClass294_2);
		this.aClass126_Sub2_10.method5471(Static131.aClass294_2, 1);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "()I")
	@Override
	public int method5319() {
		return this.anInt4663;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII[III)V")
	private void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface25_4.method7625(arg1, arg5, arg0, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5311(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class117_Sub2 local8 = this.aClass126_Sub2_10.method5472();
		@Pc(13) Class117_Sub2 local13 = this.aClass126_Sub2_10.method5542();
		this.anInterface25_4.method7609(this.aBoolean380 || this.aBoolean381 ? Static86.aClass189_6 : Static276.aClass189_15);
		this.aClass126_Sub2_10.method5551();
		this.aClass126_Sub2_10.method5449(this.anInterface25_4);
		this.aClass126_Sub2_10.method5462(1);
		this.aClass126_Sub2_10.method5513(arg6);
		this.aClass126_Sub2_10.method5466(1, Static645.aClass294_5);
		this.aClass126_Sub2_10.method5471(Static645.aClass294_5, 1);
		this.aClass126_Sub2_10.method5496(arg7);
		if (this.aBoolean382) {
			@Pc(77) float local77 = (float) this.method5313();
			@Pc(81) float local81 = (float) this.method5325();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(94) float local94 = (arg3 - arg1) / local77;
			@Pc(100) float local100 = (arg4 - arg0) / local81;
			@Pc(106) float local106 = (arg5 - arg1) / local81;
			@Pc(112) float local112 = local100 * (float) this.anInt4654;
			@Pc(118) float local118 = (float) this.anInt4654 * local106;
			@Pc(124) float local124 = (float) this.anInt4659 * local88;
			@Pc(130) float local130 = local94 * (float) this.anInt4659;
			@Pc(137) float local137 = (float) this.anInt4658 * -local88;
			@Pc(144) float local144 = -local94 * (float) this.anInt4658;
			@Pc(151) float local151 = -local100 * (float) this.anInt4661;
			arg3 = arg3 + local144 + local118;
			arg2 = local112 + arg2 + local137;
			arg0 = local112 + local124 + arg0;
			@Pc(176) float local176 = -local106 * (float) this.anInt4661;
			arg4 = local124 + arg4 + local151;
			arg1 = arg1 + local130 + local118;
			arg5 = arg5 + local130 + local176;
		}
		local8.method3871(arg2 - arg0, -arg1 + arg3, 1.0F, 0.0F, arg4 - arg0, 0.0F, arg5 - arg1, 0.0F, 0.0F);
		local8.method3865(arg0, 0.0F, arg1);
		local13.method3878(this.anInterface25_4.method7631((float) this.anInt4666), this.anInterface25_4.method7624((float) this.anInt4663), 1.0F);
		this.aClass126_Sub2_10.method5504(Static242.aClass52_2);
		this.aClass126_Sub2_10.method5468();
		this.aClass126_Sub2_10.method5506();
		this.aClass126_Sub2_10.method5445();
		this.aClass126_Sub2_10.method5466(1, Static131.aClass294_2);
		this.aClass126_Sub2_10.method5471(Static131.aClass294_2, 1);
	}
}
