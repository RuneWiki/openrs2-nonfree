import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
	public int anInt951;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
	public int anInt952;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
	public int anInt953;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
	public int anInt955;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	public int anInt956;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	public int anInt957;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
	public int anInt958;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
	public int anInt959;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
	public int anInt960;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
	public int anInt961;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
	public int anInt962;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class40_Sub1() {
		this.HA();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt956 + (this.anInt960 * arg0 + this.anInt954 * arg1 + this.anInt962 * arg2 >> 15);
		arg3[1] = this.anInt952 + (this.anInt961 * arg0 + this.anInt959 * arg1 + this.anInt951 * arg2 >> 15);
		arg3[2] = this.anInt957 + (this.anInt953 * arg0 + this.anInt958 * arg1 + this.anInt955 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!cm", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.anInt960 = 32768;
		this.anInt959 = this.anInt955 = Class1_Sub1_Sub25.anIntArray248[arg0 & 0x3FFF];
		this.anInt958 = Class1_Sub1_Sub25.anIntArray249[arg0 & 0x3FFF];
		this.anInt951 = -this.anInt958;
		this.anInt954 = this.anInt962 = this.anInt956 = this.anInt961 = this.anInt952 = this.anInt953 = this.anInt957 = 0;
	}

	@OriginalMember(owner = "client!cm", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt959 = 32768;
		this.anInt960 = this.anInt955 = Class1_Sub1_Sub25.anIntArray248[arg0 & 0x3FFF];
		this.anInt962 = Class1_Sub1_Sub25.anIntArray249[arg0 & 0x3FFF];
		this.anInt953 = -this.anInt962;
		this.anInt954 = this.anInt956 = this.anInt961 = this.anInt951 = this.anInt952 = this.anInt958 = this.anInt957 = 0;
	}

	@OriginalMember(owner = "client!cm", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt956 += arg0;
		this.anInt952 += arg1;
		this.anInt957 += arg2;
	}

	@OriginalMember(owner = "client!cm", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt961 = this.anInt953 = this.anInt954 = this.anInt958 = this.anInt962 = this.anInt951 = 0;
		this.anInt960 = this.anInt959 = this.anInt955 = 32768;
		this.anInt956 = arg0;
		this.anInt952 = arg1;
		this.anInt957 = arg2;
	}

	@OriginalMember(owner = "client!cm", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub1_Sub25.anIntArray248[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub1_Sub25.anIntArray249[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt961;
		@Pc(17) int local17 = this.anInt959;
		@Pc(20) int local20 = this.anInt951;
		@Pc(23) int local23 = this.anInt952;
		this.anInt961 = local14 * local5 - this.anInt953 * local11 >> 15;
		this.anInt953 = local14 * local11 + this.anInt953 * local5 >> 15;
		this.anInt959 = local17 * local5 - this.anInt958 * local11 >> 15;
		this.anInt958 = local17 * local11 + this.anInt958 * local5 >> 15;
		this.anInt951 = local20 * local5 - this.anInt955 * local11 >> 15;
		this.anInt955 = local20 * local11 + this.anInt955 * local5 >> 15;
		this.anInt952 = local23 * local5 - this.anInt957 * local11 >> 15;
		this.anInt957 = local23 * local11 + this.anInt957 * local5 >> 15;
	}

	@OriginalMember(owner = "client!cm", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt960 * arg0 + this.anInt954 * arg1 + this.anInt962 * arg2 >> 15;
		arg3[1] = this.anInt961 * arg0 + this.anInt959 * arg1 + this.anInt951 * arg2 >> 15;
		arg3[2] = this.anInt953 * arg0 + this.anInt958 * arg1 + this.anInt955 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!cm", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class1_Sub1_Sub25.anIntArray248[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub1_Sub25.anIntArray249[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class1_Sub1_Sub25.anIntArray248[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class1_Sub1_Sub25.anIntArray249[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class1_Sub1_Sub25.anIntArray248[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class1_Sub1_Sub25.anIntArray249[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt960 = local17 * local29 + local23 * local47 >> 15;
		this.anInt961 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt953 = local23 * local5 >> 15;
		this.anInt954 = local5 * local35 >> 15;
		this.anInt959 = local5 * local29 >> 15;
		this.anInt958 = -local11;
		this.anInt962 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt951 = local23 * local35 + local17 * local41 >> 15;
		this.anInt955 = local17 * local5 >> 15;
		this.anInt956 = -arg0 * this.anInt960 - arg1 * this.anInt954 - arg2 * this.anInt962 >> 15;
		this.anInt952 = -arg0 * this.anInt961 - arg1 * this.anInt959 - arg2 * this.anInt951 >> 15;
		this.anInt957 = -arg0 * this.anInt953 - arg1 * this.anInt958 - arg2 * this.anInt955 >> 15;
	}

	@OriginalMember(owner = "client!cm", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt955 = 32768;
		this.anInt960 = this.anInt959 = Class1_Sub1_Sub25.anIntArray248[arg0 & 0x3FFF];
		this.anInt961 = Class1_Sub1_Sub25.anIntArray249[arg0 & 0x3FFF];
		this.anInt954 = -this.anInt961;
		this.anInt962 = this.anInt956 = this.anInt951 = this.anInt952 = this.anInt953 = this.anInt958 = this.anInt957 = 0;
	}

	@OriginalMember(owner = "client!cm", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class40 arg0) {
		@Pc(2) Class40_Sub1 local2 = (Class40_Sub1) arg0;
		this.anInt960 = local2.anInt960;
		this.anInt954 = local2.anInt954;
		this.anInt962 = local2.anInt962;
		this.anInt956 = local2.anInt956;
		this.anInt961 = local2.anInt961;
		this.anInt959 = local2.anInt959;
		this.anInt951 = local2.anInt951;
		this.anInt952 = local2.anInt952;
		this.anInt953 = local2.anInt953;
		this.anInt958 = local2.anInt958;
		this.anInt955 = local2.anInt955;
		this.anInt957 = local2.anInt957;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class40 method4635() {
		@Pc(3) Class40_Sub1 local3 = new Class40_Sub1();
		local3.anInt960 = this.anInt960;
		local3.anInt954 = this.anInt954;
		local3.anInt962 = this.anInt962;
		local3.anInt956 = this.anInt956;
		local3.anInt961 = this.anInt961;
		local3.anInt959 = this.anInt959;
		local3.anInt951 = this.anInt951;
		local3.anInt952 = this.anInt952;
		local3.anInt953 = this.anInt953;
		local3.anInt958 = this.anInt958;
		local3.anInt955 = this.anInt955;
		local3.anInt957 = this.anInt957;
		return local3;
	}

	@OriginalMember(owner = "client!cm", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.anInt961 = this.anInt953 = this.anInt954 = this.anInt958 = this.anInt962 = this.anInt951 = this.anInt956 = this.anInt952 = this.anInt957 = 0;
		this.anInt960 = this.anInt959 = this.anInt955 = 32768;
	}

	@OriginalMember(owner = "client!cm", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt956;
		@Pc(13) int local13 = arg0[1] - this.anInt952;
		@Pc(20) int local20 = arg0[2] - this.anInt957;
		arg0[0] = this.anInt960 * local6 + this.anInt961 * local13 + this.anInt953 * local20 >> 15;
		arg0[1] = this.anInt954 * local6 + this.anInt959 * local13 + this.anInt958 * local20 >> 15;
		arg0[2] = this.anInt962 * local6 + this.anInt951 * local13 + this.anInt955 * local20 >> 15;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub1_Sub25.anIntArray248[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub1_Sub25.anIntArray249[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt960;
		@Pc(17) int local17 = this.anInt954;
		@Pc(20) int local20 = this.anInt962;
		@Pc(23) int local23 = this.anInt956;
		this.anInt960 = local14 * local5 + this.anInt953 * local11 >> 15;
		this.anInt953 = this.anInt953 * local5 - local14 * local11 >> 15;
		this.anInt954 = local17 * local5 + this.anInt958 * local11 >> 15;
		this.anInt958 = this.anInt958 * local5 - local17 * local11 >> 15;
		this.anInt962 = local20 * local5 + this.anInt955 * local11 >> 15;
		this.anInt955 = this.anInt955 * local5 - local20 * local11 >> 15;
		this.anInt956 = local23 * local5 + this.anInt957 * local11 >> 15;
		this.anInt957 = this.anInt957 * local5 - local23 * local11 >> 15;
	}
}
