import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array26;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "Lclient!tb;")
	public static Class44 aClass44_24;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "Lclient!md;")
	public static Class30 aClass30_7;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "[I")
	public static int[] anIntArray78;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!oa;")
	private static Class56 aClass56_692 = Static33.method650("Invalid username or password)3");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_690 = aClass56_692;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!oa;")
	private static Class56 aClass56_691 = Static33.method650("You have only just left another world)3");

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public static int anInt1154 = 0;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	public static int anInt1156 = 0;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!n;")
	public static Class52 aClass52_26 = new Class52(100);

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!oa;")
	public static Class56 aClass56_693 = aClass56_691;

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "[I")
	public static int[] anIntArray77 = new int[128];

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
	public static int anInt1162 = 0;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "J")
	public static long aLong32 = 0L;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
	public static int anInt1163 = 0;

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "[I")
	public static int[] anIntArray79 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "[[I")
	public static int[][] anIntArrayArray10 = new int[104][104];

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "Lclient!oa;")
	public static Class56 aClass56_694 = Static33.method650("@cr2@");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method806() {
		aClass3_Sub1_Sub1_Sub4Array26 = null;
		anIntArray79 = null;
		aClass30_7 = null;
		aClass56_692 = null;
		anIntArray78 = null;
		anIntArrayArray9 = null;
		anIntArrayArray10 = null;
		aClass52_26 = null;
		anIntArray77 = null;
		aClass44_24 = null;
		aClass56_690 = null;
		aClass56_694 = null;
		aClass56_693 = null;
		aClass56_691 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method807() {
		Static48.aClass3_Sub3_Sub2_2.method1235();
		Static57.anInt1621 = 1;
		Static47.aClass44_30 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!td;Lclient!td;III)Lclient!td;")
	public static Class3_Sub1_Sub16 method808(@OriginalArg(0) Class3_Sub1_Sub16 arg0, @OriginalArg(1) Class3_Sub1_Sub16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) Class3_Sub1_Sub16 local25 = Static56.method1060(0, arg1.anInt2827, arg0, arg3, 0, 0, Static31.aClass3_Sub1_Sub16ArrayArray1[arg1.anInt2817 >> 16], arg1.anInt2817, arg2, 0, arg1.anInt2854);
		if (local25 == null) {
			if (arg1.aClass3_Sub1_Sub16Array2 != null) {
				local25 = Static56.method1060(0, arg1.anInt2827, arg0, arg3, 0, 0, arg1.aClass3_Sub1_Sub16Array2, arg1.anInt2817, arg2, 0, arg1.anInt2854);
			}
			return local25;
		} else {
			return local25;
		}
	}
}
