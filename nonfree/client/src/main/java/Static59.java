import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "Lclient!fw;")
	public static Class1_Sub19_Sub2 aClass1_Sub19_Sub2_1;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "Z")
	public static boolean aBoolean86;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_8 = new Class179(45, 3);

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_9 = new Class134(64);

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
	public static int anInt1424 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public static void method1259() {
		Static259.anInt4646 = 0;
		Static113.aClass74Array1 = new Class74[50];
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ya;Lclient!kn;ILclient!ql;)V")
	public static void method1260(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class1_Sub26 arg1, @OriginalArg(3) Class202 arg2) {
		@Pc(10) Class143 local10 = arg2.method4654(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.la();
		if (local10.ma() > local16) {
			local16 = local10.ma();
		}
		@Pc(32) int local32 = arg1.anInt3923;
		@Pc(35) int local35 = arg1.anInt3921;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg2.aString52 != null) {
			local37 = Static51.aClass151_137.method3465(null, arg2.aString52, null, Static123.aStringArray18);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static123.aStringArray18[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static201.aClass271_6.method6007(local61);
				if (local82 > local39) {
					local39 = local82;
				}
			}
			local41 = Static201.aClass271_6.method6013() * local37 + Static201.aClass271_6.method6009() / 2;
		}
		local55 = arg1.anInt3923 + local16 / 2;
		@Pc(116) int local116 = arg1.anInt3921;
		if (local32 < Static168.anInt426 + local16) {
			local32 = Static168.anInt426;
			local55 = Static168.anInt426 + local16 / 2 + local39 / 2 + 10 + 5;
		} else if (local32 > Static168.anInt434 - local16) {
			local32 = Static168.anInt434 - local16;
			local55 = Static168.anInt434 - local16 / 2 - local39 / 2 - 10 - 5;
		}
		if (local16 + Static168.anInt436 > local35) {
			local116 = local16 / 2 + Static168.anInt436 + 10;
			local35 = Static168.anInt436;
		} else if (local35 > Static168.anInt427 - local16) {
			local35 = Static168.anInt427 - local16;
			local116 = Static168.anInt427 - local16 / 2 - local41 - 10;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg1.anInt3923), (double) (local35 - arg1.anInt3921)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5721((float) local16 / 2.0F + (float) local32, (float) local35 + (float) local16 / 2.0F, 4096, local82);
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		if (arg2.aString52 != null) {
			local261 = local116;
			local259 = local55 - local39 / 2 - 5;
			local265 = local116 + Static201.aClass271_6.method6013() * local37 + 3;
			local263 = local259 + local39 + 10;
			if (arg2.anInt5563 != 0) {
				arg0.method4563(local116, arg2.anInt5563, local263 - local259, local259, local265 - local116);
			}
			if (arg2.anInt5584 != 0) {
				arg0.method4499(arg2.anInt5584, local259, local263 - local259, local116, local265 - local116);
			}
			for (@Pc(342) int local342 = 0; local342 < local37; local342++) {
				@Pc(348) String local348 = Static123.aStringArray18[local342];
				if (local37 - 1 > local342) {
					local348 = local348.substring(0, local348.length() - 4);
				}
				Static201.aClass271_6.method6012(arg0, local348, local55, local116, arg2.anInt5565);
				local116 += Static201.aClass271_6.method6013();
			}
		}
		if (arg2.anInt5576 == -1 && arg2.aString52 == null) {
			return;
		}
		@Pc(391) Class1_Sub13 local391 = new Class1_Sub13(arg1);
		local16 >>= 0x1;
		local391.anInt1807 = local265;
		local391.anInt1805 = local35 + local16;
		local391.anInt1808 = local16 + local32;
		local391.anInt1806 = local263;
		local391.anInt1811 = local261;
		local391.anInt1812 = local35 - local16;
		local391.anInt1813 = local32 - local16;
		local391.anInt1814 = local259;
		Static137.aClass181_23.method4102(local391);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B[IIII)V")
	public static void method1261(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(6) int local6 = arg1 - 1;
		@Pc(9) int local9 = local6 - 7;
		while (local9 > arg2) {
			@Pc(12) int local12 = arg2 + 1;
			arg0[local12] = arg3;
			@Pc(17) int local17 = local12 + 1;
			arg0[local17] = arg3;
			@Pc(22) int local22 = local17 + 1;
			arg0[local22] = arg3;
			@Pc(27) int local27 = local22 + 1;
			arg0[local27] = arg3;
			@Pc(32) int local32 = local27 + 1;
			arg0[local32] = arg3;
			@Pc(37) int local37 = local32 + 1;
			arg0[local37] = arg3;
			@Pc(42) int local42 = local37 + 1;
			arg0[local42] = arg3;
			arg2 = local42 + 1;
			arg0[arg2] = arg3;
		}
		while (local6 > arg2) {
			arg2++;
			arg0[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1262(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg4) {
			Static46.method819(arg2, arg6, arg0, arg1, arg3, arg5);
		} else if (arg2 - arg5 >= Static28.anInt644 && arg5 + arg2 <= Static125.anInt2545 && Static108.anInt2276 <= arg3 - arg4 && arg4 + arg3 <= Static173.anInt3208) {
			Static324.method4620(arg0, arg6, arg3, arg4, arg1, arg5, arg2);
		} else {
			Static131.method2285(arg0, arg4, arg1, arg5, arg6, arg2, arg3);
		}
	}
}
