import java.awt.Color;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ip", name = "sc", descriptor = "I")
	public static int anInt3361;

	@OriginalMember(owner = "client!ip", name = "vc", descriptor = "[I")
	public static int[] anIntArray217;

	@OriginalMember(owner = "client!ip", name = "lc", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_71 = new Class83("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!ip", name = "xc", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIZ)V")
	public static void method2796(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class4_Sub25 local10 = Static175.method2834(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray230.length; local15++) {
				local10.anIntArray230[local15] = -1;
				local10.anIntArray229[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method2805(@OriginalArg(0) long arg0) {
		Static253.aCalendar1.setTime(new Date(arg0));
		@Pc(18) int local18 = Static253.aCalendar1.get(7);
		@Pc(22) int local22 = Static253.aCalendar1.get(5);
		@Pc(26) int local26 = Static253.aCalendar1.get(2);
		@Pc(30) int local30 = Static253.aCalendar1.get(1);
		@Pc(34) int local34 = Static253.aCalendar1.get(11);
		@Pc(38) int local38 = Static253.aCalendar1.get(12);
		@Pc(42) int local42 = Static253.aCalendar1.get(13);
		return Static37.aStringArray5[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static280.aStringArray24[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
