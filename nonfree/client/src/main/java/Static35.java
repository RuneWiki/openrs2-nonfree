import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "Lclient!af;")
	public static final Class10 aClass10_1 = new Class10(10);

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public static int anInt855 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([Ljava/lang/String;II[II)V")
	public static void method853(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(11) int local11 = (arg3 + arg1) / 2;
		@Pc(13) int local13 = arg3;
		@Pc(17) String local17 = arg0[local11];
		arg0[local11] = arg0[arg1];
		arg0[arg1] = local17;
		@Pc(31) int local31 = arg2[local11];
		arg2[local11] = arg2[arg1];
		arg2[arg1] = local31;
		for (@Pc(43) int local43 = arg3; local43 < arg1; local43++) {
			if (local17 == null || arg0[local43] != null && (local43 & 0x1) > arg0[local43].compareTo(local17)) {
				@Pc(68) String local68 = arg0[local43];
				arg0[local43] = arg0[local13];
				arg0[local13] = local68;
				@Pc(82) int local82 = arg2[local43];
				arg2[local43] = arg2[local13];
				arg2[local13++] = local82;
			}
		}
		arg0[arg1] = arg0[local13];
		arg0[local13] = local17;
		arg2[arg1] = arg2[local13];
		arg2[local13] = local31;
		method853(arg0, local13 - 1, arg2, arg3);
		method853(arg0, arg1, arg2, local13 + 1);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method855() {
		Static56.method1077(Static96.aClass6_Sub22_7.aClass29_Sub23_1.method7364());
		@Pc(19) int local19 = (Static23.anInt564 >> 12) + (Static534.anInt8753 >> 3);
		@Pc(28) int local28 = (Static542.anInt9140 >> 12) + (Static234.anInt4239 >> 3);
		Static253.anInt4353 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 = 0;
		Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method3508(8, 8);
		Static137.aByteArrayArray8 = new byte[18][];
		Static588.aByteArrayArray27 = new byte[18][];
		Static300.anIntArray289 = new int[18];
		Static381.anIntArray516 = new int[18];
		Static280.anIntArray274 = new int[18];
		Static66.anIntArrayArray6 = new int[18][4];
		Static200.anIntArray192 = new int[18];
		Static205.anIntArray198 = new int[18];
		Static339.aByteArrayArray15 = new byte[18][];
		Static43.aByteArrayArray6 = new byte[18][];
		Static402.aByteArrayArray18 = new byte[18][];
		Static310.anIntArray310 = new int[18];
		@Pc(79) int local79 = 0;
		@Pc(98) int local98;
		for (@Pc(87) int local87 = (local19 - (Static491.anInt9856 >> 4)) / 8; local87 <= ((Static491.anInt9856 >> 4) + local19) / 8; local87++) {
			for (local98 = (local28 - (Static393.anInt6574 >> 4)) / 8; local98 <= (local28 + (Static393.anInt6574 >> 4)) / 8; local98++) {
				@Pc(106) int local106 = local98 + (local87 << 8);
				Static300.anIntArray289[local79] = local106;
				Static381.anIntArray516[local79] = Static187.aClass8_56.method252("m" + local87 + "_" + local98);
				Static280.anIntArray274[local79] = Static187.aClass8_56.method252("l" + local87 + "_" + local98);
				Static200.anIntArray192[local79] = Static187.aClass8_56.method252("n" + local87 + "_" + local98);
				Static310.anIntArray310[local79] = Static187.aClass8_56.method252("um" + local87 + "_" + local98);
				Static205.anIntArray198[local79] = Static187.aClass8_56.method252("ul" + local87 + "_" + local98);
				if (Static200.anIntArray192[local79] == -1) {
					Static381.anIntArray516[local79] = -1;
					Static280.anIntArray274[local79] = -1;
					Static310.anIntArray310[local79] = -1;
					Static205.anIntArray198[local79] = -1;
				}
				local79++;
			}
		}
		for (local98 = local79; local98 < Static200.anIntArray192.length; local98++) {
			Static200.anIntArray192[local98] = -1;
			Static381.anIntArray516[local98] = -1;
			Static280.anIntArray274[local98] = -1;
			Static310.anIntArray310[local98] = -1;
			Static205.anIntArray198[local98] = -1;
		}
		@Pc(282) byte local282;
		if (Static556.anInt9319 == 3) {
			local282 = 4;
		} else {
			local282 = 8;
		}
		Static122.method1895(local19, false, local282, local28);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method857() {
		if (Static231.aClass64_2 != null) {
			Static231.aClass64_2.method1732();
		}
		if (Static165.aClass64_1 != null) {
			Static165.aClass64_1.method1732();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!ee;Lclient!hv;IIILclient!sda;Lclient!ha;BI)V")
	public static void method859(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class6_Sub24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class318 arg5, @OriginalArg(6) Class132 arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = arg3 - arg4 / 2 - 5;
		@Pc(22) int local22 = arg2 + 2;
		if (arg5.anInt8721 != 0) {
			arg6.method7512(arg2 + arg0.method1908() * arg7 + 1 - local22, arg4 + 10, local13, local22, arg5.anInt8721);
		}
		if (arg5.anInt8699 != 0) {
			arg6.method7462(arg5.anInt8699, arg4 + 10, local13, local22, arg2 + arg7 * arg0.method1908() + 1 - local22);
		}
		@Pc(80) int local80 = arg5.anInt8704;
		if (arg1.aBoolean235 && arg5.anInt8717 != -1) {
			local80 = arg5.anInt8717;
		}
		for (@Pc(92) int local92 = 0; local92 < arg7; local92++) {
			@Pc(98) String local98 = Static674.aStringArray62[local92];
			if (arg7 - 1 > local92) {
				local98 = local98.substring(0, local98.length() - 4);
			}
			arg0.method1906(arg6, local98, arg3, arg2, local80);
			arg2 += arg0.method1908();
		}
	}
}
