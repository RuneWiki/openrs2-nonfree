import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vl", name = "s", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_244 = new Class92(71, 2);

	@OriginalMember(owner = "client!vl", name = "u", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_245 = new Class92(11, 3);

	@OriginalMember(owner = "client!vl", name = "v", descriptor = "[I")
	public static int[] anIntArray515 = new int[1];

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "Z")
	public static boolean aBoolean505 = false;

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
	public static int anInt7307 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "([Ljava/lang/Object;II[JI)V")
	public static void method5676(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(24) int local24 = (arg3 + arg1) / 2;
		@Pc(26) int local26 = arg1;
		@Pc(30) long local30 = arg2[local24];
		arg2[local24] = arg2[arg3];
		arg2[arg3] = local30;
		@Pc(44) Object local44 = arg0[local24];
		arg0[local24] = arg0[arg3];
		arg0[arg3] = local44;
		@Pc(62) int local62 = local30 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(64) int local64 = arg1; local64 < arg3; local64++) {
			if (arg2[local64] < local30 + (long) (local62 & local64)) {
				@Pc(84) long local84 = arg2[local64];
				arg2[local64] = arg2[local26];
				arg2[local26] = local84;
				@Pc(98) Object local98 = arg0[local64];
				arg0[local64] = arg0[local26];
				arg0[local26++] = local98;
			}
		}
		arg2[arg3] = arg2[local26];
		arg2[local26] = local30;
		arg0[arg3] = arg0[local26];
		arg0[local26] = local44;
		method5676(arg0, arg1, arg2, local26 - 1);
		method5676(arg0, local26 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIZ)V")
	public static void method5677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static139.method2522(8, arg3);
		local8.method1570();
		local8.anInt1932 = arg2;
		local8.anInt1930 = arg0;
		local8.anInt1933 = arg1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z")
	public static boolean method5678(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
