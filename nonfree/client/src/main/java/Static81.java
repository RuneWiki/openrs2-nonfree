import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!sea;")
	public static Class308 aClass308_32;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "Z")
	public static volatile boolean aBoolean100 = true;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
	public static int method1347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static39.method713(arg0 - 1, arg1 + -1) + Static39.method713(arg0 + 1, arg1 + -1) + Static39.method713(arg0 + -1, arg1 + 1) + Static39.method713(arg0 + 1, arg1 + 1);
		@Pc(69) int local69 = Static39.method713(arg0 - 1, arg1) + Static39.method713(arg0 + 1, arg1) + Static39.method713(arg0, arg1 + -1) + Static39.method713(arg0, arg1 + 1);
		@Pc(74) int local74 = Static39.method713(arg0, arg1);
		return local74 / 4 + local40 / 16 + local69 / 8;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BZZ)V")
	public static void method1350(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static414.anInt7793--;
			if (Static414.anInt7793 == 0) {
				Static226.anIntArray212 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static236.anInt8914--;
		if (Static236.anInt8914 == 0) {
			Static281.anIntArray289 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIBII)V")
	public static void method1351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 - arg1 >= Static330.anInt6025 && arg0 + arg1 <= Static194.anInt3788 && Static120.anInt2491 <= arg4 - arg1 && Static71.anInt1350 >= arg4 + arg1) {
			Static488.method6720(arg1, arg5, arg0, arg2, arg4, arg3);
		} else {
			Static323.method4805(arg2, arg1, arg3, arg0, arg4, arg5);
		}
	}
}
