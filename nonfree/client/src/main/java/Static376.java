import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public static int anInt7260;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "Lclient!sh;")
	public static Class302 aClass302_1;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)I")
	public static int method6002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static499.aClass83Array3 == null) {
			return 0;
		}
		if (arg0 < 3) {
			@Pc(19) int local19 = arg2 >> 9;
			@Pc(23) int local23 = arg3 >> 9;
			if (arg4 < 0 || arg1 < 0 || arg4 > Static428.anInt8046 - 1 || Static119.anInt2717 - 1 < arg1) {
				return 0;
			}
			if (local19 < 1 || local23 < 1 || Static428.anInt8046 - 1 < local19 || local23 > Static119.anInt2717 - 1) {
				return 0;
			}
			@Pc(94) boolean local94 = (Static262.aByteArrayArrayArray16[1][arg2 >> 9][arg3 >> 9] & 0x2) != 0;
			@Pc(119) boolean local119;
			@Pc(135) boolean local135;
			if ((arg2 & 0x1FF) == 0) {
				local119 = (Static262.aByteArrayArrayArray16[1][local19 - 1][arg3 >> 9] & 0x2) != 0;
				local135 = (Static262.aByteArrayArrayArray16[1][local19][arg3 >> 9] & 0x2) != 0;
				if (local119 != local135) {
					local94 = (Static262.aByteArrayArrayArray16[1][arg4][arg1] & 0x2) != 0;
				}
			}
			if ((arg3 & 0x1FF) == 0) {
				local119 = (Static262.aByteArrayArrayArray16[1][arg2 >> 9][local23 - 1] & 0x2) != 0;
				local135 = (Static262.aByteArrayArrayArray16[1][arg2 >> 9][local23] & 0x2) != 0;
				if (local119 != local135) {
					local94 = (Static262.aByteArrayArrayArray16[1][arg4][arg1] & 0x2) != 0;
				}
			}
			if (local94) {
				arg0++;
			}
		}
		return Static499.aClass83Array3[arg0].method7213(arg2, arg3);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public static void method6004() {
		if (Static414.aFileOutputStream1 != null) {
			try {
				Static414.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Static414.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
	public static void method6005() {
		@Pc(8) int local8 = Static215.aByteArrayArray13.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static215.aByteArrayArray13[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static286.anInt5864; local20++) {
					if (Static75.anIntArray18[local10] == Static113.anIntArray121[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static113.anIntArray121[Static286.anInt5864] = Static75.anIntArray18[local10];
					local18 = Static286.anInt5864++;
				}
				@Pc(64) Class4_Sub11 local64 = new Class4_Sub11(Static215.aByteArrayArray13[local10]);
				@Pc(66) int local66 = 0;
				while (Static215.aByteArrayArray13[local10].length > local64.anInt5831 && local66 < 511 && Static418.anInt7866 < 1023) {
					@Pc(87) int local87 = local66++ << 6 | local18;
					@Pc(93) int local93 = local64.method4936();
					@Pc(97) int local97 = local93 >> 14;
					@Pc(103) int local103 = local93 >> 7 & 0x3F;
					@Pc(107) int local107 = local93 & 0x3F;
					@Pc(120) int local120 = local103 + (Static75.anIntArray18[local10] >> 8) * 64 - Static552.anInt9805;
					@Pc(133) int local133 = (Static75.anIntArray18[local10] & 0xFF) * 64 + local107 - Static254.anInt4667;
					@Pc(142) Class283 local142 = Static237.aClass31_1.method478(local64.method4936());
					@Pc(149) Class4_Sub4 local149 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local87);
					if (local149 == null && (local142.aByte94 & 0x1) > 0 && Static223.anInt4078 == local97 && local120 >= 0 && local142.anInt8266 + local120 < Static428.anInt8046 && local133 >= 0 && local133 + local142.anInt8266 < Static119.anInt2717) {
						@Pc(193) Class1_Sub4_Sub2_Sub1_Sub1 local193 = new Class1_Sub4_Sub2_Sub1_Sub1();
						local193.anInt8435 = local87;
						@Pc(201) Class4_Sub4 local201 = new Class4_Sub4(local193);
						Static585.aClass350_41.method8199((long) local87, local201);
						Static457.aClass4_Sub4Array1[Static436.anInt8163++] = local201;
						Static43.anIntArray23[Static418.anInt7866++] = local87;
						local193.anInt8384 = Static106.anInt2418;
						local193.method4510(local142);
						local193.method6920(local193.aClass283_1.anInt8266);
						local193.anInt8394 = local193.aClass283_1.anInt8234 << 3;
						local193.method6934(true, local193.aClass283_1.aByte87 + 4 << 11 & 0x3BBB);
						local193.method4512(local193.method6925(), local133, local120, true, local97);
					}
				}
			}
		}
	}
}
