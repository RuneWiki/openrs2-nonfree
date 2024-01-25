import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
	public static int anInt7175 = 0;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!ha;IILclient!jl;I)V")
	public static void method6338(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class181 arg4) {
		@Pc(9) Class348 local9 = Static586.aClass333_4.method7937(arg4.anInt4789);
		if (local9.anInt9594 == -1) {
			return;
		}
		if (arg4.aBoolean350) {
			@Pc(23) int local23 = arg0 + arg4.anInt4749;
			arg0 = local23 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(39) Class28 local39 = local9.method8242(arg0, arg4.aBoolean349, arg1);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg4.anInt4756;
		@Pc(48) int local48 = arg4.anInt4781;
		if ((arg0 & 0x1) == 1) {
			local45 = arg4.anInt4781;
			local48 = arg4.anInt4756;
		}
		@Pc(64) int local64 = local39.method4035();
		@Pc(67) int local67 = local39.method4042();
		if (local9.aBoolean691) {
			local67 = local48 * 4;
			local64 = local45 * 4;
		}
		if (local9.anInt9595 == 0) {
			local39.method4046(arg3, arg2 - (local48 - 1) * 4, local64, local67);
		} else {
			local39.method4051(arg3, arg2 - (local48 - 1) * 4, local64, local67, 0, local9.anInt9595 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method6340(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5) {
		Static361.method8007(arg4, arg5, -1, null, arg1, arg2, arg0, arg3);
	}
}
