import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString189 = "flash1:";

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	public static int anInt4689 = 0;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString190 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public static void method4281() {
		Static145.anIntArray334 = Static205.method3810(0.4F);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public static void method4282() {
		@Pc(1) Class140 local1 = Static259.aClass140_132;
		synchronized (Static259.aClass140_132) {
			Static259.aClass140_132.method3824(5);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)I")
	public static int method4284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static328.anIntArray784[arg1 & 0x3] : Static181.anIntArray442[arg1 & 0x3];
	}
}
