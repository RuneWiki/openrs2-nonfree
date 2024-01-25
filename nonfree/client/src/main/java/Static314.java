import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "Lclient!rp;")
	public static Class223 aClass223_7;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_193 = new Class56(7, 8);

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[200];

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "[I")
	public static final int[] anIntArray410 = new int[25];

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "S")
	public static short aShort71 = 256;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZIIII)V")
	public static void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static276.aFrame5 != null && (arg4 != 3 || Static413.aClass49_Sub1_1.anInt3211 != arg2 || arg3 != Static413.aClass49_Sub1_1.anInt3212)) {
			Static339.method4485(Static276.aFrame5, Static24.aClass196_1);
			Static276.aFrame5 = null;
		}
		if (arg4 == 3 && Static276.aFrame5 == null) {
			Static276.aFrame5 = Static421.method5676(arg2, Static24.aClass196_1, 0, arg3);
			if (Static276.aFrame5 != null) {
				Static413.aClass49_Sub1_1.anInt3211 = arg2;
				Static413.aClass49_Sub1_1.anInt3212 = arg3;
				Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
			}
		}
		if (arg4 == 3 && Static276.aFrame5 == null) {
			method4073(arg0, true, -1, -1, Static413.aClass49_Sub1_1.anInt3207);
			return;
		}
		@Pc(75) Container local75;
		@Pc(97) Insets local97;
		if (Static276.aFrame5 != null) {
			Static298.anInt4896 = arg2;
			local75 = Static276.aFrame5;
			Static75.anInt1525 = arg3;
		} else if (Static43.aFrame4 == null) {
			local75 = Static24.aClass196_1.anApplet1;
			Static298.anInt4896 = local75.getSize().width;
			Static75.anInt1525 = local75.getSize().height;
		} else {
			local97 = Static43.aFrame4.getInsets();
			Static298.anInt4896 = Static43.aFrame4.getSize().width - local97.left - local97.right;
			Static75.anInt1525 = Static43.aFrame4.getSize().height - local97.bottom - local97.top;
			local75 = Static43.aFrame4;
		}
		@Pc(139) int local139;
		if (arg4 == 1) {
			Static456.anInt7657 = 0;
			Static111.anInt2080 = (Static298.anInt4896 - Static81.anInt1607) / 2;
			Static345.anInt5723 = Static81.anInt1607;
			Static120.anInt2134 = Static421.anInt7076;
		} else if (Static18.anInt296 < 96 && Static341.anInt5549 == 0) {
			local139 = Static298.anInt4896 > 1024 ? 1024 : Static298.anInt4896;
			Static111.anInt2080 = (Static298.anInt4896 - local139) / 2;
			Static345.anInt5723 = local139;
			@Pc(157) int local157 = Static75.anInt1525 > 768 ? 768 : Static75.anInt1525;
			Static120.anInt2134 = local157;
			Static456.anInt7657 = 0;
		} else {
			Static345.anInt5723 = Static298.anInt4896;
			Static111.anInt2080 = 0;
			Static456.anInt7657 = 0;
			Static120.anInt2134 = Static75.anInt1525;
		}
		if (Static193.aClass178_9 != Static324.aClass178_18) {
			@Pc(199) boolean local199;
			if (Static345.anInt5723 < 1024 && Static120.anInt2134 < 768) {
				local199 = true;
			} else {
				local199 = false;
			}
		}
		if (arg1) {
			Static398.method4982();
		} else {
			Static391.aCanvas5.setSize(Static345.anInt5723, Static120.anInt2134);
			Static39.aClass135_1.method5363(Static391.aCanvas5);
			if (local75 == Static43.aFrame4) {
				local97 = Static43.aFrame4.getInsets();
				Static391.aCanvas5.setLocation(Static111.anInt2080 + local97.left, local97.top - -Static456.anInt7657);
			} else {
				Static391.aCanvas5.setLocation(Static111.anInt2080, Static456.anInt7657);
			}
		}
		if (arg4 < 2) {
			Static141.aBoolean166 = false;
		} else {
			Static141.aBoolean166 = true;
		}
		if (Static182.anInt3346 != -1) {
			Static31.method434(true);
		}
		if (Static338.aClass152_4 != null && Static130.method1856(Static8.anInt119)) {
			Static66.method1083();
		}
		for (local139 = 0; local139 < 100; local139++) {
			Static72.aBooleanArray7[local139] = true;
		}
		Static169.aBoolean226 = true;
	}
}
