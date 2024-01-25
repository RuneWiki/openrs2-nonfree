import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
	public static int anInt7626 = 1;

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "[[B")
	public static final byte[][] aByteArrayArray27 = new byte[1000][];

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "[I")
	public static final int[] anIntArray465 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	public static void method6612() {
		if (Static375.aFileOutputStream1 != null) {
			try {
				Static375.aFileOutputStream1.close();
			} catch (@Pc(9) IOException local9) {
			}
		}
		Static375.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B[Lclient!td;)V")
	public static void method6614(@OriginalArg(1) Class24[] arg0) {
		Static592.anInt9709 = arg0.length;
		Static167.aClass24Array8 = new Class24[Static592.anInt9709 + 10];
		Static51.anIntArray48 = new int[Static592.anInt9709 + 10];
		Static653.method6855(arg0, 0, Static167.aClass24Array8, 0, Static592.anInt9709);
		for (@Pc(26) int local26 = 0; local26 < Static592.anInt9709; local26++) {
			Static51.anIntArray48[local26] = Static167.aClass24Array8[local26].method8573();
		}
		for (@Pc(53) int local53 = Static592.anInt9709; local53 < Static167.aClass24Array8.length; local53++) {
			Static51.anIntArray48[local53] = 12;
		}
	}
}
