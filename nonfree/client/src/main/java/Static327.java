import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!nq", name = "F", descriptor = "[Lclient!iq;")
	public static Class138[] aClass138Array3;

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "Lclient!tda;")
	public static final Class273 aClass273_7 = new Class273(13, 0, 1, 0);

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "[Lclient!tt;")
	public static final Class280[] aClass280Array2 = new Class280[14];

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)Z")
	public static boolean method5345(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5346(@OriginalArg(0) String arg0) {
		if (Static300.aStringArray26 == null) {
			Static69.method7887();
		}
		@Pc(17) String[] local17 = Static12.method678('\n', arg0);
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			for (@Pc(22) int local22 = Static35.anInt1296; local22 > 0; local22--) {
				Static300.aStringArray26[local22] = Static300.aStringArray26[local22 - 1];
			}
			Static300.aStringArray26[0] = local17[local19];
			if (Static300.aStringArray26.length - 1 > Static35.anInt1296) {
				if (Static57.anInt1566 > 0) {
					Static57.anInt1566++;
				}
				Static35.anInt1296++;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)I")
	public static int method5347() {
		return 2;
	}
}
