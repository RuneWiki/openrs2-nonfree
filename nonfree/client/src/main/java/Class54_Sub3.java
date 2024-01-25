import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class54_Sub3 extends Class54 {

	@OriginalMember(owner = "client!of", name = "j", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!of", name = "C", descriptor = "F")
	public float aFloat147;

	@OriginalMember(owner = "client!of", name = "G", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!of", name = "K", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!of", name = "L", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!of", name = "Q", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!of", name = "X", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!of", name = "ab", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!of", name = "eb", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class54_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IFFFFFFFFF)V")
	public void method5446(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat147 = arg8;
		this.aFloat151 = arg2;
		this.aFloat149 = 0.0F;
		this.aFloat148 = arg7;
		this.aFloat145 = 0.0F;
		this.aFloat150 = arg3;
		this.aFloat153 = arg4;
		this.aFloat143 = arg6;
		this.aFloat152 = arg5;
		this.aFloat146 = arg0;
		this.aFloat144 = arg1;
		this.aFloat154 = 0.0F;
	}

	@OriginalMember(owner = "client!of", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat154 = arg2;
		this.aFloat149 = arg1;
		this.aFloat145 = arg0;
		this.aFloat144 = this.aFloat152 = this.aFloat148 = 1.0F;
		this.aFloat151 = this.aFloat146 = this.aFloat143 = this.aFloat150 = this.aFloat147 = this.aFloat153 = 0.0F;
	}

	@OriginalMember(owner = "client!of", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class54 arg0) {
		@Pc(6) Class54_Sub3 local6 = (Class54_Sub3) arg0;
		this.aFloat149 = local6.aFloat149;
		this.aFloat153 = local6.aFloat153;
		this.aFloat152 = local6.aFloat152;
		this.aFloat144 = local6.aFloat144;
		this.aFloat145 = local6.aFloat145;
		this.aFloat151 = local6.aFloat151;
		this.aFloat146 = local6.aFloat146;
		this.aFloat150 = local6.aFloat150;
		this.aFloat154 = local6.aFloat154;
		this.aFloat148 = local6.aFloat148;
		this.aFloat143 = local6.aFloat143;
		this.aFloat147 = local6.aFloat147;
	}

	@OriginalMember(owner = "client!of", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat154 += arg2;
		this.aFloat145 += arg0;
		this.aFloat149 += arg1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZFFF)F")
	public float method5447(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat149 + arg0 * this.aFloat151 + this.aFloat152 * arg1 + arg2 * this.aFloat153;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(FZF[FF)V")
	public void method5448(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3) {
		arg2[1] = arg0 * this.aFloat153 + arg1 * this.aFloat152 + this.aFloat151 * arg3;
		arg2[0] = arg0 * this.aFloat147 + this.aFloat143 * arg1 + this.aFloat144 * arg3;
		arg2[2] = arg1 * this.aFloat150 + this.aFloat146 * arg3 + this.aFloat148 * arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!q;)V")
	public void method5449(@OriginalArg(1) Class54 arg0) {
		@Pc(6) Class54_Sub3 local6 = (Class54_Sub3) arg0;
		this.aFloat144 = local6.aFloat144;
		this.aFloat150 = local6.aFloat150;
		this.aFloat154 = 0.0F;
		this.aFloat143 = local6.aFloat143;
		this.aFloat149 = 0.0F;
		this.aFloat145 = 0.0F;
		this.aFloat147 = local6.aFloat147;
		this.aFloat146 = local6.aFloat146;
		this.aFloat153 = local6.aFloat153;
		this.aFloat152 = local6.aFloat152;
		this.aFloat148 = local6.aFloat148;
		this.aFloat151 = local6.aFloat151;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IFIBFIF)V")
	public void method5451(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg2 == 0) {
			this.aFloat148 = 1.0F;
			this.aFloat144 = arg4 * 2;
			this.aFloat152 = arg0 * 2;
			this.aFloat154 = arg1;
			this.aFloat145 = (float) -arg4 + arg5;
			this.aFloat149 = arg3 - (float) arg0;
			this.aFloat151 = this.aFloat146 = this.aFloat143 = this.aFloat150 = this.aFloat147 = this.aFloat153 = 0.0F;
			return;
		}
		@Pc(11) float local11 = Class4_Sub5_Sub3.aFloatArray56[arg2 & 0x3FFF];
		@Pc(17) float local17 = Class4_Sub5_Sub3.aFloatArray57[arg2 & 0x3FFF];
		this.aFloat149 = arg3 + (float) (arg0 * 2) * (-0.5F * local17 - local11 * 0.5F);
		this.aFloat145 = (local17 * 0.5F - local11 * 0.5F) * (float) (arg4 * 2) + arg5;
		this.aFloat146 = this.aFloat150 = this.aFloat147 = this.aFloat153 = 0.0F;
		this.aFloat154 = arg1;
		this.aFloat143 = (float) arg0 * local17 * -2.0F;
		this.aFloat148 = 1.0F;
		this.aFloat152 = (float) arg0 * 2.0F * local11;
		this.aFloat144 = local11 * 2.0F * (float) arg4;
		this.aFloat151 = (float) arg4 * local17 * 2.0F;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(FFF[FFB)V")
	public void method5452(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float arg4) {
		@Pc(2) float local2 = -arg0;
		@Pc(10) float local10 = local2 * arg4;
		@Pc(14) float local14 = arg2 * local2;
		@Pc(18) float local18 = arg1 * local2;
		@Pc(36) float local36 = this.aFloat145 + local10 * this.aFloat144 + local14 * this.aFloat143 + local18 * this.aFloat147;
		@Pc(54) float local54 = this.aFloat149 + local10 * this.aFloat151 + this.aFloat152 * local14 + local18 * this.aFloat153;
		@Pc(79) float local79 = this.aFloat154 + local14 * this.aFloat150 + local10 * this.aFloat146 + local18 * this.aFloat148;
		arg3[1] = arg4 * this.aFloat151 + this.aFloat152 * arg2 + arg1 * this.aFloat153;
		arg3[2] = this.aFloat148 * arg1 + this.aFloat150 * arg2 + this.aFloat146 * arg4;
		arg3[0] = arg1 * this.aFloat147 + arg4 * this.aFloat144 + this.aFloat143 * arg2;
		arg3[3] = -(local54 * arg3[1] + local36 * arg3[0] + arg3[2] * local79);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(FFFB)V")
	public void method5453(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat143 *= arg2;
		this.aFloat145 *= arg2;
		this.aFloat146 *= arg0;
		this.aFloat150 *= arg0;
		this.aFloat153 *= arg1;
		this.aFloat154 *= arg0;
		this.aFloat149 *= arg1;
		this.aFloat144 *= arg2;
		this.aFloat147 *= arg2;
		this.aFloat152 *= arg1;
		this.aFloat151 *= arg1;
		this.aFloat148 *= arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class54 method7693() {
		@Pc(7) Class54_Sub3 local7 = new Class54_Sub3();
		local7.aFloat150 = this.aFloat150;
		local7.aFloat146 = this.aFloat146;
		local7.aFloat154 = this.aFloat154;
		local7.aFloat147 = this.aFloat147;
		local7.aFloat153 = this.aFloat153;
		local7.aFloat144 = this.aFloat144;
		local7.aFloat152 = this.aFloat152;
		local7.aFloat151 = this.aFloat151;
		local7.aFloat148 = this.aFloat148;
		local7.aFloat149 = this.aFloat149;
		local7.aFloat143 = this.aFloat143;
		local7.aFloat145 = this.aFloat145;
		return local7;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!q;)V")
	public void method5454(@OriginalArg(1) Class54 arg0) {
		@Pc(6) Class54_Sub3 local6 = (Class54_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat144;
		@Pc(12) float local12 = this.aFloat151;
		@Pc(15) float local15 = this.aFloat143;
		@Pc(18) float local18 = this.aFloat152;
		@Pc(21) float local21 = this.aFloat147;
		@Pc(24) float local24 = this.aFloat153;
		@Pc(27) float local27 = this.aFloat145;
		@Pc(33) float local33 = this.aFloat149;
		this.aFloat144 = local6.aFloat144 * local9 + local6.aFloat143 * local12 + local6.aFloat147 * this.aFloat146;
		this.aFloat151 = local6.aFloat152 * local12 + local6.aFloat151 * local9 + local6.aFloat153 * this.aFloat146;
		this.aFloat146 = local6.aFloat150 * local12 + local6.aFloat146 * local9 + local6.aFloat148 * this.aFloat146;
		this.aFloat143 = local18 * local6.aFloat143 + local15 * local6.aFloat144 + local6.aFloat147 * this.aFloat150;
		this.aFloat152 = this.aFloat150 * local6.aFloat153 + local18 * local6.aFloat152 + local15 * local6.aFloat151;
		this.aFloat147 = local6.aFloat143 * local24 + local21 * local6.aFloat144 + this.aFloat148 * local6.aFloat147;
		this.aFloat153 = local6.aFloat151 * local21 + local24 * local6.aFloat152 + this.aFloat148 * local6.aFloat153;
		this.aFloat150 = this.aFloat150 * local6.aFloat148 + local15 * local6.aFloat146 + local18 * local6.aFloat150;
		this.aFloat148 = this.aFloat148 * local6.aFloat148 + local6.aFloat146 * local21 + local6.aFloat150 * local24;
		this.aFloat149 = local6.aFloat152 * local33 + local6.aFloat151 * local27 + local6.aFloat153 * this.aFloat154 + local6.aFloat149;
		this.aFloat145 = this.aFloat154 * local6.aFloat147 + local6.aFloat143 * local33 + local27 * local6.aFloat144 + local6.aFloat145;
		this.aFloat154 = local6.aFloat154 + this.aFloat154 * local6.aFloat148 + local27 * local6.aFloat146 + local6.aFloat150 * local33;
	}

	@OriginalMember(owner = "client!of", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class4_Sub5_Sub3.aFloatArray56[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub5_Sub3.aFloatArray57[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class4_Sub5_Sub3.aFloatArray56[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class4_Sub5_Sub3.aFloatArray57[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class4_Sub5_Sub3.aFloatArray56[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class4_Sub5_Sub3.aFloatArray57[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat147 = local21 * local47 + local33 * -local27;
		this.aFloat152 = local9 * local33;
		this.aFloat148 = local21 * local9;
		this.aFloat144 = local21 * local33 + local47 * local27;
		this.aFloat150 = -local15;
		this.aFloat151 = local39 * -local21 + local27 * local43;
		this.aFloat153 = local27 * local39 + local43 * local21;
		this.aFloat143 = local9 * local39;
		this.aFloat146 = local9 * local27;
		this.aFloat154 = (float) -arg0 * this.aFloat146 - (float) arg1 * this.aFloat150 - this.aFloat148 * (float) arg2;
		this.aFloat145 = (float) -arg0 * this.aFloat144 - this.aFloat143 * (float) arg1 - (float) arg2 * this.aFloat147;
		this.aFloat149 = (float) -arg0 * this.aFloat151 - this.aFloat152 * (float) arg1 - this.aFloat153 * (float) arg2;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([FB)[F")
	public float[] method5455(@OriginalArg(0) float[] arg0) {
		arg0[12] = this.aFloat145;
		arg0[0] = this.aFloat144;
		arg0[6] = this.aFloat150;
		arg0[8] = this.aFloat147;
		arg0[10] = this.aFloat148;
		arg0[11] = 0.0F;
		arg0[1] = this.aFloat151;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[2] = this.aFloat146;
		arg0[14] = this.aFloat154;
		arg0[4] = this.aFloat143;
		arg0[15] = 1.0F;
		arg0[5] = this.aFloat152;
		arg0[13] = this.aFloat149;
		arg0[9] = this.aFloat153;
		return arg0;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "([FB)[F")
	public float[] method5456(@OriginalArg(0) float[] arg0) {
		arg0[14] = 0.0F;
		arg0[7] = this.aFloat149;
		arg0[4] = this.aFloat151;
		arg0[10] = this.aFloat148;
		arg0[5] = this.aFloat152;
		arg0[6] = this.aFloat153;
		arg0[12] = 0.0F;
		arg0[9] = this.aFloat150;
		arg0[8] = this.aFloat146;
		arg0[1] = this.aFloat143;
		arg0[3] = this.aFloat145;
		arg0[13] = 0.0F;
		arg0[15] = 1.0F;
		arg0[11] = this.aFloat154;
		arg0[2] = this.aFloat147;
		arg0[0] = this.aFloat144;
		return arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(FFBF)F")
	public float method5457(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat144 * arg0 + arg1 * this.aFloat143 + this.aFloat147 * arg2 + this.aFloat145;
	}

	@OriginalMember(owner = "client!of", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat144 = 1.0F;
		this.aFloat152 = this.aFloat148 = Class4_Sub5_Sub3.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat150 = Class4_Sub5_Sub3.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat153 = -this.aFloat150;
		this.aFloat143 = this.aFloat147 = this.aFloat145 = this.aFloat151 = this.aFloat149 = this.aFloat146 = this.aFloat154 = 0.0F;
	}

	@OriginalMember(owner = "client!of", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub5_Sub3.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub5_Sub3.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat151;
		@Pc(21) float local21 = this.aFloat152;
		@Pc(24) float local24 = this.aFloat153;
		@Pc(27) float local27 = this.aFloat149;
		this.aFloat151 = local9 * local18 - local15 * this.aFloat146;
		this.aFloat152 = local9 * local21 - this.aFloat150 * local15;
		this.aFloat146 = this.aFloat146 * local9 + local18 * local15;
		this.aFloat153 = local24 * local9 - local15 * this.aFloat148;
		this.aFloat150 = this.aFloat150 * local9 + local21 * local15;
		this.aFloat149 = local27 * local9 - local15 * this.aFloat154;
		this.aFloat148 = local15 * local24 + this.aFloat148 * local9;
		this.aFloat154 = local9 * this.aFloat154 + local15 * local27;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat145 + (float) arg0 * this.aFloat144 + this.aFloat143 * (float) arg1 + (float) arg2 * this.aFloat147);
		arg3[2] = (int) (this.aFloat150 * (float) arg1 + this.aFloat146 * (float) arg0 + this.aFloat148 * (float) arg2 + this.aFloat154);
		arg3[1] = (int) (this.aFloat149 + this.aFloat153 * (float) arg2 + (float) arg0 * this.aFloat151 + this.aFloat152 * (float) arg1);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(FIFF)V")
	public void method5458(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat149 += arg2;
		this.aFloat154 += arg1;
		this.aFloat145 += arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat152 = 1.0F;
		this.aFloat144 = this.aFloat148 = Class4_Sub5_Sub3.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat147 = Class4_Sub5_Sub3.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat143 = this.aFloat145 = this.aFloat151 = this.aFloat153 = this.aFloat149 = this.aFloat150 = this.aFloat154 = 0.0F;
		this.aFloat146 = -this.aFloat147;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(FFBF)V")
	public void method5459(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat151 = this.aFloat146 = this.aFloat143 = this.aFloat150 = this.aFloat147 = this.aFloat153 = 0.0F;
		this.aFloat149 = arg2;
		this.aFloat144 = this.aFloat152 = this.aFloat148 = 1.0F;
		this.aFloat154 = arg1;
		this.aFloat145 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([FI)[F")
	public float[] method5460(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat143;
		arg0[6] = this.aFloat153;
		arg0[4] = this.aFloat151;
		arg0[0] = this.aFloat144;
		arg0[3] = this.aFloat145;
		arg0[2] = this.aFloat147;
		arg0[7] = this.aFloat149;
		arg0[5] = this.aFloat152;
		return arg0;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
	public void method5461() {
		this.aFloat149 = -this.aFloat149;
		this.aFloat154 = -this.aFloat154;
		this.aFloat148 = -this.aFloat148;
		this.aFloat150 = -this.aFloat150;
		this.aFloat152 = -this.aFloat152;
		this.aFloat151 = -this.aFloat151;
		this.aFloat153 = -this.aFloat153;
		this.aFloat146 = -this.aFloat146;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(ZFFF)V")
	public void method5462(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat144 = arg0;
		this.aFloat151 = 0.0F;
		this.aFloat146 = 0.0F;
		this.aFloat152 = arg1;
		this.aFloat147 = 0.0F;
		this.aFloat154 = 0.0F;
		this.aFloat145 = 0.0F;
		this.aFloat143 = 0.0F;
		this.aFloat150 = 0.0F;
		this.aFloat148 = arg2;
		this.aFloat149 = 0.0F;
		this.aFloat153 = 0.0F;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IFFF)F")
	public float method5463(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat154 + this.aFloat150 * arg2 + arg0 * this.aFloat146 + arg1 * this.aFloat148;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I[F)[F")
	public float[] method5464(@OriginalArg(1) float[] arg0) {
		arg0[9] = this.aFloat149;
		arg0[15] = 1.0F;
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[4] = this.aFloat143;
		arg0[3] = 0.0F;
		arg0[14] = 0.0F;
		arg0[8] = this.aFloat145;
		arg0[11] = 0.0F;
		arg0[6] = 0.0F;
		arg0[2] = 0.0F;
		arg0[1] = this.aFloat151;
		arg0[5] = this.aFloat152;
		arg0[10] = this.aFloat154;
		arg0[0] = this.aFloat144;
		return arg0;
	}

	@OriginalMember(owner = "client!of", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat145;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat149;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat154;
		arg0[1] = (int) (this.aFloat150 * local28 + this.aFloat143 * local11 + this.aFloat152 * local19);
		arg0[0] = (int) (this.aFloat146 * local28 + this.aFloat151 * local19 + this.aFloat144 * local11);
		arg0[2] = (int) (this.aFloat148 * local28 + local11 * this.aFloat147 + this.aFloat153 * local19);
	}

	@OriginalMember(owner = "client!of", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat144 = this.aFloat152 = this.aFloat148 = 1.0F;
		this.aFloat151 = this.aFloat146 = this.aFloat143 = this.aFloat150 = this.aFloat147 = this.aFloat153 = this.aFloat145 = this.aFloat149 = this.aFloat154 = 0.0F;
	}

	@OriginalMember(owner = "client!of", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat148 = 1.0F;
		this.aFloat144 = this.aFloat152 = Class4_Sub5_Sub3.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat151 = Class4_Sub5_Sub3.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat143 = -this.aFloat151;
		this.aFloat147 = this.aFloat145 = this.aFloat153 = this.aFloat149 = this.aFloat146 = this.aFloat150 = this.aFloat154 = 0.0F;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLclient!q;)V")
	public void method5465(@OriginalArg(1) Class54 arg0) {
		@Pc(6) Class54_Sub3 local6 = (Class54_Sub3) arg0;
		this.aFloat143 = local6.aFloat151;
		this.aFloat144 = local6.aFloat144;
		this.aFloat147 = local6.aFloat146;
		this.aFloat146 = local6.aFloat147;
		this.aFloat152 = local6.aFloat152;
		this.aFloat153 = local6.aFloat150;
		this.aFloat151 = local6.aFloat143;
		this.aFloat145 = -(this.aFloat144 * local6.aFloat145 + local6.aFloat149 * this.aFloat143 + local6.aFloat154 * this.aFloat147);
		this.aFloat148 = local6.aFloat148;
		this.aFloat150 = local6.aFloat153;
		this.aFloat149 = -(local6.aFloat145 * this.aFloat151 + this.aFloat152 * local6.aFloat149 + this.aFloat153 * local6.aFloat154);
		this.aFloat154 = -(this.aFloat148 * local6.aFloat154 + local6.aFloat149 * this.aFloat150 + local6.aFloat145 * this.aFloat146);
	}

	@OriginalMember(owner = "client!of", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub5_Sub3.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub5_Sub3.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat144;
		@Pc(21) float local21 = this.aFloat143;
		@Pc(24) float local24 = this.aFloat147;
		this.aFloat144 = local15 * this.aFloat146 + local18 * local9;
		@Pc(37) float local37 = this.aFloat145;
		this.aFloat143 = this.aFloat150 * local15 + local21 * local9;
		this.aFloat146 = this.aFloat146 * local9 - local15 * local18;
		this.aFloat147 = local15 * this.aFloat148 + local9 * local24;
		this.aFloat150 = local9 * this.aFloat150 - local21 * local15;
		this.aFloat145 = local9 * local37 + this.aFloat154 * local15;
		this.aFloat148 = this.aFloat148 * local9 - local24 * local15;
		this.aFloat154 = local9 * this.aFloat154 - local15 * local37;
	}

	@OriginalMember(owner = "client!of", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat146 + (float) arg1 * this.aFloat150 + this.aFloat148 * (float) arg2);
		arg3[1] = (int) ((float) arg2 * this.aFloat153 + this.aFloat151 * (float) arg0 + (float) arg1 * this.aFloat152);
		arg3[0] = (int) (this.aFloat147 * (float) arg2 + this.aFloat143 * (float) arg1 + (float) arg0 * this.aFloat144);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method5467(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1) {
		@Pc(6) Class54_Sub3 local6 = (Class54_Sub3) arg0;
		@Pc(9) Class54_Sub3 local9 = (Class54_Sub3) arg1;
		this.aFloat144 = local6.aFloat144 * local9.aFloat144 + local6.aFloat143 * local9.aFloat151 + local9.aFloat146 * local6.aFloat147;
		this.aFloat151 = local9.aFloat151 * local6.aFloat152 + local6.aFloat151 * local9.aFloat144 + local9.aFloat146 * local6.aFloat153;
		this.aFloat143 = local9.aFloat150 * local6.aFloat147 + local6.aFloat143 * local9.aFloat152 + local9.aFloat143 * local6.aFloat144;
		this.aFloat146 = local9.aFloat144 * local6.aFloat146 + local6.aFloat150 * local9.aFloat151 + local9.aFloat146 * local6.aFloat148;
		this.aFloat152 = local9.aFloat150 * local6.aFloat153 + local6.aFloat151 * local9.aFloat143 + local9.aFloat152 * local6.aFloat152;
		this.aFloat150 = local6.aFloat146 * local9.aFloat143 + local9.aFloat152 * local6.aFloat150 + local9.aFloat150 * local6.aFloat148;
		this.aFloat147 = local6.aFloat147 * local9.aFloat148 + local9.aFloat147 * local6.aFloat144 + local6.aFloat143 * local9.aFloat153;
		this.aFloat153 = local9.aFloat148 * local6.aFloat153 + local9.aFloat147 * local6.aFloat151 + local6.aFloat152 * local9.aFloat153;
		this.aFloat148 = local6.aFloat148 * local9.aFloat148 + local9.aFloat153 * local6.aFloat150 + local6.aFloat146 * local9.aFloat147;
		this.aFloat145 = local6.aFloat144 * local9.aFloat145 + local6.aFloat143 * local9.aFloat149 + local6.aFloat147 * local9.aFloat154 + local6.aFloat145;
		this.aFloat149 = local6.aFloat149 + local9.aFloat149 * local6.aFloat152 + local6.aFloat151 * local9.aFloat145 + local9.aFloat154 * local6.aFloat153;
		this.aFloat154 = local9.aFloat154 * local6.aFloat148 + local9.aFloat145 * local6.aFloat146 + local9.aFloat149 * local6.aFloat150 + local6.aFloat154;
	}
}
