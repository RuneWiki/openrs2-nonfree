import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class34_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat30 * (float) arg1 + (float) arg0 * this.aFloat38 + this.aFloat31 * (float) arg2);
		arg3[0] = (int) ((float) arg2 * this.aFloat29 + this.aFloat37 * (float) arg0 + (float) arg1 * this.aFloat35);
		arg3[2] = (int) (this.aFloat32 * (float) arg2 + this.aFloat27 * (float) arg1 + this.aFloat34 * (float) arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)[F")
	public float[] method2285() {
		Static95.aFloatArray7[13] = this.aFloat28;
		Static95.aFloatArray7[1] = this.aFloat38;
		Static95.aFloatArray7[9] = this.aFloat31;
		Static95.aFloatArray7[14] = this.aFloat36;
		Static95.aFloatArray7[12] = this.aFloat33;
		Static95.aFloatArray7[8] = this.aFloat29;
		Static95.aFloatArray7[10] = this.aFloat32;
		Static95.aFloatArray7[2] = this.aFloat34;
		Static95.aFloatArray7[5] = this.aFloat30;
		Static95.aFloatArray7[6] = this.aFloat27;
		Static95.aFloatArray7[0] = this.aFloat37;
		Static95.aFloatArray7[4] = this.aFloat35;
		return Static95.aFloatArray7;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIFFFII)V")
	public void method2286(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat30 = arg0;
			this.aFloat37 = arg4;
			this.aFloat32 = 1.0F;
			this.aFloat38 = this.aFloat34 = this.aFloat35 = this.aFloat27 = this.aFloat29 = this.aFloat31 = 0.0F;
		} else {
			@Pc(45) float local45 = Class184_Sub2.aFloatArray46[arg5 & 0x3FFF];
			@Pc(51) float local51 = Class184_Sub2.aFloatArray47[arg5 & 0x3FFF];
			this.aFloat32 = 1.0F;
			this.aFloat38 = (float) arg4 * local51;
			this.aFloat37 = (float) arg4 * local45;
			this.aFloat34 = this.aFloat27 = this.aFloat29 = this.aFloat31 = 0.0F;
			this.aFloat30 = (float) arg0 * local45;
			this.aFloat35 = -local51 * (float) arg0;
		}
		this.aFloat28 = arg2;
		this.aFloat36 = arg3;
		this.aFloat33 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLclient!q;)V")
	public void method2287(@OriginalArg(1) Class34 arg0) {
		@Pc(6) Class34_Sub2 local6 = (Class34_Sub2) arg0;
		this.aFloat35 = local6.aFloat38;
		this.aFloat37 = local6.aFloat37;
		this.aFloat29 = local6.aFloat34;
		this.aFloat34 = local6.aFloat29;
		this.aFloat38 = local6.aFloat35;
		this.aFloat30 = local6.aFloat30;
		this.aFloat31 = local6.aFloat27;
		this.aFloat32 = local6.aFloat32;
		this.aFloat33 = -(local6.aFloat36 * this.aFloat29 + local6.aFloat28 * this.aFloat35 + this.aFloat37 * local6.aFloat33);
		this.aFloat27 = local6.aFloat31;
		this.aFloat28 = -(local6.aFloat36 * this.aFloat31 + local6.aFloat33 * this.aFloat38 + this.aFloat30 * local6.aFloat28);
		this.aFloat36 = -(local6.aFloat36 * this.aFloat32 + local6.aFloat28 * this.aFloat27 + this.aFloat34 * local6.aFloat33);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)[F")
	public float[] method2288() {
		Static95.aFloatArray7[12] = 0.0F;
		Static95.aFloatArray7[0] = this.aFloat37;
		Static95.aFloatArray7[1] = this.aFloat38;
		Static95.aFloatArray7[13] = 0.0F;
		Static95.aFloatArray7[2] = this.aFloat34;
		Static95.aFloatArray7[6] = this.aFloat27;
		Static95.aFloatArray7[9] = this.aFloat31;
		Static95.aFloatArray7[4] = this.aFloat35;
		Static95.aFloatArray7[10] = this.aFloat32;
		Static95.aFloatArray7[14] = 0.0F;
		Static95.aFloatArray7[8] = this.aFloat29;
		Static95.aFloatArray7[5] = this.aFloat30;
		return Static95.aFloatArray7;
	}

	@OriginalMember(owner = "client!gb", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat37 = 1.0F;
		this.aFloat30 = this.aFloat32 = Class184_Sub2.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat27 = Class184_Sub2.aFloatArray47[arg0 & 0x3FFF];
		this.aFloat35 = this.aFloat29 = this.aFloat33 = this.aFloat38 = this.aFloat28 = this.aFloat34 = this.aFloat36 = 0.0F;
		this.aFloat31 = -this.aFloat27;
	}

	@OriginalMember(owner = "client!gb", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class34 arg0) {
		@Pc(6) Class34_Sub2 local6 = (Class34_Sub2) arg0;
		this.aFloat33 = local6.aFloat33;
		this.aFloat37 = local6.aFloat37;
		this.aFloat27 = local6.aFloat27;
		this.aFloat32 = local6.aFloat32;
		this.aFloat35 = local6.aFloat35;
		this.aFloat29 = local6.aFloat29;
		this.aFloat36 = local6.aFloat36;
		this.aFloat34 = local6.aFloat34;
		this.aFloat31 = local6.aFloat31;
		this.aFloat30 = local6.aFloat30;
		this.aFloat28 = local6.aFloat28;
		this.aFloat38 = local6.aFloat38;
	}

	@OriginalMember(owner = "client!gb", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat38 = this.aFloat34 = this.aFloat35 = this.aFloat27 = this.aFloat29 = this.aFloat31 = 0.0F;
		this.aFloat33 = arg0;
		this.aFloat28 = arg1;
		this.aFloat36 = arg2;
		this.aFloat37 = this.aFloat30 = this.aFloat32 = 1.0F;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class34 method7612() {
		@Pc(7) Class34_Sub2 local7 = new Class34_Sub2();
		local7.aFloat38 = this.aFloat38;
		local7.aFloat35 = this.aFloat35;
		local7.aFloat30 = this.aFloat30;
		local7.aFloat33 = this.aFloat33;
		local7.aFloat27 = this.aFloat27;
		local7.aFloat34 = this.aFloat34;
		local7.aFloat28 = this.aFloat28;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat29 = this.aFloat29;
		local7.aFloat31 = this.aFloat31;
		local7.aFloat36 = this.aFloat36;
		local7.aFloat32 = this.aFloat32;
		return local7;
	}

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat33;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat28;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat36;
		arg0[2] = (int) (this.aFloat29 * local12 + this.aFloat31 * local20 + local28 * this.aFloat32);
		arg0[0] = (int) (local28 * this.aFloat34 + local12 * this.aFloat37 + this.aFloat38 * local20);
		arg0[1] = (int) (local12 * this.aFloat35 + this.aFloat30 * local20 + local28 * this.aFloat27);
	}

	@OriginalMember(owner = "client!gb", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class184_Sub2.aFloatArray46[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class184_Sub2.aFloatArray47[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class184_Sub2.aFloatArray46[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class184_Sub2.aFloatArray47[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class184_Sub2.aFloatArray46[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class184_Sub2.aFloatArray47[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat34 = local27 * local9;
		this.aFloat38 = local43 * local27 + local39 * -local21;
		this.aFloat35 = local39 * local9;
		this.aFloat29 = -local27 * local33 + local47 * local21;
		this.aFloat32 = local21 * local9;
		this.aFloat30 = local33 * local9;
		this.aFloat27 = -local15;
		this.aFloat37 = local47 * local27 + local21 * local33;
		this.aFloat31 = local21 * local43 + local27 * local39;
		this.aFloat28 = -(this.aFloat30 * (float) arg1) + (float) -arg0 * this.aFloat38 - this.aFloat31 * (float) arg2;
		this.aFloat36 = (float) -arg0 * this.aFloat34 - (float) arg1 * this.aFloat27 - this.aFloat32 * (float) arg2;
		this.aFloat33 = -(this.aFloat29 * (float) arg2) + (float) -arg0 * this.aFloat37 - (float) arg1 * this.aFloat35;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat30 = 1.0F;
		this.aFloat37 = this.aFloat32 = Class184_Sub2.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat29 = Class184_Sub2.aFloatArray47[arg0 & 0x3FFF];
		this.aFloat34 = -this.aFloat29;
		this.aFloat35 = this.aFloat33 = this.aFloat38 = this.aFloat31 = this.aFloat28 = this.aFloat27 = this.aFloat36 = 0.0F;
	}

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat33 += arg0;
		this.aFloat28 += arg1;
		this.aFloat36 += arg2;
	}

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class184_Sub2.aFloatArray46[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class184_Sub2.aFloatArray47[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat37;
		@Pc(21) float local21 = this.aFloat35;
		@Pc(24) float local24 = this.aFloat29;
		@Pc(27) float local27 = this.aFloat33;
		this.aFloat37 = local9 * local18 + local15 * this.aFloat34;
		this.aFloat35 = local21 * local9 + local15 * this.aFloat27;
		this.aFloat34 = local9 * this.aFloat34 - local18 * local15;
		this.aFloat29 = local15 * this.aFloat32 + local24 * local9;
		this.aFloat27 = this.aFloat27 * local9 - local21 * local15;
		this.aFloat32 = local9 * this.aFloat32 - local24 * local15;
		this.aFloat33 = local15 * this.aFloat36 + local9 * local27;
		this.aFloat36 = this.aFloat36 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class184_Sub2.aFloatArray46[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class184_Sub2.aFloatArray47[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat38;
		@Pc(21) float local21 = this.aFloat30;
		@Pc(24) float local24 = this.aFloat31;
		@Pc(27) float local27 = this.aFloat28;
		this.aFloat38 = local9 * local18 - this.aFloat34 * local15;
		this.aFloat30 = local9 * local21 - this.aFloat27 * local15;
		this.aFloat34 = local18 * local15 + this.aFloat34 * local9;
		this.aFloat31 = local9 * local24 - local15 * this.aFloat32;
		this.aFloat27 = local9 * this.aFloat27 + local15 * local21;
		this.aFloat32 = local9 * this.aFloat32 + local15 * local24;
		this.aFloat28 = local27 * local9 - local15 * this.aFloat36;
		this.aFloat36 = local27 * local15 + local9 * this.aFloat36;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat36 + (float) arg2 * this.aFloat32 + this.aFloat34 * (float) arg0 + this.aFloat27 * (float) arg1);
		arg3[0] = (int) ((float) arg1 * this.aFloat35 + this.aFloat37 * (float) arg0 + this.aFloat29 * (float) arg2 + this.aFloat33);
		arg3[1] = (int) (this.aFloat28 + (float) arg0 * this.aFloat38 + (float) arg1 * this.aFloat30 + (float) arg2 * this.aFloat31);
	}

	@OriginalMember(owner = "client!gb", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat32 = 1.0F;
		this.aFloat37 = this.aFloat30 = Class184_Sub2.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat38 = Class184_Sub2.aFloatArray47[arg0 & 0x3FFF];
		this.aFloat35 = -this.aFloat38;
		this.aFloat29 = this.aFloat33 = this.aFloat31 = this.aFloat28 = this.aFloat34 = this.aFloat27 = this.aFloat36 = 0.0F;
	}

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat38 = this.aFloat34 = this.aFloat35 = this.aFloat27 = this.aFloat29 = this.aFloat31 = this.aFloat33 = this.aFloat28 = this.aFloat36 = 0.0F;
		this.aFloat37 = this.aFloat30 = this.aFloat32 = 1.0F;
	}
}
