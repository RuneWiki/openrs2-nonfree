import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class72_Sub1() {
		this.method4071();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V")
	@Override
	public void method4067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat24 = this.aFloat27 = this.aFloat31 = this.aFloat26 = this.aFloat34 = this.aFloat33 = 0.0F;
		this.aFloat25 = this.aFloat28 = this.aFloat29 = 1.0F;
		this.aFloat32 = arg1;
		this.aFloat23 = arg2;
		this.aFloat30 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class208.aFloatArray28[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class208.aFloatArray27[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class208.aFloatArray28[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class208.aFloatArray27[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class208.aFloatArray28[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class208.aFloatArray27[arg5 & 0x3FFF];
		@Pc(39) float local39 = local11 * local29;
		@Pc(43) float local43 = local11 * local35;
		this.aFloat31 = local35 * local5;
		this.aFloat29 = local17 * local5;
		this.aFloat27 = local23 * local5;
		this.aFloat26 = -local11;
		this.aFloat25 = local23 * local43 + local29 * local17;
		this.aFloat33 = local39 * local17 + local23 * local35;
		this.aFloat34 = local43 * local17 + -local23 * local29;
		this.aFloat24 = local39 * local23 + local35 * -local17;
		this.aFloat28 = local5 * local29;
		this.aFloat23 = -(this.aFloat26 * (float) arg1) + this.aFloat27 * (float) -arg0 - (float) arg2 * this.aFloat29;
		this.aFloat30 = (float) -arg0 * this.aFloat25 - this.aFloat31 * (float) arg1 - this.aFloat34 * (float) arg2;
		this.aFloat32 = -((float) arg2 * this.aFloat33) - this.aFloat28 * (float) arg1 + this.aFloat24 * (float) -arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg1 * this.aFloat31 + this.aFloat25 * (float) arg0 + (float) arg2 * this.aFloat34 + this.aFloat30);
		arg3[1] = (int) ((float) arg2 * this.aFloat33 + this.aFloat28 * (float) arg1 + this.aFloat24 * (float) arg0 + this.aFloat32);
		arg3[2] = (int) (this.aFloat23 + (float) arg0 * this.aFloat27 + (float) arg1 * this.aFloat26 + (float) arg2 * this.aFloat29);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "()Lclient!fl;")
	public Class72_Sub1 method1531() {
		@Pc(3) Class72_Sub1 local3 = new Class72_Sub1();
		local3.aFloat29 = this.aFloat29;
		local3.aFloat34 = this.aFloat34;
		local3.aFloat26 = this.aFloat26;
		local3.aFloat28 = this.aFloat28;
		local3.aFloat27 = this.aFloat27;
		local3.aFloat33 = this.aFloat33;
		local3.aFloat25 = this.aFloat25;
		local3.aFloat24 = this.aFloat24;
		local3.aFloat30 = this.aFloat30;
		local3.aFloat31 = this.aFloat31;
		local3.aFloat23 = this.aFloat23;
		local3.aFloat32 = this.aFloat32;
		return local3;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	@Override
	public void method4072(@OriginalArg(0) int arg0) {
		this.aFloat29 = 1.0F;
		this.aFloat25 = this.aFloat28 = Class208.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat24 = Class208.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat34 = this.aFloat30 = this.aFloat33 = this.aFloat32 = this.aFloat27 = this.aFloat26 = this.aFloat23 = 0.0F;
		this.aFloat31 = -this.aFloat24;
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)V")
	@Override
	public void method4082(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class208.aFloatArray28[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class208.aFloatArray27[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat24;
		@Pc(17) float local17 = this.aFloat28;
		@Pc(20) float local20 = this.aFloat33;
		this.aFloat24 = local5 * local14 - this.aFloat27 * local11;
		@Pc(34) float local34 = this.aFloat32;
		this.aFloat27 = local11 * local14 + local5 * this.aFloat27;
		this.aFloat28 = local17 * local5 - this.aFloat26 * local11;
		this.aFloat33 = local5 * local20 - this.aFloat29 * local11;
		this.aFloat26 = local5 * this.aFloat26 + local11 * local17;
		this.aFloat29 = this.aFloat29 * local5 + local20 * local11;
		this.aFloat32 = local34 * local5 - this.aFloat23 * local11;
		this.aFloat23 = local5 * this.aFloat23 + local11 * local34;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!po;)V")
	public void method1532(@OriginalArg(1) Class72 arg0) {
		@Pc(2) Class72_Sub1 local2 = (Class72_Sub1) arg0;
		this.aFloat25 = local2.aFloat25;
		this.aFloat31 = local2.aFloat24;
		this.aFloat34 = local2.aFloat27;
		this.aFloat28 = local2.aFloat28;
		this.aFloat33 = local2.aFloat26;
		this.aFloat27 = local2.aFloat34;
		this.aFloat24 = local2.aFloat31;
		this.aFloat26 = local2.aFloat33;
		this.aFloat30 = -(local2.aFloat23 * this.aFloat34 + this.aFloat25 * local2.aFloat30 + this.aFloat31 * local2.aFloat32);
		this.aFloat29 = local2.aFloat29;
		this.aFloat32 = -(this.aFloat28 * local2.aFloat32 + local2.aFloat30 * this.aFloat24 + this.aFloat33 * local2.aFloat23);
		this.aFloat23 = -(local2.aFloat30 * this.aFloat27 + local2.aFloat32 * this.aFloat26 + this.aFloat29 * local2.aFloat23);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "()V")
	@Override
	public void method4071() {
		this.aFloat24 = this.aFloat27 = this.aFloat31 = this.aFloat26 = this.aFloat34 = this.aFloat33 = this.aFloat30 = this.aFloat32 = this.aFloat23 = 0.0F;
		this.aFloat25 = this.aFloat28 = this.aFloat29 = 1.0F;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([I)V")
	@Override
	public void method4079(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat30;
		@Pc(15) float local15 = (float) arg0[1] - this.aFloat32;
		@Pc(23) float local23 = (float) arg0[2] - this.aFloat23;
		arg0[2] = (int) (this.aFloat33 * local15 + this.aFloat34 * local7 + this.aFloat29 * local23);
		arg0[0] = (int) (local15 * this.aFloat24 + local7 * this.aFloat25 + local23 * this.aFloat27);
		arg0[1] = (int) (this.aFloat31 * local7 + local15 * this.aFloat28 + local23 * this.aFloat26);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!po;)V")
	@Override
	public void method4070(@OriginalArg(0) Class72 arg0) {
		@Pc(2) Class72_Sub1 local2 = (Class72_Sub1) arg0;
		this.aFloat29 = local2.aFloat29;
		this.aFloat24 = local2.aFloat24;
		this.aFloat32 = local2.aFloat32;
		this.aFloat30 = local2.aFloat30;
		this.aFloat25 = local2.aFloat25;
		this.aFloat27 = local2.aFloat27;
		this.aFloat26 = local2.aFloat26;
		this.aFloat28 = local2.aFloat28;
		this.aFloat31 = local2.aFloat31;
		this.aFloat33 = local2.aFloat33;
		this.aFloat34 = local2.aFloat34;
		this.aFloat23 = local2.aFloat23;
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
	@Override
	public void method4081(@OriginalArg(0) int arg0) {
		this.aFloat28 = 1.0F;
		this.aFloat25 = this.aFloat29 = Class208.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat34 = Class208.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat27 = -this.aFloat34;
		this.aFloat31 = this.aFloat30 = this.aFloat24 = this.aFloat33 = this.aFloat32 = this.aFloat26 = this.aFloat23 = 0.0F;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)[F")
	public float[] method1533() {
		Static89.aFloatArray4[8] = this.aFloat34;
		Static89.aFloatArray4[1] = this.aFloat24;
		Static89.aFloatArray4[4] = this.aFloat31;
		Static89.aFloatArray4[9] = this.aFloat33;
		Static89.aFloatArray4[13] = 0.0F;
		Static89.aFloatArray4[2] = this.aFloat27;
		Static89.aFloatArray4[12] = 0.0F;
		Static89.aFloatArray4[6] = this.aFloat26;
		Static89.aFloatArray4[14] = 0.0F;
		Static89.aFloatArray4[0] = this.aFloat25;
		Static89.aFloatArray4[10] = this.aFloat29;
		Static89.aFloatArray4[5] = this.aFloat28;
		return Static89.aFloatArray4;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	@Override
	public void method4069(@OriginalArg(0) int arg0) {
		this.aFloat25 = 1.0F;
		this.aFloat28 = this.aFloat29 = Class208.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat26 = Class208.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat33 = -this.aFloat26;
		this.aFloat31 = this.aFloat34 = this.aFloat30 = this.aFloat24 = this.aFloat32 = this.aFloat27 = this.aFloat23 = 0.0F;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)V")
	@Override
	public void method4068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat32 += arg1;
		this.aFloat30 += arg0;
		this.aFloat23 += arg2;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)[F")
	public float[] method1534() {
		Static89.aFloatArray4[9] = this.aFloat33;
		Static89.aFloatArray4[14] = this.aFloat23;
		Static89.aFloatArray4[6] = this.aFloat26;
		Static89.aFloatArray4[4] = this.aFloat31;
		Static89.aFloatArray4[8] = this.aFloat34;
		Static89.aFloatArray4[0] = this.aFloat25;
		Static89.aFloatArray4[13] = this.aFloat32;
		Static89.aFloatArray4[10] = this.aFloat29;
		Static89.aFloatArray4[12] = this.aFloat30;
		Static89.aFloatArray4[5] = this.aFloat28;
		Static89.aFloatArray4[1] = this.aFloat24;
		Static89.aFloatArray4[2] = this.aFloat27;
		return Static89.aFloatArray4;
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	@Override
	public void method4074(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class208.aFloatArray28[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class208.aFloatArray27[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat25;
		@Pc(17) float local17 = this.aFloat31;
		@Pc(20) float local20 = this.aFloat34;
		this.aFloat25 = local14 * local5 + local11 * this.aFloat27;
		@Pc(33) float local33 = this.aFloat30;
		this.aFloat27 = this.aFloat27 * local5 - local11 * local14;
		this.aFloat31 = this.aFloat26 * local11 + local17 * local5;
		this.aFloat34 = this.aFloat29 * local11 + local20 * local5;
		this.aFloat26 = this.aFloat26 * local5 - local17 * local11;
		this.aFloat29 = local5 * this.aFloat29 - local11 * local20;
		this.aFloat30 = local5 * local33 + this.aFloat23 * local11;
		this.aFloat23 = local5 * this.aFloat23 - local11 * local33;
	}
}
