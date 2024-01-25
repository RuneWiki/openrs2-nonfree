import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_18 = new Class12(84, -2);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!fo;B)V")
	public static void method392(@OriginalArg(0) Class82 arg0) {
		Static135.anInt2420 = arg0.method1835("titlebg");
		Static87.anInt6711 = arg0.method1835("logo");
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)V")
	public static void method393(@OriginalArg(1) int arg0) {
		if (Static337.anInt5743 == 1) {
			Static357.anInt6116 = arg0;
		} else if (Static337.anInt5743 == 2 || Static337.anInt5743 == 3) {
			Static291.anInt5071 = arg0;
		}
	}
}
