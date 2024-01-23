import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
	public static int anInt6076;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
	public static int anInt6080;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas115;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "[[Lclient!wf;")
	public static Class189[][] aClass189ArrayArray115;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString374 = "purple:";

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "[I")
	public static int[] anIntArray681 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public static void method4849() {
		if (!Static135.aBoolean177) {
			return;
		}
		@Pc(15) Class189 local15 = Static152.method2432(Static21.anInt1053, Static71.anInt1367);
		if (local15 != null && local15.anObjectArray17 != null) {
			@Pc(26) Class4_Sub13 local26 = new Class4_Sub13();
			local26.anObjectArray2 = local15.anObjectArray17;
			local26.aClass189_7 = local15;
			Static135.method2020(local26);
		}
		Static135.aBoolean177 = false;
		Static313.anInt6054 = -1;
		Static205.method3283(local15);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V")
	public static void method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = 0;
		@Pc(21) int local21 = arg1 * arg1;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local21 << 1;
		@Pc(37) int local37 = arg1 << 1;
		@Pc(46) int local46 = local21 - (local37 - 1) * local29;
		@Pc(56) int local56 = (1 - local37) * local25 + local33;
		@Pc(60) int local60 = local25 << 2;
		@Pc(64) int local64 = local21 << 2;
		@Pc(72) int local72 = local33 * 3;
		@Pc(78) int local78 = local64;
		@Pc(86) int local86 = ((arg1 << 1) - 3) * local29;
		@Pc(109) int local109;
		@Pc(117) int local117;
		if (arg0 >= Static156.anInt3086 && Static218.anInt4231 >= arg0) {
			local109 = Static3.method9(Static48.anInt902, arg4 + arg3, Static131.anInt2553);
			local117 = Static3.method9(Static48.anInt902, arg4 - arg3, Static131.anInt2553);
			Static99.method1656(Static220.anIntArrayArray36[arg0], arg2, local117, local109);
		}
		@Pc(131) int local131 = local60 * (arg1 - 1);
		while (local7 > 0) {
			if (local56 < 0) {
				while (local56 < 0) {
					local56 += local72;
					local46 += local78;
					local78 += local64;
					local72 += local64;
					local9++;
				}
			}
			local7--;
			if (local46 < 0) {
				local46 += local78;
				local78 += local64;
				local56 += local72;
				local9++;
				local72 += local64;
			}
			local56 += -local131;
			local109 = arg0 - local7;
			local46 += -local86;
			local131 -= local60;
			local117 = local7 + arg0;
			local86 -= local60;
			if (local117 >= Static156.anInt3086 && Static218.anInt4231 >= local109) {
				@Pc(229) int local229 = Static3.method9(Static48.anInt902, local9 + arg4, Static131.anInt2553);
				@Pc(237) int local237 = Static3.method9(Static48.anInt902, arg4 - local9, Static131.anInt2553);
				if (Static156.anInt3086 <= local109) {
					Static99.method1656(Static220.anIntArrayArray36[local109], arg2, local237, local229);
				}
				if (local117 <= Static218.anInt4231) {
					Static99.method1656(Static220.anIntArrayArray36[local117], arg2, local237, local229);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method4853(@OriginalArg(1) int arg0) {
		@Pc(10) String local10 = Integer.toString(arg0);
		for (@Pc(19) int local19 = local10.length() - 3; local19 > 0; local19 -= 3) {
			local10 = local10.substring(0, local19) + "," + local10.substring(local19);
		}
		if (local10.length() <= 9) {
			return local10.length() <= 6 ? " <col=ffff00>" + local10 + "</col>" : " <col=ffffff>" + local10.substring(0, local10.length() - 4) + Static140.aString161 + " (" + local10 + ")</col>";
		} else {
			return " <col=00ff80>" + local10.substring(0, local10.length() - 8) + Static203.aString230 + " (" + local10 + ")</col>";
		}
	}
}
