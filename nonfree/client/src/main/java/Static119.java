import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
	public static int anInt2474;

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
	public static int anInt2475 = 0;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLclient!vda;)Z")
	public static boolean method2166(@OriginalArg(1) Class345 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean685) {
			return false;
		} else if (!arg0.method7486(Static287.anInterface17_2)) {
			return false;
		} else if (Static541.aClass91_36.method2271((long) arg0.anInt9191) == null) {
			return Static239.aClass91_18.method2271((long) arg0.anInt9198) == null;
		} else {
			return false;
		}
	}
}
