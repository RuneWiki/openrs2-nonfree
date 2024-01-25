import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "Lclient!dga;")
	public static Class65 aClass65_95;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "Lclient!dj;")
	public static final Class71 aClass71_3 = new Class71();

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	public static void method6369(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static508.anInt8998 - Static4.anInt135;
		if (local7 >= 100) {
			Static84.anInt1994 = 1;
			return;
		}
		@Pc(18) int local18 = (int) Static200.aFloat100;
		if (local18 < Static263.anInt5268 >> 8) {
			local18 = Static263.anInt5268 >> 8;
		}
		if (Static518.aBooleanArray39[4] && Static556.anIntArray818[4] + 128 > local18) {
			local18 = Static556.anIntArray818[4] + 128;
		}
		@Pc(55) int local55 = Static416.anInt7786 + (int) Static412.aFloat175 & 0x3FFF;
		Static480.method7894(Static252.anInt5119, Static482.method7333(Static493.anInt8836, Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351, Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347) - 200, arg0, Static357.anInt6870, (local18 >> 3) * 3 + 600 << 2, local55, local18);
		@Pc(105) float local105 = -((float) ((100 - local7) * (100 - local7) * (100 - local7)) / 1000000.0F) + (float) 1;
		Static5.anInt142 = (int) (local105 * (float) (Static5.anInt142 - Static222.anInt4655) + (float) Static222.anInt4655);
		Static86.anInt2132 = (int) (local105 * (float) (Static86.anInt2132 - Static24.anInt8438) + (float) Static24.anInt8438);
		Static348.anInt6726 = (int) ((float) Static95.anInt2289 + (float) (Static348.anInt6726 - Static95.anInt2289) * local105);
		Static390.anInt7318 = (int) ((float) Static502.anInt8936 + (float) (Static390.anInt7318 - Static502.anInt8936) * local105);
		@Pc(157) int local157 = Static393.anInt7341 - Static460.anInt8490;
		if (local157 > 8192) {
			local157 -= 16384;
		} else if (local157 < -8192) {
			local157 += 16384;
		}
		Static393.anInt7341 = (int) ((float) local157 * local105 + (float) Static460.anInt8490);
		Static393.anInt7341 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(III)I")
	public static int method6371(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(44) int local44 = (arg0 & 0x7F) * 96 >> 7;
			if (local44 < 2) {
				local44 = 2;
			} else if (local44 > 126) {
				local44 = 126;
			}
			return local44 + (arg0 & 0xFF80);
		}
	}
}
