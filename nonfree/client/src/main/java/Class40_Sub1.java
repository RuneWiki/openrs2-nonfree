import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	public int anInt4743;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	public int anInt4744;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "I")
	public int anInt4745;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	public int anInt4746;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "I")
	public int anInt4747;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	public int anInt4748;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	public int anInt4749;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "I")
	public int anInt4750;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "I")
	public int anInt4751;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	public int anInt4752;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	public int anInt4753;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	public int anInt4754;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	public Class40_Sub1() {
		this.v();
	}

	@OriginalMember(owner = "client!md", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4753 += arg0;
		this.anInt4746 += arg1;
		this.anInt4750 += arg2;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt4753 + (this.anInt4744 * arg0 + this.anInt4749 * arg1 + this.anInt4747 * arg2 >> 15);
		arg3[1] = this.anInt4746 + (this.anInt4752 * arg0 + this.anInt4743 * arg1 + this.anInt4748 * arg2 >> 15);
		arg3[2] = this.anInt4750 + (this.anInt4751 * arg0 + this.anInt4754 * arg1 + this.anInt4745 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.anInt4744 = 32768;
		this.anInt4743 = this.anInt4745 = Class90_Sub1.anIntArray303[arg0 & 0x3FFF];
		this.anInt4754 = Class90_Sub1.anIntArray304[arg0 & 0x3FFF];
		this.anInt4748 = -this.anInt4754;
		this.anInt4749 = this.anInt4747 = this.anInt4753 = this.anInt4752 = this.anInt4746 = this.anInt4751 = this.anInt4750 = 0;
	}

	@OriginalMember(owner = "client!md", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt4753;
		@Pc(13) int local13 = arg0[1] - this.anInt4746;
		@Pc(20) int local20 = arg0[2] - this.anInt4750;
		arg0[0] = this.anInt4744 * local6 + this.anInt4752 * local13 + this.anInt4751 * local20 >> 15;
		arg0[1] = this.anInt4749 * local6 + this.anInt4743 * local13 + this.anInt4754 * local20 >> 15;
		arg0[2] = this.anInt4747 * local6 + this.anInt4748 * local13 + this.anInt4745 * local20 >> 15;
	}

	@OriginalMember(owner = "client!md", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class40 arg0) {
		@Pc(2) Class40_Sub1 local2 = (Class40_Sub1) arg0;
		this.anInt4744 = local2.anInt4744;
		this.anInt4749 = local2.anInt4749;
		this.anInt4747 = local2.anInt4747;
		this.anInt4753 = local2.anInt4753;
		this.anInt4752 = local2.anInt4752;
		this.anInt4743 = local2.anInt4743;
		this.anInt4748 = local2.anInt4748;
		this.anInt4746 = local2.anInt4746;
		this.anInt4751 = local2.anInt4751;
		this.anInt4754 = local2.anInt4754;
		this.anInt4745 = local2.anInt4745;
		this.anInt4750 = local2.anInt4750;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class40 method4576() {
		@Pc(3) Class40_Sub1 local3 = new Class40_Sub1();
		local3.anInt4744 = this.anInt4744;
		local3.anInt4749 = this.anInt4749;
		local3.anInt4747 = this.anInt4747;
		local3.anInt4753 = this.anInt4753;
		local3.anInt4752 = this.anInt4752;
		local3.anInt4743 = this.anInt4743;
		local3.anInt4748 = this.anInt4748;
		local3.anInt4746 = this.anInt4746;
		local3.anInt4751 = this.anInt4751;
		local3.anInt4754 = this.anInt4754;
		local3.anInt4745 = this.anInt4745;
		local3.anInt4750 = this.anInt4750;
		return local3;
	}

	@OriginalMember(owner = "client!md", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class90_Sub1.anIntArray303[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class90_Sub1.anIntArray304[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4752;
		@Pc(17) int local17 = this.anInt4743;
		@Pc(20) int local20 = this.anInt4748;
		@Pc(23) int local23 = this.anInt4746;
		this.anInt4752 = local14 * local5 - this.anInt4751 * local11 >> 15;
		this.anInt4751 = local14 * local11 + this.anInt4751 * local5 >> 15;
		this.anInt4743 = local17 * local5 - this.anInt4754 * local11 >> 15;
		this.anInt4754 = local17 * local11 + this.anInt4754 * local5 >> 15;
		this.anInt4748 = local20 * local5 - this.anInt4745 * local11 >> 15;
		this.anInt4745 = local20 * local11 + this.anInt4745 * local5 >> 15;
		this.anInt4746 = local23 * local5 - this.anInt4750 * local11 >> 15;
		this.anInt4750 = local23 * local11 + this.anInt4750 * local5 >> 15;
	}

	@OriginalMember(owner = "client!md", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.anInt4752 = this.anInt4751 = this.anInt4749 = this.anInt4754 = this.anInt4747 = this.anInt4748 = this.anInt4753 = this.anInt4746 = this.anInt4750 = 0;
		this.anInt4744 = this.anInt4743 = this.anInt4745 = 32768;
	}

	@OriginalMember(owner = "client!md", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class90_Sub1.anIntArray303[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class90_Sub1.anIntArray304[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4744;
		@Pc(17) int local17 = this.anInt4749;
		@Pc(20) int local20 = this.anInt4747;
		@Pc(23) int local23 = this.anInt4753;
		this.anInt4744 = local14 * local5 + this.anInt4751 * local11 >> 15;
		this.anInt4751 = this.anInt4751 * local5 - local14 * local11 >> 15;
		this.anInt4749 = local17 * local5 + this.anInt4754 * local11 >> 15;
		this.anInt4754 = this.anInt4754 * local5 - local17 * local11 >> 15;
		this.anInt4747 = local20 * local5 + this.anInt4745 * local11 >> 15;
		this.anInt4745 = this.anInt4745 * local5 - local20 * local11 >> 15;
		this.anInt4753 = local23 * local5 + this.anInt4750 * local11 >> 15;
		this.anInt4750 = this.anInt4750 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!md", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4752 = this.anInt4751 = this.anInt4749 = this.anInt4754 = this.anInt4747 = this.anInt4748 = 0;
		this.anInt4744 = this.anInt4743 = this.anInt4745 = 32768;
		this.anInt4753 = arg0;
		this.anInt4746 = arg1;
		this.anInt4750 = arg2;
	}

	@OriginalMember(owner = "client!md", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class90_Sub1.anIntArray303[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class90_Sub1.anIntArray304[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class90_Sub1.anIntArray303[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class90_Sub1.anIntArray304[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class90_Sub1.anIntArray303[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class90_Sub1.anIntArray304[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt4744 = local17 * local29 + local23 * local47 >> 15;
		this.anInt4752 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt4751 = local23 * local5 >> 15;
		this.anInt4749 = local5 * local35 >> 15;
		this.anInt4743 = local5 * local29 >> 15;
		this.anInt4754 = -local11;
		this.anInt4747 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt4748 = local23 * local35 + local17 * local41 >> 15;
		this.anInt4745 = local17 * local5 >> 15;
		this.anInt4753 = -arg0 * this.anInt4744 - arg1 * this.anInt4749 - arg2 * this.anInt4747 >> 15;
		this.anInt4746 = -arg0 * this.anInt4752 - arg1 * this.anInt4743 - arg2 * this.anInt4748 >> 15;
		this.anInt4750 = -arg0 * this.anInt4751 - arg1 * this.anInt4754 - arg2 * this.anInt4745 >> 15;
	}

	@OriginalMember(owner = "client!md", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.anInt4745 = 32768;
		this.anInt4744 = this.anInt4743 = Class90_Sub1.anIntArray303[arg0 & 0x3FFF];
		this.anInt4752 = Class90_Sub1.anIntArray304[arg0 & 0x3FFF];
		this.anInt4749 = -this.anInt4752;
		this.anInt4747 = this.anInt4753 = this.anInt4748 = this.anInt4746 = this.anInt4751 = this.anInt4754 = this.anInt4750 = 0;
	}

	@OriginalMember(owner = "client!md", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt4744 * arg0 + this.anInt4749 * arg1 + this.anInt4747 * arg2 >> 15;
		arg3[1] = this.anInt4752 * arg0 + this.anInt4743 * arg1 + this.anInt4748 * arg2 >> 15;
		arg3[2] = this.anInt4751 * arg0 + this.anInt4754 * arg1 + this.anInt4745 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!md", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.anInt4743 = 32768;
		this.anInt4744 = this.anInt4745 = Class90_Sub1.anIntArray303[arg0 & 0x3FFF];
		this.anInt4747 = Class90_Sub1.anIntArray304[arg0 & 0x3FFF];
		this.anInt4751 = -this.anInt4747;
		this.anInt4749 = this.anInt4753 = this.anInt4752 = this.anInt4748 = this.anInt4746 = this.anInt4754 = this.anInt4750 = 0;
	}
}
