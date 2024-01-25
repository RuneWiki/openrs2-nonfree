import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "F")
	public static float aFloat163;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
	public static int anInt8819;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "Lclient!el;")
	public static final Class109 aClass109_186 = new Class109(105, 0);

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "Lclient!to;")
	public static final Class333 aClass333_6 = new Class333("stellardawn", "Stellar Dawn", 1);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BFFIFI[BIFILclient!jf;IF)V")
	public static void method7547(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(8) float arg4, @OriginalArg(10) Class186 arg5, @OriginalArg(11) int arg6, @OriginalArg(12) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static572.method5297(arg0, arg4, local7, arg1, arg5, arg7, arg3, arg6, arg2);
			arg6 += 16384;
		}
		if (-113 <= -127) {
			anInt8819 = 78;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)[Lclient!vaa;")
	public static Class361[] method7548() {
		return new Class361[] { Static622.aClass361_18, Static536.aClass361_17, Static40.aClass361_4, Static335.aClass361_14, Static71.aClass361_6, Static16.aClass361_1, Static93.aClass361_19, Static534.aClass361_3, Static53.aClass361_5, Static237.aClass361_9 };
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIZII)V")
	public static void method7549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(26) int local26 = arg3 - 334;
		if (local26 < 0) {
			local26 = 0;
		} else if (local26 > 100) {
			local26 = 100;
		}
		@Pc(50) int local50 = (Static95.aShort14 - Static377.aShort81) * local26 / 100 + Static377.aShort81;
		if (local50 < Static186.aShort36) {
			local50 = Static186.aShort36;
		} else if (Static389.aShort82 < local50) {
			local50 = Static389.aShort82;
		}
		@Pc(82) int local82 = arg3 * local50 * 512 / (arg0 * 334);
		@Pc(129) int local129;
		@Pc(136) int local136;
		@Pc(100) short local100;
		if (Static545.aShort100 > local82) {
			local100 = Static545.aShort100;
			local50 = arg0 * local100 * 334 / (arg3 * 512);
			if (Static389.aShort82 < local50) {
				local50 = Static389.aShort82;
				local129 = arg3 * 512 * local50 / (local100 * 334);
				local136 = (arg0 - local129) / 2;
				if (arg2) {
					Static457.aClass57_11.la();
					Static457.aClass57_11.method7731(-16777216, arg4, arg3, local136, arg1);
					Static457.aClass57_11.method7731(-16777216, arg0 + arg4 - local136, arg3, local136, arg1);
				}
				arg4 += local136;
				arg0 -= local136 * 2;
			}
		} else if (Static264.aShort56 < local82) {
			local100 = Static264.aShort56;
			local50 = arg0 * 334 * local100 / (arg3 * 512);
			if (local50 < Static186.aShort36) {
				local50 = Static186.aShort36;
				local129 = local100 * arg0 * 334 / (local50 * 512);
				local136 = (arg3 - local129) / 2;
				if (arg2) {
					Static457.aClass57_11.la();
					Static457.aClass57_11.method7731(-16777216, arg4, local136, arg0, arg1);
					Static457.aClass57_11.method7731(-16777216, arg4, local136, arg0, arg1 + arg3 - local136);
				}
				arg1 += local136;
				arg3 -= local136 * 2;
			}
		}
		Static443.anInt7613 = arg1;
		Static234.anInt3903 = (short) arg0;
		Static212.anInt3463 = (short) arg3;
		Static382.anInt9819 = local50 * arg3 / 334;
		Static69.anInt1123 = arg4;
	}
}
