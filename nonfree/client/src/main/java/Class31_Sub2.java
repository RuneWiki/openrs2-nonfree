import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class31_Sub2() {
		this.method3182();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	@Override
	public void method3172(@OriginalArg(0) int arg0) {
		this.aFloat29 = 1.0F;
		this.aFloat28 = this.aFloat26 = Class93.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat30 = Class93.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat22 = this.aFloat24 = this.aFloat32 = this.aFloat27 = this.aFloat23 = this.aFloat31 = this.aFloat33 = 0.0F;
		this.aFloat25 = -this.aFloat30;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!vj;)V")
	public void method3189(@OriginalArg(1) Class31 arg0) {
		@Pc(2) Class31_Sub2 local2 = (Class31_Sub2) arg0;
		this.aFloat22 = local2.aFloat27;
		this.aFloat29 = local2.aFloat29;
		this.aFloat24 = local2.aFloat31;
		this.aFloat28 = local2.aFloat28;
		this.aFloat31 = local2.aFloat24;
		this.aFloat27 = local2.aFloat22;
		this.aFloat25 = local2.aFloat30;
		this.aFloat30 = local2.aFloat25;
		this.aFloat32 = -(this.aFloat24 * local2.aFloat33 + local2.aFloat23 * this.aFloat22 + local2.aFloat32 * this.aFloat29);
		this.aFloat26 = local2.aFloat26;
		this.aFloat23 = -(local2.aFloat33 * this.aFloat25 + this.aFloat28 * local2.aFloat23 + local2.aFloat32 * this.aFloat27);
		this.aFloat33 = -(this.aFloat26 * local2.aFloat33 + local2.aFloat32 * this.aFloat31 + this.aFloat30 * local2.aFloat23);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	@Override
	public void method3179(@OriginalArg(0) int arg0) {
		this.aFloat28 = 1.0F;
		this.aFloat29 = this.aFloat26 = Class93.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat24 = Class93.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat22 = this.aFloat32 = this.aFloat27 = this.aFloat25 = this.aFloat23 = this.aFloat30 = this.aFloat33 = 0.0F;
		this.aFloat31 = -this.aFloat24;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([I)V")
	@Override
	public void method3177(@OriginalArg(0) int[] arg0) {
		@Pc(8) float local8 = (float) arg0[0] - this.aFloat32;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat23;
		@Pc(25) float local25 = (float) arg0[2] - this.aFloat33;
		arg0[1] = (int) (local16 * this.aFloat28 + this.aFloat22 * local8 + this.aFloat30 * local25);
		arg0[0] = (int) (local8 * this.aFloat29 + this.aFloat27 * local16 + local25 * this.aFloat31);
		arg0[2] = (int) (this.aFloat24 * local8 + local16 * this.aFloat25 + local25 * this.aFloat26);
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)V")
	@Override
	public void method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat23 = arg1;
		this.aFloat32 = arg0;
		this.aFloat29 = this.aFloat28 = this.aFloat26 = 1.0F;
		this.aFloat27 = this.aFloat31 = this.aFloat22 = this.aFloat30 = this.aFloat24 = this.aFloat25 = 0.0F;
		this.aFloat33 = arg2;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat32 + this.aFloat29 * (float) arg0 + this.aFloat22 * (float) arg1 + (float) arg2 * this.aFloat24);
		arg3[1] = (int) (this.aFloat23 + this.aFloat25 * (float) arg2 + this.aFloat27 * (float) arg0 + this.aFloat28 * (float) arg1);
		arg3[2] = (int) ((float) arg2 * this.aFloat26 + this.aFloat31 * (float) arg0 + this.aFloat30 * (float) arg1 + this.aFloat33);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)[F")
	public float[] method3190() {
		Static179.aFloatArray7[4] = this.aFloat22;
		Static179.aFloatArray7[2] = this.aFloat31;
		Static179.aFloatArray7[5] = this.aFloat28;
		Static179.aFloatArray7[0] = this.aFloat29;
		Static179.aFloatArray7[12] = 0.0F;
		Static179.aFloatArray7[9] = this.aFloat25;
		Static179.aFloatArray7[14] = 0.0F;
		Static179.aFloatArray7[8] = this.aFloat24;
		Static179.aFloatArray7[13] = 0.0F;
		Static179.aFloatArray7[1] = this.aFloat27;
		Static179.aFloatArray7[10] = this.aFloat26;
		Static179.aFloatArray7[6] = this.aFloat30;
		return Static179.aFloatArray7;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	@Override
	public void method3186(@OriginalArg(0) int arg0) {
		this.aFloat26 = 1.0F;
		this.aFloat29 = this.aFloat28 = Class93.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat27 = Class93.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat24 = this.aFloat32 = this.aFloat25 = this.aFloat23 = this.aFloat31 = this.aFloat30 = this.aFloat33 = 0.0F;
		this.aFloat22 = -this.aFloat27;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)[F")
	public float[] method3191() {
		Static179.aFloatArray7[1] = this.aFloat27;
		Static179.aFloatArray7[4] = this.aFloat22;
		Static179.aFloatArray7[12] = this.aFloat32;
		Static179.aFloatArray7[6] = this.aFloat30;
		Static179.aFloatArray7[10] = this.aFloat26;
		Static179.aFloatArray7[8] = this.aFloat24;
		Static179.aFloatArray7[5] = this.aFloat28;
		Static179.aFloatArray7[9] = this.aFloat25;
		Static179.aFloatArray7[2] = this.aFloat31;
		Static179.aFloatArray7[14] = this.aFloat33;
		Static179.aFloatArray7[0] = this.aFloat29;
		Static179.aFloatArray7[13] = this.aFloat23;
		return Static179.aFloatArray7;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	@Override
	public void method3173(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class93.aFloatArray2[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class93.aFloatArray3[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat29;
		@Pc(17) float local17 = this.aFloat22;
		@Pc(20) float local20 = this.aFloat24;
		this.aFloat29 = local11 * this.aFloat31 + local5 * local14;
		@Pc(33) float local33 = this.aFloat32;
		this.aFloat22 = local5 * local17 + local11 * this.aFloat30;
		this.aFloat31 = local5 * this.aFloat31 - local14 * local11;
		this.aFloat30 = this.aFloat30 * local5 - local17 * local11;
		this.aFloat24 = local5 * local20 + this.aFloat26 * local11;
		this.aFloat26 = this.aFloat26 * local5 - local11 * local20;
		this.aFloat32 = local11 * this.aFloat33 + local33 * local5;
		this.aFloat33 = local5 * this.aFloat33 - local33 * local11;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	@Override
	public void method3178(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class93.aFloatArray2[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class93.aFloatArray3[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat27;
		@Pc(17) float local17 = this.aFloat28;
		@Pc(20) float local20 = this.aFloat25;
		this.aFloat27 = local5 * local14 - local11 * this.aFloat31;
		@Pc(34) float local34 = this.aFloat23;
		this.aFloat28 = local17 * local5 - local11 * this.aFloat30;
		this.aFloat31 = local14 * local11 + this.aFloat31 * local5;
		this.aFloat30 = local11 * local17 + this.aFloat30 * local5;
		this.aFloat25 = local20 * local5 - local11 * this.aFloat26;
		this.aFloat26 = local5 * this.aFloat26 + local20 * local11;
		this.aFloat23 = local5 * local34 - this.aFloat33 * local11;
		this.aFloat33 = local11 * local34 + local5 * this.aFloat33;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V")
	@Override
	public void method3184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat33 += arg2;
		this.aFloat32 += arg0;
		this.aFloat23 += arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
	@Override
	public void method3182() {
		this.aFloat29 = this.aFloat28 = this.aFloat26 = 1.0F;
		this.aFloat27 = this.aFloat31 = this.aFloat22 = this.aFloat30 = this.aFloat24 = this.aFloat25 = this.aFloat32 = this.aFloat23 = this.aFloat33 = 0.0F;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!vj;)V")
	@Override
	public void method3181(@OriginalArg(0) Class31 arg0) {
		@Pc(2) Class31_Sub2 local2 = (Class31_Sub2) arg0;
		this.aFloat23 = local2.aFloat23;
		this.aFloat30 = local2.aFloat30;
		this.aFloat24 = local2.aFloat24;
		this.aFloat29 = local2.aFloat29;
		this.aFloat33 = local2.aFloat33;
		this.aFloat31 = local2.aFloat31;
		this.aFloat28 = local2.aFloat28;
		this.aFloat22 = local2.aFloat22;
		this.aFloat26 = local2.aFloat26;
		this.aFloat25 = local2.aFloat25;
		this.aFloat27 = local2.aFloat27;
		this.aFloat32 = local2.aFloat32;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class93.aFloatArray2[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class93.aFloatArray3[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class93.aFloatArray2[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class93.aFloatArray3[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class93.aFloatArray2[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class93.aFloatArray3[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local11 * local35;
		this.aFloat29 = local17 * local29 + local23 * local43;
		this.aFloat31 = local5 * local23;
		this.aFloat26 = local17 * local5;
		this.aFloat22 = local35 * local5;
		this.aFloat30 = -local11;
		this.aFloat25 = local39 * local17 + local35 * local23;
		this.aFloat27 = local39 * local23 + local35 * -local17;
		this.aFloat28 = local5 * local29;
		this.aFloat24 = local17 * local43 + -local23 * local29;
		this.aFloat32 = -((float) arg2 * this.aFloat24) - this.aFloat22 * (float) arg1 + this.aFloat29 * (float) -arg0;
		this.aFloat23 = (float) -arg0 * this.aFloat27 - (float) arg1 * this.aFloat28 - (float) arg2 * this.aFloat25;
		this.aFloat33 = -(this.aFloat26 * (float) arg2) - this.aFloat30 * (float) arg1 + (float) -arg0 * this.aFloat31;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "()Lclient!mb;")
	public Class31_Sub2 method3192() {
		@Pc(3) Class31_Sub2 local3 = new Class31_Sub2();
		local3.aFloat29 = this.aFloat29;
		local3.aFloat22 = this.aFloat22;
		local3.aFloat31 = this.aFloat31;
		local3.aFloat25 = this.aFloat25;
		local3.aFloat23 = this.aFloat23;
		local3.aFloat30 = this.aFloat30;
		local3.aFloat32 = this.aFloat32;
		local3.aFloat28 = this.aFloat28;
		local3.aFloat24 = this.aFloat24;
		local3.aFloat27 = this.aFloat27;
		local3.aFloat33 = this.aFloat33;
		local3.aFloat26 = this.aFloat26;
		return local3;
	}
}
