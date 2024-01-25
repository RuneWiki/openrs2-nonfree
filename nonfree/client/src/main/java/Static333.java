import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "Lclient!on;")
	public static Class130 aClass130_2;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "J")
	public static volatile long aLong197 = 0L;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ph;II)Lclient!fj;")
	public static Class79 method4503(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method4303(arg1);
		return local8 == null ? null : new Class79(local8);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4507(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static270.anInt4754;
		@Pc(9) int[] local9 = Static53.anIntArray79;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class24_Sub3_Sub2_Sub2 local21 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local9[local13]];
			if (local21 != null && local21 != Static263.aClass24_Sub3_Sub2_Sub2_4 && local21.aString58 != null && local21.aString58.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static310.method4308(Static299.aClass27_73);
					Static337.aClass10_Sub8_Sub2_2.method2464(0);
					Static337.aClass10_Sub8_Sub2_2.method2519(local9[local13]);
				} else if (arg0 == 4) {
					Static310.method4308(Static352.aClass27_86);
					Static337.aClass10_Sub8_Sub2_2.method2519(local9[local13]);
					Static337.aClass10_Sub8_Sub2_2.method2474(0);
				} else if (arg0 == 5) {
					Static310.method4308(Static385.aClass27_89);
					Static337.aClass10_Sub8_Sub2_2.method2464(0);
					Static337.aClass10_Sub8_Sub2_2.method2519(local9[local13]);
				} else if (arg0 == 6) {
					Static310.method4308(Static127.aClass27_46);
					Static337.aClass10_Sub8_Sub2_2.method2519(local9[local13]);
					Static337.aClass10_Sub8_Sub2_2.method2518(0);
				} else if (arg0 == 7) {
					Static310.method4308(Static61.aClass27_27);
					Static337.aClass10_Sub8_Sub2_2.method2519(local9[local13]);
					Static337.aClass10_Sub8_Sub2_2.method2518(0);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static404.method5326(Static299.aClass182_155.method4155(Static191.anInt3842) + arg1);
		}
	}
}
