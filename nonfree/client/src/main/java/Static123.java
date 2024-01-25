import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
	public static int anInt2609;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "[I")
	public static final int[] anIntArray213 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_89 = new Class221(88, -1);

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "Z")
	public static boolean aBoolean256 = false;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
	public static int anInt2610 = 0;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!dr;IILclient!jd;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method2387(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class38 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static145.aClass37_8 = arg0;
		Static250.anInt5230 = arg1;
		Static299.aClass38_5 = arg3;
		Static74.aBoolean316 = Static145.aClass37_8.method3740() > 0;
		Static250.anInt5229 = arg4 >> Static325.anInt6336;
		Static328.anInt6686 = arg6 >> Static325.anInt6336;
		Static353.anInt5915 = arg4;
		Static84.anInt1566 = arg6;
		Static83.anInt1555 = arg5;
		Static360.anInt6859 = Static250.anInt5229 - Static26.anInt3838;
		if (Static360.anInt6859 < 0) {
			Static8.anInt172 = -Static360.anInt6859;
			Static360.anInt6859 = 0;
		} else {
			Static8.anInt172 = 0;
		}
		Static174.anInt5316 = Static328.anInt6686 - Static26.anInt3838;
		if (Static174.anInt5316 < 0) {
			Static237.anInt5067 = -Static174.anInt5316;
			Static174.anInt5316 = 0;
		} else {
			Static237.anInt5067 = 0;
		}
		Static275.anInt5641 = Static250.anInt5229 + Static26.anInt3838;
		if (Static275.anInt5641 > Static344.anInt6692) {
			Static275.anInt5641 = Static344.anInt6692;
		}
		Static51.anInt874 = Static328.anInt6686 + Static26.anInt3838;
		if (Static51.anInt874 > Static63.anInt1129) {
			Static51.anInt874 = Static63.anInt1129;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static26.anInt3838 + Static26.anInt3838 + 2; local74++) {
			for (local77 = 0; local77 < Static26.anInt3838 + Static26.anInt3838 + 2; local77++) {
				local84 = Static250.anInt5229 + local74 - Static26.anInt3838;
				local90 = Static328.anInt6686 + local77 - Static26.anInt3838;
				if (local84 >= 0 && local90 >= 0 && local84 < Static344.anInt6692 && local90 < Static63.anInt1129) {
					@Pc(104) int local104 = local84 << Static325.anInt6336;
					@Pc(108) int local108 = local90 << Static325.anInt6336;
					@Pc(120) int local120 = Static101.aClass105Array2[Static101.aClass105Array2.length - 1].method4453(local84, local90) - 1000;
					@Pc(140) int local140 = Static121.aClass105Array3 == null ? Static101.aClass105Array2[0].method4453(local84, local90) + Static6.anInt96 : Static121.aClass105Array3[0].method4453(local84, local90) + Static6.anInt96;
					Static162.aBooleanArrayArray4[local74][local77] = Static145.aClass37_8.method3728(local104, local120, local108, local104, local140, local108);
				} else {
					Static162.aBooleanArrayArray4[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static26.anInt3838 + Static26.anInt3838 + 1; local77++) {
			for (local84 = 0; local84 < Static26.anInt3838 + Static26.anInt3838 + 1; local84++) {
				Static148.aBooleanArrayArray3[local77][local84] = Static162.aBooleanArrayArray4[local77][local84] || Static162.aBooleanArrayArray4[local77 + 1][local84] || Static162.aBooleanArrayArray4[local77][local84 + 1] || Static162.aBooleanArrayArray4[local77 + 1][local84 + 1];
			}
		}
		Static32.anIntArray60 = arg8;
		Static354.anIntArray520 = arg9;
		Static104.anIntArray173 = arg10;
		Static205.anIntArray337 = arg11;
		Static287.anIntArray452 = arg12;
		Static35.method5763();
		Static269.method5573();
		for (@Pc(256) Class57_Sub5 local256 = (Class57_Sub5) Static45.aClass193_4.method5224(); local256 != null; local256 = (Class57_Sub5) Static45.aClass193_4.method5223()) {
			local256.method5452();
			Static170.method4320(local256);
		}
		if (Static74.aBoolean316) {
			for (local90 = 0; local90 < Static88.anInt1647; local90++) {
				Static120.aClass2_Sub10_Sub1Array2[local90].method3479(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static145.aClass37_8.method3647(0);
			if (Static328.aClass80_29 == null || Static328.aClass80_29 instanceof Class80_Sub1) {
				Static328.aClass80_29 = new Class80_Sub2();
			}
		} else if (Static328.aClass80_29 == null || Static328.aClass80_29 instanceof Class80_Sub2) {
			Static328.aClass80_29 = new Class80_Sub1();
		}
		Static328.aClass80_29.method3926(arg2);
		Static328.aClass80_29.method3924();
		if (Static54.aClass51ArrayArrayArray1 != null) {
			Static297.method4934(true);
			Static328.aClass80_29.method3922(22);
			Static285.method4831(arg2, null, 0, (byte) 0, arg15, arg16);
			Static328.aClass80_29.method3924();
			Static328.aClass80_29.method3922(23);
			Static297.method4934(false);
		}
		Static285.method4831(arg2, arg7, arg13, arg14, arg15, arg16);
		Static328.aClass80_29.method3924();
		Static328.aClass80_29.method3923();
		Static328.aClass80_29.method3924();
		if (arg2 > 1) {
			Static145.aClass37_8.method3678(0);
		}
		Static145.aClass37_8.method3652(0, null);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([[B[I[[B[BI[III)I")
	public static int method2388(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1[arg4];
		@Pc(15) int local15 = arg5[arg4] + local9;
		@Pc(19) int local19 = arg1[arg6];
		@Pc(25) int local25 = arg5[arg6] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(49) int local49 = arg3[arg4] & 0xFF;
		if ((arg3[arg6] & 0xFF) < local49) {
			local49 = arg3[arg6] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg0[arg4];
		@Pc(74) byte[] local74 = arg2[arg6];
		@Pc(79) int local79 = local27 - local9;
		@Pc(84) int local84 = local27 - local19;
		for (@Pc(86) int local86 = local27; local86 < local38; local86++) {
			@Pc(98) int local98 = local74[local84++] + local70[local79++];
			if (local49 > local98) {
				local49 = local98;
			}
		}
		return -local49;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	public static void method2390() {
		Static251.method4441(false);
		if (Static57.anInt1019 >= 0 && Static57.anInt1019 != 0) {
			Static212.method3988(Static57.anInt1019);
			Static57.anInt1019 = -1;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	public static void method2392() {
		Static291.aClass107_33.method3011(5);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!tg;III)V")
	public static void method2393(@OriginalArg(0) Class191 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static68.aClass191ArrayArray1[arg1][arg2] = arg0;
	}
}
