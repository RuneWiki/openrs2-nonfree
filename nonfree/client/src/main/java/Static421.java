import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
	public static int anInt7325;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	public static int anInt7327;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
	public static int anInt7329 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public static void method6576(@OriginalArg(1) int arg0) {
		Static348.anIntArray622 = new int[arg0];
		Static204.anIntArray322 = new int[arg0];
		Static279.anIntArray261 = new int[arg0];
		Static265.anIntArray281 = new int[arg0];
		Static220.anIntArray340 = new int[arg0];
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([III[II)V")
	public static void method6577(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) int local20 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg1; local55 < arg3; local55++) {
			if (arg0[local55] < local20 + (local53 & local55)) {
				@Pc(74) int local74 = arg0[local55];
				arg0[local55] = arg0[local16];
				arg0[local16] = local74;
				@Pc(88) int local88 = arg2[local55];
				arg2[local55] = arg2[local16];
				arg2[local16++] = local88;
			}
		}
		arg0[arg3] = arg0[local16];
		arg0[local16] = local20;
		arg2[arg3] = arg2[local16];
		arg2[local16] = local34;
		method6577(arg0, arg1, arg2, local16 - 1);
		method6577(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILclient!kj;)V")
	public static void method6579(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17_Sub2 arg1) {
		Static28.anInt772 = 0;
		Static222.aBoolean339 = false;
		Static180.method3528(arg1);
		Static325.method5581(arg1);
		if (Static222.aBoolean339) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt4872 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt4872 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Z")
	public static boolean method6580(@OriginalArg(0) int arg0) {
		return arg0 == 20 || arg0 == 48 || arg0 == 1009 || arg0 == 47 || arg0 == 30;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)I")
	public static int method6581() {
		return Static431.anInt7490;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIILclient!qa;I)Lclient!r;")
	public static Class97 method6582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg5;
		@Pc(12) Class97 local12 = (Class97) Static227.aClass277_35.method7014(local6);
		if (local12 == null) {
			@Pc(22) Class81 local22 = Static274.method4851(arg5, Static408.aClass69_78);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt2236 < 13) {
				local22.method2155();
			}
			local12 = arg4.method7192(local22, 2055, Static304.anInt5904, 64, 768);
			Static227.aClass277_35.method7016(local12, local6);
		}
		local12 = local12.method6770((byte) 2, 2055, true);
		if (arg0 != 0) {
			local12.OA(arg0);
		}
		if (arg2 != 0) {
			local12.D(arg2);
		}
		if (arg3 != 0) {
			local12.b(arg3);
		}
		if (arg1 != 0) {
			local12.ca(0, arg1, 0);
		}
		return local12;
	}
}
