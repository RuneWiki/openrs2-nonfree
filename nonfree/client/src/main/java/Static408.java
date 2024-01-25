import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!pt", name = "A", descriptor = "Lclient!su;")
	public static final Class298 aClass298_154 = new Class298();

	@OriginalMember(owner = "client!pt", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray64 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(III)Z")
	public static boolean method5879(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!oa;ZLclient!jp;)I")
	public static int method5881(@OriginalArg(0) Class90 arg0, @OriginalArg(2) Class159 arg1) {
		if (arg1.anInt4621 != -1) {
			return arg1.anInt4621;
		}
		if (arg1.anInt4617 != -1) {
			@Pc(36) Class115 local36 = arg0.anInterface2_15.method3085(arg0.method7480() ? arg1.anInt4617 : arg1.anInt4612);
			if (!local36.aBoolean231) {
				return local36.aShort55;
			}
		}
		return arg1.anInt4610;
	}
}
