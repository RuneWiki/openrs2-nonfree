import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public static int anInt5751;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!ol;")
	public static Class1_Sub22 aClass1_Sub22_2 = new Class1_Sub22(0, -1);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString192 = "flash2:";

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	public static int anInt5750 = 0;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "S")
	public static short aShort49 = 32767;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Lclient!ln;")
	public static Class1_Sub1_Sub3_Sub2 method4530() {
		@Pc(17) byte[] local17 = Static255.aByteArrayArray15[0];
		@Pc(25) int local25 = Static134.anIntArray220[0] * Static255.anIntArray450[0];
		@Pc(81) Class1_Sub1_Sub3_Sub2 local81;
		if (Static189.aBooleanArray41[0]) {
			@Pc(32) int[] local32 = new int[local25];
			@Pc(36) byte[] local36 = Static283.aByteArrayArray16[0];
			for (@Pc(38) int local38 = 0; local38 < local25; local38++) {
				local32[local38] = (local36[local38] & 0xFF) << 24 | Static40.anIntArray59[local17[local38] & 0xFF];
			}
			local81 = new Class1_Sub1_Sub3_Sub2_Sub1(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[0], Static148.anIntArray242[0], Static134.anIntArray220[0], Static255.anIntArray450[0], local32);
		} else {
			@Pc(86) int[] local86 = new int[local25];
			for (@Pc(88) int local88 = 0; local88 < local25; local88++) {
				local86[local88] = Static40.anIntArray59[local17[local88] & 0xFF];
			}
			local81 = new Class1_Sub1_Sub3_Sub2(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[0], Static148.anIntArray242[0], Static134.anIntArray220[0], Static255.anIntArray450[0], local86);
		}
		Static295.method4395();
		return local81;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIB)V")
	public static void method4531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg1 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static62.method1051(arg1, arg2, arg3, arg4);
			}
		} else if (local15 == 0) {
			Static253.method3724(arg3, arg2, arg4, arg0);
		} else {
			@Pc(51) int local51 = (local15 << 12) / local10;
			@Pc(59) int local59 = arg3 - (local51 * arg2 >> 12);
			@Pc(68) int local68;
			@Pc(76) int local76;
			if (Static312.anInt5850 > arg0) {
				local68 = Static312.anInt5850;
				local76 = (Static312.anInt5850 * local51 >> 12) + local59;
			} else if (arg0 <= Static214.anInt4216) {
				local68 = arg0;
				local76 = arg1;
			} else {
				local76 = local59 + (Static214.anInt4216 * local51 >> 12);
				local68 = Static214.anInt4216;
			}
			@Pc(106) int local106;
			@Pc(114) int local114;
			if (Static312.anInt5850 > arg2) {
				local106 = Static312.anInt5850;
				local114 = local59 + (local51 * Static312.anInt5850 >> 12);
			} else if (Static214.anInt4216 < arg2) {
				local106 = Static214.anInt4216;
				local114 = local59 + (local51 * Static214.anInt4216 >> 12);
			} else {
				local114 = arg3;
				local106 = arg2;
			}
			if (local114 < Static240.anInt1319) {
				local114 = Static240.anInt1319;
				local106 = (Static240.anInt1319 - local59 << 12) / local51;
			} else if (Static59.anInt1155 < local114) {
				local114 = Static59.anInt1155;
				local106 = (Static59.anInt1155 - local59 << 12) / local51;
			}
			if (Static240.anInt1319 > local76) {
				local68 = (Static240.anInt1319 - local59 << 12) / local51;
				local76 = Static240.anInt1319;
			} else if (Static59.anInt1155 < local76) {
				local76 = Static59.anInt1155;
				local68 = (Static59.anInt1155 - local59 << 12) / local51;
			}
			Static88.method1303(local106, local68, arg4, local114, local76);
		}
	}
}
