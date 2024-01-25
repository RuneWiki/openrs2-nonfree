import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class154_Sub2 extends Class154 {

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!jc", name = "cb", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!jc", name = "hb", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class154_Sub2() {
		this.method6564();
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
	@Override
	public void method6572(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class71.aFloatArray77[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class71.aFloatArray76[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat98;
		@Pc(21) float local21 = this.aFloat95;
		@Pc(24) float local24 = this.aFloat99;
		this.aFloat98 = local18 * local9 - this.aFloat101 * local15;
		@Pc(38) float local38 = this.aFloat104;
		this.aFloat101 = local15 * local18 + local9 * this.aFloat101;
		this.aFloat95 = local21 * local9 - local15 * this.aFloat100;
		this.aFloat100 = local21 * local15 + this.aFloat100 * local9;
		this.aFloat99 = local9 * local24 - this.aFloat103 * local15;
		this.aFloat103 = this.aFloat103 * local9 + local15 * local24;
		this.aFloat104 = local9 * local38 - local15 * this.aFloat96;
		this.aFloat96 = local15 * local38 + local9 * this.aFloat96;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(FFFFFFFFIF)V")
	public void method4513(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat96 = 0.0F;
		this.aFloat105 = arg3;
		this.aFloat95 = arg1;
		this.aFloat103 = arg2;
		this.aFloat101 = arg4;
		this.aFloat99 = arg0;
		this.aFloat102 = arg6;
		this.aFloat104 = 0.0F;
		this.aFloat97 = arg7;
		this.aFloat94 = 0.0F;
		this.aFloat98 = arg5;
		this.aFloat100 = arg8;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(FFFI)F")
	public float method4514(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat94 + this.aFloat102 * arg0 + arg1 * this.aFloat105 + arg2 * this.aFloat97;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	@Override
	public void method6558(@OriginalArg(0) int arg0) {
		this.aFloat98 = 1.0F;
		this.aFloat100 = this.aFloat102 = Class71.aFloatArray77[arg0 & 0x3FFF];
		this.aFloat97 = Class71.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat103 = -this.aFloat97;
		this.aFloat95 = this.aFloat99 = this.aFloat104 = this.aFloat101 = this.aFloat96 = this.aFloat105 = this.aFloat94 = 0.0F;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ql;I)V")
	public void method4515(@OriginalArg(0) Class154 arg0) {
		@Pc(6) Class154_Sub2 local6 = (Class154_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat98;
		@Pc(12) float local12 = this.aFloat101;
		@Pc(15) float local15 = this.aFloat95;
		@Pc(18) float local18 = this.aFloat100;
		@Pc(21) float local21 = this.aFloat99;
		@Pc(24) float local24 = this.aFloat103;
		@Pc(27) float local27 = this.aFloat104;
		@Pc(30) float local30 = this.aFloat96;
		this.aFloat98 = local12 * local6.aFloat95 + local9 * local6.aFloat98 + local6.aFloat99 * this.aFloat105;
		this.aFloat101 = local6.aFloat103 * this.aFloat105 + local12 * local6.aFloat100 + local9 * local6.aFloat101;
		this.aFloat100 = this.aFloat97 * local6.aFloat103 + local18 * local6.aFloat100 + local15 * local6.aFloat101;
		this.aFloat95 = local6.aFloat99 * this.aFloat97 + local6.aFloat98 * local15 + local18 * local6.aFloat95;
		this.aFloat105 = local12 * local6.aFloat97 + local9 * local6.aFloat105 + this.aFloat105 * local6.aFloat102;
		this.aFloat99 = local6.aFloat99 * this.aFloat102 + local6.aFloat95 * local24 + local6.aFloat98 * local21;
		this.aFloat97 = local15 * local6.aFloat105 + local6.aFloat97 * local18 + local6.aFloat102 * this.aFloat97;
		this.aFloat103 = this.aFloat102 * local6.aFloat103 + local6.aFloat101 * local21 + local6.aFloat100 * local24;
		this.aFloat102 = local21 * local6.aFloat105 + local24 * local6.aFloat97 + this.aFloat102 * local6.aFloat102;
		this.aFloat104 = local27 * local6.aFloat98 + local30 * local6.aFloat95 + local6.aFloat99 * this.aFloat94 + local6.aFloat104;
		this.aFloat96 = this.aFloat94 * local6.aFloat103 + local6.aFloat100 * local30 + local27 * local6.aFloat101 + local6.aFloat96;
		this.aFloat94 = this.aFloat94 * local6.aFloat102 + local6.aFloat97 * local30 + local27 * local6.aFloat105 + local6.aFloat94;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ql;Lclient!ql;)V")
	public void method4516(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class154 arg1) {
		@Pc(6) Class154_Sub2 local6 = (Class154_Sub2) arg0;
		@Pc(9) Class154_Sub2 local9 = (Class154_Sub2) arg1;
		this.aFloat98 = local9.aFloat105 * local6.aFloat99 + local6.aFloat98 * local9.aFloat98 + local9.aFloat101 * local6.aFloat95;
		this.aFloat101 = local6.aFloat101 * local9.aFloat98 + local6.aFloat100 * local9.aFloat101 + local6.aFloat103 * local9.aFloat105;
		this.aFloat105 = local9.aFloat105 * local6.aFloat102 + local6.aFloat105 * local9.aFloat98 + local6.aFloat97 * local9.aFloat101;
		this.aFloat95 = local9.aFloat97 * local6.aFloat99 + local6.aFloat98 * local9.aFloat95 + local9.aFloat100 * local6.aFloat95;
		this.aFloat100 = local9.aFloat100 * local6.aFloat100 + local6.aFloat101 * local9.aFloat95 + local6.aFloat103 * local9.aFloat97;
		this.aFloat99 = local6.aFloat98 * local9.aFloat99 + local6.aFloat95 * local9.aFloat103 + local6.aFloat99 * local9.aFloat102;
		this.aFloat97 = local9.aFloat97 * local6.aFloat102 + local9.aFloat100 * local6.aFloat97 + local9.aFloat95 * local6.aFloat105;
		this.aFloat103 = local6.aFloat100 * local9.aFloat103 + local6.aFloat101 * local9.aFloat99 + local6.aFloat103 * local9.aFloat102;
		this.aFloat102 = local6.aFloat97 * local9.aFloat103 + local6.aFloat105 * local9.aFloat99 + local6.aFloat102 * local9.aFloat102;
		this.aFloat104 = local9.aFloat104 * local6.aFloat98 + local6.aFloat95 * local9.aFloat96 + local9.aFloat94 * local6.aFloat99 + local6.aFloat104;
		this.aFloat96 = local6.aFloat100 * local9.aFloat96 + local6.aFloat101 * local9.aFloat104 + local9.aFloat94 * local6.aFloat103 + local6.aFloat96;
		this.aFloat94 = local6.aFloat94 + local9.aFloat96 * local6.aFloat97 + local9.aFloat104 * local6.aFloat105 + local9.aFloat94 * local6.aFloat102;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	@Override
	public void method6557(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class71.aFloatArray77[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class71.aFloatArray76[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat101;
		@Pc(21) float local21 = this.aFloat100;
		@Pc(24) float local24 = this.aFloat103;
		this.aFloat101 = local9 * local18 - this.aFloat105 * local15;
		@Pc(38) float local38 = this.aFloat96;
		this.aFloat100 = local9 * local21 - local15 * this.aFloat97;
		this.aFloat105 = local9 * this.aFloat105 + local15 * local18;
		this.aFloat97 = local15 * local21 + local9 * this.aFloat97;
		this.aFloat103 = local24 * local9 - local15 * this.aFloat102;
		this.aFloat96 = local38 * local9 - local15 * this.aFloat94;
		this.aFloat102 = local24 * local15 + this.aFloat102 * local9;
		this.aFloat94 = local9 * this.aFloat94 + local15 * local38;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(FFIF)V")
	public void method4517(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat99 = 0.0F;
		this.aFloat96 = 0.0F;
		this.aFloat100 = arg2;
		this.aFloat94 = 0.0F;
		this.aFloat105 = 0.0F;
		this.aFloat102 = arg1;
		this.aFloat104 = (float) 0;
		this.aFloat95 = 0.0F;
		this.aFloat101 = 0.0F;
		this.aFloat97 = 0.0F;
		this.aFloat103 = 0.0F;
		this.aFloat98 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	@Override
	public void method6571(@OriginalArg(0) int arg0) {
		this.aFloat100 = 1.0F;
		this.aFloat98 = this.aFloat102 = Class71.aFloatArray77[arg0 & 0x3FFF];
		this.aFloat99 = Class71.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat105 = -this.aFloat99;
		this.aFloat95 = this.aFloat104 = this.aFloat101 = this.aFloat103 = this.aFloat96 = this.aFloat97 = this.aFloat94 = 0.0F;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BFFF)V")
	public void method4518(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat104 = arg2;
		this.aFloat98 = this.aFloat100 = this.aFloat102 = 1.0F;
		this.aFloat96 = arg1;
		this.aFloat94 = arg0;
		this.aFloat101 = this.aFloat105 = this.aFloat95 = this.aFloat97 = this.aFloat99 = this.aFloat103 = 0.0F;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class71.aFloatArray77[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class71.aFloatArray76[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class71.aFloatArray77[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class71.aFloatArray76[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class71.aFloatArray77[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class71.aFloatArray76[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat98 = local47 * local27 + local33 * local21;
		this.aFloat101 = local39 * -local21 + local27 * local43;
		this.aFloat99 = local21 * local47 + local33 * -local27;
		this.aFloat97 = -local15;
		this.aFloat100 = local9 * local33;
		this.aFloat103 = local27 * local39 + local21 * local43;
		this.aFloat102 = local21 * local9;
		this.aFloat105 = local27 * local9;
		this.aFloat95 = local9 * local39;
		this.aFloat96 = (float) -arg0 * this.aFloat101 - (float) arg1 * this.aFloat100 - this.aFloat103 * (float) arg2;
		this.aFloat104 = -(this.aFloat95 * (float) arg1) + this.aFloat98 * (float) -arg0 - this.aFloat99 * (float) arg2;
		this.aFloat94 = -(this.aFloat102 * (float) arg2) + this.aFloat105 * (float) -arg0 - this.aFloat97 * (float) arg1;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	@Override
	public void method6566(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class71.aFloatArray77[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class71.aFloatArray76[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat98;
		@Pc(21) float local21 = this.aFloat95;
		@Pc(24) float local24 = this.aFloat99;
		@Pc(27) float local27 = this.aFloat104;
		this.aFloat98 = local9 * local18 + this.aFloat105 * local15;
		this.aFloat95 = local21 * local9 + local15 * this.aFloat97;
		this.aFloat105 = local9 * this.aFloat105 - local18 * local15;
		this.aFloat97 = local9 * this.aFloat97 - local21 * local15;
		this.aFloat99 = local24 * local9 + this.aFloat102 * local15;
		this.aFloat102 = this.aFloat102 * local9 - local24 * local15;
		this.aFloat104 = local15 * this.aFloat94 + local9 * local27;
		this.aFloat94 = this.aFloat94 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()V")
	@Override
	public void method6564() {
		this.aFloat101 = this.aFloat105 = this.aFloat95 = this.aFloat97 = this.aFloat99 = this.aFloat103 = this.aFloat104 = this.aFloat96 = this.aFloat94 = 0.0F;
		this.aFloat98 = this.aFloat100 = this.aFloat102 = 1.0F;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[F)[F")
	public float[] method4520(@OriginalArg(1) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[5] = this.aFloat100;
		arg0[14] = 0.0F;
		arg0[1] = this.aFloat101;
		arg0[4] = this.aFloat95;
		arg0[0] = this.aFloat98;
		arg0[10] = this.aFloat94;
		arg0[3] = 0.0F;
		arg0[6] = 0.0F;
		arg0[2] = 0.0F;
		arg0[15] = 1.0F;
		arg0[11] = 0.0F;
		arg0[9] = this.aFloat96;
		arg0[8] = this.aFloat104;
		return arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!ql;)V")
	public void method4521(@OriginalArg(1) Class154 arg0) {
		@Pc(6) Class154_Sub2 local6 = (Class154_Sub2) arg0;
		this.aFloat99 = local6.aFloat105;
		this.aFloat98 = local6.aFloat98;
		this.aFloat95 = local6.aFloat101;
		this.aFloat103 = local6.aFloat97;
		this.aFloat100 = local6.aFloat100;
		this.aFloat105 = local6.aFloat99;
		this.aFloat101 = local6.aFloat95;
		this.aFloat102 = local6.aFloat102;
		this.aFloat97 = local6.aFloat103;
		this.aFloat104 = -(this.aFloat95 * local6.aFloat96 + this.aFloat98 * local6.aFloat104 + local6.aFloat94 * this.aFloat99);
		this.aFloat96 = -(local6.aFloat96 * this.aFloat100 + local6.aFloat104 * this.aFloat101 + local6.aFloat94 * this.aFloat103);
		this.aFloat94 = -(local6.aFloat104 * this.aFloat105 + this.aFloat97 * local6.aFloat96 + local6.aFloat94 * this.aFloat102);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(BFFF)V")
	public void method4522(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat94 += arg2;
		this.aFloat96 += arg1;
		this.aFloat104 += arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([I)V")
	@Override
	public void method6560(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat104;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat96;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat94;
		arg0[2] = (int) (this.aFloat102 * local27 + this.aFloat99 * local11 + this.aFloat103 * local19);
		arg0[0] = (int) (local11 * this.aFloat98 + this.aFloat101 * local19 + local27 * this.aFloat105);
		arg0[1] = (int) (local27 * this.aFloat97 + this.aFloat100 * local19 + local11 * this.aFloat95);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([FB)[F")
	public float[] method4523(@OriginalArg(0) float[] arg0) {
		arg0[5] = this.aFloat100;
		arg0[9] = this.aFloat97;
		arg0[6] = this.aFloat103;
		arg0[8] = this.aFloat105;
		arg0[15] = 0.0F;
		arg0[2] = this.aFloat99;
		arg0[0] = this.aFloat98;
		arg0[4] = this.aFloat101;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[11] = 0.0F;
		arg0[7] = 0.0F;
		arg0[10] = this.aFloat102;
		arg0[12] = 0.0F;
		arg0[3] = 0.0F;
		arg0[1] = this.aFloat95;
		return arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(FBFF)V")
	public void method4525(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat94 *= arg1;
		this.aFloat97 *= arg1;
		this.aFloat102 *= arg1;
		this.aFloat104 *= arg2;
		this.aFloat95 *= arg2;
		this.aFloat98 *= arg2;
		this.aFloat100 *= arg0;
		this.aFloat105 *= arg1;
		this.aFloat96 *= arg0;
		this.aFloat101 *= arg0;
		this.aFloat99 *= arg2;
		this.aFloat103 *= arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat96);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat104);
		@Pc(20) int local20 = (int) ((float) arg2 - this.aFloat94);
		arg3[2] = (int) (this.aFloat102 * (float) local20 + (float) local6 * this.aFloat103 + (float) local13 * this.aFloat99);
		arg3[0] = (int) (this.aFloat98 * (float) local13 + (float) local6 * this.aFloat101 + (float) local20 * this.aFloat105);
		arg3[1] = (int) (this.aFloat95 * (float) local13 + this.aFloat100 * (float) local6 + (float) local20 * this.aFloat97);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat99 + this.aFloat98 * (float) arg0 + (float) arg1 * this.aFloat95 + this.aFloat104);
		arg3[2] = (int) (this.aFloat94 + (float) arg2 * this.aFloat102 + (float) arg1 * this.aFloat97 + (float) arg0 * this.aFloat105);
		arg3[1] = (int) (this.aFloat96 + (float) arg2 * this.aFloat103 + (float) arg1 * this.aFloat100 + (float) arg0 * this.aFloat101);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([FZ)[F")
	public float[] method4526(@OriginalArg(0) float[] arg0) {
		arg0[6] = this.aFloat97;
		arg0[15] = 1.0F;
		arg0[14] = this.aFloat94;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[13] = this.aFloat96;
		arg0[9] = this.aFloat103;
		arg0[8] = this.aFloat99;
		arg0[1] = this.aFloat101;
		arg0[3] = 0.0F;
		arg0[12] = this.aFloat104;
		arg0[0] = this.aFloat98;
		arg0[2] = this.aFloat105;
		arg0[4] = this.aFloat95;
		arg0[5] = this.aFloat100;
		arg0[10] = this.aFloat102;
		return arg0;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(FFIF)F")
	public float method4527(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat101 * arg2 + arg1 * this.aFloat100 + this.aFloat103 * arg0 + this.aFloat96;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	@Override
	public void method6565(@OriginalArg(0) int arg0) {
		this.aFloat102 = 1.0F;
		this.aFloat98 = this.aFloat100 = Class71.aFloatArray77[arg0 & 0x3FFF];
		this.aFloat101 = Class71.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat95 = -this.aFloat101;
		this.aFloat99 = this.aFloat104 = this.aFloat103 = this.aFloat96 = this.aFloat105 = this.aFloat97 = this.aFloat94 = 0.0F;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method6563(@OriginalArg(0) Class154 arg0) {
		@Pc(6) Class154_Sub2 local6 = (Class154_Sub2) arg0;
		this.aFloat96 = local6.aFloat96;
		this.aFloat98 = local6.aFloat98;
		this.aFloat105 = local6.aFloat105;
		this.aFloat103 = local6.aFloat103;
		this.aFloat99 = local6.aFloat99;
		this.aFloat101 = local6.aFloat101;
		this.aFloat102 = local6.aFloat102;
		this.aFloat94 = local6.aFloat94;
		this.aFloat97 = local6.aFloat97;
		this.aFloat104 = local6.aFloat104;
		this.aFloat100 = local6.aFloat100;
		this.aFloat95 = local6.aFloat95;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ql;Z)V")
	public void method4528(@OriginalArg(0) Class154 arg0) {
		@Pc(6) Class154_Sub2 local6 = (Class154_Sub2) arg0;
		this.aFloat102 = local6.aFloat102;
		this.aFloat95 = local6.aFloat95;
		this.aFloat105 = local6.aFloat105;
		this.aFloat99 = local6.aFloat99;
		this.aFloat100 = local6.aFloat100;
		this.aFloat104 = 0.0F;
		this.aFloat101 = local6.aFloat101;
		this.aFloat97 = local6.aFloat97;
		this.aFloat98 = local6.aFloat98;
		this.aFloat94 = 0.0F;
		this.aFloat96 = 0.0F;
		this.aFloat103 = local6.aFloat103;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(FFIF)F")
	public float method4529(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat98 * arg1 + arg2 * this.aFloat95 + arg0 * this.aFloat99 + this.aFloat104;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[F)[F")
	public float[] method4530(@OriginalArg(1) float[] arg0) {
		arg0[2] = this.aFloat99;
		arg0[7] = this.aFloat96;
		arg0[0] = this.aFloat98;
		arg0[3] = this.aFloat104;
		arg0[1] = this.aFloat95;
		arg0[4] = this.aFloat101;
		arg0[6] = this.aFloat103;
		arg0[5] = this.aFloat100;
		return arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(F[FFIF)V")
	public void method4532(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		arg1[0] = arg3 * this.aFloat98 + arg2 * this.aFloat95 + arg0 * this.aFloat99;
		arg1[1] = this.aFloat103 * arg0 + arg3 * this.aFloat101 + arg2 * this.aFloat100;
		arg1[2] = this.aFloat102 * arg0 + arg2 * this.aFloat97 + this.aFloat105 * arg3;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method6574() {
		@Pc(7) Class154_Sub2 local7 = new Class154_Sub2();
		local7.aFloat100 = this.aFloat100;
		local7.aFloat94 = this.aFloat94;
		local7.aFloat101 = this.aFloat101;
		local7.aFloat99 = this.aFloat99;
		local7.aFloat95 = this.aFloat95;
		local7.aFloat103 = this.aFloat103;
		local7.aFloat96 = this.aFloat96;
		local7.aFloat104 = this.aFloat104;
		local7.aFloat98 = this.aFloat98;
		local7.aFloat105 = this.aFloat105;
		local7.aFloat102 = this.aFloat102;
		local7.aFloat97 = this.aFloat97;
		return local7;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(FFIIZFI)V")
	public void method4534(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg3 == 0) {
			this.aFloat96 = arg0 - (float) arg5;
			this.aFloat102 = 1.0F;
			this.aFloat94 = arg1;
			this.aFloat98 = (float) (arg2 * 2);
			this.aFloat101 = this.aFloat105 = this.aFloat95 = this.aFloat97 = this.aFloat99 = this.aFloat103 = 0.0F;
			this.aFloat104 = arg4 - (float) arg2;
			this.aFloat100 = (float) (arg5 * 2);
			return;
		}
		@Pc(60) float local60 = Class71.aFloatArray77[arg3 & 0x3FFF];
		@Pc(66) float local66 = Class71.aFloatArray76[arg3 & 0x3FFF];
		this.aFloat94 = arg1;
		this.aFloat95 = local66 * -2.0F * (float) arg5;
		this.aFloat101 = local66 * 2.0F * (float) arg2;
		this.aFloat96 = arg0 + (-0.5F * local66 - local60 * 0.5F) * (float) (arg5 * 2);
		this.aFloat100 = local60 * 2.0F * (float) arg5;
		this.aFloat104 = (local66 * 0.5F - local60 * 0.5F) * (float) (arg2 * 2) + arg4;
		this.aFloat105 = this.aFloat97 = this.aFloat99 = this.aFloat103 = 0.0F;
		this.aFloat102 = 1.0F;
		this.aFloat98 = (float) arg2 * 2.0F * local60;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
	public void method4535() {
		this.aFloat96 = -this.aFloat96;
		this.aFloat94 = -this.aFloat94;
		this.aFloat100 = -this.aFloat100;
		this.aFloat105 = -this.aFloat105;
		this.aFloat102 = -this.aFloat102;
		this.aFloat97 = -this.aFloat97;
		this.aFloat101 = -this.aFloat101;
		this.aFloat103 = -this.aFloat103;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	@Override
	public void method6559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat104 = (float) arg0;
		this.aFloat94 = (float) arg2;
		this.aFloat101 = this.aFloat105 = this.aFloat95 = this.aFloat97 = this.aFloat99 = this.aFloat103 = 0.0F;
		this.aFloat96 = (float) arg1;
		this.aFloat98 = this.aFloat100 = this.aFloat102 = 1.0F;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat98 * (float) arg0 + (float) arg1 * this.aFloat95 + (float) arg2 * this.aFloat99);
		arg3[2] = (int) ((float) arg0 * this.aFloat105 + this.aFloat97 * (float) arg1 + (float) arg2 * this.aFloat102);
		arg3[1] = (int) ((float) arg1 * this.aFloat100 + this.aFloat101 * (float) arg0 + (float) arg2 * this.aFloat103);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[FFFFF)V")
	public void method4537(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg0[0] = this.aFloat99 * arg3 + arg4 * this.aFloat95 + arg1 * this.aFloat98;
		arg0[1] = this.aFloat103 * arg3 + this.aFloat101 * arg1 + this.aFloat100 * arg4;
		@Pc(76) float local76;
		@Pc(60) float local60;
		@Pc(68) float local68;
		@Pc(52) float local52;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local52 = -arg2 / arg1;
			local60 = this.aFloat101 * local52 + this.aFloat96;
			local68 = this.aFloat94 + local52 * this.aFloat105;
			local76 = local52 * this.aFloat98 + this.aFloat104;
		} else if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local52 = -arg2 / arg4;
			local76 = this.aFloat95 * local52 + this.aFloat104;
			local68 = this.aFloat97 * local52 + this.aFloat94;
			local60 = this.aFloat96 + this.aFloat100 * local52;
		} else {
			local52 = -arg2 / arg3;
			local60 = this.aFloat96 + local52 * this.aFloat103;
			local68 = this.aFloat102 * local52 + this.aFloat94;
			local76 = this.aFloat99 * local52 + this.aFloat104;
		}
		arg0[2] = arg4 * this.aFloat97 + this.aFloat105 * arg1 + this.aFloat102 * arg3;
		arg0[3] = -(local68 * arg0[2] + local76 * arg0[0] + arg0[1] * local60);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	@Override
	public void method6570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat104 += (float) arg0;
		this.aFloat96 += (float) arg1;
		this.aFloat94 += (float) arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([FI)[F")
	public float[] method4538(@OriginalArg(0) float[] arg0) {
		arg0[12] = 0.0F;
		arg0[11] = this.aFloat94;
		arg0[4] = this.aFloat101;
		arg0[5] = this.aFloat100;
		arg0[3] = this.aFloat104;
		arg0[10] = this.aFloat102;
		arg0[6] = this.aFloat103;
		arg0[15] = 1.0F;
		arg0[2] = this.aFloat99;
		arg0[1] = this.aFloat95;
		arg0[14] = 0.0F;
		arg0[7] = this.aFloat96;
		arg0[13] = 0.0F;
		arg0[9] = this.aFloat97;
		arg0[0] = this.aFloat98;
		arg0[8] = this.aFloat105;
		return arg0;
	}
}
