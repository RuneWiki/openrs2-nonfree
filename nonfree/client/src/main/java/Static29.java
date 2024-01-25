import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!av", name = "b", descriptor = "[Lclient!mb;")
	public static Class231[] aClass231Array1;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "I")
	public static int anInt380 = 104;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILjava/lang/String;IZ)V")
	public static void method338(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		Static279.method4664();
		Static293.method4775();
		Static650.method8725();
		Static92.method1338(arg1, arg0, arg2);
		Static326.method5120();
		Static488.method7230(Static202.aClass75_5);
		Static360.method5485(Static202.aClass75_5);
		Static671.method8899(Static583.aClass223_113, Static202.aClass75_5);
		Static81.method1196();
		Static269.method4563(Static626.aClass49Array16);
		Static35.method456();
		Static423.method6439();
		if (Static37.anInt498 == 3) {
			Static307.method4889(4);
		} else if (Static37.anInt498 == 7) {
			Static307.method4889(8);
		} else if (Static37.anInt498 == 9) {
			Static307.method4889(10);
		} else if (Static37.anInt498 == 11) {
			Static307.method4889(12);
		} else if (Static37.anInt498 == 1 || Static37.anInt498 == 2) {
			Static195.method3670();
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)Lclient!dm;")
	public static Class6_Sub13 method339() {
		@Pc(6) Class6_Sub13 local6 = Static136.method2606();
		local6.anInt2126 = 0;
		local6.aClass241_29 = null;
		local6.aClass6_Sub15_Sub1_1 = new Class6_Sub15_Sub1(5000);
		return local6;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Z")
	public static boolean method340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IB)V")
	public static void method341(@OriginalArg(1) byte arg0) {
		if (Static333.aByteArrayArrayArray15 == null) {
			Static333.aByteArrayArrayArray15 = new byte[4][anInt380][Static327.anInt5650];
		}
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			for (@Pc(25) int local25 = 0; local25 < anInt380; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static327.anInt5650; local29++) {
					Static333.aByteArrayArrayArray15[local21][local25][local29] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!laa;Z)V")
	public static void method342(@OriginalArg(0) Class60_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort100; local2 <= arg0.aShort101; local2++) {
			for (@Pc(6) int local6 = arg0.aShort102; local6 <= arg0.aShort99; local6++) {
				@Pc(16) Class243 local16 = Static334.aClass243ArrayArrayArray2[arg0.aByte135][local2][local6];
				if (local16 != null) {
					@Pc(21) Class123 local21 = local16.aClass123_5;
					@Pc(23) Class123 local23 = null;
					while (local21 != null) {
						if (local21.aClass60_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass123_5 = local21.aClass123_1;
							} else {
								local23.aClass123_1 = local21.aClass123_1;
							}
							local21.method3364();
							break;
						}
						local23 = local21;
						local21 = local21.aClass123_1;
					}
				}
			}
		}
		if (!arg1) {
			Static165.method3262(arg0);
		}
	}
}
