import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)Z")
	public static boolean method3689() {
		try {
			return Static23.method5257();
		} catch (@Pc(14) IOException local14) {
			Static288.method3772();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static149.aClass56_102 == null ? -1 : Static149.aClass56_102.method1248()) + "," + (Static7.aClass56_7 == null ? -1 : Static7.aClass56_7.method1248()) + "," + (Static451.aClass56_267 == null ? -1 : Static451.aClass56_267.method1248()) + " - " + Static313.anInt5082 + "," + (Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray560[0] + Static365.anInt6047) + "," + (Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray559[0] + Static366.anInt6052) + " - ";
			for (@Pc(79) int local79 = 0; Static313.anInt5082 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static56.aClass4_Sub9_Sub2_1.aByteArray81[local79] + ",";
			}
			Static33.method448(local19, local77);
			Static33.method450(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Lclient!lf;")
	public static Class4_Sub2_Sub11 method3691() {
		return Static292.aClass4_Sub2_Sub11_3;
	}
}
