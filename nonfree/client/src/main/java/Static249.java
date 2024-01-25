import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!pr", name = "I", descriptor = "Lclient!il;")
	public static final Class93 aClass93_2 = new Class93(6, 14);

	@OriginalMember(owner = "client!pr", name = "P", descriptor = "[I")
	public static final int[] anIntArray4 = new int[14];

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(III)V")
	public static void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = Static219.anInt4418 * arg0 >> 8;
		if (arg1 == -1 && !Static298.aBoolean482) {
			Static312.method5406();
		} else if (arg1 != -1 && (arg1 != Static185.anInt1932 || !Static212.method3950()) && local5 != 0 && !Static298.aBoolean482) {
			Static271.method597(arg1, local5, Static330.aClass30_93);
		}
		Static185.anInt1932 = arg1;
	}
}
