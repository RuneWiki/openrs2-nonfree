import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
	public static int anInt4522;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "[I")
	public static int[] anIntArray340 = new int[200];

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
	public static void method3433() {
		Static170.aClass61_29.method1378();
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Lclient!nk;")
	public static Class25 method3434() {
		try {
			return (Class25) Class.forName("Class25_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return new Class25_Sub1();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[Ljava/lang/Object;[JB)V")
	public static void method3435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) long[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg0) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) long local24 = arg3[local18];
		arg3[local18] = arg3[arg1];
		arg3[arg1] = local24;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg1];
		arg2[arg1] = local38;
		for (@Pc(50) int local50 = arg0; local50 < arg1; local50++) {
			if (arg3[local50] < (long) (local50 & 0x1) + local24) {
				@Pc(72) long local72 = arg3[local50];
				arg3[local50] = arg3[local20];
				arg3[local20] = local72;
				@Pc(86) Object local86 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20++] = local86;
			}
		}
		arg3[arg1] = arg3[local20];
		arg3[local20] = local24;
		arg2[arg1] = arg2[local20];
		arg2[local20] = local38;
		method3435(arg0, local20 - 1, arg2, arg3);
		method3435(local20 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	public static void method3437(@OriginalArg(1) int arg0) {
		Static119.anInt2398 = -1;
		Static52.anInt1147 = arg0;
		Static64.anInt1385 = -1;
		Static286.method4120();
	}
}
