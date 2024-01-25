import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!ts;")
	public static Class193 aClass193_2;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "B")
	public static byte aByte23;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	public static void method2341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 != null && local7.aClass62_Sub3_1 != null) {
			local7.aClass62_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIII)V")
	public static void method2343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class184 local3 = new Class184();
		local3.anInt5833 = arg1 >> 7;
		local3.anInt5842 = arg2 >> 7;
		local3.anInt5830 = arg3 >> 7;
		local3.anInt5825 = arg4 >> 7;
		local3.anInt5824 = arg0;
		local3.anInt5836 = arg1;
		local3.anInt5835 = arg2;
		local3.anInt5832 = arg3;
		local3.anInt5829 = arg4;
		local3.anInt5831 = arg5;
		local3.anInt5828 = arg6;
		Static234.aClass184Array1[Static69.anInt1500++] = local3;
	}
}
