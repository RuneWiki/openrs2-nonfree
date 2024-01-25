import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
	public int anInt1072;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
	public int anInt1073;

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
	public int anInt1074;

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
	public int anInt1075;

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
	public int anInt1076;

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
	public int anInt1077;

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
	public int anInt1078;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
	public int anInt1079;

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
	public int anInt1081;

	@OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
	public int anInt1082;

	@OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
	public int anInt1083;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
	public Class33_Sub1() {
		this.xa();
	}

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "(III[I)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1077 * arg0 + this.anInt1082 * arg1 + this.anInt1079 * arg2 >> 15;
		arg3[1] = this.anInt1072 * arg0 + this.anInt1074 * arg1 + this.anInt1083 * arg2 >> 15;
		arg3[2] = this.anInt1075 * arg0 + this.anInt1073 * arg1 + this.anInt1078 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class33 method2435() {
		@Pc(3) Class33_Sub1 local3 = new Class33_Sub1();
		local3.anInt1077 = this.anInt1077;
		local3.anInt1082 = this.anInt1082;
		local3.anInt1079 = this.anInt1079;
		local3.anInt1080 = this.anInt1080;
		local3.anInt1072 = this.anInt1072;
		local3.anInt1074 = this.anInt1074;
		local3.anInt1083 = this.anInt1083;
		local3.anInt1081 = this.anInt1081;
		local3.anInt1075 = this.anInt1075;
		local3.anInt1073 = this.anInt1073;
		local3.anInt1078 = this.anInt1078;
		local3.anInt1076 = this.anInt1076;
		return local3;
	}

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "(III)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1072 = this.anInt1075 = this.anInt1082 = this.anInt1073 = this.anInt1079 = this.anInt1083 = 0;
		this.anInt1077 = this.anInt1074 = this.anInt1078 = 32768;
		this.anInt1080 = arg0;
		this.anInt1081 = arg1;
		this.anInt1076 = arg2;
	}

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "([I)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt1080;
		@Pc(13) int local13 = arg0[1] - this.anInt1081;
		@Pc(20) int local20 = arg0[2] - this.anInt1076;
		arg0[0] = this.anInt1077 * local6 + this.anInt1072 * local13 + this.anInt1075 * local20 >> 15;
		arg0[1] = this.anInt1082 * local6 + this.anInt1074 * local13 + this.anInt1073 * local20 >> 15;
		arg0[2] = this.anInt1079 * local6 + this.anInt1083 * local13 + this.anInt1078 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "(IIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class22_Sub7.anIntArray410[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class22_Sub7.anIntArray411[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class22_Sub7.anIntArray410[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class22_Sub7.anIntArray411[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class22_Sub7.anIntArray410[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class22_Sub7.anIntArray411[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt1077 = local17 * local29 + local23 * local47 >> 15;
		this.anInt1072 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt1075 = local23 * local5 >> 15;
		this.anInt1082 = local5 * local35 >> 15;
		this.anInt1074 = local5 * local29 >> 15;
		this.anInt1073 = -local11;
		this.anInt1079 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt1083 = local23 * local35 + local17 * local41 >> 15;
		this.anInt1078 = local17 * local5 >> 15;
		this.anInt1080 = -arg0 * this.anInt1077 - arg1 * this.anInt1082 - arg2 * this.anInt1079 >> 15;
		this.anInt1081 = -arg0 * this.anInt1072 - arg1 * this.anInt1074 - arg2 * this.anInt1083 >> 15;
		this.anInt1076 = -arg0 * this.anInt1075 - arg1 * this.anInt1073 - arg2 * this.anInt1078 >> 15;
	}

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "(III)V")
	@Override
	public void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1080 += arg0;
		this.anInt1081 += arg1;
		this.anInt1076 += arg2;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1080 + (this.anInt1077 * arg0 + this.anInt1082 * arg1 + this.anInt1079 * arg2 >> 15);
		arg3[1] = this.anInt1081 + (this.anInt1072 * arg0 + this.anInt1074 * arg1 + this.anInt1083 * arg2 >> 15);
		arg3[2] = this.anInt1076 + (this.anInt1075 * arg0 + this.anInt1073 * arg1 + this.anInt1078 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ct", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.anInt1072 = this.anInt1075 = this.anInt1082 = this.anInt1073 = this.anInt1079 = this.anInt1083 = this.anInt1080 = this.anInt1081 = this.anInt1076 = 0;
		this.anInt1077 = this.anInt1074 = this.anInt1078 = 32768;
	}

	@OriginalMember(owner = "client!ct", name = "ka", descriptor = "(I)V")
	@Override
	public void ka(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class22_Sub7.anIntArray410[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class22_Sub7.anIntArray411[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1072;
		@Pc(17) int local17 = this.anInt1074;
		@Pc(20) int local20 = this.anInt1083;
		@Pc(23) int local23 = this.anInt1081;
		this.anInt1072 = local14 * local5 - this.anInt1075 * local11 >> 15;
		this.anInt1075 = local14 * local11 + this.anInt1075 * local5 >> 15;
		this.anInt1074 = local17 * local5 - this.anInt1073 * local11 >> 15;
		this.anInt1073 = local17 * local11 + this.anInt1073 * local5 >> 15;
		this.anInt1083 = local20 * local5 - this.anInt1078 * local11 >> 15;
		this.anInt1078 = local20 * local11 + this.anInt1078 * local5 >> 15;
		this.anInt1081 = local23 * local5 - this.anInt1076 * local11 >> 15;
		this.anInt1076 = local23 * local11 + this.anInt1076 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ct", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class22_Sub7.anIntArray410[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class22_Sub7.anIntArray411[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1077;
		@Pc(17) int local17 = this.anInt1082;
		@Pc(20) int local20 = this.anInt1079;
		@Pc(23) int local23 = this.anInt1080;
		this.anInt1077 = local14 * local5 + this.anInt1075 * local11 >> 15;
		this.anInt1075 = this.anInt1075 * local5 - local14 * local11 >> 15;
		this.anInt1082 = local17 * local5 + this.anInt1073 * local11 >> 15;
		this.anInt1073 = this.anInt1073 * local5 - local17 * local11 >> 15;
		this.anInt1079 = local20 * local5 + this.anInt1078 * local11 >> 15;
		this.anInt1078 = this.anInt1078 * local5 - local20 * local11 >> 15;
		this.anInt1080 = local23 * local5 + this.anInt1076 * local11 >> 15;
		this.anInt1076 = this.anInt1076 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ct", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt1074 = 32768;
		this.anInt1077 = this.anInt1078 = Class22_Sub7.anIntArray410[arg0 & 0x3FFF];
		this.anInt1079 = Class22_Sub7.anIntArray411[arg0 & 0x3FFF];
		this.anInt1075 = -this.anInt1079;
		this.anInt1082 = this.anInt1080 = this.anInt1072 = this.anInt1083 = this.anInt1081 = this.anInt1073 = this.anInt1076 = 0;
	}

	@OriginalMember(owner = "client!ct", name = "za", descriptor = "(Lclient!c;)V")
	@Override
	public void za(@OriginalArg(0) Class33 arg0) {
		@Pc(2) Class33_Sub1 local2 = (Class33_Sub1) arg0;
		this.anInt1077 = local2.anInt1077;
		this.anInt1082 = local2.anInt1082;
		this.anInt1079 = local2.anInt1079;
		this.anInt1080 = local2.anInt1080;
		this.anInt1072 = local2.anInt1072;
		this.anInt1074 = local2.anInt1074;
		this.anInt1083 = local2.anInt1083;
		this.anInt1081 = local2.anInt1081;
		this.anInt1075 = local2.anInt1075;
		this.anInt1073 = local2.anInt1073;
		this.anInt1078 = local2.anInt1078;
		this.anInt1076 = local2.anInt1076;
	}

	@OriginalMember(owner = "client!ct", name = "N", descriptor = "(I)V")
	@Override
	public void N(@OriginalArg(0) int arg0) {
		this.anInt1077 = 32768;
		this.anInt1074 = this.anInt1078 = Class22_Sub7.anIntArray410[arg0 & 0x3FFF];
		this.anInt1073 = Class22_Sub7.anIntArray411[arg0 & 0x3FFF];
		this.anInt1083 = -this.anInt1073;
		this.anInt1082 = this.anInt1079 = this.anInt1080 = this.anInt1072 = this.anInt1081 = this.anInt1075 = this.anInt1076 = 0;
	}

	@OriginalMember(owner = "client!ct", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt1078 = 32768;
		this.anInt1077 = this.anInt1074 = Class22_Sub7.anIntArray410[arg0 & 0x3FFF];
		this.anInt1072 = Class22_Sub7.anIntArray411[arg0 & 0x3FFF];
		this.anInt1082 = -this.anInt1072;
		this.anInt1079 = this.anInt1080 = this.anInt1083 = this.anInt1081 = this.anInt1075 = this.anInt1073 = this.anInt1076 = 0;
	}
}
