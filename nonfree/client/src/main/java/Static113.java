import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!ef;")
	public static Class20 aClass20_13;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] aClass5_Sub2_Sub1_Sub4Array8;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
	public static int anInt2958;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!r;")
	private static Class61 aClass61_887 = Static129.method2060("Walk here");

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!r;")
	public static Class61 aClass61_888 = Static129.method2060("title)3jpg");

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "Lclient!r;")
	public static Class61 aClass61_889 = Static129.method2060("mapscene");

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
	public static int anInt2955 = 0;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!r;")
	public static Class61 aClass61_890 = Static129.method2060("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Lclient!r;")
	private static Class61 aClass61_895 = Static129.method2060("This world is full)3");

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!r;")
	public static Class61 aClass61_891 = aClass61_895;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_892 = Static129.method2060("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Lclient!r;")
	public static Class61 aClass61_893 = Static129.method2060("p11_full");

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
	public static int anInt2957 = 0;

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean103 = false;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!r;")
	public static Class61 aClass61_894 = aClass61_887;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public static int method1867(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public static void method1868() {
		aClass61_888 = null;
		aClass20_13 = null;
		aClass61_892 = null;
		aClass61_891 = null;
		aClass61_889 = null;
		aClass61_894 = null;
		aClass61_895 = null;
		aClass5_Sub2_Sub1_Sub4Array8 = null;
		aClass61_887 = null;
		aClass61_890 = null;
		aClass61_893 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)I")
	public static int method1869(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static38.method1035(arg1 + 45365, 4, arg0 + 91923) + (Static38.method1035(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static38.method1035(arg1, 1, arg0) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
