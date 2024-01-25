import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pja")
public final class Class86_Sub3 extends Class86 {

	@OriginalMember(owner = "client!pja", name = "A", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!pja", name = "e", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!pja", name = "f", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!pja", name = "C", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!pja", name = "I", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!pja", name = "F", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!pja", name = "g", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!pja", name = "j", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!pja", name = "D", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!pja", name = "y", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!pja", name = "k", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!pja", name = "t", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "()V")
	public Class86_Sub3() {
		this.method7024();
	}

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat138 + this.aFloat137 * (float) arg0 + (float) arg2 * this.aFloat132);
		arg3[0] = (int) (this.aFloat129 * (float) arg0 + (float) arg1 * this.aFloat136 + (float) arg2 * this.aFloat131);
		arg3[1] = (int) (this.aFloat133 * (float) arg2 + (float) arg1 * this.aFloat130 + this.aFloat134 * (float) arg0);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat131 + this.aFloat129 * (float) arg0 + this.aFloat136 * (float) arg1 + this.aFloat128);
		arg3[1] = (int) (this.aFloat135 + (float) arg0 * this.aFloat134 + this.aFloat130 * (float) arg1 + this.aFloat133 * (float) arg2);
		arg3[2] = (int) ((float) arg1 * this.aFloat138 + this.aFloat137 * (float) arg0 + (float) arg2 * this.aFloat132 + this.aFloat139);
	}

	@OriginalMember(owner = "client!pja", name = "e", descriptor = "(I)V")
	@Override
	public void method7034(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat129;
		@Pc(21) float local21 = this.aFloat136;
		@Pc(24) float local24 = this.aFloat131;
		this.aFloat129 = this.aFloat137 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat128;
		this.aFloat137 = this.aFloat137 * local9 - local15 * local18;
		this.aFloat136 = local9 * local21 + local15 * this.aFloat138;
		this.aFloat131 = local15 * this.aFloat132 + local9 * local24;
		this.aFloat138 = local9 * this.aFloat138 - local21 * local15;
		this.aFloat132 = this.aFloat132 * local9 - local15 * local24;
		this.aFloat128 = local9 * local37 + local15 * this.aFloat139;
		this.aFloat139 = this.aFloat139 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "([I)V")
	@Override
	public void method7030(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat128;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat135;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat139;
		arg0[1] = (int) (this.aFloat138 * local28 + this.aFloat136 * local12 + local20 * this.aFloat130);
		arg0[0] = (int) (local20 * this.aFloat134 + local12 * this.aFloat129 + this.aFloat137 * local28);
		arg0[2] = (int) (this.aFloat131 * local12 + this.aFloat133 * local20 + this.aFloat132 * local28);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub39.aFloatArray50[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub39.aFloatArray49[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub39.aFloatArray50[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub39.aFloatArray49[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub39.aFloatArray50[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub39.aFloatArray49[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat132 = local21 * local9;
		this.aFloat131 = local21 * local47 + -local27 * local33;
		this.aFloat129 = local33 * local21 + local47 * local27;
		this.aFloat134 = local39 * -local21 + local27 * local43;
		this.aFloat136 = local39 * local9;
		this.aFloat138 = -local15;
		this.aFloat137 = local27 * local9;
		this.aFloat133 = local39 * local27 + local21 * local43;
		this.aFloat130 = local9 * local33;
		this.aFloat139 = -(this.aFloat138 * (float) arg1) + this.aFloat137 * (float) -arg0 - (float) arg2 * this.aFloat132;
		this.aFloat128 = -((float) arg2 * this.aFloat131) - (float) arg1 * this.aFloat136 + this.aFloat129 * (float) -arg0;
		this.aFloat135 = -(this.aFloat133 * (float) arg2) + (float) -arg0 * this.aFloat134 - this.aFloat130 * (float) arg1;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(Lclient!gw;)V")
	@Override
	public void method7032(@OriginalArg(0) Class86 arg0) {
		@Pc(6) Class86_Sub3 local6 = (Class86_Sub3) arg0;
		this.aFloat129 = local6.aFloat129;
		this.aFloat131 = local6.aFloat131;
		this.aFloat137 = local6.aFloat137;
		this.aFloat133 = local6.aFloat133;
		this.aFloat135 = local6.aFloat135;
		this.aFloat136 = local6.aFloat136;
		this.aFloat132 = local6.aFloat132;
		this.aFloat138 = local6.aFloat138;
		this.aFloat139 = local6.aFloat139;
		this.aFloat134 = local6.aFloat134;
		this.aFloat128 = local6.aFloat128;
		this.aFloat130 = local6.aFloat130;
	}

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "(I)V")
	@Override
	public void method7027(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat134;
		@Pc(21) float local21 = this.aFloat130;
		@Pc(24) float local24 = this.aFloat133;
		this.aFloat134 = local18 * local9 - this.aFloat137 * local15;
		@Pc(37) float local37 = this.aFloat135;
		this.aFloat130 = local21 * local9 - local15 * this.aFloat138;
		this.aFloat137 = local9 * this.aFloat137 + local15 * local18;
		this.aFloat138 = this.aFloat138 * local9 + local15 * local21;
		this.aFloat133 = local9 * local24 - local15 * this.aFloat132;
		this.aFloat132 = local24 * local15 + this.aFloat132 * local9;
		this.aFloat135 = local37 * local9 - this.aFloat139 * local15;
		this.aFloat139 = this.aFloat139 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "()Lclient!gw;")
	@Override
	public Class86 method7018() {
		@Pc(7) Class86_Sub3 local7 = new Class86_Sub3();
		local7.aFloat129 = this.aFloat129;
		local7.aFloat136 = this.aFloat136;
		local7.aFloat137 = this.aFloat137;
		local7.aFloat138 = this.aFloat138;
		local7.aFloat130 = this.aFloat130;
		local7.aFloat133 = this.aFloat133;
		local7.aFloat135 = this.aFloat135;
		local7.aFloat128 = this.aFloat128;
		local7.aFloat131 = this.aFloat131;
		local7.aFloat132 = this.aFloat132;
		local7.aFloat139 = this.aFloat139;
		local7.aFloat134 = this.aFloat134;
		return local7;
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(I)V")
	@Override
	public void method7029(@OriginalArg(0) int arg0) {
		this.aFloat132 = 1.0F;
		this.aFloat129 = this.aFloat130 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat134 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat131 = this.aFloat128 = this.aFloat133 = this.aFloat135 = this.aFloat137 = this.aFloat138 = this.aFloat139 = 0.0F;
		this.aFloat136 = -this.aFloat134;
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg1 - this.aFloat135);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat139);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat128);
		arg3[0] = (int) (this.aFloat137 * (float) local17 + this.aFloat134 * (float) local10 + this.aFloat129 * (float) local24);
		arg3[2] = (int) (this.aFloat131 * (float) local24 + this.aFloat133 * (float) local10 + (float) local17 * this.aFloat132);
		arg3[1] = (int) (this.aFloat138 * (float) local17 + this.aFloat136 * (float) local24 + this.aFloat130 * (float) local10);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V")
	@Override
	public void method7023(@OriginalArg(0) int arg0) {
		this.aFloat130 = 1.0F;
		this.aFloat129 = this.aFloat132 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat131 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat137 = -this.aFloat131;
		this.aFloat136 = this.aFloat128 = this.aFloat134 = this.aFloat133 = this.aFloat135 = this.aFloat138 = this.aFloat139 = 0.0F;
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(III)V")
	@Override
	public void method7026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat128 = (float) arg0;
		this.aFloat139 = (float) arg2;
		this.aFloat129 = this.aFloat130 = this.aFloat132 = 1.0F;
		this.aFloat135 = (float) arg1;
		this.aFloat134 = this.aFloat137 = this.aFloat136 = this.aFloat138 = this.aFloat131 = this.aFloat133 = 0.0F;
	}

	@OriginalMember(owner = "client!pja", name = "d", descriptor = "(I)V")
	@Override
	public void method7022(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat129;
		@Pc(21) float local21 = this.aFloat136;
		@Pc(24) float local24 = this.aFloat131;
		this.aFloat129 = local9 * local18 - local15 * this.aFloat134;
		@Pc(37) float local37 = this.aFloat128;
		this.aFloat134 = local9 * this.aFloat134 + local15 * local18;
		this.aFloat136 = local9 * local21 - local15 * this.aFloat130;
		this.aFloat130 = local9 * this.aFloat130 + local21 * local15;
		this.aFloat131 = local24 * local9 - this.aFloat133 * local15;
		this.aFloat133 = local15 * local24 + local9 * this.aFloat133;
		this.aFloat128 = local9 * local37 - local15 * this.aFloat135;
		this.aFloat135 = local9 * this.aFloat135 + local15 * local37;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat139 += (float) arg2;
		this.aFloat135 += (float) arg1;
		this.aFloat128 += (float) arg0;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "()V")
	@Override
	public void method7024() {
		this.aFloat129 = this.aFloat130 = this.aFloat132 = 1.0F;
		this.aFloat134 = this.aFloat137 = this.aFloat136 = this.aFloat138 = this.aFloat131 = this.aFloat133 = this.aFloat128 = this.aFloat135 = this.aFloat139 = 0.0F;
	}

	@OriginalMember(owner = "client!pja", name = "f", descriptor = "(I)V")
	@Override
	public void method7025(@OriginalArg(0) int arg0) {
		this.aFloat129 = 1.0F;
		this.aFloat130 = this.aFloat132 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat138 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat136 = this.aFloat131 = this.aFloat128 = this.aFloat134 = this.aFloat135 = this.aFloat137 = this.aFloat139 = 0.0F;
		this.aFloat133 = -this.aFloat138;
	}
}
