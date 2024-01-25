import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!du", name = "x", descriptor = "I")
	public static int anInt9901;

	@OriginalMember(owner = "client!du", name = "y", descriptor = "[I")
	public static int[] anIntArray545;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "Lclient!iea;")
	public static final Class162 aClass162_6 = new Class162();

	@OriginalMember(owner = "client!du", name = "u", descriptor = "[I")
	public static final int[] anIntArray544 = new int[64];

	@OriginalMember(owner = "client!du", name = "w", descriptor = "[Lclient!vn;")
	public static final Class374[] aClass374Array3 = new Class374[100];

	@OriginalMember(owner = "client!du", name = "z", descriptor = "I")
	public static int anInt9902 = 0;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I[BLjava/io/File;I)V")
	public static void method8234(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg1, 0, arg0);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}
}
