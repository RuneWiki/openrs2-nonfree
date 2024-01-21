import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static54 {

	@OriginalMember(owner = "client!jc", name = "cb", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "Lclient!b;")
	public static Class3_Sub2 aClass3_Sub2_3 = new Class3_Sub2(new byte[5000]);

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "Lclient!oa;")
	public static Class56 aClass56_868 = Static33.method650("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "[B")
	public static byte[] aByteArray15 = new byte[520];

	@OriginalMember(owner = "client!jc", name = "X", descriptor = "[I")
	public static int[] anIntArray108 = new int[2048];

	@OriginalMember(owner = "client!jc", name = "Y", descriptor = "Lclient!oa;")
	public static Class56 aClass56_869 = Static33.method650("Spieler");

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "Lclient!oa;")
	public static Class56 aClass56_870 = Static33.method650("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "[Lclient!oa;")
	public static Class56[] aClass56Array5 = new Class56[100];

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_871 = Static33.method650("Angreifen");

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
	public static int anInt1548 = 0;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	public static void method1009() {
		Static59.aClass52_35.method1346();
		Static44.aClass52_26.method1346();
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
	public static void method1012() {
		aClass3_Sub2_3 = null;
		aByteArray15 = null;
		anIntArray108 = null;
		aClass56_869 = null;
		aClass56_870 = null;
		aClass56Array5 = null;
		aClass56_871 = null;
		anIntArray109 = null;
		aClass56_868 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method1013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static19.method398(arg1)) {
			Static27.method557(arg3, 0, arg5, Static31.aClass3_Sub1_Sub16ArrayArray1[arg1], arg6, arg7, -1, arg0, arg4, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	public static void method1014() {
		Static20.aBoolean28 = true;
		Static77.aBoolean169 = true;
	}
}
