import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bp", name = "B", descriptor = "Lclient!oa;")
	public static Class234 aClass234_1;

	@OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
	public static int anInt1216;

	@OriginalMember(owner = "client!bp", name = "I", descriptor = "J")
	public static long aLong69 = 0L;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(CLjava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method1116(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(10) int local10 = Static494.method6909(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0 != arg1.charAt(local30); local30++) {
			}
			local15[local22++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local15[local10] = arg1.substring(local24);
		return local15;
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(III)I")
	public static int method1120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static214.anInt4163 == -1) {
			return 1;
		}
		if (arg0 != Static375.anInt6609) {
			Static82.method7596(arg0, Static103.aClass77_15.method1864(Static562.anInt9127));
			if (arg0 != Static375.anInt6609) {
				return -1;
			}
		}
		try {
			@Pc(28) Dimension local28 = Static26.aCanvas3.getSize();
			Static471.method6665(Static510.aClass13_14, Static136.aClass12_8, true, Static103.aClass77_15.method1864(Static562.anInt9127), Static21.aClass35_1);
			@Pc(44) Class43 local44 = Static83.method1704(Static454.aClass111_107, Static214.anInt4163);
			@Pc(47) long local47 = Static255.method4035();
			Static136.aClass12_8.JA();
			Static583.aClass209_6.NA(0, Static159.anInt2896, 0);
			Static136.aClass12_8.method6471(Static583.aClass209_6);
			Static136.aClass12_8.la(local28.width / 2, local28.height / 2, 512, 512);
			Static136.aClass12_8.ra(1.0F);
			Static136.aClass12_8.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(88) Class61 local88 = Static136.aClass12_8.method6407(local44, 2048, 64, 64, 768);
			@Pc(90) int local90 = 0;
			label41: for (@Pc(92) int local92 = 0; local92 < 500; local92++) {
				Static136.aClass12_8.ja(0);
				Static136.aClass12_8.ya();
				for (@Pc(101) int local101 = 15; local101 >= 0; local101--) {
					for (@Pc(105) int local105 = 0; local105 <= local101; local105++) {
						Static22.aClass209_1.NA((int) ((float) Static47.anInt1239 * ((float) local105 - (float) local101 / 2.0F)), 0, (local101 + 1) * Static47.anInt1239);
						local90++;
						local88.method7587(Static22.aClass209_1, null, 0);
						if ((long) arg1 <= Static255.method4035() - local47) {
							break label41;
						}
					}
				}
			}
			Static136.aClass12_8.method6469();
			@Pc(173) long local173 = (long) (local90 * 1000) / (Static255.method4035() - local47);
			Static136.aClass12_8.ja(0);
			Static136.aClass12_8.ya();
			return (int) local173;
		} catch (@Pc(182) Throwable local182) {
			local182.printStackTrace();
			return -1;
		}
	}
}
