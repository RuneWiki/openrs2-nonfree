import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_10 = new Class46(30, 2);

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "Lclient!wk;")
	public static final Class376 aClass376_2 = new Class376(6, 4);

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)I")
	public static int method583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIIIII)V")
	public static void method584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg5);
		@Pc(17) int local17 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg2);
		@Pc(23) int local23 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg1);
		@Pc(29) int local29 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4);
		@Pc(37) int local37 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg6 + arg5);
		@Pc(45) int local45 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg2 - arg6);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			Static491.method7219(Static249.anIntArrayArray23[local47], local23, arg0, local29);
		}
		for (@Pc(67) int local67 = local17; local67 > local45; local67--) {
			Static491.method7219(Static249.anIntArrayArray23[local67], local23, arg0, local29);
		}
		@Pc(95) int local95 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg6 + arg1);
		@Pc(104) int local104 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 - arg6);
		for (@Pc(111) int local111 = local37; local111 <= local45; local111++) {
			@Pc(117) int[] local117 = Static249.anIntArrayArray23[local111];
			Static491.method7219(local117, local23, arg0, local95);
			Static491.method7219(local117, local95, arg3, local104);
			Static491.method7219(local117, local104, arg0, local29);
		}
	}
}
