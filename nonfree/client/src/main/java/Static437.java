import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "Lclient!ha;")
	public static Class100 aClass100_10;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
	public static int anInt7221;

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "Lclient!eea;")
	public static Class5_Sub16 aClass5_Sub16_2;

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_190 = new Class381(5, -1);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IBLjava/io/File;)[B")
	public static byte[] method6279(@OriginalArg(0) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(14) byte[] local14 = new byte[arg0];
			Static1.method7011(local14, arg1, arg0);
			return local14;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIB)Z")
	public static boolean method6283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static397.method5823(arg1, arg0) || Static497.method6942(arg1, arg0);
	}
}
