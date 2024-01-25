import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class117_Sub1 extends Class117 {

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!fu", name = "x", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!fu", name = "z", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!fu", name = "C", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!fu", name = "D", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!fu", name = "E", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!fu", name = "H", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class117_Sub1() {
		this.method7251();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat36 * (float) arg2 + (float) arg1 * this.aFloat32 + (float) arg0 * this.aFloat33 + this.aFloat26);
		arg3[1] = (int) (this.aFloat27 + this.aFloat34 * (float) arg2 + (float) arg0 * this.aFloat37 + (float) arg1 * this.aFloat35);
		arg3[0] = (int) (this.aFloat30 + (float) arg1 * this.aFloat28 + this.aFloat31 * (float) arg0 + (float) arg2 * this.aFloat29);
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(III)V")
	@Override
	public void method7247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat27 += (float) arg1;
		this.aFloat26 += (float) arg2;
		this.aFloat30 += (float) arg0;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class103_Sub1.aFloatArray50[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class103_Sub1.aFloatArray51[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class103_Sub1.aFloatArray50[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class103_Sub1.aFloatArray51[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class103_Sub1.aFloatArray50[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class103_Sub1.aFloatArray51[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat35 = local33 * local9;
		this.aFloat37 = -local21 * local39 + local43 * local27;
		this.aFloat29 = -local27 * local33 + local21 * local47;
		this.aFloat36 = local9 * local21;
		this.aFloat28 = local9 * local39;
		this.aFloat33 = local9 * local27;
		this.aFloat34 = local27 * local39 + local21 * local43;
		this.aFloat31 = local27 * local47 + local33 * local21;
		this.aFloat32 = -local15;
		this.aFloat27 = this.aFloat37 * (float) -arg0 - this.aFloat35 * (float) arg1 - this.aFloat34 * (float) arg2;
		this.aFloat26 = -((float) arg1 * this.aFloat32) + (float) -arg0 * this.aFloat33 - (float) arg2 * this.aFloat36;
		this.aFloat30 = -(this.aFloat29 * (float) arg2) + this.aFloat31 * (float) -arg0 - (float) arg1 * this.aFloat28;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "()Lclient!ofa;")
	@Override
	public Class117 method7248() {
		@Pc(7) Class117_Sub1 local7 = new Class117_Sub1();
		local7.aFloat36 = this.aFloat36;
		local7.aFloat32 = this.aFloat32;
		local7.aFloat29 = this.aFloat29;
		local7.aFloat27 = this.aFloat27;
		local7.aFloat26 = this.aFloat26;
		local7.aFloat31 = this.aFloat31;
		local7.aFloat33 = this.aFloat33;
		local7.aFloat28 = this.aFloat28;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat34 = this.aFloat34;
		local7.aFloat35 = this.aFloat35;
		local7.aFloat30 = this.aFloat30;
		return local7;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	@Override
	public void method7242(@OriginalArg(0) int arg0) {
		this.aFloat35 = 1.0F;
		this.aFloat31 = this.aFloat36 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat29 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat28 = this.aFloat30 = this.aFloat37 = this.aFloat34 = this.aFloat27 = this.aFloat32 = this.aFloat26 = 0.0F;
		this.aFloat33 = -this.aFloat29;
	}

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "(I)V")
	@Override
	public void method7258(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat37;
		@Pc(21) float local21 = this.aFloat35;
		@Pc(24) float local24 = this.aFloat34;
		@Pc(27) float local27 = this.aFloat27;
		this.aFloat37 = local18 * local9 - local15 * this.aFloat33;
		this.aFloat35 = local9 * local21 - this.aFloat32 * local15;
		this.aFloat33 = local15 * local18 + this.aFloat33 * local9;
		this.aFloat34 = local24 * local9 - this.aFloat36 * local15;
		this.aFloat32 = local15 * local21 + local9 * this.aFloat32;
		this.aFloat27 = local27 * local9 - local15 * this.aFloat26;
		this.aFloat36 = local9 * this.aFloat36 + local15 * local24;
		this.aFloat26 = local27 * local15 + local9 * this.aFloat26;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
	@Override
	public void method7243(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat31;
		@Pc(21) float local21 = this.aFloat28;
		@Pc(24) float local24 = this.aFloat29;
		@Pc(27) float local27 = this.aFloat30;
		this.aFloat31 = local15 * this.aFloat33 + local9 * local18;
		this.aFloat33 = this.aFloat33 * local9 - local15 * local18;
		this.aFloat28 = local21 * local9 + local15 * this.aFloat32;
		this.aFloat32 = this.aFloat32 * local9 - local15 * local21;
		this.aFloat29 = local15 * this.aFloat36 + local24 * local9;
		this.aFloat30 = local9 * local27 + this.aFloat26 * local15;
		this.aFloat36 = local9 * this.aFloat36 - local15 * local24;
		this.aFloat26 = this.aFloat26 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V")
	@Override
	public void method7244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat30 = (float) arg0;
		this.aFloat37 = this.aFloat33 = this.aFloat28 = this.aFloat32 = this.aFloat29 = this.aFloat34 = 0.0F;
		this.aFloat26 = (float) arg2;
		this.aFloat31 = this.aFloat35 = this.aFloat36 = 1.0F;
		this.aFloat27 = (float) arg1;
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V")
	@Override
	public void method7246(@OriginalArg(0) int arg0) {
		this.aFloat31 = 1.0F;
		this.aFloat35 = this.aFloat36 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat32 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat28 = this.aFloat29 = this.aFloat30 = this.aFloat37 = this.aFloat27 = this.aFloat33 = this.aFloat26 = 0.0F;
		this.aFloat34 = -this.aFloat32;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat34 + this.aFloat35 * (float) arg1 + this.aFloat37 * (float) arg0);
		arg3[0] = (int) (this.aFloat29 * (float) arg2 + this.aFloat31 * (float) arg0 + this.aFloat28 * (float) arg1);
		arg3[2] = (int) ((float) arg1 * this.aFloat32 + (float) arg0 * this.aFloat33 + (float) arg2 * this.aFloat36);
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
	@Override
	public void method7249(@OriginalArg(0) int arg0) {
		this.aFloat36 = 1.0F;
		this.aFloat31 = this.aFloat35 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat37 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat29 = this.aFloat30 = this.aFloat34 = this.aFloat27 = this.aFloat33 = this.aFloat32 = this.aFloat26 = 0.0F;
		this.aFloat28 = -this.aFloat37;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([I)V")
	@Override
	public void method7252(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat30;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat27;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat26;
		arg0[0] = (int) (this.aFloat31 * local11 + this.aFloat37 * local20 + local28 * this.aFloat33);
		arg0[1] = (int) (this.aFloat35 * local20 + local11 * this.aFloat28 + this.aFloat32 * local28);
		arg0[2] = (int) (this.aFloat36 * local28 + local20 * this.aFloat34 + this.aFloat29 * local11);
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat30);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat27);
		@Pc(20) int local20 = (int) ((float) arg2 - this.aFloat26);
		arg3[2] = (int) ((float) local13 * this.aFloat34 + (float) local6 * this.aFloat29 + (float) local20 * this.aFloat36);
		arg3[0] = (int) ((float) local13 * this.aFloat37 + (float) local6 * this.aFloat31 + (float) local20 * this.aFloat33);
		arg3[1] = (int) (this.aFloat28 * (float) local6 + this.aFloat35 * (float) local13 + (float) local20 * this.aFloat32);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!ofa;)V")
	@Override
	public void method7253(@OriginalArg(0) Class117 arg0) {
		@Pc(6) Class117_Sub1 local6 = (Class117_Sub1) arg0;
		this.aFloat27 = local6.aFloat27;
		this.aFloat28 = local6.aFloat28;
		this.aFloat37 = local6.aFloat37;
		this.aFloat36 = local6.aFloat36;
		this.aFloat31 = local6.aFloat31;
		this.aFloat35 = local6.aFloat35;
		this.aFloat34 = local6.aFloat34;
		this.aFloat32 = local6.aFloat32;
		this.aFloat30 = local6.aFloat30;
		this.aFloat26 = local6.aFloat26;
		this.aFloat29 = local6.aFloat29;
		this.aFloat33 = local6.aFloat33;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "()V")
	@Override
	public void method7251() {
		this.aFloat37 = this.aFloat33 = this.aFloat28 = this.aFloat32 = this.aFloat29 = this.aFloat34 = this.aFloat30 = this.aFloat27 = this.aFloat26 = 0.0F;
		this.aFloat31 = this.aFloat35 = this.aFloat36 = 1.0F;
	}

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class103_Sub1.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class103_Sub1.aFloatArray51[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat31;
		@Pc(21) float local21 = this.aFloat28;
		@Pc(24) float local24 = this.aFloat29;
		@Pc(27) float local27 = this.aFloat30;
		this.aFloat31 = local9 * local18 - this.aFloat37 * local15;
		this.aFloat28 = local9 * local21 - this.aFloat35 * local15;
		this.aFloat37 = local15 * local18 + this.aFloat37 * local9;
		this.aFloat35 = this.aFloat35 * local9 + local15 * local21;
		this.aFloat29 = local9 * local24 - local15 * this.aFloat34;
		this.aFloat34 = local9 * this.aFloat34 + local24 * local15;
		this.aFloat30 = local27 * local9 - this.aFloat27 * local15;
		this.aFloat27 = local27 * local15 + local9 * this.aFloat27;
	}
}
