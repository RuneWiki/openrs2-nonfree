import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Lclient!jd;")
	public static Class84 aClass84_129;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray36;

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "Lclient!jd;")
	public static Class84 aClass84_130;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!jd;ILclient!jd;Lclient!jd;)V")
	public static void method4821(@OriginalArg(0) Class84 arg0, @OriginalArg(2) Class84 arg1, @OriginalArg(3) Class84 arg2) {
		Static10.aClass84_6 = arg0;
		Static95.aClass84_40 = arg1;
		Static184.aClass84_77 = arg2;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(III)V")
	public static void method4822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static274.anInt5705 > 0) {
			Static15.method320(Static274.anInt5705);
			Static274.anInt5705 = 0;
		}
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(28) int local28 = Static160.anInt3390 * arg1;
		for (@Pc(30) int local30 = 1; local30 < 255; local30++) {
			@Pc(50) int local50 = (256 - local30) * Static154.anIntArray233[local30] / 256;
			if (local50 < 0) {
				local50 = 0;
			}
			local24 += local50;
			@Pc(62) int local62;
			for (local62 = local50; local62 < 128; local62++) {
				@Pc(70) int local70 = Static22.anIntArray20[local24++];
				@Pc(77) int local77 = Static160.anIntArray254[arg0 + local28++];
				if (local70 == 0) {
					Static212.aClass2_Sub3_Sub1_Sub1_5.anIntArray479[local22++] = local77;
				} else {
					@Pc(86) int local86 = local70 + 18;
					if (local86 > 255) {
						local86 = 255;
					}
					@Pc(98) int local98 = 256 - local70 - 18;
					if (local98 > 255) {
						local98 = 255;
					}
					local70 = Static163.anIntArray259[local70];
					Static212.aClass2_Sub3_Sub1_Sub1_5.anIntArray479[local22++] = ((local70 & 0xFF00FF) * local86 + (local77 & 0xFF00FF) * local98 & 0xFF00FF00) + ((local70 & 0xFF00) * local86 + ((local77 & 0xFF00) * local98) & 0xFF0000) >> 8;
				}
			}
			for (local62 = 0; local62 < local50; local62++) {
				Static212.aClass2_Sub3_Sub1_Sub1_5.anIntArray479[local22++] = Static160.anIntArray254[arg0 + local28++];
			}
			local28 += Static160.anInt3390 - 128;
		}
		if (Static60.aBoolean106) {
			Static94.method1751(Static212.aClass2_Sub3_Sub1_Sub1_5.anIntArray479, arg0, arg1, Static212.aClass2_Sub3_Sub1_Sub1_5.anInt5453, Static212.aClass2_Sub3_Sub1_Sub1_5.anInt5462);
		} else {
			Static212.aClass2_Sub3_Sub1_Sub1_5.method4369(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)I")
	public static int method4823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method4825(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < Static11.anInt296; local17++) {
			if (arg0.equalsIgnoreCase(Static105.aStringArray8[local17])) {
				return true;
			}
		}
		return false;
	}
}
