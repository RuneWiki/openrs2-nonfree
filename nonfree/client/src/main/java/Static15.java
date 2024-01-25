import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aia", name = "I", descriptor = "Lclient!cv;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!aia", name = "L", descriptor = "J")
	public static long aLong11;

	@OriginalMember(owner = "client!aia", name = "G", descriptor = "Lclient!hm;")
	public static final Class151 aClass151_1 = new Class151(9, 2);

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!waa;B)Z")
	public static boolean method412(@OriginalArg(0) Class373 arg0) {
		return arg0 == Static213.aClass373_3 || arg0 == Static201.aClass373_2 || Static364.aClass373_5 == arg0 || Static167.aClass373_1 == arg0;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/io/File;I[BI)V")
	public static void method413(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local19.readFully(arg1, 0, arg2);
		} catch (@Pc(26) EOFException local26) {
		}
		local19.close();
	}
}
