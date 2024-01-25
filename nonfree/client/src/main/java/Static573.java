import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	public static int anInt10250;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	public static int anInt10252;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	public static int anInt10254;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "[Lclient!mi;")
	public static Class46[] aClass46Array19;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_231 = new Class215(112, 4);

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_232 = new Class215(63, 5);

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public static int anInt10251 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z")
	public static boolean method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static618.method9021(arg1, arg0) | Static209.method4124(arg0, arg1) | Static297.method5316(arg1, arg0)) & Static418.method6753(arg0, arg1);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!hg;I)V")
	public static void method8546(@OriginalArg(0) int arg0, @OriginalArg(1) Class130 arg1) {
		if (Static395.anInt7569 >= 50 || (arg1 == null || arg1.anIntArrayArray21 == null || arg0 >= arg1.anIntArrayArray21.length || arg1.anIntArrayArray21[arg0] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray21[arg0][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(57) int local57;
		if (arg1.anIntArrayArray21[arg0].length > 1) {
			local57 = (int) (Math.random() * (double) arg1.anIntArrayArray21[arg0].length);
			if (local57 > 0) {
				local38 = arg1.anIntArrayArray21[arg0][local57];
			}
		}
		@Pc(75) int local75 = local34 >> 5 & 0x7;
		local57 = 256;
		if (arg1.anIntArray236 != null && arg1.anIntArray241 != null) {
			local57 = Static107.method7092(arg1.anIntArray241[arg0], arg1.anIntArray236[arg0]);
		}
		if (arg1.aBoolean350) {
			Static61.method7220(local75, local57, false, 255, 0, local38);
		} else {
			Static269.method4946(255, local38, local75, 0, local57);
		}
	}
}
