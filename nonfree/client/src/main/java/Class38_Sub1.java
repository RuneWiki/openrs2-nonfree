import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	public int anInt675;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public int anInt676;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	public int anInt677;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	public int anInt678;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
	public int anInt679;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	public int anInt681;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
	public int anInt682;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
	public int anInt683;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
	public int anInt684;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
	public int anInt685;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	public int anInt686;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class38_Sub1() {
		this.method4476();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	@Override
	public void method4470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt677 += arg0;
		this.anInt685 += arg1;
		this.anInt678 += arg2;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt677 + (this.anInt686 * arg0 + this.anInt683 * arg1 + this.anInt679 * arg2 >> 15);
		arg3[1] = this.anInt685 + (this.anInt682 * arg0 + this.anInt681 * arg1 + this.anInt675 * arg2 >> 15);
		arg3[2] = this.anInt678 + (this.anInt680 * arg0 + this.anInt684 * arg1 + this.anInt676 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	@Override
	public void method4479(@OriginalArg(0) int arg0) {
		this.anInt686 = 32768;
		this.anInt681 = this.anInt676 = Class101.anIntArray235[arg0 & 0x3FFF];
		this.anInt684 = Class101.anIntArray234[arg0 & 0x3FFF];
		this.anInt675 = -this.anInt684;
		this.anInt683 = this.anInt679 = this.anInt677 = this.anInt682 = this.anInt685 = this.anInt680 = this.anInt678 = 0;
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
	@Override
	public void method4480(@OriginalArg(0) int arg0) {
		this.anInt681 = 32768;
		this.anInt686 = this.anInt676 = Class101.anIntArray235[arg0 & 0x3FFF];
		this.anInt679 = Class101.anIntArray234[arg0 & 0x3FFF];
		this.anInt680 = -this.anInt679;
		this.anInt683 = this.anInt677 = this.anInt682 = this.anInt675 = this.anInt685 = this.anInt684 = this.anInt678 = 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "()V")
	@Override
	public void method4476() {
		this.anInt682 = this.anInt680 = this.anInt683 = this.anInt684 = this.anInt679 = this.anInt675 = this.anInt677 = this.anInt685 = this.anInt678 = 0;
		this.anInt686 = this.anInt681 = this.anInt676 = 32768;
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
	@Override
	public void method4481(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class101.anIntArray235[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class101.anIntArray234[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt682;
		@Pc(17) int local17 = this.anInt681;
		@Pc(20) int local20 = this.anInt675;
		@Pc(23) int local23 = this.anInt685;
		this.anInt682 = local14 * local5 - this.anInt680 * local11 >> 15;
		this.anInt680 = local14 * local11 + this.anInt680 * local5 >> 15;
		this.anInt681 = local17 * local5 - this.anInt684 * local11 >> 15;
		this.anInt684 = local17 * local11 + this.anInt684 * local5 >> 15;
		this.anInt675 = local20 * local5 - this.anInt676 * local11 >> 15;
		this.anInt676 = local20 * local11 + this.anInt676 * local5 >> 15;
		this.anInt685 = local23 * local5 - this.anInt678 * local11 >> 15;
		this.anInt678 = local23 * local11 + this.anInt678 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V")
	@Override
	public void method4474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt682 = this.anInt680 = this.anInt683 = this.anInt684 = this.anInt679 = this.anInt675 = 0;
		this.anInt686 = this.anInt681 = this.anInt676 = 32768;
		this.anInt677 = arg0;
		this.anInt685 = arg1;
		this.anInt678 = arg2;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	@Override
	public void method4473(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class101.anIntArray235[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class101.anIntArray234[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt686;
		@Pc(17) int local17 = this.anInt683;
		@Pc(20) int local20 = this.anInt679;
		@Pc(23) int local23 = this.anInt677;
		this.anInt686 = local14 * local5 + this.anInt680 * local11 >> 15;
		this.anInt680 = this.anInt680 * local5 - local14 * local11 >> 15;
		this.anInt683 = local17 * local5 + this.anInt684 * local11 >> 15;
		this.anInt684 = this.anInt684 * local5 - local17 * local11 >> 15;
		this.anInt679 = local20 * local5 + this.anInt676 * local11 >> 15;
		this.anInt676 = this.anInt676 * local5 - local20 * local11 >> 15;
		this.anInt677 = local23 * local5 + this.anInt678 * local11 >> 15;
		this.anInt678 = this.anInt678 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	@Override
	public void method4475(@OriginalArg(0) int arg0) {
		this.anInt676 = 32768;
		this.anInt686 = this.anInt681 = Class101.anIntArray235[arg0 & 0x3FFF];
		this.anInt682 = Class101.anIntArray234[arg0 & 0x3FFF];
		this.anInt683 = -this.anInt682;
		this.anInt679 = this.anInt677 = this.anInt675 = this.anInt685 = this.anInt680 = this.anInt684 = this.anInt678 = 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class101.anIntArray235[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class101.anIntArray234[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class101.anIntArray235[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class101.anIntArray234[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class101.anIntArray235[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class101.anIntArray234[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt686 = local17 * local29 + local23 * local47 >> 15;
		this.anInt682 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt680 = local23 * local5 >> 15;
		this.anInt683 = local5 * local35 >> 15;
		this.anInt681 = local5 * local29 >> 15;
		this.anInt684 = -local11;
		this.anInt679 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt675 = local23 * local35 + local17 * local41 >> 15;
		this.anInt676 = local17 * local5 >> 15;
		this.anInt677 = -arg0 * this.anInt686 - arg1 * this.anInt683 - arg2 * this.anInt679 >> 15;
		this.anInt685 = -arg0 * this.anInt682 - arg1 * this.anInt681 - arg2 * this.anInt675 >> 15;
		this.anInt678 = -arg0 * this.anInt680 - arg1 * this.anInt684 - arg2 * this.anInt676 >> 15;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "()Lclient!ch;")
	public Class38_Sub1 method827() {
		@Pc(3) Class38_Sub1 local3 = new Class38_Sub1();
		local3.anInt686 = this.anInt686;
		local3.anInt683 = this.anInt683;
		local3.anInt679 = this.anInt679;
		local3.anInt677 = this.anInt677;
		local3.anInt682 = this.anInt682;
		local3.anInt681 = this.anInt681;
		local3.anInt675 = this.anInt675;
		local3.anInt685 = this.anInt685;
		local3.anInt680 = this.anInt680;
		local3.anInt684 = this.anInt684;
		local3.anInt676 = this.anInt676;
		local3.anInt678 = this.anInt678;
		return local3;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([I)V")
	@Override
	public void method4472(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt677;
		@Pc(13) int local13 = arg0[1] - this.anInt685;
		@Pc(20) int local20 = arg0[2] - this.anInt678;
		arg0[0] = this.anInt686 * local6 + this.anInt682 * local13 + this.anInt680 * local20 >> 15;
		arg0[1] = this.anInt683 * local6 + this.anInt681 * local13 + this.anInt684 * local20 >> 15;
		arg0[2] = this.anInt679 * local6 + this.anInt675 * local13 + this.anInt676 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!jd;)V")
	@Override
	public void method4477(@OriginalArg(0) Class38 arg0) {
		@Pc(2) Class38_Sub1 local2 = (Class38_Sub1) arg0;
		this.anInt686 = local2.anInt686;
		this.anInt683 = local2.anInt683;
		this.anInt679 = local2.anInt679;
		this.anInt677 = local2.anInt677;
		this.anInt682 = local2.anInt682;
		this.anInt681 = local2.anInt681;
		this.anInt675 = local2.anInt675;
		this.anInt685 = local2.anInt685;
		this.anInt680 = local2.anInt680;
		this.anInt684 = local2.anInt684;
		this.anInt676 = local2.anInt676;
		this.anInt678 = local2.anInt678;
	}
}
