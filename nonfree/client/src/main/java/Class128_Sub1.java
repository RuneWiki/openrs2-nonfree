import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class128_Sub1 extends Class128 {

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public int anInt3780;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
	public int anInt3781;

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
	public int anInt3782;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
	public int anInt3783;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
	public int anInt3784;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
	public int anInt3785;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
	public int anInt3786;

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
	public int anInt3787;

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
	public int anInt3788;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
	public int anInt3789;

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
	public int anInt3790;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class128_Sub1() {
		this.ha();
	}

	@OriginalMember(owner = "client!hj", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.anInt3783 = 32768;
		this.anInt3782 = this.anInt3787 = Class200_Sub1.anIntArray576[arg0 & 0x3FFF];
		this.anInt3790 = Class200_Sub1.lb[arg0 & 0x3FFF];
		this.anInt3785 = -this.anInt3790;
		this.anInt3780 = this.anInt3784 = this.anInt3781 = this.anInt3788 = this.anInt3789 = this.anInt3786 = this.anInt3779 = 0;
	}

	@OriginalMember(owner = "client!hj", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt3781;
		@Pc(13) int local13 = arg0[1] - this.anInt3789;
		@Pc(20) int local20 = arg0[2] - this.anInt3779;
		arg0[0] = this.anInt3783 * local6 + this.anInt3788 * local13 + this.anInt3786 * local20 >> 15;
		arg0[1] = this.anInt3780 * local6 + this.anInt3782 * local13 + this.anInt3790 * local20 >> 15;
		arg0[2] = this.anInt3784 * local6 + this.anInt3785 * local13 + this.anInt3787 * local20 >> 15;
	}

	@OriginalMember(owner = "client!hj", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3788 = this.anInt3786 = this.anInt3780 = this.anInt3790 = this.anInt3784 = this.anInt3785 = 0;
		this.anInt3783 = this.anInt3782 = this.anInt3787 = 32768;
		this.anInt3781 = arg0;
		this.anInt3789 = arg1;
		this.anInt3779 = arg2;
	}

	@OriginalMember(owner = "client!hj", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.anInt3787 = 32768;
		this.anInt3783 = this.anInt3782 = Class200_Sub1.anIntArray576[arg0 & 0x3FFF];
		this.anInt3788 = Class200_Sub1.lb[arg0 & 0x3FFF];
		this.anInt3780 = -this.anInt3788;
		this.anInt3784 = this.anInt3781 = this.anInt3785 = this.anInt3789 = this.anInt3786 = this.anInt3790 = this.anInt3779 = 0;
	}

	@OriginalMember(owner = "client!hj", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class128 arg0) {
		@Pc(2) Class128_Sub1 local2 = (Class128_Sub1) arg0;
		this.anInt3783 = local2.anInt3783;
		this.anInt3780 = local2.anInt3780;
		this.anInt3784 = local2.anInt3784;
		this.anInt3781 = local2.anInt3781;
		this.anInt3788 = local2.anInt3788;
		this.anInt3782 = local2.anInt3782;
		this.anInt3785 = local2.anInt3785;
		this.anInt3789 = local2.anInt3789;
		this.anInt3786 = local2.anInt3786;
		this.anInt3790 = local2.anInt3790;
		this.anInt3787 = local2.anInt3787;
		this.anInt3779 = local2.anInt3779;
	}

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class200_Sub1.anIntArray576[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class200_Sub1.lb[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3788;
		@Pc(17) int local17 = this.anInt3782;
		@Pc(20) int local20 = this.anInt3785;
		@Pc(23) int local23 = this.anInt3789;
		this.anInt3788 = local14 * local5 - this.anInt3786 * local11 >> 15;
		this.anInt3786 = local14 * local11 + this.anInt3786 * local5 >> 15;
		this.anInt3782 = local17 * local5 - this.anInt3790 * local11 >> 15;
		this.anInt3790 = local17 * local11 + this.anInt3790 * local5 >> 15;
		this.anInt3785 = local20 * local5 - this.anInt3787 * local11 >> 15;
		this.anInt3787 = local20 * local11 + this.anInt3787 * local5 >> 15;
		this.anInt3789 = local23 * local5 - this.anInt3779 * local11 >> 15;
		this.anInt3779 = local23 * local11 + this.anInt3779 * local5 >> 15;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class128 method6887() {
		@Pc(3) Class128_Sub1 local3 = new Class128_Sub1();
		local3.anInt3783 = this.anInt3783;
		local3.anInt3780 = this.anInt3780;
		local3.anInt3784 = this.anInt3784;
		local3.anInt3781 = this.anInt3781;
		local3.anInt3788 = this.anInt3788;
		local3.anInt3782 = this.anInt3782;
		local3.anInt3785 = this.anInt3785;
		local3.anInt3789 = this.anInt3789;
		local3.anInt3786 = this.anInt3786;
		local3.anInt3790 = this.anInt3790;
		local3.anInt3787 = this.anInt3787;
		local3.anInt3779 = this.anInt3779;
		return local3;
	}

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class200_Sub1.anIntArray576[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class200_Sub1.lb[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class200_Sub1.anIntArray576[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class200_Sub1.lb[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class200_Sub1.anIntArray576[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class200_Sub1.lb[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt3783 = local17 * local29 + local23 * local47 >> 15;
		this.anInt3788 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt3786 = local23 * local5 >> 15;
		this.anInt3780 = local5 * local35 >> 15;
		this.anInt3782 = local5 * local29 >> 15;
		this.anInt3790 = -local11;
		this.anInt3784 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt3785 = local23 * local35 + local17 * local41 >> 15;
		this.anInt3787 = local17 * local5 >> 15;
		this.anInt3781 = -arg0 * this.anInt3783 - arg1 * this.anInt3780 - arg2 * this.anInt3784 >> 15;
		this.anInt3789 = -arg0 * this.anInt3788 - arg1 * this.anInt3782 - arg2 * this.anInt3785 >> 15;
		this.anInt3779 = -arg0 * this.anInt3786 - arg1 * this.anInt3790 - arg2 * this.anInt3787 >> 15;
	}

	@OriginalMember(owner = "client!hj", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3781 += arg0;
		this.anInt3789 += arg1;
		this.anInt3779 += arg2;
	}

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt3783 * arg0 + this.anInt3780 * arg1 + this.anInt3784 * arg2 >> 15;
		arg3[1] = this.anInt3788 * arg0 + this.anInt3782 * arg1 + this.anInt3785 * arg2 >> 15;
		arg3[2] = this.anInt3786 * arg0 + this.anInt3790 * arg1 + this.anInt3787 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!hj", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.anInt3788 = this.anInt3786 = this.anInt3780 = this.anInt3790 = this.anInt3784 = this.anInt3785 = this.anInt3781 = this.anInt3789 = this.anInt3779 = 0;
		this.anInt3783 = this.anInt3782 = this.anInt3787 = 32768;
	}

	@OriginalMember(owner = "client!hj", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt3782 = 32768;
		this.anInt3783 = this.anInt3787 = Class200_Sub1.anIntArray576[arg0 & 0x3FFF];
		this.anInt3784 = Class200_Sub1.lb[arg0 & 0x3FFF];
		this.anInt3786 = -this.anInt3784;
		this.anInt3780 = this.anInt3781 = this.anInt3788 = this.anInt3785 = this.anInt3789 = this.anInt3790 = this.anInt3779 = 0;
	}

	@OriginalMember(owner = "client!hj", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class200_Sub1.anIntArray576[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class200_Sub1.lb[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3783;
		@Pc(17) int local17 = this.anInt3780;
		@Pc(20) int local20 = this.anInt3784;
		@Pc(23) int local23 = this.anInt3781;
		this.anInt3783 = local14 * local5 + this.anInt3786 * local11 >> 15;
		this.anInt3786 = this.anInt3786 * local5 - local14 * local11 >> 15;
		this.anInt3780 = local17 * local5 + this.anInt3790 * local11 >> 15;
		this.anInt3790 = this.anInt3790 * local5 - local17 * local11 >> 15;
		this.anInt3784 = local20 * local5 + this.anInt3787 * local11 >> 15;
		this.anInt3787 = this.anInt3787 * local5 - local20 * local11 >> 15;
		this.anInt3781 = local23 * local5 + this.anInt3779 * local11 >> 15;
		this.anInt3779 = this.anInt3779 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt3781 + (this.anInt3783 * arg0 + this.anInt3780 * arg1 + this.anInt3784 * arg2 >> 15);
		arg3[1] = this.anInt3789 + (this.anInt3788 * arg0 + this.anInt3782 * arg1 + this.anInt3785 * arg2 >> 15);
		arg3[2] = this.anInt3779 + (this.anInt3786 * arg0 + this.anInt3790 * arg1 + this.anInt3787 * arg2 >> 15);
	}
}
