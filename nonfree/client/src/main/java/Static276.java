import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "[I")
	public static int[] anIntArray413;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_101 = new Class93("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V")
	public static void method5023() {
		@Pc(5) Class119 local5 = Static322.aClass119_196;
		synchronized (Static322.aClass119_196) {
			Static322.aClass119_196.method3312();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZIIIII)V")
	public static void method5029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static24.method734(Static307.anInt6214, arg0, Static228.anInt920);
		@Pc(17) int local17 = Static24.method734(Static307.anInt6214, arg1, Static228.anInt920);
		@Pc(23) int local23 = Static24.method734(Static96.anInt2180, arg2, Static124.anInt4221);
		@Pc(29) int local29 = Static24.method734(Static96.anInt2180, arg3, Static124.anInt4221);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static205.method3670(arg4, local29, Static146.anIntArrayArray91[local31], local23);
		}
	}
}
