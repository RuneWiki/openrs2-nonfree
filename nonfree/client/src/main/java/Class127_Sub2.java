import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class127_Sub2 extends Class127 {

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!vp", name = "u", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!vp", name = "w", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!vp", name = "x", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!vp", name = "z", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class127_Sub2() {
		this.method5268();
	}

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "(I)[F")
	public float[] method5277() {
		Static375.aFloatArray30[14] = 0.0F;
		Static375.aFloatArray30[2] = this.aFloat68;
		Static375.aFloatArray30[1] = this.aFloat74;
		Static375.aFloatArray30[9] = this.aFloat73;
		Static375.aFloatArray30[8] = this.aFloat72;
		Static375.aFloatArray30[12] = 0.0F;
		Static375.aFloatArray30[5] = this.aFloat75;
		Static375.aFloatArray30[0] = this.aFloat71;
		Static375.aFloatArray30[10] = this.aFloat77;
		Static375.aFloatArray30[13] = 0.0F;
		Static375.aFloatArray30[6] = this.aFloat69;
		Static375.aFloatArray30[4] = this.aFloat67;
		return Static375.aFloatArray30;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V")
	@Override
	public void method5262(@OriginalArg(0) int arg0) {
		this.aFloat77 = 1.0F;
		this.aFloat71 = this.aFloat75 = Class9.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat74 = Class9.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat67 = -this.aFloat74;
		this.aFloat72 = this.aFloat76 = this.aFloat73 = this.aFloat78 = this.aFloat68 = this.aFloat69 = this.aFloat70 = 0.0F;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "()Lclient!vp;")
	public Class127_Sub2 method5278() {
		@Pc(3) Class127_Sub2 local3 = new Class127_Sub2();
		local3.aFloat69 = this.aFloat69;
		local3.aFloat72 = this.aFloat72;
		local3.aFloat73 = this.aFloat73;
		local3.aFloat70 = this.aFloat70;
		local3.aFloat71 = this.aFloat71;
		local3.aFloat76 = this.aFloat76;
		local3.aFloat74 = this.aFloat74;
		local3.aFloat75 = this.aFloat75;
		local3.aFloat78 = this.aFloat78;
		local3.aFloat77 = this.aFloat77;
		local3.aFloat67 = this.aFloat67;
		local3.aFloat68 = this.aFloat68;
		return local3;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat78 + (float) arg0 * this.aFloat74 + this.aFloat75 * (float) arg1 + this.aFloat73 * (float) arg2);
		arg3[0] = (int) (this.aFloat71 * (float) arg0 + (float) arg1 * this.aFloat67 + (float) arg2 * this.aFloat72 + this.aFloat76);
		arg3[2] = (int) (this.aFloat77 * (float) arg2 + (float) arg0 * this.aFloat68 + this.aFloat69 * (float) arg1 + this.aFloat70);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!mu;)V")
	public void method5279(@OriginalArg(1) Class127 arg0) {
		@Pc(10) Class127_Sub2 local10 = (Class127_Sub2) arg0;
		this.aFloat67 = local10.aFloat74;
		this.aFloat71 = local10.aFloat71;
		this.aFloat72 = local10.aFloat68;
		this.aFloat74 = local10.aFloat67;
		this.aFloat75 = local10.aFloat75;
		this.aFloat68 = local10.aFloat72;
		this.aFloat73 = local10.aFloat69;
		this.aFloat69 = local10.aFloat73;
		this.aFloat76 = -(local10.aFloat70 * this.aFloat72 + local10.aFloat76 * this.aFloat71 + this.aFloat67 * local10.aFloat78);
		this.aFloat77 = local10.aFloat77;
		this.aFloat78 = -(local10.aFloat70 * this.aFloat73 + this.aFloat75 * local10.aFloat78 + local10.aFloat76 * this.aFloat74);
		this.aFloat70 = -(this.aFloat68 * local10.aFloat76 + local10.aFloat78 * this.aFloat69 + local10.aFloat70 * this.aFloat77);
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(III)V")
	@Override
	public void method5265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat76 = arg0;
		this.aFloat78 = arg1;
		this.aFloat74 = this.aFloat68 = this.aFloat67 = this.aFloat69 = this.aFloat72 = this.aFloat73 = 0.0F;
		this.aFloat71 = this.aFloat75 = this.aFloat77 = 1.0F;
		this.aFloat70 = arg2;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "([I)V")
	@Override
	public void method5263(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat76;
		@Pc(15) float local15 = (float) arg0[1] - this.aFloat78;
		@Pc(23) float local23 = (float) arg0[2] - this.aFloat70;
		arg0[0] = (int) (this.aFloat74 * local15 + this.aFloat71 * local7 + local23 * this.aFloat68);
		arg0[2] = (int) (local23 * this.aFloat77 + this.aFloat72 * local7 + local15 * this.aFloat73);
		arg0[1] = (int) (local15 * this.aFloat75 + this.aFloat67 * local7 + local23 * this.aFloat69);
	}

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "(I)V")
	@Override
	public void method5274(@OriginalArg(0) int arg0) {
		this.aFloat75 = 1.0F;
		this.aFloat71 = this.aFloat77 = Class9.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat72 = Class9.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat68 = -this.aFloat72;
		this.aFloat67 = this.aFloat76 = this.aFloat74 = this.aFloat73 = this.aFloat78 = this.aFloat69 = this.aFloat70 = 0.0F;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "()V")
	@Override
	public void method5268() {
		this.aFloat74 = this.aFloat68 = this.aFloat67 = this.aFloat69 = this.aFloat72 = this.aFloat73 = this.aFloat76 = this.aFloat78 = this.aFloat70 = 0.0F;
		this.aFloat71 = this.aFloat75 = this.aFloat77 = 1.0F;
	}

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V")
	@Override
	public void method5271(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class9.aFloatArray1[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class9.aFloatArray2[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat74;
		@Pc(17) float local17 = this.aFloat75;
		@Pc(20) float local20 = this.aFloat73;
		this.aFloat74 = local14 * local5 - local11 * this.aFloat68;
		@Pc(33) float local33 = this.aFloat78;
		this.aFloat68 = local5 * this.aFloat68 + local14 * local11;
		this.aFloat75 = local17 * local5 - local11 * this.aFloat69;
		this.aFloat69 = this.aFloat69 * local5 + local17 * local11;
		this.aFloat73 = local20 * local5 - local11 * this.aFloat77;
		this.aFloat77 = local11 * local20 + local5 * this.aFloat77;
		this.aFloat78 = local33 * local5 - local11 * this.aFloat70;
		this.aFloat70 = local11 * local33 + this.aFloat70 * local5;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class9.aFloatArray1[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class9.aFloatArray2[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class9.aFloatArray1[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class9.aFloatArray2[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class9.aFloatArray1[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class9.aFloatArray2[arg5 & 0x3FFF];
		@Pc(39) float local39 = local11 * local29;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat77 = local5 * local17;
		this.aFloat71 = local23 * local43 + local17 * local29;
		this.aFloat67 = local35 * local5;
		this.aFloat69 = -local11;
		this.aFloat74 = local39 * local23 + -local17 * local35;
		this.aFloat68 = local23 * local5;
		this.aFloat75 = local29 * local5;
		this.aFloat72 = -local23 * local29 + local17 * local43;
		this.aFloat73 = local23 * local35 + local17 * local39;
		this.aFloat78 = this.aFloat74 * (float) -arg0 - (float) arg1 * this.aFloat75 - (float) arg2 * this.aFloat73;
		this.aFloat70 = -(this.aFloat77 * (float) arg2) - (float) arg1 * this.aFloat69 + (float) -arg0 * this.aFloat68;
		this.aFloat76 = -((float) arg1 * this.aFloat67) + this.aFloat71 * (float) -arg0 - this.aFloat72 * (float) arg2;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!mu;)V")
	@Override
	public void method5267(@OriginalArg(0) Class127 arg0) {
		@Pc(2) Class127_Sub2 local2 = (Class127_Sub2) arg0;
		this.aFloat78 = local2.aFloat78;
		this.aFloat74 = local2.aFloat74;
		this.aFloat72 = local2.aFloat72;
		this.aFloat67 = local2.aFloat67;
		this.aFloat70 = local2.aFloat70;
		this.aFloat68 = local2.aFloat68;
		this.aFloat75 = local2.aFloat75;
		this.aFloat76 = local2.aFloat76;
		this.aFloat73 = local2.aFloat73;
		this.aFloat69 = local2.aFloat69;
		this.aFloat71 = local2.aFloat71;
		this.aFloat77 = local2.aFloat77;
	}

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "(I)[F")
	public float[] method5280() {
		Static375.aFloatArray30[13] = this.aFloat78;
		Static375.aFloatArray30[10] = this.aFloat77;
		Static375.aFloatArray30[9] = this.aFloat73;
		Static375.aFloatArray30[0] = this.aFloat71;
		Static375.aFloatArray30[6] = this.aFloat69;
		Static375.aFloatArray30[5] = this.aFloat75;
		Static375.aFloatArray30[12] = this.aFloat76;
		Static375.aFloatArray30[1] = this.aFloat74;
		Static375.aFloatArray30[8] = this.aFloat72;
		Static375.aFloatArray30[14] = this.aFloat70;
		Static375.aFloatArray30[4] = this.aFloat67;
		Static375.aFloatArray30[2] = this.aFloat68;
		return Static375.aFloatArray30;
	}

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "(I)V")
	@Override
	public void method5276(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class9.aFloatArray1[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class9.aFloatArray2[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat71;
		@Pc(17) float local17 = this.aFloat67;
		@Pc(20) float local20 = this.aFloat72;
		this.aFloat71 = local5 * local14 + local11 * this.aFloat68;
		@Pc(33) float local33 = this.aFloat76;
		this.aFloat67 = local11 * this.aFloat69 + local5 * local17;
		this.aFloat68 = this.aFloat68 * local5 - local11 * local14;
		this.aFloat69 = local5 * this.aFloat69 - local17 * local11;
		this.aFloat72 = this.aFloat77 * local11 + local20 * local5;
		this.aFloat76 = this.aFloat70 * local11 + local33 * local5;
		this.aFloat77 = this.aFloat77 * local5 - local11 * local20;
		this.aFloat70 = this.aFloat70 * local5 - local11 * local33;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)V")
	@Override
	public void method5260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat76 += arg0;
		this.aFloat70 += arg2;
		this.aFloat78 += arg1;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)V")
	@Override
	public void method5269(@OriginalArg(0) int arg0) {
		this.aFloat71 = 1.0F;
		this.aFloat75 = this.aFloat77 = Class9.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat69 = Class9.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat67 = this.aFloat72 = this.aFloat76 = this.aFloat74 = this.aFloat78 = this.aFloat68 = this.aFloat70 = 0.0F;
		this.aFloat73 = -this.aFloat69;
	}
}
