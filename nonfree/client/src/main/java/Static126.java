import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "Lclient!ev;")
	public static final Class92 aClass92_1 = new Class92();

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "Lclient!ev;")
	public static final Class92 aClass92_2 = new Class92();

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "Lclient!ev;")
	public static final Class92 aClass92_3 = new Class92();

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Lclient!ev;")
	public static final Class92 aClass92_4 = new Class92();

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
	public static int anInt2904 = 0;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
	public static void method2518() {
		Static39.anInt1074 = 0;
		@Pc(9) int local9 = Static89.aClass3_Sub7_Sub1_2.method6541();
		@Pc(13) int local13 = Static89.aClass3_Sub7_Sub1_2.method6538();
		@Pc(19) int local19 = Static89.aClass3_Sub7_Sub1_2.method6535();
		@Pc(30) boolean local30 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
		Static481.method7377();
		Static505.method7608(local13);
		@Pc(42) int local42 = (Static79.anInt10464 - Static89.aClass3_Sub7_Sub1_2.anInt7869) / 16;
		Static261.anIntArrayArray34 = new int[local42][4];
		@Pc(51) int local51;
		for (@Pc(48) int local48 = 0; local48 < local42; local48++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static261.anIntArrayArray34[local48][local51] = Static89.aClass3_Sub7_Sub1_2.method6497();
			}
		}
		Static177.aByteArrayArray16 = null;
		Static558.aByteArrayArray26 = new byte[local42][];
		Static511.anIntArray616 = null;
		Static478.anIntArray584 = new int[local42];
		Static577.anIntArray661 = new int[local42];
		Static523.aByteArrayArray30 = new byte[local42][];
		Static537.anIntArray654 = new int[local42];
		Static349.aByteArrayArray17 = new byte[local42][];
		Static215.anIntArray376 = new int[local42];
		Static256.aByteArrayArray19 = new byte[local42][];
		Static422.anIntArray504 = new int[local42];
		local42 = 0;
		for (local51 = (local19 - (Static460.anInt8640 >> 4)) / 8; local51 <= (local19 + (Static460.anInt8640 >> 4)) / 8; local51++) {
			for (@Pc(124) int local124 = (local9 - (Static292.anInt7682 >> 4)) / 8; local124 <= (local9 + (Static292.anInt7682 >> 4)) / 8; local124++) {
				Static478.anIntArray584[local42] = (local51 << 8) + local124;
				Static537.anIntArray654[local42] = Static136.aClass254_43.method6414("m" + local51 + "_" + local124);
				Static422.anIntArray504[local42] = Static136.aClass254_43.method6414("l" + local51 + "_" + local124);
				Static215.anIntArray376[local42] = Static136.aClass254_43.method6414("um" + local51 + "_" + local124);
				Static577.anIntArray661[local42] = Static136.aClass254_43.method6414("ul" + local51 + "_" + local124);
				local42++;
			}
		}
		Static430.method6817(11, local19, local9, local30);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIII)I")
	public static int method2520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(10) int local10 = arg2;
			arg2 = arg4;
			arg4 = local10;
		}
		@Pc(18) int local18 = arg0 & 0x3;
		if (local18 == 0) {
			return arg5;
		} else if (local18 == 1) {
			return arg1;
		} else if (local18 == 2) {
			return 1 + 7 - arg2 - arg5;
		} else {
			return 1 + 7 - arg4 - arg1;
		}
	}
}
