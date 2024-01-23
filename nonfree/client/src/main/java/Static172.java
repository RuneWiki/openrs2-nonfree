import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!kk;")
	public static Class108 aClass108_5;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
	public static int anInt3326;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
	public static int anInt3329;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "[I")
	public static int[] anIntArray317 = new int[2048];

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "[I")
	public static int[] anIntArray318 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	public static int anInt3327 = 0;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString205 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
	public static void method2721(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static94.aBoolean138 && arg0) {
			local11 = 1;
			local13 = Static11.aByteArrayArray3;
		} else {
			local13 = Static212.aByteArrayArray31;
			local11 = 4;
		}
		for (@Pc(27) int local27 = 0; local27 < local11; local27++) {
			Static16.method763();
			for (@Pc(38) int local38 = 0; local38 < 13; local38++) {
				for (@Pc(43) int local43 = 0; local43 < 13; local43++) {
					@Pc(54) int local54 = Static278.anIntArrayArrayArray15[local27][local38][local43];
					if (local54 != -1) {
						@Pc(63) int local63 = local54 >> 24 & 0x3;
						if (!arg0 || local63 == 0) {
							@Pc(77) int local77 = local54 >> 1 & 0x3;
							@Pc(83) int local83 = local54 >> 3 & 0x7FF;
							@Pc(89) int local89 = local54 >> 14 & 0x3FF;
							@Pc(99) int local99 = (local89 / 8 << 8) + local83 / 8;
							for (@Pc(101) int local101 = 0; local101 < Static278.anIntArray597.length; local101++) {
								if (local99 == Static278.anIntArray597[local101] && local13[local101] != null) {
									Static82.method1471(local27, local38 * 8, Static296.aClass30Array1, local13[local101], local77, (local83 & 0x7) * 8, (local89 & 0x7) * 8, local63, arg0, local43 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V")
	public static void method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class4_Sub3_Sub13 local17 = Static157.method2548(arg0, arg1, arg2);
		if (local17 == null) {
			return;
		}
		Static154.anIntArray272 = new int[local17.anInt2662];
		Static150.aStringArray21 = new String[local17.anInt2660];
		if (local17.anInt2656 == 15 || local17.anInt2656 == 17 || local17.anInt2656 == 16) {
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = 0;
			if (Static224.aClass189_12 != null) {
				local49 = Static224.aClass189_12.anInt5964;
				local51 = Static224.aClass189_12.anInt5892;
			}
			Static154.anIntArray272[1] = Static312.anInt6042 - local51;
			Static154.anIntArray272[0] = Static286.anInt5358 - local49;
		}
		Static88.method1551(200000, local17);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method2724(@OriginalArg(0) Class58 arg0) {
		Static164.anInt3250 = arg0.method1362("runes");
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lclient!fg;")
	public static Class4_Sub3_Sub7 method2726() {
		if (Static121.aClass178_12 == null) {
			return null;
		}
		for (@Pc(22) Class4_Sub3_Sub7 local22 = (Class4_Sub3_Sub7) Static33.aClass132_1.method3263(); local22 != null; local22 = (Class4_Sub3_Sub7) Static33.aClass132_1.method3263()) {
			@Pc(29) Class83 local29 = Static142.method2192(local22.anInt1760);
			if (local29 != null && local29.aBoolean157 && local29.method1811()) {
				return local22;
			}
		}
		return null;
	}
}
