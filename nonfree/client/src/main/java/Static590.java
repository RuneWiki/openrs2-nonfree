import java.awt.Color;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "[Lclient!id;")
	public static Class169_Sub1[] aClass169_Sub1Array3;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	public static int anInt9759;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "[J")
	public static final long[] aLongArray19 = new long[32];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8398(@OriginalArg(0) String arg0) {
		if (Static658.aStringArray47 == null) {
			Static391.method5938();
		}
		Static155.aCalendar1.setTime(new Date(Static26.method382()));
		@Pc(28) int local28 = Static155.aCalendar1.get(11);
		@Pc(32) int local32 = Static155.aCalendar1.get(12);
		@Pc(36) int local36 = Static155.aCalendar1.get(13);
		@Pc(70) String local70 = Integer.toString(local28 / 10) + local28 % 10 + ":" + local32 / 10 + local32 % 10 + ":" + local36 / 10 + local36 % 10;
		@Pc(75) String[] local75 = Static407.method2868(arg0, '\n');
		for (@Pc(77) int local77 = 0; local77 < local75.length; local77++) {
			for (@Pc(80) int local80 = Static46.anInt765; local80 > 0; local80--) {
				Static658.aStringArray47[local80] = Static658.aStringArray47[local80 - 1];
			}
			Static658.aStringArray47[0] = local70 + ": " + local75[local77];
			if (Static501.aFileOutputStream1 != null) {
				try {
					Static501.aFileOutputStream1.write(Static359.method5455(Static658.aStringArray47[0] + "\n"));
				} catch (@Pc(130) IOException local130) {
				}
			}
			if (Static46.anInt765 < Static658.aStringArray47.length - 1) {
				Static46.anInt765++;
				if (Static411.anInt7100 > 0) {
					Static411.anInt7100++;
				}
			}
		}
	}
}
