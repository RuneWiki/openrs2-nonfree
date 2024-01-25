import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
	public int anInt4159;

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
	public int anInt4160;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
	public int anInt4161;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
	public int anInt4162;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
	public int anInt4163;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
	public int anInt4164;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
	public int anInt4165;

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
	public int anInt4166;

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
	public int anInt4167;

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
	public int anInt4168;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
	public int anInt4169;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
	public int anInt4170;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class21_Sub2() {
		this.method3699();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class106.anIntArray242[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class106.anIntArray240[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class106.anIntArray242[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class106.anIntArray240[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class106.anIntArray242[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class106.anIntArray240[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt4163 = local17 * local29 + local23 * local47 >> 15;
		this.anInt4169 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt4165 = local23 * local5 >> 15;
		this.anInt4166 = local5 * local35 >> 15;
		this.anInt4164 = local5 * local29 >> 15;
		this.anInt4170 = -local11;
		this.anInt4168 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt4162 = local23 * local35 + local17 * local41 >> 15;
		this.anInt4167 = local17 * local5 >> 15;
		this.anInt4159 = -arg0 * this.anInt4163 - arg1 * this.anInt4166 - arg2 * this.anInt4168 >> 15;
		this.anInt4160 = -arg0 * this.anInt4169 - arg1 * this.anInt4164 - arg2 * this.anInt4162 >> 15;
		this.anInt4161 = -arg0 * this.anInt4165 - arg1 * this.anInt4170 - arg2 * this.anInt4167 >> 15;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)V")
	@Override
	public void method3701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4159 += arg0;
		this.anInt4160 += arg1;
		this.anInt4161 += arg2;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([I)V")
	@Override
	public void method3702(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt4159;
		@Pc(13) int local13 = arg0[1] - this.anInt4160;
		@Pc(20) int local20 = arg0[2] - this.anInt4161;
		arg0[0] = this.anInt4163 * local6 + this.anInt4169 * local13 + this.anInt4165 * local20 >> 15;
		arg0[1] = this.anInt4166 * local6 + this.anInt4164 * local13 + this.anInt4170 * local20 >> 15;
		arg0[2] = this.anInt4168 * local6 + this.anInt4162 * local13 + this.anInt4167 * local20 >> 15;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	@Override
	public void method3703(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class106.anIntArray242[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class106.anIntArray240[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4169;
		@Pc(17) int local17 = this.anInt4164;
		@Pc(20) int local20 = this.anInt4162;
		@Pc(23) int local23 = this.anInt4160;
		this.anInt4169 = local14 * local5 - this.anInt4165 * local11 >> 15;
		this.anInt4165 = local14 * local11 + this.anInt4165 * local5 >> 15;
		this.anInt4164 = local17 * local5 - this.anInt4170 * local11 >> 15;
		this.anInt4170 = local17 * local11 + this.anInt4170 * local5 >> 15;
		this.anInt4162 = local20 * local5 - this.anInt4167 * local11 >> 15;
		this.anInt4167 = local20 * local11 + this.anInt4167 * local5 >> 15;
		this.anInt4160 = local23 * local5 - this.anInt4161 * local11 >> 15;
		this.anInt4161 = local23 * local11 + this.anInt4161 * local5 >> 15;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(III)V")
	@Override
	public void method3711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4169 = this.anInt4165 = this.anInt4166 = this.anInt4170 = this.anInt4168 = this.anInt4162 = 0;
		this.anInt4163 = this.anInt4164 = this.anInt4167 = 32768;
		this.anInt4159 = arg0;
		this.anInt4160 = arg1;
		this.anInt4161 = arg2;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
	@Override
	public void method3706(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class106.anIntArray242[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class106.anIntArray240[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt4163;
		@Pc(17) int local17 = this.anInt4166;
		@Pc(20) int local20 = this.anInt4168;
		@Pc(23) int local23 = this.anInt4159;
		this.anInt4163 = local14 * local5 + this.anInt4165 * local11 >> 15;
		this.anInt4165 = this.anInt4165 * local5 - local14 * local11 >> 15;
		this.anInt4166 = local17 * local5 + this.anInt4170 * local11 >> 15;
		this.anInt4170 = this.anInt4170 * local5 - local17 * local11 >> 15;
		this.anInt4168 = local20 * local5 + this.anInt4167 * local11 >> 15;
		this.anInt4167 = this.anInt4167 * local5 - local20 * local11 >> 15;
		this.anInt4159 = local23 * local5 + this.anInt4161 * local11 >> 15;
		this.anInt4161 = this.anInt4161 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
	@Override
	public void method3709(@OriginalArg(0) int arg0) {
		this.anInt4167 = 32768;
		this.anInt4163 = this.anInt4164 = Class106.anIntArray242[arg0 & 0x3FFF];
		this.anInt4169 = Class106.anIntArray240[arg0 & 0x3FFF];
		this.anInt4166 = -this.anInt4169;
		this.anInt4168 = this.anInt4159 = this.anInt4162 = this.anInt4160 = this.anInt4165 = this.anInt4170 = this.anInt4161 = 0;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "()Lclient!lr;")
	public Class21_Sub2 method3712() {
		@Pc(3) Class21_Sub2 local3 = new Class21_Sub2();
		local3.anInt4163 = this.anInt4163;
		local3.anInt4166 = this.anInt4166;
		local3.anInt4168 = this.anInt4168;
		local3.anInt4159 = this.anInt4159;
		local3.anInt4169 = this.anInt4169;
		local3.anInt4164 = this.anInt4164;
		local3.anInt4162 = this.anInt4162;
		local3.anInt4160 = this.anInt4160;
		local3.anInt4165 = this.anInt4165;
		local3.anInt4170 = this.anInt4170;
		local3.anInt4167 = this.anInt4167;
		local3.anInt4161 = this.anInt4161;
		return local3;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt4159 + (this.anInt4163 * arg0 + this.anInt4166 * arg1 + this.anInt4168 * arg2 >> 15);
		arg3[1] = this.anInt4160 + (this.anInt4169 * arg0 + this.anInt4164 * arg1 + this.anInt4162 * arg2 >> 15);
		arg3[2] = this.anInt4161 + (this.anInt4165 * arg0 + this.anInt4170 * arg1 + this.anInt4167 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
	@Override
	public void method3708(@OriginalArg(0) int arg0) {
		this.anInt4164 = 32768;
		this.anInt4163 = this.anInt4167 = Class106.anIntArray242[arg0 & 0x3FFF];
		this.anInt4168 = Class106.anIntArray240[arg0 & 0x3FFF];
		this.anInt4165 = -this.anInt4168;
		this.anInt4166 = this.anInt4159 = this.anInt4169 = this.anInt4162 = this.anInt4160 = this.anInt4170 = this.anInt4161 = 0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!bd;)V")
	@Override
	public void method3700(@OriginalArg(0) Class21 arg0) {
		@Pc(2) Class21_Sub2 local2 = (Class21_Sub2) arg0;
		this.anInt4163 = local2.anInt4163;
		this.anInt4166 = local2.anInt4166;
		this.anInt4168 = local2.anInt4168;
		this.anInt4159 = local2.anInt4159;
		this.anInt4169 = local2.anInt4169;
		this.anInt4164 = local2.anInt4164;
		this.anInt4162 = local2.anInt4162;
		this.anInt4160 = local2.anInt4160;
		this.anInt4165 = local2.anInt4165;
		this.anInt4170 = local2.anInt4170;
		this.anInt4167 = local2.anInt4167;
		this.anInt4161 = local2.anInt4161;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	@Override
	public void method3707(@OriginalArg(0) int arg0) {
		this.anInt4163 = 32768;
		this.anInt4164 = this.anInt4167 = Class106.anIntArray242[arg0 & 0x3FFF];
		this.anInt4170 = Class106.anIntArray240[arg0 & 0x3FFF];
		this.anInt4162 = -this.anInt4170;
		this.anInt4166 = this.anInt4168 = this.anInt4159 = this.anInt4169 = this.anInt4160 = this.anInt4165 = this.anInt4161 = 0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()V")
	@Override
	public void method3699() {
		this.anInt4169 = this.anInt4165 = this.anInt4166 = this.anInt4170 = this.anInt4168 = this.anInt4162 = this.anInt4159 = this.anInt4160 = this.anInt4161 = 0;
		this.anInt4163 = this.anInt4164 = this.anInt4167 = 32768;
	}
}
