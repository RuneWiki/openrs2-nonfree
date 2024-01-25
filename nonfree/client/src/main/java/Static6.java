import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_6 = new Class134("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!sv;Lclient!or;II)V")
	public static void method110(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) Class183 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class2_Sub19 local9 = new Class2_Sub19();
		local9.anInt2173 = arg0.method3580();
		local9.anInt2177 = arg0.method3574();
		local9.anIntArray165 = new int[local9.anInt2173];
		local9.anIntArray163 = new int[local9.anInt2173];
		local9.anIntArray164 = new int[local9.anInt2173];
		local9.aClass91Array1 = new Class91[local9.anInt2173];
		local9.aClass91Array2 = new Class91[local9.anInt2173];
		local9.aByteArrayArrayArray2 = new byte[local9.anInt2173][][];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt2173; local56++) {
			try {
				@Pc(62) int local62 = arg0.method3580();
				@Pc(89) String local89;
				@Pc(93) String local93;
				@Pc(97) int local97;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local89 = arg0.method3582();
					local93 = arg0.method3582();
					local97 = 0;
					if (local62 == 1) {
						local97 = arg0.method3574();
					}
					local9.anIntArray165[local56] = local62;
					local9.anIntArray164[local56] = local97;
					local9.aClass91Array1[local56] = arg1.method3907(local93, Static246.method3144(local89));
				} else if (local62 == 3 || local62 == 4) {
					local89 = arg0.method3582();
					local93 = arg0.method3582();
					local97 = arg0.method3580();
					@Pc(100) String[] local100 = new String[local97];
					for (@Pc(102) int local102 = 0; local102 < local97; local102++) {
						local100[local102] = arg0.method3582();
					}
					@Pc(117) byte[][] local117 = new byte[local97][];
					@Pc(128) int local128;
					if (local62 == 3) {
						for (@Pc(122) int local122 = 0; local122 < local97; local122++) {
							local128 = arg0.method3574();
							local117[local122] = new byte[local128];
							arg0.method3598(local117[local122], local128);
						}
					}
					local9.anIntArray165[local56] = local62;
					@Pc(153) Class[] local153 = new Class[local97];
					for (local128 = 0; local128 < local97; local128++) {
						local153[local128] = Static246.method3144(local100[local128]);
					}
					local9.aClass91Array2[local56] = arg1.method3923(local93, Static246.method3144(local89), local153);
					local9.aByteArrayArrayArray2[local56] = local117;
				}
			} catch (@Pc(228) ClassNotFoundException local228) {
				local9.anIntArray163[local56] = -1;
			} catch (@Pc(235) SecurityException local235) {
				local9.anIntArray163[local56] = -2;
			} catch (@Pc(242) NullPointerException local242) {
				local9.anIntArray163[local56] = -3;
			} catch (@Pc(249) Exception local249) {
				local9.anIntArray163[local56] = -4;
			} catch (@Pc(256) Throwable local256) {
				local9.anIntArray163[local56] = -5;
			}
		}
		Static233.aClass156_57.method3157(local9);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIIIII)V")
	public static void method111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg0 + 1;
		Static216.method2862(arg3, arg2, arg1, Static229.anIntArrayArray26[arg0]);
		@Pc(21) int local21 = arg4 - 1;
		Static216.method2862(arg3, arg2, arg1, Static229.anIntArrayArray26[arg4]);
		for (@Pc(30) int local30 = local12; local30 <= local21; local30++) {
			@Pc(36) int[] local36 = Static229.anIntArrayArray26[local30];
			local36[arg3] = local36[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
	public static void method112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub5_Sub11 local13 = Static316.method4316(14, arg1);
		local13.method3098();
		local13.anInt3911 = arg0;
	}
}
