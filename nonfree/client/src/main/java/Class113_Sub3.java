import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class113_Sub3 extends Class113 {

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!qo", name = "K", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!qo", name = "M", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!qo", name = "db", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!qo", name = "fb", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!qo", name = "hb", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
	public Class113_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!qo", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat168;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat178;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat172;
		arg0[0] = (int) (local28 * this.aFloat169 + this.aFloat174 * local19 + local11 * this.aFloat173);
		arg0[1] = (int) (local19 * this.aFloat177 + this.aFloat170 * local11 + local28 * this.aFloat167);
		arg0[2] = (int) (this.aFloat175 * local28 + local19 * this.aFloat176 + local11 * this.aFloat171);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([FI)[F")
	public float[] method6052(@OriginalArg(0) float[] arg0) {
		arg0[6] = this.aFloat167;
		arg0[13] = this.aFloat178;
		arg0[12] = this.aFloat168;
		arg0[1] = this.aFloat174;
		arg0[4] = this.aFloat170;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[15] = 1.0F;
		arg0[2] = this.aFloat169;
		arg0[0] = this.aFloat173;
		arg0[8] = this.aFloat171;
		arg0[14] = this.aFloat172;
		arg0[3] = 0.0F;
		arg0[10] = this.aFloat175;
		arg0[5] = this.aFloat177;
		arg0[9] = this.aFloat176;
		return arg0;
	}

	@OriginalMember(owner = "client!qo", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat171 * (float) arg2 + (float) arg0 * this.aFloat173 + (float) arg1 * this.aFloat170);
		arg3[1] = (int) ((float) arg2 * this.aFloat176 + (float) arg0 * this.aFloat174 + this.aFloat177 * (float) arg1);
		arg3[2] = (int) (this.aFloat169 * (float) arg0 + (float) arg1 * this.aFloat167 + (float) arg2 * this.aFloat175);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat168 + this.aFloat170 * (float) arg1 + this.aFloat173 * (float) arg0 + (float) arg2 * this.aFloat171);
		arg3[1] = (int) (this.aFloat176 * (float) arg2 + (float) arg0 * this.aFloat174 + this.aFloat177 * (float) arg1 + this.aFloat178);
		arg3[2] = (int) (this.aFloat172 + (float) arg2 * this.aFloat175 + (float) arg0 * this.aFloat169 + (float) arg1 * this.aFloat167);
	}

	@OriginalMember(owner = "client!qo", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class1_Sub1_Sub27.aFloatArray35[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub1_Sub27.aFloatArray36[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class1_Sub1_Sub27.aFloatArray35[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class1_Sub1_Sub27.aFloatArray36[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class1_Sub1_Sub27.aFloatArray35[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class1_Sub1_Sub27.aFloatArray36[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat174 = local43 * local27 + local39 * -local21;
		this.aFloat173 = local21 * local33 + local47 * local27;
		this.aFloat177 = local9 * local33;
		this.aFloat169 = local9 * local27;
		this.aFloat175 = local9 * local21;
		this.aFloat170 = local39 * local9;
		this.aFloat171 = local47 * local21 + local33 * -local27;
		this.aFloat167 = -local15;
		this.aFloat176 = local27 * local39 + local21 * local43;
		this.aFloat168 = this.aFloat173 * (float) -arg0 - this.aFloat170 * (float) arg1 - (float) arg2 * this.aFloat171;
		this.aFloat178 = -(this.aFloat176 * (float) arg2) + this.aFloat174 * (float) -arg0 - this.aFloat177 * (float) arg1;
		this.aFloat172 = -(this.aFloat175 * (float) arg2) - this.aFloat167 * (float) arg1 + this.aFloat169 * (float) -arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[F)[F")
	public float[] method6053(@OriginalArg(1) float[] arg0) {
		arg0[10] = this.aFloat175;
		arg0[14] = 0.0F;
		arg0[1] = this.aFloat170;
		arg0[12] = 0.0F;
		arg0[11] = 0.0F;
		arg0[15] = 0.0F;
		arg0[8] = this.aFloat169;
		arg0[4] = this.aFloat174;
		arg0[6] = this.aFloat176;
		arg0[5] = this.aFloat177;
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat173;
		arg0[2] = this.aFloat171;
		arg0[7] = 0.0F;
		arg0[3] = 0.0F;
		arg0[9] = this.aFloat167;
		return arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFB)V")
	public void method6054(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat169 = 0.0F;
		this.aFloat172 = 0.0F;
		this.aFloat170 = 0.0F;
		this.aFloat176 = 0.0F;
		this.aFloat175 = arg0;
		this.aFloat167 = 0.0F;
		this.aFloat171 = 0.0F;
		this.aFloat177 = arg1;
		this.aFloat178 = 0.0F;
		this.aFloat168 = 0.0F;
		this.aFloat174 = 0.0F;
		this.aFloat173 = arg2;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B[F)[F")
	public float[] method6055(@OriginalArg(1) float[] arg0) {
		arg0[2] = this.aFloat171;
		arg0[14] = 0.0F;
		arg0[11] = this.aFloat172;
		arg0[0] = this.aFloat173;
		arg0[4] = this.aFloat174;
		arg0[12] = 0.0F;
		arg0[3] = this.aFloat168;
		arg0[5] = this.aFloat177;
		arg0[10] = this.aFloat175;
		arg0[13] = 0.0F;
		arg0[15] = 1.0F;
		arg0[1] = this.aFloat170;
		arg0[7] = this.aFloat178;
		arg0[8] = this.aFloat169;
		arg0[6] = this.aFloat176;
		arg0[9] = this.aFloat167;
		return arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFI[FF)V")
	public void method6056(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3) {
		arg2[2] = this.aFloat175 * arg3 + this.aFloat169 * arg1 + this.aFloat167 * arg0;
		arg2[1] = this.aFloat177 * arg0 + this.aFloat174 * arg1 + this.aFloat176 * arg3;
		arg2[0] = this.aFloat171 * arg3 + this.aFloat170 * arg0 + arg1 * this.aFloat173;
	}

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat177 = 1.0F;
		this.aFloat173 = this.aFloat175 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		this.aFloat171 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		this.aFloat169 = -this.aFloat171;
		this.aFloat170 = this.aFloat168 = this.aFloat174 = this.aFloat176 = this.aFloat178 = this.aFloat167 = this.aFloat172 = 0.0F;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFI)V")
	public void method6057(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat171 *= arg1;
		this.aFloat168 *= arg1;
		this.aFloat167 *= arg2;
		this.aFloat174 *= arg0;
		this.aFloat176 *= arg0;
		this.aFloat177 *= arg0;
		this.aFloat170 *= arg1;
		this.aFloat178 *= arg0;
		this.aFloat169 *= arg2;
		this.aFloat173 *= arg1;
		this.aFloat175 *= arg2;
		this.aFloat172 *= arg2;
	}

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat174;
		@Pc(21) float local21 = this.aFloat177;
		@Pc(24) float local24 = this.aFloat176;
		@Pc(27) float local27 = this.aFloat178;
		this.aFloat174 = local18 * local9 - this.aFloat169 * local15;
		this.aFloat177 = local9 * local21 - this.aFloat167 * local15;
		this.aFloat169 = local9 * this.aFloat169 + local15 * local18;
		this.aFloat167 = local21 * local15 + local9 * this.aFloat167;
		this.aFloat176 = local24 * local9 - this.aFloat175 * local15;
		this.aFloat175 = local15 * local24 + local9 * this.aFloat175;
		this.aFloat178 = local27 * local9 - this.aFloat172 * local15;
		this.aFloat172 = local15 * local27 + this.aFloat172 * local9;
	}

	@OriginalMember(owner = "client!qo", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat175 = 1.0F;
		this.aFloat173 = this.aFloat177 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		this.aFloat174 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		this.aFloat170 = -this.aFloat174;
		this.aFloat171 = this.aFloat168 = this.aFloat176 = this.aFloat178 = this.aFloat169 = this.aFloat167 = this.aFloat172 = 0.0F;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!q;)V")
	public void method6059(@OriginalArg(1) Class113 arg0) {
		@Pc(12) Class113_Sub3 local12 = (Class113_Sub3) arg0;
		this.aFloat173 = local12.aFloat173;
		this.aFloat170 = local12.aFloat174;
		this.aFloat171 = local12.aFloat169;
		this.aFloat177 = local12.aFloat177;
		this.aFloat176 = local12.aFloat167;
		this.aFloat174 = local12.aFloat170;
		this.aFloat169 = local12.aFloat171;
		this.aFloat175 = local12.aFloat175;
		this.aFloat168 = -(local12.aFloat178 * this.aFloat170 + local12.aFloat168 * this.aFloat173 + this.aFloat171 * local12.aFloat172);
		this.aFloat167 = local12.aFloat176;
		this.aFloat178 = -(local12.aFloat178 * this.aFloat177 + this.aFloat174 * local12.aFloat168 + local12.aFloat172 * this.aFloat176);
		this.aFloat172 = -(local12.aFloat168 * this.aFloat169 + this.aFloat167 * local12.aFloat178 + this.aFloat175 * local12.aFloat172);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6103() {
		@Pc(7) Class113_Sub3 local7 = new Class113_Sub3();
		local7.aFloat168 = this.aFloat168;
		local7.aFloat174 = this.aFloat174;
		local7.aFloat172 = this.aFloat172;
		local7.aFloat173 = this.aFloat173;
		local7.aFloat176 = this.aFloat176;
		local7.aFloat169 = this.aFloat169;
		local7.aFloat170 = this.aFloat170;
		local7.aFloat175 = this.aFloat175;
		local7.aFloat177 = this.aFloat177;
		local7.aFloat178 = this.aFloat178;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat171 = this.aFloat171;
		return local7;
	}

	@OriginalMember(owner = "client!qo", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat172 = arg2;
		this.aFloat174 = this.aFloat169 = this.aFloat170 = this.aFloat167 = this.aFloat171 = this.aFloat176 = 0.0F;
		this.aFloat168 = arg0;
		this.aFloat173 = this.aFloat177 = this.aFloat175 = 1.0F;
		this.aFloat178 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "([FI)[F")
	public float[] method6060(@OriginalArg(0) float[] arg0) {
		arg0[8] = this.aFloat168;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[6] = 0.0F;
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat170;
		arg0[5] = this.aFloat177;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		arg0[12] = 0.0F;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat172;
		arg0[2] = 0.0F;
		arg0[1] = this.aFloat174;
		arg0[9] = this.aFloat178;
		arg0[0] = this.aFloat173;
		return arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FZFF)F")
	public float method6061(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat168 + this.aFloat173 * arg1 + arg0 * this.aFloat170 + arg2 * this.aFloat171;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method6062(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class113 arg1) {
		@Pc(6) Class113_Sub3 local6 = (Class113_Sub3) arg0;
		@Pc(9) Class113_Sub3 local9 = (Class113_Sub3) arg1;
		this.aFloat173 = local6.aFloat171 * local9.aFloat169 + local6.aFloat173 * local9.aFloat173 + local6.aFloat170 * local9.aFloat174;
		this.aFloat174 = local9.aFloat174 * local6.aFloat177 + local9.aFloat173 * local6.aFloat174 + local6.aFloat176 * local9.aFloat169;
		this.aFloat170 = local6.aFloat171 * local9.aFloat167 + local9.aFloat177 * local6.aFloat170 + local6.aFloat173 * local9.aFloat170;
		this.aFloat169 = local6.aFloat167 * local9.aFloat174 + local6.aFloat169 * local9.aFloat173 + local9.aFloat169 * local6.aFloat175;
		this.aFloat177 = local9.aFloat170 * local6.aFloat174 + local9.aFloat177 * local6.aFloat177 + local6.aFloat176 * local9.aFloat167;
		this.aFloat171 = local9.aFloat171 * local6.aFloat173 + local6.aFloat170 * local9.aFloat176 + local9.aFloat175 * local6.aFloat171;
		this.aFloat167 = local6.aFloat169 * local9.aFloat170 + local9.aFloat177 * local6.aFloat167 + local9.aFloat167 * local6.aFloat175;
		this.aFloat176 = local6.aFloat177 * local9.aFloat176 + local6.aFloat174 * local9.aFloat171 + local6.aFloat176 * local9.aFloat175;
		this.aFloat168 = local6.aFloat171 * local9.aFloat172 + local6.aFloat170 * local9.aFloat178 + local6.aFloat173 * local9.aFloat168 + local6.aFloat168;
		this.aFloat175 = local9.aFloat175 * local6.aFloat175 + local6.aFloat167 * local9.aFloat176 + local9.aFloat171 * local6.aFloat169;
		this.aFloat178 = local6.aFloat178 + local6.aFloat176 * local9.aFloat172 + local9.aFloat178 * local6.aFloat177 + local6.aFloat174 * local9.aFloat168;
		this.aFloat172 = local6.aFloat167 * local9.aFloat178 + local9.aFloat168 * local6.aFloat169 + local9.aFloat172 * local6.aFloat175 + local6.aFloat172;
	}

	@OriginalMember(owner = "client!qo", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat173 = 1.0F;
		this.aFloat177 = this.aFloat175 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		this.aFloat167 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		this.aFloat170 = this.aFloat171 = this.aFloat168 = this.aFloat174 = this.aFloat178 = this.aFloat169 = this.aFloat172 = 0.0F;
		this.aFloat176 = -this.aFloat167;
	}

	@OriginalMember(owner = "client!qo", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat173;
		@Pc(21) float local21 = this.aFloat170;
		@Pc(24) float local24 = this.aFloat171;
		@Pc(27) float local27 = this.aFloat168;
		this.aFloat173 = local18 * local9 - this.aFloat174 * local15;
		this.aFloat170 = local9 * local21 - local15 * this.aFloat177;
		this.aFloat174 = this.aFloat174 * local9 + local18 * local15;
		this.aFloat171 = local9 * local24 - this.aFloat176 * local15;
		this.aFloat177 = local9 * this.aFloat177 + local21 * local15;
		this.aFloat176 = local9 * this.aFloat176 + local15 * local24;
		this.aFloat168 = local9 * local27 - this.aFloat178 * local15;
		this.aFloat178 = this.aFloat178 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFZ)F")
	public float method6064(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 * this.aFloat177 + arg2 * this.aFloat174 + this.aFloat176 * arg1 + this.aFloat178;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFBF)F")
	public float method6065(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg0 * this.aFloat175 + this.aFloat167 * arg1 + this.aFloat169 * arg2 + this.aFloat172;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(ILclient!q;)V")
	public void method6066(@OriginalArg(1) Class113 arg0) {
		@Pc(12) Class113_Sub3 local12 = (Class113_Sub3) arg0;
		this.aFloat172 = 0.0F;
		this.aFloat167 = local12.aFloat167;
		this.aFloat173 = local12.aFloat173;
		this.aFloat171 = local12.aFloat171;
		this.aFloat178 = 0.0F;
		this.aFloat177 = local12.aFloat177;
		this.aFloat170 = local12.aFloat170;
		this.aFloat168 = 0.0F;
		this.aFloat176 = local12.aFloat176;
		this.aFloat174 = local12.aFloat174;
		this.aFloat175 = local12.aFloat175;
		this.aFloat169 = local12.aFloat169;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FBFFFFFFFF)V")
	public void method6068(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat169 = arg5;
		this.aFloat170 = arg0;
		this.aFloat167 = arg7;
		this.aFloat176 = arg4;
		this.aFloat168 = 0.0F;
		this.aFloat173 = arg1;
		this.aFloat172 = 0.0F;
		this.aFloat175 = arg6;
		this.aFloat174 = arg2;
		this.aFloat171 = arg8;
		this.aFloat177 = arg3;
		this.aFloat178 = 0.0F;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "([FI)[F")
	public float[] method6069(@OriginalArg(0) float[] arg0) {
		arg0[6] = this.aFloat176;
		arg0[0] = this.aFloat173;
		arg0[2] = this.aFloat171;
		arg0[4] = this.aFloat174;
		arg0[5] = this.aFloat177;
		arg0[3] = this.aFloat168;
		arg0[7] = this.aFloat178;
		arg0[1] = this.aFloat170;
		return arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFIF)V")
	public void method6070(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat168 += arg2;
		this.aFloat172 += arg1;
		this.aFloat178 += arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFFI[F)V")
	public void method6071(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[2] = this.aFloat175 * arg0 + arg3 * this.aFloat169 + arg1 * this.aFloat167;
		@Pc(51) float local51;
		@Pc(59) float local59;
		@Pc(43) float local43;
		@Pc(35) float local35;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local35 = -arg2 / arg3;
			local43 = this.aFloat172 + this.aFloat169 * local35;
			local51 = this.aFloat168 + local35 * this.aFloat173;
			local59 = local35 * this.aFloat174 + this.aFloat178;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local35 = -arg2 / arg1;
			local51 = local35 * this.aFloat170 + this.aFloat168;
			local43 = this.aFloat172 + this.aFloat167 * local35;
			local59 = this.aFloat178 + this.aFloat177 * local35;
		} else {
			local35 = -arg2 / arg0;
			local43 = local35 * this.aFloat175 + this.aFloat172;
			local51 = this.aFloat171 * local35 + this.aFloat168;
			local59 = this.aFloat178 + local35 * this.aFloat176;
		}
		arg4[0] = arg1 * this.aFloat170 + arg3 * this.aFloat173 + this.aFloat171 * arg0;
		arg4[1] = this.aFloat176 * arg0 + this.aFloat174 * arg3 + arg1 * this.aFloat177;
		arg4[3] = -(arg4[2] * local43 + arg4[1] * local59 + arg4[0] * local51);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FIFIIIF)V")
	public void method6072(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat168 = (float) -arg1 + arg5;
			this.aFloat178 = arg0 - (float) arg4;
			this.aFloat177 = arg4 * 2;
			this.aFloat173 = arg1 * 2;
			this.aFloat172 = arg2;
			this.aFloat175 = 1.0F;
			this.aFloat174 = this.aFloat169 = this.aFloat170 = this.aFloat167 = this.aFloat171 = this.aFloat176 = 0.0F;
			return;
		}
		@Pc(62) float local62 = Class1_Sub1_Sub27.aFloatArray35[arg3 & 0x3FFF];
		@Pc(68) float local68 = Class1_Sub1_Sub27.aFloatArray36[arg3 & 0x3FFF];
		this.aFloat177 = local62 * 2.0F * (float) arg4;
		this.aFloat172 = arg2;
		this.aFloat170 = -2.0F * local68 * (float) arg4;
		this.aFloat174 = (float) arg1 * 2.0F * local68;
		this.aFloat169 = this.aFloat167 = this.aFloat171 = this.aFloat176 = 0.0F;
		this.aFloat168 = (local68 * 0.5F - local62 * 0.5F) * (float) (arg1 * 2) + arg5;
		this.aFloat173 = local62 * 2.0F * (float) arg1;
		this.aFloat178 = (float) (arg4 * 2) * (-0.5F * local68 - local62 * 0.5F) + arg0;
		this.aFloat175 = 1.0F;
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
	public void method6073() {
		this.aFloat167 = -this.aFloat167;
		this.aFloat175 = -this.aFloat175;
		this.aFloat174 = -this.aFloat174;
		this.aFloat178 = -this.aFloat178;
		this.aFloat169 = -this.aFloat169;
		this.aFloat177 = -this.aFloat177;
		this.aFloat176 = -this.aFloat176;
		this.aFloat172 = -this.aFloat172;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLclient!q;)V")
	public void method6074(@OriginalArg(1) Class113 arg0) {
		@Pc(6) Class113_Sub3 local6 = (Class113_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat173;
		@Pc(12) float local12 = this.aFloat174;
		@Pc(15) float local15 = this.aFloat170;
		@Pc(18) float local18 = this.aFloat177;
		@Pc(21) float local21 = this.aFloat171;
		@Pc(24) float local24 = this.aFloat176;
		@Pc(27) float local27 = this.aFloat168;
		@Pc(30) float local30 = this.aFloat178;
		this.aFloat173 = this.aFloat169 * local6.aFloat171 + local6.aFloat170 * local12 + local6.aFloat173 * local9;
		this.aFloat174 = local6.aFloat176 * this.aFloat169 + local6.aFloat174 * local9 + local6.aFloat177 * local12;
		this.aFloat170 = local6.aFloat173 * local15 + local6.aFloat170 * local18 + local6.aFloat171 * this.aFloat167;
		this.aFloat169 = local6.aFloat175 * this.aFloat169 + local6.aFloat167 * local12 + local6.aFloat169 * local9;
		this.aFloat177 = local6.aFloat174 * local15 + local18 * local6.aFloat177 + this.aFloat167 * local6.aFloat176;
		this.aFloat176 = this.aFloat175 * local6.aFloat176 + local6.aFloat177 * local24 + local21 * local6.aFloat174;
		this.aFloat171 = local6.aFloat171 * this.aFloat175 + local6.aFloat170 * local24 + local6.aFloat173 * local21;
		this.aFloat167 = local15 * local6.aFloat169 + local18 * local6.aFloat167 + local6.aFloat175 * this.aFloat167;
		this.aFloat178 = local6.aFloat178 + local6.aFloat176 * this.aFloat172 + local30 * local6.aFloat177 + local6.aFloat174 * local27;
		this.aFloat168 = local6.aFloat168 + local6.aFloat171 * this.aFloat172 + local6.aFloat173 * local27 + local6.aFloat170 * local30;
		this.aFloat175 = local6.aFloat167 * local24 + local6.aFloat169 * local21 + this.aFloat175 * local6.aFloat175;
		this.aFloat172 = local6.aFloat172 + local30 * local6.aFloat167 + local27 * local6.aFloat169 + this.aFloat172 * local6.aFloat175;
	}

	@OriginalMember(owner = "client!qo", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat178 += arg1;
		this.aFloat172 += arg2;
		this.aFloat168 += arg0;
	}

	@OriginalMember(owner = "client!qo", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat173 = this.aFloat177 = this.aFloat175 = 1.0F;
		this.aFloat174 = this.aFloat169 = this.aFloat170 = this.aFloat167 = this.aFloat171 = this.aFloat176 = this.aFloat168 = this.aFloat178 = this.aFloat172 = 0.0F;
	}

	@OriginalMember(owner = "client!qo", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat173;
		@Pc(21) float local21 = this.aFloat170;
		@Pc(24) float local24 = this.aFloat171;
		@Pc(27) float local27 = this.aFloat168;
		this.aFloat173 = local15 * this.aFloat169 + local9 * local18;
		this.aFloat170 = local9 * local21 + local15 * this.aFloat167;
		this.aFloat169 = this.aFloat169 * local9 - local15 * local18;
		this.aFloat171 = local24 * local9 + local15 * this.aFloat175;
		this.aFloat167 = local9 * this.aFloat167 - local15 * local21;
		this.aFloat168 = this.aFloat172 * local15 + local27 * local9;
		this.aFloat175 = this.aFloat175 * local9 - local24 * local15;
		this.aFloat172 = local9 * this.aFloat172 - local15 * local27;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(FFBF)V")
	public void method6075(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat168 = arg1;
		this.aFloat178 = arg2;
		this.aFloat174 = this.aFloat169 = this.aFloat170 = this.aFloat167 = this.aFloat171 = this.aFloat176 = 0.0F;
		this.aFloat172 = arg0;
		this.aFloat173 = this.aFloat177 = this.aFloat175 = 1.0F;
	}

	@OriginalMember(owner = "client!qo", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class113 arg0) {
		@Pc(6) Class113_Sub3 local6 = (Class113_Sub3) arg0;
		this.aFloat173 = local6.aFloat173;
		this.aFloat176 = local6.aFloat176;
		this.aFloat178 = local6.aFloat178;
		this.aFloat172 = local6.aFloat172;
		this.aFloat177 = local6.aFloat177;
		this.aFloat170 = local6.aFloat170;
		this.aFloat175 = local6.aFloat175;
		this.aFloat168 = local6.aFloat168;
		this.aFloat167 = local6.aFloat167;
		this.aFloat169 = local6.aFloat169;
		this.aFloat174 = local6.aFloat174;
		this.aFloat171 = local6.aFloat171;
	}
}
