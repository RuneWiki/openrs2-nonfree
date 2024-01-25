import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static300 {

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Z")
	public static boolean aBoolean405 = false;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
	public static final int[] anIntArray552 = new int[14];

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "Lclient!paa;")
	public static final Class229 aClass229_15 = new Class229(0, -1);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)I")
	public static int method4752(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z")
	public static boolean method4753(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public static void method4756() {
		if (Static250.anInt4901 == 6) {
			Static250.anInt4901 = 7;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLclient!bl;)Z")
	public static boolean method4761(@OriginalArg(1) Class30 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean46) {
			return false;
		} else if (!arg0.method907(Static118.anInterface16_2)) {
			return false;
		} else if (Static386.aClass17_30.method738((long) arg0.anInt888) == null) {
			return Static256.aClass17_21.method738((long) arg0.anInt871) == null;
		} else {
			return false;
		}
	}
}
