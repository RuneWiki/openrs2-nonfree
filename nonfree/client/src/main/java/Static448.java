import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wk", name = "N", descriptor = "Lclient!it;")
	public static Class122 aClass122_17;

	@OriginalMember(owner = "client!wk", name = "J", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_210 = new Class158("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
	public static int anInt7868 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
	public static void method6099(@OriginalArg(0) int arg0) {
		Static117.anInt2632 = arg0;
		@Pc(12) Class91 local12 = Static429.aClass91_97;
		synchronized (Static429.aClass91_97) {
			Static429.aClass91_97.method1999();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method6100(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) long local9 = (long) 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			local9 = (long) arg0.charAt(local11) + (local9 << 5) - local9;
		}
		return local9;
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
	public static void method6102() {
		Static293.aBoolean301 = true;
	}
}
