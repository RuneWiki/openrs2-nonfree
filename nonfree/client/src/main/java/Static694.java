import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static694 {

	@OriginalMember(owner = "client!vr", name = "P", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_191 = new Class186(112, -2);

	@OriginalMember(owner = "client!vr", name = "S", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_126 = new Class286(35, 2);

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(III)V")
	public static void method9099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(14, (long) arg1);
		local9.method630();
		local9.anInt803 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)[Lclient!el;")
	public static Class95[] method9100() {
		if (Static431.aClass95Array1 == null) {
			@Pc(17) Class95[] local17 = Static539.method8107(Static310.aClass47_4);
			@Pc(21) Class95[] local21 = new Class95[local17.length];
			@Pc(23) int local23 = 0;
			@Pc(28) int local28 = Static713.aClass3_Sub55_31.aClass15_Sub24_1.method8063();
			@Pc(117) int local117;
			@Pc(123) Class95 local123;
			label70: for (@Pc(30) int local30 = 0; local30 < local17.length; local30++) {
				@Pc(38) Class95 local38 = local17[local30];
				if ((local38.anInt2810 <= 0 || local38.anInt2810 >= 24) && local38.anInt2811 >= 800 && local38.anInt2808 >= 600 && (local28 != 2 || local38.anInt2811 <= 800 && local38.anInt2808 <= 600) && (local28 != 1 || local38.anInt2811 <= 1024 && local38.anInt2808 <= 768)) {
					for (local117 = 0; local117 < local23; local117++) {
						local123 = local21[local117];
						if (local123.anInt2811 == local38.anInt2811 && local38.anInt2808 == local123.anInt2808) {
							if (local123.anInt2810 < local38.anInt2810) {
								local21[local117] = local38;
							}
							continue label70;
						}
					}
					local21[local23] = local38;
					local23++;
				}
			}
			Static431.aClass95Array1 = new Class95[local23];
			Static735.method9183(local21, 0, Static431.aClass95Array1, 0, local23);
			@Pc(197) int[] local197 = new int[Static431.aClass95Array1.length];
			for (local117 = 0; local117 < Static431.aClass95Array1.length; local117++) {
				local123 = Static431.aClass95Array1[local117];
				local197[local117] = local123.anInt2811 * local123.anInt2808;
			}
			Static198.method2983(Static431.aClass95Array1, local197);
		}
		return Static431.aClass95Array1;
	}
}
