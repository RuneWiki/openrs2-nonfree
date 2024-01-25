import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "Lclient!qi;")
	public static Class188 aClass188_3;

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
	public static int anInt2346;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B[BI)[B")
	public static byte[] method1955(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static460.method4220(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
