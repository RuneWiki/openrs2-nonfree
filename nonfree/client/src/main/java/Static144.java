import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_56 = new Class265(57, 11);

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Z")
	public static boolean aBoolean234 = false;

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "Lclient!di;")
	public static final Class54 aClass54_45 = new Class54(47, 8);

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "Z")
	public static boolean aBoolean238 = false;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)J")
	public static long method2413() {
		return Static94.aClass26_1.method5212();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIZII)Lclient!q;")
	public static Class2_Sub35 method2415(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub35 local7 = new Class2_Sub35();
		local7.anInt5541 = arg0;
		local7.anInt5537 = arg2;
		Static113.aClass163_11.method3764((long) arg3, local7);
		Static95.method1833(arg2);
		@Pc(36) Class68 local36 = Static165.method2704(arg3);
		if (local36 != null) {
			Static78.method1460(local36);
		}
		if (Static412.aClass68_14 != null) {
			Static78.method1460(Static412.aClass68_14);
			Static412.aClass68_14 = null;
		}
		Static429.method5146();
		if (local36 != null) {
			Static49.method804(local36, !arg1);
		}
		if (!arg1) {
			Static168.method2742(arg2);
		}
		if (!arg1 && Static410.anInt6841 != -1) {
			Static76.method1390(Static410.anInt6841, 1);
		}
		return local7;
	}
}
