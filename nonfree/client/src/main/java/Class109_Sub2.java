import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class109_Sub2 extends Class109 {

	@OriginalMember(owner = "client!td", name = "h", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class109_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!td", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub3_Sub2_Sub2.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub3_Sub2_Sub2.aFloatArray51[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat175;
		@Pc(21) float local21 = this.aFloat167;
		@Pc(24) float local24 = this.aFloat169;
		this.aFloat175 = local9 * local18 - this.aFloat166 * local15;
		@Pc(38) float local38 = this.aFloat174;
		this.aFloat166 = local9 * this.aFloat166 + local15 * local18;
		this.aFloat167 = local9 * local21 - local15 * this.aFloat168;
		this.aFloat169 = local24 * local9 - local15 * this.aFloat164;
		this.aFloat168 = local9 * this.aFloat168 + local15 * local21;
		this.aFloat174 = local38 * local9 - local15 * this.aFloat165;
		this.aFloat164 = local9 * this.aFloat164 + local24 * local15;
		this.aFloat165 = local38 * local15 + this.aFloat165 * local9;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!q;)V")
	public void method6769(@OriginalArg(1) Class109 arg0) {
		@Pc(6) Class109_Sub2 local6 = (Class109_Sub2) arg0;
		this.aFloat172 = local6.aFloat172;
		this.aFloat173 = local6.aFloat175;
		this.aFloat171 = local6.aFloat166;
		this.aFloat175 = local6.aFloat173;
		this.aFloat166 = local6.aFloat171;
		this.aFloat169 = local6.aFloat168;
		this.aFloat167 = local6.aFloat167;
		this.aFloat164 = local6.aFloat164;
		this.aFloat168 = local6.aFloat169;
		this.aFloat170 = -(local6.aFloat165 * this.aFloat171 + local6.aFloat174 * this.aFloat173 + this.aFloat172 * local6.aFloat170);
		this.aFloat174 = -(local6.aFloat170 * this.aFloat175 + this.aFloat167 * local6.aFloat174 + this.aFloat169 * local6.aFloat165);
		this.aFloat165 = -(local6.aFloat170 * this.aFloat166 + local6.aFloat174 * this.aFloat168 + local6.aFloat165 * this.aFloat164);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7100() {
		@Pc(7) Class109_Sub2 local7 = new Class109_Sub2();
		local7.aFloat175 = this.aFloat175;
		local7.aFloat172 = this.aFloat172;
		local7.aFloat166 = this.aFloat166;
		local7.aFloat169 = this.aFloat169;
		local7.aFloat171 = this.aFloat171;
		local7.aFloat164 = this.aFloat164;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat165 = this.aFloat165;
		local7.aFloat174 = this.aFloat174;
		local7.aFloat173 = this.aFloat173;
		local7.aFloat168 = this.aFloat168;
		local7.aFloat170 = this.aFloat170;
		return local7;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)[F")
	public float[] method6770() {
		Static7.aFloatArray1[12] = 0.0F;
		Static7.aFloatArray1[9] = this.aFloat169;
		Static7.aFloatArray1[13] = 0.0F;
		Static7.aFloatArray1[5] = this.aFloat167;
		Static7.aFloatArray1[1] = this.aFloat175;
		Static7.aFloatArray1[0] = this.aFloat172;
		Static7.aFloatArray1[14] = 0.0F;
		Static7.aFloatArray1[10] = this.aFloat164;
		Static7.aFloatArray1[6] = this.aFloat168;
		Static7.aFloatArray1[2] = this.aFloat166;
		Static7.aFloatArray1[8] = this.aFloat171;
		Static7.aFloatArray1[4] = this.aFloat173;
		return Static7.aFloatArray1;
	}

	@OriginalMember(owner = "client!td", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class109 arg0) {
		@Pc(6) Class109_Sub2 local6 = (Class109_Sub2) arg0;
		this.aFloat171 = local6.aFloat171;
		this.aFloat170 = local6.aFloat170;
		this.aFloat172 = local6.aFloat172;
		this.aFloat168 = local6.aFloat168;
		this.aFloat167 = local6.aFloat167;
		this.aFloat164 = local6.aFloat164;
		this.aFloat175 = local6.aFloat175;
		this.aFloat166 = local6.aFloat166;
		this.aFloat165 = local6.aFloat165;
		this.aFloat173 = local6.aFloat173;
		this.aFloat174 = local6.aFloat174;
		this.aFloat169 = local6.aFloat169;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public void method6771() {
		this.aFloat165 = -this.aFloat165;
		this.aFloat169 = -this.aFloat169;
		this.aFloat166 = -this.aFloat166;
		this.aFloat175 = -this.aFloat175;
		this.aFloat167 = -this.aFloat167;
		this.aFloat168 = -this.aFloat168;
		this.aFloat174 = -this.aFloat174;
		this.aFloat164 = -this.aFloat164;
	}

	@OriginalMember(owner = "client!td", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat172 = 1.0F;
		this.aFloat167 = this.aFloat164 = Class3_Sub3_Sub2_Sub2.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat168 = Class3_Sub3_Sub2_Sub2.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat169 = -this.aFloat168;
		this.aFloat173 = this.aFloat171 = this.aFloat170 = this.aFloat175 = this.aFloat174 = this.aFloat166 = this.aFloat165 = 0.0F;
	}

	@OriginalMember(owner = "client!td", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub3_Sub2_Sub2.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub3_Sub2_Sub2.aFloatArray51[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat172;
		@Pc(21) float local21 = this.aFloat173;
		@Pc(24) float local24 = this.aFloat171;
		@Pc(27) float local27 = this.aFloat170;
		this.aFloat172 = local9 * local18 - this.aFloat175 * local15;
		this.aFloat175 = local15 * local18 + this.aFloat175 * local9;
		this.aFloat173 = local9 * local21 - this.aFloat167 * local15;
		this.aFloat167 = local9 * this.aFloat167 + local21 * local15;
		this.aFloat171 = local9 * local24 - this.aFloat169 * local15;
		this.aFloat169 = local24 * local15 + this.aFloat169 * local9;
		this.aFloat170 = local27 * local9 - local15 * this.aFloat174;
		this.aFloat174 = local27 * local15 + this.aFloat174 * local9;
	}

	@OriginalMember(owner = "client!td", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat164 * (float) arg2 + this.aFloat166 * (float) arg0 + this.aFloat168 * (float) arg1);
		arg3[0] = (int) (this.aFloat171 * (float) arg2 + (float) arg1 * this.aFloat173 + this.aFloat172 * (float) arg0);
		arg3[1] = (int) (this.aFloat169 * (float) arg2 + this.aFloat175 * (float) arg0 + this.aFloat167 * (float) arg1);
	}

	@OriginalMember(owner = "client!td", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat164 = 1.0F;
		this.aFloat172 = this.aFloat167 = Class3_Sub3_Sub2_Sub2.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat175 = Class3_Sub3_Sub2_Sub2.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat171 = this.aFloat170 = this.aFloat169 = this.aFloat174 = this.aFloat166 = this.aFloat168 = this.aFloat165 = 0.0F;
		this.aFloat173 = -this.aFloat175;
	}

	@OriginalMember(owner = "client!td", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat165 += arg2;
		this.aFloat170 += arg0;
		this.aFloat174 += arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(FZIIFFI)V")
	public void method6775(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat167 = arg2;
			this.aFloat164 = 1.0F;
			this.aFloat175 = this.aFloat166 = this.aFloat173 = this.aFloat168 = this.aFloat171 = this.aFloat169 = 0.0F;
			this.aFloat172 = arg1;
		} else {
			@Pc(7) float local7 = Class3_Sub3_Sub2_Sub2.aFloatArray50[arg5 & 0x3FFF];
			@Pc(13) float local13 = Class3_Sub3_Sub2_Sub2.aFloatArray51[arg5 & 0x3FFF];
			this.aFloat164 = 1.0F;
			this.aFloat166 = this.aFloat168 = this.aFloat171 = this.aFloat169 = 0.0F;
			this.aFloat172 = (float) arg1 * local7;
			this.aFloat173 = (float) arg2 * -local13;
			this.aFloat175 = local13 * (float) arg1;
			this.aFloat167 = local7 * (float) arg2;
		}
		this.aFloat174 = arg0;
		this.aFloat165 = arg3;
		this.aFloat170 = arg4;
	}

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat172 = this.aFloat167 = this.aFloat164 = 1.0F;
		this.aFloat175 = this.aFloat166 = this.aFloat173 = this.aFloat168 = this.aFloat171 = this.aFloat169 = this.aFloat170 = this.aFloat174 = this.aFloat165 = 0.0F;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([FFFFFI)V")
	public void method6776(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		arg0[0] = this.aFloat172 * arg1 + arg4 * this.aFloat173 + this.aFloat171 * arg2;
		@Pc(51) float local51;
		@Pc(43) float local43;
		@Pc(59) float local59;
		@Pc(35) float local35;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local35 = -arg3 / arg1;
			local43 = local35 * this.aFloat175 + this.aFloat174;
			local51 = this.aFloat172 * local35 + this.aFloat170;
			local59 = this.aFloat165 + this.aFloat166 * local35;
		} else if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local35 = -arg3 / arg4;
			local59 = local35 * this.aFloat168 + this.aFloat165;
			local51 = this.aFloat170 + local35 * this.aFloat173;
			local43 = this.aFloat167 * local35 + this.aFloat174;
		} else {
			local35 = -arg3 / arg2;
			local43 = this.aFloat174 + local35 * this.aFloat169;
			local59 = local35 * this.aFloat164 + this.aFloat165;
			local51 = this.aFloat171 * local35 + this.aFloat170;
		}
		arg0[1] = arg2 * this.aFloat169 + this.aFloat167 * arg4 + arg1 * this.aFloat175;
		arg0[2] = arg2 * this.aFloat164 + this.aFloat166 * arg1 + arg4 * this.aFloat168;
		arg0[3] = -(arg0[1] * local43 + local51 * arg0[0] + arg0[2] * local59);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)[F")
	public float[] method6777() {
		Static7.aFloatArray1[10] = this.aFloat164;
		Static7.aFloatArray1[4] = this.aFloat173;
		Static7.aFloatArray1[14] = this.aFloat165;
		Static7.aFloatArray1[6] = this.aFloat168;
		Static7.aFloatArray1[5] = this.aFloat167;
		Static7.aFloatArray1[12] = this.aFloat170;
		Static7.aFloatArray1[9] = this.aFloat169;
		Static7.aFloatArray1[0] = this.aFloat172;
		Static7.aFloatArray1[2] = this.aFloat166;
		Static7.aFloatArray1[13] = this.aFloat174;
		Static7.aFloatArray1[8] = this.aFloat171;
		Static7.aFloatArray1[1] = this.aFloat175;
		return Static7.aFloatArray1;
	}

	@OriginalMember(owner = "client!td", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class3_Sub3_Sub2_Sub2.aFloatArray50[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub3_Sub2_Sub2.aFloatArray51[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class3_Sub3_Sub2_Sub2.aFloatArray50[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class3_Sub3_Sub2_Sub2.aFloatArray51[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class3_Sub3_Sub2_Sub2.aFloatArray50[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class3_Sub3_Sub2_Sub2.aFloatArray51[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat166 = local9 * local27;
		this.aFloat172 = local47 * local27 + local21 * local33;
		this.aFloat173 = local39 * local9;
		this.aFloat167 = local9 * local33;
		this.aFloat164 = local21 * local9;
		this.aFloat169 = local43 * local21 + local39 * local27;
		this.aFloat175 = local39 * -local21 + local27 * local43;
		this.aFloat171 = local33 * -local27 + local47 * local21;
		this.aFloat168 = -local15;
		this.aFloat165 = -(this.aFloat164 * (float) arg2) + this.aFloat166 * (float) -arg0 - this.aFloat168 * (float) arg1;
		this.aFloat170 = this.aFloat172 * (float) -arg0 - (float) arg1 * this.aFloat173 - (float) arg2 * this.aFloat171;
		this.aFloat174 = -((float) arg2 * this.aFloat169) + this.aFloat175 * (float) -arg0 - (float) arg1 * this.aFloat167;
	}

	@OriginalMember(owner = "client!td", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat167 = 1.0F;
		this.aFloat172 = this.aFloat164 = Class3_Sub3_Sub2_Sub2.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat171 = Class3_Sub3_Sub2_Sub2.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat166 = -this.aFloat171;
		this.aFloat173 = this.aFloat170 = this.aFloat175 = this.aFloat169 = this.aFloat174 = this.aFloat168 = this.aFloat165 = 0.0F;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat170 + (float) arg2 * this.aFloat171 + this.aFloat173 * (float) arg1 + (float) arg0 * this.aFloat172);
		arg3[2] = (int) ((float) arg1 * this.aFloat168 + (float) arg0 * this.aFloat166 + this.aFloat164 * (float) arg2 + this.aFloat165);
		arg3[1] = (int) (this.aFloat174 + this.aFloat167 * (float) arg1 + (float) arg0 * this.aFloat175 + this.aFloat169 * (float) arg2);
	}

	@OriginalMember(owner = "client!td", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub3_Sub2_Sub2.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub3_Sub2_Sub2.aFloatArray51[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat172;
		@Pc(21) float local21 = this.aFloat173;
		@Pc(24) float local24 = this.aFloat171;
		this.aFloat172 = local15 * this.aFloat166 + local18 * local9;
		@Pc(37) float local37 = this.aFloat170;
		this.aFloat166 = local9 * this.aFloat166 - local15 * local18;
		this.aFloat173 = local21 * local9 + this.aFloat168 * local15;
		this.aFloat171 = local9 * local24 + local15 * this.aFloat164;
		this.aFloat168 = this.aFloat168 * local9 - local21 * local15;
		this.aFloat170 = this.aFloat165 * local15 + local9 * local37;
		this.aFloat164 = this.aFloat164 * local9 - local15 * local24;
		this.aFloat165 = local9 * this.aFloat165 - local37 * local15;
	}

	@OriginalMember(owner = "client!td", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat174 = arg1;
		this.aFloat172 = this.aFloat167 = this.aFloat164 = 1.0F;
		this.aFloat165 = arg2;
		this.aFloat170 = arg0;
		this.aFloat175 = this.aFloat166 = this.aFloat173 = this.aFloat168 = this.aFloat171 = this.aFloat169 = 0.0F;
	}

	@OriginalMember(owner = "client!td", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat170;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat174;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat165;
		arg0[2] = (int) (this.aFloat171 * local11 + this.aFloat169 * local20 + this.aFloat164 * local29);
		arg0[0] = (int) (local11 * this.aFloat172 + local20 * this.aFloat175 + this.aFloat166 * local29);
		arg0[1] = (int) (local29 * this.aFloat168 + this.aFloat167 * local20 + local11 * this.aFloat173);
	}
}
