import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!me", name = "A", descriptor = "I")
	public static int anInt6654;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "[Lclient!pu;")
	public static Class50[] aClass50Array9;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "I")
	public static final int anInt6661 = -1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZI)Z")
	public static boolean method5552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static653.method8768(arg1, arg0) | (arg0 & 0x10000) != 0 || Static242.method3781(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static457.method6552(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIBZ)Lclient!wm;")
	public static Class390 method5555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) Class71 local5 = null;
		if (Static529.aClass151_8 != null) {
			local5 = new Class71(arg0, Static529.aClass151_8, Static382.aClass151Array1[arg0], 1000000);
		}
		Static609.aClass210_Sub1Array2[arg0] = Static303.aClass224_1.method5531(arg0, Static19.aClass71_1, local5);
		Static609.aClass210_Sub1Array2[arg0].method5153();
		return new Class390(Static609.aClass210_Sub1Array2[arg0], arg2, arg1);
	}
}
