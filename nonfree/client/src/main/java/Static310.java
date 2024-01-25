import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
	public static int anInt5690;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "[Lclient!i;")
	public static Class129[] aClass129Array5;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray13 = new byte[250][];

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
	public static int anInt5693 = -1;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)I")
	public static int method4636(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static19.anInt533 - 1; local3++) {
			if (arg0 < Static64.anIntArray57[local3] + Static145.anIntArray125[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static19.anInt533 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IB)V")
	public static void method4637(@OriginalArg(0) int arg0) {
		if (Static464.anIntArray523 == null || Static464.anIntArray523.length < arg0) {
			Static464.anIntArray523 = new int[arg0];
		}
	}
}
