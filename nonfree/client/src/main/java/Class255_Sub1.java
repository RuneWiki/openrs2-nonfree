import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class255_Sub1 extends Class255 {

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	public Class255_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)[F")
	public float[] method6434() {
		Static168.aFloatArray20[5] = this.aFloat167;
		Static168.aFloatArray20[6] = this.aFloat168;
		Static168.aFloatArray20[14] = 0.0F;
		Static168.aFloatArray20[1] = this.aFloat165;
		Static168.aFloatArray20[9] = this.aFloat163;
		Static168.aFloatArray20[4] = this.aFloat158;
		Static168.aFloatArray20[13] = 0.0F;
		Static168.aFloatArray20[8] = this.aFloat162;
		Static168.aFloatArray20[2] = this.aFloat160;
		Static168.aFloatArray20[10] = this.aFloat164;
		Static168.aFloatArray20[12] = 0.0F;
		Static168.aFloatArray20[0] = this.aFloat159;
		return Static168.aFloatArray20;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class255 method8170() {
		@Pc(7) Class255_Sub1 local7 = new Class255_Sub1();
		local7.aFloat165 = this.aFloat165;
		local7.aFloat164 = this.aFloat164;
		local7.aFloat166 = this.aFloat166;
		local7.aFloat163 = this.aFloat163;
		local7.aFloat168 = this.aFloat168;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat160 = this.aFloat160;
		local7.aFloat162 = this.aFloat162;
		local7.aFloat157 = this.aFloat157;
		local7.aFloat161 = this.aFloat161;
		local7.aFloat158 = this.aFloat158;
		local7.aFloat159 = this.aFloat159;
		return local7;
	}

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat166;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat157;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat161;
		arg0[1] = (int) (this.aFloat167 * local20 + local12 * this.aFloat158 + this.aFloat168 * local29);
		arg0[0] = (int) (local29 * this.aFloat160 + local20 * this.aFloat165 + local12 * this.aFloat159);
		arg0[2] = (int) (this.aFloat164 * local29 + local12 * this.aFloat162 + local20 * this.aFloat163);
	}

	@OriginalMember(owner = "client!pf", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class255 arg0) {
		@Pc(6) Class255_Sub1 local6 = (Class255_Sub1) arg0;
		this.aFloat168 = local6.aFloat168;
		this.aFloat166 = local6.aFloat166;
		this.aFloat159 = local6.aFloat159;
		this.aFloat160 = local6.aFloat160;
		this.aFloat161 = local6.aFloat161;
		this.aFloat164 = local6.aFloat164;
		this.aFloat167 = local6.aFloat167;
		this.aFloat163 = local6.aFloat163;
		this.aFloat165 = local6.aFloat165;
		this.aFloat162 = local6.aFloat162;
		this.aFloat157 = local6.aFloat157;
		this.aFloat158 = local6.aFloat158;
	}

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg0 * this.aFloat159 + (float) arg1 * this.aFloat158 + (float) arg2 * this.aFloat162);
		arg3[2] = (int) ((float) arg0 * this.aFloat160 + this.aFloat168 * (float) arg1 + this.aFloat164 * (float) arg2);
		arg3[1] = (int) ((float) arg0 * this.aFloat165 + (float) arg1 * this.aFloat167 + this.aFloat163 * (float) arg2);
	}

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class208.aFloatArray59[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class208.aFloatArray58[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat165;
		@Pc(21) float local21 = this.aFloat167;
		@Pc(24) float local24 = this.aFloat163;
		this.aFloat165 = local9 * local18 - this.aFloat160 * local15;
		@Pc(38) float local38 = this.aFloat157;
		this.aFloat167 = local21 * local9 - local15 * this.aFloat168;
		this.aFloat160 = this.aFloat160 * local9 + local18 * local15;
		this.aFloat168 = this.aFloat168 * local9 + local21 * local15;
		this.aFloat163 = local9 * local24 - local15 * this.aFloat164;
		this.aFloat157 = local9 * local38 - this.aFloat161 * local15;
		this.aFloat164 = this.aFloat164 * local9 + local15 * local24;
		this.aFloat161 = local9 * this.aFloat161 + local15 * local38;
	}

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class208.aFloatArray59[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class208.aFloatArray58[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat159;
		@Pc(21) float local21 = this.aFloat158;
		@Pc(24) float local24 = this.aFloat162;
		@Pc(27) float local27 = this.aFloat166;
		this.aFloat159 = local18 * local9 + local15 * this.aFloat160;
		this.aFloat160 = local9 * this.aFloat160 - local15 * local18;
		this.aFloat158 = local21 * local9 + this.aFloat168 * local15;
		this.aFloat168 = local9 * this.aFloat168 - local15 * local21;
		this.aFloat162 = this.aFloat164 * local15 + local9 * local24;
		this.aFloat164 = local9 * this.aFloat164 - local15 * local24;
		this.aFloat166 = local15 * this.aFloat161 + local27 * local9;
		this.aFloat161 = local9 * this.aFloat161 - local27 * local15;
	}

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat165 = this.aFloat160 = this.aFloat158 = this.aFloat168 = this.aFloat162 = this.aFloat163 = this.aFloat166 = this.aFloat157 = this.aFloat161 = 0.0F;
		this.aFloat159 = this.aFloat167 = this.aFloat164 = 1.0F;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat167 = 1.0F;
		this.aFloat159 = this.aFloat164 = Class208.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat162 = Class208.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat160 = -this.aFloat162;
		this.aFloat158 = this.aFloat166 = this.aFloat165 = this.aFloat163 = this.aFloat157 = this.aFloat168 = this.aFloat161 = 0.0F;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!q;)V")
	public void method6436(@OriginalArg(1) Class255 arg0) {
		@Pc(14) Class255_Sub1 local14 = (Class255_Sub1) arg0;
		this.aFloat158 = local14.aFloat165;
		this.aFloat162 = local14.aFloat160;
		this.aFloat159 = local14.aFloat159;
		this.aFloat165 = local14.aFloat158;
		this.aFloat160 = local14.aFloat162;
		this.aFloat167 = local14.aFloat167;
		this.aFloat163 = local14.aFloat168;
		this.aFloat168 = local14.aFloat163;
		this.aFloat166 = -(this.aFloat159 * local14.aFloat166 + local14.aFloat157 * this.aFloat158 + this.aFloat162 * local14.aFloat161);
		this.aFloat164 = local14.aFloat164;
		this.aFloat157 = -(this.aFloat163 * local14.aFloat161 + this.aFloat167 * local14.aFloat157 + this.aFloat165 * local14.aFloat166);
		this.aFloat161 = -(local14.aFloat166 * this.aFloat160 + this.aFloat168 * local14.aFloat157 + this.aFloat164 * local14.aFloat161);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(FIBIFFI)V")
	public void method6437(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg1 == 0) {
			this.aFloat164 = 1.0F;
			this.aFloat165 = this.aFloat160 = this.aFloat158 = this.aFloat168 = this.aFloat162 = this.aFloat163 = 0.0F;
			this.aFloat167 = arg2;
			this.aFloat159 = arg5;
		} else {
			@Pc(38) float local38 = Class208.aFloatArray59[arg1 & 0x3FFF];
			@Pc(44) float local44 = Class208.aFloatArray58[arg1 & 0x3FFF];
			this.aFloat159 = (float) arg5 * local38;
			this.aFloat167 = local38 * (float) arg2;
			this.aFloat160 = this.aFloat168 = this.aFloat162 = this.aFloat163 = 0.0F;
			this.aFloat164 = 1.0F;
			this.aFloat165 = (float) arg5 * local44;
			this.aFloat158 = -local44 * (float) arg2;
		}
		this.aFloat166 = arg4;
		this.aFloat161 = arg0;
		this.aFloat157 = arg3;
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)[F")
	public float[] method6438() {
		Static168.aFloatArray20[9] = this.aFloat163;
		Static168.aFloatArray20[6] = this.aFloat168;
		Static168.aFloatArray20[2] = this.aFloat160;
		Static168.aFloatArray20[12] = this.aFloat166;
		Static168.aFloatArray20[14] = this.aFloat161;
		Static168.aFloatArray20[1] = this.aFloat165;
		Static168.aFloatArray20[0] = this.aFloat159;
		Static168.aFloatArray20[8] = this.aFloat162;
		Static168.aFloatArray20[5] = this.aFloat167;
		Static168.aFloatArray20[4] = this.aFloat158;
		Static168.aFloatArray20[10] = this.aFloat164;
		Static168.aFloatArray20[13] = this.aFloat157;
		return Static168.aFloatArray20;
	}

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat161 += arg2;
		this.aFloat157 += arg1;
		this.aFloat166 += arg0;
	}

	@OriginalMember(owner = "client!pf", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class208.aFloatArray59[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class208.aFloatArray58[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class208.aFloatArray59[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class208.aFloatArray58[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class208.aFloatArray59[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class208.aFloatArray58[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat168 = -local15;
		this.aFloat158 = local39 * local9;
		this.aFloat167 = local9 * local33;
		this.aFloat163 = local43 * local21 + local39 * local27;
		this.aFloat159 = local21 * local33 + local47 * local27;
		this.aFloat160 = local9 * local27;
		this.aFloat164 = local9 * local21;
		this.aFloat162 = -local27 * local33 + local21 * local47;
		this.aFloat165 = local43 * local27 + local39 * -local21;
		this.aFloat166 = -((float) arg2 * this.aFloat162) + (float) -arg0 * this.aFloat159 - this.aFloat158 * (float) arg1;
		this.aFloat157 = -(this.aFloat167 * (float) arg1) + this.aFloat165 * (float) -arg0 - (float) arg2 * this.aFloat163;
		this.aFloat161 = -(this.aFloat168 * (float) arg1) + (float) -arg0 * this.aFloat160 - this.aFloat164 * (float) arg2;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat166 + (float) arg2 * this.aFloat162 + (float) arg1 * this.aFloat158 + (float) arg0 * this.aFloat159);
		arg3[2] = (int) ((float) arg2 * this.aFloat164 + (float) arg0 * this.aFloat160 + (float) arg1 * this.aFloat168 + this.aFloat161);
		arg3[1] = (int) (this.aFloat157 + (float) arg2 * this.aFloat163 + (float) arg0 * this.aFloat165 + this.aFloat167 * (float) arg1);
	}

	@OriginalMember(owner = "client!pf", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat159 = this.aFloat167 = this.aFloat164 = 1.0F;
		this.aFloat157 = arg1;
		this.aFloat166 = arg0;
		this.aFloat165 = this.aFloat160 = this.aFloat158 = this.aFloat168 = this.aFloat162 = this.aFloat163 = 0.0F;
		this.aFloat161 = arg2;
	}

	@OriginalMember(owner = "client!pf", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat159 = 1.0F;
		this.aFloat167 = this.aFloat164 = Class208.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat168 = Class208.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat158 = this.aFloat162 = this.aFloat166 = this.aFloat165 = this.aFloat157 = this.aFloat160 = this.aFloat161 = 0.0F;
		this.aFloat163 = -this.aFloat168;
	}

	@OriginalMember(owner = "client!pf", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat164 = 1.0F;
		this.aFloat159 = this.aFloat167 = Class208.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat165 = Class208.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat162 = this.aFloat166 = this.aFloat163 = this.aFloat157 = this.aFloat160 = this.aFloat168 = this.aFloat161 = 0.0F;
		this.aFloat158 = -this.aFloat165;
	}
}
