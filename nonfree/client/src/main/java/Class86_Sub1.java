import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dla")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!dla", name = "n", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!dla", name = "D", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!dla", name = "q", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!dla", name = "A", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!dla", name = "l", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!dla", name = "d", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!dla", name = "J", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!dla", name = "B", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!dla", name = "k", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!dla", name = "p", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!dla", name = "G", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!dla", name = "<init>", descriptor = "()V")
	public Class86_Sub1() {
		this.method7024();
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "()Lclient!gw;")
	@Override
	public Class86 method7018() {
		@Pc(7) Class86_Sub1 local7 = new Class86_Sub1();
		local7.aFloat19 = this.aFloat19;
		local7.aFloat16 = this.aFloat16;
		local7.aFloat11 = this.aFloat11;
		local7.aFloat20 = this.aFloat20;
		local7.aFloat17 = this.aFloat17;
		local7.aFloat18 = this.aFloat18;
		local7.aFloat14 = this.aFloat14;
		local7.aFloat15 = this.aFloat15;
		local7.aFloat22 = this.aFloat22;
		local7.aFloat21 = this.aFloat21;
		local7.aFloat13 = this.aFloat13;
		local7.aFloat12 = this.aFloat12;
		return local7;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(Lclient!gw;)V")
	@Override
	public void method7032(@OriginalArg(0) Class86 arg0) {
		@Pc(6) Class86_Sub1 local6 = (Class86_Sub1) arg0;
		this.aFloat22 = local6.aFloat22;
		this.aFloat19 = local6.aFloat19;
		this.aFloat16 = local6.aFloat16;
		this.aFloat13 = local6.aFloat13;
		this.aFloat11 = local6.aFloat11;
		this.aFloat12 = local6.aFloat12;
		this.aFloat18 = local6.aFloat18;
		this.aFloat21 = local6.aFloat21;
		this.aFloat17 = local6.aFloat17;
		this.aFloat14 = local6.aFloat14;
		this.aFloat20 = local6.aFloat20;
		this.aFloat15 = local6.aFloat15;
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(III)V")
	@Override
	public void method7026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat22 = (float) arg2;
		this.aFloat13 = (float) arg1;
		this.aFloat21 = (float) arg0;
		this.aFloat15 = this.aFloat12 = this.aFloat11 = this.aFloat20 = this.aFloat14 = this.aFloat18 = 0.0F;
		this.aFloat17 = this.aFloat16 = this.aFloat19 = 1.0F;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat22 += (float) arg2;
		this.aFloat13 += (float) arg1;
		this.aFloat21 += (float) arg0;
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(I)V")
	@Override
	public void method7029(@OriginalArg(0) int arg0) {
		this.aFloat19 = 1.0F;
		this.aFloat17 = this.aFloat16 = Class24.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat15 = Class24.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat11 = -this.aFloat15;
		this.aFloat14 = this.aFloat21 = this.aFloat18 = this.aFloat13 = this.aFloat12 = this.aFloat20 = this.aFloat22 = 0.0F;
	}

	@OriginalMember(owner = "client!dla", name = "d", descriptor = "(I)V")
	@Override
	public void method7022(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class24.aFloatArray3[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class24.aFloatArray4[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat17;
		@Pc(21) float local21 = this.aFloat11;
		@Pc(24) float local24 = this.aFloat14;
		this.aFloat17 = local9 * local18 - local15 * this.aFloat15;
		@Pc(37) float local37 = this.aFloat21;
		this.aFloat15 = local15 * local18 + local9 * this.aFloat15;
		this.aFloat11 = local21 * local9 - local15 * this.aFloat16;
		this.aFloat14 = local24 * local9 - local15 * this.aFloat18;
		this.aFloat16 = local21 * local15 + local9 * this.aFloat16;
		this.aFloat21 = local9 * local37 - local15 * this.aFloat13;
		this.aFloat18 = local24 * local15 + local9 * this.aFloat18;
		this.aFloat13 = this.aFloat13 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(I)V")
	@Override
	public void method7023(@OriginalArg(0) int arg0) {
		this.aFloat16 = 1.0F;
		this.aFloat17 = this.aFloat19 = Class24.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat14 = Class24.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat11 = this.aFloat21 = this.aFloat15 = this.aFloat18 = this.aFloat13 = this.aFloat20 = this.aFloat22 = 0.0F;
		this.aFloat12 = -this.aFloat14;
	}

	@OriginalMember(owner = "client!dla", name = "f", descriptor = "(I)V")
	@Override
	public void method7025(@OriginalArg(0) int arg0) {
		this.aFloat17 = 1.0F;
		this.aFloat16 = this.aFloat19 = Class24.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat20 = Class24.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat18 = -this.aFloat20;
		this.aFloat11 = this.aFloat14 = this.aFloat21 = this.aFloat15 = this.aFloat13 = this.aFloat12 = this.aFloat22 = 0.0F;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(BLclient!gw;)V")
	public void method1808(@OriginalArg(1) Class86 arg0) {
		@Pc(14) Class86_Sub1 local14 = (Class86_Sub1) arg0;
		this.aFloat11 = local14.aFloat15;
		this.aFloat17 = local14.aFloat17;
		this.aFloat14 = local14.aFloat12;
		this.aFloat18 = local14.aFloat20;
		this.aFloat15 = local14.aFloat11;
		this.aFloat12 = local14.aFloat14;
		this.aFloat16 = local14.aFloat16;
		this.aFloat20 = local14.aFloat18;
		this.aFloat19 = local14.aFloat19;
		this.aFloat21 = -(local14.aFloat13 * this.aFloat11 + local14.aFloat21 * this.aFloat17 + this.aFloat14 * local14.aFloat22);
		this.aFloat13 = -(this.aFloat15 * local14.aFloat21 + this.aFloat16 * local14.aFloat13 + local14.aFloat22 * this.aFloat18);
		this.aFloat22 = -(local14.aFloat22 * this.aFloat19 + this.aFloat12 * local14.aFloat21 + this.aFloat20 * local14.aFloat13);
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "([FIFFFF)V")
	public void method1809(@OriginalArg(0) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg0[1] = this.aFloat16 * arg1 + arg2 * this.aFloat15 + arg4 * this.aFloat18;
		@Pc(57) float local57;
		@Pc(73) float local73;
		@Pc(65) float local65;
		@Pc(49) float local49;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local49 = -arg3 / arg2;
			local57 = this.aFloat21 + this.aFloat17 * local49;
			local65 = this.aFloat22 + this.aFloat12 * local49;
			local73 = this.aFloat13 + local49 * this.aFloat15;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local49 = -arg3 / arg1;
			local57 = this.aFloat21 + this.aFloat11 * local49;
			local65 = this.aFloat22 + this.aFloat20 * local49;
			local73 = local49 * this.aFloat16 + this.aFloat13;
		} else {
			local49 = -arg3 / arg4;
			local57 = this.aFloat21 + this.aFloat14 * local49;
			local73 = local49 * this.aFloat18 + this.aFloat13;
			local65 = this.aFloat22 + this.aFloat19 * local49;
		}
		arg0[2] = this.aFloat12 * arg2 + this.aFloat20 * arg1 + this.aFloat19 * arg4;
		arg0[0] = arg4 * this.aFloat14 + this.aFloat11 * arg1 + this.aFloat17 * arg2;
		arg0[3] = -(local73 * arg0[1] + arg0[0] * local57 + arg0[2] * local65);
	}

	@OriginalMember(owner = "client!dla", name = "g", descriptor = "(I)[F")
	public float[] method1810() {
		Static469.aFloatArray55[12] = this.aFloat21;
		Static469.aFloatArray55[1] = this.aFloat15;
		Static469.aFloatArray55[4] = this.aFloat11;
		Static469.aFloatArray55[10] = this.aFloat19;
		Static469.aFloatArray55[0] = this.aFloat17;
		Static469.aFloatArray55[9] = this.aFloat18;
		Static469.aFloatArray55[13] = this.aFloat13;
		Static469.aFloatArray55[6] = this.aFloat20;
		Static469.aFloatArray55[14] = this.aFloat22;
		Static469.aFloatArray55[2] = this.aFloat12;
		Static469.aFloatArray55[8] = this.aFloat14;
		Static469.aFloatArray55[5] = this.aFloat16;
		return Static469.aFloatArray55;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat21 + (float) arg2 * this.aFloat14 + this.aFloat11 * (float) arg1 + (float) arg0 * this.aFloat17);
		arg3[1] = (int) (this.aFloat13 + (float) arg1 * this.aFloat16 + this.aFloat15 * (float) arg0 + this.aFloat18 * (float) arg2);
		arg3[2] = (int) ((float) arg2 * this.aFloat19 + this.aFloat20 * (float) arg1 + (float) arg0 * this.aFloat12 + this.aFloat22);
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(B)V")
	public void method1811() {
		this.aFloat15 = -this.aFloat15;
		this.aFloat19 = -this.aFloat19;
		this.aFloat12 = -this.aFloat12;
		this.aFloat20 = -this.aFloat20;
		this.aFloat13 = -this.aFloat13;
		this.aFloat16 = -this.aFloat16;
		this.aFloat22 = -this.aFloat22;
		this.aFloat18 = -this.aFloat18;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "()V")
	@Override
	public void method7024() {
		this.aFloat17 = this.aFloat16 = this.aFloat19 = 1.0F;
		this.aFloat15 = this.aFloat12 = this.aFloat11 = this.aFloat20 = this.aFloat14 = this.aFloat18 = this.aFloat21 = this.aFloat13 = this.aFloat22 = 0.0F;
	}

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "(I)V")
	@Override
	public void method7027(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class24.aFloatArray3[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class24.aFloatArray4[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat15;
		@Pc(21) float local21 = this.aFloat16;
		@Pc(24) float local24 = this.aFloat18;
		@Pc(27) float local27 = this.aFloat13;
		this.aFloat15 = local9 * local18 - this.aFloat12 * local15;
		this.aFloat12 = local18 * local15 + local9 * this.aFloat12;
		this.aFloat16 = local9 * local21 - this.aFloat20 * local15;
		this.aFloat18 = local24 * local9 - this.aFloat19 * local15;
		this.aFloat20 = local21 * local15 + this.aFloat20 * local9;
		this.aFloat19 = local15 * local24 + this.aFloat19 * local9;
		this.aFloat13 = local27 * local9 - local15 * this.aFloat22;
		this.aFloat22 = local27 * local15 + this.aFloat22 * local9;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(Z)[F")
	public float[] method1813() {
		Static469.aFloatArray55[6] = this.aFloat20;
		Static469.aFloatArray55[10] = this.aFloat19;
		Static469.aFloatArray55[1] = this.aFloat15;
		Static469.aFloatArray55[5] = this.aFloat16;
		Static469.aFloatArray55[12] = 0.0F;
		Static469.aFloatArray55[2] = this.aFloat12;
		Static469.aFloatArray55[9] = this.aFloat18;
		Static469.aFloatArray55[0] = this.aFloat17;
		Static469.aFloatArray55[4] = this.aFloat11;
		Static469.aFloatArray55[14] = 0.0F;
		Static469.aFloatArray55[13] = 0.0F;
		Static469.aFloatArray55[8] = this.aFloat14;
		return Static469.aFloatArray55;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "([I)V")
	@Override
	public void method7030(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat21;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat13;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat22;
		arg0[1] = (int) (local12 * this.aFloat11 + local21 * this.aFloat16 + this.aFloat20 * local29);
		arg0[2] = (int) (local12 * this.aFloat14 + this.aFloat18 * local21 + local29 * this.aFloat19);
		arg0[0] = (int) (local29 * this.aFloat12 + this.aFloat17 * local12 + local21 * this.aFloat15);
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(FFIBIFI)V")
	public void method1815(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg3 == 0) {
			this.aFloat17 = (float) arg2;
			this.aFloat19 = 1.0F;
			this.aFloat16 = (float) arg5;
			this.aFloat15 = this.aFloat12 = this.aFloat11 = this.aFloat20 = this.aFloat14 = this.aFloat18 = 0.0F;
		} else {
			@Pc(44) float local44 = Class24.aFloatArray3[arg3 & 0x3FFF];
			@Pc(50) float local50 = Class24.aFloatArray4[arg3 & 0x3FFF];
			this.aFloat19 = 1.0F;
			this.aFloat15 = (float) arg2 * local50;
			this.aFloat16 = (float) arg5 * local44;
			this.aFloat12 = this.aFloat20 = this.aFloat14 = this.aFloat18 = 0.0F;
			this.aFloat11 = -local50 * (float) arg5;
			this.aFloat17 = local44 * (float) arg2;
		}
		this.aFloat22 = arg0;
		this.aFloat21 = arg1;
		this.aFloat13 = arg4;
	}

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat16 + (float) arg0 * this.aFloat15 + this.aFloat18 * (float) arg2);
		arg3[2] = (int) ((float) arg2 * this.aFloat19 + (float) arg0 * this.aFloat12 + this.aFloat20 * (float) arg1);
		arg3[0] = (int) ((float) arg0 * this.aFloat17 + (float) arg1 * this.aFloat11 + this.aFloat14 * (float) arg2);
	}

	@OriginalMember(owner = "client!dla", name = "e", descriptor = "(I)V")
	@Override
	public void method7034(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class24.aFloatArray3[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class24.aFloatArray4[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat17;
		@Pc(21) float local21 = this.aFloat11;
		@Pc(24) float local24 = this.aFloat14;
		@Pc(27) float local27 = this.aFloat21;
		this.aFloat17 = this.aFloat12 * local15 + local9 * local18;
		this.aFloat11 = local15 * this.aFloat20 + local21 * local9;
		this.aFloat12 = this.aFloat12 * local9 - local15 * local18;
		this.aFloat20 = local9 * this.aFloat20 - local15 * local21;
		this.aFloat14 = local15 * this.aFloat19 + local24 * local9;
		this.aFloat21 = local27 * local9 + this.aFloat22 * local15;
		this.aFloat19 = local9 * this.aFloat19 - local24 * local15;
		this.aFloat22 = local9 * this.aFloat22 - local15 * local27;
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg2 - this.aFloat22);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat21);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat13);
		arg3[2] = (int) (this.aFloat14 * (float) local17 + this.aFloat18 * (float) local24 + (float) local10 * this.aFloat19);
		arg3[1] = (int) ((float) local17 * this.aFloat11 + (float) local24 * this.aFloat16 + this.aFloat20 * (float) local10);
		arg3[0] = (int) (this.aFloat17 * (float) local17 + (float) local24 * this.aFloat15 + this.aFloat12 * (float) local10);
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class24.aFloatArray3[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class24.aFloatArray4[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class24.aFloatArray3[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class24.aFloatArray4[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class24.aFloatArray3[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class24.aFloatArray4[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat18 = local43 * local21 + local27 * local39;
		this.aFloat17 = local27 * local47 + local33 * local21;
		this.aFloat15 = local43 * local27 + -local21 * local39;
		this.aFloat12 = local27 * local9;
		this.aFloat16 = local9 * local33;
		this.aFloat11 = local39 * local9;
		this.aFloat19 = local21 * local9;
		this.aFloat20 = -local15;
		this.aFloat14 = local33 * -local27 + local47 * local21;
		this.aFloat13 = -(this.aFloat18 * (float) arg2) + (float) -arg0 * this.aFloat15 - this.aFloat16 * (float) arg1;
		this.aFloat22 = (float) -arg0 * this.aFloat12 - this.aFloat20 * (float) arg1 - (float) arg2 * this.aFloat19;
		this.aFloat21 = -((float) arg2 * this.aFloat14) - (float) arg1 * this.aFloat11 + (float) -arg0 * this.aFloat17;
	}
}
