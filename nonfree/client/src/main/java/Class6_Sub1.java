import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!af", name = "d", descriptor = "I")
	public int anInt93;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "I")
	public int anInt94;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public int anInt95;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public int anInt96;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "I")
	public int anInt97;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	public int anInt98;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public int anInt99;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public int anInt100;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	public int anInt101;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "I")
	public int anInt102;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "I")
	public int anInt103;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	public int anInt104;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class6_Sub1() {
		this.v();
	}

	@OriginalMember(owner = "client!af", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt95 * arg0 + this.anInt102 * arg1 + this.anInt93 * arg2 >> 15;
		arg3[1] = this.anInt97 * arg0 + this.anInt101 * arg1 + this.anInt98 * arg2 >> 15;
		arg3[2] = this.anInt96 * arg0 + this.anInt99 * arg1 + this.anInt103 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt94 + (this.anInt95 * arg0 + this.anInt102 * arg1 + this.anInt93 * arg2 >> 15);
		arg3[1] = this.anInt104 + (this.anInt97 * arg0 + this.anInt101 * arg1 + this.anInt98 * arg2 >> 15);
		arg3[2] = this.anInt100 + (this.anInt96 * arg0 + this.anInt99 * arg1 + this.anInt103 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.anInt95 = 32768;
		this.anInt101 = this.anInt103 = Class229.anIntArray536[arg0 & 0x3FFF];
		this.anInt99 = Class229.anIntArray537[arg0 & 0x3FFF];
		this.anInt98 = -this.anInt99;
		this.anInt102 = this.anInt93 = this.anInt94 = this.anInt97 = this.anInt104 = this.anInt96 = this.anInt100 = 0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class6 method4655() {
		@Pc(3) Class6_Sub1 local3 = new Class6_Sub1();
		local3.anInt95 = this.anInt95;
		local3.anInt102 = this.anInt102;
		local3.anInt93 = this.anInt93;
		local3.anInt94 = this.anInt94;
		local3.anInt97 = this.anInt97;
		local3.anInt101 = this.anInt101;
		local3.anInt98 = this.anInt98;
		local3.anInt104 = this.anInt104;
		local3.anInt96 = this.anInt96;
		local3.anInt99 = this.anInt99;
		local3.anInt103 = this.anInt103;
		local3.anInt100 = this.anInt100;
		return local3;
	}

	@OriginalMember(owner = "client!af", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class6 arg0) {
		@Pc(2) Class6_Sub1 local2 = (Class6_Sub1) arg0;
		this.anInt95 = local2.anInt95;
		this.anInt102 = local2.anInt102;
		this.anInt93 = local2.anInt93;
		this.anInt94 = local2.anInt94;
		this.anInt97 = local2.anInt97;
		this.anInt101 = local2.anInt101;
		this.anInt98 = local2.anInt98;
		this.anInt104 = local2.anInt104;
		this.anInt96 = local2.anInt96;
		this.anInt99 = local2.anInt99;
		this.anInt103 = local2.anInt103;
		this.anInt100 = local2.anInt100;
	}

	@OriginalMember(owner = "client!af", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt97 = this.anInt96 = this.anInt102 = this.anInt99 = this.anInt93 = this.anInt98 = 0;
		this.anInt95 = this.anInt101 = this.anInt103 = 32768;
		this.anInt94 = arg0;
		this.anInt104 = arg1;
		this.anInt100 = arg2;
	}

	@OriginalMember(owner = "client!af", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt94;
		@Pc(13) int local13 = arg0[1] - this.anInt104;
		@Pc(20) int local20 = arg0[2] - this.anInt100;
		arg0[0] = this.anInt95 * local6 + this.anInt97 * local13 + this.anInt96 * local20 >> 15;
		arg0[1] = this.anInt102 * local6 + this.anInt101 * local13 + this.anInt99 * local20 >> 15;
		arg0[2] = this.anInt93 * local6 + this.anInt98 * local13 + this.anInt103 * local20 >> 15;
	}

	@OriginalMember(owner = "client!af", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class229.anIntArray536[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class229.anIntArray537[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt95;
		@Pc(17) int local17 = this.anInt102;
		@Pc(20) int local20 = this.anInt93;
		@Pc(23) int local23 = this.anInt94;
		this.anInt95 = local14 * local5 + this.anInt96 * local11 >> 15;
		this.anInt96 = this.anInt96 * local5 - local14 * local11 >> 15;
		this.anInt102 = local17 * local5 + this.anInt99 * local11 >> 15;
		this.anInt99 = this.anInt99 * local5 - local17 * local11 >> 15;
		this.anInt93 = local20 * local5 + this.anInt103 * local11 >> 15;
		this.anInt103 = this.anInt103 * local5 - local20 * local11 >> 15;
		this.anInt94 = local23 * local5 + this.anInt100 * local11 >> 15;
		this.anInt100 = this.anInt100 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!af", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.anInt97 = this.anInt96 = this.anInt102 = this.anInt99 = this.anInt93 = this.anInt98 = this.anInt94 = this.anInt104 = this.anInt100 = 0;
		this.anInt95 = this.anInt101 = this.anInt103 = 32768;
	}

	@OriginalMember(owner = "client!af", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.anInt103 = 32768;
		this.anInt95 = this.anInt101 = Class229.anIntArray536[arg0 & 0x3FFF];
		this.anInt97 = Class229.anIntArray537[arg0 & 0x3FFF];
		this.anInt102 = -this.anInt97;
		this.anInt93 = this.anInt94 = this.anInt98 = this.anInt104 = this.anInt96 = this.anInt99 = this.anInt100 = 0;
	}

	@OriginalMember(owner = "client!af", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt94 += arg0;
		this.anInt104 += arg1;
		this.anInt100 += arg2;
	}

	@OriginalMember(owner = "client!af", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.anInt101 = 32768;
		this.anInt95 = this.anInt103 = Class229.anIntArray536[arg0 & 0x3FFF];
		this.anInt93 = Class229.anIntArray537[arg0 & 0x3FFF];
		this.anInt96 = -this.anInt93;
		this.anInt102 = this.anInt94 = this.anInt97 = this.anInt98 = this.anInt104 = this.anInt99 = this.anInt100 = 0;
	}

	@OriginalMember(owner = "client!af", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class229.anIntArray536[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class229.anIntArray537[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class229.anIntArray536[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class229.anIntArray537[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class229.anIntArray536[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class229.anIntArray537[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt95 = local17 * local29 + local23 * local47 >> 15;
		this.anInt97 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt96 = local23 * local5 >> 15;
		this.anInt102 = local5 * local35 >> 15;
		this.anInt101 = local5 * local29 >> 15;
		this.anInt99 = -local11;
		this.anInt93 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt98 = local23 * local35 + local17 * local41 >> 15;
		this.anInt103 = local17 * local5 >> 15;
		this.anInt94 = -arg0 * this.anInt95 - arg1 * this.anInt102 - arg2 * this.anInt93 >> 15;
		this.anInt104 = -arg0 * this.anInt97 - arg1 * this.anInt101 - arg2 * this.anInt98 >> 15;
		this.anInt100 = -arg0 * this.anInt96 - arg1 * this.anInt99 - arg2 * this.anInt103 >> 15;
	}

	@OriginalMember(owner = "client!af", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class229.anIntArray536[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class229.anIntArray537[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt97;
		@Pc(17) int local17 = this.anInt101;
		@Pc(20) int local20 = this.anInt98;
		@Pc(23) int local23 = this.anInt104;
		this.anInt97 = local14 * local5 - this.anInt96 * local11 >> 15;
		this.anInt96 = local14 * local11 + this.anInt96 * local5 >> 15;
		this.anInt101 = local17 * local5 - this.anInt99 * local11 >> 15;
		this.anInt99 = local17 * local11 + this.anInt99 * local5 >> 15;
		this.anInt98 = local20 * local5 - this.anInt103 * local11 >> 15;
		this.anInt103 = local20 * local11 + this.anInt103 * local5 >> 15;
		this.anInt104 = local23 * local5 - this.anInt100 * local11 >> 15;
		this.anInt100 = local23 * local11 + this.anInt100 * local5 >> 15;
	}
}
