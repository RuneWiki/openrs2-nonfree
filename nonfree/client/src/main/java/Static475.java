import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!pba", name = "n", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_20 = new Class197(1, 2, 2, 0);

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBI)Z")
	public static boolean method6830(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(32) boolean local32 = (arg1 & 0x37) == 0 ? Static13.method212(arg0, arg1) : Static170.method2539(arg1, arg0);
		return Static561.method7806(arg0, arg1) | (arg0 & 0x10000) != 0 | local32;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V")
	public static void method6832() {
		if (Static249.aFrame1 != null) {
			return;
		}
		@Pc(11) int local11 = Static251.anInt3953;
		@Pc(13) int local13 = Static477.anInt7668;
		@Pc(20) int local20 = Static34.anInt8577 - Static151.anInt7983 - local11;
		@Pc(28) int local28 = Static121.anInt2049 - local13 - Static295.anInt4558;
		if (local11 <= 0 && local20 <= 0 && local13 <= 0 && local28 <= 0) {
			return;
		}
		try {
			@Pc(54) Container local54;
			if (Static516.aFrame2 != null) {
				local54 = Static516.aFrame2;
			} else if (Static214.anApplet1 == null) {
				local54 = Static273.anApplet_Sub1_1;
			} else {
				local54 = Static214.anApplet1;
			}
			@Pc(64) int local64 = 0;
			@Pc(66) int local66 = 0;
			if (Static516.aFrame2 == local54) {
				@Pc(72) Insets local72 = Static516.aFrame2.getInsets();
				local66 = local72.top;
				local64 = local72.left;
			}
			@Pc(81) Graphics local81 = local54.getGraphics();
			local81.setColor(Color.black);
			if (local11 > 0) {
				local81.fillRect(local64, local66, local11, Static121.anInt2049);
			}
			if (local13 > 0) {
				local81.fillRect(local64, local66, Static34.anInt8577, local13);
			}
			if (local20 > 0) {
				local81.fillRect(local64 + Static34.anInt8577 - local20, local66, local20, Static121.anInt2049);
			}
			if (local28 > 0) {
				local81.fillRect(local64, local66 + Static121.anInt2049 - local28, Static34.anInt8577, local28);
				return;
			}
		} catch (@Pc(143) Exception local143) {
			return;
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIII)Z")
	public static boolean method6833(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static23.aClass86_4.method7028(arg1, arg2, arg0, Static370.anIntArray281);
		@Pc(13) int local13 = Static370.anIntArray281[2];
		if (local13 < 50) {
			return false;
		} else {
			Static370.anIntArray281[2] = local13;
			Static370.anIntArray281[1] = Static396.anInt6520 + Static485.anInt7770 * Static370.anIntArray281[1] / local13;
			Static370.anIntArray281[0] = Static101.anInt8907 + Static370.anIntArray281[0] * Static693.anInt10661 / local13;
			return true;
		}
	}
}
