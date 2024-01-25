import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!sba;")
	public static Class300 aClass300_10;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray38;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
	public static int anInt8689;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public static int anInt8691;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString94 = null;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!gj;")
	public static Class124 aClass124_58 = new Class124();

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!ob;")
	public static final Class247 aClass247_6 = new Class247();

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method7143() {
		Static397.method5793((long) Static237.anInt7561, Static185.aClass66_14);
		if (Static249.anInt4945 != -1) {
			Static421.method7824(Static249.anInt4945);
		}
		for (@Pc(27) int local27 = 0; local27 < Static433.anInt7419; local27++) {
			if (Static271.aBooleanArray21[local27]) {
				Static424.aBooleanArray30[local27] = true;
			}
			Static231.aBooleanArray19[local27] = Static271.aBooleanArray21[local27];
			Static271.aBooleanArray21[local27] = false;
		}
		Static412.anInt7139 = Static237.anInt7561;
		if (Static185.aClass66_14.method6834()) {
			Static309.aBoolean424 = true;
		}
		if (Static249.anInt4945 != -1) {
			Static433.anInt7419 = 0;
			Static444.method6279();
		}
		Static185.aClass66_14.F();
		Static430.method6122(Static185.aClass66_14);
		@Pc(77) int local77 = Static268.method4361();
		if (local77 == -1) {
			local77 = Static485.anInt8162;
		}
		if (local77 == -1) {
			local77 = Static514.anInt8838;
		}
		Static436.method6199(local77);
		Static426.anInt7338 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I")
	public static int method7144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(31) int local31 = arg0 * (arg1 & 0x7F) + local17 * (arg2 & 0x7F) >> 7;
		@Pc(46) int local46 = (arg2 & 0x380) * local17 + (arg1 & 0x380) * arg0 >> 7;
		@Pc(65) int local65 = arg0 * (arg1 & 0xFC00) + (arg2 & 0xFC00) * local17 >> 7;
		return local31 & 0x7F | local46 & 0x380 | local65 & 0xFC00;
	}
}
