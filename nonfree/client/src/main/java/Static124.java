import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!od", name = "h", descriptor = "I")
	public static int anInt2981;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "J")
	public static long aLong108;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Ljava/lang/Object;")
	public static final Object anObject2 = new Object();

	@OriginalMember(owner = "client!od", name = "i", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1093 = Static177.method3050("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1094 = Static177.method3050("blinken3:");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	public static void method2213() {
		@Pc(9) Object local9 = anObject2;
		synchronized (anObject2) {
			if (Static28.anInt746 == 0) {
				Static126.aClass76_4.method2566(new Class35(), 5);
			}
			Static28.anInt746 = 600;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	public static int method2215(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
