import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bha", name = "E", descriptor = "J")
	public static long aLong33;

	@OriginalMember(owner = "client!bha", name = "F", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!bha", name = "u", descriptor = "[I")
	public static int[] anIntArray55 = new int[1];

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(III[BIB[BII)V")
	public static void method807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg6++;
				arg3[local26] += arg5[arg2++];
				@Pc(38) int local38 = arg6++;
				arg3[local38] += arg5[arg2++];
				@Pc(50) int local50 = arg6++;
				arg3[local50] += arg5[arg2++];
				@Pc(62) int local62 = arg6++;
				arg3[local62] += arg5[arg2++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg6++;
				arg3[local26] += arg5[arg2++];
			}
			arg2 += arg4;
			arg6 += arg7;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method810(@OriginalArg(1) String arg0) {
		@Pc(6) Class3_Sub37 local6 = Static272.method4014();
		local6.aClass3_Sub4_Sub1_2.method7948(Static675.aClass179_12.anInt4730);
		local6.aClass3_Sub4_Sub1_2.method7956(0);
		@Pc(21) int local21 = local6.aClass3_Sub4_Sub1_2.anInt9739;
		local6.aClass3_Sub4_Sub1_2.method7956(645);
		@Pc(30) int[] local30 = Static405.method5596(local6);
		@Pc(39) int local39 = local6.aClass3_Sub4_Sub1_2.anInt9739;
		local6.aClass3_Sub4_Sub1_2.method7901(arg0);
		local6.aClass3_Sub4_Sub1_2.method7948(Static654.anInt10668);
		local6.aClass3_Sub4_Sub1_2.anInt9739 += 7;
		local6.aClass3_Sub4_Sub1_2.method7940(local6.aClass3_Sub4_Sub1_2.anInt9739, local30, local39);
		local6.aClass3_Sub4_Sub1_2.method7923(local6.aClass3_Sub4_Sub1_2.anInt9739 - local21);
		Static301.method2678(local6);
		Static492.anInt838 = 0;
		Static290.anInt4896 = -3;
		Static613.anInt10200 = 1;
		Static288.anInt4858 = 0;
	}
}
