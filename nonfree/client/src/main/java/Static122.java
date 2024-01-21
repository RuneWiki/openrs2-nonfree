import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1125 = Static49.method1293("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
	public static int anInt3337 = 99;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1126 = Static49.method1293("mapmarker");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2495(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static121.aClass63_1);
		arg0.removeMouseMotionListener(Static121.aClass63_1);
		arg0.removeFocusListener(Static121.aClass63_1);
		Static158.anInt4149 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V")
	public static void method2496() {
		@Pc(7) int local7 = 0;
		@Pc(10) int[] local10 = new int[Static149.anInt4001];
		for (@Pc(16) int local16 = 0; local16 < Static149.anInt4001; local16++) {
			@Pc(22) Class1_Sub1_Sub2 local22 = Static90.method1963(local16);
			if (local22.anInt169 >= 0 || local22.anInt163 >= 0) {
				local10[local7++] = local16;
			}
		}
		Static53.anIntArray174 = new int[local7];
		for (@Pc(45) int local45 = 0; local45 < local7; local45++) {
			Static53.anIntArray174[local45] = local10[local45];
		}
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
	public static void method2498() {
		aClass70_1126 = null;
		aClass70_1125 = null;
	}
}
