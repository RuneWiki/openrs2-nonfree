import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_154 = Static161.method2452("glow3:");

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "Lclient!dc;")
	public static Class20 aClass20_153 = aClass20_154;

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
	public static int anInt347 = 0;

	@OriginalMember(owner = "client!bg", name = "J", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_159 = Static161.method2452("");

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "Lclient!dc;")
	public static Class20 aClass20_155 = aClass20_159;

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_7 = new Class8(100);

	@OriginalMember(owner = "client!bg", name = "F", descriptor = "J")
	public static long aLong31 = 0L;

	@OriginalMember(owner = "client!bg", name = "G", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_156 = aClass20_154;

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "Lclient!dc;")
	public static Class20 aClass20_157 = aClass20_159;

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "Lclient!dc;")
	public static Class20 aClass20_158 = aClass20_159;

	@OriginalMember(owner = "client!bg", name = "K", descriptor = "Lclient!dc;")
	public static Class20 aClass20_160 = aClass20_159;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "Lclient!dc;")
	public static Class20 aClass20_161 = aClass20_159;

	@OriginalMember(owner = "client!bg", name = "M", descriptor = "Lclient!dc;")
	public static Class20 aClass20_162 = aClass20_159;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
	public static void method285(@OriginalArg(1) boolean arg0) {
		if (Static146.aClass39_2 == null) {
			return;
		}
		try {
			@Pc(11) Class5_Sub6 local11 = new Class5_Sub6(4);
			local11.method3061(arg0 ? 2 : 3);
			local11.method3058(0);
			Static146.aClass39_2.method1176(4, local11.aByteArray56);
		} catch (@Pc(32) IOException local32) {
			try {
				Static146.aClass39_2.method1175();
			} catch (@Pc(37) Exception local37) {
			}
			Static146.aClass39_2 = null;
			Static103.anInt2175++;
		}
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)Lclient!jc;")
	public static Class47 method287() {
		@Pc(31) Class47_Sub1 local31 = new Class47_Sub1(Static58.anInt1319, Static140.anInt2921, Static146.anIntArray320[0], Static5.anIntArray10[0], Static153.anIntArray337[0], Static210.anIntArray84[0], Static191.aByteArrayArray9[0], Static3.anIntArray9);
		Static85.method1452();
		return local31;
	}
}
