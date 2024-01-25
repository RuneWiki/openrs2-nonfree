import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
	public static int anInt4399;

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
	public static int anInt4394 = 0;

	@OriginalMember(owner = "client!fba", name = "l", descriptor = "Lclient!bn;")
	public static final Class31 aClass31_5 = new Class31(14, 0, 4, 1);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)I")
	public static int method3832(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(II)V")
	public static void method3838(@OriginalArg(0) int arg0) {
		if (Static359.anIntArray644 == null || Static359.anIntArray644.length < arg0) {
			Static359.anIntArray644 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B[BLjava/io/File;I)V")
	public static void method3841(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local20.readFully(arg0, 0, arg2);
		} catch (@Pc(27) EOFException local27) {
		}
		local20.close();
	}
}
