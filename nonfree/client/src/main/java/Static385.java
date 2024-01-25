import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
	public static int anInt6504;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_167 = new Class163(62, -1);

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
	public static int anInt6506 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIBIIII)V")
	public static void method5387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) int local13 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg6);
		@Pc(19) int local19 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg3);
		@Pc(27) int local27 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg5);
		@Pc(33) int local33 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg2);
		@Pc(43) int local43 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg6 + arg0);
		@Pc(52) int local52 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg3 - arg0);
		for (@Pc(54) int local54 = local13; local54 < local43; local54++) {
			Static201.method3084(Static296.anIntArrayArray42[local54], local27, local33, arg1);
		}
		for (@Pc(74) int local74 = local19; local74 > local52; local74--) {
			Static201.method3084(Static296.anIntArrayArray42[local74], local27, local33, arg1);
		}
		@Pc(100) int local100 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg0 + arg5);
		@Pc(109) int local109 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg2 - arg0);
		for (@Pc(111) int local111 = local43; local111 <= local52; local111++) {
			@Pc(117) int[] local117 = Static296.anIntArrayArray42[local111];
			Static201.method3084(local117, local27, local100, arg1);
			Static201.method3084(local117, local100, local109, arg4);
			Static201.method3084(local117, local109, local33, arg1);
		}
	}
}
