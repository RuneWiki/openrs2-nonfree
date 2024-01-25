import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "[Lclient!mv;")
	public static Class252[] aClass252Array3;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
	public static int anInt7121;

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "Lclient!tia;")
	public static Class355 aClass355_4;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
	public static int anInt7125;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Z")
	public static boolean aBoolean603 = false;

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(CLjava/lang/String;I)I")
	public static int method6344(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(JIIIILclient!nca;Z)V")
	public static void method6346(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class254 arg3) {
		Static708.method9448(0, arg2, arg3, 1, arg1, 0, arg0);
	}
}
