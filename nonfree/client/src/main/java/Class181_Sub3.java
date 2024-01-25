import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class181_Sub3 extends Class181 {

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!ol", name = "y", descriptor = "F")
	public float aFloat147;

	@OriginalMember(owner = "client!ol", name = "z", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!ol", name = "D", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!ol", name = "F", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!ol", name = "I", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!ol", name = "L", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "F")
	public float aFloat153;

	static {
		new Class188("", 73);
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class181_Sub3() {
		this.ha();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)[F")
	public float[] method5494() {
		Static236.aFloatArray21[9] = this.aFloat144;
		Static236.aFloatArray21[14] = this.aFloat150;
		Static236.aFloatArray21[8] = this.aFloat149;
		Static236.aFloatArray21[0] = this.aFloat146;
		Static236.aFloatArray21[5] = this.aFloat151;
		Static236.aFloatArray21[2] = this.aFloat147;
		Static236.aFloatArray21[12] = this.aFloat145;
		Static236.aFloatArray21[1] = this.aFloat142;
		Static236.aFloatArray21[13] = this.aFloat152;
		Static236.aFloatArray21[10] = this.aFloat148;
		Static236.aFloatArray21[4] = this.aFloat143;
		Static236.aFloatArray21[6] = this.aFloat153;
		return Static236.aFloatArray21;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat145 + (float) arg2 * this.aFloat149 + this.aFloat143 * (float) arg1 + (float) arg0 * this.aFloat146);
		arg3[2] = (int) (this.aFloat148 * (float) arg2 + this.aFloat147 * (float) arg0 + this.aFloat153 * (float) arg1 + this.aFloat150);
		arg3[1] = (int) (this.aFloat152 + (float) arg1 * this.aFloat151 + this.aFloat142 * (float) arg0 + this.aFloat144 * (float) arg2);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IFIIIFF)V")
	public void method5495(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg1 == 0) {
			this.aFloat148 = 1.0F;
			this.aFloat151 = arg3;
			this.aFloat142 = this.aFloat147 = this.aFloat143 = this.aFloat153 = this.aFloat149 = this.aFloat144 = 0.0F;
			this.aFloat146 = arg2;
		} else {
			@Pc(41) float local41 = Class96.aFloatArray16[arg1 & 0x3FFF];
			@Pc(47) float local47 = Class96.aFloatArray17[arg1 & 0x3FFF];
			this.aFloat142 = local47 * (float) arg2;
			this.aFloat147 = this.aFloat153 = this.aFloat149 = this.aFloat144 = 0.0F;
			this.aFloat146 = (float) arg2 * local41;
			this.aFloat148 = 1.0F;
			this.aFloat151 = local41 * (float) arg3;
			this.aFloat143 = (float) arg3 * -local47;
		}
		this.aFloat150 = arg0;
		this.aFloat152 = arg4;
		this.aFloat145 = arg5;
	}

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class96.aFloatArray16[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class96.aFloatArray17[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat142;
		@Pc(21) float local21 = this.aFloat151;
		@Pc(24) float local24 = this.aFloat144;
		@Pc(27) float local27 = this.aFloat152;
		this.aFloat142 = local18 * local9 - local15 * this.aFloat147;
		this.aFloat151 = local21 * local9 - this.aFloat153 * local15;
		this.aFloat147 = this.aFloat147 * local9 + local18 * local15;
		this.aFloat153 = this.aFloat153 * local9 + local15 * local21;
		this.aFloat144 = local9 * local24 - this.aFloat148 * local15;
		this.aFloat152 = local27 * local9 - this.aFloat150 * local15;
		this.aFloat148 = local24 * local15 + this.aFloat148 * local9;
		this.aFloat150 = local27 * local15 + this.aFloat150 * local9;
	}

	@OriginalMember(owner = "client!ol", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat146 = 1.0F;
		this.aFloat151 = this.aFloat148 = Class96.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat153 = Class96.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat143 = this.aFloat149 = this.aFloat145 = this.aFloat142 = this.aFloat152 = this.aFloat147 = this.aFloat150 = 0.0F;
		this.aFloat144 = -this.aFloat153;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!m;I)V")
	public void method5496(@OriginalArg(0) Class181 arg0) {
		@Pc(12) Class181_Sub3 local12 = (Class181_Sub3) arg0;
		this.aFloat143 = local12.aFloat142;
		this.aFloat149 = local12.aFloat147;
		this.aFloat146 = local12.aFloat146;
		this.aFloat151 = local12.aFloat151;
		this.aFloat144 = local12.aFloat153;
		this.aFloat142 = local12.aFloat143;
		this.aFloat147 = local12.aFloat149;
		this.aFloat153 = local12.aFloat144;
		this.aFloat145 = -(local12.aFloat145 * this.aFloat146 + this.aFloat143 * local12.aFloat152 + local12.aFloat150 * this.aFloat149);
		this.aFloat148 = local12.aFloat148;
		this.aFloat152 = -(local12.aFloat150 * this.aFloat144 + local12.aFloat152 * this.aFloat151 + this.aFloat142 * local12.aFloat145);
		this.aFloat150 = -(this.aFloat147 * local12.aFloat145 + this.aFloat153 * local12.aFloat152 + local12.aFloat150 * this.aFloat148);
	}

	@OriginalMember(owner = "client!ol", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat151 + (float) arg0 * this.aFloat142 + this.aFloat144 * (float) arg2);
		arg3[0] = (int) ((float) arg2 * this.aFloat149 + (float) arg1 * this.aFloat143 + this.aFloat146 * (float) arg0);
		arg3[2] = (int) (this.aFloat148 * (float) arg2 + this.aFloat147 * (float) arg0 + (float) arg1 * this.aFloat153);
	}

	@OriginalMember(owner = "client!ol", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat151 = 1.0F;
		this.aFloat146 = this.aFloat148 = Class96.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat149 = Class96.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat147 = -this.aFloat149;
		this.aFloat143 = this.aFloat145 = this.aFloat142 = this.aFloat144 = this.aFloat152 = this.aFloat153 = this.aFloat150 = 0.0F;
	}

	@OriginalMember(owner = "client!ol", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class96.aFloatArray16[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class96.aFloatArray17[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class96.aFloatArray16[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class96.aFloatArray17[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class96.aFloatArray16[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class96.aFloatArray17[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat142 = local39 * -local21 + local43 * local27;
		this.aFloat153 = -local15;
		this.aFloat146 = local21 * local33 + local47 * local27;
		this.aFloat144 = local43 * local21 + local39 * local27;
		this.aFloat149 = local21 * local47 + local33 * -local27;
		this.aFloat147 = local9 * local27;
		this.aFloat148 = local21 * local9;
		this.aFloat151 = local9 * local33;
		this.aFloat143 = local9 * local39;
		this.aFloat152 = -(this.aFloat144 * (float) arg2) + (float) -arg0 * this.aFloat142 - (float) arg1 * this.aFloat151;
		this.aFloat145 = (float) -arg0 * this.aFloat146 - (float) arg1 * this.aFloat143 - this.aFloat149 * (float) arg2;
		this.aFloat150 = -((float) arg1 * this.aFloat153) + this.aFloat147 * (float) -arg0 - (float) arg2 * this.aFloat148;
	}

	@OriginalMember(owner = "client!ol", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class96.aFloatArray16[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class96.aFloatArray17[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat146;
		@Pc(21) float local21 = this.aFloat143;
		@Pc(24) float local24 = this.aFloat149;
		@Pc(27) float local27 = this.aFloat145;
		this.aFloat146 = local18 * local9 + this.aFloat147 * local15;
		this.aFloat143 = local9 * local21 + this.aFloat153 * local15;
		this.aFloat147 = this.aFloat147 * local9 - local18 * local15;
		this.aFloat149 = local15 * this.aFloat148 + local9 * local24;
		this.aFloat153 = local9 * this.aFloat153 - local15 * local21;
		this.aFloat145 = local9 * local27 + this.aFloat150 * local15;
		this.aFloat148 = local9 * this.aFloat148 - local15 * local24;
		this.aFloat150 = local9 * this.aFloat150 - local27 * local15;
	}

	@OriginalMember(owner = "client!ol", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat145 += arg0;
		this.aFloat150 += arg2;
		this.aFloat152 += arg1;
	}

	@OriginalMember(owner = "client!ol", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat145;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat152;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat150;
		arg0[2] = (int) (local29 * this.aFloat148 + local20 * this.aFloat144 + local12 * this.aFloat149);
		arg0[0] = (int) (this.aFloat147 * local29 + local12 * this.aFloat146 + this.aFloat142 * local20);
		arg0[1] = (int) (this.aFloat153 * local29 + this.aFloat143 * local12 + this.aFloat151 * local20);
	}

	@OriginalMember(owner = "client!ol", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat148 = 1.0F;
		this.aFloat146 = this.aFloat151 = Class96.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat142 = Class96.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat149 = this.aFloat145 = this.aFloat144 = this.aFloat152 = this.aFloat147 = this.aFloat153 = this.aFloat150 = 0.0F;
		this.aFloat143 = -this.aFloat142;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class181 method5993() {
		@Pc(7) Class181_Sub3 local7 = new Class181_Sub3();
		local7.aFloat151 = this.aFloat151;
		local7.aFloat144 = this.aFloat144;
		local7.aFloat147 = this.aFloat147;
		local7.aFloat142 = this.aFloat142;
		local7.aFloat143 = this.aFloat143;
		local7.aFloat153 = this.aFloat153;
		local7.aFloat149 = this.aFloat149;
		local7.aFloat148 = this.aFloat148;
		local7.aFloat146 = this.aFloat146;
		local7.aFloat145 = this.aFloat145;
		local7.aFloat152 = this.aFloat152;
		local7.aFloat150 = this.aFloat150;
		return local7;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)[F")
	public float[] method5497() {
		Static236.aFloatArray21[8] = this.aFloat149;
		Static236.aFloatArray21[12] = 0.0F;
		Static236.aFloatArray21[0] = this.aFloat146;
		Static236.aFloatArray21[6] = this.aFloat153;
		Static236.aFloatArray21[5] = this.aFloat151;
		Static236.aFloatArray21[4] = this.aFloat143;
		Static236.aFloatArray21[13] = 0.0F;
		Static236.aFloatArray21[1] = this.aFloat142;
		Static236.aFloatArray21[2] = this.aFloat147;
		Static236.aFloatArray21[10] = this.aFloat148;
		Static236.aFloatArray21[14] = 0.0F;
		Static236.aFloatArray21[9] = this.aFloat144;
		return Static236.aFloatArray21;
	}

	@OriginalMember(owner = "client!ol", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat146 = this.aFloat151 = this.aFloat148 = 1.0F;
		this.aFloat142 = this.aFloat147 = this.aFloat143 = this.aFloat153 = this.aFloat149 = this.aFloat144 = this.aFloat145 = this.aFloat152 = this.aFloat150 = 0.0F;
	}

	@OriginalMember(owner = "client!ol", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat146 = this.aFloat151 = this.aFloat148 = 1.0F;
		this.aFloat152 = arg1;
		this.aFloat145 = arg0;
		this.aFloat142 = this.aFloat147 = this.aFloat143 = this.aFloat153 = this.aFloat149 = this.aFloat144 = 0.0F;
		this.aFloat150 = arg2;
	}

	@OriginalMember(owner = "client!ol", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class181 arg0) {
		@Pc(6) Class181_Sub3 local6 = (Class181_Sub3) arg0;
		this.aFloat149 = local6.aFloat149;
		this.aFloat148 = local6.aFloat148;
		this.aFloat152 = local6.aFloat152;
		this.aFloat143 = local6.aFloat143;
		this.aFloat145 = local6.aFloat145;
		this.aFloat142 = local6.aFloat142;
		this.aFloat150 = local6.aFloat150;
		this.aFloat144 = local6.aFloat144;
		this.aFloat147 = local6.aFloat147;
		this.aFloat153 = local6.aFloat153;
		this.aFloat146 = local6.aFloat146;
		this.aFloat151 = local6.aFloat151;
	}
}
