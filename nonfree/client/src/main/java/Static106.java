import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!om;")
	public static Class1_Sub16_Sub3 aClass1_Sub16_Sub3_1;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "[I")
	public static int[] anIntArray207;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!im;")
	public static final Class140 aClass140_37 = new Class140(112, 6);

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public static final int anInt2138 = 2;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method1795(@OriginalArg(0) Class122 arg0) {
		if (Static15.aBoolean16) {
			Static497.method6756(arg0);
		} else {
			Static419.method6153(arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
	public static void method1797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(14, arg0);
		local8.method4946();
		local8.anInt5822 = arg1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method1798() {
		Static173.method2613();
		Static63.method1142();
	}
}
