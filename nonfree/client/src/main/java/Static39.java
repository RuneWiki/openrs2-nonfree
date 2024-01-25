import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!ij;")
	public static Class93 aClass93_14;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_18 = new Class85(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_12 = new Class109(32);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)I")
	public static int method616() {
		return 15;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)I")
	public static int method617(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	public static void method618() {
		@Pc(1) Class109 local1 = Static176.aClass109_40;
		synchronized (Static176.aClass109_40) {
			Static176.aClass109_40.method2850();
		}
	}
}
