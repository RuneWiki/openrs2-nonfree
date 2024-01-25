import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ria")
public final class Class117_Sub3 extends Class117 {

	@OriginalMember(owner = "client!ria", name = "i", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!ria", name = "r", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!ria", name = "t", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!ria", name = "w", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!ria", name = "B", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!ria", name = "F", descriptor = "F")
	public float aFloat182;

	@OriginalMember(owner = "client!ria", name = "G", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!ria", name = "H", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!ria", name = "M", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!ria", name = "O", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!ria", name = "P", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!ria", name = "T", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "()V")
	public Class117_Sub3() {
		this.method7251();
	}

	@OriginalMember(owner = "client!ria", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat181);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat188);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat178);
		arg3[1] = (int) ((float) local6 * this.aFloat182 + (float) local24 * this.aFloat179 + this.aFloat185 * (float) local17);
		arg3[0] = (int) (this.aFloat180 * (float) local17 + this.aFloat177 * (float) local24 + (float) local6 * this.aFloat187);
		arg3[2] = (int) ((float) local6 * this.aFloat183 + (float) local24 * this.aFloat184 + (float) local17 * this.aFloat186);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class269.aFloatArray62[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class269.aFloatArray63[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class269.aFloatArray62[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class269.aFloatArray63[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class269.aFloatArray62[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class269.aFloatArray63[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat182 = local39 * local9;
		this.aFloat183 = -local27 * local33 + local21 * local47;
		this.aFloat187 = local27 * local47 + local33 * local21;
		this.aFloat180 = local27 * local9;
		this.aFloat185 = -local15;
		this.aFloat184 = local39 * local27 + local43 * local21;
		this.aFloat177 = -local21 * local39 + local43 * local27;
		this.aFloat186 = local9 * local21;
		this.aFloat179 = local33 * local9;
		this.aFloat178 = -(this.aFloat184 * (float) arg2) - this.aFloat179 * (float) arg1 + (float) -arg0 * this.aFloat177;
		this.aFloat181 = (float) -arg0 * this.aFloat187 - this.aFloat182 * (float) arg1 - (float) arg2 * this.aFloat183;
		this.aFloat188 = -(this.aFloat186 * (float) arg2) + this.aFloat180 * (float) -arg0 - this.aFloat185 * (float) arg1;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "()Lclient!ofa;")
	@Override
	public Class117 method7248() {
		@Pc(7) Class117_Sub3 local7 = new Class117_Sub3();
		local7.aFloat183 = this.aFloat183;
		local7.aFloat186 = this.aFloat186;
		local7.aFloat187 = this.aFloat187;
		local7.aFloat180 = this.aFloat180;
		local7.aFloat188 = this.aFloat188;
		local7.aFloat181 = this.aFloat181;
		local7.aFloat184 = this.aFloat184;
		local7.aFloat182 = this.aFloat182;
		local7.aFloat177 = this.aFloat177;
		local7.aFloat185 = this.aFloat185;
		local7.aFloat178 = this.aFloat178;
		local7.aFloat179 = this.aFloat179;
		return local7;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "([I)V")
	@Override
	public void method7252(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat181;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat178;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat188;
		arg0[1] = (int) (local20 * this.aFloat179 + this.aFloat182 * local12 + local29 * this.aFloat185);
		arg0[0] = (int) (this.aFloat177 * local20 + this.aFloat187 * local12 + this.aFloat180 * local29);
		arg0[2] = (int) (local20 * this.aFloat184 + local12 * this.aFloat183 + local29 * this.aFloat186);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V")
	@Override
	public void method7242(@OriginalArg(0) int arg0) {
		this.aFloat179 = 1.0F;
		this.aFloat187 = this.aFloat186 = Class269.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat183 = Class269.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat182 = this.aFloat181 = this.aFloat177 = this.aFloat184 = this.aFloat178 = this.aFloat185 = this.aFloat188 = 0.0F;
		this.aFloat180 = -this.aFloat183;
	}

	@OriginalMember(owner = "client!ria", name = "d", descriptor = "(I)V")
	@Override
	public void method7246(@OriginalArg(0) int arg0) {
		this.aFloat187 = 1.0F;
		this.aFloat179 = this.aFloat186 = Class269.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat185 = Class269.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat184 = -this.aFloat185;
		this.aFloat182 = this.aFloat183 = this.aFloat181 = this.aFloat177 = this.aFloat178 = this.aFloat180 = this.aFloat188 = 0.0F;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(III)V")
	@Override
	public void method7244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat178 = (float) arg1;
		this.aFloat187 = this.aFloat179 = this.aFloat186 = 1.0F;
		this.aFloat188 = (float) arg2;
		this.aFloat177 = this.aFloat180 = this.aFloat182 = this.aFloat185 = this.aFloat183 = this.aFloat184 = 0.0F;
		this.aFloat181 = (float) arg0;
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "(III)V")
	@Override
	public void method7247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat181 += (float) arg0;
		this.aFloat188 += (float) arg2;
		this.aFloat178 += (float) arg1;
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "(I)V")
	@Override
	public void method7243(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class269.aFloatArray62[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class269.aFloatArray63[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat187;
		@Pc(21) float local21 = this.aFloat182;
		@Pc(24) float local24 = this.aFloat183;
		this.aFloat187 = local15 * this.aFloat180 + local18 * local9;
		@Pc(37) float local37 = this.aFloat181;
		this.aFloat182 = local21 * local9 + this.aFloat185 * local15;
		this.aFloat180 = local9 * this.aFloat180 - local15 * local18;
		this.aFloat183 = local24 * local9 + local15 * this.aFloat186;
		this.aFloat185 = local9 * this.aFloat185 - local21 * local15;
		this.aFloat181 = local15 * this.aFloat188 + local9 * local37;
		this.aFloat186 = local9 * this.aFloat186 - local15 * local24;
		this.aFloat188 = local9 * this.aFloat188 - local15 * local37;
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "()V")
	@Override
	public void method7251() {
		this.aFloat177 = this.aFloat180 = this.aFloat182 = this.aFloat185 = this.aFloat183 = this.aFloat184 = this.aFloat181 = this.aFloat178 = this.aFloat188 = 0.0F;
		this.aFloat187 = this.aFloat179 = this.aFloat186 = 1.0F;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(BLclient!ofa;)V")
	public void method7262(@OriginalArg(1) Class117 arg0) {
		@Pc(6) Class117_Sub3 local6 = (Class117_Sub3) arg0;
		this.aFloat183 = local6.aFloat180;
		this.aFloat182 = local6.aFloat177;
		this.aFloat187 = local6.aFloat187;
		this.aFloat184 = local6.aFloat185;
		this.aFloat177 = local6.aFloat182;
		this.aFloat180 = local6.aFloat183;
		this.aFloat179 = local6.aFloat179;
		this.aFloat181 = -(local6.aFloat188 * this.aFloat183 + local6.aFloat178 * this.aFloat182 + local6.aFloat181 * this.aFloat187);
		this.aFloat185 = local6.aFloat184;
		this.aFloat186 = local6.aFloat186;
		this.aFloat178 = -(this.aFloat184 * local6.aFloat188 + this.aFloat179 * local6.aFloat178 + this.aFloat177 * local6.aFloat181);
		this.aFloat188 = -(local6.aFloat188 * this.aFloat186 + this.aFloat185 * local6.aFloat178 + this.aFloat180 * local6.aFloat181);
	}

	@OriginalMember(owner = "client!ria", name = "i", descriptor = "(I)V")
	public void method7263() {
		this.aFloat185 = -this.aFloat185;
		this.aFloat180 = -this.aFloat180;
		this.aFloat184 = -this.aFloat184;
		this.aFloat188 = -this.aFloat188;
		this.aFloat178 = -this.aFloat178;
		this.aFloat186 = -this.aFloat186;
		this.aFloat179 = -this.aFloat179;
		this.aFloat177 = -this.aFloat177;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(FFFIF[F)V")
	public void method7264(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[0] = arg0 * this.aFloat183 + this.aFloat187 * arg3 + this.aFloat182 * arg2;
		arg4[1] = this.aFloat184 * arg0 + this.aFloat179 * arg2 + arg3 * this.aFloat177;
		arg4[2] = arg2 * this.aFloat185 + arg3 * this.aFloat180 + arg0 * this.aFloat186;
		@Pc(91) float local91;
		@Pc(99) float local99;
		@Pc(83) float local83;
		@Pc(75) float local75;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local75 = -arg1 / arg3;
			local83 = this.aFloat180 * local75 + this.aFloat188;
			local91 = this.aFloat187 * local75 + this.aFloat181;
			local99 = this.aFloat177 * local75 + this.aFloat178;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local75 = -arg1 / arg2;
			local83 = this.aFloat188 + local75 * this.aFloat185;
			local91 = this.aFloat181 + this.aFloat182 * local75;
			local99 = local75 * this.aFloat179 + this.aFloat178;
		} else {
			local75 = -arg1 / arg0;
			local83 = this.aFloat188 + local75 * this.aFloat186;
			local99 = this.aFloat184 * local75 + this.aFloat178;
			local91 = local75 * this.aFloat183 + this.aFloat181;
		}
		arg4[3] = -(arg4[2] * local83 + arg4[0] * local91 + arg4[1] * local99);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)[F")
	public float[] method7265() {
		Static229.aFloatArray11[4] = this.aFloat182;
		Static229.aFloatArray11[1] = this.aFloat177;
		Static229.aFloatArray11[14] = this.aFloat188;
		Static229.aFloatArray11[9] = this.aFloat184;
		Static229.aFloatArray11[8] = this.aFloat183;
		Static229.aFloatArray11[5] = this.aFloat179;
		Static229.aFloatArray11[0] = this.aFloat187;
		Static229.aFloatArray11[13] = this.aFloat178;
		Static229.aFloatArray11[12] = this.aFloat181;
		Static229.aFloatArray11[10] = this.aFloat186;
		Static229.aFloatArray11[2] = this.aFloat180;
		Static229.aFloatArray11[6] = this.aFloat185;
		return Static229.aFloatArray11;
	}

	@OriginalMember(owner = "client!ria", name = "f", descriptor = "(I)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class269.aFloatArray62[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class269.aFloatArray63[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat187;
		@Pc(21) float local21 = this.aFloat182;
		@Pc(24) float local24 = this.aFloat183;
		this.aFloat187 = local18 * local9 - local15 * this.aFloat177;
		@Pc(38) float local38 = this.aFloat181;
		this.aFloat182 = local21 * local9 - local15 * this.aFloat179;
		this.aFloat177 = local15 * local18 + local9 * this.aFloat177;
		this.aFloat179 = local9 * this.aFloat179 + local21 * local15;
		this.aFloat183 = local9 * local24 - this.aFloat184 * local15;
		this.aFloat181 = local9 * local38 - this.aFloat178 * local15;
		this.aFloat184 = local15 * local24 + this.aFloat184 * local9;
		this.aFloat178 = this.aFloat178 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg1 * this.aFloat182 + this.aFloat187 * (float) arg0 + this.aFloat183 * (float) arg2);
		arg3[2] = (int) ((float) arg0 * this.aFloat180 + this.aFloat185 * (float) arg1 + this.aFloat186 * (float) arg2);
		arg3[1] = (int) (this.aFloat177 * (float) arg0 + (float) arg1 * this.aFloat179 + this.aFloat184 * (float) arg2);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!ofa;)V")
	@Override
	public void method7253(@OriginalArg(0) Class117 arg0) {
		@Pc(6) Class117_Sub3 local6 = (Class117_Sub3) arg0;
		this.aFloat177 = local6.aFloat177;
		this.aFloat187 = local6.aFloat187;
		this.aFloat179 = local6.aFloat179;
		this.aFloat182 = local6.aFloat182;
		this.aFloat185 = local6.aFloat185;
		this.aFloat178 = local6.aFloat178;
		this.aFloat183 = local6.aFloat183;
		this.aFloat180 = local6.aFloat180;
		this.aFloat184 = local6.aFloat184;
		this.aFloat186 = local6.aFloat186;
		this.aFloat188 = local6.aFloat188;
		this.aFloat181 = local6.aFloat181;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZFFFIII)V")
	public void method7268(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == 0) {
			this.aFloat187 = (float) arg5;
			this.aFloat186 = 1.0F;
			this.aFloat177 = this.aFloat180 = this.aFloat182 = this.aFloat185 = this.aFloat183 = this.aFloat184 = 0.0F;
			this.aFloat179 = (float) arg3;
		} else {
			@Pc(7) float local7 = Class269.aFloatArray62[arg4 & 0x3FFF];
			@Pc(13) float local13 = Class269.aFloatArray63[arg4 & 0x3FFF];
			this.aFloat179 = local7 * (float) arg3;
			this.aFloat177 = local13 * (float) arg5;
			this.aFloat186 = 1.0F;
			this.aFloat182 = -local13 * (float) arg3;
			this.aFloat180 = this.aFloat185 = this.aFloat183 = this.aFloat184 = 0.0F;
			this.aFloat187 = local7 * (float) arg5;
		}
		this.aFloat181 = arg1;
		this.aFloat178 = arg0;
		this.aFloat188 = arg2;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat188 + this.aFloat180 * (float) arg0 + this.aFloat185 * (float) arg1 + this.aFloat186 * (float) arg2);
		arg3[0] = (int) (this.aFloat181 + (float) arg0 * this.aFloat187 + this.aFloat182 * (float) arg1 + (float) arg2 * this.aFloat183);
		arg3[1] = (int) (this.aFloat184 * (float) arg2 + this.aFloat177 * (float) arg0 + (float) arg1 * this.aFloat179 + this.aFloat178);
	}

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "(I)V")
	@Override
	public void method7249(@OriginalArg(0) int arg0) {
		this.aFloat186 = 1.0F;
		this.aFloat187 = this.aFloat179 = Class269.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat177 = Class269.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat182 = -this.aFloat177;
		this.aFloat183 = this.aFloat181 = this.aFloat184 = this.aFloat178 = this.aFloat180 = this.aFloat185 = this.aFloat188 = 0.0F;
	}

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "(I)V")
	@Override
	public void method7258(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class269.aFloatArray62[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class269.aFloatArray63[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat177;
		@Pc(21) float local21 = this.aFloat179;
		@Pc(24) float local24 = this.aFloat184;
		@Pc(27) float local27 = this.aFloat178;
		this.aFloat177 = local9 * local18 - local15 * this.aFloat180;
		this.aFloat179 = local9 * local21 - this.aFloat185 * local15;
		this.aFloat180 = local18 * local15 + local9 * this.aFloat180;
		this.aFloat184 = local9 * local24 - this.aFloat186 * local15;
		this.aFloat185 = this.aFloat185 * local9 + local15 * local21;
		this.aFloat186 = local15 * local24 + local9 * this.aFloat186;
		this.aFloat178 = local9 * local27 - local15 * this.aFloat188;
		this.aFloat188 = local9 * this.aFloat188 + local15 * local27;
	}

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "(I)[F")
	public float[] method7269() {
		Static229.aFloatArray11[0] = this.aFloat187;
		Static229.aFloatArray11[6] = this.aFloat185;
		Static229.aFloatArray11[13] = 0.0F;
		Static229.aFloatArray11[5] = this.aFloat179;
		Static229.aFloatArray11[12] = 0.0F;
		Static229.aFloatArray11[4] = this.aFloat182;
		Static229.aFloatArray11[10] = this.aFloat186;
		Static229.aFloatArray11[14] = 0.0F;
		Static229.aFloatArray11[1] = this.aFloat177;
		Static229.aFloatArray11[9] = this.aFloat184;
		Static229.aFloatArray11[8] = this.aFloat183;
		Static229.aFloatArray11[2] = this.aFloat180;
		return Static229.aFloatArray11;
	}
}
