import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class128_Sub3 extends Class128 {

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "F")
	public float aFloat156;

	@OriginalMember(owner = "client!sg", name = "Q", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!sg", name = "T", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!sg", name = "V", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!sg", name = "Y", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!sg", name = "eb", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class128_Sub3() {
		this.ha();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFI)F")
	public float method6888(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat150 + arg1 * this.aFloat157 + this.aFloat154 * arg2 + arg0 * this.aFloat153;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!m;)V")
	public void method6889(@OriginalArg(1) Class128 arg0) {
		@Pc(6) Class128_Sub3 local6 = (Class128_Sub3) arg0;
		this.aFloat160 = local6.aFloat160;
		this.aFloat151 = 0.0F;
		this.aFloat161 = local6.aFloat161;
		this.aFloat150 = 0.0F;
		this.aFloat154 = local6.aFloat154;
		this.aFloat159 = local6.aFloat159;
		this.aFloat153 = local6.aFloat153;
		this.aFloat157 = local6.aFloat157;
		this.aFloat158 = local6.aFloat158;
		this.aFloat156 = local6.aFloat156;
		this.aFloat152 = local6.aFloat152;
		this.aFloat155 = 0.0F;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B[F)[F")
	public float[] method6890(@OriginalArg(1) float[] arg0) {
		arg0[3] = 0.0F;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat158;
		arg0[1] = this.aFloat159;
		arg0[10] = this.aFloat150;
		arg0[8] = this.aFloat155;
		arg0[15] = 1.0F;
		arg0[7] = 0.0F;
		arg0[6] = 0.0F;
		arg0[12] = 0.0F;
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat151;
		arg0[2] = 0.0F;
		arg0[4] = this.aFloat156;
		arg0[0] = this.aFloat161;
		arg0[11] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!m;Lclient!m;)V")
	public void method6891(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class128 arg1) {
		@Pc(6) Class128_Sub3 local6 = (Class128_Sub3) arg0;
		@Pc(9) Class128_Sub3 local9 = (Class128_Sub3) arg1;
		this.aFloat161 = local9.aFloat157 * local6.aFloat152 + local6.aFloat161 * local9.aFloat161 + local6.aFloat156 * local9.aFloat159;
		this.aFloat159 = local6.aFloat160 * local9.aFloat157 + local9.aFloat161 * local6.aFloat159 + local9.aFloat159 * local6.aFloat158;
		this.aFloat156 = local9.aFloat154 * local6.aFloat152 + local9.aFloat156 * local6.aFloat161 + local9.aFloat158 * local6.aFloat156;
		this.aFloat157 = local9.aFloat159 * local6.aFloat154 + local6.aFloat157 * local9.aFloat161 + local6.aFloat153 * local9.aFloat157;
		this.aFloat158 = local6.aFloat159 * local9.aFloat156 + local6.aFloat158 * local9.aFloat158 + local9.aFloat154 * local6.aFloat160;
		this.aFloat152 = local6.aFloat161 * local9.aFloat152 + local6.aFloat156 * local9.aFloat160 + local9.aFloat153 * local6.aFloat152;
		this.aFloat154 = local6.aFloat153 * local9.aFloat154 + local9.aFloat158 * local6.aFloat154 + local9.aFloat156 * local6.aFloat157;
		this.aFloat160 = local6.aFloat160 * local9.aFloat153 + local6.aFloat159 * local9.aFloat152 + local9.aFloat160 * local6.aFloat158;
		this.aFloat155 = local6.aFloat155 + local6.aFloat156 * local9.aFloat151 + local9.aFloat155 * local6.aFloat161 + local6.aFloat152 * local9.aFloat150;
		this.aFloat153 = local9.aFloat152 * local6.aFloat157 + local6.aFloat154 * local9.aFloat160 + local6.aFloat153 * local9.aFloat153;
		this.aFloat151 = local6.aFloat151 + local9.aFloat150 * local6.aFloat160 + local9.aFloat151 * local6.aFloat158 + local9.aFloat155 * local6.aFloat159;
		this.aFloat150 = local9.aFloat150 * local6.aFloat153 + local9.aFloat151 * local6.aFloat154 + local6.aFloat157 * local9.aFloat155 + local6.aFloat150;
	}

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub2_Sub1.aFloatArray4[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub2_Sub1.aFloatArray3[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat159;
		@Pc(21) float local21 = this.aFloat158;
		@Pc(24) float local24 = this.aFloat160;
		this.aFloat159 = local18 * local9 - this.aFloat157 * local15;
		@Pc(37) float local37 = this.aFloat151;
		this.aFloat158 = local21 * local9 - local15 * this.aFloat154;
		this.aFloat157 = local9 * this.aFloat157 + local18 * local15;
		this.aFloat160 = local9 * local24 - this.aFloat153 * local15;
		this.aFloat154 = local21 * local15 + this.aFloat154 * local9;
		this.aFloat153 = this.aFloat153 * local9 + local15 * local24;
		this.aFloat151 = local9 * local37 - this.aFloat150 * local15;
		this.aFloat150 = this.aFloat150 * local9 + local37 * local15;
	}

	@OriginalMember(owner = "client!sg", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat151 += arg1;
		this.aFloat155 += arg0;
		this.aFloat150 += arg2;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIFIFFI)V")
	public void method6892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg0 == 0) {
			this.aFloat161 = arg1 * 2;
			this.aFloat158 = arg5 * 2;
			this.aFloat153 = 1.0F;
			this.aFloat159 = this.aFloat157 = this.aFloat156 = this.aFloat154 = this.aFloat152 = this.aFloat160 = 0.0F;
		} else {
			@Pc(24) float local24 = Class1_Sub2_Sub1.aFloatArray4[arg0 & 0x3FFF];
			@Pc(30) float local30 = Class1_Sub2_Sub1.aFloatArray3[arg0 & 0x3FFF];
			this.aFloat153 = 1.0F;
			this.aFloat156 = (float) arg5 * -2.0F * local30;
			this.aFloat158 = (float) arg5 * 2.0F * local24;
			this.aFloat157 = this.aFloat154 = this.aFloat152 = this.aFloat160 = 0.0F;
			this.aFloat159 = local30 * 2.0F * (float) arg1;
			this.aFloat161 = (float) arg1 * local24 * 2.0F;
		}
		this.aFloat151 = (float) -arg5 + arg2;
		this.aFloat150 = arg3;
		this.aFloat155 = (float) -arg1 + arg4;
	}

	@OriginalMember(owner = "client!sg", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat153 = 1.0F;
		this.aFloat161 = this.aFloat158 = Class1_Sub2_Sub1.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat159 = Class1_Sub2_Sub1.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat156 = -this.aFloat159;
		this.aFloat152 = this.aFloat155 = this.aFloat160 = this.aFloat151 = this.aFloat157 = this.aFloat154 = this.aFloat150 = 0.0F;
	}

	@OriginalMember(owner = "client!sg", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat161 = this.aFloat158 = this.aFloat153 = 1.0F;
		this.aFloat159 = this.aFloat157 = this.aFloat156 = this.aFloat154 = this.aFloat152 = this.aFloat160 = this.aFloat155 = this.aFloat151 = this.aFloat150 = 0.0F;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[F)[F")
	public float[] method6893(@OriginalArg(1) float[] arg0) {
		arg0[7] = this.aFloat151;
		arg0[0] = this.aFloat161;
		arg0[9] = this.aFloat154;
		arg0[1] = this.aFloat156;
		arg0[15] = 1.0F;
		arg0[2] = this.aFloat152;
		arg0[14] = 0.0F;
		arg0[6] = this.aFloat160;
		arg0[10] = this.aFloat153;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat158;
		arg0[8] = this.aFloat157;
		arg0[3] = this.aFloat155;
		arg0[12] = 0.0F;
		arg0[11] = this.aFloat150;
		arg0[4] = this.aFloat159;
		return arg0;
	}

	@OriginalMember(owner = "client!sg", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat161 = 1.0F;
		this.aFloat158 = this.aFloat153 = Class1_Sub2_Sub1.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat154 = Class1_Sub2_Sub1.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat156 = this.aFloat152 = this.aFloat155 = this.aFloat159 = this.aFloat151 = this.aFloat157 = this.aFloat150 = 0.0F;
		this.aFloat160 = -this.aFloat154;
	}

	@OriginalMember(owner = "client!sg", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub2_Sub1.aFloatArray4[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub2_Sub1.aFloatArray3[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat161;
		@Pc(21) float local21 = this.aFloat156;
		@Pc(24) float local24 = this.aFloat152;
		@Pc(27) float local27 = this.aFloat155;
		this.aFloat161 = this.aFloat157 * local15 + local9 * local18;
		this.aFloat156 = local9 * local21 + this.aFloat154 * local15;
		this.aFloat157 = local9 * this.aFloat157 - local18 * local15;
		this.aFloat152 = local9 * local24 + local15 * this.aFloat153;
		this.aFloat154 = local9 * this.aFloat154 - local15 * local21;
		this.aFloat153 = local9 * this.aFloat153 - local24 * local15;
		this.aFloat155 = this.aFloat150 * local15 + local27 * local9;
		this.aFloat150 = local9 * this.aFloat150 - local15 * local27;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFB)F")
	public float method6894(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat151 + arg1 * this.aFloat159 + arg0 * this.aFloat158 + this.aFloat160 * arg2;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FBFF)V")
	public void method6895(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat154 = 0.0F;
		this.aFloat152 = 0.0F;
		this.aFloat159 = 0.0F;
		this.aFloat156 = 0.0F;
		this.aFloat151 = 0.0F;
		this.aFloat150 = 0.0F;
		this.aFloat155 = 0.0F;
		this.aFloat158 = arg0;
		this.aFloat160 = 0.0F;
		this.aFloat161 = arg2;
		this.aFloat153 = arg1;
		this.aFloat157 = 0.0F;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BFFFF[F)V")
	public void method6896(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		@Pc(2) float local2 = -arg3;
		@Pc(14) float local14 = local2 * arg2;
		@Pc(18) float local18 = arg0 * local2;
		@Pc(22) float local22 = arg1 * local2;
		@Pc(40) float local40 = this.aFloat155 + local14 * this.aFloat161 + local18 * this.aFloat156 + this.aFloat152 * local22;
		@Pc(58) float local58 = this.aFloat151 + this.aFloat158 * local18 + local14 * this.aFloat159 + this.aFloat160 * local22;
		arg4[1] = this.aFloat160 * arg1 + this.aFloat158 * arg0 + arg2 * this.aFloat159;
		arg4[0] = arg0 * this.aFloat156 + this.aFloat161 * arg2 + arg1 * this.aFloat152;
		@Pc(110) float local110 = this.aFloat150 + local22 * this.aFloat153 + local14 * this.aFloat157 + local18 * this.aFloat154;
		arg4[2] = this.aFloat157 * arg2 + this.aFloat154 * arg0 + this.aFloat153 * arg1;
		arg4[3] = -(arg4[0] * local40 + local58 * arg4[1] + local110 * arg4[2]);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFIF)F")
	public float method6897(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat161 * arg2 + this.aFloat156 * arg1 + arg0 * this.aFloat152 + this.aFloat155;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat157 * (float) arg0 + this.aFloat154 * (float) arg1 + (float) arg2 * this.aFloat153 + this.aFloat150);
		arg3[0] = (int) ((float) arg2 * this.aFloat152 + this.aFloat161 * (float) arg0 + this.aFloat156 * (float) arg1 + this.aFloat155);
		arg3[1] = (int) (this.aFloat151 + (float) arg0 * this.aFloat159 + (float) arg1 * this.aFloat158 + (float) arg2 * this.aFloat160);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BFFF)V")
	public void method6898(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat155 += arg0;
		this.aFloat150 += arg1;
		this.aFloat151 += arg2;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public void method6899() {
		this.aFloat157 = -this.aFloat157;
		this.aFloat160 = -this.aFloat160;
		this.aFloat159 = -this.aFloat159;
		this.aFloat151 = -this.aFloat151;
		this.aFloat158 = -this.aFloat158;
		this.aFloat154 = -this.aFloat154;
		this.aFloat153 = -this.aFloat153;
		this.aFloat150 = -this.aFloat150;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFBF[F)V")
	public void method6900(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3) {
		arg3[2] = (float) (arg2 * this.aFloat157 + arg1 * this.aFloat154 + this.aFloat153 * arg0);
		arg3[0] = (float) (this.aFloat156 * arg1 + arg2 * this.aFloat161 + arg0 * this.aFloat152);
		arg3[1] = (float) (this.aFloat160 * arg0 + arg1 * this.aFloat158 + arg2 * this.aFloat159);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "([FB)[F")
	public float[] method6901(@OriginalArg(0) float[] arg0) {
		arg0[15] = 1.0F;
		arg0[12] = this.aFloat155;
		arg0[5] = this.aFloat158;
		arg0[4] = this.aFloat156;
		arg0[9] = this.aFloat160;
		arg0[10] = this.aFloat153;
		arg0[1] = this.aFloat159;
		arg0[3] = 0.0F;
		arg0[14] = this.aFloat150;
		arg0[6] = this.aFloat154;
		arg0[8] = this.aFloat152;
		arg0[2] = this.aFloat157;
		arg0[13] = this.aFloat151;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[0] = this.aFloat161;
		return arg0;
	}

	@OriginalMember(owner = "client!sg", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat158 + (float) arg0 * this.aFloat159 + (float) arg2 * this.aFloat160);
		arg3[0] = (int) ((float) arg2 * this.aFloat152 + this.aFloat161 * (float) arg0 + this.aFloat156 * (float) arg1);
		arg3[2] = (int) (this.aFloat153 * (float) arg2 + this.aFloat157 * (float) arg0 + this.aFloat154 * (float) arg1);
	}

	@OriginalMember(owner = "client!sg", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class128 arg0) {
		@Pc(6) Class128_Sub3 local6 = (Class128_Sub3) arg0;
		this.aFloat157 = local6.aFloat157;
		this.aFloat159 = local6.aFloat159;
		this.aFloat155 = local6.aFloat155;
		this.aFloat150 = local6.aFloat150;
		this.aFloat156 = local6.aFloat156;
		this.aFloat158 = local6.aFloat158;
		this.aFloat161 = local6.aFloat161;
		this.aFloat151 = local6.aFloat151;
		this.aFloat152 = local6.aFloat152;
		this.aFloat160 = local6.aFloat160;
		this.aFloat154 = local6.aFloat154;
		this.aFloat153 = local6.aFloat153;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!m;B)V")
	public void method6902(@OriginalArg(0) Class128 arg0) {
		@Pc(6) Class128_Sub3 local6 = (Class128_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat161;
		@Pc(12) float local12 = this.aFloat159;
		@Pc(15) float local15 = this.aFloat156;
		@Pc(18) float local18 = this.aFloat158;
		@Pc(21) float local21 = this.aFloat152;
		@Pc(24) float local24 = this.aFloat160;
		@Pc(27) float local27 = this.aFloat155;
		@Pc(30) float local30 = this.aFloat151;
		this.aFloat159 = this.aFloat157 * local6.aFloat160 + local6.aFloat159 * local9 + local12 * local6.aFloat158;
		this.aFloat161 = this.aFloat157 * local6.aFloat152 + local9 * local6.aFloat161 + local6.aFloat156 * local12;
		this.aFloat156 = local15 * local6.aFloat161 + local6.aFloat156 * local18 + local6.aFloat152 * this.aFloat154;
		this.aFloat158 = local18 * local6.aFloat158 + local15 * local6.aFloat159 + this.aFloat154 * local6.aFloat160;
		this.aFloat157 = local6.aFloat153 * this.aFloat157 + local6.aFloat157 * local9 + local12 * local6.aFloat154;
		this.aFloat154 = this.aFloat154 * local6.aFloat153 + local6.aFloat154 * local18 + local6.aFloat157 * local15;
		this.aFloat160 = local24 * local6.aFloat158 + local6.aFloat159 * local21 + local6.aFloat160 * this.aFloat153;
		this.aFloat152 = this.aFloat153 * local6.aFloat152 + local21 * local6.aFloat161 + local6.aFloat156 * local24;
		this.aFloat151 = this.aFloat150 * local6.aFloat160 + local30 * local6.aFloat158 + local6.aFloat159 * local27 + local6.aFloat151;
		this.aFloat153 = local6.aFloat153 * this.aFloat153 + local6.aFloat154 * local24 + local6.aFloat157 * local21;
		this.aFloat155 = local30 * local6.aFloat156 + local6.aFloat161 * local27 + local6.aFloat152 * this.aFloat150 + local6.aFloat155;
		this.aFloat150 = this.aFloat150 * local6.aFloat153 + local6.aFloat157 * local27 + local6.aFloat154 * local30 + local6.aFloat150;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(FFFB)V")
	public void method6903(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat155 = arg1;
		this.aFloat151 = arg0;
		this.aFloat161 = this.aFloat158 = this.aFloat153 = 1.0F;
		this.aFloat159 = this.aFloat157 = this.aFloat156 = this.aFloat154 = this.aFloat152 = this.aFloat160 = 0.0F;
		this.aFloat150 = arg2;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class128 method6887() {
		@Pc(7) Class128_Sub3 local7 = new Class128_Sub3();
		local7.aFloat154 = this.aFloat154;
		local7.aFloat152 = this.aFloat152;
		local7.aFloat150 = this.aFloat150;
		local7.aFloat160 = this.aFloat160;
		local7.aFloat157 = this.aFloat157;
		local7.aFloat153 = this.aFloat153;
		local7.aFloat161 = this.aFloat161;
		local7.aFloat156 = this.aFloat156;
		local7.aFloat159 = this.aFloat159;
		local7.aFloat155 = this.aFloat155;
		local7.aFloat158 = this.aFloat158;
		local7.aFloat151 = this.aFloat151;
		return local7;
	}

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class1_Sub2_Sub1.aFloatArray4[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub2_Sub1.aFloatArray3[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class1_Sub2_Sub1.aFloatArray4[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class1_Sub2_Sub1.aFloatArray3[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class1_Sub2_Sub1.aFloatArray4[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class1_Sub2_Sub1.aFloatArray3[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat158 = local9 * local33;
		this.aFloat154 = -local15;
		this.aFloat152 = local21 * local47 + local33 * -local27;
		this.aFloat160 = local21 * local43 + local39 * local27;
		this.aFloat153 = local9 * local21;
		this.aFloat157 = local9 * local27;
		this.aFloat159 = local39 * -local21 + local43 * local27;
		this.aFloat156 = local9 * local39;
		this.aFloat161 = local21 * local33 + local47 * local27;
		this.aFloat150 = this.aFloat157 * (float) -arg0 - (float) arg1 * this.aFloat154 - this.aFloat153 * (float) arg2;
		this.aFloat155 = (float) -arg0 * this.aFloat161 - (float) arg1 * this.aFloat156 - this.aFloat152 * (float) arg2;
		this.aFloat151 = -((float) arg1 * this.aFloat158) + (float) -arg0 * this.aFloat159 - this.aFloat160 * (float) arg2;
	}

	@OriginalMember(owner = "client!sg", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat155;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat151;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat150;
		arg0[0] = (int) (local29 * this.aFloat157 + this.aFloat159 * local20 + local11 * this.aFloat161);
		arg0[2] = (int) (this.aFloat160 * local20 + local11 * this.aFloat152 + this.aFloat153 * local29);
		arg0[1] = (int) (this.aFloat154 * local29 + this.aFloat156 * local11 + this.aFloat158 * local20);
	}

	@OriginalMember(owner = "client!sg", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat161 = this.aFloat158 = this.aFloat153 = 1.0F;
		this.aFloat151 = arg1;
		this.aFloat159 = this.aFloat157 = this.aFloat156 = this.aFloat154 = this.aFloat152 = this.aFloat160 = 0.0F;
		this.aFloat155 = arg0;
		this.aFloat150 = arg2;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFBFFFFFFF)V")
	public void method6904(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat160 = arg6;
		this.aFloat152 = arg3;
		this.aFloat154 = arg0;
		this.aFloat150 = 0.0F;
		this.aFloat151 = 0.0F;
		this.aFloat156 = arg4;
		this.aFloat157 = arg8;
		this.aFloat155 = 0.0F;
		this.aFloat159 = arg7;
		this.aFloat153 = arg5;
		this.aFloat161 = arg2;
		this.aFloat158 = arg1;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(FFIF)V")
	public void method6906(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat161 *= arg2;
		this.aFloat156 *= arg2;
		this.aFloat151 *= arg1;
		this.aFloat155 *= arg2;
		this.aFloat157 *= arg0;
		this.aFloat154 *= arg0;
		this.aFloat150 *= arg0;
		this.aFloat160 *= arg1;
		this.aFloat159 *= arg1;
		this.aFloat158 *= arg1;
		this.aFloat152 *= arg2;
		this.aFloat153 *= arg0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLclient!m;)V")
	public void method6907(@OriginalArg(1) Class128 arg0) {
		@Pc(6) Class128_Sub3 local6 = (Class128_Sub3) arg0;
		this.aFloat156 = local6.aFloat159;
		this.aFloat161 = local6.aFloat161;
		this.aFloat152 = local6.aFloat157;
		this.aFloat158 = local6.aFloat158;
		this.aFloat159 = local6.aFloat156;
		this.aFloat160 = local6.aFloat154;
		this.aFloat157 = local6.aFloat152;
		this.aFloat153 = local6.aFloat153;
		this.aFloat155 = -(this.aFloat161 * local6.aFloat155 + local6.aFloat151 * this.aFloat156 + this.aFloat152 * local6.aFloat150);
		this.aFloat154 = local6.aFloat160;
		this.aFloat151 = -(this.aFloat159 * local6.aFloat155 + this.aFloat158 * local6.aFloat151 + local6.aFloat150 * this.aFloat160);
		this.aFloat150 = -(local6.aFloat150 * this.aFloat153 + this.aFloat154 * local6.aFloat151 + this.aFloat157 * local6.aFloat155);
	}

	@OriginalMember(owner = "client!sg", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat158 = 1.0F;
		this.aFloat161 = this.aFloat153 = Class1_Sub2_Sub1.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat152 = Class1_Sub2_Sub1.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat156 = this.aFloat155 = this.aFloat159 = this.aFloat160 = this.aFloat151 = this.aFloat154 = this.aFloat150 = 0.0F;
		this.aFloat157 = -this.aFloat152;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "([FI)[F")
	public float[] method6908(@OriginalArg(0) float[] arg0) {
		arg0[5] = this.aFloat158;
		arg0[7] = this.aFloat151;
		arg0[0] = this.aFloat161;
		arg0[6] = this.aFloat160;
		arg0[1] = this.aFloat156;
		arg0[3] = this.aFloat155;
		arg0[4] = this.aFloat159;
		arg0[2] = this.aFloat152;
		return arg0;
	}
}
