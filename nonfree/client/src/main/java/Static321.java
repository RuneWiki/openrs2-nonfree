import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
	public static int anInt6084;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
	public static int anInt6090;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILjava/io/File;)[B")
	public static byte[] method5257(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg0];
			Static320.method5229(arg0, local11, arg1);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(III)Z")
	public static boolean method5258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static464.method6809(arg0, arg1) || Static474.method4261(arg0, arg1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIZI)V")
	public static void method5259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static43.method1389(arg0)) {
			Static154.method3119(Static352.aClass309ArrayArray2[arg0], arg2, arg1, -1, arg3);
		}
	}
}
