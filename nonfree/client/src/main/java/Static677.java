import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "[Lclient!rba;")
	public static final Class3_Sub28[] aClass3_Sub28Array1 = new Class3_Sub28[2048];

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method8942(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(15) int local15 = arg0.indexOf(arg2); local15 != -1; local15 = arg0.indexOf(arg2, arg1.length() + local15)) {
			arg0 = arg0.substring(0, local15) + arg1 + arg0.substring(local15 + arg2.length());
		}
		return arg0;
	}
}
