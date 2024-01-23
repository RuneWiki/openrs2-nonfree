import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
	public static int anInt627;

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "Z")
	public static boolean aBoolean37;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
	public static int anInt626 = 0;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "Lclient!sf;")
	public static Class157 aClass157_6 = new Class157(64);

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V")
	public static void method553() {
		if (Static115.aBoolean398) {
			return;
		}
		Static63.aBoolean100 = true;
		if (Static41.aBoolean65) {
			Static148.aFloat33 = (int) Static148.aFloat33 + 47 & 0xFFFFFFF0;
		} else {
			Static231.aFloat46 += (12.0F - Static231.aFloat46) / 2.0F;
		}
		Static115.aBoolean398 = true;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZBLclient!mi;III)V")
	public static void method558(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static76.anInt1889 >= 50 || (arg1 == null || arg1.anIntArrayArray24 == null || arg2 >= arg1.anIntArrayArray24.length || arg1.anIntArrayArray24[arg2] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray24[arg2][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(55) int local55;
		if (arg1.anIntArrayArray24[arg2].length > 1) {
			local55 = (int) (Math.random() * (double) arg1.anIntArrayArray24[arg2].length);
			if (local55 > 0) {
				local38 = arg1.anIntArrayArray24[arg2][local55];
			}
		}
		@Pc(71) int local71 = local34 & 0x1F;
		@Pc(77) int local77 = local34 >> 5 & 0x7;
		if (local71 == 0) {
			if (arg0) {
				Static89.method1572(local38, local77, 255, 0);
			}
		} else if (Static201.anInt4203 != 0) {
			Static10.anIntArray26[Static76.anInt1889] = local38;
			local55 = (arg3 - 64) / 128;
			@Pc(116) int local116 = (arg4 - 64) / 128;
			Static193.anIntArray403[Static76.anInt1889] = local77;
			Static278.anIntArray524[Static76.anInt1889] = 0;
			Static73.aClass173Array1[Static76.anInt1889] = null;
			Static29.anIntArray64[Static76.anInt1889] = 255;
			Static246.anIntArray478[Static76.anInt1889] = (local116 << 8) + (local55 << 16) + local71;
			Static76.anInt1889++;
		}
	}
}
