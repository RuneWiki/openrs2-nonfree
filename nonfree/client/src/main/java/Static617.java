import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas13;

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
	public static int anInt9920 = -1;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)I")
	public static int method8423() {
		return Static424.anInt7715 == 1 ? Static606.anInt9796 : Static15.anInt239;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(FB)F")
	public static float method8424(@OriginalArg(0) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
	public static void method8426() {
		Static602.aClass28_1.method8220();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static214.aLongArray7[local10] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static33.aLongArray2[local30] = 0L;
		}
		Static420.anInt7405 = 0;
	}
}
