import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "Lclient!qf;")
	public static Class245 aClass245_11;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	public static int anInt5986;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
	public static int anInt5982 = -1;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_94 = new Class67("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method4994(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static235.anInt2721;
		@Pc(17) int[] local17 = Static130.anIntArray267;
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < local7; local21++) {
			@Pc(29) Class6_Sub1_Sub2_Sub1 local29 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local17[local21]];
			if (local29 != null && local29 != Static111.aClass6_Sub1_Sub2_Sub1_3 && local29.aString27 != null && local29.aString27.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static278.method4791(Static364.aClass158_89);
					Static515.aClass3_Sub27_Sub1_2.method7600(local17[local21], 30364);
					Static515.aClass3_Sub27_Sub1_2.method7602(0);
				} else if (arg1 == 4) {
					Static278.method4791(Static237.aClass158_64);
					Static515.aClass3_Sub27_Sub1_2.method7587(local17[local21]);
					Static515.aClass3_Sub27_Sub1_2.method7573(0);
				} else if (arg1 == 5) {
					Static278.method4791(Static17.aClass158_52);
					Static515.aClass3_Sub27_Sub1_2.method7606(local17[local21]);
					Static515.aClass3_Sub27_Sub1_2.method7593(0);
				} else if (arg1 == 6) {
					Static278.method4791(Static164.aClass158_46);
					Static515.aClass3_Sub27_Sub1_2.method7600(local17[local21], 30364);
					Static515.aClass3_Sub27_Sub1_2.method7602(0);
				} else if (arg1 == 7) {
					Static278.method4791(Static473.aClass158_107);
					Static515.aClass3_Sub27_Sub1_2.method7600(local17[local21], 30364);
					Static515.aClass3_Sub27_Sub1_2.method7576(0);
				}
				local19 = true;
				break;
			}
		}
		if (!local19) {
			Static356.method5583(Static282.aClass67_87.method1934(Static193.anInt7803) + arg0);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIFFF)F")
	public static float method4995(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static198.aFloatArrayArray24[arg0];
		return arg2 * local7[0] + arg1 * local7[1] + local7[2] * arg3;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
	public static void method4997() {
		if (Static258.aFrame2 != null) {
			return;
		}
		@Pc(14) Container local14;
		if (Static107.aFrame1 != null) {
			local14 = Static107.aFrame1;
		} else if (Static370.anApplet1 == null) {
			local14 = Static391.anApplet_Sub1_1;
		} else {
			local14 = Static370.anApplet1;
		}
		Static265.anInt5511 = local14.getSize().width;
		Static211.anInt4645 = local14.getSize().height;
		@Pc(36) Insets local36;
		if (Static107.aFrame1 == local14) {
			local36 = Static107.aFrame1.getInsets();
			Static265.anInt5511 -= local36.right + local36.left;
			Static211.anInt4645 -= local36.top + local36.bottom;
		}
		if (Static212.method3885() == 1) {
			Static531.anInt9232 = 0;
			Static412.anInt7547 = Static172.anInt3949;
			Static493.anInt9484 = (Static265.anInt5511 - Static238.anInt4976) / 2;
			Static480.anInt8652 = Static238.anInt4976;
		} else {
			Static127.method2251();
		}
		if (Static464.aClass253_15 != Static327.aClass253_10) {
			@Pc(93) boolean local93;
			if (Static480.anInt8652 < 1024 && Static412.anInt7547 < 768) {
				local93 = true;
			} else {
				local93 = false;
			}
		}
		Static549.aCanvas15.setSize(Static480.anInt8652, Static412.anInt7547);
		if (Static121.aClass5_7 != null) {
			Static121.aClass5_7.method7442(Static549.aCanvas15);
		}
		if (local14 == Static107.aFrame1) {
			local36 = Static107.aFrame1.getInsets();
			Static549.aCanvas15.setLocation(Static493.anInt9484 + local36.left, Static531.anInt9232 + local36.top);
		} else {
			Static549.aCanvas15.setLocation(Static493.anInt9484, Static531.anInt9232);
		}
		if (Static422.anInt8667 != -1) {
			Static47.method7753(true);
		}
		Static192.method3685();
	}
}
