import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
	public int anInt5270;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
	public int anInt5271;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	public int anInt5272;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
	public int anInt5273;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
	public int anInt5274;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
	public int anInt5275;

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
	public int anInt5276;

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
	public int anInt5277;

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
	public int anInt5278;

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
	public int anInt5279;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
	public int anInt5280;

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
	public int anInt5281;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V")
	public Class78_Sub2() {
		this.ha();
	}

	@OriginalMember(owner = "client!kv", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.anInt5281 = this.anInt5278 = this.anInt5273 = this.anInt5280 = this.anInt5272 = this.anInt5274 = this.anInt5275 = this.anInt5276 = this.anInt5277 = 0;
		this.anInt5271 = this.anInt5270 = this.anInt5279 = 32768;
	}

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class5_Sub2_Sub16.anIntArray410[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class5_Sub2_Sub16.anIntArray411[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt5281;
		@Pc(17) int local17 = this.anInt5270;
		@Pc(20) int local20 = this.anInt5274;
		@Pc(23) int local23 = this.anInt5276;
		this.anInt5281 = local14 * local5 - this.anInt5278 * local11 >> 15;
		this.anInt5278 = local14 * local11 + this.anInt5278 * local5 >> 15;
		this.anInt5270 = local17 * local5 - this.anInt5280 * local11 >> 15;
		this.anInt5280 = local17 * local11 + this.anInt5280 * local5 >> 15;
		this.anInt5274 = local20 * local5 - this.anInt5279 * local11 >> 15;
		this.anInt5279 = local20 * local11 + this.anInt5279 * local5 >> 15;
		this.anInt5276 = local23 * local5 - this.anInt5277 * local11 >> 15;
		this.anInt5277 = local23 * local11 + this.anInt5277 * local5 >> 15;
	}

	@OriginalMember(owner = "client!kv", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt5271 * arg0 + this.anInt5273 * arg1 + this.anInt5272 * arg2 >> 15;
		arg3[1] = this.anInt5281 * arg0 + this.anInt5270 * arg1 + this.anInt5274 * arg2 >> 15;
		arg3[2] = this.anInt5278 * arg0 + this.anInt5280 * arg1 + this.anInt5279 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class78 method5707() {
		@Pc(3) Class78_Sub2 local3 = new Class78_Sub2();
		local3.anInt5271 = this.anInt5271;
		local3.anInt5273 = this.anInt5273;
		local3.anInt5272 = this.anInt5272;
		local3.anInt5275 = this.anInt5275;
		local3.anInt5281 = this.anInt5281;
		local3.anInt5270 = this.anInt5270;
		local3.anInt5274 = this.anInt5274;
		local3.anInt5276 = this.anInt5276;
		local3.anInt5278 = this.anInt5278;
		local3.anInt5280 = this.anInt5280;
		local3.anInt5279 = this.anInt5279;
		local3.anInt5277 = this.anInt5277;
		return local3;
	}

	@OriginalMember(owner = "client!kv", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class5_Sub2_Sub16.anIntArray410[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class5_Sub2_Sub16.anIntArray411[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt5271;
		@Pc(17) int local17 = this.anInt5273;
		@Pc(20) int local20 = this.anInt5272;
		@Pc(23) int local23 = this.anInt5275;
		this.anInt5271 = local14 * local5 + this.anInt5278 * local11 >> 15;
		this.anInt5278 = this.anInt5278 * local5 - local14 * local11 >> 15;
		this.anInt5273 = local17 * local5 + this.anInt5280 * local11 >> 15;
		this.anInt5280 = this.anInt5280 * local5 - local17 * local11 >> 15;
		this.anInt5272 = local20 * local5 + this.anInt5279 * local11 >> 15;
		this.anInt5279 = this.anInt5279 * local5 - local20 * local11 >> 15;
		this.anInt5275 = local23 * local5 + this.anInt5277 * local11 >> 15;
		this.anInt5277 = this.anInt5277 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt5275 + (this.anInt5271 * arg0 + this.anInt5273 * arg1 + this.anInt5272 * arg2 >> 15);
		arg3[1] = this.anInt5276 + (this.anInt5281 * arg0 + this.anInt5270 * arg1 + this.anInt5274 * arg2 >> 15);
		arg3[2] = this.anInt5277 + (this.anInt5278 * arg0 + this.anInt5280 * arg1 + this.anInt5279 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!kv", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class5_Sub2_Sub16.anIntArray410[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class5_Sub2_Sub16.anIntArray411[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class5_Sub2_Sub16.anIntArray410[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class5_Sub2_Sub16.anIntArray411[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class5_Sub2_Sub16.anIntArray410[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class5_Sub2_Sub16.anIntArray411[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt5271 = local17 * local29 + local23 * local47 >> 15;
		this.anInt5281 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt5278 = local23 * local5 >> 15;
		this.anInt5273 = local5 * local35 >> 15;
		this.anInt5270 = local5 * local29 >> 15;
		this.anInt5280 = -local11;
		this.anInt5272 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt5274 = local23 * local35 + local17 * local41 >> 15;
		this.anInt5279 = local17 * local5 >> 15;
		this.anInt5275 = -arg0 * this.anInt5271 - arg1 * this.anInt5273 - arg2 * this.anInt5272 >> 15;
		this.anInt5276 = -arg0 * this.anInt5281 - arg1 * this.anInt5270 - arg2 * this.anInt5274 >> 15;
		this.anInt5277 = -arg0 * this.anInt5278 - arg1 * this.anInt5280 - arg2 * this.anInt5279 >> 15;
	}

	@OriginalMember(owner = "client!kv", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class78 arg0) {
		@Pc(2) Class78_Sub2 local2 = (Class78_Sub2) arg0;
		this.anInt5271 = local2.anInt5271;
		this.anInt5273 = local2.anInt5273;
		this.anInt5272 = local2.anInt5272;
		this.anInt5275 = local2.anInt5275;
		this.anInt5281 = local2.anInt5281;
		this.anInt5270 = local2.anInt5270;
		this.anInt5274 = local2.anInt5274;
		this.anInt5276 = local2.anInt5276;
		this.anInt5278 = local2.anInt5278;
		this.anInt5280 = local2.anInt5280;
		this.anInt5279 = local2.anInt5279;
		this.anInt5277 = local2.anInt5277;
	}

	@OriginalMember(owner = "client!kv", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.anInt5279 = 32768;
		this.anInt5271 = this.anInt5270 = Class5_Sub2_Sub16.anIntArray410[arg0 & 0x3FFF];
		this.anInt5281 = Class5_Sub2_Sub16.anIntArray411[arg0 & 0x3FFF];
		this.anInt5273 = -this.anInt5281;
		this.anInt5272 = this.anInt5275 = this.anInt5274 = this.anInt5276 = this.anInt5278 = this.anInt5280 = this.anInt5277 = 0;
	}

	@OriginalMember(owner = "client!kv", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt5275;
		@Pc(13) int local13 = arg0[1] - this.anInt5276;
		@Pc(20) int local20 = arg0[2] - this.anInt5277;
		arg0[0] = this.anInt5271 * local6 + this.anInt5281 * local13 + this.anInt5278 * local20 >> 15;
		arg0[1] = this.anInt5273 * local6 + this.anInt5270 * local13 + this.anInt5280 * local20 >> 15;
		arg0[2] = this.anInt5272 * local6 + this.anInt5274 * local13 + this.anInt5279 * local20 >> 15;
	}

	@OriginalMember(owner = "client!kv", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.anInt5271 = 32768;
		this.anInt5270 = this.anInt5279 = Class5_Sub2_Sub16.anIntArray410[arg0 & 0x3FFF];
		this.anInt5280 = Class5_Sub2_Sub16.anIntArray411[arg0 & 0x3FFF];
		this.anInt5274 = -this.anInt5280;
		this.anInt5273 = this.anInt5272 = this.anInt5275 = this.anInt5281 = this.anInt5276 = this.anInt5278 = this.anInt5277 = 0;
	}

	@OriginalMember(owner = "client!kv", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5281 = this.anInt5278 = this.anInt5273 = this.anInt5280 = this.anInt5272 = this.anInt5274 = 0;
		this.anInt5271 = this.anInt5270 = this.anInt5279 = 32768;
		this.anInt5275 = arg0;
		this.anInt5276 = arg1;
		this.anInt5277 = arg2;
	}

	@OriginalMember(owner = "client!kv", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt5270 = 32768;
		this.anInt5271 = this.anInt5279 = Class5_Sub2_Sub16.anIntArray410[arg0 & 0x3FFF];
		this.anInt5272 = Class5_Sub2_Sub16.anIntArray411[arg0 & 0x3FFF];
		this.anInt5278 = -this.anInt5272;
		this.anInt5273 = this.anInt5275 = this.anInt5281 = this.anInt5274 = this.anInt5276 = this.anInt5280 = this.anInt5277 = 0;
	}

	@OriginalMember(owner = "client!kv", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5275 += arg0;
		this.anInt5276 += arg1;
		this.anInt5277 += arg2;
	}
}
