import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!b;")
	public static Class6 aClass6_65;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	public static int anInt2318;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1121 = Static193.method3027("Started 3d library");

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1122 = aClass70_1121;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1123 = Static193.method3027("Username: ");

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1124 = Static193.method3027("Unable to find ");

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1125 = aClass70_1124;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1126 = aClass70_1123;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)I")
	public static int method1662(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!ce;)V")
	public static void method1663(@OriginalArg(1) Class3_Sub4 arg0) {
		@Pc(4) byte[] local4 = new byte[24];
		if (Static152.aClass82_4 != null) {
			@Pc(20) int local20;
			try {
				Static152.aClass82_4.method2441(0L);
				Static152.aClass82_4.method2432(local4);
				for (local20 = 0; local20 < 24 && local4[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local20 = 0; local20 < 24; local20++) {
					local4[local20] = -1;
				}
			}
		}
		arg0.method1277(local4, 24);
	}
}
