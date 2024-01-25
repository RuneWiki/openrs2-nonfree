import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class129_Sub2 extends Class129 {

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!vr", name = "s", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!vr", name = "t", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!vr", name = "u", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!vr", name = "x", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class129_Sub2() {
		this.method5779();
	}

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)[F")
	public float[] method5789() {
		Static350.aFloatArray30[2] = this.aFloat73;
		Static350.aFloatArray30[14] = 0.0F;
		Static350.aFloatArray30[0] = this.aFloat65;
		Static350.aFloatArray30[9] = this.aFloat69;
		Static350.aFloatArray30[5] = this.aFloat67;
		Static350.aFloatArray30[8] = this.aFloat70;
		Static350.aFloatArray30[4] = this.aFloat68;
		Static350.aFloatArray30[10] = this.aFloat74;
		Static350.aFloatArray30[1] = this.aFloat72;
		Static350.aFloatArray30[6] = this.aFloat75;
		Static350.aFloatArray30[13] = 0.0F;
		Static350.aFloatArray30[12] = 0.0F;
		return Static350.aFloatArray30;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "()V")
	@Override
	public void method5779() {
		this.aFloat65 = this.aFloat67 = this.aFloat74 = 1.0F;
		this.aFloat72 = this.aFloat73 = this.aFloat68 = this.aFloat75 = this.aFloat70 = this.aFloat69 = this.aFloat71 = this.aFloat64 = this.aFloat66 = 0.0F;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLclient!m;)V")
	public void method5790(@OriginalArg(1) Class129 arg0) {
		@Pc(2) Class129_Sub2 local2 = (Class129_Sub2) arg0;
		this.aFloat68 = local2.aFloat72;
		this.aFloat65 = local2.aFloat65;
		this.aFloat70 = local2.aFloat73;
		this.aFloat67 = local2.aFloat67;
		this.aFloat72 = local2.aFloat68;
		this.aFloat73 = local2.aFloat70;
		this.aFloat69 = local2.aFloat75;
		this.aFloat71 = -(local2.aFloat66 * this.aFloat70 + this.aFloat65 * local2.aFloat71 + local2.aFloat64 * this.aFloat68);
		this.aFloat74 = local2.aFloat74;
		this.aFloat75 = local2.aFloat69;
		this.aFloat64 = -(local2.aFloat66 * this.aFloat69 + local2.aFloat71 * this.aFloat72 + this.aFloat67 * local2.aFloat64);
		this.aFloat66 = -(this.aFloat75 * local2.aFloat64 + local2.aFloat71 * this.aFloat73 + this.aFloat74 * local2.aFloat66);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class113.aFloatArray14[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class113.aFloatArray15[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class113.aFloatArray14[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class113.aFloatArray15[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class113.aFloatArray14[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class113.aFloatArray15[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local11 * local35;
		this.aFloat72 = local39 * local23 + local35 * -local17;
		this.aFloat69 = local23 * local35 + local39 * local17;
		this.aFloat65 = local43 * local23 + local29 * local17;
		this.aFloat73 = local23 * local5;
		this.aFloat74 = local17 * local5;
		this.aFloat75 = -local11;
		this.aFloat68 = local5 * local35;
		this.aFloat70 = local29 * -local23 + local43 * local17;
		this.aFloat67 = local5 * local29;
		this.aFloat71 = -(this.aFloat70 * (float) arg2) + (float) -arg0 * this.aFloat65 - this.aFloat68 * (float) arg1;
		this.aFloat66 = (float) -arg0 * this.aFloat73 - this.aFloat75 * (float) arg1 - (float) arg2 * this.aFloat74;
		this.aFloat64 = this.aFloat72 * (float) -arg0 - (float) arg1 * this.aFloat67 - (float) arg2 * this.aFloat69;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "()Lclient!vr;")
	public Class129_Sub2 method5791() {
		@Pc(3) Class129_Sub2 local3 = new Class129_Sub2();
		local3.aFloat67 = this.aFloat67;
		local3.aFloat66 = this.aFloat66;
		local3.aFloat74 = this.aFloat74;
		local3.aFloat70 = this.aFloat70;
		local3.aFloat64 = this.aFloat64;
		local3.aFloat75 = this.aFloat75;
		local3.aFloat68 = this.aFloat68;
		local3.aFloat72 = this.aFloat72;
		local3.aFloat71 = this.aFloat71;
		local3.aFloat65 = this.aFloat65;
		local3.aFloat69 = this.aFloat69;
		local3.aFloat73 = this.aFloat73;
		return local3;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(III)V")
	@Override
	public void method5776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat64 += arg1;
		this.aFloat71 += arg0;
		this.aFloat66 += arg2;
	}

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V")
	@Override
	public void method5787(@OriginalArg(0) int arg0) {
		this.aFloat67 = 1.0F;
		this.aFloat65 = this.aFloat74 = Class113.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat70 = Class113.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat73 = -this.aFloat70;
		this.aFloat68 = this.aFloat71 = this.aFloat72 = this.aFloat69 = this.aFloat64 = this.aFloat75 = this.aFloat66 = 0.0F;
	}

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "(I)V")
	@Override
	public void method5788(@OriginalArg(0) int arg0) {
		this.aFloat65 = 1.0F;
		this.aFloat67 = this.aFloat74 = Class113.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat75 = Class113.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat69 = -this.aFloat75;
		this.aFloat68 = this.aFloat70 = this.aFloat71 = this.aFloat72 = this.aFloat64 = this.aFloat73 = this.aFloat66 = 0.0F;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method5784(@OriginalArg(0) Class129 arg0) {
		@Pc(2) Class129_Sub2 local2 = (Class129_Sub2) arg0;
		this.aFloat64 = local2.aFloat64;
		this.aFloat67 = local2.aFloat67;
		this.aFloat73 = local2.aFloat73;
		this.aFloat71 = local2.aFloat71;
		this.aFloat66 = local2.aFloat66;
		this.aFloat74 = local2.aFloat74;
		this.aFloat68 = local2.aFloat68;
		this.aFloat65 = local2.aFloat65;
		this.aFloat70 = local2.aFloat70;
		this.aFloat72 = local2.aFloat72;
		this.aFloat69 = local2.aFloat69;
		this.aFloat75 = local2.aFloat75;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	@Override
	public void method5778(@OriginalArg(0) int arg0) {
		this.aFloat74 = 1.0F;
		this.aFloat65 = this.aFloat67 = Class113.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat72 = Class113.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat70 = this.aFloat71 = this.aFloat69 = this.aFloat64 = this.aFloat73 = this.aFloat75 = this.aFloat66 = 0.0F;
		this.aFloat68 = -this.aFloat72;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "([I)V")
	@Override
	public void method5785(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat71;
		@Pc(15) float local15 = (float) arg0[1] - this.aFloat64;
		@Pc(23) float local23 = (float) arg0[2] - this.aFloat66;
		arg0[1] = (int) (this.aFloat67 * local15 + this.aFloat68 * local7 + this.aFloat75 * local23);
		arg0[0] = (int) (this.aFloat73 * local23 + local7 * this.aFloat65 + this.aFloat72 * local15);
		arg0[2] = (int) (local23 * this.aFloat74 + local15 * this.aFloat69 + local7 * this.aFloat70);
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
	@Override
	public void method5781(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class113.aFloatArray14[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class113.aFloatArray15[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat72;
		@Pc(17) float local17 = this.aFloat67;
		@Pc(20) float local20 = this.aFloat69;
		@Pc(23) float local23 = this.aFloat64;
		this.aFloat72 = local14 * local5 - local11 * this.aFloat73;
		this.aFloat73 = local5 * this.aFloat73 + local14 * local11;
		this.aFloat67 = local5 * local17 - local11 * this.aFloat75;
		this.aFloat69 = local20 * local5 - local11 * this.aFloat74;
		this.aFloat75 = local5 * this.aFloat75 + local11 * local17;
		this.aFloat64 = local23 * local5 - this.aFloat66 * local11;
		this.aFloat74 = local5 * this.aFloat74 + local20 * local11;
		this.aFloat66 = local23 * local11 + local5 * this.aFloat66;
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
	@Override
	public void method5783(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class113.aFloatArray14[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class113.aFloatArray15[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat65;
		@Pc(17) float local17 = this.aFloat68;
		@Pc(20) float local20 = this.aFloat70;
		this.aFloat65 = local11 * this.aFloat73 + local5 * local14;
		@Pc(33) float local33 = this.aFloat71;
		this.aFloat68 = local5 * local17 + local11 * this.aFloat75;
		this.aFloat73 = local5 * this.aFloat73 - local11 * local14;
		this.aFloat75 = local5 * this.aFloat75 - local11 * local17;
		this.aFloat70 = local20 * local5 + local11 * this.aFloat74;
		this.aFloat74 = local5 * this.aFloat74 - local20 * local11;
		this.aFloat71 = local11 * this.aFloat66 + local5 * local33;
		this.aFloat66 = this.aFloat66 * local5 - local11 * local33;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)[F")
	public float[] method5792() {
		Static350.aFloatArray30[10] = this.aFloat74;
		Static350.aFloatArray30[6] = this.aFloat75;
		Static350.aFloatArray30[5] = this.aFloat67;
		Static350.aFloatArray30[13] = this.aFloat64;
		Static350.aFloatArray30[9] = this.aFloat69;
		Static350.aFloatArray30[2] = this.aFloat73;
		Static350.aFloatArray30[14] = this.aFloat66;
		Static350.aFloatArray30[0] = this.aFloat65;
		Static350.aFloatArray30[4] = this.aFloat68;
		Static350.aFloatArray30[12] = this.aFloat71;
		Static350.aFloatArray30[1] = this.aFloat72;
		Static350.aFloatArray30[8] = this.aFloat70;
		return Static350.aFloatArray30;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat66 + this.aFloat73 * (float) arg0 + (float) arg1 * this.aFloat75 + (float) arg2 * this.aFloat74);
		arg3[1] = (int) ((float) arg0 * this.aFloat72 + (float) arg1 * this.aFloat67 + this.aFloat69 * (float) arg2 + this.aFloat64);
		arg3[0] = (int) ((float) arg2 * this.aFloat70 + this.aFloat68 * (float) arg1 + this.aFloat65 * (float) arg0 + this.aFloat71);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
	@Override
	public void method5774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat71 = arg0;
		this.aFloat72 = this.aFloat73 = this.aFloat68 = this.aFloat75 = this.aFloat70 = this.aFloat69 = 0.0F;
		this.aFloat65 = this.aFloat67 = this.aFloat74 = 1.0F;
		this.aFloat64 = arg1;
		this.aFloat66 = arg2;
	}
}
