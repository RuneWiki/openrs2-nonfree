import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "F")
	public float aFloat182;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!tu", name = "x", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!tu", name = "A", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!tu", name = "E", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!tu", name = "F", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!tu", name = "I", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!tu", name = "K", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!tu", name = "M", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!tu", name = "N", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	public Class31_Sub3() {
		this.method7926();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "()V")
	@Override
	public void method7926() {
		this.aFloat186 = this.aFloat184 = this.aFloat182 = 1.0F;
		this.aFloat180 = this.aFloat185 = this.aFloat190 = this.aFloat181 = this.aFloat187 = this.aFloat191 = this.aFloat189 = this.aFloat183 = this.aFloat188 = 0.0F;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method7931() {
		@Pc(7) Class31_Sub3 local7 = new Class31_Sub3();
		local7.aFloat190 = this.aFloat190;
		local7.aFloat184 = this.aFloat184;
		local7.aFloat185 = this.aFloat185;
		local7.aFloat183 = this.aFloat183;
		local7.aFloat180 = this.aFloat180;
		local7.aFloat188 = this.aFloat188;
		local7.aFloat182 = this.aFloat182;
		local7.aFloat189 = this.aFloat189;
		local7.aFloat186 = this.aFloat186;
		local7.aFloat181 = this.aFloat181;
		local7.aFloat191 = this.aFloat191;
		local7.aFloat187 = this.aFloat187;
		return local7;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0) {
		this.aFloat182 = 1.0F;
		this.aFloat186 = this.aFloat184 = Class63.aFloatArray91[arg0 & 0x3FFF];
		this.aFloat180 = Class63.aFloatArray90[arg0 & 0x3FFF];
		this.aFloat187 = this.aFloat189 = this.aFloat191 = this.aFloat183 = this.aFloat185 = this.aFloat181 = this.aFloat188 = 0.0F;
		this.aFloat190 = -this.aFloat180;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat183);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat188);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat189);
		arg3[1] = (int) (this.aFloat184 * (float) local6 + this.aFloat190 * (float) local24 + (float) local13 * this.aFloat181);
		arg3[2] = (int) (this.aFloat187 * (float) local24 + (float) local6 * this.aFloat191 + (float) local13 * this.aFloat182);
		arg3[0] = (int) ((float) local13 * this.aFloat185 + this.aFloat186 * (float) local24 + this.aFloat180 * (float) local6);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
	public void method7938() {
		this.aFloat182 = -this.aFloat182;
		this.aFloat183 = -this.aFloat183;
		this.aFloat185 = -this.aFloat185;
		this.aFloat191 = -this.aFloat191;
		this.aFloat188 = -this.aFloat188;
		this.aFloat184 = -this.aFloat184;
		this.aFloat181 = -this.aFloat181;
		this.aFloat180 = -this.aFloat180;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class63.aFloatArray91[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class63.aFloatArray90[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class63.aFloatArray91[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class63.aFloatArray90[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class63.aFloatArray91[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class63.aFloatArray90[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat184 = local9 * local33;
		this.aFloat191 = local39 * local27 + local43 * local21;
		this.aFloat190 = local9 * local39;
		this.aFloat182 = local9 * local21;
		this.aFloat181 = -local15;
		this.aFloat180 = -local21 * local39 + local43 * local27;
		this.aFloat187 = -local27 * local33 + local47 * local21;
		this.aFloat185 = local27 * local9;
		this.aFloat186 = local27 * local47 + local33 * local21;
		this.aFloat188 = -(this.aFloat181 * (float) arg1) + this.aFloat185 * (float) -arg0 - this.aFloat182 * (float) arg2;
		this.aFloat183 = -((float) arg1 * this.aFloat184) + (float) -arg0 * this.aFloat180 - this.aFloat191 * (float) arg2;
		this.aFloat189 = -(this.aFloat187 * (float) arg2) - (float) arg1 * this.aFloat190 + this.aFloat186 * (float) -arg0;
	}

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "(I)V")
	@Override
	public void method7933(@OriginalArg(0) int arg0) {
		this.aFloat184 = 1.0F;
		this.aFloat186 = this.aFloat182 = Class63.aFloatArray91[arg0 & 0x3FFF];
		this.aFloat187 = Class63.aFloatArray90[arg0 & 0x3FFF];
		this.aFloat190 = this.aFloat189 = this.aFloat180 = this.aFloat191 = this.aFloat183 = this.aFloat181 = this.aFloat188 = 0.0F;
		this.aFloat185 = -this.aFloat187;
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat182 + this.aFloat185 * (float) arg0 + (float) arg1 * this.aFloat181);
		arg3[0] = (int) (this.aFloat190 * (float) arg1 + (float) arg0 * this.aFloat186 + this.aFloat187 * (float) arg2);
		arg3[1] = (int) ((float) arg1 * this.aFloat184 + this.aFloat180 * (float) arg0 + (float) arg2 * this.aFloat191);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V")
	@Override
	public void method7921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat188 = (float) arg2;
		this.aFloat189 = (float) arg0;
		this.aFloat180 = this.aFloat185 = this.aFloat190 = this.aFloat181 = this.aFloat187 = this.aFloat191 = 0.0F;
		this.aFloat186 = this.aFloat184 = this.aFloat182 = 1.0F;
		this.aFloat183 = (float) arg1;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat187 + (float) arg0 * this.aFloat186 + this.aFloat190 * (float) arg1 + this.aFloat189);
		arg3[1] = (int) (this.aFloat191 * (float) arg2 + (float) arg0 * this.aFloat180 + this.aFloat184 * (float) arg1 + this.aFloat183);
		arg3[2] = (int) (this.aFloat181 * (float) arg1 + (float) arg0 * this.aFloat185 + (float) arg2 * this.aFloat182 + this.aFloat188);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "([I)V")
	@Override
	public void method7928(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat189;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat183;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat188;
		arg0[2] = (int) (this.aFloat191 * local21 + this.aFloat187 * local12 + this.aFloat182 * local29);
		arg0[0] = (int) (this.aFloat185 * local29 + local21 * this.aFloat180 + this.aFloat186 * local12);
		arg0[1] = (int) (local12 * this.aFloat190 + local21 * this.aFloat184 + local29 * this.aFloat181);
	}

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "(I)V")
	@Override
	public void method7936(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class63.aFloatArray91[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class63.aFloatArray90[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat180;
		@Pc(21) float local21 = this.aFloat184;
		@Pc(24) float local24 = this.aFloat191;
		@Pc(27) float local27 = this.aFloat183;
		this.aFloat180 = local18 * local9 - local15 * this.aFloat185;
		this.aFloat184 = local9 * local21 - local15 * this.aFloat181;
		this.aFloat185 = this.aFloat185 * local9 + local15 * local18;
		this.aFloat191 = local24 * local9 - local15 * this.aFloat182;
		this.aFloat181 = local9 * this.aFloat181 + local15 * local21;
		this.aFloat182 = local15 * local24 + this.aFloat182 * local9;
		this.aFloat183 = local27 * local9 - this.aFloat188 * local15;
		this.aFloat188 = this.aFloat188 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "(I)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0) {
		this.aFloat186 = 1.0F;
		this.aFloat184 = this.aFloat182 = Class63.aFloatArray91[arg0 & 0x3FFF];
		this.aFloat181 = Class63.aFloatArray90[arg0 & 0x3FFF];
		this.aFloat190 = this.aFloat187 = this.aFloat189 = this.aFloat180 = this.aFloat183 = this.aFloat185 = this.aFloat188 = 0.0F;
		this.aFloat191 = -this.aFloat181;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(FFIFF[F)V")
	public void method7941(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[2] = arg3 * this.aFloat181 + this.aFloat185 * arg1 + this.aFloat182 * arg0;
		arg4[1] = arg1 * this.aFloat180 + this.aFloat184 * arg3 + this.aFloat191 * arg0;
		@Pc(60) float local60;
		@Pc(68) float local68;
		@Pc(76) float local76;
		@Pc(52) float local52;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local52 = -arg2 / arg1;
			local60 = local52 * this.aFloat186 + this.aFloat189;
			local68 = local52 * this.aFloat180 + this.aFloat183;
			local76 = this.aFloat188 + local52 * this.aFloat185;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local52 = -arg2 / arg3;
			local60 = local52 * this.aFloat190 + this.aFloat189;
			local76 = local52 * this.aFloat181 + this.aFloat188;
			local68 = this.aFloat184 * local52 + this.aFloat183;
		} else {
			local52 = -arg2 / arg0;
			local76 = local52 * this.aFloat182 + this.aFloat188;
			local68 = this.aFloat183 + this.aFloat191 * local52;
			local60 = local52 * this.aFloat187 + this.aFloat189;
		}
		arg4[0] = this.aFloat190 * arg3 + arg1 * this.aFloat186 + arg0 * this.aFloat187;
		arg4[3] = -(local68 * arg4[1] + local60 * arg4[0] + arg4[2] * local76);
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "(I)[F")
	public float[] method7942() {
		Static431.aFloatArray79[4] = this.aFloat190;
		Static431.aFloatArray79[2] = this.aFloat185;
		Static431.aFloatArray79[12] = this.aFloat189;
		Static431.aFloatArray79[5] = this.aFloat184;
		Static431.aFloatArray79[8] = this.aFloat187;
		Static431.aFloatArray79[0] = this.aFloat186;
		Static431.aFloatArray79[13] = this.aFloat183;
		Static431.aFloatArray79[1] = this.aFloat180;
		Static431.aFloatArray79[10] = this.aFloat182;
		Static431.aFloatArray79[6] = this.aFloat181;
		Static431.aFloatArray79[14] = this.aFloat188;
		Static431.aFloatArray79[9] = this.aFloat191;
		return Static431.aFloatArray79;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public void method7934(@OriginalArg(0) Class31 arg0) {
		@Pc(6) Class31_Sub3 local6 = (Class31_Sub3) arg0;
		this.aFloat189 = local6.aFloat189;
		this.aFloat184 = local6.aFloat184;
		this.aFloat180 = local6.aFloat180;
		this.aFloat188 = local6.aFloat188;
		this.aFloat183 = local6.aFloat183;
		this.aFloat190 = local6.aFloat190;
		this.aFloat191 = local6.aFloat191;
		this.aFloat182 = local6.aFloat182;
		this.aFloat187 = local6.aFloat187;
		this.aFloat186 = local6.aFloat186;
		this.aFloat185 = local6.aFloat185;
		this.aFloat181 = local6.aFloat181;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ih;I)V")
	public void method7943(@OriginalArg(0) Class31 arg0) {
		@Pc(6) Class31_Sub3 local6 = (Class31_Sub3) arg0;
		this.aFloat186 = local6.aFloat186;
		this.aFloat187 = local6.aFloat185;
		this.aFloat190 = local6.aFloat180;
		this.aFloat180 = local6.aFloat190;
		this.aFloat185 = local6.aFloat187;
		this.aFloat191 = local6.aFloat181;
		this.aFloat184 = local6.aFloat184;
		this.aFloat181 = local6.aFloat191;
		this.aFloat182 = local6.aFloat182;
		this.aFloat189 = -(local6.aFloat183 * this.aFloat190 + this.aFloat186 * local6.aFloat189 + local6.aFloat188 * this.aFloat187);
		this.aFloat183 = -(this.aFloat184 * local6.aFloat183 + this.aFloat180 * local6.aFloat189 + this.aFloat191 * local6.aFloat188);
		this.aFloat188 = -(this.aFloat181 * local6.aFloat183 + local6.aFloat189 * this.aFloat185 + this.aFloat182 * local6.aFloat188);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	@Override
	public void method7924(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class63.aFloatArray91[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class63.aFloatArray90[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat186;
		@Pc(21) float local21 = this.aFloat190;
		@Pc(24) float local24 = this.aFloat187;
		this.aFloat186 = this.aFloat185 * local15 + local9 * local18;
		@Pc(37) float local37 = this.aFloat189;
		this.aFloat190 = local15 * this.aFloat181 + local9 * local21;
		this.aFloat185 = local9 * this.aFloat185 - local18 * local15;
		this.aFloat187 = local15 * this.aFloat182 + local24 * local9;
		this.aFloat181 = this.aFloat181 * local9 - local21 * local15;
		this.aFloat182 = this.aFloat182 * local9 - local24 * local15;
		this.aFloat189 = this.aFloat188 * local15 + local9 * local37;
		this.aFloat188 = local9 * this.aFloat188 - local15 * local37;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(III)V")
	@Override
	public void method7930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat189 += (float) arg0;
		this.aFloat188 += (float) arg2;
		this.aFloat183 += (float) arg1;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(FBFIFII)V")
	public void method7944(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == 0) {
			this.aFloat186 = (float) arg5;
			this.aFloat180 = this.aFloat185 = this.aFloat190 = this.aFloat181 = this.aFloat187 = this.aFloat191 = 0.0F;
			this.aFloat182 = 1.0F;
			this.aFloat184 = (float) arg2;
		} else {
			@Pc(38) float local38 = Class63.aFloatArray91[arg4 & 0x3FFF];
			@Pc(44) float local44 = Class63.aFloatArray90[arg4 & 0x3FFF];
			this.aFloat185 = this.aFloat181 = this.aFloat187 = this.aFloat191 = 0.0F;
			this.aFloat180 = (float) arg5 * local44;
			this.aFloat190 = -local44 * (float) arg2;
			this.aFloat186 = (float) arg5 * local38;
			this.aFloat182 = 1.0F;
			this.aFloat184 = local38 * (float) arg2;
		}
		this.aFloat188 = arg1;
		this.aFloat183 = arg3;
		this.aFloat189 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
	@Override
	public void method7927(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class63.aFloatArray91[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class63.aFloatArray90[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat186;
		@Pc(21) float local21 = this.aFloat190;
		@Pc(24) float local24 = this.aFloat187;
		@Pc(27) float local27 = this.aFloat189;
		this.aFloat186 = local18 * local9 - local15 * this.aFloat180;
		this.aFloat190 = local21 * local9 - this.aFloat184 * local15;
		this.aFloat180 = local9 * this.aFloat180 + local15 * local18;
		this.aFloat184 = local15 * local21 + this.aFloat184 * local9;
		this.aFloat187 = local24 * local9 - this.aFloat191 * local15;
		this.aFloat189 = local9 * local27 - local15 * this.aFloat183;
		this.aFloat191 = local15 * local24 + local9 * this.aFloat191;
		this.aFloat183 = local27 * local15 + local9 * this.aFloat183;
	}

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "(I)[F")
	public float[] method7945() {
		Static431.aFloatArray79[1] = this.aFloat180;
		Static431.aFloatArray79[5] = this.aFloat184;
		Static431.aFloatArray79[8] = this.aFloat187;
		Static431.aFloatArray79[13] = 0.0F;
		Static431.aFloatArray79[6] = this.aFloat181;
		Static431.aFloatArray79[0] = this.aFloat186;
		Static431.aFloatArray79[14] = 0.0F;
		Static431.aFloatArray79[10] = this.aFloat182;
		Static431.aFloatArray79[9] = this.aFloat191;
		Static431.aFloatArray79[12] = 0.0F;
		Static431.aFloatArray79[2] = this.aFloat185;
		Static431.aFloatArray79[4] = this.aFloat190;
		return Static431.aFloatArray79;
	}
}
