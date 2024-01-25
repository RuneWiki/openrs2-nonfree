import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
	public int anInt5518;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
	public int anInt5519;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
	public int anInt5520;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	public int anInt5521;

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
	public int anInt5522;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
	public int anInt5523;

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
	public int anInt5524;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
	public int anInt5525;

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
	public int anInt5526;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
	public int anInt5527;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
	public int anInt5528;

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
	public int anInt5529;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
	public Class35_Sub1() {
		this.xa();
	}

	@OriginalMember(owner = "client!pu", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class162.anIntArray387[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class162.anIntArray388[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt5519;
		@Pc(17) int local17 = this.anInt5522;
		@Pc(20) int local20 = this.anInt5527;
		@Pc(23) int local23 = this.anInt5523;
		this.anInt5519 = local14 * local5 + this.anInt5529 * local11 >> 15;
		this.anInt5529 = this.anInt5529 * local5 - local14 * local11 >> 15;
		this.anInt5522 = local17 * local5 + this.anInt5526 * local11 >> 15;
		this.anInt5526 = this.anInt5526 * local5 - local17 * local11 >> 15;
		this.anInt5527 = local20 * local5 + this.anInt5520 * local11 >> 15;
		this.anInt5520 = this.anInt5520 * local5 - local20 * local11 >> 15;
		this.anInt5523 = local23 * local5 + this.anInt5521 * local11 >> 15;
		this.anInt5521 = this.anInt5521 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt5523 + (this.anInt5519 * arg0 + this.anInt5522 * arg1 + this.anInt5527 * arg2 >> 15);
		arg3[1] = this.anInt5525 + (this.anInt5524 * arg0 + this.anInt5518 * arg1 + this.anInt5528 * arg2 >> 15);
		arg3[2] = this.anInt5521 + (this.anInt5529 * arg0 + this.anInt5526 * arg1 + this.anInt5520 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class35 method5043() {
		@Pc(3) Class35_Sub1 local3 = new Class35_Sub1();
		local3.anInt5519 = this.anInt5519;
		local3.anInt5522 = this.anInt5522;
		local3.anInt5527 = this.anInt5527;
		local3.anInt5523 = this.anInt5523;
		local3.anInt5524 = this.anInt5524;
		local3.anInt5518 = this.anInt5518;
		local3.anInt5528 = this.anInt5528;
		local3.anInt5525 = this.anInt5525;
		local3.anInt5529 = this.anInt5529;
		local3.anInt5526 = this.anInt5526;
		local3.anInt5520 = this.anInt5520;
		local3.anInt5521 = this.anInt5521;
		return local3;
	}

	@OriginalMember(owner = "client!pu", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt5518 = 32768;
		this.anInt5519 = this.anInt5520 = Class162.anIntArray387[arg0 & 0x3FFF];
		this.anInt5527 = Class162.anIntArray388[arg0 & 0x3FFF];
		this.anInt5529 = -this.anInt5527;
		this.anInt5522 = this.anInt5523 = this.anInt5524 = this.anInt5528 = this.anInt5525 = this.anInt5526 = this.anInt5521 = 0;
	}

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "(IIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class162.anIntArray387[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class162.anIntArray388[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class162.anIntArray387[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class162.anIntArray388[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class162.anIntArray387[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class162.anIntArray388[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt5519 = local17 * local29 + local23 * local47 >> 15;
		this.anInt5524 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt5529 = local23 * local5 >> 15;
		this.anInt5522 = local5 * local35 >> 15;
		this.anInt5518 = local5 * local29 >> 15;
		this.anInt5526 = -local11;
		this.anInt5527 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt5528 = local23 * local35 + local17 * local41 >> 15;
		this.anInt5520 = local17 * local5 >> 15;
		this.anInt5523 = -arg0 * this.anInt5519 - arg1 * this.anInt5522 - arg2 * this.anInt5527 >> 15;
		this.anInt5525 = -arg0 * this.anInt5524 - arg1 * this.anInt5518 - arg2 * this.anInt5528 >> 15;
		this.anInt5521 = -arg0 * this.anInt5529 - arg1 * this.anInt5526 - arg2 * this.anInt5520 >> 15;
	}

	@OriginalMember(owner = "client!pu", name = "ka", descriptor = "(I)V")
	@Override
	public void ka(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class162.anIntArray387[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class162.anIntArray388[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt5524;
		@Pc(17) int local17 = this.anInt5518;
		@Pc(20) int local20 = this.anInt5528;
		@Pc(23) int local23 = this.anInt5525;
		this.anInt5524 = local14 * local5 - this.anInt5529 * local11 >> 15;
		this.anInt5529 = local14 * local11 + this.anInt5529 * local5 >> 15;
		this.anInt5518 = local17 * local5 - this.anInt5526 * local11 >> 15;
		this.anInt5526 = local17 * local11 + this.anInt5526 * local5 >> 15;
		this.anInt5528 = local20 * local5 - this.anInt5520 * local11 >> 15;
		this.anInt5520 = local20 * local11 + this.anInt5520 * local5 >> 15;
		this.anInt5525 = local23 * local5 - this.anInt5521 * local11 >> 15;
		this.anInt5521 = local23 * local11 + this.anInt5521 * local5 >> 15;
	}

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "([I)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt5523;
		@Pc(13) int local13 = arg0[1] - this.anInt5525;
		@Pc(20) int local20 = arg0[2] - this.anInt5521;
		arg0[0] = this.anInt5519 * local6 + this.anInt5524 * local13 + this.anInt5529 * local20 >> 15;
		arg0[1] = this.anInt5522 * local6 + this.anInt5518 * local13 + this.anInt5526 * local20 >> 15;
		arg0[2] = this.anInt5527 * local6 + this.anInt5528 * local13 + this.anInt5520 * local20 >> 15;
	}

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "(III)V")
	@Override
	public void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5523 += arg0;
		this.anInt5525 += arg1;
		this.anInt5521 += arg2;
	}

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "(III)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5524 = this.anInt5529 = this.anInt5522 = this.anInt5526 = this.anInt5527 = this.anInt5528 = 0;
		this.anInt5519 = this.anInt5518 = this.anInt5520 = 32768;
		this.anInt5523 = arg0;
		this.anInt5525 = arg1;
		this.anInt5521 = arg2;
	}

	@OriginalMember(owner = "client!pu", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt5520 = 32768;
		this.anInt5519 = this.anInt5518 = Class162.anIntArray387[arg0 & 0x3FFF];
		this.anInt5524 = Class162.anIntArray388[arg0 & 0x3FFF];
		this.anInt5522 = -this.anInt5524;
		this.anInt5527 = this.anInt5523 = this.anInt5528 = this.anInt5525 = this.anInt5529 = this.anInt5526 = this.anInt5521 = 0;
	}

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "(III[I)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt5519 * arg0 + this.anInt5522 * arg1 + this.anInt5527 * arg2 >> 15;
		arg3[1] = this.anInt5524 * arg0 + this.anInt5518 * arg1 + this.anInt5528 * arg2 >> 15;
		arg3[2] = this.anInt5529 * arg0 + this.anInt5526 * arg1 + this.anInt5520 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!pu", name = "N", descriptor = "(I)V")
	@Override
	public void N(@OriginalArg(0) int arg0) {
		this.anInt5519 = 32768;
		this.anInt5518 = this.anInt5520 = Class162.anIntArray387[arg0 & 0x3FFF];
		this.anInt5526 = Class162.anIntArray388[arg0 & 0x3FFF];
		this.anInt5528 = -this.anInt5526;
		this.anInt5522 = this.anInt5527 = this.anInt5523 = this.anInt5524 = this.anInt5525 = this.anInt5529 = this.anInt5521 = 0;
	}

	@OriginalMember(owner = "client!pu", name = "za", descriptor = "(Lclient!c;)V")
	@Override
	public void za(@OriginalArg(0) Class35 arg0) {
		@Pc(2) Class35_Sub1 local2 = (Class35_Sub1) arg0;
		this.anInt5519 = local2.anInt5519;
		this.anInt5522 = local2.anInt5522;
		this.anInt5527 = local2.anInt5527;
		this.anInt5523 = local2.anInt5523;
		this.anInt5524 = local2.anInt5524;
		this.anInt5518 = local2.anInt5518;
		this.anInt5528 = local2.anInt5528;
		this.anInt5525 = local2.anInt5525;
		this.anInt5529 = local2.anInt5529;
		this.anInt5526 = local2.anInt5526;
		this.anInt5520 = local2.anInt5520;
		this.anInt5521 = local2.anInt5521;
	}

	@OriginalMember(owner = "client!pu", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.anInt5524 = this.anInt5529 = this.anInt5522 = this.anInt5526 = this.anInt5527 = this.anInt5528 = this.anInt5523 = this.anInt5525 = this.anInt5521 = 0;
		this.anInt5519 = this.anInt5518 = this.anInt5520 = 32768;
	}
}
