import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "Lclient!jn;")
	public static Class176 aClass176_105;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
	public static int anInt7924;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_102 = new Class173(57, 4);

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
	public static int anInt7923 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6589(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static404.aStringArray51.length; local7++) {
			if (Static404.aStringArray51[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!jn;ZLclient!fa;)V")
	public static void method6591(@OriginalArg(0) Class176 arg0, @OriginalArg(2) Interface11 arg1) {
		Static5.aClass176_5 = arg0;
		Static208.anInterface11_6 = arg1;
	}
}
