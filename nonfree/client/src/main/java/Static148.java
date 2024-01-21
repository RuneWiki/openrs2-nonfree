import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "J")
	public static long aLong112;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static int anInt3209;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "Lclient!gd;")
	public static Class29_Sub1 aClass29_Sub1_46;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
	public static int anInt3212 = -1;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method2279() {
		aClass29_Sub1_46 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	public static void method2282(@OriginalArg(0) int arg0) {
		if (Static168.anInt3655 == 0) {
			Static178.aClass2_Sub5_Sub4_2.method2684(arg0);
		} else {
			Static70.anInt1667 = arg0;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)I")
	public static int method2283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(37) int local37 = Static6.method119(arg0 - 1, arg1 + -1) + Static6.method119(arg0 - 1, arg1 + 1) + Static6.method119(arg0 + 1, arg1 + -1) + Static6.method119(arg0 + 1, arg1 - -1);
		@Pc(79) int local79 = Static6.method119(arg0, arg1 - 1) + Static6.method119(arg0, arg1 + 1) + Static6.method119(arg0 + -1, arg1) + Static6.method119(arg0 + 1, arg1);
		@Pc(84) int local84 = Static6.method119(arg0, arg1);
		return local84 / 4 + local37 / 16 + local79 / 8;
	}
}
