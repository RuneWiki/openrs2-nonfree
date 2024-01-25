import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	public static int anInt6718 = 0;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!tr;")
	public static final Class195 aClass195_11 = new Class195();

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
	public static final int[] anIntArray562 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ir;)V")
	public static void method5628(@OriginalArg(1) Class100 arg0) {
		Static119.aClass100_55 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!fb;)V")
	public static void method5631(@OriginalArg(1) Class3_Sub4 arg0) {
		if (arg0.aByteArray70.length - arg0.anInt4268 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method3643();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray70.length - arg0.anInt4268 < 2) {
			return;
		}
		@Pc(54) int local54 = arg0.method3649();
		if (local54 * 6 != arg0.aByteArray70.length - arg0.anInt4268) {
			return;
		}
		while (true) {
			@Pc(74) int local74;
			@Pc(78) int local78;
			do {
				do {
					do {
						if (arg0.aByteArray70.length <= arg0.anInt4268) {
							return;
						}
						local74 = arg0.method3649();
						local78 = arg0.method3642();
					} while (local74 >= Static347.anIntArray563.length);
				} while (!Static213.aBooleanArray22[local74]);
			} while (Static189.method3407(local74).aChar3 == '1' && (local78 < -1 || local78 > 1));
			Static347.anIntArray563[local74] = local78;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
	public static void method5633(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = Static51.anInt1101 - Static296.anInt5891;
		if (local13 >= 100) {
			Static261.anInt5200 = 1;
			return;
		}
		@Pc(22) int local22 = (int) Static46.aFloat2;
		if (Static220.anInt4544 >> 8 > local22) {
			local22 = Static220.anInt4544 >> 8;
		}
		if (Static80.aBooleanArray7[4] && Static97.anIntArray121[4] + 128 > local22) {
			local22 = Static97.anIntArray121[4] + 128;
		}
		@Pc(64) int local64 = (int) Static57.aFloat3 + Static2.anInt29 & 0x3FFF;
		Static74.method1128(arg0, local22, Static286.method4919(Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905, Static163.anInt3184) - 50, Static56.anInt1230, local64, (local22 >> 3) * 3 + 600, Static298.anInt5943);
		@Pc(106) float local106 = 1.0F - (float) ((100 - local13) * (-local13 + 100) * (100 - local13)) / 1000000.0F;
		Static154.anInt6368 = (int) (local106 * (float) (Static154.anInt6368 - Static352.anInt6828) + (float) Static352.anInt6828);
		Static175.anInt3631 = (int) ((float) (Static175.anInt3631 - Static293.anInt6248) * local106 + (float) Static293.anInt6248);
		Static110.anInt2324 = (int) ((float) Static114.anInt2403 + local106 * (float) (Static110.anInt2324 - Static114.anInt2403));
		Static210.anInt4317 = (int) ((float) (Static210.anInt4317 - Static267.anInt5386) * local106 + (float) Static267.anInt5386);
		@Pc(156) int local156 = Static350.anInt6797 - Static297.anInt5913;
		if (local156 > 8192) {
			local156 -= 16384;
		} else if (local156 < -8192) {
			local156 += 16384;
		}
		Static350.anInt6797 = (int) ((float) local156 * local106 + (float) Static297.anInt5913);
		Static350.anInt6797 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZILclient!ir;Lclient!ir;)V")
	public static void method5635(@OriginalArg(2) Class100 arg0, @OriginalArg(3) Class100 arg1) {
		Static8.aBoolean17 = true;
		Static312.aClass100_123 = arg1;
		Static302.aClass100_119 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5637(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) String local12 = Static179.method2989(arg0);
		if (local12 == null) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static220.anInt4548; local22++) {
			@Pc(30) String local30 = Static179.method2989(Static12.aStringArray1[local22]);
			if (local30 != null && local30.equals(local12)) {
				Static220.anInt4548--;
				for (@Pc(42) int local42 = local22; local42 < Static220.anInt4548; local42++) {
					Static12.aStringArray1[local42] = Static12.aStringArray1[local42 + 1];
					Static25.aStringArray5[local42] = Static25.aStringArray5[local42 + 1];
					Static267.anIntArray430[local42] = Static267.anIntArray430[local42 + 1];
					Static123.aStringArray14[local42] = Static123.aStringArray14[local42 + 1];
					Static46.anIntArray61[local42] = Static46.anIntArray61[local42 + 1];
					Static63.aBooleanArray6[local42] = Static63.aBooleanArray6[local42 + 1];
				}
				Static294.anInt6362 = Static293.anInt6247;
				Static291.aClass3_Sub4_Sub2_3.method3682(201);
				Static291.aClass3_Sub4_Sub2_3.method3614(Static54.method909(arg0));
				Static291.aClass3_Sub4_Sub2_3.method3624(arg0);
				return;
			}
		}
	}
}
