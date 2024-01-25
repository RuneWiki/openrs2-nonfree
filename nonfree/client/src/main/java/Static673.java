import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "Lclient!lb;")
	public static Class221 aClass221_159;

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
	public static int anInt10651 = 1;

	@OriginalMember(owner = "client!vca", name = "n", descriptor = "[I")
	public static final int[] anIntArray600 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
	public static int anInt10658 = -1;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIIZI)V")
	public static void method8915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (Static691.aFrame2 != null && (arg2 != 3 || arg0 != Static87.anInt1455 || arg1 != Static617.anInt9981)) {
			Static430.method6332(Static691.aFrame2, Static310.aClass47_4);
			Static691.aFrame2 = null;
		}
		if (arg2 == 3 && Static691.aFrame2 == null) {
			Static691.aFrame2 = Static295.method4576(arg0, Static310.aClass47_4, arg1, 0);
			if (Static691.aFrame2 != null) {
				Static617.anInt9981 = arg1;
				Static87.anInt1455 = arg0;
				Static328.method4885();
			}
		}
		if (arg2 == 3 && Static691.aFrame2 == null) {
			method8915(-1, -1, Static713.aClass3_Sub55_31.aClass15_Sub23_1.method7900(), -37, true, arg5);
			return;
		}
		@Pc(90) Container local90;
		@Pc(119) Insets local119;
		if (Static691.aFrame2 != null) {
			Static554.anInt9243 = arg0;
			Static57.anInt8465 = arg1;
			local90 = Static691.aFrame2;
		} else if (Static131.aFrame1 == null) {
			if (Static395.anApplet1 == null) {
				local90 = Static31.anApplet_Sub1_3;
			} else {
				local90 = Static395.anApplet1;
			}
			Static554.anInt9243 = local90.getSize().width;
			Static57.anInt8465 = local90.getSize().height;
		} else {
			local119 = Static131.aFrame1.getInsets();
			@Pc(127) int local127 = local119.right + local119.left;
			Static554.anInt9243 = Static131.aFrame1.getSize().width - local127;
			Static57.anInt8465 = Static131.aFrame1.getSize().height - local119.bottom - local119.top;
			local90 = Static131.aFrame1;
		}
		if (arg2 == 1) {
			Static306.anInt5502 = 0;
			Static676.anInt10698 = (Static554.anInt9243 - Static347.anInt2639) / 2;
			Static272.anInt5005 = Static426.anInt7511;
			Static575.anInt9435 = Static347.anInt2639;
		} else {
			Static160.method2555();
		}
		if (Static487.aClass371_7 != Static364.aClass371_4) {
			@Pc(181) boolean local181;
			if (Static575.anInt9435 < 1024 && Static272.anInt5005 < 768) {
				local181 = true;
			} else {
				local181 = false;
			}
		}
		if (arg4) {
			Static646.method8721();
		} else {
			Static67.aCanvas1.setSize(Static575.anInt9435, Static272.anInt5005);
			if (Static178.aBoolean264) {
				Static491.method7117(Static67.aCanvas1);
			} else {
				Static488.aClass67_12.method7631(Static67.aCanvas1, Static575.anInt9435, Static272.anInt5005);
			}
			if (local90 == Static131.aFrame1) {
				local119 = Static131.aFrame1.getInsets();
				Static67.aCanvas1.setLocation(local119.left + Static676.anInt10698, Static306.anInt5502 + local119.top);
			} else {
				Static67.aCanvas1.setLocation(Static676.anInt10698, Static306.anInt5502);
			}
		}
		if (arg2 < 2) {
			Static650.aBoolean755 = false;
		} else {
			Static650.aBoolean755 = true;
		}
		if (Static633.anInt3426 != -1) {
			Static401.method6009(true);
		}
		if (Static532.aClass400_3.aClass255_2 != null && Static56.method718(Static178.anInt3225)) {
			Static281.method4258();
		}
		for (@Pc(275) int local275 = 0; local275 < 100; local275++) {
			Static195.aBooleanArray17[local275] = true;
		}
		if (arg3 > -19) {
			aClass221_159 = null;
		}
		Static581.aBoolean690 = true;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!mka;IIIII)V")
	public static void method8916(@OriginalArg(0) Class241 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 1 || arg4 < 1 || Static362.anInt8653 - 2 < arg2 || arg4 > Static206.anInt11291 - 2) {
			return;
		}
		if (Static584.aClass262ArrayArrayArray2 == null) {
			return;
		}
		@Pc(49) Interface19 local49 = Static462.aClass131_Sub1_2.method3083(arg4, arg1, arg3, arg2);
		if (local49 == null) {
			return;
		}
		if (local49 instanceof Class19_Sub1_Sub3_Sub3) {
			((Class19_Sub1_Sub3_Sub3) local49).method5398(arg0);
		} else if (local49 instanceof Class19_Sub1_Sub5_Sub2) {
			((Class19_Sub1_Sub5_Sub2) local49).method9387(arg0);
		} else if (local49 instanceof Class19_Sub1_Sub2_Sub2) {
			((Class19_Sub1_Sub2_Sub2) local49).method9018(arg0);
		} else if (local49 instanceof Class19_Sub1_Sub1_Sub2) {
			((Class19_Sub1_Sub1_Sub2) local49).method6699(arg0);
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method8917(@OriginalArg(0) String arg0) {
		@Pc(21) StringBuffer local21 = new StringBuffer();
		@Pc(24) int local24 = arg0.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(34) char local34 = arg0.charAt(local26);
			if (local34 == '%' && local26 + 2 < local24) {
				local34 = arg0.charAt(local26 + 1);
				@Pc(87) int local87;
				if (local34 >= '0' && local34 <= '9') {
					local87 = local34 - 48;
				} else if (local34 >= 'a' && local34 <= 'f') {
					local87 = local34 + 10 - 97;
				} else {
					if (local34 < 'A' || local34 > 'F') {
						local21.append('%');
						continue;
					}
					local87 = local34 - 55;
				}
				local34 = arg0.charAt(local26 + 2);
				local87 *= 16;
				if (local34 >= '0' && local34 <= '9') {
					local87 += local34 - 48;
				} else if (local34 >= 'a' && local34 <= 'f') {
					local87 += local34 + 10 - 97;
				} else {
					if (local34 < 'A' || local34 > 'F') {
						local21.append('%');
						continue;
					}
					local87 += local34 + 10 - 65;
				}
				if (local87 != 0 && Static594.method8158((byte) local87)) {
					local21.append(Static265.method4094((byte) local87));
				}
				local26 += 2;
			} else if (local34 == '+') {
				local21.append(' ');
			} else {
				local21.append(local34);
			}
		}
		return local21.toString();
	}
}
