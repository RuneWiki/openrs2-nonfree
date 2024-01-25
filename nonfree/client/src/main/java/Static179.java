import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Lclient!rk;")
	public static Class180 aClass180_48;

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Lclient!rk;")
	public static Class180 aClass180_49;

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
	public static int anInt3659;

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
	public static int anInt3660;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
	public static int anInt3651 = 0;

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_30 = new Class103(30);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!rk;)I")
	public static int method3301(@OriginalArg(1) Class180 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4562(Static223.anInt4458)) {
			local5++;
		}
		if (arg0.method4562(Static185.anInt3759)) {
			local5++;
		}
		if (arg0.method4562(Static144.anInt3127)) {
			local5++;
		}
		if (arg0.method4562(Static171.anInt3545)) {
			local5++;
		}
		if (arg0.method4562(Static206.anInt4122)) {
			local5++;
		}
		if (arg0.method4562(Static8.anInt156)) {
			local5++;
		}
		if (arg0.method4562(Static338.anInt6370)) {
			local5++;
		}
		if (arg0.method4562(Static131.anInt2851)) {
			local5++;
		}
		if (arg0.method4562(Static201.anInt4175)) {
			local5++;
		}
		if (arg0.method4562(Static242.anInt3401)) {
			local5++;
		}
		if (arg0.method4562(Static303.anInt5804)) {
			local5++;
		}
		if (arg0.method4562(Static218.anInt4349)) {
			local5++;
		}
		if (arg0.method4562(Static205.anInt4090)) {
			local5++;
		}
		if (arg0.method4562(Static241.anInt4754)) {
			local5++;
		}
		if (arg0.method4562(Static43.anInt1147)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method3304(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(7) int local7 = arg0.indexOf(arg2); local7 != -1; local7 = arg0.indexOf(arg2, arg1.length() + local7)) {
			arg0 = arg0.substring(0, local7) + arg1 + arg0.substring(local7 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!fo;)V")
	public static void method3305(@OriginalArg(0) Class22_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort83; local2 <= arg0.aShort82; local2++) {
			for (@Pc(6) int local6 = arg0.aShort81; local6 <= arg0.aShort84; local6++) {
				@Pc(16) Class49 local16 = Static229.aClass49ArrayArrayArray6[arg0.aByte69][local2][local6];
				if (local16 != null) {
					@Pc(21) Class47 local21 = local16.aClass47_3;
					@Pc(23) Class47 local23 = null;
					while (local21 != null) {
						if (local21.aClass22_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass47_3 = local21.aClass47_2;
							} else {
								local23.aClass47_2 = local21.aClass47_2;
							}
							local21.method1120();
							break;
						}
						local23 = local21;
						local21 = local21.aClass47_2;
					}
					local16.aByte27 = 0;
					for (@Pc(56) Class47 local56 = local16.aClass47_3; local56 != null; local56 = local56.aClass47_2) {
						local16.aByte27 = (byte) (local16.aByte27 | local56.anInt1398);
					}
				}
			}
		}
	}
}
