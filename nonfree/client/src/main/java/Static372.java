import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
	public static int anInt6575;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_114 = new Class6(46, 6);

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "[I")
	public static int[] anIntArray493 = new int[1];

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "Lclient!h;")
	public static final Class114 aClass114_128 = new Class114("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
	public static int anInt6577 = 0;

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "Lclient!sl;")
	public static final Class266 aClass266_8 = new Class266("", 16);

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[200];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static193.method3621(Static341.anInt6379, arg2, Static92.anInt2338);
		@Pc(17) int local17 = Static193.method3621(Static341.anInt6379, arg4, Static92.anInt2338);
		@Pc(23) int local23 = Static193.method3621(Static299.anInt4491, arg0, Static95.anInt2358);
		@Pc(29) int local29 = Static193.method3621(Static299.anInt4491, arg1, Static95.anInt2358);
		@Pc(48) int local48 = Static193.method3621(Static341.anInt6379, arg3 + arg2, Static92.anInt2338);
		@Pc(57) int local57 = Static193.method3621(Static341.anInt6379, arg4 - arg3, Static92.anInt2338);
		for (@Pc(59) int local59 = local11; local59 < local48; local59++) {
			Static227.method7421(local23, arg5, local29, Static81.anIntArrayArray25[local59]);
		}
		for (@Pc(77) int local77 = local17; local77 > local57; local77--) {
			Static227.method7421(local23, arg5, local29, Static81.anIntArrayArray25[local77]);
		}
		@Pc(105) int local105 = Static193.method3621(Static299.anInt4491, arg0 + arg3, Static95.anInt2358);
		@Pc(114) int local114 = Static193.method3621(Static299.anInt4491, arg1 - arg3, Static95.anInt2358);
		for (@Pc(116) int local116 = local48; local116 <= local57; local116++) {
			@Pc(122) int[] local122 = Static81.anIntArrayArray25[local116];
			Static227.method7421(local23, arg5, local105, local122);
			Static227.method7421(local105, arg6, local114, local122);
			Static227.method7421(local114, arg5, local29, local122);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method5701(@OriginalArg(0) Class9 arg0) {
		if (Static385.aClass38_53.method1422() == 0) {
			return;
		}
		@Pc(23) Class1_Sub43 local23;
		if (Static526.anInt8926 == 0) {
			for (local23 = (Class1_Sub43) Static385.aClass38_53.method1419(); local23 != null; local23 = (Class1_Sub43) Static385.aClass38_53.method1415()) {
				Static454.aClass153_2.method3994(local23.anInt7498, local23.anInt7500, local23.anInt7503, arg0, local23.anInt7501, false, arg0, false, Static58.aClass27_2, local23.aBoolean496 ? Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1 : null, local23.anInt7502);
				local23.method7983();
			}
			Static278.method4744();
			return;
		}
		if (Static424.aClass9_9 == null) {
			@Pc(71) Canvas local71 = new Canvas();
			local71.setSize(36, 32);
			Static424.aClass9_9 = Static383.method7645(Static389.anInterface8_10, 0, 0, Static40.aClass160_5, local71);
			Static351.aClass27_5 = Static424.aClass9_9.method7603(Static384.method5813(Static309.aClass160_69, Static152.anInt3449), Static559.method5935(Static390.aClass160_80, Static152.anInt3449));
		}
		for (local23 = (Class1_Sub43) Static385.aClass38_53.method1419(); local23 != null; local23 = (Class1_Sub43) Static385.aClass38_53.method1415()) {
			Static454.aClass153_2.method3994(local23.anInt7498, local23.anInt7500, local23.anInt7503, Static424.aClass9_9, local23.anInt7501, false, arg0, false, Static351.aClass27_5, local23.aBoolean496 ? Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1 : null, local23.anInt7502);
			local23.method7983();
		}
	}
}
