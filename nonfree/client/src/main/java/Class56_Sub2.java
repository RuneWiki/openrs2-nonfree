import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "F")
	public float aFloat156;

	@OriginalMember(owner = "client!pr", name = "A", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!pr", name = "B", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!pr", name = "I", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	public Class56_Sub2() {
		this.method8400();
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)V")
	@Override
	public void method8391(@OriginalArg(0) int arg0) {
		this.aFloat149 = 1.0F;
		this.aFloat148 = this.aFloat155 = Class104.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat151 = Class104.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat158 = this.aFloat159 = this.aFloat156 = this.aFloat157 = this.aFloat152 = this.aFloat154 = this.aFloat153 = 0.0F;
		this.aFloat150 = -this.aFloat151;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "([I)V")
	@Override
	public void method8383(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat159;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat152;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat153;
		arg0[0] = (int) (this.aFloat150 * local28 + this.aFloat156 * local20 + local12 * this.aFloat148);
		arg0[1] = (int) (local28 * this.aFloat154 + this.aFloat158 * local12 + local20 * this.aFloat149);
		arg0[2] = (int) (local12 * this.aFloat151 + this.aFloat157 * local20 + this.aFloat155 * local28);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "()V")
	@Override
	public void method8400() {
		this.aFloat148 = this.aFloat149 = this.aFloat155 = 1.0F;
		this.aFloat156 = this.aFloat150 = this.aFloat158 = this.aFloat154 = this.aFloat151 = this.aFloat157 = this.aFloat159 = this.aFloat152 = this.aFloat153 = 0.0F;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class104.aFloatArray7[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class104.aFloatArray8[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class104.aFloatArray7[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class104.aFloatArray8[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class104.aFloatArray7[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class104.aFloatArray8[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat148 = local33 * local21 + local27 * local47;
		this.aFloat151 = local21 * local47 + -local27 * local33;
		this.aFloat154 = -local15;
		this.aFloat150 = local27 * local9;
		this.aFloat157 = local39 * local27 + local21 * local43;
		this.aFloat149 = local33 * local9;
		this.aFloat158 = local39 * local9;
		this.aFloat156 = local39 * -local21 + local43 * local27;
		this.aFloat155 = local9 * local21;
		this.aFloat159 = -(this.aFloat151 * (float) arg2) + (float) -arg0 * this.aFloat148 - this.aFloat158 * (float) arg1;
		this.aFloat153 = -((float) arg2 * this.aFloat155) + (float) -arg0 * this.aFloat150 - this.aFloat154 * (float) arg1;
		this.aFloat152 = -(this.aFloat157 * (float) arg2) - this.aFloat149 * (float) arg1 + this.aFloat156 * (float) -arg0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(FFIF)V")
	public void method6811(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat153 += arg0;
		this.aFloat152 += arg2;
		this.aFloat159 += arg1;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "([FB)[F")
	public float[] method6812(@OriginalArg(0) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[1] = this.aFloat158;
		arg0[10] = this.aFloat155;
		arg0[14] = 0.0F;
		arg0[15] = 0.0F;
		arg0[6] = this.aFloat157;
		arg0[8] = this.aFloat150;
		arg0[11] = 0.0F;
		arg0[5] = this.aFloat149;
		arg0[7] = 0.0F;
		arg0[0] = this.aFloat148;
		arg0[3] = 0.0F;
		arg0[9] = this.aFloat154;
		arg0[12] = 0.0F;
		arg0[2] = this.aFloat151;
		arg0[4] = this.aFloat156;
		return arg0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)V")
	@Override
	public void method8390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat152 += (float) arg1;
		this.aFloat153 += (float) arg2;
		this.aFloat159 += (float) arg0;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(FFIF)F")
	public float method6813(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat153 + this.aFloat150 * arg0 + this.aFloat154 * arg2 + this.aFloat155 * arg1;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg0 * this.aFloat156 + this.aFloat149 * (float) arg1 + this.aFloat157 * (float) arg2 + this.aFloat152);
		arg3[2] = (int) ((float) arg1 * this.aFloat154 + (float) arg0 * this.aFloat150 + (float) arg2 * this.aFloat155 + this.aFloat153);
		arg3[0] = (int) (this.aFloat151 * (float) arg2 + this.aFloat148 * (float) arg0 + (float) arg1 * this.aFloat158 + this.aFloat159);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(FFFIZII)V")
	public void method6814(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat159 = (float) -arg4 + arg2;
			this.aFloat152 = (float) -arg3 + arg0;
			this.aFloat155 = 1.0F;
			this.aFloat149 = (float) (arg3 * 2);
			this.aFloat156 = this.aFloat150 = this.aFloat158 = this.aFloat154 = this.aFloat151 = this.aFloat157 = 0.0F;
			this.aFloat153 = arg1;
			this.aFloat148 = (float) (arg4 * 2);
			return;
		}
		@Pc(29) float local29 = Class104.aFloatArray7[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class104.aFloatArray8[arg5 & 0x3FFF];
		this.aFloat149 = local29 * 2.0F * (float) arg3;
		this.aFloat155 = 1.0F;
		this.aFloat148 = (float) arg4 * local29 * 2.0F;
		this.aFloat158 = -2.0F * local35 * (float) arg3;
		this.aFloat156 = local35 * 2.0F * (float) arg4;
		this.aFloat152 = (float) (arg3 * 2) * (local35 * -0.5F - local29 * 0.5F) + arg0;
		this.aFloat159 = arg2 + (local35 * 0.5F - local29 * 0.5F) * (float) (arg4 * 2);
		this.aFloat153 = arg1;
		this.aFloat150 = this.aFloat154 = this.aFloat151 = this.aFloat157 = 0.0F;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!eh;)V")
	@Override
	public void method8393(@OriginalArg(0) Class56 arg0) {
		@Pc(6) Class56_Sub2 local6 = (Class56_Sub2) arg0;
		this.aFloat151 = local6.aFloat151;
		this.aFloat158 = local6.aFloat158;
		this.aFloat159 = local6.aFloat159;
		this.aFloat156 = local6.aFloat156;
		this.aFloat154 = local6.aFloat154;
		this.aFloat157 = local6.aFloat157;
		this.aFloat150 = local6.aFloat150;
		this.aFloat149 = local6.aFloat149;
		this.aFloat152 = local6.aFloat152;
		this.aFloat155 = local6.aFloat155;
		this.aFloat153 = local6.aFloat153;
		this.aFloat148 = local6.aFloat148;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(FFFF[FB)V")
	public void method6815(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4) {
		arg4[1] = arg3 * this.aFloat157 + this.aFloat149 * arg2 + this.aFloat156 * arg1;
		@Pc(67) float local67;
		@Pc(51) float local51;
		@Pc(59) float local59;
		@Pc(43) float local43;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local43 = -arg0 / arg1;
			local59 = this.aFloat150 * local43 + this.aFloat153;
			local67 = local43 * this.aFloat148 + this.aFloat159;
			local51 = local43 * this.aFloat156 + this.aFloat152;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local43 = -arg0 / arg2;
			local59 = this.aFloat154 * local43 + this.aFloat153;
			local67 = local43 * this.aFloat158 + this.aFloat159;
			local51 = this.aFloat149 * local43 + this.aFloat152;
		} else {
			local43 = -arg0 / arg3;
			local51 = local43 * this.aFloat157 + this.aFloat152;
			local59 = local43 * this.aFloat155 + this.aFloat153;
			local67 = this.aFloat159 + this.aFloat151 * local43;
		}
		arg4[2] = this.aFloat155 * arg3 + arg1 * this.aFloat150 + this.aFloat154 * arg2;
		arg4[0] = this.aFloat151 * arg3 + this.aFloat158 * arg2 + arg1 * this.aFloat148;
		arg4[3] = -(local59 * arg4[2] + arg4[0] * local67 + arg4[1] * local51);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	public void method6816() {
		this.aFloat153 = -this.aFloat153;
		this.aFloat150 = -this.aFloat150;
		this.aFloat155 = -this.aFloat155;
		this.aFloat149 = -this.aFloat149;
		this.aFloat152 = -this.aFloat152;
		this.aFloat157 = -this.aFloat157;
		this.aFloat156 = -this.aFloat156;
		this.aFloat154 = -this.aFloat154;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BFFF)F")
	public float method6817(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat152 + this.aFloat157 * arg1 + this.aFloat149 * arg2 + arg0 * this.aFloat156;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I[F)[F")
	public float[] method6818(@OriginalArg(1) float[] arg0) {
		arg0[10] = this.aFloat153;
		arg0[5] = this.aFloat149;
		arg0[6] = 0.0F;
		arg0[4] = this.aFloat158;
		arg0[15] = 1.0F;
		arg0[1] = this.aFloat156;
		arg0[9] = this.aFloat152;
		arg0[3] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat159;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[0] = this.aFloat148;
		arg0[2] = 0.0F;
		arg0[7] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!eh;I)V")
	public void method6819(@OriginalArg(0) Class56 arg0) {
		@Pc(6) Class56_Sub2 local6 = (Class56_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat148;
		@Pc(12) float local12 = this.aFloat156;
		@Pc(15) float local15 = this.aFloat158;
		@Pc(18) float local18 = this.aFloat149;
		@Pc(21) float local21 = this.aFloat151;
		@Pc(24) float local24 = this.aFloat157;
		@Pc(27) float local27 = this.aFloat159;
		@Pc(30) float local30 = this.aFloat152;
		this.aFloat148 = local6.aFloat158 * local12 + local9 * local6.aFloat148 + this.aFloat150 * local6.aFloat151;
		this.aFloat156 = this.aFloat150 * local6.aFloat157 + local9 * local6.aFloat156 + local12 * local6.aFloat149;
		this.aFloat158 = local18 * local6.aFloat158 + local15 * local6.aFloat148 + local6.aFloat151 * this.aFloat154;
		this.aFloat150 = local12 * local6.aFloat154 + local6.aFloat150 * local9 + this.aFloat150 * local6.aFloat155;
		this.aFloat149 = local6.aFloat157 * this.aFloat154 + local6.aFloat149 * local18 + local6.aFloat156 * local15;
		this.aFloat154 = local6.aFloat155 * this.aFloat154 + local6.aFloat154 * local18 + local15 * local6.aFloat150;
		this.aFloat157 = this.aFloat155 * local6.aFloat157 + local6.aFloat156 * local21 + local24 * local6.aFloat149;
		this.aFloat151 = local21 * local6.aFloat148 + local24 * local6.aFloat158 + local6.aFloat151 * this.aFloat155;
		this.aFloat159 = this.aFloat153 * local6.aFloat151 + local30 * local6.aFloat158 + local6.aFloat148 * local27 + local6.aFloat159;
		this.aFloat155 = local6.aFloat155 * this.aFloat155 + local6.aFloat150 * local21 + local24 * local6.aFloat154;
		this.aFloat152 = local6.aFloat152 + local30 * local6.aFloat149 + local6.aFloat156 * local27 + this.aFloat153 * local6.aFloat157;
		this.aFloat153 = local6.aFloat155 * this.aFloat153 + local6.aFloat154 * local30 + local6.aFloat150 * local27 + local6.aFloat153;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(FFFI)V")
	public void method6820(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat152 = 0.0F;
		this.aFloat156 = 0.0F;
		this.aFloat151 = 0.0F;
		this.aFloat159 = 0.0F;
		this.aFloat158 = 0.0F;
		this.aFloat148 = arg2;
		this.aFloat157 = 0.0F;
		this.aFloat149 = arg1;
		this.aFloat154 = 0.0F;
		this.aFloat150 = 0.0F;
		this.aFloat153 = 0.0F;
		this.aFloat155 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(FI[FFF)V")
	public void method6821(@OriginalArg(0) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg1[1] = this.aFloat149 * arg2 + arg3 * this.aFloat156 + arg0 * this.aFloat157;
		arg1[2] = arg3 * this.aFloat150 + arg2 * this.aFloat154 + arg0 * this.aFloat155;
		arg1[0] = this.aFloat158 * arg2 + this.aFloat148 * arg3 + this.aFloat151 * arg0;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat153);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat159);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat152);
		arg3[1] = (int) ((float) local24 * this.aFloat149 + this.aFloat158 * (float) local17 + (float) local6 * this.aFloat154);
		arg3[2] = (int) ((float) local17 * this.aFloat151 + this.aFloat157 * (float) local24 + this.aFloat155 * (float) local6);
		arg3[0] = (int) ((float) local6 * this.aFloat150 + this.aFloat156 * (float) local24 + this.aFloat148 * (float) local17);
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat158 * (float) arg1 + (float) arg0 * this.aFloat148 + (float) arg2 * this.aFloat151);
		arg3[1] = (int) ((float) arg2 * this.aFloat157 + (float) arg0 * this.aFloat156 + (float) arg1 * this.aFloat149);
		arg3[2] = (int) (this.aFloat154 * (float) arg1 + this.aFloat150 * (float) arg0 + (float) arg2 * this.aFloat155);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "([FI)[F")
	public float[] method6822(@OriginalArg(0) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[1] = this.aFloat158;
		arg0[4] = this.aFloat156;
		arg0[0] = this.aFloat148;
		arg0[5] = this.aFloat149;
		arg0[10] = this.aFloat155;
		arg0[15] = 1.0F;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat150;
		arg0[3] = this.aFloat159;
		arg0[11] = this.aFloat153;
		arg0[2] = this.aFloat151;
		arg0[6] = this.aFloat157;
		arg0[7] = this.aFloat152;
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat154;
		return arg0;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(FFIF)F")
	public float method6823(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat151 * arg2 + this.aFloat148 * arg1 + this.aFloat158 * arg0 + this.aFloat159;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	@Override
	public void method8386(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class104.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class104.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat148;
		@Pc(21) float local21 = this.aFloat158;
		@Pc(24) float local24 = this.aFloat151;
		this.aFloat148 = local9 * local18 + this.aFloat150 * local15;
		@Pc(37) float local37 = this.aFloat159;
		this.aFloat150 = local9 * this.aFloat150 - local15 * local18;
		this.aFloat158 = this.aFloat154 * local15 + local21 * local9;
		this.aFloat154 = this.aFloat154 * local9 - local15 * local21;
		this.aFloat151 = local15 * this.aFloat155 + local24 * local9;
		this.aFloat155 = local9 * this.aFloat155 - local24 * local15;
		this.aFloat159 = local37 * local9 + this.aFloat153 * local15;
		this.aFloat153 = this.aFloat153 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class104.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class104.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat156;
		@Pc(21) float local21 = this.aFloat149;
		@Pc(24) float local24 = this.aFloat157;
		@Pc(27) float local27 = this.aFloat152;
		this.aFloat156 = local18 * local9 - this.aFloat150 * local15;
		this.aFloat150 = local15 * local18 + local9 * this.aFloat150;
		this.aFloat149 = local9 * local21 - local15 * this.aFloat154;
		this.aFloat154 = local9 * this.aFloat154 + local15 * local21;
		this.aFloat157 = local24 * local9 - local15 * this.aFloat155;
		this.aFloat152 = local9 * local27 - local15 * this.aFloat153;
		this.aFloat155 = local24 * local15 + local9 * this.aFloat155;
		this.aFloat153 = this.aFloat153 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(BFFF)V")
	public void method6824(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat152 = arg1;
		this.aFloat148 = this.aFloat149 = this.aFloat155 = 1.0F;
		this.aFloat156 = this.aFloat150 = this.aFloat158 = this.aFloat154 = this.aFloat151 = this.aFloat157 = 0.0F;
		this.aFloat159 = arg2;
		this.aFloat153 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(Lclient!eh;I)V")
	public void method6825(@OriginalArg(0) Class56 arg0) {
		@Pc(6) Class56_Sub2 local6 = (Class56_Sub2) arg0;
		this.aFloat158 = local6.aFloat158;
		this.aFloat154 = local6.aFloat154;
		this.aFloat153 = 0.0F;
		this.aFloat156 = local6.aFloat156;
		this.aFloat149 = local6.aFloat149;
		this.aFloat148 = local6.aFloat148;
		this.aFloat155 = local6.aFloat155;
		this.aFloat159 = 0.0F;
		this.aFloat150 = local6.aFloat150;
		this.aFloat152 = (float) 0;
		this.aFloat157 = local6.aFloat157;
		this.aFloat151 = local6.aFloat151;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!eh;Lclient!eh;)V")
	public void method6826(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1) {
		@Pc(6) Class56_Sub2 local6 = (Class56_Sub2) arg0;
		@Pc(9) Class56_Sub2 local9 = (Class56_Sub2) arg1;
		this.aFloat148 = local6.aFloat148 * local9.aFloat148 + local9.aFloat156 * local6.aFloat158 + local6.aFloat151 * local9.aFloat150;
		this.aFloat156 = local9.aFloat150 * local6.aFloat157 + local6.aFloat149 * local9.aFloat156 + local9.aFloat148 * local6.aFloat156;
		this.aFloat150 = local6.aFloat154 * local9.aFloat156 + local9.aFloat148 * local6.aFloat150 + local9.aFloat150 * local6.aFloat155;
		this.aFloat158 = local9.aFloat158 * local6.aFloat148 + local6.aFloat158 * local9.aFloat149 + local9.aFloat154 * local6.aFloat151;
		this.aFloat149 = local6.aFloat157 * local9.aFloat154 + local9.aFloat158 * local6.aFloat156 + local9.aFloat149 * local6.aFloat149;
		this.aFloat151 = local9.aFloat151 * local6.aFloat148 + local6.aFloat158 * local9.aFloat157 + local6.aFloat151 * local9.aFloat155;
		this.aFloat154 = local6.aFloat154 * local9.aFloat149 + local9.aFloat158 * local6.aFloat150 + local9.aFloat154 * local6.aFloat155;
		this.aFloat157 = local9.aFloat151 * local6.aFloat156 + local6.aFloat149 * local9.aFloat157 + local6.aFloat157 * local9.aFloat155;
		this.aFloat155 = local9.aFloat155 * local6.aFloat155 + local9.aFloat157 * local6.aFloat154 + local9.aFloat151 * local6.aFloat150;
		this.aFloat159 = local6.aFloat159 + local6.aFloat158 * local9.aFloat152 + local6.aFloat148 * local9.aFloat159 + local9.aFloat153 * local6.aFloat151;
		this.aFloat152 = local6.aFloat152 + local9.aFloat152 * local6.aFloat149 + local9.aFloat159 * local6.aFloat156 + local6.aFloat157 * local9.aFloat153;
		this.aFloat153 = local9.aFloat153 * local6.aFloat155 + local6.aFloat150 * local9.aFloat159 + local9.aFloat152 * local6.aFloat154 + local6.aFloat153;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILclient!eh;)V")
	public void method6827(@OriginalArg(1) Class56 arg0) {
		@Pc(6) Class56_Sub2 local6 = (Class56_Sub2) arg0;
		this.aFloat158 = local6.aFloat156;
		this.aFloat151 = local6.aFloat150;
		this.aFloat148 = local6.aFloat148;
		this.aFloat156 = local6.aFloat158;
		this.aFloat149 = local6.aFloat149;
		this.aFloat157 = local6.aFloat154;
		this.aFloat150 = local6.aFloat151;
		this.aFloat159 = -(local6.aFloat153 * this.aFloat151 + local6.aFloat159 * this.aFloat148 + this.aFloat158 * local6.aFloat152);
		this.aFloat154 = local6.aFloat157;
		this.aFloat155 = local6.aFloat155;
		this.aFloat152 = -(local6.aFloat159 * this.aFloat156 + local6.aFloat152 * this.aFloat149 + local6.aFloat153 * this.aFloat157);
		this.aFloat153 = -(this.aFloat150 * local6.aFloat159 + local6.aFloat152 * this.aFloat154 + local6.aFloat153 * this.aFloat155);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(III)V")
	@Override
	public void method8395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat152 = (float) arg1;
		this.aFloat148 = this.aFloat149 = this.aFloat155 = 1.0F;
		this.aFloat156 = this.aFloat150 = this.aFloat158 = this.aFloat154 = this.aFloat151 = this.aFloat157 = 0.0F;
		this.aFloat153 = (float) arg2;
		this.aFloat159 = (float) arg0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(FFFZ)V")
	public void method6828(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat154 *= arg0;
		this.aFloat158 *= arg1;
		this.aFloat148 *= arg1;
		this.aFloat149 *= arg2;
		this.aFloat150 *= arg0;
		this.aFloat156 *= arg2;
		this.aFloat151 *= arg1;
		this.aFloat153 *= arg0;
		this.aFloat152 *= arg2;
		this.aFloat159 *= arg1;
		this.aFloat155 *= arg0;
		this.aFloat157 *= arg2;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B[F)[F")
	public float[] method6830(@OriginalArg(1) float[] arg0) {
		arg0[5] = this.aFloat149;
		arg0[1] = this.aFloat158;
		arg0[7] = this.aFloat152;
		arg0[2] = this.aFloat151;
		arg0[3] = this.aFloat159;
		arg0[0] = this.aFloat148;
		arg0[6] = this.aFloat157;
		arg0[4] = this.aFloat156;
		return arg0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(FFFFFFFFIF)V")
	public void method6831(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat155 = arg5;
		this.aFloat156 = arg8;
		this.aFloat157 = arg2;
		this.aFloat149 = arg1;
		this.aFloat148 = arg4;
		this.aFloat151 = arg3;
		this.aFloat150 = arg7;
		this.aFloat154 = arg0;
		this.aFloat158 = arg6;
		this.aFloat152 = 0.0F;
		this.aFloat159 = 0.0F;
		this.aFloat153 = 0.0F;
	}

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)V")
	@Override
	public void method8392(@OriginalArg(0) int arg0) {
		this.aFloat148 = 1.0F;
		this.aFloat149 = this.aFloat155 = Class104.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat154 = Class104.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat158 = this.aFloat151 = this.aFloat159 = this.aFloat156 = this.aFloat152 = this.aFloat150 = this.aFloat153 = 0.0F;
		this.aFloat157 = -this.aFloat154;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "()Lclient!eh;")
	@Override
	public Class56 method8394() {
		@Pc(7) Class56_Sub2 local7 = new Class56_Sub2();
		local7.aFloat154 = this.aFloat154;
		local7.aFloat155 = this.aFloat155;
		local7.aFloat158 = this.aFloat158;
		local7.aFloat157 = this.aFloat157;
		local7.aFloat152 = this.aFloat152;
		local7.aFloat148 = this.aFloat148;
		local7.aFloat156 = this.aFloat156;
		local7.aFloat153 = this.aFloat153;
		local7.aFloat150 = this.aFloat150;
		local7.aFloat151 = this.aFloat151;
		local7.aFloat159 = this.aFloat159;
		local7.aFloat149 = this.aFloat149;
		return local7;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
	@Override
	public void method8385(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class104.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class104.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat148;
		@Pc(21) float local21 = this.aFloat158;
		@Pc(24) float local24 = this.aFloat151;
		@Pc(27) float local27 = this.aFloat159;
		this.aFloat148 = local9 * local18 - this.aFloat156 * local15;
		this.aFloat156 = local15 * local18 + this.aFloat156 * local9;
		this.aFloat158 = local9 * local21 - local15 * this.aFloat149;
		this.aFloat151 = local24 * local9 - local15 * this.aFloat157;
		this.aFloat149 = local21 * local15 + this.aFloat149 * local9;
		this.aFloat157 = this.aFloat157 * local9 + local24 * local15;
		this.aFloat159 = local27 * local9 - local15 * this.aFloat152;
		this.aFloat152 = local27 * local15 + local9 * this.aFloat152;
	}

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)V")
	@Override
	public void method8401(@OriginalArg(0) int arg0) {
		this.aFloat155 = 1.0F;
		this.aFloat148 = this.aFloat149 = Class104.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat156 = Class104.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat158 = -this.aFloat156;
		this.aFloat151 = this.aFloat159 = this.aFloat157 = this.aFloat152 = this.aFloat150 = this.aFloat154 = this.aFloat153 = 0.0F;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "([FB)[F")
	public float[] method6832(@OriginalArg(0) float[] arg0) {
		arg0[8] = this.aFloat151;
		arg0[2] = this.aFloat150;
		arg0[1] = this.aFloat156;
		arg0[3] = 0.0F;
		arg0[9] = this.aFloat157;
		arg0[10] = this.aFloat155;
		arg0[11] = 0.0F;
		arg0[0] = this.aFloat148;
		arg0[12] = this.aFloat159;
		arg0[5] = this.aFloat149;
		arg0[6] = this.aFloat154;
		arg0[7] = 0.0F;
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat158;
		arg0[14] = this.aFloat153;
		arg0[13] = this.aFloat152;
		return arg0;
	}
}
