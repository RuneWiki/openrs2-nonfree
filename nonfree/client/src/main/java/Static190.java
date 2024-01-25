import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "[Lclient!ip;")
	public static Class53[] aClass53Array1;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "Lclient!tm;")
	public static final Class197 aClass197_16 = new Class197(32);

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
	public static int anInt4079 = 0;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "Lclient!hq;")
	public static Class87 aClass87_35 = new Class87(64);

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_122 = new Class34("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_36 = new Class87(64);

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "Z")
	public static boolean aBoolean378 = true;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(JZ)V")
	public static void method3690(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static233.method4777(arg0 - 1L);
			Static233.method4777(1L);
		} else {
			Static233.method4777(arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BII)V")
	public static void method3692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static90.aClass63_3.method1746(Static345.aClass34_190.method1285(Static259.anInt2907));
		@Pc(28) int local28;
		for (@Pc(22) Class1_Sub23 local22 = (Class1_Sub23) Static188.aClass16_22.method410(); local22 != null; local22 = (Class1_Sub23) Static188.aClass16_22.method419()) {
			local28 = Static100.method3994(local22);
			if (local28 > local17) {
				local17 = local28;
			}
		}
		local17 += 8;
		local28 = Static115.anInt2635 * 16 + 21;
		@Pc(57) int local57 = arg1 - local17 / 2;
		if (Static194.anInt4145 < local57 + local17) {
			local57 = Static194.anInt4145 - local17;
		}
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(76) int local76 = arg0;
		if (Static271.anInt5530 < local28 + arg0) {
			local76 = Static271.anInt5530 - local28;
		}
		Static210.anInt4473 = local57;
		if (local76 < 0) {
			local76 = 0;
		}
		Static339.anInt6506 = local76;
		Static198.anInt1219 = local17;
		Static282.anInt6601 = (Static337.aBoolean630 ? 26 : 22) + Static115.anInt2635 * 16;
		Static146.aBoolean308 = true;
	}
}
