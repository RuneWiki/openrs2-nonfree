import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
	public static int anInt5814;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	public static int anInt5817;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!mv;")
	public static final Class219 aClass219_14 = new Class219(7, 0, 1, 1);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIB)V")
	public static void method4780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(16, arg1);
		local8.method1898();
		local8.anInt1945 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method4781() {
		for (@Pc(8) Class3_Sub45 local8 = (Class3_Sub45) Static364.aClass183_46.method4795(); local8 != null; local8 = (Class3_Sub45) Static364.aClass183_46.method4793()) {
			if (local8.anInt9263 == -1) {
				local8.anInt9256 = 0;
				if (local8.anInt9258 >= 0 && local8.anInt9267 >= 0 && local8.anInt9258 < Static460.anInt8640 && Static292.anInt7682 > local8.anInt9267) {
					Static459.method7067(local8);
				}
			} else {
				local8.method8412();
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)I")
	public static int method4782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static224.aClass4Array3 == null) {
			return 0;
		}
		@Pc(18) int local18 = arg2 >> 9;
		@Pc(22) int local22 = arg0 >> 9;
		if (local18 < 0 || local22 < 0 || local18 > Static460.anInt8640 - 1 || Static292.anInt7682 - 1 < local22) {
			return 0;
		}
		@Pc(51) int local51 = arg1;
		if (arg1 < 3 && (Static576.aByteArrayArrayArray21[1][local18][local22] & 0x2) != 0) {
			local51 = arg1 + 1;
		}
		return Static224.aClass4Array3[local51].sa(arg2, arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	public static void method4783() {
		@Pc(6) int local6 = Static177.aByteArrayArray16.length;
		for (@Pc(13) int local13 = 0; local13 < local6; local13++) {
			if (Static177.aByteArrayArray16[local13] != null) {
				@Pc(20) int local20 = -1;
				for (@Pc(22) int local22 = 0; local22 < Static269.anInt5720; local22++) {
					if (Static478.anIntArray584[local13] == Static6.anIntArray5[local22]) {
						local20 = local22;
						break;
					}
				}
				if (local20 == -1) {
					Static6.anIntArray5[Static269.anInt5720] = Static478.anIntArray584[local13];
					local20 = Static269.anInt5720++;
				}
				@Pc(63) Class3_Sub7 local63 = new Class3_Sub7(Static177.aByteArrayArray16[local13]);
				@Pc(65) int local65 = 0;
				while (local63.anInt7869 < Static177.aByteArrayArray16[local13].length && local65 < 511 && Static268.anInt5680 < 1023) {
					@Pc(84) int local84 = local65++ << 6 | local20;
					@Pc(88) int local88 = local63.method6535();
					@Pc(92) int local92 = local88 >> 14;
					@Pc(98) int local98 = local88 >> 7 & 0x3F;
					@Pc(102) int local102 = local88 & 0x3F;
					@Pc(115) int local115 = local98 + (Static478.anIntArray584[local13] >> 8) * 64 - Static230.anInt4667;
					@Pc(128) int local128 = local102 + (Static478.anIntArray584[local13] & 0xFF) * 64 - Static563.anInt10006;
					@Pc(137) Class169 local137 = Static121.aClass118_2.method3029(local63.method6535());
					@Pc(144) Class3_Sub46 local144 = (Class3_Sub46) Static331.aClass25_25.method946((long) local84);
					if (local144 == null && (local137.aByte45 & 0x1) > 0 && Static96.anInt2320 == local92 && local115 >= 0 && Static460.anInt8640 > local137.anInt4979 + local115 && local128 >= 0 && local137.anInt4979 + local128 < Static292.anInt7682) {
						@Pc(181) Class2_Sub2_Sub1_Sub2 local181 = new Class2_Sub2_Sub1_Sub2();
						local181.anInt7603 = local84;
						@Pc(189) Class3_Sub46 local189 = new Class3_Sub46(local181);
						Static331.aClass25_25.method945(local189, (long) local84);
						Static60.aClass3_Sub46Array1[Static17.anInt6046++] = local189;
						Static304.anIntArray377[Static268.anInt5680++] = local84;
						local181.anInt7628 = Static129.anInt10429;
						local181.method6322(local137);
						local181.method6315(local181.aClass169_1.anInt4979);
						local181.anInt7591 = local181.aClass169_1.anInt4970 << 3;
						local181.method6301((local181.aClass169_1.aByte44 + 4 & 0x48A00007) << 11, true);
						local181.method6320(local181.method6311(), local128, local115, true, local92);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)I")
	public static int method4784(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local19 * arg0 >> 12) + 40960;
		return local33 * local13 >> 12;
	}
}
