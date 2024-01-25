import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "Z")
	public static boolean aBoolean17;

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ao", name = "I", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([SBI)[S")
	public static short[] method196(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static468.method4352(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method198() {
		if (Static90.anInt1909 < 0) {
			Static126.anInt2600 = -1;
			Static370.anInt6392 = -1;
			Static90.anInt1909 = 0;
		}
		if (Static90.anInt1909 > Static143.anInt2868) {
			Static370.anInt6392 = -1;
			Static126.anInt2600 = -1;
			Static90.anInt1909 = Static143.anInt2868;
		}
		if (Static55.anInt999 < 0) {
			Static55.anInt999 = 0;
			Static126.anInt2600 = -1;
			Static370.anInt6392 = -1;
		}
		if (Static143.anInt2861 < Static55.anInt999) {
			Static55.anInt999 = Static143.anInt2861;
			Static126.anInt2600 = -1;
			Static370.anInt6392 = -1;
		}
	}
}
