import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "Lclient!kh;")
	public static Class54 aClass54_15;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
	public static int anInt5063;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "Lclient!ui;")
	public static Class126 aClass126_1;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
	public static int anInt5071;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "Z")
	public static boolean aBoolean385 = true;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public static void method4507() {
		@Pc(13) int[] local13 = new int[Static177.anInt2358];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static177.anInt2358; local17++) {
			@Pc(23) Class165 local23 = Static88.method1382(local17);
			if (local23.anInt4956 >= 0 || local23.anInt4911 >= 0) {
				local13[local15++] = local17;
			}
		}
		Static290.anIntArray418 = new int[local15];
		for (@Pc(43) int local43 = 0; local43 < local15; local43++) {
			Static290.anIntArray418[local43] = local13[local43];
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
	public static void method4508() {
		Static5.method177(Static243.aCanvas3);
		Static226.method3908(Static243.aCanvas3);
		if (Static350.aClass79_1 != null) {
			Static350.aClass79_1.method2207(Static243.aCanvas3);
		}
		Static334.aClient1.method943();
		Static243.aCanvas3.setBackground(Color.black);
		Static95.anInt6300 = -1;
		Static78.method1744(Static243.aCanvas3);
		Static306.method5239(Static243.aCanvas3);
		if (Static350.aClass79_1 != null) {
			Static350.aClass79_1.method2206(Static243.aCanvas3);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!bk;I)Lclient!ik;")
	public static Class5_Sub2 method4510(@OriginalArg(0) Class5_Sub1 arg0) {
		arg0.method1832();
		@Pc(21) int local21 = arg0.method1832();
		@Pc(25) Class5_Sub2 local25 = Static92.method1970(local21);
		local25.anInt6591 = arg0.method1832();
		@Pc(34) int local34 = arg0.method1832();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(42) int local42 = arg0.method1832();
			local25.method5813(arg0, local42);
		}
		local25.method5811();
		return local25;
	}
}
