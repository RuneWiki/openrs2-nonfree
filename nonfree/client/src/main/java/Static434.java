import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "[Lclient!vf;")
	public static Class370[] aClass370Array1;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
	public static int anInt7081;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!ofa;")
	public static Class265 aClass265_11 = null;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI)I")
	public static int method5948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static26.anInt627 == -1) {
			return 1;
		}
		if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() != arg1) {
			Static66.method1166(Static114.aClass84_13.method1729(Static654.anInt10668), true, arg1);
			if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() != arg1) {
				return -1;
			}
		}
		try {
			@Pc(45) Dimension local45 = Static330.aCanvas5.getSize();
			Static651.method8742(true, Static114.aClass84_13.method1729(Static654.anInt10668), Static119.aClass95_4, Static513.aClass91_12, Static184.aClass67_3);
			@Pc(61) Class134 local61 = Static74.method1278(Static26.anInt627, Static420.aClass362_91);
			@Pc(64) long local64 = Static15.method380();
			Static119.aClass95_4.la();
			Static360.aClass17_3.method6231(0, Static579.anInt9391, 0);
			Static119.aClass95_4.method8037(Static360.aClass17_3);
			Static119.aClass95_4.DA(local45.width / 2, local45.height / 2, 512, 512);
			Static119.aClass95_4.xa(1.0F);
			Static119.aClass95_4.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(105) Class149 local105 = Static119.aClass95_4.method8021(local61, 2048, 64, 64, 768);
			@Pc(107) int local107 = 0;
			label41: for (@Pc(109) int local109 = 0; local109 < 500; local109++) {
				Static119.aClass95_4.GA(0);
				Static119.aClass95_4.ya();
				for (@Pc(118) int local118 = 15; local118 >= 0; local118--) {
					for (@Pc(122) int local122 = 0; local122 <= local118; local122++) {
						Static586.aClass17_9.method6231((int) ((float) Static599.anInt7773 * (-((float) local118 / 2.0F) + (float) local122)), 0, Static599.anInt7773 * (local118 + 1));
						local107++;
						local105.method8857(Static586.aClass17_9, (Class34_Sub6) null, 0);
						if ((long) arg0 <= Static15.method380() - local64) {
							break label41;
						}
					}
				}
			}
			Static119.aClass95_4.method8058();
			@Pc(196) long local196 = (long) (local107 * 1000) / (Static15.method380() - local64);
			Static119.aClass95_4.GA(0);
			Static119.aClass95_4.ya();
			return (int) local196;
		} catch (@Pc(205) Throwable local205) {
			local205.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[FB)[F")
	public static float[] method5949(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(14) float[] local14 = new float[arg0];
		Static681.method4037(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
