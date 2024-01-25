import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Lclient!ni;")
	public static Class223 aClass223_144;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	public static int anInt10720;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
	public static final int anInt10717 = 328;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "Z")
	public static boolean aBoolean844 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)Z")
	public static boolean method8743(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/io/File;BI)[B")
	public static byte[] method8745(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg1];
			Static463.method6949(local11, arg1, arg0);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}
}
