import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "[I")
	public static int[] anIntArray792 = new int[2048];

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
	public static int anInt4869 = -2;

	@OriginalMember(owner = "client!bc", name = "I", descriptor = "Lclient!he;")
	public static Class44 aClass44_61 = new Class44();

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
	public static int anInt4875 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method3956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		@Pc(24) int local24 = (int) arg2 >> 20 & 0x3;
		if (local10 == 10 || local10 == 11 || local10 == 22) {
			@Pc(69) Class2_Sub3_Sub17 local69 = Static121.method3984(local17);
			@Pc(72) int local72 = local69.anInt2376;
			@Pc(80) int local80;
			@Pc(83) int local83;
			if (local24 == 0 || local24 == 2) {
				local80 = local69.anInt2394;
				local83 = local69.anInt2387;
			} else {
				local80 = local69.anInt2387;
				local83 = local69.anInt2394;
			}
			if (local24 != 0) {
				local72 = (local72 << local24 & 0xF) + (local72 >> 4 - local24);
			}
			Static107.method1849(2, local72, arg0, 0, 0, local80, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], true, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], arg1, local83);
		} else {
			Static107.method1849(2, 0, arg0, local24, local10 + 1, 0, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], true, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], arg1, 0);
		}
		Static46.anInt847 = Static55.anInt981;
		Static2.anInt42 = 0;
		Static8.anInt262 = 2;
		Static206.anInt4570 = Static205.anInt740;
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)V")
	public static void method3959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static194.aBoolean191 = true;
		Static142.anInt3237 = arg0;
		Static113.anInt2494 = arg1;
		Static225.anInt4883 = arg2;
		Static219.anInt4760 = -1;
		Static84.anInt1809 = -1;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public static void method3963() {
		if (Static97.anInt2140 == 0) {
			return;
		}
		try {
			if (Static97.anInt2140 == 1) {
				if (Static168.aClass33_18.anInt947 == 2) {
					throw new IOException();
				}
				if (Static168.aClass33_18.anInt947 != 1) {
					return;
				}
				Static202.aClass105_4 = new Class105((Socket) Static168.aClass33_18.anObject2, Static133.aClass41_2);
				Static168.aClass33_18 = null;
				Static202.aClass105_4.method3692(Static161.aClass2_Sub23_Sub1_5.aByteArray41, Static161.aClass2_Sub23_Sub1_5.anInt2703);
				Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
				Static97.anInt2140 = 2;
			}
			@Pc(72) int local72;
			if (Static97.anInt2140 == 2) {
				if (Static220.aClass40_3 != null) {
					Static220.aClass40_3.method3712();
				}
				if (Static53.aClass40_2 != null) {
					Static53.aClass40_2.method3712();
				}
				local72 = Static202.aClass105_4.method3699();
				if (Static220.aClass40_3 != null) {
					Static220.aClass40_3.method3712();
				}
				if (Static53.aClass40_2 != null) {
					Static53.aClass40_2.method3712();
				}
				if (local72 < 0) {
					return;
				}
				if (Static104.anInt2284 == 1) {
					if (local72 == 0) {
						Static203.anInt4536 = 3;
					} else {
						Static203.anInt4536 = local72;
					}
				}
				if (Static104.anInt2284 == 2) {
					if (local72 == 0) {
						Static15.anInt334 = 3;
					} else if (local72 == 21) {
						Static97.anInt2140 = 3;
						return;
					} else {
						Static15.anInt334 = local72;
					}
				}
				if (Static104.anInt2284 == 3) {
					if (local72 == 0) {
						Static134.anInt3129 = 3;
					} else {
						Static134.anInt3129 = local72;
					}
				}
				Static97.anInt2140 = 0;
				Static104.anInt2284 = 0;
				if (Static202.aClass105_4 != null) {
					Static202.aClass105_4.method3695();
				}
				Static202.aClass105_4 = null;
			}
			if (Static97.anInt2140 == 3) {
				local72 = Static202.aClass105_4.method3690();
				if (local72 > 0) {
					Static102.aClass78Array19 = new Class78[Static202.aClass105_4.method3699()];
					Static97.anInt2140 = 4;
				}
			}
			if (Static97.anInt2140 == 4) {
				local72 = Static202.aClass105_4.method3690();
				if (Static102.aClass78Array19.length * 8 <= local72) {
					Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
					Static202.aClass105_4.method3694(Static102.aClass78Array19.length * 8, Static139.aClass2_Sub23_Sub1_4.aByteArray41, 0);
					for (@Pc(202) int local202 = 0; local202 < Static102.aClass78Array19.length; local202++) {
						Static102.aClass78Array19[local202] = Static103.method1785(Static139.aClass2_Sub23_Sub1_4.method2123());
					}
					Static15.anInt334 = 21;
					Static97.anInt2140 = 0;
					Static104.anInt2284 = 0;
					if (Static202.aClass105_4 != null) {
						Static202.aClass105_4.method3695();
					}
					Static202.aClass105_4 = null;
					return;
				}
			}
		} catch (@Pc(236) IOException local236) {
			Static104.anInt2284 = 0;
			Static203.anInt4536 = 3;
			Static134.anInt3129 = 3;
			Static15.anInt334 = 3;
			Static97.anInt2140 = 0;
			if (Static202.aClass105_4 != null) {
				Static202.aClass105_4.method3695();
			}
			Static202.aClass105_4 = null;
		}
	}
}
