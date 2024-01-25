import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dga", name = "L", descriptor = "I")
	public static int anInt2225;

	@OriginalMember(owner = "client!dga", name = "J", descriptor = "Lclient!lb;")
	public static Class221 aClass221_22;

	@OriginalMember(owner = "client!dga", name = "K", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_33 = new Class186(84, 17);

	@OriginalMember(owner = "client!dga", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString32 = null;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIB)I")
	public static int method1982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static224.aClass84_1.anInt2472 == -1) {
			return 1;
		}
		if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() != arg0) {
			Static548.method7763(arg0, true, Static476.aClass279_13.method6992(Static141.anInt2658));
			if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() != arg0) {
				return -1;
			}
		}
		try {
			@Pc(41) Dimension local41 = Static67.aCanvas1.getSize();
			Static52.method679(Static488.aClass67_12, Static687.aClass330_13, Static476.aClass279_13.method6992(Static141.anInt2658), true, Static418.aClass44_32);
			@Pc(58) Class178 local58 = Static542.method7606(Static719.aClass221_163, 0, true, Static224.aClass84_1.anInt2472);
			@Pc(61) long local61 = Static626.method8479();
			Static488.aClass67_12.la();
			Static122.aClass181_12.method6356(0, Static198.anInt3490, 0);
			Static488.aClass67_12.method7642(Static122.aClass181_12);
			Static488.aClass67_12.DA(local41.width / 2, local41.height / 2, 512, 512);
			Static488.aClass67_12.xa(1.0F);
			Static488.aClass67_12.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(112) Class157 local112 = Static488.aClass67_12.method7653(local58, 2048, 64, 64, 768);
			@Pc(114) int local114 = 0;
			label41: for (@Pc(116) int local116 = 0; local116 < 500; local116++) {
				Static488.aClass67_12.GA(0);
				Static488.aClass67_12.ya();
				for (@Pc(127) int local127 = 15; local127 >= 0; local127--) {
					for (@Pc(131) int local131 = 0; local131 <= local127; local131++) {
						Static377.aClass181_7.method6356((int) ((float) Static495.anInt8508 * ((float) local131 - (float) local127 / 2.0F)), 0, (local127 + 1) * Static495.anInt8508);
						local114++;
						local112.method5232(Static377.aClass181_7, (Class19_Sub6) null, 0);
						if ((long) arg1 <= Static626.method8479() - local61) {
							break label41;
						}
					}
				}
			}
			Static488.aClass67_12.method7707();
			@Pc(217) long local217 = (long) (local114 * 1000) / (Static626.method8479() - local61);
			Static488.aClass67_12.GA(0);
			Static488.aClass67_12.ya();
			return (int) local217;
		} catch (@Pc(228) Throwable local228) {
			local228.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(III)Z")
	public static boolean method1983(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
