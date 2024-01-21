import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	public static int anInt2069 = 99;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!v;")
	private static Class62 aClass62_915 = Static45.method753("Please remove ");

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!v;")
	public static Class62 aClass62_912 = aClass62_915;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!v;")
	private static Class62 aClass62_913 = Static45.method753("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_914 = Static45.method753("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!v;")
	public static Class62 aClass62_916 = aClass62_913;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!v;")
	public static Class62 aClass62_917 = aClass62_915;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	public static int anInt2074 = 0;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_918 = Static45.method753("Stufe)2");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1260(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 1 || arg3 < 1 || arg4 > 102 || arg3 > 102) {
			return;
		}
		if (Static92.aBoolean151 && Static27.anInt818 != arg6) {
			return;
		}
		@Pc(38) int local38 = 0;
		if (arg0 == 0) {
			local38 = Static76.aClass1_1.method47(arg6, arg4, arg3);
		}
		if (arg0 == 1) {
			local38 = Static76.aClass1_1.method42(arg6, arg4, arg3);
		}
		if (arg0 == 2) {
			local38 = Static76.aClass1_1.method26(arg6, arg4, arg3);
		}
		if (arg0 == 3) {
			local38 = Static76.aClass1_1.method3(arg6, arg4, arg3);
		}
		@Pc(101) int local101;
		if (local38 != 0) {
			@Pc(94) int local94 = local38 >> 14 & 0x7FFF;
			local101 = Static76.aClass1_1.method22(arg6, arg4, arg3, local38);
			@Pc(107) int local107 = local101 >> 6 & 0x3;
			@Pc(111) int local111 = local101 & 0x1F;
			@Pc(122) Class3_Sub1_Sub9 local122;
			if (arg0 == 0) {
				Static76.aClass1_1.method45(arg6, arg4, arg3);
				local122 = Static10.method1322(local94);
				if (local122.aBoolean60) {
					Static32.aClass11Array1[arg6].method306(arg3, local107, local122.aBoolean54, local111, arg4);
				}
			}
			if (arg0 == 1) {
				Static76.aClass1_1.method41(arg6, arg4, arg3);
			}
			if (arg0 == 2) {
				Static76.aClass1_1.method7(arg6, arg4, arg3);
				local122 = Static10.method1322(local94);
				if (local122.anInt1068 + arg4 > 103 || local122.anInt1068 + arg3 > 103 || local122.anInt1061 + arg4 > 103 || local122.anInt1061 + arg3 > 103) {
					return;
				}
				if (local122.aBoolean60) {
					Static32.aClass11Array1[arg6].method299(arg4, local122.anInt1068, local107, local122.anInt1061, local122.aBoolean54, arg3);
				}
			}
			if (arg0 == 3) {
				Static76.aClass1_1.method8(arg6, arg4, arg3);
				local122 = Static10.method1322(local94);
				if (local122.aBoolean60 && local122.anInt1063 == 1) {
					Static32.aClass11Array1[arg6].method300(arg4, arg3);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		local101 = arg6;
		if (arg6 < 3 && (Static44.aByteArrayArrayArray6[1][arg4][arg3] & 0x2) == 2) {
			local101 = arg6 + 1;
		}
		Static8.method215(arg3, arg5, arg1, local101, Static32.aClass11Array1[arg6], Static76.aClass1_1, arg6, arg2, arg4);
		return;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method1266() {
		aClass62_918 = null;
		aClass62_917 = null;
		aClass62_915 = null;
		aClass62_914 = null;
		aClass3_Sub1_Sub1_Sub4_3 = null;
		aClass62_913 = null;
		aClass62_916 = null;
		aClass62_912 = null;
	}
}
