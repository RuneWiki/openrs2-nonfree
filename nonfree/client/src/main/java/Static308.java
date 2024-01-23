import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!nk;")
	public static Class121 aClass121_134;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	public static int anInt5494;

	@OriginalMember(owner = "client!we", name = "D", descriptor = "Lclient!nk;")
	public static Class121 aClass121_135;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "I")
	public static int anInt5489 = -1;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString334 = "Walk here";

	@OriginalMember(owner = "client!we", name = "A", descriptor = "I")
	public static int anInt5497 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BIZI)Ljava/lang/String;")
	public static String method4670(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(45) int local45 = 2;
		for (@Pc(49) int local49 = arg0 / 10; local49 != 0; local49 /= 10) {
			local45++;
		}
		@Pc(62) char[] local62 = new char[local45];
		local62[0] = '+';
		for (@Pc(70) int local70 = local45 - 1; local70 > 0; local70--) {
			@Pc(75) int local75 = arg0;
			arg0 /= 10;
			@Pc(85) int local85 = local75 - arg0 * 10;
			if (local85 >= 10) {
				local62[local70] = (char) (local85 + 87);
			} else {
				local62[local70] = (char) (local85 + 48);
			}
		}
		return new String(local62);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	public static void method4671() {
		Static13.aClass1_Sub14_Sub1_1.method1405();
		@Pc(11) int local11 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static13.aClass1_Sub14_Sub1_1.method1411(2);
		if (local19 == 0) {
			Static263.anIntArray425[Static224.anInt4118++] = 2047;
			return;
		}
		@Pc(38) int local38;
		@Pc(48) int local48;
		if (local19 == 1) {
			local38 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
			Static90.aClass15_Sub5_Sub2_2.method4689(local38, 1);
			local48 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
			if (local48 == 1) {
				Static263.anIntArray425[Static224.anInt4118++] = 2047;
			}
		} else if (local19 == 2) {
			if (Static13.aClass1_Sub14_Sub1_1.method1411(1) == 1) {
				local38 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
				Static90.aClass15_Sub5_Sub2_2.method4689(local38, 2);
				local48 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
				Static90.aClass15_Sub5_Sub2_2.method4689(local48, 2);
			} else {
				local38 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
				Static90.aClass15_Sub5_Sub2_2.method4689(local38, 0);
			}
			local38 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
			if (local38 == 1) {
				Static263.anIntArray425[Static224.anInt4118++] = 2047;
			}
		} else if (local19 == 3) {
			Static65.anInt1300 = Static13.aClass1_Sub14_Sub1_1.method1411(2);
			local38 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
			if (local38 == 1) {
				Static263.anIntArray425[Static224.anInt4118++] = 2047;
			}
			local48 = Static13.aClass1_Sub14_Sub1_1.method1411(7);
			@Pc(166) int local166 = Static13.aClass1_Sub14_Sub1_1.method1411(7);
			@Pc(171) int local171 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
			Static90.aClass15_Sub5_Sub2_2.method4704(local48, local166, local171 == 1);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!nk;Lclient!nk;B)V")
	public static void method4672(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class121 arg1) {
		Static232.aClass121_101 = arg0;
		aClass121_134 = arg1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method4674(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(16) int local16 = Static190.method3095(arg0, arg1);
		@Pc(21) String[] local21 = new String[local16 + 1];
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local16; local27++) {
			@Pc(32) int local32;
			for (local32 = local25; arg1.charAt(local32) != arg0; local32++) {
			}
			local21[local23++] = arg1.substring(local25, local32);
			local25 = local32 + 1;
		}
		local21[local16] = arg1.substring(local25);
		return local21;
	}
}
