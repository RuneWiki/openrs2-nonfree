import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "Z")
	private static boolean aBoolean636 = false;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_263 = new Class88("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

	@OriginalMember(owner = "client!ul", name = "C", descriptor = "[Lclient!daa;")
	public static final Class12_Sub8[] aClass12_Sub8Array1 = new Class12_Sub8[2048];

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method7348(@OriginalArg(1) long arg0) {
		Static107.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static107.aCalendar1.get(7);
		@Pc(17) int local17 = Static107.aCalendar1.get(5);
		@Pc(26) int local26 = Static107.aCalendar1.get(2);
		@Pc(30) int local30 = Static107.aCalendar1.get(1);
		@Pc(34) int local34 = Static107.aCalendar1.get(11);
		@Pc(38) int local38 = Static107.aCalendar1.get(12);
		@Pc(42) int local42 = Static107.aCalendar1.get(13);
		return Static315.aStringArray39[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static460.aStringArray53[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
	public static void method7349() {
		if (Static143.aClass285_3 != Static79.aClass285_2) {
			try {
				Static549.method683(Static314.aClient1, "tbrefresh");
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!nj;II)V")
	public static void method7350(@OriginalArg(0) Class12_Sub8_Sub2 arg0, @OriginalArg(1) int arg1) {
		Static77.anInt1793 = 0;
		aBoolean636 = false;
		Static512.method7596(arg0);
		Static175.method3490(arg0);
		if (aBoolean636) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt6217 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt6217 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)Z")
	public static boolean method7351() {
		return Static111.anInt2588 == 0 ? Static493.aClass12_Sub13_Sub2_3.method4264() : true;
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)Z")
	public static boolean method7354() {
		try {
			return Static289.method4716();
		} catch (@Pc(14) IOException local14) {
			Static83.method1857();
			return true;
		} catch (@Pc(21) Exception local21) {
			@Pc(82) String local82 = "T2 - " + (Static10.aClass45_4 == null ? -1 : Static10.aClass45_4.method1410()) + "," + (Static402.aClass45_117 == null ? -1 : Static402.aClass45_117.method1410()) + "," + (Static376.aClass45_154 == null ? -1 : Static376.aClass45_154.method1410()) + " - " + Static331.anInt6307 + "," + (Static61.anInt1459 + Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray316[0]) + "," + (Static203.anInt4534 + Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray317[0]) + " - ";
			for (@Pc(84) int local84 = 0; Static331.anInt6307 > local84 && local84 < 50; local84++) {
				local82 = local82 + Static394.aClass12_Sub8_Sub2_2.aByteArray82[local84] + ",";
			}
			Static508.method7541(local21, local82);
			Static10.method291(false);
			return true;
		}
	}
}
