import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	public int anInt1070;

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
	public int anInt1071;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
	public int anInt1072;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	public int anInt1073;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
	public int anInt1074;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	public int anInt1075;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
	public int anInt1076;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
	public int anInt1077;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
	public int anInt1078;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
	public int anInt1079;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
	public int anInt1081;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class22_Sub1() {
		this.ha();
	}

	@OriginalMember(owner = "client!ba", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.anInt1079 = 32768;
		this.anInt1076 = this.anInt1074 = Class307.anIntArray743[arg0 & 0x3FFF];
		this.anInt1078 = Class307.anIntArray744[arg0 & 0x3FFF];
		this.anInt1081 = -this.anInt1078;
		this.anInt1075 = this.anInt1073 = this.anInt1077 = this.anInt1080 = this.anInt1071 = this.anInt1070 = this.anInt1072 = 0;
	}

	@OriginalMember(owner = "client!ba", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1073 += arg0;
		this.anInt1080 += arg1;
		this.anInt1072 += arg2;
	}

	@OriginalMember(owner = "client!ba", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class307.anIntArray743[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class307.anIntArray744[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1076;
		@Pc(17) int local17 = this.anInt1081;
		@Pc(20) int local20 = this.anInt1075;
		@Pc(23) int local23 = this.anInt1073;
		this.anInt1076 = local14 * local5 + this.anInt1071 * local11 >> 15;
		this.anInt1071 = this.anInt1071 * local5 - local14 * local11 >> 15;
		this.anInt1081 = local17 * local5 + this.anInt1070 * local11 >> 15;
		this.anInt1070 = this.anInt1070 * local5 - local17 * local11 >> 15;
		this.anInt1075 = local20 * local5 + this.anInt1079 * local11 >> 15;
		this.anInt1079 = this.anInt1079 * local5 - local20 * local11 >> 15;
		this.anInt1073 = local23 * local5 + this.anInt1072 * local11 >> 15;
		this.anInt1072 = this.anInt1072 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ba", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.anInt1078 = this.anInt1071 = this.anInt1081 = this.anInt1070 = this.anInt1075 = this.anInt1077 = this.anInt1073 = this.anInt1080 = this.anInt1072 = 0;
		this.anInt1076 = this.anInt1074 = this.anInt1079 = 32768;
	}

	@OriginalMember(owner = "client!ba", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class22 arg0) {
		@Pc(2) Class22_Sub1 local2 = (Class22_Sub1) arg0;
		this.anInt1076 = local2.anInt1076;
		this.anInt1081 = local2.anInt1081;
		this.anInt1075 = local2.anInt1075;
		this.anInt1073 = local2.anInt1073;
		this.anInt1078 = local2.anInt1078;
		this.anInt1074 = local2.anInt1074;
		this.anInt1077 = local2.anInt1077;
		this.anInt1080 = local2.anInt1080;
		this.anInt1071 = local2.anInt1071;
		this.anInt1070 = local2.anInt1070;
		this.anInt1079 = local2.anInt1079;
		this.anInt1072 = local2.anInt1072;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class22 method5945() {
		@Pc(3) Class22_Sub1 local3 = new Class22_Sub1();
		local3.anInt1076 = this.anInt1076;
		local3.anInt1081 = this.anInt1081;
		local3.anInt1075 = this.anInt1075;
		local3.anInt1073 = this.anInt1073;
		local3.anInt1078 = this.anInt1078;
		local3.anInt1074 = this.anInt1074;
		local3.anInt1077 = this.anInt1077;
		local3.anInt1080 = this.anInt1080;
		local3.anInt1071 = this.anInt1071;
		local3.anInt1070 = this.anInt1070;
		local3.anInt1079 = this.anInt1079;
		local3.anInt1072 = this.anInt1072;
		return local3;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1073 + (this.anInt1076 * arg0 + this.anInt1081 * arg1 + this.anInt1075 * arg2 >> 15);
		arg3[1] = this.anInt1080 + (this.anInt1078 * arg0 + this.anInt1074 * arg1 + this.anInt1077 * arg2 >> 15);
		arg3[2] = this.anInt1072 + (this.anInt1071 * arg0 + this.anInt1070 * arg1 + this.anInt1079 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class307.anIntArray743[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class307.anIntArray744[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class307.anIntArray743[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class307.anIntArray744[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class307.anIntArray743[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class307.anIntArray744[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt1076 = local17 * local29 + local23 * local47 >> 15;
		this.anInt1078 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt1071 = local23 * local5 >> 15;
		this.anInt1081 = local5 * local35 >> 15;
		this.anInt1074 = local5 * local29 >> 15;
		this.anInt1070 = -local11;
		this.anInt1075 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt1077 = local23 * local35 + local17 * local41 >> 15;
		this.anInt1079 = local17 * local5 >> 15;
		this.anInt1073 = -arg0 * this.anInt1076 - arg1 * this.anInt1081 - arg2 * this.anInt1075 >> 15;
		this.anInt1080 = -arg0 * this.anInt1078 - arg1 * this.anInt1074 - arg2 * this.anInt1077 >> 15;
		this.anInt1072 = -arg0 * this.anInt1071 - arg1 * this.anInt1070 - arg2 * this.anInt1079 >> 15;
	}

	@OriginalMember(owner = "client!ba", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt1073;
		@Pc(13) int local13 = arg0[1] - this.anInt1080;
		@Pc(20) int local20 = arg0[2] - this.anInt1072;
		arg0[0] = this.anInt1076 * local6 + this.anInt1078 * local13 + this.anInt1071 * local20 >> 15;
		arg0[1] = this.anInt1081 * local6 + this.anInt1074 * local13 + this.anInt1070 * local20 >> 15;
		arg0[2] = this.anInt1075 * local6 + this.anInt1077 * local13 + this.anInt1079 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class307.anIntArray743[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class307.anIntArray744[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1078;
		@Pc(17) int local17 = this.anInt1074;
		@Pc(20) int local20 = this.anInt1077;
		@Pc(23) int local23 = this.anInt1080;
		this.anInt1078 = local14 * local5 - this.anInt1071 * local11 >> 15;
		this.anInt1071 = local14 * local11 + this.anInt1071 * local5 >> 15;
		this.anInt1074 = local17 * local5 - this.anInt1070 * local11 >> 15;
		this.anInt1070 = local17 * local11 + this.anInt1070 * local5 >> 15;
		this.anInt1077 = local20 * local5 - this.anInt1079 * local11 >> 15;
		this.anInt1079 = local20 * local11 + this.anInt1079 * local5 >> 15;
		this.anInt1080 = local23 * local5 - this.anInt1072 * local11 >> 15;
		this.anInt1072 = local23 * local11 + this.anInt1072 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ba", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt1074 = 32768;
		this.anInt1076 = this.anInt1079 = Class307.anIntArray743[arg0 & 0x3FFF];
		this.anInt1075 = Class307.anIntArray744[arg0 & 0x3FFF];
		this.anInt1071 = -this.anInt1075;
		this.anInt1081 = this.anInt1073 = this.anInt1078 = this.anInt1077 = this.anInt1080 = this.anInt1070 = this.anInt1072 = 0;
	}

	@OriginalMember(owner = "client!ba", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1078 = this.anInt1071 = this.anInt1081 = this.anInt1070 = this.anInt1075 = this.anInt1077 = 0;
		this.anInt1076 = this.anInt1074 = this.anInt1079 = 32768;
		this.anInt1073 = arg0;
		this.anInt1080 = arg1;
		this.anInt1072 = arg2;
	}

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1076 * arg0 + this.anInt1081 * arg1 + this.anInt1075 * arg2 >> 15;
		arg3[1] = this.anInt1078 * arg0 + this.anInt1074 * arg1 + this.anInt1077 * arg2 >> 15;
		arg3[2] = this.anInt1071 * arg0 + this.anInt1070 * arg1 + this.anInt1079 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!ba", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.anInt1076 = 32768;
		this.anInt1074 = this.anInt1079 = Class307.anIntArray743[arg0 & 0x3FFF];
		this.anInt1070 = Class307.anIntArray744[arg0 & 0x3FFF];
		this.anInt1077 = -this.anInt1070;
		this.anInt1081 = this.anInt1075 = this.anInt1073 = this.anInt1078 = this.anInt1080 = this.anInt1071 = this.anInt1072 = 0;
	}
}
