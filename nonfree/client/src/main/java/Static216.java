import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
	public static int anInt7759;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
	public static int anInt7753 = 0;

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "[F")
	public static final float[] aFloatArray83 = new float[4];

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)I")
	public static int method6757() {
		@Pc(7) int local7 = Static300.aClass53_34.method1252();
		if (local7 < Static152.aClass53Array1.length - 1) {
			Static300.aClass53_34 = Static152.aClass53Array1[local7 + 1];
		}
		return 100;
	}
}
