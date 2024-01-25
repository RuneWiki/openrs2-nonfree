import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
	public static int anInt2526;

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(III)I")
	public static int method2274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static488.anInt7869 == -1) {
			return 1;
		}
		if (arg0 != Static260.anInt4932) {
			Static370.method5496(Static48.aClass33_15.method797(Static131.anInt2839), arg0);
			if (Static260.anInt4932 != arg0) {
				return -1;
			}
		}
		try {
			@Pc(34) Dimension local34 = Static347.aCanvas9.getSize();
			Static392.method5757(Static4.aClass43_1, Static48.aClass33_15.method797(Static131.anInt2839), true, Static49.aClass117_1, Static103.aClass58_6);
			@Pc(52) Class226 local52 = Static519.method6916(Static488.anInt7869, Static384.aClass246_184);
			@Pc(55) long local55 = Static587.method7753();
			Static4.aClass43_1.JA();
			Static328.aClass109_5.NA(0, Static122.anInt2780, 0);
			Static4.aClass43_1.method7187(Static328.aClass109_5);
			Static4.aClass43_1.la(local34.width / 2, local34.height / 2, 512, 512);
			Static4.aClass43_1.ra(1.0F);
			Static4.aClass43_1.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(96) Class57 local96 = Static4.aClass43_1.method7178(local52, 2048, 64, 64, 768);
			@Pc(98) int local98 = 0;
			label41: for (@Pc(100) int local100 = 0; local100 < 500; local100++) {
				Static4.aClass43_1.ja(0);
				Static4.aClass43_1.ya();
				for (@Pc(109) int local109 = 15; local109 >= 0; local109--) {
					for (@Pc(113) int local113 = 0; local113 <= local109; local113++) {
						Static315.aClass109_4.NA((int) ((float) Static511.anInt8116 * ((float) local113 - (float) local109 / 2.0F)), 0, Static511.anInt8116 * (local109 + 1));
						local96.method7501(Static315.aClass109_4, null, 0);
						local98++;
						if ((long) arg1 <= Static587.method7753() - local55) {
							break label41;
						}
					}
				}
			}
			Static4.aClass43_1.method7154();
			@Pc(177) long local177 = (long) (local98 * 1000) / (Static587.method7753() - local55);
			Static4.aClass43_1.ja(0);
			Static4.aClass43_1.ya();
			return (int) local177;
		} catch (@Pc(186) Throwable local186) {
			local186.printStackTrace();
			return -1;
		}
	}
}
