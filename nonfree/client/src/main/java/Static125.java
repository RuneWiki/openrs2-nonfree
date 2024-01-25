import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Lclient!um;")
	public static Class243 aClass243_69;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "Lclient!um;")
	public static Class243 aClass243_70;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_31 = new Class194(30, 7);

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZBLclient!fi;)V")
	public static void method1758(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class76 arg1) {
		@Pc(12) int local12 = arg1.anInt2109 == 0 ? arg1.anInt2127 : arg1.anInt2109;
		@Pc(24) int local24 = arg1.anInt2114 == 0 ? arg1.anInt2106 : arg1.anInt2114;
		Static119.method2851(local12, local24, arg0, arg1.anInt2100, Static34.aClass76ArrayArray1[arg1.anInt2100 >> 16]);
		if (arg1.aClass76Array2 != null) {
			Static119.method2851(local12, local24, arg0, arg1.anInt2100, arg1.aClass76Array2);
		}
		@Pc(57) Class5_Sub44 local57 = (Class5_Sub44) Static151.aClass252_42.method5659((long) arg1.anInt2100);
		if (local57 != null) {
			Static417.method5501(local24, arg0, local57.anInt6981, local12);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)I")
	public static int method1760(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)V")
	public static void method1761() {
		Static340.anInt5517 = 2;
		Static216.anInt3609 = -1;
		Static178.anInt5791 = 0;
		Static215.anInt3592 = -1;
		Static151.aBoolean499 = false;
		Static223.anInt3720 = 1;
		Static199.aClass243_113 = null;
	}
}
