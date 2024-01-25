import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "[Lclient!au;")
	public static Class16[] aClass16Array4;

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "Lclient!he;")
	public static Class100 aClass100_56;

	@OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
	public static int anInt5297;

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "Lclient!sn;")
	public static Class225 aClass225_1;

	@OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
	public static int anInt5298;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_69 = new Class267("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BIIIIIII)V")
	public static void method4422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg5);
		@Pc(17) int local17 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg0);
		@Pc(23) int local23 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg2);
		@Pc(29) int local29 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg3);
		@Pc(37) int local37 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg1 + arg5);
		@Pc(48) int local48 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg0 - arg1);
		for (@Pc(50) int local50 = local11; local50 < local37; local50++) {
			Static298.method4405(Static62.anIntArrayArray7[local50], arg6, local29, local23);
		}
		for (@Pc(70) int local70 = local17; local70 > local48; local70--) {
			Static298.method4405(Static62.anIntArrayArray7[local70], arg6, local29, local23);
		}
		@Pc(92) int local92 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 + arg2);
		@Pc(102) int local102 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg3 - arg1);
		for (@Pc(104) int local104 = local37; local104 <= local48; local104++) {
			@Pc(110) int[] local110 = Static62.anIntArrayArray7[local104];
			Static298.method4405(local110, arg6, local92, local23);
			Static298.method4405(local110, arg4, local102, local92);
			Static298.method4405(local110, arg6, local29, local102);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IC)Z")
	public static boolean method4423(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)V")
	public static void method4424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static409.aClass101ArrayArrayArray3[0][arg1][arg2] != null && Static409.aClass101ArrayArrayArray3[0][arg1][arg2].aClass101_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static409.aClass101ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class101 local46 = Static409.aClass101ArrayArrayArray3[local22][arg1][arg2] = new Class101(local22, arg1, arg2);
				if (local20) {
					local46.aByte43++;
				}
			}
		}
	}
}
