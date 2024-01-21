import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
	public static int anInt1320;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "Lclient!id;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
	public static int anInt1321 = 0;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_524 = Static120.method1824("Loaded update list");

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Lclient!rd;")
	public static Class80 aClass80_523 = aClass80_524;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
	public static int anInt1327 = -1;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "[I")
	public static final int[] anIntArray174 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
	public static int anInt1332 = 20;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public static void method892() {
		try {
			if (Static49.anInt1089 == 1) {
				@Pc(17) int local17 = Static18.aClass3_Sub4_Sub1_1.method227();
				if (local17 > 0 && Static18.aClass3_Sub4_Sub1_1.method196()) {
					local17 -= Static52.anInt1143;
					if (local17 < 0) {
						local17 = 0;
					}
					Static18.aClass3_Sub4_Sub1_1.method229(local17);
				} else {
					Static18.aClass3_Sub4_Sub1_1.method220();
					Static18.aClass3_Sub4_Sub1_1.method208();
					Static185.aClass3_Sub25_1 = null;
					Static4.aClass72_1 = null;
					if (Static10.aClass1_1 == null) {
						Static49.anInt1089 = 0;
					} else {
						Static49.anInt1089 = 2;
					}
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static18.aClass3_Sub4_Sub1_1.method220();
			Static185.aClass3_Sub25_1 = null;
			Static49.anInt1089 = 0;
			Static10.aClass1_1 = null;
			Static4.aClass72_1 = null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)Z")
	public static boolean method893(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
