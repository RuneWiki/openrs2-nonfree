import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
	public static int anInt906;

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array5;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "Lclient!al;")
	public static final Class11 aClass11_20 = new Class11(30);

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
	public static int anInt907 = 0;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString36 = "Loading fonts - ";

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
	public static int anInt911 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(32) int local32 = Static76.aShort29 + (Static164.aShort50 - Static76.aShort29) * local7 / 100;
		@Pc(38) int local38 = local32 * arg0 >> 8;
		@Pc(45) int local45 = 16384 - arg1 & 0x3FFF;
		@Pc(52) int local52 = 16384 - arg6 & 0x3FFF;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = local38;
		if (local45 != 0) {
			local56 = Class14_Sub3_Sub34.anIntArray547[local45] * -local38 >> 15;
			local58 = local38 * Class14_Sub3_Sub34.anIntArray546[local45] >> 15;
		}
		if (local52 != 0) {
			local54 = Class14_Sub3_Sub34.anIntArray547[local52] * local58 >> 15;
			local58 = local58 * Class14_Sub3_Sub34.anIntArray546[local52] >> 15;
		}
		Static103.anInt2301 = arg2 - local56;
		Static124.anInt2717 = arg5 - local54;
		Static141.anInt2986 = arg3 - local58;
		Static112.anInt2486 = arg1;
		Static249.anInt4824 = arg6;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
	public static String method915(@OriginalArg(1) int[] arg0) {
		@Pc(21) StringBuffer local21 = new StringBuffer();
		@Pc(23) int local23 = Static294.anInt5658;
		for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
			@Pc(33) Class141 local33 = Static348.method4760(arg0[local25]);
			if (local33.anInt4026 != -1) {
				@Pc(46) Class2 local46 = (Class2) Static234.aClass11_98.method209((long) local33.anInt4026);
				if (local46 == null) {
					@Pc(54) Class207 local54 = Static368.method5811(Static348.aClass143_98, local33.anInt4026, 0);
					if (local54 != null) {
						local46 = Static218.aClass46_5.method5157(local54);
						Static234.aClass11_98.method219((long) local33.anInt4026, local46);
					}
				}
				if (local46 != null) {
					Static235.aClass2Array14[local23] = local46;
					local21.append(" <img=").append(local23).append(">");
					local23++;
				}
			}
		}
		return local21.toString();
	}
}
