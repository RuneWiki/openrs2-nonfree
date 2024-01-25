import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class47_Sub3 extends Class47 {

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "F")
	public float aFloat253;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "F")
	public float aFloat254;

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "F")
	public float aFloat255;

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "F")
	public float aFloat256;

	@OriginalMember(owner = "client!tv", name = "z", descriptor = "F")
	public float aFloat257;

	@OriginalMember(owner = "client!tv", name = "A", descriptor = "F")
	public float aFloat258;

	@OriginalMember(owner = "client!tv", name = "C", descriptor = "F")
	public float aFloat259;

	@OriginalMember(owner = "client!tv", name = "T", descriptor = "F")
	public float aFloat260;

	@OriginalMember(owner = "client!tv", name = "W", descriptor = "F")
	public float aFloat261;

	@OriginalMember(owner = "client!tv", name = "Z", descriptor = "F")
	public float aFloat262;

	@OriginalMember(owner = "client!tv", name = "hb", descriptor = "F")
	public float aFloat263;

	@OriginalMember(owner = "client!tv", name = "ib", descriptor = "F")
	public float aFloat264;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "()V")
	public Class47_Sub3() {
		this.method7878();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "([FZ)[F")
	public float[] method7880(@OriginalArg(0) float[] arg0) {
		arg0[3] = this.aFloat254;
		arg0[0] = this.aFloat257;
		arg0[13] = 0.0F;
		arg0[2] = this.aFloat253;
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat259;
		arg0[5] = this.aFloat255;
		arg0[14] = 0.0F;
		arg0[4] = this.aFloat264;
		arg0[1] = this.aFloat261;
		arg0[11] = this.aFloat263;
		arg0[6] = this.aFloat262;
		arg0[7] = this.aFloat256;
		arg0[12] = 0.0F;
		arg0[10] = this.aFloat258;
		arg0[9] = this.aFloat260;
		return arg0;
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat263 + this.aFloat258 * (float) arg2 + this.aFloat259 * (float) arg0 + (float) arg1 * this.aFloat260);
		arg3[0] = (int) (this.aFloat254 + this.aFloat261 * (float) arg1 + this.aFloat257 * (float) arg0 + (float) arg2 * this.aFloat253);
		arg3[1] = (int) (this.aFloat256 + this.aFloat255 * (float) arg1 + this.aFloat264 * (float) arg0 + this.aFloat262 * (float) arg2);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!wc;I)V")
	public void method7881(@OriginalArg(0) Class47 arg0) {
		@Pc(6) Class47_Sub3 local6 = (Class47_Sub3) arg0;
		this.aFloat261 = local6.aFloat264;
		this.aFloat253 = local6.aFloat259;
		this.aFloat257 = local6.aFloat257;
		this.aFloat262 = local6.aFloat260;
		this.aFloat264 = local6.aFloat261;
		this.aFloat259 = local6.aFloat253;
		this.aFloat255 = local6.aFloat255;
		this.aFloat258 = local6.aFloat258;
		this.aFloat254 = -(this.aFloat257 * local6.aFloat254 + local6.aFloat256 * this.aFloat261 + this.aFloat253 * local6.aFloat263);
		this.aFloat260 = local6.aFloat262;
		this.aFloat256 = -(this.aFloat255 * local6.aFloat256 + this.aFloat264 * local6.aFloat254 + local6.aFloat263 * this.aFloat262);
		this.aFloat263 = -(this.aFloat258 * local6.aFloat263 + local6.aFloat256 * this.aFloat260 + this.aFloat259 * local6.aFloat254);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IFFF)V")
	public void method7882(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat256 += arg1;
		this.aFloat263 += arg2;
		this.aFloat254 += arg0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(FBFF)F")
	public float method7883(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat263 + this.aFloat258 * arg0 + arg1 * this.aFloat259 + arg2 * this.aFloat260;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class23_Sub14.aFloatArray49[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub14.aFloatArray48[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class23_Sub14.aFloatArray49[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class23_Sub14.aFloatArray48[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class23_Sub14.aFloatArray49[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class23_Sub14.aFloatArray48[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat258 = local21 * local9;
		this.aFloat257 = local27 * local47 + local21 * local33;
		this.aFloat264 = local27 * local43 + local39 * -local21;
		this.aFloat259 = local9 * local27;
		this.aFloat253 = -local27 * local33 + local21 * local47;
		this.aFloat255 = local33 * local9;
		this.aFloat261 = local39 * local9;
		this.aFloat260 = -local15;
		this.aFloat262 = local43 * local21 + local27 * local39;
		this.aFloat254 = (float) -arg0 * this.aFloat257 - (float) arg1 * this.aFloat261 - this.aFloat253 * (float) arg2;
		this.aFloat256 = -((float) arg2 * this.aFloat262) + (float) -arg0 * this.aFloat264 - (float) arg1 * this.aFloat255;
		this.aFloat263 = (float) -arg0 * this.aFloat259 - this.aFloat260 * (float) arg1 - this.aFloat258 * (float) arg2;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
	public void method7884() {
		this.aFloat264 = -this.aFloat264;
		this.aFloat260 = -this.aFloat260;
		this.aFloat256 = -this.aFloat256;
		this.aFloat259 = -this.aFloat259;
		this.aFloat255 = -this.aFloat255;
		this.aFloat263 = -this.aFloat263;
		this.aFloat262 = -this.aFloat262;
		this.aFloat258 = -this.aFloat258;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I[F)[F")
	public float[] method7885(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloat261;
		arg0[10] = this.aFloat263;
		arg0[3] = 0.0F;
		arg0[15] = 1.0F;
		arg0[14] = 0.0F;
		arg0[0] = this.aFloat257;
		arg0[5] = this.aFloat255;
		arg0[1] = this.aFloat264;
		arg0[6] = 0.0F;
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat254;
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		arg0[9] = this.aFloat256;
		arg0[2] = 0.0F;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)V")
	@Override
	public void method7863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat256 = arg1;
		this.aFloat257 = this.aFloat255 = this.aFloat258 = 1.0F;
		this.aFloat254 = arg0;
		this.aFloat264 = this.aFloat259 = this.aFloat261 = this.aFloat260 = this.aFloat253 = this.aFloat262 = 0.0F;
		this.aFloat263 = arg2;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
	@Override
	public void method7861(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat257;
		@Pc(21) float local21 = this.aFloat261;
		@Pc(24) float local24 = this.aFloat253;
		this.aFloat257 = local9 * local18 - this.aFloat264 * local15;
		@Pc(38) float local38 = this.aFloat254;
		this.aFloat261 = local21 * local9 - local15 * this.aFloat255;
		this.aFloat264 = local15 * local18 + local9 * this.aFloat264;
		this.aFloat253 = local9 * local24 - this.aFloat262 * local15;
		this.aFloat255 = this.aFloat255 * local9 + local15 * local21;
		this.aFloat254 = local9 * local38 - local15 * this.aFloat256;
		this.aFloat262 = local9 * this.aFloat262 + local24 * local15;
		this.aFloat256 = local15 * local38 + this.aFloat256 * local9;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZFFF)V")
	public void method7886(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat254 = arg1;
		this.aFloat256 = arg0;
		this.aFloat264 = this.aFloat259 = this.aFloat261 = this.aFloat260 = this.aFloat253 = this.aFloat262 = 0.0F;
		this.aFloat263 = arg2;
		this.aFloat257 = this.aFloat255 = this.aFloat258 = 1.0F;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat253 + (float) arg1 * this.aFloat261 + (float) arg0 * this.aFloat257);
		arg3[2] = (int) ((float) arg2 * this.aFloat258 + (float) arg1 * this.aFloat260 + this.aFloat259 * (float) arg0);
		arg3[1] = (int) (this.aFloat262 * (float) arg2 + (float) arg1 * this.aFloat255 + (float) arg0 * this.aFloat264);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(FFIF)F")
	public float method7887(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat256 + this.aFloat255 * arg2 + arg0 * this.aFloat264 + this.aFloat262 * arg1;
	}

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "(I)V")
	@Override
	public void method7873(@OriginalArg(0) int arg0) {
		this.aFloat255 = 1.0F;
		this.aFloat257 = this.aFloat258 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat253 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat259 = -this.aFloat253;
		this.aFloat261 = this.aFloat254 = this.aFloat264 = this.aFloat262 = this.aFloat256 = this.aFloat260 = this.aFloat263 = 0.0F;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(FFIF)V")
	public void method7888(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat264 *= arg1;
		this.aFloat258 *= arg0;
		this.aFloat253 *= arg2;
		this.aFloat257 *= arg2;
		this.aFloat263 *= arg0;
		this.aFloat259 *= arg0;
		this.aFloat260 *= arg0;
		this.aFloat255 *= arg1;
		this.aFloat256 *= arg1;
		this.aFloat261 *= arg2;
		this.aFloat262 *= arg1;
		this.aFloat254 *= arg2;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(IFFF)F")
	public float method7889(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat253 * arg2 + arg0 * this.aFloat261 + arg1 * this.aFloat257 + this.aFloat254;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "([FFFFZ)V")
	public void method7890(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		arg0[0] = arg1 * this.aFloat253 + arg2 * this.aFloat261 + arg3 * this.aFloat257;
		arg0[2] = arg1 * this.aFloat258 + arg2 * this.aFloat260 + arg3 * this.aFloat259;
		arg0[1] = arg2 * this.aFloat255 + this.aFloat264 * arg3 + this.aFloat262 * arg1;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!wc;Lclient!wc;)V")
	public void method7891(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1) {
		@Pc(6) Class47_Sub3 local6 = (Class47_Sub3) arg0;
		@Pc(9) Class47_Sub3 local9 = (Class47_Sub3) arg1;
		this.aFloat257 = local9.aFloat259 * local6.aFloat253 + local6.aFloat261 * local9.aFloat264 + local6.aFloat257 * local9.aFloat257;
		this.aFloat264 = local6.aFloat262 * local9.aFloat259 + local6.aFloat255 * local9.aFloat264 + local9.aFloat257 * local6.aFloat264;
		this.aFloat259 = local6.aFloat258 * local9.aFloat259 + local6.aFloat260 * local9.aFloat264 + local9.aFloat257 * local6.aFloat259;
		this.aFloat261 = local9.aFloat261 * local6.aFloat257 + local9.aFloat255 * local6.aFloat261 + local6.aFloat253 * local9.aFloat260;
		this.aFloat255 = local6.aFloat262 * local9.aFloat260 + local6.aFloat264 * local9.aFloat261 + local9.aFloat255 * local6.aFloat255;
		this.aFloat260 = local6.aFloat259 * local9.aFloat261 + local6.aFloat260 * local9.aFloat255 + local9.aFloat260 * local6.aFloat258;
		this.aFloat253 = local9.aFloat253 * local6.aFloat257 + local6.aFloat261 * local9.aFloat262 + local6.aFloat253 * local9.aFloat258;
		this.aFloat262 = local9.aFloat258 * local6.aFloat262 + local6.aFloat264 * local9.aFloat253 + local9.aFloat262 * local6.aFloat255;
		this.aFloat258 = local9.aFloat258 * local6.aFloat258 + local6.aFloat259 * local9.aFloat253 + local9.aFloat262 * local6.aFloat260;
		this.aFloat254 = local6.aFloat254 + local6.aFloat253 * local9.aFloat263 + local9.aFloat256 * local6.aFloat261 + local9.aFloat254 * local6.aFloat257;
		this.aFloat256 = local6.aFloat255 * local9.aFloat256 + local9.aFloat254 * local6.aFloat264 + local9.aFloat263 * local6.aFloat262 + local6.aFloat256;
		this.aFloat263 = local6.aFloat263 + local6.aFloat259 * local9.aFloat254 + local9.aFloat256 * local6.aFloat260 + local9.aFloat263 * local6.aFloat258;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BLclient!wc;)V")
	public void method7892(@OriginalArg(1) Class47 arg0) {
		@Pc(6) Class47_Sub3 local6 = (Class47_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat257;
		@Pc(12) float local12 = this.aFloat264;
		@Pc(15) float local15 = this.aFloat261;
		@Pc(18) float local18 = this.aFloat255;
		@Pc(21) float local21 = this.aFloat253;
		@Pc(31) float local31 = this.aFloat262;
		@Pc(34) float local34 = this.aFloat254;
		this.aFloat257 = local6.aFloat261 * local12 + local6.aFloat257 * local9 + local6.aFloat253 * this.aFloat259;
		this.aFloat264 = this.aFloat259 * local6.aFloat262 + local9 * local6.aFloat264 + local12 * local6.aFloat255;
		@Pc(71) float local71 = this.aFloat256;
		this.aFloat255 = local6.aFloat264 * local15 + local6.aFloat255 * local18 + local6.aFloat262 * this.aFloat260;
		this.aFloat261 = local6.aFloat253 * this.aFloat260 + local18 * local6.aFloat261 + local15 * local6.aFloat257;
		this.aFloat259 = local6.aFloat259 * local9 + local6.aFloat260 * local12 + this.aFloat259 * local6.aFloat258;
		this.aFloat262 = this.aFloat258 * local6.aFloat262 + local6.aFloat255 * local31 + local6.aFloat264 * local21;
		this.aFloat260 = this.aFloat260 * local6.aFloat258 + local6.aFloat259 * local15 + local18 * local6.aFloat260;
		this.aFloat253 = this.aFloat258 * local6.aFloat253 + local6.aFloat257 * local21 + local31 * local6.aFloat261;
		this.aFloat254 = local6.aFloat254 + local6.aFloat257 * local34 + local6.aFloat261 * local71 + local6.aFloat253 * this.aFloat263;
		this.aFloat258 = local31 * local6.aFloat260 + local21 * local6.aFloat259 + this.aFloat258 * local6.aFloat258;
		this.aFloat256 = local6.aFloat256 + this.aFloat263 * local6.aFloat262 + local71 * local6.aFloat255 + local6.aFloat264 * local34;
		this.aFloat263 = local6.aFloat263 + local6.aFloat259 * local34 + local6.aFloat260 * local71 + local6.aFloat258 * this.aFloat263;
	}

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "(I)V")
	@Override
	public void method7871(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat257;
		@Pc(21) float local21 = this.aFloat261;
		@Pc(24) float local24 = this.aFloat253;
		this.aFloat257 = local15 * this.aFloat259 + local9 * local18;
		@Pc(37) float local37 = this.aFloat254;
		this.aFloat261 = local9 * local21 + local15 * this.aFloat260;
		this.aFloat259 = local9 * this.aFloat259 - local15 * local18;
		this.aFloat260 = this.aFloat260 * local9 - local21 * local15;
		this.aFloat253 = local24 * local9 + this.aFloat258 * local15;
		this.aFloat258 = this.aFloat258 * local9 - local15 * local24;
		this.aFloat254 = local37 * local9 + this.aFloat263 * local15;
		this.aFloat263 = local9 * this.aFloat263 - local15 * local37;
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)V")
	@Override
	public void method7870(@OriginalArg(0) int arg0) {
		this.aFloat258 = 1.0F;
		this.aFloat257 = this.aFloat255 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat264 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat261 = -this.aFloat264;
		this.aFloat253 = this.aFloat254 = this.aFloat262 = this.aFloat256 = this.aFloat259 = this.aFloat260 = this.aFloat263 = 0.0F;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "([FB)[F")
	public float[] method7895(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat261;
		arg0[6] = this.aFloat262;
		arg0[4] = this.aFloat264;
		arg0[5] = this.aFloat255;
		arg0[2] = this.aFloat253;
		arg0[0] = this.aFloat257;
		arg0[3] = this.aFloat254;
		arg0[7] = this.aFloat256;
		return arg0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!wc;)V")
	@Override
	public void method7877(@OriginalArg(0) Class47 arg0) {
		@Pc(6) Class47_Sub3 local6 = (Class47_Sub3) arg0;
		this.aFloat259 = local6.aFloat259;
		this.aFloat254 = local6.aFloat254;
		this.aFloat257 = local6.aFloat257;
		this.aFloat264 = local6.aFloat264;
		this.aFloat262 = local6.aFloat262;
		this.aFloat253 = local6.aFloat253;
		this.aFloat258 = local6.aFloat258;
		this.aFloat261 = local6.aFloat261;
		this.aFloat255 = local6.aFloat255;
		this.aFloat260 = local6.aFloat260;
		this.aFloat263 = local6.aFloat263;
		this.aFloat256 = local6.aFloat256;
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat256 += arg1;
		this.aFloat263 += arg2;
		this.aFloat254 += arg0;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "()V")
	@Override
	public void method7878() {
		this.aFloat257 = this.aFloat255 = this.aFloat258 = 1.0F;
		this.aFloat264 = this.aFloat259 = this.aFloat261 = this.aFloat260 = this.aFloat253 = this.aFloat262 = this.aFloat254 = this.aFloat256 = this.aFloat263 = 0.0F;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(BLclient!wc;)V")
	public void method7896(@OriginalArg(1) Class47 arg0) {
		@Pc(6) Class47_Sub3 local6 = (Class47_Sub3) arg0;
		this.aFloat261 = local6.aFloat261;
		this.aFloat256 = 0.0F;
		this.aFloat263 = 0.0F;
		this.aFloat260 = local6.aFloat260;
		this.aFloat253 = local6.aFloat253;
		this.aFloat259 = local6.aFloat259;
		this.aFloat264 = local6.aFloat264;
		this.aFloat255 = local6.aFloat255;
		this.aFloat257 = local6.aFloat257;
		this.aFloat258 = local6.aFloat258;
		this.aFloat254 = 0.0F;
		this.aFloat262 = local6.aFloat262;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	@Override
	public void method7858(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat264;
		@Pc(21) float local21 = this.aFloat255;
		@Pc(24) float local24 = this.aFloat262;
		@Pc(27) float local27 = this.aFloat256;
		this.aFloat264 = local9 * local18 - this.aFloat259 * local15;
		this.aFloat255 = local21 * local9 - this.aFloat260 * local15;
		this.aFloat259 = local18 * local15 + local9 * this.aFloat259;
		this.aFloat260 = local9 * this.aFloat260 + local21 * local15;
		this.aFloat262 = local9 * local24 - local15 * this.aFloat258;
		this.aFloat256 = local9 * local27 - this.aFloat263 * local15;
		this.aFloat258 = local24 * local15 + local9 * this.aFloat258;
		this.aFloat263 = this.aFloat263 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "([I)V")
	@Override
	public void method7874(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat254;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat256;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat263;
		arg0[0] = (int) (local28 * this.aFloat259 + this.aFloat264 * local20 + local12 * this.aFloat257);
		arg0[2] = (int) (this.aFloat253 * local12 + local20 * this.aFloat262 + local28 * this.aFloat258);
		arg0[1] = (int) (this.aFloat261 * local12 + this.aFloat255 * local20 + this.aFloat260 * local28);
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0) {
		this.aFloat257 = 1.0F;
		this.aFloat255 = this.aFloat258 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat260 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat261 = this.aFloat253 = this.aFloat254 = this.aFloat264 = this.aFloat256 = this.aFloat259 = this.aFloat263 = 0.0F;
		this.aFloat262 = -this.aFloat260;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(F[FFFIF)V")
	public void method7897(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4) {
		@Pc(42) float local42;
		@Pc(50) float local50;
		@Pc(34) float local34;
		@Pc(26) float local26;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local26 = -arg4 / arg2;
			local34 = this.aFloat259 * local26 + this.aFloat263;
			local42 = this.aFloat254 + this.aFloat257 * local26;
			local50 = this.aFloat256 + local26 * this.aFloat264;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local26 = -arg4 / arg0;
			local34 = this.aFloat263 + local26 * this.aFloat260;
			local42 = this.aFloat261 * local26 + this.aFloat254;
			local50 = local26 * this.aFloat255 + this.aFloat256;
		} else {
			local26 = -arg4 / arg3;
			local34 = this.aFloat263 + local26 * this.aFloat258;
			local42 = this.aFloat253 * local26 + this.aFloat254;
			local50 = this.aFloat262 * local26 + this.aFloat256;
		}
		arg1[0] = arg0 * this.aFloat261 + this.aFloat257 * arg2 + arg3 * this.aFloat253;
		arg1[1] = arg0 * this.aFloat255 + this.aFloat264 * arg2 + arg3 * this.aFloat262;
		arg1[2] = arg2 * this.aFloat259 + arg0 * this.aFloat260 + arg3 * this.aFloat258;
		arg1[3] = -(local42 * arg1[0] + local50 * arg1[1] + arg1[2] * local34);
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "([FZ)[F")
	public float[] method7898(@OriginalArg(0) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[10] = this.aFloat258;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloat264;
		arg0[9] = this.aFloat260;
		arg0[12] = 0.0F;
		arg0[7] = 0.0F;
		arg0[6] = this.aFloat262;
		arg0[15] = 0.0F;
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat259;
		arg0[14] = 0.0F;
		arg0[5] = this.aFloat255;
		arg0[1] = this.aFloat261;
		arg0[0] = this.aFloat257;
		arg0[2] = this.aFloat253;
		return arg0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "()Lclient!wc;")
	@Override
	public Class47 method7867() {
		@Pc(7) Class47_Sub3 local7 = new Class47_Sub3();
		local7.aFloat261 = this.aFloat261;
		local7.aFloat259 = this.aFloat259;
		local7.aFloat263 = this.aFloat263;
		local7.aFloat254 = this.aFloat254;
		local7.aFloat262 = this.aFloat262;
		local7.aFloat257 = this.aFloat257;
		local7.aFloat253 = this.aFloat253;
		local7.aFloat255 = this.aFloat255;
		local7.aFloat258 = this.aFloat258;
		local7.aFloat264 = this.aFloat264;
		local7.aFloat256 = this.aFloat256;
		local7.aFloat260 = this.aFloat260;
		return local7;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(FFFI)V")
	public void method7901(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat256 = 0.0F;
		this.aFloat263 = 0.0F;
		this.aFloat261 = 0.0F;
		this.aFloat260 = 0.0F;
		this.aFloat254 = 0.0F;
		this.aFloat255 = arg0;
		this.aFloat253 = 0.0F;
		this.aFloat264 = 0.0F;
		this.aFloat258 = arg1;
		this.aFloat259 = 0.0F;
		this.aFloat257 = arg2;
		this.aFloat262 = 0.0F;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I[F)[F")
	public float[] method7902(@OriginalArg(1) float[] arg0) {
		arg0[10] = this.aFloat258;
		arg0[4] = this.aFloat261;
		arg0[1] = this.aFloat264;
		arg0[2] = this.aFloat259;
		arg0[15] = 1.0F;
		arg0[5] = this.aFloat255;
		arg0[9] = this.aFloat262;
		arg0[14] = this.aFloat263;
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat253;
		arg0[13] = this.aFloat256;
		arg0[7] = 0.0F;
		arg0[3] = 0.0F;
		arg0[6] = this.aFloat260;
		arg0[12] = this.aFloat254;
		arg0[0] = this.aFloat257;
		return arg0;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat256);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat254);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat263);
		arg3[2] = (int) (this.aFloat258 * (float) local24 + this.aFloat262 * (float) local6 + (float) local17 * this.aFloat253);
		arg3[1] = (int) (this.aFloat255 * (float) local6 + this.aFloat261 * (float) local17 + this.aFloat260 * (float) local24);
		arg3[0] = (int) (this.aFloat264 * (float) local6 + this.aFloat257 * (float) local17 + (float) local24 * this.aFloat259);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(FIFFIBI)V")
	public void method7903(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == 0) {
			this.aFloat263 = arg0;
			this.aFloat255 = arg1 * 2;
			this.aFloat256 = arg2 - (float) arg1;
			this.aFloat254 = (float) -arg5 + arg3;
			this.aFloat257 = arg5 * 2;
			this.aFloat258 = 1.0F;
			this.aFloat264 = this.aFloat259 = this.aFloat261 = this.aFloat260 = this.aFloat253 = this.aFloat262 = 0.0F;
			return;
		}
		@Pc(7) float local7 = Class23_Sub14.aFloatArray49[arg4 & 0x3FFF];
		@Pc(13) float local13 = Class23_Sub14.aFloatArray48[arg4 & 0x3FFF];
		this.aFloat257 = (float) arg5 * local7 * 2.0F;
		this.aFloat256 = (float) (arg1 * 2) * (local13 * -0.5F - local7 * 0.5F) + arg2;
		this.aFloat255 = local7 * 2.0F * (float) arg1;
		this.aFloat254 = (float) (arg5 * 2) * (local13 * 0.5F - local7 * 0.5F) + arg3;
		this.aFloat259 = this.aFloat260 = this.aFloat253 = this.aFloat262 = 0.0F;
		this.aFloat263 = arg0;
		this.aFloat258 = 1.0F;
		this.aFloat261 = -2.0F * local13 * (float) arg1;
		this.aFloat264 = local13 * 2.0F * (float) arg5;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(FFFFFFFFFZ)V")
	public void method7904(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.aFloat255 = arg2;
		this.aFloat253 = arg8;
		this.aFloat261 = arg1;
		this.aFloat263 = 0.0F;
		this.aFloat258 = arg3;
		this.aFloat264 = arg7;
		this.aFloat254 = 0.0F;
		this.aFloat259 = arg0;
		this.aFloat257 = arg6;
		this.aFloat260 = arg5;
		this.aFloat256 = 0.0F;
		this.aFloat262 = arg4;
	}
}
