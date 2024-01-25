import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static497 {

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "Lclient!nca;")
	public static Class254 aClass254_127;

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
	public static final int anInt7960 = 50;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "[I")
	public static final int[] anIntArray567 = new int[anInt7960];

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
	public static int anInt7958 = 0;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "[I")
	public static final int[] anIntArray568 = new int[anInt7960];

	@OriginalMember(owner = "client!pq", name = "E", descriptor = "[Lclient!ida;")
	public static Class173[] aClass173Array1 = null;

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
	public static int anInt7962 = 0;

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "[Lclient!l;")
	public static final Class217[] aClass217Array1 = new Class217[anInt7960];

	@OriginalMember(owner = "client!pq", name = "F", descriptor = "[I")
	public static final int[] anIntArray569 = new int[anInt7960];

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBI)B")
	public static byte method7103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)V")
	public static void method7104(@OriginalArg(1) int arg0) {
		if (Static357.anInt5722 == 7 && (Static391.anInt6484 == 0 && Static306.anInt4661 == 0)) {
			Static690.anInt10620 = arg0;
			Static261.method9374(-71, 9);
		}
	}
}
