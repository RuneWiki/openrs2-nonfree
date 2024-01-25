import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_64 = new Class119("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_94 = new Class103(50, 3);

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
	public static int anInt2201 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	public static void method1884() {
		Static285.anInt5015 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static7.aClass1_Sub28Array1[local9] = null;
			Static372.aByteArray84[local9] = 1;
			Static162.aClass44Array1[local9] = null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "([B[BIIIIBII)V")
	public static void method1886(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(20) int local20 = -(arg6 & 0x3);
		for (@Pc(23) int local23 = -arg2; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg7++;
				arg0[local31] = (byte) (arg0[local31] - arg1[arg3++]);
				@Pc(44) int local44 = arg7++;
				arg0[local44] = (byte) (arg0[local44] - arg1[arg3++]);
				@Pc(57) int local57 = arg7++;
				arg0[local57] = (byte) (arg0[local57] - arg1[arg3++]);
				@Pc(70) int local70 = arg7++;
				arg0[local70] = (byte) (arg0[local70] - arg1[arg3++]);
			}
			for (@Pc(86) int local86 = local20; local86 < 0; local86++) {
				local31 = arg7++;
				arg0[local31] = (byte) (arg0[local31] - arg1[arg3++]);
			}
			arg7 += arg5;
			arg3 += arg4;
		}
	}
}
