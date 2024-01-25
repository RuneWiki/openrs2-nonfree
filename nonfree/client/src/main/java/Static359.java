import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "[I")
	public static final int[] anIntArray333 = new int[1];

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_112 = new Class337(8, -1);

	@OriginalMember(owner = "client!naa", name = "n", descriptor = "I")
	public static int anInt6012 = 2;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IZII)Lclient!sr;")
	public static Class5_Sub48 method5342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class5_Sub48 local5 = null;
		if (arg2 == 0) {
			local5 = Static16.method232(Static203.aClass46_45, Static276.aClass251_2);
		}
		if (arg2 == 1) {
			local5 = Static16.method232(Static213.aClass46_48, Static276.aClass251_2);
		}
		local5.aClass5_Sub22_Sub1_2.method5961(Static567.anInt9589 + arg0);
		local5.aClass5_Sub22_Sub1_2.method5904(Static565.anInt9560 + arg1);
		local5.aClass5_Sub22_Sub1_2.method5938(Static45.aClass115_1.method2490(82) ? 1 : 0);
		Static16.anInt249 = arg0;
		Static511.anInt8845 = arg1;
		Static302.aBoolean387 = false;
		Static608.method8682();
		return local5;
	}
}
