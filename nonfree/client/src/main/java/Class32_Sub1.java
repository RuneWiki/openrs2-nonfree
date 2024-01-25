import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
	public int anInt1075;

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
	public int anInt1076;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
	public int anInt1077;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
	public int anInt1078;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
	public int anInt1079;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public int anInt1081;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
	public int anInt1082;

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
	public int anInt1083;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
	public int anInt1084;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
	public int anInt1085;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
	public int anInt1086;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	public Class32_Sub1() {
		this.v();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class32 method4315() {
		@Pc(3) Class32_Sub1 local3 = new Class32_Sub1();
		local3.anInt1086 = this.anInt1086;
		local3.anInt1079 = this.anInt1079;
		local3.anInt1085 = this.anInt1085;
		local3.anInt1084 = this.anInt1084;
		local3.anInt1080 = this.anInt1080;
		local3.anInt1076 = this.anInt1076;
		local3.anInt1081 = this.anInt1081;
		local3.anInt1078 = this.anInt1078;
		local3.anInt1077 = this.anInt1077;
		local3.anInt1083 = this.anInt1083;
		local3.anInt1082 = this.anInt1082;
		local3.anInt1075 = this.anInt1075;
		return local3;
	}

	@OriginalMember(owner = "client!cn", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.anInt1076 = 32768;
		this.anInt1086 = this.anInt1082 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg0 & 0x3FFF];
		this.anInt1085 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg0 & 0x3FFF];
		this.anInt1077 = -this.anInt1085;
		this.anInt1079 = this.anInt1084 = this.anInt1080 = this.anInt1081 = this.anInt1078 = this.anInt1083 = this.anInt1075 = 0;
	}

	@OriginalMember(owner = "client!cn", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.anInt1082 = 32768;
		this.anInt1086 = this.anInt1076 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg0 & 0x3FFF];
		this.anInt1080 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg0 & 0x3FFF];
		this.anInt1079 = -this.anInt1080;
		this.anInt1085 = this.anInt1084 = this.anInt1081 = this.anInt1078 = this.anInt1077 = this.anInt1083 = this.anInt1075 = 0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1084 + (this.anInt1086 * arg0 + this.anInt1079 * arg1 + this.anInt1085 * arg2 >> 15);
		arg3[1] = this.anInt1078 + (this.anInt1080 * arg0 + this.anInt1076 * arg1 + this.anInt1081 * arg2 >> 15);
		arg3[2] = this.anInt1075 + (this.anInt1077 * arg0 + this.anInt1083 * arg1 + this.anInt1082 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!cn", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt1084;
		@Pc(13) int local13 = arg0[1] - this.anInt1078;
		@Pc(20) int local20 = arg0[2] - this.anInt1075;
		arg0[0] = this.anInt1086 * local6 + this.anInt1080 * local13 + this.anInt1077 * local20 >> 15;
		arg0[1] = this.anInt1079 * local6 + this.anInt1076 * local13 + this.anInt1083 * local20 >> 15;
		arg0[2] = this.anInt1085 * local6 + this.anInt1081 * local13 + this.anInt1082 * local20 >> 15;
	}

	@OriginalMember(owner = "client!cn", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1080 = this.anInt1077 = this.anInt1079 = this.anInt1083 = this.anInt1085 = this.anInt1081 = 0;
		this.anInt1086 = this.anInt1076 = this.anInt1082 = 32768;
		this.anInt1084 = arg0;
		this.anInt1078 = arg1;
		this.anInt1075 = arg2;
	}

	@OriginalMember(owner = "client!cn", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1084 += arg0;
		this.anInt1078 += arg1;
		this.anInt1075 += arg2;
	}

	@OriginalMember(owner = "client!cn", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1086;
		@Pc(17) int local17 = this.anInt1079;
		@Pc(20) int local20 = this.anInt1085;
		@Pc(23) int local23 = this.anInt1084;
		this.anInt1086 = local14 * local5 + this.anInt1077 * local11 >> 15;
		this.anInt1077 = this.anInt1077 * local5 - local14 * local11 >> 15;
		this.anInt1079 = local17 * local5 + this.anInt1083 * local11 >> 15;
		this.anInt1083 = this.anInt1083 * local5 - local17 * local11 >> 15;
		this.anInt1085 = local20 * local5 + this.anInt1082 * local11 >> 15;
		this.anInt1082 = this.anInt1082 * local5 - local20 * local11 >> 15;
		this.anInt1084 = local23 * local5 + this.anInt1075 * local11 >> 15;
		this.anInt1075 = this.anInt1075 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.anInt1086 = 32768;
		this.anInt1076 = this.anInt1082 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg0 & 0x3FFF];
		this.anInt1083 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg0 & 0x3FFF];
		this.anInt1081 = -this.anInt1083;
		this.anInt1079 = this.anInt1085 = this.anInt1084 = this.anInt1080 = this.anInt1078 = this.anInt1077 = this.anInt1075 = 0;
	}

	@OriginalMember(owner = "client!cn", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1086 * arg0 + this.anInt1079 * arg1 + this.anInt1085 * arg2 >> 15;
		arg3[1] = this.anInt1080 * arg0 + this.anInt1076 * arg1 + this.anInt1081 * arg2 >> 15;
		arg3[2] = this.anInt1077 * arg0 + this.anInt1083 * arg1 + this.anInt1082 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!cn", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1080;
		@Pc(17) int local17 = this.anInt1076;
		@Pc(20) int local20 = this.anInt1081;
		@Pc(23) int local23 = this.anInt1078;
		this.anInt1080 = local14 * local5 - this.anInt1077 * local11 >> 15;
		this.anInt1077 = local14 * local11 + this.anInt1077 * local5 >> 15;
		this.anInt1076 = local17 * local5 - this.anInt1083 * local11 >> 15;
		this.anInt1083 = local17 * local11 + this.anInt1083 * local5 >> 15;
		this.anInt1081 = local20 * local5 - this.anInt1082 * local11 >> 15;
		this.anInt1082 = local20 * local11 + this.anInt1082 * local5 >> 15;
		this.anInt1078 = local23 * local5 - this.anInt1075 * local11 >> 15;
		this.anInt1075 = local23 * local11 + this.anInt1075 * local5 >> 15;
	}

	@OriginalMember(owner = "client!cn", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class32 arg0) {
		@Pc(2) Class32_Sub1 local2 = (Class32_Sub1) arg0;
		this.anInt1086 = local2.anInt1086;
		this.anInt1079 = local2.anInt1079;
		this.anInt1085 = local2.anInt1085;
		this.anInt1084 = local2.anInt1084;
		this.anInt1080 = local2.anInt1080;
		this.anInt1076 = local2.anInt1076;
		this.anInt1081 = local2.anInt1081;
		this.anInt1078 = local2.anInt1078;
		this.anInt1077 = local2.anInt1077;
		this.anInt1083 = local2.anInt1083;
		this.anInt1082 = local2.anInt1082;
		this.anInt1075 = local2.anInt1075;
	}

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.anInt1080 = this.anInt1077 = this.anInt1079 = this.anInt1083 = this.anInt1085 = this.anInt1081 = this.anInt1084 = this.anInt1078 = this.anInt1075 = 0;
		this.anInt1086 = this.anInt1076 = this.anInt1082 = 32768;
	}

	@OriginalMember(owner = "client!cn", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt1086 = local17 * local29 + local23 * local47 >> 15;
		this.anInt1080 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt1077 = local23 * local5 >> 15;
		this.anInt1079 = local5 * local35 >> 15;
		this.anInt1076 = local5 * local29 >> 15;
		this.anInt1083 = -local11;
		this.anInt1085 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt1081 = local23 * local35 + local17 * local41 >> 15;
		this.anInt1082 = local17 * local5 >> 15;
		this.anInt1084 = -arg0 * this.anInt1086 - arg1 * this.anInt1079 - arg2 * this.anInt1085 >> 15;
		this.anInt1078 = -arg0 * this.anInt1080 - arg1 * this.anInt1076 - arg2 * this.anInt1081 >> 15;
		this.anInt1075 = -arg0 * this.anInt1077 - arg1 * this.anInt1083 - arg2 * this.anInt1082 >> 15;
	}
}
