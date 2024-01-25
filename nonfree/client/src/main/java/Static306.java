import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
	public static int anInt5964;

	@OriginalMember(owner = "client!td", name = "M", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_56 = new Class109(64);

	@OriginalMember(owner = "client!td", name = "O", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_126 = new Class85("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!td", name = "P", descriptor = "I")
	public static int anInt5963 = 0;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "Z")
	public static boolean aBoolean497 = true;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!vg;)V")
	public static void method5347(@OriginalArg(1) Class201 arg0) {
		if (!Static54.aBoolean72) {
			return;
		}
		Static125.aClass5_Sub12_Sub2_3.method5125(34);
		Static125.aClass5_Sub12_Sub2_3.method5070(arg0.anInt6541);
		Static125.aClass5_Sub12_Sub2_3.method5095(arg0.anInt6509);
		Static125.aClass5_Sub12_Sub2_3.method5076(Static240.anInt4828);
		Static125.aClass5_Sub12_Sub2_3.method5076(arg0.anInt6548);
		Static125.aClass5_Sub12_Sub2_3.method5070(Static166.anInt3318);
		Static125.aClass5_Sub12_Sub2_3.method5076(Static137.anInt2629);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5354(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static333.aStringArray64.length; local7++) {
			if (Static333.aStringArray64[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)V")
	public static void method5357() {
		Static38.method601();
		Static297.aClass54_3 = null;
		Static291.aClass55_11 = null;
		Static342.aClass54_4 = null;
		Static88.aClass54_2 = null;
		Static42.aClass65ArrayArray1 = null;
	}
}
