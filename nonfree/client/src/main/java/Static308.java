import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZFFLclient!kda;FIIIFIF)[B")
	public static byte[] method4794(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class198 arg2, @OriginalArg(4) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static290.method4609(arg4, arg0, arg3, arg1, arg5, local10, arg2, 0);
		return local10;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Z")
	public static boolean method4795() {
		if (Static373.aClass5_Sub1_Sub13_1 == null) {
			return false;
		} else {
			if (Static373.aClass5_Sub1_Sub13_1.anInt6068 >= 2000) {
				Static373.aClass5_Sub1_Sub13_1.anInt6068 -= 2000;
			}
			return Static373.aClass5_Sub1_Sub13_1.anInt6068 == 1007;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public static void method4796() {
		@Pc(9) Class168 local9 = Static62.aClass168_11;
		synchronized (Static62.aClass168_11) {
			Static62.aClass168_11.method3856();
		}
		local9 = Static101.aClass168_18;
		synchronized (Static101.aClass168_18) {
			Static101.aClass168_18.method3856();
		}
	}
}
