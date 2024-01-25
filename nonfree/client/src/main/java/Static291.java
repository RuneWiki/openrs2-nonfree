import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!or", name = "L", descriptor = "I")
	public static int anInt5226;

	@OriginalMember(owner = "client!or", name = "N", descriptor = "Lclient!la;")
	public static Class116 aClass116_3;

	@OriginalMember(owner = "client!or", name = "K", descriptor = "Lclient!di;")
	public static final Class54 aClass54_75 = new Class54(4, 4);

	@OriginalMember(owner = "client!or", name = "M", descriptor = "Lclient!gp;")
	public static Class98 aClass98_1 = new Class98(8);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ya;I)V")
	public static void method4185(@OriginalArg(0) Class49 arg0) {
		if (Static82.aBoolean109) {
			Static221.method3465(arg0);
		} else {
			Static393.method5204(arg0);
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(B)V")
	public static void method4187() {
		Static424.aClass2_Sub23_Sub2_1.anInt6952 = 0;
		Static138.aClass265_54 = null;
		Static365.aClass265_139 = null;
		Static379.anInt6425 = 0;
		Static317.aClass265_122 = null;
		Static438.aClass2_Sub23_Sub2_2.anInt6952 = 0;
		Static194.anInt3721 = 0;
		Static38.anInt6363 = 0;
		Static171.aClass265_69 = null;
		Static22.method462();
		Static25.method500();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static74.aClass3_Sub2_Sub1_Sub2Array1[local31] = null;
		}
		Static375.aClass3_Sub2_Sub1_Sub2_7 = null;
		for (@Pc(51) int local51 = 0; local51 < Static174.aClass3_Sub2_Sub1_Sub1Array1.length; local51++) {
			@Pc(57) Class3_Sub2_Sub1_Sub1 local57 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local51];
			if (local57 != null) {
				local57.anInt6167 = -1;
			}
		}
		Static151.method2521();
		Static159.anInt3195 = 1;
		Static365.method4986(30);
		for (@Pc(80) int local80 = 0; local80 < 100; local80++) {
			Static243.aBooleanArray19[local80] = true;
		}
		Static344.method4736();
		Static452.aLong226 = 0L;
		Static278.aClass2_Sub36_1 = null;
	}
}
