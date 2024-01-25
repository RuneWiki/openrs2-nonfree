import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!si", name = "e", descriptor = "Lclient!jd;")
	public static Class38 aClass38_4;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Z")
	public static boolean aBoolean519 = true;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	public static int anInt5864 = 0;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
	public static void method4934(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static196.aClass51ArrayArrayArray3 = Static54.aClass51ArrayArrayArray1;
			Static9.aClass105Array1 = Static121.aClass105Array3;
		} else {
			Static196.aClass51ArrayArrayArray3 = Static150.aClass51ArrayArrayArray2;
			Static9.aClass105Array1 = Static101.aClass105Array2;
		}
		Static32.anInt516 = Static196.aClass51ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
	public static int method4935(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(36) int local36 = (arg0 & 0x7F) * 96 >> 7;
			if (local36 < 2) {
				local36 = 2;
			} else if (local36 > 126) {
				local36 = 126;
			}
			return local36 + (arg0 & 0xFF80);
		}
	}
}
