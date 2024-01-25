import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	public int anInt1584;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
	public int anInt1585;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
	public int anInt1586;

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
	public int anInt1587;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
	public int anInt1588;

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
	public int anInt1589;

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
	public int anInt1590;

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
	public int anInt1591;

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
	public int anInt1592;

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
	public int anInt1593;

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
	public int anInt1594;

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
	public int anInt1595;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class56_Sub1() {
		this.method4695();
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
	@Override
	public void method4688(@OriginalArg(0) int arg0) {
		this.anInt1591 = 32768;
		this.anInt1593 = this.anInt1594 = Class19.anIntArray21[arg0 & 0x3FFF];
		this.anInt1588 = Class19.anIntArray20[arg0 & 0x3FFF];
		this.anInt1592 = -this.anInt1588;
		this.anInt1590 = this.anInt1584 = this.anInt1586 = this.anInt1589 = this.anInt1587 = this.anInt1585 = this.anInt1595 = 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ug;)V")
	@Override
	public void method4697(@OriginalArg(0) Class56 arg0) {
		@Pc(2) Class56_Sub1 local2 = (Class56_Sub1) arg0;
		this.anInt1593 = local2.anInt1593;
		this.anInt1590 = local2.anInt1590;
		this.anInt1588 = local2.anInt1588;
		this.anInt1584 = local2.anInt1584;
		this.anInt1586 = local2.anInt1586;
		this.anInt1591 = local2.anInt1591;
		this.anInt1589 = local2.anInt1589;
		this.anInt1587 = local2.anInt1587;
		this.anInt1592 = local2.anInt1592;
		this.anInt1585 = local2.anInt1585;
		this.anInt1594 = local2.anInt1594;
		this.anInt1595 = local2.anInt1595;
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class19.anIntArray21[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class19.anIntArray20[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1593;
		@Pc(17) int local17 = this.anInt1590;
		@Pc(20) int local20 = this.anInt1588;
		@Pc(23) int local23 = this.anInt1584;
		this.anInt1593 = local14 * local5 + this.anInt1592 * local11 >> 15;
		this.anInt1592 = this.anInt1592 * local5 - local14 * local11 >> 15;
		this.anInt1590 = local17 * local5 + this.anInt1585 * local11 >> 15;
		this.anInt1585 = this.anInt1585 * local5 - local17 * local11 >> 15;
		this.anInt1588 = local20 * local5 + this.anInt1594 * local11 >> 15;
		this.anInt1594 = this.anInt1594 * local5 - local20 * local11 >> 15;
		this.anInt1584 = local23 * local5 + this.anInt1595 * local11 >> 15;
		this.anInt1595 = this.anInt1595 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)V")
	@Override
	public void method4691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1584 += arg0;
		this.anInt1587 += arg1;
		this.anInt1595 += arg2;
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
	@Override
	public void method4694(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class19.anIntArray21[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class19.anIntArray20[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1586;
		@Pc(17) int local17 = this.anInt1591;
		@Pc(20) int local20 = this.anInt1589;
		@Pc(23) int local23 = this.anInt1587;
		this.anInt1586 = local14 * local5 - this.anInt1592 * local11 >> 15;
		this.anInt1592 = local14 * local11 + this.anInt1592 * local5 >> 15;
		this.anInt1591 = local17 * local5 - this.anInt1585 * local11 >> 15;
		this.anInt1585 = local17 * local11 + this.anInt1585 * local5 >> 15;
		this.anInt1589 = local20 * local5 - this.anInt1594 * local11 >> 15;
		this.anInt1594 = local20 * local11 + this.anInt1594 * local5 >> 15;
		this.anInt1587 = local23 * local5 - this.anInt1595 * local11 >> 15;
		this.anInt1595 = local23 * local11 + this.anInt1595 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lclient!ei;")
	public Class56_Sub1 method1221() {
		@Pc(3) Class56_Sub1 local3 = new Class56_Sub1();
		local3.anInt1593 = this.anInt1593;
		local3.anInt1590 = this.anInt1590;
		local3.anInt1588 = this.anInt1588;
		local3.anInt1584 = this.anInt1584;
		local3.anInt1586 = this.anInt1586;
		local3.anInt1591 = this.anInt1591;
		local3.anInt1589 = this.anInt1589;
		local3.anInt1587 = this.anInt1587;
		local3.anInt1592 = this.anInt1592;
		local3.anInt1585 = this.anInt1585;
		local3.anInt1594 = this.anInt1594;
		local3.anInt1595 = this.anInt1595;
		return local3;
	}

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
	@Override
	public void method4698(@OriginalArg(0) int arg0) {
		this.anInt1594 = 32768;
		this.anInt1593 = this.anInt1591 = Class19.anIntArray21[arg0 & 0x3FFF];
		this.anInt1586 = Class19.anIntArray20[arg0 & 0x3FFF];
		this.anInt1590 = -this.anInt1586;
		this.anInt1588 = this.anInt1584 = this.anInt1589 = this.anInt1587 = this.anInt1592 = this.anInt1585 = this.anInt1595 = 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1584 + (this.anInt1593 * arg0 + this.anInt1590 * arg1 + this.anInt1588 * arg2 >> 15);
		arg3[1] = this.anInt1587 + (this.anInt1586 * arg0 + this.anInt1591 * arg1 + this.anInt1589 * arg2 >> 15);
		arg3[2] = this.anInt1595 + (this.anInt1592 * arg0 + this.anInt1585 * arg1 + this.anInt1594 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	@Override
	public void method4686(@OriginalArg(0) int arg0) {
		this.anInt1593 = 32768;
		this.anInt1591 = this.anInt1594 = Class19.anIntArray21[arg0 & 0x3FFF];
		this.anInt1585 = Class19.anIntArray20[arg0 & 0x3FFF];
		this.anInt1589 = -this.anInt1585;
		this.anInt1590 = this.anInt1588 = this.anInt1584 = this.anInt1586 = this.anInt1587 = this.anInt1592 = this.anInt1595 = 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
	@Override
	public void method4695() {
		this.anInt1586 = this.anInt1592 = this.anInt1590 = this.anInt1585 = this.anInt1588 = this.anInt1589 = this.anInt1584 = this.anInt1587 = this.anInt1595 = 0;
		this.anInt1593 = this.anInt1591 = this.anInt1594 = 32768;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
	@Override
	public void method4683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1586 = this.anInt1592 = this.anInt1590 = this.anInt1585 = this.anInt1588 = this.anInt1589 = 0;
		this.anInt1593 = this.anInt1591 = this.anInt1594 = 32768;
		this.anInt1584 = arg0;
		this.anInt1587 = arg1;
		this.anInt1595 = arg2;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([I)V")
	@Override
	public void method4692(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt1584;
		@Pc(13) int local13 = arg0[1] - this.anInt1587;
		@Pc(20) int local20 = arg0[2] - this.anInt1595;
		arg0[0] = this.anInt1593 * local6 + this.anInt1586 * local13 + this.anInt1592 * local20 >> 15;
		arg0[1] = this.anInt1590 * local6 + this.anInt1591 * local13 + this.anInt1585 * local20 >> 15;
		arg0[2] = this.anInt1588 * local6 + this.anInt1589 * local13 + this.anInt1594 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class19.anIntArray21[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class19.anIntArray20[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class19.anIntArray21[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class19.anIntArray20[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class19.anIntArray21[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class19.anIntArray20[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt1593 = local17 * local29 + local23 * local47 >> 15;
		this.anInt1586 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt1592 = local23 * local5 >> 15;
		this.anInt1590 = local5 * local35 >> 15;
		this.anInt1591 = local5 * local29 >> 15;
		this.anInt1585 = -local11;
		this.anInt1588 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt1589 = local23 * local35 + local17 * local41 >> 15;
		this.anInt1594 = local17 * local5 >> 15;
		this.anInt1584 = -arg0 * this.anInt1593 - arg1 * this.anInt1590 - arg2 * this.anInt1588 >> 15;
		this.anInt1587 = -arg0 * this.anInt1586 - arg1 * this.anInt1591 - arg2 * this.anInt1589 >> 15;
		this.anInt1595 = -arg0 * this.anInt1592 - arg1 * this.anInt1585 - arg2 * this.anInt1594 >> 15;
	}
}
