import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!la", name = "w", descriptor = "I")
	public static int anInt5445 = 100;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "I")
	public static int anInt5446 = -1;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILclient!pba;Lclient!pba;)V")
	public static void method4899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub1_Sub2 arg3, @OriginalArg(4) Class4_Sub1_Sub2 arg4) {
		@Pc(4) Class128 local4 = Static362.method8360(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub1_Sub2_2 = arg3;
		local4.aClass4_Sub1_Sub2_1 = arg4;
		@Pc(22) int local22 = Static177.aClass84Array2 == Static77.aClass84Array1 ? 1 : 0;
		if (!arg3.method8356()) {
			arg3.aClass4_Sub1_23 = Static321.aClass4_Sub1Array5[local22];
			Static321.aClass4_Sub1Array5[local22] = arg3;
		} else if (arg3.method8344()) {
			arg3.aClass4_Sub1_23 = Static194.aClass4_Sub1Array13[local22];
			Static194.aClass4_Sub1Array13[local22] = arg3;
		} else {
			arg3.aClass4_Sub1_23 = Static623.aClass4_Sub1Array11[local22];
			Static623.aClass4_Sub1Array11[local22] = arg3;
			Static597.aBoolean675 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8356()) {
			if (arg4.method8344()) {
				arg4.aClass4_Sub1_23 = Static194.aClass4_Sub1Array13[local22];
				Static194.aClass4_Sub1Array13[local22] = arg4;
				return;
			}
			arg4.aClass4_Sub1_23 = Static623.aClass4_Sub1Array11[local22];
			Static623.aClass4_Sub1Array11[local22] = arg4;
			Static597.aBoolean675 = true;
			return;
		}
		arg4.aClass4_Sub1_23 = Static321.aClass4_Sub1Array5[local22];
		Static321.aClass4_Sub1Array5[local22] = arg4;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBII)V")
	public static void method4900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(21) int local21 = -1;
		Static161.method2977(arg3 - arg2, arg0, arg3 + arg2, Static120.anIntArrayArray18[arg1], -123);
		while (local9 > local7) {
			local21 += 2;
			local12 += local21;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(57) int[] local57 = Static120.anIntArrayArray18[local9 + arg1];
				@Pc(64) int[] local64 = Static120.anIntArrayArray18[arg1 - local9];
				@Pc(68) int local68 = local7 + arg3;
				@Pc(73) int local73 = arg3 - local7;
				Static161.method2977(local73, arg0, local68, local57, -106);
				Static161.method2977(local73, arg0, local68, local64, -112);
			}
			@Pc(90) int local90 = arg3 + local9;
			@Pc(94) int local94 = arg3 - local9;
			@Pc(100) int[] local100 = Static120.anIntArrayArray18[arg1 + local7];
			@Pc(106) int[] local106 = Static120.anIntArrayArray18[arg1 - local7];
			Static161.method2977(local94, arg0, local90, local100, -114);
			Static161.method2977(local94, arg0, local90, local106, -122);
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[B")
	public static byte[] method4901(@OriginalArg(1) int arg0) {
		@Pc(19) Class5_Sub1_Sub8 local19 = (Class5_Sub1_Sub8) Static216.aClass370_3.method8484((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(47) int local47 = 0; local47 < 255; local47++) {
				@Pc(55) int local55 = 255 - local47;
				@Pc(62) int local62 = Static131.method1936(local30, local55);
				@Pc(66) byte local66 = local24[local62];
				local24[local62] = local24[local55];
				local24[local55] = local24[511 - local47] = local66;
			}
			local19 = new Class5_Sub1_Sub8(local24);
			Static216.aClass370_3.method8485(local19, (long) arg0);
		}
		return local19.aByteArray37;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIZII)V")
	public static void method4903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static230.anInt3962 <= arg3 && arg2 <= Static463.anInt7530 && arg4 >= Static573.anInt8986 && anInt5445 >= arg1) {
			Static556.method7521(arg3, arg0, arg4, arg1, arg2);
		} else {
			Static129.method1923(arg2, arg3, arg0, arg4, arg1);
		}
	}
}
