import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
	public static int anInt9851;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Lclient!kga;")
	public static Class197 aClass197_5;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Lclient!of;")
	public static Class2_Sub26_Sub3 aClass2_Sub26_Sub3_8;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "Z")
	public static boolean aBoolean723 = false;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI[BLjava/lang/String;)I")
	public static int method8629(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10 += 4) {
			@Pc(17) int local17 = Static271.method4637(arg2.charAt(local10));
			@Pc(36) int local36 = local8 <= local10 + 1 ? -1 : Static271.method4637(arg2.charAt(local10 + 1));
			@Pc(55) int local55 = local10 + 2 >= local8 ? -1 : Static271.method4637(arg2.charAt(local10 + 2));
			@Pc(70) int local70 = local10 + 3 < local8 ? Static271.method4637(arg2.charAt(local10 + 3)) : -1;
			arg1[arg0++] = (byte) (local36 >>> 4 | local17 << 2);
			if (local55 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local36 & 0xF) << 4 | local55 >>> 2);
			if (local70 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local55 & 0x3) << 6 | local70);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILclient!mb;Lclient!mb;)V")
	public static void method8642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub3_Sub1 arg3, @OriginalArg(4) Class15_Sub3_Sub1 arg4) {
		@Pc(4) Class291 local4 = Static654.method9606(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass15_Sub3_Sub1_1 = arg3;
		local4.aClass15_Sub3_Sub1_2 = arg4;
		@Pc(19) int local19 = Static245.aClass18Array14 == Static93.aClass18Array33 ? 1 : 0;
		if (!arg3.method9425()) {
			arg3.aClass15_Sub3_23 = Static98.aClass15_Sub3Array2[local19];
			Static98.aClass15_Sub3Array2[local19] = arg3;
		} else if (arg3.method9434()) {
			arg3.aClass15_Sub3_23 = Static440.aClass15_Sub3Array4[local19];
			Static440.aClass15_Sub3Array4[local19] = arg3;
		} else {
			arg3.aClass15_Sub3_23 = Static603.aClass15_Sub3Array5[local19];
			Static603.aClass15_Sub3Array5[local19] = arg3;
			Static207.aBoolean327 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9425()) {
			if (arg4.method9434()) {
				arg4.aClass15_Sub3_23 = Static440.aClass15_Sub3Array4[local19];
				Static440.aClass15_Sub3Array4[local19] = arg4;
				return;
			}
			arg4.aClass15_Sub3_23 = Static603.aClass15_Sub3Array5[local19];
			Static603.aClass15_Sub3Array5[local19] = arg4;
			Static207.aBoolean327 = true;
			return;
		}
		arg4.aClass15_Sub3_23 = Static98.aClass15_Sub3Array2[local19];
		Static98.aClass15_Sub3Array2[local19] = arg4;
	}
}
