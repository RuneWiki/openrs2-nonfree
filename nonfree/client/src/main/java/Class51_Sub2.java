import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	public Class51_Sub2() {
		this.method3560();
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V")
	@Override
	public void method3557(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class214.aFloatArray29[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class214.aFloatArray30[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat76;
		@Pc(17) float local17 = this.aFloat69;
		@Pc(20) float local20 = this.aFloat78;
		this.aFloat76 = local14 * local5 - this.aFloat68 * local11;
		@Pc(34) float local34 = this.aFloat74;
		this.aFloat68 = local14 * local11 + local5 * this.aFloat68;
		this.aFloat69 = local17 * local5 - local11 * this.aFloat71;
		this.aFloat78 = local5 * local20 - local11 * this.aFloat77;
		this.aFloat71 = local5 * this.aFloat71 + local11 * local17;
		this.aFloat74 = local5 * local34 - this.aFloat70 * local11;
		this.aFloat77 = this.aFloat77 * local5 + local11 * local20;
		this.aFloat70 = local34 * local11 + local5 * this.aFloat70;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!pg;)V")
	@Override
	public void method3556(@OriginalArg(0) Class51 arg0) {
		@Pc(2) Class51_Sub2 local2 = (Class51_Sub2) arg0;
		this.aFloat71 = local2.aFloat71;
		this.aFloat74 = local2.aFloat74;
		this.aFloat75 = local2.aFloat75;
		this.aFloat67 = local2.aFloat67;
		this.aFloat72 = local2.aFloat72;
		this.aFloat78 = local2.aFloat78;
		this.aFloat77 = local2.aFloat77;
		this.aFloat68 = local2.aFloat68;
		this.aFloat73 = local2.aFloat73;
		this.aFloat69 = local2.aFloat69;
		this.aFloat70 = local2.aFloat70;
		this.aFloat76 = local2.aFloat76;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([I)V")
	@Override
	public void method3553(@OriginalArg(0) int[] arg0) {
		@Pc(8) float local8 = (float) arg0[0] - this.aFloat75;
		@Pc(17) float local17 = (float) arg0[1] - this.aFloat74;
		@Pc(25) float local25 = (float) arg0[2] - this.aFloat70;
		arg0[2] = (int) (local25 * this.aFloat77 + local8 * this.aFloat67 + local17 * this.aFloat78);
		arg0[0] = (int) (this.aFloat68 * local25 + local17 * this.aFloat76 + this.aFloat73 * local8);
		arg0[1] = (int) (this.aFloat69 * local17 + local8 * this.aFloat72 + local25 * this.aFloat71);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)V")
	@Override
	public void method3548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat75 = arg0;
		this.aFloat70 = arg2;
		this.aFloat74 = arg1;
		this.aFloat76 = this.aFloat68 = this.aFloat72 = this.aFloat71 = this.aFloat67 = this.aFloat78 = 0.0F;
		this.aFloat73 = this.aFloat69 = this.aFloat77 = 1.0F;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	@Override
	public void method3549(@OriginalArg(0) int arg0) {
		this.aFloat77 = 1.0F;
		this.aFloat73 = this.aFloat69 = Class214.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat76 = Class214.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat67 = this.aFloat75 = this.aFloat78 = this.aFloat74 = this.aFloat68 = this.aFloat71 = this.aFloat70 = 0.0F;
		this.aFloat72 = -this.aFloat76;
	}

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)[F")
	public float[] method3563() {
		Static186.aFloatArray10[1] = this.aFloat76;
		Static186.aFloatArray10[12] = 0.0F;
		Static186.aFloatArray10[5] = this.aFloat69;
		Static186.aFloatArray10[13] = 0.0F;
		Static186.aFloatArray10[0] = this.aFloat73;
		Static186.aFloatArray10[6] = this.aFloat71;
		Static186.aFloatArray10[10] = this.aFloat77;
		Static186.aFloatArray10[9] = this.aFloat78;
		Static186.aFloatArray10[8] = this.aFloat67;
		Static186.aFloatArray10[2] = this.aFloat68;
		Static186.aFloatArray10[4] = this.aFloat72;
		Static186.aFloatArray10[14] = 0;
		return Static186.aFloatArray10;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
	@Override
	public void method3554(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class214.aFloatArray29[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class214.aFloatArray30[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat73;
		@Pc(17) float local17 = this.aFloat72;
		@Pc(20) float local20 = this.aFloat67;
		@Pc(23) float local23 = this.aFloat75;
		this.aFloat73 = local11 * this.aFloat68 + local14 * local5;
		this.aFloat68 = local5 * this.aFloat68 - local14 * local11;
		this.aFloat72 = this.aFloat71 * local11 + local17 * local5;
		this.aFloat71 = local5 * this.aFloat71 - local17 * local11;
		this.aFloat67 = local5 * local20 + local11 * this.aFloat77;
		this.aFloat75 = local5 * local23 + this.aFloat70 * local11;
		this.aFloat77 = local5 * this.aFloat77 - local11 * local20;
		this.aFloat70 = local5 * this.aFloat70 - local23 * local11;
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)[F")
	public float[] method3564() {
		Static186.aFloatArray10[1] = this.aFloat76;
		Static186.aFloatArray10[8] = this.aFloat67;
		Static186.aFloatArray10[2] = this.aFloat68;
		Static186.aFloatArray10[6] = this.aFloat71;
		Static186.aFloatArray10[13] = this.aFloat74;
		Static186.aFloatArray10[10] = this.aFloat77;
		Static186.aFloatArray10[9] = this.aFloat78;
		Static186.aFloatArray10[12] = this.aFloat75;
		Static186.aFloatArray10[0] = this.aFloat73;
		Static186.aFloatArray10[4] = this.aFloat72;
		Static186.aFloatArray10[14] = this.aFloat70;
		Static186.aFloatArray10[5] = this.aFloat69;
		return Static186.aFloatArray10;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "()Lclient!lq;")
	public Class51_Sub2 method3565() {
		@Pc(3) Class51_Sub2 local3 = new Class51_Sub2();
		local3.aFloat68 = this.aFloat68;
		local3.aFloat74 = this.aFloat74;
		local3.aFloat67 = this.aFloat67;
		local3.aFloat69 = this.aFloat69;
		local3.aFloat77 = this.aFloat77;
		local3.aFloat75 = this.aFloat75;
		local3.aFloat76 = this.aFloat76;
		local3.aFloat70 = this.aFloat70;
		local3.aFloat72 = this.aFloat72;
		local3.aFloat78 = this.aFloat78;
		local3.aFloat73 = this.aFloat73;
		local3.aFloat71 = this.aFloat71;
		return local3;
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V")
	@Override
	public void method3558(@OriginalArg(0) int arg0) {
		this.aFloat73 = 1.0F;
		this.aFloat69 = this.aFloat77 = Class214.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat71 = Class214.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat72 = this.aFloat67 = this.aFloat75 = this.aFloat76 = this.aFloat74 = this.aFloat68 = this.aFloat70 = 0.0F;
		this.aFloat78 = -this.aFloat71;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class214.aFloatArray29[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class214.aFloatArray30[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class214.aFloatArray29[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class214.aFloatArray30[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class214.aFloatArray29[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class214.aFloatArray30[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local11 * local35;
		this.aFloat69 = local5 * local29;
		this.aFloat67 = local43 * local17 + local29 * -local23;
		this.aFloat78 = local35 * local23 + local17 * local39;
		this.aFloat72 = local35 * local5;
		this.aFloat71 = -local11;
		this.aFloat77 = local17 * local5;
		this.aFloat76 = -local17 * local35 + local39 * local23;
		this.aFloat73 = local17 * local29 + local43 * local23;
		this.aFloat68 = local5 * local23;
		this.aFloat75 = -((float) arg2 * this.aFloat67) + (float) -arg0 * this.aFloat73 - (float) arg1 * this.aFloat72;
		this.aFloat70 = -((float) arg2 * this.aFloat77) - this.aFloat71 * (float) arg1 + this.aFloat68 * (float) -arg0;
		this.aFloat74 = this.aFloat76 * (float) -arg0 - (float) arg1 * this.aFloat69 - (float) arg2 * this.aFloat78;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "()V")
	@Override
	public void method3560() {
		this.aFloat73 = this.aFloat69 = this.aFloat77 = 1.0F;
		this.aFloat76 = this.aFloat68 = this.aFloat72 = this.aFloat71 = this.aFloat67 = this.aFloat78 = this.aFloat75 = this.aFloat74 = this.aFloat70 = 0.0F;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat68 + (float) arg1 * this.aFloat71 + (float) arg2 * this.aFloat77 + this.aFloat70);
		arg3[1] = (int) (this.aFloat74 + (float) arg2 * this.aFloat78 + (float) arg1 * this.aFloat69 + this.aFloat76 * (float) arg0);
		arg3[0] = (int) (this.aFloat75 + (float) arg0 * this.aFloat73 + this.aFloat72 * (float) arg1 + this.aFloat67 * (float) arg2);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(III)V")
	@Override
	public void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat75 += arg0;
		this.aFloat74 += arg1;
		this.aFloat70 += arg2;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!pg;I)V")
	public void method3566(@OriginalArg(0) Class51 arg0) {
		@Pc(8) Class51_Sub2 local8 = (Class51_Sub2) arg0;
		this.aFloat73 = local8.aFloat73;
		this.aFloat72 = local8.aFloat76;
		this.aFloat67 = local8.aFloat68;
		this.aFloat78 = local8.aFloat71;
		this.aFloat76 = local8.aFloat72;
		this.aFloat69 = local8.aFloat69;
		this.aFloat68 = local8.aFloat67;
		this.aFloat75 = -(local8.aFloat70 * this.aFloat67 + local8.aFloat75 * this.aFloat73 + local8.aFloat74 * this.aFloat72);
		this.aFloat77 = local8.aFloat77;
		this.aFloat71 = local8.aFloat78;
		this.aFloat74 = -(this.aFloat76 * local8.aFloat75 + local8.aFloat74 * this.aFloat69 + this.aFloat78 * local8.aFloat70);
		this.aFloat70 = -(this.aFloat77 * local8.aFloat70 + this.aFloat71 * local8.aFloat74 + local8.aFloat75 * this.aFloat68);
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V")
	@Override
	public void method3559(@OriginalArg(0) int arg0) {
		this.aFloat69 = 1.0F;
		this.aFloat73 = this.aFloat77 = Class214.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat67 = Class214.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat68 = -this.aFloat67;
		this.aFloat72 = this.aFloat75 = this.aFloat76 = this.aFloat78 = this.aFloat74 = this.aFloat71 = this.aFloat70 = 0.0F;
	}
}
