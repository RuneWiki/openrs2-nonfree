import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!k", name = "n", descriptor = "I")
	public int anInt3243;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "I")
	public int anInt3244;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "I")
	public int anInt3245;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "I")
	public int anInt3246;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "I")
	public int anInt3247;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "I")
	public int anInt3248;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "I")
	public int anInt3249;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "I")
	public int anInt3250;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "I")
	public int anInt3251;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "I")
	public int anInt3252;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "I")
	public int anInt3253;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "I")
	public int anInt3254;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	public Class127_Sub1() {
		this.method5268();
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
	@Override
	public void method5271(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class13.anIntArray21[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class13.anIntArray20[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3246;
		@Pc(17) int local17 = this.anInt3253;
		@Pc(20) int local20 = this.anInt3250;
		@Pc(23) int local23 = this.anInt3254;
		this.anInt3246 = local14 * local5 - this.anInt3249 * local11 >> 15;
		this.anInt3249 = local14 * local11 + this.anInt3249 * local5 >> 15;
		this.anInt3253 = local17 * local5 - this.anInt3245 * local11 >> 15;
		this.anInt3245 = local17 * local11 + this.anInt3245 * local5 >> 15;
		this.anInt3250 = local20 * local5 - this.anInt3244 * local11 >> 15;
		this.anInt3244 = local20 * local11 + this.anInt3244 * local5 >> 15;
		this.anInt3254 = local23 * local5 - this.anInt3251 * local11 >> 15;
		this.anInt3251 = local23 * local11 + this.anInt3251 * local5 >> 15;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V")
	@Override
	public void method5260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3243 += arg0;
		this.anInt3254 += arg1;
		this.anInt3251 += arg2;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([I)V")
	@Override
	public void method5263(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt3243;
		@Pc(13) int local13 = arg0[1] - this.anInt3254;
		@Pc(20) int local20 = arg0[2] - this.anInt3251;
		arg0[0] = this.anInt3248 * local6 + this.anInt3246 * local13 + this.anInt3249 * local20 >> 15;
		arg0[1] = this.anInt3252 * local6 + this.anInt3253 * local13 + this.anInt3245 * local20 >> 15;
		arg0[2] = this.anInt3247 * local6 + this.anInt3250 * local13 + this.anInt3244 * local20 >> 15;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "()Lclient!k;")
	public Class127_Sub1 method2652() {
		@Pc(3) Class127_Sub1 local3 = new Class127_Sub1();
		local3.anInt3248 = this.anInt3248;
		local3.anInt3252 = this.anInt3252;
		local3.anInt3247 = this.anInt3247;
		local3.anInt3243 = this.anInt3243;
		local3.anInt3246 = this.anInt3246;
		local3.anInt3253 = this.anInt3253;
		local3.anInt3250 = this.anInt3250;
		local3.anInt3254 = this.anInt3254;
		local3.anInt3249 = this.anInt3249;
		local3.anInt3245 = this.anInt3245;
		local3.anInt3244 = this.anInt3244;
		local3.anInt3251 = this.anInt3251;
		return local3;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
	@Override
	public void method5269(@OriginalArg(0) int arg0) {
		this.anInt3248 = 32768;
		this.anInt3253 = this.anInt3244 = Class13.anIntArray21[arg0 & 0x3FFF];
		this.anInt3245 = Class13.anIntArray20[arg0 & 0x3FFF];
		this.anInt3250 = -this.anInt3245;
		this.anInt3252 = this.anInt3247 = this.anInt3243 = this.anInt3246 = this.anInt3254 = this.anInt3249 = this.anInt3251 = 0;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(III)V")
	@Override
	public void method5265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3246 = this.anInt3249 = this.anInt3252 = this.anInt3245 = this.anInt3247 = this.anInt3250 = 0;
		this.anInt3248 = this.anInt3253 = this.anInt3244 = 32768;
		this.anInt3243 = arg0;
		this.anInt3254 = arg1;
		this.anInt3251 = arg2;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt3243 + (this.anInt3248 * arg0 + this.anInt3252 * arg1 + this.anInt3247 * arg2 >> 15);
		arg3[1] = this.anInt3254 + (this.anInt3246 * arg0 + this.anInt3253 * arg1 + this.anInt3250 * arg2 >> 15);
		arg3[2] = this.anInt3251 + (this.anInt3249 * arg0 + this.anInt3245 * arg1 + this.anInt3244 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class13.anIntArray21[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class13.anIntArray20[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class13.anIntArray21[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class13.anIntArray20[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class13.anIntArray21[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class13.anIntArray20[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt3248 = local17 * local29 + local23 * local47 >> 15;
		this.anInt3246 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt3249 = local23 * local5 >> 15;
		this.anInt3252 = local5 * local35 >> 15;
		this.anInt3253 = local5 * local29 >> 15;
		this.anInt3245 = -local11;
		this.anInt3247 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt3250 = local23 * local35 + local17 * local41 >> 15;
		this.anInt3244 = local17 * local5 >> 15;
		this.anInt3243 = -arg0 * this.anInt3248 - arg1 * this.anInt3252 - arg2 * this.anInt3247 >> 15;
		this.anInt3254 = -arg0 * this.anInt3246 - arg1 * this.anInt3253 - arg2 * this.anInt3250 >> 15;
		this.anInt3251 = -arg0 * this.anInt3249 - arg1 * this.anInt3245 - arg2 * this.anInt3244 >> 15;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	@Override
	public void method5262(@OriginalArg(0) int arg0) {
		this.anInt3244 = 32768;
		this.anInt3248 = this.anInt3253 = Class13.anIntArray21[arg0 & 0x3FFF];
		this.anInt3246 = Class13.anIntArray20[arg0 & 0x3FFF];
		this.anInt3252 = -this.anInt3246;
		this.anInt3247 = this.anInt3243 = this.anInt3250 = this.anInt3254 = this.anInt3249 = this.anInt3245 = this.anInt3251 = 0;
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
	@Override
	public void method5274(@OriginalArg(0) int arg0) {
		this.anInt3253 = 32768;
		this.anInt3248 = this.anInt3244 = Class13.anIntArray21[arg0 & 0x3FFF];
		this.anInt3247 = Class13.anIntArray20[arg0 & 0x3FFF];
		this.anInt3249 = -this.anInt3247;
		this.anInt3252 = this.anInt3243 = this.anInt3246 = this.anInt3250 = this.anInt3254 = this.anInt3245 = this.anInt3251 = 0;
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
	@Override
	public void method5276(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class13.anIntArray21[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class13.anIntArray20[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3248;
		@Pc(17) int local17 = this.anInt3252;
		@Pc(20) int local20 = this.anInt3247;
		@Pc(23) int local23 = this.anInt3243;
		this.anInt3248 = local14 * local5 + this.anInt3249 * local11 >> 15;
		this.anInt3249 = this.anInt3249 * local5 - local14 * local11 >> 15;
		this.anInt3252 = local17 * local5 + this.anInt3245 * local11 >> 15;
		this.anInt3245 = this.anInt3245 * local5 - local17 * local11 >> 15;
		this.anInt3247 = local20 * local5 + this.anInt3244 * local11 >> 15;
		this.anInt3244 = this.anInt3244 * local5 - local20 * local11 >> 15;
		this.anInt3243 = local23 * local5 + this.anInt3251 * local11 >> 15;
		this.anInt3251 = this.anInt3251 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
	@Override
	public void method5268() {
		this.anInt3246 = this.anInt3249 = this.anInt3252 = this.anInt3245 = this.anInt3247 = this.anInt3250 = this.anInt3243 = this.anInt3254 = this.anInt3251 = 0;
		this.anInt3248 = this.anInt3253 = this.anInt3244 = 32768;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!mu;)V")
	@Override
	public void method5267(@OriginalArg(0) Class127 arg0) {
		@Pc(2) Class127_Sub1 local2 = (Class127_Sub1) arg0;
		this.anInt3248 = local2.anInt3248;
		this.anInt3252 = local2.anInt3252;
		this.anInt3247 = local2.anInt3247;
		this.anInt3243 = local2.anInt3243;
		this.anInt3246 = local2.anInt3246;
		this.anInt3253 = local2.anInt3253;
		this.anInt3250 = local2.anInt3250;
		this.anInt3254 = local2.anInt3254;
		this.anInt3249 = local2.anInt3249;
		this.anInt3245 = local2.anInt3245;
		this.anInt3244 = local2.anInt3244;
		this.anInt3251 = local2.anInt3251;
	}
}
