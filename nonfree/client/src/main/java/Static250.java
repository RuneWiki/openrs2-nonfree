import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	public static int anInt4943 = 0;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Lclient!hi;")
	public static Class61 aClass61_26 = new Class61();

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!qc;")
	public static Class135 aClass135_32 = new Class135(64);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method3856() {
		Static127.aClass135_13.method3324();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)V")
	public static void method3857(@OriginalArg(0) int arg0) {
		Static142.method2352();
		Static139.method2339();
		@Pc(20) int local20 = Static240.method3695(arg0).anInt4890;
		if (local20 == 0) {
			return;
		}
		@Pc(27) int local27 = Static128.anIntArray259[arg0];
		if (local20 == 5) {
			Static1.anInt4243 = local27;
		}
		if (local20 == 9) {
			Static228.anInt4520 = local27;
		}
		if (local20 == 6) {
			Static215.anInt4272 = local27;
		}
	}
}
