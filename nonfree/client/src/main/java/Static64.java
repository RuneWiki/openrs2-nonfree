import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "Lclient!gu;")
	public static final Class107 aClass107_1 = new Class107();

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
	public static int anInt1240 = 0;

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
	public static int anInt1241 = 0;

	@OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
	public static int anInt1242 = 2;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)I")
	public static int method1161(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V")
	public static void method1162(@OriginalArg(0) int arg0) {
		Static467.anInt8412 = -1;
		Static202.anInt3644 = arg0;
		Static294.anInt5413 = -1;
		Static371.method5897();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static84.method1650(Static328.anInt6154, arg2, Static394.anInt7462);
		@Pc(17) int local17 = Static84.method1650(Static328.anInt6154, arg5, Static394.anInt7462);
		@Pc(23) int local23 = Static84.method1650(Static7.anInt8119, arg0, Static34.anInt603);
		@Pc(31) int local31 = Static84.method1650(Static7.anInt8119, arg4, Static34.anInt603);
		@Pc(41) int local41 = Static84.method1650(Static328.anInt6154, arg1 + arg2, Static394.anInt7462);
		@Pc(52) int local52 = Static84.method1650(Static328.anInt6154, arg5 - arg1, Static394.anInt7462);
		for (@Pc(54) int local54 = local11; local54 < local41; local54++) {
			Static403.method6377(arg3, Static130.anIntArrayArray89[local54], local31, local23);
		}
		for (@Pc(74) int local74 = local17; local74 > local52; local74--) {
			Static403.method6377(arg3, Static130.anIntArrayArray89[local74], local31, local23);
		}
		@Pc(96) int local96 = Static84.method1650(Static7.anInt8119, arg1 + arg0, Static34.anInt603);
		@Pc(107) int local107 = Static84.method1650(Static7.anInt8119, arg4 - arg1, Static34.anInt603);
		for (@Pc(109) int local109 = local41; local109 <= local52; local109++) {
			@Pc(115) int[] local115 = Static130.anIntArrayArray89[local109];
			Static403.method6377(arg3, local115, local96, local23);
			Static403.method6377(arg6, local115, local107, local96);
			Static403.method6377(arg3, local115, local31, local107);
		}
	}
}
