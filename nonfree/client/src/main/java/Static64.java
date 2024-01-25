import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	public static int anInt1797;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
	public static int anInt1798;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public static int anInt1792 = 0;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Lclient!wp;")
	public static final Class217 aClass217_2 = new Class217();

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	public static int anInt1799 = 0;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method1564() {
		Static342.aClass1_Sub8_Sub1_7.method3229(5);
		Static342.aClass1_Sub8_Sub1_7.method4562(Static44.method1024());
		Static342.aClass1_Sub8_Sub1_7.method4542(Static194.anInt4145);
		Static342.aClass1_Sub8_Sub1_7.method4542(Static271.anInt5530);
		Static342.aClass1_Sub8_Sub1_7.method4562(Static322.anInt6180);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
	public static void method1565(@OriginalArg(1) int arg0) {
		Static303.anInt2318 = arg0;
		Static82.aClass87_17.method2485();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
	public static void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16;
		for (@Pc(12) int local12 = arg0; local12 < arg0 + arg1; local12++) {
			for (local16 = arg3; local16 < arg3 + arg4; local16++) {
				if (local16 >= 0 && local16 < Static233.anInt5573 && local12 >= 0 && local12 < Static134.anInt2971) {
					Static251.anIntArrayArrayArray15[arg2][local16][local12] = arg2 <= 0 ? 0 : Static251.anIntArrayArrayArray15[arg2 - 1][local16][local12] - 240;
				}
			}
		}
		if (arg3 > 0 && Static233.anInt5573 > arg3) {
			for (local16 = arg0 + 1; local16 < arg0 + arg1; local16++) {
				if (local16 >= 0 && local16 < Static134.anInt2971) {
					Static251.anIntArrayArrayArray15[arg2][arg3][local16] = Static251.anIntArrayArrayArray15[arg2][arg3 - 1][local16];
				}
			}
		}
		if (arg0 > 0 && arg0 < Static134.anInt2971) {
			for (local16 = arg3 + 1; local16 < arg4 + arg3; local16++) {
				if (local16 >= 0 && local16 < Static233.anInt5573) {
					Static251.anIntArrayArrayArray15[arg2][local16][arg0] = Static251.anIntArrayArrayArray15[arg2][local16][arg0 - 1];
				}
			}
		}
		if (arg3 < 0 || arg0 < 0 || Static233.anInt5573 <= arg3 || arg0 >= Static134.anInt2971) {
			return;
		}
		if (arg2 != 0) {
			if (arg3 > 0 && Static251.anIntArrayArrayArray15[arg2 - 1][arg3 - 1][arg0] != Static251.anIntArrayArrayArray15[arg2][arg3 - 1][arg0]) {
				Static251.anIntArrayArrayArray15[arg2][arg3][arg0] = Static251.anIntArrayArrayArray15[arg2][arg3 - 1][arg0];
				return;
			}
			if (arg0 > 0 && Static251.anIntArrayArrayArray15[arg2 - 1][arg3][arg0 - 1] != Static251.anIntArrayArrayArray15[arg2][arg3][arg0 - 1]) {
				Static251.anIntArrayArrayArray15[arg2][arg3][arg0] = Static251.anIntArrayArrayArray15[arg2][arg3][arg0 - 1];
				return;
			}
			if (arg3 > 0 && arg0 > 0 && Static251.anIntArrayArrayArray15[arg2][arg3 - 1][arg0 - 1] != Static251.anIntArrayArrayArray15[arg2 - 1][arg3 - 1][arg0 - 1]) {
				Static251.anIntArrayArrayArray15[arg2][arg3][arg0] = Static251.anIntArrayArrayArray15[arg2][arg3 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && Static251.anIntArrayArrayArray15[arg2][arg3 - 1][arg0] != 0) {
			Static251.anIntArrayArrayArray15[arg2][arg3][arg0] = Static251.anIntArrayArrayArray15[arg2][arg3 - 1][arg0];
			return;
		}
		if (arg0 > 0 && Static251.anIntArrayArrayArray15[arg2][arg3][arg0 - 1] != 0) {
			Static251.anIntArrayArrayArray15[arg2][arg3][arg0] = Static251.anIntArrayArrayArray15[arg2][arg3][arg0 - 1];
			return;
		}
		if (arg3 > 0 && arg0 > 0 && Static251.anIntArrayArrayArray15[arg2][arg3 - 1][arg0 - 1] != 0) {
			Static251.anIntArrayArrayArray15[arg2][arg3][arg0] = Static251.anIntArrayArrayArray15[arg2][arg3 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)S")
	public static short method1567(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(43) int local43 = local24 <= 64 ? local20 * local24 >> 7 : local20 * (127 - local24) >> 7;
		@Pc(47) int local47 = local43 + local24;
		@Pc(55) int local55;
		if (local47 == 0) {
			local55 = local43 << 1;
		} else {
			local55 = (local43 << 8) / local47;
		}
		return (short) (local47 | local14 << 10 | local55 >> 4 << 7);
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	public static void method1568() {
		if (!Static271.method4748()) {
			return;
		}
		if (Static263.aStringArray56 == null) {
			Static208.method3955();
		}
		Static28.anInt1015 = 0;
		Static344.anIntArray525 = new int[100];
		Static18.aBooleanArray2 = new boolean[100];
		Static72.aBoolean182 = true;
		Static158.anIntArray314 = new int[100];
		Static31.anIntArray95 = new int[100];
		for (@Pc(37) int local37 = 0; local37 < 100; local37++) {
			Static344.anIntArray525[local37] = (int) (Math.random() * (double) Static194.anInt4145);
			Static158.anIntArray314[local37] = (int) (Math.random() * 350.0D);
			Static31.anIntArray95[local37] = (int) (Math.random() * 102.0D);
			Static18.aBooleanArray2[local37] = Math.random() < 0.5D;
		}
		try {
			Static154.aClipboard1 = Static93.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(81) Exception local81) {
		}
	}
}
