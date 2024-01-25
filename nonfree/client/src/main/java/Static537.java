import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!um", name = "d", descriptor = "I")
	public static int anInt9039;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[4];

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public static void method7481() {
		@Pc(12) int local12 = Static60.anInt1505;
		@Pc(14) int[] local14 = Static346.anIntArray413;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class20_Sub2_Sub4_Sub1_Sub1 local24 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local14[local16]];
			if (local24 != null) {
				Static441.method6335(local24, local24.method5349());
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method7482(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 + arg2;
		for (@Pc(22) int local22 = arg0; local22 < local15; local22++) {
			@Pc(30) int local30 = arg1[local22] & 0xFF;
			if (local30 < 128) {
				local8[local10++] = (char) local30;
			} else if (local30 >= 194) {
				@Pc(88) int local88;
				if (local30 >= 224) {
					if (local30 >= 240) {
						if (local30 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local30);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local15 <= local22 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local22++;
					local88 = arg1[local22] & 0xFF;
					if (local88 < 128 || local88 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local22++;
					@Pc(110) int local110 = arg1[local22] & 0xFF;
					if (local110 < 128 || local110 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) ((local88 & 0xFFFFFF7F) << 6 | (local30 & 0xFFF1F) << 12 | local110 & 0xFFFFFF7F);
				} else if (local15 > local22 + 1) {
					local22++;
					local88 = arg1[local22] & 0xFF;
					if (local88 < 128 || local88 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local88 & 0xFFFFFF7F | (local30 & 0xFFFFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local30);
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IILclient!ua;IIIBLclient!wv;Lclient!r;)V")
	public static void method7483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class365 arg6, @OriginalArg(8) Class12 arg7) {
		@Pc(14) Class196 local14 = Static299.aClass46_4.method1408(arg0);
		if (local14 == null || !local14.aBoolean392 || !local14.method4334(Static121.aClass148_1)) {
			return;
		}
		@Pc(34) int local34;
		if (local14.anIntArray314 != null) {
			@Pc(32) int[] local32 = new int[local14.anIntArray314.length];
			@Pc(44) int local44;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static585.anInt9461 == 4) {
					local44 = (int) Static143.aFloat61 & 0x3FFF;
				} else {
					local44 = (int) Static143.aFloat61 + Static368.anInt6520 & 0x3FFF;
				}
				@Pc(57) int local57 = Class151.anIntArray244[local44];
				@Pc(61) int local61 = Class151.anIntArray245[local44];
				if (Static585.anInt9461 != 4) {
					local61 = local61 * 256 / (Static536.anInt8845 + 256);
					local57 = local57 * 256 / (Static536.anInt8845 + 256);
				}
				local32[local34 * 2] = arg6.anInt9578 / 2 + arg1 + ((arg5 + local14.anIntArray314[local34 * 2] * 4) * local61 + (arg3 + local14.anIntArray314[local34 * 2 - -1] * 4) * local57 >> 14);
				local32[local34 * 2 + 1] = arg6.anInt9638 / 2 + arg4 - ((arg3 + local14.anIntArray314[local34 * 2 + 1] * 4) * local61 - (arg5 + local14.anIntArray314[local34 * 2] * 4) * local57 >> 14);
			}
			Static458.method6509(arg7, local32, local14.anInt5168, arg6.anIntArray635, arg6.anIntArray639);
			for (local44 = 0; local44 < local32.length / 2 - 1; local44++) {
				arg7.method6448(local32[local44 * 2], local32[local44 * 2 + 1], local32[(local44 + 1) * 2], local32[(local44 + 1) * 2 + 1], local14.anInt5170, arg2, arg1, arg4);
			}
			arg7.method6448(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local14.anInt5170, arg2, arg1, arg4);
		}
		@Pc(265) Class10 local265 = null;
		if (local14.anInt5179 != -1) {
			local265 = local14.method4331(arg7, false);
			if (local265 != null) {
				Static229.method7248(arg4, arg3, arg6, arg2, arg5, arg1, local265);
			}
		}
		if (local14.aString57 == null) {
			return;
		}
		local34 = 0;
		if (local265 != null) {
			local34 = local265.u();
		}
		@Pc(299) Class35 local299 = Static443.aClass35_11;
		@Pc(301) Class13 local301 = Static481.aClass13_13;
		if (local14.anInt5171 == 1) {
			local301 = Static510.aClass13_14;
			local299 = Static21.aClass35_1;
		}
		if (local14.anInt5171 == 2) {
			local301 = Static566.aClass13_15;
			local299 = Static260.aClass35_7;
		}
		Static283.method4365(arg4, arg2, arg5, local14.aString57, local299, arg6, arg3, arg1, local14.anInt5165, local34, local301);
		return;
	}
}
