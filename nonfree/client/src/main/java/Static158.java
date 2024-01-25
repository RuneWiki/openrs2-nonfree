import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fga", name = "q", descriptor = "Lclient!vv;")
	public static Class2_Sub48 aClass2_Sub48_2;

	@OriginalMember(owner = "client!fga", name = "t", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array5;

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "Z")
	public static boolean aBoolean257 = false;

	@OriginalMember(owner = "client!fga", name = "u", descriptor = "[Lclient!bba;")
	public static final Class29[] aClass29Array1 = new Class29[6];

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/io/File;ZI)[B")
	public static byte[] method2756(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg1];
			Static15.method413(arg0, local11, arg1);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}
}
