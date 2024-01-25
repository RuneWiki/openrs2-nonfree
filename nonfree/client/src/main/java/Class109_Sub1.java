import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
	public int anInt3176;

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
	public int anInt3177;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
	public int anInt3178;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
	public int anInt3179;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
	public int anInt3180;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
	public int anInt3181;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
	public int anInt3182;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
	public int anInt3183;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	public int anInt3184;

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
	public int anInt3185;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
	public int anInt3186;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
	public int anInt3187;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	public Class109_Sub1() {
		this.method3875();
	}

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)V")
	@Override
	public void method3880(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub3_Sub8.anIntArray156[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub3_Sub8.anIntArray159[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3184;
		@Pc(17) int local17 = this.anInt3179;
		@Pc(20) int local20 = this.anInt3178;
		@Pc(23) int local23 = this.anInt3186;
		this.anInt3184 = local14 * local5 - this.anInt3185 * local11 >> 15;
		this.anInt3185 = local14 * local11 + this.anInt3185 * local5 >> 15;
		this.anInt3179 = local17 * local5 - this.anInt3180 * local11 >> 15;
		this.anInt3180 = local17 * local11 + this.anInt3180 * local5 >> 15;
		this.anInt3178 = local20 * local5 - this.anInt3177 * local11 >> 15;
		this.anInt3177 = local20 * local11 + this.anInt3177 * local5 >> 15;
		this.anInt3186 = local23 * local5 - this.anInt3183 * local11 >> 15;
		this.anInt3183 = local23 * local11 + this.anInt3183 * local5 >> 15;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
	@Override
	public void method3871(@OriginalArg(0) int arg0) {
		this.anInt3179 = 32768;
		this.anInt3187 = this.anInt3177 = Class1_Sub3_Sub8.anIntArray156[arg0 & 0x3FFF];
		this.anInt3181 = Class1_Sub3_Sub8.anIntArray159[arg0 & 0x3FFF];
		this.anInt3185 = -this.anInt3181;
		this.anInt3182 = this.anInt3176 = this.anInt3184 = this.anInt3178 = this.anInt3186 = this.anInt3180 = this.anInt3183 = 0;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)V")
	@Override
	public void method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3176 += arg0;
		this.anInt3186 += arg1;
		this.anInt3183 += arg2;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt3176 + (this.anInt3187 * arg0 + this.anInt3182 * arg1 + this.anInt3181 * arg2 >> 15);
		arg3[1] = this.anInt3186 + (this.anInt3184 * arg0 + this.anInt3179 * arg1 + this.anInt3178 * arg2 >> 15);
		arg3[2] = this.anInt3183 + (this.anInt3185 * arg0 + this.anInt3180 * arg1 + this.anInt3177 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class1_Sub3_Sub8.anIntArray156[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub3_Sub8.anIntArray159[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class1_Sub3_Sub8.anIntArray156[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class1_Sub3_Sub8.anIntArray159[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class1_Sub3_Sub8.anIntArray156[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class1_Sub3_Sub8.anIntArray159[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt3187 = local17 * local29 + local23 * local47 >> 15;
		this.anInt3184 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt3185 = local23 * local5 >> 15;
		this.anInt3182 = local5 * local35 >> 15;
		this.anInt3179 = local5 * local29 >> 15;
		this.anInt3180 = -local11;
		this.anInt3181 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt3178 = local23 * local35 + local17 * local41 >> 15;
		this.anInt3177 = local17 * local5 >> 15;
		this.anInt3176 = -arg0 * this.anInt3187 - arg1 * this.anInt3182 - arg2 * this.anInt3181 >> 15;
		this.anInt3186 = -arg0 * this.anInt3184 - arg1 * this.anInt3179 - arg2 * this.anInt3178 >> 15;
		this.anInt3183 = -arg0 * this.anInt3185 - arg1 * this.anInt3180 - arg2 * this.anInt3177 >> 15;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "()Lclient!jo;")
	public Class109_Sub1 method2920() {
		@Pc(3) Class109_Sub1 local3 = new Class109_Sub1();
		local3.anInt3187 = this.anInt3187;
		local3.anInt3182 = this.anInt3182;
		local3.anInt3181 = this.anInt3181;
		local3.anInt3176 = this.anInt3176;
		local3.anInt3184 = this.anInt3184;
		local3.anInt3179 = this.anInt3179;
		local3.anInt3178 = this.anInt3178;
		local3.anInt3186 = this.anInt3186;
		local3.anInt3185 = this.anInt3185;
		local3.anInt3180 = this.anInt3180;
		local3.anInt3177 = this.anInt3177;
		local3.anInt3183 = this.anInt3183;
		return local3;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V")
	@Override
	public void method3868(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub3_Sub8.anIntArray156[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub3_Sub8.anIntArray159[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3187;
		@Pc(17) int local17 = this.anInt3182;
		@Pc(20) int local20 = this.anInt3181;
		@Pc(23) int local23 = this.anInt3176;
		this.anInt3187 = local14 * local5 + this.anInt3185 * local11 >> 15;
		this.anInt3185 = this.anInt3185 * local5 - local14 * local11 >> 15;
		this.anInt3182 = local17 * local5 + this.anInt3180 * local11 >> 15;
		this.anInt3180 = this.anInt3180 * local5 - local17 * local11 >> 15;
		this.anInt3181 = local20 * local5 + this.anInt3177 * local11 >> 15;
		this.anInt3177 = this.anInt3177 * local5 - local20 * local11 >> 15;
		this.anInt3176 = local23 * local5 + this.anInt3183 * local11 >> 15;
		this.anInt3183 = this.anInt3183 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	@Override
	public void method3864(@OriginalArg(0) int arg0) {
		this.anInt3177 = 32768;
		this.anInt3187 = this.anInt3179 = Class1_Sub3_Sub8.anIntArray156[arg0 & 0x3FFF];
		this.anInt3184 = Class1_Sub3_Sub8.anIntArray159[arg0 & 0x3FFF];
		this.anInt3182 = -this.anInt3184;
		this.anInt3181 = this.anInt3176 = this.anInt3178 = this.anInt3186 = this.anInt3185 = this.anInt3180 = this.anInt3183 = 0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	@Override
	public void method3873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3184 = this.anInt3185 = this.anInt3182 = this.anInt3180 = this.anInt3181 = this.anInt3178 = 0;
		this.anInt3187 = this.anInt3179 = this.anInt3177 = 32768;
		this.anInt3176 = arg0;
		this.anInt3186 = arg1;
		this.anInt3183 = arg2;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!wr;)V")
	@Override
	public void method3870(@OriginalArg(0) Class109 arg0) {
		@Pc(2) Class109_Sub1 local2 = (Class109_Sub1) arg0;
		this.anInt3187 = local2.anInt3187;
		this.anInt3182 = local2.anInt3182;
		this.anInt3181 = local2.anInt3181;
		this.anInt3176 = local2.anInt3176;
		this.anInt3184 = local2.anInt3184;
		this.anInt3179 = local2.anInt3179;
		this.anInt3178 = local2.anInt3178;
		this.anInt3186 = local2.anInt3186;
		this.anInt3185 = local2.anInt3185;
		this.anInt3180 = local2.anInt3180;
		this.anInt3177 = local2.anInt3177;
		this.anInt3183 = local2.anInt3183;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	@Override
	public void method3866(@OriginalArg(0) int arg0) {
		this.anInt3187 = 32768;
		this.anInt3179 = this.anInt3177 = Class1_Sub3_Sub8.anIntArray156[arg0 & 0x3FFF];
		this.anInt3180 = Class1_Sub3_Sub8.anIntArray159[arg0 & 0x3FFF];
		this.anInt3178 = -this.anInt3180;
		this.anInt3182 = this.anInt3181 = this.anInt3176 = this.anInt3184 = this.anInt3186 = this.anInt3185 = this.anInt3183 = 0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "()V")
	@Override
	public void method3875() {
		this.anInt3184 = this.anInt3185 = this.anInt3182 = this.anInt3180 = this.anInt3181 = this.anInt3178 = this.anInt3176 = this.anInt3186 = this.anInt3183 = 0;
		this.anInt3187 = this.anInt3179 = this.anInt3177 = 32768;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "([I)V")
	@Override
	public void method3879(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt3176;
		@Pc(13) int local13 = arg0[1] - this.anInt3186;
		@Pc(20) int local20 = arg0[2] - this.anInt3183;
		arg0[0] = this.anInt3187 * local6 + this.anInt3184 * local13 + this.anInt3185 * local20 >> 15;
		arg0[1] = this.anInt3182 * local6 + this.anInt3179 * local13 + this.anInt3180 * local20 >> 15;
		arg0[2] = this.anInt3181 * local6 + this.anInt3178 * local13 + this.anInt3177 * local20 >> 15;
	}
}
