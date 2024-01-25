import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
	public static final int[] anIntArray663 = new int[32];

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Z")
	public static boolean aBoolean543 = true;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZ)Z")
	public static boolean method5646(@OriginalArg(1) boolean arg0) {
		@Pc(14) boolean local14 = Static217.aClass105_5.method4296();
		if (local14 == arg0) {
			return true;
		}
		if (!arg0) {
			Static217.aClass105_5.method4232();
		} else if (!Static217.aClass105_5.method4253()) {
			arg0 = false;
		}
		if (local14 == arg0) {
			return false;
		} else {
			Static311.aBoolean510 = arg0;
			Static100.method1593(Static197.aClass215_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public static void method5649() {
		if (Static204.anIntArray679 != null && Static13.anIntArray10 != null) {
			return;
		}
		Static13.anIntArray10 = new int[256];
		Static204.anIntArray679 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static204.anIntArray679[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static13.anIntArray10[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
