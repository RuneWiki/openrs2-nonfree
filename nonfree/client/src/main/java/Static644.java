import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!za", name = "j", descriptor = "F")
	public static float aFloat214;

	@OriginalMember(owner = "client!za", name = "h", descriptor = "I")
	public static int anInt10230 = 0;

	@OriginalMember(owner = "client!za", name = "k", descriptor = "[I")
	public static final int[] anIntArray666 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(BZ)V")
	public static void method8773(@OriginalArg(1) boolean arg0) {
		Static1.method8294();
		if (!Static2.method22(Static485.anInt8420)) {
			return;
		}
		Static556.anInt9294++;
		if (Static556.anInt9294 < 50 && !arg0) {
			return;
		}
		Static556.anInt9294 = 0;
		if (!Static137.aBoolean215 && Static413.aClass230_1 != null) {
			@Pc(40) Class3_Sub14 local40 = Static139.method2308(Static55.aClass130_24, Static24.aClass233_1);
			Static562.method8096(local40);
			try {
				Static154.method2812();
			} catch (@Pc(47) IOException local47) {
				Static137.aBoolean215 = true;
			}
		}
		Static1.method8294();
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method8774(@OriginalArg(1) Class5 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static219.aBoolean285) {
			local7 = Static30.method1089();
			local9 = Static166.method2921();
		}
		arg0.KA(local7, local9, Static109.anInt2357 + local7, 350 - -local9);
		arg0.aa(local7, local9, Static109.anInt2357, 350, Static146.anInt2895 << 24 | 0x332277, 1);
		Static520.method8069(local7, local9, local7 + Static109.anInt2357, local9 + 350);
		@Pc(56) int local56 = 350 / Static293.anInt5180;
		@Pc(65) int local65;
		if (Static451.anInt8003 > 0) {
			local65 = 346 - Static293.anInt5180 - 4;
			@Pc(75) int local75 = local65 * local56 / (Static451.anInt8003 + local56 - 1);
			@Pc(77) int local77 = 4;
			if (Static451.anInt8003 > 1) {
				local77 = (Static451.anInt8003 - Static243.anInt4523 - 1) * (local65 - local75) / (Static451.anInt8003 - 1) + 4;
			}
			arg0.aa(local7 + Static109.anInt2357 - 16, local77 + local9, 12, local75, Static146.anInt2895 << 24 | 0x332277, 2);
			for (@Pc(119) int local119 = Static243.anInt4523; local119 < Static243.anInt4523 + local56 && Static451.anInt8003 > local119; local119++) {
				@Pc(128) String[] local128 = Static33.method1210('\b', Static402.aStringArray27[local119]);
				@Pc(135) int local135 = (Static109.anInt2357 - 24) / local128.length;
				for (@Pc(137) int local137 = 0; local137 < local128.length; local137++) {
					@Pc(146) int local146 = local137 * local135 + 8;
					arg0.KA(local146 + local7, local9, local135 + local7 + local146 - 8, local9 + 350);
					Static187.aClass62_4.method8373(-16777216, -1, local146 + local7, Static18.method893(local128[local137]), local9 + 350 - (local119 - Static243.anInt4523) * Static293.anInt5180 - Static324.anInt8110 - Static256.aClass282_7.anInt8306 - 2);
				}
			}
		}
		Static557.aClass62_12.method8366(-16777216, local7 + Static109.anInt2357 - 25, "Build: 630", local9 + 350 - 20, -1);
		arg0.KA(local7, local9, local7 + Static109.anInt2357, local9 + 350);
		arg0.method7508(local9 + 350 - Static324.anInt8110, Static109.anInt2357, local7, -1);
		Static460.aClass62_9.method8373(-16777216, -1, local7 + 10, "--> " + Static18.method893(Static141.aString19), local9 + 350 - Static489.aClass282_12.anInt8306 - 1);
		if (!Static638.aBoolean726) {
			return;
		}
		local65 = -1;
		if (Static101.anInt2262 % 30 > 15) {
			local65 = 16777215;
		}
		arg0.method7484(local65, local9 + 350 - Static489.aClass282_12.anInt8306 - 11, 12, local7 + Static489.aClass282_12.method7135("--> " + Static18.method893(Static141.aString19).substring(0, Static577.anInt9502)) + 10);
	}
}
