import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!jk;")
	public static Class106 aClass106_1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "[J")
	public static final long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
	public static void method1338(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static103.method2134(arg1.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method1339() {
		if (Static176.anInt3803 == 0) {
			return;
		}
		try {
			if (++Static267.anInt5415 > 1500) {
				if (Static7.aClass148_1 != null) {
					Static7.aClass148_1.method4123();
					Static7.aClass148_1 = null;
				}
				if (Static102.anInt2432 >= 1) {
					Static176.anInt3803 = 0;
					Static353.anInt6727 = -5;
					return;
				}
				Static102.anInt2432++;
				Static267.anInt5415 = 0;
				Static176.anInt3803 = 1;
				if (Static154.anInt3393 == Static41.anInt1308) {
					Static154.anInt3393 = Static233.anInt5576;
				} else {
					Static154.anInt3393 = Static41.anInt1308;
				}
			}
			if (Static176.anInt3803 == 1) {
				Static7.aClass162_1 = Static15.aClass143_1.method3889(Static154.anInt3393, Static31.aString16);
				Static176.anInt3803 = 2;
			}
			@Pc(125) int local125;
			if (Static176.anInt3803 == 2) {
				if (Static7.aClass162_1.anInt4801 == 2) {
					throw new IOException();
				}
				if (Static7.aClass162_1.anInt4801 != 1) {
					return;
				}
				Static7.aClass148_1 = new Class148((Socket) Static7.aClass162_1.anObject5, Static15.aClass143_1);
				Static7.aClass162_1 = null;
				Static7.aClass148_1.method4122(Static342.aClass1_Sub8_Sub1_7.anInt5182, Static342.aClass1_Sub8_Sub1_7.aByteArray81);
				if (Static129.aClass7_2 != null) {
					Static129.aClass7_2.method5559();
				}
				if (Static88.aClass7_1 != null) {
					Static88.aClass7_1.method5559();
				}
				local125 = Static7.aClass148_1.method4127();
				if (Static129.aClass7_2 != null) {
					Static129.aClass7_2.method5559();
				}
				if (Static88.aClass7_1 != null) {
					Static88.aClass7_1.method5559();
				}
				if (local125 != 101) {
					Static176.anInt3803 = 0;
					Static353.anInt6727 = local125;
					Static7.aClass148_1.method4123();
					Static7.aClass148_1 = null;
					return;
				}
				Static176.anInt3803 = 3;
			}
			if (Static176.anInt3803 == 3 && Static7.aClass148_1.method4125() >= 2) {
				local125 = Static7.aClass148_1.method4127() << 8 | Static7.aClass148_1.method4127();
				Static39.method918(local125);
				if (Static292.anInt4638 == -1) {
					Static353.anInt6727 = 6;
					Static176.anInt3803 = 0;
					Static7.aClass148_1.method4123();
					Static7.aClass148_1 = null;
				} else {
					Static176.anInt3803 = 0;
					Static7.aClass148_1.method4123();
					Static7.aClass148_1 = null;
					Static287.method4915();
				}
			}
		} catch (@Pc(204) IOException local204) {
			if (Static7.aClass148_1 != null) {
				Static7.aClass148_1.method4123();
				Static7.aClass148_1 = null;
			}
			if (Static102.anInt2432 >= 1) {
				Static353.anInt6727 = -4;
				Static176.anInt3803 = 0;
			} else {
				Static267.anInt5415 = 0;
				Static176.anInt3803 = 1;
				Static102.anInt2432++;
				if (Static154.anInt3393 == Static41.anInt1308) {
					Static154.anInt3393 = Static233.anInt5576;
				} else {
					Static154.anInt3393 = Static41.anInt1308;
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public static void method1340() {
		@Pc(5) Class87 local5 = Static204.aClass87_38;
		synchronized (Static204.aClass87_38) {
			Static204.aClass87_38.method2485();
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public static void method1344() {
		if (Static102.anIntArray226 != null) {
			return;
		}
		Static102.anIntArray226 = new int[65536];
		@Pc(26) double local26 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < 512; local30++) {
			@Pc(43) float local43 = ((float) (local30 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local30 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
				@Pc(61) float local61 = (float) local54 / 128.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(71) float local71 = local43 / 60.0F;
				@Pc(74) int local74 = (int) local71;
				@Pc(78) int local78 = local74 % 6;
				@Pc(83) float local83 = local71 - (float) local74;
				@Pc(89) float local89 = (1.0F - local52) * local61;
				@Pc(97) float local97 = local61 * (1.0F - local83 * local52);
				@Pc(108) float local108 = (1.0F - (1.0F - local83) * local52) * local61;
				if (local78 == 0) {
					local63 = local61;
					local65 = local108;
					local67 = local89;
				} else if (local78 == 1) {
					local63 = local97;
					local67 = local89;
					local65 = local61;
				} else if (local78 == 2) {
					local65 = local61;
					local67 = local108;
					local63 = local89;
				} else if (local78 == 3) {
					local63 = local89;
					local65 = local97;
					local67 = local61;
				} else if (local78 == 4) {
					local63 = local108;
					local65 = local89;
					local67 = local61;
				} else if (local78 == 5) {
					local65 = local89;
					local63 = local61;
					local67 = local97;
				}
				local63 = (float) Math.pow((double) local63, local26);
				local65 = (float) Math.pow((double) local65, local26);
				local67 = (float) Math.pow((double) local67, local26);
				@Pc(198) int local198 = (int) (local63 * 256.0F);
				@Pc(203) int local203 = (int) (local65 * 256.0F);
				@Pc(208) int local208 = (int) (local67 * 256.0F);
				@Pc(220) int local220 = (local203 << 8) + (local198 << 16) + local208 - 16777216;
				Static102.anIntArray226[local28++] = local220;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)I")
	public static int method1345(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
	public static void method1346(@OriginalArg(1) int arg0) {
		Static119.anInt2749 = arg0;
		Static88.aClass87_18.method2485();
	}
}
