import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
	public static int anInt507;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
	public static int anInt504 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIII)V")
	public static void method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) Class132 local13 = Static6.method131(arg0, arg3);
		if (local13 != null && local13.anObjectArray7 != null) {
			@Pc(22) Class6_Sub15 local22 = new Class6_Sub15();
			local22.anObjectArray2 = local13.anObjectArray7;
			local22.aClass132_5 = local13;
			Static140.method2654(local22);
		}
		Static1.anInt38 = arg1;
		Static252.anInt4705 = arg3;
		Static163.anInt3085 = arg4;
		Static288.anInt5432 = arg5;
		Static30.anInt572 = arg0;
		Static221.anInt4061 = arg2;
		Static79.aBoolean97 = true;
		Static298.method5108(local13);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) Class6_Sub38 local21 = (Class6_Sub38) Static297.aClass108_31.method2900((long) arg2);
		if (local21 == null) {
			local21 = new Class6_Sub38();
			Static297.aClass108_31.method2898((long) arg2, local21);
		}
		if (arg0 >= local21.anIntArray653.length) {
			@Pc(43) int[] local43 = new int[arg0 + 1];
			@Pc(48) int[] local48 = new int[arg0 + 1];
			for (@Pc(50) int local50 = 0; local50 < local21.anIntArray653.length; local50++) {
				local43[local50] = local21.anIntArray653[local50];
				local48[local50] = local21.anIntArray652[local50];
			}
			for (@Pc(76) int local76 = local21.anIntArray653.length; local76 < arg0; local76++) {
				local43[local76] = -1;
				local48[local76] = 0;
			}
			local21.anIntArray653 = local43;
			local21.anIntArray652 = local48;
		}
		local21.anIntArray653[arg0] = arg3;
		local21.anIntArray652[arg0] = arg1;
	}
}
