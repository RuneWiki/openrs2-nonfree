import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
	public static final int anInt9739 = 52;

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
	public static final int anInt9741 = 1406;

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "[Lclient!wo;")
	public static final Class4_Sub7_Sub19[] aClass4_Sub7_Sub19Array6 = new Class4_Sub7_Sub19[14];

	@OriginalMember(owner = "client!sr", name = "F", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger11 = new BigInteger("8ac4f0372e6318950e5b1274ec93c649222591c3b844960389523bf85932cd83a356ea148c1a975ad5e79ab11afdd125d9e5ee7d09d88c81acc57bfa71afa058a78710a8c5faa011f07eff60f838180e0cca9960294ee84c8880c636d92a0ea67329e7f89b873c2c3354c3075adf543455195fd37fb01f42696da238ee89dd475a10be4a946323ff7e7ab09ee517746a119cacb6d35009a75863d88c785a9ffaaaa82d13f3406e15635058d7aadb357e387491ef2c484ea8ddc6a66a4f2c4b6b9f861b52299bdca587e4100612f282805e33b4b8a41d69368423688c987ba19370143ae8c597e6de8ee62811b21a68f7fab8077e9b8e78d08ff57e2e9bddbceea4e192cb2bc7430e2476d1726563fe1660cb35aba151e0d8b7a0abcca50299f66b212528b3dcc9e9e785e4319f5ea0b974040d1431046b695b33b9ca21f5b20a3c0e9c168eda537e8a0f7d985c42ee84c723cf4d48637ca556ec98fc32ac635152d4a087faf227e6fe8801e0ca86a9a856128fb1b5da51d6ea863d11e1c6a8b33c1a1fb830bbd7cc2caa870ab9ce65f2a2d6359c9e95e88e76fc2b525dfc023382b4e6d9d15c8beb89dc47e0b4b9f2601523822ec3b17b61b486288f6727459848c37c0fef24fd60de28ce247648d4aaa1753b2224e76c2571949fc3a46c905656b56b9039781f1bb4360529830731bd8ab9d53df904a48cae62d5852fe724bd", 16);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([III[II)V")
	public static void method7983(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg3[local22];
		arg3[local22] = arg3[arg2];
		arg3[arg2] = local28;
		@Pc(42) int local42 = arg0[local22];
		arg0[local22] = arg0[arg2];
		arg0[arg2] = local42;
		@Pc(61) int local61 = ~local28 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg1; local63 < arg2; local63++) {
			if (arg3[local63] < (local63 & local61) + local28) {
				@Pc(82) int local82 = arg3[local63];
				arg3[local63] = arg3[local24];
				arg3[local24] = local82;
				@Pc(96) int local96 = arg0[local63];
				arg0[local63] = arg0[local24];
				arg0[local24++] = local96;
			}
		}
		arg3[arg2] = arg3[local24];
		arg3[local24] = local28;
		arg0[arg2] = arg0[local24];
		arg0[local24] = local42;
		method7983(arg0, arg1, local24 - 1, arg3);
		method7983(arg0, local24 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)V")
	public static void method7987(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(4, arg0);
		local8.method3062();
	}
}
