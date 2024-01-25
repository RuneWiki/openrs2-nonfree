import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "Lclient!ie;")
	public static Class158 aClass158_12;

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
	public static int anInt10060;

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "Z")
	public static boolean aBoolean709 = false;

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "[I")
	public static final int[] anIntArray731 = new int[3];

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V")
	public static void method8376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static117.aClass137_46 == null) {
			return;
		}
		@Pc(16) int local16 = Static347.anInt6424;
		@Pc(18) int local18 = Static174.anInt10833;
		Static546.method7698(arg0, arg1);
		if (Static453.anInt7941 == 0) {
			Static45.anInterface23_1 = null;
			Static45.anInterface23_1 = Static117.aClass137_46.method7874(Static117.aClass137_46.method7902(Static497.anInt10443, Static608.anInt10279), Static117.aClass137_46.method7934(Static497.anInt10443, Static608.anInt10279));
		} else if (Static453.anInt7941 == 1 && (Static595.anInterface23Array1 == null || local16 != Static347.anInt6424 || Static174.anInt10833 != local18)) {
			Static595.anInterface23Array1 = new Interface23[Static347.anInt6424 * Static174.anInt10833];
			for (@Pc(64) int local64 = 0; local64 < Static595.anInterface23Array1.length; local64++) {
				Static595.anInterface23Array1[local64] = Static117.aClass137_46.method7874(Static117.aClass137_46.method7902(Static465.anInt8179, Static309.anInt1943), Static117.aClass137_46.method7934(Static465.anInt8179, Static309.anInt1943));
			}
			Static362.anIntArray486 = new int[Static347.anInt6424 * Static174.anInt10833];
			Static610.anInt10303 = 1;
		}
		Static17.aBoolean15 = true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!rn;)Z")
	public static boolean method8377(@OriginalArg(1) Class305 arg0) {
		return arg0 == null ? false : Static566.method8152(arg0.anInt9060 - arg0.anInt9055, arg0.anInt9057, arg0.anInt9056, arg0.anInt9058 - arg0.anInt9056, arg0.anInt9055, arg0.anInt9054 - arg0.anInt9057);
	}
}
