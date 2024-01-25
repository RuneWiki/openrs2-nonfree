import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "[I")
	public static final int[] anIntArray701 = new int[2];

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "[I")
	public static final int[] anIntArray702 = new int[8];

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "([BILjava/io/File;I)V")
	public static void method7991(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg0, 0, arg1);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}
}
