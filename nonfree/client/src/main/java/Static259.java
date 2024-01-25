import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
	public static int anInt4765 = 0;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Z")
	public static boolean aBoolean338 = false;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)I")
	public static int method4409(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V")
	public static void method4412(@OriginalArg(1) int arg0) {
		if (!Static31.method490(arg0)) {
			return;
		}
		@Pc(19) Class132[] local19 = Static81.aClass132ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class132 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt3534 = 0;
				local27.anInt3487 = 1;
				local27.anInt3573 = 0;
			}
		}
	}
}
