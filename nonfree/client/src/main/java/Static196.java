import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "Lclient!tda;")
	public static Class315 aClass315_5;

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
	public static int anInt3902;

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
	public static int anInt3904 = -1;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIZI)V")
	public static void method3246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static391.anInt6846 == 0) {
			Static298.method4515(false);
		} else {
			Static233.anInt4346 = Static391.anInt6846;
			Static547.method5859(0);
		}
		Static382.anInt6767 = arg3;
		Static218.anInt5026 = arg1;
		Static311.aBoolean436 = arg2;
		Static270.method1317(arg0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!r;Lclient!ng;I)I")
	public static int method3248(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class230 arg1) {
		if (arg1.anInt6398 != -1) {
			return arg1.anInt6398;
		}
		if (arg1.anInt6404 != -1) {
			@Pc(19) Class343 local19 = arg0.anInterface5_10.method917(arg1.anInt6404);
			if (!local19.aBoolean704) {
				return local19.aShort109;
			}
		}
		return arg1.anInt6393;
	}
}
