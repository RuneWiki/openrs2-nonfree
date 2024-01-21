import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray45;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!hh;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "Lclient!ob;")
	public static Class60 aClass60_3;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!ed;")
	public static Class23 aClass23_732 = Static169.method2903("mapback");

	@OriginalMember(owner = "client!j", name = "c", descriptor = "Lclient!ed;")
	private static Class23 aClass23_733 = Static169.method2903("Click to switch");

	@OriginalMember(owner = "client!j", name = "e", descriptor = "I")
	public static final int anInt2028 = 5063219;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Lclient!ed;")
	private static Class23 aClass23_736 = Static169.method2903("Please enter your username)3");

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!ed;")
	public static Class23 aClass23_734 = aClass23_736;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!ed;")
	public static Class23 aClass23_735 = aClass23_733;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLclient!og;)V")
	public static void method1341(@OriginalArg(1) Class1_Sub11 arg0) {
		if (arg0.aClass1_Sub9_5 != null) {
			arg0.aClass1_Sub9_5.anInt1573 = 0;
		}
		arg0.aBoolean206 = false;
		for (@Pc(14) Class1_Sub11 local14 = arg0.method2932(); local14 != null; local14 = arg0.method2936()) {
			method1341(local14);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)I")
	public static int method1342(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static5.method3150(arg0 - 1, arg1 + -1) + Static5.method3150(arg0 - 1, arg1 + 1) + Static5.method3150(arg0 + 1, arg1 + -1) + Static5.method3150(arg0 + 1, arg1 - -1);
		@Pc(70) int local70 = Static5.method3150(arg0, arg1 - 1) + Static5.method3150(arg0, arg1 + 1) + Static5.method3150(arg0 + -1, arg1) + Static5.method3150(arg0 + 1, arg1);
		@Pc(79) int local79 = Static5.method3150(arg0, arg1);
		return local42 / 16 + local70 / 8 + local79 / 4;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public static void method1343() {
		aByteArrayArrayArray45 = null;
		aClass23_732 = null;
		aClass23_735 = null;
		aClass23_733 = null;
		aClass60_3 = null;
		aClass40_1 = null;
		aClass23_736 = null;
		aClass23_734 = null;
	}
}
