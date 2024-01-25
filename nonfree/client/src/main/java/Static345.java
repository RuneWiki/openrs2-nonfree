import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	public static int anInt6336 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!et;ILclient!pa;Lclient!qa;III)V")
	public static void method5749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class28 arg4, @OriginalArg(5) Class4 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class65 local10 = Static193.aClass32_2.method1129(arg0);
		if (local10 == null || !local10.aBoolean155 || !local10.method1818(Static417.aClass10_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray125 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray125.length];
			@Pc(42) int local42;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static170.anInt3418 == 4) {
					local42 = (int) Static135.aFloat193 & 0x3FFF;
				} else {
					local42 = (int) Static135.aFloat193 + Static445.anInt7798 & 0x3FFF;
				}
				@Pc(56) int local56 = Class200_Sub1.lb[local42];
				@Pc(60) int local60 = Class200_Sub1.anIntArray576[local42];
				if (Static170.anInt3418 != 4) {
					local56 = local56 * 256 / (Static220.anInt4325 + 256);
					local60 = local60 * 256 / (Static220.anInt4325 + 256);
				}
				local28[local30 * 2] = ((local10.anIntArray125[local30 * 2 + 1] * 4 + arg3) * local56 + local60 * (local10.anIntArray125[local30 * 2] * 4 + arg1) >> 15) + arg2.anInt2399 / 2 + arg7;
				local28[local30 * 2 + 1] = arg2.anInt2378 / 2 + arg6 - ((local10.anIntArray125[local30 * 2 + 1] * 4 + arg3) * local60 - (arg1 + local10.anIntArray125[local30 * 2] * 4) * local56 >> 15);
			}
			Static182.method3541(arg5, local28, local10.anInt1907, arg2.anIntArray189, arg2.anIntArray184);
			for (local42 = 0; local42 < local28.length / 2 - 1; local42++) {
				arg5.method7212(local28[local42 * 2], local28[local42 * 2 + 1], local28[local42 * 2 + 2], local28[(local42 + 1) * 2 + 1], local10.anInt1895, arg4, arg7, arg6);
			}
			arg5.method7212(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt1895, arg4, arg7, arg6);
		}
		@Pc(264) Class104 local264 = null;
		if (local10.anInt1903 != -1) {
			local264 = local10.method1823(arg5, false);
			if (local264 != null) {
				Static119.method2307(arg4, arg2, arg7, arg6, arg3, arg1, local264);
			}
		}
		if (local10.aString37 == null) {
			return;
		}
		local30 = 0;
		if (local264 != null) {
			local30 = local264.la();
		}
		@Pc(297) Class36 local297 = Static403.aClass36_3;
		@Pc(299) Class96 local299 = Static379.aClass96_12;
		if (local10.anInt1920 == 1) {
			local297 = Static186.aClass36_1;
			local299 = Static234.aClass96_8;
		}
		if (local10.anInt1920 == 2) {
			local297 = Static511.aClass36_4;
			local299 = Static270.aClass96_10;
		}
		Static523.method7971(local297, local299, arg7, local10.anInt1909, arg3, arg2, arg4, local10.aString37, local30, arg1, arg6);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)[B")
	public static byte[] method5751(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub10 local12 = (Class1_Sub2_Sub10) Static518.aClass105_3.method2605((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(47) int local47 = 255 - local40;
				@Pc(52) int local52 = Static438.method6797(local47, local23);
				@Pc(56) byte local56 = local17[local52];
				local17[local52] = local17[local47];
				local17[local47] = local17[511 - local40] = local56;
			}
			local12 = new Class1_Sub2_Sub10(local17);
			Static518.aClass105_3.method2600(local12, (long) arg0);
		}
		return local12.aByteArray51;
	}
}
