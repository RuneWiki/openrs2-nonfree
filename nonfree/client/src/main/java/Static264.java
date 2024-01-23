import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "[I")
	public static int[] anIntArray481 = new int[5];

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "[I")
	public static int[] anIntArray482 = new int[200];

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString257 = "yellow:";

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "[I")
	public static int[] anIntArray483 = new int[100];

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BJ)V")
	public static void method4416(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static95.aClass2_Sub26_Sub1_1.method4287(6);
			Static95.aClass2_Sub26_Sub1_1.method4225(arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZI)V")
	public static void method4418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg3 > arg1) {
			for (local10 = arg1; local10 < arg3; local10++) {
				Static274.anIntArrayArray50[local10][arg0] = arg2;
			}
		} else {
			for (local10 = arg3; local10 < arg1; local10++) {
				Static274.anIntArrayArray50[local10][arg0] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method4419(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static151.anInt3192; local16++) {
			if (arg0.equalsIgnoreCase(Static56.aStringArray5[local16])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static111.aClass36_Sub3_Sub2_1.aString249)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method4420(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(20) int local20 = Static208.aClass2_Sub3_Sub5_3.method3316(arg1, 250);
		@Pc(27) int local27 = Static208.aClass2_Sub3_Sub5_3.method3301(arg1, 250) * 13;
		if (Static60.aBoolean106) {
			Static94.method1758(6, 6, local20 + 4 + 4, local27 - -4 + 4, 0);
			Static94.method1756(6, 6, local20 + 4 + 4, local27 + 8, 16777215);
		} else {
			Static160.method2788(6, 6, local20 + 4 + 4, local27 + 4 - -4, 0);
			Static160.method2782(6, 6, local20 + 8, local27 + 4 - -4, 16777215);
		}
		Static208.aClass2_Sub3_Sub5_3.method3309(arg1, 10, 10, local20, local27, 16777215, -1, 1, 1, 0);
		Static121.method2215(local27 + 8, 6, 6, local20 + 4 + 4);
		if (!arg0) {
			Static75.method1374(10, 10, local20, local27);
		} else if (Static60.aBoolean106) {
			Static60.method1165();
		} else {
			try {
				@Pc(175) Graphics local175 = Static105.aCanvas1.getGraphics();
				Static170.aClass14_1.method1194(local175);
			} catch (@Pc(183) Exception local183) {
				Static105.aCanvas1.repaint();
			}
		}
	}
}
