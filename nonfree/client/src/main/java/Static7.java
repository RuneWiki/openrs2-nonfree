import java.awt.Image;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "Lclient!rj;")
	public static Class293 aClass293_1;

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_1 = new Class73(81, 4);

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
	public static int anInt464 = 100;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
	public static void method448() {
		if (Static30.anInt830 == -1) {
			return;
		}
		@Pc(12) int local12 = Static6.aClass96_1.method8026();
		@Pc(16) int local16 = Static6.aClass96_1.method8019();
		@Pc(21) Class6_Sub22 local21 = (Class6_Sub22) Static313.aClass163_35.method4966();
		if (local21 != null) {
			local12 = local21.method3462();
			local16 = local21.method3458();
		}
		@Pc(33) int local33 = 0;
		@Pc(40) int local40 = 0;
		if (Static238.aBoolean425) {
			local33 = Static352.method5739();
			local40 = Static573.method7997();
		}
		Static120.method2564(local33 + local12, local40, Static30.anInt830, local33 + Static294.anInt6026, Static277.anInt5899 + local40, local33, local12, local16, local40 + local16, local40, local33);
		if (Static23.aClass302_1 != null) {
			Static225.method4381(local12 + local33, local40 + local16);
		}
	}
}
