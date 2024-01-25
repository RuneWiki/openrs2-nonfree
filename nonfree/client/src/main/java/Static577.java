import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wba", name = "C", descriptor = "Lclient!bi;")
	public static Class31 aClass31_122;

	@OriginalMember(owner = "client!wba", name = "D", descriptor = "[[I")
	public static int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!wba", name = "E", descriptor = "Lclient!bi;")
	public static Class31 aClass31_123;

	@OriginalMember(owner = "client!wba", name = "v", descriptor = "Lclient!lj;")
	public static final Class210 aClass210_14 = new Class210(8, 0, 4, 1);

	@OriginalMember(owner = "client!wba", name = "x", descriptor = "Lclient!gj;")
	public static final Class124 aClass124_67 = new Class124();

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)V")
	public static void method7855(@OriginalArg(1) int arg0) {
		Static156.aLong82 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(Z)V")
	public static void method7857() {
		for (@Pc(11) int local11 = 0; local11 < Static522.aClass285ArrayArray1.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < Static522.aClass285ArrayArray1[local11].length; local15++) {
				Static522.aClass285ArrayArray1[local11][local15] = Static185.aClass285_5;
			}
		}
	}
}
