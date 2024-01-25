import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
	public static int anInt6726;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "[Lclient!bs;")
	public static final Class28[] aClass28Array1 = new Class28[6];

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_139 = new Class83("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[IILclient!fd;[IB)Lclient!wk;")
	public static Class145_Sub1 method5256(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19_Sub2 arg3, @OriginalArg(4) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg2 * arg0];
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(22) int local22 = arg1[local12] + local12 * arg2;
			for (@Pc(24) int local24 = 0; local24 < arg4[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class145_Sub1(arg3, arg2, arg0, local10);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILclient!fs;IIBZI)V")
	public static void method5258(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(6) int arg2) {
		Static19.aBoolean30 = false;
		Static236.aClass76_49 = arg1;
		Static14.anInt190 = arg2;
		Static206.anInt3920 = arg0;
		Static397.anInt742 = 0;
		Static47.anInt811 = 2;
		Static27.anInt461 = 1;
	}
}
