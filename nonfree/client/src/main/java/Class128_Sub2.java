import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class128_Sub2 extends Class128 {

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class128_Sub2() {
		this.ha();
	}

	@OriginalMember(owner = "client!kc", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat94 += arg1;
		this.aFloat96 += arg2;
		this.aFloat93 += arg0;
	}

	@OriginalMember(owner = "client!kc", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat89 = this.aFloat92 = this.aFloat98 = this.aFloat91 = this.aFloat95 = this.aFloat97 = this.aFloat93 = this.aFloat94 = this.aFloat96 = 0.0F;
		this.aFloat100 = this.aFloat90 = this.aFloat99 = 1.0F;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat93 + (float) arg2 * this.aFloat95 + (float) arg1 * this.aFloat98 + (float) arg0 * this.aFloat100);
		arg3[1] = (int) (this.aFloat94 + this.aFloat97 * (float) arg2 + this.aFloat90 * (float) arg1 + this.aFloat89 * (float) arg0);
		arg3[2] = (int) (this.aFloat91 * (float) arg1 + (float) arg0 * this.aFloat92 + this.aFloat99 * (float) arg2 + this.aFloat96);
	}

	@OriginalMember(owner = "client!kc", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat100 = 1.0F;
		this.aFloat90 = this.aFloat99 = Class1_Sub3_Sub9.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat91 = Class1_Sub3_Sub9.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat98 = this.aFloat95 = this.aFloat93 = this.aFloat89 = this.aFloat94 = this.aFloat92 = this.aFloat96 = 0.0F;
		this.aFloat97 = -this.aFloat91;
	}

	@OriginalMember(owner = "client!kc", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat93;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat94;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat96;
		arg0[1] = (int) (this.aFloat98 * local11 + this.aFloat90 * local19 + this.aFloat91 * local28);
		arg0[0] = (int) (this.aFloat92 * local28 + this.aFloat100 * local11 + this.aFloat89 * local19);
		arg0[2] = (int) (local28 * this.aFloat99 + local19 * this.aFloat97 + this.aFloat95 * local11);
	}

	@OriginalMember(owner = "client!kc", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat89 = this.aFloat92 = this.aFloat98 = this.aFloat91 = this.aFloat95 = this.aFloat97 = 0.0F;
		this.aFloat100 = this.aFloat90 = this.aFloat99 = 1.0F;
		this.aFloat93 = arg0;
		this.aFloat94 = arg1;
		this.aFloat96 = arg2;
	}

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat99 * (float) arg2 + (float) arg0 * this.aFloat92 + (float) arg1 * this.aFloat91);
		arg3[1] = (int) (this.aFloat97 * (float) arg2 + this.aFloat89 * (float) arg0 + this.aFloat90 * (float) arg1);
		arg3[0] = (int) ((float) arg2 * this.aFloat95 + (float) arg0 * this.aFloat100 + this.aFloat98 * (float) arg1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIFFIFI)V")
	public void method4324(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat90 = arg3;
			this.aFloat99 = 1.0F;
			this.aFloat89 = this.aFloat92 = this.aFloat98 = this.aFloat91 = this.aFloat95 = this.aFloat97 = 0.0F;
			this.aFloat100 = arg0;
		} else {
			@Pc(38) float local38 = Class1_Sub3_Sub9.aFloatArray22[arg5 & 0x3FFF];
			@Pc(44) float local44 = Class1_Sub3_Sub9.aFloatArray23[arg5 & 0x3FFF];
			this.aFloat92 = this.aFloat91 = this.aFloat95 = this.aFloat97 = 0.0F;
			this.aFloat99 = 1.0F;
			this.aFloat98 = -local44 * (float) arg3;
			this.aFloat90 = (float) arg3 * local38;
			this.aFloat89 = local44 * (float) arg0;
			this.aFloat100 = (float) arg0 * local38;
		}
		this.aFloat93 = arg2;
		this.aFloat94 = arg4;
		this.aFloat96 = arg1;
	}

	@OriginalMember(owner = "client!kc", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat90 = 1.0F;
		this.aFloat100 = this.aFloat99 = Class1_Sub3_Sub9.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat95 = Class1_Sub3_Sub9.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat92 = -this.aFloat95;
		this.aFloat98 = this.aFloat93 = this.aFloat89 = this.aFloat97 = this.aFloat94 = this.aFloat91 = this.aFloat96 = 0.0F;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)[F")
	public float[] method4325() {
		Static233.aFloatArray45[4] = this.aFloat98;
		Static233.aFloatArray45[10] = this.aFloat99;
		Static233.aFloatArray45[1] = this.aFloat89;
		Static233.aFloatArray45[6] = this.aFloat91;
		Static233.aFloatArray45[13] = 0.0F;
		Static233.aFloatArray45[8] = this.aFloat95;
		Static233.aFloatArray45[14] = 0.0F;
		Static233.aFloatArray45[12] = 0.0F;
		Static233.aFloatArray45[9] = this.aFloat97;
		Static233.aFloatArray45[2] = this.aFloat92;
		Static233.aFloatArray45[5] = this.aFloat90;
		Static233.aFloatArray45[0] = this.aFloat100;
		return Static233.aFloatArray45;
	}

	@OriginalMember(owner = "client!kc", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat99 = 1.0F;
		this.aFloat100 = this.aFloat90 = Class1_Sub3_Sub9.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat89 = Class1_Sub3_Sub9.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat95 = this.aFloat93 = this.aFloat97 = this.aFloat94 = this.aFloat92 = this.aFloat91 = this.aFloat96 = 0.0F;
		this.aFloat98 = -this.aFloat89;
	}

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class1_Sub3_Sub9.aFloatArray22[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub3_Sub9.aFloatArray23[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class1_Sub3_Sub9.aFloatArray22[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class1_Sub3_Sub9.aFloatArray23[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class1_Sub3_Sub9.aFloatArray22[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class1_Sub3_Sub9.aFloatArray23[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat90 = local33 * local9;
		this.aFloat97 = local39 * local27 + local43 * local21;
		this.aFloat99 = local21 * local9;
		this.aFloat91 = -local15;
		this.aFloat95 = local21 * local47 + local33 * -local27;
		this.aFloat100 = local33 * local21 + local47 * local27;
		this.aFloat98 = local39 * local9;
		this.aFloat92 = local27 * local9;
		this.aFloat89 = local27 * local43 + local39 * -local21;
		this.aFloat96 = -(this.aFloat91 * (float) arg1) + (float) -arg0 * this.aFloat92 - this.aFloat99 * (float) arg2;
		this.aFloat93 = -((float) arg2 * this.aFloat95) - (float) arg1 * this.aFloat98 + (float) -arg0 * this.aFloat100;
		this.aFloat94 = -(this.aFloat97 * (float) arg2) + (float) -arg0 * this.aFloat89 - (float) arg1 * this.aFloat90;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!m;I)V")
	public void method4328(@OriginalArg(0) Class128 arg0) {
		@Pc(6) Class128_Sub2 local6 = (Class128_Sub2) arg0;
		this.aFloat95 = local6.aFloat92;
		this.aFloat98 = local6.aFloat89;
		this.aFloat100 = local6.aFloat100;
		this.aFloat97 = local6.aFloat91;
		this.aFloat89 = local6.aFloat98;
		this.aFloat92 = local6.aFloat95;
		this.aFloat90 = local6.aFloat90;
		this.aFloat91 = local6.aFloat97;
		this.aFloat99 = local6.aFloat99;
		this.aFloat93 = -(local6.aFloat96 * this.aFloat95 + local6.aFloat94 * this.aFloat98 + local6.aFloat93 * this.aFloat100);
		this.aFloat94 = -(this.aFloat89 * local6.aFloat93 + local6.aFloat94 * this.aFloat90 + local6.aFloat96 * this.aFloat97);
		this.aFloat96 = -(local6.aFloat96 * this.aFloat99 + this.aFloat91 * local6.aFloat94 + this.aFloat92 * local6.aFloat93);
	}

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub3_Sub9.aFloatArray22[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub3_Sub9.aFloatArray23[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat89;
		@Pc(21) float local21 = this.aFloat90;
		@Pc(24) float local24 = this.aFloat97;
		this.aFloat89 = local18 * local9 - local15 * this.aFloat92;
		@Pc(38) float local38 = this.aFloat94;
		this.aFloat92 = local15 * local18 + this.aFloat92 * local9;
		this.aFloat90 = local21 * local9 - this.aFloat91 * local15;
		this.aFloat91 = this.aFloat91 * local9 + local21 * local15;
		this.aFloat97 = local9 * local24 - this.aFloat99 * local15;
		this.aFloat94 = local38 * local9 - this.aFloat96 * local15;
		this.aFloat99 = local15 * local24 + local9 * this.aFloat99;
		this.aFloat96 = local38 * local15 + local9 * this.aFloat96;
	}

	@OriginalMember(owner = "client!kc", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub3_Sub9.aFloatArray22[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub3_Sub9.aFloatArray23[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat100;
		@Pc(21) float local21 = this.aFloat98;
		@Pc(24) float local24 = this.aFloat95;
		this.aFloat100 = this.aFloat92 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat93;
		this.aFloat92 = this.aFloat92 * local9 - local15 * local18;
		this.aFloat98 = local15 * this.aFloat91 + local9 * local21;
		this.aFloat95 = local15 * this.aFloat99 + local24 * local9;
		this.aFloat91 = local9 * this.aFloat91 - local21 * local15;
		this.aFloat93 = local37 * local9 + local15 * this.aFloat96;
		this.aFloat99 = local9 * this.aFloat99 - local24 * local15;
		this.aFloat96 = local9 * this.aFloat96 - local37 * local15;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)[F")
	public float[] method4329() {
		Static233.aFloatArray45[10] = this.aFloat99;
		Static233.aFloatArray45[0] = this.aFloat100;
		Static233.aFloatArray45[8] = this.aFloat95;
		Static233.aFloatArray45[2] = this.aFloat92;
		Static233.aFloatArray45[5] = this.aFloat90;
		Static233.aFloatArray45[4] = this.aFloat98;
		Static233.aFloatArray45[1] = this.aFloat89;
		Static233.aFloatArray45[13] = this.aFloat94;
		Static233.aFloatArray45[12] = this.aFloat93;
		Static233.aFloatArray45[14] = this.aFloat96;
		Static233.aFloatArray45[6] = this.aFloat91;
		Static233.aFloatArray45[9] = this.aFloat97;
		return Static233.aFloatArray45;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class128 method6887() {
		@Pc(7) Class128_Sub2 local7 = new Class128_Sub2();
		local7.aFloat89 = this.aFloat89;
		local7.aFloat100 = this.aFloat100;
		local7.aFloat99 = this.aFloat99;
		local7.aFloat98 = this.aFloat98;
		local7.aFloat93 = this.aFloat93;
		local7.aFloat91 = this.aFloat91;
		local7.aFloat96 = this.aFloat96;
		local7.aFloat92 = this.aFloat92;
		local7.aFloat95 = this.aFloat95;
		local7.aFloat94 = this.aFloat94;
		local7.aFloat90 = this.aFloat90;
		local7.aFloat97 = this.aFloat97;
		return local7;
	}

	@OriginalMember(owner = "client!kc", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class128 arg0) {
		@Pc(6) Class128_Sub2 local6 = (Class128_Sub2) arg0;
		this.aFloat90 = local6.aFloat90;
		this.aFloat89 = local6.aFloat89;
		this.aFloat91 = local6.aFloat91;
		this.aFloat96 = local6.aFloat96;
		this.aFloat99 = local6.aFloat99;
		this.aFloat92 = local6.aFloat92;
		this.aFloat98 = local6.aFloat98;
		this.aFloat100 = local6.aFloat100;
		this.aFloat93 = local6.aFloat93;
		this.aFloat94 = local6.aFloat94;
		this.aFloat97 = local6.aFloat97;
		this.aFloat95 = local6.aFloat95;
	}
}
