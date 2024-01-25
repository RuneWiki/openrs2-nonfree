import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!or", name = "f", descriptor = "Lclient!db;")
	public static final Class64 aClass64_332 = new Class64(22, 6);

	@OriginalMember(owner = "client!or", name = "g", descriptor = "I")
	public static final int anInt6850 = 1401;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!oa;BLclient!ub;Lclient!ee;)V")
	public static void method5714(@OriginalArg(0) Class66 arg0, @OriginalArg(2) Class4_Sub48 arg1, @OriginalArg(3) Class86 arg2) {
		@Pc(10) Class13 local10 = arg2.method2407(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.QA();
		if (local16 < local10.b()) {
			local16 = local10.b();
		}
		@Pc(28) int local28 = arg1.anInt8898;
		@Pc(31) int local31 = arg1.anInt8899;
		@Pc(33) int local33 = 0;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(58) int local58;
		@Pc(85) int local85;
		if (arg2.aString22 != null) {
			local33 = Static272.aClass196_7.method4385(null, Static193.aStringArray14, null, arg2.aString22);
			for (local58 = 0; local58 < local33; local58++) {
				@Pc(64) String local64 = Static193.aStringArray14[local58];
				if (local58 < local33 - 1) {
					local64 = local64.substring(0, local64.length() - 4);
				}
				local85 = Static40.aClass189_1.method4344(local64);
				if (local85 > local42) {
					local42 = local85;
				}
			}
			local44 = local33 * Static40.aClass189_1.method4341() + Static40.aClass189_1.method4340() / 2;
		}
		local58 = arg1.anInt8898 + local16 / 2;
		if (local16 + Static392.anInt8802 > local28) {
			local28 = Static392.anInt8802;
			local58 = local42 / 2 + Static392.anInt8802 + local16 / 2 + 15;
		} else if (local28 > Static392.anInt8800 - local16) {
			local58 = Static392.anInt8800 - local42 / 2 - local16 / 2 - 10 - 5;
			local28 = Static392.anInt8800 - local16;
		}
		@Pc(179) int local179 = arg1.anInt8899;
		if (Static392.anInt8793 + local16 > local31) {
			local179 = local16 / 2 + Static392.anInt8793 + 10;
			local31 = Static392.anInt8793;
		} else if (local31 > Static392.anInt8796 - local16) {
			local179 = Static392.anInt8796 - local16 / 2 - local44 - 10;
			local31 = Static392.anInt8796 - local16;
		}
		local85 = (int) (Math.atan2((double) (local28 - arg1.anInt8898), (double) (local31 - arg1.anInt8899)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method8018((float) local16 / 2.0F + (float) local28, (float) local16 / 2.0F + (float) local31, 4096, local85);
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		if (arg2.aString22 != null) {
			local259 = local58 - local42 / 2 - 5;
			local261 = local179;
			local263 = local259 + local42 + 10;
			local265 = local179 + local33 * Static40.aClass189_1.method4341() + 3;
			if (arg2.anInt2728 != 0) {
				arg0.method6794(local263 - local259, local259, local265 - local179, local179, arg2.anInt2728);
			}
			if (arg2.anInt2709 != 0) {
				arg0.method6822(local259, arg2.anInt2709, local265 - local179, local179, local263 - local259);
			}
			for (@Pc(330) int local330 = 0; local330 < local33; local330++) {
				@Pc(336) String local336 = Static193.aStringArray14[local330];
				if (local33 - 1 > local330) {
					local336 = local336.substring(0, local336.length() - 4);
				}
				Static40.aClass189_1.method4342(arg0, local336, local58, local179, arg2.anInt2719);
				local179 += Static40.aClass189_1.method4341();
			}
		}
		if (arg2.anInt2727 == -1 && arg2.aString22 == null) {
			return;
		}
		@Pc(384) Class4_Sub35 local384 = new Class4_Sub35(arg1);
		local16 >>= 0x1;
		local384.anInt6494 = local31 + local16;
		local384.anInt6495 = local16 + local28;
		local384.anInt6496 = local261;
		local384.anInt6500 = local265;
		local384.anInt6502 = local259;
		local384.anInt6497 = local31 - local16;
		local384.anInt6499 = local263;
		local384.anInt6503 = local28 - local16;
		Static457.aClass124_51.method3275(local384);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)Lclient!ff;")
	public static Class104 method5715(@OriginalArg(1) int arg0) {
		@Pc(8) Class104[] local8 = Static192.method3533();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class104 local16 = local8[local10];
			if (arg0 == local16.anInt3141) {
				return local16;
			}
		}
		return null;
	}
}
