import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!os", name = "c", descriptor = "I")
	public static int anInt4502;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "I")
	public static int anInt4503;

	@OriginalMember(owner = "client!os", name = "g", descriptor = "I")
	public static int anInt4505;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!os", name = "f", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_99 = new Class205(8, 1);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Z")
	public static boolean method3995(@OriginalArg(1) int arg0) {
		Static367.aBoolean440 = true;
		Static48.anInt968 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZ)V")
	public static void method3996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub10_Sub2 local12 = Static217.method3611(arg0, 7);
		local12.method864();
		local12.anInt1037 = arg1;
	}
}
