import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!rea", name = "p", descriptor = "[Lclient!tb;")
	public static Class49[] aClass49Array13;

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "Z")
	public static boolean aBoolean663;

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_58 = new Class359(30);

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "Lclient!tf;")
	public static final Class340 aClass340_66 = new Class340();

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "Z")
	public static boolean aBoolean664 = true;

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "(III)V")
	public static void method7506(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static499.anInt8390 = arg0 - Static627.anInt7264;
		Static51.anInt617 = arg1 - Static627.anInt7268;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "()V")
	public static void method7508() {
		Static108.method2049(Static66.anInt802);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!eea;B)I")
	public static int method7509(@OriginalArg(0) Class6_Sub15_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method2468(2);
		@Pc(17) int local17;
		if (local10 == 0) {
			local17 = 0;
		} else if (local10 == 1) {
			local17 = arg0.method2468(5);
		} else if (local10 == 2) {
			local17 = arg0.method2468(8);
		} else {
			local17 = arg0.method2468(11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIII)V")
	public static void method7510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg2 - arg1;
		@Pc(20) int local20 = arg4 - arg3;
		if (local15 == 0) {
			if (local20 != 0) {
				Static410.method6281(arg4, arg1, arg3, arg0);
			}
		} else if (local20 == 0) {
			Static78.method1067(arg0, arg2, arg3, arg1);
		} else {
			@Pc(62) int local62 = (local20 << 12) / local15;
			@Pc(71) int local71 = arg3 - (local62 * arg1 >> 12);
			@Pc(76) int local76;
			@Pc(85) int local85;
			if (arg2 < Static398.anInt6878) {
				local76 = Static398.anInt6878;
				local85 = local71 + (local62 * Static398.anInt6878 >> 12);
			} else if (arg2 <= Static8.anInt136) {
				local85 = arg4;
				local76 = arg2;
			} else {
				local76 = Static8.anInt136;
				local85 = local71 + (local62 * Static8.anInt136 >> 12);
			}
			@Pc(118) int local118;
			@Pc(126) int local126;
			if (arg1 < Static398.anInt6878) {
				local118 = Static398.anInt6878;
				local126 = (local62 * Static398.anInt6878 >> 12) + local71;
			} else if (Static8.anInt136 >= arg1) {
				local126 = arg3;
				local118 = arg1;
			} else {
				local118 = Static8.anInt136;
				local126 = local71 + (Static8.anInt136 * local62 >> 12);
			}
			if (local85 < Static605.anInt9561) {
				local85 = Static605.anInt9561;
				local76 = (Static605.anInt9561 - local71 << 12) / local62;
			} else if (Static223.anInt4380 < local85) {
				local85 = Static223.anInt4380;
				local76 = (Static223.anInt4380 - local71 << 12) / local62;
			}
			if (local126 < Static605.anInt9561) {
				local126 = Static605.anInt9561;
				local118 = (Static605.anInt9561 - local71 << 12) / local62;
			} else if (Static223.anInt4380 < local126) {
				local118 = (Static223.anInt4380 - local71 << 12) / local62;
				local126 = Static223.anInt4380;
			}
			Static659.method8789(local85, local118, local126, local76, arg0);
		}
	}
}
