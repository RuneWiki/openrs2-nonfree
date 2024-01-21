import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!mf", name = "eb", descriptor = "[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] aClass2_Sub1_Sub7_Sub4Array9;

	@OriginalMember(owner = "client!mf", name = "gb", descriptor = "Lclient!i;")
	public static Class2_Sub1_Sub7_Sub3_Sub1 aClass2_Sub1_Sub7_Sub3_Sub1_3;

	@OriginalMember(owner = "client!mf", name = "lb", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_15;

	@OriginalMember(owner = "client!mf", name = "mb", descriptor = "Lclient!lg;")
	public static Class8 aClass8_2;

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
	public static int anInt3165 = 0;

	@OriginalMember(owner = "client!mf", name = "cb", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_43 = new Class89(100);

	@OriginalMember(owner = "client!mf", name = "hb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_889 = Static158.method3034("To create a new account you need to");

	@OriginalMember(owner = "client!mf", name = "db", descriptor = "Lclient!ob;")
	public static Class60 aClass60_888 = aClass60_889;

	@OriginalMember(owner = "client!mf", name = "kb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_892 = Static158.method3034("Please reload this page)3");

	@OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lclient!ob;")
	public static Class60 aClass60_890 = aClass60_892;

	@OriginalMember(owner = "client!mf", name = "jb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_891 = Static158.method3034("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!mf", name = "nb", descriptor = "[I")
	public static final int[] anIntArray361 = new int[2048];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IJ)Lclient!ob;")
	public static Class60 method2492(@OriginalArg(1) long arg0) {
		return Static56.method1330(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!ob;Lclient!ob;Lclient!ob;I)V")
	public static void method2494(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class60 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static102.anIntArray339[local7] = Static102.anIntArray339[local7 - 1];
			Static88.aClass60Array16[local7] = Static88.aClass60Array16[local7 - 1];
			Static196.aClass60Array27[local7] = Static196.aClass60Array27[local7 - 1];
			Static31.aClass60Array7[local7] = Static31.aClass60Array7[local7 - 1];
		}
		Static102.anIntArray339[0] = arg3;
		Static88.aClass60Array16[0] = arg0;
		Static136.anInt3588 = Static157.anInt3990;
		Static196.aClass60Array27[0] = arg2;
		Static98.anInt2865++;
		Static31.aClass60Array7[0] = arg1;
	}
}
