import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!wn;")
	public static Class269 aClass269_35;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "Lclient!um;")
	public static Class243 aClass243_141;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_70 = new Class198("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public static void method3340() {
		if (Static317.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static433.anInt7213;
		@Pc(18) int local18 = Static59.anInt1109;
		@Pc(26) int local26 = Static236.anInt3873 - local8 - Static178.anInt5792;
		@Pc(33) int local33 = Static273.anInt4301 - Static102.anInt1723 - local18;
		if (local8 <= 0 && local26 <= 0 && local18 <= 0 && local33 <= 0) {
			return;
		}
		try {
			@Pc(49) Container local49;
			if (Static34.aFrame1 == null) {
				local49 = Static7.aClass93_1.anApplet1;
			} else {
				local49 = Static34.aFrame1;
			}
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			if (Static34.aFrame1 == local49) {
				@Pc(63) Insets local63 = Static34.aFrame1.getInsets();
				local57 = local63.top;
				local55 = local63.left;
			}
			@Pc(72) Graphics local72 = local49.getGraphics();
			local72.setColor(Color.black);
			if (local8 > 0) {
				local72.fillRect(local55, local57, local8, Static273.anInt4301);
			}
			if (local18 > 0) {
				local72.fillRect(local55, local57, Static236.anInt3873, local18);
			}
			if (local26 > 0) {
				local72.fillRect(Static236.anInt3873 + local55 - local26, local57, local26, Static273.anInt4301);
			}
			if (local33 > 0) {
				local72.fillRect(local55, local57 + Static273.anInt4301 - local33, Static236.anInt3873, local33);
				return;
			}
		} catch (@Pc(124) Exception local124) {
			return;
		}
	}
}
