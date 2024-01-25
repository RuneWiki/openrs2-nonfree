import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!ns;")
	public static Class166 aClass166_6;

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
	public static int anInt162;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_2 = new Class36(76, -1);

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_1 = new Class242("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_3 = new Class36(40, 3);

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
	public static int anInt161 = 0;

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
	public static int anInt163 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZIIIIIIII)V")
	public static void method114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class4_Sub36 local7 = null;
		for (@Pc(12) Class4_Sub36 local12 = (Class4_Sub36) Static193.aClass258_48.method5538(); local12 != null; local12 = (Class4_Sub36) Static193.aClass258_48.method5528()) {
			if (arg5 == local12.anInt6038 && arg3 == local12.anInt6026 && arg2 == local12.anInt6039 && arg6 == local12.anInt6027) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub36();
			local7.anInt6026 = arg3;
			local7.anInt6039 = arg2;
			local7.anInt6027 = arg6;
			local7.anInt6038 = arg5;
			if (arg3 >= 0 && arg2 >= 0 && Static126.anInt2569 > arg3 && arg2 < Static190.anInt3697) {
				Static413.method5426(local7);
			}
			Static193.aClass258_48.method5526(local7);
		}
		local7.anInt6040 = arg1;
		local7.anInt6035 = arg4;
		local7.anInt6034 = 0;
		local7.anInt6029 = -1;
		local7.anInt6036 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([FII)[F")
	public static float[] method116(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float[] local14 = new float[arg1];
		Static457.method1216(arg0, 0, local14, 0, arg1);
		return local14;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIILjava/lang/String;ILclient!jb;IBLclient!se;Lclient!ea;Lclient!oa;)V")
	public static void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class126 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class215 arg8, @OriginalArg(10) Class57 arg9, @OriginalArg(11) Class105 arg10) {
		@Pc(15) int local15;
		if (Static134.anInt2621 == 4) {
			local15 = (int) Static146.aFloat82 & 0x3FFF;
		} else {
			local15 = Static94.anInt2046 + (int) Static146.aFloat82 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg6.anInt3421 / 2, arg6.anInt3442 / 2) + 10;
		@Pc(42) int local42 = arg5 * arg5 + arg2 * arg2;
		if (local42 > local34 * local34) {
			return;
		}
		@Pc(56) int local56 = Class56.anIntArray119[local15];
		@Pc(65) int local65 = Class56.anIntArray120[local15];
		if (Static134.anInt2621 != 4) {
			local56 = local56 * 256 / (Static109.anInt6939 + 256);
			local65 = local65 * 256 / (Static109.anInt6939 + 256);
		}
		@Pc(96) int local96 = local56 * arg5 + local65 * arg2 >> 15;
		@Pc(107) int local107 = local65 * arg5 - local56 * arg2 >> 15;
		@Pc(114) int local114 = arg8.method4969(100, null, arg4);
		@Pc(122) int local122 = arg8.method4967(null, arg4);
		@Pc(128) int local128 = local96 - local114 / 2;
		if (-arg6.anInt3421 <= local128 && local128 <= arg6.anInt3421 && -arg6.anInt3442 <= local107 && arg6.anInt3442 >= local107) {
			arg10.method5610(50, arg7, arg1, arg0, 0, null, arg9, 0, null, arg1 + arg6.anInt3442 / 2 - local122 - local107 - arg3, arg6.anInt3421 / 2 + arg0 + local128, arg4, local114);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)I")
	public static int method121(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
