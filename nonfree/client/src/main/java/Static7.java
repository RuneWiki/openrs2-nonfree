import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!b", name = "ub", descriptor = "Lclient!ae;")
	public static Class5 aClass5_2;

	@OriginalMember(owner = "client!b", name = "Nb", descriptor = "I")
	public static int anInt412;

	@OriginalMember(owner = "client!b", name = "ac", descriptor = "I")
	public static int anInt420;

	@OriginalMember(owner = "client!b", name = "H", descriptor = "Lclient!oa;")
	public static Class56 aClass56_202 = Static33.method650("headicons_pk");

	@OriginalMember(owner = "client!b", name = "O", descriptor = "Lclient!oa;")
	private static Class56 aClass56_203 = Static33.method650("Players");

	@OriginalMember(owner = "client!b", name = "T", descriptor = "Lclient!oa;")
	public static Class56 aClass56_204 = Static33.method650("Konfig geladen)3");

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
	public static int anInt375 = 0;

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_205 = Static33.method650("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!b", name = "Pb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_206 = Static33.method650("Standort");

	@OriginalMember(owner = "client!b", name = "Tb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_207 = aClass56_203;

	@OriginalMember(owner = "client!b", name = "Wb", descriptor = "[I")
	public static int[] anIntArray28 = new int[1000];

	@OriginalMember(owner = "client!b", name = "Xb", descriptor = "I")
	public static int anInt419 = -1;

	@OriginalMember(owner = "client!b", name = "Yb", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[50][];

	@OriginalMember(owner = "client!b", name = "Zb", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!b", name = "bc", descriptor = "Lclient!oa;")
	public static Class56 aClass56_208 = Static33.method650("Weiter");

	@OriginalMember(owner = "client!b", name = "j", descriptor = "(I)V")
	public static void method287() {
		aClass56_202 = null;
		anIntArray28 = null;
		Class3_Sub2.anIntArray27 = null;
		aClass56_203 = null;
		aClass56_204 = null;
		aClass56_206 = null;
		aClass56_208 = null;
		aClass56_205 = null;
		aClass5_2 = null;
		aByteArrayArray3 = null;
		aClass56_207 = null;
	}

	@OriginalMember(owner = "client!b", name = "m", descriptor = "(I)Lclient!rd;")
	public static Class22 method296() {
		try {
			return (Class22) Class.forName("Class22_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BIILclient!hf;)V")
	public static void method302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub2_Sub4_Sub1 arg2) {
		if (arg2.anInt3149 == arg0 && arg0 != -1) {
			@Pc(66) int local66 = Static41.method770(arg0).anInt864;
			if (local66 == 1) {
				arg2.anInt3143 = 0;
				arg2.anInt3175 = 0;
				arg2.anInt3144 = arg1;
				arg2.anInt3168 = 0;
			}
			if (local66 == 2) {
				arg2.anInt3168 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt3149 == -1 || Static41.method770(arg0).anInt878 >= Static41.method770(arg2.anInt3149).anInt878) {
			arg2.anInt3149 = arg0;
			arg2.anInt3143 = 0;
			arg2.anInt3168 = 0;
			arg2.anInt3175 = 0;
			arg2.anInt3144 = arg1;
			arg2.anInt3191 = arg2.anInt3146;
		}
	}
}
