import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
	public static int anInt3027;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] aClass5_Sub2_Sub1_Sub4Array10;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!bd;")
	public static Class10 aClass10_6;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	public static int anInt3024 = 2;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!r;")
	public static Class61 aClass61_944 = Static129.method2060("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!r;")
	public static Class61 aClass61_945 = Static129.method2060(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!qb;")
	public static Class58 aClass58_66 = new Class58();

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!r;")
	public static Class61 aClass61_946 = Static129.method2060("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_947 = Static129.method2060("compass");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Z")
	public static boolean method1896(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1897() {
		aClass61_944 = null;
		aClass61_946 = null;
		aClass10_6 = null;
		aClass61_945 = null;
		aClass61_947 = null;
		aClass5_Sub2_Sub1_Sub4Array10 = null;
		aClass58_66 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIII)Lclient!md;")
	public static Class5_Sub13 method1898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class5_Sub13 local3 = new Class5_Sub13();
		local3.anInt2011 = arg2;
		local3.anInt2013 = arg0;
		Static28.aClass20_3.method647(local3, (long) arg1);
		Static110.method1825(arg0);
		Static68.method1132(arg0);
		@Pc(29) Class5_Sub11 local29 = Static88.method2191(arg1);
		if (local29 != null) {
			Static24.method505(local29);
		}
		if (Static90.aClass5_Sub11_9 != null) {
			Static24.method505(Static90.aClass5_Sub11_9);
			Static90.aClass5_Sub11_9 = null;
		}
		Static36.anInt1015 = 0;
		Static117.aBoolean105 = false;
		Static103.method1744(Static117.anInt3014, Static127.anInt3201, Static64.anInt2727, Static81.anInt3355);
		if (Static44.anInt1133 != -1) {
			Static98.method1662(1, Static44.anInt1133);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method1899() {
		try {
			if (Static118.aClass1_1 == null) {
				Static118.aClass1_1 = new Class1(Static86.aClass80_2, Static123.method1929(new Class61[] { Static64.aClass61_820, Static96.aClass61_742, Static12.aClass61_112 }).method1729());
			} else {
				@Pc(37) byte[] local37 = Static118.aClass1_1.method5();
				if (local37 != null) {
					@Pc(44) Class5_Sub14 local44 = new Class5_Sub14(local37);
					Static89.anInt2361 = local44.method1478();
					Static39.aClass18Array1 = new Class18[Static89.anInt2361];
					for (@Pc(53) int local53 = 0; local53 < Static89.anInt2361; local53++) {
						@Pc(63) Class18 local63 = Static39.aClass18Array1[local53] = new Class18();
						@Pc(67) int local67 = local44.method1478();
						local63.aBoolean25 = (local67 & 0x8000) != 0;
						local63.anInt907 = local67 & 0x7FFF;
						local63.aClass61_270 = local44.method1450();
						local63.anInt903 = local44.method1430();
						local63.anInt909 = local53;
						local63.anInt908 = Static108.method50(local63.aClass61_270);
					}
					Static37.method704(Static39.aClass18Array1.length - 1, Static70.anIntArray252, Static39.aClass18Array1, 0, Static76.anIntArray267);
					Static118.aClass1_1 = null;
					Static95.aBoolean86 = true;
				}
			}
		} catch (@Pc(124) Exception local124) {
			local124.printStackTrace();
			Static118.aClass1_1 = null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!pa;IIIIIII)V")
	public static void method1900(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(21) int local21;
		if (arg4 < 0 || arg4 >= 104 || arg5 < 0 || arg5 >= 104) {
			while (true) {
				local21 = arg0.method1471();
				if (local21 == 0) {
					break;
				}
				if (local21 == 1) {
					arg0.method1471();
					break;
				}
				if (local21 <= 49) {
					arg0.method1471();
				}
			}
			return;
		}
		Static30.aByteArrayArrayArray2[arg3][arg4][arg5] = 0;
		while (true) {
			local21 = arg0.method1471();
			if (local21 == 0) {
				if (arg3 == 0) {
					Static65.anIntArrayArrayArray3[0][arg4][arg5] = -Static113.method1869(arg5 + arg2 + 556238, arg6 + (932731 - -arg4)) * 8;
				} else {
					Static65.anIntArrayArrayArray3[arg3][arg4][arg5] = Static65.anIntArrayArrayArray3[arg3 - 1][arg4][arg5] - 240;
				}
				break;
			}
			if (local21 == 1) {
				@Pc(117) int local117 = arg0.method1471();
				if (local117 == 1) {
					local117 = 0;
				}
				if (arg3 == 0) {
					Static65.anIntArrayArrayArray3[0][arg4][arg5] = -local117 * 8;
				} else {
					Static65.anIntArrayArrayArray3[arg3][arg4][arg5] = Static65.anIntArrayArrayArray3[arg3 - 1][arg4][arg5] - local117 * 8;
				}
				break;
			}
			if (local21 <= 49) {
				Static109.aByteArrayArrayArray7[arg3][arg4][arg5] = arg0.method1447();
				Static79.aByteArrayArrayArray5[arg3][arg4][arg5] = (byte) ((local21 - 2) / 4);
				Static48.aByteArrayArrayArray3[arg3][arg4][arg5] = (byte) (local21 + arg1 - 2 & 0x3);
			} else if (local21 <= 81) {
				Static30.aByteArrayArrayArray2[arg3][arg4][arg5] = (byte) (local21 - 49);
			} else {
				Static75.aByteArrayArrayArray4[arg3][arg4][arg5] = (byte) (local21 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
	public static void method1901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static36.anInt1015 < 2 && Static123.anInt3071 == 0 && !Static32.aBoolean27) {
			return;
		}
		@Pc(49) Class61 local49;
		if (Static123.anInt3071 == 1 && Static36.anInt1015 < 2) {
			local49 = Static123.method1929(new Class61[] { Static30.aClass61_277, Static78.aClass61_603, Static86.aClass61_673, Static21.aClass61_190 });
		} else if (Static32.aBoolean27 && Static36.anInt1015 < 2) {
			local49 = Static123.method1929(new Class61[] { Static91.aClass61_717, Static78.aClass61_603, Static50.aClass61_396, Static21.aClass61_190 });
		} else {
			local49 = Static86.method1532(Static36.anInt1015 - 1);
		}
		if (Static36.anInt1015 > 2) {
			local49 = Static123.method1929(new Class61[] { local49, Static126.aClass61_1007, Static39.method730(Static36.anInt1015 - 2), Static70.aClass61_516 });
		}
		@Pc(124) int local124 = Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method554(local49, arg0 + 4, arg1 + 15, Static92.aRandom2, Static95.anInt2450);
		Static103.method1744(arg0 + 4, Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method544(local49) + local124, 15, arg1);
	}
}
