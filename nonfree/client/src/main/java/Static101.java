import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!me", name = "db", descriptor = "I")
	public static int anInt2155;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Lclient!ai;")
	private static Class6 aClass6_631 = Static38.method685("as it was used to break our rules)3");

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Lclient!ai;")
	public static Class6 aClass6_630 = aClass6_631;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "[I")
	public static int[] anIntArray151 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!me", name = "mb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_633 = Static38.method685("purple:");

	@OriginalMember(owner = "client!me", name = "L", descriptor = "Lclient!ai;")
	public static Class6 aClass6_632 = aClass6_633;

	@OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
	public static int anInt2159 = 0;

	@OriginalMember(owner = "client!me", name = "ob", descriptor = "Lclient!ai;")
	public static Class6 aClass6_634 = aClass6_633;

	@OriginalMember(owner = "client!me", name = "zb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_635 = Static38.method685("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BZI)I")
	public static int method1398(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static1.method1(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method1407(@OriginalArg(0) Class10 arg0) {
		Static164.aClass10_133 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "h", descriptor = "(I)V")
	public static void method1413() {
		Static113.aBoolean112 = false;
		Static80.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(II)V")
	public static void method1417(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = Static58.aClass2_Sub3_Sub2_Sub1_2.anIntArray14;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 1;
		}
		@Pc(37) int local37;
		@Pc(39) int local39;
		for (@Pc(27) int local27 = 1; local27 < 103; local27++) {
			local37 = (103 - local27) * 2048 + 24628;
			for (local39 = 1; local39 < 103; local39++) {
				if ((Static164.aByteArrayArrayArray7[arg0][local39][local27] & 0x18) == 0) {
					Static30.aClass44_1.method1277(local4, local37, arg0, local39, local27);
				}
				if (arg0 < 3 && (Static164.aByteArrayArrayArray7[arg0 + 1][local39][local27] & 0x8) != 0) {
					Static30.aClass44_1.method1277(local4, local37, arg0 + 1, local39, local27);
				}
				local37 += 4;
			}
		}
		Static58.aClass2_Sub3_Sub2_Sub1_2.method297();
		local37 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		local39 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(148) int local148;
		for (@Pc(144) int local144 = 1; local144 < 103; local144++) {
			for (local148 = 1; local148 < 103; local148++) {
				if ((Static164.aByteArrayArrayArray7[arg0][local148][local144] & 0x18) == 0) {
					Static107.method1735(local144, local39, local37, local148, arg0);
				}
				if (arg0 < 3 && (Static164.aByteArrayArrayArray7[arg0 + 1][local148][local144] & 0x8) != 0) {
					Static107.method1735(local144, local39, local37, local148, arg0 + 1);
				}
			}
		}
		Static74.anInt1802 = 0;
		for (local148 = 0; local148 < 104; local148++) {
			for (@Pc(209) int local209 = 0; local209 < 104; local209++) {
				@Pc(217) int local217 = Static30.aClass44_1.method1264(Static36.anInt1020, local148, local209);
				if (local217 != 0) {
					local217 = local217 >> 14 & 0x7FFF;
					@Pc(230) int local230 = Static163.method2609(local217).anInt1187;
					if (local230 >= 0) {
						@Pc(234) int local234 = local148;
						@Pc(236) int local236 = local209;
						if (local230 != 22 && local230 != 29 && local230 != 34 && local230 != 36 && local230 != 46 && local230 != 47 && local230 != 48) {
							@Pc(272) int[][] local272 = Static51.aClass48Array1[Static36.anInt1020].anIntArrayArray35;
							for (@Pc(274) int local274 = 0; local274 < 10; local274++) {
								@Pc(281) int local281 = (int) (Math.random() * 4.0D);
								if (local281 == 0 && local234 > 0 && local148 - 3 < local234 && (local272[local234 - 1][local236] & 0x12C0108) == 0) {
									local234--;
								}
								if (local281 == 1 && local234 < 103 && local148 + 3 > local234 && (local272[local234 + 1][local236] & 0x12C0180) == 0) {
									local234++;
								}
								if (local281 == 2 && local236 > 0 && local236 > local209 - 3 && (local272[local234][local236 - 1] & 0x12C0102) == 0) {
									local236--;
								}
								if (local281 == 3 && local236 < 103 && local209 + 3 > local236 && (local272[local234][local236 + 1] & 0x12C0120) == 0) {
									local236++;
								}
							}
						}
						Static152.aClass2_Sub3_Sub2_Sub1Array7[Static74.anInt1802] = Static42.aClass2_Sub3_Sub2_Sub1Array1[local230];
						Static38.anIntArray58[Static74.anInt1802] = local234;
						Static56.anIntArray222[Static74.anInt1802] = local236;
						Static74.anInt1802++;
					}
				}
			}
		}
		Static168.aClass67_1.method2710();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!c;Lclient!c;Lclient!c;Lclient!c;)V")
	public static void method1435(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) Class10 arg3) {
		Static21.aClass10_22 = arg3;
		Static55.aClass10_54 = arg2;
		Static121.aClass10_93 = arg0;
		Static179.aClass10_144 = arg1;
		Static180.aClass87ArrayArray1 = new Class87[Static121.aClass10_93.method1599()][];
		Static117.aBooleanArray9 = new boolean[Static121.aClass10_93.method1599()];
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(Z)V")
	public static void method1449() {
		anIntArray151 = null;
		aClass6_630 = null;
		aClass6_633 = null;
		aClass6_632 = null;
		aClass6_634 = null;
		aClass6_631 = null;
		aClass6_635 = null;
	}
}
