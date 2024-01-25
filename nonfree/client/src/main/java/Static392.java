import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_107 = new Class194(11, 2);

	@OriginalMember(owner = "client!tl", name = "D", descriptor = "Lclient!eg;")
	public static final Class60 aClass60_8 = new Class60("", 11);

	@OriginalMember(owner = "client!tl", name = "E", descriptor = "[I")
	public static final int[] anIntArray453 = new int[32];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method5126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static410.aClass125Array3 == null) {
			return;
		}
		@Pc(8) Class2_Sub1_Sub3 local8 = null;
		@Pc(17) int local17;
		if (arg11 >= 0) {
			local17 = arg11 - 1;
			@Pc(24) Class5_Sub7 local24 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local17);
			if (local24 != null) {
				local8 = local24.aClass2_Sub1_Sub3_Sub1_1;
			}
		} else {
			local17 = -arg11 - 1;
			if (local17 == Static43.anInt5302) {
				local8 = Static220.aClass2_Sub1_Sub3_Sub2_1;
			} else {
				local8 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local17];
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(53) Class114 local53 = Static398.aClass256_4.method5782(arg0);
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (arg6 == 1 || arg6 == 3) {
			local62 = local53.anInt2990;
			local65 = local53.anInt2993;
		} else {
			local62 = local53.anInt2993;
			local65 = local53.anInt2990;
		}
		@Pc(79) int local79 = (local65 >> 1) + arg1;
		@Pc(88) int local88 = arg1 + (local65 + 1 >> 1);
		@Pc(95) int local95 = arg3 + (local62 >> 1);
		@Pc(104) int local104 = arg3 + (local62 + 1 >> 1);
		@Pc(108) Class125 local108 = Static410.aClass125Array3[arg12];
		@Pc(136) int local136 = local108.ua(local79, local95) + local108.ua(local88, local95) + local108.ua(local79, local104) + local108.ua(local88, local104) >> 2;
		@Pc(140) Class5_Sub11 local140 = new Class5_Sub11();
		local140.anInt1523 = arg3;
		local140.anInt1522 = Static85.anInt1536 + arg7;
		local140.anInt1518 = arg0;
		local140.anInt1524 = local8.aByte105;
		@Pc(164) int local164;
		if (arg4 < arg10) {
			local164 = arg10;
			arg10 = arg4;
			arg4 = local164;
		}
		local140.anInt1529 = arg5;
		local140.anInt1526 = arg6;
		local140.anInt1512 = arg8 + Static85.anInt1536;
		local140.anInt1515 = arg1;
		local140.anInt1511 = arg10 + arg1;
		local140.anInt1517 = arg4 + arg1;
		if (arg2 > arg9) {
			local164 = arg2;
			arg2 = arg9;
			arg9 = local164;
		}
		local140.anInt1521 = arg9 + arg3;
		local140.anInt1528 = local136;
		local140.anInt1527 = (local140.anInt1515 << 7) + (local65 << 6);
		local140.anInt1525 = arg3 + arg2;
		local140.anInt1514 = (local140.anInt1523 << 7) + (local62 << 6);
		Static75.aClass177_5.method3615(local140);
		local8.aClass5_Sub11_3 = local140;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(CI)Z")
	public static boolean method5127(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z")
	public static boolean method5129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static43.method4103(arg0, arg1) || Static243.method3146(arg1, arg0);
	}
}
