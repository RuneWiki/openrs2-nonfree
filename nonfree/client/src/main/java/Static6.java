import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aea", name = "u", descriptor = "Lclient!ra;")
	public static final Class280 aClass280_3 = new Class280();

	@OriginalMember(owner = "client!aea", name = "v", descriptor = "[I")
	public static final int[] anIntArray251 = new int[5];

	@OriginalMember(owner = "client!aea", name = "w", descriptor = "Z")
	public static boolean aBoolean275 = true;

	@OriginalMember(owner = "client!aea", name = "x", descriptor = "I")
	public static int anInt4018 = 0;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZIIZB)Lclient!pfa;")
	public static Class251 method3517(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class172 local10 = null;
		if (Static524.aClass257_5 != null) {
			local10 = new Class172(arg1, Static524.aClass257_5, Static63.aClass257Array1[arg1], 1000000);
		}
		Static197.aClass160_Sub1Array2[arg1] = Static399.aClass13_1.method330(Static347.aClass172_2, arg1, local10);
		if (arg0) {
			Static197.aClass160_Sub1Array2[arg1].method6365();
		}
		return new Class251(Static197.aClass160_Sub1Array2[arg1], arg2, 1);
	}
}
