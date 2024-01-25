import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "Lclient!ml;")
	public static Class1_Sub34 aClass1_Sub34_1;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "Lclient!q;")
	public static Class113 aClass113_2;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[200];

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "Lclient!uc;")
	public static final Class324 aClass324_23 = new Class324("", 11);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V")
	public static void method3703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(11) int local11 = (arg1 + arg0) / 2;
		@Pc(13) int local13 = arg1;
		@Pc(17) int local17 = arg3[local11];
		arg3[local11] = arg3[arg0];
		arg3[arg0] = local17;
		@Pc(31) Object local31 = arg2[local11];
		arg2[local11] = arg2[arg0];
		arg2[arg0] = local31;
		@Pc(48) int local48 = local17 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg1; local50 < arg0; local50++) {
			if (arg3[local50] < local17 + (local48 & local50)) {
				@Pc(65) int local65 = arg3[local50];
				arg3[local50] = arg3[local13];
				arg3[local13] = local65;
				@Pc(79) Object local79 = arg2[local50];
				arg2[local50] = arg2[local13];
				arg2[local13++] = local79;
			}
		}
		arg3[arg0] = arg3[local13];
		arg3[local13] = local17;
		arg2[arg0] = arg2[local13];
		arg2[local13] = local31;
		method3703(local13 - 1, arg1, arg2, arg3);
		method3703(arg0, local13 + 1, arg2, arg3);
	}
}
