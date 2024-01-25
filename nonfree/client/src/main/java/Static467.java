import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static467 {

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_227 = new Class200(82, 5);

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_180 = new Class145(13, 3);

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray8 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	public static int anInt10427 = 0;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "Lclient!fia;")
	public static final Class117 aClass117_21 = new Class117(11, 0, 1, 2);

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray114 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Z")
	public static boolean method8859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIB)V")
	public static void method8860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static566.anInt9279 = 0;
		Static392.anInt6753 = arg0;
		Static346.anInt5494 = 0;
		Static640.anInt10333 = arg1;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!nd;IIZZLclient!cea;)V")
	public static void method8861(@OriginalArg(1) Class238 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) Class2_Sub11_Sub1 arg3) {
		Static555.method7833(arg0, arg1, arg2);
		Static79.aClass2_Sub11_Sub1_1 = arg3;
	}
}
