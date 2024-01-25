import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	public static int anInt2736;

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!rb;")
	public static final Class245 aClass245_10 = new Class245(9, 0, 4, 1);

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "[I")
	public static final int[] anIntArray337 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
	public static int anInt2745 = 1;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)I")
	public static int method2596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static135.anInt2543 == -1) {
			return 1;
		}
		if (Static266.anInt4923 != arg1) {
			Static233.method6719(arg1);
			if (Static266.anInt4923 != arg1) {
				return -1;
			}
		}
		try {
			@Pc(38) Dimension local38 = Static517.aCanvas14.getSize();
			Static263.method4275(Static477.aClass47_4, true, Static283.aClass202_160.method5139(Static172.anInt6352));
			@Pc(52) Class29 local52 = Static342.method5377(Static135.anInt2543, Static248.aClass53_78);
			@Pc(55) long local55 = Static143.method2502();
			Static103.aClass39_3.n();
			Static338.aClass181_13.oa(0, Static392.anInt7455, 0);
			Static103.aClass39_3.method6015(Static338.aClass181_13);
			Static103.aClass39_3.b(local38.width / 2, local38.height / 2, 512, 512);
			Static103.aClass39_3.M(1.0F);
			Static103.aClass39_3.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(96) Class63 local96 = Static103.aClass39_3.method6011(local52, 2048, 64, 64, 768);
			@Pc(98) int local98 = 0;
			label41: for (@Pc(100) int local100 = 0; local100 < 500; local100++) {
				Static103.aClass39_3.Z(0);
				Static103.aClass39_3.method6056();
				for (@Pc(109) int local109 = 15; local109 >= 0; local109--) {
					for (@Pc(113) int local113 = 0; local113 <= local109; local113++) {
						Static267.aClass181_14.oa((int) ((float) Static136.anInt2574 * (-((float) local109 / 2.0F) + (float) local113)), 0, Static136.anInt2574 * (local109 + 1));
						local98++;
						local96.method7700(Static267.aClass181_14, null, 0);
						if ((long) arg0 <= Static143.method2502() - local55) {
							break label41;
						}
					}
				}
			}
			Static103.aClass39_3.method6031();
			@Pc(179) long local179 = (long) (local98 * 1000) / (Static143.method2502() - local55);
			Static103.aClass39_3.Z(0);
			Static103.aClass39_3.method6056();
			return (int) local179;
		} catch (@Pc(188) Throwable local188) {
			local188.printStackTrace();
			return -1;
		}
	}
}
