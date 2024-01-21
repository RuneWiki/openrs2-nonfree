import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!na", name = "O", descriptor = "[Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3[] aClass6_Sub3_Sub3_Sub3Array5;

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "Lclient!ga;")
	public static Class29 aClass29_13;

	@OriginalMember(owner = "client!na", name = "R", descriptor = "Lclient!ea;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "Lclient!va;")
	public static Class6_Sub3_Sub16 aClass6_Sub3_Sub16_1;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!na", name = "J", descriptor = "[I")
	public static int[] anIntArray240 = new int[25];

	@OriginalMember(owner = "client!na", name = "N", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1114 = Static80.method1463("Neuer Benutzer");

	@OriginalMember(owner = "client!na", name = "P", descriptor = "I")
	public static int anInt2137 = 1;

	@OriginalMember(owner = "client!na", name = "S", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1115 = Static80.method1463("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!na", name = "T", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1116 = Static80.method1463("Add ignore");

	@OriginalMember(owner = "client!na", name = "U", descriptor = "I")
	public static int anInt2138 = 0;

	@OriginalMember(owner = "client!na", name = "V", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1117 = Static80.method1463("(Udns");

	@OriginalMember(owner = "client!na", name = "W", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1118 = Static80.method1463("titlebox");

	@OriginalMember(owner = "client!na", name = "X", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1119 = aClass63_1116;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILclient!ea;I[Lclient!hc;IIBII[B)V")
	public static void method1432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class30[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(15) Class6_Sub4 local15 = new Class6_Sub4(arg9);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method1337();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method1337();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 >> 12;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 & 0x3F;
				@Pc(59) int local59 = local15.method1321();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (arg6 == local45 && local51 >= arg7 && local51 < arg7 + 8 && arg8 <= local55 && arg8 + 8 > local55) {
					@Pc(102) Class6_Sub3_Sub10 local102 = Static123.method2172(local17);
					@Pc(119) int local119 = Static41.method901(arg5, local55 & 0x7, local67, local51 & 0x7, local102.anInt1683, local102.anInt1672) + arg0;
					@Pc(137) int local137 = arg3 + Static5.method38(arg5, local102.anInt1672, local51 & 0x7, local67, local55 & 0x7, local102.anInt1683);
					if (local119 > 0 && local137 > 0 && local119 < 103 && local137 < 103) {
						@Pc(157) int local157 = arg1;
						if ((Static103.aByteArrayArrayArray92[1][local119][local137] & 0x2) == 2) {
							local157 = arg1 - 1;
						}
						@Pc(173) Class30 local173 = null;
						if (local157 >= 0) {
							local173 = arg4[local157];
						}
						Static37.method875(arg1, arg5 + local67 & 0x3, arg2, local17, local119, local173, local63, local137);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!ge;II)Z")
	public static boolean method1433(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte[] local10 = arg1.method110(arg2, arg0);
		if (local10 == null) {
			return false;
		} else {
			Static57.method1135(local10);
			return true;
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)I")
	public static int method1434() {
		return Static32.anInt1130++;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)Lclient!rd;")
	public static Class63 method1435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static78.aClass63_1126;
		} else if (local8 < -6) {
			return Static14.aClass63_317;
		} else if (local8 < -3) {
			return Static13.aClass63_293;
		} else if (local8 < 0) {
			return Static30.aClass63_546;
		} else if (local8 > 9) {
			return Static111.aClass63_1658;
		} else if (local8 > 6) {
			return Static48.aClass63_788;
		} else if (local8 > 3) {
			return Static120.aClass63_1768;
		} else if (local8 > 0) {
			return Static94.aClass63_1382;
		} else {
			return Static12.aClass63_279;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lclient!tb;")
	public static Class6_Sub3_Sub15 method1437(@OriginalArg(0) int arg0) {
		@Pc(6) Class6_Sub3_Sub15 local6 = (Class6_Sub3_Sub15) Static113.aClass49_7.method1397((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(35) byte[] local35 = Static74.aClass7_41.method110(16, arg0);
		local6 = new Class6_Sub3_Sub15();
		if (local35 != null) {
			local6.method1895(new Class6_Sub4(local35));
		}
		Static113.aClass49_7.method1396((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method1438() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static86.anIntArray277[local9 + 32512] = 255;
			}
		}
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(60) int local60;
		for (local16 = 0; local16 < 100; local16++) {
			local46 = (int) (Math.random() * 124.0D) + 2;
			local53 = (int) (Math.random() * 128.0D) + 128;
			local60 = local46 + (local53 << 7);
			Static86.anIntArray277[local60] = 192;
		}
		for (local46 = 1; local46 < 255; local46++) {
			for (local53 = 1; local53 < 127; local53++) {
				local60 = (local46 << 7) + local53;
				Static79.anIntArray242[local60] = (Static86.anIntArray277[local60 - 1] + Static86.anIntArray277[local60 + 1] + Static86.anIntArray277[local60 + -128] + Static86.anIntArray277[local60 - -128]) / 4;
			}
		}
		Static37.anInt1232 += 128;
		if (Static37.anInt1232 > Static85.anIntArray305.length) {
			local53 = (int) (Math.random() * 12.0D);
			Static37.anInt1232 -= Static85.anIntArray305.length;
			Static10.method268(Static100.aClass6_Sub3_Sub3_Sub3Array6[local53]);
		}
		@Pc(168) int local168;
		for (local53 = 1; local53 < 255; local53++) {
			for (local60 = 1; local60 < 127; local60++) {
				local168 = (local53 << 7) + local60;
				@Pc(189) int local189 = Static79.anIntArray242[local168 + 128] - Static85.anIntArray305[local168 + Static37.anInt1232 & Static85.anIntArray305.length - 1] / 5;
				if (local189 < 0) {
					local189 = 0;
				}
				Static86.anIntArray277[local168] = local189;
			}
		}
		for (local60 = 0; local60 < 255; local60++) {
			Static65.anIntArray218[local60] = Static65.anIntArray218[local60 + 1];
		}
		Static65.anIntArray218[255] = (int) (Math.sin((double) Static73.anInt2064 / 14.0D) * 16.0D + Math.sin((double) Static73.anInt2064 / 15.0D) * 14.0D + Math.sin((double) Static73.anInt2064 / 16.0D) * 12.0D);
		if (Static106.anInt2957 > 0) {
			Static106.anInt2957 -= 4;
		}
		if (Static15.anInt489 > 0) {
			Static15.anInt489 -= 4;
		}
		if (Static106.anInt2957 != 0 || Static15.anInt489 != 0) {
			return;
		}
		local168 = (int) (Math.random() * 2000.0D);
		if (local168 == 0) {
			Static106.anInt2957 = 1024;
		}
		if (local168 == 1) {
			Static15.anInt489 = 1024;
			return;
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	public static void method1439() {
		aClass63_1116 = null;
		aClass63_1114 = null;
		aCRC32_2 = null;
		aClass63_1119 = null;
		aClass19_1 = null;
		aClass6_Sub3_Sub16_1 = null;
		aClass6_Sub3_Sub3_Sub3Array5 = null;
		aClass63_1117 = null;
		aClass29_13 = null;
		aClass63_1115 = null;
		aClass63_1118 = null;
		anIntArray240 = null;
	}
}
