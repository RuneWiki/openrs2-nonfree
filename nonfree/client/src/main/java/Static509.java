import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!vh", name = "L", descriptor = "Lclient!jda;")
	public static Class142 aClass142_2;

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZLclient!ls;Lclient!ls;)I")
	public static int method7446(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class178_Sub1 arg2, @OriginalArg(4) Class178_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg0 == 1) {
			local11 = arg3.anInt5251;
			local14 = arg2.anInt5251;
			if (!arg1) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static206.method3293(arg3.method4516().aString130, arg2.method4516().aString130, Static172.anInt6352);
		} else if (arg0 == 3) {
			if (arg3.aString117.equals("-")) {
				if (arg2.aString117.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString117.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static206.method3293(arg3.aString117, arg2.aString117, Static172.anInt6352);
			}
		} else if (arg0 == 4) {
			if (arg3.method4512()) {
				return arg2.method4512() ? 0 : 1;
			} else if (arg2.method4512()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg3.method4511()) {
				return arg2.method4511() ? 0 : 1;
			} else if (arg2.method4511()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg3.method4510()) {
				return arg2.method4510() ? 0 : 1;
			} else if (arg2.method4510()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg3.method4513()) {
				return arg2.method4513() ? 0 : 1;
			} else if (arg2.method4513()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local11 = arg3.anInt5261;
			local14 = arg2.anInt5261;
			if (arg1) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg3.anInt5263 - arg2.anInt5263;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
	public static void method7450(@OriginalArg(0) int arg0) {
		Static297.anInt5467 = arg0;
		Static108.aClass231_27.method6240();
	}

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "(I)V")
	public static void method7453() {
		@Pc(9) int[] local9 = new int[Static464.aClass115_1.anInt3310];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static464.aClass115_1.anInt3310; local13++) {
			@Pc(20) Class300 local20 = Static464.aClass115_1.method2970(local13);
			if (local20.anInt8953 >= 0 || local20.anInt8927 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static286.anIntArray463 = new int[local11];
		for (@Pc(49) int local49 = 0; local49 < local11; local49++) {
			Static286.anIntArray463[local49] = local9[local49];
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZLclient!dda;)V")
	public static void method7454(@OriginalArg(1) Class53 arg0) {
		Static277.anInt5010 = arg0.method1608("titlebg");
		Static424.anInt7847 = arg0.method1608("logo");
	}
}
