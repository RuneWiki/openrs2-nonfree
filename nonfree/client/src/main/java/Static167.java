import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "Lclient!cw;")
	public static Class61 aClass61_5;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "[I")
	public static final int[] anIntArray196 = new int[200];

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "[Lclient!on;")
	public static final Class254[] aClass254Array1 = new Class254[37];

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_107 = new Class288(113, 6);

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
	public static int anInt2956 = 0;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)V")
	public static void method2468() {
		Static580.anInt9430 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static458.aClass2_Sub22Array1[local14] = null;
			Static148.aByteArray34[local14] = 1;
			Static4.aClass336Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)I")
	public static int method2469() {
		@Pc(12) int local12 = 0;
		@Pc(22) Field[] local22 = ah.class.getDeclaredFields();
		for (@Pc(26) int local26 = 0; local26 < local22.length; local26++) {
			@Pc(32) Field local32 = local22[local26];
			if (kt.class.isAssignableFrom(local32.getType())) {
				local12++;
			}
		}
		return local12 + 1;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIII)V")
	public static void method2470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static532.anInt8751 = arg0;
		Static209.anInt4595 = arg2;
		Static533.anInt8753 = arg3;
		Static507.anInt8477 = arg1;
		Static308.anInt4982 = arg4;
		if (Static308.anInt4982 >= 100) {
			@Pc(28) int local28 = Static209.anInt4595 * 512 + 256;
			@Pc(34) int local34 = Static507.anInt8477 * 512 + 256;
			@Pc(43) int local43 = Static504.method6917(local28, Static91.anInt1705, local34) - Static532.anInt8751;
			@Pc(48) int local48 = local28 - Static250.anInt4000;
			@Pc(52) int local52 = local43 - Static220.anInt3605;
			@Pc(56) int local56 = local34 - Static644.anInt10376;
			@Pc(67) int local67 = (int) Math.sqrt((double) (local56 * local56 + local48 * local48));
			Static440.anInt7072 = (int) (Math.atan2((double) local52, (double) local67) * 2607.5945876176133D) & 0x3FFF;
			Static338.anInt5355 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local56)) & 0x3FFF;
			if (Static440.anInt7072 < 1024) {
				Static440.anInt7072 = 1024;
			}
			Static161.anInt2901 = 0;
			if (Static440.anInt7072 > 3072) {
				Static440.anInt7072 = 3072;
			}
		}
		Static445.anInt7122 = 2;
		Static12.anInt159 = -1;
		Static8.anInt107 = -1;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Z")
	public static boolean method2472() {
		return Static317.anInt5047 != 0;
	}
}
