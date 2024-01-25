import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I")
	public static int method6206() {
		if (Static43.aFrame1 == null) {
			return Static160.aBoolean177 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!gk;B)V")
	public static void method6207(@OriginalArg(0) Class2_Sub7 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static17.anInt4840; local5++) {
			@Pc(13) int local13 = arg0.method4458();
			@Pc(17) int local17 = arg0.method4518();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static376.aClass86_Sub1Array1[local13] != null) {
				Static376.aClass86_Sub1Array1[local13].anInt1978 = local17;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Z")
	public static boolean method6208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static200.method2514(arg1, arg0) | (arg1 & 0x70000) != 0 || Static511.method7272(arg0, arg1);
	}
}
