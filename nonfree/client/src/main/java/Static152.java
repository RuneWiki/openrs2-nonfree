import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1155 = Static161.method2452("flash3:");

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "[Lclient!gb;")
	public static final Class34[] aClass34Array3 = new Class34[26];

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "S")
	public static short aShort38 = 320;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1156 = Static161.method2452("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	public static int anInt3068 = 0;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1157 = aClass20_1155;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1158 = aClass20_1155;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIZI[Lclient!p;II[B)V")
	public static void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class76[] arg6, @OriginalArg(8) int arg7, @OriginalArg(10) byte[] arg8) {
		@Pc(12) int local12 = -1;
		@Pc(17) Class5_Sub6 local17 = new Class5_Sub6(arg8);
		while (true) {
			@Pc(21) int local21 = local17.method3033();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local17.method3033();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local17.method3062();
				@Pc(65) int local65 = local61 & 0x3;
				@Pc(69) int local69 = local61 >> 2;
				@Pc(73) int local73 = local32 >> 12;
				if (arg5 == local73 && arg3 <= local57 && local57 < arg3 + 8 && local51 >= arg2 && arg2 + 8 > local51) {
					@Pc(104) Class5_Sub2_Sub7 local104 = Static63.method1046(local12);
					@Pc(121) int local121 = Static7.method168(local104.anInt519, local51 & 0x7, local57 & 0x7, arg1, local104.anInt517, local65) + arg4;
					@Pc(139) int local139 = arg7 + Static123.method1944(local57 & 0x7, local65, local51 & 0x7, local104.anInt517, local104.anInt519, arg1);
					if (local121 > 0 && local139 > 0 && local121 < 103 && local139 < 103) {
						@Pc(156) Class76 local156 = null;
						@Pc(160) int local160 = arg0;
						if ((Static168.aByteArrayArrayArray13[1][local121][local139] & 0x2) == 2) {
							local160 = arg0 - 1;
						}
						if (local160 >= 0) {
							local156 = arg6[local160];
						}
						Static72.method1183(local139, local156, local65 + arg1 & 0x3, Static14.aBoolean14, arg0, true, local69, arg0, local121, local12);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!dc;Lclient!dc;ILclient!dc;I)V")
	public static void method2289(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) Class20 arg2) {
		Static177.method2680(9, -1, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
	public static void method2293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class5_Sub2_Sub14 local3 = Static201.method1365(arg0);
		@Pc(10) int local10 = local3.anInt2779;
		@Pc(13) int local13 = local3.anInt2778;
		@Pc(16) int local16 = local3.anInt2783;
		@Pc(27) int local27 = Class5_Sub1_Sub20.anIntArray209[local13 - local16];
		if (arg1 < 0 || local27 < arg1) {
			arg1 = 0;
		}
		local27 <<= local16;
		Static139.anIntArray309[local10] = ~local27 & Static139.anIntArray309[local10] | arg1 << local16 & local27;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!wa;Lclient!wa;I)V")
	public static void method2295(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1) {
		Static154.aClass23_56 = arg0;
		Static116.aClass23_43 = arg1;
	}
}
