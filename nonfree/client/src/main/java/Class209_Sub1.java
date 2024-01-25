import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class209_Sub1 extends Class209 {

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!lu", name = "F", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!lu", name = "G", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!lu", name = "H", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!lu", name = "I", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!lu", name = "J", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
	public Class209_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!lu", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class223.aFloatArray45[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class223.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat130;
		@Pc(21) float local21 = this.aFloat124;
		@Pc(24) float local24 = this.aFloat127;
		this.aFloat130 = this.aFloat134 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat133;
		this.aFloat134 = local9 * this.aFloat134 - local18 * local15;
		this.aFloat124 = this.aFloat128 * local15 + local9 * local21;
		this.aFloat127 = this.aFloat131 * local15 + local24 * local9;
		this.aFloat128 = local9 * this.aFloat128 - local21 * local15;
		this.aFloat133 = this.aFloat132 * local15 + local37 * local9;
		this.aFloat131 = local9 * this.aFloat131 - local15 * local24;
		this.aFloat132 = this.aFloat132 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!lu", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat133;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat129;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat132;
		arg0[2] = (int) (this.aFloat131 * local29 + this.aFloat135 * local20 + local11 * this.aFloat127);
		arg0[0] = (int) (local20 * this.aFloat126 + this.aFloat130 * local11 + local29 * this.aFloat134);
		arg0[1] = (int) (local29 * this.aFloat128 + local11 * this.aFloat124 + local20 * this.aFloat125);
	}

	@OriginalMember(owner = "client!lu", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class223.aFloatArray45[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class223.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat126;
		@Pc(21) float local21 = this.aFloat125;
		@Pc(24) float local24 = this.aFloat135;
		@Pc(27) float local27 = this.aFloat129;
		this.aFloat126 = local9 * local18 - local15 * this.aFloat134;
		this.aFloat125 = local21 * local9 - this.aFloat128 * local15;
		this.aFloat134 = local18 * local15 + this.aFloat134 * local9;
		this.aFloat128 = this.aFloat128 * local9 + local21 * local15;
		this.aFloat135 = local24 * local9 - this.aFloat131 * local15;
		this.aFloat129 = local9 * local27 - this.aFloat132 * local15;
		this.aFloat131 = local15 * local24 + local9 * this.aFloat131;
		this.aFloat132 = local15 * local27 + local9 * this.aFloat132;
	}

	@OriginalMember(owner = "client!lu", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat126 = this.aFloat134 = this.aFloat124 = this.aFloat128 = this.aFloat127 = this.aFloat135 = this.aFloat133 = this.aFloat129 = this.aFloat132 = 0.0F;
		this.aFloat130 = this.aFloat125 = this.aFloat131 = 1.0F;
	}

	@OriginalMember(owner = "client!lu", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat128 + (float) arg0 * this.aFloat134 + this.aFloat131 * (float) arg2);
		arg3[0] = (int) ((float) arg2 * this.aFloat127 + this.aFloat124 * (float) arg1 + (float) arg0 * this.aFloat130);
		arg3[1] = (int) (this.aFloat126 * (float) arg0 + (float) arg1 * this.aFloat125 + this.aFloat135 * (float) arg2);
	}

	@OriginalMember(owner = "client!lu", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class223.aFloatArray45[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class223.aFloatArray46[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat130;
		@Pc(21) float local21 = this.aFloat124;
		@Pc(24) float local24 = this.aFloat127;
		this.aFloat130 = local18 * local9 - this.aFloat126 * local15;
		@Pc(38) float local38 = this.aFloat133;
		this.aFloat126 = local18 * local15 + local9 * this.aFloat126;
		this.aFloat124 = local21 * local9 - this.aFloat125 * local15;
		this.aFloat125 = local9 * this.aFloat125 + local21 * local15;
		this.aFloat127 = local24 * local9 - local15 * this.aFloat135;
		this.aFloat133 = local38 * local9 - this.aFloat129 * local15;
		this.aFloat135 = local24 * local15 + this.aFloat135 * local9;
		this.aFloat129 = this.aFloat129 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!lu", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat131 = 1.0F;
		this.aFloat130 = this.aFloat125 = Class223.aFloatArray45[arg0 & 0x3FFF];
		this.aFloat126 = Class223.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat124 = -this.aFloat126;
		this.aFloat127 = this.aFloat133 = this.aFloat135 = this.aFloat129 = this.aFloat134 = this.aFloat128 = this.aFloat132 = 0.0F;
	}

	@OriginalMember(owner = "client!lu", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat130 = 1.0F;
		this.aFloat125 = this.aFloat131 = Class223.aFloatArray45[arg0 & 0x3FFF];
		this.aFloat128 = Class223.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat124 = this.aFloat127 = this.aFloat133 = this.aFloat126 = this.aFloat129 = this.aFloat134 = this.aFloat132 = 0.0F;
		this.aFloat135 = -this.aFloat128;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6362() {
		@Pc(7) Class209_Sub1 local7 = new Class209_Sub1();
		local7.aFloat133 = this.aFloat133;
		local7.aFloat131 = this.aFloat131;
		local7.aFloat128 = this.aFloat128;
		local7.aFloat130 = this.aFloat130;
		local7.aFloat126 = this.aFloat126;
		local7.aFloat129 = this.aFloat129;
		local7.aFloat132 = this.aFloat132;
		local7.aFloat135 = this.aFloat135;
		local7.aFloat134 = this.aFloat134;
		local7.aFloat124 = this.aFloat124;
		local7.aFloat127 = this.aFloat127;
		local7.aFloat125 = this.aFloat125;
		return local7;
	}

	@OriginalMember(owner = "client!lu", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat129 += arg1;
		this.aFloat133 += arg0;
		this.aFloat132 += arg2;
	}

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat125 = 1.0F;
		this.aFloat130 = this.aFloat131 = Class223.aFloatArray45[arg0 & 0x3FFF];
		this.aFloat127 = Class223.aFloatArray46[arg0 & 0x3FFF];
		this.aFloat124 = this.aFloat133 = this.aFloat126 = this.aFloat135 = this.aFloat129 = this.aFloat128 = this.aFloat132 = 0.0F;
		this.aFloat134 = -this.aFloat127;
	}

	@OriginalMember(owner = "client!lu", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class209 arg0) {
		@Pc(6) Class209_Sub1 local6 = (Class209_Sub1) arg0;
		this.aFloat135 = local6.aFloat135;
		this.aFloat131 = local6.aFloat131;
		this.aFloat127 = local6.aFloat127;
		this.aFloat126 = local6.aFloat126;
		this.aFloat128 = local6.aFloat128;
		this.aFloat132 = local6.aFloat132;
		this.aFloat125 = local6.aFloat125;
		this.aFloat129 = local6.aFloat129;
		this.aFloat124 = local6.aFloat124;
		this.aFloat134 = local6.aFloat134;
		this.aFloat130 = local6.aFloat130;
		this.aFloat133 = local6.aFloat133;
	}

	@OriginalMember(owner = "client!lu", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat132 = arg2;
		this.aFloat130 = this.aFloat125 = this.aFloat131 = 1.0F;
		this.aFloat129 = arg1;
		this.aFloat126 = this.aFloat134 = this.aFloat124 = this.aFloat128 = this.aFloat127 = this.aFloat135 = 0.0F;
		this.aFloat133 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat129 + (float) arg2 * this.aFloat135 + this.aFloat126 * (float) arg0 + (float) arg1 * this.aFloat125);
		arg3[0] = (int) (this.aFloat133 + this.aFloat127 * (float) arg2 + this.aFloat124 * (float) arg1 + this.aFloat130 * (float) arg0);
		arg3[2] = (int) (this.aFloat132 + this.aFloat131 * (float) arg2 + this.aFloat128 * (float) arg1 + (float) arg0 * this.aFloat134);
	}

	@OriginalMember(owner = "client!lu", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class223.aFloatArray45[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class223.aFloatArray46[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class223.aFloatArray45[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class223.aFloatArray46[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class223.aFloatArray45[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class223.aFloatArray46[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat127 = local47 * local21 + local33 * -local27;
		this.aFloat134 = local27 * local9;
		this.aFloat128 = -local15;
		this.aFloat135 = local43 * local21 + local27 * local39;
		this.aFloat130 = local27 * local47 + local33 * local21;
		this.aFloat125 = local33 * local9;
		this.aFloat124 = local9 * local39;
		this.aFloat131 = local9 * local21;
		this.aFloat126 = local39 * -local21 + local27 * local43;
		this.aFloat132 = (float) -arg0 * this.aFloat134 - this.aFloat128 * (float) arg1 - this.aFloat131 * (float) arg2;
		this.aFloat133 = -((float) arg2 * this.aFloat127) + this.aFloat130 * (float) -arg0 - (float) arg1 * this.aFloat124;
		this.aFloat129 = -((float) arg2 * this.aFloat135) + this.aFloat126 * (float) -arg0 - (float) arg1 * this.aFloat125;
	}
}
