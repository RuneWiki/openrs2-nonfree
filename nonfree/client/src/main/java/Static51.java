import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!br", name = "ib", descriptor = "I")
	public static int anInt909 = -1;

	@OriginalMember(owner = "client!br", name = "kb", descriptor = "I")
	public static int anInt910 = -1;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!faa;II)V")
	public static void method778(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) int arg2) {
		Static452.aClass97_19 = arg1;
		Static551.anInt9629 = arg2;
		Static331.anInt6263 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IIII)I")
	public static int method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
	public static void method780() {
		Static89.aClass90_3.ha(((float) Static58.aClass6_Sub17_Sub1_1.anInt9274 * 0.1F + 0.7F) * 1.1523438F);
		Static89.aClass90_3.YA(Static547.anInt9362, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static89.aClass90_3.X(Static122.anInt2114, -1, 0);
		Static89.aClass90_3.method7454(Static476.aClass3_4);
	}
}
