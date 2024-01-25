import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!gja", name = "fd", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!gja", name = "gd", descriptor = "I")
	public static int anInt4161;

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!ms;)V")
	public static void method3436(@OriginalArg(0) Class246 arg0) {
		if (Static254.anInt4739 >= 65535) {
			return;
		}
		@Pc(7) Class3_Sub16 local7 = arg0.aClass3_Sub16_3;
		Static458.aClass246Array1[Static254.anInt4739] = arg0;
		Static432.aBooleanArray18[Static254.anInt4739] = false;
		Static254.anInt4739++;
		@Pc(22) int local22 = arg0.anInt7230;
		if (arg0.aBoolean565) {
			local22 = 0;
		}
		@Pc(30) int local30 = arg0.anInt7230;
		if (arg0.aBoolean566) {
			local30 = Static241.anInt4521 - 1;
		}
		for (@Pc(39) int local39 = local22; local39 <= local30; local39++) {
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = local7.method6320() + Static198.anInt3490 - local7.method6324() >> Static394.anInt7067;
			if (local54 < 0) {
				local42 = -local54;
				local54 = 0;
			}
			@Pc(74) int local74 = local7.method6320() + local7.method6324() - Static198.anInt3490 >> Static394.anInt7067;
			if (local74 >= Static164.anInt3059) {
				local74 = Static164.anInt3059 - 1;
			}
			for (@Pc(83) int local83 = local54; local83 <= local74; local83++) {
				@Pc(90) short local90 = arg0.aShortArray123[local42++];
				@Pc(106) int local106 = (local7.method6323() + Static198.anInt3490 - local7.method6324() >> Static394.anInt7067) + (local90 >>> 8);
				@Pc(114) int local114 = local106 + (local90 & 0xFF) - 1;
				if (local106 < 0) {
					local106 = 0;
				}
				if (local114 >= Static509.anInt8656) {
					local114 = Static509.anInt8656 - 1;
				}
				for (@Pc(127) int local127 = local106; local127 <= local114; local127++) {
					@Pc(136) long local136 = Static353.aLongArrayArrayArray1[local39][local127][local83];
					if ((local136 & 0xFFFFL) == 0L) {
						Static353.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static254.anInt4739;
					} else if ((local136 & 0xFFFF0000L) == 0L) {
						Static353.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static254.anInt4739 << 16;
					} else if ((local136 & 0xFFFF00000000L) == 0L) {
						Static353.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static254.anInt4739 << 32;
					} else if ((local136 & 0xFFFF000000000000L) == 0L) {
						Static353.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static254.anInt4739 << 48;
					}
				}
			}
		}
	}
}
