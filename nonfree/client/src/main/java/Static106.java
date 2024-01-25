import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "Lclient!id;")
	public static final Class155 aClass155_1 = new Class155();

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_33 = new Class276(77, 16);

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "Lclient!mv;")
	public static final Class219 aClass219_4 = new Class219(4, 1, 1, 1);

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZIII)Z")
	public static boolean method2239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface22 local9 = (Interface22) Static496.method7511(arg2, arg1, arg0);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static205.method3408(local9) & true;
		}
		local9 = (Interface22) Static200.method3364(arg2, arg1, arg0, ut.class);
		if (local9 != null) {
			local11 &= Static205.method3408(local9);
		}
		local9 = (Interface22) Static86.method1922(arg2, arg1, arg0);
		if (local9 != null) {
			local11 &= Static205.method3408(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method2241() {
		return Static256.aBoolean474 || Static201.aClass3_Sub40_3 == null ? "" : Static201.aClass3_Sub40_3.aString88;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLclient!oa;Lclient!gr;)I")
	public static int method2242(@OriginalArg(1) Class15 arg0, @OriginalArg(2) Class128 arg1) {
		if (arg1.anInt3540 != -1) {
			return arg1.anInt3540;
		}
		if (arg1.anInt3546 != -1) {
			@Pc(36) Class178 local36 = arg0.anInterface4_11.method3088(arg0.method5289() ? arg1.anInt3546 : arg1.anInt3545);
			if (!local36.aBoolean488) {
				return local36.aShort56;
			}
		}
		return arg1.anInt3550;
	}
}
