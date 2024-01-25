import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!ol;")
	public static final Class182 aClass182_92 = new Class182("", 12);

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_116 = new Class265(87, 1);

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
	public static final int[] anIntArray433 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_122 = new Class209("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)B")
	public static byte method4284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method4285() {
		for (@Pc(3) int local3 = 0; local3 < Static62.anInt1371; local3++) {
			@Pc(9) int local9 = Static173.anIntArray307[local3];
			@Pc(13) Class3_Sub2_Sub1_Sub1 local13 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local9];
			if (local13 != null) {
				Static19.method4250(local13.aClass65_1.anInt2128, local13);
			}
		}
	}
}
