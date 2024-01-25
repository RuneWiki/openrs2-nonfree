import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "Lclient!oj;")
	public static final Class234 aClass234_31 = new Class234(16);

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Z)I")
	public static int method4031() {
		@Pc(5) Class330 local5 = Static180.aClass330_22;
		synchronized (Static180.aClass330_22) {
			return Static180.aClass330_22.method7683();
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILjava/io/File;[BI)V")
	public static void method4032(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local14.readFully(arg1, 0, arg2);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IBI)Z")
	public static boolean method4034(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}
}
