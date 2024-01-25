import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!sha", name = "V", descriptor = "Lclient!jd;")
	public static Class20 aClass20_32;

	@OriginalMember(owner = "client!sha", name = "W", descriptor = "Lclient!rja;")
	public static Class304 aClass304_2;

	@OriginalMember(owner = "client!sha", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!sha", name = "P", descriptor = "Lclient!ef;")
	public static final Class87 aClass87_6 = new Class87();

	@OriginalMember(owner = "client!sha", name = "U", descriptor = "F")
	public static float aFloat228 = 0.0F;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "([BI)[B")
	public static byte[] method7672(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static681.method2476(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZ)V")
	public static void method7677(@OriginalArg(0) int arg0) {
		if (Static56.aClass14_Sub22_5.aClass21_Sub5_1.method1912() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static548.anInt9334) {
			return;
		}
		if (arg0 != -1) {
			@Pc(34) Class162 local34 = Static184.aClass151_1.method3506(arg0);
			@Pc(38) Class356 local38 = local34.method3651();
			if (local38 == null) {
				arg0 = -1;
			} else {
				Static234.aClass333_5.method8134(local38.method8627(), new Point(local34.anInt4412, local34.anInt4413), local38.method8615(), local38.method8624(), Static68.aCanvas2);
				Static548.anInt9334 = arg0;
			}
		}
		if (arg0 == -1 && Static548.anInt9334 != -1) {
			Static234.aClass333_5.method8134(-1, new Point(), (int[]) null, -1, Static68.aCanvas2);
			Static548.anInt9334 = -1;
		}
	}

	@OriginalMember(owner = "client!sha", name = "f", descriptor = "(B)V")
	public static void method7678() {
		if (Static481.aBoolean620) {
			return;
		}
		Static358.method5419(Static33.aClass58ArrayArrayArray1);
		if (Static646.aClass58ArrayArrayArray3 != null) {
			Static358.method5419(Static646.aClass58ArrayArrayArray3);
		}
		Static481.aBoolean620 = true;
	}
}
