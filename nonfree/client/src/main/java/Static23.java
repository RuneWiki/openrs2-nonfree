import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
	public static int anInt474;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
	public static int anInt469 = 0;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
	public static int[] anIntArray56 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
	public static int[] anIntArray57 = new int[50];

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
	public static int anInt471 = 1;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "Lclient!fm;")
	public static Class49 aClass49_1 = new Class49(64);

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "[C")
	public static char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
	public static int[] anIntArray58 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "Z")
	public static boolean aBoolean37 = true;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBII)I")
	public static int method431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 <= arg0 ? (arg0 > arg1 ? arg1 : arg0) : arg2;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)V")
	public static void method432() {
		Static183.aClass135_25.method3320(5);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIZ)I")
	public static int method433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class1_Sub33 local12 = (Class1_Sub33) Static160.aClass70_9.method2075((long) arg1);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local12.anIntArray505.length; local20++) {
			if (local12.anIntArray505[local20] >= 0 && Static178.anInt3973 > local12.anIntArray505[local20]) {
				@Pc(53) Class42 local53 = Static112.method2060(local12.anIntArray505[local20]);
				if (local53.aClass70_2 != null) {
					@Pc(66) Class1_Sub29 local66 = (Class1_Sub29) local53.aClass70_2.method2075((long) arg0);
					if (local66 != null) {
						if (arg2) {
							local18 += local12.anIntArray507[local20] * local66.anInt4792;
						} else {
							local18 += local66.anInt4792;
						}
					}
				}
			}
		}
		return local18;
	}
}
