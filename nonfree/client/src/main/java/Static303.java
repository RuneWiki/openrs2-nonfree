import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "[B")
	public static final byte[] aByteArray217 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "[I")
	public static final int[] anIntArray650 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void method5985() {
		@Pc(1) Class11 local1 = Static5.aClass11_95;
		synchronized (Static5.aClass11_95) {
			Static5.aClass11_95.method213();
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public static void method5987() {
		@Pc(1) Class11 local1 = Static29.aClass11_105;
		synchronized (Static29.aClass11_105) {
			Static29.aClass11_105.method213();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZIIIII)V")
	public static void method5988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 + arg4;
		@Pc(14) int local14 = arg0 - arg4;
		for (@Pc(16) int local16 = arg3; local16 < local10; local16++) {
			Static27.method690(arg2, Static104.anIntArrayArray31[local16], arg5, arg1);
		}
		for (@Pc(36) int local36 = arg0; local36 > local14; local36--) {
			Static27.method690(arg2, Static104.anIntArrayArray31[local36], arg5, arg1);
		}
		@Pc(63) int local63 = arg4 + arg1;
		@Pc(68) int local68 = arg2 - arg4;
		for (@Pc(70) int local70 = local10; local70 <= local14; local70++) {
			@Pc(76) int[] local76 = Static104.anIntArrayArray31[local70];
			Static27.method690(local63, local76, arg5, arg1);
			Static27.method690(arg2, local76, arg5, local68);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!mo;Z)V")
	public static void method5990(@OriginalArg(0) Class143 arg0) {
		Static252.aClass143_93 = arg0;
	}
}
