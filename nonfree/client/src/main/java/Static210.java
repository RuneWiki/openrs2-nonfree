import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "[B")
	public static final byte[] aByteArray51 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
	public static int anInt4408 = 0;

	@OriginalMember(owner = "client!wc", name = "X", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1516 = Static151.method2243("headicons_pk");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
	public static void method3078() {
		for (@Pc(1) int local1 = 0; local1 < Static133.anInt2867; local1++) {
			@Pc(6) Class39 local6 = Static192.aClass39Array3[local1];
			Static117.method1811(local6);
			Static192.aClass39Array3[local1] = null;
		}
		Static133.anInt2867 = 0;
	}
}
