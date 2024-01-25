import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "F")
	public float aFloat3;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "F")
	public float aFloat4;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "F")
	public float aFloat6;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "F")
	public float aFloat7;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class8_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class8 arg0) {
		@Pc(6) Class8_Sub1 local6 = (Class8_Sub1) arg0;
		this.aFloat14 = local6.aFloat14;
		this.aFloat7 = local6.aFloat7;
		this.aFloat6 = local6.aFloat6;
		this.aFloat8 = local6.aFloat8;
		this.aFloat13 = local6.aFloat13;
		this.aFloat4 = local6.aFloat4;
		this.aFloat9 = local6.aFloat9;
		this.aFloat5 = local6.aFloat5;
		this.aFloat12 = local6.aFloat12;
		this.aFloat11 = local6.aFloat11;
		this.aFloat3 = local6.aFloat3;
		this.aFloat10 = local6.aFloat10;
	}

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat14 = 1.0F;
		this.aFloat8 = this.aFloat12 = Class271.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat10 = Class271.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat4 = -this.aFloat10;
		this.aFloat13 = this.aFloat6 = this.aFloat3 = this.aFloat9 = this.aFloat11 = this.aFloat5 = this.aFloat7 = 0.0F;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class8 method6812() {
		@Pc(7) Class8_Sub1 local7 = new Class8_Sub1();
		local7.aFloat6 = this.aFloat6;
		local7.aFloat5 = this.aFloat5;
		local7.aFloat9 = this.aFloat9;
		local7.aFloat14 = this.aFloat14;
		local7.aFloat11 = this.aFloat11;
		local7.aFloat3 = this.aFloat3;
		local7.aFloat13 = this.aFloat13;
		local7.aFloat4 = this.aFloat4;
		local7.aFloat12 = this.aFloat12;
		local7.aFloat7 = this.aFloat7;
		local7.aFloat8 = this.aFloat8;
		local7.aFloat10 = this.aFloat10;
		return local7;
	}

	@OriginalMember(owner = "client!ae", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat13 + (float) arg1 * this.aFloat4 + (float) arg0 * this.aFloat8);
		arg3[1] = (int) ((float) arg2 * this.aFloat3 + (float) arg1 * this.aFloat12 + this.aFloat10 * (float) arg0);
		arg3[2] = (int) ((float) arg1 * this.aFloat5 + (float) arg0 * this.aFloat11 + this.aFloat14 * (float) arg2);
	}

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class271.aFloatArray54[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class271.aFloatArray55[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat10;
		@Pc(21) float local21 = this.aFloat12;
		@Pc(24) float local24 = this.aFloat3;
		@Pc(27) float local27 = this.aFloat9;
		this.aFloat10 = local18 * local9 - local15 * this.aFloat11;
		this.aFloat12 = local21 * local9 - this.aFloat5 * local15;
		this.aFloat11 = this.aFloat11 * local9 + local15 * local18;
		this.aFloat5 = this.aFloat5 * local9 + local21 * local15;
		this.aFloat3 = local24 * local9 - this.aFloat14 * local15;
		this.aFloat14 = local24 * local15 + local9 * this.aFloat14;
		this.aFloat9 = local9 * local27 - local15 * this.aFloat7;
		this.aFloat7 = local27 * local15 + this.aFloat7 * local9;
	}

	@OriginalMember(owner = "client!ae", name = "DA", descriptor = "(III[I)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg2 - this.aFloat7);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat6);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat9);
		arg3[1] = (int) ((float) local10 * this.aFloat5 + this.aFloat12 * (float) local24 + (float) local17 * this.aFloat4);
		arg3[2] = (int) ((float) local10 * this.aFloat14 + this.aFloat3 * (float) local24 + (float) local17 * this.aFloat13);
		arg3[0] = (int) ((float) local24 * this.aFloat10 + this.aFloat8 * (float) local17 + (float) local10 * this.aFloat11);
	}

	@OriginalMember(owner = "client!ae", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat6;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat9;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat7;
		arg0[1] = (int) (local21 * this.aFloat12 + this.aFloat4 * local12 + local30 * this.aFloat5);
		arg0[0] = (int) (local30 * this.aFloat11 + local21 * this.aFloat10 + local12 * this.aFloat8);
		arg0[2] = (int) (local21 * this.aFloat3 + local12 * this.aFloat13 + this.aFloat14 * local30);
	}

	@OriginalMember(owner = "client!ae", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class271.aFloatArray54[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class271.aFloatArray55[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class271.aFloatArray54[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class271.aFloatArray55[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class271.aFloatArray54[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class271.aFloatArray55[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat14 = local9 * local21;
		this.aFloat8 = local33 * local21 + local47 * local27;
		this.aFloat11 = local27 * local9;
		this.aFloat5 = -local15;
		this.aFloat10 = local43 * local27 + local39 * -local21;
		this.aFloat4 = local9 * local39;
		this.aFloat3 = local39 * local27 + local43 * local21;
		this.aFloat12 = local33 * local9;
		this.aFloat13 = local33 * -local27 + local21 * local47;
		this.aFloat6 = -(this.aFloat4 * (float) arg1) + (float) -arg0 * this.aFloat8 - (float) arg2 * this.aFloat13;
		this.aFloat9 = -(this.aFloat3 * (float) arg2) - this.aFloat12 * (float) arg1 + this.aFloat10 * (float) -arg0;
		this.aFloat7 = -((float) arg2 * this.aFloat14) - (float) arg1 * this.aFloat5 + (float) -arg0 * this.aFloat11;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat3 * (float) arg2 + this.aFloat12 * (float) arg1 + (float) arg0 * this.aFloat10 + this.aFloat9);
		arg3[2] = (int) (this.aFloat5 * (float) arg1 + (float) arg0 * this.aFloat11 + this.aFloat14 * (float) arg2 + this.aFloat7);
		arg3[0] = (int) (this.aFloat4 * (float) arg1 + (float) arg0 * this.aFloat8 + (float) arg2 * this.aFloat13 + this.aFloat6);
	}

	@OriginalMember(owner = "client!ae", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class271.aFloatArray54[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class271.aFloatArray55[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat8;
		@Pc(21) float local21 = this.aFloat4;
		@Pc(24) float local24 = this.aFloat13;
		this.aFloat8 = local9 * local18 - this.aFloat10 * local15;
		@Pc(37) float local37 = this.aFloat6;
		this.aFloat10 = local9 * this.aFloat10 + local18 * local15;
		this.aFloat4 = local21 * local9 - local15 * this.aFloat12;
		this.aFloat12 = local9 * this.aFloat12 + local21 * local15;
		this.aFloat13 = local24 * local9 - local15 * this.aFloat3;
		this.aFloat3 = local24 * local15 + local9 * this.aFloat3;
		this.aFloat6 = local9 * local37 - this.aFloat9 * local15;
		this.aFloat9 = local37 * local15 + local9 * this.aFloat9;
	}

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat12 = 1.0F;
		this.aFloat8 = this.aFloat14 = Class271.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat13 = Class271.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat4 = this.aFloat6 = this.aFloat10 = this.aFloat3 = this.aFloat9 = this.aFloat5 = this.aFloat7 = 0.0F;
		this.aFloat11 = -this.aFloat13;
	}

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat10 = this.aFloat11 = this.aFloat4 = this.aFloat5 = this.aFloat13 = this.aFloat3 = this.aFloat6 = this.aFloat9 = this.aFloat7 = 0.0F;
		this.aFloat8 = this.aFloat12 = this.aFloat14 = 1.0F;
	}

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat6 += arg0;
		this.aFloat9 += arg1;
		this.aFloat7 += arg2;
	}

	@OriginalMember(owner = "client!ae", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat8 = 1.0F;
		this.aFloat12 = this.aFloat14 = Class271.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat5 = Class271.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat3 = -this.aFloat5;
		this.aFloat4 = this.aFloat13 = this.aFloat6 = this.aFloat10 = this.aFloat9 = this.aFloat11 = this.aFloat7 = 0.0F;
	}

	@OriginalMember(owner = "client!ae", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class271.aFloatArray54[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class271.aFloatArray55[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat8;
		@Pc(21) float local21 = this.aFloat4;
		@Pc(24) float local24 = this.aFloat13;
		this.aFloat8 = local18 * local9 + local15 * this.aFloat11;
		@Pc(37) float local37 = this.aFloat6;
		this.aFloat11 = this.aFloat11 * local9 - local15 * local18;
		this.aFloat4 = local9 * local21 + this.aFloat5 * local15;
		this.aFloat5 = this.aFloat5 * local9 - local21 * local15;
		this.aFloat13 = local24 * local9 + this.aFloat14 * local15;
		this.aFloat14 = local9 * this.aFloat14 - local15 * local24;
		this.aFloat6 = local9 * local37 + local15 * this.aFloat7;
		this.aFloat7 = local9 * this.aFloat7 - local37 * local15;
	}

	@OriginalMember(owner = "client!ae", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat8 = this.aFloat12 = this.aFloat14 = 1.0F;
		this.aFloat10 = this.aFloat11 = this.aFloat4 = this.aFloat5 = this.aFloat13 = this.aFloat3 = 0.0F;
		this.aFloat6 = arg0;
		this.aFloat7 = arg2;
		this.aFloat9 = arg1;
	}
}
