import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dia", name = "h", descriptor = "I")
	public static int anInt2851;

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "[I")
	public static final int[] anIntArray141 = new int[5];

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "Lclient!at;")
	public static Class24 aClass24_7 = null;

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "I")
	public static int anInt2849 = 0;

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(FZFF)I")
	public static int method2662(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local12 < local21 && local21 > local35) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local21 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
	public static void method2663() {
		Static343.aClass99_48.method3057();
		Static119.aClass211_3.method6006();
		Static47.aClass211_2.method6006();
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)V")
	public static void method2665() {
		@Pc(1) Class169 local1 = Static20.aClass169_4;
		synchronized (Static20.aClass169_4) {
			Static20.aClass169_4.method5006();
		}
		local1 = Static378.aClass169_18;
		synchronized (Static378.aClass169_18) {
			Static378.aClass169_18.method5006();
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(B[SI)[S")
	public static short[] method2666(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) short[] local14 = new short[arg1];
		Static653.method7722(arg0, 0, local14, 0, arg1);
		return local14;
	}
}
