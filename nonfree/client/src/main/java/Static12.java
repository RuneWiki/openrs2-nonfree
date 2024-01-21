import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_140 = Static177.method3050("Hidden)2use");

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_141 = Static177.method3050("Texturen geladen)3");

	@OriginalMember(owner = "client!bc", name = "fb", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()V")
	public static void method239() {
		for (@Pc(1) int local1 = 0; local1 < Static111.anInt2730; local1++) {
			@Pc(6) Class86 local6 = Static82.aClass86Array4[local1];
			Static60.method1146(local6);
			Static82.aClass86Array4[local1] = null;
		}
		Static111.anInt2730 = 0;
	}
}
