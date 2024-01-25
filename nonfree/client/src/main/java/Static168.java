import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!fm", name = "kb", descriptor = "Lclient!ow;")
	public static final Class271 aClass271_25 = new Class271();

	@OriginalMember(owner = "client!fm", name = "oc", descriptor = "Ljava/lang/String;")
	public static String aString46 = null;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(IB)V")
	public static void method3687(@OriginalArg(0) int arg0) {
		Static637.anInt10986 = arg0;
		@Pc(11) Class22 local11 = Static290.aClass22_36;
		synchronized (Static290.aClass22_36) {
			Static290.aClass22_36.method461();
		}
	}
}
