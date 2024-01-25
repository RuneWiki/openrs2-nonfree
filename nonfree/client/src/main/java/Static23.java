import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_4 = new Class96("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "[I")
	public static final int[] anIntArray26 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V")
	public static void method317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static350.anInt6633 / (float) Static350.anInt6635;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg2 * local9);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(39) int local39 = arg3 - (arg2 - local11) / 2;
		@Pc(48) int local48 = arg1 - (arg0 - local13) / 2;
		Static347.anInt6358 = Static350.anInt6635 * local39 / local11;
		Static39.anInt620 = Static350.anInt6633 - local48 * Static350.anInt6633 / local13;
		Static44.anInt680 = -1;
		Static150.anInt2693 = -1;
		Static250.method3591();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(ZI)Lclient!rm;")
	public static Class210 method322(@OriginalArg(1) int arg0) {
		@Pc(10) Class210 local10 = (Class210) Static106.aClass151_51.method3288((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static327.aClass109_74.method2349(0, arg0);
		local10 = new Class210();
		if (local20 != null) {
			local10.method4995(new Class1_Sub14(local20));
		}
		local10.method4994();
		Static106.aClass151_51.method3291((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([IIIII)V")
	public static void method323(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(13) int local13 = arg3 - 1;
		@Pc(16) int local16 = local13 - 7;
		while (arg1 < local16) {
			@Pc(20) int local20 = arg1 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			@Pc(50) int local50 = local45 + 1;
			arg0[local50] = arg2;
			arg1 = local50 + 1;
			arg0[arg1] = arg2;
		}
		while (arg1 < local13) {
			arg1++;
			arg0[arg1] = arg2;
		}
	}
}
