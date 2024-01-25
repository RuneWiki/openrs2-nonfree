import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
	public static int anInt3106;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	public static int anInt3102 = -1;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "Lclient!nv;")
	public static final Class170 aClass170_1 = Static21.method6253();

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	public static int anInt3107 = 0;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!uo;Lclient!uo;IIZIZ)I")
	public static int method2629(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static188.method2952(arg1, arg4, arg5, arg0);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = Static188.method2952(arg1, arg2, arg3, arg0);
			return arg3 ? -local31 : local31;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BZ)V")
	public static void method2630() {
		Static307.method4633(Static399.aClass163_82);
		for (@Pc(21) Class3_Sub10 local21 = (Class3_Sub10) Static32.aClass140_5.method3486(); local21 != null; local21 = (Class3_Sub10) Static32.aClass140_5.method3485()) {
			if (!local21.method6287()) {
				local21 = (Class3_Sub10) Static32.aClass140_5.method3486();
				if (local21 == null) {
					break;
				}
			}
			if (local21.anInt831 == 0) {
				Static87.method1538(local21, true, true);
			}
		}
		if (Static444.aClass82_23 != null) {
			Static463.method6297(Static444.aClass82_23);
			Static444.aClass82_23 = null;
		}
	}
}
