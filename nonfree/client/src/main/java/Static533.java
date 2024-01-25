import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "Lclient!an;")
	public static final Class20 aClass20_22 = new Class20(11, 3);

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "[I")
	public static final int[] anIntArray572 = new int[8];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)V")
	public static void method7599(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg0, 16);
		local8.method8628();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)I")
	public static int method7602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static2.anIntArray2[arg0 & 0x3] : Static143.anIntArray190[arg0 & 0x3];
	}
}
