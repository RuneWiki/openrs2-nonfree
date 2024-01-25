import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
	public int anInt2732;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
	public int anInt2733;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
	public int anInt2734;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
	public int anInt2735;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	public int anInt2736;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
	public int anInt2737;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
	public int anInt2738;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	public int anInt2739;

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
	public int anInt2740;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
	public int anInt2741;

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
	public int anInt2742;

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
	public int anInt2743;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
	public Class102_Sub1() {
		this.HA();
	}

	@OriginalMember(owner = "client!gu", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2736 * arg0 + this.anInt2743 * arg1 + this.anInt2742 * arg2 >> 15;
		arg3[1] = this.anInt2734 * arg0 + this.anInt2737 * arg1 + this.anInt2738 * arg2 >> 15;
		arg3[2] = this.anInt2735 * arg0 + this.anInt2732 * arg1 + this.anInt2741 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!gu", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class184.anIntArray350[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class184.anIntArray349[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2734;
		@Pc(17) int local17 = this.anInt2737;
		@Pc(20) int local20 = this.anInt2738;
		@Pc(23) int local23 = this.anInt2739;
		this.anInt2734 = local14 * local5 - this.anInt2735 * local11 >> 15;
		this.anInt2735 = local14 * local11 + this.anInt2735 * local5 >> 15;
		this.anInt2737 = local17 * local5 - this.anInt2732 * local11 >> 15;
		this.anInt2732 = local17 * local11 + this.anInt2732 * local5 >> 15;
		this.anInt2738 = local20 * local5 - this.anInt2741 * local11 >> 15;
		this.anInt2741 = local20 * local11 + this.anInt2741 * local5 >> 15;
		this.anInt2739 = local23 * local5 - this.anInt2740 * local11 >> 15;
		this.anInt2740 = local23 * local11 + this.anInt2740 * local5 >> 15;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class184.anIntArray350[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class184.anIntArray349[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2736;
		@Pc(17) int local17 = this.anInt2743;
		@Pc(20) int local20 = this.anInt2742;
		@Pc(23) int local23 = this.anInt2733;
		this.anInt2736 = local14 * local5 + this.anInt2735 * local11 >> 15;
		this.anInt2735 = this.anInt2735 * local5 - local14 * local11 >> 15;
		this.anInt2743 = local17 * local5 + this.anInt2732 * local11 >> 15;
		this.anInt2732 = this.anInt2732 * local5 - local17 * local11 >> 15;
		this.anInt2742 = local20 * local5 + this.anInt2741 * local11 >> 15;
		this.anInt2741 = this.anInt2741 * local5 - local20 * local11 >> 15;
		this.anInt2733 = local23 * local5 + this.anInt2740 * local11 >> 15;
		this.anInt2740 = this.anInt2740 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!gu", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.anInt2734 = this.anInt2735 = this.anInt2743 = this.anInt2732 = this.anInt2742 = this.anInt2738 = this.anInt2733 = this.anInt2739 = this.anInt2740 = 0;
		this.anInt2736 = this.anInt2737 = this.anInt2741 = 32768;
	}

	@OriginalMember(owner = "client!gu", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2734 = this.anInt2735 = this.anInt2743 = this.anInt2732 = this.anInt2742 = this.anInt2738 = 0;
		this.anInt2736 = this.anInt2737 = this.anInt2741 = 32768;
		this.anInt2733 = arg0;
		this.anInt2739 = arg1;
		this.anInt2740 = arg2;
	}

	@OriginalMember(owner = "client!gu", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2733 += arg0;
		this.anInt2739 += arg1;
		this.anInt2740 += arg2;
	}

	@OriginalMember(owner = "client!gu", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt2737 = 32768;
		this.anInt2736 = this.anInt2741 = Class184.anIntArray350[arg0 & 0x3FFF];
		this.anInt2742 = Class184.anIntArray349[arg0 & 0x3FFF];
		this.anInt2735 = -this.anInt2742;
		this.anInt2743 = this.anInt2733 = this.anInt2734 = this.anInt2738 = this.anInt2739 = this.anInt2732 = this.anInt2740 = 0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2733 + (this.anInt2736 * arg0 + this.anInt2743 * arg1 + this.anInt2742 * arg2 >> 15);
		arg3[1] = this.anInt2739 + (this.anInt2734 * arg0 + this.anInt2737 * arg1 + this.anInt2738 * arg2 >> 15);
		arg3[2] = this.anInt2740 + (this.anInt2735 * arg0 + this.anInt2732 * arg1 + this.anInt2741 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class102 method4931() {
		@Pc(3) Class102_Sub1 local3 = new Class102_Sub1();
		local3.anInt2736 = this.anInt2736;
		local3.anInt2743 = this.anInt2743;
		local3.anInt2742 = this.anInt2742;
		local3.anInt2733 = this.anInt2733;
		local3.anInt2734 = this.anInt2734;
		local3.anInt2737 = this.anInt2737;
		local3.anInt2738 = this.anInt2738;
		local3.anInt2739 = this.anInt2739;
		local3.anInt2735 = this.anInt2735;
		local3.anInt2732 = this.anInt2732;
		local3.anInt2741 = this.anInt2741;
		local3.anInt2740 = this.anInt2740;
		return local3;
	}

	@OriginalMember(owner = "client!gu", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class102 arg0) {
		@Pc(2) Class102_Sub1 local2 = (Class102_Sub1) arg0;
		this.anInt2736 = local2.anInt2736;
		this.anInt2743 = local2.anInt2743;
		this.anInt2742 = local2.anInt2742;
		this.anInt2733 = local2.anInt2733;
		this.anInt2734 = local2.anInt2734;
		this.anInt2737 = local2.anInt2737;
		this.anInt2738 = local2.anInt2738;
		this.anInt2739 = local2.anInt2739;
		this.anInt2735 = local2.anInt2735;
		this.anInt2732 = local2.anInt2732;
		this.anInt2741 = local2.anInt2741;
		this.anInt2740 = local2.anInt2740;
	}

	@OriginalMember(owner = "client!gu", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt2741 = 32768;
		this.anInt2736 = this.anInt2737 = Class184.anIntArray350[arg0 & 0x3FFF];
		this.anInt2734 = Class184.anIntArray349[arg0 & 0x3FFF];
		this.anInt2743 = -this.anInt2734;
		this.anInt2742 = this.anInt2733 = this.anInt2738 = this.anInt2739 = this.anInt2735 = this.anInt2732 = this.anInt2740 = 0;
	}

	@OriginalMember(owner = "client!gu", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt2733;
		@Pc(13) int local13 = arg0[1] - this.anInt2739;
		@Pc(20) int local20 = arg0[2] - this.anInt2740;
		arg0[0] = this.anInt2736 * local6 + this.anInt2734 * local13 + this.anInt2735 * local20 >> 15;
		arg0[1] = this.anInt2743 * local6 + this.anInt2737 * local13 + this.anInt2732 * local20 >> 15;
		arg0[2] = this.anInt2742 * local6 + this.anInt2738 * local13 + this.anInt2741 * local20 >> 15;
	}

	@OriginalMember(owner = "client!gu", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class184.anIntArray350[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class184.anIntArray349[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class184.anIntArray350[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class184.anIntArray349[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class184.anIntArray350[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class184.anIntArray349[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt2736 = local17 * local29 + local23 * local47 >> 15;
		this.anInt2734 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt2735 = local23 * local5 >> 15;
		this.anInt2743 = local5 * local35 >> 15;
		this.anInt2737 = local5 * local29 >> 15;
		this.anInt2732 = -local11;
		this.anInt2742 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt2738 = local23 * local35 + local17 * local41 >> 15;
		this.anInt2741 = local17 * local5 >> 15;
		this.anInt2733 = -arg0 * this.anInt2736 - arg1 * this.anInt2743 - arg2 * this.anInt2742 >> 15;
		this.anInt2739 = -arg0 * this.anInt2734 - arg1 * this.anInt2737 - arg2 * this.anInt2738 >> 15;
		this.anInt2740 = -arg0 * this.anInt2735 - arg1 * this.anInt2732 - arg2 * this.anInt2741 >> 15;
	}

	@OriginalMember(owner = "client!gu", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.anInt2736 = 32768;
		this.anInt2737 = this.anInt2741 = Class184.anIntArray350[arg0 & 0x3FFF];
		this.anInt2732 = Class184.anIntArray349[arg0 & 0x3FFF];
		this.anInt2738 = -this.anInt2732;
		this.anInt2743 = this.anInt2742 = this.anInt2733 = this.anInt2734 = this.anInt2739 = this.anInt2735 = this.anInt2740 = 0;
	}
}
