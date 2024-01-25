import java.awt.Dimension;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public static int anInt3254 = 1;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZII)I")
	public static int method2719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static33.anInt657 == -1) {
			return 1;
		}
		if (arg1 != Static226.anInt3318) {
			Static570.method7432(Static229.aClass159_15.method2776(Static261.anInt4297), arg1);
			if (arg1 != Static226.anInt3318) {
				return -1;
			}
		}
		try {
			@Pc(33) Dimension local33 = Static9.aCanvas1.getSize();
			Static96.method1453(Static322.aClass37_20, Static229.aClass159_15.method2776(Static261.anInt4297), Static417.aClass162_17, true, Static266.aClass112_7);
			@Pc(49) Class13 local49 = Static25.method356(Static33.anInt657, Static463.aClass229_106);
			@Pc(52) long local52 = Static362.method5133();
			Static417.aClass162_17.JA();
			Static468.aClass25_6.NA(0, Static437.anInt7021, 0);
			Static417.aClass162_17.method6816(Static468.aClass25_6);
			Static417.aClass162_17.la(local33.width / 2, local33.height / 2, 512, 512);
			Static417.aClass162_17.ra(1.0F);
			Static417.aClass162_17.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(93) Class33 local93 = Static417.aClass162_17.method6839(local49, 2048, 64, 64, 768);
			@Pc(95) int local95 = 0;
			label41: for (@Pc(97) int local97 = 0; local97 < 500; local97++) {
				Static417.aClass162_17.ja(0);
				Static417.aClass162_17.ya();
				for (@Pc(106) int local106 = 15; local106 >= 0; local106--) {
					for (@Pc(110) int local110 = 0; local110 <= local106; local110++) {
						Static300.aClass25_4.NA((int) (((float) local110 - (float) local106 / 2.0F) * (float) Static481.anInt7681), 0, Static481.anInt7681 * (local106 + 1));
						local93.method7192(Static300.aClass25_4, null, 0);
						local95++;
						if (Static362.method5133() - local52 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static417.aClass162_17.method6861();
			@Pc(176) long local176 = (long) (local95 * 1000) / (Static362.method5133() - local52);
			Static417.aClass162_17.ja(0);
			Static417.aClass162_17.ya();
			return (int) local176;
		} catch (@Pc(185) Throwable local185) {
			local185.printStackTrace();
			return -1;
		}
	}
}
