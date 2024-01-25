import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!ofa", name = "n", descriptor = "I")
	public static int anInt7299;

	@OriginalMember(owner = "client!ofa", name = "x", descriptor = "I")
	public static int anInt7298 = 0;

	@OriginalMember(owner = "client!ofa", name = "r", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!ofa", name = "o", descriptor = "Lclient!hfa;")
	public static final Class152 aClass152_4 = new Class152(0, 1);

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)I")
	public static int method6579(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local11;
	}
}
