import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
	public static int anInt3564 = 0;

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "Z")
	public static boolean aBoolean256 = false;

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "S")
	public static short aShort45 = 256;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	public static void method3149() {
		Static150.method2370();
		Static54.method911();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIILclient!wh;[I[I)Lclient!ei;")
	public static Class1_Sub1 method3152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100_Sub3 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(22) int local22 = arg4[local12] + arg1 * local12;
			for (@Pc(24) int local24 = 0; local24 < arg3[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class1_Sub1(arg2, arg1, arg0, local10);
	}
}
