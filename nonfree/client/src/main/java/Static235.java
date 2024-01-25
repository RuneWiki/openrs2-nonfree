import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Lclient!uh;")
	public static Class201 aClass201_12;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!tj;")
	public static Class122 aClass122_9;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray25 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_44 = new Class198(8);

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public static int anInt4718 = -1;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public static int anInt4719 = 0;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "[B")
	public static final byte[] aByteArray77 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "[I")
	public static final int[] anIntArray377 = new int[250];

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public static void method4016() {
		@Pc(5) Class214 local5 = Static196.aClass214_1;
		synchronized (Static196.aClass214_1) {
			Static196.aClass214_1.method5654();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(CB)Z")
	public static boolean method4017(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
