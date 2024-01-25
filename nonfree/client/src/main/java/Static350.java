import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static350 {

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
	public static int anInt6430;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "J")
	public static long aLong157 = 0L;

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
	public static int anInt6434 = 0;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLclient!in;)V")
	public static void method5207(@OriginalArg(1) Class160 arg0) {
		if (arg0.anInt4166 == 5 && arg0.anInt4205 != -1) {
			Static68.method1137(Static31.aClass78_18, arg0);
		}
	}
}
