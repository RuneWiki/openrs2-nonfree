import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "Lclient!gm;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!dt", name = "A", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)Z")
	public static boolean method1165() {
		try {
			if (Static271.anInt4720 == 2) {
				if (Static358.aClass1_Sub15_2 == null) {
					Static358.aClass1_Sub15_2 = Static398.method2062(Static315.aClass230_71, Static157.anInt2868, Static211.anInt3648);
					if (Static358.aClass1_Sub15_2 == null) {
						return false;
					}
				}
				if (Static131.aClass82_1 == null) {
					Static131.aClass82_1 = new Class82(Static179.aClass230_48, Static31.aClass230_9);
				}
				if (Static197.aClass1_Sub7_Sub1_3.method1061(Static131.aClass82_1, Static358.aClass1_Sub15_2, Static394.aClass230_94)) {
					Static197.aClass1_Sub7_Sub1_3.method1062();
					Static197.aClass1_Sub7_Sub1_3.method1065(Static243.anInt4123);
					Static197.aClass1_Sub7_Sub1_3.method1076(Static358.aClass1_Sub15_2, Static355.aBoolean431);
					Static358.aClass1_Sub15_2 = null;
					Static271.anInt4720 = 0;
					Static315.aClass230_71 = null;
					Static131.aClass82_1 = null;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static197.aClass1_Sub7_Sub1_3.method1079();
			Static271.anInt4720 = 0;
			Static315.aClass230_71 = null;
			Static131.aClass82_1 = null;
			Static358.aClass1_Sub15_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)V")
	public static void method1166() {
		Static330.aClass164_8.method5361(Static196.anInt3485, Static188.aClass135_Sub1_1.aBoolean317 ? Static188.anInt3286 + 256 : -1);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1168(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				local47.append(Static290.aCharArray3[(int) (local51 - arg0 * 37L)]);
			}
			return local47.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)V")
	public static void method1169() {
		if (Static355.anIntArray531 != null && Static392.anIntArray748 != null) {
			return;
		}
		Static355.anIntArray531 = new int[256];
		Static392.anIntArray748 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static355.anIntArray531[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static392.anIntArray748[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}
}
