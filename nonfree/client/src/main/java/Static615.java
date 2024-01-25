import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!up", name = "k", descriptor = "Lclient!bu;")
	public static Class45 aClass45_23;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "[I")
	public static final int[] anIntArray847 = new int[3];

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!aj;I)V")
	public static void method8692(@OriginalArg(0) Class15 arg0) {
		Static512.aClass15_129 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BI[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method8694(@OriginalArg(1) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(19) String local19 = arg1[arg2];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg0 + arg2;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg2; local34 < local30; local34++) {
				@Pc(40) String local40 = arg1[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local32);
			for (@Pc(66) int local66 = arg2; local66 < local30; local66++) {
				@Pc(72) String local72 = arg1[local66];
				if (local72 == null) {
					local64.append("null");
				} else {
					local64.append(local72);
				}
			}
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8695(@OriginalArg(0) Class13 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static82.aBoolean134) {
			local7 = Static31.method748();
			local9 = Static147.method2738();
		}
		Static584.method8242(Static436.anInt6913 + local9, Static368.anInt5940, Static627.anInt10020, Static600.anInt9624 + local7, arg0);
		Static303.aClass69_6.method8862(Static436.anInt6913 + local9 + 14, -1, Static601.aClass346_26.method8440(Static609.anInt9834), -10660793, local7 + Static600.anInt9624 + 3);
		@Pc(63) int local63 = Static22.aClass16_2.method5885() + local7;
		@Pc(73) int local73 = local9 + Static22.aClass16_2.method5887();
		@Pc(77) int local77;
		@Pc(95) int local95;
		if (Static439.aBoolean510) {
			local77 = 0;
			for (@Pc(82) Class3_Sub11_Sub8 local82 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1842(); local82 != null; local82 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1844()) {
				local95 = local77 * 16 + Static436.anInt6913 + local9 + 31;
				local77++;
				if (local82.anInt3796 == 1) {
					Static1.method5541(Static368.anInt5940, local95, local73, Static436.anInt6913 + local9, arg0, (Class3_Sub11_Sub14) local82.aClass74_4.aClass3_Sub11_16.aClass3_Sub11_67, local63, -256, local7 + Static600.anInt9624, -1, Static627.anInt10020);
				} else {
					Static323.method4164(local73, local9 + Static436.anInt6913, arg0, Static600.anInt9624 + local7, -256, -1, Static368.anInt5940, Static627.anInt10020, local63, local82, local95);
				}
			}
			if (Static142.aClass3_Sub11_Sub8_1 != null) {
				Static584.method8242(Static544.anInt8963, Static159.anInt3122, Static673.anInt10857, Static451.anInt7467, arg0);
				local77 = 0;
				Static303.aClass69_6.method8862(Static544.anInt8963 + 14, -1, Static142.aClass3_Sub11_Sub8_1.aString31, -10660793, Static451.anInt7467 + 3);
				for (@Pc(181) Class3_Sub11_Sub14 local181 = (Class3_Sub11_Sub14) Static142.aClass3_Sub11_Sub8_1.aClass74_4.method1842(); local181 != null; local181 = (Class3_Sub11_Sub14) Static142.aClass3_Sub11_Sub8_1.aClass74_4.method1844()) {
					@Pc(192) int local192 = Static544.anInt8963 + local77 * 16 + 31;
					local77++;
					Static1.method5541(Static159.anInt3122, local192, local73, Static544.anInt8963, arg0, local181, local63, -256, Static451.anInt7467, -1, Static673.anInt10857);
				}
				Static41.method1054(Static673.anInt10857, Static159.anInt3122, Static544.anInt8963, Static451.anInt7467);
			}
		} else {
			local77 = 0;
			for (@Pc(229) Class3_Sub11_Sub14 local229 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8177(); local229 != null; local229 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8168()) {
				local95 = local9 + Static436.anInt6913 + (Static450.anInt7444 + -1 + -local77) * 16 + 31;
				local77++;
				Static1.method5541(Static368.anInt5940, local95, local73, Static436.anInt6913 + local9, arg0, local229, local63, -256, Static600.anInt9624 + local7, -1, Static627.anInt10020);
			}
		}
		Static41.method1054(Static627.anInt10020, Static368.anInt5940, Static436.anInt6913 + local9, Static600.anInt9624 + local7);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZIILclient!kf;I)V")
	public static void method8698(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub34 arg2, @OriginalArg(4) int arg3) {
		arg2.aClass3_Sub25_Sub1_2.method8588(arg1);
		arg2.aClass3_Sub25_Sub1_2.method8597(arg0);
		arg2.aClass3_Sub25_Sub1_2.method8616(arg3);
	}
}
