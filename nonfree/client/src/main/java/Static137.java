import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public static int anInt2913 = 0;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public static int anInt2916 = 999999;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!jr;")
	public static final Class112 aClass112_1 = new Class112();

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V")
	public static void method2632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		if (arg0 > arg2) {
			for (local22 = arg2; local22 < arg0; local22++) {
				Static364.anIntArrayArray57[local22][arg1] = arg3;
			}
		} else {
			for (local22 = arg0; local22 < arg2; local22++) {
				Static364.anIntArrayArray57[local22][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(CLjava/lang/String;B)[Ljava/lang/String;")
	public static String[] method2633(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(15) int local15 = Static69.method3476(arg1, arg0);
		@Pc(20) String[] local20 = new String[local15 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local15; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg1.charAt(local30) != arg0; local30++) {
			}
			local20[local22++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local15] = arg1.substring(local24);
		return local20;
	}
}
