import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_110 = new Class257(11, -1);

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)V")
	public static void method7929(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(14, arg0);
		local8.method3509();
		local8.anInt4321 = arg1;
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(III)Z")
	public static boolean method7931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIII)V")
	public static void method7932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class216 local13 = Static239.aClass216ArrayArray1[arg1][arg0];
		Static459.method6943(local13 == null ? Static605.aClass216_3 : local13, arg2);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZJ)V")
	public static void method7933(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static4.anInt24;
		@Pc(15) int local15;
		@Pc(23) int local23;
		if (Static427.anInt8006 != local7) {
			local15 = local7 - Static427.anInt8006;
			local23 = (int) (arg0 * (long) local15 / 320L);
			if (local15 <= 0) {
				if (local23 == 0) {
					local23 = -1;
				} else if (local15 > local23) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = 1;
			} else if (local23 > local15) {
				local23 = local15;
			}
			Static427.anInt8006 += local23;
		}
		@Pc(62) int local62 = Static93.anInt2585;
		Static499.aFloat185 += Static462.aFloat183 * (float) arg0 / 40.0F * 8.0F;
		if (local62 != Static572.anInt9826) {
			local15 = local62 - Static572.anInt9826;
			local23 = (int) ((long) local15 * arg0 / 320L);
			if (local15 > 0) {
				if (local23 == 0) {
					local23 = 1;
				} else if (local23 > local15) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = -1;
			} else if (local23 < local15) {
				local23 = local15;
			}
			Static572.anInt9826 += local23;
		}
		Static64.aFloat44 += (float) arg0 * Static146.aFloat76 / 40.0F * 8.0F;
		Static394.method6291();
	}
}
