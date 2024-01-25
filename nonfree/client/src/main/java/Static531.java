import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z")
	public static boolean method7496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIZIII)V")
	public static void method7497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static155.aClass8_Sub25_6.aClass36_Sub6_1.method3331() != 0 && arg5 != 0 && Static55.anInt1863 < 50 && arg3 != -1) {
			Static63.aClass230Array1[Static55.anInt1863++] = new Class230((byte) 2, arg3, arg5, arg4, arg0, arg2, arg1, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method7498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 512 || arg4 < 512 || Static372.anInt7082 * 512 - 1024 < arg1 || Static218.anInt5023 * 512 - 1024 < arg4) {
			Static390.anIntArray410[0] = Static390.anIntArray410[1] = -1;
			return;
		}
		@Pc(51) int local51 = Static177.method3098(arg4, arg1, arg3) - arg2;
		if (Static513.aBoolean642) {
			Static604.method8286(true);
		} else {
			Static3.aClass54_1.method5142(arg5, 0, 0);
			Static171.aClass16_5.method6066(Static3.aClass54_1);
		}
		if (Static183.aBoolean308) {
			Static171.aClass16_5.HA(arg1, local51, arg4, Static115.anInt3009, Static390.anIntArray410);
		} else {
			Static171.aClass16_5.da(arg1, local51, arg4, Static390.anIntArray410);
		}
		if (Static513.aBoolean642) {
			Static272.method4682();
		} else {
			Static3.aClass54_1.method5142(-arg5, 0, 0);
			Static171.aClass16_5.method6066(Static3.aClass54_1);
		}
	}
}
