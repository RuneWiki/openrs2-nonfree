import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_41 = new Class231("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)C")
	public static char method2480(@OriginalArg(1) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local14, 16) + " provided");
		}
		if (local14 >= 128 && local14 < 160) {
			@Pc(50) char local50 = Static99.aCharArray3[local14 - 128];
			if (local50 == '\u0000') {
				local50 = '?';
			}
			local14 = local50;
		}
		return (char) local14;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IB)V")
	public static void method2482(@OriginalArg(0) int arg0) {
		if (!Static8.aClass173_Sub1_1.aBoolean306) {
			arg0 = -1;
		}
		if (arg0 == Static420.anInt7016) {
			return;
		}
		if (arg0 != -1) {
			@Pc(27) Class138 local27 = Static187.aClass145_1.method3331(arg0);
			@Pc(31) Class77 local31 = local27.method3185();
			if (local31 == null) {
				arg0 = -1;
			} else {
				Static165.aClass103_3.method2367(local31.method1714(), local31.method1704(), Static314.aCanvas8, local31.method1706(), new Point(local27.anInt3552, local27.anInt3561));
				Static420.anInt7016 = arg0;
			}
		}
		if (arg0 == -1 && Static420.anInt7016 != -1) {
			Static165.aClass103_3.method2367(-1, -1, Static314.aCanvas8, null, new Point());
			Static420.anInt7016 = -1;
		}
	}
}
