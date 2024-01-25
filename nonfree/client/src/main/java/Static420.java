import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!v", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "F")
	public static float aFloat98;

	@OriginalMember(owner = "client!v", name = "I", descriptor = "I")
	public static int anInt6806 = 0;

	@OriginalMember(owner = "client!v", name = "eb", descriptor = "[B")
	public static final byte[] aByteArray92 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method5606(@OriginalArg(0) int arg0) {
		Static378.anInt4251 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static132.anInt2639; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static87.anInt1875; local6++) {
				if (client.lb[arg0][local3][local6] == null) {
					client.lb[arg0][local3][local6] = new Class80(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(B)V")
	public static void method5608() {
		@Pc(5) Class134 local5 = Static223.aClass134_33;
		synchronized (Static223.aClass134_33) {
			Static223.aClass134_33.method3272();
		}
	}
}
