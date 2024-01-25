import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!aca", name = "m", descriptor = "F")
	public float aFloat2;

	@OriginalMember(owner = "client!aca", name = "t", descriptor = "F")
	public float aFloat3;

	@OriginalMember(owner = "client!aca", name = "v", descriptor = "F")
	public float aFloat4;

	@OriginalMember(owner = "client!aca", name = "y", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!aca", name = "z", descriptor = "F")
	public float aFloat6;

	@OriginalMember(owner = "client!aca", name = "F", descriptor = "F")
	public float aFloat7;

	@OriginalMember(owner = "client!aca", name = "G", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!aca", name = "I", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!aca", name = "L", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!aca", name = "N", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!aca", name = "P", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!aca", name = "R", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "()V")
	public Class6_Sub1() {
		this.method6706();
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public void method6695(@OriginalArg(0) Class6 arg0) {
		@Pc(6) Class6_Sub1 local6 = (Class6_Sub1) arg0;
		this.aFloat9 = local6.aFloat9;
		this.aFloat7 = local6.aFloat7;
		this.aFloat5 = local6.aFloat5;
		this.aFloat13 = local6.aFloat13;
		this.aFloat11 = local6.aFloat11;
		this.aFloat4 = local6.aFloat4;
		this.aFloat2 = local6.aFloat2;
		this.aFloat6 = local6.aFloat6;
		this.aFloat8 = local6.aFloat8;
		this.aFloat3 = local6.aFloat3;
		this.aFloat12 = local6.aFloat12;
		this.aFloat10 = local6.aFloat10;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!kd;)V")
	public void method105(@OriginalArg(1) Class6 arg0) {
		@Pc(9) Class6_Sub1 local9 = (Class6_Sub1) arg0;
		this.aFloat8 = local9.aFloat3;
		this.aFloat7 = local9.aFloat10;
		this.aFloat4 = local9.aFloat4;
		this.aFloat13 = local9.aFloat6;
		this.aFloat5 = local9.aFloat5;
		this.aFloat3 = local9.aFloat8;
		this.aFloat10 = local9.aFloat7;
		this.aFloat2 = local9.aFloat2;
		this.aFloat6 = local9.aFloat13;
		this.aFloat11 = -(local9.aFloat11 * this.aFloat4 + this.aFloat7 * local9.aFloat9 + local9.aFloat12 * this.aFloat8);
		this.aFloat9 = -(this.aFloat10 * local9.aFloat11 + this.aFloat5 * local9.aFloat9 + local9.aFloat12 * this.aFloat13);
		this.aFloat12 = -(this.aFloat2 * local9.aFloat12 + this.aFloat3 * local9.aFloat11 + local9.aFloat9 * this.aFloat6);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat13 + (float) arg0 * this.aFloat10 + this.aFloat5 * (float) arg1);
		arg3[2] = (int) ((float) arg2 * this.aFloat2 + this.aFloat3 * (float) arg0 + this.aFloat6 * (float) arg1);
		arg3[0] = (int) (this.aFloat8 * (float) arg2 + this.aFloat4 * (float) arg0 + this.aFloat7 * (float) arg1);
	}

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)V")
	@Override
	public void method6699(@OriginalArg(0) int arg0) {
		this.aFloat4 = 1.0F;
		this.aFloat5 = this.aFloat2 = Class155.aFloatArray39[arg0 & 0x3FFF];
		this.aFloat6 = Class155.aFloatArray40[arg0 & 0x3FFF];
		this.aFloat7 = this.aFloat8 = this.aFloat11 = this.aFloat10 = this.aFloat9 = this.aFloat3 = this.aFloat12 = 0.0F;
		this.aFloat13 = -this.aFloat6;
	}

	@OriginalMember(owner = "client!aca", name = "i", descriptor = "(I)[F")
	public float[] method107() {
		Static391.aFloatArray57[13] = this.aFloat9;
		Static391.aFloatArray57[14] = this.aFloat12;
		Static391.aFloatArray57[4] = this.aFloat7;
		Static391.aFloatArray57[6] = this.aFloat6;
		Static391.aFloatArray57[5] = this.aFloat5;
		Static391.aFloatArray57[1] = this.aFloat10;
		Static391.aFloatArray57[8] = this.aFloat8;
		Static391.aFloatArray57[9] = this.aFloat13;
		Static391.aFloatArray57[0] = this.aFloat4;
		Static391.aFloatArray57[10] = this.aFloat2;
		Static391.aFloatArray57[12] = this.aFloat11;
		Static391.aFloatArray57[2] = this.aFloat3;
		return Static391.aFloatArray57;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "()V")
	@Override
	public void method6706() {
		this.aFloat4 = this.aFloat5 = this.aFloat2 = 1.0F;
		this.aFloat10 = this.aFloat3 = this.aFloat7 = this.aFloat6 = this.aFloat8 = this.aFloat13 = this.aFloat11 = this.aFloat9 = this.aFloat12 = 0.0F;
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(III)V")
	@Override
	public void method6701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat4 = this.aFloat5 = this.aFloat2 = 1.0F;
		this.aFloat12 = arg2;
		this.aFloat9 = arg1;
		this.aFloat11 = arg0;
		this.aFloat10 = this.aFloat3 = this.aFloat7 = this.aFloat6 = this.aFloat8 = this.aFloat13 = 0.0F;
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method6709() {
		@Pc(7) Class6_Sub1 local7 = new Class6_Sub1();
		local7.aFloat2 = this.aFloat2;
		local7.aFloat8 = this.aFloat8;
		local7.aFloat5 = this.aFloat5;
		local7.aFloat9 = this.aFloat9;
		local7.aFloat13 = this.aFloat13;
		local7.aFloat11 = this.aFloat11;
		local7.aFloat6 = this.aFloat6;
		local7.aFloat3 = this.aFloat3;
		local7.aFloat7 = this.aFloat7;
		local7.aFloat10 = this.aFloat10;
		local7.aFloat12 = this.aFloat12;
		local7.aFloat4 = this.aFloat4;
		return local7;
	}

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "(I)V")
	@Override
	public void method6708(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class155.aFloatArray39[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class155.aFloatArray40[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat4;
		@Pc(21) float local21 = this.aFloat7;
		@Pc(24) float local24 = this.aFloat8;
		this.aFloat4 = local18 * local9 + this.aFloat3 * local15;
		@Pc(37) float local37 = this.aFloat11;
		this.aFloat7 = this.aFloat6 * local15 + local21 * local9;
		this.aFloat3 = local9 * this.aFloat3 - local18 * local15;
		this.aFloat6 = local9 * this.aFloat6 - local15 * local21;
		this.aFloat8 = local24 * local9 + this.aFloat2 * local15;
		this.aFloat11 = this.aFloat12 * local15 + local9 * local37;
		this.aFloat2 = this.aFloat2 * local9 - local15 * local24;
		this.aFloat12 = local9 * this.aFloat12 - local37 * local15;
	}

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "(I)V")
	@Override
	public void method6711(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class155.aFloatArray39[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class155.aFloatArray40[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat4;
		@Pc(21) float local21 = this.aFloat7;
		@Pc(24) float local24 = this.aFloat8;
		@Pc(27) float local27 = this.aFloat11;
		this.aFloat4 = local9 * local18 - local15 * this.aFloat10;
		this.aFloat7 = local21 * local9 - this.aFloat5 * local15;
		this.aFloat10 = this.aFloat10 * local9 + local18 * local15;
		this.aFloat8 = local24 * local9 - local15 * this.aFloat13;
		this.aFloat5 = local9 * this.aFloat5 + local15 * local21;
		this.aFloat13 = local9 * this.aFloat13 + local24 * local15;
		this.aFloat11 = local9 * local27 - this.aFloat9 * local15;
		this.aFloat9 = local9 * this.aFloat9 + local15 * local27;
	}

	@OriginalMember(owner = "client!aca", name = "j", descriptor = "(I)V")
	public void method109() {
		this.aFloat13 = -this.aFloat13;
		this.aFloat10 = -this.aFloat10;
		this.aFloat3 = -this.aFloat3;
		this.aFloat6 = -this.aFloat6;
		this.aFloat9 = -this.aFloat9;
		this.aFloat2 = -this.aFloat2;
		this.aFloat5 = -this.aFloat5;
		this.aFloat12 = -this.aFloat12;
	}

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg0 - this.aFloat11);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat12);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat9);
		arg3[1] = (int) ((float) local17 * this.aFloat6 + this.aFloat5 * (float) local24 + (float) local10 * this.aFloat7);
		arg3[0] = (int) (this.aFloat10 * (float) local24 + this.aFloat4 * (float) local10 + this.aFloat3 * (float) local17);
		arg3[2] = (int) ((float) local24 * this.aFloat13 + this.aFloat8 * (float) local10 + this.aFloat2 * (float) local17);
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(B)[F")
	public float[] method110() {
		Static391.aFloatArray57[4] = this.aFloat7;
		Static391.aFloatArray57[2] = this.aFloat3;
		Static391.aFloatArray57[8] = this.aFloat8;
		Static391.aFloatArray57[14] = 0.0F;
		Static391.aFloatArray57[1] = this.aFloat10;
		Static391.aFloatArray57[0] = this.aFloat4;
		Static391.aFloatArray57[6] = this.aFloat6;
		Static391.aFloatArray57[5] = this.aFloat5;
		Static391.aFloatArray57[13] = 0.0F;
		Static391.aFloatArray57[9] = this.aFloat13;
		Static391.aFloatArray57[12] = 0.0F;
		Static391.aFloatArray57[10] = this.aFloat2;
		return Static391.aFloatArray57;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(FIIIFIF)V")
	public void method111(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg4 == 0) {
			this.aFloat5 = arg1;
			this.aFloat2 = 1.0F;
			this.aFloat4 = arg2;
			this.aFloat10 = this.aFloat3 = this.aFloat7 = this.aFloat6 = this.aFloat8 = this.aFloat13 = 0.0F;
		} else {
			@Pc(11) float local11 = Class155.aFloatArray39[arg4 & 0x3FFF];
			@Pc(17) float local17 = Class155.aFloatArray40[arg4 & 0x3FFF];
			this.aFloat4 = (float) arg2 * local11;
			this.aFloat2 = 1.0F;
			this.aFloat3 = this.aFloat6 = this.aFloat8 = this.aFloat13 = 0.0F;
			this.aFloat7 = (float) arg1 * -local17;
			this.aFloat10 = local17 * (float) arg2;
			this.aFloat5 = local11 * (float) arg1;
		}
		this.aFloat11 = arg0;
		this.aFloat12 = arg3;
		this.aFloat9 = arg5;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(III)V")
	@Override
	public void method6694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat11 += arg0;
		this.aFloat9 += arg1;
		this.aFloat12 += arg2;
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat12 + (float) arg2 * this.aFloat2 + (float) arg1 * this.aFloat6 + (float) arg0 * this.aFloat3);
		arg3[0] = (int) (this.aFloat8 * (float) arg2 + this.aFloat4 * (float) arg0 + this.aFloat7 * (float) arg1 + this.aFloat11);
		arg3[1] = (int) ((float) arg2 * this.aFloat13 + this.aFloat5 * (float) arg1 + (float) arg0 * this.aFloat10 + this.aFloat9);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
	@Override
	public void method6692(@OriginalArg(0) int arg0) {
		this.aFloat5 = 1.0F;
		this.aFloat4 = this.aFloat2 = Class155.aFloatArray39[arg0 & 0x3FFF];
		this.aFloat8 = Class155.aFloatArray40[arg0 & 0x3FFF];
		this.aFloat7 = this.aFloat11 = this.aFloat10 = this.aFloat13 = this.aFloat9 = this.aFloat6 = this.aFloat12 = 0.0F;
		this.aFloat3 = -this.aFloat8;
	}

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "(I)V")
	@Override
	public void method6710(@OriginalArg(0) int arg0) {
		this.aFloat2 = 1.0F;
		this.aFloat4 = this.aFloat5 = Class155.aFloatArray39[arg0 & 0x3FFF];
		this.aFloat10 = Class155.aFloatArray40[arg0 & 0x3FFF];
		this.aFloat7 = -this.aFloat10;
		this.aFloat8 = this.aFloat11 = this.aFloat13 = this.aFloat9 = this.aFloat3 = this.aFloat6 = this.aFloat12 = 0.0F;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "([I)V")
	@Override
	public void method6712(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat11;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat9;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat12;
		arg0[1] = (int) (this.aFloat6 * local29 + this.aFloat7 * local11 + this.aFloat5 * local20);
		arg0[2] = (int) (this.aFloat2 * local29 + local11 * this.aFloat8 + local20 * this.aFloat13);
		arg0[0] = (int) (this.aFloat3 * local29 + this.aFloat4 * local11 + this.aFloat10 * local20);
	}

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "(I)V")
	@Override
	public void method6705(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class155.aFloatArray39[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class155.aFloatArray40[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat10;
		@Pc(21) float local21 = this.aFloat5;
		@Pc(24) float local24 = this.aFloat13;
		@Pc(27) float local27 = this.aFloat9;
		this.aFloat10 = local18 * local9 - local15 * this.aFloat3;
		this.aFloat5 = local21 * local9 - local15 * this.aFloat6;
		this.aFloat3 = local18 * local15 + this.aFloat3 * local9;
		this.aFloat13 = local24 * local9 - local15 * this.aFloat2;
		this.aFloat6 = local9 * this.aFloat6 + local15 * local21;
		this.aFloat2 = local9 * this.aFloat2 + local15 * local24;
		this.aFloat9 = local27 * local9 - this.aFloat12 * local15;
		this.aFloat12 = local27 * local15 + local9 * this.aFloat12;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(F[FFBFF)V")
	public void method112(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(24) float local24;
		@Pc(40) float local40;
		@Pc(32) float local32;
		@Pc(16) float local16;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local16 = -arg0 / arg2;
			local24 = this.aFloat4 * local16 + this.aFloat11;
			local32 = local16 * this.aFloat3 + this.aFloat12;
			local40 = this.aFloat10 * local16 + this.aFloat9;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local16 = -arg0 / arg3;
			local40 = local16 * this.aFloat5 + this.aFloat9;
			local24 = this.aFloat7 * local16 + this.aFloat11;
			local32 = this.aFloat12 + local16 * this.aFloat6;
		} else {
			local16 = -arg0 / arg4;
			local24 = local16 * this.aFloat8 + this.aFloat11;
			local32 = this.aFloat12 + local16 * this.aFloat2;
			local40 = this.aFloat13 * local16 + this.aFloat9;
		}
		arg1[1] = arg2 * this.aFloat10 + arg3 * this.aFloat5 + arg4 * this.aFloat13;
		arg1[0] = arg4 * this.aFloat8 + arg3 * this.aFloat7 + arg2 * this.aFloat4;
		arg1[2] = arg4 * this.aFloat2 + this.aFloat6 * arg3 + arg2 * this.aFloat3;
		arg1[3] = -(local40 * arg1[1] + arg1[0] * local24 + arg1[2] * local32);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class155.aFloatArray39[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class155.aFloatArray40[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class155.aFloatArray39[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class155.aFloatArray40[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class155.aFloatArray39[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class155.aFloatArray40[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat5 = local33 * local9;
		this.aFloat8 = local47 * local21 + local33 * -local27;
		this.aFloat7 = local9 * local39;
		this.aFloat10 = local27 * local43 + -local21 * local39;
		this.aFloat13 = local43 * local21 + local39 * local27;
		this.aFloat4 = local21 * local33 + local27 * local47;
		this.aFloat6 = -local15;
		this.aFloat2 = local9 * local21;
		this.aFloat3 = local9 * local27;
		this.aFloat12 = -((float) arg2 * this.aFloat2) - this.aFloat6 * (float) arg1 + (float) -arg0 * this.aFloat3;
		this.aFloat9 = -(this.aFloat5 * (float) arg1) + this.aFloat10 * (float) -arg0 - (float) arg2 * this.aFloat13;
		this.aFloat11 = -((float) arg1 * this.aFloat7) + this.aFloat4 * (float) -arg0 - this.aFloat8 * (float) arg2;
	}
}
