import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
	public int anInt1500;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
	public int anInt1501;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
	public int anInt1502;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
	public int anInt1503;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
	public int anInt1504;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
	public int anInt1505;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
	public int anInt1506;

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
	public int anInt1507;

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
	public int anInt1508;

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
	public int anInt1509;

	@OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
	public int anInt1510;

	@OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
	public int anInt1511;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	public Class54_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!cr", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1503 = this.anInt1508 = this.anInt1505 = this.anInt1504 = this.anInt1506 = this.anInt1502 = 0;
		this.anInt1500 = this.anInt1511 = this.anInt1507 = 16384;
		this.anInt1510 = arg0;
		this.anInt1501 = arg1;
		this.anInt1509 = arg2;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.anInt1511 = 16384;
		this.anInt1500 = this.anInt1507 = Class6_Sub2_Sub7.anIntArray177[arg0 & 0x3FFF];
		this.anInt1506 = Class6_Sub2_Sub7.anIntArray178[arg0 & 0x3FFF];
		this.anInt1508 = -this.anInt1506;
		this.anInt1505 = this.anInt1510 = this.anInt1503 = this.anInt1502 = this.anInt1501 = this.anInt1504 = this.anInt1509 = 0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1510 + (this.anInt1500 * arg0 + this.anInt1505 * arg1 + this.anInt1506 * arg2 >> 14);
		arg3[1] = this.anInt1501 + (this.anInt1503 * arg0 + this.anInt1511 * arg1 + this.anInt1502 * arg2 >> 14);
		arg3[2] = this.anInt1509 + (this.anInt1508 * arg0 + this.anInt1504 * arg1 + this.anInt1507 * arg2 >> 14);
	}

	@OriginalMember(owner = "client!cr", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt1510;
		@Pc(13) int local13 = arg0[1] - this.anInt1501;
		@Pc(20) int local20 = arg0[2] - this.anInt1509;
		arg0[0] = this.anInt1500 * local6 + this.anInt1503 * local13 + this.anInt1508 * local20 >> 14;
		arg0[1] = this.anInt1505 * local6 + this.anInt1511 * local13 + this.anInt1504 * local20 >> 14;
		arg0[2] = this.anInt1506 * local6 + this.anInt1502 * local13 + this.anInt1507 * local20 >> 14;
	}

	@OriginalMember(owner = "client!cr", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class54 arg0) {
		@Pc(2) Class54_Sub1 local2 = (Class54_Sub1) arg0;
		this.anInt1500 = local2.anInt1500;
		this.anInt1505 = local2.anInt1505;
		this.anInt1506 = local2.anInt1506;
		this.anInt1510 = local2.anInt1510;
		this.anInt1503 = local2.anInt1503;
		this.anInt1511 = local2.anInt1511;
		this.anInt1502 = local2.anInt1502;
		this.anInt1501 = local2.anInt1501;
		this.anInt1508 = local2.anInt1508;
		this.anInt1504 = local2.anInt1504;
		this.anInt1507 = local2.anInt1507;
		this.anInt1509 = local2.anInt1509;
	}

	@OriginalMember(owner = "client!cr", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class6_Sub2_Sub7.anIntArray177[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class6_Sub2_Sub7.anIntArray178[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class6_Sub2_Sub7.anIntArray177[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class6_Sub2_Sub7.anIntArray178[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class6_Sub2_Sub7.anIntArray177[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class6_Sub2_Sub7.anIntArray178[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 14;
		@Pc(47) int local47 = local11 * local35 >> 14;
		this.anInt1500 = local17 * local29 + local23 * local47 >> 14;
		this.anInt1503 = -local17 * local35 + local23 * local41 >> 14;
		this.anInt1508 = local23 * local5 >> 14;
		this.anInt1505 = local5 * local35 >> 14;
		this.anInt1511 = local5 * local29 >> 14;
		this.anInt1504 = -local11;
		this.anInt1506 = -local23 * local29 + local17 * local47 >> 14;
		this.anInt1502 = local23 * local35 + local17 * local41 >> 14;
		this.anInt1507 = local17 * local5 >> 14;
		this.anInt1510 = -arg0 * this.anInt1500 - arg1 * this.anInt1505 - arg2 * this.anInt1506 >> 14;
		this.anInt1501 = -arg0 * this.anInt1503 - arg1 * this.anInt1511 - arg2 * this.anInt1502 >> 14;
		this.anInt1509 = -arg0 * this.anInt1508 - arg1 * this.anInt1504 - arg2 * this.anInt1507 >> 14;
	}

	@OriginalMember(owner = "client!cr", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.anInt1503 = this.anInt1508 = this.anInt1505 = this.anInt1504 = this.anInt1506 = this.anInt1502 = this.anInt1510 = this.anInt1501 = this.anInt1509 = 0;
		this.anInt1500 = this.anInt1511 = this.anInt1507 = 16384;
	}

	@OriginalMember(owner = "client!cr", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class6_Sub2_Sub7.anIntArray177[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class6_Sub2_Sub7.anIntArray178[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1500;
		@Pc(17) int local17 = this.anInt1505;
		@Pc(20) int local20 = this.anInt1506;
		@Pc(23) int local23 = this.anInt1510;
		this.anInt1500 = local14 * local5 + this.anInt1508 * local11 >> 14;
		this.anInt1508 = this.anInt1508 * local5 - local14 * local11 >> 14;
		this.anInt1505 = local17 * local5 + this.anInt1504 * local11 >> 14;
		this.anInt1504 = this.anInt1504 * local5 - local17 * local11 >> 14;
		this.anInt1506 = local20 * local5 + this.anInt1507 * local11 >> 14;
		this.anInt1507 = this.anInt1507 * local5 - local20 * local11 >> 14;
		this.anInt1510 = local23 * local5 + this.anInt1509 * local11 >> 14;
		this.anInt1509 = this.anInt1509 * local5 - local23 * local11 >> 14;
	}

	@OriginalMember(owner = "client!cr", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class6_Sub2_Sub7.anIntArray177[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class6_Sub2_Sub7.anIntArray178[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1503;
		@Pc(17) int local17 = this.anInt1511;
		@Pc(20) int local20 = this.anInt1502;
		@Pc(23) int local23 = this.anInt1501;
		this.anInt1503 = local14 * local5 - this.anInt1508 * local11 >> 14;
		this.anInt1508 = local14 * local11 + this.anInt1508 * local5 >> 14;
		this.anInt1511 = local17 * local5 - this.anInt1504 * local11 >> 14;
		this.anInt1504 = local17 * local11 + this.anInt1504 * local5 >> 14;
		this.anInt1502 = local20 * local5 - this.anInt1507 * local11 >> 14;
		this.anInt1507 = local20 * local11 + this.anInt1507 * local5 >> 14;
		this.anInt1501 = local23 * local5 - this.anInt1509 * local11 >> 14;
		this.anInt1509 = local23 * local11 + this.anInt1509 * local5 >> 14;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class54 method7693() {
		@Pc(3) Class54_Sub1 local3 = new Class54_Sub1();
		local3.anInt1500 = this.anInt1500;
		local3.anInt1505 = this.anInt1505;
		local3.anInt1506 = this.anInt1506;
		local3.anInt1510 = this.anInt1510;
		local3.anInt1503 = this.anInt1503;
		local3.anInt1511 = this.anInt1511;
		local3.anInt1502 = this.anInt1502;
		local3.anInt1501 = this.anInt1501;
		local3.anInt1508 = this.anInt1508;
		local3.anInt1504 = this.anInt1504;
		local3.anInt1507 = this.anInt1507;
		local3.anInt1509 = this.anInt1509;
		return local3;
	}

	@OriginalMember(owner = "client!cr", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.anInt1500 = 16384;
		this.anInt1511 = this.anInt1507 = Class6_Sub2_Sub7.anIntArray177[arg0 & 0x3FFF];
		this.anInt1504 = Class6_Sub2_Sub7.anIntArray178[arg0 & 0x3FFF];
		this.anInt1502 = -this.anInt1504;
		this.anInt1505 = this.anInt1506 = this.anInt1510 = this.anInt1503 = this.anInt1501 = this.anInt1508 = this.anInt1509 = 0;
	}

	@OriginalMember(owner = "client!cr", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1510 += arg0;
		this.anInt1501 += arg1;
		this.anInt1509 += arg2;
	}

	@OriginalMember(owner = "client!cr", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt1507 = 16384;
		this.anInt1500 = this.anInt1511 = Class6_Sub2_Sub7.anIntArray177[arg0 & 0x3FFF];
		this.anInt1503 = Class6_Sub2_Sub7.anIntArray178[arg0 & 0x3FFF];
		this.anInt1505 = -this.anInt1503;
		this.anInt1506 = this.anInt1510 = this.anInt1502 = this.anInt1501 = this.anInt1508 = this.anInt1504 = this.anInt1509 = 0;
	}

	@OriginalMember(owner = "client!cr", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1500 * arg0 + this.anInt1505 * arg1 + this.anInt1506 * arg2 >> 14;
		arg3[1] = this.anInt1503 * arg0 + this.anInt1511 * arg1 + this.anInt1502 * arg2 >> 14;
		arg3[2] = this.anInt1508 * arg0 + this.anInt1504 * arg1 + this.anInt1507 * arg2 >> 14;
	}
}
