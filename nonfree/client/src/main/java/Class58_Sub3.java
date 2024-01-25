import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class58_Sub3 extends Class58 {

	@OriginalMember(owner = "client!wp", name = "K", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "F")
	public float aFloat201;

	@OriginalMember(owner = "client!wp", name = "Q", descriptor = "F")
	public float aFloat202;

	@OriginalMember(owner = "client!wp", name = "R", descriptor = "F")
	public float aFloat203;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "F")
	public float aFloat204;

	@OriginalMember(owner = "client!wp", name = "F", descriptor = "F")
	public float aFloat205;

	@OriginalMember(owner = "client!wp", name = "G", descriptor = "F")
	public float aFloat206;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "F")
	public float aFloat207;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "F")
	public float aFloat208;

	@OriginalMember(owner = "client!wp", name = "w", descriptor = "F")
	public float aFloat209;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class58_Sub3() {
		this.method9508();
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9522() {
		@Pc(7) Class58_Sub3 local7 = new Class58_Sub3();
		local7.aFloat202 = this.aFloat202;
		local7.aFloat198 = this.aFloat198;
		local7.aFloat199 = this.aFloat199;
		local7.aFloat208 = this.aFloat208;
		local7.aFloat203 = this.aFloat203;
		local7.aFloat200 = this.aFloat200;
		local7.aFloat209 = this.aFloat209;
		local7.aFloat207 = this.aFloat207;
		local7.aFloat201 = this.aFloat201;
		local7.aFloat204 = this.aFloat204;
		local7.aFloat206 = this.aFloat206;
		local7.aFloat205 = this.aFloat205;
		return local7;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIFFFI)V")
	public void method9527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg0 == 0) {
			this.aFloat206 = this.aFloat204 = this.aFloat199 = this.aFloat207 = this.aFloat201 = this.aFloat203 = 0.0F;
			this.aFloat200 = 1.0F;
			this.aFloat198 = (float) arg5;
			this.aFloat202 = (float) arg1;
		} else {
			@Pc(41) float local41 = Class3_Sub7_Sub4.aFloatArray14[arg0 & 0x3FFF];
			@Pc(47) float local47 = Class3_Sub7_Sub4.aFloatArray13[arg0 & 0x3FFF];
			this.aFloat199 = (float) arg1 * -local47;
			this.aFloat202 = (float) arg1 * local41;
			this.aFloat200 = 1.0F;
			this.aFloat198 = local41 * (float) arg5;
			this.aFloat206 = (float) arg5 * local47;
			this.aFloat204 = this.aFloat207 = this.aFloat201 = this.aFloat203 = 0.0F;
		}
		this.aFloat205 = arg2;
		this.aFloat209 = arg4;
		this.aFloat208 = arg3;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(III[I)V")
	@Override
	public void method9512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat201 + this.aFloat199 * (float) arg1 + this.aFloat198 * (float) arg0);
		arg3[2] = (int) ((float) arg0 * this.aFloat204 + this.aFloat207 * (float) arg1 + this.aFloat200 * (float) arg2);
		arg3[1] = (int) (this.aFloat203 * (float) arg2 + this.aFloat206 * (float) arg0 + this.aFloat202 * (float) arg1);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZF[FFFF)V")
	public void method9528(@OriginalArg(1) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(56) float local56;
		@Pc(40) float local40;
		@Pc(48) float local48;
		@Pc(32) float local32;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local32 = -arg0 / arg2;
			local56 = local32 * this.aFloat198 + this.aFloat209;
			local48 = local32 * this.aFloat204 + this.aFloat205;
			local40 = this.aFloat206 * local32 + this.aFloat208;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local32 = -arg0 / arg3;
			local40 = this.aFloat208 + local32 * this.aFloat202;
			local48 = this.aFloat205 + this.aFloat207 * local32;
			local56 = local32 * this.aFloat199 + this.aFloat209;
		} else {
			local32 = -arg0 / arg4;
			local40 = this.aFloat208 + local32 * this.aFloat203;
			local48 = this.aFloat205 + this.aFloat200 * local32;
			local56 = this.aFloat209 + this.aFloat201 * local32;
		}
		arg1[2] = this.aFloat204 * arg2 + arg3 * this.aFloat207 + arg4 * this.aFloat200;
		arg1[0] = arg2 * this.aFloat198 + this.aFloat199 * arg3 + this.aFloat201 * arg4;
		arg1[1] = arg4 * this.aFloat203 + arg3 * this.aFloat202 + this.aFloat206 * arg2;
		arg1[3] = -(arg1[1] * local40 + arg1[0] * local56 + arg1[2] * local48);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!cl;)V")
	@Override
	public void method9516(@OriginalArg(0) Class58 arg0) {
		@Pc(6) Class58_Sub3 local6 = (Class58_Sub3) arg0;
		this.aFloat204 = local6.aFloat204;
		this.aFloat208 = local6.aFloat208;
		this.aFloat207 = local6.aFloat207;
		this.aFloat206 = local6.aFloat206;
		this.aFloat203 = local6.aFloat203;
		this.aFloat201 = local6.aFloat201;
		this.aFloat199 = local6.aFloat199;
		this.aFloat205 = local6.aFloat205;
		this.aFloat198 = local6.aFloat198;
		this.aFloat200 = local6.aFloat200;
		this.aFloat209 = local6.aFloat209;
		this.aFloat202 = local6.aFloat202;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class3_Sub7_Sub4.aFloatArray14[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub7_Sub4.aFloatArray13[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class3_Sub7_Sub4.aFloatArray14[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class3_Sub7_Sub4.aFloatArray13[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class3_Sub7_Sub4.aFloatArray14[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class3_Sub7_Sub4.aFloatArray13[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat199 = local39 * local9;
		this.aFloat203 = local39 * local27 + local21 * local43;
		this.aFloat200 = local9 * local21;
		this.aFloat198 = local33 * local21 + local47 * local27;
		this.aFloat207 = -local15;
		this.aFloat201 = local21 * local47 + local33 * -local27;
		this.aFloat204 = local27 * local9;
		this.aFloat202 = local33 * local9;
		this.aFloat206 = -local21 * local39 + local27 * local43;
		this.aFloat208 = -((float) arg1 * this.aFloat202) + this.aFloat206 * (float) -arg0 - (float) arg2 * this.aFloat203;
		this.aFloat209 = -((float) arg1 * this.aFloat199) + this.aFloat198 * (float) -arg0 - this.aFloat201 * (float) arg2;
		this.aFloat205 = -((float) arg2 * this.aFloat200) + (float) -arg0 * this.aFloat204 - this.aFloat207 * (float) arg1;
	}

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)V")
	@Override
	public void method9525(@OriginalArg(0) int arg0) {
		this.aFloat202 = 1.0F;
		this.aFloat198 = this.aFloat200 = Class3_Sub7_Sub4.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat201 = Class3_Sub7_Sub4.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat199 = this.aFloat209 = this.aFloat206 = this.aFloat203 = this.aFloat208 = this.aFloat207 = this.aFloat205 = 0.0F;
		this.aFloat204 = -this.aFloat201;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	@Override
	public void method9517(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub7_Sub4.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub7_Sub4.aFloatArray13[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat198;
		@Pc(21) float local21 = this.aFloat199;
		@Pc(24) float local24 = this.aFloat201;
		@Pc(27) float local27 = this.aFloat209;
		this.aFloat198 = local9 * local18 - local15 * this.aFloat206;
		this.aFloat199 = local9 * local21 - local15 * this.aFloat202;
		this.aFloat206 = local9 * this.aFloat206 + local15 * local18;
		this.aFloat202 = local9 * this.aFloat202 + local15 * local21;
		this.aFloat201 = local9 * local24 - this.aFloat203 * local15;
		this.aFloat203 = local9 * this.aFloat203 + local24 * local15;
		this.aFloat209 = local27 * local9 - this.aFloat208 * local15;
		this.aFloat208 = local15 * local27 + local9 * this.aFloat208;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([I)V")
	@Override
	public void method9507(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat209;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat208;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat205;
		arg0[0] = (int) (local11 * this.aFloat198 + this.aFloat206 * local20 + this.aFloat204 * local29);
		arg0[1] = (int) (this.aFloat199 * local11 + local20 * this.aFloat202 + this.aFloat207 * local29);
		arg0[2] = (int) (this.aFloat200 * local29 + local11 * this.aFloat201 + local20 * this.aFloat203);
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)V")
	@Override
	public void method9510(@OriginalArg(0) int arg0) {
		this.aFloat198 = 1.0F;
		this.aFloat202 = this.aFloat200 = Class3_Sub7_Sub4.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat207 = Class3_Sub7_Sub4.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat199 = this.aFloat201 = this.aFloat209 = this.aFloat206 = this.aFloat208 = this.aFloat204 = this.aFloat205 = 0.0F;
		this.aFloat203 = -this.aFloat207;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLclient!cl;)V")
	public void method9529(@OriginalArg(1) Class58 arg0) {
		@Pc(16) Class58_Sub3 local16 = (Class58_Sub3) arg0;
		this.aFloat199 = local16.aFloat206;
		this.aFloat201 = local16.aFloat204;
		this.aFloat198 = local16.aFloat198;
		this.aFloat203 = local16.aFloat207;
		this.aFloat202 = local16.aFloat202;
		this.aFloat206 = local16.aFloat199;
		this.aFloat204 = local16.aFloat201;
		this.aFloat207 = local16.aFloat203;
		this.aFloat200 = local16.aFloat200;
		this.aFloat209 = -(local16.aFloat205 * this.aFloat201 + this.aFloat199 * local16.aFloat208 + this.aFloat198 * local16.aFloat209);
		this.aFloat208 = -(local16.aFloat209 * this.aFloat206 + local16.aFloat208 * this.aFloat202 + local16.aFloat205 * this.aFloat203);
		this.aFloat205 = -(local16.aFloat205 * this.aFloat200 + local16.aFloat209 * this.aFloat204 + this.aFloat207 * local16.aFloat208);
	}

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "(I)V")
	@Override
	public void method9521(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub7_Sub4.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub7_Sub4.aFloatArray13[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat198;
		@Pc(21) float local21 = this.aFloat199;
		@Pc(24) float local24 = this.aFloat201;
		@Pc(27) float local27 = this.aFloat209;
		this.aFloat198 = this.aFloat204 * local15 + local9 * local18;
		this.aFloat204 = local9 * this.aFloat204 - local15 * local18;
		this.aFloat199 = local15 * this.aFloat207 + local21 * local9;
		this.aFloat201 = local9 * local24 + this.aFloat200 * local15;
		this.aFloat207 = local9 * this.aFloat207 - local15 * local21;
		this.aFloat209 = local15 * this.aFloat205 + local27 * local9;
		this.aFloat200 = local9 * this.aFloat200 - local24 * local15;
		this.aFloat205 = this.aFloat205 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(III)V")
	@Override
	public void method9509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat208 += (float) arg1;
		this.aFloat205 += (float) arg2;
		this.aFloat209 += (float) arg0;
	}

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "(I)V")
	public void method9531() {
		this.aFloat204 = -this.aFloat204;
		this.aFloat205 = -this.aFloat205;
		this.aFloat206 = -this.aFloat206;
		this.aFloat207 = -this.aFloat207;
		this.aFloat203 = -this.aFloat203;
		this.aFloat202 = -this.aFloat202;
		this.aFloat208 = -this.aFloat208;
		this.aFloat200 = -this.aFloat200;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)V")
	@Override
	public void method9524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat209 = (float) arg0;
		this.aFloat198 = this.aFloat202 = this.aFloat200 = 1.0F;
		this.aFloat205 = (float) arg2;
		this.aFloat206 = this.aFloat204 = this.aFloat199 = this.aFloat207 = this.aFloat201 = this.aFloat203 = 0.0F;
		this.aFloat208 = (float) arg1;
	}

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "(I)[F")
	public float[] method9532() {
		Static333.aFloatArray40[13] = 0.0F;
		Static333.aFloatArray40[12] = 0.0F;
		Static333.aFloatArray40[0] = this.aFloat198;
		Static333.aFloatArray40[14] = 0.0F;
		Static333.aFloatArray40[6] = this.aFloat207;
		Static333.aFloatArray40[5] = this.aFloat202;
		Static333.aFloatArray40[1] = this.aFloat206;
		Static333.aFloatArray40[10] = this.aFloat200;
		Static333.aFloatArray40[4] = this.aFloat199;
		Static333.aFloatArray40[8] = this.aFloat201;
		Static333.aFloatArray40[9] = this.aFloat203;
		Static333.aFloatArray40[2] = this.aFloat204;
		return Static333.aFloatArray40;
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(III[I)V")
	@Override
	public void method9511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat209);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat205);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat208);
		arg3[1] = (int) (this.aFloat207 * (float) local17 + this.aFloat202 * (float) local24 + this.aFloat199 * (float) local6);
		arg3[2] = (int) ((float) local17 * this.aFloat200 + (float) local24 * this.aFloat203 + this.aFloat201 * (float) local6);
		arg3[0] = (int) ((float) local17 * this.aFloat204 + (float) local6 * this.aFloat198 + this.aFloat206 * (float) local24);
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V")
	@Override
	public void method9518(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub7_Sub4.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub7_Sub4.aFloatArray13[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat206;
		@Pc(21) float local21 = this.aFloat202;
		@Pc(24) float local24 = this.aFloat203;
		@Pc(27) float local27 = this.aFloat208;
		this.aFloat206 = local9 * local18 - local15 * this.aFloat204;
		this.aFloat204 = local18 * local15 + local9 * this.aFloat204;
		this.aFloat202 = local9 * local21 - local15 * this.aFloat207;
		this.aFloat203 = local9 * local24 - local15 * this.aFloat200;
		this.aFloat207 = local15 * local21 + this.aFloat207 * local9;
		this.aFloat208 = local27 * local9 - this.aFloat205 * local15;
		this.aFloat200 = local9 * this.aFloat200 + local24 * local15;
		this.aFloat205 = local9 * this.aFloat205 + local27 * local15;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
	@Override
	public void method9513(@OriginalArg(0) int arg0) {
		this.aFloat200 = 1.0F;
		this.aFloat198 = this.aFloat202 = Class3_Sub7_Sub4.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat206 = Class3_Sub7_Sub4.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat201 = this.aFloat209 = this.aFloat203 = this.aFloat208 = this.aFloat204 = this.aFloat207 = this.aFloat205 = 0.0F;
		this.aFloat199 = -this.aFloat206;
	}

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)[F")
	public float[] method9533() {
		Static333.aFloatArray40[14] = this.aFloat205;
		Static333.aFloatArray40[8] = this.aFloat201;
		Static333.aFloatArray40[1] = this.aFloat206;
		Static333.aFloatArray40[9] = this.aFloat203;
		Static333.aFloatArray40[6] = this.aFloat207;
		Static333.aFloatArray40[4] = this.aFloat199;
		Static333.aFloatArray40[5] = this.aFloat202;
		Static333.aFloatArray40[10] = this.aFloat200;
		Static333.aFloatArray40[13] = this.aFloat208;
		Static333.aFloatArray40[0] = this.aFloat198;
		Static333.aFloatArray40[2] = this.aFloat204;
		Static333.aFloatArray40[12] = this.aFloat209;
		return Static333.aFloatArray40;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III[I)V")
	@Override
	public void method9519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat204 + (float) arg1 * this.aFloat207 + this.aFloat200 * (float) arg2 + this.aFloat205);
		arg3[0] = (int) ((float) arg2 * this.aFloat201 + (float) arg0 * this.aFloat198 + (float) arg1 * this.aFloat199 + this.aFloat209);
		arg3[1] = (int) (this.aFloat206 * (float) arg0 + this.aFloat202 * (float) arg1 + (float) arg2 * this.aFloat203 + this.aFloat208);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "()V")
	@Override
	public void method9508() {
		this.aFloat206 = this.aFloat204 = this.aFloat199 = this.aFloat207 = this.aFloat201 = this.aFloat203 = this.aFloat209 = this.aFloat208 = this.aFloat205 = 0.0F;
		this.aFloat198 = this.aFloat202 = this.aFloat200 = 1.0F;
	}
}
