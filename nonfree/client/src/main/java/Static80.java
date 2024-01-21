import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_54;

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "[Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array8;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "[Lclient!f;")
	public static Class4_Sub7[] aClass4_Sub7Array2;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "Lclient!ea;")
	public static Class20 aClass20_41;

	@OriginalMember(owner = "client!oa", name = "G", descriptor = "J")
	public static long aLong68;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "J")
	public static long aLong69;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_55;

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Lclient!ec;")
	private static Class22 aClass22_626 = Static60.method1113("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
	public static int anInt2197 = 0;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "[I")
	public static int[] anIntArray223 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "[I")
	public static int[] anIntArray224 = new int[] { 45, 23, 50, 29, 44, 48, 16, 6 };

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	public static int anInt2200 = 0;

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "Lclient!ec;")
	public static Class22 aClass22_627 = Static60.method1113("Wordpack geladen)3");

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_628 = aClass22_626;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ea;I)V")
	public static void method1446(@OriginalArg(0) Class20 arg0) {
		Static42.aClass20_20 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!wf;")
	public static RuntimeException_Sub1 method1447(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString5 = local9.aString5 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public static void method1448() {
		aClass20_Sub1_54 = null;
		aClass22_626 = null;
		anIntArray224 = null;
		aClass22_627 = null;
		aClass20_41 = null;
		aClass20_Sub1_55 = null;
		anIntArray225 = null;
		aClass4_Sub1_Sub2_Sub3Array8 = null;
		anIntArray223 = null;
		aClass22_628 = null;
		aClass4_Sub1_Sub2_Sub3_4 = null;
		aClass4_Sub7Array2 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)I")
	public static int method1450(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
