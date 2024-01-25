import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
	public static int anInt2437;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public static void method1932(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class155 local12 = Static539.method7544(arg2, arg1);
		if (local12 == null) {
			return;
		}
		if (local12.anObjectArray28 != null) {
			@Pc(22) Class4_Sub37 local22 = new Class4_Sub37();
			local22.anInt7559 = arg3;
			local22.aString151 = arg0;
			local22.aClass155_10 = local12;
			local22.anObjectArray31 = local12.anObjectArray28;
			Static471.method6884(local22);
		}
		if (Static9.anInt758 != 10 || !Static70.method1542(local12).method6326(arg3 - 1)) {
			return;
		}
		@Pc(64) Class4_Sub39 local64;
		if (arg3 == 1) {
			local64 = Static32.method999(Static402.aClass356_1, Static173.aClass344_23);
			Static357.method5394(arg1, local64, local12.anInt4785, arg2);
			Static50.method1166(local64);
		}
		if (arg3 == 2) {
			local64 = Static32.method999(Static402.aClass356_1, Static264.aClass344_40);
			Static357.method5394(arg1, local64, local12.anInt4785, arg2);
			Static50.method1166(local64);
		}
		if (arg3 == 3) {
			local64 = Static32.method999(Static402.aClass356_1, Static370.aClass344_60);
			Static357.method5394(arg1, local64, local12.anInt4785, arg2);
			Static50.method1166(local64);
		}
		if (arg3 == 4) {
			local64 = Static32.method999(Static402.aClass356_1, Static546.aClass344_96);
			Static357.method5394(arg1, local64, local12.anInt4785, arg2);
			Static50.method1166(local64);
		}
		if (arg3 == 5) {
			local64 = Static32.method999(Static402.aClass356_1, Static211.aClass344_32);
			Static357.method5394(arg1, local64, local12.anInt4785, arg2);
			Static50.method1166(local64);
		}
		if (arg3 == 6) {
			local64 = Static32.method999(Static402.aClass356_1, Static159.aClass344_20);
			Static357.method5394(arg1, local64, local12.anInt4785, arg2);
			Static50.method1166(local64);
		}
		if (arg3 == 7) {
			local64 = Static32.method999(Static402.aClass356_1, Static106.aClass344_15);
			Static357.method5394(arg1, local64, local12.anInt4785, arg2);
			Static50.method1166(local64);
		}
		if (arg3 == 8) {
			local64 = Static32.method999(Static402.aClass356_1, Static413.aClass344_71);
			Static357.method5394(arg1, local64, local12.anInt4785, arg2);
			Static50.method1166(local64);
		}
		if (arg3 == 9) {
			local64 = Static32.method999(Static402.aClass356_1, Static440.aClass344_79);
			Static357.method5394(arg1, local64, local12.anInt4785, arg2);
			Static50.method1166(local64);
		}
		if (arg3 == 10) {
			local64 = Static32.method999(Static402.aClass356_1, Static39.aClass344_9);
			Static357.method5394(arg1, local64, local12.anInt4785, arg2);
			Static50.method1166(local64);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BZ)V")
	public static void method1934(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static446.anInt8493 != -1) {
				Static192.method3153(Static446.anInt8493);
			}
			for (@Pc(23) Class4_Sub45 local23 = (Class4_Sub45) Static569.aClass221_27.method5072(); local23 != null; local23 = (Class4_Sub45) Static569.aClass221_27.method5071()) {
				if (!local23.method8199()) {
					local23 = (Class4_Sub45) Static569.aClass221_27.method5072();
					if (local23 == null) {
						break;
					}
				}
				Static205.method3352(true, local23, false);
			}
			Static446.anInt8493 = -1;
			Static569.aClass221_27 = new Class221(8);
			Static511.method7326();
			Static446.anInt8493 = Static588.anInt10538;
			Static284.method4495(false);
			Static533.method7519();
			Static471.method6880(Static446.anInt8493);
		}
		Static33.aBoolean107 = true;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "([I[ILclient!hw;I[I)V")
	public static void method1936(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class21_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg0[local3];
			@Pc(17) int local17 = arg1[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg2.aClass237Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass237Array3[local19] = null;
					} else {
						@Pc(36) Class111 local36 = Static17.aClass254_1.method5936(local9);
						@Pc(39) int local39 = local36.anInt3148;
						@Pc(44) Class237 local44 = arg2.aClass237Array3[local19];
						if (local44 != null) {
							if (local44.anInt6861 == local9) {
								if (local39 == 0) {
									local44 = arg2.aClass237Array3[local19] = null;
								} else if (local39 == 1) {
									local44.anInt6864 = 0;
									local44.anInt6862 = 0;
									local44.anInt6863 = 1;
									local44.anInt6858 = 0;
									local44.anInt6860 = local17;
									if (!arg2.aBoolean295) {
										Static593.method8263(0, arg2, local36);
									}
								} else if (local39 == 2) {
									local44.anInt6864 = 0;
								}
							} else if (local36.anInt3152 >= Static17.aClass254_1.method5936(local44.anInt6861).anInt3152) {
								local44 = arg2.aClass237Array3[local19] = null;
							}
						}
						if (local44 == null) {
							local44 = arg2.aClass237Array3[local19] = new Class237();
							local44.anInt6862 = 0;
							local44.anInt6863 = 1;
							local44.anInt6858 = 0;
							local44.anInt6864 = 0;
							local44.anInt6861 = local9;
							local44.anInt6860 = local17;
							if (!arg2.aBoolean295) {
								Static593.method8263(0, arg2, local36);
							}
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}
}
