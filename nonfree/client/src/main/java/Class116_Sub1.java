import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
	public int anInt4268;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	public int anInt4269;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
	public int anInt4270;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
	public int anInt4271;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	public int anInt4272;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
	public int anInt4273;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
	public int anInt4274;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
	public int anInt4275;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
	public int anInt4276;

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
	public int anInt4277;

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
	public int anInt4278;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
	public int anInt4279;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
	public Class116_Sub1() {
		this.HA();
	}

	@OriginalMember(owner = "client!lp", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class56.anIntArray120[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class56.anIntArray119[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4271;
		@Pc(17) int local17 = this.anInt4270;
		@Pc(20) int local20 = this.anInt4278;
		@Pc(23) int local23 = this.anInt4277;
		this.anInt4271 = local14 * local5 - this.anInt4272 * local11 >> 15;
		this.anInt4272 = local14 * local11 + this.anInt4272 * local5 >> 15;
		this.anInt4270 = local17 * local5 - this.anInt4268 * local11 >> 15;
		this.anInt4268 = local17 * local11 + this.anInt4268 * local5 >> 15;
		this.anInt4278 = local20 * local5 - this.anInt4274 * local11 >> 15;
		this.anInt4274 = local20 * local11 + this.anInt4274 * local5 >> 15;
		this.anInt4277 = local23 * local5 - this.anInt4279 * local11 >> 15;
		this.anInt4279 = local23 * local11 + this.anInt4279 * local5 >> 15;
	}

	@OriginalMember(owner = "client!lp", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt4269 * arg0 + this.anInt4273 * arg1 + this.anInt4276 * arg2 >> 15;
		arg3[1] = this.anInt4271 * arg0 + this.anInt4270 * arg1 + this.anInt4278 * arg2 >> 15;
		arg3[2] = this.anInt4272 * arg0 + this.anInt4268 * arg1 + this.anInt4274 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!lp", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4275 += arg0;
		this.anInt4277 += arg1;
		this.anInt4279 += arg2;
	}

	@OriginalMember(owner = "client!lp", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt4270 = 32768;
		this.anInt4269 = this.anInt4274 = Class56.anIntArray120[arg0 & 0x3FFF];
		this.anInt4276 = Class56.anIntArray119[arg0 & 0x3FFF];
		this.anInt4272 = -this.anInt4276;
		this.anInt4273 = this.anInt4275 = this.anInt4271 = this.anInt4278 = this.anInt4277 = this.anInt4268 = this.anInt4279 = 0;
	}

	@OriginalMember(owner = "client!lp", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class116 arg0) {
		@Pc(2) Class116_Sub1 local2 = (Class116_Sub1) arg0;
		this.anInt4269 = local2.anInt4269;
		this.anInt4273 = local2.anInt4273;
		this.anInt4276 = local2.anInt4276;
		this.anInt4275 = local2.anInt4275;
		this.anInt4271 = local2.anInt4271;
		this.anInt4270 = local2.anInt4270;
		this.anInt4278 = local2.anInt4278;
		this.anInt4277 = local2.anInt4277;
		this.anInt4272 = local2.anInt4272;
		this.anInt4268 = local2.anInt4268;
		this.anInt4274 = local2.anInt4274;
		this.anInt4279 = local2.anInt4279;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt4275 + (this.anInt4269 * arg0 + this.anInt4273 * arg1 + this.anInt4276 * arg2 >> 15);
		arg3[1] = this.anInt4277 + (this.anInt4271 * arg0 + this.anInt4270 * arg1 + this.anInt4278 * arg2 >> 15);
		arg3[2] = this.anInt4279 + (this.anInt4272 * arg0 + this.anInt4268 * arg1 + this.anInt4274 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!lp", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4271 = this.anInt4272 = this.anInt4273 = this.anInt4268 = this.anInt4276 = this.anInt4278 = 0;
		this.anInt4269 = this.anInt4270 = this.anInt4274 = 32768;
		this.anInt4275 = arg0;
		this.anInt4277 = arg1;
		this.anInt4279 = arg2;
	}

	@OriginalMember(owner = "client!lp", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class56.anIntArray120[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class56.anIntArray119[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class56.anIntArray120[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class56.anIntArray119[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class56.anIntArray120[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class56.anIntArray119[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt4269 = local17 * local29 + local23 * local47 >> 15;
		this.anInt4271 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt4272 = local23 * local5 >> 15;
		this.anInt4273 = local5 * local35 >> 15;
		this.anInt4270 = local5 * local29 >> 15;
		this.anInt4268 = -local11;
		this.anInt4276 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt4278 = local23 * local35 + local17 * local41 >> 15;
		this.anInt4274 = local17 * local5 >> 15;
		this.anInt4275 = -arg0 * this.anInt4269 - arg1 * this.anInt4273 - arg2 * this.anInt4276 >> 15;
		this.anInt4277 = -arg0 * this.anInt4271 - arg1 * this.anInt4270 - arg2 * this.anInt4278 >> 15;
		this.anInt4279 = -arg0 * this.anInt4272 - arg1 * this.anInt4268 - arg2 * this.anInt4274 >> 15;
	}

	@OriginalMember(owner = "client!lp", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt4274 = 32768;
		this.anInt4269 = this.anInt4270 = Class56.anIntArray120[arg0 & 0x3FFF];
		this.anInt4271 = Class56.anIntArray119[arg0 & 0x3FFF];
		this.anInt4273 = -this.anInt4271;
		this.anInt4276 = this.anInt4275 = this.anInt4278 = this.anInt4277 = this.anInt4272 = this.anInt4268 = this.anInt4279 = 0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class116 method4951() {
		@Pc(3) Class116_Sub1 local3 = new Class116_Sub1();
		local3.anInt4269 = this.anInt4269;
		local3.anInt4273 = this.anInt4273;
		local3.anInt4276 = this.anInt4276;
		local3.anInt4275 = this.anInt4275;
		local3.anInt4271 = this.anInt4271;
		local3.anInt4270 = this.anInt4270;
		local3.anInt4278 = this.anInt4278;
		local3.anInt4277 = this.anInt4277;
		local3.anInt4272 = this.anInt4272;
		local3.anInt4268 = this.anInt4268;
		local3.anInt4274 = this.anInt4274;
		local3.anInt4279 = this.anInt4279;
		return local3;
	}

	@OriginalMember(owner = "client!lp", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.anInt4271 = this.anInt4272 = this.anInt4273 = this.anInt4268 = this.anInt4276 = this.anInt4278 = this.anInt4275 = this.anInt4277 = this.anInt4279 = 0;
		this.anInt4269 = this.anInt4270 = this.anInt4274 = 32768;
	}

	@OriginalMember(owner = "client!lp", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt4275;
		@Pc(13) int local13 = arg0[1] - this.anInt4277;
		@Pc(20) int local20 = arg0[2] - this.anInt4279;
		arg0[0] = this.anInt4269 * local6 + this.anInt4271 * local13 + this.anInt4272 * local20 >> 15;
		arg0[1] = this.anInt4273 * local6 + this.anInt4270 * local13 + this.anInt4268 * local20 >> 15;
		arg0[2] = this.anInt4276 * local6 + this.anInt4278 * local13 + this.anInt4274 * local20 >> 15;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class56.anIntArray120[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class56.anIntArray119[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4269;
		@Pc(17) int local17 = this.anInt4273;
		@Pc(20) int local20 = this.anInt4276;
		@Pc(23) int local23 = this.anInt4275;
		this.anInt4269 = local14 * local5 + this.anInt4272 * local11 >> 15;
		this.anInt4272 = this.anInt4272 * local5 - local14 * local11 >> 15;
		this.anInt4273 = local17 * local5 + this.anInt4268 * local11 >> 15;
		this.anInt4268 = this.anInt4268 * local5 - local17 * local11 >> 15;
		this.anInt4276 = local20 * local5 + this.anInt4274 * local11 >> 15;
		this.anInt4274 = this.anInt4274 * local5 - local20 * local11 >> 15;
		this.anInt4275 = local23 * local5 + this.anInt4279 * local11 >> 15;
		this.anInt4279 = this.anInt4279 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!lp", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.anInt4269 = 32768;
		this.anInt4270 = this.anInt4274 = Class56.anIntArray120[arg0 & 0x3FFF];
		this.anInt4268 = Class56.anIntArray119[arg0 & 0x3FFF];
		this.anInt4278 = -this.anInt4268;
		this.anInt4273 = this.anInt4276 = this.anInt4275 = this.anInt4271 = this.anInt4277 = this.anInt4272 = this.anInt4279 = 0;
	}
}
