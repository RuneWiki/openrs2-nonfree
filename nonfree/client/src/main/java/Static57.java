import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Lclient!ob;")
	public static Class70 aClass70_3 = new Class70(32);

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_466 = Static184.method2923("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "[Lclient!ki;")
	public static Class55[] aClass55Array1 = new Class55[4];

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
	public static int anInt1618 = 128;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZIII[Lclient!ia;I[BII)V")
	public static void method1118(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class42[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) byte[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(21) int local21;
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			for (local21 = 0; local21 < 8; local21++) {
				if (local17 + arg0 > 0 && local17 + arg0 < 103 && arg7 + local21 > 0 && local21 + arg7 < 103) {
					arg4[arg8].anIntArrayArray19[arg0 + local17][arg7 + local21] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(92) Class2_Sub3 local92 = new Class2_Sub3(arg6);
		for (local21 = 0; local21 < 4; local21++) {
			for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
				for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
					if (local21 == arg5 && local103 >= arg2 && local103 < arg2 + 8 && local107 >= arg3 && local107 < arg3 + 8) {
						Static122.method2040(Static217.method3298(arg1, local103 & 0x7, local107 & 0x7) + arg0, local92, 0, 0, arg7 + Static144.method2240(local107 & 0x7, local103 & 0x7, arg1), arg1, arg8);
					} else {
						Static122.method2040(-1, local92, 0, 0, -1, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	public static void method1120() {
		Static217.aBoolean290 = false;
		Static91.aBoolean119 = false;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public static void method1121() {
		Static217.aBoolean290 = true;
		Static91.aBoolean119 = true;
	}
}
