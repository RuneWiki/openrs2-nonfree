import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "B")
	public static byte aByte11;

	@OriginalMember(owner = "client!bu", name = "h", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_23 = new Class62("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "[B")
	public static final byte[] aByteArray20 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!bu", name = "p", descriptor = "[I")
	public static final int[] anIntArray57 = new int[8];

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)Z")
	public static boolean method533(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static4.anInt135; local1 < Static73.anInt1624; local1++) {
			@Pc(6) Class188[][] local6 = Static45.aClass188ArrayArrayArray5[local1];
			for (@Pc(9) int local9 = -Static113.anInt5764; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static284.anInt5626 + local9;
				@Pc(18) int local18 = Static284.anInt5626 - local9;
				if (local14 >= Static94.anInt2021 || local18 < Static310.anInt5683) {
					for (@Pc(27) int local27 = -Static113.anInt5764; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static373.anInt6861 + local27;
						@Pc(36) int local36 = Static373.anInt6861 - local27;
						@Pc(48) Class188 local48;
						if (local14 >= Static94.anInt2021) {
							if (local32 >= Static287.anInt5307) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean378) {
									Static305.aBoolean490 = arg0;
									Static185.aClass19_1.method5307(local48);
									Static185.aClass19_1.method5298();
								}
							}
							if (local36 < Static286.anInt5279) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean378) {
									Static305.aBoolean490 = arg0;
									Static185.aClass19_1.method5307(local48);
									Static185.aClass19_1.method5298();
								}
							}
						}
						if (local18 < Static310.anInt5683) {
							if (local32 >= Static287.anInt5307) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean378) {
									Static305.aBoolean490 = arg0;
									Static185.aClass19_1.method5307(local48);
									Static185.aClass19_1.method5298();
								}
							}
							if (local36 < Static286.anInt5279) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean378) {
									Static305.aBoolean490 = arg0;
									Static185.aClass19_1.method5307(local48);
									Static185.aClass19_1.method5298();
								}
							}
						}
						if (Static132.anInt2870 == 0) {
							if (Static305.aBoolean491) {
								Static185.aClass19_1.method5303(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!ab;BI)V")
	public static void method534(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(3) int arg2) {
		Static54.anInt1172 = arg0;
		Static128.anInt2774 = arg2;
		Static187.aClass3_9 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)V")
	public static void method537(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub7_Sub2 local12 = Static328.method5290(7, arg0);
		local12.method1197();
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V")
	public static void method540() {
		Static279.method4641(Static383.aClass48_9, (long) Static339.anInt6265);
		if (Static388.anInt7080 != -1) {
			Static311.method2432(Static388.anInt7080);
		}
		for (@Pc(20) int local20 = 0; local20 < Static198.anInt4111; local20++) {
			if (Static93.aBooleanArray10[local20]) {
				Static71.aBooleanArray8[local20] = true;
			}
			Static52.aBooleanArray13[local20] = Static93.aBooleanArray10[local20];
			Static93.aBooleanArray10[local20] = false;
		}
		Static301.anInt5605 = Static339.anInt6265;
		if (Static383.aClass48_9.method2453()) {
			Static383.aBoolean488 = true;
		}
		if (Static388.anInt7080 != -1) {
			Static198.anInt4111 = 0;
			Static182.method3402();
		}
		Static383.aClass48_9.method2505();
		Static145.method4761(Static387.anInt7048);
		Static278.anInt5166 = 0;
	}
}
