import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "F")
	public float aFloat7;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class21_Sub1() {
		this.method2800();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat10 * (float) arg2 + (float) arg1 * this.aFloat18 + (float) arg0 * this.aFloat9 + this.aFloat8);
		arg3[0] = (int) (this.aFloat12 * (float) arg2 + this.aFloat13 * (float) arg0 + (float) arg1 * this.aFloat15 + this.aFloat7);
		arg3[1] = (int) (this.aFloat11 + this.aFloat17 * (float) arg1 + this.aFloat16 * (float) arg0 + this.aFloat14 * (float) arg2);
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)V")
	@Override
	public void method2814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat11 = arg1;
		this.aFloat7 = arg0;
		this.aFloat16 = this.aFloat9 = this.aFloat15 = this.aFloat18 = this.aFloat12 = this.aFloat14 = 0.0F;
		this.aFloat8 = arg2;
		this.aFloat13 = this.aFloat17 = this.aFloat10 = 1.0F;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	@Override
	public void method2802(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class25.aFloatArray11[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class25.aFloatArray12[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat13;
		@Pc(17) float local17 = this.aFloat15;
		@Pc(20) float local20 = this.aFloat12;
		@Pc(23) float local23 = this.aFloat7;
		this.aFloat13 = local11 * this.aFloat9 + local5 * local14;
		this.aFloat15 = local5 * local17 + this.aFloat18 * local11;
		this.aFloat9 = this.aFloat9 * local5 - local14 * local11;
		this.aFloat18 = this.aFloat18 * local5 - local17 * local11;
		this.aFloat12 = local5 * local20 + local11 * this.aFloat10;
		this.aFloat10 = local5 * this.aFloat10 - local20 * local11;
		this.aFloat7 = local23 * local5 + local11 * this.aFloat8;
		this.aFloat8 = local5 * this.aFloat8 - local23 * local11;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ci;)V")
	@Override
	public void method2813(@OriginalArg(0) Class21 arg0) {
		@Pc(2) Class21_Sub1 local2 = (Class21_Sub1) arg0;
		this.aFloat13 = local2.aFloat13;
		this.aFloat18 = local2.aFloat18;
		this.aFloat7 = local2.aFloat7;
		this.aFloat9 = local2.aFloat9;
		this.aFloat15 = local2.aFloat15;
		this.aFloat8 = local2.aFloat8;
		this.aFloat12 = local2.aFloat12;
		this.aFloat16 = local2.aFloat16;
		this.aFloat14 = local2.aFloat14;
		this.aFloat17 = local2.aFloat17;
		this.aFloat11 = local2.aFloat11;
		this.aFloat10 = local2.aFloat10;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ci;I)V")
	public void method793(@OriginalArg(0) Class21 arg0) {
		@Pc(2) Class21_Sub1 local2 = (Class21_Sub1) arg0;
		this.aFloat12 = local2.aFloat9;
		this.aFloat13 = local2.aFloat13;
		this.aFloat15 = local2.aFloat16;
		this.aFloat9 = local2.aFloat12;
		this.aFloat17 = local2.aFloat17;
		this.aFloat14 = local2.aFloat18;
		this.aFloat16 = local2.aFloat15;
		this.aFloat7 = -(this.aFloat12 * local2.aFloat8 + this.aFloat15 * local2.aFloat11 + this.aFloat13 * local2.aFloat7);
		this.aFloat10 = local2.aFloat10;
		this.aFloat18 = local2.aFloat14;
		this.aFloat11 = -(local2.aFloat8 * this.aFloat14 + this.aFloat17 * local2.aFloat11 + local2.aFloat7 * this.aFloat16);
		this.aFloat8 = -(local2.aFloat11 * this.aFloat18 + this.aFloat9 * local2.aFloat7 + this.aFloat10 * local2.aFloat8);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	public void method2798(@OriginalArg(0) int arg0) {
		this.aFloat10 = 1.0F;
		this.aFloat13 = this.aFloat17 = Class25.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat16 = Class25.aFloatArray12[arg0 & 0x3FFF];
		this.aFloat15 = -this.aFloat16;
		this.aFloat12 = this.aFloat7 = this.aFloat14 = this.aFloat11 = this.aFloat9 = this.aFloat18 = this.aFloat8 = 0.0F;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method2812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class25.aFloatArray11[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class25.aFloatArray12[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class25.aFloatArray11[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class25.aFloatArray12[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class25.aFloatArray11[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class25.aFloatArray12[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local11 * local35;
		this.aFloat15 = local5 * local35;
		this.aFloat17 = local5 * local29;
		this.aFloat13 = local29 * local17 + local43 * local23;
		this.aFloat14 = local23 * local35 + local17 * local39;
		this.aFloat9 = local5 * local23;
		this.aFloat10 = local17 * local5;
		this.aFloat12 = local29 * -local23 + local17 * local43;
		this.aFloat16 = local39 * local23 + -local17 * local35;
		this.aFloat18 = -local11;
		this.aFloat7 = -((float) arg1 * this.aFloat15) + this.aFloat13 * (float) -arg0 - this.aFloat12 * (float) arg2;
		this.aFloat11 = -(this.aFloat14 * (float) arg2) - this.aFloat17 * (float) arg1 + (float) -arg0 * this.aFloat16;
		this.aFloat8 = -(this.aFloat18 * (float) arg1) + this.aFloat9 * (float) -arg0 - this.aFloat10 * (float) arg2;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V")
	@Override
	public void method2810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat8 += arg2;
		this.aFloat7 += arg0;
		this.aFloat11 += arg1;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([I)V")
	@Override
	public void method2799(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat7;
		@Pc(15) float local15 = (float) arg0[1] - this.aFloat11;
		@Pc(24) float local24 = (float) arg0[2] - this.aFloat8;
		arg0[2] = (int) (this.aFloat10 * local24 + local15 * this.aFloat14 + local7 * this.aFloat12);
		arg0[0] = (int) (local24 * this.aFloat9 + local15 * this.aFloat16 + local7 * this.aFloat13);
		arg0[1] = (int) (local24 * this.aFloat18 + this.aFloat15 * local7 + this.aFloat17 * local15);
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
	@Override
	public void method2805(@OriginalArg(0) int arg0) {
		this.aFloat13 = 1.0F;
		this.aFloat17 = this.aFloat10 = Class25.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat18 = Class25.aFloatArray12[arg0 & 0x3FFF];
		this.aFloat15 = this.aFloat12 = this.aFloat7 = this.aFloat16 = this.aFloat11 = this.aFloat9 = this.aFloat8 = 0.0F;
		this.aFloat14 = -this.aFloat18;
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V")
	@Override
	public void method2809(@OriginalArg(0) int arg0) {
		this.aFloat17 = 1.0F;
		this.aFloat13 = this.aFloat10 = Class25.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat12 = Class25.aFloatArray12[arg0 & 0x3FFF];
		this.aFloat15 = this.aFloat7 = this.aFloat16 = this.aFloat14 = this.aFloat11 = this.aFloat18 = this.aFloat8 = 0.0F;
		this.aFloat9 = -this.aFloat12;
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
	@Override
	public void method2815(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class25.aFloatArray11[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class25.aFloatArray12[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat16;
		@Pc(17) float local17 = this.aFloat17;
		@Pc(20) float local20 = this.aFloat14;
		this.aFloat16 = local14 * local5 - local11 * this.aFloat9;
		@Pc(34) float local34 = this.aFloat11;
		this.aFloat17 = local5 * local17 - this.aFloat18 * local11;
		this.aFloat9 = local14 * local11 + this.aFloat9 * local5;
		this.aFloat14 = local5 * local20 - this.aFloat10 * local11;
		this.aFloat18 = local5 * this.aFloat18 + local11 * local17;
		this.aFloat11 = local34 * local5 - local11 * this.aFloat8;
		this.aFloat10 = local5 * this.aFloat10 + local20 * local11;
		this.aFloat8 = local34 * local11 + this.aFloat8 * local5;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
	@Override
	public void method2800() {
		this.aFloat16 = this.aFloat9 = this.aFloat15 = this.aFloat18 = this.aFloat12 = this.aFloat14 = this.aFloat7 = this.aFloat11 = this.aFloat8 = 0.0F;
		this.aFloat13 = this.aFloat17 = this.aFloat10 = 1.0F;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()Lclient!bj;")
	public Class21_Sub1 method794() {
		@Pc(3) Class21_Sub1 local3 = new Class21_Sub1();
		local3.aFloat7 = this.aFloat7;
		local3.aFloat13 = this.aFloat13;
		local3.aFloat12 = this.aFloat12;
		local3.aFloat10 = this.aFloat10;
		local3.aFloat17 = this.aFloat17;
		local3.aFloat11 = this.aFloat11;
		local3.aFloat8 = this.aFloat8;
		local3.aFloat14 = this.aFloat14;
		local3.aFloat15 = this.aFloat15;
		local3.aFloat9 = this.aFloat9;
		local3.aFloat16 = this.aFloat16;
		local3.aFloat18 = this.aFloat18;
		return local3;
	}

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)[F")
	public float[] method795() {
		Static26.aFloatArray9[9] = this.aFloat14;
		Static26.aFloatArray9[13] = this.aFloat11;
		Static26.aFloatArray9[8] = this.aFloat12;
		Static26.aFloatArray9[0] = this.aFloat13;
		Static26.aFloatArray9[1] = this.aFloat16;
		Static26.aFloatArray9[2] = this.aFloat9;
		Static26.aFloatArray9[5] = this.aFloat17;
		Static26.aFloatArray9[10] = this.aFloat10;
		Static26.aFloatArray9[6] = this.aFloat18;
		Static26.aFloatArray9[14] = this.aFloat8;
		Static26.aFloatArray9[4] = this.aFloat15;
		Static26.aFloatArray9[12] = this.aFloat7;
		return Static26.aFloatArray9;
	}

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "(I)[F")
	public float[] method796() {
		Static26.aFloatArray9[14] = 0.0F;
		Static26.aFloatArray9[0] = this.aFloat13;
		Static26.aFloatArray9[13] = 0.0F;
		Static26.aFloatArray9[9] = this.aFloat14;
		Static26.aFloatArray9[2] = this.aFloat9;
		Static26.aFloatArray9[12] = 0.0F;
		Static26.aFloatArray9[6] = this.aFloat18;
		Static26.aFloatArray9[10] = this.aFloat10;
		Static26.aFloatArray9[8] = this.aFloat12;
		Static26.aFloatArray9[5] = this.aFloat17;
		Static26.aFloatArray9[4] = this.aFloat15;
		Static26.aFloatArray9[1] = this.aFloat16;
		return Static26.aFloatArray9;
	}
}
