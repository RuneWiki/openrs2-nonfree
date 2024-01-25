import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cp", name = "ab", descriptor = "Lclient!qn;")
	public static Class211 aClass211_18;

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_17 = new Class15("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_19 = new Class146(21, 16);

	@OriginalMember(owner = "client!cp", name = "Y", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
	public static void method812() {
		Static271.aClass110Array2 = null;
		Static84.method4134(0, Static120.anInt2134, Static182.anInt3346, 0, Static345.anInt5723, -1, 0, 0);
		if (Static271.aClass110Array2 != null) {
			Static334.method4422(0, Static13.anInt192, Static120.anInt2134, -1412584499, Static20.anInt1662, Static345.anInt5723, Static216.aClass110_9.anInt2620, Static271.aClass110Array2, 0);
			Static271.aClass110Array2 = null;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BZ)C")
	public static char method814(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(46) char local46 = Static55.aCharArray1[local12 - 128];
			if (local46 == '\u0000') {
				local46 = '?';
			}
			local12 = local46;
		}
		return (char) local12;
	}
}
