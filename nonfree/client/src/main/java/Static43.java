import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
	public static int anInt896;

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!bv", name = "G", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_4 = new Class134(4);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static125.method2231(arg3)) {
			return;
		}
		if (Static451.aClass251ArrayArray3[arg3] == null) {
			Static57.method1254(Static437.aClass251ArrayArray2[arg3], -1, arg8, arg2, arg6, arg1, arg4, arg7, arg5, arg0);
		} else {
			Static57.method1254(Static451.aClass251ArrayArray3[arg3], -1, arg8, arg2, arg6, arg1, arg4, arg7, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!gq;II)V")
	public static void method808(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(3) int arg2) {
		Static427.aClass93ArrayArray3[arg2][arg0] = arg1;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!wq;I)I")
	public static int method810(@OriginalArg(0) Class31_Sub2_Sub1_Sub2 arg0) {
		@Pc(6) Class53 local6 = arg0.aClass53_1;
		if (local6.anIntArray131 != null) {
			local6 = local6.method1508(Static394.aClass23_1);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(26) int local26 = local6.anInt1716;
		@Pc(30) Class21 local30 = arg0.method5982();
		if (arg0.aBoolean505) {
			local26 = local6.anInt1696;
		} else if (arg0.anInt7338 == local30.anInt620 || arg0.anInt7338 == local30.anInt628 || arg0.anInt7338 == local30.anInt629 || local30.anInt609 == arg0.anInt7338) {
			local26 = local6.anInt1722;
		} else if (arg0.anInt7338 == local30.anInt611 || arg0.anInt7338 == local30.anInt603 || arg0.anInt7338 == local30.anInt607 || arg0.anInt7338 == local30.anInt599) {
			local26 = local6.anInt1725;
		}
		return local26;
	}
}
