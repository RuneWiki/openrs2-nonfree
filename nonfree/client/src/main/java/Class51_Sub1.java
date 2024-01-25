import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
	public int anInt1715;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
	public int anInt1716;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
	public int anInt1717;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
	public int anInt1718;

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
	public int anInt1719;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
	public int anInt1720;

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
	public int anInt1721;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
	public int anInt1722;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
	public int anInt1724;

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
	public int anInt1725;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
	public int anInt1726;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class51_Sub1() {
		this.method3560();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
	@Override
	public void method3548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1723 = this.anInt1724 = this.anInt1726 = this.anInt1721 = this.anInt1716 = this.anInt1719 = 0;
		this.anInt1722 = this.anInt1715 = this.anInt1718 = 32768;
		this.anInt1720 = arg0;
		this.anInt1725 = arg1;
		this.anInt1717 = arg2;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([I)V")
	@Override
	public void method3553(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt1720;
		@Pc(13) int local13 = arg0[1] - this.anInt1725;
		@Pc(20) int local20 = arg0[2] - this.anInt1717;
		arg0[0] = this.anInt1722 * local6 + this.anInt1723 * local13 + this.anInt1724 * local20 >> 15;
		arg0[1] = this.anInt1726 * local6 + this.anInt1715 * local13 + this.anInt1721 * local20 >> 15;
		arg0[2] = this.anInt1716 * local6 + this.anInt1719 * local13 + this.anInt1718 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
	@Override
	public void method3558(@OriginalArg(0) int arg0) {
		this.anInt1722 = 32768;
		this.anInt1715 = this.anInt1718 = Class14_Sub3_Sub34.anIntArray546[arg0 & 0x3FFF];
		this.anInt1721 = Class14_Sub3_Sub34.anIntArray547[arg0 & 0x3FFF];
		this.anInt1719 = -this.anInt1721;
		this.anInt1726 = this.anInt1716 = this.anInt1720 = this.anInt1723 = this.anInt1725 = this.anInt1724 = this.anInt1717 = 0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class14_Sub3_Sub34.anIntArray546[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class14_Sub3_Sub34.anIntArray547[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class14_Sub3_Sub34.anIntArray546[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class14_Sub3_Sub34.anIntArray547[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class14_Sub3_Sub34.anIntArray546[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class14_Sub3_Sub34.anIntArray547[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt1722 = local17 * local29 + local23 * local47 >> 15;
		this.anInt1723 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt1724 = local23 * local5 >> 15;
		this.anInt1726 = local5 * local35 >> 15;
		this.anInt1715 = local5 * local29 >> 15;
		this.anInt1721 = -local11;
		this.anInt1716 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt1719 = local23 * local35 + local17 * local41 >> 15;
		this.anInt1718 = local17 * local5 >> 15;
		this.anInt1720 = -arg0 * this.anInt1722 - arg1 * this.anInt1726 - arg2 * this.anInt1716 >> 15;
		this.anInt1725 = -arg0 * this.anInt1723 - arg1 * this.anInt1715 - arg2 * this.anInt1719 >> 15;
		this.anInt1717 = -arg0 * this.anInt1724 - arg1 * this.anInt1721 - arg2 * this.anInt1718 >> 15;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "()V")
	@Override
	public void method3560() {
		this.anInt1723 = this.anInt1724 = this.anInt1726 = this.anInt1721 = this.anInt1716 = this.anInt1719 = this.anInt1720 = this.anInt1725 = this.anInt1717 = 0;
		this.anInt1722 = this.anInt1715 = this.anInt1718 = 32768;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	@Override
	public void method3549(@OriginalArg(0) int arg0) {
		this.anInt1718 = 32768;
		this.anInt1722 = this.anInt1715 = Class14_Sub3_Sub34.anIntArray546[arg0 & 0x3FFF];
		this.anInt1723 = Class14_Sub3_Sub34.anIntArray547[arg0 & 0x3FFF];
		this.anInt1726 = -this.anInt1723;
		this.anInt1716 = this.anInt1720 = this.anInt1719 = this.anInt1725 = this.anInt1724 = this.anInt1721 = this.anInt1717 = 0;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "()Lclient!ek;")
	public Class51_Sub1 method1766() {
		@Pc(3) Class51_Sub1 local3 = new Class51_Sub1();
		local3.anInt1722 = this.anInt1722;
		local3.anInt1726 = this.anInt1726;
		local3.anInt1716 = this.anInt1716;
		local3.anInt1720 = this.anInt1720;
		local3.anInt1723 = this.anInt1723;
		local3.anInt1715 = this.anInt1715;
		local3.anInt1719 = this.anInt1719;
		local3.anInt1725 = this.anInt1725;
		local3.anInt1724 = this.anInt1724;
		local3.anInt1721 = this.anInt1721;
		local3.anInt1718 = this.anInt1718;
		local3.anInt1717 = this.anInt1717;
		return local3;
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
	@Override
	public void method3559(@OriginalArg(0) int arg0) {
		this.anInt1715 = 32768;
		this.anInt1722 = this.anInt1718 = Class14_Sub3_Sub34.anIntArray546[arg0 & 0x3FFF];
		this.anInt1716 = Class14_Sub3_Sub34.anIntArray547[arg0 & 0x3FFF];
		this.anInt1724 = -this.anInt1716;
		this.anInt1726 = this.anInt1720 = this.anInt1723 = this.anInt1719 = this.anInt1725 = this.anInt1721 = this.anInt1717 = 0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!pg;)V")
	@Override
	public void method3556(@OriginalArg(0) Class51 arg0) {
		@Pc(2) Class51_Sub1 local2 = (Class51_Sub1) arg0;
		this.anInt1722 = local2.anInt1722;
		this.anInt1726 = local2.anInt1726;
		this.anInt1716 = local2.anInt1716;
		this.anInt1720 = local2.anInt1720;
		this.anInt1723 = local2.anInt1723;
		this.anInt1715 = local2.anInt1715;
		this.anInt1719 = local2.anInt1719;
		this.anInt1725 = local2.anInt1725;
		this.anInt1724 = local2.anInt1724;
		this.anInt1721 = local2.anInt1721;
		this.anInt1718 = local2.anInt1718;
		this.anInt1717 = local2.anInt1717;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
	@Override
	public void method3557(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class14_Sub3_Sub34.anIntArray546[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class14_Sub3_Sub34.anIntArray547[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1723;
		@Pc(17) int local17 = this.anInt1715;
		@Pc(20) int local20 = this.anInt1719;
		@Pc(23) int local23 = this.anInt1725;
		this.anInt1723 = local14 * local5 - this.anInt1724 * local11 >> 15;
		this.anInt1724 = local14 * local11 + this.anInt1724 * local5 >> 15;
		this.anInt1715 = local17 * local5 - this.anInt1721 * local11 >> 15;
		this.anInt1721 = local17 * local11 + this.anInt1721 * local5 >> 15;
		this.anInt1719 = local20 * local5 - this.anInt1718 * local11 >> 15;
		this.anInt1718 = local20 * local11 + this.anInt1718 * local5 >> 15;
		this.anInt1725 = local23 * local5 - this.anInt1717 * local11 >> 15;
		this.anInt1717 = local23 * local11 + this.anInt1717 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	@Override
	public void method3554(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class14_Sub3_Sub34.anIntArray546[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class14_Sub3_Sub34.anIntArray547[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1722;
		@Pc(17) int local17 = this.anInt1726;
		@Pc(20) int local20 = this.anInt1716;
		@Pc(23) int local23 = this.anInt1720;
		this.anInt1722 = local14 * local5 + this.anInt1724 * local11 >> 15;
		this.anInt1724 = this.anInt1724 * local5 - local14 * local11 >> 15;
		this.anInt1726 = local17 * local5 + this.anInt1721 * local11 >> 15;
		this.anInt1721 = this.anInt1721 * local5 - local17 * local11 >> 15;
		this.anInt1716 = local20 * local5 + this.anInt1718 * local11 >> 15;
		this.anInt1718 = this.anInt1718 * local5 - local20 * local11 >> 15;
		this.anInt1720 = local23 * local5 + this.anInt1717 * local11 >> 15;
		this.anInt1717 = this.anInt1717 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)V")
	@Override
	public void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1720 += arg0;
		this.anInt1725 += arg1;
		this.anInt1717 += arg2;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1720 + (this.anInt1722 * arg0 + this.anInt1726 * arg1 + this.anInt1716 * arg2 >> 15);
		arg3[1] = this.anInt1725 + (this.anInt1723 * arg0 + this.anInt1715 * arg1 + this.anInt1719 * arg2 >> 15);
		arg3[2] = this.anInt1717 + (this.anInt1724 * arg0 + this.anInt1721 * arg1 + this.anInt1718 * arg2 >> 15);
	}
}
