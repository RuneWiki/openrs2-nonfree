import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "F")
	public float aFloat4;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "F")
	public float aFloat6;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "F")
	public float aFloat7;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	public Class23_Sub1() {
		this.method5090();
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "()Lclient!bi;")
	public Class23_Sub1 method461() {
		@Pc(3) Class23_Sub1 local3 = new Class23_Sub1();
		local3.aFloat8 = this.aFloat8;
		local3.aFloat12 = this.aFloat12;
		local3.aFloat15 = this.aFloat15;
		local3.aFloat13 = this.aFloat13;
		local3.aFloat4 = this.aFloat4;
		local3.aFloat5 = this.aFloat5;
		local3.aFloat6 = this.aFloat6;
		local3.aFloat10 = this.aFloat10;
		local3.aFloat14 = this.aFloat14;
		local3.aFloat9 = this.aFloat9;
		local3.aFloat7 = this.aFloat7;
		local3.aFloat11 = this.aFloat11;
		return local3;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)[F")
	public float[] method462() {
		Static25.aFloatArray1[4] = this.aFloat15;
		Static25.aFloatArray1[6] = this.aFloat13;
		Static25.aFloatArray1[12] = this.aFloat11;
		Static25.aFloatArray1[10] = this.aFloat6;
		Static25.aFloatArray1[9] = this.aFloat12;
		Static25.aFloatArray1[8] = this.aFloat4;
		Static25.aFloatArray1[1] = this.aFloat9;
		Static25.aFloatArray1[14] = this.aFloat10;
		Static25.aFloatArray1[13] = this.aFloat8;
		Static25.aFloatArray1[5] = this.aFloat5;
		Static25.aFloatArray1[2] = this.aFloat7;
		Static25.aFloatArray1[0] = this.aFloat14;
		return Static25.aFloatArray1;
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
	@Override
	public void method5101(@OriginalArg(0) int arg0) {
		this.aFloat14 = 1.0F;
		this.aFloat5 = this.aFloat6 = Class213.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat13 = Class213.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat15 = this.aFloat4 = this.aFloat11 = this.aFloat9 = this.aFloat8 = this.aFloat7 = this.aFloat10 = 0.0F;
		this.aFloat12 = -this.aFloat13;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([I)V")
	@Override
	public void method5097(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat11;
		@Pc(15) float local15 = (float) arg0[1] - this.aFloat8;
		@Pc(24) float local24 = (float) arg0[2] - this.aFloat10;
		arg0[2] = (int) (local15 * this.aFloat12 + local7 * this.aFloat4 + local24 * this.aFloat6);
		arg0[0] = (int) (local7 * this.aFloat14 + this.aFloat9 * local15 + this.aFloat7 * local24);
		arg0[1] = (int) (local24 * this.aFloat13 + local7 * this.aFloat15 + local15 * this.aFloat5);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ib;)V")
	@Override
	public void method5088(@OriginalArg(0) Class23 arg0) {
		@Pc(2) Class23_Sub1 local2 = (Class23_Sub1) arg0;
		this.aFloat6 = local2.aFloat6;
		this.aFloat9 = local2.aFloat9;
		this.aFloat4 = local2.aFloat4;
		this.aFloat7 = local2.aFloat7;
		this.aFloat12 = local2.aFloat12;
		this.aFloat14 = local2.aFloat14;
		this.aFloat10 = local2.aFloat10;
		this.aFloat13 = local2.aFloat13;
		this.aFloat5 = local2.aFloat5;
		this.aFloat15 = local2.aFloat15;
		this.aFloat11 = local2.aFloat11;
		this.aFloat8 = local2.aFloat8;
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)[F")
	public float[] method463() {
		Static25.aFloatArray1[10] = this.aFloat6;
		Static25.aFloatArray1[13] = 0.0F;
		Static25.aFloatArray1[6] = this.aFloat13;
		Static25.aFloatArray1[0] = this.aFloat14;
		Static25.aFloatArray1[9] = this.aFloat12;
		Static25.aFloatArray1[8] = this.aFloat4;
		Static25.aFloatArray1[1] = this.aFloat9;
		Static25.aFloatArray1[5] = this.aFloat5;
		Static25.aFloatArray1[12] = 0.0F;
		Static25.aFloatArray1[4] = this.aFloat15;
		Static25.aFloatArray1[14] = 0.0F;
		Static25.aFloatArray1[2] = this.aFloat7;
		return Static25.aFloatArray1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	@Override
	public void method5089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat11 += arg0;
		this.aFloat10 += arg2;
		this.aFloat8 += arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	@Override
	public void method5094(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class213.aFloatArray28[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class213.aFloatArray27[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat9;
		@Pc(17) float local17 = this.aFloat5;
		@Pc(20) float local20 = this.aFloat12;
		@Pc(23) float local23 = this.aFloat8;
		this.aFloat9 = local5 * local14 - this.aFloat7 * local11;
		this.aFloat7 = local5 * this.aFloat7 + local14 * local11;
		this.aFloat5 = local5 * local17 - this.aFloat13 * local11;
		this.aFloat13 = local5 * this.aFloat13 + local11 * local17;
		this.aFloat12 = local5 * local20 - this.aFloat6 * local11;
		this.aFloat8 = local23 * local5 - this.aFloat10 * local11;
		this.aFloat6 = local20 * local11 + local5 * this.aFloat6;
		this.aFloat10 = this.aFloat10 * local5 + local11 * local23;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
	@Override
	public void method5098(@OriginalArg(0) int arg0) {
		this.aFloat6 = 1.0F;
		this.aFloat14 = this.aFloat5 = Class213.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat9 = Class213.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat4 = this.aFloat11 = this.aFloat12 = this.aFloat8 = this.aFloat7 = this.aFloat13 = this.aFloat10 = 0.0F;
		this.aFloat15 = -this.aFloat9;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat11 + (float) arg2 * this.aFloat4 + this.aFloat14 * (float) arg0 + (float) arg1 * this.aFloat15);
		arg3[2] = (int) (this.aFloat6 * (float) arg2 + this.aFloat13 * (float) arg1 + this.aFloat7 * (float) arg0 + this.aFloat10);
		arg3[1] = (int) (this.aFloat8 + (float) arg1 * this.aFloat5 + this.aFloat9 * (float) arg0 + this.aFloat12 * (float) arg2);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
	@Override
	public void method5090() {
		this.aFloat9 = this.aFloat7 = this.aFloat15 = this.aFloat13 = this.aFloat4 = this.aFloat12 = this.aFloat11 = this.aFloat8 = this.aFloat10 = 0.0F;
		this.aFloat14 = this.aFloat5 = this.aFloat6 = 1.0F;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
	@Override
	public void method5091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat10 = arg2;
		this.aFloat9 = this.aFloat7 = this.aFloat15 = this.aFloat13 = this.aFloat4 = this.aFloat12 = 0.0F;
		this.aFloat8 = arg1;
		this.aFloat14 = this.aFloat5 = this.aFloat6 = 1.0F;
		this.aFloat11 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ib;I)V")
	public void method464(@OriginalArg(0) Class23 arg0) {
		@Pc(2) Class23_Sub1 local2 = (Class23_Sub1) arg0;
		this.aFloat4 = local2.aFloat7;
		this.aFloat15 = local2.aFloat9;
		this.aFloat14 = local2.aFloat14;
		this.aFloat5 = local2.aFloat5;
		this.aFloat12 = local2.aFloat13;
		this.aFloat9 = local2.aFloat15;
		this.aFloat7 = local2.aFloat4;
		this.aFloat13 = local2.aFloat12;
		this.aFloat6 = local2.aFloat6;
		this.aFloat11 = -(this.aFloat14 * local2.aFloat11 + local2.aFloat8 * this.aFloat15 + this.aFloat4 * local2.aFloat10);
		this.aFloat8 = -(this.aFloat12 * local2.aFloat10 + this.aFloat9 * local2.aFloat11 + local2.aFloat8 * this.aFloat5);
		this.aFloat10 = -(this.aFloat7 * local2.aFloat11 + local2.aFloat8 * this.aFloat13 + this.aFloat6 * local2.aFloat10);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	@Override
	public void method5095(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class213.aFloatArray28[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class213.aFloatArray27[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat14;
		@Pc(17) float local17 = this.aFloat15;
		@Pc(20) float local20 = this.aFloat4;
		this.aFloat14 = this.aFloat7 * local11 + local14 * local5;
		@Pc(33) float local33 = this.aFloat11;
		this.aFloat15 = local17 * local5 + local11 * this.aFloat13;
		this.aFloat7 = this.aFloat7 * local5 - local14 * local11;
		this.aFloat4 = local11 * this.aFloat6 + local20 * local5;
		this.aFloat13 = this.aFloat13 * local5 - local17 * local11;
		this.aFloat6 = this.aFloat6 * local5 - local20 * local11;
		this.aFloat11 = this.aFloat10 * local11 + local5 * local33;
		this.aFloat10 = this.aFloat10 * local5 - local11 * local33;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class213.aFloatArray28[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class213.aFloatArray27[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class213.aFloatArray28[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class213.aFloatArray27[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class213.aFloatArray28[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class213.aFloatArray27[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local11 * local35;
		this.aFloat12 = local23 * local35 + local17 * local39;
		this.aFloat5 = local5 * local29;
		this.aFloat9 = local39 * local23 + local35 * -local17;
		this.aFloat7 = local5 * local23;
		this.aFloat15 = local35 * local5;
		this.aFloat4 = -local23 * local29 + local17 * local43;
		this.aFloat6 = local17 * local5;
		this.aFloat14 = local17 * local29 + local43 * local23;
		this.aFloat13 = -local11;
		this.aFloat11 = this.aFloat14 * (float) -arg0 - (float) arg1 * this.aFloat15 - this.aFloat4 * (float) arg2;
		this.aFloat10 = -(this.aFloat13 * (float) arg1) + (float) -arg0 * this.aFloat7 - (float) arg2 * this.aFloat6;
		this.aFloat8 = this.aFloat9 * (float) -arg0 - (float) arg1 * this.aFloat5 - this.aFloat12 * (float) arg2;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
	@Override
	public void method5099(@OriginalArg(0) int arg0) {
		this.aFloat5 = 1.0F;
		this.aFloat14 = this.aFloat6 = Class213.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat4 = Class213.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat15 = this.aFloat11 = this.aFloat9 = this.aFloat12 = this.aFloat8 = this.aFloat13 = this.aFloat10 = 0.0F;
		this.aFloat7 = -this.aFloat4;
	}
}
