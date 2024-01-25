import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!k", name = "k", descriptor = "I")
	public static int anInt5040 = 0;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "J")
	public static long aLong145 = -1L;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)Z")
	public static boolean method4551(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			return true;
		} else {
			return arg1 == 7 || arg1 == 8 || arg1 == 9 || arg1 == 10;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
	public static void method4554() {
		if (Static95.aFrame1 != null) {
			return;
		}
		@Pc(11) int local11 = Static304.anInt5288;
		@Pc(20) int local20 = Static517.anInt8215;
		@Pc(26) int local26 = Static166.anInt3250 - Static85.anInt9921 - local11;
		@Pc(33) int local33 = Static249.anInt4342 - Static256.anInt4629 - local20;
		if (local11 <= 0 && local26 <= 0 && local20 <= 0 && local33 <= 0) {
			return;
		}
		try {
			@Pc(61) Container local61;
			if (Static207.aFrame2 != null) {
				local61 = Static207.aFrame2;
			} else if (Static265.anApplet2 == null) {
				local61 = Static597.anApplet_Sub1_1;
			} else {
				local61 = Static265.anApplet2;
			}
			@Pc(71) int local71 = 0;
			@Pc(73) int local73 = 0;
			if (local61 == Static207.aFrame2) {
				@Pc(79) Insets local79 = Static207.aFrame2.getInsets();
				local73 = local79.top;
				local71 = local79.left;
			}
			@Pc(88) Graphics local88 = local61.getGraphics();
			local88.setColor(Color.black);
			if (local11 > 0) {
				local88.fillRect(local71, local73, local11, Static249.anInt4342);
			}
			if (local20 > 0) {
				local88.fillRect(local71, local73, Static166.anInt3250, local20);
			}
			if (local26 > 0) {
				local88.fillRect(Static166.anInt3250 + local71 - local26, local73, local26, Static249.anInt4342);
			}
			if (local33 > 0) {
				local88.fillRect(local71, local73 + Static249.anInt4342 - local33, Static166.anInt3250, local33);
				return;
			}
		} catch (@Pc(151) Exception local151) {
			return;
		}
	}
}
