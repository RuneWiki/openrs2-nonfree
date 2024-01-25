import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "Lclient!fh;")
	public static Class6_Sub12_Sub1 aClass6_Sub12_Sub1_1;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	public static int anInt2269;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public static int anInt2268 = -1;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString92 = "Prepared sound engine";

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_19 = new Class211();

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "Lclient!ln;")
	public static final Class127 aClass127_1 = Static267.method4536();

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray89 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[100];

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	public static void method2418() {
		Static260.anInt4772 = 0;
		@Pc(17) int local17 = Static44.anInt881 + (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 >> 7);
		@Pc(25) int local25 = (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 >> 7) + Static300.anInt5672;
		if (local17 >= 3053 && local17 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static260.anInt4772 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static260.anInt4772 = 1;
		}
		if (Static260.anInt4772 == 1 && local17 >= 3139 && local17 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static260.anInt4772 = 0;
		}
	}
}
