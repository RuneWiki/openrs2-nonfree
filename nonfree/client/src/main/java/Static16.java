import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "Lclient!bo;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	public static int anInt277;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
	public static int anInt275 = 0;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "[I")
	public static final int[] anIntArray18 = new int[200];

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_7 = new Class117("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
	public static void method217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static240.anInt4829 <= arg0 && arg0 <= Static166.anInt3315) {
			@Pc(23) int local23 = Static61.method917(Static280.anInt212, arg1, Static346.anInt6607);
			@Pc(29) int local29 = Static61.method917(Static280.anInt212, arg2, Static346.anInt6607);
			Static108.method1653(arg0, local29, arg3, local23);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
	public static void method218() {
		Static18.aClass26_2.method329(5);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([JBI[Ljava/lang/Object;I)V")
	public static void method219(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg3 + arg1) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) long local25 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local25;
		@Pc(39) Object local39 = arg2[local19];
		arg2[local19] = arg2[arg1];
		arg2[arg1] = local39;
		for (@Pc(51) int local51 = arg3; local51 < arg1; local51++) {
			if (arg0[local51] < (long) (local51 & 0x1) + local25) {
				@Pc(68) long local68 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21] = local68;
				@Pc(82) Object local82 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21++] = local82;
			}
		}
		arg0[arg1] = arg0[local21];
		arg0[local21] = local25;
		arg2[arg1] = arg2[local21];
		arg2[local21] = local39;
		method219(arg0, local21 - 1, arg2, arg3);
		method219(arg0, arg1, arg2, local21 + 1);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)V")
	public static void method220(@OriginalArg(0) int arg0) {
		@Pc(17) Class11_Sub4_Sub12 local17 = Static35.method512(10, arg0);
		local17.method3864();
	}
}
