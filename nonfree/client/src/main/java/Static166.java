import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "Lclient!ct;")
	public static Class30 aClass30_53;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
	public static int anInt3467;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_121 = new Class106("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
	public static int anInt3465 = 0;

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kj", name = "B", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_119 = new Class217(36, 6);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BZ)V")
	public static void method3124(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static258.aByteArrayArray4;
			local11 = 1;
		} else {
			local11 = 4;
			local9 = Static349.aByteArrayArray18;
		}
		@Pc(20) int local20 = local9.length;
		@Pc(40) int local40;
		@Pc(53) int local53;
		for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
			@Pc(30) int[] local30 = null;
			@Pc(34) byte[] local34 = local9[local26];
			local40 = Static37.anIntArray60[local26] >> 8;
			@Pc(46) int local46 = Static37.anIntArray60[local26] & 0xFF;
			local53 = local40 * 64 - Static50.anInt1271;
			@Pc(60) int local60 = local46 * 64 - Static299.anInt4036;
			if (local34 != null) {
				Static82.method1769();
				local30 = Static311.method5132(local60, Static11.aClass196Array2, Static9.aClass63_1, local34, arg0, local53, Static299.anInt4036, local11, Static50.anInt1271);
			}
			if (!arg0 && local40 == Static171.anInt3574 / 8 && local46 == Static145.anInt3091 / 8) {
				if (local30 == null) {
					Static191.aClass90_3 = null;
				} else {
					Static191.aClass90_3 = Static363.method6015(local30[3], local30[1], local30[2], local30[0]);
					Static15.anInt301 = local30[4];
				}
			}
		}
		for (@Pc(123) int local123 = 0; local123 < local20; local123++) {
			@Pc(136) int local136 = (Static37.anIntArray60[local123] >> 8) * 64 - Static50.anInt1271;
			local40 = (Static37.anIntArray60[local123] & 0xFF) * 64 - Static299.anInt4036;
			@Pc(151) byte[] local151 = local9[local123];
			if (local151 == null && Static145.anInt3091 < 800) {
				Static82.method1769();
				for (local53 = 0; local53 < local11; local53++) {
					Static356.method5905(local136, 64, local53, local40, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IJ)V")
	public static void method3125(@OriginalArg(1) long arg0) {
		if (Static105.aClass155ArrayArrayArray3 != null) {
			if (Static50.anInt1273 == 1 || Static50.anInt1273 == 5) {
				Static225.method4178(arg0);
			} else if (Static50.anInt1273 == 4) {
				Static116.method2437(arg0);
			}
		}
		Static272.method4848((long) Static51.anInt1301, Static9.aClass63_1);
		if (Static336.anInt6389 != -1) {
			Static367.method6082(Static336.anInt6389);
		}
		for (@Pc(43) int local43 = 0; local43 < Static77.anInt1698; local43++) {
			if (Static207.aBooleanArray21[local43]) {
				Static149.aBooleanArray16[local43] = true;
			}
			Static240.aBooleanArray26[local43] = Static207.aBooleanArray21[local43];
			Static207.aBooleanArray21[local43] = false;
		}
		Static185.anInt1930 = Static51.anInt1301;
		if (Static9.aClass63_1.method4598()) {
			Static165.aBoolean242 = true;
		}
		if (Static336.anInt6389 != -1) {
			Static77.anInt1698 = 0;
			Static297.method5179();
		}
		Static9.aClass63_1.method4651();
		Static71.method1587(Static9.aClass63_1);
		@Pc(93) int local93 = Static285.method4342();
		if (local93 == -1) {
			local93 = Static235.anInt4746;
		}
		Static290.method5227(local93);
		Static75.method3011(Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726, Static217.anInt4314, Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729, Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79);
		Static217.anInt4314 = 0;
	}
}
