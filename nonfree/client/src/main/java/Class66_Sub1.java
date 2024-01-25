import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
	public int anInt1544;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
	public int anInt1545;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	public int anInt1546;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public int anInt1547;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
	public int anInt1548;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public int anInt1549;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
	public int anInt1550;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	public int anInt1551;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
	public int anInt1552;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
	public int anInt1553;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	public int anInt1554;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public int anInt1555;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class66_Sub1() {
		this.method5812();
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
	@Override
	public void method5821(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class187.anIntArray570[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class187.anIntArray571[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1549;
		@Pc(17) int local17 = this.anInt1546;
		@Pc(20) int local20 = this.anInt1551;
		@Pc(23) int local23 = this.anInt1544;
		this.anInt1549 = local14 * local5 + this.anInt1553 * local11 >> 15;
		this.anInt1553 = this.anInt1553 * local5 - local14 * local11 >> 15;
		this.anInt1546 = local17 * local5 + this.anInt1545 * local11 >> 15;
		this.anInt1545 = this.anInt1545 * local5 - local17 * local11 >> 15;
		this.anInt1551 = local20 * local5 + this.anInt1548 * local11 >> 15;
		this.anInt1548 = this.anInt1548 * local5 - local20 * local11 >> 15;
		this.anInt1544 = local23 * local5 + this.anInt1552 * local11 >> 15;
		this.anInt1552 = this.anInt1552 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "()Lclient!fa;")
	public Class66_Sub1 method1499() {
		@Pc(3) Class66_Sub1 local3 = new Class66_Sub1();
		local3.anInt1549 = this.anInt1549;
		local3.anInt1546 = this.anInt1546;
		local3.anInt1551 = this.anInt1551;
		local3.anInt1544 = this.anInt1544;
		local3.anInt1554 = this.anInt1554;
		local3.anInt1547 = this.anInt1547;
		local3.anInt1550 = this.anInt1550;
		local3.anInt1555 = this.anInt1555;
		local3.anInt1553 = this.anInt1553;
		local3.anInt1545 = this.anInt1545;
		local3.anInt1548 = this.anInt1548;
		local3.anInt1552 = this.anInt1552;
		return local3;
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
	@Override
	public void method5826(@OriginalArg(0) int arg0) {
		this.anInt1547 = 32768;
		this.anInt1549 = this.anInt1548 = Class187.anIntArray570[arg0 & 0x3FFF];
		this.anInt1551 = Class187.anIntArray571[arg0 & 0x3FFF];
		this.anInt1553 = -this.anInt1551;
		this.anInt1546 = this.anInt1544 = this.anInt1554 = this.anInt1550 = this.anInt1555 = this.anInt1545 = this.anInt1552 = 0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1544 + (this.anInt1549 * arg0 + this.anInt1546 * arg1 + this.anInt1551 * arg2 >> 15);
		arg3[1] = this.anInt1555 + (this.anInt1554 * arg0 + this.anInt1547 * arg1 + this.anInt1550 * arg2 >> 15);
		arg3[2] = this.anInt1552 + (this.anInt1553 * arg0 + this.anInt1545 * arg1 + this.anInt1548 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
	@Override
	public void method5812() {
		this.anInt1554 = this.anInt1553 = this.anInt1546 = this.anInt1545 = this.anInt1551 = this.anInt1550 = this.anInt1544 = this.anInt1555 = this.anInt1552 = 0;
		this.anInt1549 = this.anInt1547 = this.anInt1548 = 32768;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	@Override
	public void method5814(@OriginalArg(0) int arg0) {
		this.anInt1549 = 32768;
		this.anInt1547 = this.anInt1548 = Class187.anIntArray570[arg0 & 0x3FFF];
		this.anInt1545 = Class187.anIntArray571[arg0 & 0x3FFF];
		this.anInt1550 = -this.anInt1545;
		this.anInt1546 = this.anInt1551 = this.anInt1544 = this.anInt1554 = this.anInt1555 = this.anInt1553 = this.anInt1552 = 0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ve;)V")
	@Override
	public void method5827(@OriginalArg(0) Class66 arg0) {
		@Pc(2) Class66_Sub1 local2 = (Class66_Sub1) arg0;
		this.anInt1549 = local2.anInt1549;
		this.anInt1546 = local2.anInt1546;
		this.anInt1551 = local2.anInt1551;
		this.anInt1544 = local2.anInt1544;
		this.anInt1554 = local2.anInt1554;
		this.anInt1547 = local2.anInt1547;
		this.anInt1550 = local2.anInt1550;
		this.anInt1555 = local2.anInt1555;
		this.anInt1553 = local2.anInt1553;
		this.anInt1545 = local2.anInt1545;
		this.anInt1548 = local2.anInt1548;
		this.anInt1552 = local2.anInt1552;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	@Override
	public void method5818(@OriginalArg(0) int arg0) {
		this.anInt1548 = 32768;
		this.anInt1549 = this.anInt1547 = Class187.anIntArray570[arg0 & 0x3FFF];
		this.anInt1554 = Class187.anIntArray571[arg0 & 0x3FFF];
		this.anInt1546 = -this.anInt1554;
		this.anInt1551 = this.anInt1544 = this.anInt1550 = this.anInt1555 = this.anInt1553 = this.anInt1545 = this.anInt1552 = 0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([I)V")
	@Override
	public void method5813(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt1544;
		@Pc(13) int local13 = arg0[1] - this.anInt1555;
		@Pc(20) int local20 = arg0[2] - this.anInt1552;
		arg0[0] = this.anInt1549 * local6 + this.anInt1554 * local13 + this.anInt1553 * local20 >> 15;
		arg0[1] = this.anInt1546 * local6 + this.anInt1547 * local13 + this.anInt1545 * local20 >> 15;
		arg0[2] = this.anInt1551 * local6 + this.anInt1550 * local13 + this.anInt1548 * local20 >> 15;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	@Override
	public void method5822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1554 = this.anInt1553 = this.anInt1546 = this.anInt1545 = this.anInt1551 = this.anInt1550 = 0;
		this.anInt1549 = this.anInt1547 = this.anInt1548 = 32768;
		this.anInt1544 = arg0;
		this.anInt1555 = arg1;
		this.anInt1552 = arg2;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	@Override
	public void method5815(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class187.anIntArray570[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class187.anIntArray571[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1554;
		@Pc(17) int local17 = this.anInt1547;
		@Pc(20) int local20 = this.anInt1550;
		@Pc(23) int local23 = this.anInt1555;
		this.anInt1554 = local14 * local5 - this.anInt1553 * local11 >> 15;
		this.anInt1553 = local14 * local11 + this.anInt1553 * local5 >> 15;
		this.anInt1547 = local17 * local5 - this.anInt1545 * local11 >> 15;
		this.anInt1545 = local17 * local11 + this.anInt1545 * local5 >> 15;
		this.anInt1550 = local20 * local5 - this.anInt1548 * local11 >> 15;
		this.anInt1548 = local20 * local11 + this.anInt1548 * local5 >> 15;
		this.anInt1555 = local23 * local5 - this.anInt1552 * local11 >> 15;
		this.anInt1552 = local23 * local11 + this.anInt1552 * local5 >> 15;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class187.anIntArray570[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class187.anIntArray571[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class187.anIntArray570[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class187.anIntArray571[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class187.anIntArray570[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class187.anIntArray571[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt1549 = local17 * local29 + local23 * local47 >> 15;
		this.anInt1554 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt1553 = local23 * local5 >> 15;
		this.anInt1546 = local5 * local35 >> 15;
		this.anInt1547 = local5 * local29 >> 15;
		this.anInt1545 = -local11;
		this.anInt1551 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt1550 = local23 * local35 + local17 * local41 >> 15;
		this.anInt1548 = local17 * local5 >> 15;
		this.anInt1544 = -arg0 * this.anInt1549 - arg1 * this.anInt1546 - arg2 * this.anInt1551 >> 15;
		this.anInt1555 = -arg0 * this.anInt1554 - arg1 * this.anInt1547 - arg2 * this.anInt1550 >> 15;
		this.anInt1552 = -arg0 * this.anInt1553 - arg1 * this.anInt1545 - arg2 * this.anInt1548 >> 15;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V")
	@Override
	public void method5825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1544 += arg0;
		this.anInt1555 += arg1;
		this.anInt1552 += arg2;
	}
}
