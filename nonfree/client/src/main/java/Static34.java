import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ha", name = "ab", descriptor = "Lclient!pb;")
	public static Class40 aClass40_19;

	@OriginalMember(owner = "client!ha", name = "fb", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
	public static int anInt1310;

	@OriginalMember(owner = "client!ha", name = "sb", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_10;

	@OriginalMember(owner = "client!ha", name = "tb", descriptor = "I")
	public static int anInt1317;

	@OriginalMember(owner = "client!ha", name = "db", descriptor = "Lclient!mb;")
	public static Class38 aClass38_17 = new Class38(32);

	@OriginalMember(owner = "client!ha", name = "eb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_499 = method846("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!ha", name = "jb", descriptor = "I")
	public static int anInt1313 = 0;

	@OriginalMember(owner = "client!ha", name = "lb", descriptor = "[[I")
	public static int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!ha", name = "mb", descriptor = "[I")
	public static int[] anIntArray81 = new int[4000];

	@OriginalMember(owner = "client!ha", name = "ob", descriptor = "Lclient!rc;")
	public static Class55 aClass55_500 = method846("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ha", name = "pb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_501 = method846("@yel@*V");

	@OriginalMember(owner = "client!ha", name = "qb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_502 = method846("");

	@OriginalMember(owner = "client!ha", name = "rb", descriptor = "I")
	public static int anInt1316 = 0;

	@OriginalMember(owner = "client!ha", name = "ub", descriptor = "Lclient!rc;")
	private static Class55 aClass55_503 = method846("Cancel");

	@OriginalMember(owner = "client!ha", name = "vb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_504 = aClass55_502;

	@OriginalMember(owner = "client!ha", name = "wb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_505 = method846("@cr2@");

	@OriginalMember(owner = "client!ha", name = "xb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_506 = aClass55_502;

	@OriginalMember(owner = "client!ha", name = "yb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_507 = method846("Use");

	@OriginalMember(owner = "client!ha", name = "zb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_508 = method846("System)2Update in: ");

	@OriginalMember(owner = "client!ha", name = "Ab", descriptor = "Lclient!rc;")
	public static Class55 aClass55_509 = aClass55_502;

	@OriginalMember(owner = "client!ha", name = "Bb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_510 = aClass55_502;

	@OriginalMember(owner = "client!ha", name = "Cb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_511 = aClass55_502;

	@OriginalMember(owner = "client!ha", name = "Db", descriptor = "I")
	public static int anInt1318 = -1;

	@OriginalMember(owner = "client!ha", name = "Eb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_512 = aClass55_503;

	@OriginalMember(owner = "client!ha", name = "Fb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_513 = aClass55_507;

	@OriginalMember(owner = "client!ha", name = "Gb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_514 = aClass55_502;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!rc;")
	public static Class55 method846(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class55 local13 = new Class55();
		local13.aByteArray12 = new byte[local9];
		@Pc(19) int local19 = 0;
		while (local9 > local19) {
			@Pc(27) int local27 = local6[local19++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local19 >= local9) {
					break;
				}
				@Pc(47) int local47 = local6[local19++] & 0xFF;
				local13.aByteArray12[local13.anInt2411++] = (byte) ((local27 - 40) * 43 + local47 - 48);
			} else if (local27 != 0) {
				local13.aByteArray12[local13.anInt2411++] = (byte) local27;
			}
		}
		local13.method1650();
		return local13.method1665();
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V")
	public static void method848() {
		aClass55_501 = null;
		aClass55_507 = null;
		aClass55_508 = null;
		aClass55_504 = null;
		aClass55_511 = null;
		anIntArrayArray4 = null;
		anIntArray80 = null;
		aClass55_503 = null;
		aClass55_510 = null;
		aClass55_500 = null;
		aClass55_513 = null;
		aClass38_17 = null;
		aClass55_509 = null;
		aClass55_506 = null;
		aClass55_499 = null;
		aClass55_514 = null;
		aClass6_Sub2_Sub2_Sub1_10 = null;
		aClass55_502 = null;
		aClass40_19 = null;
		aClass55_505 = null;
		aClass55_512 = null;
		anIntArray81 = null;
	}
}
