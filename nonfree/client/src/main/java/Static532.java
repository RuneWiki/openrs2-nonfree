import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
	public static int anInt8756;

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
	public static int anInt8752 = 0;

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_122 = new Class154(80, 1);

	@OriginalMember(owner = "client!uda", name = "h", descriptor = "I")
	public static int anInt8757 = 0;

	@OriginalMember(owner = "client!uda", name = "i", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_142 = new Class349(64, 2);

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)V")
	public static void method6993(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class2 local9 = Static323.aClass90_16.method1676(); local9 != null; local9 = Static323.aClass90_16.method1680()) {
			if ((local9.aLong268 >> 48 & 0xFFFFL) == (long) arg0) {
				local9.method7657();
			}
		}
	}
}
