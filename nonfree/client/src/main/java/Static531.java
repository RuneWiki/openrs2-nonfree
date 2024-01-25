import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!sda", name = "t", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_81 = new Class187(62, 1);

	@OriginalMember(owner = "client!sda", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIIIIII)V")
	public static void method7413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static361.anInt6317 <= arg1 - arg3 && Static651.anInt10267 >= arg1 + arg3 && Static128.anInt2200 <= arg5 - arg3 && arg3 + arg5 <= Static380.anInt6585) {
			Static246.method3502(arg2, arg5, arg0, arg1, arg3, arg4);
		} else {
			Static241.method3458(arg3, arg4, arg1, arg0, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
	public static void method7414() {
		Static207.aBoolean229 = false;
		Static212.method3058();
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IZ[B)[B")
	public static byte[] method7415(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static685.method8328(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
