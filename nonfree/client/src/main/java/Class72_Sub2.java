import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class72_Sub2 extends Class72 {

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
	public int anInt4268;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
	public int anInt4269;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
	public int anInt4270;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
	public int anInt4271;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	public int anInt4272;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
	public int anInt4273;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
	public int anInt4274;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
	public int anInt4275;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
	public int anInt4276;

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
	public int anInt4277;

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
	public int anInt4278;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
	public int anInt4279;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class72_Sub2() {
		this.method4071();
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
	@Override
	public void method4072(@OriginalArg(0) int arg0) {
		this.anInt4279 = 32768;
		this.anInt4269 = this.anInt4274 = Class207.anIntArray698[arg0 & 0x3FFF];
		this.anInt4275 = Class207.anIntArray697[arg0 & 0x3FFF];
		this.anInt4276 = -this.anInt4275;
		this.anInt4273 = this.anInt4277 = this.anInt4270 = this.anInt4271 = this.anInt4272 = this.anInt4268 = this.anInt4278 = 0;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
	@Override
	public void method4074(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class207.anIntArray698[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class207.anIntArray697[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4269;
		@Pc(17) int local17 = this.anInt4276;
		@Pc(20) int local20 = this.anInt4273;
		@Pc(23) int local23 = this.anInt4277;
		this.anInt4269 = local14 * local5 + this.anInt4272 * local11 >> 15;
		this.anInt4272 = this.anInt4272 * local5 - local14 * local11 >> 15;
		this.anInt4276 = local17 * local5 + this.anInt4268 * local11 >> 15;
		this.anInt4268 = this.anInt4268 * local5 - local17 * local11 >> 15;
		this.anInt4273 = local20 * local5 + this.anInt4279 * local11 >> 15;
		this.anInt4279 = this.anInt4279 * local5 - local20 * local11 >> 15;
		this.anInt4277 = local23 * local5 + this.anInt4278 * local11 >> 15;
		this.anInt4278 = this.anInt4278 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)V")
	@Override
	public void method4068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4277 += arg0;
		this.anInt4271 += arg1;
		this.anInt4278 += arg2;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "()V")
	@Override
	public void method4071() {
		this.anInt4275 = this.anInt4272 = this.anInt4276 = this.anInt4268 = this.anInt4273 = this.anInt4270 = this.anInt4277 = this.anInt4271 = this.anInt4278 = 0;
		this.anInt4269 = this.anInt4274 = this.anInt4279 = 32768;
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V")
	@Override
	public void method4082(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class207.anIntArray698[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class207.anIntArray697[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4275;
		@Pc(17) int local17 = this.anInt4274;
		@Pc(20) int local20 = this.anInt4270;
		@Pc(23) int local23 = this.anInt4271;
		this.anInt4275 = local14 * local5 - this.anInt4272 * local11 >> 15;
		this.anInt4272 = local14 * local11 + this.anInt4272 * local5 >> 15;
		this.anInt4274 = local17 * local5 - this.anInt4268 * local11 >> 15;
		this.anInt4268 = local17 * local11 + this.anInt4268 * local5 >> 15;
		this.anInt4270 = local20 * local5 - this.anInt4279 * local11 >> 15;
		this.anInt4279 = local20 * local11 + this.anInt4279 * local5 >> 15;
		this.anInt4271 = local23 * local5 - this.anInt4278 * local11 >> 15;
		this.anInt4278 = local23 * local11 + this.anInt4278 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
	@Override
	public void method4069(@OriginalArg(0) int arg0) {
		this.anInt4269 = 32768;
		this.anInt4274 = this.anInt4279 = Class207.anIntArray698[arg0 & 0x3FFF];
		this.anInt4268 = Class207.anIntArray697[arg0 & 0x3FFF];
		this.anInt4270 = -this.anInt4268;
		this.anInt4276 = this.anInt4273 = this.anInt4277 = this.anInt4275 = this.anInt4271 = this.anInt4272 = this.anInt4278 = 0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	@Override
	public void method4067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4275 = this.anInt4272 = this.anInt4276 = this.anInt4268 = this.anInt4273 = this.anInt4270 = 0;
		this.anInt4269 = this.anInt4274 = this.anInt4279 = 32768;
		this.anInt4277 = arg0;
		this.anInt4271 = arg1;
		this.anInt4278 = arg2;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt4277 + (this.anInt4269 * arg0 + this.anInt4276 * arg1 + this.anInt4273 * arg2 >> 15);
		arg3[1] = this.anInt4271 + (this.anInt4275 * arg0 + this.anInt4274 * arg1 + this.anInt4270 * arg2 >> 15);
		arg3[2] = this.anInt4278 + (this.anInt4272 * arg0 + this.anInt4268 * arg1 + this.anInt4279 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "()Lclient!ol;")
	public Class72_Sub2 method4083() {
		@Pc(3) Class72_Sub2 local3 = new Class72_Sub2();
		local3.anInt4269 = this.anInt4269;
		local3.anInt4276 = this.anInt4276;
		local3.anInt4273 = this.anInt4273;
		local3.anInt4277 = this.anInt4277;
		local3.anInt4275 = this.anInt4275;
		local3.anInt4274 = this.anInt4274;
		local3.anInt4270 = this.anInt4270;
		local3.anInt4271 = this.anInt4271;
		local3.anInt4272 = this.anInt4272;
		local3.anInt4268 = this.anInt4268;
		local3.anInt4279 = this.anInt4279;
		local3.anInt4278 = this.anInt4278;
		return local3;
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
	@Override
	public void method4081(@OriginalArg(0) int arg0) {
		this.anInt4274 = 32768;
		this.anInt4269 = this.anInt4279 = Class207.anIntArray698[arg0 & 0x3FFF];
		this.anInt4273 = Class207.anIntArray697[arg0 & 0x3FFF];
		this.anInt4272 = -this.anInt4273;
		this.anInt4276 = this.anInt4277 = this.anInt4275 = this.anInt4270 = this.anInt4271 = this.anInt4268 = this.anInt4278 = 0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!po;)V")
	@Override
	public void method4070(@OriginalArg(0) Class72 arg0) {
		@Pc(2) Class72_Sub2 local2 = (Class72_Sub2) arg0;
		this.anInt4269 = local2.anInt4269;
		this.anInt4276 = local2.anInt4276;
		this.anInt4273 = local2.anInt4273;
		this.anInt4277 = local2.anInt4277;
		this.anInt4275 = local2.anInt4275;
		this.anInt4274 = local2.anInt4274;
		this.anInt4270 = local2.anInt4270;
		this.anInt4271 = local2.anInt4271;
		this.anInt4272 = local2.anInt4272;
		this.anInt4268 = local2.anInt4268;
		this.anInt4279 = local2.anInt4279;
		this.anInt4278 = local2.anInt4278;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([I)V")
	@Override
	public void method4079(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt4277;
		@Pc(13) int local13 = arg0[1] - this.anInt4271;
		@Pc(20) int local20 = arg0[2] - this.anInt4278;
		arg0[0] = this.anInt4269 * local6 + this.anInt4275 * local13 + this.anInt4272 * local20 >> 15;
		arg0[1] = this.anInt4276 * local6 + this.anInt4274 * local13 + this.anInt4268 * local20 >> 15;
		arg0[2] = this.anInt4273 * local6 + this.anInt4270 * local13 + this.anInt4279 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class207.anIntArray698[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class207.anIntArray697[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class207.anIntArray698[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class207.anIntArray697[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class207.anIntArray698[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class207.anIntArray697[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt4269 = local17 * local29 + local23 * local47 >> 15;
		this.anInt4275 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt4272 = local23 * local5 >> 15;
		this.anInt4276 = local5 * local35 >> 15;
		this.anInt4274 = local5 * local29 >> 15;
		this.anInt4268 = -local11;
		this.anInt4273 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt4270 = local23 * local35 + local17 * local41 >> 15;
		this.anInt4279 = local17 * local5 >> 15;
		this.anInt4277 = -arg0 * this.anInt4269 - arg1 * this.anInt4276 - arg2 * this.anInt4273 >> 15;
		this.anInt4271 = -arg0 * this.anInt4275 - arg1 * this.anInt4274 - arg2 * this.anInt4270 >> 15;
		this.anInt4278 = -arg0 * this.anInt4272 - arg1 * this.anInt4268 - arg2 * this.anInt4279 >> 15;
	}
}
