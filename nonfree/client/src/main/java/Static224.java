import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!o", name = "l", descriptor = "I")
	public static int anInt6535;

	@OriginalMember(owner = "client!o", name = "s", descriptor = "Lclient!iq;")
	public static Class104 aClass104_181;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_53 = new Class107(30);

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public static void method5493() {
		if (Static331.anIntArray498 != null && Static45.anIntArray70 != null) {
			return;
		}
		Static331.anIntArray498 = new int[256];
		Static45.anIntArray70 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static331.anIntArray498[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static45.anIntArray70[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)V")
	public static void method5495(@OriginalArg(1) int arg0) {
		if (arg0 == Static176.anInt3971) {
			return;
		}
		if (Static176.anInt3971 == 0) {
			Static206.method3934();
		}
		if (arg0 == 40) {
			Static364.method5838();
		}
		if (arg0 != 40 && Static155.aClass117_3 != null) {
			Static155.aClass117_3.method3278();
			Static155.aClass117_3 = null;
		}
		if (Static176.anInt3971 == 25 || Static176.anInt3971 == 28) {
			Static304.aClass104_159.anInt3077 = 2;
			Static304.aClass104_160.anInt3077 = 2;
			Static67.aClass104_109.anInt3077 = 2;
			Static278.aClass104_146.anInt3077 = 2;
			Static36.aClass104_26.anInt3077 = 2;
			Static213.aClass104_119.anInt3077 = 2;
			Static24.aClass104_33.anInt3077 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static251.anInt5243 = 0;
			Static8.anInt171 = 0;
			Static230.anInt5822 = 0;
			Static138.anInt3002 = 1;
			Static112.anInt2362 = 1;
			Static251.method4441(true);
			Static304.aClass104_159.anInt3077 = 1;
			Static304.aClass104_160.anInt3077 = 1;
			Static67.aClass104_109.anInt3077 = 1;
			Static278.aClass104_146.anInt3077 = 1;
			Static36.aClass104_26.anInt3077 = 1;
			Static213.aClass104_119.anInt3077 = 1;
			Static24.aClass104_33.anInt3077 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static183.method3485();
		}
		if (arg0 == 5) {
			Static269.method5572(Static338.aClass104_184, Static51.aClass37_1);
		} else {
			Static204.method3872();
		}
		@Pc(159) boolean local159 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(176) boolean local176 = Static176.anInt3971 == 5 || Static176.anInt3971 == 10 || Static176.anInt3971 == 28;
		if (local176 != local159) {
			if (local159) {
				Static290.anInt5805 = Static134.anInt2868;
				if (Static241.anInt5136 == 0) {
					Static153.method3166();
				} else {
					Static53.method1171(Static284.aClass104_149, 255, Static134.anInt2868);
				}
				Static57.aClass79_1.method2121(false);
			} else {
				Static153.method3166();
				Static57.aClass79_1.method2121(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static51.aClass37_1.method3668();
		}
		Static176.anInt3971 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(JI)V")
	public static void method5496(@OriginalArg(0) long arg0) {
		if (Static196.aClass51ArrayArrayArray3 != null) {
			if (Static135.anInt2910 == 1 || Static135.anInt2910 == 5) {
				Static295.method4931(arg0);
			} else if (Static135.anInt2910 == 4) {
				Static104.method2072(arg0);
			}
		}
		Static231.method4259((long) Static6.anInt91, Static51.aClass37_1);
		if (Static269.anInt6658 != -1) {
			Static94.method1859(Static269.anInt6658);
		}
		for (@Pc(43) int local43 = 0; local43 < Static236.anInt928; local43++) {
			if (Static269.aBooleanArray29[local43]) {
				Static286.aBooleanArray25[local43] = true;
			}
			Static286.aBooleanArray24[local43] = Static269.aBooleanArray29[local43];
			Static269.aBooleanArray29[local43] = false;
		}
		Static328.anInt6687 = Static6.anInt91;
		if (Static51.aClass37_1.method3738()) {
			Static236.aBoolean94 = true;
		}
		if (Static269.anInt6658 != -1) {
			Static236.anInt928 = 0;
			Static269.method5576();
		}
		Static51.aClass37_1.method3709();
		Static86.method1716(Static51.aClass37_1);
		@Pc(93) int local93 = Static50.method946();
		if (local93 == -1) {
			local93 = Static128.anInt2760;
		}
		Static32.method441(local93);
		Static51.method1024(Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893, Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, Static170.anInt5086, Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888);
		Static170.anInt5086 = 0;
	}
}
