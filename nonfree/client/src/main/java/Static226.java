import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_89 = new Class100(48, 4);

	@OriginalMember(owner = "client!hp", name = "v", descriptor = "[Lclient!mb;")
	public static final Class226[] aClass226Array3 = new Class226[4];

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([Lclient!jd;I)V")
	public static void method5381(@OriginalArg(0) Class20[] arg0) {
		Static542.anInt9266 = arg0.length;
		Static135.aClass20Array3 = new Class20[Static542.anInt9266 + 10];
		Static387.anIntArray518 = new int[Static542.anInt9266 + 10];
		Static681.method2481(arg0, 0, Static135.aClass20Array3, 0, Static542.anInt9266);
		for (@Pc(26) int local26 = 0; local26 < Static542.anInt9266; local26++) {
			Static387.anIntArray518[local26] = Static135.aClass20Array3[local26].method7408();
		}
		for (@Pc(49) int local49 = Static542.anInt9266; local49 < Static135.aClass20Array3.length; local49++) {
			Static387.anIntArray518[local49] = 12;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIB)Z")
	public static boolean method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static49.method1023(arg0, arg1)) {
			return (arg1 & 0xB000) != 0 | Static322.method5083(arg0, arg1) | Static532.method7628(arg1, arg0) ? true : (Static400.method5985(arg1, arg0) | Static410.method6057(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V")
	public static void method5392(@OriginalArg(1) int arg0) {
		Static149.anInt6799 = 100;
		Static241.anInt4364 = 3;
		Static255.anInt4512 = -1;
		Static159.anInt8121 = arg0;
	}
}
