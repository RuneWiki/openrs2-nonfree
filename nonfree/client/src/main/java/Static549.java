import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "Lclient!ws;")
	public static final Class364 aClass364_20 = new Class364(2, -1);

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "Lclient!eu;")
	public static final Class95 aClass95_8 = new Class95(7, 2);

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "Lclient!hw;")
	public static final Class134 aClass134_4 = new Class134(1);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI)Lclient!nc;")
	public static Class220 method7511(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class220 local12 = new Class220();
		local12.anInt6290 = arg0 + 5 + 1;
		local12.anInt6298 = -1;
		local12.anInt6303 = -1;
		local12.anInt6291 = arg1 + 1 + 5;
		local12.anIntArrayArray66 = new int[local12.anInt6291][local12.anInt6290];
		local12.method5072();
		return local12;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)Z")
	public static boolean method7512(@OriginalArg(1) int arg0) {
		if (arg0 == 44 || arg0 == 21 || arg0 == 13 || arg0 == 30 || arg0 == 11) {
			return true;
		} else {
			return arg0 == 23 || arg0 == 1009;
		}
	}
}
