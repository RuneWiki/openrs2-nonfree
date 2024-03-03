import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "[I")
	public static int[] anIntArray117;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "Lclient!jd;")
	public static Class13 aClass13_5;

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Lclient!r;")
	public static Class197 aClass197_18;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public static int anInt1735;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V", line = 3)
	public static void method1837(@OriginalArg(1) int arg0) {
		Static12.method282();
		@Pc(15) int local15 = Static52.aClass199_1.method5115(arg0).anInt4691;
		if (local15 == 0) {
			return;
		}
		@Pc(23) int local23 = Static199.aClass226_1.anIntArray430[arg0];
		if (local15 == 5) {
			Class160.anInt4082 = local23;
		}
		if (local15 == 6) {
			Class177.anInt4886 = local23;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I", line = 45)
	public static int method1839(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
