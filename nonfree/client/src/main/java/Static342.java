import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static342 {

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
	public static int anInt6256;

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
	public static int anInt6258;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V")
	public static void method5239(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static499.aClass63_15 == Static230.aClass63_16) {
			if (Static191.method5050(0, false, 1, -2, 1, arg0, arg1, 0)) {
				return;
			}
			Static191.method5050(0, false, 1, -3, 1, arg0, arg1, 0);
		} else if (Static191.method5050(0, false, 1, -3, 1, arg0, arg1, 0)) {
			return;
		} else {
			Static191.method5050(0, false, 1, -2, 1, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II[B)I")
	public static int method5240(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static579.method8021(arg1, 0, arg0);
	}
}
