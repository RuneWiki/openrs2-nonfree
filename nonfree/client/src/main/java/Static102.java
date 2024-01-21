import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	public static int anInt2580;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public static int anInt2582;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "[Lclient!ed;")
	public static Class23[] aClass23Array11 = new Class23[500];

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!n;")
	public static Class56 aClass56_10 = new Class56();

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1006 = Static169.method2903("sch-Utteln:");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ig;BILclient!f;)V")
	public static void method1722(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class27 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class56 local9 = aClass56_10;
		synchronized (aClass56_10) {
			for (@Pc(22) Class1_Sub25 local22 = (Class1_Sub25) aClass56_10.method1853(); local22 != null; local22 = (Class1_Sub25) aClass56_10.method1855()) {
				if (local22.aLong140 == (long) arg1 && arg2 == local22.aClass27_6 && local22.anInt4202 == 0) {
					local7 = local22.aByteArray47;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(76) byte[] local76 = arg2.method715(arg1);
			arg0.method1308(local76, arg1, arg2, true);
		} else {
			arg0.method1308(local7, arg1, arg2, true);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method1724() {
		aClass23_1006 = null;
		aClass56_10 = null;
		aClass23Array11 = null;
		anIntArray326 = null;
	}
}
