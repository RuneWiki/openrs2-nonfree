import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "[I")
	public static final int[] anIntArray116 = new int[50];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIII)V")
	public static void method2572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg0) {
			Static580.method8027(Static104.anIntArrayArray24[arg1], arg2, arg0, arg3);
		} else {
			Static580.method8027(Static104.anIntArrayArray24[arg1], arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLjava/lang/String;ZLclient!nga;I)V")
	public static void method2573(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class228 arg3) {
		if (!arg2) {
			Static65.method1480(arg3, 3, arg1);
			return;
		}
		@Pc(19) String local19;
		if (Static372.aString79.startsWith("win") && arg3.aBoolean614) {
			local19 = null;
			if (Static632.anApplet2 != null) {
				local19 = Static632.anApplet2.getParameter("haveie6");
			}
			if (local19 == null || !local19.equals("1")) {
				@Pc(37) Class376 local37 = Static65.method1480(arg3, 0, arg1);
				Static145.aClass376_37 = local37;
				Static74.aString14 = arg1;
				Static594.aClass228_10 = arg3;
				return;
			}
		}
		if (Static372.aString79.startsWith("mac")) {
			local19 = null;
			if (Static632.anApplet2 != null) {
				local19 = Static632.anApplet2.getParameter("havefirefox");
			}
			if (local19 != null && local19.equals("1") && arg0) {
				Static65.method1480(arg3, 1, arg1);
				return;
			}
		}
		Static65.method1480(arg3, 2, arg1);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BIIII)V")
	public static void method2574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static361.anInt2226 / (float) Static361.anInt2228;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg0);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(40) int local40 = arg3 - (arg2 - local13) / 2;
		@Pc(49) int local49 = arg1 - (arg0 - local11) / 2;
		Static642.anInt10524 = -1;
		Static118.anInt3044 = -1;
		Static353.anInt6903 = Static361.anInt2228 * local49 / local11;
		Static386.anInt8408 = Static361.anInt2226 - local40 * Static361.anInt2226 / local13;
		Static249.method4696();
	}
}
