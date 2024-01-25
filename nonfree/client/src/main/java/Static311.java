import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "[Lclient!mb;")
	public static final Class5_Sub2_Sub16[] aClass5_Sub2_Sub16Array1 = new Class5_Sub2_Sub16[14];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Z")
	public static boolean method5044(@OriginalArg(1) int arg0) {
		if (arg0 == 48 || arg0 == 19 || arg0 == 15 || arg0 == 21 || arg0 == 1010) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLclient!bda;)V")
	public static void method5045(@OriginalArg(1) Class15_Sub2_Sub1_Sub1 arg0) {
		@Pc(15) Class5_Sub19 local15 = (Class5_Sub19) Static484.aClass42_43.method1109((long) arg0.anInt4745);
		if (local15 == null) {
			Static160.method2898(arg0.anIntArray306[0], 0, null, arg0.anIntArray307[0], arg0.aByte91, arg0, null);
		} else {
			local15.method2823();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)Lclient!hf;")
	public static Class127 method5046(@OriginalArg(0) int arg0) {
		@Pc(16) Class127[] local16 = Static19.method6152();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class127 local24 = local16[local18];
			if (arg0 == local24.anInt3507) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public static void method5048() {
		Static40.anInt919 = -1;
		Static219.anInt4147 = 0;
		Static384.anInt7374 = -1;
		Static193.anInt3734 = -1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)I")
	public static int method5049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (arg1 + local7) / arg0 - local7;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)Z")
	public static boolean method5050(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static431.method6139(arg0, arg1) & Static213.method3469(arg0, arg1);
	}
}
