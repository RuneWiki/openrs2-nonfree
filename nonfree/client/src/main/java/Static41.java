import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!i", name = "X", descriptor = "Lclient!p;")
	public static Class45 aClass45_20;

	@OriginalMember(owner = "client!i", name = "Z", descriptor = "Lclient!ud;")
	public static Class5 aClass5_13;

	@OriginalMember(owner = "client!i", name = "cb", descriptor = "Lclient!bb;")
	public static Class7 aClass7_4;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "Lclient!qc;")
	public static Class47 aClass47_10 = new Class47(10);

	@OriginalMember(owner = "client!i", name = "R", descriptor = "Lclient!o;")
	public static Class40 aClass40_305 = Static13.method257("Enter your username (V password)3");

	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	public static int anInt1012 = -1;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "Lclient!qc;")
	public static Class47 aClass47_11 = new Class47(64);

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "Lclient!o;")
	public static Class40 aClass40_306 = Static13.method257(")3");

	@OriginalMember(owner = "client!i", name = "bb", descriptor = "Lclient!o;")
	public static Class40 aClass40_307 = Static13.method257("compass");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZIIII)V")
	public static void method752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg1 & 0x7FF;
		@Pc(12) int local12 = 0;
		@Pc(19) int local19 = 2048 - arg3 & 0x7FF;
		@Pc(21) int local21 = 0;
		@Pc(28) int local28 = arg5;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(49) int local49;
		if (local19 != 0) {
			local34 = Static71.anIntArray386[local19];
			local38 = Static71.anIntArray402[local19];
			local49 = local38 * 0 - arg5 * local34 >> 16;
			local28 = local38 * arg5 + local34 * 0 >> 16;
			local21 = local49;
		}
		if (local10 != 0) {
			local34 = Static71.anIntArray386[local10];
			local38 = Static71.anIntArray402[local10];
			local49 = local38 * 0 + local28 * local34 >> 16;
			local28 = local28 * local38 - local34 * 0 >> 16;
			local12 = local49;
		}
		Static35.anInt824 = arg3;
		Static81.anInt1935 = arg4 - local21;
		Static15.anInt1863 = arg0 - local28;
		Static48.anInt1114 = arg2 - local12;
		Static27.anInt686 = arg1;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
	public static void method753() {
		aClass40_307 = null;
		aClass40_306 = null;
		aClass7_4 = null;
		aClass45_20 = null;
		aClass5_13 = null;
		aClass47_10 = null;
		aClass47_11 = null;
		aClass40_305 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lclient!sb;")
	public static Class2_Sub2_Sub14 method754(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub2_Sub14 local14 = (Class2_Sub2_Sub14) Static3.aClass47_2.method1325((long) arg0);
		if (local14 != null) {
			return local14;
		}
		local14 = Static106.method1744(Static37.aClass5_12, Static85.aClass5_27, arg0);
		if (local14 != null) {
			Static3.aClass47_2.method1332((long) arg0, local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V")
	public static void method755() {
		@Pc(12) int local12;
		for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
			local12 = (int) (Math.random() * 100.0D);
			if (local12 < 50) {
				Static103.anIntArray547[local5 + 32512] = 255;
			}
		}
		@Pc(50) int local50;
		@Pc(43) int local43;
		@Pc(57) int local57;
		for (local12 = 0; local12 < 100; local12++) {
			local43 = (int) (Math.random() * 128.0D) + 128;
			local50 = (int) (Math.random() * 124.0D) + 2;
			local57 = local50 + (local43 << 7);
			Static103.anIntArray547[local57] = 192;
		}
		for (local50 = 1; local50 < 255; local50++) {
			for (local43 = 1; local43 < 127; local43++) {
				local57 = local43 + (local50 << 7);
				Static1.anIntArray1[local57] = (Static103.anIntArray547[local57 + 128] + Static103.anIntArray547[local57 + 1] + Static103.anIntArray547[local57 - 1] + Static103.anIntArray547[local57 - 128]) / 4;
			}
		}
		Static3.anInt50 += 128;
		if (Static15.anIntArray414.length < Static3.anInt50) {
			Static3.anInt50 -= Static15.anIntArray414.length;
			local43 = (int) (Math.random() * 12.0D);
			Static24.method502(Static49.aClass2_Sub2_Sub2_Sub3Array14[local43]);
		}
		@Pc(166) int local166;
		for (local43 = 1; local43 < 255; local43++) {
			for (local57 = 1; local57 < 127; local57++) {
				local166 = local57 + (local43 << 7);
				@Pc(187) int local187 = Static1.anIntArray1[local166 + 128] - Static15.anIntArray414[Static15.anIntArray414.length - 1 & local166 - -Static3.anInt50] / 5;
				if (local187 < 0) {
					local187 = 0;
				}
				Static103.anIntArray547[local166] = local187;
			}
		}
		for (local57 = 0; local57 < 255; local57++) {
			Static33.anIntArray152[local57] = Static33.anIntArray152[local57 + 1];
		}
		Static33.anIntArray152[255] = (int) (Math.sin((double) Static107.anInt2511 / 14.0D) * 16.0D + Math.sin((double) Static107.anInt2511 / 15.0D) * 14.0D + Math.sin((double) Static107.anInt2511 / 16.0D) * 12.0D);
		if (Static87.anInt2061 > 0) {
			Static87.anInt2061 -= 4;
		}
		if (Static49.anInt2254 > 0) {
			Static49.anInt2254 -= 4;
		}
		if (Static87.anInt2061 != 0 || Static49.anInt2254 != 0) {
			return;
		}
		local166 = (int) (Math.random() * 2000.0D);
		if (local166 == 0) {
			Static87.anInt2061 = 1024;
		}
		if (local166 == 1) {
			Static49.anInt2254 = 1024;
			return;
		}
	}
}
