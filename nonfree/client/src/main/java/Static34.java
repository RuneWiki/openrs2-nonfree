import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	public static final int[] anIntArray67 = new int[2];

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public static int anInt808 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)[B")
	public static synchronized byte[] method900(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static108.anInt2229 > 0) {
			local21 = Static211.aByteArrayArray24[--Static108.anInt2229];
			Static211.aByteArrayArray24[Static108.anInt2229] = null;
			return local21;
		} else if (arg0 == 5000 && Static252.anInt4524 > 0) {
			local21 = Static260.aByteArrayArray18[--Static252.anInt4524];
			Static260.aByteArrayArray18[Static252.anInt4524] = null;
			return local21;
		} else if (arg0 == 30000 && Static513.anInt8255 > 0) {
			local21 = Static600.aByteArrayArray27[--Static513.anInt8255];
			Static600.aByteArrayArray27[Static513.anInt8255] = null;
			return local21;
		} else {
			if (Static458.aByteArrayArrayArray23 != null) {
				for (@Pc(76) int local76 = 0; local76 < Static519.anIntArray708.length; local76++) {
					if (arg0 == Static519.anIntArray708[local76] && Static623.anIntArray862[local76] > 0) {
						@Pc(103) byte[] local103 = Static458.aByteArrayArrayArray23[local76][--Static623.anIntArray862[local76]];
						Static458.aByteArrayArrayArray23[local76][Static623.anIntArray862[local76]] = null;
						return local103;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method901() {
		@Pc(10) int local10 = 0;
		if (Static24.aClass3_Sub22_4 != null) {
			local10 = Static24.aClass3_Sub22_4.aClass6_Sub24_1.method7991();
		}
		@Pc(29) int local29;
		@Pc(36) int local36;
		if (local10 == 2) {
			local29 = Static512.anInt8242 > 800 ? 800 : Static512.anInt8242;
			local36 = Static203.anInt3986 > 600 ? 600 : Static203.anInt3986;
			Static282.anInt4895 = (Static512.anInt8242 - local29) / 2;
			Static312.anInt5191 = local29;
			Static222.anInt4196 = local36;
			Static270.anInt4747 = 0;
		} else if (local10 == 1) {
			local29 = Static512.anInt8242 > 1024 ? 1024 : Static512.anInt8242;
			Static282.anInt4895 = (Static512.anInt8242 - local29) / 2;
			Static312.anInt5191 = local29;
			local36 = Static203.anInt3986 <= 768 ? Static203.anInt3986 : 768;
			Static222.anInt4196 = local36;
			Static270.anInt4747 = 0;
		} else {
			Static312.anInt5191 = Static512.anInt8242;
			Static222.anInt4196 = Static203.anInt3986;
			Static270.anInt4747 = 0;
			Static282.anInt4895 = 0;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z[B)V")
	public static synchronized void method902(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static108.anInt2229 < 1000) {
			Static211.aByteArrayArray24[Static108.anInt2229++] = arg0;
		} else if (arg0.length == 5000 && Static252.anInt4524 < 250) {
			Static260.aByteArrayArray18[Static252.anInt4524++] = arg0;
		} else if (arg0.length == 30000 && Static513.anInt8255 < 50) {
			Static600.aByteArrayArray27[Static513.anInt8255++] = arg0;
		} else if (Static458.aByteArrayArrayArray23 != null) {
			for (@Pc(65) int local65 = 0; local65 < Static519.anIntArray708.length; local65++) {
				if (Static519.anIntArray708[local65] == arg0.length && Static623.anIntArray862[local65] < Static458.aByteArrayArrayArray23[local65].length) {
					Static458.aByteArrayArrayArray23[local65][Static623.anIntArray862[local65]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!jp;Z)Lclient!wf;")
	public static Class382 method903(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(7) Class382 local7 = new Class382();
		local7.anInt10544 = arg0.method8593();
		local7.aClass3_Sub11_Sub18_1 = Static143.aClass77_1.method2082(local7.anInt10544);
		return local7;
	}
}
