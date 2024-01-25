import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class81_Sub3 extends Class81 {

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "F")
	public float aFloat113;

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "F")
	public float aFloat115;

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "F")
	public float aFloat116;

	@OriginalMember(owner = "client!jw", name = "z", descriptor = "F")
	public float aFloat117;

	@OriginalMember(owner = "client!jw", name = "B", descriptor = "F")
	public float aFloat118;

	@OriginalMember(owner = "client!jw", name = "F", descriptor = "F")
	public float aFloat119;

	@OriginalMember(owner = "client!jw", name = "G", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!jw", name = "H", descriptor = "F")
	public float aFloat121;

	@OriginalMember(owner = "client!jw", name = "I", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!jw", name = "J", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "()V")
	public Class81_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!jw", name = "BA", descriptor = "(III[I)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat119);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat112);
		@Pc(20) int local20 = (int) ((float) arg0 - this.aFloat120);
		arg3[2] = (int) ((float) local20 * this.aFloat116 + (float) local13 * this.aFloat115 + this.aFloat113 * (float) local6);
		arg3[0] = (int) ((float) local20 * this.aFloat118 + this.aFloat122 * (float) local13 + this.aFloat123 * (float) local6);
		arg3[1] = (int) (this.aFloat121 * (float) local13 + (float) local20 * this.aFloat114 + (float) local6 * this.aFloat117);
	}

	@OriginalMember(owner = "client!jw", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat118 = 1.0F;
		this.aFloat121 = this.aFloat113 = Class354.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat117 = Class354.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat114 = this.aFloat116 = this.aFloat120 = this.aFloat122 = this.aFloat112 = this.aFloat123 = this.aFloat119 = 0.0F;
		this.aFloat115 = -this.aFloat117;
	}

	@OriginalMember(owner = "client!jw", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class354.aFloatArray68[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class354.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat118;
		@Pc(21) float local21 = this.aFloat114;
		@Pc(24) float local24 = this.aFloat116;
		@Pc(27) float local27 = this.aFloat120;
		this.aFloat118 = local9 * local18 - this.aFloat122 * local15;
		this.aFloat114 = local9 * local21 - this.aFloat121 * local15;
		this.aFloat122 = local9 * this.aFloat122 + local18 * local15;
		this.aFloat116 = local24 * local9 - this.aFloat115 * local15;
		this.aFloat121 = local15 * local21 + this.aFloat121 * local9;
		this.aFloat120 = local9 * local27 - this.aFloat112 * local15;
		this.aFloat115 = local9 * this.aFloat115 + local15 * local24;
		this.aFloat112 = local27 * local15 + this.aFloat112 * local9;
	}

	@OriginalMember(owner = "client!jw", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class81 arg0) {
		@Pc(6) Class81_Sub3 local6 = (Class81_Sub3) arg0;
		this.aFloat115 = local6.aFloat115;
		this.aFloat113 = local6.aFloat113;
		this.aFloat116 = local6.aFloat116;
		this.aFloat122 = local6.aFloat122;
		this.aFloat119 = local6.aFloat119;
		this.aFloat114 = local6.aFloat114;
		this.aFloat123 = local6.aFloat123;
		this.aFloat120 = local6.aFloat120;
		this.aFloat112 = local6.aFloat112;
		this.aFloat118 = local6.aFloat118;
		this.aFloat117 = local6.aFloat117;
		this.aFloat121 = local6.aFloat121;
	}

	@OriginalMember(owner = "client!jw", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class354.aFloatArray68[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class354.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat122;
		@Pc(21) float local21 = this.aFloat121;
		@Pc(24) float local24 = this.aFloat115;
		this.aFloat122 = local18 * local9 - local15 * this.aFloat123;
		@Pc(38) float local38 = this.aFloat112;
		this.aFloat121 = local9 * local21 - this.aFloat117 * local15;
		this.aFloat123 = local18 * local15 + this.aFloat123 * local9;
		this.aFloat117 = local21 * local15 + local9 * this.aFloat117;
		this.aFloat115 = local24 * local9 - this.aFloat113 * local15;
		this.aFloat113 = local15 * local24 + this.aFloat113 * local9;
		this.aFloat112 = local38 * local9 - this.aFloat119 * local15;
		this.aFloat119 = this.aFloat119 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!jw", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat113 = 1.0F;
		this.aFloat118 = this.aFloat121 = Class354.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat122 = Class354.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat116 = this.aFloat120 = this.aFloat115 = this.aFloat112 = this.aFloat123 = this.aFloat117 = this.aFloat119 = 0.0F;
		this.aFloat114 = -this.aFloat122;
	}

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat121 = 1.0F;
		this.aFloat118 = this.aFloat113 = Class354.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat116 = Class354.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat123 = -this.aFloat116;
		this.aFloat114 = this.aFloat120 = this.aFloat122 = this.aFloat115 = this.aFloat112 = this.aFloat117 = this.aFloat119 = 0.0F;
	}

	@OriginalMember(owner = "client!jw", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class354.aFloatArray68[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class354.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat118;
		@Pc(21) float local21 = this.aFloat114;
		@Pc(24) float local24 = this.aFloat116;
		this.aFloat118 = local9 * local18 + local15 * this.aFloat123;
		@Pc(37) float local37 = this.aFloat120;
		this.aFloat123 = local9 * this.aFloat123 - local15 * local18;
		this.aFloat114 = this.aFloat117 * local15 + local21 * local9;
		this.aFloat116 = local15 * this.aFloat113 + local9 * local24;
		this.aFloat117 = local9 * this.aFloat117 - local21 * local15;
		this.aFloat120 = local37 * local9 + local15 * this.aFloat119;
		this.aFloat113 = this.aFloat113 * local9 - local24 * local15;
		this.aFloat119 = local9 * this.aFloat119 - local15 * local37;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat119 + (float) arg2 * this.aFloat113 + this.aFloat117 * (float) arg1 + this.aFloat123 * (float) arg0);
		arg3[0] = (int) ((float) arg1 * this.aFloat114 + this.aFloat118 * (float) arg0 + (float) arg2 * this.aFloat116 + this.aFloat120);
		arg3[1] = (int) (this.aFloat121 * (float) arg1 + (float) arg0 * this.aFloat122 + (float) arg2 * this.aFloat115 + this.aFloat112);
	}

	@OriginalMember(owner = "client!jw", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat120;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat112;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat119;
		arg0[2] = (int) (local28 * this.aFloat113 + this.aFloat116 * local11 + this.aFloat115 * local19);
		arg0[0] = (int) (local11 * this.aFloat118 + this.aFloat122 * local19 + this.aFloat123 * local28);
		arg0[1] = (int) (local11 * this.aFloat114 + this.aFloat121 * local19 + local28 * this.aFloat117);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class81 method6585() {
		@Pc(7) Class81_Sub3 local7 = new Class81_Sub3();
		local7.aFloat118 = this.aFloat118;
		local7.aFloat117 = this.aFloat117;
		local7.aFloat121 = this.aFloat121;
		local7.aFloat115 = this.aFloat115;
		local7.aFloat112 = this.aFloat112;
		local7.aFloat119 = this.aFloat119;
		local7.aFloat116 = this.aFloat116;
		local7.aFloat113 = this.aFloat113;
		local7.aFloat114 = this.aFloat114;
		local7.aFloat120 = this.aFloat120;
		local7.aFloat123 = this.aFloat123;
		local7.aFloat122 = this.aFloat122;
		return local7;
	}

	@OriginalMember(owner = "client!jw", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat112 += arg1;
		this.aFloat119 += arg2;
		this.aFloat120 += arg0;
	}

	@OriginalMember(owner = "client!jw", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class354.aFloatArray68[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class354.aFloatArray69[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class354.aFloatArray68[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class354.aFloatArray69[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class354.aFloatArray68[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class354.aFloatArray69[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat122 = local43 * local27 + -local21 * local39;
		this.aFloat123 = local27 * local9;
		this.aFloat117 = -local15;
		this.aFloat118 = local33 * local21 + local47 * local27;
		this.aFloat115 = local27 * local39 + local43 * local21;
		this.aFloat116 = -local27 * local33 + local47 * local21;
		this.aFloat114 = local9 * local39;
		this.aFloat113 = local9 * local21;
		this.aFloat121 = local33 * local9;
		this.aFloat112 = -(this.aFloat121 * (float) arg1) + this.aFloat122 * (float) -arg0 - (float) arg2 * this.aFloat115;
		this.aFloat120 = -((float) arg2 * this.aFloat116) - this.aFloat114 * (float) arg1 + (float) -arg0 * this.aFloat118;
		this.aFloat119 = -((float) arg2 * this.aFloat113) + (float) -arg0 * this.aFloat123 - (float) arg1 * this.aFloat117;
	}

	@OriginalMember(owner = "client!jw", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg1 * this.aFloat114 + this.aFloat118 * (float) arg0 + this.aFloat116 * (float) arg2);
		arg3[2] = (int) (this.aFloat117 * (float) arg1 + this.aFloat123 * (float) arg0 + this.aFloat113 * (float) arg2);
		arg3[1] = (int) ((float) arg0 * this.aFloat122 + this.aFloat121 * (float) arg1 + this.aFloat115 * (float) arg2);
	}

	@OriginalMember(owner = "client!jw", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat118 = this.aFloat121 = this.aFloat113 = 1.0F;
		this.aFloat122 = this.aFloat123 = this.aFloat114 = this.aFloat117 = this.aFloat116 = this.aFloat115 = this.aFloat120 = this.aFloat112 = this.aFloat119 = 0.0F;
	}

	@OriginalMember(owner = "client!jw", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat112 = arg1;
		this.aFloat120 = arg0;
		this.aFloat122 = this.aFloat123 = this.aFloat114 = this.aFloat117 = this.aFloat116 = this.aFloat115 = 0.0F;
		this.aFloat118 = this.aFloat121 = this.aFloat113 = 1.0F;
		this.aFloat119 = arg2;
	}
}
