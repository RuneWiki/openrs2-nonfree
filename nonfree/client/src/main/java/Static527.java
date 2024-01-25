import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static527 {

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "[Lclient!vs;")
	public static Class379[] aClass379Array3;

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "Lclient!ee;")
	public static Class81 aClass81_9;

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)Z")
	public static boolean method7377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
