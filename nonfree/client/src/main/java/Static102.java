import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ep", name = "J", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_28 = new Class142("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!ep", name = "L", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_29 = new Class242(47, 6);

	@OriginalMember(owner = "client!ep", name = "Q", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_30 = new Class242(3, -1);

	@OriginalMember(owner = "client!ep", name = "R", descriptor = "I")
	public static int anInt1386 = 0;

	@OriginalMember(owner = "client!ep", name = "S", descriptor = "[I")
	public static final int[] anIntArray137 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BBI)[B")
	public static byte[] method1217(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static471.method3062(arg1, arg0, local6, 0, 32768);
		return local6;
	}
}
