import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!caa", name = "q", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!caa", name = "s", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!caa", name = "w", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!caa", name = "y", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!caa", name = "E", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!caa", name = "I", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!caa", name = "P", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!caa", name = "S", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!caa", name = "U", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!caa", name = "ab", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!caa", name = "bb", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V")
	public Class34_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!caa", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat24 = 1.0F;
		this.aFloat17 = this.aFloat15 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		this.aFloat21 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		this.aFloat16 = -this.aFloat21;
		this.aFloat14 = this.aFloat18 = this.aFloat23 = this.aFloat19 = this.aFloat13 = this.aFloat22 = this.aFloat20 = 0.0F;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z[F)[F")
	public float[] method887(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat17;
		arg0[5] = this.aFloat15;
		arg0[7] = this.aFloat19;
		arg0[2] = this.aFloat14;
		arg0[6] = this.aFloat23;
		arg0[1] = this.aFloat16;
		arg0[4] = this.aFloat21;
		arg0[3] = this.aFloat18;
		return arg0;
	}

	@OriginalMember(owner = "client!caa", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat18;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat19;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat20;
		arg0[1] = (int) (local11 * this.aFloat16 + this.aFloat15 * local19 + local27 * this.aFloat22);
		arg0[2] = (int) (local19 * this.aFloat23 + this.aFloat14 * local11 + this.aFloat24 * local27);
		arg0[0] = (int) (local11 * this.aFloat17 + this.aFloat21 * local19 + local27 * this.aFloat13);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "([FI)[F")
	public float[] method888(@OriginalArg(0) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[10] = this.aFloat24;
		arg0[1] = this.aFloat16;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat13;
		arg0[7] = this.aFloat19;
		arg0[3] = this.aFloat18;
		arg0[11] = this.aFloat20;
		arg0[12] = 0.0F;
		arg0[2] = this.aFloat14;
		arg0[5] = this.aFloat15;
		arg0[0] = this.aFloat17;
		arg0[6] = this.aFloat23;
		arg0[9] = this.aFloat22;
		arg0[4] = this.aFloat21;
		return arg0;
	}

	@OriginalMember(owner = "client!caa", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat17 = 1.0F;
		this.aFloat15 = this.aFloat24 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		this.aFloat22 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		this.aFloat16 = this.aFloat14 = this.aFloat18 = this.aFloat21 = this.aFloat19 = this.aFloat13 = this.aFloat20 = 0.0F;
		this.aFloat23 = -this.aFloat22;
	}

	@OriginalMember(owner = "client!caa", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat18 += arg0;
		this.aFloat19 += arg1;
		this.aFloat20 += arg2;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat19 + this.aFloat23 * (float) arg2 + this.aFloat21 * (float) arg0 + (float) arg1 * this.aFloat15);
		arg3[0] = (int) ((float) arg2 * this.aFloat14 + (float) arg1 * this.aFloat16 + (float) arg0 * this.aFloat17 + this.aFloat18);
		arg3[2] = (int) ((float) arg1 * this.aFloat22 + this.aFloat13 * (float) arg0 + (float) arg2 * this.aFloat24 + this.aFloat20);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BLclient!q;)V")
	public void method889(@OriginalArg(1) Class34 arg0) {
		@Pc(6) Class34_Sub1 local6 = (Class34_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat17;
		@Pc(12) float local12 = this.aFloat21;
		@Pc(15) float local15 = this.aFloat16;
		@Pc(18) float local18 = this.aFloat15;
		@Pc(21) float local21 = this.aFloat14;
		@Pc(24) float local24 = this.aFloat23;
		@Pc(27) float local27 = this.aFloat18;
		this.aFloat21 = local6.aFloat21 * local9 + local12 * local6.aFloat15 + local6.aFloat23 * this.aFloat13;
		this.aFloat17 = this.aFloat13 * local6.aFloat14 + local6.aFloat16 * local12 + local6.aFloat17 * local9;
		@Pc(64) float local64 = this.aFloat19;
		this.aFloat13 = this.aFloat13 * local6.aFloat24 + local6.aFloat13 * local9 + local6.aFloat22 * local12;
		this.aFloat15 = local6.aFloat15 * local18 + local6.aFloat21 * local15 + this.aFloat22 * local6.aFloat23;
		this.aFloat16 = local6.aFloat14 * this.aFloat22 + local18 * local6.aFloat16 + local6.aFloat17 * local15;
		this.aFloat14 = local6.aFloat14 * this.aFloat24 + local6.aFloat16 * local24 + local6.aFloat17 * local21;
		this.aFloat22 = local15 * local6.aFloat13 + local18 * local6.aFloat22 + this.aFloat22 * local6.aFloat24;
		this.aFloat23 = local6.aFloat23 * this.aFloat24 + local6.aFloat15 * local24 + local6.aFloat21 * local21;
		this.aFloat19 = local64 * local6.aFloat15 + local27 * local6.aFloat21 + this.aFloat20 * local6.aFloat23 + local6.aFloat19;
		this.aFloat24 = local21 * local6.aFloat13 + local24 * local6.aFloat22 + this.aFloat24 * local6.aFloat24;
		this.aFloat18 = local6.aFloat18 + local6.aFloat17 * local27 + local6.aFloat16 * local64 + local6.aFloat14 * this.aFloat20;
		this.aFloat20 = local6.aFloat20 + local6.aFloat24 * this.aFloat20 + local27 * local6.aFloat13 + local64 * local6.aFloat22;
	}

	@OriginalMember(owner = "client!caa", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat17;
		@Pc(21) float local21 = this.aFloat16;
		@Pc(24) float local24 = this.aFloat14;
		@Pc(27) float local27 = this.aFloat18;
		this.aFloat17 = this.aFloat13 * local15 + local9 * local18;
		this.aFloat13 = local9 * this.aFloat13 - local18 * local15;
		this.aFloat16 = local15 * this.aFloat22 + local21 * local9;
		this.aFloat22 = local9 * this.aFloat22 - local15 * local21;
		this.aFloat14 = local9 * local24 + local15 * this.aFloat24;
		this.aFloat24 = this.aFloat24 * local9 - local24 * local15;
		this.aFloat18 = local15 * this.aFloat20 + local9 * local27;
		this.aFloat20 = this.aFloat20 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B[FFFFF)V")
	public void method890(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg0[2] = arg1 * this.aFloat22 + this.aFloat13 * arg4 + arg2 * this.aFloat24;
		arg0[1] = this.aFloat23 * arg2 + this.aFloat21 * arg4 + arg1 * this.aFloat15;
		@Pc(68) float local68;
		@Pc(76) float local76;
		@Pc(84) float local84;
		@Pc(60) float local60;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local60 = -arg3 / arg4;
			local68 = local60 * this.aFloat17 + this.aFloat18;
			local76 = this.aFloat19 + local60 * this.aFloat21;
			local84 = local60 * this.aFloat13 + this.aFloat20;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local60 = -arg3 / arg1;
			local68 = this.aFloat16 * local60 + this.aFloat18;
			local84 = local60 * this.aFloat22 + this.aFloat20;
			local76 = this.aFloat15 * local60 + this.aFloat19;
		} else {
			local60 = -arg3 / arg2;
			local76 = this.aFloat19 + this.aFloat23 * local60;
			local84 = this.aFloat20 + local60 * this.aFloat24;
			local68 = local60 * this.aFloat14 + this.aFloat18;
		}
		arg0[0] = arg1 * this.aFloat16 + arg4 * this.aFloat17 + this.aFloat14 * arg2;
		arg0[3] = -(local84 * arg0[2] + arg0[1] * local76 + local68 * arg0[0]);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(FFIF)F")
	public float method891(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat20 + this.aFloat24 * arg1 + arg2 * this.aFloat13 + this.aFloat22 * arg0;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6215() {
		@Pc(7) Class34_Sub1 local7 = new Class34_Sub1();
		local7.aFloat15 = this.aFloat15;
		local7.aFloat23 = this.aFloat23;
		local7.aFloat19 = this.aFloat19;
		local7.aFloat22 = this.aFloat22;
		local7.aFloat17 = this.aFloat17;
		local7.aFloat16 = this.aFloat16;
		local7.aFloat20 = this.aFloat20;
		local7.aFloat21 = this.aFloat21;
		local7.aFloat24 = this.aFloat24;
		local7.aFloat13 = this.aFloat13;
		local7.aFloat14 = this.aFloat14;
		local7.aFloat18 = this.aFloat18;
		return local7;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BF[FFF)V")
	public void method893(@OriginalArg(1) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg1[2] = this.aFloat13 * arg3 + arg0 * this.aFloat22 + arg2 * this.aFloat24;
		arg1[1] = arg3 * this.aFloat21 + this.aFloat15 * arg0 + this.aFloat23 * arg2;
		arg1[0] = arg2 * this.aFloat14 + this.aFloat17 * arg3 + this.aFloat16 * arg0;
	}

	@OriginalMember(owner = "client!caa", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat17;
		@Pc(21) float local21 = this.aFloat16;
		@Pc(24) float local24 = this.aFloat14;
		@Pc(27) float local27 = this.aFloat18;
		this.aFloat17 = local18 * local9 - this.aFloat21 * local15;
		this.aFloat16 = local9 * local21 - local15 * this.aFloat15;
		this.aFloat21 = local15 * local18 + this.aFloat21 * local9;
		this.aFloat15 = local21 * local15 + this.aFloat15 * local9;
		this.aFloat14 = local24 * local9 - this.aFloat23 * local15;
		this.aFloat18 = local9 * local27 - this.aFloat19 * local15;
		this.aFloat23 = local24 * local15 + this.aFloat23 * local9;
		this.aFloat19 = local27 * local15 + this.aFloat19 * local9;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(FFFI)V")
	public void method894(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat17 = arg0;
		this.aFloat20 = 0.0F;
		this.aFloat18 = 0.0F;
		this.aFloat21 = 0.0F;
		this.aFloat14 = 0.0F;
		this.aFloat24 = arg2;
		this.aFloat15 = arg1;
		this.aFloat13 = 0.0F;
		this.aFloat23 = 0.0F;
		this.aFloat19 = 0.0F;
		this.aFloat16 = 0.0F;
		this.aFloat22 = 0.0F;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(FFFI)V")
	public void method895(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat14 *= arg1;
		this.aFloat19 *= arg2;
		this.aFloat16 *= arg1;
		this.aFloat13 *= arg0;
		this.aFloat17 *= arg1;
		this.aFloat22 *= arg0;
		this.aFloat23 *= arg2;
		this.aFloat15 *= arg2;
		this.aFloat24 *= arg0;
		this.aFloat20 *= arg0;
		this.aFloat21 *= arg2;
		this.aFloat18 *= arg1;
	}

	@OriginalMember(owner = "client!caa", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class209_Sub2_Sub1.aFloatArray90[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class209_Sub2_Sub1.aFloatArray89[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class209_Sub2_Sub1.aFloatArray90[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class209_Sub2_Sub1.aFloatArray89[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class209_Sub2_Sub1.aFloatArray90[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class209_Sub2_Sub1.aFloatArray89[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat21 = -local21 * local39 + local27 * local43;
		this.aFloat23 = local43 * local21 + local39 * local27;
		this.aFloat14 = -local27 * local33 + local21 * local47;
		this.aFloat15 = local9 * local33;
		this.aFloat16 = local39 * local9;
		this.aFloat24 = local21 * local9;
		this.aFloat22 = -local15;
		this.aFloat17 = local47 * local27 + local33 * local21;
		this.aFloat13 = local9 * local27;
		this.aFloat20 = -(this.aFloat22 * (float) arg1) + (float) -arg0 * this.aFloat13 - (float) arg2 * this.aFloat24;
		this.aFloat18 = this.aFloat17 * (float) -arg0 - (float) arg1 * this.aFloat16 - (float) arg2 * this.aFloat14;
		this.aFloat19 = this.aFloat21 * (float) -arg0 - (float) arg1 * this.aFloat15 - (float) arg2 * this.aFloat23;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method896(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1) {
		@Pc(6) Class34_Sub1 local6 = (Class34_Sub1) arg0;
		@Pc(9) Class34_Sub1 local9 = (Class34_Sub1) arg1;
		this.aFloat17 = local9.aFloat21 * local6.aFloat16 + local9.aFloat17 * local6.aFloat17 + local9.aFloat13 * local6.aFloat14;
		this.aFloat21 = local9.aFloat17 * local6.aFloat21 + local9.aFloat21 * local6.aFloat15 + local9.aFloat13 * local6.aFloat23;
		this.aFloat16 = local9.aFloat22 * local6.aFloat14 + local9.aFloat16 * local6.aFloat17 + local9.aFloat15 * local6.aFloat16;
		this.aFloat13 = local6.aFloat24 * local9.aFloat13 + local6.aFloat22 * local9.aFloat21 + local6.aFloat13 * local9.aFloat17;
		this.aFloat15 = local9.aFloat16 * local6.aFloat21 + local9.aFloat15 * local6.aFloat15 + local6.aFloat23 * local9.aFloat22;
		this.aFloat14 = local9.aFloat14 * local6.aFloat17 + local9.aFloat23 * local6.aFloat16 + local9.aFloat24 * local6.aFloat14;
		this.aFloat22 = local9.aFloat22 * local6.aFloat24 + local6.aFloat13 * local9.aFloat16 + local6.aFloat22 * local9.aFloat15;
		this.aFloat23 = local9.aFloat24 * local6.aFloat23 + local9.aFloat23 * local6.aFloat15 + local6.aFloat21 * local9.aFloat14;
		this.aFloat24 = local6.aFloat22 * local9.aFloat23 + local6.aFloat13 * local9.aFloat14 + local9.aFloat24 * local6.aFloat24;
		this.aFloat18 = local6.aFloat18 + local6.aFloat14 * local9.aFloat20 + local6.aFloat16 * local9.aFloat19 + local6.aFloat17 * local9.aFloat18;
		this.aFloat19 = local6.aFloat19 + local9.aFloat19 * local6.aFloat15 + local9.aFloat18 * local6.aFloat21 + local6.aFloat23 * local9.aFloat20;
		this.aFloat20 = local6.aFloat20 + local6.aFloat13 * local9.aFloat18 + local6.aFloat22 * local9.aFloat19 + local9.aFloat20 * local6.aFloat24;
	}

	@OriginalMember(owner = "client!caa", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class34 arg0) {
		@Pc(6) Class34_Sub1 local6 = (Class34_Sub1) arg0;
		this.aFloat24 = local6.aFloat24;
		this.aFloat23 = local6.aFloat23;
		this.aFloat18 = local6.aFloat18;
		this.aFloat20 = local6.aFloat20;
		this.aFloat16 = local6.aFloat16;
		this.aFloat21 = local6.aFloat21;
		this.aFloat14 = local6.aFloat14;
		this.aFloat22 = local6.aFloat22;
		this.aFloat15 = local6.aFloat15;
		this.aFloat17 = local6.aFloat17;
		this.aFloat19 = local6.aFloat19;
		this.aFloat13 = local6.aFloat13;
	}

	@OriginalMember(owner = "client!caa", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat15 = 1.0F;
		this.aFloat17 = this.aFloat24 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		this.aFloat14 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		this.aFloat16 = this.aFloat18 = this.aFloat21 = this.aFloat23 = this.aFloat19 = this.aFloat22 = this.aFloat20 = 0.0F;
		this.aFloat13 = -this.aFloat14;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V")
	public void method897() {
		this.aFloat23 = -this.aFloat23;
		this.aFloat22 = -this.aFloat22;
		this.aFloat21 = -this.aFloat21;
		this.aFloat24 = -this.aFloat24;
		this.aFloat20 = -this.aFloat20;
		this.aFloat19 = -this.aFloat19;
		this.aFloat15 = -this.aFloat15;
		this.aFloat13 = -this.aFloat13;
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(FFFI)F")
	public float method898(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg2 * this.aFloat23 + this.aFloat15 * arg1 + this.aFloat21 * arg0 + this.aFloat19;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(Z[F)[F")
	public float[] method900(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat16;
		arg0[12] = 0.0F;
		arg0[2] = this.aFloat14;
		arg0[5] = this.aFloat15;
		arg0[0] = this.aFloat17;
		arg0[4] = this.aFloat21;
		arg0[15] = 0.0F;
		arg0[11] = 0.0F;
		arg0[3] = 0.0F;
		arg0[14] = 0.0F;
		arg0[13] = 0.0F;
		arg0[6] = this.aFloat23;
		arg0[10] = this.aFloat24;
		arg0[9] = this.aFloat22;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloat13;
		return arg0;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IFFF)V")
	public void method901(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat18 = arg2;
		this.aFloat20 = arg1;
		this.aFloat21 = this.aFloat13 = this.aFloat16 = this.aFloat22 = this.aFloat14 = this.aFloat23 = 0.0F;
		this.aFloat19 = arg0;
		this.aFloat17 = this.aFloat15 = this.aFloat24 = 1;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IFIIIFF)V")
	public void method902(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat24 = 1.0F;
			this.aFloat18 = (float) -arg1 + arg0;
			this.aFloat20 = arg5;
			this.aFloat19 = arg4 - (float) arg2;
			this.aFloat15 = arg2 * 2;
			this.aFloat17 = arg1 * 2;
			this.aFloat21 = this.aFloat13 = this.aFloat16 = this.aFloat22 = this.aFloat14 = this.aFloat23 = 0.0F;
			return;
		}
		@Pc(58) float local58 = Class209_Sub2_Sub1.aFloatArray90[arg3 & 0x3FFF];
		@Pc(64) float local64 = Class209_Sub2_Sub1.aFloatArray89[arg3 & 0x3FFF];
		this.aFloat21 = (float) arg1 * 2.0F * local64;
		this.aFloat18 = arg0 + (local64 * 0.5F - local58 * 0.5F) * (float) (arg1 * 2);
		this.aFloat13 = this.aFloat22 = this.aFloat14 = this.aFloat23 = 0.0F;
		this.aFloat24 = 1.0F;
		this.aFloat20 = arg5;
		this.aFloat16 = (float) arg2 * -2.0F * local64;
		this.aFloat17 = local58 * 2.0F * (float) arg1;
		this.aFloat15 = local58 * 2.0F * (float) arg2;
		this.aFloat19 = (float) (arg2 * 2) * (local64 * -0.5F - local58 * 0.5F) + arg4;
	}

	@OriginalMember(owner = "client!caa", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat17 * (float) arg0 + this.aFloat16 * (float) arg1 + (float) arg2 * this.aFloat14);
		arg3[1] = (int) ((float) arg2 * this.aFloat23 + (float) arg1 * this.aFloat15 + this.aFloat21 * (float) arg0);
		arg3[2] = (int) ((float) arg2 * this.aFloat24 + this.aFloat13 * (float) arg0 + (float) arg1 * this.aFloat22);
	}

	@OriginalMember(owner = "client!caa", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat21 = this.aFloat13 = this.aFloat16 = this.aFloat22 = this.aFloat14 = this.aFloat23 = 0.0F;
		this.aFloat18 = arg0;
		this.aFloat20 = arg2;
		this.aFloat17 = this.aFloat15 = this.aFloat24 = 1.0F;
		this.aFloat19 = arg1;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "([FI)[F")
	public float[] method903(@OriginalArg(0) float[] arg0) {
		arg0[9] = this.aFloat23;
		arg0[6] = this.aFloat22;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloat16;
		arg0[11] = 0.0F;
		arg0[2] = this.aFloat13;
		arg0[1] = this.aFloat21;
		arg0[13] = this.aFloat19;
		arg0[10] = this.aFloat24;
		arg0[15] = 1.0F;
		arg0[7] = 0.0F;
		arg0[12] = this.aFloat18;
		arg0[0] = this.aFloat17;
		arg0[8] = this.aFloat14;
		arg0[14] = this.aFloat20;
		arg0[5] = this.aFloat15;
		return arg0;
	}

	@OriginalMember(owner = "client!caa", name = "B", descriptor = "(III[I)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg2 - this.aFloat20);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat19);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat18);
		arg3[2] = (int) ((float) local10 * this.aFloat24 + this.aFloat23 * (float) local17 + (float) local24 * this.aFloat14);
		arg3[0] = (int) ((float) local17 * this.aFloat21 + (float) local24 * this.aFloat17 + this.aFloat13 * (float) local10);
		arg3[1] = (int) ((float) local24 * this.aFloat16 + this.aFloat15 * (float) local17 + this.aFloat22 * (float) local10);
	}

	@OriginalMember(owner = "client!caa", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat17 = this.aFloat15 = this.aFloat24 = 1.0F;
		this.aFloat21 = this.aFloat13 = this.aFloat16 = this.aFloat22 = this.aFloat14 = this.aFloat23 = this.aFloat18 = this.aFloat19 = this.aFloat20 = 0.0F;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZFFF)F")
	public float method904(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat18 + this.aFloat14 * arg2 + this.aFloat17 * arg0 + arg1 * this.aFloat16;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(FFFFFFFBFF)V")
	public void method905(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat14 = arg4;
		this.aFloat15 = arg8;
		this.aFloat18 = 0.0F;
		this.aFloat24 = arg7;
		this.aFloat22 = arg3;
		this.aFloat23 = arg5;
		this.aFloat19 = 0.0F;
		this.aFloat21 = arg0;
		this.aFloat13 = arg6;
		this.aFloat17 = arg2;
		this.aFloat16 = arg1;
		this.aFloat20 = 0.0F;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(BLclient!q;)V")
	public void method906(@OriginalArg(1) Class34 arg0) {
		@Pc(6) Class34_Sub1 local6 = (Class34_Sub1) arg0;
		this.aFloat17 = local6.aFloat17;
		this.aFloat16 = local6.aFloat21;
		this.aFloat14 = local6.aFloat13;
		this.aFloat13 = local6.aFloat14;
		this.aFloat15 = local6.aFloat15;
		this.aFloat23 = local6.aFloat22;
		this.aFloat21 = local6.aFloat16;
		this.aFloat24 = local6.aFloat24;
		this.aFloat18 = -(local6.aFloat20 * this.aFloat14 + this.aFloat16 * local6.aFloat19 + this.aFloat17 * local6.aFloat18);
		this.aFloat22 = local6.aFloat23;
		this.aFloat19 = -(local6.aFloat20 * this.aFloat23 + this.aFloat15 * local6.aFloat19 + this.aFloat21 * local6.aFloat18);
		this.aFloat20 = -(this.aFloat24 * local6.aFloat20 + this.aFloat22 * local6.aFloat19 + local6.aFloat18 * this.aFloat13);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(FBFF)V")
	public void method907(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat19 += arg0;
		this.aFloat18 += arg2;
		this.aFloat20 += arg1;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!q;B)V")
	public void method908(@OriginalArg(0) Class34 arg0) {
		@Pc(6) Class34_Sub1 local6 = (Class34_Sub1) arg0;
		this.aFloat21 = local6.aFloat21;
		this.aFloat24 = local6.aFloat24;
		this.aFloat18 = 0.0F;
		this.aFloat23 = local6.aFloat23;
		this.aFloat15 = local6.aFloat15;
		this.aFloat13 = local6.aFloat13;
		this.aFloat17 = local6.aFloat17;
		this.aFloat22 = local6.aFloat22;
		this.aFloat14 = local6.aFloat14;
		this.aFloat16 = local6.aFloat16;
		this.aFloat19 = 0.0F;
		this.aFloat20 = 0.0F;
	}

	@OriginalMember(owner = "client!caa", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat21;
		@Pc(21) float local21 = this.aFloat15;
		@Pc(24) float local24 = this.aFloat23;
		this.aFloat21 = local18 * local9 - this.aFloat13 * local15;
		@Pc(37) float local37 = this.aFloat19;
		this.aFloat15 = local21 * local9 - local15 * this.aFloat22;
		this.aFloat13 = local18 * local15 + local9 * this.aFloat13;
		this.aFloat22 = local21 * local15 + local9 * this.aFloat22;
		this.aFloat23 = local24 * local9 - this.aFloat24 * local15;
		this.aFloat19 = local37 * local9 - local15 * this.aFloat20;
		this.aFloat24 = local24 * local15 + local9 * this.aFloat24;
		this.aFloat20 = local9 * this.aFloat20 + local37 * local15;
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "([FI)[F")
	public float[] method909(@OriginalArg(0) float[] arg0) {
		arg0[11] = 0.0F;
		arg0[7] = 0.0F;
		arg0[10] = this.aFloat20;
		arg0[2] = 0.0F;
		arg0[9] = this.aFloat19;
		arg0[14] = 0.0F;
		arg0[8] = this.aFloat18;
		arg0[3] = 0.0F;
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat17;
		arg0[12] = 0.0F;
		arg0[4] = this.aFloat16;
		arg0[1] = this.aFloat21;
		arg0[5] = this.aFloat15;
		arg0[15] = 1;
		arg0[6] = 0.0F;
		return arg0;
	}
}
