import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
	public static int anInt4949 = 10;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString354 = "Choose Option";

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
	public static int anInt4951 = 0;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
	public static int anInt4955 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ge;B)V")
	public static void method3752(@OriginalArg(0) Class7_Sub1 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static50.anIntArray110.length; local5++) {
			Static50.anIntArray110[local5] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) (Math.random() * 128.0D * (double) 256);
			Static50.anIntArray110[local32] = (int) (Math.random() * 284.0D);
		}
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(66) int local66;
		for (local32 = 0; local32 < 20; local32++) {
			for (local54 = 1; local54 < 255; local54++) {
				for (local58 = 1; local58 < 127; local58++) {
					local66 = local58 + (local54 << 7);
					Static254.anIntArray462[local66] = (Static50.anIntArray110[local66 - 128] + Static50.anIntArray110[local66 + 1] + Static50.anIntArray110[local66 + -1] + Static50.anIntArray110[local66 - -128]) / 4;
				}
			}
			@Pc(113) int[] local113 = Static50.anIntArray110;
			Static50.anIntArray110 = Static254.anIntArray462;
			Static254.anIntArray462 = local113;
		}
		if (arg0 == null) {
			return;
		}
		local54 = 0;
		for (local58 = 0; local58 < arg0.anInt2107; local58++) {
			for (local66 = 0; local66 < arg0.anInt2109; local66++) {
				if (arg0.aByteArray26[local54++] != 0) {
					@Pc(149) int local149 = arg0.anInt2110 + local58 + 16;
					@Pc(157) int local157 = local66 + arg0.anInt2108 + 16;
					@Pc(163) int local163 = (local149 << 7) + local157;
					Static50.anIntArray110[local163] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(BI)I")
	public static int method3753(@OriginalArg(1) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lclient!me;")
	public static Class1_Sub2_Sub10 method3757(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub10 local10 = (Class1_Sub2_Sub10) Static84.aClass58_8.method2093((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static46.aClass51_18.method1874(11, arg0);
		local10 = new Class1_Sub2_Sub10();
		if (local25 != null) {
			local10.method2636(new Class1_Sub13(local25));
		}
		Static84.aClass58_8.method2089((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3758(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static202.method3368(arg0);
		if (local7 != -1) {
			@Pc(38) int[] local38 = Static122.aClass1_Sub2_Sub11_2.method2860(Static254.aClass151_2.anIntArray470[local7] >> 28 & 0x3, Static254.aClass151_2.anIntArray470[local7] & 0x3FFF, Static254.aClass151_2.anIntArray470[local7] >> 14 & 0x3FFF);
			Static155.method2758(local38[1], local38[2]);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)Lclient!wd;")
	public static Class148 method3759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass148_1 == null ? null : local7.aClass148_1;
	}
}
