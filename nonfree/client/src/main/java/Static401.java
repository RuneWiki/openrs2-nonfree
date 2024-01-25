import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_114 = new Class231(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_98 = new Class208(44, 2);

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
	public static int anInt7011 = 2;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZII)V")
	public static void method5617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg0, 14);
		local8.method2574();
		local8.anInt3131 = arg1;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIII)V")
	public static void method5618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static434.aClass165_Sub1_1.anInt4205 != 0 && arg2 != 0 && Static126.anInt2092 < 50 && arg3 != -1) {
			Static409.aClass253Array2[Static126.anInt2092++] = new Class253((byte) 2, arg3, arg2, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
	public static void method5620(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub1_Sub6 local13 = Static267.method3705(arg0, 4);
		local13.method2578();
	}
}
