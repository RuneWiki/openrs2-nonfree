import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!mm", name = "O", descriptor = "Lclient!rg;")
	public static Class27 aClass27_17;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_153 = new Class62("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!mm", name = "jb", descriptor = "Z")
	public static boolean aBoolean313 = false;

	@OriginalMember(owner = "client!mm", name = "pb", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_154 = new Class62(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!mm", name = "yb", descriptor = "[I")
	public static final int[] anIntArray315 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method3837(@OriginalArg(0) Class2_Sub11 arg0) {
		arg0.aBoolean410 = false;
		if (arg0.aClass2_Sub20_5 != null) {
			arg0.aClass2_Sub20_5.anInt3403 = 0;
		}
		for (@Pc(23) Class2_Sub11 local23 = arg0.method4871(); local23 != null; local23 = arg0.method4872()) {
			method3837(local23);
		}
	}
}
