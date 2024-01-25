import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static632 {

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
	public static int anInt10405;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
	public static int anInt10408;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
	public static void method8552(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static199.anInt4633 == 2) {
				Static443.aClass249Array1[0].method6428(Static162.aClass56Array1[0]);
				Static443.aClass249Array1[1].method6428(Static162.aClass56Array1[1]);
			} else if (Static199.anInt4633 == 3) {
				Static443.aClass249Array1[0].method6428(Static162.aClass56Array1[0]);
				Static443.aClass249Array1[1].method6428(Static162.aClass56Array1[1]);
				Static443.aClass249Array1[2].method6428(Static162.aClass56Array1[2]);
			} else {
				Static443.aClass249Array1[0].method6428(Static162.aClass56Array1[0]);
				Static443.aClass249Array1[1].method6428(Static162.aClass56Array1[1]);
				Static443.aClass249Array1[2].method6428(Static162.aClass56Array1[2]);
				Static443.aClass249Array1[3].method6428(Static162.aClass56Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static199.anInt4633 == 2) {
				Static443.aClass249Array1[0].method6428(Static162.aClass56Array1[2]);
			} else if (Static199.anInt4633 == 3) {
				Static443.aClass249Array1[0].method6428(Static162.aClass56Array1[3]);
				Static443.aClass249Array1[1].method6428(Static162.aClass56Array1[4]);
			} else {
				Static443.aClass249Array1[0].method6428(Static162.aClass56Array1[4]);
				Static443.aClass249Array1[1].method6428(Static162.aClass56Array1[5]);
				Static443.aClass249Array1[2].method6428(Static162.aClass56Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static199.anInt4633 == 2) {
				Static443.aClass249Array1[0].method6428(Static162.aClass56Array1[3]);
				return;
			}
			if (Static199.anInt4633 == 3) {
				Static443.aClass249Array1[0].method6428(Static162.aClass56Array1[5]);
				return;
			}
			Static443.aClass249Array1[0].method6428(Static162.aClass56Array1[7]);
		}
	}
}
