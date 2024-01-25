import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/io/File;I)[B")
	public static byte[] method3060(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg0];
			Static120.method2293(arg1, arg0, local6);
			return local6;
		} catch (@Pc(18) IOException local18) {
			return null;
		}
	}
}
