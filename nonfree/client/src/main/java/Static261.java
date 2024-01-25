import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "F")
	public static float aFloat221;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Lclient!nk;")
	public static Class211 aClass211_2;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public static int anInt5167;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "S")
	public static short aShort68 = 256;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)I")
	public static int method4376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static465.anInt7976 == -1) {
			return 1;
		}
		if (arg0 != Static17.anInt459) {
			Static77.method4915(arg0);
			if (arg0 != Static17.anInt459) {
				return -1;
			}
		}
		try {
			@Pc(29) Dimension local29 = Static209.aCanvas6.getSize();
			Static513.method7097(Static294.aClass40_120.method1063(Static194.anInt3737), Static492.aClass13_3, true);
			@Pc(51) Class184 local51 = Static287.method4830(Static465.anInt7976, Static290.aClass117_131);
			@Pc(54) long local54 = Static105.method2132();
			Static110.aClass62_15.n();
			Static267.aClass78_3.oa(0, anInt5167, 0);
			Static110.aClass62_15.method7068(Static267.aClass78_3);
			Static110.aClass62_15.b(local29.width / 2, local29.height / 2, 512, 512);
			Static110.aClass62_15.M(1.0F);
			Static110.aClass62_15.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(95) Class36 local95 = Static110.aClass62_15.method7012(local51, 2048, 64, 64, 768);
			@Pc(97) int local97 = 0;
			label41: for (@Pc(99) int local99 = 0; local99 < 500; local99++) {
				Static110.aClass62_15.Z(0);
				Static110.aClass62_15.method6999();
				for (@Pc(108) int local108 = 15; local108 >= 0; local108--) {
					for (@Pc(112) int local112 = 0; local112 <= local108; local112++) {
						Static434.aClass78_5.oa((int) ((float) Static58.anInt1202 * (-((float) local108 / 2.0F) + (float) local112)), 0, Static58.anInt1202 * (local108 + 1));
						local97++;
						local95.method7360(Static434.aClass78_5, null, 0);
						if ((long) arg1 <= Static105.method2132() - local54) {
							break label41;
						}
					}
				}
			}
			Static110.aClass62_15.method7004();
			@Pc(185) long local185 = (long) (local97 * 1000) / (Static105.method2132() - local54);
			Static110.aClass62_15.Z(0);
			Static110.aClass62_15.method6999();
			return (int) local185;
		} catch (@Pc(194) Throwable local194) {
			local194.printStackTrace();
			return -1;
		}
	}
}
