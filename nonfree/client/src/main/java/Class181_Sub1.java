import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class181_Sub1 extends Class181 {

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	public int anInt6293;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	public int anInt6294;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "I")
	public int anInt6295;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "I")
	public int anInt6296;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "I")
	public int anInt6297;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "I")
	public int anInt6298;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public int anInt6299;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "I")
	public int anInt6300;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "I")
	public int anInt6301;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "I")
	public int anInt6302;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "I")
	public int anInt6303;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "I")
	public int anInt6304;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class181_Sub1() {
		this.ha();
	}

	@OriginalMember(owner = "client!od", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.anInt6304 = 32768;
		this.anInt6303 = this.anInt6300 = Class125.anIntArray382[arg0 & 0x3FFF];
		this.anInt6296 = Class125.anIntArray381[arg0 & 0x3FFF];
		this.anInt6298 = -this.anInt6296;
		this.anInt6299 = this.anInt6302 = this.anInt6301 = this.anInt6295 = this.anInt6297 = this.anInt6293 = this.anInt6294 = 0;
	}

	@OriginalMember(owner = "client!od", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.anInt6300 = 32768;
		this.anInt6304 = this.anInt6303 = Class125.anIntArray382[arg0 & 0x3FFF];
		this.anInt6295 = Class125.anIntArray381[arg0 & 0x3FFF];
		this.anInt6299 = -this.anInt6295;
		this.anInt6302 = this.anInt6301 = this.anInt6298 = this.anInt6297 = this.anInt6293 = this.anInt6296 = this.anInt6294 = 0;
	}

	@OriginalMember(owner = "client!od", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt6304 * arg0 + this.anInt6299 * arg1 + this.anInt6302 * arg2 >> 15;
		arg3[1] = this.anInt6295 * arg0 + this.anInt6303 * arg1 + this.anInt6298 * arg2 >> 15;
		arg3[2] = this.anInt6293 * arg0 + this.anInt6296 * arg1 + this.anInt6300 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!od", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6301 += arg0;
		this.anInt6297 += arg1;
		this.anInt6294 += arg2;
	}

	@OriginalMember(owner = "client!od", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.anInt6295 = this.anInt6293 = this.anInt6299 = this.anInt6296 = this.anInt6302 = this.anInt6298 = this.anInt6301 = this.anInt6297 = this.anInt6294 = 0;
		this.anInt6304 = this.anInt6303 = this.anInt6300 = 32768;
	}

	@OriginalMember(owner = "client!od", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class125.anIntArray382[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class125.anIntArray381[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt6295;
		@Pc(17) int local17 = this.anInt6303;
		@Pc(20) int local20 = this.anInt6298;
		@Pc(23) int local23 = this.anInt6297;
		this.anInt6295 = local14 * local5 - this.anInt6293 * local11 >> 15;
		this.anInt6293 = local14 * local11 + this.anInt6293 * local5 >> 15;
		this.anInt6303 = local17 * local5 - this.anInt6296 * local11 >> 15;
		this.anInt6296 = local17 * local11 + this.anInt6296 * local5 >> 15;
		this.anInt6298 = local20 * local5 - this.anInt6300 * local11 >> 15;
		this.anInt6300 = local20 * local11 + this.anInt6300 * local5 >> 15;
		this.anInt6297 = local23 * local5 - this.anInt6294 * local11 >> 15;
		this.anInt6294 = local23 * local11 + this.anInt6294 * local5 >> 15;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class181 method5993() {
		@Pc(3) Class181_Sub1 local3 = new Class181_Sub1();
		local3.anInt6304 = this.anInt6304;
		local3.anInt6299 = this.anInt6299;
		local3.anInt6302 = this.anInt6302;
		local3.anInt6301 = this.anInt6301;
		local3.anInt6295 = this.anInt6295;
		local3.anInt6303 = this.anInt6303;
		local3.anInt6298 = this.anInt6298;
		local3.anInt6297 = this.anInt6297;
		local3.anInt6293 = this.anInt6293;
		local3.anInt6296 = this.anInt6296;
		local3.anInt6300 = this.anInt6300;
		local3.anInt6294 = this.anInt6294;
		return local3;
	}

	@OriginalMember(owner = "client!od", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt6303 = 32768;
		this.anInt6304 = this.anInt6300 = Class125.anIntArray382[arg0 & 0x3FFF];
		this.anInt6302 = Class125.anIntArray381[arg0 & 0x3FFF];
		this.anInt6293 = -this.anInt6302;
		this.anInt6299 = this.anInt6301 = this.anInt6295 = this.anInt6298 = this.anInt6297 = this.anInt6296 = this.anInt6294 = 0;
	}

	@OriginalMember(owner = "client!od", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class125.anIntArray382[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class125.anIntArray381[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class125.anIntArray382[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class125.anIntArray381[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class125.anIntArray382[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class125.anIntArray381[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt6304 = local17 * local29 + local23 * local47 >> 15;
		this.anInt6295 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt6293 = local23 * local5 >> 15;
		this.anInt6299 = local5 * local35 >> 15;
		this.anInt6303 = local5 * local29 >> 15;
		this.anInt6296 = -local11;
		this.anInt6302 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt6298 = local23 * local35 + local17 * local41 >> 15;
		this.anInt6300 = local17 * local5 >> 15;
		this.anInt6301 = -arg0 * this.anInt6304 - arg1 * this.anInt6299 - arg2 * this.anInt6302 >> 15;
		this.anInt6297 = -arg0 * this.anInt6295 - arg1 * this.anInt6303 - arg2 * this.anInt6298 >> 15;
		this.anInt6294 = -arg0 * this.anInt6293 - arg1 * this.anInt6296 - arg2 * this.anInt6300 >> 15;
	}

	@OriginalMember(owner = "client!od", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class125.anIntArray382[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class125.anIntArray381[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt6304;
		@Pc(17) int local17 = this.anInt6299;
		@Pc(20) int local20 = this.anInt6302;
		@Pc(23) int local23 = this.anInt6301;
		this.anInt6304 = local14 * local5 + this.anInt6293 * local11 >> 15;
		this.anInt6293 = this.anInt6293 * local5 - local14 * local11 >> 15;
		this.anInt6299 = local17 * local5 + this.anInt6296 * local11 >> 15;
		this.anInt6296 = this.anInt6296 * local5 - local17 * local11 >> 15;
		this.anInt6302 = local20 * local5 + this.anInt6300 * local11 >> 15;
		this.anInt6300 = this.anInt6300 * local5 - local20 * local11 >> 15;
		this.anInt6301 = local23 * local5 + this.anInt6294 * local11 >> 15;
		this.anInt6294 = this.anInt6294 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!od", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt6301;
		@Pc(13) int local13 = arg0[1] - this.anInt6297;
		@Pc(20) int local20 = arg0[2] - this.anInt6294;
		arg0[0] = this.anInt6304 * local6 + this.anInt6295 * local13 + this.anInt6293 * local20 >> 15;
		arg0[1] = this.anInt6299 * local6 + this.anInt6303 * local13 + this.anInt6296 * local20 >> 15;
		arg0[2] = this.anInt6302 * local6 + this.anInt6298 * local13 + this.anInt6300 * local20 >> 15;
	}

	@OriginalMember(owner = "client!od", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class181 arg0) {
		@Pc(2) Class181_Sub1 local2 = (Class181_Sub1) arg0;
		this.anInt6304 = local2.anInt6304;
		this.anInt6299 = local2.anInt6299;
		this.anInt6302 = local2.anInt6302;
		this.anInt6301 = local2.anInt6301;
		this.anInt6295 = local2.anInt6295;
		this.anInt6303 = local2.anInt6303;
		this.anInt6298 = local2.anInt6298;
		this.anInt6297 = local2.anInt6297;
		this.anInt6293 = local2.anInt6293;
		this.anInt6296 = local2.anInt6296;
		this.anInt6300 = local2.anInt6300;
		this.anInt6294 = local2.anInt6294;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt6301 + (this.anInt6304 * arg0 + this.anInt6299 * arg1 + this.anInt6302 * arg2 >> 15);
		arg3[1] = this.anInt6297 + (this.anInt6295 * arg0 + this.anInt6303 * arg1 + this.anInt6298 * arg2 >> 15);
		arg3[2] = this.anInt6294 + (this.anInt6293 * arg0 + this.anInt6296 * arg1 + this.anInt6300 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!od", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6295 = this.anInt6293 = this.anInt6299 = this.anInt6296 = this.anInt6302 = this.anInt6298 = 0;
		this.anInt6304 = this.anInt6303 = this.anInt6300 = 32768;
		this.anInt6301 = arg0;
		this.anInt6297 = arg1;
		this.anInt6294 = arg2;
	}
}
