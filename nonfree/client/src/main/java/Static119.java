import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
	public static int anInt2592;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_76 = new Class119(50);

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
	public static final int[] anIntArray230 = new int[4096];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	public static void method2503() {
		for (@Pc(7) int local7 = 0; local7 < Static122.aClass105ArrayArray3.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static122.aClass105ArrayArray3[local7].length; local11++) {
				Static122.aClass105ArrayArray3[local7][local11] = Static49.aClass105_2;
			}
		}
	}
}
