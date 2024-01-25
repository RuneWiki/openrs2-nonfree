import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_81 = new Class363(6, 6);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)Z")
	public static boolean method2408() {
		try {
			return Static191.method3208();
		} catch (@Pc(14) IOException local14) {
			Static530.method7282();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static497.aClass363_245 == null ? -1 : Static497.aClass363_245.method7961()) + "," + (Static329.aClass363_162 == null ? -1 : Static329.aClass363_162.method7961()) + "," + (Static261.aClass363_230 == null ? -1 : Static261.aClass363_230.method7961()) + " - " + Static65.anInt1500 + "," + (Static35.anInt906 + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray510[0]) + "," + (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray509[0] + Static130.anInt5246) + " - ";
			for (@Pc(79) int local79 = 0; Static65.anInt1500 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static133.aClass2_Sub15_Sub2_1.aByteArray62[local79] + ",";
			}
			Static58.method946(local77, local19);
			Static295.method7108(false);
			return true;
		}
	}
}
