import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "xb", descriptor = "Lclient!ms;")
	public static Class5_Sub17_Sub3 aClass5_Sub17_Sub3_1;

	@OriginalMember(owner = "client!ae", name = "Mb", descriptor = "I")
	public static int anInt176;

	@OriginalMember(owner = "client!ae", name = "zb", descriptor = "F")
	public static float aFloat2 = 1024.0F;

	@OriginalMember(owner = "client!ae", name = "Hb", descriptor = "I")
	public static int anInt172 = 0;

	@OriginalMember(owner = "client!ae", name = "Lb", descriptor = "Lclient!pg;")
	public static final Class5_Sub34 aClass5_Sub34_1 = new Class5_Sub34(0, 0);

	@OriginalMember(owner = "client!ae", name = "Pb", descriptor = "I")
	public static int anInt179 = 0;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
	public static void method170() {
		@Pc(10) int local10 = Static337.aClass138_10.method3725(Static103.aString140);
		@Pc(21) int local21;
		for (@Pc(15) Class5_Sub4 local15 = (Class5_Sub4) Static60.aClass211_4.method5608(); local15 != null; local15 = (Class5_Sub4) Static60.aClass211_4.method5603()) {
			local21 = Static39.method884(local15);
			if (local10 < local21) {
				local10 = local21;
			}
		}
		local10 += 8;
		local21 = Static27.anInt5324 * 16 + 21;
		@Pc(51) int local51 = Static270.anInt5171 - local10 / 2;
		if (local51 + local10 > Static17.anInt5991) {
			local51 = Static17.anInt5991 - local10;
		}
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(69) int local69 = Static274.anInt5378;
		if (local69 + local21 > Static246.anInt4801) {
			local69 = Static246.anInt4801 - local21;
		}
		Static303.anInt5839 = local51;
		if (local69 < 0) {
			local69 = 0;
		}
		Static144.anInt2967 = local10;
		Static343.anInt6411 = (Static171.aBoolean254 ? 26 : 22) + Static27.anInt5324 * 16;
		Static279.anInt5429 = local69;
		Static188.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "(I)V")
	public static void method171() {
		Static238.anInt4612 = -1;
		Static138.anInt2777 = -1;
		Static79.anInt1909 = -1;
		Static115.anInt2459 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!jf;)V")
	public static void method172(@OriginalArg(1) Class96 arg0) {
		@Pc(12) int local12 = arg0.anInt2935;
		if (local12 == 324) {
			if (Static345.anInt6413 == -1) {
				Static131.anInt2705 = arg0.anInt2970;
				Static345.anInt6413 = arg0.anInt2930;
			}
			if (Static210.aClass61_3.aBoolean124) {
				arg0.anInt2930 = Static345.anInt6413;
			} else {
				arg0.anInt2930 = Static131.anInt2705;
			}
		} else if (local12 == 325) {
			if (Static345.anInt6413 == -1) {
				Static131.anInt2705 = arg0.anInt2970;
				Static345.anInt6413 = arg0.anInt2930;
			}
			if (Static210.aClass61_3.aBoolean124) {
				arg0.anInt2930 = Static131.anInt2705;
			} else {
				arg0.anInt2930 = Static345.anInt6413;
			}
		} else if (local12 == 327) {
			arg0.anInt2886 = 150;
			arg0.anInt2927 = (int) (Math.sin((double) Static180.anInt3606 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt2925 = -1;
			arg0.anInt2958 = 5;
		} else if (local12 == 328) {
			if (Static85.aClass25_Sub1_Sub1_Sub1_1.aString237 == null) {
				arg0.anInt2925 = 0;
				arg0.anInt2957 = 0;
			} else {
				arg0.anInt2886 = 150;
				arg0.anInt2927 = (int) (Math.sin((double) Static180.anInt3606 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2958 = 5;
				arg0.anInt2925 = 2047;
				arg0.anInt2957 = Static297.method5044(Static85.aClass25_Sub1_Sub1_Sub1_1.aString237);
				arg0.anInt2950 = Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5268;
				arg0.anInt2888 = Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5276;
				arg0.anInt2906 = Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5299;
				arg0.anInt2892 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method177(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static7.aClass93_1);
		arg0.removeFocusListener(Static7.aClass93_1);
		Static244.anInt4742 = -1;
	}
}
