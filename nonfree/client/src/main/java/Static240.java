import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static240 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "[Lclient!ja;")
	public static Interface3[] anInterface3Array6;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "[Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1[] aClass4_Sub2_Sub1_Sub1Array7;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public static int anInt5014 = -1;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString182 = "M";

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method3999() {
		aClass4_Sub2_Sub1_Sub1Array7 = null;
		aString182 = null;
		anInterface3Array6 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	public static void method4000(@OriginalArg(1) boolean arg0) {
		Static2.aBoolean2 = arg0;
		Static11.aBoolean7 = !Static62.method957();
	}
}
