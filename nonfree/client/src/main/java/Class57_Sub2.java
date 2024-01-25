import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!os", name = "k", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!os", name = "q", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!os", name = "t", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!os", name = "u", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class57_Sub2() {
		this.method4193();
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(III)V")
	@Override
	public void method4190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat74 += arg1;
		this.aFloat76 += arg2;
		this.aFloat79 += arg0;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "()Lclient!os;")
	public Class57_Sub2 method4204() {
		@Pc(3) Class57_Sub2 local3 = new Class57_Sub2();
		local3.aFloat73 = this.aFloat73;
		local3.aFloat80 = this.aFloat80;
		local3.aFloat78 = this.aFloat78;
		local3.aFloat75 = this.aFloat75;
		local3.aFloat71 = this.aFloat71;
		local3.aFloat77 = this.aFloat77;
		local3.aFloat74 = this.aFloat74;
		local3.aFloat82 = this.aFloat82;
		local3.aFloat81 = this.aFloat81;
		local3.aFloat72 = this.aFloat72;
		local3.aFloat79 = this.aFloat79;
		local3.aFloat76 = this.aFloat76;
		return local3;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	@Override
	public void method4187(@OriginalArg(0) int arg0) {
		this.aFloat75 = 1.0F;
		this.aFloat77 = this.aFloat82 = Class190.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat73 = Class190.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat80 = -this.aFloat73;
		this.aFloat81 = this.aFloat78 = this.aFloat79 = this.aFloat71 = this.aFloat74 = this.aFloat72 = this.aFloat76 = 0.0F;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V")
	@Override
	public void method4196(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class190.aFloatArray29[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class190.aFloatArray30[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat71;
		@Pc(17) float local17 = this.aFloat77;
		@Pc(20) float local20 = this.aFloat80;
		@Pc(23) float local23 = this.aFloat74;
		this.aFloat71 = local14 * local5 - this.aFloat72 * local11;
		this.aFloat77 = local5 * local17 - this.aFloat73 * local11;
		this.aFloat72 = local11 * local14 + local5 * this.aFloat72;
		this.aFloat80 = local5 * local20 - local11 * this.aFloat82;
		this.aFloat73 = local5 * this.aFloat73 + local17 * local11;
		this.aFloat82 = local5 * this.aFloat82 + local11 * local20;
		this.aFloat74 = local5 * local23 - this.aFloat76 * local11;
		this.aFloat76 = local23 * local11 + local5 * this.aFloat76;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V")
	@Override
	public void method4200(@OriginalArg(0) int arg0) {
		this.aFloat82 = 1.0F;
		this.aFloat75 = this.aFloat77 = Class190.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat71 = Class190.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat81 = -this.aFloat71;
		this.aFloat78 = this.aFloat79 = this.aFloat80 = this.aFloat74 = this.aFloat72 = this.aFloat73 = this.aFloat76 = 0.0F;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)[F")
	public float[] method4205() {
		Static236.aFloatArray27[8] = this.aFloat78;
		Static236.aFloatArray27[9] = this.aFloat80;
		Static236.aFloatArray27[14] = 0.0F;
		Static236.aFloatArray27[4] = this.aFloat81;
		Static236.aFloatArray27[12] = 0.0F;
		Static236.aFloatArray27[2] = this.aFloat72;
		Static236.aFloatArray27[6] = this.aFloat73;
		Static236.aFloatArray27[10] = this.aFloat82;
		Static236.aFloatArray27[5] = this.aFloat77;
		Static236.aFloatArray27[0] = this.aFloat75;
		Static236.aFloatArray27[1] = this.aFloat71;
		Static236.aFloatArray27[13] = 0.0F;
		return Static236.aFloatArray27;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V")
	@Override
	public void method4192(@OriginalArg(0) int arg0) {
		this.aFloat77 = 1.0F;
		this.aFloat75 = this.aFloat82 = Class190.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat78 = Class190.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat72 = -this.aFloat78;
		this.aFloat81 = this.aFloat79 = this.aFloat71 = this.aFloat80 = this.aFloat74 = this.aFloat73 = this.aFloat76 = 0.0F;
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
	@Override
	public void method4199(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class190.aFloatArray29[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class190.aFloatArray30[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat75;
		@Pc(17) float local17 = this.aFloat81;
		@Pc(20) float local20 = this.aFloat78;
		@Pc(23) float local23 = this.aFloat79;
		this.aFloat75 = local5 * local14 + this.aFloat72 * local11;
		this.aFloat81 = local11 * this.aFloat73 + local17 * local5;
		this.aFloat72 = local5 * this.aFloat72 - local14 * local11;
		this.aFloat73 = this.aFloat73 * local5 - local17 * local11;
		this.aFloat78 = local11 * this.aFloat82 + local20 * local5;
		this.aFloat82 = local5 * this.aFloat82 - local11 * local20;
		this.aFloat79 = local5 * local23 + this.aFloat76 * local11;
		this.aFloat76 = local5 * this.aFloat76 - local23 * local11;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat76 + this.aFloat82 * (float) arg2 + (float) arg1 * this.aFloat73 + this.aFloat72 * (float) arg0);
		arg3[0] = (int) (this.aFloat79 + this.aFloat75 * (float) arg0 + this.aFloat81 * (float) arg1 + (float) arg2 * this.aFloat78);
		arg3[1] = (int) (this.aFloat74 + (float) arg1 * this.aFloat77 + (float) arg0 * this.aFloat71 + this.aFloat80 * (float) arg2);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([I)V")
	@Override
	public void method4201(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat79;
		@Pc(15) float local15 = (float) arg0[1] - this.aFloat74;
		@Pc(23) float local23 = (float) arg0[2] - this.aFloat76;
		arg0[2] = (int) (local23 * this.aFloat82 + local7 * this.aFloat78 + this.aFloat80 * local15);
		arg0[1] = (int) (this.aFloat77 * local15 + local7 * this.aFloat81 + local23 * this.aFloat73);
		arg0[0] = (int) (this.aFloat72 * local23 + this.aFloat71 * local15 + this.aFloat75 * local7);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "()V")
	@Override
	public void method4193() {
		this.aFloat75 = this.aFloat77 = this.aFloat82 = 1.0F;
		this.aFloat71 = this.aFloat72 = this.aFloat81 = this.aFloat73 = this.aFloat78 = this.aFloat80 = this.aFloat79 = this.aFloat74 = this.aFloat76 = 0.0F;
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "(I)[F")
	public float[] method4206() {
		Static236.aFloatArray27[9] = this.aFloat80;
		Static236.aFloatArray27[10] = this.aFloat82;
		Static236.aFloatArray27[6] = this.aFloat73;
		Static236.aFloatArray27[14] = this.aFloat76;
		Static236.aFloatArray27[0] = this.aFloat75;
		Static236.aFloatArray27[13] = this.aFloat74;
		Static236.aFloatArray27[5] = this.aFloat77;
		Static236.aFloatArray27[8] = this.aFloat78;
		Static236.aFloatArray27[12] = this.aFloat79;
		Static236.aFloatArray27[2] = this.aFloat72;
		Static236.aFloatArray27[1] = this.aFloat71;
		Static236.aFloatArray27[4] = this.aFloat81;
		return Static236.aFloatArray27;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class190.aFloatArray29[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class190.aFloatArray30[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class190.aFloatArray29[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class190.aFloatArray30[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class190.aFloatArray29[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class190.aFloatArray30[arg5 & 0x3FFF];
		@Pc(39) float local39 = local11 * local29;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat77 = local29 * local5;
		this.aFloat72 = local23 * local5;
		this.aFloat73 = -local11;
		this.aFloat81 = local5 * local35;
		this.aFloat80 = local39 * local17 + local35 * local23;
		this.aFloat71 = local35 * -local17 + local23 * local39;
		this.aFloat82 = local5 * local17;
		this.aFloat78 = local17 * local43 + local29 * -local23;
		this.aFloat75 = local43 * local23 + local17 * local29;
		this.aFloat76 = -(this.aFloat82 * (float) arg2) + (float) -arg0 * this.aFloat72 - (float) arg1 * this.aFloat73;
		this.aFloat74 = -(this.aFloat80 * (float) arg2) + (float) -arg0 * this.aFloat71 - this.aFloat77 * (float) arg1;
		this.aFloat79 = -(this.aFloat78 * (float) arg2) - this.aFloat81 * (float) arg1 + (float) -arg0 * this.aFloat75;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
	@Override
	public void method4189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat74 = arg1;
		this.aFloat76 = arg2;
		this.aFloat75 = this.aFloat77 = this.aFloat82 = 1.0F;
		this.aFloat79 = arg0;
		this.aFloat71 = this.aFloat72 = this.aFloat81 = this.aFloat73 = this.aFloat78 = this.aFloat80 = 0.0F;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!s;)V")
	public void method4207(@OriginalArg(1) Class57 arg0) {
		@Pc(2) Class57_Sub2 local2 = (Class57_Sub2) arg0;
		this.aFloat78 = local2.aFloat72;
		this.aFloat75 = local2.aFloat75;
		this.aFloat81 = local2.aFloat71;
		this.aFloat80 = local2.aFloat73;
		this.aFloat77 = local2.aFloat77;
		this.aFloat72 = local2.aFloat78;
		this.aFloat71 = local2.aFloat81;
		this.aFloat73 = local2.aFloat80;
		this.aFloat82 = local2.aFloat82;
		this.aFloat79 = -(this.aFloat81 * local2.aFloat74 + this.aFloat75 * local2.aFloat79 + local2.aFloat76 * this.aFloat78);
		this.aFloat74 = -(this.aFloat80 * local2.aFloat76 + local2.aFloat79 * this.aFloat71 + this.aFloat77 * local2.aFloat74);
		this.aFloat76 = -(local2.aFloat76 * this.aFloat82 + local2.aFloat79 * this.aFloat72 + this.aFloat73 * local2.aFloat74);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!s;)V")
	@Override
	public void method4195(@OriginalArg(0) Class57 arg0) {
		@Pc(2) Class57_Sub2 local2 = (Class57_Sub2) arg0;
		this.aFloat75 = local2.aFloat75;
		this.aFloat74 = local2.aFloat74;
		this.aFloat77 = local2.aFloat77;
		this.aFloat76 = local2.aFloat76;
		this.aFloat72 = local2.aFloat72;
		this.aFloat80 = local2.aFloat80;
		this.aFloat81 = local2.aFloat81;
		this.aFloat79 = local2.aFloat79;
		this.aFloat82 = local2.aFloat82;
		this.aFloat73 = local2.aFloat73;
		this.aFloat71 = local2.aFloat71;
		this.aFloat78 = local2.aFloat78;
	}
}
