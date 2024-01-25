import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vha")
public final class Class56_Sub3 extends Class56 {

	@OriginalMember(owner = "client!vha", name = "h", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!vha", name = "m", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!vha", name = "n", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!vha", name = "t", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!vha", name = "u", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!vha", name = "v", descriptor = "F")
	public float aFloat182;

	@OriginalMember(owner = "client!vha", name = "A", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!vha", name = "C", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!vha", name = "E", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!vha", name = "F", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!vha", name = "G", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!vha", name = "H", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "()V")
	public Class56_Sub3() {
		this.method8400();
	}

	@OriginalMember(owner = "client!vha", name = "e", descriptor = "(I)V")
	@Override
	public void method8391(@OriginalArg(0) int arg0) {
		this.aFloat184 = 1.0F;
		this.aFloat181 = this.aFloat188 = Class2_Sub12.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat187 = Class2_Sub12.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat177 = this.aFloat185 = this.aFloat178 = this.aFloat179 = this.aFloat186 = this.aFloat182 = this.aFloat183 = 0.0F;
		this.aFloat180 = -this.aFloat187;
	}

	@OriginalMember(owner = "client!vha", name = "f", descriptor = "(I)V")
	@Override
	public void method8392(@OriginalArg(0) int arg0) {
		this.aFloat181 = 1.0F;
		this.aFloat184 = this.aFloat188 = Class2_Sub12.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat182 = Class2_Sub12.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat179 = -this.aFloat182;
		this.aFloat177 = this.aFloat187 = this.aFloat185 = this.aFloat178 = this.aFloat186 = this.aFloat180 = this.aFloat183 = 0.0F;
	}

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "(I)V")
	@Override
	public void method8385(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub12.aFloatArray48[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub12.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat181;
		@Pc(21) float local21 = this.aFloat177;
		@Pc(24) float local24 = this.aFloat187;
		this.aFloat181 = local18 * local9 - local15 * this.aFloat178;
		@Pc(37) float local37 = this.aFloat185;
		this.aFloat177 = local21 * local9 - this.aFloat184 * local15;
		this.aFloat178 = local15 * local18 + this.aFloat178 * local9;
		this.aFloat184 = local21 * local15 + local9 * this.aFloat184;
		this.aFloat187 = local9 * local24 - local15 * this.aFloat179;
		this.aFloat179 = local15 * local24 + this.aFloat179 * local9;
		this.aFloat185 = local9 * local37 - this.aFloat186 * local15;
		this.aFloat186 = local15 * local37 + this.aFloat186 * local9;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "()Lclient!eh;")
	@Override
	public Class56 method8394() {
		@Pc(7) Class56_Sub3 local7 = new Class56_Sub3();
		local7.aFloat182 = this.aFloat182;
		local7.aFloat180 = this.aFloat180;
		local7.aFloat188 = this.aFloat188;
		local7.aFloat184 = this.aFloat184;
		local7.aFloat178 = this.aFloat178;
		local7.aFloat186 = this.aFloat186;
		local7.aFloat179 = this.aFloat179;
		local7.aFloat177 = this.aFloat177;
		local7.aFloat181 = this.aFloat181;
		local7.aFloat183 = this.aFloat183;
		local7.aFloat187 = this.aFloat187;
		local7.aFloat185 = this.aFloat185;
		return local7;
	}

	@OriginalMember(owner = "client!vha", name = "g", descriptor = "(I)V")
	@Override
	public void method8401(@OriginalArg(0) int arg0) {
		this.aFloat188 = 1.0F;
		this.aFloat181 = this.aFloat184 = Class2_Sub12.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat178 = Class2_Sub12.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat187 = this.aFloat185 = this.aFloat179 = this.aFloat186 = this.aFloat180 = this.aFloat182 = this.aFloat183 = 0.0F;
		this.aFloat177 = -this.aFloat178;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(III)V")
	@Override
	public void method8390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat185 += (float) arg0;
		this.aFloat186 += (float) arg1;
		this.aFloat183 += (float) arg2;
	}

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "(III)V")
	@Override
	public void method8395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat185 = (float) arg0;
		this.aFloat181 = this.aFloat184 = this.aFloat188 = 1.0F;
		this.aFloat178 = this.aFloat180 = this.aFloat177 = this.aFloat182 = this.aFloat187 = this.aFloat179 = 0.0F;
		this.aFloat186 = (float) arg1;
		this.aFloat183 = (float) arg2;
	}

	@OriginalMember(owner = "client!vha", name = "h", descriptor = "(I)[F")
	public float[] method8403() {
		Static443.aFloatArray62[1] = this.aFloat178;
		Static443.aFloatArray62[0] = this.aFloat181;
		Static443.aFloatArray62[9] = this.aFloat179;
		Static443.aFloatArray62[6] = this.aFloat182;
		Static443.aFloatArray62[4] = this.aFloat177;
		Static443.aFloatArray62[10] = this.aFloat188;
		Static443.aFloatArray62[2] = this.aFloat180;
		Static443.aFloatArray62[13] = 0.0F;
		Static443.aFloatArray62[8] = this.aFloat187;
		Static443.aFloatArray62[5] = this.aFloat184;
		Static443.aFloatArray62[12] = 0.0F;
		Static443.aFloatArray62[14] = 0.0F;
		return Static443.aFloatArray62;
	}

	@OriginalMember(owner = "client!vha", name = "d", descriptor = "(I)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub12.aFloatArray48[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub12.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat178;
		@Pc(21) float local21 = this.aFloat184;
		@Pc(24) float local24 = this.aFloat179;
		this.aFloat178 = local18 * local9 - local15 * this.aFloat180;
		@Pc(38) float local38 = this.aFloat186;
		this.aFloat180 = local15 * local18 + local9 * this.aFloat180;
		this.aFloat184 = local9 * local21 - this.aFloat182 * local15;
		this.aFloat182 = local15 * local21 + this.aFloat182 * local9;
		this.aFloat179 = local9 * local24 - this.aFloat188 * local15;
		this.aFloat186 = local38 * local9 - local15 * this.aFloat183;
		this.aFloat188 = local24 * local15 + local9 * this.aFloat188;
		this.aFloat183 = local38 * local15 + this.aFloat183 * local9;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub12.aFloatArray48[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub12.aFloatArray49[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub12.aFloatArray48[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub12.aFloatArray49[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub12.aFloatArray48[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub12.aFloatArray49[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat177 = local9 * local39;
		this.aFloat180 = local27 * local9;
		this.aFloat188 = local9 * local21;
		this.aFloat184 = local33 * local9;
		this.aFloat178 = local39 * -local21 + local43 * local27;
		this.aFloat179 = local21 * local43 + local27 * local39;
		this.aFloat182 = -local15;
		this.aFloat181 = local27 * local47 + local33 * local21;
		this.aFloat187 = -local27 * local33 + local21 * local47;
		this.aFloat183 = -((float) arg2 * this.aFloat188) + (float) -arg0 * this.aFloat180 - (float) arg1 * this.aFloat182;
		this.aFloat185 = -((float) arg1 * this.aFloat177) + (float) -arg0 * this.aFloat181 - (float) arg2 * this.aFloat187;
		this.aFloat186 = (float) -arg0 * this.aFloat178 - this.aFloat184 * (float) arg1 - this.aFloat179 * (float) arg2;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!eh;B)V")
	public void method8404(@OriginalArg(0) Class56 arg0) {
		@Pc(6) Class56_Sub3 local6 = (Class56_Sub3) arg0;
		this.aFloat181 = local6.aFloat181;
		this.aFloat187 = local6.aFloat180;
		this.aFloat177 = local6.aFloat178;
		this.aFloat179 = local6.aFloat182;
		this.aFloat180 = local6.aFloat187;
		this.aFloat184 = local6.aFloat184;
		this.aFloat178 = local6.aFloat177;
		this.aFloat182 = local6.aFloat179;
		this.aFloat185 = -(local6.aFloat183 * this.aFloat187 + local6.aFloat185 * this.aFloat181 + this.aFloat177 * local6.aFloat186);
		this.aFloat188 = local6.aFloat188;
		this.aFloat186 = -(this.aFloat179 * local6.aFloat183 + this.aFloat184 * local6.aFloat186 + local6.aFloat185 * this.aFloat178);
		this.aFloat183 = -(local6.aFloat183 * this.aFloat188 + this.aFloat182 * local6.aFloat186 + local6.aFloat185 * this.aFloat180);
	}

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat185);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat183);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat186);
		arg3[1] = (int) ((float) local6 * this.aFloat177 + this.aFloat184 * (float) local24 + this.aFloat182 * (float) local17);
		arg3[0] = (int) (this.aFloat180 * (float) local17 + this.aFloat178 * (float) local24 + (float) local6 * this.aFloat181);
		arg3[2] = (int) ((float) local17 * this.aFloat188 + this.aFloat179 * (float) local24 + (float) local6 * this.aFloat187);
	}

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "()V")
	@Override
	public void method8400() {
		this.aFloat178 = this.aFloat180 = this.aFloat177 = this.aFloat182 = this.aFloat187 = this.aFloat179 = this.aFloat185 = this.aFloat186 = this.aFloat183 = 0.0F;
		this.aFloat181 = this.aFloat184 = this.aFloat188 = 1.0F;
	}

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "(I)V")
	@Override
	public void method8386(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub12.aFloatArray48[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub12.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat181;
		@Pc(21) float local21 = this.aFloat177;
		@Pc(24) float local24 = this.aFloat187;
		this.aFloat181 = local18 * local9 + local15 * this.aFloat180;
		@Pc(37) float local37 = this.aFloat185;
		this.aFloat180 = local9 * this.aFloat180 - local18 * local15;
		this.aFloat177 = local15 * this.aFloat182 + local21 * local9;
		this.aFloat187 = this.aFloat188 * local15 + local9 * local24;
		this.aFloat182 = local9 * this.aFloat182 - local15 * local21;
		this.aFloat185 = local37 * local9 + local15 * this.aFloat183;
		this.aFloat188 = local9 * this.aFloat188 - local15 * local24;
		this.aFloat183 = local9 * this.aFloat183 - local37 * local15;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(BFIIIFF)V")
	public void method8406(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg2 == 0) {
			this.aFloat184 = (float) arg1;
			this.aFloat178 = this.aFloat180 = this.aFloat177 = this.aFloat182 = this.aFloat187 = this.aFloat179 = 0.0F;
			this.aFloat181 = (float) arg3;
			this.aFloat188 = 1.0F;
		} else {
			@Pc(38) float local38 = Class2_Sub12.aFloatArray48[arg2 & 0x3FFF];
			@Pc(44) float local44 = Class2_Sub12.aFloatArray49[arg2 & 0x3FFF];
			this.aFloat177 = (float) arg1 * -local44;
			this.aFloat178 = local44 * (float) arg3;
			this.aFloat188 = 1.0F;
			this.aFloat180 = this.aFloat182 = this.aFloat187 = this.aFloat179 = 0.0F;
			this.aFloat181 = (float) arg3 * local38;
			this.aFloat184 = (float) arg1 * local38;
		}
		this.aFloat186 = arg5;
		this.aFloat185 = arg4;
		this.aFloat183 = arg0;
	}

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat187 + (float) arg0 * this.aFloat181 + (float) arg1 * this.aFloat177);
		arg3[1] = (int) (this.aFloat179 * (float) arg2 + this.aFloat184 * (float) arg1 + (float) arg0 * this.aFloat178);
		arg3[2] = (int) (this.aFloat182 * (float) arg1 + this.aFloat180 * (float) arg0 + this.aFloat188 * (float) arg2);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat185 + (float) arg1 * this.aFloat177 + (float) arg0 * this.aFloat181 + this.aFloat187 * (float) arg2);
		arg3[1] = (int) (this.aFloat186 + (float) arg0 * this.aFloat178 + (float) arg1 * this.aFloat184 + this.aFloat179 * (float) arg2);
		arg3[2] = (int) (this.aFloat183 + (float) arg2 * this.aFloat188 + this.aFloat180 * (float) arg0 + (float) arg1 * this.aFloat182);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(FBFF[FF)V")
	public void method8407(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4) {
		arg3[2] = this.aFloat182 * arg0 + this.aFloat180 * arg2 + this.aFloat188 * arg1;
		arg3[0] = arg1 * this.aFloat187 + this.aFloat181 * arg2 + arg0 * this.aFloat177;
		@Pc(80) float local80;
		@Pc(88) float local88;
		@Pc(72) float local72;
		@Pc(64) float local64;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local64 = -arg4 / arg2;
			local80 = local64 * this.aFloat181 + this.aFloat185;
			local88 = this.aFloat186 + local64 * this.aFloat178;
			local72 = this.aFloat183 + this.aFloat180 * local64;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local64 = -arg4 / arg0;
			local72 = this.aFloat183 + local64 * this.aFloat182;
			local88 = this.aFloat184 * local64 + this.aFloat186;
			local80 = this.aFloat185 + local64 * this.aFloat177;
		} else {
			local64 = -arg4 / arg1;
			local72 = this.aFloat183 + local64 * this.aFloat188;
			local80 = this.aFloat185 + this.aFloat187 * local64;
			local88 = this.aFloat186 + local64 * this.aFloat179;
		}
		arg3[1] = arg1 * this.aFloat179 + arg0 * this.aFloat184 + this.aFloat178 * arg2;
		arg3[3] = -(local72 * arg3[2] + local80 * arg3[0] + arg3[1] * local88);
	}

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "(B)V")
	public void method8408() {
		this.aFloat186 = -this.aFloat186;
		this.aFloat184 = -this.aFloat184;
		this.aFloat179 = -this.aFloat179;
		this.aFloat178 = -this.aFloat178;
		this.aFloat182 = -this.aFloat182;
		this.aFloat183 = -this.aFloat183;
		this.aFloat180 = -this.aFloat180;
		this.aFloat188 = -this.aFloat188;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!eh;)V")
	@Override
	public void method8393(@OriginalArg(0) Class56 arg0) {
		@Pc(6) Class56_Sub3 local6 = (Class56_Sub3) arg0;
		this.aFloat184 = local6.aFloat184;
		this.aFloat180 = local6.aFloat180;
		this.aFloat188 = local6.aFloat188;
		this.aFloat185 = local6.aFloat185;
		this.aFloat177 = local6.aFloat177;
		this.aFloat182 = local6.aFloat182;
		this.aFloat186 = local6.aFloat186;
		this.aFloat179 = local6.aFloat179;
		this.aFloat181 = local6.aFloat181;
		this.aFloat178 = local6.aFloat178;
		this.aFloat183 = local6.aFloat183;
		this.aFloat187 = local6.aFloat187;
	}

	@OriginalMember(owner = "client!vha", name = "j", descriptor = "(I)[F")
	public float[] method8409() {
		Static443.aFloatArray62[9] = this.aFloat179;
		Static443.aFloatArray62[0] = this.aFloat181;
		Static443.aFloatArray62[12] = this.aFloat185;
		Static443.aFloatArray62[10] = this.aFloat188;
		Static443.aFloatArray62[5] = this.aFloat184;
		Static443.aFloatArray62[13] = this.aFloat186;
		Static443.aFloatArray62[4] = this.aFloat177;
		Static443.aFloatArray62[6] = this.aFloat182;
		Static443.aFloatArray62[14] = this.aFloat183;
		Static443.aFloatArray62[2] = this.aFloat180;
		Static443.aFloatArray62[8] = this.aFloat187;
		Static443.aFloatArray62[1] = this.aFloat178;
		return Static443.aFloatArray62;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "([I)V")
	@Override
	public void method8383(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat185;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat186;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat183;
		arg0[0] = (int) (this.aFloat180 * local28 + local20 * this.aFloat178 + local11 * this.aFloat181);
		arg0[2] = (int) (this.aFloat188 * local28 + local20 * this.aFloat179 + local11 * this.aFloat187);
		arg0[1] = (int) (local28 * this.aFloat182 + local20 * this.aFloat184 + local11 * this.aFloat177);
	}
}
