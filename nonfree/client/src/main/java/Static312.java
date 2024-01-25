import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Z")
	public static boolean aBoolean428;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!ir;")
	public static Class100 aClass100_123;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	public static int anInt6280 = -1;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
	public static int anInt6281 = 0;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
	public static int anInt6282 = -1;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Z")
	public static boolean aBoolean427 = true;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public static int anInt6287 = 0;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[100];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIBI)I")
	public static int method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > arg2) {
			return arg0;
		} else if (arg1 >= arg2) {
			return arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
	public static void method5335() {
		@Pc(10) Class198 local10 = Static249.aClass198_43;
		synchronized (Static249.aClass198_43) {
			Static249.aClass198_43.method5243(5);
		}
		local10 = Static216.aClass198_40;
		synchronized (Static216.aClass198_40) {
			Static216.aClass198_40.method5243(5);
		}
		local10 = Static323.aClass198_56;
		synchronized (Static323.aClass198_56) {
			Static323.aClass198_56.method5243(5);
		}
	}
}
