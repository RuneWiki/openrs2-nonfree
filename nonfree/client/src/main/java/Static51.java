import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!oba;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method1405() {
		Static511.aClass91ArrayArray2 = new Class91[Static83.aClass69_94.method1895()][];
		Static465.aClass91ArrayArray1 = new Class91[Static83.aClass69_94.method1895()][];
		Static286.aBooleanArray22 = new boolean[Static83.aClass69_94.method1895()];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(JB)V")
	public static void method1407(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static513.anInt9088 + Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954;
		@Pc(20) int local20 = Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 + Static109.anInt2299;
		if (Static397.anInt6990 - local10 < -500 || Static397.anInt6990 - local10 > 500 || Static60.anInt1483 - local20 < -500 || Static60.anInt1483 - local20 > 500) {
			Static397.anInt6990 = local10;
			Static60.anInt1483 = local20;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (local10 != Static397.anInt6990) {
			local62 = local10 - Static397.anInt6990;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 <= 0) {
				if (local70 == 0) {
					local70 = -1;
				} else if (local70 < local62) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = 1;
			} else if (local70 > local62) {
				local70 = local62;
			}
			Static397.anInt6990 += local70;
		}
		if (Static60.anInt1483 != local20) {
			local62 = local20 - Static60.anInt1483;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local70 > local62) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local70 < local62) {
				local70 = local62;
			}
			Static60.anInt1483 += local70;
		}
		if (!Static286.aClass1_Sub15_Sub1_1.aBoolean528) {
			Static49.aFloat29 += Static349.aFloat136 * (float) arg0 / 6.0F;
			Static135.aFloat193 += Static360.aFloat140 * (float) arg0 / 6.0F;
		}
		Static25.method772();
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	public static void method1410() {
		if (Static380.anInt6743 == 2) {
			Static520.anInt9181 = 96;
			return;
		}
		try {
			@Pc(17) Method local17 = Runtime.class.getMethod("maxMemory");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Long local27 = (Long) local17.invoke(local21, (Object[]) null);
					Static520.anInt9181 = (int) (local27 / 1048576L) + 1;
				} catch (@Pc(37) Throwable local37) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}
}
