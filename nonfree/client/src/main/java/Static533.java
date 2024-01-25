import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!su", name = "b", descriptor = "I")
	public static int anInt8753;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "Lclient!cw;")
	public static Class61 aClass61_29;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)Lclient!ei;")
	public static Class89_Sub1 method7366() {
		return Static578.anInt9400 < Static1.aClass89_Sub1Array6.length ? Static1.aClass89_Sub1Array6[Static578.anInt9400++] : null;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIBIIII)V")
	public static void method7367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(28) int local28 = Static8.aShort2 + (Static57.aShort18 - Static8.aShort2) * local7 / 100;
		Static638.anInt7982 = Static638.anInt7981 * local28 >> 8;
		@Pc(40) int local40 = arg6 * local28 >> 8;
		@Pc(46) int local46 = 16384 - arg2 & 0x3FFF;
		@Pc(52) int local52 = 16384 - arg1 & 0x3FFF;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = local40;
		if (local46 != 0) {
			local56 = Canvas_Sub1.anIntArray497[local46] * -local40 >> 14;
			local58 = local40 * Canvas_Sub1.anIntArray498[local46] >> 14;
		}
		if (local52 != 0) {
			local54 = Canvas_Sub1.anIntArray497[local52] * local58 >> 14;
			local58 = local58 * Canvas_Sub1.anIntArray498[local52] >> 14;
		}
		Static250.anInt4000 = arg3 - local54;
		Static161.anInt2901 = 0;
		Static220.anInt3605 = arg4 - local56;
		Static338.anInt5355 = arg1;
		Static440.anInt7072 = arg2;
		Static644.anInt10376 = arg0 - local58;
	}
}
