import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
	public int anInt141;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
	public int anInt142;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	public int anInt143;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
	public int anInt144;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
	public int anInt148;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
	public int anInt149;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class5_Sub1() {
		this.method3842();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	@Override
	public void method3835(@OriginalArg(0) int arg0) {
		this.anInt142 = 32768;
		this.anInt141 = this.anInt144 = Class145.anIntArray280[arg0 & 0x3FFF];
		this.anInt138 = Class145.anIntArray279[arg0 & 0x3FFF];
		this.anInt139 = -this.anInt138;
		this.anInt149 = this.anInt148 = this.anInt143 = this.anInt147 = this.anInt140 = this.anInt146 = this.anInt145 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
	@Override
	public void method3844(@OriginalArg(0) int arg0) {
		this.anInt141 = 32768;
		this.anInt142 = this.anInt144 = Class145.anIntArray280[arg0 & 0x3FFF];
		this.anInt148 = Class145.anIntArray279[arg0 & 0x3FFF];
		this.anInt146 = -this.anInt148;
		this.anInt149 = this.anInt143 = this.anInt147 = this.anInt139 = this.anInt140 = this.anInt138 = this.anInt145 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)V")
	@Override
	public void method3846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt147 = this.anInt146 = this.anInt149 = this.anInt138 = this.anInt148 = this.anInt139 = 0;
		this.anInt142 = this.anInt141 = this.anInt144 = 32768;
		this.anInt143 = arg0;
		this.anInt140 = arg1;
		this.anInt145 = arg2;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt142 * arg0 + this.anInt149 * arg1 + this.anInt148 * arg2 >> 15;
		arg3[1] = this.anInt147 * arg0 + this.anInt141 * arg1 + this.anInt139 * arg2 >> 15;
		arg3[2] = this.anInt146 * arg0 + this.anInt138 * arg1 + this.anInt144 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	@Override
	public void method3836(@OriginalArg(0) int arg0) {
		this.anInt144 = 32768;
		this.anInt142 = this.anInt141 = Class145.anIntArray280[arg0 & 0x3FFF];
		this.anInt147 = Class145.anIntArray279[arg0 & 0x3FFF];
		this.anInt149 = -this.anInt147;
		this.anInt148 = this.anInt143 = this.anInt139 = this.anInt140 = this.anInt146 = this.anInt138 = this.anInt145 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class145.anIntArray280[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class145.anIntArray279[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class145.anIntArray280[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class145.anIntArray279[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class145.anIntArray280[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class145.anIntArray279[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt142 = local17 * local29 + local23 * local47 >> 15;
		this.anInt147 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt146 = local23 * local5 >> 15;
		this.anInt149 = local5 * local35 >> 15;
		this.anInt141 = local5 * local29 >> 15;
		this.anInt138 = -local11;
		this.anInt148 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt139 = local23 * local35 + local17 * local41 >> 15;
		this.anInt144 = local17 * local5 >> 15;
		this.anInt143 = -arg0 * this.anInt142 - arg1 * this.anInt149 - arg2 * this.anInt148 >> 15;
		this.anInt140 = -arg0 * this.anInt147 - arg1 * this.anInt141 - arg2 * this.anInt139 >> 15;
		this.anInt145 = -arg0 * this.anInt146 - arg1 * this.anInt138 - arg2 * this.anInt144 >> 15;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
	@Override
	public void method3842() {
		this.anInt147 = this.anInt146 = this.anInt149 = this.anInt138 = this.anInt148 = this.anInt139 = this.anInt143 = this.anInt140 = this.anInt145 = 0;
		this.anInt142 = this.anInt141 = this.anInt144 = 32768;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(III[I)V")
	@Override
	public void method3841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt143 + (this.anInt142 * arg0 + this.anInt149 * arg1 + this.anInt148 * arg2 >> 15);
		arg3[1] = this.anInt140 + (this.anInt147 * arg0 + this.anInt141 * arg1 + this.anInt139 * arg2 >> 15);
		arg3[2] = this.anInt145 + (this.anInt146 * arg0 + this.anInt138 * arg1 + this.anInt144 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
	@Override
	public void method3847(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class145.anIntArray280[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class145.anIntArray279[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt142;
		@Pc(17) int local17 = this.anInt149;
		@Pc(20) int local20 = this.anInt148;
		@Pc(23) int local23 = this.anInt143;
		this.anInt142 = local14 * local5 + this.anInt146 * local11 >> 15;
		this.anInt146 = this.anInt146 * local5 - local14 * local11 >> 15;
		this.anInt149 = local17 * local5 + this.anInt138 * local11 >> 15;
		this.anInt138 = this.anInt138 * local5 - local17 * local11 >> 15;
		this.anInt148 = local20 * local5 + this.anInt144 * local11 >> 15;
		this.anInt144 = this.anInt144 * local5 - local20 * local11 >> 15;
		this.anInt143 = local23 * local5 + this.anInt145 * local11 >> 15;
		this.anInt145 = this.anInt145 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!gs;)V")
	@Override
	public void method3834(@OriginalArg(0) Class5 arg0) {
		@Pc(2) Class5_Sub1 local2 = (Class5_Sub1) arg0;
		this.anInt142 = local2.anInt142;
		this.anInt149 = local2.anInt149;
		this.anInt148 = local2.anInt148;
		this.anInt143 = local2.anInt143;
		this.anInt147 = local2.anInt147;
		this.anInt141 = local2.anInt141;
		this.anInt139 = local2.anInt139;
		this.anInt140 = local2.anInt140;
		this.anInt146 = local2.anInt146;
		this.anInt138 = local2.anInt138;
		this.anInt144 = local2.anInt144;
		this.anInt145 = local2.anInt145;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	@Override
	public void method3838(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class145.anIntArray280[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class145.anIntArray279[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt147;
		@Pc(17) int local17 = this.anInt141;
		@Pc(20) int local20 = this.anInt139;
		@Pc(23) int local23 = this.anInt140;
		this.anInt147 = local14 * local5 - this.anInt146 * local11 >> 15;
		this.anInt146 = local14 * local11 + this.anInt146 * local5 >> 15;
		this.anInt141 = local17 * local5 - this.anInt138 * local11 >> 15;
		this.anInt138 = local17 * local11 + this.anInt138 * local5 >> 15;
		this.anInt139 = local20 * local5 - this.anInt144 * local11 >> 15;
		this.anInt144 = local20 * local11 + this.anInt144 * local5 >> 15;
		this.anInt140 = local23 * local5 - this.anInt145 * local11 >> 15;
		this.anInt145 = local23 * local11 + this.anInt145 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	@Override
	public void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt143 += arg0;
		this.anInt140 += arg1;
		this.anInt145 += arg2;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()Lclient!gs;")
	public Class5 method109() {
		@Pc(3) Class5_Sub1 local3 = new Class5_Sub1();
		local3.anInt142 = this.anInt142;
		local3.anInt149 = this.anInt149;
		local3.anInt148 = this.anInt148;
		local3.anInt143 = this.anInt143;
		local3.anInt147 = this.anInt147;
		local3.anInt141 = this.anInt141;
		local3.anInt139 = this.anInt139;
		local3.anInt140 = this.anInt140;
		local3.anInt146 = this.anInt146;
		local3.anInt138 = this.anInt138;
		local3.anInt144 = this.anInt144;
		local3.anInt145 = this.anInt145;
		return local3;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([I)V")
	@Override
	public void method3840(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt143;
		@Pc(13) int local13 = arg0[1] - this.anInt140;
		@Pc(20) int local20 = arg0[2] - this.anInt145;
		arg0[0] = this.anInt142 * local6 + this.anInt147 * local13 + this.anInt146 * local20 >> 15;
		arg0[1] = this.anInt149 * local6 + this.anInt141 * local13 + this.anInt138 * local20 >> 15;
		arg0[2] = this.anInt148 * local6 + this.anInt139 * local13 + this.anInt144 * local20 >> 15;
	}
}
