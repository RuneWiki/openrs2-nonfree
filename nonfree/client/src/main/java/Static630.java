import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!wha", name = "E", descriptor = "Lclient!tm;")
	public static Class337 aClass337_165;

	@OriginalMember(owner = "client!wha", name = "C", descriptor = "Lclient!nf;")
	public static final Class242 aClass242_7 = new Class242();

	@OriginalMember(owner = "client!wha", name = "D", descriptor = "[I")
	public static int[] anIntArray595 = new int[1];

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IILclient!jl;II)V")
	public static void method8904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(19) Class5_Sub20 local19 = (Class5_Sub20) Static368.aClass330_32.method7908(); local19 != null; local19 = (Class5_Sub20) Static368.aClass330_32.method7914()) {
			if (arg0 == local19.anInt2418 && local19.anInt2410 == arg1 << 9 && arg3 << 9 == local19.anInt2406 && arg2.anInt4758 == local19.aClass181_1.anInt4758) {
				if (local19.aClass5_Sub1_Sub4_2 != null) {
					Static26.aClass5_Sub1_Sub2_1.method5052(local19.aClass5_Sub1_Sub4_2);
					local19.aClass5_Sub1_Sub4_2 = null;
				}
				if (local19.aClass5_Sub1_Sub4_1 != null) {
					Static26.aClass5_Sub1_Sub2_1.method5052(local19.aClass5_Sub1_Sub4_1);
					local19.aClass5_Sub1_Sub4_1 = null;
				}
				local19.method9047();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(II)V")
	public static void method8907() {
		Static207.anInt3986 = -1;
		Static212.anInt4042 = -1;
		Static217.aClass207_53 = null;
		Static172.anInt3051 = 2;
		Static522.anInt8987 = 0;
		Static591.aClass5_Sub1_Sub5_4 = null;
		Static134.aBoolean181 = false;
		Static72.anInt1497 = 1;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg1 == arg4 && arg0 == arg2 && arg3 == arg5 && arg7 == arg6) {
			Static482.method7143(arg8, arg5, arg6, arg4, arg0);
			return;
		}
		@Pc(39) int local39 = arg4;
		@Pc(41) int local41 = arg0;
		@Pc(45) int local45 = arg4 * 3;
		@Pc(49) int local49 = arg0 * 3;
		@Pc(53) int local53 = arg1 * 3;
		@Pc(57) int local57 = arg2 * 3;
		@Pc(61) int local61 = arg3 * 3;
		@Pc(65) int local65 = arg7 * 3;
		@Pc(75) int local75 = local53 + arg5 - arg4 - local61;
		@Pc(85) int local85 = arg6 + local57 - local65 - arg0;
		@Pc(95) int local95 = local61 + local45 - local53 - local53;
		@Pc(105) int local105 = local65 + local49 - local57 - local57;
		@Pc(110) int local110 = local53 - local45;
		@Pc(115) int local115 = local57 - local49;
		for (@Pc(117) int local117 = 128; local117 <= 4096; local117 += 128) {
			@Pc(125) int local125 = local117 * local117 >> 12;
			@Pc(131) int local131 = local125 * local117 >> 12;
			@Pc(135) int local135 = local131 * local75;
			@Pc(139) int local139 = local85 * local131;
			@Pc(143) int local143 = local125 * local95;
			@Pc(147) int local147 = local105 * local125;
			@Pc(151) int local151 = local117 * local110;
			@Pc(155) int local155 = local115 * local117;
			@Pc(165) int local165 = (local151 + local135 + local143 >> 12) + arg4;
			@Pc(175) int local175 = (local155 + local147 + local139 >> 12) + arg0;
			Static482.method7143(arg8, local165, local175, local39, local41);
			local41 = local175;
			local39 = local165;
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIIII)V")
	public static void method8912(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class154[] local3 = Static82.aClass154Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class154 local11 = local3[local5];
			if (local11 != null && local11.anInt4132 == 2) {
				Static622.method8832(local11.anInt4139, local11.anInt4134, local11.anInt4135, arg1 >> 1, local11.anInt4136 * 2, arg3 >> 1);
				if (Static120.anIntArray136[0] > -1 && Static631.anInt10493 % 20 < 10) {
					@Pc(56) Class28 local56 = Static160.aClass28Array20[local11.anInt4130];
					@Pc(65) int local65 = arg2 + Static120.anIntArray136[0] - 12;
					@Pc(73) int local73 = arg0 + Static120.anIntArray136[1] - 28;
					local56.method4040(local65, local73);
					Static562.method5062(local73, local56.method4042() + local73, local65 + local56.method4035(), local65);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILclient!la;Lclient!la;Lclient!la;Lclient!la;)V")
	public static void method8916(@OriginalArg(1) Class207 arg0, @OriginalArg(2) Class207 arg1, @OriginalArg(3) Class207 arg2, @OriginalArg(4) Class207 arg3) {
		Static546.aClass207_114 = arg1;
		Static613.aClass207_124 = arg3;
		Static517.aClass207_109 = arg0;
		Static519.aClass295ArrayArray2 = new Class295[Static546.aClass207_114.method4685()][];
		Static490.aBooleanArray25 = new boolean[Static546.aClass207_114.method4685()];
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BIII)I")
	public static int method8917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static353.anInt5917 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(27) int local27 = arg2 - Static620.anInt8206;
		@Pc(32) int local32 = arg1 - Static620.anInt8210;
		for (@Pc(37) Class5_Sub26 local37 = (Class5_Sub26) Static620.aClass330_46.method7908(); local37 != null; local37 = (Class5_Sub26) Static620.aClass330_46.method7914()) {
			if (arg0 == local37.anInt4151) {
				@Pc(50) int local50 = local37.anInt4153;
				@Pc(53) int local53 = local37.anInt4154;
				@Pc(63) int local63 = Static620.anInt8210 + local53 | local50 + Static620.anInt8206 << 14;
				@Pc(81) int local81 = (local32 - local53) * (local32 - local53) + (local27 - local50) * (local27 - local50);
				if (local12 < 0 || local14 > local81) {
					local14 = local81;
					local12 = local63;
				}
			}
		}
		return local12;
	}
}
