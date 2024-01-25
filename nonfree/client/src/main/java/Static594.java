import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	public static int anInt9440;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public static int anInt9443 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIILclient!jea;)V")
	public static void method8229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class60_Sub1_Sub4 arg4) {
		@Pc(4) Class243 local4 = Static565.method7969(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt9048 = (arg1 << anInt9440) + Static430.anInt3928;
		arg4.anInt9051 = arg3;
		arg4.anInt9057 = (arg2 << anInt9440) + Static430.anInt3928;
		local4.aClass60_Sub1_Sub4_1 = arg4;
		@Pc(36) int local36 = Static555.aClass96Array3 == Static216.aClass96Array1 ? 1 : 0;
		if (arg4.method7919()) {
			if (arg4.method7918()) {
				arg4.aClass60_Sub1_23 = Static265.aClass60_Sub1Array4[local36];
				Static265.aClass60_Sub1Array4[local36] = arg4;
				return;
			}
			arg4.aClass60_Sub1_23 = Static403.aClass60_Sub1Array5[local36];
			Static403.aClass60_Sub1Array5[local36] = arg4;
			Static429.aBoolean549 = true;
			return;
		}
		arg4.aClass60_Sub1_23 = Static535.aClass60_Sub1Array3[local36];
		Static535.aClass60_Sub1Array3[local36] = arg4;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public static void method8230() {
		if (!Static587.aBoolean697) {
			Static587.aBoolean697 = true;
			Static145.aFloat52 += (12.0F - Static145.aFloat52) / 2.0F;
			Static114.aBoolean195 = true;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
	public static void method8232() {
		Static358.aClass6_Sub2_Sub11_3 = new Class6_Sub2_Sub11(Static50.aClass43_4.method596(Static601.anInt9518), "", Static475.anInt8093, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}
}
