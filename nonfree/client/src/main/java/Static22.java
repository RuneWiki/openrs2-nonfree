import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!am", name = "P", descriptor = "Lclient!cb;")
	public static Class50 aClass50_6;

	@OriginalMember(owner = "client!am", name = "O", descriptor = "Lclient!aba;")
	public static final Class4 aClass4_2 = new Class4();

	@OriginalMember(owner = "client!am", name = "Q", descriptor = "Z")
	public static final boolean aBoolean12 = true;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIII)V")
	public static void method331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static439.method6578(arg1, Static128.anInt2200, Static380.anInt6585);
		@Pc(17) int local17 = Static439.method6578(arg3, Static128.anInt2200, Static380.anInt6585);
		@Pc(23) int local23 = Static439.method6578(arg0, Static361.anInt6317, Static651.anInt10267);
		@Pc(29) int local29 = Static439.method6578(arg4, Static361.anInt6317, Static651.anInt10267);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static343.method5202(local23, Static286.anIntArrayArray42[local31], arg2, local29);
		}
	}
}
