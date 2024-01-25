import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "[Lclient!um;")
	public static Class197[] aClass197Array2;

	@OriginalMember(owner = "client!uk", name = "M", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_138 = new Class85("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZI)V")
	public static void method5613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static290.aFloat20 < Static290.aFloat21) {
			Static290.aFloat20 = (float) ((double) Static290.aFloat20 + (double) Static290.aFloat20 / 30.0D);
			if (Static290.aFloat20 > Static290.aFloat21) {
				Static290.aFloat20 = Static290.aFloat21;
			}
			Static255.method4513();
			Static290.anInt2764 = (int) Static290.aFloat20 >> 1;
			Static290.aByteArrayArrayArray6 = Static270.method4719(Static290.anInt2764);
		} else if (Static290.aFloat21 < Static290.aFloat20) {
			Static290.aFloat20 = (float) ((double) Static290.aFloat20 - (double) Static290.aFloat20 / 30.0D);
			if (Static290.aFloat20 < Static290.aFloat21) {
				Static290.aFloat20 = Static290.aFloat21;
			}
			Static255.method4513();
			Static290.anInt2764 = (int) Static290.aFloat20 >> 1;
			Static290.aByteArrayArrayArray6 = Static270.method4719(Static290.anInt2764);
		}
		if (Static348.anInt6698 != -1 && Static211.anInt4169 != -1) {
			@Pc(79) int local79 = Static348.anInt6698 - Static32.anInt633;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(98) int local98 = Static211.anInt4169 - Static314.anInt6098;
			Static32.anInt633 += local79;
			if (local98 < 2 || local98 > 2) {
				local98 /= 8;
			}
			if (local79 == 0 && local98 == 0) {
				Static348.anInt6698 = -1;
				Static211.anInt4169 = -1;
			}
			Static314.anInt6098 -= -local98;
			Static255.method4513();
		}
		if (Static191.anInt3783 <= 0) {
			Static73.anInt1412 = -1;
			Static320.anInt6195 = -1;
		} else {
			Static229.anInt4619--;
			if (Static229.anInt4619 == 0) {
				Static229.anInt4619 = 100;
				Static191.anInt3783--;
			}
		}
		if (!Static167.aBoolean260 || Static239.aClass103_116 == null) {
			return;
		}
		for (@Pc(161) Class5_Sub34 local161 = (Class5_Sub34) Static239.aClass103_116.method2756(); local161 != null; local161 = (Class5_Sub34) Static239.aClass103_116.method2748()) {
			@Pc(169) Class215 local169 = Static252.method4463(local161.aClass5_Sub32_1.anInt5146);
			if (Static284.anInt5599 == 0 && local161.method4666(arg0, arg1)) {
				if (local169.aStringArray68 != null) {
					if (local169.aStringArray68[4] != null) {
						Static30.method540(local169.aStringArray68[4], 1002, local169.anInt6774, (long) local161.aClass5_Sub32_1.anInt5146, 0, -1, local169.aString65);
					}
					if (local169.aStringArray68[3] != null) {
						Static30.method540(local169.aStringArray68[3], 1003, local169.anInt6774, (long) local161.aClass5_Sub32_1.anInt5146, 0, -1, local169.aString65);
					}
					if (local169.aStringArray68[2] != null) {
						Static30.method540(local169.aStringArray68[2], 1010, local169.anInt6774, (long) local161.aClass5_Sub32_1.anInt5146, 0, -1, local169.aString65);
					}
					if (local169.aStringArray68[1] != null) {
						Static30.method540(local169.aStringArray68[1], 1007, local169.anInt6774, (long) local161.aClass5_Sub32_1.anInt5146, 0, -1, local169.aString65);
					}
					if (local169.aStringArray68[0] != null) {
						Static30.method540(local169.aStringArray68[0], 1012, local169.anInt6774, (long) local161.aClass5_Sub32_1.anInt5146, 0, -1, local169.aString65);
					}
				}
				if (!local161.aClass5_Sub32_1.aBoolean430) {
					local161.aClass5_Sub32_1.aBoolean430 = true;
					Static108.method1905(15, local161.aClass5_Sub32_1.anInt5146, local169.anInt6774);
				}
				if (local161.aClass5_Sub32_1.aBoolean430) {
					Static108.method1905(17, local161.aClass5_Sub32_1.anInt5146, local169.anInt6774);
				}
			} else if (local161.aClass5_Sub32_1.aBoolean430) {
				local161.aClass5_Sub32_1.aBoolean430 = false;
				Static108.method1905(16, local161.aClass5_Sub32_1.anInt5146, local169.anInt6774);
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)I")
	public static int method5614(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)V")
	public static void method5615() {
		@Pc(5) Class109 local5 = Static174.aClass109_39;
		synchronized (Static174.aClass109_39) {
			Static174.aClass109_39.method2850();
		}
		local5 = Static38.aClass109_11;
		synchronized (Static38.aClass109_11) {
			Static38.aClass109_11.method2850();
		}
	}
}
