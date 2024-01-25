import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class239_Sub1 extends Class239 {

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!ni", name = "C", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!ni", name = "G", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!ni", name = "I", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class239_Sub1() {
		this.method9249();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([I)V")
	@Override
	public void method9241(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat130;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat128;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat131;
		arg0[1] = (int) (this.aFloat127 * local29 + local21 * this.aFloat134 + local12 * this.aFloat129);
		arg0[2] = (int) (this.aFloat133 * local21 + local12 * this.aFloat132 + this.aFloat124 * local29);
		arg0[0] = (int) (this.aFloat123 * local29 + this.aFloat126 * local12 + this.aFloat125 * local21);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(III[I)V")
	@Override
	public void method9239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg0 * this.aFloat125 + (float) arg1 * this.aFloat134 + (float) arg2 * this.aFloat133);
		arg3[0] = (int) (this.aFloat129 * (float) arg1 + (float) arg0 * this.aFloat126 + this.aFloat132 * (float) arg2);
		arg3[2] = (int) (this.aFloat123 * (float) arg0 + (float) arg1 * this.aFloat127 + (float) arg2 * this.aFloat124);
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
	@Override
	public void method9246(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class67.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class67.aFloatArray15[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat126;
		@Pc(21) float local21 = this.aFloat129;
		@Pc(24) float local24 = this.aFloat132;
		@Pc(27) float local27 = this.aFloat130;
		this.aFloat126 = local9 * local18 - this.aFloat125 * local15;
		this.aFloat129 = local9 * local21 - local15 * this.aFloat134;
		this.aFloat125 = local9 * this.aFloat125 + local15 * local18;
		this.aFloat134 = this.aFloat134 * local9 + local21 * local15;
		this.aFloat132 = local9 * local24 - local15 * this.aFloat133;
		this.aFloat133 = this.aFloat133 * local9 + local24 * local15;
		this.aFloat130 = local9 * local27 - local15 * this.aFloat128;
		this.aFloat128 = local15 * local27 + local9 * this.aFloat128;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "()Lclient!uu;")
	@Override
	public Class239 method9235() {
		@Pc(7) Class239_Sub1 local7 = new Class239_Sub1();
		local7.aFloat134 = this.aFloat134;
		local7.aFloat129 = this.aFloat129;
		local7.aFloat133 = this.aFloat133;
		local7.aFloat127 = this.aFloat127;
		local7.aFloat132 = this.aFloat132;
		local7.aFloat128 = this.aFloat128;
		local7.aFloat126 = this.aFloat126;
		local7.aFloat124 = this.aFloat124;
		local7.aFloat123 = this.aFloat123;
		local7.aFloat130 = this.aFloat130;
		local7.aFloat125 = this.aFloat125;
		local7.aFloat131 = this.aFloat131;
		return local7;
	}

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V")
	@Override
	public void method9250(@OriginalArg(0) int arg0) {
		this.aFloat126 = 1.0F;
		this.aFloat134 = this.aFloat124 = Class67.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat127 = Class67.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat133 = -this.aFloat127;
		this.aFloat129 = this.aFloat132 = this.aFloat130 = this.aFloat125 = this.aFloat128 = this.aFloat123 = this.aFloat131 = 0.0F;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
	@Override
	public void method9242(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class67.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class67.aFloatArray15[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat125;
		@Pc(21) float local21 = this.aFloat134;
		@Pc(24) float local24 = this.aFloat133;
		this.aFloat125 = local9 * local18 - local15 * this.aFloat123;
		@Pc(37) float local37 = this.aFloat128;
		this.aFloat134 = local21 * local9 - this.aFloat127 * local15;
		this.aFloat123 = local18 * local15 + local9 * this.aFloat123;
		this.aFloat133 = local9 * local24 - local15 * this.aFloat124;
		this.aFloat127 = this.aFloat127 * local9 + local15 * local21;
		this.aFloat124 = local24 * local15 + local9 * this.aFloat124;
		this.aFloat128 = local9 * local37 - local15 * this.aFloat131;
		this.aFloat131 = local15 * local37 + local9 * this.aFloat131;
	}

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V")
	@Override
	public void method9248(@OriginalArg(0) int arg0) {
		this.aFloat124 = 1.0F;
		this.aFloat126 = this.aFloat134 = Class67.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat125 = Class67.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat132 = this.aFloat130 = this.aFloat133 = this.aFloat128 = this.aFloat123 = this.aFloat127 = this.aFloat131 = 0.0F;
		this.aFloat129 = -this.aFloat125;
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
	@Override
	public void method9243(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class67.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class67.aFloatArray15[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat126;
		@Pc(21) float local21 = this.aFloat129;
		@Pc(24) float local24 = this.aFloat132;
		this.aFloat126 = local9 * local18 + this.aFloat123 * local15;
		@Pc(37) float local37 = this.aFloat130;
		this.aFloat123 = this.aFloat123 * local9 - local15 * local18;
		this.aFloat129 = local15 * this.aFloat127 + local9 * local21;
		this.aFloat132 = local15 * this.aFloat124 + local9 * local24;
		this.aFloat127 = local9 * this.aFloat127 - local21 * local15;
		this.aFloat124 = local9 * this.aFloat124 - local15 * local24;
		this.aFloat130 = this.aFloat131 * local15 + local37 * local9;
		this.aFloat131 = this.aFloat131 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III[I)V")
	@Override
	public void method9238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat131 + (float) arg1 * this.aFloat127 + (float) arg0 * this.aFloat123 + (float) arg2 * this.aFloat124);
		arg3[0] = (int) (this.aFloat132 * (float) arg2 + this.aFloat129 * (float) arg1 + (float) arg0 * this.aFloat126 + this.aFloat130);
		arg3[1] = (int) (this.aFloat128 + (float) arg2 * this.aFloat133 + (float) arg0 * this.aFloat125 + this.aFloat134 * (float) arg1);
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(III[I)V")
	@Override
	public void method9240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat128);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat130);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat131);
		arg3[2] = (int) ((float) local6 * this.aFloat133 + (float) local17 * this.aFloat132 + this.aFloat124 * (float) local24);
		arg3[1] = (int) (this.aFloat134 * (float) local6 + (float) local17 * this.aFloat129 + this.aFloat127 * (float) local24);
		arg3[0] = (int) (this.aFloat123 * (float) local24 + (float) local6 * this.aFloat125 + this.aFloat126 * (float) local17);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	@Override
	public void method9233(@OriginalArg(0) int arg0) {
		this.aFloat134 = 1.0F;
		this.aFloat126 = this.aFloat124 = Class67.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat132 = Class67.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat123 = -this.aFloat132;
		this.aFloat129 = this.aFloat130 = this.aFloat125 = this.aFloat133 = this.aFloat128 = this.aFloat127 = this.aFloat131 = 0.0F;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class67.aFloatArray14[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class67.aFloatArray15[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class67.aFloatArray14[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class67.aFloatArray15[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class67.aFloatArray14[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class67.aFloatArray15[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat134 = local9 * local33;
		this.aFloat125 = local39 * -local21 + local43 * local27;
		this.aFloat127 = -local15;
		this.aFloat133 = local27 * local39 + local43 * local21;
		this.aFloat126 = local47 * local27 + local33 * local21;
		this.aFloat124 = local9 * local21;
		this.aFloat123 = local9 * local27;
		this.aFloat129 = local39 * local9;
		this.aFloat132 = -local27 * local33 + local47 * local21;
		this.aFloat128 = -(this.aFloat133 * (float) arg2) + (float) -arg0 * this.aFloat125 - (float) arg1 * this.aFloat134;
		this.aFloat130 = -((float) arg2 * this.aFloat132) - this.aFloat129 * (float) arg1 + (float) -arg0 * this.aFloat126;
		this.aFloat131 = this.aFloat123 * (float) -arg0 - (float) arg1 * this.aFloat127 - (float) arg2 * this.aFloat124;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "()V")
	@Override
	public void method9249() {
		this.aFloat125 = this.aFloat123 = this.aFloat129 = this.aFloat127 = this.aFloat132 = this.aFloat133 = this.aFloat130 = this.aFloat128 = this.aFloat131 = 0.0F;
		this.aFloat126 = this.aFloat134 = this.aFloat124 = 1.0F;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
	@Override
	public void method9234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat126 = this.aFloat134 = this.aFloat124 = 1.0F;
		this.aFloat125 = this.aFloat123 = this.aFloat129 = this.aFloat127 = this.aFloat132 = this.aFloat133 = 0.0F;
		this.aFloat131 = (float) arg2;
		this.aFloat130 = (float) arg0;
		this.aFloat128 = (float) arg1;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)V")
	@Override
	public void method9244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat128 += (float) arg1;
		this.aFloat130 += (float) arg0;
		this.aFloat131 += (float) arg2;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!uu;)V")
	@Override
	public void method9247(@OriginalArg(0) Class239 arg0) {
		@Pc(6) Class239_Sub1 local6 = (Class239_Sub1) arg0;
		this.aFloat125 = local6.aFloat125;
		this.aFloat129 = local6.aFloat129;
		this.aFloat133 = local6.aFloat133;
		this.aFloat124 = local6.aFloat124;
		this.aFloat134 = local6.aFloat134;
		this.aFloat127 = local6.aFloat127;
		this.aFloat126 = local6.aFloat126;
		this.aFloat128 = local6.aFloat128;
		this.aFloat123 = local6.aFloat123;
		this.aFloat131 = local6.aFloat131;
		this.aFloat130 = local6.aFloat130;
		this.aFloat132 = local6.aFloat132;
	}
}
