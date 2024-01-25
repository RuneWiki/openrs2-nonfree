import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
	public static int anInt6172;

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "[I")
	public static final int[] anIntArray503 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5243(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIBI)I")
	public static int method5245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1023 - arg0;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(III)I")
	public static int method5246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static9.anIntArray32[arg0 & 0x3] : Static8.anIntArray494[arg0 & 0x3];
	}
}
