import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2083 = Static193.method3027("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "[I")
	public static final int[] anIntArray373 = new int[50];

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	public static int anInt4208 = 0;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2085 = Static193.method3027("Walk here");

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2084 = aClass70_2085;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "[S")
	public static short[] aShortArray68 = new short[256];

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
	public static int anInt4220 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([Lclient!oc;B)Lclient!oc;")
	public static Class70 method3296(@OriginalArg(0) Class70[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static136.method1941(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ce;I)Lclient!qg;")
	public static Class30_Sub4 method3297(@OriginalArg(0) Class3_Sub4 arg0) {
		return new Class30_Sub4(arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1271(), arg0.method1278());
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!v;ZLclient!ke;ZLclient!ke;)V")
	public static void method3298(@OriginalArg(0) Class3_Sub3_Sub2_Sub4_Sub1 arg0, @OriginalArg(2) Class52 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class52 arg3) {
		Static13.aClass52_3 = arg3;
		Static27.aClass52_7 = arg1;
		Static123.aBoolean124 = arg2;
		@Pc(19) int local19 = Static27.aClass52_7.method1550() - 1;
		Static178.anInt3620 = Static27.aClass52_7.method1575(local19) + local19 * 256;
		Static166.aClass3_Sub3_Sub2_Sub4_Sub1_7 = arg0;
	}
}
