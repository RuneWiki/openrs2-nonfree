import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!kha", name = "z", descriptor = "[Lclient!ufa;")
	public static Class4[] aClass4Array7;

	@OriginalMember(owner = "client!kha", name = "B", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!kha", name = "t", descriptor = "Z")
	public static boolean aBoolean473 = false;

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(ILclient!ji;Z)V")
	public static void method5062(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (Static359.aClass240_3 == null) {
			return;
		}
		try {
			Static359.aClass240_3.method6272(0L);
			Static359.aClass240_3.method6278(24, arg0, arg1.aByteArray102);
		} catch (@Pc(23) Exception local23) {
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static82.method2207(arg1, arg0) | Static178.method8794(arg0, arg1) | Static359.method5820(arg0, arg1)) & Static52.method1638(arg0, arg1);
	}
}
