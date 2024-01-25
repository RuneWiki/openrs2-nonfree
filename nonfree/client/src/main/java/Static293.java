import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!sp", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString365 = " has logged in.";

	@OriginalMember(owner = "client!sp", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString366 = "Opened title screen";

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "(I)V")
	public static void method4826() {
		@Pc(1) Class103 local1 = Static248.aClass103_47;
		synchronized (Static248.aClass103_47) {
			Static248.aClass103_47.method2684();
		}
	}

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "(I)V")
	public static void method4827() {
		@Pc(5) Class103 local5 = Static329.aClass103_65;
		synchronized (Static329.aClass103_65) {
			Static329.aClass103_65.method2684();
		}
		local5 = Static103.aClass103_22;
		synchronized (Static103.aClass103_22) {
			Static103.aClass103_22.method2684();
		}
		local5 = Static269.aClass103_56;
		synchronized (Static269.aClass103_56) {
			Static269.aClass103_56.method2684();
		}
	}
}
