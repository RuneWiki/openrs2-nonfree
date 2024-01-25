import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "Lclient!df;")
	public static Class66 aClass66_7;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "J")
	public static volatile long aLong149 = 0L;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger9 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "Lclient!uc;")
	public static final Class328 aClass328_16 = new Class328(10, 3);

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
	public static int anInt5381 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIB)Z")
	public static boolean method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	public static void method4660() {
		@Pc(9) int[] local9 = new int[Static444.aClass322_2.anInt8716];
		@Pc(11) int local11 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static444.aClass322_2.anInt8716; local18++) {
			@Pc(25) Class237 local25 = Static444.aClass322_2.method7141(local18);
			if (local25.anInt6516 >= 0 || local25.anInt6537 >= 0) {
				local9[local11++] = local18;
			}
		}
		Static381.anIntArray494 = new int[local11];
		for (@Pc(49) int local49 = 0; local49 < local11; local49++) {
			Static381.anIntArray494[local49] = local9[local49];
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!nba;I)I")
	public static int method4661(@OriginalArg(0) Class215 arg0) {
		if (arg0 == Static32.aClass215_1) {
			return 9216;
		} else if (Static62.aClass215_2 == arg0) {
			return 34065;
		} else if (Static338.aClass215_3 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)I")
	public static int method4662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static302.anIntArray412[arg0 & 0x3] : 256;
	}
}
