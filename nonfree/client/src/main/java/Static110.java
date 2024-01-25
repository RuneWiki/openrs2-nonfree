import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	public static int anInt2169;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	public static int anInt2166 = 0;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	public static int anInt2171 = -1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
	public static void method1761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static226.aFloat136 > Static226.aFloat137) {
			Static226.aFloat137 = (float) ((double) Static226.aFloat137 + (double) Static226.aFloat137 / 30.0D);
			if (Static226.aFloat137 > Static226.aFloat136) {
				Static226.aFloat137 = Static226.aFloat136;
			}
			Static111.method1765();
			Static226.anInt6308 = (int) Static226.aFloat137 >> 1;
			Static226.aByteArrayArrayArray16 = Static474.method7343(Static226.anInt6308);
		} else if (Static226.aFloat137 > Static226.aFloat136) {
			Static226.aFloat137 = (float) ((double) Static226.aFloat137 - (double) Static226.aFloat137 / 30.0D);
			if (Static226.aFloat137 < Static226.aFloat136) {
				Static226.aFloat137 = Static226.aFloat136;
			}
			Static111.method1765();
			Static226.anInt6308 = (int) Static226.aFloat137 >> 1;
			Static226.aByteArrayArrayArray16 = Static474.method7343(Static226.anInt6308);
		}
		if (Static493.anInt8491 != -1 && Static134.anInt2584 != -1) {
			@Pc(87) int local87 = Static493.anInt8491 - Static71.anInt1407;
			if (local87 < 2 || local87 > 2) {
				local87 /= 8;
			}
			@Pc(104) int local104 = Static134.anInt2584 - Static197.anInt6246;
			Static71.anInt1407 += local87;
			if (local104 < 2 || local104 > 2) {
				local104 /= 8;
			}
			if (local87 == 0 && local104 == 0) {
				Static493.anInt8491 = -1;
				Static134.anInt2584 = -1;
			}
			Static197.anInt6246 += local104;
			Static111.method1765();
		}
		if (Static95.anInt2005 > 0) {
			Static520.anInt8816--;
			if (Static520.anInt8816 == 0) {
				Static520.anInt8816 = 100;
				Static95.anInt2005--;
			}
		} else {
			Static355.anInt5919 = -1;
			Static58.anInt1101 = -1;
		}
		if (!Static276.aBoolean361 || Static497.aClass353_44 == null) {
			return;
		}
		for (@Pc(172) Class1_Sub9 local172 = (Class1_Sub9) Static497.aClass353_44.method7677(); local172 != null; local172 = (Class1_Sub9) Static497.aClass353_44.method7687()) {
			@Pc(181) Class310 local181 = Static226.aClass273_2.method5840(local172.aClass1_Sub32_1.anInt5300);
			if (local172.method1204(arg0, arg1)) {
				if (local181.aStringArray34 != null) {
					if (local181.aStringArray34[4] != null) {
						Static140.method7612(local181.anInt8130, local181.aString83, 0, true, 1008, -1, false, -1, (long) local172.aClass1_Sub32_1.anInt5300, local181.aStringArray34[4]);
					}
					if (local181.aStringArray34[3] != null) {
						Static140.method7612(local181.anInt8130, local181.aString83, 0, true, 1011, -1, false, -1, (long) local172.aClass1_Sub32_1.anInt5300, local181.aStringArray34[3]);
					}
					if (local181.aStringArray34[2] != null) {
						Static140.method7612(local181.anInt8130, local181.aString83, 0, true, 1012, -1, false, -1, (long) local172.aClass1_Sub32_1.anInt5300, local181.aStringArray34[2]);
					}
					if (local181.aStringArray34[1] != null) {
						Static140.method7612(local181.anInt8130, local181.aString83, 0, true, 1004, -1, false, -1, (long) local172.aClass1_Sub32_1.anInt5300, local181.aStringArray34[1]);
					}
					if (local181.aStringArray34[0] != null) {
						Static140.method7612(local181.anInt8130, local181.aString83, 0, true, 1003, -1, false, -1, (long) local172.aClass1_Sub32_1.anInt5300, local181.aStringArray34[0]);
					}
				}
				if (!local172.aClass1_Sub32_1.aBoolean426) {
					local172.aClass1_Sub32_1.aBoolean426 = true;
					Static80.method1458(Static432.aClass324_42, local172.aClass1_Sub32_1.anInt5300, local181.anInt8130);
				}
				if (local172.aClass1_Sub32_1.aBoolean426) {
					Static80.method1458(Static580.aClass324_53, local172.aClass1_Sub32_1.anInt5300, local181.anInt8130);
				}
			} else if (local172.aClass1_Sub32_1.aBoolean426) {
				local172.aClass1_Sub32_1.aBoolean426 = false;
				Static80.method1458(Static21.aClass324_52, local172.aClass1_Sub32_1.anInt5300, local181.anInt8130);
			}
		}
	}
}
