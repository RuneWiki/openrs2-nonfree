import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!w", name = "h", descriptor = "Lclient!be;")
	public static Class11_Sub1 aClass11_Sub1_6;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!w;")
	public static Class15 aClass15_19;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!va;")
	private static Class61 aClass61_399 = Static88.method1421("Existing user");

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Lclient!va;")
	private static Class61 aClass61_400 = Static88.method1421("Off");

	@OriginalMember(owner = "client!w", name = "o", descriptor = "Lclient!va;")
	private static Class61 aClass61_403 = Static88.method1421("glow3:");

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lclient!va;")
	public static Class61 aClass61_401 = aClass61_403;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "Lclient!va;")
	public static Class61 aClass61_402 = aClass61_399;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	public static int anInt993 = 0;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Lclient!va;")
	public static Class61 aClass61_404 = aClass61_400;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Lclient!d;")
	public static Class10_Sub1_Sub4 method591(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static104.aClass10_Sub1_Sub4ArrayArray1[local7] == null || Static104.aClass10_Sub1_Sub4ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static25.method491(local7);
			if (!local25) {
				return null;
			}
		}
		return Static104.aClass10_Sub1_Sub4ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	public static void method592() {
		aClass61_404 = null;
		aClass61_403 = null;
		aClass61_399 = null;
		aClass15_19 = null;
		aClass61_401 = null;
		aClass61_402 = null;
		aClass61_400 = null;
		aClass11_Sub1_6 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IJ)V")
	public static void method593(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static80.anInt2155; local17++) {
			if (Static57.aLongArray4[local17] == arg0) {
				Static80.anInt2155--;
				Static80.aBoolean94 = true;
				for (@Pc(37) int local37 = local17; local37 < Static80.anInt2155; local37++) {
					Static57.aLongArray4[local37] = Static57.aLongArray4[local37 + 1];
				}
				Static50.aClass10_Sub10_Sub1_3.method1167(87);
				Static50.aClass10_Sub10_Sub1_3.method1125(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)V")
	public static void method595(@OriginalArg(1) int arg0) {
		Static43.method693(arg0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method596() {
		@Pc(20) int local20;
		for (@Pc(13) int local13 = 10; local13 < 117; local13++) {
			local20 = (int) (Math.random() * 100.0D);
			if (local20 < 50) {
				Static43.anIntArray134[local13 + 32512] = 255;
			}
		}
		@Pc(59) int local59;
		@Pc(52) int local52;
		@Pc(65) int local65;
		for (local20 = 0; local20 < 100; local20++) {
			local52 = (int) (Math.random() * 128.0D) + 128;
			local59 = (int) (Math.random() * 124.0D) + 2;
			local65 = local59 + (local52 << 7);
			Static43.anIntArray134[local65] = 192;
		}
		for (local59 = 1; local59 < 255; local59++) {
			for (local52 = 1; local52 < 127; local52++) {
				local65 = (local59 << 7) + local52;
				Static41.anIntArray129[local65] = (Static43.anIntArray134[local65 + 1] + Static43.anIntArray134[local65 - 1] + Static43.anIntArray134[local65 - 128] + Static43.anIntArray134[local65 + 128]) / 4;
			}
		}
		Static34.anInt1004 += 128;
		if (Static34.anInt1004 > Static63.anIntArray58.length) {
			local52 = (int) (Math.random() * 12.0D);
			Static34.anInt1004 -= Static63.anIntArray58.length;
			Static57.method834(Static36.aClass10_Sub1_Sub1_Sub2Array4[local52]);
		}
		@Pc(166) int local166;
		for (local52 = 1; local52 < 255; local52++) {
			for (local65 = 1; local65 < 127; local65++) {
				local166 = local65 + (local52 << 7);
				@Pc(186) int local186 = Static41.anIntArray129[local166 + 128] - Static63.anIntArray58[Static63.anIntArray58.length - 1 & local166 - -Static34.anInt1004] / 5;
				if (local186 < 0) {
					local186 = 0;
				}
				Static43.anIntArray134[local166] = local186;
			}
		}
		for (local65 = 0; local65 < 255; local65++) {
			Static39.anIntArray43[local65] = Static39.anIntArray43[local65 + 1];
		}
		Static39.anIntArray43[255] = (int) (Math.sin((double) Static95.anInt2442 / 14.0D) * 16.0D + Math.sin((double) Static95.anInt2442 / 15.0D) * 14.0D + Math.sin((double) Static95.anInt2442 / 16.0D) * 12.0D);
		if (Static83.anInt2228 > 0) {
			Static83.anInt2228 -= 4;
		}
		if (Static9.anInt289 > 0) {
			Static9.anInt289 -= 4;
		}
		if (Static83.anInt2228 != 0 || Static9.anInt289 != 0) {
			return;
		}
		local166 = (int) (Math.random() * 2000.0D);
		if (local166 == 1) {
			Static9.anInt289 = 1024;
		}
		if (local166 == 0) {
			Static83.anInt2228 = 1024;
			return;
		}
	}
}
