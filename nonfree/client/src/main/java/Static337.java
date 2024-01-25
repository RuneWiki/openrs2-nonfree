import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
	public static int anInt6075;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Lclient!eu;")
	public static final Class95 aClass95_5 = new Class95(2, 2);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public static void method4914() {
		Static301.method4557();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/io/File;I)[B")
	public static byte[] method4918(@OriginalArg(1) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg1];
			Static10.method94(local11, arg0, arg1);
			return local11;
		} catch (@Pc(21) IOException local21) {
			return null;
		}
	}
}
