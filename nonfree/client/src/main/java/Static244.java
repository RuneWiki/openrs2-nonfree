import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "[I")
	public static int[] anIntArray375;

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "Lclient!nc;")
	public static Class174 aClass174_2;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_60 = new Class25(40, 3);

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "J")
	public static long aLong132 = -1L;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "Z")
	public static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BILclient!tq;I)V")
	public static void method3775(@OriginalArg(1) int arg0, @OriginalArg(2) Class239 arg1, @OriginalArg(3) int arg2) {
		if (Static332.aClass239_12 != null || Static206.aBoolean239 || (arg1 == null || Static189.method5437(arg1) == null)) {
			return;
		}
		Static332.aClass239_12 = arg1;
		Static419.aClass239_16 = Static189.method5437(arg1);
		Static108.anInt1929 = arg0;
		Static241.anInt4098 = arg2;
		Static4.anInt33 = 0;
		Static371.aBoolean411 = false;
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
	public static void method3777() {
		for (@Pc(6) Class6_Sub14 local6 = (Class6_Sub14) Static329.aClass88_40.method1882(); local6 != null; local6 = (Class6_Sub14) Static329.aClass88_40.method1891()) {
			if (local6.aBoolean179) {
				local6.method2180();
			}
		}
		for (@Pc(38) Class6_Sub14 local38 = (Class6_Sub14) Static170.aClass88_18.method1882(); local38 != null; local38 = (Class6_Sub14) Static170.aClass88_18.method1891()) {
			if (local38.aBoolean179) {
				local38.method2180();
			}
		}
	}
}
