import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
	public static int anInt6280;

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "Lclient!dk;")
	public static Class54 aClass54_104;

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "Lclient!ea;")
	public static final Class60 aClass60_4 = new Class60("WIP", 2);

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "[I")
	public static final int[] anIntArray542 = new int[14];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4901(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static119.anInt2204;
		@Pc(9) int[] local9 = Static200.anIntArray295;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class3_Sub4_Sub1_Sub2 local21 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local9[local13]];
			if (local21 != null && local21 != Static60.aClass3_Sub4_Sub1_Sub2_1 && local21.aString148 != null && local21.aString148.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static29.method451(Static130.aClass102_78);
					Static456.aClass2_Sub13_Sub2_2.method3546(0);
					Static456.aClass2_Sub13_Sub2_2.method3542(local9[local13]);
				} else if (arg0 == 4) {
					Static29.method451(Static8.aClass102_8);
					Static456.aClass2_Sub13_Sub2_2.method3542(local9[local13]);
					Static456.aClass2_Sub13_Sub2_2.method3602(0);
				} else if (arg0 == 5) {
					Static29.method451(Static94.aClass102_216);
					Static456.aClass2_Sub13_Sub2_2.method3602(0);
					Static456.aClass2_Sub13_Sub2_2.method3568(local9[local13]);
				} else if (arg0 == 6) {
					Static29.method451(Static15.aClass102_14);
					Static456.aClass2_Sub13_Sub2_2.method3577(local9[local13]);
					Static456.aClass2_Sub13_Sub2_2.method3583(0);
				} else if (arg0 == 7) {
					Static29.method451(Static354.aClass102_179);
					Static456.aClass2_Sub13_Sub2_2.method3568(local9[local13]);
					Static456.aClass2_Sub13_Sub2_2.method3602(0);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static12.method159(Static71.aClass134_22.method2720(Static331.anInt5597) + arg1);
		}
	}
}
