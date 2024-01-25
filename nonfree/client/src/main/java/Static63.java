import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cv", name = "C", descriptor = "[Lclient!ig;")
	public static Class12[] aClass12Array5;

	@OriginalMember(owner = "client!cv", name = "E", descriptor = "Lclient!lt;")
	public static Class158 aClass158_15;

	@OriginalMember(owner = "client!cv", name = "H", descriptor = "Lclient!ws;")
	public static Class267 aClass267_2;

	@OriginalMember(owner = "client!cv", name = "K", descriptor = "[Lclient!ig;")
	public static Class12[] aClass12Array6;

	@OriginalMember(owner = "client!cv", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!cv", name = "D", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!cv", name = "L", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_23 = new Class231("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!cv", name = "N", descriptor = "I")
	public static int anInt1331 = -1;

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "(I)[Lclient!il;")
	public static Class117[] method1194() {
		if (Static380.aClass117Array1 == null) {
			@Pc(7) Class117[] local7 = Static102.method4405(Static165.aClass103_3);
			@Pc(11) Class117[] local11 = new Class117[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(67) int local67;
			@Pc(73) Class117 local73;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class117 local21 = local7[local15];
				if ((local21.anInt2947 <= 0 || local21.anInt2947 >= 24) && local21.anInt2944 >= 800 && local21.anInt2939 >= 600 && (Static2.anInt8 >= 96 || Static155.anInt2774 != 0 || local21.anInt2944 <= 1024 && local21.anInt2939 <= 768)) {
					for (local67 = 0; local67 < local13; local67++) {
						local73 = local11[local67];
						if (local21.anInt2944 == local73.anInt2944 && local21.anInt2939 == local73.anInt2939) {
							if (local73.anInt2947 < local21.anInt2947) {
								local11[local67] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static380.aClass117Array1 = new Class117[local13];
			Static459.method5353(local11, 0, Static380.aClass117Array1, 0, local13);
			@Pc(133) int[] local133 = new int[Static380.aClass117Array1.length];
			for (local67 = 0; local67 < Static380.aClass117Array1.length; local67++) {
				local73 = Static380.aClass117Array1[local67];
				local133[local67] = local73.anInt2944 * local73.anInt2939;
			}
			Static197.method3140(Static380.aClass117Array1, local133);
		}
		return Static380.aClass117Array1;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method1196(@OriginalArg(0) long arg0) {
		Static57.aCalendar1.setTime(new Date(arg0));
		@Pc(18) int local18 = Static57.aCalendar1.get(7);
		@Pc(22) int local22 = Static57.aCalendar1.get(5);
		@Pc(26) int local26 = Static57.aCalendar1.get(2);
		@Pc(30) int local30 = Static57.aCalendar1.get(1);
		@Pc(34) int local34 = Static57.aCalendar1.get(11);
		@Pc(38) int local38 = Static57.aCalendar1.get(12);
		@Pc(42) int local42 = Static57.aCalendar1.get(13);
		return Static95.aStringArray12[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static77.aStringArray10[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
