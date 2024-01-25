import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "Lclient!bo;")
	public static final Class24 aClass24_29 = new Class24(32);

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method5096() {
		@Pc(13) int local13 = Static295.method5004();
		if (local13 == 0) {
			Static219.aByteArrayArrayArray10 = null;
			Static22.method431(0);
		} else if (local13 == 1) {
			Static123.method2164((byte) 0);
			Static22.method431(512);
			if (Static160.aByteArrayArrayArray9 != null) {
				Static62.method1012();
			}
		} else {
			Static123.method2164((byte) (Static293.anInt6246 - 4 & 0xFF));
			Static22.method431(2);
		}
		Static264.anInt5282 = Static163.anInt3184;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5097(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}
