import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([Ljava/lang/Object;I[I)V")
	public static void method5748(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static452.method5826(arg0, arg1, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5749(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static148.anInt2307 >= 100 && !Static396.aBoolean555 || Static148.anInt2307 >= 200) {
			Static246.method3498(Static315.aClass142_80.method3118(Static63.anInt981));
			return;
		}
		@Pc(40) String local40 = Static91.method1066(arg0);
		if (local40 == null) {
			return;
		}
		@Pc(85) String local85;
		for (@Pc(45) int local45 = 0; local45 < Static148.anInt2307; local45++) {
			@Pc(55) String local55 = Static91.method1066(Static108.aStringArray10[local45]);
			if (local55 != null && local55.equals(local40)) {
				Static246.method3498(arg0 + Static406.aClass142_104.method3118(Static63.anInt981));
				return;
			}
			if (Static313.aStringArray41[local45] != null) {
				local85 = Static91.method1066(Static313.aStringArray41[local45]);
				if (local85 != null && local85.equals(local40)) {
					Static246.method3498(arg0 + Static406.aClass142_104.method3118(Static63.anInt981));
					return;
				}
			}
		}
		for (@Pc(115) int local115 = 0; local115 < Static316.anInt5221; local115++) {
			local85 = Static91.method1066(Static167.aStringArray18[local115]);
			if (local85 != null && local85.equals(local40)) {
				Static246.method3498(Static241.aClass142_62.method3118(Static63.anInt981) + arg0 + Static143.aClass142_36.method3118(Static63.anInt981));
				return;
			}
			if (Static100.aStringArray9[local115] != null) {
				@Pc(158) String local158 = Static91.method1066(Static100.aStringArray9[local115]);
				if (local158 != null && local158.equals(local40)) {
					Static246.method3498(Static241.aClass142_62.method3118(Static63.anInt981) + arg0 + Static143.aClass142_36.method3118(Static63.anInt981));
					return;
				}
			}
		}
		if (Static91.method1066(Static94.aClass11_Sub1_Sub3_Sub2_1.aString32).equals(local40)) {
			Static246.method3498(Static92.aClass142_54.method3118(Static63.anInt981));
		} else {
			Static178.method2589(Static81.aClass242_21);
			Static426.aClass1_Sub19_Sub2_2.method2934(Static108.method1349(arg0));
			Static426.aClass1_Sub19_Sub2_2.method2935(arg0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!hm;I)I")
	public static int method5751(@OriginalArg(0) int arg0, @OriginalArg(1) Class107 arg1) {
		if (!Static55.method767(arg1).method3035(arg0) && arg1.anObjectArray14 == null) {
			return -1;
		} else if (arg1.anIntArray211 == null || arg1.anIntArray211.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray211[arg0];
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public static void method5752(@OriginalArg(0) int arg0) {
		if (Static436.anInt6898 == 1) {
			Static168.anInt3650 = arg0;
		} else if (Static436.anInt6898 == 2 || Static436.anInt6898 == 3) {
			Static300.anInt5046 = arg0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
	public static void method5754() {
		Static76.anInt1078 = 0;
		Static57.aClass14_3.method204();
		Static57.aClass14_3.method205(Static74.aClass1_Sub10_5);
		Static76.anInt1078++;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZI)V")
	public static void method5755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static95.method5202(arg3)) {
			Static390.method5057(Static45.aClass107ArrayArray1[arg3], -1, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIILjava/lang/Object;)[B")
	public static byte[] method5761(@OriginalArg(1) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static102.method1217(arg0, local18);
		} else if (arg1 instanceof Class16) {
			@Pc(30) Class16 local30 = (Class16) arg1;
			return local30.method233(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
