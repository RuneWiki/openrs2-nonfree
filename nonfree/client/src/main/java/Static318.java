import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!rb;")
	public static final Class245 aClass245_15 = new Class245(7, 0, 1, 1);

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_122 = new Class239(90, 12);

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	public static int anInt5962 = 765;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
	public static void method5085(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub13_Sub15 local16 = Static370.method5893(arg0, 16);
		local16.method6974();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
	public static void method5086() {
		Static249.method3958(Static323.anInt6015);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ps;Lclient!uf;ZI)V")
	public static void method5087(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class2_Sub22 local9 = new Class2_Sub22();
		local9.anInt2547 = arg0.method5170();
		local9.anInt2549 = arg0.method5198();
		local9.aClass20Array2 = new Class20[local9.anInt2547];
		local9.anIntArray325 = new int[local9.anInt2547];
		local9.anIntArray327 = new int[local9.anInt2547];
		local9.aClass20Array1 = new Class20[local9.anInt2547];
		local9.aByteArrayArrayArray7 = new byte[local9.anInt2547][][];
		local9.anIntArray326 = new int[local9.anInt2547];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt2547; local55++) {
			try {
				@Pc(61) int local61 = arg0.method5170();
				@Pc(81) String local81;
				@Pc(85) String local85;
				@Pc(89) int local89;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local81 = arg0.method5194();
					local85 = arg0.method5194();
					local89 = 0;
					if (local61 == 1) {
						local89 = arg0.method5198();
					}
					local9.anIntArray325[local55] = local61;
					local9.anIntArray326[local55] = local89;
					local9.aClass20Array1[local55] = arg1.method7181(local85, Static302.method4742(local81));
				} else if (local61 == 3 || local61 == 4) {
					local81 = arg0.method5194();
					local85 = arg0.method5194();
					local89 = arg0.method5170();
					@Pc(92) String[] local92 = new String[local89];
					for (@Pc(94) int local94 = 0; local94 < local89; local94++) {
						local92[local94] = arg0.method5194();
					}
					@Pc(113) byte[][] local113 = new byte[local89][];
					@Pc(124) int local124;
					if (local61 == 3) {
						for (@Pc(118) int local118 = 0; local118 < local89; local118++) {
							local124 = arg0.method5198();
							local113[local118] = new byte[local124];
							arg0.method5184(local124, local113[local118]);
						}
					}
					local9.anIntArray325[local55] = local61;
					@Pc(153) Class[] local153 = new Class[local89];
					for (local124 = 0; local124 < local89; local124++) {
						local153[local124] = Static302.method4742(local92[local124]);
					}
					local9.aClass20Array2[local55] = arg1.method7171(local153, Static302.method4742(local81), local85);
					local9.aByteArrayArrayArray7[local55] = local113;
				}
			} catch (@Pc(232) ClassNotFoundException local232) {
				local9.anIntArray327[local55] = -1;
			} catch (@Pc(239) SecurityException local239) {
				local9.anIntArray327[local55] = -2;
			} catch (@Pc(246) NullPointerException local246) {
				local9.anIntArray327[local55] = -3;
			} catch (@Pc(253) Exception local253) {
				local9.anIntArray327[local55] = -4;
			} catch (@Pc(260) Throwable local260) {
				local9.anIntArray327[local55] = -5;
			}
		}
		Static308.aClass249_30.method6523(local9);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZIIIIIIII)Z")
	public static boolean method5088(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray450[0];
		@Pc(13) int local13 = Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray449[0];
		if (local8 < 0 || Static363.anInt1158 <= local8 || local13 < 0 || Static511.anInt8889 <= local13) {
			return false;
		} else if (arg6 >= 0 && Static363.anInt1158 > arg6 && arg5 >= 0 && arg5 < Static511.anInt8889) {
			@Pc(76) int local76 = Static343.method5390(arg4, arg3, Static172.anIntArray506, local8, Static266.aClass1_Sub1_Sub2_Sub1_1.method4394(), arg5, Static165.anIntArray349, arg1, arg7, local13, arg2, arg6, Static207.aClass99Array1[Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90], arg0);
			if (local76 < 1) {
				return false;
			}
			Static440.anInt8023 = Static165.anIntArray349[local76 - 1];
			Static203.anInt3677 = Static172.anIntArray506[local76 - 1];
			Static40.aBoolean609 = false;
			Static347.method5459();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(BI)V")
	public static void method5089(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub13_Sub15 local14 = Static370.method5893(arg0, 9);
		local14.method6974();
	}
}
