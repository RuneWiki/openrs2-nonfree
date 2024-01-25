import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public static int anInt9638;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public static int anInt9639;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public static int anInt9640;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_133 = new Class61(67, 3);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZZLjava/lang/String;JIIIILjava/lang/String;I)V")
	public static void method7901(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) String arg9) {
		if (!Static325.aBoolean431 && Static300.anInt5730 < 500) {
			@Pc(22) int local22 = arg8 == -1 ? Static485.anInt8162 : arg8;
			@Pc(36) Class4_Sub18 local36 = new Class4_Sub18(arg9, arg3, local22, arg5, arg7, arg4, arg6, arg0, arg2, arg1);
			Static354.aClass124_32.method3275(local36);
			Static300.anInt5730++;
		}
	}
}
