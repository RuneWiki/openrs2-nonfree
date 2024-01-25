import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
	public static int anInt10086;

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
	public static int anInt10089;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8512(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class6_Sub2_Sub9 local13 = Static144.method2332(2, arg0);
		local13.method3723();
		local13.aString49 = arg1;
	}
}
