import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!sb", name = "ib", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2236 = Static118.method2249("Loading )2 please wait)3");

	@OriginalMember(owner = "client!sb", name = "pb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2239 = Static118.method2249("level)2");

	@OriginalMember(owner = "client!sb", name = "mb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2237 = aClass65_2239;

	@OriginalMember(owner = "client!sb", name = "nb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2238 = aClass65_2236;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
	public static void method2874() {
		for (@Pc(1) int local1 = 0; local1 < Static41.anInt1103; local1++) {
			@Pc(6) Class54 local6 = Static192.aClass54Array3[local1];
			Static90.method3298(local6);
			Static192.aClass54Array3[local1] = null;
		}
		Static41.anInt1103 = 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Z")
	public static boolean method2875(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}
}
