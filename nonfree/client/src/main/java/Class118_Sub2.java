import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class118_Sub2 extends Class118 {

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
	public int anInt4232;

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
	public int anInt4233;

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
	public int anInt4234;

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
	public int anInt4235;

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
	public int anInt4236;

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
	public int anInt4237;

	@OriginalMember(owner = "client!jaa", name = "j", descriptor = "I")
	public int anInt4238;

	@OriginalMember(owner = "client!jaa", name = "k", descriptor = "I")
	public int anInt4239;

	@OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
	public int anInt4240;

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "I")
	public int anInt4241;

	@OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
	public int anInt4242;

	@OriginalMember(owner = "client!jaa", name = "o", descriptor = "I")
	public int anInt4243;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V")
	public Class118_Sub2() {
		this.ha();
	}

	@OriginalMember(owner = "client!jaa", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.anInt4237 = this.anInt4238 = this.anInt4239 = this.anInt4243 = this.anInt4235 = this.anInt4241 = this.anInt4233 = this.anInt4242 = this.anInt4234 = 0;
		this.anInt4240 = this.anInt4236 = this.anInt4232 = 16384;
	}

	@OriginalMember(owner = "client!jaa", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.anInt4232 = 16384;
		this.anInt4240 = this.anInt4236 = Class310.anIntArray826[arg0 & 0x3FFF];
		this.anInt4237 = Class310.anIntArray827[arg0 & 0x3FFF];
		this.anInt4239 = -this.anInt4237;
		this.anInt4235 = this.anInt4233 = this.anInt4241 = this.anInt4242 = this.anInt4238 = this.anInt4243 = this.anInt4234 = 0;
	}

	@OriginalMember(owner = "client!jaa", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class310.anIntArray826[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class310.anIntArray827[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4240;
		@Pc(17) int local17 = this.anInt4239;
		@Pc(20) int local20 = this.anInt4235;
		@Pc(23) int local23 = this.anInt4233;
		this.anInt4240 = local14 * local5 + this.anInt4238 * local11 >> 14;
		this.anInt4238 = this.anInt4238 * local5 - local14 * local11 >> 14;
		this.anInt4239 = local17 * local5 + this.anInt4243 * local11 >> 14;
		this.anInt4243 = this.anInt4243 * local5 - local17 * local11 >> 14;
		this.anInt4235 = local20 * local5 + this.anInt4232 * local11 >> 14;
		this.anInt4232 = this.anInt4232 * local5 - local20 * local11 >> 14;
		this.anInt4233 = local23 * local5 + this.anInt4234 * local11 >> 14;
		this.anInt4234 = this.anInt4234 * local5 - local23 * local11 >> 14;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class118 method6964() {
		@Pc(3) Class118_Sub2 local3 = new Class118_Sub2();
		local3.anInt4240 = this.anInt4240;
		local3.anInt4239 = this.anInt4239;
		local3.anInt4235 = this.anInt4235;
		local3.anInt4233 = this.anInt4233;
		local3.anInt4237 = this.anInt4237;
		local3.anInt4236 = this.anInt4236;
		local3.anInt4241 = this.anInt4241;
		local3.anInt4242 = this.anInt4242;
		local3.anInt4238 = this.anInt4238;
		local3.anInt4243 = this.anInt4243;
		local3.anInt4232 = this.anInt4232;
		local3.anInt4234 = this.anInt4234;
		return local3;
	}

	@OriginalMember(owner = "client!jaa", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class310.anIntArray826[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class310.anIntArray827[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4237;
		@Pc(17) int local17 = this.anInt4236;
		@Pc(20) int local20 = this.anInt4241;
		@Pc(23) int local23 = this.anInt4242;
		this.anInt4237 = local14 * local5 - this.anInt4238 * local11 >> 14;
		this.anInt4238 = local14 * local11 + this.anInt4238 * local5 >> 14;
		this.anInt4236 = local17 * local5 - this.anInt4243 * local11 >> 14;
		this.anInt4243 = local17 * local11 + this.anInt4243 * local5 >> 14;
		this.anInt4241 = local20 * local5 - this.anInt4232 * local11 >> 14;
		this.anInt4232 = local20 * local11 + this.anInt4232 * local5 >> 14;
		this.anInt4242 = local23 * local5 - this.anInt4234 * local11 >> 14;
		this.anInt4234 = local23 * local11 + this.anInt4234 * local5 >> 14;
	}

	@OriginalMember(owner = "client!jaa", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt4236 = 16384;
		this.anInt4240 = this.anInt4232 = Class310.anIntArray826[arg0 & 0x3FFF];
		this.anInt4235 = Class310.anIntArray827[arg0 & 0x3FFF];
		this.anInt4238 = -this.anInt4235;
		this.anInt4239 = this.anInt4233 = this.anInt4237 = this.anInt4241 = this.anInt4242 = this.anInt4243 = this.anInt4234 = 0;
	}

	@OriginalMember(owner = "client!jaa", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class310.anIntArray826[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class310.anIntArray827[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class310.anIntArray826[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class310.anIntArray827[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class310.anIntArray826[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class310.anIntArray827[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 14;
		@Pc(47) int local47 = local11 * local35 >> 14;
		this.anInt4240 = local17 * local29 + local23 * local47 >> 14;
		this.anInt4237 = -local17 * local35 + local23 * local41 >> 14;
		this.anInt4238 = local23 * local5 >> 14;
		this.anInt4239 = local5 * local35 >> 14;
		this.anInt4236 = local5 * local29 >> 14;
		this.anInt4243 = -local11;
		this.anInt4235 = -local23 * local29 + local17 * local47 >> 14;
		this.anInt4241 = local23 * local35 + local17 * local41 >> 14;
		this.anInt4232 = local17 * local5 >> 14;
		this.anInt4233 = -arg0 * this.anInt4240 - arg1 * this.anInt4239 - arg2 * this.anInt4235 >> 14;
		this.anInt4242 = -arg0 * this.anInt4237 - arg1 * this.anInt4236 - arg2 * this.anInt4241 >> 14;
		this.anInt4234 = -arg0 * this.anInt4238 - arg1 * this.anInt4243 - arg2 * this.anInt4232 >> 14;
	}

	@OriginalMember(owner = "client!jaa", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4237 = this.anInt4238 = this.anInt4239 = this.anInt4243 = this.anInt4235 = this.anInt4241 = 0;
		this.anInt4240 = this.anInt4236 = this.anInt4232 = 16384;
		this.anInt4233 = arg0;
		this.anInt4242 = arg1;
		this.anInt4234 = arg2;
	}

	@OriginalMember(owner = "client!jaa", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class118 arg0) {
		@Pc(2) Class118_Sub2 local2 = (Class118_Sub2) arg0;
		this.anInt4240 = local2.anInt4240;
		this.anInt4239 = local2.anInt4239;
		this.anInt4235 = local2.anInt4235;
		this.anInt4233 = local2.anInt4233;
		this.anInt4237 = local2.anInt4237;
		this.anInt4236 = local2.anInt4236;
		this.anInt4241 = local2.anInt4241;
		this.anInt4242 = local2.anInt4242;
		this.anInt4238 = local2.anInt4238;
		this.anInt4243 = local2.anInt4243;
		this.anInt4232 = local2.anInt4232;
		this.anInt4234 = local2.anInt4234;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt4233 + (this.anInt4240 * arg0 + this.anInt4239 * arg1 + this.anInt4235 * arg2 >> 14);
		arg3[1] = this.anInt4242 + (this.anInt4237 * arg0 + this.anInt4236 * arg1 + this.anInt4241 * arg2 >> 14);
		arg3[2] = this.anInt4234 + (this.anInt4238 * arg0 + this.anInt4243 * arg1 + this.anInt4232 * arg2 >> 14);
	}

	@OriginalMember(owner = "client!jaa", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt4233;
		@Pc(13) int local13 = arg0[1] - this.anInt4242;
		@Pc(20) int local20 = arg0[2] - this.anInt4234;
		arg0[0] = this.anInt4240 * local6 + this.anInt4237 * local13 + this.anInt4238 * local20 >> 14;
		arg0[1] = this.anInt4239 * local6 + this.anInt4236 * local13 + this.anInt4243 * local20 >> 14;
		arg0[2] = this.anInt4235 * local6 + this.anInt4241 * local13 + this.anInt4232 * local20 >> 14;
	}

	@OriginalMember(owner = "client!jaa", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4233 += arg0;
		this.anInt4242 += arg1;
		this.anInt4234 += arg2;
	}

	@OriginalMember(owner = "client!jaa", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.anInt4240 = 16384;
		this.anInt4236 = this.anInt4232 = Class310.anIntArray826[arg0 & 0x3FFF];
		this.anInt4243 = Class310.anIntArray827[arg0 & 0x3FFF];
		this.anInt4241 = -this.anInt4243;
		this.anInt4239 = this.anInt4235 = this.anInt4233 = this.anInt4237 = this.anInt4242 = this.anInt4238 = this.anInt4234 = 0;
	}

	@OriginalMember(owner = "client!jaa", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt4240 * arg0 + this.anInt4239 * arg1 + this.anInt4235 * arg2 >> 14;
		arg3[1] = this.anInt4237 * arg0 + this.anInt4236 * arg1 + this.anInt4241 * arg2 >> 14;
		arg3[2] = this.anInt4238 * arg0 + this.anInt4243 * arg1 + this.anInt4232 * arg2 >> 14;
	}
}
