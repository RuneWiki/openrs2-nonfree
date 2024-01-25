import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!su", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!su", name = "s", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!su", name = "t", descriptor = "Lclient!jv;")
	public static Class142 aClass142_6;

	@OriginalMember(owner = "client!su", name = "b", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_112 = new Class15("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!su", name = "o", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_87 = new Class146(5, -1);

	@OriginalMember(owner = "client!su", name = "p", descriptor = "Lclient!be;")
	public static final Class21 aClass21_4 = new Class21(1);

	@OriginalMember(owner = "client!su", name = "q", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_113 = new Class15("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!su", name = "r", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_228 = new Class56(103, 6);

	@OriginalMember(owner = "client!su", name = "u", descriptor = "I")
	public static int anInt6137 = 0;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
	public static void method4922() {
		@Pc(7) int local7 = Static438.anInt2796;
		@Pc(9) int[] local9 = Static78.anIntArray114;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class8_Sub3_Sub1_Sub1 local19 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static148.method2077(local19.method5894(), local19);
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIZI[BILclient!ug;)Lclient!nq;")
	public static Class65_Sub2_Sub1 method4925(@OriginalArg(0) int arg0, @OriginalArg(5) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class135_Sub2 arg3) {
		if (arg3.aBoolean473 || Static280.method3692(arg0) && Static280.method3692(arg2)) {
			return new Class65_Sub2_Sub1(arg3, 3553, 6406, arg0, arg2, false, arg1, 6406);
		} else if (arg3.aBoolean479) {
			return new Class65_Sub2_Sub1(arg3, 34037, 6406, arg0, arg2, false, arg1, 6406);
		} else {
			return new Class65_Sub2_Sub1(arg3, 6406, arg0, arg2, Static171.method2382(arg0), Static171.method2382(arg2), arg1, 6406);
		}
	}
}
