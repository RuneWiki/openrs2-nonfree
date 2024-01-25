import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static332 {

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
	public static int anInt5657;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
	public static int anInt5659;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_69 = new Class179(41, 3);

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V")
	public static void method4699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static366.anInt6017 = arg2;
		Static86.anInt1853 = arg1;
		Static203.anInt5096 = arg0;
		Static345.anInt5807 = arg3;
	}
}
