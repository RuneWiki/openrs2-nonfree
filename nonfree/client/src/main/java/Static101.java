import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "B")
	public static byte aByte22;

	@OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
	public static int anInt1907;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_49 = new Class211(86, 6);

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "[Lclient!qq;")
	public static final Class205[] aClass205Array1 = new Class205[4];

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "(I)V")
	public static void method1540() {
		Static119.anInt2204 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static357.aClass2_Sub13Array3[local14] = null;
			Static288.aByteArray59[local14] = 1;
			Static428.aClass68Array1[local14] = null;
		}
	}
}
