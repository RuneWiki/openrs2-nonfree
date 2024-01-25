import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "Lclient!qn;")
	public static Class207 aClass207_1;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_100 = new Class2(35, -1);

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
	public static int anInt6313 = 0;

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_130 = new Class55("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_58 = new Class126(64);

	@OriginalMember(owner = "client!tr", name = "u", descriptor = "S")
	public static short aShort89 = 256;

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_143 = new Class253(98, 16);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)Lclient!lh;")
	public static Class143 method5017() {
		try {
			return (Class143) Class.forName("Class143_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)C")
	public static char method5018(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(41) char local41 = Static189.aCharArray8[local7 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local7 = local41;
		}
		return (char) local7;
	}
}
