import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V")
	public static void method606(@OriginalArg(0) int arg0) {
		Static118.method2146();
		@Pc(11) int local11 = Static405.aClass252_1.method5553(arg0).anInt2383;
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static394.aClass23_1.anIntArray54[arg0];
		if (local11 == 6) {
			Static392.anInt6294 = local19;
		}
		if (local11 == 5) {
			Static357.anInt5884 = local19;
		}
	}
}
