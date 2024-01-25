import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "[I")
	public static int[] anIntArray710;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_80 = new Class181(29, 15);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILjava/io/File;)[B")
	public static byte[] method7854(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg0];
			Static395.method6123(arg1, local6, arg0);
			return local6;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}
}
