import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!id", name = "q", descriptor = "[Lclient!cha;")
	public static Class51_Sub1[] aClass51_Sub1Array2;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	public static int anInt4574 = 0;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Z")
	public static boolean aBoolean325 = true;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)[Lclient!taa;")
	public static Class314[] method3956() {
		return new Class314[] { Static310.aClass314_2, Static432.aClass314_4, Static378.aClass314_3 };
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	public static void method3957(@OriginalArg(1) int arg0) {
		Static19.anInt323 = arg0;
		Static155.anInt2829 = 2;
		if (Static362.aString82 == null) {
			Static319.method5323(35);
		} else {
			@Pc(20) Class6_Sub40 local20 = new Class6_Sub40(Static549.method7972(Static414.method6517(Static362.aString82)));
			@Pc(24) long local24 = local20.method8603();
			Static492.aLong220 = local20.method8603();
			Static269.method4786("", true, Static340.method5776(local24));
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BIB)[B")
	public static byte[] method3959(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(9) byte[] local9;
		if (arg0 <= 0) {
			local9 = arg1;
		} else {
			local9 = new byte[arg2];
			for (@Pc(16) int local16 = 0; local16 < arg2; local16++) {
				local9[local16] = arg1[local16 + arg0];
			}
		}
		@Pc(34) Class174 local34 = new Class174();
		local34.method5064();
		local34.method5059((long) (arg2 * 8), local9);
		@Pc(48) byte[] local48 = new byte[64];
		local34.method5062(local48);
		return local48;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IBLclient!rg;)Ljava/lang/String;")
	public static String method3960(@OriginalArg(2) Class6_Sub40 arg0) {
		try {
			@Pc(12) int local12 = arg0.method8587();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(24) byte[] local24 = new byte[local12];
			arg0.anInt10169 += Static517.aClass169_1.method4853(local12, arg0.anInt10169, 0, local24, arg0.aByteArray113);
			return Static510.method7547(local12, 0, local24);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBIIII)V")
	public static void method3961(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(10) Class20_Sub10 local10 = (Class20_Sub10) Static78.aClass81_1.method2118(); local10 != null; local10 = (Class20_Sub10) Static78.aClass81_1.method2128()) {
			if (Static113.anInt2243 >= local10.anInt8738) {
				local10.method9004();
			} else {
				Static269.method4785(arg3 >> 1, (local10.anInt8737 << 9) + 256, local10.anInt8735, arg1 >> 1, (local10.anInt8736 << 9) + 256, local10.anInt8739 * 2);
				Static173.aClass50_5.method5734(arg0 + Static258.anIntArray298[0], local10.aString100, 0, Static258.anIntArray298[1] + arg2, local10.anInt8744 | 0xFF000000);
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
	public static void method3962() {
		for (@Pc(10) Class20_Sub5 local10 = (Class20_Sub5) Static165.aClass81_4.method2127(); local10 != null; local10 = (Class20_Sub5) Static165.aClass81_4.method2127()) {
			Static370.method5840(local10);
		}
		@Pc(41) int local41;
		@Pc(40) int local40;
		if (Static348.aClass6_Sub22_19.aClass15_Sub28_2.method8677() == 1) {
			local41 = 0;
			local40 = 3;
		} else {
			local40 = Static110.anInt2165;
			local41 = Static110.anInt2165;
		}
		Static78.method1381();
		for (@Pc(50) int local50 = local41; local50 <= local40; local50++) {
			Static78.method1376();
			Static78.method1382(local50);
			Static78.method1380(local50);
		}
		Static78.method1373();
		Static78.method1369();
	}
}
