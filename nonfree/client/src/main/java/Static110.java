import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Z")
	public static boolean aBoolean210 = true;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_29 = new Class61(73, 7);

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	public static int anInt2613 = -1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/io/File;I)[B")
	public static byte[] method2322(@OriginalArg(1) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg1];
			Static261.method4302(arg1, arg0, local11);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!mf;I)I")
	public static int method2323(@OriginalArg(0) Class221 arg0) {
		if (Static149.aClass221_1 == arg0) {
			return 9216;
		} else if (Static486.aClass221_5 == arg0) {
			return 34065;
		} else if (arg0 == Static487.aClass221_3) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
