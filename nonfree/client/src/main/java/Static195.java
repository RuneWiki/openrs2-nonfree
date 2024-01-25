import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jv", name = "M", descriptor = "[[Lclient!nf;")
	public static Class169[][] aClass169ArrayArray2;

	@OriginalMember(owner = "client!jv", name = "K", descriptor = "[I")
	public static final int[] anIntArray485 = new int[1000];

	@OriginalMember(owner = "client!jv", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString50 = null;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "([I[JIII)V")
	public static void method4948(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg2) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) long local21 = arg1[local15];
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local21;
		@Pc(35) int local35 = arg0[local15];
		arg0[local15] = arg0[arg2];
		arg0[arg2] = local35;
		@Pc(53) int local53 = local21 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg3; local55 < arg2; local55++) {
			if (local21 + (long) (local55 & local53) > arg1[local55]) {
				@Pc(72) long local72 = arg1[local55];
				arg1[local55] = arg1[local17];
				arg1[local17] = local72;
				@Pc(86) int local86 = arg0[local55];
				arg0[local55] = arg0[local17];
				arg0[local17++] = local86;
			}
		}
		arg1[arg2] = arg1[local17];
		arg1[local17] = local21;
		arg0[arg2] = arg0[local17];
		arg0[local17] = local35;
		method4948(arg0, arg1, local17 - 1, arg3);
		method4948(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
	public static void method4949() {
		Static342.aClass240Array1 = null;
		Static110.method2179(0, Static374.anInt6595, Static248.anInt4793, 0, 0, -1, Static30.anInt518, 0);
		if (Static342.aClass240Array1 != null) {
			Static307.method5981(Static175.anInt3442, 0, Static30.anInt518, Static342.aClass240Array1, Static374.anInt6595, -1412584499, Static186.aClass240_10.anInt6843, 0, Static28.anInt484);
			Static342.aClass240Array1 = null;
		}
	}
}
