import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!n", name = "b", descriptor = "[I")
	public static final int[] anIntArray524 = new int[5];

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1741 = Static120.method1824(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1742 = Static120.method1824("Loading textures )2 ");

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1743 = aClass80_1742;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1744 = Static120.method1824("cookieprefix");

	@OriginalMember(owner = "client!n", name = "k", descriptor = "I")
	public static int anInt4478 = 0;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "I")
	public static int anInt4479 = 0;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1745 = Static120.method1824("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	public static int anInt4481 = 0;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1746 = Static120.method1824("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!qf;)V")
	public static void method3158(@OriginalArg(1) Class77 arg0) {
		@Pc(11) int local11 = arg0.anInt3256;
		if (local11 == 324) {
			if (Static2.anInt87 == -1) {
				Static5.anInt206 = arg0.anInt3191;
				Static2.anInt87 = arg0.anInt3227;
			}
			if (Static171.aClass55_1.aBoolean88) {
				arg0.anInt3227 = Static2.anInt87;
			} else {
				arg0.anInt3227 = Static5.anInt206;
			}
		} else if (local11 == 325) {
			if (Static2.anInt87 == -1) {
				Static2.anInt87 = arg0.anInt3227;
				Static5.anInt206 = arg0.anInt3191;
			}
			if (Static171.aClass55_1.aBoolean88) {
				arg0.anInt3227 = Static5.anInt206;
			} else {
				arg0.anInt3227 = Static2.anInt87;
			}
		} else if (local11 == 327) {
			arg0.anInt3232 = 150;
			arg0.anInt3225 = (int) (Math.sin((double) Static193.anInt4411 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3253 = -1;
			arg0.anInt3212 = 5;
		} else if (local11 == 328) {
			if (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.aClass80_1689 == null) {
				arg0.anInt3253 = 0;
			} else {
				arg0.anInt3232 = 150;
				arg0.anInt3225 = (int) (Math.sin((double) Static193.anInt4411 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3212 = 5;
				arg0.anInt3253 = ((int) Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.aClass80_1689.method2441() << 11) + 2047;
				arg0.anInt3211 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4304;
				arg0.anInt3250 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4285;
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
	public static boolean method3161(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}
}
