import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Lclient!ij;")
	public static final Class147 aClass147_1 = new Class147(0, 3, Static471.aClass298_19);

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "Lclient!ij;")
	public static final Class147 aClass147_2 = new Class147(1, 3, Static471.aClass298_19);

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "Lclient!ij;")
	public static final Class147 aClass147_3 = new Class147(2, 4, Static471.aClass298_15);

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "Lclient!ij;")
	public static final Class147 aClass147_4 = new Class147(3, 1, Static471.aClass298_19);

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "Lclient!ij;")
	public static final Class147 aClass147_5 = new Class147(4, 2, Static471.aClass298_19);

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "Lclient!ij;")
	public static final Class147 aClass147_6 = new Class147(5, 3, Static471.aClass298_19);

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "Lclient!ij;")
	public static final Class147 aClass147_7 = new Class147(6, 4, Static471.aClass298_19);

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
	public static final int anInt3994 = Static565.method7622(16);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public static void method3535() {
		Static260.aClass6_28.method102();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Z")
	public static boolean method3537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static313.method4597(arg0, arg1) & Static368.method5394(arg0, arg1);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
	public static void method3538() {
		Static361.anInt8636 = -1;
		Static91.anInt1912 = -1;
		Static417.anInt7075 = 2;
		Static24.aClass322_5 = null;
		Static218.aBoolean295 = false;
		Static225.anInt3978 = 0;
		Static565.anInt9228 = 1;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Lclient!ij;")
	public static Class147 method3539(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass147_1;
		} else if (arg0 == 1) {
			return aClass147_2;
		} else if (arg0 == 2) {
			return aClass147_3;
		} else if (arg0 == 3) {
			return aClass147_4;
		} else if (arg0 == 4) {
			return aClass147_5;
		} else if (arg0 == 5) {
			return aClass147_6;
		} else if (arg0 == 6) {
			return aClass147_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII)Z")
	public static boolean method3540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface4 local11 = (Interface4) Static184.method3149(arg2, arg0, arg1);
		if (local11 != null) {
			local5 = Static580.method7786(local11) & true;
		}
		local11 = (Interface4) Static480.method6569(arg2, arg0, arg1, gda.class);
		if (local11 != null) {
			local5 &= Static580.method7786(local11);
		}
		local11 = (Interface4) Static508.method6867(arg2, arg0, arg1);
		if (local11 != null) {
			local5 &= Static580.method7786(local11);
		}
		return local5;
	}
}
