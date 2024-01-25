import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class107_Sub2 extends Class107 {

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	public int anInt6306;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
	public int anInt6307;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	public int anInt6308;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	public int anInt6309;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
	public int anInt6310;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	public int anInt6311;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
	public int anInt6312;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
	public int anInt6313;

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
	public int anInt6314;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
	public int anInt6315;

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
	public int anInt6316;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
	public int anInt6317;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	public Class107_Sub2() {
		this.HA();
	}

	@OriginalMember(owner = "client!sq", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt6312 = 32768;
		this.anInt6308 = this.anInt6310 = Class3_Sub2_Sub17.anIntArray290[arg0 & 0x3FFF];
		this.anInt6307 = Class3_Sub2_Sub17.anIntArray289[arg0 & 0x3FFF];
		this.anInt6313 = -this.anInt6307;
		this.anInt6316 = this.anInt6317 = this.anInt6315 = this.anInt6306 = this.anInt6309 = this.anInt6314 = this.anInt6311 = 0;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class3_Sub2_Sub17.anIntArray290[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class3_Sub2_Sub17.anIntArray289[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt6308;
		@Pc(17) int local17 = this.anInt6316;
		@Pc(20) int local20 = this.anInt6307;
		@Pc(23) int local23 = this.anInt6317;
		this.anInt6308 = local14 * local5 + this.anInt6313 * local11 >> 15;
		this.anInt6313 = this.anInt6313 * local5 - local14 * local11 >> 15;
		this.anInt6316 = local17 * local5 + this.anInt6314 * local11 >> 15;
		this.anInt6314 = this.anInt6314 * local5 - local17 * local11 >> 15;
		this.anInt6307 = local20 * local5 + this.anInt6310 * local11 >> 15;
		this.anInt6310 = this.anInt6310 * local5 - local20 * local11 >> 15;
		this.anInt6317 = local23 * local5 + this.anInt6311 * local11 >> 15;
		this.anInt6311 = this.anInt6311 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!sq", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class107 arg0) {
		@Pc(2) Class107_Sub2 local2 = (Class107_Sub2) arg0;
		this.anInt6308 = local2.anInt6308;
		this.anInt6316 = local2.anInt6316;
		this.anInt6307 = local2.anInt6307;
		this.anInt6317 = local2.anInt6317;
		this.anInt6315 = local2.anInt6315;
		this.anInt6312 = local2.anInt6312;
		this.anInt6306 = local2.anInt6306;
		this.anInt6309 = local2.anInt6309;
		this.anInt6313 = local2.anInt6313;
		this.anInt6314 = local2.anInt6314;
		this.anInt6310 = local2.anInt6310;
		this.anInt6311 = local2.anInt6311;
	}

	@OriginalMember(owner = "client!sq", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class3_Sub2_Sub17.anIntArray290[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class3_Sub2_Sub17.anIntArray289[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt6315;
		@Pc(17) int local17 = this.anInt6312;
		@Pc(20) int local20 = this.anInt6306;
		@Pc(23) int local23 = this.anInt6309;
		this.anInt6315 = local14 * local5 - this.anInt6313 * local11 >> 15;
		this.anInt6313 = local14 * local11 + this.anInt6313 * local5 >> 15;
		this.anInt6312 = local17 * local5 - this.anInt6314 * local11 >> 15;
		this.anInt6314 = local17 * local11 + this.anInt6314 * local5 >> 15;
		this.anInt6306 = local20 * local5 - this.anInt6310 * local11 >> 15;
		this.anInt6310 = local20 * local11 + this.anInt6310 * local5 >> 15;
		this.anInt6309 = local23 * local5 - this.anInt6311 * local11 >> 15;
		this.anInt6311 = local23 * local11 + this.anInt6311 * local5 >> 15;
	}

	@OriginalMember(owner = "client!sq", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6315 = this.anInt6313 = this.anInt6316 = this.anInt6314 = this.anInt6307 = this.anInt6306 = 0;
		this.anInt6308 = this.anInt6312 = this.anInt6310 = 32768;
		this.anInt6317 = arg0;
		this.anInt6309 = arg1;
		this.anInt6311 = arg2;
	}

	@OriginalMember(owner = "client!sq", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt6310 = 32768;
		this.anInt6308 = this.anInt6312 = Class3_Sub2_Sub17.anIntArray290[arg0 & 0x3FFF];
		this.anInt6315 = Class3_Sub2_Sub17.anIntArray289[arg0 & 0x3FFF];
		this.anInt6316 = -this.anInt6315;
		this.anInt6307 = this.anInt6317 = this.anInt6306 = this.anInt6309 = this.anInt6313 = this.anInt6314 = this.anInt6311 = 0;
	}

	@OriginalMember(owner = "client!sq", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt6317;
		@Pc(13) int local13 = arg0[1] - this.anInt6309;
		@Pc(20) int local20 = arg0[2] - this.anInt6311;
		arg0[0] = this.anInt6308 * local6 + this.anInt6315 * local13 + this.anInt6313 * local20 >> 15;
		arg0[1] = this.anInt6316 * local6 + this.anInt6312 * local13 + this.anInt6314 * local20 >> 15;
		arg0[2] = this.anInt6307 * local6 + this.anInt6306 * local13 + this.anInt6310 * local20 >> 15;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class107 method4904() {
		@Pc(3) Class107_Sub2 local3 = new Class107_Sub2();
		local3.anInt6308 = this.anInt6308;
		local3.anInt6316 = this.anInt6316;
		local3.anInt6307 = this.anInt6307;
		local3.anInt6317 = this.anInt6317;
		local3.anInt6315 = this.anInt6315;
		local3.anInt6312 = this.anInt6312;
		local3.anInt6306 = this.anInt6306;
		local3.anInt6309 = this.anInt6309;
		local3.anInt6313 = this.anInt6313;
		local3.anInt6314 = this.anInt6314;
		local3.anInt6310 = this.anInt6310;
		local3.anInt6311 = this.anInt6311;
		return local3;
	}

	@OriginalMember(owner = "client!sq", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.anInt6315 = this.anInt6313 = this.anInt6316 = this.anInt6314 = this.anInt6307 = this.anInt6306 = this.anInt6317 = this.anInt6309 = this.anInt6311 = 0;
		this.anInt6308 = this.anInt6312 = this.anInt6310 = 32768;
	}

	@OriginalMember(owner = "client!sq", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class3_Sub2_Sub17.anIntArray290[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class3_Sub2_Sub17.anIntArray289[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class3_Sub2_Sub17.anIntArray290[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class3_Sub2_Sub17.anIntArray289[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class3_Sub2_Sub17.anIntArray290[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class3_Sub2_Sub17.anIntArray289[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt6308 = local17 * local29 + local23 * local47 >> 15;
		this.anInt6315 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt6313 = local23 * local5 >> 15;
		this.anInt6316 = local5 * local35 >> 15;
		this.anInt6312 = local5 * local29 >> 15;
		this.anInt6314 = -local11;
		this.anInt6307 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt6306 = local23 * local35 + local17 * local41 >> 15;
		this.anInt6310 = local17 * local5 >> 15;
		this.anInt6317 = -arg0 * this.anInt6308 - arg1 * this.anInt6316 - arg2 * this.anInt6307 >> 15;
		this.anInt6309 = -arg0 * this.anInt6315 - arg1 * this.anInt6312 - arg2 * this.anInt6306 >> 15;
		this.anInt6311 = -arg0 * this.anInt6313 - arg1 * this.anInt6314 - arg2 * this.anInt6310 >> 15;
	}

	@OriginalMember(owner = "client!sq", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.anInt6308 = 32768;
		this.anInt6312 = this.anInt6310 = Class3_Sub2_Sub17.anIntArray290[arg0 & 0x3FFF];
		this.anInt6314 = Class3_Sub2_Sub17.anIntArray289[arg0 & 0x3FFF];
		this.anInt6306 = -this.anInt6314;
		this.anInt6316 = this.anInt6307 = this.anInt6317 = this.anInt6315 = this.anInt6309 = this.anInt6313 = this.anInt6311 = 0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt6317 + (this.anInt6308 * arg0 + this.anInt6316 * arg1 + this.anInt6307 * arg2 >> 15);
		arg3[1] = this.anInt6309 + (this.anInt6315 * arg0 + this.anInt6312 * arg1 + this.anInt6306 * arg2 >> 15);
		arg3[2] = this.anInt6311 + (this.anInt6313 * arg0 + this.anInt6314 * arg1 + this.anInt6310 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!sq", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6317 += arg0;
		this.anInt6309 += arg1;
		this.anInt6311 += arg2;
	}

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt6308 * arg0 + this.anInt6316 * arg1 + this.anInt6307 * arg2 >> 15;
		arg3[1] = this.anInt6315 * arg0 + this.anInt6312 * arg1 + this.anInt6306 * arg2 >> 15;
		arg3[2] = this.anInt6313 * arg0 + this.anInt6314 * arg1 + this.anInt6310 * arg2 >> 15;
	}
}
