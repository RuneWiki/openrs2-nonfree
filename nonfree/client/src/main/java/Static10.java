import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
	public static int anInt248;

	@OriginalMember(owner = "client!aj", name = "N", descriptor = "[I")
	public static int[] anIntArray7;

	@OriginalMember(owner = "client!aj", name = "Q", descriptor = "Lclient!rm;")
	public static Class4_Sub6_Sub4 aClass4_Sub6_Sub4_1;

	@OriginalMember(owner = "client!aj", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString5 = "Select";

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
	public static void method199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < Static17.anInt384; local13++) {
			@Pc(24) Class34 local24 = Static1.method5(local13);
			if (local24 != null) {
				@Pc(31) int local31 = local24.anInt1198;
				if (local31 >= 0 && !Static283.anInterface1_1.method2433(local31)) {
					local31 = -1;
				}
				@Pc(62) int local62;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(105) int local105;
				if (local24.anInt1202 >= 0) {
					local71 = local24.anInt1202;
					local77 = arg0 + (local71 & 0x7F);
					if (local77 < 0) {
						local77 = 0;
					} else if (local77 > 127) {
						local77 = 127;
					}
					local105 = (arg1 + local71 & 0xFC00) + (local71 & 0x380) + local77;
					local62 = Static283.anIntArray441[Static269.method4236(96, local105)];
				} else if (local31 >= 0) {
					local62 = Static283.anIntArray441[Static269.method4236(96, Static283.anInterface1_1.method2431(local31))];
				} else if (local24.anInt1194 == -1) {
					local62 = -1;
				} else {
					local71 = local24.anInt1194;
					local77 = (local71 & 0x7F) + arg0;
					if (local77 < 0) {
						local77 = 0;
					} else if (local77 > 127) {
						local77 = 127;
					}
					local105 = local77 + (local71 + arg1 & 0xFC00) + (local71 & 0x380);
					local62 = Static283.anIntArray441[Static269.method4236(96, local105)];
				}
				Static112.anIntArray191[local13 + 1] = local62;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)Lclient!hk;")
	public static Class67 method201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class67 local14 = local7.aClass67_1;
			local7.aClass67_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "(I)V")
	public static void method202() {
		Static183.aClass97Array2 = null;
		Static207.method1814(0, Static189.anInt5672, -1, 0, 0, 0, Static292.anInt5674, Static56.anInt1264);
		if (Static183.aClass97Array2 != null) {
			Static123.method2032(Static189.anInt5672, Static256.anInt5021, Static183.aClass97Array2, -1412584499, Static160.anInt3284, 0, Static48.aClass97_7.anInt3126, Static292.anInt5674, 0);
			Static183.aClass97Array2 = null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZB)V")
	public static void method203(@OriginalArg(0) boolean arg0) {
		if (Static178.aBoolean233 != arg0) {
			Static178.aBoolean233 = arg0;
			Static22.method454();
		}
	}
}
