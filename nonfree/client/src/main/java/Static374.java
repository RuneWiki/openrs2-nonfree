import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
	public static int[] anIntArray481;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_105 = new Class45(57, 6);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([BZ)[B")
	public static byte[] method5763(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static554.method3498(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBIIIFFLclient!ar;FFF)[B")
	public static byte[] method5766(@OriginalArg(5) float arg0, @OriginalArg(6) float arg1, @OriginalArg(7) Class19 arg2, @OriginalArg(8) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static365.method5701(arg5, arg0, 0, local10, arg2, arg4, arg1, arg3);
		return local10;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z")
	public static boolean method5767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg2;
		@Pc(14) int local14 = arg5 - arg1;
		for (@Pc(16) int local16 = arg2; local16 < local9; local16++) {
			Static118.method2461(Static228.anIntArrayArray46[local16], arg6, arg4, arg3);
		}
		@Pc(42) int local42 = arg6 - arg1;
		for (@Pc(44) int local44 = arg5; local44 > local14; local44--) {
			Static118.method2461(Static228.anIntArrayArray46[local44], arg6, arg4, arg3);
		}
		@Pc(66) int local66 = arg1 + arg3;
		for (@Pc(68) int local68 = local9; local68 <= local14; local68++) {
			@Pc(74) int[] local74 = Static228.anIntArrayArray46[local68];
			Static118.method2461(local74, local66, arg4, arg3);
			Static118.method2461(local74, local42, arg0, local66);
			Static118.method2461(local74, arg6, arg4, local42);
		}
	}
}
