import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "Z")
	public static boolean aBoolean533 = true;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "([BIILjava/io/File;)V")
	public static void method6459(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg0, 0, arg1);
		} catch (@Pc(29) EOFException local29) {
		}
		local14.close();
	}
}
