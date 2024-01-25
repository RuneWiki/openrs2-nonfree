import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!nw", name = "db", descriptor = "I")
	public static int anInt7106;

	@OriginalMember(owner = "client!nw", name = "q", descriptor = "I")
	public static int anInt7115;

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
	public static int anInt7118 = 0;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IJZI)Ljava/lang/String;")
	public static String method6090(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Static273.method3852(arg1);
		@Pc(10) Calendar local10 = Static280.aCalendar2;
		@Pc(21) int local21 = local10.get(5);
		@Pc(25) int local25 = local10.get(2);
		@Pc(29) int local29 = local10.get(1);
		@Pc(33) int local33 = local10.get(11);
		@Pc(45) int local45 = local10.get(12);
		return arg0 == 3 ? Static16.method557(arg1, arg0) : Integer.toString(local21 / 10) + local21 % 10 + "-" + Static149.aStringArrayArray1[arg0][local25] + "-" + local29 + " " + local33 / 10 + local33 % 10 + ":" + local45 / 10 + local45 % 10;
	}

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "(I)V")
	public static void method6104() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static508.aBooleanArray21[local3] = false;
		}
		Static67.anInt1614 = -1;
		Static522.anInt8177 = Static305.anInt4908;
		Static565.anInt8603 = -1;
		Static45.anInt1294 = 0;
		Static530.anInt8261 = Static171.anInt8707;
		Static631.anInt9738 = 0;
		Static169.anInt2994 = Static263.anInt4101;
		Static520.anInt8157 = Static716.anInt11157;
		Static358.anInt5640 = -1;
		Static494.anInt7853 = -1;
		Static262.anInt4081 = 5;
		Static181.anInt3159 = Static490.anInt7687;
		Static552.anInt8475 = Static46.anInt1301;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(Z)V")
	public static void method6108() {
		Static614.anInt9291 = 0;
		Static406.anInt10703 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static250.anInt3897; local18++) {
			@Pc(24) int local24 = local18 * Static268.anInt4147;
			for (@Pc(26) int local26 = 0; local26 < Static268.anInt4147; local26++) {
				@Pc(32) int local32 = local24 + local26;
				Static559.anInterface25Array1[local32].method9261(Static91.anInt2080 * local26, Static703.anInt10979 * local18, Static91.anInt2080, Static703.anInt10979, true);
			}
		}
	}
}
