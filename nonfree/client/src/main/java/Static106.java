import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_694 = Static186.method3527("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
	public static int anInt2129 = 0;

	@OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
	public static int anInt2130 = -1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BZ)V")
	public static void method1638(@OriginalArg(1) boolean arg0) {
		if (Static9.aClass26_1 == null) {
			return;
		}
		try {
			@Pc(19) Class1_Sub17 local19 = new Class1_Sub17(4);
			local19.method2175(arg0 ? 2 : 3);
			local19.method2133(0);
			Static9.aClass26_1.method781(local19.aByteArray40, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				Static9.aClass26_1.method776();
			} catch (@Pc(45) Exception local45) {
			}
			Static165.anInt2647++;
			Static9.aClass26_1 = null;
		}
	}
}
