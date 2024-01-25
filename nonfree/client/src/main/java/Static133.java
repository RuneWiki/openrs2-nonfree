import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public static int anInt2882;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public static int anInt2886;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	public static int anInt2883 = 0;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public static int anInt2885 = 0;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	public static void method2668() {
		@Pc(1) Class103 local1 = Static193.aClass103_36;
		synchronized (Static193.aClass103_36) {
			Static193.aClass103_36.method2678();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method2669(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)I")
	public static int method2670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(26) int local26 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | arg0 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(31) int local31 = 255 - arg0;
		return (((arg2 & 0xFF00FF) * local31 & 0xFF00FF00 | (arg2 & 0xFF00) * local31 & 0xFF0000) >>> 8) + local26;
	}
}
