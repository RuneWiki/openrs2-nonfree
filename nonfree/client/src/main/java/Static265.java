import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "[I")
	public static final int[] anIntArray262 = new int[1000];

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!ft;Z)V")
	public static void method4125(@OriginalArg(1) Class28_Sub1_Sub4_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static483.anInt8099 >= 400) {
			return;
		}
		@Pc(10) Class134 local10 = arg0.aClass134_1;
		@Pc(20) String local20 = arg0.aString25;
		if (local10.anIntArray191 != null) {
			local10 = local10.method3276(Static161.aClass237_3);
			if (local10 == null) {
				return;
			}
			local20 = local10.aString29;
		}
		if (!local10.aBoolean302) {
			return;
		}
		if (arg0.anInt3582 != 0) {
			@Pc(54) String local54 = Static409.aClass98_3 == Static218.aClass98_2 ? Static64.aClass52_30.method907(Static544.anInt8937) : Static64.aClass52_28.method907(Static544.anInt8937);
			local20 = local20 + Static78.method1012(arg0.anInt3582, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5549) + " (" + local54 + arg0.anInt3582 + ")";
		}
		if (Static55.aBoolean60 && !arg1) {
			@Pc(91) Class233 local91 = Static412.anInt7320 == -1 ? null : Static191.aClass381_2.method8728(Static412.anInt7320);
			if ((Static24.anInt7340 & 0x2) != 0 && (local91 == null || local10.method3279(local91.anInt6763, Static412.anInt7320) != local91.anInt6763)) {
				Static282.method4539(Static421.aString59, false, -1, Static233.anInt4241, false, (long) arg0.anInt5512, 0, 44, (long) arg0.anInt5512, 0, Static199.aString28 + " -> <col=ffff00>" + local20, true);
			}
		}
		if (!arg1) {
			@Pc(145) String[] local145 = local10.aStringArray25;
			if (Static92.aBoolean200) {
				local145 = Static618.method8408(local145);
			}
			@Pc(155) int local155;
			if (local145 != null) {
				for (local155 = 4; local155 >= 0; local155--) {
					if (local145[local155] != null && (local10.aByte47 == 0 || !local145[local155].equalsIgnoreCase(Static64.aClass52_23.method907(Static544.anInt8937)))) {
						@Pc(174) byte local174 = 0;
						@Pc(176) int local176 = Static300.anInt10361;
						if (local155 == 0) {
							local174 = 6;
						}
						if (local155 == 1) {
							local174 = 60;
						}
						if (local155 == 2) {
							local174 = 59;
						}
						if (local155 == 3) {
							local174 = 25;
						}
						if (local155 == 4) {
							local174 = 19;
						}
						if (local155 == local10.anInt3811) {
							local176 = local10.anInt3850;
						}
						if (local10.anInt3824 == local155) {
							local176 = local10.anInt3848;
						}
						Static282.method4539(local145[local155], false, -1, local145[local155].equalsIgnoreCase(Static64.aClass52_23.method907(Static544.anInt8937)) ? local10.anInt3833 : local176, false, (long) arg0.anInt5512, 0, local174, (long) arg0.anInt5512, 0, "<col=ffff00>" + local20, true);
					}
				}
			}
			if (local10.aByte47 == 1 && local145 != null) {
				for (local155 = 4; local155 >= 0; local155--) {
					if (local145[local155] != null && local145[local155].equalsIgnoreCase(Static64.aClass52_23.method907(Static544.anInt8937))) {
						@Pc(298) short local298 = 0;
						if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5549 < arg0.anInt3582) {
							local298 = 2000;
						}
						@Pc(307) short local307 = 0;
						if (local155 == 0) {
							local307 = 6;
						}
						if (local155 == 1) {
							local307 = 60;
						}
						if (local155 == 2) {
							local307 = 59;
						}
						if (local155 == 3) {
							local307 = 25;
						}
						if (local155 == 4) {
							local307 = 19;
						}
						if (local307 != 0) {
							local307 += local298;
						}
						Static282.method4539(local145[local155], false, -1, local10.anInt3833, false, (long) arg0.anInt5512, 0, local307, (long) arg0.anInt5512, 0, "<col=ffff00>" + local20, true);
					}
				}
			}
		}
		Static282.method4539(Static64.aClass52_22.method907(Static544.anInt8937), arg1, -1, Static559.anInt9123, false, (long) arg0.anInt5512, 0, 1001, (long) arg0.anInt5512, 0, "<col=ffff00>" + local20, true);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	public static void method4127() {
		@Pc(1) Class340 local1 = Static201.aClass340_22;
		synchronized (Static201.aClass340_22) {
			Static201.aClass340_22.method8000();
		}
		local1 = Static607.aClass340_49;
		synchronized (Static607.aClass340_49) {
			Static607.aClass340_49.method8000();
		}
	}
}
