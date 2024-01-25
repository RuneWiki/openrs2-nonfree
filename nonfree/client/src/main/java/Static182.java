import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	public static int anInt2689 = -60;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILjava/io/File;I)[B")
	public static byte[] method2317(@OriginalArg(1) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static371.method5204(arg1, local6, arg0);
			return local6;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}
}
