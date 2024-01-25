import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "Lclient!l;")
	public static Class184 aClass184_2;

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "Lclient!kn;")
	public static final Class181 aClass181_5 = new Class181(3, 2);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([BBILjava/io/File;)V")
	public static void method3641(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg0, 0, arg1);
		} catch (@Pc(29) EOFException local29) {
		}
		local14.close();
	}
}
