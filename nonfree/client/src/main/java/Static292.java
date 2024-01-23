import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public static int anInt5825;

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray129 = new boolean[100];

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "Z")
	public static boolean aBoolean416 = false;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ug;B)Lclient!ck;")
	public static Class3_Sub2 method4792(@OriginalArg(0) Class3_Sub26 arg0) {
		arg0.method3915();
		@Pc(18) int local18 = arg0.method3915();
		@Pc(22) Class3_Sub2 local22 = Static198.method3269(local18);
		local22.anInt6064 = arg0.method3915();
		@Pc(33) int local33 = arg0.method3915();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(42) int local42 = arg0.method3915();
			local22.method4958(local42, arg0);
		}
		local22.method4952();
		return local22;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V")
	public static void method4797(@OriginalArg(1) int arg0) {
		if (Static94.anInt1711 == 0) {
			Static204.aClass3_Sub15_Sub4_3.method4597(arg0);
		} else {
			Static110.anInt2029 = arg0;
		}
	}
}
