import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Lclient!la;")
	public static final Class136 aClass136_130 = new Class136(61, 4);

	@OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
	public static final int[] anIntArray310 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!o", name = "f", descriptor = "I")
	public static int anInt4612 = 0;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[8];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Z")
	public static boolean method3812() {
		try {
			if (Static63.anInt7101 == 2) {
				if (Static155.aClass3_Sub37_1 == null) {
					Static155.aClass3_Sub37_1 = Static470.method4383(Static395.aClass250_95, Static88.anInt1592, Static107.anInt1917);
					if (Static155.aClass3_Sub37_1 == null) {
						return false;
					}
				}
				if (Static314.aClass67_1 == null) {
					Static314.aClass67_1 = new Class67(Static277.aClass250_69, Static406.aClass250_97);
				}
				if (Static407.aClass3_Sub1_Sub4_3.method6306(Static155.aClass3_Sub37_1, Static160.aClass250_47, Static314.aClass67_1)) {
					Static407.aClass3_Sub1_Sub4_3.method6307();
					Static407.aClass3_Sub1_Sub4_3.method6305(Static28.anInt494);
					Static407.aClass3_Sub1_Sub4_3.method6325(Static134.aBoolean185, Static155.aClass3_Sub37_1);
					Static395.aClass250_95 = null;
					Static63.anInt7101 = 0;
					Static155.aClass3_Sub37_1 = null;
					Static314.aClass67_1 = null;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static407.aClass3_Sub1_Sub4_3.method6317();
			Static63.anInt7101 = 0;
			Static155.aClass3_Sub37_1 = null;
			Static395.aClass250_95 = null;
			Static314.aClass67_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!mk;)Z")
	public static boolean method3819(@OriginalArg(1) Class152 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean316) {
			return false;
		} else if (!arg0.method3608(Static211.anInterface6_2)) {
			return false;
		} else if (Static221.aClass140_35.method3490((long) arg0.anInt4343) == null) {
			return Static419.aClass140_36.method3490((long) arg0.anInt4347) == null;
		} else {
			return false;
		}
	}
}
