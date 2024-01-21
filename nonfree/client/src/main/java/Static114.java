import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static114 {

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "Lclient!hg;")
	public static Class2_Sub2_Sub3_Sub4_Sub1 aClass2_Sub2_Sub3_Sub4_Sub1_6;

	@OriginalMember(owner = "client!oe", name = "jb", descriptor = "[I")
	public static int[] anIntArray432;

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1066 = Static146.method2172("Create a free account");

	@OriginalMember(owner = "client!oe", name = "db", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1067 = Static146.method2172("mod_icons");

	@OriginalMember(owner = "client!oe", name = "fb", descriptor = "J")
	public static long aLong92 = 0L;

	@OriginalMember(owner = "client!oe", name = "ib", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1068 = aClass77_1066;

	@OriginalMember(owner = "client!oe", name = "kb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1069 = Static146.method2172("nav");

	@OriginalMember(owner = "client!oe", name = "lb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1070 = Static146.method2172("<col=c0ff00>");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!qf;B)V")
	public static void method2018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2) {
		if (Static34.aClass66_5 != null || Static166.aBoolean181 || (arg2 == null || Static143.method2428(arg2) == null)) {
			return;
		}
		Static34.aClass66_5 = arg2;
		Static158.aClass66_13 = Static143.method2428(arg2);
		Static40.anInt1150 = arg1;
		Static27.anInt827 = 0;
		Static150.anInt3698 = arg0;
		Static7.aBoolean8 = false;
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
	public static void method2019() {
		aClass2_Sub2_Sub3_Sub4_Sub1_6 = null;
		aClass77_1066 = null;
		aClass77_1069 = null;
		aClass77_1067 = null;
		aClass77_1068 = null;
		anIntArray432 = null;
		aClass77_1070 = null;
	}
}
