import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_115 = new Class171(5, 4);

	@OriginalMember(owner = "client!iba", name = "j", descriptor = "Lclient!qw;")
	public static final Class302 aClass302_47 = new Class302();

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
	public static void method5989() {
		if (Static54.aBoolean76) {
			return;
		}
		Static519.method6750(Static416.aClass368ArrayArrayArray3);
		if (Static195.aClass368ArrayArrayArray1 != null) {
			Static519.method6750(Static195.aClass368ArrayArrayArray1);
		}
		Static54.aBoolean76 = true;
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)V")
	public static void method5991() {
		if (Static438.aFrame1 != null) {
			return;
		}
		@Pc(10) int local10 = Static462.anInt7379;
		@Pc(12) int local12 = Static640.anInt10686;
		@Pc(19) int local19 = Static190.anInt3438 - Static531.anInt8327 - local10;
		@Pc(26) int local26 = Static674.anInt10898 - Static13.anInt306 - local12;
		if (local10 <= 0 && local19 <= 0 && local12 <= 0 && local26 <= 0) {
			return;
		}
		try {
			@Pc(46) Container local46;
			if (Static572.aFrame2 != null) {
				local46 = Static572.aFrame2;
			} else if (Static339.anApplet2 == null) {
				local46 = Static353.anApplet_Sub1_1;
			} else {
				local46 = Static339.anApplet2;
			}
			@Pc(56) int local56 = 0;
			@Pc(58) int local58 = 0;
			if (Static572.aFrame2 == local46) {
				@Pc(64) Insets local64 = Static572.aFrame2.getInsets();
				local56 = local64.left;
				local58 = local64.top;
			}
			@Pc(73) Graphics local73 = local46.getGraphics();
			local73.setColor(Color.black);
			if (local10 > 0) {
				local73.fillRect(local56, local58, local10, Static674.anInt10898);
			}
			if (local12 > 0) {
				local73.fillRect(local56, local58, Static190.anInt3438, local12);
			}
			if (local19 > 0) {
				local73.fillRect(Static190.anInt3438 + local56 - local19, local58, local19, Static674.anInt10898);
			}
			if (local26 > 0) {
				local73.fillRect(local56, local58 + Static674.anInt10898 - local26, Static190.anInt3438, local26);
			}
		} catch (@Pc(126) Exception local126) {
		}
	}
}
