import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "[Lclient!pea;")
	public static Interface20[] anInterface20Array1;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!fw;")
	public static Class123 aClass123_1;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!ifa;")
	public static Class168 aClass168_1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	public static int anInt1153 = 1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/io/File;II)[B")
	public static byte[] method959(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg1];
			Static606.method4296(local11, arg1, arg0);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}
}
