import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString120;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "[I")
	public static int[] anIntArray886;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
	public static int anInt10126;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
	public static int anInt10127;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)I")
	public static int method8870(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static406.anInt6453 - 1; local3++) {
			if (arg0 < Static219.anIntArray374[local3] + Static589.anIntArray820[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static406.anInt6453 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)I")
	public static int method8871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}
}
