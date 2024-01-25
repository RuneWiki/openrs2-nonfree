import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qha", name = "h", descriptor = "I")
	public static int anInt8296;

	@OriginalMember(owner = "client!qha", name = "j", descriptor = "D")
	public static double aDouble12;

	@OriginalMember(owner = "client!qha", name = "k", descriptor = "I")
	public static int anInt8298;

	@OriginalMember(owner = "client!qha", name = "g", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_94 = new Class185(60, 7);

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)V")
	public static void method6954() {
		if (Static224.aFrame5 != null) {
			return;
		}
		@Pc(10) int local10 = Static184.anInt4050;
		@Pc(12) int local12 = Static354.anInt6878;
		@Pc(20) int local20 = Static351.anInt6858 - Static294.anInt6026 - local10;
		@Pc(28) int local28 = Static59.anInt1894 - Static277.anInt5899 - local12;
		if (local10 <= 0 && local20 <= 0 && local12 <= 0 && local28 <= 0) {
			return;
		}
		try {
			@Pc(47) Container local47;
			if (Static500.aFrame9 != null) {
				local47 = Static500.aFrame9;
			} else if (Static635.anApplet2 == null) {
				local47 = Static560.anApplet_Sub1_1;
			} else {
				local47 = Static635.anApplet2;
			}
			@Pc(59) int local59 = 0;
			@Pc(61) int local61 = 0;
			if (Static500.aFrame9 == local47) {
				@Pc(67) Insets local67 = Static500.aFrame9.getInsets();
				local59 = local67.left;
				local61 = local67.top;
			}
			@Pc(76) Graphics local76 = local47.getGraphics();
			local76.setColor(Color.black);
			if (local10 > 0) {
				local76.fillRect(local59, local61, local10, Static59.anInt1894);
			}
			if (local12 > 0) {
				local76.fillRect(local59, local61, Static351.anInt6858, local12);
			}
			if (local20 > 0) {
				local76.fillRect(Static351.anInt6858 + local59 - local20, local61, local20, Static59.anInt1894);
			}
			if (local28 > 0) {
				local76.fillRect(local59, local61 + Static59.anInt1894 - local28, Static351.anInt6858, local28);
				return;
			}
		} catch (@Pc(127) Exception local127) {
			return;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IC)C")
	public static char method6955(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ZIII)I")
	public static int method6957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 <= arg2) {
			return arg0 >= arg2 ? arg2 : arg0;
		} else {
			return arg1;
		}
	}
}
