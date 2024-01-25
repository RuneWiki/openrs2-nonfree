import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "Lclient!aj;")
	public static Class15 aClass15_123;

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "[I")
	public static final int[] anIntArray678 = new int[64];

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILjava/awt/Canvas;II)Lclient!lm;")
	public static Class3_Sub13 method7013(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class3_Sub13_Sub1");
			@Pc(10) Class3_Sub13 local10 = (Class3_Sub13) local6.getDeclaredConstructor().newInstance();
			local10.method4822(arg1, arg0, arg2);
			return local10;
		} catch (@Pc(26) Throwable local26) {
			@Pc(30) Class3_Sub13_Sub2 local30 = new Class3_Sub13_Sub2();
			local30.method4822(arg1, arg0, arg2);
			return local30;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "([IBIII)V")
	public static void method7014(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(8) int local8 = arg2 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (local11 > arg1) {
			@Pc(15) int local15 = arg1 + 1;
			arg0[local15] = arg3;
			@Pc(20) int local20 = local15 + 1;
			arg0[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg3;
			arg1 = local45 + 1;
			arg0[arg1] = arg3;
		}
		while (arg1 < local8) {
			arg1++;
			arg0[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIIILclient!ha;Z)V")
	public static void method7015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class13 arg4) {
		if ((Static288.aClass33_10 == null || Static262.aClass33_9 == null || Static356.aClass33_27 == null) && Static369.aClass15_97.method526(Static130.anInt2662) && Static369.aClass15_97.method526(Static563.anInt9140) && Static369.aClass15_97.method526(Static249.anInt4509)) {
			@Pc(27) Class97 local27 = Static682.method2754(Static369.aClass15_97, Static563.anInt9140, 0);
			Static262.aClass33_9 = arg4.method8465(local27, true);
			local27.method2746();
			Static311.aClass33_13 = arg4.method8465(local27, true);
			Static288.aClass33_10 = arg4.method8465(Static682.method2754(Static369.aClass15_97, Static130.anInt2662, 0), true);
			@Pc(52) Class97 local52 = Static682.method2754(Static369.aClass15_97, Static249.anInt4509, 0);
			Static356.aClass33_27 = arg4.method8465(local52, true);
			local52.method2746();
			Static57.aClass33_2 = arg4.method8465(local52, true);
		}
		if (Static288.aClass33_10 == null || Static262.aClass33_9 == null || Static356.aClass33_27 == null) {
			return;
		}
		@Pc(92) int local92 = (arg0 - Static356.aClass33_27.method7659() * 2) / Static288.aClass33_10.method7659();
		for (@Pc(94) int local94 = 0; local94 < local92; local94++) {
			Static288.aClass33_10.method7654(arg3 + Static356.aClass33_27.method7659() + Static288.aClass33_10.method7659() * local94, -Static288.aClass33_10.method7662() + arg1 + arg2);
		}
		@Pc(133) int local133 = (arg1 - Static356.aClass33_27.method7662() - 20) / Static262.aClass33_9.method7662();
		for (@Pc(135) int local135 = 0; local135 < local133; local135++) {
			Static262.aClass33_9.method7654(arg3, local135 * Static262.aClass33_9.method7662() + arg2 + 20);
			Static311.aClass33_13.method7654(arg0 + arg3 - Static311.aClass33_13.method7659(), arg2 - -(Static262.aClass33_9.method7662() * local135) + 20);
		}
		Static356.aClass33_27.method7654(arg3, arg2 + arg1 - Static356.aClass33_27.method7662());
		Static57.aClass33_2.method7654(arg3 + arg0 - Static356.aClass33_27.method7659(), -Static356.aClass33_27.method7662() + (arg2 - -arg1));
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BI)Z")
	public static boolean method7016(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static268.aCharArray7[local7 - 128] != '\u0000';
		}
	}
}
