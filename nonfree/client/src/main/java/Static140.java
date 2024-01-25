import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
	public static int anInt3147;

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "I")
	public static int anInt3150;

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "I")
	public static int anInt3152;

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;B)V")
	public static void method2841(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		@Pc(15) Class138 local15 = Static72.aClass138Array1[99];
		for (@Pc(17) int local17 = 99; local17 > 0; local17--) {
			Static72.aClass138Array1[local17] = Static72.aClass138Array1[local17 - 1];
		}
		if (local15 == null) {
			local15 = new Class138(arg1, arg3, arg2, arg7, arg0, arg5, arg6, arg4);
		} else {
			local15.method3465(arg1, arg4, arg0, arg5, arg6, arg2, arg7, arg3);
		}
		Static535.anInt9060 = Static191.anInt5895;
		Static72.aClass138Array1[0] = local15;
		Static428.anInt7368++;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z")
	public static boolean method2842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static95.method7582(arg0, arg1) & Static404.method5843(arg1, arg0);
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(B)[Lclient!tga;")
	public static Class315[] method2844() {
		return new Class315[] { Static106.aClass315_4, Static250.aClass315_5, Static58.aClass315_3, Static463.aClass315_7, Static573.aClass315_9, Static440.aClass315_6 };
	}
}
