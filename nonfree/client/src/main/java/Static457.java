import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static457 {

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public static int anInt4062;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "J")
	public static long aLong117 = 20000000L;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_55 = new Class160(54, -1);

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Z")
	public static boolean aBoolean261 = false;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_97 = new Class40(64, -1);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method3508(@OriginalArg(1) Class121 arg0) {
		if (Static330.aBoolean415) {
			Static404.method5917(arg0);
		} else {
			Static381.method5557(arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Z")
	public static boolean method3510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static377.method5519(arg1, arg0) || Static85.method1344(arg0, arg1);
	}
}
