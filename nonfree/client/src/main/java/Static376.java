import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_63 = new Class208(60, -1);

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "J")
	public static long aLong177 = -1L;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
	public static int anInt6901 = 0;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "[I")
	public static final int[] anIntArray421 = new int[6];

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILclient!ha;Lclient!nn;)V")
	public static void method5922(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) Class226 arg2) {
		@Pc(25) int local25;
		if (Static326.anIntArray369 != null && arg0 <= arg2.aByte80) {
			for (local25 = 0; local25 < Static326.anIntArray369.length; local25++) {
				if (Static326.anIntArray369[local25] != -1000000 && (arg2.anIntArray424[0] <= Static326.anIntArray369[local25] || Static326.anIntArray369[local25] >= arg2.anIntArray424[1] || arg2.anIntArray424[2] <= Static326.anIntArray369[local25] || arg2.anIntArray424[3] <= Static326.anIntArray369[local25]) && (Static373.anIntArray420[local25] >= arg2.anIntArray425[0] || Static373.anIntArray420[local25] >= arg2.anIntArray425[1] || arg2.anIntArray425[2] <= Static373.anIntArray420[local25] || Static373.anIntArray420[local25] >= arg2.anIntArray425[3]) && (Static295.anIntArray353[local25] <= arg2.anIntArray425[0] || Static295.anIntArray353[local25] <= arg2.anIntArray425[1] || Static295.anIntArray353[local25] <= arg2.anIntArray425[2] || arg2.anIntArray425[3] >= Static295.anIntArray353[local25]) && (Static7.anIntArray2[local25] >= arg2.anIntArray423[0] || Static7.anIntArray2[local25] >= arg2.anIntArray423[1] || arg2.anIntArray423[2] <= Static7.anIntArray2[local25] || arg2.anIntArray423[3] <= Static7.anIntArray2[local25]) && (Static380.anIntArray124[local25] <= arg2.anIntArray423[0] || Static380.anIntArray124[local25] <= arg2.anIntArray423[1] || Static380.anIntArray124[local25] <= arg2.anIntArray423[2] || Static380.anIntArray124[local25] <= arg2.anIntArray423[3])) {
					return;
				}
			}
		}
		@Pc(280) int local280;
		@Pc(304) int local304;
		@Pc(327) boolean local327;
		@Pc(355) float local355;
		if (arg2.aByte79 == 1) {
			local25 = Static197.anInt10372 + arg2.aShort77 - Static162.anInt3371;
			if (local25 >= 0 && Static197.anInt10372 + Static197.anInt10372 >= local25) {
				local280 = arg2.aShort79 + Static197.anInt10372 - Static313.anInt5975;
				if (local280 < 0) {
					local280 = 0;
				} else if (local280 > Static197.anInt10372 + Static197.anInt10372) {
					return;
				}
				local304 = arg2.aShort78 + Static197.anInt10372 - Static313.anInt5975;
				if (local304 > Static197.anInt10372 + Static197.anInt10372) {
					local304 = Static197.anInt10372 + Static197.anInt10372;
				} else if (local304 < 0) {
					return;
				}
				local327 = false;
				while (local280 <= local304) {
					if (Static460.aBooleanArrayArray6[local25][local280++]) {
						local327 = true;
						break;
					}
				}
				if (local327) {
					local355 = (float) (Static436.anInt7905 - arg2.anIntArray425[0]);
					if (local355 < 0.0F) {
						local355 *= -1.0F;
					}
					if (!(float) Static583.anInt9671 > local355 && (Static138.method2247(0, arg2) && (Static138.method2247(1, arg2) && (Static138.method2247(2, arg2) && Static138.method2247(3, arg2))))) {
						Static147.aClass226Array2[Static339.anInt9925++] = arg2;
					}
				}
			}
		} else if (arg2.aByte79 == 2) {
			local25 = arg2.aShort79 + Static197.anInt10372 - Static313.anInt5975;
			if (local25 >= 0 && local25 <= Static197.anInt10372 + Static197.anInt10372) {
				local280 = arg2.aShort77 + Static197.anInt10372 - Static162.anInt3371;
				if (local280 < 0) {
					local280 = 0;
				} else if (Static197.anInt10372 + Static197.anInt10372 < local280) {
					return;
				}
				local304 = arg2.aShort80 + Static197.anInt10372 - Static162.anInt3371;
				if (local304 > Static197.anInt10372 + Static197.anInt10372) {
					local304 = Static197.anInt10372 + Static197.anInt10372;
				} else if (local304 < 0) {
					return;
				}
				local327 = false;
				while (local280 <= local304) {
					if (Static460.aBooleanArrayArray6[local280++][local25]) {
						local327 = true;
						break;
					}
				}
				if (local327) {
					local355 = (float) (Static67.anInt1397 - arg2.anIntArray423[0]);
					if (local355 < 0.0F) {
						local355 *= -1.0F;
					}
					if (!((float) Static583.anInt9671 > local355) && (Static138.method2247(0, arg2) && (Static138.method2247(1, arg2) && (Static138.method2247(2, arg2) && Static138.method2247(3, arg2))))) {
						Static147.aClass226Array2[Static339.anInt9925++] = arg2;
					}
				}
			}
		} else if (arg2.aByte79 == 16 || arg2.aByte79 == 8) {
			local25 = Static197.anInt10372 + arg2.aShort77 - Static162.anInt3371;
			if (local25 >= 0 && Static197.anInt10372 + Static197.anInt10372 >= local25) {
				local280 = arg2.aShort79 + Static197.anInt10372 - Static313.anInt5975;
				if (local280 >= 0 && Static197.anInt10372 + Static197.anInt10372 >= local280 && Static460.aBooleanArrayArray6[local25][local280]) {
					@Pc(605) float local605 = (float) (Static436.anInt7905 - arg2.anIntArray425[0]);
					if (local605 < 0.0F) {
						local605 *= -1.0F;
					}
					@Pc(621) float local621 = (float) (Static67.anInt1397 - arg2.anIntArray423[0]);
					if (local621 < 0.0F) {
						local621 *= -1.0F;
					}
					if ((!(local605 < (float) Static583.anInt9671) || !((float) Static583.anInt9671 > local621)) && (Static138.method2247(0, arg2) && (Static138.method2247(1, arg2) && (Static138.method2247(2, arg2) && Static138.method2247(3, arg2))))) {
						Static147.aClass226Array2[Static339.anInt9925++] = arg2;
					}
				}
			}
		} else if (arg2.aByte79 == 4) {
			@Pc(688) float local688 = (float) (arg2.anIntArray424[0] - Static109.anInt8015);
			if (!(local688 <= (float) Static484.anInt8378)) {
				local280 = arg2.aShort79 + Static197.anInt10372 - Static313.anInt5975;
				if (local280 < 0) {
					local280 = 0;
				} else if (Static197.anInt10372 + Static197.anInt10372 < local280) {
					return;
				}
				local304 = arg2.aShort78 + Static197.anInt10372 - Static313.anInt5975;
				if (Static197.anInt10372 + Static197.anInt10372 < local304) {
					local304 = Static197.anInt10372 + Static197.anInt10372;
				} else if (local304 < 0) {
					return;
				}
				@Pc(749) int local749 = arg2.aShort77 + Static197.anInt10372 - Static162.anInt3371;
				if (local749 < 0) {
					local749 = 0;
				} else if (Static197.anInt10372 + Static197.anInt10372 < local749) {
					return;
				}
				@Pc(777) int local777 = Static197.anInt10372 + arg2.aShort80 - Static162.anInt3371;
				if (Static197.anInt10372 + Static197.anInt10372 < local777) {
					local777 = Static197.anInt10372 + Static197.anInt10372;
				} else if (local777 < 0) {
					return;
				}
				@Pc(796) boolean local796 = false;
				label283: for (@Pc(798) int local798 = local749; local798 <= local777; local798++) {
					for (@Pc(802) int local802 = local280; local802 <= local304; local802++) {
						if (Static460.aBooleanArrayArray6[local798][local802]) {
							local796 = true;
							break label283;
						}
					}
				}
				if (local796 && (Static138.method2247(0, arg2) && (Static138.method2247(1, arg2) && (Static138.method2247(2, arg2) && Static138.method2247(3, arg2))))) {
					Static147.aClass226Array2[Static339.anInt9925++] = arg2;
				}
			}
		}
	}
}
