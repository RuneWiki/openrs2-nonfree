import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
	public static int anInt2489;

	@OriginalMember(owner = "client!ega", name = "f", descriptor = "Z")
	public static boolean aBoolean207 = false;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method2279(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub6_Sub7 local14 = Static198.method3146((long) arg1, 3);
		local14.method1712();
		local14.aString19 = arg0;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIII)V")
	public static void method2280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = Static400.method5735(Static255.anInt4818, arg0, Static658.anInt10079);
		@Pc(21) int local21 = Static400.method5735(Static255.anInt4818, arg2, Static658.anInt10079);
		@Pc(27) int local27 = Static400.method5735(Static303.anInt9951, arg4, Static408.anInt6951);
		@Pc(35) int local35 = Static400.method5735(Static303.anInt9951, arg3, Static408.anInt6951);
		for (@Pc(37) int local37 = local13; local37 <= local21; local37++) {
			Static526.method7369(Static299.anIntArrayArray58[local37], local35, local27, arg1);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
	public static void method2281() {
		Static252.aClass30_1.method1095();
	}
}
