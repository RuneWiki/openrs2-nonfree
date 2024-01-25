import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public static int anInt6896;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public static int anInt6903;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
	public static int anInt6904 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!vfa;BIILclient!rc;Ljava/lang/String;IIIILclient!da;Lclient!aa;)V")
	public static void method6156(@OriginalArg(0) Class357 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class298 arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class6 arg9, @OriginalArg(11) Class1 arg10) {
		@Pc(13) int local13;
		if (Static584.anInt9543 == 4) {
			local13 = (int) Static112.aFloat22 & 0x3FFF;
		} else {
			local13 = (int) Static112.aFloat22 + Static402.anInt9327 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg0.anInt9852 / 2, arg0.anInt9797 / 2) + 10;
		@Pc(58) int local58 = arg7 * arg7 + arg1 * arg1;
		if (local34 * local34 < local58) {
			return;
		}
		@Pc(72) int local72 = Class5_Sub12_Sub1.anIntArray748[local13];
		@Pc(76) int local76 = Class5_Sub12_Sub1.anIntArray749[local13];
		if (Static584.anInt9543 != 4) {
			local72 = local72 * 256 / (Static425.anInt7212 + 256);
			local76 = local76 * 256 / (Static425.anInt7212 + 256);
		}
		@Pc(107) int local107 = local72 * arg1 + local76 * arg7 >> 14;
		@Pc(118) int local118 = arg1 * local76 - local72 * arg7 >> 14;
		@Pc(125) int local125 = arg3.method6967(arg4, (Class44[]) null, 100);
		@Pc(133) int local133 = arg3.method6962(arg4, 100, (Class44[]) null, 0);
		@Pc(139) int local139 = local107 - local125 / 2;
		if (-arg0.anInt9852 <= local139 && arg0.anInt9852 >= local139 && local118 >= -arg0.anInt9797 && arg0.anInt9797 >= local118) {
			arg9.method7215(arg5 + arg0.anInt9797 / 2 - local118 - arg8 - local133, 0, arg10, arg4, arg5, (int[]) null, arg2, arg0.anInt9852 / 2 + local139 + arg6, 50, 0, 0, (Class44[]) null, arg6, 1, local125);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
	public static void method6157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static344.anInt8343 == 1) {
			Static178.method2709(arg0, arg1, Static552.aClass5_Sub4_Sub14_3);
		} else if (Static344.anInt8343 == 2) {
			if (Static144.aBoolean196) {
				Static605.method8435(arg1 + Static577.method8147(), arg0 - -Static601.method8395());
			} else {
				Static605.method8435(arg1, arg0);
			}
		}
		Static552.aClass5_Sub4_Sub14_3 = null;
		Static344.anInt8343 = 0;
	}
}
