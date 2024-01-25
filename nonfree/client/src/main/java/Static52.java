import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!d", name = "B", descriptor = "Lclient!tj;")
	public static Class193 aClass193_13;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "I")
	public static int anInt1392;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_47 = new Class198(2);

	@OriginalMember(owner = "client!d", name = "v", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_77 = new Class159("K", "T", "K", "K");

	@OriginalMember(owner = "client!d", name = "z", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_78 = new Class159("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!d", name = "C", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_79 = new Class159("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZZII[Lclient!br;)V")
	public static void method1029(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class21[] arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg4.length; local7++) {
			@Pc(13) Class21 local13 = arg4[local7];
			if (local13 != null && local13.anInt723 == arg2) {
				Static340.method5455(arg0, arg3, arg1, local13);
				Static344.method2688(arg0, local13, arg3);
				if (local13.anInt708 - local13.anInt740 < local13.anInt790) {
					local13.anInt790 = local13.anInt708 - local13.anInt740;
				}
				if (local13.anInt761 - local13.anInt758 < local13.anInt736) {
					local13.anInt736 = local13.anInt761 - local13.anInt758;
				}
				if (local13.anInt790 < 0) {
					local13.anInt790 = 0;
				}
				if (local13.anInt736 < 0) {
					local13.anInt736 = 0;
				}
				if (local13.anInt722 == 0) {
					Static150.method3012(local13, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBII)I")
	public static int method1033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg1 & 0xF;
		@Pc(21) int local21 = local12 >= 8 ? arg2 : arg3;
		@Pc(42) int local42 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg3 : arg0) : arg2;
		return ((local12 & 0x2) == 0 ? local42 : -local42) + ((local12 & 0x1) == 0 ? local21 : -local21);
	}
}
