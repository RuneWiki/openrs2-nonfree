import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!sp", name = "E", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!sp", name = "H", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!sp", name = "J", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!sp", name = "M", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!sp", name = "O", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!sp", name = "Y", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!sp", name = "ab", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	public Class31_Sub2() {
		this.method7926();
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BFFF)V")
	public void method7657(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat167 *= arg2;
		this.aFloat175 *= arg1;
		this.aFloat171 *= arg1;
		this.aFloat178 *= arg2;
		this.aFloat169 *= arg2;
		this.aFloat177 *= arg1;
		this.aFloat174 *= arg1;
		this.aFloat170 *= arg2;
		this.aFloat173 *= arg0;
		this.aFloat176 *= arg0;
		this.aFloat172 *= arg0;
		this.aFloat168 *= arg0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IFFF)V")
	public void method7659(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat174 = this.aFloat167 = this.aFloat168 = (float) 1;
		this.aFloat170 = arg0;
		this.aFloat169 = this.aFloat173 = this.aFloat171 = this.aFloat176 = this.aFloat175 = this.aFloat178 = 0.0F;
		this.aFloat177 = arg1;
		this.aFloat172 = arg2;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[FFFF)V")
	public void method7660(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[1] = this.aFloat169 * arg3 + this.aFloat167 * arg1 + arg2 * this.aFloat178;
		arg0[0] = this.aFloat175 * arg2 + arg3 * this.aFloat174 + arg1 * this.aFloat171;
		arg0[2] = this.aFloat176 * arg1 + this.aFloat173 * arg3 + arg2 * this.aFloat168;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(FFFI)V")
	public void method7661(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat177 += arg1;
		this.aFloat170 += arg2;
		this.aFloat172 += arg0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B[F)[F")
	public float[] method7662(@OriginalArg(1) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		arg0[9] = this.aFloat176;
		arg0[5] = this.aFloat167;
		arg0[6] = this.aFloat178;
		arg0[10] = this.aFloat168;
		arg0[15] = 0.0F;
		arg0[4] = this.aFloat169;
		arg0[11] = 0.0F;
		arg0[1] = this.aFloat171;
		arg0[3] = 0.0F;
		arg0[14] = 0.0F;
		arg0[2] = this.aFloat175;
		arg0[0] = this.aFloat174;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat173;
		return arg0;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)V")
	@Override
	public void method7930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat172 += (float) arg2;
		this.aFloat177 += (float) arg0;
		this.aFloat170 += (float) arg1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0) {
		this.aFloat168 = 1.0F;
		this.aFloat174 = this.aFloat167 = Class77.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat169 = Class77.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat171 = -this.aFloat169;
		this.aFloat175 = this.aFloat177 = this.aFloat178 = this.aFloat170 = this.aFloat173 = this.aFloat176 = this.aFloat172 = 0.0F;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class77.aFloatArray7[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class77.aFloatArray8[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class77.aFloatArray7[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class77.aFloatArray8[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class77.aFloatArray7[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class77.aFloatArray8[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat173 = local27 * local9;
		this.aFloat174 = local47 * local27 + local21 * local33;
		this.aFloat171 = local39 * local9;
		this.aFloat167 = local9 * local33;
		this.aFloat178 = local21 * local43 + local27 * local39;
		this.aFloat176 = -local15;
		this.aFloat175 = local33 * -local27 + local47 * local21;
		this.aFloat169 = local43 * local27 + local39 * -local21;
		this.aFloat168 = local21 * local9;
		this.aFloat172 = -(this.aFloat168 * (float) arg2) + this.aFloat173 * (float) -arg0 - this.aFloat176 * (float) arg1;
		this.aFloat177 = (float) -arg0 * this.aFloat174 - this.aFloat171 * (float) arg1 - this.aFloat175 * (float) arg2;
		this.aFloat170 = -((float) arg2 * this.aFloat178) - (float) arg1 * this.aFloat167 + (float) -arg0 * this.aFloat169;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(FFIF)F")
	public float method7663(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg1 * this.aFloat169 + arg0 * this.aFloat167 + this.aFloat178 * arg2 + this.aFloat170;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ih;Z)V")
	public void method7664(@OriginalArg(0) Class31 arg0) {
		@Pc(6) Class31_Sub2 local6 = (Class31_Sub2) arg0;
		this.aFloat171 = local6.aFloat171;
		this.aFloat172 = 0.0F;
		this.aFloat175 = local6.aFloat175;
		this.aFloat176 = local6.aFloat176;
		this.aFloat169 = local6.aFloat169;
		this.aFloat167 = local6.aFloat167;
		this.aFloat174 = local6.aFloat174;
		this.aFloat168 = local6.aFloat168;
		this.aFloat170 = 0.0F;
		this.aFloat178 = local6.aFloat178;
		this.aFloat177 = 0.0F;
		this.aFloat173 = local6.aFloat173;
	}

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0) {
		this.aFloat174 = 1.0F;
		this.aFloat167 = this.aFloat168 = Class77.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat176 = Class77.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat178 = -this.aFloat176;
		this.aFloat171 = this.aFloat175 = this.aFloat177 = this.aFloat169 = this.aFloat170 = this.aFloat173 = this.aFloat172 = 0.0F;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IFFF[FF)V")
	public void method7665(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4) {
		arg3[0] = arg0 * this.aFloat171 + arg4 * this.aFloat174 + this.aFloat175 * arg1;
		@Pc(51) float local51;
		@Pc(59) float local59;
		@Pc(43) float local43;
		@Pc(35) float local35;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local35 = -arg2 / arg4;
			local43 = this.aFloat172 + this.aFloat173 * local35;
			local51 = local35 * this.aFloat174 + this.aFloat177;
			local59 = this.aFloat170 + this.aFloat169 * local35;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local35 = -arg2 / arg0;
			local43 = this.aFloat172 + local35 * this.aFloat176;
			local51 = this.aFloat171 * local35 + this.aFloat177;
			local59 = this.aFloat167 * local35 + this.aFloat170;
		} else {
			local35 = -arg2 / arg1;
			local51 = this.aFloat175 * local35 + this.aFloat177;
			local43 = this.aFloat172 + local35 * this.aFloat168;
			local59 = local35 * this.aFloat178 + this.aFloat170;
		}
		arg3[2] = arg4 * this.aFloat173 + this.aFloat176 * arg0 + this.aFloat168 * arg1;
		arg3[1] = arg1 * this.aFloat178 + arg0 * this.aFloat167 + this.aFloat169 * arg4;
		arg3[3] = -(arg3[0] * local51 + local59 * arg3[1] + local43 * arg3[2]);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public void method7934(@OriginalArg(0) Class31 arg0) {
		@Pc(6) Class31_Sub2 local6 = (Class31_Sub2) arg0;
		this.aFloat175 = local6.aFloat175;
		this.aFloat172 = local6.aFloat172;
		this.aFloat171 = local6.aFloat171;
		this.aFloat178 = local6.aFloat178;
		this.aFloat167 = local6.aFloat167;
		this.aFloat176 = local6.aFloat176;
		this.aFloat177 = local6.aFloat177;
		this.aFloat174 = local6.aFloat174;
		this.aFloat168 = local6.aFloat168;
		this.aFloat169 = local6.aFloat169;
		this.aFloat173 = local6.aFloat173;
		this.aFloat170 = local6.aFloat170;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method7931() {
		@Pc(7) Class31_Sub2 local7 = new Class31_Sub2();
		local7.aFloat169 = this.aFloat169;
		local7.aFloat177 = this.aFloat177;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat170 = this.aFloat170;
		local7.aFloat174 = this.aFloat174;
		local7.aFloat173 = this.aFloat173;
		local7.aFloat168 = this.aFloat168;
		local7.aFloat172 = this.aFloat172;
		local7.aFloat178 = this.aFloat178;
		local7.aFloat171 = this.aFloat171;
		local7.aFloat176 = this.aFloat176;
		local7.aFloat175 = this.aFloat175;
		return local7;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ih;I)V")
	public void method7666(@OriginalArg(0) Class31 arg0) {
		@Pc(6) Class31_Sub2 local6 = (Class31_Sub2) arg0;
		this.aFloat174 = local6.aFloat174;
		this.aFloat171 = local6.aFloat169;
		this.aFloat175 = local6.aFloat173;
		this.aFloat173 = local6.aFloat175;
		this.aFloat178 = local6.aFloat176;
		this.aFloat169 = local6.aFloat171;
		this.aFloat167 = local6.aFloat167;
		this.aFloat176 = local6.aFloat178;
		this.aFloat168 = local6.aFloat168;
		this.aFloat177 = -(local6.aFloat170 * this.aFloat171 + this.aFloat174 * local6.aFloat177 + local6.aFloat172 * this.aFloat175);
		this.aFloat170 = -(local6.aFloat177 * this.aFloat169 + local6.aFloat170 * this.aFloat167 + this.aFloat178 * local6.aFloat172);
		this.aFloat172 = -(local6.aFloat177 * this.aFloat173 + local6.aFloat170 * this.aFloat176 + this.aFloat168 * local6.aFloat172);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(FIFF)F")
	public float method7667(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat177 + arg1 * this.aFloat171 + arg0 * this.aFloat174 + this.aFloat175 * arg2;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z[F)[F")
	public float[] method7668(@OriginalArg(1) float[] arg0) {
		arg0[3] = 0.0F;
		arg0[0] = this.aFloat174;
		arg0[13] = 0.0F;
		arg0[2] = 0.0F;
		arg0[12] = 0.0F;
		arg0[5] = this.aFloat167;
		arg0[9] = this.aFloat170;
		arg0[10] = this.aFloat172;
		arg0[15] = 1.0F;
		arg0[14] = 0.0F;
		arg0[7] = 0.0F;
		arg0[1] = this.aFloat169;
		arg0[4] = this.aFloat171;
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat177;
		arg0[6] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V")
	public void method7669() {
		this.aFloat173 = -this.aFloat173;
		this.aFloat172 = -this.aFloat172;
		this.aFloat178 = -this.aFloat178;
		this.aFloat168 = -this.aFloat168;
		this.aFloat169 = -this.aFloat169;
		this.aFloat176 = -this.aFloat176;
		this.aFloat167 = -this.aFloat167;
		this.aFloat170 = -this.aFloat170;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)V")
	@Override
	public void method7921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat169 = this.aFloat173 = this.aFloat171 = this.aFloat176 = this.aFloat175 = this.aFloat178 = 0.0F;
		this.aFloat177 = (float) arg0;
		this.aFloat172 = (float) arg2;
		this.aFloat174 = this.aFloat167 = this.aFloat168 = 1.0F;
		this.aFloat170 = (float) arg1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IFFFFFFFFF)V")
	public void method7670(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat170 = 0.0F;
		this.aFloat168 = arg3;
		this.aFloat176 = arg2;
		this.aFloat167 = arg1;
		this.aFloat175 = arg7;
		this.aFloat178 = arg0;
		this.aFloat174 = arg5;
		this.aFloat172 = 0.0F;
		this.aFloat169 = arg6;
		this.aFloat173 = arg4;
		this.aFloat171 = arg8;
		this.aFloat177 = 0.0F;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(FFFB)F")
	public float method7671(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat172 + this.aFloat176 * arg2 + arg1 * this.aFloat173 + arg0 * this.aFloat168;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat172);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat177);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat170);
		arg3[2] = (int) (this.aFloat175 * (float) local13 + this.aFloat178 * (float) local24 + this.aFloat168 * (float) local6);
		arg3[1] = (int) (this.aFloat176 * (float) local6 + this.aFloat167 * (float) local24 + this.aFloat171 * (float) local13);
		arg3[0] = (int) (this.aFloat173 * (float) local6 + this.aFloat169 * (float) local24 + (float) local13 * this.aFloat174);
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(FFFB)V")
	public void method7672(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat178 = 0.0F;
		this.aFloat177 = 0.0F;
		this.aFloat167 = arg1;
		this.aFloat168 = arg0;
		this.aFloat170 = 0.0F;
		this.aFloat171 = 0.0F;
		this.aFloat173 = 0.0F;
		this.aFloat176 = 0.0F;
		this.aFloat172 = 0.0F;
		this.aFloat169 = 0.0F;
		this.aFloat175 = 0.0F;
		this.aFloat174 = arg2;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[F)[F")
	public float[] method7673(@OriginalArg(1) float[] arg0) {
		arg0[8] = this.aFloat175;
		arg0[14] = this.aFloat172;
		arg0[2] = this.aFloat173;
		arg0[0] = this.aFloat174;
		arg0[1] = this.aFloat169;
		arg0[7] = 0.0F;
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat171;
		arg0[9] = this.aFloat178;
		arg0[3] = 0.0F;
		arg0[6] = this.aFloat176;
		arg0[12] = this.aFloat177;
		arg0[13] = this.aFloat170;
		arg0[10] = this.aFloat168;
		arg0[11] = 0.0F;
		arg0[5] = this.aFloat167;
		return arg0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZLclient!ih;)V")
	public void method7674(@OriginalArg(1) Class31 arg0) {
		@Pc(6) Class31_Sub2 local6 = (Class31_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat174;
		@Pc(12) float local12 = this.aFloat169;
		@Pc(15) float local15 = this.aFloat171;
		@Pc(18) float local18 = this.aFloat167;
		@Pc(21) float local21 = this.aFloat175;
		@Pc(24) float local24 = this.aFloat178;
		@Pc(27) float local27 = this.aFloat177;
		this.aFloat174 = local6.aFloat175 * this.aFloat173 + local12 * local6.aFloat171 + local6.aFloat174 * local9;
		@Pc(47) float local47 = this.aFloat170;
		this.aFloat169 = local9 * local6.aFloat169 + local6.aFloat167 * local12 + this.aFloat173 * local6.aFloat178;
		this.aFloat173 = this.aFloat173 * local6.aFloat168 + local6.aFloat176 * local12 + local9 * local6.aFloat173;
		this.aFloat167 = local6.aFloat167 * local18 + local15 * local6.aFloat169 + local6.aFloat178 * this.aFloat176;
		this.aFloat171 = this.aFloat176 * local6.aFloat175 + local15 * local6.aFloat174 + local6.aFloat171 * local18;
		this.aFloat176 = local6.aFloat168 * this.aFloat176 + local18 * local6.aFloat176 + local15 * local6.aFloat173;
		this.aFloat175 = local21 * local6.aFloat174 + local24 * local6.aFloat171 + local6.aFloat175 * this.aFloat168;
		this.aFloat178 = local6.aFloat169 * local21 + local24 * local6.aFloat167 + local6.aFloat178 * this.aFloat168;
		this.aFloat168 = local6.aFloat168 * this.aFloat168 + local24 * local6.aFloat176 + local21 * local6.aFloat173;
		this.aFloat170 = local6.aFloat170 + local6.aFloat167 * local47 + local27 * local6.aFloat169 + local6.aFloat178 * this.aFloat172;
		this.aFloat177 = local6.aFloat177 + local27 * local6.aFloat174 + local47 * local6.aFloat171 + this.aFloat172 * local6.aFloat175;
		this.aFloat172 = local6.aFloat172 + this.aFloat172 * local6.aFloat168 + local27 * local6.aFloat173 + local47 * local6.aFloat176;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "()V")
	@Override
	public void method7926() {
		this.aFloat174 = this.aFloat167 = this.aFloat168 = 1.0F;
		this.aFloat169 = this.aFloat173 = this.aFloat171 = this.aFloat176 = this.aFloat175 = this.aFloat178 = this.aFloat177 = this.aFloat170 = this.aFloat172 = 0.0F;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([I)V")
	@Override
	public void method7928(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat177;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat170;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat172;
		arg0[1] = (int) (local28 * this.aFloat176 + local19 * this.aFloat167 + local11 * this.aFloat171);
		arg0[0] = (int) (local19 * this.aFloat169 + this.aFloat174 * local11 + local28 * this.aFloat173);
		arg0[2] = (int) (this.aFloat175 * local11 + this.aFloat178 * local19 + this.aFloat168 * local28);
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	@Override
	public void method7924(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class77.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class77.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat174;
		@Pc(21) float local21 = this.aFloat171;
		@Pc(24) float local24 = this.aFloat175;
		@Pc(27) float local27 = this.aFloat177;
		this.aFloat174 = local18 * local9 + this.aFloat173 * local15;
		this.aFloat171 = local9 * local21 + this.aFloat176 * local15;
		this.aFloat173 = this.aFloat173 * local9 - local15 * local18;
		this.aFloat176 = this.aFloat176 * local9 - local21 * local15;
		this.aFloat175 = this.aFloat168 * local15 + local24 * local9;
		this.aFloat177 = local15 * this.aFloat172 + local27 * local9;
		this.aFloat168 = this.aFloat168 * local9 - local15 * local24;
		this.aFloat172 = this.aFloat172 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B[F)[F")
	public float[] method7675(@OriginalArg(1) float[] arg0) {
		arg0[6] = this.aFloat178;
		arg0[7] = this.aFloat170;
		arg0[4] = this.aFloat169;
		arg0[0] = this.aFloat174;
		arg0[5] = this.aFloat167;
		arg0[3] = this.aFloat177;
		arg0[1] = this.aFloat171;
		arg0[2] = this.aFloat175;
		return arg0;
	}

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "(I)V")
	@Override
	public void method7936(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class77.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class77.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat169;
		@Pc(21) float local21 = this.aFloat167;
		@Pc(24) float local24 = this.aFloat178;
		@Pc(27) float local27 = this.aFloat170;
		this.aFloat169 = local9 * local18 - this.aFloat173 * local15;
		this.aFloat173 = local18 * local15 + local9 * this.aFloat173;
		this.aFloat167 = local21 * local9 - this.aFloat176 * local15;
		this.aFloat178 = local24 * local9 - local15 * this.aFloat168;
		this.aFloat176 = local9 * this.aFloat176 + local15 * local21;
		this.aFloat170 = local9 * local27 - local15 * this.aFloat172;
		this.aFloat168 = this.aFloat168 * local9 + local24 * local15;
		this.aFloat172 = local27 * local15 + local9 * this.aFloat172;
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)V")
	@Override
	public void method7927(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class77.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class77.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat174;
		@Pc(21) float local21 = this.aFloat171;
		@Pc(24) float local24 = this.aFloat175;
		this.aFloat174 = local9 * local18 - local15 * this.aFloat169;
		@Pc(37) float local37 = this.aFloat177;
		this.aFloat171 = local9 * local21 - this.aFloat167 * local15;
		this.aFloat169 = local18 * local15 + local9 * this.aFloat169;
		this.aFloat167 = this.aFloat167 * local9 + local15 * local21;
		this.aFloat175 = local24 * local9 - this.aFloat178 * local15;
		this.aFloat178 = local15 * local24 + local9 * this.aFloat178;
		this.aFloat177 = local9 * local37 - this.aFloat170 * local15;
		this.aFloat170 = local37 * local15 + this.aFloat170 * local9;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(FBFIFII)V")
	public void method7677(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == 0) {
			this.aFloat177 = (float) -arg2 + arg0;
			this.aFloat169 = this.aFloat173 = this.aFloat171 = this.aFloat176 = this.aFloat175 = this.aFloat178 = 0.0F;
			this.aFloat172 = arg3;
			this.aFloat167 = (float) (arg5 * 2);
			this.aFloat174 = (float) (arg2 * 2);
			this.aFloat168 = 1.0F;
			this.aFloat170 = (float) -arg5 + arg1;
			return;
		}
		@Pc(62) float local62 = Class77.aFloatArray7[arg4 & 0x3FFF];
		@Pc(68) float local68 = Class77.aFloatArray8[arg4 & 0x3FFF];
		this.aFloat174 = local62 * 2.0F * (float) arg2;
		this.aFloat172 = arg3;
		this.aFloat170 = (float) (arg5 * 2) * (-0.5F * local68 - local62 * 0.5F) + arg1;
		this.aFloat173 = this.aFloat176 = this.aFloat175 = this.aFloat178 = 0.0F;
		this.aFloat171 = (float) arg5 * local68 * -2.0F;
		this.aFloat177 = (local68 * 0.5F - local62 * 0.5F) * (float) (arg2 * 2) + arg0;
		this.aFloat168 = 1.0F;
		this.aFloat167 = local62 * 2.0F * (float) arg5;
		this.aFloat169 = local68 * 2.0F * (float) arg2;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ih;Lclient!ih;)V")
	public void method7678(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1) {
		@Pc(6) Class31_Sub2 local6 = (Class31_Sub2) arg0;
		@Pc(9) Class31_Sub2 local9 = (Class31_Sub2) arg1;
		this.aFloat174 = local6.aFloat171 * local9.aFloat169 + local6.aFloat174 * local9.aFloat174 + local6.aFloat175 * local9.aFloat173;
		this.aFloat169 = local9.aFloat173 * local6.aFloat178 + local9.aFloat169 * local6.aFloat167 + local6.aFloat169 * local9.aFloat174;
		this.aFloat173 = local9.aFloat173 * local6.aFloat168 + local6.aFloat176 * local9.aFloat169 + local9.aFloat174 * local6.aFloat173;
		this.aFloat171 = local9.aFloat176 * local6.aFloat175 + local9.aFloat167 * local6.aFloat171 + local9.aFloat171 * local6.aFloat174;
		this.aFloat167 = local6.aFloat167 * local9.aFloat167 + local6.aFloat169 * local9.aFloat171 + local9.aFloat176 * local6.aFloat178;
		this.aFloat176 = local9.aFloat171 * local6.aFloat173 + local9.aFloat167 * local6.aFloat176 + local9.aFloat176 * local6.aFloat168;
		this.aFloat175 = local9.aFloat175 * local6.aFloat174 + local6.aFloat171 * local9.aFloat178 + local9.aFloat168 * local6.aFloat175;
		this.aFloat178 = local9.aFloat175 * local6.aFloat169 + local9.aFloat178 * local6.aFloat167 + local6.aFloat178 * local9.aFloat168;
		this.aFloat177 = local9.aFloat172 * local6.aFloat175 + local6.aFloat171 * local9.aFloat170 + local9.aFloat177 * local6.aFloat174 + local6.aFloat177;
		this.aFloat168 = local9.aFloat168 * local6.aFloat168 + local6.aFloat176 * local9.aFloat178 + local9.aFloat175 * local6.aFloat173;
		this.aFloat170 = local6.aFloat170 + local6.aFloat178 * local9.aFloat172 + local9.aFloat170 * local6.aFloat167 + local6.aFloat169 * local9.aFloat177;
		this.aFloat172 = local9.aFloat170 * local6.aFloat176 + local6.aFloat173 * local9.aFloat177 + local6.aFloat168 * local9.aFloat172 + local6.aFloat172;
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)V")
	@Override
	public void method7933(@OriginalArg(0) int arg0) {
		this.aFloat167 = 1.0F;
		this.aFloat174 = this.aFloat168 = Class77.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat175 = Class77.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat171 = this.aFloat177 = this.aFloat169 = this.aFloat178 = this.aFloat170 = this.aFloat176 = this.aFloat172 = 0.0F;
		this.aFloat173 = -this.aFloat175;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([FB)[F")
	public float[] method7679(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat174;
		arg0[6] = this.aFloat178;
		arg0[10] = this.aFloat168;
		arg0[5] = this.aFloat167;
		arg0[9] = this.aFloat176;
		arg0[1] = this.aFloat171;
		arg0[4] = this.aFloat169;
		arg0[14] = 0.0F;
		arg0[13] = 0.0F;
		arg0[15] = 1.0F;
		arg0[11] = this.aFloat172;
		arg0[2] = this.aFloat175;
		arg0[12] = 0.0F;
		arg0[3] = this.aFloat177;
		arg0[8] = this.aFloat173;
		arg0[7] = this.aFloat170;
		return arg0;
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat168 + (float) arg0 * this.aFloat173 + (float) arg1 * this.aFloat176);
		arg3[1] = (int) ((float) arg2 * this.aFloat178 + (float) arg0 * this.aFloat169 + (float) arg1 * this.aFloat167);
		arg3[0] = (int) (this.aFloat175 * (float) arg2 + this.aFloat174 * (float) arg0 + this.aFloat171 * (float) arg1);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat167 + (float) arg0 * this.aFloat169 + this.aFloat178 * (float) arg2 + this.aFloat170);
		arg3[2] = (int) ((float) arg1 * this.aFloat176 + this.aFloat173 * (float) arg0 + (float) arg2 * this.aFloat168 + this.aFloat172);
		arg3[0] = (int) (this.aFloat177 + this.aFloat175 * (float) arg2 + this.aFloat174 * (float) arg0 + this.aFloat171 * (float) arg1);
	}
}
