import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString93;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!nk;I)V")
	public static void method1508(@OriginalArg(0) Class121 arg0) {
		Static270.aClass121_119 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
	public static void method1510(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static5.method35(arg1, 1);
		local8.method2866();
		local8.anInt3315 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!wf;II)V")
	public static void method1511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15_Sub5_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (Static90.aClass15_Sub5_Sub2_2 == arg2 || Static110.anInt2281 >= 400) {
			return;
		}
		@Pc(134) String local134;
		if (arg2.anInt5606 == 0) {
			@Pc(21) boolean local21 = true;
			if (Static90.aClass15_Sub5_Sub2_2.anInt5597 != -1 && arg2.anInt5597 != -1) {
				@Pc(42) int local42 = arg2.anInt5597 > Static90.aClass15_Sub5_Sub2_2.anInt5597 ? Static90.aClass15_Sub5_Sub2_2.anInt5597 : arg2.anInt5597;
				@Pc(57) int local57 = Static90.aClass15_Sub5_Sub2_2.anInt5625 > arg2.anInt5625 ? Static90.aClass15_Sub5_Sub2_2.anInt5625 : arg2.anInt5625;
				@Pc(67) int local67 = local57 * 10 / 100 + local42 + 5;
				@Pc(73) int local73 = Static90.aClass15_Sub5_Sub2_2.anInt5625 - arg2.anInt5625;
				if (local73 < 0) {
					local73 = -local73;
				}
				if (local67 < local73) {
					local21 = false;
				}
			}
			@Pc(91) String local91 = Static118.anInt2486 == 1 ? Static279.aString295 : Static12.aString18;
			if (arg2.anInt5613 > arg2.anInt5625) {
				local134 = arg2.method4710() + (local21 ? Static112.method2016(arg2.anInt5625, Static90.aClass15_Sub5_Sub2_2.anInt5625) : "<col=ffffff>") + " (" + local91 + arg2.anInt5625 + "+" + (arg2.anInt5613 - arg2.anInt5625) + ")";
			} else {
				local134 = arg2.method4710() + (local21 ? Static112.method2016(arg2.anInt5625, Static90.aClass15_Sub5_Sub2_2.anInt5625) : "<col=ffffff>") + " (" + local91 + arg2.anInt5625 + ")";
			}
		} else {
			local134 = arg2.method4710() + " (" + Static296.aString319 + arg2.anInt5606 + ")";
		}
		@Pc(221) int local221;
		if (Static306.anInt5423 == 1) {
			Static309.method4707(arg3, Static280.anInt5078, Static272.aString340 + " -> <col=ffffff>" + local134, Static35.aString222, (short) 46, (long) arg0, arg1);
		} else if (!Static133.aBoolean168) {
			for (local221 = 7; local221 >= 0; local221--) {
				if (Static157.aStringArray4[local221] != null) {
					@Pc(234) short local234 = 0;
					if (Static118.anInt2486 == 0 && Static157.aStringArray4[local221].equalsIgnoreCase(Static225.aString233)) {
						if (arg2.anInt5625 > Static90.aClass15_Sub5_Sub2_2.anInt5625) {
							local234 = 2000;
						}
						if (Static90.aClass15_Sub5_Sub2_2.anInt5622 != 0 && arg2.anInt5622 != 0) {
							if (Static90.aClass15_Sub5_Sub2_2.anInt5622 == arg2.anInt5622) {
								local234 = 2000;
							} else {
								local234 = 0;
							}
						}
					} else if (Static139.aBooleanArray10[local221]) {
						local234 = 2000;
					}
					@Pc(291) short local291 = Static155.aShortArray53[local221];
					@Pc(296) short local296 = (short) (local291 + local234);
					Static309.method4707(arg3, Static202.anIntArray313[local221], "<col=ffffff>" + local134, Static157.aStringArray4[local221], local296, (long) arg0, arg1);
				}
			}
		} else if ((Static102.anInt2065 & 0x8) != 0) {
			Static309.method4707(arg3, Static196.anInt3698, Static88.aString106 + " -> <col=ffffff>" + local134, Static148.aString164, (short) 20, (long) arg0, arg1);
		}
		for (local221 = 0; local221 < Static110.anInt2281; local221++) {
			if (Static17.aShortArray2[local221] == 28) {
				Static73.aStringArray6[local221] = "<col=ffffff>" + local134;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
	public static void method1513(@OriginalArg(0) int arg0) {
		if (Static56.anIntArray65 == null || Static56.anIntArray65.length < arg0) {
			Static56.anIntArray65 = new int[arg0];
		}
	}
}
