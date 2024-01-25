import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_2 = new Class2(46, 3);

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)[Lclient!pe;")
	public static Class188[] method4() {
		return new Class188[] { Class22_Sub7.aClass188_1, Class22_Sub7.aClass188_2, Class22_Sub7.aClass188_3, Class22_Sub7.aClass188_4, Class22_Sub7.aClass188_5, Class22_Sub7.aClass188_6, Class22_Sub7.aClass188_7, Class22_Sub7.aClass188_8, Class22_Sub7.aClass188_9, Class22_Sub7.aClass188_10, Class22_Sub7.aClass188_11, Class22_Sub7.aClass188_12 };
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	public static void method5() {
		Static425.aClass126_60.method2827();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
	public static int method7(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
