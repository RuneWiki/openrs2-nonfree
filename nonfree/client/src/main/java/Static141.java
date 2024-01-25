import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static141 {

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "Lclient!ga;")
	public static Class111 aClass111_32;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
	public static int anInt2722 = -1;

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
	public static int anInt2724 = 0;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)V")
	public static void method2305(@OriginalArg(1) int arg0) {
		Static123.anIntArray152 = new int[arg0];
		Static399.anIntArray474 = new int[arg0];
		Static378.anIntArray446 = new int[arg0];
		Static179.anIntArray187 = new int[arg0];
		Static506.anIntArray581 = new int[arg0];
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!i;)V")
	public static void method2306(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1) {
		Static20.aClass17Array1[arg0] = arg1;
	}
}
