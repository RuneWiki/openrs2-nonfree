import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!td;")
	public static Class54 aClass54_33;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!wa;")
	public static Class7 aClass7_5;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1322 = Static87.method1648(":duelreq:");

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Lclient!fc;")
	public static Class21 aClass21_32 = new Class21(64);

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1323 = Static87.method1648(" )2> @lre@");

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!fc;")
	public static Class21 aClass21_33 = new Class21(20);

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
	public static int anInt2733 = 0;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
	public static int anInt2734 = 0;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray14 = new byte[250][];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
	public static synchronized void method1865() {
		if (Static62.aClass3_Sub1_1 != null) {
			Static62.aClass3_Sub1_1.method145(256);
		}
		Static75.method1502(256);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!j;B)V")
	public static synchronized void method1866(@OriginalArg(0) Class3_Sub1 arg0) {
		Static62.aClass3_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method1868() {
		if (Static87.anInt2332 == 0) {
			return;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) Class3_Sub3_Sub2_Sub1 local16 = Static88.aClass3_Sub3_Sub2_Sub1_2;
		if (Static32.anInt809 != 0) {
			local14 = 1;
		}
		for (@Pc(22) int local22 = 0; local22 < 100; local22++) {
			if (Static81.aClass27Array13[local22] != null) {
				@Pc(32) int local32 = Static81.anIntArray333[local22];
				@Pc(36) Class27 local36 = Static55.aClass27Array8[local22];
				@Pc(38) byte local38 = 0;
				if (local36 != null && local36.method751(Static4.aClass27_1330)) {
					local38 = 1;
					local36 = local36.method731(5);
				}
				if (local36 != null && local36.method751(Static42.aClass27_600)) {
					local36 = local36.method731(5);
					local38 = 2;
				}
				@Pc(102) int local102;
				if ((local32 == 3 || local32 == 7) && (local32 == 7 || Static34.anInt828 == 0 || Static34.anInt828 == 1 && Static50.method971(local36))) {
					local102 = 329 - local14 * 13;
					local16.method610(Static40.aClass27_586, 4, local102, 0);
					local16.method610(Static40.aClass27_586, 4, local102 - 1, 65535);
					local14++;
					@Pc(123) int local123 = local16.method606(Static40.aClass27_586) + 4;
					local123 += local16.method602(32);
					if (local38 == 1) {
						Static76.aClass3_Sub3_Sub2_Sub4Array5[0].method1332(local123, local102 - 12);
						local123 += 14;
					}
					if (local38 == 2) {
						Static76.aClass3_Sub3_Sub2_Sub4Array5[1].method1332(local123, local102 - 12);
						local123 += 14;
					}
					local16.method610(Static98.method1779(new Class27[] { local36, Static82.aClass27_1054, Static81.aClass27Array13[local22] }), local123, local102, 0);
					local16.method610(Static98.method1779(new Class27[] { local36, Static82.aClass27_1054, Static81.aClass27Array13[local22] }), local123, local102 - 1, 65535);
					if (local14 >= 5) {
						return;
					}
				}
				if (local32 == 5 && Static34.anInt828 < 2) {
					local102 = 329 - local14 * 13;
					local16.method610(Static81.aClass27Array13[local22], 4, local102, 0);
					local16.method610(Static81.aClass27Array13[local22], 4, local102 - 1, 65535);
					local14++;
					if (local14 >= 5) {
						return;
					}
				}
				if (local32 == 6 && Static34.anInt828 < 2) {
					local102 = 329 - local14 * 13;
					local16.method610(Static98.method1779(new Class27[] { Static75.aClass27_992, Static101.aClass27_1270, local36, Static82.aClass27_1054, Static81.aClass27Array13[local22] }), 4, local102, 0);
					local16.method610(Static98.method1779(new Class27[] { Static75.aClass27_992, Static101.aClass27_1270, local36, Static82.aClass27_1054, Static81.aClass27Array13[local22] }), 4, local102 - 1, 65535);
					local14++;
					if (local14 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([II)V")
	public static synchronized void method1869(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static62.aClass3_Sub1_1 != null) {
			Static62.aClass3_Sub1_1.method143(arg0, 0, local2);
		}
		Static75.method1502(local2);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method1870() {
		aClass21_33 = null;
		aClass54_33 = null;
		aByteArrayArray14 = null;
		aClass27_1322 = null;
		aClass21_32 = null;
		aClass7_5 = null;
		aClass27_1323 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method1872() {
		try {
			@Pc(2) Graphics local2 = Static19.aCanvas1.getGraphics();
			Static67.aClass12_51.method671(0, local2, 4);
			Static53.aClass12_41.method671(0, local2, 357);
			Static86.aClass12_66.method671(722, local2, 4);
			Static87.aClass12_67.method671(743, local2, 205);
			Static39.aClass12_25.method671(0, local2, 0);
			Static83.aClass12_69.method671(516, local2, 4);
			Static98.aClass12_75.method671(516, local2, 205);
			Static84.aClass12_65.method671(496, local2, 357);
			Static15.aClass12_10.method671(0, local2, 338);
		} catch (@Pc(66) Exception local66) {
			Static19.aCanvas1.repaint();
		}
	}
}
