import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!h", name = "ob", descriptor = "Lclient!fc;")
	public static Class21 aClass21_9;

	@OriginalMember(owner = "client!h", name = "pb", descriptor = "Lclient!md;")
	public static Class40_Sub1 aClass40_Sub1_15;

	@OriginalMember(owner = "client!h", name = "Db", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!h", name = "Ib", descriptor = "I")
	public static int anInt1274;

	@OriginalMember(owner = "client!h", name = "Lb", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_9;

	@OriginalMember(owner = "client!h", name = "tb", descriptor = "I")
	public static int anInt1267 = -1;

	@OriginalMember(owner = "client!h", name = "vb", descriptor = "Lclient!le;")
	public static Class36 aClass36_15 = new Class36(64);

	@OriginalMember(owner = "client!h", name = "Ab", descriptor = "Lclient!rc;")
	private static Class55 aClass55_479 = Static34.method846("red:");

	@OriginalMember(owner = "client!h", name = "Bb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_480 = Static34.method846("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!h", name = "Eb", descriptor = "Lclient!le;")
	public static Class36 aClass36_16 = new Class36(64);

	@OriginalMember(owner = "client!h", name = "Fb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_481 = Static34.method846("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!h", name = "Gb", descriptor = "Z")
	public static boolean aBoolean57 = true;

	@OriginalMember(owner = "client!h", name = "Pb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_485 = Static34.method846("Attack");

	@OriginalMember(owner = "client!h", name = "Kb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_482 = aClass55_485;

	@OriginalMember(owner = "client!h", name = "Mb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_483 = aClass55_479;

	@OriginalMember(owner = "client!h", name = "Ob", descriptor = "Lclient!rc;")
	public static Class55 aClass55_484 = Static34.method846("Handel akzeptieren");

	@OriginalMember(owner = "client!h", name = "Qb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_486 = aClass55_481;

	@OriginalMember(owner = "client!h", name = "Sb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_487 = Static34.method846("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V")
	public static void method826() {
		aClass36_16 = null;
		aClass6_Sub2_Sub2_Sub1_9 = null;
		aClass55_479 = null;
		aClass36_15 = null;
		aFontMetrics1 = null;
		aClass55_484 = null;
		aClass40_Sub1_15 = null;
		aClass55_485 = null;
		aClass55_486 = null;
		aClass55_481 = null;
		aClass55_480 = null;
		aClass21_9 = null;
		aClass55_487 = null;
		aClass55_483 = null;
		aClass55_482 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)I")
	public static int method828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16 = 65536 - Class6_Sub2_Sub2_Sub3.anIntArray73[arg0 * 1024 / arg3] >> 1;
		return (local16 * arg1 >> 16) + (arg2 * (65536 - local16) >> 16);
	}
}
