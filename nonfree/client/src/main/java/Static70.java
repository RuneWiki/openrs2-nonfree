import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!rka;")
	public static Class323 aClass323_1;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "[I")
	public static final int[] anIntArray80 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static int anInt1097 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!av;")
	public static Class20 aClass20_4 = null;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Z")
	public static boolean aBoolean89 = true;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!bla;Z[[[BIB)Z")
	public static boolean method894(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static608.aBoolean715) {
			return false;
		}
		@Pc(9) int local9 = arg0.anInt11204 >> Static394.anInt7067;
		@Pc(11) int local11 = local9;
		@Pc(16) int local16 = arg0.anInt11211 >> Static394.anInt7067;
		@Pc(18) int local18 = local16;
		if (arg0 instanceof Class19_Sub1_Sub3) {
			local11 = ((Class19_Sub1_Sub3) arg0).aShort123;
			local18 = ((Class19_Sub1_Sub3) arg0).aShort122;
			local9 = ((Class19_Sub1_Sub3) arg0).aShort121;
			local16 = ((Class19_Sub1_Sub3) arg0).aShort124;
		}
		for (@Pc(39) int local39 = local9; local39 <= local11; local39++) {
			for (@Pc(42) int local42 = local16; local42 <= local18; local42++) {
				if (arg0.aByte145 < Static241.anInt4521 && local39 >= Static431.anInt7577 && local39 < Static477.anInt8336 && local42 >= Static712.anInt11116 && local42 < Static532.anInt8977) {
					if ((arg2 == null || arg0.aByte146 < arg3 || arg2[arg0.aByte146][local39][local42] != arg4) && arg0.method9365() && !arg0.method9370(Static626.aClass67_16)) {
						return false;
					}
					if (!arg1 && local39 >= Static296.anInt3655 - 16 && local39 <= Static296.anInt3655 + 16 && local42 >= Static450.anInt7928 - 16 && local42 <= Static450.anInt7928 + 16) {
						if (Static67.aBoolean81) {
							Static307.aClass198Array1[Static84.anInt1289++].method4816(arg0);
							Static84.anInt1289 %= Static76.anInt1153;
						} else {
							arg0.method9374(Static626.aClass67_16);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)Lclient!ss;")
	public static Class3_Sub48 method896() {
		return Static166.anInt3084 == 0 ? new Class3_Sub48() : Static293.aClass3_Sub48Array1[--Static166.anInt3084];
	}
}
