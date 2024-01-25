import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!iq", name = "D", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!iq", name = "G", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!iq", name = "O", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!iq", name = "P", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!iq", name = "S", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!iq", name = "U", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	public Class76_Sub1() {
		this.method9631();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III[I)V")
	@Override
	public void method9635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat97 + this.aFloat101 * (float) arg0 + (float) arg2 * this.aFloat100);
		arg3[2] = (int) ((float) arg1 * this.aFloat95 + this.aFloat103 * (float) arg0 + this.aFloat102 * (float) arg2);
		arg3[0] = (int) (this.aFloat99 * (float) arg2 + (float) arg1 * this.aFloat96 + (float) arg0 * this.aFloat98);
	}

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "(I)V")
	public void method4547() {
		this.aFloat102 = -this.aFloat102;
		this.aFloat101 = -this.aFloat101;
		this.aFloat95 = -this.aFloat95;
		this.aFloat103 = -this.aFloat103;
		this.aFloat104 = -this.aFloat104;
		this.aFloat93 = -this.aFloat93;
		this.aFloat97 = -this.aFloat97;
		this.aFloat100 = -this.aFloat100;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	@Override
	public void method9627(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class352.aFloatArray74[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class352.aFloatArray73[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat98;
		@Pc(21) float local21 = this.aFloat96;
		@Pc(24) float local24 = this.aFloat99;
		@Pc(27) float local27 = this.aFloat94;
		this.aFloat98 = local9 * local18 - this.aFloat101 * local15;
		this.aFloat101 = local9 * this.aFloat101 + local18 * local15;
		this.aFloat96 = local21 * local9 - local15 * this.aFloat97;
		this.aFloat99 = local9 * local24 - this.aFloat100 * local15;
		this.aFloat97 = local15 * local21 + local9 * this.aFloat97;
		this.aFloat94 = local27 * local9 - local15 * this.aFloat104;
		this.aFloat100 = local9 * this.aFloat100 + local15 * local24;
		this.aFloat104 = local15 * local27 + local9 * this.aFloat104;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method9629(@OriginalArg(0) Class76 arg0) {
		@Pc(6) Class76_Sub1 local6 = (Class76_Sub1) arg0;
		this.aFloat98 = local6.aFloat98;
		this.aFloat97 = local6.aFloat97;
		this.aFloat102 = local6.aFloat102;
		this.aFloat96 = local6.aFloat96;
		this.aFloat100 = local6.aFloat100;
		this.aFloat94 = local6.aFloat94;
		this.aFloat95 = local6.aFloat95;
		this.aFloat99 = local6.aFloat99;
		this.aFloat101 = local6.aFloat101;
		this.aFloat104 = local6.aFloat104;
		this.aFloat103 = local6.aFloat103;
		this.aFloat93 = local6.aFloat93;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	@Override
	public void method9630(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class352.aFloatArray74[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class352.aFloatArray73[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat101;
		@Pc(21) float local21 = this.aFloat97;
		@Pc(24) float local24 = this.aFloat100;
		this.aFloat101 = local9 * local18 - local15 * this.aFloat103;
		@Pc(38) float local38 = this.aFloat104;
		this.aFloat103 = local15 * local18 + this.aFloat103 * local9;
		this.aFloat97 = local21 * local9 - local15 * this.aFloat95;
		this.aFloat100 = local9 * local24 - local15 * this.aFloat102;
		this.aFloat95 = local15 * local21 + this.aFloat95 * local9;
		this.aFloat104 = local9 * local38 - this.aFloat93 * local15;
		this.aFloat102 = local9 * this.aFloat102 + local24 * local15;
		this.aFloat93 = local15 * local38 + local9 * this.aFloat93;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([I)V")
	@Override
	public void method9638(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat94;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat104;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat93;
		arg0[0] = (int) (this.aFloat101 * local21 + this.aFloat98 * local12 + local29 * this.aFloat103);
		arg0[1] = (int) (this.aFloat97 * local21 + local12 * this.aFloat96 + this.aFloat95 * local29);
		arg0[2] = (int) (this.aFloat100 * local21 + local12 * this.aFloat99 + this.aFloat102 * local29);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method9643() {
		@Pc(7) Class76_Sub1 local7 = new Class76_Sub1();
		local7.aFloat93 = this.aFloat93;
		local7.aFloat98 = this.aFloat98;
		local7.aFloat104 = this.aFloat104;
		local7.aFloat95 = this.aFloat95;
		local7.aFloat97 = this.aFloat97;
		local7.aFloat102 = this.aFloat102;
		local7.aFloat94 = this.aFloat94;
		local7.aFloat101 = this.aFloat101;
		local7.aFloat100 = this.aFloat100;
		local7.aFloat99 = this.aFloat99;
		local7.aFloat96 = this.aFloat96;
		local7.aFloat103 = this.aFloat103;
		return local7;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(FFIIZIF)V")
	public void method4549(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat97 = (float) arg4;
			this.aFloat98 = (float) arg2;
			this.aFloat102 = 1.0F;
			this.aFloat101 = this.aFloat103 = this.aFloat96 = this.aFloat95 = this.aFloat99 = this.aFloat100 = 0.0F;
		} else {
			@Pc(38) float local38 = Class352.aFloatArray74[arg3 & 0x3FFF];
			@Pc(44) float local44 = Class352.aFloatArray73[arg3 & 0x3FFF];
			this.aFloat98 = (float) arg2 * local38;
			this.aFloat102 = 1.0F;
			this.aFloat101 = local44 * (float) arg2;
			this.aFloat103 = this.aFloat95 = this.aFloat99 = this.aFloat100 = 0.0F;
			this.aFloat97 = local38 * (float) arg4;
			this.aFloat96 = -local44 * (float) arg4;
		}
		this.aFloat104 = arg5;
		this.aFloat93 = arg0;
		this.aFloat94 = arg1;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(III)V")
	@Override
	public void method9640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat93 += (float) arg2;
		this.aFloat104 += (float) arg1;
		this.aFloat94 += (float) arg0;
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(III[I)V")
	@Override
	public void method9644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg0 - this.aFloat94);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat104);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat93);
		arg3[2] = (int) ((float) local10 * this.aFloat99 + (float) local17 * this.aFloat100 + (float) local24 * this.aFloat102);
		arg3[1] = (int) (this.aFloat97 * (float) local17 + this.aFloat96 * (float) local10 + this.aFloat95 * (float) local24);
		arg3[0] = (int) (this.aFloat101 * (float) local17 + this.aFloat98 * (float) local10 + this.aFloat103 * (float) local24);
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
	@Override
	public void method9632(@OriginalArg(0) int arg0) {
		this.aFloat102 = 1.0F;
		this.aFloat98 = this.aFloat97 = Class352.aFloatArray74[arg0 & 0x3FFF];
		this.aFloat101 = Class352.aFloatArray73[arg0 & 0x3FFF];
		this.aFloat96 = -this.aFloat101;
		this.aFloat99 = this.aFloat94 = this.aFloat100 = this.aFloat104 = this.aFloat103 = this.aFloat95 = this.aFloat93 = 0.0F;
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V")
	@Override
	public void method9633(@OriginalArg(0) int arg0) {
		this.aFloat97 = 1.0F;
		this.aFloat98 = this.aFloat102 = Class352.aFloatArray74[arg0 & 0x3FFF];
		this.aFloat99 = Class352.aFloatArray73[arg0 & 0x3FFF];
		this.aFloat96 = this.aFloat94 = this.aFloat101 = this.aFloat100 = this.aFloat104 = this.aFloat95 = this.aFloat93 = 0.0F;
		this.aFloat103 = -this.aFloat99;
	}

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)V")
	@Override
	public void method9637(@OriginalArg(0) int arg0) {
		this.aFloat98 = 1.0F;
		this.aFloat97 = this.aFloat102 = Class352.aFloatArray74[arg0 & 0x3FFF];
		this.aFloat95 = Class352.aFloatArray73[arg0 & 0x3FFF];
		this.aFloat96 = this.aFloat99 = this.aFloat94 = this.aFloat101 = this.aFloat104 = this.aFloat103 = this.aFloat93 = 0.0F;
		this.aFloat100 = -this.aFloat95;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLclient!dm;)V")
	public void method4552(@OriginalArg(1) Class76 arg0) {
		@Pc(6) Class76_Sub1 local6 = (Class76_Sub1) arg0;
		this.aFloat99 = local6.aFloat103;
		this.aFloat96 = local6.aFloat101;
		this.aFloat98 = local6.aFloat98;
		this.aFloat101 = local6.aFloat96;
		this.aFloat97 = local6.aFloat97;
		this.aFloat103 = local6.aFloat99;
		this.aFloat100 = local6.aFloat95;
		this.aFloat94 = -(local6.aFloat93 * this.aFloat99 + this.aFloat96 * local6.aFloat104 + local6.aFloat94 * this.aFloat98);
		this.aFloat102 = local6.aFloat102;
		this.aFloat95 = local6.aFloat100;
		this.aFloat104 = -(local6.aFloat93 * this.aFloat100 + this.aFloat101 * local6.aFloat94 + local6.aFloat104 * this.aFloat97);
		this.aFloat93 = -(local6.aFloat93 * this.aFloat102 + this.aFloat95 * local6.aFloat104 + local6.aFloat94 * this.aFloat103);
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V")
	@Override
	public void method9634(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class352.aFloatArray74[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class352.aFloatArray73[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat98;
		@Pc(21) float local21 = this.aFloat96;
		@Pc(24) float local24 = this.aFloat99;
		this.aFloat98 = local15 * this.aFloat103 + local18 * local9;
		@Pc(37) float local37 = this.aFloat94;
		this.aFloat103 = this.aFloat103 * local9 - local15 * local18;
		this.aFloat96 = local21 * local9 + this.aFloat95 * local15;
		this.aFloat99 = local24 * local9 + local15 * this.aFloat102;
		this.aFloat95 = local9 * this.aFloat95 - local21 * local15;
		this.aFloat94 = this.aFloat93 * local15 + local9 * local37;
		this.aFloat102 = this.aFloat102 * local9 - local24 * local15;
		this.aFloat93 = local9 * this.aFloat93 - local37 * local15;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class352.aFloatArray74[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class352.aFloatArray73[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class352.aFloatArray74[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class352.aFloatArray73[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class352.aFloatArray74[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class352.aFloatArray73[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat101 = -local21 * local39 + local27 * local43;
		this.aFloat100 = local39 * local27 + local43 * local21;
		this.aFloat95 = -local15;
		this.aFloat98 = local33 * local21 + local27 * local47;
		this.aFloat102 = local21 * local9;
		this.aFloat96 = local39 * local9;
		this.aFloat97 = local9 * local33;
		this.aFloat103 = local9 * local27;
		this.aFloat99 = local47 * local21 + -local27 * local33;
		this.aFloat94 = (float) -arg0 * this.aFloat98 - this.aFloat96 * (float) arg1 - this.aFloat99 * (float) arg2;
		this.aFloat104 = -(this.aFloat97 * (float) arg1) + this.aFloat101 * (float) -arg0 - this.aFloat100 * (float) arg2;
		this.aFloat93 = -(this.aFloat102 * (float) arg2) + (float) -arg0 * this.aFloat103 - (float) arg1 * this.aFloat95;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	@Override
	public void method9639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat98 = this.aFloat97 = this.aFloat102 = 1.0F;
		this.aFloat101 = this.aFloat103 = this.aFloat96 = this.aFloat95 = this.aFloat99 = this.aFloat100 = 0.0F;
		this.aFloat104 = (float) arg1;
		this.aFloat93 = (float) arg2;
		this.aFloat94 = (float) arg0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "()V")
	@Override
	public void method9631() {
		this.aFloat101 = this.aFloat103 = this.aFloat96 = this.aFloat95 = this.aFloat99 = this.aFloat100 = this.aFloat94 = this.aFloat104 = this.aFloat93 = 0.0F;
		this.aFloat98 = this.aFloat97 = this.aFloat102 = 1.0F;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)[F")
	public float[] method4553() {
		Static666.aFloatArray77[8] = this.aFloat99;
		Static666.aFloatArray77[1] = this.aFloat101;
		Static666.aFloatArray77[5] = this.aFloat97;
		Static666.aFloatArray77[13] = 0.0F;
		Static666.aFloatArray77[6] = this.aFloat95;
		Static666.aFloatArray77[4] = this.aFloat96;
		Static666.aFloatArray77[0] = this.aFloat98;
		Static666.aFloatArray77[9] = this.aFloat100;
		Static666.aFloatArray77[2] = this.aFloat103;
		Static666.aFloatArray77[12] = 0.0F;
		Static666.aFloatArray77[10] = this.aFloat102;
		Static666.aFloatArray77[14] = 0.0F;
		return Static666.aFloatArray77;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(III[I)V")
	@Override
	public void method9642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat93 + this.aFloat95 * (float) arg1 + this.aFloat103 * (float) arg0 + this.aFloat102 * (float) arg2);
		arg3[1] = (int) (this.aFloat104 + this.aFloat100 * (float) arg2 + (float) arg1 * this.aFloat97 + (float) arg0 * this.aFloat101);
		arg3[0] = (int) (this.aFloat96 * (float) arg1 + this.aFloat98 * (float) arg0 + this.aFloat99 * (float) arg2 + this.aFloat94);
	}

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)[F")
	public float[] method4554() {
		Static666.aFloatArray77[13] = this.aFloat104;
		Static666.aFloatArray77[14] = this.aFloat93;
		Static666.aFloatArray77[6] = this.aFloat95;
		Static666.aFloatArray77[1] = this.aFloat101;
		Static666.aFloatArray77[5] = this.aFloat97;
		Static666.aFloatArray77[4] = this.aFloat96;
		Static666.aFloatArray77[9] = this.aFloat100;
		Static666.aFloatArray77[2] = this.aFloat103;
		Static666.aFloatArray77[12] = this.aFloat94;
		Static666.aFloatArray77[10] = this.aFloat102;
		Static666.aFloatArray77[0] = this.aFloat98;
		Static666.aFloatArray77[8] = this.aFloat99;
		return Static666.aFloatArray77;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(FF[FFFB)V")
	public void method4556(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		arg2[2] = arg3 * this.aFloat95 + this.aFloat103 * arg4 + arg0 * this.aFloat102;
		arg2[0] = this.aFloat99 * arg0 + this.aFloat98 * arg4 + arg3 * this.aFloat96;
		@Pc(72) float local72;
		@Pc(80) float local80;
		@Pc(64) float local64;
		@Pc(56) float local56;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local56 = -arg1 / arg4;
			local64 = this.aFloat93 + this.aFloat103 * local56;
			local72 = this.aFloat94 + local56 * this.aFloat98;
			local80 = this.aFloat104 + this.aFloat101 * local56;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local56 = -arg1 / arg3;
			local80 = this.aFloat104 + this.aFloat97 * local56;
			local64 = this.aFloat93 + local56 * this.aFloat95;
			local72 = this.aFloat94 + this.aFloat96 * local56;
		} else {
			local56 = -arg1 / arg0;
			local72 = this.aFloat94 + this.aFloat99 * local56;
			local80 = this.aFloat104 + this.aFloat100 * local56;
			local64 = local56 * this.aFloat102 + this.aFloat93;
		}
		arg2[1] = arg0 * this.aFloat100 + arg3 * this.aFloat97 + arg4 * this.aFloat101;
		arg2[3] = -(arg2[2] * local64 + arg2[0] * local72 + local80 * arg2[1]);
	}
}
