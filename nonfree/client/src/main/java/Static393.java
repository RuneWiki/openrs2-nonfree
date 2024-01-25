import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
	public static int anInt6761;

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "F")
	public static float aFloat92 = 0.0F;

	@OriginalMember(owner = "client!ts", name = "D", descriptor = "[I")
	public static final int[] anIntArray488 = new int[100];

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V")
	public static void method5307() {
		Static126.anInt3502 = 0;
		Static234.anInt4519 = 0;
		Static204.anInt778 = 0;
		Static211.anInt4168 = 0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZII)I")
	public static int method5308(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub30 local8 = Static9.method237(arg0, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && local8.anIntArray362.length > arg2) {
			return local8.anIntArray362[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)I")
	public static int method5309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1023 - arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V")
	public static void method5310() {
		Static293.method2805(25);
		Static448.method5929();
		System.gc();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIII)V")
	public static void method5311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 - arg0 >= Static142.anInt3212 && Static450.anInt7594 >= arg0 + arg3 && arg4 - arg0 >= Static161.anInt3448 && Static163.anInt3488 >= arg4 + arg0) {
			Static97.method1717(arg0, arg1, arg2, arg3, arg5, arg4);
		} else {
			Static269.method4033(arg1, arg2, arg0, arg3, arg4, arg5);
		}
	}
}
