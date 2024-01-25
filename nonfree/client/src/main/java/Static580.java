import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "Lclient!lv;")
	public static Class193 aClass193_5;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "Z")
	public static boolean aBoolean671 = true;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "F")
	public static float aFloat212 = 1.0F;

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "Lclient!faa;")
	public static Class97 aClass97_26 = null;

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_123 = new Class316(76, 3);

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "[Lclient!fca;")
	public static final Class99[] aClass99Array1 = new Class99[6];

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Z")
	public static boolean aBoolean672 = false;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public static void method7914(@OriginalArg(0) int arg0) {
		Static251.anInt4609 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static547.anInt9363; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static20.anInt358; local6++) {
				if (Static113.aClass133ArrayArrayArray1[arg0][local3][local6] == null) {
					Static113.aClass133ArrayArrayArray1[arg0][local3][local6] = new Class133(arg0, local3, local6);
				}
			}
		}
	}
}
