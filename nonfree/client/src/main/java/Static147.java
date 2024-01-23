import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!og", name = "mb", descriptor = "I")
	public static int anInt3196;

	@OriginalMember(owner = "client!og", name = "Z", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1127 = Static64.method1101("<br>");

	@OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
	public static int anInt3191 = 0;

	@OriginalMember(owner = "client!og", name = "lb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1128 = Static64.method1101("sl_flags");

	@OriginalMember(owner = "client!og", name = "ob", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1129 = Static64.method1101("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I[I[BIIIIIIZI)V")
	public static void method2522(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(23) int local23 = (arg4 * (arg9 & 0xFF00FF) & 0xFF00FF00) + (arg4 * (arg9 & 0xFF00) & 0xFF0000) >> 8;
		@Pc(28) int local28 = 256 - arg4;
		for (@Pc(36) int local36 = -arg0; local36 < 0; local36++) {
			for (@Pc(41) int local41 = -arg5; local41 < 0; local41++) {
				if (arg2[arg3++] == 0) {
					arg7++;
				} else {
					@Pc(58) int local58 = arg1[arg7];
					arg1[arg7++] = local23 + (((local58 & 0xFF00) * local28 & 0xFF0000) + (local28 * (local58 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg7 += arg6;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
	public static void method2524() {
		@Pc(9) int local9 = Static203.aClass105_20.method3110();
		if (local9 == 0) {
			return;
		}
		Static167.aClass1_Sub16_Sub1_2.method3823(78);
		Static167.aClass1_Sub16_Sub1_2.method3765(0);
		@Pc(39) int local39 = Static167.aClass1_Sub16_Sub1_2.anInt4860;
		@Pc(44) Class1_Sub15 local44 = (Class1_Sub15) Static203.aClass105_20.method3117();
		Static167.aClass1_Sub16_Sub1_2.method3807(local44.anInt2107);
		@Pc(52) int local52 = local44.anInt2107;
		@Pc(54) int local54 = 0;
		@Pc(88) Class1_Sub15 local88;
		while ((local88 = (Class1_Sub15) Static203.aClass105_20.method3117()) != null) {
			if (local54 < 255 && local52 + 1 == local88.anInt2107) {
				local54++;
			} else {
				Static167.aClass1_Sub16_Sub1_2.method3765(local54);
				Static167.aClass1_Sub16_Sub1_2.method3807(local88.anInt2107);
				local54 = 0;
			}
			local52 = local88.anInt2107;
		}
		Static167.aClass1_Sub16_Sub1_2.method3765(local54);
		Static167.aClass1_Sub16_Sub1_2.method3816(Static167.aClass1_Sub16_Sub1_2.anInt4860 - local39);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method2525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static54.method933(arg1)) {
			Static33.method580(Static64.aClass71ArrayArray1[arg1], -1, arg0, arg6, arg2, arg5, arg3, arg4);
		}
	}
}
