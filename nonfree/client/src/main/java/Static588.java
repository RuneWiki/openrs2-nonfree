import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!tv", name = "cb", descriptor = "I")
	public static int anInt10264;

	@OriginalMember(owner = "client!tv", name = "eb", descriptor = "I")
	public static int anInt10265;

	@OriginalMember(owner = "client!tv", name = "I", descriptor = "Lclient!ow;")
	public static final Class271 aClass271_62 = new Class271();

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "([BIILjava/io/File;)V")
	public static void method8874(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg0, 0, arg1);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method8876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static605.method9059(arg5, arg2, arg0, arg1, 0, arg4, arg3);
	}
}
