import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
	public static int[] anIntArray684;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "[I")
	public static final int[] anIntArray683 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_368 = new Class305(53, 6);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)V")
	public static void method6304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(13, arg1);
		local8.method6693();
		local8.anInt7487 = arg0;
	}
}
