import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Ljava/lang/Class;")
	private static Class aClass23;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
	public static int anInt9812 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBI)Z")
	public static boolean method8286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface19 local9 = (Interface19) Static32.method476(arg2, arg0, arg1);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static112.method2003(local9) & true;
		}
		local9 = (Interface19) Static89.method1199(arg2, arg0, arg1, aClass23 == null ? (aClass23 = Class3_Sub8_Sub3.a("pe")) : aClass23);
		if (local9 != null) {
			local11 &= Static112.method2003(local9);
		}
		local9 = (Interface19) Static724.method9433(arg2, arg0, arg1);
		if (local9 != null) {
			local11 &= Static112.method2003(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V")
	public static void method8288() {
		Static244.anIntArray245 = Static83.method1068(0.4F);
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)V")
	public static void method8290() {
		Static555.aClass9_30 = null;
		Static312.aClass9Array20 = null;
		Static427.aClass44_34 = null;
		Static418.aClass44_32 = null;
		Static134.aClass9Array8 = null;
		Static619.aClass9Array44 = null;
		Static430.aClass9Array26 = null;
		Static705.aClass44_53 = null;
		Static290.aClass9Array16 = null;
		Static301.aClass9Array18 = null;
		Static314.aClass9Array22 = null;
		Static605.aClass9_32 = null;
		Static361.aClass9Array23 = null;
		Static527.aClass9Array35 = null;
		Static370.aClass9Array24 = null;
		Static242.aClass9Array13 = null;
		Static313.aClass9Array21 = null;
	}
}
