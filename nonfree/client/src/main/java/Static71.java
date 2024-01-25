import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
	public static int anInt1571;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "Lclient!dm;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "Lclient!kr;")
	public static Class20 aClass20_2;

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_2 = new Class271(1, 2, 2, 0);

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_17 = new Class269(20, -1);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII)V")
	public static void method1357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static108.method1816(Static177.anInt3963, arg5, Static570.anInt9385);
		@Pc(17) int local17 = Static108.method1816(Static177.anInt3963, arg0, Static570.anInt9385);
		@Pc(28) int local28 = Static108.method1816(Static252.anInt4988, arg1, Static306.anInt5020);
		@Pc(34) int local34 = Static108.method1816(Static252.anInt4988, arg4, Static306.anInt5020);
		@Pc(43) int local43 = Static108.method1816(Static177.anInt3963, arg5 + arg3, Static570.anInt9385);
		@Pc(52) int local52 = Static108.method1816(Static177.anInt3963, arg0 - arg3, Static570.anInt9385);
		for (@Pc(54) int local54 = local11; local54 < local43; local54++) {
			Static259.method4236(local28, local34, arg2, Static618.anIntArrayArray101[local54]);
		}
		for (@Pc(76) int local76 = local17; local76 > local52; local76--) {
			Static259.method4236(local28, local34, arg2, Static618.anIntArrayArray101[local76]);
		}
		@Pc(98) int local98 = Static108.method1816(Static252.anInt4988, arg3 + arg1, Static306.anInt5020);
		@Pc(107) int local107 = Static108.method1816(Static252.anInt4988, arg4 - arg3, Static306.anInt5020);
		for (@Pc(109) int local109 = local43; local109 <= local52; local109++) {
			@Pc(115) int[] local115 = Static618.anIntArrayArray101[local109];
			Static259.method4236(local28, local98, arg2, local115);
			Static259.method4236(local107, local34, arg2, local115);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!eq;Z)V")
	public static void method1358(@OriginalArg(0) Class97 arg0) {
		Static616.anInt10011 = 0;
		Static439.anInt7801 = 0;
		Static458.aClass143_7 = new Class143();
		Static376.aClass11_Sub5_Sub1_Sub1Array2 = new Class11_Sub5_Sub1_Sub1[1024];
		Static73.aClass11_Sub4Array1 = new Class11_Sub4[Static304.anIntArray381[Static97.anInt1908] + 1];
		Static308.anInt5657 = 0;
		Static208.anInt4358 = 0;
		Static635.method8504(arg0);
		Static272.method4390(arg0);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I")
	public static int method1360(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
