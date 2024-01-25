import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class58_Sub2 extends Class58 {

	@OriginalMember(owner = "client!nw", name = "T", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!nw", name = "C", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!nw", name = "M", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!nw", name = "o", descriptor = "F")
	public float aFloat111;

	@OriginalMember(owner = "client!nw", name = "U", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!nw", name = "F", descriptor = "F")
	public float aFloat113;

	@OriginalMember(owner = "client!nw", name = "t", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "F")
	public float aFloat115;

	@OriginalMember(owner = "client!nw", name = "v", descriptor = "F")
	public float aFloat116;

	@OriginalMember(owner = "client!nw", name = "X", descriptor = "F")
	public float aFloat117;

	@OriginalMember(owner = "client!nw", name = "w", descriptor = "F")
	public float aFloat119;

	@OriginalMember(owner = "client!nw", name = "R", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "()V")
	public Class58_Sub2() {
		this.method9508();
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(FBFFF[F)V")
	public void method6091(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[2] = arg2 * this.aFloat113 + this.aFloat115 * arg3 + this.aFloat114 * arg1;
		arg4[0] = this.aFloat112 * arg2 + arg3 * this.aFloat120 + this.aFloat110 * arg1;
		arg4[1] = this.aFloat119 * arg1 + arg2 * this.aFloat109 + this.aFloat117 * arg3;
		@Pc(107) float local107;
		@Pc(99) float local99;
		@Pc(115) float local115;
		@Pc(91) float local91;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local91 = -arg0 / arg3;
			local107 = this.aFloat108 + local91 * this.aFloat120;
			local99 = local91 * this.aFloat117 + this.aFloat116;
			local115 = this.aFloat115 * local91 + this.aFloat111;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local91 = -arg0 / arg2;
			local99 = this.aFloat109 * local91 + this.aFloat116;
			local107 = this.aFloat112 * local91 + this.aFloat108;
			local115 = local91 * this.aFloat113 + this.aFloat111;
		} else {
			local91 = -arg0 / arg1;
			local99 = local91 * this.aFloat119 + this.aFloat116;
			local115 = this.aFloat111 + local91 * this.aFloat114;
			local107 = local91 * this.aFloat110 + this.aFloat108;
		}
		arg4[3] = -(local99 * arg4[1] + arg4[0] * local107 + local115 * arg4[2]);
	}

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "(I)V")
	@Override
	public void method9525(@OriginalArg(0) int arg0) {
		this.aFloat109 = 1.0F;
		this.aFloat120 = this.aFloat114 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		this.aFloat110 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat115 = -this.aFloat110;
		this.aFloat112 = this.aFloat108 = this.aFloat117 = this.aFloat119 = this.aFloat116 = this.aFloat113 = this.aFloat111 = 0.0F;
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "([FB)[F")
	public float[] method6092(@OriginalArg(0) float[] arg0) {
		arg0[6] = this.aFloat113;
		arg0[4] = this.aFloat112;
		arg0[12] = this.aFloat108;
		arg0[3] = 0.0F;
		arg0[9] = this.aFloat119;
		arg0[2] = this.aFloat115;
		arg0[11] = 0.0F;
		arg0[10] = this.aFloat114;
		arg0[5] = this.aFloat109;
		arg0[7] = 0.0F;
		arg0[1] = this.aFloat117;
		arg0[0] = this.aFloat120;
		arg0[15] = 1.0F;
		arg0[13] = this.aFloat116;
		arg0[8] = this.aFloat110;
		arg0[14] = this.aFloat111;
		return arg0;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "([FB)[F")
	public float[] method6093(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloat112;
		arg0[0] = this.aFloat120;
		arg0[6] = 0.0F;
		arg0[5] = this.aFloat109;
		arg0[9] = this.aFloat116;
		arg0[10] = this.aFloat111;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[2] = 0.0F;
		arg0[13] = 0.0F;
		arg0[8] = this.aFloat108;
		arg0[15] = 1.0F;
		arg0[1] = this.aFloat117;
		arg0[14] = 0.0F;
		arg0[3] = 0.0F;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IFFF)V")
	public void method6094(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat108 += arg0;
		this.aFloat111 += arg2;
		this.aFloat116 += arg1;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V")
	public void method6096() {
		this.aFloat115 = -this.aFloat115;
		this.aFloat114 = -this.aFloat114;
		this.aFloat109 = -this.aFloat109;
		this.aFloat117 = -this.aFloat117;
		this.aFloat116 = -this.aFloat116;
		this.aFloat111 = -this.aFloat111;
		this.aFloat119 = -this.aFloat119;
		this.aFloat113 = -this.aFloat113;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I[F)[F")
	public float[] method6097(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat112;
		arg0[2] = this.aFloat110;
		arg0[3] = 0.0F;
		arg0[14] = 0.0F;
		arg0[12] = 0.0F;
		arg0[7] = 0.0F;
		arg0[10] = this.aFloat114;
		arg0[13] = 0.0F;
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat115;
		arg0[15] = 0.0F;
		arg0[9] = this.aFloat113;
		arg0[4] = this.aFloat117;
		arg0[5] = this.aFloat109;
		arg0[6] = this.aFloat119;
		arg0[0] = this.aFloat120;
		return arg0;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(IFFF)F")
	public float method6098(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat109 * arg0 + this.aFloat117 * arg1 + this.aFloat119 * arg2 + this.aFloat116;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(III)V")
	@Override
	public void method9509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat116 += (float) arg1;
		this.aFloat108 += (float) arg0;
		this.aFloat111 += (float) arg2;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(FFZF)V")
	public void method6099(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat109 = arg0;
		this.aFloat110 = 0.0F;
		this.aFloat114 = arg2;
		this.aFloat117 = 0.0F;
		this.aFloat116 = 0.0F;
		this.aFloat115 = 0.0F;
		this.aFloat112 = 0.0F;
		this.aFloat120 = arg1;
		this.aFloat108 = 0.0F;
		this.aFloat113 = 0.0F;
		this.aFloat111 = 0.0F;
		this.aFloat119 = 0.0F;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(III[I)V")
	@Override
	public void method9519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat111 + (float) arg1 * this.aFloat113 + (float) arg0 * this.aFloat115 + this.aFloat114 * (float) arg2);
		arg3[0] = (int) (this.aFloat108 + (float) arg2 * this.aFloat110 + this.aFloat120 * (float) arg0 + (float) arg1 * this.aFloat112);
		arg3[1] = (int) ((float) arg2 * this.aFloat119 + (float) arg1 * this.aFloat109 + this.aFloat117 * (float) arg0 + this.aFloat116);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!cl;I)V")
	public void method6100(@OriginalArg(0) Class58 arg0) {
		@Pc(18) Class58_Sub2 local18 = (Class58_Sub2) arg0;
		@Pc(21) float local21 = this.aFloat120;
		@Pc(24) float local24 = this.aFloat117;
		@Pc(27) float local27 = this.aFloat112;
		@Pc(30) float local30 = this.aFloat109;
		@Pc(33) float local33 = this.aFloat110;
		@Pc(36) float local36 = this.aFloat119;
		@Pc(39) float local39 = this.aFloat108;
		this.aFloat120 = local18.aFloat110 * this.aFloat115 + local24 * local18.aFloat112 + local21 * local18.aFloat120;
		@Pc(59) float local59 = this.aFloat116;
		this.aFloat117 = this.aFloat115 * local18.aFloat119 + local18.aFloat109 * local24 + local21 * local18.aFloat117;
		this.aFloat115 = this.aFloat115 * local18.aFloat114 + local24 * local18.aFloat113 + local18.aFloat115 * local21;
		this.aFloat109 = local18.aFloat109 * local30 + local18.aFloat117 * local27 + this.aFloat113 * local18.aFloat119;
		this.aFloat112 = local27 * local18.aFloat120 + local18.aFloat112 * local30 + local18.aFloat110 * this.aFloat113;
		this.aFloat119 = local36 * local18.aFloat109 + local18.aFloat117 * local33 + local18.aFloat119 * this.aFloat114;
		this.aFloat113 = local18.aFloat113 * local30 + local27 * local18.aFloat115 + local18.aFloat114 * this.aFloat113;
		this.aFloat110 = local33 * local18.aFloat120 + local18.aFloat112 * local36 + local18.aFloat110 * this.aFloat114;
		this.aFloat114 = local18.aFloat114 * this.aFloat114 + local18.aFloat113 * local36 + local18.aFloat115 * local33;
		this.aFloat108 = local18.aFloat108 + this.aFloat111 * local18.aFloat110 + local59 * local18.aFloat112 + local39 * local18.aFloat120;
		this.aFloat116 = local59 * local18.aFloat109 + local39 * local18.aFloat117 + this.aFloat111 * local18.aFloat119 + local18.aFloat116;
		this.aFloat111 = local39 * local18.aFloat115 + local18.aFloat113 * local59 + local18.aFloat114 * this.aFloat111 + local18.aFloat111;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!cl;Lclient!cl;)V")
	public void method6101(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1) {
		@Pc(6) Class58_Sub2 local6 = (Class58_Sub2) arg0;
		@Pc(9) Class58_Sub2 local9 = (Class58_Sub2) arg1;
		this.aFloat120 = local9.aFloat117 * local6.aFloat112 + local9.aFloat120 * local6.aFloat120 + local9.aFloat115 * local6.aFloat110;
		this.aFloat117 = local9.aFloat115 * local6.aFloat119 + local9.aFloat120 * local6.aFloat117 + local6.aFloat109 * local9.aFloat117;
		this.aFloat115 = local9.aFloat115 * local6.aFloat114 + local9.aFloat117 * local6.aFloat113 + local9.aFloat120 * local6.aFloat115;
		this.aFloat112 = local6.aFloat112 * local9.aFloat109 + local9.aFloat112 * local6.aFloat120 + local9.aFloat113 * local6.aFloat110;
		this.aFloat109 = local6.aFloat119 * local9.aFloat113 + local9.aFloat109 * local6.aFloat109 + local9.aFloat112 * local6.aFloat117;
		this.aFloat113 = local6.aFloat114 * local9.aFloat113 + local6.aFloat113 * local9.aFloat109 + local9.aFloat112 * local6.aFloat115;
		this.aFloat110 = local6.aFloat112 * local9.aFloat119 + local9.aFloat110 * local6.aFloat120 + local9.aFloat114 * local6.aFloat110;
		this.aFloat119 = local6.aFloat117 * local9.aFloat110 + local6.aFloat109 * local9.aFloat119 + local9.aFloat114 * local6.aFloat119;
		this.aFloat108 = local6.aFloat108 + local6.aFloat112 * local9.aFloat116 + local9.aFloat108 * local6.aFloat120 + local9.aFloat111 * local6.aFloat110;
		this.aFloat114 = local9.aFloat119 * local6.aFloat113 + local6.aFloat115 * local9.aFloat110 + local6.aFloat114 * local9.aFloat114;
		this.aFloat116 = local6.aFloat116 + local9.aFloat116 * local6.aFloat109 + local9.aFloat108 * local6.aFloat117 + local9.aFloat111 * local6.aFloat119;
		this.aFloat111 = local9.aFloat108 * local6.aFloat115 + local6.aFloat113 * local9.aFloat116 + local6.aFloat114 * local9.aFloat111 + local6.aFloat111;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(FBFF)V")
	public void method6102(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat117 *= arg0;
		this.aFloat114 *= arg2;
		this.aFloat116 *= arg0;
		this.aFloat119 *= arg0;
		this.aFloat110 *= arg1;
		this.aFloat115 *= arg2;
		this.aFloat113 *= arg2;
		this.aFloat112 *= arg1;
		this.aFloat120 *= arg1;
		this.aFloat108 *= arg1;
		this.aFloat111 *= arg2;
		this.aFloat109 *= arg0;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(III[I)V")
	@Override
	public void method9512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat119 * (float) arg2 + (float) arg0 * this.aFloat117 + this.aFloat109 * (float) arg1);
		arg3[0] = (int) ((float) arg0 * this.aFloat120 + this.aFloat112 * (float) arg1 + (float) arg2 * this.aFloat110);
		arg3[2] = (int) (this.aFloat114 * (float) arg2 + (float) arg0 * this.aFloat115 + (float) arg1 * this.aFloat113);
	}

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "(I)V")
	@Override
	public void method9521(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat120;
		@Pc(21) float local21 = this.aFloat112;
		@Pc(24) float local24 = this.aFloat110;
		@Pc(27) float local27 = this.aFloat108;
		this.aFloat120 = this.aFloat115 * local15 + local9 * local18;
		this.aFloat112 = local21 * local9 + this.aFloat113 * local15;
		this.aFloat115 = local9 * this.aFloat115 - local15 * local18;
		this.aFloat113 = local9 * this.aFloat113 - local21 * local15;
		this.aFloat110 = this.aFloat114 * local15 + local24 * local9;
		this.aFloat114 = local9 * this.aFloat114 - local15 * local24;
		this.aFloat108 = local27 * local9 + this.aFloat111 * local15;
		this.aFloat111 = local9 * this.aFloat111 - local27 * local15;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
	@Override
	public void method9517(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat120;
		@Pc(21) float local21 = this.aFloat112;
		@Pc(24) float local24 = this.aFloat110;
		this.aFloat120 = local9 * local18 - this.aFloat117 * local15;
		@Pc(37) float local37 = this.aFloat108;
		this.aFloat117 = local9 * this.aFloat117 + local15 * local18;
		this.aFloat112 = local21 * local9 - this.aFloat109 * local15;
		this.aFloat109 = this.aFloat109 * local9 + local21 * local15;
		this.aFloat110 = local24 * local9 - this.aFloat119 * local15;
		this.aFloat108 = local9 * local37 - this.aFloat116 * local15;
		this.aFloat119 = local9 * this.aFloat119 + local15 * local24;
		this.aFloat116 = local15 * local37 + local9 * this.aFloat116;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)V")
	@Override
	public void method9524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat111 = (float) arg2;
		this.aFloat108 = (float) arg0;
		this.aFloat120 = this.aFloat109 = this.aFloat114 = 1.0F;
		this.aFloat116 = (float) arg1;
		this.aFloat117 = this.aFloat115 = this.aFloat112 = this.aFloat113 = this.aFloat110 = this.aFloat119 = 0.0F;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class3_Sub1_Sub17.aFloatArray47[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub17.aFloatArray46[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class3_Sub1_Sub17.aFloatArray47[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class3_Sub1_Sub17.aFloatArray46[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class3_Sub1_Sub17.aFloatArray47[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class3_Sub1_Sub17.aFloatArray46[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat110 = local33 * -local27 + local47 * local21;
		this.aFloat117 = local27 * local43 + local39 * -local21;
		this.aFloat114 = local9 * local21;
		this.aFloat120 = local47 * local27 + local33 * local21;
		this.aFloat115 = local27 * local9;
		this.aFloat113 = -local15;
		this.aFloat112 = local39 * local9;
		this.aFloat119 = local27 * local39 + local43 * local21;
		this.aFloat109 = local33 * local9;
		this.aFloat116 = -((float) arg2 * this.aFloat119) + (float) -arg0 * this.aFloat117 - this.aFloat109 * (float) arg1;
		this.aFloat108 = -(this.aFloat112 * (float) arg1) + this.aFloat120 * (float) -arg0 - (float) arg2 * this.aFloat110;
		this.aFloat111 = -((float) arg1 * this.aFloat113) + (float) -arg0 * this.aFloat115 - (float) arg2 * this.aFloat114;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9522() {
		@Pc(7) Class58_Sub2 local7 = new Class58_Sub2();
		local7.aFloat112 = this.aFloat112;
		local7.aFloat110 = this.aFloat110;
		local7.aFloat113 = this.aFloat113;
		local7.aFloat114 = this.aFloat114;
		local7.aFloat116 = this.aFloat116;
		local7.aFloat111 = this.aFloat111;
		local7.aFloat120 = this.aFloat120;
		local7.aFloat119 = this.aFloat119;
		local7.aFloat108 = this.aFloat108;
		local7.aFloat115 = this.aFloat115;
		local7.aFloat117 = this.aFloat117;
		local7.aFloat109 = this.aFloat109;
		return local7;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(FFBF)F")
	public float method6103(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat111 + arg1 * this.aFloat114 + this.aFloat113 * arg2 + arg0 * this.aFloat115;
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "(III[I)V")
	@Override
	public void method9511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat111);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat116);
		@Pc(20) int local20 = (int) ((float) arg0 - this.aFloat108);
		arg3[2] = (int) (this.aFloat119 * (float) local13 + this.aFloat110 * (float) local20 + (float) local6 * this.aFloat114);
		arg3[1] = (int) ((float) local6 * this.aFloat113 + (float) local13 * this.aFloat109 + this.aFloat112 * (float) local20);
		arg3[0] = (int) ((float) local20 * this.aFloat120 + (float) local13 * this.aFloat117 + (float) local6 * this.aFloat115);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!cl;)V")
	public void method6105(@OriginalArg(1) Class58 arg0) {
		@Pc(6) Class58_Sub2 local6 = (Class58_Sub2) arg0;
		this.aFloat113 = local6.aFloat113;
		this.aFloat110 = local6.aFloat110;
		this.aFloat112 = local6.aFloat112;
		this.aFloat111 = 0.0F;
		this.aFloat109 = local6.aFloat109;
		this.aFloat117 = local6.aFloat117;
		this.aFloat114 = local6.aFloat114;
		this.aFloat119 = local6.aFloat119;
		this.aFloat115 = local6.aFloat115;
		this.aFloat116 = 0.0F;
		this.aFloat108 = 0.0F;
		this.aFloat120 = local6.aFloat120;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(Lclient!cl;I)V")
	public void method6106(@OriginalArg(0) Class58 arg0) {
		@Pc(6) Class58_Sub2 local6 = (Class58_Sub2) arg0;
		this.aFloat112 = local6.aFloat117;
		this.aFloat120 = local6.aFloat120;
		this.aFloat110 = local6.aFloat115;
		this.aFloat117 = local6.aFloat112;
		this.aFloat115 = local6.aFloat110;
		this.aFloat109 = local6.aFloat109;
		this.aFloat119 = local6.aFloat113;
		this.aFloat114 = local6.aFloat114;
		this.aFloat113 = local6.aFloat119;
		this.aFloat108 = -(local6.aFloat111 * this.aFloat110 + this.aFloat120 * local6.aFloat108 + local6.aFloat116 * this.aFloat112);
		this.aFloat116 = -(this.aFloat117 * local6.aFloat108 + local6.aFloat116 * this.aFloat109 + local6.aFloat111 * this.aFloat119);
		this.aFloat111 = -(this.aFloat114 * local6.aFloat111 + local6.aFloat116 * this.aFloat113 + this.aFloat115 * local6.aFloat108);
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "([FB)[F")
	public float[] method6107(@OriginalArg(0) float[] arg0) {
		arg0[5] = this.aFloat109;
		arg0[2] = this.aFloat110;
		arg0[6] = this.aFloat119;
		arg0[8] = this.aFloat115;
		arg0[0] = this.aFloat120;
		arg0[3] = this.aFloat108;
		arg0[11] = this.aFloat111;
		arg0[9] = this.aFloat113;
		arg0[15] = 1.0F;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat114;
		arg0[12] = 0.0F;
		arg0[4] = this.aFloat117;
		arg0[7] = this.aFloat116;
		arg0[13] = 0.0F;
		arg0[1] = this.aFloat112;
		return arg0;
	}

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "(I)V")
	@Override
	public void method9510(@OriginalArg(0) int arg0) {
		this.aFloat120 = 1.0F;
		this.aFloat109 = this.aFloat114 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		this.aFloat113 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat119 = -this.aFloat113;
		this.aFloat112 = this.aFloat110 = this.aFloat108 = this.aFloat117 = this.aFloat116 = this.aFloat115 = this.aFloat111 = 0.0F;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B[F)[F")
	public float[] method6109(@OriginalArg(1) float[] arg0) {
		arg0[5] = this.aFloat109;
		arg0[0] = this.aFloat120;
		arg0[3] = this.aFloat108;
		arg0[4] = this.aFloat117;
		arg0[1] = this.aFloat112;
		arg0[7] = this.aFloat116;
		arg0[2] = this.aFloat110;
		arg0[6] = this.aFloat119;
		return arg0;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZFFF)V")
	public void method6110(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat111 = arg2;
		this.aFloat117 = this.aFloat115 = this.aFloat112 = this.aFloat113 = this.aFloat110 = this.aFloat119 = 0.0F;
		this.aFloat120 = this.aFloat109 = this.aFloat114 = 1.0F;
		this.aFloat108 = arg1;
		this.aFloat116 = arg0;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V")
	@Override
	public void method9513(@OriginalArg(0) int arg0) {
		this.aFloat114 = 1.0F;
		this.aFloat120 = this.aFloat109 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		this.aFloat117 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat112 = -this.aFloat117;
		this.aFloat110 = this.aFloat108 = this.aFloat119 = this.aFloat116 = this.aFloat115 = this.aFloat113 = this.aFloat111 = 0.0F;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(FIFFIIB)V")
	public void method6111(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 == 0) {
			this.aFloat116 = arg3 - (float) arg1;
			this.aFloat108 = arg0 - (float) arg5;
			this.aFloat117 = this.aFloat115 = this.aFloat112 = this.aFloat113 = this.aFloat110 = this.aFloat119 = 0.0F;
			this.aFloat109 = (float) (arg1 * 2);
			this.aFloat114 = 1.0F;
			this.aFloat111 = arg2;
			this.aFloat120 = (float) (arg5 * 2);
			return;
		}
		@Pc(72) float local72 = Class3_Sub1_Sub17.aFloatArray47[arg4 & 0x3FFF];
		@Pc(78) float local78 = Class3_Sub1_Sub17.aFloatArray46[arg4 & 0x3FFF];
		this.aFloat116 = arg3 + (-0.5F * local78 - local72 * 0.5F) * (float) (arg1 * 2);
		this.aFloat112 = (float) arg1 * -2.0F * local78;
		this.aFloat114 = 1.0F;
		this.aFloat120 = (float) arg5 * 2.0F * local72;
		this.aFloat117 = local78 * 2.0F * (float) arg5;
		this.aFloat109 = (float) arg1 * 2.0F * local72;
		this.aFloat111 = arg2;
		this.aFloat115 = this.aFloat113 = this.aFloat110 = this.aFloat119 = 0.0F;
		this.aFloat108 = arg0 + (float) (arg5 * 2) * (local78 * 0.5F - local72 * 0.5F);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(FFFB)F")
	public float method6112(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat110 * arg1 + arg2 * this.aFloat112 + arg0 * this.aFloat120 + this.aFloat108;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(FFFFBFFFFF)V")
	public void method6113(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat119 = arg0;
		this.aFloat108 = 0.0F;
		this.aFloat120 = arg6;
		this.aFloat112 = arg1;
		this.aFloat117 = arg5;
		this.aFloat111 = 0.0F;
		this.aFloat113 = arg4;
		this.aFloat114 = arg2;
		this.aFloat110 = arg8;
		this.aFloat109 = arg3;
		this.aFloat115 = arg7;
		this.aFloat116 = 0.0F;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "()V")
	@Override
	public void method9508() {
		this.aFloat117 = this.aFloat115 = this.aFloat112 = this.aFloat113 = this.aFloat110 = this.aFloat119 = this.aFloat108 = this.aFloat116 = this.aFloat111 = 0.0F;
		this.aFloat120 = this.aFloat109 = this.aFloat114 = 1.0F;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(F[FFBF)V")
	public void method6114(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		arg1[1] = this.aFloat119 * arg0 + this.aFloat117 * arg3 + this.aFloat109 * arg2;
		arg1[2] = this.aFloat115 * arg3 + this.aFloat113 * arg2 + this.aFloat114 * arg0;
		arg1[0] = this.aFloat110 * arg0 + this.aFloat112 * arg2 + this.aFloat120 * arg3;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "([I)V")
	@Override
	public void method9507(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat108;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat116;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat111;
		arg0[2] = (int) (this.aFloat110 * local12 + local21 * this.aFloat119 + local30 * this.aFloat114);
		arg0[1] = (int) (local12 * this.aFloat112 + this.aFloat109 * local21 + local30 * this.aFloat113);
		arg0[0] = (int) (local12 * this.aFloat120 + local21 * this.aFloat117 + this.aFloat115 * local30);
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "(I)V")
	@Override
	public void method9518(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub1_Sub17.aFloatArray47[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub1_Sub17.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat117;
		@Pc(21) float local21 = this.aFloat109;
		@Pc(24) float local24 = this.aFloat119;
		@Pc(27) float local27 = this.aFloat116;
		this.aFloat117 = local9 * local18 - local15 * this.aFloat115;
		this.aFloat109 = local9 * local21 - local15 * this.aFloat113;
		this.aFloat115 = local9 * this.aFloat115 + local18 * local15;
		this.aFloat119 = local24 * local9 - local15 * this.aFloat114;
		this.aFloat113 = local21 * local15 + local9 * this.aFloat113;
		this.aFloat114 = local24 * local15 + local9 * this.aFloat114;
		this.aFloat116 = local9 * local27 - local15 * this.aFloat111;
		this.aFloat111 = this.aFloat111 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!cl;)V")
	@Override
	public void method9516(@OriginalArg(0) Class58 arg0) {
		@Pc(6) Class58_Sub2 local6 = (Class58_Sub2) arg0;
		this.aFloat117 = local6.aFloat117;
		this.aFloat109 = local6.aFloat109;
		this.aFloat115 = local6.aFloat115;
		this.aFloat120 = local6.aFloat120;
		this.aFloat111 = local6.aFloat111;
		this.aFloat116 = local6.aFloat116;
		this.aFloat114 = local6.aFloat114;
		this.aFloat108 = local6.aFloat108;
		this.aFloat113 = local6.aFloat113;
		this.aFloat119 = local6.aFloat119;
		this.aFloat112 = local6.aFloat112;
		this.aFloat110 = local6.aFloat110;
	}
}
