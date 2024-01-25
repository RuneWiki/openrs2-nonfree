import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
	public static int anInt8204;

	@OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
	public static int anInt8206 = 0;

	@OriginalMember(owner = "client!sj", name = "K", descriptor = "[I")
	public static final int[] anIntArray614 = new int[8];

	@OriginalMember(owner = "client!sj", name = "L", descriptor = "[[I")
	public static final int[][] anIntArrayArray79 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB[Lclient!mc;)V")
	public static void method6811(@OriginalArg(0) int arg0, @OriginalArg(2) Class198[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
			@Pc(21) Class198 local21 = arg1[local15];
			if (local21 != null && arg0 == local21.anInt5787 && !Static67.method1545(local21)) {
				if (local21.anInt5776 == 0) {
					method6811(local21.anInt5739, arg1);
					if (local21.aClass198Array1 != null) {
						method6811(local21.anInt5739, local21.aClass198Array1);
					}
					@Pc(59) Class12_Sub34 local59 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local21.anInt5739);
					if (local59 != null) {
						Static111.method2303(local59.anInt5831);
					}
				}
				if (local21.anInt5776 == 6 && local21.anInt5708 != -1) {
					@Pc(79) Class64 local79 = Static47.aClass41_1.method911(local21.anInt5708);
					if (local79 != null) {
						local21.anInt5753 += Static481.anInt8697;
						while (local79.anIntArray184[local21.anInt5735] < local21.anInt5753) {
							local21.anInt5753 -= local79.anIntArray184[local21.anInt5735];
							local21.anInt5735++;
							if (local21.anInt5735 >= local79.anIntArray185.length) {
								local21.anInt5735 -= local79.anInt1962;
								if (local21.anInt5735 < 0 || local79.anIntArray185.length <= local21.anInt5735) {
									local21.anInt5735 = 0;
								}
							}
							local21.anInt5783 = local21.anInt5735 + 1;
							if (local21.anInt5783 >= local79.anIntArray185.length) {
								local21.anInt5783 -= local79.anInt1962;
								if (local21.anInt5783 < 0 || local21.anInt5783 >= local79.anIntArray185.length) {
									local21.anInt5783 = -1;
								}
							}
							Static331.method5282(local21);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
	public static void method6812() {
		Static23.aClass5_3.method213();
		Static527.aClass6_1.method3751();
		Static314.aClient1.method1511();
		Static301.aCanvas11.setBackground(Color.black);
		Static78.anInt1824 = -1;
		Static23.aClass5_3 = Static117.method2452(Static301.aCanvas11);
		Static527.aClass6_1 = Static329.method5247(Static301.aCanvas11);
	}
}
