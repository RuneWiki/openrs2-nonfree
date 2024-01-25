import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
	public static int anInt4349;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString154 = "Loading title screen - ";

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
	public static int anInt4350 = 0;

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString155 = " has logged out.";

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
	public static void method3648() {
		Static86.aClass154_29.method4219();
		Static51.aClass154_16.method4219();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!fd;II)V")
	public static void method3649(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class84 local8 = arg1.method1506(Static164.aClass92_7);
		if (local8 == null) {
			return;
		}
		Static164.aClass92_7.method4459(arg2, arg0, arg2 + arg1.anInt1829, arg1.anInt1806 + arg0);
		if (Static27.anInt450 >= 3) {
			Static164.aClass92_7.method4508(local8, arg2, arg0);
		} else {
			Static48.aClass60_3.method5676((float) arg2 + (float) arg1.anInt1829 / 2.0F, (float) arg0 + (float) arg1.anInt1806 / 2.0F, ((int) -Static138.aFloat35 & 0x3FFF) << 2, local8, arg2, arg0);
		}
	}
}
