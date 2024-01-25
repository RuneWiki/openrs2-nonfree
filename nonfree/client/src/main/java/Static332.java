import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	public static int anInt3540;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	public static int anInt3536 = 2;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
	public static int anInt3541 = 13156520;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
	public static void method3246(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(8, arg0);
		local8.method5539();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZII)Lclient!ce;")
	public static Class2_Sub8 method3249(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub8 local12 = new Class2_Sub8();
		local12.anInt694 = arg2;
		local12.anInt699 = arg0;
		Static273.aClass199_25.method5749(local12, (long) arg3);
		Static15.method630(arg2);
		@Pc(31) Class146 local31 = Static1.method16(arg3);
		if (local31 != null) {
			Static152.method2932(local31);
		}
		if (Static27.aClass146_16 != null) {
			Static152.method2932(Static27.aClass146_16);
			Static27.aClass146_16 = null;
		}
		Static231.method5240();
		if (local31 != null) {
			Static41.method968(!arg1, local31);
		}
		if (!arg1) {
			Static72.method1645(arg2);
		}
		if (!arg1 && Static111.anInt2471 != -1) {
			Static103.method2286(1, Static111.anInt2471);
		}
		return local12;
	}
}
