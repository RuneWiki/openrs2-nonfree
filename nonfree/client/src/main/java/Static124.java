import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!wa", name = "Bb", descriptor = "[Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array64;

	@OriginalMember(owner = "client!wa", name = "wb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!wa", name = "zb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1693 = Static33.method650("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!wa", name = "Cb", descriptor = "[I")
	public static int[] anIntArray329 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!wa", name = "Db", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1694 = Static33.method650("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!wa", name = "Eb", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!wa", name = "Ib", descriptor = "I")
	public static int anInt3085 = 0;

	@OriginalMember(owner = "client!wa", name = "Tb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1700 = Static33.method650("Loading friend list");

	@OriginalMember(owner = "client!wa", name = "Jb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1695 = aClass56_1700;

	@OriginalMember(owner = "client!wa", name = "Mb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1696 = Static33.method650("null");

	@OriginalMember(owner = "client!wa", name = "Qb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1698 = Static33.method650("Connection timed out)3");

	@OriginalMember(owner = "client!wa", name = "Nb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1697 = aClass56_1698;

	@OriginalMember(owner = "client!wa", name = "Rb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1699 = Static33.method650("@whi@ )4 ");

	@OriginalMember(owner = "client!wa", name = "Sb", descriptor = "I")
	public static int anInt3089 = 0;

	@OriginalMember(owner = "client!wa", name = "Vb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1701 = Static33.method650(" loggt sich aus)3");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!tb;Lclient!oa;Lclient!oa;Z)[Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4[] method1994(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2) {
		@Pc(8) int local8 = arg0.method1148(arg2);
		@Pc(19) int local19 = arg0.method1136(arg1, local8);
		return Static14.method247(local19, local8, arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!td;B)[I")
	public static int[] method1995(@OriginalArg(0) Class3_Sub1_Sub16 arg0) {
		@Pc(10) int local10 = arg0.anInt2817 >> 16;
		if (!Static19.method398(local10)) {
			return null;
		}
		@Pc(19) int local19 = arg0.anInt2855;
		@Pc(30) int local30 = arg0.anInt2797;
		@Pc(33) int local33 = arg0.anInt2845;
		while (local33 != -1) {
			@Pc(43) Class3_Sub1_Sub16 local43 = Static31.aClass3_Sub1_Sub16ArrayArray1[local10][local33 & 0xFFFF];
			local33 = local43.anInt2845;
			local30 += local43.anInt2797 - local43.anInt2806;
			local19 += local43.anInt2855 - local43.anInt2842;
		}
		return new int[] { local19, local30 };
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
	public static void method1996() {
		anIntArray329 = null;
		aClass56_1697 = null;
		aClass56_1695 = null;
		aClass56_1698 = null;
		aClass56_1700 = null;
		aClass3_Sub1_Sub1_Sub4Array64 = null;
		aClass56_1694 = null;
		aBigInteger3 = null;
		aClass56_1701 = null;
		aClass56_1693 = null;
		aClass56_1696 = null;
		aClass56_1699 = null;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
	public static void method1998() {
		if (Static36.anInt1019 == 104) {
			@Pc(16) int local16;
			if (Static35.anInt996 == -1) {
				local16 = Static77.anInt3134;
			} else {
				local16 = Static35.anInt996;
			}
			if (Static35.anInt996 != Static77.anInt3134) {
				local16--;
				if (local16 < 0) {
					local16 = 19;
				}
				if (Static22.aClass56Array1[local16] != null) {
					Static122.aClass56_1629 = Static22.aClass56Array1[local16];
					Static12.aBoolean17 = true;
					Static35.anInt996 = local16;
				}
			}
		}
		if (Static36.anInt1019 != 105 || Static35.anInt996 == -1) {
			return;
		}
		Static35.anInt996++;
		if (Static35.anInt996 >= 20) {
			Static35.anInt996 = 0;
		}
		if (Static35.anInt996 == Static77.anInt3134) {
			Static122.aClass56_1629 = Static122.aClass56_1633;
			Static35.anInt996 = -1;
			Static12.aBoolean17 = true;
		} else if (Static22.aClass56Array1[Static35.anInt996] != null) {
			Static122.aClass56_1629 = Static22.aClass56Array1[Static35.anInt996];
			Static12.aBoolean17 = true;
		}
	}
}
