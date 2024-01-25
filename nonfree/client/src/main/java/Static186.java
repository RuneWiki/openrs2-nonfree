import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
	public static void method9079() {
		@Pc(5) int local5;
		if (Static476.aClass296Array1 != null) {
			for (local5 = 0; local5 < Static275.anInt4779; local5++) {
				Static476.aClass296Array1[local5] = null;
			}
			Static476.aClass296Array1 = null;
		}
		if (Static673.aClass296Array4 != null) {
			for (local5 = 0; local5 < Static54.anInt1357; local5++) {
				Static673.aClass296Array4[local5] = null;
			}
			Static673.aClass296Array4 = null;
		}
		if (Static505.aClass296Array2 != null) {
			for (local5 = 0; local5 < Static297.anInt5234; local5++) {
				Static505.aClass296Array2[local5] = null;
			}
			Static505.aClass296Array2 = null;
		}
		Static622.aClass296Array3 = null;
		Static643.anIntArray801 = null;
		Static369.anIntArrayArrayArray11 = null;
		Static415.anInt7538 = -1;
		Static429.anInt4560 = -1;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!so;B)V")
	public static void method9080(@OriginalArg(0) Class14_Sub29 arg0) {
		if (arg0.aByteArray84.length - arg0.anInt7264 < 1) {
			return;
		}
		@Pc(27) int local27 = arg0.method5866();
		if (local27 < 0 || local27 > 1 || arg0.aByteArray84.length - arg0.anInt7264 < 2) {
			return;
		}
		@Pc(51) int local51 = arg0.method5900();
		if (arg0.aByteArray84.length - arg0.anInt7264 < local51 * 6) {
			return;
		}
		for (@Pc(65) int local65 = 0; local65 < local51; local65++) {
			@Pc(71) int local71 = arg0.method5900();
			@Pc(75) int local75 = arg0.method5878();
			if (local71 < Static259.anIntArray800.length && Static330.aBooleanArray15[local71] && (Static470.aClass236_6.method5550(local71).aChar4 != '1' || local75 >= -1 && local75 <= 1)) {
				Static259.anIntArray800[local71] = local75;
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!so;)V")
	public static void method9081(@OriginalArg(1) Class14_Sub29 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static327.anInt6191; local7++) {
			@Pc(13) int local13 = arg0.method5895();
			@Pc(17) int local17 = arg0.method5900();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static430.aClass217_Sub1Array2[local13] != null) {
				Static430.aClass217_Sub1Array2[local13].anInt9131 = local17;
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!kv;IIIB)V")
	public static void method9082(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class14_Sub31 local10 = (Class14_Sub31) Static40.aClass262_7.method6318(); local10 != null; local10 = (Class14_Sub31) Static40.aClass262_7.method6311()) {
			if (arg3 == local10.anInt5970 && arg2 << 9 == local10.anInt5968 && local10.anInt5973 == arg1 << 9 && local10.aClass203_1.anInt6014 == arg0.anInt6014) {
				if (local10.aClass14_Sub5_Sub4_2 != null) {
					Static217.aClass14_Sub5_Sub3_1.method6029(local10.aClass14_Sub5_Sub4_2);
					local10.aClass14_Sub5_Sub4_2 = null;
				}
				if (local10.aClass14_Sub5_Sub4_3 != null) {
					Static217.aClass14_Sub5_Sub3_1.method6029(local10.aClass14_Sub5_Sub4_3);
					local10.aClass14_Sub5_Sub4_3 = null;
				}
				local10.method9315();
				return;
			}
		}
	}
}
