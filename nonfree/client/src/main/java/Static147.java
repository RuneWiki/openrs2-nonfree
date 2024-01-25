import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "[I")
	public static int[] anIntArray692;

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "Z")
	public static boolean aBoolean698 = false;

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_104 = new Class136(64);

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_144 = new Class47(17, -1);

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)Z")
	public static boolean method7401(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)I")
	public static int method7402() {
		return Static467.anInt8010;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)V")
	public static void method7404(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class6 local10 = Static121.aClass128_7.method3265(); local10 != null; local10 = Static121.aClass128_7.method3273()) {
			if ((long) arg0 == (local10.aLong263 >> 48 & 0xFFFFL)) {
				local10.method7804();
			}
		}
	}
}
