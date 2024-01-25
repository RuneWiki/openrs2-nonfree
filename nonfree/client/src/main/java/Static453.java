import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	public static int anInt7459;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_150 = new Class55("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_164 = new Class253(59, 6);

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "Z")
	public static boolean aBoolean504 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII)V")
	public static void method5752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		Static404.method5769(Static353.anIntArrayArray48[arg1], arg3 - arg0, arg0 + arg3, arg2);
		@Pc(26) int local26 = -1;
		while (local9 > local7) {
			local26 += 2;
			local7++;
			local12 += local26;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(52) int[] local52 = Static353.anIntArrayArray48[local9 + arg1];
				@Pc(59) int[] local59 = Static353.anIntArrayArray48[arg1 - local9];
				@Pc(63) int local63 = arg3 + local7;
				@Pc(68) int local68 = arg3 - local7;
				Static404.method5769(local52, local68, local63, arg2);
				Static404.method5769(local59, local68, local63, arg2);
			}
			@Pc(84) int local84 = local9 + arg3;
			@Pc(89) int local89 = arg3 - local9;
			@Pc(95) int[] local95 = Static353.anIntArrayArray48[local7 + arg1];
			@Pc(101) int[] local101 = Static353.anIntArrayArray48[arg1 - local7];
			Static404.method5769(local95, local89, local84, arg2);
			Static404.method5769(local101, local89, local84, arg2);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!go;II)V")
	public static void method5754(@OriginalArg(1) Class95 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static402.aBoolean412) {
			@Pc(13) Class256 local13 = Static141.anInt2697 == -1 ? null : Static443.aClass193_4.method4068(Static141.anInt2697);
			if (Static52.method725(arg0).method1904() && (Static180.anInt3240 & 0x20) != 0 && (local13 == null || arg0.method2157(Static141.anInt2697, local13.anInt6961) != local13.anInt6961)) {
				Static181.method2635(arg0.anInt2602, Static139.aString32, Static250.anInt4255, false, arg0.anInt2599, Static73.aString7 + " -> " + arg0.aString30, arg0.anInt2583, 0L, true, 16);
			}
			return;
		}
		@Pc(80) String local80;
		for (@Pc(73) int local73 = 9; local73 >= 5; local73--) {
			local80 = Static437.method1589(local73, arg0);
			if (local80 != null) {
				Static181.method2635(arg0.anInt2602, local80, Static286.method3215(local73, arg0), false, arg0.anInt2599, arg0.aString30, arg0.anInt2583, (long) (local73 + 1), true, 1008);
			}
		}
		local80 = Static12.method107(arg0);
		if (local80 != null) {
			Static181.method2635(arg0.anInt2602, local80, arg0.anInt2612, false, arg0.anInt2599, arg0.aString30, arg0.anInt2583, 0L, true, 17);
		}
		for (@Pc(143) int local143 = 4; local143 >= 0; local143--) {
			@Pc(150) String local150 = Static437.method1589(local143, arg0);
			if (local150 != null) {
				Static181.method2635(arg0.anInt2602, local150, Static286.method3215(local143, arg0), false, arg0.anInt2599, arg0.aString30, arg0.anInt2583, (long) (local143 + 1), true, 11);
			}
		}
		if (!Static52.method725(arg0).method1909()) {
			return;
		}
		if (arg0.aString31 == null) {
			Static181.method2635(arg0.anInt2602, Static422.aClass55_138.method1205(Static5.anInt20), -1, false, arg0.anInt2599, "", arg0.anInt2583, 0L, true, 22);
		} else {
			Static181.method2635(arg0.anInt2602, arg0.aString31, -1, false, arg0.anInt2599, "", arg0.anInt2583, 0L, true, 22);
		}
	}
}
