import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static140 {

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
	public static int anInt229;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
	public static int anInt217 = 0;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "Lclient!kb;")
	private static Class46 aClass46_67 = Static65.method1172("wave2:");

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!kb;")
	public static Class46 aClass46_63 = aClass46_67;

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "Lclient!kb;")
	public static Class46 aClass46_64 = Static65.method1172("::gc");

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "Lclient!kb;")
	private static Class46 aClass46_65 = Static65.method1172("Loading textures )2 ");

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "Lclient!kb;")
	public static Class46 aClass46_66 = aClass46_67;

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "Lclient!kb;")
	public static Class46 aClass46_68 = aClass46_65;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
	public static void method173() {
		aClass46_66 = null;
		aClass46_68 = null;
		aClass46_63 = null;
		aByteArrayArray3 = null;
		aClass46_64 = null;
		aClass46_67 = null;
		aClass46_65 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBILclient!jg;)Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2 method186(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class44 arg2) {
		return Static122.method2089(arg1, arg2, arg0) ? Static159.method2551() : null;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(II)I")
	public static int method221(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
