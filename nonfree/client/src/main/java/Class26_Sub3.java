import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class26_Sub3 extends Class26 {

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!ou", name = "q", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!ou", name = "C", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!ou", name = "D", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!ou", name = "F", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!ou", name = "H", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!ou", name = "I", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!ou", name = "K", descriptor = "F")
	public float aFloat182;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
	public Class26_Sub3() {
		this.method6459();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)[F")
	public float[] method6462() {
		Static396.aFloatArray54[14] = this.aFloat171;
		Static396.aFloatArray54[4] = this.aFloat177;
		Static396.aFloatArray54[9] = this.aFloat174;
		Static396.aFloatArray54[5] = this.aFloat180;
		Static396.aFloatArray54[6] = this.aFloat175;
		Static396.aFloatArray54[0] = this.aFloat172;
		Static396.aFloatArray54[8] = this.aFloat173;
		Static396.aFloatArray54[13] = this.aFloat178;
		Static396.aFloatArray54[2] = this.aFloat181;
		Static396.aFloatArray54[10] = this.aFloat179;
		Static396.aFloatArray54[12] = this.aFloat176;
		Static396.aFloatArray54[1] = this.aFloat182;
		return Static396.aFloatArray54;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)[F")
	public float[] method6463() {
		Static396.aFloatArray54[2] = this.aFloat181;
		Static396.aFloatArray54[6] = this.aFloat175;
		Static396.aFloatArray54[1] = this.aFloat182;
		Static396.aFloatArray54[4] = this.aFloat177;
		Static396.aFloatArray54[0] = this.aFloat172;
		Static396.aFloatArray54[14] = 0.0F;
		Static396.aFloatArray54[10] = this.aFloat179;
		Static396.aFloatArray54[13] = 0.0F;
		Static396.aFloatArray54[5] = this.aFloat180;
		Static396.aFloatArray54[12] = 0.0F;
		Static396.aFloatArray54[9] = this.aFloat174;
		Static396.aFloatArray54[8] = this.aFloat173;
		return Static396.aFloatArray54;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "([I)V")
	@Override
	public void method6455(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat176;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat178;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat171;
		arg0[1] = (int) (this.aFloat175 * local29 + local12 * this.aFloat177 + local21 * this.aFloat180);
		arg0[2] = (int) (local12 * this.aFloat173 + this.aFloat174 * local21 + local29 * this.aFloat179);
		arg0[0] = (int) (this.aFloat182 * local21 + local12 * this.aFloat172 + local29 * this.aFloat181);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZFFFF[F)V")
	public void method6464(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[1] = arg3 * this.aFloat180 + arg1 * this.aFloat182 + arg2 * this.aFloat174;
		arg4[2] = arg2 * this.aFloat179 + this.aFloat175 * arg3 + this.aFloat181 * arg1;
		@Pc(82) float local82;
		@Pc(74) float local74;
		@Pc(66) float local66;
		@Pc(58) float local58;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local58 = -arg0 / arg1;
			local66 = this.aFloat171 + local58 * this.aFloat181;
			local74 = this.aFloat178 + this.aFloat182 * local58;
			local82 = this.aFloat172 * local58 + this.aFloat176;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local58 = -arg0 / arg3;
			local74 = local58 * this.aFloat180 + this.aFloat178;
			local66 = this.aFloat175 * local58 + this.aFloat171;
			local82 = this.aFloat176 + this.aFloat177 * local58;
		} else {
			local58 = -arg0 / arg2;
			local74 = this.aFloat174 * local58 + this.aFloat178;
			local66 = local58 * this.aFloat179 + this.aFloat171;
			local82 = local58 * this.aFloat173 + this.aFloat176;
		}
		arg4[0] = arg3 * this.aFloat177 + arg1 * this.aFloat172 + arg2 * this.aFloat173;
		arg4[3] = -(local66 * arg4[2] + local82 * arg4[0] + local74 * arg4[1]);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BIFFFII)V")
	public void method6465(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == 0) {
			this.aFloat182 = this.aFloat181 = this.aFloat177 = this.aFloat175 = this.aFloat173 = this.aFloat174 = 0.0F;
			this.aFloat180 = (float) arg5;
			this.aFloat179 = 1.0F;
			this.aFloat172 = (float) arg0;
		} else {
			@Pc(7) float local7 = Class21_Sub5.aFloatArray16[arg4 & 0x3FFF];
			@Pc(13) float local13 = Class21_Sub5.aFloatArray17[arg4 & 0x3FFF];
			this.aFloat182 = local13 * (float) arg0;
			this.aFloat181 = this.aFloat175 = this.aFloat173 = this.aFloat174 = 0.0F;
			this.aFloat172 = (float) arg0 * local7;
			this.aFloat177 = (float) arg5 * -local13;
			this.aFloat180 = (float) arg5 * local7;
			this.aFloat179 = 1.0F;
		}
		this.aFloat176 = arg1;
		this.aFloat171 = arg2;
		this.aFloat178 = arg3;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)V")
	@Override
	public void method6443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat171 += (float) arg2;
		this.aFloat178 += (float) arg1;
		this.aFloat176 += (float) arg0;
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
	@Override
	public void method6449(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class21_Sub5.aFloatArray16[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class21_Sub5.aFloatArray17[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat172;
		@Pc(21) float local21 = this.aFloat177;
		@Pc(24) float local24 = this.aFloat173;
		@Pc(27) float local27 = this.aFloat176;
		this.aFloat172 = local15 * this.aFloat181 + local18 * local9;
		this.aFloat177 = local21 * local9 + local15 * this.aFloat175;
		this.aFloat181 = this.aFloat181 * local9 - local15 * local18;
		this.aFloat175 = local9 * this.aFloat175 - local21 * local15;
		this.aFloat173 = local24 * local9 + this.aFloat179 * local15;
		this.aFloat179 = local9 * this.aFloat179 - local24 * local15;
		this.aFloat176 = local15 * this.aFloat171 + local27 * local9;
		this.aFloat171 = this.aFloat171 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "()V")
	@Override
	public void method6459() {
		this.aFloat172 = this.aFloat180 = this.aFloat179 = 1.0F;
		this.aFloat182 = this.aFloat181 = this.aFloat177 = this.aFloat175 = this.aFloat173 = this.aFloat174 = this.aFloat176 = this.aFloat178 = this.aFloat171 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "()Lclient!qja;")
	@Override
	public Class26 method6452() {
		@Pc(7) Class26_Sub3 local7 = new Class26_Sub3();
		local7.aFloat179 = this.aFloat179;
		local7.aFloat182 = this.aFloat182;
		local7.aFloat177 = this.aFloat177;
		local7.aFloat172 = this.aFloat172;
		local7.aFloat173 = this.aFloat173;
		local7.aFloat171 = this.aFloat171;
		local7.aFloat175 = this.aFloat175;
		local7.aFloat180 = this.aFloat180;
		local7.aFloat174 = this.aFloat174;
		local7.aFloat181 = this.aFloat181;
		local7.aFloat178 = this.aFloat178;
		local7.aFloat176 = this.aFloat176;
		return local7;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	@Override
	public void method6446(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class21_Sub5.aFloatArray16[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class21_Sub5.aFloatArray17[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat172;
		@Pc(21) float local21 = this.aFloat177;
		@Pc(24) float local24 = this.aFloat173;
		this.aFloat172 = local18 * local9 - this.aFloat182 * local15;
		@Pc(38) float local38 = this.aFloat176;
		this.aFloat177 = local21 * local9 - this.aFloat180 * local15;
		this.aFloat182 = local9 * this.aFloat182 + local18 * local15;
		this.aFloat173 = local24 * local9 - local15 * this.aFloat174;
		this.aFloat180 = local15 * local21 + local9 * this.aFloat180;
		this.aFloat176 = local9 * local38 - local15 * this.aFloat178;
		this.aFloat174 = local24 * local15 + this.aFloat174 * local9;
		this.aFloat178 = this.aFloat178 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!qja;)V")
	@Override
	public void method6447(@OriginalArg(0) Class26 arg0) {
		@Pc(6) Class26_Sub3 local6 = (Class26_Sub3) arg0;
		this.aFloat182 = local6.aFloat182;
		this.aFloat175 = local6.aFloat175;
		this.aFloat171 = local6.aFloat171;
		this.aFloat178 = local6.aFloat178;
		this.aFloat172 = local6.aFloat172;
		this.aFloat181 = local6.aFloat181;
		this.aFloat173 = local6.aFloat173;
		this.aFloat176 = local6.aFloat176;
		this.aFloat179 = local6.aFloat179;
		this.aFloat177 = local6.aFloat177;
		this.aFloat180 = local6.aFloat180;
		this.aFloat174 = local6.aFloat174;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class21_Sub5.aFloatArray16[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class21_Sub5.aFloatArray17[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class21_Sub5.aFloatArray16[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class21_Sub5.aFloatArray17[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class21_Sub5.aFloatArray16[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class21_Sub5.aFloatArray17[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat181 = local27 * local9;
		this.aFloat180 = local9 * local33;
		this.aFloat175 = -local15;
		this.aFloat172 = local33 * local21 + local27 * local47;
		this.aFloat174 = local39 * local27 + local43 * local21;
		this.aFloat179 = local21 * local9;
		this.aFloat173 = -local27 * local33 + local21 * local47;
		this.aFloat182 = local43 * local27 + local39 * -local21;
		this.aFloat177 = local9 * local39;
		this.aFloat178 = -(this.aFloat180 * (float) arg1) + (float) -arg0 * this.aFloat182 - (float) arg2 * this.aFloat174;
		this.aFloat171 = (float) -arg0 * this.aFloat181 - (float) arg1 * this.aFloat175 - this.aFloat179 * (float) arg2;
		this.aFloat176 = (float) -arg0 * this.aFloat172 - this.aFloat177 * (float) arg1 - this.aFloat173 * (float) arg2;
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)V")
	public void method6468() {
		this.aFloat180 = -this.aFloat180;
		this.aFloat178 = -this.aFloat178;
		this.aFloat182 = -this.aFloat182;
		this.aFloat175 = -this.aFloat175;
		this.aFloat179 = -this.aFloat179;
		this.aFloat181 = -this.aFloat181;
		this.aFloat174 = -this.aFloat174;
		this.aFloat171 = -this.aFloat171;
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V")
	@Override
	public void method6458(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class21_Sub5.aFloatArray16[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class21_Sub5.aFloatArray17[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat182;
		@Pc(21) float local21 = this.aFloat180;
		@Pc(24) float local24 = this.aFloat174;
		this.aFloat182 = local9 * local18 - this.aFloat181 * local15;
		@Pc(38) float local38 = this.aFloat178;
		this.aFloat180 = local9 * local21 - local15 * this.aFloat175;
		this.aFloat181 = local18 * local15 + local9 * this.aFloat181;
		this.aFloat175 = local21 * local15 + this.aFloat175 * local9;
		this.aFloat174 = local24 * local9 - this.aFloat179 * local15;
		this.aFloat178 = local38 * local9 - this.aFloat171 * local15;
		this.aFloat179 = local9 * this.aFloat179 + local15 * local24;
		this.aFloat171 = local15 * local38 + local9 * this.aFloat171;
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V")
	@Override
	public void method6450(@OriginalArg(0) int arg0) {
		this.aFloat179 = 1.0F;
		this.aFloat172 = this.aFloat180 = Class21_Sub5.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat182 = Class21_Sub5.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat177 = -this.aFloat182;
		this.aFloat173 = this.aFloat176 = this.aFloat174 = this.aFloat178 = this.aFloat181 = this.aFloat175 = this.aFloat171 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	@Override
	public void method6444(@OriginalArg(0) int arg0) {
		this.aFloat180 = 1.0F;
		this.aFloat172 = this.aFloat179 = Class21_Sub5.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat173 = Class21_Sub5.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat177 = this.aFloat176 = this.aFloat182 = this.aFloat174 = this.aFloat178 = this.aFloat175 = this.aFloat171 = 0.0F;
		this.aFloat181 = -this.aFloat173;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat173 * (float) arg2 + this.aFloat177 * (float) arg1 + (float) arg0 * this.aFloat172);
		arg3[1] = (int) (this.aFloat174 * (float) arg2 + (float) arg0 * this.aFloat182 + this.aFloat180 * (float) arg1);
		arg3[2] = (int) (this.aFloat179 * (float) arg2 + this.aFloat175 * (float) arg1 + this.aFloat181 * (float) arg0);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat171);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat178);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat176);
		arg3[2] = (int) ((float) local6 * this.aFloat179 + this.aFloat173 * (float) local24 + (float) local17 * this.aFloat174);
		arg3[0] = (int) ((float) local24 * this.aFloat172 + (float) local17 * this.aFloat182 + (float) local6 * this.aFloat181);
		arg3[1] = (int) (this.aFloat175 * (float) local6 + this.aFloat177 * (float) local24 + this.aFloat180 * (float) local17);
	}

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "(I)V")
	@Override
	public void method6460(@OriginalArg(0) int arg0) {
		this.aFloat172 = 1.0F;
		this.aFloat180 = this.aFloat179 = Class21_Sub5.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat175 = Class21_Sub5.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat174 = -this.aFloat175;
		this.aFloat177 = this.aFloat173 = this.aFloat176 = this.aFloat182 = this.aFloat178 = this.aFloat181 = this.aFloat171 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!qja;B)V")
	public void method6469(@OriginalArg(0) Class26 arg0) {
		@Pc(6) Class26_Sub3 local6 = (Class26_Sub3) arg0;
		this.aFloat177 = local6.aFloat182;
		this.aFloat172 = local6.aFloat172;
		this.aFloat173 = local6.aFloat181;
		this.aFloat182 = local6.aFloat177;
		this.aFloat174 = local6.aFloat175;
		this.aFloat181 = local6.aFloat173;
		this.aFloat180 = local6.aFloat180;
		this.aFloat176 = -(local6.aFloat171 * this.aFloat173 + local6.aFloat178 * this.aFloat177 + local6.aFloat176 * this.aFloat172);
		this.aFloat175 = local6.aFloat174;
		this.aFloat179 = local6.aFloat179;
		this.aFloat178 = -(this.aFloat174 * local6.aFloat171 + local6.aFloat176 * this.aFloat182 + this.aFloat180 * local6.aFloat178);
		this.aFloat171 = -(local6.aFloat171 * this.aFloat179 + this.aFloat181 * local6.aFloat176 + this.aFloat175 * local6.aFloat178);
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat173 * (float) arg2 + (float) arg0 * this.aFloat172 + (float) arg1 * this.aFloat177 + this.aFloat176);
		arg3[2] = (int) ((float) arg0 * this.aFloat181 + (float) arg1 * this.aFloat175 + (float) arg2 * this.aFloat179 + this.aFloat171);
		arg3[1] = (int) (this.aFloat178 + (float) arg2 * this.aFloat174 + this.aFloat180 * (float) arg1 + this.aFloat182 * (float) arg0);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(III)V")
	@Override
	public void method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat182 = this.aFloat181 = this.aFloat177 = this.aFloat175 = this.aFloat173 = this.aFloat174 = 0.0F;
		this.aFloat176 = (float) arg0;
		this.aFloat172 = this.aFloat180 = this.aFloat179 = 1.0F;
		this.aFloat178 = (float) arg1;
		this.aFloat171 = (float) arg2;
	}
}
