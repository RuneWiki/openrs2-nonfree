import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	public static int anInt10439;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
	public static final int[] anIntArray671 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
	public static final int[] anIntArray672 = new int[5];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)I")
	public static int method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static9.aClass65Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 9;
		@Pc(15) int local15 = arg2 >> 9;
		if (local11 < 0 || local15 < 0 || local11 > Static47.anInt1794 - 1 || Static209.anInt4742 - 1 < local15) {
			return 0;
		}
		@Pc(43) int local43 = arg1;
		if (arg1 < 3 && (Static476.aByteArrayArrayArray5[1][local11][local15] & 0x2) != 0) {
			local43 = arg1 + 1;
		}
		return Static9.aClass65Array1[local43].method7999(arg0, arg2);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
	public static boolean method8718() {
		return Static529.anInt9623 >= 1;
	}
}
