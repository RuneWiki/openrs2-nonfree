import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!qo", name = "E", descriptor = "Lclient!ha;")
	public static Class5 aClass5_14;

	@OriginalMember(owner = "client!qo", name = "I", descriptor = "Z")
	public static boolean aBoolean671 = false;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZI)V")
	public static void method7022(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static475.aClass380_36.method8747((long) arg2) != null) {
			return;
		}
		if (Static634.aBoolean840) {
			@Pc(34) Class6_Sub39 local34 = new Class6_Sub39(arg2, new Class62_Sub1(4096, Static91.aClass223_36, arg2), arg0, arg1);
			local34.aClass62_Sub1_1.method2413(Static623.aStringArray39[Static638.anInt10709]);
			Static475.aClass380_36.method8753(local34, (long) arg2);
		} else {
			Static508.method7293(arg1, arg2);
		}
	}
}
