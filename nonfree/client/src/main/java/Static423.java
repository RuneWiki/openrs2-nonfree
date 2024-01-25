import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_108 = new Class36(55, 15);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public static void method4746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class41_Sub2 local7 = new Class41_Sub2();
		local7.anInt4222 = arg3;
		local7.anInt4218 = arg0;
		local7.anInt4225 = arg4;
		local7.anInt4226 = arg6;
		local7.anInt4223 = arg1 + Static175.anInt3261;
		local7.anInt4221 = arg2;
		local7.aString46 = arg5;
		Static308.aClass27_7.method725(local7);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (!Static413.method5427(arg3)) {
			return;
		}
		if (Static70.aClass126ArrayArray4[arg3] == null) {
			Static55.method1117(Static320.aClass126ArrayArray2[arg3], -1, arg8, arg7, arg6, arg5, arg1, arg2, arg0, arg4);
		} else {
			Static55.method1117(Static70.aClass126ArrayArray4[arg3], -1, arg8, arg7, arg6, arg5, arg1, arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V")
	public static void method4748(@OriginalArg(0) int arg0) {
		for (@Pc(13) Class4 local13 = Static385.aClass196_32.method4482(); local13 != null; local13 = Static385.aClass196_32.method4472()) {
			if ((local13.aLong225 >> 48 & 0xFFFFL) == (long) arg0) {
				local13.method5854();
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!tf;B[[B)V")
	public static void method4750(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt6621; local3++) {
			Static10.method281();
			for (@Pc(9) int local9 = 0; local9 < Static126.anInt2569 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static190.anInt3697 >> 3; local13++) {
					@Pc(23) int local23 = Static4.anIntArrayArrayArray1[local3][local9][local13];
					if (local23 != -1) {
						@Pc(33) int local33 = local23 >> 24 & 0x3;
						if (!arg0.aBoolean442 || local33 == 0) {
							@Pc(47) int local47 = local23 >> 1 & 0x3;
							@Pc(53) int local53 = local23 >> 14 & 0x3FF;
							@Pc(59) int local59 = local23 >> 3 & 0x7FF;
							@Pc(70) int local70 = (local53 / 8 << 8) + (local59 / 8);
							for (@Pc(72) int local72 = 0; local72 < Static100.anIntArray134.length; local72++) {
								if (Static100.anIntArray134[local72] == local70 && arg1[local72] != null) {
									arg0.method5164(Static395.aClass268Array1, arg1[local72], local13 * 8, local47, local33, (local59 & 0x7) * 8, local9 * 8, (local53 & 0x7) * 8, local3, Static16.aClass30_11);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
