import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!eq;")
	public static Class97 aClass97_31;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
	public static int anInt2897;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public static int anInt2899 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method2491(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static621.anInt10092 == 2) {
				Static408.aClass235Array1[0].method5775(Static328.aClass103Array1[0]);
				Static408.aClass235Array1[1].method5775(Static328.aClass103Array1[1]);
			} else if (Static621.anInt10092 == 3) {
				Static408.aClass235Array1[0].method5775(Static328.aClass103Array1[0]);
				Static408.aClass235Array1[1].method5775(Static328.aClass103Array1[1]);
				Static408.aClass235Array1[2].method5775(Static328.aClass103Array1[2]);
			} else {
				Static408.aClass235Array1[0].method5775(Static328.aClass103Array1[0]);
				Static408.aClass235Array1[1].method5775(Static328.aClass103Array1[1]);
				Static408.aClass235Array1[2].method5775(Static328.aClass103Array1[2]);
				Static408.aClass235Array1[3].method5775(Static328.aClass103Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static621.anInt10092 == 2) {
				Static408.aClass235Array1[0].method5775(Static328.aClass103Array1[2]);
			} else if (Static621.anInt10092 == 3) {
				Static408.aClass235Array1[0].method5775(Static328.aClass103Array1[3]);
				Static408.aClass235Array1[1].method5775(Static328.aClass103Array1[4]);
			} else {
				Static408.aClass235Array1[0].method5775(Static328.aClass103Array1[4]);
				Static408.aClass235Array1[1].method5775(Static328.aClass103Array1[5]);
				Static408.aClass235Array1[2].method5775(Static328.aClass103Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static621.anInt10092 == 2) {
				Static408.aClass235Array1[0].method5775(Static328.aClass103Array1[3]);
				return;
			}
			if (Static621.anInt10092 == 3) {
				Static408.aClass235Array1[0].method5775(Static328.aClass103Array1[5]);
				return;
			}
			Static408.aClass235Array1[0].method5775(Static328.aClass103Array1[7]);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!bj;)I")
	public static int method2492(@OriginalArg(1) Class2_Sub5_Sub2 arg0) {
		@Pc(12) String local12 = Static475.method7385(arg0);
		return Static240.aClass114_19.method3008(Static185.aClass20Array5, local12);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)I")
	public static int method2494() {
		return 16;
	}
}
