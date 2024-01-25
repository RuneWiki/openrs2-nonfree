import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!se", name = "j", descriptor = "I")
	public static int anInt8560;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "[I")
	public static final int[] anIntArray577 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!cca;")
	public static final Class47 aClass47_3 = new Class47(64);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)I")
	public static int method7196() {
		return Static77.aClass252_2.method5489();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)I")
	public static int method7197(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[BLjava/io/File;I)V")
	public static void method7198(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg0, 0, arg2);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}
}
