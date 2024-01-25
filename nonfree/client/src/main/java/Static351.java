import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "Lclient!wo;")
	public static Class216 aClass216_98;

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "Lclient!jk;")
	public static Class106 aClass106_9;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
	public static int anInt6705;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "Lclient!tm;")
	public static Class197 aClass197_33 = new Class197(8);

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "[I")
	public static final int[] anIntArray530 = new int[32];

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
	public static int anInt6704 = 0;

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
	public static int anInt6706 = -1;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)I")
	public static int method5604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static63.anIntArray477[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!nh;)V")
	public static void method5605(@OriginalArg(1) Class143 arg0) {
		Static13.anInt489 = 3;
		Static7.method274(true);
		Static167.anInt3605 = 255;
		Static323.anInt6216 = 1;
		Static279.anInt5666 = 0;
		Static259.aBoolean281 = true;
		Static336.aBoolean628 = true;
		Static111.aBoolean254 = true;
		Static306.aBoolean584 = true;
		Static252.anInt5211 = 0;
		Static114.anInt4335 = 127;
		Static80.anInt2078 = 127;
		Static163.anInt3549 = 2;
		Static84.aBoolean195 = true;
		Static322.anInt6180 = 0;
		Static304.aBoolean580 = true;
		Static129.aBoolean269 = true;
		Static221.aBoolean435 = true;
		Static125.aBoolean268 = true;
		Static282.aBoolean648 = true;
		Static327.anInt6283 = 0;
		if (Static257.anInt5344 < 96) {
			Static183.method3606(0);
		} else {
			Static183.method3606(2);
		}
		Static204.anInt4306 = 2;
		Static348.aBoolean657 = true;
		Static45.aBoolean140 = false;
		Static278.aBoolean547 = false;
		Static327.aBoolean607 = false;
		Static324.anInt6232 = 0;
		Static34.anInt1164 = 0;
		Static332.aBoolean626 = true;
		Static218.anInt4605 = Static342.anInt3001 == 1 ? 2 : 4;
		Static168.anInt3612 = 2;
		@Pc(86) Class90 local86 = null;
		try {
			@Pc(90) Class162 local90 = arg0.method3899();
			while (local90.anInt4801 == 0) {
				Static190.method3690(1L);
			}
			if (local90.anInt4801 == 1) {
				local86 = (Class90) local90.anObject5;
				@Pc(112) byte[] local112 = new byte[(int) local86.method2567()];
				@Pc(127) int local127;
				for (@Pc(114) int local114 = 0; local114 < local112.length; local114 += local127) {
					local127 = local86.method2566(local114, local112.length - local114, local112);
					if (local127 == -1) {
						throw new IOException("EOF");
					}
				}
				Static273.method4774(new Class1_Sub8(local112));
			}
		} catch (@Pc(152) Exception local152) {
		}
		try {
			if (local86 != null) {
				local86.method2565();
			}
		} catch (@Pc(159) Exception local159) {
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method5607(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) boolean local12 = false;
		for (@Pc(14) int local14 = 0; local14 < Static357.anInt4331; local14++) {
			@Pc(22) Class17_Sub1_Sub1_Sub1 local22 = Static102.aClass17_Sub1_Sub1_Sub1Array1[Static298.anIntArray492[local14]];
			if (local22 != null && local22.aString13 != null && local22.aString13.equalsIgnoreCase(arg1)) {
				local12 = true;
				if (arg0 == 1) {
					Static342.aClass1_Sub8_Sub1_7.method3229(237);
					Static342.aClass1_Sub8_Sub1_7.method4542(Static298.anIntArray492[local14]);
					Static342.aClass1_Sub8_Sub1_7.method4562(0);
				} else if (arg0 == 4) {
					Static342.aClass1_Sub8_Sub1_7.method3229(50);
					Static342.aClass1_Sub8_Sub1_7.method4524(0);
					Static342.aClass1_Sub8_Sub1_7.method4561(Static298.anIntArray492[local14]);
				} else if (arg0 == 5) {
					Static342.aClass1_Sub8_Sub1_7.method3229(4);
					Static342.aClass1_Sub8_Sub1_7.method4562(0);
					Static342.aClass1_Sub8_Sub1_7.method4542(Static298.anIntArray492[local14]);
				} else if (arg0 == 6) {
					Static342.aClass1_Sub8_Sub1_7.method3229(215);
					Static342.aClass1_Sub8_Sub1_7.method4524(0);
					Static342.aClass1_Sub8_Sub1_7.method4561(Static298.anIntArray492[local14]);
				} else if (arg0 == 7) {
					Static342.aClass1_Sub8_Sub1_7.method3229(58);
					Static342.aClass1_Sub8_Sub1_7.method4562(0);
					Static342.aClass1_Sub8_Sub1_7.method4561(Static298.anIntArray492[local14]);
				}
				break;
			}
		}
		if (!local12) {
			Static85.method4682(Static30.aClass34_25.method1285(Static259.anInt2907) + arg1);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BC)Z")
	public static boolean method5608(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
