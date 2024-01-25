import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!bg", name = "C", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!bg", name = "E", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!bg", name = "G", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!bg", name = "J", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class31_Sub1() {
		this.method7926();
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method7931() {
		@Pc(7) Class31_Sub1 local7 = new Class31_Sub1();
		local7.aFloat15 = this.aFloat15;
		local7.aFloat11 = this.aFloat11;
		local7.aFloat8 = this.aFloat8;
		local7.aFloat17 = this.aFloat17;
		local7.aFloat12 = this.aFloat12;
		local7.aFloat14 = this.aFloat14;
		local7.aFloat9 = this.aFloat9;
		local7.aFloat13 = this.aFloat13;
		local7.aFloat10 = this.aFloat10;
		local7.aFloat16 = this.aFloat16;
		local7.aFloat18 = this.aFloat18;
		local7.aFloat19 = this.aFloat19;
		return local7;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public void method7934(@OriginalArg(0) Class31 arg0) {
		@Pc(6) Class31_Sub1 local6 = (Class31_Sub1) arg0;
		this.aFloat13 = local6.aFloat13;
		this.aFloat15 = local6.aFloat15;
		this.aFloat8 = local6.aFloat8;
		this.aFloat16 = local6.aFloat16;
		this.aFloat11 = local6.aFloat11;
		this.aFloat14 = local6.aFloat14;
		this.aFloat19 = local6.aFloat19;
		this.aFloat18 = local6.aFloat18;
		this.aFloat17 = local6.aFloat17;
		this.aFloat9 = local6.aFloat9;
		this.aFloat10 = local6.aFloat10;
		this.aFloat12 = local6.aFloat12;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	@Override
	public void method7924(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class77.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class77.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat15;
		@Pc(21) float local21 = this.aFloat18;
		@Pc(24) float local24 = this.aFloat17;
		this.aFloat15 = local9 * local18 + local15 * this.aFloat13;
		@Pc(37) float local37 = this.aFloat10;
		this.aFloat13 = this.aFloat13 * local9 - local15 * local18;
		this.aFloat18 = local9 * local21 + this.aFloat12 * local15;
		this.aFloat12 = local9 * this.aFloat12 - local21 * local15;
		this.aFloat17 = local9 * local24 + this.aFloat16 * local15;
		this.aFloat16 = local9 * this.aFloat16 - local15 * local24;
		this.aFloat10 = local37 * local9 + this.aFloat14 * local15;
		this.aFloat14 = local9 * this.aFloat14 - local37 * local15;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "()V")
	@Override
	public void method7926() {
		this.aFloat9 = this.aFloat13 = this.aFloat18 = this.aFloat12 = this.aFloat17 = this.aFloat8 = this.aFloat10 = this.aFloat11 = this.aFloat14 = 0.0F;
		this.aFloat15 = this.aFloat19 = this.aFloat16 = 1.0F;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat8 + (float) arg1 * this.aFloat19 + (float) arg0 * this.aFloat9 + this.aFloat11);
		arg3[2] = (int) (this.aFloat14 + this.aFloat16 * (float) arg2 + this.aFloat13 * (float) arg0 + (float) arg1 * this.aFloat12);
		arg3[0] = (int) (this.aFloat10 + this.aFloat17 * (float) arg2 + (float) arg1 * this.aFloat18 + (float) arg0 * this.aFloat15);
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)V")
	@Override
	public void method7927(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class77.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class77.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat15;
		@Pc(21) float local21 = this.aFloat18;
		@Pc(24) float local24 = this.aFloat17;
		this.aFloat15 = local18 * local9 - this.aFloat9 * local15;
		@Pc(37) float local37 = this.aFloat10;
		this.aFloat18 = local9 * local21 - local15 * this.aFloat19;
		this.aFloat9 = local9 * this.aFloat9 + local15 * local18;
		this.aFloat19 = local15 * local21 + local9 * this.aFloat19;
		this.aFloat17 = local9 * local24 - local15 * this.aFloat8;
		this.aFloat8 = this.aFloat8 * local9 + local24 * local15;
		this.aFloat10 = local9 * local37 - this.aFloat11 * local15;
		this.aFloat11 = local37 * local15 + local9 * this.aFloat11;
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
	@Override
	public void method7933(@OriginalArg(0) int arg0) {
		this.aFloat19 = 1.0F;
		this.aFloat15 = this.aFloat16 = Class77.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat17 = Class77.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat13 = -this.aFloat17;
		this.aFloat18 = this.aFloat10 = this.aFloat9 = this.aFloat8 = this.aFloat11 = this.aFloat12 = this.aFloat14 = 0.0F;
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V")
	@Override
	public void method7936(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class77.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class77.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat9;
		@Pc(21) float local21 = this.aFloat19;
		@Pc(24) float local24 = this.aFloat8;
		this.aFloat9 = local18 * local9 - local15 * this.aFloat13;
		@Pc(37) float local37 = this.aFloat11;
		this.aFloat13 = local15 * local18 + local9 * this.aFloat13;
		this.aFloat19 = local21 * local9 - local15 * this.aFloat12;
		this.aFloat12 = this.aFloat12 * local9 + local15 * local21;
		this.aFloat8 = local9 * local24 - local15 * this.aFloat16;
		this.aFloat11 = local9 * local37 - this.aFloat14 * local15;
		this.aFloat16 = local9 * this.aFloat16 + local15 * local24;
		this.aFloat14 = local9 * this.aFloat14 + local15 * local37;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)V")
	@Override
	public void method7930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat10 += (float) arg0;
		this.aFloat11 += (float) arg1;
		this.aFloat14 += (float) arg2;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat12 + (float) arg0 * this.aFloat13 + (float) arg2 * this.aFloat16);
		arg3[1] = (int) ((float) arg0 * this.aFloat9 + (float) arg1 * this.aFloat19 + (float) arg2 * this.aFloat8);
		arg3[0] = (int) (this.aFloat17 * (float) arg2 + (float) arg1 * this.aFloat18 + (float) arg0 * this.aFloat15);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0) {
		this.aFloat16 = 1.0F;
		this.aFloat15 = this.aFloat19 = Class77.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat9 = Class77.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat18 = -this.aFloat9;
		this.aFloat17 = this.aFloat10 = this.aFloat8 = this.aFloat11 = this.aFloat13 = this.aFloat12 = this.aFloat14 = 0.0F;
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0) {
		this.aFloat15 = 1.0F;
		this.aFloat19 = this.aFloat16 = Class77.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat12 = Class77.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat8 = -this.aFloat12;
		this.aFloat18 = this.aFloat17 = this.aFloat10 = this.aFloat9 = this.aFloat11 = this.aFloat13 = this.aFloat14 = 0.0F;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class77.aFloatArray7[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class77.aFloatArray8[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class77.aFloatArray7[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class77.aFloatArray8[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class77.aFloatArray7[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class77.aFloatArray8[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat17 = local47 * local21 + local33 * -local27;
		this.aFloat9 = local39 * -local21 + local43 * local27;
		this.aFloat18 = local39 * local9;
		this.aFloat19 = local9 * local33;
		this.aFloat8 = local27 * local39 + local21 * local43;
		this.aFloat15 = local27 * local47 + local33 * local21;
		this.aFloat12 = -local15;
		this.aFloat16 = local21 * local9;
		this.aFloat13 = local9 * local27;
		this.aFloat11 = -(this.aFloat19 * (float) arg1) + this.aFloat9 * (float) -arg0 - (float) arg2 * this.aFloat8;
		this.aFloat10 = -((float) arg2 * this.aFloat17) + this.aFloat15 * (float) -arg0 - this.aFloat18 * (float) arg1;
		this.aFloat14 = -(this.aFloat16 * (float) arg2) + (float) -arg0 * this.aFloat13 - this.aFloat12 * (float) arg1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
	@Override
	public void method7921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat10 = (float) arg0;
		this.aFloat15 = this.aFloat19 = this.aFloat16 = 1.0F;
		this.aFloat11 = (float) arg1;
		this.aFloat14 = (float) arg2;
		this.aFloat9 = this.aFloat13 = this.aFloat18 = this.aFloat12 = this.aFloat17 = this.aFloat8 = 0.0F;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg0 - this.aFloat10);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat11);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat14);
		arg3[0] = (int) (this.aFloat13 * (float) local24 + (float) local10 * this.aFloat15 + this.aFloat9 * (float) local17);
		arg3[1] = (int) ((float) local10 * this.aFloat18 + (float) local17 * this.aFloat19 + this.aFloat12 * (float) local24);
		arg3[2] = (int) (this.aFloat8 * (float) local17 + this.aFloat17 * (float) local10 + this.aFloat16 * (float) local24);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([I)V")
	@Override
	public void method7928(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat10;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat11;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat14;
		arg0[1] = (int) (local28 * this.aFloat12 + local12 * this.aFloat18 + this.aFloat19 * local20);
		arg0[0] = (int) (local12 * this.aFloat15 + this.aFloat9 * local20 + local28 * this.aFloat13);
		arg0[2] = (int) (this.aFloat17 * local12 + this.aFloat8 * local20 + this.aFloat16 * local28);
	}
}
