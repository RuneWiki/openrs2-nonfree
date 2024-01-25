import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static134 {

	@OriginalMember(owner = "client!efa", name = "m", descriptor = "[Lclient!s;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
	public static int anInt2231 = 0;

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "Lclient!qha;")
	public static final Class291 aClass291_12 = new Class291(4);

	@OriginalMember(owner = "client!efa", name = "k", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(II[B)I")
	public static int method1939(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static149.method2109(arg0, 0, arg1);
	}
}
