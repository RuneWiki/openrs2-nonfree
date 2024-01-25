import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!daa", name = "p", descriptor = "[Lclient!ph;")
	public static final Class4_Sub39[] aClass4_Sub39Array1 = new Class4_Sub39[300];

	@OriginalMember(owner = "client!daa", name = "q", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!daa", name = "v", descriptor = "[I")
	public static int[] anIntArray107 = new int[1];

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I[BBLjava/io/File;)V")
	public static void method1762(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) File arg2) throws IOException {
		@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local19.readFully(arg1, 0, arg0);
		} catch (@Pc(26) EOFException local26) {
		}
		local19.close();
	}
}
