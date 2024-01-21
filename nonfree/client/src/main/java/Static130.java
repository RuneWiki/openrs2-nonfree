import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
	public static int anInt3174;

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "Lclient!pd;")
	public static Class20 aClass20_63;

	@OriginalMember(owner = "client!wb", name = "eb", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!wb", name = "hb", descriptor = "[Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4[] aClass4_Sub2_Sub3_Sub4Array9;

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1788 = Static28.method504("sl_arrows");

	@OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
	public static int anInt3175 = 0;

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "[I")
	public static int[] anIntArray364 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!wb", name = "fb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1790 = Static28.method504("glow2:");

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1789 = aClass39_1790;

	@OriginalMember(owner = "client!wb", name = "gb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1791 = Static28.method504("leuchten2:");

	@OriginalMember(owner = "client!wb", name = "jb", descriptor = "I")
	public static int anInt3180 = 1;

	@OriginalMember(owner = "client!wb", name = "lb", descriptor = "[I")
	public static int[] anIntArray366 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!wb", name = "mb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1792 = aClass39_1790;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	public static void method2202() {
		aClass4_Sub2_Sub3_Sub4Array9 = null;
		aClass39_1789 = null;
		aClass39_1791 = null;
		aClass39_1792 = null;
		anIntArray366 = null;
		anIntArray364 = null;
		aClass20_63 = null;
		aClass39_1788 = null;
		anIntArray365 = null;
		aClass39_1790 = null;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(B)V")
	public static void method2205() {
		@Pc(3) Class65 local3 = Static11.aClass65_1;
		synchronized (Static11.aClass65_1) {
			Static73.anInt1768 = Static59.anInt1556;
			@Pc(19) int local19;
			if (Static128.anInt3143 < 0) {
				for (local19 = 0; local19 < 112; local19++) {
					Static96.aBooleanArray11[local19] = false;
				}
				Static128.anInt3143 = Static9.anInt292;
			} else {
				while (Static128.anInt3143 != Static9.anInt292) {
					local19 = Static2.anIntArray3[Static9.anInt292];
					Static9.anInt292 = Static9.anInt292 + 1 & 0x7F;
					if (local19 < 0) {
						Static96.aBooleanArray11[~local19] = false;
					} else {
						Static96.aBooleanArray11[local19] = true;
					}
				}
			}
			Static59.anInt1556 = Static30.anInt786;
		}
	}
}
