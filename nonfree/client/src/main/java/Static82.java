import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!ak;")
	public static Class7 aClass7_82;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "J")
	public static long aLong54 = 0L;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString44 = "wave2:";

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZZ)V")
	public static void method1397(@OriginalArg(1) boolean arg0) {
		Static34.method632(Static106.anInt1988, Static196.aFloat114, Static249.aFloat146, Static171.aFloat89);
		Static34.method623(Static17.anInt410, Static107.anInt1996, arg0);
		Static34.method628((float) Static49.anInt1057, (float) Static259.anInt5231, (float) Static190.anInt3578);
		Static34.method625();
		Static181.aFloat102 = Static36.aFloat134;
		Static181.aFloat104 = Static40.aFloat27;
		Static181.aFloat103 = Static81.aFloat46;
		Static299.aClass1_Sub2_Sub8_6 = Static263.aClass1_Sub2_Sub8_4;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III[I[Ljava/lang/Object;)V")
	public static void method1398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg0) / 2;
		@Pc(14) int local14 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local14;
		@Pc(26) int local26 = arg1;
		@Pc(30) Object local30 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local30;
		for (@Pc(42) int local42 = arg1; local42 < arg0; local42++) {
			if ((local42 & 0x1) + local14 > arg2[local42]) {
				@Pc(67) int local67 = arg2[local42];
				arg2[local42] = arg2[local26];
				arg2[local26] = local67;
				@Pc(81) Object local81 = arg3[local42];
				arg3[local42] = arg3[local26];
				arg3[local26++] = local81;
			}
		}
		arg2[arg0] = arg2[local26];
		arg2[local26] = local14;
		arg3[arg0] = arg3[local26];
		arg3[local26] = local30;
		method1398(local26 - 1, arg1, arg2, arg3);
		method1398(arg0, local26 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method1399() {
		Static257.aClass31_39.method850();
		Static18.aClass31_4.method850();
	}
}
