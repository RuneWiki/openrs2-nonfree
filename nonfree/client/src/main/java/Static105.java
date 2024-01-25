import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!kda;")
	public static Class160 aClass160_20;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public static void method2287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass47_Sub4_2 != null) {
			local7.aClass47_Sub4_2 = null;
		}
		if (local7.aClass47_Sub4_1 != null) {
			local7.aClass47_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZI)V")
	public static void method2288(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static506.anInt8606++;
			Static78.method1980();
		}
		if (arg1) {
			Static495.anInt8413++;
			Static3.method196();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2289(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static292.method4927(Static314.method5172(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)I")
	public static int method2290(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(43) int local43 = (arg0 & 0x7F) * 96 >> 7;
			if (local43 < 2) {
				local43 = 2;
			} else if (local43 > 126) {
				local43 = 126;
			}
			return (arg0 & 0xFF80) + local43;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)I")
	public static int method2291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local13 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local13;
		} else {
			return local13;
		}
	}
}
