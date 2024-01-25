import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "Z")
	public static boolean aBoolean211;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
	public static int anInt2601 = 1;

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_55 = new Class254(2, 7);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)I")
	public static int method2318(@OriginalArg(1) int arg0) {
		if (Static169.aClass114_4 != null) {
			Static169.aClass114_4.method2496();
			Static169.aClass114_4 = null;
		}
		Static95.anInt1872++;
		if (Static95.anInt1872 > 4) {
			Static101.anInt1977 = 0;
			Static95.anInt1872 = 0;
			return arg0;
		}
		Static101.anInt1977 = 0;
		if (Static369.anInt6689 == Static401.anInt7129) {
			Static401.anInt7129 = Static4.anInt147;
		} else {
			Static401.anInt7129 = Static369.anInt6689;
		}
		return -1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(FFIF)I")
	public static int method2319(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(22) float local22 = (float) 0 > arg0 ? -arg0 : arg0;
		@Pc(31) float local31 = arg1 < 0.0F ? -arg1 : arg1;
		if (local22 > local12 && local22 > local31) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local12 < local31 && local22 < local31) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!na;)V")
	public static void method2320(@OriginalArg(0) int arg0, @OriginalArg(1) Class70 arg1) {
		Static256.aClass70Array2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!tn;IBI)V")
	public static void method2321(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static206.aClass229_6 != null || Static378.aBoolean549 || (arg0 == null || Static374.method5292(arg0) == null)) {
			return;
		}
		Static206.aClass229_6 = arg0;
		Static196.aClass229_5 = Static374.method5292(arg0);
		Static317.anInt5502 = 0;
		Static280.aBoolean374 = false;
		Static255.anInt4375 = arg2;
		Static367.anInt6677 = arg1;
	}
}
