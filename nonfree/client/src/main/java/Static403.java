import java.awt.Color;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
	public static int anInt7142;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "Lclient!f;")
	public static Class78 aClass78_21;

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!ci;")
	public static Class42 aClass42_6;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray7 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_132 = new Class254(34, -1);

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_102 = new Class96("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
	public static int anInt7143 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)V")
	public static void method5490(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static346.anInt6353 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLclient!rq;)Z")
	public static boolean method5492(@OriginalArg(1) Interface11 arg0) {
		@Pc(12) Class29 local12 = Static251.aClass207_2.method4977(arg0.method5744());
		if (local12.anInt536 == -1) {
			return true;
		} else {
			@Pc(30) Class53 local30 = Static50.aClass177_1.method3799(local12.anInt536);
			return local30.anInt1219 == -1 ? true : local30.method1000();
		}
	}
}
