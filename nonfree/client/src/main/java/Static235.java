import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!s", name = "N", descriptor = "I")
	public static int anInt4747;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "Lclient!me;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!wn;")
	public static Class182 aClass182_26 = new Class182();

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
	public static int anInt4759 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBLclient!pk;)Lclient!eg;")
	public static Class8_Sub1_Sub7_Sub1 method3576(@OriginalArg(1) int arg0, @OriginalArg(3) Class132 arg1) {
		return Static247.method4168(arg1, 0, arg0) ? Static41.method628() : null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lclient!he;")
	public static Class70 method3578(@OriginalArg(0) int arg0) {
		@Pc(10) Class70 local10 = (Class70) Static229.aClass61_43.method1384((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static46.aClass132_16.method3194(Static149.method2411(arg0), Static72.method1151(arg0));
		local10 = new Class70();
		local10.anInt2087 = arg0;
		if (local24 != null) {
			local10.method1574(new Class8_Sub2(local24));
		}
		local10.method1582();
		if (local10.aBoolean157) {
			local10.anInt2064 = 0;
			local10.aBoolean158 = false;
		}
		if (!Static47.aBoolean71 && local10.aBoolean151) {
			local10.aStringArray34 = null;
		}
		Static229.aClass61_43.method1377((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)I")
	public static int method3581() {
		return Static118.anInt2384;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
	public static void method3583() {
		Static66.aClass8_Sub2_Sub1_4.method2398(99);
		Static66.aClass8_Sub2_Sub1_4.method2378(0L);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([BIII)I")
	public static int method3584(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg1; local7 < arg2; local7++) {
			local5 = local5 >>> 8 ^ Class8_Sub3_Sub26.anIntArray265[(local5 ^ arg0[local7]) & 0xFF];
		}
		return ~local5;
	}
}
