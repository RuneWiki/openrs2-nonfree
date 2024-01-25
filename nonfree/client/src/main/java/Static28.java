import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!au", name = "g", descriptor = "Lclient!fa;")
	public static final Class89 aClass89_17 = new Class89(6, 0, 4, 2);

	@OriginalMember(owner = "client!au", name = "k", descriptor = "[I")
	public static final int[] anIntArray324 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!au", name = "l", descriptor = "I")
	public static int anInt5437 = -2;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([BII)[B")
	public static byte[] method4859(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static655.method5836(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(B)V")
	public static void method4860() {
		Static324.aClass8_31.method154();
		Static299.anInt5830 = 0;
	}
}
