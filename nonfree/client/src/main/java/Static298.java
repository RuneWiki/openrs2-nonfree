import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!of", name = "R", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_76 = new Class142("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!of", name = "S", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_80 = new Class242(56, 12);

	@OriginalMember(owner = "client!of", name = "X", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[8];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII[I)V")
	public static void method3977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0--;
		@Pc(8) int local8 = arg2 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (arg0 < local11) {
			@Pc(15) int local15 = arg0 + 1;
			arg3[local15] = arg1;
			@Pc(20) int local20 = local15 + 1;
			arg3[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg1;
			arg0 = local45 + 1;
			arg3[arg0] = arg1;
		}
		while (arg0 < local8) {
			arg0++;
			arg3[arg0] = arg1;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIZIIIII)V")
	public static void method3979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg2 < 1 || Static147.anInt2300 - 2 < arg4 || arg2 > Static293.anInt4886 - 2) {
			return;
		}
		@Pc(29) int local29 = arg1;
		if (arg1 < 3 && Static141.method4892(arg2, arg4)) {
			local29 = arg1 + 1;
		}
		if (!Static126.aClass19_Sub1_1.method3353(Static214.anInt3968) && !Static140.method1765(Static130.anInt2040, arg4, arg2, local29)) {
			return;
		}
		if (Static259.aClass216ArrayArrayArray3 == null) {
			return;
		}
		Static306.aClass104_Sub1_1.method3733(Static186.aClass117_3, Static385.aClass158Array1[arg1], arg1, arg2, arg4, arg6);
		if (arg5 < 0) {
			return;
		}
		@Pc(70) boolean local70 = Static126.aClass19_Sub1_1.aBoolean387;
		Static126.aClass19_Sub1_1.aBoolean387 = true;
		Static306.aClass104_Sub1_1.method3730(arg3, Static385.aClass158Array1[arg1], arg1, arg4, arg7, arg0, local29, Static186.aClass117_3, arg5, arg2);
		Static126.aClass19_Sub1_1.aBoolean387 = local70;
		return;
	}
}
