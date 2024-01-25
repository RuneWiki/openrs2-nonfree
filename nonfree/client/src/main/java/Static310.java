import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "Lclient!kha;")
	public static Class181 aClass181_58;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
	public static int anInt6166;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
	public static int anInt6164 = 0;

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "Lclient!kh;")
	public static final Class180 aClass180_7 = new Class180();

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "Lclient!bba;")
	public static final Class26 aClass26_7 = new Class26();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZLjava/io/File;[BI)V")
	public static void method5221(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local14.readFully(arg1, 0, arg2);
		} catch (@Pc(26) EOFException local26) {
		}
		local14.close();
	}
}
