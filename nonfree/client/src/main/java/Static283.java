import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
	public static int[] anIntArray542;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	public static int anInt7446;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!tba;")
	public static Class329 aClass329_7;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	public static final int anInt7445 = 328;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "[Lclient!kda;")
	public static final Class186[] aClass186Array4 = new Class186[4];

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[128][128];

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[128][128];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!hg;ZIILclient!hg;IIIII)V")
	public static void method6300(@OriginalArg(0) Class13_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13_Sub1_Sub1_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0.method3962();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class61 local20 = (Class61) Static84.aClass32_14.method630((long) local7);
		if (local20 == null) {
			@Pc(27) Class329[] local27 = Static655.method7413(Static79.aClass380_22, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static192.aClass95_4.method6980(local27[0], true);
			Static84.aClass32_14.method629(local20, (long) local7);
		}
		Static5.method102(arg3.method3950() * 256, 0, arg3.aByte127, arg3.anInt10089, arg2 >> 1, arg3.anInt10090, arg5 >> 1);
		@Pc(73) int local73 = Static526.anIntArray588[0] + arg4 - 18;
		@Pc(81) int local81 = local73 + arg1 / 4 * 18;
		@Pc(91) int local91 = arg6 + Static526.anIntArray588[1] - 54 - 16;
		@Pc(99) int local99 = local91 + arg1 % 4 * 18;
		local20.method6431(local81, local99);
		if (arg3 == arg0) {
			Static192.aClass95_4.method6989(local81 - 1, -256, 18, local99 - 1, 18);
		}
		Static170.method7976(local81 + 18, local99 + 18, local81 - 1, local99 + -1);
		@Pc(135) Class13_Sub4 local135 = Static396.method5406();
		local135.aClass13_Sub1_Sub1_Sub1_1 = arg0;
		local135.anInt2842 = local99;
		local135.anInt2841 = local81 + 16;
		local135.anInt2840 = local99 + 16;
		local135.anInt2839 = local81;
		Static592.aClass171_10.method3746(local135);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6304(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static395.aStringArray33.length; local12++) {
			if (Static395.aStringArray33[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBZZ)V")
	public static void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static433.method5969(arg2, 0, arg3, Static1.aClass89_Sub1Array6.length - 1, arg1, arg0);
		Static262.aClass2_Sub32_5 = null;
		Static606.anInt9764 = 0;
	}
}
