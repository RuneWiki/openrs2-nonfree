import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	public static int anInt1152 = 20;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method1056() {
		if (Static54.anInt992 == 0) {
			return;
		}
		try {
			if (++Static115.anInt1938 > 2000) {
				if (Static339.aClass66_2 != null) {
					Static339.aClass66_2.method1388();
					Static339.aClass66_2 = null;
				}
				if (Static461.anInt7750 >= 1) {
					Static54.anInt992 = 0;
					Static298.anInt5371 = -5;
					return;
				}
				Static115.anInt1938 = 0;
				Static54.anInt992 = 1;
				Static15.aClass263_1.aBoolean500 = !Static15.aClass263_1.aBoolean500;
				Static461.anInt7750++;
			}
			if (Static54.anInt992 == 1) {
				Static448.aClass136_8 = Static138.aClass194_2.method4418(Static15.aClass263_1.aString71, Static15.aClass263_1.method5935());
				Static54.anInt992 = 2;
			}
			if (Static54.anInt992 == 2) {
				if (Static448.aClass136_8.anInt3418 == 2) {
					throw new IOException();
				}
				if (Static448.aClass136_8.anInt3418 != 1) {
					return;
				}
				Static339.aClass66_2 = Static253.method3540((Socket) Static448.aClass136_8.anObject10);
				Static448.aClass136_8 = null;
				Static339.aClass66_2.method1392(Static389.aClass2_Sub17_Sub1_2.anInt7523, Static389.aClass2_Sub17_Sub1_2.aByteArray94);
				Static54.anInt992 = 4;
			}
			@Pc(131) int local131;
			if (Static54.anInt992 == 4) {
				if (!Static339.aClass66_2.method1390(1)) {
					return;
				}
				Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 1);
				local131 = Static202.aClass2_Sub17_Sub1_1.aByteArray94[0] & 0xFF;
				if (local131 != 21) {
					Static54.anInt992 = 0;
					Static298.anInt5371 = local131;
					Static339.aClass66_2.method1388();
					Static339.aClass66_2 = null;
					return;
				}
				Static54.anInt992 = 5;
			}
			if (Static54.anInt992 == 5) {
				if (!Static339.aClass66_2.method1390(1)) {
					return;
				}
				Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 1);
				Static374.aStringArray62 = new String[Static202.aClass2_Sub17_Sub1_1.aByteArray94[0] & 0xFF];
				Static54.anInt992 = 6;
			}
			if (Static54.anInt992 == 6 && Static339.aClass66_2.method1390(Static374.aStringArray62.length * 8)) {
				Static202.aClass2_Sub17_Sub1_1.anInt7523 = 0;
				Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, Static374.aStringArray62.length * 8);
				for (local131 = 0; local131 < Static374.aStringArray62.length; local131++) {
					Static374.aStringArray62[local131] = Static289.method4097(Static202.aClass2_Sub17_Sub1_1.method6128());
				}
				Static54.anInt992 = 0;
				Static298.anInt5371 = 21;
				Static339.aClass66_2.method1388();
				Static339.aClass66_2 = null;
			}
		} catch (@Pc(233) IOException local233) {
			if (Static339.aClass66_2 != null) {
				Static339.aClass66_2.method1388();
				Static339.aClass66_2 = null;
			}
			if (Static461.anInt7750 >= 1) {
				Static54.anInt992 = 0;
				Static298.anInt5371 = -4;
			} else {
				Static115.anInt1938 = 0;
				Static15.aClass263_1.aBoolean500 = !Static15.aClass263_1.aBoolean500;
				Static461.anInt7750++;
				Static54.anInt992 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1057(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 128 || arg2 < 128 || (Static234.anInt3949 - 2) * 128 < arg0 || arg2 > (Static371.anInt6492 - 2) * 128) {
			Static242.anIntArray380[0] = Static242.anIntArray380[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static365.method3535(arg5, arg0, arg2) - arg3;
		Static186.aClass6_2.W(arg1, 0, 0);
		Static257.aClass75_8.SA(Static186.aClass6_2);
		Static257.aClass75_8.v(arg0, local45, arg2, Static242.anIntArray380);
		Static186.aClass6_2.W(-arg1, 0, 0);
		Static257.aClass75_8.SA(Static186.aClass6_2);
	}
}
