import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "Lclient!it;")
	public static Class28 aClass28_35;

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "[I")
	public static final int[] anIntArray593 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!wga", name = "z", descriptor = "[I")
	public static final int[] anIntArray594 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(III)Z")
	public static boolean method8886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "(I)Lclient!wj;")
	public static Class5_Sub5_Sub21 method8888() {
		@Pc(13) Class5_Sub5_Sub21 local13 = (Class5_Sub5_Sub21) Static547.aClass368_11.method8702();
		if (local13 != null) {
			local13.method9047();
			local13.method8952();
			return local13;
		}
		do {
			local13 = (Class5_Sub5_Sub21) Static403.aClass368_6.method8702();
			if (local13 == null) {
				return null;
			}
			if (local13.method8963() > Static95.method1587()) {
				return null;
			}
			local13.method9047();
			local13.method8952();
		} while ((local13.aLong274 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IZBI)Lclient!la;")
	public static Class207 method8889(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class157 local11 = null;
		if (Static511.aClass363_7 != null) {
			local11 = new Class157(arg2, Static511.aClass363_7, Static410.aClass363Array1[arg2], 1000000);
		}
		Static72.aClass229_Sub1Array1[arg2] = Static562.aClass237_2.method5277(Static229.aClass157_1, local11, arg2);
		Static72.aClass229_Sub1Array1[arg2].method5072();
		return new Class207(Static72.aClass229_Sub1Array1[arg2], arg1, arg0);
	}
}
