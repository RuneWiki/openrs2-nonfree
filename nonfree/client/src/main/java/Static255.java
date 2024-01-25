import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "Lclient!pp;")
	public static Class187 aClass187_2;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_35 = new Class138();

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
	public static int anInt4584 = 0;

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
	public static int anInt4594 = 0;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)I")
	public static int method4132(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
	public static void method4134() {
		Static229.method3783(Static190.aClass244_48);
		Static23.aClass3_Sub5_Sub1_1.method2791(0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static241.anInt4238 = arg2;
		Static51.anInt1084 = arg0;
		Static210.anInt3709 = arg4;
		Static200.anInt3586 = arg1;
		Static81.anInt1661 = arg3;
		if (Static200.anInt3586 >= 100) {
			@Pc(29) int local29 = Static210.anInt3709 * 128 + 64;
			@Pc(35) int local35 = Static241.anInt4238 * 128 + 64;
			@Pc(43) int local43 = Static55.method1005(local35, Static363.anInt6170, local29) - Static51.anInt1084;
			@Pc(48) int local48 = local29 - Static206.anInt3639;
			@Pc(53) int local53 = local43 - Static243.anInt4289;
			@Pc(58) int local58 = local35 - Static339.anInt5726;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local48 * local48 + local58 * local58));
			Static327.anInt5556 = (int) (Math.atan2((double) local53, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static145.anInt2716 = (int) (Math.atan2((double) local48, (double) local58) * -2607.5945876176133D) & 0x3FFF;
			Static331.anInt5600 = 0;
			if (Static327.anInt5556 < 1024) {
				Static327.anInt5556 = 1024;
			}
			if (Static327.anInt5556 > 3072) {
				Static327.anInt5556 = 3072;
			}
		}
		Static88.anInt1815 = 2;
	}
}
