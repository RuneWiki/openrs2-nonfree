import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class54_Sub3 extends Class54 {

	@OriginalMember(owner = "client!li", name = "j", descriptor = "F")
	public float aFloat113;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "F")
	public float aFloat115;

	@OriginalMember(owner = "client!li", name = "y", descriptor = "F")
	public float aFloat116;

	@OriginalMember(owner = "client!li", name = "F", descriptor = "F")
	public float aFloat117;

	@OriginalMember(owner = "client!li", name = "I", descriptor = "F")
	public float aFloat118;

	@OriginalMember(owner = "client!li", name = "L", descriptor = "F")
	public float aFloat119;

	@OriginalMember(owner = "client!li", name = "Q", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!li", name = "U", descriptor = "F")
	public float aFloat121;

	@OriginalMember(owner = "client!li", name = "V", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!li", name = "bb", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!li", name = "db", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class54_Sub3() {
		this.method5135();
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	@Override
	public void method5134(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat113;
		@Pc(21) float local21 = this.aFloat116;
		@Pc(24) float local24 = this.aFloat119;
		@Pc(27) float local27 = this.aFloat122;
		this.aFloat113 = local18 * local9 - local15 * this.aFloat120;
		this.aFloat120 = local18 * local15 + local9 * this.aFloat120;
		this.aFloat116 = local9 * local21 - local15 * this.aFloat124;
		this.aFloat124 = this.aFloat124 * local9 + local15 * local21;
		this.aFloat119 = local24 * local9 - local15 * this.aFloat118;
		this.aFloat118 = local9 * this.aFloat118 + local15 * local24;
		this.aFloat122 = local27 * local9 - this.aFloat121 * local15;
		this.aFloat121 = this.aFloat121 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[F)[F")
	public float[] method5146(@OriginalArg(1) float[] arg0) {
		arg0[7] = 0.0F;
		arg0[3] = 0.0F;
		arg0[10] = this.aFloat118;
		arg0[0] = this.aFloat117;
		arg0[5] = this.aFloat116;
		arg0[12] = this.aFloat123;
		arg0[1] = this.aFloat113;
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat114;
		arg0[14] = this.aFloat121;
		arg0[13] = this.aFloat122;
		arg0[11] = 0.0F;
		arg0[2] = this.aFloat120;
		arg0[9] = this.aFloat119;
		arg0[4] = this.aFloat115;
		arg0[6] = this.aFloat124;
		return arg0;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(III[I)V")
	@Override
	public void method5132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat124 * (float) arg1 + (float) arg0 * this.aFloat120 + (float) arg2 * this.aFloat118);
		arg3[1] = (int) ((float) arg2 * this.aFloat119 + (float) arg0 * this.aFloat113 + (float) arg1 * this.aFloat116);
		arg3[0] = (int) ((float) arg0 * this.aFloat117 + this.aFloat115 * (float) arg1 + (float) arg2 * this.aFloat114);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class8_Sub2_Sub7.aFloatArray25[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class8_Sub2_Sub7.aFloatArray26[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class8_Sub2_Sub7.aFloatArray25[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class8_Sub2_Sub7.aFloatArray26[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class8_Sub2_Sub7.aFloatArray25[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class8_Sub2_Sub7.aFloatArray26[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat114 = local47 * local21 + local33 * -local27;
		this.aFloat120 = local9 * local27;
		this.aFloat116 = local33 * local9;
		this.aFloat117 = local47 * local27 + local21 * local33;
		this.aFloat124 = -local15;
		this.aFloat119 = local27 * local39 + local21 * local43;
		this.aFloat115 = local9 * local39;
		this.aFloat113 = local27 * local43 + local39 * -local21;
		this.aFloat118 = local9 * local21;
		this.aFloat122 = -((float) arg2 * this.aFloat119) + this.aFloat113 * (float) -arg0 - this.aFloat116 * (float) arg1;
		this.aFloat121 = this.aFloat120 * (float) -arg0 - (float) arg1 * this.aFloat124 - this.aFloat118 * (float) arg2;
		this.aFloat123 = this.aFloat117 * (float) -arg0 - (float) arg1 * this.aFloat115 - (float) arg2 * this.aFloat114;
	}

	@OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
	public void method5147() {
		this.aFloat113 = -this.aFloat113;
		this.aFloat118 = -this.aFloat118;
		this.aFloat116 = -this.aFloat116;
		this.aFloat120 = -this.aFloat120;
		this.aFloat124 = -this.aFloat124;
		this.aFloat122 = -this.aFloat122;
		this.aFloat119 = -this.aFloat119;
		this.aFloat121 = -this.aFloat121;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(FB[FFF)V")
	public void method5148(@OriginalArg(0) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg1[1] = arg2 * this.aFloat119 + this.aFloat116 * arg0 + this.aFloat113 * arg3;
		arg1[0] = arg2 * this.aFloat114 + this.aFloat115 * arg0 + arg3 * this.aFloat117;
		arg1[2] = this.aFloat118 * arg2 + this.aFloat120 * arg3 + this.aFloat124 * arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	@Override
	public void method5128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat113 = this.aFloat120 = this.aFloat115 = this.aFloat124 = this.aFloat114 = this.aFloat119 = 0.0F;
		this.aFloat123 = arg0;
		this.aFloat117 = this.aFloat116 = this.aFloat118 = 1.0F;
		this.aFloat121 = arg2;
		this.aFloat122 = arg1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([I)V")
	@Override
	public void method5136(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat123;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat122;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat121;
		arg0[0] = (int) (this.aFloat117 * local11 + local20 * this.aFloat113 + local29 * this.aFloat120);
		arg0[2] = (int) (local29 * this.aFloat118 + local20 * this.aFloat119 + local11 * this.aFloat114);
		arg0[1] = (int) (local29 * this.aFloat124 + this.aFloat116 * local20 + this.aFloat115 * local11);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(FFFB)F")
	public float method5149(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat123 + arg2 * this.aFloat117 + this.aFloat115 * arg0 + arg1 * this.aFloat114;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BLclient!dfa;)V")
	public void method5150(@OriginalArg(1) Class54 arg0) {
		@Pc(12) Class54_Sub3 local12 = (Class54_Sub3) arg0;
		this.aFloat122 = 0.0F;
		this.aFloat117 = local12.aFloat117;
		this.aFloat118 = local12.aFloat118;
		this.aFloat123 = 0.0F;
		this.aFloat119 = local12.aFloat119;
		this.aFloat113 = local12.aFloat113;
		this.aFloat115 = local12.aFloat115;
		this.aFloat116 = local12.aFloat116;
		this.aFloat114 = local12.aFloat114;
		this.aFloat124 = local12.aFloat124;
		this.aFloat120 = local12.aFloat120;
		this.aFloat121 = 0.0F;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!dfa;)V")
	@Override
	public void method5137(@OriginalArg(0) Class54 arg0) {
		@Pc(6) Class54_Sub3 local6 = (Class54_Sub3) arg0;
		this.aFloat124 = local6.aFloat124;
		this.aFloat118 = local6.aFloat118;
		this.aFloat116 = local6.aFloat116;
		this.aFloat117 = local6.aFloat117;
		this.aFloat119 = local6.aFloat119;
		this.aFloat121 = local6.aFloat121;
		this.aFloat122 = local6.aFloat122;
		this.aFloat114 = local6.aFloat114;
		this.aFloat113 = local6.aFloat113;
		this.aFloat115 = local6.aFloat115;
		this.aFloat120 = local6.aFloat120;
		this.aFloat123 = local6.aFloat123;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IFFZIFI)V")
	public void method5151(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg0 == 0) {
			this.aFloat116 = arg5 * 2;
			this.aFloat123 = (float) -arg3 + arg4;
			this.aFloat117 = arg3 * 2;
			this.aFloat118 = 1.0F;
			this.aFloat121 = arg2;
			this.aFloat122 = arg1 - (float) arg5;
			this.aFloat113 = this.aFloat120 = this.aFloat115 = this.aFloat124 = this.aFloat114 = this.aFloat119 = 0.0F;
			return;
		}
		@Pc(58) float local58 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		@Pc(64) float local64 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat115 = (float) arg5 * -2.0F * local64;
		this.aFloat113 = (float) arg3 * local64 * 2.0F;
		this.aFloat117 = (float) arg3 * 2.0F * local58;
		this.aFloat123 = (float) (arg3 * 2) * (local64 * 0.5F - local58 * 0.5F) + arg4;
		this.aFloat118 = 1.0F;
		this.aFloat121 = arg2;
		this.aFloat116 = local58 * 2.0F * (float) arg5;
		this.aFloat122 = (float) (arg5 * 2) * (local64 * -0.5F - local58 * 0.5F) + arg1;
		this.aFloat120 = this.aFloat124 = this.aFloat114 = this.aFloat119 = 0.0F;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat122);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat123);
		@Pc(20) int local20 = (int) ((float) arg2 - this.aFloat121);
		arg3[2] = (int) ((float) local6 * this.aFloat119 + this.aFloat114 * (float) local13 + (float) local20 * this.aFloat118);
		arg3[0] = (int) (this.aFloat117 * (float) local13 + (float) local6 * this.aFloat113 + this.aFloat120 * (float) local20);
		arg3[1] = (int) ((float) local13 * this.aFloat115 + this.aFloat116 * (float) local6 + (float) local20 * this.aFloat124);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	@Override
	public void method5131(@OriginalArg(0) int arg0) {
		this.aFloat117 = 1.0F;
		this.aFloat116 = this.aFloat118 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat124 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat115 = this.aFloat114 = this.aFloat123 = this.aFloat113 = this.aFloat122 = this.aFloat120 = this.aFloat121 = 0.0F;
		this.aFloat119 = -this.aFloat124;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B[F)[F")
	public float[] method5152(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat115;
		arg0[14] = 0.0F;
		arg0[4] = this.aFloat113;
		arg0[7] = this.aFloat122;
		arg0[0] = this.aFloat117;
		arg0[2] = this.aFloat114;
		arg0[11] = this.aFloat121;
		arg0[12] = 0.0F;
		arg0[6] = this.aFloat119;
		arg0[5] = this.aFloat116;
		arg0[13] = 0.0F;
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat118;
		arg0[8] = this.aFloat120;
		arg0[9] = this.aFloat124;
		arg0[3] = this.aFloat123;
		return arg0;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "()V")
	@Override
	public void method5135() {
		this.aFloat117 = this.aFloat116 = this.aFloat118 = 1.0F;
		this.aFloat113 = this.aFloat120 = this.aFloat115 = this.aFloat124 = this.aFloat114 = this.aFloat119 = this.aFloat123 = this.aFloat122 = this.aFloat121 = 0.0F;
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
	@Override
	public void method5141(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat117;
		@Pc(21) float local21 = this.aFloat115;
		@Pc(24) float local24 = this.aFloat114;
		this.aFloat117 = local9 * local18 - this.aFloat113 * local15;
		@Pc(38) float local38 = this.aFloat123;
		this.aFloat115 = local21 * local9 - this.aFloat116 * local15;
		this.aFloat113 = local18 * local15 + this.aFloat113 * local9;
		this.aFloat114 = local9 * local24 - local15 * this.aFloat119;
		this.aFloat116 = local21 * local15 + this.aFloat116 * local9;
		this.aFloat123 = local9 * local38 - this.aFloat122 * local15;
		this.aFloat119 = this.aFloat119 * local9 + local24 * local15;
		this.aFloat122 = local38 * local15 + local9 * this.aFloat122;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([FI)[F")
	public float[] method5153(@OriginalArg(0) float[] arg0) {
		arg0[15] = 0.0F;
		arg0[13] = 0.0F;
		arg0[11] = 0.0F;
		arg0[9] = this.aFloat124;
		arg0[10] = this.aFloat118;
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[1] = this.aFloat115;
		arg0[5] = this.aFloat116;
		arg0[3] = 0.0F;
		arg0[8] = this.aFloat120;
		arg0[0] = this.aFloat117;
		arg0[6] = this.aFloat119;
		arg0[14] = 0.0F;
		arg0[2] = this.aFloat114;
		arg0[4] = this.aFloat113;
		return arg0;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I[F)[F")
	public float[] method5154(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat117;
		arg0[5] = this.aFloat116;
		arg0[15] = 1.0F;
		arg0[2] = 0.0F;
		arg0[1] = this.aFloat113;
		arg0[4] = this.aFloat115;
		arg0[3] = 0.0F;
		arg0[8] = this.aFloat123;
		arg0[12] = 0.0F;
		arg0[14] = 0.0F;
		arg0[11] = 0.0F;
		arg0[9] = this.aFloat122;
		arg0[6] = 0.0F;
		arg0[10] = this.aFloat121;
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!dfa;B)V")
	public void method5155(@OriginalArg(0) Class54 arg0) {
		@Pc(6) Class54_Sub3 local6 = (Class54_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat117;
		@Pc(12) float local12 = this.aFloat113;
		@Pc(15) float local15 = this.aFloat115;
		@Pc(18) float local18 = this.aFloat116;
		@Pc(21) float local21 = this.aFloat114;
		@Pc(24) float local24 = this.aFloat119;
		@Pc(27) float local27 = this.aFloat123;
		this.aFloat117 = local6.aFloat117 * local9 + local12 * local6.aFloat115 + this.aFloat120 * local6.aFloat114;
		@Pc(47) float local47 = this.aFloat122;
		this.aFloat113 = local6.aFloat119 * this.aFloat120 + local6.aFloat116 * local12 + local6.aFloat113 * local9;
		this.aFloat116 = local15 * local6.aFloat113 + local6.aFloat116 * local18 + local6.aFloat119 * this.aFloat124;
		this.aFloat115 = this.aFloat124 * local6.aFloat114 + local6.aFloat115 * local18 + local15 * local6.aFloat117;
		this.aFloat120 = local9 * local6.aFloat120 + local6.aFloat124 * local12 + local6.aFloat118 * this.aFloat120;
		this.aFloat119 = local6.aFloat116 * local24 + local6.aFloat113 * local21 + local6.aFloat119 * this.aFloat118;
		this.aFloat124 = local15 * local6.aFloat120 + local6.aFloat124 * local18 + local6.aFloat118 * this.aFloat124;
		this.aFloat114 = local6.aFloat117 * local21 + local6.aFloat115 * local24 + this.aFloat118 * local6.aFloat114;
		this.aFloat118 = this.aFloat118 * local6.aFloat118 + local24 * local6.aFloat124 + local21 * local6.aFloat120;
		this.aFloat122 = local47 * local6.aFloat116 + local27 * local6.aFloat113 + local6.aFloat119 * this.aFloat121 + local6.aFloat122;
		this.aFloat123 = local6.aFloat117 * local27 + local6.aFloat115 * local47 + local6.aFloat114 * this.aFloat121 + local6.aFloat123;
		this.aFloat121 = this.aFloat121 * local6.aFloat118 + local6.aFloat124 * local47 + local27 * local6.aFloat120 + local6.aFloat121;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(FFBF)V")
	public void method5156(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat116 = arg0;
		this.aFloat115 = 0.0F;
		this.aFloat117 = arg2;
		this.aFloat120 = 0.0F;
		this.aFloat123 = 0.0F;
		this.aFloat124 = 0.0F;
		this.aFloat122 = 0.0F;
		this.aFloat121 = 0.0F;
		this.aFloat119 = 0.0F;
		this.aFloat118 = arg1;
		this.aFloat113 = 0.0F;
		this.aFloat114 = 0.0F;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([FB)[F")
	public float[] method5157(@OriginalArg(0) float[] arg0) {
		arg0[7] = this.aFloat122;
		arg0[1] = this.aFloat115;
		arg0[3] = this.aFloat123;
		arg0[5] = this.aFloat116;
		arg0[4] = this.aFloat113;
		arg0[2] = this.aFloat114;
		arg0[6] = this.aFloat119;
		arg0[0] = this.aFloat117;
		return arg0;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(III)V")
	@Override
	public void method5142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat123 += arg0;
		this.aFloat122 += arg1;
		this.aFloat121 += arg2;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(III[I)V")
	@Override
	public void method5139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat122 + this.aFloat113 * (float) arg0 + (float) arg1 * this.aFloat116 + this.aFloat119 * (float) arg2);
		arg3[0] = (int) (this.aFloat123 + this.aFloat117 * (float) arg0 + (float) arg1 * this.aFloat115 + (float) arg2 * this.aFloat114);
		arg3[2] = (int) (this.aFloat118 * (float) arg2 + (float) arg0 * this.aFloat120 + this.aFloat124 * (float) arg1 + this.aFloat121);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(FFFZ)V")
	public void method5158(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat122 = arg0;
		this.aFloat117 = this.aFloat116 = this.aFloat118 = 1.0F;
		this.aFloat121 = arg2;
		this.aFloat123 = arg1;
		this.aFloat113 = this.aFloat120 = this.aFloat115 = this.aFloat124 = this.aFloat114 = this.aFloat119 = 0.0F;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!dfa;Z)V")
	public void method5160(@OriginalArg(0) Class54 arg0) {
		@Pc(6) Class54_Sub3 local6 = (Class54_Sub3) arg0;
		this.aFloat115 = local6.aFloat113;
		this.aFloat114 = local6.aFloat120;
		this.aFloat117 = local6.aFloat117;
		this.aFloat113 = local6.aFloat115;
		this.aFloat116 = local6.aFloat116;
		this.aFloat120 = local6.aFloat114;
		this.aFloat119 = local6.aFloat124;
		this.aFloat118 = local6.aFloat118;
		this.aFloat124 = local6.aFloat119;
		this.aFloat123 = -(local6.aFloat122 * this.aFloat115 + local6.aFloat123 * this.aFloat117 + this.aFloat114 * local6.aFloat121);
		this.aFloat122 = -(local6.aFloat121 * this.aFloat119 + this.aFloat113 * local6.aFloat123 + this.aFloat116 * local6.aFloat122);
		this.aFloat121 = -(this.aFloat124 * local6.aFloat122 + this.aFloat120 * local6.aFloat123 + this.aFloat118 * local6.aFloat121);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(FFFB)V")
	public void method5161(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat123 += arg1;
		this.aFloat122 += arg2;
		this.aFloat121 += arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!dfa;Lclient!dfa;)V")
	public void method5163(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1) {
		@Pc(6) Class54_Sub3 local6 = (Class54_Sub3) arg0;
		@Pc(9) Class54_Sub3 local9 = (Class54_Sub3) arg1;
		this.aFloat117 = local9.aFloat120 * local6.aFloat114 + local6.aFloat115 * local9.aFloat113 + local6.aFloat117 * local9.aFloat117;
		this.aFloat113 = local9.aFloat113 * local6.aFloat116 + local9.aFloat117 * local6.aFloat113 + local9.aFloat120 * local6.aFloat119;
		this.aFloat120 = local6.aFloat124 * local9.aFloat113 + local9.aFloat117 * local6.aFloat120 + local6.aFloat118 * local9.aFloat120;
		this.aFloat115 = local9.aFloat124 * local6.aFloat114 + local6.aFloat115 * local9.aFloat116 + local9.aFloat115 * local6.aFloat117;
		this.aFloat116 = local6.aFloat119 * local9.aFloat124 + local9.aFloat115 * local6.aFloat113 + local6.aFloat116 * local9.aFloat116;
		this.aFloat124 = local6.aFloat124 * local9.aFloat116 + local6.aFloat120 * local9.aFloat115 + local9.aFloat124 * local6.aFloat118;
		this.aFloat114 = local9.aFloat114 * local6.aFloat117 + local6.aFloat115 * local9.aFloat119 + local9.aFloat118 * local6.aFloat114;
		this.aFloat119 = local9.aFloat114 * local6.aFloat113 + local6.aFloat116 * local9.aFloat119 + local6.aFloat119 * local9.aFloat118;
		this.aFloat118 = local6.aFloat118 * local9.aFloat118 + local6.aFloat124 * local9.aFloat119 + local9.aFloat114 * local6.aFloat120;
		this.aFloat123 = local6.aFloat114 * local9.aFloat121 + local6.aFloat115 * local9.aFloat122 + local6.aFloat117 * local9.aFloat123 + local6.aFloat123;
		this.aFloat122 = local6.aFloat122 + local9.aFloat123 * local6.aFloat113 + local9.aFloat122 * local6.aFloat116 + local9.aFloat121 * local6.aFloat119;
		this.aFloat121 = local6.aFloat121 + local6.aFloat118 * local9.aFloat121 + local6.aFloat120 * local9.aFloat123 + local9.aFloat122 * local6.aFloat124;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IFFF)F")
	public float method5164(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat121 + arg1 * this.aFloat120 + arg2 * this.aFloat124 + arg0 * this.aFloat118;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	@Override
	public void method5130(@OriginalArg(0) int arg0) {
		this.aFloat118 = 1.0F;
		this.aFloat117 = this.aFloat116 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat113 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat114 = this.aFloat123 = this.aFloat119 = this.aFloat122 = this.aFloat120 = this.aFloat124 = this.aFloat121 = 0.0F;
		this.aFloat115 = -this.aFloat113;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(FFFFZ[F)V")
	public void method5165(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[1] = this.aFloat119 * arg1 + this.aFloat116 * arg0 + this.aFloat113 * arg2;
		@Pc(59) float local59;
		@Pc(67) float local67;
		@Pc(51) float local51;
		@Pc(43) float local43;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local43 = -arg3 / arg2;
			local51 = this.aFloat121 + local43 * this.aFloat120;
			local67 = local43 * this.aFloat113 + this.aFloat122;
			local59 = this.aFloat123 + local43 * this.aFloat117;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local43 = -arg3 / arg0;
			local59 = this.aFloat123 + local43 * this.aFloat115;
			local67 = this.aFloat116 * local43 + this.aFloat122;
			local51 = local43 * this.aFloat124 + this.aFloat121;
		} else {
			local43 = -arg3 / arg1;
			local51 = local43 * this.aFloat118 + this.aFloat121;
			local59 = this.aFloat114 * local43 + this.aFloat123;
			local67 = this.aFloat122 + this.aFloat119 * local43;
		}
		arg4[0] = arg1 * this.aFloat114 + this.aFloat117 * arg2 + this.aFloat115 * arg0;
		arg4[2] = arg2 * this.aFloat120 + this.aFloat124 * arg0 + arg1 * this.aFloat118;
		arg4[3] = -(arg4[1] * local67 + arg4[0] * local59 + arg4[2] * local51);
	}

	@OriginalMember(owner = "client!li", name = "f", descriptor = "(I)V")
	@Override
	public void method5145(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat117;
		@Pc(21) float local21 = this.aFloat115;
		@Pc(24) float local24 = this.aFloat114;
		this.aFloat117 = local15 * this.aFloat120 + local9 * local18;
		@Pc(37) float local37 = this.aFloat123;
		this.aFloat115 = this.aFloat124 * local15 + local21 * local9;
		this.aFloat120 = this.aFloat120 * local9 - local18 * local15;
		this.aFloat114 = local9 * local24 + local15 * this.aFloat118;
		this.aFloat124 = this.aFloat124 * local9 - local21 * local15;
		this.aFloat118 = this.aFloat118 * local9 - local15 * local24;
		this.aFloat123 = local9 * local37 + local15 * this.aFloat121;
		this.aFloat121 = this.aFloat121 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
	@Override
	public void method5144(@OriginalArg(0) int arg0) {
		this.aFloat116 = 1.0F;
		this.aFloat117 = this.aFloat118 = Class8_Sub2_Sub7.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat114 = Class8_Sub2_Sub7.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat115 = this.aFloat123 = this.aFloat113 = this.aFloat119 = this.aFloat122 = this.aFloat124 = this.aFloat121 = 0.0F;
		this.aFloat120 = -this.aFloat114;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(FFIF)V")
	public void method5167(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat118 *= arg1;
		this.aFloat120 *= arg1;
		this.aFloat116 *= arg2;
		this.aFloat124 *= arg1;
		this.aFloat113 *= arg2;
		this.aFloat122 *= arg2;
		this.aFloat119 *= arg2;
		this.aFloat117 *= arg0;
		this.aFloat115 *= arg0;
		this.aFloat121 *= arg1;
		this.aFloat123 *= arg0;
		this.aFloat114 *= arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(FFFFFFBFFF)V")
	public void method5168(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat118 = arg3;
		this.aFloat120 = arg0;
		this.aFloat117 = arg7;
		this.aFloat121 = 0.0F;
		this.aFloat123 = 0.0F;
		this.aFloat113 = arg6;
		this.aFloat114 = arg2;
		this.aFloat122 = 0.0F;
		this.aFloat119 = arg5;
		this.aFloat124 = arg1;
		this.aFloat115 = arg4;
		this.aFloat116 = arg8;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(FFFI)F")
	public float method5169(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 * this.aFloat119 + this.aFloat116 * arg2 + this.aFloat113 * arg1 + this.aFloat122;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method5133() {
		@Pc(7) Class54_Sub3 local7 = new Class54_Sub3();
		local7.aFloat124 = this.aFloat124;
		local7.aFloat115 = this.aFloat115;
		local7.aFloat119 = this.aFloat119;
		local7.aFloat116 = this.aFloat116;
		local7.aFloat117 = this.aFloat117;
		local7.aFloat123 = this.aFloat123;
		local7.aFloat114 = this.aFloat114;
		local7.aFloat113 = this.aFloat113;
		local7.aFloat120 = this.aFloat120;
		local7.aFloat122 = this.aFloat122;
		local7.aFloat118 = this.aFloat118;
		local7.aFloat121 = this.aFloat121;
		return local7;
	}
}
