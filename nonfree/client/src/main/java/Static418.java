import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "B")
	public static byte aByte101;

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "F")
	public static float aFloat135;

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "Z")
	public static boolean aBoolean515 = false;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
	public static void method6378() {
		Static102.aClass87_57.method1801();
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZI)V")
	public static void method6379(@OriginalArg(1) int arg0) {
		if (!Static633.method8959(arg0)) {
			return;
		}
		@Pc(19) Class295[] local19 = Static519.aClass295ArrayArray2[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class295 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt7975 = 0;
				local27.anInt7964 = 0;
				local27.anInt7966 = 1;
			}
		}
	}
}
