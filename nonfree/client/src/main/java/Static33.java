import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "Lclient!nf;")
	public static Class4_Sub1_Sub2_Sub4_Sub1 aClass4_Sub1_Sub2_Sub4_Sub1_2;

	@OriginalMember(owner = "client!fb", name = "Q", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_22;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!ec;")
	public static Class22 aClass22_221 = Static60.method1113("<col=ff9040>");

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "Lclient!ec;")
	private static Class22 aClass22_225 = Static60.method1113("Members object");

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Lclient!ec;")
	public static Class22 aClass22_222 = aClass22_225;

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "Lclient!ec;")
	private static Class22 aClass22_223 = Static60.method1113("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "Lclient!ec;")
	private static Class22 aClass22_229 = Static60.method1113("green:");

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!ec;")
	public static Class22 aClass22_224 = aClass22_229;

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "Lclient!pe;")
	public static Class57 aClass57_1 = new Class57();

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "Lclient!ec;")
	public static Class22 aClass22_226 = Static60.method1113("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "Lclient!ec;")
	public static Class22 aClass22_227 = Static60.method1113("(U2");

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array6 = new Class22[8];

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "Lclient!ec;")
	public static Class22 aClass22_228 = aClass22_223;

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "[I")
	public static int[] anIntArray93 = new int[1000];

	@OriginalMember(owner = "client!fb", name = "L", descriptor = "Lclient!ec;")
	public static Class22 aClass22_230 = aClass22_229;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "Lclient!ld;")
	public static Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!fb", name = "N", descriptor = "Lclient!ec;")
	public static Class22 aClass22_231 = Static60.method1113("(U4");

	@OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
	public static int anInt842 = 0;

	@OriginalMember(owner = "client!fb", name = "P", descriptor = "Lclient!ec;")
	public static Class22 aClass22_232 = Static60.method1113("0(U");

	@OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
	public static int anInt843 = 0;

	@OriginalMember(owner = "client!fb", name = "S", descriptor = "Lclient!ja;")
	public static Class33 aClass33_12 = new Class33(260);

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "Lclient!ec;")
	public static Class22 aClass22_233 = Static60.method1113("au");

	@OriginalMember(owner = "client!fb", name = "U", descriptor = "Lclient!ec;")
	public static Class22 aClass22_234 = Static60.method1113(" <col=ffffff>");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
	public static void method548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static133.anInt3152 != 0 && arg0 != -1) {
			Static130.method2009(Static80.aClass20_Sub1_55, arg0, Static133.anInt3152, 0);
			Static93.aBoolean223 = true;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lclient!ta;")
	public static Class4_Sub1_Sub14 method549(@OriginalArg(0) int arg0) {
		@Pc(6) Class4_Sub1_Sub14 local6 = (Class4_Sub1_Sub14) Static78.aClass33_26.method998((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static35.aClass20_19.method597(13, arg0);
		local6 = new Class4_Sub1_Sub14();
		local6.anInt2761 = arg0;
		if (local28 != null) {
			local6.method1786(new Class4_Sub11(local28));
		}
		Static78.aClass33_26.method997((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public static void method550() {
		aClass44_1 = null;
		aClass33_12 = null;
		aClass22_230 = null;
		aClass22_221 = null;
		aClass22_226 = null;
		aClass4_Sub1_Sub2_Sub4_Sub1_2 = null;
		aClass22_225 = null;
		aClass22_223 = null;
		aClass22_229 = null;
		aClass22_233 = null;
		aClass22_232 = null;
		aClass22_228 = null;
		aClass22Array6 = null;
		anIntArray93 = null;
		aClass22_222 = null;
		aClass20_Sub1_22 = null;
		aClass57_1 = null;
		aClass22_224 = null;
		aClass22_227 = null;
		aClass22_234 = null;
		aClass22_231 = null;
	}
}
