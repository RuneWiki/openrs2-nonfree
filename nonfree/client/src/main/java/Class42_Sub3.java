import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class42_Sub3 extends Class42 {

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "F")
	public float aFloat213;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "F")
	public float aFloat214;

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "F")
	public float aFloat215;

	@OriginalMember(owner = "client!ur", name = "o", descriptor = "F")
	public float aFloat216;

	@OriginalMember(owner = "client!ur", name = "v", descriptor = "F")
	public float aFloat217;

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "F")
	public float aFloat218;

	@OriginalMember(owner = "client!ur", name = "C", descriptor = "F")
	public float aFloat219;

	@OriginalMember(owner = "client!ur", name = "E", descriptor = "F")
	public float aFloat220;

	@OriginalMember(owner = "client!ur", name = "G", descriptor = "F")
	public float aFloat221;

	@OriginalMember(owner = "client!ur", name = "O", descriptor = "F")
	public float aFloat222;

	@OriginalMember(owner = "client!ur", name = "S", descriptor = "F")
	public float aFloat223;

	@OriginalMember(owner = "client!ur", name = "T", descriptor = "F")
	public float aFloat224;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class42_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([FI)[F")
	public float[] method7520(@OriginalArg(0) float[] arg0) {
		arg0[6] = this.aFloat217;
		arg0[12] = this.aFloat220;
		arg0[1] = this.aFloat213;
		arg0[0] = this.aFloat221;
		arg0[7] = 0.0F;
		arg0[9] = this.aFloat214;
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat219;
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat222;
		arg0[4] = this.aFloat223;
		arg0[2] = this.aFloat218;
		arg0[5] = this.aFloat216;
		arg0[3] = 0.0F;
		arg0[14] = this.aFloat215;
		arg0[13] = this.aFloat224;
		return arg0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(FFFFFFFBFF)V")
	public void method7521(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat215 = 0.0F;
		this.aFloat218 = arg1;
		this.aFloat221 = arg5;
		this.aFloat220 = 0.0F;
		this.aFloat223 = arg3;
		this.aFloat217 = arg2;
		this.aFloat219 = arg4;
		this.aFloat222 = arg8;
		this.aFloat213 = arg7;
		this.aFloat224 = 0.0F;
		this.aFloat216 = arg6;
		this.aFloat214 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class350.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class350.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat221;
		@Pc(21) float local21 = this.aFloat223;
		@Pc(24) float local24 = this.aFloat219;
		@Pc(27) float local27 = this.aFloat220;
		this.aFloat221 = this.aFloat218 * local15 + local9 * local18;
		this.aFloat223 = local9 * local21 + this.aFloat217 * local15;
		this.aFloat218 = local9 * this.aFloat218 - local18 * local15;
		this.aFloat219 = local15 * this.aFloat222 + local9 * local24;
		this.aFloat217 = this.aFloat217 * local9 - local21 * local15;
		this.aFloat222 = this.aFloat222 * local9 - local24 * local15;
		this.aFloat220 = local27 * local9 + local15 * this.aFloat215;
		this.aFloat215 = local9 * this.aFloat215 - local15 * local27;
	}

	@OriginalMember(owner = "client!ur", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat224);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat215);
		@Pc(20) int local20 = (int) ((float) arg0 - this.aFloat220);
		arg3[1] = (int) (this.aFloat217 * (float) local13 + this.aFloat223 * (float) local20 + (float) local6 * this.aFloat216);
		arg3[0] = (int) ((float) local13 * this.aFloat218 + (float) local6 * this.aFloat213 + this.aFloat221 * (float) local20);
		arg3[2] = (int) (this.aFloat219 * (float) local20 + this.aFloat214 * (float) local6 + (float) local13 * this.aFloat222);
	}

	@OriginalMember(owner = "client!ur", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat216 = 1.0F;
		this.aFloat221 = this.aFloat222 = Class350.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat219 = Class350.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat218 = -this.aFloat219;
		this.aFloat223 = this.aFloat220 = this.aFloat213 = this.aFloat214 = this.aFloat224 = this.aFloat217 = this.aFloat215 = 0.0F;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(FIFF)V")
	public void method7522(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat220 += arg0;
		this.aFloat224 += arg2;
		this.aFloat215 += arg1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(FFF[FBF)V")
	public void method7523(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) float arg4) {
		arg3[0] = arg1 * this.aFloat219 + this.aFloat221 * arg0 + this.aFloat223 * arg4;
		arg3[2] = this.aFloat222 * arg1 + arg4 * this.aFloat217 + arg0 * this.aFloat218;
		arg3[1] = this.aFloat216 * arg4 + arg0 * this.aFloat213 + this.aFloat214 * arg1;
		@Pc(91) float local91;
		@Pc(99) float local99;
		@Pc(83) float local83;
		@Pc(75) float local75;
		if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local75 = -arg2 / arg0;
			local83 = this.aFloat218 * local75 + this.aFloat215;
			local91 = this.aFloat220 + local75 * this.aFloat221;
			local99 = this.aFloat213 * local75 + this.aFloat224;
		} else if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local75 = -arg2 / arg4;
			local83 = local75 * this.aFloat217 + this.aFloat215;
			local99 = this.aFloat224 + local75 * this.aFloat216;
			local91 = this.aFloat220 + local75 * this.aFloat223;
		} else {
			local75 = -arg2 / arg1;
			local99 = this.aFloat224 + local75 * this.aFloat214;
			local83 = this.aFloat215 + local75 * this.aFloat222;
			local91 = local75 * this.aFloat219 + this.aFloat220;
		}
		arg3[3] = -(arg3[1] * local99 + arg3[0] * local91 + local83 * arg3[2]);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(FFIF)V")
	public void method7524(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat224 = arg1;
		this.aFloat215 = arg0;
		this.aFloat221 = this.aFloat216 = this.aFloat222 = 1.0F;
		this.aFloat213 = this.aFloat218 = this.aFloat223 = this.aFloat217 = this.aFloat219 = this.aFloat214 = 0.0F;
		this.aFloat220 = arg2;
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V")
	public void method7525() {
		this.aFloat213 = -this.aFloat213;
		this.aFloat224 = -this.aFloat224;
		this.aFloat215 = -this.aFloat215;
		this.aFloat222 = -this.aFloat222;
		this.aFloat214 = -this.aFloat214;
		this.aFloat218 = -this.aFloat218;
		this.aFloat216 = -this.aFloat216;
		this.aFloat217 = -this.aFloat217;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class42 method7519() {
		@Pc(7) Class42_Sub3 local7 = new Class42_Sub3();
		local7.aFloat214 = this.aFloat214;
		local7.aFloat218 = this.aFloat218;
		local7.aFloat217 = this.aFloat217;
		local7.aFloat215 = this.aFloat215;
		local7.aFloat219 = this.aFloat219;
		local7.aFloat223 = this.aFloat223;
		local7.aFloat220 = this.aFloat220;
		local7.aFloat213 = this.aFloat213;
		local7.aFloat216 = this.aFloat216;
		local7.aFloat224 = this.aFloat224;
		local7.aFloat221 = this.aFloat221;
		local7.aFloat222 = this.aFloat222;
		return local7;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIFFFII)V")
	public void method7526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		if (arg0 == 0) {
			this.aFloat216 = arg5 * 2;
			this.aFloat221 = arg1 * 2;
			this.aFloat224 = arg4 - (float) arg5;
			this.aFloat222 = 1.0F;
			this.aFloat213 = this.aFloat218 = this.aFloat223 = this.aFloat217 = this.aFloat219 = this.aFloat214 = 0.0F;
			this.aFloat215 = arg3;
			this.aFloat220 = (float) -arg1 + arg2;
			return;
		}
		@Pc(14) float local14 = Class350.aFloatArray70[arg0 & 0x3FFF];
		@Pc(20) float local20 = Class350.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat215 = arg3;
		this.aFloat222 = 1.0F;
		this.aFloat213 = local20 * 2.0F * (float) arg1;
		this.aFloat224 = (float) (arg5 * 2) * (local20 * -0.5F - local14 * 0.5F) + arg4;
		this.aFloat223 = (float) arg5 * -2.0F * local20;
		this.aFloat218 = this.aFloat217 = this.aFloat219 = this.aFloat214 = 0.0F;
		this.aFloat220 = (local20 * 0.5F - local14 * 0.5F) * (float) (arg1 * 2) + arg2;
		this.aFloat221 = local14 * 2.0F * (float) arg1;
		this.aFloat216 = local14 * 2.0F * (float) arg5;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLclient!q;)V")
	public void method7527(@OriginalArg(1) Class42 arg0) {
		@Pc(6) Class42_Sub3 local6 = (Class42_Sub3) arg0;
		this.aFloat219 = local6.aFloat218;
		this.aFloat223 = local6.aFloat213;
		this.aFloat221 = local6.aFloat221;
		this.aFloat214 = local6.aFloat217;
		this.aFloat216 = local6.aFloat216;
		this.aFloat213 = local6.aFloat223;
		this.aFloat218 = local6.aFloat219;
		this.aFloat220 = -(this.aFloat219 * local6.aFloat215 + this.aFloat223 * local6.aFloat224 + this.aFloat221 * local6.aFloat220);
		this.aFloat217 = local6.aFloat214;
		this.aFloat222 = local6.aFloat222;
		this.aFloat224 = -(local6.aFloat220 * this.aFloat213 + local6.aFloat224 * this.aFloat216 + local6.aFloat215 * this.aFloat214);
		this.aFloat215 = -(local6.aFloat224 * this.aFloat217 + local6.aFloat220 * this.aFloat218 + this.aFloat222 * local6.aFloat215);
	}

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class42 arg0) {
		@Pc(6) Class42_Sub3 local6 = (Class42_Sub3) arg0;
		this.aFloat216 = local6.aFloat216;
		this.aFloat213 = local6.aFloat213;
		this.aFloat218 = local6.aFloat218;
		this.aFloat221 = local6.aFloat221;
		this.aFloat217 = local6.aFloat217;
		this.aFloat219 = local6.aFloat219;
		this.aFloat223 = local6.aFloat223;
		this.aFloat215 = local6.aFloat215;
		this.aFloat224 = local6.aFloat224;
		this.aFloat220 = local6.aFloat220;
		this.aFloat214 = local6.aFloat214;
		this.aFloat222 = local6.aFloat222;
	}

	@OriginalMember(owner = "client!ur", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat222 = 1.0F;
		this.aFloat221 = this.aFloat216 = Class350.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat213 = Class350.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat219 = this.aFloat220 = this.aFloat214 = this.aFloat224 = this.aFloat218 = this.aFloat217 = this.aFloat215 = 0.0F;
		this.aFloat223 = -this.aFloat213;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat214 * (float) arg2 + (float) arg0 * this.aFloat213 + (float) arg1 * this.aFloat216 + this.aFloat224);
		arg3[2] = (int) (this.aFloat222 * (float) arg2 + (float) arg1 * this.aFloat217 + this.aFloat218 * (float) arg0 + this.aFloat215);
		arg3[0] = (int) ((float) arg1 * this.aFloat223 + this.aFloat221 * (float) arg0 + this.aFloat219 * (float) arg2 + this.aFloat220);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(FFFI)V")
	public void method7528(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat217 *= arg1;
		this.aFloat213 *= arg2;
		this.aFloat214 *= arg2;
		this.aFloat223 *= arg0;
		this.aFloat216 *= arg2;
		this.aFloat222 *= arg1;
		this.aFloat221 *= arg0;
		this.aFloat218 *= arg1;
		this.aFloat220 *= arg0;
		this.aFloat215 *= arg1;
		this.aFloat224 *= arg2;
		this.aFloat219 *= arg0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([FZ)[F")
	public float[] method7529(@OriginalArg(0) float[] arg0) {
		arg0[10] = this.aFloat215;
		arg0[0] = this.aFloat221;
		arg0[5] = this.aFloat216;
		arg0[12] = 0.0F;
		arg0[6] = 0.0F;
		arg0[15] = 1.0F;
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat224;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat223;
		arg0[13] = 0.0F;
		arg0[1] = this.aFloat213;
		arg0[8] = this.aFloat220;
		arg0[3] = 0.0F;
		arg0[2] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "([FI)[F")
	public float[] method7530(@OriginalArg(0) float[] arg0) {
		arg0[14] = 0.0F;
		arg0[5] = this.aFloat216;
		arg0[4] = this.aFloat213;
		arg0[1] = this.aFloat223;
		arg0[3] = 0.0F;
		arg0[15] = 0.0F;
		arg0[0] = this.aFloat221;
		arg0[6] = this.aFloat214;
		arg0[7] = 0.0F;
		arg0[10] = this.aFloat222;
		arg0[8] = this.aFloat218;
		arg0[13] = 0.0F;
		arg0[11] = 0.0F;
		arg0[9] = this.aFloat217;
		arg0[2] = this.aFloat219;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ur", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class350.aFloatArray70[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class350.aFloatArray69[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class350.aFloatArray70[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class350.aFloatArray69[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class350.aFloatArray70[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class350.aFloatArray69[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat213 = local39 * -local21 + local43 * local27;
		this.aFloat214 = local43 * local21 + local27 * local39;
		this.aFloat216 = local33 * local9;
		this.aFloat223 = local39 * local9;
		this.aFloat218 = local9 * local27;
		this.aFloat219 = -local27 * local33 + local21 * local47;
		this.aFloat222 = local9 * local21;
		this.aFloat221 = local47 * local27 + local33 * local21;
		this.aFloat217 = -local15;
		this.aFloat215 = -(this.aFloat222 * (float) arg2) - (float) arg1 * this.aFloat217 + this.aFloat218 * (float) -arg0;
		this.aFloat220 = -((float) arg1 * this.aFloat223) + this.aFloat221 * (float) -arg0 - this.aFloat219 * (float) arg2;
		this.aFloat224 = -((float) arg2 * this.aFloat214) - (float) arg1 * this.aFloat216 + this.aFloat213 * (float) -arg0;
	}

	@OriginalMember(owner = "client!ur", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat224 += arg1;
		this.aFloat220 += arg0;
		this.aFloat215 += arg2;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(BLclient!q;)V")
	public void method7531(@OriginalArg(1) Class42 arg0) {
		@Pc(14) Class42_Sub3 local14 = (Class42_Sub3) arg0;
		this.aFloat216 = local14.aFloat216;
		this.aFloat223 = local14.aFloat223;
		this.aFloat215 = 0.0F;
		this.aFloat219 = local14.aFloat219;
		this.aFloat218 = local14.aFloat218;
		this.aFloat220 = 0.0F;
		this.aFloat221 = local14.aFloat221;
		this.aFloat222 = local14.aFloat222;
		this.aFloat213 = local14.aFloat213;
		this.aFloat214 = local14.aFloat214;
		this.aFloat217 = local14.aFloat217;
		this.aFloat224 = 0.0F;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(FFZF)V")
	public void method7532(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat224 = 0.0F;
		this.aFloat222 = arg2;
		this.aFloat219 = 0.0F;
		this.aFloat221 = arg0;
		this.aFloat213 = 0.0F;
		this.aFloat215 = 0.0F;
		this.aFloat223 = 0.0F;
		this.aFloat218 = 0.0F;
		this.aFloat217 = 0.0F;
		this.aFloat220 = 0.0F;
		this.aFloat214 = 0.0F;
		this.aFloat216 = arg1;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(FFIF)F")
	public float method7533(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * this.aFloat218 + arg1 * this.aFloat217 + arg0 * this.aFloat222 + this.aFloat215;
	}

	@OriginalMember(owner = "client!ur", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat222 + this.aFloat217 * (float) arg1 + this.aFloat218 * (float) arg0);
		arg3[0] = (int) ((float) arg2 * this.aFloat219 + this.aFloat223 * (float) arg1 + this.aFloat221 * (float) arg0);
		arg3[1] = (int) ((float) arg2 * this.aFloat214 + (float) arg1 * this.aFloat216 + this.aFloat213 * (float) arg0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method7534(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1) {
		@Pc(6) Class42_Sub3 local6 = (Class42_Sub3) arg0;
		@Pc(9) Class42_Sub3 local9 = (Class42_Sub3) arg1;
		this.aFloat221 = local6.aFloat223 * local9.aFloat213 + local9.aFloat221 * local6.aFloat221 + local6.aFloat219 * local9.aFloat218;
		this.aFloat213 = local6.aFloat213 * local9.aFloat221 + local6.aFloat216 * local9.aFloat213 + local9.aFloat218 * local6.aFloat214;
		this.aFloat218 = local9.aFloat218 * local6.aFloat222 + local6.aFloat218 * local9.aFloat221 + local9.aFloat213 * local6.aFloat217;
		this.aFloat223 = local6.aFloat219 * local9.aFloat217 + local9.aFloat216 * local6.aFloat223 + local6.aFloat221 * local9.aFloat223;
		this.aFloat216 = local6.aFloat214 * local9.aFloat217 + local9.aFloat223 * local6.aFloat213 + local9.aFloat216 * local6.aFloat216;
		this.aFloat219 = local9.aFloat214 * local6.aFloat223 + local6.aFloat221 * local9.aFloat219 + local6.aFloat219 * local9.aFloat222;
		this.aFloat217 = local9.aFloat217 * local6.aFloat222 + local6.aFloat218 * local9.aFloat223 + local9.aFloat216 * local6.aFloat217;
		this.aFloat214 = local9.aFloat222 * local6.aFloat214 + local6.aFloat216 * local9.aFloat214 + local6.aFloat213 * local9.aFloat219;
		this.aFloat222 = local6.aFloat217 * local9.aFloat214 + local9.aFloat219 * local6.aFloat218 + local9.aFloat222 * local6.aFloat222;
		this.aFloat220 = local6.aFloat220 + local6.aFloat221 * local9.aFloat220 + local6.aFloat223 * local9.aFloat224 + local6.aFloat219 * local9.aFloat215;
		this.aFloat224 = local9.aFloat220 * local6.aFloat213 + local6.aFloat216 * local9.aFloat224 + local6.aFloat214 * local9.aFloat215 + local6.aFloat224;
		this.aFloat215 = local6.aFloat215 + local6.aFloat222 * local9.aFloat215 + local6.aFloat217 * local9.aFloat224 + local9.aFloat220 * local6.aFloat218;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "([FI)[F")
	public float[] method7535(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat223;
		arg0[6] = this.aFloat214;
		arg0[0] = this.aFloat221;
		arg0[2] = this.aFloat219;
		arg0[5] = this.aFloat216;
		arg0[3] = this.aFloat220;
		arg0[7] = this.aFloat224;
		arg0[4] = this.aFloat213;
		return arg0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(FFFB)F")
	public float method7537(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat220 + arg0 * this.aFloat223 + arg2 * this.aFloat221 + arg1 * this.aFloat219;
	}

	@OriginalMember(owner = "client!ur", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat221 = 1.0F;
		this.aFloat216 = this.aFloat222 = Class350.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat217 = Class350.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat214 = -this.aFloat217;
		this.aFloat223 = this.aFloat219 = this.aFloat220 = this.aFloat213 = this.aFloat224 = this.aFloat218 = this.aFloat215 = 0.0F;
	}

	@OriginalMember(owner = "client!ur", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat224 = arg1;
		this.aFloat221 = this.aFloat216 = this.aFloat222 = 1.0F;
		this.aFloat213 = this.aFloat218 = this.aFloat223 = this.aFloat217 = this.aFloat219 = this.aFloat214 = 0.0F;
		this.aFloat215 = arg2;
		this.aFloat220 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat220;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat224;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat215;
		arg0[2] = (int) (local28 * this.aFloat222 + local20 * this.aFloat214 + local11 * this.aFloat219);
		arg0[0] = (int) (this.aFloat218 * local28 + local11 * this.aFloat221 + local20 * this.aFloat213);
		arg0[1] = (int) (local11 * this.aFloat223 + this.aFloat216 * local20 + this.aFloat217 * local28);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!q;)V")
	public void method7538(@OriginalArg(1) Class42 arg0) {
		@Pc(10) Class42_Sub3 local10 = (Class42_Sub3) arg0;
		@Pc(13) float local13 = this.aFloat221;
		@Pc(16) float local16 = this.aFloat213;
		@Pc(19) float local19 = this.aFloat223;
		@Pc(22) float local22 = this.aFloat216;
		@Pc(25) float local25 = this.aFloat219;
		@Pc(28) float local28 = this.aFloat214;
		@Pc(31) float local31 = this.aFloat220;
		@Pc(34) float local34 = this.aFloat224;
		this.aFloat213 = local10.aFloat213 * local13 + local10.aFloat216 * local16 + local10.aFloat214 * this.aFloat218;
		this.aFloat221 = this.aFloat218 * local10.aFloat219 + local10.aFloat223 * local16 + local13 * local10.aFloat221;
		this.aFloat216 = this.aFloat217 * local10.aFloat214 + local10.aFloat216 * local22 + local10.aFloat213 * local19;
		this.aFloat223 = local10.aFloat219 * this.aFloat217 + local10.aFloat221 * local19 + local22 * local10.aFloat223;
		this.aFloat218 = local10.aFloat218 * local13 + local16 * local10.aFloat217 + this.aFloat218 * local10.aFloat222;
		this.aFloat219 = local28 * local10.aFloat223 + local10.aFloat221 * local25 + this.aFloat222 * local10.aFloat219;
		this.aFloat217 = this.aFloat217 * local10.aFloat222 + local10.aFloat217 * local22 + local10.aFloat218 * local19;
		this.aFloat214 = local28 * local10.aFloat216 + local25 * local10.aFloat213 + local10.aFloat214 * this.aFloat222;
		this.aFloat222 = local10.aFloat222 * this.aFloat222 + local28 * local10.aFloat217 + local10.aFloat218 * local25;
		this.aFloat220 = local31 * local10.aFloat221 + local34 * local10.aFloat223 + this.aFloat215 * local10.aFloat219 + local10.aFloat220;
		this.aFloat224 = local10.aFloat214 * this.aFloat215 + local10.aFloat213 * local31 + local10.aFloat216 * local34 + local10.aFloat224;
		this.aFloat215 = this.aFloat215 * local10.aFloat222 + local10.aFloat217 * local34 + local31 * local10.aFloat218 + local10.aFloat215;
	}

	@OriginalMember(owner = "client!ur", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class350.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class350.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat221;
		@Pc(21) float local21 = this.aFloat223;
		@Pc(24) float local24 = this.aFloat219;
		this.aFloat221 = local9 * local18 - this.aFloat213 * local15;
		@Pc(37) float local37 = this.aFloat220;
		this.aFloat213 = local18 * local15 + local9 * this.aFloat213;
		this.aFloat223 = local21 * local9 - local15 * this.aFloat216;
		this.aFloat219 = local24 * local9 - local15 * this.aFloat214;
		this.aFloat216 = local9 * this.aFloat216 + local21 * local15;
		this.aFloat220 = local9 * local37 - local15 * this.aFloat224;
		this.aFloat214 = local15 * local24 + local9 * this.aFloat214;
		this.aFloat224 = this.aFloat224 * local9 + local37 * local15;
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "([FI)[F")
	public float[] method7540(@OriginalArg(0) float[] arg0) {
		arg0[9] = this.aFloat217;
		arg0[10] = this.aFloat222;
		arg0[13] = 0.0F;
		arg0[7] = this.aFloat224;
		arg0[0] = this.aFloat221;
		arg0[6] = this.aFloat214;
		arg0[4] = this.aFloat213;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat218;
		arg0[3] = this.aFloat220;
		arg0[11] = this.aFloat215;
		arg0[1] = this.aFloat223;
		arg0[15] = 1;
		arg0[2] = this.aFloat219;
		arg0[5] = this.aFloat216;
		arg0[14] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ur", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat221 = this.aFloat216 = this.aFloat222 = 1.0F;
		this.aFloat213 = this.aFloat218 = this.aFloat223 = this.aFloat217 = this.aFloat219 = this.aFloat214 = this.aFloat220 = this.aFloat224 = this.aFloat215 = 0.0F;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([FBFFF)V")
	public void method7541(@OriginalArg(0) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[0] = this.aFloat219 * arg3 + this.aFloat221 * arg2 + this.aFloat223 * arg1;
		arg0[2] = arg3 * this.aFloat222 + arg1 * this.aFloat217 + arg2 * this.aFloat218;
		arg0[1] = arg3 * this.aFloat214 + arg1 * this.aFloat216 + this.aFloat213 * arg2;
	}

	@OriginalMember(owner = "client!ur", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class350.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class350.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat213;
		@Pc(21) float local21 = this.aFloat216;
		@Pc(24) float local24 = this.aFloat214;
		@Pc(27) float local27 = this.aFloat224;
		this.aFloat213 = local9 * local18 - local15 * this.aFloat218;
		this.aFloat218 = local9 * this.aFloat218 + local15 * local18;
		this.aFloat216 = local21 * local9 - this.aFloat217 * local15;
		this.aFloat217 = this.aFloat217 * local9 + local21 * local15;
		this.aFloat214 = local9 * local24 - local15 * this.aFloat222;
		this.aFloat222 = local15 * local24 + this.aFloat222 * local9;
		this.aFloat224 = local27 * local9 - local15 * this.aFloat215;
		this.aFloat215 = this.aFloat215 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(FFBF)F")
	public float method7542(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat216 * arg0 + arg2 * this.aFloat213 + this.aFloat214 * arg1 + this.aFloat224;
	}
}
