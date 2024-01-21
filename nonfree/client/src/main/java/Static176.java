import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "[Lclient!vd;")
	public static Class92[] aClass92Array24;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 aClass1_Sub3_Sub1_Sub1_6;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	public static int anInt3790 = 0;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1807 = Static187.method3089("<col=80ff00>");

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public static int anInt3799 = 3;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_24 = new Class47(64);

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1808 = Static187.method3089(":");

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
	public static int anInt3804 = -1;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Z")
	public static boolean method2879(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZZZ)Lclient!ve;")
	public static Class3_Sub1 method2881(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class83 local10 = null;
		if (Static180.aClass96_47 != null) {
			local10 = new Class83(arg0, Static180.aClass96_47, Static66.aClass96Array1[arg0], 1000000);
		}
		return new Class3_Sub1(local10, Static202.aClass83_4, arg0, arg3, arg2, arg1);
	}
}
