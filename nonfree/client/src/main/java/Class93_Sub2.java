import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class93_Sub2 extends Class93 {

	@OriginalMember(owner = "client!im", name = "j", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!im", name = "q", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!im", name = "r", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!im", name = "v", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!im", name = "y", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!im", name = "C", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!im", name = "I", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!im", name = "J", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!im", name = "K", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!im", name = "M", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class93_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!im", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class6_Sub45.aFloatArray68[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub45.aFloatArray69[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class6_Sub45.aFloatArray68[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class6_Sub45.aFloatArray69[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class6_Sub45.aFloatArray68[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class6_Sub45.aFloatArray69[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat94 = local9 * local27;
		this.aFloat98 = local33 * local21 + local47 * local27;
		this.aFloat103 = -local15;
		this.aFloat99 = local39 * -local21 + local43 * local27;
		this.aFloat105 = local9 * local21;
		this.aFloat101 = local33 * local9;
		this.aFloat97 = local43 * local21 + local27 * local39;
		this.aFloat95 = local9 * local39;
		this.aFloat102 = local21 * local47 + local33 * -local27;
		this.aFloat104 = -(this.aFloat97 * (float) arg2) - (float) arg1 * this.aFloat101 + this.aFloat99 * (float) -arg0;
		this.aFloat96 = -((float) arg2 * this.aFloat102) - this.aFloat95 * (float) arg1 + this.aFloat98 * (float) -arg0;
		this.aFloat100 = -((float) arg2 * this.aFloat105) + this.aFloat94 * (float) -arg0 - (float) arg1 * this.aFloat103;
	}

	@OriginalMember(owner = "client!im", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub45.aFloatArray68[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub45.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat99;
		@Pc(21) float local21 = this.aFloat101;
		@Pc(24) float local24 = this.aFloat97;
		this.aFloat99 = local18 * local9 - this.aFloat94 * local15;
		@Pc(38) float local38 = this.aFloat104;
		this.aFloat94 = local9 * this.aFloat94 + local15 * local18;
		this.aFloat101 = local9 * local21 - this.aFloat103 * local15;
		this.aFloat103 = local21 * local15 + this.aFloat103 * local9;
		this.aFloat97 = local24 * local9 - this.aFloat105 * local15;
		this.aFloat104 = local38 * local9 - this.aFloat100 * local15;
		this.aFloat105 = this.aFloat105 * local9 + local15 * local24;
		this.aFloat100 = local15 * local38 + local9 * this.aFloat100;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(FIIIFFI)V")
	public void method3564(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg1 == 0) {
			this.aFloat99 = this.aFloat94 = this.aFloat95 = this.aFloat103 = this.aFloat102 = this.aFloat97 = 0.0F;
			this.aFloat98 = arg5;
			this.aFloat105 = 1.0F;
			this.aFloat101 = arg2;
		} else {
			@Pc(38) float local38 = Class6_Sub45.aFloatArray68[arg1 & 0x3FFF];
			@Pc(44) float local44 = Class6_Sub45.aFloatArray69[arg1 & 0x3FFF];
			this.aFloat95 = -local44 * (float) arg2;
			this.aFloat99 = (float) arg5 * local44;
			this.aFloat94 = this.aFloat103 = this.aFloat102 = this.aFloat97 = 0.0F;
			this.aFloat98 = (float) arg5 * local38;
			this.aFloat101 = local38 * (float) arg2;
			this.aFloat105 = 1.0F;
		}
		this.aFloat96 = arg3;
		this.aFloat100 = arg4;
		this.aFloat104 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class93 arg0) {
		@Pc(6) Class93_Sub2 local6 = (Class93_Sub2) arg0;
		this.aFloat100 = local6.aFloat100;
		this.aFloat101 = local6.aFloat101;
		this.aFloat96 = local6.aFloat96;
		this.aFloat105 = local6.aFloat105;
		this.aFloat102 = local6.aFloat102;
		this.aFloat95 = local6.aFloat95;
		this.aFloat98 = local6.aFloat98;
		this.aFloat97 = local6.aFloat97;
		this.aFloat99 = local6.aFloat99;
		this.aFloat103 = local6.aFloat103;
		this.aFloat94 = local6.aFloat94;
		this.aFloat104 = local6.aFloat104;
	}

	@OriginalMember(owner = "client!im", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat99 = this.aFloat94 = this.aFloat95 = this.aFloat103 = this.aFloat102 = this.aFloat97 = 0.0F;
		this.aFloat104 = arg1;
		this.aFloat98 = this.aFloat101 = this.aFloat105 = 1.0F;
		this.aFloat96 = arg0;
		this.aFloat100 = arg2;
	}

	@OriginalMember(owner = "client!im", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat105 = 1.0F;
		this.aFloat98 = this.aFloat101 = Class6_Sub45.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat99 = Class6_Sub45.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat102 = this.aFloat96 = this.aFloat97 = this.aFloat104 = this.aFloat94 = this.aFloat103 = this.aFloat100 = 0.0F;
		this.aFloat95 = -this.aFloat99;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat104 + this.aFloat99 * (float) arg0 + (float) arg1 * this.aFloat101 + this.aFloat97 * (float) arg2);
		arg3[0] = (int) (this.aFloat102 * (float) arg2 + (float) arg1 * this.aFloat95 + this.aFloat98 * (float) arg0 + this.aFloat96);
		arg3[2] = (int) (this.aFloat100 + this.aFloat105 * (float) arg2 + this.aFloat94 * (float) arg0 + (float) arg1 * this.aFloat103);
	}

	@OriginalMember(owner = "client!im", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat96;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat104;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat100;
		arg0[0] = (int) (this.aFloat98 * local11 + local19 * this.aFloat99 + local27 * this.aFloat94);
		arg0[1] = (int) (local11 * this.aFloat95 + local19 * this.aFloat101 + local27 * this.aFloat103);
		arg0[2] = (int) (this.aFloat102 * local11 + this.aFloat97 * local19 + this.aFloat105 * local27);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BLclient!q;)V")
	public void method3567(@OriginalArg(1) Class93 arg0) {
		@Pc(6) Class93_Sub2 local6 = (Class93_Sub2) arg0;
		this.aFloat102 = local6.aFloat94;
		this.aFloat95 = local6.aFloat99;
		this.aFloat98 = local6.aFloat98;
		this.aFloat99 = local6.aFloat95;
		this.aFloat101 = local6.aFloat101;
		this.aFloat94 = local6.aFloat102;
		this.aFloat97 = local6.aFloat103;
		this.aFloat105 = local6.aFloat105;
		this.aFloat96 = -(local6.aFloat104 * this.aFloat95 + this.aFloat98 * local6.aFloat96 + this.aFloat102 * local6.aFloat100);
		this.aFloat103 = local6.aFloat97;
		this.aFloat104 = -(local6.aFloat96 * this.aFloat99 + local6.aFloat104 * this.aFloat101 + this.aFloat97 * local6.aFloat100);
		this.aFloat100 = -(local6.aFloat100 * this.aFloat105 + local6.aFloat104 * this.aFloat103 + local6.aFloat96 * this.aFloat94);
	}

	@OriginalMember(owner = "client!im", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub45.aFloatArray68[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub45.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat98;
		@Pc(21) float local21 = this.aFloat95;
		@Pc(24) float local24 = this.aFloat102;
		@Pc(27) float local27 = this.aFloat96;
		this.aFloat98 = local18 * local9 + local15 * this.aFloat94;
		this.aFloat94 = this.aFloat94 * local9 - local15 * local18;
		this.aFloat95 = this.aFloat103 * local15 + local21 * local9;
		this.aFloat102 = this.aFloat105 * local15 + local9 * local24;
		this.aFloat103 = local9 * this.aFloat103 - local15 * local21;
		this.aFloat96 = local9 * local27 + this.aFloat100 * local15;
		this.aFloat105 = this.aFloat105 * local9 - local24 * local15;
		this.aFloat100 = local9 * this.aFloat100 - local15 * local27;
	}

	@OriginalMember(owner = "client!im", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat98 = 1.0F;
		this.aFloat101 = this.aFloat105 = Class6_Sub45.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat103 = Class6_Sub45.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat95 = this.aFloat102 = this.aFloat96 = this.aFloat99 = this.aFloat104 = this.aFloat94 = this.aFloat100 = 0.0F;
		this.aFloat97 = -this.aFloat103;
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(I)[F")
	public float[] method3568() {
		Static495.aFloatArray80[12] = this.aFloat96;
		Static495.aFloatArray80[8] = this.aFloat102;
		Static495.aFloatArray80[5] = this.aFloat101;
		Static495.aFloatArray80[0] = this.aFloat98;
		Static495.aFloatArray80[9] = this.aFloat97;
		Static495.aFloatArray80[1] = this.aFloat99;
		Static495.aFloatArray80[4] = this.aFloat95;
		Static495.aFloatArray80[2] = this.aFloat94;
		Static495.aFloatArray80[10] = this.aFloat105;
		Static495.aFloatArray80[13] = this.aFloat104;
		Static495.aFloatArray80[6] = this.aFloat103;
		Static495.aFloatArray80[14] = this.aFloat100;
		return Static495.aFloatArray80;
	}

	@OriginalMember(owner = "client!im", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat104 += arg1;
		this.aFloat96 += arg0;
		this.aFloat100 += arg2;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)[F")
	public float[] method3569() {
		Static495.aFloatArray80[10] = this.aFloat105;
		Static495.aFloatArray80[5] = this.aFloat101;
		Static495.aFloatArray80[0] = this.aFloat98;
		Static495.aFloatArray80[13] = 0.0F;
		Static495.aFloatArray80[4] = this.aFloat95;
		Static495.aFloatArray80[8] = this.aFloat102;
		Static495.aFloatArray80[2] = this.aFloat94;
		Static495.aFloatArray80[9] = this.aFloat97;
		Static495.aFloatArray80[14] = 0.0F;
		Static495.aFloatArray80[6] = this.aFloat103;
		Static495.aFloatArray80[12] = 0.0F;
		Static495.aFloatArray80[1] = this.aFloat99;
		return Static495.aFloatArray80;
	}

	@OriginalMember(owner = "client!im", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat103 * (float) arg1 + (float) arg0 * this.aFloat94 + (float) arg2 * this.aFloat105);
		arg3[1] = (int) ((float) arg0 * this.aFloat99 + this.aFloat101 * (float) arg1 + this.aFloat97 * (float) arg2);
		arg3[0] = (int) (this.aFloat102 * (float) arg2 + this.aFloat95 * (float) arg1 + this.aFloat98 * (float) arg0);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class93 method7795() {
		@Pc(7) Class93_Sub2 local7 = new Class93_Sub2();
		local7.aFloat95 = this.aFloat95;
		local7.aFloat104 = this.aFloat104;
		local7.aFloat103 = this.aFloat103;
		local7.aFloat105 = this.aFloat105;
		local7.aFloat97 = this.aFloat97;
		local7.aFloat94 = this.aFloat94;
		local7.aFloat99 = this.aFloat99;
		local7.aFloat96 = this.aFloat96;
		local7.aFloat102 = this.aFloat102;
		local7.aFloat100 = this.aFloat100;
		local7.aFloat98 = this.aFloat98;
		local7.aFloat101 = this.aFloat101;
		return local7;
	}

	@OriginalMember(owner = "client!im", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat99 = this.aFloat94 = this.aFloat95 = this.aFloat103 = this.aFloat102 = this.aFloat97 = this.aFloat96 = this.aFloat104 = this.aFloat100 = 0.0F;
		this.aFloat98 = this.aFloat101 = this.aFloat105 = 1.0F;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat101 = 1.0F;
		this.aFloat98 = this.aFloat105 = Class6_Sub45.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat102 = Class6_Sub45.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat95 = this.aFloat96 = this.aFloat99 = this.aFloat97 = this.aFloat104 = this.aFloat103 = this.aFloat100 = 0.0F;
		this.aFloat94 = -this.aFloat102;
	}
}
