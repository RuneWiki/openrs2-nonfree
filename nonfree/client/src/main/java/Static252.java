import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "I")
	public static int anInt4623;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "Lclient!he;")
	public static final Class135 aClass135_5 = new Class135("WTRC", 1);

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)I")
	public static int method4088() {
		if (Static447.aBoolean555) {
			return 6;
		} else if (Static203.aClass3_Sub4_Sub13_1 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static203.aClass3_Sub4_Sub13_1.anInt4577;
			if (Static280.method4532(local14)) {
				return 1;
			} else if (Static13.method8716(local14)) {
				return 2;
			} else if (Static213.method3609(local14)) {
				return 3;
			} else if (Static582.method8235(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIILclient!eda;IIIIIILclient!cga;)V")
	public static void method4089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class83 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class50 arg10) {
		Static246.anInt4547 = arg0;
		Static253.anInt4637 = arg4;
		Static140.anInt2832 = arg8;
		Static24.anInt933 = arg6;
		Static519.anInt8027 = arg9;
		Static575.aClass50_15 = arg10;
		Static599.anInt9786 = arg1;
		Static453.anInt4354 = arg2;
		Static628.aClass107_6 = null;
		Static570.aClass83_13 = arg3;
		Static49.anInt1400 = arg7;
		Static326.anInt6109 = arg5;
		Static44.aClass107_1 = null;
		Static47.aClass107_2 = null;
		Static332.method5443();
		Static403.aBoolean502 = true;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method4092(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static68.anInt1696; local11++) {
			if (arg0.equalsIgnoreCase(Static422.aStringArray29[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString63);
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)V")
	public static void method4093() {
		for (@Pc(18) Class3_Sub40 local18 = (Class3_Sub40) Static229.aClass223_18.method5874(); local18 != null; local18 = (Class3_Sub40) Static229.aClass223_18.method5870()) {
			if (local18.anInt7272 > 0) {
				local18.anInt7272--;
			}
			if (local18.anInt7272 != 0) {
				if (local18.anInt7262 > 0) {
					local18.anInt7262--;
				}
				if (local18.anInt7262 == 0 && local18.anInt7269 >= 1 && local18.anInt7265 >= 1 && Static634.anInt10129 - 2 >= local18.anInt7269 && local18.anInt7265 <= Static638.anInt10172 - 2 && (local18.anInt7273 < 0 || Static15.method839(local18.anInt7273, local18.anInt7264))) {
					Static147.method2683(local18.anInt7273, local18.anInt7264, local18.anInt7270, local18.anInt7263, -1, local18.anInt7266, local18.anInt7269, local18.anInt7265);
					local18.anInt7262 = -1;
					if (local18.anInt7273 == local18.anInt7271 && local18.anInt7271 == -1) {
						local18.method8769();
					} else if (local18.anInt7271 == local18.anInt7273 && local18.anInt7267 == local18.anInt7266 && local18.anInt7264 == local18.anInt7274) {
						local18.method8769();
					}
				}
			} else if (local18.anInt7271 < 0 || Static15.method839(local18.anInt7271, local18.anInt7274)) {
				Static147.method2683(local18.anInt7271, local18.anInt7274, local18.anInt7270, local18.anInt7263, -1, local18.anInt7267, local18.anInt7269, local18.anInt7265);
				local18.method8769();
			}
		}
	}
}
