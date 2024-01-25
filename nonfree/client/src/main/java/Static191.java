import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!bk;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_62 = new Class237(73, 0);

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_30 = new Class83(200);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public static void method2911() {
		if (Static421.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static226.anInt4101;
		@Pc(10) int local10 = Static340.anInt5935;
		@Pc(23) int local23 = Static288.anInt5035 - Static207.anInt3842 - local8;
		@Pc(29) int local29 = Static119.anInt7598 - Static255.anInt4574 - local10;
		if (local8 <= 0 && local23 <= 0 && local10 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(47) Container local47;
			if (Static97.aFrame1 == null) {
				local47 = Static119.aClass138_7.anApplet1;
			} else {
				local47 = Static97.aFrame1;
			}
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			if (Static97.aFrame1 == local47) {
				@Pc(62) Insets local62 = Static97.aFrame1.getInsets();
				local54 = local62.left;
				local56 = local62.top;
			}
			@Pc(71) Graphics local71 = local47.getGraphics();
			local71.setColor(Color.black);
			if (local8 > 0) {
				local71.fillRect(local54, local56, local8, Static119.anInt7598);
			}
			if (local10 > 0) {
				local71.fillRect(local54, local56, Static288.anInt5035, local10);
			}
			if (local23 > 0) {
				local71.fillRect(Static288.anInt5035 + local54 - local23, local56, local23, Static119.anInt7598);
			}
			if (local29 > 0) {
				local71.fillRect(local54, local56 + Static119.anInt7598 - local29, Static288.anInt5035, local29);
				return;
			}
		} catch (@Pc(121) Exception local121) {
			return;
		}
	}
}
