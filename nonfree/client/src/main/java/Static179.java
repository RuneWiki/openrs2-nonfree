import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
	public static int anInt3991;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
	public static int anInt3992;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
	public static final int anInt3993 = 1;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIZIZ)V")
	public static void method3539(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 <= arg1) {
			return;
		}
		@Pc(24) int local24 = (arg1 + arg4) / 2;
		@Pc(26) int local26 = arg1;
		@Pc(30) Class116_Sub1 local30 = Static199.aClass116_Sub1Array1[local24];
		Static199.aClass116_Sub1Array1[local24] = Static199.aClass116_Sub1Array1[arg4];
		Static199.aClass116_Sub1Array1[arg4] = local30;
		for (@Pc(42) int local42 = arg1; local42 < arg4; local42++) {
			if (Static269.method4547(local30, arg3, arg2, Static199.aClass116_Sub1Array1[local42], arg0, arg5) <= 0) {
				@Pc(62) Class116_Sub1 local62 = Static199.aClass116_Sub1Array1[local42];
				Static199.aClass116_Sub1Array1[local42] = Static199.aClass116_Sub1Array1[local26];
				Static199.aClass116_Sub1Array1[local26++] = local62;
			}
		}
		Static199.aClass116_Sub1Array1[arg4] = Static199.aClass116_Sub1Array1[local26];
		Static199.aClass116_Sub1Array1[local26] = local30;
		method3539(arg0, arg1, arg2, arg3, local26 - 1, arg5);
		method3539(arg0, local26 + 1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!cd;I)V")
	public static void method3540(@OriginalArg(0) Class6_Sub10 arg0) {
		if (arg0.aClass6_Sub12_5 != null) {
			arg0.aClass6_Sub12_5.anInt9541 = 0;
		}
		arg0.aBoolean505 = false;
		for (@Pc(23) Class6_Sub10 local23 = arg0.method5656(); local23 != null; local23 = arg0.method5655()) {
			method3540(local23);
		}
	}
}
