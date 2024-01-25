import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
	public static int anInt3718;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Z")
	public static boolean aBoolean247 = true;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	public static int anInt3722 = -1;

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
	public static int anInt3723 = 0;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZIIII)Lclient!da;")
	public static Class2_Sub9 method3068(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub9 local12 = new Class2_Sub9();
		local12.anInt1142 = arg2;
		local12.anInt1143 = arg1;
		Static394.aClass220_45.method5104(local12, (long) arg3);
		Static135.method1387(arg1);
		@Pc(31) Class93 local31 = Static160.method2380(arg3);
		if (local31 != null) {
			Static383.method5263(local31);
		}
		if (Static361.aClass93_17 != null) {
			Static383.method5263(Static361.aClass93_17);
			Static361.aClass93_17 = null;
		}
		Static281.method3560();
		if (local31 != null) {
			Static189.method2742(!arg0, local31);
		}
		if (!arg0) {
			Static76.method1144(arg1);
		}
		if (!arg0 && Static103.anInt5365 != -1) {
			Static233.method3189(Static103.anInt5365, 1);
		}
		return local12;
	}
}
