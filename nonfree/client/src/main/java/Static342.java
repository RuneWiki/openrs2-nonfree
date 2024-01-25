import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!oda", name = "y", descriptor = "I")
	public static int anInt6309;

	@OriginalMember(owner = "client!oda", name = "L", descriptor = "[Lclient!ha;")
	public static Class104[] aClass104Array59;

	@OriginalMember(owner = "client!oda", name = "Q", descriptor = "Lclient!n;")
	public static Interface13 anInterface13_11;

	@OriginalMember(owner = "client!oda", name = "F", descriptor = "I")
	public static int anInt6315 = 0;

	@OriginalMember(owner = "client!oda", name = "O", descriptor = "I")
	public static int anInt6322 = 0;

	@OriginalMember(owner = "client!oda", name = "T", descriptor = "I")
	public static int anInt6325 = 0;

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "(III)I")
	public static int method5736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(17) int local17 = 255 - local12;
		@Pc(35) int local35 = ((arg0 & 0xFF00) * local12 & 0xFF0000 | (arg0 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8;
		return local35 + (((arg1 & 0xFF00) * local17 & 0xFF0000 | local17 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!bk;I)I")
	public static int method5738(@OriginalArg(0) Class31 arg0) {
		if (arg0 == Static44.aClass31_7) {
			return 9216;
		} else if (arg0 == Static355.aClass31_5) {
			return 34065;
		} else if (arg0 == Static145.aClass31_3) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
