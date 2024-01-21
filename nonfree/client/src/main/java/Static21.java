import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!kb;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!bd;")
	public static Class7 aClass7_2 = new Class7(4096);

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!af;")
	public static Class5 aClass5_337 = Static45.method1937("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!af;")
	public static Class5 aClass5_338 = Static45.method1937(":chalreq:");

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!af;")
	public static Class5 aClass5_339 = Static45.method1937("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!af;")
	public static Class5 aClass5_340 = Static45.method1937("Angreifen");

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
	public static int[] anIntArray86 = new int[5];

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!gd;")
	public static Class28 aClass28_19 = new Class28(30);

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private static final int anInt747 = 2301979;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	public static int anInt748 = 0;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!af;")
	public static Class5 aClass5_341 = Static45.method1937("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	public static void method525() {
		aClass41_1 = null;
		aClass28_19 = null;
		aClass5_337 = null;
		aClass5_339 = null;
		aCRC32_1 = null;
		aClass5_341 = null;
		aClass7_2 = null;
		aClass5_340 = null;
		aClass5_338 = null;
		anIntArray86 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZILclient!kb;)V")
	public static void method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class41 arg3) {
		Static125.anInt3198 = 1;
		Static73.aClass41_12 = arg3;
		Static70.anInt1621 = arg0;
		Static19.anInt644 = arg2;
		Static2.anInt55 = arg1;
		Static95.aBoolean93 = false;
		Static26.anInt806 = 10000;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIII)V")
	public static void method529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg1 * (arg1 - 32) / arg2;
		Static38.aClass1_Sub3_Sub1_Sub3Array3[0].method1687(arg0, arg3);
		Static38.aClass1_Sub3_Sub1_Sub3Array3[1].method1687(arg0, arg1 + arg3 - 16);
		if (local14 < 8) {
			local14 = 8;
		}
		@Pc(49) int local49 = arg4 * (arg1 - local14 - 32) / (arg2 - arg1);
		Static33.method1984(arg0, arg3 + 16, 16, arg1 - 32, anInt747);
		Static33.method1984(arg0, local49 + arg3 + 16, 16, local14, Static119.anInt3099);
		Static33.method1968(arg0, local49 + arg3 + 16, local14, Static118.anInt2981);
		Static33.method1968(arg0 + 1, arg3 + 16 - -local49, local14, Static118.anInt2981);
		Static33.method1971(arg0, arg3 + local49 + 16, 16, Static118.anInt2981);
		Static33.method1971(arg0, arg3 + local49 + 17, 16, Static118.anInt2981);
		Static33.method1968(arg0 + 15, arg3 + 16 + local49, local14, Static25.anInt774);
		Static33.method1968(arg0 + 14, local49 + (arg3 - -17), local14 - 1, Static25.anInt774);
		Static33.method1971(arg0, local14 + arg3 + local49 + 15, 16, Static25.anInt774);
		Static33.method1971(arg0 + 1, local14 + arg3 - (-local49 + -14), 15, Static25.anInt774);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	public static void method530() {
		@Pc(10) int local10;
		if (Static86.anInt2186 > 0) {
			for (local10 = 0; local10 < 256; local10++) {
				if (Static86.anInt2186 > 768) {
					Static44.anIntArray187[local10] = Static87.method2227(Static71.anIntArray276[local10], 1024 - Static86.anInt2186, Static99.anIntArray376[local10]);
				} else if (Static86.anInt2186 <= 256) {
					Static44.anIntArray187[local10] = Static87.method2227(Static99.anIntArray376[local10], 256 - Static86.anInt2186, Static71.anIntArray276[local10]);
				} else {
					Static44.anIntArray187[local10] = Static99.anIntArray376[local10];
				}
			}
		} else if (Static59.anInt1402 <= 0) {
			for (local10 = 0; local10 < 256; local10++) {
				Static44.anIntArray187[local10] = Static71.anIntArray276[local10];
			}
		} else {
			for (local10 = 0; local10 < 256; local10++) {
				if (Static59.anInt1402 > 768) {
					Static44.anIntArray187[local10] = Static87.method2227(Static71.anIntArray276[local10], 1024 - Static59.anInt1402, Static3.anIntArray14[local10]);
				} else if (Static59.anInt1402 > 256) {
					Static44.anIntArray187[local10] = Static3.anIntArray14[local10];
				} else {
					Static44.anIntArray187[local10] = Static87.method2227(Static3.anIntArray14[local10], 256 - Static59.anInt1402, Static71.anIntArray276[local10]);
				}
			}
		}
		Static33.method1981(0, 9, 128, 263);
		Static122.aClass1_Sub3_Sub1_Sub2_5.method760(0, 0);
		Static33.method1982();
		@Pc(160) int local160 = 6885;
		local10 = 0;
		@Pc(177) int local177;
		@Pc(181) int local181;
		@Pc(194) int local194;
		@Pc(201) int local201;
		@Pc(217) int local217;
		@Pc(210) int local210;
		@Pc(215) int local215;
		for (@Pc(164) int local164 = 1; local164 < 255; local164++) {
			local177 = Static82.anIntArray320[local164] * (256 - local164) / 256;
			local181 = local177 + 22;
			if (local181 < 0) {
				local181 = 0;
			}
			local10 += local181;
			for (local194 = local181; local194 < 128; local194++) {
				local201 = Static106.anIntArray396[local10++];
				if (local201 == 0) {
					local160++;
				} else {
					local210 = 256 - local201;
					local215 = Static90.aClass43_1.anIntArray452[local160];
					local217 = local201;
					local201 = Static44.anIntArray187[local201];
					Static90.aClass43_1.anIntArray452[local160++] = ((local215 & 0xFF00FF) * local210 + (local201 & 0xFF00FF) * local217 & 0xFF00FF00) + (local210 * (local215 & 0xFF00) + local217 * (local201 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local160 += local181 + 765 - 128;
		}
		local160 = 7546;
		Static33.method1981(637, 9, 765, 263);
		Static55.aClass1_Sub3_Sub1_Sub2_2.method760(382, 0);
		local10 = 0;
		Static33.method1982();
		for (local177 = 1; local177 < 255; local177++) {
			local181 = Static82.anIntArray320[local177] * (256 - local177) / 256;
			local194 = 103 - local181;
			local160 += local181;
			for (local201 = 0; local201 < local194; local201++) {
				local217 = Static106.anIntArray396[local10++];
				if (local217 == 0) {
					local160++;
				} else {
					local210 = local217;
					@Pc(342) int local342 = Static90.aClass43_1.anIntArray452[local160];
					local215 = 256 - local217;
					local217 = Static44.anIntArray187[local217];
					Static90.aClass43_1.anIntArray452[local160++] = (local210 * (local217 & 0xFF00FF) + local215 * (local342 & 0xFF00FF) & 0xFF00FF00) + ((local217 & 0xFF00) * local210 + local215 * (local342 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local10 += 128 - local194;
			local160 += 765 - local181 - local194;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBIII)I")
	public static int method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg0;
			arg0 = local6;
		}
		@Pc(18) int local18 = arg5 & 0x3;
		if (local18 == 0) {
			return arg2;
		} else if (local18 == 1) {
			return arg3;
		} else if (local18 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return 7 + 1 - arg3 - arg0;
		}
	}
}
