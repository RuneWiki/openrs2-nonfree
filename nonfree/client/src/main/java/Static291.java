import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!op", name = "C", descriptor = "Lclient!aj;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!op", name = "K", descriptor = "Lclient!o;")
	public static Class13 aClass13_18;

	@OriginalMember(owner = "client!op", name = "B", descriptor = "I")
	public static int anInt4793 = 0;

	@OriginalMember(owner = "client!op", name = "E", descriptor = "I")
	public static int anInt4794 = 0;

	@OriginalMember(owner = "client!op", name = "H", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLclient!nf;)V")
	public static void method3890(@OriginalArg(1) Class2_Sub13_Sub2 arg0) {
		arg0.method3612();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static119.anInt2204; local12++) {
			local18 = Static200.anIntArray295[local12];
			if ((Static413.aByteArray86[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static413.aByteArray86[local18] = (byte) (Static413.aByteArray86[local18] | 0x2);
				} else {
					local43 = arg0.method3615(1);
					if (local43 == 0) {
						local10 = Static314.method4295(arg0);
						Static413.aByteArray86[local18] = (byte) (Static413.aByteArray86[local18] | 0x2);
					} else {
						Static367.method4818(local18, arg0);
					}
				}
			}
		}
		arg0.method3617();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3612();
		@Pc(124) int local124;
		for (local18 = 0; local18 < Static119.anInt2204; local18++) {
			local43 = Static200.anIntArray295[local18];
			if ((Static413.aByteArray86[local43] & 0x1) != 0) {
				if (local10 > 0) {
					Static413.aByteArray86[local43] = (byte) (Static413.aByteArray86[local43] | 0x2);
					local10--;
				} else {
					local124 = arg0.method3615(1);
					if (local124 == 0) {
						local10 = Static314.method4295(arg0);
						Static413.aByteArray86[local43] = (byte) (Static413.aByteArray86[local43] | 0x2);
					} else {
						Static367.method4818(local43, arg0);
					}
				}
			}
		}
		arg0.method3617();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3612();
		@Pc(206) int local206;
		for (local43 = 0; local43 < Static111.anInt2076; local43++) {
			local124 = Static100.anIntArray148[local43];
			if ((Static413.aByteArray86[local124] & 0x1) != 0) {
				if (local10 > 0) {
					Static413.aByteArray86[local124] = (byte) (Static413.aByteArray86[local124] | 0x2);
					local10--;
				} else {
					local206 = arg0.method3615(1);
					if (local206 == 0) {
						local10 = Static314.method4295(arg0);
						Static413.aByteArray86[local124] = (byte) (Static413.aByteArray86[local124] | 0x2);
					} else if (Static32.method478(arg0, local124)) {
						Static413.aByteArray86[local124] = (byte) (Static413.aByteArray86[local124] | 0x2);
					}
				}
			}
		}
		arg0.method3617();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3612();
		for (local124 = 0; local124 < Static111.anInt2076; local124++) {
			local206 = Static100.anIntArray148[local124];
			if ((Static413.aByteArray86[local206] & 0x1) == 0) {
				if (local10 > 0) {
					Static413.aByteArray86[local206] = (byte) (Static413.aByteArray86[local206] | 0x2);
					local10--;
				} else {
					@Pc(298) int local298 = arg0.method3615(1);
					if (local298 == 0) {
						local10 = Static314.method4295(arg0);
						Static413.aByteArray86[local206] = (byte) (Static413.aByteArray86[local206] | 0x2);
					} else if (Static32.method478(arg0, local206)) {
						Static413.aByteArray86[local206] = (byte) (Static413.aByteArray86[local206] | 0x2);
					}
				}
			}
		}
		arg0.method3617();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static119.anInt2204 = 0;
		Static111.anInt2076 = 0;
		for (local206 = 1; local206 < 2048; local206++) {
			Static413.aByteArray86[local206] = (byte) (Static413.aByteArray86[local206] >> 1);
			@Pc(373) Class3_Sub4_Sub1_Sub2 local373 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local206];
			if (local373 == null) {
				Static100.anIntArray148[Static111.anInt2076++] = local206;
			} else {
				Static200.anIntArray295[Static119.anInt2204++] = local206;
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3891(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!op", name = "i", descriptor = "(I)V")
	public static void method3892() {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(15, 0);
		local8.method3101();
	}
}
