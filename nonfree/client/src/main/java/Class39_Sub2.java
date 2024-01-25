import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!ot", name = "F", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!ot", name = "I", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!ot", name = "M", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!ot", name = "R", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!ot", name = "V", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!ot", name = "W", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	public Class39_Sub2() {
		this.method7246();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method7236(@OriginalArg(0) Class39 arg0) {
		@Pc(6) Class39_Sub2 local6 = (Class39_Sub2) arg0;
		this.aFloat167 = local6.aFloat167;
		this.aFloat177 = local6.aFloat177;
		this.aFloat178 = local6.aFloat178;
		this.aFloat168 = local6.aFloat168;
		this.aFloat173 = local6.aFloat173;
		this.aFloat170 = local6.aFloat170;
		this.aFloat175 = local6.aFloat175;
		this.aFloat172 = local6.aFloat172;
		this.aFloat171 = local6.aFloat171;
		this.aFloat176 = local6.aFloat176;
		this.aFloat169 = local6.aFloat169;
		this.aFloat174 = local6.aFloat174;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "()Lclient!sk;")
	@Override
	public Class39 method7248() {
		@Pc(7) Class39_Sub2 local7 = new Class39_Sub2();
		local7.aFloat177 = this.aFloat177;
		local7.aFloat169 = this.aFloat169;
		local7.aFloat168 = this.aFloat168;
		local7.aFloat178 = this.aFloat178;
		local7.aFloat171 = this.aFloat171;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat170 = this.aFloat170;
		local7.aFloat173 = this.aFloat173;
		local7.aFloat176 = this.aFloat176;
		local7.aFloat175 = this.aFloat175;
		local7.aFloat174 = this.aFloat174;
		local7.aFloat172 = this.aFloat172;
		return local7;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	@Override
	public void method7237(@OriginalArg(0) int arg0) {
		this.aFloat167 = 1.0F;
		this.aFloat177 = this.aFloat176 = Class216.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat171 = Class216.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat168 = this.aFloat173 = this.aFloat175 = this.aFloat169 = this.aFloat178 = this.aFloat172 = this.aFloat174 = 0.0F;
		this.aFloat170 = -this.aFloat171;
	}

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "(I)V")
	@Override
	public void method7252(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class216.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class216.aFloatArray55[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat167;
		@Pc(21) float local21 = this.aFloat168;
		@Pc(24) float local24 = this.aFloat173;
		this.aFloat167 = local9 * local18 - this.aFloat169 * local15;
		@Pc(37) float local37 = this.aFloat175;
		this.aFloat168 = local21 * local9 - local15 * this.aFloat177;
		this.aFloat169 = local15 * local18 + this.aFloat169 * local9;
		this.aFloat173 = local24 * local9 - this.aFloat170 * local15;
		this.aFloat177 = local21 * local15 + local9 * this.aFloat177;
		this.aFloat175 = local9 * local37 - this.aFloat178 * local15;
		this.aFloat170 = local15 * local24 + local9 * this.aFloat170;
		this.aFloat178 = local37 * local15 + local9 * this.aFloat178;
	}

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "(I)V")
	@Override
	public void method7255(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class216.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class216.aFloatArray55[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat169;
		@Pc(21) float local21 = this.aFloat177;
		@Pc(24) float local24 = this.aFloat170;
		this.aFloat169 = local18 * local9 - local15 * this.aFloat172;
		@Pc(38) float local38 = this.aFloat178;
		this.aFloat172 = local15 * local18 + this.aFloat172 * local9;
		this.aFloat177 = local21 * local9 - local15 * this.aFloat171;
		this.aFloat171 = local21 * local15 + this.aFloat171 * local9;
		this.aFloat170 = local9 * local24 - this.aFloat176 * local15;
		this.aFloat178 = local38 * local9 - this.aFloat174 * local15;
		this.aFloat176 = local9 * this.aFloat176 + local24 * local15;
		this.aFloat174 = local9 * this.aFloat174 + local15 * local38;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat170 + this.aFloat169 * (float) arg0 + this.aFloat177 * (float) arg1);
		arg3[2] = (int) ((float) arg2 * this.aFloat176 + this.aFloat172 * (float) arg0 + (float) arg1 * this.aFloat171);
		arg3[0] = (int) (this.aFloat168 * (float) arg1 + this.aFloat167 * (float) arg0 + (float) arg2 * this.aFloat173);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(III)V")
	@Override
	public void method7244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat178 += arg1;
		this.aFloat175 += arg0;
		this.aFloat174 += arg2;
	}

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "(I)V")
	public void method6547() {
		this.aFloat176 = -this.aFloat176;
		this.aFloat172 = -this.aFloat172;
		this.aFloat177 = -this.aFloat177;
		this.aFloat169 = -this.aFloat169;
		this.aFloat174 = -this.aFloat174;
		this.aFloat178 = -this.aFloat178;
		this.aFloat171 = -this.aFloat171;
		this.aFloat170 = -this.aFloat170;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([FFFIFF)V")
	public void method6548(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg0[0] = arg3 * this.aFloat173 + this.aFloat167 * arg1 + arg4 * this.aFloat168;
		arg0[2] = arg1 * this.aFloat172 + arg4 * this.aFloat171 + arg3 * this.aFloat176;
		@Pc(92) float local92;
		@Pc(76) float local76;
		@Pc(84) float local84;
		@Pc(68) float local68;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local68 = -arg2 / arg1;
			local76 = local68 * this.aFloat169 + this.aFloat178;
			local84 = this.aFloat172 * local68 + this.aFloat174;
			local92 = this.aFloat175 + this.aFloat167 * local68;
		} else if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local68 = -arg2 / arg4;
			local76 = this.aFloat178 + local68 * this.aFloat177;
			local84 = this.aFloat174 + local68 * this.aFloat171;
			local92 = this.aFloat175 + local68 * this.aFloat168;
		} else {
			local68 = -arg2 / arg3;
			local84 = this.aFloat174 + this.aFloat176 * local68;
			local92 = local68 * this.aFloat173 + this.aFloat175;
			local76 = this.aFloat178 + local68 * this.aFloat170;
		}
		arg0[1] = this.aFloat170 * arg3 + arg4 * this.aFloat177 + arg1 * this.aFloat169;
		arg0[3] = -(local92 * arg0[0] + arg0[1] * local76 + local84 * arg0[2]);
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg0 * this.aFloat169 + (float) arg1 * this.aFloat177 + this.aFloat170 * (float) arg2 + this.aFloat178);
		arg3[2] = (int) ((float) arg0 * this.aFloat172 + (float) arg1 * this.aFloat171 + (float) arg2 * this.aFloat176 + this.aFloat174);
		arg3[0] = (int) (this.aFloat175 + (float) arg1 * this.aFloat168 + this.aFloat167 * (float) arg0 + (float) arg2 * this.aFloat173);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)V")
	@Override
	public void method7240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat174 = arg2;
		this.aFloat169 = this.aFloat172 = this.aFloat168 = this.aFloat171 = this.aFloat173 = this.aFloat170 = 0.0F;
		this.aFloat167 = this.aFloat177 = this.aFloat176 = 1.0F;
		this.aFloat178 = arg1;
		this.aFloat175 = arg0;
	}

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "(I)[F")
	public float[] method6549() {
		Static112.aFloatArray23[8] = this.aFloat173;
		Static112.aFloatArray23[5] = this.aFloat177;
		Static112.aFloatArray23[0] = this.aFloat167;
		Static112.aFloatArray23[6] = this.aFloat171;
		Static112.aFloatArray23[14] = 0.0F;
		Static112.aFloatArray23[12] = 0.0F;
		Static112.aFloatArray23[1] = this.aFloat169;
		Static112.aFloatArray23[13] = 0.0F;
		Static112.aFloatArray23[9] = this.aFloat170;
		Static112.aFloatArray23[4] = this.aFloat168;
		Static112.aFloatArray23[2] = this.aFloat172;
		Static112.aFloatArray23[10] = this.aFloat176;
		return Static112.aFloatArray23;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([I)V")
	@Override
	public void method7241(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat175;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat178;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat174;
		arg0[0] = (int) (local21 * this.aFloat169 + this.aFloat167 * local12 + local29 * this.aFloat172);
		arg0[1] = (int) (local21 * this.aFloat177 + this.aFloat168 * local12 + local29 * this.aFloat171);
		arg0[2] = (int) (this.aFloat176 * local29 + this.aFloat170 * local21 + this.aFloat173 * local12);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIFBFFI)V")
	public void method6552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg1 == 0) {
			this.aFloat176 = 1.0F;
			this.aFloat169 = this.aFloat172 = this.aFloat168 = this.aFloat171 = this.aFloat173 = this.aFloat170 = 0.0F;
			this.aFloat177 = arg5;
			this.aFloat167 = arg0;
		} else {
			@Pc(14) float local14 = Class216.aFloatArray56[arg1 & 0x3FFF];
			@Pc(20) float local20 = Class216.aFloatArray55[arg1 & 0x3FFF];
			this.aFloat177 = (float) arg5 * local14;
			this.aFloat168 = -local20 * (float) arg5;
			this.aFloat176 = 1.0F;
			this.aFloat169 = local20 * (float) arg0;
			this.aFloat167 = (float) arg0 * local14;
			this.aFloat172 = this.aFloat171 = this.aFloat173 = this.aFloat170 = 0.0F;
		}
		this.aFloat178 = arg4;
		this.aFloat174 = arg3;
		this.aFloat175 = arg2;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class216.aFloatArray56[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class216.aFloatArray55[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class216.aFloatArray56[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class216.aFloatArray55[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class216.aFloatArray56[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class216.aFloatArray55[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat169 = local43 * local27 + local39 * -local21;
		this.aFloat171 = -local15;
		this.aFloat168 = local9 * local39;
		this.aFloat173 = local33 * -local27 + local47 * local21;
		this.aFloat170 = local39 * local27 + local21 * local43;
		this.aFloat176 = local21 * local9;
		this.aFloat167 = local27 * local47 + local33 * local21;
		this.aFloat177 = local33 * local9;
		this.aFloat172 = local9 * local27;
		this.aFloat174 = -(this.aFloat171 * (float) arg1) + this.aFloat172 * (float) -arg0 - (float) arg2 * this.aFloat176;
		this.aFloat178 = -((float) arg2 * this.aFloat170) + (float) -arg0 * this.aFloat169 - (float) arg1 * this.aFloat177;
		this.aFloat175 = -(this.aFloat173 * (float) arg2) - this.aFloat168 * (float) arg1 + (float) -arg0 * this.aFloat167;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!sk;I)V")
	public void method6553(@OriginalArg(0) Class39 arg0) {
		@Pc(6) Class39_Sub2 local6 = (Class39_Sub2) arg0;
		this.aFloat173 = local6.aFloat172;
		this.aFloat167 = local6.aFloat167;
		this.aFloat168 = local6.aFloat169;
		this.aFloat169 = local6.aFloat168;
		this.aFloat177 = local6.aFloat177;
		this.aFloat170 = local6.aFloat171;
		this.aFloat172 = local6.aFloat173;
		this.aFloat176 = local6.aFloat176;
		this.aFloat175 = -(this.aFloat173 * local6.aFloat174 + this.aFloat168 * local6.aFloat178 + this.aFloat167 * local6.aFloat175);
		this.aFloat171 = local6.aFloat170;
		this.aFloat178 = -(this.aFloat170 * local6.aFloat174 + this.aFloat177 * local6.aFloat178 + local6.aFloat175 * this.aFloat169);
		this.aFloat174 = -(this.aFloat172 * local6.aFloat175 + local6.aFloat178 * this.aFloat171 + this.aFloat176 * local6.aFloat174);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat178);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat175);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat174);
		arg3[1] = (int) ((float) local24 * this.aFloat171 + this.aFloat168 * (float) local17 + (float) local6 * this.aFloat177);
		arg3[0] = (int) ((float) local24 * this.aFloat172 + (float) local6 * this.aFloat169 + this.aFloat167 * (float) local17);
		arg3[2] = (int) (this.aFloat173 * (float) local17 + this.aFloat170 * (float) local6 + this.aFloat176 * (float) local24);
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(Z)[F")
	public float[] method6554() {
		Static112.aFloatArray23[13] = this.aFloat178;
		Static112.aFloatArray23[14] = this.aFloat174;
		Static112.aFloatArray23[4] = this.aFloat168;
		Static112.aFloatArray23[6] = this.aFloat171;
		Static112.aFloatArray23[0] = this.aFloat167;
		Static112.aFloatArray23[8] = this.aFloat173;
		Static112.aFloatArray23[12] = this.aFloat175;
		Static112.aFloatArray23[1] = this.aFloat169;
		Static112.aFloatArray23[2] = this.aFloat172;
		Static112.aFloatArray23[10] = this.aFloat176;
		Static112.aFloatArray23[5] = this.aFloat177;
		Static112.aFloatArray23[9] = this.aFloat170;
		return Static112.aFloatArray23;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)V")
	@Override
	public void method7239(@OriginalArg(0) int arg0) {
		this.aFloat177 = 1.0F;
		this.aFloat167 = this.aFloat176 = Class216.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat173 = Class216.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat168 = this.aFloat175 = this.aFloat169 = this.aFloat170 = this.aFloat178 = this.aFloat171 = this.aFloat174 = 0.0F;
		this.aFloat172 = -this.aFloat173;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "()V")
	@Override
	public void method7246() {
		this.aFloat167 = this.aFloat177 = this.aFloat176 = 1.0F;
		this.aFloat169 = this.aFloat172 = this.aFloat168 = this.aFloat171 = this.aFloat173 = this.aFloat170 = this.aFloat175 = this.aFloat178 = this.aFloat174 = 0.0F;
	}

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "(I)V")
	@Override
	public void method7253(@OriginalArg(0) int arg0) {
		this.aFloat176 = 1.0F;
		this.aFloat167 = this.aFloat177 = Class216.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat169 = Class216.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat168 = -this.aFloat169;
		this.aFloat173 = this.aFloat175 = this.aFloat170 = this.aFloat178 = this.aFloat172 = this.aFloat171 = this.aFloat174 = 0.0F;
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(I)V")
	@Override
	public void method7247(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class216.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class216.aFloatArray55[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat167;
		@Pc(21) float local21 = this.aFloat168;
		@Pc(24) float local24 = this.aFloat173;
		this.aFloat167 = local18 * local9 + local15 * this.aFloat172;
		@Pc(37) float local37 = this.aFloat175;
		this.aFloat172 = this.aFloat172 * local9 - local15 * local18;
		this.aFloat168 = local15 * this.aFloat171 + local9 * local21;
		this.aFloat173 = this.aFloat176 * local15 + local9 * local24;
		this.aFloat171 = local9 * this.aFloat171 - local21 * local15;
		this.aFloat176 = local9 * this.aFloat176 - local24 * local15;
		this.aFloat175 = local15 * this.aFloat174 + local9 * local37;
		this.aFloat174 = local9 * this.aFloat174 - local37 * local15;
	}
}
