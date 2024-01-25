import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	public static int anInt366 = 0;

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "Z")
	public static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!oca;IIIIIIIIIBLclient!ffa;)V")
	public static void method366(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class100 arg10) {
		Static223.aClass237_4 = arg0;
		Static18.anInt596 = arg7;
		Static374.aClass20_3 = null;
		Static128.anInt7242 = arg6;
		Static224.anInt4555 = arg5;
		Static117.anInt2658 = arg3;
		Static15.aClass20_1 = null;
		Static366.aClass20_2 = null;
		Static451.anInt8595 = arg9;
		Static234.anInt4851 = arg1;
		Static551.anInt9903 = arg8;
		Static52.aClass100_1 = arg10;
		Static2.anInt130 = arg2;
		Static449.anInt8549 = arg4;
		Static55.method1311();
		Static271.aBoolean497 = true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIB)V")
	public static void method372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class167 local9 = Static198.aClass167ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static569.anInt10062 = local9.anInt4908;
			Static23.anInt8708 = local9.anInt4898;
			Static174.anInt3558 = local9.anInt4899;
		}
		Static481.method7380();
	}

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)Z")
	public static boolean method378() {
		try {
			if (Static178.anInt3592 == 2) {
				if (Static454.aClass3_Sub43_1 == null) {
					Static454.aClass3_Sub43_1 = Static608.method7019(Static568.aClass254_136, Static340.anInt6985, Static273.anInt5808);
					if (Static454.aClass3_Sub43_1 == null) {
						return false;
					}
				}
				if (Static451.aClass138_1 == null) {
					Static451.aClass138_1 = new Class138(Static444.aClass254_116, Static33.aClass254_15);
				}
				if (Static547.aClass3_Sub14_Sub4_3.method7827(Static451.aClass138_1, Static70.aClass254_24, Static454.aClass3_Sub43_1)) {
					Static547.aClass3_Sub14_Sub4_3.method7846();
					Static547.aClass3_Sub14_Sub4_3.method7830(Static274.anInt5814);
					Static547.aClass3_Sub14_Sub4_3.method7848(Static454.aClass3_Sub43_1, Static93.aBoolean180);
					Static568.aClass254_136 = null;
					Static178.anInt3592 = 0;
					Static451.aClass138_1 = null;
					Static454.aClass3_Sub43_1 = null;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static547.aClass3_Sub14_Sub4_3.method7834();
			Static451.aClass138_1 = null;
			Static454.aClass3_Sub43_1 = null;
			Static568.aClass254_136 = null;
			Static178.anInt3592 = 0;
		}
		return false;
	}
}
