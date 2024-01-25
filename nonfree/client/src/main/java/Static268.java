import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!rd", name = "pb", descriptor = "I")
	public static int anInt5477 = 0;

	@OriginalMember(owner = "client!rd", name = "sb", descriptor = "[I")
	public static final int[] anIntArray459 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public static void method4708(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg0, 11);
		local8.method1868();
	}
}
