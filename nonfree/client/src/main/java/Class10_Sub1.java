import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "F")
	public float aFloat2;

	@OriginalMember(owner = "client!ag", name = "D", descriptor = "F")
	public float aFloat3;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "F")
	public float aFloat4;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "F")
	public float aFloat6;

	@OriginalMember(owner = "client!ag", name = "G", descriptor = "F")
	public float aFloat7;

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class10_Sub1() {
		this.method4224();
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
	@Override
	public void method4215(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat11;
		@Pc(21) float local21 = this.aFloat10;
		@Pc(24) float local24 = this.aFloat12;
		this.aFloat11 = this.aFloat5 * local15 + local9 * local18;
		@Pc(37) float local37 = this.aFloat7;
		this.aFloat5 = this.aFloat5 * local9 - local18 * local15;
		this.aFloat10 = local9 * local21 + local15 * this.aFloat9;
		this.aFloat12 = local9 * local24 + this.aFloat6 * local15;
		this.aFloat9 = local9 * this.aFloat9 - local15 * local21;
		this.aFloat6 = local9 * this.aFloat6 - local24 * local15;
		this.aFloat7 = local9 * local37 + this.aFloat3 * local15;
		this.aFloat3 = local9 * this.aFloat3 - local37 * local15;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "()V")
	@Override
	public void method4224() {
		this.aFloat2 = this.aFloat5 = this.aFloat10 = this.aFloat9 = this.aFloat12 = this.aFloat13 = this.aFloat7 = this.aFloat4 = this.aFloat3 = 0.0F;
		this.aFloat11 = this.aFloat8 = this.aFloat6 = 1.0F;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	@Override
	public void method4218(@OriginalArg(0) int arg0) {
		this.aFloat11 = 1.0F;
		this.aFloat8 = this.aFloat6 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat9 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat10 = this.aFloat12 = this.aFloat7 = this.aFloat2 = this.aFloat4 = this.aFloat5 = this.aFloat3 = 0.0F;
		this.aFloat13 = -this.aFloat9;
	}

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V")
	@Override
	public void method4210(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat11;
		@Pc(21) float local21 = this.aFloat10;
		@Pc(24) float local24 = this.aFloat12;
		@Pc(27) float local27 = this.aFloat7;
		this.aFloat11 = local9 * local18 - local15 * this.aFloat2;
		this.aFloat2 = local18 * local15 + this.aFloat2 * local9;
		this.aFloat10 = local9 * local21 - this.aFloat8 * local15;
		this.aFloat8 = local9 * this.aFloat8 + local21 * local15;
		this.aFloat12 = local24 * local9 - local15 * this.aFloat13;
		this.aFloat7 = local27 * local9 - this.aFloat4 * local15;
		this.aFloat13 = local24 * local15 + this.aFloat13 * local9;
		this.aFloat4 = local27 * local15 + local9 * this.aFloat4;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg0 - this.aFloat7);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat4);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat3);
		arg3[2] = (int) (this.aFloat12 * (float) local10 + this.aFloat13 * (float) local17 + this.aFloat6 * (float) local24);
		arg3[1] = (int) ((float) local10 * this.aFloat10 + (float) local17 * this.aFloat8 + (float) local24 * this.aFloat9);
		arg3[0] = (int) (this.aFloat11 * (float) local10 + this.aFloat2 * (float) local17 + (float) local24 * this.aFloat5);
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
	@Override
	public void method4217(@OriginalArg(0) int arg0) {
		this.aFloat8 = 1.0F;
		this.aFloat11 = this.aFloat6 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat12 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat5 = -this.aFloat12;
		this.aFloat10 = this.aFloat7 = this.aFloat2 = this.aFloat13 = this.aFloat4 = this.aFloat9 = this.aFloat3 = 0.0F;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat3 + (float) arg1 * this.aFloat9 + this.aFloat5 * (float) arg0 + (float) arg2 * this.aFloat6);
		arg3[0] = (int) (this.aFloat7 + this.aFloat12 * (float) arg2 + this.aFloat11 * (float) arg0 + this.aFloat10 * (float) arg1);
		arg3[1] = (int) (this.aFloat4 + this.aFloat13 * (float) arg2 + (float) arg0 * this.aFloat2 + (float) arg1 * this.aFloat8);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class5_Sub33.aFloatArray48[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub33.aFloatArray49[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class5_Sub33.aFloatArray48[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class5_Sub33.aFloatArray49[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class5_Sub33.aFloatArray48[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class5_Sub33.aFloatArray49[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat12 = -local27 * local33 + local21 * local47;
		this.aFloat5 = local9 * local27;
		this.aFloat6 = local21 * local9;
		this.aFloat11 = local33 * local21 + local47 * local27;
		this.aFloat9 = -local15;
		this.aFloat8 = local33 * local9;
		this.aFloat13 = local27 * local39 + local21 * local43;
		this.aFloat2 = local43 * local27 + -local21 * local39;
		this.aFloat10 = local39 * local9;
		this.aFloat3 = this.aFloat5 * (float) -arg0 - this.aFloat9 * (float) arg1 - this.aFloat6 * (float) arg2;
		this.aFloat7 = (float) -arg0 * this.aFloat11 - this.aFloat10 * (float) arg1 - this.aFloat12 * (float) arg2;
		this.aFloat4 = -((float) arg1 * this.aFloat8) + (float) -arg0 * this.aFloat2 - this.aFloat13 * (float) arg2;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	@Override
	public void method4214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat4 = (float) arg1;
		this.aFloat2 = this.aFloat5 = this.aFloat10 = this.aFloat9 = this.aFloat12 = this.aFloat13 = 0.0F;
		this.aFloat3 = (float) arg2;
		this.aFloat7 = (float) arg0;
		this.aFloat11 = this.aFloat8 = this.aFloat6 = 1.0F;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V")
	@Override
	public void method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat3 += (float) arg2;
		this.aFloat4 += (float) arg1;
		this.aFloat7 += (float) arg0;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
	@Override
	public void method4213(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat2;
		@Pc(21) float local21 = this.aFloat8;
		@Pc(24) float local24 = this.aFloat13;
		this.aFloat2 = local9 * local18 - this.aFloat5 * local15;
		@Pc(38) float local38 = this.aFloat4;
		this.aFloat5 = local15 * local18 + this.aFloat5 * local9;
		this.aFloat8 = local9 * local21 - this.aFloat9 * local15;
		this.aFloat13 = local24 * local9 - local15 * this.aFloat6;
		this.aFloat9 = local15 * local21 + local9 * this.aFloat9;
		this.aFloat6 = local9 * this.aFloat6 + local24 * local15;
		this.aFloat4 = local38 * local9 - local15 * this.aFloat3;
		this.aFloat3 = local38 * local15 + local9 * this.aFloat3;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg1 * this.aFloat10 + (float) arg0 * this.aFloat11 + this.aFloat12 * (float) arg2);
		arg3[2] = (int) ((float) arg2 * this.aFloat6 + (float) arg0 * this.aFloat5 + this.aFloat9 * (float) arg1);
		arg3[1] = (int) (this.aFloat2 * (float) arg0 + this.aFloat8 * (float) arg1 + this.aFloat13 * (float) arg2);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()Lclient!sj;")
	@Override
	public Class10 method4222() {
		@Pc(7) Class10_Sub1 local7 = new Class10_Sub1();
		local7.aFloat10 = this.aFloat10;
		local7.aFloat8 = this.aFloat8;
		local7.aFloat9 = this.aFloat9;
		local7.aFloat13 = this.aFloat13;
		local7.aFloat2 = this.aFloat2;
		local7.aFloat6 = this.aFloat6;
		local7.aFloat4 = this.aFloat4;
		local7.aFloat11 = this.aFloat11;
		local7.aFloat5 = this.aFloat5;
		local7.aFloat3 = this.aFloat3;
		local7.aFloat12 = this.aFloat12;
		local7.aFloat7 = this.aFloat7;
		return local7;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([I)V")
	@Override
	public void method4211(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat7;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat4;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat3;
		arg0[1] = (int) (this.aFloat10 * local12 + this.aFloat8 * local20 + this.aFloat9 * local28);
		arg0[0] = (int) (this.aFloat5 * local28 + this.aFloat11 * local12 + this.aFloat2 * local20);
		arg0[2] = (int) (this.aFloat13 * local20 + this.aFloat12 * local12 + local28 * this.aFloat6);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!sj;)V")
	@Override
	public void method4212(@OriginalArg(0) Class10 arg0) {
		@Pc(6) Class10_Sub1 local6 = (Class10_Sub1) arg0;
		this.aFloat3 = local6.aFloat3;
		this.aFloat10 = local6.aFloat10;
		this.aFloat6 = local6.aFloat6;
		this.aFloat4 = local6.aFloat4;
		this.aFloat2 = local6.aFloat2;
		this.aFloat9 = local6.aFloat9;
		this.aFloat11 = local6.aFloat11;
		this.aFloat5 = local6.aFloat5;
		this.aFloat12 = local6.aFloat12;
		this.aFloat7 = local6.aFloat7;
		this.aFloat8 = local6.aFloat8;
		this.aFloat13 = local6.aFloat13;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	@Override
	public void method4221(@OriginalArg(0) int arg0) {
		this.aFloat6 = 1.0F;
		this.aFloat11 = this.aFloat8 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat2 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat10 = -this.aFloat2;
		this.aFloat12 = this.aFloat7 = this.aFloat13 = this.aFloat4 = this.aFloat5 = this.aFloat9 = this.aFloat3 = 0.0F;
	}
}
