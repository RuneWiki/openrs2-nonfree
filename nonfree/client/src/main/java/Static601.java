import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!vha", name = "t", descriptor = "I")
	public static int anInt10241;

	@OriginalMember(owner = "client!vha", name = "w", descriptor = "[I")
	public static int[] anIntArray602;

	@OriginalMember(owner = "client!vha", name = "p", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_145 = new Class71(29, 3);

	@OriginalMember(owner = "client!vha", name = "u", descriptor = "I")
	public static int anInt10242 = -1;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(BIIIIII)I")
	public static int method8270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(8) int local8 = arg1;
			arg1 = arg5;
			arg5 = local8;
		}
		@Pc(20) int local20 = arg4 & 0x3;
		if (local20 == 0) {
			return arg3;
		} else if (local20 == 1) {
			return arg2;
		} else if (local20 == 2) {
			return 1 + 7 - arg1 - arg3;
		} else {
			return 7 + 1 - arg2 - arg5;
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ZIZI)Lclient!oh;")
	public static Class237 method8271(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class291 local5 = null;
		if (Static51.aClass235_2 != null) {
			local5 = new Class291(arg2, Static51.aClass235_2, Static546.aClass235Array1[arg2], 1000000);
		}
		Static357.aClass210_Sub1Array3[arg2] = Static613.aClass164_1.method4610(arg2, local5, Static192.aClass291_1);
		Static357.aClass210_Sub1Array3[arg2].method5517();
		return new Class237(Static357.aClass210_Sub1Array3[arg2], arg0, arg1);
	}
}
