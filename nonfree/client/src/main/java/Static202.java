import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "Lclient!ln;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
	public static int anInt4324 = 0;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_67 = new Class287(9, -1);

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!sp;)V")
	public static void method3488(@OriginalArg(1) Class25_Sub2_Sub2_Sub5_Sub2 arg0) {
		for (@Pc(10) Class3_Sub30 local10 = (Class3_Sub30) Static483.aClass244_60.method5572(); local10 != null; local10 = (Class3_Sub30) Static483.aClass244_60.method5576()) {
			if (arg0 == local10.aClass25_Sub2_Sub2_Sub5_Sub2_1) {
				if (local10.aClass3_Sub16_Sub2_2 != null) {
					Static354.aClass3_Sub16_Sub4_2.method7757(local10.aClass3_Sub16_Sub2_2);
					local10.aClass3_Sub16_Sub2_2 = null;
				}
				local10.method8128();
				return;
			}
		}
	}
}
