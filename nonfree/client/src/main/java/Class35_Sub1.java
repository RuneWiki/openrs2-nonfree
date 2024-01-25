import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!co", name = "g", descriptor = "I")
	public int anInt994;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "I")
	public int anInt995;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "I")
	public int anInt996;

	@OriginalMember(owner = "client!co", name = "j", descriptor = "I")
	public int anInt997;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "I")
	public int anInt998;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "I")
	public int anInt999;

	@OriginalMember(owner = "client!co", name = "m", descriptor = "I")
	public int anInt1000;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "I")
	public int anInt1001;

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public int anInt1002;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "I")
	public int anInt1003;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "I")
	public int anInt1004;

	@OriginalMember(owner = "client!co", name = "r", descriptor = "I")
	public int anInt1005;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class35_Sub1() {
		this.xa();
	}

	@OriginalMember(owner = "client!co", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class100.anIntArray208[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class100.anIntArray206[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1001;
		@Pc(17) int local17 = this.anInt1002;
		@Pc(20) int local20 = this.anInt994;
		@Pc(23) int local23 = this.anInt1003;
		this.anInt1001 = local14 * local5 + this.anInt997 * local11 >> 15;
		this.anInt997 = this.anInt997 * local5 - local14 * local11 >> 15;
		this.anInt1002 = local17 * local5 + this.anInt1005 * local11 >> 15;
		this.anInt1005 = this.anInt1005 * local5 - local17 * local11 >> 15;
		this.anInt994 = local20 * local5 + this.anInt999 * local11 >> 15;
		this.anInt999 = this.anInt999 * local5 - local20 * local11 >> 15;
		this.anInt1003 = local23 * local5 + this.anInt995 * local11 >> 15;
		this.anInt995 = this.anInt995 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!co", name = "j", descriptor = "(III)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt996 = this.anInt997 = this.anInt1002 = this.anInt1005 = this.anInt994 = this.anInt1004 = 0;
		this.anInt1001 = this.anInt998 = this.anInt999 = 32768;
		this.anInt1003 = arg0;
		this.anInt1000 = arg1;
		this.anInt995 = arg2;
	}

	@OriginalMember(owner = "client!co", name = "ka", descriptor = "(I)V")
	@Override
	public void ka(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class100.anIntArray208[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class100.anIntArray206[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt996;
		@Pc(17) int local17 = this.anInt998;
		@Pc(20) int local20 = this.anInt1004;
		@Pc(23) int local23 = this.anInt1000;
		this.anInt996 = local14 * local5 - this.anInt997 * local11 >> 15;
		this.anInt997 = local14 * local11 + this.anInt997 * local5 >> 15;
		this.anInt998 = local17 * local5 - this.anInt1005 * local11 >> 15;
		this.anInt1005 = local17 * local11 + this.anInt1005 * local5 >> 15;
		this.anInt1004 = local20 * local5 - this.anInt999 * local11 >> 15;
		this.anInt999 = local20 * local11 + this.anInt999 * local5 >> 15;
		this.anInt1000 = local23 * local5 - this.anInt995 * local11 >> 15;
		this.anInt995 = local23 * local11 + this.anInt995 * local5 >> 15;
	}

	@OriginalMember(owner = "client!co", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.anInt996 = this.anInt997 = this.anInt1002 = this.anInt1005 = this.anInt994 = this.anInt1004 = this.anInt1003 = this.anInt1000 = this.anInt995 = 0;
		this.anInt1001 = this.anInt998 = this.anInt999 = 32768;
	}

	@OriginalMember(owner = "client!co", name = "N", descriptor = "(I)V")
	@Override
	public void N(@OriginalArg(0) int arg0) {
		this.anInt1001 = 32768;
		this.anInt998 = this.anInt999 = Class100.anIntArray208[arg0 & 0x3FFF];
		this.anInt1005 = Class100.anIntArray206[arg0 & 0x3FFF];
		this.anInt1004 = -this.anInt1005;
		this.anInt1002 = this.anInt994 = this.anInt1003 = this.anInt996 = this.anInt1000 = this.anInt997 = this.anInt995 = 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1003 + (this.anInt1001 * arg0 + this.anInt1002 * arg1 + this.anInt994 * arg2 >> 15);
		arg3[1] = this.anInt1000 + (this.anInt996 * arg0 + this.anInt998 * arg1 + this.anInt1004 * arg2 >> 15);
		arg3[2] = this.anInt995 + (this.anInt997 * arg0 + this.anInt1005 * arg1 + this.anInt999 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!co", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt998 = 32768;
		this.anInt1001 = this.anInt999 = Class100.anIntArray208[arg0 & 0x3FFF];
		this.anInt994 = Class100.anIntArray206[arg0 & 0x3FFF];
		this.anInt997 = -this.anInt994;
		this.anInt1002 = this.anInt1003 = this.anInt996 = this.anInt1004 = this.anInt1000 = this.anInt1005 = this.anInt995 = 0;
	}

	@OriginalMember(owner = "client!co", name = "za", descriptor = "(Lclient!c;)V")
	@Override
	public void za(@OriginalArg(0) Class35 arg0) {
		@Pc(2) Class35_Sub1 local2 = (Class35_Sub1) arg0;
		this.anInt1001 = local2.anInt1001;
		this.anInt1002 = local2.anInt1002;
		this.anInt994 = local2.anInt994;
		this.anInt1003 = local2.anInt1003;
		this.anInt996 = local2.anInt996;
		this.anInt998 = local2.anInt998;
		this.anInt1004 = local2.anInt1004;
		this.anInt1000 = local2.anInt1000;
		this.anInt997 = local2.anInt997;
		this.anInt1005 = local2.anInt1005;
		this.anInt999 = local2.anInt999;
		this.anInt995 = local2.anInt995;
	}

	@OriginalMember(owner = "client!co", name = "p", descriptor = "(III[I)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1001 * arg0 + this.anInt1002 * arg1 + this.anInt994 * arg2 >> 15;
		arg3[1] = this.anInt996 * arg0 + this.anInt998 * arg1 + this.anInt1004 * arg2 >> 15;
		arg3[2] = this.anInt997 * arg0 + this.anInt1005 * arg1 + this.anInt999 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!co", name = "m", descriptor = "([I)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt1003;
		@Pc(13) int local13 = arg0[1] - this.anInt1000;
		@Pc(20) int local20 = arg0[2] - this.anInt995;
		arg0[0] = this.anInt1001 * local6 + this.anInt996 * local13 + this.anInt997 * local20 >> 15;
		arg0[1] = this.anInt1002 * local6 + this.anInt998 * local13 + this.anInt1005 * local20 >> 15;
		arg0[2] = this.anInt994 * local6 + this.anInt1004 * local13 + this.anInt999 * local20 >> 15;
	}

	@OriginalMember(owner = "client!co", name = "o", descriptor = "(III)V")
	@Override
	public void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1003 += arg0;
		this.anInt1000 += arg1;
		this.anInt995 += arg2;
	}

	@OriginalMember(owner = "client!co", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt999 = 32768;
		this.anInt1001 = this.anInt998 = Class100.anIntArray208[arg0 & 0x3FFF];
		this.anInt996 = Class100.anIntArray206[arg0 & 0x3FFF];
		this.anInt1002 = -this.anInt996;
		this.anInt994 = this.anInt1003 = this.anInt1004 = this.anInt1000 = this.anInt997 = this.anInt1005 = this.anInt995 = 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class35 method2897() {
		@Pc(3) Class35_Sub1 local3 = new Class35_Sub1();
		local3.anInt1001 = this.anInt1001;
		local3.anInt1002 = this.anInt1002;
		local3.anInt994 = this.anInt994;
		local3.anInt1003 = this.anInt1003;
		local3.anInt996 = this.anInt996;
		local3.anInt998 = this.anInt998;
		local3.anInt1004 = this.anInt1004;
		local3.anInt1000 = this.anInt1000;
		local3.anInt997 = this.anInt997;
		local3.anInt1005 = this.anInt1005;
		local3.anInt999 = this.anInt999;
		local3.anInt995 = this.anInt995;
		return local3;
	}

	@OriginalMember(owner = "client!co", name = "s", descriptor = "(IIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class100.anIntArray208[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class100.anIntArray206[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class100.anIntArray208[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class100.anIntArray206[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class100.anIntArray208[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class100.anIntArray206[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt1001 = local17 * local29 + local23 * local47 >> 15;
		this.anInt996 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt997 = local23 * local5 >> 15;
		this.anInt1002 = local5 * local35 >> 15;
		this.anInt998 = local5 * local29 >> 15;
		this.anInt1005 = -local11;
		this.anInt994 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt1004 = local23 * local35 + local17 * local41 >> 15;
		this.anInt999 = local17 * local5 >> 15;
		this.anInt1003 = -arg0 * this.anInt1001 - arg1 * this.anInt1002 - arg2 * this.anInt994 >> 15;
		this.anInt1000 = -arg0 * this.anInt996 - arg1 * this.anInt998 - arg2 * this.anInt1004 >> 15;
		this.anInt995 = -arg0 * this.anInt997 - arg1 * this.anInt1005 - arg2 * this.anInt999 >> 15;
	}
}
