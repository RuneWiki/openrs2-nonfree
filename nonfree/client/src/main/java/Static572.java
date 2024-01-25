import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
	public static int[] anIntArray485;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!ed;")
	public static final Class93 aClass93_23 = new Class93(9, 0, 4, 1);

	@OriginalMember(owner = "client!te", name = "k", descriptor = "I")
	public static int anInt9223 = -1;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method7506() {
		@Pc(14) Class3_Sub33 local14;
		for (local14 = (Class3_Sub33) Static346.aClass302_39.method6603(); local14 != null; local14 = (Class3_Sub33) Static346.aClass302_39.method6605()) {
			Static26.method596(false, local14);
		}
		for (local14 = (Class3_Sub33) Static153.aClass302_15.method6603(); local14 != null; local14 = (Class3_Sub33) Static153.aClass302_15.method6605()) {
			Static26.method596(true, local14);
		}
	}
}
