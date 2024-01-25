import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
	public static int anInt6322;

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "[Lclient!of;")
	public static Class40[] aClass40Array44;

	@OriginalMember(owner = "client!wo", name = "A", descriptor = "[B")
	public static byte[] aByteArray97;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIZI)V")
	public static void method5767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= Static311.anInt5837 && arg4 <= Static265.anInt4933 && arg5 >= Static327.anInt3039 && arg1 <= Static230.anInt4308) {
			if (arg3 == 1) {
				Static201.method3645(arg1, arg4, arg0, arg2, arg5);
			} else {
				Static306.method5247(arg4, arg5, arg1, arg2, arg3, arg0);
			}
		} else if (arg3 == 1) {
			Static196.method3621(arg5, arg0, arg4, arg2, arg1);
		} else {
			Static163.method3245(arg2, arg0, arg1, arg3, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZLclient!dp;)I")
	public static int method5770(@OriginalArg(1) Class53 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1026(Static196.anInt3680)) {
			local5++;
		}
		if (arg0.method1026(Static142.anInt2558)) {
			local5++;
		}
		if (arg0.method1026(Static127.anInt4327)) {
			local5++;
		}
		if (arg0.method1026(Static211.anInt3848)) {
			local5++;
		}
		if (arg0.method1026(Static295.anInt5560)) {
			local5++;
		}
		if (arg0.method1026(Static175.anInt3296)) {
			local5++;
		}
		if (arg0.method1026(Static66.anInt1232)) {
			local5++;
		}
		if (arg0.method1026(Static298.anInt5635)) {
			local5++;
		}
		if (arg0.method1026(Static289.anInt5436)) {
			local5++;
		}
		if (arg0.method1026(Static306.anInt5793)) {
			local5++;
		}
		if (arg0.method1026(Static52.anInt1005)) {
			local5++;
		}
		if (arg0.method1026(Static18.anInt312)) {
			local5++;
		}
		if (arg0.method1026(Static276.anInt5208)) {
			local5++;
		}
		if (arg0.method1026(Static292.anInt5493)) {
			local5++;
		}
		if (arg0.method1026(Static180.anInt3824)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!vj;ILclient!ec;B)V")
	public static void method5771(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub10 arg2) {
		@Pc(16) Class6_Sub7 local16 = new Class6_Sub7();
		local16.anInt967 = arg2.method3972();
		local16.anInt965 = arg2.method3979();
		local16.anIntArray104 = new int[local16.anInt967];
		local16.anIntArray105 = new int[local16.anInt967];
		local16.aByteArrayArrayArray3 = new byte[local16.anInt967][][];
		local16.aClass196Array2 = new Class196[local16.anInt967];
		local16.aClass196Array1 = new Class196[local16.anInt967];
		local16.anIntArray106 = new int[local16.anInt967];
		for (@Pc(58) int local58 = 0; local58 < local16.anInt967; local58++) {
			try {
				@Pc(64) int local64 = arg2.method3972();
				@Pc(91) String local91;
				@Pc(95) String local95;
				@Pc(99) int local99;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local91 = arg2.method4023();
					local95 = arg2.method4023();
					local99 = 0;
					if (local64 == 1) {
						local99 = arg2.method3979();
					}
					local16.anIntArray106[local58] = local64;
					local16.anIntArray104[local58] = local99;
					local16.aClass196Array1[local58] = arg0.method5520(local95, Static172.method3362(local91));
				} else if (local64 == 3 || local64 == 4) {
					local91 = arg2.method4023();
					local95 = arg2.method4023();
					local99 = arg2.method3972();
					@Pc(102) String[] local102 = new String[local99];
					for (@Pc(104) int local104 = 0; local104 < local99; local104++) {
						local102[local104] = arg2.method4023();
					}
					@Pc(119) byte[][] local119 = new byte[local99][];
					@Pc(130) int local130;
					if (local64 == 3) {
						for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
							local130 = arg2.method3979();
							local119[local124] = new byte[local130];
							arg2.method3986(local130, local119[local124]);
						}
					}
					local16.anIntArray106[local58] = local64;
					@Pc(159) Class[] local159 = new Class[local99];
					for (local130 = 0; local130 < local99; local130++) {
						local159[local130] = Static172.method3362(local102[local130]);
					}
					local16.aClass196Array2[local58] = arg0.method5529(local95, Static172.method3362(local91), local159);
					local16.aByteArrayArrayArray3[local58] = local119;
				}
			} catch (@Pc(236) ClassNotFoundException local236) {
				local16.anIntArray105[local58] = -1;
			} catch (@Pc(243) SecurityException local243) {
				local16.anIntArray105[local58] = -2;
			} catch (@Pc(250) NullPointerException local250) {
				local16.anIntArray105[local58] = -3;
			} catch (@Pc(257) Exception local257) {
				local16.anIntArray105[local58] = -4;
			} catch (@Pc(264) Throwable local264) {
				local16.anIntArray105[local58] = -5;
			}
		}
		Static260.aClass211_29.method5585(local16);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!mb;)Z")
	public static boolean method5772(@OriginalArg(1) Class132 arg0) {
		if (arg0.anInt3539 == 205) {
			Static124.anInt2286 = 250;
			return true;
		} else {
			return false;
		}
	}
}
