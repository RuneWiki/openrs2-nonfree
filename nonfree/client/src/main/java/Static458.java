import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
	public static int anInt8069;

	@OriginalMember(owner = "client!oj", name = "D", descriptor = "[Lclient!ms;")
	public static Class246[] aClass246Array1;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!qfa;Z)V")
	public static void method6791(@OriginalArg(0) Class19_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort121; local2 <= arg0.aShort123; local2++) {
			for (@Pc(6) int local6 = arg0.aShort124; local6 <= arg0.aShort122; local6++) {
				@Pc(16) Class262 local16 = Static584.aClass262ArrayArrayArray2[arg0.aByte146][local2][local6];
				if (local16 != null) {
					@Pc(21) Class343 local21 = local16.aClass343_2;
					@Pc(23) Class343 local23 = null;
					while (local21 != null) {
						if (local21.aClass19_Sub1_Sub3_1 == arg0) {
							if (local23 == null) {
								local16.aClass343_2 = local21.aClass343_4;
							} else {
								local23.aClass343_4 = local21.aClass343_4;
							}
							local21.method8101();
							break;
						}
						local23 = local21;
						local21 = local21.aClass343_4;
					}
				}
			}
		}
		if (!arg1) {
			Static433.method6363(arg0);
		}
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
	public static void method6793() {
		Static271.aClass338_24.method8051();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
	public static void method6794() {
		if (Static691.aFrame2 != null) {
			return;
		}
		@Pc(18) int local18 = Static676.anInt10698;
		@Pc(20) int local20 = Static306.anInt5502;
		@Pc(28) int local28 = Static554.anInt9243 - local18 - Static575.anInt9435;
		@Pc(35) int local35 = Static57.anInt8465 - local20 - Static272.anInt5005;
		if (local18 <= 0 && local28 <= 0 && local20 <= 0 && local35 <= 0) {
			return;
		}
		try {
			@Pc(65) Container local65;
			if (Static131.aFrame1 != null) {
				local65 = Static131.aFrame1;
			} else if (Static395.anApplet1 == null) {
				local65 = Static31.anApplet_Sub1_3;
			} else {
				local65 = Static395.anApplet1;
			}
			@Pc(79) int local79 = 0;
			@Pc(81) int local81 = 0;
			if (local65 == Static131.aFrame1) {
				@Pc(87) Insets local87 = Static131.aFrame1.getInsets();
				local81 = local87.top;
				local79 = local87.left;
			}
			@Pc(96) Graphics local96 = local65.getGraphics();
			local96.setColor(Color.black);
			if (local18 > 0) {
				local96.fillRect(local79, local81, local18, Static57.anInt8465);
			}
			if (local20 > 0) {
				local96.fillRect(local79, local81, Static554.anInt9243, local20);
			}
			if (local28 > 0) {
				local96.fillRect(Static554.anInt9243 + local79 - local28, local81, local28, Static57.anInt8465);
			}
			if (local35 > 0) {
				local96.fillRect(local79, local81 + Static57.anInt8465 - local35, Static554.anInt9243, local35);
				return;
			}
		} catch (@Pc(155) Exception local155) {
			return;
		}
	}
}
