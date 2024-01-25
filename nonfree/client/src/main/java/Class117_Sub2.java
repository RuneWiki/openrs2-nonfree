import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class117_Sub2 extends Class117 {

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!jaa", name = "n", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!jaa", name = "p", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!jaa", name = "r", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!jaa", name = "A", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!jaa", name = "C", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!jaa", name = "E", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!jaa", name = "J", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!jaa", name = "N", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!jaa", name = "U", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!jaa", name = "ab", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!jaa", name = "eb", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V")
	public Class117_Sub2() {
		this.method7251();
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "()V")
	@Override
	public void method7251() {
		this.aFloat51 = this.aFloat55 = this.aFloat59 = this.aFloat58 = this.aFloat54 = this.aFloat53 = this.aFloat56 = this.aFloat52 = this.aFloat49 = 0.0F;
		this.aFloat50 = this.aFloat57 = this.aFloat60 = 1.0F;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([FI)[F")
	public float[] method3857(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat50;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[13] = 0.0F;
		arg0[1] = this.aFloat59;
		arg0[6] = this.aFloat53;
		arg0[14] = 0.0F;
		arg0[12] = 0.0F;
		arg0[11] = 0.0F;
		arg0[2] = this.aFloat54;
		arg0[8] = this.aFloat55;
		arg0[9] = this.aFloat58;
		arg0[15] = 0.0F;
		arg0[10] = this.aFloat60;
		arg0[4] = this.aFloat51;
		arg0[5] = this.aFloat57;
		return arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "(I)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat50;
		@Pc(21) float local21 = this.aFloat59;
		@Pc(24) float local24 = this.aFloat54;
		@Pc(27) float local27 = this.aFloat56;
		this.aFloat50 = local9 * local18 - local15 * this.aFloat51;
		this.aFloat59 = local21 * local9 - local15 * this.aFloat57;
		this.aFloat51 = local18 * local15 + this.aFloat51 * local9;
		this.aFloat54 = local9 * local24 - local15 * this.aFloat53;
		this.aFloat57 = local21 * local15 + this.aFloat57 * local9;
		this.aFloat53 = local24 * local15 + local9 * this.aFloat53;
		this.aFloat56 = local27 * local9 - this.aFloat52 * local15;
		this.aFloat52 = local15 * local27 + local9 * this.aFloat52;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FZFF)F")
	public float method3858(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat51 * arg0 + arg1 * this.aFloat57 + this.aFloat53 * arg2 + this.aFloat52;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat53 + (float) arg1 * this.aFloat57 + this.aFloat51 * (float) arg0);
		arg3[0] = (int) (this.aFloat54 * (float) arg2 + (float) arg1 * this.aFloat59 + this.aFloat50 * (float) arg0);
		arg3[2] = (int) ((float) arg2 * this.aFloat60 + (float) arg1 * this.aFloat58 + this.aFloat55 * (float) arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BFFF)V")
	public void method3859(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat49 = arg0;
		this.aFloat56 = arg1;
		this.aFloat50 = this.aFloat57 = this.aFloat60 = 1.0F;
		this.aFloat52 = arg2;
		this.aFloat51 = this.aFloat55 = this.aFloat59 = this.aFloat58 = this.aFloat54 = this.aFloat53 = 0.0F;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "()Lclient!ofa;")
	@Override
	public Class117 method7248() {
		@Pc(7) Class117_Sub2 local7 = new Class117_Sub2();
		local7.aFloat58 = this.aFloat58;
		local7.aFloat56 = this.aFloat56;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat57 = this.aFloat57;
		local7.aFloat59 = this.aFloat59;
		local7.aFloat52 = this.aFloat52;
		local7.aFloat60 = this.aFloat60;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat53 = this.aFloat53;
		local7.aFloat51 = this.aFloat51;
		return local7;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FBFF)V")
	public void method3860(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat58 *= arg2;
		this.aFloat55 *= arg2;
		this.aFloat52 *= arg1;
		this.aFloat60 *= arg2;
		this.aFloat53 *= arg1;
		this.aFloat54 *= arg0;
		this.aFloat57 *= arg1;
		this.aFloat49 *= arg2;
		this.aFloat59 *= arg0;
		this.aFloat51 *= arg1;
		this.aFloat50 *= arg0;
		this.aFloat56 *= arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(III)V")
	@Override
	public void method7247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat49 += (float) arg2;
		this.aFloat56 += (float) arg0;
		this.aFloat52 += (float) arg1;
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)V")
	@Override
	public void method7246(@OriginalArg(0) int arg0) {
		this.aFloat50 = 1.0F;
		this.aFloat57 = this.aFloat60 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat58 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat53 = -this.aFloat58;
		this.aFloat59 = this.aFloat54 = this.aFloat56 = this.aFloat51 = this.aFloat52 = this.aFloat55 = this.aFloat49 = 0.0F;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z[F)[F")
	public float[] method3862(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat50;
		arg0[6] = this.aFloat53;
		arg0[4] = this.aFloat51;
		arg0[3] = this.aFloat56;
		arg0[7] = this.aFloat52;
		arg0[1] = this.aFloat59;
		arg0[5] = this.aFloat57;
		arg0[2] = this.aFloat54;
		return arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)V")
	@Override
	public void method7249(@OriginalArg(0) int arg0) {
		this.aFloat60 = 1.0F;
		this.aFloat50 = this.aFloat57 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat51 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat54 = this.aFloat56 = this.aFloat53 = this.aFloat52 = this.aFloat55 = this.aFloat58 = this.aFloat49 = 0.0F;
		this.aFloat59 = -this.aFloat51;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ofa;B)V")
	public void method3863(@OriginalArg(0) Class117 arg0) {
		@Pc(6) Class117_Sub2 local6 = (Class117_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat50;
		@Pc(12) float local12 = this.aFloat51;
		@Pc(15) float local15 = this.aFloat59;
		@Pc(18) float local18 = this.aFloat57;
		@Pc(21) float local21 = this.aFloat54;
		@Pc(24) float local24 = this.aFloat53;
		@Pc(27) float local27 = this.aFloat56;
		@Pc(38) float local38 = this.aFloat52;
		this.aFloat50 = local6.aFloat54 * this.aFloat55 + local12 * local6.aFloat59 + local6.aFloat50 * local9;
		this.aFloat51 = this.aFloat55 * local6.aFloat53 + local6.aFloat57 * local12 + local9 * local6.aFloat51;
		this.aFloat55 = local12 * local6.aFloat58 + local6.aFloat55 * local9 + this.aFloat55 * local6.aFloat60;
		this.aFloat59 = this.aFloat58 * local6.aFloat54 + local6.aFloat59 * local18 + local6.aFloat50 * local15;
		this.aFloat57 = local6.aFloat51 * local15 + local6.aFloat57 * local18 + this.aFloat58 * local6.aFloat53;
		this.aFloat54 = local6.aFloat50 * local21 + local6.aFloat59 * local24 + this.aFloat60 * local6.aFloat54;
		this.aFloat53 = local6.aFloat51 * local21 + local24 * local6.aFloat57 + local6.aFloat53 * this.aFloat60;
		this.aFloat58 = this.aFloat58 * local6.aFloat60 + local18 * local6.aFloat58 + local15 * local6.aFloat55;
		this.aFloat56 = local6.aFloat59 * local38 + local27 * local6.aFloat50 + this.aFloat49 * local6.aFloat54 + local6.aFloat56;
		this.aFloat60 = local6.aFloat60 * this.aFloat60 + local21 * local6.aFloat55 + local24 * local6.aFloat58;
		this.aFloat52 = local6.aFloat52 + this.aFloat49 * local6.aFloat53 + local27 * local6.aFloat51 + local6.aFloat57 * local38;
		this.aFloat49 = this.aFloat49 * local6.aFloat60 + local27 * local6.aFloat55 + local38 * local6.aFloat58 + local6.aFloat49;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ofa;)V")
	@Override
	public void method7253(@OriginalArg(0) Class117 arg0) {
		@Pc(6) Class117_Sub2 local6 = (Class117_Sub2) arg0;
		this.aFloat49 = local6.aFloat49;
		this.aFloat59 = local6.aFloat59;
		this.aFloat52 = local6.aFloat52;
		this.aFloat51 = local6.aFloat51;
		this.aFloat55 = local6.aFloat55;
		this.aFloat58 = local6.aFloat58;
		this.aFloat54 = local6.aFloat54;
		this.aFloat50 = local6.aFloat50;
		this.aFloat56 = local6.aFloat56;
		this.aFloat60 = local6.aFloat60;
		this.aFloat57 = local6.aFloat57;
		this.aFloat53 = local6.aFloat53;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BFFF)F")
	public float method3864(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat49 + this.aFloat55 * arg0 + arg1 * this.aFloat58 + arg2 * this.aFloat60;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FFFI)V")
	public void method3865(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat52 += arg2;
		this.aFloat49 += arg1;
		this.aFloat56 += arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLclient!ofa;)V")
	public void method3866(@OriginalArg(1) Class117 arg0) {
		@Pc(6) Class117_Sub2 local6 = (Class117_Sub2) arg0;
		this.aFloat59 = local6.aFloat59;
		this.aFloat56 = 0.0F;
		this.aFloat54 = local6.aFloat54;
		this.aFloat60 = local6.aFloat60;
		this.aFloat53 = local6.aFloat53;
		this.aFloat50 = local6.aFloat50;
		this.aFloat49 = 0.0F;
		this.aFloat58 = local6.aFloat58;
		this.aFloat51 = local6.aFloat51;
		this.aFloat57 = local6.aFloat57;
		this.aFloat52 = 0.0F;
		this.aFloat55 = local6.aFloat55;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FFFIIII)V")
	public void method3867(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 == 0) {
			this.aFloat52 = (float) -arg4 + arg0;
			this.aFloat50 = (float) (arg5 * 2);
			this.aFloat51 = this.aFloat55 = this.aFloat59 = this.aFloat58 = this.aFloat54 = this.aFloat53 = 0.0F;
			this.aFloat57 = (float) (arg4 * 2);
			this.aFloat60 = 1.0F;
			this.aFloat49 = arg1;
			this.aFloat56 = (float) -arg5 + arg2;
			return;
		}
		@Pc(63) float local63 = Class103_Sub1.aFloatArray50[arg3 & 0x3FFF];
		@Pc(69) float local69 = Class103_Sub1.aFloatArray51[arg3 & 0x3FFF];
		this.aFloat52 = arg0 + (float) (arg4 * 2) * (local69 * -0.5F - local63 * 0.5F);
		this.aFloat55 = this.aFloat58 = this.aFloat54 = this.aFloat53 = 0.0F;
		this.aFloat56 = arg2 + (local69 * 0.5F - local63 * 0.5F) * (float) (arg5 * 2);
		this.aFloat57 = (float) arg4 * 2.0F * local63;
		this.aFloat51 = (float) arg5 * 2.0F * local69;
		this.aFloat60 = 1.0F;
		this.aFloat49 = arg1;
		this.aFloat50 = local63 * 2.0F * (float) arg5;
		this.aFloat59 = (float) arg4 * local69 * -2.0F;
	}

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "(I)V")
	public void method3869() {
		this.aFloat53 = -this.aFloat53;
		this.aFloat60 = -this.aFloat60;
		this.aFloat55 = -this.aFloat55;
		this.aFloat52 = -this.aFloat52;
		this.aFloat57 = -this.aFloat57;
		this.aFloat58 = -this.aFloat58;
		this.aFloat51 = -this.aFloat51;
		this.aFloat49 = -this.aFloat49;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat56 + this.aFloat54 * (float) arg2 + this.aFloat50 * (float) arg0 + (float) arg1 * this.aFloat59);
		arg3[1] = (int) ((float) arg2 * this.aFloat53 + (float) arg0 * this.aFloat51 + this.aFloat57 * (float) arg1 + this.aFloat52);
		arg3[2] = (int) (this.aFloat49 + this.aFloat55 * (float) arg0 + (float) arg1 * this.aFloat58 + (float) arg2 * this.aFloat60);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([I)V")
	@Override
	public void method7252(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat56;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat52;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat49;
		arg0[2] = (int) (this.aFloat53 * local20 + local11 * this.aFloat54 + this.aFloat60 * local28);
		arg0[0] = (int) (local11 * this.aFloat50 + this.aFloat51 * local20 + this.aFloat55 * local28);
		arg0[1] = (int) (this.aFloat57 * local20 + local11 * this.aFloat59 + local28 * this.aFloat58);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FFFFIFFFFF)V")
	public void method3871(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat52 = 0.0F;
		this.aFloat57 = arg6;
		this.aFloat60 = arg2;
		this.aFloat53 = arg8;
		this.aFloat56 = 0.0F;
		this.aFloat55 = arg7;
		this.aFloat50 = arg0;
		this.aFloat54 = arg5;
		this.aFloat51 = arg1;
		this.aFloat49 = 0.0F;
		this.aFloat59 = arg4;
		this.aFloat58 = arg3;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([FFFFI)V")
	public void method3872(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		arg0[2] = arg2 * this.aFloat55 + arg3 * this.aFloat58 + this.aFloat60 * arg1;
		arg0[0] = arg2 * this.aFloat50 + this.aFloat59 * arg3 + arg1 * this.aFloat54;
		arg0[1] = this.aFloat57 * arg3 + this.aFloat51 * arg2 + this.aFloat53 * arg1;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class103_Sub1.aFloatArray50[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class103_Sub1.aFloatArray51[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class103_Sub1.aFloatArray50[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class103_Sub1.aFloatArray51[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class103_Sub1.aFloatArray50[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class103_Sub1.aFloatArray51[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat58 = -local15;
		this.aFloat57 = local9 * local33;
		this.aFloat53 = local21 * local43 + local39 * local27;
		this.aFloat51 = local27 * local43 + local39 * -local21;
		this.aFloat60 = local21 * local9;
		this.aFloat54 = local33 * -local27 + local21 * local47;
		this.aFloat59 = local9 * local39;
		this.aFloat50 = local33 * local21 + local47 * local27;
		this.aFloat55 = local27 * local9;
		this.aFloat49 = -((float) arg2 * this.aFloat60) - this.aFloat58 * (float) arg1 + this.aFloat55 * (float) -arg0;
		this.aFloat52 = -(this.aFloat53 * (float) arg2) + this.aFloat51 * (float) -arg0 - (float) arg1 * this.aFloat57;
		this.aFloat56 = -((float) arg2 * this.aFloat54) - (float) arg1 * this.aFloat59 + this.aFloat50 * (float) -arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "(I)V")
	@Override
	public void method7258(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat51;
		@Pc(21) float local21 = this.aFloat57;
		@Pc(24) float local24 = this.aFloat53;
		this.aFloat51 = local9 * local18 - this.aFloat55 * local15;
		@Pc(37) float local37 = this.aFloat52;
		this.aFloat55 = this.aFloat55 * local9 + local15 * local18;
		this.aFloat57 = local21 * local9 - local15 * this.aFloat58;
		this.aFloat53 = local24 * local9 - this.aFloat60 * local15;
		this.aFloat58 = local21 * local15 + local9 * this.aFloat58;
		this.aFloat52 = local9 * local37 - local15 * this.aFloat49;
		this.aFloat60 = local9 * this.aFloat60 + local15 * local24;
		this.aFloat49 = this.aFloat49 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V")
	@Override
	public void method7243(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat50;
		@Pc(21) float local21 = this.aFloat59;
		@Pc(24) float local24 = this.aFloat54;
		@Pc(27) float local27 = this.aFloat56;
		this.aFloat50 = local9 * local18 + this.aFloat55 * local15;
		this.aFloat59 = this.aFloat58 * local15 + local21 * local9;
		this.aFloat55 = this.aFloat55 * local9 - local15 * local18;
		this.aFloat58 = local9 * this.aFloat58 - local15 * local21;
		this.aFloat54 = this.aFloat60 * local15 + local9 * local24;
		this.aFloat56 = local9 * local27 + local15 * this.aFloat49;
		this.aFloat60 = this.aFloat60 * local9 - local15 * local24;
		this.aFloat49 = local9 * this.aFloat49 - local15 * local27;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(FFFI)F")
	public float method3875(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 * this.aFloat54 + arg1 * this.aFloat59 + arg2 * this.aFloat50 + this.aFloat56;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BLclient!ofa;)V")
	public void method3876(@OriginalArg(1) Class117 arg0) {
		@Pc(6) Class117_Sub2 local6 = (Class117_Sub2) arg0;
		this.aFloat50 = local6.aFloat50;
		this.aFloat54 = local6.aFloat55;
		this.aFloat59 = local6.aFloat51;
		this.aFloat57 = local6.aFloat57;
		this.aFloat55 = local6.aFloat54;
		this.aFloat51 = local6.aFloat59;
		this.aFloat53 = local6.aFloat58;
		this.aFloat60 = local6.aFloat60;
		this.aFloat58 = local6.aFloat53;
		this.aFloat56 = -(this.aFloat59 * local6.aFloat52 + local6.aFloat56 * this.aFloat50 + this.aFloat54 * local6.aFloat49);
		this.aFloat52 = -(this.aFloat53 * local6.aFloat49 + local6.aFloat52 * this.aFloat57 + this.aFloat51 * local6.aFloat56);
		this.aFloat49 = -(this.aFloat60 * local6.aFloat49 + local6.aFloat52 * this.aFloat58 + local6.aFloat56 * this.aFloat55);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([FFZFFF)V")
	public void method3877(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(30) float local30;
		@Pc(38) float local38;
		@Pc(46) float local46;
		@Pc(22) float local22;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local22 = -arg4 / arg2;
			local30 = local22 * this.aFloat50 + this.aFloat56;
			local38 = this.aFloat52 + local22 * this.aFloat51;
			local46 = this.aFloat49 + local22 * this.aFloat55;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local22 = -arg4 / arg1;
			local46 = this.aFloat49 + local22 * this.aFloat58;
			local38 = this.aFloat57 * local22 + this.aFloat52;
			local30 = local22 * this.aFloat59 + this.aFloat56;
		} else {
			local22 = -arg4 / arg3;
			local30 = this.aFloat56 + this.aFloat54 * local22;
			local38 = this.aFloat52 + local22 * this.aFloat53;
			local46 = this.aFloat60 * local22 + this.aFloat49;
		}
		arg0[1] = arg1 * this.aFloat57 + this.aFloat51 * arg2 + this.aFloat53 * arg3;
		arg0[2] = this.aFloat60 * arg3 + this.aFloat58 * arg1 + this.aFloat55 * arg2;
		arg0[0] = arg1 * this.aFloat59 + this.aFloat50 * arg2 + arg3 * this.aFloat54;
		arg0[3] = -(local30 * arg0[0] + local38 * arg0[1] + arg0[2] * local46);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
	@Override
	public void method7242(@OriginalArg(0) int arg0) {
		this.aFloat57 = 1.0F;
		this.aFloat50 = this.aFloat60 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat54 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat55 = -this.aFloat54;
		this.aFloat59 = this.aFloat56 = this.aFloat51 = this.aFloat53 = this.aFloat52 = this.aFloat58 = this.aFloat49 = 0.0F;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FFFB)V")
	public void method3878(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat51 = 0.0F;
		this.aFloat59 = 0.0F;
		this.aFloat49 = 0.0F;
		this.aFloat52 = 0.0F;
		this.aFloat58 = 0.0F;
		this.aFloat50 = arg1;
		this.aFloat56 = 0.0F;
		this.aFloat57 = arg0;
		this.aFloat53 = 0.0F;
		this.aFloat60 = arg2;
		this.aFloat54 = 0.0F;
		this.aFloat55 = 0.0F;
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat52);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat56);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat49);
		arg3[1] = (int) (this.aFloat57 * (float) local6 + (float) local13 * this.aFloat59 + (float) local24 * this.aFloat58);
		arg3[0] = (int) (this.aFloat50 * (float) local13 + (float) local6 * this.aFloat51 + this.aFloat55 * (float) local24);
		arg3[2] = (int) (this.aFloat60 * (float) local24 + (float) local6 * this.aFloat53 + this.aFloat54 * (float) local13);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I[F)[F")
	public float[] method3879(@OriginalArg(1) float[] arg0) {
		arg0[7] = this.aFloat52;
		arg0[1] = this.aFloat59;
		arg0[15] = 1.0F;
		arg0[5] = this.aFloat57;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat60;
		arg0[12] = 0.0F;
		arg0[11] = this.aFloat49;
		arg0[6] = this.aFloat53;
		arg0[9] = this.aFloat58;
		arg0[2] = this.aFloat54;
		arg0[0] = this.aFloat50;
		arg0[13] = 0.0F;
		arg0[3] = this.aFloat56;
		arg0[4] = this.aFloat51;
		arg0[8] = this.aFloat55;
		return arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ofa;Lclient!ofa;)V")
	public void method3880(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class117 arg1) {
		@Pc(6) Class117_Sub2 local6 = (Class117_Sub2) arg0;
		@Pc(9) Class117_Sub2 local9 = (Class117_Sub2) arg1;
		this.aFloat50 = local6.aFloat59 * local9.aFloat51 + local9.aFloat50 * local6.aFloat50 + local9.aFloat55 * local6.aFloat54;
		this.aFloat51 = local9.aFloat55 * local6.aFloat53 + local9.aFloat50 * local6.aFloat51 + local9.aFloat51 * local6.aFloat57;
		this.aFloat55 = local6.aFloat60 * local9.aFloat55 + local9.aFloat51 * local6.aFloat58 + local9.aFloat50 * local6.aFloat55;
		this.aFloat59 = local9.aFloat58 * local6.aFloat54 + local6.aFloat59 * local9.aFloat57 + local9.aFloat59 * local6.aFloat50;
		this.aFloat57 = local9.aFloat57 * local6.aFloat57 + local6.aFloat51 * local9.aFloat59 + local6.aFloat53 * local9.aFloat58;
		this.aFloat54 = local9.aFloat54 * local6.aFloat50 + local9.aFloat53 * local6.aFloat59 + local9.aFloat60 * local6.aFloat54;
		this.aFloat58 = local9.aFloat58 * local6.aFloat60 + local9.aFloat57 * local6.aFloat58 + local9.aFloat59 * local6.aFloat55;
		this.aFloat53 = local6.aFloat57 * local9.aFloat53 + local6.aFloat51 * local9.aFloat54 + local6.aFloat53 * local9.aFloat60;
		this.aFloat60 = local9.aFloat53 * local6.aFloat58 + local6.aFloat55 * local9.aFloat54 + local9.aFloat60 * local6.aFloat60;
		this.aFloat56 = local6.aFloat56 + local9.aFloat56 * local6.aFloat50 + local6.aFloat59 * local9.aFloat52 + local9.aFloat49 * local6.aFloat54;
		this.aFloat52 = local9.aFloat52 * local6.aFloat57 + local6.aFloat51 * local9.aFloat56 + local6.aFloat53 * local9.aFloat49 + local6.aFloat52;
		this.aFloat49 = local9.aFloat52 * local6.aFloat58 + local9.aFloat56 * local6.aFloat55 + local9.aFloat49 * local6.aFloat60 + local6.aFloat49;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B[F)[F")
	public float[] method3881(@OriginalArg(1) float[] arg0) {
		arg0[5] = this.aFloat57;
		arg0[4] = this.aFloat59;
		arg0[15] = 1.0F;
		arg0[14] = this.aFloat49;
		arg0[3] = 0.0F;
		arg0[13] = this.aFloat52;
		arg0[12] = this.aFloat56;
		arg0[9] = this.aFloat53;
		arg0[2] = this.aFloat55;
		arg0[10] = this.aFloat60;
		arg0[11] = 0.0F;
		arg0[7] = 0.0F;
		arg0[0] = this.aFloat50;
		arg0[8] = this.aFloat54;
		arg0[6] = this.aFloat58;
		arg0[1] = this.aFloat51;
		return arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I[F)[F")
	public float[] method3882(@OriginalArg(1) float[] arg0) {
		arg0[12] = 0.0F;
		arg0[2] = 0.0F;
		arg0[0] = this.aFloat50;
		arg0[11] = 0.0F;
		arg0[14] = 0.0F;
		arg0[7] = (float) 0;
		arg0[9] = this.aFloat52;
		arg0[6] = 0.0F;
		arg0[10] = this.aFloat49;
		arg0[1] = this.aFloat51;
		arg0[4] = this.aFloat59;
		arg0[3] = 0.0F;
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat56;
		arg0[5] = this.aFloat57;
		arg0[13] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)V")
	@Override
	public void method7244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat50 = this.aFloat57 = this.aFloat60 = 1.0F;
		this.aFloat49 = (float) arg2;
		this.aFloat51 = this.aFloat55 = this.aFloat59 = this.aFloat58 = this.aFloat54 = this.aFloat53 = 0.0F;
		this.aFloat52 = (float) arg1;
		this.aFloat56 = (float) arg0;
	}
}
