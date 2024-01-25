import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
	private int anInt3329 = 0;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
	private int anInt3337 = 0;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
	private int anInt3336 = 0;

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!fs", name = "E", descriptor = "I")
	private int anInt3350 = 0;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
	private final int anInt3334;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "Lclient!pj;")
	private final Class137_Sub1 aClass137_Sub1_6;

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
	private final int anInt3339;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "Lclient!oga;")
	private final Interface21 anInterface21_3;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "Z")
	private final boolean aBoolean258;

	@OriginalMember(owner = "client!fs", name = "F", descriptor = "Z")
	private final boolean aBoolean261;

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "Z")
	private final boolean aBoolean260;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "Z")
	private final boolean aBoolean257;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!pj;IIZ)V")
	public Class20_Sub2(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3334 = arg2;
		this.aClass137_Sub1_6 = arg0;
		this.anInt3339 = arg1;
		this.anInterface21_3 = arg0.method7992(arg3 ? Static238.aClass363_4 : Static532.aClass363_13, Static47.aClass36_5, arg1, arg2);
		this.anInterface21_3.method9033(true, true);
		this.aBoolean258 = this.anInterface21_3.method9038() != arg1;
		this.aBoolean261 = this.anInterface21_3.method9034() != arg2;
		this.aBoolean260 = !this.aBoolean258 && this.anInterface21_3.method9040();
		this.aBoolean257 = !this.aBoolean261 && this.anInterface21_3.method9040();
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!pj;II[III)V")
	public Class20_Sub2(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass137_Sub1_6 = arg0;
		this.anInt3334 = arg2;
		this.anInt3339 = arg1;
		this.anInterface21_3 = arg0.method8075(arg4, arg3, arg5, arg1, arg2, false);
		this.anInterface21_3.method9033(true, true);
		this.aBoolean258 = this.anInterface21_3.method9038() != arg1;
		this.aBoolean261 = arg2 != this.anInterface21_3.method9034();
		this.aBoolean260 = !this.aBoolean258 && this.anInterface21_3.method9040();
		this.aBoolean257 = !this.aBoolean261 && this.anInterface21_3.method9040();
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "()I")
	@Override
	public int method7408() {
		return this.anInt3329 + this.anInt3336 + this.anInt3334;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V")
	@Override
	public void method7410(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass137_Sub1_6.na(0, 0, this.anInt3339, this.anInt3334);
		@Pc(22) int[] local22 = new int[this.anInt3339 * this.anInt3334];
		this.anInterface21_3.method9035(this.anInt3339, local22, this.anInt3334);
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(47) int local47;
		if (arg0 == 0) {
			for (local38 = 0; local38 < this.anInt3334; local38++) {
				local45 = this.anInt3339 * local38;
				for (local47 = 0; local47 < this.anInt3339; local47++) {
					local22[local45 + local47] = local22[local47 + local45] & 0xFFFFFF | (local15[local45 + local47] & 0x43FF0000) << 8;
				}
			}
		} else if (arg0 == 3) {
			for (local38 = 0; local38 < this.anInt3334; local38++) {
				local45 = this.anInt3339 * local38;
				for (local47 = 0; local47 < this.anInt3339; local47++) {
					local22[local47 + local45] = local22[local47 + local45] & 0xFFFFFF | (local15[local45 + local47] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method2763(0, 0, this.anInt3339, this.anInt3334, local22, this.anInt3339);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(11) int local11 = arg1 + this.anInt3336;
		@Pc(14) Interface21 local14 = local6.anInterface21_2;
		@Pc(19) int local19 = arg0 + this.anInt3337;
		this.anInterface21_3.method9087(Static361.aClass334_7);
		this.aClass137_Sub1_6.method7978();
		this.aClass137_Sub1_6.method8007(this.anInterface21_3);
		this.aClass137_Sub1_6.method7990(1);
		this.aClass137_Sub1_6.method8078(1);
		@Pc(49) Class26_Sub1 local49 = this.aClass137_Sub1_6.method8006();
		local49.method790((float) this.anInt3339, (float) this.anInt3334, 0.0F);
		local49.method6443(local19, local11, 0);
		this.aClass137_Sub1_6.method8036();
		@Pc(73) Class26_Sub1 local73 = this.aClass137_Sub1_6.method8050();
		local73.method790(this.anInterface21_3.method9037((float) this.anInt3339), this.anInterface21_3.method9032((float) this.anInt3334), 1.0F);
		this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
		this.aClass137_Sub1_6.method8081(1);
		this.aClass137_Sub1_6.method8007(local14);
		this.aClass137_Sub1_6.method7969(Static461.aClass87_5, Static575.aClass87_7);
		this.aClass137_Sub1_6.method8069(0, Static567.aClass169_7);
		@Pc(123) Class26_Sub1 local123 = this.aClass137_Sub1_6.method8050();
		local123.method790(local14.method9037((float) this.anInt3339), local14.method9032((float) this.anInt3334), 1.0F);
		local123.method797(local14.method9037((float) (local19 - arg3)), 0.0F, local14.method9032((float) (local11 - arg4)));
		this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
		this.aClass137_Sub1_6.method7968();
		this.aClass137_Sub1_6.method8071();
		this.aClass137_Sub1_6.method8069(0, Static201.aClass169_3);
		this.aClass137_Sub1_6.method7969(Static575.aClass87_7, Static575.aClass87_7);
		this.aClass137_Sub1_6.method8007((Interface15) null);
		this.aClass137_Sub1_6.method8081(0);
		this.aClass137_Sub1_6.method8071();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7403(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class26_Sub1 local8 = this.aClass137_Sub1_6.method8006();
		@Pc(13) Class26_Sub1 local13 = this.aClass137_Sub1_6.method8050();
		this.anInterface21_3.method9087(this.aBoolean258 || this.aBoolean261 ? Static361.aClass334_7 : Static159.aClass334_8);
		this.aClass137_Sub1_6.method7978();
		this.aClass137_Sub1_6.method8007(this.anInterface21_3);
		this.aClass137_Sub1_6.method7990(1);
		this.aClass137_Sub1_6.method8078(arg6);
		this.aClass137_Sub1_6.method8069(1, Static490.aClass169_6);
		this.aClass137_Sub1_6.method7971(1, Static490.aClass169_6);
		this.aClass137_Sub1_6.method8048(arg7);
		if (this.aBoolean259) {
			@Pc(77) float local77 = (float) this.method7394();
			@Pc(81) float local81 = (float) this.method7408();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(95) float local95 = (arg3 - arg1) / local77;
			@Pc(102) float local102 = (arg4 - arg0) / local81;
			@Pc(109) float local109 = (arg5 - arg1) / local81;
			@Pc(115) float local115 = (float) this.anInt3336 * local102;
			@Pc(121) float local121 = (float) this.anInt3336 * local109;
			@Pc(127) float local127 = (float) this.anInt3337 * local88;
			@Pc(133) float local133 = (float) this.anInt3337 * local95;
			@Pc(140) float local140 = (float) this.anInt3350 * -local88;
			@Pc(147) float local147 = -local95 * (float) this.anInt3350;
			@Pc(154) float local154 = -local102 * (float) this.anInt3329;
			arg0 = local115 + arg0 + local127;
			@Pc(167) float local167 = (float) this.anInt3329 * -local109;
			arg2 = local115 + arg2 + local140;
			arg4 = arg4 + local127 + local154;
			arg1 = local133 + arg1 + local121;
			arg3 = local121 + arg3 + local147;
			arg5 = local133 + arg5 + local167;
		}
		local8.method784(0.0F, 0.0F, arg2 - arg0, -arg1 + arg3, 1.0F, 0.0F, 0.0F, arg5 - arg1, -arg0 + arg4);
		local8.method797(arg0, 0.0F, arg1);
		local13.method790(this.anInterface21_3.method9037((float) this.anInt3339), this.anInterface21_3.method9032((float) this.anInt3334), 1.0F);
		this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
		this.aClass137_Sub1_6.method8036();
		this.aClass137_Sub1_6.method7968();
		this.aClass137_Sub1_6.method8071();
		this.aClass137_Sub1_6.method8069(1, Static567.aClass169_7);
		this.aClass137_Sub1_6.method7971(1, Static567.aClass169_7);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIII[III)V")
	private void method2763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface21_3.method9036(arg2, arg5, arg1, arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method7406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class26_Sub1 local10 = this.aClass137_Sub1_6.method8006();
		@Pc(15) Class26_Sub1 local15 = this.aClass137_Sub1_6.method8050();
		this.anInterface21_3.method9087(Static361.aClass334_7);
		this.aClass137_Sub1_6.method7978();
		this.aClass137_Sub1_6.method8007(this.anInterface21_3);
		this.aClass137_Sub1_6.method7990(arg6);
		this.aClass137_Sub1_6.method8078(arg4);
		this.aClass137_Sub1_6.method8069(1, Static490.aClass169_6);
		this.aClass137_Sub1_6.method7971(1, Static490.aClass169_6);
		this.aClass137_Sub1_6.method8048(arg5);
		@Pc(73) boolean local73 = this.aBoolean257 && this.anInt3336 == 0 && this.anInt3329 == 0;
		@Pc(92) boolean local92 = this.aBoolean260 && this.anInt3337 == 0 && this.anInt3350 == 0;
		if (local92 & local73) {
			local15.method790(this.anInterface21_3.method9037((float) arg2), this.anInterface21_3.method9032((float) arg3), 1.0F);
			local10.method790((float) arg2, (float) arg3, 0.0F);
			local10.method6443(arg0, arg1, 0);
			this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
			this.aClass137_Sub1_6.method8036();
			this.aClass137_Sub1_6.method7968();
		} else {
			@Pc(146) int local146;
			@Pc(149) int local149;
			@Pc(176) int local176;
			@Pc(182) int local182;
			@Pc(229) int local229;
			if (local92) {
				local146 = arg1 + arg3;
				local149 = this.method7408();
				local15.method790(this.anInterface21_3.method9037((float) arg2), this.anInterface21_3.method9032((float) this.anInt3334), 1.0F);
				this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
				local176 = this.anInt3336 + arg1;
				local182 = local176 + this.anInt3334;
				while (local182 <= local146) {
					local10.method790((float) arg2, (float) this.anInt3334, 0.0F);
					local10.method6443(arg0, local176, 0);
					this.aClass137_Sub1_6.method8036();
					local182 += local149;
					local176 += local149;
					this.aClass137_Sub1_6.method7968();
				}
				if (local146 > local176) {
					local229 = local146 - local176;
					local15.method790(this.anInterface21_3.method9037((float) arg2), this.anInterface21_3.method9032((float) local229), 1.0F);
					this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
					local10.method790((float) arg2, (float) local229, 0.0F);
					local10.method6443(arg0, local176, 0);
					this.aClass137_Sub1_6.method8036();
					this.aClass137_Sub1_6.method7968();
				}
			} else if (local73) {
				local146 = arg2 + arg0;
				local149 = this.method7394();
				local15.method790(this.anInterface21_3.method9037((float) this.anInt3339), this.anInterface21_3.method9032((float) arg3), 1.0F);
				this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
				local176 = arg0 + this.anInt3337;
				local182 = local176 + this.anInt3339;
				while (local146 >= local182) {
					local10.method790((float) this.anInt3339, (float) arg3, 0.0F);
					local10.method6443(local176, arg1, 0);
					this.aClass137_Sub1_6.method8036();
					local182 += local149;
					this.aClass137_Sub1_6.method7968();
					local176 += local149;
				}
				if (local176 < local146) {
					local229 = local146 - local176;
					local15.method790(this.anInterface21_3.method9037((float) local229), this.anInterface21_3.method9032((float) arg3), 1.0F);
					this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
					local10.method790((float) local229, (float) arg3, 0.0F);
					local10.method6443(local176, arg1, 0);
					this.aClass137_Sub1_6.method8036();
					this.aClass137_Sub1_6.method7968();
				}
			} else {
				local146 = arg3 + arg1;
				local149 = arg0 + arg2;
				local176 = this.method7394();
				local182 = this.method7408();
				local229 = this.anInt3336 + arg1;
				@Pc(299) int local299 = this.anInt3334 + local229;
				@Pc(330) int local330;
				@Pc(335) int local335;
				@Pc(383) int local383;
				while (local146 >= local299) {
					local15.method790(this.anInterface21_3.method9037((float) this.anInt3339), this.anInterface21_3.method9032((float) this.anInt3334), 1.0F);
					this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
					local330 = arg0 + this.anInt3337;
					for (local335 = this.anInt3339 + local330; local335 <= local149; local335 += local176) {
						local10.method790((float) this.anInt3339, (float) this.anInt3334, 0.0F);
						local10.method6443(local330, local229, 0);
						this.aClass137_Sub1_6.method8036();
						local330 += local176;
						this.aClass137_Sub1_6.method7968();
					}
					if (local330 < local149) {
						local383 = local149 - local330;
						local15.method790(this.anInterface21_3.method9037((float) local383), this.anInterface21_3.method9032((float) this.anInt3334), 1.0F);
						this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
						local10.method790((float) local383, (float) this.anInt3334, 0.0F);
						local10.method6443(local330, local229, 0);
						this.aClass137_Sub1_6.method8036();
						this.aClass137_Sub1_6.method7968();
					}
					local299 += local182;
					local229 += local182;
				}
				if (local229 < local146) {
					local330 = local146 - local229;
					local15.method790(this.anInterface21_3.method9037((float) this.anInt3339), this.anInterface21_3.method9032((float) local330), 1.0F);
					this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
					local335 = arg0 + this.anInt3337;
					for (local383 = local335 + this.anInt3339; local383 <= local149; local383 += local176) {
						local10.method790((float) this.anInt3339, (float) local330, 0.0F);
						local10.method6443(local335, local229, 0);
						this.aClass137_Sub1_6.method8036();
						local335 += local176;
						this.aClass137_Sub1_6.method7968();
					}
					if (local149 > local335) {
						@Pc(537) int local537 = local149 - local335;
						local15.method790(this.anInterface21_3.method9037((float) local537), this.anInterface21_3.method9032((float) local330), 1.0F);
						this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
						local10.method790((float) local537, (float) local330, 0.0F);
						local10.method6443(local335, local229, 0);
						this.aClass137_Sub1_6.method8036();
						this.aClass137_Sub1_6.method7968();
					}
				}
			}
		}
		this.aClass137_Sub1_6.method8071();
		this.aClass137_Sub1_6.method8069(1, Static567.aClass169_7);
		this.aClass137_Sub1_6.method7971(1, Static567.aClass169_7);
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "()I")
	@Override
	public int method7412() {
		return this.anInt3339;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class26_Sub1 local8 = this.aClass137_Sub1_6.method8006();
		@Pc(13) Class26_Sub1 local13 = this.aClass137_Sub1_6.method8050();
		@Pc(18) int local18 = arg0 + this.anInt3337;
		@Pc(23) int local23 = arg1 + this.anInt3336;
		this.anInterface21_3.method9087(Static361.aClass334_7);
		this.aClass137_Sub1_6.method7978();
		this.aClass137_Sub1_6.method8007(this.anInterface21_3);
		this.aClass137_Sub1_6.method7990(arg4);
		this.aClass137_Sub1_6.method8078(arg2);
		this.aClass137_Sub1_6.method8069(1, Static490.aClass169_6);
		this.aClass137_Sub1_6.method7971(1, Static490.aClass169_6);
		this.aClass137_Sub1_6.method8048(arg3);
		local8.method790((float) this.anInt3339, (float) this.anInt3334, 0.0F);
		local8.method6443(local18, local23, 0);
		local13.method790(this.anInterface21_3.method9037((float) this.anInt3339), this.anInterface21_3.method9032((float) this.anInt3334), 1.0F);
		this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
		this.aClass137_Sub1_6.method8036();
		this.aClass137_Sub1_6.method7968();
		this.aClass137_Sub1_6.method8071();
		this.aClass137_Sub1_6.method8069(1, Static567.aClass169_7);
		this.aClass137_Sub1_6.method7971(1, Static567.aClass169_7);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7417(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class26_Sub1 local8 = this.aClass137_Sub1_6.method8006();
		@Pc(13) Class26_Sub1 local13 = this.aClass137_Sub1_6.method8050();
		@Pc(16) Class1_Sub1 local16 = (Class1_Sub1) arg6;
		@Pc(19) Interface21 local19 = local16.anInterface21_2;
		this.anInterface21_3.method9087(this.aBoolean258 || this.aBoolean261 ? Static361.aClass334_7 : Static159.aClass334_8);
		this.aClass137_Sub1_6.method7978();
		this.aClass137_Sub1_6.method8007(this.anInterface21_3);
		this.aClass137_Sub1_6.method7990(1);
		this.aClass137_Sub1_6.method8078(1);
		if (this.aBoolean259) {
			@Pc(102) float local102 = (float) this.anInt3339 / (float) this.method7394();
			@Pc(110) float local110 = (float) this.anInt3334 / (float) this.method7408();
			local8.method784(0.0F, 0.0F, (arg2 - arg0) * local102, local102 * (arg3 - arg1), 1.0F, 0.0F, 0.0F, (arg5 - arg1) * local110, local110 * (arg4 - arg0));
			local8.method797(((float) this.anInt3337 + arg0) * local102, 0.0F, local110 * ((float) this.anInt3336 + arg1));
		} else {
			local8.method784(0.0F, 0.0F, arg2 - arg0, -arg1 + arg3, 1.0F, 0.0F, 0.0F, arg5 - arg1, -arg0 + arg4);
			local8.method797(arg0, 0.0F, arg1);
		}
		local13.method790(this.anInterface21_3.method9037((float) this.anInt3339), this.anInterface21_3.method9032((float) this.anInt3334), 1.0F);
		this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
		this.aClass137_Sub1_6.method8081(1);
		this.aClass137_Sub1_6.method8007(local19);
		this.aClass137_Sub1_6.method7969(Static461.aClass87_5, Static575.aClass87_7);
		this.aClass137_Sub1_6.method8069(0, Static567.aClass169_7);
		@Pc(207) Class26_Sub1 local207 = this.aClass137_Sub1_6.method8050();
		local207.method6447(local8);
		local207.method6443(-arg7, -arg8, 0);
		local207.method803(local19.method9037(1.0F), local19.method9032(1.0F), 1.0F);
		this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
		this.aClass137_Sub1_6.method8036();
		this.aClass137_Sub1_6.method7968();
		this.aClass137_Sub1_6.method8071();
		this.aClass137_Sub1_6.method8069(0, Static201.aClass169_3);
		this.aClass137_Sub1_6.method7969(Static575.aClass87_7, Static575.aClass87_7);
		this.aClass137_Sub1_6.method8007((Interface15) null);
		this.aClass137_Sub1_6.method8081(0);
		this.aClass137_Sub1_6.method8071();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class26_Sub1 local8 = this.aClass137_Sub1_6.method8006();
		@Pc(13) Class26_Sub1 local13 = this.aClass137_Sub1_6.method8050();
		this.anInterface21_3.method9087(this.aBoolean258 || this.aBoolean261 ? Static361.aClass334_7 : Static159.aClass334_8);
		this.aClass137_Sub1_6.method7978();
		this.aClass137_Sub1_6.method8007(this.anInterface21_3);
		this.aClass137_Sub1_6.method7990(arg6);
		this.aClass137_Sub1_6.method8078(arg4);
		this.aClass137_Sub1_6.method8069(1, Static490.aClass169_6);
		this.aClass137_Sub1_6.method7971(1, Static490.aClass169_6);
		this.aClass137_Sub1_6.method8048(arg5);
		local13.method790(this.anInterface21_3.method9037((float) this.anInt3339), this.anInterface21_3.method9032((float) this.anInt3334), 1.0F);
		if (this.aBoolean259) {
			arg2 = arg2 * this.anInt3339 / this.method7394();
			arg3 = arg3 * this.anInt3334 / this.method7408();
			arg1 += this.anInt3336 * arg3 / this.anInt3334;
			arg0 += arg2 * this.anInt3337 / this.anInt3339;
		}
		local8.method790((float) arg2, (float) arg3, 0.0F);
		local8.method6443(arg0, arg1, 0);
		this.aClass137_Sub1_6.method8041(Static658.aClass70_6);
		this.aClass137_Sub1_6.method8036();
		this.aClass137_Sub1_6.method7968();
		this.aClass137_Sub1_6.method8071();
		this.aClass137_Sub1_6.method8069(1, Static567.aClass169_7);
		this.aClass137_Sub1_6.method7971(1, Static567.aClass169_7);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass137_Sub1_6.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method2763(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "()I")
	@Override
	public int method7393() {
		return this.anInt3334;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "()I")
	@Override
	public int method7394() {
		return this.anInt3339 + this.anInt3337 + this.anInt3350;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(IIII)V")
	@Override
	public void method7409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3336 = arg1;
		this.anInt3337 = arg0;
		this.anInt3350 = arg2;
		this.anInt3329 = arg3;
		this.aBoolean259 = this.anInt3337 != 0 || this.anInt3336 != 0 || this.anInt3350 != 0 || this.anInt3329 != 0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "([I)V")
	@Override
	public void method7411(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3337;
		arg0[3] = this.anInt3329;
		arg0[2] = this.anInt3350;
		arg0[1] = this.anInt3336;
	}
}
