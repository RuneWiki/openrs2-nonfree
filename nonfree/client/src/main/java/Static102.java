import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Lclient!gd;")
	public static Class29_Sub1 aClass29_Sub1_50;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1545 = Static51.method932("(Z");

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1546 = Static51.method932("ams");

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1547 = Static51.method932("<col=ffffff>");

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
	public static int anInt3607 = 0;

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_35 = new CRC32();

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	public static void method2538() {
		aClass10_1546 = null;
		aClass29_Sub1_50 = null;
		anIntArray378 = null;
		aClass10_1547 = null;
		aClass10_1545 = null;
		aCRC32_35 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBII[Lclient!fh;IILclient!ob;[BII)V")
	public static void method2539(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class27[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class60 arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) int local15 = -1;
		@Pc(20) Class2_Sub11 local20 = new Class2_Sub11(arg7);
		while (true) {
			@Pc(24) int local24 = local20.method1469();
			if (local24 == 0) {
				return;
			}
			local15 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local20.method1469();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local20.method1461();
				@Pc(66) int local66 = local62 & 0x3;
				@Pc(70) int local70 = local62 >> 2;
				if (arg5 == local58 && local54 >= arg0 && arg0 + 8 > local54 && arg4 <= local48 && arg4 + 8 > local48) {
					@Pc(105) Class2_Sub1_Sub10 local105 = Static62.method1106(local15);
					@Pc(123) int local123 = arg1 + Static151.method2297(local66, local105.anInt2225, local48 & 0x7, local54 & 0x7, arg8, local105.anInt2210);
					@Pc(140) int local140 = Static65.method1131(local105.anInt2210, arg8, local54 & 0x7, local48 & 0x7, local66, local105.anInt2225) + arg2;
					if (local123 > 0 && local140 > 0 && local123 < 103 && local140 < 103) {
						@Pc(158) int local158 = arg9;
						@Pc(160) Class27 local160 = null;
						if ((Static50.aByteArrayArrayArray3[1][local123][local140] & 0x2) == 2) {
							local158 = arg9 - 1;
						}
						if (local158 >= 0) {
							local160 = arg3[local158];
						}
						Static131.method2088(local66 + arg8 & 0x3, local123, arg9, local140, local70, arg6, local160, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Lclient!fa;")
	public static Class23 method2541(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static90.aClass23ArrayArray1[local3] == null || Static90.aClass23ArrayArray1[local3][local18] == null) {
			@Pc(32) boolean local32 = Static76.method1263(local3);
			if (!local32) {
				return null;
			}
		}
		return Static90.aClass23ArrayArray1[local3][local18];
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)I")
	public static int method2542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(22) int local22 = Static148.method2283(local17, local3);
		@Pc(28) int local28 = arg1 & arg2 - 1;
		@Pc(35) int local35 = Static148.method2283(local17, local3 + 1);
		@Pc(42) int local42 = Static148.method2283(local17 + 1, local3);
		@Pc(51) int local51 = Static148.method2283(local17 + 1, local3 - -1);
		@Pc(58) int local58 = Static129.method2080(local35, arg2, local22, local9);
		@Pc(65) int local65 = Static129.method2080(local51, arg2, local42, local9);
		return Static129.method2080(local65, arg2, local58, local28);
	}
}
