import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class154_Sub3 extends Class154 {

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!ou", name = "i", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "F")
	public float aFloat156;

	@OriginalMember(owner = "client!ou", name = "y", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!ou", name = "B", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!ou", name = "D", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!ou", name = "K", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!ou", name = "L", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
	public Class154_Sub3() {
		this.method6564();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(FIFF[FF)V")
	public void method6576(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4) {
		@Pc(38) float local38;
		@Pc(30) float local30;
		@Pc(46) float local46;
		@Pc(22) float local22;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local22 = -arg0 / arg2;
			local30 = this.aFloat160 + local22 * this.aFloat157;
			local38 = this.aFloat156 + this.aFloat151 * local22;
			local46 = this.aFloat152 + this.aFloat159 * local22;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local22 = -arg0 / arg1;
			local38 = this.aFloat156 + this.aFloat155 * local22;
			local30 = this.aFloat153 * local22 + this.aFloat160;
			local46 = this.aFloat154 * local22 + this.aFloat152;
		} else {
			local22 = -arg0 / arg4;
			local38 = this.aFloat161 * local22 + this.aFloat156;
			local30 = this.aFloat160 + local22 * this.aFloat150;
			local46 = this.aFloat158 * local22 + this.aFloat152;
		}
		arg3[1] = this.aFloat157 * arg2 + arg1 * this.aFloat153 + arg4 * this.aFloat150;
		arg3[2] = arg2 * this.aFloat159 + arg1 * this.aFloat154 + this.aFloat158 * arg4;
		arg3[0] = this.aFloat161 * arg4 + this.aFloat151 * arg2 + this.aFloat155 * arg1;
		arg3[3] = -(arg3[1] * local30 + local38 * arg3[0] + local46 * arg3[2]);
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat152 + this.aFloat158 * (float) arg2 + (float) arg1 * this.aFloat154 + (float) arg0 * this.aFloat159);
		arg3[0] = (int) (this.aFloat156 + (float) arg1 * this.aFloat155 + this.aFloat151 * (float) arg0 + (float) arg2 * this.aFloat161);
		arg3[1] = (int) (this.aFloat160 + (float) arg2 * this.aFloat150 + this.aFloat153 * (float) arg1 + this.aFloat157 * (float) arg0);
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)[F")
	public float[] method6578() {
		Static336.aFloatArray51[0] = this.aFloat151;
		Static336.aFloatArray51[5] = this.aFloat153;
		Static336.aFloatArray51[13] = this.aFloat160;
		Static336.aFloatArray51[2] = this.aFloat159;
		Static336.aFloatArray51[6] = this.aFloat154;
		Static336.aFloatArray51[1] = this.aFloat157;
		Static336.aFloatArray51[4] = this.aFloat155;
		Static336.aFloatArray51[9] = this.aFloat150;
		Static336.aFloatArray51[14] = this.aFloat152;
		Static336.aFloatArray51[12] = this.aFloat156;
		Static336.aFloatArray51[8] = this.aFloat161;
		Static336.aFloatArray51[10] = this.aFloat158;
		return Static336.aFloatArray51;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)V")
	@Override
	public void method6559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat157 = this.aFloat159 = this.aFloat155 = this.aFloat154 = this.aFloat161 = this.aFloat150 = 0.0F;
		this.aFloat160 = (float) arg1;
		this.aFloat151 = this.aFloat153 = this.aFloat158 = 1.0F;
		this.aFloat152 = (float) arg2;
		this.aFloat156 = (float) arg0;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "()V")
	@Override
	public void method6564() {
		this.aFloat157 = this.aFloat159 = this.aFloat155 = this.aFloat154 = this.aFloat161 = this.aFloat150 = this.aFloat156 = this.aFloat160 = this.aFloat152 = 0.0F;
		this.aFloat151 = this.aFloat153 = this.aFloat158 = 1.0F;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat154 * (float) arg1 + (float) arg0 * this.aFloat159 + (float) arg2 * this.aFloat158);
		arg3[1] = (int) ((float) arg0 * this.aFloat157 + (float) arg1 * this.aFloat153 + this.aFloat150 * (float) arg2);
		arg3[0] = (int) ((float) arg2 * this.aFloat161 + this.aFloat151 * (float) arg0 + this.aFloat155 * (float) arg1);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "([I)V")
	@Override
	public void method6560(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat156;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat160;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat152;
		arg0[2] = (int) (this.aFloat150 * local19 + local11 * this.aFloat161 + this.aFloat158 * local27);
		arg0[0] = (int) (this.aFloat159 * local27 + this.aFloat157 * local19 + this.aFloat151 * local11);
		arg0[1] = (int) (this.aFloat154 * local27 + this.aFloat155 * local11 + this.aFloat153 * local19);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!ql;)V")
	public void method6579(@OriginalArg(1) Class154 arg0) {
		@Pc(6) Class154_Sub3 local6 = (Class154_Sub3) arg0;
		this.aFloat155 = local6.aFloat157;
		this.aFloat161 = local6.aFloat159;
		this.aFloat151 = local6.aFloat151;
		this.aFloat159 = local6.aFloat161;
		this.aFloat150 = local6.aFloat154;
		this.aFloat153 = local6.aFloat153;
		this.aFloat157 = local6.aFloat155;
		this.aFloat156 = -(local6.aFloat152 * this.aFloat161 + this.aFloat151 * local6.aFloat156 + local6.aFloat160 * this.aFloat155);
		this.aFloat158 = local6.aFloat158;
		this.aFloat154 = local6.aFloat150;
		this.aFloat160 = -(this.aFloat150 * local6.aFloat152 + local6.aFloat156 * this.aFloat157 + this.aFloat153 * local6.aFloat160);
		this.aFloat152 = -(this.aFloat159 * local6.aFloat156 + local6.aFloat160 * this.aFloat154 + local6.aFloat152 * this.aFloat158);
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(B)[F")
	public float[] method6580() {
		Static336.aFloatArray51[2] = this.aFloat159;
		Static336.aFloatArray51[10] = this.aFloat158;
		Static336.aFloatArray51[6] = this.aFloat154;
		Static336.aFloatArray51[5] = this.aFloat153;
		Static336.aFloatArray51[13] = 0.0F;
		Static336.aFloatArray51[1] = this.aFloat157;
		Static336.aFloatArray51[8] = this.aFloat161;
		Static336.aFloatArray51[14] = 0.0F;
		Static336.aFloatArray51[9] = this.aFloat150;
		Static336.aFloatArray51[12] = 0.0F;
		Static336.aFloatArray51[4] = this.aFloat155;
		Static336.aFloatArray51[0] = this.aFloat151;
		return Static336.aFloatArray51;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method6563(@OriginalArg(0) Class154 arg0) {
		@Pc(6) Class154_Sub3 local6 = (Class154_Sub3) arg0;
		this.aFloat153 = local6.aFloat153;
		this.aFloat160 = local6.aFloat160;
		this.aFloat150 = local6.aFloat150;
		this.aFloat152 = local6.aFloat152;
		this.aFloat156 = local6.aFloat156;
		this.aFloat158 = local6.aFloat158;
		this.aFloat159 = local6.aFloat159;
		this.aFloat155 = local6.aFloat155;
		this.aFloat154 = local6.aFloat154;
		this.aFloat161 = local6.aFloat161;
		this.aFloat151 = local6.aFloat151;
		this.aFloat157 = local6.aFloat157;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	@Override
	public void method6558(@OriginalArg(0) int arg0) {
		this.aFloat151 = 1.0F;
		this.aFloat153 = this.aFloat158 = Class287.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat154 = Class287.aFloatArray74[arg0 & 0x3FFF];
		this.aFloat150 = -this.aFloat154;
		this.aFloat155 = this.aFloat161 = this.aFloat156 = this.aFloat157 = this.aFloat160 = this.aFloat159 = this.aFloat152 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method6574() {
		@Pc(7) Class154_Sub3 local7 = new Class154_Sub3();
		local7.aFloat157 = this.aFloat157;
		local7.aFloat161 = this.aFloat161;
		local7.aFloat154 = this.aFloat154;
		local7.aFloat150 = this.aFloat150;
		local7.aFloat159 = this.aFloat159;
		local7.aFloat151 = this.aFloat151;
		local7.aFloat152 = this.aFloat152;
		local7.aFloat158 = this.aFloat158;
		local7.aFloat160 = this.aFloat160;
		local7.aFloat156 = this.aFloat156;
		local7.aFloat155 = this.aFloat155;
		local7.aFloat153 = this.aFloat153;
		return local7;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg1 - this.aFloat160);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat156);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat152);
		arg3[0] = (int) ((float) local24 * this.aFloat159 + this.aFloat157 * (float) local10 + this.aFloat151 * (float) local17);
		arg3[1] = (int) (this.aFloat155 * (float) local17 + this.aFloat153 * (float) local10 + this.aFloat154 * (float) local24);
		arg3[2] = (int) (this.aFloat150 * (float) local10 + (float) local17 * this.aFloat161 + this.aFloat158 * (float) local24);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class287.aFloatArray75[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class287.aFloatArray74[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class287.aFloatArray75[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class287.aFloatArray74[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class287.aFloatArray75[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class287.aFloatArray74[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat157 = local39 * -local21 + local43 * local27;
		this.aFloat155 = local9 * local39;
		this.aFloat159 = local9 * local27;
		this.aFloat161 = -local27 * local33 + local21 * local47;
		this.aFloat158 = local9 * local21;
		this.aFloat150 = local43 * local21 + local27 * local39;
		this.aFloat153 = local9 * local33;
		this.aFloat151 = local47 * local27 + local33 * local21;
		this.aFloat154 = -local15;
		this.aFloat160 = -((float) arg2 * this.aFloat150) + (float) -arg0 * this.aFloat157 - this.aFloat153 * (float) arg1;
		this.aFloat152 = this.aFloat159 * (float) -arg0 - this.aFloat154 * (float) arg1 - (float) arg2 * this.aFloat158;
		this.aFloat156 = -((float) arg2 * this.aFloat161) + this.aFloat151 * (float) -arg0 - (float) arg1 * this.aFloat155;
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V")
	@Override
	public void method6571(@OriginalArg(0) int arg0) {
		this.aFloat153 = 1.0F;
		this.aFloat151 = this.aFloat158 = Class287.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat161 = Class287.aFloatArray74[arg0 & 0x3FFF];
		this.aFloat159 = -this.aFloat161;
		this.aFloat155 = this.aFloat156 = this.aFloat157 = this.aFloat150 = this.aFloat160 = this.aFloat154 = this.aFloat152 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IFFIFII)V")
	public void method6581(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == 0) {
			this.aFloat157 = this.aFloat159 = this.aFloat155 = this.aFloat154 = this.aFloat161 = this.aFloat150 = 0.0F;
			this.aFloat151 = (float) arg2;
			this.aFloat158 = 1.0F;
			this.aFloat153 = (float) arg5;
		} else {
			@Pc(11) float local11 = Class287.aFloatArray75[arg4 & 0x3FFF];
			@Pc(17) float local17 = Class287.aFloatArray74[arg4 & 0x3FFF];
			this.aFloat155 = -local17 * (float) arg5;
			this.aFloat157 = local17 * (float) arg2;
			this.aFloat153 = (float) arg5 * local11;
			this.aFloat151 = (float) arg2 * local11;
			this.aFloat159 = this.aFloat154 = this.aFloat161 = this.aFloat150 = 0.0F;
			this.aFloat158 = 1.0F;
		}
		this.aFloat156 = arg3;
		this.aFloat152 = arg1;
		this.aFloat160 = arg0;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	@Override
	public void method6557(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class287.aFloatArray75[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class287.aFloatArray74[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat157;
		@Pc(21) float local21 = this.aFloat153;
		@Pc(24) float local24 = this.aFloat150;
		@Pc(27) float local27 = this.aFloat160;
		this.aFloat157 = local18 * local9 - this.aFloat159 * local15;
		this.aFloat159 = local18 * local15 + this.aFloat159 * local9;
		this.aFloat153 = local21 * local9 - local15 * this.aFloat154;
		this.aFloat154 = local9 * this.aFloat154 + local15 * local21;
		this.aFloat150 = local24 * local9 - local15 * this.aFloat158;
		this.aFloat160 = local27 * local9 - this.aFloat152 * local15;
		this.aFloat158 = local24 * local15 + this.aFloat158 * local9;
		this.aFloat152 = this.aFloat152 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "(I)V")
	public void method6582() {
		this.aFloat159 = -this.aFloat159;
		this.aFloat154 = -this.aFloat154;
		this.aFloat153 = -this.aFloat153;
		this.aFloat158 = -this.aFloat158;
		this.aFloat152 = -this.aFloat152;
		this.aFloat157 = -this.aFloat157;
		this.aFloat160 = -this.aFloat160;
		this.aFloat150 = -this.aFloat150;
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
	@Override
	public void method6565(@OriginalArg(0) int arg0) {
		this.aFloat158 = 1.0F;
		this.aFloat151 = this.aFloat153 = Class287.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat157 = Class287.aFloatArray74[arg0 & 0x3FFF];
		this.aFloat155 = -this.aFloat157;
		this.aFloat161 = this.aFloat156 = this.aFloat150 = this.aFloat160 = this.aFloat159 = this.aFloat154 = this.aFloat152 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(III)V")
	@Override
	public void method6570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat156 += (float) arg0;
		this.aFloat152 += (float) arg2;
		this.aFloat160 += (float) arg1;
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V")
	@Override
	public void method6566(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class287.aFloatArray75[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class287.aFloatArray74[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat151;
		@Pc(21) float local21 = this.aFloat155;
		@Pc(24) float local24 = this.aFloat161;
		@Pc(27) float local27 = this.aFloat156;
		this.aFloat151 = local18 * local9 + local15 * this.aFloat159;
		this.aFloat155 = local21 * local9 + this.aFloat154 * local15;
		this.aFloat159 = local9 * this.aFloat159 - local15 * local18;
		this.aFloat154 = local9 * this.aFloat154 - local15 * local21;
		this.aFloat161 = local24 * local9 + this.aFloat158 * local15;
		this.aFloat156 = local15 * this.aFloat152 + local9 * local27;
		this.aFloat158 = local9 * this.aFloat158 - local15 * local24;
		this.aFloat152 = this.aFloat152 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "(I)V")
	@Override
	public void method6572(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class287.aFloatArray75[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class287.aFloatArray74[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat151;
		@Pc(21) float local21 = this.aFloat155;
		@Pc(24) float local24 = this.aFloat161;
		@Pc(27) float local27 = this.aFloat156;
		this.aFloat151 = local18 * local9 - local15 * this.aFloat157;
		this.aFloat157 = this.aFloat157 * local9 + local18 * local15;
		this.aFloat155 = local21 * local9 - this.aFloat153 * local15;
		this.aFloat153 = local9 * this.aFloat153 + local15 * local21;
		this.aFloat161 = local24 * local9 - this.aFloat150 * local15;
		this.aFloat156 = local9 * local27 - local15 * this.aFloat160;
		this.aFloat150 = this.aFloat150 * local9 + local24 * local15;
		this.aFloat160 = this.aFloat160 * local9 + local15 * local27;
	}
}
