import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
	public static int anInt384;

	@OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
	public static int anInt387;

	@OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
	public static int anInt394;

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "Lclient!c;")
	public static Class17 aClass17_2 = new Class17();

	@OriginalMember(owner = "client!ba", name = "S", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[250][];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BII[Lclient!ao;ZIIIII)V")
	public static void method306(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12[] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) Class4_Sub24 local6 = new Class4_Sub24(arg1);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local6.method3093();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local6.method3060();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(50) int local50 = local33 & 0x3F;
				@Pc(56) int local56 = local33 >> 6 & 0x3F;
				@Pc(62) int local62 = local6.method3110();
				@Pc(66) int local66 = local33 >> 12;
				@Pc(70) int local70 = local62 >> 2;
				@Pc(74) int local74 = local62 & 0x3;
				if (arg7 == local66 && local56 >= arg8 && arg8 + 8 > local56 && arg5 <= local50 && local50 < arg5 + 8) {
					@Pc(114) Class73 local114 = Static296.method4591(local16);
					@Pc(131) int local131 = Static82.method1403(local114.anInt2253, local114.anInt2259, arg6, local50 & 0x7, local74, local56 & 0x7) + arg0;
					@Pc(148) int local148 = Static273.method4324(local114.anInt2259, local114.anInt2253, arg6, local50 & 0x7, local74, local56 & 0x7) + arg2;
					if (local131 > 0 && local148 > 0 && local131 < 103 && local148 < 103) {
						@Pc(160) Class12 local160 = null;
						if (!arg4) {
							@Pc(165) int local165 = arg9;
							if ((Static27.aByteArrayArrayArray2[1][local131][local148] & 0x2) == 2) {
								local165 = arg9 - 1;
							}
							if (local165 >= 0) {
								local160 = arg3[local165];
							}
						}
						Static108.method1834(!arg4, arg9, arg6 + local74 & 0x3, local160, arg4, local16, arg9, local70, local148, local131);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIIILclient!gk;I)Lclient!gk;")
	public static Class13_Sub1 method308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class13_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg0;
		@Pc(14) Class13_Sub1 local14 = (Class13_Sub1) Static46.aClass172_8.method4347(local8);
		if (local14 == null) {
			@Pc(22) Class13_Sub7 local22 = Static271.method4293(Static80.aClass22_31, arg0);
			if (local22 == null) {
				return null;
			}
			local14 = local22.method4270(64, 768, -50, -10, -50);
			Static46.aClass172_8.method4345(local14, local8);
		}
		@Pc(43) int local43 = arg4.method2741();
		@Pc(46) int local46 = arg4.method2737();
		@Pc(49) int local49 = arg4.method2755();
		@Pc(52) int local52 = arg4.method2742();
		local14 = local14.method2729(true, true, true);
		if (arg2 != 0) {
			local14.method2735(arg2);
		}
		@Pc(100) int local100;
		if (Static251.aBoolean330) {
			@Pc(69) Class13_Sub1_Sub2 local69 = (Class13_Sub1_Sub2) local14;
			if (Static58.method2504(arg5 + local49, local43 + arg1, Static222.anInt4467) != arg3 || arg3 != Static58.method2504(local52 + arg5, arg1 - -local46, Static222.anInt4467)) {
				for (local100 = 0; local100 < local69.anInt3451; local100++) {
					local69.anIntArray286[local100] += Static58.method2504(local69.anIntArray290[local100] + arg5, arg1 + local69.anIntArray289[local100], Static222.anInt4467) - arg3;
				}
				local69.aClass110_3.aBoolean220 = false;
				local69.aClass157_1.aBoolean334 = false;
			}
		} else {
			@Pc(145) Class13_Sub1_Sub1 local145 = (Class13_Sub1_Sub1) local14;
			if (Static58.method2504(arg5 + local49, arg1 - -local43, Static222.anInt4467) != arg3 || Static58.method2504(arg5 + local52, local46 + arg1, Static222.anInt4467) != arg3) {
				for (local100 = 0; local100 < local145.anInt422; local100++) {
					local145.anIntArray22[local100] += Static58.method2504(local145.anIntArray20[local100] + arg5, local145.anIntArray15[local100] - -arg1, Static222.anInt4467) - arg3;
				}
				local145.aBoolean29 = false;
			}
		}
		return local14;
	}
}
