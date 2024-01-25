import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Z")
	public static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_200 = new Class217(90, 0);

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_201 = new Class217(49, 3);

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "Z")
	public static boolean aBoolean483 = true;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)Z")
	public static boolean method5710(@OriginalArg(1) int arg0) {
		if (arg0 == 17 || arg0 == 3 || arg0 == 11 || arg0 == 21 || arg0 == 1001) {
			return true;
		} else {
			return arg0 == 48 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
	public static void method5711() {
		Static51.aClass63_2.method4564(Static16.aFloat8, Static338.aFloat63, Static73.aFloat11);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5712(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			local18 = (local18 << 5) - (local18 - Static352.method1726(arg0.charAt(local20)));
		}
		return local18;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BI)V")
	public static void method5715(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static51.anInt1301 - Static27.anInt623;
		if (local7 >= 100) {
			Static50.anInt1273 = 1;
			return;
		}
		@Pc(18) int local18 = (int) Static332.aFloat62;
		if (Static109.anInt2439 >> 8 > local18) {
			local18 = Static109.anInt2439 >> 8;
		}
		if (Static26.aBooleanArray1[4] && Static277.anIntArray418[4] + 128 > local18) {
			local18 = Static277.anIntArray418[4] + 128;
		}
		@Pc(59) int local59 = Static38.anInt944 + (int) Static357.aFloat76 & 0x3FFF;
		Static196.method3685(local18, Static98.anInt2254, (local18 >> 3) * 3 + 600, arg0, Static53.anInt1374, local59, Static8.method288(Static284.anInt6477, Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729, Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726) - 50);
		@Pc(100) float local100 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static260.anInt5192 = (int) ((float) Static47.anInt1199 + local100 * (float) (Static260.anInt5192 - Static47.anInt1199));
		Static294.anInt5665 = (int) ((float) Static274.anInt5326 + (float) (Static294.anInt5665 - Static274.anInt5326) * local100);
		Static14.anInt4971 = (int) ((float) Static148.anInt3126 + local100 * (float) (Static14.anInt4971 - Static148.anInt3126));
		Static272.anInt5295 = (int) (local100 * (float) (Static272.anInt5295 - Static74.anInt1672) + (float) Static74.anInt1672);
		@Pc(152) int local152 = Static320.anInt4362 - Static33.anInt827;
		if (local152 > 8192) {
			local152 -= 16384;
		} else if (local152 < -8192) {
			local152 += 16384;
		}
		Static320.anInt4362 = (int) (local100 * (float) local152 + (float) Static33.anInt827);
		Static320.anInt4362 &= 0x3FFF;
	}
}
