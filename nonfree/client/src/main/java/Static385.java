import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_159 = new Class362(34, 14);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/io/File;II)[B")
	public static byte[] method6097(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(14) byte[] local14 = new byte[arg1];
			Static443.method6829(arg1, arg0, local14);
			return local14;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}
}
