import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!afa", name = "jb", descriptor = "I")
	public static int anInt224;

	@OriginalMember(owner = "client!afa", name = "db", descriptor = "Lclient!bda;")
	public static final Class34 aClass34_6 = new Class34();

	@OriginalMember(owner = "client!afa", name = "P", descriptor = "[Ljava/awt/Color;")
	public static Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!afa", name = "nb", descriptor = "I")
	public static int anInt223 = -1;

	@OriginalMember(owner = "client!afa", name = "ob", descriptor = "[Lclient!oga;")
	public static Class260_Sub1[] aClass260_Sub1Array1 = new Class260_Sub1[37];

	@OriginalMember(owner = "client!afa", name = "l", descriptor = "(I)Lclient!co;")
	public static Class5_Sub8 method236() {
		if (Static629.aClass102_69 == null || Static589.aClass238_1 == null) {
			return null;
		}
		for (@Pc(26) Class5_Sub8 local26 = (Class5_Sub8) Static589.aClass238_1.method5466(); local26 != null; local26 = (Class5_Sub8) Static589.aClass238_1.method5466()) {
			@Pc(34) Class315 local34 = Static629.aClass33_4.method657(local26.anInt1429);
			if (local34 != null && local34.aBoolean671 && local34.method7598(Static629.anInterface7_2)) {
				return local26;
			}
		}
		return null;
	}
}
