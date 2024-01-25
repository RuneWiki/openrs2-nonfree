import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "Lclient!nd;")
	public static Class238 aClass238_266;

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
	public static int anInt9375;

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "Lclient!fh;")
	public static final Class114 aClass114_53 = new Class114();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
	public static void method7969(@OriginalArg(1) int arg0) {
		Static348.anInt6053 = arg0;
		@Pc(7) Class69 local7 = Static248.aClass69_25;
		synchronized (Static248.aClass69_25) {
			Static248.aClass69_25.method1905();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!ria;)V")
	public static void method7970(@OriginalArg(1) Class303 arg0) {
		if (arg0.anInt7935 == 5 && arg0.anInt7964 != -1) {
			Static159.method2763(Static141.aClass13_27, arg0);
		}
	}
}
