import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class118_Sub1 extends Class118 {

	@OriginalMember(owner = "client!is", name = "f", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!is", name = "m", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!is", name = "n", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!is", name = "p", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!is", name = "q", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!is", name = "r", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class118_Sub1() {
		this.method2665();
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
	@Override
	public void method2660(@OriginalArg(0) int arg0) {
		this.aFloat25 = 1.0F;
		this.aFloat23 = this.aFloat31 = Class233.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat29 = Class233.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat24 = this.aFloat30 = this.aFloat26 = this.aFloat27 = this.aFloat33 = this.aFloat28 = this.aFloat32 = 0.0F;
		this.aFloat22 = -this.aFloat29;
	}

	@OriginalMember(owner = "client!is", name = "f", descriptor = "(I)V")
	@Override
	public void method2670(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class233.aFloatArray27[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class233.aFloatArray26[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat25;
		@Pc(17) float local17 = this.aFloat24;
		@Pc(20) float local20 = this.aFloat30;
		this.aFloat25 = local14 * local5 + local11 * this.aFloat28;
		@Pc(33) float local33 = this.aFloat26;
		this.aFloat28 = local5 * this.aFloat28 - local14 * local11;
		this.aFloat24 = local5 * local17 + this.aFloat29 * local11;
		this.aFloat30 = local5 * local20 + this.aFloat31 * local11;
		this.aFloat29 = this.aFloat29 * local5 - local17 * local11;
		this.aFloat26 = local33 * local5 + local11 * this.aFloat32;
		this.aFloat31 = local5 * this.aFloat31 - local11 * local20;
		this.aFloat32 = local5 * this.aFloat32 - local33 * local11;
	}

	@OriginalMember(owner = "client!is", name = "e", descriptor = "(I)V")
	@Override
	public void method2669(@OriginalArg(0) int arg0) {
		this.aFloat31 = 1.0F;
		this.aFloat25 = this.aFloat23 = Class233.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat27 = Class233.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat30 = this.aFloat26 = this.aFloat22 = this.aFloat33 = this.aFloat28 = this.aFloat29 = this.aFloat32 = 0.0F;
		this.aFloat24 = -this.aFloat27;
	}

	@OriginalMember(owner = "client!is", name = "g", descriptor = "(I)[F")
	public float[] method2482() {
		Static159.aFloatArray13[8] = this.aFloat30;
		Static159.aFloatArray13[14] = this.aFloat32;
		Static159.aFloatArray13[6] = this.aFloat29;
		Static159.aFloatArray13[10] = this.aFloat31;
		Static159.aFloatArray13[4] = this.aFloat24;
		Static159.aFloatArray13[13] = this.aFloat33;
		Static159.aFloatArray13[2] = this.aFloat28;
		Static159.aFloatArray13[12] = this.aFloat26;
		Static159.aFloatArray13[9] = this.aFloat22;
		Static159.aFloatArray13[0] = this.aFloat25;
		Static159.aFloatArray13[1] = this.aFloat27;
		Static159.aFloatArray13[5] = this.aFloat23;
		return Static159.aFloatArray13;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat26 + (float) arg0 * this.aFloat25 + this.aFloat24 * (float) arg1 + this.aFloat30 * (float) arg2);
		arg3[1] = (int) (this.aFloat33 + (float) arg2 * this.aFloat22 + this.aFloat27 * (float) arg0 + this.aFloat23 * (float) arg1);
		arg3[2] = (int) ((float) arg2 * this.aFloat31 + (float) arg0 * this.aFloat28 + this.aFloat29 * (float) arg1 + this.aFloat32);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)[F")
	public float[] method2483() {
		Static159.aFloatArray13[4] = this.aFloat24;
		Static159.aFloatArray13[6] = this.aFloat29;
		Static159.aFloatArray13[9] = this.aFloat22;
		Static159.aFloatArray13[13] = 0.0F;
		Static159.aFloatArray13[10] = this.aFloat31;
		Static159.aFloatArray13[2] = this.aFloat28;
		Static159.aFloatArray13[8] = this.aFloat30;
		Static159.aFloatArray13[5] = this.aFloat23;
		Static159.aFloatArray13[14] = 0.0F;
		Static159.aFloatArray13[0] = this.aFloat25;
		Static159.aFloatArray13[1] = this.aFloat27;
		Static159.aFloatArray13[12] = 0.0F;
		return Static159.aFloatArray13;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(III)V")
	@Override
	public void method2659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat33 = arg1;
		this.aFloat32 = arg2;
		this.aFloat27 = this.aFloat28 = this.aFloat24 = this.aFloat29 = this.aFloat30 = this.aFloat22 = 0.0F;
		this.aFloat25 = this.aFloat23 = this.aFloat31 = 1.0F;
		this.aFloat26 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
	@Override
	public void method2658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat32 += arg2;
		this.aFloat33 += arg1;
		this.aFloat26 += arg0;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!os;)V")
	@Override
	public void method2657(@OriginalArg(0) Class118 arg0) {
		@Pc(2) Class118_Sub1 local2 = (Class118_Sub1) arg0;
		this.aFloat33 = local2.aFloat33;
		this.aFloat29 = local2.aFloat29;
		this.aFloat27 = local2.aFloat27;
		this.aFloat31 = local2.aFloat31;
		this.aFloat28 = local2.aFloat28;
		this.aFloat26 = local2.aFloat26;
		this.aFloat30 = local2.aFloat30;
		this.aFloat24 = local2.aFloat24;
		this.aFloat32 = local2.aFloat32;
		this.aFloat22 = local2.aFloat22;
		this.aFloat25 = local2.aFloat25;
		this.aFloat23 = local2.aFloat23;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	@Override
	public void method2656(@OriginalArg(0) int arg0) {
		this.aFloat23 = 1.0F;
		this.aFloat25 = this.aFloat31 = Class233.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat30 = Class233.aFloatArray26[arg0 & 0x3FFF];
		this.aFloat28 = -this.aFloat30;
		this.aFloat24 = this.aFloat26 = this.aFloat27 = this.aFloat22 = this.aFloat33 = this.aFloat29 = this.aFloat32 = 0.0F;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "()Lclient!is;")
	public Class118_Sub1 method2484() {
		@Pc(3) Class118_Sub1 local3 = new Class118_Sub1();
		local3.aFloat24 = this.aFloat24;
		local3.aFloat26 = this.aFloat26;
		local3.aFloat29 = this.aFloat29;
		local3.aFloat30 = this.aFloat30;
		local3.aFloat25 = this.aFloat25;
		local3.aFloat32 = this.aFloat32;
		local3.aFloat28 = this.aFloat28;
		local3.aFloat23 = this.aFloat23;
		local3.aFloat27 = this.aFloat27;
		local3.aFloat22 = this.aFloat22;
		local3.aFloat33 = this.aFloat33;
		local3.aFloat31 = this.aFloat31;
		return local3;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([I)V")
	@Override
	public void method2667(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat26;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat33;
		@Pc(25) float local25 = (float) arg0[2] - this.aFloat32;
		arg0[2] = (int) (local7 * this.aFloat30 + this.aFloat22 * local16 + this.aFloat31 * local25);
		arg0[0] = (int) (this.aFloat25 * local7 + local16 * this.aFloat27 + this.aFloat28 * local25);
		arg0[1] = (int) (this.aFloat23 * local16 + local7 * this.aFloat24 + this.aFloat29 * local25);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "()V")
	@Override
	public void method2665() {
		this.aFloat27 = this.aFloat28 = this.aFloat24 = this.aFloat29 = this.aFloat30 = this.aFloat22 = this.aFloat26 = this.aFloat33 = this.aFloat32 = 0.0F;
		this.aFloat25 = this.aFloat23 = this.aFloat31 = 1.0F;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V")
	@Override
	public void method2666(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class233.aFloatArray27[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class233.aFloatArray26[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat27;
		@Pc(17) float local17 = this.aFloat23;
		@Pc(20) float local20 = this.aFloat22;
		this.aFloat27 = local14 * local5 - this.aFloat28 * local11;
		@Pc(33) float local33 = this.aFloat33;
		this.aFloat28 = this.aFloat28 * local5 + local14 * local11;
		this.aFloat23 = local17 * local5 - local11 * this.aFloat29;
		this.aFloat29 = local11 * local17 + local5 * this.aFloat29;
		this.aFloat22 = local20 * local5 - this.aFloat31 * local11;
		this.aFloat31 = local20 * local11 + local5 * this.aFloat31;
		this.aFloat33 = local5 * local33 - local11 * this.aFloat32;
		this.aFloat32 = local33 * local11 + local5 * this.aFloat32;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method2663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class233.aFloatArray27[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class233.aFloatArray26[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class233.aFloatArray27[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class233.aFloatArray26[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class233.aFloatArray27[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class233.aFloatArray26[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local11 * local35;
		this.aFloat23 = local5 * local29;
		this.aFloat25 = local23 * local43 + local29 * local17;
		this.aFloat24 = local5 * local35;
		this.aFloat30 = local43 * local17 + local29 * -local23;
		this.aFloat28 = local23 * local5;
		this.aFloat29 = -local11;
		this.aFloat31 = local5 * local17;
		this.aFloat22 = local39 * local17 + local35 * local23;
		this.aFloat27 = -local17 * local35 + local23 * local39;
		this.aFloat32 = (float) -arg0 * this.aFloat28 - (float) arg1 * this.aFloat29 - this.aFloat31 * (float) arg2;
		this.aFloat33 = -((float) arg2 * this.aFloat22) + (float) -arg0 * this.aFloat27 - (float) arg1 * this.aFloat23;
		this.aFloat26 = -(this.aFloat24 * (float) arg1) + (float) -arg0 * this.aFloat25 - this.aFloat30 * (float) arg2;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!os;)V")
	public void method2485(@OriginalArg(1) Class118 arg0) {
		@Pc(2) Class118_Sub1 local2 = (Class118_Sub1) arg0;
		this.aFloat30 = local2.aFloat28;
		this.aFloat24 = local2.aFloat27;
		this.aFloat25 = local2.aFloat25;
		this.aFloat23 = local2.aFloat23;
		this.aFloat27 = local2.aFloat24;
		this.aFloat28 = local2.aFloat30;
		this.aFloat22 = local2.aFloat29;
		this.aFloat29 = local2.aFloat22;
		this.aFloat31 = local2.aFloat31;
		this.aFloat26 = -(local2.aFloat32 * this.aFloat30 + this.aFloat25 * local2.aFloat26 + this.aFloat24 * local2.aFloat33);
		this.aFloat33 = -(this.aFloat23 * local2.aFloat33 + local2.aFloat26 * this.aFloat27 + this.aFloat22 * local2.aFloat32);
		this.aFloat32 = -(this.aFloat28 * local2.aFloat26 + local2.aFloat33 * this.aFloat29 + this.aFloat31 * local2.aFloat32);
	}
}
