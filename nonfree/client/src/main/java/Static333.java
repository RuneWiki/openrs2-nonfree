import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "Lclient!eq;")
	public static Class97 aClass97_87;

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_98 = new Class274(88, 6);

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
	public static int anInt6166 = -1;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILjava/io/File;I[B)V")
	public static void method5167(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg2, 0, arg0);
		} catch (@Pc(26) EOFException local26) {
		}
		local14.close();
	}
}
