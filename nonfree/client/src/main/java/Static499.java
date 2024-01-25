import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!ur", name = "R", descriptor = "Lclient!oca;")
	public static Class210 aClass210_4;

	@OriginalMember(owner = "client!ur", name = "V", descriptor = "[[I")
	public static int[][] anIntArrayArray114;

	@OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
	public static int anInt8738 = 0;

	@OriginalMember(owner = "client!ur", name = "T", descriptor = "[I")
	public static final int[] anIntArray762 = new int[5];

	@OriginalMember(owner = "client!ur", name = "U", descriptor = "I")
	public static int anInt8742 = 0;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I[BLjava/io/File;I)V")
	public static void method7643(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg1, 0, arg0);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}
}
