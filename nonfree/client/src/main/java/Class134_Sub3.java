import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class134_Sub3 extends Class134 {

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
	private int anInt10717 = 0;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	private int anInt10713 = 0;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
	private int anInt10732 = 0;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
	private int anInt10733 = 0;

	@OriginalMember(owner = "client!wl", name = "G", descriptor = "Z")
	private boolean aBoolean790 = false;

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
	private final int anInt10725;

	@OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
	private final int anInt10720;

	@OriginalMember(owner = "client!wl", name = "C", descriptor = "Lclient!kd;")
	private final Class57_Sub3 aClass57_Sub3_23;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "Lclient!wp;")
	private final Interface26 anInterface26_6;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Z")
	private final boolean aBoolean787;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "Z")
	private final boolean aBoolean789;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "Z")
	private final boolean aBoolean791;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Z")
	private final boolean aBoolean788;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!kd;IIZ)V")
	public Class134_Sub3(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt10725 = arg1;
		this.anInt10720 = arg2;
		this.aClass57_Sub3_23 = arg0;
		this.anInterface26_6 = arg0.method7834(arg1, arg3 ? Static412.aClass114_17 : Static396.aClass114_13, arg2, Static453.aClass278_13);
		this.anInterface26_6.method4348(true, true);
		this.aBoolean787 = this.anInterface26_6.method4347() != arg1;
		this.aBoolean789 = this.anInterface26_6.method4349() != arg2;
		this.aBoolean791 = !this.aBoolean787 && this.anInterface26_6.method4352();
		this.aBoolean788 = !this.aBoolean789 && this.anInterface26_6.method4352();
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!kd;II[III)V")
	public Class134_Sub3(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt10725 = arg1;
		this.anInt10720 = arg2;
		this.aClass57_Sub3_23 = arg0;
		this.anInterface26_6 = arg0.method7748(false, arg4, arg5, arg1, arg3, arg2);
		this.anInterface26_6.method4348(true, true);
		this.aBoolean787 = arg1 != this.anInterface26_6.method4347();
		this.aBoolean789 = arg2 != this.anInterface26_6.method4349();
		this.aBoolean791 = !this.aBoolean787 && this.anInterface26_6.method4352();
		this.aBoolean788 = !this.aBoolean789 && this.anInterface26_6.method4352();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "()I")
	@Override
	public int method9219() {
		return this.anInt10720;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(IIII)V")
	@Override
	public void method9229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10717 = arg3;
		this.anInt10733 = arg1;
		this.anInt10732 = arg2;
		this.anInt10713 = arg0;
		this.aBoolean790 = this.anInt10713 != 0 || this.anInt10733 != 0 || this.anInt10732 != 0 || this.anInt10717 != 0;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method9222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class203_Sub1 local10 = this.aClass57_Sub3_23.method7815();
		@Pc(15) Class203_Sub1 local15 = this.aClass57_Sub3_23.method7829();
		this.anInterface26_6.method8306(Static551.aClass216_10);
		this.aClass57_Sub3_23.method7843();
		this.aClass57_Sub3_23.method7813(this.anInterface26_6);
		this.aClass57_Sub3_23.method7800(arg6);
		this.aClass57_Sub3_23.method7764(arg4);
		this.aClass57_Sub3_23.method7866(1, Static291.aClass312_3);
		this.aClass57_Sub3_23.method7781(1, Static291.aClass312_3);
		this.aClass57_Sub3_23.method7806(arg5);
		@Pc(78) boolean local78 = this.aBoolean788 && this.anInt10733 == 0 && this.anInt10717 == 0;
		@Pc(99) boolean local99 = this.aBoolean791 && this.anInt10713 == 0 && this.anInt10732 == 0;
		if (local99 & local78) {
			local15.method4834(this.anInterface26_6.method4346((float) arg3), 1.0F, this.anInterface26_6.method4353((float) arg2));
			local10.method4834((float) arg3, 0.0F, (float) arg2);
			local10.method8335(arg0, arg1, 0);
			this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
			this.aClass57_Sub3_23.method7735();
			this.aClass57_Sub3_23.method7775();
		} else {
			@Pc(161) int local161;
			@Pc(164) int local164;
			@Pc(191) int local191;
			@Pc(196) int local196;
			@Pc(243) int local243;
			if (local99) {
				local161 = arg3 + arg1;
				local164 = this.method9232();
				local15.method4834(this.anInterface26_6.method4346((float) this.anInt10720), 1.0F, this.anInterface26_6.method4353((float) arg2));
				this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
				local191 = arg1 + this.anInt10733;
				local196 = this.anInt10720 + local191;
				while (local196 <= local161) {
					local10.method4834((float) this.anInt10720, 0.0F, (float) arg2);
					local10.method8335(arg0, local191, 0);
					this.aClass57_Sub3_23.method7735();
					this.aClass57_Sub3_23.method7775();
					local196 += local164;
					local191 += local164;
				}
				if (local161 > local191) {
					local243 = local161 - local191;
					local15.method4834(this.anInterface26_6.method4346((float) local243), 1.0F, this.anInterface26_6.method4353((float) arg2));
					this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
					local10.method4834((float) local243, 0.0F, (float) arg2);
					local10.method8335(arg0, local191, 0);
					this.aClass57_Sub3_23.method7735();
					this.aClass57_Sub3_23.method7775();
				}
			} else if (local78) {
				local161 = arg2 + arg0;
				local164 = this.method9231();
				local15.method4834(this.anInterface26_6.method4346((float) arg3), 1.0F, this.anInterface26_6.method4353((float) this.anInt10725));
				this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
				local191 = this.anInt10713 + arg0;
				local196 = local191 + this.anInt10725;
				while (local196 <= local161) {
					local10.method4834((float) arg3, 0.0F, (float) this.anInt10725);
					local10.method8335(local191, arg1, 0);
					this.aClass57_Sub3_23.method7735();
					local196 += local164;
					this.aClass57_Sub3_23.method7775();
					local191 += local164;
				}
				if (local191 < local161) {
					local243 = local161 - local191;
					local15.method4834(this.anInterface26_6.method4346((float) arg3), 1.0F, this.anInterface26_6.method4353((float) local243));
					this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
					local10.method4834((float) arg3, 0.0F, (float) local243);
					local10.method8335(local191, arg1, 0);
					this.aClass57_Sub3_23.method7735();
					this.aClass57_Sub3_23.method7775();
				}
			} else {
				local161 = arg1 + arg3;
				local164 = arg2 + arg0;
				local191 = this.method9231();
				local196 = this.method9232();
				local243 = arg1 + this.anInt10733;
				@Pc(345) int local345;
				@Pc(350) int local350;
				@Pc(402) int local402;
				for (@Pc(312) int local312 = local243 + this.anInt10720; local312 <= local161; local312 += local196) {
					local15.method4834(this.anInterface26_6.method4346((float) this.anInt10720), 1.0F, this.anInterface26_6.method4353((float) this.anInt10725));
					this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
					local345 = arg0 + this.anInt10713;
					local350 = this.anInt10725 + local345;
					while (local164 >= local350) {
						local10.method4834((float) this.anInt10720, 0.0F, (float) this.anInt10725);
						local10.method8335(local345, local243, 0);
						this.aClass57_Sub3_23.method7735();
						local350 += local191;
						this.aClass57_Sub3_23.method7775();
						local345 += local191;
					}
					if (local164 > local345) {
						local402 = local164 - local345;
						local15.method4834(this.anInterface26_6.method4346((float) this.anInt10720), 1.0F, this.anInterface26_6.method4353((float) local402));
						this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
						local10.method4834((float) this.anInt10720, 0.0F, (float) local402);
						local10.method8335(local345, local243, 0);
						this.aClass57_Sub3_23.method7735();
						this.aClass57_Sub3_23.method7775();
					}
					local243 += local196;
				}
				if (local243 < local161) {
					local345 = local161 - local243;
					local15.method4834(this.anInterface26_6.method4346((float) local345), 1.0F, this.anInterface26_6.method4353((float) this.anInt10725));
					this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
					local350 = this.anInt10713 + arg0;
					local402 = this.anInt10725 + local350;
					while (local164 >= local402) {
						local10.method4834((float) local345, 0.0F, (float) this.anInt10725);
						local10.method8335(local350, local243, 0);
						this.aClass57_Sub3_23.method7735();
						local350 += local191;
						local402 += local191;
						this.aClass57_Sub3_23.method7775();
					}
					if (local350 < local164) {
						@Pc(550) int local550 = local164 - local350;
						local15.method4834(this.anInterface26_6.method4346((float) local345), 1.0F, this.anInterface26_6.method4353((float) local550));
						this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
						local10.method4834((float) local345, 0.0F, (float) local550);
						local10.method8335(local350, local243, 0);
						this.aClass57_Sub3_23.method7735();
						this.aClass57_Sub3_23.method7775();
					}
				}
			}
		}
		this.aClass57_Sub3_23.method7850();
		this.aClass57_Sub3_23.method7866(1, Static79.aClass312_2);
		this.aClass57_Sub3_23.method7781(1, Static79.aClass312_2);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([I)V")
	@Override
	public void method9223(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt10713;
		arg0[3] = this.anInt10717;
		arg0[1] = this.anInt10733;
		arg0[2] = this.anInt10732;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method9230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class203_Sub1 local8 = this.aClass57_Sub3_23.method7815();
		@Pc(13) Class203_Sub1 local13 = this.aClass57_Sub3_23.method7829();
		@Pc(18) int local18 = arg0 + this.anInt10713;
		@Pc(23) int local23 = arg1 + this.anInt10733;
		this.anInterface26_6.method8306(Static551.aClass216_10);
		this.aClass57_Sub3_23.method7843();
		this.aClass57_Sub3_23.method7813(this.anInterface26_6);
		this.aClass57_Sub3_23.method7800(arg4);
		this.aClass57_Sub3_23.method7764(arg2);
		this.aClass57_Sub3_23.method7866(1, Static291.aClass312_3);
		this.aClass57_Sub3_23.method7781(1, Static291.aClass312_3);
		this.aClass57_Sub3_23.method7806(arg3);
		local8.method4834((float) this.anInt10720, 0.0F, (float) this.anInt10725);
		local8.method8335(local18, local23, 0);
		local13.method4834(this.anInterface26_6.method4346((float) this.anInt10720), 1.0F, this.anInterface26_6.method4353((float) this.anInt10725));
		this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
		this.aClass57_Sub3_23.method7735();
		this.aClass57_Sub3_23.method7775();
		this.aClass57_Sub3_23.method7850();
		this.aClass57_Sub3_23.method7866(1, Static79.aClass312_2);
		this.aClass57_Sub3_23.method7781(1, Static79.aClass312_2);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method9218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class203_Sub1 local8 = this.aClass57_Sub3_23.method7815();
		@Pc(13) Class203_Sub1 local13 = this.aClass57_Sub3_23.method7829();
		this.anInterface26_6.method8306(this.aBoolean787 || this.aBoolean789 || !(true & true) ? Static551.aClass216_10 : Static2.aClass216_1);
		this.aClass57_Sub3_23.method7843();
		this.aClass57_Sub3_23.method7813(this.anInterface26_6);
		this.aClass57_Sub3_23.method7800(arg6);
		this.aClass57_Sub3_23.method7764(arg4);
		this.aClass57_Sub3_23.method7866(1, Static291.aClass312_3);
		this.aClass57_Sub3_23.method7781(1, Static291.aClass312_3);
		this.aClass57_Sub3_23.method7806(arg5);
		local13.method4834(this.anInterface26_6.method4346((float) this.anInt10720), 1.0F, this.anInterface26_6.method4353((float) this.anInt10725));
		if (this.aBoolean790) {
			arg2 = this.anInt10725 * arg2 / this.method9231();
			arg3 = this.anInt10720 * arg3 / this.method9232();
			arg0 += arg2 * this.anInt10713 / this.anInt10725;
			arg1 += arg3 * this.anInt10733 / this.anInt10720;
		}
		local8.method4834((float) arg3, 0.0F, (float) arg2);
		local8.method8335(arg0, arg1, 0);
		this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
		this.aClass57_Sub3_23.method7735();
		this.aClass57_Sub3_23.method7775();
		this.aClass57_Sub3_23.method7850();
		this.aClass57_Sub3_23.method7866(1, Static79.aClass312_2);
		this.aClass57_Sub3_23.method7781(1, Static79.aClass312_2);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V")
	@Override
	public void method9238(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass57_Sub3_23.na(0, 0, this.anInt10725, this.anInt10720);
		@Pc(22) int[] local22 = new int[this.anInt10720 * this.anInt10725];
		this.anInterface26_6.method4350(local22, this.anInt10720, this.anInt10725);
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg0 == 0) {
			for (local59 = 0; local59 < this.anInt10720; local59++) {
				local66 = local59 * this.anInt10725;
				for (local68 = 0; local68 < this.anInt10725; local68++) {
					local22[local66 + local68] = local22[local66 + local68] & 0xFFFFFF | (local15[local68 + local66] & 0x18FF0000) << 8;
				}
			}
		} else if (arg0 == 3) {
			for (local59 = 0; local59 < this.anInt10720; local59++) {
				local66 = local59 * this.anInt10725;
				for (local68 = 0; local68 < this.anInt10725; local68++) {
					local22[local68 + local66] = (local15[local66 + local68] == 0 ? 0 : -16777216) | local22[local66 + local68] & 0xFFFFFF;
				}
			}
		}
		this.method9245(0, 0, this.anInt10725, this.anInt10720, local22, this.anInt10725);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method9224(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class203_Sub1 local8 = this.aClass57_Sub3_23.method7815();
		@Pc(13) Class203_Sub1 local13 = this.aClass57_Sub3_23.method7829();
		this.anInterface26_6.method8306(this.aBoolean787 || this.aBoolean789 || !(true & true) ? Static551.aClass216_10 : Static2.aClass216_1);
		this.aClass57_Sub3_23.method7843();
		this.aClass57_Sub3_23.method7813(this.anInterface26_6);
		this.aClass57_Sub3_23.method7800(1);
		this.aClass57_Sub3_23.method7764(arg6);
		this.aClass57_Sub3_23.method7866(1, Static291.aClass312_3);
		this.aClass57_Sub3_23.method7781(1, Static291.aClass312_3);
		this.aClass57_Sub3_23.method7806(arg7);
		if (this.aBoolean790) {
			@Pc(79) float local79 = (float) this.method9231();
			@Pc(83) float local83 = (float) this.method9232();
			@Pc(90) float local90 = (arg2 - arg0) / local79;
			@Pc(97) float local97 = (arg3 - arg1) / local79;
			@Pc(103) float local103 = (arg4 - arg0) / local83;
			@Pc(109) float local109 = (arg5 - arg1) / local83;
			@Pc(115) float local115 = (float) this.anInt10733 * local103;
			@Pc(121) float local121 = local109 * (float) this.anInt10733;
			@Pc(127) float local127 = (float) this.anInt10713 * local90;
			@Pc(133) float local133 = (float) this.anInt10713 * local97;
			@Pc(140) float local140 = (float) this.anInt10732 * -local90;
			@Pc(147) float local147 = -local97 * (float) this.anInt10732;
			@Pc(154) float local154 = -local103 * (float) this.anInt10717;
			arg2 = arg2 + local140 + local115;
			arg1 = local133 + arg1 + local121;
			arg3 = local121 + arg3 + local147;
			@Pc(179) float local179 = (float) this.anInt10717 * -local109;
			arg0 = local115 + local127 + arg0;
			arg4 = local154 + arg4 + local127;
			arg5 = local179 + local133 + arg5;
		}
		local8.method4844(0.0F, arg2 - arg0, arg4 - arg0, 0.0F, 0.0F, arg3 - arg1, -arg1 + arg5, 1.0F, 0.0F);
		local8.method4846(arg1, 0.0F, arg0);
		local13.method4834(this.anInterface26_6.method4346((float) this.anInt10720), 1.0F, this.anInterface26_6.method4353((float) this.anInt10725));
		this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
		this.aClass57_Sub3_23.method7735();
		this.aClass57_Sub3_23.method7775();
		this.aClass57_Sub3_23.method7850();
		this.aClass57_Sub3_23.method7866(1, Static79.aClass312_2);
		this.aClass57_Sub3_23.method7781(1, Static79.aClass312_2);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method9220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt10713;
		@Pc(16) int local16 = arg1 + this.anInt10733;
		@Pc(19) Interface26 local19 = local6.anInterface26_5;
		this.anInterface26_6.method8306(Static551.aClass216_10);
		this.aClass57_Sub3_23.method7843();
		this.aClass57_Sub3_23.method7813(this.anInterface26_6);
		this.aClass57_Sub3_23.method7800(1);
		this.aClass57_Sub3_23.method7764(1);
		@Pc(49) Class203_Sub1 local49 = this.aClass57_Sub3_23.method7815();
		local49.method4834((float) this.anInt10720, 0.0F, (float) this.anInt10725);
		local49.method8335(local11, local16, 0);
		this.aClass57_Sub3_23.method7735();
		@Pc(73) Class203_Sub1 local73 = this.aClass57_Sub3_23.method7829();
		local73.method4834(this.anInterface26_6.method4346((float) this.anInt10720), 1.0F, this.anInterface26_6.method4353((float) this.anInt10725));
		this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
		this.aClass57_Sub3_23.method7795(1);
		this.aClass57_Sub3_23.method7813(local19);
		this.aClass57_Sub3_23.method7733(Static313.aClass34_88, Static362.aClass34_172);
		this.aClass57_Sub3_23.method7866(0, Static79.aClass312_2);
		@Pc(123) Class203_Sub1 local123 = this.aClass57_Sub3_23.method7829();
		local123.method4834(local19.method4346((float) this.anInt10720), 1.0F, local19.method4353((float) this.anInt10725));
		local123.method4846(local19.method4346((float) (local16 - arg4)), 0.0F, local19.method4353((float) (local11 - arg3)));
		this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
		this.aClass57_Sub3_23.method7775();
		this.aClass57_Sub3_23.method7850();
		this.aClass57_Sub3_23.method7866(0, Static57.aClass312_1);
		this.aClass57_Sub3_23.method7733(Static313.aClass34_88, Static313.aClass34_88);
		this.aClass57_Sub3_23.method7813((Interface22) null);
		this.aClass57_Sub3_23.method7795(0);
		this.aClass57_Sub3_23.method7850();
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "()I")
	@Override
	public int method9232() {
		return this.anInt10733 + this.anInt10720 + this.anInt10717;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "()I")
	@Override
	public int method9231() {
		return this.anInt10713 + this.anInt10725 + this.anInt10732;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII[III)V")
	private void method9245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface26_6.method4351(arg4, arg5, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass57_Sub3_23.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method9245(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "()I")
	@Override
	public int method9236() {
		return this.anInt10725;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method9233(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class203_Sub1 local8 = this.aClass57_Sub3_23.method7815();
		@Pc(13) Class203_Sub1 local13 = this.aClass57_Sub3_23.method7829();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface26 local19 = local16.anInterface26_5;
		this.anInterface26_6.method8306(this.aBoolean787 || this.aBoolean789 || (0x1 & 0x1) == 0 ? Static551.aClass216_10 : Static2.aClass216_1);
		this.aClass57_Sub3_23.method7843();
		this.aClass57_Sub3_23.method7813(this.anInterface26_6);
		this.aClass57_Sub3_23.method7800(1);
		this.aClass57_Sub3_23.method7764(1);
		if (this.aBoolean790) {
			@Pc(75) float local75 = (float) this.anInt10725 / (float) this.method9231();
			@Pc(83) float local83 = (float) this.anInt10720 / (float) this.method9232();
			local8.method4844(0.0F, local75 * (arg2 - arg0), (arg4 - arg0) * local83, 0.0F, 0.0F, local75 * (arg3 - arg1), local83 * (arg5 - arg1), 1.0F, 0.0F);
			local8.method4846(local83 * ((float) this.anInt10733 + arg1), 0.0F, (arg0 + (float) this.anInt10713) * local75);
		} else {
			local8.method4844(0.0F, arg2 - arg0, -arg0 + arg4, 0.0F, 0.0F, arg3 - arg1, -arg1 + arg5, 1.0F, 0.0F);
			local8.method4846(arg1, 0.0F, arg0);
		}
		local13.method4834(this.anInterface26_6.method4346((float) this.anInt10720), 1.0F, this.anInterface26_6.method4353((float) this.anInt10725));
		this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
		this.aClass57_Sub3_23.method7795(1);
		this.aClass57_Sub3_23.method7813(local19);
		this.aClass57_Sub3_23.method7733(Static313.aClass34_88, Static362.aClass34_172);
		this.aClass57_Sub3_23.method7866(0, Static79.aClass312_2);
		@Pc(216) Class203_Sub1 local216 = this.aClass57_Sub3_23.method7829();
		local216.method8336(local8);
		local216.method8335(-arg7, -arg8, 0);
		local216.method4851(local19.method4346(1.0F), 1.0F, local19.method4353(1.0F));
		this.aClass57_Sub3_23.method7822(Static169.aClass357_3);
		this.aClass57_Sub3_23.method7735();
		this.aClass57_Sub3_23.method7775();
		this.aClass57_Sub3_23.method7850();
		this.aClass57_Sub3_23.method7866(0, Static57.aClass312_1);
		this.aClass57_Sub3_23.method7733(Static313.aClass34_88, Static313.aClass34_88);
		this.aClass57_Sub3_23.method7813((Interface22) null);
		this.aClass57_Sub3_23.method7795(0);
		this.aClass57_Sub3_23.method7850();
	}
}
