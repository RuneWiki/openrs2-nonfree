import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
	public static int anInt3195;

	@OriginalMember(owner = "client!fca", name = "s", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
	public static int anInt3184 = 16777215;

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_52 = new Class359(15, 4);

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V")
	public static void method2806() {
		if (Static27.aClass347ArrayArray1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static27.aClass347ArrayArray1.length; local12++) {
			for (@Pc(15) int local15 = 0; local15 < Static27.aClass347ArrayArray1[local12].length; local15++) {
				Static27.aClass347ArrayArray1[local12][local15] = Static67.aClass347_1;
			}
		}
	}
}
